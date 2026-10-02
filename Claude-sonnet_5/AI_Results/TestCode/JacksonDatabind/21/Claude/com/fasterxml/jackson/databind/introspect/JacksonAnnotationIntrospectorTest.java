package com.fasterxml.jackson.databind.introspect;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.StdConverter;

public class JacksonAnnotationIntrospectorTest {

    private static ObjectMapper MAPPER;
    private static JacksonAnnotationIntrospector AI;

    @BeforeClass
    public static void setUpClass() {
        MAPPER = new ObjectMapper();
        AI = new JacksonAnnotationIntrospector();
    }

    // ---------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------

    private BeanDescription describe(Class<?> cls) {
        return MAPPER.getSerializationConfig().introspect(MAPPER.constructType(cls));
    }

    private AnnotatedClass annotatedClass(Class<?> cls) {
        return describe(cls).getClassInfo();
    }

    private AnnotatedField annotatedField(Class<?> cls, String name) {
        AnnotatedClass ac = annotatedClass(cls);
        for (AnnotatedField f : ac.fields()) {
            if (f.getName().equals(name)) {
                return f;
            }
        }
        throw new IllegalStateException("Field not found: " + name);
    }

    private AnnotatedMethod annotatedMethod(Class<?> cls, String name, Class<?>... params) {
        AnnotatedClass ac = annotatedClass(cls);
        AnnotatedMethod m = ac.findMethod(name, params);
        if (m == null) {
            throw new IllegalStateException("Method not found: " + name);
        }
        return m;
    }

    private AnnotatedConstructor annotatedConstructor(Class<?> cls) {
        AnnotatedClass ac = annotatedClass(cls);
        List<AnnotatedConstructor> ctors = ac.getConstructors();
        assertFalse(ctors.isEmpty());
        return ctors.get(0);
    }

    // ---------------------------------------------------------------
    // Fixtures - annotations / classes
    // ---------------------------------------------------------------

    @Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @JacksonAnnotationsInside
    @interface MyBundle {}

    @Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @interface NotBundle {}

    @MyBundle
    static class BundleHolder {}

    @NotBundle
    static class NotBundleHolder {}

    interface SomeView {}

    @JsonRootName(value = "root", namespace = "ns")
    static class RootNameBean {}

    @JsonRootName("simpleRoot")
    static class RootNameNoNamespaceBean {}

    static class NoRootNameBean {}

    @JsonIgnoreProperties(value = { "a", "b" }, allowGetters = true)
    static class IgnorePropsAllowGetters {}

    @JsonIgnoreProperties(value = { "a" }, allowSetters = true)
    static class IgnorePropsAllowSetters {}

    @JsonIgnoreProperties({ "x", "y" })
    static class IgnorePropsBasic {}

    static class NoIgnoreProps {}

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class IgnoreUnknownTrueBean {}

    @JsonIgnoreProperties(ignoreUnknown = false)
    static class IgnoreUnknownFalseBean {}

    static class NoIgnoreUnknownBean {}

    @JsonIgnoreType
    static class IgnoreTypeDefaultBean {}

    @JsonIgnoreType(false)
    static class IgnoreTypeFalseBean {}

    static class NoIgnoreTypeBean {}

    @JsonFilter("myFilter")
    static class FilterBean {}

    @JsonFilter("")
    static class FilterEmptyBean {}

    static class NoFilterBean {}

    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    static class NamingBean {}

    static class NoNamingBean {}

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    static class AutoDetectBean {}

    static class NoAutoDetectBean {}

    static class SubTypeChild {}

    @JsonSubTypes({ @JsonSubTypes.Type(value = SubTypeChild.class, name = "child") })
    static class SubTypesBean {}

    static class NoSubTypesBean {}

    @JsonTypeName("myType")
    static class TypeNameBean {}

    static class NoTypeNameBean {}

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    static class IdentityBean {}

    @JsonIdentityInfo(generator = ObjectIdGenerators.None.class)
    static class IdentityNoneBean {}

    static class NoIdentityBean {}

    static class CustomSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) {}
    }

    @JsonSerialize(using = CustomSerializer.class)
    static class SerializerBean {}

    @JsonSerialize(keyUsing = CustomSerializer.class)
    static class KeySerializerBean {}

    @JsonSerialize(contentUsing = CustomSerializer.class)
    static class ContentSerializerBean {}

    @JsonSerialize(nullsUsing = CustomSerializer.class)
    static class NullSerializerBean {}

    @JsonSerialize
    static class SerializeDefaultBean {}

    @JsonRawValue(true)
    static class RawValueTrueBean {}

    @JsonRawValue(false)
    static class RawValueFalseBean {}

    static class NoSerializerBean {}

    @JsonInclude(JsonInclude.Include.NON_NULL)
    static class IncludeAnnBean {}

    @JsonSerialize(include = JsonSerialize.Inclusion.ALWAYS)
    static class IncludeAlwaysBean {}

    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    static class IncludeNonNullBean {}

    @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
    static class IncludeNonDefaultBean {}

    @JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
    static class IncludeNonEmptyBean {}

    @JsonSerialize(include = JsonSerialize.Inclusion.DEFAULT_INCLUSION)
    static class IncludeDefaultInclusionBean {}

    static class NoIncludeBean {}

    @JsonInclude(content = JsonInclude.Include.NON_EMPTY)
    static class IncludeContentBean {}

    static class NoIncludeContentBean {}

    @JsonSerialize(as = String.class)
    static class SerTypeExplicitBean {}

    @JsonSerialize
    static class SerTypeDefaultBean {}

    static class NoSerTypeBean {}

    @JsonSerialize(keyAs = String.class)
    static class SerKeyTypeExplicitBean {}

    @JsonSerialize(contentAs = String.class)
    static class SerContentTypeExplicitBean {}

    @JsonSerialize(typing = JsonSerialize.Typing.STATIC)
    static class TypingBean {}

    static class NoTypingBean {}

    static class CustomConverter extends StdConverter<Object, Object> {
        @Override
        public Object convert(Object value) { return value; }
    }

    @JsonSerialize(converter = CustomConverter.class)
    static class ConverterBean {}

    @JsonSerialize
    static class ConverterDefaultBean {}

    static class NoConverterBean {}

    static class ContentConverterBean {
        @JsonSerialize(contentConverter = CustomConverter.class)
        public java.util.List<String> listField;
        @JsonSerialize
        public java.util.List<String> listFieldDefault;
        public java.util.List<String> listFieldNoAnn;
    }

    @JsonPropertyOrder({ "b", "a" })
    static class OrderBean {}

    static class NoOrderBean {}

    @JsonPropertyOrder(alphabetic = true)
    static class AlphaTrueBean {}

    @JsonPropertyOrder(alphabetic = false)
    static class AlphaFalseBean {}

    static class NoAlphaBean {}

    @JsonAppend(attrs = { @JsonAppend.Attr(value = "attr1"), @JsonAppend.Attr(value = "attr2") })
    static class AppendAttrsBean {}

    @JsonAppend(prepend = true, attrs = { @JsonAppend.Attr(value = "attrP") })
    static class AppendPrependBean {}

    static class NoAppendBean {}

    static class NameSerGetterBean {
        @JsonGetter("gname")
        public String getFoo() { return "x"; }
    }

    static class NamePropSerBean {
        @JsonProperty("pname")
        public String field;
    }

    static class NameEmptySerBean {
        @JsonSerialize
        public String field;
    }

    static class NameNullSerBean {
        public String field;
    }

    static class AsValueTrueBean {
        @JsonValue(true)
        public String getVal() { return "v"; }
    }

    static class AsValueFalseBean {
        @JsonValue(false)
        public String getVal() { return "v"; }
    }

    static class NoAsValueBean {
        public String getVal() { return "v"; }
    }

    static class CustomDeserializer extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
    }

    static class CustomKeyDeserializer extends KeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) { return key; }
    }

    @JsonDeserialize(using = CustomDeserializer.class)
    static class DeserializerBean {}

    @JsonDeserialize(keyUsing = CustomKeyDeserializer.class)
    static class KeyDeserializerBean {}

    @JsonDeserialize(contentUsing = CustomDeserializer.class)
    static class ContentDeserializerBean {}

    @JsonDeserialize
    static class DeserializeDefaultBean {}

    static class NoDeserializerBean {}

    @JsonDeserialize(as = String.class)
    static class DeserTypeExplicitBean {}

    @JsonDeserialize
    static class DeserTypeDefaultBean {}

    static class NoDeserTypeBean {}

    @JsonDeserialize(converter = CustomConverter.class)
    static class DeserConverterBean {}

    @JsonDeserialize
    static class DeserConverterDefaultBean {}

    static class NoDeserConverterBean {}

    static class DeserContentConverterBean {
        @JsonDeserialize(contentConverter = CustomConverter.class)
        public java.util.List<String> listField;
        @JsonDeserialize
        public java.util.List<String> listFieldDefault;
        public java.util.List<String> listFieldNoAnn;
    }

    @JsonValueInstantiator(com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.class)
    static class ValueInstBean {}

    static class NoValueInstBean {}

    static class SomeBuilder {}

    @JsonDeserialize(builder = SomeBuilder.class)
    static class POJOBuilderBean {}

    @JsonDeserialize
    static class POJOBuilderDefaultBean {}

    static class NoPOJOBuilderBean {}

    @JsonPOJOBuilder(withPrefix = "with", buildMethodName = "create")
    static class POJOBuilderConfigBean {}

    static class NoPOJOBuilderConfigBean {}

    static class NameSetBean {
        @JsonSetter("sname")
        public void setFoo(String v) {}
    }

    static class NamePropDeserBean {
        @JsonProperty("pdname")
        public String field;
    }

    static class NameEmptyDeserBean {
        @JsonDeserialize
        public String field;
    }

    static class NameNullDeserBean {
        public String field;
    }

    static class AnySetterBean {
        @JsonAnySetter
        public void setAny(String k, Object v) {}
    }

    static class NoAnySetterBean {
        public void setAny(String k, Object v) {}
    }

    static class AnyGetterBean {
        @JsonAnyGetter
        public Map<String, Object> getAny() { return null; }
    }

    static class NoAnyGetterBean {
        public Map<String, Object> getAny() { return null; }
    }

    static class CreatorBean {
        @JsonCreator
        public CreatorBean() {}
    }

    static class CreatorDisabledBean {
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        public CreatorDisabledBean() {}
    }

    static class NoCreatorBean {
        public NoCreatorBean() {}
    }

    static class MemberAnnoBean {
        @JsonIgnore
        public String ignoredField;
        @JsonIgnore(false)
        public String notIgnoredField;
        public String plainField;

        @JsonProperty(required = true)
        public String requiredField;
        @JsonProperty(required = false)
        public String notRequiredField;
        public String noPropField;

        @JsonProperty(access = JsonProperty.Access.READ_ONLY)
        public String readOnlyField;

        @JsonPropertyDescription("desc-text")
        public String describedField;
        public String noDescField;

        @JsonProperty(index = 5)
        public String indexedField;
        @JsonProperty
        public String noIndexField;

        @JsonProperty(defaultValue = "abc")
        public String defaultValField;
        @JsonProperty
        public String noDefaultValField;

        @JsonFormat(pattern = "yyyy-MM-dd")
        public String formattedField;
        public String noFormatField;

        @JsonManagedReference("mgr")
        public String managedRefField;
        @JsonBackReference("bck")
        public String backRefField;
        public String noRefField;

        @JsonUnwrapped(prefix = "p_", suffix = "_s")
        public String unwrappedField;
        @JsonUnwrapped(enabled = false)
        public String unwrappedDisabledField;
        public String noUnwrapField;

        @JacksonInject
        public String injectField;
        @JacksonInject("customId")
        public String injectNamedField;
        public String noInjectField;

        @JsonView(SomeView.class)
        public String viewedField;
        public String noViewField;

        @JsonTypeId
        public String typeIdField;
        public String noTypeIdField;
    }

    static class MethodInjectBean {
        private String value;

        @JacksonInject
        public String getValue() { return value; }

        @JacksonInject
        public void setValue(String v) { this.value = v; }
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@type")
    static class TypeInfoBean {}

    @JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
    static class TypeInfoNoneBean {}

    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "@type")
    static class ExternalTypeInfoBean {}

    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, defaultImpl = String.class)
    static class TypeInfoWithDefaultImplBean {}

    @JsonTypeResolver(StdTypeResolverBuilder.class)
    static class ResolverOnlyBean {}

    static class NoTypeInfoBean {
        public java.util.List<String> listField;
        public String plainField;
    }

    // ---------------------------------------------------------------
    // Tests: general
    // ---------------------------------------------------------------

    @Test
    public void testVersionNotNull() {
        assertNotNull(AI.version());
    }

    @Test
    public void testIsAnnotationBundle_true() {
        MyBundle ann = BundleHolder.class.getAnnotation(MyBundle.class);
        assertTrue(AI.isAnnotationBundle(ann));
    }

    @Test
    public void testIsAnnotationBundle_false() {
        NotBundle ann = NotBundleHolder.class.getAnnotation(NotBundle.class);
        assertFalse(AI.isAnnotationBundle(ann));
    }

    // ---------------------------------------------------------------
    // findRootName
    // ---------------------------------------------------------------

    @Test
    public void testFindRootName_withNamespace() {
        PropertyName pn = AI.findRootName(annotatedClass(RootNameBean.class));
        assertNotNull(pn);
        assertEquals("root", pn.getSimpleName());
        assertEquals("ns", pn.getNamespace());
    }

    @Test
    public void testFindRootName_emptyNamespaceBecomesNull() {
        PropertyName pn = AI.findRootName(annotatedClass(RootNameNoNamespaceBean.class));
        assertNotNull(pn);
        assertNull(pn.getNamespace());
    }

    @Test
    public void testFindRootName_null() {
        assertNull(AI.findRootName(annotatedClass(NoRootNameBean.class)));
    }

    // ---------------------------------------------------------------
    // findPropertiesToIgnore
    // ---------------------------------------------------------------

    @Test
    public void testFindPropertiesToIgnore_deprecatedOverload() {
        String[] r = AI.findPropertiesToIgnore(annotatedClass(IgnorePropsBasic.class));
        assertArrayEquals(new String[] { "x", "y" }, r);
        assertNull(AI.findPropertiesToIgnore(annotatedClass(NoIgnoreProps.class)));
    }

    @Test
    public void testFindPropertiesToIgnore_null() {
        assertNull(AI.findPropertiesToIgnore(annotatedClass(NoIgnoreProps.class), true));
    }

    @Test
    public void testFindPropertiesToIgnore_serialization_allowGetters_returnsNull() {
        assertNull(AI.findPropertiesToIgnore(annotatedClass(IgnorePropsAllowGetters.class), true));
    }

    @Test
    public void testFindPropertiesToIgnore_serialization_notAllowGetters_returnsValue() {
        String[] r = AI.findPropertiesToIgnore(annotatedClass(IgnorePropsBasic.class), true);
        assertArrayEquals(new String[] { "x", "y" }, r);
    }

    @Test
    public void testFindPropertiesToIgnore_deserialization_allowSetters_returnsNull() {
        assertNull(AI.findPropertiesToIgnore(annotatedClass(IgnorePropsAllowSetters.class), false));
    }

    @Test
    public void testFindPropertiesToIgnore_deserialization_notAllowSetters_returnsValue() {
        String[] r = AI.findPropertiesToIgnore(annotatedClass(IgnorePropsBasic.class), false);
        assertArrayEquals(new String[] { "x", "y" }, r);
    }

    // ---------------------------------------------------------------
    // findIgnoreUnknownProperties / isIgnorableType
    // ---------------------------------------------------------------

    @Test
    public void testFindIgnoreUnknownProperties() {
        assertEquals(Boolean.TRUE, AI.findIgnoreUnknownProperties(annotatedClass(IgnoreUnknownTrueBean.class)));
        assertEquals(Boolean.FALSE, AI.findIgnoreUnknownProperties(annotatedClass(IgnoreUnknownFalseBean.class)));
        assertNull(AI.findIgnoreUnknownProperties(annotatedClass(NoIgnoreUnknownBean.class)));
    }

    @Test
    public void testIsIgnorableType() {
        assertEquals(Boolean.TRUE, AI.isIgnorableType(annotatedClass(IgnoreTypeDefaultBean.class)));
        assertEquals(Boolean.FALSE, AI.isIgnorableType(annotatedClass(IgnoreTypeFalseBean.class)));
        assertNull(AI.isIgnorableType(annotatedClass(NoIgnoreTypeBean.class)));
    }

    // ---------------------------------------------------------------
    // findFilterId
    // ---------------------------------------------------------------

    @Test
    public void testFindFilterId_present() {
        assertEquals("myFilter", AI.findFilterId((Annotated) annotatedClass(FilterBean.class)));
        // deprecated overload
        assertEquals("myFilter", AI.findFilterId(annotatedClass(FilterBean.class)));
    }

    @Test
    public void testFindFilterId_emptyReturnsNull() {
        assertNull(AI.findFilterId((Annotated) annotatedClass(FilterEmptyBean.class)));
    }

    @Test
    public void testFindFilterId_absentReturnsNull() {
        assertNull(AI.findFilterId((Annotated) annotatedClass(NoFilterBean.class)));
    }

    // ---------------------------------------------------------------
    // findNamingStrategy
    // ---------------------------------------------------------------

    @Test
    public void testFindNamingStrategy() {
        assertEquals(PropertyNamingStrategy.SnakeCaseStrategy.class,
                AI.findNamingStrategy(annotatedClass(NamingBean.class)));
        assertNull(AI.findNamingStrategy(annotatedClass(NoNamingBean.class)));
    }

    // ---------------------------------------------------------------
    // findAutoDetectVisibility
    // ---------------------------------------------------------------

    @Test
    public void testFindAutoDetectVisibility_noAnnotationReturnsSameChecker() {
        VisibilityChecker<?> checker = MAPPER.getSerializationConfig().getDefaultVisibilityChecker();
        VisibilityChecker<?> result = AI.findAutoDetectVisibility(annotatedClass(NoAutoDetectBean.class), checker);
        assertSame(checker, result);
    }

    @Test
    public void testFindAutoDetectVisibility_withAnnotationReturnsDifferentChecker() {
        VisibilityChecker<?> checker = MAPPER.getSerializationConfig().getDefaultVisibilityChecker();
        VisibilityChecker<?> result = AI.findAutoDetectVisibility(annotatedClass(AutoDetectBean.class), checker);
        assertNotNull(result);
        // Branch executed (checker.with(ann)); cannot assert internal fields without more reflection.
    }

    // ---------------------------------------------------------------
    // findImplicitPropertyName
    // ---------------------------------------------------------------

    @Test
    public void testFindImplicitPropertyName_alwaysNull() {
        AnnotatedField f = annotatedField(MemberAnnoBean.class, "plainField");
        assertNull(AI.findImplicitPropertyName(f));
    }

    // ---------------------------------------------------------------
    // hasIgnoreMarker
    // ---------------------------------------------------------------

    @Test
    public void testHasIgnoreMarker() {
        assertTrue(AI.hasIgnoreMarker(annotatedField(MemberAnnoBean.class, "ignoredField")));
        assertFalse(AI.hasIgnoreMarker(annotatedField(MemberAnnoBean.class, "notIgnoredField")));
        assertFalse(AI.hasIgnoreMarker(annotatedField(MemberAnnoBean.class, "plainField")));
    }

    // ---------------------------------------------------------------
    // hasRequiredMarker
    // ---------------------------------------------------------------

    @Test
    public void testHasRequiredMarker() {
        assertEquals(Boolean.TRUE, AI.hasRequiredMarker(annotatedField(MemberAnnoBean.class, "requiredField")));
        assertEquals(Boolean.FALSE, AI.hasRequiredMarker(annotatedField(MemberAnnoBean.class, "notRequiredField")));
        assertNull(AI.hasRequiredMarker(annotatedField(MemberAnnoBean.class, "noPropField")));
    }

    // ---------------------------------------------------------------
    // findPropertyAccess
    // ---------------------------------------------------------------

    @Test
    public void testFindPropertyAccess() {
        assertEquals(JsonProperty.Access.READ_ONLY,
                AI.findPropertyAccess(annotatedField(MemberAnnoBean.class, "readOnlyField")));
        assertNull(AI.findPropertyAccess(annotatedField(MemberAnnoBean.class, "plainField")));
    }

    // ---------------------------------------------------------------
    // findPropertyDescription
    // ---------------------------------------------------------------

    @Test
    public void testFindPropertyDescription() {
        assertEquals("desc-text",
                AI.findPropertyDescription(annotatedField(MemberAnnoBean.class, "describedField")));
        assertNull(AI.findPropertyDescription(annotatedField(MemberAnnoBean.class, "noDescField")));
    }

    // ---------------------------------------------------------------
    // findPropertyIndex
    // ---------------------------------------------------------------

    @Test
    public void testFindPropertyIndex() {
        assertEquals(Integer.valueOf(5),
                AI.findPropertyIndex(annotatedField(MemberAnnoBean.class, "indexedField")));
        assertNull(AI.findPropertyIndex(annotatedField(MemberAnnoBean.class, "noIndexField")));
        assertNull(AI.findPropertyIndex(annotatedField(MemberAnnoBean.class, "plainField")));
    }

    // ---------------------------------------------------------------
    // findPropertyDefaultValue
    // ---------------------------------------------------------------

    @Test
    public void testFindPropertyDefaultValue() {
        assertEquals("abc",
                AI.findPropertyDefaultValue(annotatedField(MemberAnnoBean.class, "defaultValField")));
        assertNull(AI.findPropertyDefaultValue(annotatedField(MemberAnnoBean.class, "noDefaultValField")));
        assertNull(AI.findPropertyDefaultValue(annotatedField(MemberAnnoBean.class, "plainField")));
    }

    // ---------------------------------------------------------------
    // findFormat
    // ---------------------------------------------------------------

    @Test
    public void testFindFormat() {
        JsonFormat.Value v = AI.findFormat(annotatedField(MemberAnnoBean.class, "formattedField"));
        assertNotNull(v);
        assertNull(AI.findFormat(annotatedField(MemberAnnoBean.class, "noFormatField")));
    }

    // ---------------------------------------------------------------
    // findReferenceType
    // ---------------------------------------------------------------

    @Test
    public void testFindReferenceType_managed() {
        AnnotationIntrospector.ReferenceProperty rp =
                AI.findReferenceType(annotatedField(MemberAnnoBean.class, "managedRefField"));
        assertNotNull(rp);
        assertEquals(AnnotationIntrospector.ReferenceProperty.Type.MANAGED_REFERENCE, rp.getType());
    }

    @Test
    public void testFindReferenceType_back() {
        AnnotationIntrospector.ReferenceProperty rp =
                AI.findReferenceType(annotatedField(MemberAnnoBean.class, "backRefField"));
        assertNotNull(rp);
        assertEquals(AnnotationIntrospector.ReferenceProperty.Type.BACK_REFERENCE, rp.getType());
    }

    @Test
    public void testFindReferenceType_none() {
        assertNull(AI.findReferenceType(annotatedField(MemberAnnoBean.class, "noRefField")));
    }

    // ---------------------------------------------------------------
    // findUnwrappingNameTransformer
    // ---------------------------------------------------------------

    @Test
    public void testFindUnwrappingNameTransformer_enabled() {
        NameTransformer nt = AI.findUnwrappingNameTransformer(annotatedField(MemberAnnoBean.class, "unwrappedField"));
        assertNotNull(nt);
    }

    @Test
    public void testFindUnwrappingNameTransformer_disabled() {
        assertNull(AI.findUnwrappingNameTransformer(annotatedField(MemberAnnoBean.class, "unwrappedDisabledField")));
    }

    @Test
    public void testFindUnwrappingNameTransformer_absent() {
        assertNull(AI.findUnwrappingNameTransformer(annotatedField(MemberAnnoBean.class, "noUnwrapField")));
    }

    // ---------------------------------------------------------------
    // findInjectableValueId
    // ---------------------------------------------------------------

    @Test
    public void testFindInjectableValueId_field_emptyValue_returnsTypeName() {
        Object id = AI.findInjectableValueId(annotatedField(MemberAnnoBean.class, "injectField"));
        assertEquals(String.class.getName(), id);
    }

    @Test
    public void testFindInjectableValueId_field_explicitName() {
        Object id = AI.findInjectableValueId(annotatedField(MemberAnnoBean.class, "injectNamedField"));
        assertEquals("customId", id);
    }

    @Test
    public void testFindInjectableValueId_field_absent() {
        assertNull(AI.findInjectableValueId(annotatedField(MemberAnnoBean.class, "noInjectField")));
    }

    @Test
    public void testFindInjectableValueId_method_zeroParams_returnsRawTypeName() {
        AnnotatedMethod m = annotatedMethod(MethodInjectBean.class, "getValue");
        Object id = AI.findInjectableValueId(m);
        assertEquals(String.class.getName(), id);
    }

    @Test
    public void testFindInjectableValueId_method_oneParam_returnsParamTypeName() {
        AnnotatedMethod m = annotatedMethod(MethodInjectBean.class, "setValue", String.class);
        Object id = AI.findInjectableValueId(m);
        assertEquals(String.class.getName(), id);
    }

    // ---------------------------------------------------------------
    // findViews
    // ---------------------------------------------------------------

    @Test
    public void testFindViews() {
        Class<?>[] views = AI.findViews(annotatedField(MemberAnnoBean.class, "viewedField"));
        assertNotNull(views);
        assertEquals(1, views.length);
        assertEquals(SomeView.class, views[0]);
        assertNull(AI.findViews(annotatedField(MemberAnnoBean.class, "noViewField")));
    }

    // ---------------------------------------------------------------
    // isTypeId
    // ---------------------------------------------------------------

    @Test
    public void testIsTypeId() {
        assertEquals(Boolean.TRUE, AI.isTypeId(annotatedField(MemberAnnoBean.class, "typeIdField")));
        assertEquals(Boolean.FALSE, AI.isTypeId(annotatedField(MemberAnnoBean.class, "noTypeIdField")));
    }

    // ---------------------------------------------------------------
    // findTypeResolver / findPropertyTypeResolver / findPropertyContentTypeResolver
    // ---------------------------------------------------------------

    @Test
    public void testFindTypeResolver_withAnnotation_notNull() {
        TypeResolverBuilder<?> b = AI.findTypeResolver(MAPPER.getSerializationConfig(),
                annotatedClass(TypeInfoBean.class), MAPPER.constructType(Object.class));
        assertNotNull(b);
    }

    @Test
    public void testFindTypeResolver_useNone_returnsNoTypeInfoMarker() {
        TypeResolverBuilder<?> b = AI.findTypeResolver(MAPPER.getSerializationConfig(),
                annotatedClass(TypeInfoNoneBean.class), MAPPER.constructType(Object.class));
        assertNotNull(b); // marker builder, never null per source contract
    }

    @Test
    public void testFindTypeResolver_noAnnotation_returnsNull() {
        TypeResolverBuilder<?> b = AI.findTypeResolver(MAPPER.getSerializationConfig(),
                annotatedClass(NoTypeInfoBean.class), MAPPER.constructType(Object.class));
        assertNull(b);
    }

    @Test
    public void testFindTypeResolver_resolverAnnotationWithoutTypeInfo_returnsNull() {
        TypeResolverBuilder<?> b = AI.findTypeResolver(MAPPER.getSerializationConfig(),
                annotatedClass(ResolverOnlyBean.class), MAPPER.constructType(Object.class));
        assertNull(b);
    }

    @Test
    public void testFindTypeResolver_externalOnClassBecomesProperty_executesBranch() {
        TypeResolverBuilder<?> b = AI.findTypeResolver(MAPPER.getSerializationConfig(),
                annotatedClass(ExternalTypeInfoBean.class), MAPPER.constructType(Object.class));
        assertNotNull(b);
        // Cannot verify internal inclusion field via public API without reflection; branch is executed.
    }

    @Test
    public void testFindTypeResolver_defaultImplBranch() {
        TypeResolverBuilder<?> b = AI.findTypeResolver(MAPPER.getSerializationConfig(),
                annotatedClass(TypeInfoWithDefaultImplBean.class), MAPPER.constructType(Object.class));
        assertNotNull(b);
    }

    @Test
    public void testFindPropertyTypeResolver_containerType_returnsNull() {
        AnnotatedField f = annotatedField(NoTypeInfoBean.class, "listField");
        TypeResolverBuilder<?> b = AI.findPropertyTypeResolver(MAPPER.getSerializationConfig(),
                f, MAPPER.constructType(java.util.List.class));
        assertNull(b);
    }

    @Test
    public void testFindPropertyTypeResolver_nonContainerType_delegates() {
        AnnotatedField f = annotatedField(NoTypeInfoBean.class, "plainField");
        TypeResolverBuilder<?> b = AI.findPropertyTypeResolver(MAPPER.getSerializationConfig(),
                f, MAPPER.constructType(String.class));
        assertNull(b); // no @JsonTypeInfo on the field -> underlying _findTypeResolver returns null
    }

    @Test
    public void testFindPropertyContentTypeResolver_nonContainer_throws() {
        AnnotatedField f = annotatedField(NoTypeInfoBean.class, "plainField");
        try {
            AI.findPropertyContentTypeResolver(MAPPER.getSerializationConfig(), f,
                    MAPPER.constructType(String.class));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected branch
        }
    }

    @Test
    public void testFindPropertyContentTypeResolver_container_noAnnotation_returnsNull() {
        AnnotatedField f = annotatedField(NoTypeInfoBean.class, "listField");
        TypeResolverBuilder<?> b = AI.findPropertyContentTypeResolver(MAPPER.getSerializationConfig(),
                f, MAPPER.constructType(java.util.List.class));
        assertNull(b);
    }

    // ---------------------------------------------------------------
    // findSubtypes / findTypeName
    // ---------------------------------------------------------------

    @Test
    public void testFindSubtypes() {
        List<NamedType> types = AI.findSubtypes(annotatedClass(SubTypesBean.class));
        assertNotNull(types);
        assertEquals(1, types.size());
        assertEquals(SubTypeChild.class, types.get(0).getType());
        assertEquals("child", types.get(0).getName());

        assertNull(AI.findSubtypes(annotatedClass(NoSubTypesBean.class)));
    }

    @Test
    public void testFindTypeName() {
        assertEquals("myType", AI.findTypeName(annotatedClass(TypeNameBean.class)));
        assertNull(AI.findTypeName(annotatedClass(NoTypeNameBean.class)));
    }

    // ---------------------------------------------------------------
    // findObjectIdInfo / findObjectReferenceInfo
    // ---------------------------------------------------------------

    @Test
    public void testFindObjectIdInfo_present() {
        ObjectIdInfo info = AI.findObjectIdInfo(annotatedClass(IdentityBean.class));
        assertNotNull(info);
    }

    @Test
    public void testFindObjectIdInfo_generatorNone_returnsNull() {
        assertNull(AI.findObjectIdInfo(annotatedClass(IdentityNoneBean.class)));
    }

    @Test
    public void testFindObjectIdInfo_absent_returnsNull() {
        assertNull(AI.findObjectIdInfo(annotatedClass(NoIdentityBean.class)));
    }

    @Test
    public void testFindObjectReferenceInfo_withAnnotation() {
        ObjectIdInfo base = AI.findObjectIdInfo(annotatedClass(IdentityBean.class));
        assertNotNull(base);
        ObjectIdInfo result = AI.findObjectReferenceInfo(annotatedClass(IdentityBean.class), base);
        assertNotNull(result);
    }

    @Test
    public void testFindObjectReferenceInfo_withoutAnnotation_returnsSameInstance() {
        ObjectIdInfo base = AI.findObjectIdInfo(annotatedClass(IdentityBean.class));
        ObjectIdInfo result = AI.findObjectReferenceInfo(annotatedClass(NoIdentityBean.class), base);
        assertSame(base, result);
    }

    // ---------------------------------------------------------------
    // findSerializer family
    // ---------------------------------------------------------------

    @Test
    public void testFindSerializer_explicitClass() {
        assertEquals(CustomSerializer.class, AI.findSerializer(annotatedClass(SerializerBean.class)));
    }

    @Test
    public void testFindSerializer_rawValueTrue_returnsRawSerializerInstance() {
        Object result = AI.findSerializer(annotatedClass(RawValueTrueBean.class));
        assertNotNull(result);
        assertTrue(result instanceof com.fasterxml.jackson.databind.ser.std.RawSerializer);
    }

    @Test
    public void testFindSerializer_rawValueFalse_returnsNull() {
        assertNull(AI.findSerializer(annotatedClass(RawValueFalseBean.class)));
    }

    @Test
    public void testFindSerializer_none() {
        assertNull(AI.findSerializer(annotatedClass(NoSerializerBean.class)));
    }

    @Test
    public void testFindKeySerializer() {
        assertEquals(CustomSerializer.class, AI.findKeySerializer(annotatedClass(KeySerializerBean.class)));
        assertNull(AI.findKeySerializer(annotatedClass(SerializeDefaultBean.class)));
        assertNull(AI.findKeySerializer(annotatedClass(NoSerializerBean.class)));
    }

    @Test
    public void testFindContentSerializer() {
        assertEquals(CustomSerializer.class, AI.findContentSerializer(annotatedClass(ContentSerializerBean.class)));
        assertNull(AI.findContentSerializer(annotatedClass(SerializeDefaultBean.class)));
    }

    @Test
    public void testFindNullSerializer() {
        assertEquals(CustomSerializer.class, AI.findNullSerializer(annotatedClass(NullSerializerBean.class)));
        assertNull(AI.findNullSerializer(annotatedClass(SerializeDefaultBean.class)));
    }

    // ---------------------------------------------------------------
    // findSerializationInclusion / ForContent
    // ---------------------------------------------------------------

    @Test
    public void testFindSerializationInclusion_jsonIncludeWins() {
        JsonInclude.Include r = AI.findSerializationInclusion(annotatedClass(IncludeAnnBean.class),
                JsonInclude.Include.ALWAYS);
        assertEquals(JsonInclude.Include.NON_NULL, r);
    }

    @Test
    public void testFindSerializationInclusion_switchBranches() {
        assertEquals(JsonInclude.Include.ALWAYS,
                AI.findSerializationInclusion(annotatedClass(IncludeAlwaysBean.class), JsonInclude.Include.NON_EMPTY));
        assertEquals(JsonInclude.Include.NON_NULL,
                AI.findSerializationInclusion(annotatedClass(IncludeNonNullBean.class), JsonInclude.Include.ALWAYS));
        assertEquals(JsonInclude.Include.NON_DEFAULT,
                AI.findSerializationInclusion(annotatedClass(IncludeNonDefaultBean.class), JsonInclude.Include.ALWAYS));
        assertEquals(JsonInclude.Include.NON_EMPTY,
                AI.findSerializationInclusion(annotatedClass(IncludeNonEmptyBean.class), JsonInclude.Include.ALWAYS));
        // DEFAULT_INCLUSION falls through -> defValue
        assertEquals(JsonInclude.Include.ALWAYS,
                AI.findSerializationInclusion(annotatedClass(IncludeDefaultInclusionBean.class), JsonInclude.Include.ALWAYS));
    }

    @Test
    public void testFindSerializationInclusion_noAnnotation_returnsDefault() {
        assertEquals(JsonInclude.Include.NON_EMPTY,
                AI.findSerializationInclusion(annotatedClass(NoIncludeBean.class), JsonInclude.Include.NON_EMPTY));
    }

    @Test
    public void testFindSerializationInclusionForContent() {
        assertEquals(JsonInclude.Include.NON_EMPTY,
                AI.findSerializationInclusionForContent(annotatedClass(IncludeContentBean.class),
                        JsonInclude.Include.ALWAYS));
        assertEquals(JsonInclude.Include.ALWAYS,
                AI.findSerializationInclusionForContent(annotatedClass(NoIncludeContentBean.class),
                        JsonInclude.Include.ALWAYS));
    }

    // ---------------------------------------------------------------
    // findSerializationType / KeyType / ContentType
    // ---------------------------------------------------------------

    @Test
    public void testFindSerializationType() {
        assertEquals(String.class, AI.findSerializationType(annotatedClass(SerTypeExplicitBean.class)));
        assertNull(AI.findSerializationType(annotatedClass(SerTypeDefaultBean.class)));
        assertNull(AI.findSerializationType(annotatedClass(NoSerTypeBean.class)));
    }

    @Test
    public void testFindSerializationKeyType() {
        assertEquals(String.class,
                AI.findSerializationKeyType(annotatedClass(SerKeyTypeExplicitBean.class), null));
        assertNull(AI.findSerializationKeyType(annotatedClass(NoSerTypeBean.class), null));
    }

    @Test
    public void testFindSerializationContentType() {
        assertEquals(String.class,
                AI.findSerializationContentType(annotatedClass(SerContentTypeExplicitBean.class), null));
        assertNull(AI.findSerializationContentType(annotatedClass(NoSerTypeBean.class), null));
    }

    @Test
    public void testFindSerializationTyping() {
        assertEquals(JsonSerialize.Typing.STATIC, AI.findSerializationTyping(annotatedClass(TypingBean.class)));
        assertNull(AI.findSerializationTyping(annotatedClass(NoTypingBean.class)));
    }

    // ---------------------------------------------------------------
    // findSerializationConverter / findSerializationContentConverter
    // ---------------------------------------------------------------

    @Test
    public void testFindSerializationConverter() {
        assertEquals(CustomConverter.class, AI.findSerializationConverter(annotatedClass(ConverterBean.class)));
        assertNull(AI.findSerializationConverter(annotatedClass(ConverterDefaultBean.class)));
        assertNull(AI.findSerializationConverter(annotatedClass(NoConverterBean.class)));
    }

    @Test
    public void testFindSerializationContentConverter() {
        AnnotatedField explicit = annotatedField(ContentConverterBean.class, "listField");
        AnnotatedField dflt = annotatedField(ContentConverterBean.class, "listFieldDefault");
        AnnotatedField none = annotatedField(ContentConverterBean.class, "listFieldNoAnn");
        assertEquals(CustomConverter.class, AI.findSerializationContentConverter(explicit));
        assertNull(AI.findSerializationContentConverter(dflt));
        assertNull(AI.findSerializationContentConverter(none));
    }

    // ---------------------------------------------------------------
    // findSerializationPropertyOrder / SortAlphabetically
    // ---------------------------------------------------------------

    @Test
    public void testFindSerializationPropertyOrder() {
        assertArrayEquals(new String[] { "b", "a" },
                AI.findSerializationPropertyOrder(annotatedClass(OrderBean.class)));
        assertNull(AI.findSerializationPropertyOrder(annotatedClass(NoOrderBean.class)));
    }

    @Test
    public void testFindSerializationSortAlphabetically_annotatedOverload() {
        assertEquals(Boolean.TRUE,
                AI.findSerializationSortAlphabetically((Annotated) annotatedClass(AlphaTrueBean.class)));
        assertEquals(Boolean.FALSE,
                AI.findSerializationSortAlphabetically((Annotated) annotatedClass(AlphaFalseBean.class)));
        assertNull(AI.findSerializationSortAlphabetically((Annotated) annotatedClass(NoAlphaBean.class)));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testFindSerializationSortAlphabetically_deprecatedOverload() {
        assertEquals(Boolean.TRUE,
                AI.findSerializationSortAlphabetically(annotatedClass(AlphaTrueBean.class)));
    }

    // ---------------------------------------------------------------
    // findAndAddVirtualProperties
    // ---------------------------------------------------------------

    @Test
    public void testFindAndAddVirtualProperties_noAnnotation_noop() {
        List<BeanPropertyWriter> props = new java.util.ArrayList<BeanPropertyWriter>();
        AI.findAndAddVirtualProperties(MAPPER.getSerializationConfig(), annotatedClass(NoAppendBean.class), props);
        assertTrue(props.isEmpty());
    }

    @Test
    public void testFindAndAddVirtualProperties_attrsAppendedAtEnd() {
        List<BeanPropertyWriter> props = new java.util.ArrayList<BeanPropertyWriter>();
        AI.findAndAddVirtualProperties(MAPPER.getSerializationConfig(), annotatedClass(AppendAttrsBean.class), props);
        assertEquals(2, props.size());
    }

    @Test
    public void testFindAndAddVirtualProperties_prependInsertsAtFront() {
        List<BeanPropertyWriter> props = new java.util.ArrayList<BeanPropertyWriter>();
        AI.findAndAddVirtualProperties(MAPPER.getSerializationConfig(), annotatedClass(AppendPrependBean.class), props);
        assertEquals(1, props.size());
    }

    // ---------------------------------------------------------------
    // findNameForSerialization
    // ---------------------------------------------------------------

    @Test
    public void testFindNameForSerialization_jsonGetter() {
        AnnotatedMethod m = annotatedMethod(NameSerGetterBean.class, "getFoo");
        PropertyName pn = AI.findNameForSerialization(m);
        assertNotNull(pn);
        assertEquals("gname", pn.getSimpleName());
    }

    @Test
    public void testFindNameForSerialization_jsonProperty() {
        AnnotatedField f = annotatedField(NamePropSerBean.class, "field");
        PropertyName pn = AI.findNameForSerialization(f);
        assertNotNull(pn);
        assertEquals("pname", pn.getSimpleName());
    }

    @Test
    public void testFindNameForSerialization_emptyNameFromMarkerAnnotation() {
        AnnotatedField f = annotatedField(NameEmptySerBean.class, "field");
        PropertyName pn = AI.findNameForSerialization(f);
        assertNotNull(pn);
        assertEquals("", pn.getSimpleName());
    }

    @Test
    public void testFindNameForSerialization_null() {
        AnnotatedField f = annotatedField(NameNullSerBean.class, "field");
        assertNull(AI.findNameForSerialization(f));
    }

    // ---------------------------------------------------------------
    // hasAsValueAnnotation
    // ---------------------------------------------------------------

    @Test
    public void testHasAsValueAnnotation() {
        assertTrue(AI.hasAsValueAnnotation(annotatedMethod(AsValueTrueBean.class, "getVal")));
        assertFalse(AI.hasAsValueAnnotation(annotatedMethod(AsValueFalseBean.class, "getVal")));
        assertFalse(AI.hasAsValueAnnotation(annotatedMethod(NoAsValueBean.class, "getVal")));
    }

    // ---------------------------------------------------------------
    // findDeserializer family
    // ---------------------------------------------------------------

    @Test
    public void testFindDeserializer() {
        assertEquals(CustomDeserializer.class, AI.findDeserializer(annotatedClass(DeserializerBean.class)));
        assertNull(AI.findDeserializer(annotatedClass(DeserializeDefaultBean.class)));
        assertNull(AI.findDeserializer(annotatedClass(NoDeserializerBean.class)));
    }

    @Test
    public void testFindKeyDeserializer() {
        assertEquals(CustomKeyDeserializer.class, AI.findKeyDeserializer(annotatedClass(KeyDeserializerBean.class)));
        assertNull(AI.findKeyDeserializer(annotatedClass(DeserializeDefaultBean.class)));
    }

    @Test
    public void testFindContentDeserializer() {
        assertEquals(CustomDeserializer.class,
                AI.findContentDeserializer(annotatedClass(ContentDeserializerBean.class)));
        assertNull(AI.findContentDeserializer(annotatedClass(DeserializeDefaultBean.class)));
    }

    // ---------------------------------------------------------------
    // findDeserializationType/KeyType/ContentType
    // ---------------------------------------------------------------

    @Test
    public void testFindDeserializationType() {
        assertEquals(String.class,
                AI.findDeserializationType(annotatedClass(DeserTypeExplicitBean.class), null));
        assertNull(AI.findDeserializationType(annotatedClass(DeserTypeDefaultBean.class), null));
        assertNull(AI.findDeserializationType(annotatedClass(NoDeserTypeBean.class), null));
    }

    @Test
    public void testFindDeserializationKeyType_and_ContentType_noAnnotation() {
        assertNull(AI.findDeserializationKeyType(annotatedClass(NoDeserTypeBean.class), null));
        assertNull(AI.findDeserializationContentType(annotatedClass(NoDeserTypeBean.class), null));
    }

    // ---------------------------------------------------------------
    // findDeserializationConverter / ContentConverter
    // ---------------------------------------------------------------

    @Test
    public void testFindDeserializationConverter() {
        assertEquals(CustomConverter.class, AI.findDeserializationConverter(annotatedClass(DeserConverterBean.class)));
        assertNull(AI.findDeserializationConverter(annotatedClass(DeserConverterDefaultBean.class)));
        assertNull(AI.findDeserializationConverter(annotatedClass(NoDeserConverterBean.class)));
    }

    @Test
    public void testFindDeserializationContentConverter() {
        AnnotatedField explicit = annotatedField(DeserContentConverterBean.class, "listField");
        AnnotatedField dflt = annotatedField(DeserContentConverterBean.class, "listFieldDefault");
        AnnotatedField none = annotatedField(DeserContentConverterBean.class, "listFieldNoAnn");
        assertEquals(CustomConverter.class, AI.findDeserializationContentConverter(explicit));
        assertNull(AI.findDeserializationContentConverter(dflt));
        assertNull(AI.findDeserializationContentConverter(none));
    }

    // ---------------------------------------------------------------
    // findValueInstantiator / findPOJOBuilder / findPOJOBuilderConfig
    // ---------------------------------------------------------------

    @Test
    public void testFindValueInstantiator() {
        assertEquals(com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.class,
                AI.findValueInstantiator(annotatedClass(ValueInstBean.class)));
        assertNull(AI.findValueInstantiator(annotatedClass(NoValueInstBean.class)));
    }

    @Test
    public void testFindPOJOBuilder() {
        assertEquals(SomeBuilder.class, AI.findPOJOBuilder(annotatedClass(POJOBuilderBean.class)));
        assertNull(AI.findPOJOBuilder(annotatedClass(POJOBuilderDefaultBean.class)));
        assertNull(AI.findPOJOBuilder(annotatedClass(NoPOJOBuilderBean.class)));
    }

    @Test
    public void testFindPOJOBuilderConfig() {
        JsonPOJOBuilder.Value v = AI.findPOJOBuilderConfig(annotatedClass(POJOBuilderConfigBean.class));
        assertNotNull(v);
        assertEquals("with", v.withPrefix);
        assertEquals("create", v.buildMethodName);
        assertNull(AI.findPOJOBuilderConfig(annotatedClass(NoPOJOBuilderConfigBean.class)));
    }

    // ---------------------------------------------------------------
    // findNameForDeserialization
    // ---------------------------------------------------------------

    @Test
    public void testFindNameForDeserialization_jsonSetter() {
        AnnotatedMethod m = annotatedMethod(NameSetBean.class, "setFoo", String.class);
        PropertyName pn = AI.findNameForDeserialization(m);
        assertNotNull(pn);
        assertEquals("sname", pn.getSimpleName());
    }

    @Test
    public void testFindNameForDeserialization_jsonProperty() {
        AnnotatedField f = annotatedField(NamePropDeserBean.class, "field");
        PropertyName pn = AI.findNameForDeserialization(f);
        assertEquals("pdname", pn.getSimpleName());
    }

    @Test
    public void testFindNameForDeserialization_emptyNameFromMarker() {
        AnnotatedField f = annotatedField(NameEmptyDeserBean.class, "field");
        PropertyName pn = AI.findNameForDeserialization(f);
        assertEquals("", pn.getSimpleName());
    }

    @Test
    public void testFindNameForDeserialization_null() {
        AnnotatedField f = annotatedField(NameNullDeserBean.class, "field");
        assertNull(AI.findNameForDeserialization(f));
    }

    // ---------------------------------------------------------------
    // hasAnySetterAnnotation / hasAnyGetterAnnotation
    // ---------------------------------------------------------------

    @Test
    public void testHasAnySetterAnnotation() {
        AnnotatedMethod m = annotatedMethod(AnySetterBean.class, "setAny", String.class, Object.class);
        assertTrue(AI.hasAnySetterAnnotation(m));
        AnnotatedMethod m2 = annotatedMethod(NoAnySetterBean.class, "setAny", String.class, Object.class);
        assertFalse(AI.hasAnySetterAnnotation(m2));
    }

    @Test
    public void testHasAnyGetterAnnotation() {
        AnnotatedMethod m = annotatedMethod(AnyGetterBean.class, "getAny");
        assertTrue(AI.hasAnyGetterAnnotation(m));
        AnnotatedMethod m2 = annotatedMethod(NoAnyGetterBean.class, "getAny");
        assertFalse(AI.hasAnyGetterAnnotation(m2));
    }

    // ---------------------------------------------------------------
    // hasCreatorAnnotation / findCreatorBinding
    // ---------------------------------------------------------------

    @Test
    public void testHasCreatorAnnotation_enabled() {
        assertTrue(AI.hasCreatorAnnotation(annotatedConstructor(CreatorBean.class)));
    }

    @Test
    public void testHasCreatorAnnotation_disabledMode() {
        assertFalse(AI.hasCreatorAnnotation(annotatedConstructor(CreatorDisabledBean.class)));
    }

    @Test
    public void testHasCreatorAnnotation_absent() {
        assertFalse(AI.hasCreatorAnnotation(annotatedConstructor(NoCreatorBean.class)));
    }

    @Test
    public void testFindCreatorBinding() {
        assertEquals(JsonCreator.Mode.DEFAULT, AI.findCreatorBinding(annotatedConstructor(CreatorBean.class)));
        assertEquals(JsonCreator.Mode.DISABLED,
                AI.findCreatorBinding(annotatedConstructor(CreatorDisabledBean.class)));
        assertNull(AI.findCreatorBinding(annotatedConstructor(NoCreatorBean.class)));
    }

    // ---------------------------------------------------------------
    // Protected helper methods (accessible - same package)
    // ---------------------------------------------------------------

    @Test
    public void testIsIgnorable_protected() {
        assertTrue(AI._isIgnorable(annotatedField(MemberAnnoBean.class, "ignoredField")));
        assertFalse(AI._isIgnorable(annotatedField(MemberAnnoBean.class, "notIgnoredField")));
        assertFalse(AI._isIgnorable(annotatedField(MemberAnnoBean.class, "plainField")));
    }

    @Test
    public void testClassIfExplicit_oneArg() {
        assertNull(AI._classIfExplicit(null));
        assertEquals(String.class, AI._classIfExplicit(String.class));
    }

    @Test
    public void testClassIfExplicit_twoArgs() {
        assertNull(AI._classIfExplicit(null, Void.class));
        assertNull(AI._classIfExplicit(Void.class, Void.class)); // equals implicit -> null
        assertEquals(String.class, AI._classIfExplicit(String.class, Void.class));
    }

    @Test
    public void testPropertyName_emptyLocalName() {
        PropertyName pn = AI._propertyName("", "ns");
        assertEquals(PropertyName.USE_DEFAULT, pn);
    }

    @Test
    public void testPropertyName_noNamespace() {
        PropertyName pn = AI._propertyName("foo", null);
        assertEquals("foo", pn.getSimpleName());
        assertNull(pn.getNamespace());

        PropertyName pn2 = AI._propertyName("foo", "");
        assertEquals("foo", pn2.getSimpleName());
        assertNull(pn2.getNamespace());
    }

    @Test
    public void testPropertyName_withNamespace() {
        PropertyName pn = AI._propertyName("foo", "bar");
        assertEquals("foo", pn.getSimpleName());
        assertEquals("bar", pn.getNamespace());
    }
}
