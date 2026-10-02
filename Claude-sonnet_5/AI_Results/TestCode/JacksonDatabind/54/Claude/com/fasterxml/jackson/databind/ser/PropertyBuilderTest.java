package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * หมายเหตุสำคัญ (ต้องอ่านก่อนรีวิว):
 *
 * 1) SerializationConfig เป็น final class ใน jackson-databind จริง จึง mock ตรงไม่ได้
 *    -> ใช้ ObjectMapper จริงสร้าง config จริง แล้วปรับ behavior ผ่าน setAnnotationIntrospector()/configure()
 *
 * 2) JavaType.getRawClass() เป็น final method ใน jackson-databind จริง จึง mock ไม่ได้อย่างปลอดภัย
 *    -> ใช้ TypeFactory สร้าง JavaType จริงเสมอ
 *
 * 3) Method signature ของ AnnotationIntrospector#refineSerializationType /
 *    findSerializationTyping / findNullSerializer / findUnwrappingNameTransformer
 *    ไม่ได้อยู่ใน source ที่ให้มา อ้างอิงจาก call-site ใน PropertyBuilder.buildWriter/findSerializationType
 *    และความรู้ทั่วไปของ Jackson public API (NopAnnotationIntrospector) - หากเวอร์ชันจริงต่างจากนี้
 *    การ compile จะ fail ที่ @Override (ทำหน้าที่เป็น safety net)
 *
 * 4) buildWriter() มีการเรียก `new BeanPropertyWriter(...)` ซึ่ง source ไม่ได้ให้มา
 *    จึงทดสอบเฉพาะ branch ที่ throw exception ก่อนถึงจุดนั้น (ไม่เดา behavior ของ BeanPropertyWriter)
 *
 * 5) สำหรับ branch "reference type" ใน getDefaultValue ใช้ AtomicReference.class
 *    ซึ่งอ้างอิงจาก Jackson changelog ว่า TypeFactory core รองรับ AtomicReference เป็น ReferenceType
 *    มาตั้งแต่ 2.6 (ไม่ต้องพึ่ง datatype module เพิ่ม) - หากเวอร์ชันที่ build จริงไม่ตรง เทสนี้อาจ fail
 */
public class PropertyBuilderTest {

    // ---------- Helper: stub AnnotationIntrospector ที่ควบคุมค่าคืนได้ ----------
    private static class StubAnnotationIntrospector extends NopAnnotationIntrospector {
        private static final long serialVersionUID = 1L;
        JavaType refineResult = null;                 // null => คืน baseType เดิม
        JsonSerialize.Typing typingResult = null;      // null => ไม่ override typing

        @Override
        public JavaType refineSerializationType(MapperConfig<?> config, Annotated a, JavaType baseType) {
            return (refineResult != null) ? refineResult : baseType;
        }

        @Override
        public JsonSerialize.Typing findSerializationTyping(Annotated a) {
            return typingResult;
        }
    }

    // ---------- Helper: สร้าง PropertyBuilder พร้อมควบคุม config/introspector/beanDesc ----------
    private BeanDescription lastBeanDesc;

    private PropertyBuilder createBuilder(StubAnnotationIntrospector introspector,
                                           JsonInclude.Value defaultInclusion,
                                           boolean writeEmptyArrays) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setAnnotationIntrospector(introspector);
        mapper.configure(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS, writeEmptyArrays);
        SerializationConfig config = mapper.getSerializationConfig();

        BeanDescription beanDesc = mock(BeanDescription.class);
        when(beanDesc.getBeanClass()).thenReturn((Class) Object.class);
        when(beanDesc.findPropertyInclusion(org.mockito.Matchers.any(JsonInclude.Value.class)))
                .thenReturn(defaultInclusion);
        this.lastBeanDesc = beanDesc;

        return new PropertyBuilder(config, beanDesc);
    }

    private PropertyBuilder createDefaultBuilder() {
        return createBuilder(new StubAnnotationIntrospector(), JsonInclude.Value.empty(), true);
    }

    // =========================================================================
    // 1. Constructor
    // =========================================================================

    @Test
    public void testConstructor_setsFieldsCorrectly() {
        StubAnnotationIntrospector introspector = new StubAnnotationIntrospector();
        JsonInclude.Value inclVal = JsonInclude.Value.construct(JsonInclude.Include.NON_NULL, null);
        PropertyBuilder pb = createBuilder(introspector, inclVal, true);

        assertSame(inclVal, pb._defaultInclusion);
        assertSame(introspector, pb._annotationIntrospector);
    }

    // =========================================================================
    // 2. getClassAnnotations()
    // =========================================================================

    @Test
    public void testGetClassAnnotations_delegatesToBeanDescription() {
        PropertyBuilder pb = createDefaultBuilder();
        com.fasterxml.jackson.databind.introspect.Annotations anns =
                mock(com.fasterxml.jackson.databind.introspect.Annotations.class);
        when(lastBeanDesc.getClassAnnotations()).thenReturn(anns);

        assertSame(anns, pb.getClassAnnotations());
    }

    // =========================================================================
    // 3. getDefaultValue(JavaType) - ครอบคลุมทุก branch
    // =========================================================================

    @Test
    public void testGetDefaultValue_primitiveInt() {
        PropertyBuilder pb = createDefaultBuilder();
        JavaType type = TypeFactory.defaultInstance().constructType(int.class);
        assertEquals(Integer.valueOf(0), pb.getDefaultValue(type));
    }

    @Test
    public void testGetDefaultValue_primitiveBoolean() {
        PropertyBuilder pb = createDefaultBuilder();
        JavaType type = TypeFactory.defaultInstance().constructType(boolean.class);
        assertEquals(Boolean.FALSE, pb.getDefaultValue(type));
    }

    @Test
    public void testGetDefaultValue_wrapperInteger_mapsToPrimitiveDefault() {
        PropertyBuilder pb = createDefaultBuilder();
        JavaType type = TypeFactory.defaultInstance().constructType(Integer.class);
        assertEquals(Integer.valueOf(0), pb.getDefaultValue(type));
    }

    @Test
    public void testGetDefaultValue_containerType_returnsNonEmpty() {
        PropertyBuilder pb = createDefaultBuilder();
        JavaType type = TypeFactory.defaultInstance().constructType(List.class);
        assertEquals(JsonInclude.Include.NON_EMPTY, pb.getDefaultValue(type));
    }

    @Test
    public void testGetDefaultValue_referenceType_returnsNonEmpty() {
        // ดูหมายเหตุข้อ 5 ด้านบนเรื่อง AtomicReference
        PropertyBuilder pb = createDefaultBuilder();
        JavaType type = TypeFactory.defaultInstance().constructType(AtomicReference.class);
        assertEquals(JsonInclude.Include.NON_EMPTY, pb.getDefaultValue(type));
    }

    @Test
    public void testGetDefaultValue_stringType_returnsEmptyString() {
        PropertyBuilder pb = createDefaultBuilder();
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertEquals("", pb.getDefaultValue(type));
    }

    @Test
    public void testGetDefaultValue_otherObjectType_returnsNull() {
        PropertyBuilder pb = createDefaultBuilder();
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        assertNull(pb.getDefaultValue(type));
    }

    // =========================================================================
    // 4. getDefaultBean() - caching + marker logic
    // =========================================================================

    @Test
    public void testGetDefaultBean_alreadyCached_doesNotCallInstantiateBean() {
        PropertyBuilder pb = createDefaultBuilder();
        pb._defaultBean = "cachedBean"; // same-package direct field access

        Object result = pb.getDefaultBean();

        assertEquals("cachedBean", result);
        verify(lastBeanDesc, never()).instantiateBean(org.mockito.Matchers.anyBoolean());
    }

    @Test
    public void testGetDefaultBean_instantiateReturnsObject_cachesResult() {
        PropertyBuilder pb = createDefaultBuilder();
        Object realBean = new Object();
        when(lastBeanDesc.instantiateBean(org.mockito.Matchers.anyBoolean())).thenReturn(realBean);

        Object first = pb.getDefaultBean();
        Object second = pb.getDefaultBean();

        assertSame(realBean, first);
        assertSame(realBean, second);
        verify(lastBeanDesc, times(1)).instantiateBean(org.mockito.Matchers.anyBoolean());
    }

    @Test
    public void testGetDefaultBean_instantiateReturnsNull_returnsNullAndCachesMarker() {
        PropertyBuilder pb = createDefaultBuilder();
        when(lastBeanDesc.instantiateBean(org.mockito.Matchers.anyBoolean())).thenReturn(null);

        Object first = pb.getDefaultBean();
        Object second = pb.getDefaultBean();

        assertNull(first);
        assertNull(second);
        // เรียกแค่ครั้งเดียวเพราะถูก cache เป็น marker ภายใน
        verify(lastBeanDesc, times(1)).instantiateBean(org.mockito.Matchers.anyBoolean());
    }

    // =========================================================================
    // 5. getPropertyDefaultValue(name, member, type)
    // =========================================================================

    @Test
    public void testGetPropertyDefaultValue_defaultBeanNull_fallsBackToGetDefaultValue() {
        PropertyBuilder pb = createDefaultBuilder();
        when(lastBeanDesc.instantiateBean(org.mockito.Matchers.anyBoolean())).thenReturn(null);
        AnnotatedMember am = mock(AnnotatedMember.class);
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);

        Object result = pb.getPropertyDefaultValue("prop", am, stringType);

        assertEquals("", result); // getDefaultValue(String) == ""
        try {
            verify(am, never()).getValue(org.mockito.Matchers.any());
        } catch (Exception e) {
            fail("unexpected checked exception in verify: " + e);
        }
    }

    @Test
    public void testGetPropertyDefaultValue_defaultBeanNonNull_returnsMemberValue() throws Exception {
        PropertyBuilder pb = createDefaultBuilder();
        Object defaultBean = new Object();
        pb._defaultBean = defaultBean;
        AnnotatedMember am = mock(AnnotatedMember.class);
        when(am.getValue(defaultBean)).thenReturn("actualValue");
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);

        Object result = pb.getPropertyDefaultValue("prop", am, stringType);

        assertEquals("actualValue", result);
    }

    @Test
    public void testGetPropertyDefaultValue_memberThrows_propagatesViaThrowWrapped() throws Exception {
        PropertyBuilder pb = createDefaultBuilder();
        Object defaultBean = new Object();
        pb._defaultBean = defaultBean;
        AnnotatedMember am = mock(AnnotatedMember.class);
        when(am.getValue(defaultBean)).thenThrow(new IllegalStateException("boom"));
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);

        try {
            pb.getPropertyDefaultValue("prop", am, stringType);
            fail("expected IllegalStateException to be re-thrown");
        } catch (IllegalStateException ex) {
            assertEquals("boom", ex.getMessage());
        }
    }

    // =========================================================================
    // 6. _throwWrapped(Exception, String, Object) - ครอบคลุมทั้ง 3 branch
    // =========================================================================

    @Test
    public void testThrowWrapped_causeChainEndsInError_throwsError() {
        PropertyBuilder pb = createDefaultBuilder();
        Error rootError = new Error("boom-error");
        Exception wrapper = new Exception("mid", rootError);

        try {
            pb._throwWrapped(wrapper, "propX", "someDefaultBean");
            fail("expected Error to be thrown");
        } catch (Error e) {
            assertSame(rootError, e);
        }
    }

    @Test
    public void testThrowWrapped_causeChainEndsInRuntimeException_throwsRuntimeException() {
        PropertyBuilder pb = createDefaultBuilder();
        RuntimeException rootRte = new RuntimeException("rte-msg");
        Exception wrapper = new Exception("mid2", rootRte);

        try {
            pb._throwWrapped(wrapper, "propY", "someDefaultBean");
            fail("expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            assertSame(rootRte, e);
        }
    }

    @Test
    public void testThrowWrapped_causeChainEndsInPlainException_throwsIllegalArgumentException() {
        PropertyBuilder pb = createDefaultBuilder();
        Exception innerPlain = new Exception("innerPlain"); // ไม่ใช่ Error/RuntimeException และไม่มี cause ต่อ
        Exception wrapper = new Exception("outer", innerPlain);
        String defaultBean = "someDefaultBeanInstance";

        try {
            pb._throwWrapped(wrapper, "propZ", defaultBean);
            fail("expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("propZ"));
            assertTrue(e.getMessage().contains(defaultBean.getClass().getName()));
        }
    }

    // =========================================================================
    // 7. findSerializationType(Annotated, boolean, JavaType) - ครอบคลุมทุก branch
    // =========================================================================

    @Test
    public void testFindSerializationType_sameType_dynamicTyping_noOverride_returnsNull() throws Exception {
        StubAnnotationIntrospector introspector = new StubAnnotationIntrospector();
        PropertyBuilder pb = createBuilder(introspector, JsonInclude.Value.empty(), true);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = mock(AnnotatedMember.class);

        JavaType result = pb.findSerializationType(am, false, declaredType);

        assertNull(result);
    }

    @Test
    public void testFindSerializationType_sameType_staticTypingParam_returnsStaticType() throws Exception {
        StubAnnotationIntrospector introspector = new StubAnnotationIntrospector();
        PropertyBuilder pb = createBuilder(introspector, JsonInclude.Value.empty(), true);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = mock(AnnotatedMember.class);

        JavaType result = pb.findSerializationType(am, true, declaredType);

        assertNotNull(result);
        assertEquals(String.class, result.getRawClass());
    }

    @Test
    public void testFindSerializationType_typingStatic_overridesFalseToTrue() throws Exception {
        StubAnnotationIntrospector introspector = new StubAnnotationIntrospector();
        introspector.typingResult = JsonSerialize.Typing.STATIC;
        PropertyBuilder pb = createBuilder(introspector, JsonInclude.Value.empty(), true);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = mock(AnnotatedMember.class);

        JavaType result = pb.findSerializationType(am, false, declaredType);

        assertNotNull(result);
        assertEquals(String.class, result.getRawClass());
    }

    @Test
    public void testFindSerializationType_typingDynamic_overridesTrueToFalse() throws Exception {
        StubAnnotationIntrospector introspector = new StubAnnotationIntrospector();
        introspector.typingResult = JsonSerialize.Typing.DYNAMIC;
        PropertyBuilder pb = createBuilder(introspector, JsonInclude.Value.empty(), true);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = mock(AnnotatedMember.class);

        JavaType result = pb.findSerializationType(am, true, declaredType);

        assertNull(result);
    }

    @Test
    public void testFindSerializationType_secondarySuperType_isAssignableFromDeclared() throws Exception {
        // serClass(List).isAssignableFrom(rawDeclared=ArrayList) == true -> branch "fine as is"
        JavaType declaredType = TypeFactory.defaultInstance().constructType(ArrayList.class);
        JavaType secondary = TypeFactory.defaultInstance().constructType(List.class);

        StubAnnotationIntrospector introspector = new StubAnnotationIntrospector();
        introspector.refineResult = secondary;
        PropertyBuilder pb = createBuilder(introspector, JsonInclude.Value.empty(), true);
        AnnotatedMember am = mock(AnnotatedMember.class);

        JavaType result = pb.findSerializationType(am, false, declaredType);

        assertNotNull(result);
        assertEquals(List.class, result.getRawClass());
    }

    @Test
    public void testFindSerializationType_declaredIsSuperTypeOfSecondary_relaxedBranch() throws Exception {
        // serClass(ArrayList).isAssignableFrom(rawDeclared=List) == false
        // -> else: rawDeclared(List).isAssignableFrom(serClass=ArrayList) == true -> ผ่าน (relaxed)
        JavaType declaredType = TypeFactory.defaultInstance().constructType(List.class);
        JavaType secondary = TypeFactory.defaultInstance().constructType(ArrayList.class);

        StubAnnotationIntrospector introspector = new StubAnnotationIntrospector();
        introspector.refineResult = secondary;
        PropertyBuilder pb = createBuilder(introspector, JsonInclude.Value.empty(), true);
        AnnotatedMember am = mock(AnnotatedMember.class);

        JavaType result = pb.findSerializationType(am, false, declaredType);

        assertNotNull(result);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testFindSerializationType_unrelatedTypes_throwsIllegalArgumentException() throws Exception {
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType secondary = TypeFactory.defaultInstance().constructType(Integer.class);

        StubAnnotationIntrospector introspector = new StubAnnotationIntrospector();
        introspector.refineResult = secondary;
        PropertyBuilder pb = createBuilder(introspector, JsonInclude.Value.empty(), true);
        AnnotatedMember am = mock(AnnotatedMember.class);
        when(am.getName()).thenReturn("myProp");

        try {
            pb.findSerializationType(am, false, declaredType);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("myProp"));
        }
    }

    // =========================================================================
    // 8. buildWriter(...) - จำกัดเฉพาะ branch ที่ throw ก่อนถึง BeanPropertyWriter ctor
    //    (ดูหมายเหตุข้อ 4 ด้านบน)
    // =========================================================================

    @Test
    public void testBuildWriter_contentTypeSerWithNullContentType_throwsIllegalStateException() throws Exception {
        StubAnnotationIntrospector introspector = new StubAnnotationIntrospector();
        PropertyBuilder pb = createBuilder(introspector, JsonInclude.Value.empty(), true);

        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class); // ct == null จริงสำหรับ SimpleType
        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        when(propDef.getName()).thenReturn("prop1");
        when(propDef.findInclusion()).thenReturn(JsonInclude.Value.empty());
        AnnotatedMember am = mock(AnnotatedMember.class);
        TypeSerializer contentTypeSer = mock(TypeSerializer.class); // ไม่ null -> เข้า branch

        try {
            pb.buildWriter(null, propDef, declaredType, null, null, contentTypeSer, am, false);
            fail("expected IllegalStateException due to null content type");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("prop1"));
        }
    }

    @Test
    public void testBuildWriter_mismatchedSerializationType_propagatesIllegalArgumentException() throws Exception {
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType secondary = TypeFactory.defaultInstance().constructType(Integer.class); // ไม่สัมพันธ์กัน

        StubAnnotationIntrospector introspector = new StubAnnotationIntrospector();
        introspector.refineResult = secondary;
        PropertyBuilder pb = createBuilder(introspector, JsonInclude.Value.empty(), true);

        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        AnnotatedMember am = mock(AnnotatedMember.class);
        when(am.getName()).thenReturn("propX");

        try {
            pb.buildWriter(null, propDef, declaredType, null, null, null, am, false);
            fail("expected IllegalArgumentException to propagate from findSerializationType");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("propX"));
        }
    }
}
