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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 838284921);
        
        Fraction actual = fraction.add(-1);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -114);
        
        Fraction actual = fraction.add(112);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 256);
        
        Fraction actual = fraction.add(-129);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1762395375);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 655446);
        
        Fraction actual = fraction.add(1767126092);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1028050683);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -84);
        
        Fraction actual = fraction.add(-187);
        
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
    ///     {@link org.apache.commons.math3.fraction.Fraction#negate()} twice
    /// return from: {@code return ret;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#abs()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testAbs_ReturnRet() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
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
    public void testAbs_ReturnRet_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 10);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -10);
        
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method abs()
    
    @Test
    public void testAbs1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 12746746);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -31866865);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 5);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAbs2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 20);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -8);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 5);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 2);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAbs3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1803617385);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -360723477);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 5);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAbs4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1073741823);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741831);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741823);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741831);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAbs5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1174417310);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -234883462);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 5);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAbs6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483646);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -8);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741823);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -4);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAbs7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -524219);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1048454);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 524219);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1048454);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        Fraction actual = fraction.multiply(1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
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
    public void testMultiply_Return_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
        Fraction actual = fraction.multiply(1);
        
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
    public void testMultiply_Return_3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 252);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -42);
        
        Fraction actual = fraction.multiply(3);
        
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
    public void testMultiply_Return_4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -97);
        
        Fraction actual = fraction.multiply(-192);
        
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method multiply(int)
    
    @Test
    public void testMultiply1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 369247839);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1261855475);
        
        Fraction actual = fraction.multiply(1877493383);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 5);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 104316921);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -694937087);
        
        Fraction actual = fraction.multiply(1855304227);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -5);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2147483646);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1367031112);
        
        Fraction actual = fraction.multiply(591385);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 357913941);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -7340);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -4);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -415184702);
        
        Fraction actual = fraction.multiply(1845826581);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -669306869);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -926941187);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 390384642);
        
        Fraction actual = fraction.multiply(973288450);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 926941187);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -4);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483646);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 167755647);
        
        Fraction actual = fraction.multiply(788530168);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741823);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -4);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2147483646);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 402653185);
        
        Fraction actual = fraction.multiply(1073741832);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741823);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 4);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply8() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 366583825);
        
        Fraction actual = fraction.multiply(1644298280);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 740491944);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply9() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2130636798);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 781011733);
        
        Fraction actual = fraction.multiply(1580161146);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 355106133);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 178956971);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply10() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -4);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1993872777);
        
        Fraction actual = fraction.multiply(423981710);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 707787263);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483646);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 831046279);
        
        Fraction actual = fraction.multiply(-1392835804);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741823);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1050626);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply12() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -469762047);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 648552459);
        
        Fraction actual = fraction.multiply(1067788474);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 469762047);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1220542466);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply13() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -667901439);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1432040845);
        
        Fraction actual = fraction.multiply(1380452565);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 667901439);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -406320721);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply14() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483646);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1221349281);
        
        Fraction actual = fraction.multiply(788529885);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 715827882);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply15() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -713096191);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1640921167);
        
        Fraction actual = fraction.multiply(-339472371);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 3);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply16() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1065353215);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1604104227);
        
        Fraction actual = fraction.multiply(1073447263);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1065353215);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1086849027);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply17() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 4);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 34);
        
        Fraction actual = fraction.multiply(0);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -219);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 219);
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -93);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -186);
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method multiply(org.apache.commons.math3.fraction.Fraction)
    
    @Test
    public void testMultiply18() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 571400194);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 857100291);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 8);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 3);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 16);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply19() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 418708348);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 104677087);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 4);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply20() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply21() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1073217537);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073217537);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483504);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483504);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply22() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1073217537);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073217537);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483504);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MAX_VALUE);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 2147483504);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply23() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1073741889);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -1073741889);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483612);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MAX_VALUE);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483612);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply24() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1073741889);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -1073741889);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483646);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1073741823);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply25() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1200230923);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1200230923);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147475454);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 2147475454);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply26() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1005845397);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -1005845397);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 536870912);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 536870912);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply27() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483640);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1005845397);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -1005845397);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -1610612735);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 429496728);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 322122547);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply28() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -62455934);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 31227967);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MAX_VALUE);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 2);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply29() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1544051746);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1544051746);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MAX_VALUE);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply30() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -70893478);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 141786956);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply31() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741846);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -1073741846);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 2);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 2);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply32() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741846);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -1073741846);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483646);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MAX_VALUE);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 2147483646);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply33() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2080374780);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -520093695);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -4);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(org.apache.commons.math3.fraction.Fraction)
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply34() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1073741826);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -1073741822);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.multiply(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply35() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1089567246);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -544783623);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        
        fraction.multiply(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply36() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1738451614);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -869225807);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147352575);
        
        fraction.multiply(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply37() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.multiply(fraction);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply38() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -49815542);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 24907771);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        
        fraction.multiply(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply39() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1706491902);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 853245951);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483646);
        
        fraction.multiply(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply40() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741758);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 2147483516);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.multiply(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply41() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -199360518);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -996802590);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1048576);
        
        fraction.multiply(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply42() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1491802158);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -745901079);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        
        fraction.multiply(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply43() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1879048190);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -939524095);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483632);
        
        fraction.multiply(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply44() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.multiply(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply45() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        
        fraction.multiply(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply46() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483646);
        
        fraction.multiply(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply47() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.multiply(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply48() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1223100450);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1630800600);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1223100450);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.multiply(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply49() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1415684102);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 2123526153);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        
        fraction.multiply(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply50() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2013265916);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 2147483646);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.multiply(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply51() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1805295879);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 601765293);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.multiply(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply52() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 571400194);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 857100291);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483640);
        
        fraction.multiply(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testMultiply53() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.multiply(fraction);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.negate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method negate()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False}
    /// </pre>
    
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 508);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -254);
        
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method negate()
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#negate()}
 * @utbot.returnsFrom {@code return new Fraction(-numerator, denominator);}
 *  */
    @Test
    public void testNegate_Return_3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 2);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#negate()}
 * @utbot.returnsFrom {@code return new Fraction(-numerator, denominator);}
 *  */
    @Test
    public void testNegate_Return_4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -22680025);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 22680025);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
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
    public void testNegate_Return_5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -8);
        
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
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method negate()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#negate()}
     */
    @Test
    public void testNegate() throws Exception  {
        Fraction fraction = new Fraction(-1.1125369292536007E-308, -1);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.divide(-1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 171);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 11799);
        
        Fraction actual = fraction.divide(69);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        Fraction actual = fraction.divide(-1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
        Fraction actual = fraction.divide(-1);
        
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
    public void testDivide_Return_4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -252);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -126);
        
        Fraction actual = fraction.divide(-1);
        
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
    public void testDivide_Return_5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 19);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1102);
        
        Fraction actual = fraction.divide(-29);
        
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
    public void testDivide_Return_6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 5);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 20);
        
        Fraction actual = fraction.divide(1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 4);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#divide(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator, denominator * i);}
 *  */
    @Test
    public void testDivide_Return_7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -192);
        
        Fraction actual = fraction.divide(51);
        
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method subtract(int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#subtract(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator - i * denominator, denominator);}
 *  */
    @Test
    public void testSubtract_Return() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 2073432491);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -190);
        
        Fraction actual = fraction.subtract(-57);
        
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
    public void testSubtract_Return_1() throws Exception  {
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
    public void testSubtract_Return_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 22);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -176);
        
        Fraction actual = fraction.subtract(-7);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1610612757);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 56);
        
        Fraction actual = fraction.subtract(2);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 3);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 2);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method subtract(int)
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#subtract(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator - i * denominator, denominator);}
 *  */
    @Test
    public void testSubtract_Return_5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -568205791);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -223);
        
        Fraction actual = fraction.subtract(256);
        
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
    public void testSubtract_Return_6() throws Exception  {
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.percentageValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method percentageValue()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#percentageValue()}
 * @utbot.returnsFrom {@code return multiply(100).doubleValue();}
 *  */
    @Test
    public void testPercentageValue_ReturnMultiply100DoubleValue() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 535832037);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 536912467);
        
        double actual = fraction.percentageValue();
        
        org.junit.Assert.assertEquals(-4.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#percentageValue()}
 * @utbot.returnsFrom {@code return multiply(100).doubleValue();}
 *  */
    @Test
    public void testPercentageValue_ReturnMultiply100DoubleValue_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 944892805);
        
        double actual = fraction.percentageValue();
        
        org.junit.Assert.assertEquals(-12.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#percentageValue()}
 * @utbot.returnsFrom {@code return multiply(100).doubleValue();}
 *  */
    @Test
    public void testPercentageValue_ReturnMultiply100DoubleValue_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        double actual = fraction.percentageValue();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#percentageValue()}
 * @utbot.returnsFrom {@code return multiply(100).doubleValue();}
 *  */
    @Test
    public void testPercentageValue_ReturnMultiply100DoubleValue_3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 134201342);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 169114665);
        
        double actual = fraction.percentageValue();
        
        org.junit.Assert.assertEquals(-2.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method percentageValue()
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#percentageValue()}
 * @utbot.returnsFrom {@code return multiply(100).doubleValue();}
 *  */
    @Test
    public void testPercentageValue_ReturnMultiply100DoubleValue_4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1030792151);
        
        double actual = fraction.percentageValue();
        
        org.junit.Assert.assertEquals(4.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#percentageValue()}
 * @utbot.returnsFrom {@code return multiply(100).doubleValue();}
 *  */
    @Test
    public void testPercentageValue_ReturnMultiply100DoubleValue_5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2175519);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 85870339);
        
        double actual = fraction.percentageValue();
        
        org.junit.Assert.assertEquals(1.3333333333333333, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method percentageValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#percentageValue()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return multiply(100).doubleValue();
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testPercentageValue_ThrowMathArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 536870912);
        
        fraction.percentageValue();
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#percentageValue()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return multiply(100).doubleValue();
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testPercentageValue_ThrowMathArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        fraction.percentageValue();
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#percentageValue()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return multiply(100).doubleValue();
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testPercentageValue_ThrowMathArithmeticException_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        fraction.percentageValue();
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 168297507);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -56099169);
        
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
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 463863302);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -231931651);
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields723095197062800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields723095197062800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass723095197067600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields723095197062800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass723095197067600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields723095198073700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields723095198073700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass723095198075700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields723095198073700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass723095198075700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields723095199020200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields723095199020200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass723095199022300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields723095199020200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass723095199022300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

