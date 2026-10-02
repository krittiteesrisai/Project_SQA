package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.BeanDeserializer; // target class (ใช้งานผ่าน ObjectMapper)
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;

/**
 * Unit tests มุ่งเน้น branch coverage ของ {@link BeanDeserializer}
 * โดยขับผ่าน {@link ObjectMapper} เนื่องจาก constructor ของคลาสเป้าหมาย
 * ต้องการ object ภายในของ Jackson (BeanDeserializerBuilder, BeanPropertyMap ฯลฯ)
 * ที่ไม่สามารถสร้างตรง ๆ ได้อย่างสมเหตุสมผลในหน่วยทดสอบ
 */
public class BeanDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ---------------------------------------------------------------
    // POJOs ที่ใช้ร่วมกัน
    // ---------------------------------------------------------------

    public static class SimpleBean {
        public String name;
        public int age;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class IgnoreUnknownBean {
        public String name;
    }

    public static class StrictBean {
        public String name;
    }

    public static class StringCreatorBean {
        public final String value;
        @JsonCreator
        public StringCreatorBean(String value) { this.value = value; }
    }

    public static class IntCreatorBean {
        public final int value;
        @JsonCreator
        public IntCreatorBean(int value) { this.value = value; }
    }

    public static class DoubleCreatorBean {
        public final double value;
        @JsonCreator
        public DoubleCreatorBean(double value) { this.value = value; }
    }

    public static class BooleanCreatorBean {
        public final boolean value;
        @JsonCreator
        public BooleanCreatorBean(boolean value) { this.value = value; }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
    public static class IdentityBean {
        public int id;
        public String name;
    }

    // ใช้สำหรับทดสอบ forward-reference (BeanReferring) - ดูคอมเมนต์ในเทสเคส
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public static class RefNode {
        public final int id;
        public final String name;
        public RefNode next;

        @JsonCreator
        public RefNode(@JsonProperty("id") int id, @JsonProperty("name") String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static class Views {
        public static class Public {}
        public static class Private extends Public {}
    }

    public static class ViewBean {
        @JsonView(Views.Public.class)
        public String publicField;
        @JsonView(Views.Private.class)
        public String privateField;
    }

    public static class Address {
        public String city;
        public String zip;
    }

    public static class UnwrappedBean {
        public String name;
        @JsonUnwrapped
        public Address address;
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "petType")
    @JsonSubTypes({ @JsonSubTypes.Type(value = Dog.class, name = "dog") })
    public static abstract class Animal {}

    public static class Dog extends Animal {
        public String bark;
    }

    public static class ExternalTypeBean {
        public String name;
        public Animal pet;
        public String petType;
    }

    public static class InjectBean {
        @JacksonInject("svc")
        public String service;
        public String name;
    }

    public static class CreatorBean {
        public final String a;
        public final int b;
        public final Map<String, Object> extra = new HashMap<String, Object>();

        @JsonCreator
        public CreatorBean(@JsonProperty("a") String a, @JsonProperty("b") int b) {
            this.a = a;
            this.b = b;
        }

        @JsonIgnoreProperties // marker (ignorable names กำหนดที่ class-level ด้านล่างแทน)
        @JsonAnySetter
        public void setExtra(String key, Object value) {
            extra.put(key, value);
        }
    }

    @JsonIgnoreProperties({ "ignoredProp" })
    public static class CreatorBean2 {
        public final String a;
        public final int b;
        public transient String anySetterKey;
        public transient Object anySetterValue;

        @JsonCreator
        public CreatorBean2(@JsonProperty("a") String a, @JsonProperty("b") int b) {
            this.a = a;
            this.b = b;
        }

        @JsonAnySetter
        public void any(String key, Object value) {
            anySetterKey = key;
            anySetterValue = value;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreatorBean3 {
        public final String a;
        public final int b;

        @JsonCreator
        public CreatorBean3(@JsonProperty("a") String a, @JsonProperty("b") int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static class CreatorBean4 {
        public final String a;
        public final int b;

        @JsonCreator
        public CreatorBean4(@JsonProperty("a") String a, @JsonProperty("b") int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static class CreatorBeanSimple {
        public final String a;
        public final int b;

        @JsonCreator
        public CreatorBeanSimple(@JsonProperty("a") String a, @JsonProperty("b") int b) {
            this.a = a;
            this.b = b;
        }
    }

    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    public static class ArrayShapeBean {
        public String a;
        public int b;
    }

    // ---------------------------------------------------------------
    // 1) Vanilla path (deserialize(p,ctxt) -> vanillaDeserialize)
    // ---------------------------------------------------------------

    @Test
    public void testVanillaDeserialize_NormalOrder() throws Exception {
        String json = "{\"name\":\"Alice\",\"age\":30}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        assertEquals("Alice", bean.name);
        assertEquals(30, bean.age);
    }

    @Test
    public void testVanillaDeserialize_BoundaryIntValue() throws Exception {
        String json = "{\"name\":\"Edge\",\"age\":" + Integer.MAX_VALUE + "}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        assertEquals(Integer.MAX_VALUE, bean.age);
    }

    @Test
    public void testVanillaDeserialize_NullFieldValue() throws Exception {
        String json = "{\"name\":null,\"age\":5}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        assertNull(bean.name);
        assertEquals(5, bean.age);
    }

    @Test
    public void testDeserialize_EmptyObject_ReturnsDefaultBean() throws Exception {
        // "{}" -> nextToken() = END_OBJECT -> p.hasTokenId(FIELD_NAME) เป็น false ใน vanillaDeserialize
        SimpleBean bean = mapper.readValue("{}", SimpleBean.class);
        assertNotNull(bean);
        assertNull(bean.name);
        assertEquals(0, bean.age);
    }

    // ---------------------------------------------------------------
    // 2) Unknown property handling
    // ---------------------------------------------------------------

    @Test
    public void testDeserialize_UnknownProperty_Ignored() throws Exception {
        String json = "{\"name\":\"Bob\",\"extra\":\"ignored\"}";
        IgnoreUnknownBean bean = mapper.readValue(json, IgnoreUnknownBean.class);
        assertEquals("Bob", bean.name);
    }

    @Test(expected = UnrecognizedPropertyException.class)
    public void testDeserialize_UnknownProperty_Throws() throws Exception {
        String json = "{\"name\":\"Bob\",\"extra\":\"x\"}";
        mapper.readValue(json, StrictBean.class);
    }

    // ---------------------------------------------------------------
    // 3) Malformed / empty input
    // ---------------------------------------------------------------

    @Test(expected = JsonProcessingException.class)
    public void testDeserialize_EmptyInput_Throws() throws Exception {
        mapper.readValue("", SimpleBean.class);
    }

    @Test(expected = JsonProcessingException.class)
    public void testDeserialize_MalformedJson_Throws() throws Exception {
        mapper.readValue("{\"name\":\"A\"", SimpleBean.class);
    }

    // ---------------------------------------------------------------
    // 4) _deserializeOther: switch-case ต่าง ๆ
    // ---------------------------------------------------------------

    @Test
    public void testDeserializeFromString_UsesCreator() throws Exception {
        StringCreatorBean bean = mapper.readValue("\"hello\"", StringCreatorBean.class);
        assertEquals("hello", bean.value);
    }

    @Test
    public void testDeserializeFromNumberInt_UsesCreator() throws Exception {
        IntCreatorBean bean = mapper.readValue("42", IntCreatorBean.class);
        assertEquals(42, bean.value);
    }

    @Test
    public void testDeserializeFromDouble_UsesCreator() throws Exception {
        DoubleCreatorBean bean = mapper.readValue("3.14", DoubleCreatorBean.class);
        assertEquals(3.14, bean.value, 0.0001);
    }

    @Test
    public void testDeserializeFromBoolean_UsesCreator() throws Exception {
        BooleanCreatorBean bean = mapper.readValue("true", BooleanCreatorBean.class);
        assertTrue(bean.value);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeFromArray_ThrowsWithoutDelegatingCreator() throws Exception {
        // START_ARRAY -> deserializeFromArray -> ไม่มี delegating creator -> ควร throw
        mapper.readValue("[1,2,3]", SimpleBean.class);
    }

    // หมายเหตุ: deserializeFromNull (VALUE_NULL) ไม่ได้ทดสอบตรง เพราะ ObjectMapper
    // จะ intercept token VALUE_NULL ที่ระดับบนด้วย deser.getNullValue(ctxt) ก่อนเรียก
    // deserialize(p,ctxt) เสมอ (ไม่ใช่พฤติกรรมที่แสดงในซอร์สของคลาสนี้) จึงไม่สามารถ
    // สร้างเงื่อนไขให้ไปถึง branch นี้ได้อย่างน่าเชื่อถือโดยไม่เดา internal behavior อื่น ๆ
    // (ตามคอมเมนต์ในซอร์ส กรณีนี้เกิดเฉพาะ XML empty-tag เท่านั้น)

    // หมายเหตุ: deserializeFromEmbedded (VALUE_EMBEDDED_OBJECT) และ default-case ของ switch
    // (เช่น END_ARRAY ที่ root) ไม่ได้ทดสอบ เนื่องจาก implementation จริงไม่ได้แสดงในซอร์ส
    // ที่ให้มา (อยู่ใน BeanDeserializerBase) จึงไม่สามารถยืนยัน behavior ได้

    // ---------------------------------------------------------------
    // 5) Object Id
    // ---------------------------------------------------------------

    @Test
    public void testDeserializeWithObjectId_BasicRoundTrip() throws Exception {
        String json = "{\"id\":1,\"name\":\"root\"}";
        IdentityBean bean = mapper.readValue(json, IdentityBean.class);
        assertEquals(1, bean.id);
        assertEquals("root", bean.name);
    }

    @Test
    public void testDeserializeUsingPropertyBasedCreator_ForwardReference() throws Exception {
        // หมายเหตุ: ทดสอบ branch UnresolvedForwardReference/BeanReferring ตาม comment
        // ในซอร์ส (แก้ปัญหา [databind#1261]) ซึ่งเป็น feature ที่มีการทดสอบอย่างเป็นทางการ
        // ใน Jackson แต่รายละเอียดภายในของ wrapAndThrow/PropertyBasedCreator.build()
        // ไม่ได้แสดงในซอร์สที่ให้มา จึงมีความเสี่ยงบางส่วนหากพฤติกรรม internal เปลี่ยนไป
        String json = "[{\"id\":1,\"name\":\"first\",\"next\":2},"
                + "{\"id\":2,\"name\":\"second\",\"next\":null}]";
        List<RefNode> list = mapper.readValue(json,
                mapper.getTypeFactory().constructCollectionType(List.class, RefNode.class));
        assertEquals(2, list.size());
        assertSame(list.get(1), list.get(0).next);
    }

    // ---------------------------------------------------------------
    // 6) View processing
    // ---------------------------------------------------------------

    @Test
    public void testDeserializeWithView_OnlyVisiblePropertySet() throws Exception {
        String json = "{\"publicField\":\"pub\",\"privateField\":\"priv\"}";
        ViewBean bean = mapper.readerFor(ViewBean.class)
                .withView(Views.Public.class)
                .readValue(json);
        assertEquals("pub", bean.publicField);
        assertNull(bean.privateField); // ไม่ visible ใน view -> ถูก skipChildren()
    }

    // ---------------------------------------------------------------
    // 7) Unwrapped properties
    // ---------------------------------------------------------------

    @Test
    public void testDeserializeWithUnwrapped_PropertiesMerged() throws Exception {
        String json = "{\"name\":\"Carol\",\"city\":\"Bangkok\",\"zip\":\"10110\"}";
        UnwrappedBean bean = mapper.readValue(json, UnwrappedBean.class);
        assertEquals("Carol", bean.name);
        assertNotNull(bean.address);
        assertEquals("Bangkok", bean.address.city);
        assertEquals("10110", bean.address.zip);
    }

    // ---------------------------------------------------------------
    // 8) External type id
    // ---------------------------------------------------------------

    @Test
    public void testDeserializeWithExternalTypeId() throws Exception {
        String json = "{\"name\":\"x\",\"pet\":{\"bark\":\"woof\"},\"petType\":\"dog\"}";
        ExternalTypeBean bean = mapper.readValue(json, ExternalTypeBean.class);
        assertEquals("x", bean.name);
        assertNotNull(bean.pet);
        assertTrue(bean.pet instanceof Dog);
        assertEquals("woof", ((Dog) bean.pet).bark);
    }

    // ---------------------------------------------------------------
    // 9) Injectables
    // ---------------------------------------------------------------

    @Test
    public void testDeserializeWithInjectables() throws Exception {
        InjectableValues iv = new InjectableValues.Std().addValue("svc", "InjectedService");
        InjectBean bean = mapper.readerFor(InjectBean.class).with(iv)
                .readValue("{\"name\":\"Dan\"}");
        assertEquals("Dan", bean.name);
        assertEquals("InjectedService", bean.service);
    }

    // ---------------------------------------------------------------
    // 10) _deserializeUsingPropertyBased: creator / any-setter / ignorable / unknown
    // ---------------------------------------------------------------

    @Test
    public void testDeserializeUsingPropertyBasedCreator_WithAnySetterAndIgnorable() throws Exception {
        // ignoredProp และ c อยู่ "หลัง" creator prop ตัวสุดท้าย (b)
        // -> ถูกประมวลผลผ่าน deserialize(p,ctxt,bean) (handleUnknownVanilla)
        String json = "{\"a\":\"val\",\"b\":7,\"ignoredProp\":\"skip\",\"c\":123}";
        CreatorBean bean = mapper.readValue(json, CreatorBean.class);
        assertEquals("val", bean.a);
        assertEquals(7, bean.b);
        assertEquals(123, ((Number) bean.extra.get("c")).intValue());
    }

    @Test
    public void testDeserializeUsingPropertyBasedCreator_BufferedIgnorableAndAnySetterBeforeLastCreatorProp()
            throws Exception {
        // ignoredProp และ extraAny อยู่ "ก่อน" creator prop ตัวสุดท้าย (b)
        // -> ถูก buffer ภายใน _deserializeUsingPropertyBased โดยตรง
        // หมายเหตุ: อิงสมมติฐานว่า PropertyBasedCreator.build() จะ replay
        // ค่าที่ buffer ไว้ (any-setter) ไปยัง bean ใหม่ (พฤติกรรมมาตรฐานของ Jackson
        // แต่ implementation จริงไม่ได้แสดงในซอร์สที่ให้มา)
        String json = "{\"a\":\"val\",\"ignoredProp\":\"skip\",\"extraAny\":99,\"b\":5}";
        CreatorBean2 bean = mapper.readValue(json, CreatorBean2.class);
        assertEquals("val", bean.a);
        assertEquals(5, bean.b);
        assertEquals("extraAny", bean.anySetterKey);
        assertEquals(99, ((Number) bean.anySetterValue).intValue());
    }

    @Test
    public void testDeserializeUsingPropertyBasedCreator_UnknownPropertyBufferedAndIgnored() throws Exception {
        // "x" ไม่ตรงกับ creator/regular/ignorable/anySetter -> เก็บลง unknown TokenBuffer
        // ignoreUnknown=true -> handleUnknownProperties ไม่ throw
        String json = "{\"a\":\"val\",\"x\":\"mystery\",\"b\":9}";
        CreatorBean3 bean = mapper.readValue(json, CreatorBean3.class);
        assertEquals("val", bean.a);
        assertEquals(9, bean.b);
    }

    @Test(expected = UnrecognizedPropertyException.class)
    public void testDeserializeUsingPropertyBasedCreator_UnknownPropertyThrows() throws Exception {
        String json = "{\"a\":\"val\",\"x\":\"mystery\",\"b\":9}";
        mapper.readValue(json, CreatorBean4.class);
    }

    @Test
    public void testPropertyBasedCreator_NoExtraProperties() throws Exception {
        // ไม่มี field เหลือหลัง creator prop ตัวสุดท้าย -> unknown == null,
        // deserialize(p,ctxt,bean) ถูกเรียกแล้ว p.hasTokenId(FIELD_NAME)==false -> return bean ทันที
        String json = "{\"a\":\"val\",\"b\":7}";
        CreatorBeanSimple bean = mapper.readValue(json, CreatorBeanSimple.class);
        assertEquals("val", bean.a);
        assertEquals(7, bean.b);
    }

    // ---------------------------------------------------------------
    // 11) deserialize(JsonParser, DeserializationContext, Object bean) โดยตรง (readerForUpdating)
    // ---------------------------------------------------------------

    @Test
    public void testDeserializeIntoExistingBean_UpdatesProperties() throws Exception {
        SimpleBean bean = new SimpleBean();
        bean.name = "Old";
        bean.age = 1;
        SimpleBean updated = mapper.readerForUpdating(bean).readValue("{\"age\":99}");
        assertSame(bean, updated);
        assertEquals("Old", updated.name); // ไม่มีใน JSON -> ไม่เปลี่ยน
        assertEquals(99, updated.age);
    }

    @Test
    public void testDeserializeIntoExistingBean_EmptyObject_ReturnsSameBean() throws Exception {
        SimpleBean bean = new SimpleBean();
        bean.name = "Keep";
        // propName = p.nextFieldName() == null -> return bean ทันที
        SimpleBean updated = mapper.readerForUpdating(bean).readValue("{}");
        assertSame(bean, updated);
        assertEquals("Keep", updated.name);
    }

    // ---------------------------------------------------------------
    // 12) asArrayDeserializer
    // ---------------------------------------------------------------

    @Test
    public void testBeanAsArray_Deserialize() throws Exception {
        ArrayShapeBean bean = mapper.readValue("[\"hello\",5]", ArrayShapeBean.class);
        assertEquals("hello", bean.a);
        assertEquals(5, bean.b);
    }
}
