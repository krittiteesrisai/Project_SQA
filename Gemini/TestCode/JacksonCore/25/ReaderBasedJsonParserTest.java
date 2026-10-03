package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;

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

    private ReaderBasedJsonParser createParser(String input, int features) {
        StringReader reader = new StringReader(input);
        return new ReaderBasedJsonParser(_ioContext, features, reader, null, _symbols);
    }

    @Test
    public void testGetTextForStringAndFieldAndNumbers() throws IOException {
        String json = "{\"name\": \"value\", \"int\": 123, \"float\": 12.34}";
        try (ReaderBasedJsonParser parser = createParser(json, 0)) {
            assertEquals(JsonToken.START_OBJECT, parser.nextToken());
            
            assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
            assertEquals("name", parser.getText());
            assertEquals("name", parser.getCurrentName());
            assertNotNull(parser.getTextCharacters());
            assertEquals(4, parser.getTextLength());
            assertEquals(0, parser.getTextOffset());

            assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
            assertEquals("value", parser.getText());
            assertEquals(5, parser.getTextLength());

            assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
            assertEquals(3, parser.getText(new java.io.StringWriter()));

            assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
            assertTrue(parser.getText().equals("123"));
            assertNotNull(parser.getTextCharacters());

            assertEquals(JsonToken.FIELD_NAME, parser.nextToken()); // for float
            assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
            assertTrue(parser.getText().contains("12.34"));

            assertEquals(JsonToken.END_OBJECT, parser.nextToken());
            assertNull(parser.getText());
        }
    }

    @Test
    public void testGetValueAsStringVariants() throws IOException {
        String json = "{\"str\":\"hello\", \"num\":456}";
        try (ReaderBasedJsonParser parser = createParser(json, 0)) {
            assertEquals(JsonToken.START_OBJECT, parser.nextToken());
            assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
            assertEquals("str", parser.getValueAsString());
            assertEquals("str", parser.getValueAsString("default"));

            assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
            assertEquals("hello", parser.getValueAsString());
            assertEquals("hello", parser.getValueAsString("default"));

            assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
            assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
            // For numeric value, getValueAsString uses super implementation
            assertEquals("456", parser.getValueAsString("def"));
        }
    }

    @Test
    public void testTextMethodsWithNullToken() throws IOException {
        try (ReaderBasedJsonParser parser = createParser("{}", 0)) {
            // Before nextToken()
            assertNull(parser.getText());
            assertEquals(0, parser.getText(new java.io.StringWriter()));
            assertNull(parser.getTextCharacters());
            assertEquals(0, parser.getTextLength());
            assertEquals(0, parser.getTextOffset());
        }
    }

    @Test
    public void testReadBinaryValueWithPaddingAndBase64() throws IOException {
        // Base64 encoded "Hello World!" -> SGVsbG8gV29ybGQh
        String json = "\"SGVsbG8gV29ybGQh\"";
        try (ReaderBasedJsonParser parser = createParser(json, 0)) {
            assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int bytesRead = parser.readBinaryValue(Base64Variants.MIME, out);
            assertTrue(bytesRead > 0);
            assertEquals("Hello World!", new String(out.toByteArray(), "UTF-8"));
        }
    }

    @Test
    public void testParseNumbersEdgeCases() throws IOException {
        // Test positive number, negative number, leading zeros, exponents, and float paths
        String json = "[0, 123, -456, 12.34, 1e5, 0.5e+2]";
        int features = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
        try (ReaderBasedJsonParser parser = createParser(json, features)) {
            assertEquals(JsonToken.START_ARRAY, parser.nextToken());
            assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
            assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
            assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
            assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
            assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
            assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
            assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        }
    }

    @Test
    public void testNonNumericNumbersNaNAndInfinity() throws IOException {
        String json = "[NaN, Infinity, -Infinity]";
        int features = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
        try (ReaderBasedJsonParser parser = createParser(json, features)) {
            assertEquals(JsonToken.START_ARRAY, parser.nextToken());
            assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
            assertEquals(Double.NaN, parser.getDoubleValue(), 0.0);
            assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
            assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 0.0);
            assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
            assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue(), 0.0);
            assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        }
    }

    @Test
    public void testCommentsAndSkips() throws IOException {
        String json = "{ /* comment */ # yaml comment\n \"a\" : 1 }";
        int features = JsonParser.Feature.ALLOW_COMMENTS.getMask() | 
                       JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
        try (ReaderBasedJsonParser parser = createParser(json, features)) {
            assertEquals(JsonToken.START_OBJECT, parser.nextToken());
            assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
            assertEquals("a", parser.getCurrentName());
            assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
            assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        }
    }

    @Test
    public void testNextValueAccessors() throws IOException {
        String json = "{\"str\":\"val\", \"num\":100, \"long\":200, \"bool\":true, \"arr\":[], \"obj\":{}}";
        try (ReaderBasedJsonParser parser = createParser(json, 0)) {
            assertEquals(JsonToken.START_OBJECT, parser.nextToken());
            
            assertEquals("val", parser.nextTextValue());
            assertEquals(100, parser.nextIntValue(0));
            assertEquals(200L, parser.nextLongValue(0L));
            assertEquals(Boolean.TRUE, parser.nextBooleanValue());
            
            // Trigger array/object next methods inside field name handling
            assertEquals("arr", parser.nextFieldName());
            assertEquals(JsonToken.START_ARRAY, parser.nextToken());
            
            assertEquals("obj", parser.nextFieldName());
            assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        }
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        try (ReaderBasedJsonParser parser = createParser("abc", 0)) {
            java.io.StringWriter writer = new java.io.StringWriter();
            int released = parser.releaseBuffered(writer);
            assertTrue(released >= 0);
        }
    }
}