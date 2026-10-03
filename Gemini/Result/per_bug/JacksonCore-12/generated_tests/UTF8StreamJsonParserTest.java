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
        BufferRecycler br = new BufferRecycler();
        _ioContext = new IOContext(br, "testSource", false);
        _symbols = ByteQuadsCanonicalizer.createRoot();
    }

    @After
    public void tearDown() throws Exception {
        if (_symbols != null) {
            _symbols.release();
        }
    }

    private UTF8StreamJsonParser createParser(String json, JsonParser.Feature... features) throws IOException {
        byte[] bytes = json.getBytes("UTF-8");
        int flags = 0;
        for (JsonParser.Feature f : features) {
            flags |= f.getMask();
        }
        InputStream in = new ByteArrayInputStream(bytes);
        return new UTF8StreamJsonParser(_ioContext, flags, in, null, _symbols, bytes, 0, bytes.length, true);
    }

    @Test
    public void testReleaseBufferedEdgeCases() throws IOException {
        String json = "123";
        byte[] bytes = json.getBytes("UTF-8");
        // start == end -> count < 1 -> returns 0
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(_ioContext, 0, null, null, _symbols, bytes, bytes.length, bytes.length, false);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(0, parser.releaseBuffered(out));

        // count >= 1 -> writes out bytes
        UTF8StreamJsonParser parser2 = new UTF8StreamJsonParser(_ioContext, 0, null, null, _symbols, bytes, 0, bytes.length, false);
        assertEquals(bytes.length, parser2.releaseBuffered(out));
        assertArrayEquals(bytes, out.toByteArray());
        parser2.close();
    }

    @Test
    public void testInputStreamReadReturningZeroThrowsException() throws IOException {
        InputStream zeroReadStream = new InputStream() {
            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                return 0; // Trigger count == 0 exception
            }
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
        byte[] buffer = new byte[10];
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(_ioContext, 0, zeroReadStream, null, _symbols, buffer, 0, 0, false);
        
        try {
            parser.nextToken();
            fail("Expected IOException due to read() returning 0");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("returned 0 characters"));
        } finally {
            parser.close();
        }
    }

    @Test
    public void testGetValueAsStringVariants() throws IOException {
        // Test VALUE_STRING with incomplete token
        UTF8StreamJsonParser parser = createParser("\"hello\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getValueAsString("default"));

        // Test FIELD_NAME
        UTF8StreamJsonParser parserObj = createParser("{\"key\":\"val\"}");
        assertEquals(JsonToken.START_OBJECT, parserObj.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parserObj.nextToken());
        assertEquals("key", parserObj.getValueAsString());
        assertEquals("key", parserObj.getValueAsString("fallback"));
        parserObj.close();
    }

    @Test
    public void testGetValueAsIntVariants() throws IOException {
        UTF8StreamJsonParser parser = createParser("123 456");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getValueAsInt());
        assertEquals(123, parser.getValueAsInt(99));
        parser.close();
    }

    @Test
    public void testGetTextCharactersAndLengthAndOffset() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"name\":\"testValue\"}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        
        assertNotNull(parser.getTextCharacters());
        assertEquals(4, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
        
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertNotNull(parser.getTextCharacters());
        assertEquals(9, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
        parser.close();
    }

    @Test
    public void testGetBinaryValueErrorsAndDecodings() throws IOException {
        UTF8StreamJsonParser parser = createParser("123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        try {
            parser.getBinaryValue(Base64Variants.MIME);
            fail("Expected exception for non-string binary access");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("not VALUE_STRING"));
        }
        parser.close();
    }

    @Test
    public void testReadBinaryValueIncremental() throws IOException {
        // Base64 for "Hello" is SGVsbG8=
        UTF8StreamJsonParser parser = createParser("\"SGVsbG8=\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int bytesRead = parser.readBinaryValue(Base64Variants.MIME, out);
        assertEquals(5, bytesRead);
        assertArrayEquals("Hello".getBytes(), out.toByteArray());
        parser.close();
    }

    @Test
    public void testLeadingZeroesFeature() throws IOException {
        // With leading zeros allowed
        UTF8StreamJsonParser parser = createParser("0123", JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
        parser.close();

        // Without leading zeros allowed (should fail)
        UTF8StreamJsonParser parser2 = createParser("0123");
        try {
            parser2.nextToken();
            fail("Expected exception for leading zeroes");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Leading zeroes not allowed"));
        } finally {
            parser2.close();
        }
    }

    @Test
    public void testNegativeAndFloatNumbers() throws IOException {
        UTF8StreamJsonParser parser = createParser("-123.45e2");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-12345.0, parser.getDoubleValue(), 0.001);
        parser.close();
    }

    @Test
    public void testNextFieldNameWithMatchAndQuickSkip() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"targetField\":100}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        
        SerializableString target = new SerializedString("targetField");
        assertTrue(parser.nextFieldName(target));
        assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
        parser.close();
    }

    @Test
    public void testNextValueAccessors() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"str\":\"abc\",\"num\":10,\"lng\":20,\"bool\":true}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        
        assertEquals("abc", parser.nextTextValue());
        assertEquals(10, parser.nextIntValue(0));
        assertEquals(20L, parser.nextLongValue(0L));
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
        parser.close();
    }

    @Test
    public void testHandleUnexpectedValuesAndNonStandard() throws IOException {
        // ALLOW_NON_NUMERIC_NUMBERS for NaN and Infinity
        UTF8StreamJsonParser parser = createParser("NaN", JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isNaN(parser.getDoubleValue()));
        parser.close();

        UTF8StreamJsonParser parserInf = createParser("Infinity", JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parserInf.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, parserInf.getDoubleValue(), 0.0);
        parserInf.close();
    }

    @Test
    public void testSingleQuotesAndUnquotedNames() throws IOException {
        UTF8StreamJsonParser parser = createParser("{'unquoted': 'val'}名の", 
                JsonParser.Feature.ALLOW_SINGLE_QUOTES, 
                JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("unquoted", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("val", parser.getText());
        parser.close();
    }

    @Test
    public void testCommentsSkipping() throws IOException {
        UTF8StreamJsonParser parser = createParser("/* c-comment */ # yaml-comment\n {\"a\": 1}",
                JsonParser.Feature.ALLOW_COMMENTS,
                JsonParser.Feature.ALLOW_YAML_COMMENTS);
        
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        parser.close();
    }

    @Test
    public void testGrowArrayUtility() {
        int[] original = new int[]{1, 2, 3};
        int[] grown = UTF8StreamJsonParser.growArrayBy(original, 2);
        assertEquals(5, grown.length);
        assertEquals(1, grown[0]);
        
        int[] nullGrown = UTF8StreamJsonParser.growArrayBy(null, 4);
        assertEquals(4, nullGrown.length);
    }
}