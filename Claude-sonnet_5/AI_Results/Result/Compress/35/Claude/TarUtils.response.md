# TarUtilsTest.java

```java
package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigInteger;

import org.apache.commons.compress.archivers.tar.TarUtils;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link TarUtils} (Defects4J Compress-35b target).
 * เน้น branch coverage และความสามารถในการดักจับ fault ตาม Javadoc contract ของแต่ละเมธอด
 */
public class TarUtilsTest {

    // =========================================================
    // parseOctal
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_LengthLessThan2_ThrowsException() {
        byte[] buf = {'7'};
        TarUtils.parseOctal(buf, 0, 1); // length < 2 -> throw
    }

    @Test
    public void parseOctal_LeadingNulReturnsZero() {
        byte[] buf = {0, '7', ' '};
        assertEquals(0L, TarUtils.parseOctal(buf, 0, 3));
    }

    @Test
    public void parseOctal_AllSpaces_ReturnsZero() {
        // buffer[start] != 0 (space), leading-space loop consumes all -> start==end -> result 0
        byte[] buf = {' ', ' ', ' ', ' '};
        assertEquals(0L, TarUtils.parseOctal(buf, 0, 4));
    }

    @Test
    public void parseOctal_MinimalLengthValid_ReturnsValue() {
        byte[] buf = {'7', 0};
        assertEquals(7L, TarUtils.parseOctal(buf, 0, 2));
    }

    @Test
    public void parseOctal_MinimalLengthAllTrimmed_ReturnsZero() {
        byte[] buf = {' ', 0};
        assertEquals(0L, TarUtils.parseOctal(buf, 0, 2));
    }

    @Test
    public void parseOctal_LeadingSpacesTrimmed_ValidValue() {
        byte[] buf = "  755 \0".getBytes();
        assertEquals(493L, TarUtils.parseOctal(buf, 0, buf.length));
    }

    @Test
    public void parseOctal_TrailingNulAndSpaceTrimmed_ValidValue() {
        byte[] buf = "755 \0".getBytes();
        assertEquals(493L, TarUtils.parseOctal(buf, 0, buf.length));
    }

    @Test
    public void parseOctal_InvalidDigit_ThrowsException() {
        byte[] buf = "789 \0".getBytes(); // '8','9' not valid octal
        try {
            TarUtils.parseOctal(buf, 0, buf.length);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid byte"));
        }
    }

    @Test
    public void parseOctal_SimpleValidOctal() {
        byte[] buf = "017 ".getBytes();
        assertEquals(15L, TarUtils.parseOctal(buf, 0, buf.length));
    }

    // =========================================================
    // parseOctalOrBinary
    // =========================================================

    @Test
    public void parseOctalOrBinary_DelegatesToParseOctal_WhenHighBitNotSet() {
        byte[] buf = "017 ".getBytes(); // high bit of first byte not set
        assertEquals(15L, TarUtils.parseOctalOrBinary(buf, 0, buf.length));
    }

    @Test
    public void parseOctalOrBinary_PositiveMarker_LongPath() {
        // length < 9 -> parseBinaryLong ; marker 0x80 => positive
        byte[] buf = {(byte) 0x80, 0, 0, 0, 0, 0, 0, 5};
        assertEquals(5L, TarUtils.parseOctalOrBinary(buf, 0, 8));
    }

    @Test
    public void parseOctalOrBinary_NegativeMarker_LongPath() {
        // marker 0xff => negative, remainder all 0xFF -> two's complement -1
        byte[] buf = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
                      (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
        assertEquals(-1L, TarUtils.parseOctalOrBinary(buf, 0, 8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctalOrBinary_PositiveMarker_BigIntegerPath_Overflow_Throws() {
        // length >= 9 -> parseBinaryBigInteger; huge magnitude (> 63 bits) -> throws
        byte[] buf = new byte[17];
        buf[0] = (byte) 0x80;
        for (int i = 1; i < 17; i++) buf[i] = 0x7F;
        TarUtils.parseOctalOrBinary(buf, 0, 17);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctalOrBinary_NegativeMarker_BigIntegerPath_Overflow_Throws() {
        byte[] buf = new byte[17];
        buf[0] = (byte) 0xff;
        for (int i = 1; i < 17; i++) buf[i] = 0x7F;
        TarUtils.parseOctalOrBinary(buf, 0, 17);
    }

    // =========================================================
    // parseBoolean
    // =========================================================

    @Test
    public void parseBoolean_True() {
        byte[] buf = {1};
        assertTrue(TarUtils.parseBoolean(buf, 0));
    }

    @Test
    public void parseBoolean_False() {
        byte[] buf = {0};
        assertFalse(TarUtils.parseBoolean(buf, 0));
        byte[] buf2 = {2}; // any non-1 value -> false
        assertFalse(TarUtils.parseBoolean(buf2, 0));
    }

    // =========================================================
    // parseName
    // =========================================================

    @Test
    public void parseName_StopsAtNul() throws IOException {
        byte[] buf = "abc\0\0\0\0\0\0\0".getBytes();
        assertEquals("abc", TarUtils.parseName(buf, 0, buf.length));
    }

    @Test
    public void parseName_NoNul_FullLength() throws IOException {
        byte[] buf = "abcde".getBytes();
        assertEquals("abcde", TarUtils.parseName(buf, 0, buf.length));
    }

    @Test
    public void parseName_AllNul_EmptyString() throws IOException {
        byte[] buf = new byte[5]; // all zero
        assertEquals("", TarUtils.parseName(buf, 0, buf.length));
    }

    @Test
    public void parseName_WithExplicitEncoding() throws IOException {
        ZipEncoding enc = ZipEncodingHelper.getZipEncoding("UTF-8");
        byte[] buf = "hello\0\0\0".getBytes("UTF-8");
        assertEquals("hello", TarUtils.parseName(buf, 0, buf.length, enc));
    }

    // =========================================================
    // formatNameBytes
    // =========================================================

    @Test
    public void formatNameBytes_ShorterThanBuffer_PadsWithNul() {
        byte[] buf = new byte[10];
        int newOffset = TarUtils.formatNameBytes("abc", buf, 0, 10);
        assertEquals(10, newOffset);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        assertEquals('c', buf[2]);
        for (int i = 3; i < 10; i++) {
            assertEquals(0, buf[i]); // trailing NUL padding
        }
    }

    @Test
    public void formatNameBytes_ExactLength_NoPadding() {
        byte[] buf = new byte[5];
        TarUtils.formatNameBytes("abcde", buf, 0, 5);
        assertEquals("abcde", new String(buf));
    }

    @Test
    public void formatNameBytes_LongerThanBuffer_Truncated() {
        byte[] buf = new byte[5];
        TarUtils.formatNameBytes("HelloWorld", buf, 0, 5);
        assertEquals("Hello", new String(buf)); // truncated via while-loop
    }

    // =========================================================
    // formatUnsignedOctalString
    // =========================================================

    @Test
    public void formatUnsignedOctalString_ZeroValue() {
        byte[] buf = new byte[6];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 6);
        assertEquals("000000", new String(buf));
    }

    @Test
    public void formatUnsignedOctalString_NonZeroFits() {
        byte[] buf = new byte[6];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 6); // 8 decimal = 10 octal
        assertEquals("000010", new String(buf));
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatUnsignedOctalString_TooLarge_Throws() {
        byte[] buf = new byte[2];
        TarUtils.formatUnsignedOctalString(64L, buf, 0, 2); // 64 = 100(oct) needs 3 digits
    }

    // =========================================================
    // formatOctalBytes / formatLongOctalBytes
    // =========================================================

    @Test
    public void formatOctalBytes_ValidValue() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatOctalBytes(8L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals("000010 ", new String(buf, 0, 7));
        assertEquals(0, buf[7]); // trailing NUL
    }

    @Test
    public void formatLongOctalBytes_ValidValue() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatLongOctalBytes(8L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals("0000010 ", new String(buf));
    }

    // =========================================================
    // formatCheckSumOctalBytes
    // =========================================================

    @Test
    public void formatCheckSumOctalBytes_ValidValue() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatCheckSumOctalBytes(8L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals("000010", new String(buf, 0, 6));
        assertEquals(0, buf[6]);       // trailing NUL
        assertEquals((byte) ' ', buf[7]); // trailing space
    }

    // =========================================================
    // formatLongOctalOrBinaryBytes
    // =========================================================

    @Test
    public void formatLongOctalOrBinaryBytes_UsesOctal_ForUidWithinRange() {
        byte[] buf = new byte[(int) TarConstants.UIDLEN];
        long value = 8L; // well within MAXID
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, buf.length);
        // Octal path -> first byte should NOT be the binary marker
        assertNotEquals((byte) 0x80, buf[0]);
        assertNotEquals((byte) 0xff, buf[0]);
        assertEquals(value, TarUtils.parseOctal(buf, 0, buf.length));
    }

    @Test
    public void formatLongOctalOrBinaryBytes_UsesOctal_ForSizeWithinRange() {
        int length = 12;
        byte[] buf = new byte[length];
        long value = 8L;
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, length);
        assertNotEquals((byte) 0x80, buf[0]);
        assertNotEquals((byte) 0xff, buf[0]);
        assertEquals(value, TarUtils.parseOctal(buf, 0, length));
    }

    @Test
    public void formatLongOctalOrBinaryBytes_NegativeValue_ShortLength_MarkerByteFF() {
        int length = (int) TarConstants.UIDLEN; // < 9
        byte[] buf = new byte[length];
        TarUtils.formatLongOctalOrBinaryBytes(-5L, buf, 0, length);
        assertEquals((byte) 0xff, buf[0]);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_PositiveOverflow_ShortLength_MarkerByte80() {
        int length = (int) TarConstants.UIDLEN; // < 9
        byte[] buf = new byte[length];
        long value = TarConstants.MAXID + 1; // exceeds octal range for UID field
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, length);
        assertEquals((byte) 0x80, buf[0]);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_PositiveOverflow_LongLength_MarkerByte80() {
        int length = 12; // >= 9
        byte[] buf = new byte[length];
        long value = TarConstants.MAXSIZE + 1;
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, length);
        assertEquals((byte) 0x80, buf[0]);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_NegativeValue_LongLength_MarkerByteFF() {
        int length = 12; // >= 9
        byte[] buf = new byte[length];
        TarUtils.formatLongOctalOrBinaryBytes(-123456789L, buf, 0, length);
        assertEquals((byte) 0xff, buf[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatLongOctalOrBinaryBytes_ValueTooLargeForShortBinary_Throws() {
        int length = (int) TarConstants.UIDLEN; // < 9, bits = 56
        byte[] buf = new byte[length];
        // Long.MAX_VALUE magnitude (~2^63) exceeds 2^56 -> formatLongBinary throws
        TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, length);
    }

    // ---- Round trip: format then parse back (functional / fault-detection tests) ----

    @Test
    public void roundTrip_FormatThenParse_PositiveValue_ShortLength() {
        int length = (int) TarConstants.UIDLEN; // < 9
        byte[] buf = new byte[length];
        long value = 123456789L; // exceeds MAXID, safely within binary range
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, length);
        assertEquals(value, TarUtils.parseOctalOrBinary(buf, 0, length));
    }

    @Test
    public void roundTrip_FormatThenParse_NegativeValue_ShortLength() {
        int length = (int) TarConstants.UIDLEN;
        byte[] buf = new byte[length];
        long value = -123456789L;
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, length);
        assertEquals(value, TarUtils.parseOctalOrBinary(buf, 0, length));
    }

    @Test
    public void roundTrip_FormatThenParse_PositiveValue_LongLength() {
        int length = 12; // >= 9
        byte[] buf = new byte[length];
        long value = 99999999999L; // exceeds MAXSIZE
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, length);
        assertEquals(value, TarUtils.parseOctalOrBinary(buf, 0, length));
    }

    @Test
    public void roundTrip_FormatThenParse_NegativeValue_LongLength() {
        int length = 12;
        byte[] buf = new byte[length];
        long value = -99999999999L;
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, length);
        assertEquals(value, TarUtils.parseOctalOrBinary(buf, 0, length));
    }

    // =========================================================
    // computeCheckSum
    // =========================================================

    @Test
    public void computeCheckSum_SumsUnsignedBytes() {
        byte[] buf = {(byte) 1, (byte) 2, (byte) -1}; // -1 as unsigned = 255
        assertEquals(1 + 2 + 255, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void computeCheckSum_EmptyArray() {
        assertEquals(0L, TarUtils.computeCheckSum(new byte[0]));
    }

    // =========================================================
    // verifyCheckSum
    // =========================================================

    @Test
    public void verifyCheckSum_ValidHeader_ReturnsTrue() {
        int chkOffset = TarConstants.CHKSUM_OFFSET;
        int chkLen = TarConstants.CHKSUMLEN;
        int totalLen = chkOffset + chkLen + 4; // a bit of extra data after checksum field

        byte[] header = new byte[totalLen];
        for (int i = 0; i < totalLen; i++) {
            header[i] = (byte) 'A'; // 65, positive byte value
        }
        // Compute the expected sum treating the checksum field as spaces (' ' = 32)
        long expectedSum = (long) (totalLen - chkLen) * 'A' + (long) chkLen * ' ';

        TarUtils.formatCheckSumOctalBytes(expectedSum, header, chkOffset, chkLen);

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_InvalidHeader_ReturnsFalse() {
        int chkOffset = TarConstants.CHKSUM_OFFSET;
        int chkLen = TarConstants.CHKSUMLEN;
        int totalLen = chkOffset + chkLen + 4;

        byte[] header = new byte[totalLen];
        for (int i = 0; i < totalLen; i++) {
            header[i] = (byte) 'A';
        }
        long expectedSum = (long) (totalLen - chkLen) * 'A' + (long) chkLen * ' ';
        TarUtils.formatCheckSumOctalBytes(expectedSum, header, chkOffset, chkLen);

        // Corrupt a non-checksum byte after computing the checksum
        header[0] = (byte) 'B';

        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_MalformedDigitsOverflow_ReturnsFalse() {
        // Craft a header where checksum field has MORE than 6 octal digit
        // characters ("digits>6" clamp branch), while the rest of the
        // header is all zero so the real sum is trivially computable by hand.
        int chkOffset = TarConstants.CHKSUM_OFFSET;
        int chkLen = TarConstants.CHKSUMLEN; // expected to be 8
        int totalLen = chkOffset + chkLen;

        byte[] header = new byte[totalLen]; // all zero elsewhere
        // "1234567 " -> more than 6 valid octal digits inside checksum field
        byte[] field = "1234567 ".getBytes();
        System.arraycopy(field, 0, header, chkOffset, Math.min(field.length, chkLen));

        // storedSum from first six digits "123456" (per production algorithm) = 42798
        // real unsigned/signed sum = chkLen * 32 (all other bytes are 0, checksum
        // field bytes replaced by space during summation) = 8*32 = 256
        // 42798 != 256 -> verifyCheckSum must return false
        assertFalse(TarUtils.verifyCheckSum(header));
    }
}
```

## สรุปตาราง Test Coverage

| กลุ่มเมธอด | Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| parseOctal | `parseOctal_LengthLessThan2_ThrowsException` | `length < 2` → throw |
| | `parseOctal_LeadingNulReturnsZero` | `buffer[start]==0` → return 0 |
| | `parseOctal_AllSpaces_ReturnsZero` | leading-space skip loop วิ่งจนสุด, for-loop ไม่รัน |
| | `parseOctal_MinimalLengthValid_ReturnsValue` | length=2 (boundary) valid digit |
| | `parseOctal_MinimalLengthAllTrimmed_ReturnsZero` | length=2 (boundary) all trimmed |
| | `parseOctal_LeadingSpacesTrimmed_ValidValue` | leading-space skip loop (บางตัว) |
| | `parseOctal_TrailingNulAndSpaceTrimmed_ValidValue` | trailing NUL/space trim loop |
| | `parseOctal_InvalidDigit_ThrowsException` | invalid byte → throw + message |
| | `parseOctal_SimpleValidOctal` | main for-loop คำนวณค่า |
| parseOctalOrBinary | `parseOctalOrBinary_DelegatesToParseOctal_WhenHighBitNotSet` | high bit ไม่ถูกตั้ง |
| | `parseOctalOrBinary_PositiveMarker_LongPath` | high bit set, marker≠0xff, length<9 |
| | `parseOctalOrBinary_NegativeMarker_LongPath` | marker==0xff, length<9 |
| | `parseOctalOrBinary_PositiveMarker_BigIntegerPath_Overflow_Throws` | length≥9, bitLength>63 → throw |
| | `parseOctalOrBinary_NegativeMarker_BigIntegerPath_Overflow_Throws` | negative + length≥9 overflow |
| parseBoolean | `parseBoolean_True` / `parseBoolean_False` | `==1` true/false branch |
| parseName | `parseName_StopsAtNul` / `_NoNul_FullLength` / `_AllNul_EmptyString` / `_WithExplicitEncoding` | for-loop trim NUL, `len>0` true/false, overload 4-args |
| formatNameBytes | `_ShorterThanBuffer_PadsWithNul` / `_ExactLength_NoPadding` / `_LongerThanBuffer_Truncated` | while-loop truncate, padding for-loop |
| formatUnsignedOctalString | `_ZeroValue` / `_NonZeroFits` / `_TooLarge_Throws` | `value==0`, normal loop, `val!=0` throw |
| formatOctalBytes / formatLongOctalBytes | ตามชื่อ | เรียก formatUnsignedOctalString + trailer bytes |
| formatCheckSumOctalBytes | `formatCheckSumOctalBytes_ValidValue` | NUL+space trailer |
| formatLongOctalOrBinaryBytes | `_UsesOctal_ForUidWithinRange` / `_UsesOctal_ForSizeWithinRange` | `!negative && value<=max` true (UID/SIZE) |
| | `_NegativeValue_ShortLength_MarkerByteFF` / `_PositiveOverflow_ShortLength_MarkerByte80` | binary path, `length<9` |
| | `_PositiveOverflow_LongLength_MarkerByte80` / `_NegativeValue_LongLength_MarkerByteFF` | binary path, `length>=9` |
| | `_ValueTooLargeForShortBinary_Throws` | formatLongBinary internal throw |
| | `roundTrip_*` (4 tests) | ทดสอบ correctness end-to-end (fault detection) |
| computeCheckSum | `_SumsUnsignedBytes` / `_EmptyArray` | unsigned sum, empty array (loop 0 รอบ) |
| verifyCheckSum | `_ValidHeader_ReturnsTrue` | storedSum == unsignedSum/signedSum |
| | `_InvalidHeader_ReturnsFalse` | mismatch → false |
| | `_MalformedDigitsOverflow_ReturnsFalse` | `digits++<6` false branch (digit overflow clamp) |

**หมายเหตุ:**
- `parseBinaryLong` exception branch (`length>=9` ภายในเมธอด private) **ไม่สามารถ trigger ได้** ผ่าน public API เพราะ `parseOctalOrBinary` เรียกเมื่อ `length<9` เท่านั้น — จึงไม่ได้เขียนเทสสำหรับ branch นี้ (unreachable จาก public interface)
- Fallback ไป `FALLBACK_ENCODING` ใน `parseName`/`formatNameBytes` (เมื่อ `DEFAULT_ENCODING` throw `IOException`) ไม่ได้ทดสอบ เนื่องจากไม่สามารถบังคับให้ `ZipEncodingHelper.getZipEncoding(null)` ทำงานผิดพลาดได้โดยไม่ปลอมแปลง encoding เอง — คอมเมนต์กำกับไว้ตามข้อกำหนดที่ 4