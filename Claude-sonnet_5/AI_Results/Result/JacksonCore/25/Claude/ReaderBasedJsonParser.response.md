# ReaderBasedJsonParserTest.java

**หมายเหตุสำคัญ:** เนื่องจาก `ReaderBasedJsonParser` ถูกสร้างขึ้นภายในผ่าน `JsonFactory.createParser(String)` / `createParser(Reader)` (เมื่อ input เป็น char-based ไม่ใช่ byte stream) ผมจึงใช้ `JsonFactory` เป็นตัวสร้าง instance แล้ว cast/ตรวจสอบด้วย `instanceof` เพื่อยืนยันว่าเทสจริง ๆ วิ่งผ่านคลาสเป้าหมาย โค้ดที่ทดสอบผ่าน public API ของ `JsonParser` ทั้งหมดเป็น public method ที่ implement/override อยู่ในคลาสเป้าหมาย

จุดที่ไม่สามารถยืนยัน behavior ได้ 100% จากซอร์สที่ให้มา (เช่น method ใน `ParserBase`/`_handleBase64MissingPadding` ที่ไม่มีซอร์ส) จะถูกคอมเมนต์กำกับไว้หรือหลีกเลี่ยงการ assert ค่าที่เดา

```java
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;

public class ReaderBasedJsonParserTest {

    // ------------------------------------------------------------
    // Sanity: target class actually used + EOF / empty input
    // ------------------------------------------------------------

    @Test
    public void testCreateParserProducesReaderBasedJsonParser() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("1");
        assertTrue(p instanceof ReaderBasedJsonParser);
        p.close();
    }

    @Test
    public void testEmptyInputReturnsNullToken() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("");
        assertNull(p.nextToken()); // i<0 branch -> close() called internally, _currToken=null
        p.close();
    }

    // ------------------------------------------------------------
    // Basic structural tokens (object/array/field name)
    // ------------------------------------------------------------

    @Test
    public void testSimpleObjectFieldAndIntValue() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\":123}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123, p.getIntValue());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testNestedArrayAndObject() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"arr\":[1,2,{\"x\":true}]}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testFieldNameWithEscapedCharacter() throws IOException {
        // forces slow path _parseName2 (backslash inside field name)
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\\tb\":1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a\tb", p.getCurrentName());
        p.close();
    }

    // ------------------------------------------------------------
    // Strings / escapes
    // ------------------------------------------------------------

    @Test
    public void testStringWithEscapes() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("\"a\\nb\\tc\\\"d\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("a\nb\tc\"d", p.getText());
        p.close();
    }

    @Test
    public void testUnicodeEscape() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("\"\\u0041BC\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("ABC", p.getText());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidEscapeThrows() throws IOException {
        // 'x' is not a recognized escape char -> _handleUnrecognizedCharacterEscape throws
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("\"a\\xb\"");
        p.nextToken();
        p.getText(); // triggers _finishString -> _finishString2 -> _decodeEscaped
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidHexEscapeThrows() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("\"\\u00zz\"");
        p.nextToken();
        p.getText();
    }

    @Test(expected = JsonParseException.class)
    public void testUnterminatedStringThrows() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("\"abc");
        p.nextToken();
        p.getText(); // EOF inside string -> _reportInvalidEOF
    }

    @Test(expected = JsonParseException.class)
    public void testUnterminatedFieldNameThrows() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"abc");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // EOF while parsing name -> throws
    }

    @Test(expected = JsonParseException.class)
    public void testUnquotedControlCharInStringThrows() throws IOException {
        // raw '\n' inside quotes without escaping is illegal (_throwUnquotedSpace)
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("\"line1\nline2\"");
        p.nextToken();
        p.getText();
    }

    @Test
    public void testLargeStringAcrossBufferBoundary() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20000; i++) sb.append('x');
        String bigStr = sb.toString();
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("\"" + bigStr + "\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(bigStr, p.getText());
        p.close();
    }

    @Test
    public void testSkipLargeStringThenNextToken() throws IOException {
        // ensures _tokenIncomplete string is skipped via _skipString() when not read
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20000; i++) sb.append('y');
        String bigStr = sb.toString();
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("[\"" + bigStr + "\", 42]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(42, p.getIntValue());
        p.close();
    }

    @Test
    public void testFinishTokenForIncompleteString() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("\"abc\"");
        p.nextToken();
        p.finishToken();
        assertEquals("abc", p.getText());
        p.close();
    }

    // ------------------------------------------------------------
    // Numbers
    // ------------------------------------------------------------

    @Test
    public void testPositiveInteger() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("12345");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(12345, p.getIntValue());
        p.close();
    }

    @Test
    public void testNegativeInteger() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("-42");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(-42, p.getIntValue());
        p.close();
    }

    @Test
    public void testFloatNumber() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("3.14");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(3.14, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test
    public void testExponentNumber() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("1.5e2");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(150.0, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testLeadingZeroDisallowedByDefault() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("012");
        p.nextToken(); // _verifyNoLeadingZeroes -> throws since feature disabled
    }

    @Test
    public void testLeadingZeroAllowedWithFeature() throws IOException {
        // Traced through source: "007" with feature enabled strips redundant zeros -> value 7
        JsonFactory f = new JsonFactory();
        f.configure(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS, true);
        JsonParser p = f.createParser("007");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(7, p.getIntValue());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidNumberStartThrows() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("-a");
        p.nextToken(); // _handleInvalidNumberStart -> reportUnexpectedNumberChar
    }

    @Test(expected = JsonParseException.class)
    public void testEOFAfterMinusSignThrows() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("-");
        p.nextToken(); // getNextChar EOF -> _reportInvalidEOF
    }

    @Test
    public void testNaNAllowedWithFeature() throws IOException {
        JsonFactory f = new JsonFactory();
        f.configure(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS, true);
        JsonParser p = f.createParser("NaN");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isNaN(p.getDoubleValue()));
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testNaNDisallowedThrows() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("NaN");
        p.nextToken();
    }

    @Test
    public void testPositiveInfinityAllowed() throws IOException {
        JsonFactory f = new JsonFactory();
        f.configure(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS, true);
        JsonParser p = f.createParser("+Infinity");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isInfinite(p.getDoubleValue()));
        p.close();
    }

    @Test
    public void testLargeNumberAcrossBufferBoundary() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20000; i++) sb.append('7');
        String bigNum = sb.toString();
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser(bigNum);
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(bigNum, p.getText());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testRootValuesRequireSeparatingSpaceThrows() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("1,2");
        p.nextToken(); // _verifyRootSpace(',') -> not allowed separator -> throws
    }

    @Test
    public void testRootValuesWithSeparatingSpaceOk() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("1 2");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        p.close();
    }

    // ------------------------------------------------------------
    // true / false / null
    // ------------------------------------------------------------

    @Test
    public void testTrueFalseNullTokens() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("[true,false,null]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    // ------------------------------------------------------------
    // Structural error handling
    // ------------------------------------------------------------

    @Test(expected = JsonParseException.class)
    public void testMismatchedEndMarkerArrayClosedByCurly() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("[1}");
        p.nextToken(); // [
        p.nextToken(); // 1
        p.nextToken(); // } while inArray -> _reportMismatchedEndMarker
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedEndMarkerObjectClosedByBracket() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\":1]");
        p.nextToken(); // {
        p.nextToken(); // field name
        p.nextToken(); // 1
        p.nextToken(); // ] while inObject -> throws
    }

    @Test(expected = JsonParseException.class)
    public void testMissingCommaThrows() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("[1 2]");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // expects ',' but sees digit -> _skipComma throws
    }

    @Test(expected = JsonParseException.class)
    public void testMissingColonThrows() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\" 1}");
        p.nextToken(); // {
        p.nextToken(); // parses name then _skipColon() throws within same call
    }

    // ------------------------------------------------------------
    // Trailing comma feature
    // ------------------------------------------------------------

    @Test
    public void testTrailingCommaAllowedInArray() throws IOException {
        JsonFactory f = new JsonFactory();
        f.configure(JsonParser.Feature.ALLOW_TRAILING_COMMA, true);
        JsonParser p = f.createParser("[1,2,]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testTrailingCommaDisallowedThrows() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("[1,2,]");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.nextToken(); // sees ']' as odd value, ALLOW_MISSING_VALUES disabled -> throws
    }

    // ------------------------------------------------------------
    // Comments (C-style, C++-style, YAML)
    // ------------------------------------------------------------

    @Test
    public void testCStyleCommentAllowed() throws IOException {
        JsonFactory f = new JsonFactory();
        f.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        JsonParser p = f.createParser("[1, /* c */ 2]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testCppStyleCommentAllowed() throws IOException {
        JsonFactory f = new JsonFactory();
        f.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        JsonParser p = f.createParser("[1,// line comment\n2]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testYamlCommentAllowed() throws IOException {
        JsonFactory f = new JsonFactory();
        f.configure(JsonParser.Feature.ALLOW_YAML_COMMENTS, true);
        JsonParser p = f.createParser("[1,# comment\n2]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testCommentsDisallowedThrows() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("[1 /* x */, 2]");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // '/' hit without ALLOW_COMMENTS -> throws
    }

    @Test(expected = JsonParseException.class)
    public void testHashCommentDisallowedByDefaultThrows() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("[1,#comment\n2]");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // '#' returned as odd value char -> throws
    }

    @Test
    public void testColonWithSurroundingCommentsAllowed() throws IOException {
        JsonFactory f = new JsonFactory();
        f.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        JsonParser p = f.createParser("{\"a\" /*c*/ : /*c*/ 1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        p.close();
    }

    // ------------------------------------------------------------
    // Single quotes / unquoted field names / missing values
    // ------------------------------------------------------------

    @Test
    public void testSingleQuoteStringAllowed() throws IOException {
        JsonFactory f = new JsonFactory();
        f.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        JsonParser p = f.createParser("'hello'");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello", p.getText());
        p.close();
    }

    @Test
    public void testSingleQuoteFieldNameAllowed() throws IOException {
        JsonFactory f = new JsonFactory();
        f.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        JsonParser p = f.createParser("{'a':1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        p.close();
    }

    @Test
    public void testUnquotedFieldNameAllowed() throws IOException {
        JsonFactory f = new JsonFactory();
        f.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        JsonParser p = f.createParser("{abc:1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("abc", p.getCurrentName());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testUnquotedFieldNameDisallowedThrows() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{abc:1}");
        p.nextToken();
        p.nextToken();
    }

    @Test
    public void testMissingValueAllowedInArray() throws IOException {
        JsonFactory f = new JsonFactory();
        f.configure(JsonParser.Feature.ALLOW_MISSING_VALUES, true);
        JsonParser p = f.createParser("[1,,3]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(3, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    // ------------------------------------------------------------
    // Base64 binary
    // ------------------------------------------------------------

    @Test
    public void testGetBinaryValueBase64() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("\"SGVsbG8=\""); // "Hello"
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] data = p.getBinaryValue();
        assertArrayEquals("Hello".getBytes("UTF-8"), data);
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueWrongTokenThrows() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("123");
        p.nextToken();
        p.getBinaryValue();
    }

    @Test
    public void testReadBinaryValueToOutputStream() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("\"SGVsbG8=\"");
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int n = p.readBinaryValue(out);
        assertEquals(5, n);
        assertArrayEquals("Hello".getBytes("UTF-8"), out.toByteArray());
        p.close();
    }

    // ------------------------------------------------------------
    // getText / getTextCharacters / getTextLength / getTextOffset
    // ------------------------------------------------------------

    @Test
    public void testGetTextCharactersForFieldNameAndString() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"key\":\"val\"}");
        p.nextToken();
        p.nextToken();
        assertEquals("key", p.getText());
        char[] chars = p.getTextCharacters();
        assertEquals("key", new String(chars, p.getTextOffset(), p.getTextLength()));
        p.nextToken();
        assertEquals("val", p.getText());
        assertEquals(3, p.getTextLength());
        p.close();
    }

    @Test
    public void testGetTextCharsLengthOffsetWhenNoToken() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("123");
        assertNull(p.getTextCharacters());
        assertEquals(0, p.getTextLength());
        assertEquals(0, p.getTextOffset());
        p.close();
    }

    @Test
    public void testGetTextWriterForString() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("\"hello\"");
        p.nextToken();
        StringWriter sw = new StringWriter();
        int len = p.getText(sw);
        assertEquals(5, len);
        assertEquals("hello", sw.toString());
        p.close();
    }

    @Test
    public void testGetTextWriterForFieldName() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"fname\":1}");
        p.nextToken();
        p.nextToken();
        StringWriter sw = new StringWriter();
        int len = p.getText(sw);
        assertEquals(5, len);
        assertEquals("fname", sw.toString());
        p.close();
    }

    @Test
    public void testGetTextWriterForNumeric() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("42");
        p.nextToken();
        StringWriter sw = new StringWriter();
        int len = p.getText(sw);
        assertEquals("42", sw.toString());
        assertEquals(2, len);
        p.close();
    }

    @Test
    public void testGetTextWriterForOtherToken() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("[true]");
        p.nextToken();
        p.nextToken();
        StringWriter sw = new StringWriter();
        int len = p.getText(sw);
        assertEquals("true", sw.toString());
        assertEquals(4, len);
        p.close();
    }

    @Test
    public void testGetTextWriterNullToken() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("");
        StringWriter sw = new StringWriter();
        int len = p.getText(sw); // t == null -> return 0
        assertEquals(0, len);
        p.close();
    }

    @Test
    public void testGetValueAsStringForFieldName() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"key\":1}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        assertEquals("key", p.getValueAsString());
        p.close();
    }

    // ------------------------------------------------------------
    // nextFieldName / nextTextValue / nextIntValue / nextLongValue / nextBooleanValue
    // ------------------------------------------------------------

    @Test
    public void testNextFieldNameMatch() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"foo\":1}");
        p.nextToken();
        SerializedString ss = new SerializedString("foo");
        assertTrue(p.nextFieldName(ss));
        assertEquals(JsonToken.FIELD_NAME, p.getCurrentToken());
        p.close();
    }

    @Test
    public void testNextFieldNameMismatch() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"bar\":1}");
        p.nextToken();
        SerializedString ss = new SerializedString("foo");
        assertFalse(p.nextFieldName(ss));
        assertEquals("bar", p.getCurrentName());
        p.close();
    }

    @Test
    public void testNextFieldNameNoArg() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"foo\":\"bar\"}");
        p.nextToken();
        String name = p.nextFieldName();
        assertEquals("foo", name);
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("bar", p.getText());
        p.close();
    }

    @Test
    public void testNextTextValue() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\":\"text\"}");
        p.nextToken();
        p.nextToken();
        assertEquals("text", p.nextTextValue());
        p.close();
    }

    @Test
    public void testNextIntValue() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\":42}");
        p.nextToken();
        p.nextToken();
        assertEquals(42, p.nextIntValue(-1));
        p.close();
    }

    @Test
    public void testNextIntValueDefaultWhenNotInt() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\":\"str\"}");
        p.nextToken();
        p.nextToken();
        assertEquals(-99, p.nextIntValue(-99));
        p.close();
    }

    @Test
    public void testNextLongValue() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\":123456789012}");
        p.nextToken();
        p.nextToken();
        assertEquals(123456789012L, p.nextLongValue(-1L));
        p.close();
    }

    @Test
    public void testNextBooleanValueTrue() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\":true}");
        p.nextToken();
        p.nextToken();
        assertEquals(Boolean.TRUE, p.nextBooleanValue());
        p.close();
    }

    @Test
    public void testNextBooleanValueNullWhenNotBoolean() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        assertNull(p.nextBooleanValue());
        p.close();
    }

    // ------------------------------------------------------------
    // releaseBuffered / location / codec / input source
    // ------------------------------------------------------------

    @Test
    public void testReleaseBufferedReturnsZeroWhenNothingBuffered() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("");
        StringWriter sw = new StringWriter();
        assertEquals(0, p.releaseBuffered(sw)); // count<1 branch
        p.close();
    }

    @Test
    public void testReleaseBufferedReturnsNonNegativeCount() throws IOException {
        // exact buffered amount depends on internal buffer/loading strategy;
        // only asserting non-negative & no exception, per source guarantee (count = end-ptr)
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("123 456");
        p.nextToken();
        StringWriter sw = new StringWriter();
        int n = p.releaseBuffered(sw);
        assertTrue(n >= 0);
        p.close();
    }

    @Test
    public void testGetCurrentAndTokenLocation() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\":1}");
        p.nextToken();
        JsonLocation tokenLoc = p.getTokenLocation();
        assertNotNull(tokenLoc);
        assertEquals(1, tokenLoc.getLineNr());
        JsonLocation curLoc = p.getCurrentLocation();
        assertNotNull(curLoc);
        p.close();
    }

    @Test
    public void testSetAndGetCodec() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("1");
        ObjectCodec dummy = null;
        p.setCodec(dummy);
        assertNull(p.getCodec());
        p.close();
    }

    @Test
    public void testGetInputSourceIsReaderBeforeClose() throws IOException {
        Reader r = new StringReader("1");
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser(r);
        assertSame(r, p.getInputSource());
        p.close();
        // NOTE: after close(), _reader may become null depending on AUTO_CLOSE_SOURCE
        // (default true in Jackson) combined with IOContext.isResourceManaged();
        // not asserted here since it's not verifiable purely from given source.
    }

    // ------------------------------------------------------------
    // Whitespace handling
    // ------------------------------------------------------------

    @Test
    public void testWhitespaceCRLFHandling() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\r\n \"a\"\t:\t1\r\n}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    // ------------------------------------------------------------
    // Low-level _loadMore edge case (Reader returns 0)
    // ------------------------------------------------------------

    @Test(expected = IOException.class)
    public void testLoadMoreThrowsWhenReaderReturnsZero() throws IOException {
        Reader zeroReader = new Reader() {
            boolean first = true;
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                if (first) { first = false; return 0; }
                return -1;
            }
            @Override
            public void close() throws IOException { /* no-op */ }
        };
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser(zeroReader);
        p.nextToken(); // _loadMore(): count==0 -> throw new IOException(...)
    }
}
```

# ตารางสรุป Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testCreateParserProducesReaderBasedJsonParser | ยืนยันว่าใช้ target class จริง |
| testEmptyInputReturnsNullToken | `_skipWSOrEnd` คืน <0 → `close()`, `_currToken=null` |
| testSimpleObjectFieldAndIntValue | `inObject` true, FIELD_NAME, `_parsePosNumber`, END_OBJECT closing scope |
| testNestedArrayAndObject | createChildArrayContext/ObjectContext, multiple END markers |
| testFieldNameWithEscapedCharacter | `_parseName` slow path → `_parseName2`, escape ใน field name |
| testStringWithEscapes | `_decodeEscaped` mapped chars (\n,\t,\") |
| testUnicodeEscape | `_decodeEscaped` case `'u'` hex loop |
| testInvalidEscapeThrows | `_handleUnrecognizedCharacterEscape` throw path |
| testInvalidHexEscapeThrows | hex digit < 0 → `_reportUnexpectedChar` |
| testUnterminatedStringThrows | EOF within `_finishString2` |
| testUnterminatedFieldNameThrows | EOF within `_parseName2` |
| testUnquotedControlCharInStringThrows | `_throwUnquotedSpace` ใน `_finishString2` |
| testLargeStringAcrossBufferBoundary | `_finishString` slow-path + `_loadMore` reload |
| testSkipLargeStringThenNextToken | `_skipString()` เมื่อ token ยัง incomplete |
| testFinishTokenForIncompleteString | `finishToken()` เมื่อ `_tokenIncomplete=true` |
| testPositiveInteger / testNegativeInteger | `_parsePosNumber` / `_parseNegNumber` fast path |
| testFloatNumber / testExponentNumber | `_parseFloat` fraction/exponent loops |
| testLeadingZeroDisallowedByDefault | `_verifyNoLeadingZeroes` throw (feature off) |
| testLeadingZeroAllowedWithFeature | `_verifyNLZ2` skip-zero loop (feature on) |
| testInvalidNumberStartThrows | `_handleInvalidNumberStart` ch ไม่ใช่ 'I' |
| testEOFAfterMinusSignThrows | `_parseNumber2` EOF ทันทีหลัง '-' |
| testNaNAllowedWithFeature / testNaNDisallowedThrows | `_handleOddValue` case 'N', feature on/off |
| testPositiveInfinityAllowed | `_handleOddValue` case '+', `_handleInvalidNumberStart` ch=='I'&&'n' |
| testLargeNumberAcrossBufferBoundary | boundary-splitting number → `_parseNumber2` |
| testRootValuesRequireSeparatingSpaceThrows | `_verifyRootSpace` invalid separator throw |
| testRootValuesWithSeparatingSpaceOk | `_verifyRootSpace` valid ' ' case |
| testTrueFalseNullTokens | `_matchTrue/_matchFalse/_matchNull` fast path |
| testMismatchedEndMarkerArrayClosedByCurly | `_closeScope` i==RCURLY, !inObject → mismatched |
| testMismatchedEndMarkerObjectClosedByBracket | `_closeScope` i==RBRACKET, !inArray → mismatched |
| testMissingCommaThrows | `_skipComma` i!=',' throw |
| testMissingColonThrows | `_skipColon`/`_skipColon2` ไม่พบ ':' throw |
| testTrailingCommaAllowedInArray | FEAT_MASK_TRAILING_COMMA เปิด, i==']' after comma |
| testTrailingCommaDisallowedThrows | trailing comma ปิด → `_handleOddValue` ']' throw |
| testCStyleCommentAllowed / testCppStyleCommentAllowed | `_skipComment` → `_skipCComment`/`_skipLine` |
| testYamlCommentAllowed | `_skipYAMLComment` true branch |
| testCommentsDisallowedThrows | `_skipComment` feature off → throw |
| testHashCommentDisallowedByDefaultThrows | `_skipYAMLComment` false → '#' เป็น odd value |
| testColonWithSurroundingCommentsAllowed | `_skipColon2` handling INT_SLASH |
| testSingleQuoteStringAllowed / FieldNameAllowed | `_handleApos`, `_parseAposName` |
| testUnquotedFieldNameAllowed / DisallowedThrows | `_handleOddName` feature on/off |
| testMissingValueAllowedInArray | `_handleOddValue` case ',' ALLOW_MISSING_VALUES |
| testGetBinaryValueBase64 / WrongTokenThrows | `getBinaryValue` token check + `_decodeBase64` |
| testReadBinaryValueToOutputStream | `readBinaryValue` incremental `_readBinary` |
| testGetTextCharactersForFieldNameAndString | `getTextCharacters/Length/Offset` ID_FIELD_NAME/ID_STRING |
| testGetTextCharsLengthOffsetWhenNoToken | `_currToken==null` branch ทั้งสาม getter |
| testGetTextWriterFor* (String/FieldName/Numeric/Other/Null) | `getText(Writer)` ทุก branch (STRING, FIELD_NAME, numeric, default, null) |
| testGetValueAsStringForFieldName | `getValueAsString()` FIELD_NAME branch |
| testNextFieldNameMatch / Mismatch | `nextFieldName(SerializableString)` fast-match/`_isNextTokenNameMaybe` |
| testNextFieldNameNoArg | `nextFieldName()` full parse + `_nextToken` cache |
| testNextTextValue / NextIntValue(+Default) / NextLongValue / NextBooleanValue(+Null) | `_nextAfterName`-style shortcuts ทุก branch match/mismatch |
| testReleaseBufferedReturnsZero.../NonNegativeCount | `releaseBuffered` count<1 และ count>=1 |
| testGetCurrentAndTokenLocation | `getTokenLocation`, `getCurrentLocation` |
| testSetAndGetCodec | `getCodec/setCodec` |
| testGetInputSourceIsReaderBeforeClose | `getInputSource()` |
| testWhitespaceCRLFHandling | `_skipCR`, LF row tracking, TAB ใน `_skipWSOrEnd` |
| testLoadMoreThrowsWhenReaderReturnsZero | `_loadMore()` count==0 → IOException |

**หมายเหตุ:** บาง edge case (เช่น `_handleBase64MissingPadding`, ค่า default fallback ของ `getValueAsString` สำหรับ token ที่ไม่ใช่ STRING/FIELD_NAME ซึ่ง implement อยู่ใน `ParserBase` ที่ไม่มีซอร์สให้) ไม่ได้ทดสอบเพื่อหลีกเลี่ยงการเดา behavior ที่ไม่มีอยู่ในซอร์สที่ให้มา