package org.joda.time.field;

import org.junit.Test;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class org_joda_time_field_FieldUtilsTest {
    ///region Test suites for executable org.joda.time.field.FieldUtils.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#equals(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (object1 == object2): False}
 * @utbot.executesCondition {@code (object1 == null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_Object1EqualsNull() {
        short[] shortArray = {};
        
        boolean actual = FieldUtils.equals(null, shortArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#equals(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (object1 == object2): False}
 * @utbot.executesCondition {@code (object1 == null): False}
 * @utbot.executesCondition {@code (object2 == null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_Object2EqualsNull() {
        byte[] byteArray = {};
        
        boolean actual = FieldUtils.equals(byteArray, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#equals(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (object1 == object2): False}
 * @utbot.executesCondition {@code (object1 == null): False}
 * @utbot.executesCondition {@code (object2 == null): False}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return object1.equals(object2);}
 *  */
    @Test
    public void testEquals_Object2NotEqualsNull() {
        Integer integer = 0;
        byte[] byteArray = {};
        
        boolean actual = FieldUtils.equals(integer, byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#equals(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (object1 == object2): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Object1EqualsObject2() {
        boolean actual = FieldUtils.equals(null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.FieldUtils.safeMultiplyToInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method safeMultiplyToInt(long, long)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiplyToInt(long,long)}
 * @utbot.returnsFrom {@code return FieldUtils.safeToInt(val);}
 *  */
    @Test
    public void testSafeMultiplyToInt_ReturnFieldUtilsSafeToInt() {
        int actual = FieldUtils.safeMultiplyToInt(1L, 1L);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiplyToInt(long,long)}
 * @utbot.returnsFrom {@code return FieldUtils.safeToInt(val);}
 *  */
    @Test
    public void testSafeMultiplyToInt_ReturnFieldUtilsSafeToInt_1() {
        int actual = FieldUtils.safeMultiplyToInt(2L, 0L);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiplyToInt(long,long)}
 * @utbot.returnsFrom {@code return FieldUtils.safeToInt(val);}
 *  */
    @Test
    public void testSafeMultiplyToInt_ReturnFieldUtilsSafeToInt_2() {
        int actual = FieldUtils.safeMultiplyToInt(0L, -254L);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method safeMultiplyToInt(long, long)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiplyToInt(long,long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: long val = FieldUtils.safeMultiply(val1, val2);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyToInt_ThrowArithmeticException() {
        FieldUtils.safeMultiplyToInt(8072702332061614082L, 8901652446724609L);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiplyToInt(long,long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return FieldUtils.safeToInt(val);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyToInt_ThrowArithmeticException_1() {
        FieldUtils.safeMultiplyToInt(1L, -9223372036854775550L);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiplyToInt(long,long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return FieldUtils.safeToInt(val);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyToInt_ThrowArithmeticException_2() {
        FieldUtils.safeMultiplyToInt(1L, 2147483650L);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiplyToInt(long,long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return FieldUtils.safeToInt(val);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyToInt_ThrowArithmeticException_3() {
        FieldUtils.safeMultiplyToInt(4294971142L, 1057017L);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiplyToInt(long,long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: long val = FieldUtils.safeMultiply(val1, val2);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyToInt_ThrowArithmeticException_4() {
        FieldUtils.safeMultiplyToInt(java.lang.Long.MIN_VALUE, -1L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.FieldUtils.safeAdd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method safeAdd(int, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeAdd(int,int)}
 * @utbot.executesCondition {@code (val1 ^ sum): False}
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testSafeAdd_Val1XorSum() {
        int actual = FieldUtils.safeAdd(-39, 0);
        
        assertEquals(-39, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeAdd(int,int)}
 * @utbot.executesCondition {@code (val1 ^ sum): True}
 * @utbot.executesCondition {@code (0): False}
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testSafeAdd_Zero() {
        int actual = FieldUtils.safeAdd(0, -1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method safeAdd(int, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeAdd(int,int)}
 * @utbot.executesCondition {@code (val1 ^ sum): True}
 * @utbot.executesCondition {@code (0): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: (val1 ^ sum) < 0 && (val1 ^ val2) >= 0
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSafeAdd_ThrowArithmeticException() {
        FieldUtils.safeAdd(1431655765, 1431655765);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.FieldUtils.safeAdd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method safeAdd(long, long)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeAdd(long,long)}
 * @utbot.executesCondition {@code (val1 ^ sum): False}
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testSafeAdd_Val1XorSum1() {
        long actual = FieldUtils.safeAdd(77L, 0L);
        
        assertEquals(77L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeAdd(long,long)}
 * @utbot.executesCondition {@code (val1 ^ sum): True}
 * @utbot.executesCondition {@code (0): False}
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testSafeAdd_Zero1() {
        long actual = FieldUtils.safeAdd(1L, -30L);
        
        assertEquals(-29L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method safeAdd(long, long)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeAdd(long,long)}
 * @utbot.executesCondition {@code (val1 ^ sum): True}
 * @utbot.executesCondition {@code (0): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: (val1 ^ sum) < 0 && (val1 ^ val2) >= 0
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSafeAdd_ThrowArithmeticException1() {
        FieldUtils.safeAdd(4494915684536721380L, 4737140295151829046L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.FieldUtils.verifyValueBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method verifyValueBounds(org.joda.time.DateTimeField, int, int, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#verifyValueBounds(org.joda.time.DateTimeField,int,int,int)}
 * @utbot.executesCondition {@code (value < lowerBound): False}
 * @utbot.executesCondition {@code (value > upperBound): False}
 *  */
    @Test
    public void testVerifyValueBounds_ValueLessOrEqualUpperBound() {
        FieldUtils.verifyValueBounds(((DateTimeField) null), 8, 8, 8);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verifyValueBounds(org.joda.time.DateTimeField, int, int, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#verifyValueBounds(org.joda.time.DateTimeField,int,int,int)}
 * @utbot.executesCondition {@code (value < lowerBound): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer.valueOf(lowerBound)
 *  */
    @Test
    public void testVerifyValueBounds_ThrowNullPointerException() {
        /* This test fails because method [org.joda.time.field.FieldUtils.verifyValueBounds] produces [java.lang.NullPointerException]
            org.joda.time.field.FieldUtils.verifyValueBounds(FieldUtils.java:216) */
        FieldUtils.verifyValueBounds(((DateTimeField) null), 255, 256, -255);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#verifyValueBounds(org.joda.time.DateTimeField,int,int,int)}
 * @utbot.executesCondition {@code (value < lowerBound): False}
 * @utbot.executesCondition {@code (value > upperBound): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer.valueOf(lowerBound)
 *  */
    @Test
    public void testVerifyValueBounds_ThrowNullPointerException_1() {
        /* This test fails because method [org.joda.time.field.FieldUtils.verifyValueBounds] produces [java.lang.NullPointerException]
            org.joda.time.field.FieldUtils.verifyValueBounds(FieldUtils.java:216) */
        FieldUtils.verifyValueBounds(((DateTimeField) null), -1, -1, -2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.FieldUtils.verifyValueBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method verifyValueBounds(org.joda.time.DateTimeFieldType, int, int, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#verifyValueBounds(org.joda.time.DateTimeFieldType,int,int,int)}
 * @utbot.executesCondition {@code (value < lowerBound): False}
 * @utbot.executesCondition {@code (value > upperBound): False}
 *  */
    @Test
    public void testVerifyValueBounds_ValueLessOrEqualUpperBound1() {
        FieldUtils.verifyValueBounds(((DateTimeFieldType) null), 2, 2, 2);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verifyValueBounds(org.joda.time.DateTimeFieldType, int, int, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#verifyValueBounds(org.joda.time.DateTimeFieldType,int,int,int)}
 * @utbot.executesCondition {@code (value < lowerBound): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer.valueOf(lowerBound)
 *  */
    @Test
    public void testVerifyValueBounds_ThrowNullPointerException1() {
        /* This test fails because method [org.joda.time.field.FieldUtils.verifyValueBounds] produces [java.lang.NullPointerException]
            org.joda.time.IllegalFieldValueException.<init>(IllegalFieldValueException.java:108)
            org.joda.time.field.FieldUtils.verifyValueBounds(FieldUtils.java:235) */
        FieldUtils.verifyValueBounds(((DateTimeFieldType) null), 255, 256, -255);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#verifyValueBounds(org.joda.time.DateTimeFieldType,int,int,int)}
 * @utbot.executesCondition {@code (value < lowerBound): False}
 * @utbot.executesCondition {@code (value > upperBound): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer.valueOf(lowerBound)
 *  */
    @Test
    public void testVerifyValueBounds_ThrowNullPointerException_11() {
        /* This test fails because method [org.joda.time.field.FieldUtils.verifyValueBounds] produces [java.lang.NullPointerException]
            org.joda.time.IllegalFieldValueException.<init>(IllegalFieldValueException.java:108)
            org.joda.time.field.FieldUtils.verifyValueBounds(FieldUtils.java:235) */
        FieldUtils.verifyValueBounds(((DateTimeFieldType) null), -1, -1, -2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.FieldUtils.verifyValueBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method verifyValueBounds(java.lang.String, int, int, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#verifyValueBounds(java.lang.String,int,int,int)}
 * @utbot.executesCondition {@code (value < lowerBound): False}
 * @utbot.executesCondition {@code (value > upperBound): False}
 *  */
    @Test
    public void testVerifyValueBounds_ValueLessOrEqualUpperBound2() {
        FieldUtils.verifyValueBounds(((String) null), 2, 2, 2);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method verifyValueBounds(java.lang.String, int, int, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#verifyValueBounds(java.lang.String,int,int,int)}
 * @utbot.executesCondition {@code (value < lowerBound): False}
 * @utbot.executesCondition {@code (value > upperBound): True}
 * @utbot.throwsException {@link org.joda.time.IllegalFieldValueException} in: Integer.valueOf(lowerBound)
 *  */
    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBounds_ThrowIllegalFieldValueException() {
        FieldUtils.verifyValueBounds(((String) null), -1, -1, -2);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#verifyValueBounds(java.lang.String,int,int,int)}
 * @utbot.executesCondition {@code (value < lowerBound): True}
 * @utbot.throwsException {@link org.joda.time.IllegalFieldValueException} in: Integer.valueOf(lowerBound)
 *  */
    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBounds_ThrowIllegalFieldValueException_1() {
        FieldUtils.verifyValueBounds(((String) null), 255, 256, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.FieldUtils.safeSubtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method safeSubtract(long, long)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeSubtract(long,long)}
 * @utbot.executesCondition {@code (val1 ^ diff): True}
 * @utbot.executesCondition {@code (0): False}
 * @utbot.returnsFrom {@code return diff;}
 *  */
    @Test
    public void testSafeSubtract_Zero() {
        long actual = FieldUtils.safeSubtract(-60L, -60L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeSubtract(long,long)}
 * @utbot.executesCondition {@code (val1 ^ diff): False}
 * @utbot.returnsFrom {@code return diff;}
 *  */
    @Test
    public void testSafeSubtract_Val1XorDiff() {
        long actual = FieldUtils.safeSubtract(3L, 0L);
        
        assertEquals(3L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method safeSubtract(long, long)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeSubtract(long,long)}
 * @utbot.executesCondition {@code (val1 ^ diff): True}
 * @utbot.executesCondition {@code (0): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: (val1 ^ diff) < 0 && (val1 ^ val2) < 0
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSafeSubtract_ThrowArithmeticException() {
        FieldUtils.safeSubtract(268435627L, -9223372036854775468L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.FieldUtils.safeMultiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method safeMultiply(long, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiply(long,int)}
 * @utbot.executesCondition {@code (total / val2 != val1): False}
 * @utbot.activatesSwitch {@code switch(val2)}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testSafeMultiply_TotalDivideVal2EqualsVal1() {
        long actual = FieldUtils.safeMultiply(3L, -254);
        
        assertEquals(-762L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method safeMultiply(long, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiply(long,int)}
 * @utbot.activatesSwitch {@code switch(val2) case: 0}
 * @utbot.returnsFrom {@code return 0L;}
 *  */
    @Test
    public void testSafeMultiply_ReturnZero() {
        long actual = FieldUtils.safeMultiply(1L, 0);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiply(long,int)}
 * @utbot.activatesSwitch {@code switch(val2) case: 1}
 * @utbot.returnsFrom {@code return val1;}
 *  */
    @Test
    public void testSafeMultiply_ReturnVal1() {
        long actual = FieldUtils.safeMultiply(1L, 1);
        
        assertEquals(1L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiply(long,int)}
 * @utbot.activatesSwitch {@code switch(val2) case: -1}
 * @utbot.returnsFrom {@code return -val1;}
 *  */
    @Test
    public void testSafeMultiply_ReturnNegativeVal1() {
        long actual = FieldUtils.safeMultiply(1L, -1);
        
        assertEquals(-1L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method safeMultiply(long, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiply(long,int)}
 * @utbot.executesCondition {@code (total / val2 != val1): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.activatesSwitch {@code switch(val2)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: total / val2 != val1
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSafeMultiply_ThrowArithmeticException() {
        FieldUtils.safeMultiply(2305843009213693952L, 4);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.FieldUtils.safeMultiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method safeMultiply(long, long)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiply(long,long)}
 * @utbot.executesCondition {@code (val2 == 1): True}
 * @utbot.returnsFrom {@code return val1;}
 *  */
    @Test
    public void testSafeMultiply_Val2Equals1() {
        long actual = FieldUtils.safeMultiply(1L, 1L);
        
        assertEquals(1L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiply(long,long)}
 * @utbot.executesCondition {@code (val2 == 1): False}
 * @utbot.executesCondition {@code (val1 == 1): False}
 * @utbot.executesCondition {@code (val1 == 0): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testSafeMultiply_Val1EqualsZero() {
        long actual = FieldUtils.safeMultiply(0L, -254L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiply(long,long)}
 * @utbot.executesCondition {@code (val2 == 1): False}
 * @utbot.executesCondition {@code (val1 == 1): True}
 * @utbot.returnsFrom {@code return val2;}
 *  */
    @Test
    public void testSafeMultiply_Val1Equals1() {
        long actual = FieldUtils.safeMultiply(1L, -254L);
        
        assertEquals(-254L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiply(long,long)}
 * @utbot.executesCondition {@code (val2 == 1): False}
 * @utbot.executesCondition {@code (val1 == 1): False}
 * @utbot.executesCondition {@code (val1 == 0): False}
 * @utbot.executesCondition {@code (val2 == 0): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testSafeMultiply_Val2EqualsZero() {
        long actual = FieldUtils.safeMultiply(2L, 0L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiply(long,long)}
 * @utbot.executesCondition {@code (val2 == 1): False}
 * @utbot.executesCondition {@code (val1 == 1): False}
 * @utbot.executesCondition {@code (val1 == 0): False}
 * @utbot.executesCondition {@code (val2 == 0): False}
 * @utbot.executesCondition {@code (total / val2 != val1): False}
 * @utbot.executesCondition {@code (val1 == Long.MIN_VALUE): False}
 * @utbot.executesCondition {@code (val2 == Long.MIN_VALUE): False}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testSafeMultiply_Val2NotEqualsLongMIN_VALUE() {
        long actual = FieldUtils.safeMultiply(2L, -222L);
        
        assertEquals(-444L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method safeMultiply(long, long)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiply(long,long)}
 * @utbot.executesCondition {@code (total / val2 != val1): False}
 * @utbot.executesCondition {@code (val1 == Long.MIN_VALUE): True}
 * @utbot.executesCondition {@code (val2 == -1): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: total / val2 != val1 || val1 == Long.MIN_VALUE && val2 == -1 || val2 == Long.MIN_VALUE && val1 == -1
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSafeMultiply_ThrowArithmeticException1() {
        FieldUtils.safeMultiply(java.lang.Long.MIN_VALUE, -1L);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiply(long,long)}
 * @utbot.executesCondition {@code (total / val2 != val1): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: total / val2 != val1 || val1 == Long.MIN_VALUE && val2 == -1 || val2 == Long.MIN_VALUE && val1 == -1
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSafeMultiply_ThrowArithmeticException_1() {
        FieldUtils.safeMultiply(4611686018427387907L, 392L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.FieldUtils.safeMultiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method safeMultiply(int, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiply(int,int)}
 * @utbot.executesCondition {@code (total < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (total > Integer.MAX_VALUE): False}
 * @utbot.returnsFrom {@code return (int) total;}
 *  */
    @Test
    public void testSafeMultiply_TotalLessOrEqualIntegerMAX_VALUE() {
        int actual = FieldUtils.safeMultiply(13, -240);
        
        assertEquals(-3120, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method safeMultiply(int, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiply(int,int)}
 * @utbot.executesCondition {@code (total < Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: total < Integer.MIN_VALUE || total > Integer.MAX_VALUE
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSafeMultiply_ThrowArithmeticException2() {
        FieldUtils.safeMultiply(Integer.MIN_VALUE, 128);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeMultiply(int,int)}
 * @utbot.executesCondition {@code (total < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (total > Integer.MAX_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: total < Integer.MIN_VALUE || total > Integer.MAX_VALUE
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSafeMultiply_ThrowArithmeticException_11() {
        FieldUtils.safeMultiply(17829843, 673710592);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.FieldUtils.safeToInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method safeToInt(long)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeToInt(long)}
 * @utbot.executesCondition {@code (Integer.MIN_VALUE <= value): True}
 * @utbot.executesCondition {@code (value <= Integer.MAX_VALUE): True}
 * @utbot.returnsFrom {@code return (int) value;}
 *  */
    @Test
    public void testSafeToInt_ValueLessOrEqualIntegerMAX_VALUE() {
        int actual = FieldUtils.safeToInt(-255L);
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method safeToInt(long)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeToInt(long)}
 * @utbot.executesCondition {@code (Integer.MIN_VALUE <= value): True}
 * @utbot.executesCondition {@code (value <= Integer.MAX_VALUE): False}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: throw new ArithmeticException("Value cannot fit in an int: " + value);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSafeToInt_ThrowArithmeticException() {
        FieldUtils.safeToInt(68719476992L);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeToInt(long)}
 * @utbot.executesCondition {@code (Integer.MIN_VALUE <= value): False}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: throw new ArithmeticException("Value cannot fit in an int: " + value);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSafeToInt_ThrowArithmeticException_1() {
        FieldUtils.safeToInt(-9223372036854775550L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.FieldUtils.safeNegate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method safeNegate(int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeNegate(int)}
 * @utbot.executesCondition {@code (value == Integer.MIN_VALUE): False}
 * @utbot.returnsFrom {@code return -value;}
 *  */
    @Test
    public void testSafeNegate_ValueNotEqualsIntegerMIN_VALUE() {
        int actual = FieldUtils.safeNegate(2);
        
        assertEquals(-2, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method safeNegate(int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#safeNegate(int)}
 * @utbot.executesCondition {@code (value == Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: value == Integer.MIN_VALUE
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSafeNegate_ThrowArithmeticException() {
        FieldUtils.safeNegate(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.FieldUtils.getWrappedValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWrappedValue(int, int, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#getWrappedValue(int,int,int)}
 * @utbot.executesCondition {@code (value >= 0): False}
 * @utbot.executesCondition {@code (remByRange == 0): True}
 * @utbot.returnsFrom {@code return 0 + minValue;}
 *  */
    @Test
    public void testGetWrappedValue_RemByRangeEqualsZero() {
        int actual = FieldUtils.getWrappedValue(-130, 0, 129);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#getWrappedValue(int,int,int)}
 * @utbot.executesCondition {@code (value >= 0): False}
 * @utbot.executesCondition {@code (remByRange == 0): False}
 * @utbot.returnsFrom {@code return (wrapRange - remByRange) + minValue;}
 *  */
    @Test
    public void testGetWrappedValue_RemByRangeNotEqualsZero() {
        int actual = FieldUtils.getWrappedValue(254, 255, 256);
        
        assertEquals(256, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#getWrappedValue(int,int,int)}
 * @utbot.executesCondition {@code (value >= 0): True}
 * @utbot.returnsFrom {@code return (value % wrapRange) + minValue;}
 *  */
    @Test
    public void testGetWrappedValue_ValueGreaterOrEqualZero() {
        int actual = FieldUtils.getWrappedValue(255, 255, 256);
        
        assertEquals(255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getWrappedValue(int, int, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#getWrappedValue(int,int,int)}
 * @utbot.executesCondition {@code (minValue >= maxValue): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: minValue >= maxValue
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetWrappedValue_ThrowIllegalArgumentException() {
        FieldUtils.getWrappedValue(1, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getWrappedValue(int, int, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#getWrappedValue(int,int,int)}
 * @utbot.executesCondition {@code (value >= 0): False}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int remByRange = (-value) % wrapRange;
 *  */
    @Test
    public void testGetWrappedValue_ThrowArithmeticException() {
        /* This test fails because method [org.joda.time.field.FieldUtils.getWrappedValue] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.FieldUtils.getWrappedValue(FieldUtils.java:300) */
        FieldUtils.getWrappedValue(4, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#getWrappedValue(int,int,int)}
 * @utbot.executesCondition {@code (value >= 0): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return (value % wrapRange) + minValue;
 *  */
    @Test
    public void testGetWrappedValue_ThrowArithmeticException_1() {
        /* This test fails because method [org.joda.time.field.FieldUtils.getWrappedValue] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.FieldUtils.getWrappedValue(FieldUtils.java:297) */
        FieldUtils.getWrappedValue(-254, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.FieldUtils.getWrappedValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWrappedValue(int, int, int, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#getWrappedValue(int,int,int,int)}
 * @utbot.returnsFrom {@code return getWrappedValue(currentValue + wrapValue, minValue, maxValue);}
 *  */
    @Test
    public void testGetWrappedValue_ReturnGetWrappedValue() {
        int actual = FieldUtils.getWrappedValue(0, -204, -156, -154);
        
        assertEquals(-156, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#getWrappedValue(int,int,int,int)}
 * @utbot.returnsFrom {@code return getWrappedValue(currentValue + wrapValue, minValue, maxValue);}
 *  */
    @Test
    public void testGetWrappedValue_ReturnGetWrappedValue_1() {
        int actual = FieldUtils.getWrappedValue(256, -1, 255, 256);
        
        assertEquals(255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#getWrappedValue(int,int,int,int)}
 * @utbot.returnsFrom {@code return getWrappedValue(currentValue + wrapValue, minValue, maxValue);}
 *  */
    @Test
    public void testGetWrappedValue_ReturnGetWrappedValue_2() {
        int actual = FieldUtils.getWrappedValue(256, -2, 255, 256);
        
        assertEquals(256, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getWrappedValue(int, int, int, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#getWrappedValue(int,int,int,int)}
 * @utbot.invokes {@link org.joda.time.field.FieldUtils#getWrappedValue(int,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getWrappedValue(currentValue + wrapValue, minValue, maxValue);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetWrappedValue_ThrowIllegalArgumentException1() {
        FieldUtils.getWrappedValue(1, -255, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getWrappedValue(int, int, int, int)
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#getWrappedValue(int,int,int,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return getWrappedValue(currentValue + wrapValue, minValue, maxValue);
 *  */
    @Test
    public void testGetWrappedValue_ThrowArithmeticException1() {
        /* This test fails because method [org.joda.time.field.FieldUtils.getWrappedValue] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.FieldUtils.getWrappedValue(FieldUtils.java:300)
            org.joda.time.field.FieldUtils.getWrappedValue(FieldUtils.java:273) */
        FieldUtils.getWrappedValue(129, -128, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    /**
    @utbot.classUnderTest {@link FieldUtils}
 * @utbot.methodUnderTest {@link org.joda.time.field.FieldUtils#getWrappedValue(int,int,int,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return getWrappedValue(currentValue + wrapValue, minValue, maxValue);
 *  */
    @Test
    public void testGetWrappedValue_ThrowArithmeticException_11() {
        /* This test fails because method [org.joda.time.field.FieldUtils.getWrappedValue] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.FieldUtils.getWrappedValue(FieldUtils.java:297)
            org.joda.time.field.FieldUtils.getWrappedValue(FieldUtils.java:273) */
        FieldUtils.getWrappedValue(-2147472287, 82855130, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
}

