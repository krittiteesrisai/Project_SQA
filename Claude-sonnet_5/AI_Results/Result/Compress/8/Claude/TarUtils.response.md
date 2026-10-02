# TarUtilsTest.java

```java
package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

/**
 * Unit tests for TarUtils.
 * หมายเหตุ: Javadoc ของ parseOctal ระบุว่า length ต้องมีอย่างน้อย 2 bytes
 * แต่ source code ไม่มีการตรวจสอบ (validate) เงื่อนไขนี้จริง ๆ
 * จึงไม่เขียนเทสสำหรับ "length < 2" เพราะไม่มี behavior ที่ยืนยันได้จาก source
 */
public class TarUtilsTest {

    // =========================================================
    // parseOctal
    // =========================================================

    @Test
    public void testParseOctal_AllNulReturnsZero() {
        // เงื่อนไข currentByte == 0 -> break ทันทีตัวแรก
        byte[] buffer = new byte[] {0, 0, 0, 0};
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_AllZerosWithTrailingSpace() {
        // '0' ทุกตัวถูกข้ามเพราะ stillPadding ยังเป็น true ตลอด
        // จน space ตัวสุดท้ายก็ถูก continue ด้วย (stillPadding ไม่เคยเป็น false)
        byte[] buffer = new byte[] {'0','0','0','0','0','0','0',' '};
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_LeadingZerosThenDigitTrailingSpace() {
        // leading zero ถูก skip, ตัวเลขจริงถูกคำนวณ, trailing space -> break
        byte[] buffer = new byte[] {'0','0','0','0','0','0','1',' '};
        assertEquals(1L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_LeadingSpacesThenDigitTrailingSpace() {
        // leading space ถูก skip เหมือนกับ '0'
        byte[] buffer = new byte[] {' ',' ','1',' '};
        assertEquals(1L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_NormalValueWithTrailingNul() {
        // "144" octal = 100 decimal, trailing NUL -> break ทันที (currentByte==0)
        byte[] buffer = new byte[] {'1','4','4',0};
        assertEquals(100L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_MultiDigitValueWithLeadingZeros() {
        // "0000144 " -> 100
        byte[] buffer = new byte[] {'0','0','0','0','1','4','4',' '};
        assertEquals(100L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_InvalidHighByteThrows() {
        // '8' > '7' -> throw
        byte[] buffer = new byte[] {'8',' '};
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_InvalidLowByteThrows() {
        // '/' (0x2F) < '0' (0x30) -> throw
        byte[] buffer = new byte[] {'/', ' '};
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseOctal_WithOffset() {
        byte[] buffer = new byte[] {'X','X','1',' ','Y'};
        assertEquals(1L, TarUtils.parseOctal(buffer, 2, 2));
    }

    // =========================================================
    // parseName
    // =========================================================

    @Test
    public void testParseName_NormalStringWithTrailingNul() {
        byte[] buffer = "hello\0\0\0".getBytes();
        assertEquals("hello", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseName_NoTrailingNulUsesFullLength() {
        byte[] buffer = "hello".getBytes();
        assertEquals("hello", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseName_EmptyImmediateNul() {
        byte[] buffer = new byte[] {0, 'a', 'b'};
        assertEquals("", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseName_WithOffset() {
        byte[] buffer = "XXhello\0".getBytes();
        assertEquals("hello", TarUtils.parseName(buffer, 2, 5));
    }

    // =========================================================
    // formatNameBytes
    // =========================================================

    @Test
    public void testFormatNameBytes_ShorterThanLengthPadsWithNul() {
        byte[] buf = new byte[10];
        Arrays.fill(buf, (byte) 'X');
        int newOffset = TarUtils.formatNameBytes("abc", buf, 0, 5);
        assertEquals(5, newOffset);
        assertEquals('a', (char) buf[0]);
        assertEquals('b', (char) buf[1]);
        assertEquals('c', (char) buf[2]);
        assertEquals(0, buf[3]);
        assertEquals(0, buf[4]);
    }

    @Test
    public void testFormatNameBytes_LongerThanLengthTruncates() {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatNameBytes("abcdef", buf, 0, 3);
        assertEquals(3, newOffset);
        assertEquals("abc", new String(buf, 0, 3));
    }

    @Test
    public void testFormatNameBytes_ExactLengthNoPadding() {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatNameBytes("abcde", buf, 0, 5);
        assertEquals(5, newOffset);
        assertEquals("abcde", new String(buf, 0, 5));
    }

    @Test
    public void testFormatNameBytes_EmptyNamePadsAllWithNul() {
        byte[] buf = new byte[3];
        Arrays.fill(buf, (byte) 'X');
        int newOffset = TarUtils.formatNameBytes("", buf, 0, 3);
        assertEquals(3, newOffset);
        assertEquals(0, buf[0]);
        assertEquals(0, buf[1]);
        assertEquals(0, buf[2]);
    }

    // =========================================================
    // formatUnsignedOctalString
    // =========================================================

    @Test
    public void testFormatUnsignedOctalString_ZeroValue() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 4);
        assertEquals("0000", new String(buf, 0, 4));
    }

    @Test
    public void testFormatUnsignedOctalString_NormalValue() {
        byte[] buf = new byte[3];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 3);
        assertEquals("010", new String(buf, 0, 3));
    }

    @Test
    public void testFormatUnsignedOctalString_ExactFitBoundary() {
        // ค่าพอดีกับ buffer 1 byte (max digit '7')
        byte[] buf = new byte[1];
        TarUtils.formatUnsignedOctalString(7L, buf, 0, 1);
        assertEquals("7", new String(buf, 0, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_OverflowThrows() {
        byte[] buf = new byte[1];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 1); // ต้องใช้ 2 digit แต่มีที่แค่ 1
    }

    @Test
    public void testFormatUnsignedOctalString_WithOffset() {
        byte[] buf = new byte[6];
        TarUtils.formatUnsignedOctalString(8L, buf, 2, 3);
        assertEquals("010", new String(buf, 2, 3));
    }

    // =========================================================
    // formatOctalBytes
    // =========================================================

    @Test
    public void testFormatOctalBytes_Normal() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatOctalBytes(8L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals("000010 ", new String(buf, 0, 7)); // 6 digit + space
        assertEquals(0, buf[7]); // trailing NUL
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatOctalBytes_OverflowThrows() {
        byte[] buf = new byte[3];
        TarUtils.formatOctalBytes(8L, buf, 0, 3); // idx = 1, value 8 ไม่พอ
    }

    // =========================================================
    // formatLongOctalBytes
    // =========================================================

    @Test
    public void testFormatLongOctalBytes_Normal() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatLongOctalBytes(8L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals("0000010 ", new String(buf, 0, 8)); // 7 digit + space
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalBytes_OverflowThrows() {
        byte[] buf = new byte[2];
        TarUtils.formatLongOctalBytes(8L, buf, 0, 2); // idx = 1
    }

    // =========================================================
    // formatCheckSumOctalBytes
    // =========================================================

    @Test
    public void testFormatCheckSumOctalBytes_Normal() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatCheckSumOctalBytes(8L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals("000010", new String(buf, 0, 6));
        assertEquals(0, buf[6]);          // trailing NUL
        assertEquals(' ', (char) buf[7]); // trailing space
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatCheckSumOctalBytes_OverflowThrows() {
        byte[] buf = new byte[3];
        TarUtils.formatCheckSumOctalBytes(8L, buf, 0, 3); // idx = 1
    }

    // =========================================================
    // computeCheckSum
    // =========================================================

    @Test
    public void testComputeCheckSum_EmptyArray() {
        assertEquals(0L, TarUtils.computeCheckSum(new byte[0]));
    }

    @Test
    public void testComputeCheckSum_PositiveBytes() {
        byte[] buf = new byte[] {1, 2, 3};
        assertEquals(6L, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testComputeCheckSum_NegativeBytesMaskedCorrectly() {
        // byte -1 (0xFF) ต้องถูก mask เป็น 255 ไม่ใช่ -1
        byte[] buf = new byte[] {(byte) -1, (byte) -1};
        assertEquals(510L, TarUtils.computeCheckSum(buf));
    }
}
```

# ตารางสรุป Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testParseOctal_AllNulReturnsZero` | `currentByte == 0` → break ทันที (loop iteration แรก) |
| `testParseOctal_AllZerosWithTrailingSpace` | `'0'`/`' '` กับ `stillPadding==true` ตลอด → continue ทุกตัว |
| `testParseOctal_LeadingZerosThenDigitTrailingSpace` | leading `'0'` skip, เปลี่ยน `stillPadding=false`, ประมวลผล digit, trailing `' '` → break |
| `testParseOctal_LeadingSpacesThenDigitTrailingSpace` | leading `' '` skip (branch เดียวกับ `'0'`) |
| `testParseOctal_NormalValueWithTrailingNul` | คำนวณ multi-digit + `currentByte==0` break |
| `testParseOctal_MultiDigitValueWithLeadingZeros` | ผสมทุกเงื่อนไข: padding, digit, trailing space |
| `testParseOctal_InvalidHighByteThrows` | `currentByte > '7'` → throw `IllegalArgumentException` |
| `testParseOctal_InvalidLowByteThrows` | `currentByte < '0'` → throw `IllegalArgumentException` |
| `testParseOctal_WithOffset` | ตรวจ offset/length ทำงานถูกต้อง |
| `testParseName_NormalStringWithTrailingNul` | `b == 0` → break กลางลูป |
| `testParseName_NoTrailingNulUsesFullLength` | ลูปจบด้วย `i < end` (ไม่มี NUL) |
| `testParseName_EmptyImmediateNul` | `b==0` ตั้งแต่ iteration แรก |
| `testParseName_WithOffset` | ตรวจ offset ทำงานถูกต้อง |
| `testFormatNameBytes_ShorterThanLengthPadsWithNul` | loop1 `i<name.length()` จบก่อน, loop2 pad NUL |
| `testFormatNameBytes_LongerThanLengthTruncates` | loop1 `i<length` จบก่อน (ไม่ pad) |
| `testFormatNameBytes_ExactLengthNoPadding` | boundary: `i<length && i<name.length()` เท่ากันพอดี |
| `testFormatNameBytes_EmptyNamePadsAllWithNul` | loop1 ไม่ทำงานเลย (name.length()==0), loop2 pad ทั้งหมด |
| `testFormatUnsignedOctalString_ZeroValue` | `value == 0` branch |
| `testFormatUnsignedOctalString_NormalValue` | `value != 0`, loop คำนวณ digit, `val==0` จบปกติ |
| `testFormatUnsignedOctalString_ExactFitBoundary` | boundary `remaining==0` พอดีกับค่าสูงสุด 1 digit |
| `testFormatUnsignedOctalString_OverflowThrows` | `val != 0` หลัง loop → throw |
| `testFormatUnsignedOctalString_WithOffset` | ตรวจ offset ทำงานถูกต้อง |
| `testFormatOctalBytes_Normal` | เรียก `formatUnsignedOctalString` ปกติ + trailing space/NUL |
| `testFormatOctalBytes_OverflowThrows` | exception propagate จาก `formatUnsignedOctalString` |
| `testFormatLongOctalBytes_Normal` | เรียกปกติ + trailing space เดียว |
| `testFormatLongOctalBytes_OverflowThrows` | exception propagate |
| `testFormatCheckSumOctalBytes_Normal` | เรียกปกติ + NUL แล้ว space |
| `testFormatCheckSumOctalBytes_OverflowThrows` | exception propagate |
| `testComputeCheckSum_EmptyArray` | loop ไม่ทำงาน (length==0) |
| `testComputeCheckSum_PositiveBytes` | loop สะสมค่าปกติ |
| `testComputeCheckSum_NegativeBytesMaskedCorrectly` | ตรวจ `BYTE_MASK & buf[i]` ทำงานถูกต้องกับ negative byte |

**หมายเหตุ:** ทุกเทสอ้างอิงจาก logic ที่ปรากฏใน source เท่านั้น ไม่มีการเดา behavior เพิ่มเติมนอกเหนือจากที่ตรวจสอบได้จากโค้ด