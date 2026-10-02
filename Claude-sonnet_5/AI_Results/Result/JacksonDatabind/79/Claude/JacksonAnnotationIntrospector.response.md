以下は `JacksonAnnotationIntrospector`（Defects4J JacksonDatabind‑79b）に対する JUnit4 テストスイートです。
同一パッケージ（`com.fasterxml.jackson.databind.introspect`）に配置し、`protected` メンバーにも直接アクセスしています。
`Annotated` 系のオブジェクトは Mockito でモック化し、`getAnnotation()` を実際のリフレクションで取得した本物のアノテーションインスタンスに委譲することで、"推測" ではなく実際の Jackson アノテーション仕様に基づいて動作を検証しています。

```java
package com.fasterxml.jackson.databind.introspect;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.beans.ConstructorProperties;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.StdConverter;

/**
 * Unit tests for {@link JacksonAnnotationIntrospector}.
 *
 * NOTE: Since {@code Annotated}/{@code AnnotatedClass}/{@code AnnotatedMethod}/...
 * are complex framework classes, we use Mockito mocks whose {@code getAnnotation()}
 * delegates to *real* annotation instances obtained via reflection on small fixture
 * classes/fields/methods declared below. This avoids guessing annotation default
 * values while still allowing precise control of each branch.
 */
public class JacksonAnnotationIntrospectorTest
{
    private JacksonAnnotationIntrospector introspector;
    private MapperConfig<?> config;
    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        introspector = new JacksonAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        config = mapper.getSerializationConfig();
        typeFactory = TypeFactory.defaultInstance();
    }

    // =====================================================================
    // Helper: stub Annotated#getAnnotation(...) to delegate to real reflection
    // =====================================================================
    private static void stubAnnotations(Annotated mockAnnotated, final AnnotatedElement source) {
        doAnswer(new Answer<Annotation>() {
            @Override
            @SuppressWarnings("unchecked")
            public Annotation answer(InvocationOnMock invocation) throws Throwable {
                Class<? extends Annotation> cls = (Class<? extends Annotation>) invocation.getArguments()[0];
                return source.getAnnotation(cls);
            }
        }).when(mockAnnotated).getAnnotation(any(Class.class));
    }

    private static Field field(Class<?> c, String name) throws Exception {
        return c.getDeclaredField(name);
    }

    private static Method method(Class<?> c, String name, Class<?>... params) throws Exception {
        return c.getMethod(name, params);
    }

    // =====================================================================
    // Fixtures
    // =====================================================================

    @Retention(RetentionPolicy.RUNTIME)
    @JacksonAnnotationsInside
    @interface BundleAnno {}

    @Retention(RetentionPolicy.RUNTIME)
    @interface PlainAnno {}

    @BundleAnno
    static class BundleHolder {}

    @PlainAnno
    static class PlainHolder {}

    enum EnumWithProp {
        @JsonProperty("aValue") A,
        @JsonProperty("") B,
        C
    }

    @JsonRootName(value = "root", namespace = "ns1")
    static class RootNameFixture {}
    @JsonRootName(value = "root2")
    static class RootNameNoNamespaceFixture {}
    static class NoAnnotationFixture {}

    @JsonIgnoreProperties(value = {"a", "b"}, ignoreUnknown = true)
    static class IgnorePropsFixture {}
    @JsonIgnoreProperties(value = {"x"}, allowGetters = true)
    static class IgnorePropsAllowGettersFixture {}
    @JsonIgnoreProperties(value = {"y"}, allowSetters = true)
    static class IgnorePropsAllowSettersFixture {}

    @JsonIgnoreType(true)
    static class IgnoreTypeTrueFixture {}
    @JsonIgnoreType(false)
    static class IgnoreTypeFalseFixture {}

    @JsonFilter("myFilter")
    static class FilterFixture {}
    @JsonFilter("")
    static class EmptyFilterFixture {}

    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    static class NamingFixture {}

    @JsonClassDescription("some description")
    static class ClassDescFixture {}

    @JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
    static class AutoDetectFixture {}

    @JsonTypeName("typeNameX")
    static class TypeNameFixture {}

    @JsonPropertyOrder({"b", "a"})
    static class PropOrderFixture {}
    @JsonPropertyOrder(alphabetic = true)
    static class SortAlphaTrueFixture {}
    @JsonPropertyOrder(alphabetic = false)
    static class SortAlphaFalseFixture {}

    @JsonValueInstantiator(com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.class)
    static class ValueInstantiatorFixture {}

    @JsonDeserialize(builder = String.class)
    static class POJOBuilderFixture {}

    @JsonPOJOBuilder(withPrefix = "with", buildMethodName = "create")
    static class POJOBuilderConfigFixture {}

    @JsonSubTypes({
            @JsonSubTypes.Type(value = SubA.class, name = "a"),
            @JsonSubTypes.Type(value = SubB.class, name = "b")
    })
    static class SubTypesFixture {}
    static class SubA extends SubTypesFixture {}
    static class SubB extends SubTypesFixture {}

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
    static class ObjIdFixture {}
    @JsonIdentityInfo(generator = ObjectIdGenerators.None.class)
    static class ObjIdNoneFixture {}

    @JsonIdentityReference(alwaysAsId = true)
    static class ObjRefFixture {}

    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
    static class TypeInfoFixture {}
    @JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
    static class TypeInfoNoneFixture {}

    static class DummySer extends com.fasterxml.jackson.databind.JsonSerializer<Object> {
        @Override
        public void serialize(Object value, com.fasterxml.jackson.core.JsonGenerator gen,
                SerializerProvider serializers) { }
    }
    static class DummyDeser extends com.fasterxml.jackson.databind.JsonDeserializer<Object> {
        @Override
        public Object deserialize(com.fasterxml.jackson.core.JsonParser p, DeserializationContext ctxt) {
            return null;
        }
    }
    static class DummyKeyDeser extends com.fasterxml.jackson.databind.KeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) { return null; }
    }
    static class DummyConverter extends StdConverter<Object,Object> {
        @Override
        public Object convert(Object value) { return value; }
    }

    static class SerFixtures {
        @JsonSerialize(using = DummySer.class, keyUsing = DummySer.class,
                contentUsing = DummySer.class, nullsUsing = DummySer.class)
        String allSerField;

        String noSerField;

        @JsonRawValue(true)
        String rawTrueField;
        @JsonRawValue(false)
        String rawFalseField;

        @JsonInclude(JsonInclude.Include.NON_NULL)
        String inclNonNullField;
        @JsonSerialize(include = JsonSerialize.Inclusion.ALWAYS)
        String inclAlwaysField;
        @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
        String inclNonDefaultField;
        @JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
        String inclNonEmptyField;
        @JsonSerialize(include = JsonSerialize.Inclusion.DEFAULT_INCLUSION)
        String inclDefaultField;
        String inclNoAnnField;

        @JsonInclude(value = JsonInclude.Include.ALWAYS, content = JsonInclude.Include.NON_NULL)
        String inclContentField;
        @JsonInclude(JsonInclude.Include.ALWAYS)
        String inclNoContentField;

        @JsonSerialize(as = Integer.class, keyAs = Long.class, contentAs = Double.class)
        String serTypesField;
        String noSerTypesField;

        @JsonSerialize(typing = JsonSerialize.Typing.STATIC)
        String typingField;

        @JsonSerialize(converter = DummyConverter.class, contentConverter = DummyConverter.class)
        String converterField;
        @JsonSerialize(using = DummySer.class) // converter left as implicit default (None)
        String defaultConverterField;

        @JsonDeserialize(using = DummyDeser.class, keyUsing = DummyKeyDeser.class, contentUsing = DummyDeser.class)
        String allDeserField;
        String noDeserField;

        @JsonDeserialize(converter = DummyConverter.class, contentConverter = DummyConverter.class)
        String deserConverterField;

        @JsonDeserialize(as = Integer.class, keyAs = Long.class, contentAs = Double.class)
        String deserTypesField;

        @JsonProperty(value = "name", required = true, access = JsonProperty.Access.WRITE_ONLY,
                index = 5, defaultValue = "def")
        String propFull;
        @JsonProperty
        String propPlain;
        String propNone;

        @JsonPropertyDescription("desc")
        String descField;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd")
        String formatField;
        String noFormatField;

        @JsonManagedReference("mref")
        String managedField;
        @JsonBackReference("bref")
        String backField;
        String noRefField;

        @JsonUnwrapped(prefix = "p_", suffix = "_s")
        String unwrappedField;
        @JsonUnwrapped(enabled = false)
        String unwrappedDisabledField;
        String noUnwrapField;

        @JsonView({Object.class, String.class})
        String viewField;
        String noViewField;

        @JsonIgnore(true)
        String ignoreTrueField;
        @JsonIgnore(false)
        String ignoreFalseField;
    }

    static class InjectFixtures {
        @JacksonInject
        String noId;
        @JacksonInject("customId")
        String withId;
        String noAnn;
    }

    static class NameFixtures {
        @JsonGetter("g1") public String getFoo() { return null; }
        @JsonProperty("p1") public String getBar() { return null; }
        @JsonManagedReference public String getBaz() { return null; }
        public String getQux() { return null; }

        @JsonSetter("s1") public void setFoo(String v) {}
        @JsonProperty("p2") public void setBar(String v) {}
        @JsonBackReference public void setBaz(String v) {}
        public void setQux(String v) {}

        @JsonValue(true) public String getVal() { return null; }
        @JsonValue(false) public String getVal2() { return null; }
        public String getVal3() { return null; }

        @JsonAnySetter public void anySet(String k, Object v) {}
        public void notAnySet(String k, Object v) {}
        @JsonAnyGetter public java.util.Map<String,Object> anyGet() { return null; }
        public java.util.Map<String,Object> notAnyGet() { return null; }

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES) public NameFixtures() {}
        public NameFixtures(int x) {}
    }

    static class CtorPropsFixture {
        @ConstructorProperties({"name"})
        public CtorPropsFixture(String name) {}
        public CtorPropsFixture() {}
    }

    static class CreatorFixtures {
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        public static CreatorFixtures disabled() { return null; }
        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        public static CreatorFixtures props() { return null; }
    }

    static class TransientFixtures {
        @java.beans.Transient(true) public String getX() { return null; }
        @java.beans.Transient(false) public String getY() { return null; }
        public String getZ() { return null; }
    }

    static class TypeIdFixture {
        @JsonTypeId public String getT() { return null; }
        public String getNoT() { return null; }
    }

    // =====================================================================
    // Tests: version / config
    // =====================================================================

    @Test
    public void testVersionNotNull() {
        assertNotNull(introspector.version());
    }

    @Test
    public void testSetConstructorPropertiesImpliesCreatorFluent() {
        JacksonAnnotationIntrospector self = introspector.setConstructorPropertiesImpliesCreator(false);
        assertSame(introspector, self);
    }

    // =====================================================================
    // isAnnotationBundle
    // =====================================================================

    @Test
    public void testIsAnnotationBundle_True() {
        Annotation ann = BundleHolder.class.getAnnotation(BundleAnno.class);
        assertTrue(introspector.isAnnotationBundle(ann));
        // second call hits cache branch
        assertTrue(introspector.isAnnotationBundle(ann));
    }

    @Test
    public void testIsAnnotationBundle_False() {
        Annotation ann = PlainHolder.class.getAnnotation(PlainAnno.class);
        assertFalse(introspector.isAnnotationBundle(ann));
        assertFalse(introspector.isAnnotationBundle(ann));
    }

    // =====================================================================
    // findEnumValue / findEnumValues
    // =====================================================================

    @Test
    public void testFindEnumValue_WithValue() {
        assertEquals("aValue", introspector.findEnumValue(EnumWithProp.A));
    }

    @Test
    public void testFindEnumValue_EmptyValueFallsBackToName() {
        assertEquals("B", introspector.findEnumValue(EnumWithProp.B));
    }

    @Test
    public void testFindEnumValue_NoAnnotationFallsBackToName() {
        assertEquals("C", introspector.findEnumValue(EnumWithProp.C));
    }

    @Test
    public void testFindEnumValues() {
        EnumWithProp[] values = EnumWithProp.values();
        String[] names = { "A", "B", "C" };
        String[] result = introspector.findEnumValues(EnumWithProp.class, values, names);
        assertEquals("aValue", result[0]);
        assertEquals("B", result[1]); // empty -> unchanged
        assertEquals("C", result[2]); // no annotation -> unchanged
    }

    // =====================================================================
    // findRootName
    // =====================================================================

    @Test
    public void testFindRootName_NoAnnotation() throws Exception {
        AnnotatedClass ac = mock(AnnotatedClass.class);
        stubAnnotations(ac, NoAnnotationFixture.class);
        assertNull(introspector.findRootName(ac));
    }

    @Test
    public void testFindRootName_WithNamespace() throws Exception {
        AnnotatedClass ac = mock(AnnotatedClass.class);
        stubAnnotations(ac, RootNameFixture.class);
        PropertyName pn = introspector.findRootName(ac);
        assertNotNull(pn);
        assertEquals("root", pn.getSimpleName());
        assertEquals("ns1", pn.getNamespace());
    }

    @Test
    public void testFindRootName_EmptyNamespace() throws Exception {
        AnnotatedClass ac = mock(AnnotatedClass.class);
        stubAnnotations(ac, RootNameNoNamespaceFixture.class);
        PropertyName pn = introspector.findRootName(ac);
        assertNotNull(pn);
        assertEquals("root2", pn.getSimpleName());
        assertNull(pn.getNamespace());
    }

    // =====================================================================
    // findPropertiesToIgnore
    // =====================================================================

    @Test
    public void testFindPropertiesToIgnore_Deprecated() throws Exception {
        AnnotatedClass none = mock(AnnotatedClass.class);
        stubAnnotations(none, NoAnnotationFixture.class);
        assertNull(introspector.findPropertiesToIgnore(none));

        AnnotatedClass withAnn = mock(AnnotatedClass.class);
        stubAnnotations(withAnn, IgnorePropsFixture.class);
        assertArrayEquals(new String[]{"a","b"}, introspector.findPropertiesToIgnore(withAnn));
    }

    @Test
    public void testFindPropertiesToIgnore_ForSerialization_AllowGettersTrue() throws Exception {
        AnnotatedClass ac = mock(AnnotatedClass.class);
        stubAnnotations(ac, IgnorePropsAllowGettersFixture.class);
        assertNull(introspector.findPropertiesToIgnore(ac, true));
    }

    @Test
    public void testFindPropertiesToIgnore_ForSerialization_AllowGettersFalse() throws Exception {
        AnnotatedClass ac = mock(AnnotatedClass.class);
        stubAnnotations(ac, IgnorePropsFixture.class);
        assertArrayEquals(new String[]{"a","b"}, introspector.findPropertiesToIgnore(ac, true));
    }

    @Test
    public void testFindPropertiesToIgnore_ForDeserialization_AllowSettersTrue() throws Exception {
        AnnotatedClass ac = mock(AnnotatedClass.class);
        stubAnnotations(ac, IgnorePropsAllowSettersFixture.class);
        assertNull(introspector.findPropertiesToIgnore(ac, false));
    }

    @Test
    public void testFindPropertiesToIgnore_ForDeserialization_AllowSettersFalse() throws Exception {
        AnnotatedClass ac = mock(AnnotatedClass.class);
        stubAnnotations(ac, IgnorePropsFixture.class);
        assertArrayEquals(new String[]{"a","b"}, introspector.findPropertiesToIgnore(ac, false));
    }

    @Test
    public void testFindPropertiesToIgnore_NullAnnotation() throws Exception {
        AnnotatedClass ac = mock(AnnotatedClass.class);
        stubAnnotations(ac, NoAnnotationFixture.class);
        assertNull(introspector.findPropertiesToIgnore(ac, true));
        assertNull(introspector.findPropertiesToIgnore(ac, false));
    }

    // =====================================================================
    // findIgnoreUnknownProperties / isIgnorableType / findFilterId
    // =====================================================================

    @Test
    public void testFindIgnoreUnknownProperties() throws Exception {
        AnnotatedClass yes = mock(AnnotatedClass.class);
        stubAnnotations(yes, IgnorePropsFixture.class);
        assertEquals(Boolean.TRUE, introspector.findIgnoreUnknownProperties(yes));

        AnnotatedClass none = mock(AnnotatedClass.class);
        stubAnnotations(none, NoAnnotationFixture.class);
        assertNull(introspector.findIgnoreUnknownProperties(none));
    }

    @Test
    public void testIsIgnorableType() throws Exception {
        AnnotatedClass t = mock(AnnotatedClass.class);
        stubAnnotations(t, IgnoreTypeTrueFixture.class);
        assertEquals(Boolean.TRUE, introspector.isIgnorableType(t));

        AnnotatedClass f = mock(AnnotatedClass.class);
        stubAnnotations(f, IgnoreTypeFalseFixture.class);
        assertEquals(Boolean.FALSE, introspector.isIgnorableType(f));

        AnnotatedClass none = mock(AnnotatedClass.class);
        stubAnnotations(none, NoAnnotationFixture.class);
        assertNull(introspector.isIgnorableType(none));
    }

    @Test
    public void testFindFilterId() throws Exception {
        Annotated withId = mock(Annotated.class);
        stubAnnotations(withId, FilterFixture.class);
        assertEquals("myFilter", introspector.findFilterId(withId));

        Annotated emptyId = mock(Annotated.class);
        stubAnnotations(emptyId, EmptyFilterFixture.class);
        assertNull(introspector.findFilterId(emptyId));

        Annotated none = mock(Annotated.class);
        stubAnnotations(none, NoAnnotationFixture.class);
        assertNull(introspector.findFilterId(none));
    }

    // =====================================================================
    // findNamingStrategy / findClassDescription / findAutoDetectVisibility
    // =====================================================================

    @Test
    public void testFindNamingStrategy() throws Exception {
        AnnotatedClass ac = mock(AnnotatedClass.class);
        stubAnnotations(ac, NamingFixture.class);
        assertEquals(PropertyNamingStrategy.SnakeCaseStrategy.class, introspector.findNamingStrategy(ac));

        AnnotatedClass none = mock(AnnotatedClass.class);
        stubAnnotations(none, NoAnnotationFixture.class);
        assertNull(introspector.findNamingStrategy(none));
    }

    @Test
    public void testFindClassDescription() throws Exception {
        AnnotatedClass ac = mock(AnnotatedClass.class);
        stubAnnotations(ac, ClassDescFixture.class);
        assertEquals("some description", introspector.findClassDescription(ac));

        AnnotatedClass none = mock(AnnotatedClass.class);
        stubAnnotations(none, NoAnnotationFixture.class);
        assertNull(introspector.findClassDescription(none));
    }

    @Test
    public void testFindAutoDetectVisibility_NullAnnotationReturnsSameChecker() throws Exception {
        AnnotatedClass none = mock(AnnotatedClass.class);
        stubAnnotations(none, NoAnnotationFixture.class);
        VisibilityChecker<?> checker = VisibilityChecker.Std.defaultInstance();
        VisibilityChecker<?> result = introspector.findAutoDetectVisibility(none, checker);
        assertSame(checker, result);
    }

    @Test
    public void testFindAutoDetectVisibility_WithAnnotationReturnsModifiedChecker() throws Exception {
        AnnotatedClass ac = mock(AnnotatedClass.class);
        stubAnnotations(ac, AutoDetectFixture.class);
        VisibilityChecker<?> checker = VisibilityChecker.Std.defaultInstance();
        VisibilityChecker<?> result = introspector.findAutoDetectVisibility(ac, checker);
        assertNotNull(result);
    }

    // =====================================================================
    // hasIgnoreMarker / hasRequiredMarker / findPropertyAccess /
    // findPropertyDescription / findPropertyIndex / findPropertyDefaultValue
    // =====================================================================

    @Test
    public void testHasIgnoreMarker() throws Exception {
        AnnotatedMember t = mock(AnnotatedMember.class);
        stubAnnotations(t, field(SerFixtures.class, "ignoreTrueField"));
        assertTrue(introspector.hasIgnoreMarker(t));

        AnnotatedMember f = mock(AnnotatedMember.class);
        stubAnnotations(f, field(SerFixtures.class, "ignoreFalseField"));
        assertFalse(introspector.hasIgnoreMarker(f));
    }

    @Test
    public void testHasRequiredMarker() throws Exception {
        AnnotatedMember m = mock(AnnotatedMember.class);
        stubAnnotations(m, field(SerFixtures.class, "propFull"));
        assertEquals(Boolean.TRUE, introspector.hasRequiredMarker(m));

        AnnotatedMember none = mock(AnnotatedMember.class);
        stubAnnotations(none, field(SerFixtures.class, "propNone"));
        assertNull(introspector.hasRequiredMarker(none));
    }

    @Test
    public void testFindPropertyAccess() throws Exception {
        Annotated m = mock(Annotated.class);
        stubAnnotations(m, field(SerFixtures.class, "propFull"));
        assertEquals(JsonProperty.Access.WRITE_ONLY, introspector.findPropertyAccess(m));

        Annotated none = mock(Annotated.class);
        stubAnnotations(none, field(SerFixtures.class, "propNone"));
        assertNull(introspector.findPropertyAccess(none));
    }

    @Test
    public void testFindPropertyDescription() throws Exception {
        Annotated m = mock(Annotated.class);
        stubAnnotations(m, field(SerFixtures.class, "descField"));
        assertEquals("desc", introspector.findPropertyDescription(m));

        Annotated none = mock(Annotated.class);
        stubAnnotations(none, field(SerFixtures.class, "propNone"));
        assertNull(introspector.findPropertyDescription(none));
    }

    @Test
    public void testFindPropertyIndex() throws Exception {
        Annotated withIndex = mock(Annotated.class);
        stubAnnotations(withIndex, field(SerFixtures.class, "propFull"));
        assertEquals(Integer.valueOf(5), introspector.findPropertyIndex(withIndex));

        Annotated unknown = mock(Annotated.class);
        stubAnnotations(unknown, field(SerFixtures.class, "propPlain"));
        assertNull(introspector.findPropertyIndex(unknown));

        Annotated none = mock(Annotated.class);
        stubAnnotations(none, field(SerFixtures.class, "propNone"));
        assertNull(introspector.findPropertyIndex(none));
    }

    @Test
    public void testFindPropertyDefaultValue() throws Exception {
        Annotated withDefault = mock(Annotated.class);
        stubAnnotations(withDefault, field(SerFixtures.class, "propFull"));
        assertEquals("def", introspector.findPropertyDefaultValue(withDefault));

        Annotated emptyDefault = mock(Annotated.class);
        stubAnnotations(emptyDefault, field(SerFixtures.class, "propPlain"));
        assertNull(introspector.findPropertyDefaultValue(emptyDefault));

        Annotated none = mock(Annotated.class);
        stubAnnotations(none, field(SerFixtures.class, "propNone"));
        assertNull(introspector.findPropertyDefaultValue(none));
    }

    // =====================================================================
    // findFormat
    // =====================================================================

    @Test
    public void testFindFormat() throws Exception {
        Annotated withFmt = mock(Annotated.class);
        stubAnnotations(withFmt, field(SerFixtures.class, "formatField"));
        JsonFormat.Value v = introspector.findFormat(withFmt);
        assertNotNull(v);
        assertEquals("yyyyMMdd", v.getPattern());
        assertEquals(JsonFormat.Shape.STRING, v.getShape());

        Annotated none = mock(Annotated.class);
        stubAnnotations(none, field(SerFixtures.class, "noFormatField"));
        assertNull(introspector.findFormat(none));
    }

    // =====================================================================
    // findReferenceType
    // =====================================================================

    @Test
    public void testFindReferenceType_Managed() throws Exception {
        AnnotatedMember m = mock(AnnotatedMember.class);
        stubAnnotations(m, field(SerFixtures.class, "managedField"));
        AnnotationIntrospector.ReferenceProperty rp = introspector.findReferenceType(m);
        assertNotNull(rp);
        assertEquals("mref", rp.getName());
    }

    @Test
    public void testFindReferenceType_Back() throws Exception {
        AnnotatedMember m = mock(AnnotatedMember.class);
        stubAnnotations(m, field(SerFixtures.class, "backField"));
        AnnotationIntrospector.ReferenceProperty rp = introspector.findReferenceType(m);
        assertNotNull(rp);
        assertEquals("bref", rp.getName());
    }

    @Test
    public void testFindReferenceType_None() throws Exception {
        AnnotatedMember m = mock(AnnotatedMember.class);
        stubAnnotations(m, field(SerFixtures.class, "noRefField"));
        assertNull(introspector.findReferenceType(m));
    }

    // =====================================================================
    // findUnwrappingNameTransformer
    // =====================================================================

    @Test
    public void testFindUnwrappingNameTransformer_Enabled() throws Exception {
        AnnotatedMember m = mock(AnnotatedMember.class);
        stubAnnotations(m, field(SerFixtures.class, "unwrappedField"));
        NameTransformer nt = introspector.findUnwrappingNameTransformer(m);
        assertNotNull(nt);
        assertEquals("p_x_s", nt.transform("x"));
    }

    @Test
    public void testFindUnwrappingNameTransformer_Disabled() throws Exception {
        AnnotatedMember m = mock(AnnotatedMember.class);
        stubAnnotations(m, field(SerFixtures.class, "unwrappedDisabledField"));
        assertNull(introspector.findUnwrappingNameTransformer(m));
    }

    @Test
    public void testFindUnwrappingNameTransformer_NoAnnotation() throws Exception {
        AnnotatedMember m = mock(AnnotatedMember.class);
        stubAnnotations(m, field(SerFixtures.class, "noUnwrapField"));
        assertNull(introspector.findUnwrappingNameTransformer(m));
    }

    // =====================================================================
    // findInjectableValueId
    // =====================================================================

    @Test
    public void testFindInjectableValueId_NullAnnotation() throws Exception {
        AnnotatedMember m = mock(AnnotatedMember.class);
        stubAnnotations(m, field(InjectFixtures.class, "noAnn"));
        assertNull(introspector.findInjectableValueId(m));
    }

    @Test
    public void testFindInjectableValueId_NonEmptyId() throws Exception {
        AnnotatedMember m = mock(AnnotatedMember.class);
        stubAnnotations(m, field(InjectFixtures.class, "withId"));
        assertEquals("customId", introspector.findInjectableValueId(m));
    }

    @Test
    public void testFindInjectableValueId_EmptyId_NotMethod() throws Exception {
        AnnotatedMember m = mock(AnnotatedMember.class);
        stubAnnotations(m, field(InjectFixtures.class, "noId"));
        when(m.getRawType()).thenReturn((Class) String.class);
        assertEquals(String.class.getName(), introspector.findInjectableValueId(m));
    }

    @Test
    public void testFindInjectableValueId_EmptyId_MethodZeroParams() throws Exception {
        AnnotatedMethod m = mock(AnnotatedMethod.class);
        stubAnnotations(m, field(InjectFixtures.class, "noId"));
        when(m.getParameterCount()).thenReturn(0);
        when(m.getRawType()).thenReturn((Class) String.class);
        assertEquals(String.class.getName(), introspector.findInjectableValueId(m));
    }

    @Test
    public void testFindInjectableValueId_EmptyId_MethodWithParams() throws Exception {
        AnnotatedMethod m = mock(AnnotatedMethod.class);
        stubAnnotations(m, field(InjectFixtures.class, "noId"));
        when(m.getParameterCount()).thenReturn(1);
        when(m.getRawParameterType(0)).thenReturn((Class) Integer.class);
        assertEquals(Integer.class.getName(), introspector.findInjectableValueId(m));
    }

    // =====================================================================
    // findViews
    // =====================================================================

    @Test
    public void testFindViews() throws Exception {
        Annotated m = mock(Annotated.class);
        stubAnnotations(m, field(SerFixtures.class,