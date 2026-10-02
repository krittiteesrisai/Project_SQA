package org.apache.commons.lang;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_lang_NumberUtilsTest {
    ///region Test suites for executable org.apache.commons.lang.NumberUtils.isNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): False}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): True}
 * @utbot.executesCondition {@code (i == sz): True}
 *  */
    @Test
    public void testIsNumber_IEqualsSz() {
        String string = "0x";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): False}
 * @utbot.executesCondition {@code (sz > start + 1): False}
 * @utbot.executesCondition {@code (chars[i] >= '0'): True}
 * @utbot.executesCondition {@code (chars[i] <= '9'): False}
 * @utbot.executesCondition {@code (chars[i] == 'e'): False}
 * @utbot.executesCondition {@code (chars[i] == 'E'): False}
 * @utbot.executesCondition {@code (!allowSigns): True}
 * @utbot.executesCondition {@code (chars[i] == 'd'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 * @utbot.returnsFrom {@code return foundDigit;}
 *  */
    @Test
    public void testIsNumber_IOfCharsEqualsD() {
        String string = "d";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): False}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): True}
 * @utbot.executesCondition {@code (i == sz): False}
 * @utbot.iterates iterate the loop {@code for(; i < chars.length; i++)} once
 *  */
    @Test
    public void testIsNumber_IOfCharsLessOrEqualF() {
        String string = "0xF";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): False}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): False}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} twice
 *  */
    @Test
    public void testIsNumber_HasDecPointOrHasExp() {
        String string = "..  ";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): True}
 *  */
    @Test
    public void testIsNumber_StringUtilsIsEmpty() {
        boolean actual = NumberUtils.isNumber(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): True}
 *  */
    @Test
    public void testIsNumber_StringUtilsIsEmpty_1() {
        String string = "";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): True}
 * @utbot.executesCondition {@code (i == sz): True}
 *  */
    @Test
    public void testIsNumber_IEqualsSz_1() {
        String string = "-0x";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): False}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 *  */
    @Test
    public void testIsNumber_IOfCharsNotEqualsChar() {
        String string = "-/ ";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): False}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 *  */
    @Test
    public void testIsNumber_NotAllowSigns() {
        String string = "-+ ";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): False}
 * @utbot.executesCondition {@code (chars[i] >= '0'): True}
 * @utbot.executesCondition {@code (chars[i] <= '9'): False}
 * @utbot.executesCondition {@code (chars[i] == 'e'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 *  */
    @Test
    public void testIsNumber_IOfCharsEqualsE() {
        String string = "-e";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): False}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 * @utbot.returnsFrom {@code return !allowSigns && foundDigit;}
 *  */
    @Test
    public void testIsNumber_NotAllowSignsAndFoundDigit() {
        String string = "-";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): False}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 *  */
    @Test
    public void testIsNumber_ILessThanSzOrILessThanSzPlus1AndAllowSignsAndNotFoundDigit() {
        String string = "-e ";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): False}
 * @utbot.executesCondition {@code (chars[i] >= '0'): True}
 * @utbot.executesCondition {@code (chars[i] <= '9'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 *  */
    @Test
    public void testIsNumber_IOfCharsLessOrEqual9() {
        String string = "-2";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): False}
 * @utbot.executesCondition {@code (chars[i] >= '0'): True}
 * @utbot.executesCondition {@code (chars[i] <= '9'): False}
 * @utbot.executesCondition {@code (chars[i] == 'e'): False}
 * @utbot.executesCondition {@code (chars[i] == 'E'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 *  */
    @Test
    public void testIsNumber_IOfCharsEqualsE_1() {
        String string = "-E";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): True}
 * @utbot.executesCondition {@code (i == sz): False}
 * @utbot.iterates iterate the loop {@code for(; i < chars.length; i++)} once
 *  */
    @Test
    public void testIsNumber_IOfCharsGreaterThanF() {
        String string = "-0xg";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): False}
 * @utbot.executesCondition {@code (chars[i] >= '0'): True}
 * @utbot.executesCondition {@code (chars[i] <= '9'): False}
 * @utbot.executesCondition {@code (chars[i] == 'e'): False}
 * @utbot.executesCondition {@code (chars[i] == 'E'): False}
 * @utbot.executesCondition {@code (!allowSigns): True}
 * @utbot.executesCondition {@code (chars[i] == 'd'): False}
 * @utbot.executesCondition {@code (chars[i] == 'D'): False}
 * @utbot.executesCondition {@code (chars[i] == 'f'): False}
 * @utbot.executesCondition {@code (chars[i] == 'F'): False}
 * @utbot.executesCondition {@code (chars[i] == 'l'): False}
 * @utbot.executesCondition {@code (chars[i] == 'L'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 * @utbot.returnsFrom {@code return foundDigit && !hasExp;}
 *  */
    @Test
    public void testIsNumber_FoundDigitAndNotHasExp() {
        String string = "-L";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): True}
 * @utbot.executesCondition {@code (i == sz): False}
 * @utbot.iterates iterate the loop {@code for(; i < chars.length; i++)} once
 *  */
    @Test
    public void testIsNumber_IOfCharsLessOrEqual9_1() {
        String string = "-0x2";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): False}
 * @utbot.executesCondition {@code (chars[i] >= '0'): True}
 * @utbot.executesCondition {@code (chars[i] <= '9'): False}
 * @utbot.executesCondition {@code (chars[i] == 'e'): False}
 * @utbot.executesCondition {@code (chars[i] == 'E'): False}
 * @utbot.executesCondition {@code (!allowSigns): False}
 * @utbot.executesCondition {@code (chars[i] == 'l'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} 3 times
 * @utbot.returnsFrom {@code return foundDigit && !hasExp;}
 *  */
    @Test
    public void testIsNumber_FoundDigitAndNotHasExp_1() {
        String string = "-0el";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): False}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} 3 times
 *  */
    @Test
    public void testIsNumber_HasDecPointOrHasExp_1() {
        String string = "-0e. ";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): False}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} 3 times
 *  */
    @Test
    public void testIsNumber_HasExp() {
        String string = "-0Ee ";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isNumber(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (StringUtils.isEmpty(str)): False}
    /// invoke:
    ///     {@link java.lang.String#toCharArray()} once
    /// execute conditions:
    ///     {@code ((chars[0] == '-')): True},
    ///     {@code (sz > start + 1): False},
    ///     {@code (chars[i] >= '0'): True},
    ///     {@code (chars[i] <= '9'): False},
    ///     {@code (chars[i] == 'e'): False},
    ///     {@code (chars[i] == 'E'): False},
    ///     {@code (!allowSigns): True},
    ///     {@code (chars[i] == 'd'): False}
    /// return from: {@code return foundDigit;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (chars[i] == 'D'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 * @utbot.returnsFrom {@code return foundDigit;}
 *  */
    @Test
    public void testIsNumber_IOfCharsEqualsD_1() {
        String string = "-D";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (chars[i] == 'D'): False}
 * @utbot.executesCondition {@code (chars[i] == 'f'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 * @utbot.returnsFrom {@code return foundDigit;}
 *  */
    @Test
    public void testIsNumber_IOfCharsEqualsF() {
        String string = "-f";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (chars[i] == 'D'): False}
 * @utbot.executesCondition {@code (chars[i] == 'f'): False}
 * @utbot.executesCondition {@code (chars[i] == 'F'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 * @utbot.returnsFrom {@code return foundDigit;}
 *  */
    @Test
    public void testIsNumber_IOfCharsEqualsF_1() {
        String string = "-F";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isNumber(java.lang.String)
    
    @Test
    public void testIsNumber1() {
        String string = "2";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsNumber2() {
        String string = "0x2";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsNumber3() {
        String string = "E";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsNumber4() {
        String string = "0xc    ";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsNumber5() {
        String string = "0x\u8000";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsNumber6() {
        String string = "2.2E\u0000\u0000\u0000\u0000";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsNumber7() {
        String string = "2E-22\u0000";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsNumber8() {
        String string = "0e+.\u0000\u0000\u0000\u0000";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsNumber9() {
        String string = "0e2+    ";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsNumber10() {
        String string = "0e2e    ";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsNumber11() {
        String string = "-0L";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsNumber12() {
        String string = "-d";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsNumber13() {
        String string = "-0xc";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsNumber14() {
        String string = "-0xC\u0000";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsNumber15() {
        String string = "-2.E-\u0000";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.NumberUtils.stringToInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stringToInt(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#stringToInt(java.lang.String,int)}
 * @utbot.invokes {@link java.lang.Integer#parseInt(java.lang.String)}
 * @utbot.returnsFrom {@code return defaultValue;}
 * @utbot.caughtException {@code NumberFormatException nfe}
 *  */
    @Test
    public void testStringToInt_CatchNumberFormatException() {
        int actual = NumberUtils.stringToInt(null, -255);
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.NumberUtils.stringToInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stringToInt(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#stringToInt(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.lang.NumberUtils#stringToInt(java.lang.String,int)}
 * @utbot.returnsFrom {@code return stringToInt(str, 0);}
 *  */
    @Test
    public void testStringToInt_NumberUtilsStringToInt() {
        int actual = NumberUtils.stringToInt(null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.NumberUtils.createInteger
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createInteger(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} 
 *  */
    @Test
    public void testCreateInteger_ThrowNumberFormatException() {
        String string = "+0x";
        
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createInteger] produces [java.lang.NumberFormatException: For input string: "" under radix 16]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:678)
            java.base/java.lang.Integer.valueOf(Integer.java:973)
            java.base/java.lang.Integer.decode(Integer.java:1458)
            org.apache.commons.lang.NumberUtils.createInteger(NumberUtils.java:342) */
        NumberUtils.createInteger(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Integer.decode(val);
 *  */
    @Test
    public void testCreateInteger_ThrowNumberFormatException_1() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createInteger] produces [java.lang.NumberFormatException: Zero length string]
            java.base/java.lang.Integer.decode(Integer.java:1423)
            org.apache.commons.lang.NumberUtils.createInteger(NumberUtils.java:342) */
        NumberUtils.createInteger(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Integer.decode(val);
 *  */
    @Test
    public void testCreateInteger_ThrowNumberFormatException_2() {
        String string = "0x-";
        
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createInteger] produces [java.lang.NumberFormatException: Sign character in wrong position]
            java.base/java.lang.Integer.decode(Integer.java:1447)
            org.apache.commons.lang.NumberUtils.createInteger(NumberUtils.java:342) */
        NumberUtils.createInteger(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createInteger(java.lang.String)
    
    @Test
    public void testCreateInteger1() {
        String string = "+0";
        
        Integer actual = NumberUtils.createInteger(string);
        
        Integer expected = 0;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.NumberUtils.createBigInteger
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createBigInteger(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createBigInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: BigInteger bi = new BigInteger(val);
 *  */
    @Test
    public void testCreateBigInteger_ThrowNumberFormatException() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: Zero length BigInteger]
            java.base/java.math.BigInteger.<init>(BigInteger.java:488)
            java.base/java.math.BigInteger.<init>(BigInteger.java:676)
            org.apache.commons.lang.NumberUtils.createBigInteger(NumberUtils.java:364) */
        NumberUtils.createBigInteger(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createBigInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: BigInteger bi = new BigInteger(val);
 *  */
    @Test
    public void testCreateBigInteger_ThrowNumberFormatException_1() {
        String string = "-+";
        
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: Illegal embedded sign character]
            java.base/java.math.BigInteger.<init>(BigInteger.java:496)
            java.base/java.math.BigInteger.<init>(BigInteger.java:676)
            org.apache.commons.lang.NumberUtils.createBigInteger(NumberUtils.java:364) */
        NumberUtils.createBigInteger(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createBigInteger(java.lang.String)
    
    @Test
    public void testCreateBigInteger1() {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: For input string: "   "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.math.BigInteger.<init>(BigInteger.java:538)
            java.base/java.math.BigInteger.<init>(BigInteger.java:676)
            org.apache.commons.lang.NumberUtils.createBigInteger(NumberUtils.java:364) */
        NumberUtils.createBigInteger(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.NumberUtils.createNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createNumber(java.lang.String)}
 * @utbot.executesCondition {@code (val == null): True}
 *  */
    @Test
    public void testCreateNumber_ValEqualsNull() {
        Number actual = NumberUtils.createNumber(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createNumber(java.lang.String)}
 * @utbot.executesCondition {@code (val == null): False}
 * @utbot.executesCondition {@code (val.length() == 0): False}
 * @utbot.executesCondition {@code (val.startsWith("--")): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 *  */
    @Test
    public void testCreateNumber_ValStartsWith() {
        String string = "--";
        
        Number actual = NumberUtils.createNumber(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createNumber(java.lang.String)}
 * @utbot.executesCondition {@code (val.length() == 0): False}
 * @utbot.executesCondition {@code (val.startsWith("--")): False}
 * @utbot.executesCondition {@code (val.startsWith("0x") || val.startsWith("-0x")): True}
 * @utbot.executesCondition {@code (decPos > -1): False}
 * @utbot.executesCondition {@code (expPos > -1): False}
 * @utbot.executesCondition {@code (!Character.isDigit(lastChar)): True}
 * @utbot.executesCondition {@code (expPos > -1): False}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: switch(lastChar) case: default
 *  */
    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_ThrowNumberFormatException() {
        String string = ":";
        
        NumberUtils.createNumber(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createNumber(java.lang.String)}
 * @utbot.executesCondition {@code (val.length() == 0): True}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: val.length() == 0
 *  */
    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_ThrowNumberFormatException_1() {
        String string = "";
        
        NumberUtils.createNumber(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createNumber(java.lang.String)}
 * @utbot.executesCondition {@code (val.length() == 0): False}
 * @utbot.executesCondition {@code (val.startsWith("--")): False}
 * @utbot.executesCondition {@code (val.startsWith("0x") || val.startsWith("-0x")): True}
 * @utbot.executesCondition {@code (decPos > -1): True}
 * @utbot.executesCondition {@code (expPos > -1): True}
 * @utbot.executesCondition {@code (expPos < decPos): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: expPos < decPos
 *  */
    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_ThrowNumberFormatException_2() {
        String string = "e.";
        
        NumberUtils.createNumber(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createNumber(java.lang.String)}
 * @utbot.executesCondition {@code (val.length() == 0): False}
 * @utbot.executesCondition {@code (val.startsWith("--")): False}
 * @utbot.executesCondition {@code (val.startsWith("0x") || val.startsWith("-0x")): True}
 * @utbot.executesCondition {@code (decPos > -1): False}
 * @utbot.executesCondition {@code (expPos > -1): True}
 * @utbot.executesCondition {@code (!Character.isDigit(lastChar)): True}
 * @utbot.executesCondition {@code (expPos > -1): True}
 * @utbot.executesCondition {@code (expPos < val.length() - 1): False}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: switch(lastChar) case: default
 *  */
    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_ThrowNumberFormatException_3() {
        String string = "e";
        
        NumberUtils.createNumber(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createNumber(java.lang.String)}
 * @utbot.executesCondition {@code (val.length() == 0): False}
 * @utbot.executesCondition {@code (val.startsWith("--")): False}
 * @utbot.executesCondition {@code (val.startsWith("0x") || val.startsWith("-0x")): True}
 * @utbot.executesCondition {@code (decPos > -1): True}
 * @utbot.executesCondition {@code (expPos > -1): False}
 * @utbot.executesCondition {@code (!Character.isDigit(lastChar)): True}
 * @utbot.executesCondition {@code (expPos > -1): False}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: switch(lastChar) case: default
 *  */
    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_ThrowNumberFormatException_4() {
        String string = ".";
        
        NumberUtils.createNumber(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createNumber(java.lang.String)}
 * @utbot.executesCondition {@code (val.startsWith("0x") || val.startsWith("-0x")): True}
 * @utbot.executesCondition {@code (decPos > -1): False}
 * @utbot.executesCondition {@code (expPos > -1): False}
 * @utbot.executesCondition {@code (!Character.isDigit(lastChar)): True}
 * @utbot.executesCondition {@code (expPos > -1): False}
 * @utbot.executesCondition {@code (dec == null): True}
 * @utbot.executesCondition {@code (exp == null): True}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.invokes {@link java.lang.Character#isDigit(char)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.invokes org.apache.commons.lang.NumberUtils#isAllZeros(java.lang.String)
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.activatesSwitch {@code switch(lastChar) case: 'L'}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: (numeric.charAt(0) == '-' && isDigits(numeric.substring(1)) || isDigits(numeric))
 *  */
    @Test
    public void testCreateNumber_ThrowStringIndexOutOfBoundsException() {
        String string = "L";
        
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createNumber] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.lang.NumberUtils.createNumber(NumberUtils.java:195) */
        NumberUtils.createNumber(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createNumber(java.lang.String)}
 * @utbot.executesCondition {@code (val.startsWith("0x") || val.startsWith("-0x")): False}
 * @utbot.invokes {@link org.apache.commons.lang.NumberUtils#createInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return createInteger(val);
 *  */
    @Test
    public void testCreateNumber_ThrowNumberFormatException_5() {
        String string = "0x-";
        
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createNumber] produces [java.lang.NumberFormatException: Sign character in wrong position]
            java.base/java.lang.Integer.decode(Integer.java:1447)
            org.apache.commons.lang.NumberUtils.createInteger(NumberUtils.java:342)
            org.apache.commons.lang.NumberUtils.createNumber(NumberUtils.java:153) */
        NumberUtils.createNumber(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.NumberUtils.createFloat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createFloat(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createFloat(java.lang.String)}
 * @utbot.returnsFrom {@code return Float.valueOf(val);}
 *  */
    @Test
    public void testCreateFloat_FloatValueOf() {
        String string = "-9";
        
        Float actual = NumberUtils.createFloat(string);
        
        Float expected = -9.0f;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createFloat(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createFloat(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Float.valueOf(val);
 *  */
    @Test
    public void testCreateFloat_ThrowNumberFormatException() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createFloat] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
            java.base/java.lang.Float.parseFloat(Float.java:476)
            java.base/java.lang.Float.valueOf(Float.java:440)
            org.apache.commons.lang.NumberUtils.createFloat(NumberUtils.java:318) */
        NumberUtils.createFloat(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createFloat(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} 
 *  */
    @Test
    public void testCreateFloat_ThrowNumberFormatException_1() {
        String string = "-";
        
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createFloat] produces [java.lang.NumberFormatException: For input string: "-"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
            java.base/java.lang.Float.parseFloat(Float.java:476)
            java.base/java.lang.Float.valueOf(Float.java:440)
            org.apache.commons.lang.NumberUtils.createFloat(NumberUtils.java:318) */
        NumberUtils.createFloat(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.NumberUtils.isAllZeros
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isAllZeros(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isAllZeros(java.lang.String)}
 * @utbot.executesCondition {@code (s == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = s.length() - 1; i >= 0; i--)} once
 *  */
    @Test
    public void testIsAllZeros_SCharAtNotEquals0() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " ";
        
        Class numberUtilsClazz = Class.forName("org.apache.commons.lang.NumberUtils");
        Class stringType = Class.forName("java.lang.String");
        Method isAllZerosMethod = numberUtilsClazz.getDeclaredMethod("isAllZeros", stringType);
        isAllZerosMethod.setAccessible(true);
        java.lang.Object[] isAllZerosMethodArguments = new java.lang.Object[1];
        isAllZerosMethodArguments[0] = string;
        boolean actual = ((Boolean) isAllZerosMethod.invoke(null, isAllZerosMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isAllZeros(java.lang.String)}
 * @utbot.executesCondition {@code (s == null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsAllZeros_SEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class numberUtilsClazz = Class.forName("org.apache.commons.lang.NumberUtils");
        Class stringType = Class.forName("java.lang.String");
        Method isAllZerosMethod = numberUtilsClazz.getDeclaredMethod("isAllZeros", stringType);
        isAllZerosMethod.setAccessible(true);
        java.lang.Object[] isAllZerosMethodArguments = new java.lang.Object[1];
        isAllZerosMethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) isAllZerosMethod.invoke(null, isAllZerosMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isAllZeros(java.lang.String)}
 * @utbot.executesCondition {@code (s == null): False}
 * @utbot.returnsFrom {@code return s.length() > 0;}
 *  */
    @Test
    public void testIsAllZeros_SLengthLessOrEqualZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class numberUtilsClazz = Class.forName("org.apache.commons.lang.NumberUtils");
        Class stringType = Class.forName("java.lang.String");
        Method isAllZerosMethod = numberUtilsClazz.getDeclaredMethod("isAllZeros", stringType);
        isAllZerosMethod.setAccessible(true);
        java.lang.Object[] isAllZerosMethodArguments = new java.lang.Object[1];
        isAllZerosMethodArguments[0] = string;
        boolean actual = ((Boolean) isAllZerosMethod.invoke(null, isAllZerosMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isAllZeros(java.lang.String)}
 * @utbot.executesCondition {@code (s == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = s.length() - 1; i >= 0; i--)} once
 * @utbot.returnsFrom {@code return s.length() > 0;}
 *  */
    @Test
    public void testIsAllZeros_SLengthGreaterThanZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "0";
        
        Class numberUtilsClazz = Class.forName("org.apache.commons.lang.NumberUtils");
        Class stringType = Class.forName("java.lang.String");
        Method isAllZerosMethod = numberUtilsClazz.getDeclaredMethod("isAllZeros", stringType);
        isAllZerosMethod.setAccessible(true);
        java.lang.Object[] isAllZerosMethodArguments = new java.lang.Object[1];
        isAllZerosMethodArguments[0] = string;
        boolean actual = ((Boolean) isAllZerosMethod.invoke(null, isAllZerosMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.NumberUtils.createDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createDouble(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createDouble(java.lang.String)}
 * @utbot.returnsFrom {@code return Double.valueOf(val);}
 *  */
    @Test
    public void testCreateDouble_DoubleValueOf() {
        String string = "-9";
        
        Double actual = NumberUtils.createDouble(string);
        
        Double expected = -9.0;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createDouble(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createDouble(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Double.valueOf(val);
 *  */
    @Test
    public void testCreateDouble_ThrowNumberFormatException() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.lang.Double.valueOf(Double.java:614)
            org.apache.commons.lang.NumberUtils.createDouble(NumberUtils.java:329) */
        NumberUtils.createDouble(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createDouble(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Double.valueOf(val);
 *  */
    @Test
    public void testCreateDouble_ThrowNumberFormatException_1() {
        String string = "-";
        
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createDouble] produces [java.lang.NumberFormatException: For input string: "-"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.lang.Double.valueOf(Double.java:614)
            org.apache.commons.lang.NumberUtils.createDouble(NumberUtils.java:329) */
        NumberUtils.createDouble(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createDouble(java.lang.String)
    
    @Test
    public void testCreateDouble1() {
        String string = "-0x\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createDouble] produces [java.lang.NumberFormatException: For input string: "-0x                           !"]
            java.base/jdk.internal.math.FloatingDecimal.parseHexString(FloatingDecimal.java:2082)
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1870)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.lang.Double.valueOf(Double.java:614)
            org.apache.commons.lang.NumberUtils.createDouble(NumberUtils.java:329) */
        NumberUtils.createDouble(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.NumberUtils.maximum
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maximum(long, long, long)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#maximum(long,long,long)}
 * @utbot.executesCondition {@code (b > a): False}
 * @utbot.executesCondition {@code (c > a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMaximum_CLessOrEqualA() {
        long actual = NumberUtils.maximum(-219L, -219L, -219L);
        
        assertEquals(-219L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#maximum(long,long,long)}
 * @utbot.executesCondition {@code (b > a): True}
 * @utbot.executesCondition {@code (c > a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMaximum_CGreaterThanA() {
        long actual = NumberUtils.maximum(-254L, -251L, -249L);
        
        assertEquals(-249L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.NumberUtils.maximum
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maximum(int, int, int)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#maximum(int,int,int)}
 * @utbot.executesCondition {@code (b > a): False}
 * @utbot.executesCondition {@code (c > a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMaximum_BLessOrEqualA() {
        int actual = NumberUtils.maximum(-255, -255, -255);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#maximum(int,int,int)}
 * @utbot.executesCondition {@code (b > a): True}
 * @utbot.executesCondition {@code (c > a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMaximum_CLessOrEqualA1() {
        int actual = NumberUtils.maximum(-3, -2, -2);
        
        assertEquals(-2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#maximum(int,int,int)}
 * @utbot.executesCondition {@code (b > a): True}
 * @utbot.executesCondition {@code (c > a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMaximum_CGreaterThanA1() {
        int actual = NumberUtils.maximum(-4, -3, -2);
        
        assertEquals(-2, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.NumberUtils.minimum
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method minimum(int, int, int)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#minimum(int,int,int)}
 * @utbot.executesCondition {@code (b < a): True}
 * @utbot.executesCondition {@code (c < a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMinimum_CGreaterOrEqualA() {
        int actual = NumberUtils.minimum(256, 255, 255);
        
        assertEquals(255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#minimum(int,int,int)}
 * @utbot.executesCondition {@code (b < a): False}
 * @utbot.executesCondition {@code (c < a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMinimum_BGreaterOrEqualA() {
        int actual = NumberUtils.minimum(-255, -255, -255);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#minimum(int,int,int)}
 * @utbot.executesCondition {@code (b < a): True}
 * @utbot.executesCondition {@code (c < a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMinimum_CLessThanA() {
        int actual = NumberUtils.minimum(5, 4, 3);
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.NumberUtils.minimum
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method minimum(long, long, long)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#minimum(long,long,long)}
 * @utbot.executesCondition {@code (b < a): True}
 * @utbot.executesCondition {@code (c < a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMinimum_CLessThanA1() {
        long actual = NumberUtils.minimum(130L, 10L, -245L);
        
        assertEquals(-245L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#minimum(long,long,long)}
 * @utbot.executesCondition {@code (b < a): False}
 * @utbot.executesCondition {@code (c < a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMinimum_CGreaterOrEqualA1() {
        long actual = NumberUtils.minimum(-110L, -110L, -110L);
        
        assertEquals(-110L, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method minimum(long, long, long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#minimum(long,long,long)}
     */
    @Test
    public void testMinimumReturnsZeroWithCornerCases() {
        long actual = NumberUtils.minimum(8192L, 0L, 0L);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.NumberUtils.isDigits
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDigits(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isDigits(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.length() == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < str.length(); i++)} once
 *  */
    @Test
    public void testIsDigits_NotCharacterIsDigit() {
        String string = "/";
        
        boolean actual = NumberUtils.isDigits(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isDigits(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testIsDigits_StrEqualsNull() {
        boolean actual = NumberUtils.isDigits(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isDigits(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.length() == 0): True}
 *  */
    @Test
    public void testIsDigits_StrLengthEqualsZero() {
        String string = "";
        
        boolean actual = NumberUtils.isDigits(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#isDigits(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.length() == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < str.length(); i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsDigits_CharacterIsDigit() {
        String string = "2";
        
        boolean actual = NumberUtils.isDigits(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.NumberUtils.createBigDecimal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createBigDecimal(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createBigDecimal(java.lang.String)}
 * @utbot.returnsFrom {@code return bd;}
 *  */
    @Test
    public void testCreateBigDecimal_ReturnBd() {
        String string = "0";
        
        BigDecimal actual = NumberUtils.createBigDecimal(string);
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createBigDecimal(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createBigDecimal(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: BigDecimal bd = new BigDecimal(val);
 *  */
    @Test
    public void testCreateBigDecimal_ThrowNumberFormatException() {
        String string = "+";
        
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createBigDecimal] produces [java.lang.NumberFormatException: No digits found.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:592)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            org.apache.commons.lang.NumberUtils.createBigDecimal(NumberUtils.java:376) */
        NumberUtils.createBigDecimal(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createBigDecimal(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} 
 *  */
    @Test
    public void testCreateBigDecimal_ThrowNumberFormatException_1() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createBigDecimal] produces [java.lang.NumberFormatException]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:692)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            org.apache.commons.lang.NumberUtils.createBigDecimal(NumberUtils.java:376) */
        NumberUtils.createBigDecimal(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createBigDecimal(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: BigDecimal bd = new BigDecimal(val);
 *  */
    @Test
    public void testCreateBigDecimal_ThrowNumberFormatException_2() {
        String string = ":                  ";
        
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createBigDecimal] produces [java.lang.NumberFormatException: Character array is missing "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:645)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            org.apache.commons.lang.NumberUtils.createBigDecimal(NumberUtils.java:376) */
        NumberUtils.createBigDecimal(string);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method createBigDecimal(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createBigDecimal(java.lang.String)}
     */
    @Test
    public void testCreateBigDecimalThrowsNFEWithNonEmptyString() {
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createBigDecimal] produces [java.lang.NumberFormatException: Character  is neither a decimal digit number, decimal point, nor "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:586)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            org.apache.commons.lang.NumberUtils.createBigDecimal(NumberUtils.java:376) */
        NumberUtils.createBigDecimal("\u0014\n\t\r");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.NumberUtils.compare
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compare(float, float)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#compare(float,float)}
 * @utbot.executesCondition {@code (lhs < rhs): True}
 *  */
    @Test
    public void testCompare_LhsLessThanRhs() {
        int actual = NumberUtils.compare(-2.0025344f, 1.1768266E-38f);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#compare(float,float)}
 * @utbot.executesCondition {@code (lhs < rhs): False}
 * @utbot.executesCondition {@code (lhs > rhs): True}
 *  */
    @Test
    public void testCompare_LhsGreaterThanRhs() {
        int actual = NumberUtils.compare(1.1024663E-19f, -1.1024663E-19f);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#compare(float,float)}
 * @utbot.executesCondition {@code (lhs < rhs): False}
 * @utbot.executesCondition {@code (lhs > rhs): False}
 * @utbot.executesCondition {@code (lhsBits == rhsBits): False}
 * @utbot.executesCondition {@code (lhsBits < rhsBits): False}
 * @utbot.invokes {@link java.lang.Float#floatToIntBits(float)}
 * @utbot.invokes {@link java.lang.Float#floatToIntBits(float)}
 *  */
    @Test
    public void testCompare_LhsBitsGreaterOrEqualRhsBits() {
        int actual = NumberUtils.compare(java.lang.Float.NEGATIVE_INFINITY, java.lang.Float.NaN);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.NumberUtils.compare
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compare(double, double)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#compare(double,double)}
 * @utbot.executesCondition {@code (lhs < rhs): True}
 *  */
    @Test
    public void testCompare_LhsLessThanRhs1() {
        int actual = NumberUtils.compare(-5.263672889675945, 7.77185010349554E-304);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#compare(double,double)}
 * @utbot.executesCondition {@code (lhs < rhs): False}
 * @utbot.executesCondition {@code (lhs > rhs): True}
 *  */
    @Test
    public void testCompare_LhsGreaterThanRhs1() {
        int actual = NumberUtils.compare(5.1889428326E-314, -5.1889428326E-314);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#compare(double,double)}
 * @utbot.executesCondition {@code (lhs < rhs): False}
 * @utbot.executesCondition {@code (lhs > rhs): False}
 * @utbot.executesCondition {@code (lhsBits == rhsBits): False}
 * @utbot.executesCondition {@code (lhsBits < rhsBits): False}
 * @utbot.invokes {@link java.lang.Double#doubleToLongBits(double)}
 * @utbot.invokes {@link java.lang.Double#doubleToLongBits(double)}
 *  */
    @Test
    public void testCompare_LhsBitsGreaterOrEqualRhsBits1() {
        int actual = NumberUtils.compare(-3.337364828689445E240, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.NumberUtils.createLong
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createLong(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createLong(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Long.valueOf(val);
 *  */
    @Test
    public void testCreateLong_ThrowNumberFormatException() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createLong] produces [java.lang.NumberFormatException: For input string: ""]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Long.parseLong(Long.java:721)
            java.base/java.lang.Long.valueOf(Long.java:1163)
            org.apache.commons.lang.NumberUtils.createLong(NumberUtils.java:353) */
        NumberUtils.createLong(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.NumberUtils#createLong(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Long.valueOf(val);
 *  */
    @Test
    public void testCreateLong_ThrowNumberFormatException_1() {
        /* This test fails because method [org.apache.commons.lang.NumberUtils.createLong] produces [java.lang.NumberFormatException: Cannot parse null string]
            java.base/java.lang.Long.parseLong(Long.java:674)
            java.base/java.lang.Long.valueOf(Long.java:1163)
            org.apache.commons.lang.NumberUtils.createLong(NumberUtils.java:353) */
        NumberUtils.createLong(null);
    }
    ///endregion
    
    ///endregion
}

