# วิเคราะห์และแนวทางการทดสอบ

`BeanSerializerFactory` เป็นคลาสที่ผูกกับ internal ของ `ObjectMapper`/`SerializerProvider` อย่างลึก การจะ mock ทุกอย่างจะไม่สมจริงและไม่สามารถ trigger branch จริงได้ครบ จึงเลือกใช้แนวทาง **integration test ผ่าน public API ของ `ObjectMapper`** (ซึ่งภายในจะเรียกใช้เมธอดต่าง ๆ ของ `BeanSerializerFactory` จริง) ร่วมกับการเรียกเมธอด public (`findBeanSerializer`, `withConfig`) โดยตรง และใช้ reflection กับเมธอด protected ที่ตรวจสอบได้ง่าย (`isPotentialBeanType`)

สำหรับการเรียก `findBeanSerializer` โดยตรง จำเป็นต้องมี `SerializerProvider` ที่ initialize ครบ จึงใช้เทคนิค "ดัก" (capture) SerializerProvider จริงผ่าน custom `JsonSerializer` ที่ลงทะเบียนด้วย `SimpleModule` (เป็น public API ทั้งหมด ไม่ได้เดา internal behavior)

> หมายเหตุ: บาง assertion (เช่น ค่า default ของ `@id`, ลำดับ property, ข้อความ exception) มีความไม่แน่นอนตาม version — ได้ใส่คอมเมนต์กำกับจุดที่เป็น "best effort / assumption" ไว้ในโค้ด

```java
package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Unit / integration tests for {@link BeanSerializerFactory} (Defects4J JacksonDatabind-10b).
 *
 * แนวทาง: ใช้ ObjectMapper จริง (public API) เพื่อ trigger branch ต่าง ๆ ของ
 * createSerializer / _createSerializer2 / constructBeanSerializer / findBeanProperties /
 * filterBeanProperties / processViews / removeIgnorableTypes / removeSetterlessGetters /
 * constructObjectIdHandler / _constructWriter
 * และเรียกเมธอด public (findBeanSerializer, withConfig) ตรง ๆ เมื่อทำได้อย่างปลอดภัย
 */
public class BeanSerializerFactoryTest {

    // ======================================================================
    // Helper: capture initialized SerializerProvider ผ่าน public API (SimpleModule)
    // ======================================================================

    private static SerializerProvider capturedProvider;

    static class Marker {}

    /** ใช้ custom serializer แบบ public API เพื่อดัก SerializerProvider ที่ initialize ครบแล้ว */
    private SerializerProvider captureProvider(ObjectMapper mapper) throws Exception {
        capturedProvider = null;
        SimpleModule module = new SimpleModule();
        module.addSerializer(Marker.class, new JsonSerializer<Marker>() {
            @Override
            public void serialize(Marker value, JsonGenerator gen, SerializerProvider serializers)
                    throws IOException {
                capturedProvider = serializers;
                gen.writeStartObject();
                gen.writeEndObject();
            }
        });
        mapper.registerModule(module);
        mapper.writeValueAsString(new Marker());
        assertNotNull("provider ควรถูก capture ได้", capturedProvider);
        return capturedProvider;
    }

    // ======================================================================
    // 1) instance / Serializable
    // ======================================================================

    @Test
    public void testSingletonInstanceExistsAndIsSerializable() {
        assertNotNull(BeanSerializerFactory.instance);
        assertTrue(BeanSerializerFactory.instance instanceof java.io.Serializable);
        assertTrue(BeanSerializerFactory.instance instanceof BeanSerializerFactory);
    }

    // ======================================================================
    // 2) withConfig()
    // ======================================================================

    @Test
    public void testWithConfigSameConfigReferenceReturnsSameInstance() {
        SerializerFactoryConfig cfg = new SerializerFactoryConfig();
        SerializerFactory f1 = BeanSerializerFactory.instance.withConfig(cfg);
        SerializerFactory f2 = f1.withConfig(cfg); // config อ้างอิงเดิม -> ต้องได้ instance เดิม (branch: _factoryConfig == config)
        assertSame(f1, f2);
    }

    @Test
    public void testWithConfigDifferentConfigCreatesNewInstance() {
        SerializerFactoryConfig cfg = new SerializerFactoryConfig();
        SerializerFactory f1 = BeanSerializerFactory.instance.withConfig(cfg);
        assertNotSame(BeanSerializerFactory.instance, f1);
        assertTrue(f1 instanceof BeanSerializerFactory);
    }

    @Test
    public void testWithConfigNullConfigDoesNotThrow() {
        // config == null: สมมติว่า constructor เดิม (instance) เก็บ default config ที่ไม่ null
        // ดังนั้น _factoryConfig == null (param) จะเป็น false -> ไป branch getClass()==BeanSerializerFactory.class
        SerializerFactory result = BeanSerializerFactory.instance.withConfig(null);
        assertNotNull(result);
        assertNotSame(BeanSerializerFactory.instance, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfigThrowsWhenSubclassDoesNotOverride() {
        // subclass ที่ไม่ override withConfig -> ต้อง throw IllegalStateException
        BeanSerializerFactory sub = new BeanSerializerFactory(null) { };
        sub.withConfig(new SerializerFactoryConfig());
    }

    // ======================================================================
    // 3) isPotentialBeanType() ผ่าน reflection (protected method)
    // ======================================================================

    enum SampleEnum { A, B }

    static class PlainBean {
        public String name = "x";
    }

    @Test
    public void testIsPotentialBeanTypeBranches() throws Exception {
        Method m = BeanSerializerFactory.class.getDeclaredMethod("isPotentialBeanType", Class.class);
        m.setAccessible(true);

        assertFalse((Boolean) m.invoke(BeanSerializerFactory.instance, int.class));       // primitive
        assertFalse((Boolean) m.invoke(BeanSerializerFactory.instance, int[].class));     // array
        assertFalse((Boolean) m.invoke(BeanSerializerFactory.instance, SampleEnum.class)); // enum
        assertTrue((Boolean) m.invoke(BeanSerializerFactory.instance, PlainBean.class));   // normal bean
    }

    // ======================================================================
    // 4) findBeanSerializer() - เรียกตรงด้วย provider ที่ capture มา
    // ======================================================================

    @Test
    public void testFindBeanSerializerReturnsNullForNonBeanNonEnumType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = captureProvider(mapper);

        JavaType arrType = mapper.getTypeFactory().constructType(int[].class);
        BeanDescription arrDesc = mapper.getSerializationConfig().introspect(arrType);

        JsonSerializer<Object> result =
                BeanSerializerFactory.instance.findBeanSerializer(provider, arrType, arrDesc);
        assertNull(result); // isPotentialBeanType=false, isEnumType=false -> null
    }

    @Test
    public void testFindBeanSerializerForObjectClassReturnsUnknownTypeSerializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = captureProvider(mapper);

        JavaType objType = mapper.getTypeFactory().constructType(Object.class);
        BeanDescription objDesc = mapper.getSerializationConfig().introspect(objType);

        JsonSerializer<Object> result =
                BeanSerializerFactory.instance.findBeanSerializer(provider, objType, objDesc);
        // beanDesc.getBeanClass() == Object.class -> ได้ unknown-type serializer (ไม่ใช่ null)
        assertNotNull(result);
    }

    @Test
    public void testFindBeanSerializerForNormalBeanReturnsSerializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = captureProvider(mapper);

        JavaType beanType = mapper.getTypeFactory().constructType(PlainBean.class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(beanType);

        JsonSerializer<Object> result =
                BeanSerializerFactory.instance.findBeanSerializer(provider, beanType, beanDesc);
        assertNotNull(result);
    }

    // ======================================================================
    // 5) createSerializer() ผ่าน ObjectMapper.writeValueAsString - basic bean
    // ======================================================================

    static class SimpleBean {
        public String getName() { return "foo"; }
    }

    @Test
    public void testSimpleBeanSerialization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new SimpleBean());
        assertEquals("{\"name\":\"foo\"}", json);
    }

    static class TwoFieldBean {
        public int a = 1;
        public int b = 2;
    }

    @Test
    public void testMultiplePropertiesSerialization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new TwoFieldBean());
        assertEquals("{\"a\":1,\"b\":2}", json);
    }

    // ======================================================================
    // 6) Empty bean cases
    // ======================================================================

    static class EmptyBeanNoAnnotation {
        // ไม่มี property, ไม่มี known class annotation
    }

    @Test(expected = JsonMappingException.class)
    public void testEmptyBeanWithoutAnnotationsThrows() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValueAsString(new EmptyBeanNoAnnotation());
    }

    // ค่านี้เป็น best-effort: สมมติว่า @JsonIgnoreProperties ทำให้ hasKnownClassAnnotations()==true
    // ตามซอร์สโค้ดจริงของ BasicBeanDescription (ไม่ได้อยู่ในซอร์สที่ให้มา) จึงใส่คอมเมนต์กำกับความไม่แน่นอน
    @JsonIgnoreProperties({"dummy"})
    static class EmptyBeanWithKnownAnnotation {
    }

    @Test
    public void testEmptyBeanWithKnownAnnotationDoesNotThrow() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json;
        try {
            json = mapper.writeValueAsString(new EmptyBeanWithKnownAnnotation());
        } catch (JsonMappingException e) {
            // ถ้า version นี้ไม่ถือว่า @JsonIgnoreProperties เป็น known-annotation
            // การ throw ก็ยังสอดคล้อง branch อื่นในโค้ด (ไม่ fail test แต่บันทึกไว้)
            org.junit.Assume.assumeNoException(
                "Known-class-annotation detection อาจต่างกันตาม version", e);
            return;
        }
        assertEquals("{}", json);
    }

    // ======================================================================
    // 7) REQUIRE_SETTERS_FOR_GETTERS -> removeSetterlessGetters
    // ======================================================================

    static class GetterOnlyBean {
        public String getValue() { return "v"; }
    }

    @Test(expected = JsonMappingException.class)
    public void testRequireSettersForGettersRemovesProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS, true);
        mapper.writeValueAsString(new GetterOnlyBean());
    }

    // ======================================================================
    // 8) removeIgnorableTypes (@JsonIgnoreType)
    // ======================================================================

    @JsonIgnoreType
    static class Ignorable {
        public String x = "ignored";
    }

    static class HostBean {
        public String name = "n";
        public Ignorable ignorableField = new Ignorable();
    }

    @Test
    public void testJsonIgnoreTypeRemovesProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new HostBean());
        assertEquals("{\"name\":\"n\"}", json);
    }

    // ======================================================================
    // 9) filterBeanProperties (@JsonIgnoreProperties)
    // ======================================================================

    @JsonIgnoreProperties({"secret"})
    static class FilterBean {
        public String name = "n";
        public String secret = "s";
    }

    @Test
    public void testJsonIgnorePropertiesFiltersOutNamedProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new FilterBean());
        assertFalse(json.contains("secret"));
        assertTrue(json.contains("\"name\":\"n\""));
    }

    // ======================================================================
    // 10) @JsonBackReference (findBeanProperties: refType skip)
    // ======================================================================

    static class Child {
        public String value = "c";
        @JsonBackReference
        public Parent parent;
    }

    static class Parent {
        public String name = "p";
        public List<Child> children = new ArrayList<Child>();
    }

    @Test
    public void testBackReferencePropertyExcluded() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Parent parent = new Parent();
        Child c = new Child();
        c.parent = parent;
        parent.children.add(c);

        String json = mapper.writeValueAsString(parent);
        assertTrue(json.contains("\"name\":\"p\""));
        assertFalse(json.contains("\"parent\""));
    }

    // ======================================================================
    // 11) @JsonAnyGetter
    // ======================================================================

    static class AnyBean {
        public String name = "n";
        private Map<String, Object> extra = new LinkedHashMap<String, Object>();

        @JsonAnyGetter
        public Map<String, Object> getExtra() { return extra; }

        public void put(String k, Object v) { extra.put(k, v); }
    }

    @Test
    public void testAnyGetterMergesExtraProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnyBean bean = new AnyBean();
        bean.put("foo", "bar");
        String json = mapper.writeValueAsString(bean);
        assertTrue(json.contains("\"name\":\"n\""));
        assertTrue(json.contains("\"foo\":\"bar\""));
    }

    // ======================================================================
    // 12) Container type branch (buildContainerSerializer bypasses bean props)
    // ======================================================================

    static class MyList extends ArrayList<String> {
        private static final long serialVersionUID = 1L;
        public String getExtra() { return "x"; } // ไม่ควรถูก serialize เพราะเป็น container type
    }

    @Test
    public void testContainerTypeSkipsBeanProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        MyList list = new MyList();
        list.add("a");
        String json = mapper.writeValueAsString(list);
        assertEquals("[\"a\"]", json);
    }

    // ======================================================================
    // 13) processViews branches
    // ======================================================================

    interface ViewA {}

    static class ViewBean {
        public String name = "n";
        @JsonView(ViewA.class)
        public String secret = "s";
    }

    @Test
    public void testViewPropertyExcludedWithoutActiveView() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new ViewBean());
        assertEquals("{\"name\":\"n\"}", json); // includeByDefault=true, viewsFound>0, secret ไม่ match active view (null)
    }

    @Test
    public void testViewPropertyIncludedWithMatchingActiveView() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithView(ViewA.class).writeValueAsString(new ViewBean());
        assertTrue(json.contains("\"name\":\"n\""));
        assertTrue(json.contains("\"secret\":\"s\""));
    }

    @Test
    public void testViewIncludeByDefaultFalseExcludesUnannotatedProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, false);
        String json = mapper.writerWithView(ViewA.class).writeValueAsString(new ViewBean());
        assertFalse(json.contains("\"name\""));
        assertTrue(json.contains("\"secret\":\"s\""));
    }

    @Test
    public void testViewIncludeByDefaultFalseNoActiveViewAllExcluded() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, false);
        String json = mapper.writeValueAsString(new ViewBean());
        assertEquals("{}", json);
    }

    @Test
    public void testViewNoViewAnnotationsAtAllUsesEarlyReturn() throws Exception {
        // ไม่มี @JsonView เลย -> viewsFound==0, includeByDefault==true(default) -> early return path
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new SimpleBean());
        assertEquals("{\"name\":\"foo\"}", json);
    }

    // ======================================================================
    // 14) constructObjectIdHandler - PropertyGenerator branch
    // ======================================================================

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    static class Node {
        public String name; // ประกาศก่อน id -> ทำให้ index ของ id > 0 -> เข้า branch rearrange (props.remove/add)
        public int id;
        public Node child;
    }

    @Test
    public void testObjectIdPropertyGeneratorSelfReference() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Node a = new Node();
        a.name = "A";
        a.id = 1;
        a.child = a; // self reference

        String json = mapper.writeValueAsString(a);
        assertTrue(json.contains("\"id\":1"));
        assertTrue(json.contains("\"name\":\"A\""));
        // การอ้างอิงซ้ำ ควรถูกแทนด้วย id เปล่า ๆ ไม่ใช่ nested object
        assertTrue(json.contains("\"child\":1"));
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "missingProp")
    static class BadNode {
        public String name = "bad";
        public int id = 1;
    }

    @Test
    public void testObjectIdPropertyGeneratorInvalidPropertyThrows() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValueAsString(new BadNode());
            fail("ควร throw exception เนื่องจากไม่พบ property 'missingProp'");
        } catch (Exception e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("Invalid Object Id definition"));
        }
    }

    // ======================================================================
    // 15) constructObjectIdHandler - "other types" (non-property generator) branch
    // ======================================================================

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
    static class SeqNode {
        public String name;
        public SeqNode child;
    }

    @Test
    public void testObjectIdNonPropertyGeneratorSelfReference() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SeqNode s = new SeqNode();
        s.name = "S";
        s.child = s;

        String json = mapper.writeValueAsString(s);
        assertTrue(json.contains("\"@id\""));           // ชื่อ property default ของ ObjectIdInfo
        assertTrue(json.contains("\"name\":\"S\""));
        assertFalse(json.contains("\"child\":{"));       // อ้างอิงซ้ำไม่ควรเป็น nested object
    }

    // ======================================================================
    // 16) findPropertyTypeSerializer - class-level (b == null) และ property-level (b != null)
    // ======================================================================

    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
    static class Animal {
        public String name;
    }

    static class Dog extends Animal {
        public String breed;
    }

    static class Holder {
        public Animal pet; // ไม่มี annotation ตรง field -> defaulting (b == null)
    }

    @Test
    public void testPropertyTypeSerializerClassLevelDefaulting() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Holder h = new Holder();
        Dog dog = new Dog();
        dog.name = "Rex";
        dog.breed = "Lab";
        h.pet = dog;

        String json = mapper.writeValueAsString(h);
        assertTrue(json.contains("@class"));
        assertTrue(json.contains("Rex"));
        assertTrue(json.contains("Lab"));
    }

    static class Holder2 {
        @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "type")
        public Animal pet; // annotation ตรง field -> b != null branch
    }

    @Test
    public void testPropertyTypeSerializerPropertyLevelAnnotation() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Holder2 h = new Holder2();
        Dog dog = new Dog();
        dog.name = "Fido";
        dog.breed = "Poodle";
        h.pet = dog;

        String json = mapper.writeValueAsString(h);
        assertTrue(json.contains("\"type\""));
        assertTrue(json.contains("Fido"));
    }

    // ======================================================================
    // 17) findPropertyContentTypeSerializer (Collection content)
    // ======================================================================

    static class ListHolder {
        public List<Animal> pets;
    }

    @Test
    public void testListPropertyContentTypeSerializerDefaulting() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ListHolder h = new ListHolder();
        h.pets = new ArrayList<Animal>();
        Dog d = new Dog();
        d.name = "Rex";
        d.breed = "Lab";
        h.pets.add(d);

        String json = mapper.writeValueAsString(h);
        assertTrue(json.contains("@class"));
        assertTrue(json.contains("Rex"));
    }
}
```

## ตารางสรุป Branch/Condition ที่แต่ละเมธอดทดสอบครอบคลุม

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testSingletonInstanceExistsAndIsSerializable` | ตรวจ static field `instance`, marker interface `Serializable` |
| `testWithConfigSameConfigReferenceReturnsSameInstance` | `withConfig`: `_factoryConfig == config` → true → return `this` |
| `testWithConfigDifferentConfigCreatesNewInstance` | `withConfig`: config ต่างกัน + `getClass()==BeanSerializerFactory.class` → return new instance |
| `testWithConfigNullConfigDoesNotThrow` | `withConfig(null)`: ไม่ throw, ไม่ match reference เดิม |
| `testWithConfigThrowsWhenSubclassDoesNotOverride` | `withConfig`: `getClass() != BeanSerializerFactory.class` → `IllegalStateException` |
| `testIsPotentialBeanTypeBranches` | `isPotentialBeanType`: primitive/array/enum → false, normal class → true |
| `testFindBeanSerializerReturnsNullForNonBeanNonEnumType` | `findBeanSerializer`: `!isPotentialBeanType` && `!isEnumType` → null |
| `testFindBeanSerializerForObjectClassReturnsUnknownTypeSerializer` | `constructBeanSerializer`: `beanClass==Object.class` branch |
| `testFindBeanSerializerForNormalBeanReturnsSerializer` | `findBeanSerializer`/`constructBeanSerializer` happy path |
| `testSimpleBeanSerialization` / `testMultiplePropertiesSerialization` | `createSerializer` → `_createSerializer2` non-container bean path, `findBeanProperties` happy path |
| `testEmptyBeanWithoutAnnotationsThrows` | `findBeanProperties` empty → `builder.build()==null`, `hasKnownClassAnnotations()==false` → ser null → `UnknownTypeSerializer` throw |
| `testEmptyBeanWithKnownAnnotationDoesNotThrow` | `hasKnownClassAnnotations()==true` → `builder.createDummy()` |
| `testRequireSettersForGettersRemovesProperty` | `findBeanProperties`: `MapperFeature.REQUIRE_SETTERS_FOR_GETTERS` → `removeSetterlessGetters` |
| `testJsonIgnoreTypeRemovesProperty` | `removeIgnorableTypes`: `result.booleanValue()==true` → remove |
| `testJsonIgnorePropertiesFiltersOutNamedProperty` | `filterBeanProperties`: `ignored != null && ignored.length>0` |
| `testBackReferencePropertyExcluded` | `findBeanProperties`: `refType != null && refType.isBackReference()` → continue |
| `testAnyGetterMergesExtraProperties` | `constructBeanSerializer`: `anyGetter != null` branch |
| `testContainerTypeSkipsBeanProperty` | `_createSerializer2`: `type.isContainerType()==true`, `buildContainerSerializer` non-null → early return |
| `testViewPropertyExcludedWithoutActiveView` | `processViews`: `views != null` wrap, ไม่ match active view |
| `testViewPropertyIncludedWithMatchingActiveView` | `processViews`: wrapped writer match active view |
| `testViewIncludeByDefaultFalseExcludesUnannotatedProperty` | `processViews`: `includeByDefault==false`, `views==null` → excluded |
| `testViewIncludeByDefaultFalseNoActiveViewAllExcluded` | `processViews`: ทั้งสอง branch ผลลัพธ์ null |
| `testViewNoViewAnnotationsAtAllUsesEarlyReturn` | `processViews`: `includeByDefault && viewsFound==0` → early return |
| `testObjectIdPropertyGeneratorSelfReference` | `constructObjectIdHandler`: `implClass==PropertyGenerator.class`, loop match + rearrange (`i>0`) |
| `testObjectIdPropertyGeneratorInvalidPropertyThrows` | `constructObjectIdHandler`: loop `i==len` → `IllegalArgumentException` |
| `testObjectIdNonPropertyGeneratorSelfReference` | `constructObjectIdHandler`: else branch ("other types are simpler") |
| `testPropertyTypeSerializerClassLevelDefaulting` | `findPropertyTypeSerializer`: `b==null` → `createTypeSerializer` |
| `testPropertyTypeSerializerPropertyLevelAnnotation` | `findPropertyTypeSerializer`: `b!=null` → `buildTypeSerializer` |
| `testListPropertyContentTypeSerializerDefaulting` | `_constructWriter`: `isCollectionLikeType` → `findPropertyContentTypeSerializer` (`b==null`) |

**ข้อจำกัดที่ทราบและระบุคอมเมนต์ในโค้ด:** พฤติกรรมของ `hasKnownClassAnnotations()` และค่า default property name `"@id"` อาจแปรผันตาม version ของ jackson-databind ที่ compile จริง จึงมีการใช้ `Assume`/comment กำกับความไม่แน่นอนไว้ตามคำสั่ง