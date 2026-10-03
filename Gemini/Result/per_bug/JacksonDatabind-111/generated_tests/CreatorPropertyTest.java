package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CreatorPropertyTest {

    private CreatorProperty creatorProperty;
    private PropertyName propertyName;
    private JavaType javaType;

    @Before
    public void setUp() {
        propertyName = new PropertyName("testProp");
        javaType = TypeFactory.defaultInstance().constructType(String.class);
        
        // สร้าง CreatorProperty แบบพื้นฐานด้วย Constructor หลัก
        creatorProperty = new CreatorProperty(
                propertyName,
                javaType,
                null,
                null,
                null,
                null,
                0,
                null,
                PropertyMetadata.STD_REQUIRED
        );
    }

    @Test
    public void testConstructorsAndGetters() {
        // ทดสอบ Constructor และ Getter พื้นฐาน
        assertEquals(propertyName, creatorProperty.getFullName());
        assertEquals(0, creatorProperty.getCreatorIndex());
        assertNull(creatorProperty.getInjectableValueId());
        assertNull(creatorProperty.getMember());
        assertFalse(creatorProperty.isIgnorable());
        
        // ทดสอบ markAsIgnorable
        creatorProperty.markAsIgnorable();
        assertTrue(creatorProperty.isIgnorable());

        // ทดสอบ toString
        String str = creatorProperty.toString();
        assertTrue(str.contains("testProp"));
    }

    @Test
    public void testWithName() {
        PropertyName newName = new PropertyName("newProp");
        SettableBeanProperty newProp = creatorProperty.withName(newName);
        assertNotNull(newProp);
        assertEquals(newName, newProp.getFullName());
    }

    @Test
    public void testWithValueDeserializer_Same() {
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> deser = (JsonDeserializer<Object>) mock(JsonDeserializer.class);
        
        CreatorProperty prop1 = (CreatorProperty) creatorProperty.withValueDeserializer(deser);
        // เรียกซ้ำด้วยตัวเดิม ต้องคืนค่า object เดิม (Branch: _valueDeserializer == deser)
        SettableBeanProperty prop2 = prop1.withValueDeserializer(deser);
        assertSame(prop1, prop2);
    }

    @Test
    public void testWithValueDeserializer_Different() {
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> deser1 = (JsonDeserializer<Object>) mock(JsonDeserializer.class);
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> deser2 = (JsonDeserializer<Object>) mock(JsonDeserializer.class);

        creatorProperty.withValueDeserializer(deser1);
        SettableBeanProperty propNew = creatorProperty.withValueDeserializer(deser2);
        assertNotNull(propNew);
        assertNotSame(creatorProperty, propNew);
    }

    @Test
    public void testWithNullProvider() {
        NullValueProvider nva = mock(NullValueProvider.class);
        SettableBeanProperty prop = creatorProperty.withNullProvider(nva);
        assertNotNull(prop);
    }

    @Test
    public void testFixAccess_NullFallbackSetter() {
        DeserializationConfig config = mock(DeserializationConfig.class);
        // _fallbackSetter เป็น null -> ไม่ควรเกิด Exception ใดๆ (Branch Coverage)
        creatorProperty.fixAccess(config);
        assertNull(creatorProperty.getInjectableValueId());
    }

    @Test
    public void testFixAccess_NonNullFallbackSetter() {
        DeserializationConfig config = mock(DeserializationConfig.class);
        SettableBeanProperty fallback = mock(SettableBeanProperty.class);
        
        creatorProperty.setFallbackSetter(fallback);
        creatorProperty.fixAccess(config);

        verify(fallback, times(1)).fixAccess(config);
    }

    @Test(expected = JsonMappingException.class)
    public void testFindInjectableValue_NullId() throws Exception {
        DeserializationContext context = mock(DeserializationContext.class);
        Object beanInstance = new Object();
        
        // _injectableValueId เป็น null จะต้องสั่ง reportBadDefinition (ซึ่งใน Mock จะต้องโยน Exception จำลอง)
        doThrow(new JsonMappingException(null, "Missing ID")).when(context)
            .reportBadDefinition(any(Class.class), anyString());

        creatorProperty.findInjectableValue(context, beanInstance);
    }

    @Test
    public void testFindInjectableValue_ValidId() throws Exception {
        Object expectedId = "my-inject-id";
        CreatorProperty propWithId = new CreatorProperty(
                propertyName, javaType, null, null, null, null, 0, expectedId, PropertyMetadata.STD_OPTIONAL
        );

        DeserializationContext context = mock(DeserializationContext.class);
        Object beanInstance = new Object();
        Object injectedValue = "injected-result";

        when(context.findInjectableValue(expectedId, propWithId, beanInstance)).thenReturn(injectedValue);

        Object result = propWithId.findInjectableValue(context, beanInstance);
        assertEquals(injectedValue, result);
    }

    @Test
    public void testGetAnnotation_NullAnnotated() {
        // เมื่อ _annotated เป็น null ต้องคืนค่า null ทันที
        assertNull(creatorProperty.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetAnnotation_NonNullAnnotated() {
        AnnotatedParameter param = mock(AnnotatedParameter.class);
        Deprecated depAnnotation = mock(Deprecated.class);
        when(param.getAnnotation(Deprecated.class)).thenReturn(depAnnotation);

        CreatorProperty prop = new CreatorProperty(
                propertyName, javaType, null, null, null, param, 0, null, PropertyMetadata.STD_OPTIONAL
        );

        assertEquals(depAnnotation, prop.getAnnotation(Deprecated.class));
    }

    @Test(expected = InvalidDefinitionException.class)
    public void testVerifySetter_ThrowsExceptionWhenNullAndCtxtNull() throws Exception {
        // _fallbackSetter เป็น null และ ctxt เป็น null -> โยน InvalidDefinitionException ภายใน _reportMissingSetter
        creatorProperty.set(new Object(), "some-value");
    }

    @Test
    public void testVerifySetter_ReportsBadDefinitionWhenNullAndCtxtNonNull() throws Exception {
        DeserializationContext context = mock(DeserializationContext.class);
        // จำลองให้ ctxt ไม่เป็น null และเรียก reportBadDefinition
        doThrow(new InvalidDefinitionException(null, "Missing setter", javaType))
            .when(context).reportBadDefinition(eq(javaType), anyString());

        try {
            // เรียกผ่าน deserializeAndSet ซึ่งจะเรียก _verifySetter() ภายใน
            creatorProperty.deserializeAndSet(null, context, new Object());
            fail("Expected InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            // สำเร็จตามคาด
            verify(context, times(1)).reportBadDefinition(eq(javaType), anyString());
        }
    }
}