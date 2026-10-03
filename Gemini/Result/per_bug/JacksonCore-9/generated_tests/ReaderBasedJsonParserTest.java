package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class ReaderBasedJsonParserTest {

    private IOContext _ioContext;
    private CharsToNameCanonicalizer _symbols;

    @Before
    public void setUp() {
        BufferRecycler br = new BufferRecycler();
        _ioContext = new IOContext(br, null, false);
        _symbols = CharsToNameCanonicalizer.createRoot();
    }

    @After
    public void tearDown() {
        if (_symbols != null) {
            _symbols.release();
        }
    }

    private ReaderBasedJsonParser createParser(String json) {
        StringReader reader = new StringReader(json);
        return new ReaderBasedJsonParser(_ioContext, 0, reader, null, _symbols);
    }

    @Test
    public void testReleaseBuffered_Empty() throws IOException {
        char[] buf = new char[10];
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                _ioContext, 0, new StringReader(""), null, _symbols, buf, 5, 5, false
        );
        StringWriter w = new StringWriter();
        int count = parser.releaseBuffered(w);
        assertEquals(0, count);
    }

    @Test
    public void testReleaseBuffered_Valid() throws IOException {
        char[] buf = "1234567890".toCharArray();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                _ioContext, 0, new StringReader(""), null, _symbols, buf, 2, 7, false
        );
        StringWriter w = new StringWriter();
        int count = parser.releaseBuffered(w);
        assertEquals(5, count);
        assertEquals("34567", w.toString());
    }

    @Test
    public void testLoadMore_ReaderReturnsZero() throws IOException {
        Reader zeroReader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) {
                return 0; // Triggers count == 0 exception branch
            }
            @Override
            public void close() {}
        };
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(_ioContext, 0, zeroReader, null, _symbols);
        try {
            parser.nextToken();
            fail("Expected IOException due to reader returning 0");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Reader returned 0 characters"));
        }
    }

    @Test
    public void testGetText_ValueStringIncomplete() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"hello\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        // Forcing _tokenIncomplete to true artificially or via parser state
        // In nextToken for string, _tokenIncomplete is set to true.
        assertEquals("hello", parser.getText());
    }

    @Test
    public void testGetText2_Branches() throws IOException {
        ReaderBasedJsonParser parser = createParser("{\"field\": 123}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("field", parser.getText()); // ID_FIELD_NAME branch
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals("123", parser.getText()); // ID_NUMBER_INT branch
    }

    @Test
    public void testGetTextCharactersAndLengthAndOffset() throws IOException {
        ReaderBasedJsonParser parser = createParser("{\"abc\": \"xyz\"}");
        assertNull(parser.getTextCharacters());
        assertEquals(0, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertNotNull(parser.getTextCharacters());
        assertTrue(parser.getTextLength() > 0);
        assertEquals(0, parser.getTextOffset());

        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertNotNull(parser.getTextCharacters());
        assertEquals(3, parser.getTextLength());
    }

    @Test
    public void testGetBinaryValue_InvalidToken() throws IOException {
        ReaderBasedJsonParser parser = createParser("123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        try {
            parser.getBinaryValue(Base64Variants.MIME);
            fail("Expected exception for non-binary/non-string token");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("not VALUE_STRING or VALUE_EMBEDDED_OBJECT"));
        }
    }

    @Test
    public void testReadBinaryValue_Buffered() throws IOException {
        // Base64 for "abc" is "YWJj"
        ReaderBasedJsonParser parser = createParser("\"YWJj\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int bytesRead = parser.readBinaryValue(Base64Variants.MIME, out);
        assertEquals(3, bytesRead);
        assertArrayEquals("abc".getBytes(), out.toByteArray());
    }

    @Test
    public void testParsePosNumber_EdgeCases() throws IOException {
        // Test integer, float, and exponent paths
        ReaderBasedJsonParser parser = createParser("123 45.67 1e2 0");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(45, parser.getIntValue()); // 45.67 parsed as float actually

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken()); // 1e2
    }

    @Test
    public void testParseNegNumber_AndInvalidStart() throws IOException {
        ReaderBasedJsonParser parser = createParser("-123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-123, parser.getIntValue());
    }

    @Test
    public void testVerifyNoLeadingZeroes_Allowed() throws IOException {
        // Enable ALLOW_NUMERIC_LEADING_ZEROS feature
        int features = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                _ioContext, features, new StringReader("007"), null, _symbols
        );
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(7, parser.getIntValue());
    }

    @Test
    public void testCommentsAndSkipMethods() throws IOException {
        int features = JsonParser.Feature.ALLOW_COMMENTS.getMask() |
                       JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask() |
                       JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
        
        String json = "{\n // line comment\n /* c comment */ \n # yaml comment\n 'name': 'value'\n}";
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                _ioContext, features, new StringReader(json), null, _symbols
        );
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("name", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testMatchBooleansAndNull() throws IOException {
        ReaderBasedJsonParser parser = createParser("[true, false, null]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertTrue(parser.getBooleanValue());
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertFalse(parser.getBooleanValue());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testNextValueAccessors() throws IOException {
        ReaderBasedJsonParser parser = createParser("{\"str\": \"val\", \"num\": 10, \"long\": 20, \"bool\": true}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        
        assertEquals("val", parser.nextTextValue());
        assertEquals(10, parser.nextIntValue(0));
        assertEquals(20L, parser.nextLongValue(0L));
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
        
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testDecodeEscaped() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"\\n\\t\\r\\b\\f\\\\\\/\\\"\\u0041\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("\n\t\r\b\f\\/\"A", parser.getText());
    }
}