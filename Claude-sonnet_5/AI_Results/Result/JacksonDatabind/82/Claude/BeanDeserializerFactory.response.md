# วิเคราะห์และแผนการทดสอบ

คลาส `BeanDeserializerFactory` เป็นส่วนหนึ่งของ jackson-databind (ไม่ได้อยู่ใน jar ที่ระบุในโจทย์ เพราะเป็น **คลาสเป้าหมายที่จะถูกทดสอบเอง** ซึ่งถือว่าคอมไพล์อยู่ใน classpath ของโปรเจกต์ตาม harness ของ Defects4J อยู่แล้ว) ผมจึงทดสอบผ่าน public API (`ObjectMapper`) เป็นหลัก (black/gray-box) และใช้ reflection/สิทธิ์ same-package เข้าถึง protected member บางส่วนเพื่อยกระดับ branch coverage โดยไม่เดา behavior ของ dependency ที่ไม่ได้แสดง (เช่น `ClassUtil`) — จุดที่ไม่แน่ใจจะมีคอมเมนต์กำกับไว้ชัดเจน

> **หมายเหตุสำคัญ:** เพื่อทดสอบ branch การบล็อกคลาสอันตราย (`checkIllegalTypes`) ผมต้องสร้างไฟล์ fixture แยกในแพ็กเกจ `org.apache.commons.collections.functors` (ชื่อเดียวกับที่อยู่ใน `DEFAULT_NO_DESER_CLASS_NAMES`) เพื่อจำลองสถานการณ์จริงโดยไม่ต้องพึ่งไลบรารีอันตรายจริง

---

## ไฟล์ 1: Fixture สำหรับทดสอบ blacklist class name

```java
// src/test/java/org/apache/commons/collections/functors/InvokerTransformer.java
package org.apache.commons.collections.functors;

/**
 * Fixture เปล่า ๆ ใช้เพียงเพื่อให้ชื่อ fully-qualified class ตรงกับ
 * รายการใน BeanDeserializerFactory.DEFAULT_NO_DESER_CLASS_NAMES
 * ไม่มีความเกี่ยวข้องใด ๆ กับไลบรารี commons-collections จริง
 */
public class InvokerTransformer {
    public String value;
    public InvokerTransformer() {}
}
```

## ไฟล์ 2: BeanDeserializerFactoryTest.java

```java
package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class BeanDeserializerFactoryTest {

    // ===================================================================
    // Fixtures (POJOs) ใช้ในการทดสอบ
    // ===================================================================

    static class SimpleBean {
        private int id;
        private String name;
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }

    static class BeanIgnoreUnknown {
        @JsonIgnoreProperties(ignoreUnknown = true)
        public String name;
    }

    static class IgnoreUnknownTrueBean {
        public String name;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class IgnoreUnknownBean {
        public String name;
    }

    @JsonIgnoreProperties({"secret"})
    static class ExplicitIgnoreBean {
        public String name;
    }

    static class StrictBean {
        public String name;
    }

    static class AnySetterMethodBean {
        public String name;
        private final Map<String, Object> extra = new HashMap<>();
        @JsonAnySetter
        public void addExtra(String key, Object value) { extra.put(key, value); }
        public Map<String, Object> getExtra() { return extra; }
    }

    static class AnySetterFieldBean {
        public String name;
        @JsonAnySetter
        public Map<String, Object> extra = new HashMap<>();
    }

    static class CollectionGetterBean {
        private final List<String> items = new java.util.ArrayList<>();
        public List<String> getItems() { return items; } // ไม่มี setter
    }

    static class CreatorWithFallbackBean {
        private String name;
        @JsonCreator
        public CreatorWithFallbackBean(@JsonProperty("name") String name) {
            this.name = name;
        }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; } // fallback setter
    }

    @JsonIgnoreType
    static class IgnoredType {
        public String x;
    }

    static class HasIgnoredTypeProp {
        public String name;
        public IgnoredType extra;
    }

    static class ParentF {
        public String name;
        @JsonManagedReference
        public List<ChildF> children;
    }
    static class ChildF {
        public String name;
        @JsonBackReference
        public ParentF parent;
    }

    static class ParentM {
        private String name;
        private List<ChildM> children;
        public String getName() { return name; }
        public void setName(String n) { name = n; }
        @JsonManagedReference
        public List<ChildM> getChildren() { return children; }
        public void setChildren(List<ChildM> c) { children = c; }
    }
    static class ChildM {
        private String name;
        private ParentM parent;
        public String getName() { return name; }
        public void setName(String n) { name = n; }
        public ParentM getParent() { return parent; }
        @JsonBackReference
        public void setParent(ParentM p) { this.parent = p; }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
    static class NodeDefaultGen {
        public int id;
        public String name;
        public NodeDefaultGen next;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    static class NodePropGen {
        public int id;
        public String name;
        public NodePropGen next;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "missingProp")
    static class NodeBadPropGen {
        public int id;
        public String name;
    }

    static class InjectBean {
        @JacksonInject
        public String injected;
        public String name;
    }

    static class ViewMarkerA {}
    static class ViewedBean {
        public String always;
        @JsonView(ViewMarkerA.class)
        public String onlyInA;
    }

    static abstract class AbstractThing {
        public String name;
    }

    static class MyException extends Exception {
        private static final long serialVersionUID = 1L;
        @JsonCreator
        public MyException(@JsonProperty("message") String message) {
            super(message);
        }
    }

    static class ModBean { public String name; }

    // ===================================================================
    // Helper (reflection) - ไม่ผูกกับ declaring class เจาะจง เพื่อไม่เดา visibility
    // ===================================================================

    private static DeserializerFactoryConfig getFactoryConfig(BeanDeserializerFactory f) throws Exception {
        Class<?> c = f.getClass();
        while (c != null) {
            try {
                Field field = c.getDeclaredField("_factoryConfig");
                field.setAccessible(true);
                return (DeserializerFactoryConfig) field.get(f);
            } catch (NoSuchFieldException e) {
                c = c.getSuperclass();
            }
        }
        throw new NoSuchFieldException("_factoryConfig not found in hierarchy");
    }

    private static Throwable findCause(Throwable t, Class<? extends Throwable> type) {
        while (t != null) {
            if (type.isInstance(t)) return t;
            t = t.getCause();
        }
        return null;
    }

    // ===================================================================
    // 1) withConfig(...) - ครอบคลุม 3 branch
    // ===================================================================

    @Test
    public void testWithConfig_sameConfigReturnsThis() throws Exception {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        DeserializerFactoryConfig currentConfig = getFactoryConfig(factory);
        DeserializerFactory result = factory.withConfig(currentConfig);
        assertSame("เมื่อ config เดิมเหมือนกัน (==) ควร return this", factory, result);
    }

    @Test
    public void testWithConfig_differentConfigReturnsNewInstance() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        DeserializerFactoryConfig newConfig = new DeserializerFactoryConfig();
        DeserializerFactory result = factory.withConfig(newConfig);
        assertNotSame(factory, result);
        assertTrue(result instanceof BeanDeserializerFactory);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfig_subclassThrowsIllegalStateException() {
        BeanDeserializerFactory subclassInstance =
                new BeanDeserializerFactory(new DeserializerFactoryConfig()) { };
        subclassInstance.withConfig(new DeserializerFactoryConfig());
    }

    // ===================================================================
    // 2) isPotentialBeanType (protected -> เรียกตรงได้เพราะอยู่ package เดียวกัน)
    // ===================================================================

    @Test
    public void testIsPotentialBeanType_normalClassReturnsTrue() {
        assertTrue(BeanDeserializerFactory.instance.isPotentialBeanType(SimpleBean.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_arrayTypeThrows() {
        // หมายเหตุ: พฤติกรรมอ้างอิงจาก ClassUtil.canBeABeanType ซึ่งไม่ได้แสดงใน source
        // ที่ให้มา แต่เป็นพฤติกรรมมาตรฐานที่ทราบของ Jackson (array ไม่ใช่ bean type)
        BeanDeserializerFactory.instance.isPotentialBeanType(String[].class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_localClassThrows() {
        class LocalPojo { public String x; } // local class ประกาศในเมธอด
        // หมายเหตุ: พฤติกรรมอ้างอิงจาก ClassUtil.isLocalType ซึ่งไม่ได้แสดงใน source ที่ให้มา
        BeanDeserializerFactory.instance.isPotentialBeanType(LocalPojo.class);
    }

    // ===================================================================
    // 3) createBeanDeserializer - custom deser / abstract / normal
    // ===================================================================

    @Test
    public void testCreateBeanDeserializer_simpleBean() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean bean = mapper.readValue("{\"id\":5,\"name\":\"hello\"}", SimpleBean.class);
        assertEquals(5, bean.getId());
        assertEquals("hello", bean.getName());
    }

    @Test
    public void testCreateBeanDeserializer_customDeserializerOverride() throws Exception {
        SimpleModule module = new SimpleModule();
        module.addDeserializer(SimpleBean.class, new JsonDeserializer<SimpleBean>() {
            @Override
            public SimpleBean deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                SimpleBean b = new SimpleBean();
                b.setId(999);
                b.setName("CUSTOM");
                return b;
            }
        });
        ObjectMapper mapper = new ObjectMapper().registerModule(module);
        SimpleBean bean = mapper.readValue("{\"id\":1,\"name\":\"n\"}", SimpleBean.class);
        assertEquals(999, bean.getId());
        assertEquals("CUSTOM", bean.getName());
    }

    @Test
    public void testCreateBeanDeserializer_abstractTypeWithoutResolverFails() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue("{\"name\":\"x\"}", AbstractThing.class);
            fail("ควร throw เพราะไม่มี concrete type / materializer สำหรับ abstract type นี้");
        } catch (JsonMappingException e) {
            // คาดหวัง: ไม่สามารถ instantiate abstract type ได้ (builder.buildAbstract())
        } catch (IOException e) {
            fail("คาดหวัง JsonMappingException แต่ได้: " + e.getClass());
        }
    }

    // ===================================================================
    // 4) buildThrowableDeserializer
    // ===================================================================

    @Test
    public void testBuildThrowableDeserializer_customException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"message\":\"boom\",\"localizedMessage\":\"ignored\",\"suppressed\":[]}";
        MyException ex = mapper.readValue(json, MyException.class);
        assertEquals("boom", ex.getMessage());
    }

    // ===================================================================
    // 5) addBeanProps: ignoreUnknown / explicit ignore / strict fail
    // ===================================================================

    @Test
    public void testAddBeanProps_ignoreUnknownTrue_noException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        IgnoreUnknownBean bean = mapper.readValue(
                "{\"name\":\"n\",\"randomUnknown\":123}", IgnoreUnknownBean.class);
        assertEquals("n", bean.name);
    }

    @Test
    public void testAddBeanProps_strictUnknownProperty_throws() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue("{\"name\":\"n\",\"randomUnknown\":123}", StrictBean.class);
            fail("ควร throw เพราะไม่มี ignoreUnknown และ mapper default เข้มงวด");
        } catch (Exception e) {
            assertTrue(e instanceof JsonMappingException || findCause(e, JsonMappingException.class) != null);
        }
    }

    @Test
    public void testAddBeanProps_explicitIgnoredProperty_noException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ExplicitIgnoreBean bean = mapper.readValue(
                "{\"name\":\"n\",\"secret\":\"shh\"}", ExplicitIgnoreBean.class);
        assertEquals("n", bean.name);
    }

    @Test
    public void testAddBeanProps_anySetterMethod() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnySetterMethodBean bean = mapper.readValue(
                "{\"name\":\"n\",\"foo\":\"bar\",\"baz\":42}", AnySetterMethodBean.class);
        assertEquals("n", bean.name);
        assertEquals("bar", bean.getExtra().get("foo"));
        assertEquals(42, bean.getExtra().get("baz"));
    }

    @Test
    public void testAddBeanProps_anySetterField() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnySetterFieldBean bean = mapper.readValue(
                "{\"name\":\"n\",\"foo\":\"bar\"}", AnySetterFieldBean.class);
        assertEquals("n", bean.name);
        assertEquals("bar", bean.extra.get("foo"));
    }

    @Test
    public void testAddBeanProps_useGettersAsSetters_collection() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        CollectionGetterBean bean = mapper.readValue(
                "{\"items\":[\"a\",\"b\"]}", CollectionGetterBean.class);
        assertEquals(2, bean.getItems().size());
        assertTrue(bean.getItems().contains("a"));
        assertTrue(bean.getItems().contains("b"));
    }

    @Test
    public void testAddBeanProps_creatorPropertyWithFallbackSetter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        CreatorWithFallbackBean bean = mapper.readValue(
                "{\"name\":\"x\"}", CreatorWithFallbackBean.class);
        assertEquals("x", bean.getName());
    }

    // ===================================================================
    // 6) filterBeanProps: isIgnorableType via @JsonIgnoreType
    // ===================================================================

    @Test
    public void testFilterBeanProps_ignorableType_propertySkipped() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\":\"n\",\"extra\":{\"x\":\"whatever\",\"unknownField\":123}}";
        HasIgnoredTypeProp bean = mapper.readValue(json, HasIgnoredTypeProp.class);
        assertEquals("n", bean.name);
        assertNull("property ที่ type ถูก @JsonIgnoreType ต้องไม่ถูกตั้งค่าเลย", bean.extra);
    }

    // ===================================================================
    // 7) addReferenceProperties: field-based / method-based back reference
    // ===================================================================

    @Test
    public void testAddReferenceProperties_fieldBased() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\":\"P\",\"children\":[{\"name\":\"C1\"},{\"name\":\"C2\"}]}";
        ParentF p = mapper.readValue(json, ParentF.class);
        assertEquals(2, p.children.size());
        assertSame(p, p.children.get(0).parent);
    }

    @Test
    public void testAddReferenceProperties_methodBased() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\":\"P\",\"children\":[{\"name\":\"C1\"}]}";
        ParentM p = mapper.readValue(json, ParentM.class);
        assertEquals(1, p.getChildren().size());
        assertSame(p, p.getChildren().get(0).getParent());
    }

    // ===================================================================
    // 8) addObjectIdReader: default generator / property generator / invalid property
    // ===================================================================

    @Test
    public void testAddObjectIdReader_defaultGenerator_resolvesCircularRef() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"id\":1,\"name\":\"A\",\"next\":{\"id\":2,\"name\":\"B\",\"next\":1}}";
        NodeDefaultGen a = mapper.readValue(json, NodeDefaultGen.class);
        assertEquals("A", a.name);
        assertEquals("B", a.next.name);
        assertSame("id ควรถูก resolve กลับมาเป็น object เดิม", a, a.next.next);
    }

    @Test
    public void testAddObjectIdReader_propertyGenerator_resolvesCircularRef() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"id\":1,\"name\":\"A\",\"next\":{\"id\":2,\"name\":\"B\",\"next\":1}}";
        NodePropGen a = mapper.readValue(json, NodePropGen.class);
        assertEquals("A", a.name);
        assertSame(a, a.next.next);
    }

    @Test
    public void testAddObjectIdReader_propertyGeneratorInvalidProperty_throws() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue("{\"id\":1,\"name\":\"x\"}", NodeBadPropGen.class);
            fail("ควร throw เพราะ property 'missingProp' ไม่มีอยู่จริงใน bean");
        } catch (Exception e) {
            Throwable cause = findCause(e, IllegalArgumentException.class);
            // หมายเหตุ: exception อาจถูก wrap เป็น JsonMappingException ระหว่างการ resolve
            // deserializer แบบ lazy จึงตรวจสอบทั้ง exception ตรง ๆ และ cause chain
            assertTrue("คาดหวัง IllegalArgumentException ในสายของ exception",
                    (e instanceof IllegalArgumentException) || cause != null);
        }
    }

    // ===================================================================
    // 9) addInjectables
    // ===================================================================

    @Test
    public void testAddInjectables() throws Exception {
        InjectableValues.Std iv = new InjectableValues.Std().addValue(String.class, "INJECTED_VALUE");
        ObjectMapper mapper = new ObjectMapper().setInjectableValues(iv);
        InjectBean bean = mapper.readValue("{\"name\":\"n\"}", InjectBean.class);
        assertEquals("n", bean.name);
        assertEquals("INJECTED_VALUE", bean.injected);
    }

    // ===================================================================
    // 10) Views: views == null (true/false branch) ของ addBeanProps
    // ===================================================================

    @Test
    public void testAddBeanProps_viewsAssigned() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"always\":\"x\",\"onlyInA\":\"y\"}";
        ViewedBean bean = mapper.readerWithView(ViewMarkerA.class)
                .forType(ViewedBean.class).readValue(json);
        assertEquals("x", bean.always);
        assertEquals("y", bean.onlyInA);
        // หมายเหตุ: กรณี NO_VIEWS (เมื่อปิด MapperFeature.DEFAULT_VIEW_INCLUSION) ไม่ได้ทดสอบ
        // เพิ่มเติมเนื่องจาก semantics ที่แน่นอนตอน deserialize ไม่ได้ระบุไว้ใน source ที่ให้มา
    }

    // ===================================================================
    // 11) Deserializer modifiers: updateBuilder / modifyDeserializer
    // ===================================================================

    @Test
    public void testDeserializerModifier_updateBuilderAndModifyDeserializer() throws Exception {
        final boolean[] updateBuilderCalled = {false};
        final boolean[] modifyDeserializerCalled = {false};
        SimpleModule module = new SimpleModule();
        module.setDeserializerModifier(new BeanDeserializerModifier() {
            @Override
            public BeanDeserializerBuilder updateBuilder(DeserializationConfig config,
                    BeanDescription beanDesc, BeanDeserializerBuilder builder) {
                if (beanDesc.getBeanClass() == ModBean.class) {
                    updateBuilderCalled[0] = true;
                }
                return builder;
            }
            @Override
            public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config,
                    BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                if (beanDesc.getBeanClass() == ModBean.class) {
                    modifyDeserializerCalled[0] = true;
                }
                return deserializer;
            }
        });
        ObjectMapper mapper = new ObjectMapper().registerModule(module);
        ModBean bean = mapper.readValue("{\"name\":\"x\"}", ModBean.class);
        assertEquals("x", bean.name);
        assertTrue(updateBuilderCalled[0]);
        assertTrue(modifyDeserializerCalled[0]);
    }

    // ===================================================================
    // 12) checkIllegalTypes: blacklist class name
    // ===================================================================

    @Test
    public void testCheckIllegalTypes_blockedClassName_throws() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue("{\"value\":\"x\"}",
                    org.apache.commons.collections.functors.InvokerTransformer.class);
            fail("ควร throw เพราะชื่อคลาสตรงกับ DEFAULT_NO_DESER_CLASS_NAMES");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage() != null
                    && e.getMessage().contains("prevented for security reasons"));
        } catch (IOException e) {
            fail("คาดหวัง JsonMappingException แต่ได้: " + e.getClass());
        }
    }

    @Test
    public void testCheckIllegalTypes_allowedClassName_noException() throws Exception {
        // กรณี class name ไม่อยู่ใน blacklist -> ต้องผ่านไปตามปกติ (ครอบคลุม branch false)
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean bean = mapper.readValue("{\"id\":1,\"name\":\"n\"}", SimpleBean.class);
        assertNotNull(bean);
    }
}
```

---

## สรุปตาราง Test coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testWithConfig_sameConfigReturnsThis` | `withConfig`: `_factoryConfig == config` → true |
| `testWithConfig_differentConfigReturnsNewInstance` | `withConfig`: config ต่าง, `getClass()==BeanDeserializerFactory.class` → สร้าง instance ใหม่ |
| `testWithConfig_subclassThrowsIllegalStateException` | `withConfig`: `getClass() != BeanDeserializerFactory.class` → throw `IllegalStateException` |
| `testIsPotentialBeanType_normalClassReturnsTrue` | `isPotentialBeanType`: ทุกเงื่อนไข false → return true |
| `testIsPotentialBeanType_arrayTypeThrows` | `isPotentialBeanType`: `canBeABeanType != null` → throw |
| `testIsPotentialBeanType_localClassThrows` | `isPotentialBeanType`: `isLocalType != null` → throw |
| `testCreateBeanDeserializer_simpleBean` | `createBeanDeserializer`: happy path ผ่าน `buildBeanDeserializer` |
| `testCreateBeanDeserializer_customDeserializerOverride` | `createBeanDeserializer`: `custom != null` → return custom |
| `testCreateBeanDeserializer_abstractTypeWithoutResolverFails` | `type.isAbstract()` true, `materializeAbstractType==null`, `buildBeanDeserializer`: `canInstantiate()==false` → `buildAbstract()` |
| `testBuildThrowableDeserializer_customException` | `type.isThrowable()` true, `buildThrowableDeserializer`, `addIgnorable("localizedMessage"/"suppressed"/"message")`, `am != null` (initCause) |
| `testAddBeanProps_ignoreUnknownTrue_noException` | `addBeanProps`: `ignorals != null`, `ignoreAny=true` |
| `testAddBeanProps_strictUnknownProperty_throws` | `addBeanProps`: `ignorals == null` → `ignored=emptySet` |
| `testAddBeanProps_explicitIgnoredProperty_noException` | loop `for propName: ignored` → `builder.addIgnorable` |
| `testAddBeanProps_anySetterMethod` | `anySetterMethod != null` branch |
| `testAddBeanProps_anySetterField` | else-branch: `anySetterField != null` |
| `testAddBeanProps_useGettersAsSetters_collection` | `useGettersAsSetters && hasGetter`, `Collection.isAssignableFrom` true |
| `testAddBeanProps_creatorPropertyWithFallbackSetter` | `hasCreatorProps && hasConstructorParameter`, `cprop != null`, `prop != null → setFallbackSetter` |
| `testFilterBeanProps_ignorableType_propertySkipped` | `filterBeanProps`: `isIgnorableType==true` → `addIgnorable` + `continue` |
| `testAddReferenceProperties_fieldBased` | `addReferenceProperties`: `m instanceof AnnotatedMethod` == false |
| `testAddReferenceProperties_methodBased` | `addReferenceProperties`: `m instanceof AnnotatedMethod` == true |
| `testAddObjectIdReader_defaultGenerator_resolvesCircularRef` | `addObjectIdReader`: else-branch (ไม่ใช่ PropertyGenerator) |
| `testAddObjectIdReader_propertyGenerator_resolvesCircularRef` | `addObjectIdReader`: `implClass==PropertyGenerator.class`, `idProp != null` |
| `testAddObjectIdReader_propertyGeneratorInvalidProperty_throws` | `addObjectIdReader`: `idProp == null` → throw |
| `testAddInjectables` | `addInjectables`: `raw != null`, loop entries |
| `testAddBeanProps_viewsAssigned` | `views == null` ทั้ง true/false (สองพร็อพเพอร์ตี้ในบีนเดียว) |
| `testDeserializerModifier_updateBuilderAndModifyDeserializer` | `_factoryConfig.hasDeserializerModifiers()` == true (ทั้งใน `buildBeanDeserializer` updateBuilder-loop และ modifyDeserializer-loop) |
| `testCheckIllegalTypes_blockedClassName_throws` | `checkIllegalTypes`: `_cfgIllegalClassNames.contains(full)` == true |
| `testCheckIllegalTypes_allowedClassName_noException` | `checkIllegalTypes`: `contains(full)` == false |

**จุดที่ไม่ครอบคลุม/ไม่แน่ใจ (คอมเมนต์กำกับในโค้ด):**
- `ClassUtil.canBeABeanType` / `isProxyType` / `isLocalType` ไม่มี source ให้ตรวจสอบ exact behavior จึงอ้างอิงพฤติกรรมมาตรฐานที่ทราบของ Jackson เท่านั้น
- Branch `views = NO_VIEWS` (เมื่อปิด `MapperFeature.DEFAULT_VIEW_INCLUSION`) ไม่ได้ assert ผลลัพธ์เชิงลึก เนื่องจาก semantics ตอน deserialize ไม่ได้ระบุไว้ใน source ที่ให้มา
- `findStdDeserializer`/`materializeAbstractType` ที่มี `AbstractTypeResolver` จริง ไม่ได้ทดสอบเพราะต้องพึ่ง module เพิ่มเติมที่ไม่มีใน source