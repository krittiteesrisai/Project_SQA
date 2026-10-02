package org.apache.commons.codec.binary;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.Base64; // self-import ตามข้อกำหนด (อยู่ package เดียวกัน แต่ import ได้ตามกฎ Java)

public class Base64Test {

    // =========================================================
    // 1. Constructor branches
    // =========================================================

    @Test
    public void testDefaultConstructor_notUrlSafe() {
        Base64 b64 = new Base64();
        assertFalse("Default constructor must not be URL-safe", b64.isUrlSafe());
    }

    @Test
    public void testUrlSafeConstructor_true() {
        assertTrue(new Base64(true).isUrlSafe());
    }

    @Test
    public void testUrlSafeConstructor_false() {
        assertFalse(new Base64(false).isUrlSafe());
    }

    @Test
    public void testLineLengthConstructor_roundsDownToMultipleOf4() {
        // 77 -> (77/4)*4 = 76
        Base64 b64 = new Base64(77);
        byte[] data = new byte[100];
        for (int i = 0; i < data.length; i++) data[i] = (byte) ('A' + (i % 26));
        String s = new String(b64.encode(data));
        assertEquals(76, s.indexOf("\r\n"));
    }

    @Test
    public void testLineLengthZero_noChunking() {
        Base64 b64 = new Base64(0);
        byte[] data = new byte[100];
        assertFalse(new String(b64.encode(data)).contains("\r\n"));
    }

    @Test
    public void testLineLengthNegative_treatedAsZero() {
        Base64 b64 = new Base64(-10);
        byte[] data = new byte[50];
        assertFalse(new String(b64.encode(data)).contains("\r\n"));
    }

    @Test
    public void testNullLineSeparator_disablesChunkingRegardlessOfLineLength() {
        // lineSeparator == null -> lineLength ถูกบังคับเป็น 0 ตาม source
        Base64 b64 = new Base64(76, null);
        byte[] data = new byte[200];
        assertFalse(new String(b64.encode(data)).contains("\r\n"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidLineSeparatorContainsBase64Char() {
        // 'A' เป็นอักขระ base64 -> containsBase64Byte() = true -> throw
        new Base64(76, new byte[]{'A'});
    }

    @Test
    public void testConstructor_validCustomLineSeparator_noException() {
        Base64 b64 = new Base64(4, new byte[]{'\n'}, false);
        byte[] data = new byte[8];
        String s = new String(b64.encode(data));
        assertTrue(s.contains("\n"));
        assertFalse(s.contains("\r"));
    }

    // =========================================================
    // 2. isBase64(byte) branches
    // =========================================================

    @Test
    public void testIsBase64_padChar() {
        assertTrue(Base64.isBase64((byte) '='));
    }

    @Test
    public void testIsBase64_validChars() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) '+'));
        assertTrue(Base64.isBase64((byte) '/'));
    }

    @Test
    public void testIsBase64_invalidCharInRange() {
        assertFalse(Base64.isBase64((byte) '!'));
    }

    @Test
    public void testIsBase64_negativeOctet() {
        assertFalse(Base64.isBase64((byte) -1));
    }

    @Test
    public void testIsBase64_boundaryAtDecodeTableLength() {
        // DECODE_TABLE ครอบคลุม ASCII 0..122 ('z') รวม 123 ช่อง
        assertTrue(Base64.isBase64((byte) 'z'));   // index 122 -> ยังในขอบเขต
        assertFalse(Base64.isBase64((byte) '{'));  // index 123 -> เกินขอบเขต (octet < length เป็น false)
    }

    // =========================================================
    // 3. isArrayByteBase64 / isWhiteSpace / containsBase64Byte (ทางอ้อม)
    // =========================================================

    @Test
    public void testIsArrayByteBase64_emptyArray_true() {
        assertTrue(Base64.isArrayByteBase64(new byte[0]));
    }

    @Test
    public void testIsArrayByteBase64_validData_true() {
        assertTrue(Base64.isArrayByteBase64("SGVsbG8=".getBytes()));
    }

    @Test
    public void testIsArrayByteBase64_withWhitespace_true() {
        assertTrue(Base64.isArrayByteBase64("SGVs bG8=\r\n\t".getBytes()));
    }

    @Test
    public void testIsArrayByteBase64_invalidChar_false() {
        assertFalse(Base64.isArrayByteBase64("SGVsbG8!".getBytes()));
    }

    // =========================================================
    // 4. Static encode/decode: null/empty boundary
    // =========================================================

    @Test
    public void testEncodeBase64_nullInput_returnsNull() {
        assertNull(Base64.encodeBase64(null));
    }

    @Test
    public void testEncodeBase64_emptyInput_returnsEmpty() {
        byte[] r = Base64.encodeBase64(new byte[0]);
        assertNotNull(r);
        assertEquals(0, r.length);
    }

    @Test
    public void testDecodeBase64_nullInput_returnsNull() {
        assertNull(Base64.decodeBase64((byte[]) null));
    }

    @Test
    public void testDecodeBase64_emptyInput_returnsEmpty() {
        byte[] r = Base64.decodeBase64(new byte[0]);
        assertNotNull(r);
        assertEquals(0, r.length);
    }

    // =========================================================
    // 5. modulus branches: 0/1/2 ตอน encode, 0/2/3 ตอน decode (EOF switch)
    // =========================================================

    @Test
    public void testRoundTrip_oneByte_modulus1_paddedWith2Equals() {
        byte[] data = {(byte) 0xAB};
        byte[] encoded = Base64.encodeBase64(data);
        assertEquals(4, encoded.length);
        assertEquals('=', encoded[3]);
        assertEquals('=', encoded[2]);
        assertArrayEquals(data, Base64.decodeBase64(encoded));
    }

    @Test
    public void testRoundTrip_twoBytes_modulus2_paddedWith1Equals() {
        byte[] data = {0x01, 0x02};
        byte[] encoded = Base64.encodeBase64(data);
        assertEquals(4, encoded.length);
        assertEquals('=', encoded[3]);
        assertArrayEquals(data, Base64.decodeBase64(encoded));
    }

    @Test
    public void testRoundTrip_threeBytes_modulus0_noPadding() {
        byte[] data = {0x01, 0x02, 0x03};
        byte[] encoded = Base64.encodeBase64(data);
        assertEquals(4, encoded.length);
        for (byte b : encoded) assertNotEquals('=', (char) b);
        assertArrayEquals(data, Base64.decodeBase64(encoded));
    }

    @Test
    public void testEncodeBase64URLSafe_noPaddingNoPlusSlash() {
        byte[] data = {(byte) 0xFF, (byte) 0xFF};
        String s = new String(Base64.encodeBase64URLSafe(data));
        assertFalse(s.contains("="));
        assertFalse(s.contains("+"));
        assertFalse(s.contains("/"));
    }

    @Test
    public void testEncodeBase64URLSafeString() {
        String s = Base64.encodeBase64URLSafeString(new byte[]{1, 2, 3, 4, 5});
        assertFalse(s.contains("="));
    }

    @Test
    public void testEncodeBase64String_isChunked() {
        // encodeBase64String เรียก encodeBase64(data, true) -> ต้อง chunk
        String s = Base64.encodeBase64String(new byte[100]);
        assertTrue("encodeBase64String ต้อง chunk ทุก 76 ตัวอักษร", s.contains("\r\n"));
    }

    @Test
    public void testEncodeBase64Chunked_vs_encodeBase64NonChunked() {
        byte[] data = new byte[100];
        assertTrue(new String(Base64.encodeBase64Chunked(data)).contains("\r\n"));
        assertFalse(new String(Base64.encodeBase64(data, false)).contains("\r\n"));
    }

    // =========================================================
    // 6. maxResultSize branch
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64_maxResultSizeExceeded_throws() {
        Base64.encodeBase64(new byte[1000], false, false, 10);
    }

    @Test
    public void testEncodeBase64_maxResultSizeSufficient_noException() {
        byte[] r = Base64.encodeBase64(new byte[3], false, false, 100);
        assertNotNull(r);
    }

    // =========================================================
    // 7. decode(): PAD ทำให้ eof=true, ignore ตัวอักษรที่ไม่ใช่ base64
    // =========================================================

    @Test
    public void testDecode_ignoresInvalidCharacterInStream() {
        byte[] encoded = "SGVs!bG8=".getBytes(); // '!' อยู่ในช่วง table แต่ DECODE_TABLE[value]=-1
        assertArrayEquals("Hello".getBytes(), Base64.decodeBase64(encoded));
    }

    @Test
    public void testDecode_padStopsProcessing_trailingGarbageIgnored() {
        byte[] encoded = "SGVsbG8=XXXXX".getBytes();
        assertArrayEquals("Hello".getBytes(), Base64.decodeBase64(encoded));
    }

    @Test
    public void testDecode_urlSafeCharactersAlsoDecodeCorrectly() {
        byte[] data = {(byte) 0xFB, (byte) 0xFF, (byte) 0xFE};
        byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(data);
        assertArrayEquals(data, Base64.decodeBase64(encodedUrlSafe));
    }

    // =========================================================
    // 8. Object encode/decode (Encoder/Decoder interface)
    // =========================================================

    @Test
    public void testEncodeObject_byteArray_ok() throws EncoderException {
        Object result = new Base64().encode((Object) new byte[]{1, 2, 3});
        assertTrue(result instanceof byte[]);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_invalidType_throws() throws EncoderException {
        new Base64().encode((Object) "not a byte array");
    }

    @Test
    public void testDecodeObject_byteArray_ok() throws DecoderException {
        byte[] encoded = Base64.encodeBase64("test".getBytes());
        Object result = new Base64().decode((Object) encoded);
        assertArrayEquals("test".getBytes(), (byte[]) result);
    }

    @Test
    public void testDecodeObject_string_ok() throws DecoderException {
        String encoded = new String(Base64.encodeBase64("test".getBytes()));
        Object result = new Base64().decode((Object) encoded);
        assertArrayEquals("test".getBytes(), (byte[]) result);
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObject_invalidType_throws() throws DecoderException {
        new Base64().decode((Object) Integer.valueOf(5));
    }

    // =========================================================
    // 9. Instance encode(byte[])/decode(byte[])/encodeToString/decode(String)
    // =========================================================

    @Test
    public void testEncodeToString() {
        assertEquals("YWJj", new Base64().encodeToString("abc".getBytes()));
    }

    @Test
    public void testDecodeString_instanceMethod() {
        assertArrayEquals("abc".getBytes(), new Base64().decode("YWJj"));
    }

    @Test
    public void testInstanceEncode_nullArray_returnsNull() {
        assertNull(new Base64().encode((byte[]) null));
    }

    @Test
    public void testInstanceEncode_emptyArray_returnsEmpty() {
        assertEquals(0, new Base64().encode(new byte[0]).length);
    }

    @Test
    public void testInstanceDecode_nullArray_returnsNull() {
        assertNull(new Base64().decode((byte[]) null));
    }

    @Test
    public void testInstanceDecode_emptyArray_returnsEmpty() {
        assertEquals(0, new Base64().decode(new byte[0]).length);
    }

    // =========================================================
    // 10. encodeInteger / decodeInteger / toIntegerBytes (ทางอ้อม)
    // =========================================================

    @Test(expected = NullPointerException.class)
    public void testEncodeInteger_null_throwsNPE() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testEncodeDecodeInteger_zero() {
        byte[] encoded = Base64.encodeInteger(BigInteger.ZERO);
        assertEquals(BigInteger.ZERO, Base64.decodeInteger(encoded));
    }

    @Test
    public void testEncodeDecodeInteger_largePositiveValue() {
        BigInteger original = new BigInteger("123456789012345678901234567890");
        byte[] encoded = Base64.encodeInteger(original);
        assertEquals(original, Base64.decodeInteger(encoded));
    }

    @Test
    public void testEncodeDecodeInteger_bitLengthNotByteAligned_branch() {
        // 256 -> bitLength()=9 (ไม่ลงตัวกับ 8) เข้า branch "return bigBytes ตรง ๆ"
        BigInteger original = BigInteger.valueOf(256);
        byte[] encoded = Base64.encodeInteger(original);
        assertEquals(original, Base64.decodeInteger(encoded));
    }

    @Test
    public void testEncodeDecodeInteger_bitLengthByteAligned_branch() {
        // 255 -> bitLength()=8 (ลงตัวกับ 8) เข้า branch "startSrc=1, ตัด sign byte"
        BigInteger original = BigInteger.valueOf(255);
        byte[] encoded = Base64.encodeInteger(original);
        assertEquals(original, Base64.decodeInteger(encoded));
    }

    // =========================================================
    // 11. discardWhitespace (deprecated, package-private)
    // =========================================================

    @Test
    public void testDiscardWhitespace_removesAllWhitespaceTypes() {
        byte[] result = Base64.discardWhitespace(" A\nB\rC\tD ".getBytes());
        assertArrayEquals("ABCD".getBytes(), result);
    }

    @Test
    public void testDiscardWhitespace_noWhitespace_unchanged() {
        byte[] input = "ABCD".getBytes();
        assertArrayEquals(input, Base64.discardWhitespace(input));
    }

    @Test
    public void testDiscardWhitespace_allWhitespace_empty() {
        assertEquals(0, Base64.discardWhitespace(" \n\r\t".getBytes()).length);
    }

    // =========================================================
    // 12. hasData()/avail()/resizeBuffer (package-private, internal state)
    // =========================================================

    @Test
    public void testHasDataAndAvail_initialState() {
        Base64 b64 = new Base64();
        assertFalse(b64.hasData());
        assertEquals(0, b64.avail());
    }

    @Test
    public void testHasDataAndAvail_afterPartialEncode_noEOFYet() {
        Base64 b64 = new Base64();
        b64.encode(new byte[]{1, 2, 3, 4, 5}, 0, 5); // 1 กลุ่มสมบูรณ์ (3 byte) + เหลือ 2 byte ค้าง
        assertTrue(b64.hasData());
        assertTrue(b64.avail() > 0);
    }

    @Test
    public void testEncodeDecodeRoundTrip_largeData_forcesBufferResize() {
        byte[] data = new byte[50000];
        for (int i = 0; i < data.length; i++) data[i] = (byte) (i % 256);
        byte[] encoded = Base64.encodeBase64(data);
        assertArrayEquals(data, Base64.decodeBase64(encoded));
    }

    @Test
    public void testEncode_exactChunkBoundary_singleTrailingCRLF() {
        // 57 byte -> เข้ารหัสได้พอดี 76 ตัวอักษร (1 บรรทัดพอดีกับ lineLength เริ่มต้น)
        Base64 b64 = new Base64(true);
        byte[] data = new byte[57];
        String s = new String(b64.encode(data));
        assertTrue(s.endsWith("\r\n"));
        int crlfCount = s.split("\r\n", -1).length - 1;
        assertEquals("ต้องมี CRLF ปิดท้ายเพียงครั้งเดียว ไม่ใช่ซ้ำ", 1, crlfCount);
    }

    // =========================================================
    // 13. setInitialBuffer / readResults (package-private) — เข้าถึง branch ภายในตรง ๆ
    // =========================================================

    @Test
    public void testSetInitialBuffer_conditionFalse_bufferNotSet() {
        Base64 b64 = new Base64();
        b64.setInitialBuffer(new byte[10], 0, 5); // length(10) != outAvail(5)
        assertFalse(b64.hasData());
    }

    @Test
    public void testSetInitialBuffer_conditionTrue_bufferSetDirectly() {
        Base64 b64 = new Base64();
        byte[] out = new byte[8];
        b64.setInitialBuffer(out, 2, 8); // length(8) == outAvail(8)
        assertTrue(b64.hasData());
        assertEquals(0, b64.avail());
    }

    @Test
    public void testReadResults_sameArrayReference_marksBufferNull() {
        Base64 b64 = new Base64();
        byte[] buf = new byte[10];
        b64.setInitialBuffer(buf, 0, buf.length);
        b64.encode(new byte[]{1, 2, 3}, 0, 3); // เขียนตรงลง buf เดิม
        int avail = b64.avail();
        int len = b64.readResults(buf, 0, buf.length); // buffer == b -> branch else {buffer=null;}
        assertEquals(avail, len);
        assertFalse(b64.hasData());
    }

    @Test
    public void testReadResults_differentArrayReference_fullyConsumed_bufferNulled() {
        Base64 b64 = new Base64();
        b64.encode(new byte[]{1, 2, 3}, 0, 3); // buffer ภายในถูกจอง (คนละ array กับ out)
        byte[] out = new byte[10];
        int len = b64.readResults(out, 0, out.length); // อ่านหมด -> readPos>=pos -> buffer=null
        assertEquals(4, len);
        assertFalse(b64.hasData());
    }

    @Test
    public void testReadResults_partialRead_bufferRemainsNonNull() {
        Base64 b64 = new Base64();
        b64.encode(new byte[]{1, 2, 3, 4, 5, 6}, 0, 6); // 2 กลุ่ม -> pos=8
        byte[] out = new byte[3]; // ขอน้อยกว่าที่มี
        int len = b64.readResults(out, 0, out.length);
        assertEquals(3, len);
        assertTrue(b64.hasData());
        assertEquals(5, b64.avail());
    }

    @Test
    public void testReadResults_bufferNullAndNotEof_returnsZero() {
        Base64 b64 = new Base64();
        int len = b64.readResults(new byte[5], 0, 5);
        assertEquals(0, len);
    }

    @Test
    public void testReadResults_bufferNullAndEofTrue_returnsMinusOne() {
        Base64 b64 = new Base64();
        // inAvail = -1 -> eof=true ทันที, loop for(i<-1) ไม่ execute, modulus=0 -> buffer ยังคง null
        b64.decode(new byte[0], 0, -1);
        int len = b64.readResults(new byte[5], 0, 5);
        assertEquals(-1, len);
    }
}
