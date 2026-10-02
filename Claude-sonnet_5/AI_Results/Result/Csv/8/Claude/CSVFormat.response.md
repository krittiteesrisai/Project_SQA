# CSVFormatTest.java

```java
package org.apache.commons.csv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.StringReader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.Quote;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link CSVFormat} (Defects4J Csv-8b).
 * Note: บาง behavior ที่ไม่ชัดเจนจาก source (เช่น รายละเอียดการ format ของ CSVPrinter)
 * จะทดสอบเฉพาะผลลัพธ์ที่สามารถอนุมานได้จาก source ที่ให้มาเท่านั้น
 */
public class CSVFormatTest {

    // ---------- Constructor / newFormat ----------

    @Test
    public void testNewFormatValidDelimiter() {
        CSVFormat format = CSVFormat.newFormat(';');
        assertEquals(';', format.getDelimiter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormatDelimiterIsLF() {
        CSVFormat.newFormat('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormatDelimiterIsCR() {
        CSVFormat.newFormat('\r');
    }

    // ---------- withDelimiter ----------

    @Test
    public void testWithDelimiterValid() {
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');
        assertEquals(';', format.getDelimiter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiterLF() {
        CSVFormat.DEFAULT.withDelimiter('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiterCR() {
        CSVFormat.DEFAULT.withDelimiter('\r');
    }

    // ---------- withCommentStart ----------

    @Test
    public void testWithCommentStartChar() {
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        assertEquals(Character.valueOf('#'), format.getCommentStart());
        assertTrue(format.isCommentingEnabled());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentStartCharLineBreak() {
        CSVFormat.DEFAULT.withCommentStart('\n');
    }

    @Test
    public void testWithCommentStartNullDisables() {
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart((Character) null);
        assertNull(format.getCommentStart());
        assertFalse(format.isCommentingEnabled());
    }

    // ---------- withEscape ----------

    @Test
    public void testWithEscapeChar() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
        assertEquals(Character.valueOf('\\'), format.getEscape());
        assertTrue(format.isEscaping());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscapeCharLineBreak() {
        CSVFormat.DEFAULT.withEscape('\r');
    }

    @Test
    public void testWithEscapeNullDisables() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape((Character) null);
        assertNull(format.getEscape());
        assertFalse(format.isEscaping());
    }

    // ---------- withHeader ----------

    @Test
    public void testWithHeaderNull() {
        CSVFormat format = CSVFormat.DEFAULT.withHeader((String[]) null);
        assertNull(format.getHeader());
    }

    @Test
    public void testWithHeaderEmptyArray() {
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        assertNotNull(format.getHeader());
        assertEquals(0, format.getHeader().length);
    }

    @Test
    public void testWithHeaderValues() {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("a", "b", "c");
        assertArrayEquals(new String[] { "a", "b", "c" }, format.getHeader());
    }

    @Test
    public void testGetHeaderReturnsClone() {
        String[] original = { "a", "b" };
        CSVFormat format = CSVFormat.DEFAULT.withHeader(original);
        String[] h1 = format.getHeader();
        h1[0] = "modified"; // mutate the returned copy
        String[] h2 = format.getHeader();
        assertEquals("a", h2[0]); // internal state must be unaffected
    }

    // ---------- withIgnoreEmptyLines ----------

    @Test
    public void testWithIgnoreEmptyLinesTrue() {
        assertTrue(CSVFormat.DEFAULT.withIgnoreEmptyLines(true).getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreEmptyLinesFalse() {
        assertFalse(CSVFormat.DEFAULT.withIgnoreEmptyLines(false).getIgnoreEmptyLines());
    }

    // ---------- withIgnoreSurroundingSpaces ----------

    @Test
    public void testWithIgnoreSurroundingSpacesTrue() {
        assertTrue(CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true).getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithIgnoreSurroundingSpacesFalse() {
        assertFalse(CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(false).getIgnoreSurroundingSpaces());
    }

    // ---------- withNullString ----------

    @Test
    public void testWithNullStringSet() {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("N/A");
        assertEquals("N/A", format.getNullString());
        assertTrue(format.isNullHandling());
    }

    @Test
    public void testWithNullStringNull() {
        CSVFormat format = CSVFormat.DEFAULT.withNullString(null);
        assertNull(format.getNullString());
        assertFalse(format.isNullHandling());
    }

    // ---------- withQuoteChar ----------

    @Test
    public void testWithQuoteCharChar() {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('\'');
        assertEquals(Character.valueOf('\''), format.getQuoteChar());
        assertTrue(format.isQuoting());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteCharLineBreak() {
        CSVFormat.DEFAULT.withQuoteChar('\n');
    }

    @Test
    public void testWithQuoteCharNullDisables() {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar((Character) null);
        assertNull(format.getQuoteChar());
        assertFalse(format.isQuoting());
    }

    // ---------- withQuotePolicy ----------

    @Test
    public void testWithQuotePolicy() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\').withQuotePolicy(Quote.ALL);
        assertEquals(Quote.ALL, format.getQuotePolicy());
    }

    // ---------- withRecordSeparator ----------

    @Test
    public void testWithRecordSeparatorChar() {
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator('\n');
        assertEquals("\n", format.getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparatorString() {
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\r\n");
        assertEquals("\r\n", format.getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparatorNull() {
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator((String) null);
        assertNull(format.getRecordSeparator());
    }

    // ---------- withSkipHeaderRecord ----------

    @Test
    public void testWithSkipHeaderRecordTrue() {
        assertTrue(CSVFormat.DEFAULT.withSkipHeaderRecord(true).getSkipHeaderRecord());
    }

    @Test
    public void testWithSkipHeaderRecordFalse() {
        assertFalse(CSVFormat.DEFAULT.withSkipHeaderRecord(false).getSkipHeaderRecord());
    }

    // ---------- isXxx flag methods ----------

    @Test
    public void testIsCommentingEnabledTrueFalse() {
        assertTrue(CSVFormat.DEFAULT.withCommentStart('#').isCommentingEnabled());
        assertFalse(CSVFormat.DEFAULT.isCommentingEnabled());
    }

    @Test
    public void testIsEscapingTrueFalse() {
        assertTrue(CSVFormat.DEFAULT.withEscape('\\').isEscaping());
        assertFalse(CSVFormat.DEFAULT.isEscaping());
    }

    @Test
    public void testIsNullHandlingTrueFalse() {
        assertTrue(CSVFormat.DEFAULT.withNullString("NULL").isNullHandling());
        assertFalse(CSVFormat.DEFAULT.isNullHandling());
    }

    @Test
    public void testIsQuotingTrueFalse() {
        assertTrue(CSVFormat.DEFAULT.isQuoting()); // DEFAULT has '"' quote char
        assertFalse(CSVFormat.DEFAULT.withQuoteChar((Character) null).isQuoting());
    }

    // ---------- equals ----------

    @Test
    public void testEqualsSameInstance() {
        assertTrue(CSVFormat.DEFAULT.equals(CSVFormat.DEFAULT));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(CSVFormat.DEFAULT.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(CSVFormat.DEFAULT.equals("not a CSVFormat"));
    }

    @Test
    public void testEqualsDifferentDelimiter() {
        assertFalse(CSVFormat.DEFAULT.equals(CSVFormat.DEFAULT.withDelimiter(';')));
    }

    @Test
    public void testEqualsDifferentQuotePolicy() {
        CSVFormat f1 = CSVFormat.DEFAULT.withEscape('\\');
        CSVFormat f2 = f1.withQuotePolicy(Quote.ALL);
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEqualsQuoteCharBothNull() {
        CSVFormat f1 = CSVFormat.DEFAULT.withQuoteChar((Character) null).withEscape('\\');
        CSVFormat f2 = CSVFormat.DEFAULT.withQuoteChar((Character) null).withEscape('\\');
        assertTrue(f1.equals(f2));
    }

    @Test
    public void testEqualsQuoteCharOneNull() {
        CSVFormat f1 = CSVFormat.DEFAULT.withQuoteChar((Character) null).withEscape('\\');
        CSVFormat f2 = CSVFormat.DEFAULT; // has '"' quoteChar
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEqualsQuoteCharDifferentValue() {
        assertFalse(CSVFormat.DEFAULT.withQuoteChar('"').equals(CSVFormat.DEFAULT.withQuoteChar('\'')));
    }

    @Test
    public void testEqualsQuoteCharSameValue() {
        assertTrue(CSVFormat.DEFAULT.withQuoteChar('"').equals(CSVFormat.DEFAULT.withQuoteChar('"')));
    }

    @Test
    public void testEqualsCommentStartOneNull() {
        assertFalse(CSVFormat.DEFAULT.withCommentStart('#').equals(CSVFormat.DEFAULT));
    }

    @Test
    public void testEqualsCommentStartDifferent() {
        assertFalse(CSVFormat.DEFAULT.withCommentStart('#').equals(CSVFormat.DEFAULT.withCommentStart('!')));
    }

    @Test
    public void testEqualsCommentStartSame() {
        assertTrue(CSVFormat.DEFAULT.withCommentStart('#').equals(CSVFormat.DEFAULT.withCommentStart('#')));
    }

    @Test
    public void testEqualsEscapeOneNull() {
        assertFalse(CSVFormat.DEFAULT.withEscape('\\').equals(CSVFormat.DEFAULT));
    }

    @Test
    public void testEqualsEscapeDifferent() {
        assertFalse(CSVFormat.DEFAULT.withEscape('\\').equals(CSVFormat.DEFAULT.withEscape('/')));
    }

    @Test
    public void testEqualsEscapeSame() {
        assertTrue(CSVFormat.DEFAULT.withEscape('\\').equals(CSVFormat.DEFAULT.withEscape('\\')));
    }

    @Test
    public void testEqualsNullStringOneNull() {
        assertFalse(CSVFormat.DEFAULT.withNullString("NULL").equals(CSVFormat.DEFAULT));
    }

    @Test
    public void testEqualsNullStringDifferent() {
        assertFalse(CSVFormat.DEFAULT.withNullString("NULL").equals(CSVFormat.DEFAULT.withNullString("N/A")));
    }

    @Test
    public void testEqualsNullStringSame() {
        assertTrue(CSVFormat.DEFAULT.withNullString("NULL").equals(CSVFormat.DEFAULT.withNullString("NULL")));
    }

    @Test
    public void testEqualsHeaderDifferent() {
        assertFalse(CSVFormat.DEFAULT.withHeader("a", "b").equals(CSVFormat.DEFAULT.withHeader("a", "c")));
    }

    @Test
    public void testEqualsHeaderSame() {
        assertTrue(CSVFormat.DEFAULT.withHeader("a", "b").equals(CSVFormat.DEFAULT.withHeader("a", "b")));
    }

    @Test
    public void testEqualsIgnoreSurroundingSpacesDifferent() {
        assertFalse(CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true)
                .equals(CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(false)));
    }

    @Test
    public void testEqualsIgnoreEmptyLinesDifferent() {
        assertFalse(CSVFormat.DEFAULT.withIgnoreEmptyLines(true)
                .equals(CSVFormat.DEFAULT.withIgnoreEmptyLines(false)));
    }

    @Test
    public void testEqualsSkipHeaderRecordDifferent() {
        assertFalse(CSVFormat.DEFAULT.withSkipHeaderRecord(true)
                .equals(CSVFormat.DEFAULT.withSkipHeaderRecord(false)));
    }

    @Test
    public void testEqualsRecordSeparatorBothNull() {
        CSVFormat f1 = CSVFormat.DEFAULT.withRecordSeparator((String) null);
        CSVFormat f2 = CSVFormat.DEFAULT.withRecordSeparator((String) null);
        assertTrue(f1.equals(f2));
    }

    @Test
    public void testEqualsRecordSeparatorOneNull() {
        CSVFormat f1 = CSVFormat.DEFAULT.withRecordSeparator((String) null);
        CSVFormat f2 = CSVFormat.DEFAULT; // has CRLF
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEqualsRecordSeparatorDifferent() {
        assertFalse(CSVFormat.DEFAULT.withRecordSeparator("\n")
                .equals(CSVFormat.DEFAULT.withRecordSeparator("\r\n")));
    }

    @Test
    public void testEqualsFullyEqualObjects() {
        CSVFormat f1 = CSVFormat.DEFAULT;
        CSVFormat f2 = CSVFormat.DEFAULT;
        assertTrue(f1.equals(f2));
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCodeConsistentForEqualObjects() {
        CSVFormat f1 = CSVFormat.DEFAULT.withHeader("a", "b").withCommentStart('#')
                .withEscape('\\').withNullString("NULL");
        CSVFormat f2 = CSVFormat.DEFAULT.withHeader("a", "b").withCommentStart('#')
                .withEscape('\\').withNullString("NULL");
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    // ---------- format ----------

    @Test
    public void testFormatSimpleValues() {
        String result = CSVFormat.DEFAULT.format("a", "b", "c");
        assertEquals("a,b,c", result);
    }

    // ---------- parse ----------

    @Test
    public void testParseReturnsParser() throws IOException {
        CSVParser parser = CSVFormat.DEFAULT.parse(new StringReader("a,b,c"));
        assertNotNull(parser);
    }

    // ---------- toString ----------

    @Test
    public void testToStringDefaultFormat() {
        String s = CSVFormat.DEFAULT.toString();
        assertTrue(s.contains("Delimiter=<,>"));
        assertTrue(s.contains("EmptyLines:ignored"));
        assertTrue(s.contains("SkipHeaderRecord:false"));
        assertFalse(s.contains("Escape="));
        assertFalse(s.contains("CommentStart="));
        assertFalse(s.contains("NullString="));
    }

    @Test
    public void testToStringWithAllOptionsEnabled() {
        CSVFormat format = CSVFormat.DEFAULT
                .withEscape('\\')
                .withCommentStart('#')
                .withNullString("NULL")
                .withHeader("a", "b")
                .withIgnoreSurroundingSpaces(true);
        String s = format.toString();
        assertTrue(s.contains("Escape=<\\>"));
        assertTrue(s.contains("QuoteChar=<\">"));
        assertTrue(s.contains("CommentStart=<#>"));
        assertTrue(s.contains("NullString=<NULL>"));
        assertTrue(s.contains("SurroundingSpaces:ignored"));
        assertTrue(s.contains("Header:"));
    }

    @Test
    public void testToStringNoRecordSeparator() {
        String s = CSVFormat.DEFAULT.withRecordSeparator((String) null).toString();
        assertFalse(s.contains("RecordSeparator="));
    }

    // ---------- validate ----------

    @Test(expected = IllegalStateException.class)
    public void testValidateQuoteCharEqualsDelimiter() {
        CSVFormat.newFormat(',').withQuoteChar(',').withEscape('\\').validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateEscapeEqualsDelimiter() {
        CSVFormat.newFormat(',').withEscape(',').validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateCommentStartEqualsDelimiter() {
        CSVFormat.newFormat(',').withCommentStart(',').withEscape('\\').validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateQuoteCharEqualsCommentStart() {
        CSVFormat.newFormat(';').withQuoteChar('#').withCommentStart('#').withEscape('\\').validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateEscapeEqualsCommentStart() {
        CSVFormat.newFormat(';').withEscape('#').withCommentStart('#').validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateNoEscapeAndQuotePolicyNone() {
        CSVFormat.newFormat(',').withQuotePolicy(Quote.NONE).validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateDuplicateHeaderNames() {
        CSVFormat.DEFAULT.withEscape('\\').withHeader("a", "b", "a").validate();
    }

    @Test
    public void testValidateValidFormatNoException() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\').withHeader("a", "b", "c");
        format.validate(); // ต้องไม่ throw
    }

    @Test
    public void testValidateNoQuoteNoEscapeQuotePolicyNotNone() {
        // escape == null แต่ quotePolicy != Quote.NONE (เป็น null) -> ไม่ throw
        CSVFormat format = CSVFormat.newFormat(',').withQuoteChar((Character) null);
        format.validate();
    }

    // ---------- predefined format constants sanity ----------

    @Test
    public void testPredefinedFormats() {
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());

        assertFalse(CSVFormat.RFC4180.getIgnoreEmptyLines());
        assertFalse(CSVFormat.EXCEL.getIgnoreEmptyLines());

        assertEquals('\t', CSVFormat.TDF.getDelimiter());
        assertTrue(CSVFormat.TDF.getIgnoreSurroundingSpaces());

        assertEquals('\t', CSVFormat.MYSQL.getDelimiter());
        assertEquals(Character.valueOf('\\'), CSVFormat.MYSQL.getEscape());
        assertNull(CSVFormat.MYSQL.getQuoteChar());
        assertFalse(CSVFormat.MYSQL.getIgnoreEmptyLines());
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testNewFormatValidDelimiter | Constructor ปกติ, `isLineBreak(char)` = false |
| testNewFormatDelimiterIsLF/CR | Constructor throws, `isLineBreak(char)` c==LF, c==CR = true |
| testWithDelimiterValid/LF/CR | `withDelimiter` + `isLineBreak(char)` ทั้ง 2 สาขา |
| testWithCommentStartChar/CharLineBreak/NullDisables | `withCommentStart` overloads, `isLineBreak(Character)` null/non-null/linebreak |
| testWithEscapeChar/CharLineBreak/NullDisables | `withEscape` overloads เช่นเดียวกัน |
| testWithHeaderNull/EmptyArray/Values | header==null branch ใน constructor, header.clone() branch |
| testGetHeaderReturnsClone | `getHeader()` clone-not-null branch, ป้องกัน mutation |
| testWithIgnoreEmptyLinesTrue/False | ค่า boolean ทั้งสองฝั่ง |
| testWithIgnoreSurroundingSpacesTrue/False | ค่า boolean ทั้งสองฝั่ง |
| testWithNullStringSet/Null | `isNullHandling()` true/false |
| testWithQuoteCharChar/LineBreak/NullDisables | `withQuoteChar` overloads + isLineBreak |
| testWithQuotePolicy | getter ปกติ |
| testWithRecordSeparatorChar/String/Null | `withRecordSeparator` overloads, null branch |
| testWithSkipHeaderRecordTrue/False | ค่า boolean ทั้งสองฝั่ง |
| testIsCommentingEnabledTrueFalse ฯลฯ | `isCommentingEnabled/isEscaping/isNullHandling/isQuoting` true/false |
| testEqualsSameInstance | `this == obj` = true |
| testEqualsNull | `obj == null` = true |
| testEqualsDifferentClass | `getClass() != obj.getClass()` = true |
| testEqualsDifferentDelimiter | `delimiter != other.delimiter` = true |
| testEqualsDifferentQuotePolicy | `quotePolicy != other.quotePolicy` = true |
| testEqualsQuoteChar* (4 tests) | quoteChar null/null, null/non-null, diff value, same value |
| testEqualsCommentStart* (3 tests) | commentStart null/non-null, diff, same |
| testEqualsEscape* (3 tests) | escape null/non-null, diff, same |
| testEqualsNullString* (3 tests) | nullString null/non-null, diff, same |
| testEqualsHeaderDifferent/Same | `Arrays.equals(header,...)` true/false |
| testEqualsIgnoreSurroundingSpacesDifferent | boolean != branch |
| testEqualsIgnoreEmptyLinesDifferent | boolean != branch |
| testEqualsSkipHeaderRecordDifferent | boolean != branch |
| testEqualsRecordSeparator* (3 tests) | recordSeparator null/null, null/non-null, diff |
| testEqualsFullyEqualObjects | ผ่านทุก condition ถึง `return true` |
| testHashCodeConsistentForEqualObjects | ตรวจ hashCode ของทุกฟิลด์ที่ set |
| testFormatSimpleValues | `format()` เส้นทางปกติ (ไม่ throw IOException) |
| testParseReturnsParser | `parse()` เส้นทางปกติ |
| testToStringDefaultFormat | toString: ทุก if = false ยกเว้น ignoreEmptyLines/skipHeaderRecord |
| testToStringWithAllOptionsEnabled | toString: ทุก if = true (escape, quote, comment, null, header, spaces) |
| testToStringNoRecordSeparator | `recordSeparator != null` = false branch |
| testValidateQuoteCharEqualsDelimiter | validate(): quoteChar==delimiter throw |
| testValidateEscapeEqualsDelimiter | validate(): escape==delimiter throw |
| testValidateCommentStartEqualsDelimiter | validate(): commentStart==delimiter throw |
| testValidateQuoteCharEqualsCommentStart | validate(): quoteChar.equals(commentStart) throw |
| testValidateEscapeEqualsCommentStart | validate(): escape.equals(commentStart) throw |
| testValidateNoEscapeAndQuotePolicyNone | validate(): escape==null && quotePolicy==NONE throw |
| testValidateDuplicateHeaderNames | validate(): header duplicate names throw |
| testValidateValidFormatNoException | validate(): ทุกเงื่อนไข false, ไม่ throw |
| testValidateNoQuoteNoEscapeQuotePolicyNotNone | validate(): escape==null, quotePolicy!=NONE ไม่ throw |
| testPredefinedFormats | ตรวจค่าคงที่ DEFAULT/RFC4180/EXCEL/TDF/MYSQL |

**หมายเหตุ:** การทดสอบ `format()` และ `parse()` ใช้เพื่อยืนยันว่าเมธอด delegate ไปยัง `CSVPrinter`/`CSVParser` ได้สำเร็จตาม source ที่ให้มา โดยไม่ได้ตรวจสอบ behavior ภายในของ `CSVPrinter`/`CSVParser` เนื่องจากไม่ได้อยู่ใน scope ของคลาสเป้าหมาย