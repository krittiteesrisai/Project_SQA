package org.apache.commons.math.dfp;

import org.junit.Test;
import org.apache.commons.math.dfp.DfpField.RoundingMode;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_math_dfp_DfpTest {
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.toDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toDouble()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toDouble()}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testToDouble_ReturnDoubleNaN() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 2;
        
        double actual = dfp.toDouble();
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toDouble()}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testToDouble_ReturnDoubleNaN_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 3;
        
        double actual = dfp.toDouble();
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toDouble()}
 * @utbot.returnsFrom {@code return Double.POSITIVE_INFINITY;}
 *  */
    @Test
    public void testToDouble_ReturnDoublePOSITIVE_INFINITY_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        zero.sign = (byte) -127;
        zero.nans = (byte) 1;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        double actual = dfp.toDouble();
        
        assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toDouble()}
 * @utbot.returnsFrom {@code return Double.NEGATIVE_INFINITY;}
 *  */
    @Test
    public void testToDouble_ReturnDoubleNEGATIVE_INFINITY() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-255, 1};
        zero.mant = mant1;
        zero.sign = (byte) -1;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        double actual = dfp.toDouble();
        
        assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toDouble()}
 * @utbot.returnsFrom {@code return Double.POSITIVE_INFINITY;}
 *  */
    @Test
    public void testToDouble_ReturnDoublePOSITIVE_INFINITY_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, -255};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = -189;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpDec zero = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {3, 1};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.exp = -254;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        double actual = dfp.toDouble();
        
        assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toDouble()}
 * @utbot.returnsFrom {@code return Double.POSITIVE_INFINITY;}
 *  */
    @Test
    public void testToDouble_ReturnDoublePOSITIVE_INFINITY_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-254, 0};
        zero.mant = mant1;
        zero.sign = (byte) -127;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        double actual = dfp.toDouble();
        
        assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toDouble()}
 * @utbot.returnsFrom {@code return Double.POSITIVE_INFINITY;}
 *  */
    @Test
    public void testToDouble_ReturnDoublePOSITIVE_INFINITY() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-255, 1};
        zero.mant = mant1;
        zero.sign = java.lang.Byte.MIN_VALUE;
        zero.nans = (byte) -127;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        double actual = dfp.toDouble();
        
        assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toDouble()}
 * @utbot.returnsFrom {@code return Double.NEGATIVE_INFINITY;}
 *  */
    @Test
    public void testToDouble_ReturnDoubleNEGATIVE_INFINITY_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, -255};
        dfp.mant = mant;
        dfp.sign = (byte) 1;
        dfp.exp = 255;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-2147483646, 1};
        zero.mant = mant1;
        zero.sign = (byte) 1;
        zero.exp = 256;
        zero.nans = (byte) -127;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        double actual = dfp.toDouble();
        
        assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toDouble()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: lessThan(getZero())
 *  */
    @Test
    public void testToDouble_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2306) */
        dfp.toDouble();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: lessThan(getZero())
 *  */
    @Test
    public void testToDouble_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {3, 1};
        zero.mant = mant1;
        zero.sign = (byte) -127;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2306) */
        dfp.toDouble();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: lessThan(getZero())
 *  */
    @Test
    public void testToDouble_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, -255};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        zero.mant = mant1;
        zero.sign = (byte) -127;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:899)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2306) */
        dfp.toDouble();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: lessThan(getZero())
 *  */
    @Test
    public void testToDouble_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) -127;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2306) */
        dfp.toDouble();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: lessThan(getZero())
 *  */
    @Test
    public void testToDouble_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.nans = (byte) -127;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2306) */
        dfp.toDouble();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toDouble()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: lessThan(getZero())
 *  */
    @Test
    public void testToDouble_ThrowNullPointerException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2306) */
        dfp.toDouble();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toDouble()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#isNaN()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#getZero()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: lessThan(getZero())
 *  */
    @Test
    public void testToDouble_ThrowNullPointerException_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        zero.nans = java.lang.Byte.MIN_VALUE;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2319) */
        dfp.toDouble();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toDouble()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: lessThan(getZero())
 *  */
    @Test
    public void testToDouble_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2306) */
        dfp.toDouble();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toDouble()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: lessThan(getZero())
 *  */
    @Test
    public void testToDouble_ThrowNullPointerException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        zero.sign = (byte) -127;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2306) */
        dfp.toDouble();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toDouble()
    
    @Test
    public void testToDouble1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = java.lang.Byte.MIN_VALUE;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        double actual = dfp.toDouble();
        
        assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    
    @Test
    public void testToDouble2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {536870912, 536870912, 536870912, 536870912, 536870912, 536870912, 536870912, 42205185};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 924041216;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {3, 3, 3, 3, 3, 3, 3, 42205185};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.exp = 924041216;
        zero.nans = (byte) 64;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        double actual = dfp.toDouble();
        
        assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    @Test
    public void testToDouble3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpDec zero = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {1};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        double actual = dfp.toDouble();
        
        assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toDouble()
    
    @Test(expected = StackOverflowError.class)
    public void testToDouble4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.toDouble();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToDouble5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.toDouble();
    }
    
    @Test
    public void testToDouble6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        zero.nans = java.lang.Byte.MIN_VALUE;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2319) */
        dfp.toDouble();
    }
    
    @Test
    public void testToDouble7() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1, 3, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:899)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2306) */
        dfp.toDouble();
    }
    
    @Test
    public void testToDouble8() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = new int[33];
        mant[0] = -2147483646;
        mant[1] = -2147483646;
        mant[2] = -2147483646;
        mant[3] = -2147483646;
        mant[4] = -2147483646;
        mant[5] = -2147483646;
        mant[6] = -2147483646;
        mant[7] = -2147483646;
        mant[8] = -2147483646;
        mant[9] = -2147483646;
        mant[10] = -2147483646;
        mant[11] = -2147483646;
        mant[12] = -2147483646;
        mant[13] = -2147483646;
        mant[14] = -2147483646;
        mant[15] = -2147483646;
        mant[16] = -2147483646;
        mant[17] = -2147483646;
        mant[18] = -2147483646;
        mant[19] = -2147483646;
        mant[20] = -2147483646;
        mant[21] = -2147483646;
        mant[22] = -2147483646;
        mant[23] = -2147483646;
        mant[24] = -2147483646;
        mant[25] = -2147483646;
        mant[26] = -2147483646;
        mant[27] = -2147483646;
        mant[28] = -2147483646;
        mant[29] = -2147483646;
        mant[30] = -2147483646;
        mant[31] = -2147483646;
        mant[32] = 1;
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:899)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2306) */
        dfp.toDouble();
    }
    
    @Test
    public void testToDouble9() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2319) */
        dfp.toDouble();
    }
    
    @Test
    public void testToDouble10() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        zero.nans = (byte) 2;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.NullPointerException] */
        dfp.toDouble();
    }
    
    @Test
    public void testToDouble11() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        zero.nans = (byte) 2;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.NullPointerException] */
        dfp.toDouble();
    }
    
    @Test
    public void testToDouble12() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        zero.nans = (byte) 3;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.NullPointerException] */
        dfp.toDouble();
    }
    
    @Test
    public void testToDouble13() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 1;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.DfpMath.pow(DfpMath.java:215)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2331) */
        dfp.toDouble();
    }
    
    @Test
    public void testToDouble14() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = java.lang.Byte.MIN_VALUE;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.DfpMath.pow(DfpMath.java:215)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2331) */
        dfp.toDouble();
    }
    
    @Test
    public void testToDouble15() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        zero.mant = mant;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.DfpMath.pow(DfpMath.java:215)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2331) */
        dfp.toDouble();
    }
    
    @Test
    public void testToDouble16() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = java.lang.Byte.MIN_VALUE;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = java.lang.Byte.MIN_VALUE;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.DfpMath.pow(DfpMath.java:215)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2331) */
        dfp.toDouble();
    }
    
    @Test
    public void testToDouble17() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = java.lang.Byte.MIN_VALUE;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.DfpMath.pow(DfpMath.java:215)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2331) */
        dfp.toDouble();
    }
    
    @Test
    public void testToDouble18() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpDec zero = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {1};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.DfpMath.pow(DfpMath.java:215)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2331) */
        dfp.toDouble();
    }
    
    @Test
    public void testToDouble19() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpDec zero = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {0};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toDouble] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.DfpMath.pow(DfpMath.java:215)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2331) */
        dfp.toDouble();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.trunc
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method trunc(org.apache.commons.math.dfp.DfpField$RoundingMode)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#trunc(org.apache.commons.math.dfp.DfpField.RoundingMode)}
 * @utbot.executesCondition {@code (isNaN()): False}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (mant[mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (exp < 0): False}
 * @utbot.executesCondition {@code (exp >= mant.length): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return newInstance(this);}
 *  */
    @Test
    public void testTrunc_ExpGreaterOrEqualMantLength() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.exp = 2;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.trunc(null);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-255};
        expected.mant = mant1;
        expected.sign = (byte) -127;
        expected.exp = 2;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#trunc(org.apache.commons.math.dfp.DfpField.RoundingMode)}
 * @utbot.executesCondition {@code (isNaN()): False}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (mant[mant.length - 1] == 0): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return newInstance(this);}
 *  */
    @Test
    public void testTrunc_MantLength1OfMantEqualsZero() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.trunc(null);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#trunc(org.apache.commons.math.dfp.DfpField.RoundingMode)}
 * @utbot.executesCondition {@code (isNaN()): False}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (mant[mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (exp < 0): False}
 * @utbot.executesCondition {@code (exp >= mant.length): False}
 * @utbot.executesCondition {@code (changed): False}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length - result.exp; i++)} twice
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testTrunc_NotChanged() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, -255};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 1;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.trunc(null);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0, -255};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.exp = 1;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#trunc(org.apache.commons.math.dfp.DfpField.RoundingMode)}
 * @utbot.executesCondition {@code (isNaN()): False}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return newInstance(this);}
 *  */
    @Test
    public void testTrunc_NansEqualsINFINITE() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.trunc(null);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#trunc(org.apache.commons.math.dfp.DfpField.RoundingMode)}
 * @utbot.executesCondition {@code (isNaN()): True}
 * @utbot.returnsFrom {@code return newInstance(this);}
 *  */
    @Test
    public void testTrunc_IsNaN() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 2;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.trunc(null);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 2;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#trunc(org.apache.commons.math.dfp.DfpField.RoundingMode)}
 * @utbot.executesCondition {@code (isNaN()): True}
 * @utbot.returnsFrom {@code return newInstance(this);}
 *  */
    @Test
    public void testTrunc_IsNaN_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 3;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.trunc(null);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#trunc(org.apache.commons.math.dfp.DfpField.RoundingMode)}
 * @utbot.executesCondition {@code (isNaN()): False}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (mant[mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (exp < 0): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#setIEEEFlagsBits(int)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#getZero()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testTrunc_ExpLessThanZero() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.exp = -1;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(field, "org.apache.commons.math.dfp.DfpField", "ieeeFlags", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.trunc(null);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {};
        expected.mant = mant2;
        expected.sign = (byte) -127;
        expected.exp = -255;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(-239, finalDfpFieldIeeeFlags);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method trunc(org.apache.commons.math.dfp.DfpField$RoundingMode)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#trunc(org.apache.commons.math.dfp.DfpField.RoundingMode)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: mant[mant.length - 1] == 0
 *  */
    @Test
    public void testTrunc_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.nans = (byte) -127;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.trunc] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.trunc(Dfp.java:969) */
        dfp.trunc(null);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#trunc(org.apache.commons.math.dfp.DfpField.RoundingMode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: mant[mant.length - 1] == 0
 *  */
    @Test
    public void testTrunc_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.trunc] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.trunc(Dfp.java:969) */
        dfp.trunc(null);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#trunc(org.apache.commons.math.dfp.DfpField.RoundingMode)}
 * @utbot.executesCondition {@code (mant[mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (exp < 0): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#setIEEEFlagsBits(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: field.setIEEEFlagsBits(DfpField.FLAG_INEXACT);
 *  */
    @Test
    public void testTrunc_ThrowNullPointerException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.exp = -1;
        dfp.nans = (byte) -127;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.trunc] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.trunc(Dfp.java:977) */
        dfp.trunc(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method trunc(org.apache.commons.math.dfp.DfpField$RoundingMode)
    
    @Test
    public void testTrunc1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = new int[35];
        mant[0] = 1;
        mant[34] = 1;
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 32;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpField.RoundingMode roundingMode = DfpField.RoundingMode.ROUND_FLOOR;
        
        Dfp actual = dfp.trunc(roundingMode);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = new int[35];
        mant1[34] = 1;
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.exp = 32;
        expected.nans = java.lang.Byte.MIN_VALUE;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method trunc(org.apache.commons.math.dfp.DfpField$RoundingMode)
    
    @Test(expected = StackOverflowError.class)
    public void testTrunc2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = new int[16];
        mant[15] = 1;
        dfp.mant = mant;
        dfp.exp = Integer.MIN_VALUE;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpField.RoundingMode roundingMode = DfpField.RoundingMode.ROUND_FLOOR;
        
        dfp.trunc(roundingMode);
    }
    
    @Test
    public void testTrunc3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = new int[37];
        mant[1] = 1;
        mant[2] = 1;
        mant[36] = 1;
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 34;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpField.RoundingMode roundingMode = DfpField.RoundingMode.ROUND_HALF_ODD;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.trunc] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1333)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:528)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:612)
            org.apache.commons.math.dfp.Dfp.trunc(Dfp.java:1018) */
        dfp.trunc(roundingMode);
    }
    
    @Test
    public void testTrunc4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = new int[37];
        mant[1] = 1;
        mant[36] = 2;
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 34;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.trunc] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.trunc(Dfp.java:1001) */
        dfp.trunc(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.greaterThan
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method greaterThan(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) > 0;}
 *  */
    @Test
    public void testGreaterThan_ReturnCompareLessOrEqualZero() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) -127;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.greaterThan(dfp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) > 0;}
 *  */
    @Test
    public void testGreaterThan_ReturnCompareLessOrEqualZero_6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) 1;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.greaterThan(dfp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) > 0;}
 *  */
    @Test
    public void testGreaterThan_ReturnCompareLessOrEqualZero_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {-255, 1};
        dfpDec.mant = mant1;
        dfpDec.sign = (byte) 0;
        dfpDec.nans = (byte) 1;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.greaterThan(dfpDec);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) > 0;}
 *  */
    @Test
    public void testGreaterThan_ReturnCompareLessOrEqualZero_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {-254, 0};
        dfpDec.mant = mant1;
        dfpDec.nans = (byte) 0;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.greaterThan(dfpDec);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) > 0;}
 *  */
    @Test
    public void testGreaterThan_ReturnCompareLessOrEqualZero_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.sign = (byte) 1;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -254);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {0};
        dfpDec.mant = mant1;
        dfpDec.sign = (byte) 1;
        dfpDec.nans = (byte) -126;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.greaterThan(dfpDec);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) > 0;}
 *  */
    @Test
    public void testGreaterThan_ReturnCompareLessOrEqualZero_4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-254, 0};
        dfp1.mant = mant1;
        dfp1.sign = java.lang.Byte.MIN_VALUE;
        dfp1.nans = (byte) -127;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.greaterThan(dfp1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) > 0;}
 *  */
    @Test
    public void testGreaterThan_ReturnCompareLessOrEqualZero_5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, -255};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 255;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {3, 1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.exp = 256;
        dfp1.nans = (byte) -127;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.greaterThan(dfp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) > 0;}
 *  */
    @Test
    public void testGreaterThan_ReturnCompareLessOrEqualZero_7() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-252, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 1;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 1;
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.greaterThan(dfp1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) > 0;}
 *  */
    @Test
    public void testGreaterThan_ReturnCompareLessOrEqualZero_8() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, -255};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = -157;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {-2147483646, 1};
        dfpDec.mant = mant1;
        dfpDec.sign = (byte) 0;
        dfpDec.exp = -158;
        dfpDec.nans = (byte) -126;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.greaterThan(dfpDec);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method greaterThan(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return compare(this, x) > 0;
 *  */
    @Test
    public void testGreaterThan_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.greaterThan] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794) */
        dfp.greaterThan(dfp);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return compare(this, x) > 0;
 *  */
    @Test
    public void testGreaterThan_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        dfp1.mant = mant1;
        dfp1.nans = (byte) -126;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.greaterThan] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794) */
        dfp.greaterThan(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return compare(this, x) > 0;
 *  */
    @Test
    public void testGreaterThan_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-2147483646, 1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) 6;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.greaterThan] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794) */
        dfp.greaterThan(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return compare(this, x) > 0;
 *  */
    @Test
    public void testGreaterThan_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        dfp1.mant = mant1;
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) -127;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.greaterThan] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794) */
        dfp.greaterThan(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return compare(this, x) > 0;
 *  */
    @Test
    public void testGreaterThan_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, -255};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) -127;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.greaterThan] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:899)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794) */
        dfp.greaterThan(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testGreaterThan_ThrowNullPointerException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.greaterThan] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:779) */
        dfp.greaterThan(null);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testGreaterThan_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.greaterThan] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:779) */
        dfp.greaterThan(null);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testGreaterThan_ThrowNullPointerException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.greaterThan] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:779) */
        dfp.greaterThan(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return compare(this, x) > 0;
 *  */
    @Test
    public void testGreaterThan_ThrowNullPointerException_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) -126;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.greaterThan] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794) */
        dfp.greaterThan(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return compare(this, x) > 0;
 *  */
    @Test
    public void testGreaterThan_ThrowNullPointerException_4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) -127;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.greaterThan] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794) */
        dfp.greaterThan(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#greaterThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return compare(this, x) > 0;
 *  */
    @Test
    public void testGreaterThan_ThrowNullPointerException_5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.greaterThan] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794) */
        dfp.greaterThan(dfp);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method greaterThan(org.apache.commons.math.dfp.Dfp)
    
    @Test
    public void testGreaterThan1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.mant = mant;
        dfp1.sign = (byte) 0;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.greaterThan(dfp1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testGreaterThan2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        boolean actual = dfp.greaterThan(dfp1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testGreaterThan3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", 65536);
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        boolean actual = dfp.greaterThan(dfp1);
        
        assertFalse(actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(1, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testGreaterThan4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 2;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.greaterThan(dfp1);
        
        assertFalse(actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        DfpField dfp1Field = ((DfpField) getFieldValue(dfp1, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfp1FieldIeeeFlags = ((Integer) getFieldValue(dfp1Field, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(1, finalDfpFieldIeeeFlags);
        
        org.junit.Assert.assertEquals(1, finalDfp1FieldIeeeFlags);
    }
    
    @Test
    public void testGreaterThan5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 2;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.greaterThan(dfp);
        
        assertFalse(actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        DfpField dfpField1 = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags1 = ((Integer) getFieldValue(dfpField1, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(1, finalDfpFieldIeeeFlags);
        
        org.junit.Assert.assertEquals(1, finalDfpFieldIeeeFlags1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method greaterThan(org.apache.commons.math.dfp.Dfp)
    
    @Test(expected = StackOverflowError.class)
    public void testGreaterThan6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        dfp.greaterThan(dfp1);
    }
    
    @Test
    public void testGreaterThan7() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1, 3, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.greaterThan] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:899)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794) */
        dfp.greaterThan(dfp1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGreaterThan8() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", Integer.MIN_VALUE);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 2;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.greaterThan(dfp1);
    }
    
    @Test
    public void testGreaterThan9() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 3;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.greaterThan] produces [java.lang.NullPointerException] */
        dfp.greaterThan(dfp);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.log10K
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method log10K()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#log10K()}
 * @utbot.returnsFrom {@code return exp - 1;}
 *  */
    @Test
    public void testLog10K_ReturnExpMinus1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = -255;
        
        int actual = dfp.log10K();
        
        org.junit.Assert.assertEquals(-256, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.getOne
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOne()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#getOne()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#getOne()}
 * @utbot.returnsFrom {@code return field.getOne();}
 *  */
    @Test
    public void testGetOne_DfpFieldGetOne() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.getOne();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOne()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#getOne()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#getOne()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return field.getOne();
 *  */
    @Test
    public void testGetOne_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.getOne] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.getOne(Dfp.java:654) */
        dfp.getOne();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.getTwo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTwo()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#getTwo()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#getTwo()}
 * @utbot.returnsFrom {@code return field.getTwo();}
 *  */
    @Test
    public void testGetTwo_DfpFieldGetTwo() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.getTwo();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTwo()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#getTwo()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#getTwo()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return field.getTwo();
 *  */
    @Test
    public void testGetTwo_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.getTwo] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.getTwo(Dfp.java:661) */
        dfp.getTwo();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.getRadixDigits
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRadixDigits()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#getRadixDigits()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#getRadixDigits()}
 * @utbot.returnsFrom {@code return field.getRadixDigits();}
 *  */
    @Test
    public void testGetRadixDigits_DfpFieldGetRadixDigits() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.getRadixDigits();
        
        org.junit.Assert.assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRadixDigits()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#getRadixDigits()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#getRadixDigits()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return field.getRadixDigits();
 *  */
    @Test
    public void testGetRadixDigits_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.getRadixDigits] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.getRadixDigits(Dfp.java:640) */
        dfp.getRadixDigits();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.lessThan
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lessThan(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) < 0;}
 *  */
    @Test
    public void testLessThan_ReturnCompareGreaterOrEqualZero_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) 1;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.lessThan(dfp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) < 0;}
 *  */
    @Test
    public void testLessThan_ReturnCompareGreaterOrEqualZero_6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) 0;
        dfp1.nans = (byte) 1;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.lessThan(dfp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) < 0;}
 *  */
    @Test
    public void testLessThan_ReturnCompareGreaterOrEqualZero() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-254, 0};
        dfp1.mant = mant1;
        dfp1.sign = java.lang.Byte.MIN_VALUE;
        dfp1.nans = (byte) -127;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.lessThan(dfp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) < 0;}
 *  */
    @Test
    public void testLessThan_ReturnCompareGreaterOrEqualZero_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {-254, 0};
        dfpDec.mant = mant1;
        dfpDec.nans = (byte) 0;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.lessThan(dfpDec);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) < 0;}
 *  */
    @Test
    public void testLessThan_ReturnCompareGreaterOrEqualZero_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        dfpDec.mant = mant;
        dfpDec.sign = (byte) 0;
        dfpDec.nans = (byte) 0;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.lessThan(dfpDec);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) < 0;}
 *  */
    @Test
    public void testLessThan_ReturnCompareGreaterOrEqualZero_4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, -255};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = -189;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {3, 1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.exp = -254;
        dfp1.nans = (byte) -127;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.lessThan(dfp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) < 0;}
 *  */
    @Test
    public void testLessThan_ReturnCompareGreaterOrEqualZero_5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-255, 1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.nans = (byte) -126;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.lessThan(dfp1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) < 0;}
 *  */
    @Test
    public void testLessThan_ReturnCompareGreaterOrEqualZero_7() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-254, 0};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.nans = (byte) -127;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.lessThan(dfp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) < 0;}
 *  */
    @Test
    public void testLessThan_ReturnCompareGreaterOrEqualZero_8() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, -255};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 1073741823;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {0, 1};
        dfpDec.mant = mant1;
        dfpDec.sign = (byte) 0;
        dfpDec.exp = 1073741824;
        dfpDec.nans = (byte) -126;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.lessThan(dfpDec);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) < 0;}
 *  */
    @Test
    public void testLessThan_ReturnCompareGreaterOrEqualZero_9() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, -255};
        dfp.mant = mant;
        dfp.sign = (byte) 1;
        dfp.exp = 67108863;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 1;
        dfp1.exp = 67108864;
        dfp1.nans = (byte) -127;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.lessThan(dfp1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) < 0;}
 *  */
    @Test
    public void testLessThan_ReturnCompareGreaterOrEqualZero_10() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-2};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-3, 0};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.nans = (byte) -127;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.lessThan(dfp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return compare(this, x) < 0;}
 *  */
    @Test
    public void testLessThan_ReturnCompareGreaterOrEqualZero_11() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-255, 0};
        dfp1.mant = mant1;
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) -127;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.lessThan(dfp1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lessThan(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return compare(this, x) < 0;
 *  */
    @Test
    public void testLessThan_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.lessThan] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769) */
        dfp.lessThan(dfp);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return compare(this, x) < 0;
 *  */
    @Test
    public void testLessThan_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        dfp1.mant = mant1;
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) -126;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.lessThan] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769) */
        dfp.lessThan(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return compare(this, x) < 0;
 *  */
    @Test
    public void testLessThan_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-2147483646, 1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) 6;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.lessThan] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769) */
        dfp.lessThan(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return compare(this, x) < 0;
 *  */
    @Test
    public void testLessThan_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        dfp1.mant = mant1;
        dfp1.nans = (byte) -126;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.lessThan] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769) */
        dfp.lessThan(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return compare(this, x) < 0;
 *  */
    @Test
    public void testLessThan_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = new int[33];
        mant[0] = 1;
        mant[1] = -255;
        mant[2] = -255;
        mant[3] = -255;
        mant[4] = -255;
        mant[5] = -255;
        mant[6] = -255;
        mant[7] = -255;
        mant[8] = -255;
        mant[9] = -255;
        mant[10] = -255;
        mant[11] = -255;
        mant[12] = -255;
        mant[13] = -255;
        mant[14] = -255;
        mant[15] = -255;
        mant[16] = -255;
        mant[17] = 1;
        mant[18] = -255;
        mant[19] = -255;
        mant[20] = -255;
        mant[21] = -255;
        mant[22] = -255;
        mant[23] = -255;
        mant[24] = -255;
        mant[25] = -255;
        mant[26] = -255;
        mant[27] = -255;
        mant[28] = -255;
        mant[29] = -255;
        mant[30] = -255;
        mant[31] = -255;
        mant[32] = -255;
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        dfp1.mant = mant1;
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) -127;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.lessThan] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:899)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769) */
        dfp.lessThan(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return compare(this, x) < 0;
 *  */
    @Test
    public void testLessThan_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = new int[33];
        mant[0] = -255;
        mant[1] = -255;
        mant[2] = -255;
        mant[3] = -255;
        mant[4] = -255;
        mant[5] = -255;
        mant[6] = -255;
        mant[7] = -255;
        mant[8] = -255;
        mant[9] = -255;
        mant[10] = -255;
        mant[11] = 1;
        mant[12] = -255;
        mant[13] = -255;
        mant[14] = -255;
        mant[15] = -255;
        mant[16] = -255;
        mant[17] = -255;
        mant[18] = -255;
        mant[19] = -255;
        mant[20] = -255;
        mant[21] = -255;
        mant[22] = -255;
        mant[23] = -255;
        mant[24] = -255;
        mant[25] = -255;
        mant[26] = -255;
        mant[27] = -255;
        mant[28] = -255;
        mant[29] = -255;
        mant[30] = -255;
        mant[31] = -255;
        mant[32] = -255;
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.exp = -110;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) -127;
        dfp1.exp = -110;
        dfp1.nans = (byte) -126;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.lessThan] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:899)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769) */
        dfp.lessThan(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return compare(this, x) < 0;
 *  */
    @Test
    public void testLessThan_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, -255};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {1};
        dfpDec.mant = mant1;
        dfpDec.sign = (byte) -127;
        dfpDec.nans = (byte) -127;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.lessThan] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:899)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769) */
        dfp.lessThan(dfpDec);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testLessThan_ThrowNullPointerException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.lessThan] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:754) */
        dfp.lessThan(null);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testLessThan_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.lessThan] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:754) */
        dfp.lessThan(null);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testLessThan_ThrowNullPointerException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.lessThan] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:754) */
        dfp.lessThan(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return compare(this, x) < 0;
 *  */
    @Test
    public void testLessThan_ThrowNullPointerException_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) -126;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.lessThan] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769) */
        dfp.lessThan(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return compare(this, x) < 0;
 *  */
    @Test
    public void testLessThan_ThrowNullPointerException_4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) -127;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.lessThan] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769) */
        dfp.lessThan(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#lessThan(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return compare(this, x) < 0;
 *  */
    @Test
    public void testLessThan_ThrowNullPointerException_5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.lessThan] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769) */
        dfp.lessThan(dfp);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method lessThan(org.apache.commons.math.dfp.Dfp)
    
    @Test(expected = StackOverflowError.class)
    public void testLessThan1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 2;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", 536870912);
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.lessThan(dfp1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testLessThan2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", Integer.MIN_VALUE);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 3;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.lessThan(dfp1);
    }
    
    @Test
    public void testLessThan3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.lessThan] produces [java.lang.NullPointerException] */
        dfp.lessThan(dfp1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.power10K
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method power10K(int)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#power10K(int)}
 * @utbot.returnsFrom {@code return d;}
 *  */
    @Test
    public void testPower10K_ReturnD() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp one = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        one.mant = mant;
        one.sign = (byte) -127;
        one.exp = -255;
        one.nans = (byte) -127;
        setField(one, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "one", one);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.power10K(-255);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) -127;
        expected.exp = -254;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#power10K(int)}
 * @utbot.returnsFrom {@code return d;}
 *  */
    @Test
    public void testPower10K_ReturnD_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        DfpDec zero = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        DfpDec one = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -2);
        setField(one, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "one", one);
        setField(field, "org.apache.commons.math.dfp.DfpField", "ieeeFlags", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.power10K(-255);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) -127;
        expected.exp = -254;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.power10
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method power10(int)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#power10(int)}
 * @utbot.executesCondition {@code (e >= 0): True}
 * @utbot.activatesSwitch {@code switch((e % 4 + 4) % 4) case: 0}
 * @utbot.returnsFrom {@code return d;}
 *  */
    @Test
    public void testPower10_EGreaterOrEqualZero() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp one = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        one.mant = mant;
        one.sign = (byte) -127;
        one.exp = -255;
        one.nans = (byte) -127;
        setField(one, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "one", one);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.power10(0);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) -127;
        expected.exp = 1;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#power10(int)}
 * @utbot.executesCondition {@code (e >= 0): False}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#multiply(int)}
 * @utbot.activatesSwitch {@code switch((e % 4 + 4) % 4) case: 2}
 * @utbot.returnsFrom {@code return d;}
 *  */
    @Test
    public void testPower10_DfpMultiply() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp one = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        one.mant = mant;
        one.sign = (byte) -127;
        one.exp = -255;
        one.nans = (byte) 2;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(one, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "one", one);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.power10(-254);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) -127;
        expected.exp = -63;
        expected.nans = (byte) 2;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#power10(int)}
 * @utbot.executesCondition {@code (e >= 0): False}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#multiply(int)}
 * @utbot.activatesSwitch {@code switch((e % 4 + 4) % 4) case: 1}
 * @utbot.returnsFrom {@code return d;}
 *  */
    @Test
    public void testPower10_DfpMultiply_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp one = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        one.mant = mant;
        one.sign = (byte) -127;
        one.exp = -255;
        one.nans = (byte) 2;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(one, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "one", one);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.power10(-255);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) -127;
        expected.exp = -63;
        expected.nans = (byte) 2;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method power10(int)
    
    @Test
    public void testPower101() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp one = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        one.mant = mant;
        one.sign = (byte) 0;
        one.nans = (byte) 1;
        setField(one, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "one", one);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.power10(-2147483646);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.exp = -536870911;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testPower102() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp one = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        one.mant = mant;
        one.sign = (byte) 0;
        one.nans = (byte) 1;
        setField(one, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "one", one);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.power10(-2147483645);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.exp = -536870911;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testPower103() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp one = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        one.mant = mant;
        one.sign = (byte) 0;
        one.nans = (byte) 1;
        setField(one, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "one", one);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.power10(-2147483647);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.exp = -536870911;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testPower104() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp one = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        one.mant = mant;
        one.sign = (byte) 0;
        one.nans = (byte) 3;
        setField(one, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "one", one);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.power10(-2147483645);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.exp = -536870911;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testPower105() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        DfpDec one = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", 2048);
        setField(one, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "one", one);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.power10(0);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.exp = 1;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(1, finalDfpFieldIeeeFlags);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method power10(int)
    
    @Test(expected = StackOverflowError.class)
    public void testPower106() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(field, "org.apache.commons.math.dfp.DfpField", "one", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.power10(0);
    }
    
    @Test
    public void testPower107() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp one = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        one.mant = mant;
        one.sign = (byte) 0;
        one.nans = (byte) 0;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(one, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "one", one);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.power10] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1563)
            org.apache.commons.math.dfp.Dfp.power10(Dfp.java:1128) */
        dfp.power10(2);
    }
    
    @Test
    public void testPower108() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp one = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {313532629};
        one.mant = mant;
        one.sign = (byte) 0;
        one.nans = java.lang.Byte.MIN_VALUE;
        setField(one, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "one", one);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.power10] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1333)
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1567)
            org.apache.commons.math.dfp.Dfp.power10(Dfp.java:1131) */
        dfp.power10(-2147483645);
    }
    
    @Test
    public void testPower109() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp one = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        one.mant = mant;
        one.sign = (byte) 0;
        one.nans = java.lang.Byte.MIN_VALUE;
        setField(one, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "one", one);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.power10] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1333)
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1567)
            org.apache.commons.math.dfp.Dfp.power10(Dfp.java:1125) */
        dfp.power10(-2147483647);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.align
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method align(int)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#align(int)}
 * @utbot.executesCondition {@code (adiff < 0): False}
 * @utbot.executesCondition {@code (diff == 0): True}
 *  */
    @Test
    public void testAlign_DiffEqualsZero() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        int actual = dfp.align(0);
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#align(int)}
 * @utbot.executesCondition {@code (adiff < 0): True}
 * @utbot.executesCondition {@code (diff == 0): False}
 * @utbot.executesCondition {@code (adiff > (mant.length + 1)): False}
 * @utbot.executesCondition {@code (inexact): False}
 * @utbot.returnsFrom {@code return lostdigit;}
 *  */
    @Test
    public void testAlign_NotInexact() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = new int[11];
        dfp.mant = mant;
        dfp.exp = 2063111168;
        
        int actual = dfp.align(-84372480);
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#align(int)}
 * @utbot.executesCondition {@code (adiff < 0): False}
 * @utbot.executesCondition {@code (diff == 0): False}
 * @utbot.executesCondition {@code (adiff > (mant.length + 1)): False}
 * @utbot.executesCondition {@code (inexact): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < adiff; i++)} once
 * @utbot.returnsFrom {@code return lostdigit;}
 *  */
    @Test
    public void testAlign_DiffGreaterOrEqualZero() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, -255};
        dfp.mant = mant;
        dfp.exp = -90;
        
        int actual = dfp.align(-91);
        
        org.junit.Assert.assertEquals(0, actual);
        
        int finalDfpMant0 = dfp.mant[0];
        int finalDfpExp = dfp.exp;
        
        org.junit.Assert.assertEquals(0, finalDfpMant0);
        
        org.junit.Assert.assertEquals(-91, finalDfpExp);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#align(int)}
 * @utbot.executesCondition {@code (adiff < 0): True}
 * @utbot.executesCondition {@code (diff == 0): False}
 * @utbot.executesCondition {@code (adiff > (mant.length + 1)): False}
 * @utbot.executesCondition {@code (inexact): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < adiff; i++)} once
 * @utbot.returnsFrom {@code return lostdigit;}
 *  */
    @Test
    public void testAlign_NotInexact_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, 0};
        dfp.mant = mant;
        dfp.exp = 255;
        
        int actual = dfp.align(256);
        
        org.junit.Assert.assertEquals(0, actual);
        
        int finalDfpExp = dfp.exp;
        
        org.junit.Assert.assertEquals(256, finalDfpExp);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#align(int)}
 * @utbot.executesCondition {@code (adiff < 0): True}
 * @utbot.executesCondition {@code (diff == 0): False}
 * @utbot.executesCondition {@code (adiff > (mant.length + 1)): False}
 * @utbot.executesCondition {@code (inexact): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#setIEEEFlagsBits(int)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < adiff; i++)} twice
 * @utbot.returnsFrom {@code return lostdigit;}
 *  */
    @Test
    public void testAlign_Inexact() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.exp = -128;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.align(-126);
        
        org.junit.Assert.assertEquals(0, actual);
        
        int finalDfpMant0 = dfp.mant[0];
        int finalDfpExp = dfp.exp;
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(0, finalDfpMant0);
        
        org.junit.Assert.assertEquals(-126, finalDfpExp);
        
        org.junit.Assert.assertEquals(16, finalDfpFieldIeeeFlags);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#align(int)}
 * @utbot.executesCondition {@code (adiff < 0): True}
 * @utbot.executesCondition {@code (diff == 0): False}
 * @utbot.executesCondition {@code (adiff > (mant.length + 1)): True}
 * @utbot.invokes {@link java.util.Arrays#fill(int[],int)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#setIEEEFlagsBits(int)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 *  */
    @Test
    public void testAlign_AdiffGreaterThanMantLengthPlus1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.exp = -18;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "ieeeFlags", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.align(-2);
        
        org.junit.Assert.assertEquals(0, actual);
        
        int finalDfpExp = dfp.exp;
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(-2, finalDfpExp);
        
        org.junit.Assert.assertEquals(17, finalDfpFieldIeeeFlags);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method align(int)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#align(int)}
 * @utbot.executesCondition {@code (adiff < 0): True}
 * @utbot.executesCondition {@code (adiff > (mant.length + 1)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < adiff; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lostdigit = mant[0];
 *  */
    @Test
    public void testAlign_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.exp = -4;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.align] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.align(Dfp.java:730) */
        dfp.align(-3);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#align(int)}
 * @utbot.executesCondition {@code (adiff < 0): False}
 * @utbot.executesCondition {@code (adiff > (mant.length + 1)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < adiff; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: shiftLeft();
 *  */
    @Test
    public void testAlign_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.exp = -2;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.align] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.shiftLeft(Dfp.java:670)
            org.apache.commons.math.dfp.Dfp.align(Dfp.java:734) */
        dfp.align(-3);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#align(int)}
 * @utbot.executesCondition {@code (adiff < 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: adiff > (mant.length + 1)
 *  */
    @Test
    public void testAlign_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = -127;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.align] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.align(Dfp.java:709) */
        dfp.align(-130);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#align(int)}
 * @utbot.executesCondition {@code (adiff < 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: adiff > (mant.length + 1)
 *  */
    @Test
    public void testAlign_ThrowNullPointerException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = 255;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.align] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.align(Dfp.java:709) */
        dfp.align(256);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#align(int)}
 * @utbot.executesCondition {@code (adiff < 0): True}
 * @utbot.executesCondition {@code (adiff > (mant.length + 1)): False}
 * @utbot.executesCondition {@code (inexact): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#setIEEEFlagsBits(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < adiff; i++)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: field.setIEEEFlagsBits(DfpField.FLAG_INEXACT);
 *  */
    @Test
    public void testAlign_ThrowNullPointerException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.exp = -128;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.align] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.align(Dfp.java:739) */
        dfp.align(-126);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#align(int)}
 * @utbot.executesCondition {@code (adiff < 0): True}
 * @utbot.executesCondition {@code (adiff > (mant.length + 1)): True}
 * @utbot.invokes {@link java.util.Arrays#fill(int[],int)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#setIEEEFlagsBits(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: field.setIEEEFlagsBits(DfpField.FLAG_INEXACT);
 *  */
    @Test
    public void testAlign_ThrowNullPointerException_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.exp = 14;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.align] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.align(Dfp.java:714) */
        dfp.align(30);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.unequal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unequal(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#unequal(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testUnequal_ReturnFalse_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 3;
        
        boolean actual = dfp.unequal(dfp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#unequal(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testUnequal_ReturnFalse() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 3;
        
        boolean actual = dfp.unequal(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#unequal(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testUnequal_ReturnFalse_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 2;
        
        boolean actual = dfp.unequal(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#unequal(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testUnequal_ReturnFalse_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -112;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) -127;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        boolean actual = dfp.unequal(dfp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#unequal(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return greaterThan(x) || lessThan(x);}
 *  */
    @Test
    public void testUnequal_ReturnGreaterThanOrLessThan() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 1;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-255, 1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 1;
        dfp1.nans = (byte) 0;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        boolean actual = dfp.unequal(dfp1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#unequal(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return greaterThan(x) || lessThan(x);}
 *  */
    @Test
    public void testUnequal_ReturnGreaterThanOrLessThan_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {-255, 1};
        dfpDec.mant = mant1;
        dfpDec.sign = (byte) -1;
        dfpDec.nans = (byte) 1;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        boolean actual = dfp.unequal(dfpDec);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#unequal(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return greaterThan(x) || lessThan(x);}
 *  */
    @Test
    public void testUnequal_ReturnGreaterThanOrLessThan_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) -126;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-254, 0};
        dfp1.mant = mant1;
        dfp1.sign = java.lang.Byte.MIN_VALUE;
        dfp1.nans = (byte) -126;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.unequal(dfp1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unequal(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#unequal(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return greaterThan(x) || lessThan(x);
 *  */
    @Test
    public void testUnequal_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.unequal] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794)
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:849) */
        dfp.unequal(dfp);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#unequal(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return greaterThan(x) || lessThan(x);
 *  */
    @Test
    public void testUnequal_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        dfp1.mant = mant1;
        dfp1.nans = (byte) -127;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.unequal] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794)
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:849) */
        dfp.unequal(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#unequal(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return greaterThan(x) || lessThan(x);
 *  */
    @Test
    public void testUnequal_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        dfp1.mant = mant1;
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) -127;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.unequal] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794)
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:849) */
        dfp.unequal(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#unequal(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return greaterThan(x) || lessThan(x);
 *  */
    @Test
    public void testUnequal_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, -255};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) -126;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.unequal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:899)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794)
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:849) */
        dfp.unequal(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#unequal(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isNaN() || x.isNaN() || field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testUnequal_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.unequal] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:845) */
        dfp.unequal(null);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#unequal(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isNaN() || x.isNaN() || field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testUnequal_ThrowNullPointerException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) -127;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.unequal] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:845) */
        dfp.unequal(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#unequal(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isNaN() || x.isNaN() || field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testUnequal_ThrowNullPointerException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) -127;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.unequal] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:845) */
        dfp.unequal(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#unequal(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return greaterThan(x) || lessThan(x);
 *  */
    @Test
    public void testUnequal_ThrowNullPointerException_4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) -127;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.unequal] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794)
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:849) */
        dfp.unequal(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#unequal(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return greaterThan(x) || lessThan(x);
 *  */
    @Test
    public void testUnequal_ThrowNullPointerException_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.unequal] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794)
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:849) */
        dfp.unequal(dfp);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method unequal(org.apache.commons.math.dfp.Dfp)
    
    @Test
    public void testUnequal1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {Integer.MIN_VALUE};
        dfpDec.mant = mant1;
        dfpDec.sign = (byte) 0;
        dfpDec.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        boolean actual = dfp.unequal(dfpDec);
        
        assertFalse(actual);
    }
    
    @Test
    public void testUnequal2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.mant = mant;
        dfp1.sign = (byte) 0;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.unequal(dfp1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testUnequal3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 32769;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        dfpDec.mant = mant;
        dfpDec.sign = (byte) 0;
        dfpDec.exp = -2147450880;
        dfpDec.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        boolean actual = dfp.unequal(dfpDec);
        
        assertFalse(actual);
    }
    
    @Test
    public void testUnequal4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.mant = mant;
        dfp1.sign = (byte) 0;
        dfp1.exp = 1;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.unequal(dfp1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testUnequal5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.mant = mant;
        dfp1.sign = (byte) 0;
        dfp1.nans = (byte) 1;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.unequal(dfp1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testUnequal6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {1, -2147483646, 0};
        dfpDec.mant = mant1;
        dfpDec.sign = (byte) 0;
        dfpDec.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        boolean actual = dfp.unequal(dfpDec);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method unequal(org.apache.commons.math.dfp.Dfp)
    
    @Test
    public void testUnequal7() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1, 3, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.unequal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:899)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794)
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:849) */
        dfp.unequal(dfp1);
    }
    
    @Test
    public void testUnequal8() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = new int[33];
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.unequal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:899)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794)
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:849) */
        dfp.unequal(dfp1);
    }
    
    @Test
    public void testUnequal9() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = new int[33];
        mant1[32] = 1;
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.unequal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794)
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:849) */
        dfp.unequal(dfp1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.trap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method trap(int, java.lang.String, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#trap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return def;}
 *  */
    @Test
    public void testTrap_ReturnDef() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        Dfp actual = dfp.trap(-255, null, null, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.classify
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method classify()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#classify()}
 * @utbot.returnsFrom {@code return nans;}
 *  */
    @Test
    public void testClassify_ReturnNans() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        
        int actual = dfp.classify();
        
        org.junit.Assert.assertEquals(-127, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.dfp2sci
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dfp2sci()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dfp2sci()}
 * @utbot.executesCondition {@code (sign == -1): False}
 * @utbot.returnsFrom {@code return new String(outputbuffer, 0, 5);}
 *  */
    @Test
    public void testDfp2sci_SignNotEqualsNegative1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        
        String actual = dfp.dfp2sci();
        
        String expected = "0.0e0";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dfp2sci()}
 * @utbot.executesCondition {@code (sign == -1): True}
 * @utbot.returnsFrom {@code return new String(outputbuffer, 0, 5);}
 *  */
    @Test
    public void testDfp2sci_SignEqualsNegative1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        
        String actual = dfp.dfp2sci();
        
        String expected = "-0.0e";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dfp2sci()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dfp2sci()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char[] rawdigits = new char[mant.length * 4];
 *  */
    @Test
    public void testDfp2sci_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.dfp2sci] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.dfp2sci(Dfp.java:1976) */
        dfp.dfp2sci();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.dotrap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dotrap(int, java.lang.String, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.activatesSwitch {@code switch(type) case: default}
 * @utbot.returnsFrom {@code return trap(type, what, oper, def, result);}
 *  */
    @Test
    public void testDotrap_SwitchTypeCasedefault() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        Dfp actual = dfp.dotrap(5, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#getZero()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.activatesSwitch {@code switch(type) case: DfpField.FLAG_OVERFLOW}
 * @utbot.returnsFrom {@code return trap(type, what, oper, def, result);}
 *  */
    @Test
    public void testDotrap_DfpNewInstance() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        dfpDec.sign = (byte) 0;
        
        Dfp actual = dfp.dotrap(4, null, null, dfpDec);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        int finalDfpDecExp = dfpDec.exp;
        
        org.junit.Assert.assertEquals(-32760, finalDfpDecExp);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return trap(type, what, oper, def, result);}
 *  */
    @Test
    public void testDotrap_ReturnTrap() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) 0;
        
        Dfp actual = dfp.dotrap(1, null, null, dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans == FINITE): False}
 * @utbot.executesCondition {@code (nans == FINITE): False}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (nans == QNAN): False}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (nans == SNAN): True}
 * @utbot.returnsFrom {@code return trap(type, what, oper, def, result);}
 *  */
    @Test
    public void testDotrap_NansEqualsSNAN() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 2;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.dotrap(2, null, null, null);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) -127;
        expected.exp = -255;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans == FINITE): False}
 * @utbot.executesCondition {@code (nans == FINITE): False}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (nans == QNAN): True}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (nans == SNAN): False}
 * @utbot.returnsFrom {@code return trap(type, what, oper, def, result);}
 *  */
    @Test
    public void testDotrap_NansEqualsQNAN() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 3;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.dotrap(2, null, null, null);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans == FINITE): True}
 * @utbot.executesCondition {@code (mant[mant.length - 1] != 0): True}
 * @utbot.executesCondition {@code (nans == FINITE): True}
 * @utbot.executesCondition {@code (mant[mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (nans == QNAN): False}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (nans == SNAN): False}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#getZero()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return trap(type, what, oper, def, result);}
 *  */
    @Test
    public void testDotrap_MantLength1OfMantNotEqualsZero() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) -127;
        
        Dfp actual = dfp.dotrap(2, null, dfp1, null);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {};
        expected.mant = mant2;
        expected.sign = (byte) 1;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code ((result.exp + mant.length) < MIN_EXP): False}
 * @utbot.returnsFrom {@code return trap(type, what, oper, def, result);}
 *  */
    @Test
    public void testDotrap_ResultExpPlusMantLengthGreaterOrEqualMIN_EXP() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        dfp1.mant = mant1;
        dfp1.sign = (byte) -127;
        dfp1.exp = 258;
        dfp1.nans = (byte) -127;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        Dfp actual = dfp.dotrap(8, null, null, dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {};
        expected.mant = mant2;
        expected.sign = (byte) -127;
        expected.exp = 258;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        int finalDfp1Exp = dfp1.exp;
        
        org.junit.Assert.assertEquals(33018, finalDfp1Exp);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code ((result.exp + mant.length) < MIN_EXP): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#getZero()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return trap(type, what, oper, def, result);}
 *  */
    @Test
    public void testDotrap_ResultExpPlusMantLengthLessThanMIN_EXP() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) 0;
        dfp1.exp = -32768;
        
        Dfp actual = dfp.dotrap(8, null, null, dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {};
        expected.mant = mant2;
        expected.sign = (byte) 0;
        expected.nans = (byte) 0;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        int finalDfp1Exp = dfp1.exp;
        
        org.junit.Assert.assertEquals(-8, finalDfp1Exp);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans == FINITE): False}
 * @utbot.executesCondition {@code (nans == FINITE): False}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.returnsFrom {@code return trap(type, what, oper, def, result);}
 *  */
    @Test
    public void testDotrap_NansEqualsINFINITE() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.dotrap(2, null, null, null);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans == FINITE): True}
 * @utbot.executesCondition {@code (mant[mant.length - 1] != 0): False}
 * @utbot.executesCondition {@code (nans == FINITE): True}
 * @utbot.executesCondition {@code (mant[mant.length - 1] == 0): True}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (nans == QNAN): False}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (nans == SNAN): False}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#getZero()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return trap(type, what, oper, def, result);}
 *  */
    @Test
    public void testDotrap_MantLength1OfMantEqualsZero() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.dotrap(2, null, null, null);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {};
        expected.mant = mant2;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code ((result.exp + mant.length) < MIN_EXP): False}
 * @utbot.returnsFrom {@code return trap(type, what, oper, def, result);}
 *  */
    @Test
    public void testDotrap_ResultExpPlusMantLengthGreaterOrEqualMIN_EXP_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(field, "org.apache.commons.math.dfp.DfpField", "ieeeFlags", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.exp = 257;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -2);
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        Dfp actual = dfp.dotrap(8, null, null, dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {};
        expected.mant = mant2;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        int finalDfp1Exp = dfp1.exp;
        
        org.junit.Assert.assertEquals(33017, finalDfp1Exp);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dotrap(int, java.lang.String, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans == FINITE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: nans == FINITE && mant[mant.length - 1] != 0
 *  */
    @Test
    public void testDotrap_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.dotrap] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.dotrap(Dfp.java:2144) */
        dfp.dotrap(2, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (result.exp + mant.length) < MIN_EXP
 *  */
    @Test
    public void testDotrap_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.dotrap] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.dotrap(Dfp.java:2169) */
        dfp.dotrap(8, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.activatesSwitch {@code switch(type) case: DfpField.FLAG_OVERFLOW}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.exp = result.exp - ERR_SCALE;
 *  */
    @Test
    public void testDotrap_ThrowNullPointerException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.dotrap] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.dotrap(Dfp.java:2179) */
        dfp.dotrap(4, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (result.exp + mant.length) < MIN_EXP
 *  */
    @Test
    public void testDotrap_ThrowNullPointerException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.exp = -255;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.dotrap] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.dotrap(Dfp.java:2169) */
        dfp.dotrap(8, null, null, dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans == FINITE): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: nans == FINITE && mant[mant.length - 1] != 0
 *  */
    @Test
    public void testDotrap_ThrowNullPointerException_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.dotrap] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.dotrap(Dfp.java:2144) */
        dfp.dotrap(2, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#getZero()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.activatesSwitch {@code switch(type) case: DfpField.FLAG_INVALID}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: def.sign = result.sign;
 *  */
    @Test
    public void testDotrap_ThrowNullPointerException_5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.dotrap] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.dotrap(Dfp.java:2139) */
        dfp.dotrap(1, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans == FINITE): True}
 * @utbot.executesCondition {@code (mant[mant.length - 1] != 0): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#getZero()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: def.sign = (byte) (sign * oper.sign);
 *  */
    @Test
    public void testDotrap_ThrowNullPointerException_4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.dotrap] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.dotrap(Dfp.java:2147) */
        dfp.dotrap(2, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.toSplitDouble
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toSplitDouble()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toSplitDouble()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: split[1] = subtract(newInstance(split[0])).toDouble();
 *  */
    @Test
    public void testToSplitDouble_ThrowNegativeArraySizeException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 3;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", Integer.MIN_VALUE);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toSplitDouble] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:259)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:584)
            org.apache.commons.math.dfp.Dfp.toSplitDouble(Dfp.java:2395) */
        dfp.toSplitDouble();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toSplitDouble()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: split[1] = subtract(newInstance(split[0])).toDouble();
 *  */
    @Test
    public void testToSplitDouble_ThrowNegativeArraySizeException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 2;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", Integer.MIN_VALUE);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toSplitDouble] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:259)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:584)
            org.apache.commons.math.dfp.Dfp.toSplitDouble(Dfp.java:2395) */
        dfp.toSplitDouble();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toSplitDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: split[0] = Double.longBitsToDouble(Double.doubleToLongBits(toDouble()) & mask);
 *  */
    @Test
    public void testToSplitDouble_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toSplitDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.toDouble(Dfp.java:2319)
            org.apache.commons.math.dfp.Dfp.toSplitDouble(Dfp.java:2394) */
        dfp.toSplitDouble();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.dfp2string
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dfp2string()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dfp2string()}
 * @utbot.executesCondition {@code (e <= 0): True}
 * @utbot.executesCondition {@code (!pointInserted): False}
 * @utbot.executesCondition {@code (buffer[q] == '.'): True}
 * @utbot.executesCondition {@code (sign < 0): False}
 * @utbot.iterates iterate the loop {@code while(buffer[q] == '0')} once
 * @utbot.iterates iterate the loop {@code while(buffer[p - 1] == '0')} once
 * @utbot.returnsFrom {@code return new String(buffer, q, p - q);}
 *  */
    @Test
    public void testDfp2string_SignGreaterOrEqualZero() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        
        String actual = dfp.dfp2string();
        
        String expected = "0.";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dfp2string()}
 * @utbot.executesCondition {@code (e <= 0): True}
 * @utbot.executesCondition {@code (!pointInserted): False}
 * @utbot.executesCondition {@code (buffer[q] == '.'): True}
 * @utbot.executesCondition {@code (sign < 0): True}
 * @utbot.iterates iterate the loop {@code while(buffer[q] == '0')} once
 * @utbot.iterates iterate the loop {@code while(buffer[p - 1] == '0')} once
 * @utbot.returnsFrom {@code return new String(buffer, q, p - q);}
 *  */
    @Test
    public void testDfp2string_SignLessThanZero() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        
        String actual = dfp.dfp2string();
        
        String expected = "-0.";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dfp2string()}
 * @utbot.executesCondition {@code (e <= 0): False}
 * @utbot.executesCondition {@code (!pointInserted): True}
 * @utbot.executesCondition {@code (buffer[q] == '.'): False}
 * @utbot.executesCondition {@code (sign < 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = mant.length - 1; i >= 0; i--)} twice
 * @utbot.iterates iterate the loop {@code while(buffer[p - 1] == '0')} once
 * @utbot.returnsFrom {@code return new String(buffer, q, p - q);}
 *  */
    @Test
    public void testDfp2string_QOfBufferNotEqualsChar() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1001};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        dfp.exp = 2;
        
        String actual = dfp.dfp2string();
        
        String expected = "-10010000.";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dfp2string()}
 * @utbot.executesCondition {@code (e <= 0): True}
 * @utbot.executesCondition {@code (!pointInserted): False}
 * @utbot.executesCondition {@code (buffer[q] == '.'): True}
 * @utbot.executesCondition {@code (sign < 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = mant.length - 1; i >= 0; i--)} once
 * @utbot.iterates iterate the loop {@code while(buffer[q] == '0')} once
 * @utbot.iterates iterate the loop {@code while(buffer[p - 1] == '0')} twice
 * @utbot.returnsFrom {@code return new String(buffer, q, p - q);}
 *  */
    @Test
    public void testDfp2string_P1OfBufferEquals0() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {60};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        
        String actual = dfp.dfp2string();
        
        String expected = "-0.006";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dfp2string()}
 * @utbot.executesCondition {@code (e <= 0): True}
 * @utbot.executesCondition {@code (!pointInserted): False}
 * @utbot.executesCondition {@code (buffer[q] == '.'): True}
 * @utbot.executesCondition {@code (sign < 0): False}
 * @utbot.iterates iterate the loop {@code while(e < 0)} once
 * @utbot.iterates iterate the loop {@code for(int i = mant.length - 1; i >= 0; i--)} once
 * @utbot.iterates iterate the loop {@code while(buffer[q] == '0')} once
 * @utbot.iterates iterate the loop {@code while(buffer[p - 1] == '0')} once
 * @utbot.returnsFrom {@code return new String(buffer, q, p - q);}
 *  */
    @Test
    public void testDfp2string_SignGreaterOrEqualZero_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {71};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = -1;
        
        String actual = dfp.dfp2string();
        
        String expected = "0.00000071";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dfp2string()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dfp2string()}
 * @utbot.executesCondition {@code (e <= 0): False}
 * @utbot.executesCondition {@code (!pointInserted): False}
 * @utbot.executesCondition {@code (buffer[q] == '.'): True}
 * @utbot.executesCondition {@code (sign < 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = mant.length - 1; i >= 0; i--)} once
 * @utbot.iterates iterate the loop {@code while(buffer[p - 1] == '0')} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[--q] = '-';
 *  */
    @Test
    public void testDfp2string_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-2097154007};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        dfp.exp = 1;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.dfp2string] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 24]
            org.apache.commons.math.dfp.Dfp.dfp2string(Dfp.java:2119) */
        dfp.dfp2string();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dfp2string()}
 * @utbot.executesCondition {@code (e <= 0): False}
 * @utbot.executesCondition {@code (!pointInserted): True}
 * @utbot.executesCondition {@code (buffer[q] == '.'): True}
 * @utbot.executesCondition {@code (sign < 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = mant.length - 1; i >= 0; i--)} twice
 * @utbot.iterates iterate the loop {@code while(buffer[p - 1] == '0')} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[--q] = '-';
 *  */
    @Test
    public void testDfp2string_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-2097154007};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        dfp.exp = 2;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.dfp2string] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 24]
            org.apache.commons.math.dfp.Dfp.dfp2string(Dfp.java:2119) */
        dfp.dfp2string();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#dfp2string()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char[] buffer = new char[mant.length * 4 + 20];
 *  */
    @Test
    public void testDfp2string_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.dfp2string] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.dfp2string(Dfp.java:2057) */
        dfp.dfp2string();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.copysign
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copysign(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#copysign(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testCopysign_ReturnResult() throws Exception  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {-254, 0};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.exp = -255;
        dfpDec.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) -127;
        
        DfpDec actual = ((DfpDec) Dfp.copysign(dfpDec, dfp));
        
        DfpDec expected = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {-254, 0};
        expected.mant = mant1;
        expected.sign = (byte) -127;
        expected.exp = -255;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int[] expectedMant = expected.mant;
        int[] actualMant = actual.mant;
        int expectedMantSize = expectedMant.length;
        org.junit.Assert.assertEquals(expectedMantSize, actualMant.length);
        assertArrayEquals(expectedMant, actualMant);
        
        byte expectedSign = expected.sign;
        byte actualSign = actual.sign;
        org.junit.Assert.assertEquals(expectedSign, actualSign);
        
        int expectedExp = expected.exp;
        int actualExp = actual.exp;
        org.junit.Assert.assertEquals(expectedExp, actualExp);
        
        byte expectedNans = expected.nans;
        byte actualNans = actual.nans;
        org.junit.Assert.assertEquals(expectedNans, actualNans);
        
        DfpField expectedField = expected.getField();
        DfpField actualField = actual.getField();
        int expectedFieldRadixDigits = expectedField.getRadixDigits();
        int actualFieldRadixDigits = actualField.getRadixDigits();
        org.junit.Assert.assertEquals(expectedFieldRadixDigits, actualFieldRadixDigits);
        
        Dfp actualFieldZero = actualField.getZero();
        assertNull(actualFieldZero);
        
        Dfp actualFieldOne = actualField.getOne();
        assertNull(actualFieldOne);
        
        Dfp actualFieldTwo = actualField.getTwo();
        assertNull(actualFieldTwo);
        
        Dfp actualFieldSqr2 = actualField.getSqr2();
        assertNull(actualFieldSqr2);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldSqr2Split = actualField.getSqr2Split();
        assertNull(actualFieldSqr2Split);
        
        Dfp actualFieldSqr2Reciprocal = actualField.getSqr2Reciprocal();
        assertNull(actualFieldSqr2Reciprocal);
        
        Dfp actualFieldSqr3 = actualField.getSqr3();
        assertNull(actualFieldSqr3);
        
        Dfp actualFieldSqr3Reciprocal = actualField.getSqr3Reciprocal();
        assertNull(actualFieldSqr3Reciprocal);
        
        Dfp actualFieldPi = actualField.getPi();
        assertNull(actualFieldPi);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldPiSplit = actualField.getPiSplit();
        assertNull(actualFieldPiSplit);
        
        Dfp actualFieldE = actualField.getE();
        assertNull(actualFieldE);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldESplit = actualField.getESplit();
        assertNull(actualFieldESplit);
        
        Dfp actualFieldLn2 = actualField.getLn2();
        assertNull(actualFieldLn2);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldLn2Split = actualField.getLn2Split();
        assertNull(actualFieldLn2Split);
        
        Dfp actualFieldLn5 = actualField.getLn5();
        assertNull(actualFieldLn5);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldLn5Split = actualField.getLn5Split();
        assertNull(actualFieldLn5Split);
        
        Dfp actualFieldLn10 = actualField.getLn10();
        assertNull(actualFieldLn10);
        
        DfpField.RoundingMode actualFieldRMode = ((DfpField.RoundingMode) getFieldValue(actualField, "org.apache.commons.math.dfp.DfpField", "rMode"));
        assertNull(actualFieldRMode);
        
        int expectedFieldIeeeFlags = ((Integer) getFieldValue(expectedField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        int actualFieldIeeeFlags = ((Integer) getFieldValue(actualField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        org.junit.Assert.assertEquals(expectedFieldIeeeFlags, actualFieldIeeeFlags);
        
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#copysign(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testCopysign_ReturnResult_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = Dfp.copysign(dfp, dfp);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 0;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copysign(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#copysign(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Dfp result = x.newInstance(x);
 *  */
    @Test
    public void testCopysign_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.exp = -255;
        dfpDec.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.copysign] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.DfpDec.round(DfpDec.java:167)
            org.apache.commons.math.dfp.DfpDec.<init>(DfpDec.java:74)
            org.apache.commons.math.dfp.DfpDec.newInstance(DfpDec.java:138)
            org.apache.commons.math.dfp.Dfp.copysign(Dfp.java:2221) */
        Dfp.copysign(dfpDec, null);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#copysign(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Dfp result = x.newInstance(x);
 *  */
    @Test
    public void testCopysign_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {4194561};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 2);
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.copysign] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.math.dfp.DfpDec.round(DfpDec.java:200)
            org.apache.commons.math.dfp.DfpDec.<init>(DfpDec.java:74)
            org.apache.commons.math.dfp.DfpDec.newInstance(DfpDec.java:138)
            org.apache.commons.math.dfp.Dfp.copysign(Dfp.java:2221) */
        Dfp.copysign(dfpDec, null);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#copysign(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Dfp result = x.newInstance(x);
 *  */
    @Test
    public void testCopysign_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {257, 1073741824};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -126;
        dfpDec.exp = 4;
        dfpDec.nans = (byte) -126;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 130);
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.copysign] produces [java.lang.ArrayIndexOutOfBoundsException: Index -127 out of bounds for length 2]
            org.apache.commons.math.dfp.DfpDec.round(DfpDec.java:190)
            org.apache.commons.math.dfp.DfpDec.<init>(DfpDec.java:74)
            org.apache.commons.math.dfp.DfpDec.newInstance(DfpDec.java:138)
            org.apache.commons.math.dfp.Dfp.copysign(Dfp.java:2221) */
        Dfp.copysign(dfpDec, null);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#copysign(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Dfp result = x.newInstance(x);
 *  */
    @Test
    public void testCopysign_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.copysign] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.copysign(Dfp.java:2221) */
        Dfp.copysign(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#copysign(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.sign = y.sign;
 *  */
    @Test
    public void testCopysign_ThrowNullPointerException_1() throws Exception  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {1, 0};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.exp = 1;
        dfpDec.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.copysign] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.copysign(Dfp.java:2222) */
        Dfp.copysign(dfpDec, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method copysign(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)
    
    @Test
    public void testCopysign1() throws Exception  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = new int[36];
        mant[35] = 64;
        dfpDec.mant = mant;
        dfpDec.sign = (byte) 0;
        dfpDec.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 36);
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.copysign] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.DfpDec.round(DfpDec.java:216)
            org.apache.commons.math.dfp.DfpDec.<init>(DfpDec.java:74)
            org.apache.commons.math.dfp.DfpDec.newInstance(DfpDec.java:138)
            org.apache.commons.math.dfp.Dfp.copysign(Dfp.java:2221) */
        Dfp.copysign(dfpDec, null);
    }
    
    @Test
    public void testCopysign2() throws Exception  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = new int[35];
        mant[34] = 512;
        dfpDec.mant = mant;
        dfpDec.sign = (byte) 0;
        dfpDec.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 33);
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.copysign] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.DfpDec.round(DfpDec.java:216)
            org.apache.commons.math.dfp.DfpDec.<init>(DfpDec.java:74)
            org.apache.commons.math.dfp.DfpDec.newInstance(DfpDec.java:138)
            org.apache.commons.math.dfp.Dfp.copysign(Dfp.java:2221) */
        Dfp.copysign(dfpDec, null);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method copysign(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)
    
    @Test(timeout = 1000L)
    public void testCopysign3() throws Exception  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = new int[16];
        mant[15] = Integer.MIN_VALUE;
        dfpDec.mant = mant;
        dfpDec.sign = (byte) 0;
        dfpDec.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Dfp.copysign(dfpDec, dfpDec);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#add(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (field.getRadixDigits() != x.field.getRadixDigits()): False}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (isNaN()): True}
 *  */
    @Test
    public void testAdd_IsNaN() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 2;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.add(dfp1);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(dfp, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#add(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (field.getRadixDigits() != x.field.getRadixDigits()): False}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (isNaN()): False}
 * @utbot.executesCondition {@code (x.isNaN()): True}
 *  */
    @Test
    public void testAdd_XIsNaN() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 3;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.add(dfp1);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(dfp1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#add(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (field.getRadixDigits() != x.field.getRadixDigits()): False}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (isNaN()): False}
 * @utbot.executesCondition {@code (x.isNaN()): False}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.executesCondition {@code (x.nans == FINITE): True}
 *  */
    @Test
    public void testAdd_XNansEqualsFINITE() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.add(dfp1);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(dfp, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#add(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (field.getRadixDigits() != x.field.getRadixDigits()): False}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (isNaN()): False}
 * @utbot.executesCondition {@code (x.isNaN()): False}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.executesCondition {@code (x.nans == FINITE): False}
 * @utbot.executesCondition {@code (x.nans == INFINITE): True}
 * @utbot.executesCondition {@code (nans == FINITE): False}
 * @utbot.executesCondition {@code (x.nans == INFINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.executesCondition {@code (sign == x.sign): True}
 *  */
    @Test
    public void testAdd_SignEqualsXSign() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) 1;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.add(dfp1);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(dfp1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#add(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (field.getRadixDigits() != x.field.getRadixDigits()): False}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (x.nans != FINITE): True}
 * @utbot.executesCondition {@code (isNaN()): False}
 * @utbot.executesCondition {@code (x.isNaN()): True}
 *  */
    @Test
    public void testAdd_XIsNaN_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 2;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.add(dfp1);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(dfp1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#add(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (field.getRadixDigits() != x.field.getRadixDigits()): False}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (x.nans != FINITE): True}
 * @utbot.executesCondition {@code (isNaN()): False}
 * @utbot.executesCondition {@code (x.isNaN()): False}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (x.nans == INFINITE): True}
 * @utbot.executesCondition {@code (nans == FINITE): True}
 *  */
    @Test
    public void testAdd_NansEqualsFINITE() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 1;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.add(dfp1);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(dfp1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#add(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (field.getRadixDigits() != x.field.getRadixDigits()): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#setIEEEFlagsBits(int)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#getZero()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return dotrap(DfpField.FLAG_INVALID, ADD_TRAP, x, result);}
 *  */
    @Test
    public void testAdd_FieldGetRadixDigitsNotEqualsXFieldGetRadixDigits() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(field, "org.apache.commons.math.dfp.DfpField", "ieeeFlags", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -2);
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        Dfp actual = dfp.add(dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) -127;
        expected.exp = -255;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#add(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (field.getRadixDigits() != x.field.getRadixDigits()): False}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (isNaN()): False}
 * @utbot.executesCondition {@code (x.isNaN()): False}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.executesCondition {@code (x.nans == FINITE): False}
 * @utbot.executesCondition {@code (x.nans == INFINITE): True}
 * @utbot.executesCondition {@code (nans == FINITE): False}
 * @utbot.executesCondition {@code (x.nans == INFINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.executesCondition {@code (sign == x.sign): False}
 * @utbot.executesCondition {@code (x.nans == INFINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.executesCondition {@code (sign != x.sign): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#setIEEEFlagsBits(int)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#getZero()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testAdd_SignNotEqualsXSign() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) -126;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) 1;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.add(dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        DfpField dfp1Field = ((DfpField) getFieldValue(dfp1, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfp1FieldIeeeFlags = ((Integer) getFieldValue(dfp1Field, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(1, finalDfpFieldIeeeFlags);
        
        org.junit.Assert.assertEquals(1, finalDfp1FieldIeeeFlags);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#add(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.add(Dfp.java:1168) */
        dfp.add(((Dfp) null));
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#add(org.apache.commons.math.dfp.Dfp)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#getRadixDigits()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.add(Dfp.java:1168) */
        dfp.add(((Dfp) null));
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#add(org.apache.commons.math.dfp.Dfp)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#getRadixDigits()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.add(Dfp.java:1168) */
        dfp.add(dfp1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(org.apache.commons.math.dfp.Dfp)
    
    @Test(expected = StackOverflowError.class)
    public void testAdd1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        dfp.add(dfp1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testAdd2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = java.lang.Byte.MIN_VALUE;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", 65536);
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) 0;
        dfp1.nans = (byte) 1;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.add(dfp1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testAdd3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpDec zero = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1073741824);
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.mant = mant;
        dfp1.sign = (byte) 0;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.add(dfp1);
    }
    
    @Test
    public void testAdd4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.mant = mant;
        dfp1.sign = (byte) 0;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:320)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:602)
            org.apache.commons.math.dfp.Dfp.add(Dfp.java:1211) */
        dfp.add(dfp1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other instanceof Dfp): True}
 *  */
    @Test
    public void testEquals_OtherInstanceOfDfp() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 3;
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        
        boolean actual = dfp.equals(dfpDec);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other instanceof Dfp): True}
 *  */
    @Test
    public void testEquals_OtherInstanceOfDfp_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 2;
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        
        boolean actual = dfp.equals(dfpDec);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other instanceof Dfp): True}
 *  */
    @Test
    public void testEquals_OtherInstanceOfDfp_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        dfpDec.nans = (byte) 3;
        
        boolean actual = dfp.equals(dfpDec);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other instanceof Dfp): False}
 *  */
    @Test
    public void testEquals_NotOtherNotInstanceOfDfp() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        boolean actual = dfp.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other instanceof Dfp): True}
 *  */
    @Test
    public void testEquals_OtherInstanceOfDfp_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -124;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        boolean actual = dfp.equals(dfp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other instanceof Dfp): True}
 * @utbot.returnsFrom {@code return compare(this, x) == 0;}
 *  */
    @Test
    public void testEquals_OtherInstanceOfDfp_4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) 0;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        boolean actual = dfp.equals(dfp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other instanceof Dfp): True}
 * @utbot.returnsFrom {@code return compare(this, x) == 0;}
 *  */
    @Test
    public void testEquals_OtherInstanceOfDfp_5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -124;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) -124;
        dfp1.nans = (byte) 1;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.equals(dfp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other instanceof Dfp): True}
 * @utbot.returnsFrom {@code return compare(this, x) == 0;}
 *  */
    @Test
    public void testEquals_OtherInstanceOfDfp_6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 0};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -254);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {0};
        dfpDec.mant = mant1;
        dfpDec.nans = (byte) 0;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.equals(dfpDec);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other instanceof Dfp): True}
 * @utbot.returnsFrom {@code return compare(this, x) == 0;}
 *  */
    @Test
    public void testEquals_OtherInstanceOfDfp_7() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.nans = (byte) 0;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        boolean actual = dfp.equals(dfp1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other instanceof Dfp): True}
 * @utbot.returnsFrom {@code return compare(this, x) == 0;}
 *  */
    @Test
    public void testEquals_OtherInstanceOfDfp_8() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        dfp1.mant = mant1;
        dfp1.sign = java.lang.Byte.MIN_VALUE;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        boolean actual = dfp.equals(dfp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other instanceof Dfp): True}
 * @utbot.returnsFrom {@code return compare(this, x) == 0;}
 *  */
    @Test
    public void testEquals_OtherInstanceOfDfp_9() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.nans = (byte) 1;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        boolean actual = dfp.equals(dfp1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other instanceof Dfp): True}
 * @utbot.returnsFrom {@code return compare(this, x) == 0;}
 *  */
    @Test
    public void testEquals_OtherInstanceOfDfp_10() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, -255};
        dfp.mant = mant;
        dfp.sign = java.lang.Byte.MIN_VALUE;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-2147483643, 1};
        dfp1.mant = mant1;
        dfp1.sign = java.lang.Byte.MIN_VALUE;
        dfp1.exp = 1;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.equals(dfp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other instanceof Dfp): True}
 * @utbot.returnsFrom {@code return compare(this, x) == 0;}
 *  */
    @Test
    public void testEquals_OtherInstanceOfDfp_11() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.exp = 1;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.mant = mant;
        dfp1.sign = (byte) -127;
        dfp1.exp = Integer.MIN_VALUE;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        boolean actual = dfp.equals(dfp1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return compare(this, x) == 0;
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.equals(Dfp.java:824) */
        dfp.equals(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return compare(this, x) == 0;
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -254);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {-2147483646, 1};
        dfpDec.mant = mant1;
        dfpDec.sign = (byte) -127;
        dfpDec.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -254);
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887)
            org.apache.commons.math.dfp.Dfp.equals(Dfp.java:824) */
        dfp.equals(dfpDec);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return compare(this, x) == 0;
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        dfp1.mant = mant1;
        dfp1.sign = (byte) -127;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887)
            org.apache.commons.math.dfp.Dfp.equals(Dfp.java:824) */
        dfp.equals(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return compare(this, x) == 0;
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, -255};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {1};
        dfpDec.mant = mant1;
        dfpDec.sign = (byte) -127;
        dfpDec.nans = java.lang.Byte.MIN_VALUE;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:899)
            org.apache.commons.math.dfp.Dfp.equals(Dfp.java:824) */
        dfp.equals(dfpDec);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isNaN() || x.isNaN() || field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        dfpDec.nans = java.lang.Byte.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.equals(Dfp.java:820) */
        dfp.equals(dfpDec);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isNaN() || x.isNaN() || field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        dfpDec.nans = java.lang.Byte.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.equals(Dfp.java:820) */
        dfp.equals(dfpDec);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return compare(this, x) == 0;
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        dfpDec.nans = java.lang.Byte.MIN_VALUE;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.equals(Dfp.java:824) */
        dfp.equals(dfpDec);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return compare(this, x) == 0;
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 0};
        dfp.mant = mant;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        dfpDec.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.equals(Dfp.java:824) */
        dfp.equals(dfpDec);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return compare(this, x) == 0;
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        dfpDec.sign = (byte) -127;
        dfpDec.nans = java.lang.Byte.MIN_VALUE;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887)
            org.apache.commons.math.dfp.Dfp.equals(Dfp.java:824) */
        dfp.equals(dfpDec);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    @Test
    public void testEquals1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {1};
        dfpDec.mant = mant1;
        dfpDec.sign = (byte) 0;
        dfpDec.nans = java.lang.Byte.MIN_VALUE;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        boolean actual = dfp.equals(dfpDec);
        
        assertTrue(actual);
    }
    
    @Test
    public void testEquals2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.mant = mant;
        dfp1.sign = (byte) 0;
        dfp1.nans = (byte) 4;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        boolean actual = dfp.equals(dfp1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testEquals3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {Integer.MIN_VALUE, 3, 0};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        boolean actual = dfp.equals(dfp1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toString()}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.returnsFrom {@code return NAN_STRING;}
 *  */
    @Test
    public void testToString_NansNotEqualsINFINITE() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        
        String actual = dfp.toString();
        
        String expected = "NaN";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toString()}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.executesCondition {@code ((sign < 0)): False}
 * @utbot.returnsFrom {@code return (sign < 0) ? NEG_INFINITY_STRING : POS_INFINITY_STRING;}
 *  */
    @Test
    public void testToString_SignGreaterOrEqualZero() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        
        String actual = dfp.toString();
        
        String expected = "Infinity";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toString()}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.executesCondition {@code ((sign < 0)): True}
 * @utbot.returnsFrom {@code return (sign < 0) ? NEG_INFINITY_STRING : POS_INFINITY_STRING;}
 *  */
    @Test
    public void testToString_SignLessThanZero() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) -1;
        dfp.nans = (byte) 1;
        
        String actual = dfp.toString();
        
        String expected = "-Infinity";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toString()}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (exp > mant.length): True}
 * @utbot.returnsFrom {@code return dfp2sci();}
 *  */
    @Test
    public void testToString_ExpGreaterThanMantLength() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 1;
        dfp.nans = (byte) 0;
        
        String actual = dfp.toString();
        
        String expected = "0.0e0";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toString()}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (exp > mant.length): False}
 * @utbot.executesCondition {@code (exp < -1): True}
 * @utbot.returnsFrom {@code return dfp2sci();}
 *  */
    @Test
    public void testToString_ExpLessThanNegative1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        dfp.exp = -255;
        dfp.nans = (byte) 0;
        
        String actual = dfp.toString();
        
        String expected = "-0.0e";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toString()}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (exp > mant.length): False}
 * @utbot.executesCondition {@code (exp < -1): False}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#dfp2string()}
 * @utbot.returnsFrom {@code return dfp2string();}
 *  */
    @Test
    public void testToString_ExpGreaterOrEqualNegative1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        
        String actual = dfp.toString();
        
        String expected = "0.";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toString()}
 * @utbot.executesCondition {@code (exp > mant.length): False}
 * @utbot.executesCondition {@code (exp < -1): False}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#dfp2string()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return dfp2string();
 *  */
    @Test
    public void testToString_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-2031618007};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        dfp.exp = 1;
        dfp.nans = (byte) 0;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 24]
            org.apache.commons.math.dfp.Dfp.dfp2string(Dfp.java:2119)
            org.apache.commons.math.dfp.Dfp.toString(Dfp.java:1968) */
        dfp.toString();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: exp > mant.length || exp < -1
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = -255;
        dfp.nans = (byte) 0;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.toString] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.toString(Dfp.java:1964) */
        dfp.toString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        dfp.exp = 1;
        dfp.nans = (byte) 0;
        
        String actual = dfp.toString();
        
        String expected = "-0.0e";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = -2147483647;
        dfp.nans = (byte) 0;
        
        String actual = dfp.toString();
        
        String expected = "0.0e0";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testToString3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1118487010};
        dfp.mant = mant;
        dfp.sign = java.lang.Byte.MIN_VALUE;
        dfp.exp = -1;
        dfp.nans = (byte) 0;
        
        String actual = dfp.toString();
        
        String expected = "-0.0000\u114701";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testToString4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.exp = 2;
        dfp.nans = (byte) 0;
        
        String actual = dfp.toString();
        
        String expected = "0.0e0";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testToString5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1024};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        dfp.exp = 2;
        dfp.nans = (byte) 0;
        
        String actual = dfp.toString();
        
        String expected = "-1.024e7";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testToString6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1966080104};
        dfp.mant = mant;
        dfp.sign = java.lang.Byte.MIN_VALUE;
        dfp.exp = 1;
        dfp.nans = (byte) 0;
        
        String actual = dfp.toString();
        
        String expected = "-104.";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testToString7() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, 0};
        dfp.mant = mant;
        dfp.exp = 1;
        dfp.nans = (byte) 0;
        
        String actual = dfp.toString();
        
        String expected = "0.";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testToString8() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.exp = -2147483646;
        dfp.nans = (byte) 0;
        
        String actual = dfp.toString();
        
        String expected = "0.0e0";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testToString9() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1024};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        dfp.exp = -2147483646;
        dfp.nans = (byte) 0;
        
        String actual = dfp.toString();
        
        String expected = "-1.024e7";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testToString10() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, 0};
        dfp.mant = mant;
        dfp.exp = 3;
        dfp.nans = (byte) 0;
        
        String actual = dfp.toString();
        
        String expected = "0.0e0";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#hashCode()}
 * @utbot.invokes {@link java.util.Arrays#hashCode(int[])}
 * @utbot.returnsFrom {@code return 17 + (sign << 8) + (nans << 16) + exp + Arrays.hashCode(mant);}
 *  */
    @Test
    public void testHashCode_ArraysHashCode() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) -127;
        dfp.exp = -255;
        dfp.nans = (byte) -127;
        
        int actual = dfp.hashCode();
        
        org.junit.Assert.assertEquals(-8355822, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.sqrt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sqrt()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#sqrt()}
 * @utbot.executesCondition {@code (nans == FINITE): False}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (nans == QNAN): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return newInstance(this);}
 *  */
    @Test
    public void testSqrt_NansEqualsQNAN() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = -255;
        dfp.nans = (byte) 3;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.sqrt();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.exp = -255;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#sqrt()}
 * @utbot.executesCondition {@code (nans == FINITE): False}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.executesCondition {@code (sign == 1): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return newInstance(this);}
 *  */
    @Test
    public void testSqrt_SignEquals1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 1;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.sqrt();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 1;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#sqrt()}
 * @utbot.executesCondition {@code (nans == FINITE): True}
 * @utbot.executesCondition {@code (mant[mant.length - 1] == 0): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return newInstance(this);}
 *  */
    @Test
    public void testSqrt_MantLength1OfMantEqualsZero() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.sqrt();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 0;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sqrt()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#sqrt()}
 * @utbot.executesCondition {@code (nans == FINITE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: nans == FINITE && mant[mant.length - 1] == 0
 *  */
    @Test
    public void testSqrt_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.sqrt(Dfp.java:1860) */
        dfp.sqrt();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#sqrt()}
 * @utbot.executesCondition {@code (nans == FINITE): False}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (nans == QNAN): False}
 * @utbot.executesCondition {@code (nans == SNAN): False}
 * @utbot.executesCondition {@code (sign == -1): False}
 * @utbot.executesCondition {@code (x.exp < -1): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: switch(x.mant[mant.length - 1] / 2000)
 *  */
    @Test
    public void testSqrt_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = -2;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.sqrt(Dfp.java:1904) */
        dfp.sqrt();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#sqrt()}
 * @utbot.executesCondition {@code (nans == FINITE): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: nans == FINITE && mant[mant.length - 1] == 0
 *  */
    @Test
    public void testSqrt_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.sqrt(Dfp.java:1860) */
        dfp.sqrt();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#sqrt()}
 * @utbot.executesCondition {@code (nans == FINITE): False}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.executesCondition {@code (sign == 1): False}
 * @utbot.executesCondition {@code (nans == QNAN): False}
 * @utbot.executesCondition {@code (nans == SNAN): False}
 * @utbot.executesCondition {@code (sign == -1): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
 *  */
    @Test
    public void testSqrt_ThrowNullPointerException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) -1;
        dfp.nans = (byte) 1;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.sqrt(Dfp.java:1889) */
        dfp.sqrt();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#sqrt()}
 * @utbot.executesCondition {@code (nans == FINITE): False}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (nans == QNAN): False}
 * @utbot.executesCondition {@code (nans == SNAN): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#setIEEEFlagsBits(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
 *  */
    @Test
    public void testSqrt_ThrowNullPointerException_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 2;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.sqrt(Dfp.java:1878) */
        dfp.sqrt();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#sqrt()}
 * @utbot.executesCondition {@code (nans == FINITE): True}
 * @utbot.executesCondition {@code (mant[mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (sign == -1): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
 *  */
    @Test
    public void testSqrt_ThrowNullPointerException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        dfp.nans = (byte) 0;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.sqrt(Dfp.java:1889) */
        dfp.sqrt();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method sqrt()
    
    @Test
    public void testSqrt1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, 2048};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 2;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:845)
            org.apache.commons.math.dfp.Dfp.sqrt(Dfp.java:1925) */
        dfp.sqrt();
    }
    
    @Test
    public void testSqrt2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, 1024};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 2;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:845)
            org.apache.commons.math.dfp.Dfp.sqrt(Dfp.java:1925) */
        dfp.sqrt();
    }
    
    @Test
    public void testSqrt3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = new int[16];
        mant[15] = 6160;
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = Integer.MIN_VALUE;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:845)
            org.apache.commons.math.dfp.Dfp.sqrt(Dfp.java:1925) */
        dfp.sqrt();
    }
    
    @Test
    public void testSqrt4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {4000};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = -1;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:845)
            org.apache.commons.math.dfp.Dfp.sqrt(Dfp.java:1925) */
        dfp.sqrt();
    }
    
    @Test
    public void testSqrt5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {6160};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = -1;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:845)
            org.apache.commons.math.dfp.Dfp.sqrt(Dfp.java:1925) */
        dfp.sqrt();
    }
    
    @Test
    public void testSqrt6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {4000};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = Integer.MIN_VALUE;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:845)
            org.apache.commons.math.dfp.Dfp.sqrt(Dfp.java:1925) */
        dfp.sqrt();
    }
    
    @Test
    public void testSqrt7() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {10048};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = Integer.MIN_VALUE;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:845)
            org.apache.commons.math.dfp.Dfp.sqrt(Dfp.java:1925) */
        dfp.sqrt();
    }
    
    @Test
    public void testSqrt8() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = Integer.MIN_VALUE;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:845)
            org.apache.commons.math.dfp.Dfp.sqrt(Dfp.java:1925) */
        dfp.sqrt();
    }
    
    @Test
    public void testSqrt9() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {6160};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = -1;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:845)
            org.apache.commons.math.dfp.Dfp.sqrt(Dfp.java:1925) */
        dfp.sqrt();
    }
    
    @Test
    public void testSqrt10() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {4000};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 2;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:845)
            org.apache.commons.math.dfp.Dfp.sqrt(Dfp.java:1925) */
        dfp.sqrt();
    }
    
    @Test
    public void testSqrt11() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 2;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:845)
            org.apache.commons.math.dfp.Dfp.sqrt(Dfp.java:1925) */
        dfp.sqrt();
    }
    
    @Test
    public void testSqrt12() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {2048};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = Integer.MIN_VALUE;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.unequal(Dfp.java:845)
            org.apache.commons.math.dfp.Dfp.sqrt(Dfp.java:1925) */
        dfp.sqrt();
    }
    
    @Test
    public void testSqrt13() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.NullPointerException] */
        dfp.sqrt();
    }
    
    @Test
    public void testSqrt14() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 2;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.sqrt] produces [java.lang.NullPointerException] */
        dfp.sqrt();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.log10
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method log10()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#log10()}
 * @utbot.executesCondition {@code (mant[mant.length - 1] > 1000): True}
 * @utbot.returnsFrom {@code return exp * 4 - 1;}
 *  */
    @Test
    public void testLog10_MantLength1OfMantGreaterThan1000() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, 1281};
        dfp.mant = mant;
        dfp.exp = -255;
        
        int actual = dfp.log10();
        
        org.junit.Assert.assertEquals(-1021, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#log10()}
 * @utbot.executesCondition {@code (mant[mant.length - 1] > 1000): False}
 * @utbot.executesCondition {@code (mant[mant.length - 1] > 100): True}
 * @utbot.returnsFrom {@code return exp * 4 - 2;}
 *  */
    @Test
    public void testLog10_MantLength1OfMantGreaterThan100() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 256};
        dfp.mant = mant;
        
        int actual = dfp.log10();
        
        org.junit.Assert.assertEquals(-2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#log10()}
 * @utbot.executesCondition {@code (mant[mant.length - 1] > 1000): False}
 * @utbot.executesCondition {@code (mant[mant.length - 1] > 100): False}
 * @utbot.executesCondition {@code (mant[mant.length - 1] > 10): False}
 * @utbot.returnsFrom {@code return exp * 4 - 4;}
 *  */
    @Test
    public void testLog10_MantLength1OfMantLessOrEqual10() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 10};
        dfp.mant = mant;
        
        int actual = dfp.log10();
        
        org.junit.Assert.assertEquals(-4, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#log10()}
 * @utbot.executesCondition {@code (mant[mant.length - 1] > 1000): False}
 * @utbot.executesCondition {@code (mant[mant.length - 1] > 100): False}
 * @utbot.executesCondition {@code (mant[mant.length - 1] > 10): True}
 * @utbot.returnsFrom {@code return exp * 4 - 3;}
 *  */
    @Test
    public void testLog10_MantLength1OfMantGreaterThan10() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 11};
        dfp.mant = mant;
        
        int actual = dfp.log10();
        
        org.junit.Assert.assertEquals(-3, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method log10()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#log10()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: mant[mant.length - 1] > 1000
 *  */
    @Test
    public void testLog10_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.log10] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.log10(Dfp.java:1096) */
        dfp.log10();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#log10()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: mant[mant.length - 1] > 1000
 *  */
    @Test
    public void testLog10_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.log10] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.log10(Dfp.java:1096) */
        dfp.log10();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.floor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method floor()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#floor()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_FLOOR);}
 *  */
    @Test
    public void testFloor_ReturnTrunc() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 2;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.floor();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 2;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#floor()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_FLOOR);}
 *  */
    @Test
    public void testFloor_ReturnTrunc_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.floor();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) -127;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#floor()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_FLOOR);}
 *  */
    @Test
    public void testFloor_ReturnTrunc_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 2;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.floor();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-255};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.exp = 2;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#floor()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_FLOOR);}
 *  */
    @Test
    public void testFloor_ReturnTrunc_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.floor();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#floor()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_FLOOR);}
 *  */
    @Test
    public void testFloor_ReturnTrunc_4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, -255};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 1;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.floor();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0, -255};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.exp = 1;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#floor()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_FLOOR);}
 *  */
    @Test
    public void testFloor_ReturnTrunc_6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 3;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.floor();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#floor()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_FLOOR);}
 *  */
    @Test
    public void testFloor_ReturnTrunc_5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.exp = -1;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        DfpDec zero = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(field, "org.apache.commons.math.dfp.DfpField", "ieeeFlags", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.floor();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {};
        expected.mant = mant2;
        expected.sign = (byte) -127;
        expected.exp = -255;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(-239, finalDfpFieldIeeeFlags);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method floor()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#floor()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#trunc(org.apache.commons.math.dfp.DfpField.RoundingMode)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return trunc(DfpField.RoundingMode.ROUND_FLOOR);
 *  */
    @Test
    public void testFloor_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.nans = (byte) -127;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.floor] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.trunc(Dfp.java:969)
            org.apache.commons.math.dfp.Dfp.floor(Dfp.java:926) */
        dfp.floor();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method floor()
    
    @Test
    public void testFloor1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = new int[40];
        mant[1] = 1;
        mant[39] = 1;
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 37;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.floor();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = new int[40];
        mant1[39] = 1;
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.exp = 37;
        expected.nans = java.lang.Byte.MIN_VALUE;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method floor()
    
    @Test(expected = StackOverflowError.class)
    public void testFloor2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.exp = Integer.MIN_VALUE;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        DfpDec zero = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.floor();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.ceil
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ceil()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#ceil()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_CEIL);}
 *  */
    @Test
    public void testCeil_ReturnTrunc() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 2;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.ceil();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 2;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#ceil()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_CEIL);}
 *  */
    @Test
    public void testCeil_ReturnTrunc_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.ceil();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) -127;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#ceil()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_CEIL);}
 *  */
    @Test
    public void testCeil_ReturnTrunc_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 2;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.ceil();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-255};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.exp = 2;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#ceil()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_CEIL);}
 *  */
    @Test
    public void testCeil_ReturnTrunc_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.ceil();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#ceil()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_CEIL);}
 *  */
    @Test
    public void testCeil_ReturnTrunc_4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, -255};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 1;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.ceil();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0, -255};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.exp = 1;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#ceil()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_CEIL);}
 *  */
    @Test
    public void testCeil_ReturnTrunc_6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 3;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.ceil();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#ceil()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_CEIL);}
 *  */
    @Test
    public void testCeil_ReturnTrunc_5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.exp = -1;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        DfpDec zero = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(field, "org.apache.commons.math.dfp.DfpField", "ieeeFlags", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.ceil();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {};
        expected.mant = mant2;
        expected.sign = (byte) -127;
        expected.exp = -255;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(-239, finalDfpFieldIeeeFlags);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ceil()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#ceil()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#trunc(org.apache.commons.math.dfp.DfpField.RoundingMode)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return trunc(DfpField.RoundingMode.ROUND_CEIL);
 *  */
    @Test
    public void testCeil_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.nans = (byte) -127;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.ceil] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.trunc(Dfp.java:969)
            org.apache.commons.math.dfp.Dfp.ceil(Dfp.java:934) */
        dfp.ceil();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method ceil()
    
    @Test
    public void testCeil1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = new int[37];
        mant[0] = 134217728;
        mant[1] = 2048;
        mant[36] = 1;
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 34;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.ceil();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = new int[37];
        mant1[36] = 1;
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.exp = 34;
        expected.nans = java.lang.Byte.MIN_VALUE;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method ceil()
    
    @Test(expected = StackOverflowError.class)
    public void testCeil2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.exp = Integer.MIN_VALUE;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        DfpDec zero = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.ceil();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.rint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method rint()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#rint()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_HALF_EVEN);}
 *  */
    @Test
    public void testRint_ReturnTrunc() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 2;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.rint();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 2;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#rint()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_HALF_EVEN);}
 *  */
    @Test
    public void testRint_ReturnTrunc_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.rint();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) -127;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#rint()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_HALF_EVEN);}
 *  */
    @Test
    public void testRint_ReturnTrunc_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 2;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.rint();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-255};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.exp = 2;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#rint()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_HALF_EVEN);}
 *  */
    @Test
    public void testRint_ReturnTrunc_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.rint();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#rint()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_HALF_EVEN);}
 *  */
    @Test
    public void testRint_ReturnTrunc_4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, -255};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 1;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.rint();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0, -255};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.exp = 1;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#rint()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_HALF_EVEN);}
 *  */
    @Test
    public void testRint_ReturnTrunc_6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 3;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.rint();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#rint()}
 * @utbot.returnsFrom {@code return trunc(DfpField.RoundingMode.ROUND_HALF_EVEN);}
 *  */
    @Test
    public void testRint_ReturnTrunc_5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.exp = -1;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        DfpDec zero = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(field, "org.apache.commons.math.dfp.DfpField", "ieeeFlags", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.rint();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {};
        expected.mant = mant2;
        expected.sign = (byte) -127;
        expected.exp = -255;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(-239, finalDfpFieldIeeeFlags);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method rint()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#rint()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#trunc(org.apache.commons.math.dfp.DfpField.RoundingMode)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return trunc(DfpField.RoundingMode.ROUND_HALF_EVEN);
 *  */
    @Test
    public void testRint_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.nans = (byte) -127;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.rint] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.trunc(Dfp.java:969)
            org.apache.commons.math.dfp.Dfp.rint(Dfp.java:918) */
        dfp.rint();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method rint()
    
    @Test(expected = StackOverflowError.class)
    public void testRint1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.exp = Integer.MIN_VALUE;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        DfpDec zero = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.rint();
    }
    
    @Test
    public void testRint2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1, 0, 0, 0, 0, 0, 1};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.rint] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1333)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:528)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:612)
            org.apache.commons.math.dfp.Dfp.trunc(Dfp.java:1018)
            org.apache.commons.math.dfp.Dfp.rint(Dfp.java:918) */
        dfp.rint();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.compare
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method compare(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (a.sign != b.sign): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == FINITE): True}
 * @utbot.returnsFrom {@code return a.sign;}
 *  */
    @Test
    public void testCompare_BNansEqualsFINITE() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) 0;
        
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfp;
        compareMethodArguments[1] = dfp1;
        int actual = ((Integer) compareMethod.invoke(null, compareMethodArguments));
        
        org.junit.Assert.assertEquals(-127, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (a.sign != b.sign): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): False}
 * @utbot.executesCondition {@code (a.nans == FINITE): True}
 * @utbot.executesCondition {@code (b.nans == INFINITE): True}
 * @utbot.returnsFrom {@code return -b.sign;}
 *  */
    @Test
    public void testCompare_BNansEqualsINFINITE_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 0;
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) -127;
        dfp1.nans = (byte) 1;
        
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfp;
        compareMethodArguments[1] = dfp1;
        int actual = ((Integer) compareMethod.invoke(null, compareMethodArguments));
        
        org.junit.Assert.assertEquals(127, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): True}
 * @utbot.executesCondition {@code (b.mant[b.mant.length - 1] == 0): True}
 * @utbot.executesCondition {@code (a.nans == FINITE): True}
 * @utbot.executesCondition {@code (b.nans == FINITE): True}
 *  */
    @Test
    public void testCompare_BNansEqualsFINITE_1() throws Exception  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {0, 0};
        dfpDec.mant = mant;
        dfpDec.nans = (byte) 0;
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-254, 0};
        dfp.mant = mant1;
        dfp.nans = (byte) 0;
        
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfpDec;
        compareMethodArguments[1] = dfp;
        int actual = ((Integer) compareMethod.invoke(null, compareMethodArguments));
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (a.sign != b.sign): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == INFINITE): True}
 *  */
    @Test
    public void testCompare_BNansEqualsINFINITE() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfp;
        compareMethodArguments[1] = dfp;
        int actual = ((Integer) compareMethod.invoke(null, compareMethodArguments));
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (a.sign != b.sign): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == INFINITE): False}
 * @utbot.executesCondition {@code (b.mant[b.mant.length - 1] != 0): True}
 * @utbot.executesCondition {@code (a.mant[b.mant.length - 1] != 0): True}
 * @utbot.executesCondition {@code (a.exp < b.exp): False}
 * @utbot.executesCondition {@code (a.exp > b.exp): True}
 * @utbot.returnsFrom {@code return a.sign;}
 *  */
    @Test
    public void testCompare_AExpGreaterThanBExp() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, -255};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.exp = -125;
        dfp.nans = (byte) 1;
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {3, 1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) -127;
        dfp1.exp = -254;
        dfp1.nans = (byte) -127;
        
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfp;
        compareMethodArguments[1] = dfp1;
        int actual = ((Integer) compareMethod.invoke(null, compareMethodArguments));
        
        org.junit.Assert.assertEquals(-127, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (a.sign != b.sign): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == INFINITE): False}
 * @utbot.executesCondition {@code (b.mant[b.mant.length - 1] != 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = a.mant.length - 1; i >= 0; i--)} once
 *  */
    @Test
    public void testCompare_IOfAMantGreaterThanIOfBMant() throws Exception  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {-2};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.nans = (byte) 1;
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-3, 0};
        dfp.mant = mant1;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) -127;
        
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfpDec;
        compareMethodArguments[1] = dfp;
        int actual = ((Integer) compareMethod.invoke(null, compareMethodArguments));
        
        org.junit.Assert.assertEquals(-127, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (a.sign != b.sign): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == INFINITE): False}
 * @utbot.executesCondition {@code (b.mant[b.mant.length - 1] != 0): True}
 * @utbot.executesCondition {@code (a.mant[b.mant.length - 1] != 0): True}
 * @utbot.executesCondition {@code (a.exp < b.exp): True}
 * @utbot.returnsFrom {@code return -a.sign;}
 *  */
    @Test
    public void testCompare_AExpLessThanBExp() throws Exception  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {-255, -255};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.exp = 255;
        dfpDec.nans = (byte) 1;
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-2147483646, 1};
        dfp.mant = mant1;
        dfp.sign = (byte) -127;
        dfp.exp = 256;
        dfp.nans = (byte) -127;
        
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfpDec;
        compareMethodArguments[1] = dfp;
        int actual = ((Integer) compareMethod.invoke(null, compareMethodArguments));
        
        org.junit.Assert.assertEquals(127, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (a.sign != b.sign): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == INFINITE): False}
 * @utbot.executesCondition {@code (b.mant[b.mant.length - 1] != 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = a.mant.length - 1; i >= 0; i--)} once
 *  */
    @Test
    public void testCompare_IOfAMantLessThanIOfBMant() throws Exception  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {-255};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.nans = (byte) 1;
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-254, 0};
        dfp.mant = mant1;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) -127;
        
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfpDec;
        compareMethodArguments[1] = dfp;
        int actual = ((Integer) compareMethod.invoke(null, compareMethodArguments));
        
        org.junit.Assert.assertEquals(127, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (a.sign != b.sign): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == INFINITE): False}
 * @utbot.executesCondition {@code (b.mant[b.mant.length - 1] != 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = a.mant.length - 1; i >= 0; i--)} once
 *  */
    @Test
    public void testCompare_IOfAMantGreaterOrEqualIOfBMant() throws Exception  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {-255};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.nans = (byte) 1;
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-255, 0};
        dfp.mant = mant1;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) -127;
        
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfpDec;
        compareMethodArguments[1] = dfp;
        int actual = ((Integer) compareMethod.invoke(null, compareMethodArguments));
        
        org.junit.Assert.assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method compare(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (a.mant[a.mant.length - 1] == 0): True},
    ///     {@code (a.sign != b.sign): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (b.mant[b.mant.length - 1] == 0): True}
 * @utbot.executesCondition {@code (a.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.sign == -1): False}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testCompare_ASignNotEqualsNegative1() throws Exception  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {-254, 0};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) 0;
        dfpDec.nans = (byte) -127;
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-254, 0};
        dfp.mant = mant1;
        dfp.sign = java.lang.Byte.MIN_VALUE;
        
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfpDec;
        compareMethodArguments[1] = dfp;
        int actual = ((Integer) compareMethod.invoke(null, compareMethodArguments));
        
        org.junit.Assert.assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (b.mant[b.mant.length - 1] == 0): True}
 * @utbot.executesCondition {@code (a.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.sign == -1): True}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testCompare_ASignEqualsNegative1() throws Exception  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {0};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -1;
        dfpDec.nans = (byte) -127;
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        dfp.mant = mant1;
        dfp.sign = (byte) 0;
        
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfpDec;
        compareMethodArguments[1] = dfp;
        int actual = ((Integer) compareMethod.invoke(null, compareMethodArguments));
        
        org.junit.Assert.assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (b.mant[b.mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (a.sign == -1): False}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testCompare_BMantLength1OfBMantNotEqualsZero() throws Exception  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {0, 0};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) 0;
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-255, 1};
        dfp.mant = mant1;
        dfp.sign = java.lang.Byte.MIN_VALUE;
        
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfpDec;
        compareMethodArguments[1] = dfp;
        int actual = ((Integer) compareMethod.invoke(null, compareMethodArguments));
        
        org.junit.Assert.assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (b.mant[b.mant.length - 1] == 0): True}
 * @utbot.executesCondition {@code (a.nans == FINITE): True}
 * @utbot.executesCondition {@code (b.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.sign == -1): True}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testCompare_BNansNotEqualsFINITE() throws Exception  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {0};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -1;
        dfpDec.nans = (byte) 0;
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        dfp.mant = mant1;
        dfp.sign = (byte) 0;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfpDec;
        compareMethodArguments[1] = dfp;
        int actual = ((Integer) compareMethod.invoke(null, compareMethodArguments));
        
        org.junit.Assert.assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compare(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: a.mant[a.mant.length - 1] == 0 && b.mant[b.mant.length - 1] == 0 && a.nans == FINITE && b.nans == FINITE
 *  */
    @Test
    public void testCompare_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {-254, 0};
        dfpDec.mant = mant;
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        dfp.mant = mant1;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.compare] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860) */
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfpDec;
        compareMethodArguments[1] = dfp;
        try {
            compareMethod.invoke(null, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: a.mant[a.mant.length - 1] == 0 && b.mant[b.mant.length - 1] == 0 && a.nans == FINITE && b.nans == FINITE
 *  */
    @Test
    public void testCompare_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.compare] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860) */
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfp;
        compareMethodArguments[1] = ((Object) null);
        try {
            compareMethod.invoke(null, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (a.sign != b.sign): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == INFINITE): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: b.mant[b.mant.length - 1] != 0 && a.mant[b.mant.length - 1] != 0
 *  */
    @Test
    public void testCompare_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {-255, 1};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.nans = (byte) 1;
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        dfp.mant = mant1;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) -127;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.compare] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887) */
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfpDec;
        compareMethodArguments[1] = dfp;
        try {
            compareMethod.invoke(null, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (a.sign != b.sign): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == INFINITE): False}
 * @utbot.executesCondition {@code (b.mant[b.mant.length - 1] != 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: b.mant[b.mant.length - 1] != 0 && a.mant[b.mant.length - 1] != 0
 *  */
    @Test
    public void testCompare_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {-255};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.nans = (byte) 1;
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {-2147483646, 1};
        dfp.mant = mant1;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) -127;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.compare] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887) */
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfpDec;
        compareMethodArguments[1] = dfp;
        try {
            compareMethod.invoke(null, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (a.sign != b.sign): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == INFINITE): False}
 * @utbot.executesCondition {@code (b.mant[b.mant.length - 1] != 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = a.mant.length - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: a.mant[i] > b.mant[i]
 *  */
    @Test
    public void testCompare_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = new int[33];
        mant[0] = -255;
        mant[1] = -255;
        mant[2] = -255;
        mant[3] = -255;
        mant[4] = -255;
        mant[5] = -255;
        mant[6] = -255;
        mant[7] = -255;
        mant[8] = -255;
        mant[9] = 1;
        mant[10] = -255;
        mant[11] = -255;
        mant[12] = -255;
        mant[13] = -255;
        mant[14] = -255;
        mant[15] = -255;
        mant[16] = -255;
        mant[17] = -255;
        mant[18] = -255;
        mant[19] = -255;
        mant[20] = -255;
        mant[21] = -255;
        mant[22] = -255;
        mant[23] = -255;
        mant[24] = -255;
        mant[25] = -255;
        mant[26] = -255;
        mant[27] = -255;
        mant[28] = -255;
        mant[29] = -255;
        mant[30] = -255;
        mant[31] = -255;
        mant[32] = -255;
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.nans = (byte) 1;
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        dfp.mant = mant1;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) -127;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.compare] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:899) */
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfpDec;
        compareMethodArguments[1] = dfp;
        try {
            compareMethod.invoke(null, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (a.sign != b.sign): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == INFINITE): False}
 * @utbot.executesCondition {@code (b.mant[b.mant.length - 1] != 0): True}
 * @utbot.executesCondition {@code (a.mant[b.mant.length - 1] != 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = a.mant.length - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: a.mant[i] > b.mant[i]
 *  */
    @Test
    public void testCompare_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {0, -255};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.nans = (byte) 1;
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        dfp.mant = mant1;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) -127;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.compare] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:899) */
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfpDec;
        compareMethodArguments[1] = dfp;
        try {
            compareMethod.invoke(null, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (a.sign != b.sign): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == FINITE): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): True}
 * @utbot.executesCondition {@code (b.nans == INFINITE): False}
 * @utbot.executesCondition {@code (b.mant[b.mant.length - 1] != 0): True}
 * @utbot.executesCondition {@code (a.mant[b.mant.length - 1] != 0): True}
 * @utbot.executesCondition {@code (a.exp < b.exp): False}
 * @utbot.executesCondition {@code (a.exp > b.exp): False}
 * @utbot.iterates iterate the loop {@code for(int i = a.mant.length - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: a.mant[i] > b.mant[i]
 *  */
    @Test
    public void testCompare_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = new int[34];
        mant[0] = -255;
        mant[1] = 1;
        mant[2] = 1;
        mant[3] = -255;
        mant[4] = -255;
        mant[5] = -255;
        mant[6] = -255;
        mant[7] = -255;
        mant[8] = -255;
        mant[9] = -255;
        mant[10] = -255;
        mant[11] = -255;
        mant[12] = -255;
        mant[13] = -255;
        mant[14] = -255;
        mant[15] = -255;
        mant[16] = -255;
        mant[17] = -255;
        mant[18] = -255;
        mant[19] = -255;
        mant[20] = -255;
        mant[21] = -255;
        mant[22] = -255;
        mant[23] = -255;
        mant[24] = -255;
        mant[25] = -255;
        mant[26] = -255;
        mant[27] = -255;
        mant[28] = -255;
        mant[29] = -255;
        mant[30] = -255;
        mant[31] = -255;
        mant[32] = -255;
        mant[33] = -255;
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.exp = -126;
        dfp.nans = (byte) 1;
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {3, 1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) -127;
        dfp1.exp = -126;
        dfp1.nans = (byte) -127;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.compare] produces [java.lang.ArrayIndexOutOfBoundsException: Index 33 out of bounds for length 2]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:899) */
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfp;
        compareMethodArguments[1] = dfp1;
        try {
            compareMethod.invoke(null, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a.mant[a.mant.length - 1] == 0 && b.mant[b.mant.length - 1] == 0 && a.nans == FINITE && b.nans == FINITE
 *  */
    @Test
    public void testCompare_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.compare] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860) */
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = ((Object) null);
        compareMethodArguments[1] = ((Object) null);
        try {
            compareMethod.invoke(null, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a.mant[a.mant.length - 1] == 0 && b.mant[b.mant.length - 1] == 0 && a.nans == FINITE && b.nans == FINITE
 *  */
    @Test
    public void testCompare_ThrowNullPointerException_2() throws Throwable  {
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {-254, 0};
        dfpDec.mant = mant;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.compare] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860) */
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfpDec;
        compareMethodArguments[1] = ((Object) null);
        try {
            compareMethod.invoke(null, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a.sign != b.sign
 *  */
    @Test
    public void testCompare_ThrowNullPointerException_4() throws Throwable  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.compare] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:865) */
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfp;
        compareMethodArguments[1] = ((Object) null);
        try {
            compareMethod.invoke(null, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a.mant[a.mant.length - 1] == 0 && b.mant[b.mant.length - 1] == 0 && a.nans == FINITE && b.nans == FINITE
 *  */
    @Test
    public void testCompare_ThrowNullPointerException_1() throws Throwable  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.compare] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860) */
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfp;
        compareMethodArguments[1] = ((Object) null);
        try {
            compareMethod.invoke(null, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a.mant[a.mant.length - 1] == 0 && b.mant[b.mant.length - 1] == 0 && a.nans == FINITE && b.nans == FINITE
 *  */
    @Test
    public void testCompare_ThrowNullPointerException_3() throws Throwable  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.compare] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860) */
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfp;
        compareMethodArguments[1] = dfpDec;
        try {
            compareMethod.invoke(null, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#compare(org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (a.mant[a.mant.length - 1] == 0): False}
 * @utbot.executesCondition {@code (a.sign != b.sign): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): False}
 * @utbot.executesCondition {@code (a.nans == FINITE): True}
 * @utbot.executesCondition {@code (b.nans == INFINITE): False}
 * @utbot.executesCondition {@code (a.nans == INFINITE): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: b.mant[b.mant.length - 1] != 0 && a.mant[b.mant.length - 1] != 0
 *  */
    @Test
    public void testCompare_ThrowNullPointerException_5() throws Throwable  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 0;
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) -127;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.compare] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887) */
        Class dfpClazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method compareMethod = dfpClazz.getDeclaredMethod("compare", dfpClazz, dfpClazz);
        compareMethod.setAccessible(true);
        java.lang.Object[] compareMethodArguments = new java.lang.Object[2];
        compareMethodArguments[0] = dfp;
        compareMethodArguments[1] = dfp1;
        try {
            compareMethod.invoke(null, compareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.intValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method intValue()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#intValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: rounded = rint();
 *  */
    @Test
    public void testIntValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.nans = (byte) -127;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.intValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.trunc(Dfp.java:969)
            org.apache.commons.math.dfp.Dfp.rint(Dfp.java:918)
            org.apache.commons.math.dfp.Dfp.intValue(Dfp.java:1052) */
        dfp.intValue();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#intValue()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} when: rounded.greaterThan(newInstance(2147483647))
 *  */
    @Test
    public void testIntValue_ThrowNegativeArraySizeException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", Integer.MIN_VALUE);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.intValue] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:212)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:202)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:568)
            org.apache.commons.math.dfp.Dfp.intValue(Dfp.java:1054) */
        dfp.intValue();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#intValue()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} when: rounded.greaterThan(newInstance(2147483647))
 *  */
    @Test
    public void testIntValue_ThrowNegativeArraySizeException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 3;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", Integer.MIN_VALUE);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.intValue] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:212)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:202)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:568)
            org.apache.commons.math.dfp.Dfp.intValue(Dfp.java:1054) */
        dfp.intValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method intValue()
    
    @Test
    public void testIntValue1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 32);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.intValue();
        
        org.junit.Assert.assertEquals(Integer.MAX_VALUE, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method intValue()
    
    @Test
    public void testIntValue2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, Integer.MIN_VALUE};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 1073741824;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", Integer.MIN_VALUE);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.intValue] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:212)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:202)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:568)
            org.apache.commons.math.dfp.Dfp.intValue(Dfp.java:1054) */
        dfp.intValue();
    }
    
    @Test
    public void testIntValue3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 32);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.intValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.greaterThan(Dfp.java:794)
            org.apache.commons.math.dfp.Dfp.intValue(Dfp.java:1054) */
        dfp.intValue();
    }
    
    @Test
    public void testIntValue4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {
            0, 0, 0, 0, 0, 0, 0, 0,
            1
        };
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 6;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.intValue] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for int[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:234)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:202)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:568)
            org.apache.commons.math.dfp.Dfp.intValue(Dfp.java:1054) */
        dfp.intValue();
    }
    
    @Test
    public void testIntValue5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 3;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.intValue] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for int[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:234)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:202)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:568)
            org.apache.commons.math.dfp.Dfp.intValue(Dfp.java:1054) */
        dfp.intValue();
    }
    
    @Test
    public void testIntValue6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 2;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", Integer.MIN_VALUE);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.intValue] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:212)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:202)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:568)
            org.apache.commons.math.dfp.Dfp.intValue(Dfp.java:1054) */
        dfp.intValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testIntValue7() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.exp = Integer.MIN_VALUE;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.intValue();
    }
    
    @Test
    public void testIntValue8() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.exp = Integer.MIN_VALUE;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.intValue] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for int[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:234)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:202)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:568)
            org.apache.commons.math.dfp.Dfp.intValue(Dfp.java:1054) */
        dfp.intValue();
    }
    
    @Test
    public void testIntValue9() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1, 0, 1};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.intValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1333)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:528)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:612)
            org.apache.commons.math.dfp.Dfp.trunc(Dfp.java:1018)
            org.apache.commons.math.dfp.Dfp.rint(Dfp.java:918)
            org.apache.commons.math.dfp.Dfp.intValue(Dfp.java:1052) */
        dfp.intValue();
    }
    
    @Test
    public void testIntValue10() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 3;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 32);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.intValue] produces [java.lang.NullPointerException] */
        dfp.intValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.newInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newInstance(long)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(long)}
 * @utbot.returnsFrom {@code return new Dfp(getField(), x);}
 *  */
    @Test
    public void testNewInstance_Return() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.newInstance(0L);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        expected.mant = mant;
        expected.sign = (byte) 1;
        expected.nans = (byte) 0;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(long)}
 * @utbot.returnsFrom {@code return new Dfp(getField(), x);}
 *  */
    @Test
    public void testNewInstance_Return_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.newInstance(-15L);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {15};
        expected.mant = mant;
        expected.sign = (byte) -1;
        expected.exp = 1;
        expected.nans = (byte) 0;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newInstance(long)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(long)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return new Dfp(getField(), x);
 *  */
    @Test
    public void testNewInstance_ThrowNegativeArraySizeException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -256);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:212)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:576) */
        dfp.newInstance(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new Dfp(getField(), x);
 *  */
    @Test
    public void testNewInstance_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for int[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:234)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:576) */
        dfp.newInstance(1L);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new Dfp(getField(), x);
 *  */
    @Test
    public void testNewInstance_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for int[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:234)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:576) */
        dfp.newInstance(java.lang.Long.MIN_VALUE);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method newInstance(long)
    
    @Test
    public void testNewInstance1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 33);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.newInstance(java.lang.Long.MIN_VALUE);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = new int[33];
        mant[28] = 5808;
        mant[29] = 5477;
        mant[30] = 368;
        mant[31] = 3372;
        mant[32] = 922;
        expected.mant = mant;
        expected.sign = (byte) -1;
        expected.exp = 5;
        expected.nans = (byte) 0;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testNewInstance2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 32);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.newInstance(1L);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = new int[32];
        mant[31] = 1;
        expected.mant = mant;
        expected.sign = (byte) 1;
        expected.exp = 1;
        expected.nans = (byte) 0;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.newInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newInstance(double)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(double)}
 * @utbot.returnsFrom {@code return new Dfp(getField(), x);}
 *  */
    @Test
    public void testNewInstance_Return1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.newInstance(-0.0);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        expected.mant = mant;
        expected.sign = (byte) 1;
        expected.nans = (byte) 0;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(double)}
 * @utbot.returnsFrom {@code return new Dfp(getField(), x);}
 *  */
    @Test
    public void testNewInstance_Return_11() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.newInstance(java.lang.Double.NaN);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        expected.mant = mant;
        expected.sign = (byte) 1;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newInstance(double)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(double)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return new Dfp(getField(), x);
 *  */
    @Test
    public void testNewInstance_ThrowNegativeArraySizeException1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -256);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:259)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:584) */
        dfp.newInstance(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(double)}
 * @utbot.returnsFrom {@code return new Dfp(getField(), x);}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new Dfp(getField(), x);
 *  */
    @Test
    public void testNewInstance_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for int[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:234)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:302)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:584) */
        dfp.newInstance(-2.225073858507202E-308);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method newInstance(double)
    
    @Test
    public void testNewInstance3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 33);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.NullPointerException] */
        dfp.newInstance(2.225073858507202E-308);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.newInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newInstance(int)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(int)}
 * @utbot.returnsFrom {@code return new Dfp(getField(), x);}
 *  */
    @Test
    public void testNewInstance_Return2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.newInstance(0);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        expected.mant = mant;
        expected.sign = (byte) 1;
        expected.nans = (byte) 0;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(int)}
 * @utbot.returnsFrom {@code return new Dfp(getField(), x);}
 *  */
    @Test
    public void testNewInstance_Return_12() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.newInstance(128);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {128};
        expected.mant = mant;
        expected.sign = (byte) 1;
        expected.exp = 1;
        expected.nans = (byte) 0;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newInstance(int)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return new Dfp(getField(), x);
 *  */
    @Test
    public void testNewInstance_ThrowNegativeArraySizeException2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -256);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:212)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:202)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:568) */
        dfp.newInstance(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new Dfp(getField(), x);
 *  */
    @Test
    public void testNewInstance_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for int[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:234)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:202)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:568) */
        dfp.newInstance(-3);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.newInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newInstance(byte)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(byte)}
 * @utbot.returnsFrom {@code return new Dfp(getField(), x);}
 *  */
    @Test
    public void testNewInstance_Return3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.newInstance((byte) 0);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        expected.mant = mant;
        expected.sign = (byte) 1;
        expected.nans = (byte) 0;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(byte)}
 * @utbot.returnsFrom {@code return new Dfp(getField(), x);}
 *  */
    @Test
    public void testNewInstance_Return_13() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.newInstance((byte) -64);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {64};
        expected.mant = mant;
        expected.sign = (byte) -1;
        expected.exp = 1;
        expected.nans = (byte) 0;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newInstance(byte)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(byte)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return new Dfp(getField(), x);
 *  */
    @Test
    public void testNewInstance_ThrowNegativeArraySizeException3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -256);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:212)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:194)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:560) */
        dfp.newInstance((byte) -127);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(byte)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new Dfp(getField(), x);
 *  */
    @Test
    public void testNewInstance_ThrowArrayIndexOutOfBoundsException3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for int[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:234)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:194)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:560) */
        dfp.newInstance((byte) -3);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.newInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newInstance(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return new Dfp(d);}
 *  */
    @Test
    public void testNewInstance_Return4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp1.mant = mant;
        dfp1.sign = (byte) -127;
        dfp1.exp = -255;
        dfp1.nans = (byte) -112;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.newInstance(dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) -127;
        expected.exp = -255;
        expected.nans = (byte) -112;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (field.getRadixDigits() != d.field.getRadixDigits()): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#setIEEEFlagsBits(int)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#getZero()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.triggersRecursion newInstance, where the test return from: {@code return new Dfp(d);}
 * @utbot.returnsFrom {@code return dotrap(DfpField.FLAG_INVALID, NEW_INSTANCE_TRAP, d, result);}
 *  */
    @Test
    public void testNewInstance_FieldGetRadixDigitsNotEqualsDFieldGetRadixDigits() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        DfpDec zero = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(field, "org.apache.commons.math.dfp.DfpField", "ieeeFlags", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -2);
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        Dfp actual = dfp.newInstance(dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) -127;
        expected.exp = -255;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newInstance(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != d.field.getRadixDigits()
 *  */
    @Test
    public void testNewInstance_ThrowNullPointerException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:595) */
        dfp.newInstance(((Dfp) null));
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#getRadixDigits()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != d.field.getRadixDigits()
 *  */
    @Test
    public void testNewInstance_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:595) */
        dfp.newInstance(((Dfp) null));
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#getRadixDigits()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != d.field.getRadixDigits()
 *  */
    @Test
    public void testNewInstance_ThrowNullPointerException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:595) */
        dfp.newInstance(dfp1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.newInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newInstance(byte, byte)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(byte,byte)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#newDfp(byte,byte)}
 * @utbot.returnsFrom {@code return field.newDfp(sig, code);}
 *  */
    @Test
    public void testNewInstance_DfpFieldNewDfp() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.newInstance((byte) -127, (byte) -127);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        expected.mant = mant;
        expected.sign = (byte) -127;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newInstance(byte, byte)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(byte,byte)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#newDfp(byte,byte)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return field.newDfp(sig, code);
 *  */
    @Test
    public void testNewInstance_ThrowNegativeArraySizeException4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -256);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:541)
            org.apache.commons.math.dfp.DfpField.newDfp(DfpField.java:393)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:622) */
        dfp.newInstance((byte) -127, (byte) -127);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(byte,byte)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#newDfp(byte,byte)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return field.newDfp(sig, code);
 *  */
    @Test
    public void testNewInstance_ThrowNullPointerException1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:622) */
        dfp.newInstance((byte) -127, (byte) -127);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.newInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newInstance(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(java.lang.String)}
 * @utbot.returnsFrom {@code return new Dfp(field, s);}
 *  */
    @Test
    public void testNewInstance_Return5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 5);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        String string = "NaN";
        
        Dfp actual = dfp.newInstance(string);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, 0, 0, 0, 0};
        expected.mant = mant;
        expected.sign = (byte) 1;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(java.lang.String)}
 * @utbot.returnsFrom {@code return new Dfp(field, s);}
 *  */
    @Test
    public void testNewInstance_Return_14() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 5);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        String string = "Infinity";
        
        Dfp actual = dfp.newInstance(string);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, 0, 0, 0, 0};
        expected.mant = mant;
        expected.sign = (byte) 1;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newInstance(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return new Dfp(field, s);
 *  */
    @Test
    public void testNewInstance_ThrowNegativeArraySizeException5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -256);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:334)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:612) */
        dfp.newInstance(((String) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method newInstance(java.lang.String)
    
    @Test
    public void testNewInstance4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 5);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        String string = "e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:408)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:612) */
        dfp.newInstance(string);
    }
    
    @Test
    public void testNewInstance5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 5);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        String string = "";
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:408)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:612) */
        dfp.newInstance(string);
    }
    
    @Test
    public void testNewInstance6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 5);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        String string = "\u0000\u0000e\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1333)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:528)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:612) */
        dfp.newInstance(string);
    }
    
    @Test
    public void testNewInstance7() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 5);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        String string = "-I\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1333)
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:528)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:612) */
        dfp.newInstance(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.newInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newInstance()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#getField()}
 * @utbot.returnsFrom {@code return new Dfp(getField());}
 *  */
    @Test
    public void testNewInstance_DfpGetField() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.newInstance();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        expected.mant = mant;
        expected.sign = (byte) 1;
        expected.nans = (byte) 0;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newInstance()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#newInstance()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#getField()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return new Dfp(getField());
 *  */
    @Test
    public void testNewInstance_ThrowNegativeArraySizeException6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -256);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.newInstance] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:182)
            org.apache.commons.math.dfp.Dfp.newInstance(Dfp.java:552) */
        dfp.newInstance();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.getField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getField()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#getField()}
 * @utbot.returnsFrom {@code return field;}
 *  */
    @Test
    public void testGetField_ReturnField() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        DfpField actual = dfp.getField();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.isNaN
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNaN()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#isNaN()}
 * @utbot.returnsFrom {@code return (nans == QNAN) || (nans == SNAN);}
 *  */
    @Test
    public void testIsNaN_NansEqualsQNANOrNansEqualsSNAN() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 3;
        
        boolean actual = dfp.isNaN();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#isNaN()}
 * @utbot.returnsFrom {@code return (nans == QNAN) || (nans == SNAN);}
 *  */
    @Test
    public void testIsNaN_NansEqualsQNANOrNansEqualsSNAN_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 2;
        
        boolean actual = dfp.isNaN();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#isNaN()}
 * @utbot.returnsFrom {@code return (nans == QNAN) || (nans == SNAN);}
 *  */
    @Test
    public void testIsNaN_NansNotEqualsQNANOrNansNotEqualsSNAN() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        
        boolean actual = dfp.isNaN();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.complement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method complement(int)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#complement(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} once
 * @utbot.returnsFrom {@code return extra;}
 *  */
    @Test
    public void testComplement_IterateForLoop() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        
        int actual = dfp.complement(-255);
        
        org.junit.Assert.assertEquals(255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#complement(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} twice
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} twice
 * @utbot.returnsFrom {@code return extra;}
 *  */
    @Test
    public void testComplement_IterateForLoop_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255};
        dfp.mant = mant;
        
        int actual = dfp.complement(-255);
        
        org.junit.Assert.assertEquals(255, actual);
        
        int finalDfpMant0 = dfp.mant[0];
        
        org.junit.Assert.assertEquals(255, finalDfpMant0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method complement(int)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#complement(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < mant.length; i++)
 *  */
    @Test
    public void testComplement_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.complement] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.complement(Dfp.java:1146) */
        dfp.complement(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.isInfinite
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isInfinite()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#isInfinite()}
 * @utbot.returnsFrom {@code return nans == INFINITE;}
 *  */
    @Test
    public void testIsInfinite_NansNotEqualsINFINITE() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        
        boolean actual = dfp.isInfinite();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#isInfinite()}
 * @utbot.returnsFrom {@code return nans == INFINITE;}
 *  */
    @Test
    public void testIsInfinite_NansEqualsINFINITE() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 1;
        
        boolean actual = dfp.isInfinite();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.shiftLeft
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shiftLeft()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#shiftLeft()}
 *  */
    @Test
    public void testShiftLeft() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255};
        dfp.mant = mant;
        dfp.exp = -255;
        
        dfp.shiftLeft();
        
        int finalDfpMant0 = dfp.mant[0];
        int finalDfpExp = dfp.exp;
        
        org.junit.Assert.assertEquals(0, finalDfpMant0);
        
        org.junit.Assert.assertEquals(-256, finalDfpExp);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#shiftLeft()}
 * @utbot.iterates iterate the loop {@code for(int i = mant.length - 1; i > 0; i--)} once
 *  */
    @Test
    public void testShiftLeft_IterateForLoop() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        
        dfp.shiftLeft();
        
        int finalDfpMant0 = dfp.mant[0];
        int finalDfpMant1 = dfp.mant[1];
        int finalDfpExp = dfp.exp;
        
        org.junit.Assert.assertEquals(0, finalDfpMant0);
        
        org.junit.Assert.assertEquals(-255, finalDfpMant1);
        
        org.junit.Assert.assertEquals(-1, finalDfpExp);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method shiftLeft()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#shiftLeft()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: mant[0] = 0;
 *  */
    @Test
    public void testShiftLeft_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.shiftLeft] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.shiftLeft(Dfp.java:670) */
        dfp.shiftLeft();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#shiftLeft()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = mant.length - 1; i > 0; i--)
 *  */
    @Test
    public void testShiftLeft_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.shiftLeft] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.shiftLeft(Dfp.java:667) */
        dfp.shiftLeft();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.multiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method multiply(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#multiply(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMultiply_NansNotEqualsFINITE() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 3;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.multiply(dfp1);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(dfp, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#multiply(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (x.nans != FINITE): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#isNaN()}
 * @utbot.returnsFrom {@code return x;}
 *  */
    @Test
    public void testMultiply_XNansNotEqualsFINITE() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 2;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.multiply(dfp1);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(dfp1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiply(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#multiply(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (x.nans != FINITE): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int r = mant[i] * x.mant[j];
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {};
        dfp1.mant = mant2;
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1465) */
        dfp.multiply(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#multiply(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (x.nans != FINITE): False}
 * @utbot.executesCondition {@code ((sign == x.sign)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: result.mant[mant.length - 1] == 0
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) -126;
        dfp.exp = -255;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) -127;
        dfp1.exp = -255;
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1492) */
        dfp.multiply(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#multiply(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (x.nans != FINITE): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} twice
 * @utbot.iterates iterate the loop {@code for(int i = mant.length * 2 - 1; i >= 0; i--)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result.mant[mant.length - i - 1] = product[md - i];
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-110};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        DfpDec zero = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {-192};
        dfp1.mant = mant2;
        dfp1.nans = (byte) 0;
        DfpField field2 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field2, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field2);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1485) */
        dfp.multiply(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#multiply(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.executesCondition {@code (x.nans == FINITE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: nans == INFINITE && x.nans == FINITE && x.mant[mant.length - 1] != 0
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        zero.mant = mant;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        dfp1.mant = mant1;
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1432) */
        dfp.multiply(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#multiply(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1413) */
        dfp.multiply(((Dfp) null));
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#multiply(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1413) */
        dfp.multiply(((Dfp) null));
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#multiply(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1413) */
        dfp.multiply(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#multiply(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (x.nans == INFINITE): True}
 * @utbot.executesCondition {@code (nans == FINITE): False}
 * @utbot.executesCondition {@code (x.nans == INFINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (x.nans == INFINITE): True}
 * @utbot.executesCondition {@code (nans == FINITE): False}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int[] product = new int[mant.length * 2];
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException_6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 1;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1460) */
        dfp.multiply(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#multiply(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.executesCondition {@code (x.nans == FINITE): False}
 * @utbot.executesCondition {@code (x.nans == INFINITE): False}
 * @utbot.executesCondition {@code (x.nans == INFINITE): False}
 * @utbot.executesCondition {@code (x.nans == INFINITE): False}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.executesCondition {@code (x.nans == FINITE): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int[] product = new int[mant.length * 2];
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException_7() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1460) */
        dfp.multiply(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#multiply(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (x.nans != FINITE): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int r = mant[i] * x.mant[j];
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1465) */
        dfp.multiply(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#multiply(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.executesCondition {@code (x.nans == FINITE): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: nans == INFINITE && x.nans == FINITE && x.mant[mant.length - 1] != 0
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException_5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1432) */
        dfp.multiply(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#multiply(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.executesCondition {@code (x.nans == FINITE): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: nans == INFINITE && x.nans == FINITE && x.mant[mant.length - 1] != 0
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException_4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) -127;
        zero.exp = -255;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1432) */
        dfp.multiply(dfp1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method multiply(org.apache.commons.math.dfp.Dfp)
    
    @Test
    public void testMultiply1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", 4096);
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        Dfp actual = dfp.multiply(dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(1, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testMultiply2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {
            0, 26, 26, 26, 26, 26, 26, 26,
            26
        };
        dfp1.mant = mant2;
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.multiply(dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant3 = {};
        expected.mant = mant3;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        DfpField dfp1Field = ((DfpField) getFieldValue(dfp1, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfp1FieldIeeeFlags = ((Integer) getFieldValue(dfp1Field, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(1, finalDfpFieldIeeeFlags);
        
        org.junit.Assert.assertEquals(1, finalDfp1FieldIeeeFlags);
    }
    
    @Test
    public void testMultiply3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {
            1, 26, 26, 26, 26, 26, 26, 26,
            26
        };
        dfp1.mant = mant2;
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.multiply(dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant3 = {0};
        expected.mant = mant3;
        expected.sign = (byte) 0;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method multiply(org.apache.commons.math.dfp.Dfp)
    
    @Test(expected = StackOverflowError.class)
    public void testMultiply4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        dfp.multiply(dfp1);
    }
    
    @Test
    public void testMultiply5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 1;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1438) */
        dfp.multiply(dfp1);
    }
    
    @Test
    public void testMultiply6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 1;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException] */
        dfp.multiply(dfp1);
    }
    
    @Test
    public void testMultiply7() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {429991946};
        dfp.mant = mant;
        dfp.sign = java.lang.Byte.MIN_VALUE;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpDec zero = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = new int[17];
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = new int[20];
        mant2[0] = 1406020956;
        mant2[1] = 10000;
        mant2[2] = 10000;
        mant2[3] = 10000;
        mant2[4] = 10000;
        mant2[5] = 10000;
        mant2[6] = 10000;
        mant2[7] = 10000;
        mant2[8] = 10000;
        mant2[9] = 10000;
        mant2[10] = 10000;
        mant2[11] = 10000;
        mant2[12] = 10000;
        mant2[13] = 10000;
        mant2[14] = 10000;
        mant2[15] = 10000;
        mant2[16] = 10000;
        mant2[17] = 10000;
        mant2[18] = 10000;
        mant2[19] = 10000;
        dfp1.mant = mant2;
        dfp1.sign = (byte) 0;
        dfp1.nans = (byte) 0;
        DfpField field2 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field2);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1333)
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1501) */
        dfp.multiply(dfp1);
    }
    
    @Test
    public void testMultiply8() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {618659852};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpDec zero = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = new int[17];
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {1693927287};
        dfp1.mant = mant2;
        dfp1.sign = (byte) 0;
        dfp1.nans = (byte) 0;
        DfpField field2 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field2);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1333)
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1499) */
        dfp.multiply(dfp1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.multiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method multiply(int)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#multiply(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMultiply_Return() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.exp = -255;
        dfp.nans = (byte) 2;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.multiply(1);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(dfp, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#multiply(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMultiply_Return_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.exp = -255;
        dfp.nans = (byte) 3;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.multiply(1);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(dfp, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiply(int)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#multiply(int)}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: result.mant[mant.length - 1] == 0
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.exp = -255;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1563) */
        dfp.multiply(1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#multiply(int)}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#isNaN()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: result.mant[mant.length - 1] == 0
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.exp = -255;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1563) */
        dfp.multiply(1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method multiply(int)
    
    @Test
    public void testMultiply9() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.multiply(4);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method multiply(int)
    
    @Test
    public void testMultiply10() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1241084121};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1333)
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1567) */
        dfp.multiply(3709);
    }
    
    @Test
    public void testMultiply11() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1333)
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1567) */
        dfp.multiply(0);
    }
    
    @Test
    public void testMultiply12() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1244139424, 906511020};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 64;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1333)
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1567) */
        dfp.multiply(9357);
    }
    
    @Test
    public void testMultiply13() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, 0, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1333)
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1567) */
        dfp.multiply(0);
    }
    
    @Test
    public void testMultiply14() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException] */
        dfp.multiply(Integer.MIN_VALUE);
    }
    
    @Test
    public void testMultiply15() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException] */
        dfp.multiply(Integer.MIN_VALUE);
    }
    
    @Test
    public void testMultiply16() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpDec zero = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.multiply] produces [java.lang.NullPointerException] */
        dfp.multiply(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.round
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method round(int)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 *  */
    @Test
    public void testRound() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_FLOOR;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(1);
        
        org.junit.Assert.assertEquals(16, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 *  */
    @Test
    public void testRound_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_DOWN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(1);
        
        org.junit.Assert.assertEquals(16, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 * @utbot.executesCondition {@code (inc): False}
 * @utbot.executesCondition {@code (exp < MIN_EXP): False}
 * @utbot.executesCondition {@code (exp > MAX_EXP): False}
 * @utbot.executesCondition {@code (n != 0): False}
 * @utbot.activatesSwitch {@code switch(field.getRoundingMode()) case: ROUND_DOWN}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testRound_SwitchFieldGetRoundingModeCaseROUND_DOWN() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = -254;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_DOWN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 * @utbot.executesCondition {@code (inc = n > 5000 || (n == 5000 && (mant[0] & 1) == 0);): True}
 * @utbot.executesCondition {@code (inc = n > 5000 || (n == 5000 && (mant[0] & 1) == 0);): False}
 * @utbot.executesCondition {@code (inc): False}
 * @utbot.executesCondition {@code (exp < MIN_EXP): False}
 * @utbot.executesCondition {@code (exp > MAX_EXP): False}
 * @utbot.executesCondition {@code (n != 0): False}
 * @utbot.activatesSwitch {@code switch(field.getRoundingMode()) case: ROUND_HALF_ODD}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testRound_SwitchFieldGetRoundingModeCaseROUND_HALF_ODD() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = -32766;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_ODD;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 * @utbot.executesCondition {@code (inc = n >= 5000;): False}
 * @utbot.executesCondition {@code (inc): False}
 * @utbot.executesCondition {@code (exp < MIN_EXP): False}
 * @utbot.executesCondition {@code (exp > MAX_EXP): False}
 * @utbot.executesCondition {@code (n != 0): False}
 * @utbot.activatesSwitch {@code switch(field.getRoundingMode()) case: ROUND_HALF_UP}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testRound_SwitchFieldGetRoundingModeCaseROUND_HALF_UP() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = -32766;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_UP;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 * @utbot.executesCondition {@code (inc = n != 0;): False}
 * @utbot.executesCondition {@code (inc): False}
 * @utbot.executesCondition {@code (exp < MIN_EXP): False}
 * @utbot.executesCondition {@code (exp > MAX_EXP): False}
 * @utbot.executesCondition {@code (n != 0): False}
 * @utbot.activatesSwitch {@code switch(field.getRoundingMode()) case: ROUND_UP}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testRound_SwitchFieldGetRoundingModeCaseROUND_UP() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = -32766;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_UP;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 * @utbot.executesCondition {@code (inc = sign == -1 && n != 0;): True}
 * @utbot.executesCondition {@code (inc = sign == -1 && n != 0;): False}
 * @utbot.executesCondition {@code (inc): False}
 * @utbot.executesCondition {@code (exp < MIN_EXP): False}
 * @utbot.executesCondition {@code (exp > MAX_EXP): False}
 * @utbot.executesCondition {@code (n != 0): False}
 * @utbot.activatesSwitch {@code switch(field.getRoundingMode()) case: default}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testRound_SwitchFieldGetRoundingModeCasedefault() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) -1;
        dfp.exp = -32766;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_FLOOR;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 * @utbot.executesCondition {@code (inc = sign == 1 && n != 0;): True}
 * @utbot.executesCondition {@code (inc = sign == 1 && n != 0;): False}
 * @utbot.executesCondition {@code (inc): False}
 * @utbot.executesCondition {@code (exp < MIN_EXP): False}
 * @utbot.executesCondition {@code (exp > MAX_EXP): False}
 * @utbot.executesCondition {@code (n != 0): False}
 * @utbot.activatesSwitch {@code switch(field.getRoundingMode()) case: ROUND_CEIL}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testRound_SwitchFieldGetRoundingModeCaseROUND_CEIL() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) 1;
        dfp.exp = -32766;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_CEIL;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method round(int)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 * @utbot.executesCondition {@code (inc = n > 5000 || (n == 5000 && (mant[0] & 1) == 0);): True}
 * @utbot.executesCondition {@code (inc = n > 5000 || (n == 5000 && (mant[0] & 1) == 0);): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: inc = n > 5000 || (n == 5000 && (mant[0] & 1) == 0);
 *  */
    @Test
    public void testRound_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_ODD;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1355) */
        dfp.round(5000);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 * @utbot.executesCondition {@code (inc = n > 5000 || (n == 5000 && (mant[0] & 1) == 1);): True}
 * @utbot.executesCondition {@code (inc = n > 5000 || (n == 5000 && (mant[0] & 1) == 1);): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: inc = n > 5000 || (n == 5000 && (mant[0] & 1) == 1);
 *  */
    @Test
    public void testRound_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_EVEN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1351) */
        dfp.round(5000);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(field.getRoundingMode())
 *  */
    @Test
    public void testRound_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1333) */
        dfp.round(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(field.getRoundingMode())
 *  */
    @Test
    public void testRound_ThrowNullPointerException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1333) */
        dfp.round(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 * @utbot.executesCondition {@code (inc = n > 5000 || (n == 5000 && (mant[0] & 1) == 0);): True}
 * @utbot.executesCondition {@code (inc = n > 5000 || (n == 5000 && (mant[0] & 1) == 0);): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: inc = n > 5000 || (n == 5000 && (mant[0] & 1) == 0);
 *  */
    @Test
    public void testRound_ThrowNullPointerException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_ODD;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1355) */
        dfp.round(5000);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 * @utbot.executesCondition {@code (inc = n > 5000 || (n == 5000 && (mant[0] & 1) == 0);): False}
 * @utbot.executesCondition {@code (inc): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < mant.length; i++)
 *  */
    @Test
    public void testRound_ThrowNullPointerException_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_ODD;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1371) */
        dfp.round(5001);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 * @utbot.executesCondition {@code (inc = n > 5000 || (n == 5000 && (mant[0] & 1) == 1);): True}
 * @utbot.executesCondition {@code (inc = n > 5000 || (n == 5000 && (mant[0] & 1) == 1);): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: inc = n > 5000 || (n == 5000 && (mant[0] & 1) == 1);
 *  */
    @Test
    public void testRound_ThrowNullPointerException_4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_EVEN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1351) */
        dfp.round(5000);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 * @utbot.executesCondition {@code (inc = n > 5000 || (n == 5000 && (mant[0] & 1) == 1);): False}
 * @utbot.executesCondition {@code (inc): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < mant.length; i++)
 *  */
    @Test
    public void testRound_ThrowNullPointerException_5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_EVEN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1371) */
        dfp.round(5001);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 * @utbot.executesCondition {@code (inc = n >= 5000;): True}
 * @utbot.executesCondition {@code (inc): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} once
 * @utbot.activatesSwitch {@code switch(field.getRoundingMode()) case: ROUND_HALF_UP}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < mant.length; i++)
 *  */
    @Test
    public void testRound_ThrowNullPointerException_6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_UP;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1371) */
        dfp.round(5000);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 * @utbot.executesCondition {@code (inc = n > 5000;): True}
 * @utbot.executesCondition {@code (inc): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} once
 * @utbot.activatesSwitch {@code switch(field.getRoundingMode()) case: ROUND_HALF_DOWN}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < mant.length; i++)
 *  */
    @Test
    public void testRound_ThrowNullPointerException_7() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_DOWN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1371) */
        dfp.round(5001);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 * @utbot.executesCondition {@code (inc = sign == -1 && n != 0;): True}
 * @utbot.executesCondition {@code (inc = sign == -1 && n != 0;): True}
 * @utbot.executesCondition {@code (inc): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} once
 * @utbot.activatesSwitch {@code switch(field.getRoundingMode()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < mant.length; i++)
 *  */
    @Test
    public void testRound_ThrowNullPointerException_8() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) -1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_FLOOR;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1371) */
        dfp.round(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#round(int)}
 * @utbot.executesCondition {@code (inc = n != 0;): True}
 * @utbot.executesCondition {@code (inc): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} once
 * @utbot.activatesSwitch {@code switch(field.getRoundingMode()) case: ROUND_UP}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < mant.length; i++)
 *  */
    @Test
    public void testRound_ThrowNullPointerException_9() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_UP;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1371) */
        dfp.round(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method round(int)
    
    @Test
    public void testRound1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) 0;
        dfp.exp = 32770;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_FLOOR;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(4, actual);
    }
    
    @Test
    public void testRound2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_FLOOR;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    @Test
    public void testRound3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = 32770;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_ODD;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(-2147478647);
        
        org.junit.Assert.assertEquals(4, actual);
    }
    
    @Test
    public void testRound4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = Integer.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_ODD;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(-2147478647);
        
        org.junit.Assert.assertEquals(8, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(8, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testRound5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = -32766;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_ODD;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(-2147478647);
        
        org.junit.Assert.assertEquals(16, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(16, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testRound6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = -32766;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_UP;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(1);
        
        org.junit.Assert.assertEquals(16, actual);
    }
    
    @Test
    public void testRound7() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) -1;
        dfp.exp = Integer.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_FLOOR;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(8, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(8, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testRound8() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) 1;
        dfp.exp = 32770;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_CEIL;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(4, actual);
    }
    
    @Test
    public void testRound9() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = 32770;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_DOWN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(-2147478647);
        
        org.junit.Assert.assertEquals(4, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(4, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testRound10() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_DOWN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    @Test
    public void testRound11() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = Integer.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_DOWN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(8, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(8, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testRound12() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) 1;
        dfp.exp = Integer.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_CEIL;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(8, actual);
    }
    
    @Test
    public void testRound13() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = Integer.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_DOWN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(-2147478647);
        
        org.junit.Assert.assertEquals(8, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(8, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testRound14() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = Integer.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_UP;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(8, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(8, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testRound15() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = Integer.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_UP;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(8, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(8, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testRound16() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = 32770;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_UP;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(4, actual);
    }
    
    @Test
    public void testRound17() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) 0;
        dfp.exp = Integer.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_FLOOR;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(8, actual);
    }
    
    @Test
    public void testRound18() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = Integer.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_EVEN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(-2147478647);
        
        org.junit.Assert.assertEquals(8, actual);
    }
    
    @Test
    public void testRound19() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_EVEN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    @Test
    public void testRound20() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_CEIL;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    @Test
    public void testRound21() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.exp = 32770;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_DOWN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(0);
        
        org.junit.Assert.assertEquals(4, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(4, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testRound22() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        dfp.mant = mant;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_DOWN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(5001);
        
        org.junit.Assert.assertEquals(16, actual);
        
        int finalDfpMant0 = dfp.mant[0];
        
        org.junit.Assert.assertEquals(1, finalDfpMant0);
    }
    
    @Test
    public void testRound23() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {
            1, 26, 26, 26, 26, 26, 26, 26,
            26
        };
        dfp.mant = mant;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_ODD;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(5000);
        
        org.junit.Assert.assertEquals(16, actual);
    }
    
    @Test
    public void testRound24() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {
            1, 26, 26, 26, 26, 26, 26, 26,
            26
        };
        dfp.mant = mant;
        dfp.exp = Integer.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_ODD;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(5000);
        
        org.junit.Assert.assertEquals(8, actual);
    }
    
    @Test
    public void testRound25() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        dfp.mant = mant;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_EVEN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(5001);
        
        org.junit.Assert.assertEquals(16, actual);
        
        int finalDfpMant0 = dfp.mant[0];
        
        org.junit.Assert.assertEquals(1, finalDfpMant0);
    }
    
    @Test
    public void testRound26() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        dfp.mant = mant;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_ODD;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(5001);
        
        org.junit.Assert.assertEquals(16, actual);
        
        int finalDfpMant0 = dfp.mant[0];
        
        org.junit.Assert.assertEquals(1, finalDfpMant0);
    }
    
    @Test
    public void testRound27() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {
            0, 26, 26, 26, 26, 26, 26, 26,
            26
        };
        dfp.mant = mant;
        dfp.exp = 32770;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_EVEN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(5000);
        
        org.junit.Assert.assertEquals(4, actual);
    }
    
    @Test
    public void testRound28() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {
            0, 26, 26, 26, 26, 26, 26, 26,
            26
        };
        dfp.mant = mant;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_EVEN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(5000);
        
        org.junit.Assert.assertEquals(16, actual);
    }
    
    @Test
    public void testRound29() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {
            0, 26, 26, 26, 26, 26, 26, 26,
            26
        };
        dfp.mant = mant;
        dfp.exp = Integer.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_EVEN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(5000);
        
        org.junit.Assert.assertEquals(8, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(8, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testRound30() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_FLOOR;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(1);
        
        org.junit.Assert.assertEquals(16, actual);
        
        int finalDfpMant0 = dfp.mant[0];
        
        org.junit.Assert.assertEquals(1, finalDfpMant0);
    }
    
    @Test
    public void testRound31() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {
            0, 26, 26, 26, 26, 26, 26, 26,
            26
        };
        dfp.mant = mant;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_ODD;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(5000);
        
        org.junit.Assert.assertEquals(16, actual);
        
        int finalDfpMant0 = dfp.mant[0];
        
        org.junit.Assert.assertEquals(1, finalDfpMant0);
    }
    
    @Test
    public void testRound32() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        dfp.mant = mant;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_UP;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(1073741824);
        
        org.junit.Assert.assertEquals(16, actual);
        
        int finalDfpMant0 = dfp.mant[0];
        
        org.junit.Assert.assertEquals(1, finalDfpMant0);
    }
    
    @Test
    public void testRound33() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {
            1, 26, 26, 26, 26, 26, 26, 26,
            26
        };
        dfp.mant = mant;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_EVEN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int actual = dfp.round(5000);
        
        org.junit.Assert.assertEquals(16, actual);
        
        int finalDfpMant0 = dfp.mant[0];
        
        org.junit.Assert.assertEquals(2, finalDfpMant0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method round(int)
    
    @Test
    public void testRound34() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_ODD;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.shiftRight(Dfp.java:682)
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1378) */
        dfp.round(5001);
    }
    
    @Test
    public void testRound35() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_EVEN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.shiftRight(Dfp.java:682)
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1378) */
        dfp.round(5001);
    }
    
    @Test
    public void testRound36() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_UP;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.shiftRight(Dfp.java:682)
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1378) */
        dfp.round(1073741824);
    }
    
    @Test
    public void testRound37() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_HALF_DOWN;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.shiftRight(Dfp.java:682)
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1378) */
        dfp.round(5001);
    }
    
    @Test
    public void testRound38() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_FLOOR;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.shiftRight(Dfp.java:682)
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1378) */
        dfp.round(1);
    }
    
    @Test
    public void testRound39() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_UP;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.shiftRight(Dfp.java:682)
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1378) */
        dfp.round(1);
    }
    
    @Test
    public void testRound40() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        DfpField.RoundingMode rMode = DfpField.RoundingMode.ROUND_CEIL;
        setField(field, "org.apache.commons.math.dfp.DfpField", "rMode", rMode);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.round] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1371) */
        dfp.round(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.nextAfter
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextAfter(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#nextAfter(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: this.lessThan(x)
 *  */
    @Test
    public void testNextAfter_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        dfp1.mant = mant1;
        dfp1.nans = (byte) -126;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.nextAfter(Dfp.java:2243) */
        dfp.nextAfter(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#nextAfter(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: this.lessThan(x)
 *  */
    @Test
    public void testNextAfter_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.nans = (byte) -127;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.nextAfter(Dfp.java:2243) */
        dfp.nextAfter(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#nextAfter(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testNextAfter_ThrowNullPointerException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.nextAfter(Dfp.java:2234) */
        dfp.nextAfter(null);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#nextAfter(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testNextAfter_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.nextAfter(Dfp.java:2234) */
        dfp.nextAfter(null);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#nextAfter(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != x.field.getRadixDigits()
 *  */
    @Test
    public void testNextAfter_ThrowNullPointerException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.nextAfter(Dfp.java:2234) */
        dfp.nextAfter(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#nextAfter(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.lessThan(x)
 *  */
    @Test
    public void testNextAfter_ThrowNullPointerException_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-254, 0};
        dfp.mant = mant;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) -126;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.nextAfter(Dfp.java:2243) */
        dfp.nextAfter(dfp1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nextAfter(org.apache.commons.math.dfp.Dfp)
    
    @Test
    public void testNextAfter1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.mant = mant;
        dfp1.sign = (byte) 0;
        dfp1.exp = 1;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.nextAfter(dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.exp = 1;
        expected.nans = java.lang.Byte.MIN_VALUE;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testNextAfter2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1048576, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.exp = 1;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.exp = Integer.MIN_VALUE;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        Dfp actual = dfp.nextAfter(dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {1};
        expected.mant = mant2;
        expected.sign = (byte) 0;
        expected.exp = Integer.MIN_VALUE;
        expected.nans = java.lang.Byte.MIN_VALUE;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testNextAfter3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.mant = mant;
        dfp1.sign = (byte) 0;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.nextAfter(dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = java.lang.Byte.MIN_VALUE;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testNextAfter4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.mant = mant;
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.nextAfter(dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 0;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testNextAfter5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {Integer.MIN_VALUE, -2147483646, 0};
        dfpDec.mant = mant1;
        dfpDec.sign = (byte) 0;
        dfpDec.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        Dfp actual = dfp.nextAfter(dfpDec);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {Integer.MIN_VALUE, -2147483646, 0};
        expected.mant = mant2;
        expected.sign = (byte) 0;
        expected.nans = java.lang.Byte.MIN_VALUE;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testNextAfter6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        Dfp actual = dfp.nextAfter(dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {1};
        expected.mant = mant2;
        expected.sign = (byte) 0;
        expected.nans = java.lang.Byte.MIN_VALUE;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testNextAfter7() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.mant = mant;
        dfp1.sign = (byte) 0;
        dfp1.nans = (byte) 1;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.nextAfter(dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testNextAfter8() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.nans = (byte) 1;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.nextAfter(dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {1};
        expected.mant = mant2;
        expected.sign = (byte) 0;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testNextAfter9() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.nextAfter(dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {1};
        expected.mant = mant2;
        expected.sign = (byte) 0;
        expected.nans = (byte) 0;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextAfter(org.apache.commons.math.dfp.Dfp)
    
    @Test
    public void testNextAfter10() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, -2147483646, 1};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {1};
        dfpDec.mant = mant1;
        dfpDec.sign = (byte) 0;
        dfpDec.nans = java.lang.Byte.MIN_VALUE;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:899)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.nextAfter(Dfp.java:2243) */
        dfp.nextAfter(dfpDec);
    }
    
    @Test
    public void testNextAfter11() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1, -2147483646, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:899)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.nextAfter(Dfp.java:2243) */
        dfp.nextAfter(dfp1);
    }
    
    @Test
    public void testNextAfter12() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = new int[33];
        mant1[0] = 3;
        mant1[1] = 3;
        mant1[2] = 3;
        mant1[3] = 3;
        mant1[4] = 3;
        mant1[5] = 3;
        mant1[6] = 3;
        mant1[7] = 3;
        mant1[8] = 3;
        mant1[9] = 3;
        mant1[10] = 3;
        mant1[11] = 3;
        mant1[12] = 3;
        mant1[13] = 3;
        mant1[14] = 3;
        mant1[15] = 3;
        mant1[16] = 3;
        mant1[17] = 3;
        mant1[18] = 3;
        mant1[19] = 3;
        mant1[20] = 3;
        mant1[21] = 3;
        mant1[22] = 3;
        mant1[23] = 3;
        mant1[24] = 3;
        mant1[25] = 3;
        mant1[26] = 3;
        mant1[27] = 3;
        mant1[28] = 3;
        mant1[29] = 3;
        mant1[30] = 3;
        mant1[31] = 3;
        mant1[32] = 1;
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:887)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.nextAfter(Dfp.java:2243) */
        dfp.nextAfter(dfp1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testNextAfter13() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        dfp.nextAfter(dfp1);
    }
    
    @Test
    public void testNextAfter14() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.sign = java.lang.Byte.MIN_VALUE;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = java.lang.Byte.MIN_VALUE;
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:754)
            org.apache.commons.math.dfp.Dfp.nextAfter(Dfp.java:2251) */
        dfp.nextAfter(dfp1);
    }
    
    @Test
    public void testNextAfter15() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.sign = (byte) 0;
        dfp1.nans = (byte) 1;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.NullPointerException] */
        dfp.nextAfter(dfp1);
    }
    
    @Test
    public void testNextAfter16() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = java.lang.Byte.MIN_VALUE;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.mant = mant;
        dfp1.sign = (byte) 0;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:754)
            org.apache.commons.math.dfp.Dfp.nextAfter(Dfp.java:2251) */
        dfp.nextAfter(dfp1);
    }
    
    @Test
    public void testNextAfter17() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 125;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1, 0, 0};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 125;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:754)
            org.apache.commons.math.dfp.Dfp.nextAfter(Dfp.java:2251) */
        dfp.nextAfter(dfp1);
    }
    
    @Test
    public void testNextAfter18() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1, -2147483646, 0};
        dfp.mant = mant;
        dfp.sign = (byte) 125;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {1};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 125;
        dfp1.exp = 1;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:754)
            org.apache.commons.math.dfp.Dfp.nextAfter(Dfp.java:2251) */
        dfp.nextAfter(dfp1);
    }
    
    @Test
    public void testNextAfter19() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 125;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {1};
        dfpDec.mant = mant1;
        dfpDec.sign = (byte) 125;
        dfpDec.nans = (byte) 1;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:754)
            org.apache.commons.math.dfp.Dfp.nextAfter(Dfp.java:2251) */
        dfp.nextAfter(dfpDec);
    }
    
    @Test
    public void testNextAfter20() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) -1;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        dfp1.mant = mant1;
        dfp1.sign = (byte) 0;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:754)
            org.apache.commons.math.dfp.Dfp.nextAfter(Dfp.java:2251) */
        dfp.nextAfter(dfp1);
    }
    
    @Test
    public void testNextAfter21() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.lessThan(Dfp.java:769)
            org.apache.commons.math.dfp.Dfp.nextAfter(Dfp.java:2243) */
        dfp.nextAfter(dfp1);
    }
    
    @Test
    public void testNextAfter22() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 3;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.NullPointerException] */
        dfp.nextAfter(dfp1);
    }
    
    @Test
    public void testNextAfter23() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 2;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.nextAfter] produces [java.lang.NullPointerException] */
        dfp.nextAfter(dfp1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.negate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method negate()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#negate()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testNegate_DfpNewInstance() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.exp = -255;
        dfp.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.negate();
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = java.lang.Byte.MAX_VALUE;
        expected.exp = -255;
        expected.nans = (byte) -127;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.remainder
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remainder(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#remainder(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final Dfp result = this.subtract(this.divide(d).rint().multiply(d));
 *  */
    @Test
    public void testRemainder_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {0};
        dfp1.mant = mant1;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.remainder] produces [java.lang.ArrayIndexOutOfBoundsException] */
        dfp.remainder(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#remainder(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final Dfp result = this.subtract(this.divide(d).rint().multiply(d));
 *  */
    @Test
    public void testRemainder_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {};
        dfp1.mant = mant2;
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.remainder] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1633)
            org.apache.commons.math.dfp.Dfp.remainder(Dfp.java:943) */
        dfp.remainder(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#remainder(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: final Dfp result = this.subtract(this.divide(d).rint().multiply(d));
 *  */
    @Test
    public void testRemainder_ThrowArithmeticException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-4};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {-1, -255};
        dfp1.mant = mant2;
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.remainder] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1669)
            org.apache.commons.math.dfp.Dfp.remainder(Dfp.java:943) */
        dfp.remainder(dfp1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: TIMEOUTS for method remainder(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#remainder(org.apache.commons.math.dfp.Dfp)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#divide(org.apache.commons.math.dfp.Dfp)}
 * @utbot.detectsSuspiciousBehavior in: final Dfp result = this.subtract(this.divide(d).rint().multiply(d));
 *  */
    @Test(timeout = 1000L)
    public void testRemainder_DfpDivide() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {2, -255};
        dfp1.mant = mant2;
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        dfp.remainder(dfp1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method remainder(org.apache.commons.math.dfp.Dfp)
    
    @Test(expected = StackOverflowError.class)
    public void testRemainder1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        dfp.remainder(dfp1);
    }
    
    @Test
    public void testRemainder2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 1;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.remainder] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.trunc(Dfp.java:969)
            org.apache.commons.math.dfp.Dfp.rint(Dfp.java:918)
            org.apache.commons.math.dfp.Dfp.remainder(Dfp.java:943) */
        dfp.remainder(dfp1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testRemainder3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1073741824);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.remainder(dfp1);
    }
    
    @Test
    public void testRemainder4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {
            0, 26, 26, 26, 26, 26, 26, 26,
            26
        };
        dfp1.mant = mant2;
        dfp1.nans = (byte) 1;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.remainder] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.compare(Dfp.java:860)
            org.apache.commons.math.dfp.Dfp.add(Dfp.java:1222)
            org.apache.commons.math.dfp.Dfp.subtract(Dfp.java:1324)
            org.apache.commons.math.dfp.Dfp.remainder(Dfp.java:943) */
        dfp.remainder(dfp1);
    }
    
    @Test
    public void testRemainder5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {
            1, 26, 26, 26, 26, 26, 26, 26,
            26
        };
        dfp1.mant = mant2;
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.remainder] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1765)
            org.apache.commons.math.dfp.Dfp.remainder(Dfp.java:943) */
        dfp.remainder(dfp1);
    }
    
    @Test
    public void testRemainder6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {
            0, -1879048191, -1879048191, -1879048191, -1879048191, -1879048191, -1879048191, -1879048191,
            -1879048191
        };
        dfp1.mant = mant2;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.remainder] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.remainder(Dfp.java:946) */
        dfp.remainder(dfp1);
    }
    
    @Test
    public void testRemainder7() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant2 = {
            0, 26, 26, 26, 26, 26, 26, 26,
            26
        };
        dfpDec.mant = mant2;
        dfpDec.nans = java.lang.Byte.MIN_VALUE;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.remainder] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.multiply(Dfp.java:1492)
            org.apache.commons.math.dfp.Dfp.remainder(Dfp.java:943) */
        dfp.remainder(dfpDec);
    }
    
    @Test
    public void testRemainder8() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {
            0, -1879048191, -1879048191, -1879048191, -1879048191, -1879048191, -1879048191, -1879048191,
            -1879048191
        };
        dfp1.mant = mant2;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.remainder] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.remainder(Dfp.java:946) */
        dfp.remainder(dfp1);
    }
    
    @Test
    public void testRemainder9() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field2 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field2, "org.apache.commons.math.dfp.DfpField", "radixDigits", 4096);
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field2);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.remainder] produces [java.lang.NullPointerException] */
        dfp.remainder(dfp1);
    }
    
    @Test
    public void testRemainder10() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.remainder] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.remainder(Dfp.java:946) */
        dfp.remainder(dfp);
    }
    
    @Test
    public void testRemainder11() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        dfpDec.nans = (byte) 3;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.remainder] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.<init>(Dfp.java:320)
            org.apache.commons.math.dfp.DfpDec.<init>(DfpDec.java:73)
            org.apache.commons.math.dfp.DfpDec.newInstance(DfpDec.java:138)
            org.apache.commons.math.dfp.Dfp.trunc(Dfp.java:962)
            org.apache.commons.math.dfp.Dfp.rint(Dfp.java:918)
            org.apache.commons.math.dfp.Dfp.remainder(Dfp.java:943) */
        dfp.remainder(dfpDec);
    }
    
    @Test
    public void testRemainder12() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.remainder] produces [java.lang.NullPointerException] */
        dfp.remainder(dfp1);
    }
    
    @Test
    public void testRemainder13() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 2;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.remainder] produces [java.lang.NullPointerException] */
        dfp.remainder(dfp1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.divide
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method divide(int)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDivide_Return() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 3;
        
        Dfp actual = dfp.divide(-255);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(dfp, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDivide_Return_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 2;
        
        Dfp actual = dfp.divide(-255);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(dfp, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(int)}
 * @utbot.executesCondition {@code (nans == INFINITE): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return newInstance(this);}
 *  */
    @Test
    public void testDivide_NansEqualsINFINITE() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.divide(-255);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method divide(int)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(int)}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (divisor == 0): False}
 * @utbot.executesCondition {@code (divisor < 0): False}
 * @utbot.executesCondition {@code (divisor >= RADIX): False}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: result.mant[mant.length - 1] == 0
 *  */
    @Test
    public void testDivide_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) -127;
        dfp.exp = -255;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.divide] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1836) */
        dfp.divide(1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(int)}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (divisor == 0): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#setIEEEFlagsBits(int)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#getZero()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#newInstance(org.apache.commons.math.dfp.Dfp)}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#getZero()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#dotrap(int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result = dotrap(DfpField.FLAG_DIV_ZERO, DIVIDE_TRAP, getZero(), result);
 *  */
    @Test
    public void testDivide_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.exp = -255;
        zero.nans = (byte) -127;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(field, "org.apache.commons.math.dfp.DfpField", "ieeeFlags", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.divide] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.dotrap(Dfp.java:2144)
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1813) */
        dfp.divide(0);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(int)}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (divisor == 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: field.setIEEEFlagsBits(DfpField.FLAG_DIV_ZERO);
 *  */
    @Test
    public void testDivide_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1809) */
        dfp.divide(0);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(int)}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (divisor == 0): False}
 * @utbot.executesCondition {@code (divisor < 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
 *  */
    @Test
    public void testDivide_ThrowNullPointerException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1819) */
        dfp.divide(-1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(int)}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (divisor == 0): False}
 * @utbot.executesCondition {@code (divisor < 0): False}
 * @utbot.executesCondition {@code (divisor >= RADIX): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
 *  */
    @Test
    public void testDivide_ThrowNullPointerException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1819) */
        dfp.divide(10000);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(int)}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (divisor == 0): False}
 * @utbot.executesCondition {@code (divisor < 0): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#isNaN()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
 *  */
    @Test
    public void testDivide_ThrowNullPointerException_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) -127;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1819) */
        dfp.divide(-1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method divide(int)
    
    @Test
    public void testDivide1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) 0;
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.divide(0);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(2, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testDivide2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.divide(1073741824);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(1, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testDivide3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.divide(Integer.MIN_VALUE);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(1, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testDivide4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.divide(1073741824);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(1, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testDivide5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.divide(Integer.MIN_VALUE);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(1, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testDivide6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {1};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.divide(0);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {};
        expected.mant = mant2;
        expected.sign = (byte) 0;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(2, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testDivide7() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.divide(0);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {};
        expected.mant = mant2;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(2, finalDfpFieldIeeeFlags);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method divide(int)
    
    @Test
    public void testDivide8() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 4;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.divide] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1836) */
        dfp.divide(1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDivide9() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.divide(536870912);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDivide10() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.divide(0);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDivide11() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.divide(1073741824);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDivide12() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.divide(Integer.MIN_VALUE);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDivide13() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.divide(Integer.MIN_VALUE);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDivide14() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        dfp.divide(0);
    }
    
    @Test
    public void testDivide15() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, -1};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1333)
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1845) */
        dfp.divide(1072);
    }
    
    @Test
    public void testDivide16() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0, 16384};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1333)
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1845) */
        dfp.divide(8193);
    }
    
    @Test
    public void testDivide17() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = new int[32];
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 4;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.round(Dfp.java:1333)
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1845) */
        dfp.divide(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.divide
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method divide(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans != FINITE): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDivide_NansNotEqualsFINITE() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 2;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.divide(dfp1);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(dfp, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (divisor.nans != FINITE): True}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#isNaN()}
 * @utbot.returnsFrom {@code return divisor;}
 *  */
    @Test
    public void testDivide_DivisorNansNotEqualsFINITE() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 3;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.divide(dfp1);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(dfp1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method divide(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (divisor.nans != FINITE): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: divisor.mant[mant.length - 1] == 0
 *  */
    @Test
    public void testDivide_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {-255};
        dfp1.mant = mant2;
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.divide] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1633) */
        dfp.divide(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != divisor.field.getRadixDigits()
 *  */
    @Test
    public void testDivide_ThrowNullPointerException_11() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1592) */
        dfp.divide(((Dfp) null));
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != divisor.field.getRadixDigits()
 *  */
    @Test
    public void testDivide_ThrowNullPointerException1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1592) */
        dfp.divide(((Dfp) null));
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.getRadixDigits() != divisor.field.getRadixDigits()
 *  */
    @Test
    public void testDivide_ThrowNullPointerException_21() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1592) */
        dfp.divide(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (divisor.nans != FINITE): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: divisor.mant[mant.length - 1] == 0
 *  */
    @Test
    public void testDivide_ThrowNullPointerException_31() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1633) */
        dfp.divide(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(org.apache.commons.math.dfp.Dfp)}
 * @utbot.executesCondition {@code (nans != FINITE): False}
 * @utbot.executesCondition {@code (divisor.nans != FINITE): True}
 * @utbot.executesCondition {@code (nans == INFINITE): False}
 * @utbot.executesCondition {@code (divisor.nans == INFINITE): False}
 * @utbot.executesCondition {@code (divisor.nans == INFINITE): False}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#isNaN()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.Dfp#isNaN()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: divisor.mant[mant.length - 1] == 0
 *  */
    @Test
    public void testDivide_ThrowNullPointerException_4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) -127;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1633) */
        dfp.divide(dfp1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: TIMEOUTS for method divide(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(org.apache.commons.math.dfp.Dfp)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} twice
 * @utbot.iterates iterate the loop {@code for(qd = mant.length + 1; qd >= 0; qd--)} once
 * @utbot.detectsSuspiciousBehavior in: int min = divMsb / (divisor.mant[mant.length - 1] + 1);
 *  */
    @Test(timeout = 1000L)
    public void testDivide_TimeoutExceeded() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-1};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {-255, -255};
        dfp1.mant = mant2;
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        dfp.divide(dfp1);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#divide(org.apache.commons.math.dfp.Dfp)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length; i++)} twice
 * @utbot.iterates iterate the loop {@code for(qd = mant.length + 1; qd >= 0; qd--)} once
 * @utbot.detectsSuspiciousBehavior in: int max = (divMsb + 1) / divisor.mant[mant.length - 1];
 *  */
    @Test(timeout = 1000L)
    public void testDivide_TimeoutExceeded_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {-255, -255};
        dfp1.mant = mant2;
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        dfp.divide(dfp1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method divide(org.apache.commons.math.dfp.Dfp)
    
    @Test
    public void testDivide18() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field1, "org.apache.commons.math.dfp.DfpField", "radixDigits", 4096);
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        Dfp actual = dfp.divide(((Dfp) dfpDec));
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(1, finalDfpFieldIeeeFlags);
    }
    
    @Test
    public void testDivide19() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 1;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.divide(dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        expected.mant = mant1;
        expected.sign = (byte) 0;
        expected.nans = (byte) 0;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide20() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {
            0, 26, 26, 26, 26, 26, 26, 26,
            26
        };
        dfp1.mant = mant2;
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.divide(dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant3 = {};
        expected.mant = mant3;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        DfpField dfp1Field = ((DfpField) getFieldValue(dfp1, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfp1FieldIeeeFlags = ((Integer) getFieldValue(dfp1Field, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(2, finalDfpFieldIeeeFlags);
        
        org.junit.Assert.assertEquals(2, finalDfp1FieldIeeeFlags);
    }
    
    @Test
    public void testDivide21() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {
            0, 26, 26, 26, 26, 26, 26, 26,
            26
        };
        dfp1.mant = mant2;
        dfp1.nans = java.lang.Byte.MIN_VALUE;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.divide(dfp1);
        
        Dfp expected = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant3 = {};
        expected.mant = mant3;
        expected.sign = (byte) 0;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        DfpField dfpField = ((DfpField) getFieldValue(dfp, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfpFieldIeeeFlags = ((Integer) getFieldValue(dfpField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        DfpField dfp1Field = ((DfpField) getFieldValue(dfp1, "org.apache.commons.math.dfp.Dfp", "field"));
        int finalDfp1FieldIeeeFlags = ((Integer) getFieldValue(dfp1Field, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        
        org.junit.Assert.assertEquals(2, finalDfpFieldIeeeFlags);
        
        org.junit.Assert.assertEquals(2, finalDfp1FieldIeeeFlags);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method divide(org.apache.commons.math.dfp.Dfp)
    
    @Test(expected = StackOverflowError.class)
    public void testDivide22() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 1);
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field1 = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field1);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field1);
        
        dfp.divide(dfp1);
    }
    
    @Test
    public void testDivide23() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {0};
        dfp.mant = mant;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant1 = {};
        zero.mant = mant1;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant2 = {
            1, 26, 26, 26, 26, 26, 26, 26,
            26
        };
        dfp1.mant = mant2;
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.divide] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1765) */
        dfp.divide(dfp1);
    }
    
    @Test
    public void testDivide24() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        Dfp zero = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        zero.mant = mant;
        zero.sign = (byte) 0;
        zero.nans = (byte) 0;
        setField(zero, "org.apache.commons.math.dfp.Dfp", "field", field);
        setField(field, "org.apache.commons.math.dfp.DfpField", "zero", zero);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        Dfp dfp1 = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp1.nans = (byte) 0;
        setField(dfp1, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.divide(Dfp.java:1633) */
        dfp.divide(dfp1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#subtract(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return add(x.negate());}
 *  */
    @Test
    public void testSubtract_ReturnAdd_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {-254, 0};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.exp = -255;
        dfpDec.nans = (byte) 3;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        DfpDec actual = ((DfpDec) dfp.subtract(((Dfp) dfpDec)));
        
        DfpDec expected = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {-254, 0};
        expected.mant = mant1;
        expected.sign = java.lang.Byte.MAX_VALUE;
        expected.exp = -255;
        expected.nans = (byte) 3;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int[] expectedMant = expected.mant;
        int[] actualMant = actual.mant;
        int expectedMantSize = expectedMant.length;
        org.junit.Assert.assertEquals(expectedMantSize, actualMant.length);
        assertArrayEquals(expectedMant, actualMant);
        
        byte expectedSign = expected.sign;
        byte actualSign = actual.sign;
        org.junit.Assert.assertEquals(expectedSign, actualSign);
        
        int expectedExp = expected.exp;
        int actualExp = actual.exp;
        org.junit.Assert.assertEquals(expectedExp, actualExp);
        
        byte expectedNans = expected.nans;
        byte actualNans = actual.nans;
        org.junit.Assert.assertEquals(expectedNans, actualNans);
        
        DfpField expectedField = expected.getField();
        DfpField actualField = actual.getField();
        int expectedFieldRadixDigits = expectedField.getRadixDigits();
        int actualFieldRadixDigits = actualField.getRadixDigits();
        org.junit.Assert.assertEquals(expectedFieldRadixDigits, actualFieldRadixDigits);
        
        Dfp actualFieldZero = actualField.getZero();
        assertNull(actualFieldZero);
        
        Dfp actualFieldOne = actualField.getOne();
        assertNull(actualFieldOne);
        
        Dfp actualFieldTwo = actualField.getTwo();
        assertNull(actualFieldTwo);
        
        Dfp actualFieldSqr2 = actualField.getSqr2();
        assertNull(actualFieldSqr2);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldSqr2Split = actualField.getSqr2Split();
        assertNull(actualFieldSqr2Split);
        
        Dfp actualFieldSqr2Reciprocal = actualField.getSqr2Reciprocal();
        assertNull(actualFieldSqr2Reciprocal);
        
        Dfp actualFieldSqr3 = actualField.getSqr3();
        assertNull(actualFieldSqr3);
        
        Dfp actualFieldSqr3Reciprocal = actualField.getSqr3Reciprocal();
        assertNull(actualFieldSqr3Reciprocal);
        
        Dfp actualFieldPi = actualField.getPi();
        assertNull(actualFieldPi);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldPiSplit = actualField.getPiSplit();
        assertNull(actualFieldPiSplit);
        
        Dfp actualFieldE = actualField.getE();
        assertNull(actualFieldE);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldESplit = actualField.getESplit();
        assertNull(actualFieldESplit);
        
        Dfp actualFieldLn2 = actualField.getLn2();
        assertNull(actualFieldLn2);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldLn2Split = actualField.getLn2Split();
        assertNull(actualFieldLn2Split);
        
        Dfp actualFieldLn5 = actualField.getLn5();
        assertNull(actualFieldLn5);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldLn5Split = actualField.getLn5Split();
        assertNull(actualFieldLn5Split);
        
        Dfp actualFieldLn10 = actualField.getLn10();
        assertNull(actualFieldLn10);
        
        DfpField.RoundingMode actualFieldRMode = ((DfpField.RoundingMode) getFieldValue(actualField, "org.apache.commons.math.dfp.DfpField", "rMode"));
        assertNull(actualFieldRMode);
        
        int expectedFieldIeeeFlags = ((Integer) getFieldValue(expectedField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        int actualFieldIeeeFlags = ((Integer) getFieldValue(actualField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        org.junit.Assert.assertEquals(expectedFieldIeeeFlags, actualFieldIeeeFlags);
        
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#subtract(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return add(x.negate());}
 *  */
    @Test
    public void testSubtract_ReturnAdd_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {-254, 0};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.exp = -255;
        dfpDec.nans = (byte) 1;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        DfpDec actual = ((DfpDec) dfp.subtract(((Dfp) dfpDec)));
        
        DfpDec expected = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {-254, 0};
        expected.mant = mant1;
        expected.sign = java.lang.Byte.MAX_VALUE;
        expected.exp = -255;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int[] expectedMant = expected.mant;
        int[] actualMant = actual.mant;
        int expectedMantSize = expectedMant.length;
        org.junit.Assert.assertEquals(expectedMantSize, actualMant.length);
        assertArrayEquals(expectedMant, actualMant);
        
        byte expectedSign = expected.sign;
        byte actualSign = actual.sign;
        org.junit.Assert.assertEquals(expectedSign, actualSign);
        
        int expectedExp = expected.exp;
        int actualExp = actual.exp;
        org.junit.Assert.assertEquals(expectedExp, actualExp);
        
        byte expectedNans = expected.nans;
        byte actualNans = actual.nans;
        org.junit.Assert.assertEquals(expectedNans, actualNans);
        
        DfpField expectedField = expected.getField();
        DfpField actualField = actual.getField();
        int expectedFieldRadixDigits = expectedField.getRadixDigits();
        int actualFieldRadixDigits = actualField.getRadixDigits();
        org.junit.Assert.assertEquals(expectedFieldRadixDigits, actualFieldRadixDigits);
        
        Dfp actualFieldZero = actualField.getZero();
        assertNull(actualFieldZero);
        
        Dfp actualFieldOne = actualField.getOne();
        assertNull(actualFieldOne);
        
        Dfp actualFieldTwo = actualField.getTwo();
        assertNull(actualFieldTwo);
        
        Dfp actualFieldSqr2 = actualField.getSqr2();
        assertNull(actualFieldSqr2);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldSqr2Split = actualField.getSqr2Split();
        assertNull(actualFieldSqr2Split);
        
        Dfp actualFieldSqr2Reciprocal = actualField.getSqr2Reciprocal();
        assertNull(actualFieldSqr2Reciprocal);
        
        Dfp actualFieldSqr3 = actualField.getSqr3();
        assertNull(actualFieldSqr3);
        
        Dfp actualFieldSqr3Reciprocal = actualField.getSqr3Reciprocal();
        assertNull(actualFieldSqr3Reciprocal);
        
        Dfp actualFieldPi = actualField.getPi();
        assertNull(actualFieldPi);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldPiSplit = actualField.getPiSplit();
        assertNull(actualFieldPiSplit);
        
        Dfp actualFieldE = actualField.getE();
        assertNull(actualFieldE);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldESplit = actualField.getESplit();
        assertNull(actualFieldESplit);
        
        Dfp actualFieldLn2 = actualField.getLn2();
        assertNull(actualFieldLn2);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldLn2Split = actualField.getLn2Split();
        assertNull(actualFieldLn2Split);
        
        Dfp actualFieldLn5 = actualField.getLn5();
        assertNull(actualFieldLn5);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldLn5Split = actualField.getLn5Split();
        assertNull(actualFieldLn5Split);
        
        Dfp actualFieldLn10 = actualField.getLn10();
        assertNull(actualFieldLn10);
        
        DfpField.RoundingMode actualFieldRMode = ((DfpField.RoundingMode) getFieldValue(actualField, "org.apache.commons.math.dfp.DfpField", "rMode"));
        assertNull(actualFieldRMode);
        
        int expectedFieldIeeeFlags = ((Integer) getFieldValue(expectedField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        int actualFieldIeeeFlags = ((Integer) getFieldValue(actualField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        org.junit.Assert.assertEquals(expectedFieldIeeeFlags, actualFieldIeeeFlags);
        
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#subtract(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return add(x.negate());}
 *  */
    @Test
    public void testSubtract_ReturnAdd_4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = (byte) -127;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {-254, 0};
        dfpDec.mant = mant;
        dfpDec.sign = java.lang.Byte.MAX_VALUE;
        dfpDec.exp = -255;
        dfpDec.nans = (byte) 1;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        DfpDec actual = ((DfpDec) dfp.subtract(((Dfp) dfpDec)));
        
        DfpDec expected = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant1 = {-254, 0};
        expected.mant = mant1;
        expected.sign = (byte) -127;
        expected.exp = -255;
        expected.nans = (byte) 1;
        setField(expected, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        int[] expectedMant = expected.mant;
        int[] actualMant = actual.mant;
        int expectedMantSize = expectedMant.length;
        org.junit.Assert.assertEquals(expectedMantSize, actualMant.length);
        assertArrayEquals(expectedMant, actualMant);
        
        byte expectedSign = expected.sign;
        byte actualSign = actual.sign;
        org.junit.Assert.assertEquals(expectedSign, actualSign);
        
        int expectedExp = expected.exp;
        int actualExp = actual.exp;
        org.junit.Assert.assertEquals(expectedExp, actualExp);
        
        byte expectedNans = expected.nans;
        byte actualNans = actual.nans;
        org.junit.Assert.assertEquals(expectedNans, actualNans);
        
        DfpField expectedField = expected.getField();
        DfpField actualField = actual.getField();
        int expectedFieldRadixDigits = expectedField.getRadixDigits();
        int actualFieldRadixDigits = actualField.getRadixDigits();
        org.junit.Assert.assertEquals(expectedFieldRadixDigits, actualFieldRadixDigits);
        
        Dfp actualFieldZero = actualField.getZero();
        assertNull(actualFieldZero);
        
        Dfp actualFieldOne = actualField.getOne();
        assertNull(actualFieldOne);
        
        Dfp actualFieldTwo = actualField.getTwo();
        assertNull(actualFieldTwo);
        
        Dfp actualFieldSqr2 = actualField.getSqr2();
        assertNull(actualFieldSqr2);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldSqr2Split = actualField.getSqr2Split();
        assertNull(actualFieldSqr2Split);
        
        Dfp actualFieldSqr2Reciprocal = actualField.getSqr2Reciprocal();
        assertNull(actualFieldSqr2Reciprocal);
        
        Dfp actualFieldSqr3 = actualField.getSqr3();
        assertNull(actualFieldSqr3);
        
        Dfp actualFieldSqr3Reciprocal = actualField.getSqr3Reciprocal();
        assertNull(actualFieldSqr3Reciprocal);
        
        Dfp actualFieldPi = actualField.getPi();
        assertNull(actualFieldPi);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldPiSplit = actualField.getPiSplit();
        assertNull(actualFieldPiSplit);
        
        Dfp actualFieldE = actualField.getE();
        assertNull(actualFieldE);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldESplit = actualField.getESplit();
        assertNull(actualFieldESplit);
        
        Dfp actualFieldLn2 = actualField.getLn2();
        assertNull(actualFieldLn2);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldLn2Split = actualField.getLn2Split();
        assertNull(actualFieldLn2Split);
        
        Dfp actualFieldLn5 = actualField.getLn5();
        assertNull(actualFieldLn5);
        
        org.apache.commons.math.dfp.Dfp[] actualFieldLn5Split = actualField.getLn5Split();
        assertNull(actualFieldLn5Split);
        
        Dfp actualFieldLn10 = actualField.getLn10();
        assertNull(actualFieldLn10);
        
        DfpField.RoundingMode actualFieldRMode = ((DfpField.RoundingMode) getFieldValue(actualField, "org.apache.commons.math.dfp.DfpField", "rMode"));
        assertNull(actualFieldRMode);
        
        int expectedFieldIeeeFlags = ((Integer) getFieldValue(expectedField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        int actualFieldIeeeFlags = ((Integer) getFieldValue(actualField, "org.apache.commons.math.dfp.DfpField", "ieeeFlags"));
        org.junit.Assert.assertEquals(expectedFieldIeeeFlags, actualFieldIeeeFlags);
        
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#subtract(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return add(x.negate());}
 *  */
    @Test
    public void testSubtract_ReturnAdd() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 2;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {-254, 0};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.exp = -255;
        dfpDec.nans = (byte) -127;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.subtract(((Dfp) dfpDec));
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(dfp, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#subtract(org.apache.commons.math.dfp.Dfp)}
 * @utbot.returnsFrom {@code return add(x.negate());}
 *  */
    @Test
    public void testSubtract_ReturnAdd_3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {-254, 0};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.exp = -255;
        dfpDec.nans = (byte) 0;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.subtract(((Dfp) dfpDec));
        
        // org.apache.commons.math.dfp.Dfp has overridden equals method
        org.junit.Assert.assertEquals(dfp, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(org.apache.commons.math.dfp.Dfp)
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#subtract(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return add(x.negate());
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.exp = -255;
        dfpDec.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", -255);
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.DfpDec.round(DfpDec.java:167)
            org.apache.commons.math.dfp.DfpDec.<init>(DfpDec.java:74)
            org.apache.commons.math.dfp.DfpDec.newInstance(DfpDec.java:138)
            org.apache.commons.math.dfp.Dfp.negate(Dfp.java:1314)
            org.apache.commons.math.dfp.Dfp.subtract(Dfp.java:1324) */
        dfp.subtract(((Dfp) dfpDec));
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#subtract(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return add(x.negate());
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {101};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.exp = -255;
        dfpDec.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 2);
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.math.dfp.DfpDec.round(DfpDec.java:200)
            org.apache.commons.math.dfp.DfpDec.<init>(DfpDec.java:74)
            org.apache.commons.math.dfp.DfpDec.newInstance(DfpDec.java:138)
            org.apache.commons.math.dfp.Dfp.negate(Dfp.java:1314)
            org.apache.commons.math.dfp.Dfp.subtract(Dfp.java:1324) */
        dfp.subtract(((Dfp) dfpDec));
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#subtract(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return add(x.negate());
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {101};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -127;
        dfpDec.exp = -255;
        dfpDec.nans = (byte) -127;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 130);
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index -128 out of bounds for length 1]
            org.apache.commons.math.dfp.DfpDec.round(DfpDec.java:190)
            org.apache.commons.math.dfp.DfpDec.<init>(DfpDec.java:74)
            org.apache.commons.math.dfp.DfpDec.newInstance(DfpDec.java:138)
            org.apache.commons.math.dfp.Dfp.negate(Dfp.java:1314)
            org.apache.commons.math.dfp.Dfp.subtract(Dfp.java:1324) */
        dfp.subtract(((Dfp) dfpDec));
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#subtract(org.apache.commons.math.dfp.Dfp)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return add(x.negate());
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.subtract(Dfp.java:1324) */
        dfp.subtract(((Dfp) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method subtract(org.apache.commons.math.dfp.Dfp)
    
    @Test
    public void testSubtract1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = new int[35];
        mant[34] = 64;
        dfpDec.mant = mant;
        dfpDec.sign = (byte) 0;
        dfpDec.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(field, "org.apache.commons.math.dfp.DfpField", "radixDigits", 33);
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.DfpDec.round(DfpDec.java:216)
            org.apache.commons.math.dfp.DfpDec.<init>(DfpDec.java:74)
            org.apache.commons.math.dfp.DfpDec.newInstance(DfpDec.java:138)
            org.apache.commons.math.dfp.Dfp.negate(Dfp.java:1314)
            org.apache.commons.math.dfp.Dfp.subtract(Dfp.java:1324) */
        dfp.subtract(((Dfp) dfpDec));
    }
    
    @Test
    public void testSubtract2() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.sign = java.lang.Byte.MIN_VALUE;
        dfp.nans = (byte) 1;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {0};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) -3;
        dfpDec.nans = (byte) 1;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.subtract] produces [java.lang.NullPointerException] */
        dfp.subtract(((Dfp) dfpDec));
    }
    
    @Test
    public void testSubtract3() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = java.lang.Byte.MIN_VALUE;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {0};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) 0;
        dfpDec.nans = (byte) 1;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.subtract] produces [java.lang.NullPointerException] */
        dfp.subtract(((Dfp) dfpDec));
    }
    
    @Test
    public void testSubtract4() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {0};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) 0;
        dfpDec.nans = (byte) 0;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.subtract] produces [java.lang.NullPointerException] */
        dfp.subtract(((Dfp) dfpDec));
    }
    
    @Test
    public void testSubtract5() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {0};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) 0;
        dfpDec.nans = java.lang.Byte.MIN_VALUE;
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.subtract] produces [java.lang.NullPointerException] */
        dfp.subtract(((Dfp) dfpDec));
    }
    
    @Test
    public void testSubtract6() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        dfp.sign = (byte) 0;
        dfp.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.subtract] produces [java.lang.NullPointerException] */
        dfp.subtract(dfp);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method subtract(org.apache.commons.math.dfp.Dfp)
    
    @Test(timeout = 1000L)
    public void testSubtract7() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpDec dfpDec = ((DfpDec) createInstance("org.apache.commons.math.dfp.DfpDec"));
        int[] mant = {Integer.MIN_VALUE};
        dfpDec.mant = mant;
        dfpDec.sign = (byte) 0;
        dfpDec.nans = (byte) 0;
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfpDec, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        dfp.subtract(((Dfp) dfpDec));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.shiftRight
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shiftRight()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#shiftRight()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length - 1; i++)} once
 *  */
    @Test
    public void testShiftRight_IterateForLoop() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255};
        dfp.mant = mant;
        dfp.exp = -255;
        
        dfp.shiftRight();
        
        int finalDfpMant0 = dfp.mant[0];
        int finalDfpExp = dfp.exp;
        
        org.junit.Assert.assertEquals(0, finalDfpMant0);
        
        org.junit.Assert.assertEquals(-254, finalDfpExp);
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#shiftRight()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length - 1; i++)} twice
 *  */
    @Test
    public void testShiftRight_IterateForLoop_1() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {-255, 1};
        dfp.mant = mant;
        
        dfp.shiftRight();
        
        int finalDfpMant0 = dfp.mant[0];
        int finalDfpMant1 = dfp.mant[1];
        int finalDfpExp = dfp.exp;
        
        org.junit.Assert.assertEquals(1, finalDfpMant0);
        
        org.junit.Assert.assertEquals(0, finalDfpMant1);
        
        org.junit.Assert.assertEquals(1, finalDfpExp);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method shiftRight()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#shiftRight()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length - 1; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: mant[mant.length - 1] = 0;
 *  */
    @Test
    public void testShiftRight_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        int[] mant = {};
        dfp.mant = mant;
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.shiftRight] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.dfp.Dfp.shiftRight(Dfp.java:682) */
        dfp.shiftRight();
    }
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#shiftRight()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < mant.length - 1; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < mant.length - 1; i++)
 *  */
    @Test
    public void testShiftRight_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.shiftRight] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.shiftRight(Dfp.java:679) */
        dfp.shiftRight();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.dfp.Dfp.getZero
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getZero()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#getZero()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#getZero()}
 * @utbot.returnsFrom {@code return field.getZero();}
 *  */
    @Test
    public void testGetZero_DfpFieldGetZero() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        DfpField field = ((DfpField) createInstance("org.apache.commons.math.dfp.DfpField"));
        setField(dfp, "org.apache.commons.math.dfp.Dfp", "field", field);
        
        Dfp actual = dfp.getZero();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getZero()
    
    /**
    @utbot.classUnderTest {@link Dfp}
 * @utbot.methodUnderTest {@link org.apache.commons.math.dfp.Dfp#getZero()}
 * @utbot.invokes {@link org.apache.commons.math.dfp.DfpField#getZero()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return field.getZero();
 *  */
    @Test
    public void testGetZero_ThrowNullPointerException() throws Exception  {
        Dfp dfp = ((Dfp) createInstance("org.apache.commons.math.dfp.Dfp"));
        
        /* This test fails because method [org.apache.commons.math.dfp.Dfp.getZero] produces [java.lang.NullPointerException]
            org.apache.commons.math.dfp.Dfp.getZero(Dfp.java:647) */
        dfp.getZero();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields733018812435500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields733018812435500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass733018812447600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields733018812435500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass733018812447600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields733018813087600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields733018813087600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass733018813090600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields733018813087600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass733018813090600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

