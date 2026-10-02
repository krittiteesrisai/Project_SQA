package com.fasterxml.jackson.databind.introspect;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonView;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

public class BasicBeanDescriptionTest
{
    // ====================================================================
    // Helper
    // ====================================================================

    private BasicBeanDescription introspectSer(Class<?> cls) {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(cls);
        BeanDescription bd = mapper.getSerializationConfig().introspect(type);
        return (BasicBeanDescription) bd;
    }

    private BasicBeanDescription introspectSer(ObjectMapper mapper, Class<?> cls) {
        JavaType type = mapper.constructType(cls);
        BeanDescription bd = mapper.getSerializationConfig().introspect(type);
        return (BasicBeanDescription) bd;
    }

    private BasicBeanDescription introspectDeser(Class<?> cls) {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(cls);
        BeanDescription bd = mapper.getDeserializationConfig().introspect(type);
        return (BasicBeanDescription) bd;
    }

    // ====================================================================
    // Test fixture POJOs
    // ====================================================================

    public static class SimpleBean {
        public String name;
        public int age;
        public String getName() { return name; }
        public void setName(String n) { this.name = n; }
        public int getAge() { return age; }
        public void setAge(int a) { this.age = a; }
    }

    public static class ValueBean {
        @JsonValue
        public int getV() { return 1; }
    }

    @JsonIgnoreProperties({"secret"})
    public static class IgnoreBean {
        public String visible;
        public String secret;
    }

    @JsonPropertyOrder({"b", "a"})
    public static class AnnotatedOrderBean {
        public String a;
        public String b;
    }

    public static class OneArgCtorBean {
        public final String v;
        public OneArgCtorBean(String v) { this.v = v; }
    }

    public static class ThrowingBean {
        // ASSUMPTION: AnnotatedClass registers zero-arg ctor as "default"
        // constructor regardless of visibility; fixAccess() makes it callable.
        private ThrowingBean() {
            throw new RuntimeException("boom");
        }
    }

    public static class AnySetterMethodOk {
        private final Map<String,Object> m = new java.util.HashMap<String,Object>();
        @JsonAnySetter
        public void setAny(String name, Object value) { m.put(name, value); }
    }

    public static class AnySetterMethodBad {
        @JsonAnySetter
        public void setAny(int key, Object value) { }
    }

    public static class AnySetterFieldOk {
        @JsonAnySetter
        public Map<String,Object> extra = new java.util.HashMap<String,Object>();
    }

    public static class AnySetterFieldBad {
        @JsonAnySetter
        public String extra;
    }

    public static class NoAnySetter {
        public String x;
    }

    public static class AnyGetterOk {
        @JsonAnyGetter
        public Map<String,Object> any() { return new java.util.HashMap<String,Object>(); }
    }

    public static class AnyGetterBad {
        @JsonAnyGetter
        public String any() { return "x"; }
    }

    public static class NoAnyGetter {
        public String x;
    }

    public static class ParentBean { public String id; }

    public static class NoBackRef {
        public String x;
    }

    public static class BackRefOk {
        public int id;
        @JsonBackReference
        public ParentBean parent;
    }

    public static class DuplicateBackRef {
        // ASSUMPTION: default JsonBackReference.value() == "defaultReference"
        // for both -> duplicate name -> exception
        @JsonBackReference
        public ParentBean p1;
        @JsonBackReference
        public ParentBean p2;
    }

    public static class NoFactoryBean {
        public NoFactoryBean() {}
        public String instanceMethod() { return "x"; }
    }

    public static class FactoryBean {
        public final String val;
        private FactoryBean(String val) { this.val = val; }
        @JsonCreator
        public static FactoryBean create(String v) { return new FactoryBean(v); }
        // wrong return type -> isFactoryMethod() false on first check
        public static String helper(String v) { return v; }
        // right return type but no annotation / name mismatch
        public static FactoryBean build(String v) { return new FactoryBean(v); }
    }

    public static class ValueOfBean {
        public final int v;
        private ValueOfBean(int v) { this.v = v; }
        public static ValueOfBean valueOf(String s) { return new ValueOfBean(Integer.parseInt(s)); }
    }

    public static class FromStringBean {
        public final String v;
        private FromStringBean(String v) { this.v = v; }
        public static FromStringBean fromString(String s) { return new FromStringBean(s); }
    }

    public static class FromStringBadBean {
        private FromStringBadBean(int x) {}
        public static FromStringBadBean fromString(int x) { return new FromStringBadBean(x); }
    }

    public static class FromStringCharSeqBean {
        private FromStringCharSeqBean(CharSequence s) {}
        public static FromStringCharSeqBean fromString(StringBuilder s) { return new FromStringCharSeqBean(s); }
    }

    public static class DisabledCreatorBean {
        private DisabledCreatorBean(String v) {}
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        public static DisabledCreatorBean weirdName(String v) { return new DisabledCreatorBean(v); }
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public static class FormattedBean { }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class InclBean { }

    public static class ViewA { }

    @JsonView(ViewA.class)
    public static class ViewedBean {
        public String x;
    }

    @JsonSerialize(converter = BasicBeanDescriptionTest.IdentityConverter.class)
    public static class ConvertedBean {
        public String value;
    }

    @JsonDeserialize(converter = BasicBeanDescriptionTest.IdentityConverter.class)
    public static class DeconvertedBean {
        public String value;
    }

    @JsonClassDescription("A described bean")
    public static class DescribedBean { }

    @JsonDeserialize(builder = BuilderBean.Builder.class)
    public static class BuilderBean {
        private final String name;
        BuilderBean(String name) { this.name = name; }
        @JsonPOJOBuilder(withPrefix = "with")
        public static class Builder {
            private String name;
            public Builder withName(String n) { this.name = n; return this; }
            public BuilderBean build() { return new BuilderBean(name); }
        }
    }

    @JacksonInject
    public static class _Dummy { } // placeholder, not used directly

    public static class InjectBean {
        @JacksonInject
        public String injected;
    }

    public static class IdentityConverter implements Converter<Object,Object> {
        @Override
        public Object convert(Object value) { return value; }
        @Override
        public JavaType getInputType(TypeFactory tf) { return tf.constructType(Object.class); }
        @Override
        public JavaType getOutputType(TypeFactory tf) { return tf.constructType(Object.class); }
    }

    // ====================================================================
    // removeProperty / addProperty / hasProperty / findProperty
    // ====================================================================

    @Test
    public void testRemoveProperty_foundAndNotFound() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        // branch: found -> remove, return true
        assertTrue(desc.removeProperty("name"));
        // branch: not found (already removed) -> false
        assertFalse(desc.removeProperty("name"));
        // branch: never existed -> false
        assertFalse(desc.removeProperty("doesNotExist"));
    }

    @Test
    public void testAddProperty_hasProperty_findProperty() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        PropertyName newName = new PropertyName("newProp");

        BeanPropertyDefinition def = mock(BeanPropertyDefinition.class);
        when(def.getFullName()).thenReturn(newName);
        when(def.hasName(any(PropertyName.class))).thenAnswer(inv ->
                newName.equals(inv.getArgument(0)));

        // not present yet -> hasProperty false, findProperty null
        assertFalse(desc.hasProperty(newName));
        assertNull(desc.findProperty(newName));

        // branch: hasProperty(def.getFullName()) == false -> add, return true
        assertTrue(desc.addProperty(def));
        assertTrue(desc.hasProperty(newName));
        assertSame(def, desc.findProperty(newName));

        // branch: hasProperty == true -> return false (duplicate)
        assertFalse(desc.addProperty(def));
    }

    // ====================================================================
    // Simple accessors
    // ====================================================================

    @Test
    public void testGetClassInfoAndObjectIdInfo() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        assertNotNull(desc.getClassInfo());
        // ObjectIdInfo not configured -> null by default
        assertNull(desc.getObjectIdInfo());
    }

    @Test
    public void testFindProperties() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        List<BeanPropertyDefinition> props = desc.findProperties();
        assertNotNull(props);
        assertEquals(2, props.size());
    }

    @Test
    public void testFindJsonValueMethodAndAccessor_present() {
        BasicBeanDescription desc = introspectSer(ValueBean.class);
        assertNotNull(desc.findJsonValueMethod());
        assertNotNull(desc.findJsonValueAccessor());
    }

    @Test
    public void testFindJsonValueMethodAndAccessor_absent() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        assertNull(desc.findJsonValueMethod());
        assertNull(desc.findJsonValueAccessor());
    }

    @Test
    public void testGetIgnoredPropertyNames_withAnnotation() {
        BasicBeanDescription desc = introspectSer(IgnoreBean.class);
        Set<String> ign = desc.getIgnoredPropertyNames();
        assertTrue(ign.contains("secret"));
    }

    @Test
    public void testGetIgnoredPropertyNames_withoutAnnotation() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        // branch: ign == null -> emptySet
        assertTrue(desc.getIgnoredPropertyNames().isEmpty());
    }

    @Test
    public void testHasKnownClassAnnotations_trueAndFalse() {
        BasicBeanDescription annotated = introspectSer(AnnotatedOrderBean.class);
        assertTrue(annotated.hasKnownClassAnnotations());
        assertTrue(annotated.getClassAnnotations().has(JsonPropertyOrder.class));

        BasicBeanDescription plain = introspectSer(SimpleBean.class);
        assertFalse(plain.hasKnownClassAnnotations());
    }

    @Test
    public void testBindingsForBeanType() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        assertNotNull(desc.bindingsForBeanType());
    }

    @Test
    public void testResolveType() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        // branch: jdkType == null -> null
        assertNull(desc.resolveType(null));
        // branch: jdkType != null -> JavaType
        JavaType jt = desc.resolveType(String.class);
        assertNotNull(jt);
        assertEquals(String.class, jt.getRawClass());
    }

    // ====================================================================
    // findDefaultConstructor / getConstructors / instantiateBean
    // ====================================================================

    @Test
    public void testFindDefaultConstructor_present() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        assertNotNull(desc.findDefaultConstructor());
    }

    @Test
    public void testFindDefaultConstructor_absent() {
        BasicBeanDescription desc = introspectSer(OneArgCtorBean.class);
        assertNull(desc.findDefaultConstructor());
    }

    @Test
    public void testGetConstructors() {
        BasicBeanDescription desc = introspectSer(OneArgCtorBean.class);
        assertEquals(1, desc.getConstructors().size());
    }

    @Test
    public void testInstantiateBean_success() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        Object o = desc.instantiateBean(false);
        assertNotNull(o);
        assertTrue(o instanceof SimpleBean);

        Object o2 = desc.instantiateBean(true);
        assertNotNull(o2);
    }

    @Test
    public void testInstantiateBean_noDefaultCtor_returnsNull() {
        BasicBeanDescription desc = introspectSer(OneArgCtorBean.class);
        // branch: ac == null -> return null
        assertNull(desc.instantiateBean(false));
    }

    @Test
    public void testInstantiateBean_privateCtor_fixAccessFalse_throwsWrapped() {
        BasicBeanDescription desc = introspectSer(ThrowingBean.class);
        try {
            desc.instantiateBean(false);
            fail("Expected IllegalArgumentException (wrapped IllegalAccessException)");
        } catch (IllegalArgumentException e) {
            // expected: wrapped, since original cause is not RuntimeException/Error
        }
    }

    @Test
    public void testInstantiateBean_privateCtor_fixAccessTrue_rethrowsRuntime() {
        BasicBeanDescription desc = introspectSer(ThrowingBean.class);
        try {
            desc.instantiateBean(true);
            fail("Expected RuntimeException('boom') re-thrown as-is");
        } catch (RuntimeException e) {
            assertEquals("boom", e.getMessage());
        }
    }

    // ====================================================================
    // findMethod
    // ====================================================================

    @Test
    public void testFindMethod() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        assertNotNull(desc.findMethod("getName", new Class<?>[0]));
        assertNull(desc.findMethod("noSuchMethod", new Class<?>[0]));
    }

    // ====================================================================
    // findExpectedFormat
    // ====================================================================

    @Test
    public void testFindExpectedFormat_withAnnotation() {
        BasicBeanDescription desc = introspectSer(FormattedBean.class);
        JsonFormat.Value v = desc.findExpectedFormat(null);
        assertNotNull(v);
        assertEquals(JsonFormat.Shape.STRING, v.getShape());
    }

    @Test
    public void testFindExpectedFormat_withoutAnnotation() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        assertNull(desc.findExpectedFormat(null));
    }

    // ====================================================================
    // findDefaultViews
    // ====================================================================

    @Test
    public void testFindDefaultViews_noAnnotation_featureEnabledDefault() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        // ASSUMPTION: MapperFeature.DEFAULT_VIEW_INCLUSION is enabled by default
        assertNull(desc.findDefaultViews());
    }

    @Test
    public void testFindDefaultViews_withAnnotation() {
        BasicBeanDescription desc = introspectSer(ViewedBean.class);
        Class<?>[] views = desc.findDefaultViews();
        assertNotNull(views);
        assertEquals(1, views.length);
        assertEquals(ViewA.class, views[0]);
    }

    @Test
    public void testFindDefaultViews_featureDisabled_noAnnotation() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION);
        BasicBeanDescription desc = introspectSer(mapper, SimpleBean.class);
        Class<?>[] views = desc.findDefaultViews();
        assertNotNull(views);
        assertEquals(0, views.length);
    }

    @Test
    public void testFindDefaultViews_cached() {
        BasicBeanDescription desc = introspectSer(ViewedBean.class);
        Class<?>[] first = desc.findDefaultViews();
        Class<?>[] second = desc.findDefaultViews();
        // branch: _defaultViewsResolved true on 2nd call -> returns cached field
        assertSame(first, second);
    }

    // ====================================================================
    // findPropertyInclusion
    // ====================================================================

    @Test
    public void testFindPropertyInclusion_withAnnotation() {
        BasicBeanDescription desc = introspectSer(InclBean.class);
        JsonInclude.Value v = desc.findPropertyInclusion(null);
        assertNotNull(v);
        assertEquals(JsonInclude.Include.NON_NULL, v.getValueInclusion());
    }

    @Test
    public void testFindPropertyInclusion_withoutAnnotation() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        assertNull(desc.findPropertyInclusion(null));
    }

    // ====================================================================
    // findAnyGetter
    // ====================================================================

    @Test
    public void testFindAnyGetter_ok() {
        BasicBeanDescription desc = introspectSer(AnyGetterOk.class);
        assertNotNull(desc.findAnyGetter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindAnyGetter_badType_throws() {
        BasicBeanDescription desc = introspectSer(AnyGetterBad.class);
        desc.findAnyGetter();
    }

    @Test
    public void testFindAnyGetter_absent() {
        BasicBeanDescription desc = introspectSer(NoAnyGetter.class);
        assertNull(desc.findAnyGetter());
    }

    // ====================================================================
    // findAnySetterAccessor
    // ====================================================================

    @Test
    public void testFindAnySetterAccessor_methodOk() {
        BasicBeanDescription desc = introspectSer(AnySetterMethodOk.class);
        assertNotNull(desc.findAnySetterAccessor());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindAnySetterAccessor_methodBadType_throws() {
        BasicBeanDescription desc = introspectSer(AnySetterMethodBad.class);
        desc.findAnySetterAccessor();
    }

    @Test
    public void testFindAnySetterAccessor_fieldOk() {
        BasicBeanDescription desc = introspectSer(AnySetterFieldOk.class);
        assertNotNull(desc.findAnySetterAccessor());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindAnySetterAccessor_fieldBadType_throws() {
        BasicBeanDescription desc = introspectSer(AnySetterFieldBad.class);
        desc.findAnySetterAccessor();
    }

    @Test
    public void testFindAnySetterAccessor_absent() {
        BasicBeanDescription desc = introspectSer(NoAnySetter.class);
        assertNull(desc.findAnySetterAccessor());
    }

    // ====================================================================
    // findInjectables
    // ====================================================================

    @Test
    public void testFindInjectables() {
        BasicBeanDescription withInject = introspectSer(InjectBean.class);
        assertEquals(1, withInject.findInjectables().size());

        BasicBeanDescription without = introspectSer(SimpleBean.class);
        assertTrue(without.findInjectables().isEmpty());
        // NOTE: branch "_propCollector == null -> emptyMap()" not exercised;
        // not reachable via public API without risking incorrect assumptions.
    }

    // ====================================================================
    // findBackReferences / findBackReferenceProperties
    // ====================================================================

    @Test
    public void testFindBackReferences_none() {
        BasicBeanDescription desc = introspectSer(NoBackRef.class);
        assertNull(desc.findBackReferences());
        assertNull(desc.findBackReferenceProperties());
    }

    @Test
    public void testFindBackReferences_single() {
        BasicBeanDescription desc = introspectSer(BackRefOk.class);
        List<BeanPropertyDefinition> refs = desc.findBackReferences();
        assertNotNull(refs);
        assertEquals(1, refs.size());

        Map<String,AnnotatedMember> map = desc.findBackReferenceProperties();
        assertNotNull(map);
        assertEquals(1, map.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindBackReferences_duplicateName_throws() {
        BasicBeanDescription desc = introspectSer(DuplicateBackRef.class);
        desc.findBackReferences();
    }

    // ====================================================================
    // getFactoryMethods / findFactoryMethod / isFactoryMethod (indirectly)
    // ====================================================================

    @Test
    public void testGetFactoryMethods_emptyCandidates() {
        BasicBeanDescription desc = introspectSer(NoFactoryBean.class);
        // branch: candidates.isEmpty() -> return candidates directly
        assertTrue(desc.getFactoryMethods().isEmpty());
    }

    @Test
    public void testGetFactoryMethods_onlyAnnotatedQualifies() {
        BasicBeanDescription desc = introspectSer(FactoryBean.class);
        List<AnnotatedMethod> methods = desc.getFactoryMethods();
        assertEquals(1, methods.size());
        assertEquals("create", methods.get(0).getName());
    }

    @Test
    public void testGetFactoryMethods_valueOf() {
        BasicBeanDescription desc = introspectSer(ValueOfBean.class);
        List<AnnotatedMethod> methods = desc.getFactoryMethods();
        assertEquals(1, methods.size());
        assertEquals("valueOf", methods.get(0).getName());
    }

    @Test
    public void testGetFactoryMethods_fromStringTrue() {
        BasicBeanDescription desc = introspectSer(FromStringBean.class);
        assertEquals(1, desc.getFactoryMethods().size());
    }

    @Test
    public void testGetFactoryMethods_fromStringBad_paramType() {
        BasicBeanDescription desc = introspectSer(FromStringBadBean.class);
        assertTrue(desc.getFactoryMethods().isEmpty());
    }

    @Test
    public void testGetFactoryMethods_fromStringCharSequence() {
        BasicBeanDescription desc = introspectSer(FromStringCharSeqBean.class);
        assertEquals(1, desc.getFactoryMethods().size());
    }

    @Test
    public void testGetFactoryMethods_disabledCreatorMode() {
        BasicBeanDescription desc = introspectSer(DisabledCreatorBean.class);
        assertTrue(desc.getFactoryMethods().isEmpty());
    }

    @Test
    public void testFindSingleArgConstructor() {
        BasicBeanDescription desc = introspectSer(FactoryBean.class);
        assertNotNull(desc.findSingleArgConstructor(String.class));
        assertNull(desc.findSingleArgConstructor(Integer.class));
    }

    @Test
    public void testFindFactoryMethod() {
        BasicBeanDescription desc = introspectSer(FactoryBean.class);
        Method m = desc.findFactoryMethod(String.class);
        assertNotNull(m);
        assertEquals("create", m.getName());
        assertNull(desc.findFactoryMethod(Integer.class));
    }

    // ====================================================================
    // findPOJOBuilder / findPOJOBuilderConfig
    // ====================================================================

    @Test
    public void testFindPOJOBuilder_present() {
        BasicBeanDescription desc = introspectDeser(BuilderBean.class);
        assertEquals(BuilderBean.Builder.class, desc.findPOJOBuilder());
        JsonPOJOBuilder.Value cfg = desc.findPOJOBuilderConfig();
        assertNotNull(cfg);
        assertEquals("with", cfg.withPrefix);
    }

    @Test
    public void testFindPOJOBuilder_absent() {
        BasicBeanDescription desc = introspectDeser(SimpleBean.class);
        assertNull(desc.findPOJOBuilder());
    }

    // ====================================================================
    // findSerializationConverter / findDeserializationConverter
    // ====================================================================

    @Test
    public void testFindSerializationConverter_present() {
        BasicBeanDescription desc = introspectSer(ConvertedBean.class);
        assertNotNull(desc.findSerializationConverter());
    }

    @Test
    public void testFindSerializationConverter_absent() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        assertNull(desc.findSerializationConverter());
    }

    @Test
    public void testFindDeserializationConverter_present() {
        BasicBeanDescription desc = introspectDeser(DeconvertedBean.class);
        assertNotNull(desc.findDeserializationConverter());
    }

    @Test
    public void testFindDeserializationConverter_absent() {
        BasicBeanDescription desc = introspectDeser(SimpleBean.class);
        assertNull(desc.findDeserializationConverter());
    }

    // ====================================================================
    // findClassDescription
    // ====================================================================

    @Test
    public void testFindClassDescription() {
        BasicBeanDescription desc = introspectSer(DescribedBean.class);
        assertEquals("A described bean", desc.findClassDescription());

        BasicBeanDescription plain = introspectSer(SimpleBean.class);
        assertNull(plain.findClassDescription());
    }

    // ====================================================================
    // _findPropertyFields (deprecated, public method)
    // ====================================================================

    @Test
    public void testFindPropertyFields_withAndWithoutIgnore() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);

        Map<String,AnnotatedField> allFields = desc._findPropertyFields(null, true);
        assertTrue(allFields.containsKey("name"));
        assertTrue(allFields.containsKey("age"));

        Map<String,AnnotatedField> filtered = desc._findPropertyFields(
                java.util.Collections.singletonList("age"), true);
        assertTrue(filtered.containsKey("name"));
        assertFalse(filtered.containsKey("age"));
    }

    // ====================================================================
    // _createConverter (protected, direct access -- same package)
    // ====================================================================

    @Test
    public void testCreateConverter_null() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        assertNull(desc._createConverter(null));
    }

    @Test
    public void testCreateConverter_directInstance() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        IdentityConverter inst = new IdentityConverter();
        Object result = desc._createConverter(inst);
        assertSame(inst, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateConverter_notClassNorConverter_throws() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        desc._createConverter("not a class or converter");
    }

    @Test
    public void testCreateConverter_noneMarkerClass_returnsNull() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        assertNull(desc._createConverter(Converter.None.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateConverter_classNotConverter_throws() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        desc._createConverter(String.class);
    }

    @Test
    public void testCreateConverter_classImplementingConverter_createsInstance() {
        BasicBeanDescription desc = introspectSer(SimpleBean.class);
        Object result = desc._createConverter(IdentityConverter.class);
        assertNotNull(result);
        assertTrue(result instanceof IdentityConverter);
        // NOTE: HandlerInstantiator (hi != null) branch not tested here --
        // exact abstract method signatures of HandlerInstantiator for this
        // Jackson version are not confirmed from given source; skipped to
        // avoid guessing behavior not shown in source.
    }
}
