package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.Converter;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Method;
import java.util.*;

import static org.junit.Assert.*;

public class BasicBeanDescriptionTest {

    // Helper to create a dummy BasicBeanDescription via forOtherUse
    private BasicBeanDescription createBasicBeanDescription(Class<?> rawType, List<BeanPropertyDefinition> props) {
        ObjectMapper mapper = new ObjectMapper();
        MapperConfig<?> config = mapper.getSerializationConfig();
        JavaType type = mapper.constructType(rawType);
        AnnotatedClass ac = AnnotatedClassResolver.resolve(config, type, mapper.getAnnotationIntrospector());
        return BasicBeanDescription.forOtherUse(config, type, ac);
    }

    @Test
    public void testRemoveProperty_FoundAndNotFound() {
        BasicBeanDescription desc = createBasicBeanDescription(String.class, new ArrayList<>());
        BeanPropertyDefinition propMock = Mockito.mock(BeanPropertyDefinition.class);
        Mockito.when(propMock.getName()).thenReturn("testProp");
        
        desc.findProperties().add(propMock);

        // Branch 1: Property exists and gets removed
        assertTrue(desc.removeProperty("testProp"));
        
        // Branch 2: Property does not exist
        assertFalse(desc.removeProperty("nonExistent"));
    }

    @Test
    public void testAddProperty_DuplicateAndNew() {
        BasicBeanDescription desc = createBasicBeanDescription(String.class, new ArrayList<>());
        PropertyName propName = PropertyName.construct("prop");
        
        BeanPropertyDefinition propMock1 = Mockito.mock(BeanPropertyDefinition.class);
        Mockito.when(propMock1.getFullName()).thenReturn(propName);
        Mockito.when(propMock1.hasName(propName)).thenReturn(true);
        Mockito.when(propMock1.getName()).thenReturn("prop");

        BeanPropertyDefinition propMock2 = Mockito.mock(BeanPropertyDefinition.class);
        Mockito.when(propMock2.getFullName()).thenReturn(propName);
        Mockito.when(propMock2.hasName(propName)).thenReturn(true);

        // Add first time -> Success
        assertTrue(desc.addProperty(propMock1));
        
        // Add duplicate -> Should fail (Branch coverage for hasProperty)
        assertFalse(desc.addProperty(propMock2));
    }

    @Test
    public void testFindProperty() {
        BasicBeanDescription desc = createBasicBeanDescription(String.class, new ArrayList<>());
        PropertyName name = PropertyName.construct("foundName");
        BeanPropertyDefinition propMock = Mockito.mock(BeanPropertyDefinition.class);
        Mockito.when(propMock.hasName(name)).thenReturn(true);
        
        desc.findProperties().add(propMock);

        assertNotNull(desc.findProperty(name));
        assertNull(desc.findProperty(PropertyName.construct("notFound")));
        assertTrue(desc.hasProperty(name));
        assertFalse(desc.hasProperty(PropertyName.construct("notFound")));
    }

    @Test
    public void testIgnoredPropertyNames() {
        BasicBeanDescription desc = createBasicBeanDescription(String.class, null);
        // _propCollector is null when using forOtherUse, so getIgnoredPropertyNames should return emptySet
        Set<String> ignored = desc.getIgnoredPropertyNames();
        assertNotNull(ignored);
        assertTrue(ignored.isEmpty());
    }

    @Test
    public void testFindExpectedFormat() {
        BasicBeanDescription desc = createBasicBeanDescription(String.class, Collections.emptyList());
        JsonFormat.Value defVal = JsonFormat.Value.empty();
        
        JsonFormat.Value result = desc.findExpectedFormat(defVal);
        assertNotNull(result);

        // Test with null defValue
        JsonFormat.Value resultNull = desc.findExpectedFormat(null);
        assertNotNull(resultNull);
    }

    @Test
    public void testFindDefaultViews() {
        BasicBeanDescription desc = createBasicBeanDescription(String.class, Collections.emptyList());
        Class<?>[] views1 = desc.findDefaultViews();
        Class<?>[] views2 = desc.findDefaultViews(); // Trigger cached branch (_defaultViewsResolved = true)
        assertSame(views1, views2);
    }

    @Test
    public void testFindPropertyInclusion() {
        BasicBeanDescription desc = createBasicBeanDescription(String.class, Collections.emptyList());
        JsonInclude.Value defVal = JsonInclude.Value.empty();
        JsonInclude.Value result = desc.findPropertyInclusion(defVal);
        assertEquals(defVal, result);
    }

    @Test
    public void testFindBackReferencesEmpty() {
        BasicBeanDescription desc = createBasicBeanDescription(String.class, new ArrayList<>());
        List<BeanPropertyDefinition> refs = desc.findBackReferences();
        assertNull(refs); // since properties list has no back-reference elements and returns null
        assertNull(desc.findBackReferenceProperties());
    }

    @Test
    public void testGetFactoryMethodsEmpty() {
        BasicBeanDescription desc = createBasicBeanDescription(String.class, Collections.emptyList());
        List<AnnotatedMethod> factories = desc.getFactoryMethods();
        assertNotNull(factories);
    }

    @Test
    public void testFindSingleArgConstructorAndFactory() {
        BasicBeanDescription desc = createBasicBeanDescription(String.class, Collections.emptyList());
        assertNull(desc.findSingleArgConstructor(String.class));
        assertNull(desc.findFactoryMethod(String.class));
    }

    @Test
    public void testFindPOJOBuilderAndConfig() {
        BasicBeanDescription desc = createBasicBeanDescription(String.class, Collections.emptyList());
        assertNull(desc.findPOJOBuilder());
        assertNull(desc.findPOJOBuilderConfig());
        assertNull(desc.findClassDescription());
    }

    @Test
    public void testCreateConverter_EdgeCases() {
        BasicBeanDescription desc = createBasicBeanDescription(String.class, Collections.emptyList());

        // 1. null converterDef -> returns null
        assertNull(desc._createConverter(null));

        // 2. Instance of Converter directly -> returns itself
        Converter<Object, Object> dummyConverter = Mockito.mock(Converter.class);
        assertEquals(dummyConverter, desc._createConverter(dummyConverter));

        // 3. Bogus class or None.class -> returns null
        assertNull(desc._createConverter(Converter.None.class));

        // 4. Invalid type (not a Class and not a Converter) -> throws IllegalStateException
        try {
            desc._createConverter(new Object());
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("expected type Converter or Class<Converter>"));
        }

        // 5. Class that doesn't implement Converter -> throws IllegalStateException
        try {
            desc._createConverter(String.class);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("expected Class<Converter>"));
        }
    }
}