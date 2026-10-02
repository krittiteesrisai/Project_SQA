package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_compress_archivers_tar_TarUtilsTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseName([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < end; ++i)} once
 * @utbot.returnsFrom {@code return result.toString();}
 *  */
    @Test
    public void testParseName_BEqualsZero() {
        byte[] byteArray = {(byte) -127, (byte) 0};
        
        String actual = TarUtils.parseName(byteArray, 1, 1);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int)}
 * @utbot.returnsFrom {@code return result.toString();}
 *  */
    @Test
    public void testParseName_ReturnResultToString() {
        String actual = TarUtils.parseName(null, -1, 0);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseName([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < end; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: byte b = buffer[i];
 *  */
    @Test
    public void testParseName_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:188) */
        TarUtils.parseName(byteArray, 129, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < end; ++i)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: byte b = buffer[i];
 *  */
    @Test
    public void testParseName_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:188) */
        TarUtils.parseName(byteArray, 0, 11);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < end; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte b = buffer[i];
 *  */
    @Test
    public void testParseName_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:188) */
        TarUtils.parseName(null, -254, 1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parseName([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int)}
     */
    @Test(expected = OutOfMemoryError.class)
    public void testParseNameThrowsOOMEWithNonEmptyPrimitiveArrayAndCornerCase() {
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, java.lang.Byte.MAX_VALUE, java.lang.Byte.MIN_VALUE, (byte) 1, java.lang.Byte.MIN_VALUE};
        
        TarUtils.parseName(byteArray, 1, Integer.MAX_VALUE);
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(TarUtils.java:161) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(TarUtils.java:161) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.exceptionMessage(TarUtils.java:167) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.exceptionMessage(TarUtils.java:167) */
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseOctal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseOctal([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (allNUL): False}
 * @utbot.executesCondition {@code (trailer == 0): True}
 * @utbot.executesCondition {@code (trailer == 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end; i++)} once
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.iterates iterate the loop {@code for(; start < end; start++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testParseOctal_CurrentByteLessOrEqual7() {
        byte[] byteArray = new byte[12];
        byteArray[0] = (byte) 49;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        
        long actual = TarUtils.parseOctal(byteArray, 0, 3);
        
        assertEquals(1L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (allNUL): False}
 * @utbot.executesCondition {@code (trailer == 0): False}
 * @utbot.executesCondition {@code (trailer == ' '): True}
 * @utbot.executesCondition {@code (trailer == 0): False}
 * @utbot.executesCondition {@code (trailer == ' '): True}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end; i++)} once
 * @utbot.iterates iterate the loop {@code while(start < end)} twice
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testParseOctal_TrailerEqualsChar() {
        byte[] byteArray = {(byte) 32, (byte) 32};
        
        long actual = TarUtils.parseOctal(byteArray, 0, 2);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (allNUL): True}
 * @utbot.returnsFrom {@code return 0L;}
 *  */
    @Test
    public void testParseOctal_AllNUL() {
        long actual = TarUtils.parseOctal(null, 2146435079, 1048705);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseOctal([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (allNUL): False}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end; i++)} once
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: trailer = buffer[end - 1];
 *  */
    @Test
    public void testParseOctal_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:87) */
        TarUtils.parseOctal(byteArray, 1, 129);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[i] != 0
 *  */
    @Test
    public void testParseOctal_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:67) */
        TarUtils.parseOctal(byteArray, -256, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (allNUL): False}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end; i++)} once
 * @utbot.iterates iterate the loop {@code while(start < end)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[start] == ' '
 *  */
    @Test
    public void testParseOctal_ThrowArrayIndexOutOfBoundsException_2() {
        byte[] byteArray = {(byte) 32};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:78) */
        TarUtils.parseOctal(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end; i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[i] != 0
 *  */
    @Test
    public void testParseOctal_ThrowArrayIndexOutOfBoundsException_3() {
        byte[] byteArray = {(byte) 0};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:67) */
        TarUtils.parseOctal(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: buffer[i] != 0
 *  */
    @Test
    public void testParseOctal_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:67) */
        TarUtils.parseOctal(null, -254, 5);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseOctal([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (length < 2): False}
 * @utbot.executesCondition {@code (allNUL): False}
 * @utbot.executesCondition {@code (trailer == 0): False}
 * @utbot.executesCondition {@code (trailer == ' '): False}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarUtils#exceptionMessage(byte[],int,int,int,byte)
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end; i++)} once
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: exceptionMessage(buffer, offset, length, end - 1, trailer)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_ThrowIllegalArgumentException_1() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        TarUtils.parseOctal(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (length < 2): False}
 * @utbot.executesCondition {@code (allNUL): False}
 * @utbot.executesCondition {@code (trailer == 0): True}
 * @utbot.executesCondition {@code (trailer == 0): False}
 * @utbot.executesCondition {@code (trailer == ' '): False}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end; i++)} once
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.iterates iterate the loop {@code for(; start < end; start++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: exceptionMessage(buffer, offset, length, start, currentByte)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_ThrowIllegalArgumentException_2() {
        byte[] byteArray = {(byte) 47, (byte) 0};
        
        TarUtils.parseOctal(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (length < 2): False}
 * @utbot.executesCondition {@code (allNUL): False}
 * @utbot.executesCondition {@code (trailer == 0): True}
 * @utbot.executesCondition {@code (trailer == 0): False}
 * @utbot.executesCondition {@code (trailer == ' '): False}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end; i++)} once
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.iterates iterate the loop {@code for(; start < end; start++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: exceptionMessage(buffer, offset, length, start, currentByte)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_ThrowIllegalArgumentException_3() {
        byte[] byteArray = {(byte) 57, (byte) 0};
        
        TarUtils.parseOctal(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (length < 2): False}
 * @utbot.executesCondition {@code (allNUL): False}
 * @utbot.executesCondition {@code (trailer == 0): True}
 * @utbot.executesCondition {@code (trailer == 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end; i++)} once
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.iterates iterate the loop {@code for(; start < end; start++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: exceptionMessage(buffer, offset, length, start, currentByte)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_ThrowIllegalArgumentException_4() {
        byte[] byteArray = new byte[12];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) 47;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        
        TarUtils.parseOctal(byteArray, 2, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (length < 2): False}
 * @utbot.executesCondition {@code (allNUL): False}
 * @utbot.executesCondition {@code (trailer == 0): True}
 * @utbot.executesCondition {@code (trailer == 0): False}
 * @utbot.executesCondition {@code (trailer == ' '): True}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end; i++)} once
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.iterates iterate the loop {@code for(; start < end; start++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: exceptionMessage(buffer, offset, length, start, currentByte)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_ThrowIllegalArgumentException_5() {
        byte[] byteArray = new byte[12];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) 47;
        byteArray[3] = (byte) 32;
        byteArray[5] = (byte) -127;
        byteArray[6] = java.lang.Byte.MIN_VALUE;
        byteArray[7] = (byte) -126;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        
        TarUtils.parseOctal(byteArray, 2, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.executesCondition {@code (length < 2): False}
 * @utbot.executesCondition {@code (allNUL): False}
 * @utbot.executesCondition {@code (trailer == 0): False}
 * @utbot.executesCondition {@code (trailer == ' '): True}
 * @utbot.executesCondition {@code (trailer == 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end; i++)} once
 * @utbot.iterates iterate the loop {@code while(start < end)} once
 * @utbot.iterates iterate the loop {@code for(; start < end; start++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: exceptionMessage(buffer, offset, length, start, currentByte)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_ThrowIllegalArgumentException_6() {
        byte[] byteArray = new byte[12];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) 57;
        byteArray[4] = (byte) 32;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = java.lang.Byte.MIN_VALUE;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        
        TarUtils.parseOctal(byteArray, 2, 3);
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
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatNameBytes(java.lang.String, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatNameBytes(java.lang.String,byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < length && i < name.length(); ++i)} twice
 * @utbot.returnsFrom {@code return offset + length;}
 *  */
    @Test
    public void testFormatNameBytes_IterateForLoop() {
        String string = "";
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        int actual = TarUtils.formatNameBytes(string, byteArray, 1, 1);
        
        assertEquals(2, actual);
        
        byte finalByteArray1 = byteArray[1];
        
        assertEquals((byte) 0, finalByteArray1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatNameBytes(java.lang.String,byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < length && i < name.length(); ++i)} once
 * @utbot.returnsFrom {@code return offset + length;}
 *  */
    @Test
    public void testFormatNameBytes_StringCharAt() {
        String string = " ";
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        int actual = TarUtils.formatNameBytes(string, byteArray, 1, 1);
        
        assertEquals(2, actual);
        
        byte finalByteArray1 = byteArray[1];
        
        assertEquals((byte) 32, finalByteArray1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatNameBytes(java.lang.String,byte[],int,int)}
 * @utbot.returnsFrom {@code return offset + length;}
 *  */
    @Test
    public void testFormatNameBytes_ReturnOffsetPlusLength() {
        int actual = TarUtils.formatNameBytes(null, null, -255, 0);
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatNameBytes(java.lang.String, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatNameBytes(java.lang.String,byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < length && i < name.length(); ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + i] = (byte) name.charAt(i);
 *  */
    @Test
    public void testFormatNameBytes_ThrowArrayIndexOutOfBoundsException() {
        String string = " ";
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 65 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:218) */
        TarUtils.formatNameBytes(string, byteArray, 65, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatNameBytes(java.lang.String,byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < length && i < name.length(); ++i)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + i] = 0;
 *  */
    @Test
    public void testFormatNameBytes_ThrowArrayIndexOutOfBoundsException_1() {
        String string = "";
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:223) */
        TarUtils.formatNameBytes(string, byteArray, -256, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatNameBytes(java.lang.String,byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < length && i < name.length(); ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buf[offset + i] = (byte) name.charAt(i);
 *  */
    @Test
    public void testFormatNameBytes_ThrowNullPointerException() {
        String string = " ";
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:218) */
        TarUtils.formatNameBytes(string, null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatNameBytes(java.lang.String,byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < length && i < name.length(); ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(i = 0; i < length && i < name.length(); ++i)
 *  */
    @Test
    public void testFormatNameBytes_ThrowNullPointerException_1() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:217) */
        TarUtils.formatNameBytes(null, null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatNameBytes(java.lang.String,byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < length && i < name.length(); ++i)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buf[offset + i] = 0;
 *  */
    @Test
    public void testFormatNameBytes_ThrowNullPointerException_2() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:223) */
        TarUtils.formatNameBytes(string, null, -255, 1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method formatNameBytes(java.lang.String, [B, int, int)
    
    @Test
    public void testFormatNameBytesByFuzzer() {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MAX_VALUE, java.lang.Byte.MAX_VALUE};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:223) */
        TarUtils.formatNameBytes("abc", byteArray, 0, 2147221503);
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
        
        TarUtils.formatOctalBytes(-247L, byteArray, 0, 3);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:243)
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:280) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:282) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:283) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:282) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:259)
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:280) */
        TarUtils.formatOctalBytes(2L, byteArray, -15, 18);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:248)
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:280) */
        TarUtils.formatOctalBytes(1L, byteArray, 0, 3);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:283) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:259)
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:280) */
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
        byte[] byteArray = {
            (byte) -127, (byte) 1, (byte) -127, (byte) -127, (byte) 2, (byte) -127, (byte) -127, (byte) -127,
            java.lang.Byte.MIN_VALUE, (byte) 0
        };
        
        long actual = TarUtils.parseOctalOrBinary(byteArray, 1, Integer.MAX_VALUE);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): False}
 * @utbot.returnsFrom {@code return val;}
 *  */
    @Test
    public void testParseOctalOrBinary_OffsetOfBufferBitwiseAnd0x80NotEqualsZero() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        long actual = TarUtils.parseOctalOrBinary(byteArray, 1, 1);
        
        assertEquals(1L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < length; i++)} once
 * @utbot.returnsFrom {@code return val;}
 *  */
    @Test
    public void testParseOctalOrBinary_ValLessThan1LLeftShift63Minus8() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        long actual = TarUtils.parseOctalOrBinary(byteArray, 0, 2);
        
        assertEquals(385L, actual);
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
        byte[] byteArray = {(byte) 32, (byte) 32};
        
        long actual = TarUtils.parseOctalOrBinary(byteArray, 0, 2);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseOctalOrBinary([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
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
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_ThrowIllegalArgumentException_1() {
        byte[] byteArray = new byte[40];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -126;
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
        byteArray[16] = (byte) -126;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -127;
        byteArray[20] = (byte) -126;
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
        byteArray[34] = (byte) 65;
        byteArray[35] = (byte) 32;
        byteArray[36] = (byte) 32;
        byteArray[37] = (byte) -127;
        byteArray[38] = (byte) -127;
        byteArray[39] = (byte) -127;
        
        TarUtils.parseOctalOrBinary(byteArray, 34, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_ThrowIllegalArgumentException_2() {
        byte[] byteArray = {(byte) 1, (byte) -127};
        
        TarUtils.parseOctalOrBinary(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_ThrowIllegalArgumentException_3() {
        byte[] byteArray = new byte[40];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[4] = java.lang.Byte.MIN_VALUE;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        byteArray[15] = (byte) -126;
        byteArray[16] = (byte) -127;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -126;
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
        byteArray[34] = (byte) 57;
        byteArray[36] = (byte) 32;
        byteArray[37] = (byte) -127;
        byteArray[38] = (byte) -127;
        byteArray[39] = (byte) -127;
        
        TarUtils.parseOctalOrBinary(byteArray, 34, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_ThrowIllegalArgumentException_4() {
        byte[] byteArray = {(byte) 47, (byte) 0};
        
        TarUtils.parseOctalOrBinary(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parseOctal(buffer, offset, length);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_ThrowIllegalArgumentException_5() {
        byte[] byteArray = {(byte) 0, (byte) -127};
        
        TarUtils.parseOctalOrBinary(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < length; i++)} 8 times
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: val >= (1L << (63 - 8))
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_ThrowIllegalArgumentException_6() {
        byte[] byteArray = new byte[33];
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
        byteArray[19] = (byte) -126;
        byteArray[20] = (byte) -127;
        byteArray[21] = (byte) -127;
        byteArray[22] = (byte) -127;
        byteArray[23] = (byte) -127;
        byteArray[24] = (byte) -127;
        byteArray[25] = java.lang.Byte.MIN_VALUE;
        byteArray[26] = java.lang.Byte.MIN_VALUE;
        
        TarUtils.parseOctalOrBinary(byteArray, 25, 9);
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(TarUtils.java:134) */
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
        byte[] byteArray = {(byte) -127, (byte) 1};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:87)
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(TarUtils.java:135) */
        TarUtils.parseOctalOrBinary(byteArray, 1, 3);
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
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:78)
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(TarUtils.java:135) */
        TarUtils.parseOctalOrBinary(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: val = (val << 8) + (buffer[offset + i] & 0xff);
 *  */
    @Test
    public void testParseOctalOrBinary_ThrowArrayIndexOutOfBoundsException_3() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(TarUtils.java:145) */
        TarUtils.parseOctalOrBinary(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.executesCondition {@code ((buffer[offset] & 0x80) == 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return parseOctal(buffer, offset, length);
 *  */
    @Test
    public void testParseOctalOrBinary_ThrowArrayIndexOutOfBoundsException_4() {
        byte[] byteArray = {(byte) 0};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:67)
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(TarUtils.java:135) */
        TarUtils.parseOctalOrBinary(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctalOrBinary(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (buffer[offset] & 0x80) == 0
 *  */
    @Test
    public void testParseOctalOrBinary_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(TarUtils.java:134) */
        TarUtils.parseOctalOrBinary(null, -255, -255);
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
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < buf.length; ++i)} once
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testComputeCheckSum_IterateForLoop() {
        byte[] byteArray = {(byte) -127};
        
        long actual = TarUtils.computeCheckSum(byteArray);
        
        assertEquals(129L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeCheckSum([B)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#computeCheckSum(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < buf.length; ++i)
 *  */
    @Test
    public void testComputeCheckSum_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(TarUtils.java:388) */
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
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:248) */
        TarUtils.formatUnsignedOctalString(-255L, byteArray, 1, 1);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:243) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:259) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:259) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:248) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:243) */
        TarUtils.formatUnsignedOctalString(0L, null, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatLongOctalOrBinaryBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
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
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.returnsFrom {@code return formatLongOctalBytes(value, buf, offset, length);}
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ValueLessOrEqualMaxAsOctalChar_1() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        int actual = TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray, 0, 2);
        
        assertEquals(2, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        
        assertEquals((byte) 49, finalByteArray0);
        
        assertEquals((byte) 32, finalByteArray1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): False}
 * @utbot.executesCondition {@code (val != 0): False}
 * @utbot.executesCondition {@code ((buf[offset] & 0x80) != 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = offset + length - 1; i >= offset; i--)} 5 times
 * @utbot.returnsFrom {@code return offset + length;}
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_OffsetOfBufBitwiseAnd0x80EqualsZero() {
        byte[] byteArray = new byte[15];
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
        
        int actual = TarUtils.formatLongOctalOrBinaryBytes(10745806848L, byteArray, 6, 5);
        
        assertEquals(11, actual);
        
        byte finalByteArray6 = byteArray[6];
        byte finalByteArray7 = byteArray[7];
        byte finalByteArray8 = byteArray[8];
        byte finalByteArray9 = byteArray[9];
        byte finalByteArray10 = byteArray[10];
        
        assertEquals((byte) -126, finalByteArray6);
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalByteArray7);
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalByteArray8);
        
        assertEquals((byte) 0, finalByteArray9);
        
        assertEquals((byte) 0, finalByteArray10);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatLongOctalOrBinaryBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return formatLongOctalBytes(value, buf, offset, length);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:248)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:306)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:336) */
        TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray, -7, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): False}
 * @utbot.iterates iterate the loop {@code for(int i = offset + length - 1; i >= offset; i--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[i] = (byte) val;
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 127 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:341) */
        TarUtils.formatLongOctalOrBinaryBytes(8589934592L, byteArray, 127, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return formatLongOctalBytes(value, buf, offset, length);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_2() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:243)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:306)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:336) */
        TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray, -2, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return formatLongOctalBytes(value, buf, offset, length);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_3() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:307)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:336) */
        TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return formatLongOctalBytes(value, buf, offset, length);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_4() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:259)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:306)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:336) */
        TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray, -5, 8);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return formatLongOctalBytes(value, buf, offset, length);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_5() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:248)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:306)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:336) */
        TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray, 2, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return formatLongOctalBytes(value, buf, offset, length);
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowArrayIndexOutOfBoundsException_6() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:259)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:306)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:336) */
        TarUtils.formatLongOctalOrBinaryBytes(2L, byteArray, -128, 130);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): False}
 * @utbot.iterates iterate the loop {@code for(int i = offset + length - 1; i >= offset; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buf[i] = (byte) val;
 *  */
    @Test
    public void testFormatLongOctalOrBinaryBytes_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:341) */
        TarUtils.formatLongOctalOrBinaryBytes(8589934592L, null, -4, 1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method formatLongOctalOrBinaryBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): False}
 * @utbot.executesCondition {@code (val != 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = offset + length - 1; i >= offset; i--)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: val != 0 || (buf[offset] & 0x80) != 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowIllegalArgumentException_1() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(8589934848L, byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return formatLongOctalBytes(value, buf, offset, length);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowIllegalArgumentException_2() {
        byte[] byteArray = {(byte) -127};
        
        TarUtils.formatLongOctalOrBinaryBytes(9L, byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): False}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): False}
 * @utbot.executesCondition {@code (val != 0): False}
 * @utbot.executesCondition {@code ((buf[offset] & 0x80) != 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = offset + length - 1; i >= offset; i--)} 5 times
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: val != 0 || (buf[offset] & 0x80) != 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowIllegalArgumentException_3() {
        byte[] byteArray = new byte[33];
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
        byteArray[30] = (byte) 4;
        byteArray[31] = (byte) -126;
        byteArray[32] = (byte) -127;
        
        TarUtils.formatLongOctalOrBinaryBytes(586263035904L, byteArray, 28, 5);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.executesCondition {@code (length == TarConstants.UIDLEN): True}
 * @utbot.executesCondition {@code (value <= maxAsOctalChar): False}
 * @utbot.executesCondition {@code (val != 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: val != 0 || (buf[offset] & 0x80) != 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_ThrowIllegalArgumentException() {
        TarUtils.formatLongOctalOrBinaryBytes(4194305L, null, 2147483644, 8);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method formatLongOctalOrBinaryBytes(long, [B, int, int)
    
    @Test
    public void testFormatLongOctalOrBinaryBytesByFuzzer() {
        byte[] byteArray = {(byte) 1, (byte) 1, (byte) 0};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483638 out of bounds for length 3]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:341) */
        TarUtils.formatLongOctalOrBinaryBytes(2147483649L, byteArray, -2147483645, 8);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method formatLongOctalOrBinaryBytes(long, [B, int, int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytesByFuzzer1() {
        byte[] byteArray = {(byte) 8, java.lang.Byte.MAX_VALUE, (byte) 0, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE};
        
        TarUtils.formatLongOctalOrBinaryBytes(-9223372036852678657L, byteArray, 1, 1);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:243)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:306) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:248)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:306) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:307) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:259)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:306) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:307) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:307) */
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
        
        TarUtils.formatLongOctalBytes(-248L, byteArray, 0, 2);
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
        
        TarUtils.formatCheckSumOctalBytes(-247L, byteArray, 0, 3);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:373) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:374) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:373) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:259)
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:371) */
        TarUtils.formatCheckSumOctalBytes(2L, byteArray, -15, 18);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatCheckSumOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test
    public void testFormatCheckSumOctalBytes_ThrowArrayIndexOutOfBoundsException_4() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:248)
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:371) */
        TarUtils.formatCheckSumOctalBytes(1L, byteArray, 0, 3);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:243)
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:371) */
        TarUtils.formatCheckSumOctalBytes(0L, byteArray, 193, -62);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:374) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:259)
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:371) */
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
}

