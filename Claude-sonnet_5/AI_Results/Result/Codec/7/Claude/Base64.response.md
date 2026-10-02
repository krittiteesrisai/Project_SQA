# Base64Test.java (JUnit 4) — Codec-7b `org.apache.commons.codec.binary.Base64`

หมายเหตุสำคัญ: ผมจงใจวางคลาสทดสอบไว้ใน **package เดียวกับคลาสเป้าหมาย** (`org.apache.commons.codec.binary`) เพื่อให้สามารถเรียกเมธอด/ฟิลด์ระดับ package-private ได้โดยตรง เช่น `encode(byte[],int,int)`, `decode(byte[],int,int)`, `hasData()`, `avail()`, `setInitialBuffer()`, `readResults()`, `discardWhitespace()`, `toIntegerBytes()`, `CHUNK_SEPARATOR` — สิ่งเหล่านี้ไม่ใช่การ "เดา behavior" แต่เป็นการเข้าถึงตาม visibility จริงของซอร์สที่ให้มา เพื่อเพิ่ม branch coverage ให้สูงที่สุด

```java
package org.apache.commons.codec.binary;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.Arrays;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Test;

public class Base64Test {

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor_UrlSafeFalse_NoChunking() {
        Base64 b64 = new Base64();
        assertFalse(b64.isUrlSafe());
        byte[] data = new byte[200];
        Arrays.fill(data, (byte) 'X');
        byte[] encoded = b64.encode(data);
        assertFalse(new String(encoded).contains("\r\n"));
    }

    @Test
    public void testBooleanConstructor_UrlSafeTrue_DefaultMimeChunk() {
        Base64 b64 = new Base64(true);
        assertTrue(b64.isUrlSafe());
        byte[] data = new byte[100];
        Arrays.fill(data, (byte) 'Y');
        byte[] encoded = b64.encode(data);
        assertTrue(new String(encoded).contains("\r\n"));
    }

    @Test
    public void testBooleanConstructor_UrlSafeFalse_DefaultChunk76() {
        Base64 b64 = new Base64(false);
        assertFalse(b64.isUrlSafe());
        byte[] data = new byte[100];
        Arrays.fill(data, (byte) 'Y');
        byte[] encoded = b64.encode(data);
        String s = new String(encoded);
        String[] lines = s.split("\r\n");
        for (int i = 0; i < lines.length - 1; i++) {
            assertEquals(76, lines[i].length());
        }
    }

    @Test
    public void testLineLengthConstructor_RoundedDownToMultipleOf4() {
        // 10 -> (10/4)*4 = 8
        Base64 b64 = new Base64(10, Base64.CHUNK_SEPARATOR);
        byte[] data = new byte[30];
        Arrays.fill(data, (byte) 'A');
        byte[] encoded = b64.encode(data);
        String s = new String(encoded);
        String[] lines = s.split("\r\n");
        for (int i = 0; i < lines.length - 1; i++) {
            assertEquals(8, lines[i].length());
        }
    }

    @Test
    public void testLineLengthConstructor_NonPositive_NoChunking() {
        Base64 b64 = new Base64(-5, Base64.CHUNK_SEPARATOR);
        byte[] data = new byte[50];
        Arrays.fill(data, (byte) 'Z');
        byte[] encoded = b64.encode(data);
        assertFalse(new String(encoded).contains("\r\n"));
    }

    @Test
    public void testTwoArgConstructor_DelegatesUrlSafeFalse() {
        Base64 b64 = new Base64(76, Base64.CHUNK_SEPARATOR);
        assertFalse(b64.isUrlSafe());
    }

    @Test
    public void testNullLineSeparator_ForcesNoChunkingEvenIfPositiveLineLength() {
        Base64 b64 = new Base64(76, null, false);
        byte[] data = new byte[100];
        Arrays.fill(data, (byte) 'X');
        byte[] encoded = b64.encode(data);
        assertFalse(new String(encoded).contains("\r\n"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_LineSeparatorContainsBase64Char_Throws() {
        new Base64(76, new byte[] { 'A' });
    }

    // ---------------------------------------------------------------
    // isUrlSafe
    // ---------------------------------------------------------------

    @Test
    public void testIsUrlSafe_TrueAndFalse() {
        assertTrue(new Base64(0, Base64.CHUNK_SEPARATOR, true).isUrlSafe());
        assertFalse(new Base64(0, Base64.CHUNK_SEPARATOR, false).isUrlSafe());
    }

    // ---------------------------------------------------------------
    // hasData / avail / setInitialBuffer / readResults
    // ---------------------------------------------------------------

    @Test
    public void testHasDataAndAvail_InitialStateFalseZero() {
        Base64 b64 = new Base64();
        assertFalse(b64.hasData());
        assertEquals(0, b64.avail());
    }

    @Test
    public void testReadResults_NotEofBufferNull_ReturnsZero() {
        Base64 b64 = new Base64();
        assertEquals(0, b64.readResults(new byte[10], 0, 10));
    }

    @Test
    public void testReadResults_EofBufferNull_ReturnsMinusOne() {
        Base64 b64 = new Base64();
        b64.decode(new byte[0], 0, -1); // eof=true, loop never runs, modulus stays 0
        assertEquals(-1, b64.readResults(new byte[10], 0, 10));
    }

    @Test
    public void testReadResults_PartialRead_KeepsBufferAlive() {
        Base64 b64 = new Base64();
        byte[] data = "Hello World! This is test data.".getBytes();
        b64.encode(data, 0, data.length);
        b64.encode(data, 0, -1);
        int avail = b64.avail();
        assertTrue(avail > 1);
        byte[] small = new byte[avail - 1];
        int read = b64.readResults(small, 0, small.length);
        assertEquals(small.length, read);
        assertTrue(b64.hasData()); // readPos < pos ยังไม่หมด
    }

    @Test
    public void testReadResults_FullRead_ClearsBuffer() {
        Base64 b64 = new Base64();
        byte[] data = "abc".getBytes();
        b64.encode(data, 0, data.length);
        b64.encode(data, 0, -1);
        int avail = b64.avail();
        byte[] result = new byte[avail];
        b64.readResults(result, 0, avail);
        assertFalse(b64.hasData());
    }

    @Test
    public void testReadResults_SameBufferReference_ReuseBranch() {
        // ทดสอบ branch: buffer == b (ตัวแปรอาร์เรย์เดียวกัน) -> ล้าง buffer เป็น null โดยไม่ arraycopy
        Base64 b64 = new Base64();
        byte[] buf = new byte[10];
        b64.setInitialBuffer(buf, 0, buf.length);
        int len = b64.readResults(buf, 0, buf.length); // b == buffer ตัวเดียวกัน
        assertEquals(0, len); // ยังไม่มีข้อมูลจริง (pos=readPos=0) แต่ branch ถูกใช้งาน
        assertFalse(b64.hasData());
    }

    @Test
    public void testSetInitialBuffer_LengthMismatch_DoesNotReuseBuffer() {
        Base64 b64 = new Base64();
        byte[] out = new byte[10];
        b64.setInitialBuffer(out, 0, 5); // out.length(10) != outAvail(5) -> ไม่ set buffer
        assertFalse(b64.hasData());
    }

    // ---------------------------------------------------------------
    // resizeBuffer (ทางอ้อมผ่าน encode ตรง ๆ โดยไม่ preallocate)
    // ---------------------------------------------------------------

    @Test
    public void testResizeBuffer_GrowsAndRoundTripsCorrectly() {
        Base64 b64 = new Base64(); // lineLength = 0
        byte[] data = new byte[20000]; // มากกว่า DEFAULT_BUFFER_SIZE(8192) หลายเท่า -> ต้อง resize หลายครั้ง
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        b64.encode(data, 0, data.length);
        b64.encode(data, 0, -1);
        assertTrue(b64.hasData());
        int avail = b64.avail();
        byte[] encoded = new byte[avail];
        int read = b64.readResults(encoded, 0, avail);
        assertEquals(avail, read);
        assertFalse(b64.hasData());

        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(data, decoded);
    }

    // ---------------------------------------------------------------
    // encode(byte[],int,int) - branch: eof already true (no-op)
    // ---------------------------------------------------------------

    @Test
    public void testEncode_AfterEof_IsNoOp() {
        Base64 b64 = new Base64();
        byte[] data = "abc".getBytes();
        b64.encode(data, 0, data.length);
        b64.encode(data, 0, -1); // eof = true
        int availBefore = b64.avail();
        b64.encode(data, 0, data.length); // ต้องถูกข้ามเพราะ eof=true
        assertEquals(availBefore, b64.avail());
    }

    // ---------------------------------------------------------------
    // encode() modulus 0/1/2 (STANDARD table, พร้อม/ไม่พร้อม padding)
    // ---------------------------------------------------------------

    @Test
    public void testEncode_Modulus1_StandardWithDoublePad() {
        assertEquals("Zg==", new String(Base64.encodeBase64("f".getBytes())));
    }

    @Test
    public void testEncode_Modulus2_StandardWithSinglePad() {
        assertEquals("Zm8=", new String(Base64.encodeBase64("fo".getBytes())));
    }

    @Test
    public void testEncode_Modulus0_StandardNoPad() {
        assertEquals("Zm9v", new String(Base64.encodeBase64("foo".getBytes())));
    }

    @Test
    public void testEncode_Modulus1_UrlSafeNoPad() {
        Base64 b64 = new Base64(0, Base64.CHUNK_SEPARATOR, true);
        assertEquals("Zg", new String(b64.encode("f".getBytes())));
    }

    @Test
    public void testEncode_Modulus2_UrlSafeNoPad() {
        Base64 b64 = new Base64(0, Base64.CHUNK_SEPARATOR, true);
        assertEquals("Zm8", new String(b64.encode("fo".getBytes())));
    }

    @Test
    public void testEncode_UrlSafe_TrimsBufferSmaller() {
        Base64 b64 = new Base64(0, Base64.CHUNK_SEPARATOR, true);
        byte[] encoded = b64.encode("f".getBytes());
        // ไม่มี '=' และความยาวเล็กกว่ากรณี standard (4)
        assertFalse(new String(encoded).contains("="));
        assertEquals(2, encoded.length);
    }

    @Test
    public void testEncode_ChunkedTrailingSeparator_LineLengthPositive() {
        // 57 bytes -> exactly 76 base64 chars (perfect chunk) + CRLF ต่อท้าย
        byte[] data = new byte[57];
        Arrays.fill(data, (byte) 'Q');
        byte[] encoded = Base64.encodeBase64Chunked(data);
        String s = new String(encoded);
        assertTrue(s.endsWith("\r\n"));
        assertEquals(76, s.length() - 2);
    }

    // ---------------------------------------------------------------
    // encode(byte[]) null/empty
    // ---------------------------------------------------------------

    @Test
    public void testEncode_NullArray_ReturnsNull() {
        Base64 b64 = new Base64();
        assertNull(b64.encode((byte[]) null));
    }

    @Test
    public void testEncode_EmptyArray_ReturnsEmpty() {
        Base64 b64 = new Base64();
        byte[] result = b64.encode(new byte[0]);
        assertEquals(0, result.length);
    }

    // ---------------------------------------------------------------
    // decode(byte[],int,int) - branch: eof already true (no-op)
    // ---------------------------------------------------------------

    @Test
    public void testDecode_AfterEof_IsNoOp() {
        Base64 b64 = new Base64();
        byte[] data = "Zm9v".getBytes();
        byte[] buf = new byte[10];
        b64.setInitialBuffer(buf, 0, buf.length);
        b64.decode(data, 0, data.length);
        b64.decode(data, 0, -1); // eof=true
        int before = b64.avail();
        b64.decode(data, 0, data.length); // no-op
        assertEquals(before, b64.avail());
    }

    // ---------------------------------------------------------------
    // decode(): PAD encountered -> eof=true + break, ignore ส่วนที่เหลือ
    // ---------------------------------------------------------------

    @Test
    public void testDecode_StopsAtPadCharacter_IgnoresRemainder() {
        Base64 b64 = new Base64();
        byte[] input = "Zg==Zm9v".getBytes(); // หลัง '=' ตัวแรกต้องหยุดทันที
        byte[] buf = new byte[20];
        b64.setInitialBuffer(buf, 0, buf.length);
        b64.decode(input, 0, input.length);
        int avail = b64.avail();
        byte[] result = new byte[avail];
        b64.readResults(result, 0, avail);
        assertArrayEquals("f".getBytes(), result);
    }

    // ---------------------------------------------------------------
    // decode(): ข้าม byte ที่ไม่ถูกต้อง (negative / out-of-range positive)
    // ---------------------------------------------------------------

    @Test
    public void testDecode_SkipsNegativeByteValue() {
        Base64 b64 = new Base64();
        byte[] input = new byte[] { 'Z', (byte) 200, 'g' }; // (byte)200 = -56 (negative)
        byte[] buf = new byte[10];
        b64.setInitialBuffer(buf, 0, buf.length);
        b64.decode(input, 0, input.length);
        b64.decode(input, 0, -1);
        byte[] result = new byte[b64.avail()];
        b64.readResults(result, 0, result.length);
        assertArrayEquals("f".getBytes(), result);
    }

    @Test
    public void testDecode_SkipsOutOfRangePositiveByte() {
        Base64 b64 = new Base64();
        byte[] input = new byte[] { 'Z', 125, 'g' }; // 125 >=0 แต่ >= DECODE_TABLE.length
        byte[] buf = new byte[10];
        b64.setInitialBuffer(buf, 0, buf.length);
        b64.decode(input, 0, input.length);
        b64.decode(input, 0, -1);
        byte[] result = new byte[b64.avail()];
        b64.readResults(result, 0, result.length);
        assertArrayEquals("f".getBytes(), result);
    }

    @Test
    public void testDecode_IgnoresWhitespaceAndInvalidChars() {
        byte[] decoded = Base64.decodeBase64("Zm 9v\r\n".getBytes());
        assertArrayEquals("foo".getBytes(), decoded);
    }

    // ---------------------------------------------------------------
    // decode(): modulus remainder 2 / 3 ที่ EOF (ไม่มี padding)
    // ---------------------------------------------------------------

    @Test
    public void testDecode_RemainderModulus2_NoPadding() {
        byte[] decoded = Base64.decodeBase64("Zg".getBytes());
        assertArrayEquals("f".getBytes(), decoded);
    }

    @Test
    public void testDecode_RemainderModulus3_NoPadding() {
        byte[] decoded = Base64.decodeBase64("Zm8".getBytes());
        assertArrayEquals("fo".getBytes(), decoded);
    }

    // ---------------------------------------------------------------
    // decode(byte[]) null/empty (reference identity ตามซอร์ส)
    // ---------------------------------------------------------------

    @Test
    public void testDecode_NullArray_ReturnsSameNullReference() {
        Base64 b64 = new Base64();
        assertNull(b64.decode((byte[]) null));
    }

    @Test
    public void testDecode_EmptyArray_ReturnsSameReference() {
        Base64 b64 = new Base64();
        byte[] empty = new byte[0];
        assertSame(empty, b64.decode(empty));
    }

    @Test
    public void testDecode_StringVsByteArray_Equivalent() {
        byte[] fromBytes = new Base64().decode("Zm9v".getBytes());
        byte[] fromString = new Base64().decode("Zm9v");
        assertArrayEquals(fromBytes, fromString);
    }

    // ---------------------------------------------------------------
    // decode(Object) / encode(Object)
    // ---------------------------------------------------------------

    @Test
    public void testDecodeObject_ByteArray() throws DecoderException {
        Object result = new Base64().decode((Object) "Zm9v".getBytes());
        assertArrayEquals("foo".getBytes(), (byte[]) result);
    }

    @Test
    public void testDecodeObject_String() throws DecoderException {
        Object result = new Base64().decode((Object) "Zm9v");
        assertArrayEquals("foo".getBytes(), (byte[]) result);
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObject_InvalidType_Throws() throws DecoderException {
        new Base64().decode((Object) Integer.valueOf(5));
    }

    @Test
    public void testEncodeObject_ByteArray() throws EncoderException {
        Object result = new Base64().encode((Object) "foo".getBytes());
        assertEquals("Zm9v", new String((byte[]) result));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_InvalidType_Throws() throws EncoderException {
        new Base64().encode((Object) Integer.valueOf(5));
    }

    @Test
    public void testEncodeToString() {
        String s = new Base64().encodeToString("foo".getBytes());
        assertEquals("Zm9v", s);
    }

    // ---------------------------------------------------------------
    // isBase64(byte) - boundary
    // ---------------------------------------------------------------

    @Test
    public void testIsBase64_PadCharacter_True() {
        assertTrue(Base64.isBase64((byte) '='));
    }

    @Test
    public void testIsBase64_ValidLetter_True() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) 'z')); // boundary บนของ DECODE_TABLE ที่ valid
    }

    @Test
    public void testIsBase64_NegativeByte_False() {
        assertFalse(Base64.isBase64((byte) -1));
    }

    @Test
    public void testIsBase64_OutOfRangePositive_False() {
        assertFalse(Base64.isBase64((byte) 127)); // >= DECODE_TABLE.length
    }

    @Test
    public void testIsBase64_WhitespaceChar_False() {
        assertFalse(Base64.isBase64((byte) ' ')); // ในตารางแต่ค่า -1
    }

    // ---------------------------------------------------------------
    // isArrayByteBase64(byte[])
    // ---------------------------------------------------------------

    @Test
    public void testIsArrayByteBase64_Empty_True() {
        assertTrue(Base64.isArrayByteBase64(new byte[0]));
    }

    @Test
    public void testIsArrayByteBase64_AllValid_True() {
        assertTrue(Base64.isArrayByteBase64("Zm9v".getBytes()));
    }

    @Test
    public void testIsArrayByteBase64_WithWhitespace_True() {
        assertTrue(Base64.isArrayByteBase64("Zm 9v\r\n".getBytes()));
    }

    @Test
    public void testIsArrayByteBase64_InvalidChar_False() {
        assertFalse(Base64.isArrayByteBase64("Zm9v!".getBytes()));
    }

    // ---------------------------------------------------------------
    // discardWhitespace
    // ---------------------------------------------------------------

    @Test
    public void testDiscardWhitespace_RemovesSpacesTabsCrLf() {
        byte[] input = "A B\tC\rD\nE".getBytes();
        byte[] result = Base64.discardWhitespace(input);
        assertEquals("ABCDE", new String(result));
    }

    @Test
    public void testDiscardWhitespace_NoWhitespace_Unchanged() {
        byte[] input = "ABCDE".getBytes();
        byte[] result = Base64.discardWhitespace(input);
        assertEquals("ABCDE", new String(result));
    }

    // ---------------------------------------------------------------
    // static encodeBase64* variants
    // ---------------------------------------------------------------

    @Test
    public void testStaticEncodeBase64_NullReturnsNull() {
        assertNull(Base64.encodeBase64(null));
    }

    @Test
    public void testStaticEncodeBase64_EmptyReturnsSameReference() {
        byte[] empty = new byte[0];
        assertSame(empty, Base64.encodeBase64(empty));
    }

    @Test
    public void testEncodeBase64_NotChunked() {
        byte[] data = new byte[100];
        Arrays.fill(data, (byte) 'A');
        byte[] encoded = Base64.encodeBase64(data, false);
        assertFalse(new String(encoded).contains("\r\n"));
    }

    @Test
    public void testEncodeBase64_Chunked() {
        byte[] data = new byte[100];
        Arrays.fill(data, (byte) 'A');
        byte[] encoded = Base64.encodeBase64(data, true);
        assertTrue(new String(encoded).contains("\r\n"));
    }

    @Test
    public void testEncodeBase64String_ChunkedString() {
        byte[] data = new byte[100];
        Arrays.fill(data, (byte) 'A');
        String s = Base64.encodeBase64String(data);
        assertTrue(s.contains("\r\n"));
    }

    @Test
    public void testEncodeBase64URLSafe_NoPaddingNoPlusSlash() {
        byte[] data = "f".getBytes();
        byte[] encoded = Base64.encodeBase64URLSafe(data);
        assertEquals("Zg", new String(encoded));
    }

    @Test
    public void testEncodeBase64URLSafeString() {
        byte[] data = "f".getBytes();
        String s = Base64.encodeBase64URLSafeString(data);
        assertEquals("Zg", s);
    }

    @Test
    public void testEncodeBase64Chunked() {
        byte[] data = new byte[100];
        Arrays.fill(data, (byte) 'A');
        byte[] encoded = Base64.encodeBase64Chunked(data);
        assertTrue(new String(encoded).contains("\r\n"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64_MaxResultSizeExceeded_Throws() {
        byte[] data = new byte[1000];
        Base64.encodeBase64(data, false, false, 10);
    }

    @Test
    public void testDecodeBase64_String() {
        assertArrayEquals("foo".getBytes(), Base64.decodeBase64("Zm9v"));
    }

    @Test
    public void testDecodeBase64_ByteArray() {
        assertArrayEquals("foo".getBytes(), Base64.decodeBase64("Zm9v".getBytes()));
    }

    // ---------------------------------------------------------------
    // encodeInteger / decodeInteger / toIntegerBytes
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testEncodeInteger_Null_Throws() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testEncodeDecodeInteger_RoundTrip_LargePositive() {
        BigInteger original = new BigInteger("123456789012345678901234567890");
        byte[] encoded = Base64.encodeInteger(original);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(original, decoded);
    }

    @Test
    public void testToIntegerBytes_Zero_EmptyArray() {
        // bitLength=0 -> (0%8==0) branch: startSrc=1,len-- -> ผลลัพธ์ว่าง
        byte[] result = Base64.toIntegerBytes(BigInteger.ZERO);
        assertArrayEquals(new byte[0], result);
    }

    @Test
    public void testToIntegerBytes_OddBitLength_ReturnsRawBytes() {
        // bitLength=1 (%8 != 0) -> เข้า branch return bigBytes ตรง ๆ
        byte[] result = Base64.toIntegerBytes(BigInteger.ONE);
        assertArrayEquals(new byte[] { 1 }, result);
    }

    @Test
    public void testToIntegerBytes_ByteAligned_StripsSignByte() {
        // bitLength=8 (%8==0) -> ตัด byte เครื่องหมายนำหน้าออก
        BigInteger bigInt = new BigInteger("128");
        byte[] result = Base64.toIntegerBytes(bigInt);
        assertArrayEquals(new byte[] { (byte) 128 }, result);
    }

    // ---------------------------------------------------------------
    // Basic round-trip sanity (fault-detection)
    // ---------------------------------------------------------------

    @Test
    public void testRoundTrip_TypicalString_Standard() {
        String original = "Hello, World! Base64 test 123.";
        byte[] encoded = Base64.encodeBase64(original.getBytes());
        byte[] decoded = Base64.decodeBase64(encoded);
        assertEquals(original, new String(decoded));
    }

    @Test
    public void testRoundTrip_TypicalString_UrlSafe() {
        String original = "Hello, World! Base64 test 123.";
        byte[] encoded = Base64.encodeBase64URLSafe(original.getBytes());
        byte[] decoded = Base64.decodeBase64(encoded);
        assertEquals(original, new String(decoded));
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `test*Constructor*` | `lineSeparator == null` (true/false), `lineLength > 0` (round-down /4*4, ≤0), `containsBase64Byte` → throw/ไม่throw, `urlSafe` true/false |
| `testIsUrlSafe_*` | `encodeTable == URL_SAFE_ENCODE_TABLE` true/false |
| `testHasDataAndAvail_*`, `testReadResults_*` | `buffer != null` true/false, `eof ? -1 : 0`, `buffer != b` true/false (reuse branch), `readPos >= pos` true/false |
| `testSetInitialBuffer_*` | `out.length == outAvail` true/false |
| `testResizeBuffer_*` | `buffer == null` (create) / `buffer != null` (double ขนาด), loop หลายรอบ |
| `testEncode_AfterEof_IsNoOp` | `if (eof) return;` ของ `encode()` |
| `testEncode_Modulus0/1/2_*` | `switch(modulus)` case 1/2/default, `encodeTable == STANDARD_ENCODE_TABLE` true/false |
| `testEncode_ChunkedTrailingSeparator_*` | `lineLength > 0 && pos > 0`, `lineLength <= currentLinePos` |
| `testEncode_NullArray/EmptyArray` | `pArray == null \|\| pArray.length == 0` true |
| `testEncode_UrlSafe_TrimsBufferSmaller` | `isUrlSafe() && pos < buf.length` true |
| `testDecode_AfterEof_IsNoOp` | `if (eof) return;` ของ `decode()` |
| `testDecode_StopsAtPadCharacter_*` | `b == PAD` → break + finalize block `eof && modulus != 0` case 2 |
| `testDecode_SkipsNegativeByteValue`, `testDecode_SkipsOutOfRangePositiveByte` | `b >= 0 && b < DECODE_TABLE.length` false (สองกรณี) |
| `testDecode_IgnoresWhitespaceAndInvalidChars` | `result >= 0` false (skip), normal `modulus == 0` write path |
| `testDecode_RemainderModulus2/3_NoPadding` | finalize `switch(modulus)` case 2 / case 3 |
| `testDecode_NullArray/EmptyArray` | `pArray == null \|\| pArray.length == 0` true (reference identity) |
| `testDecodeObject_*`, `testEncodeObject_*` | `instanceof byte[]`, `instanceof String`, else → Exception |
| `testIsBase64_*` | `octet == PAD`, `octet >= 0`, `octet < DECODE_TABLE.length`, `DECODE_TABLE[octet] != -1` ทุกสาขา |
| `testIsArrayByteBase64_*` | loop 0 รอบ (empty=true), valid, whitespace(`isWhiteSpace` true), invalid → false |
| `testDiscardWhitespace_*` | `switch` default vs whitespace cases |
| `testStaticEncodeBase64_*`, `testEncodeBase64_*` | `binaryData == null \|\| length==0`, `isChunked` true/false, `urlSafe` true/false, `len > maxResultSize` throw |
| `testDecodeBase64_*` | delegation String/byte[] |
| `testEncodeInteger_Null_Throws` | `bigInt == null` throw |
| `testToIntegerBytes_*` | `bitLength % 8 != 0` (return ตรง), `bitLength % 8 == 0` (ตัด sign byte) — ครอบคลุมทั้งสองสาขาหลักของเมธอดนี้ |
| `testRoundTrip_*` | integration sanity เพื่อดักจับ fault เชิงตรรกะโดยรวม |

**ข้อสังเกต/คอมเมนต์กำกับ (ไม่เดา behavior เกินซอร์ส):**
- Branch `buffer == b` แบบ "reuse" ใน `readResults` ไม่ถูกเรียกจาก public API (`encode(byte[])`/`decode(byte[])`) จริง เพราะ object reference ที่ส่งเข้าไปต่างกันเสมอ — จึงทดสอบตรงผ่าน package-private method เพื่อให้ branch ถูก exercise
- ค่า `DECODE_TABLE.length` คำนวณจากการนับสมาชิกในซอร์ส (=123) เพื่อเลือกค่า boundary (122 valid, 125/127 invalid) — ระบุไว้เป็นคอมเมนต์ในโค้ด