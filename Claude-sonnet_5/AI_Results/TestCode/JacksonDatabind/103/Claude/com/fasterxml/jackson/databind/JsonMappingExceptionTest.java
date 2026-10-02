package com.fasterxml.jackson.databind;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException.Reference;

public class JsonMappingExceptionTest {

    // ==================== Reference inner class ====================

    @Test
    public void testReferenceDefaultConstructor() {
        Reference ref = new Reference();
        assertNull(ref.getFrom());
        assertNull(ref.getFieldName());
        assertEquals(-1, ref.getIndex());
    }

    @Test
    public void testReferenceConstructorFromOnly() {
        Object from = new Object();
        Reference ref = new Reference(from);
        assertSame(from, ref.getFrom());
        assertNull(ref.getFieldName());
        assertEquals(-1, ref.getIndex());
    }

    @Test
    public void testReferenceConstructorWithFieldName() {
        Object from = "bean";
        Reference ref = new Reference(from, "myField");
        assertSame(from, ref.getFrom());
        assertEquals("myField", ref.getFieldName());
        assertEquals(-1, ref.getIndex());
    }

    @Test(expected = NullPointerException.class)
    public void testReferenceConstructorWithNullFieldNameThrows() {
        new Reference("bean", (String) null);
    }

    @Test
    public void testReferenceConstructorWithIndex() {
        Object from = new Object();
        Reference ref = new Reference(from, 3);
        assertSame(from, ref.getFrom());
        assertNull(ref.getFieldName());
        assertEquals(3, ref.getIndex());
    }

    @Test
    public void testReferenceGetDescription_NullFrom() {
        Reference ref = new Reference(null);
        assertEquals("UNKNOWN[?]", ref.getDescription());
    }

    @Test
    public void testReferenceGetDescription_WithFieldName() {
        Reference ref = new Reference("some-bean", "field1");
        assertEquals("java.lang.String[\"field1\"]", ref.getDescription());
    }

    @Test
    public void testReferenceGetDescription_WithIndex() {
        Reference ref = new Reference("some-bean", 5);
        assertEquals("java.lang.String[5]", ref.getDescription());
    }

    @Test
    public void testReferenceGetDescription_NoFieldNoIndex() {
        Reference ref = new Reference("some-bean");
        assertEquals("java.lang.String[?]", ref.getDescription());
    }

    @Test
    public void testReferenceGetDescription_ArrayType() {
        int[] arr = new int[0];
        Reference ref = new Reference(arr, 0);
        // component type "int" + one "[]" + index part "[0]"
        assertEquals("int[][0]", ref.getDescription());
    }

    @Test
    public void testReferenceGetDescription_ClassInstance() {
        // when _from is itself a Class<?>, cls is used directly (not _from.getClass())
        Reference ref = new Reference(String.class, "x");
        assertEquals("java.lang.String[\"x\"]", ref.getDescription());
    }

    @Test
    public void testReferenceGetDescription_CachedAfterFirstCall() {
        Reference ref = new Reference("abc", "f");
        String first = ref.getDescription();
        String second = ref.getDescription();
        assertSame(first, second); // _desc is cached, not recomputed
    }

    @Test
    public void testReferenceToString() {
        Reference ref = new Reference("abc", "f");
        assertEquals(ref.getDescription(), ref.toString());
    }

    @Test
    public void testReferenceSetters() {
        Reference ref = new Reference();
        ref.setFieldName("fld");
        assertEquals("fld", ref.getFieldName());
        ref.setIndex(9);
        assertEquals(9, ref.getIndex());
        ref.setDescription("customDesc");
        assertEquals("customDesc", ref.getDescription());
    }

    @Test
    public void testReferenceWriteReplace() {
        Reference ref = new Reference("abc");
        Object result = ref.writeReplace();
        assertSame(ref, result);
        assertNotNull(ref.getDescription()); // must be pre-computed by writeReplace
    }

    // ==================== Deprecated constructors ====================

    @Test
    public void testDeprecatedConstructorMsgOnly() {
        JsonMappingException ex = new JsonMappingException("boom");
        assertEquals("boom", ex.getMessage());
        assertNull(ex.getProcessor());
    }

    @Test
    public void testDeprecatedConstructorMsgThrowable() {
        Throwable cause = new RuntimeException("cause");
        JsonMappingException ex = new JsonMappingException("boom", cause);
        assertSame(cause, ex.getCause());
        assertEquals("boom", ex.getMessage());
    }

    @Test
    public void testDeprecatedConstructorMsgLocation() {
        // NOTE: assumes JsonLocation.NA is a publicly accessible static instance
        JsonLocation loc = JsonLocation.NA;
        JsonMappingException ex = new JsonMappingException("boom", loc);
        assertEquals(loc, ex.getLocation());
    }

    @Test
    public void testDeprecatedConstructorMsgLocationThrowable() {
        JsonLocation loc = JsonLocation.NA;
        Throwable cause = new RuntimeException("cause");
        JsonMappingException ex = new JsonMappingException("boom", loc, cause);
        assertEquals(loc, ex.getLocation());
        assertSame(cause, ex.getCause());
    }

    // ==================== Processor-based constructors (since 2.7) ====================

    @Test
    public void testProcessorConstructor_WithJsonParser() {
        JsonParser parser = mock(JsonParser.class);
        JsonLocation loc = JsonLocation.NA;
        when(parser.getTokenLocation()).thenReturn(loc);
        JsonMappingException ex = new JsonMappingException(parser, "msg");
        assertSame(parser, ex.getProcessor());
        assertEquals(loc, ex.getLocation());
    }

    @Test
    public void testProcessorConstructor_WithNonParserCloseable() {
        Closeable closeable = mock(Closeable.class);
        JsonMappingException ex = new JsonMappingException(closeable, "msg");
        assertSame(closeable, ex.getProcessor());
        assertNull(ex.getLocation()); // instanceof JsonParser == false branch
    }

    @Test
    public void testProcessorConstructor_WithNullProcessor() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        assertNull(ex.getProcessor());
        assertNull(ex.getLocation());
    }

    @Test
    public void testProcessorConstructorWithThrowable_WithJsonParser() {
        JsonParser parser = mock(JsonParser.class);
        JsonLocation loc = JsonLocation.NA;
        when(parser.getTokenLocation()).thenReturn(loc);
        Throwable problem = new RuntimeException("problem");
        JsonMappingException ex = new JsonMappingException(parser, "msg", problem);
        assertSame(parser, ex.getProcessor());
        assertEquals(loc, ex.getLocation());
        assertSame(problem, ex.getCause());
    }

    @Test
    public void testProcessorConstructorWithThrowable_NonParser() {
        Closeable closeable = mock(Closeable.class);
        Throwable problem = new RuntimeException("problem");
        JsonMappingException ex = new JsonMappingException(closeable, "msg", problem);
        assertSame(closeable, ex.getProcessor());
        assertNull(ex.getLocation());
        assertSame(problem, ex.getCause());
    }

    @Test
    public void testProcessorConstructorWithLocation() {
        Closeable closeable = mock(Closeable.class);
        JsonLocation loc = JsonLocation.NA;
        JsonMappingException ex = new JsonMappingException(closeable, "msg", loc);
        assertSame(closeable, ex.getProcessor());
        assertEquals(loc, ex.getLocation());
    }

    // ==================== Static factory from(...) ====================

    @Test
    public void testFrom_JsonParser() {
        JsonParser parser = mock(JsonParser.class);
        JsonMappingException ex = JsonMappingException.from(parser, "msg");
        assertSame(parser, ex.getProcessor());
    }

    @Test
    public void testFrom_JsonParserWithThrowable() {
        JsonParser parser = mock(JsonParser.class);
        Throwable problem = new RuntimeException("p");
        JsonMappingException ex = JsonMappingException.from(parser, "msg", problem);
        assertSame(parser, ex.getProcessor());
        assertSame(problem, ex.getCause());
    }

    @Test
    public void testFrom_JsonGenerator() {
        JsonGenerator gen = mock(JsonGenerator.class);
        JsonMappingException ex = JsonMappingException.from(gen, "msg");
        assertSame(gen, ex.getProcessor());
        assertNull(ex.getCause());
    }

    @Test
    public void testFrom_JsonGeneratorWithThrowable() {
        JsonGenerator gen = mock(JsonGenerator.class);
        Throwable problem = new RuntimeException("p");
        JsonMappingException ex = JsonMappingException.from(gen, "msg", problem);
        assertSame(gen, ex.getProcessor());
        assertSame(problem, ex.getCause());
    }

    @Test
    public void testFrom_DeserializationContext() {
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonParser parser = mock(JsonParser.class);
        when(ctxt.getParser()).thenReturn(parser);
        JsonMappingException ex = JsonMappingException.from(ctxt, "msg");
        assertSame(parser, ex.getProcessor());
    }

    @Test
    public void testFrom_DeserializationContextWithThrowable() {
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonParser parser = mock(JsonParser.class);
        when(ctxt.getParser()).thenReturn(parser);
        Throwable problem = new RuntimeException("p");
        JsonMappingException ex = JsonMappingException.from(ctxt, "msg", problem);
        assertSame(parser, ex.getProcessor());
        assertSame(problem, ex.getCause());
    }

    @Test
    public void testFrom_SerializerProvider() {
        SerializerProvider ctxt = mock(SerializerProvider.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        when(ctxt.getGenerator()).thenReturn(gen);
        JsonMappingException ex = JsonMappingException.from(ctxt, "msg");
        assertSame(gen, ex.getProcessor());
    }

    @Test
    public void testFrom_SerializerProviderWithThrowable() {
        SerializerProvider ctxt = mock(SerializerProvider.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        when(ctxt.getGenerator()).thenReturn(gen);
        Throwable problem = new RuntimeException("p");
        JsonMappingException ex = JsonMappingException.from(ctxt, "msg", problem);
        assertSame(gen, ex.getProcessor());
        assertSame(problem, ex.getCause());
    }

    // ==================== fromUnexpectedIOE ====================

    @Test
    public void testFromUnexpectedIOE() {
        IOException src = new IOException("disk failure");
        JsonMappingException ex = JsonMappingException.fromUnexpectedIOE(src);
        assertTrue(ex.getMessage().contains("IOException"));
        assertTrue(ex.getMessage().contains("disk failure"));
        assertNull(ex.getProcessor());
    }

    // ==================== wrapWithPath ====================

    @Test
    public void testWrapWithPath_SrcAlreadyJsonMappingException() {
        JsonMappingException original = new JsonMappingException((Closeable) null, "orig");
        Reference ref = new Reference("bean", "field");
        JsonMappingException result = JsonMappingException.wrapWithPath(original, ref);
        assertSame(original, result); // no new instance created
        assertEquals(1, result.getPath().size());
        assertEquals("field", result.getPath().get(0).getFieldName());
    }

    @Test
    public void testWrapWithPath_NullMessage() {
        RuntimeException src = new RuntimeException((String) null);
        Reference ref = new Reference("bean", "f");
        JsonMappingException result = JsonMappingException.wrapWithPath(src, ref);
        assertTrue(result.getMessage().contains("(was " + src.getClass().getName()));
    }

    @Test
    public void testWrapWithPath_EmptyMessage() {
        RuntimeException src = new RuntimeException("");
        Reference ref = new Reference("bean", "f");
        JsonMappingException result = JsonMappingException.wrapWithPath(src, ref);
        assertTrue(result.getMessage().contains("(was " + src.getClass().getName()));
    }

    @Test
    public void testWrapWithPath_NonEmptyMessage() {
        RuntimeException src = new RuntimeException("real problem");
        Reference ref = new Reference("bean", "f");
        JsonMappingException result = JsonMappingException.wrapWithPath(src, ref);
        assertTrue(result.getMessage().startsWith("real problem (through reference chain:"));
    }

    @Test
    public void testWrapWithPath_ProcessorIsCloseable() {
        // NOTE: assumption - JsonProcessingException.getProcessor() is an overridable
        // method (added 2.7) defaulting to null; overridden here to reach the
        // `proc0 instanceof Closeable == true` branch.
        final Closeable closeableProc = mock(Closeable.class);
        JsonProcessingException src = new JsonProcessingException("boom") {
            private static final long serialVersionUID = 1L;
            @Override
            public Object getProcessor() { return closeableProc; }
        };
        Reference ref = new Reference("bean", "f");
        JsonMappingException result = JsonMappingException.wrapWithPath(src, ref);
        assertSame(closeableProc, result.getProcessor());
    }

    @Test
    public void testWrapWithPath_ProcessorNotCloseable() {
        // default getProcessor() assumed to return null -> proc stays null
        JsonProcessingException src = new JsonProcessingException("boom2") {
            private static final long serialVersionUID = 1L;
        };
        Reference ref = new Reference("bean", "f");
        JsonMappingException result = JsonMappingException.wrapWithPath(src, ref);
        assertNull(result.getProcessor());
    }

    @Test
    public void testWrapWithPath_FieldNameOverload() {
        RuntimeException src = new RuntimeException("problem");
        JsonMappingException result = JsonMappingException.wrapWithPath(src, "beanObj", "myfield");
        assertEquals(1, result.getPath().size());
        assertEquals("myfield", result.getPath().get(0).getFieldName());
    }

    @Test
    public void testWrapWithPath_IndexOverload() {
        RuntimeException src = new RuntimeException("problem");
        JsonMappingException result = JsonMappingException.wrapWithPath(src, "beanObj", 2);
        assertEquals(1, result.getPath().size());
        assertEquals(2, result.getPath().get(0).getIndex());
    }

    // ==================== getPath / prependPath ====================

    @Test
    public void testGetPath_NullPathReturnsEmptyList() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        List<Reference> path = ex.getPath();
        assertNotNull(path);
        assertTrue(path.isEmpty());
    }

    @Test
    public void testGetPath_UnmodifiableAfterPrepend() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        ex.prependPath("bean", "field");
        List<Reference> path = ex.getPath();
        assertEquals(1, path.size());
        try {
            path.add(new Reference("x"));
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected: getPath() must return unmodifiable view
        }
    }

    @Test
    public void testPrependPath_ObjectFieldName() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        ex.prependPath("bean1", "f1");
        ex.prependPath("bean2", "f2");
        List<Reference> path = ex.getPath();
        assertEquals(2, path.size());
        assertEquals("f2", path.get(0).getFieldName()); // addFirst semantics
        assertEquals("f1", path.get(1).getFieldName());
    }

    @Test
    public void testPrependPath_ObjectIndex() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        ex.prependPath("bean1", 0);
        ex.prependPath("bean2", 1);
        List<Reference> path = ex.getPath();
        assertEquals(2, path.size());
        assertEquals(1, path.get(0).getIndex());
        assertEquals(0, path.get(1).getIndex());
    }

    @Test
    public void testPrependPath_MaxRefsLimitBoundary() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        int total = JsonMappingException.MAX_REFS_TO_LIST + 50;
        for (int i = 0; i < total; i++) {
            ex.prependPath(new Object(), i);
        }
        // size must never exceed MAX_REFS_TO_LIST (boundary of `_path.size() < MAX_REFS_TO_LIST`)
        assertEquals(JsonMappingException.MAX_REFS_TO_LIST, ex.getPath().size());
    }

    // ==================== getPathReference / _appendPathDesc ====================

    @Test
    public void testGetPathReference_NoPath() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        assertEquals("", ex.getPathReference());
    }

    @Test
    public void testGetPathReference_EmptyPathList() throws Exception {
        // force _path to a non-null, but empty LinkedList via reflection to
        // exercise the branch where _path != null but iterator.hasNext() == false immediately
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        Field f = JsonMappingException.class.getDeclaredField("_path");
        f.setAccessible(true);
        f.set(ex, new LinkedList<Reference>());
        assertEquals("", ex.getPathReference());
    }

    @Test
    public void testGetPathReference_SingleItem() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        ex.prependPath("bean", "field1");
        assertEquals("java.lang.String[\"field1\"]", ex.getPathReference());
    }

    @Test
    public void testGetPathReference_MultipleItemsSeparatedByArrow() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "msg");
        ex.prependPath("bean1", "f1");
        ex.prependPath("bean2", "f2");
        String ref = ex.getPathReference();
        assertEquals("java.lang.String[\"f2\"]->java.lang.String[\"f1\"]", ref);
    }

    // ==================== getMessage / _buildMessage / getLocalizedMessage / toString ====================

    @Test
    public void testGetMessage_NoPath() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "plain message");
        assertEquals("plain message", ex.getMessage());
    }

    @Test
    public void testGetMessage_NullMessageNoPath() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, null);
        assertNull(ex.getMessage());
    }

    @Test
    public void testGetMessage_WithPath() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "root cause msg");
        ex.prependPath("bean", "f1");
        String expected = "root cause msg (through reference chain: java.lang.String[\"f1\"])";
        assertEquals(expected, ex.getMessage());
    }

    @Test
    public void testGetMessage_NullMessageWithPath() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, null);
        ex.prependPath("bean", "f1");
        String expected = " (through reference chain: java.lang.String[\"f1\"])";
        assertEquals(expected, ex.getMessage());
    }

    @Test
    public void testGetLocalizedMessage_MatchesGetMessage() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "hello");
        ex.prependPath("bean", "f1");
        assertEquals(ex.getMessage(), ex.getLocalizedMessage());
    }

    @Test
    public void testToString() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "hello");
        String s = ex.toString();
        assertTrue(s.startsWith(ex.getClass().getName() + ": "));
        assertTrue(s.contains("hello"));
    }

    // ==================== getProcessor ====================

    @Test
    public void testGetProcessor_NullByDefault() {
        JsonMappingException ex = new JsonMappingException("deprecated-ctor-msg");
        assertNull(ex.getProcessor());
    }
}
