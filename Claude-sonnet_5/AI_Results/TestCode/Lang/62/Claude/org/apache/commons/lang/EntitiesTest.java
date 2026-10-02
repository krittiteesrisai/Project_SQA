package org.apache.commons.lang;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

/**
 * Unit tests for {@link Entities} (Defects4J Lang-62b).
 * NOTE: Entities เป็น package-private class จึงต้องอยู่ใน package เดียวกัน (ไม่ต้อง import)
 */
public class EntitiesTest {

    // ===================== Helper: Writer ที่ throw IOException เสมอ =====================
    // ใช้แทนการ mock ด้วย EasyMock เพื่อความแน่นอน (Writer เป็น abstract class,
    // ทุก write(...) concrete method จะเรียกผ่าน write(char[],int,int) ภายใน)
    private static class ThrowingWriter extends Writer {
        @Override
        public void write(char[] cbuf, int off, int len) throws IOException {
            throw new IOException("boom");
        }
        @Override
        public void flush() throws IOException { }
        @Override
        public void close() throws IOException { }
    }

    // ===================== addEntity / addEntities / entityName / entityValue =====================

    @Test
    public void testAddEntityAndLookup() {
        Entities entities = new Entities();
        entities.addEntity("foo", 161);
        assertEquals(161, entities.entityValue("foo"));
        assertEquals("foo", entities.entityName(161));
    }

    @Test
    public void testEntityValue_NotFound() {
        Entities entities = new Entities();
        assertEquals(-1, entities.entityValue("doesNotExist"));
    }

    @Test
    public void testEntityName_NotFound() {
        Entities entities = new Entities();
        assertNull(entities.entityName(99999));
    }

    @Test
    public void testAddEntities_Array() {
        Entities entities = new Entities();
        String[][] arr = { {"a", "65"}, {"b", "66"} };
        entities.addEntities(arr);
        assertEquals(65, entities.entityValue("a"));
        assertEquals(66, entities.entityValue("b"));
    }

    @Test(expected = NumberFormatException.class)
    public void testAddEntities_MalformedNumber() {
        // ค่าที่ parse ไม่ได้ -> ต้อง throw NumberFormatException (ไม่มี try/catch ใน addEntities)
        Entities entities = new Entities();
        String[][] arr = { {"bad", "notanumber"} };
        entities.addEntities(arr);
    }

    @Test
    public void testStaticXML() {
        assertEquals(34, Entities.XML.entityValue("quot"));
        assertEquals(38, Entities.XML.entityValue("amp"));
        assertEquals(60, Entities.XML.entityValue("lt"));
        assertEquals(62, Entities.XML.entityValue("gt"));
        assertEquals(39, Entities.XML.entityValue("apos"));
    }

    @Test
    public void testStaticHTML32() {
        assertEquals(34, Entities.HTML32.entityValue("quot"));
        assertEquals(160, Entities.HTML32.entityValue("nbsp"));
    }

    @Test
    public void testStaticHTML40() {
        assertEquals(34, Entities.HTML40.entityValue("quot"));
        assertEquals(160, Entities.HTML40.entityValue("nbsp"));
        assertEquals(402, Entities.HTML40.entityValue("fnof"));
    }

    // ===================== escape(String) =====================

    @Test
    public void testEscape_EmptyString() {
        Entities entities = new Entities();
        assertEquals("", entities.escape(""));
    }

    @Test
    public void testEscape_PlainAscii_NoEntity() {
        Entities entities = new Entities();
        assertEquals("abc", entities.escape("abc"));
    }

    @Test
    public void testEscape_KnownEntity() {
        Entities entities = Entities.HTML32;
        assertEquals("&lt;", entities.escape("<"));
    }

    @Test
    public void testEscape_HighCharNoEntity() {
        Entities entities = new Entities();
        char ch = 0x1234;
        String expected = "&#" + (int) ch + ";";
        assertEquals(expected, entities.escape(String.valueOf(ch)));
    }

    @Test
    public void testEscape_BoundaryCharacter0x7F() {
        // เงื่อนไข ch > 0x7F : ที่ 0x7F (127) ต้องไม่ถูก escape เป็น numeric
        Entities entities = new Entities();
        assertEquals("\u007F", entities.escape("\u007F"));
    }

    @Test
    public void testEscape_BoundaryCharacter0x80() {
        // ที่ 0x80 (128) ต้องถูก escape เป็น numeric
        Entities entities = new Entities();
        char ch = 0x80;
        assertEquals("&#128;", entities.escape(String.valueOf(ch)));
    }

    @Test
    public void testEscape_MixedContent() {
        Entities entities = Entities.HTML32;
        String input = "a<b>c&\u00A0";
        String result = entities.escape(input);
        assertTrue(result.contains("&lt;"));
        assertTrue(result.contains("&gt;"));
        assertTrue(result.contains("&amp;"));
        assertTrue(result.contains("&nbsp;"));
    }

    // ===================== escape(Writer, String) =====================

    @Test
    public void testEscapeWriter_EmptyString() throws IOException {
        Entities entities = new Entities();
        StringWriter sw = new StringWriter();
        entities.escape(sw, "");
        assertEquals("", sw.toString());
    }

    @Test
    public void testEscapeWriter_Basic() throws IOException {
        Entities entities = Entities.HTML32;
        StringWriter sw = new StringWriter();
        entities.escape(sw, "<>&");
        assertEquals("&lt;&gt;&amp;", sw.toString());
    }

    @Test
    public void testEscapeWriter_HighCharNoEntity() throws IOException {
        Entities entities = new Entities();
        StringWriter sw = new StringWriter();
        char ch = 0x1234;
        entities.escape(sw, String.valueOf(ch));
        assertEquals("&#" + (int) ch + ";", sw.toString());
    }

    @Test
    public void testEscapeWriter_PlainAscii() throws IOException {
        Entities entities = new Entities();
        StringWriter sw = new StringWriter();
        entities.escape(sw, "abc");
        assertEquals("abc", sw.toString());
    }

    @Test(expected = IOException.class)
    public void testEscapeWriter_IOExceptionPropagation() throws IOException {
        Entities entities = new Entities();
        entities.escape(new ThrowingWriter(), "a");
    }

    // ===================== unescape(String) =====================

    @Test
    public void testUnescape_EmptyString() {
        Entities entities = new Entities();
        assertEquals("", entities.unescape(""));
    }

    @Test
    public void testUnescape_NoAmpersand() {
        Entities entities = new Entities();
        assertEquals("abc", entities.unescape("abc"));
    }

    @Test
    public void testUnescape_PrefixBeforeAmpersand() {
        Entities entities = Entities.HTML32;
        assertEquals("abc<def", entities.unescape("abc&lt;def"));
    }

    @Test
    public void testUnescape_NoSemicolonAfterAmp() {
        // semi == -1 -> append '&' literal แล้ว continue
        Entities entities = new Entities();
        assertEquals("a&b", entities.unescape("a&b"));
    }

    @Test
    public void testUnescape_MalformedDoubleAmp_DefaultEntities() {
        // &...&...; -> & แรกถูก append literal, ตัวที่สองไม่ resolve (ไม่มี entity ชื่อ bar)
        Entities entities = new Entities();
        assertEquals("&foo&bar;", entities.unescape("&foo&bar;"));
    }

    @Test
    public void testUnescape_MalformedDoubleAmp_SecondEntityResolved() {
        // & แรกยังคง literal เพราะดู "เหมือน" &...&...; แต่ entity ที่สอง (lt) resolve ได้
        Entities entities = Entities.HTML32;
        assertEquals("&foo<", entities.unescape("&foo&lt;"));
    }

    @Test
    public void testUnescape_EmptyEntityName() {
        // entityName.length() == 0 -> entityValue = -1
        Entities entities = new Entities();
        assertEquals("&;", entities.unescape("&;"));
    }

    @Test
    public void testUnescape_NumericDecimal() {
        Entities entities = new Entities();
        assertEquals("A", entities.unescape("&#65;"));
    }

    @Test
    public void testUnescape_NumericHexLower() {
        Entities entities = new Entities();
        assertEquals("A", entities.unescape("&#x41;"));
    }

    @Test
    public void testUnescape_NumericHexUpper() {
        Entities entities = new Entities();
        assertEquals("A", entities.unescape("&#X41;"));
    }

    @Test
    public void testUnescape_NumericHashOnly() {
        // entityName.length() == 1 ("#") -> entityValue = -1
        Entities entities = new Entities();
        assertEquals("&#;", entities.unescape("&#;"));
    }

    @Test
    public void testUnescape_NumericDecimalMalformed() {
        // NumberFormatException -> entityValue = -1
        Entities entities = new Entities();
        assertEquals("&#abc;", entities.unescape("&#abc;"));
    }

    @Test
    public void testUnescape_NumericHexMalformed() {
        // NumberFormatException จาก hex parse -> entityValue = -1
        Entities entities = new Entities();
        assertEquals("&#xZZ;", entities.unescape("&#xZZ;"));
    }

    @Test
    public void testUnescape_NamedEntityFound() {
        Entities entities = Entities.HTML32;
        assertEquals("<", entities.unescape("&lt;"));
    }

    @Test
    public void testUnescape_NamedEntityNotFound() {
        Entities entities = new Entities();
        assertEquals("&unknown;", entities.unescape("&unknown;"));
    }

    @Test
    public void testUnescape_MultipleEntities() {
        Entities entities = Entities.HTML32;
        assertEquals("<a>&b", entities.unescape("&lt;a&gt;&amp;b"));
    }

    // ===================== unescape(Writer, String) =====================

    @Test
    public void testUnescapeWriter_EmptyString() throws IOException {
        Entities entities = new Entities();
        StringWriter sw = new StringWriter();
        entities.unescape(sw, "");
        assertEquals("", sw.toString());
    }

    @Test
    public void testUnescapeWriter_NoAmpersand() throws IOException {
        Entities entities = new Entities();
        StringWriter sw = new StringWriter();
        entities.unescape(sw, "abc");
        assertEquals("abc", sw.toString());
    }

    @Test
    public void testUnescapeWriter_PrefixBeforeAmpersand() throws IOException {
        Entities entities = Entities.HTML32;
        StringWriter sw = new StringWriter();
        entities.unescape(sw, "abc&lt;def");
        assertEquals("abc<def", sw.toString());
    }

    @Test
    public void testUnescapeWriter_NoSemicolon() throws IOException {
        Entities entities = new Entities();
        StringWriter sw = new StringWriter();
        entities.unescape(sw, "a&b");
        assertEquals("a&b", sw.toString());
    }

    @Test
    public void testUnescapeWriter_MalformedDoubleAmp_DefaultEntities() throws IOException {
        Entities entities = new Entities();
        StringWriter sw = new StringWriter();
        entities.unescape(sw, "&foo&bar;");
        assertEquals("&foo&bar;", sw.toString());
    }

    @Test
    public void testUnescapeWriter_MalformedDoubleAmp_SecondEntityResolved() throws IOException {
        Entities entities = Entities.HTML32;
        StringWriter sw = new StringWriter();
        entities.unescape(sw, "&foo&lt;");
        assertEquals("&foo<", sw.toString());
    }

    @Test
    public void testUnescapeWriter_EmptyEntityContent() throws IOException {
        Entities entities = new Entities();
        StringWriter sw = new StringWriter();
        entities.unescape(sw, "&;");
        assertEquals("&;", sw.toString());
    }

    @Test
    public void testUnescapeWriter_NumericDecimal() throws IOException {
        Entities entities = new Entities();
        StringWriter sw = new StringWriter();
        entities.unescape(sw, "&#65;");
        assertEquals("A", sw.toString());
    }

    @Test
    public void testUnescapeWriter_NumericHexLower_FallthroughQuirk() throws IOException {
        // NOTE: switch ไม่มี break ทำให้ fall-through ไป default (decimal parse) เสมอ
        // แต่ substring(1) ของ hex content ขึ้นต้นด้วย 'x'/'X' จึง parse decimal ไม่ได้
        // -> NumberFormatException ถูก catch -> ค่า hex ที่ parse ไว้ก่อนหน้าไม่ถูกทับ (ผลลัพธ์ถูกต้องโดยบังเอิญ)
        Entities entities = new Entities();
        StringWriter sw = new StringWriter();
        entities.unescape(sw, "&#x41;");
        assertEquals("A", sw.toString());
    }

    @Test
    public void testUnescapeWriter_NumericHexUpper_FallthroughQuirk() throws IOException {
        Entities entities = new Entities();
        StringWriter sw = new StringWriter();
        entities.unescape(sw, "&#X41;");
        assertEquals("A", sw.toString());
    }

    @Test
    public void testUnescapeWriter_NumericHashOnly() throws IOException {
        Entities entities = new Entities();
        StringWriter sw = new StringWriter();
        entities.unescape(sw, "&#;");
        assertEquals("&#;", sw.toString());
    }

    @Test
    public void testUnescapeWriter_NumericDecimalMalformed() throws IOException {
        Entities entities = new Entities();
        StringWriter sw = new StringWriter();
        entities.unescape(sw, "&#9a;");
        assertEquals("&#9a;", sw.toString());
    }

    @Test
    public void testUnescapeWriter_NamedEntityFound() throws IOException {
        Entities entities = Entities.HTML32;
        StringWriter sw = new StringWriter();
        entities.unescape(sw, "&lt;");
        assertEquals("<", sw.toString());
    }

    @Test
    public void testUnescapeWriter_NamedEntityNotFound() throws IOException {
        Entities entities = new Entities();
        StringWriter sw = new StringWriter();
        entities.unescape(sw, "&unknown;");
        assertEquals("&unknown;", sw.toString());
    }

    @Test(expected = IOException.class)
    public void testUnescapeWriter_IOExceptionPropagation_NoAmpersand() throws IOException {
        Entities entities = new Entities();
        entities.unescape(new ThrowingWriter(), "abc");
    }

    @Test(expected = IOException.class)
    public void testUnescapeWriter_IOExceptionPropagation_WithAmpersand() throws IOException {
        Entities entities = Entities.HTML32;
        entities.unescape(new ThrowingWriter(), "a&lt;b");
    }

    // ===================== Nested EntityMap implementations =====================

    @Test
    public void testPrimitiveEntityMap() {
        Entities.PrimitiveEntityMap map = new Entities.PrimitiveEntityMap();
        map.add("foo", 100);
        assertEquals(100, map.value("foo"));
        assertEquals("foo", map.name(100));
        assertEquals(-1, map.value("missing"));
        assertNull(map.name(999));
    }

    @Test
    public void testHashEntityMap() {
        Entities.HashEntityMap map = new Entities.HashEntityMap();
        map.add("foo", 5);
        assertEquals(5, map.value("foo"));
        assertEquals("foo", map.name(5));
        assertEquals(-1, map.value("bar"));
        assertNull(map.name(999));
    }

    @Test
    public void testTreeEntityMap() {
        Entities.TreeEntityMap map = new Entities.TreeEntityMap();
        map.add("foo", 5);
        assertEquals(5, map.value("foo"));
        assertEquals("foo", map.name(5));
        assertEquals(-1, map.value("bar"));
        assertNull(map.name(999));
    }

    @Test
    public void testLookupEntityMap_BelowTableSize() {
        Entities.LookupEntityMap map = new Entities.LookupEntityMap();
        map.add("nbsp", 160);
        assertEquals("nbsp", map.name(160)); // value < 256 -> ใช้ lookup table
    }

    @Test
    public void testLookupEntityMap_AboveTableSize() {
        Entities.LookupEntityMap map = new Entities.LookupEntityMap();
        map.add("euro", 8364);
        assertEquals("euro", map.name(8364)); // value >= 256 -> delegate super.name()
    }

    @Test
    public void testLookupEntityMap_BoundaryAtTableSize() {
        Entities.LookupEntityMap map = new Entities.LookupEntityMap();
        map.add("x255", 255);
        map.add("x256", 256);
        assertEquals("x255", map.name(255)); // boundary: 255 < 256
        assertEquals("x256", map.name(256)); // boundary: 256 >= 256
    }

    @Test
    public void testLookupEntityMap_NotFoundBelowTableSize() {
        Entities.LookupEntityMap map = new Entities.LookupEntityMap();
        assertNull(map.name(50));
    }

    @Test
    public void testArrayEntityMap_DefaultGrowth() {
        Entities.ArrayEntityMap map = new Entities.ArrayEntityMap();
        map.add("a", 1);
        assertEquals(1, map.value("a"));
        assertEquals("a", map.name(1));
        assertEquals(-1, map.value("x"));
        assertNull(map.name(999));
    }

    @Test
    public void testArrayEntityMap_GrowBeyondCapacity() {
        // growBy = 2 -> เพิ่ม entry ตัวที่ 3 ต้อง trigger ensureCapacity growth branch
        Entities.ArrayEntityMap map = new Entities.ArrayEntityMap(2);
        map.add("a", 1);
        map.add("b", 2);
        map.add("c", 3);
        assertEquals(1, map.value("a"));
        assertEquals(2, map.value("b"));
        assertEquals(3, map.value("c"));
        assertEquals("c", map.name(3));
    }

    @Test
    public void testBinaryEntityMap_OrderedInsertAndBinarySearch() {
        Entities.BinaryEntityMap map = new Entities.BinaryEntityMap();
        map.add("b", 20);
        map.add("a", 10);
        map.add("c", 30);
        // ตรวจ binarySearch ครอบคลุมทุก branch: midVal<key, midVal>key, midVal==key
        assertEquals(10, map.value("a"));
        assertEquals(20, map.value("b"));
        assertEquals(30, map.value("c"));
        assertEquals("a", map.name(10));
        assertEquals("b", map.name(20));
        assertEquals("c", map.name(30));
    }

    @Test
    public void testBinaryEntityMap_NameNotFound() {
        Entities.BinaryEntityMap map = new Entities.BinaryEntityMap();
        map.add("a", 10);
        assertNull(map.name(999)); // binarySearch คืนค่าลบ -> return null
    }

    @Test
    public void testBinaryEntityMap_DuplicateValueSkipped() {
        // ทดสอบ branch insertAt > 0 -> duplicate ถูก skip (ignore)
        Entities.BinaryEntityMap map = new Entities.BinaryEntityMap();
        map.add("a", 10);
        map.add("b", 20);
        map.add("c", 30);
        map.add("dup20", 20); // insertAt จะ match index 1 (>0) -> ถูก skip
        assertEquals(20, map.value("b"));
        assertEquals(-1, map.value("dup20")); // ไม่ถูกเพิ่มจริง
    }

    @Test
    public void testBinaryEntityMap_DuplicateAtIndexZero_KnownQuirk() {
        // NOTE: Known off-by-one quirk ใน source: binarySearch() อาจ return 0 เมื่อ match
        // ที่ตำแหน่งแรก แต่ add() เช็คแค่ `insertAt > 0` จึงไม่กรอง duplicate ที่ index 0 ออก
        // เทสต์นี้ยืนยัน behavior ปัจจุบัน (ไม่ตัดสินว่าเป็น defect ที่ต้อง fix)
        Entities.BinaryEntityMap map = new Entities.BinaryEntityMap();
        map.add("first", 10);
        map.add("second", 10); // duplicate ที่ index 0 -> ไม่ถูก skip ตาม logic ปัจจุบัน
        assertEquals(10, map.value("first"));
        assertEquals(10, map.value("second"));
    }
}
