package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;

public class UTF8StreamJsonParserTest {

    // ---------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------

    private JsonFactory newFactory() {
        return new JsonFactory();
    }

    private JsonParser parserFor(String json) throws IOException {
        return newFactory().createParser(json.getBytes(StandardCharsets.UTF_8));
    }

    private JsonParser parserFor(byte[] bytes) throws IOException {
        return newFactory().createParser(bytes);
    }

    private JsonParser streamParserFor(String json) throws IOException {
        return newFactory().createParser(
                new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8)));
    }

    /** InputStream ที่ผิด contract: read() คืน 0 ในครั้งที่สอง เพื่อทดสอบ loadMore() error branch */
    static class ZeroReadInputStream extends InputStream {
        private final byte[] data;
        private int state = 0;
        ZeroReadInputStream(byte[] data) { this.data = data; }
        @Override public int read() { return -1; }
        @Override public int read(byte[] b, int off, int len) {
            if (state == 0) {
                state = 1;
                int n = Math.min(len, data.length);
                System.arraycopy(data, 0, b, off, n);
                return n;
            }
            return 0; // violates InputStream contract -> ต้อง throw IOException ใน loadMore()
        }
    }

    /** InputStream ที่ track ว่าถูก close() หรือไม่ */
    static class TrackingInputStream extends FilterInputStream {
        boolean closed = false;
        TrackingInputStream(InputStream in) { super(in); }
        @Override public void close() throws IOException {
            closed = true;
            super.close();
        }
    }

    private void consumeAll(JsonParser p) throws IOException {
        while (p.nextToken() != null) { /* drain */ }
    }

    // ---------------------------------------------------------------
    // 0) Sanity: instance type
    // ---------------------------------------------------------------

    @Test
    public void testCreatedParserIsUTF8StreamJsonParser() throws IOException {
        JsonParser p = parserFor("{}");
        assertTrue(p instanceof UTF8StreamJsonParser);
        p.close();
    }

    // ---------------------------------------------------------------
    // 1) Empty / null-ish input
    // ---------------------------------------------------------------

    @Test
    public void testEmptyInputReturnsNullToken() throws IOException {
        JsonParser p = parserFor("");
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testWhitespaceOnlyInputReturnsNullToken() throws IOException {
        JsonParser p = parserFor("   \n\t  ");
        assertNull(p.nextToken());
        p.close();
    }

    // ---------------------------------------------------------------
    // 2) Basic object / array traversal
    // ---------------------------------------------------------------

    @Test
    public void testSimpleObject() throws IOException {
        JsonParser p = parserFor("{\"a\":1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testSimpleArray() throws IOException {
        JsonParser p = parserFor("[1,2,3]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(3, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testNestedObjectAndArray() throws IOException {
        JsonParser p = parserFor("{\"a\":[true,false,null],\"b\":{\"c\":\"x\"}}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("x", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    // ---------------------------------------------------------------
    // 3) Field-name parsing branches: quad-based fast paths at
    //    different lengths -> parseName/parseMediumName/parseMediumName2/parseLongName
    // ---------------------------------------------------------------

    @Test
    public void testFieldNameEmptyString() throws IOException {
        JsonParser p = parserFor("{\"\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("", p.getCurrentName());
        p.close();
    }

    @Test
    public void testFieldNameLength1To4() throws IOException {
        // 1..4 ตัวอักษร: เข้าเงื่อนไข codes[i]==0 ในแต่ละระดับของ _parseName (unrolled)
        String[] names = {"a", "ab", "abc", "abcd"};
        for (String n : names) {
            JsonParser p = parserFor("{\"" + n + "\":1}");
            p.nextToken();
            p.nextToken();
            assertEquals(n, p.getCurrentName());
            p.close();
        }
    }

    @Test
    public void testFieldNameLength5To8() throws IOException {
        // trigger parseMediumName
        String n = "abcdefgh"; // 8 chars
        JsonParser p = parserFor("{\"" + n + "\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals(n, p.getCurrentName());
        p.close();
    }

    @Test
    public void testFieldNameLength9To12() throws IOException {
        // trigger parseMediumName2
        String n = "abcdefghijkl"; // 12 chars
        JsonParser p = parserFor("{\"" + n + "\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals(n, p.getCurrentName());
        p.close();
    }

    @Test
    public void testFieldNameLongTriggersParseLongNameAndGrowArray() throws IOException {
        // ยาวมากพอที่จะ trigger parseLongName loop และ growArrayBy (_quadBuffer เริ่มที่ 16 ints = 64 bytes)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append((char) ('a' + (i % 26)));
        }
        String n = sb.toString();
        JsonParser p = parserFor("{\"" + n + "\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals(n, p.getCurrentName());
        p.close();
    }

    @Test
    public void testFieldNameForcesSlowParseNameNearBufferEnd() throws IOException {
        // ทำให้ input ทั้งหมดพอดี/น้อยกว่า 13 byte เพื่อชน branch (_inputPtr+13)>_inputEnd -> slowParseName()
        JsonParser p = parserFor("{\"ab\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("ab", p.getCurrentName());
        p.close();
    }

    @Test
    public void testFieldNameWithEscapeSequence() throws IOException {
        JsonParser p = parserFor("{\"a\\nb\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("a\nb", p.getCurrentName());
        p.close();
    }

    @Test
    public void testFieldNameWithMultiByteUtf8Char() throws IOException {
        // ทดสอบ addName() decode 2-byte utf8 ในชื่อ field
        JsonParser p = parserFor("{\"caf\u00e9\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("caf\u00e9", p.getCurrentName());
        p.close();
    }

    @Test
    public void testFieldNameWithSurrogatePairChar() throws IOException {
        // 4-byte utf8 -> ต้องแตกเป็น surrogate pair ใน addName()
        String emoji = "\uD83D\uDE00"; // U+1F600 GRINNING FACE
        JsonParser p = parserFor("{\"" + emoji + "\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals(emoji, p.getCurrentName());
        p.close();
    }

    // ---------------------------------------------------------------
    // 4) Unquoted / single-quoted field names (_handleOddName, _parseAposName)
    // ---------------------------------------------------------------

    @Test(expected = JsonParseException.class)
    public void testUnquotedFieldNameDisabledThrows() throws IOException {
        JsonParser p = parserFor("{abc:1}");
        p.nextToken();
        p.nextToken(); // ต้อง throw เพราะ ALLOW_UNQUOTED_FIELD_NAMES ปิดโดย default
    }

    @Test
    public void testUnquotedFieldNameEnabled() throws IOException {
        JsonParser p = parserFor("{abc:1}");
        p.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        p.nextToken();
        p.nextToken();
        assertEquals("abc", p.getCurrentName());
        p.close();
    }

    @Test
    public void testSingleQuotedFieldNameAndValueEnabled() throws IOException {
        JsonParser p = parserFor("{'a':'v'}");
        p.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        p.nextToken();
        p.nextToken();
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("v", p.getText());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testOddNameInvalidStartCharThrows() throws IOException {
        JsonParser p = parserFor("{ :1}"); // ' ' เป็น whitespace ถูกข้าม, ':' คือ invalid start char
        p.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        p.nextToken();
        p.nextToken();
    }

    // ---------------------------------------------------------------
    // 5) Number parsing: positive/negative, leading zero, float, exponent
    // ---------------------------------------------------------------

    @Test
    public void testPositiveInteger() throws IOException {
        JsonParser p = parserFor("12345");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(12345, p.getIntValue());
        p.close();
    }

    @Test
    public void testNegativeInteger() throws IOException {
        JsonParser p = parserFor("-42");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(-42, p.getIntValue());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testNegativeSignWithoutDigitThrows() throws IOException {
        JsonParser p = parserFor("-a");
        p.nextToken();
    }

    @Test
    public void testZeroAlone() throws IOException {
        JsonParser p = parserFor("0");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(0, p.getIntValue());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testLeadingZeroDisallowedByDefault() throws IOException {
        JsonParser p = parserFor("01");
        p.nextToken();
    }

    @Test
    public void testLeadingZeroesAllDroppedWhenFeatureEnabled() throws IOException {
        // อ้างอิงจากการ trace _verifyNoLeadingZeroes(): กรณี "00" ค่าที่ได้คือ 0
        JsonParser p = parserFor("00");
        p.enable(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS);
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(0, p.getIntValue());
        p.close();
    }

    @Test
    public void testLeadingZeroFollowedByDigitFeatureEnabled() throws IOException {
        // อ้างอิงจากการ trace _verifyNoLeadingZeroes(): "012" -> เลขศูนย์นำหน้าถูกตัดออก เหลือ "12"
        JsonParser p = parserFor("012");
        p.enable(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS);
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(12, p.getIntValue());
        p.close();
    }

    @Test
    public void testZeroFollowedByDecimalPoint() throws IOException {
        JsonParser p = parserFor("0.5");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(0.5, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test
    public void testFloatWithFractionOnly() throws IOException {
        JsonParser p = parserFor("3.14");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(3.14, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test
    public void testFloatWithExponentOnly() throws IOException {
        JsonParser p = parserFor("1e10");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1e10, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test
    public void testFloatWithSignedExponent() throws IOException {
        JsonParser p = parserFor("1.5e-3");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1.5e-3, p.getDoubleValue(), 0.0000001);
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testDecimalPointNotFollowedByDigitThrows() throws IOException {
        JsonParser p = parserFor("1.a");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testExponentNotFollowedByDigitThrows() throws IOException {
        JsonParser p = parserFor("1ea");
        p.nextToken();
    }

    @Test
    public void testLongNumberCrossingSegmentBoundary() throws IOException {
        // สร้างเลขจำนวนมากตัวเพื่อชน _parseNumber2 / finishCurrentSegment branch
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2000; i++) {
            sb.append('1');
        }
        JsonParser p = parserFor(sb.toString());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(sb.toString(), p.getText());
        p.close();
    }

    // ---------------------------------------------------------------
    // 6) NaN / Infinity / invalid value tokens (_handleUnexpectedValue)
    // ---------------------------------------------------------------

    @Test(expected = JsonParseException.class)
    public void testNaNDisabledByDefaultThrows() throws IOException {
        JsonParser p = parserFor("NaN");
        p.nextToken();
    }

    @Test
    public void testNaNEnabled() throws IOException {
        JsonParser p = parserFor("NaN");
        p.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        JsonToken t = p.nextToken();
        assertNotNull(t);
        assertTrue(Double.isNaN(p.getDoubleValue()));
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testInfinityDisabledByDefaultThrows() throws IOException {
        JsonParser p = parserFor("Infinity");
        p.nextToken();
    }

    @Test
    public void testInfinityEnabled() throws IOException {
        JsonParser p = parserFor("Infinity");
        p.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        p.nextToken();
        assertEquals(Double.POSITIVE_INFINITY, p.getDoubleValue(), 0.0);
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testPlusSignAsValueStartThrows() throws IOException {
        // '+' ไม่ใช่ตัวเลขที่ยอมรับตามปกติ -> _handleInvalidNumberStart -> reportUnexpectedNumberChar
        JsonParser p = parserFor("+5");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedIdentifierLikeCharThrowsReportInvalidToken() throws IOException {
        // 'x' เป็น javaIdentifierStart -> _reportInvalidToken branch
        JsonParser p = parserFor("xyz");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedNonIdentifierCharThrowsReportUnexpectedChar() throws IOException {
        // '@' ไม่ใช่ identifier start -> _reportUnexpectedChar branch
        JsonParser p = parserFor("@");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testStrayClosingBracketAsValueThrows() throws IOException {
        // "[1,]" -> หลัง comma คาด value แต่เจอ ']' -> _handleUnexpectedValue case ']'
        JsonParser p = parserFor("[1,]");
        p.nextToken();
        p.nextToken();
        p.nextToken();
    }

    // ---------------------------------------------------------------
    // 7) Mismatched end markers / missing comma
    // ---------------------------------------------------------------

    @Test(expected = JsonParseException.class)
    public void testMismatchedEndMarkerArrayClosedWithBrace() throws IOException {
        JsonParser p = parserFor("[1}");
        p.nextToken();
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedEndMarkerObjectClosedWithBracket() throws IOException {
        JsonParser p = parserFor("{\"a\":1]");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingCommaBetweenArrayElementsThrows() throws IOException {
        JsonParser p = parserFor("[1 2]");
        p.nextToken();
        p.nextToken();
        p.nextToken();
    }

    // ---------------------------------------------------------------
    // 8) String parsing: escapes, unicode escape, multi-byte utf8, skip
    // ---------------------------------------------------------------

    @Test
    public void testStringWithBasicEscapes() throws IOException {
        JsonParser p = parserFor("\"a\\nb\\tc\\\"d\\\\e\\/f\\bg\\rh\"");
        p.nextToken();
        assertEquals("a\nb\tc\"d\\e/f\bg\rh", p.getText());
        p.close();
    }

    @Test
    public void testStringWithUnicodeEscape() throws IOException {
        JsonParser p = parserFor("\"\\u0041\\u00e9\"");
        p.nextToken();
        assertEquals("A\u00e9", p.getText());
        p.close();
    }

    @Test
    public void testStringWith2Byte3Byte4ByteUtf8() throws IOException {
        String s = "\u00e9\u4e2d\uD83D\uDE00"; // 2-byte, 3-byte, 4-byte(surrogate)
        JsonParser p = parserFor("\"" + s + "\"");
        p.nextToken();
        assertEquals(s, p.getText());
        p.close();
    }

    @Test
    public void testStringSkippedWhenNotAccessed() throws IOException {
        // ให้ parser เดินข้าม string โดยไม่เรียก getText() -> ทดสอบ _skipString()
        JsonParser p = parserFor("[\"skip-me-\u00e9\u4e2d\", 2]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken()); // tokenIncomplete=true, ไม่เรียก getText()
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken()); // ต้อง skip string ก่อน
        assertEquals(2, p.getIntValue());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testUnquotedControlCharInStringThrows() throws IOException {
        // control char (0x01) ที่ไม่ escape ในสตริง -> _throwUnquotedSpace/_reportInvalidChar
        byte[] bytes = "\"ab\u0001cd\"".getBytes(StandardCharsets.UTF_8);
        JsonParser p = parserFor(bytes);
        p.nextToken();
        p.getText();
    }

    @Test
    public void testLongStringCrossingBufferBoundaryViaStream() throws IOException {
        // ใช้ InputStream + string ยาวมาก เพื่อชน branch loadMore/finishCurrentSegment ใน _finishString2
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20000; i++) {
            sb.append((char) ('a' + (i % 26)));
        }
        String json = "\"" + sb + "\"";
        JsonParser p = streamParserFor(json);
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(sb.toString(), p.getText());
        p.close();
    }

    // ---------------------------------------------------------------
    // 9) Comments (ALLOW_COMMENTS / ALLOW_YAML_COMMENTS)
    // ---------------------------------------------------------------

    @Test(expected = JsonParseException.class)
    public void testSlashCommentDisabledByDefaultThrows() throws IOException {
        JsonParser p = parserFor("[1 // comment\n,2]");
        p.nextToken();
        p.nextToken();
    }

    @Test
    public void testLineCommentEnabled() throws IOException {
        JsonParser p = parserFor("[1 // comment\n,2]");
        p.enable(JsonParser.Feature.ALLOW_COMMENTS);
        p.nextToken();
        assertEquals(1, p.nextIntValue(-1));
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        p.close();
    }

    @Test
    public void testBlockCommentEnabled() throws IOException {
        JsonParser p = parserFor("[1 /* comment */ ,2]");
        p.enable(JsonParser.Feature.ALLOW_COMMENTS);
        p.nextToken();
        p.nextToken();
        p.nextToken();
        assertEquals(2, p.getIntValue());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testUnterminatedBlockCommentThrows() throws IOException {
        JsonParser p = parserFor("[1 /* comment ");
        p.enable(JsonParser.Feature.ALLOW_COMMENTS);
        p.nextToken();
        p.nextToken();
    }

    @Test
    public void testYamlCommentEnabled() throws IOException {
        JsonParser p = parserFor("[1 # comment\n,2]");
        p.enable(JsonParser.Feature.ALLOW_YAML_COMMENTS);
        p.nextToken();
        p.nextToken();
        p.nextToken();
        assertEquals(2, p.getIntValue());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testHashWithoutYamlCommentsFeatureThrows() throws IOException {
        JsonParser p = parserFor("[1 # comment\n,2]");
        p.nextToken();
        p.nextToken(); // '#' ไม่ใช่ whitespace/comment ที่ถูกต้อง -> error
    }

    // ---------------------------------------------------------------
    // 10) nextFieldName / nextTextValue / nextIntValue / nextLongValue / nextBooleanValue
    // ---------------------------------------------------------------

    @Test
    public void testNextFieldNameStringMatch() throws IOException {
        JsonParser p = parserFor("{\"abc\":1}");
        p.nextToken(); // START_OBJECT
        boolean match = p.nextFieldName(new SerializedString("abc"));
        assertTrue(match);
        assertEquals(JsonToken.FIELD_NAME, p.currentToken());
        p.close();
    }

    @Test
    public void testNextFieldNameStringMismatch() throws IOException {
        JsonParser p = parserFor("{\"abc\":1}");
        p.nextToken();
        boolean match = p.nextFieldName(new SerializedString("xyz"));
        assertFalse(match);
        assertEquals("abc", p.getCurrentName());
        p.close();
    }

    @Test
    public void testNextFieldNameNoArgVariant() throws IOException {
        JsonParser p = parserFor("{\"abc\":1}");
        p.nextToken();
        String name = p.nextFieldName();
        assertEquals("abc", name);
        p.close();
    }

    @Test
    public void testNextFieldNameReturnsNullOnEndObject() throws IOException {
        JsonParser p = parserFor("{}");
        p.nextToken();
        assertNull(p.nextFieldName());
        assertEquals(JsonToken.END_OBJECT, p.currentToken());
        p.close();
    }

    @Test
    public void testNextTextValue() throws IOException {
        JsonParser p = parserFor("{\"a\":\"hello\"}");
        p.nextToken();
        p.nextFieldName();
        String v = p.nextTextValue();
        assertEquals("hello", v);
        p.close();
    }

    @Test
    public void testNextTextValueReturnsNullForNonString() throws IOException {
        JsonParser p = parserFor("{\"a\":1}");
        p.nextToken();
        p.nextFieldName();
        assertNull(p.nextTextValue());
        p.close();
    }

    @Test
    public void testNextIntValueMatch() throws IOException {
        JsonParser p = parserFor("{\"a\":42}");
        p.nextToken();
        p.nextFieldName();
        assertEquals(42, p.nextIntValue(-1));
        p.close();
    }

    @Test
    public void testNextIntValueDefaultOnNonInt() throws IOException {
        JsonParser p = parserFor("{\"a\":\"s\"}");
        p.nextToken();
        p.nextFieldName();
        assertEquals(-1, p.nextIntValue(-1));
        p.close();
    }

    @Test
    public void testNextLongValueMatch() throws IOException {
        JsonParser p = parserFor("{\"a\":123456789012}");
        p.nextToken();
        p.nextFieldName();
        assertEquals(123456789012L, p.nextLongValue(-1L));
        p.close();
    }

    @Test
    public void testNextBooleanValueTrueFalseNull() throws IOException {
        JsonParser p = parserFor("[true,false,1]");
        p.nextToken();
        assertEquals(Boolean.TRUE, p.nextBooleanValue());
        assertEquals(Boolean.FALSE, p.nextBooleanValue());
        assertNull(p.nextBooleanValue());
        p.close();
    }

    // ---------------------------------------------------------------
    // 11) Base64 / binary
    // ---------------------------------------------------------------

    @Test
    public void testGetBinaryValueExactTriplet() throws IOException {
        // "TWFu" -> "Man"
        JsonParser p = parserFor("\"TWFu\"");
        p.nextToken();
        byte[] data = p.getBinaryValue();
        assertArrayEquals("Man".getBytes(StandardCharsets.US_ASCII), data);
        p.close();
    }

    @Test
    public void testGetBinaryValueWithOnePaddingChar() throws IOException {
        // "TWE=" -> "Ma"
        JsonParser p = parserFor("\"TWE=\"");
        p.nextToken();
        byte[] data = p.getBinaryValue();
        assertArrayEquals("Ma".getBytes(StandardCharsets.US_ASCII), data);
        p.close();
    }

    @Test
    public void testGetBinaryValueWithTwoPaddingChars() throws IOException {
        // "TQ==" -> "M"
        JsonParser p = parserFor("\"TQ==\"");
        p.nextToken();
        byte[] data = p.getBinaryValue();
        assertArrayEquals("M".getBytes(StandardCharsets.US_ASCII), data);
        p.close();
    }

    @Test
    public void testGetBinaryValueMissingPaddingOneByte() throws IOException {
        // ใช้ MODIFIED_FOR_URL (ไม่ใช้ padding) และ 2 ตัวอักษร -> เข้า branch ch=='"' ตอนอ่านตัวที่ 3 (1-byte output)
        JsonParser p = parserFor("\"TW\"");
        byte[] data = p.getBinaryValue(Base64Variants.MODIFIED_FOR_URL);
        assertEquals(1, data.length);
        p.close();
    }

    @Test
    public void testGetBinaryValueMissingPaddingTwoBytes() throws IOException {
        // 3 ตัวอักษร + ปิด quote ทันที (ไม่มี padding) -> เข้า branch 2-byte output จากการเจอ quote ตอนอ่านตัวที่ 4
        JsonParser p = parserFor("\"TWE\"");
        byte[] data = p.getBinaryValue(Base64Variants.MODIFIED_FOR_URL);
        assertEquals(2, data.length);
        p.close();
    }

    @Test(expected = IOException.class)
    public void testGetBinaryValueInvalidPaddingCharThrows() throws IOException {
        JsonParser p = parserFor("\"TQ=X\"");
        p.getBinaryValue();
    }

    @Test
    public void testGetBinaryValueViaEmbeddedObjectPath() throws IOException {
        // เรียกซ้ำ getBinaryValue() หลังจาก decode แล้วครั้งแรก -> tokenIncomplete=false -> branch "may require conversion"
        JsonParser p = parserFor("\"TWFu\"");
        p.nextToken();
        byte[] first = p.getBinaryValue();
        byte[] second = p.getBinaryValue(); // ครั้งที่สอง _binaryValue!=null -> คืนของเดิม
        assertArrayEquals(first, second);
        p.close();
    }

    @Test
    public void testReadBinaryValueIncrementalPath() throws IOException {
        // เรียก readBinaryValue ทันทีหลัง nextToken() (tokenIncomplete=true, currToken=VALUE_STRING)
        // เพื่อชน branch "_readBinary" (ไม่ใช่ getBinaryValue()->_decodeBase64)
        JsonParser p = parserFor("\"TWFu\"");
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int n = p.readBinaryValue(out);
        assertEquals(3, n);
        assertArrayEquals("Man".getBytes(StandardCharsets.US_ASCII), out.toByteArray());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueOnNonStringTokenThrows() throws IOException {
        JsonParser p = parserFor("123");
        p.nextToken();
        p.getBinaryValue();
    }

    // ---------------------------------------------------------------
    // 12) getText / getTextCharacters / getTextLength / getTextOffset
    // ---------------------------------------------------------------

    @Test
    public void testGetTextForFieldName() throws IOException {
        JsonParser p = parserFor("{\"key\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("key", p.getText());
        assertEquals("key", new String(p.getTextCharacters(), p.getTextOffset(), p.getTextLength()));
        p.close();
    }

    @Test
    public void testGetTextForNumberToken() throws IOException {
        JsonParser p = parserFor("12345");
        p.nextToken();
        assertEquals("12345", p.getText());
        assertEquals(5, p.getTextLength());
        p.close();
    }

    @Test
    public void testGetTextCharactersForIncompleteString() throws IOException {
        JsonParser p = parserFor("\"hello\"");
        p.nextToken(); // tokenIncomplete=true
        char[] chars = p.getTextCharacters(); // ต้อง finishString() ก่อน
        assertEquals("hello", new String(chars, p.getTextOffset(), p.getTextLength()));
        p.close();
    }

    @Test
    public void testGetTextForNonTextTokenUsesDefaultBranch() throws IOException {
        // START_ARRAY ไม่ตรง ID_FIELD_NAME/ID_STRING/ID_NUMBER_* -> ใช้ default: t.asString()
        // (พฤติกรรมของ JsonToken.asString() ไม่ได้อยู่ในซอร์สคลาสนี้ จึงตรวจแค่ว่าไม่ null)
        JsonParser p = parserFor("[1]");
        p.nextToken();
        assertNotNull(p.getText());
        p.close();
    }

    @Test
    public void testGetTextReturnsNullWhenNoToken() throws IOException {
        JsonParser p = parserFor("");
        assertNull(p.getText());
        p.close();
    }

    // ---------------------------------------------------------------
    // 13) getValueAsString / getValueAsInt overrides
    // ---------------------------------------------------------------

    @Test
    public void testGetValueAsStringForStringToken() throws IOException {
        JsonParser p = parserFor("\"abc\"");
        p.nextToken();
        assertEquals("abc", p.getValueAsString());
        p.close();
    }

    @Test
    public void testGetValueAsStringDefaultForNonStringToken() throws IOException {
        JsonParser p = parserFor("123");
        p.nextToken();
        assertEquals("123", p.getValueAsString("fallback"));
        p.close();
    }

    @Test
    public void testGetValueAsIntForIntToken() throws IOException {
        JsonParser p = parserFor("42");
        p.nextToken();
        assertEquals(42, p.getValueAsInt());
        p.close();
    }

    @Test
    public void testGetValueAsIntForFloatToken() throws IOException {
        JsonParser p = parserFor("3.9");
        p.nextToken();
        assertEquals(3, p.getValueAsInt());
        p.close();
    }

    @Test
    public void testGetValueAsIntDefaultForNonNumberToken() throws IOException {
        JsonParser p = parserFor("\"abc\"");
        p.nextToken();
        assertEquals(99, p.getValueAsInt(99));
        p.close();
    }

    // ---------------------------------------------------------------
    // 14) Location APIs
    // ---------------------------------------------------------------

    @Test
    public void testGetTokenLocationAndCurrentLocation() throws IOException {
        JsonParser p = parserFor("{\"a\":1}");
        p.nextToken();
        JsonLocation tokenLoc = p.getTokenLocation();
        JsonLocation curLoc = p.getCurrentLocation();
        assertNotNull(tokenLoc);
        assertNotNull(curLoc);
        assertTrue(tokenLoc.getLineNr() >= 1);
        assertTrue(curLoc.getColumnNr() >= 1);
        p.close();
    }

    // ---------------------------------------------------------------
    // 15) releaseBuffered
    // ---------------------------------------------------------------

    @Test
    public void testReleaseBufferedReturnsRemainingBytesBeforeConsuming() throws IOException {
        byte[] bytes = "{\"a\":1}".getBytes(StandardCharsets.UTF_8);
        JsonParser p = parserFor(bytes);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int n = p.releaseBuffered(out);
        assertEquals(bytes.length, n);
        assertArrayEquals(bytes, out.toByteArray());
        p.close();
    }

    @Test
    public void testReleaseBufferedReturnsZeroAfterFullConsumption() throws IOException {
        JsonParser p = parserFor("{}");
        consumeAll(p);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int n = p.releaseBuffered(out);
        assertEquals(0, n);
    }

    // ---------------------------------------------------------------
    // 16) Stream-based loadMore / _closeInput branches
    // ---------------------------------------------------------------

    @Test(expected = IOException.class)
    public void testLoadMoreThrowsWhenStreamReturnsZero() throws IOException {
        ZeroReadInputStream in = new ZeroReadInputStream("{}".getBytes(StandardCharsets.UTF_8));
        JsonParser p = newFactory().createParser((InputStream) in);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.nextToken(); // ต้อง throw IOException ("read() returned 0 characters")
    }

    @Test
    public void testAutoCloseSourceEnabledClosesStream() throws IOException {
        TrackingInputStream in = new TrackingInputStream(
                new ByteArrayInputStream("{}".getBytes(StandardCharsets.UTF_8)));
        JsonParser p = newFactory().createParser((InputStream) in);
        // AUTO_CLOSE_SOURCE เปิดโดย default
        consumeAll(p); // เมื่อถึง EOF ภายใน nextToken() จะเรียก close() ให้เอง
        assertTrue(in.closed);
    }

    @Test
    public void testAutoCloseSourceDisabledDoesNotCloseStream() throws IOException {
        TrackingInputStream in = new TrackingInputStream(
                new ByteArrayInputStream("{}".getBytes(StandardCharsets.UTF_8)));
        JsonFactory f = newFactory();
        f.disable(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        JsonParser p = f.createParser((InputStream) in);
        consumeAll(p);
        assertFalse(in.closed);
    }

    // ---------------------------------------------------------------
    // 17) close() idempotency
    // ---------------------------------------------------------------

    @Test
    public void testCloseCanBeCalledTwiceWithoutError() throws IOException {
        JsonParser p = parserFor("{}");
        p.nextToken();
        p.close();
        p.close(); // เรียกซ้ำต้องไม่ throw (_inputStream ถูกตั้งเป็น null แล้ว)
        assertTrue(p.isClosed());
    }

    // ---------------------------------------------------------------
    // 18) Root-value separating whitespace (#105 _verifyRootSpace)
    // ---------------------------------------------------------------

    @Test
    public void testRootValuesSeparatedBySpaceOk() throws IOException {
        JsonParser p = parserFor("1 2");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        p.close();
    }

    @Test
    public void testRootValueFollowedByNewline() throws IOException {
        JsonParser p = parserFor("1\n2");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        p.close();
    }

    @Test
    public void testRootValueFollowedByCarriageReturn() throws IOException {
        JsonParser p = parserFor("1\r\n2");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        p.close();
    }

    // ---------------------------------------------------------------
    // 19) Colon / whitespace / tab variants around ':' (skipColon fast/slow path)
    // ---------------------------------------------------------------

    @Test
    public void testColonWithSpacesAndTabs() throws IOException {
        JsonParser p = parserFor("{\"a\" \t : \t 1}");
        p.nextToken();
        p.nextToken();
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingColonThrows() throws IOException {
        JsonParser p = parserFor("{\"a\" 1}");
        p.nextToken();
        p.nextToken();
        p.getIntValue();
    }
}
