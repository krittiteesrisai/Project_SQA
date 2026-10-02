package com.fasterxml.jackson.databind;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

public class AnnotationIntrospectorTest {

    /** Concrete subclass ที่ไม่ override อะไรเลย - ใช้ default implementations ทั้งหมด */
    static class ConcreteIntrospector extends AnnotationIntrospector {
        @Override
        public Version version() { return Version.unknownVersion(); }
    }

    /** Subclass ที่ override deprecated type-methods เพื่อควบคุม branch ของ refine* */
    static class ConfigurableIntrospector extends AnnotationIntrospector {
        Class<?> serType, serKeyType, serContentType;
        Class<?> deserType, deserKeyType, deserContentType;

        @Override public Version version() { return Version.unknownVersion(); }

        @Override
        public Class<?> findSerializationType(Annotated a) { return serType; }
        @Override
        public Class<?> findSerializationKeyType(Annotated am, JavaType baseType) { return serKeyType; }
        @Override
        public Class<?> findSerializationContentType(Annotated am, JavaType baseType) { return serContentType; }

        @Override
        public Class<?> findDeserializationType(Annotated am, JavaType baseType) { return deserType; }
        @Override
        public Class<?> findDeserializationKeyType(Annotated am, JavaType baseKeyType) { return deserKeyType; }
        @Override
        public Class<?> findDeserializationContentType(Annotated am, JavaType baseContentType) { return deserContentType; }
    }

    private enum SampleEnum { A, B }

    private final ObjectMapper mapper = new ObjectMapper();
    private final MapperConfig<?> serConfig = mapper.getSerializationConfig();
    private final MapperConfig<?> deserConfig = mapper.getDeserializationConfig();
    private final Annotated dummyAnnotated = mock(Annotated.class); // getName() -> null by default, ok

    // ---------------------------------------------------------------
    // Factory methods
    // ---------------------------------------------------------------

    @Test
    public void testNopInstanceReturnsSingletonNopIntrospector() {
        AnnotationIntrospector a1 = AnnotationIntrospector.nopInstance();
        AnnotationIntrospector a2 = AnnotationIntrospector.nopInstance();
        assertTrue(a1 instanceof NopAnnotationIntrospector);
        assertSame(a1, a2);
    }

    @Test
    public void testPairFactoryReturnsAnnotationIntrospectorPair() {
        AnnotationIntrospector a1 = new ConcreteIntrospector();
        AnnotationIntrospector a2 = new ConcreteIntrospector();
        AnnotationIntrospector pair = AnnotationIntrospector.pair(a1, a2);
        assertTrue(pair instanceof AnnotationIntrospectorPair);
    }

    // ---------------------------------------------------------------
    // allIntrospectors()
    // ---------------------------------------------------------------

    @Test
    public void testAllIntrospectorsDefaultReturnsSingletonListWithSelf() {
        AnnotationIntrospector introspector = new ConcreteIntrospector();
        Collection<AnnotationIntrospector> result = introspector.allIntrospectors();
        assertEquals(1, result.size());
        assertSame(introspector, result.iterator().next());
    }

    @Test
    public void testAllIntrospectorsWithCollectionAddsSelfToResult() {
        AnnotationIntrospector introspector = new ConcreteIntrospector();
        List<AnnotationIntrospector> list = new ArrayList<AnnotationIntrospector>();
        list.add(new ConcreteIntrospector()); // ของเดิมใน list ต้องยังอยู่
        Collection<AnnotationIntrospector> result = introspector.allIntrospectors(list);
        assertSame(list, result);
        assertEquals(2, result.size());
        assertTrue(result.contains(introspector));
    }

    // ---------------------------------------------------------------
    // Meta-annotation / ObjectId defaults
    // ---------------------------------------------------------------

    @Test
    public void testMetaAndObjectIdDefaults() {
        AnnotationIntrospector introspector = new ConcreteIntrospector();
        assertFalse(introspector.isAnnotationBundle(null));
        assertNull(introspector.findObjectIdInfo(null));

        ObjectIdInfo info = mock(ObjectIdInfo.class);
        // findObjectReferenceInfo ต้อง return "objectIdInfo" ที่ส่งเข้าไปโดยไม่เปลี่ยนแปลง
        assertSame(info, introspector.findObjectReferenceInfo(null, info));
        assertNull(introspector.findObjectReferenceInfo(null, null));
    }

    // ---------------------------------------------------------------
    // General class annotation defaults
    // ---------------------------------------------------------------

    @Test
    public void testGeneralClassAnnotationDefaults() {
        AnnotationIntrospector introspector = new ConcreteIntrospector();
        assertNull(introspector.findRootName(null));
        assertNull(introspector.findPropertiesToIgnore(null, true));
        assertNull(introspector.findPropertiesToIgnore(null, false));
        assertNull(introspector.findIgnoreUnknownProperties(null));
        assertNull(introspector.isIgnorableType(null));
        assertNull(introspector.findFilterId(null));
        assertNull(introspector.findNamingStrategy(null));
        assertNull(introspector.findClassDescription(null));
    }

    @Test
    public void testFindPropertiesToIgnoreDeprecatedDelegatesToTwoArgWithTrue() {
        final boolean[] captured = { false };
        AnnotationIntrospector introspector = new AnnotationIntrospector() {
            @Override public Version version() { return Version.unknownVersion(); }
            @Override
            public String[] findPropertiesToIgnore(Annotated ac, boolean forSerialization) {
                captured[0] = forSerialization;
                return new String[] { "x" };
            }
        };
        String[] result = introspector.findPropertiesToIgnore((Annotated) null);
        assertArrayEquals(new String[] { "x" }, result);
        assertTrue("ควร delegate ด้วย forSerialization=true ตาม comment ในซอร์ส", captured[0]);
    }

    // ---------------------------------------------------------------
    // Auto-detect visibility
    // ---------------------------------------------------------------

    @Test
    public void testFindAutoDetectVisibilityReturnsSameChecker() {
        AnnotationIntrospector introspector = new ConcreteIntrospector();
        VisibilityChecker<?> checker = VisibilityChecker.Std.defaultInstance();
        VisibilityChecker<?> result = introspector.findAutoDetectVisibility(null, checker);
        assertSame(checker, result);
    }

    // ---------------------------------------------------------------
    // Polymorphic type handling defaults
    // ---------------------------------------------------------------

    @Test
    public void testPolymorphicTypeDefaults() {
        AnnotationIntrospector introspector = new ConcreteIntrospector();
        assertNull(introspector.findTypeResolver(null, null, null));
        assertNull(introspector.findPropertyTypeResolver(null, null, null));
        assertNull(introspector.findPropertyContentTypeResolver(null, null, null));
        assertNull(introspector.findSubtypes(null));
        assertNull(introspector.findTypeName(null));
        assertNull(introspector.isTypeId(null));
    }

    // ---------------------------------------------------------------
    // General member annotation defaults
    // ---------------------------------------------------------------

    @Test
    public void testGeneralMemberAnnotationDefaults() {
        AnnotationIntrospector introspector = new ConcreteIntrospector();
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

    // ---------------------------------------------------------------
    // Serialization: general annotation defaults
    // ---------------------------------------------------------------

    @Test
    public void testSerializationGeneralAnnotationDefaults() {
        AnnotationIntrospector introspector = new ConcreteIntrospector();
        assertNull(introspector.findSerializer(null));
        assertNull(introspector.findKeySerializer(null));
        assertNull(introspector.findContentSerializer(null));
        assertNull(introspector.findNullSerializer(null));
        assertNull(introspector.findSerializationTyping(null));
        assertNull(introspector.findSerializationConverter(null));
        assertNull(introspector.findSerializationContentConverter(null));

        assertEquals(JsonInclude.Include.ALWAYS,
                introspector.findSerializationInclusion(null, JsonInclude.Include.ALWAYS));
        assertEquals(JsonInclude.Include.NON_NULL,
                introspector.findSerializationInclusionForContent(null, JsonInclude.Include.NON_NULL));
        assertEquals(JsonInclude.Value.empty(), introspector.findPropertyInclusion(null));
    }

    @Test
    public void testSerializationTypeRefinementDeprecatedDefaults() {
        AnnotationIntrospector introspector = new ConcreteIntrospector();
        assertNull(introspector.findSerializationType(null));
        assertNull(introspector.findSerializationKeyType(null, null));
        assertNull(introspector.findSerializationContentType(null, null));
    }

    // ---------------------------------------------------------------
    // refineSerializationType branches
    // ---------------------------------------------------------------

    @Test
    public void testRefineSerializationType_NoRefinement() throws Exception {
        ConfigurableIntrospector introspector = new ConfigurableIntrospector();
        JavaType base = serConfig.getTypeFactory().constructType(String.class);
        JavaType result = introspector.refineSerializationType(serConfig, dummyAnnotated, base);
        // serClass null, ไม่ mapLike, contentType null -> ต้อง return reference เดิม
        assertSame(base, result);
    }

    @Test
    public void testRefineSerializationType_SameRawClass_StaticTyping() throws Exception {
        ConfigurableIntrospector introspector = new ConfigurableIntrospector();
        introspector.serType = ArrayList.class;
        JavaType base = serConfig.getTypeFactory().constructType(ArrayList.class);
        JavaType result = introspector.refineSerializationType(serConfig, dummyAnnotated, base);
        assertNotNull(result);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testRefineSerializationType_Generalize() throws Exception {
        ConfigurableIntrospector introspector = new ConfigurableIntrospector();
        introspector.serType = List.class; // super type ของ ArrayList
        JavaType base = serConfig.getTypeFactory().constructType(ArrayList.class);
        JavaType result = introspector.refineSerializationType(serConfig, dummyAnnotated, base);
        assertEquals(List.class, result.getRawClass());
    }

    // สมมติฐาน: TypeFactory.constructGeneralizedType จะโยน IllegalArgumentException
    // ถ้าชนิดที่ระบุไม่ได้เป็น super-type ที่สัมพันธ์กันจริง ซึ่งจะถูก catch แล้วห่อเป็น JsonMappingException
    @Test(expected = JsonMappingException.class)
    public void testRefineSerializationType_IncompatibleGeneralizationThrows() throws Exception {
        ConfigurableIntrospector introspector = new ConfigurableIntrospector();
        introspector.serType = Integer.class; // ไม่สัมพันธ์กับ String
        JavaType base = serConfig.getTypeFactory().constructType(String.class);
        introspector.refineSerializationType(serConfig, dummyAnnotated, base);
    }

    @Test
    public void testRefineSerializationType_MapLikeKeyType_Generalize() throws Exception {
        ConfigurableIntrospector introspector = new ConfigurableIntrospector();
        introspector.serKeyType = CharSequence.class; // keyClass.isAssignableFrom(currRaw=String) -> generalize
        JavaType base = serConfig.getTypeFactory()
                .constructMapType(java.util.HashMap.class, String.class, Integer.class);
        JavaType result = introspector.refineSerializationType(serConfig, dummyAnnotated, base);
        assertEquals(CharSequence.class, result.getKeyType().getRawClass());
    }

    @Test
    public void testRefineSerializationType_MapLikeKeyType_Specialize() throws Exception {
        ConfigurableIntrospector introspector = new ConfigurableIntrospector();
        introspector.serKeyType = Integer.class; // currRaw=Object, currRaw.isAssignableFrom(Integer) -> specialize
        JavaType base = serConfig.getTypeFactory()
                .constructMapType(java.util.HashMap.class, Object.class, Integer.class);
        JavaType result = introspector.refineSerializationType(serConfig, dummyAnnotated, base);
        assertEquals(Integer.class, result.getKeyType().getRawClass());
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineSerializationType_MapLikeKeyType_UnrelatedThrows() throws Exception {
        ConfigurableIntrospector introspector = new ConfigurableIntrospector();
        introspector.serKeyType = Integer.class; // ไม่สัมพันธ์กับ String เลย
        JavaType base = serConfig.getTypeFactory()
                .constructMapType(java.util.HashMap.class, String.class, Integer.class);
        introspector.refineSerializationType(serConfig, dummyAnnotated, base);
    }

    @Test
    public void testRefineSerializationType_ContentType_Specialize() throws Exception {
        ConfigurableIntrospector introspector = new ConfigurableIntrospector();
        introspector.serContentType = Integer.class; // currRaw=Object -> specialize
        JavaType base = serConfig.getTypeFactory().constructCollectionType(ArrayList.class, Object.class);
        JavaType result = introspector.refineSerializationType(serConfig, dummyAnnotated, base);
        assertEquals(Integer.class, result.getContentType().getRawClass());
    }

    // ---------------------------------------------------------------
    // Serialization class-level / property-level defaults
    // ---------------------------------------------------------------

    @Test
    public void testSerializationClassAnnotationDefaults() {
        AnnotationIntrospector introspector = new ConcreteIntrospector();
        assertNull(introspector.findSerializationPropertyOrder(null));
        assertNull(introspector.findSerializationSortAlphabetically(null));

        List<BeanPropertyWriter> props = new ArrayList<BeanPropertyWriter>();
        introspector.findAndAddVirtualProperties(serConfig, null, props);
        assertTrue("ค่า default ควรเป็น no-op ไม่เพิ่มอะไรเข้า list", props.isEmpty());
    }

    @Test
    public void testSerializationPropertyAnnotationDefaults() {
        AnnotationIntrospector introspector = new ConcreteIntrospector();
        assertNull(introspector.findNameForSerialization(null));
        assertFalse(introspector.hasAsValueAnnotation(null));
        assertEquals("A", introspector.findEnumValue(SampleEnum.A));
    }

    @Test
    public void testFindEnumValuesLoopOnlyFillsNullEntries() {
        AnnotationIntrospector introspector = new ConcreteIntrospector();
        String[] names = new String[] { null, "explicitB" };
        String[] result = introspector.findEnumValues(SampleEnum.class, SampleEnum.values(), names);
        assertSame(names, result);
        assertEquals("A", result[0]);           // names[0]==null -> ถูก fill ด้วย findEnumValue
        assertEquals("explicitB", result[1]);   // names[1]!=null -> ไม่ถูกแก้ไข
    }

    // ---------------------------------------------------------------
    // Deserialization: general annotation defaults
    // ---------------------------------------------------------------

    @Test
    public void testDeserializationGeneralAnnotationDefaults() {
        AnnotationIntrospector introspector = new ConcreteIntrospector();
        assertNull(introspector.findDeserializer(null));
        assertNull(introspector.findKeyDeserializer(null));
        assertNull(introspector.findContentDeserializer(null));
        assertNull(introspector.findDeserializationConverter(null));
        assertNull(introspector.findDeserializationContentConverter(null));
    }

    @Test
    public void testDeserializationTypeRefinementDeprecatedDefaults() {
        AnnotationIntrospector introspector = new ConcreteIntrospector();
        assertNull(introspector.findDeserializationType(null, null));
        assertNull(introspector.findDeserializationKeyType(null, null));
        assertNull(introspector.findDeserializationContentType(null, null));
    }

    // ---------------------------------------------------------------
    // refineDeserializationType branches
    // ---------------------------------------------------------------

    @Test
    public void testRefineDeserializationType_NoRefinement() throws Exception {
        ConfigurableIntrospector introspector = new ConfigurableIntrospector();
        JavaType base = deserConfig.getTypeFactory().constructType(String.class);
        JavaType result = introspector.refineDeserializationType(deserConfig, dummyAnnotated, base);
        assertSame(base, result);
    }

    @Test
    public void testRefineDeserializationType_SameRawClass_NoOp() throws Exception {
        ConfigurableIntrospector introspector = new ConfigurableIntrospector();
        introspector.deserType = ArrayList.class; // hasRawClass true -> เงื่อนไข false -> ไม่ narrow
        JavaType base = deserConfig.getTypeFactory().constructType(ArrayList.class);
        JavaType result = introspector.refineDeserializationType(deserConfig, dummyAnnotated, base);
        assertSame(base, result); // ไม่มีการเปลี่ยน reference เลย เพราะ contentClass/keyClass เป็น null ด้วย
    }

    @Test
    public void testRefineDeserializationType_Narrow() throws Exception {
        ConfigurableIntrospector introspector = new ConfigurableIntrospector();
        introspector.deserType = Integer.class; // subtype ของ Number
        JavaType base = deserConfig.getTypeFactory().constructType(Number.class);
        JavaType result = introspector.refineDeserializationType(deserConfig, dummyAnnotated, base);
        assertEquals(Integer.class, result.getRawClass());
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineDeserializationType_IncompatibleNarrowThrows() throws Exception {
        ConfigurableIntrospector introspector = new ConfigurableIntrospector();
        introspector.deserType = Integer.class; // ไม่สัมพันธ์กับ String
        JavaType base = deserConfig.getTypeFactory().constructType(String.class);
        introspector.refineDeserializationType(deserConfig, dummyAnnotated, base);
    }

    @Test
    public void testRefineDeserializationType_MapLikeKeyType_Narrow() throws Exception {
        ConfigurableIntrospector introspector = new ConfigurableIntrospector();
        introspector.deserKeyType = Integer.class;
        JavaType base = deserConfig.getTypeFactory()
                .constructMapType(java.util.HashMap.class, Object.class, Integer.class);
        JavaType result = introspector.refineDeserializationType(deserConfig, dummyAnnotated, base);
        assertEquals(Integer.class, result.getKeyType().getRawClass());
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineDeserializationType_MapLikeKeyType_UnrelatedThrows() throws Exception {
        ConfigurableIntrospector introspector = new ConfigurableIntrospector();
        introspector.deserKeyType = String.class; // ไม่สัมพันธ์กับ Number
        JavaType base = deserConfig.getTypeFactory()
                .constructMapType(java.util.HashMap.class, Number.class, Integer.class);
        introspector.refineDeserializationType(deserConfig, dummyAnnotated, base);
    }

    @Test
    public void testRefineDeserializationType_ContentType_Narrow() throws Exception {
        ConfigurableIntrospector introspector = new ConfigurableIntrospector();
        introspector.deserContentType = Integer.class;
        JavaType base = deserConfig.getTypeFactory().constructCollectionType(ArrayList.class, Object.class);
        JavaType result = introspector.refineDeserializationType(deserConfig, dummyAnnotated, base);
        assertEquals(Integer.class, result.getContentType().getRawClass());
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineDeserializationType_ContentType_UnrelatedThrows() throws Exception {
        ConfigurableIntrospector introspector = new ConfigurableIntrospector();
        introspector.deserContentType = String.class; // ไม่สัมพันธ์กับ Number
        JavaType base = deserConfig.getTypeFactory().constructCollectionType(ArrayList.class, Number.class);
        introspector.refineDeserializationType(deserConfig, dummyAnnotated, base);
    }

    // ---------------------------------------------------------------
    // Deserialization class-level / property-level defaults
    // ---------------------------------------------------------------

    @Test
    public void testDeserializationClassAnnotationDefaults() {
        AnnotationIntrospector introspector = new ConcreteIntrospector();
        assertNull(introspector.findValueInstantiator(null));
        assertNull(introspector.findPOJOBuilder(null));
        assertNull(introspector.findPOJOBuilderConfig(null));
    }

    @Test
    public void testDeserializationPropertyAnnotationDefaults() {
        AnnotationIntrospector introspector = new ConcreteIntrospector();
        assertNull(introspector.findNameForDeserialization(null));
        assertFalse(introspector.hasAnySetterAnnotation(null));
        assertFalse(introspector.hasAnyGetterAnnotation(null));
        assertFalse(introspector.hasCreatorAnnotation(null));
        assertNull(introspector.findCreatorBinding(null));
    }

    // ---------------------------------------------------------------
    // Protected helper (overridable extension points)
    // ---------------------------------------------------------------

    @Test
    public void testFindAnnotationDelegatesToAnnotatedGetAnnotation() {
        ConcreteIntrospector introspector = new ConcreteIntrospector();
        Annotated annotated = mock(Annotated.class);
        Deprecated ann = mock(Deprecated.class);
        when(annotated.getAnnotation(Deprecated.class)).thenReturn(ann);

        Deprecated result = introspector._findAnnotation(annotated, Deprecated.class);
        assertSame(ann, result);
    }

    @Test
    public void testFindAnnotationReturnsNullWhenAbsent() {
        ConcreteIntrospector introspector = new ConcreteIntrospector();
        Annotated annotated = mock(Annotated.class);
        when(annotated.getAnnotation(Deprecated.class)).thenReturn(null);

        assertNull(introspector._findAnnotation(annotated, Deprecated.class));
    }

    @Test
    public void testHasAnnotationDelegatesToAnnotatedHasAnnotation() {
        ConcreteIntrospector introspector = new ConcreteIntrospector();
        Annotated annotated = mock(Annotated.class);
        when(annotated.hasAnnotation(Deprecated.class)).thenReturn(true);
        assertTrue(introspector._hasAnnotation(annotated, Deprecated.class));

        when(annotated.hasAnnotation(Deprecated.class)).thenReturn(false);
        assertFalse(introspector._hasAnnotation(annotated, Deprecated.class));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testHasOneOfDelegatesToAnnotatedHasOneOf() {
        ConcreteIntrospector introspector = new ConcreteIntrospector();
        Annotated annotated = mock(Annotated.class);
        Class<? extends Annotation>[] classes = new Class[] { Deprecated.class };
        when(annotated.hasOneOf(classes)).thenReturn(true);

        assertTrue(introspector._hasOneOf(annotated, classes));
    }
}
