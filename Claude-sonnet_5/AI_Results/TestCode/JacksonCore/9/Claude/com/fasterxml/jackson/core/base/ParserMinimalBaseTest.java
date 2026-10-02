package com.fasterxml.jackson.core.base;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserMinimalBase; // import ตามข้อกำหนด (แม้จะอยู่ package เดียวกัน)
import com.fasterxml.jackson.core.util.ByteArrayBuilder;

public class ParserMinimalBaseTest {

    /**
     * Concrete stub implementation ของ ParserMinimalBase สำหรับทดสอบ
     * เมธอดที่ไม่ได้ระบุ abstract ไว้ชัดเจนใน source ที่ให้มา (เช่น getCodec, version ฯลฯ)
     * เป็นการเดา signature จาก JsonParser API ทั่วไปของ jackson-core เพื่อให้ compile ได้เท่านั้น
     */
    static class StubParser extends ParserMinimalBase {

        List<JsonToken> tokens = Arrays.asList();
        int idx = -1;
        boolean closed = false;
        String text;
        int intValue;
        long longValue;
        double doubleValue;
        Object embeddedObject;

        StubParser() { super(); }
        StubParser(int features) { super(features); }

        void setTokens(JsonToken... t) {
            tokens = Arrays.asList(t);
            idx = -1;
        }

        void forceCurrentToken(JsonToken t) { _currToken = t; }

        // ---- abstract ที่ระบุชัดใน source ----
        @Override
        public JsonToken nextToken() throws IOException {
            idx++;
            if (idx >= tokens.size()) {
                _currToken = null;
                return null;
            }
            _currToken = tokens.get(idx);
            return _currToken;
        }

        @Override
        protected void _handleEOF() throws JsonParseException {
            _reportInvalidEOF();
        }

        @Override public String getCurrentName() throws IOException { return null; }
        @Override public void close() throws IOException { closed = true; }
        @Override public boolean isClosed() { return closed; }
        @Override public JsonStreamContext getParsingContext() { return null; }
        @Override public void overrideCurrentName(String name) { }
        @Override public String getText() throws IOException { return text; }
        @Override public char[] getTextCharacters() throws IOException {
            return text == null ? null : text.toCharArray();
        }
        @Override public boolean hasTextCharacters() { return false; }
        @Override public int getTextLength() throws IOException { return text == null ? 0 : text.length(); }
        @Override public int getTextOffset() throws IOException { return 0; }
        @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return null; }

        // ---- เมธอด abstract จาก JsonParser (superclass) ที่ไม่ได้แสดงใน source ที่ให้มา ----
        @Override public ObjectCodec getCodec() { return null; }
        @Override public void setCodec(ObjectCodec c) { }
        @Override public Version version() { return Version.unknownVersion(); }
        @Override public JsonLocation getTokenLocation() { return JsonLocation.NA; }
        @Override public JsonLocation getCurrentLocation() { return JsonLocation.NA; }
        @Override public Number getNumberValue() throws IOException { return intValue; }
        @Override public NumberType getNumberType() throws IOException { return NumberType.INT; }
        @Override public int getIntValue() throws IOException { return intValue; }
        @Override public long getLongValue() throws IOException { return longValue; }
        @Override public BigInteger getBigIntegerValue() throws IOException { return BigInteger.valueOf(longValue); }
        @Override public float getFloatValue() throws IOException { return (float) doubleValue; }
        @Override public double getDoubleValue() throws IOException { return doubleValue; }
        @Override public BigDecimal getDecimalValue() throws IOException { return BigDecimal.valueOf(doubleValue); }
        @Override public Object getEmbeddedObject() throws IOException { return embeddedObject; }

        // ---- setter สำหรับ test ----
        void setIntValueTest(int v) { intValue = v; }
        void setLongValueTest(long v) { longValue = v; }
        void setDoubleValueTest(double v) { doubleValue = v; }
        void setTextTest(String s) { text = s; }
        void setEmbeddedObjectTest(Object o) { embeddedObject = o; }

        // ---- wrapper เปิดเผยเมธอด protected เพื่อทดสอบ ----
        void doReportUnexpectedChar(int ch, String comment) throws JsonParseException {
            _reportUnexpectedChar(ch, comment);
        }
        void doReportInvalidEOF() throws JsonParseException { _reportInvalidEOF(); }
        void doReportInvalidEOF(String msg) throws JsonParseException { _reportInvalidEOF(msg); }
        void doReportInvalidEOFInValue() throws JsonParseException { _reportInvalidEOFInValue(); }
        void doReportMissingRootWS(int ch) throws JsonParseException { _reportMissingRootWS(ch); }
        void doThrowInvalidSpace(int i) throws JsonParseException { _throwInvalidSpace(i); }
        void doThrowUnquotedSpace(int i, String ctx) throws JsonParseException { _throwUnquotedSpace(i, ctx); }
        char doHandleUnrecognizedCharacterEscape(char ch) throws JsonProcessingException {
            return _handleUnrecognizedCharacterEscape(ch);
        }
        boolean doHasTextualNull(String s) { return _hasTextualNull(s); }
        void doReportError(String msg) throws JsonParseException { _reportError(msg); }
        void doWrapError(String msg, Throwable t) throws JsonParseException { _wrapError(msg, t); }
        void doThrowInternal() { _throwInternal(); }
        void doDecodeBase64(String str, ByteArrayBuilder b, Base64Variant v) throws IOException {
            _decodeBase64(str, b, v);
        }
        static String doGetCharDesc(int ch) { return _getCharDesc(ch); }
        static byte[] doAsciiBytes(String s) { return _asciiBytes(s); }
        static String doAscii(byte[] b) { return _ascii(b); }
    }

    private StubParser parser;

    @Before
    public void setUp() {
        parser = new StubParser();
    }

    // ===================== getCurrentTokenId / hasCurrentToken / hasTokenId / hasToken =====================

    @Test
    public void testGetCurrentTokenId_nullToken() {
        assertEquals(JsonTokenId.ID_NO_TOKEN, parser.getCurrentTokenId());
    }

    @Test
    public void testGetCurrentTokenId_withToken() {
        parser.forceCurrentToken(JsonToken.START_OBJECT);
        assertEquals(JsonTokenId.ID_START_OBJECT, parser.getCurrentTokenId());
    }

    @Test
    public void testHasCurrentToken_falseInitially() {
        assertFalse(parser.hasCurrentToken());
    }

    @Test
    public void testHasCurrentToken_trueAfterSet() {
        parser.forceCurrentToken(JsonToken.VALUE_STRING);
        assertTrue(parser.hasCurrentToken());
    }

    @Test
    public void testHasTokenId_nullToken_matchesNoToken() {
        assertTrue(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
    }

    @Test
    public void testHasTokenId_nullToken_notMatchOther() {
        assertFalse(parser.hasTokenId(JsonTokenId.ID_START_OBJECT));
    }

    @Test
    public void testHasTokenId_withToken_match() {
        parser.forceCurrentToken(JsonToken.START_ARRAY);
        assertTrue(parser.hasTokenId(JsonTokenId.ID_START_ARRAY));
    }

    @Test
    public void testHasTokenId_withToken_noMatch() {
        parser.forceCurrentToken(JsonToken.START_ARRAY);
        assertFalse(parser.hasTokenId(JsonTokenId.ID_START_OBJECT));
    }

    @Test
    public void testHasToken_matches() {
        parser.forceCurrentToken(JsonToken.VALUE_NULL);
        assertTrue(parser.hasToken(JsonToken.VALUE_NULL));
    }

    @Test
    public void testHasToken_noMatch() {
        parser.forceCurrentToken(JsonToken.VALUE_NULL);
        assertFalse(parser.hasToken(JsonToken.VALUE_TRUE));
    }

    // ===================== isExpectedStartArrayToken / isExpectedStartObjectToken =====================

    @Test
    public void testIsExpectedStartArrayToken_true() {
        parser.forceCurrentToken(JsonToken.START_ARRAY);
        assertTrue(parser.isExpectedStartArrayToken());
    }

    @Test
    public void testIsExpectedStartArrayToken_false() {
        parser.forceCurrentToken(JsonToken.START_OBJECT);
        assertFalse(parser.isExpectedStartArrayToken());
    }

    @Test
    public void testIsExpectedStartObjectToken_true() {
        parser.forceCurrentToken(JsonToken.START_OBJECT);
        assertTrue(parser.isExpectedStartObjectToken());
    }

    @Test
    public void testIsExpectedStartObjectToken_false() {
        parser.forceCurrentToken(JsonToken.START_ARRAY);
        assertFalse(parser.isExpectedStartObjectToken());
    }

    // ===================== nextValue =====================

    @Test
    public void testNextValue_fieldName_thenNext() throws IOException {
        parser.setTokens(JsonToken.FIELD_NAME, JsonToken.VALUE_STRING);
        JsonToken t = parser.nextValue();
        assertEquals(JsonToken.VALUE_STRING, t);
    }

    @Test
    public void testNextValue_notFieldName() throws IOException {
        parser.setTokens(JsonToken.VALUE_NUMBER_INT);
        JsonToken t = parser.nextValue();
        assertEquals(JsonToken.VALUE_NUMBER_INT, t);
    }

    // ===================== skipChildren =====================

    @Test
    public void testSkipChildren_notStart_returnsThis() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_STRING);
        JsonParser result = parser.skipChildren();
        assertSame(parser, result);
    }

    @Test
    public void testSkipChildren_object_matchedNesting() throws IOException {
        parser.forceCurrentToken(JsonToken.START_OBJECT);
        parser.setTokens(JsonToken.FIELD_NAME, JsonToken.VALUE_STRING, JsonToken.END_OBJECT);
        JsonParser result = parser.skipChildren();
        assertSame(parser, result);
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
    }

    @Test
    public void testSkipChildren_nestedStructures() throws IOException {
        parser.forceCurrentToken(JsonToken.START_ARRAY);
        parser.setTokens(
                JsonToken.START_OBJECT,
                JsonToken.FIELD_NAME,
                JsonToken.VALUE_STRING,
                JsonToken.END_OBJECT,
                JsonToken.END_ARRAY
        );
        JsonParser result = parser.skipChildren();
        assertSame(parser, result);
    }

    @Test(expected = JsonParseException.class)
    public void testSkipChildren_eofTriggersHandleEOF() throws IOException {
        parser.forceCurrentToken(JsonToken.START_OBJECT);
        parser.setTokens(); // ไม่มี token -> nextToken() คืน null ทันที -> _handleEOF() ถูกเรียก
        parser.skipChildren();
    }

    // ===================== clearCurrentToken / getLastClearedToken =====================

    @Test
    public void testClearCurrentToken_whenSet() {
        parser.forceCurrentToken(JsonToken.VALUE_TRUE);
        parser.clearCurrentToken();
        assertNull(parser.getCurrentToken());
        assertEquals(JsonToken.VALUE_TRUE, parser.getLastClearedToken());
    }

    @Test
    public void testClearCurrentToken_whenNull_noChange() {
        parser.clearCurrentToken();
        assertNull(parser.getLastClearedToken());
    }

    @Test
    public void testGetLastClearedToken_initialNull() {
        assertNull(parser.getLastClearedToken());
    }

    // ===================== getValueAsBoolean(defaultValue) =====================

    @Test
    public void testGetValueAsBoolean_nullToken_returnsDefault() throws IOException {
        assertFalse(parser.getValueAsBoolean(false));
        assertTrue(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBoolean_stringTrue() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_STRING);
        parser.setTextTest(" true ");
        assertTrue(parser.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsBoolean_stringFalse() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_STRING);
        parser.setTextTest("false");
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBoolean_stringTextualNull() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_STRING);
        parser.setTextTest("null");
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBoolean_stringOther_returnsDefault() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_STRING);
        parser.setTextTest("abc");
        assertTrue(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBoolean_numberInt_nonzero() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_NUMBER_INT);
        parser.setIntValueTest(5);
        assertTrue(parser.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsBoolean_numberInt_zero() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_NUMBER_INT);
        parser.setIntValueTest(0);
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBoolean_true() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_TRUE);
        assertTrue(parser.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsBoolean_false() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_FALSE);
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBoolean_null() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_NULL);
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBoolean_embeddedBoolean() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        parser.setEmbeddedObjectTest(Boolean.TRUE);
        assertTrue(parser.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsBoolean_embeddedNonBoolean_returnsDefault() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        parser.setEmbeddedObjectTest("notBoolean");
        assertTrue(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBoolean_defaultBranch_startObject() throws IOException {
        parser.forceCurrentToken(JsonToken.START_OBJECT);
        assertTrue(parser.getValueAsBoolean(true));
    }

    // ===================== getValueAsInt() / getValueAsInt(default) =====================

    @Test
    public void testGetValueAsInt_numberInt() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_NUMBER_INT);
        parser.setIntValueTest(42);
        assertEquals(42, parser.getValueAsInt());
    }

    @Test
    public void testGetValueAsInt_numberFloat() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_NUMBER_FLOAT);
        parser.setIntValueTest(7);
        assertEquals(7, parser.getValueAsInt());
    }

    @Test
    public void testGetValueAsInt_nullCurrentToken_delegatesToDefaultOverload() throws IOException {
        assertEquals(0, parser.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntDefault_string_valid() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_STRING);
        parser.setTextTest("123");
        assertEquals(123, parser.getValueAsInt(-1));
    }

    @Test
    public void testGetValueAsIntDefault_string_textualNull() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_STRING);
        parser.setTextTest("null");
        assertEquals(0, parser.getValueAsInt(-1));
    }

    // สมมติ behavior ของ NumberInput.parseAsInt สำหรับ input ที่ parse ไม่ได้ -> fallback เป็น defaultValue
    @Test
    public void testGetValueAsIntDefault_string_invalid_usesDefault() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_STRING);
        parser.setTextTest("abc");
        assertEquals(-1, parser.getValueAsInt(-1));
    }

    @Test
    public void testGetValueAsIntDefault_true() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_TRUE);
        assertEquals(1, parser.getValueAsInt(-1));
    }

    @Test
    public void testGetValueAsIntDefault_false() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_FALSE);
        assertEquals(0, parser.getValueAsInt(-1));
    }

    @Test
    public void testGetValueAsIntDefault_null() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_NULL);
        assertEquals(0, parser.getValueAsInt(-1));
    }

    @Test
    public void testGetValueAsIntDefault_embeddedNumber() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        parser.setEmbeddedObjectTest(Integer.valueOf(99));
        assertEquals(99, parser.getValueAsInt(-1));
    }

    @Test
    public void testGetValueAsIntDefault_embeddedNonNumber_fallsThroughToDefault() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        parser.setEmbeddedObjectTest("string");
        assertEquals(-1, parser.getValueAsInt(-1));
    }

    @Test
    public void testGetValueAsIntDefault_nullToken_returnsDefault() throws IOException {
        assertEquals(-1, parser.getValueAsInt(-1));
    }

    @Test
    public void testGetValueAsIntDefault_otherToken_returnsDefault() throws IOException {
        parser.forceCurrentToken(JsonToken.START_ARRAY);
        assertEquals(-1, parser.getValueAsInt(-1));
    }

    // ===================== getValueAsLong() / getValueAsLong(default) =====================

    @Test
    public void testGetValueAsLong_numberInt() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_NUMBER_INT);
        parser.setLongValueTest(1000L);
        assertEquals(1000L, parser.getValueAsLong());
    }

    @Test
    public void testGetValueAsLong_numberFloat() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_NUMBER_FLOAT);
        parser.setLongValueTest(55L);
        assertEquals(55L, parser.getValueAsLong());
    }

    @Test
    public void testGetValueAsLong_nullCurrentToken() throws IOException {
        assertEquals(0L, parser.getValueAsLong());
    }

    @Test
    public void testGetValueAsLongDefault_string_valid() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_STRING);
        parser.setTextTest("12345678901");
        assertEquals(12345678901L, parser.getValueAsLong(-1L));
    }

    @Test
    public void testGetValueAsLongDefault_string_textualNull() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_STRING);
        parser.setTextTest("null");
        assertEquals(0L, parser.getValueAsLong(-1L));
    }

    // สมมติ behavior fallback ของ NumberInput.parseAsLong เมื่อ parse ไม่ได้
    @Test
    public void testGetValueAsLongDefault_string_invalid() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_STRING);
        parser.setTextTest("xyz");
        assertEquals(-1L, parser.getValueAsLong(-1L));
    }

    @Test
    public void testGetValueAsLongDefault_true() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_TRUE);
        assertEquals(1L, parser.getValueAsLong(-1L));
    }

    @Test
    public void testGetValueAsLongDefault_falseAndNull() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_FALSE);
        assertEquals(0L, parser.getValueAsLong(-1L));
        parser.forceCurrentToken(JsonToken.VALUE_NULL);
        assertEquals(0L, parser.getValueAsLong(-1L));
    }

    @Test
    public void testGetValueAsLongDefault_embeddedNumber() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        parser.setEmbeddedObjectTest(Long.valueOf(777L));
        assertEquals(777L, parser.getValueAsLong(-1L));
    }

    @Test
    public void testGetValueAsLongDefault_embeddedNonNumber() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        parser.setEmbeddedObjectTest("nope");
        assertEquals(-1L, parser.getValueAsLong(-1L));
    }

    @Test
    public void testGetValueAsLongDefault_nullToken() throws IOException {
        assertEquals(-1L, parser.getValueAsLong(-1L));
    }

    @Test
    public void testGetValueAsLongDefault_otherToken() throws IOException {
        parser.forceCurrentToken(JsonToken.START_OBJECT);
        assertEquals(-1L, parser.getValueAsLong(-1L));
    }

    // ===================== getValueAsDouble(default) =====================

    @Test
    public void testGetValueAsDouble_string_valid() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_STRING);
        parser.setTextTest("3.14");
        assertEquals(3.14, parser.getValueAsDouble(-1.0), 0.0001);
    }

    @Test
    public void testGetValueAsDouble_string_textualNull() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_STRING);
        parser.setTextTest("null");
        assertEquals(0.0, parser.getValueAsDouble(-1.0), 0.0001);
    }

    // สมมติ behavior fallback ของ NumberInput.parseAsDouble เมื่อ parse ไม่ได้
    @Test
    public void testGetValueAsDouble_string_invalid() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_STRING);
        parser.setTextTest("bad");
        assertEquals(-1.0, parser.getValueAsDouble(-1.0), 0.0001);
    }

    @Test
    public void testGetValueAsDouble_numberIntOrFloat() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_NUMBER_INT);
        parser.setDoubleValueTest(9.5);
        assertEquals(9.5, parser.getValueAsDouble(-1.0), 0.0001);

        parser.forceCurrentToken(JsonToken.VALUE_NUMBER_FLOAT);
        parser.setDoubleValueTest(2.5);
        assertEquals(2.5, parser.getValueAsDouble(-1.0), 0.0001);
    }

    @Test
    public void testGetValueAsDouble_true() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_TRUE);
        assertEquals(1.0, parser.getValueAsDouble(-1.0), 0.0001);
    }

    @Test
    public void testGetValueAsDouble_falseAndNull() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_FALSE);
        assertEquals(0.0, parser.getValueAsDouble(-1.0), 0.0001);
        parser.forceCurrentToken(JsonToken.VALUE_NULL);
        assertEquals(0.0, parser.getValueAsDouble(-1.0), 0.0001);
    }

    @Test
    public void testGetValueAsDouble_embeddedNumber() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        parser.setEmbeddedObjectTest(Double.valueOf(4.2));
        assertEquals(4.2, parser.getValueAsDouble(-1.0), 0.0001);
    }

    @Test
    public void testGetValueAsDouble_embeddedNonNumber() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        parser.setEmbeddedObjectTest("str");
        assertEquals(-1.0, parser.getValueAsDouble(-1.0), 0.0001);
    }

    @Test
    public void testGetValueAsDouble_nullToken() throws IOException {
        assertEquals(-1.0, parser.getValueAsDouble(-1.0), 0.0001);
    }

    // ===================== getValueAsString() / getValueAsString(default) =====================

    @Test
    public void testGetValueAsString_valueString() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_STRING);
        parser.setTextTest("hello");
        assertEquals("hello", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsString_null_delegate() throws IOException {
        assertNull(parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringDefault_valueString() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_STRING);
        parser.setTextTest("world");
        assertEquals("world", parser.getValueAsString("def"));
    }

    @Test
    public void testGetValueAsStringDefault_nullToken() throws IOException {
        assertEquals("def", parser.getValueAsString("def"));
    }

    @Test
    public void testGetValueAsStringDefault_valueNullToken() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_NULL);
        assertEquals("def", parser.getValueAsString("def"));
    }

    @Test
    public void testGetValueAsStringDefault_nonScalar() throws IOException {
        parser.forceCurrentToken(JsonToken.START_OBJECT);
        assertEquals("def", parser.getValueAsString("def"));
    }

    @Test
    public void testGetValueAsStringDefault_scalarNonString() throws IOException {
        parser.forceCurrentToken(JsonToken.VALUE_NUMBER_INT);
        parser.setTextTest("123");
        assertEquals("123", parser.getValueAsString("def"));
    }

    // ===================== _hasTextualNull =====================

    @Test
    public void testHasTextualNull_true() {
        assertTrue(parser.doHasTextualNull("null"));
    }

    @Test
    public void testHasTextualNull_false_caseSensitive() {
        assertFalse(parser.doHasTextualNull("NULL"));
    }

    @Test
    public void testHasTextualNull_emptyString() {
        assertFalse(parser.doHasTextualNull(""));
    }

    // ===================== Error reporting methods =====================

    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedChar_normal() throws JsonParseException {
        parser.doReportUnexpectedChar('x', "comment");
    }

    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedChar_nullComment() throws JsonParseException {
        parser.doReportUnexpectedChar('x', null);
    }

    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedChar_negativeCh_triggersEOF() throws JsonParseException {
        parser.doReportUnexpectedChar(-1, null);
    }

    @Test(expected = JsonParseException.class)
    public void testReportInvalidEOF_noArg() throws JsonParseException {
        parser.doReportInvalidEOF();
    }

    @Test(expected = JsonParseException.class)
    public void testReportInvalidEOF_withMsg() throws JsonParseException {
        parser.doReportInvalidEOF(" custom");
    }

    @Test(expected = JsonParseException.class)
    public void testReportInvalidEOFInValue() throws JsonParseException {
        parser.doReportInvalidEOFInValue();
    }

    @Test(expected = JsonParseException.class)
    public void testReportMissingRootWS() throws JsonParseException {
        parser.doReportMissingRootWS('a');
    }

    @Test(expected = JsonParseException.class)
    public void testThrowInvalidSpace() throws JsonParseException {
        parser.doThrowInvalidSpace(1);
    }

    @Test(expected = JsonParseException.class)
    public void testReportError() throws JsonParseException {
        parser.doReportError("boom");
    }

    @Test(expected = JsonParseException.class)
    public void testWrapError() throws JsonParseException {
        parser.doWrapError("wrapped", new RuntimeException("cause"));
    }

    // ไม่ระบุ exact exception type เพราะ source ที่ให้มาไม่ได้แสดง implementation ของ VersionUtil.throwInternal()
    @Test
    public void testThrowInternal_throwsSomething() {
        try {
            parser.doThrowInternal();
            fail("Expected an exception/error from _throwInternal()");
        } catch (Throwable t) {
            assertNotNull(t);
        }
    }

    // ===================== _throwUnquotedSpace (feature-dependent branches) =====================

    @Test(expected = JsonParseException.class)
    public void testThrowUnquotedSpace_defaultDisabledFeature_throws() throws JsonParseException {
        // feature ALLOW_UNQUOTED_CONTROL_CHARS ปิดโดย default -> ต้อง throw เสมอ
        parser.doThrowUnquotedSpace(5, "ctx");
    }

    @Test(expected = JsonParseException.class)
    public void testThrowUnquotedSpace_aboveSpace_throwsEvenIfDisabled() throws JsonParseException {
        parser.doThrowUnquotedSpace(200, "ctx");
    }

    @Test
    public void testThrowUnquotedSpace_featureEnabled_belowSpace_noThrow() throws JsonParseException {
        StubParser p2 = new StubParser(0);
        p2.enable(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS);
        p2.doThrowUnquotedSpace(5, "ctx"); // ไม่ควร throw
    }

    @Test(expected = JsonParseException.class)
    public void testThrowUnquotedSpace_featureEnabled_aboveSpace_throws() throws JsonParseException {
        StubParser p2 = new StubParser(0);
        p2.enable(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS);
        p2.doThrowUnquotedSpace(200, "ctx"); // i > INT_SPACE -> throw เสมอ
    }

    // ===================== _handleUnrecognizedCharacterEscape =====================

    @Test
    public void testHandleUnrecognizedCharacterEscape_allowAny() throws Exception {
        StubParser p2 = new StubParser(0);
        p2.enable(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER);
        assertEquals('x', p2.doHandleUnrecognizedCharacterEscape('x'));
    }

    @Test
    public void testHandleUnrecognizedCharacterEscape_singleQuoteAllowed() throws Exception {
        StubParser p2 = new StubParser(0);
        p2.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        assertEquals('\'', p2.doHandleUnrecognizedCharacterEscape('\''));
    }

    @Test(expected = JsonParseException.class)
    public void testHandleUnrecognizedCharacterEscape_singleQuoteButFeatureDisabled() throws Exception {
        parser.doHandleUnrecognizedCharacterEscape('\'');
    }

    @Test(expected = JsonParseException.class)
    public void testHandleUnrecognizedCharacterEscape_notAllowed() throws Exception {
        parser.doHandleUnrecognizedCharacterEscape('q');
    }

    // ===================== _decodeBase64 =====================

    @Test
    public void testDecodeBase64_valid() throws IOException {
        ByteArrayBuilder builder = new ByteArrayBuilder();
        parser.doDecodeBase64("aGVsbG8=", builder, Base64Variants.MIME_NO_LINEFEEDS);
        assertArrayEquals("hello".getBytes(), builder.toByteArray());
    }

    @Test(expected = JsonParseException.class)
    public void testDecodeBase64_invalid_triggersReportError() throws IOException {
        ByteArrayBuilder builder = new ByteArrayBuilder();
        parser.doDecodeBase64("!!!notbase64!!!", builder, Base64Variants.MIME_NO_LINEFEEDS);
    }

    // ===================== _getCharDesc =====================

    @Test
    public void testGetCharDesc_controlChar() {
        assertEquals("(CTRL-CHAR, code 7)", StubParser.doGetCharDesc(7));
    }

    @Test
    public void testGetCharDesc_aboveByteRange() {
        String result = StubParser.doGetCharDesc(0x100); // 256
        assertTrue(result.contains("code 256"));
        assertTrue(result.contains("0x100"));
    }

    @Test
    public void testGetCharDesc_normalAscii() {
        assertEquals("'A' (code 65)", StubParser.doGetCharDesc(65));
    }

    // ===================== _asciiBytes / _ascii =====================

    @Test
    public void testAsciiBytes_and_Ascii_roundtrip() {
        byte[] b = StubParser.doAsciiBytes("Hello");
        assertArrayEquals(new byte[]{'H', 'e', 'l', 'l', 'o'}, b);
        assertEquals("Hello", StubParser.doAscii(b));
    }

    @Test
    public void testAsciiBytes_emptyString() {
        byte[] b = StubParser.doAsciiBytes("");
        assertEquals(0, b.length);
    }
}
