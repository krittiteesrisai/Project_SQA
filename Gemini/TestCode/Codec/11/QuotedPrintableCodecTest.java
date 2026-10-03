package org.apache.commons.codec.net;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.UnsupportedEncodingException;
import java.util.BitSet;

import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Test;

public class QuotedPrintableCodecTest {

    @Test
    public void testDefaultConstructor() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertEquals(CharEncoding.UTF_8, codec.getDefaultCharset());
    }

    @Test
    public void testCustomCharsetConstructor() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(CharEncoding.ISO_8859_1);
        assertEquals(CharEncoding.ISO_8859_1, codec.getDefaultCharset());
    }

    @Test
    public void testEncodeByteArrayNull() {
        assertNull(QuotedPrintableCodec.encodeQuotedPrintable(null, null));
    }

    @Test
    public void testEncodeByteArrayCustomBitSetNull() {
        byte[] input = "abc".getBytes();
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(null, input);
        assertArrayEquals(input, result);
    }

    @Test
    public void testEncodeByteArrayNegativeBytes() {
        // ทดสอบค่าติดลบเพื่อให้เช็ค Branch b < 0 (b = 256 + b)
        byte[] input = new byte[] { -1, -50 };
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(null, input);
        // -1 (0xFF) และ -50 (0xCE) ควรถูกแปลงเป็น =FF และ =CE
        assertEquals("=FF=CE", new String(result));
    }

    @Test
    public void testEncodeAndDecodeByteArray() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] plain = "The quick brown fox jumps over the lazy dog 0123456789!?=".getBytes();
        byte[] encoded = codec.encode(plain);
        byte[] decoded = codec.decode(encoded);
        assertArrayEquals(plain, decoded);
    }

    @Test
    public void testDecodeByteArrayNull() throws DecoderException {
        assertNull(QuotedPrintableCodec.decodeQuotedPrintable(null));
    }

    @Test
    public void testDecodeValidEscape() throws DecoderException {
        byte[] input = "=3D".getBytes(); // =3D คือเครื่องหมาย =
        byte[] expected = "=".getBytes();
        assertArrayEquals(expected, QuotedPrintableCodec.decodeQuotedPrintable(input));
    }

    @Test(expected = DecoderException.class)
    public void testDecodeIncompleteEscapeException1() throws DecoderException {
        // ข้อมูลไม่พอหลัง '=' (เหลือแค่ตัวเดียว)
        byte[] input = "=3".getBytes();
        QuotedPrintableCodec.decodeQuotedPrintable(input);
    }

    @Test(expected = DecoderException.class)
    public void testDecodeIncompleteEscapeException2() throws DecoderException {
        // ข้อมูลไม่พอหลัง '=' (หมดอาเรย์เลย)
        byte[] input = "=".getBytes();
        QuotedPrintableCodec.decodeQuotedPrintable(input);
    }

    @Test
    public void testEncodeStringNull() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.encode((String) null));
    }

    @Test
    public void testEncodeStringValid() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String original = "Hello World!";
        String encoded = codec.encode(original);
        assertEquals("Hello World!", encoded);
    }

    @Test
    public void testEncodeStringWithCharset() throws UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String original = "Test String";
        String encoded = codec.encode(original, CharEncoding.UTF_8);
        assertEquals("Test String", encoded);
    }

    @Test
    public void testDecodeStringNull() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.decode((String) null));
    }

    @Test
    public void testDecodeStringValid() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String encoded = "Hello=3DWorld";
        String decoded = codec.decode(encoded);
        assertEquals("Hello=World", decoded);
    }

    @Test
    public void testDecodeStringWithCharset() throws DecoderException, UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String encoded = "Hello=3DWorld";
        String decoded = codec.decode(encoded, CharEncoding.UTF_8);
        assertEquals("Hello=World", decoded);
    }

    @Test
    public void testEncodeObjectNull() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.encode(null));
    }

    @Test
    public void testEncodeObjectByteArray() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "ABC".getBytes();
        byte[] result = (byte[]) codec.encode((Object) input);
        assertArrayEquals(input, result);
    }

    @Test
    public void testEncodeObjectString() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = (String) codec.encode((Object) "ABC");
        assertEquals("ABC", result);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectInvalidType() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        codec.encode(Integer.valueOf(123));
    }

    @Test
    public void testDecodeObjectNull() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.decode(null));
    }

    @Test
    public void testDecodeObjectByteArray() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "ABC".getBytes();
        byte[] result = (byte[]) codec.decode((Object) input);
        assertArrayEquals(input, result);
    }

    @Test
    public void testDecodeObjectString() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = (String) codec.decode((Object) "ABC");
        assertEquals("ABC", result);
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObjectInvalidType() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        codec.decode(Integer.valueOf(123));
    }
}