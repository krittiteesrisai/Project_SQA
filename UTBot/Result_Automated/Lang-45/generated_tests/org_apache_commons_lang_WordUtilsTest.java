package org.apache.commons.lang;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_lang_WordUtilsTest {
    ///region Test suites for executable org.apache.commons.lang.WordUtils.wrap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method wrap(java.lang.String, int, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#wrap(java.lang.String,int,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testWrap_StrEqualsNull() {
        String actual = WordUtils.wrap(null, -255, null, false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method wrap(java.lang.String, int, java.lang.String, boolean)
    
    @Test
    public void testWrap1() {
        String string = "\u0000\u0000";
        String string1 = "";
        
        String actual = WordUtils.wrap(string, 0, string1, false);
        
        String expected = "\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWrap2() {
        String string = "";
        
        String actual = WordUtils.wrap(string, 0, null, false);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWrap3() {
        String string = "";
        String string1 = "";
        
        String actual = WordUtils.wrap(string, 0, string1, false);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWrap4() {
        String string = "";
        String string1 = "";
        
        String actual = WordUtils.wrap(string, 1073741824, string1, false);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWrap5() {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        String string1 = "";
        
        String actual = WordUtils.wrap(string, 8, string1, false);
        
        String expected = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.WordUtils.wrap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method wrap(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#wrap(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.lang.WordUtils#wrap(java.lang.String,int,java.lang.String,boolean)}
 * @utbot.returnsFrom {@code return wrap(str, wrapLength, null, false);}
 *  */
    @Test
    public void testWrap_WordUtilsWrap() {
        String actual = WordUtils.wrap(null, -255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method wrap(java.lang.String, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.WordUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#wrap(java.lang.String,int)}
     */
    @Test
    public void testWrapWithBlankStringAndCornerCase() {
        String actual = WordUtils.wrap("\n\t\r", Integer.MIN_VALUE);
        
        String expected = "\n\t\r";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method wrap(java.lang.String, int)
    
    @Test
    public void testWrap6() {
        String string = "";
        
        String actual = WordUtils.wrap(string, 0);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.WordUtils.capitalize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method capitalize(java.lang.String, [C)
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#capitalize(java.lang.String,char[])}
 * @utbot.executesCondition {@code (delimiters == null): False}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.length() == 0): False}
 * @utbot.executesCondition {@code (delimLen == 0): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.StringBuffer#toString()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < strLen; i++)} once
 * @utbot.returnsFrom {@code return buffer.toString();}
 *  */
    @Test
    public void testCapitalize_IsDelimiter() {
        String string = " ";
        char[] charArray = {' '};
        
        String actual = WordUtils.capitalize(string, charArray);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method capitalize(java.lang.String, [C)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return str;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#capitalize(java.lang.String,char[])}
 * @utbot.executesCondition {@code (delimiters == null): False}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testCapitalize_StrEqualsNull_1() {
        char[] charArray = {' '};
        
        String actual = WordUtils.capitalize(null, charArray);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#capitalize(java.lang.String,char[])}
 * @utbot.executesCondition {@code (delimiters == null): False}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.length() == 0): False}
 * @utbot.executesCondition {@code (delimLen == 0): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testCapitalize_DelimLenEqualsZero() {
        String string = "\u0000";
        char[] charArray = {};
        
        String actual = WordUtils.capitalize(string, charArray);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#capitalize(java.lang.String,char[])}
 * @utbot.executesCondition {@code (delimiters == null): True}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testCapitalize_StrEqualsNull() {
        String actual = WordUtils.capitalize(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#capitalize(java.lang.String,char[])}
 * @utbot.executesCondition {@code (delimiters == null): True}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.length() == 0): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testCapitalize_StrLengthEqualsZero() {
        String string = "";
        
        String actual = WordUtils.capitalize(string, null);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method capitalize(java.lang.String, [C)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.WordUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#capitalize(java.lang.String,char[])}
     */
    @Test
    public void testCapitalizeWithBlankStringAndNonEmptyPrimitiveArray() {
        char[] charArray = {'\u0000', '?', ''};
        
        String actual = WordUtils.capitalize("\n\t\r", charArray);
        
        String expected = "\n\t\r";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method capitalize(java.lang.String, [C)
    
    @Test
    public void testCapitalize1() {
        String string = "  \u8000";
        
        String actual = WordUtils.capitalize(string, null);
        
        String expected = "  \u8000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.WordUtils.capitalize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method capitalize(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#capitalize(java.lang.String)}
 * @utbot.returnsFrom {@code return capitalize(str, null);}
 *  */
    @Test
    public void testCapitalize_ReturnCapitalize() {
        String actual = WordUtils.capitalize(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#capitalize(java.lang.String)}
 * @utbot.returnsFrom {@code return capitalize(str, null);}
 *  */
    @Test
    public void testCapitalize_ReturnCapitalize_1() {
        String string = "";
        
        String actual = WordUtils.capitalize(string);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method capitalize(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.WordUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#capitalize(java.lang.String)}
     */
    @Test
    public void testCapitalizeWithNonEmptyString() {
        String actual = WordUtils.capitalize("\u0014\n\t\r");
        
        String expected = "\u0014\n\t\r";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method capitalize(java.lang.String)
    
    @Test
    public void testCapitalize2() {
        String string = " \n\u8000";
        
        String actual = WordUtils.capitalize(string);
        
        String expected = " \n\u8000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.WordUtils.isDelimiter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDelimiter(char, [C)
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#isDelimiter(char,char[])}
 * @utbot.executesCondition {@code (delimiters == null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsDelimiter_DelimitersNotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        char[] charArray = {};
        
        Class wordUtilsClazz = Class.forName("org.apache.commons.lang.WordUtils");
        Class charType = char.class;
        Class charArrayType = Class.forName("[C");
        Method isDelimiterMethod = wordUtilsClazz.getDeclaredMethod("isDelimiter", charType, charArrayType);
        isDelimiterMethod.setAccessible(true);
        java.lang.Object[] isDelimiterMethodArguments = new java.lang.Object[2];
        isDelimiterMethodArguments[0] = ' ';
        isDelimiterMethodArguments[1] = ((Object) charArray);
        boolean actual = ((Boolean) isDelimiterMethod.invoke(null, isDelimiterMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#isDelimiter(char,char[])}
 * @utbot.executesCondition {@code (delimiters == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0, isize = delimiters.length; i < isize; i++)} once
 *  */
    @Test
    public void testIsDelimiter_ChEqualsIOfDelimiters() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        char[] charArray = {' '};
        
        Class wordUtilsClazz = Class.forName("org.apache.commons.lang.WordUtils");
        Class charType = char.class;
        Class charArrayType = Class.forName("[C");
        Method isDelimiterMethod = wordUtilsClazz.getDeclaredMethod("isDelimiter", charType, charArrayType);
        isDelimiterMethod.setAccessible(true);
        java.lang.Object[] isDelimiterMethodArguments = new java.lang.Object[2];
        isDelimiterMethodArguments[0] = ' ';
        isDelimiterMethodArguments[1] = ((Object) charArray);
        boolean actual = ((Boolean) isDelimiterMethod.invoke(null, isDelimiterMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#isDelimiter(char,char[])}
 * @utbot.executesCondition {@code (delimiters == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0, isize = delimiters.length; i < isize; i++)} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsDelimiter_ChNotEqualsIOfDelimiters() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        char[] charArray = {'@'};
        
        Class wordUtilsClazz = Class.forName("org.apache.commons.lang.WordUtils");
        Class charType = char.class;
        Class charArrayType = Class.forName("[C");
        Method isDelimiterMethod = wordUtilsClazz.getDeclaredMethod("isDelimiter", charType, charArrayType);
        isDelimiterMethod.setAccessible(true);
        java.lang.Object[] isDelimiterMethodArguments = new java.lang.Object[2];
        isDelimiterMethodArguments[0] = 'A';
        isDelimiterMethodArguments[1] = ((Object) charArray);
        boolean actual = ((Boolean) isDelimiterMethod.invoke(null, isDelimiterMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#isDelimiter(char,char[])}
 * @utbot.executesCondition {@code (delimiters == null): True}
 * @utbot.invokes {@link java.lang.Character#isWhitespace(char)}
 * @utbot.returnsFrom {@code return Character.isWhitespace(ch);}
 *  */
    @Test
    public void testIsDelimiter_DelimitersEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class wordUtilsClazz = Class.forName("org.apache.commons.lang.WordUtils");
        Class charType = char.class;
        Class charArrayType = Class.forName("[C");
        Method isDelimiterMethod = wordUtilsClazz.getDeclaredMethod("isDelimiter", charType, charArrayType);
        isDelimiterMethod.setAccessible(true);
        java.lang.Object[] isDelimiterMethodArguments = new java.lang.Object[2];
        isDelimiterMethodArguments[0] = '\r';
        isDelimiterMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) isDelimiterMethod.invoke(null, isDelimiterMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isDelimiter(char, [C)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.WordUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#isDelimiter(char,char[])}
     */
    @Test
    public void testIsDelimiterReturnsFalseWithCornerCaseAndNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        char[] charArray = {'@', '', '?'};
        
        Class wordUtilsClazz = Class.forName("org.apache.commons.lang.WordUtils");
        Class charType = char.class;
        Class charArrayType = Class.forName("[C");
        Method isDelimiterMethod = wordUtilsClazz.getDeclaredMethod("isDelimiter", charType, charArrayType);
        isDelimiterMethod.setAccessible(true);
        java.lang.Object[] isDelimiterMethodArguments = new java.lang.Object[2];
        isDelimiterMethodArguments[0] = '\u0000';
        isDelimiterMethodArguments[1] = ((Object) charArray);
        boolean actual = ((Boolean) isDelimiterMethod.invoke(null, isDelimiterMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.WordUtils.abbreviate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method abbreviate(java.lang.String, int, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#abbreviate(java.lang.String,int,int,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testAbbreviate_StrEqualsNull() {
        String actual = WordUtils.abbreviate(null, -255, -255, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#abbreviate(java.lang.String,int,int,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return StringUtils.EMPTY;}
 *  */
    @Test
    public void testAbbreviate_StrNotEqualsNull() {
        String string = "";
        
        String actual = WordUtils.abbreviate(string, -255, -255, null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method abbreviate(java.lang.String, int, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#abbreviate(java.lang.String,int,int,java.lang.String)}
 * @utbot.executesCondition {@code (upper == -1): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: result.append(str.substring(0, upper));
 *  */
    @Test
    public void testAbbreviate_ThrowStringIndexOutOfBoundsException() {
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.WordUtils.abbreviate] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end 2, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.lang.WordUtils.abbreviate(WordUtils.java:629) */
        WordUtils.abbreviate(string, 2, -1, null);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#abbreviate(java.lang.String,int,int,java.lang.String)}
 * @utbot.executesCondition {@code (upper == -1): False}
 * @utbot.executesCondition {@code (upper < lower): False}
 * @utbot.executesCondition {@code (index > upper): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: result.append(str.substring(0, upper));
 *  */
    @Test
    public void testAbbreviate_ThrowStringIndexOutOfBoundsException_1() {
        String string = "!  ";
        
        /* This test fails because method [org.apache.commons.lang.WordUtils.abbreviate] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -256, length 3]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.lang.WordUtils.abbreviate(WordUtils.java:635) */
        WordUtils.abbreviate(string, -256, -256, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method abbreviate(java.lang.String, int, int, java.lang.String)
    
    @Test
    public void testAbbreviate1() {
        String string = "!!!";
        
        String actual = WordUtils.abbreviate(string, -250, -1, string);
        
        String expected = "!!!";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAbbreviate2() {
        String string = "!! ";
        
        String actual = WordUtils.abbreviate(string, -250, -1, string);
        
        String expected = "!!!! ";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAbbreviate3() {
        String string = "!! ";
        
        String actual = WordUtils.abbreviate(string, -255, 0, string);
        
        String expected = "!! ";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAbbreviate4() {
        String string = "\u0000\u0000\u0000";
        
        String actual = WordUtils.abbreviate(string, -2147483647, 0, string);
        
        String expected = "\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAbbreviate5() {
        String string = "        !!";
        
        String actual = WordUtils.abbreviate(string, 8, 10, string);
        
        String expected = "        !!";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAbbreviate6() {
        String string = " ";
        
        String actual = WordUtils.abbreviate(string, 0, -255, string);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAbbreviate7() {
        String string = "                               !";
        
        String actual = WordUtils.abbreviate(string, 31, 33, string);
        
        String expected = "                               !";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAbbreviate8() {
        String string = "!!!     ";
        
        String actual = WordUtils.abbreviate(string, -247, 9, string);
        
        String expected = "!!!!!!     ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method abbreviate(java.lang.String, int, int, java.lang.String)
    
    @Test
    public void testAbbreviate9() {
        String string = "!!";
        
        /* This test fails because method [org.apache.commons.lang.WordUtils.abbreviate] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -125, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.lang.WordUtils.abbreviate(WordUtils.java:629) */
        WordUtils.abbreviate(string, -250, -125, string);
    }
    
    @Test
    public void testAbbreviate10() {
        String string = "!!";
        
        /* This test fails because method [org.apache.commons.lang.WordUtils.abbreviate] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -1, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.lang.WordUtils.abbreviate(WordUtils.java:629) */
        WordUtils.abbreviate(string, -1, -2, string);
    }
    
    @Test
    public void testAbbreviate11() {
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.WordUtils.abbreviate] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end 256, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.lang.WordUtils.abbreviate(WordUtils.java:629) */
        WordUtils.abbreviate(string, 256, 2, string);
    }
    
    @Test
    public void testAbbreviate12() {
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang.WordUtils.abbreviate] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.lang.WordUtils.abbreviate(WordUtils.java:635) */
        WordUtils.abbreviate(string, -1, -2, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.WordUtils.swapCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method swapCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#swapCase(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < strLen; i++)} once
 *  */
    @Test
    public void testSwapCase_StrNotEqualsNull() {
        String string = "\u8000";
        
        String actual = WordUtils.swapCase(string);
        
        String expected = "\u8000";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#swapCase(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testSwapCase_StrEqualsNull() {
        String actual = WordUtils.swapCase(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#swapCase(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testSwapCase_StrNotEqualsNull_1() {
        String string = "";
        
        String actual = WordUtils.swapCase(string);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#swapCase(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < strLen; i++)} once
 *  */
    @Test
    public void testSwapCase_StrNotEqualsNull_2() {
        String string = "\u0410";
        
        String actual = WordUtils.swapCase(string);
        
        String expected = "\u0430";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.WordUtils.initials
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method initials(java.lang.String, [C)
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#initials(java.lang.String,char[])}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.length() == 0): False}
 * @utbot.executesCondition {@code (delimiters != null): True}
 * @utbot.executesCondition {@code (delimiters.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < strLen; i++)} once
 * @utbot.returnsFrom {@code return new String(buf, 0, count);}
 *  */
    @Test
    public void testInitials_DelimitersLengthNotEqualsZero() {
        String string = " ";
        char[] charArray = {'!', ' '};
        
        String actual = WordUtils.initials(string, charArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#initials(java.lang.String,char[])}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.length() == 0): False}
 * @utbot.executesCondition {@code (delimiters != null): True}
 * @utbot.executesCondition {@code (delimiters.length == 0): True}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testInitials_DelimitersLengthEqualsZero() {
        String string = " ";
        char[] charArray = {};
        
        String actual = WordUtils.initials(string, charArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#initials(java.lang.String,char[])}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testInitials_StrEqualsNull() {
        String actual = WordUtils.initials(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#initials(java.lang.String,char[])}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.length() == 0): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testInitials_StrLengthEqualsZero() {
        String string = "";
        
        String actual = WordUtils.initials(string, null);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#initials(java.lang.String,char[])}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.length() == 0): False}
 * @utbot.executesCondition {@code (delimiters != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < strLen; i++)} once
 * @utbot.returnsFrom {@code return new String(buf, 0, count);}
 *  */
    @Test
    public void testInitials_IsDelimiter() {
        String string = "\n";
        
        String actual = WordUtils.initials(string, null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#initials(java.lang.String,char[])}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.length() == 0): False}
 * @utbot.executesCondition {@code (delimiters != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < strLen; i++)} twice
 * @utbot.returnsFrom {@code return new String(buf, 0, count);}
 *  */
    @Test
    public void testInitials_NotLastWasGap() {
        String string = "!!";
        
        String actual = WordUtils.initials(string, null);
        
        String expected = "!";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method initials(java.lang.String, [C)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.WordUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#initials(java.lang.String,char[])}
     */
    @Test
    public void testInitialsWithBlankStringAndNonEmptyPrimitiveArray() {
        char[] charArray = {'', '', '\u0001'};
        
        String actual = WordUtils.initials("\n\t\r", charArray);
        
        String expected = "\n";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.WordUtils.initials
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method initials(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#initials(java.lang.String)}
 * @utbot.returnsFrom {@code return initials(str, null);}
 *  */
    @Test
    public void testInitials_ReturnInitials() {
        String string = "!!";
        
        String actual = WordUtils.initials(string);
        
        String expected = "!";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#initials(java.lang.String)}
 * @utbot.returnsFrom {@code return initials(str, null);}
 *  */
    @Test
    public void testInitials_ReturnInitials_1() {
        String actual = WordUtils.initials(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#initials(java.lang.String)}
 * @utbot.returnsFrom {@code return initials(str, null);}
 *  */
    @Test
    public void testInitials_ReturnInitials_2() {
        String string = "";
        
        String actual = WordUtils.initials(string);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#initials(java.lang.String)}
 * @utbot.returnsFrom {@code return initials(str, null);}
 *  */
    @Test
    public void testInitials_ReturnInitials_3() {
        String string = " ";
        
        String actual = WordUtils.initials(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method initials(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.WordUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#initials(java.lang.String)}
     */
    @Test
    public void testInitialsWithNonEmptyString() {
        String actual = WordUtils.initials("\u0014\n\t\r");
        
        String expected = "\u0014";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.WordUtils.capitalizeFully
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method capitalizeFully(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#capitalizeFully(java.lang.String)}
 * @utbot.returnsFrom {@code return capitalizeFully(str, null);}
 *  */
    @Test
    public void testCapitalizeFully_ReturnCapitalizeFully() {
        String actual = WordUtils.capitalizeFully(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#capitalizeFully(java.lang.String)}
 * @utbot.returnsFrom {@code return capitalizeFully(str, null);}
 *  */
    @Test
    public void testCapitalizeFully_ReturnCapitalizeFully_1() {
        String string = "";
        
        String actual = WordUtils.capitalizeFully(string);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method capitalizeFully(java.lang.String)
    
    @Test
    public void testCapitalizeFully1() {
        String string = "[KK ";
        
        String actual = WordUtils.capitalizeFully(string);
        
        String expected = "[kk ";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCapitalizeFully2() {
        String string = "\nK";
        
        String actual = WordUtils.capitalizeFully(string);
        
        String expected = "\nK";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.WordUtils.capitalizeFully
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method capitalizeFully(java.lang.String, [C)
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#capitalizeFully(java.lang.String,char[])}
 * @utbot.executesCondition {@code (delimiters == null): False}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testCapitalizeFully_StrEqualsNull_1() {
        char[] charArray = {' '};
        
        String actual = WordUtils.capitalizeFully(null, charArray);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#capitalizeFully(java.lang.String,char[])}
 * @utbot.executesCondition {@code (delimiters == null): False}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.length() == 0): False}
 * @utbot.executesCondition {@code (delimLen == 0): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testCapitalizeFully_DelimLenEqualsZero() {
        String string = "\u0000";
        char[] charArray = {};
        
        String actual = WordUtils.capitalizeFully(string, charArray);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#capitalizeFully(java.lang.String,char[])}
 * @utbot.executesCondition {@code (delimiters == null): True}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testCapitalizeFully_StrEqualsNull() {
        String actual = WordUtils.capitalizeFully(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#capitalizeFully(java.lang.String,char[])}
 * @utbot.executesCondition {@code (delimiters == null): True}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.length() == 0): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testCapitalizeFully_StrLengthEqualsZero() {
        String string = "";
        
        String actual = WordUtils.capitalizeFully(string, null);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method capitalizeFully(java.lang.String, [C)
    
    @Test
    public void testCapitalizeFully3() {
        String string = "[[\u0000\u0000\u0000\u0000\u0000";
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        String actual = WordUtils.capitalizeFully(string, charArray);
        
        String expected = "[[\u0000\u0000\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCapitalizeFully4() {
        String string = "[@@ ";
        
        String actual = WordUtils.capitalizeFully(string, null);
        
        String expected = "[@@ ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.WordUtils.uncapitalize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method uncapitalize(java.lang.String, [C)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (str == null): False}
    /// invoke:
    ///     {@link java.lang.String#length()} once
    /// execute conditions:
    ///     {@code (str.length() == 0): False},
    ///     {@code (delimLen == 0): False}
    /// return from: {@code return buffer.toString();}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#uncapitalize(java.lang.String,char[])}
 * @utbot.executesCondition {@code (delimiters == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < strLen; i++)} once
 * @utbot.returnsFrom {@code return buffer.toString();}
 *  */
    @Test
    public void testUncapitalize_DelimitersNotEqualsNull() {
        String string = " ";
        char[] charArray = {'_', ' '};
        
        String actual = WordUtils.uncapitalize(string, charArray);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#uncapitalize(java.lang.String,char[])}
 * @utbot.executesCondition {@code (delimiters == null): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < strLen; i++)} once
 * @utbot.returnsFrom {@code return buffer.toString();}
 *  */
    @Test
    public void testUncapitalize_IsDelimiter() {
        String string = "\n";
        
        String actual = WordUtils.uncapitalize(string, null);
        
        String expected = "\n";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#uncapitalize(java.lang.String,char[])}
 * @utbot.executesCondition {@code (delimiters == null): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < strLen; i++)} twice
 * @utbot.returnsFrom {@code return buffer.toString();}
 *  */
    @Test
    public void testUncapitalize_NotUncapitalizeNext() {
        String string = "@!";
        
        String actual = WordUtils.uncapitalize(string, null);
        
        String expected = "@!";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method uncapitalize(java.lang.String, [C)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return str;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#uncapitalize(java.lang.String,char[])}
 * @utbot.executesCondition {@code (delimiters == null): False}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testUncapitalize_StrEqualsNull_1() {
        char[] charArray = {' '};
        
        String actual = WordUtils.uncapitalize(null, charArray);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#uncapitalize(java.lang.String,char[])}
 * @utbot.executesCondition {@code (delimiters == null): False}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.length() == 0): False}
 * @utbot.executesCondition {@code (delimLen == 0): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testUncapitalize_DelimLenEqualsZero() {
        String string = "\u0000";
        char[] charArray = {};
        
        String actual = WordUtils.uncapitalize(string, charArray);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#uncapitalize(java.lang.String,char[])}
 * @utbot.executesCondition {@code (delimiters == null): True}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testUncapitalize_StrEqualsNull() {
        String actual = WordUtils.uncapitalize(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#uncapitalize(java.lang.String,char[])}
 * @utbot.executesCondition {@code (delimiters == null): True}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.length() == 0): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testUncapitalize_StrLengthEqualsZero() {
        String string = "";
        
        String actual = WordUtils.uncapitalize(string, null);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method uncapitalize(java.lang.String, [C)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.WordUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#uncapitalize(java.lang.String,char[])}
     */
    @Test
    public void testUncapitalizeWithBlankStringAndNonEmptyPrimitiveArray() {
        char[] charArray = {'\u0000', '?', ''};
        
        String actual = WordUtils.uncapitalize("\n\t\r", charArray);
        
        String expected = "\n\t\r";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.WordUtils.uncapitalize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method uncapitalize(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#uncapitalize(java.lang.String)}
 * @utbot.returnsFrom {@code return uncapitalize(str, null);}
 *  */
    @Test
    public void testUncapitalize_ReturnUncapitalize() {
        String string = "[!";
        
        String actual = WordUtils.uncapitalize(string);
        
        String expected = "[!";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#uncapitalize(java.lang.String)}
 * @utbot.returnsFrom {@code return uncapitalize(str, null);}
 *  */
    @Test
    public void testUncapitalize_ReturnUncapitalize_1() {
        String actual = WordUtils.uncapitalize(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#uncapitalize(java.lang.String)}
 * @utbot.returnsFrom {@code return uncapitalize(str, null);}
 *  */
    @Test
    public void testUncapitalize_ReturnUncapitalize_2() {
        String string = "";
        
        String actual = WordUtils.uncapitalize(string);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link WordUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#uncapitalize(java.lang.String)}
 * @utbot.returnsFrom {@code return uncapitalize(str, null);}
 *  */
    @Test
    public void testUncapitalize_ReturnUncapitalize_3() {
        String string = " ";
        
        String actual = WordUtils.uncapitalize(string);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method uncapitalize(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.WordUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.WordUtils#uncapitalize(java.lang.String)}
     */
    @Test
    public void testUncapitalizeWithNonEmptyString() {
        String actual = WordUtils.uncapitalize("\u0014\n\t\r");
        
        String expected = "\u0014\n\t\r";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
}

