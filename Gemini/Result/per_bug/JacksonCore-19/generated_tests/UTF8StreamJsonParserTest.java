package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class UTF8StreamJsonParserTest {

    private IOContext ioContext;
    private ByteQuadsCanonicalizer symbols;
    private BufferRecycler recycler;

    @Before
    public void setUp() {
        recycler = new BufferRecycler();
        ioContext = new IOContext(recycler, "testSource", true);
        symbols = ByteQuadsCanonicalizer.createRoot();
    }

    @After
    public void tearDown() throws Exception {
        // Cleanup if needed
    }

    private UTF8StreamJsonParser createParser(String json) {
        byte[] bytes = json.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        return new UTF8StreamJsonParser(
                ioContext, 0, in, null, symbols,
                bytes, 0, bytes.length, true
        );
    }

    private UTF8StreamJsonParser createParserWithFeatures(String json, int features) {
        byte[] bytes = json.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        return new UTF8StreamJsonParser(
                ioContext, features, in, null, symbols,
                bytes, 0, bytes.length, true
        );
    }

    @Test
    public void testLifecycleAndReleaseBuffered() throws IOException {
        String json = "{\"a\":1}";
        byte[] bytes = json.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        // Start pointer at index 2 (skipping "{\")
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
                ioContext, 0, in, null, symbols,
                bytes, 2, bytes.length, true
        );

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int released = parser.releaseBuffered(out);
        assertTrue(released > 0);
        assertNotNull(parser.getInputSource());

        parser.close();
        assertNull(parser.getInputSource());
    }

    @Test
    public void testReleaseBufferedEmpty() throws IOException {
        String json = "";
        byte[] bytes = json.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
                ioContext, 0, in, null, symbols,
                bytes, 0, 0, false
        );
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int released = parser.releaseBuffered(out);
        assertEquals(0, released);
    }

    @Test
    public void testLoadMoreZeroReturnsFalse() throws IOException {
        InputStream zeroStream = new InputStream() {
            @Override
            public int read() { return -1; }
            @Override
            public int read(byte[] b, int off, int len) { return 0; }
        };
        byte[] buffer = new byte[10];
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
                ioContext, 0, zeroStream, null, symbols,
                buffer, 0, 10, false
        );
        try {
            parser.nextToken();
            fail("Expected IOException due to read() returning 0");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("returned 0 characters"));
        }
    }

    @Test
    public void testLoadToHaveAtLeastNoStream() throws IOException {
        byte[] buffer = new byte[10];
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
                ioContext, 0, null, null, symbols,
                buffer, 0, 0, false
        );
        // Should return false when _inputStream is null
        assertNull(parser.nextToken());
    }

    @Test
    public void testGetTextAndValueAsStringVariants() throws IOException {
        String json = "{\"name\":\"value\", \"field\":\"other\"}";
        UTF8StreamJsonParser parser = createParser(json);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("name", parser.getCurrentName());
        assertEquals("name", parser.getValueAsString());
        assertEquals("name", parser.getValueAsString("default"));

        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
        assertEquals("value", parser.getValueAsString());
        assertEquals("value", parser.getValueAsString("def"));
    }

    @Test
    public void testGetValueAsIntVariants() throws IOException {
        String json = "{\"num\": 123, \"float\": 12.34, \"str\": \"abc\"}";
        UTF8StreamJsonParser parser = createParser(json);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getValueAsInt());
        assertEquals(123, parser.getValueAsInt(999));

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(12, parser.getValueAsInt());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals(555, parser.getValueAsInt(555));
    }

    @Test
    public void testGetTextCharactersAndLengthOffsets() throws IOException {
        String json = "{\"key\": \"hello\"}";
        UTF8StreamJsonParser parser = createParser(json);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        
        char[] chars = parser.getTextCharacters();
        assertNotNull(chars);
        assertEquals(3, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());

        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertNotNull(parser.getTextCharacters());
        assertEquals(5, parser.getTextLength());
        assertTrue(parser.getTextOffset() >= 0);
    }

    @Test
    public void testGetTextBeforeAfterDocument() throws IOException {
        UTF8StreamJsonParser parser = createParser("{}");
        assertNull(parser.getTextCharacters());
        assertEquals(0, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testBinaryValueParsingAndBase64() throws IOException {
        // Base64 for "Hello" is SGVsbG8=
        String json = "{\"data\": \"SGVsbG8=\"}";
        UTF8StreamJsonParser parser = createParser(json);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());

        byte[] binary = parser.getBinaryValue(Base64Variants.MIME);
        assertNotNull(binary);
        assertEquals("Hello", new String(binary, java.nio.charset.StandardCharsets.UTF_8));

        // Call again to hit cached branch
        byte[] binaryCached = parser.getBinaryValue(Base64Variants.MIME);
        assertNotNull(binaryCached);
    }

    @Test
    public void testReadBinaryValueStream() throws IOException {
        String json = "{\"data\": \"SGVsbG8=\"}";
        UTF8StreamJsonParser parser = createParser(json);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // VALUE_STRING

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = parser.readBinaryValue(Base64Variants.MIME, out);
        assertTrue(len > 0);
        assertEquals("Hello", out.toString("UTF-8"));
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidBinaryTokenAccess() throws IOException {
        String json = "{\"data\": 123}";
        UTF8StreamJsonParser parser = createParser(json);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // VALUE_NUMBER_INT
        parser.getBinaryValue(Base64Variants.MIME);
    }

    @Test
    public void testNextTokenStructureAndMismatchedMarkers() throws IOException {
        String json = "[1, 2]}";
        UTF8StreamJsonParser parser = createParser(json);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        try {
            parser.nextToken();
            fail("Expected exception for mismatched end marker");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Mismatched"));
        }
    }

    @Test
    public void testNextTokenObjectMismatched() throws IOException {
        String json = "{\"a\":1]";
        UTF8StreamJsonParser parser = createParser(json);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // VALUE_NUMBER_INT
        try {
            parser.nextToken();
            fail("Expected exception for mismatched end marker");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Mismatched"));
        }
    }

    @Test
    public void testNextFieldNameAndValues() throws IOException {
        String json = "{\"str\":\"val\", \"num\":100, \"flt\":1.5, \"boolT\":true, \"boolF\":false, \"nil\":null, \"arr\":[], \"obj\":{}}";
        UTF8StreamJsonParser parser = createParser(json);

        assertNotNull(parser.nextFieldName());
        assertEquals("val", parser.nextTextValue());

        assertNotNull(parser.nextFieldName());
        assertEquals(100, parser.nextIntValue(0));

        assertNotNull(parser.nextFieldName());
        assertEquals(1L, parser.nextLongValue(0L));

        assertNotNull(parser.nextFieldName());
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());

        assertNotNull(parser.nextFieldName());
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());

        assertNotNull(parser.nextFieldName());
        assertNull(parser.nextBooleanValue()); // null token

        assertNotNull(parser.nextFieldName());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        assertNotNull(parser.nextFieldName());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testNumberParsingPosNegFloat() throws IOException {
        String json = "{\"zero\":0, \"pos\":12345, \"neg\":-987, \"sci\":1.23e4, \"zeroLead\":0}";
        UTF8StreamJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask());

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        
        parser.nextFieldName();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.getIntValue());

        parser.nextFieldName();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(12345, parser.getIntValue());

        parser.nextFieldName();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-987, parser.getIntValue());

        parser.nextFieldName();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());

        parser.nextFieldName();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidLeadingZeroes() throws IOException {
        String json = "{\"num\":0123}";
        UTF8StreamJsonParser parser = createParser(json);
        while(parser.nextToken() != null);
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidNegativeNumberStart() throws IOException {
        String json = "{\"num\":-abc}";
        UTF8StreamJsonParser parser = createParser(json);
        while(parser.nextToken() != null);
    }

    @Test
    public void testNonNumericNumbersNaNInfinity() throws IOException {
        String json = "{\"nan\":NaN, \"inf\":Infinity, \"negInf\":-Infinity}";
        UTF8StreamJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask());

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        parser.nextFieldName();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.NaN, parser.getDoubleValue(), 0.001);

        parser.nextFieldName();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 0.001);

        parser.nextFieldName();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue(), 0.001);
    }

    @Test
    public void testOddNamesAndSingleQuotesAndUnquoted() throws IOException {
        String json = "{'single':'val', unquoted:123}";
        int features = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask() | JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
        UTF8StreamJsonParser parser = createParserWithFeatures(json, features);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("single", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("unquoted", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void testUnquotedFieldNamesNotAllowed() throws IOException {
        String json = "{unquoted:123}";
        UTF8StreamJsonParser parser = createParser(json);
        while(parser.nextToken() != null);
    }

    @Test
    public void testCommentsAndYamlComments() throws IOException {
        String json = "{\n" +
                "  // line comment\n" +
                "  /* c comment */\n" +
                "  \"key\": # yaml comment\n" +
                "  123\n" +
                "}";
        int features = JsonParser.Feature.ALLOW_COMMENTS.getMask() | JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
        UTF8StreamJsonParser parser = createParserWithFeatures(json, features);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
    }

    @Test
    public void testEscapedNamesAndUnicode() throws IOException {
        String json = "{\"name\\u0001key\": 1}";
        UTF8StreamJsonParser parser = createParser(json);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertTrue(parser.getCurrentName().contains("key"));
    }

    @Test
    public void testSkipStringAndErrorHandling() throws IOException {
        String json = "{\"str\": \"abc\\n\\t\\u0041\"}";
        UTF8StreamJsonParser parser = createParser(json);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("abc\n\tA", parser.getText());
    }

    @Test
    public void testGetTokenAndCurrentLocation() throws IOException {
        String json = "{\"loc\": 10}";
        UTF8StreamJsonParser parser = createParser(json);
        assertNotNull(parser.getCurrentLocation());
        
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        assertNotNull(parser.getTokenLocation());
    }
}