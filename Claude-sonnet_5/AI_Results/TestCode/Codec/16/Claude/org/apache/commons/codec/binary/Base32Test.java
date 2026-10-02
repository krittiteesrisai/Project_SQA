package org.apache.commons.codec.binary;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;

import org.junit.Test;

/**
 * JUnit 4 test suite สำหรับ org.apache.commons.codec.binary.Base32 (Codec-16b)
 *
 * หมายเหตุสำคัญ:
 * - Base32 extends BaseNCodec ซึ่ง source ของ BaseNCodec ไม่ได้ให้มาด้วย
 *   ดังนั้นพฤติกรรมของ encode(byte[])/decode(byte[]) เมื่อ input เป็น null
 *   (short-circuit ใน superclass) จะไม่ถูกทดสอบ เพราะไม่มีซอร์สยืนยัน behavior
 *   (ตามข้อกำหนดห้ามเดา)
 * - ค่า expected byte[] สำหรับ modulus 3 และ 6 คำนวณจาก logic จริงในซอร์ส
 *   (bit shifting) ไม่ใช่การเดา
 */
public class Base32Test {

    // ---------------------------------------------------------------
    // 1. Constructor branch coverage
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor_NoException() {
        Base32 b32 = new Base32();
        assertTrue(b32.isInAlphabet((byte) 'A'));
    }

    @Test
    public void testConstructorWithCustomPad_Valid() {
        // pad ไม่ใช่ alphabet และไม่ใช่ whitespace -> ต้องสร้างได้ปกติ
        Base32 b32 = new Base32((byte) '.');
        byte[] encoded = b32.encode("f".getBytes(StandardCharsets.US_ASCII));
        // modulus1 case: 2 ตัวอักษร + pad 6 ตัว โดย pad คือ '.'
        assertEquals("MY......", new String(encoded, StandardCharsets.US_ASCII));
    }

    @Test
    public void testConstructorUseHex_True() {
        Base32 b32 = new Base32(true);
        byte[] encoded = b32.encode("f".getBytes(StandardCharsets.US_ASCII));
        assertEquals("CO======", new String(encoded, StandardCharsets.US_ASCII));
    }

    @Test
    public void testConstructorUseHexFalse_UsesStandardAlphabet() {
        Base32 b32 = new Base32(false, (byte) '=');
        byte[] encoded = b32.encode("f".getBytes(StandardCharsets.US_ASCII));
        assertEquals("MY======", new String(encoded, StandardCharsets.US_ASCII));
    }

    @Test
    public void testConstructorLineLengthPositive_DefaultSeparator() {
        Base32 b32 = new Base32(8); // delegates to (8, CHUNK_SEPARATOR)
        byte[] input = "foobafooba".getBytes(StandardCharsets.US_ASCII); // 10 bytes, 2 full blocks
        byte[] encoded = b32.encode(input);
        // currentLinePos ถึง lineLength(8) พอดีทุกบล็อก -> เติม separator ระหว่างบล็อก
        // และ modulus=0 ตอน flush -> ไม่เติม separator ต่อท้าย (currentLinePos==0)
        assertEquals("MZXW6YTB\r\nMZXW6YTB",
                new String(encoded, StandardCharsets.US_ASCII));
    }

    @Test
    public void testConstructorNegativeLineLength_TreatedAsNoChunk() {
        // lineLength <=0 -> ข้าม branch การตรวจ separator ทั้งหมด แม้ separator default ไม่ null
        Base32 b32 = new Base32(-5);
        byte[] encoded = b32.encode("f".getBytes(StandardCharsets.US_ASCII));
        assertEquals("MY======", new String(encoded, StandardCharsets.US_ASCII));
    }

    @Test
    public void testConstructorLineLengthLE0_NullSeparator_NoException() {
        // lineLength<=0 -> ไม่เข้า if(lineLength>0) จึงไม่ throw แม้ separator เป็น null
        Base32 b32 = new Base32(0, null);
        byte[] encoded = b32.encode("f".getBytes(StandardCharsets.US_ASCII));
        assertEquals("MY======", new String(encoded, StandardCharsets.US_ASCII));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorLineLengthPositive_NullSeparator_Throws() {
        new Base32(8, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorSeparatorContainsAlphabet_Throws() {
        // 'A' และ 'B' เป็น alphabet char -> containsAlphabetOrPad ต้อง true
        new Base32(8, new byte[] { 'A', 'B' });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorPadInAlphabet_Throws() {
        // 'A' อยู่ใน alphabet -> isInAlphabet(pad) true -> throw
        new Base32(false, (byte) 'A');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorPadInHexAlphabet_Throws() {
        // ทดสอบเดียวกันแต่ผ่าน useHex=true เพื่อ cover decodeTable=HEX_DECODE_TABLE ในการ validate pad
        new Base32(true, (byte) 'A');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorPadIsWhitespace_Throws() {
        // space ถือเป็น whitespace -> isWhiteSpace(pad) true -> throw
        new Base32(false, (byte) ' ');
    }

    @Test
    public void testConstructorCustomPadAndSeparator_Combined() {
        // ผสม lineLength + custom separator + custom pad ผ่าน constructor เต็มรูปแบบ
        Base32 b32 = new Base32(8, new byte[] { '|' }, false, (byte) '.');
        byte[] encoded = b32.encode("f".getBytes(StandardCharsets.US_ASCII));
        // modulus1 -> "MY......" (pad='.') จากนั้น currentLinePos=8>0 -> เติม separator ต่อท้าย
        assertEquals("MY......|", new String(encoded, StandardCharsets.US_ASCII));
    }

    @Test
    public void testConstructorLineLengthWithHex_Combined() {
        Base32 b32 = new Base32(8, Base32.class.getName() != null
                ? new byte[] { '\r', '\n' } : null, true);
        byte[] encoded = b32.encode("f".getBytes(StandardCharsets.US_ASCII));
        assertEquals("CO======", new String(encoded, StandardCharsets.US_ASCII));
    }

    // ---------------------------------------------------------------
    // 2. isInAlphabet(byte) branch coverage
    // ---------------------------------------------------------------

    @Test
    public void testIsInAlphabet_ValidChars() {
        Base32 b32 = new Base32();
        assertTrue(b32.isInAlphabet((byte) 'A'));
        assertTrue(b32.isInAlphabet((byte) 'Z'));
        assertTrue(b32.isInAlphabet((byte) '2'));
        assertTrue(b32.isInAlphabet((byte) '7'));
    }

    @Test
    public void testIsInAlphabet_InvalidWithinRange() {
        Base32 b32 = new Base32();
        // '0' และ '1' อยู่ในช่วง table แต่ decodeTable value = -1
        assertFalse(b32.isInAlphabet((byte) '0'));
        assertFalse(b32.isInAlphabet((byte) '1'));
        assertFalse(b32.isInAlphabet((byte) ' '));
    }

    @Test
    public void testIsInAlphabet_NegativeByte() {
        Base32 b32 = new Base32();
        // octet < 0 -> false ทันที (short-circuit แรก)
        assertFalse(b32.isInAlphabet((byte) -1));
    }

    @Test
    public void testIsInAlphabet_OutOfUpperBound() {
        Base32 b32 = new Base32();
        // decodeTable.length = 91 ; ค่า >=91 ต้อง false จาก condition ตัวที่สอง
        assertFalse(b32.isInAlphabet((byte) 127));
    }

    // ---------------------------------------------------------------
    // 3. encode() branch/modulus coverage (ผ่าน public encode(byte[]))
    // ---------------------------------------------------------------

    @Test
    public void testEncode_EmptyArray() {
        Base32 b32 = new Base32();
        byte[] result = b32.encode(new byte[0]);
        assertEquals(0, result.length);
    }

    @Test
    public void testEncode_Modulus0_ExactBlock_NoTrailingPad() {
        // "fooba" = 5 bytes -> modulus0 พอดี -> flush early return (0==modulus && lineLength==0)
        Base32 b32 = new Base32();
        byte[] result = b32.encode("fooba".getBytes(StandardCharsets.US_ASCII));
        assertEquals("MZXW6YTB", new String(result, StandardCharsets.US_ASCII));
    }

    @Test
    public void testEncode_Modulus1() {
        Base32 b32 = new Base32();
        byte[] result = b32.encode("f".getBytes(StandardCharsets.US_ASCII));
        assertEquals("MY======", new String(result, StandardCharsets.US_ASCII));
    }

    @Test
    public void testEncode_Modulus2() {
        Base32 b32 = new Base32();
        byte[] result = b32.encode("fo".getBytes(StandardCharsets.US_ASCII));
        assertEquals("MZXQ====", new String(result, StandardCharsets.US_ASCII));
    }

    @Test
    public void testEncode_Modulus3() {
        Base32 b32 = new Base32();
        byte[] result = b32.encode("foo".getBytes(StandardCharsets.US_ASCII));
        assertEquals("MZXW6===", new String(result, StandardCharsets.US_ASCII));
    }

    @Test
    public void testEncode_Modulus4() {
        Base32 b32 = new Base32();
        byte[] result = b32.encode("foob".getBytes(StandardCharsets.US_ASCII));
        assertEquals("MZXW6YQ=", new String(result, StandardCharsets.US_ASCII));
    }

    @Test
    public void testEncode_MultiBlock_TwoBlocksWithLeftover() {
        Base32 b32 = new Base32();
        byte[] result = b32.encode("foobar".getBytes(StandardCharsets.US_ASCII));
        assertEquals("MZXW6YTBOI======", new String(result, StandardCharsets.US_ASCII));
    }

    @Test
    public void testEncode_NegativeByteValue_UnsignedConversion() {
        // byte -1 (0xFF) ต้องถูกแปลงเป็น 255 ผ่าน branch `if (b < 0) b += 256;`
        Base32 b32 = new Base32();
        byte[] input = new byte[] { (byte) 0xFF };
        byte[] result = b32.encode(input);
        // 0xFF -> top5=11111(31)='7', remainder 000<<2=0 -> 'A'
        assertEquals("7A======", new String(result, StandardCharsets.US_ASCII));
    }

    @Test
    public void testEncode_ChunkingSeparatorInsertedInMainLoop_NoTrailingSeparator() {
        Base32 b32 = new Base32(8); // lineLength=8, CRLF
        byte[] input = "foobafooba".getBytes(StandardCharsets.US_ASCII); // 10 bytes, no leftover
        byte[] result = b32.encode(input);
        assertEquals("MZXW6YTB\r\nMZXW6YTB",
                new String(result, StandardCharsets.US_ASCII));
    }

    @Test
    public void testEncode_ChunkingSeparator_TrailingSeparatorAfterLeftover() {
        Base32 b32 = new Base32(8);
        // 10 bytes เต็ม 2 block + เหลือ 2 byte (modulus2 ตอน flush)
        byte[] input = "foobafoobaXY".getBytes(StandardCharsets.US_ASCII); // 12 bytes
        byte[] result = b32.encode(input);
        String s = new String(result, StandardCharsets.US_ASCII);
        // ต้องลงท้ายด้วย CRLF เพราะ currentLinePos>0 หลัง flush
        assertTrue(s.endsWith("\r\n"));
        assertTrue(s.startsWith("MZXW6YTB\r\nMZXW6YTB"));
    }

    // ---------------------------------------------------------------
    // 4. decode() branch/modulus coverage (ผ่าน public decode(byte[]))
    // ---------------------------------------------------------------

    @Test
    public void testDecode_EmptyArray() {
        Base32 b32 = new Base32();
        byte[] result = b32.decode(new byte[0]);
        assertEquals(0, result.length);
    }

    @Test
    public void testDecode_Modulus1_NoOutput() {
        // modulus<2 -> ไม่มี output เลย (branch condition false)
        Base32 b32 = new Base32();
        byte[] result = b32.decode("B".getBytes(StandardCharsets.US_ASCII));
        assertEquals(0, result.length);
    }

    @Test
    public void testDecode_Modulus2_WithPadding_FromRfcVector() {
        Base32 b32 = new Base32();
        byte[] result = b32.decode("MY======".getBytes(StandardCharsets.US_ASCII));
        assertArrayEquals("f".getBytes(StandardCharsets.US_ASCII), result);
    }

    @Test
    public void testDecode_Modulus3_ComputedManually() {
        // 'B' decode value = 1 (สาม 'B' ต่อกัน) -> ทดสอบ case 3 ใน switch โดยเฉพาะ
        Base32 b32 = new Base32();
        byte[] result = b32.decode("BBB".getBytes(StandardCharsets.US_ASCII));
        assertArrayEquals(new byte[] { 8 }, result);
    }

    @Test
    public void testDecode_Modulus4_FromRfcVector() {
        Base32 b32 = new Base32();
        byte[] result = b32.decode("MZXQ====".getBytes(StandardCharsets.US_ASCII));
        assertArrayEquals("fo".getBytes(StandardCharsets.US_ASCII), result);
    }

    @Test
    public void testDecode_Modulus5_FromRfcVector() {
        Base32 b32 = new Base32();
        byte[] result = b32.decode("MZXW6===".getBytes(StandardCharsets.US_ASCII));
        assertArrayEquals("foo".getBytes(StandardCharsets.US_ASCII), result);
    }

    @Test
    public void testDecode_Modulus6_ComputedManually() {
        // หก 'B' ต่อกัน -> ทดสอบ case 6 ใน switch โดยเฉพาะ
        Base32 b32 = new Base32();
        byte[] result = b32.decode("BBBBBB".getBytes(StandardCharsets.US_ASCII));
        assertArrayEquals(new byte[] { 8, 66, 16 }, result);
    }

    @Test
    public void testDecode_Modulus7_FromRfcVector() {
        Base32 b32 = new Base32();
        byte[] result = b32.decode("MZXW6YQ=".getBytes(StandardCharsets.US_ASCII));
        assertArrayEquals("foob".getBytes(StandardCharsets.US_ASCII), result);
    }

    @Test
    public void testDecode_Modulus0_ExactBlock_NoSwitchExecuted() {
        Base32 b32 = new Base32();
        byte[] result = b32.decode("MZXW6YTB".getBytes(StandardCharsets.US_ASCII));
        assertArrayEquals("fooba".getBytes(StandardCharsets.US_ASCII), result);
    }

    @Test
    public void testDecode_MultiBlockWithPadding_FromRfcVector() {
        Base32 b32 = new Base32();
        byte[] result = b32.decode("MZXW6YTBOI======".getBytes(StandardCharsets.US_ASCII));
        assertArrayEquals("foobar".getBytes(StandardCharsets.US_ASCII), result);
    }

    @Test
    public void testDecode_PadEncounteredMidStream_StopsProcessing() {
        // เจอ pad ตัวแรก -> eof=true, break ทันที ตัวอักษรหลัง pad ถูกละเลยทั้งหมด
        Base32 b32 = new Base32();
        byte[] result = b32.decode("MY==XYZ".getBytes(StandardCharsets.US_ASCII));
        assertArrayEquals("f".getBytes(StandardCharsets.US_ASCII), result);
    }

    @Test
    public void testDecode_EofAlreadySet_TopReturnBranch() {
        // pad เป็นตัวแรกสุด -> eof=true ทันที, modulus=0 -> flush call ถัดไปจะ return ทันทีจาก top-check
        Base32 b32 = new Base32();
        byte[] result = b32.decode("=ABC".getBytes(StandardCharsets.US_ASCII));
        assertEquals(0, result.length);
    }

    @Test
    public void testDecode_IgnoreWhitespaceWithinAlphabetRange() {
        // ' ' อยู่ในช่วง table (index<91) แต่ decodeTable value=-1 -> ถูกข้าม (result<0 branch)
        Base32 b32 = new Base32();
        byte[] withSpace = b32.decode("M Y".getBytes(StandardCharsets.US_ASCII));
        byte[] withoutSpace = b32.decode("MY".getBytes(StandardCharsets.US_ASCII));
        assertArrayEquals(withoutSpace, withSpace);
        assertArrayEquals("f".getBytes(StandardCharsets.US_ASCII), withSpace);
    }

    @Test
    public void testDecode_IgnoreCharsOutsideTableLength() {
        // 'm','y' (lowercase, byte>=91) ต้องถูกข้ามเพราะเกิน decodeTable.length (b<length false)
        Base32 b32 = new Base32();
        byte[] result = b32.decode("myY".getBytes(StandardCharsets.US_ASCII));
        // เหลือแค่ 'Y' valid ตัวเดียว -> modulus=1 -> ไม่มี output
        assertEquals(0, result.length);
    }

    @Test
    public void testDecode_HexVariant_RoundTrip() {
        Base32 hex = new Base32(true);
        byte[] encoded = hex.encode("f".getBytes(StandardCharsets.US_ASCII));
        byte[] decoded = hex.decode(encoded);
        assertArrayEquals("f".getBytes(StandardCharsets.US_ASCII), decoded);
    }

    // ---------------------------------------------------------------
    // 5. Round-trip / integration smoke tests
    // ---------------------------------------------------------------

    @Test
    public void testEncodeDecode_RoundTrip_VariousLengths() {
        Base32 b32 = new Base32();
        for (int len = 0; len <= 12; len++) {
            byte[] input = new byte[len];
            for (int i = 0; i < len; i++) {
                input[i] = (byte) (i + 1);
            }
            byte[] encoded = b32.encode(input);
            byte[] decoded = b32.decode(encoded);
            assertArrayEquals("Round trip failed at length=" + len, input, decoded);
        }
    }
}
