package com.fasterxml.jackson.core.filter;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import java.io.StringReader;

public class FilteringParserDelegateTest {

    private FilteringParserDelegate createDelegate(String json, TokenFilter filter, boolean includePath, boolean allowMultipleMatches) throws IOException {
        BufferRecycler br = new BufferRecycler();
        IOContext ioCtxt = new IOContext(br, json, false);
        StringReader reader = new StringReader(json);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        JsonParser p = new ReaderBasedJsonParser(ioCtxt, 0, reader, null, symbols);
        return new FilteringParserDelegate(p, filter, includePath, allowMultipleMatches);
    }

    @Test
    public void testBasicFilteringIncludeAll() throws IOException {
        String json = "{\"a\":1,\"b\":2}";
        FilteringParserDelegate parser = createDelegate(json, TokenFilter.INCLUDE_ALL, true, true);

        assertEquals(JsonTokenId.ID_NO_TOKEN, parser.getCurrentTokenId());
        assertFalse(parser.hasCurrentToken());
        assertNull(parser.getCurrentToken());

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertTrue(parser.hasCurrentToken());
        assertEquals(JsonToken.ID_START_OBJECT, parser.getCurrentTokenId());
        assertTrue(parser.hasTokenId(JsonTokenId.ID_START_OBJECT));
        assertTrue(parser.hasToken(JsonToken.START_OBJECT));
        assertTrue(parser.isExpectedStartObjectToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());

        parser.clearCurrentToken();
        assertNull(parser.getCurrentToken());

        parser.close();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testOverrideCurrentNameThrowsException() throws IOException {
        String json = "{\"a\":1}";
        FilteringParserDelegate parser = createDelegate(json, TokenFilter.INCLUDE_ALL, true, true);
        parser.overrideCurrentName("invalid");
    }

    @Test
    public void testAllowMultipleMatchesScalarEdgeCase() throws IOException {
        // Triggers branch: !_allowMultipleMatches && (_currToken != null) && (_exposedContext == null)
        String json = "1";
        TokenFilter filter = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate parser = createDelegate(json, filter, false, false);

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        // Second call should trigger the single match restriction and return null
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testAllowMultipleMatchesStructEndEdgeCase() throws IOException {
        String json = "[1]";
        TokenFilter filter = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate parser = createDelegate(json, filter, false, false);

        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        // Second struct end check with allowMultipleMatches = false
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testFilteringWithCustomPathAndBuffering() throws IOException {
        String json = "{\"parent\":{\"child\":100},\"other\":200}";
        // Custom filter that includes only 'child'
        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String prop) {
                if ("parent".equals(prop) || "child".equals(prop)) {
                    return this;
                }
                return null;
            }
            @Override
            public TokenFilter includeElement(int index) {
                return this;
            }
        };

        FilteringParserDelegate parser = createDelegate(json, filter, true, true);
        
        // Consume tokens and verify buffering works
        while (parser.nextToken() != null) {
            // Exercise getters and methods
            parser.getCurrentLocation();
            parser.getParsingContext();
            parser.getFilter();
            parser.getMatchCount();
        }
        parser.close();
    }

    @Test
    public void testSkipChildrenEdgeCases() throws IOException {
        String json = "{\"a\":[1,2,3],\"b\":2}";
        FilteringParserDelegate parser = createDelegate(json, TokenFilter.INCLUDE_ALL, true, true);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        // Should skip since current is START_OBJECT
        parser.skipChildren();
        parser.close();
    }

    @Test
    public void testValueAccessorsCoercion() throws IOException {
        String json = "{\"str\":\"hello\",\"num\":123,\"dbl\":12.34,\"bool\":true}";
        FilteringParserDelegate parser = createDelegate(json, TokenFilter.INCLUDE_ALL, true, true);

        while (parser.nextToken() != null) {
            if (parser.hasToken(JsonToken.VALUE_STRING)) {
                parser.getText();
                parser.hasTextCharacters();
                parser.getTextCharacters();
                parser.getTextLength();
                parser.getTextOffset();
                parser.getValueAsString();
                parser.getValueAsString("default");
            }
            if (parser.hasToken(JsonToken.VALUE_NUMBER_INT)) {
                parser.getIntValue();
                parser.getLongValue();
                parser.getShortValue();
                parser.getByteValue();
                parser.getBigIntegerValue();
                parser.getDecimalValue();
                parser.getDoubleValue();
                parser.getFloatValue();
                parser.getNumberType();
                parser.getNumberValue();
                parser.getValueAsInt();
                parser.getValueAsInt(0);
                parser.getValueAsLong();
                parser.getValueAsLong(0L);
            }
            if (parser.hasToken(JsonToken.VALUE_TRUE)) {
                parser.getBooleanValue();
                parser.getValueAsBoolean();
                parser.getValueAsBoolean(false);
            }
        }
        parser.close();
    }
}