package org.apache.commons.math3.fraction;

import org.junit.Test;
import org.apache.commons.math3.exception.NullArgumentException;
import java.math.BigInteger;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.ZeroException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.math3.exception.MathArithmeticException;
import java.math.BigDecimal;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math3_fraction_BigFractionTest {
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.math3.fraction.BigFraction)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#add(org.apache.commons.math3.fraction.BigFraction)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: fraction == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testAdd_ThrowNullArgumentException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        bigFraction.add(((BigFraction) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math3.fraction.BigFraction)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#add(org.apache.commons.math3.fraction.BigFraction)}
     */
    @Test
    public void testAdd() throws Exception  {
        BigFraction bigFraction = new BigFraction(2147483648L);
        BigFraction bigFraction1 = new BigFraction(0.0);
        
        BigFraction actual = bigFraction.add(bigFraction1);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#add(org.apache.commons.math3.fraction.BigFraction)}
     */
    @Test
    public void testAdd1() throws Exception  {
        BigFraction bigFraction = new BigFraction(2147483648L);
        BigFraction bigFraction1 = new BigFraction(1.2882297539194267E-231);
        
        BigFraction actual = bigFraction.add(bigFraction1);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.add
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(long)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#add(long)}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.BigFraction#add(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return add(BigInteger.valueOf(l));
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.add] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.add(BigFraction.java:467)
            org.apache.commons.math3.fraction.BigFraction.add(BigFraction.java:495) */
        bigFraction.add(-16L);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#add(long)}
     */
    @Test
    public void testAdd2() throws Exception  {
        BigFraction bigFraction = new BigFraction(1L);
        
        BigFraction actual = bigFraction.add(-9L);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.add
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(int)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#add(int)}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.BigFraction#add(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return add(BigInteger.valueOf(i));
 *  */
    @Test
    public void testAdd_ThrowNullPointerException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.add] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.add(BigFraction.java:467)
            org.apache.commons.math3.fraction.BigFraction.add(BigFraction.java:481) */
        bigFraction.add(-16);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#add(int)}
     */
    @Test
    public void testAdd3() throws Exception  {
        BigFraction bigFraction = new BigFraction(1L);
        
        BigFraction actual = bigFraction.add(-3);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.add
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#add(java.math.BigInteger)}
 * @utbot.invokes {@link java.math.BigInteger#multiply(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(numerator.add(denominator.multiply(bg)), denominator);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 1);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.add] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.add(BigFraction.java:467) */
        bigFraction.add(bigInteger);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#add(java.math.BigInteger)}
 * @utbot.invokes {@link java.math.BigInteger#multiply(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(numerator.add(denominator.multiply(bg)), denominator);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.add] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.add(BigFraction.java:467) */
        bigFraction.add(bigInteger);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#add(java.math.BigInteger)}
 * @utbot.invokes {@link org.apache.commons.math3.util.MathUtils#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} in: MathUtils.checkNotNull(bg);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testAdd_ThrowNullArgumentException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        bigFraction.add(((BigInteger) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testEquals_Other() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        boolean actual = bigFraction.equals(bigFraction);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof BigFraction): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testEquals_NotOtherNotInstanceOfBigFraction() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        boolean actual = bigFraction.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof BigFraction): True}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.BigFraction#reduce()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: BigFraction rhs = ((BigFraction) other).reduce();
 *  */
    @Test
    public void testEquals_ThrowArithmeticException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigFraction bigFraction1 = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction1, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction1, "org.apache.commons.math3.fraction.BigFraction", "denominator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.equals] produces [java.lang.ArithmeticException: BigInteger divide by zero]
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1184)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math3.fraction.BigFraction.reduce(BigFraction.java:1040)
            org.apache.commons.math3.fraction.BigFraction.equals(BigFraction.java:718) */
        bigFraction.equals(bigFraction1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#toString()}
 * @utbot.executesCondition {@code (BigInteger.ONE.equals(denominator)): True}
 * @utbot.invokes {@link java.math.BigInteger#equals(java.lang.Object)}
 * @utbot.invokes {@link java.math.BigInteger#toString()}
 *  */
    @Test
    public void testToString_BigIntegerONEEquals() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        String actual = bigFraction.toString();
        
        String expected = "null / -";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#toString()}
 * @utbot.executesCondition {@code (BigInteger.ONE.equals(denominator)): False}
 * @utbot.executesCondition {@code (BigInteger.ZERO.equals(numerator)): True}
 * @utbot.invokes {@link java.math.BigInteger#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return str;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return str;
 *  */
    @Test
    public void testToString_ThrowNullPointerException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.toString] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.<init>(BigInteger.java:1138)
            java.base/java.math.BigInteger.negate(BigInteger.java:2683)
            java.base/java.math.BigInteger.abs(BigInteger.java:2674)
            java.base/java.math.BigInteger.toString(BigInteger.java:3967)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            org.apache.commons.math3.fraction.BigFraction.toString(BigFraction.java:1134) */
        bigFraction.toString();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#toString()}
 * @utbot.executesCondition {@code (BigInteger.ONE.equals(denominator)): True}
 * @utbot.invokes {@link java.math.BigInteger#toString()}
 * @utbot.returnsFrom {@code return str;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return str;
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.toString] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.equals(BigInteger.java:3895)
            org.apache.commons.math3.fraction.BigFraction.toString(BigFraction.java:1131) */
        bigFraction.toString();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#toString()}
     */
    @Test
    public void testToString() {
        BigFraction bigFraction = new BigFraction(4194305L);
        
        String actual = bigFraction.toString();
        
        String expected = "4194305";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#hashCode()}
 * @utbot.invokes {@link java.math.BigInteger#hashCode()}
 * @utbot.invokes {@link java.math.BigInteger#hashCode()}
 * @utbot.returnsFrom {@code return 37 * (37 * 17 + numerator.hashCode()) + denominator.hashCode();}
 *  */
    @Test
    public void testHashCode_BigIntegerHashCode() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", -255);
        int[] mag1 = {};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        int actual = bigFraction.hashCode();
        
        assertEquals(23273, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#hashCode()}
 * @utbot.invokes {@link java.math.BigInteger#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return 37 * (37 * 17 + numerator.hashCode()) + denominator.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.hashCode(BigFraction.java:825) */
        bigFraction.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#hashCode()}
 * @utbot.invokes {@link java.math.BigInteger#hashCode()}
 * @utbot.invokes {@link java.math.BigInteger#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return 37 * (37 * 17 + numerator.hashCode()) + denominator.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.hashCode(BigFraction.java:825) */
        bigFraction.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.abs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method abs()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#abs()}
 * @utbot.invokes {@link java.math.BigInteger#compareTo(java.math.BigInteger)}
 * @utbot.returnsFrom {@code return (BigInteger.ZERO.compareTo(numerator) <= 0) ? this : negate();}
 *  */
    @Test
    public void testAbs_BigIntegerCompareTo() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {-255};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        BigFraction actual = bigFraction.abs();
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(bigFraction, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method abs()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#abs()}
 * @utbot.invokes {@link java.math.BigInteger#compareTo(java.math.BigInteger)}
 * @utbot.returnsFrom {@code return (BigInteger.ZERO.compareTo(numerator) <= 0) ? this : negate();}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} in: return (BigInteger.ZERO.compareTo(numerator) <= 0) ? this : negate();
 *  */
    @Test(expected = NullArgumentException.class)
    public void testAbs_ThrowNullArgumentException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -1);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        bigFraction.abs();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.pow
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pow(int)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#pow(int)}
 * @utbot.executesCondition {@code (exponent < 0): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return new BigFraction(denominator.pow(-exponent), numerator.pow(-exponent));
 *  */
    @Test
    public void testPow_ThrowArithmeticException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.pow] produces [java.lang.ArithmeticException: Negative exponent]
            java.base/java.math.BigInteger.pow(BigInteger.java:2423)
            org.apache.commons.math3.fraction.BigFraction.pow(BigFraction.java:960) */
        bigFraction.pow(Integer.MIN_VALUE);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#pow(int)}
 * @utbot.executesCondition {@code (exponent < 0): False}
 * @utbot.invokes {@link java.math.BigInteger#pow(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(numerator.pow(exponent), denominator.pow(exponent));
 *  */
    @Test
    public void testPow_ThrowNullPointerException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.pow(BigFraction.java:962) */
        bigFraction.pow(0);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#pow(int)}
 * @utbot.executesCondition {@code (exponent < 0): True}
 * @utbot.invokes {@link java.math.BigInteger#pow(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(denominator.pow(-exponent), numerator.pow(-exponent));
 *  */
    @Test
    public void testPow_ThrowNullPointerException_2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.pow(BigFraction.java:960) */
        bigFraction.pow(-1);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#pow(int)}
 * @utbot.executesCondition {@code (exponent < 0): True}
 * @utbot.invokes {@link java.math.BigInteger#pow(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(denominator.pow(-exponent), numerator.pow(-exponent));
 *  */
    @Test
    public void testPow_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.pow(BigFraction.java:960) */
        bigFraction.pow(-1);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#pow(int)}
 * @utbot.executesCondition {@code (exponent < 0): False}
 * @utbot.invokes {@link java.math.BigInteger#pow(int)}
 * @utbot.invokes {@link java.math.BigInteger#pow(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(numerator.pow(exponent), denominator.pow(exponent));
 *  */
    @Test
    public void testPow_ThrowNullPointerException_3() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.pow(BigFraction.java:962) */
        bigFraction.pow(1);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method pow(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#pow(int)}
     */
    @Test
    public void testPow() throws Exception  {
        BigFraction bigFraction = new BigFraction(4294967295L);
        
        BigFraction actual = bigFraction.pow(2);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method pow(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#pow(int)}
     */
    @Test
    public void testPowThrowsAE() {
        BigFraction bigFraction = new BigFraction(4294967295L);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.pow] produces [java.lang.ArithmeticException: BigInteger would overflow supported range]
            java.base/java.math.BigInteger.reportOverflow(BigInteger.java:1171)
            java.base/java.math.BigInteger.pow(BigInteger.java:2504)
            org.apache.commons.math3.fraction.BigFraction.pow(BigFraction.java:960) */
        bigFraction.pow(-2147483646);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.pow
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pow(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#pow(java.math.BigInteger)}
 * @utbot.invokes {@link java.math.BigInteger#compareTo(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: exponent.compareTo(BigInteger.ZERO) < 0
 *  */
    @Test
    public void testPow_ThrowNullPointerException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.pow(BigFraction.java:995) */
        bigFraction.pow(((BigInteger) null));
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#pow(java.math.BigInteger)}
 * @utbot.executesCondition {@code (exponent.compareTo(BigInteger.ZERO) < 0): True}
 * @utbot.invokes {@link java.math.BigInteger#compareTo(java.math.BigInteger)}
 * @utbot.invokes {@link java.math.BigInteger#negate()}
 * @utbot.invokes {@link org.apache.commons.math3.util.ArithmeticUtils#pow(java.math.BigInteger,java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(ArithmeticUtils.pow(denominator, eNeg), ArithmeticUtils.pow(numerator, eNeg));
 *  */
    @Test
    public void testPow_ThrowNullPointerException_11() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.ArithmeticUtils.pow(ArithmeticUtils.java:800)
            org.apache.commons.math3.fraction.BigFraction.pow(BigFraction.java:1000) */
        bigFraction.pow(bigInteger);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.pow
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method pow(long)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#pow(long)}
 * @utbot.executesCondition {@code (exponent < 0): True}
 * @utbot.invokes {@link org.apache.commons.math3.util.ArithmeticUtils#pow(java.math.BigInteger,long)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotPositiveException} in: return new BigFraction(ArithmeticUtils.pow(denominator, -exponent), ArithmeticUtils.pow(numerator, -exponent));
 *  */
    @Test(expected = NotPositiveException.class)
    public void testPow_ThrowNotPositiveException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        bigFraction.pow(java.lang.Long.MIN_VALUE);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method pow(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#pow(long)}
     */
    @Test
    public void testPow1() throws Exception  {
        BigFraction bigFraction = new BigFraction(0L);
        
        BigFraction actual = bigFraction.pow(9223372036854775799L);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method pow(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#pow(long)}
     */
    @Test(expected = ZeroException.class)
    public void testPowThrowsZE() {
        BigFraction bigFraction = new BigFraction(0L);
        
        bigFraction.pow(-9L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.pow
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pow(double)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#pow(double)}
 * @utbot.invokes {@link java.math.BigInteger#doubleValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return FastMath.pow(numerator.doubleValue(), exponent) / FastMath.pow(denominator.doubleValue(), exponent);
 *  */
    @Test
    public void testPow_ThrowNullPointerException2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.pow(BigFraction.java:1015) */
        bigFraction.pow(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#pow(double)}
 * @utbot.invokes {@link java.math.BigInteger#doubleValue()}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#pow(double,double)}
 * @utbot.invokes {@link java.math.BigInteger#doubleValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FastMath.pow(denominator.doubleValue(), exponent)
 *  */
    @Test
    public void testPow_ThrowNullPointerException_12() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.pow(BigFraction.java:1016) */
        bigFraction.pow(0.0);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method pow(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#pow(double)}
     */
    @Test
    public void testPowReturnsOne() {
        BigFraction bigFraction = new BigFraction(1L);
        
        double actual = bigFraction.pow(1.0);
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#pow(double)}
     */
    @Test
    public void testPowReturnsOne1() {
        BigFraction bigFraction = new BigFraction(1L);
        
        double actual = bigFraction.pow(1.0000000000000002);
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.compareTo
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compareTo(org.apache.commons.math3.fraction.BigFraction)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#compareTo(org.apache.commons.math3.fraction.BigFraction)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BigInteger nOd = numerator.multiply(object.denominator);
 *  */
    @Test
    public void testCompareTo_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.compareTo] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.compareTo(BigFraction.java:597) */
        bigFraction.compareTo(((BigFraction) null));
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#compareTo(org.apache.commons.math3.fraction.BigFraction)}
 * @utbot.invokes {@link java.math.BigInteger#multiply(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BigInteger nOd = numerator.multiply(object.denominator);
 *  */
    @Test
    public void testCompareTo_ThrowNullPointerException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.compareTo] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.compareTo(BigFraction.java:597) */
        bigFraction.compareTo(bigFraction);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method compareTo(org.apache.commons.math3.fraction.BigFraction)
    
    @Test
    public void testCompareTo1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        int[] mag1 = {1};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        int actual = bigFraction.compareTo(bigFraction);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compareTo(org.apache.commons.math3.fraction.BigFraction)
    
    @Test
    public void testCompareTo2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {16};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigFraction bigFraction1 = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        setField(bigFraction1, "org.apache.commons.math3.fraction.BigFraction", "denominator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.compareTo] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.compareTo(BigFraction.java:598) */
        bigFraction.compareTo(bigFraction1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.intValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method intValue()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#intValue()}
 * @utbot.invokes {@link java.math.BigInteger#divide(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return numerator.divide(denominator).intValue();
 *  */
    @Test
    public void testIntValue_ThrowArithmeticException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {-255};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = {};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.intValue] produces [java.lang.ArithmeticException: BigInteger divide by zero]
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1184)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math3.fraction.BigFraction.intValue(BigFraction.java:839) */
        bigFraction.intValue();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#intValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return numerator.divide(denominator).intValue();
 *  */
    @Test
    public void testIntValue_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.intValue] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.intValue(BigFraction.java:839) */
        bigFraction.intValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method intValue()
    
    @Test
    public void testIntValue1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {1342177730};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", numerator);
        
        int actual = bigFraction.intValue();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method intValue()
    
    @Test
    public void testIntValue2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = new int[22];
        mag[0] = -2147483647;
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = new int[22];
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.intValue] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.math.MutableBigInteger.divWord(MutableBigInteger.java:1858)
            java.base/java.math.MutableBigInteger.divideMagnitude(MutableBigInteger.java:1626)
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1232)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math3.fraction.BigFraction.intValue(BigFraction.java:839) */
        bigFraction.intValue();
    }
    
    @Test
    public void testIntValue3() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {0, 0};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = {0};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.intValue] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.math.MutableBigInteger.divideOneWord(MutableBigInteger.java:1117)
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1208)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math3.fraction.BigFraction.intValue(BigFraction.java:839) */
        bigFraction.intValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.longValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method longValue()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#longValue()}
 * @utbot.invokes {@link java.math.BigInteger#divide(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return numerator.divide(denominator).longValue();
 *  */
    @Test
    public void testLongValue_ThrowArithmeticException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {-255};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = {};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.longValue] produces [java.lang.ArithmeticException: BigInteger divide by zero]
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1184)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math3.fraction.BigFraction.longValue(BigFraction.java:853) */
        bigFraction.longValue();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#longValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return numerator.divide(denominator).longValue();
 *  */
    @Test
    public void testLongValue_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.longValue] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.longValue(BigFraction.java:853) */
        bigFraction.longValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method longValue()
    
    @Test
    public void testLongValue1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {1342177730};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", numerator);
        
        long actual = bigFraction.longValue();
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method longValue()
    
    @Test
    public void testLongValue2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {0, 0};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = {0};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.longValue] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.math.MutableBigInteger.divideOneWord(MutableBigInteger.java:1117)
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1208)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math3.fraction.BigFraction.longValue(BigFraction.java:853) */
        bigFraction.longValue();
    }
    
    @Test
    public void testLongValue3() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = new int[22];
        mag[0] = -2147483647;
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = new int[22];
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.longValue] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.math.MutableBigInteger.divWord(MutableBigInteger.java:1858)
            java.base/java.math.MutableBigInteger.divideMagnitude(MutableBigInteger.java:1626)
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1232)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math3.fraction.BigFraction.longValue(BigFraction.java:853) */
        bigFraction.longValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.floatValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method floatValue()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#floatValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: float result = numerator.floatValue() / denominator.floatValue();
 *  */
    @Test
    public void testFloatValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.floatValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.floatValue(BigInteger.java:4257)
            org.apache.commons.math3.fraction.BigFraction.floatValue(BigFraction.java:737) */
        bigFraction.floatValue();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#floatValue()}
 * @utbot.invokes {@link java.math.BigInteger#floatValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: float result = numerator.floatValue() / denominator.floatValue();
 *  */
    @Test
    public void testFloatValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.floatValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.floatValue(BigInteger.java:4257)
            org.apache.commons.math3.fraction.BigFraction.floatValue(BigFraction.java:737) */
        bigFraction.floatValue();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#floatValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: float result = numerator.floatValue() / denominator.floatValue();
 *  */
    @Test
    public void testFloatValue_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.floatValue] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.floatValue(BigFraction.java:737) */
        bigFraction.floatValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method floatValue()
    
    @Test
    public void testFloatValue1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -2147483647);
        int[] mag = new int[32];
        mag[0] = -2147483647;
        mag[1] = 3;
        mag[2] = 3;
        mag[3] = 3;
        mag[4] = 3;
        mag[5] = 3;
        mag[6] = 3;
        mag[7] = 3;
        mag[8] = 3;
        mag[9] = 3;
        mag[10] = 3;
        mag[11] = 3;
        mag[12] = 3;
        mag[13] = 3;
        mag[14] = 3;
        mag[15] = 3;
        mag[16] = 3;
        mag[17] = 3;
        mag[18] = 3;
        mag[19] = 3;
        mag[20] = 3;
        mag[21] = 3;
        mag[22] = 3;
        mag[23] = 3;
        mag[24] = 3;
        mag[25] = 3;
        mag[26] = 3;
        mag[27] = 3;
        mag[28] = 3;
        mag[29] = 3;
        mag[30] = 3;
        mag[31] = 3;
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", numerator);
        
        float actual = bigFraction.floatValue();
        
        org.junit.Assert.assertEquals(1.0f, actual, 1.0E-6f);
    }
    
    @Test
    public void testFloatValue2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        int[] mag = {1, 3};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        float actual = bigFraction.floatValue();
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method floatValue()
    
    @Test
    public void testFloatValue3() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.floatValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.bitLength(BigInteger.java:3701)
            org.apache.commons.math3.fraction.BigFraction.floatValue(BigFraction.java:741) */
        bigFraction.floatValue();
    }
    
    @Test
    public void testFloatValue4() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {1, 3};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.floatValue] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.floatValue(BigFraction.java:737) */
        bigFraction.floatValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.doubleValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doubleValue()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#doubleValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double result = numerator.doubleValue() / denominator.doubleValue();
 *  */
    @Test
    public void testDoubleValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.doubleValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.doubleValue(BigInteger.java:4342)
            org.apache.commons.math3.fraction.BigFraction.doubleValue(BigFraction.java:684) */
        bigFraction.doubleValue();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#doubleValue()}
 * @utbot.invokes {@link java.math.BigInteger#doubleValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double result = numerator.doubleValue() / denominator.doubleValue();
 *  */
    @Test
    public void testDoubleValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.doubleValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.doubleValue(BigInteger.java:4342)
            org.apache.commons.math3.fraction.BigFraction.doubleValue(BigFraction.java:684) */
        bigFraction.doubleValue();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#doubleValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double result = numerator.doubleValue() / denominator.doubleValue();
 *  */
    @Test
    public void testDoubleValue_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.doubleValue] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.doubleValue(BigFraction.java:684) */
        bigFraction.doubleValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method doubleValue()
    
    @Test
    public void testDoubleValue1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = new int[40];
        mag[0] = -2147483647;
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        double actual = bigFraction.doubleValue();
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method doubleValue()
    
    @Test
    public void testDoubleValue2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.doubleValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.bitLength(BigInteger.java:3701)
            org.apache.commons.math3.fraction.BigFraction.doubleValue(BigFraction.java:688) */
        bigFraction.doubleValue();
    }
    
    @Test
    public void testDoubleValue3() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {8192};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.doubleValue] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.doubleValue(BigFraction.java:684) */
        bigFraction.doubleValue();
    }
    
    @Test
    public void testDoubleValue4() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = new int[40];
        mag[0] = -2147483647;
        mag[1] = 3;
        mag[2] = 3;
        mag[3] = 3;
        mag[4] = 3;
        mag[5] = 3;
        mag[6] = 3;
        mag[7] = 3;
        mag[8] = 3;
        mag[9] = 3;
        mag[10] = 3;
        mag[11] = 3;
        mag[12] = 3;
        mag[13] = 3;
        mag[14] = 3;
        mag[15] = 3;
        mag[16] = 3;
        mag[17] = 3;
        mag[18] = 3;
        mag[19] = 3;
        mag[20] = 3;
        mag[21] = 3;
        mag[22] = 3;
        mag[23] = 3;
        mag[24] = 3;
        mag[25] = 3;
        mag[26] = 3;
        mag[27] = 3;
        mag[28] = 3;
        mag[29] = 3;
        mag[30] = 3;
        mag[31] = 3;
        mag[32] = 3;
        mag[33] = 3;
        mag[34] = 3;
        mag[35] = 3;
        mag[36] = 3;
        mag[37] = 3;
        mag[38] = 3;
        mag[39] = 3;
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 4);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.doubleValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.doubleValue(BigInteger.java:4342)
            org.apache.commons.math3.fraction.BigFraction.doubleValue(BigFraction.java:684) */
        bigFraction.doubleValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.getField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getField()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#getField()}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.BigFractionField#getInstance()}
 * @utbot.returnsFrom {@code return BigFractionField.getInstance();}
 *  */
    @Test
    public void testGetField_BigFractionFieldGetInstance() throws Exception  {
        Class lazyHolderClazz = Class.forName("org.apache.commons.math3.fraction.BigFractionField$LazyHolder");
        BigFractionField prevINSTANCE = ((BigFractionField) getStaticFieldValue(lazyHolderClazz, "INSTANCE"));
        try {
            Class bigFractionFieldClazz = Class.forName("org.apache.commons.math3.fraction.BigFractionField");
            Class anonymousObjectType = Class.forName("org.apache.commons.math3.fraction.BigFractionField$1");
            Constructor bigFractionFieldConstructor = bigFractionFieldClazz.getDeclaredConstructor(anonymousObjectType);
            bigFractionFieldConstructor.setAccessible(true);
            java.lang.Object[] bigFractionFieldConstructorArguments = new java.lang.Object[1];
            bigFractionFieldConstructorArguments[0] = ((Object) null);
            BigFractionField instance = ((BigFractionField) bigFractionFieldConstructor.newInstance(bigFractionFieldConstructorArguments));
            setStaticField(lazyHolderClazz, "INSTANCE", instance);
            BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
            
            BigFractionField actual = bigFraction.getField();
            
        } finally {
            setStaticField(lazyHolderClazz, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getField()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#getField()}
     */
    @Test
    public void testGetField() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        BigFraction bigFraction = new BigFraction(4194305L);
        
        BigFractionField actual = bigFraction.getField();
        
        Class bigFractionFieldClazz = Class.forName("org.apache.commons.math3.fraction.BigFractionField");
        Class anonymousObjectType = Class.forName("org.apache.commons.math3.fraction.BigFractionField$1");
        Constructor bigFractionFieldConstructor = bigFractionFieldClazz.getDeclaredConstructor(anonymousObjectType);
        bigFractionFieldConstructor.setAccessible(true);
        java.lang.Object[] bigFractionFieldConstructorArguments = new java.lang.Object[1];
        bigFractionFieldConstructorArguments[0] = ((Object) null);
        BigFractionField expected = ((BigFractionField) bigFractionFieldConstructor.newInstance(bigFractionFieldConstructorArguments));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.reduce
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reduce()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#reduce()}
 * @utbot.invokes {@link java.math.BigInteger#gcd(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final BigInteger gcd = numerator.gcd(denominator);
 *  */
    @Test
    public void testReduce_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.reduce] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.reduce(BigFraction.java:1039) */
        bigFraction.reduce();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reduce()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#reduce()}
     */
    @Test
    public void testReduce() throws Exception  {
        BigFraction bigFraction = new BigFraction(4194305L);
        
        BigFraction actual = bigFraction.reduce();
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method reduce()
    
    @Test
    public void testReduce1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {1073742822};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        BigFraction actual = bigFraction.reduce();
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator1);
        BigInteger denominator1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator1);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method reduce()
    
    @Test
    public void testReduce2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {0, 0, 0, 0, 0, 0, 0, 0};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.reduce] produces [java.lang.ArrayIndexOutOfBoundsException: Index -134217720 out of bounds for length 8]
            java.base/java.math.MutableBigInteger.primitiveLeftShift(MutableBigInteger.java:705)
            java.base/java.math.MutableBigInteger.rightShift(MutableBigInteger.java:552)
            java.base/java.math.MutableBigInteger.binaryGCD(MutableBigInteger.java:1998)
            java.base/java.math.MutableBigInteger.hybridGCD(MutableBigInteger.java:1975)
            java.base/java.math.BigInteger.gcd(BigInteger.java:2601)
            org.apache.commons.math3.fraction.BigFraction.reduce(BigFraction.java:1039) */
        bigFraction.reduce();
    }
    
    @Test
    public void testReduce3() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.reduce] produces [java.lang.ArithmeticException: BigInteger divide by zero]
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1184)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math3.fraction.BigFraction.reduce(BigFraction.java:1040) */
        bigFraction.reduce();
    }
    
    @Test
    public void testReduce4() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {-2147483647};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        int[] mag1 = {0};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.reduce] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.math.MutableBigInteger.divideOneWord(MutableBigInteger.java:1096)
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1208)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math3.fraction.BigFraction.reduce(BigFraction.java:1040) */
        bigFraction.reduce();
    }
    
    @Test
    public void testReduce5() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = new int[35];
        mag[0] = -2147483647;
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        int[] mag1 = new int[35];
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.reduce] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.math.MutableBigInteger.divWord(MutableBigInteger.java:1858)
            java.base/java.math.MutableBigInteger.divideMagnitude(MutableBigInteger.java:1626)
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1232)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math3.fraction.BigFraction.reduce(BigFraction.java:1040) */
        bigFraction.reduce();
    }
    
    @Test
    public void testReduce6() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = new int[12];
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 16777216);
        int[] mag1 = {0};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.reduce] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.math.MutableBigInteger.divideOneWord(MutableBigInteger.java:1117)
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1208)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math3.fraction.BigFraction.reduce(BigFraction.java:1040) */
        bigFraction.reduce();
    }
    
    @Test
    public void testReduce7() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -2);
        int[] mag = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.reduce] produces [java.lang.NullPointerException]
            java.base/java.math.MutableBigInteger.<init>(MutableBigInteger.java:123)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2315)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math3.fraction.BigFraction.reduce(BigFraction.java:1040) */
        bigFraction.reduce();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method reduce()
    
    @Test(expected = ZeroException.class)
    public void testReduce8() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", numerator);
        
        bigFraction.reduce();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.multiply
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiply(int)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#multiply(int)}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.BigFraction#multiply(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return multiply(BigInteger.valueOf(i));
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.multiply] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.multiply(BigInteger.java:1598)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math3.fraction.BigFraction.multiply(BigFraction.java:870)
            org.apache.commons.math3.fraction.BigFraction.multiply(BigFraction.java:884) */
        bigFraction.multiply(-16);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method multiply(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#multiply(int)}
     */
    @Test
    public void testMultiply() throws Exception  {
        BigFraction bigFraction = new BigFraction(1L);
        
        BigFraction actual = bigFraction.multiply(-3);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method multiply(int)
    
    @Test
    public void testMultiply1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.shiftLeft(BigInteger.java:3359)
            java.base/java.math.BigInteger.multiplyByInt(BigInteger.java:1689)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1615)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math3.fraction.BigFraction.multiply(BigFraction.java:870)
            org.apache.commons.math3.fraction.BigFraction.multiply(BigFraction.java:884) */
        bigFraction.multiply(-16);
    }
    
    @Test
    public void testMultiply2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.multiply] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.multiply(BigInteger.java:1607)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math3.fraction.BigFraction.multiply(BigFraction.java:870)
            org.apache.commons.math3.fraction.BigFraction.multiply(BigFraction.java:884) */
        bigFraction.multiply(-16);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(int)
    
    @Test(expected = NullArgumentException.class)
    public void testMultiply3() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 2);
        int[] mag = {0};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        bigFraction.multiply(17);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.multiply
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiply(long)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#multiply(long)}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.BigFraction#multiply(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return multiply(BigInteger.valueOf(l));
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.multiply] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.multiply(BigInteger.java:1598)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math3.fraction.BigFraction.multiply(BigFraction.java:870)
            org.apache.commons.math3.fraction.BigFraction.multiply(BigFraction.java:898) */
        bigFraction.multiply(-16L);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method multiply(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#multiply(long)}
     */
    @Test
    public void testMultiply4() throws Exception  {
        BigFraction bigFraction = new BigFraction(1L);
        
        BigFraction actual = bigFraction.multiply(-9L);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method multiply(long)
    
    @Test
    public void testMultiply5() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.multiply] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.multiply(BigInteger.java:1607)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math3.fraction.BigFraction.multiply(BigFraction.java:870)
            org.apache.commons.math3.fraction.BigFraction.multiply(BigFraction.java:898) */
        bigFraction.multiply(-8L);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(long)
    
    @Test(expected = NullArgumentException.class)
    public void testMultiply6() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        bigFraction.multiply(-8L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.multiply
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(org.apache.commons.math3.fraction.BigFraction)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#multiply(org.apache.commons.math3.fraction.BigFraction)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: fraction == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testMultiply_ThrowNullArgumentException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        bigFraction.multiply(((BigFraction) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiply(org.apache.commons.math3.fraction.BigFraction)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#multiply(org.apache.commons.math3.fraction.BigFraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.invokes {@link java.math.BigInteger#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: numerator.equals(BigInteger.ZERO) || fraction.numerator.equals(BigInteger.ZERO)
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.multiply(BigFraction.java:915) */
        bigFraction.multiply(bigFraction);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method multiply(org.apache.commons.math3.fraction.BigFraction)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#multiply(org.apache.commons.math3.fraction.BigFraction)}
     */
    @Test
    public void testMultiply7() throws Exception  {
        BigFraction bigFraction = new BigFraction(2147483648L);
        BigFraction bigFraction1 = new BigFraction(0.0);
        
        BigFraction actual = bigFraction.multiply(bigFraction1);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#multiply(org.apache.commons.math3.fraction.BigFraction)}
     */
    @Test
    public void testMultiply8() throws Exception  {
        BigFraction bigFraction = new BigFraction(2147483648L);
        BigFraction bigFraction1 = new BigFraction(1.2882297539194267E-231);
        
        BigFraction actual = bigFraction.multiply(bigFraction1);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method multiply(org.apache.commons.math3.fraction.BigFraction)
    
    @Test
    public void testMultiply9() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigFraction bigFraction1 = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        BigFraction actual = bigFraction.multiply(bigFraction1);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator1);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method multiply(org.apache.commons.math3.fraction.BigFraction)
    
    @Test
    public void testMultiply10() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.multiply] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.equals(BigInteger.java:3893)
            org.apache.commons.math3.fraction.BigFraction.multiply(BigFraction.java:915) */
        bigFraction.multiply(bigFraction);
    }
    
    @Test
    public void testMultiply11() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {0};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigFraction bigFraction1 = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.multiply(BigFraction.java:916) */
        bigFraction.multiply(bigFraction1);
    }
    
    @Test
    public void testMultiply12() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {0};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.multiply(BigFraction.java:920) */
        bigFraction.multiply(bigFraction);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.multiply
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#multiply(java.math.BigInteger)}
 * @utbot.executesCondition {@code (bg == null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: bg == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testMultiply_ThrowNullArgumentException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        bigFraction.multiply(((BigInteger) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiply(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#multiply(java.math.BigInteger)}
 * @utbot.executesCondition {@code (bg == null): False}
 * @utbot.invokes {@link java.math.BigInteger#multiply(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(bg.multiply(numerator), denominator);
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException3() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.multiply] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.multiply(BigInteger.java:1598)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math3.fraction.BigFraction.multiply(BigFraction.java:870) */
        bigFraction.multiply(bigInteger);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(java.math.BigInteger)
    
    @Test(expected = NullArgumentException.class)
    public void testMultiply13() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {-1270853560};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 1);
        int[] mag1 = {};
        setField(bigInteger, "java.math.BigInteger", "mag", mag1);
        
        bigFraction.multiply(bigInteger);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method multiply(java.math.BigInteger)
    
    @Test
    public void testMultiply14() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 1);
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/java.math.BigInteger.implMultiplyToLen(BigInteger.java:1776)
            java.base/java.math.BigInteger.multiplyToLen(BigInteger.java:1758)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1617)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math3.fraction.BigFraction.multiply(BigFraction.java:870) */
        bigFraction.multiply(bigInteger);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.negate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method negate()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#negate()}
 * @utbot.invokes {@link java.math.BigInteger#negate()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(numerator.negate(), denominator);
 *  */
    @Test
    public void testNegate_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.negate] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.negate(BigFraction.java:932) */
        bigFraction.negate();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method negate()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#negate()}
     */
    @Test
    public void testNegate() throws Exception  {
        BigFraction bigFraction = new BigFraction(4194305L);
        
        BigFraction actual = bigFraction.negate();
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method negate()
    
    @Test
    public void testNegate1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -245574);
        int[] mag = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.negate] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.equals(BigInteger.java:3895)
            org.apache.commons.math3.fraction.BigFraction.<init>(BigFraction.java:123)
            org.apache.commons.math3.fraction.BigFraction.negate(BigFraction.java:932) */
        bigFraction.negate();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method negate()
    
    @Test(expected = NullArgumentException.class)
    public void testNegate2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        bigFraction.negate();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.divide
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(org.apache.commons.math3.fraction.BigFraction)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#divide(org.apache.commons.math3.fraction.BigFraction)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: fraction == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testDivide_ThrowNullArgumentException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        bigFraction.divide(((BigFraction) null));
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#divide(org.apache.commons.math3.fraction.BigFraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (BigInteger.ZERO.equals(fraction.numerator)): True}
 * @utbot.invokes {@link java.math.BigInteger#equals(java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: BigInteger.ZERO.equals(fraction.numerator)
 *  */
    @Test(expected = NullArgumentException.class)
    public void testDivide_ThrowNullArgumentException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        bigFraction.divide(bigFraction);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method divide(org.apache.commons.math3.fraction.BigFraction)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#divide(org.apache.commons.math3.fraction.BigFraction)}
     */
    @Test
    public void testDivide() throws Exception  {
        BigFraction bigFraction = new BigFraction(2147483648L);
        BigFraction bigFraction1 = new BigFraction(1.2882297539194267E-231);
        
        BigFraction actual = bigFraction.divide(bigFraction1);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(org.apache.commons.math3.fraction.BigFraction)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#divide(org.apache.commons.math3.fraction.BigFraction)}
     */
    @Test(expected = MathArithmeticException.class)
    public void testDivideThrowsMAE() {
        BigFraction bigFraction = new BigFraction(2147483648L);
        BigFraction bigFraction1 = new BigFraction(0.0);
        
        bigFraction.divide(bigFraction1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.divide
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(long)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#divide(long)}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.BigFraction#divide(java.math.BigInteger)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return divide(BigInteger.valueOf(l));
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testDivide_ThrowMathArithmeticException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        bigFraction.divide(0L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method divide(long)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#divide(long)}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.BigFraction#divide(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return divide(BigInteger.valueOf(l));
 *  */
    @Test
    public void testDivide_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.divide(BigFraction.java:620)
            org.apache.commons.math3.fraction.BigFraction.divide(BigFraction.java:648) */
        bigFraction.divide(-16L);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method divide(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#divide(long)}
     */
    @Test
    public void testDivide1() throws Exception  {
        BigFraction bigFraction = new BigFraction(1L);
        
        BigFraction actual = bigFraction.divide(-9L);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#divide(long)}
     */
    @Test
    public void testDivide2() throws Exception  {
        BigFraction bigFraction = new BigFraction(1L);
        
        BigFraction actual = bigFraction.divide(9223372036854775799L);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.divide
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method divide(int)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#divide(int)}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.BigFraction#divide(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return divide(BigInteger.valueOf(i));
 *  */
    @Test
    public void testDivide_ThrowNullPointerException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.divide(BigFraction.java:620)
            org.apache.commons.math3.fraction.BigFraction.divide(BigFraction.java:634) */
        bigFraction.divide(-16);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method divide(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#divide(int)}
     */
    @Test
    public void testDivide3() throws Exception  {
        BigFraction bigFraction = new BigFraction(1L);
        
        BigFraction actual = bigFraction.divide(-3);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#divide(int)}
     */
    @Test
    public void testDivide4() throws Exception  {
        BigFraction bigFraction = new BigFraction(1L);
        
        BigFraction actual = bigFraction.divide(2147483645);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method divide(int)
    
    @Test
    public void testDivide5() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.divide] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.multiply(BigInteger.java:1601)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math3.fraction.BigFraction.divide(BigFraction.java:620)
            org.apache.commons.math3.fraction.BigFraction.divide(BigFraction.java:634) */
        bigFraction.divide(-16);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(int)
    
    @Test(expected = MathArithmeticException.class)
    public void testDivide6() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        bigFraction.divide(0);
    }
    
    @Test(expected = NullArgumentException.class)
    public void testDivide7() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        bigFraction.divide(-16);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.divide
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#divide(java.math.BigInteger)}
 * @utbot.executesCondition {@code (bg == null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: bg == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testDivide_ThrowNullArgumentException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        bigFraction.divide(((BigInteger) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method divide(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#divide(java.math.BigInteger)}
 * @utbot.executesCondition {@code (bg == null): False}
 * @utbot.invokes {@link java.math.BigInteger#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: BigInteger.ZERO.equals(bg)
 *  */
    @Test
    public void testDivide_ThrowNullPointerException2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.divide] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.equals(BigInteger.java:3895)
            org.apache.commons.math3.fraction.BigFraction.divide(BigFraction.java:617) */
        bigFraction.divide(bigInteger);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(java.math.BigInteger)
    
    @Test(expected = NullArgumentException.class)
    public void testDivide8() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 1);
        
        bigFraction.divide(bigInteger);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method divide(java.math.BigInteger)
    
    @Test
    public void testDivide9() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 2);
        int[] mag1 = {1, -2147483646};
        setField(bigInteger, "java.math.BigInteger", "mag", mag1);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.divide] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/java.math.BigInteger.implMultiplyToLen(BigInteger.java:1771)
            java.base/java.math.BigInteger.multiplyToLen(BigInteger.java:1758)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1617)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math3.fraction.BigFraction.divide(BigFraction.java:620) */
        bigFraction.divide(bigInteger);
    }
    
    @Test
    public void testDivide10() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.divide] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/java.math.BigInteger.implMultiplyToLen(BigInteger.java:1776)
            java.base/java.math.BigInteger.multiplyToLen(BigInteger.java:1758)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1617)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math3.fraction.BigFraction.divide(BigFraction.java:620) */
        bigFraction.divide(denominator);
    }
    
    @Test
    public void testDivide11() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.divide(BigFraction.java:620) */
        bigFraction.divide(bigInteger);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.subtract
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(long)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#subtract(long)}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.BigFraction#subtract(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return subtract(BigInteger.valueOf(l));
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1057)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1083) */
        bigFraction.subtract(-16L);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method subtract(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#subtract(long)}
     */
    @Test
    public void testSubtract() throws Exception  {
        BigFraction bigFraction = new BigFraction(1L);
        
        BigFraction actual = bigFraction.subtract(-9L);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method subtract(long)
    
    @Test
    public void testSubtract1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.shiftLeft(BigInteger.java:3359)
            java.base/java.math.BigInteger.multiplyByInt(BigInteger.java:1689)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1612)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1057)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1083) */
        bigFraction.subtract(-16L);
    }
    
    @Test
    public void testSubtract2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.subtract] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.equals(BigInteger.java:3895)
            org.apache.commons.math3.fraction.BigFraction.<init>(BigFraction.java:123)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1057)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1083) */
        bigFraction.subtract(17L);
    }
    
    @Test
    public void testSubtract3() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1057)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1083) */
        bigFraction.subtract(4294967313L);
    }
    
    @Test
    public void testSubtract4() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.subtract] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.equals(BigInteger.java:3895)
            org.apache.commons.math3.fraction.BigFraction.<init>(BigFraction.java:126)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1057)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1083) */
        bigFraction.subtract(-15L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.subtract
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(int)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#subtract(int)}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.BigFraction#subtract(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return subtract(BigInteger.valueOf(i));
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1057)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1070) */
        bigFraction.subtract(0);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method subtract(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#subtract(int)}
     */
    @Test
    public void testSubtract5() throws Exception  {
        BigFraction bigFraction = new BigFraction(1L);
        
        BigFraction actual = bigFraction.subtract(-3);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method subtract(int)
    
    @Test
    public void testSubtract6() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.shiftLeft(BigInteger.java:3359)
            java.base/java.math.BigInteger.multiplyByInt(BigInteger.java:1689)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1612)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1057)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1070) */
        bigFraction.subtract(-16);
    }
    
    @Test
    public void testSubtract7() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.subtract] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.equals(BigInteger.java:3895)
            org.apache.commons.math3.fraction.BigFraction.<init>(BigFraction.java:123)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1057)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1070) */
        bigFraction.subtract(0);
    }
    
    @Test
    public void testSubtract8() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1057)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1070) */
        bigFraction.subtract(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.subtract
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math3.fraction.BigFraction)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#subtract(org.apache.commons.math3.fraction.BigFraction)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: fraction == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSubtract_ThrowNullArgumentException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        bigFraction.subtract(((BigFraction) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math3.fraction.BigFraction)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#subtract(org.apache.commons.math3.fraction.BigFraction)}
     */
    @Test
    public void testSubtract9() throws Exception  {
        BigFraction bigFraction = new BigFraction(2147483648L);
        BigFraction bigFraction1 = new BigFraction(0.0);
        
        BigFraction actual = bigFraction.subtract(bigFraction1);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#subtract(org.apache.commons.math3.fraction.BigFraction)}
     */
    @Test
    public void testSubtract10() throws Exception  {
        BigFraction bigFraction = new BigFraction(2147483648L);
        BigFraction bigFraction1 = new BigFraction(1.2882297539194267E-231);
        
        BigFraction actual = bigFraction.subtract(bigFraction1);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method subtract(org.apache.commons.math3.fraction.BigFraction)
    
    @Test
    public void testSubtract11() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigFraction bigFraction1 = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.reduce(BigFraction.java:1039)
            org.apache.commons.math3.fraction.BigFraction.equals(BigFraction.java:718)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1100) */
        bigFraction.subtract(bigFraction1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.subtract
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#subtract(java.math.BigInteger)}
 * @utbot.executesCondition {@code (bg == null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: bg == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSubtract_ThrowNullArgumentException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        bigFraction.subtract(((BigInteger) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#subtract(java.math.BigInteger)}
 * @utbot.invokes {@link java.math.BigInteger#multiply(java.math.BigInteger)}
 * @utbot.invokes {@link java.math.BigInteger#subtract(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(numerator.subtract(denominator.multiply(bg)), denominator);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1057) */
        bigFraction.subtract(bigInteger);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#subtract(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(numerator.subtract(denominator.multiply(bg)), denominator);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1057) */
        bigFraction.subtract(bigInteger);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method subtract(java.math.BigInteger)
    
    @Test
    public void testSubtract12() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        int[] mag = {524288};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        BigFraction actual = bigFraction.subtract(denominator);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator1);
        BigInteger denominator1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator1);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method subtract(java.math.BigInteger)
    
    @Test
    public void testSubtract13() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/java.math.BigInteger.implMultiplyToLen(BigInteger.java:1776)
            java.base/java.math.BigInteger.multiplyToLen(BigInteger.java:1758)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1617)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1057) */
        bigFraction.subtract(denominator);
    }
    
    @Test
    public void testSubtract14() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 65536);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", numerator);
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.subtract] produces [java.lang.NullPointerException]
            java.base/java.math.MutableBigInteger.<init>(MutableBigInteger.java:131)
            java.base/java.math.BigInteger.gcd(BigInteger.java:2598)
            org.apache.commons.math3.fraction.BigFraction.<init>(BigFraction.java:132)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1057) */
        bigFraction.subtract(bigInteger);
    }
    
    @Test
    public void testSubtract15() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", numerator);
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.subtract] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.equals(BigInteger.java:3895)
            org.apache.commons.math3.fraction.BigFraction.<init>(BigFraction.java:123)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1057) */
        bigFraction.subtract(bigInteger);
    }
    
    @Test
    public void testSubtract16() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.subtract] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.equals(BigInteger.java:3895)
            org.apache.commons.math3.fraction.BigFraction.<init>(BigFraction.java:126)
            org.apache.commons.math3.fraction.BigFraction.subtract(BigFraction.java:1057) */
        bigFraction.subtract(bigInteger);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.getDenominatorAsInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDenominatorAsInt()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#getDenominatorAsInt()}
 * @utbot.invokes {@link java.math.BigInteger#intValue()}
 * @utbot.returnsFrom {@code return denominator.intValue();}
 *  */
    @Test
    public void testGetDenominatorAsInt_BigIntegerIntValue() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {-255};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        int actual = bigFraction.getDenominatorAsInt();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDenominatorAsInt()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#getDenominatorAsInt()}
 * @utbot.invokes {@link java.math.BigInteger#intValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return denominator.intValue();
 *  */
    @Test
    public void testGetDenominatorAsInt_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.getDenominatorAsInt] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.getDenominatorAsInt(BigFraction.java:768) */
        bigFraction.getDenominatorAsInt();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.getDenominatorAsLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDenominatorAsLong()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#getDenominatorAsLong()}
 * @utbot.invokes {@link java.math.BigInteger#longValue()}
 * @utbot.returnsFrom {@code return denominator.longValue();}
 *  */
    @Test
    public void testGetDenominatorAsLong_BigIntegerLongValue() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", -1);
        int[] mag = {-255};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(denominator, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        long actual = bigFraction.getDenominatorAsLong();
        
        assertEquals(-4294967042L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDenominatorAsLong()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#getDenominatorAsLong()}
 * @utbot.invokes {@link java.math.BigInteger#longValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return denominator.longValue();
 *  */
    @Test
    public void testGetDenominatorAsLong_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.getDenominatorAsLong] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.getDenominatorAsLong(BigFraction.java:779) */
        bigFraction.getDenominatorAsLong();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.bigDecimalValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method bigDecimalValue(int, int)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#bigDecimalValue(int,int)}
 * @utbot.invokes {@link java.math.BigDecimal#divide(java.math.BigDecimal,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new BigDecimal(numerator).divide(new BigDecimal(denominator), scale, roundingMode);
 *  */
    @Test
    public void testBigDecimalValue_ThrowIllegalArgumentException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {0, -255};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = {-1, -255};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.bigDecimalValue] produces [java.lang.IllegalArgumentException: Invalid rounding mode]
            java.base/java.math.BigDecimal.divide(BigDecimal.java:1647)
            org.apache.commons.math3.fraction.BigFraction.bigDecimalValue(BigFraction.java:582) */
        bigFraction.bigDecimalValue(-255, 9);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#bigDecimalValue(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigDecimal(numerator).divide(new BigDecimal(denominator), scale, roundingMode);
 *  */
    @Test
    public void testBigDecimalValue_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.bigDecimalValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.toStrictBigInteger(BigDecimal.java:1069)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:1083)
            org.apache.commons.math3.fraction.BigFraction.bigDecimalValue(BigFraction.java:582) */
        bigFraction.bigDecimalValue(-255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#bigDecimalValue(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigDecimal(numerator).divide(new BigDecimal(denominator), scale, roundingMode);
 *  */
    @Test
    public void testBigDecimalValue_ThrowNullPointerException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.bigDecimalValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.toStrictBigInteger(BigDecimal.java:1069)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:1083)
            org.apache.commons.math3.fraction.BigFraction.bigDecimalValue(BigFraction.java:582) */
        bigFraction.bigDecimalValue(-255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.bigDecimalValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method bigDecimalValue(int)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#bigDecimalValue(int)}
 * @utbot.invokes {@link java.math.BigDecimal#divide(java.math.BigDecimal,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new BigDecimal(numerator).divide(new BigDecimal(denominator), roundingMode);
 *  */
    @Test
    public void testBigDecimalValue_ThrowIllegalArgumentException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {0, -255};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = {-255, -255, -255};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.bigDecimalValue] produces [java.lang.IllegalArgumentException: Invalid rounding mode]
            java.base/java.math.BigDecimal.divide(BigDecimal.java:1647)
            java.base/java.math.BigDecimal.divide(BigDecimal.java:1712)
            org.apache.commons.math3.fraction.BigFraction.bigDecimalValue(BigFraction.java:563) */
        bigFraction.bigDecimalValue(9);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#bigDecimalValue(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigDecimal(numerator).divide(new BigDecimal(denominator), roundingMode);
 *  */
    @Test
    public void testBigDecimalValue_ThrowNullPointerException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.bigDecimalValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.toStrictBigInteger(BigDecimal.java:1069)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:1083)
            org.apache.commons.math3.fraction.BigFraction.bigDecimalValue(BigFraction.java:563) */
        bigFraction.bigDecimalValue(-255);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#bigDecimalValue(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigDecimal(numerator).divide(new BigDecimal(denominator), roundingMode);
 *  */
    @Test
    public void testBigDecimalValue_ThrowNullPointerException_11() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {-255, -255, -255};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.bigDecimalValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.toStrictBigInteger(BigDecimal.java:1069)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:1083)
            org.apache.commons.math3.fraction.BigFraction.bigDecimalValue(BigFraction.java:563) */
        bigFraction.bigDecimalValue(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.bigDecimalValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method bigDecimalValue()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#bigDecimalValue()}
 * @utbot.invokes {@link java.math.BigDecimal#divide(java.math.BigDecimal)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return new BigDecimal(numerator).divide(new BigDecimal(denominator));
 *  */
    @Test
    public void testBigDecimalValue_ThrowArithmeticException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = {-255, -255, -255};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.bigDecimalValue] produces [java.lang.ArithmeticException: Division undefined]
            java.base/java.math.BigDecimal.divide(BigDecimal.java:1754)
            org.apache.commons.math3.fraction.BigFraction.bigDecimalValue(BigFraction.java:544) */
        bigFraction.bigDecimalValue();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#bigDecimalValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigDecimal(numerator).divide(new BigDecimal(denominator));
 *  */
    @Test
    public void testBigDecimalValue_ThrowNullPointerException2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.bigDecimalValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.toStrictBigInteger(BigDecimal.java:1069)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:1083)
            org.apache.commons.math3.fraction.BigFraction.bigDecimalValue(BigFraction.java:544) */
        bigFraction.bigDecimalValue();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#bigDecimalValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigDecimal(numerator).divide(new BigDecimal(denominator));
 *  */
    @Test
    public void testBigDecimalValue_ThrowNullPointerException_12() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -1);
        int[] mag = {-3};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.bigDecimalValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.toStrictBigInteger(BigDecimal.java:1069)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:1083)
            org.apache.commons.math3.fraction.BigFraction.bigDecimalValue(BigFraction.java:544) */
        bigFraction.bigDecimalValue();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method bigDecimalValue()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#bigDecimalValue()}
     */
    @Test
    public void testBigDecimalValue() {
        BigFraction bigFraction = new BigFraction(4194305L);
        
        BigDecimal actual = bigFraction.bigDecimalValue();
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.getReducedFraction
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getReducedFraction(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFractionWithCornerCase() throws Exception  {
        BigFraction actual = BigFraction.getReducedFraction(0, 2);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.percentageValue
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method percentageValue()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#percentageValue()}
     */
    @Test
    public void testPercentageValue() {
        BigFraction bigFraction = new BigFraction(4194305L);
        
        double actual = bigFraction.percentageValue();
        
        org.junit.Assert.assertEquals(4.194305E8, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.getNumerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumerator()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#getNumerator()}
 * @utbot.returnsFrom {@code return numerator;}
 *  */
    @Test
    public void testGetNumerator_ReturnNumerator() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        BigInteger actual = bigFraction.getNumerator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.getDenominator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDenominator()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#getDenominator()}
 * @utbot.returnsFrom {@code return denominator;}
 *  */
    @Test
    public void testGetDenominator_ReturnDenominator() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        BigInteger actual = bigFraction.getDenominator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.getNumeratorAsInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumeratorAsInt()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#getNumeratorAsInt()}
 * @utbot.invokes {@link java.math.BigInteger#intValue()}
 * @utbot.returnsFrom {@code return numerator.intValue();}
 *  */
    @Test
    public void testGetNumeratorAsInt_BigIntegerIntValue() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {-255};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        int actual = bigFraction.getNumeratorAsInt();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNumeratorAsInt()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#getNumeratorAsInt()}
 * @utbot.invokes {@link java.math.BigInteger#intValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return numerator.intValue();
 *  */
    @Test
    public void testGetNumeratorAsInt_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.getNumeratorAsInt] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.getNumeratorAsInt(BigFraction.java:801) */
        bigFraction.getNumeratorAsInt();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.reciprocal
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reciprocal()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#reciprocal()}
     */
    @Test
    public void testReciprocal() throws Exception  {
        BigFraction bigFraction = new BigFraction(4194305L);
        
        BigFraction actual = bigFraction.reciprocal();
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#reciprocal()}
     */
    @Test
    public void testReciprocal1() throws Exception  {
        BigFraction bigFraction = new BigFraction(-2147483647, 1);
        
        BigFraction actual = bigFraction.reciprocal();
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math3.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math3.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.BigFraction.getNumeratorAsLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumeratorAsLong()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#getNumeratorAsLong()}
 * @utbot.invokes {@link java.math.BigInteger#longValue()}
 * @utbot.returnsFrom {@code return numerator.longValue();}
 *  */
    @Test
    public void testGetNumeratorAsLong_BigIntegerLongValue() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -1);
        int[] mag = {-255};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(numerator, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 1);
        setField(bigFraction, "org.apache.commons.math3.fraction.BigFraction", "numerator", numerator);
        
        long actual = bigFraction.getNumeratorAsLong();
        
        assertEquals(-4294967042L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNumeratorAsLong()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.BigFraction#getNumeratorAsLong()}
 * @utbot.invokes {@link java.math.BigInteger#longValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return numerator.longValue();
 *  */
    @Test
    public void testGetNumeratorAsLong_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math3.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math3.fraction.BigFraction.getNumeratorAsLong] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.BigFraction.getNumeratorAsLong(BigFraction.java:812) */
        bigFraction.getNumeratorAsLong();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields705341595494900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields705341595494900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass705341595499200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields705341595494900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass705341595499200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields705341595879700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields705341595879700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass705341595883400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields705341595879700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass705341595883400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields705341596696000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields705341596696000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass705341596697700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields705341596696000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass705341596697700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

