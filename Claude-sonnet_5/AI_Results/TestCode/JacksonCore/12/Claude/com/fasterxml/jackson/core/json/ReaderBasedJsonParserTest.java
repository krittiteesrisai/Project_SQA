package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class ReaderBasedJsonParserTest {

    private JsonFactory factory;

    @Before
    public void setUp() {
        factory = new JsonFactory();
    }

    private JsonParser createParser(String json) throws IOException {
        return factory.createParser(new StringReader(json));
    }

    /**
     * Reader ที่ทยอยคืนข้อมูลเป็น chunk เล็ก ๆ ตามที่กำหนด
     * เพื่อบีบให้เกิดการอ่านข้าม loadMore() หลายครั้งกลางการ parse
     * (ทดสอบผ่าน public behavior เท่านั้น ไม่ได้แก้ internal buffer)
     */
    private static class ChunkedReader extends Reader {
        private final String data;
        private final int chunkSize;
        private int pos = 0;

        ChunkedReader(String data, int chunkSize) {
            this.data = data;
            this.chunkSize = chunkSize;
        }

        @Override
        public int read(char[] cbuf, int off, int len) throws IOException {
            if (pos >= data.length()) {
                return -1;
            }
            int n = Math.min(chunkSize, Math.min(len, data.length() - pos));
            data.getChars(pos, pos + n, cbuf, off);
            pos += n;
            return n;
        }

        @Override
        public void close() throws IOException {}
    }

    // =========================================================
    // 1. Boundary: empty / whitespace-only input
    // =========================================================

    @Test
    public void testEmptyInputReturnsNull() throws IOException {
        JsonParser p = createParser("");
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testWhitespaceOnlyInputReturnsNull() throws IOException {
        JsonParser p = createParser("   \n\t  ");
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testNextTokenAfterEOFReturnsNullAgain() throws IOException {
        // ทดสอบ branch ที่ _reader == null (หลัง close ใน loadMore ครั้งก่อน)
        JsonParser p = createParser("");
        assertNull(p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    // =========================================================
    // 2. โครงสร้างพื้นฐาน: object / array / nested
    // =========================================================

    @Test
    public void testSimpleObject() throws IOException {
        JsonParser p = createParser("{\"a\":1,\"b\":\"text\"}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("b", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("text", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testSimpleArrayNumbers() throws IOException {
        JsonParser p = createParser("[1, -2, 3.5, 4e2, 0]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(-2, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(3.5, p.getDoubleValue(), 0.0001);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(400.0, p.getDoubleValue(), 0.0001);
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(0, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testBooleanAndNull() throws IOException {
        JsonParser p = createParser("[true, false, null]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testNestedStructures() throws IOException {
        JsonParser p = createParser("{\"a\":[1,{\"b\":2}]}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    // =========================================================
    // 3. Error cases: mismatched marker / missing comma / bad token
    // =========================================================

    @Test(expected = JsonParseException.class)
    public void testMismatchedEndMarker() throws IOException {
        JsonParser p = createParser("[1}");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // } while inArray -> _reportMismatchedEndMarker
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingComma() throws IOException {
        JsonParser p = createParser("[1 2]");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // _skipComma: i != COMMA
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedEOFAfterComma() throws IOException {
        JsonParser p = createParser("[1,");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // _skipAfterComma2 -> EOF -> _constructError
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedCommaAsValue() throws IOException {
        JsonParser p = createParser("[,]");
        p.nextToken();
        p.nextToken(); // _handleOddValue(',') -> _reportUnexpectedChar
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedCharacterAsValueThrows() throws IOException {
        JsonParser p = createParser("@");
        p.nextToken(); // not JavaIdentifierStart -> _reportUnexpectedChar
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidTokenThrows() throws IOException {
        JsonParser p = createParser("tru");
        p.nextToken(); // _matchToken("true",1) EOF mismatch -> _reportInvalidToken
        p.close();
    }

    // =========================================================
    // 4. Number parsing: leading zero / decimal / exponent / negative
    // =========================================================

    @Test(expected = JsonParseException.class)
    public void testLeadingZeroDisallowedThrows() throws IOException {
        JsonParser p = createParser("[007]");
        p.nextToken();
        p.nextToken(); // _verifyNoLeadingZeroes -> feature disabled -> error
        p.close();
    }

    @Test
    public void testLeadingZeroAllowed() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS);
        JsonParser p = createParser("[007]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(7, p.getIntValue());
        p.close();
    }

    @Test
    public void testZeroFollowedByDecimal() throws IOException {
        JsonParser p = createParser("[0.5]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(0.5, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testDecimalPointNotFollowedByDigitThrows() throws IOException {
        JsonParser p = createParser("[1.]");
        p.nextToken();
        p.nextToken();
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testExponentNotFollowedByDigitThrows() throws IOException {
        JsonParser p = createParser("[1e]");
        p.nextToken();
        p.nextToken();
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testNegativeNumberInvalidStartThrows() throws IOException {
        JsonParser p = createParser("-a");
        p.nextToken(); // _parseNegNumber: ch not digit -> _handleInvalidNumberStart
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testPlusSignInvalidThrows() throws IOException {
        JsonParser p = createParser("+123");
        p.nextToken(); // _handleOddValue('+') -> _handleInvalidNumberStart
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testRootValuesMissingSpaceThrows() throws IOException {
        JsonParser p = createParser("123abc");
        p.nextToken(); // _verifyRootSpace('a') -> not space -> _reportMissingRootWS
        p.close();
    }

    // =========================================================
    // 5. NaN / Infinity (Feature.ALLOW_NON_NUMERIC_NUMBERS)
    // =========================================================

    @Test(expected = JsonParseException.class)
    public void testNaNDisabledThrows() throws IOException {
        JsonParser p = createParser("[NaN]");
        p.nextToken();
        p.nextToken();
        p.close();
    }

    @Test
    public void testNaNEnabled() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        JsonParser p = createParser("[NaN]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isNaN(p.getDoubleValue()));
        p.close();
    }

    @Test
    public void testInfinityEnabled() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        JsonParser p = createParser("[Infinity, -Infinity]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, p.getDoubleValue(), 0.0);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, p.getDoubleValue(), 0.0);
        p.close();
    }

    // =========================================================
    // 6. Single quotes / unquoted field name (feature toggles)
    // =========================================================

    @Test(expected = JsonParseException.class)
    public void testSingleQuoteDisabledThrows() throws IOException {
        JsonParser p = createParser("{'a':1}");
        p.nextToken();
        p.nextToken();
        p.close();
    }

    @Test
    public void testSingleQuoteEnabled() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        JsonParser p = createParser("{'a':'b'}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("b", p.getText());
        p.close();
    }

    @Test
    public void testUnquotedFieldNamesEnabled() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        JsonParser p = createParser("{abc:1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("abc", p.getCurrentName());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testUnquotedFieldNamesDisabledThrows() throws IOException {
        JsonParser p = createParser("{abc:1}");
        p.nextToken();
        p.nextToken();
        p.close();
    }

    // =========================================================
    // 7. Comments (block / line / YAML)
    // =========================================================

    @Test(expected = JsonParseException.class)
    public void testCommentsDisabledThrows() throws IOException {
        JsonParser p = createParser("[1 /* comment */, 2]");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.close();
    }

    @Test
    public void testCommentsEnabled() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_COMMENTS);
        JsonParser p = createParser("[1 /* comment */, 2 // line\n]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testYamlCommentsEnabled() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_YAML_COMMENTS);
        JsonParser p = createParser("[1, # comment\n 2]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidCommentCharThrows() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_COMMENTS);
        JsonParser p = createParser("[1 /x 2]");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // _skipComment: char after '/' not '*'/'/' 
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testEOFInsideBlockCommentThrows() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_COMMENTS);
        JsonParser p = createParser("[1] /* unterminated");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.nextToken(); // _skipCComment: EOF -> _reportInvalidEOF
        p.close();
    }

    // =========================================================
    // 8. String / escape handling
    // =========================================================

    @Test
    public void testEscapeSequences() throws IOException {
        JsonParser p = createParser("\"a\\nb\\tc\\\"d\\\\e\\u0041\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("a\nb\tc\"d\\eA", p.getText());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidEscapeThrows() throws IOException {
        JsonParser p = createParser("\"a\\qb\"");
        p.nextToken();
        p.getText();
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testUnterminatedStringThrows() throws IOException {
        // อาจเป็น JsonParseException หรือ subclass ของมัน (เช่น JsonEOFException) -- ทั้งสองผ่านเงื่อนไขนี้
        JsonParser p = createParser("\"abc");
        p.nextToken();
        p.getText();
        p.close();
    }

    // =========================================================
    // 9. getText* variants (FIELD_NAME / STRING / NUMBER)
    // =========================================================

    @Test
    public void testGetTextVariants() throws IOException {
        JsonParser p = createParser("{\"field\":123}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        char[] chars = p.getTextCharacters();
        int offset = p.getTextOffset();
        int len = p.getTextLength();
        assertEquals("field", new String(chars, offset, len));
        p.nextToken(); // NUMBER
        assertEquals(3, p.getTextLength());
        p.close();
    }

    @Test
    public void testGetValueAsStringForStringAndFieldName() throws IOException {
        JsonParser p = createParser("{\"field\":\"value\"}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        assertEquals("field", p.getValueAsString());
        p.nextToken(); // VALUE_STRING
        assertEquals("value", p.getValueAsString());
        assertEquals("value", p.getValueAsString("default"));
        p.close();
        // หมายเหตุ: กรณี token อื่น (เช่น boolean/number) ที่ fallback ไปที่ super.getValueAsString()
        // ไม่ได้ทดสอบเพราะ behavior ไม่ปรากฏในซอร์สที่ให้มา (ParserBase)
    }

    // =========================================================
    // 10. Base64 / binary value
    // =========================================================

    @Test
    public void testGetBinaryValue() throws IOException {
        JsonParser p = createParser("\"SGk=\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] data = p.getBinaryValue();
        assertArrayEquals("Hi".getBytes(), data);
        p.close();
    }

    @Test
    public void testGetBinaryValueCachedReuse() throws IOException {
        JsonParser p = createParser("\"SGk=\"");
        p.nextToken();
        byte[] first = p.getBinaryValue();
        byte[] second = p.getBinaryValue(); // _tokenIncomplete=false, _binaryValue != null -> cache
        assertSame(first, second);
        p.close();
    }

    @Test
    public void testReadBinaryValueIncremental() throws IOException {
        JsonParser p = createParser("\"SGk=\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = p.readBinaryValue(out); // _tokenIncomplete true -> _readBinary
        assertEquals(2, len);
        assertArrayEquals("Hi".getBytes(), out.toByteArray());
        p.close();
    }

    @Test
    public void testReadBinaryValueAfterAlreadyDecoded() throws IOException {
        JsonParser p = createParser("\"SGk=\"");
        p.nextToken();
        p.getBinaryValue(); // ทำให้ _tokenIncomplete=false ก่อน
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = p.readBinaryValue(out); // ใช้ branch getBinaryValue() + out.write
        assertEquals(2, len);
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueWrongTokenThrows() throws IOException {
        JsonParser p = createParser("123");
        p.nextToken();
        p.getBinaryValue(); // token ไม่ใช่ STRING/EMBEDDED_OBJECT
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testBase64InvalidCharacterThrows() throws IOException {
        JsonParser p = createParser("\"SG!k\"");
        p.nextToken();
        p.getBinaryValue(); // '!' ไม่ใช่ base64/ws/quote -> _decodeBase64Escape error
        p.close();
    }

    // =========================================================
    // 11. nextFieldName(SerializableString) / nextFieldName()
    // =========================================================

    @Test
    public void testNextFieldNameSerializableMatch() throws IOException {
        JsonParser p = createParser("{\"name\":\"value\"}");
        p.nextToken();
        SerializableString sstr = new SerializedString("name");
        assertTrue(p.nextFieldName(sstr));
        assertEquals(JsonToken.FIELD_NAME, p.getCurrentToken());
        p.close();
    }

    @Test
    public void testNextFieldNameSerializableNoMatch() throws IOException {
        JsonParser p = createParser("{\"other\":\"value\"}");
        p.nextToken();
        SerializableString sstr = new SerializedString("name");
        assertFalse(p.nextFieldName(sstr));
        p.close();
    }

    @Test
    public void testNextFieldNameSerializableNotInObject() throws IOException {
        JsonParser p = createParser("[]");
        p.nextToken();
        SerializableString sstr = new SerializedString("name");
        assertFalse(p.nextFieldName(sstr));
        assertEquals(JsonToken.END_ARRAY, p.getCurrentToken());
        p.close();
    }

    @Test
    public void testNextFieldNamePlain() throws IOException {
        JsonParser p = createParser("{\"a\":1,\"b\":2}");
        p.nextToken();
        assertEquals("a", p.nextFieldName());
        p.nextToken();
        assertEquals("b", p.nextFieldName());
        p.close();
    }

    @Test
    public void testNextFieldNameReturnsNullAtEndObject() throws IOException {
        JsonParser p = createParser("{}");
        p.nextToken();
        assertNull(p.nextFieldName());
        assertEquals(JsonToken.END_OBJECT, p.getCurrentToken());
        p.close();
    }

    // =========================================================
    // 12. nextTextValue / nextIntValue / nextLongValue / nextBooleanValue
    // =========================================================

    @Test
    public void testNextTextValueString() throws IOException {
        JsonParser p = createParser("{\"a\":\"txt\"}");
        p.nextToken();
        p.nextToken();
        assertEquals("txt", p.nextTextValue());
        p.close();
    }

    @Test
    public void testNextTextValueNonStringReturnsNull() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        assertNull(p.nextTextValue());
        p.close();
    }

    @Test
    public void testNextIntValueMatch() throws IOException {
        JsonParser p = createParser("{\"a\":42}");
        p.nextToken();
        p.nextToken();
        assertEquals(42, p.nextIntValue(-1));
        p.close();
    }

    @Test
    public void testNextIntValueDefault() throws IOException {
        JsonParser p = createParser("{\"a\":\"str\"}");
        p.nextToken();
        p.nextToken();
        assertEquals(-1, p.nextIntValue(-1));
        p.close();
    }

    @Test
    public void testNextLongValueMatch() throws IOException {
        JsonParser p = createParser("{\"a\":123456789012}");
        p.nextToken();
        p.nextToken();
        assertEquals(123456789012L, p.nextLongValue(-1L));
        p.close();
    }

    @Test
    public void testNextBooleanValueVariants() throws IOException {
        JsonParser p = createParser("{\"a\":true,\"b\":false,\"c\":1}");
        p.nextToken();
        p.nextToken(); // FIELD a
        assertEquals(Boolean.TRUE, p.nextBooleanValue());
        p.nextToken(); // FIELD b
        assertEquals(Boolean.FALSE, p.nextBooleanValue());
        p.nextToken(); // FIELD c
        assertNull(p.nextBooleanValue());
        p.close();
    }

    // =========================================================
    // 13. releaseBuffered / getInputSource / getCodec / location
    // =========================================================

    @Test
    public void testReleaseBuffered() throws IOException {
        JsonParser p = createParser("{\"a\":1} trailing");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.nextToken();
        StringWriter w = new StringWriter();
        int count = ((ReaderBasedJsonParser) p).releaseBuffered(w);
        assertTrue(count >= 0);
        p.close();
    }

    @Test
    public void testReleaseBufferedNoDataReturnsZero() throws IOException {
        JsonParser p = createParser("");
        StringWriter w = new StringWriter();
        int count = ((ReaderBasedJsonParser) p).releaseBuffered(w);
        assertEquals(0, count);
        p.close();
    }

    @Test
    public void testGetInputSource() throws IOException {
        StringReader reader = new StringReader("{}");
        JsonParser p = factory.createParser(reader);
        assertSame(reader, ((ReaderBasedJsonParser) p).getInputSource());
        p.close();
    }

    @Test
    public void testGetSetCodec() throws IOException {
        JsonParser p = createParser("{}");
        p.setCodec(null);
        assertNull(p.getCodec());
        p.close();
    }

    @Test
    public void testLocationMethods() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        assertNotNull(p.getTokenLocation());
        assertNotNull(p.getCurrentLocation());
        p.close();
    }

    // =========================================================
    // 14. loadMore() ผิดปกติ: reader คืน 0 ตัวอักษร
    // =========================================================

    @Test(expected = IOException.class)
    public void testLoadMoreZeroReadThrows() throws IOException {
        Reader faultyReader = new Reader() {
            private boolean first = true;

            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                if (first) {
                    first = false;
                    return 0; // ผิดกฎ Reader contract ตามที่ loadMore() คาดไว้
                }
                return -1;
            }

            @Override
            public void close() throws IOException {}
        };
        JsonParser p = factory.createParser(faultyReader);
        p.nextToken(); // loadMore(): count==0 -> throw IOException
        p.close();
    }

    // =========================================================
    // 15. ทดสอบข้ามหลาย loadMore() ด้วย ChunkedReader
    //     (บีบให้ token/ชื่อฟิลด์/จำนวน ถูก parse ข้าม buffer)
    // =========================================================

    @Test
    public void testStringSplitAcrossBufferLoads() throws IOException {
        JsonParser p = factory.createParser(
                new ChunkedReader("\"hello world this is a longer string value\"", 3));
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello world this is a longer string value", p.getText());
        p.close();
    }

    @Test
    public void testPositiveNumberSplitAcrossBufferLoads() throws IOException {
        JsonParser p = factory.createParser(new ChunkedReader("12345.6789e2", 2));
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(12345.6789e2, p.getDoubleValue(), 1.0);
        p.close();
    }

    @Test
    public void testNegativeNumberSplitAcrossBufferLoads() throws IOException {
        JsonParser p = factory.createParser(new ChunkedReader("-98765", 2));
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(-98765, p.getIntValue());
        p.close();
    }

    @Test
    public void testFieldNameSplitAcrossBufferLoads() throws IOException {
        JsonParser p = factory.createParser(new ChunkedReader("{\"longFieldName\":1}", 2));
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("longFieldName", p.getCurrentName());
        p.close();
    }

    @Test
    public void testCommentSplitAcrossBufferLoads() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_COMMENTS);
        JsonParser p = factory.createParser(
                new ChunkedReader("[1 /* comment here */ , 2]", 2));
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        p.close();
    }
}
