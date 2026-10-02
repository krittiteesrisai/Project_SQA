package org.apache.commons.codec.binary;

import org.junit.Test;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_codec_binary_BaseNCodecInputStreamTest {
    ///region Test suites for executable org.apache.commons.codec.binary.BaseNCodecInputStream.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link BaseNCodecInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.BaseNCodecInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testRead_LenEqualsZero() throws IOException  {
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
        byte[] byteArray = {};
        
        int actual = baseNCodecInputStream.read(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BaseNCodecInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.BaseNCodecInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.iterates iterate the loop {@code while(readLen == 0)} once
 * @utbot.returnsFrom {@code return readLen;}
 *  */
    @Test
    public void testRead_BaseNCodecHasData() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        byte[] buffer = {(byte) -127, (byte) -127};
        base32.buffer = buffer;
        base32.pos = 2;
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, base32, false);
        byte[] byteArray = new byte[32];
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
        
        int actual = baseNCodecInputStream.read(byteArray, 1, 2);
        
        assertEquals(2, actual);
        
        BaseNCodec baseNCodecInputStreamBaseNCodec = ((BaseNCodec) getFieldValue(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "baseNCodec"));
        byte[] finalBaseNCodecInputStreamBaseNCodecBuffer = ((byte[]) getFieldValue(baseNCodecInputStreamBaseNCodec, "org.apache.commons.codec.binary.BaseNCodec", "buffer"));
        BaseNCodec baseNCodecInputStreamBaseNCodec1 = ((BaseNCodec) getFieldValue(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "baseNCodec"));
        int finalBaseNCodecInputStreamBaseNCodecReadPos = ((Integer) getFieldValue(baseNCodecInputStreamBaseNCodec1, "org.apache.commons.codec.binary.BaseNCodec", "readPos"));
        
        assertNull(finalBaseNCodecInputStreamBaseNCodecBuffer);
        
        assertEquals(2, finalBaseNCodecInputStreamBaseNCodecReadPos);
    }
    
    /**
    @utbot.classUnderTest {@link BaseNCodecInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.BaseNCodecInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.iterates iterate the loop {@code while(readLen == 0)} once
 * @utbot.returnsFrom {@code return readLen;}
 *  */
    @Test
    public void testRead_BaseNCodecHasData_1() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        byte[] buffer = new byte[31];
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
        buffer[16] = (byte) -127;
        buffer[17] = (byte) -127;
        buffer[18] = (byte) -127;
        buffer[19] = (byte) -127;
        buffer[20] = (byte) -127;
        buffer[21] = (byte) -127;
        buffer[22] = (byte) -127;
        buffer[23] = (byte) -127;
        buffer[24] = (byte) -127;
        buffer[25] = (byte) -127;
        buffer[26] = (byte) -127;
        buffer[27] = (byte) -127;
        buffer[28] = (byte) -127;
        buffer[29] = (byte) -127;
        buffer[30] = (byte) -127;
        base32.buffer = buffer;
        base32.pos = 32;
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "readPos", 17);
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, base32, false);
        byte[] byteArray = new byte[26];
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
        byteArray[12] = (byte) -126;
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
        
        int actual = baseNCodecInputStream.read(byteArray, 3, 14);
        
        assertEquals(14, actual);
        
        BaseNCodec baseNCodecInputStreamBaseNCodec = ((BaseNCodec) getFieldValue(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "baseNCodec"));
        int finalBaseNCodecInputStreamBaseNCodecReadPos = ((Integer) getFieldValue(baseNCodecInputStreamBaseNCodec, "org.apache.commons.codec.binary.BaseNCodec", "readPos"));
        
        byte finalByteArray12 = byteArray[12];
        
        assertEquals(31, finalBaseNCodecInputStreamBaseNCodecReadPos);
        
        assertEquals((byte) -127, finalByteArray12);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link BaseNCodecInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.BaseNCodecInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (b == null): False}
 * @utbot.executesCondition {@code (offset < 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: offset < 0 || len < 0
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException() throws IOException  {
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
        byte[] byteArray = {(byte) -127};
        
        baseNCodecInputStream.read(byteArray, -1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link BaseNCodecInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.BaseNCodecInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (b == null): False}
 * @utbot.executesCondition {@code (offset < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (offset > b.length): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: offset > b.length || offset + len > b.length
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_1() throws IOException  {
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
        byte[] byteArray = {};
        
        baseNCodecInputStream.read(byteArray, 1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link BaseNCodecInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.BaseNCodecInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (b == null): False}
 * @utbot.executesCondition {@code (offset < 0): False}
 * @utbot.executesCondition {@code (len < 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: offset < 0 || len < 0
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_2() throws IOException  {
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
        byte[] byteArray = {(byte) -127};
        
        baseNCodecInputStream.read(byteArray, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link BaseNCodecInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.BaseNCodecInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (b == null): False}
 * @utbot.executesCondition {@code (offset < 0): False}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (offset > b.length): False}
 * @utbot.executesCondition {@code (offset + len > b.length): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: offset > b.length || offset + len > b.length
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException_3() throws IOException  {
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        baseNCodecInputStream.read(byteArray, 2, 1);
    }
    
    /**
    @utbot.classUnderTest {@link BaseNCodecInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.BaseNCodecInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (b == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: b == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testRead_ThrowNullPointerException() throws IOException  {
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
        
        baseNCodecInputStream.read(null, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link BaseNCodecInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.BaseNCodecInputStream#read(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(readLen == 0)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: readLen = baseNCodec.readResults(b, offset, len);
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        byte[] buffer = {(byte) -127};
        base32.buffer = buffer;
        base32.pos = 2;
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "readPos", -1);
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, base32, false);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.codec.binary.BaseNCodecInputStream.read] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.codec.binary.BaseNCodec.readResults(BaseNCodec.java:216)
            org.apache.commons.codec.binary.BaseNCodecInputStream.read(BaseNCodecInputStream.java:122) */
        baseNCodecInputStream.read(byteArray, 2, 3);
    }
    
    /**
    @utbot.classUnderTest {@link BaseNCodecInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.BaseNCodecInputStream#read(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(readLen == 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !baseNCodec.hasData()
 *  */
    @Test
    public void testRead_ThrowNullPointerException_1() throws IOException  {
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
        byte[] byteArray = new byte[32];
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
        
        /* This test fails because method [org.apache.commons.codec.binary.BaseNCodecInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.BaseNCodecInputStream.read(BaseNCodecInputStream.java:113) */
        baseNCodecInputStream.read(byteArray, 1, 12);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.BaseNCodecInputStream.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link BaseNCodecInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.BaseNCodecInputStream#read()}
 * @utbot.executesCondition {@code (b < 0): True}
 * @utbot.returnsFrom {@code return b < 0 ? 256 + b : b;}
 *  */
    @Test
    public void testRead_BLessThanZero() throws Exception  {
        BaseNCodecInputStream baseNCodecInputStream = ((BaseNCodecInputStream) createInstance("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        Base32 baseNCodec = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        byte[] buffer = {(byte) -1};
        baseNCodec.buffer = buffer;
        baseNCodec.pos = 1;
        setField(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "baseNCodec", baseNCodec);
        byte[] singleByte = {(byte) -127};
        setField(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "singleByte", singleByte);
        
        int actual = baseNCodecInputStream.read();
        
        assertEquals(255, actual);
        
        BaseNCodec baseNCodecInputStreamBaseNCodec = ((BaseNCodec) getFieldValue(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "baseNCodec"));
        byte[] finalBaseNCodecInputStreamBaseNCodecBuffer = ((byte[]) getFieldValue(baseNCodecInputStreamBaseNCodec, "org.apache.commons.codec.binary.BaseNCodec", "buffer"));
        BaseNCodec baseNCodecInputStreamBaseNCodec1 = ((BaseNCodec) getFieldValue(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "baseNCodec"));
        int finalBaseNCodecInputStreamBaseNCodecReadPos = ((Integer) getFieldValue(baseNCodecInputStreamBaseNCodec1, "org.apache.commons.codec.binary.BaseNCodec", "readPos"));
        byte[] baseNCodecInputStreamSingleByte = ((byte[]) getFieldValue(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "singleByte"));
        byte finalBaseNCodecInputStreamSingleByte0 = ((Byte) get(baseNCodecInputStreamSingleByte, 0));
        
        assertNull(finalBaseNCodecInputStreamBaseNCodecBuffer);
        
        assertEquals(1, finalBaseNCodecInputStreamBaseNCodecReadPos);
        
        assertEquals((byte) -1, finalBaseNCodecInputStreamSingleByte0);
    }
    
    /**
    @utbot.classUnderTest {@link BaseNCodecInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.BaseNCodecInputStream#read()}
 * @utbot.executesCondition {@code (b < 0): False}
 * @utbot.returnsFrom {@code return b < 0 ? 256 + b : b;}
 *  */
    @Test
    public void testRead_BGreaterOrEqualZero() throws Exception  {
        BaseNCodecInputStream baseNCodecInputStream = ((BaseNCodecInputStream) createInstance("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        Base32 baseNCodec = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        byte[] buffer = {(byte) 0};
        baseNCodec.buffer = buffer;
        baseNCodec.pos = 1;
        setField(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "baseNCodec", baseNCodec);
        byte[] singleByte = {(byte) -127};
        setField(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "singleByte", singleByte);
        
        int actual = baseNCodecInputStream.read();
        
        assertEquals(0, actual);
        
        BaseNCodec baseNCodecInputStreamBaseNCodec = ((BaseNCodec) getFieldValue(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "baseNCodec"));
        byte[] finalBaseNCodecInputStreamBaseNCodecBuffer = ((byte[]) getFieldValue(baseNCodecInputStreamBaseNCodec, "org.apache.commons.codec.binary.BaseNCodec", "buffer"));
        BaseNCodec baseNCodecInputStreamBaseNCodec1 = ((BaseNCodec) getFieldValue(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "baseNCodec"));
        int finalBaseNCodecInputStreamBaseNCodecReadPos = ((Integer) getFieldValue(baseNCodecInputStreamBaseNCodec1, "org.apache.commons.codec.binary.BaseNCodec", "readPos"));
        byte[] baseNCodecInputStreamSingleByte = ((byte[]) getFieldValue(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "singleByte"));
        byte finalBaseNCodecInputStreamSingleByte0 = ((Byte) get(baseNCodecInputStreamSingleByte, 0));
        
        assertNull(finalBaseNCodecInputStreamBaseNCodecBuffer);
        
        assertEquals(1, finalBaseNCodecInputStreamBaseNCodecReadPos);
        
        assertEquals((byte) 0, finalBaseNCodecInputStreamSingleByte0);
    }
    
    /**
    @utbot.classUnderTest {@link BaseNCodecInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.BaseNCodecInputStream#read()}
 * @utbot.executesCondition {@code (b < 0): False}
 * @utbot.returnsFrom {@code return b < 0 ? 256 + b : b;}
 *  */
    @Test
    public void testRead_BGreaterOrEqualZero_1() throws Exception  {
        BaseNCodecInputStream baseNCodecInputStream = ((BaseNCodecInputStream) createInstance("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        Base32 baseNCodec = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        byte[] buffer = {(byte) 0};
        baseNCodec.buffer = buffer;
        baseNCodec.pos = 2;
        setField(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "baseNCodec", baseNCodec);
        byte[] singleByte = {(byte) -127};
        setField(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "singleByte", singleByte);
        
        int actual = baseNCodecInputStream.read();
        
        assertEquals(0, actual);
        
        BaseNCodec baseNCodecInputStreamBaseNCodec = ((BaseNCodec) getFieldValue(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "baseNCodec"));
        int finalBaseNCodecInputStreamBaseNCodecReadPos = ((Integer) getFieldValue(baseNCodecInputStreamBaseNCodec, "org.apache.commons.codec.binary.BaseNCodec", "readPos"));
        byte[] baseNCodecInputStreamSingleByte = ((byte[]) getFieldValue(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "singleByte"));
        byte finalBaseNCodecInputStreamSingleByte0 = ((Byte) get(baseNCodecInputStreamSingleByte, 0));
        
        assertEquals(1, finalBaseNCodecInputStreamBaseNCodecReadPos);
        
        assertEquals((byte) 0, finalBaseNCodecInputStreamSingleByte0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link BaseNCodecInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.BaseNCodecInputStream#read()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int r = read(singleByte, 0, 1);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException1() throws Exception  {
        BaseNCodecInputStream baseNCodecInputStream = ((BaseNCodecInputStream) createInstance("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        byte[] singleByte = {};
        setField(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "singleByte", singleByte);
        
        baseNCodecInputStream.read();
    }
    
    /**
    @utbot.classUnderTest {@link BaseNCodecInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.BaseNCodecInputStream#read()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int r = read(singleByte, 0, 1);
 *  */
    @Test(expected = NullPointerException.class)
    public void testRead_ThrowNullPointerException1() throws Exception  {
        BaseNCodecInputStream baseNCodecInputStream = ((BaseNCodecInputStream) createInstance("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        
        baseNCodecInputStream.read();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read()
    
    /**
    @utbot.classUnderTest {@link BaseNCodecInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.BaseNCodecInputStream#read()}
 * @utbot.invokes {@link org.apache.commons.codec.binary.BaseNCodecInputStream#read(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int r = read(singleByte, 0, 1);
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        BaseNCodecInputStream baseNCodecInputStream = ((BaseNCodecInputStream) createInstance("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        Base32 baseNCodec = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        byte[] buffer = {(byte) -127};
        baseNCodec.buffer = buffer;
        setField(baseNCodec, "org.apache.commons.codec.binary.BaseNCodec", "readPos", -1);
        setField(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "baseNCodec", baseNCodec);
        byte[] singleByte = {(byte) -127};
        setField(baseNCodecInputStream, "org.apache.commons.codec.binary.BaseNCodecInputStream", "singleByte", singleByte);
        
        /* This test fails because method [org.apache.commons.codec.binary.BaseNCodecInputStream.read] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.codec.binary.BaseNCodec.readResults(BaseNCodec.java:216)
            org.apache.commons.codec.binary.BaseNCodecInputStream.read(BaseNCodecInputStream.java:122)
            org.apache.commons.codec.binary.BaseNCodecInputStream.read(BaseNCodecInputStream.java:54) */
        baseNCodecInputStream.read();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.BaseNCodecInputStream.markSupported
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method markSupported()
    
    /**
    @utbot.classUnderTest {@link BaseNCodecInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.BaseNCodecInputStream#markSupported()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMarkSupported_ReturnFalse() {
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
        
        boolean actual = baseNCodecInputStream.markSupported();
        
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields876203061940700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields876203061940700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass876203061949500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields876203061940700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass876203061949500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields876203062409900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields876203062409900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass876203062412400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields876203062409900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass876203062412400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

