/*
 * ทดสอบคลาส TarUtils (Defects4J: Compress-45b)
 * ใช้ JUnit 4 + Mockito (จาก mockito-core-1.10.19.jar) + Java Reflection
 * วางไว้ใน package เดียวกับคลาสเป้าหมายเพื่อให้เข้าถึง TarConstants
 * และ field แบบ package-private ได้สะดวก (ไม่ได้ใช้ประโยชน์จากการเข้าถึง private field
 * ใด ๆ ที่นอกเหนือจาก public API ยกเว้นการเรียก private static method ผ่าน reflection
 * เพื่อเพิ่ม branch coverage ในส่วนที่ไม่สามารถ reach ผ่าน public API ได้)
 */
package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.junit.Test;

public class TarUtilsTest {

    // ---------------------------------------------------------------
    // Helper: เรียก private static method ผ่าน reflection
    // ใช้เฉพาะกรณีที่ branch นั้น "unreachable" ผ่าน public API เท่านั้น
    // ---------------------------------------------------------------
    private static Object invokePrivateStatic(String name, Class<?>[] types, Object[] args) throws Exception {
        Method m = TarUtils.class.getDeclaredMethod(name, types);
        m.setAccessible(true);
        return m.invoke(null, args);
    }

    // =================================================================
    // parseOctal(byte[], int, int)
    // =================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_LengthLessThan2_Throws() {
        // branch: length < 2
        TarUtils.parseOctal(new byte[]{'1'}, 0, 1);
    }

    @Test
    public void testParseOctal_LeadingNul_ReturnsZero() {
        // branch: buffer[start] == 0 -> return 0L (workaround สำหรับ leading NUL)
        byte[] buffer = {0, 0, 0, 0};
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, 4));
    }

    @Test
    public void testParseOctal_NormalValue_NoLeadingSpace() {
        // branch: trailing NUL trimmed 1 ครั้ง, ทุกไบต์เป็น digit ที่ valid
        byte[] buffer = {'7', '5', '5', 0};
        assertEquals(493L, TarUtils.parseOctal(buffer, 0, 4)); // 0755 = 493
    }

    @Test
    public void testParseOctal_LeadingSpaces_And_TrailingSpaceTrim() {
        // branch: leading-space skip loop ทำงาน + trailing-space trim loop ทำงาน
        byte[] buffer = {' ', '1', '7', ' '};
        assertEquals(15L, TarUtils.parseOctal(buffer, 0, 4)); // 017 = 15
    }

    @Test
    public void testParseOctal_MultipleTrailingNulTrim() {
        // branch: trailing trim loop วนหลายรอบ
        byte[] buffer = {'7', '5', '5', 0, 0, 0};
        assertEquals(493L, TarUtils.parseOctal(buffer, 0, 6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_InvalidDigit_Throws() {
        // branch: currentByte < '0' || currentByte > '7' -> throw (exceptionMessage ถูกเรียก)
        byte[] buffer = {'9', 0};
        TarUtils.parseOctal(buffer, 0, 2);
    }

    @Test
    public void testParseOctal_NoTrailingTerminator_StillParsesIfDigitsValid() {
        // boundary: ไม่มี trailing space/NUL ตาม javadoc แต่โค้ดจริงยัง parse ได้
        // เพราะ trailer-loop จะไม่ trim และ digit-loop เจอ digit ที่ valid ทั้งหมด
        byte[] buffer = {'7', '5'};
        assertEquals(61L, TarUtils.parseOctal(buffer, 0, 2)); // 075? -> "75" octal = 61
    }

    // =================================================================
    // parseOctalOrBinary / parseBinaryLong / parseBinaryBigInteger
    // =================================================================

    @Test
    public void testParseOctalOrBinary_MsbClear_DelegatesToParseOctal() {
        // branch: (buffer[offset] & 0x80) == 0
        byte[] buffer = {'7', '5', '5', 0};
        assertEquals(493L, TarUtils.parseOctalOrBinary(buffer, 0, 4));
    }

    @Test
    public void testFormatAndParseOctalOrBinary_NegativeSmall_LengthLessThan9_RoundTrip() {
        // branch: MSB set, negative == true, length < 9 -> parseBinaryLong (negative path)
        // + ทดสอบ formatLongOctalOrBinaryBytes negative,length<9 (เรียกทั้ง formatLongBinary
        //   และ formatBigIntegerBinary ตาม defect แต่ค่าเล็กจึงไม่ conflict)
        byte[] buf = new byte[8];
        long value = -5L;
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 8);
        assertEquals((byte) 0xff, buf[0]); // marker byte สำหรับค่า negative
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, 8);
        assertEquals(value, parsed);
    }

    @Test
    public void testFormatAndParseOctalOrBinary_PositiveBinary_LengthLessThan9_RoundTrip() {
        // branch: MSB set, negative == false, length < 9 -> parseBinaryLong (positive path)
        // ค่านี้ถูกเลือกให้ "ปลอดภัย" จาก defect (ไม่ทำให้ formatBigIntegerBinary throw)
        byte[] buf = new byte[8];
        long value = 3_000_000_000L; // เกิน threshold octal แน่นอน แต่เล็กพอที่ไม่ trigger defect
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 8);
        assertEquals((byte) 0x80, buf[0]); // marker byte สำหรับค่า positive-binary
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, 8);
        assertEquals(value, parsed);
    }

    @Test
    public void testFormatAndParseOctalOrBinary_Negative_LengthGE9_RoundTrip() {
        // branch: length >= 9 -> parseBinaryBigInteger / formatBigIntegerBinary (negative)
        byte[] buf = new byte[12];
        long value = -9_999_999_999L;
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 12);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, 12);
        assertEquals(value, parsed);
    }

    @Test
    public void testFormatAndParseOctalOrBinary_PositiveLarge_LengthGE9_RoundTrip() {
        // branch: length >= 9, positive แต่เกิน threshold octal -> formatBigIntegerBinary (positive)
        byte[] buf = new byte[12];
        long value = 1_000_000_000_000L; // 1 ล้านล้าน - เกิน max ของ octal field แน่นอน
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 12);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, 12);
        assertEquals(value, parsed);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_OctalPathForSmallPositiveValue() {
        // branch: !negative && value <= maxAsOctalChar -> formatLongOctalBytes (octal path ปกติ)
        byte[] buf = new byte[12];
        long value = 8L;
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 12);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, 12); // MSB ควร clear -> ไปทาง parseOctal
        assertEquals(value, parsed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_TooLargeForLongBinary_LengthLessThan9_Throws() {
        // branch: formatLongBinary ภายใน -> (val < 0 || val >= max) -> throw
        // (สอดคล้องกับ public API เพราะ length<9 เรียก formatLongBinary จริง)
        byte[] buf = new byte[8];
        TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, 8);
    }

    /**
     * *** ทดสอบดักจับ Defect (Compress-45) ***
     * โค้ดต้นทางใน formatLongOctalOrBinaryBytes ขาด "return" หลังเรียก
     * formatLongBinary(...) เมื่อ length < 9 ทำให้ยังเรียก formatBigIntegerBinary(...)
     * ต่อโดยไม่มีเงื่อนไข ทั้งที่ formatLongBinary ได้ตรวจสอบและยืนยันแล้วว่าค่านี้
     * (2^55) พอดีกับ field ขนาด 8 byte (val < max ผ่านการเช็ค) แต่ formatBigIntegerBinary
     * กลับคำนวณ byte length ได้ 8 (เพราะต้องเติม sign-byte) ซึ่งเกิน length-1(=7)
     * จึง throw IllegalArgumentException อย่างไม่ถูกต้อง
     *
     * Test นี้ "คาดหวังว่าจะไม่ throw exception" ตามตรรกะที่ถูกต้อง
     * ถ้ารันกับซอร์สที่มี defect (Compress-45b) test นี้จะ FAIL
     * ซึ่งเป็นการยืนยันว่าเราตรวจพบข้อบกพร่องได้จริงตามที่ระบุในโจทย์
     */
    @Test
    public void testFormatLongOctalOrBinaryBytes_MissingReturnDefect_ShouldNotThrow() {
        byte[] buf = new byte[8];
        long value = 1L << 55; // 2^55 : ผ่านเงื่อนไขของ formatLongBinary แต่ชน limit ของ formatBigIntegerBinary
        try {
            TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 8);
            // สำเร็จ = ไม่มี defect (หรือ defect ถูก fix แล้ว)
        } catch (IllegalArgumentException e) {
            fail("พบ defect (Compress-45): formatLongOctalOrBinaryBytes ขาด return statement "
                + "หลังเรียก formatLongBinary เมื่อ length<9 ทำให้ formatBigIntegerBinary ถูกเรียกซ้ำ "
                + "และ throw exception ทั้งที่ค่าควร fit ได้ : " + e.getMessage());
        }
    }

    @Test
    public void testFormatBigIntegerBinary_ThrowsWhenTooLarge_ViaReflection() throws Exception {
        // ทดสอบ branch throw ของ formatBigIntegerBinary โดยตรง (isolate จาก defect ของ public method)
        Method m = TarUtils.class.getDeclaredMethod(
            "formatBigIntegerBinary", long.class, byte[].class, int.class, int.class, boolean.class);
        m.setAccessible(true);
        byte[] buf = new byte[8];
        try {
            m.invoke(null, 1L << 55, buf, 0, 8, false);
            fail("Expected IllegalArgumentException");
        } catch (InvocationTargetException ite) {
            assertTrue(ite.getCause() instanceof IllegalArgumentException);
        }
    }

    @Test
    public void testParseBinaryLong_DefensiveLengthCheck_ViaReflection() throws Exception {
        // branch: if (length >= 9) throw ภายใน parseBinaryLong
        // Unreachable ผ่าน public API เพราะ parseOctalOrBinary เรียกเมื่อ length<9 เท่านั้น
        // จึงใช้ reflection เพื่อให้ครอบคลุม branch นี้โดยตรง
        try {
            invokePrivateStatic("parseBinaryLong",
                new Class<?>[]{byte[].class, int.class, int.class, boolean.class},
                new Object[]{new byte[9], 0, 9, false});
            fail("Expected IllegalArgumentException");
        } catch (InvocationTargetException ite) {
            assertTrue(ite.getCause() instanceof IllegalArgumentException);
        }
    }

    // =================================================================
    // parseBoolean
    // =================================================================

    @Test
    public void testParseBoolean_One_ReturnsTrue() {
        assertTrue(TarUtils.parseBoolean(new byte[]{1}, 0));
    }

    @Test
    public void testParseBoolean_Zero_ReturnsFalse() {
        assertFalse(TarUtils.parseBoolean(new byte[]{0}, 0));
    }

    @Test
    public void testParseBoolean_OtherValue_ReturnsFalse() {
        // หมายเหตุ: โค้ดจริงเช็คแค่ ==1 เท่านั้น ไม่ validate byte อื่น ๆ ตาม javadoc
        assertFalse(TarUtils.parseBoolean(new byte[]{2}, 0));
    }

    // =================================================================
    // parseName (3-arg และ 4-arg)
    // =================================================================

    @Test
    public void testParseName_StopsAtNul() {
        byte[] buffer = {'h', 'i', 0, 0};
        assertEquals("hi", TarUtils.parseName(buffer, 0, 4));
    }

    @Test
    public void testParseName_NoTrailingNul_UsesFullLength() {
        byte[] buffer = {'h', 'i'};
        assertEquals("hi", TarUtils.parseName(buffer, 0, 2));
    }

    @Test
    public void testParseName_AllNul_ReturnsEmptyString() {
        // branch: len == 0 -> return "" (ไม่เรียก encoding.decode เลย)
        byte[] buffer = {0, 0, 0};
        assertEquals("", TarUtils.parseName(buffer, 0, 3));
    }

    @Test(expected = IOException.class)
    public void testParseName4Arg_EncodingDecodeThrows() throws IOException {
        ZipEncoding mockEncoding = mock(ZipEncoding.class);
        when(mockEncoding.decode(any(byte[].class))).thenThrow(new IOException("boom"));
        byte[] buffer = {'a', 'b', 0};
        TarUtils.parseName(buffer, 0, 3, mockEncoding);
    }

    @Test
    public void testParseName4Arg_LenZero_DoesNotCallDecode() throws IOException {
        ZipEncoding mockEncoding = mock(ZipEncoding.class);
        byte[] buffer = {0, 0};
        String result = TarUtils.parseName(buffer, 0, 2, mockEncoding);
        assertEquals("", result);
        verify(mockEncoding, never()).decode(any(byte[].class));
    }

    // =================================================================
    // formatNameBytes (3-arg และ 4-arg)
    // =================================================================

    @Test
    public void testFormatNameBytes_ShorterThanBuffer_PadsWithNul() {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatNameBytes("ABC", buf, 0, 5);
        assertEquals(5, newOffset);
        assertArrayEquals(new byte[]{'A', 'B', 'C', 0, 0}, buf);
    }

    @Test
    public void testFormatNameBytes_LongerThanBuffer_Truncates() {
        // branch: while (b.limit() > length && len > 0) วนหลายรอบ
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatNameBytes("ABCDEFGH", buf, 0, 5);
        assertEquals(5, newOffset);
        assertArrayEquals(new byte[]{'A', 'B', 'C', 'D', 'E'}, buf);
    }

    @Test
    public void testFormatNameBytes_EmptyName_FillsAllNul() {
        byte[] buf = new byte[3];
        TarUtils.formatNameBytes("", buf, 0, 3);
        assertArrayEquals(new byte[]{0, 0, 0}, buf);
    }

    @Test(expected = IOException.class)
    public void testFormatNameBytes4Arg_EncodingEncodeThrows() throws IOException {
        ZipEncoding mockEncoding = mock(ZipEncoding.class);
        when(mockEncoding.encode(anyString())).thenThrow(new IOException("boom"));
        TarUtils.formatNameBytes("name", new byte[10], 0, 10, mockEncoding);
    }

    // =================================================================
    // formatUnsignedOctalString
    // =================================================================

    @Test
    public void testFormatUnsignedOctalString_ValueZero() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 4);
        assertArrayEquals(new byte[]{'0', '0', '0', '0'}, buf);
    }

    @Test
    public void testFormatUnsignedOctalString_NonZeroWithLeadingZeroPadding() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 4); // octal "10" -> pad -> "0010"
        assertArrayEquals(new byte[]{'0', '0', '1', '0'}, buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_DoesNotFit_Throws() {
        // branch: val != 0 หลังจบ loop -> throw
        byte[] buf = new byte[1];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 1);
    }

    // =================================================================
    // formatOctalBytes / formatLongOctalBytes / formatCheckSumOctalBytes
    // =================================================================

    @Test
    public void testFormatOctalBytes_Basic() {
        byte[] buf = new byte[6];
        int newOffset = TarUtils.formatOctalBytes(8L, buf, 0, 6);
        assertEquals(6, newOffset);
        assertArrayEquals(new byte[]{'0', '0', '1', '0', ' ', 0}, buf);
    }

    @Test
    public void testFormatLongOctalBytes_Basic() {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatLongOctalBytes(8L, buf, 0, 5);
        assertEquals(5, newOffset);
        assertArrayEquals(new byte[]{'0', '0', '1', '0', ' '}, buf);
    }

    @Test
    public void testFormatCheckSumOctalBytes_Basic() {
        byte[] buf = new byte[6];
        int newOffset = TarUtils.formatCheckSumOctalBytes(8L, buf, 0, 6);
        assertEquals(6, newOffset);
        assertArrayEquals(new byte[]{'0', '0', '1', '0', 0, ' '}, buf);
    }

    // =================================================================
    // computeCheckSum
    // =================================================================

    @Test
    public void testComputeCheckSum_EmptyArray() {
        assertEquals(0L, TarUtils.computeCheckSum(new byte[0]));
    }

    @Test
    public void testComputeCheckSum_MasksNegativeBytes() {
        // branch: BYTE_MASK & element เพื่อบังคับให้ byte ลบกลายเป็นค่า unsigned
        byte[] buf = {(byte) -1, (byte) -1}; // 0xFF, 0xFF -> 255+255
        assertEquals(510L, TarUtils.computeCheckSum(buf));
    }

    // =================================================================
    // verifyCheckSum
    // =================================================================

    @Test
    public void testVerifyCheckSum_UnsignedMatch_ReturnsTrue() {
        byte[] header = buildHeaderWithChecksum(true, false);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_SignedMatchOnly_ReturnsTrue() {
        // branch: storedSum != unsignedSum แต่ storedSum == signedSum
        byte[] header = buildHeaderWithChecksum(false, true);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_NoMatch_ReturnsFalse() {
        byte[] header = new byte[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN + 20];
        Arrays.fill(header, (byte) 'A');
        // เขียนค่า checksum ที่ผิดแน่ ๆ (ไม่ตรงทั้ง signed และ unsigned)
        TarUtils.formatCheckSumOctalBytes(0L, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    /**
     * สร้าง header ตัวอย่างสำหรับทดสอบ verifyCheckSum
     * useUnsigned = true -> เก็บค่า checksum เป็น unsignedSum จริง (ตรงกับทั้งคู่ ถ้าไม่มี high-bit byte)
     * useSignedOnly = true -> เก็บค่า checksum เป็น signedSum เพื่อทดสอบว่า mismatch กับ unsignedSum
     *   แต่ยัง match กับ signedSum (ต้องมี byte ที่มี high bit set เพื่อให้ signedSum != unsignedSum)
     */
    private byte[] buildHeaderWithChecksum(boolean useUnsigned, boolean useSignedOnly) {
        byte[] header = new byte[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN + 20];
        Arrays.fill(header, (byte) 'A');
        // ใส่ byte ที่มี high-bit set เพื่อให้ signedSum แตกต่างจาก unsignedSum
        header[header.length - 1] = (byte) 0xFF;
        header[header.length - 2] = (byte) 0xFF;

        // ตั้ง checksum field เป็น space ก่อนคำนวณผลรวม (ตามข้อกำหนดของ tar)
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }

        long unsignedSum = 0;
        long signedSum = 0;
        for (byte b : header) {
            unsignedSum += 0xff & b;
            signedSum += b;
        }

        long storedSum = useSignedOnly ? signedSum : unsignedSum;
        TarUtils.formatCheckSumOctalBytes(storedSum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        return header;
    }
}
