# Base64Test.java (JUnit 4)

หมายเหตุสำคัญก่อนเริ่ม:
- Test class ถูกวางไว้ใน **package เดียวกับคลาสเป้าหมาย** (`org.apache.commons.codec.binary`) เพื่อให้เข้าถึงเมธอด/ฟิลด์ที่เป็น package-private (เช่น `encode(byte[],int,int)`, `decode(byte[],int,int)`, `hasData()`, `avail()`, `readResults()`, `toIntegerBytes()`, `discardWhitespace()`) ได้โดยไม่ต้องใช้ reflection
- บาง private method (`containsBase64Byte`, `isWhiteSpace`) ไม่สามารถเรียกตรงได้ จึงทดสอบ "ทางอ้อม" ผ่าน public API ที่เรียกใช้งานมัน (คอมเมนต์กำกับไว้ในโค้ด)
- ใน branch ที่ behavior ไม่ชัดเจนจาก source (เช่น การ round สัดส่วนของ lineLength ที่ไม่ใช่ multiple ของ 4) จะไม่ assert ค่าตายตัว แต่ assert คุณสมบัติที่ยืนยันได้จริง พร้อมคอมเมนต์กำกับ

```java
package org.apache.commons.codec.binary;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Test;

public class Base64Test {

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor_NoChunking_NotUrlSafe() {
        Base64 b64 = new Base64();
        byte[] data = new byte[200];
        new Random(1).nextBytes(data);
        byte[] encoded = b64.encode(data);
        String s = new String(encoded);
        // lineLength=0 -> ไม่มี CRLF, ไม่ใช่ urlSafe -> อาจมี '+' หรือ '=' ปนได้
        assertFalse(s.contains("\r\n"));
        assertFalse(new Base64().isUrlSafe());
    }

    @Test
    public void testUrlSafeTrueConstructor_UsesMimeChunkAndCRLF() {
        Base64 b64 = new Base64(true);
        assertTrue(b64.isUrlSafe());
        byte[] data = new byte[100];
        new Random(2).nextBytes(data);
        byte[] encoded = b64.encode(data);
        String s = new String(encoded);
        assertTrue(s.contains("\r\n")); // lineLength = MIME_CHUNK_SIZE(76) > 0
        assertFalse(s.contains("=")); // urlSafe ไม่เติม padding
    }

    @Test
    public void testUrlSafeFalseConstructor() {
        Base64 b64 = new Base64(false);
        assertFalse(b64.isUrlSafe());
    }

    @Test
    public void testLineLengthConstructor_PositiveEnablesChunking() {
        Base64 b64 = new Base64(76);
        byte[] data = new byte[100];
        Arrays.fill(data, (byte) 1);
        byte[] encoded = b64.encode(data);
        assertTrue(new String(encoded).contains("\r\n"));
    }

    @Test
    public void testLineLengthConstructor_ZeroOrNegativeDisablesChunking() {
        Base64 zero = new Base64(0);
        Base64 neg = new Base64(-5);
        byte[] data = new byte[100];
        Arrays.fill(data, (byte) 1);
        assertFalse(new String(zero.encode(data)).contains("\r\n"));
        assertFalse(new String(neg.encode(data)).contains("\r\n"));
    }

    @Test
    public void testConstructor_NullLineSeparator_DisablesChunking() {
        // if (lineSeparator == null) lineLength=0; lineSeparator=CHUNK_SEPARATOR(ignored)
        Base64 b64 = new Base64(76, null);
        byte[] data = new byte[100];
        Arrays.fill(data, (byte) 5);
        byte[] encoded = b64.encode(data);
        assertFalse(new String(encoded).contains("\r\n"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_LineSeparatorContainsBase64Char_Throws() {
        // exercises containsBase64Byte() indirectly -> true branch
        new Base64(76, new byte[] { 'A' });
    }

    @Test
    public void testConstructor_LineSeparatorWithoutBase64Char_NoException() {
        // containsBase64Byte() false branch
        Base64 b64 = new Base64(4, new byte[] { '\r', '\n' }, false);
        assertNotNull(b64);
    }

    // ---------------------------------------------------------------
    // isUrlSafe / hasData / avail / readResults (package-private)
    // ---------------------------------------------------------------

    @Test
    public void testHasDataAndAvail_InitialState() {
        Base64 b64 = new Base64();
        assertFalse(b64.hasData());
        assertEquals(0, b64.avail());
    }

    @Test
    public void testReadResults_ReturnsZero_WhenNoDataAndNotEof() {
        Base64 b64 = new Base64();
        byte[] out = new byte[10];
        int n = b64.readResults(out, 0, out.length);
        assertEquals(0, n); // buffer == null, eof == false -> return 0
    }

    @Test
    public void testReadResults_ReturnsMinusOne_WhenEofAndBufferNull() {
        Base64 b64 = new Base64();
        // เรียก decode(in,inPos,-1) ตรง ๆ (package-private) โดยไม่มีข้อมูลก่อน
        // ทำให้ eof=true แต่ buffer ยังเป็น null (modulus==0 -> ไม่ resize)
        b64.decode(new byte[0], 0, -1);
        byte[] out = new byte[10];
        int n = b64.readResults(out, 0, out.length);
        assertEquals(-1, n);
    }

    // ---------------------------------------------------------------
    // encode(byte[]) public - null/empty & round trips (modulus branches)
    // ---------------------------------------------------------------

    @Test
    public void testEncode_NullArray_ReturnsNull() {
        Base64 b64 = new Base64();
        assertNull(b64.encode((byte[]) null));
    }

    @Test
    public void testEncode_EmptyArray_ReturnsSameEmptyArray() {
        Base64 b64 = new Base64();
        byte[] empty = new byte[0];
        assertSame(empty, b64.encode(empty));
    }

    @Test
    public void testEncode_OneByte_RoundTrip_ModulusOne_WithPadding() {
        Base64 b64 = new Base64();
        byte[] data = { (byte) 200 };
        byte[] encoded = b64.encode(data);
        String s = new String(encoded);
        assertTrue(s.endsWith("==")); // switch case 1 -> 2 pad bytes
        byte[] decoded = new Base64().decode(encoded);
        assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncode_TwoBytes_RoundTrip_ModulusTwo_WithPadding() {
        Base64 b64 = new Base64();
        byte[] data = { (byte) 1, (byte) 2 };
        byte[] encoded = b64.encode(data);
        String s = new String(encoded);
        assertTrue(s.endsWith("=") && !s.endsWith("==")); // switch case 2 -> 1 pad byte
        byte[] decoded = new Base64().decode(encoded);
        assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncode_ThreeBytes_RoundTrip_ModulusZero_NoPadding() {
        Base64 b64 = new Base64();
        byte[] data = { (byte) 1, (byte) 2, (byte) 3 };
        byte[] encoded = b64.encode(data);
        assertFalse(new String(encoded).contains("="));
        byte[] decoded = new Base64().decode(encoded);
        assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncode_UrlSafe_OneByte_NoPadding() {
        Base64 b64 = new Base64(0, Base64.CHUNK_SEPARATOR, true);
        byte[] data = { (byte) 250 };
        byte[] encoded = b64.encode(data);
        assertFalse(new String(encoded).contains("=")); // urlSafe skip padding branch
    }

    @Test
    public void testEncode_UrlSafe_TwoBytes_NoPadding() {
        Base64 b64 = new Base64(0, Base64.CHUNK_SEPARATOR, true);
        byte[] data = { (byte) 250, (byte) 10 };
        byte[] encoded = b64.encode(data);
        assertFalse(new String(encoded).contains("="));
    }

    @Test
    public void testEncode_ChunkBoundary_NoDoubleCRLF() {
        // 57 bytes -> 19 groups*4chars = 76 chars => currentLinePos==lineLength ที่ตอนจบพอดี
        // ตรวจสอบว่าไม่มีการต่อ CRLF ซ้ำ (บรรทัด "Don't want to append the CRLF two times in a row")
        Base64 b64 = new Base64(76);
        byte[] data = new byte[57];
        Arrays.fill(data, (byte) 9);
        byte[] encoded = b64.encode(data);
        String s = new String(encoded);
        assertFalse(s.contains("\r\n\r\n"));
    }

    @Test
    public void testEncode_MultiChunk_InsertsSeparatorMidStream() {
        Base64 b64 = new Base64(76);
        byte[] data = new byte[60]; // ข้ามขอบเขต chunk แล้วมีข้อมูลต่อ
        Arrays.fill(data, (byte) 3);
        byte[] encoded = b64.encode(data);
        String s = new String(encoded);
        int count = s.split("\r\n", -1).length - 1;
        assertTrue(count >= 1);
    }

    @Test
    public void testEncode_LargeData_TriggersBufferResize() {
        // buffer เริ่มที่ 8192 -> ข้อมูลใหญ่กว่านี้จะเข้า else branch ของ resizeBuffer()
        Base64 b64 = new Base64();
        byte[] data = new byte[20000];
        new Random(42).nextBytes(data);
        byte[] encoded = b64.encode(data);
        byte[] decoded = new Base64().decode(encoded);
        assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncodeToString() {
        Base64 b64 = new Base64();
        byte[] data = { 1, 2, 3 };
        String s = b64.encodeToString(data);
        assertEquals(new String(b64.encode(data)), s);
    }

    // ---------------------------------------------------------------
    // Encoder interface: encode(Object)
    // ---------------------------------------------------------------

    @Test
    public void testEncodeObject_ByteArray_Success() throws EncoderException {
        Base64 b64 = new Base64();
        Object result = b64.encode((Object) new byte[] { 1, 2, 3 });
        assertTrue(result instanceof byte[]);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_InvalidType_Throws() throws EncoderException {
        Base64 b64 = new Base64();
        b64.encode((Object) "not a byte array");
    }

    // ---------------------------------------------------------------
    // decode(byte[]) public - null/empty & modulus branches at EOF
    // ---------------------------------------------------------------

    @Test
    public void testDecode_NullArray_ReturnsNull() {
        Base64 b64 = new Base64();
        assertNull(b64.decode((byte[]) null));
    }

    @Test
    public void testDecode_EmptyArray_ReturnsSameEmptyArray() {
        Base64 b64 = new Base64();
        byte[] empty = new byte[0];
        assertSame(empty, b64.decode(empty));
    }

    @Test
    public void testDecode_WithPadding_ModulusTwo() {
        // "AQ==" -> Q,Q ประมวลผล modulus=2 แล้วเจอ '=' -> eof break -> switch case2
        byte[] decoded = new Base64().decode("AQ==".getBytes());
        assertArrayEquals(new byte[] { (byte) 1 }, decoded);
    }

    @Test
    public void testDecode_WithPadding_ModulusThree() {
        // encode 2 bytes มาตรฐานจะได้ padding 1 ตัว -> decode กลับ ต้องได้ modulus=3 ตอนเจอ '='
        byte[] original = { (byte) 10, (byte) 20 };
        byte[] encoded = Base64.encodeBase64(original);
        byte[] decoded = new Base64().decode(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testDecode_NaturalEOF_ModulusTwo_NoPadding() {
        // urlSafe ไม่มี padding -> ต้องพึ่ง inAvail=-1 (eof) เพื่อ flush
        byte[] original = { (byte) 99 };
        byte[] encoded = Base64.encodeBase64URLSafe(original);
        byte[] decoded = new Base64().decode(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testDecode_NaturalEOF_ModulusThree_NoPadding() {
        byte[] original = { (byte) 1, (byte) 2 };
        byte[] encoded = Base64.encodeBase64URLSafe(original);
        byte[] decoded = new Base64().decode(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testDecode_ModulusZeroAtEof_NoExtraOutput() {
        byte[] original = { 1, 2, 3 }; // เต็ม 3 byte -> modulus กลับเป็น 0 พอดี
        byte[] encoded = Base64.encodeBase64(original);
        byte[] decoded = new Base64().decode(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testDecode_IgnoresInvalidCharacters() {
        // อักขระที่ไม่ใช่ base64 (เช่น '!','#') ต้องถูกข้าม (DECODE_TABLE[...] == -1 branch)
        byte[] original = { 65, 66, 67 };
        byte[] encoded = Base64.encodeBase64(original);
        String withGarbage = "!#" + new String(encoded) + "!#";
        byte[] decoded = new Base64().decode(withGarbage.getBytes());
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testDecode_IgnoresWhitespaceLikeChunkedOutput() {
        byte[] original = new byte[100];
        Arrays.fill(original, (byte) 7);
        byte[] encodedChunked = Base64.encodeBase64Chunked(original); // มี \r\n ปน
        byte[] decoded = new Base64().decode(encodedChunked);
        assertArrayEquals(original, decoded);
    }

    // ---------------------------------------------------------------
    // Decoder interface: decode(Object) / decode(String)
    // ---------------------------------------------------------------

    @Test
    public void testDecodeObject_ByteArray() throws DecoderException {
        Base64 b64 = new Base64();
        byte[] encoded = Base64.encodeBase64(new byte[] { 1, 2, 3 });
        Object result = b64.decode((Object) encoded);
        assertArrayEquals(new byte[] { 1, 2, 3 }, (byte[]) result);
    }

    @Test
    public void testDecodeObject_String() throws DecoderException {
        Base64 b64 = new Base64();
        String encoded = Base64.encodeBase64String(new byte[] { 4, 5, 6 });
        Object result = b64.decode((Object) encoded);
        assertArrayEquals(new byte[] { 4, 5, 6 }, (byte[]) result);
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObject_InvalidType_Throws() throws DecoderException {
        Base64 b64 = new Base64();
        b64.decode((Object) Integer.valueOf(5));
    }

    @Test
    public void testDecodeString() {
        Base64 b64 = new Base64();
        String encoded = Base64.encodeBase64String(new byte[] { 9, 8, 7 });
        byte[] decoded = b64.decode(encoded);
        assertArrayEquals(new byte[] { 9, 8, 7 }, decoded);
    }

    // ---------------------------------------------------------------
    // isBase64(byte) - boundary conditions
    // ---------------------------------------------------------------

    @Test
    public void testIsBase64Byte_Pad() {
        assertTrue(Base64.isBase64((byte) '='));
    }

    @Test
    public void testIsBase64Byte_ValidChar() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) '+'));
        assertTrue(Base64.isBase64((byte) '/'));
    }

    @Test
    public void testIsBase64Byte_NegativeOctet_False() {
        // octet < 0 -> เงื่อนไข (octet >= 0 ...) false
        assertFalse(Base64.isBase64((byte) -5));
    }

    @Test
    public void testIsBase64Byte_OutOfRangeHigh_False() {
        // octet >= DECODE_TABLE.length -> false; DECODE_TABLE length = 122 ('z'+1)
        assertFalse(Base64.isBase64((byte) 127));
    }

    @Test
    public void testIsBase64Byte_InvalidWithinRange_False() {
        // ตัวอย่าง ':' อยู่ในช่วงตาราง แต่ DECODE_TABLE[':'] == -1
        assertFalse(Base64.isBase64((byte) ':'));
    }

    // ---------------------------------------------------------------
    // isBase64(String) / isBase64(byte[]) / isArrayByteBase64 (deprecated)
    // ---------------------------------------------------------------

    @Test
    public void testIsBase64String_Valid() {
        assertTrue(Base64.isBase64("QUJD"));
    }

    @Test
    public void testIsBase64String_Empty_True() {
        assertTrue(Base64.isBase64(""));
    }

    @Test
    public void testIsBase64String_Invalid() {
        assertFalse(Base64.isBase64("not base64!!"));
    }

    @Test
    public void testIsBase64ByteArray_ValidWithWhitespace_True() {
        // เงื่อนไข isWhiteSpace ถูกเรียกทางอ้อมผ่านที่นี่
        byte[] data = "AB CD\r\n".getBytes();
        assertTrue(Base64.isBase64(data));
    }

    @Test
    public void testIsBase64ByteArray_EmptyArray_True() {
        assertTrue(Base64.isBase64(new byte[0]));
    }

    @Test
    public void testIsBase64ByteArray_InvalidChar_False() {
        byte[] data = "AB#CD".getBytes();
        assertFalse(Base64.isBase64(data));
    }

    @Test
    public void testIsArrayByteBase64_DeprecatedDelegatesCorrectly() {
        byte[] valid = "QUJD".getBytes();
        byte[] invalid = "!!!!".getBytes();
        assertTrue(Base64.isArrayByteBase64(valid));
        assertFalse(Base64.isArrayByteBase64(invalid));
    }

    // ---------------------------------------------------------------
    // Static encode helpers
    // ---------------------------------------------------------------

    @Test
    public void testEncodeBase64_NullAndEmpty() {
        assertNull(Base64.encodeBase64(null));
        assertSame(new byte[0].getClass(), Base64.encodeBase64(new byte[0]).getClass());
        assertEquals(0, Base64.encodeBase64(new byte[0]).length);
    }

    @Test
    public void testEncodeBase64_NotChunked() {
        byte[] encoded = Base64.encodeBase64("Hello World!".getBytes());
        assertFalse(new String(encoded).contains("\r\n"));
    }

    @Test
    public void testEncodeBase64Chunked_ContainsCRLF() {
        byte[] data = new byte[100];
        Arrays.fill(data, (byte) 5);
        byte[] encoded = Base64.encodeBase64Chunked(data);
        assertTrue(new String(encoded).contains("\r\n"));
    }

    @Test
    public void testEncodeBase64URLSafe_NoPadding() {
        byte[] data = { 1 };
        byte[] encoded = Base64.encodeBase64URLSafe(data);
        assertFalse(new String(encoded).contains("="));
    }

    @Test
    public void testEncodeBase64URLSafeString() {
        String s = Base64.encodeBase64URLSafeString(new byte[] { 1, 2 });
        assertFalse(s.contains("="));
    }

    @Test
    public void testEncodeBase64String_NotChunked() {
        byte[] data = new byte[100];
        Arrays.fill(data, (byte) 1);
        String s = Base64.encodeBase64String(data);
        assertFalse(s.contains("\r\n")); // ตาม comment ใน source (1.5 behavior)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64_MaxResultSizeExceeded_Throws() {
        byte[] data = new byte[20];
        Base64.encodeBase64(data, false, false, 1); // len คำนวณได้มากกว่า 1 แน่นอน
    }

    @Test
    public void testEncodeBase64_MaxResultSizeSufficient_NoException() {
        byte[] data = new byte[3];
        byte[] result = Base64.encodeBase64(data, false, false, 100);
        assertNotNull(result);
    }

    // ---------------------------------------------------------------
    // Static decode helpers
    // ---------------------------------------------------------------

    @Test
    public void testDecodeBase64_String() {
        byte[] decoded = Base64.decodeBase64("QUJD");
        assertArrayEquals("ABC".getBytes(), decoded);
    }

    @Test
    public void testDecodeBase64_ByteArray() {
        byte[] decoded = Base64.decodeBase64("QUJD".getBytes());
        assertArrayEquals("ABC".getBytes(), decoded);
    }

    // ---------------------------------------------------------------
    // Integer encode/decode
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testEncodeInteger_Null_Throws() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testEncodeDecodeInteger_RoundTrip_Zero() {
        BigInteger zero = BigInteger.ZERO;
        byte[] encoded = Base64.encodeInteger(zero);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(zero, decoded);
    }

    @Test
    public void testEncodeDecodeInteger_RoundTrip_SmallPositive() {
        BigInteger value = BigInteger.valueOf(5); // bitLength=3, exercise toIntegerBytes "direct return" branch
        byte[] encoded = Base64.encodeInteger(value);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(value, decoded);
    }

    @Test
    public void testEncodeDecodeInteger_RoundTrip_ByteAligned() {
        // 255 -> bitLength=8 (aligned) -> exercise "startSrc=1,len--" branch ใน toIntegerBytes
        BigInteger value = BigInteger.valueOf(255);
        byte[] encoded = Base64.encodeInteger(value);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(value, decoded);
    }

    @Test
    public void testEncodeDecodeInteger_RoundTrip_LargeValue() {
        BigInteger value = new BigInteger("123456789012345678901234567890");
        byte[] encoded = Base64.encodeInteger(value);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(value, decoded);
    }

    // ---------------------------------------------------------------
    // discardWhitespace (deprecated, package-private static)
    // ---------------------------------------------------------------

    @Test
    public void testDiscardWhitespace_RemovesAllWhitespaceTypes() {
        byte[] input = " A\nB\rC\tD ".getBytes();
        byte[] result = Base64.discardWhitespace(input);
        assertArrayEquals("ABCD".getBytes(), result);
    }

    @Test
    public void testDiscardWhitespace_NoWhitespace_Unchanged() {
        byte[] input = "ABCD".getBytes();
        byte[] result = Base64.discardWhitespace(input);
        assertArrayEquals(input, result);
    }

    @Test
    public void testDiscardWhitespace_EmptyArray() {
        byte[] result = Base64.discardWhitespace(new byte[0]);
        assertEquals(0, result.length);
    }
}
```

---

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testDefaultConstructor_NoChunking_NotUrlSafe | Base64() → lineLength=0, isUrlSafe() false branch |
| testUrlSafeTrueConstructor_UsesMimeChunkAndCRLF | Base64(true) → lineLength=76, urlSafe true, padding skip |
| testUrlSafeFalseConstructor | Base64(false) urlSafe false |
| testLineLengthConstructor_PositiveEnablesChunking | lineLength>0 true branch (encodeSize=4+sep.length) |
| testLineLengthConstructor_ZeroOrNegativeDisablesChunking | lineLength>0 false branch (0, -5) |
| testConstructor_NullLineSeparator_DisablesChunking | `lineSeparator==null` branch |
| testConstructor_LineSeparatorContainsBase64Char_Throws | containsBase64Byte true → IllegalArgumentException |
| testConstructor_LineSeparatorWithoutBase64Char_NoException | containsBase64Byte false |
| testHasDataAndAvail_InitialState | hasData()/avail() buffer==null branch |
| testReadResults_ReturnsZero_WhenNoDataAndNotEof | readResults buffer==null, eof=false → return 0 |
| testReadResults_ReturnsMinusOne_WhenEofAndBufferNull | readResults buffer==null, eof=true → return -1 |
| testEncode_NullArray_ReturnsNull | encode(byte[]) null check |
| testEncode_EmptyArray_ReturnsSameEmptyArray | encode(byte[]) length==0 branch |
| testEncode_OneByte_...ModulusOne | encode switch case 1 (+padding) |
| testEncode_TwoBytes_...ModulusTwo | encode switch case 2 (+padding) |
| testEncode_ThreeBytes_...ModulusZero | encode default (modulus 0, no pad) |
| testEncode_UrlSafe_OneByte_NoPadding | encodeTable!=STANDARD → skip padding (case1) |
| testEncode_UrlSafe_TwoBytes_NoPadding | encodeTable!=STANDARD → skip padding (case2) |
| testEncode_ChunkBoundary_NoDoubleCRLF | "ไม่ต่อ CRLF ซ้ำ" condition ที่ EOF |
| testEncode_MultiChunk_InsertsSeparatorMidStream | lineLength<=currentLinePos ในลูป (true branch) |
| testEncode_LargeData_TriggersBufferResize | resizeBuffer() else-branch (double buffer) |
| testEncodeToString | encodeToString wrapper |
| testEncodeObject_ByteArray_Success | encode(Object) instanceof byte[] true |
| testEncodeObject_InvalidType_Throws | encode(Object) instanceof byte[] false → Exception |
| testDecode_NullArray_ReturnsNull | decode(byte[]) null |
| testDecode_EmptyArray_ReturnsSameEmptyArray | decode(byte[]) length==0 |
| testDecode_WithPadding_ModulusTwo | decode PAD branch, switch case2 |
| testDecode_WithPadding_ModulusThree | decode PAD branch, switch case3 |
| testDecode_NaturalEOF_ModulusTwo_NoPadding | eof via inAvail<0 (ไม่ผ่าน PAD), case2 |
| testDecode_NaturalEOF_ModulusThree_NoPadding | eof via inAvail<0, case3 |
| testDecode_ModulusZeroAtEof_NoExtraOutput | `eof && modulus!=0` false branch |
| testDecode_IgnoresInvalidCharacters | DECODE_TABLE[b]==-1 branch, out-of-alphabet skip |
| testDecode_IgnoresWhitespaceLikeChunkedOutput | b>=0 && b<table.length but result -1 (CR/LF) |
| testDecodeObject_ByteArray | decode(Object) instanceof byte[] |
| testDecodeObject_String | decode(Object) instanceof String |
| testDecodeObject_InvalidType_Throws | decode(Object) else → DecoderException |
| testDecodeString | decode(String) wrapper |
| testIsBase64Byte_Pad | isBase64(byte) octet==PAD true |
| testIsBase64Byte_ValidChar | DECODE_TABLE[octet]!=-1 true |
| testIsBase64Byte_NegativeOctet_False | octet>=0 false branch |
| testIsBase64Byte_OutOfRangeHigh_False | octet<DECODE_TABLE.length false branch |
| testIsBase64Byte_InvalidWithinRange_False | DECODE_TABLE[octet]==-1 branch |
| testIsBase64String_Valid/Empty/Invalid | isBase64(String) ทุกกรณี |
| testIsBase64ByteArray_ValidWithWhitespace_True | isWhiteSpace true (ทางอ้อม) |
| testIsBase64ByteArray_EmptyArray_True | loop ไม่ execute → return true |
| testIsBase64ByteArray_InvalidChar_False | !isBase64 && !isWhiteSpace → false |
| testIsArrayByteBase64_Deprecated... | isArrayByteBase64 delegate |
| testEncodeBase64_NullAndEmpty | encodeBase64 null/empty branch |
| testEncodeBase64_NotChunked / Chunked | isChunked true/false |
| testEncodeBase64URLSafe*/String | urlSafe true branch |
| testEncodeBase64String_NotChunked | encodeBase64String behavior |
| testEncodeBase64_MaxResultSizeExceeded_Throws | len>maxResultSize → IllegalArgumentException |
| testEncodeBase64_MaxResultSizeSufficient_NoException | len<=maxResultSize |
| testDecodeBase64_String/ByteArray | static decode helpers |
| testEncodeInteger_Null_Throws | encodeInteger null check |
| testEncodeDecodeInteger_RoundTrip_* | toIntegerBytes หลายกรณี (bitLength aligned/unaligned) |
| testDiscardWhitespace_* | discardWhitespace switch (space/\n/\r/\t/default) |

**ข้อจำกัดที่ระบุไว้ชัดเจน:** `containsBase64Byte` และ `isWhiteSpace` เป็น `private` จึงทดสอบผ่าน public API ที่เรียกใช้เท่านั้น ไม่ได้เรียกตรง — ครอบคลุม branch ได้ แต่ไม่ 100% แยกอิสระจากเมธอดที่เรียก