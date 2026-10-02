package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import org.junit.Ignore;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public final class org_apache_commons_compress_archivers_tar_TarUtilsTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseName
    
    ///region FUZZER: SECURITY for method parseName([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int)}
     */
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testParseNameWithNonEmptyPrimitiveArrayAndCornerCase() {
        byte[] byteArray = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "file.encoding" "read")] */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseName
    
    ///region Errors report for parseName
    
    public void testParseName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Default concrete execution failed
        
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean
    
    ///region Errors report for parseBoolean
    
    public void testParseBoolean_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.exceptionMessage
    
    ///region Errors report for exceptionMessage
    
    public void testExceptionMessage_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseOctalOrBinary([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.returnsFrom {@code return parseBinaryLong(buffer, offset, length, negative);}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return parseBinaryLong(buffer, offset, length, negative);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary_ThrowNoClassDefFoundError() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        TarUtils.parseOctalOrBinary(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary_ThrowNoClassDefFoundError_1() {
        byte[] byteArray = new byte[12];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) 57;
        byteArray[3] = (byte) 32;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        
        TarUtils.parseOctalOrBinary(byteArray, 2, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.returnsFrom {@code return parseOctal(buffer, offset, length);}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary_ThrowNoClassDefFoundError_2() {
        byte[] byteArray = new byte[37];
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
        byteArray[30] = (byte) 49;
        byteArray[33] = (byte) -127;
        byteArray[34] = (byte) -127;
        byteArray[35] = (byte) -127;
        byteArray[36] = (byte) -127;
        
        TarUtils.parseOctalOrBinary(byteArray, 30, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): False}
 * @utbot.executesCondition {@code (length < 9): False}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarUtils#parseBinaryBigInteger(byte[],int,int,boolean)
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return parseBinaryBigInteger(buffer, offset, length, negative);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary_ThrowNoClassDefFoundError_3() {
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
        
        TarUtils.parseOctalOrBinary(byteArray, 33, 32);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary_ThrowNoClassDefFoundError_4() {
        byte[] byteArray = {(byte) 32};
        
        TarUtils.parseOctalOrBinary(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.returnsFrom {@code return parseBinaryLong(buffer, offset, length, negative);}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return parseBinaryLong(buffer, offset, length, negative);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary_ThrowNoClassDefFoundError_5() {
        byte[] byteArray = {(byte) -1, (byte) -127};
        
        TarUtils.parseOctalOrBinary(byteArray, 0, 1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseOctalOrBinary([B, int, int)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary1() {
        byte[] byteArray = new byte[24];
        byteArray[0] = (byte) -1;
        byteArray[1] = java.lang.Byte.MIN_VALUE;
        
        TarUtils.parseOctalOrBinary(byteArray, 0, 9);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary2() {
        byte[] byteArray = new byte[14];
        byteArray[4] = (byte) -1;
        byteArray[5] = (byte) -1;
        byteArray[6] = (byte) -1;
        byteArray[7] = (byte) -1;
        
        TarUtils.parseOctalOrBinary(byteArray, 4, 9);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary3() {
        byte[] byteArray = new byte[15];
        byteArray[3] = (byte) -1;
        byteArray[4] = (byte) -1;
        byteArray[5] = (byte) -1;
        byteArray[6] = (byte) -1;
        byteArray[7] = java.lang.Byte.MIN_VALUE;
        
        TarUtils.parseOctalOrBinary(byteArray, 3, 12);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary4() {
        byte[] byteArray = new byte[40];
        byteArray[15] = java.lang.Byte.MIN_VALUE;
        byteArray[16] = (byte) -1;
        byteArray[17] = (byte) -1;
        byteArray[19] = (byte) 1;
        
        TarUtils.parseOctalOrBinary(byteArray, 15, 16);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary5() {
        byte[] byteArray = new byte[40];
        byteArray[2] = (byte) -1;
        byteArray[3] = (byte) -1;
        byteArray[4] = (byte) -1;
        byteArray[6] = (byte) 1;
        
        TarUtils.parseOctalOrBinary(byteArray, 2, 37);
    }
    ///endregion
    
    ///region Errors report for parseOctalOrBinary
    
    public void testParseOctalOrBinary_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryLong
    
    ///region OTHER: ERROR SUITE for method parseBinaryLong([B, int, int, boolean)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryLong1() throws Throwable  {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryLongMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryLong", byteArrayType, intType, intType, booleanType);
        parseBinaryLongMethod.setAccessible(true);
        java.lang.Object[] parseBinaryLongMethodArguments = new java.lang.Object[4];
        parseBinaryLongMethodArguments[0] = ((Object) byteArray);
        parseBinaryLongMethodArguments[1] = 0;
        parseBinaryLongMethodArguments[2] = 4;
        parseBinaryLongMethodArguments[3] = false;
        try {
            parseBinaryLongMethod.invoke(null, parseBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryLong2() throws Throwable  {
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryLongMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryLong", byteArrayType, intType, intType, booleanType);
        parseBinaryLongMethod.setAccessible(true);
        java.lang.Object[] parseBinaryLongMethodArguments = new java.lang.Object[4];
        parseBinaryLongMethodArguments[0] = ((Object) null);
        parseBinaryLongMethodArguments[1] = 0;
        parseBinaryLongMethodArguments[2] = -2147332087;
        parseBinaryLongMethodArguments[3] = true;
        try {
            parseBinaryLongMethod.invoke(null, parseBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for parseBinaryLong
    
    public void testParseBinaryLong_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Default concrete execution failed
        
        // 6 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseOctal
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseOctal([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (trailer == 0): False}
 * @utbot.executesCondition {@code (trailer == ' '): True}
 * @utbot.executesCondition {@code (trailer == 0): False}
 * @utbot.executesCondition {@code (trailer == ' '): False}
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.iterates iterate the loop {@code for(; start < end; start++)} once
 * @utbot.returnsFrom {@code return result;}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return result;
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctal_ThrowNoClassDefFoundError() {
        byte[] byteArray = {(byte) 49, (byte) 32};
        
        TarUtils.parseOctal(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(start < end)} twice
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: trailer = buffer[end - 1];
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctal_ThrowNoClassDefFoundError_1() {
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
        byteArray[14] = (byte) 32;
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
        byteArray[35] = (byte) -127;
        
        TarUtils.parseOctal(byteArray, 14, 1073741834);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(start < end)} twice
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} when: buffer[start] == ' '
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctal_ThrowNoClassDefFoundError_2() {
        byte[] byteArray = {(byte) 32};
        
        TarUtils.parseOctal(byteArray, 0, 2);
    }
    ///endregion
    
    ///region Errors report for parseOctal
    
    public void testParseOctal_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes
    
    ///region Errors report for formatNameBytes
    
    public void testFormatNameBytes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes
    
    ///region Errors report for formatNameBytes
    
    public void testFormatNameBytes_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes
    
    ///region Errors report for formatOctalBytes
    
    public void testFormatOctalBytes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 15 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum
    
    ///region Errors report for computeCheckSum
    
    public void testComputeCheckSum_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary
    
    ///region Errors report for formatLongBinary
    
    public void testFormatLongBinary_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum
    
    ///region Errors report for verifyCheckSum
    
    public void testVerifyCheckSum_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatLongOctalOrBinaryBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.executesCondition {@code (length < 9): False}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarUtils#formatBigIntegerBinary(long,byte[],int,int,boolean)
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: formatBigIntegerBinary(value, buf, offset, length, negative);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(-16L, byteArray, -32, 32);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return formatLongOctalBytes(value, buf, offset, length);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_1() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_2() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(java.lang.Long.MIN_VALUE, byteArray, -131, 4);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_3() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(-256L, byteArray, -134, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return formatLongOctalBytes(value, buf, offset, length);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_4() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return formatLongOctalBytes(value, buf, offset, length);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_5() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray, -6, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_6() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(4503599627371265L, byteArray, -134, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_7() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(-256L, byteArray, -2, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_8() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(274877907200L, byteArray, -5, 6);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_9() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(-256L, byteArray, -7, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (!negative): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return formatLongOctalBytes(value, buf, offset, length);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_10() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray, -6, 8);
    }
    ///endregion
    
    ///region Errors report for formatLongOctalOrBinaryBytes
    
    public void testFormatLongOctalOrBinaryBytes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger
    
    ///region OTHER: ERROR SUITE for method parseBinaryBigInteger([B, int, int, boolean)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryBigInteger1() throws Throwable  {
        byte[] byteArray = {(byte) -1};
        
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
        parseBinaryBigIntegerMethodArguments[3] = true;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryBigInteger2() throws Throwable  {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) -127
        };
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = 8;
        parseBinaryBigIntegerMethodArguments[2] = 2;
        parseBinaryBigIntegerMethodArguments[3] = true;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryBigInteger3() throws Throwable  {
        byte[] byteArray = {(byte) 0, (byte) 0};
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = 2147483646;
        parseBinaryBigIntegerMethodArguments[2] = 5;
        parseBinaryBigIntegerMethodArguments[3] = false;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryBigInteger4() throws Throwable  {
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
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryBigInteger5() throws Throwable  {
        byte[] byteArray = {(byte) 0};
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = 2147483646;
        parseBinaryBigIntegerMethodArguments[2] = 2;
        parseBinaryBigIntegerMethodArguments[3] = true;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryBigInteger6() throws Throwable  {
        byte[] byteArray = new byte[36];
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = 2147483646;
        parseBinaryBigIntegerMethodArguments[2] = 35;
        parseBinaryBigIntegerMethodArguments[3] = false;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryBigInteger7() throws Throwable  {
        byte[] byteArray = {(byte) 0};
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = 2147483646;
        parseBinaryBigIntegerMethodArguments[2] = 2;
        parseBinaryBigIntegerMethodArguments[3] = true;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryBigInteger8() throws Throwable  {
        byte[] byteArray = {(byte) 0};
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = 2147483646;
        parseBinaryBigIntegerMethodArguments[2] = 6;
        parseBinaryBigIntegerMethodArguments[3] = false;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryBigInteger9() throws Throwable  {
        byte[] byteArray = new byte[33];
        byteArray[1] = (byte) 1;
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = 0;
        parseBinaryBigIntegerMethodArguments[2] = 2;
        parseBinaryBigIntegerMethodArguments[3] = true;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryBigInteger10() throws Throwable  {
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
        parseBinaryBigIntegerMethodArguments[2] = 4;
        parseBinaryBigIntegerMethodArguments[3] = false;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryBigInteger11() throws Throwable  {
        byte[] byteArray = {(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = 2147483646;
        parseBinaryBigIntegerMethodArguments[2] = 35;
        parseBinaryBigIntegerMethodArguments[3] = false;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for parseBinaryBigInteger
    
    public void testParseBinaryBigInteger_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Default concrete execution failed
        
        // 8 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes
    
    ///region Errors report for formatLongOctalBytes
    
    public void testFormatLongOctalBytes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 15 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary
    
    ///region OTHER: ERROR SUITE for method formatBigIntegerBinary(long, [B, int, int, boolean)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatBigIntegerBinary1() throws Throwable  {
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
        formatBigIntegerBinaryMethodArguments[0] = -16L;
        formatBigIntegerBinaryMethodArguments[1] = ((Object) byteArray);
        formatBigIntegerBinaryMethodArguments[2] = 0;
        formatBigIntegerBinaryMethodArguments[3] = 0;
        formatBigIntegerBinaryMethodArguments[4] = false;
        try {
            formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatBigIntegerBinary2() throws Throwable  {
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
        formatBigIntegerBinaryMethodArguments[0] = -16L;
        formatBigIntegerBinaryMethodArguments[1] = ((Object) byteArray);
        formatBigIntegerBinaryMethodArguments[2] = 0;
        formatBigIntegerBinaryMethodArguments[3] = 0;
        formatBigIntegerBinaryMethodArguments[4] = false;
        try {
            formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatBigIntegerBinary3() throws Throwable  {
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
        formatBigIntegerBinaryMethodArguments[0] = 16L;
        formatBigIntegerBinaryMethodArguments[1] = ((Object) byteArray);
        formatBigIntegerBinaryMethodArguments[2] = 0;
        formatBigIntegerBinaryMethodArguments[3] = 0;
        formatBigIntegerBinaryMethodArguments[4] = false;
        try {
            formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatBigIntegerBinary4() throws Throwable  {
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
        formatBigIntegerBinaryMethodArguments[0] = -8L;
        formatBigIntegerBinaryMethodArguments[1] = ((Object) byteArray);
        formatBigIntegerBinaryMethodArguments[2] = 0;
        formatBigIntegerBinaryMethodArguments[3] = 0;
        formatBigIntegerBinaryMethodArguments[4] = false;
        try {
            formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatBigIntegerBinary5() throws Throwable  {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
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
        formatBigIntegerBinaryMethodArguments[2] = 255;
        formatBigIntegerBinaryMethodArguments[3] = -256;
        formatBigIntegerBinaryMethodArguments[4] = false;
        try {
            formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatBigIntegerBinary6() throws Throwable  {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
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
        formatBigIntegerBinaryMethodArguments[2] = 0;
        formatBigIntegerBinaryMethodArguments[3] = 0;
        formatBigIntegerBinaryMethodArguments[4] = false;
        try {
            formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatBigIntegerBinary7() throws Throwable  {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
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
        formatBigIntegerBinaryMethodArguments[2] = Integer.MIN_VALUE;
        formatBigIntegerBinaryMethodArguments[3] = 0;
        formatBigIntegerBinaryMethodArguments[4] = false;
        try {
            formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatBigIntegerBinary8() throws Throwable  {
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
        formatBigIntegerBinaryMethodArguments[0] = -12L;
        formatBigIntegerBinaryMethodArguments[1] = ((Object) byteArray);
        formatBigIntegerBinaryMethodArguments[2] = 0;
        formatBigIntegerBinaryMethodArguments[3] = 0;
        formatBigIntegerBinaryMethodArguments[4] = false;
        try {
            formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatBigIntegerBinary9() throws Throwable  {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
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
        formatBigIntegerBinaryMethodArguments[2] = 0;
        formatBigIntegerBinaryMethodArguments[3] = 0;
        formatBigIntegerBinaryMethodArguments[4] = false;
        try {
            formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatBigIntegerBinary10() throws Throwable  {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
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
        formatBigIntegerBinaryMethodArguments[2] = Integer.MIN_VALUE;
        formatBigIntegerBinaryMethodArguments[3] = 0;
        formatBigIntegerBinaryMethodArguments[4] = false;
        try {
            formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatBigIntegerBinary11() throws Throwable  {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
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
        formatBigIntegerBinaryMethodArguments[3] = 0;
        formatBigIntegerBinaryMethodArguments[4] = false;
        try {
            formatBigIntegerBinaryMethod.invoke(null, formatBigIntegerBinaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for formatBigIntegerBinary
    
    public void testFormatBigIntegerBinary_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 15 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes
    
    ///region Errors report for formatCheckSumOctalBytes
    
    public void testFormatCheckSumOctalBytes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 15 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString
    
    ///region Errors report for formatUnsignedOctalString
    
    public void testFormatUnsignedOctalString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 15 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
}

