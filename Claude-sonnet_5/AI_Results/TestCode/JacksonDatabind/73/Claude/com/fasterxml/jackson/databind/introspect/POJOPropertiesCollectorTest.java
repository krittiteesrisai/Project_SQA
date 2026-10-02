package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.Method;
import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;

// import คลาสเป้าหมายอย่างชัดเจนตามที่กำหนด (แม้จะอยู่ package เดียวกันแล้วก็ตาม)
import com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector;

public class POJOPropertiesCollectorTest
{
    // =========================================================
    // Test fixtures (POJO ตัวช่วยสำหรับแต่ละ branch)
    // =========================================================

    static class EmptyBean { }

    static class SimpleBean {
        public String name;
        private int age;
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
    }

    static class FinalFieldBean {
        public final String id = "xyz";
        public String other;
    }

    static class IgnoredBean {
        public String visible;
        @JsonIgnore
        public String hidden;
    }

    static class TransientNoAnnotationBean {
        public transient String secret;
        public String normal;
    }

    static class TransientWithExplicitNameBean {
        @JsonProperty("secretRenamed")
        public transient String secret;
    }

    static class AnySetterFieldBean {
        @JsonAnySetter
        public Map<String,Object> extra = new HashMap<String,Object>();
        public String name;
    }

    static class DualAnySetterFieldBean {
        @JsonAnySetter
        public Map<String,Object> extra1 = new HashMap<String,Object>();
        @JsonAnySetter
        public Map<String,Object> extra2 = new HashMap<String,Object>();
    }

    static class AnyGetterBean {
        @JsonAnyGetter
        public Map<String,Object> any() { return Collections.emptyMap(); }
        public String name;
    }

    static class DualAnyGetterBean {
        @JsonAnyGetter
        public Map<String,Object> any1() { return Collections.emptyMap(); }
        @JsonAnyGetter
        public Map<String,Object> any2() { return Collections.emptyMap(); }
    }

    static class JsonValueBean {
        @JsonValue
        public String asString() { return "x"; }
    }

    static class DualJsonValueBean {
        @JsonValue
        public String asString1() { return "x"; }
        @JsonValue
        public String asString2() { return "y"; }
    }

    static class AnySetterMethodBean {
        @JsonAnySetter
        public void set(String name, Object value) { }
    }

    static class DualAnySetterMethodBean {
        @JsonAnySetter
        public void set1(String name, Object value) { }
        @JsonAnySetter
        public void set2(String name, Object value) { }
    }

    static class InjectableBean {
        @JacksonInject("foo")
        public String injectedField;
    }

    static class DuplicateInjectableBean {
        @JacksonInject("dup")
        public String field1;
        @JacksonInject("dup")
        public String field2;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
    static class ObjectIdBean {
        public int id;
    }

    static class PlainBean {
        public int value;
    }

    static class WithBuilder {
        static class Builder {
            public WithBuilder build() { return new WithBuilder(); }
        }
    }

    @JsonDeserialize(builder = WithBuilder.Builder.class)
    static class BuilderTarget {
        public String value;
    }

    static class CreatorBean {
        public final String a;
        public final int b;
        @JsonCreator
        public CreatorBean(@JsonProperty("a") String a, @JsonProperty("b") int b) {
            this.a = a; this.b = b;
        }
    }

    static class AlphaBean {
        public String zebra;
        public String apple;
        public String mango;
    }

    static class NamingBean {
        public String someValue;
    }

    // non-static inner class (ของ test class เอง) เพื่อทดสอบ isNonStaticInnerClass()
    public class NonStaticInner {
        public String value;
    }

    // =========================================================
    // Helper: สร้าง POJOPropertiesCollector ผ่าน protected constructor
    // (ใช้สิทธิ์ same-package access ตามที่ Java อนุญาต)
    // =========================================================

    private POJOPropertiesCollector newCollector(Class<?> cls, boolean forSerialization) {
        return newCollector(new ObjectMapper(), cls, forSerialization, null);
    }

    private POJOPropertiesCollector newCollector(ObjectMapper mapper, Class<?> cls,
            boolean forSerialization, String mutatorPrefix)
    {
        MapperConfig<?> config = forSerialization
                ? mapper.getSerializationConfig()
                : mapper.getDeserializationConfig();
        JavaType type = mapper.constructType(cls);
        AnnotatedClass ac = constructAnnotatedClass(type, config);
        return new POJOPropertiesCollector(config, forSerialization, type, ac, mutatorPrefix);
    }

    /**
     * NOTE (สมมติฐานของ test-infrastructure ไม่ใช่ behavior ของคลาสเป้าหมาย):
     * สันนิษฐานว่า AnnotatedClass มี static factory
     * {@code construct(JavaType, MapperConfig<?>)} ตาม API ของ jackson-databind
     * รุ่นก่อน 2.9 (ก่อนมี AnnotatedClassResolver) ถ้าไม่ตรง จะได้ error
     * ที่ชัดเจนตอน runtime แทนการ compile-fail
     */
    private static AnnotatedClass constructAnnotatedClass(JavaType type, MapperConfig<?> config) {
        try {
            Method m = AnnotatedClass.class.getMethod("construct", JavaType.class, MapperConfig.class);
            return (AnnotatedClass) m.invoke(null, type, config);
        } catch (Exception e) {
            throw new IllegalStateException(
                    "ไม่สามารถสร้าง AnnotatedClass ได้ (API ของ Jackson เวอร์ชันนี้อาจต่างจากที่สมมติไว้): " + e, e);
        }
    }

    private List<String> propertyNames(POJOPropertiesCollector c) {
        List<String> names = new ArrayList<String>();
        for (BeanPropertyDefinition p : c.getProperties()) {
            names.add(p.getName());
        }
        return names;
    }

    // =========================================================
    // 1. Accessors ง่าย ๆ (coverage baseline)
    // =========================================================

    @Test
    public void testGetConfigTypeClassDefAccessors() {
        POJOPropertiesCollector c = newCollector(SimpleBean.class, true);
        assertNotNull(c.getConfig());
        assertNotNull(c.getType());
        assertNotNull(c.getClassDef());
        assertNotNull(c.getAnnotationIntrospector());
    }

    @Test
    public void testCollectDeprecatedReturnsSelf() {
        POJOPropertiesCollector c = newCollector(SimpleBean.class, true);
        assertSame(c, c.collect());
    }

    // =========================================================
    // 2. Constructor branch: mutatorPrefix null -> "set", custom -> ใช้ค่าที่ส่งมา
    // =========================================================

    @Test
    public void testMutatorPrefixDefaultsToSetWhenNull() {
        POJOPropertiesCollector c = newCollector(SimpleBean.class, false);
        assertEquals("set", c._mutatorPrefix);
    }

    @Test
    public void testMutatorPrefixCustomValueUsed() {
        POJOPropertiesCollector c = newCollector(new ObjectMapper(), SimpleBean.class, false, "with");
        assertEquals("with", c._mutatorPrefix);
    }

    // =========================================================
    // 3. Constructor branch: annotationIntrospector null/ไม่ null -> visibilityChecker
    // =========================================================

    @Test
    public void testVisibilityCheckerUsesDefaultWhenAnnotationIntrospectorNull() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(MapperFeature.USE_ANNOTATIONS);
        POJOPropertiesCollector c = newCollector(mapper, SimpleBean.class, true, null);
        assertNull(c._annotationIntrospector);
        assertNotNull(c._visibilityChecker);
    }

    @Test
    public void testVisibilityCheckerUsesIntrospectorWhenPresent() {
        POJOPropertiesCollector c = newCollector(SimpleBean.class, true);
        assertNotNull(c._annotationIntrospector);
        assertNotNull(c._visibilityChecker);
    }

    // =========================================================
    // 4. Boundary: empty bean
    // =========================================================

    @Test
    public void testEmptyBeanHasNoProperties() {
        POJOPropertiesCollector c = newCollector(EmptyBean.class, true);
        assertTrue(c.getProperties().isEmpty());
    }

    // =========================================================
    // 5. Field + getter/setter merge, ลำดับ insertion (ไม่ sort)
    // =========================================================

    @Test
    public void testSimpleBeanPropertiesOrderAndNames() {
        POJOPropertiesCollector c = newCollector(SimpleBean.class, true);
        assertEquals(Arrays.asList("name", "age"), propertyNames(c));
    }

    // =========================================================
    // 6. pruneFinalFields branch (deserialization vs serialization vs allowed)
    // =========================================================

    @Test
    public void testFinalFieldPrunedForDeserializationByDefault() {
        POJOPropertiesCollector c = newCollector(FinalFieldBean.class, false);
        assertFalse(propertyNames(c).contains("id"));
        assertTrue(propertyNames(c).contains("other"));
    }

    @Test
    public void testFinalFieldKeptForSerialization() {
        POJOPropertiesCollector c = newCollector(FinalFieldBean.class, true);
        assertTrue(propertyNames(c).contains("id"));
    }

    @Test
    public void testFinalFieldKeptForDeserializationWhenAllowedByFeature() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS);
        POJOPropertiesCollector c = newCollector(mapper, FinalFieldBean.class, false, null);
        assertTrue(propertyNames(c).contains("id"));
    }

    // =========================================================
    // 7. Ignored property branches
    // =========================================================

    @Test
    public void testIgnoredPropertyRemovedFromProperties() {
        POJOPropertiesCollector c = newCollector(IgnoredBean.class, false);
        assertFalse(propertyNames(c).contains("hidden"));
        assertTrue(propertyNames(c).contains("visible"));
    }

    @Test
    public void testIgnoredPropertyNamesCollectedOnlyForDeserialization() {
        POJOPropertiesCollector cDeser = newCollector(IgnoredBean.class, false);
        assertNotNull(cDeser.getIgnoredPropertyNames());
        assertTrue(cDeser.getIgnoredPropertyNames().contains("hidden"));

        POJOPropertiesCollector cSer = newCollector(IgnoredBean.class, true);
        // _collectIgnorals ไม่บันทึกเมื่อ forSerialization == true
        assertNull(cSer.getIgnoredPropertyNames());
    }

    // =========================================================
    // 8. transient field branches
    // =========================================================

    @Test
    public void testTransientFieldWithoutAnnotationNotVisible() {
        POJOPropertiesCollector c = newCollector(TransientNoAnnotationBean.class, false);
        assertFalse(propertyNames(c).contains("secret"));
        assertTrue(propertyNames(c).contains("normal"));
    }

    @Test
    public void testTransientFieldWithExplicitNameStaysVisible() {
        POJOPropertiesCollector c = newCollector(TransientWithExplicitNameBean.class, false);
        assertTrue(propertyNames(c).contains("secretRenamed"));
    }

    // =========================================================
    // 9. any-setter field (single / multiple -> reportProblem)
    // =========================================================

    @Test
    public void testAnySetterFieldSingleDetected() {
        POJOPropertiesCollector c = newCollector(AnySetterFieldBean.class, false);
        assertNotNull(c.getAnySetterField());
    }

    @Test
    public void testAnySetterFieldMultipleThrowsException() {
        // หมายเหตุ: ในซอร์สโค้ด ข้อความ error ของ getAnySetterField() อ้างอิง
        // "_anySetters" (ลิสต์คนละตัวกับ _anySetterField) ซึ่งถ้าไม่มี any-setter
        // method เลย _anySetters จะเป็น null -> โค้ดนี้อาจโยน NullPointerException
        // แทน IllegalArgumentException (เป็นข้อบกพร่องที่ตรวจพบได้จากซอร์ส ไม่ใช่การเดา)
        POJOPropertiesCollector c = newCollector(DualAnySetterFieldBean.class, false);
        try {
            c.getAnySetterField();
            fail("คาดว่าต้องมี exception เมื่อพบ any-setter field มากกว่าหนึ่งตัว");
        } catch (NullPointerException expectedFault) {
            // ยืนยันข้อบกพร่องที่พบในซอร์ส (_anySetters ถูกอ้างถึงทั้งที่เป็น null)
        } catch (IllegalArgumentException alsoAcceptable) {
            // ในกรณีที่โค้ดถูกแก้ไขในอนาคตให้ถูกต้อง
        }
    }

    // =========================================================
    // 10. any-getter (single / multiple -> reportProblem)
    // =========================================================

    @Test
    public void testAnyGetterSingleDetected() {
        POJOPropertiesCollector c = newCollector(AnyGetterBean.class, true);
        assertNotNull(c.getAnyGetter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAnyGetterMultipleThrowsIllegalArgumentException() {
        POJOPropertiesCollector c = newCollector(DualAnyGetterBean.class, true);
        c.getAnyGetter();
    }

    // =========================================================
    // 11. @JsonValue (single / multiple -> reportProblem)
    // =========================================================

    @Test
    public void testJsonValueSingleDetected() {
        POJOPropertiesCollector c = newCollector(JsonValueBean.class, true);
        assertNotNull(c.getJsonValueMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testJsonValueMultipleThrowsIllegalArgumentException() {
        POJOPropertiesCollector c = newCollector(DualJsonValueBean.class, true);
        c.getJsonValueMethod();
    }

    // =========================================================
    // 12. any-setter method (2-arg) (single / multiple -> reportProblem)
    // =========================================================

    @Test
    public void testAnySetterMethodSingleDetected() {
        POJOPropertiesCollector c = newCollector(AnySetterMethodBean.class, false);
        assertNotNull(c.getAnySetterMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAnySetterMethodMultipleThrowsIllegalArgumentException() {
        POJOPropertiesCollector c = newCollector(DualAnySetterMethodBean.class, false);
        c.getAnySetterMethod();
    }

    // =========================================================
    // 13. Injectables (single / duplicate -> IllegalArgumentException)
    // =========================================================

    @Test
    public void testInjectableSingleCollected() {
        POJOPropertiesCollector c = newCollector(InjectableBean.class, false);
        Map<Object, AnnotatedMember> inj = c.getInjectables();
        assertNotNull(inj);
        assertTrue(inj.containsKey("foo"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInjectableDuplicateThrowsIllegalArgumentException() {
        POJOPropertiesCollector c = newCollector(DuplicateInjectableBean.class, false);
        c.getInjectables();
    }

    // =========================================================
    // 14. ObjectIdInfo branches
    // =========================================================

    @Test
    public void testObjectIdInfoPresent() {
        POJOPropertiesCollector c = newCollector(ObjectIdBean.class, true);
        assertNotNull(c.getObjectIdInfo());
    }

    @Test
    public void testObjectIdInfoAbsentReturnsNull() {
        POJOPropertiesCollector c = newCollector(PlainBean.class, true);
        assertNull(c.getObjectIdInfo());
    }

    @Test
    public void testObjectIdInfoNullWhenAnnotationIntrospectorNull() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(MapperFeature.USE_ANNOTATIONS);
        POJOPropertiesCollector c = newCollector(mapper, ObjectIdBean.class, true, null);
        assertNull(c.getObjectIdInfo());
    }

    // =========================================================
    // 15. findPOJOBuilderClass branches
    // =========================================================

    @Test
    public void testFindPOJOBuilderClassPresent() {
        POJOPropertiesCollector c = newCollector(BuilderTarget.class, false);
        assertEquals(WithBuilder.Builder.class, c.findPOJOBuilderClass());
    }

    @Test
    public void testFindPOJOBuilderClassAbsentReturnsNull() {
        POJOPropertiesCollector c = newCollector(PlainBean.class, false);
        assertNull(c.findPOJOBuilderClass());
    }

    @Test(expected = NullPointerException.class)
    public void testFindPOJOBuilderClassThrowsNpeWhenAnnotationIntrospectorNull() {
        // จากซอร์ส: findPOJOBuilderClass() เรียก
        // _annotationIntrospector.findPOJOBuilder(...) โดยไม่ตรวจ null ก่อน
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(MapperFeature.USE_ANNOTATIONS);
        POJOPropertiesCollector c = newCollector(mapper, PlainBean.class, true, null);
        c.findPOJOBuilderClass();
    }

    // =========================================================
    // 16. Creator properties (_addCreators / _addCreatorParam)
    // =========================================================

    @Test
    public void testCreatorPropertiesCollected() {
        POJOPropertiesCollector c = newCollector(CreatorBean.class, false);
        List<String> names = propertyNames(c);
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));
        assertNotNull(c._creatorProperties);
        assertEquals(2, c._creatorProperties.size());
    }

    @Test
    public void testAddCreatorsSkippedWhenAnnotationIntrospectorDisabled() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(MapperFeature.USE_ANNOTATIONS);
        POJOPropertiesCollector c = newCollector(mapper, CreatorBean.class, false, null);
        c.getPropertyMap();
        assertNull(c._creatorProperties);
    }

    // =========================================================
    // 17. Non-static inner class -> skip _addCreators branch ใน collectAll()
    // =========================================================

    @Test
    public void testNonStaticInnerClassSkipsCreatorCollection() {
        POJOPropertiesCollector c = newCollector(NonStaticInner.class, false);
        c.getPropertyMap();
        assertNull(c._creatorProperties);
        assertTrue(propertyNames(c).contains("value"));
    }

    // =========================================================
    // 18. Naming strategy rename branch
    // =========================================================

    @Test
    public void testNamingStrategyRenamesProperty() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new PropertyNamingStrategy.SnakeCaseStrategy());
        POJOPropertiesCollector c = newCollector(mapper, NamingBean.class, true, null);
        assertTrue(propertyNames(c).contains("some_value"));
    }

    // =========================================================
    // 19. Sort alphabetically branch vs default (no sort)
    // =========================================================

    @Test
    public void testSortPropertiesAlphabeticallyWhenEnabled() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
        POJOPropertiesCollector c = newCollector(mapper, AlphaBean.class, true, null);
        assertEquals(Arrays.asList("apple", "mango", "zebra"), propertyNames(c));
    }

    @Test
    public void testPropertiesKeepDeclarationOrderWhenNotSorted() {
        POJOPropertiesCollector c = newCollector(AlphaBean.class, true);
        assertEquals(Arrays.asList("zebra", "apple", "mango"), propertyNames(c));
    }

    // =========================================================
    // 20. getProperties() คืนค่า copy (ไม่กระทบ internal map)
    // =========================================================

    @Test
    public void testGetPropertiesReturnsIndependentCopy() {
        POJOPropertiesCollector c = newCollector(SimpleBean.class, true);
        List<BeanPropertyDefinition> list1 = c.getProperties();
        list1.clear();
        List<BeanPropertyDefinition> list2 = c.getProperties();
        assertFalse(list2.isEmpty()); // internal map ไม่ถูกกระทบ
    }

    // =========================================================
    // 21. _property() helper: branch สร้างใหม่ / ใช้ของเดิม
    // =========================================================

    @Test
    public void testPropertyHelperCreatesThenCachesByName() {
        POJOPropertiesCollector c = newCollector(SimpleBean.class, true);
        Map<String, POJOPropertyBuilder> map = new LinkedHashMap<String, POJOPropertyBuilder>();
        POJOPropertyBuilder p1 = c._property(map, "foo");
        assertEquals(1, map.size());
        POJOPropertyBuilder p2 = c._property(map, "foo");
        assertSame(p1, p2);
        assertEquals(1, map.size());
    }

    // =========================================================
    // 22. reportProblem() branch (ใช้ตรง ๆ)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testReportProblemThrowsIllegalArgumentException() {
        POJOPropertiesCollector c = newCollector(SimpleBean.class, true);
        c.reportProblem("boom");
    }

    // =========================================================
    // 23. getPropertyMap() lazy-collect branch (_collected flag)
    // =========================================================

    @Test
    public void testCollectedFlagSetAfterFirstAccess() {
        POJOPropertiesCollector c = newCollector(SimpleBean.class, true);
        assertFalse(c._collected);
        c.getPropertyMap();
        assertTrue(c._collected);
    }
}
