package com.fasterxml.jackson.core.json;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

import org.junit.Test;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.SerializedString;

/**
 * JUnit4 test suite for {@link UTF8StreamJsonParser}.
 *
 * เนื่องจาก constructor ของคลาสเป้าหมายต้องพึ่ง internal types (IOContext,
 * ByteQuadsCanonicalizer) เทสนี้จึงสร้าง parser ผ่าน public factory
 * {@link JsonFactory#createParser(byte[])} / {@link JsonFactory#createParser(InputStream)}
 * ซึ่งจะคืนอินสแตนซ์ของ UTF8StreamJsonParser จริง แล้วทดสอบผ่าน public API ของ JsonParser
 */
public class UTF8StreamJsonParserTest {

    // ---------- Helpers ----------

    private JsonFactory factory() {
        return new JsonFactory();
    }

    private JsonParser parse(String json) throws IOException {
        return factory().createParser(json.getBytes("UTF-8"));
    }

    private JsonParser parse(JsonFactory f, String json) throws IOException {
        return f.createParser(json.getBytes("UTF-8"));
    }

    private JsonParser parseStream(String json) throws IOException {
        InputStream in = new ByteArrayInputStream(json.getBytes("UTF-8"));
        return factory().createParser(in);
    }

    // ================= 1. Boundary / empty & whitespace-only input =================

    @Test
    public void testEmptyInputReturnsNullToken() throws IOException {
        JsonParser p = parse("");
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testWhitespaceOnlyInputReturnsNullToken() throws IOException {
        JsonParser p = parse("   \t\n  ");
        assertNull(p.nextToken());
        p.close();
    }

    // ================= 2. Basic structures =================

    @Test
    public void testSimpleObjectFullTraversal() throws IOException {
        JsonParser p = parse("{\"a\":1}");
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
    public void testSimpleArrayFullTraversal() throws IOException {
        JsonParser p = parse("[1,2,3]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(3, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testNestedArrayInsideObject_ChildContextViaNextAfterName() throws IOException {
        JsonParser p = parse("{\"a\":[1,2]}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        // เส้นทางนี้ผ่าน _nextAfterName() เมื่อ t == START_ARRAY
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testNestedObjectInsideArray_ChildContextViaNotInObject() throws IOException {
        JsonParser p = parse("[{\"a\":1}]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        // _nextTokenNotInObject กับ '{'
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    // ================= 3. Mismatched end markers =================

    @Test(expected = JsonParseException.class)
    public void testMismatchedEndMarker_BracketInObject() throws IOException {
        JsonParser p = parse("{]");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // ']' ในบริบท object -> throw
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedEndMarker_CurlyInArray() throws IOException {
        JsonParser p = parse("[}");
        p.nextToken(); // START_ARRAY
        p.nextToken(); // '}' ในบริบท array -> throw
    }

    // ================= 4. Comma handling (array & object) =================

    @Test(expected = JsonParseException.class)
    public void testArrayMissingCommaThrows() throws IOException {
        JsonParser p = parse("[1 2]");
        p.nextToken(); // START_ARRAY
        p.nextToken(); // 1
        p.nextToken(); // ต้องมี comma -> throw
    }

    @Test
    public void testArrayCommaPresentOk() throws IOException {
        JsonParser p = parse("[1,2]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        p.close();
    }

    @Test
    public void testObjectMultipleFieldsCommaSeparated() throws IOException {
        JsonParser p = parse("{\"a\":1,\"b\":2}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME a
        p.nextToken(); // 1
        assertEquals(JsonToken.FIELD_NAME, p.nextToken()); // b (expectComma true + comma present)
        assertEquals("b", p.getCurrentName());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testObjectMissingCommaThrows() throws IOException {
        JsonParser p = parse("{\"a\":1 \"b\":2}");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.nextToken(); // ขาด comma -> throw
    }

    // ================= 5. Numbers =================

    @Test
    public void testNegativeInteger() throws IOException {
        JsonParser p = parse("[-42]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(-42, p.getIntValue());
        p.close();
    }

    @Test
    public void testFloatingPointNumber() throws IOException {
        JsonParser p = parse("[3.14]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(3.14, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test
    public void testExponentNumber() throws IOException {
        JsonParser p = parse("[1e3]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1000.0, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test
    public void testExponentWithSign() throws IOException {
        JsonParser p = parse("[2E+2]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(200.0, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testLeadingZeroDisallowedByDefault() throws IOException {
        JsonParser p = parse("[01]");
        p.nextToken();
        p.nextToken(); // leading zero -> throw
    }

    @Test
    public void testLeadingZeroAllowedWhenFeatureEnabled() throws IOException {
        JsonFactory f = factory();
        f.configure(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS, true);
        JsonParser p = parse(f, "[01]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        p.close();
    }

    @Test
    public void testNegativeLeadingZeroAllowed() throws IOException {
        JsonFactory f = factory();
        f.configure(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS, true);
        JsonParser p = parse(f, "[-01]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(-1, p.getIntValue());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidCharAfterMinusThrows() throws IOException {
        JsonParser p = parse("[-x]");
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testPlusSignNotAllowedAsNumberStart() throws IOException {
        JsonParser p = parse("[+5]");
        p.nextToken();
        p.nextToken(); // '+5' ไม่ match 'I' -> throw
    }

    // ================= 6. Literals =================

    @Test
    public void testTrueFalseNullLiterals() throws IOException {
        JsonParser p = parse("[true,false,null]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidLiteralTokenThrows() throws IOException {
        JsonParser p = parse("[tru3]");
        p.nextToken();
        p.nextToken();
    }

    // ================= 7. NaN / Infinity =================

    @Test(expected = JsonParseException.class)
    public void testNaNDisallowedByDefault() throws IOException {
        JsonParser p = parse("[NaN]");
        p.nextToken();
        p.nextToken();
    }

    @Test
    public void testNaNAllowedWhenFeatureEnabled() throws IOException {
        JsonFactory f = factory();
        f.configure(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS, true);
        JsonParser p = parse(f, "[NaN]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isNaN(p.getDoubleValue()));
        p.close();
    }

    @Test
    public void testInfinityAllowedWhenFeatureEnabled() throws IOException {
        JsonFactory f = factory();
        f.configure(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS, true);
        JsonParser p = parse(f, "[Infinity]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isInfinite(p.getDoubleValue()));
        p.close();
    }

    @Test
    public void testPlusInfinityAllowedWhenFeatureEnabled() throws IOException {
        // ครอบคลุม branch '+' ใน _handleUnexpectedValue -> _handleInvalidNumberStart('I' loop)
        JsonFactory f = factory();
        f.configure(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS, true);
        JsonParser p = parse(f, "[+Infinity]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isInfinite(p.getDoubleValue()));
        p.close();
    }

    // ================= 8. Field name length boundaries =================

    @Test public void testFieldNameLength1() throws IOException { assertFieldName("a"); }
    @Test public void testFieldNameLength2() throws IOException { assertFieldName("ab"); }
    @Test public void testFieldNameLength3() throws IOException { assertFieldName("abc"); }
    @Test public void testFieldNameLength4() throws IOException { assertFieldName("abcd"); }
    @Test public void testFieldNameLength5_MediumName() throws IOException { assertFieldName("abcde"); }
    @Test public void testFieldNameLength8_MediumNameBoundary() throws IOException { assertFieldName("abcdefgh"); }
    @Test public void testFieldNameLength9_MediumName2() throws IOException { assertFieldName("abcdefghi"); }
    @Test public void testFieldNameLength12_MediumName2Boundary() throws IOException { assertFieldName("abcdefghijkl"); }
    @Test public void testFieldNameLength13_LongName() throws IOException { assertFieldName("abcdefghijklm"); }

    @Test
    public void testFieldNameLength70_LongNameGrowArray() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 70; i++) sb.append((char) ('a' + (i % 26)));
        assertFieldName(sb.toString());
    }

    private void assertFieldName(String name) throws IOException {
        String json = "{\"" + name + "\":1}";
        JsonParser p = parse(json);
        p.nextToken(); // START_OBJECT
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(name, p.getCurrentName());
        p.close();
    }

    @Test
    public void testFieldNameWithEscapedQuote() throws IOException {
        // JSON จริง: {"a\"b":1}
        String json = "{\"a\\\"b\":1}";
        JsonParser p = parse(json);
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a\"b", p.getCurrentName());
        p.close();
    }

    @Test
    public void testFieldNameRepeatedHitsSymbolTable() throws IOException {
        // parse ชื่อ field เดิมซ้ำ เพื่อครอบคลุมเส้นทาง _symbols.findName() ที่เจอ (ไม่ null)
        JsonParser p = parse("[{\"abc\":1},{\"abc\":2}]");
        p.nextToken(); p.nextToken(); p.nextToken();
        assertEquals("abc", p.getCurrentName());
        p.nextToken(); p.nextToken(); p.nextToken();
        assertEquals("abc", p.getCurrentName());
        p.close();
    }

    // ================= 9. Unquoted / single-quoted names =================

    @Test(expected = JsonParseException.class)
    public void testUnquotedFieldNameDisallowedByDefault() throws IOException {
        JsonParser p = parse("{abc:1}");
        p.nextToken();
        p.nextToken();
    }

    @Test
    public void testUnquotedFieldNameAllowedWhenFeatureEnabled() throws IOException {
        JsonFactory f = factory();
        f.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        JsonParser p = parse(f, "{abc:1}");
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("abc", p.getCurrentName());
        p.close();
    }

    @Test
    public void testSingleQuoteFieldNameAllowedWhenFeatureEnabled() throws IOException {
        JsonFactory f = factory();
        f.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        JsonParser p = parse(f, "{'abc':1}");
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("abc", p.getCurrentName());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testSingleQuoteFieldNameDisallowedByDefault() throws IOException {
        JsonParser p = parse("{'abc':1}");
        p.nextToken();
        p.nextToken();
    }

    @Test
    public void testSingleQuoteStringValueAllowed() throws IOException {
        JsonFactory f = factory();
        f.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        JsonParser p = parse(f, "{'a':'hello'}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello", p.getText());
        p.close();
    }

    @Test
    public void testEmptySingleQuoteFieldName() throws IOException {
        JsonFactory f = factory();
        f.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        JsonParser p = parse(f, "{'':1}");
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("", p.getCurrentName());
        p.close();
    }

    // ================= 10. Comments =================

    @Test(expected = JsonParseException.class)
    public void testCommentsDisallowedByDefault() throws IOException {
        JsonParser p = parse("[1 // comment\n]");
        p.nextToken();
        p.nextToken();
    }

    @Test
    public void testLineCommentAllowedWhenFeatureEnabled() throws IOException {
        JsonFactory f = factory();
        f.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        JsonParser p = parse(f, "[1 // comment\n,2]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        p.close();
    }

    @Test
    public void testBlockCommentAllowedWhenFeatureEnabled() throws IOException {
        JsonFactory f = factory();
        f.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        JsonParser p = parse(f, "[1 /* comment */,2]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        p.close();
    }

    @Test
    public void testYamlCommentAllowedWhenFeatureEnabled() throws IOException {
        JsonFactory f = factory();
        f.configure(JsonParser.Feature.ALLOW_YAML_COMMENTS, true);
        JsonParser p = parse(f, "[1 # comment\n,2]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testHashCharWithoutYamlFeatureThrows() throws IOException {
        // เมื่อ ALLOW_YAML_COMMENTS ปิด '#' จะถูกคืนเป็นตัวอักษรจริงและกลายเป็นค่าที่ไม่ถูกต้อง
        JsonParser p = parse("[#]");
        p.nextToken(); // START_ARRAY
        p.nextToken(); // '#' -> unexpected char -> throw
    }

    // ================= 11. Strings: escapes / unicode / utf8 =================

    @Test
    public void testStringWithBasicEscapes() throws IOException {
        JsonParser p = parse("[\"a\\tb\\nc\\\"d\"]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("a\tb\nc\"d", p.getText());
        p.close();
    }

    @Test
    public void testStringWithUnicodeEscape() throws IOException {
        JsonParser p = parse("[\"\\u0041\\u0042\"]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("AB", p.getText());
        p.close();
    }

    @Test
    public void testStringWithTwoByteUtf8Char() throws IOException {
        JsonParser p = parse("[\"caf\u00e9\"]"); // 'é' -> 2-byte UTF-8
        p.nextToken();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("caf\u00e9", p.getText());
        p.close();
    }

    @Test
    public void testStringWithThreeByteUtf8Char() throws IOException {
        JsonParser p = parse("[\"\u20ac100\"]"); // Euro sign -> 3-byte UTF-8
        p.nextToken();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("\u20ac100", p.getText());
        p.close();
    }

    @Test
    public void testStringWithFourByteUtf8SurrogatePair() throws IOException {
        String emoji = new String(Character.toChars(0x1F600)); // 4-byte UTF-8, surrogate pair
        JsonParser p = parse("[\"" + emoji + "\"]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(emoji, p.getText());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testUnquotedControlCharInStringThrows() throws IOException {
        JsonParser p = parse("[\"a\nb\"]"); // raw newline ที่ไม่ escape ในสตริง
        p.nextToken();
        p.nextToken();
    }

    @Test
    public void testGetTextCharactersAndLengthForString() throws IOException {
        JsonParser p = parse("[\"hello\"]");
        p.nextToken();
        p.nextToken();
        char[] chars = p.getTextCharacters();
        assertEquals("hello", new String(chars, p.getTextOffset(), p.getTextLength()));
        p.close();
    }

    @Test
    public void testGetTextCharactersForFieldName() throws IOException {
        JsonParser p = parse("{\"field\":1}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        char[] chars = p.getTextCharacters();
        assertEquals("field", new String(chars, 0, p.getTextLength()));
        p.close();
    }

    // ================= 12. Root-level multiple values / spacing =================

    @Test
    public void testMultipleRootValuesSeparatedBySpace() throws IOException {
        JsonParser p = parse("1 2");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testRootValuesWithoutSeparatingSpaceThrows() throws IOException {
        JsonParser p = parse("1x");
        p.nextToken();
    }

    // ================= 13. nextFieldName variants =================

    @Test
    public void testNextFieldNameNoArgMatches() throws IOException {
        JsonParser p = parse("{\"a\":1}");
        p.nextToken(); // START_OBJECT
        assertEquals("a", p.nextFieldName());
        p.close();
    }

    @Test
    public void testNextFieldNameSerializableStringFastPathMatch() throws IOException {
        // ทำให้ (_inputPtr+len+4) < _inputEnd เป็นจริง เพื่อชน fast path ใน nextFieldName(SerializableString)
        JsonParser p = parse("{\"abc\":\"0123456789012345\"}");
        p.nextToken(); // START_OBJECT
        assertTrue(p.nextFieldName(new SerializedString("abc")));
        p.close();
    }

    @Test
    public void testNextFieldNameSerializableStringFastPathByteMismatch() throws IOException {
        // ชื่อยาวเท่ากันแต่ตัวอักษรต่างกัน -> เจอ mismatch แล้ว fallback ไป slow path
        JsonParser p = parse("{\"abx\":\"0123456789012345\"}");
        p.nextToken(); // START_OBJECT
        assertFalse(p.nextFieldName(new SerializedString("abc")));
        assertEquals("abx", p.getCurrentName());
        p.close();
    }

    @Test
    public void testNextFieldNameSerializableStringSlowPathMatch() throws IOException {
        // input สั้น ทำให้ fast-path condition เป็น false -> ไปทาง _isNextTokenNameMaybe
        JsonParser p = parse("{\"abc\":1}");
        p.nextToken();
        assertTrue(p.nextFieldName(new SerializedString("abc")));
        p.close();
    }

    @Test
    public void testNextFieldNameSerializableStringNoMatch() throws IOException {
        JsonParser p = parse("{\"abc\":1}");
        p.nextToken();
        assertFalse(p.nextFieldName(new SerializedString("xyz")));
        assertEquals("abc", p.getCurrentName());
        p.close();
    }

    @Test
    public void testNextFieldNameReturnsFalseAtEndObject() throws IOException {
        JsonParser p = parse("{}");
        p.nextToken(); // START_OBJECT
        assertFalse(p.nextFieldName(new SerializedString("abc")));
        assertEquals(JsonToken.END_OBJECT, p.getCurrentToken());
        p.close();
    }

    // ================= 14. nextXxxValue helpers =================

    @Test
    public void testNextTextValue() throws IOException {
        JsonParser p = parse("{\"a\":\"hi\"}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        assertEquals("hi", p.nextTextValue());
        p.close();
    }

    @Test
    public void testNextTextValueReturnsNullForNonString() throws IOException {
        JsonParser p = parse("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        assertNull(p.nextTextValue());
        p.close();
    }

    @Test
    public void testNextIntValue() throws IOException {
        JsonParser p = parse("{\"a\":42}");
        p.nextToken();
        p.nextToken();
        assertEquals(42, p.nextIntValue(-1));
        p.close();
    }

    @Test
    public void testNextIntValueDefaultWhenNotInt() throws IOException {
        JsonParser p = parse("{\"a\":\"x\"}");
        p.nextToken();
        p.nextToken();
        assertEquals(-1, p.nextIntValue(-1));
        p.close();
    }

    @Test
    public void testNextIntValueStartArrayAfterFieldName() throws IOException {
        // ครอบคลุม branch t==START_ARRAY ภายใน nextIntValue's FIELD_NAME shortcut
        JsonParser p = parse("{\"a\":[1]}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME
        assertEquals(-1, p.nextIntValue(-1));
        assertEquals(JsonToken.START_ARRAY, p.getCurrentToken());
        p.close();
    }

    @Test
    public void testNextLongValue() throws IOException {
        JsonParser p = parse("{\"a\":123456789012}");
        p.nextToken();
        p.nextToken();
        assertEquals(123456789012L, p.nextLongValue(-1L));
        p.close();
    }

    @Test
    public void testNextBooleanValueTrue() throws IOException {
        JsonParser p = parse("{\"a\":true}");
        p.nextToken();
        p.nextToken();
        assertEquals(Boolean.TRUE, p.nextBooleanValue());
        p.close();
    }

    @Test
    public void testNextBooleanValueFalse() throws IOException {
        JsonParser p = parse("{\"a\":false}");
        p.nextToken();
        p.nextToken();
        assertEquals(Boolean.FALSE, p.nextBooleanValue());
        p.close();
    }

    @Test
    public void testNextBooleanValueReturnsNullForOtherToken() throws IOException {
        JsonParser p = parse("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        assertNull(p.nextBooleanValue());
        p.close();
    }

    // ================= 15. Binary / Base64 =================

    @Test
    public void testGetBinaryValueBase64Default() throws IOException {
        String encoded = Base64.getEncoder().encodeToString("hello".getBytes("UTF-8"));
        JsonParser p = parse("[\"" + encoded + "\"]");
        p.nextToken();
        p.nextToken(); // VALUE_STRING (incomplete)
        byte[] decoded = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertEquals("hello", new String(decoded, "UTF-8"));
        p.close();
    }

    @Test
    public void testReadBinaryValueIncremental() throws IOException {
        String encoded = Base64.getEncoder().encodeToString("world!".getBytes("UTF-8"));
        JsonParser p = parse("[\"" + encoded + "\"]");
        p.nextToken();
        p.nextToken(); // VALUE_STRING (ยังไม่ decode)
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int n = p.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertEquals("world!".length(), n);
        assertEquals("world!", out.toString("UTF-8"));
        p.close();
    }

    // ================= 16. releaseBuffered =================

    @Test
    public void testReleaseBufferedWritesRemainingBytes() throws IOException {
        JsonParser p = parse("{}extra-bytes");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // END_OBJECT
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = p.releaseBuffered(out);
        assertTrue(count > 0);
        assertEquals("extra-bytes", out.toString("UTF-8"));
    }

    @Test
    public void testReleaseBufferedZeroWhenNothingLeft() throws IOException {
        JsonParser p = parse("1");
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = p.releaseBuffered(out);
        assertEquals(0, count);
    }

    // ================= 17. getValueAsString / getValueAsInt =================

    @Test
    public void testGetValueAsStringForFieldName() throws IOException {
        JsonParser p = parse("{\"a\":1}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        assertEquals("a", p.getValueAsString());
        p.close();
    }

    @Test
    public void testGetValueAsStringForStringToken() throws IOException {
        JsonParser p = parse("[\"hi\"]");
        p.nextToken();
        p.nextToken();
        assertEquals("hi", p.getValueAsString());
        p.close();
    }

    @Test
    public void testGetValueAsIntFromIntToken() throws IOException {
        JsonParser p = parse("[7]");
        p.nextToken();
        p.nextToken();
        assertEquals(7, p.getValueAsInt());
        p.close();
    }

    // ================= 18. Streaming (real InputStream) sanity =================

    @Test
    public void testParsingFromRealInputStream() throws IOException {
        JsonParser p = parseStream("{\"x\":[1,2,3]}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken()); // ผ่าน loadMore()/_closeInput() จริงบน InputStream
        p.close();
    }

    // ================= 19. Unexpected value char =================

    @Test(expected = JsonParseException.class)
    public void testUnexpectedCharAsValueThrows() throws IOException {
        JsonParser p = parse("[@]");
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedIdentifierLikeTokenThrows() throws IOException {
        JsonParser p = parse("[xyz]");
        p.nextToken();
        p.nextToken();
    }
}
