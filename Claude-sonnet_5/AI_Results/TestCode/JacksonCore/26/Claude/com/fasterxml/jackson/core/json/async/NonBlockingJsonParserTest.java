package com.fasterxml.jackson.core.json.async;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.async.ByteArrayFeeder;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class NonBlockingJsonParserTest {

    // ---------- helpers ----------

    private byte[] utf8(String s) {
        return s.getBytes(StandardCharsets.UTF_8);
    }

    private NonBlockingJsonParser createParser() throws IOException {
        JsonFactory f = new JsonFactory();
        return (NonBlockingJsonParser) f.createNonBlockingByteArrayParser();
    }

    private NonBlockingJsonParser createParser(JsonFactory f) throws IOException {
        return (NonBlockingJsonParser) f.createNonBlockingByteArrayParser();
    }

    /** ไล่ nextToken() จนกว่าจะได้ token ที่ไม่ใช่ NOT_AVAILABLE (หรือครบ guard) */
    private JsonToken nt(NonBlockingJsonParser p) throws IOException {
        JsonToken t;
        int guard = 0;
        do {
            t = p.nextToken();
            guard++;
        } while (t == JsonToken.NOT_AVAILABLE && guard < 5);
        return t;
    }

    // =====================================================================
    // Group A: Feeder lifecycle
    // =====================================================================

    @Test
    public void testGetNonBlockingInputFeederReturnsSelf() throws IOException {
        NonBlockingJsonParser parser = createParser();
        assertSame(parser, parser.getNonBlockingInputFeeder());
    }

    @Test
    public void testNeedMoreInputInitiallyTrue() throws IOException {
        NonBlockingJsonParser parser = createParser();
        assertTrue(parser.needMoreInput());
    }

    @Test
    public void testNeedMoreInputFalseAfterFeed() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("123");
        feeder.feedInput(data, 0, data.length);
        assertFalse(parser.needMoreInput());
    }

    @Test
    public void testNeedMoreInputTrueAfterConsumingAllWithoutEOF() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("1");
        feeder.feedInput(data, 0, data.length);
        assertEquals(JsonToken.NOT_AVAILABLE, parser.nextToken());
        assertTrue(parser.needMoreInput());
    }

    @Test(expected = JsonParseException.class)
    public void testFeedInputThrowsWhenUndecodedBytesRemain() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("123");
        feeder.feedInput(data, 0, data.length);
        // ยังไม่ consume เลย -> _inputPtr < _inputEnd -> ต้อง throw
        feeder.feedInput(data, 0, data.length);
    }

    @Test(expected = JsonParseException.class)
    public void testFeedInputThrowsWhenEndBeforeStart() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("abc");
        feeder.feedInput(data, 2, 1); // end(1) < start(2)
    }

    @Test(expected = JsonParseException.class)
    public void testFeedInputThrowsAfterEndOfInput() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        feeder.endOfInput();
        byte[] data = utf8("abc");
        feeder.feedInput(data, 0, data.length);
    }

    // =====================================================================
    // Group B: releaseBuffered
    // =====================================================================

    @Test
    public void testReleaseBufferedNoAvailableData() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int avail = parser.releaseBuffered(out);
        assertEquals(0, avail);
        assertEquals(0, out.size());
    }

    @Test
    public void testReleaseBufferedWithAvailableData() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("123");
        feeder.feedInput(data, 0, data.length);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int avail = parser.releaseBuffered(out);
        assertEquals(3, avail);
        assertArrayEquals(data, out.toByteArray());
    }

    // =====================================================================
    // Group C: nextToken() top-level dispatch
    // =====================================================================

    @Test
    public void testNextTokenNotAvailableWhenNoInputYet() throws IOException {
        NonBlockingJsonParser parser = createParser();
        assertEquals(JsonToken.NOT_AVAILABLE, parser.nextToken());
    }

    // สมมติฐาน: close() (จาก ParserBase, ไม่ได้แสดงใน source ที่ให้มา) จะ set _closed=true
    @Test
    public void testNextTokenReturnsNullWhenClosedWithoutInput() throws IOException {
        NonBlockingJsonParser parser = createParser();
        parser.close();
        assertNull(parser.nextToken());
    }

    // สมมติฐาน: trailing white-space ที่ root level ตามด้วย EOF ถือเป็นจบเอกสารที่ถูกต้อง (_eofAsNextToken -> null)
    @Test
    public void testEofAsNextTokenAtDocumentEndAfterTrailingWhitespace() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("42 ");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(42, parser.getIntValue());
        assertNull(nt(parser));
    }

    // =====================================================================
    // Group D: BOM handling (_startDocument / _finishBOM)
    // =====================================================================

    @Test
    public void testBOMPrefixSkipped() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] bom = new byte[] { (byte) 0xEF, (byte) 0xBB, (byte) 0xBF };
        byte[] json = utf8("123");
        byte[] data = new byte[bom.length + json.length];
        System.arraycopy(bom, 0, data, 0, bom.length);
        System.arraycopy(json, 0, data, bom.length, json.length);
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(123, parser.getIntValue());
    }

    @Test
    public void testBOMSplitAcrossFeeds() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] part1 = new byte[] { (byte) 0xEF, (byte) 0xBB };
        feeder.feedInput(part1, 0, part1.length);
        assertEquals(JsonToken.NOT_AVAILABLE, parser.nextToken());
        byte[] part2 = new byte[] { (byte) 0xBF, '4', '2', ' ' };
        feeder.feedInput(part2, 0, part2.length);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());
    }

    // =====================================================================
    // Group E: invalid whitespace char
    // =====================================================================

    @Test(expected = JsonParseException.class)
    public void testInvalidControlCharAsWhitespaceThrows() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = new byte[] { 0x01, '1' }; // control char != space/lf/cr/tab
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        parser.nextToken();
    }

    // =====================================================================
    // Group F: split continuation (_finishToken switch)
    // =====================================================================

    @Test
    public void testSplitNumberAcrossFeeds() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] part1 = utf8("12");
        feeder.feedInput(part1, 0, part1.length);
        assertEquals(JsonToken.NOT_AVAILABLE, parser.nextToken());
        byte[] part2 = utf8("3 ");
        feeder.feedInput(part2, 0, part2.length);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
    }

    @Test
    public void testSplitFieldNameAcrossFeeds() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] part1 = utf8("{\"abc");
        feeder.feedInput(part1, 0, part1.length);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.NOT_AVAILABLE, parser.nextToken());
        byte[] part2 = utf8("def\":1}");
        feeder.feedInput(part2, 0, part2.length);
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("abcdef", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(JsonToken.END_OBJECT, nt(parser));
    }

    @Test
    public void testValueAfterCommaSplitAcrossFeeds() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] part1 = utf8("[1, ");
        feeder.feedInput(part1, 0, part1.length);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.NOT_AVAILABLE, parser.nextToken());
        byte[] part2 = utf8("2]");
        feeder.feedInput(part2, 0, part2.length);
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(JsonToken.END_ARRAY, nt(parser));
    }

    // =====================================================================
    // Group G: field names
    // =====================================================================

    @Test
    public void testFieldNamesVariousLengths() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        String json = "{\"a\":1,\"abcd\":2,\"abcde\":3,\"abcdefgh\":4,"
                + "\"abcdefghi\":5,\"abcdefghijkl\":6,\"abcdefghijklmnop\":7}";
        byte[] data = utf8(json);
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();

        String[] names = {"a", "abcd", "abcde", "abcdefgh",
                "abcdefghi", "abcdefghijkl", "abcdefghijklmnop"};
        int[] vals = {1, 2, 3, 4, 5, 6, 7};

        assertEquals(JsonToken.START_OBJECT, nt(parser));
        for (int i = 0; i < names.length; i++) {
            assertEquals(JsonToken.FIELD_NAME, nt(parser));
            assertEquals(names[i], parser.getCurrentName());
            assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
            assertEquals(vals[i], parser.getIntValue());
        }
        assertEquals(JsonToken.END_OBJECT, nt(parser));
    }

    @Test
    public void testFieldNameWithEscape() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("{\"a\\tb\":1}");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.START_OBJECT, nt(parser));
        assertEquals(JsonToken.FIELD_NAME, nt(parser));
        assertEquals("a\tb", parser.getCurrentName());
    }

    @Test
    public void testEmptyFieldName() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("{\"\":1}");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.START_OBJECT, nt(parser));
        assertEquals(JsonToken.FIELD_NAME, nt(parser));
        assertEquals("", parser.getCurrentName());
    }

    @Test
    public void testUnquotedFieldNameAllowed() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        NonBlockingJsonParser parser = createParser(f);
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("{abc:1}");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.START_OBJECT, nt(parser));
        assertEquals(JsonToken.FIELD_NAME, nt(parser));
        assertEquals("abc", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(JsonToken.END_OBJECT, nt(parser));
    }

    @Test(expected = JsonParseException.class)
    public void testUnquotedFieldNameDisallowedThrows() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("{abc:1}");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.START_OBJECT, nt(parser));
        parser.nextToken();
    }

    @Test
    public void testAposFieldName() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        NonBlockingJsonParser parser = createParser(f);
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("{'name':'value'}");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.START_OBJECT, nt(parser));
        assertEquals(JsonToken.FIELD_NAME, nt(parser));
        assertEquals("name", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, nt(parser));
        assertEquals("value", parser.getText());
        assertEquals(JsonToken.END_OBJECT, nt(parser));
    }

    // =====================================================================
    // Group H: containers
    // =====================================================================

    @Test
    public void testEmptyObjectAndArray() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("{}");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.START_OBJECT, nt(parser));
        assertEquals(JsonToken.END_OBJECT, nt(parser));
    }

    @Test
    public void testNestedArrayAndObject() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("{\"a\":[1,2,{\"b\":3}],\"c\":[]}");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();

        assertEquals(JsonToken.START_OBJECT, nt(parser));
        assertEquals(JsonToken.FIELD_NAME, nt(parser));
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, nt(parser));
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(JsonToken.START_OBJECT, nt(parser));
        assertEquals(JsonToken.FIELD_NAME, nt(parser));
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(JsonToken.END_OBJECT, nt(parser));
        assertEquals(JsonToken.END_ARRAY, nt(parser));
        assertEquals(JsonToken.FIELD_NAME, nt(parser));
        assertEquals("c", parser.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, nt(parser));
        assertEquals(JsonToken.END_ARRAY, nt(parser));
        assertEquals(JsonToken.END_OBJECT, nt(parser));
    }

    @Test(expected = JsonParseException.class)
    public void testArrayMissingCommaThrows() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("[1 2]");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.START_ARRAY, nt(parser));
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        parser.nextToken();
    }

    @Test
    public void testAllowMissingValuesInArray() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_MISSING_VALUES);
        NonBlockingJsonParser parser = createParser(f);
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("[1,,3]");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();

        assertEquals(JsonToken.START_ARRAY, nt(parser));
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(JsonToken.VALUE_NULL, nt(parser));
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(JsonToken.END_ARRAY, nt(parser));
    }

    @Test
    public void testArrayTrailingCommaAllowed() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_TRAILING_COMMA);
        NonBlockingJsonParser parser = createParser(f);
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("[1,2,]");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();

        assertEquals(JsonToken.START_ARRAY, nt(parser));
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(JsonToken.END_ARRAY, nt(parser));
    }

    @Test(expected = JsonParseException.class)
    public void testArrayTrailingCommaDisallowedThrows() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("[1,2,]");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();

        assertEquals(JsonToken.START_ARRAY, nt(parser));
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        parser.nextToken();
    }

    @Test
    public void testObjectTrailingCommaAllowed() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_TRAILING_COMMA);
        NonBlockingJsonParser parser = createParser(f);
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("{\"a\":1,}");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();

        assertEquals(JsonToken.START_OBJECT, nt(parser));
        assertEquals(JsonToken.FIELD_NAME, nt(parser));
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(JsonToken.END_OBJECT, nt(parser));
    }

    @Test(expected = JsonParseException.class)
    public void testObjectTrailingCommaDisallowedThrows() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("{\"a\":1,}");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();

        assertEquals(JsonToken.START_OBJECT, nt(parser));
        assertEquals(JsonToken.FIELD_NAME, nt(parser));
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        parser.nextToken();
    }

    // =====================================================================
    // Group I: field/value separators
    // =====================================================================

    @Test(expected = JsonParseException.class)
    public void testMissingColonThrows() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("{\"a\" 1}");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.START_OBJECT, nt(parser));
        assertEquals(JsonToken.FIELD_NAME, nt(parser));
        parser.nextToken();
    }

    @Test
    public void testColonWithCommentsAndWhitespace() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_COMMENTS);
        NonBlockingJsonParser parser = createParser(f);
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("{\"a\" /* c */ : 1}");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();

        assertEquals(JsonToken.START_OBJECT, nt(parser));
        assertEquals(JsonToken.FIELD_NAME, nt(parser));
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(JsonToken.END_OBJECT, nt(parser));
    }

    // =====================================================================
    // Group J: numbers
    // =====================================================================

    @Test
    public void testZeroAlone() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("0");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(0, parser.getIntValue());
    }

    @Test
    public void testNegativeInteger() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("-123");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(-123, parser.getIntValue());
    }

    @Test
    public void testZeroFollowedByArrayClose() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("[0]");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.START_ARRAY, nt(parser));
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(0, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, nt(parser));
    }

    @Test
    public void testLeadingZerosAllowed() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS);
        NonBlockingJsonParser parser = createParser(f);
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("007");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(7, parser.getIntValue());
    }

    @Test(expected = JsonParseException.class)
    public void testLeadingZerosDisallowedThrows() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("007");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        parser.nextToken();
    }

    @Test
    public void testFloatAndExponentWithTrailingSpace() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("-123.456e+7 ");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, nt(parser));
        assertEquals(-123.456e+7, parser.getDoubleValue(), 0.0001);
    }

    @Test
    public void testFloatWithExponentEOFCompletion() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("1.5e2");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, nt(parser));
        assertEquals(150.0, parser.getDoubleValue(), 0.0001);
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidFractionThrows() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("1.a");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testNegativeInvalidCharThrows() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("-a");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        parser.nextToken();
    }

    // =====================================================================
    // Group K: strings
    // =====================================================================

    @Test
    public void testStringSplitAcrossFeeds() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] part1 = utf8("\"hel");
        feeder.feedInput(part1, 0, part1.length);
        assertEquals(JsonToken.NOT_AVAILABLE, parser.nextToken());
        byte[] part2 = utf8("lo\"");
        feeder.feedInput(part2, 0, part2.length);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
    }

    @Test
    public void testStringWithEscapes() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("\"a\\nb\\tc\\\"d\\\\e\\/f\\u0041g\"");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.VALUE_STRING, nt(parser));
        assertEquals("a\nb\tc\"d\\e/fAg", parser.getText());
    }

    @Test(expected = JsonParseException.class)
    public void testStringInvalidEscapeThrows() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("\"a\\qb\"");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testStringWithRawControlCharThrows() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("\"ab\ncd\"");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        parser.nextToken();
    }

    @Test
    public void testStringWithMultiByteUtf8() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        String s = "h\u00e9llo\u20ac\uD83D\uDE00"; // é (2-byte), € (3-byte), 😀 (4-byte, surrogate pair)
        byte[] data = utf8("\"" + s + "\"");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.VALUE_STRING, nt(parser));
        assertEquals(s, parser.getText());
    }

    @Test
    public void testSplitMultiByteUtf8AcrossFeeds() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        // '€' = U+20AC = 0xE2 0x82 0xAC (3-byte UTF-8), แยกกลาง sequence
        byte[] part1 = new byte[] { '"', (byte) 0xE2 };
        feeder.feedInput(part1, 0, part1.length);
        assertEquals(JsonToken.NOT_AVAILABLE, parser.nextToken());
        byte[] part2 = new byte[] { (byte) 0x82, (byte) 0xAC, '"' };
        feeder.feedInput(part2, 0, part2.length);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("\u20AC", parser.getText());
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidUtf8ContinuationByteThrows() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        // 0xC2 เป็น lead byte ของ 2-byte sequence แต่ byte ต่อไปไม่ใช่ continuation byte (0x20)
        byte[] data = new byte[] { '"', (byte) 0xC2, ' ', '"' };
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        parser.nextToken();
    }

    @Test
    public void testSingleQuoteStringAllowed() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        NonBlockingJsonParser parser = createParser(f);
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("'hello'");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.VALUE_STRING, nt(parser));
        assertEquals("hello", parser.getText());
    }

    @Test(expected = JsonParseException.class)
    public void testSingleQuoteStringDisallowedThrows() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("'hello'");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        parser.nextToken();
    }

    // =====================================================================
    // Group L: comments
    // =====================================================================

    @Test
    public void testJavaStyleCommentsAllowed() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_COMMENTS);
        NonBlockingJsonParser parser = createParser(f);
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("/* comment */ [ 1, /* mid */ 2 ] // trail\n");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.START_ARRAY, nt(parser));
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(JsonToken.END_ARRAY, nt(parser));
    }

    @Test(expected = JsonParseException.class)
    public void testJavaStyleCommentsDisabledThrows() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("/* comment */ 1");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidCommentMarkerThrows() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_COMMENTS);
        NonBlockingJsonParser parser = createParser(f);
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("/x 1");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        parser.nextToken();
    }

    @Test
    public void testYamlCommentsAllowed() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_YAML_COMMENTS);
        NonBlockingJsonParser parser = createParser(f);
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        byte[] data = utf8("# comment\n123");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();
        assertEquals(JsonToken.VALUE_NUMBER_INT, nt(parser));
        assertEquals(123, parser.getIntValue());
    }

    @Test
    public void testArrayWithCommentsBetweenElements() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_COMMENTS);
        NonBlockingJsonParser