package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.ser.PropertyBuilder; // redundant (same package) แต่ระบุไว้ตามข้อกำหนด

/**
 * Unit tests for {@link PropertyBuilder}.
 *
 * หมายเหตุ: SerializationConfig เป็น final class จึง mock ไม่ได้ (Mockito/PowerMock ที่ให้มา
 * ไม่มี inline-mock-maker) จึงใช้ ObjectMapper/SerializationConfig/BeanDescription ของจริงทั้งหมด
 */
public class PropertyBuilderTest {

    // =====================================================================
    // Helper fixtures
    // =====================================================================

    static class PlainBean {
        public String x = "v";
    }

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    static class ClassAnnotatedNonDefaultBean {
        public int n;
    }

    static class ForGlobalDefaultBean {
        public int n;
    }

    static class ForConfigOverrideBean {
        public int n;
    }

    static class NoDefaultCtorBean {
        public final int v;
        public NoDefaultCtorBean(int v) { this.v = v; }
    }

    static class TypingBean {
        @JsonSerialize(typing = JsonSerialize.Typing.STATIC)
        public ArrayList<String> staticList = new ArrayList<String>();

        @JsonSerialize(typing = JsonSerialize.Typing.DYNAMIC)
        public ArrayList<String> dynamicList = new ArrayList<String>();

        public ArrayList<String> plainList = new ArrayList<String>();

        @JsonSerialize(as = List.class)
        public ArrayList<String> asSuperList = new ArrayList<String>();

        @JsonSerialize(as = ArrayList.class)
        public List<String> asSubList = new ArrayList<String>();

        // ไม่ assignable ทั้งสองทาง -> ต้อง throw IllegalArgumentException
        @JsonSerialize(as = Integer.class)
        public String badField = "x";
    }

    static class ArrayBean {
        public List<String> tags = new ArrayList<String>();
    }

    static class NonNullBean {
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public String value;
        public NonNullBean(String v) { value = v; }
    }

    static class NonEmptyBean {
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public String value;
        public NonEmptyBean(String v) { value = v; }
    }

    static class NonDefaultPropBean {
        @JsonInclude(JsonInclude.Include.NON_DEFAULT)
        public int number;
        public NonDefaultPropBean(int n) { number = n; }
    }

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    static class NonDefaultClassBean {
        public int number = 7;
        public String text = "abc";
        public NonDefaultClassBean() { }
        public NonDefaultClassBean(int n, String t) { number = n; text = t; }
    }

    static class UnwrapBean {
        @JsonUnwrapped
        public Inner inner = new Inner();
        static class Inner {
            public String a = "hello";
        }
    }

    private PropertyBuilder buildPB(ObjectMapper mapper, Class<?> cls) {
        SerializationConfig config = mapper.getSerializationConfig();
        JavaType type = config.constructType(cls);
        BeanDescription beanDesc = config.introspect(type);
        return new PropertyBuilder(config, beanDesc);
    }

    private PropertyBuilder anyPB() {
        return buildPB(new ObjectMapper(), PlainBean.class);
    }

    private static AnnotatedMember findAccessor(BeanDescription desc, String propName) {
        for (BeanPropertyDefinition def : desc.findProperties()) {
            if (def.getName().equals(propName)) {
                return def.getAccessor();
            }
        }
        throw new IllegalStateException("Property not found: " + propName);
    }

    private static JavaType findPrimaryType(BeanDescription desc, String propName) {
        for (BeanPropertyDefinition def : desc.findProperties()) {
            if (def.getName().equals(propName)) {
                return def.getPrimaryType();
            }
        }
        throw new IllegalStateException("Property not found: " + propName);
    }

    // =====================================================================
    // Part 1: Constructor logic (_defaultInclusion / _useRealPropertyDefaults)
    // =====================================================================

    @Test
    public void constructor_noOverrides_useRealPropertyDefaultsFalse() {
        PropertyBuilder pb = buildPB(new ObjectMapper(), PlainBean.class);
        assertFalse(pb._useRealPropertyDefaults);
    }

    @Test
    public void constructor_classLevelNonDefaultAnnotation_setsUseRealPropertyDefaultsTrue() {
        PropertyBuilder pb = buildPB(new ObjectMapper(), ClassAnnotatedNonDefaultBean.class);
        assertTrue(pb._useRealPropertyDefaults);
    }

    @Test
    public void constructor_globalDefaultNonDefault_doesNotSetUseRealPropertyDefaults() {
        ObjectMapper mapper = new ObjectMapper();
        // ตั้งค่า "global" default inclusion เป็น NON_DEFAULT (ไม่ใช่ per-type)
        mapper.setDefaultPropertyInclusion(
                JsonInclude.Value.construct(JsonInclude.Include.NON_DEFAULT, JsonInclude.Include.ALWAYS));
        PropertyBuilder pb = buildPB(mapper, ForGlobalDefaultBean.class);

        // ตาม comment ในซอร์ส: ใช้ real property defaults เฉพาะเมื่อเป็น per-type NON_DEFAULT เท่านั้น
        // ไม่ใช่ global default -> ต้องเป็น false
        assertFalse(pb._useRealPropertyDefaults);
        // แต่ _defaultInclusion ต้องสะท้อนค่า global ที่ตั้งไว้
        assertEquals(JsonInclude.Include.NON_DEFAULT, pb._defaultInclusion.getValueInclusion());
    }

    @Test
    public void constructor_perTypeConfigOverrideNonDefault_setsUseRealPropertyDefaultsTrue() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configOverride(ForConfigOverrideBean.class)
              .setInclude(JsonInclude.Value.construct(JsonInclude.Include.NON_DEFAULT, JsonInclude.Include.ALWAYS));
        PropertyBuilder pb = buildPB(mapper, ForConfigOverrideBean.class);
        assertTrue(pb._useRealPropertyDefaults);
    }

    // =====================================================================
    // Part 2: getClassAnnotations()
    // =====================================================================

    @Test
    public void getClassAnnotations_delegatesToBeanDescription() {
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        JavaType type = config.constructType(PlainBean.class);
        BeanDescription beanDesc = config.introspect(type);
        PropertyBuilder pb = new PropertyBuilder(config, beanDesc);

        assertSame(beanDesc.getClassAnnotations(), pb.getClassAnnotations());
    }

    // =====================================================================
    // Part 3: getDefaultValue(JavaType)
    // =====================================================================

    @Test
    public void getDefaultValue_primitiveInt_returnsZero() {
        PropertyBuilder pb = anyPB();
        JavaType t = TypeFactory.defaultInstance().constructType(int.class);
        assertEquals(Integer.valueOf(0), pb.getDefaultValue(t));
    }

    @Test
    public void getDefaultValue_primitiveBoolean_returnsFalse() {
        PropertyBuilder pb = anyPB();
        JavaType t = TypeFactory.defaultInstance().constructType(boolean.class);
        assertEquals(Boolean.FALSE, pb.getDefaultValue(t));
    }

    @Test
    public void getDefaultValue_listType_returnsNonEmptyMarker() {
        PropertyBuilder pb = anyPB();
        JavaType t = TypeFactory.defaultInstance().constructType(List.class);
        assertEquals(JsonInclude.Include.NON_EMPTY, pb.getDefaultValue(t));
    }

    @Test
    public void getDefaultValue_mapType_returnsNonEmptyMarker() {
        PropertyBuilder pb = anyPB();
        JavaType t = TypeFactory.defaultInstance().constructType(Map.class);
        assertEquals(JsonInclude.Include.NON_EMPTY, pb.getDefaultValue(t));
    }

    @Test
    public void getDefaultValue_stringType_returnsEmptyString() {
        PropertyBuilder pb = anyPB();
        JavaType t = TypeFactory.defaultInstance().constructType(String.class);
        assertEquals("", pb.getDefaultValue(t));
    }

    @Test
    public void getDefaultValue_plainObjectType_returnsNull() {
        PropertyBuilder pb = anyPB();
        JavaType t = TypeFactory.defaultInstance().constructType(PlainBean.class);
        assertNull(pb.getDefaultValue(t));
    }

    // =====================================================================
    // Part 4: getDefaultBean()
    // =====================================================================

    @Test
    public void getDefaultBean_noDefaultConstructor_returnsNull() {
        PropertyBuilder pb = buildPB(new ObjectMapper(), NoDefaultCtorBean.class);
        assertNull(pb.getDefaultBean());
        // เรียกซ้ำเพื่อตรวจ caching path (NO_DEFAULT_MARKER) ไม่พัง
        assertNull(pb.getDefaultBean());
    }

    @Test
    public void getDefaultBean_withDefaultConstructor_returnsInstanceAndCaches() {
        PropertyBuilder pb = buildPB(new ObjectMapper(), PlainBean.class);
        Object first = pb.getDefaultBean();
        assertNotNull(first);
        assertTrue(first instanceof PlainBean);
        Object second = pb.getDefaultBean();
        // อ้างอิง object เดิม แสดงว่ามี caching ผ่าน field _defaultBean
        assertSame(first, second);
    }

    // =====================================================================
    // Part 5: getPropertyDefaultValue(String, AnnotatedMember, JavaType)
    // =====================================================================

    @Test
    public void getPropertyDefaultValue_noDefaultBean_fallsBackToGetDefaultValue() {
        PropertyBuilder pb = buildPB(new ObjectMapper(), NoDefaultCtorBean.class);

        // member ไม่ถูกใช้งานใน branch นี้ (defaultBean == null) ใช้ member จากคลาสอื่นได้
        BeanDescription otherDesc = new ObjectMapper().getSerializationConfig()
                .introspect(TypeFactory.defaultInstance().constructType(PlainBean.class));
        AnnotatedMember member = findAccessor(otherDesc, "x");

        JavaType intType = TypeFactory.defaultInstance().constructType(int.class);
        Object result = pb.getPropertyDefaultValue("v", member, intType);
        assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void getPropertyDefaultValue_withDefaultBean_returnsFieldValueFromDefaultInstance() {
        ObjectMapper mapper = new ObjectMapper();
        PropertyBuilder pb = buildPB(mapper, PlainBean.class);
        BeanDescription beanDesc = mapper.getSerializationConfig()
                .introspect(TypeFactory.defaultInstance().constructType(PlainBean.class));
        AnnotatedMember member = findAccessor(beanDesc, "x");
        JavaType strType = TypeFactory.defaultInstance().constructType(String.class);

        Object result = pb.getPropertyDefaultValue("x", member, strType);
        assertEquals("v", result); // ค่า default ของฟิลด์ x ใน instance เปล่าของ PlainBean
    }

    // หมายเหตุ: branch ที่ member.getValue(...) throw exception แล้วถูกส่งต่อให้ _throwWrapped
    // ถูกครอบคลุมแบบตรงจุดกว่าใน Part 6 (เพราะการบังคับให้ reflective getValue() throw จริง
    // ผ่าน AnnotatedMember จริงมีความไม่แน่นอนสูง จึงไม่ guess พฤติกรรมเพิ่ม)

    // =====================================================================
    // Part 6: _throwWrapped(Exception, String, Object)
    // =====================================================================

    @Test(expected = IllegalStateException.class)
    public void throwWrapped_rootCauseIsRuntimeException_rethrowsIt() {
        PropertyBuilder pb = anyPB();
        Exception inner = new IllegalStateException("inner");
        Exception outer = new Exception("outer", inner);
        pb._throwWrapped(outer, "prop", new PlainBean());
    }

    @Test(expected = OutOfMemoryError.class)
    public void throwWrapped_rootCauseIsError_rethrowsIt() {
        PropertyBuilder pb = anyPB();
        Error err = new OutOfMemoryError("oom");
        Exception outer = new Exception("outer", err);
        pb._throwWrapped(outer, "prop", new PlainBean());
    }

    @Test
    public void throwWrapped_noCauseAndNotRuntimeOrError_wrapsAsIllegalArgumentException() {
        PropertyBuilder pb = anyPB();
        Exception plain = new Exception("boom"); // checked exception, ไม่มี cause
        try {
            pb._throwWrapped(plain, "myProp", new PlainBean());
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("myProp"));
            assertTrue(e.getMessage().contains(PlainBean.class.getName()));
        }
    }

    @Test(expected = IllegalStateException.class)
    public void throwWrapped_multiLevelCauseChain_resolvesToDeepestCause() {
        PropertyBuilder pb = anyPB();
        Exception deepest = new IllegalStateException("deepest");
        Exception mid = new Exception("mid", deepest);
        Exception outer = new Exception("outer", mid);
        pb._throwWrapped(outer, "prop", new PlainBean());
    }

    // =====================================================================
    // Part 7: findSerializationType(Annotated, boolean, JavaType)
    // =====================================================================

    @Test
    public void findSerializationType_noAnnotation_noStaticTyping_returnsNull() throws Exception {
        PropertyBuilder pb = buildPB(new ObjectMapper(), TypingBean.class);
        BeanDescription desc = new ObjectMapper().getSerializationConfig()
                .introspect(TypeFactory.defaultInstance().constructType(TypingBean.class));
        AnnotatedMember m = findAccessor(desc, "plainList");
        JavaType declared = findPrimaryType(desc, "plainList");

        assertNull(pb.findSerializationType(m, false, declared));
    }

    @Test
    public void findSerializationType_noAnnotation_defaultUseStaticTypingTrue_returnsStaticType() throws Exception {
        PropertyBuilder pb = buildPB(new ObjectMapper(), TypingBean.class);
        BeanDescription desc = new ObjectMapper().getSerializationConfig()
                .introspect(TypeFactory.defaultInstance().constructType(TypingBean.class));
        AnnotatedMember m = findAccessor(desc, "plainList");
        JavaType declared = findPrimaryType(desc, "plainList");

        JavaType result = pb.findSerializationType(m, true, declared);
        assertNotNull(result);
    }

    @Test
    public void findSerializationType_typingStaticAnnotation_forcesStatic() throws Exception {
        PropertyBuilder pb = buildPB(new ObjectMapper(), TypingBean.class);
        BeanDescription desc = new ObjectMapper().getSerializationConfig()
                .introspect(TypeFactory.defaultInstance().constructType(TypingBean.class));
        AnnotatedMember m = findAccessor(desc, "staticList");
        JavaType declared = findPrimaryType(desc, "staticList");

        JavaType result = pb.findSerializationType(m, false, declared);
        assertNotNull(result);
    }

    @Test
    public void findSerializationType_typingDynamicAnnotation_forcesDynamic() throws Exception {
        PropertyBuilder pb = buildPB(new ObjectMapper(), TypingBean.class);
        BeanDescription desc = new ObjectMapper().getSerializationConfig()
                .introspect(TypeFactory.defaultInstance().constructType(TypingBean.class));
        AnnotatedMember m = findAccessor(desc, "dynamicList");
        JavaType declared = findPrimaryType(desc, "dynamicList");

        JavaType result = pb.findSerializationType(m, true, declared);
        assertNull(result);
    }

    @Test
    public void findSerializationType_asSuperType_allowedAndStatic() throws Exception {
        PropertyBuilder pb = buildPB(new ObjectMapper(), TypingBean.class);
        BeanDescription desc = new ObjectMapper().getSerializationConfig()
                .introspect(TypeFactory.defaultInstance().constructType(TypingBean.class));
        AnnotatedMember m = findAccessor(desc, "asSuperList");
        JavaType declared = findPrimaryType(desc, "asSuperList");

        JavaType result = pb.findSerializationType(m, false, declared);
        assertNotNull(result);
        assertEquals(List.class, result.getRawClass());
    }

    @Test
    public void findSerializationType_asSubType_allowedAndStatic() throws Exception {
        PropertyBuilder pb = buildPB(new ObjectMapper(), TypingBean.class);
        BeanDescription desc = new ObjectMapper().getSerializationConfig()
                .introspect(TypeFactory.defaultInstance().constructType(TypingBean.class));
        AnnotatedMember m = findAccessor(desc, "asSubList");
        JavaType declared = findPrimaryType(desc, "asSubList");

        JavaType result = pb.findSerializationType(m, false, declared);
        assertNotNull(result);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void findSerializationType_unrelatedAsType_throwsIllegalArgumentException() throws Exception {
        PropertyBuilder pb = buildPB(new ObjectMapper(), TypingBean.class);
        BeanDescription desc = new ObjectMapper().getSerializationConfig()
                .introspect(TypeFactory.defaultInstance().constructType(TypingBean.class));
        AnnotatedMember m = findAccessor(desc, "badField");
        JavaType declared = findPrimaryType(desc, "badField");

        pb.findSerializationType(m, false, declared);
    }

    // =====================================================================
    // Part 8: buildWriter(...) - ทดสอบแบบ indirect ผ่าน ObjectMapper
    // (สร้าง BeanPropertyWriter ตรง ๆ ยากมากเนื่องจากต้องใช้ AnnotatedField/Method จริง)
    // =====================================================================

    @Test
    public void buildWriter_arrayDefaultInclusion_emptyArraysWrittenByDefault() throws Exception {
        ObjectMapper mapper = new ObjectMapper(); // WRITE_EMPTY_JSON_ARRAYS = enabled (default)
        String json = mapper.writeValueAsString(new ArrayBean());
        assertTrue(json.contains("\"tags\":[]"));
    }

    @Test
    public void buildWriter_arrayDefaultInclusion_emptyArraysSuppressedWhenFeatureDisabled() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
        String json = mapper.writeValueAsString(new ArrayBean());
        assertFalse(json.contains("tags"));
    }

    @Test
    public void buildWriter_nonNullInclusion_suppressesNullValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new NonNullBean(null));
        assertFalse(json.contains("value"));
    }

    @Test
    public void buildWriter_nonNullInclusion_keepsNonNullValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new NonNullBean("x"));
        assertTrue(json.contains("\"value\":\"x\""));
    }

    @Test
    public void buildWriter_nonEmptyInclusion_suppressesEmptyString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new NonEmptyBean(""));
        assertFalse(json.contains("value"));
    }

    @Test
    public void buildWriter_nonEmptyInclusion_keepsNonEmptyString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new NonEmptyBean("hi"));
        assertTrue(json.contains("\"value\":\"hi\""));
    }

    @Test
    public void buildWriter_propertyLevelNonDefault_suppressesDefaultPrimitiveValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new NonDefaultPropBean(0));
        assertFalse(json.contains("number"));
    }

    @Test
    public void buildWriter_propertyLevelNonDefault_keepsNonDefaultPrimitiveValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new NonDefaultPropBean(5));
        assertTrue(json.contains("\"number\":5"));
    }

    @Test
    public void buildWriter_classLevelNonDefault_suppressesValuesEqualToDefaultInstance() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new NonDefaultClassBean(7, "abc"));
        assertFalse(json.contains("number"));
        assertFalse(json.contains("text"));
    }

    @Test
    public void buildWriter_classLevelNonDefault_keepsValuesDifferentFromDefaultInstance() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new NonDefaultClassBean(9, "xyz"));
        assertTrue(json.contains("\"number\":9"));
        assertTrue(json.contains("\"text\":\"xyz\""));
    }

    @Test
    public void buildWriter_unwrappedProperty_flattensNestedObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new UnwrapBean());
        assertFalse(json.contains("inner"));
        assertTrue(json.contains("\"a\":\"hello\""));
    }

    @Test
    public void buildWriter_incompatibleJsonSerializeAs_causesSerializationFailure() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValueAsString(new TypingBean());
            fail("Expected failure due to incompatible @JsonSerialize(as=...) on badField");
        } catch (Exception e) {
            // หมายเหตุ: IllegalArgumentException ที่ throw จาก findSerializationType()
            // ไม่ได้ถูก catch โดย try/catch(JsonMappingException) ใน buildWriter() ตามซอร์สที่ให้มา
            // exact exception/wrapper type ที่หลุดออกมาจาก ObjectMapper ไม่ถูกระบุไว้ในซอร์สคลาสเป้าหมาย
            // จึงยืนยันเพียงว่าต้องเกิดความล้มเหลวขึ้นจริง (ไม่ guess ชนิด exception เพิ่ม)
            assertNotNull(e);
        }
    }
}
