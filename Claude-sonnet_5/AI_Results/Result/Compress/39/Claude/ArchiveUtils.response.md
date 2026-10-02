```java
package org.apache.commons.compress.utils;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * JUnit 4 test suite for {@link ArchiveUtils}
 *
 * ครอบคลุมทุกเมธอด public และพยายามครอบคลุมทุกสาขา (branch) ที่วิเคราะห์ได้จากซอร์ส
 */
@RunWith(PowerMockRunner.class) // ใช้ PowerMockRunner เผื่อขยายทดสอบในอนาคต (ไม่จำเป็นต้อง mock static ในที่นี้)
public class ArchiveUtilsTest {

    // ---------------------------------------------------------------
    // toString(ArchiveEntry)
    // ---------------------------------------------------------------

    @Test
    public void testToString_directory_sizeZero() {
        ArchiveEntry entry = mock(ArchiveEntry.class);
        when(entry.isDirectory()).thenReturn(true);
        when(entry.getSize()).thenReturn(0L);
        when(entry.getName()).thenReturn("testdir");

        String result = ArchiveUtils.toString(entry);
        // 'd' + pad(7-width field for "0") + ' ' + name
        assertEquals("d       0 testdir", result);
    }

    @Test
    public void testToString_file_sizeShort() {
        ArchiveEntry entry = mock(ArchiveEntry.class);
        when(entry.isDirectory()).thenReturn(false);
        when(entry.getSize()).thenReturn(100L);
        when(entry.getName()).thenReturn("main.c");

        String result = ArchiveUtils.toString(entry);
        // "-" + pad(7-width for "100") + ' ' + name
        assertEquals("-     100 main.c", result);
    }

    @Test
    public void testToString_file_sizeExactly7Digits_noPadding() {
        ArchiveEntry entry = mock(ArchiveEntry.class);
        when(entry.isDirectory()).thenReturn(false);
        when(entry.getSize()).thenReturn(1234567L); // length == 7, loop condition false immediately
        when(entry.getName()).thenReturn("exact.bin");

        String result = ArchiveUtils.toString(entry);
        assertEquals("- 1234567 exact.bin", result);
    }

    @Test
    public void testToString_file_sizeLongerThan7Digits_noPadding() {
        ArchiveEntry entry = mock(ArchiveEntry.class);
        when(entry.isDirectory()).thenReturn(false);
        when(entry.getSize()).thenReturn(12345678L); // length 8 > 7, loop never executes
        when(entry.getName()).thenReturn("big.bin");

        String result = ArchiveUtils.toString(entry);
        assertEquals("- 12345678 big.bin", result);
    }

    @Test(expected = NullPointerException.class)
    public void testToString_nullEntry_throwsNPE() {
        // ไม่มี null-check ในซอร์ส จึงคาดหวัง NPE ตามพฤติกรรมปกติของ Java
        ArchiveUtils.toString(null);
    }

    // ---------------------------------------------------------------
    // matchAsciiBuffer(String, byte[], int, int)
    // ---------------------------------------------------------------

    @Test
    public void testMatchAsciiBuffer_offsetLength_match() {
        byte[] buffer = "XXhelloYY".getBytes();
        assertTrue(ArchiveUtils.matchAsciiBuffer("hello", buffer, 2, 5));
    }

    @Test
    public void testMatchAsciiBuffer_offsetLength_mismatch() {
        byte[] buffer = "XXhellY".getBytes();
        assertFalse(ArchiveUtils.matchAsciiBuffer("hello", buffer, 2, 5));
    }

    @Test
    public void testMatchAsciiBuffer_offsetLength_emptyExpectedAndBuffer() {
        byte[] buffer = new byte[0];
        assertTrue(ArchiveUtils.matchAsciiBuffer("", buffer, 0, 0));
    }

    @Test(expected = NullPointerException.class)
    public void testMatchAsciiBuffer_nullExpected_throwsNPE() {
        byte[] buffer = "hello".getBytes();
        ArchiveUtils.matchAsciiBuffer(null, buffer, 0, 5);
    }

    // ---------------------------------------------------------------
    // matchAsciiBuffer(String, byte[])  -- overload, offset=0, length=buffer.length
    // ---------------------------------------------------------------

    @Test
    public void testMatchAsciiBuffer_simple_match() {
        byte[] buffer = "MAGIC".getBytes();
        assertTrue(ArchiveUtils.matchAsciiBuffer("MAGIC", buffer));
    }

    @Test
    public void testMatchAsciiBuffer_simple_differentLength_mismatch() {
        byte[] buffer = "MAGIC".getBytes();
        assertFalse(ArchiveUtils.matchAsciiBuffer("MAG", buffer));
    }

    // ---------------------------------------------------------------
    // toAsciiBytes / toAsciiString round-trip
    // ---------------------------------------------------------------

    @Test
    public void testToAsciiBytes_and_toAsciiString_roundTrip() {
        byte[] bytes = ArchiveUtils.toAsciiBytes("Hello");
        String str = ArchiveUtils.toAsciiString(bytes);
        assertEquals("Hello", str);
    }

    @Test
    public void testToAsciiBytes_emptyString() {
        byte[] bytes = ArchiveUtils.toAsciiBytes("");
        assertEquals(0, bytes.length);
    }

    @Test(expected = NullPointerException.class)
    public void testToAsciiBytes_null_throwsNPE() {
        ArchiveUtils.toAsciiBytes(null);
    }

    @Test
    public void testToAsciiString_offsetLength() {
        byte[] bytes = "PrefixHelloSuffix".getBytes();
        String result = ArchiveUtils.toAsciiString(bytes, 6, 5);
        assertEquals("Hello", result);
    }

    @Test
    public void testToAsciiString_offsetLength_zeroLength() {
        byte[] bytes = "abc".getBytes();
        String result = ArchiveUtils.toAsciiString(bytes, 1, 0);
        assertEquals("", result);
    }

    // ---------------------------------------------------------------
    // isEqual(byte[], int, int, byte[], int, int, boolean) -- core logic
    // ---------------------------------------------------------------

    @Test
    public void testIsEqual_sameLengthEqualContent_true() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3};
        assertTrue(ArchiveUtils.isEqual(b1, 0, 3, b2, 0, 3, false));
    }

    @Test
    public void testIsEqual_sameLengthMismatchDuringLoop_false() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 9, 3}; // mismatch at index 1 -> early return false
        assertFalse(ArchiveUtils.isEqual(b1, 0, 3, b2, 0, 3, false));
    }

    @Test
    public void testIsEqual_differentLength_ignoreFalse_returnsFalse() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3, 0};
        assertFalse(ArchiveUtils.isEqual(b1, 0, 3, b2, 0, 4, false));
    }

    @Test
    public void testIsEqual_length1GreaterThanLength2_ignoreTrue_trailingZero_true() {
        byte[] b1 = {1, 2, 3, 0, 0};
        byte[] b2 = {1, 2, 3};
        assertTrue(ArchiveUtils.isEqual(b1, 0, 5, b2, 0, 3, true));
    }

    @Test
    public void testIsEqual_length1GreaterThanLength2_ignoreTrue_trailingNonZero_false() {
        byte[] b1 = {1, 2, 3, 0, 9}; // trailing has non-zero byte
        byte[] b2 = {1, 2, 3};
        assertFalse(ArchiveUtils.isEqual(b1, 0, 5, b2, 0, 3, true));
    }

    @Test
    public void testIsEqual_length1LessThanLength2_ignoreTrue_trailingZero_true() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3, 0, 0};
        assertTrue(ArchiveUtils.isEqual(b1, 0, 3, b2, 0, 5, true));
    }

    @Test
    public void testIsEqual_length1LessThanLength2_ignoreTrue_trailingNonZero_false() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3, 0, 9}; // trailing has non-zero byte
        assertFalse(ArchiveUtils.isEqual(b1, 0, 3, b2, 0, 5, true));
    }

    @Test
    public void testIsEqual_zeroLengthBoth_true() {
        byte[] b1 = {};
        byte[] b2 = {};
        assertTrue(ArchiveUtils.isEqual(b1, 0, 0, b2, 0, 0, false));
    }

    @Test
    public void testIsEqual_zeroLength1_ignoreTrue_trailingAllZero_true() {
        byte[] b1 = {};
        byte[] b2 = {0, 0, 0};
        assertTrue(ArchiveUtils.isEqual(b1, 0, 0, b2, 0, 3, true));
    }

    @Test
    public void testIsEqual_zeroLength1_ignoreFalse_false() {
        byte[] b1 = {};
        byte[] b2 = {0, 0, 0};
        assertFalse(ArchiveUtils.isEqual(b1, 0, 0, b2, 0, 3, false));
    }

    @Test
    public void testIsEqual_withOffsets() {
        byte[] b1 = {9, 9, 1, 2, 3};
        byte[] b2 = {1, 2, 3, 9, 9};
        assertTrue(ArchiveUtils.isEqual(b1, 2, 3, b2, 0, 3, false));
    }

    // ---------------------------------------------------------------
    // isEqual overloads
    // ---------------------------------------------------------------

    @Test
    public void testIsEqual_sixArgOverload_delegatesWithFalse() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3, 0}; // different length, default ignore=false -> false
        assertFalse(ArchiveUtils.isEqual(b1, 0, 3, b2, 0, 4));
    }

    @Test
    public void testIsEqual_twoArgOverload_equal() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3};
        assertTrue(ArchiveUtils.isEqual(b1, b2));
    }

    @Test
    public void testIsEqual_twoArgOverload_differentLength_false() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3, 0};
        assertFalse(ArchiveUtils.isEqual(b1, b2)); // default ignoreTrailingNulls=false
    }

    @Test
    public void testIsEqual_threeArgOverload_ignoreTrueTrailingZero_true() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3, 0, 0};
        assertTrue(ArchiveUtils.isEqual(b1, b2, true));
    }

    @Test
    public void testIsEqual_threeArgOverload_ignoreFalse_false() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3, 0, 0};
        assertFalse(ArchiveUtils.isEqual(b1, b2, false));
    }

    // ---------------------------------------------------------------
    // isEqualWithNull
    // ---------------------------------------------------------------

    @Test
    public void testIsEqualWithNull_trailingZero_true() {
        byte[] b1 = {1, 2, 3, 0, 0};
        byte[] b2 = {1, 2, 3};
        assertTrue(ArchiveUtils.isEqualWithNull(b1, 0, 5, b2, 0, 3));
    }

    @Test
    public void testIsEqualWithNull_trailingNonZero_false() {
        byte[] b1 = {1, 2, 3, 9};
        byte[] b2 = {1, 2, 3};
        assertFalse(ArchiveUtils.isEqualWithNull(b1, 0, 4, b2, 0, 3));
    }

    // ---------------------------------------------------------------
    // isArrayZero
    // ---------------------------------------------------------------

    @Test
    public void testIsArrayZero_sizeZero_true() {
        byte[] a = {1, 2, 3}; // เนื้อหาไม่สำคัญ เพราะ loop ไม่ execute เมื่อ size=0
        assertTrue(ArchiveUtils.isArrayZero(a, 0));
    }

    @Test
    public void testIsArrayZero_allZero_true() {
        byte[] a = {0, 0, 0, 5}; // ตรวจแค่ 3 ไบต์แรก
        assertTrue(ArchiveUtils.isArrayZero(a, 3));
    }

    @Test
    public void testIsArrayZero_firstByteNonZero_false() {
        byte[] a = {5, 0, 0};
        assertFalse(ArchiveUtils.isArrayZero(a, 3));
    }

    @Test
    public void testIsArrayZero_middleByteNonZero_false() {
        byte[] a = {0, 7, 0};
        assertFalse(ArchiveUtils.isArrayZero(a, 3));
    }

    @Test(expected = NullPointerException.class)
    public void testIsArrayZero_nullArray_throwsNPE() {
        ArchiveUtils.isArrayZero(null, 3);
    }

    // ---------------------------------------------------------------
    // sanitize
    // ---------------------------------------------------------------

    @Test
    public void testSanitize_emptyString() {
        assertEquals("", ArchiveUtils.sanitize(""));
    }

    @Test
    public void testSanitize_normalAsciiUnchanged() {
        assertEquals("Hello World", ArchiveUtils.sanitize("Hello World"));
    }

    @Test
    public void testSanitize_controlCharReplaced() {
        // '\n' (0x0A) เป็น ISO control char -> ถูกแทนด้วย '?'
        String input = "A\nB";
        String result = ArchiveUtils.sanitize(input);
        assertEquals("A?B", result);
    }

    @Test
    public void testSanitize_nullByteReplaced() {
        String input = "A\u0000B";
        String result = ArchiveUtils.sanitize(input);
        assertEquals("A?B", result);
    }

    @Test
    public void testSanitize_specialsBlockReplaced() {
        // U+FFFF อยู่ใน UnicodeBlock.SPECIALS -> ถูกแทนด้วย '?'
        String input = "A\uFFFFB";
        String result = ArchiveUtils.sanitize(input);
        assertEquals("A?B", result);
    }

    @Test
    public void testSanitize_mixedContent() {
        String input = "OK\t\uFFFFEnd"; // tab เป็น control char, \uFFFF เป็น specials
        String result = ArchiveUtils.sanitize(input);
        assertEquals("OK??End", result);
    }

    // หมายเหตุ: กรณี Character.UnicodeBlock.of(c) คืนค่า null (unassigned code point)
    // ขึ้นกับเวอร์ชัน JDK/Unicode data จึงไม่สามารถระบุ code point ที่แน่นอนได้อย่างมั่นใจ
    // จึงไม่เขียนเทสสำหรับสาขานี้เพื่อหลีกเลี่ยงการเดา behavior ที่ไม่แน่นอน
}
```

## สรุปตาราง Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testToString_directory_sizeZero` | `entry.isDirectory()` = true, size.length()=1 (padding loop เต็มรอบ) |
| `testToString_file_sizeShort` | `isDirectory()` = false, size.length()<7 (padding บางส่วน) |
| `testToString_file_sizeExactly7Digits_noPadding` | size.length()==7, loop condition false ทันที |
| `testToString_file_sizeLongerThan7Digits_noPadding` | size.length()>7, loop ไม่ execute |
| `testToString_nullEntry_throwsNPE` | null input (ไม่มี null-check ในซอร์ส) |
| `testMatchAsciiBuffer_offsetLength_match` / `_mismatch` / `_emptyExpectedAndBuffer` | isEqual ผ่าน matchAsciiBuffer เส้นทาง true/false, กรณีความยาว 0 |
| `testMatchAsciiBuffer_nullExpected_throwsNPE` | null expected string → NPE จาก getBytes() |
| `testMatchAsciiBuffer_simple_match` / `_differentLength_mismatch` | overload 2 อาร์กิวเมนต์, ความยาวเท่ากัน/ไม่เท่ากัน |
| `testToAsciiBytes_and_toAsciiString_roundTrip` | encode/decode ปกติ |
| `testToAsciiBytes_emptyString` | string ว่าง |
| `testToAsciiBytes_null_throwsNPE` | null input |
| `testToAsciiString_offsetLength` / `_zeroLength` | offset/length ปกติ และ length=0 |
| `testIsEqual_sameLengthEqualContent_true` | loop ผ่านหมด, `length1==length2` → true |
| `testIsEqual_sameLengthMismatchDuringLoop_false` | loop เจอ mismatch → return false ทันที |
| `testIsEqual_differentLength_ignoreFalse_returnsFalse` | length ไม่เท่ากัน, ignoreTrailingNulls=false → false (return สุดท้าย) |
| `testIsEqual_length1GreaterThanLength2_ignoreTrue_trailingZero_true` | length1>length2, ignore=true, trailing เป็น 0 ทั้งหมด → true |
| `testIsEqual_length1GreaterThanLength2_ignoreTrue_trailingNonZero_false` | length1>length2, ignore=true, trailing มีค่าไม่เป็น 0 → false |
| `testIsEqual_length1LessThanLength2_ignoreTrue_trailingZero_true` | length1<length2, ignore=true, trailing เป็น 0 → true |
| `testIsEqual_length1LessThanLength2_ignoreTrue_trailingNonZero_false` | length1<length2, ignore=true, trailing ไม่เป็น 0 → false |
| `testIsEqual_zeroLengthBoth_true` | minLen=0, length เท่ากัน (ทั้งคู่ 0) |
| `testIsEqual_zeroLength1_ignoreTrue_trailingAllZero_true` | length1=0<length2, ignore=true, trailing zero |
| `testIsEqual_zeroLength1_ignoreFalse_false` | length1=0<length2, ignore=false |
| `testIsEqual_withOffsets` | offset1/offset2 ไม่เป็น 0 |
| `testIsEqual_sixArgOverload_delegatesWithFalse` | overload 6 args, delegate ignoreTrailingNulls=false |
| `testIsEqual_twoArgOverload_equal` / `_differentLength_false` | overload 2 args, ความยาวเท่า/ไม่เท่า |
| `testIsEqual_threeArgOverload_ignoreTrueTrailingZero_true` / `_ignoreFalse_false` | overload 3 args ทั้ง true/false ของ ignoreTrailingNulls |
| `testIsEqualWithNull_trailingZero_true` / `_trailingNonZero_false` | isEqualWithNull delegate ignore=true, ทั้ง trailing zero/non-zero |
| `testIsArrayZero_sizeZero_true` | loop ไม่ execute (size=0) |
| `testIsArrayZero_allZero_true` | loop ผ่านหมดไม่เจอ non-zero |
| `testIsArrayZero_firstByteNonZero_false` / `_middleByteNonZero_false` | เจอ non-zero ที่ index ต่าง ๆ → return false |
| `testIsArrayZero_nullArray_throwsNPE` | null array |
| `testSanitize_emptyString` | loop ไม่ execute |
| `testSanitize_normalAsciiUnchanged` | ตัวอักษรปกติ ไม่ใช่ control, block != null และ != SPECIALS |
| `testSanitize_controlCharReplaced` / `_nullByteReplaced` | `Character.isISOControl(c)` = true → แทนที่ '?' |
| `testSanitize_specialsBlockReplaced` | block == SPECIALS → แทนที่ '?' |
| `testSanitize_mixedContent` | รวมทั้ง control char และ specials block ในสตริงเดียว |

**หมายเหตุสำคัญ:** ไม่ได้เขียนเทสสำหรับกรณี `Character.UnicodeBlock.of(c) == null` ใน `sanitize()` เนื่องจาก code point ที่ unassigned อาจแตกต่างกันไปตามเวอร์ชัน JDK/Unicode data ทำให้ไม่สามารถระบุ input ที่แน่นอนได้โดยไม่เดา behavior