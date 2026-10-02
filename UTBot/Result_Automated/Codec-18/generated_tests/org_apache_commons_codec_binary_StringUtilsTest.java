package org.apache.commons.codec.binary;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.lang.reflect.Field;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_codec_binary_StringUtilsTest {
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method equals(java.lang.CharSequence, java.lang.CharSequence)
    
    /**
    @utbot.classUnderTest {@link StringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#equals(java.lang.CharSequence,java.lang.CharSequence)}
 * @utbot.executesCondition {@code (cs1 == cs2): False}
 * @utbot.executesCondition {@code (cs1 == null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_Cs1EqualsNull() {
        String string = "";
        
        boolean actual = StringUtils.equals(null, string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#equals(java.lang.CharSequence,java.lang.CharSequence)}
 * @utbot.executesCondition {@code (cs1 == cs2): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Cs1EqualsCs2() {
        boolean actual = StringUtils.equals(null, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#equals(java.lang.CharSequence,java.lang.CharSequence)}
 * @utbot.executesCondition {@code (cs1 == cs2): False}
 * @utbot.executesCondition {@code (cs1 == null): False}
 * @utbot.executesCondition {@code (cs2 == null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_Cs2EqualsNull() {
        String string = "";
        
        boolean actual = StringUtils.equals(string, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method equals(java.lang.CharSequence, java.lang.CharSequence)
    
    /**
    @utbot.classUnderTest {@link StringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#equals(java.lang.CharSequence,java.lang.CharSequence)}
 * @utbot.executesCondition {@code (cs1 == cs2): False}
 * @utbot.executesCondition {@code (cs1 == null): False}
 * @utbot.executesCondition {@code (cs2 == null): False}
 * @utbot.executesCondition {@code (cs1 instanceof String && cs2 instanceof String): False}
 * @utbot.invokes {@link java.lang.CharSequence#length()}
 * @utbot.invokes {@link java.lang.CharSequence#length()}
 * @utbot.invokes {@link java.lang.Math#max(int,int)}
 * @utbot.invokes {@link org.apache.commons.codec.binary.CharSequenceUtils#regionMatches(java.lang.CharSequence,boolean,int,java.lang.CharSequence,int,int)}
 * @utbot.returnsFrom {@code return CharSequenceUtils.regionMatches(cs1, false, 0, cs2, 0, Math.max(cs1.length(), cs2.length()));}
 *  */
    @Test
    public void testEquals_Cs1NotInstanceOfStringAndCs2NotInstanceOfString() {
        String string = "";
        String string1 = "";
        
        boolean actual = StringUtils.equals(string, string1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method equals(java.lang.CharSequence, java.lang.CharSequence)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.StringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#equals(java.lang.CharSequence,java.lang.CharSequence)}
     */
    @Test
    public void testEqualsReturnsTrueWithNonEmptyString() {
        StringBuilder stringBuilder = new StringBuilder("10");
        
        boolean actual = StringUtils.equals("10", stringBuilder);
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.StringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#equals(java.lang.CharSequence,java.lang.CharSequence)}
     */
    @Test
    public void testEqualsReturnsFalseWithNonEmptyString() {
        StringBuilder stringBuilder = new StringBuilder("10");
        
        boolean actual = StringUtils.equals("1\u00020\uFFF7", stringBuilder);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method equals(java.lang.CharSequence, java.lang.CharSequence)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.StringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#equals(java.lang.CharSequence,java.lang.CharSequence)}
     */
    @Test
    public void testEqualsThrowsSIOOBEWithNonEmptyString() {
        StringBuilder stringBuilder = new StringBuilder("10");
        
        /* This test fails because method [org.apache.commons.codec.binary.StringUtils.equals] produces [java.lang.StringIndexOutOfBoundsException: index 2, length 2]
            java.base/java.lang.String.checkIndex(String.java:4567)
            java.base/java.lang.AbstractStringBuilder.charAt(AbstractStringBuilder.java:351)
            java.base/java.lang.StringBuilder.charAt(StringBuilder.java:91)
            org.apache.commons.codec.binary.CharSequenceUtils.regionMatches(CharSequenceUtils.java:60)
            org.apache.commons.codec.binary.StringUtils.equals(StringUtils.java:81) */
        StringUtils.equals("10\uFFF7", stringBuilder);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.getBytes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBytes(java.lang.String, java.nio.charset.Charset)
    
    /**
    @utbot.classUnderTest {@link StringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#getBytes(java.lang.String,java.nio.charset.Charset)}
 * @utbot.executesCondition {@code (string == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetBytes_StringEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class stringUtilsClazz = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class stringType = Class.forName("java.lang.String");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method getBytesMethod = stringUtilsClazz.getDeclaredMethod("getBytes", stringType, charsetType);
        getBytesMethod.setAccessible(true);
        java.lang.Object[] getBytesMethodArguments = new java.lang.Object[2];
        getBytesMethodArguments[0] = ((Object) null);
        getBytesMethodArguments[1] = ((Object) null);
        byte[] actual = ((byte[]) getBytesMethod.invoke(null, getBytesMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getBytes(java.lang.String, java.nio.charset.Charset)
    
    @Test
    public void testGetBytes1() throws Throwable  {
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.binary.StringUtils.getBytes] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getBytes(String.java:1789)
            org.apache.commons.codec.binary.StringUtils.getBytes(StringUtils.java:97) */
        Class stringUtilsClazz = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class stringType = Class.forName("java.lang.String");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method getBytesMethod = stringUtilsClazz.getDeclaredMethod("getBytes", stringType, charsetType);
        getBytesMethod.setAccessible(true);
        java.lang.Object[] getBytesMethodArguments = new java.lang.Object[2];
        getBytesMethodArguments[0] = string;
        getBytesMethodArguments[1] = ((Object) null);
        try {
            getBytesMethod.invoke(null, getBytesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getBytes
    
    public void testGetBytes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.newString
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method newString([B, java.nio.charset.Charset)
    
    @Test
    public void testNewString1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class stringUtilsClazz = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class byteArrayType = Class.forName("[B");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method newStringMethod = stringUtilsClazz.getDeclaredMethod("newString", byteArrayType, charsetType);
        newStringMethod.setAccessible(true);
        java.lang.Object[] newStringMethodArguments = new java.lang.Object[2];
        newStringMethodArguments[0] = ((Object) null);
        newStringMethodArguments[1] = ((Object) null);
        String actual = ((String) newStringMethod.invoke(null, newStringMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method newString([B, java.nio.charset.Charset)
    
    @Test
    public void testNewString2() throws Throwable  {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.codec.binary.StringUtils.newString] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.lang.String.<init>(String.java:522)
            java.base/java.lang.String.<init>(String.java:1389)
            org.apache.commons.codec.binary.StringUtils.newString(StringUtils.java:292) */
        Class stringUtilsClazz = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class byteArrayType = Class.forName("[B");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method newStringMethod = stringUtilsClazz.getDeclaredMethod("newString", byteArrayType, charsetType);
        newStringMethod.setAccessible(true);
        java.lang.Object[] newStringMethodArguments = new java.lang.Object[2];
        newStringMethodArguments[0] = ((Object) byteArray);
        newStringMethodArguments[1] = ((Object) null);
        try {
            newStringMethod.invoke(null, newStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.newString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newString([B, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#newString(byte[],java.lang.String)}
 * @utbot.executesCondition {@code (bytes == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testNewString_BytesEqualsNull() {
        String actual = StringUtils.newString(((byte[]) null), ((String) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method newString([B, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.StringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#newString(byte[],java.lang.String)}
     */
    @Test(expected = IllegalStateException.class)
    public void testNewStringThrowsISEWithNonEmptyPrimitiveArrayAndNonEmptyString() {
        byte[] byteArray = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        StringUtils.newString(byteArray, "cab");
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method newString([B, java.lang.String)
    
    @Test
    public void testNewString3() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.codec.binary.StringUtils.newString] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.lang.String.lookupCharset(String.java:827)
            java.base/java.lang.String.<init>(String.java:487)
            java.base/java.lang.String.<init>(String.java:1365)
            org.apache.commons.codec.binary.StringUtils.newString(StringUtils.java:319) */
        StringUtils.newString(byteArray, ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.getByteBuffer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getByteBuffer(java.lang.String, java.nio.charset.Charset)
    
    /**
    @utbot.classUnderTest {@link StringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#getByteBuffer(java.lang.String,java.nio.charset.Charset)}
 * @utbot.executesCondition {@code (string == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetByteBuffer_StringEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class stringUtilsClazz = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class stringType = Class.forName("java.lang.String");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method getByteBufferMethod = stringUtilsClazz.getDeclaredMethod("getByteBuffer", stringType, charsetType);
        getByteBufferMethod.setAccessible(true);
        java.lang.Object[] getByteBufferMethodArguments = new java.lang.Object[2];
        getByteBufferMethodArguments[0] = ((Object) null);
        getByteBufferMethodArguments[1] = ((Object) null);
        ByteBuffer actual = ((ByteBuffer) getByteBufferMethod.invoke(null, getByteBufferMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getByteBuffer(java.lang.String, java.nio.charset.Charset)
    
    @Test
    public void testGetByteBuffer1() throws Throwable  {
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.binary.StringUtils.getByteBuffer] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getBytes(String.java:1789)
            org.apache.commons.codec.binary.StringUtils.getByteBuffer(StringUtils.java:114) */
        Class stringUtilsClazz = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class stringType = Class.forName("java.lang.String");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method getByteBufferMethod = stringUtilsClazz.getDeclaredMethod("getByteBuffer", stringType, charsetType);
        getByteBufferMethod.setAccessible(true);
        java.lang.Object[] getByteBufferMethodArguments = new java.lang.Object[2];
        getByteBufferMethodArguments[0] = string;
        getByteBufferMethodArguments[1] = ((Object) null);
        try {
            getByteBufferMethod.invoke(null, getByteBufferMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getByteBuffer
    
    public void testGetByteBuffer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.newIllegalStateException
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newIllegalStateException(java.lang.String, java.io.UnsupportedEncodingException)
    
    /**
    @utbot.classUnderTest {@link StringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#newIllegalStateException(java.lang.String,java.io.UnsupportedEncodingException)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return new IllegalStateException(charsetName + ": " + e);}
 *  */
    @Test
    public void testNewIllegalStateException_StringBuilderToString() throws Exception  {
        Class stringUtilsClazz = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class stringType = Class.forName("java.lang.String");
        Class unsupportedEncodingExceptionType = Class.forName("java.io.UnsupportedEncodingException");
        Method newIllegalStateExceptionMethod = stringUtilsClazz.getDeclaredMethod("newIllegalStateException", stringType, unsupportedEncodingExceptionType);
        newIllegalStateExceptionMethod.setAccessible(true);
        java.lang.Object[] newIllegalStateExceptionMethodArguments = new java.lang.Object[2];
        newIllegalStateExceptionMethodArguments[0] = ((Object) null);
        newIllegalStateExceptionMethodArguments[1] = ((Object) null);
        IllegalStateException actual = ((IllegalStateException) newIllegalStateExceptionMethod.invoke(null, newIllegalStateExceptionMethodArguments));
        
        IllegalStateException expected = ((IllegalStateException) createInstance("java.lang.IllegalStateException"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getBytesUtf16Be(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.StringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#getBytesUtf16Be(java.lang.String)}
     */
    @Test
    public void testGetBytesUtf16BeWithNonEmptyString() {
        byte[] actual = StringUtils.getBytesUtf16Be("\u0014\n\t\r");
        
        byte[] expected = {(byte) 0, (byte) 20, (byte) 0, (byte) 10, (byte) 0, (byte) 9, (byte) 0, (byte) 13};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getBytesUtf16Be
    
    public void testGetBytesUtf16Be_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getBytesUtf16Le(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.StringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#getBytesUtf16Le(java.lang.String)}
     */
    @Test
    public void testGetBytesUtf16LeWithNonEmptyString() {
        byte[] actual = StringUtils.getBytesUtf16Le("\u0014\n\t\r");
        
        byte[] expected = {(byte) 20, (byte) 0, (byte) 10, (byte) 0, (byte) 9, (byte) 0, (byte) 13, (byte) 0};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getBytesUtf16Le
    
    public void testGetBytesUtf16Le_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.getBytesUtf16
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getBytesUtf16(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.StringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#getBytesUtf16(java.lang.String)}
     */
    @Test
    public void testGetBytesUtf16WithNonEmptyString() {
        byte[] actual = StringUtils.getBytesUtf16("\u0014\n\t\r");
        
        byte[] expected = {
            (byte) -2, (byte) -1, (byte) 0, (byte) 20, (byte) 0, (byte) 10, (byte) 0, (byte) 9,
            (byte) 0, (byte) 13
        };
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getBytesUtf16
    
    public void testGetBytesUtf16_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.newStringUtf16Le
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method newStringUtf16Le([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.StringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#newStringUtf16Le(byte[])}
     */
    @Test
    public void testNewStringUtf16LeWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        String actual = StringUtils.newStringUtf16Le(byteArray);
        
        String expected = "\uFFFF\uFFFD";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for newStringUtf16Le
    
    public void testNewStringUtf16Le_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.newStringUtf8
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method newStringUtf8([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.StringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#newStringUtf8(byte[])}
     */
    @Test
    public void testNewStringUtf8WithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        String actual = StringUtils.newStringUtf8(byteArray);
        
        String expected = "\uFFFD\uFFFD\uFFFD";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for newStringUtf8
    
    public void testNewStringUtf8_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.newStringUtf16Be
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method newStringUtf16Be([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.StringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#newStringUtf16Be(byte[])}
     */
    @Test
    public void testNewStringUtf16BeWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        String actual = StringUtils.newStringUtf16Be(byteArray);
        
        String expected = "\uFFFF\uFFFD";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for newStringUtf16Be
    
    public void testNewStringUtf16Be_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.getBytesUtf8
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getBytesUtf8(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.StringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#getBytesUtf8(java.lang.String)}
     */
    @Test
    public void testGetBytesUtf8WithNonEmptyString() {
        byte[] actual = StringUtils.getBytesUtf8("\u0014\n\t\r");
        
        byte[] expected = {(byte) 20, (byte) 10, (byte) 9, (byte) 13};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getBytesUtf8
    
    public void testGetBytesUtf8_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.newStringIso8859_1
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method newStringIso8859_1([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.StringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#newStringIso8859_1(byte[])}
     */
    @Test
    public void testNewStringIso8859_1WithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        String actual = StringUtils.newStringIso8859_1(byteArray);
        
        String expected = "\u00FF\u00FF\u0080";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for newStringIso8859_1
    
    public void testNewStringIso8859_1_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getBytesIso8859_1(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.StringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#getBytesIso8859_1(java.lang.String)}
     */
    @Test
    public void testGetBytesIso8859_1WithNonEmptyString() {
        byte[] actual = StringUtils.getBytesIso8859_1("\u0014\n\t\r");
        
        byte[] expected = {(byte) 20, (byte) 10, (byte) 9, (byte) 13};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getBytesIso8859_1
    
    public void testGetBytesIso8859_1_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.getBytesUsAscii
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getBytesUsAscii(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.StringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#getBytesUsAscii(java.lang.String)}
     */
    @Test
    public void testGetBytesUsAsciiWithNonEmptyString() {
        byte[] actual = StringUtils.getBytesUsAscii("\u0014\n\t\r");
        
        byte[] expected = {(byte) 20, (byte) 10, (byte) 9, (byte) 13};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getBytesUsAscii
    
    public void testGetBytesUsAscii_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.getBytesUnchecked
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBytesUnchecked(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#getBytesUnchecked(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (string == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetBytesUnchecked_StringEqualsNull() {
        byte[] actual = StringUtils.getBytesUnchecked(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBytesUnchecked(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#getBytesUnchecked(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (string == null): False}
 * @utbot.invokes {@link java.lang.String#getBytes(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return string.getBytes(charsetName);
 *  */
    @Test
    public void testGetBytesUnchecked_ThrowNullPointerException() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.binary.StringUtils.getBytesUnchecked] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getBytes(String.java:1766)
            org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(StringUtils.java:178) */
        StringUtils.getBytesUnchecked(string, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getBytesUnchecked(java.lang.String, java.lang.String)
    
    @Test(expected = IllegalStateException.class)
    public void testGetBytesUnchecked1() {
        String string = "";
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        StringUtils.getBytesUnchecked(string, string1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.newStringUsAscii
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method newStringUsAscii([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.StringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#newStringUsAscii(byte[])}
     */
    @Test
    public void testNewStringUsAsciiWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        String actual = StringUtils.newStringUsAscii(byteArray);
        
        String expected = "\uFFFD\uFFFD\uFFFD";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for newStringUsAscii
    
    public void testNewStringUsAscii_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getByteBufferUtf8(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.StringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#getByteBufferUtf8(java.lang.String)}
     */
    @Test
    public void testGetByteBufferUtf8WithNonEmptyString() throws Exception  {
        Object actual = StringUtils.getByteBufferUtf8("\u0014\n\t\r");
        
        Object expected = createInstance("java.nio.HeapByteBuffer");
        
    }
    ///endregion
    
    ///region Errors report for getByteBufferUtf8
    
    public void testGetByteBufferUtf8_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.StringUtils.newStringUtf16
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method newStringUtf16([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.StringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.StringUtils#newStringUtf16(byte[])}
     */
    @Test
    public void testNewStringUtf16WithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        String actual = StringUtils.newStringUtf16(byteArray);
        
        String expected = "\uFFFF\uFFFD";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for newStringUtf16
    
    public void testNewStringUtf16_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
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

