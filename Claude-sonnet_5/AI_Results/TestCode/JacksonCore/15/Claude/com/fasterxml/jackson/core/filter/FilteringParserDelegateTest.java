package com.fasterxml.jackson.core.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonTokenId;

import static org.junit.Assert.*;

/**
 * Unit tests สำหรับ {@link FilteringParserDelegate}
 *
 * หมายเหตุสำคัญ:
 * - บางเงื่อนไข (เช่น TokenFilterContext.checkValue(), setFieldName()) ไม่ได้แสดง source
 *   มาให้ในโจทย์ จึงเลือกออกแบบเทสให้พึ่งพา assumption เหล่านี้ให้น้อยที่สุด
 *   หรือระบุคอมเมนต์กำกับไว้อย่างชัดเจนในจุดที่ต้องอาศัย assumption
 * - มี 2 เทสที่ "ตั้งใจ" เขียนตาม behavior ที่ระบุใน Javadoc ของคลาส (expected/correct
 *   behavior) ซึ่งจะ "ล้มเหลว" กับซอร์สที่ให้มา เพราะพบว่า field `_allowMultipleMatches`
 *   ถูก assign แต่ไม่ถูกอ่านใช้งานที่ใดเลยใน nextToken()/_nextToken2()/_nextTokenWithBuffering()
 *   และ `_matchCount` ก็ไม่ถูก increment ที่ใดเลย -> นี่คือช่องทางดักจับ fault (JacksonCore-15b)
 */
public class FilteringParserDelegateTest
{
    private JsonParser createParser(String json) throws IOException {
        return new JsonFactory().createParser(json);
    }

    // ---------- Custom TokenFilter implementations สำหรับควบคุม flow แบบ deterministic ----------

    /** Include เฉพาะ property ชื่อที่กำหนด (ผ่าน includeProperty) */
    static class SingleNameFilter extends TokenFilter {
        private final String name;
        SingleNameFilter(String name) { this.name = name; }
        @Override
        public TokenFilter includeProperty(String propertyName) {
            return name.equals(propertyName) ? TokenFilter.INCLUDE_ALL : null;
        }
    }

    /** Include scalar ทุกตัว (includeValue() == true เสมอ) แต่ไม่ auto INCLUDE_ALL สำหรับ struct */
    static class AllScalarsFilter extends TokenFilter {
        @Override
        public boolean includeValue(JsonParser p) throws IOException {
            return true;
        }
        @Override
        public TokenFilter filterStartArray() { return this; }
        @Override
        public TokenFilter filterStartObject() { return this; }
    }

    /** filterStartArray() คืนค่า null เสมอ -> ใช้ trigger branch "f == null" ของ ID_START_ARRAY/OBJECT/scalar */
    static class ExcludeArrayFilter extends TokenFilter {
        @Override
        public TokenFilter filterStartArray() { return null; }
        @Override
        public TokenFilter filterStartObject() { return this; }
    }

    /** filterStartObject() คืนค่า null เสมอ -> ใช้ trigger branch ที่เกี่ยวกับ object ทั้งใบถูก exclude */
    static class ExcludeObjectFilter extends TokenFilter {
        @Override
        public TokenFilter filterStartObject() { return null; }
        @Override
        public TokenFilter filterStartArray() { return this; }
    }

    // =====================================================================
    // 1) State ก่อนเรียก nextToken() / getters พื้นฐาน
    // =====================================================================

    @Test
    public void testInitialStateBeforeAnyToken() throws IOException {
        JsonParser base = createParser("123");
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, TokenFilter.INCLUDE_ALL, false, false);

        assertNull(fpd.getCurrentToken());
        assertFalse(fpd.hasCurrentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, fpd.getCurrentTokenId());
        assertTrue(fpd.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertFalse(fpd.hasTokenId(JsonTokenId.ID_NUMBER_INT));
        assertTrue(fpd.hasToken(null));
        assertFalse(fpd.hasToken(JsonToken.VALUE_NUMBER_INT));
        assertSame(TokenFilter.INCLUDE_ALL, fpd.getFilter());
        assertEquals(0, fpd.getMatchCount());
        assertNull(fpd.getLastClearedToken());
    }

    @Test
    public void testMatchCountNeverIncremented_knownDefect() throws IOException {
        // _matchCount ไม่ถูก increment ที่ใดในซอร์สที่ให้มา แม้ token จะถูก include ไปหลายตัว
        JsonParser base = createParser("[1,2,3]");
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, TokenFilter.INCLUDE_ALL, true, true);
        while (fpd.nextToken() != null) { /* drain */ }
        assertEquals(0, fpd.getMatchCount());
    }

    // =====================================================================
    // 2) INCLUDE_ALL: full pass-through (deterministic, ไม่พึ่ง checkValue)
    // =====================================================================

    @Test
    public void testIncludeAllFullPassThrough() throws IOException {
        String json = "{\"a\":1,\"b\":[2,3]}";
        JsonParser base = createParser(json);
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, TokenFilter.INCLUDE_ALL, true, true);

        assertEquals(JsonToken.START_OBJECT, fpd.nextToken());
        // root object ไม่มี parent context -> getCurrentName() ต้องเป็น null (branch START_OBJECT ใน getCurrentName)
        assertNull(fpd.getCurrentName());

        assertEquals(JsonToken.FIELD_NAME, fpd.nextToken());
        assertEquals("a", fpd.getCurrentName());

        assertEquals(JsonToken.VALUE_NUMBER_INT, fpd.nextToken());
        assertEquals(1, fpd.getIntValue());

        assertEquals(JsonToken.FIELD_NAME, fpd.nextToken());
        assertEquals("b", fpd.getCurrentName());

        assertEquals(JsonToken.START_ARRAY, fpd.nextToken());
        // branch พิเศษ: currToken == START_ARRAY -> ใช้ชื่อจาก parent context
        assertEquals("b", fpd.getCurrentName());

        assertEquals(JsonToken.VALUE_NUMBER_INT, fpd.nextToken());
        assertEquals(2, fpd.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, fpd.nextToken());
        assertEquals(3, fpd.getIntValue());

        assertEquals(JsonToken.END_ARRAY, fpd.nextToken());
        assertEquals(JsonToken.END_OBJECT, fpd.nextToken());

        assertNull(fpd.nextToken());
        assertNull(fpd.getCurrentToken());
    }

    @Test
    public void testEmptyObjectIncludeAll() throws IOException {
        JsonParser base = createParser("{}");
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, TokenFilter.INCLUDE_ALL, false, false);
        assertEquals(JsonToken.START_OBJECT, fpd.nextToken());
        assertEquals(JsonToken.END_OBJECT, fpd.nextToken());
        assertNull(fpd.nextToken());
    }

    // =====================================================================
    // 3) Boundary: input ว่าง / malformed
    // =====================================================================

    @Test
    public void testEmptyInputReturnsNull() throws IOException {
        JsonParser base = createParser("");
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, TokenFilter.INCLUDE_ALL, false, false);
        // t == null -> return (_currToken = t) ทันที (บรรทัดแรกหลัง buffered-context check)
        assertNull(fpd.nextToken());
        assertNull(fpd.getCurrentToken());
    }

    @Test(expected = IOException.class)
    public void testMalformedInputPropagatesException() throws IOException {
        JsonParser base = createParser("{invalid");
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, TokenFilter.INCLUDE_ALL, false, false);
        while (fpd.nextToken() != null) { /* จนกว่า delegate จะ throw */ }
    }

    // =====================================================================
    // 4) FIELD_NAME include/exclude ผ่าน includeProperty()
    // =====================================================================

    @Test
    public void testFieldNameExcludedSkipsValue() throws IOException {
        // ยืนยันเฉพาะผลลัพธ์ที่ deterministic จาก source ที่ให้มา: "a" ต้องไม่ถูกโผล่,
        // "b" (ที่ match) ต้องถูกโผล่พร้อมค่า 2 — ไม่ตั้งสมมติฐานเรื่องลำดับ START/END_OBJECT
        // ที่ขึ้นกับ TokenFilterContext internals ซึ่งไม่ได้ให้ source มา
        String json = "{\"a\":1,\"b\":2}";
        JsonParser base = createParser(json);
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, new SingleNameFilter("b"), false, false);

        JsonToken t;
        boolean sawA = false;
        boolean sawBName = false;
        Integer bValue = null;
        while ((t = fpd.nextToken()) != null) {
            if (t == JsonToken.FIELD_NAME) {
                String name = fpd.getCurrentName();
                if ("a".equals(name)) sawA = true;
                if ("b".equals(name)) sawBName = true;
            } else if (t == JsonToken.VALUE_NUMBER_INT && sawBName && bValue == null) {
                bValue = fpd.getIntValue();
            }
        }
        assertFalse("field 'a' ต้องไม่ถูก surfaced", sawA);
        assertTrue("field 'b' ต้องถูก surfaced", sawBName);
        assertEquals(Integer.valueOf(2), bValue);
    }

    // =====================================================================
    // 5) "f == null" branches (comment ในซอร์ส: "does this occur?")
    // =====================================================================

    @Test
    public void testNullItemFilterSkipsNestedArray() throws IOException {
        // filterStartArray() ของ root -> null: _itemFilter กลายเป็น null
        // array ที่ซ้อนอยู่ตรง ๆ (ไม่มี FIELD_NAME คั่น) จะเจอ branch "f == null" ของ ID_START_ARRAY
        String json = "[[1]]";
        JsonParser base = createParser(json);
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, new ExcludeArrayFilter(), false, false);
        assertNull(fpd.nextToken());
    }

    @Test
    public void testNullItemFilterSkipsNestedObject() throws IOException {
        // เช่นเดียวกับข้างบน แต่ทดสอบ branch "f == null" ของ ID_START_OBJECT
        String json = "[{\"a\":1}]";
        JsonParser base = createParser(json);
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, new ExcludeArrayFilter(), false, false);
        assertNull(fpd.nextToken());
    }

    @Test
    public void testNullItemFilterSkipsScalarElement() throws IOException {
        // ทดสอบ default(scalar) branch เมื่อ f == null (เข้า "if (f != null)" เป็น false)
        String json = "[1]";
        JsonParser base = createParser(json);
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, new ExcludeArrayFilter(), false, false);
        assertNull(fpd.nextToken());
    }

    @Test
    public void testFilterStartObjectReturningNullExcludesWholeObject() throws IOException {
        // สมมติฐาน (ไม่มี source TokenFilterContext ให้ดู): เมื่อ context filter เป็น null,
        // setFieldName() จะคืนค่า null ด้วย ทำให้ FIELD_NAME ถูกข้ามผ่าน branch
        // "if (f == null) { delegate.nextToken(); delegate.skipChildren(); ... }"
        String json = "{\"a\":1}";
        JsonParser base = createParser(json);
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, new ExcludeObjectFilter(), false, false);
        assertNull(fpd.nextToken());
    }

    // =====================================================================
    // 6) Scalar include ผ่าน includeValue()
    // =====================================================================

    @Test
    public void testScalarValuesIncludedWhenFilterMatches() throws IOException {
        // allowMultipleMatches = true -> ทั้งสองค่าควรถูก include (ไม่พึ่งพา behavior ของ flag ที่ยังไม่ enforce)
        String json = "[1,2]";
        JsonParser base = createParser(json);
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, new AllScalarsFilter(), false, true);

        List<Integer> values = new ArrayList<Integer>();
        JsonToken t;
        while ((t = fpd.nextToken()) != null) {
            if (t == JsonToken.VALUE_NUMBER_INT) {
                values.add(fpd.getIntValue());
            }
        }
        assertEquals(Arrays.asList(1, 2), values);
    }

    @Test
    public void testAllowMultipleMatchesFalseShouldLimitToFirstMatch_knownDefect() throws IOException {
        // ตาม Javadoc ของคลาส: allowMultipleMatches=false -> ควร include เฉพาะ match แรก
        // แต่ในซอร์สที่ให้มา field `_allowMultipleMatches` ไม่ถูกอ่านใช้งานเลยใน nextToken()/
        // _nextToken2()/_nextTokenWithBuffering() ดังนั้น "ทุก" scalar ที่ match เงื่อนไข
        // includeValue() จะถูก include หมด -> เทสนี้เขียนตาม behavior ที่ "ถูกต้องตามสัญญา"
        // และคาดว่าจะ FAIL กับ source ที่ให้มา (แสดงถึง fault ของ JacksonCore-15b)
        String json = "[1,2,3]";
        JsonParser base = createParser(json);
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, new AllScalarsFilter(), false, false);

        List<Integer> values = new ArrayList<Integer>();
        JsonToken t;
        while ((t = fpd.nextToken()) != null) {
            if (t == JsonToken.VALUE_NUMBER_INT) {
                values.add(fpd.getIntValue());
            }
        }
        assertEquals(Arrays.asList(1), values);
    }

    // =====================================================================
    // 7) skipChildren()
    // =====================================================================

    @Test
    public void testSkipChildrenNoOpWhenNotStartToken() throws IOException {
        JsonParser base = createParser("42");
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, TokenFilter.INCLUDE_ALL, false, false);
        fpd.nextToken(); // VALUE_NUMBER_INT
        assertEquals(JsonToken.VALUE_NUMBER_INT, fpd.getCurrentToken());

        JsonParser result = fpd.skipChildren();
        assertSame(fpd, result);
        assertNull(fpd.nextToken()); // ไม่มี token อื่นอีกแล้ว
    }

    @Test
    public void testSkipChildrenSkipsNestedStructure() throws IOException {
        String json = "[1,[2,3],4]";
        JsonParser base = createParser(json);
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.START_ARRAY, fpd.nextToken());
        fpd.skipChildren();
        // open/close counting: START_ARRAY(nested)->open++, END_ARRAY(nested)->open--,
        // END_ARRAY(outer)->open==0 -> คืนค่า this โดย currToken = END_ARRAY ตัวนอก
        assertEquals(JsonToken.END_ARRAY, fpd.getCurrentToken());
        assertNull(fpd.nextToken());
    }

    // =====================================================================
    // 8) nextValue()
    // =====================================================================

    @Test
    public void testNextValueSkipsFieldName() throws IOException {
        String json = "{\"a\":1}";
        JsonParser base = createParser(json);
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, TokenFilter.INCLUDE_ALL, true, true);

        assertEquals(JsonToken.START_OBJECT, fpd.nextValue());
        // t == FIELD_NAME -> เรียก nextToken() ซ้ำ เพื่อดึงค่าจริง
        assertEquals(JsonToken.VALUE_NUMBER_INT, fpd.nextValue());
        assertEquals(1, fpd.getIntValue());
        assertEquals(JsonToken.END_OBJECT, fpd.nextValue());
        assertNull(fpd.nextValue());
    }

    // =====================================================================
    // 9) clearCurrentToken() / getLastClearedToken()
    // =====================================================================

    @Test
    public void testClearCurrentToken() throws IOException {
        JsonParser base = createParser("42");
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, TokenFilter.INCLUDE_ALL, false, false);
        assertNull(fpd.getLastClearedToken());

        fpd.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, fpd.getCurrentToken());

        fpd.clearCurrentToken();
        assertNull(fpd.getCurrentToken());
        assertFalse(fpd.hasCurrentToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, fpd.getLastClearedToken());

        // เรียกซ้ำตอน currToken เป็น null แล้ว -> ต้องไม่เปลี่ยนแปลง (branch: _currToken != null -> false)
        fpd.clearCurrentToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, fpd.getLastClearedToken());
    }

    // =====================================================================
    // 10) overrideCurrentName() ต้อง throw
    // =====================================================================

    @Test(expected = UnsupportedOperationException.class)
    public void testOverrideCurrentNameThrows() throws IOException {
        JsonParser base = createParser("{}");
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, TokenFilter.INCLUDE_ALL, false, false);
        fpd.overrideCurrentName("x");
    }

    // =====================================================================
    // 11) hasTokenId / hasToken / isExpectedStart*Token หลังเลื่อน token
    // =====================================================================

    @Test
    public void testHasTokenIdAfterAdvance() throws IOException {
        JsonParser base = createParser("\"str\"");
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, TokenFilter.INCLUDE_ALL, false, false);
        fpd.nextToken();
        assertEquals(JsonToken.VALUE_STRING, fpd.getCurrentToken());
        assertTrue(fpd.hasTokenId(JsonTokenId.ID_STRING));
        assertTrue(fpd.hasToken(JsonToken.VALUE_STRING));
        assertFalse(fpd.hasToken(JsonToken.VALUE_NUMBER_INT));
        assertEquals("str", fpd.getText());
    }

    @Test
    public void testIsExpectedStartTokens() throws IOException {
        JsonParser base = createParser("[1]");
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, TokenFilter.INCLUDE_ALL, false, false);
        assertFalse(fpd.isExpectedStartArrayToken());
        assertFalse(fpd.isExpectedStartObjectToken());
        fpd.nextToken();
        assertTrue(fpd.isExpectedStartArrayToken());
        assertFalse(fpd.isExpectedStartObjectToken());
    }

    // =====================================================================
    // 12) getParsingContext() / getCurrentLocation() (delegate pass-through)
    // =====================================================================

    @Test
    public void testGetParsingContextNotNull() throws IOException {
        JsonParser base = createParser("[1]");
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, TokenFilter.INCLUDE_ALL, false, false);
        assertNotNull(fpd.getParsingContext());
        fpd.nextToken();
        assertNotNull(fpd.getParsingContext());
    }

    @Test
    public void testGetCurrentLocationDelegates() throws IOException {
        JsonParser base = createParser("42");
        FilteringParserDelegate fpd =
                new FilteringParserDelegate(base, TokenFilter.INCLUDE_ALL, false, false);
        assertNotNull(fpd.getCurrentLocation());
    }
}
