package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import static org.junit.Assert.*;

/**
 * Unit tests for UTF8StreamJsonParser (Defects4J JacksonCore-19b).
 * Uses JsonFactory (public API) to obtain real UTF8StreamJsonParser instances.
 */
public class UTF8StreamJsonParserTest {

    private JsonFactory factory;

    @Before
    public void setUp() {
        factory = new JsonFactory();
    }

    // ---------- Helpers ----------

    private UTF8StreamJsonParser createParser(String json) throws IOException {
        return createParserWithFactory(factory, json);
    }

    private UTF8StreamJsonParser createParserWithFactory(JsonFactory f, String json) throws IOException {
        InputStream in = new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8));
        JsonParser p = f.createParser(in);
        assertTrue("Parser should be UTF8StreamJsonParser", p instanceof UTF8StreamJsonParser);
        return (UTF8StreamJsonParser) p;
    }

    private String repeat(char c, int times) {
        StringBuilder sb = new StringBuilder(times);
        for (int i = 0; i < times; i++) sb.append(c);
        return sb.toString();
    }

    // ---------- Basic / empty / null input ----------

    @Test
    public void testEmptyInputReturnsNullToken() throws IOException {
        UTF8StreamJsonParser p = createParser("");
        assertNull(p.nextToken());
        assertNull(p.getCurrentToken());
        p.close();
    }

    @Test
    public void testWhitespaceOnlyInputReturnsNull() throws IOException {
        UTF8StreamJsonParser p = createParser("   \t\n  ");
        assertNull(p.nextToken());
        p.close();
    }

    // ---------- Object / array / value tokens ----------

    @Test
    public void testSimpleObjectAllValueTypes() throws IOException {
        String json = "{\"a\":1,\"b\":\"two\",\"c\":true,\"d\":false,\"e\":null,\"f\":[1,2,3]}";
        UTF8StreamJsonParser p = createParser(json);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("two", p.getText());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testNestedArrayInObjectNotInObjectBranch() throws IOException {
        String json = "[[1,2],{\"x\":3}]";
        UTF8StreamJsonParser p = createParser(json);
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    // ---------- Numbers ----------

    @Test
    public void testNegativeInteger() throws IOException {
        UTF8StreamJsonParser p = createParser("[-123]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(-123, p.getIntValue());
        p.close();
    }

    @Test
    public void testFloatWithFraction() throws IOException {
        UTF8StreamJsonParser p = createParser("[3.14]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(3.14, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test
    public void testExponentPositiveAndNegativeSign() throws IOException {
        UTF8StreamJsonParser p = createParser("[1e10, 1.5E+3, 2e-5]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        p.close();
    }

    @Test
    public void testDecimalPointNotFollowedByDigitThrows() throws IOException {
        UTF8StreamJsonParser p = createParser("[1.]");
        p.nextToken();
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    @Test
    public void testExponentNotFollowedByDigitThrows() throws IOException {
        UTF8StreamJsonParser p = createParser("[1e]");
        p.nextToken();
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    @Test
    public void testNegativeSignNotFollowedByDigitThrows() throws IOException {
        UTF8StreamJsonParser p = createParser("[-a]");
        p.nextToken();
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    @Test
    public void testPlusSignedNumberThrows() throws IOException {
        UTF8StreamJsonParser p = createParser("[+5]");
        p.nextToken();
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    @Test
    public void testLeadingZeroDisallowedByDefaultThrows() throws IOException {
        UTF8StreamJsonParser p = createParser("[0123]");
        p.nextToken();
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    @Test
    public void testLeadingZeroAllowedWhenFeatureEnabled() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS);
        UTF8StreamJsonParser p = createParserWithFactory(f, "[00,01]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(0, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        p.close();
    }

    @Test
    public void testLoneZeroIsValid() throws IOException {
        UTF8StreamJsonParser p = createParser("[0]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(0, p.getIntValue());
        p.close();
    }

    @Test
    public void testNaNAllowedWhenFeatureEnabled() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        UTF8StreamJsonParser p = createParserWithFactory(f, "[NaN]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isNaN(p.getDoubleValue()));
        p.close();
    }

    @Test
    public void testNaNDisallowedByDefaultThrows() throws IOException {
        UTF8StreamJsonParser p = createParser("[NaN]");
        p.nextToken();
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    @Test
    public void testInfinityAllowedWhenFeatureEnabled() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        UTF8StreamJsonParser p = createParserWithFactory(f, "[Infinity]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isInfinite(p.getDoubleValue()));
        p.close();
    }

    @Test
    public void testNegativeInfinityAllowedWhenFeatureEnabled() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        UTF8StreamJsonParser p = createParserWithFactory(f, "[-Infinity]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(p.getDoubleValue() < 0);
        p.close();
    }

    // ---------- Structural errors ----------

    @Test
    public void testMismatchedEndArrayThrows() throws IOException {
        UTF8StreamJsonParser p = createParser("{]");
        p.nextToken(); // START_OBJECT
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    @Test
    public void testMismatchedEndObjectThrows() throws IOException {
        UTF8StreamJsonParser p = createParser("[}");
        p.nextToken(); // START_ARRAY
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    @Test
    public void testMissingCommaThrows() throws IOException {
        UTF8StreamJsonParser p = createParser("[1 2]");
        p.nextToken(); // START_ARRAY
        p.nextToken(); // 1
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    @Test
    public void testUnexpectedValueCharThrows() throws IOException {
        UTF8StreamJsonParser p = createParser("[x]");
        p.nextToken();
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    @Test
    public void testHashWithoutYamlCommentsThrows() throws IOException {
        UTF8StreamJsonParser p = createParser("[#]");
        p.nextToken();
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    // ---------- Field names: quoted / unquoted / single-quote / escaped ----------

    @Test
    public void testUnquotedFieldNameDisallowedByDefaultThrows() throws IOException {
        UTF8StreamJsonParser p = createParser("{a:1}");
        p.nextToken();
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    @Test
    public void testUnquotedFieldNameAllowedWhenFeatureEnabled() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        UTF8StreamJsonParser p = createParserWithFactory(f, "{abc:1}");
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("abc", p.getCurrentName());
        p.close();
    }

    @Test
    public void testUnquotedFieldNameInvalidStartCharThrows() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        UTF8StreamJsonParser p = createParserWithFactory(f, "{#bad:1}");
        p.nextToken();
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    @Test
    public void testSingleQuotedFieldNameAndValueAllowed() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        UTF8StreamJsonParser p = createParserWithFactory(f, "{'a':'val'}");
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("val", p.getText());
        p.close();
    }

    @Test
    public void testSingleQuoteEmptyNameAndValue() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        UTF8StreamJsonParser p = createParserWithFactory(f, "{'':''}");
        p.nextToken();
        p.nextToken();
        assertEquals("", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("", p.getText());
        p.close();
    }

    @Test
    public void testSingleQuotesDisallowedByDefaultThrows() throws IOException {
        UTF8StreamJsonParser p = createParser("{'a':1}");
        p.nextToken();
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    @Test
    public void testShortFieldNames1To4Bytes() throws IOException {
        // covers findName(q1,..) / parseName variants for 1..4-byte quads
        String json = "{\"a\":1,\"ab\":2,\"abc\":3,\"abcd\":4}";
        UTF8StreamJsonParser p = createParser(json);
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("ab", p.getCurrentName());
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("abc", p.getCurrentName());
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("abcd", p.getCurrentName());
        p.close();
    }

    @Test
    public void testEmptyFieldName() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"\":1}");
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("", p.getCurrentName());
        p.close();
    }

    @Test
    public void testMediumFieldName5To8Bytes() throws IOException {
        // covers parseMediumName path
        UTF8StreamJsonParser p = createParser("{\"medium1\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("medium1", p.getCurrentName());
        p.close();
    }

    @Test
    public void testMediumFieldName9To12Bytes() throws IOException {
        // covers parseMediumName2 path
        UTF8StreamJsonParser p = createParser("{\"mediumName1\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("mediumName1", p.getCurrentName());
        p.close();
    }

    @Test
    public void testLongFieldNameOver12Bytes() throws IOException {
        // covers parseLongName path
        String longName = "thisIsAVeryLongFieldNameForTest";
        UTF8StreamJsonParser p = createParser("{\"" + longName + "\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals(longName, p.getCurrentName());
        p.close();
    }

    @Test
    public void testVeryLongFieldNameTriggersQuadBufferGrowth() throws IOException {
        // covers growArrayBy for _quadBuffer in parseLongName
        String longName = repeat('x', 200);
        UTF8StreamJsonParser p = createParser("{\"" + longName + "\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals(longName, p.getCurrentName());
        p.close();
    }

    @Test
    public void testFieldNameWithEscapedCharacter() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"a\\\\b\":1}"); // name: a\b
        p.nextToken();
        p.nextToken();
        assertEquals("a\\b", p.getCurrentName());
        p.close();
    }

    @Test
    public void testFieldNameWithUnicodeEscapeAbove127() throws IOException {
        // covers UTF-8 re-encoding branch inside parseEscapedName (ch > 127)
        UTF8StreamJsonParser p = createParser("{\"a\\u00e9b\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("a\u00e9b", p.getCurrentName());
        p.close();
    }

    @Test
    public void testUnquotedWhitespaceInNameThrows() throws IOException {
        // control char inside quoted field name without escape -> _throwUnquotedSpace
        String json = "{\"a\u0001b\":1}";
        UTF8StreamJsonParser p = createParser(json);
        p.nextToken();
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    // ---------- String value parsing ----------

    @Test
    public void testEscapedStringValueMappedEscapes() throws IOException {
        String json = "[\"line1\\nline2\\tend\\\"quote\\\\slash\\/end\\b\\f\\r\"]";
        UTF8StreamJsonParser p = createParser(json);
        p.nextToken();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        String text = p.getText();
        assertTrue(text.contains("\n"));
        assertTrue(text.contains("\t"));
        assertTrue(text.contains("\""));
        assertTrue(text.contains("\\"));
        assertTrue(text.contains("/"));
        p.close();
    }

    @Test
    public void testUnicodeHexEscape() throws IOException {
        String json = "[\"\\u0041\\u00e9\"]";
        UTF8StreamJsonParser p = createParser(json);
        p.nextToken();
        p.nextToken();
        assertEquals("A\u00e9", p.getText());
        p.close();
    }

    @Test
    public void testInvalidEscapeCharacterThrows() throws IOException {
        String json = "[\"bad\\qescape\"]";
        UTF8StreamJsonParser p = createParser(json);
        p.nextToken();
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    @Test
    public void testControlCharInStringThrows() throws IOException {
        String json = "[\"a\u0001b\"]";
        UTF8StreamJsonParser p = createParser(json);
        p.nextToken();
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    @Test
    public void testMultiByteUtf8CharsInString() throws IOException {
        // covers _decodeUtf8_2 / _decodeUtf8_3(fast) branches
        String json = "[\"h\u00e9llo w\u00f6rld\"]"; // é ö
        UTF8StreamJsonParser p = createParser(json);
        p.nextToken();
        p.nextToken();
        assertEquals("h\u00e9llo w\u00f6rld", p.getText());
        p.close();
    }

    @Test
    public void testFourByteUtf8SurrogatePairInString() throws IOException {
        // covers _decodeUtf8_4 + surrogate pair output branch
        String emoji = "\uD83D\uDE00"; // 😀
        String json = "[\"" + emoji + "\"]";
        UTF8StreamJsonParser p = createParser(json);
        p.nextToken();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        String text = p.getText();
        assertEquals(2, text.length());
        assertEquals(emoji, text);
        p.close();
    }

    @Test
    public void testSkipStringWhenTokenIncompleteAndUnread() throws IOException {
        // covers _skipString() branch in nextToken() (tokenIncomplete, value never read)
        String json = "[\"unread ascii value\",1]";
        UTF8StreamJsonParser p = createParser(json);
        p.nextToken(); // START_ARRAY
        p.nextToken(); // VALUE_STRING (tokenIncomplete = true, not read)
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        p.close();
    }

    @Test
    public void testSkipStringWithMultiByteCharsUnread() throws IOException {
        // covers _skipUtf8_2/_skipUtf8_3/_skipUtf8_4 inside _skipString()
        String emoji = "\uD83D\uDE00";
        String json = "[\"h\u00e9llo w\u00f6rld " + emoji + "\",2]";
        UTF8StreamJsonParser p = createParser(json);
        p.nextToken();
        p.nextToken(); // VALUE_STRING, unread
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        p.close();
    }

    @Test
    public void testVeryLongStringValueTriggersBufferGrowthAndLoadMore() throws IOException {
        // Forces input > default internal buffer size, exercising
        // loadMore()/finishCurrentSegment branches in _finishString2/_finishString
        String longStr = repeat('a', 20000);
        String json = "[\"" + longStr + "\"]";
        UTF8StreamJsonParser p = createParser(json);
        p.nextToken();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        String text = p.getText();
        assertEquals(20000, text.length());
        p.close();
    }

    @Test
    public void testVeryLongNumberTriggersParseNumber2() throws IOException {
        // Forces number long enough to be split across segment/buffer boundary (_parseNumber2)
        String digits = "1" + repeat('0', 5000);
        String json = "[" + digits + "]";
        UTF8StreamJsonParser p = createParser(json);
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(digits, p.getText());
        p.close();
    }

    // ---------- Comments ----------

    @Test
    public void testLineAndBlockCommentsAllowed() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_COMMENTS);
        String json = "[1, //comment\n2, /* block */ 3]";
        UTF8StreamJsonParser p = createParserWithFactory(f, json);
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
    public void testCommentsDisallowedByDefaultThrows() throws IOException {
        UTF8StreamJsonParser p = createParser("[ /*x*/ 1]");
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    @Test
    public void testUnterminatedBlockCommentThrows() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_COMMENTS);
        UTF8StreamJsonParser p = createParserWithFactory(f, "[1, /* unterminated");
        p.nextToken();
        p.nextToken();
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    @Test
    public void testInvalidCommentIndicatorThrows() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_COMMENTS);
        UTF8StreamJsonParser p = createParserWithFactory(f, "[1 /x 2]");
        p.nextToken();
        p.nextToken();
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    @Test
    public void testYamlCommentsAllowed() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_YAML_COMMENTS);
        String json = "[1, #comment\n2]";
        UTF8StreamJsonParser p = createParserWithFactory(f, json);
        p.nextToken();
        p.nextToken();
        assertEquals(1, p.getIntValue());
        p.nextToken();
        assertEquals(2, p.getIntValue());
        p.close();
    }

    // ---------- Whitespace / root-level separation ----------

    @Test
    public void testWhitespaceCRLFAroundTokens() throws IOException {
        String json = "{\r\n\"a\"\r\n:\r\n1\r\n}";
        UTF8StreamJsonParser p = createParser(json);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testMultipleRootValuesSeparatedBySpace() throws IOException {
        UTF8StreamJsonParser p = createParser("1 2");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        p.close();
    }

    @Test
    public void testMultipleRootValuesSeparatedByCR() throws IOException {
        UTF8StreamJsonParser p = createParser("1\r2");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        p.close();
    }

    @Test
    public void testMultipleRootValuesSeparatedByLF() throws IOException {
        UTF8StreamJsonParser p = createParser("1\n2");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        p.close();
    }

    @Test
    public void testRootValuesWithoutSeparatorThrows() throws IOException {
        UTF8StreamJsonParser p = createParser("1a");
        try {
            p.nextToken();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    // ---------- getText* family ----------

    @Test
    public void testGetTextCharactersForFieldName() throws IOException {
        String json = "{\"longFieldName\":1}";
        UTF8StreamJsonParser p = createParser(json);
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        char[] chars = p.getTextCharacters();
        assertEquals("longFieldName", new String(chars, 0, p.getTextLength()));
        assertEquals(0, p.getTextOffset());
        p.close();
    }

    @Test
    public void testGetTextLengthAndOffsetForStringValue() throws IOException {
        UTF8StreamJsonParser p = createParser("[\"hello\"]");
        p.nextToken();
        p.nextToken();
        assertEquals(5, p.getTextLength());
        assertEquals(0, p.getTextOffset());
        p.close();
    }

    @Test
    public void testGetTextForNumberToken() throws IOException {
        UTF8StreamJsonParser p = createParser("[12345]");
        p.nextToken();
        p.nextToken();
        assertEquals("12345", p.getText());
        p.close();
    }

    // ---------- Binary / Base64 ----------

    @Test
    public void testGetBinaryValueDecodesBase64() throws IOException {
        byte[] data = "Hello".getBytes(StandardCharsets.UTF_8);
        String encoded = Base64.getEncoder().encodeToString(data);
        UTF8StreamJsonParser p = createParser("[\"" + encoded + "\"]");
        p.nextToken();
        p.nextToken(); // VALUE_STRING, tokenIncomplete=true
        byte[] decoded = p.getBinaryValue();
        assertArrayEquals(data, decoded);
        p.close();
    }

    @Test
    public void testReadBinaryValueToOutputStreamIncremental() throws IOException {
        byte[] data = "TestData123!".getBytes(StandardCharsets.UTF_8);
        String encoded = Base64.getEncoder().encodeToString(data);
        UTF8StreamJsonParser p = createParser("[\"" + encoded + "\"]");
        p.nextToken();
        p.nextToken(); // tokenIncomplete = true
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = p.readBinaryValue(out);
        assertEquals(data.length, len);
        assertArrayEquals(data, out.toByteArray());
        p.close();
    }

    @Test
    public void testReadBinaryValueAfterTextAlreadyRead() throws IOException {
        // covers readBinaryValue's "!tokenIncomplete" branch
        byte[] data = "abc".getBytes(StandardCharsets.UTF_8);
        String encoded = Base64.getEncoder().encodeToString(data);
        UTF8StreamJsonParser p = createParser("[\"" + encoded + "\"]");
        p.nextToken();
        p.nextToken();
        p.getText(); // forces text read -> tokenIncomplete = false
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = p.readBinaryValue(out);
        assertEquals(data.length, len);
        p.close();
    }

    @Test
    public void testGetBinaryValueWrongTokenThrows() throws IOException {
        UTF8StreamJsonParser p = createParser("[1]");
        p.nextToken();
        p.nextToken(); // VALUE_NUMBER_INT
        try {
            p.getBinaryValue();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { /* ok */ }
        p.close();
    }

    // ---------- nextFieldName / nextTextValue / nextXxxValue ----------

    @Test
    public void testNextFieldNameSerializableMatch() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"name\":\"value\"}");
        p.nextToken();
        assertTrue(p.nextFieldName(new SerializedString("name")));
        assertEquals(JsonToken.FIELD_NAME, p.getCurrentToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        p.close();
    }

    @Test
    public void testNextFieldNameSerializableNoMatch() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"other\":1}");
        p.nextToken();
        assertFalse(p.nextFieldName(new SerializedString("name")));
        assertEquals("other", p.getCurrentName());
        p.close();
    }

    @Test
    public void testNextFieldNameCalledAfterFieldNameInvokesNextAfterName() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"a\":1}");
        p.nextToken();      // START_OBJECT
        p.nextToken();      // FIELD_NAME "a"
        assertFalse(p.nextFieldName(new SerializedString("x")));
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.getCurrentToken());
        p.close();
    }

    @Test
    public void testNextFieldNameStringVariant() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"key\":1}");
        p.nextToken();
        assertEquals("key", p.nextFieldName());
        p.close();
    }

    @Test
    public void testNextFieldNameReturnsNullAtEndOfObject() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextFieldName(); // "a"
        p.nextToken();     // consume value 1
        assertNull(p.nextFieldName()); // '}' -> END_OBJECT
        assertEquals(JsonToken.END_OBJECT, p.getCurrentToken());
        p.close();
    }

    @Test
    public void testNextTextValueAfterFieldName() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"a\":\"val\"}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        assertEquals("val", p.nextTextValue());
        p.close();
    }

    @Test
    public void testNextTextValueNonStringReturnsNull() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        assertNull(p.nextTextValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.getCurrentToken());
        p.close();
    }

    @Test
    public void testNextIntValueAfterFieldName() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"a\":42}");
        p.nextToken();
        p.nextToken();
        assertEquals(42, p.nextIntValue(-1));
        p.close();
    }

    @Test
    public void testNextIntValueDefaultWhenNotInt() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"a\":\"str\"}");
        p.nextToken();
        p.nextToken();
        assertEquals(-1, p.nextIntValue(-1));
        p.close();
    }

    @Test
    public void testNextLongValueAfterFieldName() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"a\":123456789012}");
        p.nextToken();
        p.nextToken();
        assertEquals(123456789012L, p.nextLongValue(-1L));
        p.close();
    }

    @Test
    public void testNextLongValueDefaultWhenNotInt() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"a\":true}");
        p.nextToken();
        p.nextToken();
        assertEquals(-1L, p.nextLongValue(-1L));
        p.close();
    }

    @Test
    public void testNextBooleanValueTrueFalseNullInArray() throws IOException {
        UTF8StreamJsonParser p = createParser("[true,false,null]");
        p.nextToken();
        assertEquals(Boolean.TRUE, p.nextBooleanValue());
        assertEquals(Boolean.FALSE, p.nextBooleanValue());
        assertNull(p.nextBooleanValue());
        p.close();
    }

    @Test
    public void testNextBooleanValueAfterFieldNameTrue() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"a\":true}");
        p.nextToken();
        p.nextToken();
        assertEquals(Boolean.TRUE, p.nextBooleanValue());
        p.close();
    }

    @Test
    public void testNextBooleanValueAfterFieldNameNonBoolean() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        assertNull(p.nextBooleanValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.getCurrentToken());
        p.close();
    }

    // ---------- getValueAsString / getValueAsInt ----------

    @Test
    public void testGetValueAsStringForStringAndNumberAndFieldName() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"fname\":\"txt\"}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        assertEquals("fname", p.getValueAsString());
        p.nextToken(); // VALUE_STRING
        assertEquals("txt", p.getValueAsString("def"));
        p.close();
    }

    @Test
    public void testGetValueAsIntForIntAndFloatToken() throws IOException {
        UTF8StreamJsonParser p = createParser("[42,3.9]");
        p.nextToken();
        p.nextToken();
        assertEquals(42, p.getValueAsInt());
        p.nextToken();
        assertEquals(3, p.getValueAsInt(0));
        p.close();
    }

    @Test
    public void testGetValueAsIntDefaultForNonNumeric() throws IOException {
        UTF8StreamJsonParser p = createParser("[\"str\"]");
        p.nextToken();
        p.nextToken();
        assertEquals(99, p.getValueAsInt(99));
        p.close();
    }

    // ---------- Life-cycle / IO ----------

    @Test
    public void testReleaseBufferedWithRemainingBytes() throws IOException {
        UTF8StreamJsonParser p = createParser("123 extra-content-after");
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = p.releaseBuffered(out);
        assertTrue(count >= 0);
        p.close();
    }

    @Test
    public void testReleaseBufferedNoDataReturnsZero() throws IOException {
        UTF8StreamJsonParser p = createParser("");
        p.nextToken(); // triggers close() due to EOF
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(0, p.releaseBuffered(out));
    }

    @Test
    public void testCloseIsIdempotent() throws IOException {
        UTF8StreamJsonParser p = createParser("{}");
        p.close();
        p.close(); // must not throw
    }

    @Test
    public void testGetInputSourceReturnsInputStream() throws IOException {
        UTF8StreamJsonParser p = createParser("{}");
        assertNotNull(p.getInputSource());
        assertTrue(p.getInputSource() instanceof InputStream);
        p.close();
    }

    @Test
    public void testGetAndSetCodec() throws IOException {
        UTF8StreamJsonParser p = createParser("{}");
        assertNull(p.getCodec());
        p.setCodec(null);
        assertNull(p.getCodec());
        p.close();
    }

    // ---------- Location ----------

    @Test
    public void testGetTokenLocationFieldNameBranch() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"field\":1}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        JsonLocation loc = p.getTokenLocation();
        assertNotNull(loc);
        p.close();
    }

    @Test
    public void testGetTokenLocationNonFieldNameBranch() throws IOException {
        UTF8StreamJsonParser p = createParser("[1]");
        p.nextToken(); // START_ARRAY
        JsonLocation loc = p.getTokenLocation();
        assertNotNull(loc);
        p.close();
    }

    @Test
    public void testGetCurrentLocationSmoke() throws IOException {
        UTF8StreamJsonParser p = createParser("[1,2,3]");
        p.nextToken();
        JsonLocation loc = p.getCurrentLocation();
        assertNotNull(loc);
        p.close();
    }
}
