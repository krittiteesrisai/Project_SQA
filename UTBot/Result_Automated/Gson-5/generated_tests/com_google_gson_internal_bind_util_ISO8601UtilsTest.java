package com.google.gson.internal.bind.util;

import org.junit.Test;
import java.util.Date;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.text.ParsePosition;
import java.text.ParseException;
import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_google_gson_internal_bind_util_ISO8601UtilsTest {
    ///region Test suites for executable com.google.gson.internal.bind.util.ISO8601Utils.format
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method format(java.util.Date)
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#format(java.util.Date)}
     */
    @Test
    public void testFormat() {
        Date date = new Date();
        
        String actual = ISO8601Utils.format(date);
        
        String expected = "2026-09-30T07:40:50Z";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for format
    
    public void testFormat_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.util.ISO8601Utils.format
    
    ///region FUZZER: ERROR SUITE for method format(java.util.Date, boolean, java.util.TimeZone)
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#format(java.util.Date,boolean,java.util.TimeZone)}
     */
    @Test
    public void testFormatThrowsNPE() {
        Date date = new Date();
        
        /* This test fails because method [com.google.gson.internal.bind.util.ISO8601Utils.format] produces [java.lang.NullPointerException]
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2303)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2273)
            java.base/java.util.Calendar.setTimeInMillis(Calendar.java:1827)
            java.base/java.util.GregorianCalendar.<init>(GregorianCalendar.java:628)
            com.google.gson.internal.bind.util.ISO8601Utils.format(ISO8601Utils.java:68) */
        ISO8601Utils.format(date, false, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.util.ISO8601Utils.format
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method format(java.util.Date, boolean)
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#format(java.util.Date,boolean)}
     */
    @Test
    public void testFormat1() {
        Date date = new Date();
        
        String actual = ISO8601Utils.format(date, false);
        
        String expected = "2026-09-30T07:40:50Z";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for format
    
    public void testFormat_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.util.ISO8601Utils.checkOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkOffset(java.lang.String, int, char)
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#checkOffset(java.lang.String,int,char)}
 * @utbot.returnsFrom {@code return (offset < value.length()) && (value.charAt(offset) == expected);}
 *  */
    @Test
    public void testCheckOffset_OffsetGreaterOrEqualValueLengthAndValueCharAtNotEqualsExpected() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " ";
        
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Class charType = char.class;
        Method checkOffsetMethod = iSO8601UtilsClazz.getDeclaredMethod("checkOffset", stringType, intType, charType);
        checkOffsetMethod.setAccessible(true);
        java.lang.Object[] checkOffsetMethodArguments = new java.lang.Object[3];
        checkOffsetMethodArguments[0] = string;
        checkOffsetMethodArguments[1] = 1;
        checkOffsetMethodArguments[2] = ' ';
        boolean actual = ((Boolean) checkOffsetMethod.invoke(null, checkOffsetMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#checkOffset(java.lang.String,int,char)}
 * @utbot.returnsFrom {@code return (offset < value.length()) && (value.charAt(offset) == expected);}
 *  */
    @Test
    public void testCheckOffset_OffsetGreaterOrEqualValueLengthAndValueCharAtNotEqualsExpected_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " \"";
        
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Class charType = char.class;
        Method checkOffsetMethod = iSO8601UtilsClazz.getDeclaredMethod("checkOffset", stringType, intType, charType);
        checkOffsetMethod.setAccessible(true);
        java.lang.Object[] checkOffsetMethodArguments = new java.lang.Object[3];
        checkOffsetMethodArguments[0] = string;
        checkOffsetMethodArguments[1] = 1;
        checkOffsetMethodArguments[2] = ' ';
        boolean actual = ((Boolean) checkOffsetMethod.invoke(null, checkOffsetMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#checkOffset(java.lang.String,int,char)}
 * @utbot.returnsFrom {@code return (offset < value.length()) && (value.charAt(offset) == expected);}
 *  */
    @Test
    public void testCheckOffset_OffsetLessThanValueLengthAndValueCharAtEqualsExpected() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "  ";
        
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Class charType = char.class;
        Method checkOffsetMethod = iSO8601UtilsClazz.getDeclaredMethod("checkOffset", stringType, intType, charType);
        checkOffsetMethod.setAccessible(true);
        java.lang.Object[] checkOffsetMethodArguments = new java.lang.Object[3];
        checkOffsetMethodArguments[0] = string;
        checkOffsetMethodArguments[1] = 1;
        checkOffsetMethodArguments[2] = ' ';
        boolean actual = ((Boolean) checkOffsetMethod.invoke(null, checkOffsetMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkOffset(java.lang.String, int, char)
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#checkOffset(java.lang.String,int,char)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return (offset < value.length()) && (value.charAt(offset) == expected);
 *  */
    @Test
    public void testCheckOffset_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        String string = "";
        
        /* This test fails because method [com.google.gson.internal.bind.util.ISO8601Utils.checkOffset] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.google.gson.internal.bind.util.ISO8601Utils.checkOffset(ISO8601Utils.java:288) */
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Class charType = char.class;
        Method checkOffsetMethod = iSO8601UtilsClazz.getDeclaredMethod("checkOffset", stringType, intType, charType);
        checkOffsetMethod.setAccessible(true);
        java.lang.Object[] checkOffsetMethodArguments = new java.lang.Object[3];
        checkOffsetMethodArguments[0] = string;
        checkOffsetMethodArguments[1] = -1;
        checkOffsetMethodArguments[2] = ' ';
        try {
            checkOffsetMethod.invoke(null, checkOffsetMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#checkOffset(java.lang.String,int,char)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (offset < value.length()) && (value.charAt(offset) == expected);
 *  */
    @Test
    public void testCheckOffset_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.gson.internal.bind.util.ISO8601Utils.checkOffset] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.util.ISO8601Utils.checkOffset(ISO8601Utils.java:288) */
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Class charType = char.class;
        Method checkOffsetMethod = iSO8601UtilsClazz.getDeclaredMethod("checkOffset", stringType, intType, charType);
        checkOffsetMethod.setAccessible(true);
        java.lang.Object[] checkOffsetMethodArguments = new java.lang.Object[3];
        checkOffsetMethodArguments[0] = ((Object) null);
        checkOffsetMethodArguments[1] = -255;
        checkOffsetMethodArguments[2] = ' ';
        try {
            checkOffsetMethod.invoke(null, checkOffsetMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method checkOffset(java.lang.String, int, char)
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#checkOffset(java.lang.String,int,char)}
     */
    @Test
    public void testCheckOffsetReturnsFalseWithBlankStringAndCornerCase() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Class charType = char.class;
        Method checkOffsetMethod = iSO8601UtilsClazz.getDeclaredMethod("checkOffset", stringType, intType, charType);
        checkOffsetMethod.setAccessible(true);
        java.lang.Object[] checkOffsetMethodArguments = new java.lang.Object[3];
        checkOffsetMethodArguments[0] = "\n\t\r";
        checkOffsetMethodArguments[1] = 3;
        checkOffsetMethodArguments[2] = '\u0000';
        boolean actual = ((Boolean) checkOffsetMethod.invoke(null, checkOffsetMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.util.ISO8601Utils.parseInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseInt(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#parseInt(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (beginIndex < 0): False}
 * @utbot.executesCondition {@code (endIndex > value.length()): False}
 * @utbot.executesCondition {@code (beginIndex > endIndex): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return -result;}
 *  */
    @Test
    public void testParseInt_IGreaterOrEqualEndIndex() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method parseIntMethod = iSO8601UtilsClazz.getDeclaredMethod("parseInt", stringType, intType, intType);
        parseIntMethod.setAccessible(true);
        java.lang.Object[] parseIntMethodArguments = new java.lang.Object[3];
        parseIntMethodArguments[0] = string;
        parseIntMethodArguments[1] = 0;
        parseIntMethodArguments[2] = 0;
        int actual = ((Integer) parseIntMethod.invoke(null, parseIntMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseInt(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#parseInt(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (beginIndex < 0): True}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: beginIndex < 0 || endIndex > value.length() || beginIndex > endIndex
 *  */
    @Test
    public void testParseInt_ThrowNumberFormatException() throws Throwable  {
        /* This test fails because method [com.google.gson.internal.bind.util.ISO8601Utils.parseInt] produces [java.lang.NumberFormatException]
            com.google.gson.internal.bind.util.ISO8601Utils.parseInt(ISO8601Utils.java:302) */
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method parseIntMethod = iSO8601UtilsClazz.getDeclaredMethod("parseInt", stringType, intType, intType);
        parseIntMethod.setAccessible(true);
        java.lang.Object[] parseIntMethodArguments = new java.lang.Object[3];
        parseIntMethodArguments[0] = ((Object) null);
        parseIntMethodArguments[1] = -1;
        parseIntMethodArguments[2] = -255;
        try {
            parseIntMethod.invoke(null, parseIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#parseInt(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (beginIndex < 0): False}
 * @utbot.executesCondition {@code (endIndex > value.length()): False}
 * @utbot.executesCondition {@code (beginIndex > endIndex): True}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: beginIndex < 0 || endIndex > value.length() || beginIndex > endIndex
 *  */
    @Test
    public void testParseInt_ThrowNumberFormatException_1() throws Throwable  {
        String string = "";
        
        /* This test fails because method [com.google.gson.internal.bind.util.ISO8601Utils.parseInt] produces [java.lang.NumberFormatException: ]
            com.google.gson.internal.bind.util.ISO8601Utils.parseInt(ISO8601Utils.java:302) */
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method parseIntMethod = iSO8601UtilsClazz.getDeclaredMethod("parseInt", stringType, intType, intType);
        parseIntMethod.setAccessible(true);
        java.lang.Object[] parseIntMethodArguments = new java.lang.Object[3];
        parseIntMethodArguments[0] = string;
        parseIntMethodArguments[1] = 3;
        parseIntMethodArguments[2] = -254;
        try {
            parseIntMethod.invoke(null, parseIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#parseInt(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (beginIndex < 0): False}
 * @utbot.executesCondition {@code (endIndex > value.length()): True}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: beginIndex < 0 || endIndex > value.length() || beginIndex > endIndex
 *  */
    @Test
    public void testParseInt_ThrowNumberFormatException_2() throws Throwable  {
        String string = "  ";
        
        /* This test fails because method [com.google.gson.internal.bind.util.ISO8601Utils.parseInt] produces [java.lang.NumberFormatException:   ]
            com.google.gson.internal.bind.util.ISO8601Utils.parseInt(ISO8601Utils.java:302) */
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method parseIntMethod = iSO8601UtilsClazz.getDeclaredMethod("parseInt", stringType, intType, intType);
        parseIntMethod.setAccessible(true);
        java.lang.Object[] parseIntMethodArguments = new java.lang.Object[3];
        parseIntMethodArguments[0] = string;
        parseIntMethodArguments[1] = 0;
        parseIntMethodArguments[2] = 3;
        try {
            parseIntMethod.invoke(null, parseIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#parseInt(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (beginIndex < 0): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: beginIndex < 0 || endIndex > value.length() || beginIndex > endIndex
 *  */
    @Test
    public void testParseInt_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.gson.internal.bind.util.ISO8601Utils.parseInt] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.util.ISO8601Utils.parseInt(ISO8601Utils.java:301) */
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method parseIntMethod = iSO8601UtilsClazz.getDeclaredMethod("parseInt", stringType, intType, intType);
        parseIntMethod.setAccessible(true);
        java.lang.Object[] parseIntMethodArguments = new java.lang.Object[3];
        parseIntMethodArguments[0] = ((Object) null);
        parseIntMethodArguments[1] = 0;
        parseIntMethodArguments[2] = -255;
        try {
            parseIntMethod.invoke(null, parseIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parseInt(java.lang.String, int, int)
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#parseInt(java.lang.String,int,int)}
     */
    @Test
    public void testParseIntThrowsNPE() throws Throwable  {
        /* This test fails because method [com.google.gson.internal.bind.util.ISO8601Utils.parseInt] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.util.ISO8601Utils.parseInt(ISO8601Utils.java:301) */
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method parseIntMethod = iSO8601UtilsClazz.getDeclaredMethod("parseInt", stringType, intType, intType);
        parseIntMethod.setAccessible(true);
        java.lang.Object[] parseIntMethodArguments = new java.lang.Object[3];
        parseIntMethodArguments[0] = ((Object) null);
        parseIntMethodArguments[1] = 16394;
        parseIntMethodArguments[2] = 1;
        try {
            parseIntMethod.invoke(null, parseIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.util.ISO8601Utils.parse
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method parse(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (msg.isEmpty()): True}
 * @utbot.caughtException {@code NumberFormatException e}
 * @utbot.throwsException {@link java.text.ParseException} in: ex.initCause(fail);
 *  */
    @Test(expected = ParseException.class)
    public void testParse_ThrowParseException() throws Exception  {
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-1);
        
        ISO8601Utils.parse(null, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (msg.isEmpty()): True}
 * @utbot.caughtException {@code NumberFormatException e}
 * @utbot.throwsException {@link java.text.ParseException} in: throw ex;
 *  */
    @Test(expected = ParseException.class)
    public void testParse_ThrowParseException_1() throws Exception  {
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-1);
        
        ISO8601Utils.parse(null, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (msg.isEmpty()): True}
 * @utbot.caughtException {@code NumberFormatException e}
 * @utbot.throwsException {@link java.text.ParseException} in: throw ex;
 *  */
    @Test(expected = ParseException.class)
    public void testParse_ThrowParseException_2() throws Exception  {
        String string = "\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-1);
        
        ISO8601Utils.parse(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (msg.isEmpty()): True}
 * @utbot.caughtException {@code NumberFormatException e}
 * @utbot.throwsException {@link java.text.ParseException} in: ex.initCause(fail);
 *  */
    @Test(expected = ParseException.class)
    public void testParse_ThrowParseException_3() throws Exception  {
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(2147483646);
        
        ISO8601Utils.parse(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (msg.isEmpty()): True}
 * @utbot.caughtException {@code NumberFormatException e}
 * @utbot.throwsException {@link java.text.ParseException} in: ex.initCause(fail);
 *  */
    @Test(expected = ParseException.class)
    public void testParse_ThrowParseException_4() throws Exception  {
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(254);
        
        ISO8601Utils.parse(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.caughtException {@code NumberFormatException e}
 * @utbot.throwsException {@link java.text.ParseException} in: throw ex;
 *  */
    @Test(expected = ParseException.class)
    public void testParse_ThrowParseException_5() throws Exception  {
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-1);
        
        ISO8601Utils.parse(null, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (msg.isEmpty()): True}
 * @utbot.caughtException {@code NumberFormatException e}
 * @utbot.throwsException {@link java.text.ParseException} in: throw ex;
 *  */
    @Test(expected = ParseException.class)
    public void testParse_ThrowParseException_6() throws Exception  {
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-1);
        
        ISO8601Utils.parse(null, parsePosition);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#getIndex()}
 * @utbot.invokes com.google.gson.internal.bind.util.ISO8601Utils#parseInt(java.lang.String,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int year = parseInt(date, offset, offset += 4);
 *  */
    @Test
    public void testParse_ThrowNullPointerException() throws Exception  {
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [com.google.gson.internal.bind.util.ISO8601Utils.parse] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.util.ISO8601Utils.parseInt(ISO8601Utils.java:301)
            com.google.gson.internal.bind.util.ISO8601Utils.parse(ISO8601Utils.java:129) */
        ISO8601Utils.parse(null, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#getIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int offset = pos.getIndex();
 *  */
    @Test
    public void testParse_ThrowNullPointerException_1() throws ParseException  {
        /* This test fails because method [com.google.gson.internal.bind.util.ISO8601Utils.parse] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.util.ISO8601Utils.parse(ISO8601Utils.java:126) */
        ISO8601Utils.parse(null, null);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method parse(java.lang.String, java.text.ParsePosition)
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#parse(java.lang.String,java.text.ParsePosition)}
     */
    @Test(expected = ParseException.class)
    public void testParseThrowsPEWithNonEmptyString() throws ParseException  {
        ParsePosition parsePosition = new ParsePosition(13);
        parsePosition.setIndex(1);
        parsePosition.setErrorIndex(91);
        
        ISO8601Utils.parse(":] ", parsePosition);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.util.ISO8601Utils.indexOfNonDigit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOfNonDigit(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#indexOfNonDigit(java.lang.String,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < string.length(); i++)} once
 *  */
    @Test
    public void testIndexOfNonDigit_CGreaterThan9() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = ":";
        
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method indexOfNonDigitMethod = iSO8601UtilsClazz.getDeclaredMethod("indexOfNonDigit", stringType, intType);
        indexOfNonDigitMethod.setAccessible(true);
        java.lang.Object[] indexOfNonDigitMethodArguments = new java.lang.Object[2];
        indexOfNonDigitMethodArguments[0] = string;
        indexOfNonDigitMethodArguments[1] = 0;
        int actual = ((Integer) indexOfNonDigitMethod.invoke(null, indexOfNonDigitMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#indexOfNonDigit(java.lang.String,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < string.length(); i++)} once
 *  */
    @Test
    public void testIndexOfNonDigit_CLessThan0() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "/";
        
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method indexOfNonDigitMethod = iSO8601UtilsClazz.getDeclaredMethod("indexOfNonDigit", stringType, intType);
        indexOfNonDigitMethod.setAccessible(true);
        java.lang.Object[] indexOfNonDigitMethodArguments = new java.lang.Object[2];
        indexOfNonDigitMethodArguments[0] = string;
        indexOfNonDigitMethodArguments[1] = 0;
        int actual = ((Integer) indexOfNonDigitMethod.invoke(null, indexOfNonDigitMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#indexOfNonDigit(java.lang.String,int)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return string.length();}
 *  */
    @Test
    public void testIndexOfNonDigit_StringLength() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " ";
        
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method indexOfNonDigitMethod = iSO8601UtilsClazz.getDeclaredMethod("indexOfNonDigit", stringType, intType);
        indexOfNonDigitMethod.setAccessible(true);
        java.lang.Object[] indexOfNonDigitMethodArguments = new java.lang.Object[2];
        indexOfNonDigitMethodArguments[0] = string;
        indexOfNonDigitMethodArguments[1] = 1;
        int actual = ((Integer) indexOfNonDigitMethod.invoke(null, indexOfNonDigitMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#indexOfNonDigit(java.lang.String,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < string.length(); i++)} twice
 *  */
    @Test
    public void testIndexOfNonDigit_CLessOrEqual9() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "0/";
        
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method indexOfNonDigitMethod = iSO8601UtilsClazz.getDeclaredMethod("indexOfNonDigit", stringType, intType);
        indexOfNonDigitMethod.setAccessible(true);
        java.lang.Object[] indexOfNonDigitMethodArguments = new java.lang.Object[2];
        indexOfNonDigitMethodArguments[0] = string;
        indexOfNonDigitMethodArguments[1] = 0;
        int actual = ((Integer) indexOfNonDigitMethod.invoke(null, indexOfNonDigitMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexOfNonDigit(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#indexOfNonDigit(java.lang.String,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < string.length(); i++)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char c = string.charAt(i);
 *  */
    @Test
    public void testIndexOfNonDigit_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        String string = "";
        
        /* This test fails because method [com.google.gson.internal.bind.util.ISO8601Utils.indexOfNonDigit] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.google.gson.internal.bind.util.ISO8601Utils.indexOfNonDigit(ISO8601Utils.java:346) */
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method indexOfNonDigitMethod = iSO8601UtilsClazz.getDeclaredMethod("indexOfNonDigit", stringType, intType);
        indexOfNonDigitMethod.setAccessible(true);
        java.lang.Object[] indexOfNonDigitMethodArguments = new java.lang.Object[2];
        indexOfNonDigitMethodArguments[0] = string;
        indexOfNonDigitMethodArguments[1] = -1;
        try {
            indexOfNonDigitMethod.invoke(null, indexOfNonDigitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#indexOfNonDigit(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = offset; i < string.length(); i++)
 *  */
    @Test
    public void testIndexOfNonDigit_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.gson.internal.bind.util.ISO8601Utils.indexOfNonDigit] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.util.ISO8601Utils.indexOfNonDigit(ISO8601Utils.java:345) */
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method indexOfNonDigitMethod = iSO8601UtilsClazz.getDeclaredMethod("indexOfNonDigit", stringType, intType);
        indexOfNonDigitMethod.setAccessible(true);
        java.lang.Object[] indexOfNonDigitMethodArguments = new java.lang.Object[2];
        indexOfNonDigitMethodArguments[0] = ((Object) null);
        indexOfNonDigitMethodArguments[1] = -255;
        try {
            indexOfNonDigitMethod.invoke(null, indexOfNonDigitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method indexOfNonDigit(java.lang.String, int)
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#indexOfNonDigit(java.lang.String,int)}
     */
    @Test
    public void testIndexOfNonDigitThrowsSIOOBEWithBlankString() throws Throwable  {
        /* This test fails because method [com.google.gson.internal.bind.util.ISO8601Utils.indexOfNonDigit] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -2147483647]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.google.gson.internal.bind.util.ISO8601Utils.indexOfNonDigit(ISO8601Utils.java:346) */
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method indexOfNonDigitMethod = iSO8601UtilsClazz.getDeclaredMethod("indexOfNonDigit", stringType, intType);
        indexOfNonDigitMethod.setAccessible(true);
        java.lang.Object[] indexOfNonDigitMethodArguments = new java.lang.Object[2];
        indexOfNonDigitMethodArguments[0] = "\n\t\r";
        indexOfNonDigitMethodArguments[1] = -2147483647;
        try {
            indexOfNonDigitMethod.invoke(null, indexOfNonDigitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.util.ISO8601Utils.padInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method padInt(java.lang.StringBuilder, int, int)
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#padInt(java.lang.StringBuilder,int,int)}
 * @utbot.invokes {@link java.lang.Integer#toString(int)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = length - strValue.length(); i > 0; i--)} once
 *  */
    @Test
    public void testPadInt_StringBuilderAppend() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class intType = int.class;
        Method padIntMethod = iSO8601UtilsClazz.getDeclaredMethod("padInt", stringBuilderType, intType, intType);
        padIntMethod.setAccessible(true);
        java.lang.Object[] padIntMethodArguments = new java.lang.Object[3];
        padIntMethodArguments[0] = stringBuilder;
        padIntMethodArguments[1] = 0;
        padIntMethodArguments[2] = 2;
        padIntMethod.invoke(null, padIntMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method padInt(java.lang.StringBuilder, int, int)
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#padInt(java.lang.StringBuilder,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = length - strValue.length(); i > 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append('0');
 *  */
    @Test
    public void testPadInt_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.gson.internal.bind.util.ISO8601Utils.padInt] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.util.ISO8601Utils.padInt(ISO8601Utils.java:336) */
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class intType = int.class;
        Method padIntMethod = iSO8601UtilsClazz.getDeclaredMethod("padInt", stringBuilderType, intType, intType);
        padIntMethod.setAccessible(true);
        java.lang.Object[] padIntMethodArguments = new java.lang.Object[3];
        padIntMethodArguments[0] = ((Object) null);
        padIntMethodArguments[1] = Integer.MIN_VALUE;
        padIntMethodArguments[2] = 12;
        try {
            padIntMethod.invoke(null, padIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#padInt(java.lang.StringBuilder,int,int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(strValue);
 *  */
    @Test
    public void testPadInt_ThrowNullPointerException_1() throws Throwable  {
        /* This test fails because method [com.google.gson.internal.bind.util.ISO8601Utils.padInt] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.util.ISO8601Utils.padInt(ISO8601Utils.java:338) */
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class intType = int.class;
        Method padIntMethod = iSO8601UtilsClazz.getDeclaredMethod("padInt", stringBuilderType, intType, intType);
        padIntMethod.setAccessible(true);
        java.lang.Object[] padIntMethodArguments = new java.lang.Object[3];
        padIntMethodArguments[0] = ((Object) null);
        padIntMethodArguments[1] = Integer.MIN_VALUE;
        padIntMethodArguments[2] = 11;
        try {
            padIntMethod.invoke(null, padIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ISO8601Utils}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#padInt(java.lang.StringBuilder,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = length - strValue.length(); i > 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append('0');
 *  */
    @Test
    public void testPadInt_ThrowNullPointerException_2() throws Throwable  {
        /* This test fails because method [com.google.gson.internal.bind.util.ISO8601Utils.padInt] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.util.ISO8601Utils.padInt(ISO8601Utils.java:336) */
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class intType = int.class;
        Method padIntMethod = iSO8601UtilsClazz.getDeclaredMethod("padInt", stringBuilderType, intType, intType);
        padIntMethod.setAccessible(true);
        java.lang.Object[] padIntMethodArguments = new java.lang.Object[3];
        padIntMethodArguments[0] = ((Object) null);
        padIntMethodArguments[1] = -1;
        padIntMethodArguments[2] = 3;
        try {
            padIntMethod.invoke(null, padIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method padInt(java.lang.StringBuilder, int, int)
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.util.ISO8601Utils#padInt(java.lang.StringBuilder,int,int)}
     */
    @Test
    public void testPadIntThrowsNPE() throws Throwable  {
        /* This test fails because method [com.google.gson.internal.bind.util.ISO8601Utils.padInt] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.util.ISO8601Utils.padInt(ISO8601Utils.java:338) */
        Class iSO8601UtilsClazz = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class intType = int.class;
        Method padIntMethod = iSO8601UtilsClazz.getDeclaredMethod("padInt", stringBuilderType, intType, intType);
        padIntMethod.setAccessible(true);
        java.lang.Object[] padIntMethodArguments = new java.lang.Object[3];
        padIntMethodArguments[0] = ((Object) null);
        padIntMethodArguments[1] = -16385;
        padIntMethodArguments[2] = -1;
        try {
            padIntMethod.invoke(null, padIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

