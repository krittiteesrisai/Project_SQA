package org.apache.commons.codec.net;

import org.junit.Test;
import org.apache.commons.codec.DecoderException;
import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.EncoderException;
import java.util.BitSet;
import sun.net.www.http.PosterOutputStream;
import java.lang.reflect.Method;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_codec_net_QuotedPrintableCodecTest {
    ///region Test suites for executable org.apache.commons.codec.net.QuotedPrintableCodec.decode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method decode(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decode(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (pString == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDecode_PStringEqualsNull() throws DecoderException, UnsupportedEncodingException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        
        String actual = quotedPrintableCodec.decode(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method decode(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decode(java.lang.String,java.lang.String)}
     */
    @Test(expected = UnsupportedEncodingException.class)
    public void testDecodeThrowsUEEWithNonEmptyStrings() throws DecoderException, UnsupportedEncodingException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec("abc");
        
        quotedPrintableCodec.decode("-3_", "10");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decode(java.lang.String,java.lang.String)}
     */
    @Test(expected = UnsupportedEncodingException.class)
    public void testDecodeThrowsUEEWithNonEmptyStrings1() throws DecoderException, UnsupportedEncodingException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec("abc");
        
        quotedPrintableCodec.decode("-3[_", "k10");
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method decode(java.lang.String, java.lang.String)
    
    @Test
    public void testDecode1() throws DecoderException, UnsupportedEncodingException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.net.QuotedPrintableCodec.decode] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.lang.String.lookupCharset(String.java:827)
            java.base/java.lang.String.<init>(String.java:487)
            java.base/java.lang.String.<init>(String.java:1365)
            org.apache.commons.codec.net.QuotedPrintableCodec.decode(QuotedPrintableCodec.java:324) */
        quotedPrintableCodec.decode(string, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.net.QuotedPrintableCodec.decode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method decode([B)
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decode(byte[])}
 * @utbot.returnsFrom {@code return decodeQuotedPrintable(bytes);}
 *  */
    @Test
    public void testDecode_ReturnDecodeQuotedPrintable_1() throws DecoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        byte[] byteArray = {};
        
        byte[] actual = quotedPrintableCodec.decode(byteArray);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decode(byte[])}
 * @utbot.returnsFrom {@code return decodeQuotedPrintable(bytes);}
 *  */
    @Test
    public void testDecode_ReturnDecodeQuotedPrintable_2() throws DecoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        byte[] byteArray = {(byte) -127};
        
        byte[] actual = quotedPrintableCodec.decode(byteArray);
        
        byte[] expected = {(byte) -127};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decode(byte[])}
 * @utbot.returnsFrom {@code return decodeQuotedPrintable(bytes);}
 *  */
    @Test
    public void testDecode_ReturnDecodeQuotedPrintable() throws DecoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        
        byte[] actual = quotedPrintableCodec.decode(((byte[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method decode([B)
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decode(byte[])}
 * @utbot.invokes {@link org.apache.commons.codec.net.QuotedPrintableCodec#decodeQuotedPrintable(byte[])}
 * @utbot.throwsException {@link org.apache.commons.codec.DecoderException} in: return decodeQuotedPrintable(bytes);
 *  */
    @Test(expected = DecoderException.class)
    public void testDecode_ThrowDecoderException() throws DecoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        byte[] byteArray = {(byte) 61};
        
        quotedPrintableCodec.decode(byteArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method decode([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decode(byte[])}
     */
    @Test
    public void testDecodeWithNonEmptyPrimitiveArray() throws DecoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec("abc");
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE};
        
        byte[] actual = quotedPrintableCodec.decode(byteArray);
        
        byte[] expected = {java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.net.QuotedPrintableCodec.decode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method decode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decode(java.lang.Object)}
 * @utbot.executesCondition {@code (pObject == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDecode_PObjectEqualsNull() throws DecoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        
        Object actual = quotedPrintableCodec.decode(((Object) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method decode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decode(java.lang.Object)}
 * @utbot.executesCondition {@code (pObject == null): False}
 * @utbot.executesCondition {@code (pObject instanceof byte[]): False}
 * @utbot.executesCondition {@code (pObject instanceof String): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link org.apache.commons.codec.DecoderException} in: pObject.getClass().getName()
 *  */
    @Test(expected = DecoderException.class)
    public void testDecode_ThrowDecoderException1() throws DecoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        byte[][] byteArray = {null};
        
        quotedPrintableCodec.decode(byteArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method decode(java.lang.Object)
    
    @Test
    public void testDecode2() throws DecoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        byte[] actual = ((byte[]) quotedPrintableCodec.decode(((Object) byteArray)));
        
        byte[] expected = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method decode(java.lang.Object)
    
    @Test
    public void testDecode3() throws DecoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec(null);
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.net.QuotedPrintableCodec.decode] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.lang.String.lookupCharset(String.java:827)
            java.base/java.lang.String.<init>(String.java:487)
            java.base/java.lang.String.<init>(String.java:1365)
            org.apache.commons.codec.net.QuotedPrintableCodec.decode(QuotedPrintableCodec.java:324)
            org.apache.commons.codec.net.QuotedPrintableCodec.decode(QuotedPrintableCodec.java:344)
            org.apache.commons.codec.net.QuotedPrintableCodec.decode(QuotedPrintableCodec.java:391) */
        quotedPrintableCodec.decode(((Object) string));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.net.QuotedPrintableCodec.decode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method decode(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decode(java.lang.String)}
 * @utbot.executesCondition {@code (pString == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDecode_PStringEqualsNull1() throws DecoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        
        String actual = quotedPrintableCodec.decode(((String) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method decode(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decode(java.lang.String)}
     */
    @Test
    public void testDecodeWithNonEmptyString() throws DecoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        
        String actual = quotedPrintableCodec.decode("\u009Dabc");
        
        String expected = "?abc";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method decode(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decode(java.lang.String)}
     */
    @Test(expected = DecoderException.class)
    public void testDecodeThrowsDEWithNonEmptyString() throws DecoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec("abc");
        
        quotedPrintableCodec.decode("-\uFFF43");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decode(java.lang.String)}
     */
    @Test(expected = DecoderException.class)
    public void testDecodeThrowsDEWithNonEmptyString1() throws DecoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec("XZ");
        
        quotedPrintableCodec.decode("1");
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method decode(java.lang.String)
    
    @Test
    public void testDecode4() throws DecoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec(null);
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.net.QuotedPrintableCodec.decode] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.lang.String.lookupCharset(String.java:827)
            java.base/java.lang.String.<init>(String.java:487)
            java.base/java.lang.String.<init>(String.java:1365)
            org.apache.commons.codec.net.QuotedPrintableCodec.decode(QuotedPrintableCodec.java:324)
            org.apache.commons.codec.net.QuotedPrintableCodec.decode(QuotedPrintableCodec.java:344) */
        quotedPrintableCodec.decode(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.net.QuotedPrintableCodec.encode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encode(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encode(java.lang.String)}
 * @utbot.executesCondition {@code (pString == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testEncode_PStringEqualsNull() throws EncoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        
        String actual = quotedPrintableCodec.encode(((String) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method encode(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encode(java.lang.String)}
 * @utbot.executesCondition {@code (pString == null): False}
 * @utbot.invokes {@link org.apache.commons.codec.net.QuotedPrintableCodec#getDefaultCharset()}
 * @utbot.invokes {@link org.apache.commons.codec.net.QuotedPrintableCodec#encode(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return encode(pString, getDefaultCharset());
 *  */
    @Test
    public void testEncode_ThrowNullPointerException() throws EncoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec(null);
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.net.QuotedPrintableCodec.encode] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getBytes(String.java:1766)
            org.apache.commons.codec.net.QuotedPrintableCodec.encode(QuotedPrintableCodec.java:429)
            org.apache.commons.codec.net.QuotedPrintableCodec.encode(QuotedPrintableCodec.java:300) */
        quotedPrintableCodec.encode(string);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method encode(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encode(java.lang.String)}
     */
    @Test
    public void testEncodeWithNonEmptyString() throws EncoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        
        String actual = quotedPrintableCodec.encode("\u009Dabc");
        
        String expected = "=C2=9Dabc";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encode(java.lang.String)}
     */
    @Test
    public void testEncodeWithNonEmptyString1() throws EncoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        
        String actual = quotedPrintableCodec.encode("b\u009D\u0091Dca");
        
        String expected = "b=C2=9D=C2=91Dca";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method encode(java.lang.String)
    
    @Test(expected = EncoderException.class)
    public void testEncode1() throws EncoderException  {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec(string);
        String string1 = "";
        
        quotedPrintableCodec.encode(string1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.net.QuotedPrintableCodec.encode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encode(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encode(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (pString == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testEncode_PStringEqualsNull1() throws UnsupportedEncodingException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        
        String actual = quotedPrintableCodec.encode(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method encode(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encode(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (pString == null): False}
 * @utbot.invokes {@link java.lang.String#getBytes(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return StringUtils.newStringUsAscii(encode(pString.getBytes(charset)));
 *  */
    @Test
    public void testEncode_ThrowNullPointerException1() throws UnsupportedEncodingException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.net.QuotedPrintableCodec.encode] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getBytes(String.java:1766)
            org.apache.commons.codec.net.QuotedPrintableCodec.encode(QuotedPrintableCodec.java:429) */
        quotedPrintableCodec.encode(string, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method encode(java.lang.String, java.lang.String)
    
    @Test(expected = UnsupportedEncodingException.class)
    public void testEncode2() throws UnsupportedEncodingException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        String string = "   ";
        
        quotedPrintableCodec.encode(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.net.QuotedPrintableCodec.encode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encode(java.lang.Object)}
 * @utbot.executesCondition {@code (pObject == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testEncode_PObjectEqualsNull() throws EncoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        
        Object actual = quotedPrintableCodec.encode(((Object) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method encode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encode(java.lang.Object)}
 * @utbot.executesCondition {@code (pObject == null): False}
 * @utbot.executesCondition {@code (pObject instanceof byte[]): False}
 * @utbot.executesCondition {@code (pObject instanceof String): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link org.apache.commons.codec.EncoderException} in: pObject.getClass().getName()
 *  */
    @Test(expected = EncoderException.class)
    public void testEncode_ThrowEncoderException() throws EncoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        byte[][] byteArray = {null};
        
        quotedPrintableCodec.encode(byteArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encode(java.lang.Object)
    
    @Test
    public void testEncode3() throws EncoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        byte[] actual = ((byte[]) quotedPrintableCodec.encode(((Object) byteArray)));
        
        byte[] expected = new byte[27];
        expected[0] = (byte) 61;
        expected[1] = (byte) 48;
        expected[2] = (byte) 48;
        expected[3] = (byte) 61;
        expected[4] = (byte) 48;
        expected[5] = (byte) 48;
        expected[6] = (byte) 61;
        expected[7] = (byte) 48;
        expected[8] = (byte) 48;
        expected[9] = (byte) 61;
        expected[10] = (byte) 48;
        expected[11] = (byte) 48;
        expected[12] = (byte) 61;
        expected[13] = (byte) 48;
        expected[14] = (byte) 48;
        expected[15] = (byte) 61;
        expected[16] = (byte) 48;
        expected[17] = (byte) 48;
        expected[18] = (byte) 61;
        expected[19] = (byte) 48;
        expected[20] = (byte) 48;
        expected[21] = (byte) 61;
        expected[22] = (byte) 48;
        expected[23] = (byte) 48;
        expected[24] = (byte) 61;
        expected[25] = (byte) 48;
        expected[26] = (byte) 48;
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method encode(java.lang.Object)
    
    @Test(expected = EncoderException.class)
    public void testEncode4() throws EncoderException  {
        String string = "   ";
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec(string);
        String string1 = "";
        
        quotedPrintableCodec.encode(((Object) string1));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method encode(java.lang.Object)
    
    @Test
    public void testEncode5() throws EncoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec(null);
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.net.QuotedPrintableCodec.encode] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getBytes(String.java:1766)
            org.apache.commons.codec.net.QuotedPrintableCodec.encode(QuotedPrintableCodec.java:429)
            org.apache.commons.codec.net.QuotedPrintableCodec.encode(QuotedPrintableCodec.java:300)
            org.apache.commons.codec.net.QuotedPrintableCodec.encode(QuotedPrintableCodec.java:366) */
        quotedPrintableCodec.encode(((Object) string));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.net.QuotedPrintableCodec.encode
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method encode([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encode(byte[])}
     */
    @Test
    public void testEncodeWithNonEmptyPrimitiveArray() {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        byte[] byteArray = {(byte) -1, (byte) 126, (byte) 0};
        
        byte[] actual = quotedPrintableCodec.encode(byteArray);
        
        byte[] expected = {(byte) 61, (byte) 70, (byte) 70, (byte) 126, (byte) 61, (byte) 48, (byte) 48};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encode(byte[])}
     */
    @Test
    public void testEncodeWithNonEmptyPrimitiveArray1() {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        byte[] byteArray = {(byte) 0, java.lang.Byte.MAX_VALUE, (byte) -1};
        
        byte[] actual = quotedPrintableCodec.encode(byteArray);
        
        byte[] expected = {
            (byte) 61, (byte) 48, (byte) 48, (byte) 61, (byte) 55, (byte) 70, (byte) 61, (byte) 70,
            (byte) 70
        };
        
        assertArrayEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encode(byte[])}
     */
    @Test
    public void testEncodeWithNonEmptyPrimitiveArray2() {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        byte[] byteArray = {(byte) 126, (byte) -1, (byte) 0};
        
        byte[] actual = quotedPrintableCodec.encode(byteArray);
        
        byte[] expected = {(byte) 126, (byte) 61, (byte) 70, (byte) 70, (byte) 61, (byte) 48, (byte) 48};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encode([B)
    
    @Test
    public void testEncode6() {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec();
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        byte[] actual = quotedPrintableCodec.encode(byteArray);
        
        byte[] expected = new byte[27];
        expected[0] = (byte) 61;
        expected[1] = (byte) 48;
        expected[2] = (byte) 48;
        expected[3] = (byte) 61;
        expected[4] = (byte) 48;
        expected[5] = (byte) 48;
        expected[6] = (byte) 61;
        expected[7] = (byte) 48;
        expected[8] = (byte) 48;
        expected[9] = (byte) 61;
        expected[10] = (byte) 48;
        expected[11] = (byte) 48;
        expected[12] = (byte) 61;
        expected[13] = (byte) 48;
        expected[14] = (byte) 48;
        expected[15] = (byte) 61;
        expected[16] = (byte) 48;
        expected[17] = (byte) 48;
        expected[18] = (byte) 61;
        expected[19] = (byte) 48;
        expected[20] = (byte) 48;
        expected[21] = (byte) 61;
        expected[22] = (byte) 48;
        expected[23] = (byte) 48;
        expected[24] = (byte) 61;
        expected[25] = (byte) 48;
        expected[26] = (byte) 48;
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.net.QuotedPrintableCodec.getDefaultCharset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDefaultCharset()
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#getDefaultCharset()}
 * @utbot.returnsFrom {@code return this.charset;}
 *  */
    @Test
    public void testGetDefaultCharset_ReturnThisCharset() {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec(null);
        
        String actual = quotedPrintableCodec.getDefaultCharset();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method decodeQuotedPrintable([B)
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decodeQuotedPrintable(byte[])}
 * @utbot.executesCondition {@code (bytes == null): False}
 * @utbot.returnsFrom {@code return buffer.toByteArray();}
 *  */
    @Test
    public void testDecodeQuotedPrintable_BytesNotEqualsNull() throws DecoderException  {
        byte[] byteArray = {};
        
        byte[] actual = QuotedPrintableCodec.decodeQuotedPrintable(byteArray);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decodeQuotedPrintable(byte[])}
 * @utbot.executesCondition {@code (bytes == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < bytes.length; i++)} once
 * @utbot.returnsFrom {@code return buffer.toByteArray();}
 *  */
    @Test
    public void testDecodeQuotedPrintable_BNotEqualsESCAPE_CHAR() throws DecoderException  {
        byte[] byteArray = {(byte) -127};
        
        byte[] actual = QuotedPrintableCodec.decodeQuotedPrintable(byteArray);
        
        byte[] expected = {(byte) -127};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decodeQuotedPrintable(byte[])}
 * @utbot.executesCondition {@code (bytes == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDecodeQuotedPrintable_BytesEqualsNull() throws DecoderException  {
        byte[] actual = QuotedPrintableCodec.decodeQuotedPrintable(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method decodeQuotedPrintable([B)
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decodeQuotedPrintable(byte[])}
 * @utbot.executesCondition {@code (bytes == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < bytes.length; i++)} once
 * @utbot.throwsException {@link org.apache.commons.codec.DecoderException} in: int u = Utils.digit16(bytes[++i]);
 *  */
    @Test(expected = DecoderException.class)
    public void testDecodeQuotedPrintable_ThrowDecoderException() throws DecoderException  {
        byte[] byteArray = {(byte) 61};
        
        QuotedPrintableCodec.decodeQuotedPrintable(byteArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method decodeQuotedPrintable([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decodeQuotedPrintable(byte[])}
     */
    @Test
    public void testDecodeQuotedPrintableWithNonEmptyPrimitiveArray() throws DecoderException  {
        byte[] byteArray = {(byte) 0, (byte) -1};
        
        byte[] actual = QuotedPrintableCodec.decodeQuotedPrintable(byteArray);
        
        byte[] expected = {(byte) 0, (byte) -1};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method decodeQuotedPrintable([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decodeQuotedPrintable(byte[])}
     */
    @Test(expected = DecoderException.class)
    public void testDecodeQuotedPrintableThrowsDEWithNonEmptyPrimitiveArray() throws DecoderException  {
        byte[] byteArray = {(byte) 61, (byte) -1, (byte) 4};
        
        QuotedPrintableCodec.decodeQuotedPrintable(byteArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decodeQuotedPrintable(byte[])}
     */
    @Test(expected = DecoderException.class)
    public void testDecodeQuotedPrintableThrowsDEWithNonEmptyPrimitiveArray1() throws DecoderException  {
        byte[] byteArray = {(byte) 4, (byte) 61, (byte) -1};
        
        QuotedPrintableCodec.decodeQuotedPrintable(byteArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#decodeQuotedPrintable(byte[])}
     */
    @Test(expected = DecoderException.class)
    public void testDecodeQuotedPrintableThrowsDEWithNonEmptyPrimitiveArray2() throws DecoderException  {
        byte[] byteArray = {(byte) 4, (byte) -1, (byte) 61};
        
        QuotedPrintableCodec.decodeQuotedPrintable(byteArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encodeQuotedPrintable(java.util.BitSet, [B)
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encodeQuotedPrintable(java.util.BitSet,byte[])}
 * @utbot.executesCondition {@code (bytes == null): False}
 * @utbot.executesCondition {@code (printable == null): False}
 * @utbot.invokes {@link java.io.ByteArrayOutputStream#toByteArray()}
 * @utbot.returnsFrom {@code return buffer.toByteArray();}
 *  */
    @Test
    public void testEncodeQuotedPrintable_PrintableNotEqualsNull() {
        BitSet bitSet = new BitSet();
        byte[] byteArray = {};
        
        byte[] actual = QuotedPrintableCodec.encodeQuotedPrintable(bitSet, byteArray);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encodeQuotedPrintable(java.util.BitSet,byte[])}
 * @utbot.executesCondition {@code (bytes == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testEncodeQuotedPrintable_BytesEqualsNull() {
        byte[] actual = QuotedPrintableCodec.encodeQuotedPrintable(((BitSet) null), ((byte[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method encodeQuotedPrintable(java.util.BitSet, [B)
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encodeQuotedPrintable(java.util.BitSet,byte[])}
 * @utbot.iterates iterate the loop {@code for(byte c: bytes)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: printable.get(b)
 *  */
    @Test
    public void testEncodeQuotedPrintable_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-255L, -255L};
        setField(bitSet, "java.util.BitSet", "words", words);
        setField(bitSet, "java.util.BitSet", "wordsInUse", 4);
        byte[] byteArray = {(byte) -64};
        
        /* This test fails because method [org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2]
            java.base/java.util.BitSet.get(BitSet.java:631)
            org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(QuotedPrintableCodec.java:183) */
        QuotedPrintableCodec.encodeQuotedPrintable(bitSet, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encodeQuotedPrintable(java.util.BitSet,byte[])}
 * @utbot.iterates iterate the loop {@code for(byte c: bytes)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: printable.get(b)
 *  */
    @Test
    public void testEncodeQuotedPrintable_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {};
        setField(bitSet, "java.util.BitSet", "words", words);
        setField(bitSet, "java.util.BitSet", "wordsInUse", 1);
        byte[] byteArray = {(byte) 0};
        
        /* This test fails because method [org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.BitSet.get(BitSet.java:631)
            org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(QuotedPrintableCodec.java:183) */
        QuotedPrintableCodec.encodeQuotedPrintable(bitSet, byteArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encodeQuotedPrintable(java.util.BitSet, [B)
    
    @Test
    public void testEncodeQuotedPrintable1() throws Exception  {
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {
            1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
            1L
        };
        setField(bitSet, "java.util.BitSet", "words", words);
        setField(bitSet, "java.util.BitSet", "wordsInUse", 3);
        byte[] byteArray = {
            (byte) 0, (byte) -64, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        
        byte[] actual = QuotedPrintableCodec.encodeQuotedPrintable(bitSet, byteArray);
        
        byte[] expected = new byte[12];
        expected[1] = (byte) 61;
        expected[2] = (byte) 67;
        expected[3] = (byte) 48;
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testEncodeQuotedPrintable2() {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        byte[] actual = QuotedPrintableCodec.encodeQuotedPrintable(((BitSet) null), byteArray);
        
        byte[] expected = new byte[27];
        expected[0] = (byte) 61;
        expected[1] = (byte) 48;
        expected[2] = (byte) 48;
        expected[3] = (byte) 61;
        expected[4] = (byte) 48;
        expected[5] = (byte) 48;
        expected[6] = (byte) 61;
        expected[7] = (byte) 48;
        expected[8] = (byte) 48;
        expected[9] = (byte) 61;
        expected[10] = (byte) 48;
        expected[11] = (byte) 48;
        expected[12] = (byte) 61;
        expected[13] = (byte) 48;
        expected[14] = (byte) 48;
        expected[15] = (byte) 61;
        expected[16] = (byte) 48;
        expected[17] = (byte) 48;
        expected[18] = (byte) 61;
        expected[19] = (byte) 48;
        expected[20] = (byte) 48;
        expected[21] = (byte) 61;
        expected[22] = (byte) 48;
        expected[23] = (byte) 48;
        expected[24] = (byte) 61;
        expected[25] = (byte) 48;
        expected[26] = (byte) 48;
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testEncodeQuotedPrintable3() throws Exception  {
        BitSet bitSet = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = new long[11];
        words[0] = 1L;
        words[1] = 1L;
        words[2] = 1L;
        words[3] = 1L;
        words[4] = 1L;
        words[5] = 1L;
        words[6] = 1L;
        words[7] = 1L;
        words[8] = 1L;
        words[9] = 1L;
        words[10] = 1L;
        setField(bitSet, "java.util.BitSet", "words", words);
        setField(bitSet, "java.util.BitSet", "wordsInUse", 3);
        byte[] byteArray = {
            java.lang.Byte.MIN_VALUE, (byte) -64, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        
        byte[] actual = QuotedPrintableCodec.encodeQuotedPrintable(bitSet, byteArray);
        
        byte[] expected = new byte[12];
        expected[0] = java.lang.Byte.MIN_VALUE;
        expected[1] = (byte) 61;
        expected[2] = (byte) 67;
        expected[3] = (byte) 48;
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encodeQuotedPrintable(int, java.io.ByteArrayOutputStream)
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encodeQuotedPrintable(int,java.io.ByteArrayOutputStream)}
 *  */
    @Test
    public void testEncodeQuotedPrintable_1() throws Exception  {
        PosterOutputStream posterOutputStream = ((PosterOutputStream) createInstance("sun.net.www.http.PosterOutputStream"));
        setField(posterOutputStream, "sun.net.www.http.PosterOutputStream", "closed", true);
        
        Class quotedPrintableCodecClazz = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class intType = int.class;
        Class posterOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
        Method encodeQuotedPrintableMethod = quotedPrintableCodecClazz.getDeclaredMethod("encodeQuotedPrintable", intType, posterOutputStreamType);
        encodeQuotedPrintableMethod.setAccessible(true);
        java.lang.Object[] encodeQuotedPrintableMethodArguments = new java.lang.Object[2];
        encodeQuotedPrintableMethodArguments[0] = 153;
        encodeQuotedPrintableMethodArguments[1] = posterOutputStream;
        encodeQuotedPrintableMethod.invoke(null, encodeQuotedPrintableMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encodeQuotedPrintable(int,java.io.ByteArrayOutputStream)}
 *  */
    @Test
    public void testEncodeQuotedPrintable() throws Exception  {
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[19];
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "count", 34);
        
        byte[] initialByteArrayOutputStreamBuf = ((byte[]) getFieldValue(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf"));
        
        Class quotedPrintableCodecClazz = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class intType = int.class;
        Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
        Method encodeQuotedPrintableMethod = quotedPrintableCodecClazz.getDeclaredMethod("encodeQuotedPrintable", intType, byteArrayOutputStreamType);
        encodeQuotedPrintableMethod.setAccessible(true);
        java.lang.Object[] encodeQuotedPrintableMethodArguments = new java.lang.Object[2];
        encodeQuotedPrintableMethodArguments[0] = 169;
        encodeQuotedPrintableMethodArguments[1] = byteArrayOutputStream;
        encodeQuotedPrintableMethod.invoke(null, encodeQuotedPrintableMethodArguments);
        
        byte[] finalByteArrayOutputStreamBuf = ((byte[]) getFieldValue(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf"));
        int finalByteArrayOutputStreamCount = ((Integer) getFieldValue(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "count"));
        
        assertFalse(initialByteArrayOutputStreamBuf == finalByteArrayOutputStreamBuf);
        
        assertEquals(37, finalByteArrayOutputStreamCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method encodeQuotedPrintable(int, java.io.ByteArrayOutputStream)
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encodeQuotedPrintable(int,java.io.ByteArrayOutputStream)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer.write(ESCAPE_CHAR);
 *  */
    @Test
    public void testEncodeQuotedPrintable_ThrowArrayIndexOutOfBoundsException1() throws Throwable  {
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "count", -1);
        
        /* This test fails because method [org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:112)
            org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(QuotedPrintableCodec.java:115) */
        Class quotedPrintableCodecClazz = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class intType = int.class;
        Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
        Method encodeQuotedPrintableMethod = quotedPrintableCodecClazz.getDeclaredMethod("encodeQuotedPrintable", intType, byteArrayOutputStreamType);
        encodeQuotedPrintableMethod.setAccessible(true);
        java.lang.Object[] encodeQuotedPrintableMethodArguments = new java.lang.Object[2];
        encodeQuotedPrintableMethodArguments[0] = 1;
        encodeQuotedPrintableMethodArguments[1] = byteArrayOutputStream;
        try {
            encodeQuotedPrintableMethod.invoke(null, encodeQuotedPrintableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encodeQuotedPrintable(int,java.io.ByteArrayOutputStream)}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testEncodeQuotedPrintable_ThrowOutOfMemoryError() throws Throwable  {
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "count", Integer.MIN_VALUE);
        
        Class quotedPrintableCodecClazz = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class intType = int.class;
        Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
        Method encodeQuotedPrintableMethod = quotedPrintableCodecClazz.getDeclaredMethod("encodeQuotedPrintable", intType, byteArrayOutputStreamType);
        encodeQuotedPrintableMethod.setAccessible(true);
        java.lang.Object[] encodeQuotedPrintableMethodArguments = new java.lang.Object[2];
        encodeQuotedPrintableMethodArguments[0] = 1;
        encodeQuotedPrintableMethodArguments[1] = byteArrayOutputStream;
        try {
            encodeQuotedPrintableMethod.invoke(null, encodeQuotedPrintableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encodeQuotedPrintable(int,java.io.ByteArrayOutputStream)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: buffer.write(ESCAPE_CHAR);
 *  */
    @Test
    public void testEncodeQuotedPrintable_ThrowIndexOutOfBoundsException() throws Throwable  {
        PosterOutputStream posterOutputStream = ((PosterOutputStream) createInstance("sun.net.www.http.PosterOutputStream"));
        byte[] buf = {};
        setField(posterOutputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(posterOutputStream, "java.io.ByteArrayOutputStream", "count", -1);
        
        /* This test fails because method [org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        Class quotedPrintableCodecClazz = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class intType = int.class;
        Class posterOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
        Method encodeQuotedPrintableMethod = quotedPrintableCodecClazz.getDeclaredMethod("encodeQuotedPrintable", intType, posterOutputStreamType);
        encodeQuotedPrintableMethod.setAccessible(true);
        java.lang.Object[] encodeQuotedPrintableMethodArguments = new java.lang.Object[2];
        encodeQuotedPrintableMethodArguments[0] = 1;
        encodeQuotedPrintableMethodArguments[1] = posterOutputStream;
        try {
            encodeQuotedPrintableMethod.invoke(null, encodeQuotedPrintableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link QuotedPrintableCodec}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.net.QuotedPrintableCodec#encodeQuotedPrintable(int,java.io.ByteArrayOutputStream)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.write(ESCAPE_CHAR);
 *  */
    @Test
    public void testEncodeQuotedPrintable_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable] produces [java.lang.NullPointerException]
            org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(QuotedPrintableCodec.java:115) */
        Class quotedPrintableCodecClazz = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class intType = int.class;
        Class byteArrayOutputStreamType = Class.forName("java.io.ByteArrayOutputStream");
        Method encodeQuotedPrintableMethod = quotedPrintableCodecClazz.getDeclaredMethod("encodeQuotedPrintable", intType, byteArrayOutputStreamType);
        encodeQuotedPrintableMethod.setAccessible(true);
        java.lang.Object[] encodeQuotedPrintableMethodArguments = new java.lang.Object[2];
        encodeQuotedPrintableMethodArguments[0] = 1;
        encodeQuotedPrintableMethodArguments[1] = ((Object) null);
        try {
            encodeQuotedPrintableMethod.invoke(null, encodeQuotedPrintableMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields876164734166000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields876164734166000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass876164734171900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields876164734166000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass876164734171900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields876164734742800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields876164734742800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass876164734746400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields876164734742800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass876164734746400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

