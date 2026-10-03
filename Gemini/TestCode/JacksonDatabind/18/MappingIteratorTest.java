package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;

/**
 * Senior QA Engineer JUnit 4 Test Suite for MappingIterator
 * Target: Defects4J JacksonDatabind-18b
 */
public class MappingIteratorTest {

    // Mock implementation of JsonParser for testing behavior without external mocking frameworks
    private static class DummyJsonParser extends JsonParser {
        private JsonToken currentToken;
        private JsonToken nextToken;
        private boolean closed = false;
        private boolean isStartArray = false;

        public DummyJsonParser(JsonToken initialToken, JsonToken nextToken, boolean isStartArray) {
            this.currentToken = initialToken;
            this.nextToken = nextToken;
            this.isStartArray = isStartArray;
        }

        @Override
        public JsonToken getCurrentToken() { return currentToken; }

        @Override
        public JsonToken nextToken() throws IOException {
            currentToken = nextToken;
            return currentToken;
        }

        @Override
        public boolean isExpectedStartArrayToken() { return isStartArray; }

        @Override
        public void clearCurrentToken() { currentToken = null; }

        @Override
        public void close() throws IOException { closed = true; }

        @Override ObjectCodec getCodec() { return null; }
        @Override void setCodec(ObjectCodec c) {}
        @Override Version version() { return null; }
        @Override String getCurrentName() throws IOException { return null; }
        @Override void overrideCurrentName(String name) {}
        @Override String getText() throws IOException { return null; }
        @Override char[] getTextCharacters() throws IOException { return new char[0]; }
        @Override int getTextLength() throws IOException { return 0; }
        @Override int getTextOffset() throws IOException { return 0; }
        @Override boolean hasTextCharacters() { return false; }
        @Override NumbergetNumberValue() throws IOException { return 0; }
        @Override NumberType getNumberType() throws IOException { return null; }
        @Override int getIntValue() throws IOException { return 0; }
        @Override long getLongValue() throws IOException { return 0L; }
        @Override BigInteger getBigIntegerValue() throws IOException { return null; }
        @Override float getFloatValue() throws IOException { return 0f; }
        @Override double getDoubleValue() throws IOException { return 0d; }
        @Override BigDecimal getDecimalValue() throws IOException { return null; }
        @Override Object getEmbeddedObject() throws IOException { return null; }
        @Override byte[] getBinaryValue(Base64Variant b) throws IOException { return new byte[0]; }
        @Override JsonLocation getTokenLocation() { return null; }
        @Override JsonLocation getCurrentLocation() { return new JsonLocation(null, 0L, 0, 0); }
        @Override void skipChildren() throws IOException {}
    }

    private static class DummyDeserializer extends JsonDeserializer<String> {
        private final String returnValue;

        public DummyDeserializer(String returnValue) {
            this.returnValue = returnValue;
        }

        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return returnValue;
        }
    }

    @Test
    public void testEmptyIterator() {
        MappingIterator<Object> it = MappingIterator.emptyIterator();
        assertNotNull(it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testNullParserHasNext() throws IOException {
        MappingIterator<String> it = new MappingIterator<>(null, null, null, null, false, null);
        assertFalse(it.hasNext());
        assertFalse(it.hasNextValue());
    }

    @Test
    public void testManagedParserStartArrayClearing() {
        DummyJsonParser parser = new DummyJsonParser(JsonToken.START_ARRAY, JsonToken.VALUE_STRING, true);
        MappingIterator<String> it = new MappingIterator<>(null, parser, null, null, true, null);
        assertNull(parser.getCurrentToken());
    }

    @Test
    public void testHasNextValueEofAndEndArray() throws IOException {
        // Test EOF (t == null)
        DummyJsonParser parserEof = new DummyJsonParser(null, null, false);
        MappingIterator<String> itEof = new MappingIterator<>(null, parserEof, null, null, true, null);
        assertFalse(itEof.hasNextValue());
        assertTrue(parserEof.closed);

        // Test END_ARRAY
        DummyJsonParser parserEndArr = new DummyJsonParser(null, JsonToken.END_ARRAY, false);
        MappingIterator<String> itEndArr = new MappingIterator<>(null, parserEndArr, null, null, true, null);
        assertFalse(itEndArr.hasNextValue());
        assertTrue(parserEndArr.closed);
    }

    @Test
    public void testNextValueWithNewInstanceAndUpdatedValue() throws IOException {
        // Without updated value
        DummyJsonParser parser1 = new DummyJsonParser(JsonToken.VALUE_STRING, null, false);
        MappingIterator<String> it1 = new MappingIterator<>(null, parser1, null, new DummyDeserializer("test1"), false, null);
        assertEquals("test1", it1.nextValue());

        // With updated value
        DummyJsonParser parser2 = new DummyJsonParser(JsonToken.VALUE_STRING, null, false);
        String updateTarget = "initial";
        MappingIterator<String> it2 = new MappingIterator<>(null, parser2, null, new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt, String intoValue) throws IOException {
                return intoValue + "Updated";
            }
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return null;
            }
        }, false, updateTarget);
        
        assertEquals("initial", it2.nextValue());
    }

    @Test(expected = NoSuchElementException.class)
    public void testNextThrowsNoSuchElementWhenNoMore() {
        MappingIterator<String> it = new MappingIterator<>(null, null, null, null, false, null);
        it.next();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveUnsupported() {
        MappingIterator<String> it = MappingIterator.emptyIterator();
        it.remove();
    }

    @Test
    public void testCloseWithActiveParser() throws IOException {
        DummyJsonParser parser = new DummyJsonParser(null, null, false);
        MappingIterator<String> it = new MappingIterator<>(null, parser, null, null, false, null);
        it.close();
        assertTrue(parser.closed);
    }

    @Test
    public void testReadAllVariants() throws IOException {
        DummyJsonParser parser = new DummyJsonParser(JsonToken.VALUE_STRING, null, false) {
            private int callCount = 0;
            @Override
            public JsonToken getCurrentToken() {
                return callCount++ == 0 ? JsonToken.VALUE_STRING : null;
            }
            @Override
            public JsonToken nextToken() {
                return null;
            }
        };
        MappingIterator<String> it = new MappingIterator<>(null, parser, null, new DummyDeserializer("item"), false, null);
        List<String> list = it.readAll();
        assertEquals(1, list.size());
        assertEquals("item", list.get(0));
    }
}