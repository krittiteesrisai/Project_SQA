package com.fasterxml.jackson.core.filter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class FilteringParserDelegateTest {

    private JsonFactory jsonFactory;

    @Before
    public void setUp() {
        jsonFactory = new JsonFactory();
    }

    @After
    public void tearDown() {
        jsonFactory = null;
    }

    @Test
    public void testTokenAccessorsAndStates() throws IOException {
        String json = "{\"name\":\"John\",\"age\":30}";
        JsonParser p = jsonFactory.createParser(json);
        TokenFilter filter = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, filter, true, true);

        // Initial state: no current token
        assertNull(delegate.getCurrentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, delegate.getCurrentTokenId());
        assertFalse(delegate.hasCurrentToken());
        assertTrue(delegate.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertFalse(delegate.hasTokenId(JsonTokenId.ID_STRING));
        assertFalse(delegate.hasToken(JsonToken.START_OBJECT));
        assertFalse(delegate.isExpectedStartArrayToken());
        assertFalse(delegate.isExpectedStartObjectToken());

        // Read START_OBJECT
        assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        assertTrue(delegate.hasCurrentToken());
        assertEquals(JsonTokenId.ID_START_OBJECT, delegate.getCurrentTokenId());
        assertTrue(delegate.hasTokenId(JsonTokenId.ID_START_OBJECT));
        assertTrue(delegate.hasToken(JsonToken.START_OBJECT));
        assertTrue(delegate.isExpectedStartObjectToken());
        assertNotNull(delegate.getCurrentLocation());
        assertNotNull(delegate.getTokenLocation());

        // Clear current token
        delegate.clearCurrentToken();
        assertNull(delegate.getCurrentToken());
        assertEquals(JsonToken.START_OBJECT, delegate.getLastClearedToken());

        delegate.close();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testOverrideCurrentNameThrowsException() throws IOException {
        String json = "{\"name\":\"John\"}";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        try {
            delegate.overrideCurrentName("newName");
        } finally {
            delegate.close();
        }
    }

    @Test
    public void testFilteringIncludeAllPath() throws IOException {
        String json = "{\"a\": 1, \"b\": [2, 3]}";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        assertNotNull(delegate.getFilter());
        assertEquals(0, delegate.getMatchCount());

        // Consume all tokens
        while (delegate.nextToken() != null) {
            // just iterate
        }
        delegate.close();
    }

    @Test
    public void testFilteringSpecificPropertyWithIncludePath() throws IOException {
        String json = "{\"target\": 123, \"other\": 456}";
        JsonParser p = jsonFactory.createParser(json);
        
        // Custom filter to include only "target"
        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                if ("target".equals(name)) {
                    return INCLUDE_ALL;
                }
                return null;
            }
        };

        FilteringParserDelegate delegate = new FilteringParserDelegate(p, filter, true, true);
        
        // Read through tokens
        JsonToken t;
        while ((t = delegate.nextToken()) != null) {
            if (t == JsonToken.FIELD_NAME) {
                assertEquals("target", delegate.getCurrentName());
            }
        }
        delegate.close();
    }

    @Test
    public void testFilteringNestedObjectAndArrayWithBuffering() throws IOException {
        String json = "{\"outer\": {\"target\": [1, 2, 3]}}";
        JsonParser p = jsonFactory.createParser(json);

        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                if ("target".equals(name) || "outer".equals(name)) {
                    return this;
                }
                return null;
            }
            @Override
            public TokenFilter filterStartObject() {
                return this;
            }
            @Override
            public TokenFilter filterStartArray() {
                return INCLUDE_ALL;
            }
        };

        FilteringParserDelegate delegate = new FilteringParserDelegate(p, filter, true, true);
        while (delegate.nextToken() != null) {
            // Exercise buffering paths (_nextTokenWithBuffering, _nextBuffered, etc.)
        }
        delegate.close();
    }

    @Test
    public void testSkipChildrenEdgeCases() throws IOException {
        String json = "{\"a\": [1, 2], \"b\": 3}";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        // When current token is not START_OBJECT or START_ARRAY, skipChildren should return 'this'
        assertEquals(delegate, delegate.skipChildren());

        // Move to START_OBJECT
        assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        // Now skipChildren should successfully skip the whole object
        assertEquals(delegate, delegate.skipChildren());

        delegate.close();
    }

    @Test
    public void testValueAccessorsAndCoercions() throws IOException {
        String json = "{\"str\":\"hello\",\"num\":123,\"dbl\":12.34,\"bool\":true}";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        while (delegate.nextToken() != null) {
            if (delegate.hasToken(JsonToken.VALUE_STRING)) {
                assertEquals("hello", delegate.getText());
                assertTrue(delegate.hasTextCharacters());
                assertNotNull(delegate.getTextCharacters());
                assertTrue(delegate.getTextLength() > 0);
                assertEquals(0, delegate.getTextOffset());
                assertEquals("hello", delegate.getValueAsString());
                assertEquals("default", delegate.getValueAsString("default"));
                assertNotNull(delegate.getEmbeddedObject());
            } else if (delegate.hasToken(JsonToken.VALUE_NUMBER_INT)) {
                assertEquals(123, delegate.getIntValue());
                assertEquals(123L, delegate.getLongValue());
                assertEquals(123, delegate.getShortValue());
                assertEquals((byte) 123, delegate.getByteValue());
                assertEquals(123.0, delegate.getDoubleValue(), 0.0);
                assertEquals(123.0f, delegate.getFloatValue(), 0.0f);
                assertEquals(BigDecimal.valueOf(123), delegate.getDecimalValue());
                assertEquals(BigInteger.valueOf(123), delegate.getBigIntegerValue());
                assertEquals(JsonParser.NumberType.INT, delegate.getNumberType());
                assertNotNull(delegate.getNumberValue());
                assertEquals(123, delegate.getValueAsInt());
                assertEquals(123, delegate.getValueAsInt(999));
                assertEquals(123L, delegate.getValueAsLong());
                assertEquals(123L, delegate.getValueAsLong(999L));
                assertEquals(12.34, delegate.getValueAsDouble(), 12.34);
                assertEquals(12.34, delegate.getValueAsDouble(99.9), 12.34);
            } else if (delegate.hasToken(JsonToken.VALUE_TRUE)) {
                assertTrue(delegate.getBooleanValue());
                assertTrue(delegate.getValueAsBoolean());
                assertTrue(delegate.getValueAsBoolean(false));
            }
        }
        delegate.close();
    }

    @Test
    public void testNextValueAndParsingContext() throws IOException {
        String json = "{\"key\": \"value\"}";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        assertNotNull(delegate.getParsingContext());
        
        // Test nextValue()
        JsonToken t = delegate.nextValue(); // Should skip FIELD_NAME and return value
        assertNotNull(t);

        delegate.close();
    }
}