# TarUtilsTest.java

```java
package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit4 test suite for org.apache.commons.compress.archivers.tar.TarUtils
 * (Defects4J Compress-14b)
 *
 * หมายเหตุ:
 * - ทดสอบตาม behavior ที่ปรากฏจริงใน source code เท่านั้น
 * - สำหรับ formatLongOctalOrBinaryBytes ใช้ค่าคงที่จาก TarConstants
 *   (UIDLEN, MAXID, MAXSIZE) โดยตรง ไม่ hardcode ตัวเลข เพื่อไม่เดา behavior
 */
public class TarUtilsTest {

    // ==================== parseOctal ====================

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_lengthLessThan2_throws() {
        byte[] buf = {0};
        TarUtils.parseOctal(buf, 0, 1);
    }

    @Test
    public void parseOctal_allNUL_returnsZero() {
        byte[] buf = new byte[8]; // all zero
        assertEquals(0L, TarUtils.parseOctal(buf, 0, 8));
    }

    @Test
    public void parseOctal_normalValue_primaryAndSecondaryTrailerRemoved() {
        // trailing NUL (primary) + space (secondary)
        byte[] buf = "755 \0".getBytes();
        assertEquals(493L, TarUtils.parseOctal(buf, 0, buf.length)); // 0755 = 493
    }

    @Test
    public void parseOctal_leadingSpacesSkipped() {
        byte[] buf = "  755 \0".getBytes();
        assertEquals(493L, TarUtils.parseOctal(buf, 0, buf.length));
    }

    @Test
    public void parseOctal_doubleTrailer_spaceSpace() {
        byte[] buf = "77  ".getBytes(); // two trailing spaces
        assertEquals(63L, TarUtils.parseOctal(buf, 0, buf.length)); // 077 = 63
    }

    @Test
    public void parseOctal_singleTrailer_secondarySkipped() {
        // last byte = space (primary removed), second-last = digit (secondary skipped)
        byte[] buf = {'7', '7', '7', ' '};
        assertEquals(511L, TarUtils.parseOctal(buf, 0, buf.length)); // 0777 = 511
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_invalidTrailer_throws() {
        byte[] buf = "755X".getBytes(); // no trailing NUL/space
        TarUtils.parseOctal(buf, 0, buf.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_invalidDigit_throws() {
        byte[] buf = "7A5 \0".getBytes();
        TarUtils.parseOctal(buf, 0, buf.length);
    }

    @Test
    public void parseOctal_withNonZeroOffset() {
        byte[] buf = "XX755 \0YY".getBytes();
        assertEquals(493L, TarUtils.parseOctal(buf, 2, 5));
    }

    // ==================== parseOctalOrBinary ====================

    @Test
    public void parseOctalOrBinary_highBitNotSet_delegatesToOctal() {
        byte[] buf = "755 \0".getBytes();
        assertEquals(493L, TarUtils.parseOctalOrBinary(buf, 0, buf.length));
    }

    @Test
    public void parseOctalOrBinary_highBitSet_binaryValue() {
        byte[] buf = new byte[] { (byte) 0x80, 5 };
        assertEquals(5L, TarUtils.parseOctalOrBinary(buf, 0, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctalOrBinary_binaryOverflow_throws() {
        byte[] buf = new byte[9];
        for (int i = 0; i < buf.length; i++) {
            buf[i] = (byte) 0xFF;
        }
        TarUtils.parseOctalOrBinary(buf, 0, buf.length);
    }

    // ==================== parseBoolean ====================

    @Test
    public void parseBoolean_true() {
        assertTrue(TarUtils.parseBoolean(new byte[] {1}, 0));
    }

    @Test
    public void parseBoolean_falseZero() {
        assertFalse(TarUtils.parseBoolean(new byte[] {0}, 0));
    }

    @Test
    public void parseBoolean_falseOther() {
        assertFalse(TarUtils.parseBoolean(new byte[] {2}, 0));
    }

    // ==================== parseName ====================

    @Test
    public void parseName_stopsAtNUL() {
        byte[] buf = "abc\0def".getBytes();
        assertEquals("abc", TarUtils.parseName(buf, 0, buf.length));
    }

    @Test
    public void parseName_noNUL_usesFullLength() {
        byte[] buf = "abcdef".getBytes();
        assertEquals("abcdef", TarUtils.parseName(buf, 0, buf.length));
    }

    @Test
    public void parseName_emptyImmediateNUL() {
        byte[] buf = {0, 'x', 'y'};
        assertEquals("", TarUtils.parseName(buf, 0, buf.length));
    }

    @Test
    public void parseName_signExtension() {
        byte[] buf = new byte[] { (byte) 0xFF };
        String name = TarUtils.parseName(buf, 0, 1);
        assertEquals(1, name.length());
        assertEquals(255, name.charAt(0));
    }

    // ==================== formatNameBytes ====================

    @Test
    public void formatNameBytes_shorterThanLength_padsNUL() {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatNameBytes("ab", buf, 0, 5);
        assertEquals(5, newOffset);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        assertEquals(0, buf[2]);
        assertEquals(0, buf[3]);
        assertEquals(0, buf[4]);
    }

    @Test
    public void formatNameBytes_longerThanLength_truncates() {
        byte[] buf = new byte[3];
        int newOffset = TarUtils.formatNameBytes("abcdef", buf, 0, 3);
        assertEquals(3, newOffset);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        assertEquals('c', buf[2]);
    }

    @Test
    public void formatNameBytes_emptyName_allNUL() {
        byte[] buf = new byte[3];
        TarUtils.formatNameBytes("", buf, 0, 3);
        assertEquals(0, buf[0]);
        assertEquals(0, buf[1]);
        assertEquals(0, buf[2]);
    }

    // ==================== formatUnsignedOctalString ====================

    @Test
    public void formatUnsignedOctalString_zeroValue() {
        byte[] buf = new byte[3];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 3);
        assertEquals("000", new String(buf));
    }

    @Test
    public void formatUnsignedOctalString_normalValue() {
        byte[] buf = new byte[3];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 3);
        assertEquals("010", new String(buf)); // 8 decimal = 010 octal
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatUnsignedOctalString_overflow_throws() {
        byte[] buf = new byte[1];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 1);
    }

    // ==================== formatOctalBytes ====================

    @Test
    public void formatOctalBytes_normal() {
        byte[] buf = new byte[6];
        int newOffset = TarUtils.formatOctalBytes(8L, buf, 0, 6);
        assertEquals(6, newOffset);
        assertEquals('0', buf[0]);
        assertEquals('0', buf[1]);
        assertEquals('1', buf[2]);
        assertEquals('0', buf[3]);
        assertEquals(' ', buf[4]);
        assertEquals(0, buf[5]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatOctalBytes_overflow_throws() {
        byte[] buf = new byte[3];
        TarUtils.formatOctalBytes(8L, buf, 0, 3);
    }

    // ==================== formatLongOctalBytes ====================

    @Test
    public void formatLongOctalBytes_normal() {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatLongOctalBytes(8L, buf, 0, 5);
        assertEquals(5, newOffset);
        assertEquals('0', buf[0]);
        assertEquals('0', buf[1]);
        assertEquals('1', buf[2]);
        assertEquals('0', buf[3]);
        assertEquals(' ', buf[4]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatLongOctalBytes_overflow_throws() {
        byte[] buf = new byte[2];
        TarUtils.formatLongOctalBytes(8L, buf, 0, 2);
    }

    // ==================== formatLongOctalOrBinaryBytes ====================

    @Test
    public void formatLongOctalOrBinaryBytes_octalPath_withinMaxId() {
        byte[] buf = new byte[TarConstants.UIDLEN];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(
                TarConstants.MAXID, buf, 0, TarConstants.UIDLEN);
        assertEquals(TarConstants.UIDLEN, newOffset);
        assertEquals(' ', buf[TarConstants.UIDLEN - 1]); // trailing space => octal path
    }

    @Test
    public void formatLongOctalOrBinaryBytes_binaryPath_exceedsMaxId() {
        byte[] buf = new byte[TarConstants.UIDLEN];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(
                TarConstants.MAXID + 1, buf, 0, TarConstants.UIDLEN);
        assertEquals(TarConstants.UIDLEN, newOffset);
        assertTrue((buf[0] & 0x80) != 0); // binary marker bit set
    }

    @Test
    public void formatLongOctalOrBinaryBytes_octalPath_usesMaxSizeForNonUidLength() {
        int length = 12; // != UIDLEN -> uses MAXSIZE
        byte[] buf = new byte[length];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(
                TarConstants.MAXSIZE, buf, 0, length);
        assertEquals(length, newOffset);
        assertEquals(' ', buf[length - 1]);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_binaryPath_usesMaxSizeForNonUidLength() {
        int length = 12;
        byte[] buf = new byte[length];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(
                TarConstants.MAXSIZE + 1, buf, 0, length);
        assertEquals(length, newOffset);
        assertTrue((buf[0] & 0x80) != 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatLongOctalOrBinaryBytes_binaryOverflow_throws() {
        int length = 4; // too small for Long.MAX_VALUE in binary form
        byte[] buf = new byte[length];
        TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, length);
    }

    // ==================== formatCheckSumOctalBytes ====================

    @Test
    public void formatCheckSumOctalBytes_normal() {
        byte[] buf = new byte[6];
        int newOffset = TarUtils.formatCheckSumOctalBytes(8L, buf, 0, 6);
        assertEquals(6, newOffset);
        assertEquals('0', buf[0]);
        assertEquals('0', buf[1]);
        assertEquals('1', buf[2]);
        assertEquals('0', buf[3]);
        assertEquals(0, buf[4]);
        assertEquals(' ', buf[5]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatCheckSumOctalBytes_overflow_throws() {
        byte[] buf = new byte[3];
        TarUtils.formatCheckSumOctalBytes(8L, buf, 0, 3);
    }

    // ==================== computeCheckSum ====================

    @Test
    public void computeCheckSum_emptyArray() {
        assertEquals(0L, TarUtils.computeCheckSum(new byte[0]));
    }

    @Test
    public void computeCheckSum_normalValues() {
        byte[] buf = {1, 2, 3};
        assertEquals(6L, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void computeCheckSum_negativeByteMasked() {
        byte[] buf = { (byte) 0xFF }; // -1 signed, ต้อง mask เป็น 255
        assertEquals(255L, TarUtils.computeCheckSum(buf));
    }
}
```

# สรุปตาราง Branch/Condition Coverage

| กลุ่มเมธอด | ชื่อ Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| parseOctal | `parseOctal_lengthLessThan2_throws` | `length < 2` → throw |
| | `parseOctal_allNUL_returnsZero` | `allNUL == true` → return 0 |
| | `parseOctal_normalValue_primaryAndSecondaryTrailerRemoved` | trailer NUL (primary) + space (secondary) ถูกตัด, loop digit ปกติ |
| | `parseOctal_leadingSpacesSkipped` | while-loop skip leading space (`start++`) |
| | `parseOctal_doubleTrailer_spaceSpace` | primary/secondary trailer เป็น space ทั้งคู่ |
| | `parseOctal_singleTrailer_secondarySkipped` | primary ตัด, secondary **ไม่** ตัด (else ของ second check) |
| | `parseOctal_invalidTrailer_throws` | trailer ไม่ใช่ NUL/space → throw |
| | `parseOctal_invalidDigit_throws` | digit invalid ในลูป → throw |
| | `parseOctal_withNonZeroOffset` | ตรวจ offset indexing |
| parseOctalOrBinary | `parseOctalOrBinary_highBitNotSet_delegatesToOctal` | `(buffer[offset]&0x80)==0` → delegate |
| | `parseOctalOrBinary_highBitSet_binaryValue` | else-branch, loop condition false ทุกครั้ง |
| | `parseOctalOrBinary_binaryOverflow_throws` | loop condition true → throw |
| parseBoolean | `parseBoolean_true/_falseZero/_falseOther` | `== 1` true/false ทุกกรณี |
| parseName | `parseName_stopsAtNUL` | `b==0` → break |
| | `parseName_noNUL_usesFullLength` | loop จบตามความยาวเต็ม (ไม่ break) |
| | `parseName_emptyImmediateNUL` | break ตั้งแต่ iteration แรก |
| | `parseName_signExtension` | ตรวจ `b & 0xFF` mask ถูกต้อง |
| formatNameBytes | `formatNameBytes_shorterThanLength_padsNUL` | loop1 หยุดจาก `i<name.length()`, loop2 (pad) ทำงาน |
| | `formatNameBytes_longerThanLength_truncates` | loop1 หยุดจาก `i<length`, loop2 ไม่ทำงาน |
| | `formatNameBytes_emptyName_allNUL` | loop1 ไม่ทำงานเลย (`name.length()==0`) |
| formatUnsignedOctalString | `formatUnsignedOctalString_zeroValue` | `value==0` branch |
| | `formatUnsignedOctalString_normalValue` | `value!=0`, loop หลายรอบ + leading-zero pad loop |
| | `formatUnsignedOctalString_overflow_throws` | `val!=0` หลัง loop → throw |
| formatOctalBytes | `_normal` / `_overflow_throws` | wrapper ปกติ / exception propagate |
| formatLongOctalBytes | `_normal` / `_overflow_throws` | wrapper ปกติ / exception propagate |
| formatLongOctalOrBinaryBytes | `_octalPath_withinMaxId` | `value<=maxAsOctalChar` (UIDLEN case) |
| | `_binaryPath_exceedsMaxId` | else-branch (UIDLEN), ไม่ throw, set bit 0x80 |
| | `_octalPath_usesMaxSizeForNonUidLength` | `value<=maxAsOctalChar` (MAXSIZE case) |
| | `_binaryPath_usesMaxSizeForNonUidLength` | else-branch (MAXSIZE case) |
| | `_binaryOverflow_throws` | `val!=0 \|\| (buf[offset]&0x80)!=0` → throw |
| formatCheckSumOctalBytes | `_normal` / `_overflow_throws` | wrapper ปกติ / exception propagate |
| computeCheckSum | `_emptyArray` | loop ไม่ทำงาน (`buf.length==0`) |
| | `_normalValues` | loop ทำงานปกติ |
| | `_negativeByteMasked` | ตรวจ `BYTE_MASK & buf[i]` กับ negative byte |

**หมายเหตุสำคัญ:** Javadoc ของ `parseOctal` ระบุว่า "leading NUL ควร return 0" แต่จาก source code จริงไม่มี logic ใดจัดการ leading-NUL แยกจาก all-NUL case (มีเพียง skip-space loop ที่ไม่ skip NUL) — จึงไม่ได้เขียนเทสสำหรับ behavior นี้ เนื่องจากไม่มีอยู่จริงในโค้ด (ตามข้อกำหนดที่ 4)