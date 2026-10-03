package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ParserMinimalBaseTest {

    private ParserMinimalBase parser;

    private static class TestParserStub extends ParserMinimalBase {
        private JsonToken[] tokens;
        private int tokenIndex = 0;
        private String currentName;
        private String textValue;
        private int intValue;
        private long longValue;
        private double doubleValue;
        private Object embeddedObject;

        public TestParserStub(JsonToken... tokens) {
            this.tokens = tokens;
        }

        @Override
        public JsonToken nextToken() throws IOException {
            if (tokens != null && tokenIndex < tokens.length) {
                _currToken = tokens[tokenIndex++];
                return _currToken;
            }
            _currToken = null;
            return null;
        }

        @Override
        public String getCurrentName() throws IOException { return currentName; }

        @Override
        public void close() throws IOException {}

        @Override
        public boolean isClosed() { return false; }

        @Override
        public JsonStreamContext getParsingContext() { return null; }

        @Override
        public void overrideCurrentName(String name) { this.currentName = name; }

        @Override
        public String getText() throws IOException { return textValue; }

        @Override
        public char[] getTextCharacters() throws IOException { return textValue != null ? textValue.toCharArray() : null; }

        @Override
        public boolean hasTextCharacters() { return false; }

        @Override
        public int getTextLength() throws IOException { return textValue != null ? textValue.length() : 0; }

        @Override
        public int getTextOffset() throws IOException { return 0; }

        @Override
        public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return new byte[0]; }

        @Override
        protected void _handleEOF() throws JsonParseException {
            _reportInvalidEOF(" in stub");
        }

        @Override
        public int getIntValue() throws IOException { return intValue; }

        @Override
        public long getLongValue() throws IOException { return longValue; }

        @Override
        public double getDoubleValue() throws IOException { return doubleValue; }

        @Override
        public Object getEmbeddedObject() throws IOException { return embeddedObject; }
    }

    @Before
    public void setUp() {
        parser = new TestParserStub();
    }

    @Test
    public void testTokenIdAndMatchingNullToken() {
        parser._currToken = null;
        assertEquals(JsonTokenId.ID_NO_TOKEN, parser.getCurrentTokenId());
        assertTrue(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertFalse(parser.hasTokenId(JsonTokenId.ID_STRING));
        assertFalse(parser.hasCurrentToken());
        assertNull(parser.getCurrentToken());
    }

    @Test
    public void testTokenIdAndMatchingValidToken() {
        parser._currToken = JsonToken.VALUE_STRING;
        assertEquals(JsonTokenId.ID_STRING, parser.getCurrentTokenId());
        assertTrue(parser.hasTokenId(JsonTokenId.ID_STRING));
        assertFalse(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertTrue(parser.hasCurrentToken());
        assertTrue(parser.hasToken(JsonToken.VALUE_STRING));
        assertFalse(parser.hasToken(JsonToken.VALUE_NUMBER_INT));
    }

    @Test
    public void testStructuralTokenExpectations() {
        parser._currToken = JsonToken.START_ARRAY;
        assertTrue(parser.isExpectedStartArrayToken());
        assertFalse(parser.isExpectedStartObjectToken());

        parser._currToken = JsonToken.START_OBJECT;
        assertFalse(parser.isExpectedStartArrayToken());
        assertTrue(parser.isExpectedStartObjectToken());
    }

    @Test
    public void testNextValue() throws IOException {
        TestParserStub stub = new TestParserStub(JsonToken.FIELD_NAME, JsonToken.VALUE_STRING);
        JsonToken t = stub.nextValue();
        assertEquals(JsonToken.VALUE_STRING, t);

        TestParserStub stub2 = new TestParserStub(JsonToken.VALUE_NUMBER_INT);
        JsonToken t2 = stub2.nextValue();
        assertEquals(JsonToken.VALUE_NUMBER_INT, t2);
    }

    @Test
    public void testSkipChildrenNotStruct() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        JsonParser result = parser.skipChildren();
        assertSame(parser, result);
    }

    @Test
    public void testSkipChildrenStructFlow() throws IOException {
        TestParserStub stub = new TestParserStub(JsonToken.START_OBJECT, JsonToken.FIELD_NAME, JsonToken.VALUE_STRING, JsonToken.END_OBJECT);
        stub._currToken = JsonToken.START_OBJECT;
        JsonParser result = stub.skipChildren();
        assertSame(stub, result);
    }

    @Test(expected = JsonParseException.class)
    public void testSkipChildrenEOF() throws IOException {
        TestParserStub stub = new TestParserStub((JsonToken) null);
        stub._currToken = JsonToken.START_OBJECT;
        stub.skipChildren();
    }

    @Test
    public void testClearAndGetLastClearedToken() {
        parser._currToken = JsonToken.VALUE_STRING;
        parser.clearCurrentToken();
        assertNull(parser.getCurrentToken());
        assertEquals(JsonToken.VALUE_STRING, parser.getLastClearedToken());
    }

    @Test
    public void testGetValueAsBooleanScenarios() throws IOException {
        // Null token case
        parser._currToken = null;
        assertTrue(parser.getValueAsBoolean(true));
        assertFalse(parser.getValueAsBoolean(false));

        // String true/false/null/other
        parser._currToken = JsonToken.VALUE_STRING;
        parser.textValue = "true";
        assertTrue(parser.getValueAsBoolean(false));

        parser.textValue = "false";
        assertFalse(parser.getValueAsBoolean(true));

        parser.textValue = "null";
        assertFalse(parser.getValueAsBoolean(true));

        parser.textValue = "unknown";
        assertFalse(parser.getValueAsBoolean(false));

        // Int / True / False / Null tokens
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser.intValue = 5;
        assertTrue(parser.getValueAsBoolean(false));
        parser.intValue = 0;
        assertFalse(parser.getValueAsBoolean(true));

        parser._currToken = JsonToken.VALUE_TRUE;
        assertTrue(parser.getValueAsBoolean(false));

        parser._currToken = JsonToken.VALUE_FALSE;
        assertFalse(parser.getValueAsBoolean(true));

        parser._currToken = JsonToken.VALUE_NULL;
        assertFalse(parser.getValueAsBoolean(true));

        // Embedded object boolean vs non-boolean
        parser._currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        parser.embeddedObject = Boolean.TRUE;
        assertTrue(parser.getValueAsBoolean(false));

        parser.embeddedObject = "NotABoolean";
        assertFalse(parser.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsIntScenarios() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser.intValue = 42;
        assertEquals(42, parser.getValueAsInt());
        assertEquals(42, parser.getValueAsInt(10));

        parser._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        parser.intValue = 99;
        assertEquals(99, parser.getValueAsInt());

        parser._currToken = JsonToken.VALUE_STRING;
        parser.textValue = "123";
        assertEquals(123, parser.getValueAsInt(10));

        parser.textValue = "null";
        assertEquals(0, parser.getValueAsInt(10));

        parser._currToken = JsonToken.VALUE_TRUE;
        assertEquals(1, parser.getValueAsInt(10));

        parser._currToken = JsonToken.VALUE_FALSE;
        assertEquals(0, parser.getValueAsInt(10));

        parser._currToken = JsonToken.VALUE_NULL;
        assertEquals(0, parser.getValueAsInt(10));

        parser._currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        parser.embeddedObject = 77;
        assertEquals(77, parser.getValueAsInt(10));

        parser._currToken = null;
        assertEquals(10, parser.getValueAsInt(10));
    }

    @Test
    public void testGetValueAsLongScenarios() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser.longValue = 42L;
        assertEquals(42L, parser.getValueAsLong());
        assertEquals(42L, parser.getValueAsLong(10L));

        parser._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        parser.longValue = 99L;
        assertEquals(99L, parser.getValueAsLong());

        parser._currToken = JsonToken.VALUE_STRING;
        parser.textValue = "456";
        assertEquals(456L, parser.getValueAsLong(10L));

        parser.textValue = "null";
        assertEquals(0L, parser.getValueAsLong(10L));

        parser._currToken = JsonToken.VALUE_TRUE;
        assertEquals(1L, parser.getValueAsLong(10L));

        parser._currToken = JsonToken.VALUE_FALSE;
        parser._currToken = JsonToken.VALUE_NULL;
        assertEquals(0L, parser.getValueAsLong(10L));

        parser._currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        parser.embeddedObject = 88L;
        assertEquals(88L, parser.getValueAsLong(10L));

        parser._currToken = null;
        assertEquals(10L, parser.getValueAsLong(10L));
    }

    @Test
    public void testGetValueAsDoubleScenarios() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser.textValue = "12.34";
        assertEquals(12.34, parser.getValueAsDouble(0.0), 0.001);

        parser.textValue = "null";
        assertEquals(0.0, parser.getValueAsDouble(5.0), 0.001);

        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser.doubleValue = 55.5;
        assertEquals(55.5, parser.getValueAsDouble(0.0), 0.001);

        parser._currToken = JsonToken.VALUE_TRUE;
        assertEquals(1.0, parser.getValueAsDouble(0.0), 0.001);

        parser._currToken = JsonToken.VALUE_FALSE;
        assertEquals(0.0, parser.getValueAsDouble(5.0), 0.001);

        parser._currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        parser.embeddedObject = 33.3;
        assertEquals(33.3, parser.getValueAsDouble(0.0), 0.001);

        parser._currToken = null;
        assertEquals(5.0, parser.getValueAsDouble(5.0), 0.001);
    }

    @Test
    public void testGetValueAsStringScenarios() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser.textValue = "hello";
        assertEquals("hello", parser.getValueAsString());
        assertEquals("hello", parser.getValueAsString("default"));

        parser._currToken = JsonToken.VALUE_NULL;
        assertNull(parser.getValueAsString("default"));

        parser._currToken = null;
        assertEquals("default", parser.getValueAsString("default"));
    }

    @Test
    public void testDecodeBase64AndReporting() {
        ByteArrayBuilder builder = new ByteArrayBuilder();
        try {
            parser._decodeBase64("invalid-base64-@@@", builder, Base64Variants.MIME);
            fail("Expected JsonParseException");
        } catch (Exception e) {
            // Expected exception due to invalid base64
        }
    }

    @Test
    public void testReportInvalidBase64Variants() {
        try {
            parser._reportInvalidBase64(Base64Variants.MIME, '\n', 0, "test msg");
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Illegal white space character"));
        }

        try {
            parser._reportInvalidBase64(Base64Variants.MIME, '=', 0, null);
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Unexpected padding character"));
        }

        try {
            parser._reportInvalidBase64(Base64Variants.MIME, (char) 1, 0, null);
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Illegal character"));
        }

        try {
            parser._reportInvalidBase64(Base64Variants.MIME, 'A', 0, null);
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Illegal character 'A'"));
        }
    }

    @Test(expected = JsonParseException.class)
    public void testReportBase64EOF() throws JsonParseException {
        parser._reportBase64EOF();
    }

    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedCharNegative() throws JsonParseException {
        parser._reportUnexpectedChar(-1, "comment");
    }

    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedCharPositive() throws JsonParseException {
        parser._reportUnexpectedChar('x', "comment");
    }

    @Test(expected = JsonParseException.class)
    public void testThrowInvalidSpace() throws JsonParseException {
        parser._throwInvalidSpace('\t');
    }

    @Test
    public void testThrowUnquotedSpace() {
        try {
            parser._throwUnquotedSpace(' ', "context");
        } catch (JsonParseException e) {
            // If feature not enabled or > SPACE
        }
    }

    @Test
    public void testHandleUnrecognizedCharacterEscape() {
        try {
            parser._handleUnrecognizedCharacterEscape('x');
        } catch (JsonProcessingException e) {
            // Expected when features are disabled
        }
    }

    @Test
    public void testGetCharDesc() {
        assertTrue(ParserMinimalBase._getCharDesc('\n').contains("CTRL-CHAR"));
        assertTrue(ParserMinimalBase._getCharDesc(300).contains("code 300"));
        assertTrue(ParserMinimalBase._getCharDesc('a').contains("'a'"));
    }

    @Test
    public void testAsciiUtils() {
        byte[] bytes = ParserMinimalBase._asciiBytes("ABC");
        assertEquals(3, bytes.length);
        assertEquals("ABC", ParserMinimalBase._ascii(bytes));
    }
}