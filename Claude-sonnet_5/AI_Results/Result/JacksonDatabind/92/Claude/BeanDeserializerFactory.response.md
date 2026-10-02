# วิเคราะห์และแนวทางการทดสอบ

`BeanDeserializerFactory` เป็นคลาสที่ทำงานผ่าน Jackson internals จำนวนมาก (DeserializationContext, BeanDescription ฯลฯ) การทดสอบหน่วยที่ทดสอบ behavior จริงและปลอดภัยที่สุดคือ:

1. **ทดสอบผ่าน public API** (`ObjectMapper.readValue`) เพื่อ trigger branch ต่าง ๆ ใน `createBeanDeserializer`, `buildBeanDeserializer`, `buildThrowableDeserializer`, `addBeanProps`, `addObjectIdReader`, `addReferenceProperties`, `addInjectables`, `filterBeanProps`
2. **ทดสอบ protected method โดยตรง** (`isPotentialBeanType`, `checkIllegalTypes`, `withConfig`) โดยวาง test class ไว้ใน package เดียวกัน (`com.fasterxml.jackson.databind.deser`) เพื่อให้เข้าถึง protected members ได้ (รวมถึง field `_factoryConfig` ที่สืบทอดจาก `BasicDeserializerFactory`)
3. จุดที่ **ไม่สามารถทดสอบได้อย่างปลอดภัย** (เช่น branch throw ของ `checkIllegalTypes` ที่ต้องมี class จริงชื่อ `org.apache.commons.collections...` อยู่บน classpath, หรือ branch ที่ใช้ std deserializer ภายนอกที่ resolve ก่อนเข้า `createBeanDeserializer`) จะใส่คอมเมนต์กำกับไว้ว่าข้ามเนื่องจากไม่สามารถยืนยัน behavior ได้โดยไม่เดา

```java
package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Unit tests for {@link BeanDeserializerFactory}.
 * Placed in same package as target class to access protected members.
 */
public class BeanDeserializerFactoryTest {

    private ObjectMapper mapper;
    private BeanDeserializerFactory factory;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        factory = BeanDeserializerFactory.instance;
    }

    /* ===================================================================
     * Helper fixtures
     * =================================================================== */

    public static class SimpleBean {
        private String name;
        private int age;
        public String getName() { return name; }
        public void setName(String n) { this.name = n; }
        public int getAge() { return age; }
        public void setAge(int a) { this.age = a; }
    }

    @JsonIgnoreProperties({"secret"})
    public static class IgnoreBean {
        public String name;
        public String secret;
    }

    public static class AnySetterBean {
        private Map<String, Object> extra = new HashMap<String, Object>();
        public String name;
        @JsonAnySetter
        public void setExtra(String key, Object value) { extra.put(key, value); }
        public Map<String, Object> getExtra() { return extra; }
    }

    public static class CreatorBean {
        private final String id;
        private String name;
        @JsonCreator
        public CreatorBean(@JsonProperty("id") String id) { this.id = id; }
        public String getId() { return id; }
        public void setName(String n) { this.name = n; }
        public String getName() { return name; }
    }

    public static class GetterAsSetterBean {
        private List<String> items = new ArrayList<String>();
        public List<String> getItems() { return items; } // no setter, no field
    }

    @JsonIgnoreType
    public static class IgnorableType {
        public String junk;
    }

    public static class BeanWithIgnorableTypeProp {
        public String name;
        public IgnorableType details;
    }

    public static class Parent {
        public String name;
        @JsonManagedReference
        public List<Child> children = new ArrayList<Child>();
    }

    public static class Child {
        public String name;
        @JsonBackReference
        public Parent parent;
    }

    public static class InjectBean {
        @JacksonInject("inj")
        public String injected;
        public String name;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    public static class ObjIdBean {
        public String name;
        public ObjIdBean ref;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public static class ObjIdPropBean {
        public int id;
        public String name;
        public ObjIdPropBean ref;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "doesNotExist")
    public static class BadObjIdBean {
        public int id;
    }

    public static class CustomException extends Exception {
        private static final long serialVersionUID = 1L;
        public CustomException() { super(); }
        public CustomException(String msg) { super(msg); }
    }

    public interface MyInterface {
        String getX();
    }

    public interface AbstractThing {
        String getName();
    }

    public static class ConcreteThing implements AbstractThing {
        private String name;
        public String getName() { return name; }
        public void setName(String n) { this.name = n; }
    }

    public static class StaticBean {
        public String getX() { return "x"; }
    }

    public enum SampleEnum { A, B }

    @JsonDeserialize(builder = BuilderBean.Builder.class)
    public static class BuilderBean {
        private final String name;
        private BuilderBean(String name) { this.name = name; }
        public String getName() { return name; }

        @JsonPOJOBuilder(withPrefix = "with")
        public static class Builder {
            private String name;
            public Builder withName(String n) { this.name = n; return this; }
            public BuilderBean build() { return new BuilderBean(name); }
        }
    }

    private static boolean containsMessage(Throwable t, String substr) {
        while (t != null) {
            if (t.getMessage() != null && t.getMessage().contains(substr)) {
                return true;
            }
            t = t.getCause();
        }
        return false;
    }

    /* ===================================================================
     * 1) Life-cycle: withConfig()
     * =================================================================== */

    @Test
    public void testInstanceNotNull() {
        assertNotNull(BeanDeserializerFactory.instance);
    }

    @Test
    public void testWithConfig_sameConfig_returnsSameInstance() {
        DeserializerFactoryConfig cfg = factory._factoryConfig; // protected field, same package access
        DeserializerFactory result = factory.withConfig(cfg);
        assertSame(factory, result);
    }

    @Test
    public void testWithConfig_differentConfig_returnsNewInstanceSameClass() {
        DeserializerFactoryConfig newCfg = new DeserializerFactoryConfig();
        DeserializerFactory result = factory.withConfig(newCfg);
        assertNotSame(factory, result);
        assertEquals(BeanDeserializerFactory.class, result.getClass());
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfig_subclassDifferentConfig_throws() {
        BeanDeserializerFactory sub = new BeanDeserializerFactory(new DeserializerFactoryConfig()) {
            private static final long serialVersionUID = 1L;
        };
        sub.withConfig(new DeserializerFactoryConfig());
    }

    @Test
    public void testWithConfig_subclassSameConfig_returnsThisNoException() {
        // Early-return branch checked BEFORE subclass check -> must not throw
        DeserializerFactoryConfig cfg = new DeserializerFactoryConfig();
        BeanDeserializerFactory sub = new BeanDeserializerFactory(cfg) {
            private static final long serialVersionUID = 1L;
        };
        DeserializerFactory result = sub.withConfig(cfg);
        assertSame(sub, result);
    }

    /* ===================================================================
     * 2) createBeanDeserializer - standard bean paths (via ObjectMapper)
     * =================================================================== */

    @Test
    public void testSimpleBeanDeserialization() throws IOException {
        SimpleBean bean = mapper.readValue("{\"name\":\"joe\",\"age\":30}", SimpleBean.class);
        assertEquals("joe", bean.getName());
        assertEquals(30, bean.getAge());
    }

    @Test
    public void testIgnoredPropertyViaAnnotation() throws IOException {
        IgnoreBean bean = mapper.readValue("{\"name\":\"a\",\"secret\":\"s\"}", IgnoreBean.class);
        assertEquals("a", bean.name);
        assertNull(bean.secret);
    }

    @Test
    public void testAnySetterBranch() throws IOException {
        AnySetterBean bean = mapper.readValue(
                "{\"name\":\"a\",\"unknownField\":123}", AnySetterBean.class);
        assertEquals("a", bean.name);
        assertEquals(123, bean.getExtra().get("unknownField"));
    }

    @Test
    public void testConstructorCreatorPropertyBranch() throws IOException {
        CreatorBean bean = mapper.readValue("{\"id\":\"abc\",\"name\":\"joe\"}", CreatorBean.class);
        assertEquals("abc", bean.getId());
        assertEquals("joe", bean.getName());
    }

    @Test
    public void testUseGettersAsSetters_enabled() throws IOException {
        ObjectMapper m = new ObjectMapper();
        m.enable(MapperFeature.USE_GETTERS_AS_SETTERS);
        GetterAsSetterBean bean = m.readValue(
                "{\"items\":[\"a\",\"b\"]}", GetterAsSetterBean.class);
        assertEquals(Arrays.asList("a", "b"), bean.getItems());
    }

    @Test
    public void testUseGettersAsSetters_disabled_unknownPropertyFails() {
        ObjectMapper m = new ObjectMapper();
        m.disable(MapperFeature.USE_GETTERS_AS_SETTERS);
        try {
            m.readValue("{\"items\":[\"a\",\"b\"]}", GetterAsSetterBean.class);
            fail("Expected failure because property has no usable mutator");
        } catch (Exception e) {
            // expected - property not recognized/settable
        }
    }

    @Test
    public void testIgnorableTypeProperty() throws IOException {
        BeanWithIgnorableTypeProp bean = mapper.readValue(
                "{\"name\":\"n\",\"details\":{\"junk\":\"x\"}}", BeanWithIgnorableTypeProp.class);
        assertEquals("n", bean.name);
        assertNull(bean.details);
    }

    @Test
    public void testManagedAndBackReference() throws IOException {
        String json = "{\"name\":\"p\",\"children\":[{\"name\":\"c1\"}]}";
        Parent p = mapper.readValue(json, Parent.class);
        assertEquals(1, p.children.size());
        assertSame(p, p.children.get(0).parent);
    }

    @Test
    public void testInjectables() throws IOException {
        InjectableValues.Std inj = new InjectableValues.Std();
        inj.addValue("inj", "injectedValue");
        InjectBean bean = mapper.readerFor(InjectBean.class).with(inj)
                .readValue("{\"name\":\"n\"}");
        assertEquals("injectedValue", bean.injected);
        assertEquals("n", bean.name);
    }

    @Test
    public void testCustomDeserializerOverride() throws IOException {
        SimpleModule module = new SimpleModule();
        module.addDeserializer(SimpleBean.class, new JsonDeserializer<SimpleBean>() {
            @Override
            public SimpleBean deserialize(com.fasterxml.jackson.core.JsonParser p,
                    DeserializationContext ctxt) throws IOException {
                SimpleBean b = new SimpleBean();
                b.setName("custom");
                return b;
            }
        });
        ObjectMapper m = new ObjectMapper().registerModule(module);
        SimpleBean bean = m.readValue("{\"name\":\"ignored\"}", SimpleBean.class);
        assertEquals("custom", bean.getName());
    }

    /* ===================================================================
     * 3) Abstract type handling
     * =================================================================== */

    @Test
    public void testAbstractTypeMaterialization() throws IOException {
        SimpleModule module = new SimpleModule();
        module.addAbstractTypeMapping(AbstractThing.class, ConcreteThing.class);
        ObjectMapper m = new ObjectMapper().registerModule(module);
        AbstractThing thing = m.readValue("{\"name\":\"abc\"}", AbstractThing.class);
        assertTrue(thing instanceof ConcreteThing);
        assertEquals("abc", thing.getName());
    }

    @Test
    public void testAbstractTypeWithoutResolver_fails() {
        // no AbstractTypeResolver registered, no materialization -> deserializer built via
        // buildAbstract(); actual instantiation failure surfaces at read time.
        try {
            mapper.readValue("{\"x\":\"v\"}", MyInterface.class);
            fail("Expected failure deserializing plain interface without concrete mapping");
        } catch (Exception e) {
            assertTrue(e instanceof JsonMappingException || e instanceof IOException);
        }
    }

    /* ===================================================================
     * 4) Throwable deserializer branch
     * =================================================================== */

    @Test
    public void testThrowableDeserializer_messageAndLocalizedMessageIgnored() throws IOException {
        // NOTE: relies on Jackson's built-in support for Throwable(String message) constructor
        // detection; not explicitly shown in provided source (assumption documented here).
        String json = "{\"message\":\"boom\",\"localizedMessage\":\"boom\",\"cause\":null}";
        CustomException ex = mapper.readValue(json, CustomException.class);
        assertEquals("boom", ex.getMessage());
    }

    @Test
    public void testThrowableDeserializer_suppressedIgnored() throws IOException {
        String json = "{\"message\":\"x\",\"suppressed\":[]}";
        CustomException ex = mapper.readValue(json, CustomException.class);
        assertEquals("x", ex.getMessage());
    }

    /* ===================================================================
     * 5) Object-id reader branches
     * =================================================================== */

    @Test
    public void testObjectIdReader_defaultGenerator() throws IOException {
        String json = "{\"@id\":1,\"name\":\"root\",\"ref\":1}";
        ObjIdBean bean = mapper.readValue(json, ObjIdBean.class);
        assertSame(bean, bean.ref);
    }

    @Test
    public void testObjectIdReader_propertyGenerator() throws IOException {
        String json = "{\"id\":7,\"name\":\"root\",\"ref\":7}";
        ObjIdPropBean bean = mapper.readValue(json, ObjIdPropBean.class);
        assertSame(bean, bean.ref);
    }

    @Test
    public void testObjectIdReader_propertyGenerator_missingProperty_throws() {
        try {
            mapper.readValue("{\"id\":1}", BadObjIdBean.class);
            fail("Expected exception: property for @JsonIdentityInfo not found");
        } catch (Exception e) {
            // Exact exception type may be wrapped by Jackson; we only assert the underlying
            // message produced by addObjectIdReader().
            assertTrue(containsMessage(e, "Invalid Object Id definition"));
        }
    }

    /* ===================================================================
     * 6) Builder-based deserializer
     * =================================================================== */

    @Test
    public void testBuilderBasedDeserializer() throws IOException {
        BuilderBean bean = mapper.readValue("{\"name\":\"joe\"}", BuilderBean.class);
        assertEquals("joe", bean.getName());
    }

    /* ===================================================================
     * 7) isPotentialBeanType() branches (direct protected call, same package)
     * =================================================================== */

    @Test
    public void testIsPotentialBeanType_normalClass_returnsTrue() {
        assertTrue(factory.isPotentialBeanType(SimpleBean.class));
    }

    @Test
    public void testIsPotentialBeanType_staticNestedClass_returnsTrue() {
        assertTrue(factory.isPotentialBeanType(StaticBean.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_localClass_throws() {
        class LocalBean { public String getX() { return "x"; } }
        factory.isPotentialBeanType(LocalBean.class);
    }

    // NOTE: the following three tests assume the well-known ClassUtil behavior
    // (arrays / enums / proxies are reported as "not a bean type"), as hinted by the
    // Javadoc comment on isPotentialBeanType(). Source of ClassUtil is not provided,
    // so this is documented as an assumption per requirement #4.
    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_arrayType_throws() {
        factory.isPotentialBeanType(int[].class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_enumType_throws() {
        factory.isPotentialBeanType(SampleEnum.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_proxyType_throws() {
        Class<?> proxyClass = Proxy.getProxyClass(getClass().getClassLoader(), Runnable.class);
        factory.isPotentialBeanType(proxyClass);
    }

    /* ===================================================================
     * 8) checkIllegalTypes() - only the "not illegal" branch is safely testable;
     *    the throwing branch requires an actual class object whose full name
     *    equals one of DEFAULT_NO_DESER_CLASS_NAMES, none of which exist on this
     *    test classpath -> intentionally NOT tested to avoid guessing/mocking
     *    class identity.
     * =================================================================== */

    @Test
    public void testCheckIllegalTypes_normalClass_doesNotThrow() throws JsonMappingException {
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        // ctxt/beanDesc are not touched on the "not illegal" path.
        factory.checkIllegalTypes(null, type, null);
        // reaching here means no exception was thrown -> branch covered
        assertTrue(true);
    }
}
```

## สรุป Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| testInstanceNotNull | `instance` static field ถูกสร้างสำเร็จ |
| testWithConfig_sameConfig_returnsSameInstance | `withConfig`: `_factoryConfig == config` → return `this` |
| testWithConfig_differentConfig_returnsNewInstanceSameClass | `withConfig`: config ต่าง + `getClass()==BeanDeserializerFactory.class` → สร้าง instance ใหม่ |
| testWithConfig_subclassDifferentConfig_throws | `withConfig`: config ต่าง + `getClass()!=BeanDeserializerFactory.class` → throw `IllegalStateException` |
| testWithConfig_subclassSameConfig_returnsThisNoException | ยืนยันลำดับเงื่อนไข: same-config check มาก่อน subclass check |
| testSimpleBeanDeserialization | `createBeanDeserializer` path ปกติ, `buildBeanDeserializer`, `isConcrete=true` |
| testIgnoredPropertyViaAnnotation | `addBeanProps`: `findPropertiesToIgnore` / ignored set |
| testAnySetterBranch | `addBeanProps`: `anySetter != null` branch |
| testConstructorCreatorPropertyBranch | `addBeanProps`: `propDef.hasConstructorParameter()` + match กับ `creatorProps` |
| testUseGettersAsSetters_enabled | `addBeanProps`: `useGettersAsSetters && hasGetter()` + Collection/Map check true |
| testUseGettersAsSetters_disabled_unknownPropertyFails | เงื่อนไข `useGettersAsSetters=false` → property ไม่ถูกจับ |
| testIgnorableTypeProperty | `filterBeanProps`/`isIgnorableType`: rawPropertyType ignorable |
| testManagedAndBackReference | `addReferenceProperties`: back-reference map ไม่ null, loop |
| testInjectables | `addInjectables`: raw map ไม่ null, loop, `fixAccess` |
| testCustomDeserializerOverride | `createBeanDeserializer`: `custom != null` → return ทันที |
| testAbstractTypeMaterialization | `type.isAbstract()` + `materializeAbstractType` returns non-null |
| testAbstractTypeWithoutResolver_fails | `type.isAbstract()` + resolver คืน null → build abstract path |
| testThrowableDeserializer_messageAndLocalizedMessageIgnored | `type.isThrowable()` → `buildThrowableDeserializer`, `am != null` (initCause), addIgnorable("localizedMessage"/"message") |
| testThrowableDeserializer_suppressedIgnored | addIgnorable("suppressed") branch |
| testObjectIdReader_defaultGenerator | `addObjectIdReader`: else-branch (ไม่ใช่ PropertyGenerator) |
| testObjectIdReader_propertyGenerator | `addObjectIdReader`: `implClass == PropertyGenerator.class` branch, idProp != null |
| testObjectIdReader_propertyGenerator_missingProperty_throws | `idProp == null` → throw `IllegalArgumentException` |
| testBuilderBasedDeserializer | `createBuilderBasedDeserializer` / `buildBuilderBasedDeserializer`, `buildMethod != null` |
| testIsPotentialBeanType_normalClass_returnsTrue | `isPotentialBeanType`: ทุก check ผ่าน → return true |
| testIsPotentialBeanType_staticNestedClass_returnsTrue | `isLocalType` static-ok branch |
| testIsPotentialBeanType_localClass_throws | `isLocalType` throw branch |
| testIsPotentialBeanType_arrayType_throws / enumType / proxyType | `canBeABeanType` / `isProxyType` throw branches (สมมติฐานตามคอมเมนต์ source) |
| testCheckIllegalTypes_normalClass_doesNotThrow | `checkIllegalTypes`: `_cfgIllegalClassNames.contains(full) == false` branch |

**หมายเหตุ**: branch การ throw ของ `checkIllegalTypes` (เมื่อชื่อคลาสอยู่ใน `DEFAULT_NO_DESER_CLASS_NAMES`) และบางกรณี edge (เช่น `cprop == null` ใน `addBeanProps`) ไม่ได้ถูกทดสอบเนื่องจากต้องพึ่งพา class ที่ไม่มีอยู่จริงบน classpath หรือ setup ที่ซับซ้อนเกินกว่าจะยืนยัน behavior ได้โดยไม่เดา ตามข้อกำหนดที่ 4