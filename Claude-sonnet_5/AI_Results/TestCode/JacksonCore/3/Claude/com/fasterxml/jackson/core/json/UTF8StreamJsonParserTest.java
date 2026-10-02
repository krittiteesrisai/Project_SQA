package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;

import java.io.*;
import java.util.Arrays;
import java.util.Base64;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.io.SerializedString; // สมมติว่ามีอยู่ใน jackson-core เวอร์ชันนี้ (มาตรฐานของ 2.x)

public class UTF8StreamJsonParserTest {

    private JsonFactory factory;

    @Before
    public void setUp() {
        factory = new JsonFactory();
    }

    private JsonParser parse(String json) throws IOException {
        return factory.createParser(json.getBytes("UTF-8"));
    }

    /** InputStream ที่คืนทีละ 1 byte เพื่อบังคับให้เกิด loadMore()/loadMoreGuaranteed() หลายครั้ง */
    private static class OneByteInputStream extends InputStream {
        private final byte[] data;
        private int pos = 0;
        OneByteInputStream(byte[] data) { this.data = data; }
        @Override public int read() {
            if (pos >= data.length) return -1;
            return data[pos++] & 0xFF;
        }
        @Override public int read(byte[] b, int off, int len) {
            if (pos >= data.length) return -1;
            b[off] = data[pos++];
            return 1;
        }
    }

    private JsonParser parseSlow(String json) throws IOException {
        return factory.createParser(new OneByteInputStream(json.getBytes("UTF-8")));
    }

    // ---------------- Basic structure / EOF ----------------

    @Test
    public void testEmptyInputReturnsNullToken() throws IOException {
        JsonParser p = parse("");
        assertNull(p.nextToken());
    }

    @Test
    public void testEmptyObject() throws IOException {
        JsonParser p = parse("{}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testEmptyArray() throws IOException {
        JsonParser p = parse("[]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
    }

    @Test
    public void testObjectWithStringField() throws IOException {
        JsonParser p = parse("{\"a\":\"b\"}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("b", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
    }

    @Test
    public void testObjectWithMultipleFields_ExpectComma() throws IOException {
        JsonParser p = parse("{\"a\":1,\"b\":2}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
    }

    @Test
    public void testArrayWithMultipleValues() throws IOException {
        JsonParser p = parse("[1,2,3]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(1, p.nextIntValue(-1));
        assertEquals(2, p.nextIntValue(-1));
        assertEquals(3, p.nextIntValue(-1));
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
    }

    @Test
    public void testNestedObjectInArray() throws IOException {
        JsonParser p = parse("[{\"a\":true}]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
    }

    // ---------------- Literals ----------------

    @Test
    public void testBooleanTrue() throws IOException {
        JsonParser p = parse("true");
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
    }

    @Test
    public void testBooleanFalse() throws IOException {
        JsonParser p = parse("false");
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
    }

    @Test
    public void testNullLiteral() throws IOException {
        JsonParser p = parse("null");
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
    }

    // ---------------- Numbers ----------------

    @Test
    public void testIntegerPositive() throws IOException {
        JsonParser p = parse("12345");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(12345, p.getIntValue());
    }

    @Test
    public void testIntegerNegative() throws IOException {
        JsonParser p = parse("-42");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(-42, p.getIntValue());
    }

    @Test
    public void testFloatingPointNumber() throws IOException {
        JsonParser p = parse("3.14");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(3.14, p.getDoubleValue(), 0.0001);
    }

    @Test
    public void testNumberWithExponentLowerE() throws IOException {
        JsonParser p = parse("1e3");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1000.0, p.getDoubleValue(), 0.0001);
    }

    @Test
    public void testNumberWithExponentSigned() throws IOException {
        JsonParser p = parse("2.5E+2");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(250.0, p.getDoubleValue(), 0.0001);
    }

    @Test(expected = JsonParseException.class)
    public void testLeadingZeroDisallowedByDefault() throws IOException {
        JsonParser p = parse("01");
        p.nextToken();
    }

    @Test
    public void testLeadingZeroAllowedWithFeature() throws IOException {
        factory.enable(Feature.ALLOW_NUMERIC_LEADING_ZEROS);
        JsonParser p = parse("01");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        // ตามการไล่ source: เลขศูนย์นำหน้าจะถูกตัดออก เหลือเฉพาะ "1"
        assertEquals("1", p.getText());
    }

    @Test(expected = JsonParseException.class)
    public void testNumberFractionMissingDigitThrows() throws IOException {
        JsonParser p = parse("1.");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testNumberExponentMissingDigitThrows() throws IOException {
        JsonParser p = parse("1ex");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testPlusSignNumberInvalid() throws IOException {
        JsonParser p = parse("+5");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testNaNDisallowedByDefault() throws IOException {
        JsonParser p = parse("NaN");
        p.nextToken();
    }

    @Test
    public void testNaNAllowedWithFeature() throws IOException {
        factory.enable(Feature.ALLOW_NON_NUMERIC_NUMBERS);
        JsonParser p = parse("NaN");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isNaN(p.getDoubleValue()));
    }

    @Test
    public void testInfinityAllowedWithFeature() throws IOException {
        factory.enable(Feature.ALLOW_NON_NUMERIC_NUMBERS);
        JsonParser p = parse("Infinity");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, p.getDoubleValue(), 0.0);
    }

    // ---------------- Structural / malformed errors ----------------

    @Test(expected = JsonParseException.class)
    public void testMismatchedEndMarkerInArray() throws IOException {
        JsonParser p = parse("[1}");
        p.nextToken(); // START_ARRAY
        p.nextToken(); // VALUE_NUMBER_INT
        p.nextToken(); // throws
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedEndMarkerInObject() throws IOException {
        JsonParser p = parse("{\"a\":1]");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME
        p.nextToken(); // VALUE_NUMBER_INT
        p.nextToken(); // throws
    }

    @Test(expected = JsonParseException.class)
    public void testMissingCommaInArray() throws IOException {
        JsonParser p = parse("[1 2]");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // throws
    }

    @Test(expected = JsonParseException.class)
    public void testMissingColonInObject() throws IOException {
        JsonParser p = parse("{\"a\" 1}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // throws (เกิดระหว่างพยายามอ่าน FIELD_NAME)
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedClosingAsValue() throws IOException {
        JsonParser p = parse("[,]");
        p.nextToken();
        p.nextToken(); // throws
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidTokenPartialTrue() throws IOException {
        JsonParser p = parse("[tru]");
        p.nextToken();
        p.nextToken(); // throws (matchToken mismatch)
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedCharAsStartOfValue() throws IOException {
        JsonParser p = parse("@");
        p.nextToken();
    }

    // ---------------- Optional features ----------------

    @Test(expected = JsonParseException.class)
    public void testSingleQuoteStringDisallowedByDefault() throws IOException {
        JsonParser p = parse("'hello'");
        p.nextToken();
    }

    @Test
    public void testSingleQuoteStringAllowedWithFeature() throws IOException {
        factory.enable(Feature.ALLOW_SINGLE_QUOTES);
        JsonParser p = parse("'hello'");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello", p.getText());
    }

    @Test(expected = JsonParseException.class)
    public void testUnquotedFieldNameDisallowedByDefault() throws IOException {
        JsonParser p = parse("{name:1}");
        p.nextToken();
        p.nextToken();
    }

    @Test
    public void testUnquotedFieldNameAllowedWithFeature() throws IOException {
        factory.enable(Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        JsonParser p = parse("{name:1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("name", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
    }

    @Test(expected = JsonParseException.class)
    public void testSlashSlashCommentDisallowedByDefault() throws IOException {
        JsonParser p = parse("[1 //c\n]");
        p.nextToken();
        p.nextToken();
    }

    @Test
    public void testSlashSlashCommentAllowedWithFeature() throws IOException {
        factory.enable(Feature.ALLOW_COMMENTS);
        JsonParser p = parse("[1, //comment\n 2]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(1, p.nextIntValue(-1));
        assertEquals(2, p.nextIntValue(-1));
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
    }

    @Test
    public void testSlashStarCommentAllowedWithFeature() throws IOException {
        factory.enable(Feature.ALLOW_COMMENTS);
        JsonParser p = parse("[1 /* c */ ,2]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(1, p.nextIntValue(-1));
        assertEquals(2, p.nextIntValue(-1));
    }

    @Test(expected = JsonParseException.class)
    public void testYamlCommentDisallowedByDefault() throws IOException {
        JsonParser p = parse("# c\n{}");
        p.nextToken();
    }

    @Test
    public void testYamlCommentAllowedWithFeature() throws IOException {
        factory.enable(Feature.ALLOW_YAML_COMMENTS);
        JsonParser p = parse("# c\n{}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
    }

    // ---------------- Strings ----------------

    @Test
    public void testStringWithEscapes() throws IOException {
        JsonParser p = parse("\"a\\nb\\tc\\u0041\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("a\nb\tcA", p.getText());
    }

    @Test
    public void testStringWithMultiByteUtf8Chars() throws IOException {
        String val = "h\u00e9llo\u20ac"; // 'é' (2-byte) และ '€' (3-byte)
        JsonParser p = parse("\"" + val + "\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(val, p.getText());
    }

    @Test
    public void testGetTextCharactersAndLengthForString() throws IOException {
        JsonParser p = parse("\"abc\"");
        p.nextToken();
        assertEquals(3, p.getTextLength());
        char[] chars = p.getTextCharacters();
        assertEquals('a', chars[p.getTextOffset()]);
    }

    @Test
    public void testGetTextForFieldName() throws IOException {
        JsonParser p = parse("{\"field\":1}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        assertEquals("field", p.getText());
        assertEquals(0, p.getTextOffset());
        assertEquals(5, p.getTextLength());
    }

    @Test
    public void testGetTextForNullTokenBeforeAnyRead() throws IOException {
        JsonParser p = parse("{}");
        assertNull(p.getText());
    }

    // ---------------- Field name parsing variants ----------------

    @Test
    public void testEmptyFieldName() throws IOException {
        JsonParser p = parse("{\"\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("", p.getCurrentName());
    }

    @Test
    public void testFieldNameLengthsVariants() throws IOException {
        // ครอบคลุม branch สาขาความยาวชื่อฟิลด์ต่าง ๆ ภายใน _parseName/parseMediumName/parseLongName
        int[] lengths = {1, 4, 5, 6, 7, 8, 9, 16, 70};
        for (int len : lengths) {
            StringBuilder name = new StringBuilder();
            for (int i = 0; i < len; i++) name.append((char) ('a' + (i % 26)));
            String json = "{\"" + name + "\":1}";
            JsonParser p = parse(json);
            assertEquals(JsonToken.START_OBJECT, p.nextToken());
            assertEquals(JsonToken.FIELD_NAME, p.nextToken());
            assertEquals("length=" + len, name.toString(), p.getCurrentName());
        }
    }

    @Test
    public void testFieldNameWithEscapedQuote() throws IOException {
        JsonParser p = parse("{\"a\\\"b\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("a\"b", p.getCurrentName());
    }

    @Test
    public void testFieldNameWithUnicodeEscape2Byte() throws IOException {
        JsonParser p = parse("{\"caf\\u00e9\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("caf\u00e9", p.getCurrentName());
    }

    @Test
    public void testFieldNameWithUnicodeEscape3Byte() throws IOException {
        JsonParser p = parse("{\"\\u20ac\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("\u20ac", p.getCurrentName());
    }

    @Test
    public void testColonPrecededBySpace() throws IOException {
        JsonParser p = parse("{\"a\" :1}");
        p.nextToken();
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
    }

    @Test
    public void testColonWithCommentAroundIt() throws IOException {
        factory.enable(Feature.ALLOW_COMMENTS);
        JsonParser p = parse("{\"a\" /*c*/ : /*c*/ 1}");
        p.nextToken();
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
    }

    // ---------------- Binary (base64) ----------------

    @Test
    public void testBase64BinaryValueViaGetBinaryValue() throws IOException {
        byte[] expected = "Hello World!".getBytes("UTF-8");
        String b64 = Base64.getEncoder().encodeToString(expected);
        JsonParser p = parse("\"" + b64 + "\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] actual = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testBase64BinaryValueViaReadBinaryValue() throws IOException {
        byte[] expected = "abcdef".getBytes("UTF-8");
        String b64 = Base64.getEncoder().encodeToString(expected);
        JsonParser p = parse("\"" + b64 + "\"");
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = p.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertEquals(expected.length, len);
        assertArrayEquals(expected, out.toByteArray());
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueOnNonStringTokenThrows() throws IOException {
        JsonParser p = parse("123");
        p.nextToken();
        p.getBinaryValue(Base64Variants.getDefaultVariant());
    }

    // ---------------- nextFieldName / nextXxxValue ----------------

    @Test
    public void testNextFieldNameMatch() throws IOException {
        JsonParser p = parse("{\"foo\":1}");
        p.nextToken(); // START_OBJECT
        assertTrue(p.nextFieldName(new SerializedString("foo")));
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
    }

    @Test
    public void testNextFieldNameNoMatch() throws IOException {
        JsonParser p = parse("{\"bar\":1}");
        p.nextToken();
        assertFalse(p.nextFieldName(new SerializedString("foo")));
        assertEquals("bar", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
    }

    @Test
    public void testNextFieldNameOnEndOfObject() throws IOException {
        JsonParser p = parse("{}");
        p.nextToken(); // START_OBJECT
        assertFalse(p.nextFieldName(new SerializedString("foo")));
        assertEquals(JsonToken.END_OBJECT, p.getCurrentToken());
    }

    @Test
    public void testNextTextValueAfterFieldName() throws IOException {
        JsonParser p = parse("{\"a\":\"hello\"}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        assertEquals("hello", p.nextTextValue());
    }

    @Test
    public void testNextTextValueReturnsNullForNonString() throws IOException {
        JsonParser p = parse("{\"a\":1}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        assertNull(p.nextTextValue());
        assertEquals(1, p.getIntValue());
    }

    @Test
    public void testNextIntValueAfterFieldName() throws IOException {
        JsonParser p = parse("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals(1, p.nextIntValue(-1));
    }

    @Test
    public void testNextIntValueDefaultWhenNotInt() throws IOException {
        JsonParser p = parse("{\"a\":\"x\"}");
        p.nextToken();
        p.nextToken();
        assertEquals(-99, p.nextIntValue(-99));
    }

    @Test
    public void testNextLongValueAfterFieldName() throws IOException {
        JsonParser p = parse("{\"a\":123456789012}");
        p.nextToken();
        p.nextToken();
        assertEquals(123456789012L, p.nextLongValue(-1L));
    }

    @Test
    public void testNextBooleanValueTrueAfterFieldName() throws IOException {
        JsonParser p = parse("{\"a\":true}");
        p.nextToken();
        p.nextToken();
        assertEquals(Boolean.TRUE, p.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueFalseAfterFieldName() throws IOException {
        JsonParser p = parse("{\"a\":false}");
        p.nextToken();
        p.nextToken();
        assertEquals(Boolean.FALSE, p.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueNullWhenNotBooleanAfterFieldName() throws IOException {
        JsonParser p = parse("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        assertNull(p.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueDirectTrue() throws IOException {
        JsonParser p = parse("true");
        assertEquals(Boolean.TRUE, p.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueDirectFalse() throws IOException {
        JsonParser p = parse("false");
        assertEquals(Boolean.FALSE, p.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueDirectNonBoolean() throws IOException {
        JsonParser p = parse("123");
        assertNull(p.nextBooleanValue());
    }

    // ---------------- getValueAsString overrides ----------------

    @Test
    public void testGetValueAsStringOnStringToken() throws IOException {
        JsonParser p = parse("\"xyz\"");
        p.nextToken();
        assertEquals("xyz", p.getValueAsString());
        // เรียกซ้ำอีกครั้งเพื่อให้ผ่าน branch ที่ _tokenIncomplete==false แล้ว
        assertEquals("xyz", p.getValueAsString("def"));
    }

    @Test
    public void testGetValueAsStringOnNonStringTokenDoesNotThrow() throws IOException {
        // พฤติกรรมจริงของ super.getValueAsString() ไม่ปรากฏใน source ที่ให้มา
        // จึงตรวจสอบเพียงว่าเรียกได้โดยไม่ throw exception เท่านั้น
        JsonParser p = parse("123");
        p.nextToken();
        String v = p.getValueAsString("fallback");
        assertNotNull(v);
    }

    // ---------------- Misc API ----------------

    @Test
    public void testGetCodecSetCodec() throws IOException {
        JsonParser p = parse("1");
        assertNull(p.getCodec());
        ObjectCodec codec = null; // ไม่มี ObjectCodec concrete ใน classpath นี้ จึงทดสอบแค่ setter/getter กับ null
        p.setCodec(codec);
        assertNull(p.getCodec());
    }

    @Test
    public void testGetInputSourceForStreamBasedParser() throws IOException {
        InputStream in = new ByteArrayInputStream("1".getBytes("UTF-8"));
        JsonParser p = factory.createParser(in);
        assertSame(in, p.getInputSource());
    }

    @Test
    public void testReleaseBufferedWithData() throws IOException {
        JsonParser p = parse("12345");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = p.releaseBuffered(out);
        assertEquals(5, count);
        assertEquals(5, out.toByteArray().length);
    }

    @Test
    public void testReleaseBufferedEmpty() throws IOException {
        JsonParser p = parse("");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = p.releaseBuffered(out);
        assertEquals(0, count);
    }

    @Test
    public void testGetTokenLocationAndCurrentLocationNotNull() throws IOException {
        JsonParser p = parse("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        JsonLocation tokenLoc = p.getTokenLocation();
        JsonLocation currLoc = p.getCurrentLocation();
        assertNotNull(tokenLoc);
        assertNotNull(currLoc);
        assertTrue(tokenLoc.getLineNr() >= 1);
        assertTrue(currLoc.getColumnNr() >= 1);
    }

    // ---------------- Slow (1-byte-at-a-time) stream: บังคับ loadMore()/loadMoreGuaranteed() หลายครั้ง ----------------

    @Test
    public void testSlowStreamLongNumber() throws IOException {
        JsonParser p = parseSlow("123456789");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123456789, p.getIntValue());
    }

    @Test
    public void testSlowStreamObjectStructure() throws IOException {
        JsonParser p = parseSlow("{\"a\":1,\"b\":[true,false,null]}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
    }

    @Test
    public void testSlowStreamString() throws IOException {
        JsonParser p = parseSlow("\"hello world\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello world", p.getText());
    }
}
