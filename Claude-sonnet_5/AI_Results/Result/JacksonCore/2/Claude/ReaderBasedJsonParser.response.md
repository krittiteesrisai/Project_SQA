# แนวทางการทดสอบ

เนื่องจาก `ReaderBasedJsonParser` เป็น `public final class` ที่ constructor เป็น package-level (ต้องการ `IOContext`, `CharsToNameCanonicalizer` ซึ่งเป็น internal) แนวทางที่ปลอดภัยและตรงกับการใช้งานจริงคือ **สร้างผ่าน `JsonFactory.createParser(Reader)`** แล้ว cast กลับเป็น `ReaderBasedJsonParser` (เพราะ `JsonFactory` เลือก implementation นี้เมื่อรับ `Reader`) จากนั้นทดสอบผ่าน public API (`nextToken()`, `getText()`, `getBinaryValue()`, ฯลฯ) ซึ่งจะไล่ผ่าน branch ภายในของคลาสเป้าหมายจริง

> หมายเหตุ: บาง behavior (เช่น `getValueAsString()` สำหรับ token ที่ไม่ใช่ string ซึ่งพึ่ง `super.getValueAsString()` ใน `ParserBase` ที่ไม่มีซอร์สให้) ผู้เขียน **ไม่ยืนยัน** ผลลัพธ์ที่ชัดเจน จะกำกับด้วยคอมเมนต์และ assertion แบบผ่อนปรน

```java
package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonToken;

/**
 * JUnit4 test suite for {@link ReaderBasedJsonParser}.
 *
 * หมายเหตุทั่วไป:
 * - คลาสถูกสร้างผ่าน JsonFactory#createParser(Reader) แล้ว cast กลับมาเป็น
 *   ReaderBasedJsonParser เนื่องจาก constructor จริงเป็น package-visible
 *   และต้องใช้ IOContext/CharsToNameCanonicalizer ภายใน
 * - บางกรณีที่ behavior ขึ้นกับ ParserBase (ซึ่งไม่มีซอร์สให้ในโจทย์) จะกำกับด้วยคอมเมนต์ "ไม่ยืนยัน"
 */
public class ReaderBasedJsonParserTest {

    private ReaderBasedJsonParser createParser(String json) throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser(new StringReader(json));
        return (ReaderBasedJsonParser) p;
    }

    // ================= Basic token / structure ==================

    @Test
    public void testSimpleObject() throws IOException {
        ReaderBasedJsonParser p = createParser("{\"a\":1,\"b\":true}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("b", p.getCurrentName());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testSimpleArray() throws IOException {
        ReaderBasedJsonParser p = createParser("[1,2,3]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(3, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
    }

    @Test
    public void testNestedObjectArray() throws IOException {
        ReaderBasedJsonParser p = createParser("{\"arr\":[{\"x\":1}]}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
    }

    @Test
    public void testEmptyObjectAndArray() throws IOException {
        ReaderBasedJsonParser p = createParser("{}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());

        ReaderBasedJsonParser p2 = createParser("[]");
        assertEquals(JsonToken.START_ARRAY, p2.nextToken());
        assertEquals(JsonToken.END_ARRAY, p2.nextToken());
    }

    @Test
    public void testTrueFalseNull() throws IOException {
        ReaderBasedJsonParser p = createParser("[true,false,null]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
    }

    @Test
    public void testEndOfInputReturnsNullAndCloses() throws IOException {
        ReaderBasedJsonParser p = createParser("1");
        p.nextToken();
        assertNull(p.nextToken());
        assertTrue(p.isClosed());
    }

    // ================= Strings ==================

    @Test
    public void testStringWithEscapes() throws IOException {
        ReaderBasedJsonParser p = createParser("\"line1\\nline2\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("line1\nline2", p.getText());
    }

    @Test
    public void testStringWithUnicodeEscape() throws IOException {
        ReaderBasedJsonParser p = createParser("\"\\u0041\\u0042\"");
        p.nextToken();
        assertEquals("AB", p.getText());
    }

    @Test(expected = JsonParseException.class)
    public void testUnterminatedStringThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("\"abc");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        p.getText(); // triggers _finishString -> EOF error
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidEscapeThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("\"\\x\"");
        p.nextToken();
        p.getText();
    }

    @Test(expected = JsonParseException.class)
    public void testControlCharInStringThrows() throws IOException {
        // literal TAB char (not escaped) inside quotes -> illegal
        ReaderBasedJsonParser p = createParser("\"a\tb\"");
        p.nextToken();
        p.getText();
    }

    @Test
    public void testFieldNameWithEscape() throws IOException {
        ReaderBasedJsonParser p = createParser("{\"a\\tb\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("a\tb", p.getCurrentName());
    }

    // ================= Numbers ==================

    @Test
    public void testNumberIntegerBareEOF() throws IOException {
        // ไม่มี separator ตามหลัง -> ไปทาง slow path (_parseNumber2, eof=true)
        ReaderBasedJsonParser p = createParser("12345");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(12345, p.getIntValue());
    }

    @Test
    public void testNumberIntegerFastPath() throws IOException {
        // มี ']' เป็น separator -> fast path ใน _parseNumber (dummy_loop สำเร็จ)
        ReaderBasedJsonParser p = createParser("[12345]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(12345, p.getIntValue());
    }

    @Test
    public void testNumberNegativeFastPath() throws IOException {
        ReaderBasedJsonParser p = createParser("[-42]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(-42, p.getIntValue());
    }

    @Test
    public void testNumberFloatFastPath() throws IOException {
        ReaderBasedJsonParser p = createParser("[3.14]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(3.14, p.getDoubleValue(), 0.0001);
    }

    @Test
    public void testNumberExponentFastPath() throws IOException {
        ReaderBasedJsonParser p = createParser("[1e2]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(100.0, p.getDoubleValue(), 0.0001);
    }

    @Test(expected = JsonParseException.class)
    public void testDecimalPointNotFollowedByDigitThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("[1.]");
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testExponentNotFollowedByDigitThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("[1e]");
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testLeadingZeroDisallowedByDefault() throws IOException {
        ReaderBasedJsonParser p = createParser("012");
        p.nextToken();
    }

    @Test
    public void testLeadingZeroAllowedWithFeature() throws IOException {
        ReaderBasedJsonParser p = createParser("012");
        p.enable(Feature.ALLOW_NUMERIC_LEADING_ZEROS);
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(12, p.getIntValue());
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidNumberStartAfterMinusThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("-a");
        p.nextToken();
    }

    @Test
    public void testNaNAllowedWithFeature() throws IOException {
        ReaderBasedJsonParser p = createParser("NaN");
        p.enable(Feature.ALLOW_NON_NUMERIC_NUMBERS);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isNaN(p.getDoubleValue()));
    }

    @Test(expected = JsonParseException.class)
    public void testNaNDisallowedThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("NaN");
        p.nextToken();
    }

    @Test
    public void testPositiveInfinityAllowedWithFeature() throws IOException {
        ReaderBasedJsonParser p = createParser("+Infinity");
        p.enable(Feature.ALLOW_NON_NUMERIC_NUMBERS);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isInfinite(p.getDoubleValue()));
    }

    @Test(expected = JsonParseException.class)
    public void testPlusSignWithoutInfinityThrows() throws IOException {
        // '+' -> _handleOddValue -> _handleInvalidNumberStart('1', false) -> ch != 'I' -> error
        ReaderBasedJsonParser p = createParser("+123");
        p.nextToken();
    }

    // ================= Structural error cases ==================

    @Test(expected = JsonParseException.class)
    public void testMismatchedEndArrayThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("[1}");
        p.nextToken();
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedEndObjectThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("{\"a\":1]");
        p.nextToken();
        p.nextToken(); // field+value combined
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingCommaThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("[1 2]");
        p.nextToken();
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingColonThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("{\"a\" 1}");
        p.nextToken();
        p.nextToken();
    }

    // ================= Field name variants ==================

    @Test(expected = JsonParseException.class)
    public void testUnquotedFieldNameDisallowedThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("{a:1}");
        p.nextToken();
        p.nextToken();
    }

    @Test
    public void testUnquotedFieldNameAllowedWithFeature() throws IOException {
        ReaderBasedJsonParser p = createParser("{a:1}");
        p.enable(Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
    }

    @Test
    public void testSingleQuoteFieldNameAllowedWithFeature() throws IOException {
        ReaderBasedJsonParser p = createParser("{'a':1}");
        p.enable(Feature.ALLOW_SINGLE_QUOTES);
        p.nextToken();
        p.nextToken();
        assertEquals("a", p.getCurrentName());
    }

    // ================= Single-quote string ==================

    @Test
    public void testSingleQuoteStringAllowedWithFeature() throws IOException {
        ReaderBasedJsonParser p = createParser("['abc']");
        p.enable(Feature.ALLOW_SINGLE_QUOTES);
        p.nextToken();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("abc", p.getText());
    }

    @Test(expected = JsonParseException.class)
    public void testSingleQuoteDisallowedThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("['abc']");
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testAposStringControlCharThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("['a\tb']");
        p.enable(Feature.ALLOW_SINGLE_QUOTES);
        p.nextToken();
        p.nextToken(); // _handleApos parses eagerly -> throws here
    }

    // ================= Comments ==================

    @Test
    public void testCStyleCommentAllowedWithFeature() throws IOException {
        ReaderBasedJsonParser p = createParser("[/* c */ 1]");
        p.enable(Feature.ALLOW_COMMENTS);
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
    }

    @Test
    public void testCppStyleLineCommentAllowedWithFeature() throws IOException {
        ReaderBasedJsonParser p = createParser("[// c\n 1]");
        p.enable(Feature.ALLOW_COMMENTS);
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void testCommentDisallowedThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("[/* c */ 1]");
        p.nextToken();
        p.nextToken();
    }

    @Test
    public void testYamlCommentAllowedWithFeature() throws IOException {
        ReaderBasedJsonParser p = createParser("[# c\n 1]");
        p.enable(Feature.ALLOW_YAML_COMMENTS);
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void testYamlCommentDisallowedFallsThroughAndThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("[# c\n 1]");
        p.nextToken();
        p.nextToken();
    }

    // ================= Odd values / token matching ==================

    @Test(expected = JsonParseException.class)
    public void testOddValueUnexpectedSymbolThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("@");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testOddValueIdentifierLikeThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("xyz");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testIncompleteTrueTokenThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("tru");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testTrueTokenFollowedByLetterThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("truex");
        p.nextToken();
    }

    // ================= getText* family ==================

    @Test
    public void testGetTextForFieldName() throws IOException {
        ReaderBasedJsonParser p = createParser("{\"field\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("field", p.getText());
    }

    @Test
    public void testGetTextCharactersForString() throws IOException {
        ReaderBasedJsonParser p = createParser("\"hello\"");
        p.nextToken();
        char[] chars = p.getTextCharacters();
        int len = p.getTextLength();
        assertEquals("hello", new String(chars, p.getTextOffset(), len));
    }

    @Test
    public void testGetTextLengthForNumber() throws IOException {
        ReaderBasedJsonParser p = createParser("12345");
        p.nextToken();
        assertEquals(5, p.getTextLength());
    }

    @Test
    public void testGetTextOffsetDefaultForBoolean() throws IOException {
        ReaderBasedJsonParser p = createParser("true");
        p.nextToken();
        assertEquals(0, p.getTextOffset());
    }

    @Test
    public void testGetTextForNullBeforeAnyToken() throws IOException {
        ReaderBasedJsonParser p = createParser("1");
        // ยังไม่เรียก nextToken() -> _currToken == null
        assertNull(p.getText());
    }

    @Test
    public void testGetValueAsStringForStringToken() throws IOException {
        ReaderBasedJsonParser p = createParser("\"abc\"");
        p.nextToken();
        assertEquals("abc", p.getValueAsString());
    }

    @Test
    public void testGetValueAsStringDelegatesForNonStringToken() throws IOException {
        // ไม่ยืนยัน behavior ที่แน่ชัดของ ParserBase#getValueAsString(default)
        // เนื่องจากไม่มีซอร์สให้ตรวจสอบ จึงเช็คเพียงว่าไม่ throw และคืนค่าไม่ null
        ReaderBasedJsonParser p = createParser("123");
        p.nextToken();
        String s = p.getValueAsString("default");
        assertNotNull(s);
    }

    // ================= Binary / Base64 ==================

    @Test
    public void testGetBinaryValueBase64() throws IOException {
        ReaderBasedJsonParser p = createParser("\"aGVsbG8=\""); // "hello"
        p.nextToken();
        byte[] data = p.getBinaryValue(Base64Variants.MIME_NO_LINEFEEDS);
        assertEquals("hello", new String(data, "UTF-8"));
    }

    @Test
    public void testReadBinaryValueToOutputStream() throws IOException {
        ReaderBasedJsonParser p = createParser("\"aGVsbG8=\"");
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = p.readBinaryValue(Base64Variants.MIME_NO_LINEFEEDS, out);
        assertEquals(5, count);
        assertEquals("hello", out.toString("UTF-8"));
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueWrongTokenThrows() throws IOException {
        ReaderBasedJsonParser p = createParser("123");
        p.nextToken();
        p.getBinaryValue(Base64Variants.MIME_NO_LINEFEEDS);
    }

    // ================= releaseBuffered / getInputSource ==================

    @Test
    public void testReleaseBufferedWithRemainingContent() throws IOException {
        ReaderBasedJsonParser p = createParser("123 456");
        p.nextToken(); // consumes "123", buffer ยังมี " 456" เหลือ
        StringWriter sw = new StringWriter();
        int count = p.releaseBuffered(sw);
        assertTrue(count > 0);
        assertEquals(" 456", sw.toString());
    }

    @Test
    public void testReleaseBufferedNoRemaining() throws IOException {
        ReaderBasedJsonParser p = createParser("123");
        p.nextToken(); // EOF ระหว่าง parse ทำให้ pointer อยู่ที่ปลายบัฟเฟอร์แล้ว
        StringWriter sw = new StringWriter();
        int count = p.releaseBuffered(sw);
        assertEquals(0, count);
    }

    @Test
    public void testGetInputSourceReturnsSameReader() throws IOException {
        StringReader sr = new StringReader("1");
        JsonFactory f = new JsonFactory();
        ReaderBasedJsonParser p = (ReaderBasedJsonParser) f.createParser(sr);
        assertSame(sr, p.getInputSource());
    }

    // ================= close() behavior ==================

    @Test
    public void testCloseClosesReaderWhenAutoCloseEnabledByDefault() throws IOException {
        final boolean[] closed = {false};
        Reader r = new StringReader("1") {
            @Override
            public void close() {
                closed[0] = true;
            }
        };
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser(r);
        p.nextToken();
        p.close();
        assertTrue(closed[0]);
    }

    @Test
    public void testCloseDoesNotCloseReaderWhenAutoCloseDisabled() throws IOException {
        final boolean[] closed = {false};
        Reader r = new StringReader("1") {
            @Override
            public void close() {
                closed[0] = true;
            }
        };
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser(r);
        p.disable(Feature.AUTO_CLOSE_SOURCE);
        p.nextToken();
        p.close();
        assertFalse(closed[0]);
    }

    // ================= nextTextValue / nextIntValue / nextLongValue / nextBooleanValue ==================

    @Test
    public void testNextTextValueForFieldNameString() throws IOException {
        ReaderBasedJsonParser p = createParser("{\"a\":\"val\"}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME, _nextToken=VALUE_STRING เตรียมไว้
        assertEquals("val", p.nextTextValue());
        assertEquals(JsonToken.VALUE_STRING, p.getCurrentToken());
    }

    @Test
    public void testNextTextValueForFieldNameNonStringReturnsNull() throws IOException {
        ReaderBasedJsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        assertNull(p.nextTextValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.getCurrentToken());
    }

    @Test
    public void testNextTextValueForFieldNameStartArrayCreatesContext() throws IOException {
        ReaderBasedJsonParser p = createParser("{\"a\":[1]}");
        p.nextToken();
        p.nextToken();
        assertNull(p.nextTextValue());
        assertEquals(JsonToken.START_ARRAY, p.getCurrentToken());
    }

    @Test
    public void testNextTextValueNonFieldContext() throws IOException {
        ReaderBasedJsonParser p = createParser("[\"x\"]");
        p.nextToken();
        assertEquals("x", p.nextTextValue());
    }

    @Test
    public void testNextIntValueForFieldNameCorrectType() throws IOException {
        ReaderBasedJsonParser p = createParser("{\"a\":5}");
        p.nextToken();
        p.nextToken();
        assertEquals(5, p.nextIntValue(-1));
    }

    @Test
    public void testNextIntValueForFieldNameWrongTypeReturnsDefault() throws IOException {
        ReaderBasedJsonParser p = createParser("{\"a\":\"s\"}");
        p.nextToken();
        p.nextToken();
        assertEquals(-1, p.nextIntValue(-1));
    }

    @Test
    public void testNextIntValueNonFieldContext() throws IOException {
        ReaderBasedJsonParser p = createParser("[7]");
        p.nextToken();
        assertEquals(7, p.nextIntValue(-1));
    }

    @Test
    public void testNextLongValueForFieldNameCorrectType() throws IOException {
        ReaderBasedJsonParser p = createParser("{\"a\":123456789012}");
        p.nextToken();
        p.nextToken();
        assertEquals(123456789012L, p.nextLongValue(-1L));
    }

    @Test
    public void testNextLongValueForFieldNameWrongTypeReturnsDefault() throws IOException {
        ReaderBasedJsonParser p = createParser("{\"a\":\"s\"}");
        p.nextToken();
        p.nextToken();
        assertEquals(-1L, p.nextLongValue(-1L));
    }

    @Test
    public void testNextBooleanValueForFieldNameTrue() throws IOException {
        ReaderBasedJsonParser p = createParser("{\"a\":true}");
        p.nextToken();
        p.nextToken();
        assertEquals(Boolean.TRUE, p.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueForFieldNameFalse() throws IOException {
        ReaderBasedJsonParser p = createParser("{\"a\":false}");
        p.nextToken();
        p.nextToken();
        assertEquals(Boolean.FALSE, p.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueForFieldNameOtherReturnsNull() throws IOException {
        ReaderBasedJsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        assertNull(p.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueForFieldNameStartObjectCreatesContext() throws IOException {
        ReaderBasedJsonParser p = createParser("{\"a\":{\"b\":1}}");
        p.nextToken();
        p.nextToken();
        assertNull(p.nextBooleanValue());
        assertEquals(JsonToken.START_OBJECT, p.getCurrentToken());
    }

    @Test
    public void testNextBooleanValueNonFieldContext() throws IOException {
        ReaderBasedJsonParser p = createParser("[true,false,1]");
        p.nextToken();
        assertEquals(Boolean.TRUE, p.nextBooleanValue());
        assertEquals(Boolean.FALSE, p.nextBooleanValue());
        assertNull(p.nextBooleanValue());
    }

    // ================= getCodec / setCodec (trivial getters) ==================

    @Test
    public void testGetSetCodecNull() throws IOException {
        ReaderBasedJsonParser p = createParser("1");
        assertNull(p.getCodec());
        p.setCodec(null);
        assertNull(p.getCodec());
    }
}
```

## สรุปตาราง Test ↔ Branch/Condition ที่ครอบคลุม

| กลุ่ม Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testSimpleObject, testSimpleArray, testNestedObjectArray, testEmptyObjectAndArray, testTrueFalseNull | `nextToken()` เส้นทางปกติ: START/END OBJECT/ARRAY, FIELD_NAME, VALUE_TRUE/FALSE/NULL, `inObject` true/false, `expectComma()` |
| testEndOfInputReturnsNullAndCloses | `_skipWSOrEnd()` คืน -1 → `close()` และ `_currToken=null` |
| testStringWithEscapes, testStringWithUnicodeEscape | `_decodeEscaped()` กรณี mapped char และ hex-escape (`case 'u'`) |
| testUnterminatedStringThrows | `_finishString2()` EOF → `_reportInvalidEOF` |
| testInvalidEscapeThrows | `_decodeEscaped()` default → `_handleUnrecognizedCharacterEscape` |
| testControlCharInStringThrows | `_finishString2()` control char → `_throwUnquotedSpace` |
| testFieldNameWithEscape | `_parseName2()` escape branch (`i==INT_BACKSLASH`) |
| testNumberIntegerBareEOF / FastPath variants | `_parseNumber()` fast-path (`dummy_loop` สำเร็จ) vs slow-path (`_parseNumber2`, `eof=true`) |
| testDecimalPointNotFollowedByDigitThrows / testExponentNotFollowedByDigitThrows | `fractLen==0` / `expLen==0` → `reportUnexpectedNumberChar` |
| testLeadingZeroDisallowedByDefault / Allowed | `_verifyNoLeadingZeroes()` ทั้งสอง branch ของ `Feature.ALLOW_NUMERIC_LEADING_ZEROS` |
| testInvalidNumberStartAfterMinusThrows | `_parseNumber()` negative digit invalid → `_handleInvalidNumberStart` |
| testNaNAllowed/Disallowed, testPositiveInfinityAllowed, testPlusSignWithoutInfinityThrows | `_handleOddValue()` case `'N'`, `'I'`, `'+'`; `_handleInvalidNumberStart` กับ `ch=='I'/'n'` |
| testMismatchedEndArrayThrows/EndObjectThrows | `_reportMismatchedEndMarker` (inArray/inObject check) |
| testMissingCommaThrows, testMissingColonThrows | `expectComma()` / colon check → `_reportUnexpectedChar` |
| testUnquotedFieldNameDisallowed/Allowed, testSingleQuoteFieldNameAllowed | `_handleOddName()` feature checks (`ALLOW_UNQUOTED_FIELD_NAMES`, `ALLOW_SINGLE_QUOTES`) |
| testSingleQuoteStringAllowed/Disallowed, testAposStringControlCharThrows | `_handleOddValue()` case `'\''`, `_handleApos()` control-char branch |
| testCStyleComment/CppStyleComment/CommentDisallowed | `_skipComment()`, `_skipCComment()`, `_skipLine()`, feature `ALLOW_COMMENTS` |
| testYamlCommentAllowed/Disallowed | `_skipYAMLComment()` ทั้งสอง branch |
| testOddValueUnexpectedSymbolThrows/IdentifierLikeThrows | `_handleOddValue()` default → `Character.isJavaIdentifierStart` true/false |
| testIncompleteTrueTokenThrows / TrueTokenFollowedByLetterThrows | `_matchToken()` EOF branch และ trailing-identifier-char branch |
| testGetText*, testGetValueAsString* | `getText()`, `_getText2()`, `getTextCharacters()`, `getTextLength()`, `getTextOffset()` switch ทุก case (`FIELD_NAME`, `VALUE_STRING` + `_tokenIncomplete`, `VALUE_NUMBER_*`, default) |
| testGetBinaryValueBase64, testReadBinaryValueToOutputStream, testGetBinaryValueWrongTokenThrows | `getBinaryValue()`/`readBinaryValue()` ทั้ง branch (`_tokenIncomplete` true/false, token ผิดชนิด) |
| testReleaseBufferedWithRemainingContent/NoRemaining | `releaseBuffered()` ทั้ง `count<1` และ `count>=1` |
| testGetInputSourceReturnsSameReader | `getInputSource()` |
| testCloseClosesReaderWhenAutoCloseEnabled/Disabled | `_closeInput()` เงื่อนไข `isResourceManaged() || isEnabled(AUTO_CLOSE_SOURCE)` |
| testNextTextValue*, testNextIntValue*, testNextLongValue*, testNextBooleanValue* | ทุก branch ของ `nextTextValue/IntValue/LongValue/BooleanValue` ทั้งกรณี `_currToken==FIELD_NAME` (ค่า string/number/boolean ตรง/ไม่ตรง, START_ARRAY/START_OBJECT) และกรณี non-field context |
| testGetSetCodecNull | `getCodec()`/`setCodec()` (getter/setter พื้นฐาน) |

**ข้อจำกัดที่ระบุไว้:** `testGetValueAsStringDelegatesForNonStringToken` ใช้ assertion แบบผ่อนปรน เนื่องจาก behavior ของ `ParserBase#getValueAsString(default)` ไม่มีซอร์สให้ตรวจสอบในโจทย์ จึงไม่ยืนยันค่าที่คืนกลับแบบเจาะจง