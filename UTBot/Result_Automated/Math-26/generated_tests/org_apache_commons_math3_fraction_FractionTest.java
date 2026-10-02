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
 * @utbot.returnsFrom {@code return addSub(fraction, true);}
 *  */
    @Test
    public void testAdd_ReturnAddSub() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        Fraction actual = fraction.add(fraction1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(fraction1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#add(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.returnsFrom {@code return addSub(fraction, true);}
 *  */
    @Test
    public void testAdd_ReturnAddSub_1() throws Exception  {
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method add(int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#add(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator + i * denominator, denominator);}
 *  */
    @Test
    public void testAdd_Return() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 541098241);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -129);
        
        Fraction actual = fraction.add(-128);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#add(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator + i * denominator, denominator);}
 *  */
    @Test
    public void testAdd_Return_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -234);
        
        Fraction actual = fraction.add(232);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#add(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator + i * denominator, denominator);}
 *  */
    @Test
    public void testAdd_Return_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -150);
        
        Fraction actual = fraction.add(74);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#add(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator + i * denominator, denominator);}
 *  */
    @Test
    public void testAdd_Return_3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -246);
        
        Fraction actual = fraction.add(250);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 4);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#add(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator + i * denominator, denominator);}
 *  */
    @Test
    public void testAdd_Return_4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 9);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -138);
        
        Fraction actual = fraction.add(16);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 3);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 2);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method add(int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True},
    ///     {@code (null): True},
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#add(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator + i * denominator, denominator);}
 *  */
    @Test
    public void testAdd_Return_5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -607778393);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -218);
        
        Fraction actual = fraction.add(-105);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#add(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator + i * denominator, denominator);}
 *  */
    @Test
    public void testAdd_Return_6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        Fraction actual = fraction.add(-3);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#add(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(numerator + i * denominator, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testAdd_ThrowMathArithmeticException1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        fraction.add(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#add(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(numerator + i * denominator, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testAdd_ThrowMathArithmeticException_11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2113929216);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1107296256);
        
        fraction.add(33);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#add(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(numerator + i * denominator, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testAdd_ThrowMathArithmeticException_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        fraction.add(-255);
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
 * @utbot.executesCondition {@code (denominator == 1): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testToString_NumeratorNotEqualsZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        String actual = fraction.toString();
        
        String expected = "-2147483648 / -2147483648";
        
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method abs()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (numerator >= 0): False}
    /// invoke:
    ///     {@link org.apache.commons.math3.fraction.Fraction#negate()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#abs()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testAbs_ReturnRet() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2147483150);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741575);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#abs()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testAbs_ReturnRet_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 3);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#abs()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testAbs_ReturnRet_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 2);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#abs()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testAbs_ReturnRet_3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 90);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -90);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method abs()
    
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
 * @utbot.invokes {@link org.apache.commons.math3.fraction.Fraction#negate()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testAbs_NumeratorLessThanZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        fraction.abs();
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 192);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 232);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 192);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 256);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 24);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -248);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 16);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
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
            org.apache.commons.math3.fraction.Fraction.compareTo(Fraction.java:307) */
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.multiply(1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 29125);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 125);
        
        Fraction actual = fraction.multiply(233);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator * i, denominator);}
 *  */
    @Test
    public void testMultiply_Return_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.multiply(-3);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator * i, denominator);}
 *  */
    @Test
    public void testMultiply_Return_3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        Fraction actual = fraction.multiply(2);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator * i, denominator);}
 *  */
    @Test
    public void testMultiply_Return_4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1020);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        Fraction actual = fraction.multiply(2);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator * i, denominator);}
 *  */
    @Test
    public void testMultiply_Return_5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -16129);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -127);
        
        Fraction actual = fraction.multiply(-254);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator * i, denominator);}
 *  */
    @Test
    public void testMultiply_Return_6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 6413);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -106);
        
        Fraction actual = fraction.multiply(-242);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 4);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator * i, denominator);}
 *  */
    @Test
    public void testMultiply_Return_7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -13);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        fraction.multiply(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(numerator * i, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testMultiply_ThrowMathArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 33024);
        
        fraction.multiply(8388608);
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 148);
        
        fraction.multiply(-249);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.multiply
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(org.apache.commons.math3.fraction.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: int d1 = ArithmeticUtils.gcd(numerator, fraction.denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testMultiply_ThrowMathArithmeticException1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        fraction.multiply(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: int d2 = ArithmeticUtils.gcd(fraction.numerator, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testMultiply_ThrowMathArithmeticException_11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.multiply(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: int d2 = ArithmeticUtils.gcd(fraction.numerator, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testMultiply_ThrowMathArithmeticException_21() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.multiply(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: int d2 = ArithmeticUtils.gcd(fraction.numerator, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testMultiply_ThrowMathArithmeticException_3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -186);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 186);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.multiply(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: int d2 = ArithmeticUtils.gcd(fraction.numerator, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testMultiply_ThrowMathArithmeticException_4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -93);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -186);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.multiply(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: int d2 = ArithmeticUtils.gcd(fraction.numerator, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testMultiply_ThrowMathArithmeticException_5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 70);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 105);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.multiply(fraction1);
    }
    
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 2);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 124);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -62);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -513);
        
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
    public void testNegate_Return_3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 3);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 3);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        fraction.negate();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method negate()
    
    @Test
    public void testNegate1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1207959551);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -402653185);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1207959551);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 402653185);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1812714495);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1814264829);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 604238165);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 604754943);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2147483646);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -8);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741823);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 4);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -4);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 4);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -705676255);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -141135251);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 5);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483646);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1073741827);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 2147483646);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1073741827);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483646);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 3);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 715827882);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate8() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2147483644);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2136997822);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741822);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1068498911);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate9() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1434749676);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 239124946);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 6);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate10() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 6);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MAX_VALUE);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 6);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483646);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 8);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741823);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 4);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate12() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -8);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483646);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 4);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741823);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate13() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -25165823);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -419430394);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 25165823);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -419430394);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate14() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -134479868);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483640);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 33619967);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -536870910);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate15() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741821);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1073741825);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741821);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741825);
        
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
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483636);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
        Fraction actual = fraction.divide(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 2130706432);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.divide(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2060540);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1030270);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide8() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -9437180);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 2146172925);
        
        Fraction actual = fraction.divide(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide9() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -266);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 266);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide10() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 6);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        
        Fraction actual = fraction.divide(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2147483644);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483646);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(org.apache.commons.math3.fraction.Fraction)
    
    @Test(expected = MathArithmeticException.class)
    public void testDivide12() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -310389188);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 77597297);
        
        fraction.divide(fraction1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.divide
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method divide(int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#divide(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator, denominator * i);}
 *  */
    @Test
    public void testDivide_Return() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        Fraction actual = fraction.divide(1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#divide(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator, denominator * i);}
 *  */
    @Test
    public void testDivide_Return_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
        Fraction actual = fraction.divide(1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#divide(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator, denominator * i);}
 *  */
    @Test
    public void testDivide_Return_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 132);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -66);
        
        Fraction actual = fraction.divide(1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#divide(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator, denominator * i);}
 *  */
    @Test
    public void testDivide_Return_3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 32);
        
        Fraction actual = fraction.divide(-143);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#divide(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(numerator, denominator * i);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testDivide_ThrowMathArithmeticException1() throws Exception  {
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
    public void testDivide_ThrowMathArithmeticException_11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.divide(1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#divide(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(numerator, denominator * i);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testDivide_ThrowMathArithmeticException_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 65536);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2);
        
        fraction.divide(32768);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method divide(int)
    
    @Test
    public void testDivide13() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1044863837);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1073741881);
        
        Fraction actual = fraction.divide(-216664825);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1006337909);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1073741881);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide14() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1545647271);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 142000799);
        
        Fraction actual = fraction.divide(1427525229);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 5);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide15() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -176381357);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -252774507);
        
        Fraction actual = fraction.divide(-89911771);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 486888789);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -84258169);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide16() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 98251231);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        Fraction actual = fraction.divide(788537810);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1987575);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741824);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide17() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1177733285);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 4);
        
        Fraction actual = fraction.divide(782642187);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 2141780759);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -4);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide18() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1550873077);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1610612740);
        
        Fraction actual = fraction.divide(2033444026);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 402653183);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -805306370);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide19() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1817427474);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2147483644);
        
        Fraction actual = fraction.divide(1044201870);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -536870911);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide20() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 991);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2);
        
        Fraction actual = fraction.divide(788791296);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 4063232);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide21() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -519006049);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2146959362);
        
        Fraction actual = fraction.divide(-1375634271);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073479679);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 2146959362);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide22() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 272399258);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2145386496);
        
        Fraction actual = fraction.divide(137564431);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 289215489);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 357564416);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide23() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1177211146);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
        Fraction actual = fraction.divide(2106281707);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 340363241);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide24() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1884822187);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -8);
        
        Fraction actual = fraction.divide(802037766);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741823);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 4);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide25() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1921864873);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -536870914);
        
        Fraction actual = fraction.divide(1980665753);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 268435455);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 536870914);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide26() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1177733285);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        Fraction actual = fraction.divide(782642187);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 2141780759);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 3);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide27() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1974311595);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        Fraction actual = fraction.divide(801841158);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 715827882);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide28() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 199155356);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2147483645);
        
        Fraction actual = fraction.divide(983612039);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 289344908);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -429496729);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide29() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1474826959);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 8416089);
        
        Fraction actual = fraction.divide(1715931907);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1309663891);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -8416089);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide30() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1879687841);
        
        Fraction actual = fraction.divide(788529153);
        
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
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return addSub(fraction, false);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testSubtract_ThrowMathArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        fraction.subtract(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#subtract(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return addSub(fraction, false);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testSubtract_ThrowMathArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.subtract(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#subtract(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return addSub(fraction, false);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testSubtract_ThrowMathArithmeticException_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        fraction.subtract(fraction);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#subtract(org.apache.commons.math3.fraction.Fraction)}
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073758353);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -1073758353);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1048576);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 357919451);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -715478357);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 8);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 8192);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 8196);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.subtract(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 8);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 8192);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 8188);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2145386494);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 17);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -1072693247);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 2145386494);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -15);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483646);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741823);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -536870912);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 2147483584);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483584);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract8() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 16);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 2147483646);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 8);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741823);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract9() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 2);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract10() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 3);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract12() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -3);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483632);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 3);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483632);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract13() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -2);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483646);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741823);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract14() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -3);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 2);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 3);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 2);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract15() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -4);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 2147483646);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1073741823);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract16() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        Fraction actual = fraction.subtract(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math3.fraction.Fraction)
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract17() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract18() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract19() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2147483646);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -1879048190);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract20() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract21() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract22() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract23() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483644);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract24() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract25() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483646);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 2048);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract26() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        
        fraction.subtract(fraction);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract27() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract28() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method subtract(org.apache.commons.math3.fraction.Fraction)
    
    @Test
    public void testSubtract29() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        /* This test fails because method [org.apache.commons.math3.fraction.Fraction.subtract] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.math3.fraction.Fraction.addSub(Fraction.java:502)
            org.apache.commons.math3.fraction.Fraction.subtract(Fraction.java:454) */
        fraction.subtract(fraction);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#subtract(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator - i * denominator, denominator);}
 *  */
    @Test
    public void testSubtract_Return() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -196);
        
        Fraction actual = fraction.subtract(-194);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#subtract(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator - i * denominator, denominator);}
 *  */
    @Test
    public void testSubtract_Return_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -252);
        
        Fraction actual = fraction.subtract(-125);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#subtract(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator - i * denominator, denominator);}
 *  */
    @Test
    public void testSubtract_Return_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1205604855);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.subtract(56);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#subtract(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator - i * denominator, denominator);}
 *  */
    @Test
    public void testSubtract_Return_3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -248);
        
        Fraction actual = fraction.subtract(-252);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 4);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#subtract(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator - i * denominator, denominator);}
 *  */
    @Test
    public void testSubtract_Return_4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 122);
        
        Fraction actual = fraction.subtract(-122);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#subtract(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(numerator - i * denominator, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testSubtract_ThrowMathArithmeticException1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        fraction.subtract(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#subtract(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(numerator - i * denominator, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testSubtract_ThrowMathArithmeticException_11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.subtract(0);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#subtract(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(numerator - i * denominator, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testSubtract_ThrowMathArithmeticException_21() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        fraction.subtract(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method subtract(int)
    
    @Test
    public void testSubtract30() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2130706150);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1074036741);
        
        Fraction actual = fraction.subtract(1295556608);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 426141230);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -159858689);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract31() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741542);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2147188731);
        
        Fraction actual = fraction.subtract(66625536);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741542);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -539246597);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract32() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 180500798);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1293815744);
        
        Fraction actual = fraction.subtract(1135590812);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 90250399);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -7392260);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract33() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1073741823);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2076180477);
        
        Fraction actual = fraction.subtract(-1145044992);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741823);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1073741827);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract34() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2078524798);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 543709184);
        
        Fraction actual = fraction.subtract(18011136);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1039262399);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 268435456);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract35() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 8);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -8653842);
        
        Fraction actual = fraction.subtract(535412672);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 4);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1506039);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract36() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -71302155);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2066938368);
        
        Fraction actual = fraction.subtract(-671075376);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 71302155);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 16);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract37() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2120606498);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1048580);
        
        Fraction actual = fraction.subtract(326176911);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1060303249);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 526974975);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract38() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483514);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 11010048);
        
        Fraction actual = fraction.subtract(136052736);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741757);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 520093696);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract39() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1073217439);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 471015314);
        
        Fraction actual = fraction.subtract(-599568175);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073217439);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1611235425);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract40() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1073741823);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1207959552);
        
        Fraction actual = fraction.subtract(671088637);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 119304647);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -178956971);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract41() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -268435455);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2147467212);
        
        Fraction actual = fraction.subtract(-1073758264);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 268435455);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741828);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract42() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2144272378);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2147483392);
        
        Fraction actual = fraction.subtract(1363148928);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1072136189);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741312);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract43() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -709891466);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 838860224);
        
        Fraction actual = fraction.subtract(907508869);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 354945733);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -28836665);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract44() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2147483645);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 299106);
        
        Fraction actual = fraction.subtract(-2147408587);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 2147483645);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 524289);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract45() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 797681515);
        
        Fraction actual = fraction.subtract(782128651);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 159536303);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 418484859);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract46() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 664037499);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1012919304);
        
        Fraction actual = fraction.subtract(252462696);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#reciprocal()}
 * @utbot.returnsFrom {@code return new Fraction(denominator, numerator);}
 *  */
    @Test
    public void testReciprocal_Return_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1979648793);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -659882931);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#reciprocal()}
 * @utbot.returnsFrom {@code return new Fraction(denominator, numerator);}
 *  */
    @Test
    public void testReciprocal_Return_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#reciprocal()}
 * @utbot.returnsFrom {@code return new Fraction(denominator, numerator);}
 *  */
    @Test
    public void testReciprocal_Return_3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#reciprocal()}
 * @utbot.returnsFrom {@code return new Fraction(denominator, numerator);}
 *  */
    @Test
    public void testReciprocal_Return_4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 244798870);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -122399435);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#reciprocal()}
 * @utbot.returnsFrom {@code return new Fraction(denominator, numerator);}
 *  */
    @Test
    public void testReciprocal_Return_5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 130);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -130);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#reciprocal()}
 * @utbot.returnsFrom {@code return new Fraction(denominator, numerator);}
 *  */
    @Test
    public void testReciprocal_Return_6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -4);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -4);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#reciprocal()}
 * @utbot.returnsFrom {@code return new Fraction(denominator, numerator);}
 *  */
    @Test
    public void testReciprocal_Return_7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
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
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#reciprocal()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(denominator, numerator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testReciprocal_ThrowMathArithmeticException_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -255);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.reciprocal();
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
 * @utbot.executesCondition {@code (numerator == 0): True}
 * @utbot.executesCondition {@code (isAdd): False}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.Fraction#negate()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: fraction.negate()
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testAddSub_ThrowMathArithmeticException() throws Throwable  {
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
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: int d1 = ArithmeticUtils.gcd(denominator, fraction.denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testAddSub_ThrowMathArithmeticException_1() throws Throwable  {
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
    public void testAddSub_ThrowMathArithmeticException_2() throws Throwable  {
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
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.executesCondition {@code (d1 == 1): True}
 * @utbot.invokes {@link org.apache.commons.math3.util.ArithmeticUtils#mulAndCheck(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: int uvp = ArithmeticUtils.mulAndCheck(numerator, fraction.denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testAddSub_ThrowMathArithmeticException_3() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 5);
        
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
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getReducedFraction(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFraction() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-1, -3);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 3);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFraction1() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-1, 2147483645);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 2147483645);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
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
        
                java.lang.reflect.Method methodForGetDeclaredFields722676955158900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields722676955158900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass722676955177800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields722676955158900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass722676955177800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields722676955613900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields722676955613900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass722676955615900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields722676955613900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass722676955615900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields722676956629500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields722676956629500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass722676956631300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields722676956629500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass722676956631300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

