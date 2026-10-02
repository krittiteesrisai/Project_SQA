package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.util.BeanUtil;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit test สำหรับ {@link PropertyBuilder}
 *
 * หมายเหตุสำคัญ:
 * - ใช้ ObjectMapper/BeanDescription จริง (ไม่ mock) เพราะ internal types ของ Jackson
 *   (JavaType, AnnotatedMember, BeanPropertyDefinition ฯลฯ) มี implementation ซับซ้อนมาก
 *   การ mock จะเสี่ยงสร้าง behavior ที่ไม่มีอยู่ในซอร์สจริง
 * - Test class อยู่ package เดียวกับคลาสเป้าหมาย เพื่อเข้าถึง protected method/field ได้ตรง ๆ
 * - บางสาขาที่ไม่สามารถ trigger ได้ผ่าน public API (เช่น accessor == null ใน buildWriter,
 *   หรือ contentTypeSer ที่มี content type เป็น null) ถูกข้ามไปพร้อมคอมเมนต์กำกับตามข้อกำหนด
 */
public class PropertyBuilderTest
{
    private ObjectMapper mapper;
    private SerializationConfig config;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getSerializationConfig();
    }

    // ----------------------------------------------------------------
    // Helper fixtures
    // ----------------------------------------------------------------

    static class Animal {}
    static class Dog extends Animal {}
    static class Cat extends Animal {}

    static class PlainDogBean {
        public Dog getDog() { return new Dog(); }
    }

    static class SuperTypeAnnotatedBean {
        @JsonSerialize(as = Animal.class)
        public Dog getDog() { return new Dog(); }
    }

    static class UnrelatedTypeAnnotatedBean {
        @JsonSerialize(as = Cat.class)
        public Dog getDog() { return new Dog(); }
    }

    static class StaticTypingBean {
        @JsonSerialize(typing = JsonSerialize.Typing.STATIC)
        public Dog getDog() { return new Dog(); }
    }

    static class DynamicTypingBean {
        @JsonSerialize(typing = JsonSerialize.Typing.DYNAMIC)
        public Dog getDog() { return new Dog(); }
    }

    static class DefaultableBean {
        public int x = 5;
    }

    interface NoInstanceInterface {
        int getX();
    }

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    static class NonDefaultBean {
        public int x;
    }

    private BeanDescription introspect(Class<?> cls) {
        return config.introspect(mapper.constructType(cls));
    }

    private PropertyBuilder builderFor(Class<?> cls) {
        return new PropertyBuilder(config, introspect(cls));
    }

    private BeanPropertyDefinition findProp(BeanDescription desc, String name) {
        for (BeanPropertyDefinition p : desc.findProperties()) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        throw new IllegalStateException("Property not found: " + name);
    }

    // ==================================================================
    // 1) Constructor
    // ==================================================================

    @Test
    public void testConstructor_plainBean_useRealPropertyDefaultsFalse() {
        PropertyBuilder pb = builderFor(PlainDogBean.class);
        assertFalse(pb._useRealPropertyDefaults);
        assertNotNull(pb._defaultInclusion);
    }

    @Test
    public void testConstructor_classLevelNonDefault_setsUseRealPropertyDefaultsTrue() {
        PropertyBuilder pb = builderFor(NonDefaultBean.class);
        assertTrue(pb._useRealPropertyDefaults);
    }

    @Test
    public void testGetClassAnnotations_delegatesToBeanDescription() {
        BeanDescription desc = introspect(PlainDogBean.class);
        PropertyBuilder pb = new PropertyBuilder(config, desc);
        assertSame(desc.getClassAnnotations(), pb.getClassAnnotations());
    }

    // ==================================================================
    // 2) findSerializationType(Annotated, boolean, JavaType)
    // ==================================================================

    @Test
    public void testFindSerializationType_noAnnotation_dynamicReturnsNull() throws Exception {
        BeanDescription desc = introspect(PlainDogBean.class);
        PropertyBuilder pb = new PropertyBuilder(config, desc);
        BeanPropertyDefinition prop = findProp(desc, "dog");
        JavaType declared = mapper.constructType(Dog.class);

        JavaType result = pb.findSerializationType(prop.getAccessor(), false, declared);
        assertNull(result); // secondary==declaredType, typing==null, useStaticTyping=false -> null
    }

    @Test
    public void testFindSerializationType_noAnnotation_staticReturnsDeclaredType() throws Exception {
        BeanDescription desc = introspect(PlainDogBean.class);
        PropertyBuilder pb = new PropertyBuilder(config, desc);
        BeanPropertyDefinition prop = findProp(desc, "dog");
        JavaType declared = mapper.constructType(Dog.class);

        JavaType result = pb.findSerializationType(prop.getAccessor(), true, declared);
        assertNotNull(result); // useStaticTyping=true -> declaredType.withStaticTyping()
        assertEquals(Dog.class, result.getRawClass());
    }

    @Test
    public void testFindSerializationType_superTypeOverride_assignableBranch() throws Exception {
        BeanDescription desc = introspect(SuperTypeAnnotatedBean.class);
        PropertyBuilder pb = new PropertyBuilder(config, desc);
        BeanPropertyDefinition prop = findProp(desc, "dog");
        JavaType declared = mapper.constructType(Dog.class);

        JavaType result = pb.findSerializationType(prop.getAccessor(), false, declared);
        assertNotNull(result);
        assertEquals(Animal.class, result.getRawClass()); // declaredType reassigned to secondary
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSerializationType_unrelatedType_throwsIllegalArgumentException() throws Exception {
        BeanDescription desc = introspect(UnrelatedTypeAnnotatedBean.class);
        PropertyBuilder pb = new PropertyBuilder(config, desc);
        BeanPropertyDefinition prop = findProp(desc, "dog");
        JavaType declared = mapper.constructType(Dog.class);

        // Cat ไม่ใช่ supertype/subtype ของ Dog -> เข้าทั้งสองเงื่อนไข false -> throw
        pb.findSerializationType(prop.getAccessor(), false, declared);
    }

    @Test
    public void testFindSerializationType_explicitStaticTyping_overridesFalse() throws Exception {
        BeanDescription desc = introspect(StaticTypingBean.class);
        PropertyBuilder pb = new PropertyBuilder(config, desc);
        BeanPropertyDefinition prop = findProp(desc, "dog");
        JavaType declared = mapper.constructType(Dog.class);

        JavaType result = pb.findSerializationType(prop.getAccessor(), false, declared);
        assertNotNull(result); // typing==STATIC -> useStaticTyping forced true
    }

    @Test
    public void testFindSerializationType_explicitDynamicTyping_overridesTrue() throws Exception {
        BeanDescription desc = introspect(DynamicTypingBean.class);
        PropertyBuilder pb = new PropertyBuilder(config, desc);
        BeanPropertyDefinition prop = findProp(desc, "dog");
        JavaType declared = mapper.constructType(Dog.class);

        JavaType result = pb.findSerializationType(prop.getAccessor(), true, declared);
        assertNull(result); // typing==DYNAMIC -> useStaticTyping forced false -> null
    }

    // ==================================================================
    // 3) getDefaultBean()
    // ==================================================================

    @Test
    public void testGetDefaultBean_instantiableAndCached() {
        PropertyBuilder pb = builderFor(DefaultableBean.class);
        Object bean1 = pb.getDefaultBean();
        assertNotNull(bean1);
        assertTrue(bean1 instanceof DefaultableBean);

        Object bean2 = pb.getDefaultBean();
        assertSame(bean1, bean2); // cache branch: _defaultBean != null
    }

    @Test
    public void testGetDefaultBean_notInstantiable_returnsNullAndCached() {
        PropertyBuilder pb = builderFor(NoInstanceInterface.class);
        assertNull(pb.getDefaultBean()); // NO_DEFAULT_MARKER branch
        assertNull(pb.getDefaultBean()); // cached NO_DEFAULT_MARKER path
    }

    // ==================================================================
    // 4) getPropertyDefaultValue / getDefaultValue (deprecated)
    // ==================================================================

    @Test
    @SuppressWarnings("deprecation")
    public void testGetPropertyDefaultValue_withDefaultBean_returnsMemberValue() throws Exception {
        BeanDescription desc = introspect(DefaultableBean.class);
        PropertyBuilder pb = new PropertyBuilder(config, desc);
        BeanPropertyDefinition prop = findProp(desc, "x");
        JavaType type = mapper.constructType(int.class);

        Object value = pb.getPropertyDefaultValue("x", prop.getAccessor(), type);
        assertEquals(5, value);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testGetPropertyDefaultValue_noDefaultBean_fallsBackToBeanUtil() throws Exception {
        BeanDescription desc = introspect(NoInstanceInterface.class);
        PropertyBuilder pb = new PropertyBuilder(config, desc);
        JavaType type = mapper.constructType(int.class);

        Object expected = BeanUtil.getDefaultValue(type);
        // defaultBean==null -> member ไม่ถูกใช้งานเลย ส่ง null ได้อย่างปลอดภัย
        Object value = pb.getPropertyDefaultValue("x", null, type);
        assertEquals(expected, value);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testGetDefaultValue_delegatesToBeanUtil() {
        PropertyBuilder pb = builderFor(DefaultableBean.class);
        JavaType intType = mapper.constructType(int.class);
        JavaType objType = mapper.constructType(Object.class);

        assertEquals(BeanUtil.getDefaultValue(intType), pb.getDefaultValue(intType));
        assertEquals(BeanUtil.getDefaultValue(objType), pb.getDefaultValue(objType));
    }

    // ==================================================================
    // 5) _throwWrapped(Exception, String, Object)
    // ==================================================================

    @Test
    public void testThrowWrapped_runtimeExceptionRethrownAsIs() {
        PropertyBuilder pb = builderFor(DefaultableBean.class);
        RuntimeException ex = new IllegalStateException("boom");
        try {
            pb._throwWrapped(ex, "prop", new DefaultableBean());
            fail("Expected exception to be thrown");
        } catch (IllegalStateException e) {
            assertEquals("boom", e.getMessage());
        }
    }

    @Test
    public void testThrowWrapped_checkedExceptionWrappedAsIllegalArgument() {
        PropertyBuilder pb = builderFor(DefaultableBean.class);
        Exception ex = new Exception("fail"); // checked, not RTE, not Error
        try {
            pb._throwWrapped(ex, "prop", new DefaultableBean());
            fail("Expected exception to be thrown");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("prop"));
            assertTrue(e.getMessage().contains(DefaultableBean.class.getName()));
        }
    }

    @Test
    public void testThrowWrapped_unwrapsCauseChain_toRuntimeException() {
        PropertyBuilder pb = builderFor(DefaultableBean.class);
        RuntimeException inner = new RuntimeException("inner");
        Exception outer = new Exception("outer", inner);
        try {
            pb._throwWrapped(outer, "prop", new DefaultableBean());
            fail("Expected exception to be thrown");
        } catch (RuntimeException e) {
            assertEquals("inner", e.getMessage());
        }
    }

    @Test
    public void testThrowWrapped_unwrapsCauseChain_toError() {
        PropertyBuilder pb = builderFor(DefaultableBean.class);
        Error inner = new OutOfMemoryError("oom");
        Exception outer = new Exception("outer", inner);
        try {
            pb._throwWrapped(outer, "prop", new DefaultableBean());
            fail("Expected exception to be thrown");
        } catch (OutOfMemoryError e) {
            assertEquals("oom", e.getMessage());
        }
    }

    // ==================================================================
    // 6) buildWriter(...) - ทดสอบทางอ้อมผ่าน ObjectMapper.writeValueAsString
    //    (ครอบคลุม switch-case ของ JsonInclude.Include และสาขาอื่น ๆ)
    // ==================================================================

    static class NonNullBean {
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public String name;
        public NonNullBean(String n) { name = n; }
    }

    @Test
    public void testBuildWriter_nonNull_excludesNull() throws Exception {
        String json = mapper.writeValueAsString(new NonNullBean(null));
        assertFalse(json.contains("name"));
    }

    @Test
    public void testBuildWriter_nonNull_includesValue() throws Exception {
        String json = mapper.writeValueAsString(new NonNullBean("hi"));
        assertTrue(json.contains("\"name\":\"hi\""));
    }

    static class NonEmptyBean {
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public String name;
        public NonEmptyBean(String n) { name = n; }
    }

    @Test
    public void testBuildWriter_nonEmpty_excludesEmptyString() throws Exception {
        String json = mapper.writeValueAsString(new NonEmptyBean(""));
        assertFalse(json.contains("name"));
    }

    @Test
    public void testBuildWriter_nonEmpty_excludesNull() throws Exception {
        String json = mapper.writeValueAsString(new NonEmptyBean(null));
        assertFalse(json.contains("name"));
    }

    @Test
    public void testBuildWriter_nonEmpty_includesNonEmptyValue() throws Exception {
        String json = mapper.writeValueAsString(new NonEmptyBean("x"));
        assertTrue(json.contains("\"name\":\"x\""));
    }

    // NON_DEFAULT ที่ประกาศระดับ property (ไม่ตั้ง _useRealPropertyDefaults)
    static class NonDefaultValueBean {
        @JsonInclude(JsonInclude.Include.NON_DEFAULT)
        public int score;
        public NonDefaultValueBean(int s) { score = s; }
    }

    @Test
    public void testBuildWriter_nonDefault_propertyLevel_excludesBeanUtilDefault() throws Exception {
        String json = mapper.writeValueAsString(new NonDefaultValueBean(0));
        assertFalse(json.contains("score")); // 0 == BeanUtil.getDefaultValue(int)
    }

    @Test
    public void testBuildWriter_nonDefault_propertyLevel_includesNonDefaultValue() throws Exception {
        String json = mapper.writeValueAsString(new NonDefaultValueBean(7));
        assertTrue(json.contains("\"score\":7"));
    }

    // NON_DEFAULT ระดับคลาส + มี default constructor -> ใช้ _useRealPropertyDefaults branch
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    static class ClassLevelNonDefaultBean {
        public String name;
        public ClassLevelNonDefaultBean() { name = "default"; }
        public ClassLevelNonDefaultBean(String n) { name = n; }
    }

    @Test
    public void testBuildWriter_classLevelNonDefault_excludesEqualToDefaultBeanValue() throws Exception {
        String json = mapper.writeValueAsString(new ClassLevelNonDefaultBean("default"));
        assertFalse(json.contains("name"));
    }

    @Test
    public void testBuildWriter_classLevelNonDefault_includesDifferentValue() throws Exception {
        String json = mapper.writeValueAsString(new ClassLevelNonDefaultBean("other"));
        assertTrue(json.contains("\"name\":\"other\""));
    }

    // NON_DEFAULT ระดับคลาส แต่ไม่มี default constructor -> getDefaultBean()==null -> fallback
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    static class NoDefaultCtorNonDefaultBean {
        public String name;
        public NoDefaultCtorNonDefaultBean(String n) { name = n; }
    }

    @Test
    public void testBuildWriter_nonDefault_noDefaultCtor_fallsBackAndSuppressesNull() throws Exception {
        String json = mapper.writeValueAsString(new NoDefaultCtorNonDefaultBean(null));
        assertFalse(json.contains("name"));
    }

    @Test
    public void testBuildWriter_nonDefault_noDefaultCtor_includesNonNullValue() throws Exception {
        String json = mapper.writeValueAsString(new NoDefaultCtorNonDefaultBean("abc"));
        assertTrue(json.contains("\"name\":\"abc\""));
    }

    // ALWAYS (default) + container-type suppression ขึ้นกับ WRITE_EMPTY_JSON_ARRAYS
    static class ListBean {
        public List<String> items;
        public ListBean(List<String> items) { this.items = items; }
    }

    @Test
    public void testBuildWriter_always_emptyArrayIncludedByDefaultFeature() throws Exception {
        String json = mapper.writeValueAsString(new ListBean(new ArrayList<String>()));
        assertTrue(json.contains("\"items\":[]"));
    }

    @Test
    public void testBuildWriter_always_emptyArraySuppressedWhenFeatureDisabled() throws Exception {
        ObjectMapper m = new ObjectMapper();
        m.configure(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS, false);
        String json = m.writeValueAsString(new ListBean(new ArrayList<String>()));
        assertFalse(json.contains("items"));
    }

    @Test
    public void testBuildWriter_always_nonEmptyArrayIncluded() throws Exception {
        String json = mapper.writeValueAsString(new ListBean(Arrays.asList("a", "b")));
        assertTrue(json.contains("\"items\":[\"a\",\"b\"]"));
    }

    // CUSTOM inclusion
    static class ZeroFilter {
        @Override
        public boolean equals(Object obj) {
            return (obj instanceof Integer) && ((Integer) obj) == 0;
        }
    }

    static class CustomFilterBean {
        @JsonInclude(value = JsonInclude.Include.CUSTOM, valueFilter = ZeroFilter.class)
        public int value;
        public CustomFilterBean(int v) { value = v; }
    }

    @Test
    public void testBuildWriter_customFilter_suppressesMatchingValue() throws Exception {
        String json = mapper.writeValueAsString(new CustomFilterBean(0));
        assertFalse(json.contains("value"));
    }

    @Test
    public void testBuildWriter_customFilter_includesNonMatchingValue() throws Exception {
        String json = mapper.writeValueAsString(new CustomFilterBean(5));
        assertTrue(json.contains("\"value\":5"));
    }

    // Null serializer branch (_annotationIntrospector.findNullSerializer != null)
    static class NullSerBean {
        @JsonSerialize(nullsUsing = NullSerializer.class)
        public String name;
    }

    @Test
    public void testBuildWriter_customNullSerializer_doesNotFailAndWritesNull() throws Exception {
        // NOTE: ผลลัพธ์ JSON เหมือนกับ default null handling แต่ branch
        // serDef != null -> bpw.assignNullSerializer(...) ถูกเรียกจริง
        String json = mapper.writeValueAsString(new NullSerBean());
        assertTrue(json.contains("\"name\":null"));
    }

    // Unwrapping branch (_annotationIntrospector.findUnwrappingNameTransformer != null)
    static class Inner {
        public String a = "A";
    }

    static class UnwrappedOuter {
        @JsonUnwrapped
        public Inner inner = new Inner();
    }

    @Test
    public void testBuildWriter_jsonUnwrapped_flattensProperties() throws Exception {
        String json = mapper.writeValueAsString(new UnwrappedOuter());
        assertTrue(json.contains("\"a\":\"A\""));
        assertFalse(json.contains("\"inner\""));
    }

    // ==================================================================
    // 7) findSerializationType ผ่าน buildWriter: exception ไม่ถูก catch เพราะเป็น
    //    unchecked IllegalArgumentException ไม่ใช่ JsonMappingException ตามที่ catch ไว้
    // ==================================================================

    @Test
    public void testBuildWriter_invalidTypeOverride_exceptionPropagatesWithExpectedMessage() {
        boolean thrown = false;
        String foundMessage = null;
        try {
            mapper.writeValueAsString(new UnrelatedTypeAnnotatedBean());
        } catch (Throwable t) {
            thrown = true;
            Throwable cur = t;
            while (cur != null) {
                if (cur.getMessage() != null && cur.getMessage().contains("not a super-type")) {
                    foundMessage = cur.getMessage();
                    break;
                }
                cur = cur.getCause();
            }
        }
        assertTrue("Expected an exception to be thrown", thrown);
        assertNotNull("Expected 'not a super-type' message somewhere in cause chain", foundMessage);
    }

    // ----------------------------------------------------------------
    // หมายเหตุ: สาขาที่ไม่ได้ทดสอบเพราะไม่สามารถ trigger ผ่าน public API
    // โดยไม่ mock internal Jackson object จนเสี่ยงเดา behavior:
    //  - buildWriter: accessor == null (propDef.getAccessor() เป็น null)
    //  - buildWriter: contentTypeSer != null พร้อม serializationType.getContentType()==null
    //  - NON_ABSENT กับ java.util.Optional (ขึ้นกับโมดูล/เวอร์ชันที่ลงทะเบียน ReferenceType)
    // ----------------------------------------------------------------
}
