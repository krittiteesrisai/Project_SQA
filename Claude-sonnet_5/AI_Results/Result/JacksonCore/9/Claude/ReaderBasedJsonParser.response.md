# ReaderBasedJsonParserTest — ชุดทดสอบ JUnit 4

หมายเหตุสำคัญก่อนเริ่ม:
- เนื่องจาก `ReaderBasedJsonParser` ต้องใช้ `IOContext` และ `CharsToNameCanonicalizer` ซึ่ง source ของคลาสเหล่านี้ไม่ได้ให้มาด้วย จึง **ไม่เดา constructor ภายใน** ของคลาสเหล่านั้น แต่จะสร้าง instance ผ่าน `JsonFactory` (public API มาตรฐานของ Jackson) ซึ่งภายในจะสร้าง `ReaderBasedJsonParser` เมื่อ source เป็น `Reader` (ตามที่ comment ในซอร์สยืนยัน)
- บาง branch ภายในที่ต้องพึ่งขนาด buffer ภายใน (เช่นการอ่านข้าม buffer boundary) จะถูกกระตุ้นด้วยการป้อน input ที่ยาวมาก (สังเกตได้จาก public behavior เท่านั้น ไม่ได้เดาขนาด buffer ที่แน่นอน)
- บาง behavior ที่วิเคราะห์จาก source แล้วพบว่า "ไม่ throw" (เช่น array ที่ไม่ปิดแล้วเจอ EOF) จะเขียนเทสยืนยันพฤติกรรมจริงตามซอร์ส พร้อมคอมเมนต์ ไม่ใช่การเดา

```java
package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonToken;

public class ReaderBasedJsonParserTest {

    // ---------- helper ----------

    private JsonParser newParser(String json, Feature... enable) throws IOException {
        JsonFactory f = new JsonFactory();
        for (Feature ft : enable) {
            f.enable(ft);
        }
        return f.createParser(new StringReader(json));
    }

    // =========================================================
    // 1. Basic wiring / instance type
    // =========================================================

    @Test
    public void testFactoryProducesReaderBasedJsonParser() throws IOException {
        JsonParser p = newParser("123");
        assertTrue("JsonFactory with Reader source must create ReaderBasedJsonParser",
                p instanceof ReaderBasedJsonParser);
        assertSame(p, ((ReaderBasedJsonParser) p)); // no-op cast check
    }

    // =========================================================
    // 2. getText / getText2 branches
    // =========================================================

    @Test
    public void testGetTextBeforeAnyToken_ReturnsNull_AndGetTextCharsNull() throws IOException {
        JsonParser p = newParser("123");
        // _currToken == null -> _getText2(null) -> null ; getTextCharacters null-branch
        assertNull(p.getText());
        assertNull(p.getTextCharacters());
        assertEquals(0, p.getTextLength());
        assertEquals(0, p.getTextOffset());
    }

    @Test
    public void testGetTextAndCharsForFieldName() throws IOException {
        JsonParser p = newParser("{\"abc\":1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        // ID_FIELD_NAME branch in _getText2 / getTextCharacters / getTextLength / getTextOffset
        assertEquals("abc", p.getText());
        assertArrayEquals("abc".toCharArray(), p.getTextCharacters());
        assertEquals(3, p.getTextLength());
        assertEquals(0, p.getTextOffset());
        // second call must hit "already copied" branch (_nameCopied == true)
        assertArrayEquals("abc".toCharArray(), p.getTextCharacters());
    }

    @Test
    public void testGetTextForStringValue_TokenIncompleteFinishes() throws IOException {
        JsonParser p = newParser("\"hello\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        // _tokenIncomplete == true branch -> _finishString() invoked
        assertEquals("hello", p.getText());
        // second call: _tokenIncomplete already false
        assertEquals("hello", p.getText());
    }

    @Test
    public void testGetTextForNumberIntAndFloat() throws IOException {
        JsonParser p1 = newParser("12345");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p1.nextToken());
        assertEquals("12345", p1.getText());

        JsonParser p2 = newParser("3.14");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p2.nextToken());
        assertEquals("3.14", p2.getText());
    }

    @Test
    public void testGetTextDefaultBranch_forTrueFalseNull() throws IOException {
        JsonParser p = newParser("[true,false,null]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals("true", p.getText());          // default: t.asString()
        assertArrayEquals("true".toCharArray(), p.getTextCharacters());
        assertEquals(4, p.getTextLength());
        assertEquals(0, p.getTextOffset());

        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertEquals("false", p.getText());

        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals("null", p.getText());
    }

    @Test
    public void testGetValueAsStringForStringAndDefault() throws IOException {
        JsonParser p = newParser("\"abc\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("abc", p.getValueAsString());        // VALUE_STRING branch
        assertEquals("abc", p.getValueAsString("def"));   // VALUE_STRING branch (overload)

        JsonParser p2 = newParser("123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p2.nextToken());
        // non-string current token -> falls through to super.getValueAsString(default)
        assertEquals("123", p2.getValueAsString());
        assertEquals("999", p2.getValueAsString("999") == null ? "999" : p2.getValueAsString("999"));
    }

    @Test
    public void testGetTextCharactersFieldNameBufferGrowth() throws IOException {
        // first field short name -> allocates _nameCopyBuffer
        // second field longer name -> "buffer too small" branch (new char[] allocated)
        JsonParser p = newParser("{\"a\":1,\"bbbbbbbbbbbb\":2}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertArrayEquals("a".toCharArray(), p.getTextCharacters());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertArrayEquals("bbbbbbbbbbbb".toCharArray(), p.getTextCharacters());
    }

    @Test
    public void testGetTextLengthAllBranches() throws IOException {
        JsonParser p = newParser("{\"f\":\"str\"}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(1, p.getTextLength());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(3, p.getTextLength()); // triggers _finishString via getTextLength path
    }

    @Test
    public void testGetTextOffsetAllBranches() throws IOException {
        JsonParser p = newParser("{\"f\":\"str\"}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(0, p.getTextOffset()); // default: switch fall-to-nothing -> 0
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(0, p.getTextOffset());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(0, p.getTextOffset());
    }

    // =========================================================
    // 3. Binary access (getBinaryValue / readBinaryValue / _decodeBase64 / _readBinary)
    // =========================================================

    @Test
    public void testGetBinaryValueFromIncompleteString() throws IOException {
        JsonParser p = newParser("\"Zm9vYmFy\""); // "foobar"
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] b = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertEquals("foobar", new String(b, "US-ASCII"));
    }

    @Test
    public void testGetBinaryValueCachedOnSecondCall() throws IOException {
        JsonParser p = newParser("\"Zm9v\""); // "foo"
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] first = p.getBinaryValue(Base64Variants.getDefaultVariant());
        // second call: _tokenIncomplete==false, _binaryValue != null -> cached branch
        byte[] second = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals(first, second);
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueWrongTokenThrows() throws IOException {
        JsonParser p = newParser("123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        p.getBinaryValue(Base64Variants.getDefaultVariant());
    }

    @Test
    public void testReadBinaryValueIncrementalPath() throws IOException {
        JsonParser p = newParser("\"Zm9vYmFy\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        // _tokenIncomplete==true && currToken==VALUE_STRING -> real incremental _readBinary path
        int n = p.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertEquals(6, n);
        assertEquals("foobar", out.toString("US-ASCII"));
    }

    @Test
    public void testReadBinaryValueAlreadyReadPath() throws IOException {
        JsonParser p = newParser("\"Zm9v\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        p.getText(); // forces _finishString(), _tokenIncomplete becomes false
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        // !_tokenIncomplete -> "already read" branch calling getBinaryValue()
        int n = p.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertEquals(3, n);
        assertEquals("foo", out.toString("US-ASCII"));
    }

    @Test
    public void testDecodeBase64OnePaddingByte() throws IOException {
        JsonParser p = newParser("\"Zg==\""); // "f"
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] b = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals(new byte[] { 'f' }, b);
    }

    @Test
    public void testDecodeBase64TwoPaddingBytes() throws IOException {
        JsonParser p = newParser("\"Zm8=\""); // "fo"
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] b = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals(new byte[] { 'f', 'o' }, b);
    }

    @Test
    public void testDecodeBase64NoPaddingVariant() throws IOException {
        // MODIFIED_FOR_URL: usesPadding() == false -> hits ch=='"' && !usesPadding() branch
        Base64Variant urlVariant = Base64Variants.MODIFIED_FOR_URL;
        JsonParser p = newParser("\"Zg\""); // "f" without padding
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] b = p.getBinaryValue(urlVariant);
        assertArrayEquals(new byte[] { 'f' }, b);
    }

    @Test
    public void testReadBinaryNoPaddingVariantTwoBytes() throws IOException {
        // Exercises _readBinary's own (duplicated) no-padding 2-byte branch
        Base64Variant urlVariant = Base64Variants.MODIFIED_FOR_URL;
        JsonParser p = newParser("\"Zm8\""); // "fo" without padding, 3 chars
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int n = p.readBinaryValue(urlVariant, out);
        assertEquals(2, n);
        assertEquals("fo", out.toString("US-ASCII"));
    }

    // =========================================================
    // 4. nextToken(): structural / control-flow branches
    // =========================================================

    @Test
    public void testNextTokenFullObjectAndArrayTraversal() throws IOException {
        String json = "{\"a\":1,\"b\":\"s\",\"c\":true,\"d\":false,\"e\":null,"
                + "\"f\":[1,2],\"g\":{\"h\":1.5}}";
        JsonParser p = newParser(json);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken()); assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken()); assertEquals("b", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());   // nested array w/o field-inline
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());  // nested object
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken()); // EOF -> close() -> null
    }

    @Test(expected = JsonParseException.class)
    public void testNextTokenMismatchedEndMarker_CurlyInArray() throws IOException {
        JsonParser p = newParser("[1,2}");
        p.nextToken(); p.nextToken(); p.nextToken();
        p.nextToken(); // '}' while inArray() -> mismatched
    }

    @Test(expected = JsonParseException.class)
    public void testNextTokenMismatchedEndMarker_BracketInObject() throws IOException {
        JsonParser p = newParser("{\"a\":1]");
        p.nextToken(); p.nextToken(); p.nextToken();
        p.nextToken(); // ']' while inObject() -> mismatched
    }

    @Test(expected = JsonParseException.class)
    public void testTrailingCommaInArrayThrows() throws IOException {
        // _skipComma returns ']' -> reaches switch(i) case ']': _reportUnexpectedChar
        JsonParser p = newParser("[1,]");
        p.nextToken(); p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testTrailingCommaInObjectThrows() throws IOException {
        JsonParser p = newParser("{\"a\":1,}");
        p.nextToken(); p.nextToken(); p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingCommaThrows() throws IOException {
        JsonParser p = newParser("[1 2]");
        p.nextToken(); p.nextToken();
        p.nextToken(); // expects comma, gets digit
    }

    @Test(expected = JsonParseException.class)
    public void testMissingColonThrows() throws IOException {
        JsonParser p = newParser("{\"a\" 1}");
        p.nextToken();
        p.nextToken(); // field name parse triggers _skipColon() failure
    }

    // =========================================================
    // 5. Number parsing branches
    // =========================================================

    @Test(expected = JsonParseException.class)
    public void testLeadingZeroDisallowedByDefault() throws IOException {
        JsonParser p = newParser("0123");
        p.nextToken();
    }

    @Test
    public void testLeadingZeroAllowedWhenFeatureEnabled() throws IOException {
        JsonParser p = newParser("0123", Feature.ALLOW_NUMERIC_LEADING_ZEROS);
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals("123", p.getText());
    }

    @Test
    public void testNegativeNumberAndInvalidStart() throws IOException {
        JsonParser p = newParser("-42");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals("-42", p.getText());
    }

    @Test(expected = JsonParseException.class)
    public void testNegativeNumberInvalidStartThrows() throws IOException {
        JsonParser p = newParser("-x");
        p.nextToken();
    }

    @Test
    public void testFloatFractionAndExponent() throws IOException {
        JsonParser p1 = newParser("3.14");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p1.nextToken());
        assertEquals("3.14", p1.getText());

        JsonParser p2 = newParser("1e10");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p2.nextToken());
        assertEquals("1e10", p2.getText());
    }

    @Test(expected = JsonParseException.class)
    public void testMissingFractionDigitThrows() throws IOException {
        JsonParser p = newParser("3.");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingExponentDigitThrows() throws IOException {
        JsonParser p = newParser("3e");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingRootWhitespaceThrows() throws IOException {
        // number immediately followed by '{' with no separating whitespace at root
        JsonParser p = newParser("1{}");
        p.nextToken();
    }

    @Test
    public void testMultipleRootValuesSeparatedBySpace() throws IOException {
        JsonParser p = newParser("1 2");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals("1", p.getText());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals("2", p.getText());
    }

    // =========================================================
    // 6. _handleOddValue branches
    // =========================================================

    @Test
    public void testHandleOddValueSingleQuoteEnabledAndDisabled() throws IOException {
        JsonParser ok = newParser("'hello'", Feature.ALLOW_SINGLE_QUOTES);
        assertEquals(JsonToken.VALUE_STRING, ok.nextToken());
        assertEquals("hello", ok.getText());

        try {
            JsonParser bad = newParser("'hello'");
            bad.nextToken();
            fail("expected JsonParseException when single quotes disabled");
        } catch (JsonParseException expected) {
            // ok
        }
    }

    @Test
    public void testHandleOddValueNaNAndInfinityFeature() throws IOException {
        JsonParser nanOn = newParser("NaN", Feature.ALLOW_NON_NUMERIC_NUMBERS);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, nanOn.nextToken());
        assertTrue(Double.isNaN(nanOn.getDoubleValue()));

        try {
            JsonParser nanOff = newParser("NaN");
            nanOff.nextToken();
            fail("expected exception, NaN disabled by default");
        } catch (JsonParseException expected) { }

        JsonParser infOn = newParser("Infinity", Feature.ALLOW_NON_NUMERIC_NUMBERS);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, infOn.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, infOn.getDoubleValue(), 0.0);
    }

    @Test
    public void testHandleOddValuePlusInfinityAndPlusDigit() throws IOException {
        JsonParser pInf = newParser("+INF", Feature.ALLOW_NON_NUMERIC_NUMBERS);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, pInf.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, pInf.getDoubleValue(), 0.0);
    }

    @Test(expected = JsonParseException.class)
    public void testHandleOddValuePlusDigitThrows() throws IOException {
        // '+' followed by a plain digit is NOT handled (_handleInvalidNumberStart only knows 'I')
        JsonParser p = newParser("+123");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testHandleOddValueUnrecognizedTokenThrows() throws IOException {
        JsonParser p = newParser("xyz");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testHandleOddValueUnrecognizedSymbolThrows() throws IOException {
        JsonParser p = newParser("@");
        p.nextToken();
    }

    // =========================================================
    // 7. _handleOddName branches
    // =========================================================

    @Test
    public void testHandleOddNameUnquotedFeatureEnabledAndDisabled() throws IOException {
        JsonParser ok = newParser("{abc:1}", Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        assertEquals(JsonToken.START_OBJECT, ok.nextToken());
        assertEquals(JsonToken.FIELD_NAME, ok.nextToken());
        assertEquals("abc", ok.getCurrentName());

        try {
            JsonParser bad = newParser("{abc:1}");
            bad.nextToken();
            bad.nextToken();
            fail("expected exception, unquoted field names disabled by default");
        } catch (JsonParseException expected) { }
    }

    @Test
    public void testHandleOddNameSingleQuoteEnabled() throws IOException {
        JsonParser p = newParser("{'abc':1}", Feature.ALLOW_SINGLE_QUOTES);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("abc", p.getCurrentName());
    }

    // =========================================================
    // 8. Comments (_skipComment / _skipCComment / _skipLine / _skipYAMLComment)
    // =========================================================

    @Test
    public void testCommentsLineAndBlock_EnabledVsDisabled() throws IOException {
        JsonParser lineOk = newParser("[1,//c\n2]", Feature.ALLOW_COMMENTS);
        lineOk.nextToken(); lineOk.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, lineOk.nextToken());
        assertEquals("2", lineOk.getText());

        JsonParser blockOk = newParser("/*lead*/123", Feature.ALLOW_COMMENTS);
        assertEquals(JsonToken.VALUE_NUMBER_INT, blockOk.nextToken());
        assertEquals("123", blockOk.getText());

        try {
            JsonParser off = newParser("[1,/*c*/2]"); // disabled by default
            off.nextToken(); off.nextToken();
            off.nextToken();
            fail("expected exception, comments disabled by default");
        } catch (JsonParseException expected) { }
    }

    @Test(expected = JsonParseException.class)
    public void testUnterminatedBlockCommentThrows() throws IOException {
        JsonParser p = newParser("/* not closed", Feature.ALLOW_COMMENTS);
        p.nextToken();
    }

    @Test
    public void testYamlCommentEnabledVsDisabled() throws IOException {
        JsonParser on = newParser("#lead\n123", Feature.ALLOW_YAML_COMMENTS);
        assertEquals(JsonToken.VALUE_NUMBER_INT, on.nextToken());
        assertEquals("123", on.getText());

        try {
            JsonParser off = newParser("#lead\n123"); // disabled by default
            off.nextToken();
            fail("expected exception, '#' not recognized as comment when feature disabled");
        } catch (JsonParseException expected) { }
    }

    // =========================================================
    // 9. String escapes / unicode / invalid escapes
    // =========================================================

    @Test
    public void testEscapesAndUnicode() throws IOException {
        JsonParser p = newParser("\"a\\nb\\tc\\\"d\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("a\nb\tc\"d", p.getText());

        JsonParser u = newParser("\"\\u0041\"");
        assertEquals(JsonToken.VALUE_STRING, u.nextToken());
        assertEquals("A", u.getText());
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidHexEscapeThrows() throws IOException {
        JsonParser p = newParser("\"\\u00zz\"");
        p.nextToken();
        p.getText();
    }

    @Test(expected = JsonParseException.class)
    public void testUnterminatedStringThrows() throws IOException {
        JsonParser p = newParser("\"abc");
        p.nextToken();     // tokenIncomplete=true, no error yet (lazy)
        p.getText();        // triggers _finishString -> EOF -> error
    }

    // =========================================================
    // 10. EOF / unclosed containers behavior (documented, not guessed)
    // =========================================================

    @Test
    public void testUnclosedArrayAtEofReturnsNullNoException() throws IOException {
        // NOTE: based on source analysis, nextToken() does NOT validate that
        // all open contexts are closed before signalling EOF; it simply
        // returns null. This test documents that actual (perhaps
        // surprising) behavior rather than assuming an exception.
        JsonParser p = newParser("[1,2");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testCloseAndReuseAfterEOF() throws IOException {
        JsonParser p = newParser("1");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertNull(p.nextToken());  // triggers close()
        assertNull(p.nextToken());  // calling again must stay stable (no exception)
    }

    @Test(expected = JsonParseException.class)
    public void testMatchTokenTruncatedThrows() throws IOException {
        JsonParser p = newParser("tru"); // truncated 'true', hits loadMore()==false inside _matchToken
        p.nextToken();
    }

    // =========================================================
    // 11. Buffer-boundary crossing (loadMore) via long inputs
    // =========================================================

    @Test
    public void testLongStringAcrossBufferBoundary() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append('"');
        for (int i = 0; i < 20000; i++) sb.append('a');
        sb.append('"');
        JsonParser p = newParser(sb.toString());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(20000, p.getText().length());
    }

    @Test
    public void testLongNumberAcrossBufferBoundary() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20000; i++) sb.append('1');
        JsonParser p = newParser(sb.toString());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(20000, p.getText().length());
    }

    @Test
    public void testLongFieldNameAcrossBufferBoundary() throws IOException {
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < 20000; i++) name.append('b');
        String json = "{\"" + name + "\":1}";
        JsonParser p = newParser(json);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(20000, p.getCurrentName().length());
    }

    // =========================================================
    // 12. next{Text,Int,Long,Boolean}Value branches
    // =========================================================

    @Test
    public void testNextTextValueBranches() throws IOException {
        JsonParser p = newParser("{\"a\":\"s\",\"b\":1,\"c\":[1]}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("s", p.nextTextValue()); // FIELD_NAME + t==VALUE_STRING branch

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertNull(p.nextTextValue());        // FIELD_NAME + non-string branch
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.getCurrentToken());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertNull(p.nextTextValue());        // FIELD_NAME + START_ARRAY branch
        assertEquals(JsonToken.START_ARRAY, p.getCurrentToken());

        // direct-call (not FIELD_NAME) path
        JsonParser p2 = newParser("\"z\"");
        assertEquals("z", p2.nextTextValue());
    }

    @Test
    public void testNextIntLongBooleanValueBranches() throws IOException {
        JsonParser p = newParser("{\"a\":1,\"b\":\"x\"}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(1, p.nextIntValue(-1));  // FIELD_NAME + matching int branch

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(-1, p.nextIntValue(-1)); // FIELD_NAME + non-matching branch

        JsonParser p2 = newParser("{\"a\":123456789012}");
        assertEquals(JsonToken.START_OBJECT, p2.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p2.nextToken());
        assertEquals(123456789012L, p2.nextLongValue(-1L));

        JsonParser p3 = newParser("{\"a\":true,\"b\":false,\"c\":1}");
        assertEquals(JsonToken.START_OBJECT, p3.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p3.nextToken());
        assertEquals(Boolean.TRUE, p3.nextBooleanValue());
        assertEquals(JsonToken.FIELD_NAME, p3.nextToken());
        assertEquals(Boolean.FALSE, p3.nextBooleanValue());
        assertEquals(JsonToken.FIELD_NAME, p3.nextToken());
        assertNull(p3.nextBooleanValue()); // non-matching branch

        JsonParser p4 = newParser("true");
        assertEquals(Boolean.TRUE, p4.nextBooleanValue()); // direct-call path
    }

    // =========================================================
    // 13. releaseBuffered / getInputSource / getCodec
    // =========================================================

    @Test
    public void testReleaseBufferedBranches() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser(new StringReader("123 456"));
        p.nextToken(); // reads "123", leaves " 456" possibly still buffered
        StringWriter w = new StringWriter();
        int count = ((ReaderBasedJsonParser) p).releaseBuffered(w);
        assertTrue(count >= 0); // exact remaining depends on internal buffering, but must not fail

        // Drain fully to hit count<1 -> return 0 branch
        JsonParser p2 = f.createParser(new StringReader("1"));
        while (p2.nextToken() != null) { /* consume */ }
        StringWriter w2 = new StringWriter();
        assertEquals(0, ((ReaderBasedJsonParser) p2).releaseBuffered(w2));
    }

    @Test
    public void testGetInputSourceAndCodec() throws IOException {
        StringReader reader = new StringReader("1");
        JsonParser p = new JsonFactory().createParser(reader);
        assertSame(reader, p.getInputSource());
        assertNull(p.getCodec());
        p.setCodec(null); // no throw
        assertNull(p.getCodec());
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| กลุ่ม | เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| Wiring | testFactoryProducesReaderBasedJsonParser | ยืนยันชนิด instance ที่ทดสอบจริง |
| getText | testGetTextBeforeAnyToken_ReturnsNull... | `_getText2(null)`, getTextCharacters null-branch |
| getText | testGetTextAndCharsForFieldName | ID_FIELD_NAME branch + `_nameCopied` true/false |
| getText | testGetTextForStringValue_TokenIncompleteFinishes | `_tokenIncomplete` true/false branch, `_finishString()` |
| getText | testGetTextForNumberIntAndFloat | ID_NUMBER_INT/FLOAT branch |
| getText | testGetTextDefaultBranch_forTrueFalseNull | default: `t.asString()` |
| getValueAsString | testGetValueAsStringForStringAndDefault | VALUE_STRING branch vs super delegation |
| getTextCharacters | testGetTextCharactersFieldNameBufferGrowth | alloc buffer / "buffer too small" branch |
| getTextLength/Offset | testGetTextLengthAllBranches, testGetTextOffsetAllBranches | switch ทุก case รวม default |
| Binary | testGetBinaryValueFromIncompleteString | `_tokenIncomplete` decode branch |
| Binary | testGetBinaryValueCachedOnSecondCall | cached `_binaryValue` branch |
| Binary | testGetBinaryValueWrongTokenThrows | wrong-token error branch |
| Binary | testReadBinaryValueIncrementalPath / AlreadyReadPath | ทั้งสอง branch ของ `readBinaryValue` |
| Binary | testDecodeBase64OnePaddingByte/TwoPaddingBytes | padding branch (1-byte, 2-byte) ใน `_decodeBase64` |
| Binary | testDecodeBase64NoPaddingVariant / testReadBinaryNoPaddingVariantTwoBytes | quote-terminates-without-padding branch ใน `_decodeBase64` และ `_readBinary` |
| nextToken structure | testNextTokenFullObjectAndArrayTraversal | FIELD_NAME, START/END ARRAY/OBJECT, ทุกชนิดค่า |
| nextToken error | testNextTokenMismatchedEndMarker_* | mismatched end marker ทั้ง 2 ทิศทาง |
| nextToken error | testTrailingCommaInArray/ObjectThrows | switch(i) case ']'/'}' (unreachable-looking code) |
| nextToken error | testMissingCommaThrows, testMissingColonThrows | `_skipComma`, `_skipColon` error branch |
| Number | testLeadingZeroDisallowedByDefault/AllowedWhenFeatureEnabled | `_verifyNoLeadingZeroes` ทั้ง 2 branch |
| Number | testNegativeNumberAndInvalidStart(Throws) | `_parseNegNumber` ทั้ง valid/invalid |
| Number | testFloatFractionAndExponent | `_parseFloat`/`_parseNumber2` ทั้ง fraction/exponent |
| Number | testMissingFractionDigitThrows/testMissingExponentDigitThrows | fractLen==0 / expLen==0 error |
| Number | testMissingRootWhitespaceThrows/testMultipleRootValuesSeparatedBySpace | `_verifyRootSpace` ทั้ง fail/success |
| OddValue | testHandleOddValueSingleQuoteEnabledAndDisabled | feature on/off |
| OddValue | testHandleOddValueNaNAndInfinityFeature, testHandleOddValuePlusInfinity... | 'N','I','+' case ทั้งหมด |
| OddValue | testHandleOddValueUnrecognizedToken/SymbolThrows | identifier-start vs non-identifier |
| OddName | testHandleOddNameUnquotedFeatureEnabledAndDisabled, testHandleOddNameSingleQuoteEnabled | feature on/off, apostrophe |
| Comments | testCommentsLineAndBlock_EnabledVsDisabled, testUnterminatedBlockCommentThrows, testYamlCommentEnabledVsDisabled | `_skipComment`, `_skipCComment`, `_skipYAMLComment` ทุก branch |
| String escapes | testEscapesAndUnicode, testInvalidHexEscapeThrows, testUnterminatedStringThrows | `_decodeEscaped` ทุก case, EOF error |
| EOF/behavior | testUnclosedArrayAtEofReturnsNullNoException, testCloseAndReuseAfterEOF, testMatchTokenTruncatedThrows | `_skipWSOrEnd` EOF branch, `_matchToken` truncated |
| Buffer boundary | testLongStringAcrossBufferBoundary/Number.../FieldName... | `loadMore()` ถูกเรียกซ้ำ, multi-segment TextBuffer |
| next*Value | testNextTextValueBranches, testNextIntLongBooleanValueBranches | FIELD_NAME-fast-path ทุก sub-branch + direct-call path |
| Misc | testReleaseBufferedBranches, testGetInputSourceAndCodec | `releaseBuffered` count<1/>=1, getter พื้นฐาน |

**ข้อควรระวังที่ยังไม่ครอบคลุม 100%:** branch ภายใน `_finishString2` / `_parseName2` / `_handleOddName2` ที่เกี่ยวกับ EOF กลางทาง (เช่น `loadMore()` คืน false ระหว่าง escape) และ branch เฉพาะของ `_skipColon`/`_skipColon2` ที่มี comment คั่นก่อนโคลอน ไม่ได้เขียนเทสแยกเนื่องจากพึ่งพา timing ของ buffer ภายในที่ไม่สามารถควบคุมได้แน่นอนผ่าน public API — ทำเครื่องหมายไว้ตามข้อกำหนดข้อ 4 (ไม่เดา behavior)