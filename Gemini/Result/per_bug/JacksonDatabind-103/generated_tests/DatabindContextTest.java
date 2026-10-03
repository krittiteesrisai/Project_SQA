package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.lang.reflect.Type;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;

public class DatabindContextTest {

    private DatabindContext context;
    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        context = new DatabindContext() {
            @Override public MapperConfig<?> getConfig() { return mapper.getSerializationConfig(); }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return mapper.getSerializationConfig().getAnnotationIntrospector(); }
            @Override public boolean isEnabled(MapperFeature f) { return mapper.isEnabled(f); }
            @Override public boolean canOverrideAccessModifiers() { return mapper.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS); }
            @Override public Class<?> getActiveView() { return null; }
            @Override public Locale getLocale() { return Locale.getDefault(); }
            @Override public TimeZone getTimeZone() { return TimeZone.getDefault(); }
            @Override public JsonFormat.Value getDefaultPropertyFormat(Class<?> b) { return JsonFormat.Value.empty(); }
            @Override public Object getAttribute(Object k) { return null; }
            @Override public DatabindContext setAttribute(Object k, Object v) { return this; }
            @Override public TypeFactory getTypeFactory() { return mapper.getTypeFactory(); }
            @Override public JavaType constructType(Type t) { return super.constructType(t); }
            @Override public <T> T reportBadDefinition(JavaType t, String msg) throws JsonMappingException {
                throw new InvalidDefinitionException(null, msg, t);
            }
            @Override protected JsonMappingException invalidTypeIdException(JavaType b, String id, String desc) {
                return new JsonMappingException(null, "Invalid type id: " + id + " - " + desc);
            }
        };
    }

    @Test
    public void testConstructTypeNull() {
        assertNull(context.constructType(null));
    }

    @Test
    public void testConstructTypeValid() {
        JavaType type = context.constructType(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructSpecializedTypeSameClass() {
        JavaType baseType = context.constructType(String.class);
        JavaType specialized = context.constructSpecializedType(baseType, String.class);
        assertSame(baseType, specialized);
    }

    @Test
    public void testConstructSpecializedTypeDifferentClass() {
        JavaType baseType = context.constructType(Number.class);
        JavaType specialized = context.constructSpecializedType(baseType, Integer.class);
        assertNotNull(specialized);
        assertEquals(Integer.class, specialized.getRawClass());
    }

    @Test
    public void testResolveSubTypeWithGenerics() throws Exception {
        JavaType baseType = context.constructType(java.util.List.class);
        // Has '<'
        JavaType sub = context.resolveSubType(baseType, "java.util.ArrayList<String>");
        assertNotNull(sub);
    }

    @Test(expected = JsonMappingException.class)
    public void testResolveSubTypeWithGenericsIncompatible() throws Exception {
        JavaType baseType = context.constructType(Integer.class);
        // ArrayList is not subtype of Integer, should throw exception due to compatibility check
        context.resolveSubType(baseType, "java.util.ArrayList<String>");
    }

    @Test
    public void testResolveSubTypeNormalClass() throws Exception {
        JavaType baseType = context.constructType(Number.class);
        JavaType sub = context.resolveSubType(baseType, "java.lang.Integer");
        assertNotNull(sub);
        assertEquals(Integer.class, sub.getRawClass());
    }

    @Test
    public void testResolveSubTypeClassNotFound() throws Exception {
        JavaType baseType = context.constructType(Object.class);
        JavaType sub = context.resolveSubType(baseType, "com.nonexistent.BogusClassXYZ");
        assertNull(sub);
    }

    @Test(expected = JsonMappingException.class)
    public void testResolveSubTypeNotASubtype() throws Exception {
        JavaType baseType = context.constructType(String.class);
        context.resolveSubType(baseType, "java.lang.Integer");
    }

    @Test
    public void testConverterInstanceNull() throws Exception {
        assertNull(context.converterInstance(null, null));
    }

    @Test
    public void testConverterInstanceDirectInstance() throws Exception {
        Converter<Object, Object> dummyConv = new Converter<Object, Object>() {
            @Override public Object convert(Object value) { return value; }
            @Override public JavaType getInputType(TypeFactory tf) { return null; }
            @Override public JavaType getOutputType(TypeFactory tf) { return null; }
        };
        assertSame(dummyConv, context.converterInstance(null, dummyConv));
    }

    @Test(expected = IllegalStateException.class)
    public void testConverterInstanceInvalidType() throws Exception {
        context.converterInstance(null, new Object());
    }

    @Test
    public void testConverterInstanceNoneAndBogus() throws Exception {
        assertNull(context.converterInstance(null, Converter.None.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testConverterInstanceNotAConverterClass() throws Exception {
        context.converterInstance(null, String.class);
    }

    @Test
    public void testConverterInstanceValidClass() throws Exception {
        // DummyConverter must implement Converter and have a public no-arg constructor
        Converter<?, ?> conv = context.converterInstance(null, DummyConverter.class);
        assertNotNull(conv);
    }

    @Test
    public void testReportBadDefinitionWithClass() {
        try {
            context.reportBadDefinition(String.class, "Bad error");
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertEquals("Bad error", e.getMessage());
        }
    }

    @Test
    public void testHelperFormattingAndTruncation() {
        // Access protected methods via reflection or subclassing if needed, 
        // Since we are in the same package (or we can test via a wrapper method in anonymous class).
        // Let's test using a concrete subclass helper method invocation:
        TestHelperAccessor helper = new TestHelperAccessor();
        
        assertEquals("Hello World", helper.callFormat("Hello %s", "World"));
        assertEquals("Plain", helper.callFormat("Plain"));
        
        assertEquals("", helper.callTruncate(null));
        assertEquals("Short", helper.callTruncate("Short"));
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 600; i++) sb.append("a");
        String longStr = sb.toString();
        String truncated = helper.callTruncate(longStr);
        assertTrue(truncated.contains("]...["));

        assertEquals("[N/A]", helper.callQuotedString(null));
        assertTrue(helper.callQuotedString("test").startsWith("\""));

        assertEquals("base", helper.callColonConcat("base", null));
        assertEquals("base: extra", helper.callColonConcat("base", "extra"));

        assertEquals("[N/A]", helper.callDesc(null));
        assertEquals("desc", helper.callDesc("desc"));
    }

    // Helper classes for testing
    public static class DummyConverter implements Converter<Object, Object> {
        @Override public Object convert(Object value) { return value; }
        @Override public JavaType getInputType(TypeFactory tf) { return null; }
        @Override public JavaType getOutputType(TypeFactory tf) { return null; }
    }

    private static class TestHelperAccessor extends DatabindContext {
        @Override public MapperConfig<?> getConfig() { return null; }
        @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
        @Override public boolean isEnabled(MapperFeature f) { return false; }
        @Override public boolean canOverrideAccessModifiers() { return false; }
        @Override public Class<?> getActiveView() { return null; }
        @Override public Locale getLocale() { return null; }
        @Override public TimeZone getTimeZone() { return null; }
        @Override public JsonFormat.Value getDefaultPropertyFormat(Class<?> b) { return null; }
        @Override public Object getAttribute(Object k) { return null; }
        @Override public DatabindContext setAttribute(Object k, Object v) { return null; }
        @Override protected JsonMappingException invalidTypeIdException(JavaType b, String id, String desc) { return null; }
        @Override public TypeFactory getTypeFactory() { return null; }
        @Override public <T> T reportBadDefinition(JavaType t, String msg) throws JsonMappingException { return null; }

        public String callFormat(String m, Object... args) { return _format(m, args); }
        public String callTruncate(String d) { return _truncate(d); }
        public String callQuotedString(String d) { return _quotedString(d); }
        public String callColonConcat(String b, String e) { return _colonConcat(b, e); }
        public String callDesc(String d) { return _desc(d); }
    }
}