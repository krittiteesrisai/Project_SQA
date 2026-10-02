package org.apache.commons.codec.binary;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_codec_binary_Base64InputStreamTest {
    ///region Test suites for executable org.apache.commons.codec.binary.Base64InputStream.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testRead_LenEqualsZero() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        byte[] byteArray = {};
        
        int actual = base64InputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (!base64.hasData()): False}
 * @utbot.returnsFrom {@code return base64.readResults(b, offset, len);}
 *  */
    @Test
    public void testRead_Base64HasData() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) -127, (byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -126);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -128);
        setField(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64", base64);
        
        int actual = base64InputStream.read(buffer, 0, 2);
        
        assertEquals(2, actual);
        
        Base64 base64InputStreamBase64 = ((Base64) getFieldValue(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64"));
        byte[] finalBase64InputStreamBase64Buffer = ((byte[]) getFieldValue(base64InputStreamBase64, "org.apache.commons.codec.binary.Base64", "buffer"));
        
        assertNull(finalBase64InputStreamBase64Buffer);
    }
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (!base64.hasData()): False}
 * @utbot.returnsFrom {@code return base64.readResults(b, offset, len);}
 *  */
    @Test
    public void testRead_Base64HasData_1() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 2);
        setField(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64", base64);
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
        
        int actual = base64InputStream.read(byteArray, 34, 1);
        
        assertEquals(1, actual);
        
        Base64 base64InputStreamBase64 = ((Base64) getFieldValue(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64"));
        int finalBase64InputStreamBase64ReadPos = ((Integer) getFieldValue(base64InputStreamBase64, "org.apache.commons.codec.binary.Base64", "readPos"));
        
        assertEquals(1, finalBase64InputStreamBase64ReadPos);
    }
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (!base64.hasData()): False}
 * @utbot.returnsFrom {@code return base64.readResults(b, offset, len);}
 *  */
    @Test
    public void testRead_Base64HasData_2() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = new byte[40];
        buffer[0] = (byte) -127;
        buffer[1] = (byte) -127;
        buffer[2] = (byte) -127;
        buffer[3] = (byte) -127;
        buffer[4] = (byte) -127;
        buffer[5] = (byte) -127;
        buffer[6] = (byte) -127;
        buffer[7] = (byte) -127;
        buffer[8] = (byte) -127;
        buffer[9] = (byte) -127;
        buffer[10] = (byte) -127;
        buffer[11] = (byte) -127;
        buffer[12] = (byte) -127;
        buffer[13] = (byte) -127;
        buffer[14] = (byte) -127;
        buffer[15] = (byte) -127;
        buffer[16] = (byte) -124;
        buffer[17] = (byte) -124;
        buffer[18] = (byte) -127;
        buffer[19] = (byte) -127;
        buffer[20] = (byte) -127;
        buffer[21] = (byte) -126;
        buffer[22] = (byte) -127;
        buffer[23] = (byte) -126;
        buffer[24] = (byte) -64;
        buffer[25] = (byte) -124;
        buffer[26] = (byte) -126;
        buffer[27] = (byte) -124;
        buffer[28] = (byte) -120;
        buffer[29] = (byte) -127;
        buffer[30] = (byte) -127;
        buffer[31] = java.lang.Byte.MIN_VALUE;
        buffer[32] = (byte) -127;
        buffer[33] = (byte) -126;
        buffer[34] = (byte) -126;
        buffer[35] = (byte) -120;
        buffer[36] = (byte) -124;
        buffer[37] = (byte) -120;
        buffer[38] = (byte) -126;
        buffer[39] = (byte) -124;
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -2147483629);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", 30);
        setField(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64", base64);
        byte[] byteArray = new byte[26];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -126;
        byteArray[7] = (byte) -126;
        byteArray[8] = (byte) -126;
        byteArray[9] = (byte) -126;
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
        
        int actual = base64InputStream.read(byteArray, 11, 4);
        
        assertEquals(4, actual);
        
        Base64 base64InputStreamBase64 = ((Base64) getFieldValue(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64"));
        byte[] finalBase64InputStreamBase64Buffer = ((byte[]) getFieldValue(base64InputStreamBase64, "org.apache.commons.codec.binary.Base64", "buffer"));
        Base64 base64InputStreamBase641 = ((Base64) getFieldValue(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64"));
        int finalBase64InputStreamBase64ReadPos = ((Integer) getFieldValue(base64InputStreamBase641, "org.apache.commons.codec.binary.Base64", "readPos"));
        
        byte finalByteArray12 = byteArray[12];
        byte finalByteArray14 = byteArray[14];
        
        assertNull(finalBase64InputStreamBase64Buffer);
        
        assertEquals(34, finalBase64InputStreamBase64ReadPos);
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalByteArray12);
        
        assertEquals((byte) -126, finalByteArray14);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (b == null): False}
 * @utbot.executesCondition {@code (offset < 0): False}
 * @utbot.executesCondition {@code (len < 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: offset < 0 || len < 0
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        byte[] byteArray = {(byte) -127};
        
        base64InputStream.read(byteArray, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (b == null): False}
 * @utbot.executesCondition {@code (offset < 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: offset < 0 || len < 0
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        byte[] byteArray = {(byte) -127};
        
        base64InputStream.read(byteArray, -1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (b == null): False}
 * @utbot.executesCondition {@code (offset < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (offset > b.length): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: offset > b.length || offset + len > b.length
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        byte[] byteArray = {};
        
        base64InputStream.read(byteArray, 1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (b == null): False}
 * @utbot.executesCondition {@code (offset < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (offset > b.length): False}
 * @utbot.executesCondition {@code (offset + len > b.length): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: offset > b.length || offset + len > b.length
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_3() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        base64InputStream.read(byteArray, 2, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (b == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: b == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testRead_ThrowNullPointerException() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        
        base64InputStream.read(null, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (!base64.hasData()): False}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#hasData()}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#readResults(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return base64.readResults(b, offset, len);
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 41);
        setField(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64", base64);
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
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64InputStream.read] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 40 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.codec.binary.Base64.readResults(Base64.java:410)
            org.apache.commons.codec.binary.Base64InputStream.read(Base64InputStream.java:178) */
        base64InputStream.read(byteArray, 0, 40);
    }
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#hasData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !base64.hasData()
 *  */
    @Test
    public void testRead_ThrowNullPointerException_1() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
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
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64InputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64InputStream.read(Base64InputStream.java:164) */
        base64InputStream.read(byteArray, 9, 6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64InputStream.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read()}
 * @utbot.executesCondition {@code (r > 0): False}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testRead_RLessOrEqualZero() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 402653269);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", 402653393);
        setField(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64", base64);
        setField(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "singleByte", buffer);
        
        int actual = base64InputStream.read();
        
        assertEquals(-1, actual);
        
        Base64 base64InputStreamBase64 = ((Base64) getFieldValue(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64"));
        byte[] finalBase64InputStreamBase64Buffer = ((byte[]) getFieldValue(base64InputStreamBase64, "org.apache.commons.codec.binary.Base64", "buffer"));
        
        assertNull(finalBase64InputStreamBase64Buffer);
    }
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read()}
 * @utbot.executesCondition {@code (r > 0): True}
 * @utbot.executesCondition {@code (singleByte[0] < 0): False}
 * @utbot.returnsFrom {@code return singleByte[0] < 0 ? 256 + singleByte[0] : singleByte[0];}
 *  */
    @Test
    public void testRead_0OfSingleByteGreaterOrEqualZero() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -5);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -6);
        setField(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64", base64);
        setField(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "singleByte", buffer);
        
        int actual = base64InputStream.read();
        
        assertEquals(0, actual);
        
        Base64 base64InputStreamBase64 = ((Base64) getFieldValue(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64"));
        byte[] finalBase64InputStreamBase64Buffer = ((byte[]) getFieldValue(base64InputStreamBase64, "org.apache.commons.codec.binary.Base64", "buffer"));
        
        assertNull(finalBase64InputStreamBase64Buffer);
    }
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read()}
 * @utbot.executesCondition {@code (r > 0): True}
 * @utbot.executesCondition {@code (singleByte[0] < 0): True}
 * @utbot.returnsFrom {@code return singleByte[0] < 0 ? 256 + singleByte[0] : singleByte[0];}
 *  */
    @Test
    public void testRead_0OfSingleByteLessThanZero() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) -1};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -5);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -6);
        setField(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64", base64);
        setField(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "singleByte", buffer);
        
        int actual = base64InputStream.read();
        
        assertEquals(255, actual);
        
        Base64 base64InputStreamBase64 = ((Base64) getFieldValue(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64"));
        byte[] finalBase64InputStreamBase64Buffer = ((byte[]) getFieldValue(base64InputStreamBase64, "org.apache.commons.codec.binary.Base64", "buffer"));
        
        assertNull(finalBase64InputStreamBase64Buffer);
    }
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read()}
 * @utbot.executesCondition {@code (r > 0): True}
 * @utbot.executesCondition {@code (singleByte[0] < 0): True}
 * @utbot.returnsFrom {@code return singleByte[0] < 0 ? 256 + singleByte[0] : singleByte[0];}
 *  */
    @Test
    public void testRead_0OfSingleByteLessThanZero_1() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) -1};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 1);
        setField(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64", base64);
        byte[] singleByte = {(byte) -127};
        setField(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "singleByte", singleByte);
        
        int actual = base64InputStream.read();
        
        assertEquals(255, actual);
        
        Base64 base64InputStreamBase64 = ((Base64) getFieldValue(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64"));
        byte[] finalBase64InputStreamBase64Buffer = ((byte[]) getFieldValue(base64InputStreamBase64, "org.apache.commons.codec.binary.Base64", "buffer"));
        Base64 base64InputStreamBase641 = ((Base64) getFieldValue(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64"));
        int finalBase64InputStreamBase64ReadPos = ((Integer) getFieldValue(base64InputStreamBase641, "org.apache.commons.codec.binary.Base64", "readPos"));
        byte[] base64InputStreamSingleByte = ((byte[]) getFieldValue(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "singleByte"));
        byte finalBase64InputStreamSingleByte0 = ((Byte) get(base64InputStreamSingleByte, 0));
        
        assertNull(finalBase64InputStreamBase64Buffer);
        
        assertEquals(1, finalBase64InputStreamBase64ReadPos);
        
        assertEquals((byte) -1, finalBase64InputStreamSingleByte0);
    }
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read()}
 * @utbot.executesCondition {@code (r > 0): True}
 * @utbot.executesCondition {@code (singleByte[0] < 0): False}
 * @utbot.returnsFrom {@code return singleByte[0] < 0 ? 256 + singleByte[0] : singleByte[0];}
 *  */
    @Test
    public void testRead_0OfSingleByteGreaterOrEqualZero_1() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 2);
        setField(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64", base64);
        byte[] singleByte = {(byte) -127};
        setField(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "singleByte", singleByte);
        
        int actual = base64InputStream.read();
        
        assertEquals(0, actual);
        
        Base64 base64InputStreamBase64 = ((Base64) getFieldValue(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64"));
        int finalBase64InputStreamBase64ReadPos = ((Integer) getFieldValue(base64InputStreamBase64, "org.apache.commons.codec.binary.Base64", "readPos"));
        byte[] base64InputStreamSingleByte = ((byte[]) getFieldValue(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "singleByte"));
        byte finalBase64InputStreamSingleByte0 = ((Byte) get(base64InputStreamSingleByte, 0));
        
        assertEquals(1, finalBase64InputStreamBase64ReadPos);
        
        assertEquals((byte) 0, finalBase64InputStreamSingleByte0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int r = read(singleByte, 0, 1);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException1() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        byte[] singleByte = {};
        setField(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "singleByte", singleByte);
        
        base64InputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int r = read(singleByte, 0, 1);
 *  */
    @Test(expected = NullPointerException.class)
    public void testRead_ThrowNullPointerException1() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        
        base64InputStream.read();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read()
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read()}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64InputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int r = read(singleByte, 0, 1);
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -1);
        setField(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "base64", base64);
        byte[] singleByte = {(byte) -127};
        setField(base64InputStream, "org.apache.commons.codec.binary.Base64InputStream", "singleByte", singleByte);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64InputStream.read] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.codec.binary.Base64.readResults(Base64.java:410)
            org.apache.commons.codec.binary.Base64InputStream.read(Base64InputStream.java:178)
            org.apache.commons.codec.binary.Base64InputStream.read(Base64InputStream.java:109) */
        base64InputStream.read();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method read()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64InputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read()}
     */
    @Test
    public void testRead() throws IOException  {
        byte[] byteArray = {(byte) 0};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray, 1, 1);
        Base64InputStream base64InputStream = new Base64InputStream(byteArrayInputStream, false);
        
        int actual = base64InputStream.read();
        
        assertEquals(-1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64InputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read()}
     */
    @Test
    public void testRead1() throws IOException  {
        byte[] byteArray = {(byte) 0};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray, 1, 1);
        Base64InputStream base64InputStream = new Base64InputStream(byteArrayInputStream, true);
        
        int actual = base64InputStream.read();
        
        assertEquals(-1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64InputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read()}
     */
    @Test
    public void testRead2() throws IOException  {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MAX_VALUE, (byte) -1, (byte) -1, (byte) 0};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        Base64InputStream base64InputStream = new Base64InputStream(byteArrayInputStream, false);
        
        int actual = base64InputStream.read();
        
        assertEquals(-1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64InputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read()}
     */
    @Test
    public void testReadReturns65() throws IOException  {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MAX_VALUE, (byte) -1, (byte) -1, (byte) 0};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        Base64InputStream base64InputStream = new Base64InputStream(byteArrayInputStream, true);
        
        int actual = base64InputStream.read();
        
        assertEquals(65, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64InputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#read()}
     */
    @Test
    public void testRead3() throws IOException  {
        byte[] byteArray = {(byte) 1, (byte) 0, (byte) 1};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray, 0, 0);
        byte[] byteArray1 = {(byte) 1, (byte) -1};
        Base64InputStream base64InputStream = new Base64InputStream(byteArrayInputStream, true, 0, byteArray1);
        
        int actual = base64InputStream.read();
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64InputStream.markSupported
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method markSupported()
    
    /**
    @utbot.classUnderTest {@link Base64InputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64InputStream#markSupported()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMarkSupported_ReturnFalse() throws Exception  {
        Base64InputStream base64InputStream = ((Base64InputStream) createInstance("org.apache.commons.codec.binary.Base64InputStream"));
        
        boolean actual = base64InputStream.markSupported();
        
        assertFalse(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields875571833184800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields875571833184800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass875571833191300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields875571833184800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass875571833191300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields875571833579400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields875571833579400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass875571833583300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields875571833579400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass875571833583300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

