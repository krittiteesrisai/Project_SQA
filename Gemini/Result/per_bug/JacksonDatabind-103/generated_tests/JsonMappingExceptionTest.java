package com.fasterxml.jackson.databind;

import org.junit.Test;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class JsonMappingExceptionTest {

    @Test
    public void testReferenceConstructorNullFieldName() {
        try {
            new JsonMappingException.Reference(new Object(), (String) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("Cannot pass null fieldName", e.getMessage());
        }
    }

    @Test
    public void testReferenceGetDescriptionWithNullFrom() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(null, "field");
        assertEquals("UNKNOWN[\"field\"]", ref.getDescription());
    }

    @Test
    public void testReferenceGetDescriptionWithArrayClass() {
        String[] dummyArray = new String[0];
        JsonMappingException.Reference ref = new JsonMappingException.Reference(dummyArray, 0);
        // ตรวจสอบการจัดการ Array class name และ Index
        assertTrue(ref.getDescription().contains("[]"));
        assertTrue(ref.getDescription().contains("[0]"));
    }

    @Test
    public void testReferenceGetDescriptionWithIndexAndUnknown() {
        JsonMappingException.Reference ref1 = new JsonMappingException.Reference(new Object(), 5);
        assertEquals(Object.class.getName() + "[5]", ref1.getDescription());

        JsonMappingException.Reference ref2 = new JsonMappingException.Reference(new Object());
        assertEquals(Object.class.getName() + "[?]", ref2.getDescription());
    }

    @Test
    public void testReferenceWriteReplace() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("test", "field");
        Object replaced = ref.writeReplace();
        assertSame(ref, replaced);
        assertNotNull(ref.getDescription());
    }

    @Test
    public void testConstructorsWithParserProcessor() {
        JsonParser parser = mock(JsonParser.class);
        JsonLocation loc = new JsonLocation(null, 100, 1, 10);
        when(parser.getTokenLocation()).thenReturn(loc);

        JsonMappingException jme1 = new JsonMappingException(parser, "Test message");
        assertEquals("Test message", jme1.getMessage());
        assertEquals(loc, jme1.getLocation());
        assertEquals(parser, jme1.getProcessor());

        IOException cause = new IOException("IO Error");
        JsonMappingException jme2 = new JsonMappingException(parser, "Test message 2", cause);
        assertEquals("Test message 2", jme2.getMessage());
        assertSame(cause, jme2.getCause());
    }

    @Test
    public void testConstructorsWithGeneratorProcessor() {
        Closeable generator = mock(Closeable.class);
        JsonMappingException jme = new JsonMappingException(generator, "Gen error", (JsonLocation) null);
        assertEquals("Gen error", jme.getMessage());
        assertEquals(generator, jme.getProcessor());
    }

    @Test
    public void testFactoryMethods() {
        JsonParser parser = mock(JsonParser.class);
        JsonGenerator generator = mock(JsonGenerator.class);
        DeserializationContext dtxt = mock(DeserializationContext.class);
        when(dtxt.getParser()).thenReturn(parser);
        SerializerProvider spt = mock(SerializerProvider.class);
        when(spt.getGenerator()).thenReturn(generator);

        assertNotNull(JsonMappingException.from(parser, "msg"));
        assertNotNull(JsonMappingException.from(parser, "msg", new Throwable()));
        assertNotNull(JsonMappingException.from(generator, "msg"));
        assertNotNull(JsonMappingException.from(generator, "msg", new Throwable()));
        assertNotNull(JsonMappingException.from(dtxt, "msg"));
        assertNotNull(JsonMappingException.from(dtxt, "msg", new Throwable()));
        assertNotNull(JsonMappingException.from(spt, "msg"));
        assertNotNull(JsonMappingException.from(spt, "msg", new Throwable()));
    }

    @Test
    public void testFromUnexpectedIOE() {
        IOException ioe = new IOException("Disk full");
        JsonMappingException jme = JsonMappingException.fromUnexpectedIOE(ioe);
        assertTrue(jme.getMessage().contains("Unexpected IOException"));
        assertTrue(jme.getMessage().contains("Disk full"));
    }

    @Test
    public void testWrapWithPathVariations() {
        // กรณี source เป็น JsonMappingException อยู่แล้ว
        JsonMappingException originalJme = new JsonMappingException(null, "Base error");
        JsonMappingException wrapped1 = JsonMappingException.wrapWithPath(originalJme, "fromObj", "fieldName");
        assertSame(originalJme, wrapped1);

        // กรณี source เป็น Exception ทั่วไป (message มีค่า)
        Exception normalEx = new Exception("Normal error");
        JsonMappingException wrapped2 = JsonMappingException.wrapWithPath(normalEx, "fromObj", 1);
        assertEquals("Normal error", wrapped2.getMessage());

        // กรณี source มี message เป็น null หรือว่างเปล่า
        Exception emptyEx = new Exception("");
        JsonMappingException wrapped3 = JsonMappingException.wrapWithPath(emptyEx, new JsonMappingException.Reference("a", "b"));
        assertTrue(wrapped3.getMessage().contains("(was java.lang.Exception)"));

        // กรณี source เป็น JsonProcessingException ที่มี Closeable processor
        JsonProcessingException procEx = mock(JsonProcessingException.class);
        Closeable closeableProc = mock(Closeable.class);
        when(procEx.getProcessor()).thenReturn(closeableProc);
        when(procEx.getMessage()).thenReturn("Proc error");
        JsonMappingException wrapped4 = JsonMappingException.wrapWithPath(procEx, "fromObj", "field");
        assertEquals(closeableProc, wrapped4.getProcessor());
    }

    @Test
    public void testGetPathAndUnmodifiable() {
        JsonMappingException jme = new JsonMappingException(null, "Error");
        assertTrue(jme.getPath().isEmpty());

        jme.prependPath("ref", "prop");
        List<JsonMappingException.Reference> path = jme.getPath();
        assertEquals(1, path.size());
        
        try {
            path.add(new JsonMappingException.Reference());
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testPrependPathMaxLimit() {
        JsonMappingException jme = new JsonMappingException(null, "Error");
        // MAX_REFS_TO_LIST คือ 1000 ลองใส่เกินไป
        for (int i = 0; i < 1005; i++) {
            jme.prependPath("ref" + i, i);
        }
        assertEquals(JsonMappingException.MAX_REFS_TO_LIST, jme.getPath().size());
    }

    @Test
    public void testGetPathReferenceAndMessageWithNullMessage() {
        JsonMappingException jme = new JsonMappingException((Closeable) null, (String) null);
        jme.prependPath("referrer", "field");
        
        String pathRef = jme.getPathReference();
        assertEquals("referrer[\"field\"]", pathRef);

        String msg = jme.getMessage();
        assertEquals(" (through reference chain: referrer[\"field\"])", msg);
        assertEquals(jme.getLocalizedMessage(), msg);
        assertTrue(jme.toString().contains("JsonMappingException"));
    }
}