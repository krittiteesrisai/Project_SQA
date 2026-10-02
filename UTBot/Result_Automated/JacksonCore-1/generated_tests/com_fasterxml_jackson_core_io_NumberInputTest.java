package com.fasterxml.jackson.core.io;

import org.junit.Test;
import java.math.BigDecimal;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_core_io_NumberInputTest {
    ///region Test suites for executable com.fasterxml.jackson.core.io.NumberInput.parseAsInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseAsInt(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseAsInt(java.lang.String,int)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.executesCondition {@code (len == 0): True}
 *  */
    @Test
    public void testParseAsInt_LenEqualsZero() {
        String string = "";
        
        int actual = NumberInput.parseAsInt(string, -255);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseAsInt(java.lang.String,int)}
 * @utbot.executesCondition {@code (input == null): True}
 *  */
    @Test
    public void testParseAsInt_InputEqualsNull() {
        int actual = NumberInput.parseAsInt(null, -255);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseAsInt(java.lang.String,int)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testParseAsInt_StringLength() {
        String string = "+";
        
        int actual = NumberInput.parseAsInt(string, -255);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseAsInt(java.lang.String,int)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (c == '-'): True}
 *  */
    @Test
    public void testParseAsInt_CEqualsChar() {
        String string = "-";
        
        int actual = NumberInput.parseAsInt(string, -255);
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parseAsInt(java.lang.String, int)
    
    @Test
    public void testParseAsInt1() {
        String string = ":!";
        
        int actual = NumberInput.parseAsInt(string, 0);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testParseAsInt2() {
        String string = "2\u0000\u0000!";
        
        int actual = NumberInput.parseAsInt(string, 0);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testParseAsInt3() {
        String string = "\u00011\u0001";
        
        int actual = NumberInput.parseAsInt(string, 0);
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testParseAsInt4() {
        String string = "\u0001\u0001-02\u0001";
        
        int actual = NumberInput.parseAsInt(string, 0);
        
        assertEquals(-2, actual);
    }
    
    @Test
    public void testParseAsInt5() {
        String string = "\u0001-:\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        
        int actual = NumberInput.parseAsInt(string, 0);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testParseAsInt6() {
        String string = "-0\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001\u0001";
        
        int actual = NumberInput.parseAsInt(string, 0);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testParseAsInt7() {
        String string = "\u0001+\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        
        int actual = NumberInput.parseAsInt(string, 0);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testParseAsInt8() {
        String string = "\u0001+0";
        
        int actual = NumberInput.parseAsInt(string, 0);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testParseAsInt9() {
        String string = "+:\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        
        int actual = NumberInput.parseAsInt(string, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.NumberInput.inLongRange
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inLongRange(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#inLongRange(java.lang.String,boolean)}
 *  */
    @Test
    public void testInLongRange_ReturnTrue() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        String prevMAX_LONG_STR = NumberInput.MAX_LONG_STR;
        try {
            String maxLongStr = "9223372036854775807";
            Class numberInputClazz = Class.forName("com.fasterxml.jackson.core.io.NumberInput");
            setStaticField(numberInputClazz, "MAX_LONG_STR", maxLongStr);
            String string = "";
            
            boolean actual = NumberInput.inLongRange(string, false);
            
            assertTrue(actual);
        } finally {
            setStaticField(NumberInput.class, "MAX_LONG_STR", prevMAX_LONG_STR);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#inLongRange(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (actualLen > cmpLen): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < cmpLen; ++i)} once
 *  */
    @Test
    public void testInLongRange_DiffGreaterOrEqualZero() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        String prevMAX_LONG_STR = NumberInput.MAX_LONG_STR;
        try {
            String maxLongStr = "9223372036854775807";
            Class numberInputClazz = Class.forName("com.fasterxml.jackson.core.io.NumberInput");
            setStaticField(numberInputClazz, "MAX_LONG_STR", maxLongStr);
            String string = "A @@@@@@@@@  @  @  ";
            
            boolean actual = NumberInput.inLongRange(string, false);
            
            assertFalse(actual);
        } finally {
            setStaticField(NumberInput.class, "MAX_LONG_STR", prevMAX_LONG_STR);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#inLongRange(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (actualLen > cmpLen): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < cmpLen; ++i)} once
 *  */
    @Test
    public void testInLongRange_DiffLessThanZero() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        String prevMAX_LONG_STR = NumberInput.MAX_LONG_STR;
        try {
            String maxLongStr = "9223372036854775807";
            Class numberInputClazz = Class.forName("com.fasterxml.jackson.core.io.NumberInput");
            setStaticField(numberInputClazz, "MAX_LONG_STR", maxLongStr);
            String string = "8                  ";
            
            boolean actual = NumberInput.inLongRange(string, false);
            
            assertTrue(actual);
        } finally {
            setStaticField(NumberInput.class, "MAX_LONG_STR", prevMAX_LONG_STR);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#inLongRange(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (actualLen > cmpLen): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < cmpLen; ++i)} twice
 *  */
    @Test
    public void testInLongRange_DiffLessThanZero_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        String prevMAX_LONG_STR = NumberInput.MAX_LONG_STR;
        try {
            String maxLongStr = "9223372036854775807";
            Class numberInputClazz = Class.forName("com.fasterxml.jackson.core.io.NumberInput");
            setStaticField(numberInputClazz, "MAX_LONG_STR", maxLongStr);
            String string = "91                 ";
            
            boolean actual = NumberInput.inLongRange(string, false);
            
            assertTrue(actual);
        } finally {
            setStaticField(NumberInput.class, "MAX_LONG_STR", prevMAX_LONG_STR);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#inLongRange(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (actualLen > cmpLen): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < cmpLen; ++i)} 19 times
 *  */
    @Test
    public void testInLongRange_ReturnTrue_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        String prevMAX_LONG_STR = NumberInput.MAX_LONG_STR;
        try {
            String maxLongStr = "9223372036854775807";
            Class numberInputClazz = Class.forName("com.fasterxml.jackson.core.io.NumberInput");
            setStaticField(numberInputClazz, "MAX_LONG_STR", maxLongStr);
            String string = "9223372036854775807";
            
            boolean actual = NumberInput.inLongRange(string, false);
            
            assertTrue(actual);
        } finally {
            setStaticField(NumberInput.class, "MAX_LONG_STR", prevMAX_LONG_STR);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inLongRange(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#inLongRange(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (negative): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int actualLen = numberStr.length();
 *  */
    @Test
    public void testInLongRange_ThrowNullPointerException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        String prevMAX_LONG_STR = NumberInput.MAX_LONG_STR;
        try {
            String maxLongStr = "9223372036854775807";
            Class numberInputClazz = Class.forName("com.fasterxml.jackson.core.io.NumberInput");
            setStaticField(numberInputClazz, "MAX_LONG_STR", maxLongStr);
            
            /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.inLongRange] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:175) */
            NumberInput.inLongRange(null, false);
        } finally {
            setStaticField(NumberInput.class, "MAX_LONG_STR", prevMAX_LONG_STR);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#inLongRange(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (negative): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int actualLen = numberStr.length();
 *  */
    @Test
    public void testInLongRange_ThrowNullPointerException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        String prevMIN_LONG_STR_NO_SIGN = NumberInput.MIN_LONG_STR_NO_SIGN;
        try {
            String minLongStrNoSign = "9223372036854775808";
            Class numberInputClazz = Class.forName("com.fasterxml.jackson.core.io.NumberInput");
            setStaticField(numberInputClazz, "MIN_LONG_STR_NO_SIGN", minLongStrNoSign);
            
            /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.inLongRange] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:175) */
            NumberInput.inLongRange(null, true);
        } finally {
            setStaticField(NumberInput.class, "MIN_LONG_STR_NO_SIGN", prevMIN_LONG_STR_NO_SIGN);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method inLongRange(java.lang.String, boolean)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.io.NumberInput}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#inLongRange(java.lang.String,boolean)}
     */
    @Test
    public void testInLongRangeReturnsTrueWithEmptyString() {
        boolean actual = NumberInput.inLongRange("", true);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.NumberInput.inLongRange
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method inLongRange([C, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#inLongRange(char[],int,int,boolean)}
 * @utbot.executesCondition {@code (negative): True}
 *  */
    @Test
    public void testInLongRange_Negative() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        String prevMIN_LONG_STR_NO_SIGN = NumberInput.MIN_LONG_STR_NO_SIGN;
        try {
            String minLongStrNoSign = "9223372036854775808";
            Class numberInputClazz = Class.forName("com.fasterxml.jackson.core.io.NumberInput");
            setStaticField(numberInputClazz, "MIN_LONG_STR_NO_SIGN", minLongStrNoSign);
            
            boolean actual = NumberInput.inLongRange(null, -255, 18, true);
            
            assertTrue(actual);
        } finally {
            setStaticField(NumberInput.class, "MIN_LONG_STR_NO_SIGN", prevMIN_LONG_STR_NO_SIGN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#inLongRange(char[],int,int,boolean)}
 * @utbot.executesCondition {@code (negative): False}
 *  */
    @Test
    public void testInLongRange_NotNegative() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        String prevMAX_LONG_STR = NumberInput.MAX_LONG_STR;
        try {
            String maxLongStr = "9223372036854775807";
            Class numberInputClazz = Class.forName("com.fasterxml.jackson.core.io.NumberInput");
            setStaticField(numberInputClazz, "MAX_LONG_STR", maxLongStr);
            
            boolean actual = NumberInput.inLongRange(null, -255, 18, false);
            
            assertTrue(actual);
        } finally {
            setStaticField(NumberInput.class, "MAX_LONG_STR", prevMAX_LONG_STR);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#inLongRange(char[],int,int,boolean)}
 * @utbot.executesCondition {@code (negative): True}
 * @utbot.executesCondition {@code (len > cmpLen): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInLongRange_LenGreaterThanCmpLen() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        String prevMIN_LONG_STR_NO_SIGN = NumberInput.MIN_LONG_STR_NO_SIGN;
        try {
            String minLongStrNoSign = "9223372036854775808";
            Class numberInputClazz = Class.forName("com.fasterxml.jackson.core.io.NumberInput");
            setStaticField(numberInputClazz, "MIN_LONG_STR_NO_SIGN", minLongStrNoSign);
            
            boolean actual = NumberInput.inLongRange(null, -255, 20, true);
            
            assertFalse(actual);
        } finally {
            setStaticField(NumberInput.class, "MIN_LONG_STR_NO_SIGN", prevMIN_LONG_STR_NO_SIGN);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method inLongRange([C, int, int, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (negative): True},
    ///     {@code (len < cmpLen): False},
    ///     {@code (len > cmpLen): False}
    /// invoke:
    ///     {@link java.lang.String#charAt(int)} once
    /// execute conditions:
    ///     {@code (diff != 0): True}
    /// return from: {@code return (diff < 0);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#inLongRange(char[],int,int,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < cmpLen; ++i)} once
 *  */
    @Test
    public void testInLongRange_DiffGreaterOrEqualZero1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        String prevMIN_LONG_STR_NO_SIGN = NumberInput.MIN_LONG_STR_NO_SIGN;
        try {
            String minLongStrNoSign = "9223372036854775808";
            Class numberInputClazz = Class.forName("com.fasterxml.jackson.core.io.NumberInput");
            setStaticField(numberInputClazz, "MIN_LONG_STR_NO_SIGN", minLongStrNoSign);
            char[] charArray = {'<'};
            
            boolean actual = NumberInput.inLongRange(charArray, 0, 19, true);
            
            assertFalse(actual);
        } finally {
            setStaticField(NumberInput.class, "MIN_LONG_STR_NO_SIGN", prevMIN_LONG_STR_NO_SIGN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#inLongRange(char[],int,int,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < cmpLen; ++i)} once
 *  */
    @Test
    public void testInLongRange_DiffLessThanZero1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        String prevMIN_LONG_STR_NO_SIGN = NumberInput.MIN_LONG_STR_NO_SIGN;
        try {
            String minLongStrNoSign = "9223372036854775808";
            Class numberInputClazz = Class.forName("com.fasterxml.jackson.core.io.NumberInput");
            setStaticField(numberInputClazz, "MIN_LONG_STR_NO_SIGN", minLongStrNoSign);
            char[] charArray = {'8'};
            
            boolean actual = NumberInput.inLongRange(charArray, 0, 19, true);
            
            assertTrue(actual);
        } finally {
            setStaticField(NumberInput.class, "MIN_LONG_STR_NO_SIGN", prevMIN_LONG_STR_NO_SIGN);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inLongRange([C, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#inLongRange(char[],int,int,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < cmpLen; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int diff = digitChars[offset + i] - cmpStr.charAt(i);
 *  */
    @Test
    public void testInLongRange_ThrowArrayIndexOutOfBoundsException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        String prevMIN_LONG_STR_NO_SIGN = NumberInput.MIN_LONG_STR_NO_SIGN;
        try {
            String minLongStrNoSign = "9223372036854775808";
            Class numberInputClazz = Class.forName("com.fasterxml.jackson.core.io.NumberInput");
            setStaticField(numberInputClazz, "MIN_LONG_STR_NO_SIGN", minLongStrNoSign);
            char[] charArray = {' '};
            
            /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.inLongRange] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
                com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:156) */
            NumberInput.inLongRange(charArray, -256, 19, true);
        } finally {
            setStaticField(NumberInput.class, "MIN_LONG_STR_NO_SIGN", prevMIN_LONG_STR_NO_SIGN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#inLongRange(char[],int,int,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < cmpLen; ++i)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int diff = digitChars[offset + i] - cmpStr.charAt(i);
 *  */
    @Test
    public void testInLongRange_ThrowArrayIndexOutOfBoundsException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        String prevMIN_LONG_STR_NO_SIGN = NumberInput.MIN_LONG_STR_NO_SIGN;
        try {
            String minLongStrNoSign = "9223372036854775808";
            Class numberInputClazz = Class.forName("com.fasterxml.jackson.core.io.NumberInput");
            setStaticField(numberInputClazz, "MIN_LONG_STR_NO_SIGN", minLongStrNoSign);
            char[] charArray = {'9'};
            
            /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.inLongRange] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
                com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:156) */
            NumberInput.inLongRange(charArray, 0, 19, true);
        } finally {
            setStaticField(NumberInput.class, "MIN_LONG_STR_NO_SIGN", prevMIN_LONG_STR_NO_SIGN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#inLongRange(char[],int,int,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < cmpLen; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int diff = digitChars[offset + i] - cmpStr.charAt(i);
 *  */
    @Test
    public void testInLongRange_ThrowNullPointerException1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        String prevMIN_LONG_STR_NO_SIGN = NumberInput.MIN_LONG_STR_NO_SIGN;
        try {
            String minLongStrNoSign = "9223372036854775808";
            Class numberInputClazz = Class.forName("com.fasterxml.jackson.core.io.NumberInput");
            setStaticField(numberInputClazz, "MIN_LONG_STR_NO_SIGN", minLongStrNoSign);
            
            /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.inLongRange] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:156) */
            NumberInput.inLongRange(null, -255, 19, true);
        } finally {
            setStaticField(NumberInput.class, "MIN_LONG_STR_NO_SIGN", prevMIN_LONG_STR_NO_SIGN);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method inLongRange([C, int, int, boolean)
    
    @Test
    public void testInLongRangeByFuzzer() {
        char[] charArray = {'@', '\u0000'};
        
        boolean actual = NumberInput.inLongRange(charArray, Integer.MIN_VALUE, 1073741825, false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.NumberInput.parseAsLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseAsLong(java.lang.String, long)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseAsLong(java.lang.String,long)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.executesCondition {@code (len == 0): True}
 *  */
    @Test
    public void testParseAsLong_LenEqualsZero() {
        String string = "";
        
        long actual = NumberInput.parseAsLong(string, -255L);
        
        assertEquals(-255L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseAsLong(java.lang.String,long)}
 * @utbot.executesCondition {@code (input == null): True}
 *  */
    @Test
    public void testParseAsLong_InputEqualsNull() {
        long actual = NumberInput.parseAsLong(null, -255L);
        
        assertEquals(-255L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseAsLong(java.lang.String,long)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (c == '+'): True}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testParseAsLong_CEqualsChar() {
        String string = "+";
        
        long actual = NumberInput.parseAsLong(string, -255L);
        
        assertEquals(-255L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseAsLong(java.lang.String,long)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (c == '+'): False}
 * @utbot.executesCondition {@code (c == '-'): True}
 *  */
    @Test
    public void testParseAsLong_CEqualsChar_1() {
        String string = "-";
        
        long actual = NumberInput.parseAsLong(string, -255L);
        
        assertEquals(-255L, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method parseAsLong(java.lang.String, long)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.io.NumberInput}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseAsLong(java.lang.String,long)}
     */
    @Test
    public void testParseAsLongReturns32816WithNonEmptyString() {
        long actual = NumberInput.parseAsLong("\u00A8", 32816L);
        
        assertEquals(32816L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.NumberInput.parseAsDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseAsDouble(java.lang.String, double)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseAsDouble(java.lang.String,double)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.executesCondition {@code (len == 0): True}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testParseAsDouble_LenEqualsZero() {
        String string = "";
        
        double actual = NumberInput.parseAsDouble(string, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseAsDouble(java.lang.String,double)}
 * @utbot.executesCondition {@code (input == null): True}
 *  */
    @Test
    public void testParseAsDouble_InputEqualsNull() {
        double actual = NumberInput.parseAsDouble(null, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parseAsDouble(java.lang.String, double)
    
    @Test
    public void testParseAsDouble1() {
        String string = "2.\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        
        double actual = NumberInput.parseAsDouble(string, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.NumberInput.parseInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseInt([C, int, int)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.executesCondition {@code (++offset < len): False}
 * @utbot.returnsFrom {@code return num;}
 *  */
    @Test
    public void testParseInt_PrefixIncrementOffsetGreaterOrEqualLen() {
        char[] charArray = {' ', ' '};
        
        int actual = NumberInput.parseInt(charArray, 1, 1);
        
        assertEquals(-16, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): False}
 * @utbot.returnsFrom {@code return num;}
 *  */
    @Test
    public void testParseInt_PrefixIncrementOffsetGreaterOrEqualLen_1() {
        char[] charArray = {' ', ' '};
        
        int actual = NumberInput.parseInt(charArray, 0, 2);
        
        assertEquals(-176, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): False}
 * @utbot.returnsFrom {@code return num;}
 *  */
    @Test
    public void testParseInt_PrefixIncrementOffsetGreaterOrEqualLen_2() {
        char[] charArray = new char[15];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        
        int actual = NumberInput.parseInt(charArray, 4, 3);
        
        assertEquals(-1776, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): False}
 * @utbot.returnsFrom {@code return num;}
 *  */
    @Test
    public void testParseInt_PrefixIncrementOffsetGreaterOrEqualLen_3() {
        char[] charArray = new char[15];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        
        int actual = NumberInput.parseInt(charArray, 8, 4);
        
        assertEquals(-17776, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): False}
 * @utbot.returnsFrom {@code return num;}
 *  */
    @Test
    public void testParseInt_PrefixIncrementOffsetGreaterOrEqualLen_4() {
        char[] charArray = new char[15];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        
        int actual = NumberInput.parseInt(charArray, 8, 5);
        
        assertEquals(-177776, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): False}
 * @utbot.returnsFrom {@code return num;}
 *  */
    @Test
    public void testParseInt_PrefixIncrementOffsetGreaterOrEqualLen_5() {
        char[] charArray = new char[37];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        charArray[15] = ' ';
        charArray[16] = ' ';
        charArray[17] = ' ';
        charArray[18] = ' ';
        charArray[19] = ' ';
        charArray[20] = ' ';
        charArray[21] = ' ';
        charArray[22] = ' ';
        charArray[23] = ' ';
        charArray[24] = ' ';
        charArray[25] = ' ';
        charArray[26] = ' ';
        charArray[27] = ' ';
        charArray[28] = ' ';
        charArray[29] = ' ';
        charArray[30] = ' ';
        charArray[31] = ' ';
        charArray[32] = ' ';
        charArray[33] = ' ';
        charArray[34] = ' ';
        charArray[35] = ' ';
        charArray[36] = ' ';
        
        int actual = NumberInput.parseInt(charArray, 8, 6);
        
        assertEquals(-1777776, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): False}
 * @utbot.returnsFrom {@code return num;}
 *  */
    @Test
    public void testParseInt_PrefixIncrementOffsetGreaterOrEqualLen_6() {
        char[] charArray = new char[15];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        
        int actual = NumberInput.parseInt(charArray, 0, 7);
        
        assertEquals(-17777776, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): False}
 * @utbot.returnsFrom {@code return num;}
 *  */
    @Test
    public void testParseInt_PrefixIncrementOffsetGreaterOrEqualLen_7() {
        char[] charArray = new char[15];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        
        int actual = NumberInput.parseInt(charArray, 3, 8);
        
        assertEquals(-177777776, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.returnsFrom {@code return num;}
 *  */
    @Test
    public void testParseInt_PrefixIncrementOffsetLessThanLen() {
        char[] charArray = {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
            ' ', ' '
        };
        
        int actual = NumberInput.parseInt(charArray, 1, 46);
        
        assertEquals(-1777777776, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseInt([C, int, int)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int num = digitChars[offset] - '0';
 *  */
    @Test
    public void testParseInt_ThrowArrayIndexOutOfBoundsException() {
        char[] charArray = {' ', ' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30) */
        NumberInput.parseInt(charArray, 129, -255);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: num = (num * 10) + (digitChars[offset] - '0');
 *  */
    @Test
    public void testParseInt_ThrowArrayIndexOutOfBoundsException_1() {
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:34) */
        NumberInput.parseInt(charArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: num = (num * 10) + (digitChars[offset] - '0');
 *  */
    @Test
    public void testParseInt_ThrowArrayIndexOutOfBoundsException_2() {
        char[] charArray = {' ', ' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:36) */
        NumberInput.parseInt(charArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: num = (num * 10) + (digitChars[offset] - '0');
 *  */
    @Test
    public void testParseInt_ThrowArrayIndexOutOfBoundsException_3() {
        char[] charArray = new char[11];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:38) */
        NumberInput.parseInt(charArray, 8, 4);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: num = (num * 10) + (digitChars[offset] - '0');
 *  */
    @Test
    public void testParseInt_ThrowArrayIndexOutOfBoundsException_4() {
        char[] charArray = new char[26];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        charArray[15] = ' ';
        charArray[16] = ' ';
        charArray[17] = ' ';
        charArray[18] = ' ';
        charArray[19] = ' ';
        charArray[20] = ' ';
        charArray[21] = ' ';
        charArray[22] = ' ';
        charArray[23] = ' ';
        charArray[24] = ' ';
        charArray[25] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 26]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:40) */
        NumberInput.parseInt(charArray, 22, 9);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: num = (num * 10) + (digitChars[offset] - '0');
 *  */
    @Test
    public void testParseInt_ThrowArrayIndexOutOfBoundsException_5() {
        char[] charArray = new char[13];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:42) */
        NumberInput.parseInt(charArray, 8, 6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: num = (num * 10) + (digitChars[offset] - '0');
 *  */
    @Test
    public void testParseInt_ThrowArrayIndexOutOfBoundsException_6() {
        char[] charArray = new char[24];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        charArray[15] = ' ';
        charArray[16] = ' ';
        charArray[17] = ' ';
        charArray[18] = ' ';
        charArray[19] = ' ';
        charArray[20] = ' ';
        charArray[21] = ' ';
        charArray[22] = ' ';
        charArray[23] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 24]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:44) */
        NumberInput.parseInt(charArray, 18, 13);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: num = (num * 10) + (digitChars[offset] - '0');
 *  */
    @Test
    public void testParseInt_ThrowArrayIndexOutOfBoundsException_7() {
        char[] charArray = new char[15];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:46) */
        NumberInput.parseInt(charArray, 8, 8);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.executesCondition {@code (++offset < len): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: num = (num * 10) + (digitChars[offset] - '0');
 *  */
    @Test
    public void testParseInt_ThrowArrayIndexOutOfBoundsException_8() {
        char[] charArray = new char[20];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        charArray[15] = ' ';
        charArray[16] = ' ';
        charArray[17] = ' ';
        charArray[18] = ' ';
        charArray[19] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:48) */
        NumberInput.parseInt(charArray, 12, 11);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int num = digitChars[offset] - '0';
 *  */
    @Test
    public void testParseInt_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30) */
        NumberInput.parseInt(null, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.NumberInput.parseInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseInt(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(java.lang.String)}
 * @utbot.executesCondition {@code (negative): True}
 * @utbot.executesCondition {@code (length == 1): False}
 * @utbot.executesCondition {@code (length > 10): False}
 * @utbot.executesCondition {@code (offset < length): False}
 * @utbot.executesCondition {@code (negative): True}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return negative ? -num : num;}
 *  */
    @Test
    public void testParseInt_Negative() {
        String string = "-2";
        
        int actual = NumberInput.parseInt(string);
        
        assertEquals(-2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(java.lang.String)}
 * @utbot.executesCondition {@code (negative): False}
 * @utbot.executesCondition {@code (length > 9): False}
 * @utbot.executesCondition {@code (offset < length): False}
 * @utbot.executesCondition {@code (negative): False}
 * @utbot.returnsFrom {@code return negative ? -num : num;}
 *  */
    @Test
    public void testParseInt_NotNegative() {
        String string = "2";
        
        int actual = NumberInput.parseInt(string);
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(java.lang.String)}
 * @utbot.executesCondition {@code (negative): False}
 * @utbot.executesCondition {@code (length > 9): False}
 * @utbot.executesCondition {@code (offset < length): True}
 * @utbot.executesCondition {@code (offset < length): False}
 * @utbot.executesCondition {@code (negative): False}
 * @utbot.returnsFrom {@code return negative ? -num : num;}
 *  */
    @Test
    public void testParseInt_OffsetGreaterOrEqualLength() {
        String string = "22";
        
        int actual = NumberInput.parseInt(string);
        
        assertEquals(22, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(java.lang.String)}
 * @utbot.executesCondition {@code (negative): False}
 * @utbot.executesCondition {@code (length > 9): False}
 * @utbot.executesCondition {@code (offset < length): True}
 * @utbot.executesCondition {@code (offset < length): True}
 * @utbot.executesCondition {@code (offset < length): False}
 * @utbot.executesCondition {@code (negative): False}
 * @utbot.returnsFrom {@code return negative ? -num : num;}
 *  */
    @Test
    public void testParseInt_OffsetGreaterOrEqualLength_1() {
        String string = "222";
        
        int actual = NumberInput.parseInt(string);
        
        assertEquals(222, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(java.lang.String)}
 * @utbot.executesCondition {@code (negative): False}
 * @utbot.executesCondition {@code (length > 9): False}
 * @utbot.executesCondition {@code (offset < length): True}
 * @utbot.executesCondition {@code (offset < length): True}
 * @utbot.executesCondition {@code (offset < length): True}
 * @utbot.executesCondition {@code (offset < length): False}
 * @utbot.executesCondition {@code (negative): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return negative ? -num : num;}
 *  */
    @Test
    public void testParseInt_OffsetGreaterOrEqualLength_2() {
        String string = "2222";
        
        int actual = NumberInput.parseInt(string);
        
        assertEquals(2222, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseInt(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char c = str.charAt(0);
 *  */
    @Test
    public void testParseInt_ThrowStringIndexOutOfBoundsException() {
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:70) */
        NumberInput.parseInt(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(java.lang.String)}
 * @utbot.executesCondition {@code (negative): True}
 * @utbot.executesCondition {@code (length == 1): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.Integer#parseInt(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Integer.parseInt(str);
 *  */
    @Test
    public void testParseInt_ThrowNumberFormatException() {
        String string = "-";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.NumberFormatException: For input string: "-"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:658)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:78) */
        NumberInput.parseInt(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = str.charAt(0);
 *  */
    @Test
    public void testParseInt_ThrowNullPointerException1() {
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:70) */
        NumberInput.parseInt(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseInt(java.lang.String)
    
    @Test
    public void testParseInt1() {
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.NumberFormatException: For input string: "  "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:87) */
        NumberInput.parseInt(string);
    }
    
    @Test
    public void testParseInt2() {
        String string = "2:";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.NumberFormatException: For input string: "2:"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:93) */
        NumberInput.parseInt(string);
    }
    
    @Test
    public void testParseInt3() {
        String string = "2222\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.NumberFormatException: For input string: "2222 "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:107) */
        NumberInput.parseInt(string);
    }
    
    @Test
    public void testParseInt4() {
        String string = "222:";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.NumberFormatException: For input string: "222:"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:107) */
        NumberInput.parseInt(string);
    }
    
    @Test
    public void testParseInt5() {
        String string = "22\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.NumberFormatException: For input string: "22 "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:99) */
        NumberInput.parseInt(string);
    }
    
    @Test
    public void testParseInt6() {
        String string = "22:";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.NumberFormatException: For input string: "22:"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:99) */
        NumberInput.parseInt(string);
    }
    
    @Test
    public void testParseInt7() {
        String string = ":\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.NumberFormatException: For input string: ": "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:87) */
        NumberInput.parseInt(string);
    }
    
    @Test
    public void testParseInt8() {
        String string = "-2\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.NumberFormatException: For input string: "-2 "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:93) */
        NumberInput.parseInt(string);
    }
    
    @Test
    public void testParseInt9() {
        String string = "-2:";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.NumberFormatException: For input string: "-2:"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:93) */
        NumberInput.parseInt(string);
    }
    
    @Test
    public void testParseInt10() {
        String string = "-22:\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.NumberFormatException: For input string: "-22:   "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:99) */
        NumberInput.parseInt(string);
    }
    
    @Test
    public void testParseInt11() {
        String string = "-222\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.NumberFormatException: For input string: "-222   "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:107) */
        NumberInput.parseInt(string);
    }
    
    @Test
    public void testParseInt12() {
        String string = "-:\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.NumberFormatException: For input string: "-: "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:87) */
        NumberInput.parseInt(string);
    }
    
    @Test
    public void testParseInt13() {
        String string = "-\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.NumberFormatException: For input string: "-  "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:87) */
        NumberInput.parseInt(string);
    }
    
    @Test
    public void testParseInt14() {
        String string = "-\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.NumberFormatException: For input string: "-          "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:78) */
        NumberInput.parseInt(string);
    }
    
    @Test
    public void testParseInt15() {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseInt] produces [java.lang.NumberFormatException: For input string: "          "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:83) */
        NumberInput.parseInt(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.NumberInput.parseDouble
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseDouble(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseDouble(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} 
 *  */
    @Test
    public void testParseDouble_ThrowNumberFormatException() {
        String string = "+";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseDouble] produces [java.lang.NumberFormatException: For input string: "+"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:290) */
        NumberInput.parseDouble(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseDouble(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Double.parseDouble(numStr);
 *  */
    @Test
    public void testParseDouble_ThrowNumberFormatException_1() {
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:290) */
        NumberInput.parseDouble(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parseDouble(java.lang.String)
    
    @Test
    public void testParseDouble1() {
        String string = "2.2250\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        double actual = NumberInput.parseDouble(string);
        
        org.junit.Assert.assertEquals(2.225, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseDouble(java.lang.String)
    
    @Test
    public void testParseDouble2() {
        String string = "+0x\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseDouble] produces [java.lang.NumberFormatException: For input string: "+0x                   !"]
            java.base/jdk.internal.math.FloatingDecimal.parseHexString(FloatingDecimal.java:2082)
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1870)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:290) */
        NumberInput.parseDouble(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.NumberInput.parseLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseLong(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(java.lang.String)}
 * @utbot.returnsFrom {@code return (long) parseInt(str);}
 *  */
    @Test
    public void testParseLong_ReturnParseIntStr() {
        String string = "-2";
        
        long actual = NumberInput.parseLong(string);
        
        assertEquals(-2L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(java.lang.String)}
 * @utbot.returnsFrom {@code return (long) parseInt(str);}
 *  */
    @Test
    public void testParseLong_ReturnParseIntStr_1() {
        String string = "2";
        
        long actual = NumberInput.parseLong(string);
        
        assertEquals(2L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(java.lang.String)}
 * @utbot.returnsFrom {@code return (long) parseInt(str);}
 *  */
    @Test
    public void testParseLong_ReturnParseIntStr_2() {
        String string = "22";
        
        long actual = NumberInput.parseLong(string);
        
        assertEquals(22L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(java.lang.String)}
 * @utbot.returnsFrom {@code return (long) parseInt(str);}
 *  */
    @Test
    public void testParseLong_ReturnParseIntStr_3() {
        String string = "222";
        
        long actual = NumberInput.parseLong(string);
        
        assertEquals(222L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseLong(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return (long) parseInt(str);
 *  */
    @Test
    public void testParseLong_ThrowStringIndexOutOfBoundsException() {
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:70)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:132) */
        NumberInput.parseLong(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int length = str.length();
 *  */
    @Test
    public void testParseLong_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:130) */
        NumberInput.parseLong(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseLong(java.lang.String)
    
    @Test
    public void testParseLong1() {
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.NumberFormatException: For input string: "  "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:87)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:132) */
        NumberInput.parseLong(string);
    }
    
    @Test
    public void testParseLong2() {
        String string = ":\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.NumberFormatException: For input string: ": "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:87)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:132) */
        NumberInput.parseLong(string);
    }
    
    @Test
    public void testParseLong3() {
        String string = "22\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.NumberFormatException: For input string: "22 "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:99)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:132) */
        NumberInput.parseLong(string);
    }
    
    @Test
    public void testParseLong4() {
        String string = "2:";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.NumberFormatException: For input string: "2:"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:93)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:132) */
        NumberInput.parseLong(string);
    }
    
    @Test
    public void testParseLong5() {
        String string = "2\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.NumberFormatException: For input string: "2 "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:93)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:132) */
        NumberInput.parseLong(string);
    }
    
    @Test
    public void testParseLong6() {
        String string = "222\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.NumberFormatException: For input string: "222      "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:107)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:132) */
        NumberInput.parseLong(string);
    }
    
    @Test
    public void testParseLong7() {
        String string = "22:";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.NumberFormatException: For input string: "22:"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:99)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:132) */
        NumberInput.parseLong(string);
    }
    
    @Test
    public void testParseLong8() {
        String string = "+\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.NumberFormatException: For input string: "+         "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Long.parseLong(Long.java:711)
            java.base/java.lang.Long.parseLong(Long.java:836)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:135) */
        NumberInput.parseLong(string);
    }
    
    @Test
    public void testParseLong9() {
        String string = "-:";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.NumberFormatException: For input string: "-:"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:87)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:132) */
        NumberInput.parseLong(string);
    }
    
    @Test
    public void testParseLong10() {
        String string = "-2:";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.NumberFormatException: For input string: "-2:"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:93)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:132) */
        NumberInput.parseLong(string);
    }
    
    @Test
    public void testParseLong11() {
        String string = "-22\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.NumberFormatException: For input string: "-22      "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:99)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:132) */
        NumberInput.parseLong(string);
    }
    
    @Test
    public void testParseLong12() {
        String string = "-\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.NumberFormatException: For input string: "- "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:87)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:132) */
        NumberInput.parseLong(string);
    }
    
    @Test
    public void testParseLong13() {
        String string = "-";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.NumberFormatException: For input string: "-"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:658)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:78)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:132) */
        NumberInput.parseLong(string);
    }
    
    @Test
    public void testParseLong14() {
        String string = "-2\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.NumberFormatException: For input string: "-2 "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:93)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:132) */
        NumberInput.parseLong(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.NumberInput.parseLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseLong([C, int, int)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.NumberInput#parseInt(char[],int,int)}
 * @utbot.returnsFrom {@code return val + (long) parseInt(digitChars, offset + len1, 9);}
 *  */
    @Test
    public void testParseLong_NumberInputParseInt() {
        char[] charArray = new char[31];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        charArray[15] = ' ';
        charArray[16] = ' ';
        charArray[17] = ' ';
        charArray[18] = ' ';
        charArray[19] = ' ';
        charArray[20] = ' ';
        charArray[21] = ' ';
        charArray[22] = ' ';
        charArray[23] = ' ';
        charArray[24] = ' ';
        charArray[25] = ' ';
        charArray[26] = ' ';
        charArray[27] = ' ';
        charArray[28] = ' ';
        charArray[29] = ' ';
        charArray[30] = ' ';
        
        long actual = NumberInput.parseLong(charArray, 7, 10);
        
        assertEquals(-17777777776L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseLong([C, int, int)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: long val = parseInt(digitChars, offset, len1) * L_BILLION;
 *  */
    @Test
    public void testParseLong_ThrowArrayIndexOutOfBoundsException() {
        char[] charArray = {' ', ' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:121) */
        NumberInput.parseLong(charArray, 129, -255);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: long val = parseInt(digitChars, offset, len1) * L_BILLION;
 *  */
    @Test
    public void testParseLong_ThrowArrayIndexOutOfBoundsException_1() {
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:34)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:121) */
        NumberInput.parseLong(charArray, 0, 11);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: long val = parseInt(digitChars, offset, len1) * L_BILLION;
 *  */
    @Test
    public void testParseLong_ThrowArrayIndexOutOfBoundsException_2() {
        char[] charArray = {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
            ' ', ' '
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:40)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:121) */
        NumberInput.parseLong(charArray, 6, 256);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: long val = parseInt(digitChars, offset, len1) * L_BILLION;
 *  */
    @Test
    public void testParseLong_ThrowArrayIndexOutOfBoundsException_3() {
        char[] charArray = {' ', ' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:36)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:121) */
        NumberInput.parseLong(charArray, 0, 133);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: long val = parseInt(digitChars, offset, len1) * L_BILLION;
 *  */
    @Test
    public void testParseLong_ThrowArrayIndexOutOfBoundsException_4() {
        char[] charArray = new char[14];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:44)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:121) */
        NumberInput.parseLong(charArray, 8, 253);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: long val = parseInt(digitChars, offset, len1) * L_BILLION;
 *  */
    @Test
    public void testParseLong_ThrowArrayIndexOutOfBoundsException_5() {
        char[] charArray = new char[11];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:46)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:121) */
        NumberInput.parseLong(charArray, 4, 17);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: long val = parseInt(digitChars, offset, len1) * L_BILLION;
 *  */
    @Test
    public void testParseLong_ThrowArrayIndexOutOfBoundsException_6() {
        char[] charArray = new char[13];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:42)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:121) */
        NumberInput.parseLong(charArray, 8, 15);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: long val = parseInt(digitChars, offset, len1) * L_BILLION;
 *  */
    @Test
    public void testParseLong_ThrowArrayIndexOutOfBoundsException_7() {
        char[] charArray = new char[15];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:38)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:121) */
        NumberInput.parseLong(charArray, 12, 13);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: long val = parseInt(digitChars, offset, len1) * L_BILLION;
 *  */
    @Test
    public void testParseLong_ThrowArrayIndexOutOfBoundsException_8() {
        char[] charArray = new char[12];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:48)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:121) */
        NumberInput.parseLong(charArray, 4, 108);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return val + (long) parseInt(digitChars, offset + len1, 9);
 *  */
    @Test
    public void testParseLong_ThrowArrayIndexOutOfBoundsException_9() {
        char[] charArray = new char[14];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:122) */
        NumberInput.parseLong(charArray, 10, 13);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return val + (long) parseInt(digitChars, offset + len1, 9);
 *  */
    @Test
    public void testParseLong_ThrowArrayIndexOutOfBoundsException_10() {
        char[] charArray = {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:122) */
        NumberInput.parseLong(charArray, 1, 17);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return val + (long) parseInt(digitChars, offset + len1, 9);
 *  */
    @Test
    public void testParseLong_ThrowArrayIndexOutOfBoundsException_11() {
        char[] charArray = new char[15];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:122) */
        NumberInput.parseLong(charArray, 12, 12);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return val + (long) parseInt(digitChars, offset + len1, 9);
 *  */
    @Test
    public void testParseLong_ThrowArrayIndexOutOfBoundsException_12() {
        char[] charArray = new char[14];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:122) */
        NumberInput.parseLong(charArray, 8, 15);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return val + (long) parseInt(digitChars, offset + len1, 9);
 *  */
    @Test
    public void testParseLong_ThrowArrayIndexOutOfBoundsException_13() {
        char[] charArray = new char[13];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:122) */
        NumberInput.parseLong(charArray, 8, 14);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return val + (long) parseInt(digitChars, offset + len1, 9);
 *  */
    @Test
    public void testParseLong_ThrowArrayIndexOutOfBoundsException_14() {
        char[] charArray = new char[11];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:122) */
        NumberInput.parseLong(charArray, 4, 16);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return val + (long) parseInt(digitChars, offset + len1, 9);
 *  */
    @Test
    public void testParseLong_ThrowArrayIndexOutOfBoundsException_15() {
        char[] charArray = new char[26];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        charArray[15] = ' ';
        charArray[16] = ' ';
        charArray[17] = ' ';
        charArray[18] = ' ';
        charArray[19] = ' ';
        charArray[20] = ' ';
        charArray[21] = ' ';
        charArray[22] = ' ';
        charArray[23] = ' ';
        charArray[24] = ' ';
        charArray[25] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 127 out of bounds for length 26]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:122) */
        NumberInput.parseLong(charArray, 8, 128);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return val + (long) parseInt(digitChars, offset + len1, 9);
 *  */
    @Test
    public void testParseLong_ThrowArrayIndexOutOfBoundsException_16() {
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:122) */
        NumberInput.parseLong(charArray, 0, 10);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return val + (long) parseInt(digitChars, offset + len1, 9);
 *  */
    @Test
    public void testParseLong_ThrowArrayIndexOutOfBoundsException_17() {
        char[] charArray = {' ', ' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:122) */
        NumberInput.parseLong(charArray, 0, 11);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseBigDecimal([C)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(char[])}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(char[],int,int)}
 * @utbot.returnsFrom {@code return parseBigDecimal(buffer, 0, buffer.length);}
 *  */
    @Test
    public void testParseBigDecimal_NumberInputParseBigDecimal() {
        char[] charArray = {'+', '0'};
        
        BigDecimal actual = NumberInput.parseBigDecimal(charArray);
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseBigDecimal([C)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(char[])}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return parseBigDecimal(buffer, 0, buffer.length);
 *  */
    @Test
    public void testParseBigDecimal_ThrowNumberFormatException() {
        char[] charArray = {'+', '/'};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal] produces [java.lang.NumberFormatException: Character / is neither a decimal digit number, decimal point, nor "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:586)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:299) */
        NumberInput.parseBigDecimal(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(char[])}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return parseBigDecimal(buffer, 0, buffer.length);
 *  */
    @Test
    public void testParseBigDecimal_ThrowNumberFormatException_1() {
        char[] charArray = {'+'};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal] produces [java.lang.NumberFormatException: No digits found.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:592)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:299) */
        NumberInput.parseBigDecimal(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(char[])}
 * @utbot.throwsException {@link java.lang.NumberFormatException} 
 *  */
    @Test
    public void testParseBigDecimal_ThrowNumberFormatException_2() {
        char[] charArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal] produces [java.lang.NumberFormatException]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:692)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:299) */
        NumberInput.parseBigDecimal(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return parseBigDecimal(buffer, 0, buffer.length);
 *  */
    @Test
    public void testParseBigDecimal_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:299) */
        NumberInput.parseBigDecimal(((char[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseBigDecimal([C, int, int)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(char[],int,int)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return new BigDecimal(buffer, offset, len);
 *  */
    @Test
    public void testParseBigDecimal_ThrowNumberFormatException1() {
        char[] charArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal] produces [java.lang.NumberFormatException]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:692)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305) */
        NumberInput.parseBigDecimal(charArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(char[],int,int)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return new BigDecimal(buffer, offset, len);
 *  */
    @Test
    public void testParseBigDecimal_ThrowNumberFormatException_11() {
        char[] charArray = new char[25];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = '/';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        charArray[15] = ' ';
        charArray[16] = ' ';
        charArray[17] = ' ';
        charArray[18] = ' ';
        charArray[19] = ' ';
        charArray[20] = ' ';
        charArray[21] = ' ';
        charArray[22] = ' ';
        charArray[23] = ' ';
        charArray[24] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal] produces [java.lang.NumberFormatException: Character array is missing "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:645)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305) */
        NumberInput.parseBigDecimal(charArray, 4, 19);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(char[],int,int)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return new BigDecimal(buffer, offset, len);
 *  */
    @Test
    public void testParseBigDecimal_ThrowNumberFormatException_21() {
        char[] charArray = new char[23];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        charArray[15] = ' ';
        charArray[16] = ' ';
        charArray[17] = '-';
        charArray[18] = ':';
        charArray[19] = ' ';
        charArray[20] = ' ';
        charArray[21] = ' ';
        charArray[22] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal] produces [java.lang.NumberFormatException: Character : is neither a decimal digit number, decimal point, nor "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:586)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305) */
        NumberInput.parseBigDecimal(charArray, 17, 6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(char[],int,int)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return new BigDecimal(buffer, offset, len);
 *  */
    @Test
    public void testParseBigDecimal_ThrowNumberFormatException_3() {
        char[] charArray = new char[39];
        charArray[0] = ' ';
        charArray[1] = ' ';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = '-';
        charArray[6] = 'E';
        charArray[7] = '-';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        charArray[15] = ' ';
        charArray[16] = ' ';
        charArray[17] = ' ';
        charArray[18] = ' ';
        charArray[19] = ' ';
        charArray[20] = ' ';
        charArray[21] = ' ';
        charArray[22] = ' ';
        charArray[23] = ' ';
        charArray[24] = ' ';
        charArray[25] = ' ';
        charArray[26] = ' ';
        charArray[27] = ' ';
        charArray[28] = ' ';
        charArray[29] = ' ';
        charArray[30] = ' ';
        charArray[31] = ' ';
        charArray[32] = ' ';
        charArray[33] = ' ';
        charArray[34] = ' ';
        charArray[35] = ' ';
        charArray[36] = ' ';
        charArray[37] = ' ';
        charArray[38] = ' ';
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal] produces [java.lang.NumberFormatException: No exponent digits.]
            java.base/java.math.BigDecimal.parseExp(BigDecimal.java:726)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:580)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305) */
        NumberInput.parseBigDecimal(charArray, 5, 2);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parseBigDecimal([C, int, int)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.io.NumberInput}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(char[],int,int)}
     */
    @Test
    public void testParseBigDecimalThrowsNFEWithNonEmptyPrimitiveArrayAndCornerCase() {
        char[] charArray = {'', '', '@'};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal] produces [java.lang.NumberFormatException: Bad offset or len arguments for char[] input.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:500)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305) */
        NumberInput.parseBigDecimal(charArray, -1, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseBigDecimal(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(java.lang.String)}
 * @utbot.returnsFrom {@code return new BigDecimal(numStr);}
 *  */
    @Test
    public void testParseBigDecimal_Return() {
        String string = "0";
        
        BigDecimal actual = NumberInput.parseBigDecimal(string);
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseBigDecimal(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return new BigDecimal(numStr);
 *  */
    @Test
    public void testParseBigDecimal_ThrowNumberFormatException2() {
        String string = "+";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal] produces [java.lang.NumberFormatException: No digits found.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:592)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:295) */
        NumberInput.parseBigDecimal(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return new BigDecimal(numStr);
 *  */
    @Test
    public void testParseBigDecimal_ThrowNumberFormatException_12() {
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal] produces [java.lang.NumberFormatException]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:692)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:295) */
        NumberInput.parseBigDecimal(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberInput}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return new BigDecimal(numStr);
 *  */
    @Test
    public void testParseBigDecimal_ThrowNumberFormatException_22() {
        String string = ":                  ";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal] produces [java.lang.NumberFormatException: Character array is missing "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:645)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:295) */
        NumberInput.parseBigDecimal(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseBigDecimal(java.lang.String)
    
    @Test
    public void testParseBigDecimal1() {
        String string = "0\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal] produces [java.lang.NumberFormatException: Character   is neither a decimal digit number, decimal point, nor "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:586)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:295) */
        NumberInput.parseBigDecimal(string);
    }
    
    @Test
    public void testParseBigDecimal2() {
        String string = "-e+0\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal] produces [java.lang.NumberFormatException: Too many nonzero exponent digits.]
            java.base/java.math.BigDecimal.parseExp(BigDecimal.java:734)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:580)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:295) */
        NumberInput.parseBigDecimal(string);
    }
    
    @Test
    public void testParseBigDecimal3() {
        String string = "+0E\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal] produces [java.lang.NumberFormatException: Not a digit.]
            java.base/java.math.BigDecimal.parseExp(BigDecimal.java:743)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:580)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:295) */
        NumberInput.parseBigDecimal(string);
    }
    
    @Test
    public void testParseBigDecimal4() {
        String string = "..\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal] produces [java.lang.NumberFormatException: Character array contains more than one decimal point.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:560)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:295) */
        NumberInput.parseBigDecimal(string);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1022106862821700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1022106862821700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1022106862829700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1022106862821700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1022106862829700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

