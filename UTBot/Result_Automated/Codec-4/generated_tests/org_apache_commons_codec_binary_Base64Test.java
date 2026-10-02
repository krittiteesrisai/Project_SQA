package org.apache.commons.codec.binary;

import org.junit.Test;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_codec_binary_Base64Test {
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.decode
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method decode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(java.lang.Object)}
 * @utbot.executesCondition {@code (pObject instanceof byte[]): False}
 * @utbot.executesCondition {@code (pObject instanceof String): False}
 * @utbot.throwsException {@link org.apache.commons.codec.DecoderException} when: pObject instanceof String
 *  */
    @Test(expected = DecoderException.class)
    public void testDecode_ThrowDecoderException() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        
        base64.decode(((Object) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method decode(java.lang.Object)
    
    @Test
    public void testDecode1() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        String string = "";
        
        byte[] actual = ((byte[]) base64.decode(((Object) string)));
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testDecode2() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] byteArray = new byte[13];
        
        byte[] actual = ((byte[]) base64.decode(((Object) byteArray)));
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
        
        boolean finalBase64Eof = ((Boolean) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "eof"));
        
        assertTrue(finalBase64Eof);
    }
    
    @Test
    public void testDecode3() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] byteArray = {};
        
        byte[] actual = ((byte[]) base64.decode(((Object) byteArray)));
        
        assertArrayEquals(byteArray, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.decode
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method decode(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(java.lang.String)}
     */
    @Test
    public void testDecodeWithNonEmptyString() {
        Base64 base64 = new Base64();
        
        byte[] actual = base64.decode("ZX");
        
        byte[] expected = {(byte) 101};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method decode(java.lang.String)
    
    @Test
    public void testDecode4() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        String string = "";
        
        byte[] actual = base64.decode(string);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testDecode5() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        
        byte[] actual = base64.decode(((String) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.decode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method decode([B, int, int)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.executesCondition {@code (eof): False}
 *  */
    @Test
    public void testDecode_NotEof() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        
        base64.decode(null, -255, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testDecode_Eof() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "eof", true);
        
        base64.decode(null, -255, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.executesCondition {@code (modulus != 0): False}
 *  */
    @Test
    public void testDecode_ModulusEqualsZero() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        
        base64.decode(null, -255, -1);
        
        boolean finalBase64Eof = ((Boolean) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "eof"));
        
        assertTrue(finalBase64Eof);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.executesCondition {@code (modulus != 0): True}
 * @utbot.activatesSwitch {@code switch(modulus) case: default}
 *  */
    @Test
    public void testDecode_SwitchModulusCasedefault() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        base64.decode(null, -255, -1);
        
        boolean finalBase64Eof = ((Boolean) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "eof"));
        int finalBase64X = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "x"));
        
        assertTrue(finalBase64Eof);
        
        assertEquals(-16320, finalBase64X);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.executesCondition {@code (modulus != 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 *  */
    @Test
    public void testDecode_BEqualsPAD() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "decodeSize", -248);
        byte[] buffer = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 248);
        byte[] byteArray = {(byte) -127, (byte) 61};
        
        base64.decode(byteArray, 1, 1);
        
        boolean finalBase64Eof = ((Boolean) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "eof"));
        
        assertTrue(finalBase64Eof);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.executesCondition {@code (eof): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 *  */
    @Test
    public void testDecode_BLessThanZero() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "decodeSize", -254);
        byte[] buffer = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 254);
        byte[] byteArray = {(byte) -127, (byte) -1};
        
        base64.decode(byteArray, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.executesCondition {@code (modulus != 0): True}
 * @utbot.activatesSwitch {@code switch(modulus) case: 2}
 *  */
    @Test
    public void testDecode_SwitchModulusCase2() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        base64.decode(null, -255, -1);
        
        byte[] base64Buffer = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buffer"));
        byte finalBase64Buffer0 = ((Byte) get(base64Buffer, 0));
        int finalBase64Pos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "pos"));
        boolean finalBase64Eof = ((Boolean) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "eof"));
        int finalBase64X = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "x"));
        
        assertEquals((byte) -16, finalBase64Buffer0);
        
        assertEquals(1, finalBase64Pos);
        
        assertTrue(finalBase64Eof);
        
        assertEquals(-1044480, finalBase64X);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.executesCondition {@code (modulus != 0): True}
 * @utbot.activatesSwitch {@code switch(modulus) case: 3}
 *  */
    @Test
    public void testDecode_SwitchModulusCase3() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) 0, (byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 3);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        base64.decode(null, -255, -1);
        
        byte[] base64Buffer = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buffer"));
        byte finalBase64Buffer0 = ((Byte) get(base64Buffer, 0));
        byte[] base64Buffer1 = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buffer"));
        byte finalBase64Buffer1 = ((Byte) get(base64Buffer1, 1));
        int finalBase64Pos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "pos"));
        boolean finalBase64Eof = ((Boolean) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "eof"));
        int finalBase64X = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "x"));
        
        assertEquals((byte) -1, finalBase64Buffer0);
        
        assertEquals((byte) -64, finalBase64Buffer1);
        
        assertEquals(2, finalBase64Pos);
        
        assertTrue(finalBase64Eof);
        
        assertEquals(-16320, finalBase64X);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.executesCondition {@code (eof): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 *  */
    @Test
    public void testDecode_ResultLessThanZero() throws Exception  {
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
            setField(base64, "org.apache.commons.codec.binary.Base64", "decodeSize", -244);
            byte[] buffer = {};
            setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
            setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 244);
            byte[] byteArray = {(byte) -127, (byte) 1};
            
            base64.decode(byteArray, 1, 1);
        } finally {
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 *  */
    @Test
    public void testDecode_ModulusEqualsZero_1() throws Exception  {
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
            setField(base64, "org.apache.commons.codec.binary.Base64", "decodeSize", 64);
            byte[] buffer = {};
            setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
            setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -65);
            setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -5);
            byte[] byteArray = {(byte) 0, (byte) 65};
            
            base64.decode(byteArray, 1, 1);
        } finally {
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method decode([B, int, int)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: byte b = in[inPos++];
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "decodeSize", -252);
        byte[] buffer = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 252);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 2]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:549) */
        base64.decode(byteArray, -256, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.executesCondition {@code (modulus != 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = (byte) ((x >> 16) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 1073741824);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 3);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:581) */
        base64.decode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.executesCondition {@code (modulus != 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = (byte) ((x >> 16) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 134217728);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 134217728 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:578) */
        base64.decode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.executesCondition {@code (modulus != 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = (byte) ((x >> 8) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 3);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:582) */
        base64.decode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte b = in[inPos++];
 *  */
    @Test
    public void testDecode_ThrowNullPointerException() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "decodeSize", -255);
        byte[] buffer = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 256);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:549) */
        base64.decode(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte b = in[inPos++];
 *  */
    @Test
    public void testDecode_ThrowNullPointerException_3() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "decodeSize", 256);
        byte[] buffer = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:549) */
        base64.decode(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.executesCondition {@code (modulus != 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer[pos++] = (byte) ((x >> 16) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowNullPointerException_1() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 3);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:581) */
        base64.decode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.executesCondition {@code (modulus != 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer[pos++] = (byte) ((x >> 16) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowNullPointerException_2() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:578) */
        base64.decode(null, -255, -1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method decode([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
     */
    @Test
    public void testDecodeThrowsAIOOBEWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) 0, (byte) 16, (byte) 0, (byte) 0};
        Base64 base64 = new Base64(1, byteArray, true);
        byte[] byteArray1 = {(byte) 3, (byte) 1, (byte) 1, (byte) 0, (byte) 4};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2143289343 out of bounds for length 5]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:549) */
        base64.decode(byteArray1, 2143289343, 2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.decode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method decode([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[])}
 * @utbot.executesCondition {@code (pArray == null): False}
 * @utbot.executesCondition {@code (pArray.length == 0): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testDecode_PArrayLengthNotEqualsZero() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
        byte[] byteArray = {(byte) 61};
        
        byte[] actual = base64.decode(byteArray);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
        
        int finalBase64Pos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "pos"));
        int finalBase64ReadPos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "readPos"));
        int finalBase64CurrentLinePos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos"));
        int finalBase64Modulus = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "modulus"));
        boolean finalBase64Eof = ((Boolean) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "eof"));
        
        assertEquals(0, finalBase64Pos);
        
        assertEquals(0, finalBase64ReadPos);
        
        assertEquals(0, finalBase64CurrentLinePos);
        
        assertEquals(0, finalBase64Modulus);
        
        assertTrue(finalBase64Eof);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[])}
 * @utbot.executesCondition {@code (pArray == null): False}
 * @utbot.executesCondition {@code (pArray.length == 0): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testDecode_PArrayLengthNotEqualsZero_1() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
        byte[] byteArray = {(byte) -1};
        
        byte[] actual = base64.decode(byteArray);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
        
        int finalBase64Pos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "pos"));
        int finalBase64ReadPos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "readPos"));
        int finalBase64CurrentLinePos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos"));
        int finalBase64Modulus = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "modulus"));
        boolean finalBase64Eof = ((Boolean) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "eof"));
        
        assertEquals(0, finalBase64Pos);
        
        assertEquals(0, finalBase64ReadPos);
        
        assertEquals(0, finalBase64CurrentLinePos);
        
        assertEquals(0, finalBase64Modulus);
        
        assertTrue(finalBase64Eof);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[])}
 * @utbot.executesCondition {@code (pArray == null): False}
 * @utbot.executesCondition {@code (pArray.length == 0): True}
 * @utbot.returnsFrom {@code return pArray;}
 *  */
    @Test
    public void testDecode_PArrayLengthEqualsZero() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos", -255);
        byte[] byteArray = {};
        
        byte[] actual = base64.decode(byteArray);
        
        assertArrayEquals(byteArray, actual);
        
        int finalBase64Pos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "pos"));
        int finalBase64ReadPos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "readPos"));
        int finalBase64CurrentLinePos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos"));
        
        assertEquals(0, finalBase64Pos);
        
        assertEquals(0, finalBase64ReadPos);
        
        assertEquals(0, finalBase64CurrentLinePos);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[])}
 * @utbot.executesCondition {@code (pArray == null): True}
 * @utbot.returnsFrom {@code return pArray;}
 *  */
    @Test
    public void testDecode_PArrayEqualsNull() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
        
        byte[] actual = base64.decode(((byte[]) null));
        
        assertNull(actual);
        
        int finalBase64Pos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "pos"));
        int finalBase64ReadPos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "readPos"));
        int finalBase64CurrentLinePos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos"));
        int finalBase64Modulus = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "modulus"));
        
        assertEquals(0, finalBase64Pos);
        
        assertEquals(0, finalBase64ReadPos);
        
        assertEquals(0, finalBase64CurrentLinePos);
        
        assertEquals(0, finalBase64Modulus);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method decode([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[])}
     */
    @Test
    public void testDecodeWithNonEmptyPrimitiveArray() {
        Base64 base64 = new Base64();
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0};
        
        byte[] actual = base64.decode(byteArray);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.encode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encode([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[])}
 * @utbot.executesCondition {@code (pArray.length == 0): True}
 * @utbot.returnsFrom {@code return pArray;}
 *  */
    @Test
    public void testEncode_PArrayLengthEqualsZero() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos", -255);
        byte[] byteArray = {};
        
        byte[] actual = base64.encode(byteArray);
        
        assertArrayEquals(byteArray, actual);
        
        int finalBase64Pos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "pos"));
        int finalBase64ReadPos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "readPos"));
        int finalBase64CurrentLinePos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos"));
        
        assertEquals(0, finalBase64Pos);
        
        assertEquals(0, finalBase64ReadPos);
        
        assertEquals(0, finalBase64CurrentLinePos);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[])}
 * @utbot.returnsFrom {@code return pArray;}
 *  */
    @Test
    public void testEncode_ReturnPArray() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
        
        byte[] actual = base64.encode(((byte[]) null));
        
        assertNull(actual);
        
        int finalBase64Pos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "pos"));
        int finalBase64ReadPos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "readPos"));
        int finalBase64CurrentLinePos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos"));
        int finalBase64Modulus = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "modulus"));
        
        assertEquals(0, finalBase64Pos);
        
        assertEquals(0, finalBase64ReadPos);
        
        assertEquals(0, finalBase64CurrentLinePos);
        
        assertEquals(0, finalBase64Modulus);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method encode([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long len = getEncodeLength(pArray, lineLength, lineSeparator);
 *  */
    @Test
    public void testEncode_ThrowNullPointerException() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 45);
        byte[] buffer = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
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
        byteArray[30] = (byte) -127;
        byteArray[31] = (byte) -127;
        byteArray[32] = (byte) -127;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.getEncodeLength(Base64.java:974)
            org.apache.commons.codec.binary.Base64.encode(Base64.java:933) */
        base64.encode(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long len = getEncodeLength(pArray, lineLength, lineSeparator);
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_1() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 5);
        byte[] buffer = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.getEncodeLength(Base64.java:974)
            org.apache.commons.codec.binary.Base64.encode(Base64.java:933) */
        base64.encode(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long len = getEncodeLength(pArray, lineLength, lineSeparator);
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_2() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 128);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.getEncodeLength(Base64.java:974)
            org.apache.commons.codec.binary.Base64.encode(Base64.java:933) */
        base64.encode(byteArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method encode([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[])}
     */
    @Test
    public void testEncodeWithNonEmptyPrimitiveArray() {
        Base64 base64 = new Base64();
        byte[] byteArray = {(byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        byte[] actual = base64.encode(byteArray);
        
        byte[] expected = {(byte) 65, (byte) 89, (byte) 68, (byte) 47, (byte) 13, (byte) 10};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.encode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method encode([B, int, int)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testEncode_Eof() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "eof", true);
        
        base64.encode(null, -255, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 *  */
    @Test
    public void testEncode_InAvailGreaterOrEqualZero() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        
        base64.encode(null, -255, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 *  */
    @Test
    public void testEncode_ZeroNotEqualsModulus() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 406913026);
        byte[] buffer = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -406913025);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 1577359626);
        byte[] byteArray = {(byte) 0};
        
        base64.encode(byteArray, 0, 1);
        
        int finalBase64Modulus = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "modulus"));
        
        assertEquals(1, finalBase64Modulus);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method encode([B, int, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (eof): False},
    ///     {@code (inAvail < 0): True},
    ///     {@code (buffer == null): False}
    /// activate {@code switch(modulus) case: default}.
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (buffer.length - pos < encodeSize): False}
 * @utbot.executesCondition {@code (lineLength > 0): False}
 *  */
    @Test
    public void testEncode_LineLengthLessOrEqualZero() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -256);
        byte[] buffer = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 256);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
        
        base64.encode(null, -255, -1);
        
        boolean finalBase64Eof = ((Boolean) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "eof"));
        
        assertTrue(finalBase64Eof);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (buffer.length - pos < encodeSize): False}
 * @utbot.executesCondition {@code (lineLength > 0): True}
 * @utbot.executesCondition {@code (pos > 0): False}
 *  */
    @Test
    public void testEncode_PosLessOrEqualZero() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 1);
        byte[] buffer = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
        
        base64.encode(null, -255, -1);
        
        boolean finalBase64Eof = ((Boolean) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "eof"));
        
        assertTrue(finalBase64Eof);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (buffer.length - pos < encodeSize): True}
 * @utbot.executesCondition {@code (lineLength > 0): True}
 * @utbot.executesCondition {@code (pos > 0): False}
 * @utbot.invokes org.apache.commons.codec.binary.Base64#resizeBuffer()
 *  */
    @Test
    public void testEncode_BufferLengthMinusPosLessThanEncodeSize() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 1);
        byte[] buffer = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        
        byte[] initialBase64Buffer = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buffer"));
        
        base64.encode(null, -255, -1);
        
        byte[] finalBase64Buffer = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buffer"));
        boolean finalBase64Eof = ((Boolean) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "eof"));
        
        assertFalse(initialBase64Buffer == finalBase64Buffer);
        
        assertTrue(finalBase64Eof);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method encode([B, int, int)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int b = in[inPos++];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 3);
        byte[] buffer = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -3);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:494) */
        base64.encode(byteArray, -256, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = encodeTable[(x >> 18) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_18() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -1073741823);
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 1073741824);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -1171333390);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 8388608);
        byte[] byteArray = {(byte) -127, (byte) -1};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:500) */
        base64.encode(byteArray, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buffer == null): False}
 * @utbot.executesCondition {@code (buffer.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = encodeTable[(x >> 10) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 1);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:475) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buffer == null): False}
 * @utbot.executesCondition {@code (buffer.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = encodeTable[(x >> 2) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -127);
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 128);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 1);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:465) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buffer == null): False}
 * @utbot.executesCondition {@code (buffer.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = encodeTable[(x >> 4) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 128);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:476) */
        base64.encode(null, 1, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buffer == null): False}
 * @utbot.executesCondition {@code (buffer.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = encodeTable[(x << 4) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 2);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:466) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buffer == null): False}
 * @utbot.executesCondition {@code (buffer.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = encodeTable[(x << 4) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 1);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:466) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = encodeTable[(x >> 18) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 1074257930);
        byte[] buffer = {(byte) 0, (byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -1074257928);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -1934621800);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 32769);
        byte[] byteArray = {(byte) -127, (byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:500) */
        base64.encode(byteArray, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = encodeTable[(x >> 12) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 1);
        byte[] buffer = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -1377397990);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 1);
        byte[] byteArray = {(byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:501) */
        base64.encode(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = encodeTable[(x >> 12) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 1);
        byte[] buffer = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -1381318246);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 513);
        byte[] byteArray = {(byte) -127, (byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:501) */
        base64.encode(byteArray, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = encodeTable[(x >> 6) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_14() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 2);
        byte[] buffer = {(byte) 0, (byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -1182916612);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 8);
        byte[] byteArray = {(byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:502) */
        base64.encode(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = encodeTable[(x >> 6) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_15() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 2);
        byte[] buffer = {(byte) 0, (byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -946715494);
        byte[] byteArray = {(byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:502) */
        base64.encode(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = encodeTable[x & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_16() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 3);
        byte[] buffer = new byte[13];
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 10);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -723920644);
        byte[] byteArray = {(byte) 1};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:503) */
        base64.encode(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = encodeTable[(x >> 18) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_17() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 262144);
        byte[] buffer = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -262143);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -560743174);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 8421376);
        byte[] byteArray = {(byte) -1, (byte) -127};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:500) */
        base64.encode(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buffer == null): False}
 * @utbot.executesCondition {@code (buffer.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = encodeTable[(x >> 10) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) -127, (byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -254);
        byte[] buffer = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 254);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 63 out of bounds for length 2]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:475) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buffer == null): False}
 * @utbot.executesCondition {@code (buffer.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = encodeTable[(x >> 2) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -254);
        byte[] buffer = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 16);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:465) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buffer == null): False}
 * @utbot.executesCondition {@code (buffer.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = encodeTable[(x >> 4) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 1);
        byte[] buffer = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 1);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:476) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buffer == null): False}
 * @utbot.executesCondition {@code (buffer.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = encodeTable[(x << 2) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 2);
        byte[] buffer = {(byte) -127, (byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 2);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:477) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buffer == null): False}
 * @utbot.executesCondition {@code (buffer.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[pos++] = encodeTable[(x << 2) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) -127, (byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 2);
        byte[] buffer = {(byte) -127, (byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 16);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:477) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int b = in[inPos++];
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_3() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -2147483646);
        byte[] buffer = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", Integer.MAX_VALUE);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:494) */
        base64.encode(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer[pos++] = encodeTable[(x >> 18) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_4() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 9442306);
        byte[] buffer = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -9442305);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -1076599942);
        byte[] byteArray = {(byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:500) */
        base64.encode(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buffer == null): False}
 * @utbot.executesCondition {@code (buffer.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer[pos++] = encodeTable[(x >> 10) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowNullPointerException1() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -254);
        byte[] buffer = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 254);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:475) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buffer == null): False}
 * @utbot.executesCondition {@code (buffer.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer[pos++] = encodeTable[(x >> 2) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_11() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -254);
        byte[] buffer = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 254);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 1);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:465) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buffer == null): False}
 * @utbot.executesCondition {@code (buffer.length - pos < encodeSize): False}
 * @utbot.executesCondition {@code (lineLength > 0): True}
 * @utbot.executesCondition {@code (pos > 0): True}
 * @utbot.activatesSwitch {@code switch(modulus) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(lineSeparator, 0, buffer, pos, lineSeparator.length);
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_21() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -1);
        byte[] buffer = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:485) */
        base64.encode(null, -255, -1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method encode([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
     */
    @Test
    public void testEncodeThrowsAIOOBEWithNonEmptyPrimitiveArrayAndCornerCase() {
        Base64 base64 = new Base64();
        byte[] byteArray = {(byte) 2, (byte) 2, (byte) 12};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483647 out of bounds for length 3]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:494) */
        base64.encode(byteArray, Integer.MAX_VALUE, 18);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.encode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(java.lang.Object)}
 * @utbot.executesCondition {@code (!(pObject instanceof byte[])): False}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#encode(byte[])}
 * @utbot.returnsFrom {@code return encode((byte[]) pObject);}
 *  */
    @Test
    public void testEncode_PObjectNotInstanceOfByte() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
        byte[] byteArray = {};
        
        byte[] actual = ((byte[]) base64.encode(((Object) byteArray)));
        
        assertArrayEquals(byteArray, actual);
        
        int finalBase64Pos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "pos"));
        int finalBase64ReadPos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "readPos"));
        int finalBase64CurrentLinePos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos"));
        int finalBase64Modulus = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "modulus"));
        
        assertEquals(0, finalBase64Pos);
        
        assertEquals(0, finalBase64ReadPos);
        
        assertEquals(0, finalBase64CurrentLinePos);
        
        assertEquals(0, finalBase64Modulus);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method encode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(java.lang.Object)}
 * @utbot.executesCondition {@code (!(pObject instanceof byte[])): True}
 * @utbot.throwsException {@link org.apache.commons.codec.EncoderException} when: !(pObject instanceof byte[])
 *  */
    @Test(expected = EncoderException.class)
    public void testEncode_ThrowEncoderException() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        
        base64.encode(((Object) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method encode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return encode((byte[]) pObject);
 *  */
    @Test
    public void testEncode_ThrowNullPointerException2() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 16);
        byte[] buffer = {(byte) 2, (byte) -120};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", 16);
        setField(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -224);
        byte[] byteArray = new byte[24];
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.getEncodeLength(Base64.java:974)
            org.apache.commons.codec.binary.Base64.encode(Base64.java:933)
            org.apache.commons.codec.binary.Base64.encode(Base64.java:906) */
        base64.encode(((Object) byteArray));
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return encode((byte[]) pObject);
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_12() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 208);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
        byte[] byteArray = {(byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.getEncodeLength(Base64.java:974)
            org.apache.commons.codec.binary.Base64.encode(Base64.java:933)
            org.apache.commons.codec.binary.Base64.encode(Base64.java:906) */
        base64.encode(((Object) byteArray));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.avail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method avail()
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#avail()}
 * @utbot.executesCondition {@code (buffer != null): True}
 * @utbot.returnsFrom {@code return buffer != null ? pos - readPos : 0;}
 *  */
    @Test
    public void testAvail_BufferNotEqualsNull() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -255);
        
        int actual = base64.avail();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#avail()}
 * @utbot.executesCondition {@code (buffer != null): False}
 * @utbot.returnsFrom {@code return buffer != null ? pos - readPos : 0;}
 *  */
    @Test
    public void testAvail_BufferEqualsNull() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        
        int actual = base64.avail();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.reset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reset()
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#reset()}
 *  */
    @Test
    public void testReset() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
        
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Method resetMethod = base64Clazz.getDeclaredMethod("reset");
        resetMethod.setAccessible(true);
        java.lang.Object[] resetMethodArguments = new java.lang.Object[0];
        resetMethod.invoke(base64, resetMethodArguments);
        
        int finalBase64Pos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "pos"));
        int finalBase64ReadPos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "readPos"));
        int finalBase64CurrentLinePos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos"));
        int finalBase64Modulus = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "modulus"));
        
        assertEquals(0, finalBase64Pos);
        
        assertEquals(0, finalBase64ReadPos);
        
        assertEquals(0, finalBase64CurrentLinePos);
        
        assertEquals(0, finalBase64Modulus);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method encodeBase64URLSafeString([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64URLSafeString(byte[])}
     */
    @Test
    public void testEncodeBase64URLSafeStringWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) 0, (byte) -1, java.lang.Byte.MAX_VALUE};
        
        String actual = Base64.encodeBase64URLSafeString(byteArray);
        
        String expected = "AP9_";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encodeBase64URLSafeString([B)
    
    @Test
    public void testEncodeBase64URLSafeString1() {
        byte[] byteArray = {};
        
        String actual = Base64.encodeBase64URLSafeString(byteArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEncodeBase64URLSafeString2() {
        String actual = Base64.encodeBase64URLSafeString(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.encodeBase64URLSafe
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encodeBase64URLSafe([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64URLSafe(byte[])}
 * @utbot.returnsFrom {@code return encodeBase64(binaryData, false, true);}
 *  */
    @Test
    public void testEncodeBase64URLSafe_ReturnEncodeBase64_1() {
        byte[] byteArray = {};
        
        byte[] actual = Base64.encodeBase64URLSafe(byteArray);
        
        assertArrayEquals(byteArray, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64URLSafe(byte[])}
 * @utbot.returnsFrom {@code return encodeBase64(binaryData, false, true);}
 *  */
    @Test
    public void testEncodeBase64URLSafe_ReturnEncodeBase64() {
        byte[] actual = Base64.encodeBase64URLSafe(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method encodeBase64URLSafe([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64URLSafe(byte[])}
     */
    @Test
    public void testEncodeBase64URLSafeWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) 0, (byte) -1, java.lang.Byte.MAX_VALUE};
        
        byte[] actual = Base64.encodeBase64URLSafe(byteArray);
        
        byte[] expected = {(byte) 65, (byte) 80, (byte) 57, (byte) 95};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.encodeBase64Chunked
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encodeBase64Chunked([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64Chunked(byte[])}
 * @utbot.returnsFrom {@code return encodeBase64(binaryData, true);}
 *  */
    @Test
    public void testEncodeBase64Chunked_ReturnEncodeBase64_1() {
        byte[] byteArray = {};
        
        byte[] actual = Base64.encodeBase64Chunked(byteArray);
        
        assertArrayEquals(byteArray, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64Chunked(byte[])}
 * @utbot.returnsFrom {@code return encodeBase64(binaryData, true);}
 *  */
    @Test
    public void testEncodeBase64Chunked_ReturnEncodeBase64() {
        byte[] actual = Base64.encodeBase64Chunked(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method encodeBase64Chunked([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64Chunked(byte[])}
     */
    @Test
    public void testEncodeBase64ChunkedWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MAX_VALUE, (byte) -1};
        
        byte[] actual = Base64.encodeBase64Chunked(byteArray);
        
        byte[] expected = {(byte) 65, (byte) 88, (byte) 47, (byte) 47, (byte) 13, (byte) 10};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.decodeBase64
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method decodeBase64(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decodeBase64(java.lang.String)}
     */
    @Test
    public void testDecodeBase64WithNonEmptyString() {
        byte[] actual = Base64.decodeBase64("\u0014\n\t\r");
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method decodeBase64(java.lang.String)
    
    @Test
    public void testDecodeBase641() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            String string = "";
            
            byte[] actual = Base64.decodeBase64(string);
            
            byte[] expected = {};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testDecodeBase642() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            
            byte[] actual = Base64.decodeBase64(((String) null));
            
            assertNull(actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.decodeBase64
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method decodeBase64([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decodeBase64(byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return new Base64().decode(base64Data);}
 *  */
    @Test
    public void testDecodeBase64_ReturnNewBase64Decode() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = {};
            
            byte[] actual = Base64.decodeBase64(byteArray);
            
            assertArrayEquals(byteArray, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decodeBase64(byte[])}
 * @utbot.returnsFrom {@code return new Base64().decode(base64Data);}
 *  */
    @Test
    public void testDecodeBase64_ReturnNewBase64Decode_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            
            byte[] actual = Base64.decodeBase64(((byte[]) null));
            
            assertNull(actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method decodeBase64([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decodeBase64(byte[])}
     */
    @Test
    public void testDecodeBase64WithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        byte[] actual = Base64.decodeBase64(byteArray);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.readResults
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readResults([B, int, int)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#readResults(byte[],int,int)}
 * @utbot.executesCondition {@code (buffer != null): True}
 * @utbot.executesCondition {@code (buffer != b): False}
 * @utbot.returnsFrom {@code return len;}
 *  */
    @Test
    public void testReadResults_BufferEqualsB() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -254);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -253);
        
        int actual = base64.readResults(buffer, -255, -2);
        
        assertEquals(-2, actual);
        
        byte[] finalBase64Buffer = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buffer"));
        
        assertNull(finalBase64Buffer);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#readResults(byte[],int,int)}
 * @utbot.executesCondition {@code (buffer != null): True}
 * @utbot.executesCondition {@code (buffer != b): True}
 * @utbot.executesCondition {@code (readPos >= pos): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return len;}
 *  */
    @Test
    public void testReadResults_ReadPosLessThanPos() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 1);
        byte[] byteArray = {(byte) -127};
        
        int actual = base64.readResults(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#readResults(byte[],int,int)}
 * @utbot.executesCondition {@code (buffer != null): False}
 * @utbot.executesCondition {@code (eof): False}
 * @utbot.returnsFrom {@code return eof ? -1 : 0;}
 *  */
    @Test
    public void testReadResults_NotEof() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        
        int actual = base64.readResults(null, -255, -255);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#readResults(byte[],int,int)}
 * @utbot.executesCondition {@code (buffer != null): False}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.returnsFrom {@code return eof ? -1 : 0;}
 *  */
    @Test
    public void testReadResults_Eof() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "eof", true);
        
        int actual = base64.readResults(null, -255, -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readResults([B, int, int)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#readResults(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(buffer, readPos, b, bPos, len);
 *  */
    @Test
    public void testReadResults_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.readResults] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.codec.binary.Base64.readResults(Base64.java:398) */
        base64.readResults(byteArray, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#readResults(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(buffer, readPos, b, bPos, len);
 *  */
    @Test
    public void testReadResults_ThrowNullPointerException() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -254);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -253);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.readResults] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.codec.binary.Base64.readResults(Base64.java:398) */
        base64.readResults(null, -255, -2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.encodeBase64
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encodeBase64([B, boolean)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean)}
 * @utbot.returnsFrom {@code return encodeBase64(binaryData, isChunked, false);}
 *  */
    @Test
    public void testEncodeBase64_ReturnEncodeBase64_1() {
        byte[] byteArray = {};
        
        byte[] actual = Base64.encodeBase64(byteArray, false);
        
        assertArrayEquals(byteArray, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean)}
 * @utbot.returnsFrom {@code return encodeBase64(binaryData, isChunked, false);}
 *  */
    @Test
    public void testEncodeBase64_ReturnEncodeBase64() {
        byte[] actual = Base64.encodeBase64(null, false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encodeBase64([B, boolean)
    
    @Test
    public void testEncodeBase641() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = new byte[12];
            
            byte[] actual = Base64.encodeBase64(byteArray, true);
            
            byte[] expected = new byte[18];
            expected[0] = (byte) 65;
            expected[1] = (byte) 65;
            expected[2] = (byte) 65;
            expected[3] = (byte) 65;
            expected[4] = (byte) 65;
            expected[5] = (byte) 65;
            expected[6] = (byte) 65;
            expected[7] = (byte) 65;
            expected[8] = (byte) 65;
            expected[9] = (byte) 65;
            expected[10] = (byte) 65;
            expected[11] = (byte) 65;
            expected[12] = (byte) 65;
            expected[13] = (byte) 65;
            expected[14] = (byte) 65;
            expected[15] = (byte) 65;
            expected[16] = (byte) 13;
            expected[17] = (byte) 10;
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testEncodeBase642() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = {
                java.lang.Byte.MIN_VALUE, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73,
                (byte) 73
            };
            
            byte[] actual = Base64.encodeBase64(byteArray, false);
            
            byte[] expected = new byte[12];
            expected[0] = (byte) 103;
            expected[1] = (byte) 69;
            expected[2] = (byte) 108;
            expected[3] = (byte) 74;
            expected[4] = (byte) 83;
            expected[5] = (byte) 85;
            expected[6] = (byte) 108;
            expected[7] = (byte) 74;
            expected[8] = (byte) 83;
            expected[9] = (byte) 85;
            expected[10] = (byte) 108;
            expected[11] = (byte) 74;
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testEncodeBase643() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = {(byte) 0};
            
            byte[] actual = Base64.encodeBase64(byteArray, false);
            
            byte[] expected = {(byte) 65, (byte) 65, (byte) 61, (byte) 61};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testEncodeBase644() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = new byte[17];
            byteArray[0] = java.lang.Byte.MIN_VALUE;
            byteArray[1] = (byte) 73;
            byteArray[2] = (byte) 73;
            byteArray[3] = (byte) 73;
            byteArray[4] = (byte) 73;
            byteArray[5] = (byte) 73;
            byteArray[6] = (byte) 73;
            byteArray[7] = (byte) 73;
            byteArray[8] = (byte) 73;
            byteArray[9] = (byte) 73;
            byteArray[10] = (byte) 73;
            byteArray[11] = (byte) 73;
            byteArray[12] = (byte) 73;
            byteArray[13] = (byte) 73;
            byteArray[14] = (byte) 73;
            byteArray[15] = (byte) 73;
            byteArray[16] = (byte) 73;
            
            byte[] actual = Base64.encodeBase64(byteArray, false);
            
            byte[] expected = new byte[24];
            expected[0] = (byte) 103;
            expected[1] = (byte) 69;
            expected[2] = (byte) 108;
            expected[3] = (byte) 74;
            expected[4] = (byte) 83;
            expected[5] = (byte) 85;
            expected[6] = (byte) 108;
            expected[7] = (byte) 74;
            expected[8] = (byte) 83;
            expected[9] = (byte) 85;
            expected[10] = (byte) 108;
            expected[11] = (byte) 74;
            expected[12] = (byte) 83;
            expected[13] = (byte) 85;
            expected[14] = (byte) 108;
            expected[15] = (byte) 74;
            expected[16] = (byte) 83;
            expected[17] = (byte) 85;
            expected[18] = (byte) 108;
            expected[19] = (byte) 74;
            expected[20] = (byte) 83;
            expected[21] = (byte) 85;
            expected[22] = (byte) 107;
            expected[23] = (byte) 61;
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.encodeBase64
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encodeBase64([B, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean,boolean)}
 * @utbot.returnsFrom {@code return encodeBase64(binaryData, isChunked, urlSafe, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testEncodeBase64_ReturnEncodeBase64_11() {
        byte[] byteArray = {};
        
        byte[] actual = Base64.encodeBase64(byteArray, false, false);
        
        assertArrayEquals(byteArray, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean,boolean)}
 * @utbot.returnsFrom {@code return encodeBase64(binaryData, isChunked, urlSafe, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testEncodeBase64_ReturnEncodeBase641() {
        byte[] actual = Base64.encodeBase64(null, false, false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method encodeBase64([B, boolean, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean,boolean)}
     */
    @Test
    public void testEncodeBase64WithNonEmptyPrimitiveArray() {
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, java.lang.Byte.MAX_VALUE, java.lang.Byte.MIN_VALUE, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        byte[] actual = Base64.encodeBase64(byteArray, true, true);
        
        byte[] expected = {
            (byte) 103, (byte) 72, (byte) 45, (byte) 65, (byte) 95, (byte) 52, (byte) 65, (byte) 13,
            (byte) 10
        };
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encodeBase64([B, boolean, boolean)
    
    @Test
    public void testEncodeBase645() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevURL_SAFE_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "URL_SAFE_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] urlSafeEncodeTable = new byte[40];
            urlSafeEncodeTable[0] = (byte) 65;
            urlSafeEncodeTable[1] = (byte) 66;
            urlSafeEncodeTable[2] = (byte) 67;
            urlSafeEncodeTable[3] = (byte) 68;
            urlSafeEncodeTable[4] = (byte) 69;
            urlSafeEncodeTable[5] = (byte) 70;
            urlSafeEncodeTable[6] = (byte) 71;
            urlSafeEncodeTable[7] = (byte) 72;
            urlSafeEncodeTable[8] = (byte) 73;
            urlSafeEncodeTable[9] = (byte) 74;
            urlSafeEncodeTable[10] = (byte) 75;
            urlSafeEncodeTable[11] = (byte) 76;
            urlSafeEncodeTable[12] = (byte) 77;
            urlSafeEncodeTable[13] = (byte) 78;
            urlSafeEncodeTable[14] = (byte) 79;
            urlSafeEncodeTable[15] = (byte) 80;
            urlSafeEncodeTable[16] = (byte) 81;
            urlSafeEncodeTable[17] = (byte) 82;
            urlSafeEncodeTable[18] = (byte) 83;
            urlSafeEncodeTable[19] = (byte) 84;
            urlSafeEncodeTable[20] = (byte) 85;
            urlSafeEncodeTable[21] = (byte) 86;
            urlSafeEncodeTable[22] = (byte) 87;
            urlSafeEncodeTable[23] = (byte) 88;
            urlSafeEncodeTable[24] = (byte) 89;
            urlSafeEncodeTable[25] = (byte) 90;
            urlSafeEncodeTable[26] = (byte) 97;
            urlSafeEncodeTable[27] = (byte) 98;
            urlSafeEncodeTable[28] = (byte) 99;
            urlSafeEncodeTable[29] = (byte) 100;
            urlSafeEncodeTable[30] = (byte) 101;
            urlSafeEncodeTable[31] = (byte) 102;
            urlSafeEncodeTable[32] = (byte) 103;
            urlSafeEncodeTable[33] = (byte) 104;
            urlSafeEncodeTable[34] = (byte) 105;
            urlSafeEncodeTable[35] = (byte) 106;
            urlSafeEncodeTable[36] = (byte) 107;
            urlSafeEncodeTable[37] = (byte) 108;
            urlSafeEncodeTable[38] = (byte) 109;
            urlSafeEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "URL_SAFE_ENCODE_TABLE", urlSafeEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            
            byte[] actual = Base64.encodeBase64(byteArray, true, true);
            
            byte[] expected = {
                (byte) 65, (byte) 65, (byte) 65, (byte) 65, (byte) 65, (byte) 65, (byte) 65, (byte) 65,
                (byte) 13, (byte) 10
            };
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testEncodeBase646() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = {
                java.lang.Byte.MIN_VALUE, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73,
                (byte) 73
            };
            
            byte[] actual = Base64.encodeBase64(byteArray, false, false);
            
            byte[] expected = new byte[12];
            expected[0] = (byte) 103;
            expected[1] = (byte) 69;
            expected[2] = (byte) 108;
            expected[3] = (byte) 74;
            expected[4] = (byte) 83;
            expected[5] = (byte) 85;
            expected[6] = (byte) 108;
            expected[7] = (byte) 74;
            expected[8] = (byte) 83;
            expected[9] = (byte) 85;
            expected[10] = (byte) 108;
            expected[11] = (byte) 74;
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testEncodeBase647() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = {(byte) 0, (byte) 0};
            
            byte[] actual = Base64.encodeBase64(byteArray, true, false);
            
            byte[] expected = {(byte) 65, (byte) 65, (byte) 65, (byte) 61, (byte) 13, (byte) 10};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.encodeBase64
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encodeBase64([B, boolean, boolean, int)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean,boolean,int)}
 * @utbot.executesCondition {@code (binaryData == null): False}
 * @utbot.executesCondition {@code (binaryData.length == 0): True}
 * @utbot.returnsFrom {@code return binaryData;}
 *  */
    @Test
    public void testEncodeBase64_BinaryDataLengthEqualsZero() {
        byte[] byteArray = {};
        
        byte[] actual = Base64.encodeBase64(byteArray, false, false, -255);
        
        assertArrayEquals(byteArray, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean,boolean,int)}
 * @utbot.executesCondition {@code (binaryData == null): True}
 * @utbot.returnsFrom {@code return binaryData;}
 *  */
    @Test
    public void testEncodeBase64_BinaryDataEqualsNull() {
        byte[] actual = Base64.encodeBase64(null, false, false, -255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method encodeBase64([B, boolean, boolean, int)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean,boolean,int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: len > maxResultSize
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64_ThrowIllegalArgumentException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] byteArray = new byte[24];
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
            
            Base64.encodeBase64(byteArray, false, false, -255);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean,boolean,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: len > maxResultSize
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64_ThrowIllegalArgumentException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] byteArray = {(byte) -127};
            
            Base64.encodeBase64(byteArray, false, false, 5);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encodeBase64([B, boolean, boolean, int)
    
    @Test
    public void testEncodeBase648() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevURL_SAFE_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "URL_SAFE_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] urlSafeEncodeTable = new byte[40];
            urlSafeEncodeTable[0] = (byte) 65;
            urlSafeEncodeTable[1] = (byte) 66;
            urlSafeEncodeTable[2] = (byte) 67;
            urlSafeEncodeTable[3] = (byte) 68;
            urlSafeEncodeTable[4] = (byte) 69;
            urlSafeEncodeTable[5] = (byte) 70;
            urlSafeEncodeTable[6] = (byte) 71;
            urlSafeEncodeTable[7] = (byte) 72;
            urlSafeEncodeTable[8] = (byte) 73;
            urlSafeEncodeTable[9] = (byte) 74;
            urlSafeEncodeTable[10] = (byte) 75;
            urlSafeEncodeTable[11] = (byte) 76;
            urlSafeEncodeTable[12] = (byte) 77;
            urlSafeEncodeTable[13] = (byte) 78;
            urlSafeEncodeTable[14] = (byte) 79;
            urlSafeEncodeTable[15] = (byte) 80;
            urlSafeEncodeTable[16] = (byte) 81;
            urlSafeEncodeTable[17] = (byte) 82;
            urlSafeEncodeTable[18] = (byte) 83;
            urlSafeEncodeTable[19] = (byte) 84;
            urlSafeEncodeTable[20] = (byte) 85;
            urlSafeEncodeTable[21] = (byte) 86;
            urlSafeEncodeTable[22] = (byte) 87;
            urlSafeEncodeTable[23] = (byte) 88;
            urlSafeEncodeTable[24] = (byte) 89;
            urlSafeEncodeTable[25] = (byte) 90;
            urlSafeEncodeTable[26] = (byte) 97;
            urlSafeEncodeTable[27] = (byte) 98;
            urlSafeEncodeTable[28] = (byte) 99;
            urlSafeEncodeTable[29] = (byte) 100;
            urlSafeEncodeTable[30] = (byte) 101;
            urlSafeEncodeTable[31] = (byte) 102;
            urlSafeEncodeTable[32] = (byte) 103;
            urlSafeEncodeTable[33] = (byte) 104;
            urlSafeEncodeTable[34] = (byte) 105;
            urlSafeEncodeTable[35] = (byte) 106;
            urlSafeEncodeTable[36] = (byte) 107;
            urlSafeEncodeTable[37] = (byte) 108;
            urlSafeEncodeTable[38] = (byte) 109;
            urlSafeEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "URL_SAFE_ENCODE_TABLE", urlSafeEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = {java.lang.Byte.MIN_VALUE, (byte) 73};
            
            byte[] actual = Base64.encodeBase64(byteArray, false, true, 1073741828);
            
            byte[] expected = {(byte) 103, (byte) 69, (byte) 107};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testEncodeBase649() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevURL_SAFE_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "URL_SAFE_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] urlSafeEncodeTable = new byte[40];
            urlSafeEncodeTable[0] = (byte) 65;
            urlSafeEncodeTable[1] = (byte) 66;
            urlSafeEncodeTable[2] = (byte) 67;
            urlSafeEncodeTable[3] = (byte) 68;
            urlSafeEncodeTable[4] = (byte) 69;
            urlSafeEncodeTable[5] = (byte) 70;
            urlSafeEncodeTable[6] = (byte) 71;
            urlSafeEncodeTable[7] = (byte) 72;
            urlSafeEncodeTable[8] = (byte) 73;
            urlSafeEncodeTable[9] = (byte) 74;
            urlSafeEncodeTable[10] = (byte) 75;
            urlSafeEncodeTable[11] = (byte) 76;
            urlSafeEncodeTable[12] = (byte) 77;
            urlSafeEncodeTable[13] = (byte) 78;
            urlSafeEncodeTable[14] = (byte) 79;
            urlSafeEncodeTable[15] = (byte) 80;
            urlSafeEncodeTable[16] = (byte) 81;
            urlSafeEncodeTable[17] = (byte) 82;
            urlSafeEncodeTable[18] = (byte) 83;
            urlSafeEncodeTable[19] = (byte) 84;
            urlSafeEncodeTable[20] = (byte) 85;
            urlSafeEncodeTable[21] = (byte) 86;
            urlSafeEncodeTable[22] = (byte) 87;
            urlSafeEncodeTable[23] = (byte) 88;
            urlSafeEncodeTable[24] = (byte) 89;
            urlSafeEncodeTable[25] = (byte) 90;
            urlSafeEncodeTable[26] = (byte) 97;
            urlSafeEncodeTable[27] = (byte) 98;
            urlSafeEncodeTable[28] = (byte) 99;
            urlSafeEncodeTable[29] = (byte) 100;
            urlSafeEncodeTable[30] = (byte) 101;
            urlSafeEncodeTable[31] = (byte) 102;
            urlSafeEncodeTable[32] = (byte) 103;
            urlSafeEncodeTable[33] = (byte) 104;
            urlSafeEncodeTable[34] = (byte) 105;
            urlSafeEncodeTable[35] = (byte) 106;
            urlSafeEncodeTable[36] = (byte) 107;
            urlSafeEncodeTable[37] = (byte) 108;
            urlSafeEncodeTable[38] = (byte) 109;
            urlSafeEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "URL_SAFE_ENCODE_TABLE", urlSafeEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = {java.lang.Byte.MIN_VALUE};
            
            byte[] actual = Base64.encodeBase64(byteArray, false, true, 1073741828);
            
            byte[] expected = {(byte) 103, (byte) 65};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testEncodeBase6410() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = {(byte) 0, (byte) 0};
            
            byte[] actual = Base64.encodeBase64(byteArray, false, false, 1073741828);
            
            byte[] expected = {(byte) 65, (byte) 65, (byte) 65, (byte) 61};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testEncodeBase6411() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = new byte[12];
            byteArray[0] = java.lang.Byte.MIN_VALUE;
            byteArray[1] = (byte) 73;
            byteArray[2] = (byte) 73;
            byteArray[3] = (byte) 73;
            byteArray[4] = (byte) 73;
            byteArray[5] = (byte) 73;
            byteArray[6] = (byte) 73;
            byteArray[7] = (byte) 73;
            byteArray[8] = (byte) 73;
            byteArray[9] = (byte) 73;
            byteArray[10] = (byte) 73;
            byteArray[11] = (byte) 73;
            
            byte[] actual = Base64.encodeBase64(byteArray, false, false, 1073741824);
            
            byte[] expected = new byte[16];
            expected[0] = (byte) 103;
            expected[1] = (byte) 69;
            expected[2] = (byte) 108;
            expected[3] = (byte) 74;
            expected[4] = (byte) 83;
            expected[5] = (byte) 85;
            expected[6] = (byte) 108;
            expected[7] = (byte) 74;
            expected[8] = (byte) 83;
            expected[9] = (byte) 85;
            expected[10] = (byte) 108;
            expected[11] = (byte) 74;
            expected[12] = (byte) 83;
            expected[13] = (byte) 85;
            expected[14] = (byte) 108;
            expected[15] = (byte) 74;
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testEncodeBase6412() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = new byte[18];
            
            byte[] actual = Base64.encodeBase64(byteArray, true, false, 1073741824);
            
            byte[] expected = new byte[26];
            expected[0] = (byte) 65;
            expected[1] = (byte) 65;
            expected[2] = (byte) 65;
            expected[3] = (byte) 65;
            expected[4] = (byte) 65;
            expected[5] = (byte) 65;
            expected[6] = (byte) 65;
            expected[7] = (byte) 65;
            expected[8] = (byte) 65;
            expected[9] = (byte) 65;
            expected[10] = (byte) 65;
            expected[11] = (byte) 65;
            expected[12] = (byte) 65;
            expected[13] = (byte) 65;
            expected[14] = (byte) 65;
            expected[15] = (byte) 65;
            expected[16] = (byte) 65;
            expected[17] = (byte) 65;
            expected[18] = (byte) 65;
            expected[19] = (byte) 65;
            expected[20] = (byte) 65;
            expected[21] = (byte) 65;
            expected[22] = (byte) 65;
            expected[23] = (byte) 65;
            expected[24] = (byte) 13;
            expected[25] = (byte) 10;
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testEncodeBase6413() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevURL_SAFE_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "URL_SAFE_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] urlSafeEncodeTable = new byte[40];
            urlSafeEncodeTable[0] = (byte) 65;
            urlSafeEncodeTable[1] = (byte) 66;
            urlSafeEncodeTable[2] = (byte) 67;
            urlSafeEncodeTable[3] = (byte) 68;
            urlSafeEncodeTable[4] = (byte) 69;
            urlSafeEncodeTable[5] = (byte) 70;
            urlSafeEncodeTable[6] = (byte) 71;
            urlSafeEncodeTable[7] = (byte) 72;
            urlSafeEncodeTable[8] = (byte) 73;
            urlSafeEncodeTable[9] = (byte) 74;
            urlSafeEncodeTable[10] = (byte) 75;
            urlSafeEncodeTable[11] = (byte) 76;
            urlSafeEncodeTable[12] = (byte) 77;
            urlSafeEncodeTable[13] = (byte) 78;
            urlSafeEncodeTable[14] = (byte) 79;
            urlSafeEncodeTable[15] = (byte) 80;
            urlSafeEncodeTable[16] = (byte) 81;
            urlSafeEncodeTable[17] = (byte) 82;
            urlSafeEncodeTable[18] = (byte) 83;
            urlSafeEncodeTable[19] = (byte) 84;
            urlSafeEncodeTable[20] = (byte) 85;
            urlSafeEncodeTable[21] = (byte) 86;
            urlSafeEncodeTable[22] = (byte) 87;
            urlSafeEncodeTable[23] = (byte) 88;
            urlSafeEncodeTable[24] = (byte) 89;
            urlSafeEncodeTable[25] = (byte) 90;
            urlSafeEncodeTable[26] = (byte) 97;
            urlSafeEncodeTable[27] = (byte) 98;
            urlSafeEncodeTable[28] = (byte) 99;
            urlSafeEncodeTable[29] = (byte) 100;
            urlSafeEncodeTable[30] = (byte) 101;
            urlSafeEncodeTable[31] = (byte) 102;
            urlSafeEncodeTable[32] = (byte) 103;
            urlSafeEncodeTable[33] = (byte) 104;
            urlSafeEncodeTable[34] = (byte) 105;
            urlSafeEncodeTable[35] = (byte) 106;
            urlSafeEncodeTable[36] = (byte) 107;
            urlSafeEncodeTable[37] = (byte) 108;
            urlSafeEncodeTable[38] = (byte) 109;
            urlSafeEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "URL_SAFE_ENCODE_TABLE", urlSafeEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = new byte[18];
            
            byte[] actual = Base64.encodeBase64(byteArray, false, true, 1073741824);
            
            byte[] expected = new byte[24];
            expected[0] = (byte) 65;
            expected[1] = (byte) 65;
            expected[2] = (byte) 65;
            expected[3] = (byte) 65;
            expected[4] = (byte) 65;
            expected[5] = (byte) 65;
            expected[6] = (byte) 65;
            expected[7] = (byte) 65;
            expected[8] = (byte) 65;
            expected[9] = (byte) 65;
            expected[10] = (byte) 65;
            expected[11] = (byte) 65;
            expected[12] = (byte) 65;
            expected[13] = (byte) 65;
            expected[14] = (byte) 65;
            expected[15] = (byte) 65;
            expected[16] = (byte) 65;
            expected[17] = (byte) 65;
            expected[18] = (byte) 65;
            expected[19] = (byte) 65;
            expected[20] = (byte) 65;
            expected[21] = (byte) 65;
            expected[22] = (byte) 65;
            expected[23] = (byte) 65;
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.encodeBase64
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encodeBase64([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[])}
 * @utbot.returnsFrom {@code return encodeBase64(binaryData, false);}
 *  */
    @Test
    public void testEncodeBase64_ReturnEncodeBase64_12() {
        byte[] byteArray = {};
        
        byte[] actual = Base64.encodeBase64(byteArray);
        
        assertArrayEquals(byteArray, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[])}
 * @utbot.returnsFrom {@code return encodeBase64(binaryData, false);}
 *  */
    @Test
    public void testEncodeBase64_ReturnEncodeBase642() {
        byte[] actual = Base64.encodeBase64(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encodeBase64([B)
    
    @Test
    public void testEncodeBase6414() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = new byte[18];
            byteArray[1] = java.lang.Byte.MIN_VALUE;
            byteArray[2] = (byte) 73;
            byteArray[3] = (byte) 73;
            byteArray[4] = (byte) 73;
            byteArray[5] = (byte) 73;
            byteArray[6] = (byte) 73;
            byteArray[7] = (byte) 73;
            byteArray[8] = (byte) 73;
            byteArray[9] = (byte) 73;
            byteArray[10] = (byte) 73;
            byteArray[11] = (byte) 73;
            byteArray[12] = (byte) 73;
            byteArray[13] = (byte) 73;
            byteArray[14] = (byte) 73;
            byteArray[15] = (byte) 73;
            byteArray[16] = (byte) 73;
            byteArray[17] = (byte) 73;
            
            byte[] actual = Base64.encodeBase64(byteArray);
            
            byte[] expected = new byte[24];
            expected[0] = (byte) 65;
            expected[1] = (byte) 73;
            expected[2] = (byte) 66;
            expected[3] = (byte) 74;
            expected[4] = (byte) 83;
            expected[5] = (byte) 85;
            expected[6] = (byte) 108;
            expected[7] = (byte) 74;
            expected[8] = (byte) 83;
            expected[9] = (byte) 85;
            expected[10] = (byte) 108;
            expected[11] = (byte) 74;
            expected[12] = (byte) 83;
            expected[13] = (byte) 85;
            expected[14] = (byte) 108;
            expected[15] = (byte) 74;
            expected[16] = (byte) 83;
            expected[17] = (byte) 85;
            expected[18] = (byte) 108;
            expected[19] = (byte) 74;
            expected[20] = (byte) 83;
            expected[21] = (byte) 85;
            expected[22] = (byte) 108;
            expected[23] = (byte) 74;
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testEncodeBase6415() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = new byte[16];
            byteArray[0] = java.lang.Byte.MIN_VALUE;
            byteArray[1] = (byte) 73;
            byteArray[2] = (byte) 73;
            byteArray[3] = (byte) 73;
            byteArray[4] = (byte) 73;
            byteArray[5] = (byte) 73;
            byteArray[6] = (byte) 73;
            byteArray[7] = (byte) 73;
            byteArray[8] = (byte) 73;
            byteArray[9] = (byte) 73;
            byteArray[10] = (byte) 73;
            byteArray[11] = (byte) 73;
            byteArray[12] = (byte) 73;
            byteArray[13] = (byte) 73;
            byteArray[14] = (byte) 73;
            byteArray[15] = (byte) 73;
            
            byte[] actual = Base64.encodeBase64(byteArray);
            
            byte[] expected = new byte[24];
            expected[0] = (byte) 103;
            expected[1] = (byte) 69;
            expected[2] = (byte) 108;
            expected[3] = (byte) 74;
            expected[4] = (byte) 83;
            expected[5] = (byte) 85;
            expected[6] = (byte) 108;
            expected[7] = (byte) 74;
            expected[8] = (byte) 83;
            expected[9] = (byte) 85;
            expected[10] = (byte) 108;
            expected[11] = (byte) 74;
            expected[12] = (byte) 83;
            expected[13] = (byte) 85;
            expected[14] = (byte) 108;
            expected[15] = (byte) 74;
            expected[16] = (byte) 83;
            expected[17] = (byte) 85;
            expected[18] = (byte) 108;
            expected[19] = (byte) 74;
            expected[20] = (byte) 83;
            expected[21] = (byte) 81;
            expected[22] = (byte) 61;
            expected[23] = (byte) 61;
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testEncodeBase6416() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = {(byte) 0, (byte) 0};
            
            byte[] actual = Base64.encodeBase64(byteArray);
            
            byte[] expected = {(byte) 65, (byte) 65, (byte) 65, (byte) 61};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.containsBase64Byte
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containsBase64Byte([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#containsBase64Byte(byte[])}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsBase64Byte_ReturnFalse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {};
        
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Class byteArrayType = Class.forName("[B");
        Method containsBase64ByteMethod = base64Clazz.getDeclaredMethod("containsBase64Byte", byteArrayType);
        containsBase64ByteMethod.setAccessible(true);
        java.lang.Object[] containsBase64ByteMethodArguments = new java.lang.Object[1];
        containsBase64ByteMethodArguments[0] = ((Object) byteArray);
        boolean actual = ((Boolean) containsBase64ByteMethod.invoke(null, containsBase64ByteMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#containsBase64Byte(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < arrayOctet.length; i++)} once
 *  */
    @Test
    public void testContainsBase64Byte_IsBase64() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {(byte) 61};
        
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Class byteArrayType = Class.forName("[B");
        Method containsBase64ByteMethod = base64Clazz.getDeclaredMethod("containsBase64Byte", byteArrayType);
        containsBase64ByteMethod.setAccessible(true);
        java.lang.Object[] containsBase64ByteMethodArguments = new java.lang.Object[1];
        containsBase64ByteMethodArguments[0] = ((Object) byteArray);
        boolean actual = ((Boolean) containsBase64ByteMethod.invoke(null, containsBase64ByteMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#containsBase64Byte(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < arrayOctet.length; i++)} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsBase64Byte_NotIsBase64() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {(byte) -1};
        
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Class byteArrayType = Class.forName("[B");
        Method containsBase64ByteMethod = base64Clazz.getDeclaredMethod("containsBase64Byte", byteArrayType);
        containsBase64ByteMethod.setAccessible(true);
        java.lang.Object[] containsBase64ByteMethodArguments = new java.lang.Object[1];
        containsBase64ByteMethodArguments[0] = ((Object) byteArray);
        boolean actual = ((Boolean) containsBase64ByteMethod.invoke(null, containsBase64ByteMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#containsBase64Byte(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < arrayOctet.length; i++)} once
 *  */
    @Test
    public void testContainsBase64Byte_IterateForLoop() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException  {
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = {(byte) 68};
            
            Class byteArrayType = Class.forName("[B");
            Method containsBase64ByteMethod = base64Clazz.getDeclaredMethod("containsBase64Byte", byteArrayType);
            containsBase64ByteMethod.setAccessible(true);
            java.lang.Object[] containsBase64ByteMethodArguments = new java.lang.Object[1];
            containsBase64ByteMethodArguments[0] = ((Object) byteArray);
            boolean actual = ((Boolean) containsBase64ByteMethod.invoke(null, containsBase64ByteMethodArguments));
            
            assertFalse(actual);
        } finally {
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containsBase64Byte([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#containsBase64Byte(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < arrayOctet.length; i++)
 *  */
    @Test
    public void testContainsBase64Byte_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.codec.binary.Base64.containsBase64Byte] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.containsBase64Byte(Base64.java:626) */
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Class byteArrayType = Class.forName("[B");
        Method containsBase64ByteMethod = base64Clazz.getDeclaredMethod("containsBase64Byte", byteArrayType);
        containsBase64ByteMethod.setAccessible(true);
        java.lang.Object[] containsBase64ByteMethodArguments = new java.lang.Object[1];
        containsBase64ByteMethodArguments[0] = ((Object) null);
        try {
            containsBase64ByteMethod.invoke(null, containsBase64ByteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method containsBase64Byte([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#containsBase64Byte(byte[])}
     */
    @Test
    public void testContainsBase64ByteReturnsFalseWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {(byte) 0, (byte) -1, java.lang.Byte.MAX_VALUE};
        
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Class byteArrayType = Class.forName("[B");
        Method containsBase64ByteMethod = base64Clazz.getDeclaredMethod("containsBase64Byte", byteArrayType);
        containsBase64ByteMethod.setAccessible(true);
        java.lang.Object[] containsBase64ByteMethodArguments = new java.lang.Object[1];
        containsBase64ByteMethodArguments[0] = ((Object) byteArray);
        boolean actual = ((Boolean) containsBase64ByteMethod.invoke(null, containsBase64ByteMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.resizeBuffer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resizeBuffer()
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#resizeBuffer()}
 * @utbot.executesCondition {@code (buffer == null): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 *  */
    @Test
    public void testResizeBuffer_BufferNotEqualsNull() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        
        byte[] initialBase64Buffer = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buffer"));
        
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Method resizeBufferMethod = base64Clazz.getDeclaredMethod("resizeBuffer");
        resizeBufferMethod.setAccessible(true);
        java.lang.Object[] resizeBufferMethodArguments = new java.lang.Object[0];
        resizeBufferMethod.invoke(base64, resizeBufferMethodArguments);
        
        byte[] finalBase64Buffer = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buffer"));
        
        assertFalse(initialBase64Buffer == finalBase64Buffer);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method resizeBuffer()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#resizeBuffer()}
     */
    @Test
    public void testResizeBuffer() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Base64 base64 = new Base64();
        
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Method resizeBufferMethod = base64Clazz.getDeclaredMethod("resizeBuffer");
        resizeBufferMethod.setAccessible(true);
        java.lang.Object[] resizeBufferMethodArguments = new java.lang.Object[0];
        resizeBufferMethod.invoke(base64, resizeBufferMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.isArrayByteBase64
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isArrayByteBase64([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#isArrayByteBase64(byte[])}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsArrayByteBase64_ReturnTrue() {
        byte[] byteArray = {};
        
        boolean actual = Base64.isArrayByteBase64(byteArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#isArrayByteBase64(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < arrayOctet.length; i++)} once
 *  */
    @Test
    public void testIsArrayByteBase64_NotIsWhiteSpace() {
        byte[] byteArray = {(byte) -1};
        
        boolean actual = Base64.isArrayByteBase64(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#isArrayByteBase64(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < arrayOctet.length; i++)} once
 *  */
    @Test
    public void testIsArrayByteBase64_IterateForLoop() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = {(byte) 0};
            
            boolean actual = Base64.isArrayByteBase64(byteArray);
            
            assertFalse(actual);
        } finally {
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isArrayByteBase64([B)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.apache.commons.codec.binary.Base64#isBase64(byte)} once
    /// return from: {@code return true;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#isArrayByteBase64(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < arrayOctet.length; i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsArrayByteBase64_IsBase64() {
        byte[] byteArray = {(byte) 61};
        
        boolean actual = Base64.isArrayByteBase64(byteArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#isArrayByteBase64(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < arrayOctet.length; i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsArrayByteBase64_Base64IsWhiteSpace() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = {(byte) 10};
            
            boolean actual = Base64.isArrayByteBase64(byteArray);
            
            assertTrue(actual);
        } finally {
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#isArrayByteBase64(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < arrayOctet.length; i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsArrayByteBase64_IterateForLoop_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = {(byte) 65};
            
            boolean actual = Base64.isArrayByteBase64(byteArray);
            
            assertFalse(actual);
        } finally {
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isArrayByteBase64([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#isArrayByteBase64(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < arrayOctet.length; i++)
 *  */
    @Test
    public void testIsArrayByteBase64_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.codec.binary.Base64.isArrayByteBase64] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.isArrayByteBase64(Base64.java:610) */
        Base64.isArrayByteBase64(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isArrayByteBase64([B)
    
    @Test
    public void testIsArrayByteBase641() {
        byte[] byteArray = {
            (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61,
            (byte) 61
        };
        
        boolean actual = Base64.isArrayByteBase64(byteArray);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.isUrlSafe
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isUrlSafe()
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#isUrlSafe()}
 * @utbot.returnsFrom {@code return this.encodeTable == URL_SAFE_ENCODE_TABLE;}
 *  */
    @Test
    public void testIsUrlSafe_ThisEncodeTableNotEqualsURL_SAFE_ENCODE_TABLE() throws Exception  {
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevURL_SAFE_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "URL_SAFE_ENCODE_TABLE"));
        try {
            byte[] urlSafeEncodeTable = new byte[40];
            urlSafeEncodeTable[0] = (byte) 65;
            urlSafeEncodeTable[1] = (byte) 66;
            urlSafeEncodeTable[2] = (byte) 67;
            urlSafeEncodeTable[3] = (byte) 68;
            urlSafeEncodeTable[4] = (byte) 69;
            urlSafeEncodeTable[5] = (byte) 70;
            urlSafeEncodeTable[6] = (byte) 71;
            urlSafeEncodeTable[7] = (byte) 72;
            urlSafeEncodeTable[8] = (byte) 73;
            urlSafeEncodeTable[9] = (byte) 74;
            urlSafeEncodeTable[10] = (byte) 75;
            urlSafeEncodeTable[11] = (byte) 76;
            urlSafeEncodeTable[12] = (byte) 77;
            urlSafeEncodeTable[13] = (byte) 78;
            urlSafeEncodeTable[14] = (byte) 79;
            urlSafeEncodeTable[15] = (byte) 80;
            urlSafeEncodeTable[16] = (byte) 81;
            urlSafeEncodeTable[17] = (byte) 82;
            urlSafeEncodeTable[18] = (byte) 83;
            urlSafeEncodeTable[19] = (byte) 84;
            urlSafeEncodeTable[20] = (byte) 85;
            urlSafeEncodeTable[21] = (byte) 86;
            urlSafeEncodeTable[22] = (byte) 87;
            urlSafeEncodeTable[23] = (byte) 88;
            urlSafeEncodeTable[24] = (byte) 89;
            urlSafeEncodeTable[25] = (byte) 90;
            urlSafeEncodeTable[26] = (byte) 97;
            urlSafeEncodeTable[27] = (byte) 98;
            urlSafeEncodeTable[28] = (byte) 99;
            urlSafeEncodeTable[29] = (byte) 100;
            urlSafeEncodeTable[30] = (byte) 101;
            urlSafeEncodeTable[31] = (byte) 102;
            urlSafeEncodeTable[32] = (byte) 103;
            urlSafeEncodeTable[33] = (byte) 104;
            urlSafeEncodeTable[34] = (byte) 105;
            urlSafeEncodeTable[35] = (byte) 106;
            urlSafeEncodeTable[36] = (byte) 107;
            urlSafeEncodeTable[37] = (byte) 108;
            urlSafeEncodeTable[38] = (byte) 109;
            urlSafeEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "URL_SAFE_ENCODE_TABLE", urlSafeEncodeTable);
            Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
            
            boolean actual = base64.isUrlSafe();
            
            assertFalse(actual);
        } finally {
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.isBase64
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isBase64(byte)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return octet == PAD || (octet >= 0 && octet < DECODE_TABLE.length && DECODE_TABLE[octet] != -1);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#isBase64(byte)}
 * @utbot.returnsFrom {@code return octet == PAD || (octet >= 0 && octet < DECODE_TABLE.length && DECODE_TABLE[octet] != -1);}
 *  */
    @Test
    public void testIsBase64_OctetNotEqualsPADOrOctetLessThanZeroAndOctetLessThanDECODE_TABLELengthAndOctetOfDECODE_TABLEEqualsNegative1() {
        boolean actual = Base64.isBase64((byte) -1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#isBase64(byte)}
 * @utbot.returnsFrom {@code return octet == PAD || (octet >= 0 && octet < DECODE_TABLE.length && DECODE_TABLE[octet] != -1);}
 *  */
    @Test
    public void testIsBase64_OctetEqualsPADOrOctetLessThanZeroAndOctetGreaterOrEqualDECODE_TABLELengthAndOctetOfDECODE_TABLEEqualsNegative1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            
            boolean actual = Base64.isBase64((byte) 0);
            
            assertFalse(actual);
        } finally {
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#isBase64(byte)}
 * @utbot.returnsFrom {@code return octet == PAD || (octet >= 0 && octet < DECODE_TABLE.length && DECODE_TABLE[octet] != -1);}
 *  */
    @Test
    public void testIsBase64_OctetNotEqualsPADOrOctetGreaterOrEqualZeroAndOctetGreaterOrEqualDECODE_TABLELengthAndOctetOfDECODE_TABLEEqualsNegative1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            
            boolean actual = Base64.isBase64((byte) 126);
            
            assertFalse(actual);
        } finally {
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isBase64(byte)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#isBase64(byte)}
 * @utbot.returnsFrom {@code return octet == PAD || (octet >= 0 && octet < DECODE_TABLE.length && DECODE_TABLE[octet] != -1);}
 *  */
    @Test
    public void testIsBase64_OctetEqualsPADOrOctetLessThanZeroAndOctetGreaterOrEqualDECODE_TABLELengthAndOctetOfDECODE_TABLEEqualsNegative1_1() {
        boolean actual = Base64.isBase64((byte) 61);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.encodeBase64String
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encodeBase64String([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64String(byte[])}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean)}
 * @utbot.invokes {@link org.apache.commons.codec.binary.StringUtils#newStringUtf8(byte[])}
 * @utbot.returnsFrom {@code return StringUtils.newStringUtf8(encodeBase64(binaryData, true));}
 *  */
    @Test
    public void testEncodeBase64String_StringUtilsNewStringUtf8() {
        String actual = Base64.encodeBase64String(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method encodeBase64String([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64String(byte[])}
     */
    @Test
    public void testEncodeBase64StringWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MAX_VALUE, (byte) -1};
        
        String actual = Base64.encodeBase64String(byteArray);
        
        String expected = "AX//\r\n";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encodeBase64String([B)
    
    @Test
    public void testEncodeBase64String1() {
        byte[] byteArray = {};
        
        String actual = Base64.encodeBase64String(byteArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.setInitialBuffer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setInitialBuffer([B, int, int)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#setInitialBuffer(byte[],int,int)}
 * @utbot.executesCondition {@code (out != null): True}
 * @utbot.executesCondition {@code (out.length == outAvail): False}
 *  */
    @Test
    public void testSetInitialBuffer_OutLengthNotEqualsOutAvail() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        base64.setInitialBuffer(byteArray, -255, -3);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#setInitialBuffer(byte[],int,int)}
 * @utbot.executesCondition {@code (out != null): False}
 *  */
    @Test
    public void testSetInitialBuffer_OutEqualsNull() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        
        base64.setInitialBuffer(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#setInitialBuffer(byte[],int,int)}
 * @utbot.executesCondition {@code (out != null): True}
 * @utbot.executesCondition {@code (out.length == outAvail): True}
 *  */
    @Test
    public void testSetInitialBuffer_OutLengthEqualsOutAvail() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -255);
        byte[] byteArray = {(byte) -127};
        
        byte[] initialBase64Buffer = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buffer"));
        
        base64.setInitialBuffer(byteArray, -255, 1);
        
        byte[] finalBase64Buffer = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buffer"));
        
        assertFalse(initialBase64Buffer == finalBase64Buffer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.isWhiteSpace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isWhiteSpace(byte)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#isWhiteSpace(byte)}
 * @utbot.activatesSwitch {@code switch(byteToCheck) case: default}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsWhiteSpace_ReturnFalse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Class byteType = byte.class;
        Method isWhiteSpaceMethod = base64Clazz.getDeclaredMethod("isWhiteSpace", byteType);
        isWhiteSpaceMethod.setAccessible(true);
        java.lang.Object[] isWhiteSpaceMethodArguments = new java.lang.Object[1];
        isWhiteSpaceMethodArguments[0] = (byte) -126;
        boolean actual = ((Boolean) isWhiteSpaceMethod.invoke(null, isWhiteSpaceMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#isWhiteSpace(byte)}
 * @utbot.activatesSwitch {@code switch(byteToCheck) case: ' '}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsWhiteSpace_ReturnTrue() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Class byteType = byte.class;
        Method isWhiteSpaceMethod = base64Clazz.getDeclaredMethod("isWhiteSpace", byteType);
        isWhiteSpaceMethod.setAccessible(true);
        java.lang.Object[] isWhiteSpaceMethodArguments = new java.lang.Object[1];
        isWhiteSpaceMethodArguments[0] = (byte) 32;
        boolean actual = ((Boolean) isWhiteSpaceMethod.invoke(null, isWhiteSpaceMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.discardWhitespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method discardWhitespace([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#discardWhitespace(byte[])}
 * @utbot.returnsFrom {@code return packedData;}
 *  */
    @Test
    public void testDiscardWhitespace_ReturnPackedData() {
        byte[] byteArray = {};
        
        byte[] actual = Base64.discardWhitespace(byteArray);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#discardWhitespace(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return packedData;}
 *  */
    @Test
    public void testDiscardWhitespace_SwitchDataiCaser() {
        byte[] byteArray = {(byte) 13};
        
        byte[] actual = Base64.discardWhitespace(byteArray);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#discardWhitespace(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return packedData;}
 *  */
    @Test
    public void testDiscardWhitespace_SwitchDataiCasedefault() {
        byte[] byteArray = {(byte) -127};
        
        byte[] actual = Base64.discardWhitespace(byteArray);
        
        byte[] expected = {(byte) -127};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method discardWhitespace([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#discardWhitespace(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] groomedData = new byte[data.length];
 *  */
    @Test
    public void testDiscardWhitespace_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.codec.binary.Base64.discardWhitespace] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.discardWhitespace(Base64.java:853) */
        Base64.discardWhitespace(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method discardWhitespace([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#discardWhitespace(byte[])}
     */
    @Test
    public void testDiscardWhitespaceWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) -1, (byte) 9, (byte) 13};
        
        byte[] actual = Base64.discardWhitespace(byteArray);
        
        byte[] expected = {(byte) -1};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.encodeToString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method encodeToString([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeToString(byte[])}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#encode(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return StringUtils.newStringUtf8(encode(pArray));
 *  */
    @Test
    public void testEncodeToString_ThrowNullPointerException() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 128);
        byte[] buffer = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
        byte[] byteArray = {
            (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127,
            (byte) -127
        };
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encodeToString] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.getEncodeLength(Base64.java:974)
            org.apache.commons.codec.binary.Base64.encode(Base64.java:933)
            org.apache.commons.codec.binary.Base64.encodeToString(Base64.java:918) */
        base64.encodeToString(byteArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method encodeToString([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeToString(byte[])}
     */
    @Test
    public void testEncodeToStringWithNonEmptyPrimitiveArray() {
        Base64 base64 = new Base64();
        byte[] byteArray = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        String actual = base64.encodeToString(byteArray);
        
        String expected = "//+A\r\n";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encodeToString([B)
    
    @Test
    public void testEncodeToString1() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        
        String actual = base64.encodeToString(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method encodeToString([B)
    
    @Test
    public void testEncodeToString2() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 13);
        byte[] lineSeparator = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineSeparator", lineSeparator);
        byte[] byteArray = new byte[12];
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encodeToString] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:500)
            org.apache.commons.codec.binary.Base64.encode(Base64.java:936)
            org.apache.commons.codec.binary.Base64.encodeToString(Base64.java:918) */
        base64.encodeToString(byteArray);
    }
    
    @Test
    public void testEncodeToString3() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 9);
        byte[] lineSeparator = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineSeparator", lineSeparator);
        byte[] byteArray = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encodeToString] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:500)
            org.apache.commons.codec.binary.Base64.encode(Base64.java:936)
            org.apache.commons.codec.binary.Base64.encodeToString(Base64.java:918) */
        base64.encodeToString(byteArray);
    }
    
    @Test
    public void testEncodeToString4() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 8);
        byte[] lineSeparator = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineSeparator", lineSeparator);
        byte[] byteArray = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encodeToString] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:500)
            org.apache.commons.codec.binary.Base64.encode(Base64.java:936)
            org.apache.commons.codec.binary.Base64.encodeToString(Base64.java:918) */
        base64.encodeToString(byteArray);
    }
    
    @Test
    public void testEncodeToString5() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", -2147483647);
        byte[] buffer = new byte[17];
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        byte[] byteArray = {(byte) 0, (byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encodeToString] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:475)
            org.apache.commons.codec.binary.Base64.encode(Base64.java:937)
            org.apache.commons.codec.binary.Base64.encodeToString(Base64.java:918) */
        base64.encodeToString(byteArray);
    }
    
    @Test
    public void testEncodeToString6() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 5);
        byte[] buffer = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        byte[] byteArray = {(byte) 0, (byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encodeToString] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.getEncodeLength(Base64.java:974)
            org.apache.commons.codec.binary.Base64.encode(Base64.java:933)
            org.apache.commons.codec.binary.Base64.encodeToString(Base64.java:918) */
        base64.encodeToString(byteArray);
    }
    
    @Test
    public void testEncodeToString7() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 268435456);
        byte[] byteArray = {(byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encodeToString] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.getEncodeLength(Base64.java:974)
            org.apache.commons.codec.binary.Base64.encode(Base64.java:933)
            org.apache.commons.codec.binary.Base64.encodeToString(Base64.java:918) */
        base64.encodeToString(byteArray);
    }
    
    @Test
    public void testEncodeToString8() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 5);
        byte[] byteArray = new byte[24];
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encodeToString] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.getEncodeLength(Base64.java:974)
            org.apache.commons.codec.binary.Base64.encode(Base64.java:933)
            org.apache.commons.codec.binary.Base64.encodeToString(Base64.java:918) */
        base64.encodeToString(byteArray);
    }
    
    @Test
    public void testEncodeToString9() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", -2147483647);
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encodeToString] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:500)
            org.apache.commons.codec.binary.Base64.encode(Base64.java:936)
            org.apache.commons.codec.binary.Base64.encodeToString(Base64.java:918) */
        base64.encodeToString(byteArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.decodeInteger
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method decodeInteger([B)
    
    @Test
    public void testDecodeInteger1() throws Exception  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = {
                java.lang.Byte.MIN_VALUE, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73,
                (byte) 73
            };
            
            BigInteger actual = Base64.decodeInteger(byteArray);
            
            BigInteger expected = ((BigInteger) createInstance("java.math.BigInteger"));
            
            // java.math.BigInteger has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testDecodeInteger2() throws Exception  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = {(byte) 0, (byte) 0, (byte) 0, (byte) 0};
            
            BigInteger actual = Base64.decodeInteger(byteArray);
            
            BigInteger expected = ((BigInteger) createInstance("java.math.BigInteger"));
            
            // java.math.BigInteger has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testDecodeInteger3() throws Exception  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevDECODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "DECODE_TABLE"));
        try {
            byte[] chunkSeparator = {(byte) 13, (byte) 10};
            setStaticField(base64Clazz, "CHUNK_SEPARATOR", chunkSeparator);
            byte[] standardEncodeTable = new byte[40];
            standardEncodeTable[0] = (byte) 65;
            standardEncodeTable[1] = (byte) 66;
            standardEncodeTable[2] = (byte) 67;
            standardEncodeTable[3] = (byte) 68;
            standardEncodeTable[4] = (byte) 69;
            standardEncodeTable[5] = (byte) 70;
            standardEncodeTable[6] = (byte) 71;
            standardEncodeTable[7] = (byte) 72;
            standardEncodeTable[8] = (byte) 73;
            standardEncodeTable[9] = (byte) 74;
            standardEncodeTable[10] = (byte) 75;
            standardEncodeTable[11] = (byte) 76;
            standardEncodeTable[12] = (byte) 77;
            standardEncodeTable[13] = (byte) 78;
            standardEncodeTable[14] = (byte) 79;
            standardEncodeTable[15] = (byte) 80;
            standardEncodeTable[16] = (byte) 81;
            standardEncodeTable[17] = (byte) 82;
            standardEncodeTable[18] = (byte) 83;
            standardEncodeTable[19] = (byte) 84;
            standardEncodeTable[20] = (byte) 85;
            standardEncodeTable[21] = (byte) 86;
            standardEncodeTable[22] = (byte) 87;
            standardEncodeTable[23] = (byte) 88;
            standardEncodeTable[24] = (byte) 89;
            standardEncodeTable[25] = (byte) 90;
            standardEncodeTable[26] = (byte) 97;
            standardEncodeTable[27] = (byte) 98;
            standardEncodeTable[28] = (byte) 99;
            standardEncodeTable[29] = (byte) 100;
            standardEncodeTable[30] = (byte) 101;
            standardEncodeTable[31] = (byte) 102;
            standardEncodeTable[32] = (byte) 103;
            standardEncodeTable[33] = (byte) 104;
            standardEncodeTable[34] = (byte) 105;
            standardEncodeTable[35] = (byte) 106;
            standardEncodeTable[36] = (byte) 107;
            standardEncodeTable[37] = (byte) 108;
            standardEncodeTable[38] = (byte) 109;
            standardEncodeTable[39] = (byte) 110;
            setStaticField(base64Clazz, "STANDARD_ENCODE_TABLE", standardEncodeTable);
            byte[] decodeTable = new byte[40];
            decodeTable[0] = (byte) -1;
            decodeTable[1] = (byte) -1;
            decodeTable[2] = (byte) -1;
            decodeTable[3] = (byte) -1;
            decodeTable[4] = (byte) -1;
            decodeTable[5] = (byte) -1;
            decodeTable[6] = (byte) -1;
            decodeTable[7] = (byte) -1;
            decodeTable[8] = (byte) -1;
            decodeTable[9] = (byte) -1;
            decodeTable[10] = (byte) -1;
            decodeTable[11] = (byte) -1;
            decodeTable[12] = (byte) -1;
            decodeTable[13] = (byte) -1;
            decodeTable[14] = (byte) -1;
            decodeTable[15] = (byte) -1;
            decodeTable[16] = (byte) -1;
            decodeTable[17] = (byte) -1;
            decodeTable[18] = (byte) -1;
            decodeTable[19] = (byte) -1;
            decodeTable[20] = (byte) -1;
            decodeTable[21] = (byte) -1;
            decodeTable[22] = (byte) -1;
            decodeTable[23] = (byte) -1;
            decodeTable[24] = (byte) -1;
            decodeTable[25] = (byte) -1;
            decodeTable[26] = (byte) -1;
            decodeTable[27] = (byte) -1;
            decodeTable[28] = (byte) -1;
            decodeTable[29] = (byte) -1;
            decodeTable[30] = (byte) -1;
            decodeTable[31] = (byte) -1;
            decodeTable[32] = (byte) -1;
            decodeTable[33] = (byte) -1;
            decodeTable[34] = (byte) -1;
            decodeTable[35] = (byte) -1;
            decodeTable[36] = (byte) -1;
            decodeTable[37] = (byte) -1;
            decodeTable[38] = (byte) -1;
            decodeTable[39] = (byte) -1;
            setStaticField(base64Clazz, "DECODE_TABLE", decodeTable);
            byte[] byteArray = new byte[38];
            byteArray[0] = java.lang.Byte.MIN_VALUE;
            byteArray[1] = (byte) 61;
            byteArray[2] = (byte) 73;
            byteArray[3] = (byte) 73;
            byteArray[4] = (byte) 73;
            byteArray[5] = (byte) 73;
            byteArray[6] = (byte) 73;
            byteArray[7] = (byte) 73;
            byteArray[8] = (byte) 73;
            byteArray[9] = (byte) 73;
            byteArray[10] = (byte) 73;
            byteArray[11] = (byte) 73;
            byteArray[12] = (byte) 73;
            byteArray[13] = (byte) 73;
            byteArray[14] = (byte) 73;
            byteArray[15] = (byte) 73;
            byteArray[16] = (byte) 73;
            byteArray[17] = (byte) 73;
            byteArray[18] = (byte) 73;
            byteArray[19] = (byte) 73;
            byteArray[20] = (byte) 73;
            byteArray[21] = (byte) 73;
            byteArray[22] = (byte) 73;
            byteArray[23] = (byte) 73;
            byteArray[24] = (byte) 73;
            byteArray[25] = (byte) 73;
            byteArray[26] = (byte) 73;
            byteArray[27] = (byte) 73;
            byteArray[28] = (byte) 73;
            byteArray[29] = (byte) 73;
            byteArray[30] = (byte) 73;
            byteArray[31] = (byte) 73;
            byteArray[32] = (byte) 73;
            byteArray[33] = (byte) 73;
            byteArray[34] = (byte) 73;
            byteArray[35] = (byte) 73;
            byteArray[36] = (byte) 73;
            byteArray[37] = (byte) 73;
            
            BigInteger actual = Base64.decodeInteger(byteArray);
            
            BigInteger expected = ((BigInteger) createInstance("java.math.BigInteger"));
            
            // java.math.BigInteger has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.toIntegerBytes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toIntegerBytes(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#toIntegerBytes(java.math.BigInteger)}
 * @utbot.invokes {@link java.math.BigInteger#bitLength()}
 * @utbot.invokes {@link java.math.BigInteger#toByteArray()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] bigBytes = bigInt.toByteArray();
 *  */
    @Test
    public void testToIntegerBytes_ThrowNegativeArraySizeException() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "bitLengthPlusOne", -256);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.toIntegerBytes] produces [java.lang.NegativeArraySizeException: -31]
            java.base/java.math.BigInteger.toByteArray(BigInteger.java:4175)
            org.apache.commons.codec.binary.Base64.toIntegerBytes(Base64.java:1023) */
        Base64.toIntegerBytes(bigInteger);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#toIntegerBytes(java.math.BigInteger)}
 * @utbot.invokes {@link java.math.BigInteger#bitLength()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int bitlen = bigInt.bitLength();
 *  */
    @Test
    public void testToIntegerBytes_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.codec.binary.Base64.toIntegerBytes] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.toIntegerBytes(Base64.java:1020) */
        Base64.toIntegerBytes(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toIntegerBytes(java.math.BigInteger)
    
    @Test
    public void testToIntegerBytes1() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {33554432, 0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        
        byte[] actual = Base64.toIntegerBytes(bigInteger);
        
        byte[] expected = {(byte) -2, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        
        assertArrayEquals(expected, actual);
        
        int finalBigIntegerBitLengthPlusOne = ((Integer) getFieldValue(bigInteger, "java.math.BigInteger", "bitLengthPlusOne"));
        
        assertEquals(58, finalBigIntegerBitLengthPlusOne);
    }
    
    @Test
    public void testToIntegerBytes2() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {32768, 1};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        
        byte[] actual = Base64.toIntegerBytes(bigInteger);
        
        byte[] expected = {java.lang.Byte.MAX_VALUE, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1};
        
        assertArrayEquals(expected, actual);
        
        int finalBigIntegerBitLengthPlusOne = ((Integer) getFieldValue(bigInteger, "java.math.BigInteger", "bitLengthPlusOne"));
        
        assertEquals(49, finalBigIntegerBitLengthPlusOne);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.getEncodeLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEncodeLength([B, int, [B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#getEncodeLength(byte[],int,byte[])}
 * @utbot.executesCondition {@code (mod != 0): False}
 * @utbot.executesCondition {@code (chunkSize > 0): True}
 * @utbot.executesCondition {@code (!lenChunksPerfectly): False}
 * @utbot.returnsFrom {@code return len;}
 *  */
    @Test
    public void testGetEncodeLength_LenChunksPerfectly() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {};
        byte[] byteArray1 = {(byte) -127};
        
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method getEncodeLengthMethod = base64Clazz.getDeclaredMethod("getEncodeLength", byteArrayType, intType, byteArrayType);
        getEncodeLengthMethod.setAccessible(true);
        java.lang.Object[] getEncodeLengthMethodArguments = new java.lang.Object[3];
        getEncodeLengthMethodArguments[0] = ((Object) byteArray);
        getEncodeLengthMethodArguments[1] = 128;
        getEncodeLengthMethodArguments[2] = ((Object) byteArray1);
        long actual = ((Long) getEncodeLengthMethod.invoke(null, getEncodeLengthMethodArguments));
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#getEncodeLength(byte[],int,byte[])}
 * @utbot.executesCondition {@code (mod != 0): False}
 * @utbot.executesCondition {@code (chunkSize > 0): True}
 * @utbot.executesCondition {@code (!lenChunksPerfectly): True}
 * @utbot.returnsFrom {@code return len;}
 *  */
    @Test
    public void testGetEncodeLength_NotLenChunksPerfectly() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) 2, (byte) -126, (byte) -127, (byte) 2};
        byte[] byteArray1 = {(byte) 1, (byte) -120};
        
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method getEncodeLengthMethod = base64Clazz.getDeclaredMethod("getEncodeLength", byteArrayType, intType, byteArrayType);
        getEncodeLengthMethod.setAccessible(true);
        java.lang.Object[] getEncodeLengthMethodArguments = new java.lang.Object[3];
        getEncodeLengthMethodArguments[0] = ((Object) byteArray);
        getEncodeLengthMethodArguments[1] = 18;
        getEncodeLengthMethodArguments[2] = ((Object) byteArray1);
        long actual = ((Long) getEncodeLengthMethod.invoke(null, getEncodeLengthMethodArguments));
        
        assertEquals(10L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#getEncodeLength(byte[],int,byte[])}
 * @utbot.executesCondition {@code (mod != 0): False}
 * @utbot.executesCondition {@code (chunkSize > 0): False}
 * @utbot.returnsFrom {@code return len;}
 *  */
    @Test
    public void testGetEncodeLength_ChunkSizeLessOrEqualZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {};
        
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method getEncodeLengthMethod = base64Clazz.getDeclaredMethod("getEncodeLength", byteArrayType, intType, byteArrayType);
        getEncodeLengthMethod.setAccessible(true);
        java.lang.Object[] getEncodeLengthMethodArguments = new java.lang.Object[3];
        getEncodeLengthMethodArguments[0] = ((Object) byteArray);
        getEncodeLengthMethodArguments[1] = -3;
        getEncodeLengthMethodArguments[2] = ((Object) null);
        long actual = ((Long) getEncodeLengthMethod.invoke(null, getEncodeLengthMethodArguments));
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#getEncodeLength(byte[],int,byte[])}
 * @utbot.executesCondition {@code (mod != 0): True}
 * @utbot.executesCondition {@code (chunkSize > 0): False}
 * @utbot.returnsFrom {@code return len;}
 *  */
    @Test
    public void testGetEncodeLength_ModNotEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {(byte) -127};
        
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method getEncodeLengthMethod = base64Clazz.getDeclaredMethod("getEncodeLength", byteArrayType, intType, byteArrayType);
        getEncodeLengthMethod.setAccessible(true);
        java.lang.Object[] getEncodeLengthMethodArguments = new java.lang.Object[3];
        getEncodeLengthMethodArguments[0] = ((Object) byteArray);
        getEncodeLengthMethodArguments[1] = -3;
        getEncodeLengthMethodArguments[2] = ((Object) null);
        long actual = ((Long) getEncodeLengthMethod.invoke(null, getEncodeLengthMethodArguments));
        
        assertEquals(4L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEncodeLength([B, int, [B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#getEncodeLength(byte[],int,byte[])}
 * @utbot.executesCondition {@code (mod != 0): False}
 * @utbot.executesCondition {@code (chunkSize > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: len += (len / chunkSize) * chunkSeparator.length;
 *  */
    @Test
    public void testGetEncodeLength_ThrowNullPointerException_1() throws Throwable  {
        byte[] byteArray = {(byte) 2, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.getEncodeLength] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.getEncodeLength(Base64.java:974) */
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method getEncodeLengthMethod = base64Clazz.getDeclaredMethod("getEncodeLength", byteArrayType, intType, byteArrayType);
        getEncodeLengthMethod.setAccessible(true);
        java.lang.Object[] getEncodeLengthMethodArguments = new java.lang.Object[3];
        getEncodeLengthMethodArguments[0] = ((Object) byteArray);
        getEncodeLengthMethodArguments[1] = 33;
        getEncodeLengthMethodArguments[2] = ((Object) null);
        try {
            getEncodeLengthMethod.invoke(null, getEncodeLengthMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#getEncodeLength(byte[],int,byte[])}
 * @utbot.executesCondition {@code (mod != 0): False}
 * @utbot.executesCondition {@code (chunkSize > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: len += (len / chunkSize) * chunkSeparator.length;
 *  */
    @Test
    public void testGetEncodeLength_ThrowNullPointerException_2() throws Throwable  {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.getEncodeLength] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.getEncodeLength(Base64.java:974) */
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method getEncodeLengthMethod = base64Clazz.getDeclaredMethod("getEncodeLength", byteArrayType, intType, byteArrayType);
        getEncodeLengthMethod.setAccessible(true);
        java.lang.Object[] getEncodeLengthMethodArguments = new java.lang.Object[3];
        getEncodeLengthMethodArguments[0] = ((Object) byteArray);
        getEncodeLengthMethodArguments[1] = 128;
        getEncodeLengthMethodArguments[2] = ((Object) null);
        try {
            getEncodeLengthMethod.invoke(null, getEncodeLengthMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#getEncodeLength(byte[],int,byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long len = (pArray.length * 4) / 3;
 *  */
    @Test
    public void testGetEncodeLength_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.codec.binary.Base64.getEncodeLength] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.getEncodeLength(Base64.java:967) */
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Method getEncodeLengthMethod = base64Clazz.getDeclaredMethod("getEncodeLength", byteArrayType, intType, byteArrayType);
        getEncodeLengthMethod.setAccessible(true);
        java.lang.Object[] getEncodeLengthMethodArguments = new java.lang.Object[3];
        getEncodeLengthMethodArguments[0] = ((Object) null);
        getEncodeLengthMethodArguments[1] = -255;
        getEncodeLengthMethodArguments[2] = ((Object) null);
        try {
            getEncodeLengthMethod.invoke(null, getEncodeLengthMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.encodeInteger
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method encodeInteger(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeInteger(java.math.BigInteger)}
 * @utbot.executesCondition {@code (bigInt == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: bigInt == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testEncodeInteger_ThrowNullPointerException() {
        Base64.encodeInteger(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method encodeInteger(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeInteger(java.math.BigInteger)}
 * @utbot.executesCondition {@code (bigInt == null): False}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#toIntegerBytes(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return encodeBase64(toIntegerBytes(bigInt), false);
 *  */
    @Test
    public void testEncodeInteger_ThrowNegativeArraySizeException() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "bitLengthPlusOne", -27);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encodeInteger] produces [java.lang.NegativeArraySizeException: -2]
            java.base/java.math.BigInteger.toByteArray(BigInteger.java:4175)
            org.apache.commons.codec.binary.Base64.toIntegerBytes(Base64.java:1023)
            org.apache.commons.codec.binary.Base64.encodeInteger(Base64.java:1009) */
        Base64.encodeInteger(bigInteger);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.hasData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasData()
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#hasData()}
 * @utbot.returnsFrom {@code return this.buffer != null;}
 *  */
    @Test
    public void testHasData_ThisBufferNotEqualsNull() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buffer = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buffer", buffer);
        
        boolean actual = base64.hasData();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#hasData()}
 * @utbot.returnsFrom {@code return this.buffer != null;}
 *  */
    @Test
    public void testHasData_ThisBufferEqualsNull() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        
        boolean actual = base64.hasData();
        
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
        
            java.lang.reflect.Method methodForGetDeclaredFields875376095992700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields875376095992700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass875376096004500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields875376095992700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass875376096004500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields875376096952500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields875376096952500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass875376096955100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields875376096952500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass875376096955100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields875376098274700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields875376098274700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass875376098277600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields875376098274700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass875376098277600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields875376099291500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields875376099291500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass875376099367200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields875376099291500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass875376099367200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

