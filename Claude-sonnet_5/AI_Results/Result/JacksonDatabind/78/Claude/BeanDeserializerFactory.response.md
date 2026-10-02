# การวิเคราะห์

คลาส `BeanDeserializerFactory` เป็นส่วนหนึ่งของ jackson-databind ที่ทำงานร่วมกับคลาสภายใน (`DeserializationContext`, `BeanDescription`, `BeanDeserializerBuilder` ฯลฯ) ซึ่งเป็น abstract/complex class ที่สร้าง mock ได้ยากและเสี่ยงต่อการ "เดา behavior" ที่ไม่มีในซอร์ส
แนวทางที่ปลอดภัยและได้ branch coverage จริงคือ **ทดสอบผ่าน `ObjectMapper` (black-box/integration)** ซึ่งจะเรียกใช้เมธอดต่าง ๆ ภายใน `BeanDeserializerFactory` จริงตามเส้นทางปกติ ร่วมกับการเรียก **protected method บางตัวโดยตรง** (เช่น `isPotentialBeanType`, `withConfig`) โดยวาง test class ไว้ใน package เดียวกันกับ target class เพื่อให้เข้าถึง protected member ได้ถูกต้องตามกฎ Java (ไม่ใช่การเดา behavior)

หมายเหตุ: จุดที่ประเภท exception ที่แน่ชัดไม่ได้ระบุไว้ในซอร์สโค้ดที่ให้มา (เช่น null content, missing build method) จะใช้การตรวจว่า "มี exception เกิดขึ้น" แบบกว้าง พร้อมคอมเมนต์กำกับ เพื่อไม่ฟันธง behavior ที่ไม่มีอยู่ในซอร์ส

```java
package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory; // redundant (same package) but explicit per requirement
import com.fasterxml.jackson.databind.module.SimpleModule;

public class BeanDeserializerFactoryTest {

    private final ObjectMapper mapper = new ObjectMapper();

    // ==================== Fixture classes ====================

    public static class SimpleBean {
        public String name;
        public int age;
    }

    public static class SetterBean {
        private String value;
        public void setValue(String v) { this.value = v; }
        public String getValue() { return value; }
    }

    public static class CustomException extends Exception {
        public CustomException() { super(); }
        public CustomException(String msg) { super(msg); }
    }

    public static abstract class AbstractNoResolver {
        public String value;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class IgnoreUnknownBean {
        public String known;
    }

    public static class AnySetterBean {
        private Map<String, Object> extra = new HashMap<>();
        public String known;
        @JsonAnySetter
        public void setExtra(String name, Object value) { extra.put(name, value); }
        public Map<String, Object> getExtra() { return extra; }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public static class ObjectIdBeanValidProperty {
        public String id;
        public String value;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "missingProp")
    public static class ObjectIdBeanInvalidProperty {
        public String id;
        public String value;
    }

    public static class Parent {
        public String name;
        @JsonManagedReference
        public Child child;
    }
    public static class Child {
        public String name;
        @JsonBackReference
        public Parent parent;
    }

    public static class GetterAsSetterBean {
        private List<String> items = new ArrayList<>();
        public List<String> getItems() { return items; } // no setter
    }

    public static class GetterOnlyStringBean {
        private String value = "init";
        public String getValue() { return value; } // no setter, not Collection/Map
    }

    public static class CreatorBean {
        public final String name;
        public final int age;
        @JsonCreator
        public CreatorBean(@JsonProperty("name") String name, @JsonProperty("age") int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class InjectableBean {
        @JacksonInject("injectedValue")
        public String injected;
        public String name;
    }

    public static class ViewA {}
    public static class ViewBean {
        public String always;
        @JsonView(ViewA.class)
        public String onlyInA;
    }

    @JsonDeserialize(builder = BuilderBean.Builder.class)
    public static class BuilderBean {
        private final String name;
        private BuilderBean(String name) { this.name = name; }
        public String getName() { return name; }

        @JsonPOJOBuilder(withPrefix = "with")
        public static class Builder {
            private String name;
            public Builder withName(String name) { this.name = name; return this; }
            public BuilderBean build() { return new BuilderBean(name); }
        }
    }

    @JsonDeserialize(builder = BuilderBean2.Builder2.class)
    public static class BuilderBean2 {
        private final String name;
        private BuilderBean2(String name) { this.name = name; }
        public String getName() { return name; }

        @JsonPOJOBuilder(withPrefix = "with", buildMethodName = "create")
        public static class Builder2 {
            private String name;
            public Builder2 withName(String n) { this.name = n; return this; }
            public BuilderBean2 create() { return new BuilderBean2(name); }
        }
    }

    public static class CustomDeserBean {
        public String value;
    }
    public static class CustomDeserBeanDeserializer extends JsonDeserializer<CustomDeserBean> {
        @Override
        public CustomDeserBean deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            CustomDeserBean b = new CustomDeserBean();
            b.value = "CUSTOM";
            return b;
        }
    }

    public static class ModifierBean {
        public String name;
    }

    // ==================== withConfig() branches ====================

    @Test
    public void testWithConfig_sameConfig_returnsSameInstance() {
        DeserializerFactoryConfig cfg = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(cfg);
        DeserializerFactory result = factory.withConfig(cfg);
        assertSame(factory, result);
    }

    @Test
    public void testWithConfig_differentConfig_returnsNewInstance() {
        DeserializerFactoryConfig cfg1 = new DeserializerFactoryConfig();
        DeserializerFactoryConfig cfg2 = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(cfg1);
        DeserializerFactory result = factory.withConfig(cfg2);
        assertNotSame(factory, result);
        assertTrue(result instanceof BeanDeserializerFactory);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfig_subclass_throwsIllegalStateException() {
        DeserializerFactoryConfig cfg1 = new DeserializerFactoryConfig();
        DeserializerFactoryConfig cfg2 = new DeserializerFactoryConfig();
        BeanDeserializerFactory sub = new BeanDeserializerFactory(cfg1) { };
        sub.withConfig(cfg2);
    }

    @Test
    public void testSingletonInstance_notNull() {
        assertNotNull(BeanDeserializerFactory.instance);
    }

    // ==================== isPotentialBeanType() branches ====================

    @Test
    public void testIsPotentialBeanType_normalClass_returnsTrue() {
        assertTrue(BeanDeserializerFactory.instance.isPotentialBeanType(SimpleBean.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_primitive_throws() {
        BeanDeserializerFactory.instance.isPotentialBeanType(int.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_array_throws() {
        BeanDeserializerFactory.instance.isPotentialBeanType(int[].class);
    }

    // ==================== createBeanDeserializer() - custom override branch ====================

    @Test
    public void testDeserialize_customDeserializerOverride_used() throws IOException {
        SimpleModule module = new SimpleModule();
        module.addDeserializer(CustomDeserBean.class, new CustomDeserBeanDeserializer());
        ObjectMapper m2 = new ObjectMapper().registerModule(module);
        CustomDeserBean bean = m2.readValue("{\"value\":\"ignored\"}", CustomDeserBean.class);
        assertEquals("CUSTOM", bean.value);
    }

    // ==================== normal bean path ====================

    @Test
    public void testDeserialize_simpleBean_fieldMutator_ok() throws IOException {
        SimpleBean bean = mapper.readValue("{\"name\":\"John\",\"age\":30}", SimpleBean.class);
        assertEquals("John", bean.name);
        assertEquals(30, bean.age);
    }

    @Test
    public void testDeserialize_setterMethodMutator_ok() throws IOException {
        SetterBean bean = mapper.readValue("{\"value\":\"v1\"}", SetterBean.class);
        assertEquals("v1", bean.getValue());
    }

    @Test
    public void testDeserialize_emptyJsonObject_boundary() throws IOException {
        SimpleBean bean = mapper.readValue("{}", SimpleBean.class);
        assertNull(bean.name);
        assertEquals(0, bean.age);
    }

    // ==================== throwable path ====================

    @Test
    public void testDeserialize_throwableSubclass_ok() throws IOException {
        CustomException ex = mapper.readValue("{\"message\":\"boom\"}", CustomException.class);
        assertNotNull(ex);
        assertEquals("boom", ex.getMessage());
    }

    // ==================== abstract type without resolver ====================

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_abstractTypeWithoutResolver_throws() throws IOException {
        mapper.readValue("{\"value\":\"x\"}", AbstractNoResolver.class);
    }

    // ==================== ignore unknown / unknown properties ====================

    @Test
    public void testDeserialize_ignoreUnknownProperties_ok() throws IOException {
        IgnoreUnknownBean bean = mapper.readValue(
                "{\"known\":\"k\",\"unknown\":\"u\"}", IgnoreUnknownBean.class);
        assertEquals("k", bean.known);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_unknownProperty_notIgnored_throws() throws IOException {
        mapper.readValue("{\"name\":\"John\",\"extra\":\"x\"}", SimpleBean.class);
    }

    // ==================== any setter (method) ====================

    @Test
    public void testDeserialize_anySetterMethod_ok() throws IOException {
        AnySetterBean bean = mapper.readValue(
                "{\"known\":\"k\",\"extraKey\":\"v\"}", AnySetterBean.class);
        assertEquals("k", bean.known);
        assertEquals("v", bean.getExtra().get("extraKey"));
    }

    // ==================== ObjectIdInfo (PropertyGenerator) ====================

    @Test
    public void testDeserialize_objectIdInfo_validProperty_ok() throws IOException {
        ObjectIdBeanValidProperty bean = mapper.readValue(
                "{\"id\":\"1\",\"value\":\"v\"}", ObjectIdBeanValidProperty.class);
        assertEquals("1", bean.id);
        assertEquals("v", bean.value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeserialize_objectIdInfo_invalidPropertyName_throws() throws IOException {
        // ตรง branch: idProp == null -> throw IllegalArgumentException ใน addObjectIdReader
        mapper.readValue("{\"id\":\"1\",\"value\":\"v\"}", ObjectIdBeanInvalidProperty.class);
    }

    // ==================== back reference ====================

    @Test
    public void testDeserialize_backReference_ok() throws IOException {
        Parent parent = mapper.readValue(
                "{\"name\":\"p\",\"child\":{\"name\":\"c\"}}", Parent.class);
        assertEquals("p", parent.name);
        assertNotNull(parent.child);
        assertSame(parent, parent.child.parent);
    }

    // ==================== useGettersAsSetters branches ====================

    @Test
    public void testDeserialize_useGettersAsSetters_enabled_collectionType_ok() throws IOException {
        ObjectMapper m2 = new ObjectMapper();
        m2.enable(MapperFeature.USE_GETTERS_AS_SETTERS);
        GetterAsSetterBean bean = m2.readValue("{\"items\":[\"a\",\"b\"]}", GetterAsSetterBean.class);
        assertEquals(Arrays.asList("a", "b"), bean.getItems());
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_useGettersAsSetters_disabled_unknownPropertyThrows() throws IOException {
        ObjectMapper m2 = new ObjectMapper();
        m2.disable(MapperFeature.USE_GETTERS_AS_SETTERS);
        m2.readValue("{\"items\":[\"a\",\"b\"]}", GetterAsSetterBean.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_useGettersAsSetters_nonCollectionType_notSettable_throws() throws IOException {
        ObjectMapper m2 = new ObjectMapper();
        m2.enable(MapperFeature.USE_GETTERS_AS_SETTERS);
        m2.readValue("{\"value\":\"x\"}", GetterOnlyStringBean.class);
    }

    // ==================== creator properties ====================

    @Test
    public void testDeserialize_creatorProperties_ok() throws IOException {
        CreatorBean bean = mapper.readValue("{\"name\":\"John\",\"age\":30}", CreatorBean.class);
        assertEquals("John", bean.name);
        assertEquals(30, bean.age);
    }

    // ==================== injectables ====================

    @Test
    public void testDeserialize_injectableValue_ok() throws IOException {
        InjectableValues.Std injectables = new InjectableValues.Std()
                .addValue("injectedValue", "INJECTED");
        ObjectReader reader = mapper.readerFor(InjectableBean.class).with(injectables);
        InjectableBean bean = reader.readValue("{\"name\":\"n\"}");
        assertEquals("n", bean.name);
        assertEquals("INJECTED", bean.injected);
    }

    // ==================== DEFAULT_VIEW_INCLUSION (NO_VIEWS) ====================

    @Test
    public void testDeserialize_defaultViewInclusionDisabled_excludesNoViewProperty() throws IOException {
        ObjectMapper m2 = new ObjectMapper();
        m2.disable(MapperFeature.DEFAULT_VIEW_INCLUSION);
        ObjectReader reader = m2.readerWithView(ViewA.class).forType(ViewBean.class);
        ViewBean bean = reader.readValue("{\"always\":\"a\",\"onlyInA\":\"b\"}");
        assertNull(bean.always);
        assertEquals("b", bean.onlyInA);
    }

    // ==================== builder-based deserializer ====================

    @Test
    public void testDeserialize_builderBased_defaultBuildMethod_ok() throws IOException {
        BuilderBean bean = mapper.readValue("{\"name\":\"John\"}", BuilderBean.class);
        assertEquals("John", bean.getName());
    }

    @Test
    public void testDeserialize_builderBased_customBuildMethod_ok() throws IOException {
        BuilderBean2 bean = mapper.readValue("{\"name\":\"John\"}", BuilderBean2.class);
        assertEquals("John", bean.getName());
    }

    // ==================== deserializer modifier branches ====================

    @Test
    public void testDeserialize_withDeserializerModifier_appliesModification() throws IOException {
        SimpleModule module = new SimpleModule();
        module.setDeserializerModifier(new BeanDeserializerModifier() {
            @Override
            public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config,
                    BeanDescription beanDesc, final JsonDeserializer<?> deserializer) {
                if (beanDesc.getBeanClass() == ModifierBean.class) {
                    return new JsonDeserializer<ModifierBean>() {
                        @Override
                        public ModifierBean deserialize(JsonParser p, DeserializationContext ctxt)
                                throws IOException {
                            ModifierBean b = (ModifierBean) deserializer.deserialize(p, ctxt);
                            b.name = "MODIFIED:" + b.name;
                            return b;
                        }
                    };
                }
                return deserializer;
            }
        });
        ObjectMapper m2 = new ObjectMapper().registerModule(module);
        ModifierBean bean = m2.readValue("{\"name\":\"x\"}", ModifierBean.class);
        assertEquals("MODIFIED:x", bean.name);
    }

    // ==================== malformed / null input ====================

    @Test(expected = JsonParseException.class)
    public void testDeserialize_malformedJson_throwsParseException() throws IOException {
        mapper.readValue("{not valid json", SimpleBean.class);
    }

    @Test
    public void testDeserialize_nullContent_throwsSomeException() {
        // หมายเหตุ: ประเภท exception ที่แน่ชัดไม่ได้ระบุในซอร์สโค้ดของ BeanDeserializerFactory
        // (ขึ้นกับ jackson-core) จึงตรวจสอบแบบกว้างว่ามี exception เกิดขึ้นเท่านั้น
        try {
            mapper.readValue((String) null, SimpleBean.class);
            fail("Expected an exception for null content");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }
}
```

## สรุปตาราง Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testWithConfig_sameConfig_returnsSameInstance | `withConfig`: `_factoryConfig == config` → true |
| testWithConfig_differentConfig_returnsNewInstance | `withConfig`: config ไม่เท่ากัน, `getClass()==BeanDeserializerFactory.class` → true, สร้าง instance ใหม่ |
| testWithConfig_subclass_throwsIllegalStateException | `withConfig`: `getClass() != BeanDeserializerFactory.class` → throw |
| testSingletonInstance_notNull | ตรวจ static field `instance` |
| testIsPotentialBeanType_normalClass_returnsTrue | `isPotentialBeanType`: ทุก if ไม่เข้า → return true |
| testIsPotentialBeanType_primitive_throws | `isPotentialBeanType`: `canBeABeanType != null` (primitive) → throw |
| testIsPotentialBeanType_array_throws | `isPotentialBeanType`: `canBeABeanType != null` (array) → throw |
| testDeserialize_customDeserializerOverride_used | `createBeanDeserializer`: `custom != null` → return custom |
| testDeserialize_simpleBean_fieldMutator_ok | `addBeanProps`: `propDef.hasField()` branch, full normal flow |
| testDeserialize_setterMethodMutator_ok | `addBeanProps`: `propDef.hasSetter()` (AnnotatedMethod) branch |
| testDeserialize_emptyJsonObject_boundary | boundary: JSON object ว่าง |
| testDeserialize_throwableSubclass_ok | `createBeanDeserializer`: `type.isThrowable()` → `buildThrowableDeserializer`, `am != null` branch |
| testDeserialize_abstractTypeWithoutResolver_throws | `type.isAbstract()`, `materializeAbstractType` = null, `buildAbstract()` path |
| testDeserialize_ignoreUnknownProperties_ok | `addBeanProps`: `ignorals != null` branch |
| testDeserialize_unknownProperty_notIgnored_throws | `addBeanProps`: `ignorals == null` → `ignored = emptySet()` |
| testDeserialize_anySetterMethod_ok | `addBeanProps`: `anySetterMethod != null` branch |
| testDeserialize_objectIdInfo_validProperty_ok | `addObjectIdReader`: `implClass == PropertyGenerator.class`, `idProp != null` |
| testDeserialize_objectIdInfo_invalidPropertyName_throws | `addObjectIdReader`: `idProp == null` → throw |
| testDeserialize_backReference_ok | `addReferenceProperties`: `refs != null`, `m instanceof AnnotatedMethod` (getter) |
| testDeserialize_useGettersAsSetters_enabled_collectionType_ok | `useGettersAsSetters==true && hasGetter`, `Collection.isAssignableFrom` → true |
| testDeserialize_useGettersAsSetters_disabled_unknownPropertyThrows | `useGettersAsSetters==false` → prop=null |
| testDeserialize_useGettersAsSetters_nonCollectionType_notSettable_throws | `Collection/Map` check → false |
| testDeserialize_creatorProperties_ok | `hasCreatorProps && propDef.hasConstructorParameter()`, `cprop` match loop |
| testDeserialize_injectableValue_ok | `addInjectables`: `raw != null` loop |
| testDeserialize_defaultViewInclusionDisabled_excludesNoViewProperty | `views == null && !DEFAULT_VIEW_INCLUSION` → `views = NO_VIEWS` |
| testDeserialize_builderBased_defaultBuildMethod_ok | `buildBuilderBasedDeserializer`: `builderConfig == null ? "build"` (default) |
| testDeserialize_builderBased_customBuildMethod_ok | `builderConfig != null` → ใช้ `buildMethodName` กำหนดเอง |
| testDeserialize_withDeserializerModifier_appliesModification | `_factoryConfig.hasDeserializerModifiers()` → true (หลายจุด) |
| testDeserialize_malformedJson_throwsParseException | อินพุตผิดรูปแบบ (malformed JSON) |
| testDeserialize_nullContent_throwsSomeException | ค่า null (boundary, exception type ไม่ระบุแน่ชัดในซอร์ส) |

**หมายเหตุสำคัญ:** เนื่องจาก `BeanDeserializerFactory` พึ่งพา internal classes ของ jackson-databind ที่ไม่ได้รวมอยู่ในซอร์สที่ให้มา การทดสอบจึงใช้แนวทาง integration ผ่าน `ObjectMapper` เพื่อกระตุ้น branch ต่าง ๆ ตาม logic จริงในซอร์ส โดยไม่เดา behavior ของคลาสภายนอกที่ไม่มีอยู่ในซอร์สที่ให้มา