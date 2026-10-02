# ObjectMapperTest.java

หมายเหตุสำคัญก่อนเริ่ม:
- ไฟล์ทดสอบนี้ถูกวางไว้ใน **package เดียวกัน** กับคลาสเป้าหมาย (`com.fasterxml.jackson.databind`) เพื่อให้เข้าถึง field/constructor แบบ package-private/protected และ nested class `DefaultTypeResolverBuilder` ได้ตรงตามซอร์สจริง
- ใช้ Mockito (มีใน classpath) สำหรับ mock `Module`, `DeserializationProblemHandler`, `FormatSchema` ฯลฯ เพื่อทดสอบ branch ที่พึ่งพา interaction
- ในส่วนที่ไม่แน่ใจ behavior แน่ชัดจากซอร์ส (เช่น acceptJsonFormatVisitor กับ mock visitor เต็มรูปแบบ) จะใส่คอมเมนต์กำกับและออกแบบเทสให้ปลอดภัยที่สุด ไม่เดา behavior ที่ไม่มีหลักฐาน

```java
package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.*;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.*;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.*;
import com.fasterxml.jackson.databind.jsontype.*;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.ser.*;
import com.fasterxml.jackson.databind.type.*;

public class ObjectMapperTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    /* ======================================================
     * Constructors / copy()
     * ====================================================== */

    @Test
    public void testDefaultConstructor() {
        assertNotNull(mapper.getFactory());
        assertNotNull(mapper.getSerializationConfig());
        assertNotNull(mapper.getDeserializationConfig());
    }

    @Test
    public void testConstructorWithFactory() {
        JsonFactory f = new JsonFactory();
        ObjectMapper m = new ObjectMapper(f);
        assertSame(f, m.getFactory());
        assertSame(m, f.getCodec());
    }

    @Test
    public void testConstructorWithFactoryThatAlreadyHasCodec() {
        // covers branch: jf.getCodec() != null -> do NOT overwrite codec
        JsonFactory f = new JsonFactory();
        ObjectMapper first = new ObjectMapper(f); // sets codec to 'first'
        ObjectMapper second = new ObjectMapper(f);
        assertSame(f, second.getFactory());
        // codec should still point to 'first' mapper, not reassigned by 'second'
        assertSame(first, f.getCodec());
    }

    @Test
    public void testCopyPreservesConfig() {
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapper.addMixIn(String.class, Integer.class);
        ObjectMapper copy = mapper.copy();
        assertNotSame(mapper, copy);
        assertTrue(copy.isEnabled(SerializationFeature.INDENT_OUTPUT));
        assertEquals(Integer.class, copy.findMixInClassFor(String.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testCopyInvalidSubclassThrows() {
        // Anonymous subclass does NOT override copy() -> _checkInvalidCopy must throw
        ObjectMapper sub = new ObjectMapper() {
            private static final long serialVersionUID = 1L;
        };
        sub.copy();
    }

    @Test
    public void testVersionNotNull() {
        assertNotNull(mapper.version());
    }

    /* ======================================================
     * Module registration
     * ====================================================== */

    @Test
    public void testRegisterModuleNullNameThrows() {
        Module m = mock(Module.class);
        when(m.getModuleName()).thenReturn(null);
        try {
            mapper.registerModule(m);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected - "Module without defined name"
        }
    }

    @Test
    public void testRegisterModuleNullVersionThrows() {
        Module m = mock(Module.class);
        when(m.getModuleName()).thenReturn("test-module");
        when(m.version()).thenReturn(null);
        try {
            mapper.registerModule(m);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected - "Module without defined version"
        }
    }

    @Test
    public void testRegisterModuleSuccessCallsSetupModule() {
        Module m = mock(Module.class);
        when(m.getModuleName()).thenReturn("ok-module");
        when(m.version()).thenReturn(Version.unknownVersion());
        ObjectMapper result = mapper.registerModule(m);
        assertSame(mapper, result);
        verify(m, times(1)).setupModule(any(Module.SetupContext.class));
    }

    @Test
    public void testRegisterModuleTwiceWithoutIgnoreFeatureBothRegister() {
        // covers: isEnabled(IGNORE_DUPLICATE_MODULE_REGISTRATIONS) == false branch
        Module m = mock(Module.class);
        when(m.getModuleName()).thenReturn("no-ignore-module");
        when(m.version()).thenReturn(Version.unknownVersion());
        mapper.registerModule(m);
        mapper.registerModule(m);
        verify(m, times(2)).setupModule(any(Module.SetupContext.class));
    }

    @Test
    public void testRegisterModuleDuplicateIgnoredWhenFeatureEnabled() {
        // covers: typeId != null AND already registered -> add() returns false -> early return
        mapper.enable(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS);
        Module m = mock(Module.class);
        when(m.getTypeId()).thenReturn("dup-id");
        when(m.getModuleName()).thenReturn("dup-module");
        when(m.version()).thenReturn(Version.unknownVersion());
        mapper.registerModule(m);
        mapper.registerModule(m);
        verify(m, times(1)).setupModule(any(Module.SetupContext.class));
    }

    @Test
    public void testRegisterModuleWithNullTypeIdAlwaysRegisters() {
        // covers: typeId == null -> skip duplicate tracking entirely
        mapper.enable(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS);
        Module m = mock(Module.class);
        when(m.getTypeId()).thenReturn(null);
        when(m.getModuleName()).thenReturn("no-id-module");
        when(m.version()).thenReturn(Version.unknownVersion());
        mapper.registerModule(m);
        mapper.registerModule(m);
        verify(m, times(2)).setupModule(any(Module.SetupContext.class));
    }

    @Test
    public void testRegisterModulesArray() {
        Module m1 = mock(Module.class);
        when(m1.getModuleName()).thenReturn("m1");
        when(m1.version()).thenReturn(Version.unknownVersion());
        Module m2 = mock(Module.class);
        when(m2.getModuleName()).thenReturn("m2");
        when(m2.version()).thenReturn(Version.unknownVersion());
        ObjectMapper result = mapper.registerModules(m1, m2);
        assertSame(mapper, result);
        verify(m1).setupModule(any(Module.SetupContext.class));
        verify(m2).setupModule(any(Module.SetupContext.class));
    }

    @Test
    public void testRegisterModulesIterable() {
        Module m1 = mock(Module.class);
        when(m1.getModuleName()).thenReturn("m1-iter");
        when(m1.version()).thenReturn(Version.unknownVersion());
        List<Module> list = new ArrayList<Module>();
        list.add(m1);
        ObjectMapper result = mapper.registerModules(list);
        assertSame(mapper, result);
        verify(m1).setupModule(any(Module.SetupContext.class));
    }

    @Test
    public void testFindModulesReturnsNonNullList() {
        List<com.fasterxml.jackson.databind.Module> mods = ObjectMapper.findModules();
        assertNotNull(mods);
    }

    @Test
    public void testFindAndRegisterModulesReturnsSelf() {
        ObjectMapper result = mapper.findAndRegisterModules();
        assertSame(mapper, result);
    }

    /* ======================================================
     * Config object access
     * ====================================================== */

    @Test
    public void testConfigAccessors() {
        assertNotNull(mapper.getSerializationConfig());
        assertNotNull(mapper.getDeserializationConfig());
        assertNotNull(mapper.getDeserializationContext());
    }

    @Test
    public void testSerializerFactoryAndProviderAccessors() {
        SerializerFactory sf = mapper.getSerializerFactory();
        assertNotNull(sf);
        ObjectMapper result = mapper.setSerializerFactory(sf);
        assertSame(mapper, result);
        assertSame(sf, mapper.getSerializerFactory());

        assertNotNull(mapper.getSerializerProvider());
        assertNotNull(mapper.getSerializerProviderInstance());
    }

    /* ======================================================
     * Mix-ins
     * ====================================================== */

    @Test
    public void testMixInBasicFlow() {
        assertEquals(0, mapper.mixInCount());
        ObjectMapper result = mapper.addMixIn(String.class, Integer.class);
        assertSame(mapper, result);
        assertEquals(1, mapper.mixInCount());
        assertEquals(Integer.class, mapper.findMixInClassFor(String.class));
    }

    @Test
    public void testSetMixInsReplacesLocalDefinitions() {
        mapper.addMixIn(String.class, Integer.class);
        Map<Class<?>, Class<?>> mixins = new HashMap<Class<?>, Class<?>>();
        mixins.put(Long.class, Double.class);
        ObjectMapper result = mapper.setMixIns(mixins);
        assertSame(mapper, result);
        assertEquals(1, mapper.mixInCount());
        assertEquals(Double.class, mapper.findMixInClassFor(Long.class));
        assertNull(mapper.findMixInClassFor(String.class)); // cleared by setMixIns
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedMixInMethods() {
        Map<Class<?>, Class<?>> mixins = new HashMap<Class<?>, Class<?>>();
        mixins.put(String.class, Integer.class);
        mapper.setMixInAnnotations(mixins);
        assertEquals(Integer.class, mapper.findMixInClassFor(String.class));
        mapper.addMixInAnnotations(Long.class, Double.class);
        assertEquals(Double.class, mapper.findMixInClassFor(Long.class));
    }

    @Test
    public void testSetMixInResolverReturnsSelf() {
        ClassIntrospector.MixInResolver resolver = mock(ClassIntrospector.MixInResolver.class);
        ObjectMapper result = mapper.setMixInResolver(resolver);
        assertSame(mapper, result);
    }

    /* ======================================================
     * Visibility
     * ====================================================== */

    @Test
    public void testVisibilityCheckerRoundTrip() {
        VisibilityChecker<?> vc = mapper.getVisibilityChecker();
        assertNotNull(vc);
        ObjectMapper result = mapper.setVisibility(vc);
        assertSame(mapper, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedSetVisibilityChecker() {
        VisibilityChecker<?> vc = mapper.getVisibilityChecker();
        mapper.setVisibilityChecker(vc);
        assertNotNull(mapper.getVisibilityChecker());
    }

    @Test
    public void testSetVisibilityForAccessor() {
        ObjectMapper result = mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        assertSame(mapper, result);
    }

    /* ======================================================
     * Subtype resolver
     * ====================================================== */

    @Test
    public void testSubtypeResolverGetSet() {
        assertNotNull(mapper.getSubtypeResolver());
        SubtypeResolver sr = mock(SubtypeResolver.class);
        ObjectMapper result = mapper.setSubtypeResolver(sr);
        assertSame(mapper, result);
        assertSame(sr, mapper.getSubtypeResolver());
    }

    @Test
    public void testRegisterSubtypesByClass() {
        mapper.registerSubtypes(String.class); // no exception expected
    }

    @Test
    public void testRegisterSubtypesByNamedType() {
        mapper.registerSubtypes(new NamedType(String.class, "str")); // no exception expected
    }

    /* ======================================================
     * Annotation introspector / naming strategy
     * ====================================================== */

    @Test
    public void testSetAnnotationIntrospectorReturnsSelf() {
        AnnotationIntrospector ai = mock(AnnotationIntrospector.class);
        ObjectMapper result = mapper.setAnnotationIntrospector(ai);
        assertSame(mapper, result);
    }

    @Test
    public void testSetAnnotationIntrospectorsSeparate() {
        AnnotationIntrospector ai1 = mock(AnnotationIntrospector.class);
        AnnotationIntrospector ai2 = mock(AnnotationIntrospector.class);
        ObjectMapper result = mapper.setAnnotationIntrospectors(ai1, ai2);
        assertSame(mapper, result);
    }

    @Test
    public void testPropertyNamingStrategyRoundTrip() {
        PropertyNamingStrategy pns = mock(PropertyNamingStrategy.class);
        ObjectMapper result = mapper.setPropertyNamingStrategy(pns);
        assertSame(mapper, result);
        assertSame(pns, mapper.getPropertyNamingStrategy());
    }

    /* ======================================================
     * Inclusion / pretty printer
     * ====================================================== */

    @Test
    public void testSetSerializationInclusion() {
        ObjectMapper result = mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        assertSame(mapper, result);
    }

    @Test
    public void testSetPropertyInclusion() {
        ObjectMapper result = mapper.setPropertyInclusion(
                JsonInclude.Value.construct(JsonInclude.Include.NON_EMPTY, JsonInclude.Include.ALWAYS));
        assertSame(mapper, result);
    }

    @Test
    public void testSetDefaultPrettyPrinter() {
        PrettyPrinter pp = mock(PrettyPrinter.class);
        ObjectMapper result = mapper.setDefaultPrettyPrinter(pp);
        assertSame(mapper, result);
    }

    /* ======================================================
     * Default typing (enableDefaultTyping family)
     * ====================================================== */

    @Test
    public void testEnableDefaultTypingNoArgs() {
        assertSame(mapper, mapper.enableDefaultTyping());
    }

    @Test
    public void testEnableDefaultTypingWithDtiOnly() {
        assertSame(mapper, mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEnableDefaultTypingExternalPropertyThrows() {
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE,
                JsonTypeInfo.As.EXTERNAL_PROPERTY);
    }

    @Test
    public void testEnableDefaultTypingWrapperArrayOk() {
        assertSame(mapper, mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT,
                JsonTypeInfo.As.WRAPPER_ARRAY));
    }

    @Test
    public void testEnableDefaultTypingAsProperty() {
        assertSame(mapper, mapper.enableDefaultTypingAsProperty(
                ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS, "@type"));
    }

    @Test
    public void testDisableDefaultTyping() {
        assertSame(mapper, mapper.disableDefaultTyping());
    }

    @Test
    public void testSetDefaultTypingNull() {
        assertSame(mapper, mapper.setDefaultTyping(null));
    }

    /* ======================================================
     * DefaultTypeResolverBuilder.useForType - branch matrix
     * ====================================================== */

    @Test
    public void testUseForType_JavaLangObject_True() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        JavaType t = TypeFactory.defaultInstance().constructType(Object.class);
        assertTrue(b.useForType(t));
    }

    @Test
    public void testUseForType_JavaLangObject_False() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        JavaType t = TypeFactory.defaultInstance().constructType(String.class);
        assertFalse(b.useForType(t));
    }

    @Test
    public void testUseForType_ObjectAndNonConcrete_AbstractTrue() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        JavaType t = TypeFactory.defaultInstance().constructType(Number.class);
        assertTrue(b.useForType(t));
    }

    @Test
    public void testUseForType_ObjectAndNonConcrete_ConcreteFalse() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        JavaType t = TypeFactory.defaultInstance().constructType(String.class);
        assertFalse(b.useForType(t));
    }

    @Test
    public void testUseForType_ObjectAndNonConcrete_TreeNodeExcluded() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        JavaType t = TypeFactory.defaultInstance().constructType(JsonNode.class); // abstract but TreeNode
        assertFalse(b.useForType(t));
    }

    @Test
    public void testUseForType_NonConcreteAndArrays_ArrayContentAbstractTrue() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);
        JavaType t = TypeFactory.defaultInstance().constructType(Number[].class);
        assertTrue(b.useForType(t));
    }

    @Test
    public void testUseForType_NonConcreteAndArrays_ArrayContentConcreteFalse() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);
        JavaType t = TypeFactory.defaultInstance().constructType(String[].class);
        assertFalse(b.useForType(t));
    }

    @Test
    public void testUseForType_NonFinal_AbstractNonFinalTrue() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        JavaType t = TypeFactory.defaultInstance().constructType(Number.class);
        assertTrue(b.useForType(t));
    }

    @Test
    public void testUseForType_NonFinal_FinalClassFalse() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        JavaType t = TypeFactory.defaultInstance().constructType(String.class);
        assertFalse(b.useForType(t));
    }

    @Test
    public void testUseForType_NonFinal_ArrayUnwrapTrue() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        JavaType t = TypeFactory.defaultInstance().constructType(Number[].class);
        assertTrue(b.useForType(t));
    }

    @Test
    public void testUseForType_NonFinal_TreeNodeSubtypeFalse() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        // ObjectNode is not declared final but IS a TreeNode subtype
        JavaType t = TypeFactory.defaultInstance().constructType(ObjectNode.class);
        assertFalse(b.useForType(t));
    }

    // NOTE: Javadoc ([databind#1395]) mentions primitive types should be excluded from default
    // typing, but actual switch logic shown does not explicitly branch on isPrimitive().
    // These tests assert the documented expected outcome (false), which should hold true
    // regardless of whether an explicit primitive-check exists, since primitives are concrete&final.
    @Test
    public void testUseForType_ObjectAndNonConcrete_PrimitiveFalse() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        JavaType t = TypeFactory.defaultInstance().constructType(int.class);
        assertFalse(b.useForType(t));
    }

    @Test
    public void testUseForType_NonFinal_PrimitiveFalse() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        JavaType t = TypeFactory.defaultInstance().constructType(int.class);
        assertFalse(b.useForType(t));
    }

    @Test
    public void testBuildTypeSerializer_ReturnsNullWhenNotApplicable() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        b.init(JsonTypeInfo.Id.CLASS, null);
        b.inclusion(JsonTypeInfo.As.WRAPPER_ARRAY);
        JavaType t = TypeFactory.defaultInstance().constructType(String.class);
        TypeSerializer ts = b.buildTypeSerializer(mapper.getSerializationConfig(), t, null);
        assertNull(ts);
    }

    @Test
    public void testBuildTypeDeserializer_ReturnsNullWhenNotApplicable() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        b.init(JsonTypeInfo.Id.CLASS, null);
        b.inclusion(JsonTypeInfo.As.WRAPPER_ARRAY);
        JavaType t = TypeFactory.defaultInstance().constructType(String.class);
        TypeDeserializer td = b.buildTypeDeserializer(mapper.getDeserializationConfig(), t, null);
        assertNull(td);
    }

    /* ======================================================
     * Config override / type factory / node factory
     * ====================================================== */

    @Test
    public void testConfigOverrideCachesSameInstance() {
        MutableConfigOverride co1 = mapper.configOverride(Date.class);
        MutableConfigOverride co2 = mapper.configOverride(Date.class);
        assertNotNull(co1);
        assertSame(co1, co2);
    }

    @Test
    public void testTypeFactoryRoundTrip() {
        TypeFactory tf = mapper.getTypeFactory();
        assertNotNull(tf);
        ObjectMapper result = mapper.setTypeFactory(tf);
        assertSame(mapper, result);
        assertNotNull(mapper.constructType(String.class));
    }

    @Test
    public void testNodeFactoryRoundTrip() {
        JsonNodeFactory nf = mapper.getNodeFactory();
        assertNotNull(nf);
        ObjectMapper result = mapper.setNodeFactory(nf);
        assertSame(mapper, result);
    }

    /* ======================================================
     * Problem handlers / setConfig
     * ====================================================== */

    @Test
    public void testAddHandlerAndClearProblemHandlers() {
        DeserializationProblemHandler h = mock(DeserializationProblemHandler.class);
        ObjectMapper result = mapper.addHandler(h);
        assertSame(mapper, result);
        ObjectMapper result2 = mapper.clearProblemHandlers();
        assertSame(mapper, result2);
    }

    @Test
    public void testSetConfigDeserialization() {
        DeserializationConfig cfg = mapper.getDeserializationConfig();
        assertSame(mapper, mapper.setConfig(cfg));
    }

    @Test
    public void testSetConfigSerialization() {
        SerializationConfig cfg = mapper.getSerializationConfig();
        assertSame(mapper, mapper.setConfig(cfg));
    }

    /* ======================================================
     * Filters / Base64 / factory / date-format / handler-instantiator / injectable-values / locale-tz
     * ====================================================== */

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedSetFilters() {
        FilterProvider fp = mock(FilterProvider.class);
        mapper.setFilters(fp); // void, just ensure no exception
    }

    @Test
    public void testSetFilterProvider() {
        FilterProvider fp = mock(FilterProvider.class);
        assertSame(mapper, mapper.setFilterProvider(fp));
    }

    @Test
    public void testSetBase64Variant() {
        assertSame(mapper, mapper.setBase64Variant(Base64Variants.MIME));
    }

    @Test
    public void testGetFactoryAndDeprecatedGetJsonFactory() {
        assertNotNull(mapper.getFactory());
        assertSame(mapper.getFactory(), mapper.getJsonFactory());
    }

    @Test
    public void testDateFormatRoundTrip() {
        DateFormat df = mapper.getDateFormat();
        assertNotNull(df);
        assertSame(mapper, mapper.setDateFormat(df));
        assertSame(df, mapper.getDateFormat());
    }

    @Test
    public void testSetHandlerInstantiator() {
        HandlerInstantiator hi = mock(HandlerInstantiator.class);
        Object result = mapper.setHandlerInstantiator(hi);
        assertSame(mapper, result);
    }

    @Test
    public void testInjectableValuesRoundTrip() {
        InjectableValues iv = mock(InjectableValues.class);
        assertSame(mapper, mapper.setInjectableValues(iv));
        assertSame(iv, mapper.getInjectableValues());
    }

    @Test
    public void testSetLocale() {
        assertSame(mapper, mapper.setLocale(Locale.US));
    }

    @Test
    public void testSetTimeZone() {
        assertSame(mapper, mapper.setTimeZone(TimeZone.getTimeZone("UTC")));
    }

    /* ======================================================
     * MapperFeature
     * ====================================================== */

    @Test
    public void testMapperFeatureConfigureTrueFalseBranches() {
        mapper.configure(MapperFeature.USE_ANNOTATIONS, false);
        assertFalse(mapper.isEnabled(MapperFeature.USE_ANNOTATIONS));
        mapper.configure(MapperFeature.USE_ANNOTATIONS, true);
        assertTrue(mapper.isEnabled(MapperFeature.USE_ANNOTATIONS));
    }

    @Test
    public void testMapperFeatureEnableDisableVarargs() {
        mapper.enable(MapperFeature.USE_GETTERS_AS_SETTERS, MapperFeature.AUTO_DETECT_CREATORS);
        assertTrue(mapper.isEnabled(MapperFeature.USE_GETTERS_AS_SETTERS));
        mapper.disable(MapperFeature.USE_GETTERS_AS_SETTERS, MapperFeature.AUTO_DETECT_CREATORS);
        assertFalse(mapper.isEnabled(MapperFeature.USE_GETTERS_AS_SETTERS));
    }

    /* ======================================================
     * SerializationFeature
     * ====================================================== */

    @Test
    public void testSerializationFeatureConfigureTrueFalse() {
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        assertTrue(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
        mapper.configure(SerializationFeature.INDENT_OUTPUT, false);
        assertFalse(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
    }

    @Test
    public void testSerializationFeatureEnableSingle() {
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        assertTrue(mapper.isEnabled(SerializationFeature.WRAP_ROOT_VALUE));
    }

    @Test
    public void testSerializationFeatureEnableVarargs() {
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE, SerializationFeature.INDENT_OUTPUT);
        assertTrue(mapper.isEnabled(SerializationFeature.WRAP_ROOT_VALUE));
        assertTrue(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
    }

    @Test
    public void testSerializationFeatureDisableSingle() {
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        mapper.disable(SerializationFeature.WRAP_ROOT_VALUE);
        assertFalse(mapper.isEnabled(SerializationFeature.WRAP_ROOT_VALUE));
    }

    @Test
    public void testSerializationFeatureDisableVarargs() {
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE, SerializationFeature.INDENT_OUTPUT);
        mapper.disable(SerializationFeature.WRAP_ROOT_VALUE, SerializationFeature.INDENT_OUTPUT);
        assertFalse(mapper.isEnabled(SerializationFeature.WRAP_ROOT_VALUE));
        assertFalse(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
    }

    /* ======================================================
     * DeserializationFeature
     * ====================================================== */

    @Test
    public void testDeserializationFeatureConfigureTrueFalse() {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        assertFalse(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        assertTrue(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testDeserializationFeatureEnableSingle() {
        mapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        assertTrue(mapper.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS));
    }

    @Test
    public void testDeserializationFeatureEnableVarargs() {
        mapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS,
                DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertTrue(mapper.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS));
        assertTrue(mapper.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
    }

    @Test
    public void testDeserializationFeatureDisableSingle() {
        mapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        mapper.disable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        assertFalse(mapper.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS));
    }

    @Test
    public void testDeserializationFeatureDisableVarargs() {
        mapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS,
                DeserializationFeature.UNWRAP_ROOT_VALUE);
        mapper.disable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS,
                DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertFalse(mapper.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS));
        assertFalse(mapper.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
    }

    /* ======================================================
     * JsonParser.Feature / JsonGenerator.Feature / JsonFactory.Feature
     * ====================================================== */

    @Test
    public void testJsonParserFeatureConfigure() {
        mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        assertTrue(mapper.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
        mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, false);
        assertFalse(mapper.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testJsonParserFeatureEnableDisableVarargs() {
        mapper.enable(JsonParser.Feature.ALLOW_COMMENTS, JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        assertTrue(mapper.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
        assertTrue(mapper.isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES));
        mapper.disable(JsonParser.Feature.ALLOW_COMMENTS, JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        assertFalse(mapper.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
        assertFalse(mapper.isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES));
    }

    @Test
    public void testJsonGeneratorFeatureConfigure() {
        mapper.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false);
        assertFalse(mapper.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        mapper.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, true);
        assertTrue(mapper.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
    }

    @Test
    public void testJsonGeneratorFeatureEnableDisableVarargs() {
        mapper.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII, JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertTrue(mapper.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII));
        mapper.disable(JsonGenerator.Feature.ESCAPE_NON_ASCII, JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertFalse(mapper.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII));
    }

    @Test
    public void testJsonFactoryFeatureDelegatesToFactory() {
        boolean enabled = mapper.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES);
        assertEquals(mapper.getFactory().isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES), enabled);
    }

    /* ======================================================
     * readValue(...) family
     * ====================================================== */

    @Test
    public void testReadValueStringClass() throws Exception {
        Map<?, ?> m = mapper.readValue("{\"a\":1}", Map.class);
        assertEquals(1, m.size());
    }

    @Test(expected = JsonMappingException.class)
    public void testReadValueEmptyStringThrowsNoContent() throws Exception {
        mapper.readValue("", Map.class);
    }

    @Test
    public void testReadValueNullLiteralGivesJavaNull() throws Exception {
        String result = mapper.readValue("null", String.class);
        assertNull(result);
    }

    @Test
    public void testReadValueTypeReference() throws Exception {
        List<Integer> list = mapper.readValue("[1,2,3]", new TypeReference<List<Integer>>() {});
        assertEquals(3, list.size());
    }

    @Test
    public void testReadValueJavaType() throws Exception {
        JavaType t = mapper.constructType(Integer.class);
        Integer v = mapper.readValue("42", t);
        assertEquals(Integer.valueOf(42), v);
    }

    @Test
    public void testReadValueFile() throws Exception {
        File tmp = File.createTempFile("om-test", ".json");
        tmp.deleteOnExit();
        writeStringToFile(tmp, "{\"x\":5}");
        Map<?, ?> m = mapper.readValue(tmp, Map.class);
        assertEquals(5, ((Number) m.get("x")).intValue());
    }

    @Test
    public void testReadValueURL() throws Exception {
        File tmp = File.createTempFile("om-test-url", ".json");
        tmp.deleteOnExit();
        writeStringToFile(tmp, "{\"y\":7}");
        Map<?, ?> m = mapper.readValue(tmp.toURI().toURL(), Map.class);
        assertEquals(7, ((Number) m.get("y")).intValue());
    }

    @Test
    public void testReadValueReader() throws Exception {
        Map<?, ?> m = mapper.readValue(new StringReader("{\"z\":9}"), Map.class);
        assertEquals(9, ((Number) m.get("z")).intValue());
    }

    @Test
    public void testReadValueInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream("{\"a\":1}".getBytes("UTF-8"));
        Map<?, ?> m = mapper.readValue(in, Map.class);
        assertEquals(1, ((Number) m.get("a")).intValue());
    }

    @Test
    public void testReadValueBytes() throws Exception {
        byte[] data = "{\"a\":1}".getBytes("UTF-8");
        Map<?, ?> m = mapper.readValue(data, Map.class);
        assertEquals(1, ((Number) m.get("a")).intValue());
    }

    @Test
    public void testReadValueBytesOffsetLen() throws Exception {
        byte[] data = "XX{\"a\":1}YY".getBytes("UTF-8");
        // offset=2,len=7 -> exactly "{\"a\":1}"
        Map<?, ?> m = mapper.readValue(data, 2, 7, Map.class);
        assertEquals(1, ((Number) m.get("a")).intValue());
    }

    /* ======================================================
     * readTree(...) family
     * ====================================================== */

    @Test
    public void testReadTreeString() throws Exception {
        JsonNode n = mapper.readTree("{\"a\":1}");
        assertTrue(n.has("a"));
    }

    @Test
    public void testReadTreeStringNullLiteralReturnsNullNode() throws Exception {
        JsonNode n = mapper.readTree("null");
        assertTrue(n.isNull());
    }

    @Test
    public void testReadTreeInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream("[1,2]".getBytes("UTF-8"));
        assertTrue(mapper.readTree(in).isArray());
    }

    @Test
    public void testReadTreeReader() throws Exception {
        assertTrue(mapper.readTree(new StringReader("[1,2]")).isArray());
    }

    @Test
    public void testReadTreeBytes() throws Exception {
        assertTrue(mapper.readTree("[1,2]".getBytes("UTF-8")).isArray());
    }

    @Test
    public void testReadTreeFile() throws Exception {
        File tmp = File.createTempFile("om-tree", ".json");
        tmp.deleteOnExit();
        writeStringToFile(tmp, "{\"k\":\"v\"}");
        assertEquals("v", mapper.readTree(tmp).get("k").asText());
    }

    @Test
    public void testReadTreeURL() throws Exception {
        File tmp = File.createTempFile("om-tree-url", ".json");
        tmp.deleteOnExit();
        writeStringToFile(tmp, "{\"k\":\"v2\"}");
        assertEquals("v2", mapper.readTree(tmp.toURI().toURL()).get("k").asText());
    }

    @Test
    public void testReadTreeJsonParser_nullCurrentTokenAdvances() throws Exception {
        JsonParser p = mapper.getFactory().createParser("{\"a\":1}");
        JsonNode n = mapper.readTree(p); // current token null -> nextToken() advances
        assertNotNull(n);
        p.close();
    }

    @Test
    public void testReadTreeJsonParser_EOFReturnsJavaNull() throws Exception {
        JsonParser p = mapper.getFactory().createParser("");
        JsonNode n = mapper.readTree(p); // both getCurrentToken() and nextToken() are null
        assertNull(n);
        p.close();
    }

    /* ======================================================
     * readValues(...) family
     * ====================================================== */

    @Test
    public void testReadValuesJavaType() throws Exception {
        JsonParser p = mapper.getFactory().createParser("1 2 3");
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);
        List<Integer> out = new ArrayList<Integer>();
        while (it.hasNext()) {
            out.add(it.next());
        }
        assertEquals(Arrays.asList(1, 2, 3), out);
    }

    @Test
    public void testReadValuesTypeReference() throws Exception {
        JsonParser p = mapper.getFactory().createParser("1 2");
        MappingIterator<Integer> it = mapper.readValues(p, new TypeReference<Integer>() {});
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    /* ======================================================
     * writeValue(...) family
     * ====================================================== */

    @Test
    public void testWriteValueToGenerator() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator g = mapper.getFactory().createGenerator(sw);
        mapper.writeValue(g, Collections.singletonMap("a", 1));
        g.close();
        assertTrue(sw.toString().contains("\"a\""));
    }

    @Test
    public void testWriteValueAppliesIndentation() throws Exception {
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        StringWriter sw = new StringWriter();
        JsonGenerator g = mapper.getFactory().createGenerator(sw);
        mapper.writeValue(g, Collections.singletonMap("a", 1));
        g.close();
        assertTrue(sw.toString().contains("\n"));
    }

    @Test
    public void testWriteValueClosesCloseableWhenFeatureEnabled() throws Exception {
        mapper.configure(SerializationFeature.CLOSE_CLOSEABLE, true);
        StringWriter sw = new StringWriter();
        JsonGenerator g = mapper.getFactory().createGenerator(sw);
        final boolean[] closed = { false };
        CloseableBean bean = new CloseableBean(closed);
        mapper.writeValue(g, bean);
        g.close();
        assertTrue(closed[0]);
        assertTrue(sw.toString().contains("\"name\""));
    }

    @Test
    public void testWriteValueFile() throws Exception {
        File tmp = File.createTempFile("om-write", ".json");
        tmp.deleteOnExit();
        mapper.writeValue(tmp, Collections.singletonMap("a", 1));
        assertTrue(readFileToString(tmp).contains("\"a\""));
    }

    @Test
    public void testWriteValueOutputStream() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        mapper.writeValue(out, Collections.singletonMap("a", 1));
        assertTrue(out.toString("UTF-8").contains("\"a\""));
    }

    @Test
    public void testWriteValueWriter() throws Exception {
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, Collections.singletonMap("a", 1));
        assertTrue(sw.toString().contains("\"a\""));
    }

    @Test
    public void testWriteValueAsString() throws Exception {
        assertTrue(mapper.writeValueAsString(Collections.singletonMap("a", 1)).contains("\"a\""));
    }

    @Test
    public void testWriteValueAsBytes() throws Exception {
        byte[] b = mapper.writeValueAsBytes(Collections.singletonMap("a", 1));
        assertTrue(new String(b, "UTF-8").contains("\"a\""));
    }

    /* ======================================================
     * treeToValue / valueToTree
     * ====================================================== */

    @Test
    public void testTreeToValueCastShortcut() throws Exception {
        ObjectNode node = mapper.createObjectNode();
        node.put("x", 1);
        ObjectNode result = mapper.treeToValue(node, ObjectNode.class);
        assertSame(node, result);
    }

    @Test
    public void testTreeToValueNormalDeserializationPath() throws Exception {
        ObjectNode node = mapper.createObjectNode();
        node.put("value", 5);
        SimpleBean bean = mapper.treeToValue(node, SimpleBean.class);
        assertEquals(5, bean.value);
    }

    @Test
    public void testValueToTreeNullReturnsJavaNull() {
        assertNull(mapper.valueToTree(null));
    }

    @Test
    public void testValueToTreeNormal() {
        JsonNode n = mapper.valueToTree(Collections.singletonMap("a", 1));
        assertTrue(n.has("a"));
    }

    /* ======================================================
     * convertValue
     * ====================================================== */

    @Test
    public void testConvertValueNullReturnsJavaNull() {
        assertNull(mapper.convertValue(null, String.class));
    }

    @Test
    public void testConvertValueSimpleCastShortcut() {
        // targetType.isAssignableFrom(fromValue.getClass()) branch
        assertEquals("hello", mapper.convertValue("hello", String.class));
    }

    @Test
    public void testConvertValueActualConversionPath() {
        SimpleBean bean = new SimpleBean();
        bean.value = 9;
        Map<?, ?> map = mapper.convertValue(bean, Map.class);
        assertEquals(9, ((Number) map.get("value")).intValue());
    }

    /* ======================================================
     * canSerialize / canDeserialize
     * ====================================================== */

    @Test
    public void testCanSerialize() {
        assertTrue(mapper.canSerialize(String.class));
    }

    @Test
    public void testCanSerializeWithCause() {
        AtomicReference<Throwable> cause = new AtomicReference<Throwable>();
        assertTrue(mapper.canSerialize(String.class, cause));
    }

    @Test
    public void testCanDeserialize() {
        assertTrue(mapper.canDeserialize(mapper.constructType(String.class)));
    }

    @Test
    public void testCanDeserializeWithCause() {
        AtomicReference<Throwable> cause = new AtomicReference<Throwable>();
        assertTrue(mapper.canDeserialize(mapper.constructType(String.class), cause));
    }

    /* ======================================================
     * acceptJsonFormatVisitor
     * ====================================================== */

    @Test(expected = IllegalArgumentException.class)
    public void testAcceptJsonFormatVisitorNullTypeThrows() throws Exception {
        // NOTE: only the null-check branch is exercised here to avoid depending on
        // unverified interaction behavior of JsonFormatVisitorWrapper sub-visitors.
        mapper.acceptJsonFormatVisitor((JavaType) null, mock(JsonFormatVisitorWrapper.class));
    }

    /* ======================================================
     * writer(...) factory methods
     * ====================================================== */

    @Test
    public void testWriterBasic() {
        assertNotNull(mapper.writer());
    }

    @Test
    public void testWriterWithSingleFeature() {
        assertNotNull(mapper.writer(SerializationFeature.INDENT_OUTPUT));
    }

    @Test
    public void testWriterWithMultipleFeatures() {
        assertNotNull(mapper.writer(SerializationFeature.INDENT_OUTPUT, SerializationFeature.WRAP_ROOT_VALUE));
    }

    @Test
    public void testWriterWithDateFormat() {
        assertNotNull(mapper.writer(mapper.getDateFormat()));
    }

    @Test
    public void testWriterWithView() {
        assertNotNull(mapper.writerWithView(Object.class));
    }

    @Test
    public void testWriterForClassNonNullAndNull() {
        assertNotNull(mapper.writerFor(String.class));
        assertNotNull(mapper.writerFor((Class<?>) null));
    }

    @Test
    public void testWriterForTypeReferenceNonNullAndNull() {
        assertNotNull(mapper.writerFor(new TypeReference<String>() {}));
        assertNotNull(mapper.writerFor((TypeReference<?>) null));
    }

    @Test
    public void testWriterForJavaType() {
        assertNotNull(mapper.writerFor(mapper.constructType(String.class)));
    }

    @Test
    public void testWriterWithNullPrettyPrinterUsesMarker() {
        assertNotNull(mapper.writer((PrettyPrinter) null));
    }

    @Test
    public void testWriterWithNonNullPrettyPrinter() {
        assertNotNull(mapper.writer(mock(PrettyPrinter.class)));
    }

    @Test
    public void testWriterWithDefaultPrettyPrinter() {
        assertNotNull(mapper.writerWithDefaultPrettyPrinter());
    }

    @Test
    public void testWriterWithFilterProvider() {
        assertNotNull(mapper.writer(mock(FilterProvider.class)));
    }

    @Test
    public void testWriterWithNullFormatSchemaNoException() {
        assertNotNull(mapper.writer((FormatSchema) null));
    }

    @Test
    public void testWriterWithUnsupportedFormatSchemaThrows() {
        FormatSchema schema = mock(FormatSchema.class);
        try {
            mapper.writer(schema);
            fail("expected IllegalArgumentException for unsupported schema");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testWriterWithBase64Variant() {
        assertNotNull(mapper.writer(Base64Variants.MIME));
    }

    @Test
    public void testWriterWithCharacterEscapes() {
        assertNotNull(mapper.writer(mock(CharacterEscapes.class)));
    }

    @Test
    public void testWriterWithContextAttributes() {
        assertNotNull(mapper.writer(ContextAttributes.getEmpty()));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedWriterWithType() {
        assertNotNull(mapper.writerWithType(String.class));
        assertNotNull(mapper.writerWithType((Class<?>) null));
        assertNotNull(mapper.writerWithType(new TypeReference<String>() {}));
        assertNotNull(mapper.writerWithType((TypeReference<?>) null));
        assertNotNull(mapper.writerWithType(mapper.constructType(String.class)));
    }

    /* ======================================================
     * reader(...) factory methods
     * ====================================================== */

    @Test
    public void testReaderBasic() {
        assertNotNull(mapper.reader());
    }

    @Test
    public void testReaderWithSingleFeature() {
        assertNotNull(mapper.reader(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testReaderWithMultipleFeatures() {
        assertNotNull(mapper.reader(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.UNWRAP_ROOT_VALUE));
    }

    @Test
    public void testReaderForUpdating() {
        SimpleBean bean = new SimpleBean();
        assertNotNull(mapper.readerForUpdating(bean));
    }

    @Test
    public void testReaderForJavaType() {
        assertNotNull(mapper.readerFor(mapper.constructType(String.class)));
    }

    @Test
    public void testReaderForClass() {
        assertNotNull(mapper.readerFor(String.class));
    }

    @Test
    public void testReaderForTypeReference() {
        assertNotNull(mapper.readerFor(new TypeReference<String>() {}));
    }

    @Test
    public void testReaderWithNodeFactory() {
        assertNotNull(mapper.reader(mapper.getNodeFactory()));
    }

    @Test
    public void testReaderWithNullFormatSchemaNoException() {
        assertNotNull(mapper.reader((FormatSchema) null));
    }

    @Test
    public void testReaderWithUnsupportedFormatSchemaThrows() {
        FormatSchema schema = mock(FormatSchema.class);
        try {
            mapper.reader(schema);
            fail("expected IllegalArgumentException for unsupported schema");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testReaderWithInjectableValues() {
        assertNotNull(mapper.reader(mock(InjectableValues.class)));
    }

    @Test
    public void testReaderWithView() {
        assertNotNull(mapper.readerWithView(Object.class));
    }

    @Test
    public void testReaderWithBase64Variant() {
        assertNotNull(mapper.reader(Base64Variants.MIME));
    }

    @Test
    public void testReaderWithContextAttributes() {
        assertNotNull(mapper.reader(ContextAttributes.getEmpty()));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedReaderMethods() {
        assertNotNull(mapper.reader(mapper.constructType(String.class)));
        assertNotNull(mapper.reader(String.class));
        assertNotNull(mapper.reader(new TypeReference<String>() {}));
    }

    /* ======================================================
     * Helper methods & fixtures
     * ====================================================== */

    private static void writeStringToFile(File f, String content) throws IOException {
        FileWriter fw = new FileWriter(f);
        try {
            fw.write(content);
        } finally {
            fw.close();
        }
    }

    private static String readFileToString(File f) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader r = new BufferedReader(new FileReader(f));
        try {
            String line;
            while ((line = r.readLine()) != null) {
                sb.append(line);
            }
        } finally {
            r.close();
        }
        return sb.toString();
    }

    public static class SimpleBean {
        public int value;
    }

    /** Closeable POJO with one visible property so it is not treated as an "empty bean". */
    public static class CloseableBean implements Closeable {
        public String name = "x";
        private final boolean[] flag;

        public CloseableBean(boolean[] flag) {
            this.flag = flag;
        }

        @Override
        public void close() throws IOException {
            flag[0] = true;
        }
    }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| กลุ่มเมธอดเทส | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testDefaultConstructor`, `testConstructorWithFactory`, `testConstructorWithFactoryThatAlreadyHasCodec` | constructor `jf==null` / `jf!=null` และ `jf.getCodec()==null` / `!=null` |
| `testCopyPreservesConfig`, `testCopyInvalidSubclassThrows` | `copy()` ปกติ, `_checkInvalidCopy` เมื่อ `getClass()!=exp` |
| `testRegisterModuleNullNameThrows`, `testRegisterModuleNullVersionThrows`, `testRegisterModuleSuccessCallsSetupModule` | name==null throw, version==null throw, กรณีสำเร็จ |
| `testRegisterModuleTwiceWithoutIgnoreFeatureBothRegister` | `isEnabled(IGNORE_DUPLICATE...)==false` branch |
| `testRegisterModuleDuplicateIgnoredWhenFeatureEnabled` | `type