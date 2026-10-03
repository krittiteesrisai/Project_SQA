package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonGenerator;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class JsonMappingExceptionTest {

    @Test(expected = NullPointerException.class)
    public void testReferenceConstructorNullFieldName() {
        new JsonMappingException.Reference(new Object(), (String) null);
    }

    @Test
    public void testReferenceDescriptionWithNullFrom() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(null, "fieldX");
        assertEquals("UNKNOWN[\"fieldX\"]", ref.getDescription());
        assertEquals("UNKNOWN[\"fieldX\"]", ref.toString());
    }

    @Test
    public void testReferenceDescriptionWithClassFrom() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(String.class, 0);
        assertTrue(ref.getDescription().contains("String[0]"));
    }

    @Test
    public void testReferenceDescriptionWithFallbackIndex() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(new Object(), -1);
        assertTrue(ref.getDescription().endsWith("[?]"));
    }

    @Test
    public void testReferenceWriteReplace() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(new Object(), "testField");
        Object replaced = ref.writeReplace();
        assertSame(ref, replaced);
        assertNotNull(ref.getDescription());
    }

    @Test
    public void testConstructorsWithParserAndGenerator() throws IOException {
        JsonParser mockParser = Mockito.mock(JsonParser.class);
        Mockito.when(mockParser.getTokenLocation()).thenReturn(JsonLocation.NA);

        JsonMappingException ex1 = new JsonMappingException(mockParser, "Parser msg");
        assertNotNull(ex1.getProcessor());

        JsonMappingException ex2 = new JsonMappingException(mockParser, "Parser msg with cause", new RuntimeException());
        assertNotNull(ex2.getProcessor());

        JsonGenerator mockGen = Mockito.mock(JsonGenerator.class);
        JsonMappingException ex3 = new JsonMappingException(mockGen, "Gen msg", JsonLocation.NA);
        assertNotNull(ex3.getProcessor());

        JsonMappingException fromParser = JsonMappingException.from(mockParser, "from parser");
        assertNotNull(fromParser);

        JsonMappingException fromParserCause = JsonMappingException.from(mockParser, "from parser cause", new RuntimeException());
        assertNotNull(fromParserCause);

        JsonMappingException fromGen = JsonMappingException.from(mockGen, "from gen");
        assertNotNull(fromGen);

        JsonMappingException fromGenCause = JsonMappingException.from(mockGen, "from gen cause", new RuntimeException());
        assertNotNull(fromGenCause);
    }

    @Test
    public void testContextFactoryMethods() {
        DeserializationContext mockDtxt = Mockito.mock(DeserializationContext.class);
        JsonParser mockParser = Mockito.mock(JsonParser.class);
        Mockito.when(mockDtxt.getParser()).thenReturn(mockParser);

        assertNotNull(JsonMappingException.from(mockDtxt, "ctxt msg"));
        assertNotNull(JsonMappingException.from(mockDtxt, "ctxt msg cause", new RuntimeException()));

        SerializerProvider mockSvr = Mockito.mock(SerializerProvider.class);
        JsonGenerator mockGen = Mockito.mock(JsonGenerator.class);
        Mockito.when(mockSvr.getGenerator()).thenReturn(mockGen);

        assertNotNull(JsonMappingException.from(mockSvr, "svr msg"));
        assertNotNull(JsonMappingException.from(mockSvr, "svr msg cause", new RuntimeException()));
    }

    @Test
    public void testFromUnexpectedIOE() {
        IOException ioe = new IOException("Disk error");
        JsonMappingException ex = JsonMappingException.fromUnexpectedIOE(ioe);
        assertTrue(ex.getMessage().contains("Unexpected IOException"));
        assertTrue(ex.getMessage().contains("Disk error"));
    }

    @Test
    public void testWrapWithPathAndExistingJME() {
        JsonMappingException originalJME = new JsonMappingException((Closeable) null, "Base error");
        JsonMappingException wrapped = JsonMappingException.wrapWithPath(originalJME, "fromObj", "propName");
        assertSame(originalJME, wrapped);
        assertEquals(1, wrapped.getPath().size());
    }

    @Test
    public void testWrapWithPathAndNonJMEWithNullMessage() {
        Exception rawEx = new RuntimeException((String) null);
        JsonMappingException wrapped = JsonMappingException.wrapWithPath(rawEx, new JsonMappingException.Reference(new Object(), 5));
        assertTrue(wrapped.getMessage().contains("(was java.lang.RuntimeException)"));
    }

    @Test
    public void testWrapWithPathAndJsonProcessingExceptionWithProcessor() {
        JsonProcessingException procEx = Mockito.mock(JsonProcessingException.class);
        Closeable mockCloseable = Mockito.mock(Closeable.class);
        Mockito.when(procEx.getProcessor()).thenReturn(mockCloseable);
        Mockito.when(procEx.getMessage()).thenReturn("Proc error");

        JsonMappingException wrapped = JsonMappingException.wrapWithPath(procEx, new Object(), 1);
        assertNotNull(wrapped.getProcessor());
    }

    @Test
    public void testGetPathWhenNull() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "No path");
        List<JsonMappingException.Reference> path = ex.getPath();
        assertTrue(path.isEmpty());
    }

    @Test
    public void testPrependPathWithIndexAndField() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "Path test");
        ex.prependPath(new Object(), "fieldA");
        ex.prependPath(new Object(), 0);
        assertEquals(2, ex.getPath().size());
        assertNotNull(ex.getPathReference());
        assertNotNull(ex.getLocalizedMessage());
    }

    @Test
    public void testMaxRefsToListLimit() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "Infinite recursion test");
        for (int i = 0; i < 1100; i++) {
            ex.prependPath(new Object(), i);
        }
        // Should cap at MAX_REFS_TO_LIST (1000)
        assertEquals(JsonMappingException.MAX_REFS_TO_LIST, ex.getPath().size());
    }

    @Test
    public void testToStringAndNullMessageBuild() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, (String) null);
        ex.prependPath(new Object(), "rootField");
        String str = ex.toString();
        assertTrue(str.contains("JsonMappingException"));
    }
}