package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;

import static org.junit.Assert.*;

public class ReaderBasedJsonParserTest {

    private IOContext _ioContext;
    private CharsToNameCanonicalizer _symbols;

    @Before
    public void setUp() {
        BufferRecycler recycler = new BufferRecycler();
        _ioContext = new IOContext(recycler, recycler, true);
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

    private ReaderBasedJsonParser createParserWithFeatures(String json, int features) {
        StringReader reader = new StringReader(json);
        return new ReaderBasedJsonParser(_ioContext, features, reader, null, _symbols);
    }

    @Test
    public void testLifeCycleAndCodec() throws Exception {
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
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                _ioContext, 0, new StringReader("hello"), null, _symbols,
                buffer, 0, 5, true
        );
        java.io.StringWriter writer = new java.io.StringWriter();
        int count = parser.releaseBuffered(writer);
        assertEquals(5, count);
        assertEquals("hello", writer.toString());

        // Test count < 1 branch
        ReaderBasedJsonParser parserEmpty = new ReaderBasedJsonParser(
                _ioContext, 0, new StringReader(""), null, _symbols,
                buffer, 5, 5, true
        );
        assertEquals(0, parserEmpty.releaseBuffered(writer));
        parser.close();
        parserEmpty.close();
    }

    @Test
    public void testGetTextVariations() throws Exception {
        // String value with incomplete token flag
        ReaderBasedJsonParser parser = createParser("\"testString\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("testString", parser.getText());
        assertEquals("testString", parser.getValueAsString());
        assertEquals("testString", parser.getValueAsString("default"));

        // Field name & getTextCharacters / length / offset
        ReaderBasedJsonParser parserObj = createParser("{\"myField\": 123}");
        assertEquals(JsonToken.START_OBJECT, parserObj.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parserObj.nextToken());
        assertEquals("myField", parserObj.getText());
        assertEquals("myField", parserObj.getValueAsString());
        assertNotNull(parserObj.getTextCharacters());
        assertEquals(7, parserObj.getTextLength());
        assertEquals(0, parserObj.getTextOffset());

        // Number types
        assertEquals(JsonToken.VALUE_NUMBER_INT, parserObj.nextToken());
        assertEquals("123", parserObj.getText());
        assertNotNull(parserObj.getTextCharacters());
        assertTrue(parserObj.getTextLength() > 0);

        // Null token text
        ReaderBasedJsonParser parserNull = createParser("null");
        assertNull(parserNull.getText());
        assertNull(parserNull.getTextCharacters());
        assertEquals(0, parserNull.getTextLength());
        assertEquals(0, parserNull.getTextOffset());
        parser.close();
        parserObj.close();
        parserNull.close();
    }

    @Test
    public void testBinaryValueParsing() throws Exception {
        // Valid Base64 string value
        ReaderBasedJsonParser parser = createParser("\"Zm9v\""); // "foo"
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        byte[] bytes = parser.getBinaryValue(Base64Variants.MIME);
        assertNotNull(bytes);
        assertEquals("foo", new String(bytes));

        // Read binary value via OutputStream
        ReaderBasedJsonParser parserStream = createParser("\"Zm9v\"");
        assertEquals(JsonToken.VALUE_STRING, parserStream.nextToken());
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        int len = parserStream.readBinaryValue(Base64Variants.MIME, out);
        assertEquals(3, len);
        assertEquals("foo", out.toString());
        parser.close();
        parserStream.close();
    }

    @Test(expected = IOException.class)
    public void testBinaryValueInvalidTokenThrowsException() throws Exception {
        ReaderBasedJsonParser parser = createParser("123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        parser.getBinaryValue(Base64Variants.MIME);
        parser.close();
    }

    @Test
    public void testNextValuesAndXxxValue() throws Exception {
        ReaderBasedJsonParser parser = createParser("{\"str\":\"val\",\"num\":100,\"long\":999999,\"bool\":true}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        // nextFieldName & nextTextValue
        assertTrue(parser.nextFieldName(new SerializedString("str")));
        assertEquals("val", parser.nextTextValue());

        // nextIntValue
        assertTrue(parser.nextFieldName(new SerializedString("num")));
        assertEquals(100, parser.nextIntValue(-1));

        // nextLongValue
        assertTrue(parser.nextFieldName(new SerializedString("long")));
        assertEquals(999999L, parser.nextLongValue(-1L));

        // nextBooleanValue
        assertTrue(parser.nextFieldName(new SerializedString("bool")));
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNumberParsingEdges() throws Exception {
        // Positive integer, negative integer, float, exponent
        ReaderBasedJsonParser parser = createParser("[0, 5, -5, 12.34, 1e2, -1.5E-2]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(5, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-5, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(12.34, parser.getDoubleValue(), 0.001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(100.0, parser.getDoubleValue(), 0.001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-0.015, parser.getDoubleValue(), 0.001);

        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNonNumericNumbersAllowFeature() throws Exception {
        int features = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
        ReaderBasedJsonParser parser = createParserWithFeatures("[NaN, Infinity, -Infinity]", features);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isNaN(parser.getDoubleValue()));

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isInfinite(parser.getDoubleValue()));
        assertTrue(parser.getDoubleValue() > 0);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isInfinite(parser.getDoubleValue()));
        assertTrue(parser.getDoubleValue() < 0);

        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test(expected = IOException.class)
    public void testNonNumericNumbersDisallowedThrowsException() throws Exception {
        ReaderBasedJsonParser parser = createParser("[NaN]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        parser.nextToken(); // Should trigger exception when ALLOW_NON_NUMERIC_NUMBERS is disabled
        parser.close();
    }

    @Test
    public void testCommentsAndSingleQuotes() throws Exception {
        int features = JsonParser.Feature.ALLOW_COMMENTS.getMask() |
                       JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask() |
                       JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
        
        String json = "{ 'field': /* comment */ # yaml comment\n 'value' }";
        ReaderBasedJsonParser parser = createParserWithFeatures(json, features);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("field", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testLocationAndErrors() throws Exception {
        ReaderBasedJsonParser parser = createParser("  [\n 123 \n]");
        assertNotNull(parser.getCurrentLocation());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertNotNull(parser.getTokenLocation());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNotNull(parser.getCurrentLocation());
        parser.close();
    }
}