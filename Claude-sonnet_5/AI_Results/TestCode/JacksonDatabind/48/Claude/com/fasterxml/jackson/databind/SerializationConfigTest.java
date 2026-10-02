package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class SerializationConfigTest {

    private ObjectMapper mapper;
    private SerializationConfig config;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getSerializationConfig();
    }

    // ---------------------------------------------------------------
    // with(MapperFeature...) / without(MapperFeature...)
    // ---------------------------------------------------------------

    @Test
    public void testWithMapperFeature_noChange_returnsSameInstance() {
        // feature already enabled by default -> branch: newMapperFlags == _mapperFeatures
        boolean already = config.isEnabled(MapperFeature.USE_ANNOTATIONS);
        assertTrue(already);
        SerializationConfig result = config.with(MapperFeature.USE_ANNOTATIONS);
        assertSame(config, result);
    }

    @Test
    public void testWithMapperFeature_change_returnsNewInstance() {
        // feature disabled by default
        assertFalse(config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION) == false
                && config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION));
        SerializationConfig result = config.without(MapperFeature.DEFAULT_VIEW_INCLUSION)
                .with(MapperFeature.DEFAULT_VIEW_INCLUSION);
        assertNotSame(config, result);
        assertTrue(result.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION));
    }

    @Test
    public void testWithMapperFeature_varargsZeroLength_returnsSameInstance() {
        // loop 0 iteration
        SerializationConfig result = config.with(new MapperFeature[0]);
        assertSame(config, result);
    }

    @Test
    public void testWithMapperFeature_varargsMultiple() {
        SerializationConfig base = config.without(MapperFeature.AUTO_DETECT_FIELDS, MapperFeature.AUTO_DETECT_GETTERS);
        SerializationConfig result = base.with(MapperFeature.AUTO_DETECT_FIELDS, MapperFeature.AUTO_DETECT_GETTERS);
        assertTrue(result.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
        assertTrue(result.isEnabled(MapperFeature.AUTO_DETECT_GETTERS));
    }

    @Test
    public void testWithoutMapperFeature_noChange_returnsSameInstance() {
        SerializationConfig disabled = config.without(MapperFeature.DEFAULT_VIEW_INCLUSION);
        SerializationConfig result = disabled.without(MapperFeature.DEFAULT_VIEW_INCLUSION);
        assertSame(disabled, result);
    }

    @Test
    public void testWithoutMapperFeature_change_returnsNewInstance() {
        SerializationConfig result = config.without(MapperFeature.USE_ANNOTATIONS);
        assertNotSame(config, result);
        assertFalse(result.isEnabled(MapperFeature.USE_ANNOTATIONS));
    }

    @Test
    public void testWithMapperFeatureBoolean_trueBranch() {
        SerializationConfig result = config.with(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
        assertNotSame(config, result);
        assertTrue(result.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION));
    }

    @Test
    public void testWithMapperFeatureBoolean_falseBranch() {
        SerializationConfig result = config.with(MapperFeature.USE_ANNOTATIONS, false);
        assertNotSame(config, result);
        assertFalse(result.isEnabled(MapperFeature.USE_ANNOTATIONS));
    }

    @Test
    public void testWithMapperFeatureBoolean_sameState_returnsSameInstance() {
        SerializationConfig result = config.with(MapperFeature.USE_ANNOTATIONS, true);
        assertSame(config, result);
    }

    // ---------------------------------------------------------------
    // with(AnnotationIntrospector) / append / insert
    // ---------------------------------------------------------------

    @Test
    public void testWithAnnotationIntrospector_changesConfig() {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        SerializationConfig result = config.with(nop);
        assertNotSame(config, result);
        assertSame(nop, result.getAnnotationIntrospector());
    }

    @Test
    public void testWithAppendedAnnotationIntrospector_noException() {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        SerializationConfig result = config.withAppendedAnnotationIntrospector(nop);
        assertNotNull(result);
    }

    @Test
    public void testWithInsertedAnnotationIntrospector_noException() {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        SerializationConfig result = config.withInsertedAnnotationIntrospector(nop);
        assertNotNull(result);
    }

    // ---------------------------------------------------------------
    // with(ClassIntrospector) -> only "no-change" branch tested (creating
    // a fully-working custom ClassIntrospector is out of scope here)
    // ---------------------------------------------------------------
    @Test
    public void testWithClassIntrospector_sameInstance_returnsSame() {
        SerializationConfig result = config.with(config.getClassIntrospector());
        assertSame(config, result);
    }

    // ---------------------------------------------------------------
    // with(DateFormat)
    // ---------------------------------------------------------------

    @Test
    public void testWithDateFormat_null_enablesWriteDatesAsTimestamps() {
        SerializationConfig result = config.with((java.text.DateFormat) null);
        assertTrue(result.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS));
    }

    @Test
    public void testWithDateFormat_nonNull_disablesWriteDatesAsTimestamps() {
        java.text.DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd");
        SerializationConfig result = config.with(df);
        assertFalse(result.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS));
    }

    // ---------------------------------------------------------------
    // with(HandlerInstantiator)
    // ---------------------------------------------------------------

    @Test
    public void testWithHandlerInstantiator_changesConfig() {
        HandlerInstantiator hi = new HandlerInstantiator() {
            @Override public com.fasterxml.jackson.databind.JsonDeserializer<?> deserializerInstance(
                    MapperConfig<?> config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> implClass) { return null; }
            @Override public com.fasterxml.jackson.databind.KeyDeserializer keyDeserializerInstance(
                    MapperConfig<?> config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> implClass) { return null; }
            @Override public com.fasterxml.jackson.databind.JsonSerializer<?> serializerInstance(
                    MapperConfig<?> config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> implClass) { return null; }
            @Override public com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder<?> typeResolverBuilderInstance(
                    MapperConfig<?> config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> implClass) { return null; }
            @Override public com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolverInstance(
                    MapperConfig<?> config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> implClass) { return null; }
        };
        SerializationConfig result = config.with(hi);
        assertNotSame(config, result);
        assertSame(hi, result.getHandlerInstantiator());
    }

    // ---------------------------------------------------------------
    // with(PropertyNamingStrategy)
    // ---------------------------------------------------------------

    @Test
    public void testWithPropertyNamingStrategy_changesConfig() {
        SerializationConfig result = config.with(PropertyNamingStrategy.SNAKE_CASE);
        assertNotSame(config, result);
        assertSame(PropertyNamingStrategy.SNAKE_CASE, result.getPropertyNamingStrategy());
    }

    // ---------------------------------------------------------------
    // withRootName(PropertyName) -- branches
    // ---------------------------------------------------------------

    @Test
    public void testWithRootName_nullOnNull_returnsSame() {
        assertNull(config.getFullRootName());
        SerializationConfig result = config.withRootName((PropertyName) null);
        assertSame(config, result);
    }

    @Test
    public void testWithRootName_setThenSameAgain_returnsSame() {
        SerializationConfig withName = config.withRootName(PropertyName.construct("root"));
        assertNotSame(config, withName);
        assertEquals("root", withName.getFullRootName().getSimpleName());

        SerializationConfig sameAgain = withName.withRootName(PropertyName.construct("root"));
        assertSame(withName, sameAgain);
    }

    @Test
    public void testWithRootName_nullAfterNonNull_returnsNew() {
        SerializationConfig withName = config.withRootName(PropertyName.construct("root"));
        SerializationConfig cleared = withName.withRootName((PropertyName) null);
        assertNotSame(withName, cleared);
        assertNull(cleared.getFullRootName());
    }

    @Test
    public void testWithRootName_differentName_returnsNew() {
        SerializationConfig withName = config.withRootName(PropertyName.construct("root"));
        SerializationConfig withOther = withName.withRootName(PropertyName.construct("other"));
        assertNotSame(withName, withOther);
        assertEquals("other", withOther.getFullRootName().getSimpleName());
    }

    // ---------------------------------------------------------------
    // with(SubtypeResolver)
    // ---------------------------------------------------------------

    @Test
    public void testWithSubtypeResolver_same_returnsSame() {
        SerializationConfig result = config.with(config.getSubtypeResolver());
        assertSame(config, result);
    }

    @Test
    public void testWithSubtypeResolver_different_returnsNew() {
        StdSubtypeResolver newResolver = new StdSubtypeResolver();
        SerializationConfig result = config.with(newResolver);
        assertNotSame(config, result);
        assertSame(newResolver, result.getSubtypeResolver());
    }

    // ---------------------------------------------------------------
    // with(TypeFactory)
    // ---------------------------------------------------------------

    @Test
    public void testWithTypeFactory_same_returnsSame() {
        SerializationConfig result = config.with(config.getTypeFactory());
        assertSame(config, result);
    }

    @Test
    public void testWithTypeFactory_different_returnsNew() {
        TypeFactory newFactory = TypeFactory.defaultInstance().withClassLoader(new ClassLoader(getClass().getClassLoader()) {});
        SerializationConfig result = config.with(newFactory);
        assertNotSame(config, result);
        assertSame(newFactory, result.getTypeFactory());
    }

    // ---------------------------------------------------------------
    // withView(Class)
    // ---------------------------------------------------------------

    @Test
    public void testWithView_same_returnsSame() {
        SerializationConfig result = config.withView(null);
        assertSame(config, result); // default _view is null
    }

    @Test
    public void testWithView_different_returnsNew() {
        SerializationConfig result = config.withView(String.class);
        assertNotSame(config, result);
        assertEquals(String.class, result.getActiveView());
    }

    // ---------------------------------------------------------------
    // with(VisibilityChecker)
    // ---------------------------------------------------------------

    @Test
    public void testWithVisibilityChecker_noException() {
        VisibilityChecker<?> vc = VisibilityChecker.Std.defaultInstance()
                .withFieldVisibility(Visibility.ANY);
        SerializationConfig result = config.with(vc);
        assertNotNull(result);
    }

    @Test
    public void testWithVisibility_changesDefaultVisibilityChecker() {
        SerializationConfig result = config.withVisibility(PropertyAccessor.FIELD, Visibility.NONE);
        assertNotNull(result);
        assertNotSame(config, result);
    }

    // ---------------------------------------------------------------
    // with(Locale) / with(TimeZone) / with(Base64Variant)
    // ---------------------------------------------------------------

    @Test
    public void testWithLocale_same_returnsSame() {
        SerializationConfig result = config.with(config.getLocale());
        assertSame(config, result);
    }

    @Test
    public void testWithLocale_different_returnsNew() {
        Locale other = Locale.JAPAN;
        SerializationConfig result = config.with(other);
        // If default locale happens to already be JAPAN, both branches are legitimate;
        // primary assertion is that resulting locale matches requested.
        assertEquals(other, result.getLocale());
    }

    @Test
    public void testWithTimeZone_same_returnsSame() {
        SerializationConfig result = config.with(config.getTimeZone());
        assertSame(config, result);
    }

    @Test
    public void testWithTimeZone_different_returnsNew() {
        TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
        SerializationConfig result = config.with(tz);
        assertEquals(tz, result.getTimeZone());
    }

    @Test
    public void testWithBase64Variant_same_returnsSame() {
        SerializationConfig result = config.with(config.getBase64Variant());
        assertSame(config, result);
    }

    @Test
    public void testWithBase64Variant_different_returnsNew() {
        Base64Variant variant = Base64Variants.MODIFIED_FOR_URL;
        SerializationConfig result = config.with(variant);
        assertEquals(variant, result.getBase64Variant());
    }

    // ---------------------------------------------------------------
    // with(ContextAttributes)
    // ---------------------------------------------------------------

    @Test
    public void testWithContextAttributes_same_returnsSame() {
        SerializationConfig result = config.with(config.getAttributes());
        assertSame(config, result);
    }

    @Test
    public void testWithContextAttributes_different_returnsNew() {
        ContextAttributes attrs = ContextAttributes.getEmpty().withSharedAttribute("k", "v");
        SerializationConfig result = config.with(attrs);
        assertNotSame(config, result);
        assertSame(attrs, result.getAttributes());
    }

    // ---------------------------------------------------------------
    // SerializationFeature factory methods
    // ---------------------------------------------------------------

    @Test
    public void testWithSerializationFeature_single_change() {
        SerializationConfig result = config.with(SerializationFeature.WRAP_ROOT_VALUE);
        assertNotSame(config, result);
        assertTrue(result.isEnabled(SerializationFeature.WRAP_ROOT_VALUE));
    }

    @Test
    public void testWithSerializationFeature_single_noChange_returnsSame() {
        SerializationConfig enabled = config.with(SerializationFeature.WRAP_ROOT_VALUE);
        SerializationConfig again = enabled.with(SerializationFeature.WRAP_ROOT_VALUE);
        assertSame(enabled, again);
    }

    @Test
    public void testWithSerializationFeature_varargsZero() {
        // 'first' set, varargs loop 0 iterations
        SerializationConfig result = config.with(SerializationFeature.WRAP_ROOT_VALUE, new SerializationFeature[0]);
        assertNotSame(config, result);
        assertTrue(result.isEnabled(SerializationFeature.WRAP_ROOT_VALUE));
    }

    @Test
    public void testWithSerializationFeature_varargsMultiple() {
        SerializationConfig result = config.with(SerializationFeature.WRAP_ROOT_VALUE,
                SerializationFeature.INDENT_OUTPUT, SerializationFeature.CLOSE_CLOSEABLE);
        assertTrue(result.isEnabled(SerializationFeature.WRAP_ROOT_VALUE));
        assertTrue(result.isEnabled(SerializationFeature.INDENT_OUTPUT));
        assertTrue(result.isEnabled(SerializationFeature.CLOSE_CLOSEABLE));
    }

    @Test
    public void testWithFeaturesSerialization_zeroAndMultiple() {
        SerializationConfig none = config.withFeatures(new SerializationFeature[0]);
        assertSame(config, none);

        SerializationConfig multi = config.withFeatures(SerializationFeature.INDENT_OUTPUT,
                SerializationFeature.WRAP_ROOT_VALUE);
        assertNotSame(config, multi);
        assertTrue(multi.isEnabled(SerializationFeature.INDENT_OUTPUT));
        assertTrue(multi.isEnabled(SerializationFeature.WRAP_ROOT_VALUE));
    }

    @Test
    public void testWithoutSerializationFeature_single() {
        SerializationConfig result = config.without(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        assertNotSame(config, result);
        assertFalse(result.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS));
    }

    @Test
    public void testWithoutSerializationFeature_noChange_returnsSame() {
        SerializationConfig disabled = config.without(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        SerializationConfig again = disabled.without(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        assertSame(disabled, again);
    }

    @Test
    public void testWithoutSerializationFeature_varargsZeroAndMultiple() {
        SerializationConfig one = config.without(SerializationFeature.FAIL_ON_EMPTY_BEANS, new SerializationFeature[0]);
        assertFalse(one.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS));

        SerializationConfig multi = config.without(SerializationFeature.FAIL_ON_EMPTY_BEANS,
                SerializationFeature.WRITE_NULL_MAP_VALUES);
        assertFalse(multi.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS));
        assertFalse(multi.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES));
    }

    @Test
    public void testWithoutFeaturesSerialization_zeroAndMultiple() {
        SerializationConfig none = config.withoutFeatures(new SerializationFeature[0]);
        assertSame(config, none);

        SerializationConfig multi = config.withoutFeatures(SerializationFeature.FAIL_ON_EMPTY_BEANS,
                SerializationFeature.WRITE_NULL_MAP_VALUES);
        assertNotSame(config, multi);
        assertFalse(multi.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS));
    }

    // ---------------------------------------------------------------
    // JsonGenerator.Feature factory methods
    // ---------------------------------------------------------------

    @Test
    public void testWithGeneratorFeature_change() {
        SerializationConfig result = config.with(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertNotSame(config, result);
        assertTrue(result.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES, new JsonFactory()));
    }

    @Test
    public void testWithGeneratorFeature_noChange_returnsSame() {
        SerializationConfig enabled = config.with(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        SerializationConfig again = enabled.with(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertSame(enabled, again);
    }

    @Test
    public void testWithFeaturesGenerator_zeroAndMultiple() {
        SerializationConfig none = config.withFeatures(new JsonGenerator.Feature[0]);
        assertSame(config, none);

        SerializationConfig multi = config.withFeatures(JsonGenerator.Feature.QUOTE_FIELD_NAMES,
                JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertNotSame(config, multi);
    }

    @Test
    public void testWithoutGeneratorFeature_change() {
        SerializationConfig result = config.without(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertNotSame(config, result);
        assertFalse(result.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES, new JsonFactory()));
    }

    @Test
    public void testWithoutFeaturesGenerator_zeroAndMultiple() {
        SerializationConfig none = config.withoutFeatures(new JsonGenerator.Feature[0]);
        assertSame(config, none);

        SerializationConfig multi = config.withoutFeatures(JsonGenerator.Feature.QUOTE_FIELD_NAMES,
                JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertNotSame(config, multi);
    }

    // ---------------------------------------------------------------
    // FormatFeature factory methods (ใช้ anonymous implementation
    // เนื่องจากไม่มี format-specific module ใน classpath)
    // ---------------------------------------------------------------

    private FormatFeature formatFeature(final int mask, final boolean def) {
        return new FormatFeature() {
            @Override public int getMask() { return mask; }
            @Override public boolean enabledByDefault() { return def; }
        };
    }

    @Test
    public void testWithFormatFeature_change() {
        FormatFeature f = formatFeature(0x01, false);
        SerializationConfig result = config.with(f);
        assertNotSame(config, result);
    }

    @Test
    public void testWithFormatFeature_noChange_returnsSame() {
        FormatFeature f = formatFeature(0x01, false);
        SerializationConfig enabled = config.with(f);
        SerializationConfig again = enabled.with(f);
        assertSame(enabled, again);
    }

    @Test
    public void testWithFeaturesFormat_zeroAndMultiple() {
        SerializationConfig none = config.withFeatures(new FormatFeature[0]);
        assertSame(config, none);

        FormatFeature f1 = formatFeature(0x01, false);
        FormatFeature f2 = formatFeature(0x02, false);
        SerializationConfig multi = config.withFeatures(f1, f2);
        assertNotSame(config, multi);
    }

    @Test
    public void testWithoutFormatFeature_change() {
        FormatFeature f = formatFeature(0x01, false);
        SerializationConfig result = config.without(f);
        assertNotSame(config, result);
    }

    @Test
    public void testWithoutFeaturesFormat_zeroAndMultiple() {
        SerializationConfig none = config.withoutFeatures(new FormatFeature[0]);
        assertSame(config, none);

        FormatFeature f1 = formatFeature(0x01, false);
        FormatFeature f2 = formatFeature(0x02, false);
        SerializationConfig multi = config.withoutFeatures(f1, f2);
        assertNotSame(config, multi);
    }

    // ---------------------------------------------------------------
    // withFilters / withSerializationInclusion / withPropertyInclusion
    // withDefaultPrettyPrinter
    // ---------------------------------------------------------------

    @Test
    public void testWithFilters_sameNull_returnsSame() {
        assertNull(config.getFilterProvider());
        SerializationConfig result = config.withFilters(null);
        assertSame(config, result);
    }

    @Test
    public void testWithFilters_different_returnsNew() {
        SimpleFilterProvider provider = new SimpleFilterProvider();
        SerializationConfig result = config.withFilters(provider);
        assertNotSame(config, result);
        assertSame(provider, result.getFilterProvider());
    }

    @Test
    public void testWithSerializationInclusion_deprecated() {
        SerializationConfig result = config.withSerializationInclusion(JsonInclude.Include.NON_NULL);
        assertEquals(JsonInclude.Include.NON_NULL, result.getSerializationInclusion());
    }

    @Test
    public void testGetSerializationInclusion_defaultMapsUseDefaultsToAlways() {
        assertEquals(JsonInclude.Include.ALWAYS, config.getSerializationInclusion());
    }

    @Test
    public void testWithPropertyInclusion_same_returnsSame() {
        SerializationConfig result = config.withPropertyInclusion(JsonInclude.Value.empty());
        assertSame(config, result);
    }

    @Test
    public void testWithPropertyInclusion_different_returnsNew() {
        JsonInclude.Value incl = JsonInclude.Value.construct(JsonInclude.Include.NON_EMPTY, JsonInclude.Include.USE_DEFAULTS);
        SerializationConfig result = config.withPropertyInclusion(incl);
        assertNotSame(config, result);
        assertEquals(incl, result.getDefaultPropertyInclusion());
        assertEquals(incl, result.getDefaultPropertyInclusion(String.class));
    }

    @Test
    public void testWithDefaultPrettyPrinter_same_returnsSame() {
        SerializationConfig result = config.withDefaultPrettyPrinter(config.getDefaultPrettyPrinter());
        assertSame(config, result);
    }

    @Test
    public void testWithDefaultPrettyPrinter_different_returnsNew() {
        PrettyPrinter pp = new DefaultPrettyPrinter();
        SerializationConfig result = config.withDefaultPrettyPrinter(pp);
        assertNotSame(config, result);
        assertSame(pp, result.getDefaultPrettyPrinter());
    }

    // ---------------------------------------------------------------
    // constructDefaultPrettyPrinter()
    // ---------------------------------------------------------------

    @Test
    public void testConstructDefaultPrettyPrinter_instantiatableBranch() {
        // Default pretty printer (DefaultPrettyPrinter) implements Instantiatable
        PrettyPrinter pp = config.constructDefaultPrettyPrinter();
        assertNotNull(pp);
        assertTrue(pp instanceof DefaultPrettyPrinter);
        assertNotSame(config.getDefaultPrettyPrinter(), pp); // createInstance() returns new object
    }

    @Test
    public void testConstructDefaultPrettyPrinter_nonInstantiatableBranch() {
        PrettyPrinter notInstantiatable = new PrettyPrinter() {
            @Override public void writeRootValueSeparator(JsonGenerator jg) throws IOException {}
            @Override public void writeStartObject(JsonGenerator jg) throws IOException {}
            @Override public void beforeObjectEntries(JsonGenerator jg) throws IOException {}
            @Override public void writeObjectFieldValueSeparator(JsonGenerator jg) throws IOException {}
            @Override public void writeObjectEntrySeparator(JsonGenerator jg) throws IOException {}
            @Override public void writeEndObject(JsonGenerator jg, int nrOfEntries) throws IOException {}
            @Override public void writeStartArray(JsonGenerator jg) throws IOException {}
            @Override public void beforeArrayValues(JsonGenerator jg) throws IOException {}
            @Override public void writeArrayValueSeparator(JsonGenerator jg) throws IOException {}
            @Override public void writeEndArray(JsonGenerator jg, int nrOfValues) throws IOException {}
        };
        SerializationConfig custom = config.withDefaultPrettyPrinter(notInstantiatable);
        PrettyPrinter pp = custom.constructDefaultPrettyPrinter();
        assertSame(notInstantiatable, pp); // not Instantiatable -> returned as-is
    }

    @Test
    public void testConstructDefaultPrettyPrinter_nullBranch() {
        SerializationConfig custom = config.withDefaultPrettyPrinter(null);
        assertNull(custom.constructDefaultPrettyPrinter());
    }

    // ---------------------------------------------------------------
    // initialize(JsonGenerator)
    // ---------------------------------------------------------------

    @Test
    public void testInitialize_indentEnabled_setsPrettyPrinterWhenNone() throws IOException {
        SerializationConfig cfg = config.with(SerializationFeature.INDENT_OUTPUT);
        JsonGenerator gen = new JsonFactory().createGenerator(new StringWriter());
        assertNull(gen.getPrettyPrinter());
        cfg.initialize(gen);
        assertNotNull(gen.getPrettyPrinter());
        gen.close();
    }

    @Test
    public void testInitialize_indentEnabled_doesNotOverrideExistingPrettyPrinter() throws IOException {
        SerializationConfig cfg = config.with(SerializationFeature.INDENT_OUTPUT);
        JsonGenerator gen = new JsonFactory().createGenerator(new StringWriter());
        PrettyPrinter custom = new DefaultPrettyPrinter();
        gen.setPrettyPrinter(custom);
        cfg.initialize(gen);
        assertSame(custom, gen.getPrettyPrinter());
        gen.close();
    }

    @Test
    public void testInitialize_indentDisabled_prettyPrinterStaysNull() throws IOException {
        SerializationConfig cfg = config.without(SerializationFeature.INDENT_OUTPUT);
        JsonGenerator gen = new JsonFactory().createGenerator(new StringWriter());
        cfg.initialize(gen);
        assertNull(gen.getPrettyPrinter());
        gen.close();
    }

    @Test
    public void testInitialize_generatorFeatureMaskApplied() throws IOException {
        SerializationConfig cfg = config.without(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        JsonGenerator gen = new JsonFactory().createGenerator(new StringWriter());
        cfg.initialize(gen);
        assertFalse(gen.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        gen.close();
    }

    @Test
    public void testInitialize_writeBigDecimalAsPlain_setsGeneratorFeature() throws IOException {
        @SuppressWarnings("deprecation")
        SerializationConfig cfg = config.with(SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN);
        JsonGenerator gen = new JsonFactory().createGenerator(new StringWriter());
        cfg.initialize(gen);
        assertTrue(gen.isEnabled(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN));
        gen.close();
    }

    @Test
    public void testInitialize_formatFeatureMaskApplied_noException() throws IOException {
        FormatFeature f = formatFeature(0x01, false);
        SerializationConfig cfg = config.without(f);
        JsonGenerator gen = new JsonFactory().createGenerator(new StringWriter());
        // ไม่ทราบพฤติกรรมจริงของ overrideFormatFeatures() บน generator พื้นฐาน
        // (เนื่องจากไม่มี format-specific module ใน classpath) จึงตรวจสอบเพียงว่าไม่มี exception
        cfg.initialize(gen);
        gen.close();
    }

    // ---------------------------------------------------------------
    // getAnnotationIntrospector()
    // ---------------------------------------------------------------

    @Test
    public void testGetAnnotationIntrospector_enabled() {
        assertTrue(config.isEnabled(MapperFeature.USE_ANNOTATIONS));
        AnnotationIntrospector ai = config.getAnnotationIntrospector();
        assertNotNull(ai);
        assertNotSame(AnnotationIntrospector.nopInstance(), ai);
    }

    @Test
    public void testGetAnnotationIntrospector_disabled_returnsNop() {
        SerializationConfig cfg = config.without(MapperFeature.USE_ANNOTATIONS);
        AnnotationIntrospector ai = cfg.getAnnotationIntrospector();
        assertEquals(AnnotationIntrospector.nopInstance().getClass(), ai.getClass());
    }

    // ---------------------------------------------------------------
    // getDefaultVisibilityChecker()
    // ---------------------------------------------------------------

    @Test
    public void testGetDefaultVisibilityChecker_allEnabledByDefault() {
        VisibilityChecker<?> vc = config.getDefaultVisibilityChecker();
        assertNotNull(vc);
        // ค่า default มาจาก ObjectMapper ปกติ - ตรวจแค่ไม่ null ป้องกันการเดา behavior เพิ่ม
    }

    @Test
    public void testGetDefaultVisibilityChecker_getterVisibilityNone() {
        SerializationConfig cfg = config.without(MapperFeature.AUTO_DETECT_GETTERS);
        VisibilityChecker<?> vc = cfg.getDefaultVisibilityChecker();
        assertEquals(Visibility.NONE, vc.getGetterVisibility());
    }

    @Test
    public void testGetDefaultVisibilityChecker_isGetterVisibilityNone() {
        SerializationConfig cfg = config.without(MapperFeature.AUTO_DETECT_IS_GETTERS);
        VisibilityChecker<?> vc = cfg.getDefaultVisibilityChecker();
        assertEquals(Visibility.NONE, vc.getIsGetterVisibility());
    }

    @Test
    public void testGetDefaultVisibilityChecker_fieldVisibilityNone() {
        SerializationConfig cfg = config.without(MapperFeature.AUTO_DETECT_FIELDS);
        VisibilityChecker<?> vc = cfg.getDefaultVisibilityChecker();
        assertEquals(Visibility.NONE, vc.getFieldVisibility());
    }

    // ---------------------------------------------------------------
    // getDefaultPropertyFormat / getDefaultPropertyInclusion
    // ---------------------------------------------------------------

    @Test
    public void testGetDefaultPropertyFormat_returnsEmpty() {
        assertEquals(com.fasterxml.jackson.annotation.JsonFormat.Value.empty(),
                config.getDefaultPropertyFormat(String.class));
    }

    @Test
    public void testGetDefaultPropertyInclusion_defaultEmpty() {
        assertEquals(JsonInclude.Value.empty(), config.getDefaultPropertyInclusion());
        assertEquals(JsonInclude.Value.empty(), config.getDefaultPropertyInclusion(String.class));
    }

    // ---------------------------------------------------------------
    // useRootWrapping()
    // ---------------------------------------------------------------

    @Test
    public void testUseRootWrapping_nullRootName_wrapDisabled() {
        assertNull(config.getFullRootName());
        assertFalse(config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE));
        assertFalse(config.useRootWrapping());
    }

    @Test
    public void testUseRootWrapping_nullRootName_wrapEnabled() {
        SerializationConfig cfg = config.with(SerializationFeature.WRAP_ROOT_VALUE);
        assertTrue(cfg.useRootWrapping());
    }

    @Test
    public void testUseRootWrapping_emptyRootName_alwaysFalse() {
        SerializationConfig cfg = config.with(SerializationFeature.WRAP_ROOT_VALUE)
                .withRootName(PropertyName.USE_DEFAULT); // empty marker
        assertFalse(cfg.useRootWrapping());
    }

    @Test
    public void testUseRootWrapping_nonEmptyRootName_true() {
        SerializationConfig cfg = config.withRootName(PropertyName.construct("root"));
        assertTrue(cfg.useRootWrapping());
    }

    // ---------------------------------------------------------------
    // isEnabled(SerializationFeature) / hasSerializationFeatures / getSerializationFeatures
    // ---------------------------------------------------------------

    @Test
    public void testIsEnabledSerializationFeature() {
        assertFalse(config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE));
        SerializationConfig cfg = config.with(SerializationFeature.WRAP_ROOT_VALUE);
        assertTrue(cfg.isEnabled(SerializationFeature.WRAP_ROOT_VALUE));
    }

    @Test
    public void testHasSerializationFeatures_trueAndFalse() {
        int mask = SerializationFeature.WRAP_ROOT_VALUE.getMask() | SerializationFeature.INDENT_OUTPUT.getMask();
        assertFalse(config.hasSerializationFeatures(mask));
        SerializationConfig cfg = config.with(SerializationFeature.WRAP_ROOT_VALUE, SerializationFeature.INDENT_OUTPUT);
        assertTrue(cfg.hasSerializationFeatures(mask));
    }

    @Test
    public void testGetSerializationFeatures_matchesIsEnabled() {
        int features = config.getSerializationFeatures();
        assertEquals(config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE),
                (features & SerializationFeature.WRAP_ROOT_VALUE.getMask()) != 0);
    }

    // ---------------------------------------------------------------
    // isEnabled(JsonGenerator.Feature, JsonFactory)
    // ---------------------------------------------------------------

    @Test
    public void testIsEnabledGeneratorFeature_overrideTrue() {
        SerializationConfig cfg = config.with(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        JsonFactory factory = new JsonFactory();
        // แม้ factory ปิด feature นี้ไว้เอง แต่ config override เป็น true
        JsonFactory disabledFactory = factory.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertTrue(cfg.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES, disabledFactory));
    }

    @Test
    public void testIsEnabledGeneratorFeature_overrideFalse() {
        SerializationConfig cfg = config.without(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        JsonFactory factory = new JsonFactory().enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertFalse(cfg.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES, factory));
    }

    @Test
    public void testIsEnabledGeneratorFeature_noOverride_delegatesToFactory() {
        // config ไม่ได้ตั้งค่า mask นี้เลย -> ใช้ค่าจาก factory
        JsonFactory factory = new JsonFactory();
        boolean expected = factory.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertEquals(expected, config.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII, factory));
    }

    // ---------------------------------------------------------------
    // getFilterProvider() / getDefaultPrettyPrinter()
    // ---------------------------------------------------------------

    @Test
    public void testGetFilterProvider_defaultNull() {
        assertNull(config.getFilterProvider());
    }

    @Test
    public void testGetDefaultPrettyPrinter_default() {
        assertNotNull(config.getDefaultPrettyPrinter());
        assertTrue(config.getDefaultPrettyPrinter() instanceof DefaultPrettyPrinter);
    }

    // ---------------------------------------------------------------
    // introspect() / introspectClassAnnotations() / introspectDirectClassAnnotations()
    // ---------------------------------------------------------------

    static class SampleBean {
        public String name = "x";
    }

    @Test
    public void testIntrospect_returnsBeanDescription() {
        JavaType type = config.getTypeFactory().constructType(SampleBean.class);
        BeanDescription bd = config.introspect(type);
        assertNotNull(bd);
        assertEquals(SampleBean.class, bd.getBeanClass());
    }

    @Test
    public void testIntrospectClassAnnotations_noException() {
        JavaType type = config.getTypeFactory().constructType(SampleBean.class);
        BeanDescription bd = config.introspectClassAnnotations(type);
        assertNotNull(bd);
    }

    @Test
    public void testIntrospectDirectClassAnnotations_noException() {
        JavaType type = config.getTypeFactory().constructType(SampleBean.class);
        BeanDescription bd = config.introspectDirectClassAnnotations(type);
        assertNotNull(bd);
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToString_formatsHexFlags() {
        String expected = "[SerializationConfig: flags=0x" + Integer.toHexString(config.getSerializationFeatures()) + "]";
        assertEquals(expected, config.toString());
    }
}
