package com.fasterxml.jackson.databind.introspect;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.util.Converter;

@SuppressWarnings({"unchecked", "rawtypes", "deprecation"})
@RunWith(PowerMockRunner.class)
@PrepareForTest({AnnotatedClass.class, AnnotatedMethod.class})
public class JacksonAnnotationIntrospectorTest {

    private final JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
    private final ObjectMapper mapper = new ObjectMapper();

    // =====================================================================
    // Mock helpers
    // =====================================================================

    /** copy annotations from real reflective element onto mock's getAnnotation/hasAnnotation */
    private static void stub(Annotated mockAnn, AnnotatedElement source) {
        for (Annotation a : source.getAnnotations()) {
            Class<? extends Annotation> t = a.annotationType();
            doReturn(a).when(mockAnn).getAnnotation((Class) t);
            doReturn(Boolean.TRUE).when(mockAnn).hasAnnotation((Class) t);
        }
    }

    // AnnotatedClass : concrete/final -> PowerMockito
    private AnnotatedClass mockClass(Class<?> holder) {
        AnnotatedClass ac = PowerMockito.mock(AnnotatedClass.class);
        stub(ac, holder);
        return ac;
    }

    // AnnotatedMember : abstract -> plain Mockito
    private AnnotatedMember mockMember(AnnotatedElement holder) {
        AnnotatedMember m = Mockito.mock(AnnotatedMember.class);
        stub(m, holder);
        return m;
    }

    // AnnotatedMethod : concrete/final -> PowerMockito
    private AnnotatedMethod mockMethodEl(AnnotatedElement holder) {
        AnnotatedMethod m = PowerMockito.mock(AnnotatedMethod.class);
        stub(m, holder);
        return m;
    }

    // Annotated : abstract -> plain Mockito
    private Annotated mockAnnotated(AnnotatedElement holder) {
        Annotated a = Mockito.mock(Annotated.class);
        stub(a, holder);
        return a;
    }

    private static Field f(Class<?> c, String name) {
        try { return c.getDeclaredField(name); } catch (Exception e) { throw new RuntimeException(e); }
    }

    private static Method m(Class<?> c, String name, Class<?>... params) {
        try { return c.getDeclaredMethod(name, params); } catch (Exception e) { throw new RuntimeException(e); }
    }

    // =====================================================================
    // Fixtures
    // =====================================================================

    @Retention(RetentionPolicy.RUNTIME)
    @interface PlainMarker {}

    @Retention(RetentionPolicy.RUNTIME)
    @JacksonAnnotationsInside
    @interface BundleMarker {}

    @PlainMarker
    static class PlainHolder {}

    @BundleMarker
    static class BundleHolder {}

    enum Color {
        RED,
        @JsonProperty("green-color") GREEN,
        @JsonProperty("") BLUE
    }

    @JsonRootName(value = "root", namespace = "ns")
    static class RootNameHolder {}
    @JsonRootName(value = "root2", namespace = "")
    static class RootNameEmptyNsHolder {}
    static class NoRootNameHolder {}

    @JsonIgnoreProperties(value = {"a", "b"}, ignoreUnknown = true, allowGetters = true, allowSetters = false)
    static class IgnorePropsHolder {}
    static class NoIgnorePropsHolder {}

    @JsonIgnoreType(true)
    static class IgnoreTypeHolder {}
    static class NoIgnoreTypeHolder {}

    @JsonFilter("myFilter")
    static class FilterHolder {}
    @JsonFilter("")
    static class FilterEmptyHolder {}
    static class NoFilterHolder {}

    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    static class NamingHolder {}
    static class NoNamingHolder {}

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    static class AutoDetectHolder {}
    static class NoAutoDetectHolder {}

    static class MemberAnnHolder {
        @JsonIgnore(true) public Object ignoredTrue;
        @JsonIgnore(false) public Object ignoredFalse;
        public Object notIgnored;

        @JsonProperty(required = true) public Object reqTrue;
        @JsonProperty(required = false) public Object reqFalse;
        public Object noReq;

        @JsonProperty(access = JsonProperty.Access.READ_ONLY) public Object accessRO;
        public Object noAccess;

        @JsonPropertyDescription("desc") public Object described;
        public Object noDesc;

        @JsonProperty(index = 5) public Object idx5;
        @JsonProperty public Object idxUnknown;

        @JsonProperty(defaultValue = "42") public Object defVal;
        @JsonProperty(defaultValue = "") public Object defValEmpty;

        @JsonFormat(pattern = "yyyy") public Object fmt;
        public Object noFmt;

        @JsonManagedReference public Object managedRef;
        @JsonBackReference public Object backRef;
        public Object noRef;

        @JsonUnwrapped(enabled = true, prefix = "p_", suffix = "_s") public Object unwrappedOn;
        @JsonUnwrapped(enabled = false) public Object unwrappedOff;
        public Object noUnwrap;

        @JacksonInject("myId") public Object injectExplicit;
        @JacksonInject public Object injectEmpty;
        public Object noInject;

        @JsonView(String.class) public Object viewed;
        public Object noView;

        @JsonTypeId public Object typeId;
        public Object noTypeId;
    }

    static class Dog {}
    static class Cat {}
    @JsonSubTypes({ @JsonSubTypes.Type(value = Dog.class, name = "dog"),
                     @JsonSubTypes.Type(value = Cat.class, name = "cat") })
    static class SubTypesHolder {}
    static class NoSubTypesHolder {}

    @JsonTypeName("myType")
    static class TypeNameHolder {}
    static class NoTypeNameHolder {}

    @JsonIdentityInfo(generator = ObjectIdGenerators.None.class)
    static class ObjIdNoneHolder {}
    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    static class ObjIdSeqHolder {}
    static class NoObjIdHolder {}

    @JsonIdentityReference(alwaysAsId = true)
    static class RefInfoHolder {}
    static class NoRefInfoHolder {}

    static class CustomSer extends JsonSerializer<Object> {
        @Override public void serialize(Object value, com.fasterxml.jackson.core.JsonGenerator g,
                SerializerProvider p) { }
    }
    static class CustomDeser extends JsonDeserializer<Object> {
        @Override public Object deserialize(com.fasterxml.jackson.core.JsonParser p,
                DeserializationContext ctxt) { return null; }
    }
    static class CustomKeyDeser extends KeyDeserializer {
        @Override public Object deserializeKey(String key, DeserializationContext ctxt) { return null; }
    }
    static class ConvImpl implements Converter<Object, Object> {
        @Override public Object convert(Object value) { return value; }
        @Override public JavaType getInputType(com.fasterxml.jackson.databind.type.TypeFactory tf) { return null; }
        @Override public JavaType getOutputType(com.fasterxml.jackson.databind.type.TypeFactory tf) { return null; }
    }

    static class SerHolder {
        @JsonSerialize(using = CustomSer.class) public Object usingSet;
        @JsonSerialize(keyUsing = CustomSer.class) public Object keyUsingSet;
        @JsonSerialize(contentUsing = CustomSer.class) public Object contentUsingSet;
        @JsonSerialize(nullsUsing = CustomSer.class) public Object nullsUsingSet;
        @JsonRawValue(true) public Object rawTrue;
        @JsonRawValue(false) public Object rawFalse;
        @JsonSerialize(as = Integer.class, keyAs = Long.class, contentAs = Double.class) public Object typesSet;
        @JsonSerialize() public Object typesBogus;
        @JsonSerialize(typing = JsonSerialize.Typing.STATIC) public Object typingSet;
        @JsonSerialize(converter = ConvImpl.class, contentConverter = ConvImpl.class) public Object convSet;
        @JsonSerialize() public Object convDefault;
        public Object none;
    }

    static class InclHolder {
        @JsonInclude(value = JsonInclude.Include.ALWAYS) public Object overrideAlways;
        @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
        @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL) public Object fallbackNonNull;
        @JsonSerialize(include = JsonSerialize.Inclusion.ALWAYS) public Object serAlways;
        @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL) public Object serNonNull;
        @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT) public Object serNonDefault;
        @JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY) public Object serNonEmpty;
        @JsonSerialize(include = JsonSerialize.Inclusion.DEFAULT_INCLUSION) public Object serDefault;
        public Object neither;
        @JsonInclude(content = JsonInclude.Include.NON_NULL) public Object contentSet;
        @JsonInclude(content = JsonInclude.Include.USE_DEFAULTS) public Object contentDefault;
        @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.NON_EMPTY) public Object propInclBoth;
        @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS, content = JsonInclude.Include.USE_DEFAULTS)
        @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT) public Object propInclFallback;
    }

    @JsonPropertyOrder({"a", "b"})
    static class OrderHolder {}
    static class NoOrderHolder {}

    @JsonPropertyOrder(alphabetic = true)
    static class AlphaTrueHolder {}
    @JsonPropertyOrder(alphabetic = false)
    static class AlphaFalseHolder {}
    static class NoAlphaHolder {}

    @JsonAppend
    static class AppendHolder {}
    static class NoAppendHolder {}

    static class NameSerHolder {
        @JsonGetter("g") @JsonProperty("p") public Object both;
        @JsonProperty("propOnly") public Object propOnly;
        @JsonSerialize public Object viaSerialize;
        public Object none;
    }
    static class NameDeserHolder {
        @JsonSetter("s") @JsonProperty("p") public Object both;
        @JsonProperty("propOnly") public Object propOnly;
        @JsonUnwrapped public Object viaUnwrapped;
        public Object none;
    }

    static class ValueHolder {
        @JsonValue(true) public Object a() { return null; }
        @JsonValue(false) public Object b() { return null; }
        public Object c() { return null; }
    }

    static class DeserHolder {
        @JsonDeserialize(using = CustomDeser.class) public Object usingSet;
        @JsonDeserialize(keyUsing = CustomKeyDeser.class) public Object keyUsingSet;
        @JsonDeserialize(contentUsing = CustomDeser.class) public Object contentUsingSet;
        @JsonDeserialize(as = Integer.class, keyAs = Long.class, contentAs = Double.class) public Object typesSet;
        @JsonDeserialize() public Object typesBogus;
        @JsonDeserialize(converter = ConvImpl.class, contentConverter = ConvImpl.class) public Object convSet;
        @JsonDeserialize() public Object convDefault;
        public Object none;
    }

    @JsonValueInstantiator(com.fasterxml.jackson.databind.deser.ValueInstantiator.class)
    static class ValueInstHolder {}
    static class NoValueInstHolder {}

    static class Builder {}
    @JsonDeserialize(builder = Builder.class)
    static class PojoBuilderHolder {}
    static class NoPojoBuilderHolder {}

    @JsonPOJOBuilder(buildMethodName = "create", withPrefix = "with")
    static class PojoBuilderConfigHolder {}
    static class NoPojoBuilderConfigHolder {}

    static class AnyHolder {
        @JsonAnySetter public void setAny(String k, Object v) {}
        @JsonAnyGetter public Map<String, Object> getAny() { return null; }
        public void plain(String k, Object v) {}
    }

    static class CreatorHolder {
        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES) CreatorHolder() {}
    }
    static class CreatorDisabledHolder {
        @JsonCreator(mode = JsonCreator.Mode.DISABLED) CreatorDisabledHolder() {}
    }
    static class NoCreatorHolder { NoCreatorHolder() {} }

    static class MyTypeResolverBuilder extends StdTypeResolverBuilder {}

    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@type")
    static class StdInfoHolder {}

    @JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
    static class NoneInfoHolder {}

    @JsonTypeResolver(MyTypeResolverBuilder.class)
    static class ResolverOnlyHolder {}

    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@type")
    @JsonTypeResolver(MyTypeResolverBuilder.class)
    static class CustomResolverHolder {}

    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
    static class ExternalOnClassHolder {}

    static class PlainTypeHolder {}

    // =====================================================================
    // Tests
    // =====================================================================

    // ---- isAnnotationBundle ----
    @Test
    public void isAnnotationBundle_true() {
        Annotation ann = BundleHolder.class.getAnnotation(BundleMarker.class);
        assertTrue(ai.isAnnotationBundle(ann));
    }

    @Test
    public void isAnnotationBundle_false() {
        Annotation ann = PlainHolder.class.getAnnotation(PlainMarker.class);
        assertFalse(ai.isAnnotationBundle(ann));
    }

    // ---- findEnumValue ----
    @Test
    public void findEnumValue_noAnnotation_returnsName() {
        assertEquals("RED", ai.findEnumValue(Color.RED));
    }

    @Test
    public void findEnumValue_withNonEmptyOverride() {
        assertEquals("green-color", ai.findEnumValue(Color.GREEN));
    }

    @Test
    public void findEnumValue_withEmptyOverride_fallsBackToName() {
        assertEquals("BLUE", ai.findEnumValue(Color.BLUE));
    }

    // ---- findRootName ----
    @Test
    public void findRootName_withNamespace() {
        PropertyName pn = ai.findRootName(mockClass(RootNameHolder.class));
        assertEquals("root", pn.getSimpleName());
        assertEquals("ns", pn.getNamespace());
    }

    @Test
    public void findRootName_emptyNamespaceBecomesNull() {
        PropertyName pn = ai.findRootName(mockClass(RootNameEmptyNsHolder.class));
        assertNull(pn.getNamespace());
    }

    @Test
    public void findRootName_noAnnotation_returnsNull() {
        assertNull(ai.findRootName(mockClass(NoRootNameHolder.class)));
    }

    // ---- findPropertiesToIgnore (deprecated 1-arg) ----
    @Test
    public void findPropertiesToIgnoreDeprecated_withAnnotation() {
        String[] r = ai.findPropertiesToIgnore(mockAnnotated(IgnorePropsHolder.class));
        assertArrayEquals(new String[]{"a", "b"}, r);
    }

    @Test
    public void findPropertiesToIgnoreDeprecated_noAnnotation() {
        assertNull(ai.findPropertiesToIgnore(mockAnnotated(NoIgnorePropsHolder.class)));
    }

    // ---- findPropertiesToIgnore (2-arg) ----
    @Test
    public void findPropertiesToIgnore_forSerialization_allowGetters_returnsNull() {
        // annotation allowGetters=true -> forSerialization branch returns null
        assertNull(ai.findPropertiesToIgnore(mockAnnotated(IgnorePropsHolder.class), true));
    }

    @Test
    public void findPropertiesToIgnore_forDeserialization_allowSettersFalse_returnsArray() {
        // allowSetters=false -> forSerialization=false branch does NOT return null
        String[] r = ai.findPropertiesToIgnore(mockAnnotated(IgnorePropsHolder.class), false);
        assertArrayEquals(new String[]{"a", "b"}, r);
    }

    @Test
    public void findPropertiesToIgnore_noAnnotation_returnsNull() {
        assertNull(ai.findPropertiesToIgnore(mockAnnotated(NoIgnorePropsHolder.class), true));
    }

    // ---- findIgnoreUnknownProperties ----
    @Test
    public void findIgnoreUnknownProperties_with() {
        assertTrue(ai.findIgnoreUnknownProperties(mockClass(IgnorePropsHolder.class)));
    }

    @Test
    public void findIgnoreUnknownProperties_without() {
        assertNull(ai.findIgnoreUnknownProperties(mockClass(NoIgnorePropsHolder.class)));
    }

    // ---- isIgnorableType ----
    @Test
    public void isIgnorableType_with() {
        assertTrue(ai.isIgnorableType(mockClass(IgnoreTypeHolder.class)));
    }

    @Test
    public void isIgnorableType_without() {
        assertNull(ai.isIgnorableType(mockClass(NoIgnoreTypeHolder.class)));
    }

    // ---- findFilterId ----
    @Test
    public void findFilterIdDeprecated_delegatesSameAsAnnotated() {
        assertEquals("myFilter", ai.findFilterId((AnnotatedClass) mockClass(FilterHolder.class)));
    }

    @Test
    public void findFilterId_nonEmpty() {
        assertEquals("myFilter", ai.findFilterId(mockAnnotated(FilterHolder.class)));
    }

    @Test
    public void findFilterId_empty_returnsNull() {
        assertNull(ai.findFilterId(mockAnnotated(FilterEmptyHolder.class)));
    }

    @Test
    public void findFilterId_noAnnotation_returnsNull() {
        assertNull(ai.findFilterId(mockAnnotated(NoFilterHolder.class)));
    }

    // ---- findNamingStrategy ----
    @Test
    public void findNamingStrategy_with() {
        assertEquals(PropertyNamingStrategy.SnakeCaseStrategy.class,
                ai.findNamingStrategy(mockClass(NamingHolder.class)));
    }

    @Test
    public void findNamingStrategy_without() {
        assertNull(ai.findNamingStrategy(mockClass(NoNamingHolder.class)));
    }

    // ---- findAutoDetectVisibility ----
    @Test
    public void findAutoDetectVisibility_noAnnotation_returnsSameChecker() {
        VisibilityChecker<?> checker = VisibilityChecker.Std.defaultInstance();
        VisibilityChecker<?> result = ai.findAutoDetectVisibility(mockClass(NoAutoDetectHolder.class), checker);
        assertSame(checker, result);
    }

    @Test
    public void findAutoDetectVisibility_withAnnotation_returnsDifferentChecker() {
        VisibilityChecker<?> checker = VisibilityChecker.Std.defaultInstance();
        VisibilityChecker<?> result = ai.findAutoDetectVisibility(mockClass(AutoDetectHolder.class), checker);
        assertNotSame(checker, result);
    }

    // ---- findImplicitPropertyName ----
    @Test
    public void findImplicitPropertyName_alwaysNull() {
        assertNull(ai.findImplicitPropertyName(mockMember(MemberAnnHolder.class)));
    }

    // ---- hasIgnoreMarker ----
    @Test
    public void hasIgnoreMarker_true() {
        assertTrue(ai.hasIgnoreMarker(mockMember(f(MemberAnnHolder.class, "ignoredTrue"))));
    }

    @Test
    public void hasIgnoreMarker_falseValue() {
        assertFalse(ai.hasIgnoreMarker(mockMember(f(MemberAnnHolder.class, "ignoredFalse"))));
    }

    @Test
    public void hasIgnoreMarker_noAnnotation() {
        assertFalse(ai.hasIgnoreMarker(mockMember(f(MemberAnnHolder.class, "notIgnored"))));
    }

    // ---- hasRequiredMarker ----
    @Test
    public void hasRequiredMarker_true() {
        assertEquals(Boolean.TRUE, ai.hasRequiredMarker(mockMember(f(MemberAnnHolder.class, "reqTrue"))));
    }

    @Test
    public void hasRequiredMarker_false() {
        assertEquals(Boolean.FALSE, ai.hasRequiredMarker(mockMember(f(MemberAnnHolder.class, "reqFalse"))));
    }

    @Test
    public void hasRequiredMarker_noAnnotation_returnsNull() {
        assertNull(ai.hasRequiredMarker(mockMember(f(MemberAnnHolder.class, "noReq"))));
    }

    // ---- findPropertyAccess ----
    @Test
    public void findPropertyAccess_with() {
        assertEquals(JsonProperty.Access.READ_ONLY, ai.findPropertyAccess(mockMember(f(MemberAnnHolder.class, "accessRO"))));
    }

    @Test
    public void findPropertyAccess_without() {
        assertNull(ai.findPropertyAccess(mockMember(f(MemberAnnHolder.class, "noAccess"))));
    }

    // ---- findPropertyDescription ----
    @Test
    public void findPropertyDescription_with() {
        assertEquals("desc", ai.findPropertyDescription(mockMember(f(MemberAnnHolder.class, "described"))));
    }

    @Test
    public void findPropertyDescription_without() {
        assertNull(ai.findPropertyDescription(mockMember(f(MemberAnnHolder.class, "noDesc"))));
    }

    // ---- findPropertyIndex ----
    @Test
    public void findPropertyIndex_explicit() {
        assertEquals(Integer.valueOf(5), ai.findPropertyIndex(mockMember(f(MemberAnnHolder.class, "idx5"))));
    }

    @Test
    public void findPropertyIndex_unknown_returnsNull() {
        assertNull(ai.findPropertyIndex(mockMember(f(MemberAnnHolder.class, "idxUnknown"))));
    }

    @Test
    public void findPropertyIndex_noAnnotation_returnsNull() {
        assertNull(ai.findPropertyIndex(mockMember(f(MemberAnnHolder.class, "noAccess"))));
    }

    // ---- findPropertyDefaultValue ----
    @Test
    public void findPropertyDefaultValue_nonEmpty() {
        assertEquals("42", ai.findPropertyDefaultValue(mockMember(f(MemberAnnHolder.class, "defVal"))));
    }

    @Test
    public void findPropertyDefaultValue_empty_returnsNull() {
        assertNull(ai.findPropertyDefaultValue(mockMember(f(MemberAnnHolder.class, "defValEmpty"))));
    }

    @Test
    public void findPropertyDefaultValue_noAnnotation_returnsNull() {
        assertNull(ai.findPropertyDefaultValue(mockMember(f(MemberAnnHolder.class, "noAccess"))));
    }

    // ---- findFormat ----
    @Test
    public void findFormat_with() {
        assertNotNull(ai.findFormat(mockMember(f(MemberAnnHolder.class, "fmt"))));
    }

    @Test
    public void findFormat_without() {
        assertNull(ai.findFormat(mockMember(f(MemberAnnHolder.class, "noFmt"))));
    }

    // ---- findReferenceType ----
    @Test
    public void findReferenceType_managed() {
        assertNotNull(ai.findReferenceType(mockMember(f(MemberAnnHolder.class, "managedRef"))));
    }

    @Test
    public void findReferenceType_back() {
        assertNotNull(ai.findReferenceType(mockMember(f(MemberAnnHolder.class, "backRef"))));
    }

    @Test
    public void findReferenceType_none() {
        assertNull(ai.findReferenceType(mockMember(f(MemberAnnHolder.class, "noRef"))));
    }

    // ---- findUnwrappingNameTransformer ----
    @Test
    public void findUnwrappingNameTransformer_enabled() {
        assertNotNull(ai.findUnwrappingNameTransformer(mockMember(f(MemberAnnHolder.class, "unwrappedOn"))));
    }

    @Test
    public void findUnwrappingNameTransformer_disabled() {
        assertNull(ai.findUnwrappingNameTransformer(mockMember(f(MemberAnnHolder.class, "unwrappedOff"))));
    }

    @Test
    public void findUnwrappingNameTransformer_noAnnotation() {
        assertNull(ai.findUnwrappingNameTransformer(mockMember(f(MemberAnnHolder.class, "noUnwrap"))));
    }

    // ---- findInjectableValueId ----
    @Test
    public void findInjectableValueId_explicitId() {
        assertEquals("myId", ai.findInjectableValueId(mockMember(f(MemberAnnHolder.class, "injectExplicit"))));
    }

    @Test
    public void findInjectableValueId_emptyId_notAnnotatedMethod_usesRawType() {
        AnnotatedMember member = mockMember(f(MemberAnnHolder.class, "injectEmpty"));
        doReturn(String.class).when(member).getRawType();
        assertEquals("java.lang.String", ai.findInjectableValueId(member));
    }

    @Test
    public void findInjectableValueId_emptyId_annotatedMethodZeroParams_usesRawType() {
        AnnotatedMethod method = mockMethodEl(f(MemberAnnHolder.class, "injectEmpty")); // reuse field's annotation set
        doReturn(0).when(method).getParameterCount();
        doReturn(Integer.class).when(method).getRawType();
        assertEquals("java.lang.Integer", ai.findInjectableValueId(method));
    }

    @Test
    public void findInjectableValueId_emptyId_annotatedMethodWithParams_usesFirstParamType() {
        AnnotatedMethod method = mockMethodEl(f(MemberAnnHolder.class, "injectEmpty"));
        doReturn(1).when(method).get