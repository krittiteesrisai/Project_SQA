package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonStreamContext;

public class JsonParserSequenceTest {

    // --- Helper Stub Classes for Testing ---
    
    private static class DummyParser extends JsonParser {
        private final JsonToken[] tokens;
        private int index = 0;
        private boolean closed = false;

        public DummyParser(JsonToken... tokens) {
            this.tokens = tokens;
        }

        @Override
        public JsonToken nextToken() throws IOException {
            if (index < tokens.length) {
                return tokens[index++];
            }
            return null;
        }

        @Override
        public void close() throws IOException {
            closed = true;
        }

        @Override public ObjectCodec getCodec() { return null; }
        @Override public void setCodec(ObjectCodec c) {}
        @Override public Version version() { return null; }
        @Override public String getCurrentName() throws IOException { return null; }
        @Override public void overrideCurrentName(String name) {}
        @Override public JsonStringBuilding textCharacters() throws IOException { return null; }
        @Override public int getTextLength() throws IOException { return 0; }
        @Override public int getTextOffset() throws IOException { return 0; }
        @Override public boolean hasTextCharacters() { return false; }
        @Override public byte[] getBinaryValue(com.fasterxml.jackson.core.Base64Variant b64variant) throws IOException { return null; }
        @Override public JsonLocation getTokenLocation() { return null; }
        @Override public JsonLocation getCurrentLocation() { return null; }
        @Override public JsonStreamContext getParsingContext() { return null; }
        @Override public void clearCurrentToken() {}
        @Override public JsonToken getLastClearedToken() { return null; }
        @Override public boolean isClosed() { return closed; }
        @Override protected void _close() throws IOException {}
        @Override public String getValueAsString() throws IOException { return null; }
        @Override public String getValueAsString(String defaultValue) throws IOException { return null; }
    }

    @Test
    public void testCreateFlattened_NoSequence() {
        DummyParser p1 = new DummyParser(JsonToken.START_OBJECT);
        DummyParser p2 = new DummyParser(JsonToken.END_OBJECT);

        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        
        assertNotNull(seq);
        assertEquals(2, seq.containedParsersCount());
    }

    @Test
    public void testCreateFlattened_FirstIsSequence() {
        DummyParser p1 = new DummyParser(JsonToken.START_OBJECT);
        DummyParser p2 = new DummyParser(JsonToken.FIELD_NAME);
        DummyParser p3 = new DummyParser(JsonToken.END_OBJECT);

        JsonParserSequence innerSeq = JsonParserSequence.createFlattened(p1, p2);
        JsonParserSequence outerSeq = JsonParserSequence.createFlattened(innerSeq, p3);

        assertNotNull(outerSeq);
        assertEquals(3, outerSeq.containedParsersCount());
    }

    @Test
    public void testCreateFlattened_SecondIsSequence() {
        DummyParser p1 = new DummyParser(JsonToken.START_OBJECT);
        DummyParser p2 = new DummyParser(JsonToken.FIELD_NAME);
        DummyParser p3 = new DummyParser(JsonToken.END_OBJECT);

        JsonParserSequence innerSeq = JsonParserSequence.createFlattened(p2, p3);
        JsonParserSequence outerSeq = JsonParserSequence.createFlattened(p1, innerSeq);

        assertNotNull(outerSeq);
        assertEquals(3, outerSeq.containedParsersCount());
    }

    @Test
    public void testCreateFlattened_BothAreSequences() {
        DummyParser p1 = new DummyParser(JsonToken.START_OBJECT);
        DummyParser p2 = new DummyParser(JsonToken.FIELD_NAME);
        DummyParser p3 = new DummyParser(JsonToken.VALUE_STRING);
        DummyParser p4 = new DummyParser(JsonToken.END_OBJECT);

        JsonParserSequence seq1 = JsonParserSequence.createFlattened(p1, p2);
        JsonParserSequence seq2 = JsonParserSequence.createFlattened(p3, p4);
        JsonParserSequence combined = JsonParserSequence.createFlattened(seq1, seq2);

        assertNotNull(combined);
        assertEquals(4, combined.containedParsersCount());
    }

    @Test
    public void testNextToken_SequenceTransition() throws IOException {
        // p1 returns START_OBJECT then null
        DummyParser p1 = new DummyParser(JsonToken.START_OBJECT);
        // p2 returns END_OBJECT then null
        DummyParser p2 = new DummyParser(JsonToken.END_OBJECT);

        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        assertEquals(JsonToken.START_OBJECT, seq.nextToken());
        // Should automatically switch to p2 when p1 returns null
        assertEquals(JsonToken.END_OBJECT, seq.nextToken());
        // Both exhausted -> null
        assertNull(seq.nextToken());
        assertNull(seq.nextToken()); // Test multiple calls at end state
    }

    @Test
    public void testClose_ClosesAllParsers() throws IOException {
        DummyParser p1 = new DummyParser(JsonToken.START_OBJECT);
        DummyParser p2 = new DummyParser(JsonToken.END_OBJECT);

        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        seq.close();

        assertTrue(p1.isClosed());
        assertTrue(p2.isClosed());
    }

    @Test
    public void testAddFlattenedActiveParsers_NestedSequenceWithAdvancedIndex() throws IOException {
        DummyParser p1 = new DummyParser(JsonToken.START_OBJECT);
        DummyParser p2 = new DummyParser(JsonToken.FIELD_NAME);
        DummyParser p3 = new DummyParser(JsonToken.END_OBJECT);

        JsonParserSequence innerSeq = JsonParserSequence.createFlattened(p1, p2);
        // Advance innerSeq past the first parser (p1 is delegate, next is p2)
        assertEquals(JsonToken.START_OBJECT, innerSeq.nextToken());

        // Now flatten innerSeq (which has _nextParser = 1) with p3
        JsonParserSequence outerSeq = JsonParserSequence.createFlattened(innerSeq, p3);
        
        // p1 was already consumed/skipped in active parsing flattening logic due to _nextParser-1
        assertNotNull(outerSeq);
    }
}