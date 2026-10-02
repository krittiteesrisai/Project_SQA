# วิเคราะห์และแนวทางการทดสอบ

`BeanDeserializer` เป็นคลาสภายในของ Jackson-databind ที่มี constructor และ field ภายใน (`_beanProperties`, `_valueInstantiator`, `_objectIdReader`, `_externalTypeIdHandler` ฯลฯ) ที่ผูกกับ `BeanDeserializerBuilder`/`BeanDescription` ซึ่งสร้างยากมากถ้าจะ mock ตรง ๆ ด้วย Mockito

แนวทางที่ **เชื่อถือได้และตรวจจับ fault จริง** คือใช้ `ObjectMapper` (ซึ่งอยู่ใน module เดียวกันกับ `BeanDeserializer` — เป็น source ที่กำลังถูกทดสอบ ไม่ใช่ jar ภายนอก) เพื่อสร้างสถานการณ์ JSON ต่าง ๆ ที่ทำให้ `ObjectMapper` เลือกใช้ `BeanDeserializer` และวิ่งผ่านแต่ละ branch ของ `deserialize()`, `deserializeFromObject()`, `_deserializeUsingPropertyBased()`, `deserializeWithUnwrapped()`, `deserializeWithView()`, `deserializeWithExternalTypeId()`, `_deserializeOther()` ฯลฯ

> **หมายเหตุ (ข้อกำหนด 4):** บาง branch เช่น `deserializeFromEmbedded()`, การเรียก `unwrappingDeserializer()` กรณี subclass ต่างจาก `BeanDeserializer.class`, และการเรียก `withObjectIdReader/withIgnorableProperties` ตรง ๆ ไม่สามารถทดสอบแบบ black-box ผ่าน JSON string ได้ง่าย จึง **ไม่ได้เขียนเทสสำหรับ branch เหล่านี้** และระบุเป็นคอมเมนต์ในโค้ดแทนที่จะเดา behavior

```java
package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;

/**
 * Unit tests สำหรับ com.fasterxml.jackson.databind.deser.BeanDeserializer
 * ทดสอบแบบ black-box ผ่าน ObjectMapper เนื่องจาก constructor ของ
 * BeanDeserializer ต้องพึ่งพา internal builder classes ที่สร้างตรง ๆ ยาก
 */
public class BeanDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    /* ===================== Fixture POJOs ===================== */

    public static class SimpleBean {
        public String name;
        public int age;
    }

    public static class IgnoreUnknownTrueBean {
        @JsonIgnoreProperties(ignoreUnknown = true)
        public String dummy; // not used, class-level annotation below is real one
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class IgnoreUnknownBean {
        public String name;
    }

    public static class AnySetterBean {
        public String name;
        private Map<String, Object> extra = new HashMap<String, Object>();

        @JsonAnySetter
        public void setExtra(String key, Object value) {
            extra.put(key, value);
        }

        public Map<String, Object> getExtra() {
            return extra;
        }
    }

    public static class CreatorBean {
        private final String name;
        private final int age;

        @JsonCreator
        public CreatorBean(@JsonProperty("name") String name, @JsonProperty("age") int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public int getAge() { return age; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreatorBeanIgnoreUnknown {
        private final String name;

        @JsonCreator
        public CreatorBeanIgnoreUnknown(@JsonProperty("name") String name) {
            this.name = name;
        }

        public String getName() { return name; }
    }

    public static class CreatorAnySetterBean {
        private final String name;
        private Map<String, Object> extras = new HashMap<String, Object>();

        @JsonCreator
        public CreatorAnySetterBean(@JsonProperty("name") String name) {
            this.name = name;
        }

        @JsonAnySetter
        public void set(String key, Object value) {
            extras.put(key, value);
        }

        public String getName() { return name; }
        public Map<String, Object> getExtras() { return extras; }
    }

    public static class NameBean {
        public String first;
        public String last;
    }

    public static class UnwrappedBean {
        public String id;
        @JsonUnwrapped
        public NameBean name;
    }

    public static class CreatorUnwrappedBean {
        private final String id;
        @JsonUnwrapped
        public NameBean name;

        @JsonCreator
        public CreatorUnwrappedBean(@JsonProperty("id") String id) {
            this.id = id;
        }

        public String getId() { return id; }
    }

    public static class PublicView {}
    public static class InternalView extends PublicView {}

    public static class ViewBean {
        @JsonView(PublicView.class)
        public String publicField;
        @JsonView(InternalView.class)
        public String internalField;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public static class IdentityBean {
        public int id;
        public String name;
        public IdentityBean ref;
    }

    public static class StringDelegateBean {
        private final String value;
        @JsonCreator
        public StringDelegateBean(String value) { this.value = value; }
        public String getValue() { return value; }
    }

    public static class IntDelegateBean {
        private final int value;
        @JsonCreator
        public IntDelegateBean(int value) { this.value = value; }
        public int getValue() { return value; }
    }

    public static class BooleanDelegateBean {
        private final boolean value;
        @JsonCreator
        public BooleanDelegateBean(boolean value) { this.value = value; }
        public boolean getValue() { return value; }
    }

    public static class Animal2 {
        public String name;
    }

    @JsonTypeName("dog")
    public static class Dog extends Animal2 {
        public String breed;
    }

    public static class ExtTypeWrapper {
        public String id;
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
        @JsonSubTypes({ @JsonSubTypes.Type(value = Dog.class, name = "dog") })
        public Animal2 animal;
        public String type;
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
    @JsonSubTypes({ @JsonSubTypes.Type(value = PolyChild.class, name = "child") })
    public static class PolyBase {
        public String name;
    }

    @JsonTypeName("child")
    public static class PolyChild extends PolyBase {
        public int age;
    }

    @JsonPropertyOrder({ "name", "age" })
    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    public static class ArrayShapeBean {
        public String name;
        public int age;
    }

    /* ===================== Tests ===================== */

    // 1. Vanilla deserialize เส้นทางปกติ: isExpectedStartObjectToken + _vanillaProcessing = true
    @Test
    public void testVanillaDeserialize_SimpleObject() throws Exception {
        SimpleBean bean = mapper.readValue("{\"name\":\"Alice\",\"age\":30}", SimpleBean.class);
        assertEquals("Alice", bean.name);
        assertEquals(30, bean.age);
    }

    // 2. Boundary: empty object -> propName == null ทันที (ไม่มี loop iteration)
    @Test
    public void testVanillaDeserialize_EmptyObject() throws Exception {
        SimpleBean bean = mapper.readValue("{}", SimpleBean.class);
        assertNull(bean.name);
        assertEquals(0, bean.age);
    }

    // 3. Unknown property, default (ignoreAllUnknown=false) -> ต้อง throw
    @Test(expected = UnrecognizedPropertyException.class)
    public void testDeserialize_UnknownProperty_DefaultThrows() throws Exception {
        mapper.readValue("{\"name\":\"Bob\",\"extra\":1}", SimpleBean.class);
    }

    // 4. Unknown property กับ @JsonIgnoreProperties(ignoreUnknown=true) -> handleUnknownVanilla ไม่ throw
    @Test
    public void testDeserialize_UnknownProperty_IgnoredWhenConfigured() throws Exception {
        IgnoreUnknownBean b = mapper.readValue("{\"name\":\"Carl\",\"extra\":1}", IgnoreUnknownBean.class);
        assertEquals("Carl", b.name);
    }

    // 5. Malformed input: type mismatch -> exception ถูก wrap ผ่าน wrapAndThrow()
    @Test(expected = JsonMappingException.class)
    public void testDeserialize_MalformedInput_TypeMismatch() throws Exception {
        mapper.readValue("{\"name\":\"D\",\"age\":\"notanumber\"}", SimpleBean.class);
    }

    // 6. Property-based creator (non-vanilla): _deserializeUsingPropertyBased ปกติ ไม่มี unknown
    @Test
    public void testCreatorBasedDeserialize() throws Exception {
        CreatorBean b = mapper.readValue("{\"name\":\"Eve\",\"age\":25}", CreatorBean.class);
        assertEquals("Eve", b.getName());
        assertEquals(25, b.getAge());
    }

    // 7. Property-based creator + unknown ที่ ignorable -> handleUnknownProperties คืน bean ปกติ
    @Test
    public void testCreatorBasedDeserialize_UnknownProperty_IgnoredWhenConfigured() throws Exception {
        CreatorBeanIgnoreUnknown b = mapper.readValue("{\"name\":\"Fred\",\"extra\":\"x\"}",
                CreatorBeanIgnoreUnknown.class);
        assertEquals("Fred", b.getName());
    }

    // 8. Property-based creator + unknown ที่ไม่ ignorable -> throw ผ่าน handleUnknownProperties
    @Test(expected = UnrecognizedPropertyException.class)
    public void testCreatorBasedDeserialize_UnknownProperty_DefaultThrows() throws Exception {
        mapper.readValue("{\"name\":\"Gina\",\"extra\":\"y\"}", CreatorBean.class);
    }

    // 9. Property-based creator + _anySetter != null branch ใน _deserializeUsingPropertyBased
    @Test
    public void testCreatorBasedDeserialize_AnySetterBuffered() throws Exception {
        CreatorAnySetterBean b = mapper.readValue("{\"name\":\"H\",\"foo\":\"bar\"}", CreatorAnySetterBean.class);
        assertEquals("H", b.getName());
        assertEquals("bar", b.getExtras().get("foo"));
    }

    // 10. AnySetter บน field-based bean (vanilla path -> handleUnknownVanilla เรียก anySetter)
    @Test
    public void testAnySetterOnFieldBasedBean() throws Exception {
        AnySetterBean b = mapper.readValue("{\"name\":\"I\",\"foo\":123}", AnySetterBean.class);
        assertEquals("I", b.name);
        assertEquals(123, b.getExtra().get("foo"));
    }

    // 11. Unwrapped property: deserializeWithUnwrapped(p, ctxt) เส้นทาง field-based
    //    ยังครอบคลุม unwrappingDeserializer() branch getClass()==BeanDeserializer.class -> true โดยอ้อม
    @Test
    public void testUnwrappedProperty() throws Exception {
        UnwrappedBean b = mapper.readValue("{\"id\":\"u1\",\"first\":\"John\",\"last\":\"Doe\"}",
                UnwrappedBean.class);
        assertEquals("u1", b.id);
        assertNotNull(b.name);
        assertEquals("John", b.name.first);
        assertEquals("Doe", b.name.last);
    }

    // 12. Unwrapped + property-based creator -> deserializeUsingPropertyBasedWithUnwrapped()
    @Test
    public void testCreatorBasedUnwrappedProperty() throws Exception {
        CreatorUnwrappedBean b = mapper.readValue("{\"id\":\"c1\",\"first\":\"A\",\"last\":\"B\"}",
                CreatorUnwrappedBean.class);
        assertEquals("c1", b.getId());
        assertNotNull(b.name);
        assertEquals("A", b.name.first);
        assertEquals("B", b.name.last);
    }

    // 13. JsonView: property visible ในมุมมองปัจจุบัน (deserializeWithView, prop.visibleInView == true)
    //     และ property ที่ไม่ visible -> p.skipChildren() branch
    @Test
    public void testJsonViewProcessing() throws Exception {
        ObjectReader reader = mapper.readerWithView(PublicView.class).forType(ViewBean.class);
        ViewBean b = reader.readValue("{\"publicField\":\"pub\",\"internalField\":\"int\"}");
        assertEquals("pub", b.publicField);
        // internalField ถูก @JsonView(InternalView.class) ซึ่งไม่ visible ภายใต้ PublicView -> ต้องเป็น null
        assertNull(b.internalField);
    }

    // 14. ObjectIdReader: self-reference ผ่าน PropertyGenerator (ครอบคลุม _objectIdReader != null check)
    @Test
    public void testObjectIdentitySelfReference() throws Exception {
        String json = "{\"id\":1,\"name\":\"Root\",\"ref\":1}";
        IdentityBean b = mapper.readValue(json, IdentityBean.class);
        assertEquals("Root", b.name);
        assertSame(b, b.ref);
    }

    // 15. External type id handler: deserializeWithExternalTypeId()
    @Test
    public void testExternalTypeIdHandling() throws Exception {
        String json = "{\"id\":\"w1\",\"animal\":{\"name\":\"Rex\",\"breed\":\"Labrador\"},\"type\":\"dog\"}";
        ExtTypeWrapper w = mapper.readValue(json, ExtTypeWrapper.class);
        assertTrue(w.animal instanceof Dog);
        assertEquals("Rex", w.animal.name);
        assertEquals("Labrador", ((Dog) w.animal).breed);
        assertEquals("dog", w.type);
    }

    // 16. deserializeFromString (VALUE_STRING) ผ่าน delegate creator
    @Test
    public void testDelegateCreator_FromString() throws Exception {
        StringDelegateBean b = mapper.readValue("\"hello\"", StringDelegateBean.class);
        assertEquals("hello", b.getValue());
    }

    // 17. deserializeFromNumber (VALUE_NUMBER_INT) ผ่าน delegate creator
    @Test
    public void testDelegateCreator_FromInt() throws Exception {
        IntDelegateBean b = mapper.readValue("42", IntDelegateBean.class);
        assertEquals(42, b.getValue());
    }

    // 18. deserializeFromBoolean (VALUE_TRUE/VALUE_FALSE) ผ่าน delegate creator
    @Test
    public void testDelegateCreator_FromBoolean() throws Exception {
        BooleanDelegateBean b = mapper.readValue("true", BooleanDelegateBean.class);
        assertTrue(b.getValue());
    }

    // 19. START_ARRAY โดยไม่มี creator ที่รองรับ -> deserializeFromArray ต้อง throw
    @Test(expected = JsonMappingException.class)
    public void testDeserializeFromArray_NoCreator_Throws() throws Exception {
        mapper.readValue("[1,2,3]", SimpleBean.class);
    }

    // 20. FIELD_NAME/END_OBJECT case ใน _deserializeOther ผ่าน polymorphic property-based typing
    //     (parser ถูก TypeDeserializer กิน START_OBJECT ไปแล้ว จึงเข้ามาที่ FIELD_NAME โดยตรง)
    //     คาดว่า _vanillaProcessing = true สำหรับ PolyChild -> เข้า branch vanillaDeserialize
    @Test
    public void testFieldNameEntryPoint_ViaPolymorphicType() throws Exception {
        String json = "{\"@type\":\"child\",\"name\":\"J\",\"age\":9}";
        PolyBase result = mapper.readValue(json, PolyBase.class);
        assertTrue(result instanceof PolyChild);
        assertEquals("J", result.name);
        assertEquals(9, ((PolyChild) result).age);
    }

    // 21. deserialize(p, ctxt, bean): merge update ปกติ (isExpectedStartObjectToken=true, prop != null)
    @Test
    public void testMergeUpdate_ExistingBean() throws Exception {
        SimpleBean existing = new SimpleBean();
        existing.name = "Old";
        existing.age = 1;
        SimpleBean merged = mapper.readerForUpdating(existing).readValue("{\"age\":99}");
        assertSame(existing, merged);
        assertEquals("Old", merged.name); // ไม่ถูกแตะ
        assertEquals(99, merged.age);
    }

    // 22. deserialize(p, ctxt, bean): boundary empty object -> propName == null -> return bean ทันที
    @Test
    public void testMergeUpdate_EmptyObject_ReturnsBeanUnchanged() throws Exception {
        SimpleBean existing = new SimpleBean();
        existing.name = "Keep";
        existing.age = 5;
        SimpleBean merged = mapper.readerForUpdating(existing).readValue("{}");
        assertSame(existing, merged);
        assertEquals("Keep", merged.name);
        assertEquals(5, merged.age);
    }

    // 23. asArrayDeserializer(): @JsonFormat(shape=ARRAY) ทำให้ resolve เป็น BeanAsArrayDeserializer
    //     (หมายเหตุ: การ deserialize จริงเกิดขึ้นใน BeanAsArrayDeserializer ไม่ใช่ BeanDeserializer.deserialize()
    //      โดยตรง แต่ยืนยันว่า asArrayDeserializer() สร้าง instance ได้ถูกต้องและไม่ error)
    @Test
    public void testArrayShapeBean_AsArrayDeserializerPath() throws Exception {
        ArrayShapeBean b = mapper.readValue("[\"K\",7]", ArrayShapeBean.class);
        assertEquals("K", b.name);
        assertEquals(7, b.age);
    }

    /*
     * หมายเหตุตามข้อกำหนดที่ 4 (ไม่เดา behavior ที่ไม่มีอยู่ในซอร์ส):
     * - deserializeFromEmbedded(): ต้องใช้ format แบบ binary (Smile/CBOR) หรือ TreeNode ที่มี POJONode
     *   ฝังอยู่ ซึ่งไม่สามารถ trigger ได้ตรงไปตรงมาผ่าน JSON text parser ปกติ จึงไม่ครอบคลุมในชุดนี้
     * - unwrappingDeserializer() กรณี getClass() != BeanDeserializer.class (ต้องมี custom subclass
     *   ของ BeanDeserializer ที่ resolve เข้ามาแทน) ไม่สามารถ trigger ได้โดยไม่สร้าง custom deserializer
     *   เพิ่มเติมนอกซอร์สที่ให้มา จึงไม่ครอบคลุม
     * - withObjectIdReader()/withIgnorableProperties() ถูกเรียกจาก internal resolution logic ของ
     *   Jackson เอง (เช่นตอน resolve ObjectIdReader ใหม่) ซึ่งยากที่จะ trigger แยกจาก flow ปกติ
     *   โดยไม่เข้าถึง internal API จึงไม่มี test แยกเฉพาะ
     */
}
```

## ตารางสรุป Test method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testVanillaDeserialize_SimpleObject | `isExpectedStartObjectToken`=true, `_vanillaProcessing`=true → `vanillaDeserialize`, loop ปกติ, `prop != null` |
| testVanillaDeserialize_EmptyObject | boundary: `hasTokenId(FIELD_NAME)`=false → skip loop ทันที |
| testDeserialize_UnknownProperty_DefaultThrows | `prop == null` → `handleUnknownVanilla` → throw (ignoreAllUnknown=false) |
| testDeserialize_UnknownProperty_IgnoredWhenConfigured | `handleUnknownVanilla` กรณี ignoreAllUnknown=true |
| testDeserialize_MalformedInput_TypeMismatch | exception ภายใน `deserializeAndSet` → `wrapAndThrow` |
| testCreatorBasedDeserialize | `_deserializeUsingPropertyBased`, `creatorProp != null`, buffer.assignParameter=true |
| testCreatorBasedDeserialize_UnknownProperty_IgnoredWhenConfigured | `unknown != null` → `handleUnknownProperties` (ignorable) |
| testCreatorBasedDeserialize_UnknownProperty_DefaultThrows | `unknown != null` → `handleUnknownProperties` throw |
| testCreatorBasedDeserialize_AnySetterBuffered | `_anySetter != null` branch ใน `_deserializeUsingPropertyBased` |
| testAnySetterOnFieldBasedBean | `_anySetter` ผ่าน `handleUnknownVanilla` (field-based) |
| testUnwrappedProperty | `deserializeWithUnwrapped(p,ctxt)`, `_unwrappedPropertyHandler != null`, unwrappingDeserializer() same-class branch |
| testCreatorBasedUnwrappedProperty | `deserializeUsingPropertyBasedWithUnwrapped` |
| testJsonViewProcessing | `deserializeWithView`, `prop.visibleInView` true/false (skipChildren) |
| testObjectIdentitySelfReference | `_objectIdReader != null` check ใน `deserializeFromObject` |
| testExternalTypeIdHandling | `_externalTypeIdHandler != null` → `deserializeWithExternalTypeId` |
| testDelegateCreator_FromString | `_deserializeOther` case `VALUE_STRING` |
| testDelegateCreator_FromInt | `_deserializeOther` case `VALUE_NUMBER_INT` |
| testDelegateCreator_FromBoolean | `_deserializeOther` case `VALUE_TRUE` |
| testDeserializeFromArray_NoCreator_Throws | `_deserializeOther` case `START_ARRAY` → exception |
| testFieldNameEntryPoint_ViaPolymorphicType | `_deserializeOther` case `FIELD_NAME`/`END_OBJECT`, `_vanillaProcessing`=true |
| testMergeUpdate_ExistingBean | `deserialize(p,ctxt,bean)`: `isExpectedStartObjectToken`=true, loop, `prop != null` |
| testMergeUpdate_EmptyObject_ReturnsBeanUnchanged | `deserialize(p,ctxt,bean)`: `propName == null` → return bean ทันที |
| testArrayShapeBean_AsArrayDeserializerPath | `asArrayDeserializer()` creation path |

**ข้อจำกัดที่ระบุในคอมเมนต์ท้ายไฟล์**: `deserializeFromEmbedded`, `unwrappingDeserializer` (custom subclass branch), `withObjectIdReader`/`withIgnorableProperties` เรียกตรง — ไม่สามารถ trigger แบบ black-box ได้อย่างมั่นใจโดยไม่เดา behavior เพิ่มเติม จึงเว้นไว้ตามข้อกำหนดที่ 4