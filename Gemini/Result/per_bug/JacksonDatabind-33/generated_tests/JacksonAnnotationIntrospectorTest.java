package com.fasterxml.jackson.databind.introspect;

import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;

import static org.junit.Assert.*;

public class JacksonAnnotationIntrospectorTest {

    private JacksonAnnotationIntrospector introspector;

    @Before
    public void setUp() {
        introspector = new JacksonAnnotationIntrospector();
    }

    @Test
    public void testVersion() {
        Version version = introspector.version();
        assertNotNull(version);
    }

    @Test
    public void testIsAnnotationBundle() {
        assertFalse(introspector.isAnnotationBundle(DummyNotBundle.class.getAnnotation(DummyNotBundle.class)));
        assertTrue(introspector.isAnnotationBundle(DummyBundle.class.getAnnotation(DummyBundle.class)));
    }

    // --- Enums for findEnumValue ---
    private enum SampleEnum {
        @JsonProperty("custom_name")
        CUSTOM,
        @JsonProperty("")
        EMPTY_NAME,
        NORMAL
    }

    @Test
    public void testFindEnumValue() {
        assertEquals("custom_name", introspector.findEnumValue(SampleEnum.CUSTOM));
        assertEquals("EMPTY_NAME", introspector.findEnumValue(SampleEnum.EMPTY_NAME));
        assertEquals("NORMAL", introspector.findEnumValue(SampleEnum.NORMAL));
    }

    @JsonRootName(value = "root", namespace = "")
    private static class RootWithEmptyNs {}

    @JsonRootName(value = "root", namespace = "http://example.org")
    private static class RootWithNs {}

    private static class RootWithoutAnn {}

    @Test
    public void testFindRootName() {
        AnnotatedClass acEmpty = AnnotatedClass.constructWithoutSuperTypes(RootWithEmptyNs.class, null, null);
        PropertyName name1 = introspector.findRootName(acEmpty);
        assertNotNull(name1);
        assertEquals("root", name1.getSimpleName());
        assertNull(name1.getNamespace());

        AnnotatedClass acNs = AnnotatedClass.constructWithoutSuperTypes(RootWithNs.class, null, null);
        PropertyName name2 = introspector.findRootName(acNs);
        assertNotNull(name2);
        assertEquals("http://example.org", name2.getNamespace());

        AnnotatedClass acNone = AnnotatedClass.constructWithoutSuperTypes(RootWithoutAnn.class, null, null);
        assertNull(introspector.findRootName(acNone));
    }

    @JsonIgnoreProperties(value = {"prop1"}, allowGetters = true, allowSetters = false, ignoreUnknown = true)
    private static class IgnoredPropsClass {
        @SuppressWarnings("unused")
        public int prop1;
    }

    @Test
    public void testFindPropertiesToIgnoreAndOthers() {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(IgnoredPropsClass.class, null, null);
        
        // forSerialization = true, allowGetters = true -> returns null
        assertNull(introspector.findPropertiesToIgnore(ac, true));
        
        // forSerialization = false, allowSetters = false -> returns value
        assertArrayEquals(new String[]{"prop1"}, introspector.findPropertiesToIgnore(ac, false));

        // deprecated findPropertiesToIgnore(Annotated)
        assertArrayEquals(new String[]{"prop1"}, introspector.findPropertiesToIgnore(ac));

        // findIgnoreUnknownProperties
        assertEquals(Boolean.TRUE, introspector.findIgnoreUnknownProperties(ac));
    }

    @JsonIgnoreType
    private static class IgnoredTypeClass {}

    @Test
    public void testIsIgnorableType() {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(IgnoredTypeClass.class, null, null);
        assertEquals(Boolean.TRUE, introspector.isIgnorableType(ac));
        assertNull(introspector.isIgnorableType(AnnotatedClass.constructWithoutSuperTypes(RootWithoutAnn.class, null, null)));
    }

    @JsonFilter("")
    private static class EmptyFilterClass {}

    @JsonFilter("myFilter")
    private static class ValidFilterClass {}

    @Test
    public void testFindFilterId() {
        AnnotatedClass acEmpty = AnnotatedClass.constructWithoutSuperTypes(EmptyFilterClass.class, null, null);
        assertNull(introspector.findFilterId(acEmpty));
        assertNull(introspector.findFilterId((Annotated) acEmpty));

        AnnotatedClass acValid = AnnotatedClass.constructWithoutSuperTypes(ValidFilterClass.class, null, null);
        assertEquals("myFilter", introspector.findFilterId(acValid));
        assertEquals("myFilter", introspector.findFilterId((Annotated) acValid));
    }

    @Test
    public void testHelperPropertyName() {
        PropertyName p1 = introspector._propertyName("", "ns");
        assertSame(PropertyName.USE_DEFAULT, p1);

        PropertyName p2 = introspector._propertyName("local", "");
        assertEquals("local", p2.getSimpleName());
        assertFalse(p2.hasNamespace());

        PropertyName p3 = introspector._propertyName("local", "ns");
        assertEquals("local", p3.getSimpleName());
        assertEquals("ns", p3.getNamespace());
    }

    @Test
    public void testExplicitClassHandling() {
        assertNull(introspector._classIfExplicit(null));
        assertNull(introspector._classIfExplicit(Void.class));
        assertEquals(String.class, introspector._classIfExplicit(String.class));

        assertNull(introspector._classIfExplicit(String.class, String.class));
        assertEquals(Integer.class, introspector._classIfExplicit(Integer.class, String.class));
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
    private static class TypeInfoNoneClass {}

    @Test
    public void testFindTypeResolverNone() {
        MapperConfig<?> config = null;
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(TypeInfoNoneClass.class, null, null);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TypeResolverBuilder<?> builder = introspector.findTypeResolver(config, ac, baseType);
        assertNotNull(builder);
    }

    // --- Dummy Annotations for testing ---
    @Target({ElementType.ANNOTATION_TYPE, ElementType.CLASS})
    @Retention(RetentionPolicy.RUNTIME)
    @JacksonAnnotationsInside
    private @interface DummyBundle {}

    @Target({ElementType.ANNOTATION_TYPE, ElementType.CLASS})
    @Retention(RetentionPolicy.RUNTIME)
    private @interface DummyNotBundle {}
}