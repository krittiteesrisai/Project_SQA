# BeanSerializerFactoryTest.java

**หมายเหตุสำคัญก่อนเริ่ม:** คลาส `BeanSerializerFactory` มี dependency ลึกกับ `SerializerProvider`, `JavaType`, `BeanDescription` ซึ่งเป็นคลาสที่ยากต่อการ mock ตรง ๆ (หลายส่วนเป็น final/complex object graph) จึงเลือกใช้ **ObjectMapper จริง** เพื่อสร้าง config/provider/beanDesc ที่ valid แล้วเรียกเมธอด public/protected ของคลาสเป้าหมายโดยตรง (test class อยู่ package เดียวกัน `com.fasterxml.jackson.databind.ser` เพื่อเข้าถึง protected method ได้) วิธีนี้ทำให้ทดสอบ branch จริงในซอร์สได้ โดยไม่ต้อง mock deep object graph ที่ไม่รู้ internal

จุดที่ไม่มีซอร์สให้ (เช่น `ClassUtil.canBeABeanType`, `BeanSerializerBuilder.build()`, `hasKnownClassAnnotations()`, ค่า default ของ `MapperFeature.DEFAULT_VIEW_INCLUSION`) จะ**คอมเมนต์กำกับว่าเป็นสมมติฐาน**ตามพฤติกรรมที่คาดหวังจาก comment ในซอร์ส ไม่ใช่การเดาแบบไม่มีหลักฐาน

```java
package com.fasterxml.jackson.databind.ser;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.util.StdConverter;

public class BeanSerializerFactoryTest {

    // ---------------------------------------------------------------
    // Helper utilities
    // ---------------------------------------------------------------

    /** ดึง SerializerProvider จริงจาก ObjectMapper (ใช้ reflection เพื่อรองรับหลายเวอร์ชัน) */
    private static SerializerProvider getProvider(ObjectMapper mapper) throws Exception {
        try {
            Method m = ObjectMapper.class.getMethod("getSerializerProviderInstance");
            return (SerializerProvider) m.invoke(mapper);
        } catch (NoSuchMethodException e) {
            Method m = ObjectMapper.class.getDeclaredMethod("_serializerProvider", SerializationConfig.class);
            m.setAccessible(true);
            return (SerializerProvider) m.invoke(mapper, mapper.getSerializationConfig());
        }
    }

    /** ดึงค่า field protected/private ชื่อ _factoryConfig จาก class hierarchy โดย reflection */
    private static SerializerFactoryConfig getFactoryConfig(BeanSerializerFactory factory) throws Exception {
        Class<?> cls = factory.getClass();
        while (cls != null) {
            try {
                Field f = cls.getDeclaredField("_factoryConfig");
                f.setAccessible(true);
                return (SerializerFactoryConfig) f.get(factory);
            } catch (NoSuchFieldException e) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException("_factoryConfig not found in hierarchy");
    }

    private BeanDescription introspect(ObjectMapper mapper, Class<?> type) {
        JavaType jt = mapper.constructType(type);
        return mapper.getSerializationConfig().introspect(jt);
    }

    // ---------------------------------------------------------------
    // Test POJOs
    // ---------------------------------------------------------------

    public static class SimpleBean {
        public String getName() { return "n"; }
        public void setName(String n) {}
    }

    public static class EmptyBean {
        // ไม่มี getter/setter, ไม่มี annotation ใด ๆ
    }

    public static class GetterOnlyBean {
        public String getValue() { return "v"; }
        // ไม่มี setter -> couldDeserialize() = false
    }

    @JsonIgnoreType
    public static class IgnoredType {}

    public static class HolderBean {
        public IgnoredType getIgnored() { return new IgnoredType(); }
        public void setIgnored(IgnoredType t) {}
        public String getKept() { return "k"; }
        public void setKept(String k) {}
    }

    @JsonIgnoreProperties({"secret"})
    public static class FilterBean {
        public String getSecret() { return "s"; }
        public void setSecret(String s) {}
        public String getPublicField() { return "p"; }
        public void setPublicField(String p) {}
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public static class IdBeanFound {
        public String getValue() { return "v"; }
        public void setValue(String v) {}
        public int getId() { return 1; }
        public void setId(int id) {}
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "missing")
    public static class IdBeanMissing {
        public String getValue() { return "v"; }
        public void setValue(String v) {}
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    public static class IdBeanDefaultGenerator {
        public String getValue() { return "v"; }
        public void setValue(String v) {}
    }

    public static class TypeIdBean {
        @JsonTypeId
        public String getTypeId() { return "T"; }
        public String getOther() { return "o"; }
    }

    public static class ChildBean {
        @JsonBackReference
        public ParentBean getParent() { return null; }
        public String getName() { return "c"; }
    }

    public static class ParentBean {
        @JsonManagedReference
        public java.util.List<ChildBean> getChildren() { return null; }
    }

    public static class ViewA {}

    public static class ViewBean {
        @JsonView(ViewA.class)
        public String getViewed() { return "vv"; }
        public String getPlain() { return "pp"; }
    }

    public static class NoViewBean {
        public String getA() { return "a"; }
    }

    @JsonSerialize(using = CustomBeanSerializer.class)
    public static class AnnotatedSerBean {
        public String getX() { return "x"; }
    }

    public static class CustomBeanSerializer extends JsonSerializer<AnnotatedSerBean> {
        @Override
        public void serialize(AnnotatedSerBean value, com.fasterxml.jackson.core.JsonGenerator gen,
                SerializerProvider provider) throws java.io.IOException {
            gen.writeString("custom");
        }
    }

    @JsonSerialize(converter = ConverterBean.ToStringConverter.class)
    public static class ConverterBean {
        private final int value;
        public ConverterBean(int value) { this.value = value; }
        public int getValue() { return value; }
        public static class ToStringConverter extends StdConverter<ConverterBean, String> {
            @Override
            public String convert(ConverterBean value) { return "V:" + value.getValue(); }
        }
    }

    public static class AnyGetterBean {
        private Map<String, Object> extra = new HashMap<String, Object>();
        public AnyGetterBean() { extra.put("dyn", "value"); }
        @JsonAnyGetter
        public Map<String, Object> getExtra() { return extra; }
        public String getFixed() { return "f"; }
    }

    public static class TypedPropBean {
        @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY)
        public Object getData() { return "abc"; }
        public void setData(Object d) {}
    }

    // ---------------------------------------------------------------
    // 1) Singleton / withConfig / customSerializers
    // ---------------------------------------------------------------

    @Test
    public void testSingletonInstanceNotNull() {
        assertNotNull(BeanSerializerFactory.instance);
        assertEquals(BeanSerializerFactory.class, BeanSerializerFactory.instance.getClass());
    }

    @Test
    public void testWithConfig_sameConfigReturnsSameInstance() throws Exception {
        SerializerFactoryConfig currentCfg = getFactoryConfig(BeanSerializerFactory.instance);
        SerializerFactory result = BeanSerializerFactory.instance.withConfig(currentCfg);
        assertSame(BeanSerializerFactory.instance, result);
    }

    @Test
    public void testWithConfig_differentConfigReturnsNewInstance() throws Exception {
        SerializerFactoryConfig newCfg = new SerializerFactoryConfig();
        SerializerFactory result = BeanSerializerFactory.instance.withConfig(newCfg);
        assertNotSame(BeanSerializerFactory.instance, result);
        assertTrue(result instanceof BeanSerializerFactory);
        assertSame(newCfg, getFactoryConfig((BeanSerializerFactory) result));
    }

    @Test
    public void testWithConfig_subclassThrowsIllegalStateException() {
        class SubFactory extends BeanSerializerFactory {
            protected SubFactory(SerializerFactoryConfig config) { super(config); }
        }
        SubFactory sub = new SubFactory(null);
        SerializerFactoryConfig diffCfg = new SerializerFactoryConfig();
        try {
            sub.withConfig(diffCfg);
            fail("Expected IllegalStateException for subclass not overriding withConfig");
        } catch (IllegalStateException expected) {
            // ok
        }
    }

    @Test
    public void testCustomSerializers_returnsFactoryConfigSerializers() {
        SerializerFactoryConfig cfg = new SerializerFactoryConfig();
        BeanSerializerFactory factory = new BeanSerializerFactory(cfg);
        Iterable<Serializers> result = factory.customSerializers();
        assertSame(cfg.serializers(), result);
    }

    // ---------------------------------------------------------------
    // 2) isPotentialBeanType
    // ---------------------------------------------------------------

    @Test
    public void testIsPotentialBeanType_regularBean_true() {
        assertTrue(BeanSerializerFactory.instance.isPotentialBeanType(SimpleBean.class));
    }

    @Test
    public void testIsPotentialBeanType_arrayType_false() {
        // สมมติฐาน: ClassUtil.canBeABeanType คาดว่าไม่ถือ array เป็น bean-able type
        // (ไม่มีซอร์สของ ClassUtil ให้ตรวจสอบตรง ๆ)
        assertFalse(BeanSerializerFactory.instance.isPotentialBeanType(int[].class));
    }

    @Test
    public void testIsPotentialBeanType_enumType_false() {
        // ยืนยันจาก comment ในซอร์ส: findBeanSerializer ต้อง "allow" enum เป็นพิเศษ
        // เพราะปกติ isPotentialBeanType(EnumClass) จะเป็น false
        assertFalse(BeanSerializerFactory.instance.isPotentialBeanType(SimpleEnumForTest.class));
    }

    public enum SimpleEnumForTest { A, B }

    // ---------------------------------------------------------------
    // 3) findBeanSerializer
    // ---------------------------------------------------------------

    @Test
    public void testFindBeanSerializer_nonBeanNonEnum_returnsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType arrType = mapper.constructType(int[].class);
        BeanDescription desc = mapper.getSerializationConfig().introspect(arrType);
        SerializerProvider provider = getProvider(mapper);

        JsonSerializer<Object> ser = BeanSerializerFactory.instance.findBeanSerializer(provider, arrType, desc);
        assertNull(ser);
    }

    @Test
    public void testFindBeanSerializer_enumType_doesNotShortCircuit() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType enumType = mapper.constructType(SimpleEnumForTest.class);
        BeanDescription desc = mapper.getSerializationConfig().introspect(enumType);
        SerializerProvider provider = getProvider(mapper);

        // ไม่ assert ค่าที่แน่ชัด (อาจ null หรือ non-null ตามจำนวน property)
        // สิ่งที่ทดสอบคือ branch "!type.isEnumType()" เป็น false จึงไม่ return null ทันที
        // และ method ทำงานได้โดยไม่ throw exception
        try {
            BeanSerializerFactory.instance.findBeanSerializer(provider, enumType, desc);
        } catch (Exception e) {
            fail("findBeanSerializer should not throw for enum type: " + e);
        }
    }

    // ---------------------------------------------------------------
    // 4) constructBeanSerializer
    // ---------------------------------------------------------------

    @Test
    public void testConstructBeanSerializer_objectClass_returnsUnknownTypeSerializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDescription desc = introspect(mapper, Object.class);
        SerializerProvider provider = getProvider(mapper);

        JsonSerializer<Object> ser = BeanSerializerFactory.instance.constructBeanSerializer(provider, desc);
        assertNotNull(ser);
    }

    @Test
    public void testConstructBeanSerializer_simpleBean_returnsNonNullSerializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDescription desc = introspect(mapper, SimpleBean.class);
        SerializerProvider provider = getProvider(mapper);

        JsonSerializer<Object> ser = BeanSerializerFactory.instance.constructBeanSerializer(provider, desc);
        assertNotNull(ser);
        assertTrue(ser instanceof BeanSerializerBase);
    }

    @Test
    public void testConstructBeanSerializer_emptyBeanNoAnnotations_returnsNull() throws Exception {
        // ตามคอมเมนต์ในซอร์ส: ถ้าไม่มี property และไม่มี known class annotation -> คืน null
        ObjectMapper mapper = new ObjectMapper();
        BeanDescription desc = introspect(mapper, EmptyBean.class);
        SerializerProvider provider = getProvider(mapper);

        JsonSerializer<Object> ser = BeanSerializerFactory.instance.constructBeanSerializer(provider, desc);
        assertNull(ser);
    }

    // ---------------------------------------------------------------
    // 5) findBeanProperties: typeId / backreference / ignore-type / setterless
    // ---------------------------------------------------------------

    @Test
    public void testFindBeanProperties_typeIdPropertySkippedFromResult() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDescription desc = introspect(mapper, TypeIdBean.class);
        SerializerProvider provider = getProvider(mapper);
        BeanSerializerBuilder builder = BeanSerializerFactory.instance.constructBeanSerializerBuilder(desc);
        builder.setConfig(mapper.getSerializationConfig());

        List<BeanPropertyWriter> props = BeanSerializerFactory.instance.findBeanProperties(provider, desc, builder);
        assertNotNull(props);
        for (BeanPropertyWriter w : props) {
            assertNotEquals("typeId", w.getName());
        }
    }

    @Test
    public void testFindBeanProperties_backReferenceSkipped() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDescription desc = introspect(mapper, ChildBean.class);
        SerializerProvider provider = getProvider(mapper);
        BeanSerializerBuilder builder = BeanSerializerFactory.instance.constructBeanSerializerBuilder(desc);
        builder.setConfig(mapper.getSerializationConfig());

        List<BeanPropertyWriter> props = BeanSerializerFactory.instance.findBeanProperties(provider, desc, builder);
        assertNotNull(props);
        for (BeanPropertyWriter w : props) {
            assertNotEquals("parent", w.getName());
        }
    }

    @Test
    public void testFindBeanProperties_ignoreTypeRemoved() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDescription desc = introspect(mapper, HolderBean.class);
        SerializerProvider provider = getProvider(mapper);
        BeanSerializerBuilder builder = BeanSerializerFactory.instance.constructBeanSerializerBuilder(desc);
        builder.setConfig(mapper.getSerializationConfig());

        List<BeanPropertyWriter> props = BeanSerializerFactory.instance.findBeanProperties(provider, desc, builder);
        assertNotNull(props);
        boolean hasKept = false;
        for (BeanPropertyWriter w : props) {
            assertNotEquals("ignored", w.getName());
            if ("kept".equals(w.getName())) hasKept = true;
        }
        assertTrue(hasKept);
    }

    @Test
    public void testFindBeanProperties_requireSettersForGetters_removesGetterOnly() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS, true);
        BeanDescription desc = introspect(mapper, GetterOnlyBean.class);
        SerializerProvider provider = getProvider(mapper);
        BeanSerializerBuilder builder = BeanSerializerFactory.instance.constructBeanSerializerBuilder(desc);
        builder.setConfig(mapper.getSerializationConfig());

        List<BeanPropertyWriter> props = BeanSerializerFactory.instance.findBeanProperties(provider, desc, builder);
        // ไม่มี setter -> ควรถูกลบทิ้ง -> properties() ควร empty -> findBeanProperties return null
        assertNull(props);
    }

    @Test
    public void testFindBeanProperties_withoutRequireSettersForGetters_keepsGetterOnly() throws Exception {
        ObjectMapper mapper = new ObjectMapper(); // REQUIRE_SETTERS_FOR_GETTERS default = false
        BeanDescription desc = introspect(mapper, GetterOnlyBean.class);
        SerializerProvider provider = getProvider(mapper);
        BeanSerializerBuilder builder = BeanSerializerFactory.instance.constructBeanSerializerBuilder(desc);
        builder.setConfig(mapper.getSerializationConfig());

        List<BeanPropertyWriter> props = BeanSerializerFactory.instance.findBeanProperties(provider, desc, builder);
        assertNotNull(props);
        assertEquals(1, props.size());
        assertEquals("value", props.get(0).getName());
    }

    // ---------------------------------------------------------------
    // 6) filterBeanProperties (JsonIgnoreProperties)
    // ---------------------------------------------------------------

    @Test
    public void testFilterBeanProperties_removesIgnoredPropertyByName() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDescription desc = introspect(mapper, FilterBean.class);
        SerializerProvider provider = getProvider(mapper);
        BeanSerializerBuilder builder = BeanSerializerFactory.instance.constructBeanSerializerBuilder(desc);
        builder.setConfig(mapper.getSerializationConfig());

        List<BeanPropertyWriter> props = BeanSerializerFactory.instance.findBeanProperties(provider, desc, builder);
        assertNotNull(props);

        List<BeanPropertyWriter> filtered =
                BeanSerializerFactory.instance.filterBeanProperties(mapper.getSerializationConfig(), desc, props);

        for (BeanPropertyWriter w : filtered) {
            assertNotEquals("secret", w.getName());
        }
    }

    // ---------------------------------------------------------------
    // 7) removeOverlappingTypeIds (no-conflict path -> same list returned)
    // ---------------------------------------------------------------

    @Test
    public void testRemoveOverlappingTypeIds_noExternalTypeSerializer_returnsSameList() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDescription desc = introspect(mapper, SimpleBean.class);
        SerializerProvider provider = getProvider(mapper);
        BeanSerializerBuilder builder = BeanSerializerFactory.instance.constructBeanSerializerBuilder(desc);
        builder.setConfig(mapper.getSerializationConfig());

        List<BeanPropertyWriter> props = BeanSerializerFactory.instance.findBeanProperties(provider, desc, builder);
        List<BeanPropertyWriter> result =
                BeanSerializerFactory.instance.removeOverlappingTypeIds(provider, desc, builder, props);
        assertSame(props, result);
    }

    // ---------------------------------------------------------------
    // 8) constructObjectIdHandler
    // ---------------------------------------------------------------

    @Test
    public void testConstructObjectIdHandler_noObjectIdInfo_returnsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDescription desc = introspect(mapper, SimpleBean.class);
        SerializerProvider provider = getProvider(mapper);
        BeanSerializerBuilder builder = BeanSerializerFactory.instance.constructBeanSerializerBuilder(desc);
        builder.setConfig(mapper.getSerializationConfig());

        List<BeanPropertyWriter> props = BeanSerializerFactory.instance.findBeanProperties(provider, desc, builder);
        ObjectIdWriter writer = BeanSerializerFactory.instance.constructObjectIdHandler(provider, desc, props);
        assertNull(writer);
    }

    @Test
    public void testConstructObjectIdHandler_propertyGenerator_found_reordersProps() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDescription desc = introspect(mapper, IdBeanFound.class);
        SerializerProvider provider = getProvider(mapper);
        BeanSerializerBuilder builder = BeanSerializerFactory.instance.constructBeanSerializerBuilder(desc);
        builder.setConfig(mapper.getSerializationConfig());

        List<BeanPropertyWriter> props = BeanSerializerFactory.instance.findBeanProperties(provider, desc, builder);
        assertNotNull(props);

        ObjectIdWriter writer = BeanSerializerFactory.instance.constructObjectIdHandler(provider, desc, props);
        assertNotNull(writer);
        assertEquals("id", props.get(0).getName()); // ต้องถูกย้ายมาไว้ index 0
    }

    @Test
    public void testConstructObjectIdHandler_propertyGenerator_missing_throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDescription desc = introspect(mapper, IdBeanMissing.class);
        SerializerProvider provider = getProvider(mapper);
        BeanSerializerBuilder builder = BeanSerializerFactory.instance.constructBeanSerializerBuilder(desc);
        builder.setConfig(mapper.getSerializationConfig());

        List<BeanPropertyWriter> props = BeanSerializerFactory.instance.findBeanProperties(provider, desc, builder);
        assertNotNull(props);

        try {
            BeanSerializerFactory.instance.constructObjectIdHandler(provider, desc, props);
            fail("Expected IllegalArgumentException for missing id property");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    @Test
    public void testConstructObjectIdHandler_nonPropertyGenerator_returnsWriter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDescription desc = introspect(mapper, IdBeanDefaultGenerator.class);
        SerializerProvider provider = getProvider(mapper);
        BeanSerializerBuilder builder = BeanSerializerFactory.instance.constructBeanSerializerBuilder(desc);
        builder.setConfig(mapper.getSerializationConfig());

        List<BeanPropertyWriter> props = BeanSerializerFactory.instance.findBeanProperties(provider, desc, builder);
        ObjectIdWriter writer = BeanSerializerFactory.instance.constructObjectIdHandler(provider, desc, props);
        assertNotNull(writer);
    }

    // ---------------------------------------------------------------
    // 9) findPropertyTypeSerializer (b==null / b!=null)
    // ---------------------------------------------------------------

    @Test
    public void testFindPropertyTypeSerializer_noAnnotation_returnsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDescription desc = introspect(mapper, SimpleBean.class);
        SerializationConfig config = mapper.getSerializationConfig();

        com.fasterxml.jackson.databind.introspect.AnnotatedMember accessor = findAccessor(desc, "name");
        JavaType baseType = mapper.constructType(String.class);

        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSer =
                BeanSerializerFactory.instance.findPropertyTypeSerializer(baseType, config, accessor);
        assertNull(typeSer);
    }

    @Test
    public void testFindPropertyTypeSerializer_withJsonTypeInfoAnnotation_returnsNonNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDescription desc = introspect(mapper, TypedPropBean.class);
        SerializationConfig config = mapper.getSerializationConfig();

        com.fasterxml.jackson.databind.introspect.AnnotatedMember accessor = findAccessor(desc, "data");
        JavaType baseType = mapper.constructType(Object.class);

        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSer =
                BeanSerializerFactory.instance.findPropertyTypeSerializer(baseType, config, accessor);
        assertNotNull(typeSer);
    }

    private com.fasterxml.jackson.databind.introspect.AnnotatedMember findAccessor(BeanDescription desc, String name) {
        for (com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition p : desc.findProperties()) {
            if (name.equals(p.getName())) {
                return p.getAccessor();
            }
        }
        fail("property '" + name + "' not found");
        return null;
    }

    // ---------------------------------------------------------------
    // 10) Integration via ObjectMapper: createSerializer branches
    // ---------------------------------------------------------------

    @Test
    public void testCreateSerializer_simpleBean_viaObjectMapper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new SimpleBean());
        assertTrue(json.contains("name"));
    }

    @Test
    public void testCreateSerializer_classLevelAnnotatedSerializer_shortCircuits() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new AnnotatedSerBean());
        assertEquals("\"custom\"", json);
    }

    @Test
    public void testCreateSerializer_withConverter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new ConverterBean(5));
        assertEquals("\"V:5\"", json);
    }

    @Test
    public void testCreateSerializer_anyGetterBean() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new AnyGetterBean());
        assertTrue(json.contains("dyn"));
        assertTrue(json.contains("fixed"));
    }

    // ---------------------------------------------------------------
    // 11) processViews branches ผ่าน public API (writerWithView)
    // ---------------------------------------------------------------

    @Test
    public void testProcessViews_includeByDefaultTrue_includesNonAnnotatedProp() throws Exception {
        ObjectMapper mapper = new ObjectMapper()
                .configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
        String json = mapper.writerWithView(ViewA.class).writeValueAsString(new ViewBean());
        assertTrue(json.contains("viewed"));
        assertTrue(json.contains("plain"));
    }

    @Test
    public void testProcessViews_includeByDefaultFalse_excludesNonAnnotatedProp() throws Exception {
        ObjectMapper mapper = new ObjectMapper()
                .configure(MapperFeature.DEFAULT_VIEW_INCLUSION, false);
        String json = mapper.writerWithView(ViewA.class).writeValueAsString(new ViewBean());
        assertTrue(json.contains("viewed"));
        assertFalse(json.contains("plain"));
    }

    @Test
    public void testProcessViews_noViewAnnotationsAtAll_stillSerializesNormally() throws Exception {
        // ทดสอบ branch early-return (includeByDefault && viewsFound==0) แบบ black-box:
        // ยืนยันว่าการไม่ตั้ง filteredProperties ไม่กระทบการ serialize ปกติ (ไม่ผ่าน view)
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new NoViewBean());
        assertTrue(json.contains("\"a\""));
    }
}
```

## ตารางสรุป Test coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testSingletonInstanceNotNull` | ตรวจ static field `instance` ถูกสร้างถูกต้อง |
| `testWithConfig_sameConfigReturnsSameInstance` | `withConfig`: `_factoryConfig == config` → return `this` |
| `testWithConfig_differentConfigReturnsNewInstance` | `withConfig`: config ต่างกัน, `getClass()==BeanSerializerFactory.class` → new instance |
| `testWithConfig_subclassThrowsIllegalStateException` | `withConfig`: `getClass()!=BeanSerializerFactory.class` → throw `IllegalStateException` |
| `testCustomSerializers_returnsFactoryConfigSerializers` | `customSerializers()` return `_factoryConfig.serializers()` |
| `testIsPotentialBeanType_regularBean_true` / `_arrayType_false` / `_enumType_false` | `isPotentialBeanType` เงื่อนไข canBeABeanType/isProxyType (สมมติฐานตาม ClassUtil) |
| `testFindBeanSerializer_nonBeanNonEnum_returnsNull` | `findBeanSerializer`: `!isPotentialBeanType && !isEnumType` → return null |
| `testFindBeanSerializer_enumType_doesNotShortCircuit` | `findBeanSerializer`: bypass null-return เมื่อเป็น enum |
| `testConstructBeanSerializer_objectClass_returnsUnknownTypeSerializer` | `constructBeanSerializer`: `beanClass==Object.class` branch |
| `testConstructBeanSerializer_simpleBean_returnsNonNullSerializer` | สร้าง serializer ปกติผ่าน properties จริง |
| `testConstructBeanSerializer_emptyBeanNoAnnotations_returnsNull` | `ser==null && !hasKnownClassAnnotations` → return null |
| `testFindBeanProperties_typeIdPropertySkippedFromResult` | `property.isTypeId()` → `continue` (ไม่เข้า list) |
| `testFindBeanProperties_backReferenceSkipped` | `refType.isBackReference()` → `continue` |
| `testFindBeanProperties_ignoreTypeRemoved` | `removeIgnorableTypes`: property ถูกลบเมื่อ type มี `@JsonIgnoreType` |
| `testFindBeanProperties_requireSettersForGetters_removesGetterOnly` | `REQUIRE_SETTERS_FOR_GETTERS=true` → `removeSetterlessGetters` ลบ property, properties.isEmpty() → return null |
| `testFindBeanProperties_withoutRequireSettersForGetters_keepsGetterOnly` | flag=false → ไม่ลบ property |
| `testFilterBeanProperties_removesIgnoredPropertyByName` | `filterBeanProperties`: ignored != null && length>0 branch |
| `testRemoveOverlappingTypeIds_noExternalTypeSerializer_returnsSameList` | loop ไม่มี `As.EXTERNAL_PROPERTY` → `continue` ทุกตัว, คืน list เดิม |
| `testConstructObjectIdHandler_noObjectIdInfo_returnsNull` | `objectIdInfo==null` → return null |
| `testConstructObjectIdHandler_propertyGenerator_found_reordersProps` | `implClass==PropertyGenerator`, พบ property, `i>0` → reorder |
| `testConstructObjectIdHandler_propertyGenerator_missing_throws` | loop ถึง `i==len` → throw `IllegalArgumentException` |
| `testConstructObjectIdHandler_nonPropertyGenerator_returnsWriter` | branch else (ไม่ใช่ PropertyGenerator) |
| `testFindPropertyTypeSerializer_noAnnotation_returnsNull` | `b==null` → `createTypeSerializer` |
| `testFindPropertyTypeSerializer_withJsonTypeInfoAnnotation_returnsNonNull` | `b!=null` → `buildTypeSerializer` |
| `testCreateSerializer_simpleBean_viaObjectMapper` | `createSerializer` non-container/bean path (integration) |
| `testCreateSerializer_classLevelAnnotatedSerializer_shortCircuits` | `findSerializerFromAnnotation != null` → early return |
| `testCreateSerializer_withConverter` | branch `conv != null`, `StdDelegatingSerializer` |
| `testCreateSerializer_anyGetterBean` | `anyGetter != null` branch ใน `constructBeanSerializer` |
| `testProcessViews_includeByDefaultTrue_includesNonAnnotatedProp` | `processViews`: `views==null && includeByDefault=true` |
| `testProcessViews_includeByDefaultFalse_excludesNonAnnotatedProp` | `processViews`: `views==null && includeByDefault=false` |
| `testProcessViews_noViewAnnotationsAtAll_stillSerializesNormally` | early-return `includeByDefault && viewsFound==0` (black-box) |

**ข้อจำกัด/สมมติฐานที่ต้องระวัง:** พฤติกรรมของ `ClassUtil.canBeABeanType`, `BeanSerializerBuilder.build()` เมื่อไม่มี properties, และ `BeanDescription.hasKnownClassAnnotations()` ไม่มีซอร์สให้ตรวจสอบตรง ๆ ในไฟล์ที่ให้มา จึงอนุมานจาก comment ในซอร์ส `BeanSerializerFactory` เท่านั้น หากพฤติกรรมจริงต่างจากที่คอมเมนต์ อาจต้องปรับ assertion ในเทสที่เกี่ยวข้อง