package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.util.LinkedNode;

/**
 * Unit test สำหรับ {@link DeserializationConfig}
 * ใช้ ObjectMapper เพื่อสร้าง instance จริงของ DeserializationConfig
 * (หลีกเลี่ยงการเดาโครงสร้าง constructor ของ BaseSettings ที่ไม่มีซอร์สให้)
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class DeserializationConfigTest {

    private ObjectMapper mapper;
    private DeserializationConfig config;

    // POJO ปกติ ไม่มี polymorphic type info -> ใช้ทดสอบ visibility / introspect / findTypeDeserializer(null branch)
    static class PlainBean {
        public int x;
        public PlainBean() {}
        public void setX(int x) { this.x = x; }
    }

    // POJO มี @JsonTypeInfo -> ใช้ทดสอบ findTypeDeserializer branch ที่ b != null
    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
    static class PolyBean {
        public int y;
    }

    /**
     * Dummy implementation ของ FormatFeature สำหรับทดสอบ with()/without() FormatFeature
     * หมายเหตุ: สมมติ signature ของ interface FormatFeature (jackson-core) มี 3 เมธอดนี้
     * ตามที่ปรากฏใน jackson-core 2.7+ (ไม่มีซอร์สของ interface นี้ให้ตรวจสอบตรง ๆ)
     */
    private enum DummyFormatFeature implements FormatFeature {
        FEAT_A(0x01),
        FEAT_B(0x02);

        private final int mask;
        DummyFormatFeature(int mask) { this.mask = mask; }

        @Override public boolean enabledByDefault() { return false; }
        @Override public int getMask() { return mask; }
        @Override public boolean enabledIn(int flags) { return (flags & mask) != 0; }
    }

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getDeserializationConfig();
    }

    // =====================================================================
    // Constructor / default values
    // =====================================================================

    @Test
    public void testDefaultConstructor_basicFields() {
        assertSame(JsonNodeFactory.instance, config.getNodeFactory());
        assertNull(config.getProblemHandlers());
        // known Jackson default
        assertTrue(config.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertFalse(config.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS));
    }

    // =====================================================================
    // with/without(MapperFeature...) , with(MapperFeature, boolean)
    // =====================================================================

    @Test
    public void testWithMapperFeatures_emptyArray_returnsSame() {
        DeserializationConfig result = config.with(new MapperFeature[0]);
        assertSame(config, result);
    }

    @Test
    public void testWithMapperFeature_enable_changesInstance_andNoOpOnSecondCall() {
        DeserializationConfig base = config.without(MapperFeature.USE_STATIC_TYPING);
        DeserializationConfig enabled = base.with(MapperFeature.USE_STATIC_TYPING);
        assertNotSame(base, enabled);
        assertTrue(enabled.isEnabled(MapperFeature.USE_STATIC_TYPING));

        DeserializationConfig enabledAgain = enabled.with(MapperFeature.USE_STATIC_TYPING);
        assertSame(enabled, enabledAgain);
    }

    @Test
    public void testWithoutMapperFeature_disable_changesInstance_andNoOpOnSecondCall() {
        DeserializationConfig base = config.with(MapperFeature.USE_STATIC_TYPING);
        DeserializationConfig disabled = base.without(MapperFeature.USE_STATIC_TYPING);
        assertNotSame(base, disabled);
        assertFalse(disabled.isEnabled(MapperFeature.USE_STATIC_TYPING));

        DeserializationConfig disabledAgain = disabled.without(MapperFeature.USE_STATIC_TYPING);
        assertSame(disabled, disabledAgain);
    }

    @Test
    public void testWithMapperFeatureBoolean_trueFalseAndNoOp() {
        DeserializationConfig base = config.without(MapperFeature.USE_STATIC_TYPING);

        DeserializationConfig on = base.with(MapperFeature.USE_STATIC_TYPING, true);
        assertNotSame(base, on);
        assertTrue(on.isEnabled(MapperFeature.USE_STATIC_TYPING));

        DeserializationConfig onNoChange = on.with(MapperFeature.USE_STATIC_TYPING, true);
        assertSame(on, onNoChange);

        DeserializationConfig off = on.with(MapperFeature.USE_STATIC_TYPING, false);
        assertNotSame(on, off);
        assertFalse(off.isEnabled(MapperFeature.USE_STATIC_TYPING));

        DeserializationConfig offNoChange = off.with(MapperFeature.USE_STATIC_TYPING, false);
        assertSame(off, offNoChange);
    }

    // =====================================================================
    // with(...) ที่ผ่าน _withBase (BaseSettings) - ทดสอบ branch "เปลี่ยนแปลง" อย่างมั่นใจ
    // =====================================================================

    @Test
    public void testWithClassIntrospector_changesInstance() {
        ClassIntrospector ci = mock(ClassIntrospector.class);
        DeserializationConfig result = config.with(ci);
        assertNotSame(config, result);
        assertSame(ci, result.getClassIntrospector());
    }

    @Test
    public void testWithAnnotationIntrospector_changesInstance() {
        AnnotationIntrospector ai = mock(AnnotationIntrospector.class);
        DeserializationConfig result = config.with(ai);
        assertNotSame(config, result);
    }

    @Test
    public void testWithVisibilityChecker_changesInstance() {
        VisibilityChecker<?> vc = mock(VisibilityChecker.class);
        DeserializationConfig result = config.with(vc);
        assertNotSame(config, result);
    }

    @Test
    public void testWithVisibility_changesInstance() {
        DeserializationConfig result = config.withVisibility(
                PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        assertNotSame(config, result);
    }

    @Test
    public void testWithTypeResolverBuilder_changesInstance() {
        TypeResolverBuilder<?> trb = mock(TypeResolverBuilder.class);
        DeserializationConfig result = config.with(trb);
        assertNotSame(config, result);
    }

    @Test
    public void testWithPropertyNamingStrategy_changesInstance() {
        DeserializationConfig result = config.with(PropertyNamingStrategy.SNAKE_CASE);
        assertNotSame(config, result);
    }

    @Test
    public void testWithTypeFactory_smoke() {
        // ไม่ assert notSame เพราะ default TypeFactory อาจเท่ากับ TypeFactory.defaultInstance()
        DeserializationConfig result = config.with(TypeFactory.defaultInstance());
        assertNotNull(result.getTypeFactory());
    }

    @Test
    public void testWithDateFormat_changesInstance() {
        DeserializationConfig result = config.with(new SimpleDateFormat());
        assertNotSame(config, result);
    }

    @Test
    public void testWithHandlerInstantiator_changesInstance() {
        HandlerInstantiator hi = mock(HandlerInstantiator.class);
        DeserializationConfig result = config.with(hi);
        assertNotSame(config, result);
    }

    @Test
    public void testWithInsertedAnnotationIntrospector_changesInstance() {
        AnnotationIntrospector ai = mock(AnnotationIntrospector.class);
        DeserializationConfig result = config.withInsertedAnnotationIntrospector(ai);
        assertNotSame(config, result);
    }

    @Test
    public void testWithAppendedAnnotationIntrospector_changesInstance() {
        AnnotationIntrospector ai = mock(AnnotationIntrospector.class);
        DeserializationConfig result = config.withAppendedAnnotationIntrospector(ai);
        assertNotSame(config, result);
    }

    @Test
    public void testWithLocale_changesInstance() {
        // ใช้ locale สมมติที่ไม่ควรเป็นค่า default ในสภาพแวดล้อม CI ทั่วไป
        DeserializationConfig result = config.with(new Locale("zz"));
        assertNotSame(config, result);
    }

    @Test
    public void testWithTimeZone_changesInstance() {
        DeserializationConfig result = config.with(TimeZone.getTimeZone("America/Los_Angeles"));
        assertNotSame(config, result);
    }

    @Test
    public void testWithBase64Variant_changesInstance() {
        DeserializationConfig result = config.with(Base64Variants.MODIFIED_FOR_URL);
        assertNotSame(config, result);
    }

    // =====================================================================
    // with(SubtypeResolver) - เงื่อนไขตรงใน DeserializationConfig เอง
    // =====================================================================

    @Test
    public void testWithSubtypeResolver_sameReference_returnsSame() {
        SubtypeResolver current = config.getSubtypeResolver();
        DeserializationConfig result = config.with(current);
        assertSame(config, result);
    }

    @Test
    public void testWithSubtypeResolver_differentReference_returnsNew() {
        SubtypeResolver newResolver = new StdSubtypeResolver();
        DeserializationConfig result = config.with(newResolver);
        assertNotSame(config, result);
        assertSame(newResolver, result.getSubtypeResolver());
    }

    // =====================================================================
    // withRootName(PropertyName) - ทุก branch (null/null, null/non-null, equal, different)
    // =====================================================================

    @Test
    public void testWithRootName_nullToNull_returnsSame() {
        DeserializationConfig result = config.withRootName((PropertyName) null);
        assertSame(config, result);
    }

    @Test
    public void testWithRootName_nullOnNonNullRoot_returnsNew() {
        DeserializationConfig withRoot = config.withRootName(new PropertyName("root"));
        DeserializationConfig result = withRoot.withRootName((PropertyName) null);
        assertNotSame(withRoot, result);
    }

    @Test
    public void testWithRootName_sameValue_returnsSame() {
        DeserializationConfig withRoot = config.withRootName(new PropertyName("root"));
        DeserializationConfig result = withRoot.withRootName(new PropertyName("root"));
        assertSame(withRoot, result);
    }

    @Test
    public void testWithRootName_differentValue_returnsNew() {
        DeserializationConfig withRoot = config.withRootName(new PropertyName("root"));
        DeserializationConfig result = withRoot.withRootName(new PropertyName("other"));
        assertNotSame(withRoot, result);
    }

    // =====================================================================
    // withView(Class<?>) - branch: same(null), different, same(non-null)
    // =====================================================================

    @Test
    public void testWithView_sameNullView_returnsSame() {
        DeserializationConfig result = config.withView(null);
        assertSame(config, result);
    }

    @Test
    public void testWithView_differentView_returnsNew() {
        DeserializationConfig result = config.withView(String.class);
        assertNotSame(config, result);
        assertEquals(String.class, result.getActiveView());
    }

    @Test
    public void testWithView_sameNonNullView_returnsSame() {
        DeserializationConfig withView = config.withView(String.class);
        DeserializationConfig result = withView.withView(String.class);
        assertSame(withView, result);
    }

    // =====================================================================
    // with(ContextAttributes) - branch: same reference / different reference
    // =====================================================================

    @Test
    public void testWithContextAttributes_sameReference_returnsSame() {
        ContextAttributes attrs = config.getAttributes();
        DeserializationConfig result = config.with(attrs);
        assertSame(config, result);
    }

    @Test
    public void testWithContextAttributes_differentReference_returnsNew() {
        ContextAttributes attrs = ContextAttributes.getEmpty().withSharedAttribute("k", "v");
        DeserializationConfig result = config.with(attrs);
        assertNotSame(config, result);
        assertSame(attrs, result.getAttributes());
    }

    // =====================================================================
    // DeserializationFeature: with(single) / with(varargs) / withFeatures / without(...)
    // =====================================================================

    @Test
    public void testWithDeserializationFeature_single_enableAndNoOp() {
        DeserializationConfig base = config.without(DeserializationFeature.UNWRAP_ROOT_VALUE);
        DeserializationConfig result = base.with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertNotSame(base, result);
        assertTrue(result.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));

        DeserializationConfig noChange = result.with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertSame(result, noChange);
    }

    @Test
    public void testWithDeserializationFeature_varargs_enableAndNoOp() {
        DeserializationConfig base = config
                .without(DeserializationFeature.UNWRAP_ROOT_VALUE)
                .without(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        DeserializationConfig result = base.with(DeserializationFeature.UNWRAP_ROOT_VALUE,
                DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        assertNotSame(base, result);
        assertTrue(result.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
        assertTrue(result.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS));

        DeserializationConfig noChange = result.with(DeserializationFeature.UNWRAP_ROOT_VALUE,
                DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        assertSame(result, noChange);
    }

    @Test
    public void testWithFeatures_deser_emptyArray_returnsSame() {
        DeserializationConfig result = config.withFeatures(new DeserializationFeature[0]);
        assertSame(config, result);
    }

    @Test
    public void testWithFeatures_deser_nonEmpty_changesInstance() {
        DeserializationConfig base = config.without(DeserializationFeature.UNWRAP_ROOT_VALUE);
        DeserializationConfig result = base.withFeatures(DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertNotSame(base, result);
        assertTrue(result.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
    }

    @Test
    public void testWithoutDeserializationFeature_single_disableAndNoOp() {
        DeserializationConfig base = config.with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        DeserializationConfig result = base.without(DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertNotSame(base, result);
        assertFalse(result.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));

        DeserializationConfig noChange = result.without(DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertSame(result, noChange);
    }

    @Test
    public void testWithoutDeserializationFeature_varargs() {
        DeserializationConfig base = config
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE)
                .with(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        DeserializationConfig result = base.without(DeserializationFeature.UNWRAP_ROOT_VALUE,
                DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        assertNotSame(base, result);
        assertFalse(result.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
        assertFalse(result.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS));
    }

    @Test
    public void testWithoutFeatures_deser_emptyArray_returnsSame() {
        DeserializationConfig result = config.withoutFeatures(new DeserializationFeature[0]);
        assertSame(config, result);
    }

    @Test
    public void testWithoutFeatures_deser_nonEmpty_changesInstance() {
        DeserializationConfig base = config.with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        DeserializationConfig result = base.withoutFeatures(DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertNotSame(base, result);
        assertFalse(result.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
    }

    // =====================================================================
    // JsonParser.Feature: with/withFeatures/without/withoutFeatures
    // =====================================================================

    @Test
    public void testWithJsonParserFeature_single_andNoOp() {
        DeserializationConfig result = config.with(JsonParser.Feature.ALLOW_COMMENTS);
        assertNotSame(config, result);
        JsonFactory factory = new JsonFactory();
        assertTrue(result.isEnabled(JsonParser.Feature.ALLOW_COMMENTS, factory));

        DeserializationConfig noChange = result.with(JsonParser.Feature.ALLOW_COMMENTS);
        assertSame(result, noChange);
    }

    @Test
    public void testWithFeatures_parser_emptyArray_returnsSame() {
        DeserializationConfig result = config.withFeatures(new JsonParser.Feature[0]);
        assertSame(config, result);
    }

    @Test
    public void testWithFeatures_parser_nonEmpty_changesInstance() {
        DeserializationConfig result = config.withFeatures(JsonParser.Feature.ALLOW_COMMENTS,
                JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        assertNotSame(config, result);
        JsonFactory factory = new JsonFactory();
        assertTrue(result.isEnabled(JsonParser.Feature.ALLOW_COMMENTS, factory));
        assertTrue(result.isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES, factory));
    }

    @Test
    public void testWithoutJsonParserFeature_single() {
        DeserializationConfig base = config.with(JsonParser.Feature.ALLOW_COMMENTS);
        DeserializationConfig result = base.without(JsonParser.Feature.ALLOW_COMMENTS);
        assertNotSame(base, result);
        JsonFactory factory = new JsonFactory();
        assertFalse(result.isEnabled(JsonParser.Feature.ALLOW_COMMENTS, factory));
    }

    @Test
    public void testWithoutFeatures_parser_emptyArray_returnsSame() {
        DeserializationConfig result = config.withoutFeatures(new JsonParser.Feature[0]);
        assertSame(config, result);
    }

    @Test
    public void testWithoutFeatures_parser_nonEmpty_changesInstance() {
        DeserializationConfig base = config.with(JsonParser.Feature.ALLOW_COMMENTS);
        DeserializationConfig result = base.withoutFeatures(JsonParser.Feature.ALLOW_COMMENTS);
        assertNotSame(base, result);
        JsonFactory factory = new JsonFactory();
        assertFalse(result.isEnabled(JsonParser.Feature.ALLOW_COMMENTS, factory));
    }

    // =====================================================================
    // FormatFeature: with/withFeatures/without/withoutFeatures
    // =====================================================================

    @Test
    public void testWithFormatFeature_single_andNoOp() {
        DeserializationConfig result = config.with(DummyFormatFeature.FEAT_A);
        assertNotSame(config, result);
        DeserializationConfig noChange = result.with(DummyFormatFeature.FEAT_A);
        assertSame(result, noChange);
    }

    @Test
    public void testWithFeatures_format_emptyArray_returnsSame() {
        DeserializationConfig result = config.withFeatures(new FormatFeature[0]);
        assertSame(config, result);
    }

    @Test
    public void testWithFeatures_format_nonEmpty_changesInstance() {
        DeserializationConfig result = config.withFeatures(DummyFormatFeature.FEAT_A, DummyFormatFeature.FEAT_B);
        assertNotSame(config, result);
    }

    @Test
    public void testWithoutFormatFeature_single() {
        DeserializationConfig base = config.with(DummyFormatFeature.FEAT_A);
        DeserializationConfig result = base.without(DummyFormatFeature.FEAT_A);
        assertNotSame(base, result);
    }

    @Test
    public void testWithoutFeatures_format_emptyArray_returnsSame() {
        DeserializationConfig result = config.withoutFeatures(new FormatFeature[0]);
        assertSame(config, result);
    }

    @Test
    public void testWithoutFeatures_format_nonEmpty_changesInstance() {
        DeserializationConfig base = config.with(DummyFormatFeature.FEAT_A);
        DeserializationConfig result = base.withoutFeatures(DummyFormatFeature.FEAT_A);
        assertNotSame(base, result);
    }

    // =====================================================================
    // with(JsonNodeFactory)
    // =====================================================================

    @Test
    public void testWithJsonNodeFactory_sameReference_returnsSame() {
        DeserializationConfig result = config.with(config.getNodeFactory());
        assertSame(config, result);
    }

    @Test
    public void testWithJsonNodeFactory_differentReference_returnsNew() {
        JsonNodeFactory f = JsonNodeFactory.withExactBigDecimals(true);
        DeserializationConfig result = config.with(f);
        assertNotSame(config, result);
        assertSame(f, result.getNodeFactory());
    }

    // =====================================================================
    // withHandler / withNoProblemHandlers
    // =====================================================================

    @Test
    public void testWithHandler_addNewHandler() {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {};
        DeserializationConfig result = config.withHandler(h);
        assertNotSame(config, result);
        LinkedNode<DeserializationProblemHandler> node = result.getProblemHandlers();
        assertNotNull(node);
        assertEquals(h, node.value());
    }

    @Test
    public void testWithHandler_addSameHandlerTwice_returnsSame() {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {};
        DeserializationConfig result = config.withHandler(h);
        DeserializationConfig result2 = result.withHandler(h);
        assertSame(result, result2);
    }

    @Test
    public void testWithNoProblemHandlers_alreadyNull_returnsSame() {
        DeserializationConfig result = config.withNoProblemHandlers();
        assertSame(config, result);
    }

    @Test
    public void testWithNoProblemHandlers_hasHandlers_returnsNewWithNull() {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {};
        DeserializationConfig withHandler = config.withHandler(h);
        DeserializationConfig result = withHandler.withNoProblemHandlers();
        assertNotSame(withHandler, result);
        assertNull(result.getProblemHandlers());
    }

    // =====================================================================
    // initialize(JsonParser)
    // =====================================================================

    @Test
    public void testInitialize_noOverrides_doesNotTouchParser() {
        JsonParser parser = mock(JsonParser.class);
        config.initialize(parser); // default config: mask ทั้งสองเป็น 0
        verify(parser, never()).overrideStdFeatures(anyInt(), anyInt());
        verify(parser, never()).overrideFormatFeatures(anyInt(), anyInt());
    }

    @Test
    public void testInitialize_withParserFeatureOverride_callsOverrideStdFeatures() {
        DeserializationConfig cfg = config.with(JsonParser.Feature.ALLOW_COMMENTS);
        JsonParser parser = mock(JsonParser.class);
        cfg.initialize(parser);
        verify(parser, times(1)).overrideStdFeatures(anyInt(), anyInt());
    }

    @Test
    public void testInitialize_withFormatFeatureOverride_callsOverrideFormatFeatures() {
        DeserializationConfig cfg = config.with(DummyFormatFeature.FEAT_A);
        JsonParser parser = mock(JsonParser.class);
        cfg.initialize(parser);
        verify(parser, times(1)).overrideFormatFeatures(anyInt(), anyInt());
    }

    // =====================================================================
    // getAnnotationIntrospector()
    // =====================================================================

    @Test
    public void testGetAnnotationIntrospector_annotationsEnabled() {
        DeserializationConfig cfg = config.with(MapperFeature.USE_ANNOTATIONS);
        AnnotationIntrospector ai = cfg.getAnnotationIntrospector();
        assertNotNull(ai);
        assertFalse(ai instanceof NopAnnotationIntrospector);
    }

    @Test
    public void testGetAnnotationIntrospector_annotationsDisabled() {
        DeserializationConfig cfg = config.without(MapperFeature.USE_ANNOTATIONS);
        assertSame(NopAnnotationIntrospector.instance, cfg.getAnnotationIntrospector());
    }

    // =====================================================================
    // getDefaultVisibilityChecker() - 3 if-conditions (setters/creators/fields)
    // =====================================================================

    @Test
    public void testGetDefaultVisibilityChecker_allAutoDetectOff() throws Exception {
        DeserializationConfig cfg = config
                .without(MapperFeature.AUTO_DETECT_SETTERS)
                .without(MapperFeature.AUTO_DETECT_CREATORS)
                .without(MapperFeature.AUTO_DETECT_FIELDS);
        VisibilityChecker<?> vc = cfg.getDefaultVisibilityChecker();

        Field f = PlainBean.class.getField("x");
        Method setter = PlainBean.class.getMethod("setX", int.class);
        Constructor<?> ctor = PlainBean.class.getConstructor();

        assertFalse(vc.isFieldVisible(f));
        assertFalse(vc.isSetterVisible(setter));
        assertFalse(vc.isCreatorVisible(ctor));
    }

    @Test
    public void testGetDefaultVisibilityChecker_allAutoDetectOn() throws Exception {
        DeserializationConfig cfg = config
                .with(MapperFeature.AUTO_DETECT_SETTERS)
                .with(MapperFeature.AUTO_DETECT_CREATORS)
                .with(MapperFeature.AUTO_DETECT_FIELDS);
        VisibilityChecker<?> vc = cfg.getDefaultVisibilityChecker();

        Field f = PlainBean.class.getField("x");
        Method setter = PlainBean.class.getMethod("setX", int.class);
        Constructor<?> ctor = PlainBean.class.getConstructor();

        // สมาชิกทั้งหมดเป็น public จึงควรมองเห็นได้เมื่อ auto-detect เปิด
        assertTrue(vc.isFieldVisible(f));
        assertTrue(vc.isSetterVisible(setter));
        assertTrue(vc.isCreatorVisible(ctor));
    }

    // =====================================================================
    // getDefaultPropertyInclusion / getDefaultPropertyFormat
    // =====================================================================

    @Test
    public void testGetDefaultPropertyInclusion_returnsSameConstant() {
        assertNotNull(config.getDefaultPropertyInclusion());
        assertSame(config.getDefaultPropertyInclusion(), config.getDefaultPropertyInclusion(String.class));
    }

    @Test
    public void testGetDefaultPropertyFormat_returnsSameConstant() {
        assertSame(config.getDefaultPropertyFormat(String.class), config.getDefaultPropertyFormat(Integer.class));
    }

    // =====================================================================
    // useRootWrapping() - branch: rootName null (feature off/on), empty, non-empty
    // =====================================================================

    @Test
    public void testUseRootWrapping_nullRootName_featureDisabled() {
        DeserializationConfig cfg = config.without(DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertFalse(cfg.useRootWrapping());
    }

    @Test
    public void testUseRootWrapping_nullRootName_featureEnabled() {
        DeserializationConfig cfg = config.with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertTrue(cfg.useRootWrapping());
    }

    @Test
    public void testUseRootWrapping_emptyRootName_returnsFalse() {
        DeserializationConfig cfg = config.withRootName(new PropertyName(""));
        assertFalse(cfg.useRootWrapping());
    }

    @Test
    public void testUseRootWrapping_nonEmptyRootName_returnsTrue() {
        DeserializationConfig cfg = config.withRootName(new PropertyName("root"));
        assertTrue(cfg.useRootWrapping());
    }

    // =====================================================================
    // isEnabled(JsonParser.Feature, JsonFactory) - branch: overridden / delegate
    // =====================================================================

    @Test
    public void testIsEnabled_parserFeature_notOverridden_delegatesToFactory() {
        JsonFactory factory = new JsonFactory();
        boolean factoryDefault = factory.isEnabled(JsonParser.Feature.ALLOW_COMMENTS);
        assertEquals(factoryDefault, config.isEnabled(JsonParser.Feature.ALLOW_COMMENTS, factory));
    }

    @Test
    public void testIsEnabled_parserFeature_overridden_usesConfigValue() {
        JsonFactory factory = new JsonFactory(); // default: ALLOW_COMMENTS = false
        DeserializationConfig cfg = config.with(JsonParser.Feature.ALLOW_COMMENTS);
        assertTrue(cfg.isEnabled(JsonParser.Feature.ALLOW_COMMENTS, factory));
    }

    // =====================================================================
    // hasDeserializationFeatures / hasSomeOfFeatures / getDeserializationFeatures
    // =====================================================================

    @Test
    public void testHasDeserializationFeatures_allSet() {
        int mask = DeserializationFeature.UNWRAP_ROOT_VALUE.getMask()
                | DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS.getMask();
        DeserializationConfig cfg = config.with(DeserializationFeature.UNWRAP_ROOT_VALUE,
                DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        assertTrue(cfg.hasDeserializationFeatures(mask));
    }

    @Test
    public void testHasDeserializationFeatures_notAllSet() {
        int mask = DeserializationFeature.UNWRAP_ROOT_VALUE.getMask()
                | DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS.getMask();
        DeserializationConfig cfg = config
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE)
                .without(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        assertFalse(cfg.hasDeserializationFeatures(mask));
    }

    @Test
    public void testHasSomeOfFeatures_oneSet() {
        int mask = DeserializationFeature.UNWRAP_ROOT_VALUE.getMask()
                | DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS.getMask();
        DeserializationConfig cfg = config
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE)
                .without(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        assertTrue(cfg.hasSomeOfFeatures(mask));
    }

    @Test
    public void testHasSomeOfFeatures_noneSet() {
        int mask = DeserializationFeature.UNWRAP_ROOT_VALUE.getMask()
                | DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS.getMask();
        DeserializationConfig cfg = config
                .without(DeserializationFeature.UNWRAP_ROOT_VALUE)
                .without(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        assertFalse(cfg.hasSomeOfFeatures(mask));
    }

    @Test
    public void testGetDeserializationFeatures_consistentWithIsEnabled() {
        DeserializationConfig cfg = config.with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        int features = cfg.getDeserializationFeatures();
        boolean bitSet = (features & DeserializationFeature.UNWRAP_ROOT_VALUE.getMask()) != 0;
        assertEquals(bitSet, cfg.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
    }

    // =====================================================================
    // introspect* methods (smoke test - เน้น delegation ไม่มี branch ซับซ้อน)
    // =====================================================================

    @Test
    public void testIntrospect_returnsNonNull() {
        JavaType type = TypeFactory.defaultInstance().constructType(PlainBean.class);
        BeanDescription bd = config.introspect(type);
        assertNotNull(bd);
    }

    @Test
    public void testIntrospectForCreation_returnsNonNull() {
        JavaType type = TypeFactory.defaultInstance().constructType(PlainBean.class);
        BeanDescription bd = config.introspectForCreation(type);
        assertNotNull(bd);
    }

    @Test
    public void testIntrospectForBuilder_returnsNonNull() {
        JavaType type = TypeFactory.defaultInstance().constructType(PlainBean.class);
        BeanDescription bd = config.introspectForBuilder(type);
        assertNotNull(bd);
    }

    @Test
    public void testIntrospectClassAnnotations_returnsNonNull() {
        JavaType type = TypeFactory.defaultInstance().constructType(PlainBean.class);
        BeanDescription bd = config.introspectClassAnnotations(type);
        assertNotNull(bd);
        assertEquals(PlainBean.class, bd.getBeanClass());
    }

    @Test
    public void testIntrospectDirectClassAnnotations_returnsNonNull() {
        JavaType type = TypeFactory.defaultInstance().constructType(PlainBean.class);
        BeanDescription bd = config.introspectDirectClassAnnotations(type);
        assertNotNull(bd);
        assertEquals(PlainBean.class, bd.getBeanClass());
    }

    // =====================================================================
    // findTypeDeserializer(JavaType) - branch: b == null (default) / b != null (@JsonTypeInfo)
    // =====================================================================

    @Test
    public void testFindTypeDeserializer_noTypeInfo_returnsNull() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(PlainBean.class);
        TypeDeserializer td = config.findTypeDeserializer(type);
        assertNull(td);
    }

    @Test
    public void testFindTypeDeserializer_withJsonTypeInfo_returnsNonNull() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(PolyBean.class);
        TypeDeserializer td = config.findTypeDeserializer(type);
        assertNotNull(td);
    }
}
