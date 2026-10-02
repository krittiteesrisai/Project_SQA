package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import java.io.IOException;
import java.lang.reflect.Method;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_compress_archivers_tar_TarUtilsTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseName
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method parseName([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int)}
     */
    @Test
    public void testParseNameWithNonEmptyPrimitiveArrayAndCornerCase() {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MIN_VALUE, java.lang.Byte.MAX_VALUE, (byte) 1, java.lang.Byte.MIN_VALUE};
        
        String actual = TarUtils.parseName(byteArray, -1, 0);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parseName([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int)}
     */
    @Test
    public void testParseNameThrowsAIOOBEWithNonEmptyPrimitiveArrayAndCornerCase() {
        byte[] byteArray = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483645 out of bounds for length 3]
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:295)
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:264) */
        TarUtils.parseName(byteArray, -1, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseName([B, int, int, org.apache.commons.compress.archivers.zip.ZipEncoding)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int,org.apache.commons.compress.archivers.zip.ZipEncoding)}
 * @utbot.iterates iterate the loop {@code for(; len > 0; len--)} once
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testParseName_Offsetlen1OfBufferEqualsZero() throws IOException  {
        byte[] byteArray = {(byte) 0};
        
        String actual = TarUtils.parseName(byteArray, 0, 1, null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int,org.apache.commons.compress.archivers.zip.ZipEncoding)}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testParseName_Return() throws IOException  {
        String actual = TarUtils.parseName(null, -255, 0, null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseName([B, int, int, org.apache.commons.compress.archivers.zip.ZipEncoding)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int,org.apache.commons.compress.archivers.zip.ZipEncoding)}
 * @utbot.iterates iterate the loop {@code for(; len > 0; len--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[offset + len - 1] != 0
 *  */
    @Test
    public void testParseName_ThrowArrayIndexOutOfBoundsException() throws IOException  {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:295) */
        TarUtils.parseName(byteArray, 3, 1, null);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int,org.apache.commons.compress.archivers.zip.ZipEncoding)}
 * @utbot.iterates iterate the loop {@code for(; len > 0; len--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(buffer, offset, b, 0, len);
 *  */
    @Test
    public void testParseName_ThrowArrayIndexOutOfBoundsException_1() throws IOException  {
        byte[] byteArray = {
            (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127,
            (byte) -127
        };
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:301) */
        TarUtils.parseName(byteArray, -1, 2, null);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int,org.apache.commons.compress.archivers.zip.ZipEncoding)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipEncoding#decode(byte[])}
 * @utbot.iterates iterate the loop {@code for(; len > 0; len--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return encoding.decode(b);
 *  */
    @Test
    public void testParseName_ThrowNullPointerException_1() throws IOException  {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:302) */
        TarUtils.parseName(byteArray, 0, 1, null);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int,org.apache.commons.compress.archivers.zip.ZipEncoding)}
 * @utbot.iterates iterate the loop {@code for(; len > 0; len--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: buffer[offset + len - 1] != 0
 *  */
    @Test
    public void testParseName_ThrowNullPointerException() throws IOException  {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:295) */
        TarUtils.parseName(null, -255, 1, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parseName([B, int, int, org.apache.commons.compress.archivers.zip.ZipEncoding)
    
    @Test(expected = OutOfMemoryError.class)
    public void testParseNameByFuzzer() throws IOException  {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MAX_VALUE, (byte) -1};
        
        TarUtils.parseName(byteArray, -2147483646, Integer.MAX_VALUE, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseName([B, int, int, org.apache.commons.compress.archivers.zip.ZipEncoding)
    
    @Test
    public void testParseName1() throws IOException  {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:295) */
        TarUtils.parseName(byteArray, -1073741823, 1073741824, null);
    }
    
    @Test
    public void testParseName2() throws Throwable  {
        byte[] byteArray = new byte[40];
        byteArray[32] = java.lang.Byte.MIN_VALUE;
        Object nioZipEncoding = createInstance("org.apache.commons.compress.archivers.zip.NioZipEncoding");
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.NioZipEncoding.decode(NioZipEncoding.java:121)
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:302) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class nioZipEncodingType = Class.forName("org.apache.commons.compress.archivers.zip.ZipEncoding");
        Method parseNameMethod = tarUtilsClazz.getDeclaredMethod("parseName", byteArrayType, intType, intType, nioZipEncodingType);
        parseNameMethod.setAccessible(true);
        java.lang.Object[] parseNameMethodArguments = new java.lang.Object[4];
        parseNameMethodArguments[0] = ((Object) byteArray);
        parseNameMethodArguments[1] = 24;
        parseNameMethodArguments[2] = 9;
        parseNameMethodArguments[3] = nioZipEncoding;
        try {
            parseNameMethod.invoke(null, parseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method parseName([B, int, int, org.apache.commons.compress.archivers.zip.ZipEncoding)
    
    @Test(expected = UnsupportedEncodingException.class)
    public void testParseName3() throws Throwable  {
        byte[] byteArray = {(byte) -127};
        Object fallbackZipEncoding = createInstance("org.apache.commons.compress.archivers.zip.FallbackZipEncoding");
        String charsetName = "";
        setField(fallbackZipEncoding, "org.apache.commons.compress.archivers.zip.FallbackZipEncoding", "charsetName", charsetName);
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class fallbackZipEncodingType = Class.forName("org.apache.commons.compress.archivers.zip.ZipEncoding");
        Method parseNameMethod = tarUtilsClazz.getDeclaredMethod("parseName", byteArrayType, intType, intType, fallbackZipEncodingType);
        parseNameMethod.setAccessible(true);
        java.lang.Object[] parseNameMethodArguments = new java.lang.Object[4];
        parseNameMethodArguments[0] = ((Object) byteArray);
        parseNameMethodArguments[1] = 0;
        parseNameMethodArguments[2] = 1;
        parseNameMethodArguments[3] = fallbackZipEncoding;
        try {
            parseNameMethod.invoke(null, parseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseBoolean([B, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseBoolean(byte[],int)}
 * @utbot.returnsFrom {@code return buffer[offset] == 1;}
 *  */
    @Test
    public void testParseBoolean_OffsetOfBufferNotEquals1() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        boolean actual = TarUtils.parseBoolean(byteArray, 1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseBoolean(byte[],int)}
 * @utbot.returnsFrom {@code return buffer[offset] == 1;}
 *  */
    @Test
    public void testParseBoolean_OffsetOfBufferEquals1() {
        byte[] byteArray = {(byte) -127, (byte) 1};
        
        boolean actual = TarUtils.parseBoolean(byteArray, 1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseBoolean([B, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseBoolean(byte[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return buffer[offset] == 1;
 *  */
    @Test
    public void testParseBoolean_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(TarUtils.java:232) */
        TarUtils.parseBoolean(byteArray, -256);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseBoolean(byte[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return buffer[offset] == 1;
 *  */
    @Test
    public void testParseBoolean_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(TarUtils.java:232) */
        TarUtils.parseBoolean(null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.exceptionMessage
    
    ///region FUZZER: ERROR SUITE for method exceptionMessage([B, int, int, int, byte)
    
    @Test
    public void testExceptionMessageByFuzzer() throws Throwable  {
        byte[] byteArray = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.exceptionMessage] produces [java.lang.StringIndexOutOfBoundsException: offset -1, count 2147483647, length 3]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.<init>(String.java:523)
            java.base/java.lang.String.<init>(String.java:1419)
            org.apache.commons.compress.archivers.tar.TarUtils.exceptionMessage(TarUtils.java:245) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class byteType = byte.class;
        Method exceptionMessageMethod = tarUtilsClazz.getDeclaredMethod("exceptionMessage", byteArrayType, intType, intType, intType, byteType);
        exceptionMessageMethod.setAccessible(true);
        java.lang.Object[] exceptionMessageMethodArguments = new java.lang.Object[5];
        exceptionMessageMethodArguments[0] = ((Object) byteArray);
        exceptionMessageMethodArguments[1] = -1;
        exceptionMessageMethodArguments[2] = Integer.MAX_VALUE;
        exceptionMessageMethodArguments[3] = -1;
        exceptionMessageMethodArguments[4] = (byte) 1;
        try {
            exceptionMessageMethod.invoke(null, exceptionMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method exceptionMessage([B, int, int, int, byte)
    
    @Test
    public void testExceptionMessage1() throws Throwable  {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.exceptionMessage] produces [java.lang.NullPointerException]
            java.base/java.lang.String.<init>(String.java:523)
            java.base/java.lang.String.<init>(String.java:1419)
            org.apache.commons.compress.archivers.tar.TarUtils.exceptionMessage(TarUtils.java:245) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class byteType = byte.class;
        Method exceptionMessageMethod = tarUtilsClazz.getDeclaredMethod("exceptionMessage", byteArrayType, intType, intType, intType, byteType);
        exceptionMessageMethod.setAccessible(true);
        java.lang.Object[] exceptionMessageMethodArguments = new java.lang.Object[5];
        exceptionMessageMethodArguments[0] = ((Object) null);
        exceptionMessageMethodArguments[1] = -255;
        exceptionMessageMethodArguments[2] = -255;
        exceptionMessageMethodArguments[3] = -255;
        exceptionMessageMethodArguments[4] = (byte) -127;
        try {
            exceptionMessageMethod.invoke(null, exceptionMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatBigIntegerBinary(long, [B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatBigIntegerBinary(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (len > length - 1): False}
 * @utbot.executesCondition {@code (negative): False}
 * @utbot.invokes {@link java.math.BigInteger#toByteArray()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset + 1; i < off; i++)} once
 *  */
    @Test
    public void testFormatBigIntegerBinary_NotNegative() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {(byte) -127};
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method formatBigIntegerBinaryMethod = tarUtilsClazz.getDeclaredMethod("formatBigIntegerBinary", longType, byteArrayType, intType, intType, booleanType);
        formatBigIntegerBinaryMethod.setAccessible(true);
        java.lang.Object[] formatBigIntegerBinaryMethodArguments = new java.lang.Object[5];
        formatBigIntegerBinaryMethodArguments[0] = 0L;
        formatBigIntegerBinaryMethodArguments[1] = ((Object) byteArray);
        formatBigIntegerBinaryMethodArguments[2] = -1;
        formatBigIntegerBinaryMethodArguments[3] = 2;
        formatBigIntegerBinaryMethodArguments[4] = false;
        formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        
        byte finalByteArray0 = byteArray[0];
        
        assertEquals((byte) 0, finalByteArray0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method formatBigIntegerBinary(long, [B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatBigIntegerBinary(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (len > length - 1): False}
 * @utbot.invokes {@link java.math.BigInteger#toByteArray()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: System.arraycopy(b, 0, buf, off, len);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatBigIntegerBinary_ThrowIllegalArgumentException() throws Throwable  {
        byte[] byteArray = {(byte) -127};
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method formatBigIntegerBinaryMethod = tarUtilsClazz.getDeclaredMethod("formatBigIntegerBinary", longType, byteArrayType, intType, intType, booleanType);
        formatBigIntegerBinaryMethod.setAccessible(true);
        java.lang.Object[] formatBigIntegerBinaryMethodArguments = new java.lang.Object[5];
        formatBigIntegerBinaryMethodArguments[0] = 0L;
        formatBigIntegerBinaryMethodArguments[1] = ((Object) byteArray);
        formatBigIntegerBinaryMethodArguments[2] = -2;
        formatBigIntegerBinaryMethodArguments[3] = 1;
        formatBigIntegerBinaryMethodArguments[4] = false;
        try {
            formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatBigIntegerBinary(long, [B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatBigIntegerBinary(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (len > length - 1): False}
 * @utbot.executesCondition {@code (negative): False}
 * @utbot.invokes {@link java.math.BigInteger#toByteArray()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset + 1; i < off; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[i] = fill;
 *  */
    @Test
    public void testFormatBigIntegerBinary_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:527) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method formatBigIntegerBinaryMethod = tarUtilsClazz.getDeclaredMethod("formatBigIntegerBinary", longType, byteArrayType, intType, intType, booleanType);
        formatBigIntegerBinaryMethod.setAccessible(true);
        java.lang.Object[] formatBigIntegerBinaryMethodArguments = new java.lang.Object[5];
        formatBigIntegerBinaryMethodArguments[0] = 0L;
        formatBigIntegerBinaryMethodArguments[1] = ((Object) byteArray);
        formatBigIntegerBinaryMethodArguments[2] = -256;
        formatBigIntegerBinaryMethodArguments[3] = 256;
        formatBigIntegerBinaryMethodArguments[4] = false;
        try {
            formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatUnsignedOctalString(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatUnsignedOctalString(long,byte[],int,int)}
 * @utbot.executesCondition {@code (value == 0): True}
 *  */
    @Test
    public void testFormatUnsignedOctalString_ValueEqualsZero() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatUnsignedOctalString(0L, byteArray, 0, 1);
        
        byte finalByteArray0 = byteArray[0];
        
        assertEquals((byte) 48, finalByteArray0);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatUnsignedOctalString(long,byte[],int,int)}
 * @utbot.executesCondition {@code (value == 0): False}
 * @utbot.iterates iterate the loop {@code for(; remaining >= 0 && val != 0; --remaining)} once
 *  */
    @Test
    public void testFormatUnsignedOctalString_ValueNotEqualsZero() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatUnsignedOctalString(1L, byteArray, 0, 1);
        
        byte finalByteArray0 = byteArray[0];
        
        assertEquals((byte) 49, finalByteArray0);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatUnsignedOctalString(long,byte[],int,int)}
 * @utbot.executesCondition {@code (value == 0): True}
 * @utbot.iterates iterate the loop {@code for(; remaining >= 0; --remaining)} once
 *  */
    @Test
    public void testFormatUnsignedOctalString_ValueEqualsZero_1() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        TarUtils.formatUnsignedOctalString(0L, byteArray, 0, 2);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        
        assertEquals((byte) 48, finalByteArray0);
        
        assertEquals((byte) 48, finalByteArray1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method formatUnsignedOctalString(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatUnsignedOctalString(long,byte[],int,int)}
 * @utbot.executesCondition {@code (value == 0): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Long#toOctalString(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: value + "=" + Long.toOctalString(value) + " will not fit in octal number buffer of length " + length
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_ThrowIllegalArgumentException() {
        TarUtils.formatUnsignedOctalString(-255L, null, -255, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatUnsignedOctalString(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatUnsignedOctalString(long,byte[],int,int)}
 * @utbot.executesCondition {@code (value == 0): False}
 * @utbot.iterates iterate the loop {@code for(; remaining >= 0 && val != 0; --remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[offset + remaining] = (byte) ((byte) '0' + (byte) (val & 7));
 *  */
    @Test
    public void testFormatUnsignedOctalString_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 127 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:393) */
        TarUtils.formatUnsignedOctalString(-254L, byteArray, 127, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatUnsignedOctalString(long,byte[],int,int)}
 * @utbot.executesCondition {@code (value == 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[offset + remaining--] = (byte) '0';
 *  */
    @Test
    public void testFormatUnsignedOctalString_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:388) */
        TarUtils.formatUnsignedOctalString(0L, byteArray, 193, -64);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatUnsignedOctalString(long,byte[],int,int)}
 * @utbot.executesCondition {@code (value == 0): True}
 * @utbot.iterates iterate the loop {@code for(; remaining >= 0; --remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[offset + remaining] = (byte) '0';
 *  */
    @Test
    public void testFormatUnsignedOctalString_ThrowArrayIndexOutOfBoundsException_2() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:404) */
        TarUtils.formatUnsignedOctalString(0L, byteArray, -1, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatUnsignedOctalString(long,byte[],int,int)}
 * @utbot.executesCondition {@code (value == 0): False}
 * @utbot.iterates iterate the loop {@code for(; remaining >= 0 && val != 0; --remaining)} twice
 * @utbot.iterates iterate the loop {@code for(; remaining >= 0; --remaining)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[offset + remaining] = (byte) '0';
 *  */
    @Test
    public void testFormatUnsignedOctalString_ThrowArrayIndexOutOfBoundsException_3() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:404) */
        TarUtils.formatUnsignedOctalString(1L, byteArray, -2, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatUnsignedOctalString(long,byte[],int,int)}
 * @utbot.executesCondition {@code (value == 0): False}
 * @utbot.iterates iterate the loop {@code for(; remaining >= 0 && val != 0; --remaining)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer[offset + remaining] = (byte) ((byte) '0' + (byte) (val & 7));
 *  */
    @Test
    public void testFormatUnsignedOctalString_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:393) */
        TarUtils.formatUnsignedOctalString(-255L, null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatUnsignedOctalString(long,byte[],int,int)}
 * @utbot.executesCondition {@code (value == 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer[offset + remaining--] = (byte) '0';
 *  */
    @Test
    public void testFormatUnsignedOctalString_ThrowNullPointerException_1() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:388) */
        TarUtils.formatUnsignedOctalString(0L, null, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatLongOctalOrBinaryBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.returnsFrom {@code return formatLongOctalBytes(value, buf, offset, length);}
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ReturnFormatLongOctalBytes() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        int actual = TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray, 0, 2);
        
        assertEquals(2, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        
        assertEquals((byte) 48, finalByteArray0);
        
        assertEquals((byte) 32, finalByteArray1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.returnsFrom {@code return formatLongOctalBytes(value, buf, offset, length);}
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ReturnFormatLongOctalBytes_1() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        int actual = TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray, 0, 2);
        
        assertEquals(2, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        
        assertEquals((byte) 49, finalByteArray0);
        
        assertEquals((byte) 32, finalByteArray1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatLongOctalOrBinaryBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return formatLongOctalBytes(value, buf, offset, length);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:393)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482) */
        TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray, -7, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return formatLongOctalBytes(value, buf, offset, length);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:404)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482) */
        TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray, -6, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return formatLongOctalBytes(value, buf, offset, length);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_2() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:388)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482) */
        TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray, -7, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return formatLongOctalBytes(value, buf, offset, length);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_3() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:388)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482) */
        TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray, 194, -64);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return formatLongOctalBytes(value, buf, offset, length);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_4() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:404)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482) */
        TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray, -127, 129);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_5() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:510)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:486) */
        TarUtils.formatLongOctalOrBinaryBytes(17179869185L, byteArray, -5, 6);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_6() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -127 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:510)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:486) */
        TarUtils.formatLongOctalOrBinaryBytes(4194305L, byteArray, -134, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.executesCondition {@code (length < 9): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatBigIntegerBinary(value, buf, offset, length, negative);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_7() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2 out of bounds for byte[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:527)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:488) */
        TarUtils.formatLongOctalOrBinaryBytes(-16L, byteArray, -128, 127);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:510)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:486) */
        TarUtils.formatLongOctalOrBinaryBytes(17179869188L, null, -40, 7);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowNullPointerException_1() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:510)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:486) */
        TarUtils.formatLongOctalOrBinaryBytes(4194305L, null, 122, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowNullPointerException_2() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:510)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:486) */
        TarUtils.formatLongOctalOrBinaryBytes(-130L, null, -134, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: formatBigIntegerBinary(value, buf, offset, length, negative);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowNullPointerException_3() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:527)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:488) */
        TarUtils.formatLongOctalOrBinaryBytes(-16L, null, 2147483644, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowNullPointerException_4() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:510)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:486) */
        TarUtils.formatLongOctalOrBinaryBytes(-2L, null, -4, 4);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.executesCondition {@code (length < 9): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: formatBigIntegerBinary(value, buf, offset, length, negative);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowNullPointerException_5() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:527)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:488) */
        TarUtils.formatLongOctalOrBinaryBytes(-16L, null, -255, 9);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method formatLongOctalOrBinaryBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowIllegalArgumentException() {
        TarUtils.formatLongOctalOrBinaryBytes(-256L, null, -255, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowIllegalArgumentException_1() {
        TarUtils.formatLongOctalOrBinaryBytes(java.lang.Long.MIN_VALUE, null, -255, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowIllegalArgumentException_2() {
        TarUtils.formatLongOctalOrBinaryBytes(4611686018427387904L, null, 0, 6);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowIllegalArgumentException_3() {
        TarUtils.formatLongOctalOrBinaryBytes(-72057594037927942L, null, -255, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowIllegalArgumentException_4() {
        TarUtils.formatLongOctalOrBinaryBytes(java.lang.Long.MIN_VALUE, null, 2, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowIllegalArgumentException_5() {
        TarUtils.formatLongOctalOrBinaryBytes(72057594037927936L, null, -255, 8);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method formatLongOctalOrBinaryBytes(long, [B, int, int)
    
    @Test
    public void testFormatLongOctalOrBinaryBytes1() {
        byte[] byteArray = new byte[11];
        
        int actual = TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray, 0, 3);
        
        assertEquals(3, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        byte finalByteArray2 = byteArray[2];
        
        assertEquals((byte) 48, finalByteArray0);
        
        assertEquals((byte) 49, finalByteArray1);
        
        assertEquals((byte) 32, finalByteArray2);
    }
    
    @Test
    public void testFormatLongOctalOrBinaryBytes2() {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        
        int actual = TarUtils.formatLongOctalOrBinaryBytes(-16L, byteArray, 0, 10);
        
        assertEquals(10, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        byte finalByteArray2 = byteArray[2];
        byte finalByteArray3 = byteArray[3];
        byte finalByteArray4 = byteArray[4];
        byte finalByteArray5 = byteArray[5];
        byte finalByteArray6 = byteArray[6];
        byte finalByteArray7 = byteArray[7];
        byte finalByteArray8 = byteArray[8];
        byte finalByteArray9 = byteArray[9];
        
        assertEquals((byte) -1, finalByteArray0);
        
        assertEquals((byte) -1, finalByteArray1);
        
        assertEquals((byte) -1, finalByteArray2);
        
        assertEquals((byte) -1, finalByteArray3);
        
        assertEquals((byte) -1, finalByteArray4);
        
        assertEquals((byte) -1, finalByteArray5);
        
        assertEquals((byte) -1, finalByteArray6);
        
        assertEquals((byte) -1, finalByteArray7);
        
        assertEquals((byte) -1, finalByteArray8);
        
        assertEquals((byte) -16, finalByteArray9);
    }
    
    @Test
    public void testFormatLongOctalOrBinaryBytes3() {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        int actual = TarUtils.formatLongOctalOrBinaryBytes(4194305L, byteArray, 0, 8);
        
        assertEquals(8, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray5 = byteArray[5];
        byte finalByteArray7 = byteArray[7];
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalByteArray0);
        
        assertEquals((byte) 64, finalByteArray5);
        
        assertEquals((byte) 1, finalByteArray7);
    }
    
    @Test
    public void testFormatLongOctalOrBinaryBytes4() {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        int actual = TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray, 0, 8);
        
        assertEquals(8, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        byte finalByteArray2 = byteArray[2];
        byte finalByteArray3 = byteArray[3];
        byte finalByteArray4 = byteArray[4];
        byte finalByteArray5 = byteArray[5];
        byte finalByteArray6 = byteArray[6];
        byte finalByteArray7 = byteArray[7];
        
        assertEquals((byte) 48, finalByteArray0);
        
        assertEquals((byte) 48, finalByteArray1);
        
        assertEquals((byte) 48, finalByteArray2);
        
        assertEquals((byte) 48, finalByteArray3);
        
        assertEquals((byte) 48, finalByteArray4);
        
        assertEquals((byte) 48, finalByteArray5);
        
        assertEquals((byte) 48, finalByteArray6);
        
        assertEquals((byte) 32, finalByteArray7);
    }
    
    @Test
    public void testFormatLongOctalOrBinaryBytes5() {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        int actual = TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray, 0, 8);
        
        assertEquals(8, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        byte finalByteArray2 = byteArray[2];
        byte finalByteArray3 = byteArray[3];
        byte finalByteArray4 = byteArray[4];
        byte finalByteArray5 = byteArray[5];
        byte finalByteArray6 = byteArray[6];
        byte finalByteArray7 = byteArray[7];
        
        assertEquals((byte) 48, finalByteArray0);
        
        assertEquals((byte) 48, finalByteArray1);
        
        assertEquals((byte) 48, finalByteArray2);
        
        assertEquals((byte) 48, finalByteArray3);
        
        assertEquals((byte) 48, finalByteArray4);
        
        assertEquals((byte) 48, finalByteArray5);
        
        assertEquals((byte) 49, finalByteArray6);
        
        assertEquals((byte) 32, finalByteArray7);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method formatLongOctalOrBinaryBytes(long, [B, int, int)
    
    @Test
    public void testFormatLongOctalOrBinaryBytes6() {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483646 out of bounds for length 10]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:393)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482) */
        TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray, 0, Integer.MIN_VALUE);
    }
    
    @Test
    public void testFormatLongOctalOrBinaryBytes7() {
        byte[] byteArray = new byte[31];
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 31]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:404)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482) */
        TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray, -2147483618, -2147483646);
    }
    
    @Test
    public void testFormatLongOctalOrBinaryBytes8() {
        byte[] byteArray = new byte[31];
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 31 out of bounds for length 31]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:452)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482) */
        TarUtils.formatLongOctalOrBinaryBytes(2L, byteArray, 30, 2);
    }
    
    @Test
    public void testFormatLongOctalOrBinaryBytes9() {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 1073741824 out of bounds for byte[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:527)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:488) */
        TarUtils.formatLongOctalOrBinaryBytes(144115196665790481L, byteArray, 0, 1073741824);
    }
    
    @Test
    public void testFormatLongOctalOrBinaryBytes10() {
        byte[] byteArray = new byte[18];
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 2147483649 out of bounds for byte[18]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:527)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:488) */
        TarUtils.formatLongOctalOrBinaryBytes(1103808692241L, byteArray, 2147483641, 8);
    }
    
    @Test
    public void testFormatLongOctalOrBinaryBytes11() {
        byte[] byteArray = {(byte) 0};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 2147483649 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:527)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:488) */
        TarUtils.formatLongOctalOrBinaryBytes(-2048L, byteArray, 2147483641, 8);
    }
    
    @Test
    public void testFormatLongOctalOrBinaryBytes12() {
        byte[] byteArray = {(byte) 0, (byte) 0, (byte) 0};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:510)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:486) */
        TarUtils.formatLongOctalOrBinaryBytes(-72057594037927935L, byteArray, -5, 8);
    }
    
    @Test
    public void testFormatLongOctalOrBinaryBytes13() {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 10]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:510)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:486) */
        TarUtils.formatLongOctalOrBinaryBytes(-3L, byteArray, -2, 3);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method formatLongOctalOrBinaryBytes(long, [B, int, int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes14() {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        TarUtils.formatLongOctalOrBinaryBytes(-262147L, byteArray, 1, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes15() {
        byte[] byteArray = new byte[31];
        
        TarUtils.formatLongOctalOrBinaryBytes(9L, byteArray, 30, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes16() {
        byte[] byteArray = new byte[17];
        
        TarUtils.formatLongOctalOrBinaryBytes(35192962023441L, byteArray, 1, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes17() {
        byte[] byteArray = {(byte) 0};
        
        TarUtils.formatLongOctalOrBinaryBytes(36028797018963968L, byteArray, 2147483641, 8);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatLongOctalBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalBytes(long,byte[],int,int)}
 * @utbot.returnsFrom {@code return offset + length;}
 *  */
    @Test
    public void testFormatLongOctalBytes_ReturnOffsetPlusLength() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        int actual = TarUtils.formatLongOctalBytes(0L, byteArray, 0, 2);
        
        assertEquals(2, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        
        assertEquals((byte) 48, finalByteArray0);
        
        assertEquals((byte) 32, finalByteArray1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalBytes(long,byte[],int,int)}
 * @utbot.returnsFrom {@code return offset + length;}
 *  */
    @Test
    public void testFormatLongOctalBytes_ReturnOffsetPlusLength_1() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        int actual = TarUtils.formatLongOctalBytes(1L, byteArray, 0, 2);
        
        assertEquals(2, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        
        assertEquals((byte) 49, finalByteArray0);
        
        assertEquals((byte) 32, finalByteArray1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatLongOctalBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test
    public void testFormatLongOctalBytes_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:388)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451) */
        TarUtils.formatLongOctalBytes(0L, byteArray, -63, 193);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test
    public void testFormatLongOctalBytes_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:393)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451) */
        TarUtils.formatLongOctalBytes(-255L, byteArray, -1, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + idx] = (byte) ' ';
 *  */
    @Test
    public void testFormatLongOctalBytes_ThrowArrayIndexOutOfBoundsException_2() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:452) */
        TarUtils.formatLongOctalBytes(0L, byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test
    public void testFormatLongOctalBytes_ThrowArrayIndexOutOfBoundsException_3() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:404)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451) */
        TarUtils.formatLongOctalBytes(0L, byteArray, -1, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + idx] = (byte) ' ';
 *  */
    @Test
    public void testFormatLongOctalBytes_ThrowArrayIndexOutOfBoundsException_4() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:452) */
        TarUtils.formatLongOctalBytes(0L, byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + idx] = (byte) ' ';
 *  */
    @Test
    public void testFormatLongOctalBytes_ThrowArrayIndexOutOfBoundsException_5() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:452) */
        TarUtils.formatLongOctalBytes(1L, byteArray, 0, 3);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method formatLongOctalBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalBytes_ThrowIllegalArgumentException_1() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        TarUtils.formatLongOctalBytes(-238L, byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalBytes_ThrowIllegalArgumentException() {
        TarUtils.formatLongOctalBytes(-255L, null, -255, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatCheckSumOctalBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatCheckSumOctalBytes(long,byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarUtils#formatUnsignedOctalString(long,byte[],int,int)}
 * @utbot.returnsFrom {@code return offset + length;}
 *  */
    @Test
    public void testFormatCheckSumOctalBytes_TarUtilsFormatUnsignedOctalString() {
        byte[] byteArray = new byte[12];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        
        int actual = TarUtils.formatCheckSumOctalBytes(0L, byteArray, 2, 3);
        
        assertEquals(5, actual);
        
        byte finalByteArray2 = byteArray[2];
        byte finalByteArray3 = byteArray[3];
        byte finalByteArray4 = byteArray[4];
        
        assertEquals((byte) 48, finalByteArray2);
        
        assertEquals((byte) 0, finalByteArray3);
        
        assertEquals((byte) 32, finalByteArray4);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method formatCheckSumOctalBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatCheckSumOctalBytes(long,byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarUtils#formatUnsignedOctalString(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatCheckSumOctalBytes_ThrowIllegalArgumentException() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatCheckSumOctalBytes(-248L, byteArray, 0, 3);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatCheckSumOctalBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatCheckSumOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + idx++] = 0;
 *  */
    @Test
    public void testFormatCheckSumOctalBytes_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:553) */
        TarUtils.formatCheckSumOctalBytes(0L, byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatCheckSumOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + idx] = (byte) ' ';
 *  */
    @Test
    public void testFormatCheckSumOctalBytes_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:554) */
        TarUtils.formatCheckSumOctalBytes(0L, byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatCheckSumOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + idx++] = 0;
 *  */
    @Test
    public void testFormatCheckSumOctalBytes_ThrowArrayIndexOutOfBoundsException_2() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:553) */
        TarUtils.formatCheckSumOctalBytes(1L, byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatCheckSumOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test
    public void testFormatCheckSumOctalBytes_ThrowArrayIndexOutOfBoundsException_3() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:404)
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:551) */
        TarUtils.formatCheckSumOctalBytes(1L, byteArray, -127, 130);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatCheckSumOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test
    public void testFormatCheckSumOctalBytes_ThrowArrayIndexOutOfBoundsException_4() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 256 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:393)
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:551) */
        TarUtils.formatCheckSumOctalBytes(1L, byteArray, 256, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatCheckSumOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test
    public void testFormatCheckSumOctalBytes_ThrowArrayIndexOutOfBoundsException_5() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:388)
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:551) */
        TarUtils.formatCheckSumOctalBytes(0L, byteArray, -63, 194);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatCheckSumOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + idx] = (byte) ' ';
 *  */
    @Test
    public void testFormatCheckSumOctalBytes_ThrowArrayIndexOutOfBoundsException_6() {
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:554) */
        TarUtils.formatCheckSumOctalBytes(0L, byteArray, 0, 4);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatCheckSumOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test
    public void testFormatCheckSumOctalBytes_ThrowArrayIndexOutOfBoundsException_7() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:404)
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:551) */
        TarUtils.formatCheckSumOctalBytes(0L, byteArray, -1, 4);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method formatCheckSumOctalBytes(long, [B, int, int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testFormatCheckSumOctalBytesByFuzzer() {
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, (byte) -1, (byte) 1};
        
        TarUtils.formatCheckSumOctalBytes(2L, byteArray, -2147483616, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseBinaryBigInteger([B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseBinaryBigInteger(byte[],int,int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(buffer, offset + 1, remainder, 0, length - 1);
 *  */
    @Test
    public void testParseBinaryBigInteger_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger(TarUtils.java:206) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = -1;
        parseBinaryBigIntegerMethodArguments[2] = 2;
        parseBinaryBigIntegerMethodArguments[3] = false;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseBinaryBigInteger(byte[],int,int,boolean)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: BigInteger val = new BigInteger(remainder);
 *  */
    @Test
    public void testParseBinaryBigInteger_ThrowNumberFormatException() throws Throwable  {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger] produces [java.lang.NumberFormatException: Zero length BigInteger]
            java.base/java.math.BigInteger.<init>(BigInteger.java:312)
            java.base/java.math.BigInteger.<init>(BigInteger.java:340)
            org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger(TarUtils.java:207) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = -1;
        parseBinaryBigIntegerMethodArguments[2] = 1;
        parseBinaryBigIntegerMethodArguments[3] = false;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseBinaryBigInteger(byte[],int,int,boolean)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final byte[] remainder = new byte[length - 1];
 *  */
    @Test
    public void testParseBinaryBigInteger_ThrowNegativeArraySizeException() throws Throwable  {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger(TarUtils.java:205) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) null);
        parseBinaryBigIntegerMethodArguments[1] = -255;
        parseBinaryBigIntegerMethodArguments[2] = 0;
        parseBinaryBigIntegerMethodArguments[3] = false;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseBinaryBigInteger(byte[],int,int,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(buffer, offset + 1, remainder, 0, length - 1);
 *  */
    @Test
    public void testParseBinaryBigInteger_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger(TarUtils.java:206) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) null);
        parseBinaryBigIntegerMethodArguments[1] = -255;
        parseBinaryBigIntegerMethodArguments[2] = 2;
        parseBinaryBigIntegerMethodArguments[3] = false;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method parseBinaryBigInteger([B, int, int, boolean)
    
    @Test(timeout = 1000L)
    public void testParseBinaryBigIntegerByFuzzer() throws Throwable  {
        byte[] byteArray = {(byte) 0, (byte) 1, java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 64};
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = -1;
        parseBinaryBigIntegerMethodArguments[2] = 1073741826;
        parseBinaryBigIntegerMethodArguments[3] = true;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parseBinaryBigInteger([B, int, int, boolean)
    
    @Test
    public void testParseBinaryBigInteger1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = new byte[20];
        byteArray[16] = (byte) -127;
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = 15;
        parseBinaryBigIntegerMethodArguments[2] = 2;
        parseBinaryBigIntegerMethodArguments[3] = true;
        long actual = ((Long) parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments));
        
        assertEquals(-127L, actual);
    }
    
    @Test
    public void testParseBinaryBigInteger2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = new byte[34];
        byteArray[0] = (byte) 2;
        byteArray[1] = (byte) 2;
        byteArray[2] = (byte) 2;
        byteArray[3] = (byte) 2;
        byteArray[4] = (byte) 2;
        byteArray[5] = (byte) 2;
        byteArray[6] = (byte) 2;
        byteArray[7] = (byte) 2;
        byteArray[8] = (byte) 2;
        byteArray[9] = (byte) 2;
        byteArray[10] = (byte) 2;
        byteArray[11] = (byte) 2;
        byteArray[12] = (byte) 2;
        byteArray[13] = (byte) 2;
        byteArray[14] = (byte) 2;
        byteArray[15] = (byte) 2;
        byteArray[16] = (byte) 2;
        byteArray[17] = (byte) 2;
        byteArray[18] = (byte) 2;
        byteArray[19] = (byte) 2;
        byteArray[20] = (byte) 2;
        byteArray[21] = (byte) 2;
        byteArray[22] = (byte) 2;
        byteArray[23] = (byte) 2;
        byteArray[24] = (byte) 2;
        byteArray[25] = (byte) 2;
        byteArray[26] = (byte) 2;
        byteArray[27] = (byte) 2;
        byteArray[28] = (byte) 2;
        byteArray[29] = (byte) 2;
        byteArray[30] = (byte) 2;
        byteArray[31] = (byte) 2;
        byteArray[32] = (byte) 2;
        byteArray[33] = (byte) 2;
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = 1;
        parseBinaryBigIntegerMethodArguments[2] = 2;
        parseBinaryBigIntegerMethodArguments[3] = false;
        long actual = ((Long) parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments));
        
        assertEquals(2L, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseBinaryBigInteger([B, int, int, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testParseBinaryBigInteger3() throws Throwable  {
        byte[] byteArray = new byte[33];
        byteArray[0] = (byte) -1;
        byteArray[1] = java.lang.Byte.MIN_VALUE;
        byteArray[2] = (byte) -1;
        byteArray[3] = (byte) -1;
        byteArray[4] = (byte) -1;
        byteArray[5] = (byte) -1;
        byteArray[6] = (byte) -1;
        byteArray[7] = (byte) -1;
        byteArray[8] = (byte) -1;
        byteArray[9] = (byte) -1;
        byteArray[10] = (byte) -1;
        byteArray[11] = (byte) -1;
        byteArray[12] = (byte) -1;
        byteArray[13] = (byte) -1;
        byteArray[14] = (byte) -1;
        byteArray[15] = (byte) -1;
        byteArray[16] = (byte) -1;
        byteArray[17] = (byte) -1;
        byteArray[18] = (byte) -1;
        byteArray[19] = (byte) -1;
        byteArray[20] = (byte) -1;
        byteArray[21] = (byte) -1;
        byteArray[22] = (byte) -1;
        byteArray[23] = (byte) -1;
        byteArray[24] = (byte) -1;
        byteArray[25] = (byte) -1;
        byteArray[26] = (byte) -1;
        byteArray[27] = (byte) -1;
        byteArray[28] = (byte) -1;
        byteArray[29] = (byte) -1;
        byteArray[30] = (byte) -1;
        byteArray[31] = (byte) -1;
        byteArray[32] = (byte) -1;
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = 0;
        parseBinaryBigIntegerMethodArguments[2] = 12;
        parseBinaryBigIntegerMethodArguments[3] = false;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseOctalOrBinary([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.returnsFrom {@code return parseOctal(buffer, offset, length);}
 *  */
    @Test
    public void testParseOctalOrBinary_OffsetOfBufferBitwiseAnd0x80EqualsZero() {
        byte[] byteArray = {(byte) -127, (byte) 0};
        
        long actual = TarUtils.parseOctalOrBinary(byteArray, 1, 2);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.returnsFrom {@code return parseBinaryLong(buffer, offset, length, negative);}
 *  */
    @Test
    public void testParseOctalOrBinary_BooleanNegativeInitializedByOffsetOfBufferNotEquals0xff() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        long actual = TarUtils.parseOctalOrBinary(byteArray, 0, 2);
        
        assertEquals(129L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.returnsFrom {@code return parseBinaryLong(buffer, offset, length, negative);}
 *  */
    @Test
    public void testParseOctalOrBinary_BooleanNegativeInitializedByOffsetOfBufferEquals0xff() {
        byte[] byteArray = {(byte) -127, (byte) -1};
        
        long actual = TarUtils.parseOctalOrBinary(byteArray, 1, 1);
        
        assertEquals(1L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.returnsFrom {@code return parseOctal(buffer, offset, length);}
 *  */
    @Test
    public void testParseOctalOrBinary_OffsetOfBufferBitwiseAnd0x80EqualsZero_1() {
        byte[] byteArray = {(byte) 49, (byte) 0};
        
        long actual = TarUtils.parseOctalOrBinary(byteArray, 0, 2);
        
        assertEquals(1L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.returnsFrom {@code return parseOctal(buffer, offset, length);}
 *  */
    @Test
    public void testParseOctalOrBinary_OffsetOfBufferBitwiseAnd0x80EqualsZero_2() {
        byte[] byteArray = {(byte) 32, (byte) 0};
        
        long actual = TarUtils.parseOctalOrBinary(byteArray, 0, 2);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseOctalOrBinary([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_ThrowIllegalArgumentException() {
        byte[] byteArray = {(byte) -127, (byte) 1};
        
        TarUtils.parseOctalOrBinary(byteArray, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_ThrowIllegalArgumentException_1() {
        byte[] byteArray = {(byte) 47, java.lang.Byte.MIN_VALUE};
        
        TarUtils.parseOctalOrBinary(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_ThrowIllegalArgumentException_2() {
        byte[] byteArray = {(byte) 57, (byte) -71};
        
        TarUtils.parseOctalOrBinary(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_ThrowIllegalArgumentException_3() {
        byte[] byteArray = {(byte) 47, (byte) 32};
        
        TarUtils.parseOctalOrBinary(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_ThrowIllegalArgumentException_4() {
        byte[] byteArray = {(byte) 47, (byte) 0};
        
        TarUtils.parseOctalOrBinary(byteArray, 0, 2);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseOctalOrBinary([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: (buffer[offset] & 0x80) == 0
 *  */
    @Test
    public void testParseOctalOrBinary_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(TarUtils.java:170) */
        TarUtils.parseOctalOrBinary(byteArray, 129, -255);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return parseOctal(buffer, offset, length);
 *  */
    @Test
    public void testParseOctalOrBinary_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = new byte[40];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        byteArray[15] = (byte) -127;
        byteArray[16] = (byte) 1;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -127;
        byteArray[20] = (byte) -127;
        byteArray[21] = (byte) -127;
        byteArray[22] = (byte) -127;
        byteArray[23] = (byte) -127;
        byteArray[24] = (byte) -127;
        byteArray[25] = (byte) -127;
        byteArray[26] = (byte) -127;
        byteArray[27] = (byte) -127;
        byteArray[28] = (byte) -127;
        byteArray[29] = (byte) -127;
        byteArray[30] = (byte) -127;
        byteArray[31] = (byte) -127;
        byteArray[32] = (byte) -127;
        byteArray[33] = (byte) -127;
        byteArray[34] = (byte) -127;
        byteArray[35] = (byte) -127;
        byteArray[36] = (byte) -127;
        byteArray[37] = (byte) -127;
        byteArray[38] = (byte) -127;
        byteArray[39] = (byte) -127;
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483647 out of bounds for length 40]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:130)
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(TarUtils.java:171) */
        TarUtils.parseOctalOrBinary(byteArray, 16, 2147483632);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return parseOctal(buffer, offset, length);
 *  */
    @Test
    public void testParseOctalOrBinary_ThrowArrayIndexOutOfBoundsException_2() {
        byte[] byteArray = {(byte) 32};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:119)
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(TarUtils.java:171) */
        TarUtils.parseOctalOrBinary(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarUtils#parseBinaryLong(byte[],int,int,boolean)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return parseBinaryLong(buffer, offset, length, negative);
 *  */
    @Test
    public void testParseOctalOrBinary_ThrowArrayIndexOutOfBoundsException_3() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryLong(TarUtils.java:191)
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(TarUtils.java:175) */
        TarUtils.parseOctalOrBinary(byteArray, 0, 4);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): False}
 * @utbot.executesCondition {@code (length < 9): False}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarUtils#parseBinaryBigInteger(byte[],int,int,boolean)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return parseBinaryBigInteger(buffer, offset, length, negative);
 *  */
    @Test
    public void testParseOctalOrBinary_ThrowArrayIndexOutOfBoundsException_4() {
        byte[] byteArray = new byte[40];
        byteArray[0] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        byteArray[15] = (byte) -127;
        byteArray[16] = (byte) -127;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -127;
        byteArray[20] = (byte) -127;
        byteArray[21] = (byte) -127;
        byteArray[22] = (byte) -127;
        byteArray[23] = (byte) -127;
        byteArray[24] = (byte) -127;
        byteArray[25] = (byte) -127;
        byteArray[26] = (byte) -127;
        byteArray[27] = (byte) -127;
        byteArray[28] = (byte) -127;
        byteArray[29] = (byte) -127;
        byteArray[30] = (byte) -127;
        byteArray[31] = (byte) -127;
        byteArray[32] = (byte) -127;
        byteArray[33] = java.lang.Byte.MIN_VALUE;
        byteArray[34] = (byte) -127;
        byteArray[35] = (byte) -127;
        byteArray[36] = (byte) -127;
        byteArray[37] = (byte) -127;
        byteArray[38] = (byte) -127;
        byteArray[39] = (byte) -127;
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 65 out of bounds for byte[40]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger(TarUtils.java:206)
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(TarUtils.java:177) */
        TarUtils.parseOctalOrBinary(byteArray, 33, 32);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (buffer[offset] & 0x80) == 0
 *  */
    @Test
    public void testParseOctalOrBinary_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(TarUtils.java:170) */
        TarUtils.parseOctalOrBinary(null, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatOctalBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatOctalBytes(long,byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarUtils#formatUnsignedOctalString(long,byte[],int,int)}
 * @utbot.returnsFrom {@code return offset + length;}
 *  */
    @Test
    public void testFormatOctalBytes_TarUtilsFormatUnsignedOctalString() {
        byte[] byteArray = new byte[12];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        
        int actual = TarUtils.formatOctalBytes(0L, byteArray, 2, 3);
        
        assertEquals(5, actual);
        
        byte finalByteArray2 = byteArray[2];
        byte finalByteArray3 = byteArray[3];
        byte finalByteArray4 = byteArray[4];
        
        assertEquals((byte) 48, finalByteArray2);
        
        assertEquals((byte) 32, finalByteArray3);
        
        assertEquals((byte) 0, finalByteArray4);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method formatOctalBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatOctalBytes(long,byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarUtils#formatUnsignedOctalString(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatOctalBytes_ThrowIllegalArgumentException() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatOctalBytes(-248L, byteArray, 0, 3);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatOctalBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test
    public void testFormatOctalBytes_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:388)
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:425) */
        TarUtils.formatOctalBytes(0L, byteArray, -63, 194);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + idx++] = (byte) ' ';
 *  */
    @Test
    public void testFormatOctalBytes_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:427) */
        TarUtils.formatOctalBytes(0L, byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + idx] = 0;
 *  */
    @Test
    public void testFormatOctalBytes_ThrowArrayIndexOutOfBoundsException_2() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:428) */
        TarUtils.formatOctalBytes(0L, byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + idx++] = (byte) ' ';
 *  */
    @Test
    public void testFormatOctalBytes_ThrowArrayIndexOutOfBoundsException_3() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:427) */
        TarUtils.formatOctalBytes(1L, byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test
    public void testFormatOctalBytes_ThrowArrayIndexOutOfBoundsException_4() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:404)
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:425) */
        TarUtils.formatOctalBytes(1L, byteArray, -127, 130);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test
    public void testFormatOctalBytes_ThrowArrayIndexOutOfBoundsException_5() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 256 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:393)
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:425) */
        TarUtils.formatOctalBytes(1L, byteArray, 256, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + idx] = 0;
 *  */
    @Test
    public void testFormatOctalBytes_ThrowArrayIndexOutOfBoundsException_6() {
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:428) */
        TarUtils.formatOctalBytes(0L, byteArray, 0, 4);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test
    public void testFormatOctalBytes_ThrowArrayIndexOutOfBoundsException_7() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:404)
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:425) */
        TarUtils.formatOctalBytes(0L, byteArray, -1, 4);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method formatOctalBytes(long, [B, int, int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testFormatOctalBytesByFuzzer() {
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, (byte) -1, (byte) 1};
        
        TarUtils.formatOctalBytes(2L, byteArray, Integer.MIN_VALUE, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatLongBinary(long, [B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongBinary(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (negative): True}
 *  */
    @Test
    public void testFormatLongBinary_Negative() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method formatLongBinaryMethod = tarUtilsClazz.getDeclaredMethod("formatLongBinary", longType, byteArrayType, intType, intType, booleanType);
        formatLongBinaryMethod.setAccessible(true);
        java.lang.Object[] formatLongBinaryMethodArguments = new java.lang.Object[5];
        formatLongBinaryMethodArguments[0] = -2L;
        formatLongBinaryMethodArguments[1] = ((Object) null);
        formatLongBinaryMethodArguments[2] = -255;
        formatLongBinaryMethodArguments[3] = 0;
        formatLongBinaryMethodArguments[4] = true;
        formatLongBinaryMethod.invoke(null, formatLongBinaryMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongBinary(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (negative): False}
 *  */
    @Test
    public void testFormatLongBinary_NotNegative() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method formatLongBinaryMethod = tarUtilsClazz.getDeclaredMethod("formatLongBinary", longType, byteArrayType, intType, intType, booleanType);
        formatLongBinaryMethod.setAccessible(true);
        java.lang.Object[] formatLongBinaryMethodArguments = new java.lang.Object[5];
        formatLongBinaryMethodArguments[0] = -2L;
        formatLongBinaryMethodArguments[1] = ((Object) null);
        formatLongBinaryMethodArguments[2] = -255;
        formatLongBinaryMethodArguments[3] = 0;
        formatLongBinaryMethodArguments[4] = false;
        formatLongBinaryMethod.invoke(null, formatLongBinaryMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatLongBinary(long, [B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongBinary(long,byte[],int,int,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = offset + length - 1; i >= offset; i--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[i] = (byte) val;
 *  */
    @Test
    public void testFormatLongBinary_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary] produces [java.lang.ArrayIndexOutOfBoundsException: Index -6 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:510) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method formatLongBinaryMethod = tarUtilsClazz.getDeclaredMethod("formatLongBinary", longType, byteArrayType, intType, intType, booleanType);
        formatLongBinaryMethod.setAccessible(true);
        java.lang.Object[] formatLongBinaryMethodArguments = new java.lang.Object[5];
        formatLongBinaryMethodArguments[0] = -98L;
        formatLongBinaryMethodArguments[1] = ((Object) byteArray);
        formatLongBinaryMethodArguments[2] = -9;
        formatLongBinaryMethodArguments[3] = 4;
        formatLongBinaryMethodArguments[4] = true;
        try {
            formatLongBinaryMethod.invoke(null, formatLongBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongBinary(long,byte[],int,int,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = offset + length - 1; i >= offset; i--)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[i] = (byte) val;
 *  */
    @Test
    public void testFormatLongBinary_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:510) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method formatLongBinaryMethod = tarUtilsClazz.getDeclaredMethod("formatLongBinary", longType, byteArrayType, intType, intType, booleanType);
        formatLongBinaryMethod.setAccessible(true);
        java.lang.Object[] formatLongBinaryMethodArguments = new java.lang.Object[5];
        formatLongBinaryMethodArguments[0] = -2L;
        formatLongBinaryMethodArguments[1] = ((Object) byteArray);
        formatLongBinaryMethodArguments[2] = -17;
        formatLongBinaryMethodArguments[3] = 18;
        formatLongBinaryMethodArguments[4] = true;
        try {
            formatLongBinaryMethod.invoke(null, formatLongBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongBinary(long,byte[],int,int,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = offset + length - 1; i >= offset; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buf[i] = (byte) val;
 *  */
    @Test
    public void testFormatLongBinary_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:510) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method formatLongBinaryMethod = tarUtilsClazz.getDeclaredMethod("formatLongBinary", longType, byteArrayType, intType, intType, booleanType);
        formatLongBinaryMethod.setAccessible(true);
        java.lang.Object[] formatLongBinaryMethodArguments = new java.lang.Object[5];
        formatLongBinaryMethodArguments[0] = -68679121011653890L;
        formatLongBinaryMethodArguments[1] = ((Object) null);
        formatLongBinaryMethodArguments[2] = 3;
        formatLongBinaryMethodArguments[3] = 16;
        formatLongBinaryMethodArguments[4] = true;
        try {
            formatLongBinaryMethod.invoke(null, formatLongBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method formatLongBinary(long, [B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongBinary(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (val < 0): False}
 * @utbot.executesCondition {@code (val >= max): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: val < 0 || val >= max
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongBinary_ThrowIllegalArgumentException() throws Throwable  {
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method formatLongBinaryMethod = tarUtilsClazz.getDeclaredMethod("formatLongBinary", longType, byteArrayType, intType, intType, booleanType);
        formatLongBinaryMethod.setAccessible(true);
        java.lang.Object[] formatLongBinaryMethodArguments = new java.lang.Object[5];
        formatLongBinaryMethodArguments[0] = -1L;
        formatLongBinaryMethodArguments[1] = ((Object) null);
        formatLongBinaryMethodArguments[2] = -255;
        formatLongBinaryMethodArguments[3] = -255;
        formatLongBinaryMethodArguments[4] = false;
        try {
            formatLongBinaryMethod.invoke(null, formatLongBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongBinary(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (val < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: val < 0 || val >= max
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongBinary_ThrowIllegalArgumentException_1() throws Throwable  {
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method formatLongBinaryMethod = tarUtilsClazz.getDeclaredMethod("formatLongBinary", longType, byteArrayType, intType, intType, booleanType);
        formatLongBinaryMethod.setAccessible(true);
        java.lang.Object[] formatLongBinaryMethodArguments = new java.lang.Object[5];
        formatLongBinaryMethodArguments[0] = java.lang.Long.MIN_VALUE;
        formatLongBinaryMethodArguments[1] = ((Object) null);
        formatLongBinaryMethodArguments[2] = -255;
        formatLongBinaryMethodArguments[3] = -255;
        formatLongBinaryMethodArguments[4] = false;
        try {
            formatLongBinaryMethod.invoke(null, formatLongBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseOctal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseOctal([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (buffer[start] == 0): True}
 * @utbot.returnsFrom {@code return 0L;}
 *  */
    @Test
    public void testParseOctal_StartOfBufferEqualsZero() {
        byte[] byteArray = {(byte) -127, (byte) 0};
        
        long actual = TarUtils.parseOctal(byteArray, 1, 2);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (buffer[start] == 0): False}
 * @utbot.iterates iterate the loop {@code while(start < end)} twice
 * @utbot.iterates iterate the loop {@code while(start < end && (trailer == 0 || trailer == ' '))} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testParseOctal_StartGreaterOrEqualEndAndTrailerEqualsZeroOrTrailerEqualsChar() {
        byte[] byteArray = {(byte) 32, (byte) 0};
        
        long actual = TarUtils.parseOctal(byteArray, 0, 2);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (buffer[start] == 0): False}
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.iterates iterate the loop {@code while(start < end && (trailer == 0 || trailer == ' '))} once
 * @utbot.iterates iterate the loop {@code for(; start < end; start++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testParseOctal_CurrentByteLessOrEqual7() {
        byte[] byteArray = {(byte) 49, (byte) 32};
        
        long actual = TarUtils.parseOctal(byteArray, 0, 2);
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseOctal([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[start] == 0
 *  */
    @Test
    public void testParseOctal_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:113) */
        TarUtils.parseOctal(byteArray, -256, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (buffer[start] == 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: byte trailer = buffer[end - 1];
 *  */
    @Test
    public void testParseOctal_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = new byte[36];
        byteArray[0] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        byteArray[15] = (byte) -127;
        byteArray[16] = (byte) -127;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -127;
        byteArray[20] = (byte) -127;
        byteArray[21] = (byte) -127;
        byteArray[22] = (byte) -127;
        byteArray[23] = (byte) -127;
        byteArray[24] = (byte) -127;
        byteArray[25] = (byte) -127;
        byteArray[26] = (byte) -127;
        byteArray[27] = (byte) -127;
        byteArray[28] = (byte) -127;
        byteArray[29] = (byte) -127;
        byteArray[30] = (byte) -127;
        byteArray[31] = (byte) -127;
        byteArray[32] = (byte) -127;
        byteArray[35] = (byte) -127;
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 36]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:130) */
        TarUtils.parseOctal(byteArray, 32, 2147483617);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (buffer[start] == 0): False}
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: byte trailer = buffer[end - 1];
 *  */
    @Test
    public void testParseOctal_ThrowArrayIndexOutOfBoundsException_2() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:130) */
        TarUtils.parseOctal(byteArray, 1, 129);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (buffer[start] == 0): False}
 * @utbot.iterates iterate the loop {@code while(start < end)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: byte trailer = buffer[end - 1];
 *  */
    @Test
    public void testParseOctal_ThrowArrayIndexOutOfBoundsException_3() {
        byte[] byteArray = new byte[36];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        byteArray[15] = (byte) -127;
        byteArray[16] = (byte) -127;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -127;
        byteArray[20] = (byte) -127;
        byteArray[21] = (byte) -127;
        byteArray[22] = (byte) -127;
        byteArray[23] = (byte) -127;
        byteArray[24] = (byte) -127;
        byteArray[25] = (byte) -127;
        byteArray[26] = (byte) -127;
        byteArray[27] = (byte) -127;
        byteArray[28] = (byte) -127;
        byteArray[29] = (byte) -127;
        byteArray[30] = (byte) 32;
        byteArray[31] = (byte) -127;
        byteArray[32] = (byte) -127;
        byteArray[33] = (byte) -127;
        byteArray[34] = (byte) -127;
        byteArray[35] = (byte) -127;
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 49 out of bounds for length 36]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:130) */
        TarUtils.parseOctal(byteArray, 30, 20);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (buffer[start] == 0): False}
 * @utbot.iterates iterate the loop {@code while(start < end)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[start] == ' '
 *  */
    @Test
    public void testParseOctal_ThrowArrayIndexOutOfBoundsException_4() {
        byte[] byteArray = {(byte) 32};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:119) */
        TarUtils.parseOctal(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: buffer[start] == 0
 *  */
    @Test
    public void testParseOctal_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:113) */
        TarUtils.parseOctal(null, -255, 2);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseOctal([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (length < 2): False}
 * @utbot.executesCondition {@code (buffer[start] == 0): False}
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.iterates iterate the loop {@code for(; start < end; start++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: exceptionMessage(buffer, offset, length, start, currentByte)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_ThrowIllegalArgumentException_1() {
        byte[] byteArray = {(byte) 47, java.lang.Byte.MIN_VALUE};
        
        TarUtils.parseOctal(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (length < 2): False}
 * @utbot.executesCondition {@code (buffer[start] == 0): False}
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.iterates iterate the loop {@code for(; start < end; start++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: exceptionMessage(buffer, offset, length, start, currentByte)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_ThrowIllegalArgumentException_2() {
        byte[] byteArray = {(byte) 57, (byte) 57};
        
        TarUtils.parseOctal(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (length < 2): False}
 * @utbot.executesCondition {@code (buffer[start] == 0): False}
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.iterates iterate the loop {@code while(start < end && (trailer == 0 || trailer == ' '))} once
 * @utbot.iterates iterate the loop {@code for(; start < end; start++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: exceptionMessage(buffer, offset, length, start, currentByte)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_ThrowIllegalArgumentException_3() {
        byte[] byteArray = {(byte) 47, (byte) 32};
        
        TarUtils.parseOctal(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (length < 2): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: length < 2
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_ThrowIllegalArgumentException() {
        TarUtils.parseOctal(null, -255, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseBinaryLong([B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseBinaryLong(byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (negative): False}
 * @utbot.executesCondition {@code (negative): False}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < length; i++)} once
 * @utbot.returnsFrom {@code return negative ? -val : val;}
 *  */
    @Test
    public void testParseBinaryLong_NotNegative_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {(byte) -127};
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryLongMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryLong", byteArrayType, intType, intType, booleanType);
        parseBinaryLongMethod.setAccessible(true);
        java.lang.Object[] parseBinaryLongMethodArguments = new java.lang.Object[4];
        parseBinaryLongMethodArguments[0] = ((Object) byteArray);
        parseBinaryLongMethodArguments[1] = -1;
        parseBinaryLongMethodArguments[2] = 2;
        parseBinaryLongMethodArguments[3] = false;
        long actual = ((Long) parseBinaryLongMethod.invoke(null, parseBinaryLongMethodArguments));
        
        assertEquals(129L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseBinaryLong(byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (negative): True}
 * @utbot.executesCondition {@code (negative): True}
 * @utbot.invokes {@link java.lang.Math#pow(double,double)}
 * @utbot.returnsFrom {@code return negative ? -val : val;}
 *  */
    @Test
    public void testParseBinaryLong_Negative() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryLongMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryLong", byteArrayType, intType, intType, booleanType);
        parseBinaryLongMethod.setAccessible(true);
        java.lang.Object[] parseBinaryLongMethodArguments = new java.lang.Object[4];
        parseBinaryLongMethodArguments[0] = ((Object) null);
        parseBinaryLongMethodArguments[1] = -255;
        parseBinaryLongMethodArguments[2] = 1;
        parseBinaryLongMethodArguments[3] = true;
        long actual = ((Long) parseBinaryLongMethod.invoke(null, parseBinaryLongMethodArguments));
        
        assertEquals(1L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseBinaryLong(byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (negative): False}
 * @utbot.executesCondition {@code (negative): False}
 * @utbot.returnsFrom {@code return negative ? -val : val;}
 *  */
    @Test
    public void testParseBinaryLong_NotNegative() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryLongMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryLong", byteArrayType, intType, intType, booleanType);
        parseBinaryLongMethod.setAccessible(true);
        java.lang.Object[] parseBinaryLongMethodArguments = new java.lang.Object[4];
        parseBinaryLongMethodArguments[0] = ((Object) null);
        parseBinaryLongMethodArguments[1] = -255;
        parseBinaryLongMethodArguments[2] = 0;
        parseBinaryLongMethodArguments[3] = false;
        long actual = ((Long) parseBinaryLongMethod.invoke(null, parseBinaryLongMethodArguments));
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseBinaryLong([B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseBinaryLong(byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length >= 9): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: length >= 9
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseBinaryLong_ThrowIllegalArgumentException() throws Throwable  {
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryLongMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryLong", byteArrayType, intType, intType, booleanType);
        parseBinaryLongMethod.setAccessible(true);
        java.lang.Object[] parseBinaryLongMethodArguments = new java.lang.Object[4];
        parseBinaryLongMethodArguments[0] = ((Object) null);
        parseBinaryLongMethodArguments[1] = -255;
        parseBinaryLongMethodArguments[2] = 9;
        parseBinaryLongMethodArguments[3] = false;
        try {
            parseBinaryLongMethod.invoke(null, parseBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseBinaryLong([B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseBinaryLong(byte[],int,int,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: val = (val << 8) + (buffer[offset + i] & 0xff);
 *  */
    @Test
    public void testParseBinaryLong_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryLong(TarUtils.java:191) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryLongMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryLong", byteArrayType, intType, intType, booleanType);
        parseBinaryLongMethod.setAccessible(true);
        java.lang.Object[] parseBinaryLongMethodArguments = new java.lang.Object[4];
        parseBinaryLongMethodArguments[0] = ((Object) byteArray);
        parseBinaryLongMethodArguments[1] = -3;
        parseBinaryLongMethodArguments[2] = 4;
        parseBinaryLongMethodArguments[3] = false;
        try {
            parseBinaryLongMethod.invoke(null, parseBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseBinaryLong(byte[],int,int,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: val = (val << 8) + (buffer[offset + i] & 0xff);
 *  */
    @Test
    public void testParseBinaryLong_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryLong] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryLong(TarUtils.java:191) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryLongMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryLong", byteArrayType, intType, intType, booleanType);
        parseBinaryLongMethod.setAccessible(true);
        java.lang.Object[] parseBinaryLongMethodArguments = new java.lang.Object[4];
        parseBinaryLongMethodArguments[0] = ((Object) null);
        parseBinaryLongMethodArguments[1] = -255;
        parseBinaryLongMethodArguments[2] = 4;
        parseBinaryLongMethodArguments[3] = false;
        try {
            parseBinaryLongMethod.invoke(null, parseBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parseBinaryLong([B, int, int, boolean)
    
    @Test
    public void testParseBinaryLong1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = new byte[39];
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryLongMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryLong", byteArrayType, intType, intType, booleanType);
        parseBinaryLongMethod.setAccessible(true);
        java.lang.Object[] parseBinaryLongMethodArguments = new java.lang.Object[4];
        parseBinaryLongMethodArguments[0] = ((Object) byteArray);
        parseBinaryLongMethodArguments[1] = 37;
        parseBinaryLongMethodArguments[2] = 2;
        parseBinaryLongMethodArguments[3] = true;
        long actual = ((Long) parseBinaryLongMethod.invoke(null, parseBinaryLongMethodArguments));
        
        assertEquals(256L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseBinaryLong([B, int, int, boolean)
    
    @Test
    public void testParseBinaryLong2() throws Throwable  {
        byte[] byteArray = new byte[39];
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryLong(TarUtils.java:191) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryLongMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryLong", byteArrayType, intType, intType, booleanType);
        parseBinaryLongMethod.setAccessible(true);
        java.lang.Object[] parseBinaryLongMethodArguments = new java.lang.Object[4];
        parseBinaryLongMethodArguments[0] = ((Object) byteArray);
        parseBinaryLongMethodArguments[1] = 37;
        parseBinaryLongMethodArguments[2] = 4;
        parseBinaryLongMethodArguments[3] = false;
        try {
            parseBinaryLongMethod.invoke(null, parseBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verifyCheckSum([B)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#verifyCheckSum(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long storedSum = parseOctal(header, CHKSUM_OFFSET, CHKSUMLEN);
 *  */
    @Test
    public void testVerifyCheckSum_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum] produces [java.lang.ArrayIndexOutOfBoundsException: Index 148 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:113)
            org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(TarUtils.java:601) */
        TarUtils.verifyCheckSum(byteArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatNameBytes(java.lang.String, [B, int, int, org.apache.commons.compress.archivers.zip.ZipEncoding)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatNameBytes(java.lang.String,byte[],int,int,org.apache.commons.compress.archivers.zip.ZipEncoding)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ByteBuffer b = encoding.encode(name);
 *  */
    @Test
    public void testFormatNameBytes_ThrowNullPointerException() throws IOException  {
        String string = " ";
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:359) */
        TarUtils.formatNameBytes(string, null, -255, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatNameBytes(java.lang.String,byte[],int,int,org.apache.commons.compress.archivers.zip.ZipEncoding)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int len = name.length();
 *  */
    @Test
    public void testFormatNameBytes_ThrowNullPointerException_1() throws IOException  {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:358) */
        TarUtils.formatNameBytes(null, null, -255, -255, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method formatNameBytes(java.lang.String, [B, int, int, org.apache.commons.compress.archivers.zip.ZipEncoding)
    
    @Test
    public void testFormatNameBytes1() throws Exception  {
        String string = "";
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        Object fallbackZipEncoding = createInstance("org.apache.commons.compress.archivers.zip.FallbackZipEncoding");
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class stringType = Class.forName("java.lang.String");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class fallbackZipEncodingType = Class.forName("org.apache.commons.compress.archivers.zip.ZipEncoding");
        Method formatNameBytesMethod = tarUtilsClazz.getDeclaredMethod("formatNameBytes", stringType, byteArrayType, intType, intType, fallbackZipEncodingType);
        formatNameBytesMethod.setAccessible(true);
        java.lang.Object[] formatNameBytesMethodArguments = new java.lang.Object[5];
        formatNameBytesMethodArguments[0] = string;
        formatNameBytesMethodArguments[1] = ((Object) byteArray);
        formatNameBytesMethodArguments[2] = 0;
        formatNameBytesMethodArguments[3] = 0;
        formatNameBytesMethodArguments[4] = fallbackZipEncoding;
        int actual = ((Integer) formatNameBytesMethod.invoke(null, formatNameBytesMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method formatNameBytes(java.lang.String, [B, int, int, org.apache.commons.compress.archivers.zip.ZipEncoding)
    
    @Test(expected = UnsupportedEncodingException.class)
    public void testFormatNameBytes2() throws Throwable  {
        String string = "";
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        Object fallbackZipEncoding = createInstance("org.apache.commons.compress.archivers.zip.FallbackZipEncoding");
        String charsetName = "";
        setField(fallbackZipEncoding, "org.apache.commons.compress.archivers.zip.FallbackZipEncoding", "charsetName", charsetName);
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class stringType = Class.forName("java.lang.String");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class fallbackZipEncodingType = Class.forName("org.apache.commons.compress.archivers.zip.ZipEncoding");
        Method formatNameBytesMethod = tarUtilsClazz.getDeclaredMethod("formatNameBytes", stringType, byteArrayType, intType, intType, fallbackZipEncodingType);
        formatNameBytesMethod.setAccessible(true);
        java.lang.Object[] formatNameBytesMethodArguments = new java.lang.Object[5];
        formatNameBytesMethodArguments[0] = string;
        formatNameBytesMethodArguments[1] = ((Object) byteArray);
        formatNameBytesMethodArguments[2] = 0;
        formatNameBytesMethodArguments[3] = 0;
        formatNameBytesMethodArguments[4] = fallbackZipEncoding;
        try {
            formatNameBytesMethod.invoke(null, formatNameBytesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes
    
    ///region FUZZER: ERROR SUITE for method formatNameBytes(java.lang.String, [B, int, int)
    
    @Test
    public void testFormatNameBytesByFuzzer() {
        byte[] byteArray = {(byte) -1, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[3]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:364)
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:324) */
        TarUtils.formatNameBytes("\n\t\r", byteArray, -1, 1);
    }
    
    @Test
    public void testFormatNameBytesByFuzzer1() {
        byte[] byteArray = {java.lang.Byte.MAX_VALUE, java.lang.Byte.MIN_VALUE, (byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[5]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:364)
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:324) */
        TarUtils.formatNameBytes("", byteArray, -1, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method computeCheckSum([B)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#computeCheckSum(byte[])}
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testComputeCheckSum_ReturnSum() {
        byte[] byteArray = {};
        
        long actual = TarUtils.computeCheckSum(byteArray);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#computeCheckSum(byte[])}
 * @utbot.iterates iterate the loop {@code for(final byte element: buf)} once
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testComputeCheckSum_IterateForEachLoop() {
        byte[] byteArray = {(byte) -127};
        
        long actual = TarUtils.computeCheckSum(byteArray);
        
        assertEquals(129L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeCheckSum([B)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#computeCheckSum(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final byte element: buf)
 *  */
    @Test
    public void testComputeCheckSum_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(TarUtils.java:568) */
        TarUtils.computeCheckSum(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method computeCheckSum([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#computeCheckSum(byte[])}
     */
    @Test
    public void testComputeCheckSumReturns384WithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        long actual = TarUtils.computeCheckSum(byteArray);
        
        assertEquals(384L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#computeCheckSum(byte[])}
     */
    @Test
    public void testComputeCheckSumReturns127WithNonEmptyPrimitiveArray() {
        byte[] byteArray = {java.lang.Byte.MAX_VALUE, (byte) 0};
        
        long actual = TarUtils.computeCheckSum(byteArray);
        
        assertEquals(127L, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields977263339277500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields977263339277500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass977263339282700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields977263339277500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass977263339282700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

