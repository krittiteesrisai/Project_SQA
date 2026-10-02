package org.apache.commons.codec.binary;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.Arrays;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Test;

/**
 * JUnit4 tests for org.apache.commons.codec.binary.Base64 (Codec-5b)
 * วางไว้ใน package เดียวกับ class เป้าหมายเพื่อเข้าถึง package-private methods
 */
public class Base64Test {

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        Base64 b64 = new Base64();
        assertFalse(b64.isUrlSafe());
        // default lineLength = 0 -> ไม่ chunk เมื่อ encode
        byte[] data = "Hello World".getBytes();
        byte[] encoded = b64.encode(data);
        assertFalse(new String(encoded).contains("\r\n"));
    }

    @Test
    public void testUrlSafeTrueConstructor() {
        Base64 b64 = new Base64(true);
        assertTrue(b64.isUrlSafe());
    }

    @Test
    public void testUrlSafeFalseConstructor() {
        Base64 b64 = new Base64(false);
        assertFalse(b64.isUrlSafe());
    }

    @Test
    public void testLineLengthRoundedToMultipleOf4() {
        // lineLength=10 -> (10/4)*4 = 8
        Base64 b64 = new Base64(10);
        byte[] data = new byte[30];
        Arrays.fill(data, (byte) 'A');
        byte[] encoded = b64.encode(data);
        String s = new String(encoded);
        String[] lines = s.split("\r\n");
        // แต่ละบรรทัด (ยกเว้นบรรทัดสุดท้าย) ต้องมีความยาว 8
        for (int i = 0; i < lines.length - 1; i++) {
            assertEquals(8, lines[i].length());
        }
    }

    @Test
    public void testLineLengthZeroOrNegativeDisablesChunking() {
        Base64 b64 = new Base64(0, Base64.CHUNK_SEPARATOR);
        byte[] data = new byte[100];
        Arrays.fill(data, (byte) 'Z');
        byte[] encoded = b64.encode(data);
        assertFalse(new String(encoded).contains("\r\n"));

        Base64 b64Neg = new Base64(-5, Base64.CHUNK_SEPARATOR);
        byte[] encodedNeg = b64Neg.encode(data);
        assertFalse(new String(encodedNeg).contains("\r\n"));
    }

    @Test
    public void testNullLineSeparatorDisablesChunking() {
        // lineSeparator == null -> lineLength ถูกบังคับเป็น 0 ภายใน constructor
        Base64 b64 = new Base64(76, null, false);
        byte[] data = new byte[200];
        Arrays.fill(data, (byte) 'X');
        byte[] encoded = b64.encode(data);
        assertFalse(new String(encoded).contains("\r\n"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLineSeparatorContainsBase64CharThrows() {
        // 'A' เป็น base64 character -> containsBase64Byte ต้อง true -> throw
        new Base64(76, new byte[] { 'A' });
    }

    @Test
    public void testValidLineSeparatorDoesNotThrow() {
        // CRLF ไม่ใช่ base64 character -> ไม่ throw
        Base64 b64 = new Base64(76, new byte[] { '\r', '\n' });
        assertNotNull(b64);
    }

    // ---------------------------------------------------------------
    // isUrlSafe / hasData / avail
    // ---------------------------------------------------------------

    @Test
    public void testHasDataInitiallyFalse() {
        Base64 b64 = new Base64();
        assertFalse(b64.hasData());
        assertEquals(0, b64.avail());
    }

    @Test
    public void testHasDataAfterEncode() {
        Base64 b64 = new Base64();
        b64.encode("A".getBytes(), 0, 1);
        // ยังไม่ flush EOF -> อาจยังไม่มี data พร้อม read เนื่องจาก modulus != 0
        // (ไม่แน่ใจ 100% ว่า buffer ถูก allocate หรือยัง เพราะ resizeBuffer เกิดก่อน check modulus)
        assertTrue(b64.hasData()); // resizeBuffer ถูกเรียกแล้วทำให้ buffer != null
    }

    // ---------------------------------------------------------------
    // setInitialBuffer / readResults (package-private)
    // ---------------------------------------------------------------

    @Test
    public void testSetInitialBufferMatchLength() {
        Base64 b64 = new Base64();
        byte[] out = new byte[10];
        b64.setInitialBuffer(out, 0, 10);
        assertTrue(b64.hasData());
    }

    @Test
    public void testSetInitialBufferOutNull() {
        Base64 b64 = new Base64();
        b64.setInitialBuffer(null, 0, 10);
        assertFalse(b64.hasData());
    }

    @Test
    public void testSetInitialBufferLengthMismatch() {
        Base64 b64 = new Base64();
        byte[] out = new byte[10];
        b64.setInitialBuffer(out, 0, 5); // length != outAvail -> ไม่ set
        assertFalse(b64.hasData());
    }

    @Test
    public void testReadResultsNoBuffer() {
        Base64 b64 = new Base64();
        byte[] out = new byte[5];
        // buffer == null, eof == false -> return 0
        assertEquals(0, b64.readResults(out, 0, 5));
    }

    @Test
    public void testReadResultsNoBufferEofTrue() throws Exception {
        Base64 b64 = new Base64();
        b64.decode(new byte[0], 0, -1); // ทำให้ eof=true โดยไม่มี buffer allocate (inAvail=0 loop ไม่รัน)
        byte[] out = new byte[5];
        assertEquals(-1, b64.readResults(out, 0, 5));
    }

    @Test
    public void testReadResultsSameBufferReference() {
        Base64 b64 = new Base64();
        byte[] out = new byte[10];
        b64.setInitialBuffer(out, 0, 10);
        b64.encode("AB".getBytes(), 0, 2);
        b64.encode("AB".getBytes(), 0, -1);
        // buffer == out (same reference) -> readResults ต้อง set buffer เป็น null หลังอ่านครั้งเดียว
        int len = b64.readResults(out, 0, 10);
        assertTrue(len > 0);
        assertFalse(b64.hasData());
    }

    // ---------------------------------------------------------------
    // encode(byte[],int,int) / decode(byte[],int,int) low-level branches
    // ---------------------------------------------------------------

    @Test
    public void testEncodeAfterEofReturnsImmediately() {
        Base64 b64 = new Base64();
        b64.encode(new byte[] { 1, 2, 3 }, 0, -1); // eof=true
        int posBefore = b64.avail();
        b64.encode(new byte[] { 4, 5, 6 }, 0, 3); // ควรถูก skip เพราะ eof แล้ว
        assertEquals(posBefore, b64.avail());
    }

    @Test
    public void testDecodeAfterEofReturnsImmediately() {
        Base64 b64 = new Base64();
        b64.decode(new byte[] { '=' }, 0, 1); // eof = true (PAD)
        int availBefore = b64.avail();
        b64.decode(new byte[] { 'A', 'B' }, 0, 2); // ถูก skip
        assertEquals(availBefore, b64.avail());
    }

    @Test
    public void testEncodeModulus1Padding() {
        // 1 byte เหลือ -> case 1 ของ switch ใน encode EOF branch, STANDARD table ใส่ PAD 2 ตัว
        byte[] result = Base64.encodeBase64("M".getBytes());
        assertEquals("TQ==", new String(result));
    }

    @Test
    public void testEncodeModulus2Padding() {
        // 2 byte เหลือ -> case 2 ของ switch, STANDARD table ใส่ PAD 1 ตัว
        byte[] result = Base64.encodeBase64("Ma".getBytes());
        assertEquals("TWE=", new String(result));
    }

    @Test
    public void testEncodeModulus0NoPadding() {
        // จำนวน byte หาร 3 ได้พอดี -> ไม่มี case ใน switch (default ไม่ทำอะไร)
        byte[] result = Base64.encodeBase64("Man".getBytes());
        assertEquals("TWFu", new String(result));
    }

    @Test
    public void testEncodeUrlSafeModulus1NoPadding() {
        // URL-SAFE mode: encodeTable != STANDARD_ENCODE_TABLE -> ข้าม PAD
        byte[] result = Base64.encodeBase64URLSafe("M".getBytes());
        assertFalse(new String(result).contains("="));
    }

    @Test
    public void testEncodeUrlSafeModulus2NoPadding() {
        byte[] result = Base64.encodeBase64URLSafe("Ma".getBytes());
        assertFalse(new String(result).contains("="));
    }

    @Test
    public void testEncodeChunkingInsertsSeparator() {
        // ข้อมูลยาวพอที่ทำให้ currentLinePos ถึง lineLength (76) ระหว่าง loop
        byte[] data = new byte[100];
        Arrays.fill(data, (byte) 'Q');
        byte[] encoded = Base64.encodeBase64Chunked(data);
        String s = new String(encoded);
        assertTrue(s.contains("\r\n"));
    }

    @Test
    public void testDecodeIgnoresNonBase64Characters() {
        // '!' , '\n' ไม่อยู่ใน DECODE_TABLE ที่ valid (result == -1) -> ถูกข้าม
        byte[] decoded = Base64.decodeBase64("TWF\n!u".getBytes());
        assertEquals("Man", new String(decoded));
    }

    @Test
    public void testDecodePadBreaksLoopEarly() {
        // '=' ตัวแรกทำให้ eof=true และ break ออกจาก loop ทันที
        byte[] decoded = Base64.decodeBase64("TQ==XYZ".getBytes());
        assertEquals("M", new String(decoded));
    }

    @Test
    public void testDecodeEofModulus2() {
        // สร้างสถานการณ์ modulus==2 ที่ EOF (ไม่มี '=' padding เลย)
        // "TW" คือ 2 base64 char -> modulus 2 -> case 2 ของ switch หลัง loop
        byte[] decoded = Base64.decodeBase64("TW".getBytes());
        assertEquals(1, decoded.length);
    }

    @Test
    public void testDecodeEofModulus3() {
        // "TWF" คือ 3 base64 char -> modulus 3 -> case 3 ของ switch หลัง loop
        byte[] decoded = Base64.decodeBase64("TWF".getBytes());
        assertEquals(2, decoded.length);
    }

    @Test
    public void testDecodeEofModulus0NoExtraOutput() {
        // "TWFu" modulus กลับเป็น 0 พอดี -> ไม่มี extra byte จาก EOF switch
        byte[] decoded = Base64.decodeBase64("TWFu".getBytes());
        assertEquals("Man", new String(decoded));
    }

    @Test
    public void testEncodeDecodeRoundTripLargeDataTriggersResizeBuffer() {
        // ข้อมูลใหญ่กว่า DEFAULT_BUFFER_SIZE(8192) เพื่อกระตุ้น branch resizeBuffer (buffer!=null)
        byte[] data = new byte[20000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        byte[] encoded = Base64.encodeBase64(data);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(data, decoded);
    }

    // ---------------------------------------------------------------
    // isBase64 / isArrayByteBase64 / isWhiteSpace
    // ---------------------------------------------------------------

    @Test
    public void testIsBase64Pad() {
        assertTrue(Base64.isBase64((byte) '='));
    }

    @Test
    public void testIsBase64ValidChar() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) '+'));
        assertTrue(Base64.isBase64((byte) '/'));
    }

    @Test
    public void testIsBase64NegativeByte() {
        // octet < 0 -> false ทันที (ไม่เข้า array lookup)
        assertFalse(Base64.isBase64((byte) -1));
    }

    @Test
    public void testIsBase64OutOfRangeUpper() {
        // octet >= DECODE_TABLE.length (ประมาณ 123) แต่ยังเป็นบวก เช่น 127 ('\u007f')
        assertFalse(Base64.isBase64((byte) 127));
    }

    @Test
    public void testIsBase64InvalidWithinRange() {
        // เช่น '!' (33) อยู่ในช่วง array แต่ DECODE_TABLE คือ -1
        assertFalse(Base64.isBase64((byte) '!'));
    }

    @Test
    public void testIsArrayByteBase64AllValid() {
        assertTrue(Base64.isArrayByteBase64("TWFu".getBytes()));
    }

    @Test
    public void testIsArrayByteBase64WithWhitespace() {
        assertTrue(Base64.isArrayByteBase64("TW Fu\r\n\t".getBytes()));
    }

    @Test
    public void testIsArrayByteBase64Invalid() {
        assertFalse(Base64.isArrayByteBase64("TWF!u".getBytes()));
    }

    @Test
    public void testIsArrayByteBase64EmptyArray() {
        // loop ไม่รันเลย -> return true ตาม javadoc
        assertTrue(Base64.isArrayByteBase64(new byte[0]));
    }

    // ---------------------------------------------------------------
    // decode(Object) / encode(Object)
    // ---------------------------------------------------------------

    @Test
    public void testDecodeObjectByteArray() throws DecoderException {
        Base64 b64 = new Base64();
        Object result = b64.decode((Object) "TWFu".getBytes());
        assertArrayEquals("Man".getBytes(), (byte[]) result);
    }

    @Test
    public void testDecodeObjectString() throws DecoderException {
        Base64 b64 = new Base64();
        Object result = b64.decode((Object) "TWFu");
        assertArrayEquals("Man".getBytes(), (byte[]) result);
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObjectInvalidTypeThrows() throws DecoderException {
        Base64 b64 = new Base64();
        b64.decode((Object) Integer.valueOf(42));
    }

    @Test
    public void testEncodeObjectByteArray() throws EncoderException {
        Base64 b64 = new Base64();
        Object result = b64.encode((Object) "Man".getBytes());
        assertEquals("TWFu", new String((byte[]) result));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectInvalidTypeThrows() throws EncoderException {
        Base64 b64 = new Base64();
        b64.encode((Object) "NotAByteArray");
    }

    // ---------------------------------------------------------------
    // decode(String) / decode(byte[]) / encode(byte[]) / encodeToString
    // ---------------------------------------------------------------

    @Test
    public void testDecodeStringMethod() {
        Base64 b64 = new Base64();
        byte[] result = b64.decode("TWFu");
        assertEquals("Man", new String(result));
    }

    @Test
    public void testDecodeByteArrayNull() {
        Base64 b64 = new Base64();
        byte[] result = b64.decode((byte[]) null);
        assertNull(result);
    }

    @Test
    public void testDecodeByteArrayEmpty() {
        Base64 b64 = new Base64();
        byte[] input = new byte[0];
        byte[] result = b64.decode(input);
        assertSame(input, result); // ตาม source คืน pArray ตัวเดิมกลับไปเลย
    }

    @Test
    public void testEncodeByteArrayNull() {
        Base64 b64 = new Base64();
        byte[] result = b64.encode((byte[]) null);
        assertNull(result);
    }

    @Test
    public void testEncodeByteArrayEmpty() {
        Base64 b64 = new Base64();
        byte[] input = new byte[0];
        byte[] result = b64.encode(input);
        assertSame(input, result);
    }

    @Test
    public void testEncodeToString() {
        Base64 b64 = new Base64();
        String result = b64.encodeToString("Man".getBytes());
        assertEquals("TWFu", result);
    }

    @Test
    public void testEncodeUrlSafeSmallerBufferBranch() {
        // isUrlSafe() true และ pos < buf.length -> ต้อง trim buffer ให้เล็กลง (ไม่มี '=' เก็บที่)
        Base64 b64 = new Base64(0, Base64.CHUNK_SEPARATOR, true);
        byte[] result = b64.encode("M".getBytes()); // modulus 1 -> ปกติ STANDARD จะมี "==" 2 ตัว แต่ url-safe ไม่มี
        assertFalse(new String(result).contains("="));
        assertEquals(2, result.length); // "TQ" ไม่มี padding
    }

    // ---------------------------------------------------------------
    // Static encodeBase64* / decodeBase64*
    // ---------------------------------------------------------------

    @Test
    public void testEncodeBase64StaticNullAndEmpty() {
        assertNull(Base64.encodeBase64(null));
        byte[] empty = new byte[0];
        assertSame(empty, Base64.encodeBase64(empty));
    }

    @Test
    public void testEncodeBase64StringHelper() {
        String result = Base64.encodeBase64String("Man".getBytes());
        assertEquals("TWFu", result);
    }

    @Test
    public void testEncodeBase64URLSafeStringHelper() {
        String result = Base64.encodeBase64URLSafeString("M".getBytes());
        assertFalse(result.contains("="));
    }

    @Test
    public void testEncodeBase64ChunkedHelper() {
        byte[] data = new byte[100];
        Arrays.fill(data, (byte) 'Z');
        byte[] result = Base64.encodeBase64Chunked(data);
        assertTrue(new String(result).contains("\r\n"));
    }

    @Test
    public void testEncodeBase64NotChunkedHelper() {
        byte[] data = new byte[100];
        Arrays.fill(data, (byte) 'Z');
        byte[] result = Base64.encodeBase64(data, false);
        assertFalse(new String(result).contains("\r\n"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64MaxResultSizeExceededThrows() {
        byte[] data = new byte[100];
        Base64.encodeBase64(data, false, false, 5); // ผลลัพธ์ยาวเกิน 5 -> throw
    }

    @Test
    public void testEncodeBase64MaxResultSizeSufficient() {
        byte[] data = "Man".getBytes();
        byte[] result = Base64.encodeBase64(data, false, false, 100);
        assertEquals("TWFu", new String(result));
    }

    @Test
    public void testDecodeBase64StringStatic() {
        byte[] result = Base64.decodeBase64("TWFu");
        assertEquals("Man", new String(result));
    }

    @Test
    public void testDecodeBase64ByteArrayStatic() {
        byte[] result = Base64.decodeBase64("TWFu".getBytes());
        assertEquals("Man", new String(result));
    }

    // ---------------------------------------------------------------
    // discardWhitespace (deprecated แต่ยังอยู่ใน source)
    // ---------------------------------------------------------------

    @Test
    public void testDiscardWhitespaceRemovesAll() {
        byte[] input = "T W\nF\ru\t".getBytes();
        byte[] result = Base64.discardWhitespace(input);
        assertEquals("TWFu", new String(result));
    }

    @Test
    public void testDiscardWhitespaceNoWhitespace() {
        byte[] input = "TWFu".getBytes();
        byte[] result = Base64.discardWhitespace(input);
        assertEquals("TWFu", new String(result));
    }

    @Test
    public void testDiscardWhitespaceEmptyInput() {
        byte[] input = new byte[0];
        byte[] result = Base64.discardWhitespace(input);
        assertEquals(0, result.length);
    }

    // ---------------------------------------------------------------
    // decodeInteger / encodeInteger / toIntegerBytes
    // ---------------------------------------------------------------

    @Test
    public void testDecodeInteger() {
        // "AQ==" decode -> byte [1] -> BigInteger(1,[1]) = 1
        BigInteger result = Base64.decodeInteger("AQ==".getBytes());
        assertEquals(BigInteger.ONE, result);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeIntegerNullThrowsNPE() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testEncodeIntegerNormal() {
        byte[] result = Base64.encodeInteger(BigInteger.valueOf(255));
        // toIntegerBytes(255) = [ -1 ] (0xFF) -> encodeBase64([-1]) ควร decode กลับเป็น 255
        byte[] decoded = Base64.decodeBase64(result);
        assertEquals((byte) 0xFF, decoded[0]);
    }

    @Test
    public void testToIntegerBytesZero() {
        // bigInt.bitLength()==0 -> bitlen=0, bitLength()%8==0 -> เข้า branch skip sign bit
        byte[] result = Base64.toIntegerBytes(BigInteger.ZERO);
        assertEquals(0, result.length);
    }

    @Test
    public void testToIntegerBytesExactByteAlignedReturnsDirect() {
        // BigInteger.ONE: bitLength=1 -> bitlen=8
        // ((1%8!=0) && ((1/8+1)==(8/8))) == true -> return bigBytes ตรง ๆ
        byte[] result = Base64.toIntegerBytes(BigInteger.ONE);
        assertArrayEquals(new byte[] { 1 }, result);
    }

    @Test
    public void testToIntegerBytesSignBitStripped() {
        // BigInteger.valueOf(255): bitLength=8 -> bitLength%8==0 -> strip sign byte
        byte[] result = Base64.toIntegerBytes(BigInteger.valueOf(255));
        assertArrayEquals(new byte[] { (byte) 0xFF }, result);
    }

    @Test
    public void testToIntegerBytesDirectReturnMultiByte() {
        // BigInteger.valueOf(256): bitLength=9 -> bitlen=16
        // ((9%8!=0) && ((9/8+1)==(16/8))) -> (1+1)==2 -> true -> return bigBytes ตรง ๆ
        byte[] result = Base64.toIntegerBytes(BigInteger.valueOf(256));
        assertArrayEquals(new byte[] { 1, 0 }, result);
    }

    // ---------------------------------------------------------------
    // Round trip sanity ทั่วไป (boundary sizes 0..5, urlSafe / not)
    // ---------------------------------------------------------------

    @Test
    public void testRoundTripBoundarySizes() {
        for (int size = 0; size <= 5; size++) {
            byte[] data = new byte[size];
            for (int i = 0; i < size; i++) {
                data[i] = (byte) (i + 1);
            }
            byte[] encodedStd = Base64.encodeBase64(data);
            byte[] decodedStd = Base64.decodeBase64(encodedStd);
            assertArrayEquals("size=" + size, data, decodedStd);

            byte[] encodedUrl = Base64.encodeBase64URLSafe(data);
            byte[] decodedUrl = Base64.decodeBase64(encodedUrl);
            assertArrayEquals("urlSafe size=" + size, data, decodedUrl);
        }
    }
}
