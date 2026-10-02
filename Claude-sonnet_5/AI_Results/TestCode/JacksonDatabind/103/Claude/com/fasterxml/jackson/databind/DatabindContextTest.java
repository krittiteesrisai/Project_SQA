package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.lang.reflect.Type;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.impl.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

/**
 * Unit tests for {@link DatabindContext}.
 *
 * เนื่องจาก DatabindContext เป็น abstract class จึงใช้ subclass ทดสอบ
 * (TestDatabindContext) ที่ implement abstract method ทั้งหมด และ inject
 * mock ของ MapperConfig / TypeFactory เพื่อควบคุม branch การทำงาน
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class DatabindContextTest {

    /* ================= Test double: concrete DatabindContext ================= */

    static class TestDatabindContext extends DatabindContext {
        MapperConfig<?> config;
        TypeFactory typeFactory;
        JavaType lastBadDefType;
        String lastBadDefMsg;

        TestDatabindContext(MapperConfig<?> config, TypeFactory typeFactory) {
            this.config = config;
            this.typeFactory = typeFactory;
        }

        @Override public MapperConfig<?> getConfig() { return config; }
        @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
        @Override public boolean isEnabled(MapperFeature feature) { return false; }
        @Override public boolean canOverrideAccessModifiers() { return false; }
        @Override public Class<?> getActiveView() { return null; }
        @Override public Locale getLocale() { return Locale.getDefault(); }
        @Override public TimeZone getTimeZone() { return TimeZone.getDefault(); }
        @Override public JsonFormat.Value getDefaultPropertyFormat(Class<?> baseType) { return null; }
        @Override public Object getAttribute(Object key) { return null; }
        @Override public DatabindContext setAttribute(Object key, Object value) { return this; }

        @Override
        protected JsonMappingException invalidTypeIdException(JavaType baseType, String typeId, String extraDesc) {
            return new JsonMappingException(
                    String.format("INVALID[base=%s|typeId=%s|extra=%s]", baseType, typeId, extraDesc));
        }

        @Override public TypeFactory getTypeFactory() { return typeFactory; }

        @Override
        public <T> T reportBadDefinition(JavaType type, String msg) throws JsonMappingException {
            this.lastBadDefType = type;
            this.lastBadDefMsg = msg;
            throw new JsonMappingException(msg);
        }
    }

    /** Converter จริงที่มี public no-arg constructor สำหรับ path ClassUtil.createInstance */
    public static class DummyConverter implements Converter<Object, Object> {
        public DummyConverter() { }
        @Override public Object convert(Object value) { return value; }
        @Override public JavaType getInputType(TypeFactory tf) { return tf.constructType(Object.class); }
        @Override public JavaType getOutputType(TypeFactory tf) { return tf.constructType(Object.class); }
    }

    private MapperConfig mockConfig;
    private TypeFactory mockTypeFactory;
    private TestDatabindContext ctx;

    @Before
    public void setUp() {
        mockConfig = mock(MapperConfig.class);
        mockTypeFactory = mock(TypeFactory.class);
        when(mockConfig.canOverrideAccessModifiers()).thenReturn(true);
        when(mockConfig.getHandlerInstantiator()).thenReturn(null); // default: hi == null
        ctx = new TestDatabindContext(mockConfig, mockTypeFactory);
    }

    /* ======================= constructType ======================= */

    @Test
    public void constructType_null_returnsNull() {
        assertNull(ctx.constructType((Type) null));
    }

    @Test
    public void constructType_nonNull_delegatesToTypeFactory() {
        JavaType expected = mock(JavaType.class);
        when(mockTypeFactory.constructType(String.class)).thenReturn(expected);
        assertSame(expected, ctx.constructType(String.class));
    }

    /* ==================== constructSpecializedType ==================== */

    @Test
    public void constructSpecializedType_sameRawClass_returnsBaseTypeDirectly() {
        JavaType baseType = mock(JavaType.class);
        when(baseType.getRawClass()).thenReturn((Class) String.class);

        JavaType result = ctx.constructSpecializedType(baseType, String.class);

        assertSame(baseType, result);
        verify(mockConfig, never()).constructSpecializedType(any(JavaType.class), any(Class.class));
    }

    @Test
    public void constructSpecializedType_differentRawClass_delegatesToConfig() {
        JavaType baseType = mock(JavaType.class);
        when(baseType.getRawClass()).thenReturn((Class) Object.class);
        JavaType expected = mock(JavaType.class);
        when(mockConfig.constructSpecializedType(baseType, String.class)).thenReturn(expected);

        JavaType result = ctx.constructSpecializedType(baseType, String.class);

        assertSame(expected, result);
    }

    /* ========================= resolveSubType ========================= */

    @Test
    public void resolveSubType_generic_assignable_returnsParsedType() throws Exception {
        String subClass = "some.Generic<Type>";
        JavaType baseType = mock(JavaType.class);
        when(baseType.getRawClass()).thenReturn((Class) Object.class);

        JavaType parsed = mock(JavaType.class);
        when(mockTypeFactory.constructFromCanonical(subClass)).thenReturn(parsed);
        when(parsed.isTypeOrSubTypeOf(Object.class)).thenReturn(true);

        JavaType result = ctx.resolveSubType(baseType, subClass);

        assertSame(parsed, result);
    }

    @Test
    public void resolveSubType_generic_notAssignable_throwsNotASubtype() {
        String subClass = "some.Generic<Type>";
        JavaType baseType = mock(JavaType.class);
        when(baseType.getRawClass()).thenReturn((Class) Object.class);

        JavaType parsed = mock(JavaType.class);
        when(mockTypeFactory.constructFromCanonical(subClass)).thenReturn(parsed);
        when(parsed.isTypeOrSubTypeOf(Object.class)).thenReturn(false);

        try {
            ctx.resolveSubType(baseType, subClass);
            fail("expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Not a subtype"));
        }
    }

    @Test
    public void resolveSubType_plain_classNotFound_returnsNull() throws Exception {
        String subClass = "no.such.Class";
        JavaType baseType = mock(JavaType.class);
        when(mockTypeFactory.findClass(subClass)).thenThrow(new ClassNotFoundException("nope"));

        assertNull(ctx.resolveSubType(baseType, subClass));
    }

    @Test
    public void resolveSubType_plain_findClassThrowsOtherException_wrapsIntoInvalidTypeId() throws Exception {
        String subClass = "some.Class";
        JavaType baseType = mock(JavaType.class);
        when(mockTypeFactory.findClass(subClass)).thenThrow(new RuntimeException("boom"));

        try {
            ctx.resolveSubType(baseType, subClass);
            fail("expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("problem:"));
            assertTrue(e.getMessage().contains("RuntimeException"));
            assertTrue(e.getMessage().contains("boom"));
        }
    }

    @Test
    public void resolveSubType_plain_isSuperType_returnsSpecializedType() throws Exception {
        String subClass = "java.lang.Integer";
        JavaType baseType = mock(JavaType.class);
        when(mockTypeFactory.findClass(subClass)).thenReturn((Class) Integer.class);
        when(baseType.isTypeOrSuperTypeOf(Integer.class)).thenReturn(true);

        JavaType specialized = mock(JavaType.class);
        when(mockTypeFactory.constructSpecializedType(baseType, Integer.class)).thenReturn(specialized);

        JavaType result = ctx.resolveSubType(baseType, subClass);

        assertSame(specialized, result);
    }

    @Test
    public void resolveSubType_plain_notSuperType_throwsNotASubtype() throws Exception {
        String subClass = "java.lang.Integer";
        JavaType baseType = mock(JavaType.class);
        when(mockTypeFactory.findClass(subClass)).thenReturn((Class) Integer.class);
        when(baseType.isTypeOrSuperTypeOf(Integer.class)).thenReturn(false);

        try {
            ctx.resolveSubType(baseType, subClass);
            fail("expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Not a subtype"));
        }
    }

    /* ==================== objectIdGeneratorInstance ==================== */

    @Test
    public void objectIdGeneratorInstance_hiNull_usesClassUtilCreateInstance() throws Exception {
        Annotated annotated = mock(Annotated.class);
        ObjectIdInfo info = mock(ObjectIdInfo.class);
        when(info.getGeneratorType()).thenReturn((Class) ObjectIdGenerators.IntSequenceGenerator.class);
        when(info.getScope()).thenReturn((Class) Object.class);

        ObjectIdGenerator<?> result = ctx.objectIdGeneratorInstance(annotated, info);

        assertNotNull(result);
        assertTrue(result instanceof ObjectIdGenerator);
    }

    @Test
    public void objectIdGeneratorInstance_hiReturnsNonNull_usesHandlerInstantiator() throws Exception {
        Annotated annotated = mock(Annotated.class);
        ObjectIdInfo info = mock(ObjectIdInfo.class);
        Class implClass = ObjectIdGenerators.IntSequenceGenerator.class;
        when(info.getGeneratorType()).thenReturn(implClass);
        when(info.getScope()).thenReturn((Class) Object.class);

        HandlerInstantiator hi = mock(HandlerInstantiator.class);
        when(mockConfig.getHandlerInstantiator()).thenReturn(hi);

        ObjectIdGenerator genFromHi = mock(ObjectIdGenerator.class);
        ObjectIdGenerator finalGen = mock(ObjectIdGenerator.class);
        when(hi.objectIdGeneratorInstance(mockConfig, annotated, implClass)).thenReturn(genFromHi);
        when(genFromHi.forScope(Object.class)).thenReturn(finalGen);

        ObjectIdGenerator<?> result = ctx.objectIdGeneratorInstance(annotated, info);

        assertSame(finalGen, result);
    }

    @Test
    public void objectIdGeneratorInstance_hiReturnsNull_fallsBackToCreateInstance() throws Exception {
        Annotated annotated = mock(Annotated.class);
        ObjectIdInfo info = mock(ObjectIdInfo.class);
        Class implClass = ObjectIdGenerators.IntSequenceGenerator.class;
        when(info.getGeneratorType()).thenReturn(implClass);
        when(info.getScope()).thenReturn((Class) Object.class);

        HandlerInstantiator hi = mock(HandlerInstantiator.class);
        when(mockConfig.getHandlerInstantiator()).thenReturn(hi);
        when(hi.objectIdGeneratorInstance(mockConfig, annotated, implClass)).thenReturn(null);

        ObjectIdGenerator<?> result = ctx.objectIdGeneratorInstance(annotated, info);

        assertNotNull(result);
    }

    /* ==================== objectIdResolverInstance ==================== */

    @Test
    public void objectIdResolverInstance_hiNull_usesClassUtilCreateInstance() {
        Annotated annotated = mock(Annotated.class);
        ObjectIdInfo info = mock(ObjectIdInfo.class);
        when(info.getResolverType()).thenReturn((Class) SimpleObjectIdResolver.class);

        ObjectIdResolver result = ctx.objectIdResolverInstance(annotated, info);

        assertNotNull(result);
        assertTrue(result instanceof ObjectIdResolver);
    }

    @Test
    public void objectIdResolverInstance_hiReturnsNonNull_usesHandlerInstantiator() {
        Annotated annotated = mock(Annotated.class);
        ObjectIdInfo info = mock(ObjectIdInfo.class);
        Class implClass = SimpleObjectIdResolver.class;
        when(info.getResolverType()).thenReturn(implClass);

        HandlerInstantiator hi = mock(HandlerInstantiator.class);
        when(mockConfig.getHandlerInstantiator()).thenReturn(hi);
        ObjectIdResolver resolverFromHi = mock(ObjectIdResolver.class);
        when(hi.resolverIdGeneratorInstance(mockConfig, annotated, implClass)).thenReturn(resolverFromHi);

        ObjectIdResolver result = ctx.objectIdResolverInstance(annotated, info);

        assertSame(resolverFromHi, result);
    }

    @Test
    public void objectIdResolverInstance_hiReturnsNull_fallsBackToCreateInstance() {
        Annotated annotated = mock(Annotated.class);
        ObjectIdInfo info = mock(ObjectIdInfo.class);
        Class implClass = SimpleObjectIdResolver.class;
        when(info.getResolverType()).thenReturn(implClass);

        HandlerInstantiator hi = mock(HandlerInstantiator.class);
        when(mockConfig.getHandlerInstantiator()).thenReturn(hi);
        when(hi.resolverIdGeneratorInstance(mockConfig, annotated, implClass)).thenReturn(null);

        ObjectIdResolver result = ctx.objectIdResolverInstance(annotated, info);

        assertNotNull(result);
    }

    /* ========================= converterInstance ========================= */

    @Test
    public void converterInstance_null_returnsNull() throws Exception {
        Annotated annotated = mock(Annotated.class);
        assertNull(ctx.converterInstance(annotated, null));
    }

    @Test
    public void converterInstance_alreadyConverterInstance_returnsSame() throws Exception {
        Annotated annotated = mock(Annotated.class);
        Converter<Object, Object> conv = mock(Converter.class);
        Converter<Object, Object> result = ctx.converterInstance(annotated, conv);
        assertSame(conv, result);
    }

    @Test
    public void converterInstance_notConverterNotClass_throwsIllegalState() throws Exception {
        Annotated annotated = mock(Annotated.class);
        try {
            ctx.converterInstance(annotated, "not-a-converter-or-class");
            fail("expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("expected type Converter or Class<Converter>"));
        }
    }

    @Test
    public void converterInstance_converterNoneClass_returnsNull() throws Exception {
        Annotated annotated = mock(Annotated.class);
        Converter<Object, Object> result = ctx.converterInstance(annotated, Converter.None.class);
        assertNull(result);
    }

    // หมายเหตุ: branch "ClassUtil.isBogusClass(converterClass)" ในเงื่อนไข OR ถัดจาก
    // Converter.None.class ไม่ได้ทดสอบแยก เนื่องจากไม่สามารถยืนยัน behavior ที่แน่ชัดของ
    // ClassUtil.isBogusClass จาก source ของ DatabindContext ที่ให้มาได้ (หลีกเลี่ยงการเดา)

    @Test
    public void converterInstance_classNotAssignableToConverter_throwsIllegalState() throws Exception {
        Annotated annotated = mock(Annotated.class);
        try {
            ctx.converterInstance(annotated, String.class);
            fail("expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("expected Class<Converter>"));
        }
    }

    @Test
    public void converterInstance_hiNull_usesClassUtilCreateInstance() throws Exception {
        Annotated annotated = mock(Annotated.class);
        Converter<Object, Object> result = ctx.converterInstance(annotated, DummyConverter.class);
        assertNotNull(result);
        assertTrue(result instanceof DummyConverter);
    }

    @Test
    public void converterInstance_hiReturnsNonNull_usesHandlerInstantiator() throws Exception {
        Annotated annotated = mock(Annotated.class);
        HandlerInstantiator hi = mock(HandlerInstantiator.class);
        when(mockConfig.getHandlerInstantiator()).thenReturn(hi);
        Converter convFromHi = mock(Converter.class);
        when(hi.converterInstance(mockConfig, annotated, DummyConverter.class)).thenReturn(convFromHi);

        Converter<Object, Object> result = ctx.converterInstance(annotated, DummyConverter.class);

        assertSame(convFromHi, result);
    }

    @Test
    public void converterInstance_hiReturnsNull_fallsBackToCreateInstance() throws Exception {
        Annotated annotated = mock(Annotated.class);
        HandlerInstantiator hi = mock(HandlerInstantiator.class);
        when(mockConfig.getHandlerInstantiator()).thenReturn(hi);
        when(hi.converterInstance(mockConfig, annotated, DummyConverter.class)).thenReturn(null);

        Converter<Object, Object> result = ctx.converterInstance(annotated, DummyConverter.class);

        assertNotNull(result);
        assertTrue(result instanceof DummyConverter);
    }

    /* ======================= reportBadDefinition(Class,...) ======================= */

    @Test
    public void reportBadDefinitionClass_delegatesToJavaTypeVersion() {
        JavaType jt = mock(JavaType.class);
        when(mockTypeFactory.constructType(String.class)).thenReturn(jt);

        try {
            ctx.reportBadDefinition(String.class, "bad def");
            fail("expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertEquals("bad def", e.getMessage());
            assertSame(jt, ctx.lastBadDefType);
        }
    }

    /* ============================ _format ============================ */

    @Test
    public void format_noArgs_returnsMsgUnchanged() {
        assertEquals("plain message", ctx._format("plain message"));
    }

    @Test
    public void format_withArgs_usesStringFormat() {
        assertEquals("a-5", ctx._format("%s-%d", "a", 5));
    }

    /* ============================ _truncate ============================ */

    @Test
    public void truncate_null_returnsEmptyString() {
        assertEquals("", ctx._truncate(null));
    }

    @Test
    public void truncate_exactlyMaxLen_returnsUnchanged() {
        String desc = repeat('Z', 500);
        assertEquals(desc, ctx._truncate(desc));
    }

    @Test
    public void truncate_overMaxLen_truncatesWithMarker() {
        String head = repeat('X', 500);
        String tail = repeat('Y', 500);
        String desc = head + tail; // length 1000
        String expected = head + "]...[" + tail; // substring(0,500) + marker + substring(500)
        assertEquals(expected, ctx._truncate(desc));
    }

    private static String repeat(char c, int n) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) sb.append(c);
        return sb.toString();
    }

    /* ============================ _quotedString ============================ */

    @Test
    public void quotedString_null_returnsNA() {
        assertEquals("[N/A]", ctx._quotedString(null));
    }

    @Test
    public void quotedString_nonNull_wrapsInQuotes() {
        assertEquals("\"abc\"", ctx._quotedString("abc"));
    }

    /* ============================ _colonConcat ============================ */

    @Test
    public void colonConcat_extraNull_returnsBaseOnly() {
        assertEquals("base", ctx._colonConcat("base", null));
    }

    @Test
    public void colonConcat_extraNonNull_concatenatesWithColon() {
        assertEquals("base: extra", ctx._colonConcat("base", "extra"));
    }

    /* ============================ _desc ============================ */

    @Test
    public void desc_null_returnsNA() {
        assertEquals("[N/A]", ctx._desc(null));
    }

    @Test
    public void desc_nonNull_returnsTruncatedValue() {
        assertEquals("short", ctx._desc("short"));
    }
}
