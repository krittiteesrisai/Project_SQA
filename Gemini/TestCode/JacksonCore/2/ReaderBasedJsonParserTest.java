package com.fasterxml.jackson.core.json;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class ReaderBasedJsonParserTest {

    private IOContext ioContext;
    private CharsToNameCanonicalizer symbols;

    @Before
    public void setUp() {
        BufferRecycler recycler = new BufferRecycler();
        ioContext = new IOContext(recycler, recycler, false);
        symbols = CharsToNameCanonicalizer.createRoot();
    }

    @After
    public void tearDown() {
        if (symbols != null) {
            symbols.release();
        }
    }

    private ReaderBasedJsonParser createParser(String content, int features) {
        StringReader reader = new StringReader(content);
        return new ReaderBasedJsonParser(ioContext, features, reader, null, symbols);
    }

    @Test
    public void testReleaseBuffered_Empty() throws IOException {
        ReaderBasedJsonParser parser = createParser("", 0);
        CharArrayWriter writer = new CharArrayWriter();
        int count = parser.releaseBuffered(writer);
        assertEquals(0, count);
        parser.close();
    }

    @Test
    public void testReleaseBuffered_WithData() throws IOException {
        ReaderBasedJsonParser parser = createParser("12345", 0);
        // Load data into buffer first
        parser.nextToken();
        CharArrayWriter writer = new CharArrayWriter();
        int count = parser.releaseBuffered(writer);
        assertTrue(count >= 0);
        parser.close();
    }

    @Test
    public void testGetInputSource() {
        StringReader reader = new StringReader("test");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ioContext, 0, reader, null, symbols);
        assertSame(reader, parser.getInputSource());
    }

    @Test
    public void testGetAndSetCodec() {
        ReaderBasedJsonParser parser = createParser("{}", 0);
        assertNull(parser.getCodec());
        // We can pass null or mock-like codec since ObjectCodec interface can be tested with null
        parser.setCodec(null);
        assertNull(parser.getCodec());
    }

    @Test
    public void testParseSimpleNumbers() throws IOException {
        // Integer, Float, Negative, Exponent
        ReaderBasedJsonParser parser = createParser("42 -123 3.14 1e10 -2.5E-3", 0);
        
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());
        
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-123, parser.getIntValue());
        
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(3.14, parser.getDoubleValue(), 0.001);
        
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(1e10, parser.getDoubleValue(), 0.001);
        
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-2.5E-3, parser.getDoubleValue(), 0.0001);
        
        parser.close();
    }

    @Test(expected = IOException.class)
    public void testLoadMoreZeroException() throws IOException {
        // Simulate a reader that returns 0 characters
        java.io.Reader zeroReader = new java.io.Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }
            @Override
            public void close() throws IOException {}
        };
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ioContext, 0, zeroReader, null, symbols);
        parser.nextToken();
    }

    @Test
    public void testTextAccessors() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"hello world\"", 0);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello world", parser.getText());
        assertNotNull(parser.getTextCharacters());
        assertEquals(11, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
        assertEquals("hello world", parser.getValueAsString());
        assertEquals("hello world", parser.getValueAsString("default"));
        parser.close();
    }

    @Test
    public void testFieldNameAndTextValue() throws IOException {
        ReaderBasedJsonParser parser = createParser("{\"key\": \"val\"}", 0);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getCurrentName());
        assertEquals("key", parser.getText());
        
        assertEquals("val", parser.nextTextValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextIntValueAndLongValue() throws IOException {
        ReaderBasedJsonParser parser = createParser("{\"i\": 100, \"l\": 9999999999}", 0);
        parser.nextToken(); // START_OBJECT
        
        parser.nextToken(); // FIELD_NAME "i"
        assertEquals(100, parser.nextIntValue(0));
        
        parser.nextToken(); // FIELD_NAME "l"
        assertEquals(9999999999L, parser.nextLongValue(0L));
        
        parser.nextToken(); // END_OBJECT
        parser.close();
    }

    @Test
    public void testNextBooleanValue() throws IOException {
        ReaderBasedJsonParser parser = createParser("{\"b1\": true, \"b2\": false}", 0);
        parser.nextToken(); // START_OBJECT
        
        parser.nextToken(); // FIELD_NAME "b1"
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
        
        parser.nextToken(); // FIELD_NAME "b2"
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());
        
        parser.nextToken(); // END_OBJECT
        parser.close();
    }

    @Test
    public void testBinaryValueParsing() throws IOException {
        // Base64 encoded "Hello" -> SGVsbG8=
        ReaderBasedJsonParser parser = createParser("\"SGVsbG8=\"", 0);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        byte[] bytes = parser.getBinaryValue(Base64Variants.MIME);
        assertNotNull(bytes);
        assertEquals("Hello", new String(bytes));
        
        // Test readBinaryValue with OutputStream
        ReaderBasedJsonParser parser2 = createParser("\"SGVsbG8=\"", 0);
        assertEquals(JsonToken.VALUE_STRING, parser2.nextToken());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = parser2.readBinaryValue(Base64Variants.MIME, out);
        assertTrue(len > 0);
        assertEquals("Hello", out.toString());
        
        parser.close();
        parser2.close();
    }

    @Test
    public void testSpecialTokensAndOddValues() throws IOException {
        int features = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask() |
                       JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask() |
                       JsonParser.Feature.ALLOW_COMMENTS.getMask() |
                       JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();

        // Testing NaN, Infinity, single quotes, and comments
        ReaderBasedJsonParser parser = createParser("[NaN, Infinity, 'single', /* C comment */ # YAML comment\n true, false, null]", features);
        
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isNaN(parser.getDoubleValue()));
        
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isInfinite(parser.getDoubleValue()));
        
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("single", parser.getText());
        
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test(expected = IOException.class)
    public void testInvalidNumberStartException() throws IOException {
        ReaderBasedJsonParser parser = createParser("-INVALID", 0);
        parser.nextToken();
    }

    @Test
    public void testCloseInputAndBuffers() throws IOException {
        ReaderBasedJsonParser parser = createParser("123", JsonParser.Feature.AUTO_CLOSE_SOURCE.getMask());
        parser.nextToken();
        parser.close();
        // Ensure no exception on double close or release
        parser._releaseBuffers();
    }
}