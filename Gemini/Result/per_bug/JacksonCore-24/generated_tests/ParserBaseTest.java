package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class ParserBaseTest {

    private TestParser parser;
    private IOContext ioContext;

    // Concrete implementation of ParserBase for testing protected/abstract methods
    private static class TestParser extends ParserBase {
        public TestParser(IOContext ctxt, int features) {
            super(ctxt, features);
        }

        @Override
        protected void _closeInput() throws IOException {
            // No-op for testing
        }

        @Override
        public JsonToken nextToken() throws IOException {
            return _currToken;
        }

        // Expose protected fields/methods for testing
        public void setCurrToken(JsonToken t) {
            _currToken = t;
        }

        public void setNumberInt(int v) {
            _numberInt = v;
            _numTypesValid = NR_INT;
        }

        public void setNumberLong(long v) {
            _numberLong = v;
            _numTypesValid = NR_LONG;
        }

        public void setNumberDouble(double v) {
            _numberDouble = v;
            _numTypesValid = NR_DOUBLE;
        }

        public void setNumberBigInt(BigInteger v) {
            _numberBigInt = v;
            _numTypesValid = NR_BIGINT;
        }

        public void setNumberBigDecimal(BigDecimal v) {
            _numberBigDecimal = v;
            _numTypesValid = NR_BIGDECIMAL;
        }

        public void setIntLength(int len) {
            _intLength = len;
        }

        public void setNumberNegative(boolean neg) {
            _numberNegative = neg;
        }

        public void triggerNumTypesValid(int valid) {
            _numTypesValid = valid;
        }
    }

    @Before
    public void setUp() {
        BufferRecycler br = new BufferRecycler();
        ioContext = new IOContext(br, "testSource", false);
        parser = new TestParser(ioContext, 0);
    }

    @After
    public void tearDown() throws IOException {
        if (!parser.isClosed()) {
            parser.close();
        }
    }

    @Test
    public void testFeatureTogglingDuplicateDetection() {
        assertNull(parser.getParsingContext().getDupDetector());
        
        parser.enable(JsonParser.Feature.STRICT_DUPLICATE_DETECTION);
        assertNotNull(parser.getParsingContext().getDupDetector());

        // Enable again to hit branch where dup detector already exists
        parser.enable(JsonParser.Feature.STRICT_DUPLICATE_DETECTION);
        assertNotNull(parser.getParsingContext().getDupDetector());

        parser.disable(JsonParser.Feature.STRICT_DUPLICATE_DETECTION);
        assertNull(parser.getParsingContext().getDupDetector());

        // Disable again when already null
        parser.disable(JsonParser.Feature.STRICT_DUPLICATE_DETECTION);
        assertNull(parser.getParsingContext().getDupDetector());
    }

    @Test
    public void testSetFeatureMaskAndOverrides() {
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        parser.setFeatureMask(mask);
        assertNotNull(parser.getParsingContext().getDupDetector());

        parser.overrideStdFeatures(0, mask);
        assertNull(parser.getParsingContext().getDupDetector());

        // No change branch
        parser.setFeatureMask(0);
        parser.overrideStdFeatures(0, 0);
    }

    @Test
    public void testCurrentNameHandling() throws IOException {
        parser.setCurrToken(JsonToken.FIELD_NAME);
        // Default behavior reads from parsing context
        assertNull(parser.getCurrentName());

        parser.overrideCurrentName("testName");
        assertEquals("testName", parser.getCurrentName());

        // Test START_OBJECT / START_ARRAY context parent mapping
        parser.setCurrToken(JsonToken.START_OBJECT);
        // Create child context
        parser._parsingContext = parser._parsingContext.createChildObjectContext(1, 1);
        parser.overrideCurrentName("parentName");
        assertNotNull(parser.getCurrentName());
    }

    @Test
    public void testCloseAndLifecycle() throws IOException {
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
        // Double close should be safe
        parser.close();
    }

    @Test
    public void testHasTextCharacters() {
        parser.setCurrToken(JsonToken.VALUE_STRING);
        assertTrue(parser.hasTextCharacters());

        parser.setCurrToken(JsonToken.FIELD_NAME);
        parser._nameCopied = true;
        assertTrue(parser.hasTextCharacters());

        parser._nameCopied = false;
        assertFalse(parser.hasTextCharacters());

        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        assertFalse(parser.hasTextCharacters());
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueInvalidToken() throws IOException {
        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        parser.getBinaryValue(Base64Variants.getDefaultVariant());
    }

    @Test
    public void testNumericParsingAndAccessors() throws IOException {
        // Int parsing path (len <= 9)
        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        parser.setIntLength(5);
        parser.setNumberNegative(false);
        // Mocking text buffer via helper or fallback to slow int / parse numeric
        parser.triggerNumTypesValid(ParserMinimalBase.NR_UNKNOWN);
        
        try {
            parser.getIntValue();
        } catch (Exception e) {
            // Expected if text buffer is empty, but exercises the branch
        }
    }

    @Test
    public void testNumberConversionsOverflowAndTypes() throws IOException {
        // Test convertNumberToInt from Long
        parser.setNumberLong(100L);
        parser.triggerNumTypesValid(ParserMinimalBase.NR_LONG);
        assertEquals(100, parser.getIntValue());

        // Test convertNumberToInt overflow from Long
        parser.setNumberLong(Long.MAX_VALUE);
        parser.triggerNumTypesValid(ParserMinimalBase.NR_LONG);
        try {
            parser.getIntValue();
            fail("Expected exception for integer overflow");
        } catch (IOException e) {
            // expected
        }

        // Test convertNumberToLong from Int
        parser.setNumberInt(50);
        parser.triggerNumTypesValid(ParserMinimalBase.NR_INT);
        assertEquals(50L, parser.getLongValue());

        // Test convertNumberToDouble and BigDecimal conversions
        parser.setNumberInt(10);
        parser.triggerNumTypesValid(ParserMinimalBase.NR_INT);
        assertNotNull(parser.getDecimalValue());
        assertNotNull(parser.getBigIntegerValue());
        assertNotNull(parser.getDoubleValue());
        assertNotNull(parser.getFloatValue());
        assertNotNull(parser.getNumberType());
        assertNotNull(parser.getNumberValue());
    }

    @Test
    public void testIsNaN() {
        parser.setCurrToken(JsonToken.VALUE_NUMBER_FLOAT);
        parser.setNumberDouble(Double.NaN);
        parser.triggerNumTypesValid(ParserMinimalBase.NR_DOUBLE);
        assertTrue(parser.isNaN());

        parser.setNumberDouble(1.0);
        assertFalse(parser.isNaN());
    }

    @Test
    public void testGrowArrayBy() {
        int[] result = ParserBase.growArrayBy(null, 5);
        assertEquals(5, result.length);

        int[] existing = new int[] { 1, 2 };
        int[] grown = ParserBase.growArrayBy(existing, 2);
        assertEquals(4, grown.length);
        assertEquals(2, grown[1]);
    }
}