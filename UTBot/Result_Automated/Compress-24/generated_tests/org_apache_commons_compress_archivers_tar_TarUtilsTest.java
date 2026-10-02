package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import org.junit.Ignore;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public final class org_apache_commons_compress_archivers_tar_TarUtilsTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseName
    
    ///region FUZZER: SECURITY for method parseName([B, int, int, org.apache.commons.compress.archivers.zip.ZipEncoding)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testParseNameByFuzzer() {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MAX_VALUE, (byte) -1};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "file.encoding" "read")] */
    }
    ///endregion
    
    ///region Errors report for parseName
    
    public void testParseName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Default concrete execution failed
        
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseName
    
    ///region Errors report for parseName
    
    public void testParseName_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean
    
    ///region Errors report for parseBoolean
    
    public void testParseBoolean_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
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
        // 6 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
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
        formatBigIntegerBinaryMethodArguments[0] = 4L;
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
        formatBigIntegerBinaryMethodArguments[2] = -256;
        formatBigIntegerBinaryMethodArguments[3] = 255;
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
        byte[] byteArray = new byte[12];
        
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
        // 16 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger
    
    ///region OTHER: ERROR SUITE for method parseBinaryBigInteger([B, int, int, boolean)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryBigInteger1() throws Throwable  {
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
    public void testParseBinaryBigInteger2() throws Throwable  {
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
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryBigInteger3() throws Throwable  {
        byte[] byteArray = {};
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = 2147483616;
        parseBinaryBigIntegerMethodArguments[2] = 33;
        parseBinaryBigIntegerMethodArguments[3] = false;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryBigInteger4() throws Throwable  {
        byte[] byteArray = new byte[40];
        byteArray[2] = (byte) 1;
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = 1;
        parseBinaryBigIntegerMethodArguments[2] = 34;
        parseBinaryBigIntegerMethodArguments[3] = false;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryBigInteger5() throws Throwable  {
        byte[] byteArray = new byte[33];
        byteArray[7] = (byte) -127;
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = 6;
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
    public void testParseBinaryBigInteger7() throws Throwable  {
        byte[] byteArray = new byte[34];
        byteArray[2] = (byte) 1;
        
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
    public void testParseBinaryBigInteger8() throws Throwable  {
        byte[] byteArray = new byte[33];
        byteArray[19] = (byte) -127;
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = 18;
        parseBinaryBigIntegerMethodArguments[2] = 2;
        parseBinaryBigIntegerMethodArguments[3] = true;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryBigInteger9() throws Throwable  {
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
    public void testParseBinaryBigInteger10() throws Throwable  {
        byte[] byteArray = new byte[33];
        byteArray[19] = (byte) -127;
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryBigIntegerMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryBigInteger", byteArrayType, intType, intType, booleanType);
        parseBinaryBigIntegerMethod.setAccessible(true);
        java.lang.Object[] parseBinaryBigIntegerMethodArguments = new java.lang.Object[4];
        parseBinaryBigIntegerMethodArguments[0] = ((Object) byteArray);
        parseBinaryBigIntegerMethodArguments[1] = 18;
        parseBinaryBigIntegerMethodArguments[2] = 2;
        parseBinaryBigIntegerMethodArguments[3] = true;
        try {
            parseBinaryBigIntegerMethod.invoke(null, parseBinaryBigIntegerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryBigInteger11() throws Throwable  {
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
    ///endregion
    
    ///region Errors report for parseBinaryBigInteger
    
    public void testParseBinaryBigInteger_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        // Default concrete execution failed
        
        // 5 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatUnsignedOctalString(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatUnsignedOctalString(long,byte[],int,int)}
 * @utbot.executesCondition {@code (value == 0): False}
 * @utbot.iterates iterate the loop {@code for(; remaining >= 0 && val != 0; --remaining)} twice
 * @utbot.iterates iterate the loop {@code for(; remaining >= 0; --remaining)} once
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: buffer[offset + remaining] = (byte) '0';
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatUnsignedOctalString_ThrowNoClassDefFoundError() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatUnsignedOctalString(1L, byteArray, -64, 65);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatUnsignedOctalString(long,byte[],int,int)}
 * @utbot.executesCondition {@code (value == 0): True}
 * @utbot.iterates iterate the loop {@code for(; remaining >= 0; --remaining)} once
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} 
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatUnsignedOctalString_ThrowNoClassDefFoundError_1() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        TarUtils.formatUnsignedOctalString(0L, byteArray, 0, 2);
    }
    ///endregion
    
    ///region Errors report for formatUnsignedOctalString
    
    public void testFormatUnsignedOctalString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatLongOctalBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: buf[offset + idx] = (byte) ' ';
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatLongOctalBytes_ThrowNoClassDefFoundError() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        TarUtils.formatLongOctalBytes(1L, byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatLongOctalBytes_ThrowNoClassDefFoundError_1() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalBytes(1L, byteArray, 256, 2);
    }
    ///endregion
    
    ///region Errors report for formatLongOctalBytes
    
    public void testFormatLongOctalBytes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatLongOctalOrBinaryBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (!negative): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: formatLongBinary(value, buf, offset, length, negative);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(-3L, byteArray, -7, 8);
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
        byte[] byteArray = {};
        
        TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray, -214, -235);
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
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_2() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray, -7, 8);
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
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_3() {
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
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_4() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(java.lang.Long.MIN_VALUE, byteArray, -1, 1);
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
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_5() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(-3L, byteArray, -167, 8);
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
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_6() {
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
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_7() {
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
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_8() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(4194305L, byteArray, -135, 8);
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
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_9() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(-3L, byteArray, -1, 2);
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
    public void testFormatLongOctalOrBinaryBytes_ThrowNoClassDefFoundError_10() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(17179869185L, byteArray, -5, 6);
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatCheckSumOctalBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatCheckSumOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatCheckSumOctalBytes_ThrowNoClassDefFoundError() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatCheckSumOctalBytes(0L, byteArray, -1, 4);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatCheckSumOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatCheckSumOctalBytes_ThrowNoClassDefFoundError_1() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatCheckSumOctalBytes(1L, byteArray, -127, 130);
    }
    ///endregion
    
    ///region Errors report for formatCheckSumOctalBytes
    
    public void testFormatCheckSumOctalBytes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatOctalBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatOctalBytes_ThrowNoClassDefFoundError() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatOctalBytes(0L, byteArray, -1, 4);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testFormatOctalBytes_ThrowNoClassDefFoundError_1() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatOctalBytes(1L, byteArray, -127, 130);
    }
    ///endregion
    
    ///region Errors report for formatOctalBytes
    
    public void testFormatOctalBytes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
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
        // 13 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseOctal
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseOctal([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.iterates iterate the loop {@code for(; start < end; start++)} once
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: exceptionMessage(buffer, offset, length, start, currentByte)
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctal_ThrowNoClassDefFoundError() {
        byte[] byteArray = new byte[40];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) 57;
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
        byteArray[35] = (byte) -127;
        byteArray[36] = (byte) -127;
        byteArray[37] = (byte) -127;
        byteArray[39] = (byte) -127;
        
        TarUtils.parseOctal(byteArray, 12, 27);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.iterates iterate the loop {@code for(; start < end; start++)} once
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: exceptionMessage(buffer, offset, length, start, currentByte)
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctal_ThrowNoClassDefFoundError_1() {
        byte[] byteArray = new byte[12];
        byteArray[0] = (byte) 57;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) 32;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        
        TarUtils.parseOctal(byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.iterates iterate the loop {@code while(start < end - 1 && (trailer == 0 || trailer == ' '))} once
 * @utbot.iterates iterate the loop {@code for(; start < end; start++)} once
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: exceptionMessage(buffer, offset, length, start, currentByte)
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctal_ThrowNoClassDefFoundError_2() {
        byte[] byteArray = new byte[12];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) 47;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        
        TarUtils.parseOctal(byteArray, 1, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.iterates iterate the loop {@code for(; start < end; start++)} once
 * @utbot.returnsFrom {@code return result;}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return result;
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctal_ThrowNoClassDefFoundError_3() {
        byte[] byteArray = {(byte) 49, (byte) 32};
        
        TarUtils.parseOctal(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.iterates iterate the loop {@code while(start < end - 1 && (trailer == 0 || trailer == ' '))} once
 * @utbot.iterates iterate the loop {@code for(; start < end; start++)} once
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: exceptionMessage(buffer, offset, length, start, currentByte)
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctal_ThrowNoClassDefFoundError_4() {
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
        byteArray[9] = (byte) 57;
        byteArray[10] = (byte) 32;
        byteArray[11] = (byte) 32;
        
        TarUtils.parseOctal(byteArray, 9, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(start < end)} twice
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} when: buffer[start] == ' '
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctal_ThrowNoClassDefFoundError_5() {
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum
    
    ///region Errors report for computeCheckSum
    
    public void testComputeCheckSum_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
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
        // 10 occurrences of:
        // Default concrete execution failed
        
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
        byte[] byteArray = {(byte) -1, (byte) -127};
        
        TarUtils.parseOctalOrBinary(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary_ThrowNoClassDefFoundError_1() {
        byte[] byteArray = {(byte) 47, (byte) 0};
        
        TarUtils.parseOctalOrBinary(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary_ThrowNoClassDefFoundError_2() {
        byte[] byteArray = {(byte) 57, (byte) 32};
        
        TarUtils.parseOctalOrBinary(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): False}
 * @utbot.executesCondition {@code (length < 9): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return parseBinaryLong(buffer, offset, length, negative);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary_ThrowNoClassDefFoundError_3() {
        byte[] byteArray = {(byte) -1};
        
        TarUtils.parseOctalOrBinary(byteArray, 0, 4);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary_ThrowNoClassDefFoundError_4() {
        byte[] byteArray = new byte[28];
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
        byteArray[12] = (byte) 104;
        byteArray[13] = (byte) -127;
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
        
        TarUtils.parseOctalOrBinary(byteArray, 12, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary_ThrowNoClassDefFoundError_5() {
        byte[] byteArray = new byte[40];
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
        byteArray[35] = (byte) -127;
        byteArray[36] = (byte) -127;
        byteArray[37] = (byte) -127;
        byteArray[38] = (byte) -127;
        byteArray[39] = (byte) -127;
        
        TarUtils.parseOctalOrBinary(byteArray, 1, Integer.MAX_VALUE);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary_ThrowNoClassDefFoundError_6() {
        byte[] byteArray = {(byte) 32, (byte) -127};
        
        TarUtils.parseOctalOrBinary(byteArray, 0, 2);
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
    public void testParseOctalOrBinary_ThrowNoClassDefFoundError_7() {
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
        
        TarUtils.parseOctalOrBinary(byteArray, 33, 32);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.returnsFrom {@code return parseOctal(buffer, offset, length);}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary_ThrowNoClassDefFoundError_8() {
        byte[] byteArray = {(byte) 49, (byte) 0};
        
        TarUtils.parseOctalOrBinary(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.returnsFrom {@code return parseOctal(buffer, offset, length);}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary_ThrowNoClassDefFoundError_9() {
        byte[] byteArray = new byte[13];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) 49;
        byteArray[7] = (byte) 32;
        byteArray[8] = (byte) 32;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        
        TarUtils.parseOctalOrBinary(byteArray, 6, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testParseOctalOrBinary_ThrowNoClassDefFoundError_10() {
        byte[] byteArray = new byte[12];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -126;
        byteArray[3] = (byte) -126;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) 64;
        byteArray[11] = (byte) 32;
        
        TarUtils.parseOctalOrBinary(byteArray, 9, 3);
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
        try {
            parseBinaryLongMethod.invoke(null, parseBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryLong2() throws Throwable  {
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
        try {
            parseBinaryLongMethod.invoke(null, parseBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryLong3() throws Throwable  {
        byte[] byteArray = {(byte) 0, (byte) 0};
        
        Class tarUtilsClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method parseBinaryLongMethod = tarUtilsClazz.getDeclaredMethod("parseBinaryLong", byteArrayType, intType, intType, booleanType);
        parseBinaryLongMethod.setAccessible(true);
        java.lang.Object[] parseBinaryLongMethodArguments = new java.lang.Object[4];
        parseBinaryLongMethodArguments[0] = ((Object) byteArray);
        parseBinaryLongMethodArguments[1] = 0;
        parseBinaryLongMethodArguments[2] = -1611956223;
        parseBinaryLongMethodArguments[3] = true;
        try {
            parseBinaryLongMethod.invoke(null, parseBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParseBinaryLong4() throws Throwable  {
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
        parseBinaryLongMethodArguments[2] = 4;
        parseBinaryLongMethodArguments[3] = false;
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
        // 13 occurrences of:
        // Default concrete execution failed
        
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes
    
    ///region Errors report for formatNameBytes
    
    public void testFormatNameBytes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes
    
    ///region Errors report for formatNameBytes
    
    public void testFormatNameBytes_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
}

