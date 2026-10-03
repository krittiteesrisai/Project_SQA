package com.fasterxml.jackson.databind.introspect;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.StdDateFormat;

public class JacksonAnnotationIntrospectorTest {

    MapperConfig<?> config;
    JacksonAnnotationIntrospector introspector;

    @Before
    public void setUp() {
        introspector = new JacksonAnnotationIntrospector();
        config = null; // บางเมธอดเรียกใช้ config เป็น null หรือต้องการ configuration พื้นฐาน
    }

    @Test
    public void testVersion() {
        Version version = introspector.version();
        assertNotNull(version);
    }

    // --- Dummy annotated classes/methods for testing ---

    @JacksonAnnotationsInside
    @Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @interface BundledAnnotation {}

    @BundledAnnotation
    static class BundledClass {}

    @JsonRootName(value = "root", namespace = "")
    static class RootNameClassEmptyNs {}

    @JsonRootName(value = "root", namespace = "http://example.com")
    static class RootNameClassWithNs {}

    @JsonIgnoreProperties(value = {"prop1"}, ignoreUnknown = true, allowGetters = true, allowSetters = true)
    static class IgnorePropsClass {}

    @JsonIgnoreType
    static class IgnoreTypeClass {}

    @JsonFilter("myFilter")
    static class FilterClass {}

    @JsonFilter("")
    static class EmptyFilterClass {}

    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    static class NamingClass {}

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    static class AutoDetectClass {}

    static class DummyMemberClass {
        @JsonProperty(required = true, access = JsonProperty.Access.READ_ONLY, index = 5, defaultValue = "defaultVal")
        public String prop;

        @JsonProperty(defaultValue = "")
        public String emptyDefaultProp;

        @JsonProperty
        public String noValueProp;

        @JsonManagedReference("ref")
        public String managedRef;

        @JsonBackReference("ref")
        public String backRef;

        @JsonUnwrapped(enabled = true, prefix = "pre_", suffix = "_suf")
        public String unwrappedProp;

        @JsonUnwrapped(enabled = false)
        public String unwrappedDisabledProp;

        @JacksonInject(value = "injectId")
        public String injectId;

        @JacksonInject(value = "")
        public String injectEmptyId;

        @JsonView({String.class})
        public String viewProp;

        @JsonPropertyDescription("desc")
        public String descProp;

        @JsonGetter("getterName")
        public String getGetter() { return ""; }

        @JsonValue
        public String asValue() { return ""; }
        
        @JsonAnySetter
        public void anySetter(String k, Object v) {}

        @JsonAnyGetter
        public java.util.Map<String, Object> anyGetter() { return null; }

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        public DummyMemberClass() {}

        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        public DummyMemberClass(int i) {}
    }

    @JsonSubTypes({@JsonSubTypes.Type(value = String.class, name = "str")})
    @JsonTypeName("typeName")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    @JsonPropertyOrder(value = {"a", "b"}, alphabetic = true)
    static class ComplexClass {}

    @Test
    public void testIsAnnotationBundle() throws Exception {
        Annotation ann = BundledClass.class.getAnnotation(BundledAnnotation.class);
        assertTrue(introspector.isAnnotationBundle(ann));

        Annotation normalAnn = BundledClass.class.getAnnotation(JacksonAnnotationsInside.class);
        // Returns false if annotation itself doesn't have JacksonAnnotationsInside
        assertFalse(introspector.isAnnotationBundle(BundledClass.class.getAnnotation(JsonRootName.class)));
    }

    @Test
    public void testFindRootName() {
        AnnotatedClass acEmpty = AnnotatedClass.constructWithoutSuperTypes(RootNameClassEmptyNs.class, null, null);
        assertNotNull(introspector.findRootName(acEmpty));

        AnnotatedClass acNs = AnnotatedClass.constructWithoutSuperTypes(RootNameClassWithNs.class, null, null);
        assertNotNull(introspector.findRootName(acNs));

        AnnotatedClass acNull = AnnotatedClass.constructWithoutSuperTypes(String.class, null, null);
        assertNull(introspector.findRootName(acNull));
    }

    @Test
    public void testFindPropertiesToIgnore() {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(IgnorePropsClass.class, null, null);
        
        // For serialization with allowGetters = true -> returns null
        assertNull(introspector.findPropertiesToIgnore(ac, true));
        // For deserialization with allowSetters = true -> returns null
        assertNull(introspector.findPropertiesToIgnore(ac, false));
        
        // Deprecated method
        assertNotNull(introspector.findPropertiesToIgnore(ac));

        AnnotatedClass acNull = AnnotatedClass.constructWithoutSuperTypes(String.class, null, null);
        assertNull(introspector.findPropertiesToIgnore(acNull, true));
        assertNull(introspector.findPropertiesToIgnore(acNull));
    }

    @Test
    public void testFindIgnoreUnknownPropertiesAndType() {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(IgnorePropsClass.class, null, null);
        assertTrue(introspector.findIgnoreUnknownProperties(ac));

        AnnotatedClass acType = AnnotatedClass.constructWithoutSuperTypes(IgnoreTypeClass.class, null, null);
        assertTrue(introspector.isIgnorableType(acType));

        AnnotatedClass acNull = AnnotatedClass.constructWithoutSuperTypes(String.class, null, null);
        assertNull(introspector.findIgnoreUnknownProperties(acNull));
        assertNull(introspector.isIgnorableType(acNull));
    }

    @Test
    public void testFindFilterId() {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(FilterClass.class, null, null);
        assertEquals("myFilter", introspector.findFilterId(ac));
        assertEquals("myFilter", introspector.findFilterId((Annotated) ac));

        AnnotatedClass acEmpty = AnnotatedClass.constructWithoutSuperTypes(EmptyFilterClass.class, null, null);
        assertNull(introspector.findFilterId(acEmpty));

        AnnotatedClass acNull = AnnotatedClass.constructWithoutSuperTypes(String.class, null, null);
        assertNull(introspector.findFilterId(acNull));
    }

    @Test
    public void testFindNamingStrategy() {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(NamingClass.class, null, null);
        assertEquals(PropertyNamingStrategy.SnakeCaseStrategy.class, introspector.findNamingStrategy(ac));

        AnnotatedClass acNull = AnnotatedClass.constructWithoutSuperTypes(String.class, null, null);
        assertNull(introspector.findNamingStrategy(acNull));
    }

    @Test
    public void testFindAutoDetectVisibility() {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(AutoDetectClass.class, null, null);
        VisibilityChecker<?> checker = VisibilityChecker.Std.defaultInstance();
        assertNotNull(introspector.findAutoDetectVisibility(ac, checker));

        AnnotatedClass acNull = AnnotatedClass.constructWithoutSuperTypes(String.class, null, null);
        assertEquals(checker, introspector.findAutoDetectVisibility(acNull, checker));
    }

    @Test
    public void testMemberAnnotations() throws Exception {
        AnnotatedMethod am = AnnotatedClass.constructWithoutSuperTypes(DummyMemberClass.class, null, null)
                .methods().iterator().next();
        
        assertNull(introspector.findImplicitPropertyName(am));
        assertFalse(introspector.hasIgnoreMarker(am));

        AnnotatedField af = AnnotatedClass.constructWithoutSuperTypes(DummyMemberClass.class, null, null)
                .fields().iterator().next();

        assertTrue(introspector.hasRequiredMarker(af));
        assertEquals(JsonProperty.Access.READ_ONLY, introspector.findPropertyAccess(af));
        assertEquals("desc", introspector.findPropertyDescription(af));
        assertEquals(Integer.valueOf(5), introspector.findPropertyIndex(af));
        assertEquals("defaultVal", introspector.findPropertyDefaultValue(af));

        // Empty default value -> null
        AnnotatedField afEmpty = null;
        for (AnnotatedField f : AnnotatedClass.constructWithoutSuperTypes(DummyMemberClass.class, null, null).fields()) {
            if (f.getName().equals("emptyDefaultProp")) afEmpty = f;
        }
        assertNull(introspector.findPropertyDefaultValue(afEmpty));

        // Null property
        AnnotatedField afNull = AnnotatedClass.constructWithoutSuperTypes(String.class, null, null).fields().iterator().hasNext() ? 
                null : null;
        assertNull(introspector.findPropertyDefaultValue(afNull));
    }

    @Test
    public void testFindReferenceTypeAndUnwrapped() {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(DummyMemberClass.class, null, null);
        for (AnnotatedField f : ac.fields()) {
            if (f.getName().equals("managedRef")) {
                assertNotNull(introspector.findReferenceType(f));
            }
            if (f.getName().equals("backRef")) {
                assertNotNull(introspector.findReferenceType(f));
            }
            if (f.getName().equals("unwrappedProp")) {
                assertNotNull(introspector.findUnwrappingNameTransformer(f));
            }
            if (f.getName().equals("unwrappedDisabledProp")) {
                assertNull(introspector.findUnwrappingNameTransformer(f));
            }
        }
    }

    @Test
    public void testFindInjectableValueId() {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(DummyMemberClass.class, null, null);
        for (AnnotatedField f : ac.fields()) {
            if (f.getName().equals("injectId")) {
                assertEquals("injectId", introspector.findInjectableValueId(f));
            }
            if (f.getName().equals("injectEmptyId")) {
                assertNotNull(introspector.findInjectableValueId(f));
            }
        }
    }

    @Test
    public void testPolymorphicAndSubtypes() {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(ComplexClass.class, null, null);
        assertNotNull(introspector.findSubtypes(ac));
        assertEquals("typeName", introspector.findTypeName(ac));
        assertNotNull(introspector.findObjectIdInfo(ac));
    }

    @Test
    public void testSerializationAnnotations() {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(ComplexClass.class, null, null);
        assertNotNull(introspector.findSerializationPropertyOrder(ac));
        assertTrue(introspector.findSerializationSortAlphabetically(ac));
        assertTrue(introspector.findSerializationSortAlphabetically((Annotated) ac));
    }

    @Test
    public void testDeserializationGeneralAnnotations() {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(DummyMemberClass.class, null, null);
        assertNull(introspector.findValueInstantiator(ac));
        assertNull(introspector.findPOJOBuilder(ac));
        assertNull(introspector.findPOJOBuilderConfig(ac));

        for (AnnotatedMethod am : ac.methods()) {
            if (am.getName().equals("anySetter")) {
                assertTrue(introspector.hasAnySetterAnnotation(am));
            }
            if (am.getName().equals("anyGetter")) {
                assertTrue(introspector.hasAnyGetterAnnotation(am));
            }
            if (am.getName().equals("asValue")) {
                assertTrue(introspector.hasAsValueAnnotation(am));
            }
        }
    }

    @Test
    public void testCreatorAnnotations() {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(DummyMemberClass.class, null, null);
        for (AnnotatedMethod am : ac.methods()) {
            if (am.getParameterCount() == 0 && am.getAnnotated().getAnnotation(JsonCreator.class) != null) {
                assertTrue(introspector.hasCreatorAnnotation(am));
                assertEquals(JsonCreator.Mode.PROPERTIES, introspector.findCreatorBinding(am));
            }
        }
    }
}