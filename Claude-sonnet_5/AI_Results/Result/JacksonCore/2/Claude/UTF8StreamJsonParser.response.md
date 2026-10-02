# UTF8StreamJsonParserTest.java

หมายเหตุสำคัญก่อนเริ่ม:
- คลาส `UTF8StreamJsonParser` เป็น `final class` ใน package `com.fasterxml.jackson.core.json` ที่ constructor ต้องใช้ `IOContext`, `BytesToNameCanonicalizer` ซึ่งเป็น internal class ที่สร้างเองยาก จึงใช้ `JsonFactory` (public API มาตรฐานของ jackson-core ที่อยู่ใน classpath เดียวกับคลาสเป้าหมาย) เป็นตัวสร้าง instance ของคลาสนี้ผ่าน `createParser(byte[])` / `createParser(InputStream)` ซึ่งจะคืนค่าเป็น `UTF8StreamJsonParser` จริงเมื่อ input เป็น UTF-8 bytes — วิธีนี้เป็นวิธีมาตรฐานที่ใช้ทดสอบคลาสนี้ใน Defects4J
- พฤติกรรมบางส่วน (เช่น `resetAsNaN`, `loadMoreGuaranteed`, `_reportInvalidEOF`) ถูก inherited มาจาก `ParserBase` ซึ่งไม่มี source ให้ — จะทดสอบเฉพาะผลลัพธ์ที่สังเกตได้จาก public API เท่านั้น (มีคอมเมนต์กำกับจุดที่เป็น assumption)

```java
package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;

import java.io.*;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;

public class UTF8StreamJsonParserTest
{
    private JsonFactory factory;

    @Before
    public void setUp() {
        factory = new JsonFactory();
    }

    private JsonParser p(String json) throws IOException {
        return factory.createParser(json.getBytes("UTF-8"));
    }

    private JsonParser p(byte[] data) throws IOException {
        return factory.createParser(data);
    }

    // ---------------------------------------------------------
    // Sanity: confirm implementation class used by factory
    // ---------------------------------------------------------

    @Test
    public void testFactoryProducesUTF8StreamJsonParser() throws IOException {
        JsonParser parser = p("{}");
        assertTrue(parser instanceof UTF8StreamJsonParser);
        parser.close();
    }

    // ---------------------------------------------------------
    // nextToken() - basic structure / empty input / EOF
    // ---------------------------------------------------------

    @Test
    public void testEmptyInputReturnsNullToken() throws IOException {
        JsonParser parser = p("");
        assertNull(parser.nextToken());
        assertNull(parser.getCurrentToken());
    }

    @Test
    public void testWhitespaceOnlyInputReturnsNull() throws IOException {
        JsonParser parser = p("   \n\t  ");
        assertNull(parser.nextToken());
    }

    @Test
    public void testFullObjectSequence() throws IOException {
        JsonParser parser = p("{\"a\":1,\"b\":true,\"c\":null,\"d\":\"str\",\"e\":[1,2,3]}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("str", parser.getText());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedArrayCloseInObjectContext() throws IOException {
        // '{' opens object context, ']' is invalid closer -> _reportMismatchedEndMarker
        JsonParser parser = p("{]");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // should throw
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedObjectCloseInArrayContext() throws IOException {
        JsonParser parser = p("[}");
        parser.nextToken(); // START_ARRAY
        parser.nextToken(); // should throw
    }

    @Test(expected = JsonParseException.class)
    public void testMissingCommaThrows() throws IOException {
        JsonParser parser = p("[1 2]");
        parser.nextToken(); // START_ARRAY
        parser.nextToken(); // 1
        parser.nextToken(); // expects comma -> throws
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedCloserAsValue() throws IOException {
        // ']' where a value is expected inside array element position
        JsonParser parser = p("[,]");
        parser.nextToken(); // START_ARRAY
        parser.nextToken(); // unexpected char ',' as first value -> throws
    }

    // ---------------------------------------------------------
    // Field name handling / _handleOddName / apos names
    // ---------------------------------------------------------

    @Test(expected = JsonParseException.class)
    public void testUnquotedFieldNameDisabledByDefault() throws IOException {
        JsonParser parser = p("{a:1}");
        parser.nextToken();
        parser.nextToken(); // throws: not quote, unquoted feature off
    }

    @Test
    public void testUnquotedFieldNameEnabled() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        JsonParser parser = p("{a:1}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void testSingleQuoteFieldDisabledByDefault() throws IOException {
        JsonParser parser = p("{'a':1}");
        parser.nextToken();
        parser.nextToken(); // throws since neither single-quote nor unquoted enabled
    }

    @Test
    public void testSingleQuoteFieldAndValueEnabled() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        JsonParser parser = p("{'a':'b'}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("b", parser.getText());
    }

    @Test
    public void testLongFieldNameTriggersQuadArrayGrowth() throws IOException {
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < 100; i++) name.append('x');
        String json = "{\"" + name + "\":1}";
        JsonParser parser = p(json);
        parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(name.toString(), parser.getCurrentName());
    }

    @Test
    public void testEscapedUnicodeFieldName2And3ByteEncoding() throws IOException {
        // \u00e9 -> 2-byte utf8 branch, \u4e2d -> 3-byte utf8 branch inside parseEscapedName
        JsonParser parser = p("{\"caf\\u00e9_\\u4e2d\":1}");
        parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("caf\u00e9_\u4e2d", parser.getCurrentName());
    }

    @Test
    public void testRawUtf8MultibyteFieldName() throws IOException {
        // raw (non-escaped) UTF-8 bytes for 'é' directly in field name
        JsonParser parser = p("{\"caf\u00e9\":1}");
        parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("caf\u00e9", parser.getCurrentName());
    }

    @Test
    public void testEmptyFieldName() throws IOException {
        JsonParser parser = p("{\"\":1}");
        parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("", parser.getCurrentName());
    }

    // ---------------------------------------------------------
    // Comments
    // ---------------------------------------------------------

    @Test(expected = JsonParseException.class)
    public void testCCommentDisabledByDefault() throws IOException {
        JsonParser parser = p("{\"a\":1 /* c */ ,\"b\":2}");
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken(); // hits '/' -> disabled -> throws
    }

    @Test
    public void testCStyleCommentEnabled() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_COMMENTS);
        JsonParser parser = p("{\"a\":1 /* comment */ ,\"b\":2}");
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("b", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
    }

    @Test
    public void testCppStyleLineCommentEnabled() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_COMMENTS);
        JsonParser parser = p("{\"a\":1 // line comment\n ,\"b\":2}");
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("b", parser.getCurrentName());
    }

    @Test
    public void testYamlCommentEnabled() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_YAML_COMMENTS);
        JsonParser parser = p("{\"a\":1 # comment\n ,\"b\":2}");
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("b", parser.getCurrentName());
    }

    @Test(expected = JsonParseException.class)
    public void testYamlCommentDisabledCausesError() throws IOException {
        JsonParser parser = p("{\"a\":1 # comment\n ,\"b\":2}");
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken(); // '#' returned as-is, not comma -> throws
    }

    // ---------------------------------------------------------
    // Numbers: leading zero, negative, floats, invalid forms
    // ---------------------------------------------------------

    @Test
    public void testZeroAlone() throws IOException {
        JsonParser parser = p("0");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.getIntValue());
    }

    @Test
    public void testZeroFollowedByNonDigitNoFeatureNeeded() throws IOException {
        JsonParser parser = p("[0,1]");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.getIntValue());
    }

    @Test(expected = JsonParseException.class)
    public void testLeadingZeroDisabledThrows() throws IOException {
        JsonParser parser = p("01");
        parser.nextToken(); // throws: leading zero not allowed
    }

    @Test
    public void testLeadingZeroEnabledSingle() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS);
        JsonParser parser = p("01");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
    }

    @Test
    public void testLeadingZeroEnabledDouble() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS);
        JsonParser parser = p("001");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
    }

    @Test
    public void testNegativeInteger() throws IOException {
        JsonParser parser = p("-123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-123, parser.getIntValue());
    }

    @Test
    public void testFloatWithFractionAndExponent() throws IOException {
        JsonParser parser = p("-1.5e2");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-150.0, parser.getDoubleValue(), 0.0001);
    }

    @Test
    public void testFloatWithExplicitPlusExponentSign() throws IOException {
        JsonParser parser = p("1e+2");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(100.0, parser.getDoubleValue(), 0.0001);
    }

    @Test(expected = JsonParseException.class)
    public void testDecimalPointNotFollowedByDigit() throws IOException {
        JsonParser parser = p("[1.,2]");
        parser.nextToken();
        parser.nextToken(); // throws
    }

    @Test(expected = JsonParseException.class)
    public void testExponentNotFollowedByDigit() throws IOException {
        JsonParser parser = p("[1e,2]");
        parser.nextToken();
        parser.nextToken(); // throws
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidCharAfterMinus() throws IOException {
        JsonParser parser = p("-a");
        parser.nextToken(); // throws
    }

    @Test
    public void testLargeNumberCrossesBufferBoundary() throws IOException {
        // Force _parserNumber2 branch by exceeding default read buffer size
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9000; i++) sb.append('9');
        String big = sb.toString();
        JsonParser parser = p(big);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(big, parser.getText());
    }

    // ---------------------------------------------------------
    // NaN / Infinity handling
    // ---------------------------------------------------------

    @Test(expected = JsonParseException.class)
    public void testNaNDisabledByDefault() throws IOException {
        JsonParser parser = p("NaN");
        parser.nextToken();
    }

    @Test
    public void testNaNEnabled() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        JsonParser parser = p("NaN");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isNaN(parser.getDoubleValue()));
    }

    @Test
    public void testNegativeInfinityEnabled() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        JsonParser parser = p("-Infinity");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue(), 0.0);
    }

    @Test(expected = JsonParseException.class)
    public void testPositiveInfinityDisabledByDefault() throws IOException {
        JsonParser parser = p("Infinity");
        parser.nextToken();
    }

    // ---------------------------------------------------------
    // true/false/null tokens & invalid tokens
    // ---------------------------------------------------------

    @Test
    public void testTrueFalseNull() throws IOException {
        JsonParser parser = p("[true,false,null]");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidTokenLikeIdentifier() throws IOException {
        JsonParser parser = p("truthy");
        parser.nextToken(); // matchToken fails
    }

    @Test(expected = JsonParseException.class)
    public void testUnrecognizedValueStartChar() throws IOException {
        JsonParser parser = p("@invalid");
        parser.nextToken();
    }

    // ---------------------------------------------------------
    // String content: escapes, control chars, invalid UTF-8
    // ---------------------------------------------------------

    @Test
    public void testStringWithStandardEscapes() throws IOException {
        JsonParser parser = p("\"a\\nb\\tc\\\"d\\\\e\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("a\nb\tc\"d\\e", parser.getText());
    }

    @Test
    public void testStringWithUnicodeEscape() throws IOException {
        JsonParser parser = p("\"\\u0041BC\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("ABC", parser.getText());
    }

    @Test(expected = JsonParseException.class)
    public void testUnescapedControlCharInString() throws IOException {
        JsonParser parser = p("\"a\nb\"");
        parser.nextToken(); // raw newline byte -> _throwUnquotedSpace
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidUtf8ContinuationByte() throws IOException {
        // '"' 0xC2 (2-byte lead) 0x20 (invalid continuation) '"'
        byte[] data = new byte[] { '"', (byte) 0xC2, (byte) 0x20, '"' };
        JsonParser parser = p(data);
        parser.nextToken(); // should throw invalid UTF-8 middle byte
    }

    @Test
    public void testStringSpanningMultipleSegments() throws IOException {
        // long string forces _finishString2 main_loop segment growth
        StringBuilder sb = new StringBuilder("\"");
        for (int i = 0; i < 9000; i++) sb.append('a');
        sb.append('"');
        JsonParser parser = p(sb.toString());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals(9000, parser.getTextLength());
    }

    @Test
    public void testGetTextCharactersAndLengthAndOffsetForString() throws IOException {
        JsonParser parser = p("\"hello\"");
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertEquals('h', chars[parser.getTextOffset()]);
        assertEquals(5, parser.getTextLength());
    }

    @Test
    public void testGetTextCharactersForFieldName() throws IOException {
        JsonParser parser = p("{\"abc\":1}");
        parser.nextToken();
        parser.nextToken(); // FIELD_NAME
        char[] chars = parser.getTextCharacters();
        assertEquals("abc", new String(chars, 0, parser.getTextLength()));
    }

    // ---------------------------------------------------------
    // Binary / base64
    // ---------------------------------------------------------

    @Test
    public void testGetBinaryValueIncompleteToken() throws IOException {
        JsonParser parser = p("\"AQID\""); // base64 for {1,2,3}
        parser.nextToken();
        byte[] result = parser.getBinaryValue();
        assertArrayEquals(new byte[] {1,2,3}, result);
    }

    @Test
    public void testGetBinaryValueAfterTextAlreadyRead() throws IOException {
        JsonParser parser = p("\"AQID\"");
        parser.nextToken();
        parser.getText(); // forces _finishString, tokenIncomplete=false
        byte[] result = parser.getBinaryValue();
        assertArrayEquals(new byte[] {1,2,3}, result);
    }

    @Test
    public void testReadBinaryValueIncremental() throws IOException {
        JsonParser parser = p("\"AQID\"");
        parser.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = parser.readBinaryValue(out);
        assertEquals(3, len);
        assertArrayEquals(new byte[] {1,2,3}, out.toByteArray());
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueWrongTokenType() throws IOException {
        JsonParser parser = p("123");
        parser.nextToken();
        parser.getBinaryValue(); // not VALUE_STRING -> _reportError
    }

    // ---------------------------------------------------------
    // nextFieldName(SerializableString)
    // ---------------------------------------------------------

    @Test
    public void testNextFieldNameFastMatch() throws IOException {
        JsonParser parser = p("{\"abc\":1}");
        parser.nextToken(); // START_OBJECT
        boolean match = parser.nextFieldName(new SerializedString("abc"));
        assertTrue(match);
        assertEquals("abc", parser.getCurrentName());
        assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
    }

    @Test
    public void testNextFieldNameFastMismatchFallsToSlowPath() throws IOException {
        JsonParser parser = p("{\"abcd\":true}");
        parser.nextToken();
        boolean match = parser.nextFieldName(new SerializedString("abc"));
        assertFalse(match);
        assertEquals("abcd", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
    }

    @Test
    public void testNextFieldNameAtEndOfObject() throws IOException {
        JsonParser parser = p("{}");
        parser.nextToken();
        boolean match = parser.nextFieldName(new SerializedString("x"));
        assertFalse(match);
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
    }

    @Test
    public void testNextFieldNameCalledTwiceConsecutively() throws IOException {
        JsonParser parser = p("{\"abc\":1}");
        parser.nextToken();
        assertTrue(parser.nextFieldName(new SerializedString("abc")));
        // Second call while currToken==FIELD_NAME -> _nextAfterName branch
        boolean second = parser.nextFieldName(new SerializedString("whatever"));
        assertFalse(second);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        assertEquals(1, parser.getIntValue());
    }

    @Test
    public void testNextFieldNameWithStartObjectPendingValue() throws IOException {
        JsonParser parser = p("{\"a\":{\"x\":1}}");
        parser.nextToken();
        assertTrue(parser.nextFieldName(new SerializedString("a")));
        parser.nextFieldName(new SerializedString("dummy")); // advances to pending value
        assertEquals(JsonToken.START_OBJECT, parser.getCurrentToken());
    }

    @Test
    public void testNextFieldNameWithStartArrayPendingValue() throws IOException {
        JsonParser parser = p("{\"a\":[1]}");
        parser.nextToken();
        assertTrue(parser.nextFieldName(new SerializedString("a")));
        parser.nextFieldName(new SerializedString("dummy"));
        assertEquals(JsonToken.START_ARRAY, parser.getCurrentToken());
    }

    @Test
    public void testNextFieldNameSlowColonPath() throws IOException {
        // space between field name and colon forces _skipColon() slow path
        JsonParser parser = p("{\"abc\" : 1}");
        parser.nextToken();
        assertTrue(parser.nextFieldName(new SerializedString("abc")));
        parser.nextFieldName(new SerializedString("dummy"));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        assertEquals(1, parser.getIntValue());
    }

    // ---------------------------------------------------------
    // nextTextValue()
    // ---------------------------------------------------------

    @Test
    public void testNextTextValueFromPendingString() throws IOException {
        JsonParser parser = p("{\"a\":\"hello\"}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME a (pending VALUE_STRING)
        String text = parser.nextTextValue();
        assertEquals("hello", text);
    }

    @Test
    public void testNextTextValuePendingNonString() throws IOException {
        JsonParser parser = p("{\"a\":1}");
        parser.nextToken();
        parser.nextToken(); // FIELD_NAME a (pending VALUE_NUMBER_INT)
        String text = parser.nextTextValue();
        assertNull(text);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
    }

    @Test
    public void testNextTextValuePendingStartArray() throws IOException {
        JsonParser parser = p("{\"a\":[1]}");
        parser.nextToken();
        parser.nextToken(); // FIELD_NAME a (pending START_ARRAY)
        assertNull(parser.nextTextValue());
        assertEquals(JsonToken.START_ARRAY, parser.getCurrentToken());
    }

    @Test
    public void testNextTextValueViaNextTokenDelegation() throws IOException {
        JsonParser parser = p("\"hello\"");
        assertEquals("hello", parser.nextTextValue());
    }

    @Test
    public void testNextTextValueViaNextTokenDelegationNonString() throws IOException {
        JsonParser parser = p("123");
        assertNull(parser.nextTextValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
    }

    // ---------------------------------------------------------
    // nextIntValue()
    // ---------------------------------------------------------

    @Test
    public void testNextIntValuePendingMatch() throws IOException {
        JsonParser parser = p("{\"a\":42}");
        parser.nextToken();
        parser.nextToken();
        assertEquals(42, parser.nextIntValue(-1));
    }

    @Test
    public void testNextIntValuePendingMismatchReturnsDefault() throws IOException {
        JsonParser parser = p("{\"a\":true}");
        parser.nextToken();
        parser.nextToken();
        assertEquals(-1, parser.nextIntValue(-1));
        assertEquals(JsonToken.VALUE_TRUE, parser.getCurrentToken());
    }

    @Test
    public void testNextIntValuePendingStartArray() throws IOException {
        JsonParser parser = p("{\"a\":[1]}");
        parser.nextToken();
        parser.nextToken();
        assertEquals(-1, parser.nextIntValue(-1));
        assertEquals(JsonToken.START_ARRAY, parser.getCurrentToken());
    }

    @Test
    public void testNextIntValueViaDelegation() throws IOException {
        JsonParser parser = p("99");
        assertEquals(99, parser.nextIntValue(-1));
    }

    @Test
    public void testNextIntValueViaDelegationMismatch() throws IOException {
        JsonParser parser = p("true");
        assertEquals(-1, parser.nextIntValue(-1));
    }

    // ---------------------------------------------------------
    // nextLongValue()
    // ---------------------------------------------------------

    @Test
    public void testNextLongValuePendingMatch() throws IOException {
        JsonParser parser = p("{\"a\":123456789012}");
        parser.nextToken();
        parser.nextToken();
        assertEquals(123456789012L, parser.nextLongValue(-1L));
    }

    @Test
    public void testNextLongValuePendingMismatch() throws IOException {
        JsonParser parser = p("{\"a\":false}");
        parser.nextToken();
        parser.nextToken();
        assertEquals(-1L, parser.nextLongValue(-1L));
        assertEquals(JsonToken.VALUE_FALSE, parser.getCurrentToken());
    }

    @Test
    public void testNextLongValueViaDelegation() throws IOException {
        JsonParser parser = p("123456789012");
        assertEquals(123456789012L, parser.nextLongValue(-1L));
    }

    // ---------------------------------------------------------
    // nextBooleanValue()
    // ---------------------------------------------------------

    @Test
    public void testNextBooleanValuePendingTrue() throws IOException {
        JsonParser parser = p("{\"a\":true}");
        parser.nextToken();
        parser.nextToken();
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValuePendingFalse() throws IOException {
        JsonParser parser = p("{\"a\":false}");
        parser.nextToken();
        parser.nextToken();
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValuePendingMismatch() throws IOException {
        JsonParser parser = p("{\"a\":1}");
        parser.nextToken();
        parser.nextToken();
        assertNull(parser.nextBooleanValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
    }

    @Test
    public void testNextBooleanValuePendingStartObject() throws IOException {
        JsonParser parser = p("{\"a\":{\"x\":1}}");
        parser.nextToken();
        parser.nextToken();
        assertNull(parser.nextBooleanValue());
        assertEquals(JsonToken.START_OBJECT, parser.getCurrentToken());
    }

    @Test
    public void testNextBooleanValueViaDelegationSwitch() throws IOException {
        JsonParser parser = p("true");
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueViaDelegationDefaultNull() throws IOException {
        JsonParser parser = p("123");
        assertNull(parser.nextBooleanValue());
    }

    // ---------------------------------------------------------
    // getText()/_getText2 for non-string tokens & default cases
    // ---------------------------------------------------------

    @Test
    public void testGetTextForFieldName() throws IOException {
        JsonParser parser = p("{\"key\":1}");
        parser.nextToken();
        parser.nextToken();
        assertEquals("key", parser.getText());
    }

    @Test
    public void testGetTextForIntAndFloat() throws IOException {
        JsonParser parser = p("[1,1.5]");
        parser.nextToken();
        parser.nextToken();
        assertEquals("1", parser.getText());
        parser.nextToken();
        assertEquals("1.5", parser.getText());
    }

    @Test
    public void testGetTextForBooleanDefaultBranch() throws IOException {
        JsonParser parser = p("true");
        parser.nextToken();
        assertEquals("true", parser.getText());
    }

    @Test
    public void testGetValueAsStringDefault() throws IOException {
        JsonParser parser = p("123");
        parser.nextToken();
        assertEquals("123", parser.getValueAsString("def"));
    }

    // ---------------------------------------------------------
    // Whitespace/CR-LF handling & location tracking
    // ---------------------------------------------------------

    @Test
    public void testCRLFRowTracking() throws IOException {
        JsonParser parser = p("{\r\n\"a\":1\r\n}");
        parser.nextToken(); // START_OBJECT row 1
        parser.nextToken(); // FIELD_NAME on row 2
        assertTrue(parser.getCurrentLocation().getLineNr() >= 2);
    }

    @Test
    public void testLoneCRWithoutLF() throws IOException {
        JsonParser parser = p("{\r\"a\":1}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
    }

    // ---------------------------------------------------------
    // releaseBuffered / getInputSource / close / getCodec
    // ---------------------------------------------------------

    @Test
    public void testReleaseBufferedReturnsRemainingBytes() throws IOException {
        String json = "{\"a\":1}";
        JsonParser parser = p(json);
        parser.nextToken(); // consumes "{"
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        assertTrue(count > 0);
        assertEquals(json.substring(1), out.toString("UTF-8"));
    }

    @Test
    public void testReleaseBufferedZeroWhenFullyConsumed() throws IOException {
        JsonParser parser = p("1");
        parser.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        assertEquals(0, count);
    }

    @Test
    public void testGetInputSourceForByteArraySourceIsNull() throws IOException {
        JsonParser parser = p("{}");
        // byte[]-backed source has no underlying InputStream
        assertNull(parser.getInputSource());
    }

    @Test
    public void testGetInputSourceForInputStreamSource() throws IOException {
        InputStream in = new ByteArrayInputStream("{}".getBytes("UTF-8"));
        JsonParser parser = factory.createParser(in);
        assertNotNull(parser.getInputSource());
    }

    @Test
    public void testGetCodecDefaultNull() throws IOException {
        JsonParser parser = p("{}");
        assertNull(parser.getCodec());
    }

    @Test
    public void testCloseDoesNotThrow() throws IOException {
        JsonParser parser = p("{}");
        parser.nextToken();
        parser.close(); // should not throw
        assertTrue(parser.isClosed());
    }

    @Test
    public void testAutoCloseOnEndOfInput() throws IOException {
        JsonParser parser = p("1");
        parser.nextToken(); // VALUE_NUMBER_INT
        assertNull(parser.nextToken()); // hits EOF -> close() called internally
        assertTrue(parser.isClosed());
    }
}
```

# ตารางสรุป Branch/Condition ที่แต่ละกลุ่มเทสครอบคลุม

| กลุ่มเมธอดเทส | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testEmptyInputReturnsNullToken`, `testWhitespaceOnlyInputReturnsNull` | `_skipWSOrEnd` คืน -1, path `close()` + return null ใน `nextToken()` |
| `testFullObjectSequence` | เส้นทางหลักของ `nextToken()`: object/array/string/number/bool/null, `expectComma()`, `_nextTokenNotInObject`, quickie-colon check |
| `testMismatchedArrayCloseInObjectContext`, `testMismatchedObjectCloseInArrayContext` | branch `i==INT_RBRACKET`/`INT_RCURLY` กับ `inArray()`/`inObject()` เป็น false → `_reportMismatchedEndMarker` |
| `testMissingCommaThrows`, `testUnexpectedCloserAsValue` | `expectComma()` true กับ `i != INT_COMMA`; ค่า `]`/`}` ในตำแหน่ง value |
| `testUnquotedFieldName*`, `testSingleQuoteField*`, `testLongFieldNameTriggersQuadArrayGrowth`, `testEscapedUnicodeFieldName*`, `testRawUtf8MultibyteFieldName`, `testEmptyFieldName` | `_handleOddName`, `_parseAposName`, `parseMediumName`/`parseLongName`/`parseEscapedName`, `growArrayBy`, empty-name branch |
| `testCComment*`, `testCppStyleLineCommentEnabled`, `testYamlComment*` | `_skipWS`/`_skipWSOrEnd` cases `'/'`,`'#'`, `ALLOW_COMMENTS`, `ALLOW_YAML_COMMENTS` เปิด/ปิด |
| `testZero*`, `testLeadingZero*`, `testNegativeInteger`, `testFloat*`, `testDecimalPointNotFollowedByDigit`, `testExponentNotFollowedByDigit`, `testInvalidCharAfterMinus`, `testLargeNumberCrossesBufferBoundary` | `_parseNumber`, `_verifyNoLeadingZeroes` (ทุก branch: EOF/non-digit/feature off/loop 0-ซ้ำ), `_parseFloat` (fractLen/expLen==0), `_parserNumber2` (ข้าม buffer) |
| `testNaN*`, `testNegativeInfinityEnabled`, `testPositiveInfinityDisabledByDefault` | `_handleUnexpectedValue` case `'N'`,`'I'`, `_handleInvalidNumberStart` loop `ch=='I'` |
| `testTrueFalseNull`, `testInvalidTokenLikeIdentifier`, `testUnrecognizedValueStartChar` | `_matchToken`, `_reportInvalidToken`, default-case ของ switch ค่า value |
| `testStringWith*`, `testUnescapedControlCharInString`, `testInvalidUtf8ContinuationByte`, `testStringSpanningMultipleSegments` | `_finishString`/`_finishString2` (ascii loop, escape, 2/3/4-byte UTF-8, control char, `_throwUnquotedSpace`), segment growth |
| `testGetBinaryValue*`, `testReadBinaryValueIncremental`, `testGetBinaryValueWrongTokenType` | `getBinaryValue` (tokenIncomplete true/false), `_decodeBase64`, `readBinaryValue`/`_readBinary`, wrong-token error |
| `testNextFieldName*` | `nextFieldName` fast-match/mismatch, end-of-object, `_currToken==FIELD_NAME` branch, `_isNextTokenNameYes` (colon-fast, space-fallback, `_skipColon`), START_ARRAY/OBJECT sub-branch |
| `testNextTextValue*` | `nextTextValue` FIELD_NAME-pending (STRING/non-STRING/START_ARRAY) และ delegation ผ่าน `nextToken()` |
| `testNextIntValue*`, `testNextLongValue*` | เหมือนกันแต่สำหรับ INT/LONG, mismatch-default, START_ARRAY pending |
| `testNextBooleanValue*` | TRUE/FALSE/mismatch/START_OBJECT pending, switch-delegation |
| `testGetText*`, `testGetValueAsStringDefault` | `_getText2` switch ทุก case (FIELD_NAME/STRING/INT/FLOAT/default) |
| `testCRLFRowTracking`, `testLoneCRWithoutLF` | `_skipCR`, `INT_LF`/`INT_CR` row tracking |
| `testReleaseBuffered*` | `releaseBuffered` count>0 / count<1 |
| `testGetInputSource*` | `getInputSource()` สำหรับ byte[] และ InputStream source |
| `testGetCodecDefaultNull`, `testCloseDoesNotThrow`, `testAutoCloseOnEndOfInput` | `getCodec`, `close()`, auto-close เมื่อ EOF ใน `nextToken()` |

หมายเหตุ: บาง private helper (`_decodeUtf8_3fast`, `_skipUtf8_x`, `_decodeCharForError`, `_handleApos`, `_handleUnrecognizedCharacterEscape` ที่มาจาก `ParserBase`) ถูกกระตุ้นโดยอ้อมผ่านเทสข้างบน (เช่น string ยาว/ผิดรูปแบบ UTF-8/`'`) แต่ไม่ได้ assert internal state ตรง ๆ เนื่องจากเป็น private/inherited method