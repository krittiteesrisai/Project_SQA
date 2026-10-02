# Base64Test.java

```java
package org.apache.commons.codec.binary;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Test;

/**
 * JUnit 4 test suite for org.apache.commons.codec.binary.Base64 (Codec-2b)
 *
 * หมายเหตุ: คลาสทดสอบนี้อยู่ใน package เดียวกับคลาสเป้าหมาย (org.apache.commons.codec.binary)
 * เพื่อให้สามารถเข้าถึง package-private methods (encode(byte[],int,int), decode(byte[],int,int),
 * hasData(), avail(), readResults(), setInitialBuffer(), discardWhitespace(), discardNonBase64())
 * ซึ่งจำเป็นสำหรับการทดสอบ branch ภายในให้ครอบคลุมที่สุด
 */
public class Base64Test {

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructor_NotUrlSafe() {
        Base64 b64 = new Base64();
        assertFalse(b64.isUrlSafe());
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
    public void testLineLengthConstructor_NoException() {
        Base64 b64 = new Base64(10);
        assertFalse(b64.isUrlSafe());
    }

    @Test
    public void testLineLengthAndSeparatorConstructor_ValidSeparator() {
        // '\r','\n' ไม่ใช่ base64 char -> ไม่ throw
        Base64 b64 = new Base64(76, new byte[] { '\r', '\n' });
        assertNotNull(b64);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_InvalidLineSeparator_ContainsBase64Char() {
        // 'A' เป็น base64 character -> ต้อง throw IllegalArgumentException
        new Base64(76, new byte[] { 'A' });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_InvalidLineSeparator_ContainsPadChar() {
        // PAD ('=') ถูกนับเป็น base64 byte ด้วย (isBase64 คืน true เมื่อ octet==PAD)
        new Base64(76, new byte[] { '=' });
    }

    // ---------- isBase64 / isArrayByteBase64 ----------

    @Test
    public void testIsBase64_ValidChars() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) '+'));
        assertTrue(Base64.isBase64((byte) '/'));
        assertTrue(Base64.isBase64((byte) '=')); // PAD
    }

    @Test
    public void testIsBase64_InvalidChars() {
        assertFalse(Base64.isBase64((byte) '!'));
        assertFalse(Base64.isBase64((byte) -1)); // negative -> false branch
    }

    @Test
    public void testIsArrayByteBase64_EmptyArray() {
        assertTrue(Base64.isArrayByteBase64(new byte[0]));
    }

    @Test
    public void testIsArrayByteBase64_ValidWithWhitespace() {
        byte[] arr = { 'A', ' ', '\n', '\r', '\t', 'B' };
        assertTrue(Base64.isArrayByteBase64(arr));
    }

    @Test
    public void testIsArrayByteBase64_InvalidChar() {
        byte[] arr = { 'A', '!' };
        assertFalse(Base64.isArrayByteBase64(arr));
    }

    // ---------- encodeBase64 / decodeBase64 static, null/empty ----------

    @Test
    public void testEncodeBase64_NullInput() {
        assertNull(Base64.encodeBase64(null));
    }

    @Test
    public void testEncodeBase64_EmptyInput() {
        byte[] empty = new byte[0];
        assertSame(empty, Base64.encodeBase64(empty));
    }

    @Test
    public void testDecodeBase64_NullInput() {
        assertNull(Base64.decodeBase64(null));
    }

    @Test
    public void testDecodeBase64_EmptyInput() {
        byte[] empty = new byte[0];
        assertSame(empty, Base64.decodeBase64(empty));
    }

    // ---------- Round-trip: standard encode/decode ----------

    @Test
    public void testEncodeDecode_ModulusOne_SingleByte() {
        byte[] data = "M".getBytes(); // 1 byte -> modulus 1 case in encode()
        byte[] encoded = Base64.encodeBase64(data);
        assertArrayEquals("TQ==".getBytes(), encoded);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncodeDecode_ModulusTwo_TwoBytes() {
        byte[] data = "Ma".getBytes(); // 2 bytes -> modulus 2 case in encode()
        byte[] encoded = Base64.encodeBase64(data);
        assertArrayEquals("TWE=".getBytes(), encoded);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncodeDecode_ModulusZero_ThreeBytes() {
        byte[] data = "Man".getBytes(); // 3 bytes -> modulus 0, no padding needed
        byte[] encoded = Base64.encodeBase64(data);
        assertArrayEquals("TWFu".getBytes(), encoded);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(data, decoded);
    }

    // ---------- decode(): eof via '=' pad char (break) and via '-1' without padding ----------

    @Test
    public void testDecode_PadCausesBreak_IgnoresTrailingGarbage() {
        // "TQ==XYZ" -> ต้อง eof ทันทีที่พบ '=' ตัวแรก และไม่ decode ต่อ "XYZ"
        byte[] input = "TQ==XYZ".getBytes();
        byte[] decoded = Base64.decodeBase64(input);
        assertArrayEquals("M".getBytes(), decoded);
    }

    @Test
    public void testDecode_ModulusTwoAtEof_NoPadding() {
        // "TQ" ไม่มี padding เลย -> ทดสอบ eof-case 2 ใน decode()
        byte[] decoded = Base64.decodeBase64("TQ".getBytes());
        assertArrayEquals(new byte[] { 'M' }, decoded);
    }

    @Test
    public void testDecode_ModulusThreeAtEof_NoPadding() {
        // "TWE" ไม่มี padding เลย -> ทดสอบ eof-case 3 ใน decode()
        byte[] decoded = Base64.decodeBase64("TWE".getBytes());
        assertArrayEquals("Ma".getBytes(), decoded);
    }

    @Test
    public void testDecode_IgnoresInvalidCharacters() {
        // '@','#' ไม่อยู่ใน base64 alphabet -> DECODE_TABLE[b] == -1 -> ถูก skip
        byte[] input = "T@W#F$u".getBytes();
        byte[] decoded = Base64.decodeBase64(input);
        assertArrayEquals("Man".getBytes(), decoded);
    }

    // ---------- URL-SAFE mode ----------

    @Test
    public void testEncodeBase64URLSafe_UsesDashUnderscore_NoSlashPlus() {
        // ทุกไบต์เป็น 0xFF -> ทุก 6-bit group = 63 -> standard: '/', urlSafe: '_'
        byte[] data = { (byte) 0xFF, (byte) 0xFF, (byte) 0xFF };
        byte[] std = Base64.encodeBase64(data);
        byte[] urlSafe = Base64.encodeBase64URLSafe(data);

        assertArrayEquals("////".getBytes(), std);
        assertArrayEquals("____".getBytes(), urlSafe);

        // ทั้งสองต้อง decode กลับมาเป็นข้อมูลเดิมเหมือนกัน (decoder รองรับทั้งสองแบบ)
        assertArrayEquals(data, Base64.decodeBase64(std));
        assertArrayEquals(data, Base64.decodeBase64(urlSafe));
    }

    @Test
    public void testEncodeBase64URLSafe_NoPaddingForModulusOne() {
        byte[] data = "M".getBytes();
        byte[] urlSafe = Base64.encodeBase64URLSafe(data);
        // URL-SAFE ไม่ใส่ padding '='
        for (byte b : urlSafe) {
            assertNotEquals('=', b);
        }
        assertArrayEquals(data, Base64.decodeBase64(urlSafe));
    }

    @Test
    public void testEncodeBase64URLSafe_NoPaddingForModulusTwo() {
        byte[] data = "Ma".getBytes();
        byte[] urlSafe = Base64.encodeBase64URLSafe(data);
        for (byte b : urlSafe) {
            assertNotEquals('=', b);
        }
        assertArrayEquals(data, Base64.decodeBase64(urlSafe));
    }

    // ---------- Chunked encode ----------

    @Test
    public void testEncodeBase64Chunked_ShortInput_TrailingSeparator() {
        byte[] data = "Man".getBytes();
        byte[] chunked = Base64.encodeBase64Chunked(data);
        // ตามโค้ด: เมื่อ eof จะ append lineSeparator เสมอถ้า lineLength>0 (ไม่ว่า modulus จะเป็นเท่าไร)
        assertArrayEquals("TWFu\r\n".getBytes(), chunked);
    }

    @Test
    public void testEncodeBase64Chunked_LongInput_ContainsSeparatorMidStream() {
        byte[] data = new byte[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }
        byte[] chunked = Base64.encodeBase64Chunked(data);
        String s = new String(chunked);
        assertTrue("expect CRLF chunk separator to appear", s.contains("\r\n"));
        // round-trip ต้องได้ข้อมูลเดิม แม้จะมี CRLF แทรกอยู่ (decoder ignore ตัวอักษรที่ไม่ใช่ base64)
        assertArrayEquals(data, Base64.decodeBase64(chunked));
    }

    // ---------- encodeBase64(byte[], boolean) / (byte[], boolean, boolean) ----------

    @Test
    public void testEncodeBase64_IsChunkedFalse_SameAsPlain() {
        byte[] data = "Man".getBytes();
        assertArrayEquals(Base64.encodeBase64(data), Base64.encodeBase64(data, false));
    }

    @Test
    public void testEncodeBase64_IsChunkedTrue_SameAsChunked() {
        byte[] data = "Man".getBytes();
        assertArrayEquals(Base64.encodeBase64Chunked(data), Base64.encodeBase64(data, true));
    }

    @Test
    public void testEncodeBase64_UrlSafeFlag() {
        byte[] data = { (byte) 0xFF, (byte) 0xFF, (byte) 0xFF };
        byte[] result = Base64.encodeBase64(data, false, true);
        assertArrayEquals("____".getBytes(), result);
    }

    // ---------- Object-based Encoder/Decoder interface ----------

    @Test
    public void testEncodeObject_ValidByteArray() throws EncoderException {
        Base64 b64 = new Base64();
        Object result = b64.encode((Object) "Man".getBytes());
        assertArrayEquals("TWFu".getBytes(), (byte[]) result);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_InvalidType_ThrowsEncoderException() throws EncoderException {
        Base64 b64 = new Base64();
        b64.encode((Object) "not a byte array");
    }

    @Test
    public void testDecodeObject_ValidByteArray() throws DecoderException {
        Base64 b64 = new Base64();
        Object result = b64.decode((Object) "TWFu".getBytes());
        assertArrayEquals("Man".getBytes(), (byte[]) result);
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObject_InvalidType_ThrowsDecoderException() throws DecoderException {
        Base64 b64 = new Base64();
        b64.decode((Object) "not a byte array");
    }

    @Test
    public void testInstanceEncode_MatchesStaticEncodeBase64() {
        Base64 b64 = new Base64(true); // urlSafe
        byte[] data = { (byte) 0xFF, (byte) 0xFF, (byte) 0xFF };
        assertArrayEquals(Base64.encodeBase64(data, false, true), b64.encode(data));
    }

    @Test
    public void testInstanceDecode_MatchesStaticDecodeBase64() {
        Base64 b64 = new Base64();
        byte[] data = "TWFu".getBytes();
        assertArrayEquals(Base64.decodeBase64(data), b64.decode(data));
    }

    // ---------- discardWhitespace / discardNonBase64 ----------

    @Test
    public void testDiscardWhitespace_RemovesSpacesNewlinesTabsCR() {
        byte[] input = " T Q\n=\r=\t".getBytes();
        byte[] result = Base64.discardWhitespace(input);
        assertArrayEquals("TQ==".getBytes(), result);
    }

    @Test
    public void testDiscardWhitespace_EmptyInput() {
        byte[] result = Base64.discardWhitespace(new byte[0]);
        assertArrayEquals(new byte[0], result);
    }

    @Test
    public void testDiscardNonBase64_RemovesNonAlphabetChars() {
        byte[] input = "T@Q#=$".getBytes();
        byte[] result = Base64.discardNonBase64(input);
        assertArrayEquals("TQ=".getBytes(), result);
    }

    // ---------- encodeInteger / decodeInteger / toIntegerBytes (indirect) ----------

    @Test(expected = NullPointerException.class)
    public void testEncodeInteger_NullThrowsNPE() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testEncodeDecodeInteger_Zero() {
        BigInteger original = BigInteger.ZERO;
        byte[] encoded = Base64.encodeInteger(original);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(original, decoded);
    }

    @Test
    public void testEncodeDecodeInteger_One_EarlyReturnBranch() {
        // bitLength()=1 -> เข้าเงื่อนไข early-return ของ toIntegerBytes
        BigInteger original = BigInteger.ONE;
        byte[] encoded = Base64.encodeInteger(original);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(original, decoded);
    }

    @Test
    public void testEncodeDecodeInteger_255_SignBitStrip() {
        // bitLength()=8, toByteArray มี leading zero byte -> ทดสอบ branch strip sign
        BigInteger original = BigInteger.valueOf(255);
        byte[] encoded = Base64.encodeInteger(original);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(original, decoded);
    }

    @Test
    public void testEncodeDecodeInteger_256() {
        BigInteger original = BigInteger.valueOf(256);
        byte[] encoded = Base64.encodeInteger(original);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(original, decoded);
    }

    @Test
    public void testEncodeDecodeInteger_65535() {
        BigInteger original = BigInteger.valueOf(65535);
        byte[] encoded = Base64.encodeInteger(original);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(original, decoded);
    }

    @Test
    public void testEncodeDecodeInteger_LargeValue() {
        BigInteger original = new BigInteger("123456789012345678901234567890");
        byte[] encoded = Base64.encodeInteger(original);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(original, decoded);
    }

    // ---------- Package-private streaming API: hasData/avail/readResults/setInitialBuffer ----------

    @Test
    public void testHasDataAvail_InitiallyEmpty() {
        Base64 b64 = new Base64();
        assertFalse(b64.hasData());
        assertEquals(0, b64.avail());
    }

    @Test
    public void testSetInitialBuffer_LengthMismatch_DoesNotReuse() {
        Base64 b64 = new Base64();
        byte[] out = new byte[10];
        b64.setInitialBuffer(out, 0, 5); // out.length(10) != outAvail(5) -> condition false
        assertFalse(b64.hasData());
    }

    @Test
    public void testSetInitialBuffer_LengthMatches_Reuses() {
        Base64 b64 = new Base64();
        byte[] out = new byte[10];
        b64.setInitialBuffer(out, 0, out.length); // length matches -> buf reused
        assertTrue(b64.hasData());
        assertEquals(0, b64.avail());
    }

    @Test
    public void testEncode_EofShortCircuit_SecondCallReturnsImmediately() {
        Base64 b64 = new Base64();
        b64.encode("Man".getBytes(), 0, 3);
        b64.encode(null, 0, -1); // eof = true
        int availBefore = b64.avail();
        // เรียกซ้ำหลัง eof=true -> ต้อง return ทันที ไม่มีการเปลี่ยน state
        b64.encode(null, 0, -1);
        assertEquals(availBefore, b64.avail());
    }

    @Test
    public void testDecode_EofShortCircuit_SecondCallReturnsImmediately() {
        Base64 b64 = new Base64();
        b64.decode("TWFu".getBytes(), 0, 4);
        b64.decode(null, 0, -1); // eof = true
        int availBefore = b64.avail();
        b64.decode(null, 0, -1); // ต้อง return ทันที
        assertEquals(availBefore, b64.avail());
    }

    @Test
    public void testReadResults_BufNullAndEof_ReturnsMinusOne() {
        Base64 b64 = new Base64();
        // inAvail = -1 ทำให้ for-loop ไม่ execute เลย และ buf ยังเป็น null
        b64.decode(new byte[0], 0, -1);
        byte[] out = new byte[5];
        int n = b64.readResults(out, 0, 5);
        assertEquals(-1, n);
    }

    @Test
    public void testReadResults_PartialReads_BothBranches() {
        Base64 b64 = new Base64(0, Base64.CHUNK_SEPARATOR, false); // no chunking, predictable output
        b64.encode("Man".getBytes(), 0, 3);
        b64.encode(null, 0, -1); // eof, flush -> buf ควรมี "TWFu" (4 bytes)

        assertEquals(4, b64.avail());

        byte[] part1 = new byte[2];
        int n1 = b64.readResults(part1, 0, 2);
        assertEquals(2, n1);
        // ยังมีข้อมูลเหลือ -> readPos < pos -> buf ไม่ถูก set เป็น null
        assertTrue(b64.hasData());

        byte[] part2 = new byte[2];
        int n2 = b64.readResults(part2, 0, 2);
        assertEquals(2, n2);
        // อ่านหมดแล้ว -> readPos >= pos -> buf ถูก set เป็น null
        assertFalse(b64.hasData());

        byte[] combined = new byte[4];
        System.arraycopy(part1, 0, combined, 0, 2);
        System.arraycopy(part2, 0, combined, 2, 2);
        assertArrayEquals("TWFu".getBytes(), combined);
    }

    @Test
    public void testResizeBuf_LargeInput_TriggersDoublingBranch() {
        // ไม่ใช้ setInitialBuffer -> เริ่ม buf เป็น null (resizeBuf branch แรก)
        // ข้อมูลใหญ่กว่า initial buffer 8192 -> ต้อง resize (doubling branch)
        Base64 b64 = new Base64();
        byte[] data = new byte[10000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        b64.encode(data, 0, data.length);
        b64.encode(null, 0, -1);
        assertTrue(b64.hasData());
        assertTrue(b64.avail() > 8192); // encoded chunked output ยาวกว่า buffer เริ่มต้นแน่นอน

        byte[] out = new byte[b64.avail()];
        int n = b64.readResults(out, 0, out.length);
        assertEquals(out.length, n);

        byte[] decoded = Base64.decodeBase64(out);
        assertArrayEquals(data, decoded);
    }

    // ---------- Line-length branch: mid-stream separator vs trailing separator vs no separator ----------

    @Test
    public void testEncode_LineLengthBoundary_InsertsSeparatorMidStreamAndTrailing() {
        // lineLength=4 หมายความว่าหลังผลิตครบ 4 ตัวอักษร (3 ไบต์input) ต้องแทรก separator ทันที
        Base64 b64 = new Base64(4, new byte[] { '\n' });
        b64.encode("ABC".getBytes(), 0, 3); // modulus จบที่ 0 -> currentLinePos=4 >= lineLength(4) -> แทรก '\n' ใน loop
        b64.encode(null, 0, -1); // eof: modulus=0 -> switch ไม่ทำอะไร, แต่ lineLength>0 -> แทรก '\n' อีกครั้ง (trailing)

        byte[] out = new byte[b64.avail()];
        b64.readResults(out, 0, out.length);
        assertArrayEquals("QUJD\n\n".getBytes(), out);
    }

    @Test
    public void testEncode_LineLengthZero_NoSeparatorAtAll() {
        Base64 b64 = new Base64(0, new byte[] { '\n' }); // lineLength<=0 -> ไม่มี chunking เลย
        b64.encode("ABC".getBytes(), 0, 3);
        b64.encode(null, 0, -1);

        byte[] out = new byte[b64.avail()];
        b64.readResults(out, 0, out.length);
        assertArrayEquals("QUJD".getBytes(), out); // ไม่มี '\n' เลย
    }
}
```

# สรุปตาราง Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testDefaultConstructor_NotUrlSafe, testUrlSafeConstructor_True/False | constructor delegation, isUrlSafe() true/false path |
| testLineLengthConstructor_NoException, testLineLengthAndSeparatorConstructor_ValidSeparator | constructor `lineLength>0` branch, containsBase64Byte()==false path |
| testConstructor_InvalidLineSeparator_ContainsBase64Char/PadChar | `containsBase64Byte()==true` → throw IllegalArgumentException, isBase64 PAD-check |
| testIsBase64_ValidChars/InvalidChars | isBase64: octet==PAD, in-range valid/invalid, negative octet branch |
| testIsArrayByteBase64_* | loop ทุก element, isWhiteSpace true/false branch, early return false |
| testEncodeBase64_NullInput/EmptyInput, testDecodeBase64_NullInput/EmptyInput | null/empty input branch (`binaryData==null || length==0`) |
| testEncodeDecode_ModulusOne/Two/Zero | encode() switch case 1, case 2, และ modulus==0 ปกติ (main loop) |
| testDecode_PadCausesBreak, testDecode_ModulusTwo/ThreeAtEof, testDecode_IgnoresInvalidCharacters | decode(): PAD→break, eof-case 2/3, DECODE_TABLE[-1] skip branch |
| testEncodeBase64URLSafe_* | urlSafe encodeTable ↔ STANDARD_ENCODE_TABLE branch, padding skip branch (`encodeTable==STANDARD_ENCODE_TABLE`) |
| testEncodeBase64Chunked_ShortInput/LongInput | eof-trailing separator branch, mid-stream `lineLength<=currentLinePos` branch |
| testEncodeBase64_IsChunkedFalse/True/UrlSafeFlag | encodeBase64(data,isChunked,urlSafe) overload dispatch |
| testEncodeObject_*/testDecodeObject_* | instanceof byte[] true/false → EncoderException/DecoderException branch |
| testInstanceEncode/DecodeMatchesStatic | encode(byte[])/decode(byte[]) delegation |
| testDiscardWhitespace_*, testDiscardNonBase64_* | switch-case whitespace ทุก case, isBase64 filter loop |
| testEncodeInteger_NullThrowsNPE | NullPointerException branch ใน encodeInteger |
| testEncodeDecodeInteger_* (Zero/One/255/256/65535/Large) | toIntegerBytes: early-return branch (`bitLength%8!=0 && ...`) และ sign-strip branch (`bitLength%8==0`) |
| testHasDataAvail_InitiallyEmpty | avail()/hasData() เมื่อ buf==null |
| testSetInitialBuffer_LengthMismatch/Match | setInitialBuffer(): `out!=null && out.length==outAvail` true/false |
| testEncode/Decode_EofShortCircuit | `if(eof) return;` branch ที่ต้นเมธอด encode()/decode() |
| testReadResults_BufNullAndEof_ReturnsMinusOne | readResults(): buf==null, eof?true/false |
| testReadResults_PartialReads_BothBranches | readResults(): `buf!=b`, `readPos>=pos` true/false |
| testResizeBuf_LargeInput_TriggersDoublingBranch | resizeBuf(): buf==null branch, else-doubling branch |
| testEncode_LineLengthBoundary_* / LineLengthZero_* | encode(): `lineLength>0` true/false, `lineLength<=currentLinePos` true branch ภายใน main loop |

**หมายเหตุ:** กรณี `len > Integer.MAX_VALUE` ใน `encodeBase64(byte[], boolean, boolean)` ไม่ได้ทดสอบ เนื่องจากต้องใช้ array ขนาดใหญ่เกินจริง (หลาย GB) ซึ่งไม่สามารถทดสอบได้จริงในสภาพแวดล้อม unit test ปกติ — ระบุเป็นข้อจำกัดตามข้อกำหนดที่ 4 (ไม่เดา behavior เกินขอบเขตที่ทดสอบได้จริง)