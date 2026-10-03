package com.fasterxml.jackson.core.filter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonTokenId;

import java.io.IOException;

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
    public void testBasicInitializationAndGetters() throws IOException {
        String json = "{\"name\":\"test\",\"value\":123}";
        JsonParser p = jsonFactory.createParser(json);
        TokenFilter filter = TokenFilter.INCLUDE_ALL;
        
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, filter, true, true);

        assertEquals(filter, delegate.getFilter());
        assertEquals(0, delegate.getMatchCount());
        assertNull(delegate.getCurrentToken());
        assertNull(delegate.currentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, delegate.getCurrentTokenId());
        assertEquals(JsonTokenId.ID_NO_TOKEN, delegate.currentTokenId());
        assertFalse(delegate.hasCurrentToken());
        assertTrue(delegate.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertFalse(delegate.hasToken(JsonToken.START_OBJECT));
        assertFalse(delegate.isExpectedStartArrayToken());
        assertFalse(delegate.isExpectedStartObjectToken());
        assertNotNull(delegate.getCurrentLocation());
        assertNotNull(delegate.getParsingContext());

        delegate.close();
    }

    @Test
    public void testTokenIdAndMatchingChecks() throws IOException {
        String json = "[1, 2]";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        // Before advancing
        assertFalse(delegate.hasTokenId(JsonTokenId.ID_START_ARRAY));

        // Advance to START_ARRAY
        JsonToken t = delegate.nextToken();
        assertEquals(JsonToken.START_ARRAY, t);
        assertTrue(delegate.hasCurrentToken());
        assertTrue(delegate.hasToken(JsonToken.START_ARRAY));
        assertTrue(delegate.hasTokenId(JsonTokenId.ID_START_ARRAY));
        assertTrue(delegate.isExpectedStartArrayToken());
        assertFalse(delegate.isExpectedStartObjectToken());
        assertEquals(JsonTokenId.ID_START_ARRAY, delegate.getCurrentTokenId());
        assertEquals(JsonTokenId.ID_START_ARRAY, delegate.currentTokenId());

        delegate.close();
    }

    @Test
    public void testClearAndLastClearedToken() throws IOException {
        String json = "{\"a\":1}";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        // Clear when _currToken is null
        delegate.clearCurrentToken();
        assertNull(delegate.getLastClearedToken());

        // Advance and clear
        JsonToken t = delegate.nextToken(); // START_OBJECT
        assertNotNull(t);
        delegate.clearCurrentToken();
        assertNull(delegate.getCurrentToken());
        assertEquals(JsonToken.START_OBJECT, delegate.getLastClearedToken());

        delegate.close();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testOverrideCurrentNameThrowsException() throws IOException {
        String json = "{\"a\":1}";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        try {
            delegate.overrideCurrentName("newName");
        } finally {
            delegate.close();
        }
    }

    @Test
    public void testGetCurrentNameBranches() throws IOException {
        String json = "{\"obj\":{\"field\":1}}";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        // 1. Before any token, context parent might be null or root
        assertNull(delegate.getCurrentName());

        // START_OBJECT
        assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        assertNull(delegate.getCurrentName()); // parent is null/root -> returns parent's current name which is null

        // FIELD_NAME "obj"
        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals("obj", delegate.getCurrentName());

        // START_OBJECT for inner object
        assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        // When START_OBJECT, returns parent.getCurrentName() which should be "obj"
        assertEquals("obj", delegate.getCurrentName());

        // FIELD_NAME "field"
        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals("field", delegate.getCurrentName());

        delegate.close();
    }

    @Test
    public void testSkipChildrenEdgeCases() throws IOException {
        String json = "{\"a\":[1,2], \"b\":2}";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        // Current token is null, skipChildren should return this immediately
        assertSame(delegate, delegate.skipChildren());

        // Advance to START_OBJECT
        assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        // skipChildren on START_OBJECT should consume until matching END_OBJECT
        delegate.skipChildren();
        // After skipping, next token should be null or end of input
        // Let's verify by checking current token or next token behavior
        delegate.close();
    }

    @Test
    public void testNextValueAndAllowMultipleMatchesScalar() throws IOException {
        String json = "123";
        JsonParser p = jsonFactory.createParser(json);
        // _allowMultipleMatches = false, _includePath = false, INCLUDE_ALL scalar
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, false, false);

        // First nextToken() reads VALUE_NUMBER_INT (123)
        JsonToken t = delegate.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, t);

        // Second nextToken() triggers: !_allowMultipleMatches && (_currToken != null) && (_exposedContext == null)
        // and scalar value, !isStartHandled, !_includePath, INCLUDE_ALL -> returns null and sets _currToken = null
        JsonToken t2 = delegate.nextToken();
        assertNull(t2);

        delegate.close();
    }

    @Test
    public void testNextValueMethod() throws IOException {
        String json = "{\"key\":\"value\"}";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        // nextValue() should skip FIELD_NAME and return the value directly
        assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        JsonToken valToken = delegate.nextValue(); // Should encounter FIELD_NAME "key" then advance to VALUE_STRING "value"
        assertEquals(JsonToken.VALUE_STRING, valToken);
        assertEquals("value", delegate.getText());

        delegate.close();
    }
}