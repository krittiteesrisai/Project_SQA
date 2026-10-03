package com.fasterxml.jackson.databind.introspect;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.NameTransformer;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

public class JacksonAnnotationIntrospectorTest {

    private JacksonAnnotationIntrospector introspector;
    private ObjectMapper mapper;
    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        introspector = new JacksonAnnotationIntrospector();
        mapper = new ObjectMapper();
        typeFactory = mapper.getTypeFactory();
    }

    @Test
    public void testVersion() {
        assertNotNull(introspector.version());
    }

    @Test
    public void testReadResolve() {
        Object resolved = introspector.readResolve();
        assertNotNull(resolved);
        assertSame(introspector, resolved);
    }

    @Test
    public void testSetConstructorPropertiesImpliesCreator() {
        JacksonAnnotationIntrospector result = introspector.setConstructorPropertiesImpliesCreator(false);
        assertSame(introspector, result);
    }

    @Test
    public void testIsAnnotationBundle() {
        Annotation ann = SampleAnnotatedClass.class.getAnnotation(JsonInclude.class);
        // JsonInclude doesn't have JacksonAnnotationsInside, so should be false
        boolean isBundle = introspector.isAnnotationBundle(ann);
        assertFalse(isBundle);
    }

    @Test
    public void testFindEnumValue() {
        // Standard enum
        String name = introspector.findEnumValue(SampleEnum.STANDARD);
        assertEquals("STANDARD", name);
    }

    @Test
    public void testFindRootName() {
        AnnotatedClass ac = AnnotatedClass.construct(SampleRootNamedClass.class, mapper.getSerializationConfig());
        PropertyName name = introspector.findRootName(ac);
        assertNotNull(name);
        assertEquals("customRoot", name.getSimpleName());
    }

    @Test
    public void testFindRootName_NullAndEmptyNamespace() {
        AnnotatedClass ac = AnnotatedClass.construct(SampleClassWithoutRoot.class, mapper.getSerializationConfig());
        assertNull(introspector.findRootName(ac));
    }

    @Test
    public void testFindPropertiesToIgnore_Legacy() {
        AnnotatedClass ac = AnnotatedClass.construct(SampleIgnoredPropsClass.class, mapper.getSerializationConfig());
        String[] ignored = introspector.findPropertiesToIgnore(ac);
        assertNotNull(ignored);
        assertArrayEquals(new String[]{"prop1"}, ignored);
        
        AnnotatedClass acClean = AnnotatedClass.construct(SampleClassWithoutRoot.class, mapper.getSerializationConfig());
        assertNull(introspector.findPropertiesToIgnore(acClean));
    }

    @Test
    public void testFindPropertiesToIgnore_ForSerialization() {
        AnnotatedClass ac = AnnotatedClass.construct(SampleAllowGettersClass.class, mapper.getSerializationConfig());
        // serialization = true, allowGetters = true -> returns null
        assertNull(introspector.findPropertiesToIgnore(ac, true));
        // serialization = false, allowSetters = true -> returns null
        assertNull(introspector.findPropertiesToIgnore(ac, false));
    }

    @Test
    public void testFindIgnoreUnknownProperties() {
        AnnotatedClass ac = AnnotatedClass.construct(SampleIgnoreUnknownClass.class, mapper.getSerializationConfig());
        Boolean ignore = introspector.findIgnoreUnknownProperties(ac);
        assertEquals(Boolean.TRUE, ignore);

        AnnotatedClass acClean = AnnotatedClass.construct(SampleClassWithoutRoot.class, mapper.getSerializationConfig());
        assertNull(introspector.findIgnoreUnknownProperties(acClean));
    }

    @Test
    public void testIsIgnorableType() {
        AnnotatedClass ac = AnnotatedClass.construct(SampleIgnorableTypeClass.class, mapper.getSerializationConfig());
        Boolean ignorable = introspector.isIgnorableType(ac);
        assertEquals(Boolean.TRUE, ignorable);

        AnnotatedClass acClean = AnnotatedClass.construct(SampleClassWithoutRoot.class, mapper.getSerializationConfig());
        assertNull(introspector.isIgnorableType(acClean));
    }

    @Test
    public void testFindFilterId() {
        AnnotatedClass ac = AnnotatedClass.construct(SampleFilteredClass.class, mapper.getSerializationConfig());
        Object filterId = introspector.findFilterId(ac);
        assertEquals("myFilter", filterId);

        AnnotatedClass acClean = AnnotatedClass.construct(SampleClassWithoutRoot.class, mapper.getSerializationConfig());
        assertNull(introspector.findFilterId(acClean));
    }

    @Test
    public void testFindNamingStrategy() {
        AnnotatedClass ac = AnnotatedClass.construct(SampleNamingClass.class, mapper.getSerializationConfig());
        Object naming = introspector.findNamingStrategy(ac);
        assertNotNull(naming);
    }

    @Test
    public void testFindClassDescription() {
        AnnotatedClass ac = AnnotatedClass.construct(SampleDescriptionClass.class, mapper.getSerializationConfig());
        String desc = introspector.findClassDescription(ac);
        assertEquals("A description", desc);
    }

    @Test
    public void testFindAutoDetectVisibility() {
        AnnotatedClass ac = AnnotatedClass.construct(SampleClassWithoutRoot.class, mapper.getSerializationConfig());
        VisibilityChecker<?> checker = VisibilityChecker.Std.defaultInstance();
        VisibilityChecker<?> result = introspector.findAutoDetectVisibility(ac, checker);
        assertSame(checker, result);
    }

    @Test
    public void testHasRequiredMarker() throws Exception {
        Method m = SamplePropsClass.class.getMethod("getProp");
        AnnotatedMethod am = AnnotatedMethod.construct(mapper.getSerializationConfig(), m, null);
        Boolean required = introspector.hasRequiredMarker(am);
        assertEquals(Boolean.TRUE, required);
    }

    @Test
    public void testFindPropertyAccess() throws Exception {
        Method m = SamplePropsClass.class.getMethod("getProp");
        AnnotatedMethod am = AnnotatedMethod.construct(mapper.getSerializationConfig(), m, null);
        JsonProperty.Access access = introspector.findPropertyAccess(am);
        assertEquals(JsonProperty.Access.READ_ONLY, access);
    }

    @Test
    public void testFindPropertyDescription() throws Exception {
        Method m = SamplePropsClass.class.getMethod("getProp");
        AnnotatedMethod am = AnnotatedMethod.construct(mapper.getSerializationConfig(), m, null);
        String desc = introspector.findPropertyDescription(am);
        assertEquals("prop desc", desc);
    }

    @Test
    public void testFindPropertyIndex() throws Exception {
        Method m = SamplePropsClass.class.getMethod("getIndexedProp");
        AnnotatedMethod am = AnnotatedMethod.construct(mapper.getSerializationConfig(), m, null);
        Integer index = introspector.findPropertyIndex(am);
        assertEquals(Integer.valueOf(2), index);
    }

    @Test
    public void testFindPropertyDefaultValue() throws Exception {
        Method m = SamplePropsClass.class.getMethod("getDefaultProp");
        AnnotatedMethod am = AnnotatedMethod.construct(mapper.getSerializationConfig(), m, null);
        String defVal = introspector.findPropertyDefaultValue(am);
        assertEquals("defaultVal", defVal);

        Method mEmpty = SamplePropsClass.class.getMethod("getProp");
        AnnotatedMethod amEmpty = AnnotatedMethod.construct(mapper.getSerializationConfig(), mEmpty, null);
        assertNull(introspector.findPropertyDefaultValue(amEmpty));
    }

    @Test
    public void testFindFormat() throws Exception {
        Method m = SamplePropsClass.class.getMethod("getFormattedProp");
        AnnotatedMethod am = AnnotatedMethod.construct(mapper.getSerializationConfig(), m, null);
        JsonFormat.Value format = introspector.findFormat(am);
        assertNotNull(format);
    }

    @Test
    public void testFindUnwrappingNameTransformer() throws Exception {
        Method m = SampleUnwrappedClass.class.getMethod("getUnwrapped");
        AnnotatedMethod am = AnnotatedMethod.construct(mapper.getSerializationConfig(), m, null);
        NameTransformer transformer = introspector.findUnwrappingNameTransformer(am);
        assertNotNull(transformer);
    }

    @Test
    public void testResolveSetterConflict() throws Exception {
        Method setterPrimitive = SampleSetters.class.getMethod("setX", int.class);
        Method setterBoxed = SampleSetters.class.getMethod("setX", Integer.class);
        Method setterString = SampleSetters.class.getMethod("setX", String.class);
        Method setterObject = SampleSetters.class.getMethod("setX", Object.class);

        AnnotatedMethod amPrim = AnnotatedMethod.construct(mapper.getSerializationConfig(), setterPrimitive, null);
        AnnotatedMethod amBoxed = AnnotatedMethod.construct(mapper.getSerializationConfig(), setterBoxed, null);
        AnnotatedMethod amString = AnnotatedMethod.construct(mapper.getSerializationConfig(), setterString, null);
        AnnotatedMethod amObj = AnnotatedMethod.construct(mapper.getSerializationConfig(), setterObject, null);

        // Primitive vs Boxed -> Primitive wins
        assertSame(amPrim, introspector.resolveSetterConflict(mapper.getSerializationConfig(), amPrim, amBoxed));
        assertSame(amPrim, introspector.resolveSetterConflict(mapper.getSerializationConfig(), amBoxed, amPrim));

        // String vs Object -> String wins
        assertSame(amString, introspector.resolveSetterConflict(mapper.getSerializationConfig(), amString, amObj));
        assertSame(amString, introspector.resolveSetterConflict(mapper.getSerializationConfig(), amObj, amString));

        // Object vs Object -> null (no resolution)
        assertNull(introspector.resolveSetterConflict(mapper.getSerializationConfig(), amObj, amObj));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindPropertyContentTypeResolver_Exception() throws Exception {
        Method m = SamplePropsClass.class.getMethod("getProp");
        AnnotatedMethod am = AnnotatedMethod.construct(mapper.getSerializationConfig(), m, null);
        JavaType nonContainerType = typeFactory.constructType(String.class);
        introspector.findPropertyContentTypeResolver(mapper.getSerializationConfig(), am, nonContainerType);
    }

    @Test
    public void testFindSubtypes() {
        AnnotatedClass ac = AnnotatedClass.construct(SampleSubtypesClass.class, mapper.getSerializationConfig());
        List<NamedType> subtypes = introspector.findSubtypes(ac);
        assertNotNull(subtypes);
        assertEquals(1, subtypes.size());
    }

    @Test
    public void testFindTypeName() {
        AnnotatedClass ac = AnnotatedClass.construct(SampleTypeNameClass.class, mapper.getSerializationConfig());
        String typeName = introspector.findTypeName(ac);
        assertEquals("customName", typeName);
    }

    @Test
    public void testFindObjectIdInfo() {
        AnnotatedClass ac = AnnotatedClass.construct(SampleObjectIdClass.class, mapper.getSerializationConfig());
        ObjectIdInfo info = introspector.findObjectIdInfo(ac);
        assertNotNull(info);
        assertEquals("id", info.getPropertyName().getSimpleName());
    }

    @Test
    public void testFindSerializationSortAlphabetically() {
        AnnotatedClass ac = AnnotatedClass.construct(SampleSortedClass.class, mapper.getSerializationConfig());
        Boolean sort = introspector.findSerializationSortAlphabetically(ac);
        assertEquals(Boolean.TRUE, sort);

        AnnotatedClass acClean = AnnotatedClass.construct(SampleClassWithoutRoot.class, mapper.getSerializationConfig());
        assertNull(introspector.findSerializationSortAlphabetically(acClean));
    }

    // --- Helper Dummy Classes for Testing ---

    private static class SampleAnnotatedClass {}

    private enum SampleEnum {
        @JsonProperty("custom_standard")
        STANDARD
    }

    @JsonRootName(value = "customRoot", namespace = "")
    private static class SampleRootNamedClass {}

    private static class SampleClassWithoutRoot {}

    @JsonIgnoreProperties(value = {"prop1"})
    private static class SampleIgnoredPropsClass {}

    @JsonIgnoreProperties(value = {"prop1"}, allowGetters = true, allowSetters = true)
    private static class SampleAllowGettersClass {}

    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class SampleIgnoreUnknownClass {}

    @JsonIgnoreType
    private static class SampleIgnorableTypeClass {}

    @JsonFilter("myFilter")
    private static class SampleFilteredClass {}

    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    private static class SampleNamingClass {}

    @JsonClassDescription("A description")
    private static class SampleDescriptionClass {}

    private static class SamplePropsClass {
        @JsonProperty(required = true, access = JsonProperty.Access.READ_ONLY, defaultValue = "")
        @JsonPropertyDescription("prop desc")
        public String getProp() { return ""; }

        @JsonProperty(index = 2)
        public int getIndexedProp() { return 1; }

        @JsonProperty(defaultValue = "defaultVal")
        public String getDefaultProp() { return ""; }

        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public String getFormattedProp() { return ""; }
    }

    private static class SampleUnwrappedClass {
        @JsonUnwrapped(prefix = "pre_", suffix = "_suf")
        public String getUnwrapped() { return ""; }
    }

    private static class SampleSetters {
        public void setX(int x) {}
        public void setX(Integer x) {}
        public void setX(String x) {}
        public void setX(Object x) {}
    }

    @JsonSubTypes({@JsonSubTypes.Type(value = String.class, name = "str")})
    private static class SampleSubtypesClass {}

    @JsonTypeName("customName")
    private static class SampleTypeNameClass {}

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    private static class SampleObjectIdClass {
        public String id;
    }

    @JsonPropertyOrder(alphabetic = true)
    private static class SampleSortedClass {}
}