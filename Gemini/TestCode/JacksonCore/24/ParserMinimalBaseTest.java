package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class ParserMinimalBaseTest {

    // Concrete implementation of ParserMinimalBase for testing abstract methods
    private static class DummyParser extends ParserMinimalBase {
        private JsonToken[] tokens;
        private int tokenIndex = 0;
        private String currentName = "testName";
        private boolean closed = false;

        public DummyParser(JsonToken... tokens) {
            this.tokens = tokens;
        }

        @Override
        public JsonToken nextToken() throws IOException {
            if (tokens != null && tokenIndex < tokens.length) {
                return _currToken = tokens[tokenIndex++];
            }
            return _currToken = null;
        }

        @Override
        protected void _handleEOF() throws JsonParseException {
            _reportInvalidEOF();
        }

        @Override
        public String getCurrentName() throws IOException { return currentName; }

        @Override
        public void close() throws IOException { closed = true; }

        @Override
        public boolean isClosed() { return closed; }

        @Override
        public JsonStreamContext getParsingContext() { return null; }

        @Override
        public void overrideCurrentName(String name) { this.currentName = name; }

        @Override
        public String getText() throws IOException { return "textValue"; }

        @Override
        public char[] getTextCharacters() throws IOException { return getText().toCharArray(); }

        @Override
        public boolean hasTextCharacters() { return true; }

        @Override
        public int getTextLength() throws IOException { return getText().length(); }

        @Override
        public int getTextOffset() throws IOException { return 0; }

        @Override
        public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return NO_BYTES; }

        @Override
        public Version version() { return Version.unknownVersion(); }

        // Exposing protected methods for testing
        public boolean callHasTextualNull(String val) { return _hasTextualNull(val); }
        public void callDecodeBase64(String str, ByteArrayBuilder builder, Base64Variant v) throws IOException {
            _decodeBase64(str, builder, v);
        }
        public String callLongIntegerDesc(String s) { return _longIntegerDesc(s); }
        public String callLongnumberDesc(String s) { return _longNumberDesc(s); }
        public String callGetCharDesc(int ch) { return _getCharDesc(ch); }
        public byte[] callAsciiBytes(String s) { return _asciiBytes(s); }
        public String callAscii(byte[] b) { return _ascii(b); }
    }

    // Another dummy parser with embedded object support
    private static class EmbeddedObjectParser extends DummyParser {
        private final Object embeddedObject;

        public EmbeddedObjectParser(JsonToken token, Object embeddedObject) {
            super(token);
            this.embeddedObject = embeddedObject;
        }

        @Override
        public Object getEmbeddedObject() throws IOException {
            return embeddedObject;
        }
    }

    @Test
    public void testTokenIdAndCurrentTokenMethods() throws Exception {
        DummyParser parser = new DummyParser();
        // _currToken is null
        assertNull(parser.currentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, parser.currentTokenId());
        assertNull(parser.getCurrentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, parser.getCurrentTokenId());
        assertFalse(parser.hasCurrentToken());
        assertTrue(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertFalse(parser.hasTokenId(JsonTokenId.ID_STRING));
        assertFalse(parser.hasToken(JsonToken.VALUE_STRING));

        // Set token to START_OBJECT (ID: ID_START_OBJECT)
        parser._currToken = JsonToken.START_OBJECT;
        assertEquals(JsonToken.START_OBJECT, parser.currentToken());
        assertEquals(JsonTokenId.ID_START_OBJECT, parser.currentTokenId());
        assertTrue(parser.hasCurrentToken());
        assertTrue(parser.hasTokenId(JsonTokenId.ID_START_OBJECT));
        assertFalse(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertTrue(parser.hasToken(JsonToken.START_OBJECT));
        assertFalse(parser.hasToken(JsonToken.VALUE_STRING));

        assertTrue(parser.isExpectedStartObjectToken());
        assertFalse(parser.isExpectedStartArrayToken());

        parser._currToken = JsonToken.START_ARRAY;
        assertTrue(parser.isExpectedStartArrayToken());
        assertFalse(parser.isExpectedStartObjectToken());
    }

    @Test
    public void testClearAndLastClearedToken() throws Exception {
        DummyParser parser = new DummyParser();
        parser._currToken = JsonToken.VALUE_STRING;
        assertNull(parser.getLastClearedToken());

        parser.clearCurrentToken();
        assertNull(parser.currentToken());
        assertEquals(JsonToken.VALUE_STRING, parser.getLastClearedToken());

        // Clearing when already null should do nothing
        parser.clearCurrentToken();
        assertEquals(JsonToken.VALUE_STRING, parser.getLastClearedToken());
    }

    @Test
    public void testNextValue() throws Exception {
        // First token FIELD_NAME, next token VALUE_STRING -> should return second token
        DummyParser parser = new DummyParser(JsonToken.FIELD_NAME, JsonToken.VALUE_STRING);
        JsonToken val = parser.nextValue();
        assertEquals(JsonToken.VALUE_STRING, val);

        // First token VALUE_STRING -> should return directly
        DummyParser parser2 = new DummyParser(JsonToken.VALUE_STRING);
        assertEquals(JsonToken.VALUE_STRING, parser2.nextValue());
    }

    @Test
    public void testSkipChildrenNonStructural() throws Exception {
        DummyParser parser = new DummyParser(JsonToken.VALUE_STRING);
        parser._currToken = JsonToken.VALUE_STRING;
        JsonParser result = parser.skipChildren();
        assertSame(parser, result);
    }

    @Test
    public void testSkipChildrenStructural() throws Exception {
        DummyParser parser = new DummyParser(JsonToken.START_OBJECT, JsonToken.FIELD_NAME, JsonToken.VALUE_STRING, JsonToken.END_OBJECT);
        parser._currToken = JsonToken.START_OBJECT;
        JsonParser result = parser.skipChildren();
        assertSame(parser, result);
    }

    @Test(expected = JsonParseException.class)
    public void testSkipChildrenEOF() throws Exception {
        DummyParser parser = new DummyParser(); // No more tokens, will trigger EOF
        parser._currToken = JsonToken.START_OBJECT;
        parser.skipChildren();
    }

    @Test
    public void testGetValueAsBoolean() throws Exception {
        DummyParser parser = new DummyParser();
        // Null token -> defaultValue
        parser._currToken = null;
        assertFalse(parser.getValueAsBoolean(false));
        assertTrue(parser.getValueAsBoolean(true));

        // TRUE token
        parser._currToken = JsonToken.VALUE_TRUE;
        assertTrue(parser.getValueAsBoolean(false));

        // FALSE/NULL token
        parser._currToken = JsonToken.VALUE_FALSE;
        assertFalse(parser.getValueAsBoolean(true));
        parser._currToken = JsonToken.VALUE_NULL;
        assertFalse(parser.getValueAsBoolean(true));

        // STRING token variants
        parser = new DummyParser() {
            @Override public String getText() { return "true"; }
        };
        parser._currToken = JsonToken.VALUE_STRING;
        assertTrue(parser.getValueAsBoolean(false));

        parser = new DummyParser() {
            @Override public String getText() { return "false"; }
        };
        parser._currToken = JsonToken.VALUE_STRING;
        assertFalse(parser.getValueAsBoolean(true));

        parser = new DummyParser() {
            @Override public String getText() { return "null"; }
        };
        parser._currToken = JsonToken.VALUE_STRING;
        assertFalse(parser.getValueAsBoolean(true));

        parser = new DummyParser() {
            @Override public String getText() { return "other"; }
        };
        parser._currToken = JsonToken.VALUE_STRING;
        assertFalse(parser.getValueAsBoolean(false));

        // EMBEDDED_OBJECT boolean
        EmbeddedObjectParser embParser = new EmbeddedObjectParser(JsonToken.VALUE_EMBEDDED_OBJECT, Boolean.TRUE);
        assertTrue(embParser.getValueAsBoolean(false));

        EmbeddedObjectParser embParserNonBool = new EmbeddedObjectParser(JsonToken.VALUE_EMBEDDED_OBJECT, "NotABool");
        assertFalse(embParserNonBool.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsInt() throws Exception {
        DummyParser parser = new DummyParser();
        parser._currToken = null;
        assertEquals(10, parser.getValueAsInt(10));

        parser._currToken = JsonToken.VALUE_TRUE;
        assertEquals(1, parser.getValueAsInt(0));

        parser._currToken = JsonToken.VALUE_FALSE;
        assertEquals(0, parser.getValueAsInt(5));

        parser._currToken = JsonToken.VALUE_NULL;
        assertEquals(0, parser.getValueAsInt(5));

        // String coercion
        parser = new DummyParser() {
            @Override public String getText() { return "42"; }
        };
        parser._currToken = JsonToken.VALUE_STRING;
        assertEquals(42, parser.getValueAsInt(0));

        // Textual null string coercion
        parser = new DummyParser() {
            @Override public String getText() { return "null"; }
        };
        parser._currToken = JsonToken.VALUE_STRING;
        assertEquals(0, parser.getValueAsInt(5));

        // Embedded object number
        EmbeddedObjectParser embParser = new EmbeddedObjectParser(JsonToken.VALUE_EMBEDDED_OBJECT, Integer.valueOf(99));
        assertEquals(99, embParser.getValueAsInt(0));
    }

    @Test
    public void testGetValueAsLong() throws Exception {
        DummyParser parser = new DummyParser();
        parser._currToken = null;
        assertEquals(10L, parser.getValueAsLong(10L));

        parser._currToken = JsonToken.VALUE_TRUE;
        assertEquals(1L, parser.getValueAsLong(0L));

        parser._currToken = JsonToken.VALUE_FALSE;
        assertEquals(0L, parser.getValueAsLong(5L));

        parser._currToken = JsonToken.VALUE_NULL;
        assertEquals(0L, parser.getValueAsLong(5L));

        // String coercion
        parser = new DummyParser() {
            @Override public String getText() { return "123456789"; }
        };
        parser._currToken = JsonToken.VALUE_STRING;
        assertEquals(123456789L, parser.getValueAsLong(0L));

        // Textual null
        parser = new DummyParser() {
            @Override public String getText() { return "null"; }
        };
        parser._currToken = JsonToken.VALUE_STRING;
        assertEquals(0L, parser.getValueAsLong(5L));

        // Embedded object number
        EmbeddedObjectParser embParser = new EmbeddedObjectParser(JsonToken.VALUE_EMBEDDED_OBJECT, Long.valueOf(88L));
        assertEquals(88L, embParser.getValueAsLong(0L));
    }

    @Test
    public void testGetValueAsDouble() throws Exception {
        DummyParser parser = new DummyParser();
        parser._currToken = null;
        assertEquals(5.5, parser.getValueAsDouble(5.5), 0.001);

        parser._currToken = JsonToken.VALUE_TRUE;
        assertEquals(1.0, parser.getValueAsDouble(0.0), 0.001);

        parser._currToken = JsonToken.VALUE_FALSE;
        assertEquals(0.0, parser.getValueAsDouble(5.5), 0.001);

        parser._currToken = JsonToken.VALUE_NULL;
        assertEquals(0.0, parser.getValueAsDouble(5.5), 0.001);

        // String coercion
        parser = new DummyParser() {
            @Override public String getText() { return "12.34"; }
        };
        parser._currToken = JsonToken.VALUE_STRING;
        assertEquals(12.34, parser.getValueAsDouble(0.0), 0.001);

        // Textual null
        parser = new DummyParser() {
            @Override public String getText() { return "null"; }
        };
        parser._currToken = JsonToken.VALUE_STRING;
        assertEquals(0.0, parser.getValueAsDouble(5.5), 0.001);

        // Embedded object number
        EmbeddedObjectParser embParser = new EmbeddedObjectParser(JsonToken.VALUE_EMBEDDED_OBJECT, Double.valueOf(9.9));
        assertEquals(9.9, embParser.getValueAsDouble(0.0), 0.001);
    }

    @Test
    public void testGetValueAsString() throws Exception {
        DummyParser parser = new DummyParser();
        // VALUE_STRING
        parser._currToken = JsonToken.VALUE_STRING;
        assertEquals("textValue", parser.getValueAsString());
        assertEquals("textValue", parser.getValueAsString("default"));

        // FIELD_NAME
        parser._currToken = JsonToken.FIELD_NAME;
        assertEquals("testName", parser.getValueAsString());
        assertEquals("testName", parser.getValueAsString("default"));

        // NULL or Scalar limits
        parser._currToken = null;
        assertNull(parser.getValueAsString());
        assertEquals("default", parser.getValueAsString("default"));

        parser._currToken = JsonToken.VALUE_NULL;
        assertNull(parser.getValueAsString());
        assertEquals("default", parser.getValueAsString("default"));
    }

    @Test
    public void testErrorReportingHelpers() throws Exception {
        DummyParser parser = new DummyParser();
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        
        try {
            parser.reportUnexpectedNumberChar('a', "comment");
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Unexpected character"));
        }

        try {
            parser.reportInvalidNumber("bad format");
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Invalid numeric value"));
        }

        try {
            parser._reportUnexpectedChar(-1, null);
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            // covers invalid EOF inside negative char
        }
    }

    @Test
    public void testStringAndCharacterFormatters() {
        DummyParser parser = new DummyParser();
        
        // Long integer/number descriptions (< 1000 and >= 1000)
        String shortNum = "12345";
        assertEquals(shortNum, parser.callLongIntegerDesc(shortNum));
        assertEquals(shortNum, parser.callLongnumberDesc(shortNum));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1005; i++) sb.append("1");
        String longNum = sb.toString();
        assertTrue(parser.callLongIntegerDesc(longNum).contains("[Integer with 1005 digits]"));
        assertTrue(parser.callLongnumberDesc("-" + longNum).contains("[number with 1005 characters]"));

        // Character descriptions
        assertTrue(parser.callGetCharDesc('\t').contains("CTRL-CHAR"));
        assertTrue(parser.callGetCharDesc(300).contains("code 300"));
        assertTrue(parser.callGetCharDesc('A').contains("'A'"));

        // Ascii conversions
        byte[] bytes = parser.callAsciiBytes("ABC");
        assertEquals(3, bytes.length);
        assertEquals("ABC", parser.callAscii(bytes));
    }
}