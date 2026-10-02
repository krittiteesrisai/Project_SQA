package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

public class DeserializationContextTest {

    // =====================================================================
    // Test double: minimal concrete subclass exposing protected constructors
    // =====================================================================
    static class TestCtx extends DeserializationContext {
        private static final long serialVersionUID = 1L;

        TestCtx(DeserializerFactory df) { super(df); }
        TestCtx(DeserializerFactory df, DeserializerCache cache) { super(df, cache); }
        TestCtx(DeserializationContext src, DeserializerFactory factory) { super(src, factory); }
        TestCtx(DeserializationContext src, DeserializationConfig config, JsonParser p, InjectableValues iv) {
            super(src, config, p, iv);
        }
        TestCtx(DeserializationContext src) { super(src); }

        @Override
        public ReadableObjectId findObjectId(Object id, ObjectIdGenerator<?> generator, ObjectIdResolver resolver) {
            return null; // not under test here
        }
        @Override
        public void checkUnresolvedObjectId() throws UnresolvedForwardReference { }
        @Override
        public JsonDeserializer<Object> deserializerInstance(Annotated annotated, Object deserDef) {
            return null;
        }
        @Override
        public KeyDeserializer keyDeserializerInstance(Annotated annotated, Object deserDef) {
            return null;
        }
    }

    private DeserializerFactory mockFactory;
    private DeserializerCache mockCache;
    private JsonParser parser;

    @Before
    public void setUp() throws IOException {
        mockFactory = mock(DeserializerFactory.class);
        mockCache = mock(DeserializerCache.class);
        parser = new JsonFactory().createParser("123");
        parser.nextToken();
    }

    @After
    public void tearDown() throws IOException {
        if (parser != null) parser.close();
    }

    private TestCtx blueprint() {
        return new TestCtx(mockFactory, mockCache);
    }

    private TestCtx ctxWith(DeserializationConfig config, InjectableValues iv) {
        return new TestCtx(blueprint(), config, parser, iv);
    }

    private DeserializationConfig baseConfig() {
        return new ObjectMapper().getDeserializationConfig();
    }

    private DeserializationConfig configWithFeature(DeserializationFeature f, boolean enabled) {
        return new ObjectMapper().configure(f, enabled).getDeserializationConfig();
    }

    private DeserializationConfig configWithFeature(MapperFeature f, boolean enabled) {
        return new ObjectMapper().configure(f, enabled).getDeserializationConfig();
    }

    private DeserializationConfig configWithHandlers(DeserializationProblemHandler... handlers) {
        ObjectMapper m = new ObjectMapper();
        for (DeserializationProblemHandler h : handlers) m.addHandler(h);
        return m.getDeserializationConfig();
    }

    // =====================================================================
    // Constructors
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullFactory_throwsIllegalArgumentException() {
        new TestCtx((DeserializerFactory) null);
    }

    @Test
    public void constructor_withFactoryOnly_createsDefaultCache() {
        TestCtx c = new TestCtx(mockFactory);
        assertNotNull(c._cache);
        assertNull(c.getConfig());
    }

    @Test
    public void constructor_withExplicitNullCache_createsDefaultCache() {
        TestCtx c = new TestCtx(mockFactory, null);
        assertNotNull(c._cache);
    }

    @Test
    public void constructor_withExplicitCache_usesProvidedCache() {
        TestCtx c = new TestCtx(mockFactory, mockCache);
        assertSame(mockCache, c._cache);
    }

    @Test
    public void constructor_copyWithNewFactory_retainsCacheAndConfig() {
        TestCtx src = blueprint();
        DeserializerFactory otherFactory = mock(DeserializerFactory.class);
        TestCtx copy = new TestCtx(src, otherFactory);
        assertSame(src._cache, copy._cache);
        assertSame(otherFactory, copy.getFactory());
    }

    @Test
    public void constructor_fullInstance_setsConfigDerivedFields() {
        DeserializationConfig cfg = baseConfig();
        TestCtx c = ctxWith(cfg, null);
        assertSame(cfg, c.getConfig());
        assertSame(parser, c.getParser());
        assertEquals(cfg.getDeserializationFeatures(), c.getDeserializationFeatures());
    }

    @Test
    public void constructor_copyConstructor_newCacheAndNullInjectableValues() {
        TestCtx src = ctxWith(baseConfig(), mock(InjectableValues.class));
        TestCtx copy = new TestCtx(src);
        assertNotNull(copy._cache);
        assertNotSame(src._cache, copy._cache);
    }

    // =====================================================================
    // DatabindContext pass-through
    // =====================================================================

    @Test
    public void getActiveView_returnsConfiguredView() {
        DeserializationConfig cfg = baseConfig().withView(String.class);
        TestCtx c = ctxWith(cfg, null);
        assertEquals(String.class, c.getActiveView());
    }

    @Test
    public void canOverrideAccessModifiers_delegatesToConfig() {
        DeserializationConfig cfg = baseConfig();
        TestCtx c = ctxWith(cfg, null);
        assertEquals(cfg.canOverrideAccessModifiers(), c.canOverrideAccessModifiers());
    }

    @Test
    public void isEnabledMapperFeature_delegatesToConfig() {
        DeserializationConfig cfg = configWithFeature(MapperFeature.AUTO_DETECT_GETTERS, false);
        TestCtx c = ctxWith(cfg, null);
        assertFalse(c.isEnabled(MapperFeature.AUTO_DETECT_GETTERS));
    }

    @Test
    public void getAnnotationIntrospector_delegatesToConfig() {
        DeserializationConfig cfg = baseConfig();
        TestCtx c = ctxWith(cfg, null);
        assertSame(cfg.getAnnotationIntrospector(), c.getAnnotationIntrospector());
    }

    @Test
    public void getTypeFactory_delegatesToConfig() {
        DeserializationConfig cfg = baseConfig();
        TestCtx c = ctxWith(cfg, null);
        assertSame(cfg.getTypeFactory(), c.getTypeFactory());
    }

    @Test
    public void getLocaleAndTimeZone_delegateToConfig() {
        DeserializationConfig cfg = baseConfig();
        TestCtx c = ctxWith(cfg, null);
        assertEquals(cfg.getLocale(), c.getLocale());
        assertEquals(cfg.getTimeZone(), c.getTimeZone());
    }

    // =====================================================================
    // Attributes
    // =====================================================================

    @Test
    public void attribute_roundTrip_setThenGet() {
        TestCtx c = ctxWith(baseConfig(), null);
        c.setAttribute("k", "v");
        assertEquals("v", c.getAttribute("k"));
    }

    @Test
    public void attribute_unsetKey_returnsNull() {
        TestCtx c = ctxWith(baseConfig(), null);
        assertNull(c.getAttribute("missing"));
    }

    // =====================================================================
    // Contextual type / handlePrimary/SecondaryContextualization
    // =====================================================================

    @Test
    public void getContextualType_initiallyNull() {
        TestCtx c = ctxWith(baseConfig(), null);
        assertNull(c.getContextualType());
    }

    @Test
    public void handlePrimaryContextualization_nonContextual_returnsSameInstance() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        JavaType type = c.constructType(String.class);
        JsonDeserializer<?> result = c.handlePrimaryContextualization(deser, null, type);
        assertSame(deser, result);
        assertNull(c.getContextualType());
    }

    @Test
    public void handlePrimaryContextualization_contextual_setsAndRestoresContextualType() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        final JsonDeserializer<?> finalDeser = mock(JsonDeserializer.class);
        final JavaType type = c.constructType(String.class);
        final AtomicReference<JavaType> seen = new AtomicReference<JavaType>();

        class ContextualJD extends JsonDeserializer<Object> implements ContextualDeserializer {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty prop) {
                seen.set(ctxt.getContextualType());
                return finalDeser;
            }
        }
        JsonDeserializer<?> result = c.handlePrimaryContextualization(new ContextualJD(), null, type);
        assertSame(finalDeser, result);
        assertEquals(type, seen.get());
        assertNull(c.getContextualType()); // restored after call ("finally" branch)
    }

    @Test
    public void handleSecondaryContextualization_nonContextual_returnsSameInstance() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        JavaType type = c.constructType(Integer.class);
        assertSame(deser, c.handleSecondaryContextualization(deser, null, type));
    }

    // =====================================================================
    // Feature-flag bitmap helpers
    // =====================================================================

    @Test
    public void isEnabledDeserializationFeature_trueWhenBitSet() {
        DeserializationConfig cfg = configWithFeature(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        TestCtx c = ctxWith(cfg, null);
        assertTrue(c.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void isEnabledDeserializationFeature_falseWhenBitNotSet() {
        DeserializationConfig cfg = configWithFeature(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        TestCtx c = ctxWith(cfg, null);
        assertFalse(c.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void hasDeserializationFeatures_allBitsPresent_true() {
        DeserializationConfig cfg = configWithFeature(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        TestCtx c = ctxWith(cfg, null);
        int mask = DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES.getMask();
        assertTrue(c.hasDeserializationFeatures(mask));
    }

    @Test
    public void hasDeserializationFeatures_notAllBitsPresent_false() {
        DeserializationConfig cfg = configWithFeature(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        TestCtx c = ctxWith(cfg, null);
        int mask = DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES.getMask();
        assertFalse(c.hasDeserializationFeatures(mask));
    }

    @Test
    public void hasSomeOfFeatures_atLeastOneBit_true() {
        DeserializationConfig cfg = configWithFeature(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        TestCtx c = ctxWith(cfg, null);
        int mask = DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES.getMask()
                | DeserializationFeature.FAIL_ON_INVALID_SUBTYPE.getMask();
        assertTrue(c.hasSomeOfFeatures(mask));
    }

    @Test
    public void hasSomeOfFeatures_noBitsMatch_false() {
        DeserializationConfig cfg = configWithFeature(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        TestCtx c = ctxWith(cfg, null);
        int mask = DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES.getMask();
        assertFalse(c.hasSomeOfFeatures(mask));
    }

    // =====================================================================
    // findInjectableValue
    // =====================================================================

    @Test
    public void findInjectableValue_nullInjectableValues_throws() {
        TestCtx c = ctxWith(baseConfig(), null);
        try {
            c.findInjectableValue("id1", null, null);
            fail("expected exception");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("injectableValues"));
        }
    }

    @Test
    public void findInjectableValue_withInjectableValues_delegates() throws Exception {
        InjectableValues iv = mock(InjectableValues.class);
        TestCtx c = ctxWith(baseConfig(), iv);
        when(iv.findInjectableValue("id1", c, null, null)).thenReturn("resolved");
        assertEquals("resolved", c.findInjectableValue("id1", null, null));
    }

    // =====================================================================
    // Base64 / NodeFactory pass-through
    // =====================================================================

    @Test
    public void getBase64VariantAndNodeFactory_delegateToConfig() {
        DeserializationConfig cfg = baseConfig();
        TestCtx c = ctxWith(cfg, null);
        assertSame(cfg.getBase64Variant(), c.getBase64Variant());
        assertSame(cfg.getNodeFactory(), c.getNodeFactory());
    }

    // =====================================================================
    // hasValueDeserializerFor
    // =====================================================================

    @Test
    public void hasValueDeserializerFor_normal_true() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        JavaType type = c.constructType(String.class);
        when(mockCache.hasValueDeserializerFor(c, mockFactory, type)).thenReturn(true);
        assertTrue(c.hasValueDeserializerFor(type, null));
    }

    @Test
    public void hasValueDeserializerFor_normal_false() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        JavaType type = c.constructType(String.class);
        when(mockCache.hasValueDeserializerFor(c, mockFactory, type)).thenReturn(false);
        assertFalse(c.hasValueDeserializerFor(type, null));
    }

    @Test
    public void hasValueDeserializerFor_jsonMappingException_setsCause() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        JavaType type = c.constructType(String.class);
        JsonMappingException jme = new JsonMappingException(parser, "boom");
        when(mockCache.hasValueDeserializerFor(c, mockFactory, type)).thenThrow(jme);
        AtomicReference<Throwable> cause = new AtomicReference<Throwable>();
        assertFalse(c.hasValueDeserializerFor(type, cause));
        assertSame(jme, cause.get());
    }

    @Test(expected = RuntimeException.class)
    public void hasValueDeserializerFor_runtimeException_causeNull_rethrows() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        JavaType type = c.constructType(String.class);
        when(mockCache.hasValueDeserializerFor(c, mockFactory, type)).thenThrow(new RuntimeException("x"));
        c.hasValueDeserializerFor(type, null);
    }

    @Test
    public void hasValueDeserializerFor_runtimeException_causeProvided_setsCauseReturnsFalse() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        JavaType type = c.constructType(String.class);
        RuntimeException re = new RuntimeException("x");
        when(mockCache.hasValueDeserializerFor(c, mockFactory, type)).thenThrow(re);
        AtomicReference<Throwable> cause = new AtomicReference<Throwable>();
        assertFalse(c.hasValueDeserializerFor(type, cause));
        assertSame(re, cause.get());
    }

    // =====================================================================
    // findContextualValueDeserializer / findNonContextualValueDeserializer
    // =====================================================================

    @Test
    public void findContextualValueDeserializer_nullFromCache_returnsNull() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        JavaType type = c.constructType(String.class);
        when(mockCache.findValueDeserializer(c, mockFactory, type)).thenReturn(null);
        assertNull(c.findContextualValueDeserializer(type, null));
    }

    @Test
    public void findContextualValueDeserializer_contextualizesResult() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        JavaType type = c.constructType(String.class);
        final JsonDeserializer<Object> finalDeser = mock(JsonDeserializer.class);
        class ContextualJD extends JsonDeserializer<Object> implements ContextualDeserializer {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty prop) {
                return finalDeser;
            }
        }
        when(mockCache.findValueDeserializer(c, mockFactory, type)).thenReturn(new ContextualJD());
        assertSame(finalDeser, c.findContextualValueDeserializer(type, null));
    }

    @Test
    public void findNonContextualValueDeserializer_returnsRawCacheResult_noContextualization() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        JavaType type = c.constructType(String.class);
        JsonDeserializer<Object> raw = mock(JsonDeserializer.class);
        when(mockCache.findValueDeserializer(c, mockFactory, type)).thenReturn(raw);
        assertSame(raw, c.findNonContextualValueDeserializer(type));
    }

    // =====================================================================
    // findRootValueDeserializer
    // =====================================================================

    @Test
    public void findRootValueDeserializer_nullFromCache_returnsNull() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        JavaType type = c.constructType(String.class);
        when(mockCache.findValueDeserializer(c, mockFactory, type)).thenReturn(null);
        assertNull(c.findRootValueDeserializer(type));
        verify(mockFactory, never()).findTypeDeserializer(any(DeserializationConfig.class), any(JavaType.class));
    }

    @Test
    public void findRootValueDeserializer_noTypeDeserializer_returnsPlain() throws Exception {
        DeserializationConfig cfg = baseConfig();
        TestCtx c = ctxWith(cfg, null);
        JavaType type = c.constructType(String.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(mockCache.findValueDeserializer(c, mockFactory, type)).thenReturn(deser);
        when(mockFactory.findTypeDeserializer(cfg, type)).thenReturn(null);
        assertSame(deser, c.findRootValueDeserializer(type));
    }

    @Test
    public void findRootValueDeserializer_withTypeDeserializer_wrapsInTypeWrappedDeserializer() throws Exception {
        DeserializationConfig cfg = baseConfig();
        TestCtx c = ctxWith(cfg, null);
        JavaType type = c.constructType(String.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(mockCache.findValueDeserializer(c, mockFactory, type)).thenReturn(deser);
        when(mockFactory.findTypeDeserializer(cfg, type)).thenReturn(typeDeser);
        when(typeDeser.forProperty(null)).thenReturn(typeDeser);
        Object result = c.findRootValueDeserializer(type);
        assertTrue(result instanceof TypeWrappedDeserializer);
    }

    // =====================================================================
    // findKeyDeserializer
    // =====================================================================

    @Test
    public void findKeyDeserializer_nonContextual_returnsSame() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        JavaType keyType = c.constructType(String.class);
        KeyDeserializer kd = mock(KeyDeserializer.class);
        when(mockCache.findKeyDeserializer(c, mockFactory, keyType)).thenReturn(kd);
        assertSame(kd, c.findKeyDeserializer(keyType, null));
    }

    @Test
    public void findKeyDeserializer_contextual_returnsContextualizedResult() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        JavaType keyType = c.constructType(String.class);
        final KeyDeserializer finalKd = mock(KeyDeserializer.class);
        class ContextualKD extends KeyDeserializer implements ContextualKeyDeserializer {
            @Override public Object deserializeKey(String key, DeserializationContext ctxt) { return null; }
            @Override public KeyDeserializer createContextual(DeserializationContext ctxt, BeanProperty prop) {
                return finalKd;
            }
        }
        when(mockCache.findKeyDeserializer(c, mockFactory, keyType)).thenReturn(new ContextualKD());
        assertSame(finalKd, c.findKeyDeserializer(keyType, null));
    }

    // =====================================================================
    // constructType / findClass
    // =====================================================================

    @Test
    public void constructType_nullClass_returnsNull() {
        TestCtx c = ctxWith(baseConfig(), null);
        assertNull(c.constructType(null));
    }

    @Test
    public void constructType_nonNullClass_delegates() {
        DeserializationConfig cfg = baseConfig();
        TestCtx c = ctxWith(cfg, null);
        assertEquals(cfg.constructType(String.class), c.constructType(String.class));
    }

    @Test
    public void findClass_validName_returnsClass() throws ClassNotFoundException {
        TestCtx c = ctxWith(baseConfig(), null);
        assertEquals(String.class, c.findClass("java.lang.String"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void findClass_invalidName_throwsClassNotFound() throws ClassNotFoundException {
        TestCtx c = ctxWith(baseConfig(), null);
        c.findClass("com.example.DoesNotExist$$$123");
    }

    // =====================================================================
    // Object buffer / array builder reuse
    // =====================================================================

    @Test
    public void leaseObjectBuffer_initial_returnsNonNull() {
        TestCtx c = ctxWith(baseConfig(), null);
        assertNotNull(c.leaseObjectBuffer());
    }

    @Test
    public void returnThenLeaseObjectBuffer_reusesStoredInstance() {
        TestCtx c = ctxWith(baseConfig(), null);
        ObjectBuffer buf = c.leaseObjectBuffer();
        c.returnObjectBuffer(buf);
        // NOTE: equal-capacity branch ( >= condition true) is exercised here;
        // the "keep bigger buffer" alternate branch is not verified because
        // ObjectBuffer does not expose a public way to control capacity —
        // avoiding guessing internal behavior per instructions.
        assertSame(buf, c.leaseObjectBuffer());
    }

    @Test
    public void getArrayBuilders_lazyInit_returnsSameInstanceOnSecondCall() {
        TestCtx c = ctxWith(baseConfig(), null);
        ArrayBuilders first = c.getArrayBuilders();
        assertNotNull(first);
        assertSame(first, c.getArrayBuilders());
    }

    // =====================================================================
    // parseDate / constructCalendar
    // =====================================================================

    @Test
    public void parseDate_valid_returnsDate() {
        TestCtx c = ctxWith(baseConfig(), null);
        Date d = c.parseDate("2020-01-01T00:00:00.000+0000");
        assertNotNull(d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseDate_invalid_throwsIllegalArgumentException() {
        TestCtx c = ctxWith(baseConfig(), null);
        c.parseDate("not-a-date");
    }

    @Test
    public void constructCalendar_setsGivenTime() {
        TestCtx c = ctxWith(baseConfig(), null);
        Date d = new Date(123456789L);
        assertEquals(d, c.constructCalendar(d).getTime());
    }

    // =====================================================================
    // readValue / readPropertyValue
    // =====================================================================

    @Test
    public void readValue_found_delegatesToDeserialize() throws Exception {
        DeserializationConfig cfg = baseConfig();
        TestCtx c = ctxWith(cfg, null);
        JavaType type = c.constructType(String.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(mockCache.findValueDeserializer(c, mockFactory, type)).thenReturn(deser);
        when(mockFactory.findTypeDeserializer(cfg, type)).thenReturn(null);
        when(deser.deserialize(parser, c)).thenReturn("hello");
        assertEquals("hello", c.readValue(parser, type));
    }

    @Test
    public void readValue_notFound_throwsBadDefinition() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        JavaType type = c.constructType(String.class);
        when(mockCache.findValueDeserializer(c, mockFactory, type)).thenReturn(null);
        try {
            c.readValue(parser, type);
            fail("expected exception");
        } catch (JsonMappingException e) {
            assertTrue(e instanceof InvalidDefinitionException);
        }
    }

    @Test
    public void readPropertyValue_found_delegatesToDeserialize() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        JavaType type = c.constructType(String.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(mockCache.findValueDeserializer(c, mockFactory, type)).thenReturn(deser);
        when(deser.deserialize(parser, c)).thenReturn("world");
        assertEquals("world", c.readPropertyValue(parser, null, type));
    }

    @Test
    public void readPropertyValue_notFound_throwsBadDefinition() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        JavaType type = c.constructType(String.class);
        when(mockCache.findValueDeserializer(c, mockFactory, type)).thenReturn(null);
        try {
            c.readPropertyValue(parser, null, type);
            fail("expected exception");
        } catch (JsonMappingException e) {
            assertTrue(e instanceof InvalidDefinitionException);
        }
    }

    // =====================================================================
    // handleUnknownProperty
    // =====================================================================

    @Test
    public void handleUnknownProperty_handledByHandler_true() throws Exception {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public boolean handleUnknownProperty(DeserializationContext ctxt, JsonParser p,
                    JsonDeserializer<?> deser, Object instanceOrClass, String propName) {
                return true;
            }
        };
        TestCtx c = ctxWith(configWithHandlers(h), null);
        assertTrue(c.handleUnknownProperty(parser, null, "bean", "prop"));
    }

    @Test
    public void handleUnknownProperty_notHandled_featureDisabled_skipsAndReturnsTrue() throws Exception {
        DeserializationConfig cfg = configWithFeature(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        TestCtx c = ctxWith(cfg, null);
        assertTrue(c.handleUnknownProperty(parser, null, "bean", "prop"));
    }

    @Test(expected = UnrecognizedPropertyException.class)
    public void handleUnknownProperty_notHandled_featureEnabled_throws() throws Exception {
        DeserializationConfig cfg = configWithFeature(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        TestCtx c = ctxWith(cfg, null);
        c.handleUnknownProperty(parser, null, "bean", "prop");
    }

    @Test
    public void handleUnknownProperty_handlerChain_continuesOnFalse() throws Exception {
        DeserializationProblemHandler notHandling = new DeserializationProblemHandler() {
            @Override
            public boolean handleUnknownProperty(DeserializationContext ctxt, JsonParser p,
                    JsonDeserializer<?> deser, Object instanceOrClass, String propName) {
                return false;
            }
        };
        DeserializationProblemHandler handling = new DeserializationProblemHandler() {
            @Override
            public boolean handleUnknownProperty(DeserializationContext ctxt, JsonParser p,
                    JsonDeserializer<?> deser, Object instanceOrClass, String propName) {
                return true;
            }
        };
        TestCtx c = ctxWith(configWithHandlers(notHandling, handling), null);
        assertTrue(c.handleUnknownProperty(parser, null, "bean", "prop"));
    }

    // =====================================================================
    // handleWeirdKey
    // =====================================================================

    @Test(expected = InvalidFormatException.class)
    public void handleWeirdKey_noHandlers_throwsWeirdKeyException() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        c.handleWeirdKey(String.class, "abc", "bad key");
    }

    @Test
    public void handleWeirdKey_handlerReturnsCompatible_returnsValue() throws Exception {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleWeirdKey(DeserializationContext ctxt, Class<?> keyClass, String keyValue, String msg) {
                return "fixed";
            }
        };
        TestCtx c = ctxWith(configWithHandlers(h), null);
        assertEquals("fixed", c.handleWeirdKey(String.class, "abc", "bad key"));
    }

    @Test
    public void handleWeirdKey_handlerReturnsIncompatible_throwsWeirdStringException() throws Exception {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleWeirdKey(DeserializationContext ctxt, Class<?> keyClass, String keyValue, String msg) {
                return Integer.valueOf(1); // not instance of String.class
            }
        };
        TestCtx c = ctxWith(configWithHandlers(h), null);
        try {
            c.handleWeirdKey(String.class, "abc", "bad key");
            fail("expected exception");
        } catch (InvalidFormatException e) {
            // Quirk in source: uses weirdStringException(), not weirdKeyException()
            assertTrue(e.getMessage().contains("Cannot deserialize value of type"));
        }
    }

    // =====================================================================
    // handleWeirdStringValue
    // =====================================================================

    @Test(expected = InvalidFormatException.class)
    public void handleWeirdStringValue_noHandlers_throws() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        c.handleWeirdStringValue(Integer.class, "abc", "bad string");
    }

    @Test
    public void handleWeirdStringValue_handlerReturnsCompatible_returns() throws Exception {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleWeirdStringValue(DeserializationContext ctxt, Class<?> targetClass,
                    String value, String failureMsg) {
                return Integer.valueOf(42);
            }
        };
        TestCtx c = ctxWith(configWithHandlers(h), null);
        assertEquals(Integer.valueOf(42), c.handleWeirdStringValue(Integer.class, "abc", "bad string"));
    }

    // =====================================================================
    // handleWeirdNumberValue (also exercises _isCompatible primitive branch)
    // =====================================================================

    @Test(expected = InvalidFormatException.class)
    public void handleWeirdNumberValue_noHandlers_throws() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        c.handleWeirdNumberValue(int.class, Integer.valueOf(-1), "bad number");
    }

    @Test
    public void handleWeirdNumberValue_handlerReturnsPrimitiveWrapper_compatible() throws Exception {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleWeirdNumberValue(DeserializationContext ctxt, Class<?> targetClass,
                    Number value, String failureMsg) {
                return Integer.valueOf(7);
            }
        };
        TestCtx c = ctxWith(configWithHandlers(h), null);
        // target class is primitive int.class, handler returns wrapper Integer -> compatible branch
        assertEquals(Integer.valueOf(7), c.handleWeirdNumberValue(int.class, Integer.valueOf(-1), "bad number"));
    }

    // =====================================================================
    // handleWeirdNativeValue
    // =====================================================================

    @Test(expected = JsonMappingException.class)
    public void handleWeirdNativeValue_noHandlers_throws() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        JavaType targetType = c.constructType(String.class);
        c.handleWeirdNativeValue(targetType, Integer.valueOf(1), parser);
    }

    @Test
    public void handleWeirdNativeValue_handlerReturnsNull_returnsNull() throws Exception {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleWeirdNativeValue(DeserializationContext ctxt, JavaType targetType,
                    Object valueToConvert, JsonParser p) {
                return null;
            }
        };
        TestCtx c = ctxWith(configWithHandlers(h), null);
        JavaType targetType = c.constructType(String.class);
        assertNull(c.handleWeirdNativeValue(targetType, Integer.valueOf(1), parser));
    }

    // =====================================================================
    // handleMissingInstantiator
    // =====================================================================

    @Test
    public void handleMissingInstantiator_handled_returns() throws Exception {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleMissingInstantiator(DeserializationContext ctxt, Class<?> instClass,
                    ValueInstantiator valueInst, JsonParser p, String msg) {
                return "created";
            }
        };
        TestCtx c = ctxWith(configWithHandlers(h), null);
        assertEquals("created", c.handleMissingInstantiator(String.class, null, parser, "no creator"));
    }

    @Test
    public void handleMissingInstantiator_handlerReturnsIncompatible_throwsBadDefinition() throws Exception {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleMissingInstantiator(DeserializationContext ctxt, Class<?> instClass,
                    ValueInstantiator valueInst, JsonParser p, String msg) {
                return Integer.valueOf(1); // incompatible with String.class
            }
        };
        TestCtx c = ctxWith(configWithHandlers(h), null);
        try {
            c.handleMissingInstantiator(String.class, null, parser, "no creator");
            fail("expected exception");
        } catch (JsonMappingException e) {
            assertTrue(e instanceof InvalidDefinitionException);
        }
    }

    @Test
    public void handleMissingInstantiator_notHandled_cannotInstantiate_throwsBadDefinition() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        ValueInstantiator vi = mock(ValueInstantiator.class);
        when(vi.canInstantiate()).thenReturn(false);
        try {
            c.handleMissingInstantiator(String.class, vi, parser, "no creator");
            fail("expected exception");
        } catch (JsonMappingException e) {
            assertTrue(e instanceof InvalidDefinitionException);
        }
    }

    @Test
    public void handleMissingInstantiator_notHandled_canInstantiate_throwsInputMismatch() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        ValueInstantiator vi = mock(ValueInstantiator.class);
        when(vi.canInstantiate()).thenReturn(true);
        try {
            c.handleMissingInstantiator(String.class, vi, parser, "no creator");
            fail("expected exception");
        } catch (JsonMappingException e) {
            assertTrue(e instanceof MismatchedInputException);
        }
    }

    @Test
    public void handleMissingInstantiator_nullValueInstantiator_usesInputMismatchBranch() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        try {
            c.handleMissingInstantiator(String.class, null, parser, "no creator");
            fail("expected exception");
        } catch (JsonMappingException e) {
            assertTrue(e instanceof MismatchedInputException);
        }
    }

    @Test
    public void handleMissingInstantiator_nullParser_usesContextParser_noNpe() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        try {
            c.handleMissingInstantiator(String.class, null, null, "no creator");
            fail("expected exception");
        } catch (JsonMappingException e) {
            // Simply verifying no NPE and the mismatch branch is reached with getParser() fallback.
            assertTrue(e instanceof MismatchedInputException);
        }
    }

    // =====================================================================
    // handleInstantiationProblem
    // =====================================================================

    @Test
    public void handleInstantiationProblem_handled_returns() throws Exception {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleInstantiationProblem(DeserializationContext ctxt, Class<?> instClass,
                    Object argument, Throwable t) {
                return "instance";
            }
        };
        TestCtx c = ctxWith(configWithHandlers(h), null);
        assertEquals("instance", c.handleInstantiationProblem(String.class, "arg", new RuntimeException()));
    }

    @Test
    public void handleInstantiationProblem_notHandled_ioExceptionCause_rethrowsOriginal() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        IOException original = new IOException("boom");
        try {
            c.handleInstantiationProblem(String.class, "arg", original);
            fail("expected exception");
        } catch (IOException e) {
            assertSame(original, e);
        }
    }

    @Test
    public void handleInstantiationProblem_notHandled_otherCause_wrapsAsInvalidDefinition() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        try {
            c.handleInstantiationProblem(String.class, "arg", new RuntimeException("oops"));
            fail("expected exception");
        } catch (JsonMappingException e) {
            assertTrue(e instanceof InvalidDefinitionException);
        }
    }

    // =====================================================================
    // handleUnexpectedToken
    // =====================================================================

    @Test
    public void handleUnexpectedToken_oneArg_delegates() throws Exception {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleUnexpectedToken(DeserializationContext ctxt, Class<?> targetType,
                    JsonToken t, JsonParser p, String failureMsg) {
                return "fromHandler";
            }
        };
        TestCtx c = ctxWith(configWithHandlers(h), null);
        assertEquals("fromHandler", c.handleUnexpectedToken(String.class, parser));
    }

    @Test
    public void handleUnexpectedToken_notHandled_tokenNull_usesEOFMessage() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        try {
            c.handleUnexpectedToken(String.class, (JsonToken) null, parser, null);
            fail("expected exception");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("end-of-input"));
        }
    }

    @Test
    public void handleUnexpectedToken_notHandled_tokenPresent_usesDefaultMessage() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        try {
            c.handleUnexpectedToken(String.class, JsonToken.START_ARRAY, parser, null);
            fail("expected exception");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Cannot deserialize instance of"));
        }
    }

    // =====================================================================
    // handleUnknownTypeId
    // =====================================================================

    @Test
    public void handleUnknownTypeId_handlerReturnsVoid_returnsNull() throws Exception {
        TestCtx cBlue = ctxWith(baseConfig(), null);
        final JavaType voidType = cBlue.constructType(Void.class);
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public JavaType handleUnknownTypeId(DeserializationContext ctxt, JavaType baseType,
                    String id, TypeIdResolver idResolver, String extraDesc) {
                return voidType;
            }
        };
        TestCtx c = ctxWith(configWithHandlers(h), null);
        JavaType baseType = c.constructType(Number.class);
        assertNull(c.handleUnknownTypeId(baseType, "x", mock(TypeIdResolver.class), "extra"));
    }

    @Test
    public void handleUnknownTypeId_handlerReturnsIncompatible_throws() throws Exception {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public JavaType handleUnknownTypeId(DeserializationContext ctxt, JavaType baseType,
                    String id, TypeIdResolver idResolver, String extraDesc) {
                return ctxt.constructType(String.class); // not subtype of Number
            }
        };
        TestCtx c = ctxWith(configWithHandlers(h), null);
        JavaType baseType = c.constructType(Number.class);
        try {
            c.handleUnknownTypeId(baseType, "x", mock(TypeIdResolver.class), "extra");
            fail("expected exception");
        } catch (JsonMappingException e) {
            assertTrue(e instanceof InvalidTypeIdException);
        }
    }

    @Test
    public void handleUnknownTypeId_noHandler_featureDisabled_returnsNull() throws Exception {
        DeserializationConfig cfg = configWithFeature(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
        TestCtx c = ctxWith(cfg, null);
        JavaType baseType = c.constructType(Number.class);
        assertNull(c.handleUnknownTypeId(baseType, "x", mock(TypeIdResolver.class), "extra"));
    }

    @Test
    public void handleUnknownTypeId_noHandler_featureEnabled_throws() throws Exception {
        DeserializationConfig cfg = configWithFeature(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, true);
        TestCtx c = ctxWith(cfg, null);
        JavaType baseType = c.constructType(Number.class);
        try {
            c.handleUnknownTypeId(baseType, "x", mock(TypeIdResolver.class), "extra");
            fail("expected exception");
        } catch (JsonMappingException e) {
            assertTrue(e instanceof InvalidTypeIdException);
        }
    }

    // =====================================================================
    // handleMissingTypeId
    // =====================================================================

    @Test
    public void handleMissingTypeId_handlerReturnsCompatible_returns() throws Exception {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public JavaType handleMissingTypeId(DeserializationContext ctxt, JavaType baseType,
                    TypeIdResolver idResolver, String extraDesc) {
                return ctxt.constructType(Integer.class);
            }
        };
        TestCtx c = ctxWith(configWithHandlers(h), null);
        JavaType baseType = c.constructType(Number.class);
        JavaType result = c.handleMissingTypeId(baseType, mock(TypeIdResolver.class), "extra");
        assertEquals(c.constructType(Integer.class), result);
    }

    @Test
    public void handleMissingTypeId_noHandler_throws() throws Exception {
        TestCtx c = ctxWith(baseConfig(), null);
        JavaType baseType = c.constructType(Number.class);
        try {
            c.handleMissingTypeId(baseType, mock(TypeIdResolver.class), "extra");
            fail("expected exception");
        } catch (JsonMappingException e) {
            assertTrue(e instanceof InvalidTypeIdException);
        }
    }

    // =====================================================================
    // reportXxx family
    // =====================================================================

    @Test
    public void reportWrongTokenException_deser_throws() {
        TestCtx c = ctxWith(baseConfig(), null);
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        when(deser.handledType()).thenReturn((Class) String.class);
        try {
            c.reportWrongTokenException(deser, JsonToken.VALUE_STRING, "extra %s", "info");
            fail("expected exception");
        } catch (JsonMappingException e) {
            assertTrue(e instanceof MismatchedInputException);
            assertTrue(e.getMessage().contains("extra info"));
        }
    }

    @Test
    public void reportWrongTokenException_javaTypeAndClassOverloads_throw() {
        TestCtx c = ctxWith(baseConfig(), null);
        JavaType t = c.constructType(String.class);
        try {
            c.reportWrongTokenException(t, JsonToken.VALUE_STRING, "m1");
            fail();
        } catch (JsonMappingException e) {
            assertTrue(e instanceof MismatchedInputException);
        }
        try {
            c.reportWrongTokenException(String.class, JsonToken.VALUE_STRING, "m2");
            fail();
        } catch (JsonMappingException e) {
            assertTrue(e instanceof MismatchedInputException);
        }
    }

    @Test
    public void reportInputMismatch_allOverloads_throwMismatchedInputException() {
        TestCtx c = ctxWith(baseConfig(), null);
        BeanProperty prop = mock(BeanProperty.class);
        when(prop.getType()).thenReturn(c.constructType(String.class));

        try { c.reportInputMismatch(prop, "m"); fail(); }
        catch (JsonMappingException e) { assertTrue(e instanceof MismatchedInputException); }

        try { c.reportInputMismatch((BeanProperty) null, "m"); fail(); }
        catch (JsonMappingException e) { assertTrue(e instanceof MismatchedInputException); }

        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        when(deser.handledType()).thenReturn((Class) String.class);
        try { c.reportInputMismatch(deser, "m"); fail(); }
        catch (JsonMappingException e) { assertTrue(e instanceof MismatchedInputException); }

        try { c.reportInputMismatch(String.class, "m"); fail(); }
        catch (JsonMappingException e) { assertTrue(e instanceof MismatchedInputException); }

        try { c.reportInputMismatch(c.constructType(String.class), "m"); fail(); }
        catch (JsonMappingException e) { assertTrue(e instanceof MismatchedInputException); }
    }

    @Test
    public void reportTrailingTokens_throwsMismatchedInputException() {
        TestCtx c = ctxWith(baseConfig(), null);
        try {
            c.reportTrailingTokens(String.class, parser, JsonToken.END_ARRAY);
            fail("expected exception");
        } catch (JsonMappingException e) {
            assertTrue(e instanceof MismatchedInputException);
            assertTrue(e.getMessage().contains("Trailing token"));
        }
    }

    @Test
    public void reportBadDefinition_throwsWithExactMessage() {
        TestCtx c = ctxWith(baseConfig(), null);
        try {
            c.reportBadDefinition(c.constructType(String.class), "bad def");
            fail("expected exception");
        } catch (JsonMappingException e) {
            assertEquals("bad def", e.getMessage());
        }
    }

    @Test
    public void reportBadMerge_featureEnabled_returnsNull() throws Exception {
        DeserializationConfig cfg = configWithFeature(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE, true);
        TestCtx c = ctxWith(cfg, null);
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        when(deser.handledType()).thenReturn((Class) String.class);
        assertNull(c.reportBadMerge(deser));
    }

    @Test
    public void reportBadMerge_featureDisabled_throws() throws Exception {
        DeserializationConfig cfg = configWithFeature(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE, false);
        TestCtx c = ctxWith(cfg, null);
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        when(deser.handledType()).thenReturn((Class) String.class);
        try {
            c.reportBadMerge(deser);
            fail("expected exception");
        } catch (JsonMappingException e) {
            assertTrue(e instanceof InvalidDefinitionException);
        }
    }

    // =====================================================================
    // Exception factory helper methods
    // =====================================================================

    @Test
    public void instantiationException_causeVariants_produceExpectedMessages() {
        TestCtx c = ctxWith(baseConfig(), null);

        JsonMappingException e1 = c.instantiationException(String.class, (Throwable) null);
        assertTrue(e1.getMessage().contains("N/A"));

        JsonMappingException e2 = c.instantiationException(String.class, new RuntimeException("oops"));
        assertTrue(e2.getMessage().contains("oops"));

        JsonMappingException e3 = c.instantiationException(String.class, new RuntimeException());
        assertTrue(e3.getMessage().contains("RuntimeException"));

        JsonMappingException e4 = c.instantiationException(String.class, "custom msg");
        assertTrue(e4.getMessage().contains("custom msg"));
    }

    @Test
    public void invalidTypeIdExceptionAndMissingTypeIdException_buildExpectedTypes() {
        TestCtx c = ctxWith(baseConfig(), null);
        JavaType baseType = c.constructType(Number.class);

        JsonMappingException e1 = c.invalidTypeIdException(baseType, "bad-id", "extra");
        assertTrue(e1 instanceof InvalidTypeIdException);

        JsonMappingException e2 = c.missingTypeIdException(baseType, "extra");
        assertTrue(e2 instanceof InvalidTypeIdException);
    }

    // =====================================================================
    // Deprecated pass-through methods (kept minimal: no real branching logic)
    // =====================================================================

    @Test
    public void reportUnknownProperty_deprecated_respectsFeatureFlag() throws Exception {
        TestCtx enabled = ctxWith(configWithFeature(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true), null);
        try {
            enabled.reportUnknownProperty("bean", "prop", null);
            fail("expected exception");
        } catch (JsonMappingException e) {
            assertTrue(e instanceof UnrecognizedPropertyException);
        }

        TestCtx disabled = ctxWith(configWithFeature(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false), null);
        disabled.reportUnknownProperty("bean", "prop", null); // should NOT throw
    }

    @Test
    public void deprecatedMappingExceptionFactories_produceJsonMappingException() {
        TestCtx c = ctxWith(baseConfig(), null);
        assertNotNull(c.mappingException("msg"));
        assertNotNull(c.mappingException("msg %s", "x"));
        assertNotNull(c.mappingException(String.class));
        assertNotNull(c.mappingException(String.class, JsonToken.VALUE_STRING));
    }
}
