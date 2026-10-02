# WordUtilsTest.java (JUnit 4)

```java
package org.apache.commons.lang;

import static org.junit.Assert.*;
import org.junit.Test;

import org.apache.commons.lang.WordUtils; // import คลาสเป้าหมาย (อยู่ package เดียวกัน ระบุไว้ตามข้อกำหนด)

/**
 * Unit tests สำหรับ org.apache.commons.lang.WordUtils (Lang-45b)
 * มุ่งเน้นให้ครอบคลุม branch/condition ของทุกเมธอด public
 * ค่าที่คาดหวัง (expected) คำนวณด้วยมือตามตรรกะของซอร์สที่ให้มา
 */
public class WordUtilsTest {

    // ============================================================
    // wrap(String, int)  /  wrap(String, int, String, boolean)
    // ============================================================

    @Test
    public void testWrap_NullAndEmpty() {
        assertNull(WordUtils.wrap(null, 20));
        assertEquals("", WordUtils.wrap("", 20));
        // 4-arg overload null check
        assertNull(WordUtils.wrap(null, 20, "\n", true));
    }

    @Test
    public void testWrap_WrapLengthLessThanOne() {
        // wrapLength = 0 -> ต้องถูกปรับเป็น 1 ; ไม่มี space เลยจึงไม่ wrap
        assertEquals("abc", WordUtils.wrap("abc", 0, "\n", false));
        // wrapLength ติดลบ เช่นเดียวกัน
        assertEquals("abc", WordUtils.wrap("abc", -5, "\n", false));
    }

    @Test
    public void testWrap_LeadingSpaceSkipped() {
        // offset เลื่อนไปตรงกับ space พอดีหลัง wrap รอบแรก -> ทดสอบ branch charAt(offset)==' '
        String sep = System.getProperty("line.separator");
        assertEquals("aa" + sep + "bbbb", WordUtils.wrap("aa  bbbb", 2));
    }

    @Test
    public void testWrap_NormalCase_SpaceFoundWithinWrapLength() {
        // spaceToWrapAt >= offset -> normal case (เกิดขึ้น 2 ครั้งในลูป)
        assertEquals("aa\nbbbbb\ncc", WordUtils.wrap("aa bbbbb cc", 5, "\n", false));
    }

    @Test
    public void testWrap_LongWord_WrapLongWordsTrue() {
        // ไม่มี space เลย, wrapLongWords = true -> ตัดคำยาวทีละ wrapLength
        assertEquals("01234\n56789", WordUtils.wrap("0123456789", 5, "\n", true));
    }

    @Test
    public void testWrap_LongWord_NoWrap_NoSpaceFoundAtAll() {
        // ไม่มี space เลย, wrapLongWords = false, indexOf(space) ก็ไม่พบ -> ปล่อยคำยาวผ่านไปเลย
        assertEquals("0123456789", WordUtils.wrap("0123456789", 5, "\n", false));
    }

    @Test
    public void testWrap_LongWord_NoWrap_SpaceFoundAfterWrapLength() {
        // lastIndexOf ไม่พบ(ในช่วง offset..wrapLength) แต่ indexOf หา space เจอถัดไป -> branch spaceToWrapAt>=0
        assertEquals("aaaaaa\nbbbb", WordUtils.wrap("aaaaaa bbbb", 3, "\n", false));
    }

    @Test
    public void testWrap_CustomNewLineStr() {
        assertEquals("aaaaa<br/>bbbbb", WordUtils.wrap("aaaaa bbbbb", 5, "<br/>", false));
    }

    @Test
    public void testWrap_TwoArgOverload_UsesSystemLineSeparator() {
        String sep = System.getProperty("line.separator");
        assertEquals("aa" + sep + "bbbbb" + sep + "cc",
                WordUtils.wrap("aa bbbbb cc", 5));
    }

    // ============================================================
    // capitalize(String) / capitalize(String, char[])
    // ============================================================

    @Test
    public void testCapitalize_NullEmptyAndEmptyDelimiterArray() {
        assertNull(WordUtils.capitalize(null, null));
        assertEquals("", WordUtils.capitalize("", null));
        // delimLen == 0 -> คืนค่าเดิมไม่เปลี่ยนแปลง
        assertEquals("abc", WordUtils.capitalize("abc", new char[0]));
    }

    @Test
    public void testCapitalize_DefaultWhitespaceDelimiters() {
        assertEquals("I Am Fine", WordUtils.capitalize("i am fine", null));
    }

    @Test
    public void testCapitalize_CustomDelimiters() {
        // '.' เป็น delimiter เท่านั้น ส่วน space ไม่ใช่ -> ทดสอบ branch isDelimiter / capitalizeNext / else
        assertEquals("I aM.Fine", WordUtils.capitalize("i aM.fine", new char[] { '.' }));
    }

    @Test
    public void testCapitalize_OneArgOverloadDelegatesCorrectly() {
        assertEquals("Hello World", WordUtils.capitalize("hello world"));
    }

    // ============================================================
    // capitalizeFully(String) / capitalizeFully(String, char[])
    // ============================================================

    @Test
    public void testCapitalizeFully_NullEmptyAndEmptyDelimiterArray() {
        assertNull(WordUtils.capitalizeFully(null, null));
        assertEquals("", WordUtils.capitalizeFully("", null));
        assertEquals("ABC", WordUtils.capitalizeFully("ABC", new char[0]));
    }

    @Test
    public void testCapitalizeFully_DefaultWhitespaceDelimiters() {
        assertEquals("I Am Fine", WordUtils.capitalizeFully("i am FINE"));
    }

    @Test
    public void testCapitalizeFully_CustomDelimiters() {
        assertEquals("I am.Fine", WordUtils.capitalizeFully("i aM.fine", new char[] { '.' }));
    }

    @Test
    public void testCapitalizeFully_OneArgOverloadDelegatesCorrectly() {
        assertEquals("Hello World", WordUtils.capitalizeFully("HELLO WORLD"));
    }

    // ============================================================
    // uncapitalize(String) / uncapitalize(String, char[])
    // ============================================================

    @Test
    public void testUncapitalize_NullEmptyAndEmptyDelimiterArray() {
        assertNull(WordUtils.uncapitalize(null, null));
        assertEquals("", WordUtils.uncapitalize("", null));
        assertEquals("ABC", WordUtils.uncapitalize("ABC", new char[0]));
    }

    @Test
    public void testUncapitalize_DefaultWhitespaceDelimiters() {
        assertEquals("i am fINE", WordUtils.uncapitalize("I Am FINE"));
    }

    @Test
    public void testUncapitalize_CustomDelimiters() {
        assertEquals("i AM.fINE", WordUtils.uncapitalize("I AM.FINE", new char[] { '.' }));
    }

    @Test
    public void testUncapitalize_OneArgOverloadDelegatesCorrectly() {
        assertEquals("hELLO wORLD", WordUtils.uncapitalize("HELLO WORLD"));
    }

    // ============================================================
    // swapCase(String)
    // ============================================================

    @Test
    public void testSwapCase_NullAndEmpty() {
        assertNull(WordUtils.swapCase(null));
        assertEquals("", WordUtils.swapCase(""));
    }

    @Test
    public void testSwapCase_AllBranches() {
        // 'a' lower, whitespace(start)=true  -> titlecase 'A'
        // 'B' upper -> lower 'b'
        // '1' other -> unchanged, whitespace=false
        // ' ' other(space) -> unchanged, whitespace=true
        // 'c' lower, whitespace=true -> titlecase 'C'
        // 'd' lower, whitespace=false -> upper 'D'
        // ' ' other -> whitespace=true
        // '\u01C5' เป็น TitleCase char (Lt) -> lower '\u01C6'
        String input = "aB1 cd \u01C5";
        String expected = "Ab1 CD \u01C6";
        assertEquals(expected, WordUtils.swapCase(input));
    }

    // ============================================================
    // initials(String) / initials(String, char[])
    // ============================================================

    @Test
    public void testInitials_NullEmptyAndEmptyDelimiterArray() {
        assertNull(WordUtils.initials(null, null));
        assertEquals("", WordUtils.initials("", null));
        // delimiters != null && length==0 -> คืน ""
        assertEquals("", WordUtils.initials("Ben John Lee", new char[0]));
    }

    @Test
    public void testInitials_DefaultWhitespaceDelimiters() {
        // ครอบคลุม branch lastWasGap=true (ตัวแรก), isDelimiter(whitespace), และ else-ignore (ตัวอักษรถัดไปในคำ)
        assertEquals("BJL", WordUtils.initials("Ben John Lee", null));
    }

    @Test
    public void testInitials_DefaultWhitespace_WithNonDelimiterDot() {
        // '.' ไม่ใช่ delimiter เมื่อใช้ default (whitespace only) -> "Ben J.Lee" -> "BJ"
        assertEquals("BJ", WordUtils.initials("Ben J.Lee", null));
    }

    @Test
    public void testInitials_CustomDelimiters() {
        assertEquals("BJL", WordUtils.initials("Ben J.Lee", new char[] { ' ', '.' }));
    }

    @Test
    public void testInitials_OneArgOverloadDelegatesCorrectly() {
        assertEquals("HW", WordUtils.initials("Hello World"));
    }

    // ============================================================
    // abbreviate(String, int, int, String)
    // ============================================================

    @Test
    public void testAbbreviate_NullAndEmpty() {
        assertNull(WordUtils.abbreviate(null, 1, 5, "-"));
        assertEquals("", WordUtils.abbreviate("", 1, 5, "-"));
    }

    @Test
    public void testAbbreviate_UpperEqualsStrLength_NoAppend() {
        // upper == str.length() -> ไม่ append หลัง abbreviate (index==-1 branch, upper==str.length())
        assertEquals("0123456789", WordUtils.abbreviate("0123456789", 5, 10, "-"));
    }

    @Test
    public void testAbbreviate_UpperMinusOne_TreatedAsStrLength() {
        // upper == -1 -> set เป็น str.length() เช่นกัน
        assertEquals("0123456789", WordUtils.abbreviate("0123456789", 5, -1, "-"));
    }

    @Test
    public void testAbbreviate_UpperGreaterThanStrLength_AdjustedToStrLength() {
        // upper > str.length() -> ถูกปรับเป็น str.length()
        assertEquals("0123456789", WordUtils.abbreviate("0123456789", 5, 100, "-"));
    }

    @Test
    public void testAbbreviate_IndexMinusOne_WithAppend() {
        // ไม่มี space, upper != str.length() -> append appendToEnd
        assertEquals("01234-", WordUtils.abbreviate("0123456789", 2, 5, "-"));
    }

    @Test
    public void testAbbreviate_AppendToEndNull_UsesEmptyString() {
        // appendToEnd == null -> StringUtils.defaultString(null) = ""
        assertEquals("01234", WordUtils.abbreviate("0123456789", 2, 5, null));
    }

    @Test
    public void testAbbreviate_UpperLessThanLower_Adjusted() {
        // upper(2) < lower(5) -> upper ปรับเป็น lower(5)
        assertEquals("abcdeX", WordUtils.abbreviate("abcdef", 5, 2, "X"));
    }

    @Test
    public void testAbbreviate_IndexGreaterThanUpper() {
        // พบ space แต่ index > upper -> ตัดที่ upper แล้ว append
        assertEquals("01234-", WordUtils.abbreviate("0123456789 abc", 2, 5, "-"));
    }

    @Test
    public void testAbbreviate_IndexLessEqualUpper_NormalBreakAtSpace() {
        // พบ space และ index <= upper -> ตัดที่ space แล้ว append
        assertEquals("0123-", WordUtils.abbreviate("0123 456789", 2, -1, "-"));
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testWrap_NullAndEmpty` | `str==null` return null (ทั้ง 2 overload), `str.length()==0` return "" |
| `testWrap_WrapLengthLessThanOne` | `wrapLength<1` ปรับเป็น 1, long-word branch ไม่มี space เลย (wrapLongWords=false) |
| `testWrap_LeadingSpaceSkipped` | `charAt(offset)==' '` → `offset++; continue` |
| `testWrap_NormalCase_SpaceFoundWithinWrapLength` | `spaceToWrapAt>=offset` (normal case) เกิดซ้ำในลูป |
| `testWrap_LongWord_WrapLongWordsTrue` | `spaceToWrapAt<offset` + `wrapLongWords==true` |
| `testWrap_LongWord_NoWrap_NoSpaceFoundAtAll` | `wrapLongWords==false` + `indexOf space < 0` (else สุดท้าย) |
| `testWrap_LongWord_NoWrap_SpaceFoundAfterWrapLength` | `wrapLongWords==false` + `indexOf space >=0` |
| `testWrap_CustomNewLineStr` | `newLineStr != null` (ไม่ใช้ default separator) |
| `testWrap_TwoArgOverload_UsesSystemLineSeparator` | `newLineStr==null` → ใช้ `SystemUtils.LINE_SEPARATOR`, delegate จาก 2-arg |
| `testCapitalize_NullEmptyAndEmptyDelimiterArray` | `str==null`, `length==0`, `delimLen==0` |
| `testCapitalize_DefaultWhitespaceDelimiters` | `delimiters==null` (whitespace), `capitalizeNext` true/false |
| `testCapitalize_CustomDelimiters` | `isDelimiter` loop พบ/ไม่พบใน array ที่กำหนด |
| `testCapitalize_OneArgOverloadDelegatesCorrectly` | delegate 1-arg → 2-arg |
| `testCapitalizeFully_*` | เหมือน capitalize แต่ครอบ `toLowerCase()` ก่อน + delegate 1-arg |
| `testUncapitalize_*` | เหมือน capitalize แต่ lower-case branch + delegate 1-arg |
| `testSwapCase_NullAndEmpty` | `str==null`, `length==0` |
| `testSwapCase_AllBranches` | `isUpperCase`, `isTitleCase`, `isLowerCase`&`whitespace=true/false`, else(other char), การอัปเดต `whitespace` |
| `testInitials_NullEmptyAndEmptyDelimiterArray` | `str==null/length==0`, `delimiters!=null && length==0` |
| `testInitials_DefaultWhitespaceDelimiters` | `isDelimiter`, `lastWasGap==true`, else-ignore branch |
| `testInitials_DefaultWhitespace_WithNonDelimiterDot` | ตรวจว่า `.` ไม่ใช่ whitespace delimiter |
| `testInitials_CustomDelimiters` | delimiters array ที่ไม่ใช่ null |
| `testInitials_OneArgOverloadDelegatesCorrectly` | delegate 1-arg → 2-arg |
| `testAbbreviate_NullAndEmpty` | `str==null`, `str.length()==0` |
| `testAbbreviate_UpperEqualsStrLength_NoAppend` | `index==-1` + `upper==str.length()` (ไม่ append) |
| `testAbbreviate_UpperMinusOne_TreatedAsStrLength` | `upper==-1` ปรับค่า |
| `testAbbreviate_UpperGreaterThanStrLength_AdjustedToStrLength` | `upper>str.length()` ปรับค่า |
| `testAbbreviate_IndexMinusOne_WithAppend` | `index==-1` + `upper!=str.length()` (append) |
| `testAbbreviate_AppendToEndNull_UsesEmptyString` | `StringUtils.defaultString(null)` |
| `testAbbreviate_UpperLessThanLower_Adjusted` | `upper<lower` ปรับ upper=lower |
| `testAbbreviate_IndexGreaterThanUpper` | `index>upper` branch |
| `testAbbreviate_IndexLessEqualUpper_NormalBreakAtSpace` | else branch (`index<=upper`, ปกติ) |

**หมายเหตุ:** การทดสอบ `swapCase` ใช้ `Character.isTitleCase('\u01C5')` (Unicode Lt category) เพื่อครอบ branch title-case ซึ่งเป็น behavior ที่มีอยู่จริงใน JDK `Character` class ไม่ได้เดาเพิ่มเติมจากซอร์สที่ให้มา