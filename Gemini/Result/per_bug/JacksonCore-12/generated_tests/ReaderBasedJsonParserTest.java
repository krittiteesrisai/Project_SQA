package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;

public class ReaderBasedJsonParserTest {

    private ReaderBasedJsonParser createParser(String json) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, json, true);
        JsonFactory f = new JsonFactory();
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot().makeChild(f.getParserFeatures());
        StringReader reader = new StringReader(json);
        return new ReaderBasedJsonParser(ctxt, f.getParserFeatures(), reader, null, symbols);
    }

    private ReaderBasedJsonParser createParserWithBuffer(char[] buf, int start, int end, boolean recyclable) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, null, true);
        JsonFactory f = new JsonFactory();
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot().makeChild(f.getParserFeatures());
        return new ReaderBasedJsonParser(ctxt, f.getParserFeatures(), null, null, symbols, buf, start, end, recyclable);
    }

    @Test
    public void testLifecycleAndCodec() throws Exception {
        ReaderBasedJsonParser parser = createParser("{}");
        assertNull(parser.getCodec());
        ObjectCodec codec = new com.fasterxml.jackson.databind.ObjectMapper();
        parser.setCodec(codec);
        assertEquals(codec, parser.getCodec());
        assertNotNull(parser.getInputSource());
        parser.close();
    }

    @Test
    public void testReleaseBuffered() throws Exception {
        char[] buffer = "hello".toCharArray();
        ReaderBasedJsonParser parser = createParserWithBuffer(buffer, 0, 5, true);
        CharArrayWriter writer = new CharArrayWriter();
        int count = parser.releaseBuffered(writer);
        assertEquals(5, count);
        assertEquals("hello", writer.toString());

        // Count < 1 branch
        ReaderBasedJsonParser parserEmpty = createParserWithBuffer(buffer, 5, 5, true);
        assertEquals(0, parserEmpty.releaseBuffered(writer));
    }

    @Test(expected = IOException.class)
    public void testLoadMoreReturnsZero() throws Exception {
        // Mocking a Reader that returns 0
        Reader zeroReader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }
            @Override
            public void close() throws IOException {}
        };
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, null, true);
        JsonFactory f = new JsonFactory();
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot().makeChild(f.getParserFeatures());
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, f.getParserFeatures(), zeroReader, null, symbols);
        parser.nextToken();
    }

    @Test
    public void testGetTextAndValueAsStringVariants() throws Exception {
        // VALUE_STRING with token incomplete
        ReaderBasedJsonParser parser = createParser("\"testString\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("testString", parser.getValueAsString());
        assertEquals("testString", parser.getText());

        // FIELD_NAME
        ReaderBasedJsonParser parserObj = createParser("{\"field\":\"value\"}");
        assertEquals(JsonToken.START_OBJECT, parserObj.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parserObj.nextToken());
        assertEquals("field", parserObj.getValueAsString("def"));
        assertEquals("field", parserObj.getValueAsString());

        // Null token text
        ReaderBasedJsonParser parserNull = createParser("  ");
        assertNull(parserNull.getText());
    }

    @Test
    public void testTextCharactersAndLengthAndOffset() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"myField\": 123}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        
        assertNotNull(parser.getTextCharacters());
        assertEquals(7, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertNotNull(parser.getTextCharacters());
        assertTrue(parser.getTextLength() > 0);
        
        // Before/After document
        ReaderBasedJsonParser parserEmpty = createParser("");
        assertNull(parserEmpty.getTextCharacters());
        assertEquals(0, parserEmpty.getTextLength());
        assertEquals(0, parserEmpty.getTextOffset());
    }

    @Test
    public void testBinaryValueAccessAndReadBinary() throws Exception {
        // Base64 standard string: "bGlnaHQgd29yay4=" -> "light work."
        ReaderBasedJsonParser parser = createParser("\"bGlnaHQgd29yay4=\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        byte[] bytes = parser.getBinaryValue(Base64Variants.MIME);
        assertNotNull(bytes);

        // readBinaryValue with OutputStream
        ReaderBasedJsonParser parser2 = createParser("\"bGlnaHQgd29yay4=\"");
        assertEquals(JsonToken.VALUE_STRING, parser2.nextToken());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = parser2.readBinaryValue(Base64Variants.MIME, out);
        assertTrue(len > 0);

        // Binary value error case
        ReaderBasedJsonParser parserErr = createParser("123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parserErr.nextToken());
        try {
            parserErr.getBinaryValue(Base64Variants.MIME);
            fail("Expected exception for non-binary token");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("not VALUE_STRING"));
        }
    }

    @Test
    public void testNextTokenScopingAndErrors() throws Exception {
        // Mismatched end array/object
        ReaderBasedJsonParser parserArr = createParser("]");
        try {
            parserArr.nextToken();
            fail("Expected exception");
        } catch (Exception e) {
            // expected
        }

        ReaderBasedJsonParser parserObj = createParser("}");
        try {
            parserObj.nextToken();
            fail("Expected exception");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testNextFieldNameAndValues() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"f1\": \"v1\", \"f2\": 123, \"f3\": true, \"f4\": false, \"f5\": null, \"f6\": [], \"f7\": {}}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        
        assertTrue(parser.nextFieldName(new SerializedString("f1")));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("v1", parser.getText());

        assertEquals("f2", parser.nextFieldName());
        assertEquals(123, parser.nextIntValue(0));

        assertEquals("f3", parser.nextFieldName());
        assertTrue(parser.nextBooleanValue());

        assertEquals("f4", parser.nextFieldName());
        assertFalse(parser.nextBooleanValue());

        assertEquals("f5", parser.nextFieldName());
        assertNull(parser.nextBooleanValue());

        assertEquals("f6", parser.nextFieldName());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        assertEquals("f7", parser.nextFieldName());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testNumberParsingEdges() throws Exception {
        // Positive number with exponent, decimals, and leading zeros
        ReaderBasedJsonParser parser = createParser("[0, 123, 123.45, 1.23e2, 1.23E+2, 1.23e-2]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.getIntValue());
        
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(123.45, parser.getDoubleValue(), 0.001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(123.0, parser.getDoubleValue(), 0.001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(123.0, parser.getDoubleValue(), 0.001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(0.0123, parser.getDoubleValue(), 0.0001);
    }

    @Test
    public void testNegativeNumberAndInvalidNumbers() throws Exception {
        ReaderBasedJsonParser parser = createParser("[-123, -0.45]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-123, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-0.45, parser.getDoubleValue(), 0.001);
    }

    @Test
    public void testNonNumericNumbersAndOddValues() throws Exception {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, null, true);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot().makeChild(f.getParserFeatures());
        
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, f.getParserFeatures(), new StringReader("[NaN, Infinity, -Infinity]"), null, symbols);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isNaN(parser.getDoubleValue()));
        
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isInfinite(parser.getDoubleValue()));

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isInfinite(parser.getDoubleValue()));
    }

    @Test
    public void testCommentsAndSkipMethods() throws Exception {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_COMMENTS);
        f.enable(JsonParser.Feature.ALLOW_YAML_COMMENTS);

        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, null, true);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot().makeChild(f.getParserFeatures());

        String json = "{\n // line comment\n /* c comment */ \n # yaml comment\n \"key\": \"val\"\n}";
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, f.getParserFeatures(), new StringReader(json), null, symbols);
        
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("val", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testSingleQuotesAndUnquotedNames() throws Exception {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        f.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);

        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, null, true);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot().makeChild(f.getParserFeatures());

        String json = "{unquoted: 'single quoted string'}";
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, f.getParserFeatures(), new StringReader(json), null, symbols);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("unquoted", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("single quoted string", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testLocationsAndTokenLocation() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"a\": 1}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertNotNull(parser.getCurrentLocation());
        assertNotNull(parser.getTokenLocation());
    }
}