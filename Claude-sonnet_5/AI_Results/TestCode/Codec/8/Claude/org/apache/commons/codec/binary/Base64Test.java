package org.apache.commons.codec.binary;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Test;

public class Base64Test {

    // ================= Constructors =================

    @Test
    public void testDefaultConstructor_NoChunking() {
        Base64 b64 = new Base64();
        assertFalse(b64.isUrlSafe());
        byte[] encoded = b64.encode("Hello World".getBytes());
        assertFalse(new String(encoded).contains("\r\n")); // lineLength=0 -> no separator
    }

    @Test
    public void testUrlSafeConstructor_True() {
        Base64 b64 = new Base64(true);
        assertTrue(b64.isUrlSafe());
    }

    @Test
    public void testUrlSafeConstructor_False() {
        Base64 b64 = new Base64(false);
        assertFalse(b64.isUrlSafe());
    }

    @Test
    public void testLineLengthConstructor_Positive_TriggersWrap() {
        Base64 b64 = new Base64(64);
        byte[] data = new byte[100];
        for (int i = 0; i < data.length; i++) data[i] = (byte) i;
        String s = new String(b64.encode(data));
        assertTrue(s.contains("\r\n"));
    }

    @Test
    public void testLineLengthConstructor_RoundedDownToMultipleOf4() {
        // lineLength=10 -> rounds to (10/4)*4=8, ต้องไม่ throw และทำงานได้ปกติ
        Base64 b64 = new Base64(10);
        byte[] encoded = b64.encode(new byte[20]);
        assertNotNull(encoded);
    }

    @Test
    public void testLineLengthConstructor_ZeroAndNegative_NoChunk() {
        byte[] data = "abc".getBytes();
        assertFalse(new String(new Base64(0).encode(data)).contains("\r\n"));
        assertFalse(new String(new Base64(-5).encode(data)).contains("\r\n"));
    }

    @Test
    public void testTwoArgConstructor_CustomSeparator() {
        Base64 b64 = new Base64(8, new byte[]{'\n'});
        assertFalse(b64.isUrlSafe());
        String s = new String(b64.encode(new byte[20]));
        assertTrue(s.contains("\n"));
    }

    @Test
    public void testLineSeparatorNull_DisablesChunking() {
        Base64 b64 = new Base64(76, null);
        String s = new String(b64.encode(new byte[100]));
        assertFalse(s.contains("\r\n"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLineSeparatorContainsBase64Char_Throws() {
        new Base64(76, new byte[]{'A'}); // 'A' คือ base64 char -> ต้อง throw
    }

    @Test
    public void testFullConstructor_UrlSafeTrue() {
        Base64 b64 = new Base64(76, Base64.CHUNK_SEPARATOR, true);
        assertTrue(b64.isUrlSafe());
    }

    // ================= isBase64 =================

    @Test
    public void testIsBase64_PadByte() {
        assertTrue(Base64.isBase64((byte) '='));
    }

    @Test
    public void testIsBase64_ValidChars() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) '+'));
        assertTrue(Base64.isBase64((byte) '/'));
    }

    @Test
    public void testIsBase64_NegativeByte_False() {
        assertFalse(Base64.isBase64((byte) -5));
    }

    @Test
    public void testIsBase64_OutOfDecodeTableRange_False() {
        // DECODE_TABLE.length == 123 (นับจากซอร์ส) ดังนั้น byte 127 (>=123) ต้อง false
        assertFalse(Base64.isBase64((byte) 127));
    }

    @Test
    public void testIsBase64_ValidRangeButInvalidChar_False() {
        assertFalse(Base64.isBase64((byte) ' ')); // DECODE_TABLE[32] == -1
    }

    // ================= isArrayByteBase64 =================

    @Test
    public void testIsArrayByteBase64_EmptyArray_True() {
        assertTrue(Base64.isArrayByteBase64(new byte[0]));
    }

    @Test
    public void testIsArrayByteBase64_AllValid_True() {
        assertTrue(Base64.isArrayByteBase64("SGVsbG8=".getBytes()));
    }

    @Test
    public void testIsArrayByteBase64_WithWhitespace_True() {
        assertTrue(Base64.isArrayByteBase64("SGVs bG8=\r\n\t".getBytes()));
    }

    @Test
    public void testIsArrayByteBase64_InvalidChar_False() {
        assertFalse(Base64.isArrayByteBase64("SGVsbG8!".getBytes()));
    }

    // ================= static encode/decode =================

    @Test
    public void testEncodeDecodeRoundTrip_Standard() {
        byte[] data = "The quick brown fox".getBytes();
        byte[] encoded = Base64.encodeBase64(data);
        assertArrayEquals(data, Base64.decodeBase64(encoded));
    }

    @Test
    public void testEncodeBase64_NullAndEmpty() {
        assertNull(Base64.encodeBase64(null));
        assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));
    }

    @Test
    public void testDecodeBase64_NullAndEmpty_ByteArray() {
        assertNull(Base64.decodeBase64((byte[]) null));
        assertArrayEquals(new byte[0], Base64.decodeBase64(new byte[0]));
    }

    @Test
    public void testEncodeBase64Chunked() {
        String s = new String(Base64.encodeBase64Chunked(new byte[100]));
        assertTrue(s.contains("\r\n"));
    }

    @Test
    public void testEncodeBase64StringVariants() {
        byte[] data = {-1, -2, -3, 62, 63};
        assertNotNull(Base64.encodeBase64String(data));
        assertNotNull(Base64.encodeBase64URLSafeString(data));
        assertNotNull(Base64.encodeBase64URLSafe(data));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64_MaxResultSizeExceeded_Throws() {
        Base64.encodeBase64(new byte[1000], false, false, 10);
    }

    // ================= encode/decode table difference (STANDARD vs URL_SAFE) =================

    @Test
    public void testEncodeCharacter63_StandardVsUrlSafe() {
        byte[] data = {(byte) 0xFF}; // top 6 bits = 111111 = 63
        assertEquals('/', (char) new Base64().encode(data)[0]);
        assertEquals('_', (char) new Base64(true).encode(data)[0]);
    }

    @Test
    public void testEncodeCharacter62_StandardVsUrlSafe() {
        byte[] data = {(byte) 0xF8}; // top 6 bits = 111110 = 62
        assertEquals('+', (char) new Base64().encode(data)[0]);
        assertEquals('-', (char) new Base64(true).encode(data)[0]);
    }

    @Test
    public void testDecodeHandlesBothStandardAndUrlSafeChars() {
        byte[] data = {62, 63, -1, -2};
        byte[] encStd = Base64.encodeBase64(data, false, false);
        byte[] encUrl = Base64.encodeBase64(data, false, true);
        Base64 decoder = new Base64();
        assertArrayEquals(data, decoder.decode(encStd));
        assertArrayEquals(data, decoder.decode(encUrl));
    }

    // ================= decode(Object)/encode(Object) =================

    @Test
    public void testDecodeObject_ByteArray() throws DecoderException {
        Base64 b64 = new Base64();
        byte[] encoded = b64.encode("test".getBytes());
        Object result = b64.decode((Object) encoded);
        assertArrayEquals("test".getBytes(), (byte[]) result);
    }

    @Test
    public void testDecodeObject_String() throws DecoderException {
        Base64 b64 = new Base64();
        String encoded = new String(b64.encode("test".getBytes()));
        Object result = b64.decode((Object) encoded);
        assertArrayEquals("test".getBytes(), (byte[]) result);
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObject_InvalidType_Throws() throws DecoderException {
        new Base64().decode((Object) Integer.valueOf(5));
    }

    @Test
    public void testEncodeObject_ByteArray() throws EncoderException {
        Object result = new Base64().encode((Object) "test".getBytes());
        assertNotNull(result);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_InvalidType_Throws() throws EncoderException {
        new Base64().encode((Object) "not a byte array");
    }

    @Test
    public void testEncodeToString() {
        assertEquals("dGVzdA==", new Base64().encodeToString("test".getBytes()));
    }

    @Test
    public void testDecodeString() {
        assertArrayEquals("test".getBytes(), new Base64().decode("dGVzdA=="));
    }

    // ================= instance encode/decode null & empty =================

    @Test
    public void testInstanceEncode_NullAndEmpty() {
        Base64 b64 = new Base64();
        assertNull(b64.encode((byte[]) null));
        assertArrayEquals(new byte[0], b64.encode(new byte[0]));
    }

    @Test
    public void testInstanceDecode_NullAndEmpty() {
        Base64 b64 = new Base64();
        assertNull(b64.decode((byte[]) null));
        assertArrayEquals(new byte[0], b64.decode(new byte[0]));
    }

    // ================= encode() streaming modulus branches (EOF flush) =================

    @Test
    public void testEncode_ModulusOne_Standard_PadsTwice() {
        byte[] encoded = new Base64().encode(new byte[]{1});
        assertEquals('=', encoded[encoded.length - 1]);
        assertEquals('=', encoded[encoded.length - 2]);
    }

    @Test
    public void testEncode_ModulusTwo_Standard_PadsOnce() {
        byte[] encoded = new Base64().encode(new byte[]{1, 2});
        assertEquals('=', encoded[encoded.length - 1]);
        assertNotEquals('=', (char) encoded[encoded.length - 2]);
    }

    @Test
    public void testEncode_ModulusZero_NoPad() {
        String s = new String(new Base64().encode(new byte[]{1, 2, 3}));
        assertFalse(s.contains("="));
    }

    @Test
    public void testEncode_ModulusOne_UrlSafe_NoPad() {
        String s = new String(new Base64(true).encode(new byte[]{1}));
        assertFalse(s.contains("="));
    }

    @Test
    public void testEncode_ModulusTwo_UrlSafe_NoPad() {
        String s = new String(new Base64(true).encode(new byte[]{1, 2}));
        assertFalse(s.contains("="));
    }

    // ================= encode() line-separator double-append guard =================

    @Test
    public void testNoDoubleLineSeparatorAtEOF_WhenModulusZero() {
        Base64 b64 = new Base64(4, Base64.CHUNK_SEPARATOR); // lineLength -> 4
        // 3 bytes = 1 group เต็ม -> separator ถูกใส่ใน loop หลัก, modulus=0 ที่ EOF -> ไม่ควรเติมซ้ำ
        String s = new String(b64.encode(new byte[]{1, 2, 3}));
        assertTrue(s.endsWith("\r\n"));
        assertFalse(s.endsWith("\r\n\r\n"));
    }

    @Test
    public void testLineSeparatorAppendedAfterPadding_WhenModulusNonZero() {
        Base64 b64 = new Base64(4, Base64.CHUNK_SEPARATOR);
        // 4 bytes: group เต็ม 1 กลุ่ม (มี separator แล้ว) + เศษ 1 byte -> pad ที่ EOF -> ต้องเติม separator อีกครั้ง
        String s = new String(b64.encode(new byte[]{1, 2, 3, 4}));
        assertTrue(s.endsWith("\r\n"));
    }

    // ================= decode() padding / modulus tail branches =================

    @Test
    public void testDecode_ModulusTwoAtEOF_NoPadding() {
        byte[] decoded = new Base64().decode("QQ".getBytes());
        assertArrayEquals(new byte[]{65}, decoded);
    }

    @Test
    public void testDecode_ModulusThreeAtEOF_NoPadding() {
        byte[] decoded = new Base64().decode("QUI".getBytes());
        assertArrayEquals("AB".getBytes(), decoded);
    }

    @Test
    public void testDecode_PadCharacter_BreaksLoopEarly() {
        // '=' ต้องทำให้ loop break และ eof=true; ตัวอักษรหลัง '=' ต้องถูก ignore
        byte[] decoded = new Base64().decode("QQ==garbage".getBytes());
        assertArrayEquals(new byte[]{65}, decoded);
    }

    @Test
    public void testDecode_IgnoresNonBase64Whitespace() {
        byte[] decoded = new Base64().decode("QU  \r\nI=".getBytes());
        assertArrayEquals("AB".getBytes(), decoded);
    }

    // ================= discardWhitespace (deprecated, package-private) =================

    @Test
    public void testDiscardWhitespace_RemovesAll() {
        byte[] result = Base64.discardWhitespace(" A B\tC\r\nD ".getBytes());
        assertArrayEquals("ABCD".getBytes(), result);
    }

    @Test
    public void testDiscardWhitespace_NoWhitespace_Unchanged() {
        byte[] result = Base64.discardWhitespace("ABCD".getBytes());
        assertArrayEquals("ABCD".getBytes(), result);
    }

    // ================= streaming helper methods =================

    @Test
    public void testHasDataAndAvail_InitialState() {
        Base64 b64 = new Base64();
        assertFalse(b64.hasData());
        assertEquals(0, b64.avail());
    }

    @Test
    public void testHasData_TrueAfterPartialEncode_AvailZero() {
        // เขียนแค่ 1 byte (modulus != 0) -> buffer ถูก allocate แต่ยังไม่ flush ข้อมูลจริง
        Base64 b64 = new Base64();
        b64.encode("A".getBytes(), 0, 1);
        assertTrue(b64.hasData());
        assertEquals(0, b64.avail());
    }

    @Test
    public void testReadResults_BufferNull_NotEof_ReturnsZero() {
        Base64 b64 = new Base64();
        int len = b64.readResults(new byte[10], 0, 10);
        assertEquals(0, len);
    }

    @Test
    public void testReadResults_BufferNull_Eof_ReturnsMinusOne() {
        Base64 b64 = new Base64();
        b64.encode(new byte[0], 0, -1); // eof=true, buffer allocated (empty)
        byte[] out = new byte[10];
        int first = b64.readResults(out, 0, 10);  // buffer!=null -> len=0, buffer set null after
        assertEquals(0, first);
        int second = b64.readResults(out, 0, 10); // buffer==null && eof -> -1
        assertEquals(-1, second);
    }

    @Test
    public void testSetInitialBuffer_LengthMatches_SetsBuffer() {
        Base64 b64 = new Base64();
        byte[] out = new byte[5];
        b64.setInitialBuffer(out, 0, 5);
        assertTrue(b64.hasData());
    }

    @Test
    public void testSetInitialBuffer_LengthMismatch_Ignored() {
        Base64 b64 = new Base64();
        byte[] out = new byte[5];
        b64.setInitialBuffer(out, 0, 10); // out.length != outAvail -> เงื่อนไข false -> ไม่ set
        assertFalse(b64.hasData());
    }

    // ================= encodeInteger / decodeInteger / toIntegerBytes =================

    @Test(expected = NullPointerException.class)
    public void testEncodeInteger_Null_Throws() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testEncodeDecodeInteger_Zero() {
        BigInteger bi = BigInteger.ZERO;
        assertEquals(bi, Base64.decodeInteger(Base64.encodeInteger(bi)));
    }

    @Test
    public void testEncodeDecodeInteger_ByteAlignedWithSignBit() {
        // 255 -> bitLength=8 (%8==0) -> ผ่านสาขา "byte-aligned skip sign bit"
        BigInteger bi = BigInteger.valueOf(255);
        assertEquals(bi, Base64.decodeInteger(Base64.encodeInteger(bi)));
    }

    @Test
    public void testEncodeDecodeInteger_ExactFitBranch() {
        // 100 -> bitLength=7 (%8 != 0) และเข้าเงื่อนไข exact-fit -> return bigBytes ตรง ๆ
        BigInteger bi = BigInteger.valueOf(100);
        assertEquals(bi, Base64.decodeInteger(Base64.encodeInteger(bi)));
    }

    @Test
    public void testEncodeDecodeInteger_LargeValue() {
        BigInteger bi = new BigInteger("123456789012345678901234567890");
        assertEquals(bi, Base64.decodeInteger(Base64.encodeInteger(bi)));
    }

    @Test
    public void testToIntegerBytes_Direct_SignBitHandling() {
        BigInteger bi = BigInteger.valueOf(128); // top bit set -> ต้อง handle sign byte
        byte[] bytes = Base64.toIntegerBytes(bi);
        assertEquals(bi, new BigInteger(1, bytes));
    }
}
