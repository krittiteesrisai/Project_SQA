package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.Annotations;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PropertyBuilderTest {

    private SerializationConfig config;
    private BeanDescription beanDesc;
    private PropertyBuilder propertyBuilder;
    private SerializerProvider serializerProvider;
    private BeanPropertyDefinition propDef;
    private JavaType declaredType;
    private AnnotatedMember annotatedMember;

    @Before
    public void setUp() {
        config = mock(SerializationConfig.class, RETURNS_DEEP_STUBS);
        beanDesc = mock(BeanDescription.class, RETURNS_DEEP_STUBS);
        serializerProvider = mock(SerializerProvider.class, RETURNS_DEEP_STUBS);
        propDef = mock(BeanPropertyDefinition.class, RETURNS_DEEP_STUBS);
        declaredType = mock(JavaType.class, RETURNS_DEEP_STUBS);
        annotatedMember = mock(AnnotatedMember.class, RETURNS_DEEP_STUBS);

        when(beanDesc.findPropertyInclusion(any())).thenReturn(JsonInclude.Value.empty());
        when(config.getDefaultPropertyInclusion(any(), any())).thenReturn(JsonInclude.Value.empty());
        when(config.getDefaultPropertyInclusion()).thenReturn(JsonInclude.Value.empty());
        when(config.getAnnotationIntrospector()).thenReturn(mock(AnnotationIntrospector.class));

        propertyBuilder = new PropertyBuilder(config, beanDesc);
    }

    @Test
    public void testGetClassAnnotations() {
        Annotations mockAnnotations = mock(Annotations.class);
        when(beanDesc.getClassAnnotations()).thenReturn(mockAnnotations);
        assertEquals(mockAnnotations, propertyBuilder.getClassAnnotations());
    }

    @Test
    public void testBuildWriter_AccessorNull() throws Exception {
        when(propDef.getAccessor()).thenReturn(null);
        when(serializerProvider.reportBadPropertyDefinition(eq(beanDesc), eq(propDef), anyString()))
                .thenReturn(null);

        BeanPropertyWriter writer = propertyBuilder.buildWriter(
                serializerProvider, propDef, declaredType, null, null, null, annotatedMember, false
        );
        assertNull(writer);
        verify(serializerProvider).reportBadPropertyDefinition(eq(beanDesc), eq(propDef), contains("could not determine property type"));
    }

    @Test
    public void testBuildWriter_InclusionNonDefault_WithRealDefaults() throws Exception {
        // Force _useRealPropertyDefaults to true via Inclusion NON_DEFAULT
        JsonInclude.Value inclVal = JsonInclude.Value.construct(JsonInclude.Include.NON_DEFAULT, JsonInclude.Include.NON_DEFAULT);
        when(beanDesc.findPropertyInclusion(any())).thenReturn(inclVal);
        
        PropertyBuilder pb = new PropertyBuilder(config, beanDesc);

        when(propDef.getAccessor()).thenReturn(annotatedMember);
        when(annotatedMember.getRawType()).thenReturn((Class) String.class);
        when(propDef.findInclusion()).thenReturn(inclVal);
        when(declaredType.getRawClass()).thenReturn((Class) String.class);
        
        Object dummyBean = new Object();
        when(beanDesc.instantiateBean(anyBoolean())).thenReturn(dummyBean);
        when(config.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)).thenReturn(true);
        when(annotatedMember.getValue(dummyBean)).thenReturn("defaultVal");

        BeanPropertyWriter writer = pb.buildWriter(
                serializerProvider, propDef, declaredType, null, null, null, annotatedMember, false
        );
        assertNotNull(writer);
    }

    @Test
    public void testBuildWriter_InclusionNonDefault_ArraySuppress() throws Exception {
        JsonInclude.Value inclVal = JsonInclude.Value.construct(JsonInclude.Include.NON_DEFAULT, JsonInclude.Include.NON_DEFAULT);
        when(beanDesc.findPropertyInclusion(any())).thenReturn(inclVal);

        PropertyBuilder pb = new PropertyBuilder(config, beanDesc);

        when(propDef.getAccessor()).thenReturn(annotatedMember);
        when(annotatedMember.getRawType()).thenReturn((Class) String[].class);
        when(propDef.findInclusion()).thenReturn(inclVal);
        when(declaredType.getRawClass()).thenReturn((Class) String[].class);

        Object dummyBean = new Object();
        when(beanDesc.instantiateBean(anyBoolean())).thenReturn(dummyBean);
        String[] defaultArray = new String[]{"a"};
        when(annotatedMember.getValue(dummyBean)).thenReturn(defaultArray);

        BeanPropertyWriter writer = pb.buildWriter(
                serializerProvider, propDef, declaredType, null, null, null, annotatedMember, false
        );
        assertNotNull(writer);
    }

    @Test
    public void testBuildWriter_InclusionNonDefault_ExceptionInGetvalue() throws Exception {
        JsonInclude.Value inclVal = JsonInclude.Value.construct(JsonInclude.Include.NON_DEFAULT, JsonInclude.Include.NON_DEFAULT);
        when(beanDesc.findPropertyInclusion(any())).thenReturn(inclVal);

        PropertyBuilder pb = new PropertyBuilder(config, beanDesc);

        when(propDef.getAccessor()).thenReturn(annotatedMember);
        when(annotatedMember.getRawType()).thenReturn((Class) String.class);
        when(propDef.findInclusion()).thenReturn(inclVal);
        when(declaredType.getRawClass()).thenReturn((Class) String.class);

        Object dummyBean = new Object();
        when(beanDesc.instantiateBean(anyBoolean())).thenReturn(dummyBean);
        when(annotatedMember.getValue(dummyBean)).thenThrow(new RuntimeException("Test Exception"));
        when(propDef.getName()).thenReturn("testProp");

        try {
            pb.buildWriter(serializerProvider, propDef, declaredType, null, null, null, annotatedMember, false);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Failed to get property 'testProp'"));
        }
    }

    @Test
    public void testBuildWriter_InclusionNonAbsent() throws Exception {
        JsonInclude.Value inclVal = JsonInclude.Value.construct(JsonInclude.Include.NON_ABSENT, JsonInclude.Include.NON_ABSENT);
        when(propDef.getAccessor()).thenReturn(annotatedMember);
        when(annotatedMember.getRawType()).thenReturn((Class) Object.class);
        when(propDef.findInclusion()).thenReturn(inclVal);
        when(declaredType.getRawClass()).thenReturn((Class) Object.class);
        when(actualTypeIsReference(declaredType)).thenReturn(true);

        BeanPropertyWriter writer = propertyBuilder.buildWriter(
                serializerProvider, propDef, declaredType, null, null, null, annotatedMember, false
        );
        assertNotNull(writer);
    }

    @Test
    public void testBuildWriter_InclusionNonEmpty() throws Exception {
        JsonInclude.Value inclVal = JsonInclude.Value.construct(JsonInclude.Include.NON_EMPTY, JsonInclude.Include.NON_EMPTY);
        when(propDef.getAccessor()).thenReturn(annotatedMember);
        when(annotatedMember.getRawType()).thenReturn((Class) Object.class);
        when(propDef.findInclusion()).thenReturn(inclVal);
        when(declaredType.getRawClass()).thenReturn((Class) Object.class);

        BeanPropertyWriter writer = propertyBuilder.buildWriter(
                serializerProvider, propDef, declaredType, null, null, null, annotatedMember, false
        );
        assertNotNull(writer);
    }

    @Test
    public void testBuildWriter_InclusionCustom() throws Exception {
        JsonInclude.Value inclVal = JsonInclude.Value.construct(JsonInclude.Include.CUSTOM, JsonInclude.Include.CUSTOM);
        when(propDef.getAccessor()).thenReturn(annotatedMember);
        when(annotatedMember.getRawType()).thenReturn((Class) Object.class);
        when(propDef.findInclusion()).thenReturn(inclVal);
        when(declaredType.getRawClass()).thenReturn((Class) Object.class);
        
        Object filter = new Object();
        when(config.getAnnotationIntrospector().refineSerializationType(any(), any(), any())).thenReturn(declaredType);
        when(serializerProvider.includeFilterInstance(eq(propDef), any())).thenReturn(filter);
        when(serializerProvider.includeFilterSuppressNulls(filter)).thenReturn(true);

        BeanPropertyWriter writer = propertyBuilder.buildWriter(
                serializerProvider, propDef, declaredType, null, null, null, annotatedMember, false
        );
        assertNotNull(writer);
    }

    @Test
    public void testBuildWriter_ContentTypeSer() throws Exception {
        TypeSerializer contentTypeSer = mock(TypeSerializer.class);
        when(propDef.getAccessor()).thenReturn(annotatedMember);
        when(annotatedMember.getRawType()).thenReturn((Class) Object.class);
        when(declaredType.getContentType()).thenReturn(mock(JavaType.class));
        when(declaredType.withContentTypeHandler(contentTypeSer)).thenReturn(declaredType);

        BeanPropertyWriter writer = propertyBuilder.buildWriter(
                serializerProvider, propDef, declaredType, null, null, contentTypeSer, annotatedMember, false
        );
        assertNotNull(writer);
    }

    @Test
    public void testBuildWriter_ContentTypeSer_NullContentType() throws Exception {
        TypeSerializer contentTypeSer = mock(TypeSerializer.class);
        when(propDef.getAccessor()).thenReturn(annotatedMember);
        when(annotatedMember.getRawType()).thenReturn((Class) Object.class);
        when(declaredType.getContentType()).thenReturn(null);

        propertyBuilder.buildWriter(
                serializerProvider, propDef, declaredType, null, null, contentTypeSer, annotatedMember, false
        );
        verify(serializerProvider).reportBadPropertyDefinition(eq(beanDesc), eq(propDef), contains("has no content"));
    }

    @Test
    public void testFindSerializationType_IllegalConcreteType() throws Exception {
        JavaType secondary = mock(JavaType.class);
        when(config.getAnnotationIntrospector().refineSerializationType(any(), any(), any())).thenReturn(secondary);
        when(secondary.getRawClass()).thenReturn((Class) Integer.class);
        when(declaredType.getRawClass()).thenReturn((Class) String.class);

        try {
            propertyBuilder.findSerializationType(annotatedMember, false, declaredType);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Illegal concrete-type annotation"));
        }
    }

    @Test
    public void testGetDefaultBean_NoDefaultConstructor() {
        when(beanDesc.instantiateBean(anyBoolean())).thenReturn(null);
        Object defaultBean = propertyBuilder.getDefaultBean();
        assertNull(defaultBean);
    }

    @Test
    public void testThrowWrapped_WithCause() throws Exception {
        Exception inner = new Exception("Root Cause");
        Exception outer = new RuntimeException("Outer", inner);
        
        Method method = PropertyBuilder.class.getDeclaredMethod("_throwWrapped", Exception.class, String.class, Object.class);
        method.setAccessible(true);
        try {
            method.invoke(propertyBuilder, outer, "prop", new Object());
            fail("Expected invocation target exception wrapping IllegalArgumentException");
        } catch (java.lang.reflect.InvocationTargetException e) {
            assertTrue(e.getCause() instanceof IllegalArgumentException);
        }
    }

    private boolean actualTypeIsReference(JavaType type) {
        when(type.isReferenceType()).thenReturn(true);
        return true;
    }
}