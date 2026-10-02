# วิเคราะห์และแนวทางการทดสอบ

เนื่องจาก `ParserMinimalBase` เป็น abstract class ที่มีทั้ง method ที่ implement แล้ว (มี logic/branch ให้ทดสอบ) และ method abstract ที่ต้อง implement เพิ่ม (ทั้งจากตัวเองและจาก `JsonParser`) จึงต้องสร้าง **concrete subclass สำหรับทดสอบ (Test Double)** ชื่อ `TestParser` ที่:
- Implement abstract methods ทั้งหมดแบบ minimal เพื่อควบคุม state ได้ (token sequence, text, ตัวเลข, embedded object)
- เปิด wrapper method แบบ `public` ให้เรียก protected method ต่าง ๆ ของ `ParserMinimalBase` ได้จากเทส เพื่อทดสอบ branch ที่ซ่อนอยู่ในเมธอด error-reporting

โค้ดเทสวางไว้ใน package เดียวกับคลาสเป้าหมาย (`com.fasterxml.jackson.core.base`) เพื่อให้ `TestParser` เข้าถึง protected member ได้สะดวก (import คลาสเป้าหมายไว้ตามข้อกำหนด แม้จะซ้ำ package ก็ compile ได้ปกติ)

```java
package com.fasterxml.jackson.core.base;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.base.ParserMinimalBase; // ตามข้อกำหนด (redundant แต่ compile ได้)
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;

public class ParserMinimalBaseTest {

    // ------------------------------------------------------------------
    // Test double: minimal concrete implementation ของ ParserMinimalBase
    // ------------------------------------------------------------------
    static class TestParser extends ParserMinimalBase {
        private JsonToken[] tokenSequence;
        private int seqIndex = -1;

        private String text;
        private Object embeddedObject;
        private int intValue;
        private long longValue;
        private double doubleValue;
        private boolean closed = false;
        private String currentName;

        TestParser(JsonToken... tokens) {
            this.tokenSequence = tokens;
        }

        void setText(String t) { this.text = t; }
        void setEmbeddedObject(Object o) { this.embeddedObject = o; }
        void setIntValue(int v) { this.intValue = v; }
        void setLongValue(long v) { this.longValue = v; }
        void setDoubleValue(double v) { this.doubleValue = v; }
        void setCurrentTokenDirect(JsonToken t) { this._currToken = t; }

        @Override
        public JsonToken nextToken() throws IOException {
            seqIndex++;
            if (tokenSequence == null || seqIndex >= tokenSequence.length) {
                _currToken = null;
                return null;
            }
            _currToken = tokenSequence[seqIndex];
            return _currToken;
        }

        @Override protected void _handleEOF() throws JsonParseException {
            _reportInvalidEOF();
        }

        @Override public String getCurrentName() throws IOException { return currentName; }
        @Override public void close() throws IOException { closed = true; }
        @Override public boolean isClosed() { return closed; }
        @Override public JsonStreamContext getParsingContext() { return null; }
        @Override public void overrideCurrentName(String name) { this.currentName = name; }

        @Override public String getText() throws IOException { return text; }
        @Override public char[] getTextCharacters() throws IOException {
            return text == null ? null : text.toCharArray();
        }
        @Override public boolean hasTextCharacters() { return false; }
        @Override public int getTextLength() throws IOException { return text == null ? 0 : text.length(); }
        @Override public int getTextOffset() throws IOException { return 0; }
        @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return null; }

        @Override public ObjectCodec getCodec() { return null; }
        @Override public void setCodec(ObjectCodec c) { }

        @Override public Number getNumberValue() throws IOException { return intValue; }
        @Override public NumberType getNumberType() throws IOException { return NumberType.INT; }
        @Override public int getIntValue() throws IOException { return intValue; }
        @Override public long getLongValue() throws IOException { return longValue; }
        @Override public BigInteger getBigIntegerValue() throws IOException { return BigInteger.valueOf(longValue); }
        @Override public float getFloatValue() throws IOException { return (float) doubleValue; }
        @Override public double getDoubleValue() throws IOException { return doubleValue; }
        @Override public BigDecimal getDecimalValue() throws IOException { return BigDecimal.valueOf(doubleValue); }
        @Override public Object getEmbeddedObject() throws IOException { return embeddedObject; }

        @Override public JsonLocation getTokenLocation() { return JsonLocation.NA; }
        @Override public JsonLocation getCurrentLocation() { return JsonLocation.NA; }

        // ---------- Wrapper สำหรับเข้าถึง protected method เพื่อทดสอบ ----------
        public boolean callHasTextualNull(String v) { return _hasTextualNull(v); }
        public static String callGetCharDesc(int ch) { return _getCharDesc(ch); }
        public String callLongIntegerDesc(String s) { return _longIntegerDesc(s); }
        public String callLongNumberDesc(String s) { return _longNumberDesc(s); }

        public void callReportOverflowInt() throws IOException { reportOverflowInt(); }
        public void callReportOverflowInt(String numDesc) throws IOException { reportOverflowInt(numDesc); }
        public void callReportOverflowLong() throws IOException { reportOverflowLong(); }
        public void callReportOverflowLong(String numDesc) throws IOException { reportOverflowLong(numDesc); }

        public void callReportInvalidNumber(String msg) throws JsonParseException { reportInvalidNumber(msg); }
        public void callReportUnexpectedNumberChar(int ch, String comment) throws JsonParseException {
            reportUnexpectedNumberChar(ch, comment);
        }
        public void callReportUnexpectedChar(int ch, String comment) throws JsonParseException {
            _reportUnexpectedChar(ch, comment);
        }
        public void callReportInvalidEOF() throws JsonParseException { _reportInvalidEOF(); }
        public void callReportInvalidEOFInValue(JsonToken type) throws JsonParseException {
            _reportInvalidEOFInValue(type);
        }
        public void callThrowInvalidSpace(int i) throws JsonParseException { _throwInvalidSpace(i); }
        public void callReportMissingRootWS(int ch) throws JsonParseException { _reportMissingRootWS(ch); }

        public void callDecodeBase64(String s, ByteArrayBuilder b, Base64Variant v) throws IOException {
            _decodeBase64(s, b, v);
        }
        public void callWrapError(String msg, Throwable t) throws JsonParseException { _wrapError(msg, t); }
        public void callThrowInternal() { _throwInternal(); }
        public void callReportInputCoercion(String msg, JsonToken inputType, Class<?> targetType)
                throws InputCoercionException {
            _reportInputCoercion(msg, inputType, targetType);
        }
        public void callReportError(String msg) throws JsonParseException { _reportError(msg); }
        public void callReportError(String msg, Object a1) throws JsonParseException { _reportError(msg, a1); }
        public void callReportError(String msg, Object a1, Object a2) throws JsonParseException {
            _reportError(msg, a1, a2);
        }
        public static byte[] callAsciiBytes(String s) { return _asciiBytes(s); }
        public static String callAscii(byte[] b) { return _ascii(b); }
    }

    private TestParser parser;

    @Before
    public void setUp() {
        parser = new TestParser();
    }

    // ==================================================================
    // currentToken / getCurrentToken / hasCurrentToken / hasTokenId / hasToken
    // ==================================================================

    @Test
    public void currentToken_nullByDefault() {
        assertNull(parser.currentToken());
        assertNull(parser.getCurrentToken());
        assertFalse(parser.hasCurrentToken());
    }

    @Test
    public void currentToken_afterSet() {
        parser.setCurrentTokenDirect(JsonToken.VALUE_STRING);
        assertEquals(JsonToken.VALUE_STRING, parser.currentToken());
        assertEquals(JsonToken.VALUE_STRING, parser.getCurrentToken());
        assertTrue(parser.hasCurrentToken());
    }

    @Test
    public void currentTokenId_nullToken_returnsNoToken() {
        assertEquals(JsonTokenId.ID_NO_TOKEN, parser.currentTokenId());
        assertEquals(JsonTokenId.ID_NO_TOKEN, parser.getCurrentTokenId());
    }

    @Test
    public void currentTokenId_nonNullToken_returnsTokenId() {
        parser.setCurrentTokenDirect(JsonToken.START_OBJECT);
        assertEquals(JsonTokenId.ID_START_OBJECT, parser.currentTokenId());
        assertEquals(JsonTokenId.ID_START_OBJECT, parser.getCurrentTokenId());
    }

    @Test
    public void hasTokenId_nullToken_matchNoToken() {
        assertTrue(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
    }

    @Test
    public void hasTokenId_nullToken_notMatch() {
        assertFalse(parser.hasTokenId(JsonTokenId.ID_START_ARRAY));
    }

    @Test
    public void hasTokenId_nonNullToken_match() {
        parser.setCurrentTokenDirect(JsonToken.START_ARRAY);
        assertTrue(parser.hasTokenId(JsonTokenId.ID_START_ARRAY));
    }

    @Test
    public void hasTokenId_nonNullToken_notMatch() {
        parser.setCurrentTokenDirect(JsonToken.START_ARRAY);
        assertFalse(parser.hasTokenId(JsonTokenId.ID_START_OBJECT));
    }

    @Test
    public void hasToken_equalAndNotEqual() {
        parser.setCurrentTokenDirect(JsonToken.VALUE_NULL);
        assertTrue(parser.hasToken(JsonToken.VALUE_NULL));
        assertFalse(parser.hasToken(JsonToken.VALUE_TRUE));
    }

    @Test
    public void isExpectedStartArrayObjectToken() {
        parser.setCurrentTokenDirect(JsonToken.START_ARRAY);
        assertTrue(parser.isExpectedStartArrayToken());
        assertFalse(parser.isExpectedStartObjectToken());

        parser.setCurrentTokenDirect(JsonToken.START_OBJECT);
        assertFalse(parser.isExpectedStartArrayToken());
        assertTrue(parser.isExpectedStartObjectToken());
    }

    // ==================================================================
    // nextValue()
    // ==================================================================

    @Test
    public void nextValue_afterFieldName_callsNextTokenAgain() throws IOException {
        TestParser p = new TestParser(JsonToken.FIELD_NAME, JsonToken.VALUE_STRING);
        JsonToken t = p.nextValue();
        assertEquals(JsonToken.VALUE_STRING, t);
    }

    @Test
    public void nextValue_notFieldName_returnsDirect() throws IOException {
        TestParser p = new TestParser(JsonToken.VALUE_NUMBER_INT);
        JsonToken t = p.nextValue();
        assertEquals(JsonToken.VALUE_NUMBER_INT, t);
    }

    // ==================================================================
    // skipChildren()
    // ==================================================================

    @Test
    public void skipChildren_notStartTokenReturnsImmediately() throws IOException {
        // _currToken == null -> ไม่ใช่ START_OBJECT/START_ARRAY -> return this ทันที
        JsonParser result = parser.skipChildren();
        assertSame(parser, result);
        assertNull(parser.currentToken());
    }

    @Test
    public void skipChildren_simpleArray_closesImmediatelyAtDepth1() throws IOException {
        TestParser p = new TestParser(JsonToken.START_ARRAY, JsonToken.END_ARRAY);
        p.nextToken(); // set currToken = START_ARRAY
        JsonParser result = p.skipChildren();
        assertSame(p, result);
    }

    @Test
    public void skipChildren_nestedStructures_tracksOpenCount() throws IOException {
        TestParser p = new TestParser(
                JsonToken.START_ARRAY, JsonToken.START_OBJECT,
                JsonToken.END_OBJECT, JsonToken.END_ARRAY);
        p.nextToken(); // START_ARRAY
        JsonParser result = p.skipChildren();
        assertSame(p, result);
    }

    @Test(expected = JsonParseException.class)
    public void skipChildren_eofInsideStructure_throws() throws IOException {
        TestParser p = new TestParser(JsonToken.START_ARRAY); // ไม่มี token ปิด
        p.nextToken(); // START_ARRAY
        p.skipChildren(); // loop เจอ null -> _handleEOF() -> throw
    }

    @Test(expected = JsonParseException.class)
    public void skipChildren_notAvailableToken_throws() throws IOException {
        TestParser p = new TestParser(JsonToken.START_ARRAY, JsonToken.NOT_AVAILABLE);
        p.nextToken(); // START_ARRAY
        p.skipChildren(); // เจอ NOT_AVAILABLE -> _reportError -> throw
    }

    // ==================================================================
    // clearCurrentToken / getLastClearedToken
    // ==================================================================

    @Test
    public void clearCurrentToken_whenAlreadyNull_noChange() {
        parser.clearCurrentToken();
        assertNull(parser.getLastClearedToken());
    }

    @Test
    public void clearCurrentToken_whenSet_movesToLastCleared() {
        parser.setCurrentTokenDirect(JsonToken.VALUE_TRUE);
        parser.clearCurrentToken();
        assertNull(parser.currentToken());
        assertEquals(JsonToken.VALUE_TRUE, parser.getLastClearedToken());
    }

    // ==================================================================
    // getValueAsBoolean(default)
    // ==================================================================

    @Test
    public void valueAsBoolean_nullToken_returnsDefault() throws IOException {
        assertTrue(parser.getValueAsBoolean(true));
    }

    @Test
    public void valueAsBoolean_stringTrue() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_STRING);
        parser.setText(" true ");
        assertTrue(parser.getValueAsBoolean(false));
    }

    @Test
    public void valueAsBoolean_stringFalse() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_STRING);
        parser.setText("false");
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void valueAsBoolean_stringTextualNull_returnsFalse() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_STRING);
        parser.setText("null");
        assertFalse(parser.getValueAsBoolean(true)); // ตาม logic: return false ไม่ใช่ default
    }

    @Test
    public void valueAsBoolean_stringOther_returnsDefault() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_STRING);
        parser.setText("abc");
        assertTrue(parser.getValueAsBoolean(true));
    }

    @Test
    public void valueAsBoolean_numberIntNonZero_true() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_NUMBER_INT);
        parser.setIntValue(5);
        assertTrue(parser.getValueAsBoolean(false));
    }

    @Test
    public void valueAsBoolean_numberIntZero_false() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_NUMBER_INT);
        parser.setIntValue(0);
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void valueAsBoolean_trueFalseNullTokens() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_TRUE);
        assertTrue(parser.getValueAsBoolean(false));

        parser.setCurrentTokenDirect(JsonToken.VALUE_FALSE);
        assertFalse(parser.getValueAsBoolean(true));

        parser.setCurrentTokenDirect(JsonToken.VALUE_NULL);
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void valueAsBoolean_embeddedObjectBoolean() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_EMBEDDED_OBJECT);
        parser.setEmbeddedObject(Boolean.TRUE);
        assertTrue(parser.getValueAsBoolean(false));

        parser.setEmbeddedObject(Boolean.FALSE);
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void valueAsBoolean_embeddedObjectNonBoolean_returnsDefault() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_EMBEDDED_OBJECT);
        parser.setEmbeddedObject("not-a-boolean");
        assertTrue(parser.getValueAsBoolean(true));
    }

    @Test
    public void valueAsBoolean_defaultCase_otherToken() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.START_ARRAY);
        assertTrue(parser.getValueAsBoolean(true));
    }

    // ==================================================================
    // getValueAsInt() / getValueAsInt(default)
    // ==================================================================

    @Test
    public void valueAsInt_noArg_numberIntOrFloat() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_NUMBER_INT);
        parser.setIntValue(42);
        assertEquals(42, parser.getValueAsInt());

        parser.setCurrentTokenDirect(JsonToken.VALUE_NUMBER_FLOAT);
        parser.setIntValue(7);
        assertEquals(7, parser.getValueAsInt());
    }

    @Test
    public void valueAsInt_noArg_delegatesToDefaultZero() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.START_OBJECT); // ไม่ match switch case ใด ๆ
        assertEquals(0, parser.getValueAsInt());
    }

    @Test
    public void valueAsInt_default_nullToken() throws IOException {
        assertEquals(99, parser.getValueAsInt(99));
    }

    @Test
    public void valueAsInt_default_stringTextualNull() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_STRING);
        parser.setText("null");
        assertEquals(0, parser.getValueAsInt(55));
    }

    @Test
    public void valueAsInt_default_stringNumeric() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_STRING);
        parser.setText("123");
        assertEquals(123, parser.getValueAsInt(0));
    }

    // หมายเหตุ: พึ่งพา NumberInput.parseAsInt คืนค่า default เมื่อ parse ไม่ได้ (ไม่ได้ทดสอบ NumberInput ตรง ๆ)
    @Test
    public void valueAsInt_default_stringInvalidFallsBackToDefault() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_STRING);
        parser.setText("abc");
        assertEquals(55, parser.getValueAsInt(55));
    }

    @Test
    public void valueAsInt_default_trueFalseNull() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_TRUE);
        assertEquals(1, parser.getValueAsInt(0));

        parser.setCurrentTokenDirect(JsonToken.VALUE_FALSE);
        assertEquals(0, parser.getValueAsInt(9));

        parser.setCurrentTokenDirect(JsonToken.VALUE_NULL);
        assertEquals(0, parser.getValueAsInt(9));
    }

    @Test
    public void valueAsInt_default_embeddedObjectNumber() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_EMBEDDED_OBJECT);
        parser.setEmbeddedObject(Integer.valueOf(15));
        assertEquals(15, parser.getValueAsInt(0));
    }

    @Test
    public void valueAsInt_default_embeddedObjectNonNumber_returnsDefault() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_EMBEDDED_OBJECT);
        parser.setEmbeddedObject("string-object");
        assertEquals(77, parser.getValueAsInt(77));
    }

    @Test
    public void valueAsInt_default_otherToken_returnsDefault() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.START_ARRAY);
        assertEquals(33, parser.getValueAsInt(33));
    }

    // ==================================================================
    // getValueAsLong() / getValueAsLong(default)
    // ==================================================================

    @Test
    public void valueAsLong_noArg_numberIntOrFloat() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_NUMBER_INT);
        parser.setLongValue(123456789L);
        assertEquals(123456789L, parser.getValueAsLong());
    }

    @Test
    public void valueAsLong_default_stringTextualNull() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_STRING);
        parser.setText("null");
        assertEquals(0L, parser.getValueAsLong(5L));
    }

    @Test
    public void valueAsLong_default_stringNumeric() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_STRING);
        parser.setText("100");
        assertEquals(100L, parser.getValueAsLong(0L));
    }

    @Test
    public void valueAsLong_default_trueFalseNull() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_TRUE);
        assertEquals(1L, parser.getValueAsLong(0L));

        parser.setCurrentTokenDirect(JsonToken.VALUE_FALSE);
        assertEquals(0L, parser.getValueAsLong(9L));

        parser.setCurrentTokenDirect(JsonToken.VALUE_NULL);
        assertEquals(0L, parser.getValueAsLong(9L));
    }

    @Test
    public void valueAsLong_default_embeddedObjectNumberAndNonNumber() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_EMBEDDED_OBJECT);
        parser.setEmbeddedObject(Long.valueOf(999L));
        assertEquals(999L, parser.getValueAsLong(0L));

        parser.setEmbeddedObject("not-number");
        assertEquals(1L, parser.getValueAsLong(1L));
    }

    @Test
    public void valueAsLong_default_otherToken_returnsDefault() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.START_OBJECT);
        assertEquals(2L, parser.getValueAsLong(2L));
    }

    // ==================================================================
    // getValueAsDouble(default)
    // ==================================================================

    @Test
    public void valueAsDouble_nullToken_returnsDefault() throws IOException {
        assertEquals(3.5, parser.getValueAsDouble(3.5), 0.0001);
    }

    @Test
    public void valueAsDouble_stringTextualNull() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_STRING);
        parser.setText("null");
        assertEquals(0.0, parser.getValueAsDouble(9.9), 0.0001);
    }

    @Test
    public void valueAsDouble_stringNumeric() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_STRING);
        parser.setText("1.25");
        assertEquals(1.25, parser.getValueAsDouble(0.0), 0.0001);
    }

    @Test
    public void valueAsDouble_numberIntOrFloat() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_NUMBER_FLOAT);
        parser.setDoubleValue(7.75);
        assertEquals(7.75, parser.getValueAsDouble(0.0), 0.0001);
    }

    @Test
    public void valueAsDouble_trueFalseNull() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_TRUE);
        assertEquals(1.0, parser.getValueAsDouble(0.0), 0.0001);

        parser.setCurrentTokenDirect(JsonToken.VALUE_FALSE);
        assertEquals(0.0, parser.getValueAsDouble(9.0), 0.0001);

        parser.setCurrentTokenDirect(JsonToken.VALUE_NULL);
        assertEquals(0.0, parser.getValueAsDouble(9.0), 0.0001);
    }

    @Test
    public void valueAsDouble_embeddedObjectNumberAndNonNumber() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_EMBEDDED_OBJECT);
        parser.setEmbeddedObject(Double.valueOf(4.5));
        assertEquals(4.5, parser.getValueAsDouble(0.0), 0.0001);

        parser.setEmbeddedObject("x");
        assertEquals(2.0, parser.getValueAsDouble(2.0), 0.0001);
    }

    @Test
    public void valueAsDouble_otherToken_returnsDefault() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.START_ARRAY);
        assertEquals(6.0, parser.getValueAsDouble(6.0), 0.0001);
    }

    // ==================================================================
    // getValueAsString() / getValueAsString(default)
    // ==================================================================

    @Test
    public void valueAsString_valueString() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_STRING);
        parser.setText("hello");
        assertEquals("hello", parser.getValueAsString());
    }

    @Test
    public void valueAsString_fieldName() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.FIELD_NAME);
        parser.overrideCurrentName("myField");
        assertEquals("myField", parser.getValueAsString());
    }

    @Test
    public void valueAsString_scalarNonStringFallsToGetText() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_NUMBER_INT);
        parser.setText("123");
        assertEquals("123", parser.getValueAsString());
    }

    @Test
    public void valueAsString_nullTokenOrValueNull_returnsNullDefault() throws IOException {
        assertNull(parser.getValueAsString());

        parser.setCurrentTokenDirect(JsonToken.VALUE_NULL);
        assertNull(parser.getValueAsString());
    }

    @Test
    public void valueAsString_nonScalar_returnsNullDefault() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.START_OBJECT);
        assertNull(parser.getValueAsString());
    }

    @Test
    public void valueAsStringDefault_customDefaultForNonScalarAndNull() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.START_ARRAY);
        assertEquals("DEF", parser.getValueAsString("DEF"));

        parser.setCurrentTokenDirect(JsonToken.VALUE_NULL);
        assertEquals("DEF", parser.getValueAsString("DEF"));
    }

    @Test
    public void valueAsStringDefault_scalarFloatUsesGetText() throws IOException {
        parser.setCurrentTokenDirect(JsonToken.VALUE_NUMBER_FLOAT);
        parser.setText("3.14");
        assertEquals("3.14", parser.getValueAsString("DEF"));
    }

    // ==================================================================
    // _hasTextualNull
    // ==================================================================

    @Test
    public void hasTextualNull_trueAndFalse() {
        assertTrue(parser.callHasTextualNull("null"));
        assertFalse(parser.callHasTextualNull("NULL"));
        assertFalse(parser.callHasTextualNull(""));
    }

    // ==================================================================
    // Error-reporting methods
    // ==================================================================

    @Test
    public void reportUnexpectedNumberChar_withAndWithoutComment() {
        try {
            parser.callReportUnexpectedNumberChar('x', "extra info");
            fail("expected exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("extra info"));
        }
        try {
            parser.callReportUnexpectedNumberChar('x', null);
            fail("expected exception");
        } catch (JsonParseException e) {
            assertFalse(e.getMessage().contains("extra info"));
        }
    }

    @Test(expected = JsonParseException.class)
    public void reportInvalidNumber_throws() throws JsonParseException {
        parser.callReportInvalidNumber("bad number");
    }

    @Test
    public void reportOverflowInt_shortText() throws IOException {
        parser.setText("12345");
        try {
            parser.callReportOverflowInt();
            fail("expected exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("12345"));
        }
    }

    @Test
    public void reportOverflowInt_longTextTriggersCompressedDesc() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) sb.append('9');
        try {
            parser.callReportOverflowInt(sb.toString());
            fail("expected exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("[Integer with 1000 digits]"));
        }
    }

    @Test
    public void reportOverflowLong_shortAndLongText() throws IOException {
        try {
            parser.callReportOverflowLong("42");
            fail("expected exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("42"));
        }

        StringBuilder sb = new StringBuilder("-");
        for (int i = 0; i < 1000; i++) sb.append('9'); // length 1001 with leading '-'
        try {
            parser.callReportOverflowLong(sb.toString());
            fail("expected exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("[Integer with 1000 digits]"));
        }
    }

    @Test(expected = InputCoercionException.class)
    public void reportInputCoercion_throws() throws InputCoercionException {
        parser.callReportInputCoercion("bad coercion", JsonToken.VALUE_STRING, int.class);
    }

    @Test
    public void longIntegerDesc_shortReturnsAsIs() {
        assertEquals("123", parser.callLongIntegerDesc("123"));
    }

    @Test
    public void longIntegerDesc_longWithoutMinus() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) sb.append('1');
        assertEquals("[Integer with 1000 digits]", parser.callLongIntegerDesc(sb.toString()));
    }

    @Test
    public void longIntegerDesc_longWithMinus() {
        StringBuilder sb = new StringBuilder("-");
        for (int i = 0; i < 1000; i++) sb.append('1'); // total length 1001
        assertEquals("[Integer with 1000 digits]", parser.callLongIntegerDesc(sb.toString()));
    }

    @Test
    public void longNumberDesc_shortAndLong() {
        assertEquals("3.14", parser.callLongNumberDesc("3.14"));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) sb.append('9');
        assertEquals("[number with 1000 characters]", parser.callLongNumberDesc(sb.toString()));
    }

    @Test
    public void reportUnexpectedChar_negativeChar_throwsEOF() {
        try {
            parser.callReportUnexpectedChar(-1, null);
            fail("expected exception");
        } catch (JsonEOFException e) {
            // ตาม logic ch < 0 -> _reportInvalidEOF()
            assertNotNull(e.getMessage());
        } catch (JsonParseException e) {
            fail("expected JsonEOFException, got " + e);
        }
    }

    @Test
    public void reportUnexpectedChar_positiveChar_withComment() {
        try {
            parser.callReportUnexpectedChar('!', "some comment");
            fail("expected exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("some comment"));
        }
    }

    @Test(expected = JsonEOFException.class)
    public void reportInvalidEOF_noArg_throws() throws JsonParseException {
        parser.callReportInvalidEOF();
    }

    @Test
    public void reportInvalidEOFInValue_stringNumberOtherBranches() {
        try {
            parser.callReportInvalidEOFInValue(JsonToken.VALUE_STRING);
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("String value"));
        }
        try {
            parser.callReportInvalidEOFInValue(JsonToken.VALUE_NUMBER_INT);
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Number value"));
        }
        try {
            parser.callReportInvalidEOFInValue(JsonToken.VALUE_NUMBER_FLOAT);
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Number value"));
        }
        try {
            parser.callReportInvalidEOFInValue(JsonToken.START_OBJECT);
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains(" in a value"));
        }
    }

    @Test(expected = JsonParseException.class)
    public void reportMissingRootWS_throws() throws JsonParseException {
        parser.callReportMissingRootWS(' ');
    }

    @Test(expected = JsonParseException.class)
    public void throwInvalidSpace_throws() throws JsonParseException {
        parser.callThrowInvalidSpace(0x01);
    }

    // ==================================================================
    // _getCharDesc branches
    // ==================================================================

    @Test
    public void getCharDesc_controlChar() {
        String desc = TestParser.callGetCharDesc(7); // BEL, ISO control
        assertTrue(desc.contains("CTRL-CHAR"));
    }

    @Test
    public void getCharDesc_greaterThan255() {
        String desc = TestParser.callGetCharDesc(300);
        assertTrue(desc.contains("0x"));
    }

    @Test
    public void getCharDesc_normalChar() {
        String desc = TestParser.callGetCharDesc('A');
        assertTrue(desc.contains("'A'"));
        assertFalse(desc.contains("0x"));
    }

    // ==================================================================
    // _reportError overloads
    // ==================================================================

    @Test(expected = JsonParseException.class)
    public void reportError_singleArgOverload() throws JsonParseException {
        parser.callReportError("plain message");
    }

    @Test
    public void reportError_oneFormatArg() {
        try {
            parser.callReportError("msg %s", "X");
            fail();
        } catch (JsonParseException e) {
            assertEquals("msg X", e.getMessage());
        }
    }

    @Test
    public void reportError_twoFormatArgs() {
        try {
            parser.callReportError("msg %s-%s", "A", "B");
            fail();
        } catch (JsonParseException e) {
            assertEquals("msg A-B", e.getMessage());
        }
    }

    @Test
    public void wrapError_wrapsCauseAndMessage() {
        Exception cause = new RuntimeException("original");
        try {
            parser.callWrapError("wrapped msg", cause);
            fail();
        } catch (JsonParseException e) {
            assertEquals("wrapped msg", e.getMessage());
            assertSame(cause, e.getCause());
        }
    }

    // หมายเหตุ: ไม่แน่ใจ exact exception type ของ VersionUtil.throwInternal()
    // จึงตรวจสอบเพียงว่ามันโยน RuntimeException ที่ unchecked เท่านั้น
    @Test(expected = RuntimeException.class)
    public void throwInternal_throwsRuntimeException() {
        parser.callThrowInternal();
    }

    // ==================================================================
    // _asciiBytes / _ascii
    // ==================================================================

    @Test
    public void asciiBytes_and_ascii_roundTrip() {
        byte[] b = TestParser.callAsciiBytes("Hello");
        assertEquals("Hello", TestParser.callAscii(b));
    }

    @Test
    public void asciiBytes_emptyString() {
        byte[] b = TestParser.callAsciiBytes("");
        assertEquals(0, b.length);
    }

    // ==================================================================
    // _decodeBase64
    // ==================================================================

    @Test
    public void decodeBase64_validInput() throws IOException {
        ByteArrayBuilder builder = new ByteArrayBuilder();
        parser.callDecodeBase64("SGVsbG8=", builder, Base64Variants.getDefaultVariant());
        byte[] result = builder.toByteArray();
        assertEquals("Hello", new String(result, "US-ASCII"));
    }

    @Test(expected = JsonParseException.class)
    public void decodeBase64_invalidInput_throwsViaReportError() throws IOException {
        ByteArrayBuilder builder = new ByteArrayBuilder();
        // อักขระที่ไม่ใช่ base64 ที่ถูกต้อง คาดหวังว่า b64variant.decode() จะโยน IllegalArgumentException
        // ซึ่งถูก catch แล้วแปลงเป็น JsonParseException ผ่าน _reportError
        parser.callDecodeBase64("!!!not-base64!!!", builder, Base64Variants.getDefaultVariant());
    }

    // ==================================================================
    // isClosed / close (โครงพื้นฐานของ TestParser เอง เพื่อยืนยัน state ที่ใช้ในเทสอื่น)
    // ==================================================================

    @Test
    public void closeAndIsClosed() throws IOException {
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }
}
```

## สรุปตาราง Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| currentToken_nullByDefault / afterSet | `currentToken()`, `hasCurrentToken()` ทั้งกรณี null/non-null |
| currentTokenId_nullToken/nonNullToken | เงื่อนไข `t==null` ใน `currentTokenId()`/`getCurrentTokenId()` |
| hasTokenId_* (4 cases) | ทั้ง 4 combination ของ `t==null`/`t!=null` × match/not-match |
| hasToken_equalAndNotEqual | เงื่อนไข equality ใน `hasToken()` |
| isExpectedStartArrayObjectToken | true/false ของทั้งสอง method |
| nextValue_* (2 cases) | if branch เมื่อ token เป็น/ไม่เป็น FIELD_NAME |
| skipChildren_* (5 cases) | ทุกสาขาของ loop: return ทันที, isStructStart, isStructEnd(ปิดสำเร็จ/ยังไม่ปิด), t==null (EOF), NOT_AVAILABLE |
| clearCurrentToken_* (2 cases) | if `_currToken != null` true/false |
| valueAsBoolean_* (10 cases) | ทุก case ของ switch (STRING×4, NUMBER_INT×2, TRUE, FALSE/NULL, EMBEDDED×3, default) |
| valueAsInt_* (10 cases) | no-arg delegate, ทุก case switch, embedded Number/non-Number, default |
| valueAsLong_* (6 cases) | เทียบเคียง getValueAsInt แต่สำหรับ long |
| valueAsDouble_* (7 cases) | ทุก case switch รวม textual-null (bug 0L) |
| valueAsString_* / valueAsStringDefault_* (7 cases) | VALUE_STRING, FIELD_NAME, scalar-fallback, null/VALUE_NULL, non-scalar |
| hasTextualNull_* | true/false ของ `_hasTextualNull` |
| reportUnexpectedNumberChar_* | comment null/non-null |
| reportInvalidNumber_throws | exception path |
| reportOverflowInt_*/reportOverflowLong_* | short vs long numDesc (`_longIntegerDesc` branch) |
| reportInputCoercion_throws | throw `InputCoercionException` |
| longIntegerDesc_*/longNumberDesc_* | rawLen<1000, >=1000 มี/ไม่มี `-` |
| reportUnexpectedChar_* | ch<0 (EOF) vs ch>=0 (comment) |
| reportInvalidEOF_noArg_throws | delegate to `_reportInvalidEOF(String,JsonToken)` |
| reportInvalidEOFInValue_* (4 cases) | STRING / NUMBER_INT / NUMBER_FLOAT / other |
| reportMissingRootWS_throws / throwInvalidSpace_throws | exception message path |
| getCharDesc_* (3 cases) | control char, >255, normal |
| reportError_* (3 overloads) + wrapError | 3 overload ของ `_reportError` และ `_wrapError` |
| throwInternal_throwsRuntimeException | unchecked exception (มีคอมเมนต์กำกับความไม่แน่ใจ) |
| asciiBytes_and_ascii_* | round-trip และ empty string (loop 0 รอบ) |
| decodeBase64_* (2 cases) | try success / catch IllegalArgumentException → `_reportError` |
| closeAndIsClosed | state ของ test double เอง |

**หมายเหตุสำคัญ:**
- พฤติกรรมของ `NumberInput.parseAsInt/Long/Double` เมื่อ parse ไม่สำเร็จ (คืนค่า default) เป็นสมมติฐานอิงจากพฤติกรรมมาตรฐานของไลบรารี ไม่ได้ทดสอบ `NumberInput` ตรง ๆ
- `VersionUtil.throwInternal()` exact exception type ไม่ชัดเจนในซอร์สที่ให้มา จึงทดสอบแบบกว้างเป็น `RuntimeException`
- `_decodeBase64` invalid-input test อิงสมมติฐานว่า `Base64Variant.decode()` โยน `IllegalArgumentException` สำหรับ input ที่ผิดรูปแบบ ตามที่ระบุใน catch block ของซอร์สโค้ด