package org.apache.commons.codec.binary;

import org.junit.Test;
import org.apache.commons.codec.binary.BaseNCodec.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_codec_binary_Base32Test {
    ///region Test suites for executable org.apache.commons.codec.binary.Base32.decode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method decode([B, int, int, org.apache.commons.codec.binary.BaseNCodec$Context)
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testDecode_ContextEof() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.eof = true;
        
        base32.decode(null, -255, -255, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.executesCondition {@code (context.eof): False}
 *  */
    @Test
    public void testDecode_NotContextEof() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.eof = false;
        
        base32.decode(null, -255, 0, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 *  */
    @Test
    public void testDecode_ContextModulusLessThan2() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) -127, (byte) -127};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.eof = false;
        context.modulus = 1;
        
        base32.decode(byteArray, 1, 1, context);
        
        boolean finalContextEof = context.eof;
        
        assertTrue(finalContextEof);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): False}
 *  */
    @Test
    public void testDecode_ContextModulusLessThan2_1() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.eof = false;
        context.modulus = 1;
        
        base32.decode(null, -255, -1, context);
        
        boolean finalContextEof = context.eof;
        
        assertTrue(finalContextEof);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.activatesSwitch {@code switch(context.modulus) case: 3}
 *  */
    @Test
    public void testDecode_SwitchContextModulusCase3() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 1);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) -127, (byte) -127};
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 3;
        
        base32.decode(byteArray, 1, 1, context);
        
        int finalContextPos = context.pos;
        boolean finalContextEof = context.eof;
        
        assertEquals(1, finalContextPos);
        
        assertTrue(finalContextEof);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.activatesSwitch {@code switch(context.modulus) case: 5}
 *  */
    @Test
    public void testDecode_SwitchContextModulusCase5() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 3);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) -127, (byte) -127};
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = new byte[13];
        context.buffer = buffer;
        context.pos = 10;
        context.eof = false;
        context.modulus = 5;
        
        base32.decode(byteArray, 1, 1, context);
        
        int finalContextPos = context.pos;
        boolean finalContextEof = context.eof;
        
        assertEquals(13, finalContextPos);
        
        assertTrue(finalContextEof);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.activatesSwitch {@code switch(context.modulus) case: 2}
 *  */
    @Test
    public void testDecode_SwitchContextModulusCase2() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 1);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 2;
        
        base32.decode(null, -255, -1, context);
        
        int finalContextPos = context.pos;
        boolean finalContextEof = context.eof;
        
        assertEquals(1, finalContextPos);
        
        assertTrue(finalContextEof);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.activatesSwitch {@code switch(context.modulus) case: 4}
 *  */
    @Test
    public void testDecode_SwitchContextModulusCase4() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 2);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0, (byte) 0};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 4;
        
        base32.decode(null, -255, -1, context);
        
        int finalContextPos = context.pos;
        boolean finalContextEof = context.eof;
        
        assertEquals(2, finalContextPos);
        
        assertTrue(finalContextEof);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.activatesSwitch {@code switch(context.modulus) case: 6}
 *  */
    @Test
    public void testDecode_SwitchContextModulusCase6() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 3);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = new byte[13];
        context.buffer = buffer;
        context.pos = 10;
        context.eof = false;
        context.modulus = 6;
        
        base32.decode(null, -255, -1, context);
        
        int finalContextPos = context.pos;
        boolean finalContextEof = context.eof;
        
        assertEquals(13, finalContextPos);
        
        assertTrue(finalContextEof);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.activatesSwitch {@code switch(context.modulus) case: 7}
 *  */
    @Test
    public void testDecode_SwitchContextModulusCase7() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 4);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = new byte[13];
        context.buffer = buffer;
        context.pos = 9;
        context.eof = false;
        context.modulus = 7;
        
        base32.decode(null, -255, -1, context);
        
        int finalContextPos = context.pos;
        boolean finalContextEof = context.eof;
        
        assertEquals(13, finalContextPos);
        
        assertTrue(finalContextEof);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 *  */
    @Test
    public void testDecode_ContextModulusEqualsZero() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 5);
        byte[] decodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeTable", decodeTable);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = -255L;
        byte[] buffer = {(byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = -9;
        
        base32.decode(byteArray, 0, 1, context);
        
        long finalContextLbitWorkArea = context.lbitWorkArea;
        byte finalContextBuffer0 = context.buffer[0];
        byte finalContextBuffer1 = context.buffer[1];
        byte finalContextBuffer2 = context.buffer[2];
        byte finalContextBuffer3 = context.buffer[3];
        byte finalContextBuffer4 = context.buffer[4];
        int finalContextPos = context.pos;
        int finalContextModulus = context.modulus;
        
        assertEquals(-8160L, finalContextLbitWorkArea);
        
        assertEquals((byte) -1, finalContextBuffer0);
        
        assertEquals((byte) -1, finalContextBuffer1);
        
        assertEquals((byte) -1, finalContextBuffer2);
        
        assertEquals((byte) -32, finalContextBuffer3);
        
        assertEquals((byte) 32, finalContextBuffer4);
        
        assertEquals(5, finalContextPos);
        
        assertEquals(0, finalContextModulus);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 *  */
    @Test
    public void testDecode_ContextModulusNotEqualsZero() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 129);
        byte[] decodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeTable", decodeTable);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) -127, (byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = -255L;
        byte[] buffer = {};
        context.buffer = buffer;
        context.pos = -129;
        context.eof = false;
        context.modulus = 2147483640;
        
        base32.decode(byteArray, 1, 1, context);
        
        long finalContextLbitWorkArea = context.lbitWorkArea;
        int finalContextModulus = context.modulus;
        
        assertEquals(-8160L, finalContextLbitWorkArea);
        
        assertEquals(1, finalContextModulus);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method decode([B, int, int, org.apache.commons.codec.binary.BaseNCodec$Context)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (context.eof): False},
    ///     {@code (inAvail < 0): False},
    ///     {@code (b == pad): False}
    /// invoke:
    ///     {@link org.apache.commons.codec.binary.Base32#ensureBufferSize(int,org.apache.commons.codec.binary.BaseNCodec.Context)} once
    /// execute conditions:
    ///     {@code (context.eof): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 *  */
    @Test
    public void testDecode_BLessThanZero() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 129);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) -127, (byte) -1};
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {};
        context.buffer = buffer;
        context.pos = -129;
        context.eof = false;
        
        base32.decode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 *  */
    @Test
    public void testDecode_BGreaterOrEqualThisDecodeTableLength() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 129);
        byte[] decodeTable = {};
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeTable", decodeTable);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) -127, (byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.buffer = decodeTable;
        context.pos = -129;
        context.eof = false;
        
        base32.decode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 *  */
    @Test
    public void testDecode_ResultLessThanZero() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 129);
        byte[] decodeTable = {(byte) -1};
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeTable", decodeTable);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) -127, (byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {};
        context.buffer = buffer;
        context.pos = -129;
        context.eof = false;
        
        base32.decode(byteArray, 1, 1, context);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method decode([B, int, int, org.apache.commons.codec.binary.BaseNCodec$Context)
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final byte b = in[inPos++];
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        byte[] byteArray = {(byte) -127, (byte) -127};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.eof = false;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 2]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:346) */
        base32.decode(byteArray, 9, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 8) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 1);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) -127, (byte) -127};
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 5;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:393) */
        base32.decode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) ((context.lbitWorkArea) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 2);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) -127, (byte) -127};
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0, (byte) 0};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 5;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:394) */
        base32.decode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.activatesSwitch {@code switch(context.modulus) case: 3}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 7) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", Integer.MIN_VALUE);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) -127, (byte) -127};
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.pos = -2147483647;
        context.eof = false;
        context.modulus = 3;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483647 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:383) */
        base32.decode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 16) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", Integer.MIN_VALUE);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) -127, (byte) -127};
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.pos = -2147483647;
        context.eof = false;
        context.modulus = 5;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483647 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:392) */
        base32.decode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 16) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", -1073741823);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) -127, (byte) -127};
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.pos = 1073741824;
        context.eof = false;
        context.modulus = 6;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:398) */
        base32.decode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 8) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_14() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 1);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 6;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:399) */
        base32.decode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) ((context.lbitWorkArea) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_15() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 1);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 4;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:388) */
        base32.decode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 16) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_16() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 1);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 7;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:405) */
        base32.decode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) ((context.lbitWorkArea) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_17() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 2);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0, (byte) 0};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 6;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:400) */
        base32.decode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 8) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_18() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 2);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0, (byte) 0};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 7;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:406) */
        base32.decode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 24) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 1);
        byte[] decodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeTable", decodeTable);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) -127, (byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = -255L;
        byte[] buffer = {(byte) -127};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = -9;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:361) */
        base32.decode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 16) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 2);
        byte[] decodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeTable", decodeTable);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) -127, (byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = -255L;
        byte[] buffer = {(byte) -127, (byte) -127};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = -9;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:362) */
        base32.decode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.activatesSwitch {@code switch(context.modulus) case: 2}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 2) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", -536870911);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.pos = 536870912;
        context.eof = false;
        context.modulus = 2;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870912 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:380) */
        base32.decode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 24) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", -536870911);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.pos = 536870912;
        context.eof = false;
        context.modulus = 7;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870912 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:404) */
        base32.decode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 8) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", Integer.MIN_VALUE);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.pos = -2147483647;
        context.eof = false;
        context.modulus = 4;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483647 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:387) */
        base32.decode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.executesCondition {@code (context.modulus >= 2): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) ((context.lbitWorkArea) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_19() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 3);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = new byte[15];
        context.buffer = buffer;
        context.pos = 12;
        context.eof = false;
        context.modulus = 7;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:407) */
        base32.decode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 32) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", -127);
        byte[] decodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeTable", decodeTable);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) -127, (byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = -255L;
        byte[] buffer = {(byte) -127, (byte) -127};
        context.buffer = buffer;
        context.pos = 129;
        context.eof = false;
        context.modulus = -9;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:360) */
        base32.decode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 8) & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 3);
        byte[] decodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeTable", decodeTable);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) -127, (byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = -255L;
        byte[] buffer = new byte[15];
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
        context.buffer = buffer;
        context.pos = 12;
        context.eof = false;
        context.modulus = -9;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:363) */
        base32.decode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = (byte) (context.lbitWorkArea & MASK_8BITS);
 *  */
    @Test
    public void testDecode_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 4);
        byte[] decodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeTable", decodeTable);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = -255L;
        byte[] buffer = {(byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127};
        context.buffer = buffer;
        context.pos = 2;
        context.eof = false;
        context.modulus = -57;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:364) */
        base32.decode(byteArray, 0, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: context.eof
 *  */
    @Test
    public void testDecode_ThrowNullPointerException_1() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:339) */
        base32.decode(null, -255, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final byte b = in[inPos++];
 *  */
    @Test
    public void testDecode_ThrowNullPointerException() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.eof = false;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:346) */
        base32.decode(null, 0, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: b >= 0 && b < this.decodeTable.length
 *  */
    @Test
    public void testDecode_ThrowNullPointerException_2() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", 129);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) -127, (byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {};
        context.buffer = buffer;
        context.pos = -129;
        context.eof = false;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.decode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base32.decode(Base32.java:353) */
        base32.decode(byteArray, 1, 1, context);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method decode([B, int, int, org.apache.commons.codec.binary.BaseNCodec$Context)
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: switch(context.modulus) case: default
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDecode_ThrowIllegalStateException() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", Integer.MIN_VALUE);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        byte[] byteArray = {(byte) -127, (byte) -127};
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.pos = -2147483647;
        context.eof = false;
        context.modulus = 8;
        
        base32.decode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#decode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: switch(context.modulus) case: default
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDecode_ThrowIllegalStateException_1() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeSize", Integer.MIN_VALUE);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {};
        context.buffer = buffer;
        context.pos = -2147483647;
        context.eof = false;
        context.modulus = 8;
        
        base32.decode(null, -255, -1, context);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method decode([B, int, int, org.apache.commons.codec.binary.BaseNCodec$Context)
    
    @Test(timeout = 1000L)
    public void testDecodeByFuzzer() {
        Base32 base32 = new Base32(true);
        byte[] byteArray = {(byte) 7, (byte) 6, java.lang.Byte.MAX_VALUE, (byte) 7, (byte) 2};
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        base32.decode(byteArray, -1, 1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base32.encode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encode([B, int, int, org.apache.commons.codec.binary.BaseNCodec$Context)
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testEncode_ContextEof() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.eof = true;
        
        base32.encode(null, -255, -255, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 *  */
    @Test
    public void testEncode_InAvailGreaterOrEqualZero() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.eof = false;
        
        base32.encode(null, -255, 0, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): True}
 * @utbot.executesCondition {@code (lineLength == 0): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testEncode_LineLengthEqualsZero() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.eof = false;
        
        base32.encode(null, -255, -1, context);
        
        boolean finalContextEof = context.eof;
        
        assertTrue(finalContextEof);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): True}
 * @utbot.executesCondition {@code (lineLength == 0): False}
 * @utbot.executesCondition {@code (lineLength > 0): True}
 * @utbot.executesCondition {@code (context.currentLinePos > 0): False}
 *  */
    @Test
    public void testEncode_ContextCurrentLinePosLessOrEqualZero() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 73);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "lineLength", 1);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {};
        context.buffer = buffer;
        context.pos = -73;
        context.eof = false;
        
        base32.encode(null, -255, -1, context);
        
        boolean finalContextEof = context.eof;
        
        assertTrue(finalContextEof);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 *  */
    @Test
    public void testEncode_ZeroNotEqualsContextModulus() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", -54);
        byte[] byteArray = {(byte) -1};
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.pos = 55;
        context.eof = false;
        context.modulus = 1163898880;
        
        base32.encode(byteArray, 0, 1, context);
        
        long finalContextLbitWorkArea = context.lbitWorkArea;
        int finalContextModulus = context.modulus;
        
        assertEquals(255L, finalContextLbitWorkArea);
        
        assertEquals(1, finalContextModulus);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): True}
 * @utbot.executesCondition {@code (lineLength == 0): False}
 * @utbot.executesCondition {@code (lineLength > 0): False}
 *  */
    @Test
    public void testEncode_LineLengthLessOrEqualZero() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "lineLength", -256);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.pos = 1;
        context.eof = false;
        context.currentLinePos = 2;
        
        base32.encode(null, -255, -1, context);
        
        boolean finalContextEof = context.eof;
        
        assertTrue(finalContextEof);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): True}
 * @utbot.executesCondition {@code (lineLength == 0): False}
 * @utbot.executesCondition {@code (lineLength > 0): True}
 * @utbot.executesCondition {@code (context.currentLinePos > 0): True}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 *  */
    @Test
    public void testEncode_ContextCurrentLinePosGreaterThanZero() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 1);
        byte[] lineSeparator = {};
        setField(base32, "org.apache.commons.codec.binary.Base32", "lineSeparator", lineSeparator);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "lineLength", 1);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.eof = false;
        context.currentLinePos = 1;
        
        base32.encode(null, -255, -1, context);
        
        boolean finalContextEof = context.eof;
        
        assertTrue(finalContextEof);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 *  */
    @Test
    public void testEncode_LineLengthLessOrEqualZero_1() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 9);
        byte[] encodeTable = {(byte) -127, (byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        byte[] byteArray = {(byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 4L;
        byte[] buffer = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 1172896629;
        
        base32.encode(byteArray, 0, 1, context);
        
        long finalContextLbitWorkArea = context.lbitWorkArea;
        byte finalContextBuffer0 = context.buffer[0];
        byte finalContextBuffer1 = context.buffer[1];
        byte finalContextBuffer2 = context.buffer[2];
        byte finalContextBuffer3 = context.buffer[3];
        byte finalContextBuffer4 = context.buffer[4];
        byte finalContextBuffer5 = context.buffer[5];
        byte finalContextBuffer6 = context.buffer[6];
        byte finalContextBuffer7 = context.buffer[7];
        int finalContextPos = context.pos;
        int finalContextCurrentLinePos = context.currentLinePos;
        int finalContextModulus = context.modulus;
        
        assertEquals(1024L, finalContextLbitWorkArea);
        
        assertEquals((byte) -127, finalContextBuffer0);
        
        assertEquals((byte) -127, finalContextBuffer1);
        
        assertEquals((byte) -127, finalContextBuffer2);
        
        assertEquals((byte) -127, finalContextBuffer3);
        
        assertEquals((byte) -127, finalContextBuffer4);
        
        assertEquals((byte) -127, finalContextBuffer5);
        
        assertEquals((byte) -127, finalContextBuffer6);
        
        assertEquals((byte) -127, finalContextBuffer7);
        
        assertEquals(8, finalContextPos);
        
        assertEquals(8, finalContextCurrentLinePos);
        
        assertEquals(0, finalContextModulus);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 *  */
    @Test
    public void testEncode_LineLengthGreaterThanContextCurrentLinePos() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 9);
        byte[] encodeTable = {(byte) -127, (byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "lineLength", 1);
        byte[] byteArray = {(byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 4L;
        byte[] buffer = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        context.buffer = buffer;
        context.eof = false;
        context.currentLinePos = -8;
        context.modulus = 1173060469;
        
        base32.encode(byteArray, 0, 1, context);
        
        long finalContextLbitWorkArea = context.lbitWorkArea;
        byte finalContextBuffer0 = context.buffer[0];
        byte finalContextBuffer1 = context.buffer[1];
        byte finalContextBuffer2 = context.buffer[2];
        byte finalContextBuffer3 = context.buffer[3];
        byte finalContextBuffer4 = context.buffer[4];
        byte finalContextBuffer5 = context.buffer[5];
        byte finalContextBuffer6 = context.buffer[6];
        byte finalContextBuffer7 = context.buffer[7];
        int finalContextPos = context.pos;
        int finalContextCurrentLinePos = context.currentLinePos;
        int finalContextModulus = context.modulus;
        
        assertEquals(1024L, finalContextLbitWorkArea);
        
        assertEquals((byte) -127, finalContextBuffer0);
        
        assertEquals((byte) -127, finalContextBuffer1);
        
        assertEquals((byte) -127, finalContextBuffer2);
        
        assertEquals((byte) -127, finalContextBuffer3);
        
        assertEquals((byte) -127, finalContextBuffer4);
        
        assertEquals((byte) -127, finalContextBuffer5);
        
        assertEquals((byte) -127, finalContextBuffer6);
        
        assertEquals((byte) -127, finalContextBuffer7);
        
        assertEquals(8, finalContextPos);
        
        assertEquals(0, finalContextCurrentLinePos);
        
        assertEquals(0, finalContextModulus);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.executesCondition {@code (lineLength > 0): False}
 * @utbot.activatesSwitch {@code switch(context.modulus) case: 1}
 *  */
    @Test
    public void testEncode_SwitchContextModulusCase1() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 8);
        byte[] encodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = new byte[25];
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
        context.buffer = buffer;
        context.pos = 17;
        context.eof = false;
        context.modulus = 1;
        
        base32.encode(null, -255, -1, context);
        
        byte finalContextBuffer17 = context.buffer[17];
        byte finalContextBuffer18 = context.buffer[18];
        int finalContextPos = context.pos;
        boolean finalContextEof = context.eof;
        int finalContextCurrentLinePos = context.currentLinePos;
        
        assertEquals((byte) 0, finalContextBuffer17);
        
        assertEquals((byte) 0, finalContextBuffer18);
        
        assertEquals(25, finalContextPos);
        
        assertTrue(finalContextEof);
        
        assertEquals(8, finalContextCurrentLinePos);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.executesCondition {@code (lineLength > 0): False}
 * @utbot.activatesSwitch {@code switch(context.modulus) case: 3}
 *  */
    @Test
    public void testEncode_SwitchContextModulusCase3() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 8);
        byte[] encodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) 0);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = new byte[25];
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
        context.buffer = buffer;
        context.pos = 17;
        context.eof = false;
        context.modulus = 3;
        
        base32.encode(null, -255, -1, context);
        
        byte finalContextBuffer17 = context.buffer[17];
        byte finalContextBuffer18 = context.buffer[18];
        byte finalContextBuffer19 = context.buffer[19];
        byte finalContextBuffer20 = context.buffer[20];
        byte finalContextBuffer21 = context.buffer[21];
        byte finalContextBuffer22 = context.buffer[22];
        byte finalContextBuffer23 = context.buffer[23];
        byte finalContextBuffer24 = context.buffer[24];
        int finalContextPos = context.pos;
        boolean finalContextEof = context.eof;
        int finalContextCurrentLinePos = context.currentLinePos;
        
        assertEquals((byte) 0, finalContextBuffer17);
        
        assertEquals((byte) 0, finalContextBuffer18);
        
        assertEquals((byte) 0, finalContextBuffer19);
        
        assertEquals((byte) 0, finalContextBuffer20);
        
        assertEquals((byte) 0, finalContextBuffer21);
        
        assertEquals((byte) 0, finalContextBuffer22);
        
        assertEquals((byte) 0, finalContextBuffer23);
        
        assertEquals((byte) 0, finalContextBuffer24);
        
        assertEquals(25, finalContextPos);
        
        assertTrue(finalContextEof);
        
        assertEquals(8, finalContextCurrentLinePos);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.executesCondition {@code (lineLength > 0): False}
 * @utbot.activatesSwitch {@code switch(context.modulus) case: 2}
 *  */
    @Test
    public void testEncode_SwitchContextModulusCase2() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 8);
        byte[] encodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) 0);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = new byte[25];
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
        context.buffer = buffer;
        context.pos = 17;
        context.eof = false;
        context.modulus = 2;
        
        base32.encode(null, -255, -1, context);
        
        byte finalContextBuffer17 = context.buffer[17];
        byte finalContextBuffer18 = context.buffer[18];
        byte finalContextBuffer19 = context.buffer[19];
        byte finalContextBuffer20 = context.buffer[20];
        byte finalContextBuffer21 = context.buffer[21];
        byte finalContextBuffer22 = context.buffer[22];
        byte finalContextBuffer23 = context.buffer[23];
        byte finalContextBuffer24 = context.buffer[24];
        int finalContextPos = context.pos;
        boolean finalContextEof = context.eof;
        int finalContextCurrentLinePos = context.currentLinePos;
        
        assertEquals((byte) 0, finalContextBuffer17);
        
        assertEquals((byte) 0, finalContextBuffer18);
        
        assertEquals((byte) 0, finalContextBuffer19);
        
        assertEquals((byte) 0, finalContextBuffer20);
        
        assertEquals((byte) 0, finalContextBuffer21);
        
        assertEquals((byte) 0, finalContextBuffer22);
        
        assertEquals((byte) 0, finalContextBuffer23);
        
        assertEquals((byte) 0, finalContextBuffer24);
        
        assertEquals(25, finalContextPos);
        
        assertTrue(finalContextEof);
        
        assertEquals(8, finalContextCurrentLinePos);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.executesCondition {@code (lineLength > 0): False}
 * @utbot.activatesSwitch {@code switch(context.modulus) case: 4}
 *  */
    @Test
    public void testEncode_SwitchContextModulusCase4() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 8);
        byte[] encodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) 0);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = new byte[33];
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
        buffer[31] = (byte) -127;
        buffer[32] = (byte) -127;
        context.buffer = buffer;
        context.pos = 25;
        context.eof = false;
        context.modulus = 4;
        
        base32.encode(null, -255, -1, context);
        
        byte finalContextBuffer25 = context.buffer[25];
        byte finalContextBuffer26 = context.buffer[26];
        byte finalContextBuffer27 = context.buffer[27];
        byte finalContextBuffer28 = context.buffer[28];
        byte finalContextBuffer29 = context.buffer[29];
        byte finalContextBuffer30 = context.buffer[30];
        byte finalContextBuffer31 = context.buffer[31];
        byte finalContextBuffer32 = context.buffer[32];
        int finalContextPos = context.pos;
        boolean finalContextEof = context.eof;
        int finalContextCurrentLinePos = context.currentLinePos;
        
        assertEquals((byte) 0, finalContextBuffer25);
        
        assertEquals((byte) 0, finalContextBuffer26);
        
        assertEquals((byte) 0, finalContextBuffer27);
        
        assertEquals((byte) 0, finalContextBuffer28);
        
        assertEquals((byte) 0, finalContextBuffer29);
        
        assertEquals((byte) 0, finalContextBuffer30);
        
        assertEquals((byte) 0, finalContextBuffer31);
        
        assertEquals((byte) 0, finalContextBuffer32);
        
        assertEquals(33, finalContextPos);
        
        assertTrue(finalContextEof);
        
        assertEquals(8, finalContextCurrentLinePos);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 *  */
    @Test
    public void testEncode_LineLengthLessOrEqualContextCurrentLinePos() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 14);
        byte[] encodeTable = {(byte) -127, (byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        byte[] lineSeparator = {};
        setField(base32, "org.apache.commons.codec.binary.Base32", "lineSeparator", lineSeparator);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "lineLength", 1);
        byte[] byteArray = {(byte) -127, (byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 4L;
        byte[] buffer = new byte[15];
        context.buffer = buffer;
        context.pos = 1;
        context.eof = false;
        context.currentLinePos = -7;
        context.modulus = -131888381;
        
        base32.encode(byteArray, 1, 1, context);
        
        long finalContextLbitWorkArea = context.lbitWorkArea;
        byte finalContextBuffer1 = context.buffer[1];
        byte finalContextBuffer2 = context.buffer[2];
        byte finalContextBuffer3 = context.buffer[3];
        byte finalContextBuffer4 = context.buffer[4];
        byte finalContextBuffer5 = context.buffer[5];
        byte finalContextBuffer6 = context.buffer[6];
        byte finalContextBuffer7 = context.buffer[7];
        byte finalContextBuffer8 = context.buffer[8];
        int finalContextPos = context.pos;
        int finalContextCurrentLinePos = context.currentLinePos;
        int finalContextModulus = context.modulus;
        
        assertEquals(1024L, finalContextLbitWorkArea);
        
        assertEquals((byte) -127, finalContextBuffer1);
        
        assertEquals((byte) -127, finalContextBuffer2);
        
        assertEquals((byte) -127, finalContextBuffer3);
        
        assertEquals((byte) -127, finalContextBuffer4);
        
        assertEquals((byte) -127, finalContextBuffer5);
        
        assertEquals((byte) -127, finalContextBuffer6);
        
        assertEquals((byte) -127, finalContextBuffer7);
        
        assertEquals((byte) -127, finalContextBuffer8);
        
        assertEquals(9, finalContextPos);
        
        assertEquals(0, finalContextCurrentLinePos);
        
        assertEquals(0, finalContextModulus);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method encode([B, int, int, org.apache.commons.codec.binary.BaseNCodec$Context)
    /// Actual number of generated tests (77) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int b = in[inPos++];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", -255);
        byte[] byteArray = {};
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {};
        context.buffer = buffer;
        context.pos = 256;
        context.eof = false;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 0]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:503) */
        base32.encode(byteArray, -256, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int b = in[inPos++];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", -255);
        byte[] byteArray = {(byte) -127, (byte) -127};
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.pos = 256;
        context.eof = false;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:503) */
        base32.encode(byteArray, 129, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 30) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 1);
        byte[] encodeTable = {
            (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127,
            (byte) -127
        };
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        byte[] byteArray = {(byte) 0, (byte) -126};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 67108865L;
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = -1279071736;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 9]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:510) */
        base32.encode(byteArray, 0, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 30) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 1);
        byte[] encodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        byte[] byteArray = {(byte) -127, (byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 1L;
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = -330314086;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:510) */
        base32.encode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 25) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 2);
        byte[] encodeTable = {
            (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127,
            (byte) -127
        };
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        byte[] byteArray = {(byte) -127, (byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 18014398511579137L;
        byte[] buffer = {(byte) 0, (byte) 0};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = -1078996436;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 9]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:511) */
        base32.encode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 25) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 2);
        byte[] encodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        byte[] byteArray = {(byte) -127, (byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 1L;
        byte[] buffer = {(byte) 0, (byte) 0};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = -348378196;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:511) */
        base32.encode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 20) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 5);
        byte[] encodeTable = {
            (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127,
            (byte) -127
        };
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        byte[] byteArray = {(byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 65537L;
        byte[] buffer = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = -1661788076;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 9]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:512) */
        base32.encode(byteArray, 0, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) context.lbitWorkArea & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_17() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 7);
        byte[] encodeTable = {
            (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127,
            (byte) -127
        };
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        byte[] byteArray = {(byte) 9};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 1L;
        byte[] buffer = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = -182982411;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:516) */
        base32.encode(byteArray, 0, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 22) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_30() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 1);
        byte[] encodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.buffer = encodeTable;
        context.eof = false;
        context.modulus = 4;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:482) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 14) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 1);
        byte[] encodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.buffer = encodeTable;
        context.eof = false;
        context.modulus = 3;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:472) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea << 2) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_32() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 1);
        byte[] encodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.buffer = encodeTable;
        context.eof = false;
        context.modulus = 1;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:452) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 6) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_33() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 1);
        byte[] encodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.buffer = encodeTable;
        context.eof = false;
        context.modulus = 2;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:462) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = pad;
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_34() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 2);
        byte[] encodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "pad", (byte) -127);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) -127, (byte) -127};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 1;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:453) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 17) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_36() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 2);
        byte[] encodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) -127, (byte) -127};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 4;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:483) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 1) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_37() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 2);
        byte[] encodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) -127, (byte) -127};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 2;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:463) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 35) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", -256);
        byte[] encodeTable = {(byte) -127, (byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        byte[] byteArray = {(byte) -127, (byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = -255L;
        byte[] buffer = {(byte) 0, (byte) 0};
        context.buffer = buffer;
        context.pos = 258;
        context.eof = false;
        context.modulus = -859743736;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 31 out of bounds for length 2]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:509) */
        base32.encode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 35) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 66);
        byte[] encodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        byte[] byteArray = {(byte) 0, (byte) -126};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 1L;
        byte[] buffer = {(byte) 0, (byte) 0};
        context.buffer = buffer;
        context.pos = -64;
        context.eof = false;
        context.modulus = -943384056;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index -64 out of bounds for length 2]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:509) */
        base32.encode(byteArray, 0, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 20) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 3);
        byte[] encodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        byte[] byteArray = {(byte) -127, (byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 1L;
        byte[] buffer = new byte[15];
        context.buffer = buffer;
        context.pos = 12;
        context.eof = false;
        context.modulus = -169643336;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:512) */
        base32.encode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 15) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 4);
        byte[] encodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        byte[] byteArray = {(byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 129L;
        byte[] buffer = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        context.buffer = buffer;
        context.pos = 1;
        context.eof = false;
        context.modulus = -419981986;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:513) */
        base32.encode(byteArray, 0, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 15) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 4);
        byte[] encodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        byte[] byteArray = {(byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 1L;
        byte[] buffer = new byte[13];
        context.buffer = buffer;
        context.pos = 9;
        context.eof = false;
        context.modulus = -328318561;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:513) */
        base32.encode(byteArray, 0, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 10) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 6);
        byte[] encodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        byte[] byteArray = {(byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 65L;
        byte[] buffer = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        context.buffer = buffer;
        context.pos = 1;
        context.eof = false;
        context.modulus = -41933091;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:514) */
        base32.encode(byteArray, 0, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 10) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 5);
        byte[] encodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        byte[] byteArray = {(byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 1L;
        byte[] buffer = new byte[13];
        context.buffer = buffer;
        context.pos = 8;
        context.eof = false;
        context.modulus = -823659821;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:514) */
        base32.encode(byteArray, 0, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 5) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_14() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 6);
        byte[] encodeTable = {(byte) -127, (byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        byte[] byteArray = {(byte) -127, (byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 4L;
        byte[] buffer = new byte[11];
        context.buffer = buffer;
        context.pos = 5;
        context.eof = false;
        context.modulus = -10115076;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:515) */
        base32.encode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 5) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_15() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 6);
        byte[] encodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        byte[] byteArray = {(byte) -127, (byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 2L;
        byte[] buffer = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        context.buffer = buffer;
        context.pos = 1;
        context.eof = false;
        context.modulus = -1074255286;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:515) */
        base32.encode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) context.lbitWorkArea & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_16() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 7);
        byte[] encodeTable = {(byte) -127, (byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        byte[] byteArray = {(byte) -127, (byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 4L;
        byte[] buffer = new byte[11];
        context.buffer = buffer;
        context.pos = 4;
        context.eof = false;
        context.modulus = -709757396;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:516) */
        base32.encode(byteArray, 1, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): True}
 * @utbot.executesCondition {@code (lineLength == 0): False}
 * @utbot.executesCondition {@code (lineLength > 0): True}
 * @utbot.executesCondition {@code (context.currentLinePos > 0): True}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(lineSeparator, 0, buffer, context.pos, lineSeparator.length);
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_18() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 1);
        byte[] lineSeparator = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "lineSeparator", lineSeparator);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "lineLength", 1);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {};
        context.buffer = buffer;
        context.pos = -1;
        context.eof = false;
        context.currentLinePos = 1;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.codec.binary.Base32.encode(Base32.java:496) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 19) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_19() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        byte[] encodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 8388608L;
        byte[] buffer = {};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 3;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:471) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 27) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_20() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        byte[] encodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 536870912L;
        byte[] buffer = {};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 4;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:481) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 3) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        byte[] encodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 128L;
        byte[] buffer = {};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 1;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:451) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 11) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_22() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        byte[] encodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 16384L;
        byte[] buffer = {};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 2;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:461) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 19) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_23() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", Integer.MIN_VALUE);
        byte[] encodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {};
        context.buffer = buffer;
        context.pos = Integer.MIN_VALUE;
        context.eof = false;
        context.modulus = 3;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 0]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:471) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 27) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_24() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", Integer.MIN_VALUE);
        byte[] encodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {};
        context.buffer = buffer;
        context.pos = Integer.MIN_VALUE;
        context.eof = false;
        context.modulus = 4;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 0]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:481) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 3) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_25() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", -8388607);
        byte[] encodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.buffer = encodeTable;
        context.pos = 8388608;
        context.eof = false;
        context.modulus = 1;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8388608 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:451) */
        base32.encode(null, 1, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 11) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_26() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", Integer.MIN_VALUE);
        byte[] encodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {};
        context.buffer = buffer;
        context.pos = Integer.MIN_VALUE;
        context.eof = false;
        context.modulus = 2;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 0]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:461) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 14) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_27() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 1);
        byte[] encodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 131072L;
        context.buffer = encodeTable;
        context.eof = false;
        context.modulus = 3;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:472) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea << 2) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_28() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 1);
        byte[] encodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 1L;
        context.buffer = encodeTable;
        context.eof = false;
        context.modulus = 1;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:452) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 22) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_29() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 1);
        byte[] encodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 67108864L;
        context.buffer = encodeTable;
        context.eof = false;
        context.modulus = 4;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:482) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 6) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_35() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 1);
        byte[] encodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 512L;
        context.buffer = encodeTable;
        context.eof = false;
        context.modulus = 2;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:462) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 17) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_38() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 2);
        byte[] encodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 2097152L;
        byte[] buffer = {(byte) -127, (byte) -127};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 4;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:483) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 9) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_39() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 2);
        byte[] encodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 1024L;
        byte[] buffer = {(byte) -127, (byte) -127};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 3;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:473) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 1) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowArrayIndexOutOfBoundsException_40() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 2);
        byte[] encodeTable = {(byte) 0};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 8L;
        byte[] buffer = {(byte) -127, (byte) -127};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 2;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:463) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: context.eof
 *  */
    @Test
    public void testEncode_ThrowNullPointerException() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:435) */
        base32.encode(null, -255, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int b = in[inPos++];
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_1() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", -256);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {(byte) 0};
        context.buffer = buffer;
        context.pos = 257;
        context.eof = false;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:503) */
        base32.encode(null, -255, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 19) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_5() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 3;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:471) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 27) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_6() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 4;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:481) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 3) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_7() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 1;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:451) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 11) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_8() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = 2;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:461) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer[context.pos++] = encodeTable[(int) (context.lbitWorkArea >> 35) & MASK_5BITS];
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_2() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", -256);
        byte[] byteArray = {(byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = -255L;
        byte[] buffer = {};
        context.buffer = buffer;
        context.pos = 256;
        context.eof = false;
        context.modulus = -608167416;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:509) */
        base32.encode(byteArray, 0, 1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): True}
 * @utbot.executesCondition {@code (lineLength == 0): False}
 * @utbot.executesCondition {@code (lineLength > 0): True}
 * @utbot.executesCondition {@code (context.currentLinePos > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(lineSeparator, 0, buffer, context.pos, lineSeparator.length);
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_4() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 73);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "lineLength", 1);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {};
        context.buffer = buffer;
        context.pos = -73;
        context.eof = false;
        context.currentLinePos = 1;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:496) */
        base32.encode(null, -255, -1, context);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < inAvail; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(lineSeparator, 0, buffer, context.pos, lineSeparator.length);
 *  */
    @Test
    public void testEncode_ThrowNullPointerException_3() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeSize", 9);
        byte[] encodeTable = {(byte) -127, (byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "encodeTable", encodeTable);
        setField(base32, "org.apache.commons.codec.binary.BaseNCodec", "lineLength", 1);
        byte[] byteArray = {(byte) -127, (byte) 0};
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.lbitWorkArea = 4L;
        byte[] buffer = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        context.buffer = buffer;
        context.eof = false;
        context.currentLinePos = -7;
        context.modulus = 1479605114;
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.encode] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base32.encode(Base32.java:519) */
        base32.encode(byteArray, 1, 1, context);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method encode([B, int, int, org.apache.commons.codec.binary.BaseNCodec$Context)
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#encode(byte[],int,int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.executesCondition {@code (context.eof): False}
 * @utbot.executesCondition {@code (inAvail < 0): True}
 * @utbot.executesCondition {@code (0 == context.modulus): False}
 * @utbot.invokes {@link org.apache.commons.codec.binary.Base32#ensureBufferSize(int,org.apache.commons.codec.binary.BaseNCodec.Context)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.activatesSwitch {@code switch(context.modulus) case: default}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: switch(context.modulus) case: default
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEncode_ThrowIllegalStateException() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] buffer = {};
        context.buffer = buffer;
        context.eof = false;
        context.modulus = -251;
        
        base32.encode(null, -255, -1, context);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.binary.Base32.isInAlphabet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isInAlphabet(byte)
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#isInAlphabet(byte)}
 * @utbot.returnsFrom {@code return octet >= 0 && octet < decodeTable.length && decodeTable[octet] != -1;}
 *  */
    @Test
    public void testIsInAlphabet_OctetLessThanZeroAndOctetLessThanDecodeTableLengthAndOctetOfDecodeTableEqualsNegative1() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        
        boolean actual = base32.isInAlphabet((byte) -1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#isInAlphabet(byte)}
 * @utbot.returnsFrom {@code return octet >= 0 && octet < decodeTable.length && decodeTable[octet] != -1;}
 *  */
    @Test
    public void testIsInAlphabet_OctetLessThanZeroAndOctetGreaterOrEqualDecodeTableLengthAndOctetOfDecodeTableEqualsNegative1() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        byte[] decodeTable = {(byte) -1};
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeTable", decodeTable);
        
        boolean actual = base32.isInAlphabet((byte) 0);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#isInAlphabet(byte)}
 * @utbot.returnsFrom {@code return octet >= 0 && octet < decodeTable.length && decodeTable[octet] != -1;}
 *  */
    @Test
    public void testIsInAlphabet_OctetGreaterOrEqualZeroAndOctetGreaterOrEqualDecodeTableLengthAndOctetOfDecodeTableEqualsNegative1() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        byte[] decodeTable = {};
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeTable", decodeTable);
        
        boolean actual = base32.isInAlphabet((byte) 0);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#isInAlphabet(byte)}
 * @utbot.returnsFrom {@code return octet >= 0 && octet < decodeTable.length && decodeTable[octet] != -1;}
 *  */
    @Test
    public void testIsInAlphabet_OctetGreaterOrEqualZeroAndOctetLessThanDecodeTableLengthAndOctetOfDecodeTableNotEqualsNegative1() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        byte[] decodeTable = {(byte) -127};
        setField(base32, "org.apache.commons.codec.binary.Base32", "decodeTable", decodeTable);
        
        boolean actual = base32.isInAlphabet((byte) 0);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isInAlphabet(byte)
    
    /**
    @utbot.classUnderTest {@link Base32}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.binary.Base32#isInAlphabet(byte)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return octet >= 0 && octet < decodeTable.length && decodeTable[octet] != -1;
 *  */
    @Test
    public void testIsInAlphabet_ThrowNullPointerException() throws Exception  {
        Base32 base32 = ((Base32) createInstance("org.apache.commons.codec.binary.Base32"));
        
        /* This test fails because method [org.apache.commons.codec.binary.Base32.isInAlphabet] produces [java.lang.NullPointerException]
            org.apache.commons.codec.binary.Base32.isInAlphabet(Base32.java:537) */
        base32.isInAlphabet((byte) 0);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields876765558524000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields876765558524000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass876765558535000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields876765558524000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass876765558535000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

