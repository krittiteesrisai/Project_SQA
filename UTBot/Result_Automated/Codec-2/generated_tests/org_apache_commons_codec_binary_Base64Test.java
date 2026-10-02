package org.apache.commons.codec.binary;

import org.junit.Test;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_codec_binary_Base64Test {
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.hasData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasData()
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#hasData()}
 * @utbot.returnsFrom {@code return this.buf != null;}
 *  */
    @Test
    public void testHasData_ThisBufNotEqualsNull() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buf = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        
        boolean actual = base64.hasData();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#hasData()}
 * @utbot.returnsFrom {@code return this.buf != null;}
 *  */
    @Test
    public void testHasData_ThisBufEqualsNull() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        
        boolean actual = base64.hasData();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.decode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method decode([B, int, int)
    
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
 * @utbot.executesCondition {@code (eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.executesCondition {@code (modulus != 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 *  */
    @Test
    public void testDecode_BEqualsPAD() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "decodeSize", -256);
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 256);
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
        setField(base64, "org.apache.commons.codec.binary.Base64", "decodeSize", -255);
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 255);
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
        byte[] buf = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        base64.decode(null, -255, -1);
        
        byte[] base64Buf = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buf"));
        byte finalBase64Buf0 = ((Byte) get(base64Buf, 0));
        int finalBase64Pos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "pos"));
        boolean finalBase64Eof = ((Boolean) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "eof"));
        int finalBase64X = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "x"));
        
        assertEquals((byte) -16, finalBase64Buf0);
        
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
        byte[] buf = {(byte) 0, (byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 3);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        base64.decode(null, -255, -1);
        
        byte[] base64Buf = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buf"));
        byte finalBase64Buf0 = ((Byte) get(base64Buf, 0));
        byte[] base64Buf1 = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buf"));
        byte finalBase64Buf1 = ((Byte) get(base64Buf1, 1));
        int finalBase64Pos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "pos"));
        boolean finalBase64Eof = ((Boolean) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "eof"));
        int finalBase64X = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "x"));
        
        assertEquals((byte) -1, finalBase64Buf0);
        
        assertEquals((byte) -64, finalBase64Buf1);
        
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
            setField(base64, "org.apache.commons.codec.binary.Base64", "decodeSize", -252);
            byte[] buf = {};
            setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
            setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 252);
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
            setField(base64, "org.apache.commons.codec.binary.Base64", "decodeSize", -127);
            byte[] buf = {(byte) -127};
            setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
            setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 128);
            setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -5);
            byte[] byteArray = {(byte) -127, (byte) 65};
            
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
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.executesCondition {@code (modulus != 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = (byte) ((x >> 16) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buf = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 1073741824);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 3);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:539) */
        base64.decode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.executesCondition {@code (modulus != 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = (byte) ((x >> 16) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buf = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 1073741824);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:536) */
        base64.decode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.executesCondition {@code (modulus != 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = (byte) ((x >> 8) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buf = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 3);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:540) */
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
        byte[] buf = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 256);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:507) */
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
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:507) */
        base64.decode(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.executesCondition {@code (modulus != 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buf[pos++] = (byte) ((x >> 16) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowNullPointerException_1() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 3);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:539) */
        base64.decode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (eof): True}
 * @utbot.executesCondition {@code (modulus != 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buf[pos++] = (byte) ((x >> 16) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowNullPointerException_2() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:536) */
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
        Base64 base64 = new Base64(true);
        byte[] byteArray = {(byte) 0, (byte) 0, (byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:507) */
        base64.decode(byteArray, 2, 8);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method decode([B, int, int)
    
    @Test
    public void testDecode1() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "decodeSize", 3);
        byte[] buf = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        byte[] byteArray = new byte[11];
        byteArray[2] = java.lang.Byte.MIN_VALUE;
        
        byte[] initialBase64Buf = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buf"));
        
        base64.decode(byteArray, 2, 2);
        
        byte[] finalBase64Buf = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buf"));
        
        assertFalse(initialBase64Buf == finalBase64Buf);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method decode([B, int, int)
    
    @Test
    public void testDecode2() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "decodeSize", -2147483637);
        byte[] buf = {(byte) 61, (byte) 61};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -8);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        byte[] byteArray = {
            (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61,
            (byte) 61
        };
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index -8 out of bounds for length 2]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:536) */
        base64.decode(byteArray, 0, 1);
    }
    
    @Test
    public void testDecode3() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "decodeSize", -1073741825);
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 1073741836);
        byte[] byteArray = new byte[39];
        byteArray[37] = java.lang.Byte.MIN_VALUE;
        byteArray[38] = java.lang.Byte.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            org.apache.commons.codec.binary.Base64.decode(Base64.java:507) */
        base64.decode(byteArray, 37, 3);
    }
    
    @Test
    public void testDecode4() throws Exception  {
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
            setField(base64, "org.apache.commons.codec.binary.Base64", "decodeSize", -2147483637);
            byte[] buf = {(byte) 0, (byte) 0};
            setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
            setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -8);
            setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -5);
            byte[] byteArray = {
                (byte) 65, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            
            /* This test fails because method [org.apache.commons.codec.binary.Base64.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
                org.apache.commons.codec.binary.Base64.decode(Base64.java:507) */
            base64.decode(byteArray, 0, 1025);
        } finally {
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.decode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method decode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(java.lang.Object)}
 * @utbot.executesCondition {@code (!(pObject instanceof byte[])): False}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#decode(byte[])}
 * @utbot.returnsFrom {@code return decode((byte[]) pObject);}
 *  */
    @Test
    public void testDecode_PObjectNotInstanceOfByte() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] byteArray = {};
        
        byte[] actual = ((byte[]) base64.decode(((Object) byteArray)));
        
        assertArrayEquals(byteArray, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method decode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(java.lang.Object)}
 * @utbot.executesCondition {@code (!(pObject instanceof byte[])): True}
 * @utbot.throwsException {@link org.apache.commons.codec.DecoderException} when: !(pObject instanceof byte[])
 *  */
    @Test(expected = DecoderException.class)
    public void testDecode_ThrowDecoderException() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        
        base64.decode(((Object) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method decode(java.lang.Object)
    
    @Test
    public void testDecode5() throws Exception  {
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
            Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
            byte[] byteArray = new byte[38];
            byteArray[0] = (byte) 124;
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
            
            byte[] actual = ((byte[]) base64.decode(((Object) byteArray)));
            
            byte[] expected = {};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testDecode6() throws Exception  {
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
            Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
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
            
            byte[] actual = ((byte[]) base64.decode(((Object) byteArray)));
            
            byte[] expected = {};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testDecode7() throws Exception  {
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
            Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
            byte[] byteArray = {(byte) 0};
            
            byte[] actual = ((byte[]) base64.decode(((Object) byteArray)));
            
            byte[] expected = {};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.decode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method decode([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[])}
 * @utbot.returnsFrom {@code return decodeBase64(pArray);}
 *  */
    @Test
    public void testDecode_ReturnDecodeBase64_1() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] byteArray = {};
        
        byte[] actual = base64.decode(byteArray);
        
        assertArrayEquals(byteArray, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decode(byte[])}
 * @utbot.returnsFrom {@code return decodeBase64(pArray);}
 *  */
    @Test
    public void testDecode_ReturnDecodeBase64() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        
        byte[] actual = base64.decode(((byte[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method decode([B)
    
    @Test
    public void testDecode8() throws Exception  {
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
            Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
            byte[] byteArray = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            
            byte[] actual = base64.decode(byteArray);
            
            byte[] expected = {};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testDecode9() throws Exception  {
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
            Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
            byte[] byteArray = {
                java.lang.Byte.MIN_VALUE, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73,
                (byte) 73
            };
            
            byte[] actual = base64.decode(byteArray);
            
            byte[] expected = {};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testDecode10() throws Exception  {
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
            Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
            byte[] byteArray = new byte[38];
            byteArray[0] = (byte) 124;
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
            
            byte[] actual = base64.decode(byteArray);
            
            byte[] expected = {};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.encode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encode([B, int, int)
    
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
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 4194312);
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -4194312);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 936189954);
        byte[] byteArray = {(byte) -127, (byte) -1};
        
        base64.encode(byteArray, 1, 1);
        
        int finalBase64Modulus = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "modulus"));
        int finalBase64X = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "x"));
        
        assertEquals(1, finalBase64Modulus);
        
        assertEquals(255, finalBase64X);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.executesCondition {@code (buf.length - pos < encodeSize): False}
 * @utbot.executesCondition {@code (lineLength > 0): False}
 *  */
    @Test
    public void testEncode_LineLengthLessOrEqualZero() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -256);
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 256);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
        
        base64.encode(null, -255, -1);
        
        boolean finalBase64Eof = ((Boolean) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "eof"));
        
        assertTrue(finalBase64Eof);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.executesCondition {@code (buf.length - pos < encodeSize): False}
 * @utbot.executesCondition {@code (lineLength > 0): True}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 *  */
    @Test
    public void testEncode_LineLengthGreaterThanZero() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 1);
        byte[] lineSeparator = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineSeparator", lineSeparator);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 2);
        byte[] buf = {(byte) -127, (byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
        
        base64.encode(null, -255, -1);
        
        boolean finalBase64Eof = ((Boolean) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "eof"));
        
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
    public void testEncode_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -2147483645);
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 2147483645);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:456) */
        base64.encode(byteArray, 129, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = encodeTable[(x >> 12) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -1409353048);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 1);
        byte[] byteArray = {(byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:461) */
        base64.encode(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = encodeTable[(x >> 6) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_14() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) 0, (byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -1475087497);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 8389632);
        byte[] byteArray = {(byte) -1};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:462) */
        base64.encode(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int b = in[inPos++];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_18() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 1073741824);
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -1073741823);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:456) */
        base64.encode(byteArray, 129, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.executesCondition {@code (buf.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = encodeTable[(x >> 2) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 256);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 1);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 256 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:427) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.executesCondition {@code (buf.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = encodeTable[(x << 4) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 1);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:428) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.executesCondition {@code (buf.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = encodeTable[(x << 4) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 1);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:428) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.executesCondition {@code (buf.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = encodeTable[(x >> 4) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 65);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:438) */
        base64.encode(null, 1, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = encodeTable[(x >> 18) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 67110146);
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -67110146);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -1241578690);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 1);
        byte[] byteArray = {(byte) -127, (byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index -67110146 out of bounds for length 0]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:460) */
        base64.encode(byteArray, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = encodeTable[(x >> 12) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 1);
        byte[] buf = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -1310785090);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 513);
        byte[] byteArray = {(byte) -127, (byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:461) */
        base64.encode(byteArray, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = encodeTable[(x >> 6) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_15() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = new byte[23];
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 2);
        byte[] buf = {(byte) 0, (byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -1096893706);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 8388612);
        byte[] byteArray = {(byte) -1};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:462) */
        base64.encode(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = encodeTable[x & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_16() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = new byte[40];
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 3);
        byte[] buf = new byte[13];
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 10);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -1584708001);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 8388612);
        byte[] byteArray = {(byte) -1};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 63 out of bounds for length 40]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:463) */
        base64.encode(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.executesCondition {@code (buf.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = encodeTable[(x >> 10) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) -127, (byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -254);
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 254);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 63 out of bounds for length 2]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:437) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.executesCondition {@code (buf.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = encodeTable[(x >> 2) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -255);
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 8);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:427) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.executesCondition {@code (buf.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = encodeTable[(x >> 10) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 2);
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 1);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 0]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:437) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.executesCondition {@code (buf.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = encodeTable[(x >> 4) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 1);
        byte[] buf = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 1);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:438) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.executesCondition {@code (buf.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = encodeTable[(x << 2) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) -127, (byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 2);
        byte[] buf = {(byte) -127, (byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 16);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:439) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.executesCondition {@code (buf.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf[pos++] = encodeTable[(x << 2) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 2);
        byte[] buf = {(byte) -127, (byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 2);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 1]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:439) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.executesCondition {@code (buf.length - pos < encodeSize): False}
 * @utbot.executesCondition {@code (lineLength > 0): True}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(lineSeparator, 0, buf, pos, lineSeparator.length);
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_17() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 1);
        byte[] lineSeparator = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineSeparator", lineSeparator);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 1);
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.codec.binary.Base64.encode(Base64.java:447) */
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
        byte[] buf = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", Integer.MAX_VALUE);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:456) */
        base64.encode(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buf[pos++] = encodeTable[(x >> 18) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_4() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -133168992);
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 133168992);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -1236171778);
        byte[] byteArray = {(byte) -127, (byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:460) */
        base64.encode(byteArray, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.executesCondition {@code (buf.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buf[pos++] = encodeTable[(x >> 10) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowNullPointerException() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -254);
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 254);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:437) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.executesCondition {@code (buf.length - pos < encodeSize): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buf[pos++] = encodeTable[(x >> 2) & MASK_6BITS];
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_1() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 240);
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -240);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 1);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:427) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.executesCondition {@code (buf.length - pos < encodeSize): False}
 * @utbot.executesCondition {@code (lineLength > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(lineSeparator, 0, buf, pos, lineSeparator.length);
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_2() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -254);
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 254);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:447) */
        base64.encode(null, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.executesCondition {@code (buf.length - pos < encodeSize): True}
 * @utbot.executesCondition {@code (lineLength > 0): True}
 * @utbot.invokes org.apache.commons.codec.binary.Base64#resizeBuf()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(lineSeparator, 0, buf, pos, lineSeparator.length);
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_5() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 256);
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:447) */
        base64.encode(null, -255, -1);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method encode([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
     */
    @Test
    public void testEncodeWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 8, (byte) 0};
        Base64 base64 = new Base64(61, byteArray);
        byte[] byteArray1 = {java.lang.Byte.MIN_VALUE, java.lang.Byte.MAX_VALUE, (byte) 0, (byte) 2, (byte) 12};
        
        base64.encode(byteArray1, 63, -2147483630);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method encode([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
     */
    @Test
    public void testEncodeThrowsAIOOBEWithNonEmptyPrimitiveArrayAndCornerCase() {
        Base64 base64 = new Base64(true);
        byte[] byteArray = {(byte) 2, (byte) 2, (byte) 2};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 3]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:456) */
        base64.encode(byteArray, 12, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encode([B, int, int)
    
    @Test
    public void testEncode1() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -2146340853);
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 1072631804);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 1279328202);
        byte[] byteArray = new byte[17];
        
        base64.encode(byteArray, 0, 2);
        
        int finalBase64Modulus = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "modulus"));
        
        assertEquals(2, finalBase64Modulus);
    }
    
    @Test
    public void testEncode2() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 7);
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -1);
        byte[] byteArray = new byte[15];
        byteArray[6] = java.lang.Byte.MIN_VALUE;
        
        byte[] initialBase64Buf = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buf"));
        
        base64.encode(byteArray, 6, 1);
        
        byte[] finalBase64Buf = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buf"));
        int finalBase64Modulus = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "modulus"));
        int finalBase64X = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "x"));
        
        assertFalse(initialBase64Buf == finalBase64Buf);
        
        assertEquals(1, finalBase64Modulus);
        
        assertEquals(128, finalBase64X);
    }
    
    @Test
    public void testEncode3() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 3);
        byte[] buf = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -1);
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        byte[] initialBase64Buf = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buf"));
        
        base64.encode(byteArray, 0, 1);
        
        byte[] finalBase64Buf = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buf"));
        int finalBase64Modulus = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "modulus"));
        
        assertFalse(initialBase64Buf == finalBase64Buf);
        
        assertEquals(1, finalBase64Modulus);
    }
    
    @Test
    public void testEncode4() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 3);
        byte[] buf = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -1);
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        byte[] initialBase64Buf = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buf"));
        
        base64.encode(byteArray, 0, Integer.MIN_VALUE);
        
        byte[] finalBase64Buf = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buf"));
        boolean finalBase64Eof = ((Boolean) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "eof"));
        
        assertFalse(initialBase64Buf == finalBase64Buf);
        
        assertTrue(finalBase64Eof);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method encode([B, int, int)
    
    @Test
    public void testEncode5() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = new byte[19];
        encodeTable[0] = java.lang.Byte.MIN_VALUE;
        encodeTable[1] = java.lang.Byte.MIN_VALUE;
        encodeTable[2] = java.lang.Byte.MIN_VALUE;
        encodeTable[3] = java.lang.Byte.MIN_VALUE;
        encodeTable[4] = java.lang.Byte.MIN_VALUE;
        encodeTable[5] = java.lang.Byte.MIN_VALUE;
        encodeTable[6] = java.lang.Byte.MIN_VALUE;
        encodeTable[7] = java.lang.Byte.MIN_VALUE;
        encodeTable[8] = java.lang.Byte.MIN_VALUE;
        encodeTable[9] = java.lang.Byte.MIN_VALUE;
        encodeTable[10] = java.lang.Byte.MIN_VALUE;
        encodeTable[11] = java.lang.Byte.MIN_VALUE;
        encodeTable[12] = java.lang.Byte.MIN_VALUE;
        encodeTable[13] = java.lang.Byte.MIN_VALUE;
        encodeTable[14] = java.lang.Byte.MIN_VALUE;
        encodeTable[15] = java.lang.Byte.MIN_VALUE;
        encodeTable[16] = java.lang.Byte.MIN_VALUE;
        encodeTable[17] = java.lang.Byte.MIN_VALUE;
        encodeTable[18] = java.lang.Byte.MIN_VALUE;
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", -2147483647);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -2147483639);
        byte[] buf = new byte[13];
        buf[0] = java.lang.Byte.MIN_VALUE;
        buf[1] = java.lang.Byte.MIN_VALUE;
        buf[2] = java.lang.Byte.MIN_VALUE;
        buf[3] = java.lang.Byte.MIN_VALUE;
        buf[4] = java.lang.Byte.MIN_VALUE;
        buf[5] = java.lang.Byte.MIN_VALUE;
        buf[6] = java.lang.Byte.MIN_VALUE;
        buf[7] = java.lang.Byte.MIN_VALUE;
        buf[8] = java.lang.Byte.MIN_VALUE;
        buf[9] = java.lang.Byte.MIN_VALUE;
        buf[10] = java.lang.Byte.MIN_VALUE;
        buf[11] = java.lang.Byte.MIN_VALUE;
        buf[12] = java.lang.Byte.MIN_VALUE;
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 9);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -1279782091);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 8388612);
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:456) */
        base64.encode(byteArray, 0, 134217728);
    }
    
    @Test
    public void testEncode6() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = new byte[19];
        encodeTable[0] = java.lang.Byte.MIN_VALUE;
        encodeTable[1] = java.lang.Byte.MIN_VALUE;
        encodeTable[2] = java.lang.Byte.MIN_VALUE;
        encodeTable[3] = java.lang.Byte.MIN_VALUE;
        encodeTable[4] = java.lang.Byte.MIN_VALUE;
        encodeTable[5] = java.lang.Byte.MIN_VALUE;
        encodeTable[6] = java.lang.Byte.MIN_VALUE;
        encodeTable[7] = java.lang.Byte.MIN_VALUE;
        encodeTable[8] = java.lang.Byte.MIN_VALUE;
        encodeTable[9] = java.lang.Byte.MIN_VALUE;
        encodeTable[10] = java.lang.Byte.MIN_VALUE;
        encodeTable[11] = java.lang.Byte.MIN_VALUE;
        encodeTable[12] = java.lang.Byte.MIN_VALUE;
        encodeTable[13] = java.lang.Byte.MIN_VALUE;
        encodeTable[14] = java.lang.Byte.MIN_VALUE;
        encodeTable[15] = java.lang.Byte.MIN_VALUE;
        encodeTable[16] = java.lang.Byte.MIN_VALUE;
        encodeTable[17] = java.lang.Byte.MIN_VALUE;
        encodeTable[18] = java.lang.Byte.MIN_VALUE;
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 2147483641);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -2147483642);
        byte[] buf = new byte[13];
        buf[0] = java.lang.Byte.MIN_VALUE;
        buf[1] = java.lang.Byte.MIN_VALUE;
        buf[2] = java.lang.Byte.MIN_VALUE;
        buf[3] = java.lang.Byte.MIN_VALUE;
        buf[4] = java.lang.Byte.MIN_VALUE;
        buf[5] = java.lang.Byte.MIN_VALUE;
        buf[6] = java.lang.Byte.MIN_VALUE;
        buf[7] = java.lang.Byte.MIN_VALUE;
        buf[8] = java.lang.Byte.MIN_VALUE;
        buf[9] = java.lang.Byte.MIN_VALUE;
        buf[10] = java.lang.Byte.MIN_VALUE;
        buf[11] = java.lang.Byte.MIN_VALUE;
        buf[12] = java.lang.Byte.MIN_VALUE;
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 9);
        setField(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos", -12);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", -1229475067);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 8388612);
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 19]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:460) */
        base64.encode(byteArray, 0, 8192);
    }
    
    @Test
    public void testEncode7() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] encodeTable = new byte[19];
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineLength", 1073741817);
        byte[] lineSeparator = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "lineSeparator", lineSeparator);
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", -2147483641);
        byte[] buf = new byte[15];
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 9);
        setField(base64, "org.apache.commons.codec.binary.Base64", "currentLinePos", 2147483636);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 1351007744);
        setField(base64, "org.apache.commons.codec.binary.Base64", "x", 8388612);
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, (byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:456) */
        base64.encode(byteArray, 0, 67108864);
    }
    
    @Test
    public void testEncode8() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 3);
        byte[] buf = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 1);
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:427) */
        base64.encode(byteArray, 0, Integer.MIN_VALUE);
    }
    
    @Test
    public void testEncode9() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        setField(base64, "org.apache.commons.codec.binary.Base64", "encodeSize", 3);
        byte[] buf = {(byte) 0};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -1);
        setField(base64, "org.apache.commons.codec.binary.Base64", "modulus", 2);
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.encode(Base64.java:437) */
        base64.encode(byteArray, 0, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.encode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encode([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return encodeBase64(pArray, false, isUrlSafe());}
 *  */
    @Test
    public void testEncode_ReturnEncodeBase64_1() throws Exception  {
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
            byte[] byteArray = {};
            
            byte[] actual = base64.encode(byteArray);
            
            assertArrayEquals(byteArray, actual);
        } finally {
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return encodeBase64(pArray, false, isUrlSafe());}
 *  */
    @Test
    public void testEncode_ReturnEncodeBase64() throws Exception  {
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
            byte[] encodeTable = {(byte) -127};
            setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
            
            byte[] actual = base64.encode(((byte[]) null));
            
            assertNull(actual);
        } finally {
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#setInitialBuffer(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.returnsFrom {@code return encodeBase64(pArray, false, isUrlSafe());}
 *  */
    @Test
    public void testEncode_ReturnEncodeBase64_2() throws Exception  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevURL_SAFE_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "URL_SAFE_ENCODE_TABLE"));
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
            Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
            byte[] byteArray = {(byte) 0};
            
            byte[] actual = base64.encode(byteArray);
            
            byte[] expected = {(byte) 65, (byte) 65, (byte) 61, (byte) 61};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method encode([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#isUrlSafe()}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean,boolean)}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#setInitialBuffer(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#encode(byte[],int,int)}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean,boolean)}
 * @utbot.returnsFrom {@code return encodeBase64(pArray, false, isUrlSafe());}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return encodeBase64(pArray, false, isUrlSafe());
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevURL_SAFE_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "URL_SAFE_ENCODE_TABLE"));
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
            Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
            byte[] byteArray = {(byte) -1};
            
            /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 63 out of bounds for length 40]
                org.apache.commons.codec.binary.Base64.encode(Base64.java:427)
                org.apache.commons.codec.binary.Base64.encodeBase64(Base64.java:702)
                org.apache.commons.codec.binary.Base64.encode(Base64.java:835) */
            base64.encode(byteArray);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method encode([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(byte[])}
     */
    @Test
    public void testEncodeWithNonEmptyPrimitiveArray1() {
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, (byte) 0, java.lang.Byte.MIN_VALUE};
        Base64 base64 = new Base64(-1, byteArray, true);
        byte[] byteArray1 = {(byte) -1, java.lang.Byte.MAX_VALUE, (byte) -1};
        
        byte[] actual = base64.encode(byteArray1);
        
        byte[] expected = {(byte) 95, (byte) 51, (byte) 95, (byte) 95};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encode([B)
    
    @Test
    public void testEncode10() throws Exception  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevURL_SAFE_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "URL_SAFE_ENCODE_TABLE"));
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
            Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
            byte[] encodeTable = {
                (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
            byte[] byteArray = new byte[18];
            byteArray[0] = java.lang.Byte.MIN_VALUE;
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
            
            byte[] actual = base64.encode(byteArray);
            
            byte[] expected = new byte[24];
            expected[0] = (byte) 103;
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
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testEncode11() throws Exception  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevURL_SAFE_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "URL_SAFE_ENCODE_TABLE"));
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
            Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
            byte[] byteArray = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            
            byte[] actual = base64.encode(byteArray);
            
            byte[] expected = {(byte) 65, (byte) 65, (byte) 65, (byte) 65, (byte) 65, (byte) 65, (byte) 65, (byte) 0};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.encode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(java.lang.Object)}
 * @utbot.returnsFrom {@code return encode((byte[]) pObject);}
 *  */
    @Test
    public void testEncode_ReturnEncode() throws Exception  {
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
            byte[] byteArray = {};
            
            byte[] actual = ((byte[]) base64.encode(((Object) byteArray)));
            
            assertArrayEquals(byteArray, actual);
        } finally {
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encode(java.lang.Object)}
 * @utbot.returnsFrom {@code return encode((byte[]) pObject);}
 *  */
    @Test
    public void testEncode_ReturnEncode_1() throws Exception  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevURL_SAFE_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "URL_SAFE_ENCODE_TABLE"));
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
            Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
            byte[] byteArray = {(byte) 0};
            
            byte[] actual = ((byte[]) base64.encode(((Object) byteArray)));
            
            byte[] expected = {(byte) 65, (byte) 65, (byte) 61, (byte) 61};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
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
 * @utbot.executesCondition {@code (!(pObject instanceof byte[])): False}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#encode(byte[])}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean,boolean)}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#encode(byte[])}
 * @utbot.returnsFrom {@code return encode((byte[]) pObject);}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return encode((byte[]) pObject);
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevURL_SAFE_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "URL_SAFE_ENCODE_TABLE"));
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
            Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
            byte[] byteArray = {(byte) -1};
            
            /* This test fails because method [org.apache.commons.codec.binary.Base64.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 63 out of bounds for length 40]
                org.apache.commons.codec.binary.Base64.encode(Base64.java:427)
                org.apache.commons.codec.binary.Base64.encodeBase64(Base64.java:702)
                org.apache.commons.codec.binary.Base64.encode(Base64.java:835)
                org.apache.commons.codec.binary.Base64.encode(Base64.java:824) */
            base64.encode(((Object) byteArray));
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encode(java.lang.Object)
    
    @Test
    public void testEncode12() throws Exception  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevURL_SAFE_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "URL_SAFE_ENCODE_TABLE"));
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
            Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
            byte[] encodeTable = {
                (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            setField(base64, "org.apache.commons.codec.binary.Base64", "encodeTable", encodeTable);
            byte[] byteArray = {java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, (byte) 73};
            
            byte[] actual = ((byte[]) base64.encode(((Object) byteArray)));
            
            byte[] expected = {(byte) 103, (byte) 73, (byte) 66, (byte) 74};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testEncode13() throws Exception  {
        byte[] prevCHUNK_SEPARATOR = Base64.CHUNK_SEPARATOR;
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        byte[] prevSTANDARD_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "STANDARD_ENCODE_TABLE"));
        byte[] prevURL_SAFE_ENCODE_TABLE = ((byte[]) getStaticFieldValue(base64Clazz, "URL_SAFE_ENCODE_TABLE"));
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
            Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
            byte[] byteArray = {(byte) 0, (byte) 0};
            
            byte[] actual = ((byte[]) base64.encode(((Object) byteArray)));
            
            byte[] expected = {(byte) 65, (byte) 65, (byte) 65, (byte) 0};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.avail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method avail()
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#avail()}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.returnsFrom {@code return buf != null ? pos - readPos : 0;}
 *  */
    @Test
    public void testAvail_BufNotEqualsNull() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buf = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -255);
        
        int actual = base64.avail();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#avail()}
 * @utbot.executesCondition {@code (buf != null): False}
 * @utbot.returnsFrom {@code return buf != null ? pos - readPos : 0;}
 *  */
    @Test
    public void testAvail_BufEqualsNull() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        
        int actual = base64.avail();
        
        assertEquals(0, actual);
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
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isUrlSafe()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#isUrlSafe()}
     */
    @Test
    public void testIsUrlSafeReturnsTrue() {
        Base64 base64 = new Base64(true);
        
        boolean actual = base64.isUrlSafe();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.resizeBuf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resizeBuf()
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#resizeBuf()}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 *  */
    @Test
    public void testResizeBuf_BufNotEqualsNull() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        
        byte[] initialBase64Buf = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buf"));
        
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Method resizeBufMethod = base64Clazz.getDeclaredMethod("resizeBuf");
        resizeBufMethod.setAccessible(true);
        java.lang.Object[] resizeBufMethodArguments = new java.lang.Object[0];
        resizeBufMethod.invoke(base64, resizeBufMethodArguments);
        
        byte[] finalBase64Buf = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buf"));
        
        assertFalse(initialBase64Buf == finalBase64Buf);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method resizeBuf()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#resizeBuf()}
     */
    @Test
    public void testResizeBuf() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Base64 base64 = new Base64(false);
        
        Class base64Clazz = Class.forName("org.apache.commons.codec.binary.Base64");
        Method resizeBufMethod = base64Clazz.getDeclaredMethod("resizeBuf");
        resizeBufMethod.setAccessible(true);
        java.lang.Object[] resizeBufMethodArguments = new java.lang.Object[0];
        resizeBufMethod.invoke(base64, resizeBufMethodArguments);
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
        
        byte[] initialBase64Buf = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buf"));
        
        base64.setInitialBuffer(byteArray, -255, 1);
        
        byte[] finalBase64Buf = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buf"));
        
        assertFalse(initialBase64Buf == finalBase64Buf);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.isArrayByteBase64
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isArrayByteBase64([B)
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
            byte[] byteArray = {(byte) 68};
            
            boolean actual = Base64.isArrayByteBase64(byteArray);
            
            assertFalse(actual);
        } finally {
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isArrayByteBase64([B)
    
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
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsArrayByteBase64_ReturnTrue() {
        byte[] byteArray = {};
        
        boolean actual = Base64.isArrayByteBase64(byteArray);
        
        assertTrue(actual);
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
            org.apache.commons.codec.binary.Base64.isArrayByteBase64(Base64.java:567) */
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
    
    @Test
    public void testIsArrayByteBase642() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            byte[] byteArray = {
                (byte) 68, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0, (byte) 0
            };
            
            boolean actual = Base64.isArrayByteBase64(byteArray);
            
            assertFalse(actual);
        } finally {
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
 * @utbot.executesCondition {@code (base64Data == null): False}
 * @utbot.executesCondition {@code (base64Data.length == 0): True}
 * @utbot.returnsFrom {@code return base64Data;}
 *  */
    @Test
    public void testDecodeBase64_Base64DataLengthEqualsZero() {
        byte[] byteArray = {};
        
        byte[] actual = Base64.decodeBase64(byteArray);
        
        assertArrayEquals(byteArray, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decodeBase64(byte[])}
 * @utbot.executesCondition {@code (base64Data == null): True}
 * @utbot.returnsFrom {@code return base64Data;}
 *  */
    @Test
    public void testDecodeBase64_Base64DataEqualsNull() {
        byte[] actual = Base64.decodeBase64(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method decodeBase64([B)
    
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
            byte[] byteArray = {
                java.lang.Byte.MIN_VALUE, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73,
                (byte) 73
            };
            
            byte[] actual = Base64.decodeBase64(byteArray);
            
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
            byte[] byteArray = {(byte) 0};
            
            byte[] actual = Base64.decodeBase64(byteArray);
            
            byte[] expected = {};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testDecodeBase643() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            byte[] byteArray = {(byte) 124, (byte) 61, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73};
            
            byte[] actual = Base64.decodeBase64(byteArray);
            
            byte[] expected = {};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
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
            org.apache.commons.codec.binary.Base64.discardWhitespace(Base64.java:749) */
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
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#discardWhitespace(byte[])}
     */
    @Test
    public void testDiscardWhitespaceWithNonEmptyPrimitiveArray1() {
        byte[] byteArray = {(byte) 11, (byte) -1};
        
        byte[] actual = Base64.discardWhitespace(byteArray);
        
        byte[] expected = {(byte) 11, (byte) -1};
        
        assertArrayEquals(expected, actual);
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
    public void testEncodeBase64_ReturnEncodeBase64_2() {
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
    public void testEncodeBase64_ReturnEncodeBase64_1() {
        byte[] actual = Base64.encodeBase64(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[])}
 * @utbot.returnsFrom {@code return encodeBase64(binaryData, false);}
 *  */
    @Test
    public void testEncodeBase64_ReturnEncodeBase64() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            
            byte[] actual = Base64.encodeBase64(byteArray);
            
            byte[] expected = {(byte) 65, (byte) 65, (byte) 61, (byte) 61};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method encodeBase64([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[])}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean)}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean)}
 * @utbot.returnsFrom {@code return encodeBase64(binaryData, false);}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return encodeBase64(binaryData, false);
 *  */
    @Test
    public void testEncodeBase64_ThrowArrayIndexOutOfBoundsException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            byte[] byteArray = {(byte) -1};
            
            /* This test fails because method [org.apache.commons.codec.binary.Base64.encodeBase64] produces [java.lang.ArrayIndexOutOfBoundsException: Index 63 out of bounds for length 40]
                org.apache.commons.codec.binary.Base64.encode(Base64.java:427)
                org.apache.commons.codec.binary.Base64.encodeBase64(Base64.java:702)
                org.apache.commons.codec.binary.Base64.encodeBase64(Base64.java:666)
                org.apache.commons.codec.binary.Base64.encodeBase64(Base64.java:599) */
            Base64.encodeBase64(byteArray);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method encodeBase64([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[])}
     */
    @Test
    public void testEncodeBase64WithNonEmptyPrimitiveArray() {
        byte[] byteArray = {java.lang.Byte.MAX_VALUE, (byte) -1};
        
        byte[] actual = Base64.encodeBase64(byteArray);
        
        byte[] expected = {(byte) 102, (byte) 47, (byte) 56, (byte) 61};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encodeBase64([B)
    
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
            byte[] byteArray = {(byte) 0, (byte) 0};
            
            byte[] actual = Base64.encodeBase64(byteArray);
            
            byte[] expected = {(byte) 65, (byte) 65, (byte) 65, (byte) 0};
            
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
            byte[] byteArray = new byte[18];
            byteArray[0] = java.lang.Byte.MIN_VALUE;
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
            expected[0] = (byte) 103;
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.encodeBase64
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encodeBase64([B, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean,boolean)}
 * @utbot.executesCondition {@code (binaryData == null): False}
 * @utbot.executesCondition {@code (binaryData.length == 0): True}
 * @utbot.returnsFrom {@code return binaryData;}
 *  */
    @Test
    public void testEncodeBase64_BinaryDataLengthEqualsZero() {
        byte[] byteArray = {};
        
        byte[] actual = Base64.encodeBase64(byteArray, false, false);
        
        assertArrayEquals(byteArray, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean,boolean)}
 * @utbot.executesCondition {@code (binaryData == null): True}
 * @utbot.returnsFrom {@code return binaryData;}
 *  */
    @Test
    public void testEncodeBase64_BinaryDataEqualsNull() {
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
    public void testEncodeBase64WithNonEmptyPrimitiveArray1() {
        byte[] byteArray = {(byte) 0, (byte) -1, (byte) 0};
        
        byte[] actual = Base64.encodeBase64(byteArray, true, false);
        
        byte[] expected = {(byte) 65, (byte) 80, (byte) 56, (byte) 65, (byte) 13, (byte) 10};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean,boolean)}
     */
    @Test
    public void testEncodeBase64WithNonEmptyPrimitiveArray2() {
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        byte[] actual = Base64.encodeBase64(byteArray, true, true);
        
        byte[] expected = {
            (byte) 103, (byte) 65, (byte) 65, (byte) 66, (byte) 95, (byte) 52, (byte) 65, (byte) 13,
            (byte) 10
        };
        
        assertArrayEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean,boolean)}
     */
    @Test
    public void testEncodeBase64WithNonEmptyPrimitiveArray3() {
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        byte[] actual = Base64.encodeBase64(byteArray, false, true);
        
        byte[] expected = {(byte) 103, (byte) 65, (byte) 65, (byte) 66, (byte) 95, (byte) 52, (byte) 65};
        
        assertArrayEquals(expected, actual);
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
    public void testEncodeBase64_ReturnEncodeBase641() {
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
    public void testEncodeBase64_ReturnEncodeBase64_11() {
        byte[] actual = Base64.encodeBase64(null, false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method encodeBase64([B, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean)}
     */
    @Test
    public void testEncodeBase64WithNonEmptyPrimitiveArray4() {
        byte[] byteArray = {(byte) 0, java.lang.Byte.MAX_VALUE, (byte) -1};
        
        byte[] actual = Base64.encodeBase64(byteArray, false);
        
        byte[] expected = {(byte) 65, (byte) 72, (byte) 47, (byte) 47};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#encodeBase64(byte[],boolean)}
     */
    @Test
    public void testEncodeBase64WithNonEmptyPrimitiveArray5() {
        byte[] byteArray = {(byte) -1, (byte) 126};
        
        byte[] actual = Base64.encodeBase64(byteArray, true);
        
        byte[] expected = {(byte) 47, (byte) 51, (byte) 52, (byte) 61, (byte) 13, (byte) 10};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.readResults
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readResults([B, int, int)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#readResults(byte[],int,int)}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.executesCondition {@code (buf != b): False}
 * @utbot.returnsFrom {@code return len;}
 *  */
    @Test
    public void testReadResults_BufEqualsB() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buf = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -254);
        
        int actual = base64.readResults(buf, -255, -2);
        
        assertEquals(-2, actual);
        
        byte[] finalBase64Buf = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buf"));
        
        assertNull(finalBase64Buf);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#readResults(byte[],int,int)}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.executesCondition {@code (buf != b): True}
 * @utbot.executesCondition {@code (readPos >= pos): False}
 * @utbot.returnsFrom {@code return len;}
 *  */
    @Test
    public void testReadResults_ReadPosLessThanPos() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buf = {};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", 1);
        byte[] byteArray = {(byte) -127};
        
        int actual = base64.readResults(byteArray, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#readResults(byte[],int,int)}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.executesCondition {@code (buf != b): True}
 * @utbot.executesCondition {@code (readPos >= pos): True}
 * @utbot.returnsFrom {@code return len;}
 *  */
    @Test
    public void testReadResults_ReadPosGreaterOrEqualPos() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buf = {
            (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127,
            (byte) -127, (byte) -127
        };
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", Integer.MIN_VALUE);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", 9);
        byte[] byteArray = {(byte) -127};
        
        int actual = base64.readResults(byteArray, 0, 1);
        
        assertEquals(1, actual);
        
        byte[] finalBase64Buf = ((byte[]) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "buf"));
        int finalBase64ReadPos = ((Integer) getFieldValue(base64, "org.apache.commons.codec.binary.Base64", "readPos"));
        
        assertNull(finalBase64Buf);
        
        assertEquals(10, finalBase64ReadPos);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#readResults(byte[],int,int)}
 * @utbot.executesCondition {@code (buf != null): False}
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
 * @utbot.executesCondition {@code (buf != null): False}
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(buf, readPos, b, bPos, len);
 *  */
    @Test
    public void testReadResults_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buf = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.readResults] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.codec.binary.Base64.readResults(Base64.java:365) */
        base64.readResults(byteArray, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#readResults(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(buf, readPos, b, bPos, len);
 *  */
    @Test
    public void testReadResults_ThrowNullPointerException() throws Exception  {
        Base64 base64 = ((Base64) createInstance("org.apache.commons.codec.binary.Base64"));
        byte[] buf = {(byte) -127};
        setField(base64, "org.apache.commons.codec.binary.Base64", "buf", buf);
        setField(base64, "org.apache.commons.codec.binary.Base64", "pos", -255);
        setField(base64, "org.apache.commons.codec.binary.Base64", "readPos", -254);
        
        /* This test fails because method [org.apache.commons.codec.binary.Base64.readResults] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.codec.binary.Base64.readResults(Base64.java:365) */
        base64.readResults(null, -255, -2);
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
            org.apache.commons.codec.binary.Base64.containsBase64Byte(Base64.java:583) */
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
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#containsBase64Byte(byte[])}
     */
    @Test
    public void testContainsBase64ByteReturnsFalseWithNonEmptyPrimitiveArray1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, java.lang.Byte.MAX_VALUE};
        
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
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.discardNonBase64
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method discardNonBase64([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#discardNonBase64(byte[])}
 * @utbot.returnsFrom {@code return packedData;}
 *  */
    @Test
    public void testDiscardNonBase64_ReturnPackedData() {
        byte[] byteArray = {};
        
        byte[] actual = Base64.discardNonBase64(byteArray);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#discardNonBase64(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return packedData;}
 *  */
    @Test
    public void testDiscardNonBase64_IsBase64() {
        byte[] byteArray = {(byte) 61};
        
        byte[] actual = Base64.discardNonBase64(byteArray);
        
        byte[] expected = {(byte) 61};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#discardNonBase64(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return packedData;}
 *  */
    @Test
    public void testDiscardNonBase64_IterateForLoop() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            byte[] byteArray = {(byte) 125};
            
            byte[] actual = Base64.discardNonBase64(byteArray);
            
            byte[] expected = {};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method discardNonBase64([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#discardNonBase64(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] groomedData = new byte[data.length];
 *  */
    @Test
    public void testDiscardNonBase64_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.codec.binary.Base64.discardNonBase64] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base64.discardNonBase64(Base64.java:796) */
        Base64.discardNonBase64(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method discardNonBase64([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#discardNonBase64(byte[])}
     */
    @Test
    public void testDiscardNonBase64WithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) 0, (byte) -1, java.lang.Byte.MAX_VALUE};
        
        byte[] actual = Base64.discardNonBase64(byteArray);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#discardNonBase64(byte[])}
     */
    @Test
    public void testDiscardNonBase64WithNonEmptyPrimitiveArray1() {
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, java.lang.Byte.MAX_VALUE};
        
        byte[] actual = Base64.discardNonBase64(byteArray);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base64.decodeInteger
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method decodeInteger([B)
    
    /**
    @utbot.classUnderTest {@link Base64}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decodeInteger(byte[])}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base64#decodeBase64(byte[])}
 * @utbot.returnsFrom {@code return new BigInteger(1, decodeBase64(pArray));}
 *  */
    @Test
    public void testDecodeInteger_Base64DecodeBase64() throws Exception  {
        byte[] byteArray = {};
        
        BigInteger actual = Base64.decodeInteger(byteArray);
        
        BigInteger expected = ((BigInteger) createInstance("java.math.BigInteger"));
        
        // java.math.BigInteger has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method decodeInteger([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.binary.Base64}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base64#decodeInteger(byte[])}
     */
    @Test
    public void testDecodeIntegerWithNonEmptyPrimitiveArray() throws Exception  {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MAX_VALUE, (byte) -1};
        
        BigInteger actual = Base64.decodeInteger(byteArray);
        
        BigInteger expected = ((BigInteger) createInstance("java.math.BigInteger"));
        
        // java.math.BigInteger has overridden equals method
        assertEquals(expected, actual);
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
            org.apache.commons.codec.binary.Base64.toIntegerBytes(Base64.java:876) */
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
            org.apache.commons.codec.binary.Base64.toIntegerBytes(Base64.java:873) */
        Base64.toIntegerBytes(null);
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
            org.apache.commons.codec.binary.Base64.toIntegerBytes(Base64.java:876)
            org.apache.commons.codec.binary.Base64.encodeInteger(Base64.java:862) */
        Base64.encodeInteger(bigInteger);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encodeInteger(java.math.BigInteger)
    
    @Test
    public void testEncodeInteger1() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {132};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        
        byte[] actual = Base64.encodeInteger(bigInteger);
        
        byte[] expected = {(byte) 102, (byte) 65, (byte) 61, (byte) 61};
        
        assertArrayEquals(expected, actual);
        
        int finalBigIntegerBitLengthPlusOne = ((Integer) getFieldValue(bigInteger, "java.math.BigInteger", "bitLengthPlusOne"));
        
        assertEquals(9, finalBigIntegerBitLengthPlusOne);
    }
    
    @Test
    public void testEncodeInteger2() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {128, 1, 3, 3, 3, 3, 3, 3};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        
        byte[] actual = Base64.encodeInteger(bigInteger);
        
        byte[] expected = new byte[40];
        expected[0] = (byte) 102;
        expected[1] = (byte) 47;
        expected[2] = (byte) 47;
        expected[3] = (byte) 47;
        expected[4] = (byte) 47;
        expected[5] = (byte) 47;
        expected[6] = (byte) 55;
        expected[7] = (byte) 47;
        expected[8] = (byte) 47;
        expected[9] = (byte) 47;
        expected[10] = (byte) 47;
        expected[11] = (byte) 56;
        expected[12] = (byte) 47;
        expected[13] = (byte) 47;
        expected[14] = (byte) 47;
        expected[15] = (byte) 47;
        expected[16] = (byte) 47;
        expected[17] = (byte) 80;
        expected[18] = (byte) 47;
        expected[19] = (byte) 47;
        expected[20] = (byte) 47;
        expected[21] = (byte) 47;
        expected[22] = (byte) 122;
        expected[23] = (byte) 47;
        expected[24] = (byte) 47;
        expected[25] = (byte) 47;
        expected[26] = (byte) 47;
        expected[27] = (byte) 56;
        expected[28] = (byte) 47;
        expected[29] = (byte) 47;
        expected[30] = (byte) 47;
        expected[31] = (byte) 47;
        expected[32] = (byte) 47;
        expected[33] = (byte) 80;
        expected[34] = (byte) 47;
        expected[35] = (byte) 47;
        expected[36] = (byte) 47;
        expected[37] = (byte) 47;
        expected[38] = (byte) 48;
        expected[39] = (byte) 61;
        
        assertArrayEquals(expected, actual);
        
        int finalBigIntegerBitLengthPlusOne = ((Integer) getFieldValue(bigInteger, "java.math.BigInteger", "bitLengthPlusOne"));
        
        assertEquals(233, finalBigIntegerBitLengthPlusOne);
    }
    
    @Test
    public void testEncodeInteger3() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {
            Integer.MIN_VALUE, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        
        byte[] actual = Base64.encodeInteger(bigInteger);
        
        byte[] expected = new byte[48];
        expected[0] = (byte) 102;
        expected[1] = (byte) 47;
        expected[2] = (byte) 47;
        expected[3] = (byte) 47;
        expected[4] = (byte) 47;
        expected[5] = (byte) 47;
        expected[6] = (byte) 47;
        expected[7] = (byte) 47;
        expected[8] = (byte) 47;
        expected[9] = (byte) 47;
        expected[10] = (byte) 122;
        expected[11] = (byte) 47;
        expected[12] = (byte) 47;
        expected[13] = (byte) 47;
        expected[14] = (byte) 47;
        expected[15] = (byte) 56;
        expected[16] = (byte) 47;
        expected[17] = (byte) 47;
        expected[18] = (byte) 47;
        expected[19] = (byte) 47;
        expected[20] = (byte) 47;
        expected[21] = (byte) 80;
        expected[22] = (byte) 47;
        expected[23] = (byte) 47;
        expected[24] = (byte) 47;
        expected[25] = (byte) 47;
        expected[26] = (byte) 122;
        expected[27] = (byte) 47;
        expected[28] = (byte) 47;
        expected[29] = (byte) 47;
        expected[30] = (byte) 47;
        expected[31] = (byte) 56;
        expected[32] = (byte) 47;
        expected[33] = (byte) 47;
        expected[34] = (byte) 47;
        expected[35] = (byte) 47;
        expected[36] = (byte) 47;
        expected[37] = (byte) 80;
        expected[38] = (byte) 47;
        expected[39] = (byte) 47;
        expected[40] = (byte) 47;
        expected[41] = (byte) 47;
        expected[42] = (byte) 122;
        expected[43] = (byte) 47;
        expected[44] = (byte) 47;
        expected[45] = (byte) 47;
        expected[46] = (byte) 47;
        expected[47] = (byte) 57;
        
        assertArrayEquals(expected, actual);
        
        int finalBigIntegerBitLengthPlusOne = ((Integer) getFieldValue(bigInteger, "java.math.BigInteger", "bitLengthPlusOne"));
        
        assertEquals(289, finalBigIntegerBitLengthPlusOne);
    }
    
    @Test
    public void testEncodeInteger4() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {8192};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        
        byte[] actual = Base64.encodeInteger(bigInteger);
        
        byte[] expected = {(byte) 52, (byte) 65, (byte) 65, (byte) 61};
        
        assertArrayEquals(expected, actual);
        
        int finalBigIntegerBitLengthPlusOne = ((Integer) getFieldValue(bigInteger, "java.math.BigInteger", "bitLengthPlusOne"));
        
        assertEquals(14, finalBigIntegerBitLengthPlusOne);
    }
    
    @Test
    public void testEncodeInteger5() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {4};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        
        byte[] actual = Base64.encodeInteger(bigInteger);
        
        byte[] expected = {(byte) 47, (byte) 65, (byte) 61, (byte) 61};
        
        assertArrayEquals(expected, actual);
        
        int finalBigIntegerBitLengthPlusOne = ((Integer) getFieldValue(bigInteger, "java.math.BigInteger", "bitLengthPlusOne"));
        
        assertEquals(3, finalBigIntegerBitLengthPlusOne);
    }
    
    @Test
    public void testEncodeInteger6() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {4194304};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        
        byte[] actual = Base64.encodeInteger(bigInteger);
        
        byte[] expected = {(byte) 119, (byte) 65, (byte) 65, (byte) 65};
        
        assertArrayEquals(expected, actual);
        
        int finalBigIntegerBitLengthPlusOne = ((Integer) getFieldValue(bigInteger, "java.math.BigInteger", "bitLengthPlusOne"));
        
        assertEquals(23, finalBigIntegerBitLengthPlusOne);
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encodeBase64URLSafe([B)
    
    @Test
    public void testEncodeBase64URLSafe1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            byte[] byteArray = {(byte) 0, (byte) 0};
            
            byte[] actual = Base64.encodeBase64URLSafe(byteArray);
            
            byte[] expected = {(byte) 65, (byte) 65, (byte) 65};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testEncodeBase64URLSafe2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            byte[] byteArray = {
                java.lang.Byte.MIN_VALUE, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73, (byte) 73,
                (byte) 73
            };
            
            byte[] actual = Base64.encodeBase64URLSafe(byteArray);
            
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
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testEncodeBase64URLSafe3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            byte[] byteArray = new byte[13];
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
            
            byte[] actual = Base64.encodeBase64URLSafe(byteArray);
            
            byte[] expected = new byte[18];
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
            expected[17] = (byte) 81;
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "URL_SAFE_ENCODE_TABLE", prevURL_SAFE_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
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
        byte[] byteArray = {java.lang.Byte.MAX_VALUE, (byte) -1};
        
        byte[] actual = Base64.encodeBase64Chunked(byteArray);
        
        byte[] expected = {(byte) 102, (byte) 47, (byte) 56, (byte) 61, (byte) 13, (byte) 10};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encodeBase64Chunked([B)
    
    @Test
    public void testEncodeBase64Chunked1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            
            byte[] actual = Base64.encodeBase64Chunked(byteArray);
            
            byte[] expected = {(byte) 65, (byte) 65, (byte) 13, (byte) 10, (byte) 0, (byte) 0};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
        }
    }
    
    @Test
    public void testEncodeBase64Chunked2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            byteArray[17] = (byte) 73;
            
            byte[] actual = Base64.encodeBase64Chunked(byteArray);
            
            byte[] expected = new byte[26];
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
            expected[22] = (byte) 108;
            expected[23] = (byte) 74;
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
    public void testEncodeBase64Chunked3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            byte[] byteArray = {java.lang.Byte.MIN_VALUE, (byte) 73};
            
            byte[] actual = Base64.encodeBase64Chunked(byteArray);
            
            byte[] expected = {(byte) 103, (byte) 69, (byte) 107, (byte) 13, (byte) 10, (byte) 0};
            
            assertArrayEquals(expected, actual);
        } finally {
            setStaticField(Base64.class, "CHUNK_SEPARATOR", prevCHUNK_SEPARATOR);
            setStaticField(Base64.class, "STANDARD_ENCODE_TABLE", prevSTANDARD_ENCODE_TABLE);
            setStaticField(Base64.class, "DECODE_TABLE", prevDECODE_TABLE);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields875009510196800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields875009510196800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass875009510202200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields875009510196800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass875009510202200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields875009510606100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields875009510606100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass875009510608100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields875009510606100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass875009510608100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields875009510967400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields875009510967400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass875009510969200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields875009510967400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass875009510969200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields875009511694600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields875009511694600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass875009511697600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields875009511694600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass875009511697600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

