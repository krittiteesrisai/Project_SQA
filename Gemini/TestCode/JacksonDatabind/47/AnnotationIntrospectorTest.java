package com.fasterxml.jackson.databind;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.util.*;

import static org.junit.Assert.*;

public class AnnotationIntrospectorTest {

    private AnnotationIntrospector introspector;
    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        introspector = new AnnotationIntrospector() {
            @Override
            public Version version() {
                return Version.unknownVersion();
            }
        };
    }

    @After
    public void tearDown() {
        introspector = null;
        mapper = null;
    }

    // --- Helper Dummy Enum for testing findEnumValues ---
    private enum DummyEnum {
        VAL1, VAL2
    }

    // --- Concrete Subclass with custom overrides for testing refinement branches ---
    private static class CustomAnnotationIntrospector extends AnnotationIntrospector {
        private final Class<?> serType;
        private final Class<?> keySerType;
        private final Class<?> contentSerType;
        private final Class<?> deserType;
        private final Class<?> keyDeserType;
        private final Class<?> contentDeserType;

        public CustomAnnotationIntrospector(Class<?> serType, Class<?> keySerType, Class<?> contentSerType,
                                            Class<?> deserType, Class<?> keyDeserType, Class<?> contentDeserType) {
            this.serType = serType;
            this.keySerType = keySerType;
            this.contentSerType = contentSerType;
            this.deserType = deserType;
            this.keyDeserType = keyDeserType;
            this.contentDeserType = contentDeserType;
        }

        @Override public Version version() { return Version.unknownVersion(); }

        @Override
        public Class<?> findSerializationType(Annotated a) { return serType; }

        @Override
        public Class<?> findSerializationKeyType(Annotated am, JavaType baseType) { return keySerType; }

        @Override
        public Class<?> findSerializationContentType(Annotated am, JavaType baseType) { return contentSerType; }

        @Override
        public Class<?> findDeserializationType(Annotated am, JavaType baseType) { return deserType; }

        @Override
        public Class<?> findDeserializationKeyType(Annotated am, JavaType baseKeyType) { return keyDeserType; }

        @Override
        public Class<?> findDeserializationContentType(Annotated am, JavaType baseContentType) { return contentDeserType; }
    }

    @Test
    public void testNopAndPairAndHelpers() {
        assertNotNull(AnnotationIntrospector.nopInstance());
        assertNotNull(AnnotationIntrospector.pair(AnnotationIntrospector.nopInstance(), AnnotationIntrospector.nopInstance()));
        
        Collection<AnnotationIntrospector> list = introspector.allIntrospectors();
        assertEquals(1, list.size());
        
        List<AnnotationIntrospector> results = new ArrayList<>();
        Collection<AnnotationIntrospector> filled = introspector.allIntrospectors(results);
        assertSame(results, filled);
        assertEquals(1, filled.size());

        assertFalse(introspector.isAnnotationBundle(null));
        assertNull(introspector.findObjectIdInfo(null));
        
        ObjectIdInfo info = new ObjectIdInfo(null, null, null, null);
        assertSame(info, introspector.findObjectReferenceInfo(null, info));
        assertNull(introspector.findRootName(null));
        assertNull(introspector.findPropertiesToIgnore(null, true));
        assertNull(introspector.findPropertiesToIgnore(null));
        assertNull(introspector.findIgnoreUnknownProperties(null));
        assertNull(introspector.isIgnorableType(null));
        assertNull(introspector.findFilterId(null));
        assertNull(introspector.findNamingStrategy(null));
        assertNull(introspector.findClassDescription(null));
    }

    @Test
    public void testVisibilityAndResolvers() {
        VisibilityChecker<?> vc = VisibilityChecker.Std.defaultInstance();
        assertSame(vc, introspector.findAutoDetectVisibility(null, vc));
        assertNull(introspector.findTypeResolver(null, null, null));
        assertNull(introspector.findPropertyTypeResolver(null, null, null));
        assertNull(introspector.findPropertyContentTypeResolver(null, null, null));
        assertNull(introspector.findSubtypes(null));
        assertNull(introspector.findTypeName(null));
        assertNull(introspector.isTypeId(null));
    }

    @Test
    public void testMemberAnnotations() {
        assertNull(introspector.findReferenceType(null));
        assertNull(introspector.findUnwrappingNameTransformer(null));
        assertFalse(introspector.hasIgnoreMarker(null));
        assertNull(introspector.findInjectableValueId(null));
        assertNull(introspector.hasRequiredMarker(null));
        assertNull(introspector.findViews(null));
        assertNull(introspector.findFormat(null));
        assertNull(introspector.findWrapperName(null));
        assertNull(introspector.findPropertyDefaultValue(null));
        assertNull(introspector.findPropertyDescription(null));
        assertNull(introspector.findPropertyIndex(null));
        assertNull(introspector.findImplicitPropertyName(null));
        assertNull(introspector.findPropertyAccess(null));
        assertNull(introspector.resolveSetterConflict(null, null, null));
    }

    @Test
    public void testSerializationAnnotations() {
        assertNull(introspector.findSerializer(null));
        assertNull(introspector.findKeySerializer(null));
        assertNull(introspector.findContentSerializer(null));
        assertNull(introspector.findNullSerializer(null));
        assertNull(introspector.findSerializationTyping(null));
        assertNull(introspector.findSerializationConverter(null));
        assertNull(introspector.findSerializationContentConverter(null));
        assertEquals(JsonInclude.Include.ALWAYS, introspector.findSerializationInclusion(null, JsonInclude.Include.ALWAYS));
        assertEquals(JsonInclude.Include.ALWAYS, introspector.findSerializationInclusionForContent(null, JsonInclude.Include.ALWAYS));
        assertNotNull(introspector.findPropertyInclusion(null));
        assertNull(introspector.findSerializationPropertyOrder(null));
        assertNull(introspector.findSerializationSortAlphabetically(null));
        
        // test findAndAddVirtualProperties (void return, shouldn't throw)
        introspector.findAndAddVirtualProperties(null, null, new ArrayList<>());
        
        assertNull(introspector.findNameForSerialization(null));
        assertFalse(introspector.hasAsValueAnnotation(null));
        
        Enum<?> e = DummyEnum.VAL1;
        assertEquals("VAL1", introspector.findEnumValue(e));

        String[] names = new String[] { null, "Explicit" };
        Enum<?>[] enumValues = DummyEnum.values();
        String[] updatedNames = introspector.findEnumValues(DummyEnum.class, enumValues, names);
        assertEquals("VAL1", updatedNames[0]);
        assertEquals("Explicit", updatedNames[1]);
    }

    @Test
    public void testDeserializationAnnotations() {
        assertNull(introspector.findDeserializer(null));
        assertNull(introspector.findKeyDeserializer(null));
        assertNull(introspector.findContentDeserializer(null));
        assertNull(introspector.findDeserializationConverter(null));
        assertNull(introspector.findDeserializationContentConverter(null));
        assertNull(introspector.findValueInstantiator(null));
        assertNull(introspector.findPOJOBuilder(null));
        assertNull(introspector.findPOJOBuilderConfig(null));
        assertNull(introspector.findNameForDeserialization(null));
        assertFalse(introspector.hasAnySetterAnnotation(null));
        assertFalse(introspector.hasAnyGetterAnnotation(null));
        assertFalse(introspector.hasCreatorAnnotation(null));
        assertNull(introspector.findCreatorBinding(null));
    }

    @Test
    public void testRefineSerializationTypeWithStaticTyping() throws Exception {
        JavaType baseType = mapper.constructType(String.class);
        AnnotationIntrospector custom = new CustomAnnotationIntrospector(String.class, null, null, null, null, null);
        MapperConfig<?> config = mapper.getSerializationConfig();
        JavaType refined = custom.refineSerializationType(config, null, baseType);
        assertNotNull(refined);
        assertTrue(refined.isStaticTyping());
    }

    @Test
    public void testRefineSerializationTypeGeneralized() throws Exception {
        JavaType baseType = mapper.constructType(String.class);
        AnnotationIntrospector custom = new CustomAnnotationIntrospector(CharSequence.class, null, null, null, null, null);
        MapperConfig<?> config = mapper.getSerializationConfig();
        JavaType refined = custom.refineSerializationType(config, null, baseType);
        assertNotNull(refined);
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineSerializationTypeException() throws Exception {
        JavaType baseType = mapper.constructType(Integer.class);
        // String cannot widen Integer
        AnnotationIntrospector custom = new CustomAnnotationIntrospector(String.class, null, null, null, null, null);
        MapperConfig<?> config = mapper.getSerializationConfig();
        custom.refineSerializationType(config, null, baseType);
    }

    @Test
    public void testRefineSerializationMapLikeType() throws Exception {
        JavaType baseType = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, Integer.class);
        // Key class equal (static typing), content class generalized
        AnnotationIntrospector custom = new CustomAnnotationIntrospector(null, String.class, Number.class, null, null, null);
        MapperConfig<?> config = mapper.getSerializationConfig();
        JavaType refined = custom.refineSerializationType(config, null, baseType);
        assertNotNull(refined);
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineSerializationMapKeyUnrelatedException() throws Exception {
        JavaType baseType = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, Integer.class);
        // Integer and Boolean are unrelated for key type
        AnnotationIntrospector custom = new CustomAnnotationIntrospector(null, Boolean.class, null, null, null, null);
        MapperConfig<?> config = mapper.getSerializationConfig();
        custom.refineSerializationType(config, null, baseType);
    }

    @Test
    public void testRefineDeserializationType() throws Exception {
        JavaType baseType = mapper.constructType(CharSequence.class);
        AnnotationIntrospector custom = new CustomAnnotationIntrospector(null, null, null, String.class, null, null);
        MapperConfig<?> config = mapper.getDeserializationConfig();
        JavaType refined = custom.refineDeserializationType(config, null, baseType);
        assertNotNull(refined);
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineDeserializationTypeException() throws Exception {
        JavaType baseType = mapper.constructType(String.class);
        // Cannot narrow String to Integer
        AnnotationIntrospector custom = new CustomAnnotationIntrospector(null, null, null, Integer.class, null, null);
        MapperConfig<?> config = mapper.getDeserializationConfig();
        custom.refineDeserializationType(config, null, baseType);
    }

    @Test
    public void testRefineDeserializationMapAndContainer() throws Exception {
        JavaType baseType = mapper.getTypeFactory().constructMapType(HashMap.class, CharSequence.class, Number.class);
        AnnotationIntrospector custom = new CustomAnnotationIntrospector(null, null, null, null, String.class, Integer.class);
        MapperConfig<?> config = mapper.getDeserializationConfig();
        JavaType refined = custom.refineDeserializationType(config, null, baseType);
        assertNotNull(refined);
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineDeserializationKeyException() throws Exception {
        JavaType baseType = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, Integer.class);
        AnnotationIntrospector custom = new CustomAnnotationIntrospector(null, null, null, null, Boolean.class, null);
        MapperConfig<?> config = mapper.getDeserializationConfig();
        custom.refineDeserializationType(config, null, baseType);
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineDeserializationContentException() throws Exception {
        JavaType baseType = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        AnnotationIntrospector custom = new CustomAnnotationIntrospector(null, null, null, null, null, Integer.class);
        MapperConfig<?> config = mapper.getDeserializationConfig();
        custom.refineDeserializationType(config, null, baseType);
    }
}