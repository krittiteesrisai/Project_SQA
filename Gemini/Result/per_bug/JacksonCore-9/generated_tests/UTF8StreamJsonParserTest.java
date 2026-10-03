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

    private IOContext _ioContext;
    private ByteQuadsCanonicalizer _symbols;

    @Before
    public void setUp() {
        BufferRecycler recycler = new BufferRecycler();
        _ioContext = new IOContext(recycler, "_testSource", true);
        _symbols = ByteQuadsCanonicalizer.createRoot();
    }

    @After
    public void tearDown() {
        // Cleanup if needed
    }

    private UTF8StreamJsonParser createParser(byte[] jsonBytes) {
        return new UTF8StreamJsonParser(
                _ioContext,
                JsonParser.Feature.collectDefaults(),
                new ByteArrayInputStream(jsonBytes),
                null,
                _symbols,
                jsonBytes,
                0,
                jsonBytes.length,
                true
        );
    }

    private UTF8StreamJsonParser createParserWithFeatures(byte[] jsonBytes, int features) {
        return new UTF8StreamJsonParser(
                _ioContext,
                features,
                new ByteArrayInputStream(jsonBytes),
                null,
                _symbols,
                jsonBytes,
                0,
                jsonBytes.length,
                true
        );
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        byte[] data = "12345".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        parser._inputPtr = 1; // ptr at '2'
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        assertEquals(4, count);
        assertArrayEquals("2345".getBytes("UTF-8"), out.toByteArray());

        // Edge case: count < 1
        parser._inputPtr = parser._inputEnd;
        assertEquals(0, parser.releaseBuffered(out));
    }

    @Test
    public void testLoadMoreAndLoadToHaveAtLeast() throws IOException {
        // Test loadMore with InputStream returning 0 or normal
        InputStream mockStream = new InputStream() {
            private boolean returnedZero = false;
            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                if (!returnedZero) {
                    returnedZero = true;
                    return 0; // triggers IOException("InputStream.read() returned 0...")
                }
                return -1;
            }
        };

        byte[] buf = new byte[10];
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
                _ioContext, 0, mockStream, null, _symbols, buf, 0, 0, true
        );

        try {
            parser.loadMore();
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("returned 0 characters"));
        }
    }

    @Test
    public void testGetTextAndValueAsString() throws IOException {
        byte[] json = "\"hello\"".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(json);
        
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertTrue(parser._tokenIncomplete);
        assertEquals("hello", parser.getText());
        assertFalse(parser._tokenIncomplete);

        // Subsequent call when not incomplete
        assertEquals("hello", parser.getText());
        assertEquals("hello", parser.getValueAsString());
        assertEquals("hello", parser.getValueAsString("default"));
    }

    @Test
    public void testGetText2EdgeCases() throws IOException {
        byte[] json = "123".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(json);
        assertNull(parser.getText()); // Before document
        
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        // Test _getText2 via non-string token
        assertEquals("123", parser.getText());
    }

    @Test
    public void testGetTextCharactersAndLength() throws IOException {
        byte[] json = "{\"name\":\"val\"}".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(json);
        
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        
        // Test FIELD_NAME branches in getTextCharacters, getTextLength, getTextOffset
        char[] chars = parser.getTextCharacters();
        assertNotNull(chars);
        assertEquals(4, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
        
        // Second call to test _nameCopied branch
        char[] chars2 = parser.getTextCharacters();
        assertNotNull(chars2);
    }

    @Test
    public void testGetValueAsInt() throws IOException {
        byte[] json = "123".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(json);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getValueAsInt());
        assertEquals(123, parser.getValueAsInt(99));

        byte[] jsonFloat = "12.34".getBytes("UTF-8");
        UTF8StreamJsonParser parserFloat = createParser(jsonFloat);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parserFloat.nextToken());
        assertEquals(12, parserFloat.getValueAsInt());
    }

    @Test
    public void testBinaryValueHandling() throws IOException {
        // Test invalid token for binary
        byte[] json = "123".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(json);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        try {
            parser.getBinaryValue(Base64Variants.MIME);
            fail("Expected exception for non-binary token");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("not VALUE_STRING or VALUE_EMBEDDED_OBJECT"));
        }

        // Test Base64 decoding with padding and escapes
        byte[] jsonStr = "\"SGVsbG8gV29ybGQ=\"".getBytes("UTF-8");
        UTF8StreamJsonParser parserBin = createParser(jsonStr);
        assertEquals(JsonToken.VALUE_STRING, parserBin.nextToken());
        byte[] decoded = parserBin.getBinaryValue(Base64Variants.MIME);
        assertNotNull(decoded);
        assertEquals("Hello World", new String(decoded, "UTF-8"));
    }

    @Test
    public void testReadBinaryValueStream() throws IOException {
        byte[] jsonStr = "\"SGVsbG8=\"".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(jsonStr);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = parser.readBinaryValue(Base64Variants.MIME, out);
        assertEquals(5, len);
        assertEquals("Hello", new String(out.toByteArray(), "UTF-8"));
    }

    @Test
    public void testNumberParsingEdgeCases() throws IOException {
        // Leading zeroes test
        byte[] json = "007".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParserWithFeatures(json, JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(7, parser.getIntValue());

        // Negative number invalid start
        byte[] jsonNegInvalid = "-a".getBytes("UTF-8");
        UTF8StreamJsonParser parserNeg = createParser(jsonNegInvalid);
        try {
            parserNeg.nextToken();
            fail("Expected exception for invalid negative number start");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("expected digit"));
        }

        // Float with exponent
        byte[] jsonFloat = "1.23e+2".getBytes("UTF-8");
        UTF8StreamJsonParser parserF = createParser(jsonFloat);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parserF.nextToken());
        assertEquals(123.0, parserF.getDoubleValue(), 0.001);
    }

    @Test
    public void testNameParsingVariations() throws IOException {
        // Medium and long names, single quotes, unquoted names
        byte[] json = "{abc: 1, 'def': 2, \"longFieldName1234567890\": 3}".getBytes("UTF-8");
        int features = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask() |
                       JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
        UTF8StreamJsonParser parser = createParserWithFeatures(json, features);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("abc", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("def", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("longFieldName1234567890", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextFieldNameWithSerializableString() throws IOException {
        byte[] json = "{\"targetField\": 42}".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(json);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        SerializableString target = new SerializedString("targetField");
        boolean matched = parser.nextFieldName(target);
        assertTrue(matched);
        assertEquals("targetField", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());
    }

    @Test
    public void testNextValueMethods() throws IOException {
        byte[] json = "{\"s\":\"val\", \"i\":100, \"l\":200L, \"b\":true}".getBytes("UTF-8");
        // Note: L in JSON is not standard, let's use valid numbers
        byte[] jsonValid = "{\"s\":\"val\", \"i\":100, \"l\":200, \"b\":true}".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(jsonValid);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals("val", parser.nextTextValue());
        assertEquals(100, parser.nextIntValue(0));
        assertEquals(200L, parser.nextLongValue(0L));
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testCommentsAndSpecialTokens() throws IOException {
        byte[] json = "[/* comment */ NaN, Infinity, -Infinity]".getBytes("UTF-8");
        int features = JsonParser.Feature.ALLOW_COMMENTS.getMask() |
                       JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
        UTF8StreamJsonParser parser = createParserWithFeatures(json, features);

        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isNaN(parser.getDoubleValue()));

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isInfinite(parser.getDoubleValue()));

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue(), 0.001);

        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testErrorHandlingInvalidToken() throws IOException {
        byte[] json = "[INVALID]".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(json);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        try {
            parser.nextToken();
            fail("Expected parse exception for unrecognized token");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Unrecognized token"));
        }
    }
}