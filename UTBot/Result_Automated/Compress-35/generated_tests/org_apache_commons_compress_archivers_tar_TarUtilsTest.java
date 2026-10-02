package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_compress_archivers_tar_TarUtilsTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatBigIntegerBinary(long, [B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatBigIntegerBinary(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (negative): False}
 * @utbot.invokes {@link java.math.BigInteger#toByteArray()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset + 1; i < off; i++)} once
 *  */
    @Test
    public void testFormatBigIntegerBinary_NotNegative() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = new byte[34];
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
        byteArray[30] = (byte) -127;
        byteArray[31] = (byte) -127;
        byteArray[32] = (byte) -127;
        byteArray[33] = (byte) -127;
        
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
        formatBigIntegerBinaryMethodArguments[2] = 32;
        formatBigIntegerBinaryMethodArguments[3] = 2;
        formatBigIntegerBinaryMethodArguments[4] = false;
        formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        
        byte finalByteArray33 = byteArray[33];
        
        assertEquals((byte) 0, finalByteArray33);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatBigIntegerBinary(long, [B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatBigIntegerBinary(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (negative): True}
 * @utbot.invokes {@link java.math.BigInteger#toByteArray()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset + 1; i < off; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[i] = fill;
 *  */
    @Test
    public void testFormatBigIntegerBinary_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:520) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method formatBigIntegerBinaryMethod = tarUtilsClazz.getDeclaredMethod("formatBigIntegerBinary", longType, byteArrayType, intType, intType, booleanType);
        formatBigIntegerBinaryMethod.setAccessible(true);
        java.lang.Object[] formatBigIntegerBinaryMethodArguments = new java.lang.Object[5];
        formatBigIntegerBinaryMethodArguments[0] = 16L;
        formatBigIntegerBinaryMethodArguments[1] = ((Object) byteArray);
        formatBigIntegerBinaryMethodArguments[2] = -2;
        formatBigIntegerBinaryMethodArguments[3] = 2;
        formatBigIntegerBinaryMethodArguments[4] = true;
        try {
            formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatBigIntegerBinary(long,byte[],int,int,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final byte[] b = val.toByteArray();
 *  */
    @Test
    public void testFormatBigIntegerBinary_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:520) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method formatBigIntegerBinaryMethod = tarUtilsClazz.getDeclaredMethod("formatBigIntegerBinary", longType, byteArrayType, intType, intType, booleanType);
        formatBigIntegerBinaryMethod.setAccessible(true);
        java.lang.Object[] formatBigIntegerBinaryMethodArguments = new java.lang.Object[5];
        formatBigIntegerBinaryMethodArguments[0] = 16L;
        formatBigIntegerBinaryMethodArguments[1] = ((Object) null);
        formatBigIntegerBinaryMethodArguments[2] = -255;
        formatBigIntegerBinaryMethodArguments[3] = -255;
        formatBigIntegerBinaryMethodArguments[4] = false;
        try {
            formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method formatBigIntegerBinary(long, [B, int, int, boolean)
    
    @Test
    public void testFormatBigIntegerBinaryByFuzzer() throws Throwable  {
        byte[] byteArray = {(byte) -1, (byte) -1, (byte) 1};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 256 out of bounds for byte[3]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:520) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method formatBigIntegerBinaryMethod = tarUtilsClazz.getDeclaredMethod("formatBigIntegerBinary", longType, byteArrayType, intType, intType, booleanType);
        formatBigIntegerBinaryMethod.setAccessible(true);
        java.lang.Object[] formatBigIntegerBinaryMethodArguments = new java.lang.Object[5];
        formatBigIntegerBinaryMethodArguments[0] = 255L;
        formatBigIntegerBinaryMethodArguments[1] = ((Object) byteArray);
        formatBigIntegerBinaryMethodArguments[2] = 255;
        formatBigIntegerBinaryMethodArguments[3] = 1;
        formatBigIntegerBinaryMethodArguments[4] = true;
        try {
            formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method formatBigIntegerBinary(long, [B, int, int, boolean)
    
    @Test
    public void testFormatBigIntegerBinary1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method formatBigIntegerBinaryMethod = tarUtilsClazz.getDeclaredMethod("formatBigIntegerBinary", longType, byteArrayType, intType, intType, booleanType);
        formatBigIntegerBinaryMethod.setAccessible(true);
        java.lang.Object[] formatBigIntegerBinaryMethodArguments = new java.lang.Object[5];
        formatBigIntegerBinaryMethodArguments[0] = 8L;
        formatBigIntegerBinaryMethodArguments[1] = ((Object) byteArray);
        formatBigIntegerBinaryMethodArguments[2] = 0;
        formatBigIntegerBinaryMethodArguments[3] = 2;
        formatBigIntegerBinaryMethodArguments[4] = true;
        formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        
        byte finalByteArray1 = byteArray[1];
        
        assertEquals((byte) 8, finalByteArray1);
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
        byte[] byteArray = new byte[20];
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
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        TarUtils.formatCheckSumOctalBytes(32L, byteArray, 0, 3);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:546) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:547) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:546) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:401)
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:544) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:390)
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:544) */
        TarUtils.formatCheckSumOctalBytes(-255L, byteArray, 256, 3);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:385)
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:544) */
        TarUtils.formatCheckSumOctalBytes(0L, byteArray, -62, 193);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:547) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:401)
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:544) */
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
        TarUtils.formatUnsignedOctalString(1L, null, -255, 0);
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
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:390) */
        TarUtils.formatUnsignedOctalString(1L, byteArray, 1, 1);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:385) */
        TarUtils.formatUnsignedOctalString(0L, byteArray, 161, -32);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:401) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:401) */
        TarUtils.formatUnsignedOctalString(1L, byteArray, -66, 67);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:390) */
        TarUtils.formatUnsignedOctalString(1L, null, -255, 1);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:385) */
        TarUtils.formatUnsignedOctalString(0L, null, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatLongOctalOrBinaryBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalBytes(long,byte[],int,int)}
 * @utbot.returnsFrom {@code return formatLongOctalBytes(value, buf, offset, length);}
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ValueLessOrEqualMaxAsOctalChar() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        int actual = TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray, 0, 2);
        
        assertEquals(2, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        
        assertEquals((byte) 48, finalByteArray0);
        
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
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:390)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:448)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:479) */
        TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray, -2, 8);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:401)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:448)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:479) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:401)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:448)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:479) */
        TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray, -6, 8);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:385)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:448)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:479) */
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
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:449)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:479) */
        TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray, 0, 3);
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
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_5() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:449)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:479) */
        TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray, 0, 2);
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
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_6() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:507)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:483) */
        TarUtils.formatLongOctalOrBinaryBytes(274877907200L, byteArray, -5, 6);
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
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_7() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:507)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:483) */
        TarUtils.formatLongOctalOrBinaryBytes(4503599627371265L, byteArray, -3, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_8() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:507)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:483) */
        TarUtils.formatLongOctalOrBinaryBytes(-256L, byteArray, -7, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_9() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:507)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:483) */
        TarUtils.formatLongOctalOrBinaryBytes(-256L, byteArray, -2, 3);
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
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_10() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:520)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:485) */
        TarUtils.formatLongOctalOrBinaryBytes(-16L, byteArray, -26, 26);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:507)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:483) */
        TarUtils.formatLongOctalOrBinaryBytes(274877907200L, null, 58, 6);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:507)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:483) */
        TarUtils.formatLongOctalOrBinaryBytes(4195073L, null, -6, 8);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:507)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:483) */
        TarUtils.formatLongOctalOrBinaryBytes(-255L, null, -6, 8);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:520)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:485) */
        TarUtils.formatLongOctalOrBinaryBytes(-16L, null, 2147483644, 8);
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
    public void testFormatLongOctalOrBinaryBytes_ThrowNullPointerException_4() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:520)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:485) */
        TarUtils.formatLongOctalOrBinaryBytes(-16L, null, -255, 9);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method formatLongOctalOrBinaryBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.executesCondition {@code (length < 9): True}
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
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowIllegalArgumentException_1() {
        TarUtils.formatLongOctalOrBinaryBytes(72057594037927936L, null, -255, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowIllegalArgumentException_2() {
        TarUtils.formatLongOctalOrBinaryBytes(-72057594037927939L, null, -255, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowIllegalArgumentException_3() {
        TarUtils.formatLongOctalOrBinaryBytes(8589934624L, null, -254, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return formatLongOctalBytes(value, buf, offset, length);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowIllegalArgumentException_4() {
        TarUtils.formatLongOctalOrBinaryBytes(1L, null, -255, 1);
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger(TarUtils.java:203) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger(TarUtils.java:204) */
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
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] remainder = new byte[length - 1];
 *  */
    @Test
    public void testParseBinaryBigInteger_ThrowNegativeArraySizeException() throws Throwable  {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger] produces [java.lang.NegativeArraySizeException: -255]
            org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger(TarUtils.java:202) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) null);
        parseBinaryBigIntegerMethodArguments[1] = -255;
        parseBinaryBigIntegerMethodArguments[2] = -254;
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger(TarUtils.java:203) */
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parseBinaryBigInteger([B, int, int, boolean)
    
    @Test
    public void testParseBinaryBigInteger1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = new byte[34];
        
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
        parseBinaryBigIntegerMethodArguments[3] = true;
        long actual = ((Long) parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments));
        
        assertEquals(0L, actual);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:385)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:448) */
        TarUtils.formatLongOctalBytes(0L, byteArray, 194, -64);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:390)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:448) */
        TarUtils.formatLongOctalBytes(1L, byteArray, -1, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + idx] = (byte) ' ';
 *  */
    @Test
    public void testFormatLongOctalBytes_ThrowArrayIndexOutOfBoundsException_2() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:449) */
        TarUtils.formatLongOctalBytes(0L, byteArray, 1, 2);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:401)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:448) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:449) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:449) */
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
        
        TarUtils.formatLongOctalBytes(8L, byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalBytes_ThrowIllegalArgumentException() {
        TarUtils.formatLongOctalBytes(1L, null, -255, 1);
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
        
        TarUtils.formatOctalBytes(9L, byteArray, 0, 3);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:385)
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:422) */
        TarUtils.formatOctalBytes(0L, byteArray, 193, -62);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:424) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:425) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:424) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:401)
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:422) */
        TarUtils.formatOctalBytes(1L, byteArray, -127, 130);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test
    public void testFormatOctalBytes_ThrowArrayIndexOutOfBoundsException_5() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:390)
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:422) */
        TarUtils.formatOctalBytes(-255L, byteArray, 0, 3);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:425) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:401)
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:422) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:110) */
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
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 36]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:127) */
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
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:127) */
        TarUtils.parseOctal(byteArray, 1, 2);
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
        byteArray[10] = (byte) 32;
        byteArray[11] = (byte) -127;
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741835 out of bounds for length 12]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:127) */
        TarUtils.parseOctal(byteArray, 10, 1073741826);
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:116) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:110) */
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
        byte[] byteArray = {(byte) 57, (byte) -71};
        
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(TarUtils.java:167) */
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
        byte[] byteArray = new byte[35];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) 1;
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
        byteArray[30] = (byte) -127;
        byteArray[31] = (byte) -127;
        byteArray[32] = (byte) -127;
        byteArray[33] = (byte) -127;
        byteArray[34] = (byte) -127;
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483647 out of bounds for length 35]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:127)
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(TarUtils.java:168) */
        TarUtils.parseOctalOrBinary(byteArray, 1, Integer.MAX_VALUE);
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:116)
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(TarUtils.java:168) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryLong(TarUtils.java:188)
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(TarUtils.java:172) */
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
        byteArray[17] = (byte) 1;
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
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 65 out of bounds for byte[40]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger(TarUtils.java:203)
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(TarUtils.java:174) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(TarUtils.java:167) */
        TarUtils.parseOctalOrBinary(null, -255, -255);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:356) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:355) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:361)
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:321) */
        TarUtils.formatNameBytes("\n\t\r", byteArray, -1, 1);
    }
    
    @Test
    public void testFormatNameBytesByFuzzer1() {
        byte[] byteArray = {java.lang.Byte.MAX_VALUE, java.lang.Byte.MIN_VALUE, (byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[5]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:361)
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:321) */
        TarUtils.formatNameBytes("", byteArray, -1, Integer.MAX_VALUE);
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
        parseBinaryLongMethodArguments[1] = 2;
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryLong(TarUtils.java:188) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryLong(TarUtils.java:188) */
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
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method parseBinaryLong([B, int, int, boolean)
    
    @Test
    public void testParseBinaryLongByFuzzer() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {(byte) 8, (byte) 1, (byte) 0, (byte) 1, (byte) 9};
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryLongMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryLong", byteArrayType, intType, intType, booleanType);
        parseBinaryLongMethod.setAccessible(true);
        java.lang.Object[] parseBinaryLongMethodArguments = new java.lang.Object[4];
        parseBinaryLongMethodArguments[0] = ((Object) byteArray);
        parseBinaryLongMethodArguments[1] = 0;
        parseBinaryLongMethodArguments[2] = 2;
        parseBinaryLongMethodArguments[3] = true;
        long actual = ((Long) parseBinaryLongMethod.invoke(null, parseBinaryLongMethodArguments));
        
        assertEquals(-255L, actual);
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
 * @utbot.iterates iterate the loop {@code for(byte element: buf)} once
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(byte element: buf)
 *  */
    @Test
    public void testComputeCheckSum_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(TarUtils.java:561) */
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatLongBinary(long, [B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongBinary(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (negative): True}
 * @utbot.iterates iterate the loop {@code for(int i = offset + length - 1; i >= offset; i--)} once
 *  */
    @Test
    public void testFormatLongBinary_Negative_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {(byte) -127};
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method formatLongBinaryMethod = tarUtilsClazz.getDeclaredMethod("formatLongBinary", longType, byteArrayType, intType, intType, booleanType);
        formatLongBinaryMethod.setAccessible(true);
        java.lang.Object[] formatLongBinaryMethodArguments = new java.lang.Object[5];
        formatLongBinaryMethodArguments[0] = java.lang.Long.MIN_VALUE;
        formatLongBinaryMethodArguments[1] = ((Object) byteArray);
        formatLongBinaryMethodArguments[2] = 0;
        formatLongBinaryMethodArguments[3] = 1;
        formatLongBinaryMethodArguments[4] = true;
        formatLongBinaryMethod.invoke(null, formatLongBinaryMethodArguments);
        
        byte finalByteArray0 = byteArray[0];
        
        assertEquals((byte) 0, finalByteArray0);
    }
    
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
        formatLongBinaryMethodArguments[0] = -256L;
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
        formatLongBinaryMethodArguments[0] = -256L;
        formatLongBinaryMethodArguments[1] = ((Object) null);
        formatLongBinaryMethodArguments[2] = -255;
        formatLongBinaryMethodArguments[3] = 0;
        formatLongBinaryMethodArguments[4] = false;
        formatLongBinaryMethod.invoke(null, formatLongBinaryMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method formatLongBinary(long, [B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongBinary(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (val >= max): True}
 * @utbot.invokes {@link java.lang.Math#abs(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: val >= max
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
        formatLongBinaryMethodArguments[0] = -256L;
        formatLongBinaryMethodArguments[1] = ((Object) null);
        formatLongBinaryMethodArguments[2] = -255;
        formatLongBinaryMethodArguments[3] = -254;
        formatLongBinaryMethodArguments[4] = false;
        try {
            formatLongBinaryMethod.invoke(null, formatLongBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 0]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:507) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method formatLongBinaryMethod = tarUtilsClazz.getDeclaredMethod("formatLongBinary", longType, byteArrayType, intType, intType, booleanType);
        formatLongBinaryMethod.setAccessible(true);
        java.lang.Object[] formatLongBinaryMethodArguments = new java.lang.Object[5];
        formatLongBinaryMethodArguments[0] = java.lang.Long.MIN_VALUE;
        formatLongBinaryMethodArguments[1] = ((Object) byteArray);
        formatLongBinaryMethodArguments[2] = 2;
        formatLongBinaryMethodArguments[3] = 5;
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
 * @utbot.iterates iterate the loop {@code for(int i = offset + length - 1; i >= offset; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buf[i] = (byte) val;
 *  */
    @Test
    public void testFormatLongBinary_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:507) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method formatLongBinaryMethod = tarUtilsClazz.getDeclaredMethod("formatLongBinary", longType, byteArrayType, intType, intType, booleanType);
        formatLongBinaryMethod.setAccessible(true);
        java.lang.Object[] formatLongBinaryMethodArguments = new java.lang.Object[5];
        formatLongBinaryMethodArguments[0] = -72057594037927935L;
        formatLongBinaryMethodArguments[1] = ((Object) null);
        formatLongBinaryMethodArguments[2] = 256;
        formatLongBinaryMethodArguments[3] = 256;
        formatLongBinaryMethodArguments[4] = false;
        try {
            formatLongBinaryMethod.invoke(null, formatLongBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method verifyCheckSum([B)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#verifyCheckSum(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < header.length; i++)} twice
 * @utbot.returnsFrom {@code return storedSum == unsignedSum || storedSum == signedSum;}
 *  */
    @Test
    public void testVerifyCheckSum_StoredSumEqualsUnsignedSumOrStoredSumEqualsSignedSum() {
        byte[] byteArray = {(byte) -64, (byte) 64};
        
        boolean actual = TarUtils.verifyCheckSum(byteArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#verifyCheckSum(byte[])}
 * @utbot.returnsFrom {@code return storedSum == unsignedSum || storedSum == signedSum;}
 *  */
    @Test
    public void testVerifyCheckSum_StoredSumEqualsUnsignedSumOrStoredSumEqualsSignedSum_1() {
        byte[] byteArray = {};
        
        boolean actual = TarUtils.verifyCheckSum(byteArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#verifyCheckSum(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < header.length; i++)} once
 * @utbot.returnsFrom {@code return storedSum == unsignedSum || storedSum == signedSum;}
 *  */
    @Test
    public void testVerifyCheckSum_StoredSumNotEqualsUnsignedSumOrStoredSumNotEqualsSignedSum() {
        byte[] byteArray = {(byte) -127};
        
        boolean actual = TarUtils.verifyCheckSum(byteArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verifyCheckSum([B)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#verifyCheckSum(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < header.length; i++)
 *  */
    @Test
    public void testVerifyCheckSum_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(TarUtils.java:599) */
        TarUtils.verifyCheckSum(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method verifyCheckSum([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#verifyCheckSum(byte[])}
     */
    @Test
    public void testVerifyCheckSumReturnsFalseWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) -107, (byte) 0, (byte) -1};
        
        boolean actual = TarUtils.verifyCheckSum(byteArray);
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#verifyCheckSum(byte[])}
     */
    @Test
    public void testVerifyCheckSumReturnsFalseWithNonEmptyPrimitiveArray1() {
        byte[] byteArray = {(byte) -108, (byte) 1};
        
        boolean actual = TarUtils.verifyCheckSum(byteArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:292)
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:261) */
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
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 127 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:292) */
        TarUtils.parseName(byteArray, 127, 1, null);
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:298) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:299) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:292) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:292) */
        TarUtils.parseName(byteArray, -1073741823, 1073741824, null);
    }
    
    @Test
    public void testParseName2() throws Throwable  {
        byte[] byteArray = new byte[40];
        byteArray[39] = java.lang.Byte.MIN_VALUE;
        Object simple8BitZipEncoding = createInstance("org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding");
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.decodeByte(Simple8BitZipEncoding.java:132)
            org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.decode(Simple8BitZipEncoding.java:268)
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:299) */
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class simple8BitZipEncodingType = Class.forName("org.apache.commons.compress.archivers.zip.ZipEncoding");
        Method parseNameMethod = tarUtilsClazz.getDeclaredMethod("parseName", byteArrayType, intType, intType, simple8BitZipEncodingType);
        parseNameMethod.setAccessible(true);
        java.lang.Object[] parseNameMethodArguments = new java.lang.Object[4];
        parseNameMethodArguments[0] = ((Object) byteArray);
        parseNameMethodArguments[1] = 31;
        parseNameMethodArguments[2] = 9;
        parseNameMethodArguments[3] = simple8BitZipEncoding;
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(TarUtils.java:229) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(TarUtils.java:229) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.exceptionMessage(TarUtils.java:242) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.exceptionMessage(TarUtils.java:242) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields975466869807800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields975466869807800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass975466869812700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields975466869807800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass975466869812700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

