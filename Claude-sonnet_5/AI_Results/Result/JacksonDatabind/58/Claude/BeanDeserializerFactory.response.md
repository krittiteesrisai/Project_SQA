# วิเคราะห์และแผนการทดสอบ

`BeanDeserializerFactory` เป็นคลาสที่ทำงานร่วมกับ Jackson internals อย่างลึก (JavaType, BeanDescription, DeserializationContext ฯลฯ) การ mock ทุกอย่างจะยากและเสี่ยงต่อการ "เดา behavior" จึงเลือกใช้แนวทาง:

1. เรียก **protected method** (`isPotentialBeanType`, `isIgnorableType`, `withConfig`) โดยตรง — วาง test class ไว้ใน **package เดียวกัน** (`com.fasterxml.jackson.databind.deser`) เพื่อให้เข้าถึง protected member ได้โดยไม่ต้องใช้ reflection
2. ใช้ `ObjectMapper` จริง (integration-style unit test) เพื่อ drive branch ต่าง ๆ ใน `createBeanDeserializer`, `buildBeanDeserializer`, `addBeanProps`, `filterBeanProps`, `addObjectIdReader`, `addReferenceProperties`, `addInjectables`, `buildBuilderBasedDeserializer`, `buildThrowableDeserializer` — เพราะ path เหล่านี้พึ่งพา JavaType/BeanDescription จริงจาก introspection มาก เกินกว่าจะ mock ได้อย่างปลอดภัย

```java
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.*;

/**
 * Unit test สำหรับ BeanDeserializerFactory (Defects4J JacksonDatabind-58b)
 *
 * หมายเหตุการออกแบบ:
 * - วาง test class ไว้ package เดียวกับ target class เพื่อเรียก protected method ได้ตรง ๆ
 *   (isPotentialBeanType, isIgnorableType) โดยไม่ต้องใช้ reflection
 * - หลาย method (buildBeanDeserializer, addBeanProps, addObjectIdReader ฯลฯ) ถูก drive
 *   ผ่าน ObjectMapper.readValue(...) จริง เนื่องจาก parameter เป็น JavaType/BeanDescription
 *   ที่สร้างโดย introspection ภายใน ไม่สามารถ mock ได้อย่างปลอดภัยโดยไม่เดา behavior
 */
public class BeanDeserializerFactoryTest {

    // ---------------------------------------------------------------
    // Helper bean / annotation fixtures
    // ---------------------------------------------------------------

    public static class NormalBean { public String value; }

    public class NonStaticInnerBean { public String value; }

    public interface MarkerInterface {}

    enum SimpleEnum { A, B }

    static class SimpleBean {
        public String name;
        private int age;
        public void setAge(int age) { this.age = age; }
        public int getAge() { return age; }
    }

    static class MyException extends Exception {
        private String code;
        public MyException() {}
        public String getCode() { return code; }
        public void setCode(String code) { this.code = code; }
    }

    static abstract class AbstractBean { public String name; }
    static class ConcreteBean extends AbstractBean {}

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class IgnoreUnknownBean { public String name; }

    @JsonIgnoreProperties({"secret"})
    static class IgnoredFieldBean {
        public String name;
        public String secret;
    }

    static class AnySetterBean {
        public String name;
        private Map<String, Object> extra = new HashMap<String, Object>();
        @JsonAnySetter
        public void setExtra(String key, Object value) { extra.put(key, value); }
        public Map<String, Object> getExtra() { return extra; }
    }

    static class CollectionGetterBean {
        private List<String> items = new ArrayList<String>();
        public List<String> getItems() { return items; } // no setter, no field
    }

    static class CreatorBean {
        public final String name;
        public final int age;
        @JsonCreator
        public CreatorBean(@JsonProperty("name") String name, @JsonProperty("age") int age) {
            this.name = name; this.age = age;
        }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    static class NodeBean {
        public String name;
        public NodeBean next;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    static class PropNodeBean {
        public int id;
        public String name;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "missingProp")
    static class BadPropNodeBean {
        public int id;
    }

    static class ParentBean {
        public String name;
        @JsonManagedReference
        public List<ChildBean> children;
    }
    static class ChildBean {
        public String name;
        @JsonBackReference
        public ParentBean parent;
    }

    static class InjectBean {
        @JacksonInject("svc")
        public String service;
        public String name;
    }

    static class BuilderBean {
        private final String name;
        private BuilderBean(String name) { this.name = name; }
        public String getName() { return name; }
    }
    @JsonDeserialize(builder = DefaultBuilder.class)
    static class BuilderBeanWrapper {} // not used directly; kept for clarity
    static class DefaultBuilder {
        private String name;
        public DefaultBuilder withName(String name) { this.name = name; return this; }
        public BuilderBean build() { return new BuilderBean(name); }
    }

    @JsonPOJOBuilder(buildMethodName = "create")
    static class CustomBuildMethodBuilder {
        private String name;
        public CustomBuildMethodBuilder withName(String name) { this.name = name; return this; }
        public BuilderBean create() { return new BuilderBean(name); }
    }

    @JsonIgnoreType
    static class IgnorableType {}

    // ---------------------------------------------------------------
    // instance field
    // ---------------------------------------------------------------

    @Test
    public void testInstanceIsNotNullAndCorrectType() {
        assertNotNull(BeanDeserializerFactory.instance);
        assertTrue(BeanDeserializerFactory.instance instanceof BeanDeserializerFactory);
    }

    // ---------------------------------------------------------------
    // withConfig
    // ---------------------------------------------------------------

    @Test
    public void testWithConfig_sameConfigReturnsSameInstance() {
        DeserializerFactoryConfig cfg = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(cfg);
        assertSame(factory, factory.withConfig(cfg));
    }

    @Test
    public void testWithConfig_differentConfigReturnsNewInstance() {
        DeserializerFactoryConfig cfg1 = new DeserializerFactoryConfig();
        DeserializerFactoryConfig cfg2 = new DeserializerFactoryConfig(); // different reference
        BeanDeserializerFactory factory = new BeanDeserializerFactory(cfg1);
        DeserializerFactory result = factory.withConfig(cfg2);
        assertNotSame(factory, result);
        assertEquals(BeanDeserializerFactory.class, result.getClass());
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfig_subclassThrowsIllegalStateException() {
        DeserializerFactoryConfig cfg1 = new DeserializerFactoryConfig();
        DeserializerFactoryConfig cfg2 = new DeserializerFactoryConfig();
        BeanDeserializerFactory sub = new BeanDeserializerFactory(cfg1) { };
        sub.withConfig(cfg2); // getClass() != BeanDeserializerFactory.class -> throws
    }

    // ---------------------------------------------------------------
    // isPotentialBeanType
    // ---------------------------------------------------------------

    @Test
    public void testIsPotentialBeanType_normalStaticNestedClass_returnsTrue() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        assertTrue(factory.isPotentialBeanType(NormalBean.class));
    }

    @Test
    public void testIsPotentialBeanType_nonStaticInnerClass_returnsTrue() {
        // ตาม comment ใน source: non-static inner class อนุญาต (JACKSON-594)
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        assertTrue(factory.isPotentialBeanType(NonStaticInnerBean.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_localClassInMethod_throws() {
        // ตาม comment: local class ที่ประกาศใน method -> ไม่อนุญาต
        class LocalBean { public String v; }
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        factory.isPotentialBeanType(LocalBean.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_primitiveType_throws() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        factory.isPotentialBeanType(int.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_arrayType_throws() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        factory.isPotentialBeanType(NormalBean[].class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_enumType_throws() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        factory.isPotentialBeanType(SimpleEnum.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_proxyType_throws() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        Object proxy = Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[] { MarkerInterface.class },
                new java.lang.reflect.InvocationHandler() {
                    public Object invoke(Object p, java.lang.reflect.Method m, Object[] a) { return null; }
                });
        factory.isPotentialBeanType(proxy.getClass());
    }

    // ---------------------------------------------------------------
    // isIgnorableType
    // ---------------------------------------------------------------

    @Test
    public void testIsIgnorableType_cachedValueReturnedDirectly() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        BeanDescription beanDesc = config.introspect(mapper.constructType(NormalBean.class));
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;

        Map<Class<?>, Boolean> cache = new HashMap<Class<?>, Boolean>();
        // seed cache กับค่าที่ "ผิด" โดยตั้งใจ (String.class ไม่ควรเป็น ignorable จริง)
        cache.put(String.class, Boolean.TRUE);

        boolean result = factory.isIgnorableType(config, beanDesc, String.class, cache);
        assertTrue("ควรคืนค่าจาก cache โดยตรง ไม่ไปคำนวณใหม่", result);
    }

    @Test
    public void testIsIgnorableType_notAnnotated_returnsFalse() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        BeanDescription beanDesc = config.introspect(mapper.constructType(NormalBean.class));
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;

        Map<Class<?>, Boolean> cache = new HashMap<Class<?>, Boolean>();
        boolean result = factory.isIgnorableType(config, beanDesc, String.class, cache);
        assertFalse(result);
    }

    @Test
    public void testIsIgnorableType_annotatedJsonIgnoreType_returnsTrue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        BeanDescription beanDesc = config.introspect(mapper.constructType(NormalBean.class));
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;

        Map<Class<?>, Boolean> cache = new HashMap<Class<?>, Boolean>();
        boolean result = factory.isIgnorableType(config, beanDesc, IgnorableType.class, cache);
        assertTrue(result);
    }

    // ---------------------------------------------------------------
    // createBeanDeserializer / buildBeanDeserializer (via ObjectMapper)
    // ---------------------------------------------------------------

    @Test
    public void testCreateBeanDeserializer_simpleBean_setterAndField() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean bean = mapper.readValue("{\"name\":\"Alice\",\"age\":30}", SimpleBean.class);
        assertEquals("Alice", bean.name);
        assertEquals(30, bean.getAge());
    }

    @Test
    public void testCreateBeanDeserializer_customDeserializerOverride() throws Exception {
        SimpleModule module = new SimpleModule();
        module.addDeserializer(SimpleBean.class, new JsonDeserializer<SimpleBean>() {
            @Override
            public SimpleBean deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                SimpleBean b = new SimpleBean();
                b.name = "custom";
                return b;
            }
        });
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(module);
        SimpleBean bean = mapper.readValue("{\"name\":\"ignored\",\"age\":5}", SimpleBean.class);
        assertEquals("custom", bean.name);
    }

    @Test
    public void testCreateBeanDeserializer_throwableSubclass() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        MyException ex = mapper.readValue("{\"message\":\"oops\",\"code\":\"E1\"}", MyException.class);
        assertEquals("E1", ex.getCode());
        // "message" ถูกใส่ใน addIgnorable("message") เพราะไม่มี setMessage(); ไม่มี creator รับ message
        assertNull(ex.getMessage());
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateBeanDeserializer_abstractWithoutResolver_throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("{\"name\":\"abc\"}", AbstractBean.class);
    }

    @Test
    public void testCreateBeanDeserializer_abstractWithResolver_materialized() throws Exception {
        SimpleModule module = new SimpleModule();
        module.addAbstractTypeMapping(AbstractBean.class, ConcreteBean.class);
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(module);
        AbstractBean bean = mapper.readValue("{\"name\":\"abs\"}", AbstractBean.class);
        assertTrue(bean instanceof ConcreteBean);
        assertEquals("abs", bean.name);
    }

    // ---------------------------------------------------------------
    // addBeanProps / filterBeanProps
    // ---------------------------------------------------------------

    @Test
    public void testAddBeanProps_classAnnotationIgnoreUnknownTrue() throws Exception {
        ObjectMapper mapper = new ObjectMapper(); // default FAIL_ON_UNKNOWN_PROPERTIES = true
        IgnoreUnknownBean bean = mapper.readValue(
                "{\"name\":\"Bob\",\"extra\":\"ignored\"}", IgnoreUnknownBean.class);
        assertEquals("Bob", bean.name);
    }

    @Test
    public void testFilterBeanProps_explicitIgnoredProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        IgnoredFieldBean bean = mapper.readValue(
                "{\"name\":\"Carl\",\"secret\":\"shh\"}", IgnoredFieldBean.class);
        assertEquals("Carl", bean.name);
        assertNull(bean.secret); // ignored -> ไม่ถูก set
    }

    @Test
    public void testAddBeanProps_anySetter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnySetterBean bean = mapper.readValue("{\"name\":\"Dan\",\"foo\":\"bar\"}", AnySetterBean.class);
        assertEquals("Dan", bean.name);
        assertEquals("bar", bean.getExtra().get("foo"));
    }

    @Test
    public void testAddBeanProps_getterAsSetterForCollection() throws Exception {
        // MapperFeature.USE_GETTERS_AS_SETTERS / AUTO_DETECT_GETTERS = true โดย default
        ObjectMapper mapper = new ObjectMapper();
        CollectionGetterBean bean = mapper.readValue("{\"items\":[\"a\",\"b\"]}", CollectionGetterBean.class);
        assertEquals(Arrays.asList("a", "b"), bean.getItems());
    }

    @Test
    public void testAddBeanProps_constructorCreatorProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        CreatorBean bean = mapper.readValue("{\"name\":\"Eve\",\"age\":25}", CreatorBean.class);
        assertEquals("Eve", bean.name);
        assertEquals(25, bean.age);
    }

    // ---------------------------------------------------------------
    // addObjectIdReader
    // ---------------------------------------------------------------

    @Test
    public void testAddObjectIdReader_intSequenceGenerator() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"@id\":1,\"name\":\"root\",\"next\":{\"@id\":2,\"name\":\"child\",\"next\":null}}";
        NodeBean bean = mapper.readValue(json, NodeBean.class);
        assertEquals("root", bean.name);
        assertEquals("child", bean.next.name);
    }

    @Test
    public void testAddObjectIdReader_propertyGenerator() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        PropNodeBean bean = mapper.readValue("{\"id\":5,\"name\":\"X\"}", PropNodeBean.class);
        assertEquals(5, bean.id);
        assertEquals("X", bean.name);
    }

    @Test
    public void testAddObjectIdReader_propertyGeneratorMissingProperty_throws() {
        ObjectMapper mapper = new ObjectMapper();
        boolean found = false;
        try {
            mapper.readValue("{\"id\":1}", BadPropNodeBean.class);
            fail("ควร throw exception เพราะ property 'missingProp' ไม่มีอยู่จริง");
        } catch (Exception e) {
            Throwable t = e;
            while (t != null) {
                if (t.getMessage() != null && t.getMessage().contains("Invalid Object Id definition")) {
                    found = true;
                    break;
                }
                t = t.getCause();
            }
        }
        assertTrue("คาดหวังข้อความ 'Invalid Object Id definition' ใน exception chain", found);
    }

    // ---------------------------------------------------------------
    // addReferenceProperties
    // ---------------------------------------------------------------

    @Test
    public void testAddReferenceProperties_managedAndBackReference() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\":\"P\",\"children\":[{\"name\":\"C1\"},{\"name\":\"C2\"}]}";
        ParentBean p = mapper.readValue(json, ParentBean.class);
        assertEquals(2, p.children.size());
        assertSame(p, p.children.get(0).parent);
        assertSame(p, p.children.get(1).parent);
    }

    // ---------------------------------------------------------------
    // addInjectables
    // ---------------------------------------------------------------

    @Test
    public void testAddInjectables_jacksonInject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        InjectableValues.Std inj = new InjectableValues.Std().addValue("svc", "InjectedService");
        InjectBean bean = mapper.reader(inj).forType(InjectBean.class)
                .readValue("{\"name\":\"Z\"}");
        assertEquals("InjectedService", bean.service);
        assertEquals("Z", bean.name);
    }

    // ---------------------------------------------------------------
    // buildBuilderBasedDeserializer / createBuilderBasedDeserializer
    // ---------------------------------------------------------------

    @Test
    public void testBuildBuilderBasedDeserializer_defaultBuildMethod() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(BuilderBean.class, MixInWithDefaultBuilder.class);
        BuilderBean bean = mapper.readValue("{\"name\":\"Builder1\"}", BuilderBean.class);
        assertEquals("Builder1", bean.getName());
    }
    @JsonDeserialize(builder = DefaultBuilder.class)
    static class MixInWithDefaultBuilder {}

    @Test
    public void testBuildBuilderBasedDeserializer_customBuildMethodName() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(BuilderBean.class, MixInWithCustomBuilder.class);
        BuilderBean bean = mapper.readValue("{\"name\":\"Builder2\"}", BuilderBean.class);
        assertEquals("Builder2", bean.getName());
    }
    @JsonDeserialize(builder = CustomBuildMethodBuilder.class)
    static class MixInWithCustomBuilder {}

    // ---------------------------------------------------------------
    // Deserializer modifiers (buildBeanDeserializer)
    // ---------------------------------------------------------------

    @Test
    public void testBuildBeanDeserializer_withDeserializerModifier() throws Exception {
        final boolean[] updateBuilderCalled = { false };
        final boolean[] modifyDeserializerCalled = { false };

        SimpleModule module = new SimpleModule();
        module.setDeserializerModifier(new BeanDeserializerModifier() {
            @Override
            public BeanDeserializerBuilder updateBuilder(DeserializationConfig config,
                    BeanDescription beanDesc, BeanDeserializerBuilder builder) {
                updateBuilderCalled[0] = true;
                return builder;
            }
            @Override
            public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config,
                    BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                modifyDeserializerCalled[0] = true;
                return deserializer;
            }
        });
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(module);
        SimpleBean bean = mapper.readValue("{\"name\":\"Mod\",\"age\":1}", SimpleBean.class);
        assertEquals("Mod", bean.name);
        assertTrue(updateBuilderCalled[0]);
        assertTrue(modifyDeserializerCalled[0]);
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testInstanceIsNotNullAndCorrectType | sanity check field `instance` |
| testWithConfig_sameConfigReturnsSameInstance | `_factoryConfig == config` → true |
| testWithConfig_differentConfigReturnsNewInstance | `_factoryConfig == config` → false, `getClass()==BeanDeserializerFactory.class` → true |
| testWithConfig_subclassThrowsIllegalStateException | `getClass() != BeanDeserializerFactory.class` → throw |
| testIsPotentialBeanType_normalStaticNestedClass_returnsTrue | ทุกเงื่อนไขใน `isPotentialBeanType` เป็น false → return true |
| testIsPotentialBeanType_nonStaticInnerClass_returnsTrue | non-local inner class ok (JACKSON-594) |
| testIsPotentialBeanType_localClassInMethod_throws | `isLocalType(type,true)` != null → throw |
| testIsPotentialBeanType_primitiveType_throws | `canBeABeanType` (primitive) → throw |
| testIsPotentialBeanType_arrayType_throws | `canBeABeanType` (array) → throw |
| testIsPotentialBeanType_enumType_throws | `canBeABeanType` (enum) → throw |
| testIsPotentialBeanType_proxyType_throws | `isProxyType` → throw |
| testIsIgnorableType_cachedValueReturnedDirectly | `status != null` → return cached |
| testIsIgnorableType_notAnnotated_returnsFalse | `status == null` (no cache), introspector null → default false |
| testIsIgnorableType_annotatedJsonIgnoreType_returnsTrue | introspector คืนค่า true |
| testCreateBeanDeserializer_simpleBean_setterAndField | main bean path, `hasSetter`/`hasField` |
| testCreateBeanDeserializer_customDeserializerOverride | `custom != null` → return custom |
| testCreateBeanDeserializer_throwableSubclass | `type.isThrowable()` → buildThrowableDeserializer, `am != null` |
| testCreateBeanDeserializer_abstractWithoutResolver_throws | `type.isAbstract()` true, `materializeAbstractType` = null |
| testCreateBeanDeserializer_abstractWithResolver_materialized | `concreteType != null` → re-introspect + build |
| testAddBeanProps_classAnnotationIgnoreUnknownTrue | `B != null` → `setIgnoreUnknownProperties` |
| testFilterBeanProps_explicitIgnoredProperty | `ignored.contains(name)` → continue/addIgnorable |
| testAddBeanProps_anySetter | `anySetter != null` |
| testAddBeanProps_getterAsSetterForCollection | `useGettersAsSetters && hasGetter` + Collection check |
| testAddBeanProps_constructorCreatorProperty | `propDef.hasConstructorParameter()`, `cprop != null` |
| testAddObjectIdReader_intSequenceGenerator | `implClass != PropertyGenerator` branch |
| testAddObjectIdReader_propertyGenerator | `implClass == PropertyGenerator`, `idProp != null` |
| testAddObjectIdReader_propertyGeneratorMissingProperty_throws | `idProp == null` → throw IllegalArgumentException |
| testAddReferenceProperties_managedAndBackReference | `refs != null`, `m instanceof AnnotatedMethod` false path |
| testAddInjectables_jacksonInject | `raw != null` loop, `fixAccess` |
| testBuildBuilderBasedDeserializer_defaultBuildMethod | `builderConfig == null` → default "build" |
| testBuildBuilderBasedDeserializer_customBuildMethodName | `builderConfig != null`, custom method name, `buildMethod != null` |
| testBuildBeanDeserializer_withDeserializerModifier | `hasDeserializerModifiers()` true (updateBuilder + modifyDeserializer loops) |

**หมายเหตุ/ข้อจำกัดที่ระบุไว้ (ไม่เดา behavior):**
- กรณี `cprop == null` (ไม่พบ creator property ที่ตรงชื่อ) ไม่สามารถ trigger ได้ผ่าน public API ตามปกติ จึงไม่ได้เขียนเทสสำหรับสาขานี้
- กรณี `am == null` (ไม่พบ `initCause`) ไม่เกิดขึ้นจริงเพราะทุก subclass ของ `Throwable` มี method นี้ติดมาด้วย จึงไม่สามารถทดสอบ branch นี้ได้โดยไม่เขียนโค้ดปลอมที่ไม่มีอยู่ในสเปค