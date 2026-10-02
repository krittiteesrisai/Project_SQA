# JUnit 4 Test Suite สำหรับ `TarUtils`

```java
import org.apache.commons.compress.archivers.tar.TarUtils;
import org.junit.Test;
import static org.junit.Assert.*;

public class TarUtilsTest {

    // ---------------------------------------------------------
    // parseOctal
    // ---------------------------------------------------------

    @Test
    public void testParseOctal_normal() {
        byte[] buf = "755 ".getBytes();
        long result = TarUtils.parseOctal(buf, 0, 4);
        assertEquals(493L, result); // 0755 octal = 493 decimal
    }

    @Test
    public void testParseOctal_leadingSpacesIgnored() {
        byte[] buf = " 755".getBytes();
        long result = TarUtils.parseOctal(buf, 0, 4);
        assertEquals(493L, result);
    }

    @Test
    public void testParseOctal_trailingSpaceBreaks() {
        // "007 " -> leading '0' padding ignored, '7' -> 7, then trailing space -> break
        byte[] buf = "007 ".getBytes();
        long result = TarUtils.parseOctal(buf, 0, 4);
        assertEquals(7L, result);
    }

    @Test
    public void testParseOctal_allZeros() {
        byte[] buf = "0000".getBytes();
        long result = TarUtils.parseOctal(buf, 0, 4);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_allSpaces() {
        byte[] buf = "    ".getBytes();
        long result = TarUtils.parseOctal(buf, 0, 4);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_nullTerminatorAtStart() {
        byte[] buf = {0, '7', '5', '5'};
        long result = TarUtils.parseOctal(buf, 0, 4);
        assertEquals(0L, result); // break ทันทีเมื่อพบ NUL ตัวแรก
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidDigitThrows() {
        byte[] buf = "789".getBytes(); // '8' อยู่นอกช่วง '0'-'7'
        TarUtils.parseOctal(buf, 0, 3);
    }

    @Test
    public void testParseOctal_zeroLength() {
        byte[] buf = "755".getBytes();
        long result = TarUtils.parseOctal(buf, 0, 0); // loop ไม่ทำงานเลย
        assertEquals(0L, result);
    }

    // ---------------------------------------------------------
    // parseName
    // ---------------------------------------------------------

    @Test
    public void testParseName_stopsAtNull() {
        byte[] buf = "test\0extra".getBytes();
        String name = TarUtils.parseName(buf, 0, buf.length);
        assertEquals("test", name);
    }

    @Test
    public void testParseName_noNullReadsFullLength() {
        byte[] buf = "test".getBytes();
        String name = TarUtils.parseName(buf, 0, buf.length);
        assertEquals("test", name);
    }

    @Test
    public void testParseName_zeroLength() {
        byte[] buf = "test".getBytes();
        String name = TarUtils.parseName(buf, 0, 0);
        assertEquals("", name);
    }

    @Test
    public void testParseName_immediateNull() {
        byte[] buf = {0, 'a', 'b'};
        String name = TarUtils.parseName(buf, 0, 3);
        assertEquals("", name);
    }

    // ---------------------------------------------------------
    // formatNameBytes
    // ---------------------------------------------------------

    @Test
    public void testFormatNameBytes_paddingWhenNameShorter() {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatNameBytes("ab", buf, 0, 5);
        assertEquals(5, newOffset);
        assertArrayEquals(new byte[]{'a', 'b', 0, 0, 0}, buf);
    }

    @Test
    public void testFormatNameBytes_truncateWhenNameLonger() {
        byte[] buf = new byte[10];
        int newOffset = TarUtils.formatNameBytes("abcdef", buf, 2, 4);
        assertEquals(6, newOffset);
        // เฉพาะ 4 ตัวอักษรแรกถูกก็อปปี้ ไม่ pad เพราะ name ยาวกว่า length
        assertArrayEquals(new byte[]{0, 0, 'a', 'b', 'c', 'd', 0, 0, 0, 0}, buf);
    }

    @Test
    public void testFormatNameBytes_exactFit() {
        byte[] buf = new byte[3];
        int newOffset = TarUtils.formatNameBytes("abc", buf, 0, 3);
        assertEquals(3, newOffset);
        assertArrayEquals(new byte[]{'a', 'b', 'c'}, buf);
    }

    @Test
    public void testFormatNameBytes_zeroLength() {
        byte[] buf = new byte[3];
        int newOffset = TarUtils.formatNameBytes("abc", buf, 0, 0);
        assertEquals(0, newOffset);
        assertArrayEquals(new byte[]{0, 0, 0}, buf); // ไม่มีการเขียนใดๆ
    }

    // ---------------------------------------------------------
    // formatUnsignedOctalString
    // ---------------------------------------------------------

    @Test
    public void testFormatUnsignedOctalString_zeroValue() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 4);
        assertEquals("0000", new String(buf));
    }

    @Test
    public void testFormatUnsignedOctalString_nonZeroFitsWithPadding() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 4); // 8 decimal = 10 octal
        assertEquals("0010", new String(buf));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_bufferTooSmallThrows() {
        byte[] buf = new byte[1];
        // 8 (octal "10") ต้องการ 2 หลัก แต่ length=1 -> ไม่พอ
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 1);
    }

    // ---------------------------------------------------------
    // formatOctalBytes
    // ---------------------------------------------------------

    @Test
    public void testFormatOctalBytes_normal() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatOctalBytes(8L, buf, 0, 8);
        assertEquals(8, newOffset);
        // idx = length-2 = 6 หลักสำหรับตัวเลข, ตามด้วย space, NUL
        assertEquals("000010 " + "\0", new String(buf));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatOctalBytes_valueTooLargeThrows() {
        byte[] buf = new byte[3]; // idx = length-2 = 1 -> ไม่พอสำหรับค่า 8 (ต้อง 2 หลัก)
        TarUtils.formatOctalBytes(8L, buf, 0, 3);
    }

    // ---------------------------------------------------------
    // formatLongOctalBytes
    // ---------------------------------------------------------

    @Test
    public void testFormatLongOctalBytes_normal() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatLongOctalBytes(8L, buf, 0, 8);
        assertEquals(8, newOffset);
        // idx = length-1 = 7 หลักสำหรับตัวเลข ตามด้วย space (ไม่มี NUL)
        assertEquals("0000010 ", new String(buf));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalBytes_valueTooLargeThrows() {
        byte[] buf = new byte[2]; // idx = length-1 = 1 -> ไม่พอสำหรับค่า 8
        TarUtils.formatLongOctalBytes(8L, buf, 0, 2);
    }

    // ---------------------------------------------------------
    // formatCheckSumOctalBytes
    // ---------------------------------------------------------

    @Test
    public void testFormatCheckSumOctalBytes_normal() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatCheckSumOctalBytes(8L, buf, 0, 8);
        assertEquals(8, newOffset);
        // idx = length-2 = 6 หลัก ตามด้วย NUL แล้ว space
        assertEquals("000010" + "\0" + " ", new String(buf));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatCheckSumOctalBytes_valueTooLargeThrows() {
        byte[] buf = new byte[3]; // idx = length-2 = 1 -> ไม่พอสำหรับค่า 8
        TarUtils.formatCheckSumOctalBytes(8L, buf, 0, 3);
    }

    // ---------------------------------------------------------
    // computeCheckSum
    // ---------------------------------------------------------

    @Test
    public void testComputeCheckSum_emptyBuffer() {
        byte[] buf = new byte[0];
        assertEquals(0L, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testComputeCheckSum_normalBytes() {
        byte[] buf = {1, 2, 3};
        assertEquals(6L, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testComputeCheckSum_negativeByteMasking() {
        // byte 0xFF ในรูปแบบ signed = -1 แต่ต้องถูก mask เป็น 255
        byte[] buf = {(byte) 0xFF};
        assertEquals(255L, TarUtils.computeCheckSum(buf));
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testParseOctal_normal` | ตัวเลขปกติ, ไม่เข้า if ใดๆ ที่ break/continue |
| `testParseOctal_leadingSpacesIgnored` | `currentByte==' '` + `stillPadding=true` → continue |
| `testParseOctal_trailingSpaceBreaks` | `currentByte==' '` + `stillPadding=false` → break |
| `testParseOctal_allZeros` | `currentByte=='0'` + `stillPadding=true` ตลอด loop |
| `testParseOctal_allSpaces` | เหมือนด้านบนแต่เป็น space ทั้งหมด |
| `testParseOctal_nullTerminatorAtStart` | `currentByte==0` → break ทันที (iteration แรก) |
| `testParseOctal_invalidDigitThrows` | `currentByte<'0' \|\| currentByte>'7'` → throw exception |
| `testParseOctal_zeroLength` | loop ไม่ execute เลย (`i<end` false ทันที) |
| `testParseName_stopsAtNull` | `buffer[i]==0` → break |
| `testParseName_noNullReadsFullLength` | loop ครบ length โดยไม่ break |
| `testParseName_zeroLength` | loop ไม่ execute |
| `testParseName_immediateNull` | break ที่ iteration แรก |
| `testFormatNameBytes_paddingWhenNameShorter` | loop แรก (`i<name.length()`) จบก่อน length, loop สอง pad NUL |
| `testFormatNameBytes_truncateWhenNameLonger` | loop แรกหยุดเพราะ `i<length` (ไม่ครบ name) → loop สองไม่ execute |
| `testFormatNameBytes_exactFit` | ทั้งสอง loop มีค่าเท่ากันพอดี (loop สองไม่ execute) |
| `testFormatNameBytes_zeroLength` | ทั้งสอง loop ไม่ execute |
| `testFormatUnsignedOctalString_zeroValue` | branch `value==0` |
| `testFormatUnsignedOctalString_nonZeroFitsWithPadding` | branch `else`, loop คำนวณ digit, และ loop leading-zero padding |
| `testFormatUnsignedOctalString_bufferTooSmallThrows` | branch `val!=0` หลัง loop → throw exception |
| `testFormatOctalBytes_normal` | เรียก `formatUnsignedOctalString` สำเร็จ + เขียน space/NUL |
| `testFormatOctalBytes_valueTooLargeThrows` | exception propagate จาก `formatUnsignedOctalString` |
| `testFormatLongOctalBytes_normal` | เรียกสำเร็จ + เขียน trailing space |
| `testFormatLongOctalBytes_valueTooLargeThrows` | exception propagate |
| `testFormatCheckSumOctalBytes_normal` | เรียกสำเร็จ + เขียน NUL แล้ว space |
| `testFormatCheckSumOctalBytes_valueTooLargeThrows` | exception propagate |
| `testComputeCheckSum_emptyBuffer` | loop ไม่ execute (`buf.length==0`) |
| `testComputeCheckSum_normalBytes` | loop execute หลายรอบ, sum สะสมถูกต้อง |
| `testComputeCheckSum_negativeByteMasking` | ตรวจสอบการ mask ด้วย `BYTE_MASK` สำหรับ signed byte ลบ |

**หมายเหตุ:** ไม่มีการเดา behavior เพิ่มเติมนอกจากที่ปรากฏในซอร์สโค้ด เช่น ค่าของ `parseOctal` กับ input ที่ไม่ใช่ octal digit ถูกกำหนดชัดเจนว่า throw `IllegalArgumentException` จึงทดสอบตามนั้น ส่วนกรณี `offset`/`length` ที่ทำให้เกิด `ArrayIndexOutOfBoundsException` (เช่น length เกินขนาด array) ไม่ได้ทดสอบเนื่องจากไม่มีการจัดการ exception ดังกล่าวไว้ในซอร์สโค้ดอย่างชัดเจน (เป็น runtime exception ทั่วไปจาก array access)