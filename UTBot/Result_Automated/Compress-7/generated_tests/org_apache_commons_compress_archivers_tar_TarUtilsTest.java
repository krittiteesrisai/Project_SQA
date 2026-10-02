package org.apache.commons.compress.archivers.tar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public final class org_apache_commons_compress_archivers_tar_TarUtilsTest {
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
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:157) */
        TarUtils.formatUnsignedOctalString(1L, byteArray, 0, 1);
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
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 64 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:152) */
        TarUtils.formatUnsignedOctalString(0L, byteArray, 97, -32);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:168) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:168) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:157) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:152) */
        TarUtils.formatUnsignedOctalString(0L, null, -255, -255);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method formatUnsignedOctalString(long, [B, int, int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringByFuzzer() {
        byte[] byteArray = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        
        TarUtils.formatUnsignedOctalString(java.lang.Long.MIN_VALUE, byteArray, 0, 1);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:152)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:215) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:157)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:215) */
        TarUtils.formatLongOctalBytes(1L, byteArray, -1, 2);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:216) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:168)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:215) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:216) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:216) */
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
        
        TarUtils.formatCheckSumOctalBytes(9L, byteArray, 0, 3);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatCheckSumOctalBytes(long, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatCheckSumOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test
    public void testFormatCheckSumOctalBytes_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:157)
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:238) */
        TarUtils.formatCheckSumOctalBytes(-255L, byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatCheckSumOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + idx++] = 0;
 *  */
    @Test
    public void testFormatCheckSumOctalBytes_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:240) */
        TarUtils.formatCheckSumOctalBytes(0L, byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatCheckSumOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + idx] = (byte) ' ';
 *  */
    @Test
    public void testFormatCheckSumOctalBytes_ThrowArrayIndexOutOfBoundsException_2() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:241) */
        TarUtils.formatCheckSumOctalBytes(0L, byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatCheckSumOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + idx++] = 0;
 *  */
    @Test
    public void testFormatCheckSumOctalBytes_ThrowArrayIndexOutOfBoundsException_3() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:240) */
        TarUtils.formatCheckSumOctalBytes(1L, byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatCheckSumOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test
    public void testFormatCheckSumOctalBytes_ThrowArrayIndexOutOfBoundsException_4() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:168)
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:238) */
        TarUtils.formatCheckSumOctalBytes(2L, byteArray, -15, 18);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:152)
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:238) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:241) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:168)
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(TarUtils.java:238) */
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
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 33 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:127) */
        TarUtils.formatNameBytes(string, byteArray, 33, 1);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:132) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:127) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:126) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:132) */
        TarUtils.formatNameBytes(string, null, -255, 1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method formatNameBytes(java.lang.String, [B, int, int)
    
    @Test
    public void testFormatNameBytesByFuzzer() {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MAX_VALUE, java.lang.Byte.MAX_VALUE};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:132) */
        TarUtils.formatNameBytes("abc", byteArray, 0, 2147221503);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseOctal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseOctal([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < end; ++i)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testParseOctal_CurrentByteEqualsZero() {
        byte[] byteArray = {(byte) -127, (byte) 0};
        
        long actual = TarUtils.parseOctal(byteArray, 1, 1);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < end; ++i)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testParseOctal_StillPadding() {
        byte[] byteArray = {(byte) 48};
        
        long actual = TarUtils.parseOctal(byteArray, 0, 1);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < end; ++i)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testParseOctal_StillPadding_1() {
        byte[] byteArray = {(byte) 32};
        
        long actual = TarUtils.parseOctal(byteArray, 0, 1);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < end; ++i)} twice
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testParseOctal_CurrentByteEquals() {
        byte[] byteArray = {(byte) 55, (byte) 32};
        
        long actual = TarUtils.parseOctal(byteArray, 0, 3);
        
        assertEquals(7L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < end; ++i)} twice
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testParseOctal_CurrentByteNotEquals() {
        byte[] byteArray = {(byte) 55, (byte) 48};
        
        long actual = TarUtils.parseOctal(byteArray, 0, 2);
        
        assertEquals(56L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testParseOctal_ReturnResult() {
        long actual = TarUtils.parseOctal(null, -1, 0);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseOctal([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < end; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final byte currentByte = buffer[i];
 *  */
    @Test
    public void testParseOctal_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:54) */
        TarUtils.parseOctal(byteArray, -256, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < end; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final byte currentByte = buffer[i];
 *  */
    @Test
    public void testParseOctal_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:54) */
        TarUtils.parseOctal(null, -254, 1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseOctal([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < end; ++i)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: currentByte < '0' || currentByte > '7'
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_ThrowIllegalArgumentException() {
        byte[] byteArray = {(byte) -127, (byte) 47};
        
        TarUtils.parseOctal(byteArray, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < end; ++i)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: currentByte < '0' || currentByte > '7'
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_ThrowIllegalArgumentException_1() {
        byte[] byteArray = {(byte) -127, (byte) 56};
        
        TarUtils.parseOctal(byteArray, 1, 1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parseOctal([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
     */
    @Test
    public void testParseOctalThrowsSIOOBEWithNonEmptyPrimitiveArrayAndCornerCase() {
        byte[] byteArray = {(byte) 1, (byte) 56, (byte) 49};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 33, length 3]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.<init>(String.java:523)
            java.base/java.lang.String.<init>(String.java:1419)
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:73) */
        TarUtils.parseOctal(byteArray, 0, 33);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
     */
    @Test
    public void testParseOctalThrowsAIOOBEWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) 1, (byte) 56, (byte) 49};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:54) */
        TarUtils.parseOctal(byteArray, 2, 33);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseOctal(byte[],int,int)}
     */
    @Test
    public void testParseOctalThrowsSIOOBEWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) 1, (byte) 49, (byte) 56};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseOctal] produces [java.lang.StringIndexOutOfBoundsException: offset 2, count 33, length 3]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.<init>(String.java:523)
            java.base/java.lang.String.<init>(String.java:1419)
            org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(TarUtils.java:73) */
        TarUtils.parseOctal(byteArray, 2, 33);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:152)
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:189) */
        TarUtils.formatOctalBytes(0L, byteArray, 193, -62);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test
    public void testFormatOctalBytes_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:157)
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:189) */
        TarUtils.formatOctalBytes(-255L, byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + idx++] = (byte) ' ';
 *  */
    @Test
    public void testFormatOctalBytes_ThrowArrayIndexOutOfBoundsException_2() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:191) */
        TarUtils.formatOctalBytes(0L, byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + idx] = 0;
 *  */
    @Test
    public void testFormatOctalBytes_ThrowArrayIndexOutOfBoundsException_3() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:192) */
        TarUtils.formatOctalBytes(0L, byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[offset + idx++] = (byte) ' ';
 *  */
    @Test
    public void testFormatOctalBytes_ThrowArrayIndexOutOfBoundsException_4() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:191) */
        TarUtils.formatOctalBytes(1L, byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#formatOctalBytes(long,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: formatUnsignedOctalString(value, buf, offset, idx);
 *  */
    @Test
    public void testFormatOctalBytes_ThrowArrayIndexOutOfBoundsException_5() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:168)
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:189) */
        TarUtils.formatOctalBytes(2L, byteArray, -15, 18);
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:192) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:168)
            org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(TarUtils.java:189) */
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
            org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(TarUtils.java:255) */
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
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#computeCheckSum(byte[])}
     */
    @Test
    public void testComputeCheckSumReturns3WithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) 1, (byte) 1, (byte) 1, (byte) 0};
        
        long actual = TarUtils.computeCheckSum(byteArray);
        
        assertEquals(3L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarUtils.parseName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseName([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < end; ++i)} once
 * @utbot.returnsFrom {@code return result.toString();}
 *  */
    @Test
    public void testParseName_IOfBufferEqualsZero() {
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[i] == 0
 *  */
    @Test
    public void testParseName_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:98) */
        TarUtils.parseName(byteArray, 129, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < end; ++i)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[i] == 0
 *  */
    @Test
    public void testParseName_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:98) */
        TarUtils.parseName(byteArray, 0, 11);
    }
    
    /**
    @utbot.classUnderTest {@link TarUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < end; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: buffer[i] == 0
 *  */
    @Test
    public void testParseName_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:98) */
        TarUtils.parseName(null, -254, 1);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method parseName([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int)}
     */
    @Test
    public void testParseNameWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) 0, (byte) -1, (byte) 1};
        
        String actual = TarUtils.parseName(byteArray, 1, 1);
        
        String expected = "\uFFFF";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parseName([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int)}
     */
    @Test
    public void testParseNameThrowsNASEWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) 0, (byte) -1, (byte) 1};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.lang.NegativeArraySizeException: -2147483647]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:88)
            java.base/java.lang.StringBuffer.<init>(StringBuffer.java:146)
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:94) */
        TarUtils.parseName(byteArray, 16, -2147483647);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int)}
     */
    @Test
    public void testParseNameThrowsAIOOBEWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) 0, (byte) 1, (byte) -1};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarUtils.parseName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:98) */
        TarUtils.parseName(byteArray, 1, 262145);
    }
    ///endregion
    
    ///endregion
}

