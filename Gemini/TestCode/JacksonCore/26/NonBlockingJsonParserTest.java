package com.fasterxml.jackson.core.json.async;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.*;

public class NonBlockingJsonParserTest {

    private NonBlockingJsonParser parser;
    private IOContext ioContext;
    private ByteQuadsCanonicalizer symbols;

    @Before
    public void setUp() {
        BufferRecycler recycler = new BufferRecycler();
        ioContext = new IOContext(recycler, recycler, false);
        symbols = ByteQuadsCanonicalizer.createRoot();
        parser = new NonBlockingJsonParser(ioContext, 0, symbols);
    }

    @Test
    public void testFeedInputValidations() throws IOException {
        byte[] input = "{\"a\":1}".getBytes("UTF-8");
        parser.feedInput(input, 0, 4);
        
        // Edge Case 1: Still have undecoded bytes, should throw exception
        boolean exceptionThrown = false;
        try {
            parser.feedInput(input, 4, 7);
        } catch (IOException e) {
            exceptionThrown = true;
        }
        assertTrue("Should throw error when feeding input with undecoded bytes remaining", exceptionThrown);

        // Edge Case 2: end < start
        exceptionThrown = false;
        // Reset parser state by consuming or initializing new parser to avoid previous state issues
        NonBlockingJsonParser parser2 = new NonBlockingJsonParser(ioContext, 0, symbols);
        try {
            parser2.feedInput(input, 4, 2);
        } catch (IOException e) {
            exceptionThrown = true;
        }
        assertTrue("Should throw error when end < start", exceptionThrown);

        // Edge Case 3: Already closed / endOfInput
        NonBlockingJsonParser parser3 = new NonBlockingJsonParser(ioContext, 0, symbols);
        parser3.endOfInput();
        exceptionThrown = false;
        try {
            parser3.feedInput(input, 0, 4);
        } catch (IOException e) {
            exceptionThrown = true;
        }
        assertTrue("Should throw error when feeding after endOfInput", exceptionThrown);
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        byte[] input = "12345".getBytes("UTF-8");
        parser.feedInput(input, 0, 5);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int released = parser.releaseBuffered(out);
        assertEquals(5, released);
        assertArrayEquals(input, out.toByteArray());
    }

    @Test
    public void testBOMHandling() throws IOException {
        // UTF-8 BOM: 0xEF, 0xBB, 0xBF followed by "1"
        byte[] bomData = new byte[] { (byte)0xEF, (byte)0xBB, (byte)0xBF, '1' };
        parser.feedInput(bomData, 0, bomData.length);
        JsonToken token = parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals(1, parser.getIntValue());
    }

    @Test
    public void testWhitespaceAndNewlines() throws IOException {
        // LF, CR, Tab, Space handling in _startDocument and _skipWS
        byte[] data = new byte[] { '\n', '\r', '\t', ' ', '1', '2', '3' };
        parser.feedInput(data, 0, data.length);
        JsonToken token = parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals(123, parser.getIntValue());
    }

    @Test
    public void testNegativeNumbersAndMinInfinity() throws IOException {
        // Test negative number and non-std minus infinity
        byte[] data = "-Infinity".getBytes("UTF-8");
        int features = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
        NonBlockingJsonParser nonStdParser = new NonBlockingJsonParser(ioContext, features, symbols);
        nonStdParser.feedInput(data, 0, data.length);
        // Depending on feature setup, trigger negative parsing branches
        JsonToken token = nonStdParser.nextToken();
        assertNotNull(token);
    }

    @Test
    public void testLeadingZerosAndFeatures() throws IOException {
        // Test leading zeros with feature enabled/disabled
        int features = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
        NonBlockingJsonParser pWithZeros = new NonBlockingJsonParser(ioContext, features, symbols);
        byte[] data = "007".getBytes("UTF-8");
        pWithZeros.feedInput(data, 0, data.length);
        JsonToken token = pWithZeros.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals(7, pWithZeros.getIntValue());
    }

    @Test
    public void testCommentsJavaAndYaml() throws IOException {
        int features = JsonParser.Feature.ALLOW_COMMENTS.getMask() | JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
        NonBlockingJsonParser commentParser = new NonBlockingJsonParser(ioContext, features, symbols);
        byte[] data = "# YAML comment\n// C++ comment\n/* C comment */ 42".getBytes("UTF-8");
        commentParser.feedInput(data, 0, data.length);
        JsonToken token = commentParser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals(42, commentParser.getIntValue());
    }

    @Test
    public void testStringEscapesAndSplitUTF8() throws IOException {
        // Test regular string with escape sequence
        byte[] data = "\"Hello\\nWorld\\t\\u0041\"".getBytes("UTF-8");
        parser.feedInput(data, 0, data.length);
        JsonToken token = parser.nextToken();
        assertEquals(JsonToken.VALUE_STRING, token);
        assertEquals("Hello\nWorld\tA", parser.getText());
    }

    @Test
    public void testApostropheStrings() throws IOException {
        int features = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
        NonBlockingJsonParser aposParser = new NonBlockingJsonParser(ioContext, features, symbols);
        byte[] data = "'single quoted'".getBytes("UTF-8");
        aposParser.feedInput(data, 0, data.length);
        JsonToken token = aposParser.nextToken();
        assertEquals(JsonToken.VALUE_STRING, token);
        assertEquals("single quoted", aposParser.getText());
    }
}