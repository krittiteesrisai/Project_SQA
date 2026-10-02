# BeanSerializerFactoryTest

**หมายเหตุสำคัญก่อนเริ่ม:**
- `BeanSerializerFactory` เป็นคลาสที่ผูกกับ internal ของ Jackson อย่างลึก (ต้องใช้ `SerializerProvider`, `BeanDescription` จริงที่สร้างมาจาก `ObjectMapper`) การ mock ทุกส่วนจะทำให้ทดสอบไม่สะท้อน behavior จริงและเสี่ยงต่อการ "เดา" mock interaction ที่ไม่มีในซอร์ส ดังนั้นผมเลือกวาง test class ไว้ **แพ็กเกจเดียวกัน** (`com.fasterxml.jackson.databind.ser`) เพื่อ (ก) เข้าถึง field `protected` บางตัว (`_factoryConfig`) ได้ตามสิทธิ์ same-package access ของ Java และ (ข) ใช้ `ObjectMapper` จริงเป็นตัวขับให้ `createSerializer/_createSerializer2/constructBeanSerializer/...` ถูกเรียกจริงตาม flow ในซอร์ส (นี่คือแนวทางเดียวกับ test suite จริงของ jackson-databind สำหรับคลาสนี้)
- จุดที่ behavior ภายใน (เช่นการ wrap exception, การ dispatch enum ผ่าน `findBeanSerializer`) ไม่สามารถยืนยันได้ 100% จากซอร์สที่ให้มา จะมีคอมเมนต์กำกับไว้ชัดเจน

```java
package com.fasterxml.jackson.databind.ser;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerFactory;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.util.StdConverter;

// import คลาสเป้าหมาย (แม้อยู่แพ็กเกจเดียวกัน ใส่ไว้ตามข้อกำหนด)
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;

public class BeanSerializerFactoryTest
{
    /* ================================================================
     * Helper POJO / Enum / annotation fixtures
     * ================================================================ */

    static class SimpleBean {
        public int getA() { return 1; }
        public String getB() { return "b"; }
    }

    static class EmptyBean { }

    @JsonPropertyOrder({}) // ทำให้ hasKnownClassAnnotations() = true (มี known annotation)
    static class EmptyBeanWithAnnotation { }

    @JsonIgnoreProperties("ignored")
    static class IgnorePropsBean {
        public String getIgnored() { return "x"; }
        public String getKept()    { return "y"; }
    }

    enum SimpleEnum { A, B }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    static class IdBean {
        public int id;
        public String name;
        public IdBean(int id, String name) { this.id = id; this.name = name; }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "missingProp")
    static class BadIdBean {
        public int id = 1;
    }

    static class ViewPublic {}

    static class ViewBean {
        @JsonView(ViewPublic.class)
        public String getPublicField() { return "pub"; }
        public String getDefaultField() { return "def"; } // ไม่มี @JsonView
    }

    @JsonIgnoreType
    static class IgnoredType {
        public String getX() { return "x"; }
    }

    static class ContainerBean {
        public String getName() { return "n"; }
        public IgnoredType getIgnoredType() { return new IgnoredType(); }
    }

    static class GetterOnlyBean {
        public String getReadOnly() { return "ro"; } // no setter, ไม่มี annotation
        @JsonProperty
        public String getExplicit() { return "ex"; } // explicit inclusion แม้ไม่มี setter
    }

    static class Node {
        public String name;
        @JsonBackReference
        public Node parent;
        public Node(String name) { this.name = name; }
    }

    static class AnyBean {
        public String getName() { return "n"; }
        private Map<String,Object> extra = new LinkedHashMap<String,Object>();
        { extra.put("k1", "v1"); }
        @JsonAnyGetter
        public Map<String,Object> getExtra() { return extra; }
    }

    static class ConvBean {
        public int value;
        public ConvBean(int v) { value = v; }
    }

    static class ConvBeanToStringConverter extends StdConverter<ConvBean, String> {
        @Override
        public String convert(ConvBean v) { return "V:" + v.value; }
    }

    @JsonSerialize(converter = ConvBeanToStringConverter.class)
    static class AnnotatedConvBean extends ConvBean {
        public AnnotatedConvBean(int v) { super(v); }
    }

    /** subclass ที่ไม่ override withConfig -> ควร throw IllegalStateException */
    static class BrokenSubFactory extends BeanSerializerFactory {
        protected BrokenSubFactory(SerializerFactoryConfig config) { super(config); }
    }

    /* ================================================================
     * 1) instance / withConfig
     * ================================================================ */

    @Test
    public void testInstanceSingletonNotNull() {
        assertNotNull(BeanSerializerFactory.instance);
        assertEquals(BeanSerializerFactory.class, BeanSerializerFactory.instance.getClass());
    }

    @Test
    public void testWithConfig_sameConfigReturnsSameInstance() {
        BeanSerializerFactory factory = BeanSerializerFactory.instance;
        // เข้าถึง protected field ได้เพราะ test อยู่ package เดียวกัน (JLS same-package access)
        SerializerFactoryConfig currentConfig = factory._factoryConfig;
        SerializerFactory result = factory.withConfig(currentConfig);
        assertSame("ถ้า config อ้างอิงเดิม ต้อง return this", factory, result);
    }

    @Test
    public void testWithConfig_differentConfigReturnsNewInstance() {
        BeanSerializerFactory factory = BeanSerializerFactory.instance;
        SerializerFactoryConfig newConfig = new SerializerFactoryConfig();
        SerializerFactory result = factory.withConfig(newConfig);
        assertNotSame(factory, result);
        assertTrue(result instanceof BeanSerializerFactory);

        // เรียกซ้ำด้วย config เดิม (ที่ตอนนี้เป็น _factoryConfig ของ instance ใหม่) ต้องได้ instance เดิม (result)
        SerializerFactory result2 = ((BeanSerializerFactory) result).withConfig(newConfig);
        assertSame(result, result2);
    }

    @Test
    public void testWithConfig_subclassThrowsIllegalStateException() {
        BrokenSubFactory sub = new BrokenSubFactory(null);
        SerializerFactoryConfig differentConfig = new SerializerFactoryConfig();
        try {
            sub.withConfig(differentConfig);
            fail("ควร throw IllegalStateException เพราะ subclass ไม่ override withConfig อย่างถูกต้อง");
        } catch (IllegalStateException e) {
            // expected ตาม logic: getClass() != BeanSerializerFactory.class
        }
    }

    /* ================================================================
     * 2) createSerializer / _createSerializer2 - basic paths
     * ================================================================ */

    @Test
    public void testCreateSerializer_simpleBean() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new SimpleBean());
        assertEquals("{\"a\":1,\"b\":\"b\"}", json);
    }

    @Test
    public void testCreateSerializer_containerType_list() throws Exception {
        // ทดสอบ branch: type.isContainerType() == true
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(Arrays.asList("a", "b"));
        assertEquals("[\"a\",\"b\"]", json);
    }

    @Test
    public void testCreateSerializer_containerType_map() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Integer> map = new LinkedHashMap<String,Integer>();
        map.put("x", 1);
        String json = mapper.writeValueAsString(map);
        assertEquals("{\"x\":1}", json);
    }

    @Test
    public void testCreateSerializer_withTypeLevelConverter() throws Exception {
        // ทดสอบ branch: conv != null และ delegateType.hasRawClass(...) == false
        // (จึงต้อง re-introspect beanDesc และ wrap ด้วย StdDelegatingSerializer)
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new AnnotatedConvBean(5));
        assertEquals("\"V:5\"", json);
    }

    @Test
    public void testEnumSerialization() throws Exception {
        // NOTE: ไม่สามารถยืนยัน 100% จากซอร์สที่ให้มาว่า enum ผ่าน findBeanSerializer's
        // "!type.isEnumType()" branch จริงหรือถูกจัดการที่ primary/addon type ก่อนหน้า
        // ทดสอบนี้ยืนยันแค่ผลลัพธ์ end-to-end ว่าไม่ throw และได้ค่าที่ถูกต้อง
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(SimpleEnum.A);
        assertEquals("\"A\"", json);
    }

    /* ================================================================
     * 3) constructBeanSerializer - empty bean handling
     * ================================================================ */

    @Test(expected = JsonMappingException.class)
    public void testConstructBeanSerializer_emptyBean_throwsByDefault() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // FAIL_ON_EMPTY_BEANS enabled by default -> ควร throw
        mapper.writeValueAsString(new EmptyBean());
    }

    @Test
    public void testConstructBeanSerializer_emptyBean_noExceptionWhenFeatureDisabled() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        String json = mapper.writeValueAsString(new EmptyBean());
        assertEquals("{}", json);
    }

    @Test
    public void testConstructBeanSerializer_emptyBeanWithKnownAnnotation_stillNoProps() throws Exception {
        // ทดสอบ branch beanDesc.hasKnownClassAnnotations() == true -> ใช้ builder.createDummy()
        // ผลลัพธ์ที่สังเกตได้จากภายนอกอาจเหมือนกับ EmptyBean ธรรมดา (ไม่มี property ให้ output)
        // เก็บ test นี้ไว้เพื่อ exercise code path นี้แม้ผลลัพธ์สุดท้ายดูคล้ายกัน
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        String json = mapper.writeValueAsString(new EmptyBeanWithAnnotation());
        assertEquals("{}", json);
    }

    /* ================================================================
     * 4) filterBeanProperties (@JsonIgnoreProperties)
     * ================================================================ */

    @Test
    public void testFilterBeanProperties_withJsonIgnoreProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new IgnorePropsBean());
        assertEquals("{\"kept\":\"y\"}", json);
    }

    /* ================================================================
     * 5) constructObjectIdHandler (PropertyGenerator)
     * ================================================================ */

    @Test
    public void testObjectIdHandler_validPropertyGenerator() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new IdBean(1, "foo"));
        assertEquals("{\"id\":1,\"name\":\"foo\"}", json);
    }

    @Test
    public void testObjectIdHandler_invalidPropertyName_throwsException() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValueAsString(new BadIdBean());
            fail("ควร throw exception เพราะ property 'missingProp' ไม่มีอยู่จริง");
        } catch (Exception e) {
            // NOTE: ซอร์สโยน IllegalArgumentException ตรง ๆ (unchecked) จาก constructObjectIdHandler()
            // แต่ไม่สามารถยืนยัน 100% ว่าชั้น SerializerProvider จะ wrap เป็น exception ประเภทอื่นหรือไม่
            // จึงตรวจสอบผ่าน cause-chain message แทนการเช็ค exact type
            Throwable t = e;
            boolean found = false;
            while (t != null) {
                if (t.getMessage() != null && t.getMessage().contains("missingProp")) {
                    found = true;
                    break;
                }
                t = t.getCause();
            }
            assertTrue("คาดหวัง message อ้างถึง property name ที่หาไม่พบ", found);
        }
    }

    /* ================================================================
     * 6) processViews (@JsonView + DEFAULT_VIEW_INCLUSION)
     * ================================================================ */

    @Test
    public void testProcessViews_defaultViewInclusionTrue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // DEFAULT_VIEW_INCLUSION = true (default) -> property ไม่มี view info ก็ยังถูกรวม
        String json = mapper.writerWithView(ViewPublic.class).writeValueAsString(new ViewBean());
        assertEquals("{\"publicField\":\"pub\",\"defaultField\":\"def\"}", json);
    }

    @Test
    public void testProcessViews_defaultViewInclusionFalse() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION);
        String json = mapper.writerWithView(ViewPublic.class).writeValueAsString(new ViewBean());
        assertEquals("{\"publicField\":\"pub\"}", json);
    }

    /* ================================================================
     * 7) removeIgnorableTypes (@JsonIgnoreType)
     * ================================================================ */

    @Test
    public void testRemoveIgnorableTypes_withJsonIgnoreType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new ContainerBean());
        assertEquals("{\"name\":\"n\"}", json);
    }

    /* ================================================================
     * 8) removeSetterlessGetters (REQUIRE_SETTERS_FOR_GETTERS)
     * ================================================================ */

    @Test
    public void testRemoveSetterlessGetters_featureEnabled() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS);
        String json = mapper.writeValueAsString(new GetterOnlyBean());
        // readOnly ไม่มี setter และไม่ explicit -> ถูกลบ, explicit ยังอยู่เพราะ @JsonProperty
        assertEquals("{\"explicit\":\"ex\"}", json);
    }

    @Test
    public void testRemoveSetterlessGetters_featureDisabled_defaultBehavior() throws Exception {
        ObjectMapper mapper = new ObjectMapper(); // REQUIRE_SETTERS_FOR_GETTERS disabled by default
        String json = mapper.writeValueAsString(new GetterOnlyBean());
        assertEquals("{\"readOnly\":\"ro\",\"explicit\":\"ex\"}", json);
    }

    /* ================================================================
     * 9) back reference suppression (findBeanProperties)
     * ================================================================ */

    @Test
    public void testBackReference_excludedFromSerialization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Node parent = new Node("P");
        Node child = new Node("C");
        child.parent = parent;
        String json = mapper.writeValueAsString(child);
        assertEquals("{\"name\":\"C\"}", json);
    }

    /* ================================================================
     * 10) any-getter handling (constructBeanSerializer)
     * ================================================================ */

    @Test
    public void testAnyGetter_included() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new AnyBean());
        assertEquals("{\"name\":\"n\",\"k1\":\"v1\"}", json);
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testInstanceSingletonNotNull` | ตรวจสอบ `instance` static field ไม่ null และ type ถูกต้อง |
| `testWithConfig_sameConfigReturnsSameInstance` | `withConfig`: branch `_factoryConfig == config` → return `this` |
| `testWithConfig_differentConfigReturnsNewInstance` | `withConfig`: branch config ต่างกัน, `getClass()==BeanSerializerFactory.class` → return instance ใหม่ |
| `testWithConfig_subclassThrowsIllegalStateException` | `withConfig`: branch `getClass() != BeanSerializerFactory.class` → throw `IllegalStateException` |
| `testCreateSerializer_simpleBean` | `createSerializer`: ไม่มี annotation serializer, `type==origType` (staticTyping=false), `conv==null`, non-container path ผ่าน `_createSerializer2` → `findBeanSerializer` สำเร็จ |
| `testCreateSerializer_containerType_list` | `_createSerializer2`: branch `type.isContainerType()==true` → `buildContainerSerializer` |
| `testCreateSerializer_containerType_map` | เช่นเดียวกับข้างบนสำหรับ Map |
| `testCreateSerializer_withTypeLevelConverter` | `createSerializer`: branch `conv != null`, `delegateType.hasRawClass(...)==false` (re-introspect + wrap `StdDelegatingSerializer`) |
| `testEnumSerialization` | Path เกี่ยวกับ Enum (คอมเมนต์ระบุความไม่แน่ใจเรื่อง exact branch ภายใน `findBeanSerializer`) |
| `testConstructBeanSerializer_emptyBean_throwsByDefault` | `constructBeanSerializer`: props ว่าง, `hasKnownClassAnnotations()==false` → ผลลัพธ์ null/unknown serializer → throw เมื่อ `FAIL_ON_EMPTY_BEANS` เปิด |
| `testConstructBeanSerializer_emptyBean_noExceptionWhenFeatureDisabled` | เดียวกันแต่ feature ปิด → ไม่ throw |
| `testConstructBeanSerializer_emptyBeanWithKnownAnnotation_stillNoProps` | branch `beanDesc.hasKnownClassAnnotations()==true` → `builder.createDummy()` |
| `testFilterBeanProperties_withJsonIgnoreProperties` | `filterBeanProperties`: `ignored != null && ignored.length>0` → ลบ property ที่ถูก ignore |
| `testObjectIdHandler_validPropertyGenerator` | `constructObjectIdHandler`: branch `implClass==PropertyGenerator.class`, loop หา property เจอ (`i>0`? หรือ `i==0`) |
| `testObjectIdHandler_invalidPropertyName_throwsException` | `constructObjectIdHandler`: loop จนถึง `i==len` → throw `IllegalArgumentException` |
| `testProcessViews_defaultViewInclusionTrue` | `processViews`: `views==null` + `includeByDefault==true` → รวม property; และ branch `viewsFound>0` |
| `testProcessViews_defaultViewInclusionFalse` | `processViews`: `views==null` + `includeByDefault==false` → ไม่รวม property |
| `testRemoveIgnorableTypes_withJsonIgnoreType` | `removeIgnorableTypes`: branch `result.booleanValue()==true` → ลบ property |
| `testRemoveSetterlessGetters_featureEnabled` | `findBeanProperties`/`removeSetterlessGetters`: feature `REQUIRE_SETTERS_FOR_GETTERS` เปิด, branch `!couldDeserialize && !isExplicitlyIncluded` ทั้ง true/false |
| `testRemoveSetterlessGetters_featureDisabled_defaultBehavior` | branch `config.isEnabled(REQUIRE_SETTERS_FOR_GETTERS)==false` → ไม่เรียก `removeSetterlessGetters` เลย |
| `testBackReference_excludedFromSerialization` | `findBeanProperties`: branch `refType != null && refType.isBackReference()` → `continue` (ข้าม property) |
| `testAnyGetter_included` | `constructBeanSerializer`: branch `anyGetter != null` → สร้าง `AnyGetterWriter` |

**ข้อจำกัดที่ต้องระบุ:** เนื่องจาก `BeanSerializerFactory` ทำงานผ่าน internal collaborators ของ Jackson จำนวนมาก (`SerializerProvider`, `BeanDescription`, `AnnotationIntrospector` ฯลฯ) การทดสอบโดยใช้ `ObjectMapper` จริงเป็นวิธีที่ตรวจสอบ behavior ได้แม่นยำที่สุดโดยไม่ต้อง mock/เดา internal interaction ที่ไม่ปรากฏชัดในซอร์สที่ให้มา บาง branch ระดับลึก (เช่น ลำดับการเช็คใน `findSerializerByLookup`/`findSerializerByPrimaryType` ที่อยู่ใน `BasicSerializerFactory` ซึ่งไม่ได้แสดงในซอร์ส) จึงไม่สามารถยืนยัน exact branch ได้ 100% และมีการระบุคอมเมนต์กำกับไว้ในโค้ดแล้ว