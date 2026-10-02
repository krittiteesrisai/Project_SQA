package com.fasterxml.jackson.core.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.filter.TokenFilter;

public class FilteringParserDelegateTest
{
    private JsonFactory factory;

    @Before
    public void setUp() {
        factory = new JsonFactory();
    }

    private JsonParser rawParser(String json) throws IOException {
        return factory.createParser(json);
    }

    /* ================================================================
     * Custom TokenFilter implementations used across tests
     * ================================================================ */

    /** เลือกเฉพาะ property ที่ชื่อตรงกับ matchName (คืน INCLUDE_ALL) ที่เหลือคืน null */
    private static class NameMatchFilter extends TokenFilter {
        private final String matchName;
        NameMatchFilter(String name) { this.matchName = name; }
        @Override
        public TokenFilter includeProperty(String name) {
            return matchName.equals(name) ? TokenFilter.INCLUDE_ALL : null;
        }
    }

    /** เลือกเฉพาะ element index ที่ตรงกับ matchIndex ใน array */
    private static class IndexMatchFilter extends TokenFilter {
        private final int matchIndex;
        IndexMatchFilter(int idx) { this.matchIndex = idx; }
        @Override
        public TokenFilter includeElement(int index) {
            return index == matchIndex ? TokenFilter.INCLUDE_ALL : null;
        }
    }

    /** filterStartArray() คืน null โดยตั้งใจ เพื่อบังคับให้ _itemFilter กลายเป็น null */
    private static class ExcludeStartArrayFilter extends TokenFilter {
        @Override
        public TokenFilter filterStartArray() { return null; }
    }

    /* ================================================================
     * 1) Initial state / accessors ก่อนเริ่ม parse
     * ================================================================ */

    @Test
    public void testInitialState() throws IOException {
        JsonParser p = rawParser("123");
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, TokenFilter.INCLUDE_ALL, true, true);

        assertSame(TokenFilter.INCLUDE_ALL, del.getFilter());
        assertEquals(0, del.getMatchCount());

        assertNull(del.getCurrentToken());
        assertNull(del.currentToken());
        assertFalse(del.hasCurrentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, del.getCurrentTokenId());
        assertEquals(JsonTokenId.ID_NO_TOKEN, del.currentTokenId());
        assertTrue(del.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertFalse(del.hasTokenId(JsonTokenId.ID_STRING));
        assertTrue(del.hasToken(null));
        assertFalse(del.hasToken(JsonToken.VALUE_STRING));
        assertFalse(del.isExpectedStartArrayToken());
        assertFalse(del.isExpectedStartObjectToken());

        // headContext เริ่มต้นเป็น root context เสมอ
        assertTrue(del.getParsingContext().inRoot());
    }

    @Test
    public void testClearCurrentTokenWhenAlreadyNull() throws IOException {
        JsonParser p = rawParser("1");
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, TokenFilter.INCLUDE_ALL, false, true);
        del.clearCurrentToken(); // _currToken == null -> no-op branch
        assertNull(del.getLastClearedToken());
    }

    @Test
    public void testOverrideCurrentNameThrowsUnsupported() throws IOException {
        JsonParser p = rawParser("1");
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, TokenFilter.INCLUDE_ALL, false, true);
        try {
            del.overrideCurrentName("x");
            fail("ควร throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    /* ================================================================
     * 2) INCLUDE_ALL: full passthrough - เทียบกับ raw parser ตรงๆ
     * ================================================================ */

    @Test
    public void testIncludeAllFullPassthroughMatchesRawParser() throws IOException {
        String json = "{\"a\":1,\"b\":[2,3]}";

        JsonParser raw = rawParser(json);
        JsonParser wrappedRaw = rawParser(json);
        // allowMultipleMatches=true เพื่อไม่ให้ special early-stop (สำหรับ scalar root) มากวน
        FilteringParserDelegate del = new FilteringParserDelegate(
                wrappedRaw, TokenFilter.INCLUDE_ALL, true, true);

        while (true) {
            JsonToken tExpected = raw.nextToken();
            JsonToken tActual = del.nextToken();
            assertEquals(tExpected, tActual);
            if (tExpected == null) break;
            if (tExpected.isScalarValue()) {
                assertEquals(raw.getText(), del.getText());
            }
        }
    }

    @Test
    public void testGetCurrentNameAtVariousPositions() throws IOException {
        String json = "{\"a\":1,\"b\":[2,3]}";
        JsonParser p = rawParser(json);
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, TokenFilter.INCLUDE_ALL, true, true);

        assertEquals(JsonToken.START_OBJECT, del.nextToken());
        // START_OBJECT ที่ root: parent context (root) ไม่มีชื่อ -> null
        assertNull(del.getCurrentName());

        assertEquals(JsonToken.FIELD_NAME, del.nextToken());
        assertEquals("a", del.getCurrentName());

        assertEquals(JsonToken.VALUE_NUMBER_INT, del.nextToken());
        assertEquals("a", del.getCurrentName());

        assertEquals(JsonToken.FIELD_NAME, del.nextToken());
        assertEquals("b", del.getCurrentName());

        assertEquals(JsonToken.START_ARRAY, del.nextToken());
        // START_ARRAY: parent (object context) current name = "b"
        assertEquals("b", del.getCurrentName());
    }

    @Test
    public void testHasTokenIdAndHasTokenAfterToken() throws IOException {
        JsonParser p = rawParser("{}");
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, TokenFilter.INCLUDE_ALL, true, true);
        del.nextToken(); // START_OBJECT
        assertTrue(del.hasTokenId(JsonTokenId.ID_START_OBJECT));
        assertFalse(del.hasTokenId(JsonTokenId.ID_START_ARRAY));
        assertTrue(del.hasToken(JsonToken.START_OBJECT));
        assertFalse(del.hasToken(JsonToken.START_ARRAY));
    }

    @Test
    public void testIsExpectedStartTokens() throws IOException {
        JsonParser p1 = rawParser("{}");
        FilteringParserDelegate d1 = new FilteringParserDelegate(
                p1, TokenFilter.INCLUDE_ALL, true, true);
        d1.nextToken();
        assertTrue(d1.isExpectedStartObjectToken());
        assertFalse(d1.isExpectedStartArrayToken());

        JsonParser p2 = rawParser("[]");
        FilteringParserDelegate d2 = new FilteringParserDelegate(
                p2, TokenFilter.INCLUDE_ALL, true, true);
        d2.nextToken();
        assertTrue(d2.isExpectedStartArrayToken());
        assertFalse(d2.isExpectedStartObjectToken());
    }

    @Test
    public void testClearCurrentTokenAfterToken() throws IOException {
        JsonParser p = rawParser("true");
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, TokenFilter.INCLUDE_ALL, true, true);
        del.nextToken(); // VALUE_TRUE
        JsonToken before = del.getCurrentToken();
        del.clearCurrentToken();
        assertNull(del.getCurrentToken());
        assertFalse(del.hasCurrentToken());
        assertEquals(before, del.getLastClearedToken());
    }

    /* ================================================================
     * 3) Scalar root + _allowMultipleMatches / _includePath branches
     * ================================================================ */

    @Test
    public void testScalarSingleMatchAlternatingBehavior() throws IOException {
        // allowMultipleMatches=false, includePath=false, INCLUDE_ALL
        // ASSUMPTION: root context isStartHandled() == false โดย default (ตามคอมเมนต์ใน source
        // ที่ระบุว่า scalar ที่ "ไม่ได้อยู่ใน obj/array" เข้าเงื่อนไข early-return ได้)
        JsonParser p = rawParser("1 2 3");
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, TokenFilter.INCLUDE_ALL, false, false);

        assertEquals(JsonToken.VALUE_NUMBER_INT, del.nextToken());
        assertEquals(1, del.getIntValue());

        assertNull(del.nextToken()); // early-stop เพราะ match ครบ 1 ครั้งแล้ว

        assertEquals(JsonToken.VALUE_NUMBER_INT, del.nextToken()); // resume
        assertEquals(2, del.getIntValue());

        assertNull(del.nextToken());

        assertEquals(JsonToken.VALUE_NUMBER_INT, del.nextToken());
        assertEquals(3, del.getIntValue());

        assertNull(del.nextToken());
        assertNull(del.nextToken()); // EOF จริง
    }

    @Test
    public void testScalarMultipleMatchesContinuesReturningEachValue() throws IOException {
        JsonParser p = rawParser("1 2 3");
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, TokenFilter.INCLUDE_ALL, false, true); // allowMultipleMatches=true

        assertEquals(1, del.nextToken() != null ? del.getIntValue() : -1);
        assertEquals(2, del.nextToken() != null ? del.getIntValue() : -1);
        assertEquals(3, del.nextToken() != null ? del.getIntValue() : -1);
        assertNull(del.nextToken());
    }

    @Test
    public void testScalarIncludePathBypassesEarlyStop() throws IOException {
        JsonParser p = rawParser("1 2 3");
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, TokenFilter.INCLUDE_ALL, true, false); // includePath=true, allowMultipleMatches=false

        assertEquals(JsonToken.VALUE_NUMBER_INT, del.nextToken());
        assertEquals(1, del.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, del.nextToken());
        assertEquals(2, del.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, del.nextToken());
        assertEquals(3, del.getIntValue());
        assertNull(del.nextToken());
    }

    /* ================================================================
     * 4) Field-name filtering (object)
     * ================================================================ */

    @Test
    public void testFieldNameFilterExcludesNonMatchingWithoutIncludePath() throws IOException {
        String json = "{\"a\":1,\"b\":2}";
        JsonParser p = rawParser(json);
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, new NameMatchFilter("b"), false, false);

        // "a" ถูกข้าม -> ได้ FIELD_NAME("b") เป็น token แรกเลย (ไม่มี START_OBJECT เพราะ includePath=false)
        assertEquals(JsonToken.FIELD_NAME, del.nextToken());
        assertEquals("b", del.getCurrentName());

        assertEquals(JsonToken.VALUE_NUMBER_INT, del.nextToken());
        assertEquals(2, del.getIntValue());

        // allowMultipleMatches=false -> หยุดทันทีหลัง match (ไม่คืน END_OBJECT)
        assertNull(del.nextToken());
    }

    @Test
    public void testFieldNameFilterWithIncludePathIncludesStartObjectFirst() throws IOException {
        String json = "{\"a\":1,\"b\":2}";
        JsonParser p = rawParser(json);
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, new NameMatchFilter("b"), true, false);

        // ASSUMPTION: เมื่อ includePath=true, buffering (_nextTokenWithBuffering/_nextBuffered)
        // จะคืน START_OBJECT เป็นค่าแรกเสมอ เพราะเป็น context ที่ยังไม่ถูก handle มาก่อน
        JsonToken first = del.nextToken();
        assertEquals(JsonToken.START_OBJECT, first);

        List<JsonToken> rest = new ArrayList<JsonToken>();
        for (int i = 0; i < 10; i++) {
            JsonToken t = del.nextToken();
            rest.add(t);
            if (t == null) break;
        }
        assertTrue(rest.contains(JsonToken.FIELD_NAME));
        assertTrue(rest.contains(JsonToken.VALUE_NUMBER_INT));
        assertTrue(rest.contains(null)); // ลำดับต้องจบด้วย null ในที่สุด
    }

    /* ================================================================
     * 5) Default filter (ปฏิเสธทุกอย่าง) กับ scalar root
     * ================================================================ */

    @Test
    public void testDefaultFilterExcludesScalarRoot() throws IOException {
        JsonParser p = rawParser("123");
        TokenFilter rejectAll = new TokenFilter() { }; // ไม่ override ใดๆ -> includeValue() = false เสมอ
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, rejectAll, false, false);

        assertNull(del.nextToken());
        assertNull(del.getCurrentToken());
    }

    /* ================================================================
     * 6) Array element filtering ผ่าน includeElement()
     * ================================================================ */

    @Test
    public void testArrayIndexMatchFilterWithoutIncludePath() throws IOException {
        String json = "[10,20,30]";
        JsonParser p = rawParser(json);
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, new IndexMatchFilter(1), false, false);

        // element index 0 ("10") ถูกข้าม, index 1 ("20") ถูกรวม
        assertEquals(JsonToken.VALUE_NUMBER_INT, del.nextToken());
        assertEquals(20, del.getIntValue());

        // index 2 ("30") ไม่ match, END_ARRAY (returnEnd=false เพราะ START_ARRAY ไม่ถูกส่งออก) -> null
        assertNull(del.nextToken());
    }

    /* ================================================================
     * 7) กรณี filterStartArray() คืน null -> _itemFilter กลายเป็น null
     *    ครอบคลุมเส้นทาง "if (f == null) { skipChildren(); ... }" ใน nested START_ARRAY
     * ================================================================ */

    @Test
    public void testNestedArrayWithNullItemFilterAfterFilterStartArray() throws IOException {
        String json = "[[1,2],3]";
        JsonParser p = rawParser(json);
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, new ExcludeStartArrayFilter(), false, false);

        assertNull(del.nextToken());
        assertNull(del.getCurrentToken());
        assertNull(del.nextToken()); // เรียกซ้ำ ยังเป็น null (EOF จริง)
    }

    /* ================================================================
     * 8) skipChildren()
     * ================================================================ */

    @Test
    public void testSkipChildrenNoOpForScalar() throws IOException {
        JsonParser p = rawParser("42");
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, TokenFilter.INCLUDE_ALL, false, true);
        del.nextToken(); // VALUE_NUMBER_INT
        assertSame(del, del.skipChildren()); // ไม่ใช่ START_OBJECT/ARRAY -> return ทันที
        assertEquals(JsonToken.VALUE_NUMBER_INT, del.getCurrentToken());
    }

    @Test
    public void testSkipChildrenSkipsNestedObject() throws IOException {
        String json = "{\"a\":{\"b\":1},\"c\":2}";
        JsonParser p = rawParser(json);
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, TokenFilter.INCLUDE_ALL, false, true);

        assertEquals(JsonToken.START_OBJECT, del.nextToken());
        del.skipChildren();
        assertEquals(JsonToken.END_OBJECT, del.getCurrentToken());
        assertNull(del.nextToken()); // EOF หลัง root object ถูกข้ามหมด
    }

    @Test
    public void testSkipChildrenSkipsNestedArray() throws IOException {
        String json = "[1,[2,3],4]";
        JsonParser p = rawParser(json);
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, TokenFilter.INCLUDE_ALL, false, true);

        assertEquals(JsonToken.START_ARRAY, del.nextToken());
        del.skipChildren();
        assertEquals(JsonToken.END_ARRAY, del.getCurrentToken());
        assertNull(del.nextToken());
    }

    @Test
    public void testSkipChildrenReturnsImmediatelyWhenNoCurrentToken() throws IOException {
        JsonParser p = rawParser("1");
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, TokenFilter.INCLUDE_ALL, false, true);
        // ยังไม่เคยเรียก nextToken() -> _currToken == null
        assertSame(del, del.skipChildren());
    }

    /* ================================================================
     * 9) nextValue()
     * ================================================================ */

    @Test
    public void testNextValueSkipsFieldName() throws IOException {
        String json = "{\"a\":1}";
        JsonParser p = rawParser(json);
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, TokenFilter.INCLUDE_ALL, false, true);

        assertEquals(JsonToken.START_OBJECT, del.nextValue()); // t != FIELD_NAME -> คืนตรง
        assertEquals(JsonToken.VALUE_NUMBER_INT, del.nextValue()); // FIELD_NAME -> เรียก nextToken() ซ้ำ
        assertEquals(1, del.getIntValue());
    }

    /* ================================================================
     * 10) Delegated accessors (pass-through เรียก delegate.xxx())
     * ================================================================ */

    @Test
    public void testDelegatedNumericAndTextAccessors() throws IOException {
        JsonParser p = rawParser("\"hello\"");
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, TokenFilter.INCLUDE_ALL, false, true);
        del.nextToken();
        assertEquals("hello", del.getText());
        assertEquals("hello", del.getValueAsString());
        assertEquals("hello", del.getValueAsString("default"));

        JsonParser p2 = rawParser("123.5");
        FilteringParserDelegate del2 = new FilteringParserDelegate(
                p2, TokenFilter.INCLUDE_ALL, false, true);
        del2.nextToken();
        assertEquals(123.5, del2.getDoubleValue(), 0.0001);
        assertEquals(123, del2.getValueAsInt());
    }

    @Test
    public void testGetCurrentLocationAndTokenLocationNotNull() throws IOException {
        JsonParser p = rawParser("1");
        FilteringParserDelegate del = new FilteringParserDelegate(
                p, TokenFilter.INCLUDE_ALL, false, true);
        del.nextToken();
        assertNotNull(del.getCurrentLocation());
        assertNotNull(del.getTokenLocation());
    }
}
