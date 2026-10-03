package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;

import static org.junit.Assert.*;

public class StdSubtypeResolverTest {

    private StdSubtypeResolver resolver;
    private ObjectMapper objectMapper;
    private MapperConfig<?> config;

    @Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    private @interface JsonSubTypesDummy {
        Class<?>[] value() default {};
    }

    // Dummy classes for testing inheritance and named types
    public abstract static class AbstractBase { }

    public static class SubA extends AbstractBase { }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
    @JsonTypeName("subB")
    public static class SubB extends AbstractBase { }

    public static class SubUnrelated { }

    @Before
    public void setUp() {
        resolver = new StdSubtypeResolver();
        objectMapper = new ObjectMapper();
        config = objectMapper.getSerializationConfig();
    }

    @Test
    public void testRegisterSubtypesWithClassesAndNamedTypes() {
        // Test registering via Class<?>... and NamedType...
        resolver.registerSubtypes(SubA.class);
        resolver.registerSubtypes(new NamedType(SubB.class, "customB"));

        assertNotNull(resolver._registeredSubtypes);
        assertEquals(2, resolver._registeredSubtypes.size());
    }

    @Test
    public void testCollectAndResolveSubtypesByClass_WithNullBaseTypeAndRegisteredSubtypes() throws Exception {
        resolver.registerSubtypes(SubA.class, SubUnrelated.class); // SubUnrelated should be filtered out by isAssignableFrom

        AnnotatedClass propClass = AnnotatedClassResolver.resolveWithoutSuperTypes(config, AbstractBase.class);
        AnnotatedMethod dummyMethod = new AnnotatedMethod(null, null, null, null);
        
        // baseType is null, should fall back to property.getRawType()
        // Mocking/passing a member where getRawType() returns AbstractBase
        AnnotatedMember member = new AnnotatedMethod(null, AbstractBase.class, null, null);

        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, member, null);
        assertNotNull(result);
        
        boolean foundSubA = false;
        boolean foundUnrelated = false;
        for (NamedType nt : result) {
            if (nt.getType() == SubA.class) foundSubA = true;
            if (nt.getType() == SubUnrelated.class) foundUnrelated = true;
        }
        assertTrue(foundSubA);
        assertFalse(foundUnrelated);
    }

    @Test
    public void testCollectAndResolveSubtypesByClass_AnnotatedClassVariant() {
        resolver.registerSubtypes(SubB.class);
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(config, AbstractBase.class);

        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, ac);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeId_WithPropertyAndRegistered() throws Exception {
        resolver.registerSubtypes(SubB.class);
        AnnotatedMember member = new AnnotatedMethod(null, AbstractBase.class, null, null);
        JavaType baseType = objectMapper.constructType(AbstractBase.class);

        Collection<NamedType> result = resolver.collectAndResolveSubtypesByTypeId(config, member, baseType);
        assertNotNull(result);
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeId_AnnotatedClassVariant() {
        resolver.registerSubtypes(SubA.class);
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(config, AbstractBase.class);

        Collection<NamedType> result = resolver.collectAndResolveSubtypesByTypeId(config, ac);
        assertNotNull(result);
    }

    @Test
    public void testCollectAndResolve_DuplicateAndNameHandling() {
        HashMap<NamedType, NamedType> collected = new HashMap<NamedType, NamedType>();
        NamedType nt1 = new NamedType(SubB.class, null);
        NamedType nt2 = new NamedType(SubB.class, "subB");

        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(config, SubB.class);
        
        // First collection without name
        resolver._collectAndResolve(ac, nt1, config, config.getAnnotationIntrospector(), collected);
        // Second collection with name to trigger replacement/update logic
        resolver._collectAndResolve(ac, nt2, config, config.getAnnotationIntrospector(), collected);

        assertFalse(collected.isEmpty());
    }

    @Test
    public void testCombineNamedAndUnnamed_AbstractBaseFiltering() {
        Set<Class<?>> typesHandled = new HashSet<Class<?>>();
        typesHandled.add(AbstractBase.class); // Should be skipped because it's abstract and equals rawBase
        typesHandled.add(SubA.class);

        Map<String, NamedType> byName = new HashMap<String, NamedType>();
        byName.put("subB", new NamedType(SubB.class, "subB"));
        typesHandled.add(SubB.class); // Handled via byName, should be removed from typesHandled

        Collection<NamedType> combined = resolver._combineNamedAndUnnamed(AbstractBase.class, typesHandled, byName);
        assertNotNull(combined);
        
        boolean foundAbstractBase = false;
        for (NamedType t : combined) {
            if (t.getType() == AbstractBase.class) {
                foundAbstractBase = true;
            }
        }
        assertFalse("Abstract base class should not be added when equal to rawBase and abstract", foundAbstractBase);
    }
}