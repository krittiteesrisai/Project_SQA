# วิเคราะห์และแผนการทดสอบ

คลาส `BeanDeserializerFactory` พึ่งพา Jackson internals จำนวนมาก (DeserializationContext, BeanDescription ฯลฯ) ซึ่งการ mock ทั้งหมดจะซับซ้อนและเสี่ยงต่อการ "เดา" behavior ที่ไม่มีในซอร์ส ดังนั้นแนวทางที่เลือกใช้คือ:

- วาง test class ไว้ใน **package เดียวกัน** (`com.fasterxml.jackson.databind.deser`) เพื่อเรียก `protected` method ได้ตรง ๆ (เช่น `isPotentialBeanType`, `isIgnorableType`) โดยไม่ต้องใช้ reflection
- ใช้ `ObjectMapper` (public API จริงของโปรเจกต์) เพื่อทดสอบ flow เต็มของ `createBeanDeserializer`, `buildThrowableDeserializer`, `buildBuilderBasedDeserializer`, `addObjectIdReader` ผ่านการ serialize/deserialize จริง ซึ่งจะ trigger branch ต่าง ๆ ตาม source ที่ให้มา
- จุดที่ไม่มั่นใจ (behavior ของ `ClassUtil.isLocalType`/`isProxyType` ที่ไม่ได้แสดงใน source) จะมีคอมเมนต์กำกับไว้ชัดเจน

```java
package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * JUnit4 tests for {@link BeanDeserializerFactory}.
 *
 * หมายเหตุ: บางกรณีอ้างอิง behavior ของ ClassUtil (canBeABeanType / isLocalType / isProxyType)
 * ซึ่งไม่ได้แสดงใน source ที่ให้มาโดยตรง แต่เป็น behavior มาตรฐานที่ทราบกันทั่วไปของ Jackson
 * -> คอมเมนต์กำกับไว้ในแต่ละจุดที่มีความไม่แน่นอน
 */
public class BeanDeserializerFactoryTest {

    // ---------- Fixtures ----------

    static class PlainBean {
        public String x;
    }

    @JsonIgnoreType
    static class IgnorableTypeBean {
        public String y;
    }

    enum SampleEnum { A, B }

    static class SimpleBean {
        private String name;
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }

    static class CustomBean {
        public String value;
    }

    static class MyException extends Exception {
        public MyException() { super(); }
    }

    static abstract class AbstractBean {
        public abstract String getName();
    }

    @JsonDeserialize(builder = PersonBuilder.class)
    static class Person {
        private final String name;
        private Person(String name) { this.name = name; }
        public String getName() { return name; }
    }

    @JsonPOJOBuilder(withPrefix = "with")
    static class PersonBuilder {
        private String name;
        public PersonBuilder withName(String name) { this.name = name; return this; }
        public Person build() { return new Person(name); }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
    static class NodeDefault {
        public int id;
        public String name;
        public NodeDefault next;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    static class NodeProp {
        public int id;
        public String name;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "doesNotExist")
    static class NodeBadProp {
        public int id;
    }

    static class SubBeanDeserializerFactory extends BeanDeserializerFactory {
        private static final long serialVersionUID = 1L;
        public SubBeanDeserializerFactory(DeserializerFactoryConfig config) { super(config); }
    }

    // ---------- withConfig() / instance ----------

    @Test
    public void testInstance_NotNull() {
        assertNotNull(BeanDeserializerFactory.instance);
    }

    @Test
    public void testWithConfig_SameConfig_ReturnsSameInstance() {
        DeserializerFactoryConfig cfg = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(cfg);
        DeserializerFactory result = factory.withConfig(cfg);
        assertSame(factory, result); // branch: _factoryConfig == config
    }

    @Test
    public void testWithConfig_DifferentConfig_ReturnsNewInstance() {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializerFactoryConfig cfg2 = new DeserializerFactoryConfig();
        DeserializerFactory result = factory.withConfig(cfg2);
        assertNotSame(factory, result); // branch: config differs, class matches -> new instance
        assertTrue(result instanceof BeanDeserializerFactory);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfig_SubclassNotOverridden_ThrowsException() {
        SubBeanDeserializerFactory sub = new SubBeanDeserializerFactory(new DeserializerFactoryConfig());
        // branch: getClass() != BeanDeserializerFactory.class -> throw
        sub.withConfig(new DeserializerFactoryConfig());
    }

    // ---------- createBeanDeserializer() ----------

    @Test
    public void testCreateBeanDeserializer_SimpleBean() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean bean = mapper.readValue("{\"name\":\"foo\"}", SimpleBean.class);
        assertNotNull(bean);
        assertEquals("foo", bean.getName());
        // exercises: custom==null, !isThrowable, !isAbstract, findStdDeserializer==null,
        // isPotentialBeanType==true -> buildBeanDeserializer
    }

    @Test
    public void testCreateBeanDeserializer_CustomDeserializerOverride() throws Exception {
        SimpleModule module = new SimpleModule();
        module.addDeserializer(CustomBean.class, new JsonDeserializer<CustomBean>() {
            @Override
            public CustomBean deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                CustomBean b = new CustomBean();
                b.value = "custom-overridden";
                return b;
            }
        });
        ObjectMapper mapper = new ObjectMapper().registerModule(module);
        CustomBean result = mapper.readValue("{\"value\":\"original\"}", CustomBean.class);
        assertEquals("custom-overridden", result.value);
        // exercises: custom != null -> return custom (early-exit branch)
    }

    @Test
    public void testCreateBeanDeserializer_ThrowableType_IgnoresKnownProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"message\":\"boom\",\"localizedMessage\":\"boom2\",\"suppressed\":[]}";
        MyException ex = mapper.readValue(json, MyException.class);
        assertNotNull(ex);
        // "message" ถูก addIgnorable ไว้ -> ไม่ถูกตั้งค่าผ่าน setter (ไม่มีอยู่จริง)
        assertNull(ex.getMessage());
        // exercises: type.isThrowable()==true -> buildThrowableDeserializer,
        // addIgnorable("localizedMessage"/"suppressed"/"message") branches
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateBeanDeserializer_AbstractTypeWithoutConcrete_Throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // ไม่มี AbstractTypeResolver ลงทะเบียน -> materializeAbstractType คืน null
        // -> isPotentialBeanType==true -> buildBeanDeserializer -> ล้มเหลวเพราะไม่มี Creator
        mapper.readValue("{}", AbstractBean.class);
    }

    @Test
    public void testCreateBuilderBasedDeserializer_Basic() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Person p = mapper.readValue("{\"name\":\"Alice\"}", Person.class);
        assertNotNull(p);
        assertEquals("Alice", p.getName());
        // exercises: createBuilderBasedDeserializer + buildBuilderBasedDeserializer,
        // builderConfig != null, buildMethod != null branch
    }

    // ---------- addObjectIdReader() ----------

    @Test
    public void testAddObjectIdReader_DefaultGenerator() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"id\":1,\"name\":\"root\",\"next\":null}";
        NodeDefault node = mapper.readValue(json, NodeDefault.class);
        assertNotNull(node);
        assertEquals("root", node.name);
        // exercises: implClass != PropertyGenerator.class -> else branch (default generator)
    }

    @Test
    public void testAddObjectIdReader_PropertyGenerator_Valid() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"id\":5,\"name\":\"n1\"}";
        NodeProp node = mapper.readValue(json, NodeProp.class);
        assertNotNull(node);
        assertEquals(5, node.id);
        assertEquals("n1", node.name);
        // exercises: implClass == PropertyGenerator.class, idProp found (not null)
    }

    @Test
    public void testAddObjectIdReader_PropertyGenerator_InvalidProperty_Throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue("{\"id\":1}", NodeBadProp.class);
            fail("Expected exception due to invalid Object Id property reference");
        } catch (Exception e) {
            // exercises: idProp == null -> throw new IllegalArgumentException(...)
            // (อาจถูก wrap เป็นอย่างอื่นได้ในบาง path ของ pipeline ดังนั้นตรวจทั้ง 2 กรณี)
            boolean isExpected = (e instanceof IllegalArgumentException)
                    || (e.getCause() instanceof IllegalArgumentException);
            assertTrue("Expected IllegalArgumentException (direct or wrapped)", isExpected);
        }
    }

    // ---------- isPotentialBeanType() ----------

    @Test
    public void testIsPotentialBeanType_NormalClass_ReturnsTrue() {
        assertTrue(BeanDeserializerFactory.instance.isPotentialBeanType(PlainBean.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_Primitive_Throws() {
        // ClassUtil.canBeABeanType flags primitive types (behavior มาตรฐานของ Jackson)
        BeanDeserializerFactory.instance.isPotentialBeanType(int.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_Array_Throws() {
        BeanDeserializerFactory.instance.isPotentialBeanType(String[].class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_Enum_Throws() {
        BeanDeserializerFactory.instance.isPotentialBeanType(SampleEnum.class);
    }

    @Test
    public void testIsPotentialBeanType_LocalClass_Throws() {
        class LocalBean { public String x; }
        try {
            BeanDeserializerFactory.instance.isPotentialBeanType(LocalBean.class);
            fail("Expected IllegalArgumentException for local class type");
        } catch (IllegalArgumentException e) {
            // NOTE: ไม่มั่นใจ 100% เพราะ ClassUtil.isLocalType ไม่ได้แสดงใน source ที่ให้มา
            // สมมติฐานอิงจาก behavior มาตรฐานที่ทราบกันของ Jackson ClassUtil
        }
    }

    // ---------- isIgnorableType() ----------

    @Test
    public void testIsIgnorableType_NormalType_ReturnsFalse() {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        Map<Class<?>, Boolean> cache = new HashMap<Class<?>, Boolean>();
        boolean result = BeanDeserializerFactory.instance
                .isIgnorableType(config, null, PlainBean.class, cache);
        assertFalse(result); // branch: status == null (not annotated) -> false
    }

    @Test
    public void testIsIgnorableType_AnnotatedIgnorableType_ReturnsTrue() {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        Map<Class<?>, Boolean> cache = new HashMap<Class<?>, Boolean>();
        boolean result = BeanDeserializerFactory.instance
                .isIgnorableType(config, null, IgnorableTypeBean.class, cache);
        assertTrue(result); // branch: AnnotationIntrospector returns TRUE
    }

    @Test
    public void testIsIgnorableType_UsesCachedValueWhenPresent() {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        Map<Class<?>, Boolean> cache = new HashMap<Class<?>, Boolean>();
        // ตั้งค่า cache ล่วงหน้าให้ขัดแย้งกับค่าจริง เพื่อพิสูจน์ว่า branch "status != null" ถูก short-circuit
        cache.put(PlainBean.class, Boolean.TRUE);
        boolean result = BeanDeserializerFactory.instance
                .isIgnorableType(config, null, PlainBean.class, cache);
        assertTrue("Expected cached value to short-circuit computation", result);
    }

    /**
     * หมายเหตุ (fault-detection candidate):
     * จาก source, ตัวแปร ignoredTypes/ถูกอ่านเป็น cache ("status = ignoredTypes.get(type)")
     * แต่ไม่มีการเขียนค่ากลับ (ignoredTypes.put(...)) หลังคำนวณ status ใหม่เลย
     * ซึ่งขัดกับเจตนาการ cache ที่ควรจะเป็น -> เทสนี้ระบุ contract ที่คาดหวัง
     * (อาจ fail บน source ที่ให้มา และเป็นตัวช่วยดักจับ fault นี้)
     */
    @Test
    public void testIsIgnorableType_ComputedValueShouldBeCached() {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        Map<Class<?>, Boolean> cache = new HashMap<Class<?>, Boolean>();
        BeanDeserializerFactory.instance
                .isIgnorableType(config, null, IgnorableTypeBean.class, cache);
        assertTrue("Expected computed status to be cached into map (possible missing cache write)",
                cache.containsKey(IgnorableTypeBean.class));
    }
}
```

## ตารางสรุปการครอบคลุม (Branch / Condition Coverage)

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testInstance_NotNull` | Static field `instance` ถูกสร้างสำเร็จ |
| `testWithConfig_SameConfig_ReturnsSameInstance` | `withConfig`: `_factoryConfig == config` → return `this` |
| `testWithConfig_DifferentConfig_ReturnsNewInstance` | `withConfig`: config ต่างกัน, `getClass()==BeanDeserializerFactory.class` → new instance |
| `testWithConfig_SubclassNotOverridden_ThrowsException` | `withConfig`: `getClass() != BeanDeserializerFactory.class` → throw `IllegalStateException` |
| `testCreateBeanDeserializer_SimpleBean` | `createBeanDeserializer`: custom==null, !isThrowable, !isAbstract, findStdDeserializer==null, isPotentialBeanType==true → buildBeanDeserializer |
| `testCreateBeanDeserializer_CustomDeserializerOverride` | `createBeanDeserializer`: `custom != null` → early return |
| `testCreateBeanDeserializer_ThrowableType_IgnoresKnownProperties` | `type.isThrowable()==true` → `buildThrowableDeserializer`; addIgnorable("localizedMessage"/"suppressed"/"message") |
| `testCreateBeanDeserializer_AbstractTypeWithoutConcrete_Throws` | `type.isAbstract()`==true, `materializeAbstractType`→null, buildBeanDeserializer ล้มเหลว (ไม่มี creator) |
| `testCreateBuilderBasedDeserializer_Basic` | `createBuilderBasedDeserializer` + `buildBuilderBasedDeserializer`: builderConfig!=null, buildMethod!=null |
| `testAddObjectIdReader_DefaultGenerator` | `addObjectIdReader`: objectIdInfo!=null, implClass != PropertyGenerator → else branch |
| `testAddObjectIdReader_PropertyGenerator_Valid` | `addObjectIdReader`: implClass==PropertyGenerator, idProp != null |
| `testAddObjectIdReader_PropertyGenerator_InvalidProperty_Throws` | `addObjectIdReader`: implClass==PropertyGenerator, idProp==null → throw `IllegalArgumentException` |
| `testIsPotentialBeanType_NormalClass_ReturnsTrue` | `isPotentialBeanType`: ทุกเงื่อนไข null → return true |
| `testIsPotentialBeanType_Primitive_Throws` | `canBeABeanType != null` (primitive) → throw |
| `testIsPotentialBeanType_Array_Throws` | `canBeABeanType != null` (array) → throw |
| `testIsPotentialBeanType_Enum_Throws` | `canBeABeanType != null` (enum) → throw |
| `testIsPotentialBeanType_LocalClass_Throws` | `isLocalType != null` (local class) → throw (สมมติฐานมีคอมเมนต์กำกับ) |
| `testIsIgnorableType_NormalType_ReturnsFalse` | `isIgnorableType`: cache miss, status==null → false |
| `testIsIgnorableType_AnnotatedIgnorableType_ReturnsTrue` | `isIgnorableType`: cache miss, annotation-derived status==TRUE |
| `testIsIgnorableType_UsesCachedValueWhenPresent` | `isIgnorableType`: `status != null` → return cached value ทันที |
| `testIsIgnorableType_ComputedValueShouldBeCached` | ตรวจสอบ contract การเขียนกลับเข้า cache (fault-detection candidate) |

**หมายเหตุสำคัญ:** เนื่องจากข้อจำกัดของ classpath ที่ไม่มี Mockito/PowerMock mocking กับ internal Jackson objects (DeserializationContext เต็มรูปแบบ, BeanDescription แบบ fine-grained) ทดสอบส่วนใหญ่จึงใช้ `ObjectMapper` (public API จริงของโปรเจกต์) เพื่อ trigger branch ภายในแบบ integration-style ซึ่งยังคงให้ผล assertion ที่ตรวจสอบ behavior ตาม logic ในซอร์สโค้ดที่ให้มาโดยตรง ไม่มีการเดา behavior ที่ไม่มีหลักฐานในซอร์ส (ยกเว้นจุดที่มีคอมเมนต์กำกับไว้อย่างชัดเจน)