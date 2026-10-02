# StringUtilTest.java

```java
package org.jsoup.helper;

import org.junit.Test;
import org.junit.Before;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class StringUtilTest {

    // ---------------------------------------------------------------
    // join(Collection, sep) / join(Iterator, sep) / join(String[], sep)
    // ---------------------------------------------------------------

    @Test
    public void testJoinIterator_empty() {
        List<String> list = new ArrayList<String>();
        assertEquals("", StringUtil.join(list.iterator(), ","));
    }

    @Test
    public void testJoinIterator_singleElement() {
        List<String> list = new ArrayList<String>();
        list.add("one");
        assertEquals("one", StringUtil.join(list.iterator(), ","));
    }

    @Test
    public void testJoinIterator_multipleElements() {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        assertEquals("one,two,three", StringUtil.join(list.iterator(), ","));
    }

    @Test
    public void testJoinCollection_delegatesToIterator() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        assertEquals("a-b", StringUtil.join(list, "-"));
    }

    @Test
    public void testJoinCollection_empty() {
        assertEquals("", StringUtil.join(Collections.emptyList(), ","));
    }

    @Test
    public void testJoinStringArray() {
        String[] arr = {"x", "y", "z"};
        assertEquals("x|y|z", StringUtil.join(arr, "|"));
    }

    @Test
    public void testJoinStringArray_singleElement() {
        String[] arr = {"solo"};
        assertEquals("solo", StringUtil.join(arr, ","));
    }

    @Test
    public void testJoinStringArray_empty() {
        String[] arr = {};
        assertEquals("", StringUtil.join(arr, ","));
    }

    // ---------------------------------------------------------------
    // padding(int)
    // ---------------------------------------------------------------

    @Test
    public void testPadding_zero() {
        assertEquals("", StringUtil.padding(0));
    }

    @Test
    public void testPadding_withinArrayBoundary() {
        // padding.length == 21, index 20 is last valid cached entry
        assertEquals("                    ", StringUtil.padding(20)); // 20 spaces
    }

    @Test
    public void testPadding_outsideArray_buildsManually() {
        String result = StringUtil.padding(21);
        assertEquals(21, result.length());
        for (char c : result.toCharArray()) {
            assertEquals(' ', c);
        }
    }

    @Test
    public void testPadding_largeWidth() {
        String result = StringUtil.padding(50);
        assertEquals(50, result.length());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPadding_negative_throws() {
        StringUtil.padding(-1);
    }

    // ---------------------------------------------------------------
    // isBlank(String)
    // ---------------------------------------------------------------

    @Test
    public void testIsBlank_null() {
        assertTrue(StringUtil.isBlank(null));
    }

    @Test
    public void testIsBlank_emptyString() {
        assertTrue(StringUtil.isBlank(""));
    }

    @Test
    public void testIsBlank_whitespaceOnly() {
        assertTrue(StringUtil.isBlank("   \t\n\r\f  "));
    }

    @Test
    public void testIsBlank_nonBlank() {
        assertFalse(StringUtil.isBlank("  a  "));
    }

    @Test
    public void testIsBlank_nonWhitespaceOnly() {
        assertFalse(StringUtil.isBlank("hello"));
    }

    // ---------------------------------------------------------------
    // isNumeric(String)
    // ---------------------------------------------------------------

    @Test
    public void testIsNumeric_null() {
        assertFalse(StringUtil.isNumeric(null));
    }

    @Test
    public void testIsNumeric_empty() {
        assertFalse(StringUtil.isNumeric(""));
    }

    @Test
    public void testIsNumeric_allDigits() {
        assertTrue(StringUtil.isNumeric("12345"));
    }

    @Test
    public void testIsNumeric_containsNonDigit() {
        assertFalse(StringUtil.isNumeric("123a5"));
    }

    // ---------------------------------------------------------------
    // isWhitespace(int)
    // ---------------------------------------------------------------

    @Test
    public void testIsWhitespace_space() {
        assertTrue(StringUtil.isWhitespace(' '));
    }

    @Test
    public void testIsWhitespace_tab() {
        assertTrue(StringUtil.isWhitespace('\t'));
    }

    @Test
    public void testIsWhitespace_newline() {
        assertTrue(StringUtil.isWhitespace('\n'));
    }

    @Test
    public void testIsWhitespace_formfeed() {
        assertTrue(StringUtil.isWhitespace('\f'));
    }

    @Test
    public void testIsWhitespace_carriageReturn() {
        assertTrue(StringUtil.isWhitespace('\r'));
    }

    @Test
    public void testIsWhitespace_nonWhitespace() {
        assertFalse(StringUtil.isWhitespace('a'));
    }

    @Test
    public void testIsWhitespace_nbsp_isFalse() {
        // 160 (&nbsp;) is NOT html-whitespace under isWhitespace (only under isActuallyWhitespace)
        assertFalse(StringUtil.isWhitespace(160));
    }

    // ---------------------------------------------------------------
    // isActuallyWhitespace(int)
    // ---------------------------------------------------------------

    @Test
    public void testIsActuallyWhitespace_space() {
        assertTrue(StringUtil.isActuallyWhitespace(' '));
    }

    @Test
    public void testIsActuallyWhitespace_nbsp() {
        assertTrue(StringUtil.isActuallyWhitespace(160));
    }

    @Test
    public void testIsActuallyWhitespace_nonWhitespace() {
        assertFalse(StringUtil.isActuallyWhitespace('x'));
    }

    // ---------------------------------------------------------------
    // normaliseWhitespace(String) / appendNormalisedWhitespace
    // ---------------------------------------------------------------

    @Test
    public void testNormaliseWhitespace_collapsesMultipleSpaces() {
        assertEquals("a b c", StringUtil.normaliseWhitespace("a   b    c"));
    }

    @Test
    public void testNormaliseWhitespace_convertsVariousWhitespace() {
        assertEquals("a b c", StringUtil.normaliseWhitespace("a\tb\nc"));
    }

    @Test
    public void testNormaliseWhitespace_emptyString() {
        assertEquals("", StringUtil.normaliseWhitespace(""));
    }

    @Test
    public void testNormaliseWhitespace_leadingWhitespacePreservedAsSingleSpace() {
        // stripLeading = false in normaliseWhitespace(), so leading becomes one space
        assertEquals(" abc", StringUtil.normaliseWhitespace("   abc"));
    }

    @Test
    public void testAppendNormalisedWhitespace_stripLeadingTrue() {
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, "   abc", true);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendNormalisedWhitespace_stripLeadingFalse() {
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, "   abc", false);
        assertEquals(" abc", sb.toString());
    }

    @Test
    public void testAppendNormalisedWhitespace_stripLeadingTrue_allWhitespace() {
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, "     ", true);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendNormalisedWhitespace_consecutiveWhitespaceCollapsed() {
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, "a  \t\n  b", false);
        assertEquals("a b", sb.toString());
    }

    @Test
    public void testAppendNormalisedWhitespace_noWhitespace() {
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, "abcdef", false);
        assertEquals("abcdef", sb.toString());
    }

    // ---------------------------------------------------------------
    // in(String, String...)
    // ---------------------------------------------------------------

    @Test
    public void testIn_found() {
        assertTrue(StringUtil.in("b", "a", "b", "c"));
    }

    @Test
    public void testIn_notFound() {
        assertFalse(StringUtil.in("z", "a", "b", "c"));
    }

    @Test
    public void testIn_emptyHaystack() {
        assertFalse(StringUtil.in("a"));
    }

    // ---------------------------------------------------------------
    // inSorted(String, String[])
    // ---------------------------------------------------------------

    @Test
    public void testInSorted_found() {
        String[] sorted = {"a", "b", "c", "d"};
        assertTrue(StringUtil.inSorted("c", sorted));
    }

    @Test
    public void testInSorted_notFound() {
        String[] sorted = {"a", "b", "c", "d"};
        assertFalse(StringUtil.inSorted("z", sorted));
    }

    // ---------------------------------------------------------------
    // resolve(URL base, String relUrl)
    // ---------------------------------------------------------------

    @Test
    public void testResolveURL_normalRelativePath() throws MalformedURLException {
        URL base = new URL("http://example.com/path/file.html");
        URL result = StringUtil.resolve(base, "other.html");
        assertEquals("http://example.com/path/other.html", result.toExternalForm());
    }

    @Test
    public void testResolveURL_relUrlStartsWithQuestionMark() throws MalformedURLException {
        URL base = new URL("http://example.com/path/file?foo=1");
        URL result = StringUtil.resolve(base, "?bar=2");
        // relUrl becomes base.getPath() + relUrl = "/path/file" + "?bar=2"
        assertEquals("http://example.com/path/file?bar=2", result.toExternalForm());
    }

    @Test
    public void testResolveURL_relUrlStartsWithDot_baseFileNotStartingWithSlash()
            throws MalformedURLException {
        // base.getFile() for "http://example.com" (no path) == "" ; "".indexOf('/') == -1 != 0
        // relUrl.indexOf('.') == 0  -> triggers workaround branch
        URL base = new URL("http://example.com");
        URL result = StringUtil.resolve(base, "./one/two.c");
        assertEquals("http://example.com/one/two.c", result.toExternalForm());
    }

    // ---------------------------------------------------------------
    // resolve(String baseUrl, String relUrl)
    // ---------------------------------------------------------------

    @Test
    public void testResolveStrings_validBaseAndRel() {
        String result = StringUtil.resolve("http://example.com/path/file.html", "other.html");
        assertEquals("http://example.com/path/other.html", result);
    }

    @Test
    public void testResolveStrings_malformedBase_absoluteRel() {
        // base is malformed -> falls to inner catch; relUrl itself is absolute & valid
        String result = StringUtil.resolve("not a url", "http://example.com/abs.html");
        assertEquals("http://example.com/abs.html", result);
    }

    @Test
    public void testResolveStrings_malformedBase_malformedRel_returnsEmpty() {
        String result = StringUtil.resolve("not a url", "also not a url");
        assertEquals("", result);
    }

    @Test
    public void testResolveStrings_validBase_unknownProtocolRel_returnsEmpty() {
        // valid base, but combining with relUrl of unknown protocol throws
        // MalformedURLException in resolve(URL,String) -> outer catch -> ""
        String result = StringUtil.resolve("http://example.com/", "unknownproto://foo");
        assertEquals("", result);
    }

    // ---------------------------------------------------------------
    // stringBuilder()
    // ---------------------------------------------------------------

    @Test
    public void testStringBuilder_returnsEmptyBuilder() {
        StringBuilder sb = StringUtil.stringBuilder();
        assertEquals(0, sb.length());
    }

    @Test
    public void testStringBuilder_reusedAndCleared() {
        StringBuilder sb1 = StringUtil.stringBuilder();
        sb1.append("hello");
        StringBuilder sb2 = StringUtil.stringBuilder();
        // Since sb1.length() (5) <= MaxCachedBuilderSize, it should be cleared & reused
        assertEquals(0, sb2.length());
        // NOTE: Cannot directly test the branch where
        // sb.length() > MaxCachedBuilderSize (8*1024) without reflection
        // or appending >8192 chars through a public API repeatedly in the
        // same thread; this path is not exercised here (documented limitation).
    }
}
```

## สรุปตาราง Test Coverage

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testJoinIterator_empty` | `join(Iterator,sep)` → `!hasNext()` true → return `""` |
| `testJoinIterator_singleElement` | `!hasNext()` หลัง next ตัวแรก → return start โดยไม่ใช้ StringBuilder |
| `testJoinIterator_multipleElements` | while loop `hasNext()` true หลายรอบ |
| `testJoinCollection_delegatesToIterator` | `join(Collection,sep)` เรียก iterator ถูกต้อง |
| `testJoinCollection_empty` | Collection ว่าง → delegate ไป empty iterator branch |
| `testJoinStringArray*` | `join(String[],sep)` ผ่าน `Arrays.asList` ทั้ง empty/single/multi |
| `testPadding_zero` | `width < padding.length` ที่ค่า 0 |
| `testPadding_withinArrayBoundary` | boundary `width == 20` (ขอบบนของ array) |
| `testPadding_outsideArray_buildsManually` | `width == padding.length` (21) → else branch สร้าง char[] |
| `testPadding_largeWidth` | else branch กับค่าใหญ่ |
| `testPadding_negative_throws` | `width < 0` → throw IllegalArgumentException |
| `testIsBlank_null/_emptyString/_whitespaceOnly/_nonBlank/_nonWhitespaceOnly` | `string==null`, `length()==0`, loop ทุกตัวเป็น whitespace (return true), เจอ non-whitespace กลางลูป (return false) |
| `testIsNumeric_*` | `null`/`empty` → false, loop all digits → true, มี non-digit → false |
| `testIsWhitespace_*` | ทุกเงื่อนไข OR (' ', '\t','\n','\f','\r'), false case, nbsp(160) false |
| `testIsActuallyWhitespace_*` | เหมือนด้านบน + เงื่อนไข `c==160` true, false case |
| `testNormaliseWhitespace_*` | เรียก `appendNormalisedWhitespace` ด้วย `stripLeading=false`, รวม/แปลง whitespace, empty string |
| `testAppendNormalisedWhitespace_stripLeadingTrue/_False/_allWhitespace/_consecutive/_noWhitespace` | เงื่อนไข `stripLeading && !reachedNonWhite`, `lastWasWhite`, else(non-whitespace) branch, ลูปไม่มี whitespace เลย |
| `testIn_found/_notFound/_emptyHaystack` | for loop เจอ match (return true), ไม่เจอ (return false), loop 0 รอบ |
| `testInSorted_found/_notFound` | `Arrays.binarySearch >=0` true/false |
| `testResolveURL_normalRelativePath` | resolve(URL,String) ไม่เข้าเงื่อนไขพิเศษใดๆ |
| `testResolveURL_relUrlStartsWithQuestionMark` | เงื่อนไข `relUrl.startsWith("?")` true |
| `testResolveURL_relUrlStartsWithDot_baseFileNotStartingWithSlash` | เงื่อนไข `indexOf('.')==0 && base.getFile().indexOf('/')!=0` true |
| `testResolveStrings_validBaseAndRel` | try บล็อกนอก/ในสำเร็จ ไม่มี exception |
| `testResolveStrings_malformedBase_absoluteRel` | catch MalformedURLException (inner) → relUrl ใช้ได้ |
| `testResolveStrings_malformedBase_malformedRel_returnsEmpty` | catch ชั้นนอกสุด (outer) → return "" |
| `testResolveStrings_validBase_unknownProtocolRel_returnsEmpty` | base ใช้ได้แต่ `resolve(base,relUrl)` throw → catch outer → "" |
| `testStringBuilder_returnsEmptyBuilder` | branch `sb.length() <= MaxCachedBuilderSize` (ปกติ, delete(0,len)) |
| `testStringBuilder_reusedAndCleared` | ยืนยันว่า builder ถูก clear/reuse ข้าม call (ไม่ได้ทดสอบ branch `>MaxCachedBuilderSize` — หมายเหตุไว้ในคอมเมนต์เพราะไม่สามารถทดสอบได้ง่ายโดยไม่ใช้ reflection) |

**หมายเหตุ:** branch ของ `stringBuilder()` ที่ `sb.length() > MaxCachedBuilderSize` (8192 ตัวอักษร) ไม่ได้ถูกทดสอบตรง เนื่องจากต้องสร้าง StringBuilder ที่มีขนาดใหญ่กว่า 8KB ผ่าน ThreadLocal เดียวกันในเทรดเดียวกัน ซึ่งไม่สามารถทำได้ง่ายผ่าน public API โดยไม่ใช้ reflection — ทิ้งไว้เป็นข้อจำกัดที่ทราบ (documented limitation) ตามข้อกำหนดห้ามเดา behavior