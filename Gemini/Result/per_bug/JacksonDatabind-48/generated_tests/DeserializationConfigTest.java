package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

import static org.junit.Assert.*;

public class DeserializationConfigTest {

    private DeserializationConfig config;

    @Before
    public void setUp() {
        BaseSettings base = ObjectMapper.STD_BASE_SETTINGS;
        SubtypeResolver subtypeResolver = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        SimpleMixInResolver mixins = new SimpleMixInResolver(null);
        RootNameLookup rootNames = new RootNameLookup();
        config = new DeserializationConfig(base, subtypeResolver, mixins, rootNames);
    }

    @Test
    public void testMapperFeatureFluentMethods() {
        // Test enabling/disabling MapperFeature
        DeserializationConfig c1 = config.with(MapperFeature.USE_ANNOTATIONS);
        assertSame(config, c1); // Already enabled by default

        DeserializationConfig c2 = config.without(MapperFeature.USE_ANNOTATIONS);
        assertNotSame(config, c2);
        assertFalse(c2.isEnabled(MapperFeature.USE_ANNOTATIONS));

        DeserializationConfig c3 = c2.with(MapperFeature.USE_ANNOTATIONS, true);
        assertTrue(c3.isEnabled(MapperFeature.USE_ANNOTATIONS));

        DeserializationConfig c4 = config.with(MapperFeature.USE_ANNOTATIONS, false);
        assertFalse(c4.isEnabled(MapperFeature.USE_ANNOTATIONS));
    }

    @Test
    public void testDeserializationFeatureFluentMethods() {
        DeserializationFeature feat = DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
        
        // with feature already enabled
        DeserializationConfig c1 = config.with(feat);
        assertSame(config, c1);

        // without feature
        DeserializationConfig c2 = config.without(feat);
        assertNotSame(config, c2);
        assertFalse(c2.isEnabled(feat));

        // with multiple features
        DeserializationConfig c3 = c2.with(feat, DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES);
        assertTrue(c3.isEnabled(feat));
        assertTrue(c3.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES));

        // withFeatures / withoutFeatures varargs
        DeserializationConfig c4 = config.withFeatures(feat, DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        assertTrue(c4.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));

        DeserializationConfig c5 = c4.withoutFeatures(feat, DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        assertFalse(c5.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
    }

    @Test
    public void testJsonParserFeatureFluentMethods() {
        JsonParser.Feature feat = JsonParser.Feature.ALLOW_COMMENTS;

        DeserializationConfig c1 = config.with(feat);
        assertNotSame(config, c1);
        assertTrue(c1.isEnabled(feat, new JsonFactory()));

        DeserializationConfig c2 = c1.without(feat);
        assertNotSame(c1, c2);
        assertFalse(c2.isEnabled(feat, new JsonFactory()));

        DeserializationConfig c3 = config.withFeatures(feat);
        assertTrue(c3.isEnabled(feat, new JsonFactory()));

        DeserializationConfig c4 = c3.withoutFeatures(feat);
        assertFalse(c4.isEnabled(feat, new JsonFactory()));
    }

    @Test
    public void testRootWrappingBranches() {
        // Branch: _rootName == null, feature disabled
        assertFalse(config.useRootWrapping());

        // Branch: _rootName == null, feature enabled
        DeserializationConfig c1 = config.with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertTrue(c1.useRootWrapping());

        // Branch: _rootName != null and empty string (disables wrapping)
        DeserializationConfig c2 = config.withRootName(PropertyName.USE_DEFAULT); // empty/default
        // Let's explicitly test with empty PropertyName
        DeserializationConfig c3 = config.withRootName(PropertyName.construct(""));
        assertFalse(c3.useRootWrapping());

        // Branch: _rootName != null and non-empty string (enables wrapping)
        DeserializationConfig c4 = config.withRootName(PropertyName.construct("CustomRoot"));
        assertTrue(c4.useRootWrapping());

        // Branch: rootName == null when already null
        assertSame(config, config.withRootName(null));
        
        // Branch: rootName equals current rootName
        DeserializationConfig c5 = config.withRootName(PropertyName.construct("CustomRoot"));
        assertSame(c5, c5.withRootName(PropertyName.construct("CustomRoot")));
    }

    @Test
    public void testProblemHandlers() {
        assertNull(config.getProblemHandlers());
        assertSame(config, config.withNoProblemHandlers()); // already null

        DeserializationProblemHandler handler = new DeserializationProblemHandler() {};
        DeserializationConfig c1 = config.withHandler(handler);
        assertNotNull(c1.getProblemHandlers());

        // Duplicate handler insertion (Sanity check)
        DeserializationConfig c2 = c1.withHandler(handler);
        assertSame(c1, c2);

        // Remove problem handlers
        DeserializationConfig c3 = c1.withNoProblemHandlers();
        assertNull(c3.getProblemHandlers());
    }

    @Test
    public void testBaseSettingsMutators() {
        assertNotNull(config.getBaseSettings());
        
        assertSame(config, config.with(config.getBaseSettings().getClassIntrospector()));
        assertSame(config, config.with(config.getBaseSettings().getAnnotationIntrospector()));
        assertSame(config, config.with(config.getBaseSettings().getVisibilityChecker()));
        assertSame(config, config.with(config.getBaseSettings().getTypeResolverBuilder()));
        assertSame(config, config.with(config.getBaseSettings().getPropertyNamingStrategy()));
        assertSame(config, config.with(config.getBaseSettings().getTypeFactory()));
        assertSame(config, config.with(config.getBaseSettings().getDateFormat()));
        assertSame(config, config.with((HandlerInstantiator) null));
        assertSame(config, config.with(Locale.getDefault()));
        assertSame(config, config.with(TimeZone.getDefault()));
        assertSame(config, config.with(Base64Variant.getDefaultBase64()));
        assertSame(config, config.with(config.getAttributes()));
    }

    @Test
    public void testInitializeParser() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{}");
        
        // Modify parser feature to trigger changes branch
        DeserializationConfig c1 = config.with(JsonParser.Feature.ALLOW_COMMENTS);
        c1.initialize(p);
        
        p.close();
    }
}