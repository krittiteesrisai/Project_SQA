package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

/**
 * Unit test สำหรับ com.fasterxml.jackson.databind.deser.impl.SetterlessProperty
 *
 * หมายเหตุสำคัญ: SetterlessProperty ไม่มี constructor แบบ no-arg และต้องพึ่ง
 * BeanPropertyDefinition / AnnotatedMethod ซึ่งสร้างยากด้วยมือ จึงใช้การ introspect
 * จาก ObjectMapper จริง (public API ที่มีเสถียรภาพ) เพื่อให้ได้ object ที่ valid
 * แทนการ "เดา" ค่า field ภายใน SettableBeanProperty (superclass) ที่ไม่มีซอร์สให้มา
 */
public class SetterlessPropertyTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ---------- Test fixtures ----------

    static class ListBean {
        private List<String> items = new ArrayList<String>();
        public List<String> getItems() { return items; }
    }

    /** getter ไม่มี field รองรับ, คืนค่า null เสมอ -> ใช้ทดสอบ branch toModify == null */
    static class NullGetterBean {
        public List<String> getItems() { return null; }
    }

    /** getter throw exception เสมอ -> ใช้ทดสอบ branch catch (Exception e) -> _throwAsIOE */
    static class ThrowingGetterBean {
        public List<String> getItems() { throw new RuntimeException("boom-from-getter"); }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface MarkerAnno {}

    static class AnnotatedGetterBean {
        private List<String> items = new ArrayList<String>();
        @MarkerAnno
        public List<String> getItems() { return items; }
    }

    // ---------- Helper: สร้าง SetterlessProperty จริงด้วย introspection ----------

    private SetterlessProperty buildProperty(Class<?> beanClass, TypeDeserializer typeDeser) throws Exception {
        JavaType beanType = mapper.constructType(beanClass);
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(beanType);
        BeanPropertyDefinition propDef = null;
        for (BeanPropertyDefinition p : beanDesc.findProperties()) {
            if ("items".equals(p.getName())) {
                propDef = p;
                break;
            }
        }
        if (propDef == null || propDef.getGetter() == null) {
            throw new IllegalStateException(
                    "Test fixture error: ไม่พบ getter ของ property 'items' บนคลาส " + beanClass);
        }
        AnnotatedMethod getter = propDef.getGetter();
        JavaType type = mapper.getTypeFactory().constructType(getter.getGenericType());
        return new SetterlessProperty(propDef, type, typeDeser, beanDesc.getClassAnnotations(), getter);
    }

    // =====================================================================
    // deserializeAndSet: branch 1 -> t == JsonToken.VALUE_NULL
    // =====================================================================

    @Test
    public void testDeserializeAndSet_valueNullToken_isNoOp() throws Exception {
        SetterlessProperty prop = buildProperty(ListBean.class, null);
        JsonParser p = mock(JsonParser.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_NULL);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        ListBean bean = new ListBean();

        prop.deserializeAndSet(p, ctxt, bean);

        // ต้อง return ทันที ไม่มีการเรียก ctxt หรือ getter เพิ่ม
        verifyZeroInteractions(ctxt);
        assertNotNull(bean.getItems());
        assertTrue(bean.getItems().isEmpty());
    }

    // =====================================================================
    // deserializeAndSet: branch 2 -> _valueTypeDeserializer != null
    // =====================================================================

    @Test
    public void testDeserializeAndSet_typedDeserializerPresent_reportsBadDefinitionAndPropagates() throws Exception {
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        SetterlessProperty prop = buildProperty(ListBean.class, typeDeser);

        JsonParser p = mock(JsonParser.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.START_ARRAY);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        RuntimeException boom = new RuntimeException("bad-definition-marker");
        doThrow(boom).when(ctxt).reportBadDefinition(any(JavaType.class), anyString());

        try {
            prop.deserializeAndSet(p, ctxt, new ListBean());
            fail("คาดว่าต้อง throw exception จาก reportBadDefinition");
        } catch (RuntimeException e) {
            assertSame(boom, e);
        }
        verify(ctxt).reportBadDefinition(any(JavaType.class), anyString());
    }

    // =====================================================================
    // deserializeAndSet: branch 3 -> getter throws exception -> _throwAsIOE
    // =====================================================================

    @Test
    public void testDeserializeAndSet_getterThrowsException_isPropagated() throws Exception {
        SetterlessProperty baseProp = buildProperty(ThrowingGetterBean.class, null);
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        SettableBeanProperty prop = baseProp.withValueDeserializer(deser);

        JsonParser p = mock(JsonParser.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.START_ARRAY);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        ThrowingGetterBean bean = new ThrowingGetterBean();
        try {
            prop.deserializeAndSet(p, ctxt, bean);
            fail("คาดว่าต้อง throw เพราะ getter throw exception");
        } catch (Exception e) {
            // _throwAsIOE มาจาก superclass (ไม่มีซอร์สให้) จึงไม่ assert exact type
            // แต่ยืนยันว่า value deserializer ไม่ถูกเรียกเลย
        }
        verify(deser, never()).deserialize(any(JsonParser.class), any(DeserializationContext.class), any());
    }

    // =====================================================================
    // deserializeAndSet: branch 4 -> toModify == null (TRUE)  **จุดที่น่าสงสัยว่าเป็น fault**
    // =====================================================================

    @Test
    public void testDeserializeAndSet_getterReturnsNull_reportsBadDefinition_andStillCallsDeserializer()
            throws Exception {
        // หมายเหตุ: ตามซอร์สโค้ดต้นฉบับ หลังเรียก ctxt.reportBadDefinition(...)
        // ไม่มี statement `return;` ดังนั้นถ้า reportBadDefinition ไม่ throw (เช่นในเทสนี้ที่ mock
        // ไว้โดยไม่ stub ให้ throw) โค้ดจะเดินต่อไปเรียก _valueDeserializer.deserialize(p, ctxt, null)
        // ซึ่งอาจเป็นพฤติกรรมที่ไม่ได้ตั้งใจ (potential fault ที่ควรมี return)
        // เทสนี้ "characterize" พฤติกรรมจริงของซอร์สที่ให้มา ไม่ได้เดาเพิ่มเติม
        SetterlessProperty baseProp = buildProperty(NullGetterBean.class, null);
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        SettableBeanProperty prop = baseProp.withValueDeserializer(deser);

        JsonParser p = mock(JsonParser.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.START_ARRAY);
        DeserializationContext ctxt = mock(DeserializationContext.class); // reportBadDefinition ไม่ throw

        NullGetterBean bean = new NullGetterBean();
        prop.deserializeAndSet(p, ctxt, bean);

        verify(ctxt).reportBadDefinition(any(JavaType.class), anyString());
        verify(deser).deserialize(p, ctxt, null);
    }

    // =====================================================================
    // deserializeAndSet: branch 4 -> toModify == null (FALSE), ปกติ
    // =====================================================================

    @Test
    public void testDeserializeAndSet_normalValue_invokesValueDeserializer() throws Exception {
        SetterlessProperty baseProp = buildProperty(ListBean.class, null);
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        SettableBeanProperty prop = baseProp.withValueDeserializer(deser);

        JsonParser p = mock(JsonParser.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.START_ARRAY);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        ListBean bean = new ListBean();
        prop.deserializeAndSet(p, ctxt, bean);

        verify(deser).deserialize(p, ctxt, bean.getItems());
        verify(ctxt, never()).reportBadDefinition(any(JavaType.class), anyString());
    }

    // =====================================================================
    // deserializeSetAndReturn
    // =====================================================================

    @Test
    public void testDeserializeSetAndReturn_returnsSameInstance() throws Exception {
        SetterlessProperty prop = buildProperty(ListBean.class, null);
        JsonParser p = mock(JsonParser.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_NULL);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        ListBean bean = new ListBean();

        Object result = prop.deserializeSetAndReturn(p, ctxt, bean);

        assertSame(bean, result);
    }

    // =====================================================================
    // set() / setAndReturn() -> ต้อง throw UnsupportedOperationException เสมอ
    // =====================================================================

    @Test(expected = UnsupportedOperationException.class)
    public void testSet_alwaysThrowsUnsupportedOperationException() throws Exception {
        SetterlessProperty prop = buildProperty(ListBean.class, null);
        prop.set(new ListBean(), new ArrayList<String>());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_alwaysThrowsUnsupportedOperationException() throws Exception {
        SetterlessProperty prop = buildProperty(ListBean.class, null);
        prop.setAndReturn(new ListBean(), new ArrayList<String>());
    }

    // =====================================================================
    // withName
    // =====================================================================

    @Test
    public void testWithName_returnsNewInstanceWithUpdatedName() throws Exception {
        SetterlessProperty prop = buildProperty(ListBean.class, null);
        PropertyName newName = new PropertyName("renamedItems");

        SettableBeanProperty renamed = prop.withName(newName);

        assertNotSame(prop, renamed);
        assertTrue(renamed instanceof SetterlessProperty);
        assertEquals("renamedItems", renamed.getName());
        assertEquals("items", prop.getName()); // original ไม่ถูกแก้ไข
    }

    // =====================================================================
    // withValueDeserializer: branch _valueDeserializer == deser -> true/false
    // =====================================================================

    @Test
    public void testWithValueDeserializer_sameAsCurrentNull_returnsSameInstance() throws Exception {
        SetterlessProperty prop = buildProperty(ListBean.class, null);
        // ตาม public constructor ไม่มีการกำหนด _valueDeserializer เริ่มต้น ดังนั้นสมมติว่าเป็น null
        // (ไม่พบ field นี้ในซอร์สของ SetterlessProperty เอง แต่เป็น default state ที่สมเหตุสมผล)
        SettableBeanProperty result = prop.withValueDeserializer(null);
        assertSame(prop, result);
    }

    @Test
    public void testWithValueDeserializer_differentReference_returnsNewInstance_thenSameOnRepeat() throws Exception {
        SetterlessProperty prop = buildProperty(ListBean.class, null);
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);

        SettableBeanProperty withDeser = prop.withValueDeserializer(deser);
        assertNotSame(prop, withDeser);
        assertTrue(withDeser instanceof SetterlessProperty);

        // เรียกซ้ำด้วย deserializer ตัวเดิม -> ควร return ตัวเอง (branch true)
        SettableBeanProperty again = withDeser.withValueDeserializer(deser);
        assertSame(withDeser, again);
    }

    // =====================================================================
    // withNullProvider
    // =====================================================================

    @Test
    public void testWithNullProvider_returnsNewInstance() throws Exception {
        SetterlessProperty prop = buildProperty(ListBean.class, null);
        NullValueProvider nvp = mock(NullValueProvider.class);

        SettableBeanProperty result = prop.withNullProvider(nvp);

        assertNotSame(prop, result);
        assertTrue(result instanceof SetterlessProperty);
    }

    // =====================================================================
    // fixAccess (delegate, ไม่มี branch ภายในเมธอดเอง แต่ทดสอบทั้งสอง config state)
    // =====================================================================

    @Test
    public void testFixAccess_withOverrideEnabled_doesNotThrow() throws Exception {
        SetterlessProperty prop = buildProperty(ListBean.class, null);
        DeserializationConfig config = mapper.getDeserializationConfig()
                .with(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
        prop.fixAccess(config);
    }

    @Test
    public void testFixAccess_withOverrideDisabled_doesNotThrow() throws Exception {
        SetterlessProperty prop = buildProperty(ListBean.class, null);
        DeserializationConfig config = mapper.getDeserializationConfig()
                .without(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
        prop.fixAccess(config);
    }

    // =====================================================================
    // getAnnotation / getMember
    // =====================================================================

    @Test
    public void testGetAnnotation_noAnnotationPresent_returnsNull() throws Exception {
        SetterlessProperty prop = buildProperty(ListBean.class, null);
        MarkerAnno anno = prop.getAnnotation(MarkerAnno.class);
        assertNull(anno);
    }

    @Test
    public void testGetAnnotation_annotationPresent_returnsInstance() throws Exception {
        SetterlessProperty prop = buildProperty(AnnotatedGetterBean.class, null);
        MarkerAnno anno = prop.getAnnotation(MarkerAnno.class);
        assertNotNull(anno);
    }

    @Test
    public void testGetMember_returnsUnderlyingAnnotatedMethod() throws Exception {
        JavaType beanType = mapper.constructType(ListBean.class);
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(beanType);
        BeanPropertyDefinition propDef = null;
        for (BeanPropertyDefinition p : beanDesc.findProperties()) {
            if ("items".equals(p.getName())) { propDef = p; break; }
        }
        AnnotatedMethod getter = propDef.getGetter();
        JavaType type = mapper.getTypeFactory().constructType(getter.getGenericType());
        SetterlessProperty prop = new SetterlessProperty(
                propDef, type, null, beanDesc.getClassAnnotations(), getter);

        assertSame(getter, prop.getMember());
    }

    // =====================================================================
    // Integration tests ผ่าน ObjectMapper จริง (end-to-end, ครอบคลุม happy path/null/malformed)
    // =====================================================================

    @Test
    public void testIntegration_deserialize_mergesIntoExistingCollection() throws Exception {
        ListBean bean = mapper.readValue("{\"items\":[\"a\",\"b\"]}", ListBean.class);
        assertEquals(Arrays.asList("a", "b"), bean.getItems());
    }

    @Test
    public void testIntegration_deserialize_nullValue_leavesCollectionUnchanged() throws Exception {
        ListBean bean = mapper.readValue("{\"items\":null}", ListBean.class);
        assertNotNull(bean.getItems());
        assertTrue(bean.getItems().isEmpty());
    }

    @Test
    public void testIntegration_deserialize_emptyArray_resultsInEmptyCollection() throws Exception {
        ListBean bean = mapper.readValue("{\"items\":[]}", ListBean.class);
        assertNotNull(bean.getItems());
        assertTrue(bean.getItems().isEmpty());
    }

    @Test(expected = JsonMappingException.class)
    public void testIntegration_deserialize_getterReturnsNull_throwsViaRealPipeline() throws Exception {
        // ใน pipeline จริง DeserializationContext.reportBadDefinition จะ throw เสมอ
        // จึงไม่เกิดการ fall-through ไปเรียก deserialize(null) (ต่างจากเทส mock ด้านบนที่จำลอง
        // สถานการณ์ reportBadDefinition ไม่ throw เพื่อตรวจจับ fault ที่อาจแอบแฝงอยู่)
        mapper.readValue("{\"items\":[\"x\"]}", NullGetterBean.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testIntegration_deserialize_getterThrows_throwsViaRealPipeline() throws Exception {
        mapper.readValue("{\"items\":[\"x\"]}", ThrowingGetterBean.class);
    }

    @Test(expected = JsonMappingException.class)
    // อินพุตผิดรูปแบบ: ส่ง string แทน array ให้กับ List property
    // (เป็น default coercion behavior ของ Jackson ObjectMapper ที่ไม่ได้ปรับ feature ใดๆ)
    public void testIntegration_malformedInput_propagatesException() throws Exception {
        mapper.readValue("{\"items\":\"not-an-array\"}", ListBean.class);
    }
}
