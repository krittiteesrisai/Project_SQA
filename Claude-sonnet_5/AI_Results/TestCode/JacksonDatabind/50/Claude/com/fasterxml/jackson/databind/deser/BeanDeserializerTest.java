package com.fasterxml.jackson.databind.deser;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.*;

// import คลาสเป้าหมายอย่างชัดเจน (แม้อยู่ package เดียวกัน)
import com.fasterxml.jackson.databind.deser.BeanDeserializer;

/**
 * Unit tests สำหรับ {@link BeanDeserializer}
 * ทดสอบผ่าน ObjectMapper เพราะ constructor ของ BeanDeserializer ต้องพึ่งพา
 * internal builder objects ที่ไม่สามารถ mock ได้อย่างปลอดภัยโดยไม่เดา behavior
 */
public class BeanDeserializerTest {

    // ------------------------------------------------------------------
    // Helper POJOs
    // ------------------------------------------------------------------

    static class SimpleBean {
        public String name;
        public int age;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class IgnoreUnknownBean {
        public String name;
    }

    interface Views {
        class Public {}
        class Internal extends Public {}
    }

    static class ViewBean {
        @JsonView(Views.Public.class)
        public String pub;
        @JsonView(Views.Internal.class)
        public String internal;
    }

    static class CreatorBean {
        final String name;
        final int age;
        @JsonCreator
        public CreatorBean(@JsonProperty("name") String name, @JsonProperty("age") int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class CreatorBeanWithExtra {
        final String name;
        final int age;
        public String nickname;
        @JsonCreator
        public CreatorBeanWithExtra(@JsonProperty("name") String name, @JsonProperty("age") int age) {
            this.name = name;
            this.age = age;
        }
        public void setNickname(String n) { this.nickname = n; }
    }

    @JsonIgnoreProperties({"secret"})
    static class CreatorBeanIgnorable {
        final String name;
        final int age;
        @JsonCreator
        public CreatorBeanIgnorable(@JsonProperty("name") String name, @JsonProperty("age") int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class CreatorBeanAnySetter {
        final String name;
        final int age;
        public Map<String, Object> extra = new LinkedHashMap<String, Object>();
        @JsonCreator
        public CreatorBeanAnySetter(@JsonProperty("name") String name, @JsonProperty("age") int age) {
            this.name = name;
            this.age = age;
        }
        @JsonAnySetter
        public void setExtra(String key, Object val) { extra.put(key, val); }
    }

    // creator ที่ไม่ครบพารามิเตอร์ทันที เพื่อบังคับให้ path "tail" (หลังจบ for-loop) ถูกเรียก
    static class CreatorBeanTail {
        final String name;
        final Integer age; // ไม่ required, ไม่ถูกส่งมาใน JSON เพื่อให้ assignParameter ไม่ true ระหว่างลูป
        @JsonCreator
        public CreatorBeanTail(@JsonProperty("name") String name,
                                @JsonProperty(value = "age", required = false) Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    static class StringCreatorBean {
        final String value;
        @JsonCreator
        public StringCreatorBean(String value) { this.value = value; }
    }

    static class IntCreatorBean {
        final int value;
        @JsonCreator
        public IntCreatorBean(int value) { this.value = value; }
    }

    static class BooleanCreatorBean {
        final boolean value;
        @JsonCreator
        public BooleanCreatorBean(boolean value) { this.value = value; }
    }

    static class DoubleCreatorBean {
        final double value;
        @JsonCreator
        public DoubleCreatorBean(double value) { this.value = value; }
    }

    static class ThrowingSetterBean {
        public void setValue(String v) { throw new RuntimeException("boom"); }
    }

    static class InjectBean {
        @JacksonInject("injKey")
        public String injected;
        public String name;
    }

    static class DelegatingBean {
        final Map<String, Object> data;
        @JsonCreator
        public DelegatingBean(Map<String, Object> data) { this.data = data; }
    }

    static class Address {
        public String city;
    }

    static class PersonUnwrapped {
        public String name;
        @JsonUnwrapped
        public Address address;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    static class SimpleIdBean {
        public String name;
        public SimpleIdBean() {}
        public SimpleIdBean(String n) { this.name = n; }
    }

    // ------------------------------------------------------------------
    // 1. Vanilla deserialize - เคสปกติ, start-object token, known props
    // ------------------------------------------------------------------
    @Test
    public void testVanillaDeserialize_SimpleObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean bean = mapper.readValue("{\"name\":\"Bob\",\"age\":30}", SimpleBean.class);
        assertEquals("Bob", bean.name);
        assertEquals(30, bean.age);
    }

    // ------------------------------------------------------------------
    // 2. Vanilla deserialize - empty object -> cover hasTokenId(FIELD_NAME) == false
    // ------------------------------------------------------------------
    @Test
    public void testVanillaDeserialize_EmptyObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean bean = mapper.readValue("{}", SimpleBean.class);
        assertNotNull(bean);
        assertNull(bean.name);
        assertEquals(0, bean.age);
    }

    // ------------------------------------------------------------------
    // 3. Unknown property + FAIL_ON_UNKNOWN_PROPERTIES=true (default) -> exception
    // ------------------------------------------------------------------
    @Test(expected = UnrecognizedPropertyException.class)
    public void testVanillaDeserialize_UnknownProperty_ThrowsByDefault() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("{\"name\":\"Bob\",\"extra\":\"x\"}", SimpleBean.class);
    }

    // ------------------------------------------------------------------
    // 4. Unknown property + @JsonIgnoreProperties(ignoreUnknown=true) -> ignore ได้
    // ------------------------------------------------------------------
    @Test
    public void testVanillaDeserialize_UnknownProperty_Ignored() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        IgnoreUnknownBean bean = mapper.readValue(
                "{\"extra\":\"x\",\"name\":\"Bob\"}", IgnoreUnknownBean.class);
        assertEquals("Bob", bean.name);
    }

    // ------------------------------------------------------------------
    // 5. Views - visible property ถูก set, ไม่ visible ถูก skip (p.skipChildren())
    // ------------------------------------------------------------------
    @Test
    public void testDeserializeWithView_VisibleAndSkipped() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ViewBean bean = mapper.readerWithView(Views.Public.class)
                .forType(ViewBean.class)
                .readValue("{\"pub\":\"p\",\"internal\":\"i\"}");
        assertEquals("p", bean.pub);
        // internal ไม่ visible ใน view Public -> ต้องถูก skip ไม่ถูก set
        assertNull(bean.internal);
    }

    // ------------------------------------------------------------------
    // 6. Property-based creator - เคสพื้นฐาน (ครบพารามิเตอร์, ไม่มี unknown)
    //    covers: creatorProp != null, assignParameter==true, ไม่ polymorphic,
    //    unknown==null, secondary deserialize(p,ctxt,bean) -> hasTokenId(FIELD_NAME)==false -> return bean
    // ------------------------------------------------------------------
    @Test
    public void testPropertyBasedCreator_Basic() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        CreatorBean bean = mapper.readValue("{\"name\":\"Bob\",\"age\":30}", CreatorBean.class);
        assertEquals("Bob", bean.name);
        assertEquals(30, bean.age);
    }

    // ------------------------------------------------------------------
    // 7. Property-based creator + extra ordinary property มาก่อนครบ creator params
    //    covers: buffer.bufferProperty (regular property need buffering)
    // ------------------------------------------------------------------
    @Test
    public void testPropertyBasedCreator_ExtraRegularPropertyBuffered() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        CreatorBeanWithExtra bean = mapper.readValue(
                "{\"nickname\":\"Bobby\",\"name\":\"Bob\",\"age\":30}", CreatorBeanWithExtra.class);
        assertEquals("Bob", bean.name);
        assertEquals(30, bean.age);
        assertEquals("Bobby", bean.nickname);
    }

    // ------------------------------------------------------------------
    // 8. Property-based creator + unknown field ก่อนครบ creator params
    //    covers: TokenBuffer unknown collection + handleUnknownProperties (throw เมื่อ fail-on-unknown)
    // ------------------------------------------------------------------
    @Test(expected = UnrecognizedPropertyException.class)
    public void testPropertyBasedCreator_UnknownField_Throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("{\"unknownField\":\"x\",\"name\":\"Bob\",\"age\":30}", CreatorBean.class);
    }

    // ------------------------------------------------------------------
    // 9. Property-based creator + ignorable property -> handleIgnoredProperty, ไม่ throw
    // ------------------------------------------------------------------
    @Test
    public void testPropertyBasedCreator_IgnorableProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        CreatorBeanIgnorable bean = mapper.readValue(
                "{\"secret\":\"shh\",\"name\":\"Bob\",\"age\":30}", CreatorBeanIgnorable.class);
        assertEquals("Bob", bean.name);
        assertEquals(30, bean.age);
    }

    // ------------------------------------------------------------------
    // 10. Property-based creator + @JsonAnySetter -> buffer.bufferAnyProperty branch
    // ------------------------------------------------------------------
    @Test
    public void testPropertyBasedCreator_AnySetter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        CreatorBeanAnySetter bean = mapper.readValue(
                "{\"foo\":\"bar\",\"name\":\"Bob\",\"age\":30}", CreatorBeanAnySetter.class);
        assertEquals("Bob", bean.name);
        assertEquals(30, bean.age);
        assertEquals("bar", bean.extra.get("foo"));
    }

    // ------------------------------------------------------------------
    // 11. Property-based creator - tail path (loop จบด้วย END_OBJECT โดยไม่ trigger assignParameter==true)
    //     covers: bean = creator.build(...) ที่ท้ายเมธอด, unknown==null -> return bean ตรง ๆ
    // ------------------------------------------------------------------
    @Test
    public void testPropertyBasedCreator_TailBuild_NoUnknown() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        CreatorBeanTail bean = mapper.readValue("{\"name\":\"Bob\"}", CreatorBeanTail.class);
        assertEquals("Bob", bean.name);
        assertNull(bean.age);
    }

    // ------------------------------------------------------------------
    // 12. Property-based creator - tail path + unknown field, mapper ignore unknown
    //     covers: tail-code unknown!=null -> handleUnknownProperties (ไม่ throw เพราะปิด fail-on-unknown)
    // ------------------------------------------------------------------
    @Test
    public void testPropertyBasedCreator_TailBuild_WithIgnoredUnknown() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        CreatorBeanTail bean = mapper.readValue(
                "{\"name\":\"Bob\",\"extra\":\"foo\"}", CreatorBeanTail.class);
        assertEquals("Bob", bean.name);
    }

    // ------------------------------------------------------------------
    // 13. deserializeFromString - _deserializeOther case VALUE_STRING
    // ------------------------------------------------------------------
    @Test
    public void testDeserializeFromString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        StringCreatorBean bean = mapper.readValue("\"hello\"", StringCreatorBean.class);
        assertEquals("hello", bean.value);
    }

    // ------------------------------------------------------------------
    // 14. deserializeFromNumber - _deserializeOther case VALUE_NUMBER_INT
    // ------------------------------------------------------------------
    @Test
    public void testDeserializeFromNumber() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        IntCreatorBean bean = mapper.readValue("42", IntCreatorBean.class);
        assertEquals(42, bean.value);
    }

    // ------------------------------------------------------------------
    // 15. deserializeFromDouble - _deserializeOther case VALUE_NUMBER_FLOAT
    // ------------------------------------------------------------------
    @Test
    public void testDeserializeFromDouble() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DoubleCreatorBean bean = mapper.readValue("3.14", DoubleCreatorBean.class);
        assertEquals(3.14, bean.value, 0.0001);
    }

    // ------------------------------------------------------------------
    // 16. deserializeFromBoolean - _deserializeOther case VALUE_TRUE/VALUE_FALSE
    // ------------------------------------------------------------------
    @Test
    public void testDeserializeFromBoolean_True() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BooleanCreatorBean bean = mapper.readValue("true", BooleanCreatorBean.class);
        assertTrue(bean.value);
    }

    @Test
    public void testDeserializeFromBoolean_False() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BooleanCreatorBean bean = mapper.readValue("false", BooleanCreatorBean.class);
        assertFalse(bean.value);
    }

    // ------------------------------------------------------------------
    // 17. START_ARRAY branch - UNWRAP_SINGLE_VALUE_ARRAYS
    //     สมมติฐาน: feature นี้ทำให้ deserializeFromArray ยอมรับ single-element array แทน object เดี่ยว
    // ------------------------------------------------------------------
    @Test
    public void testDeserializeFromArray_UnwrapSingleValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        SimpleBean bean = mapper.readValue("[{\"name\":\"Bob\",\"age\":5}]", SimpleBean.class);
        assertEquals("Bob", bean.name);
        assertEquals(5, bean.age);
    }

    // ------------------------------------------------------------------
    // 18. START_ARRAY โดยไม่เปิด UNWRAP_SINGLE_VALUE_ARRAYS -> ควร throw exception
    // ------------------------------------------------------------------
    @Test(expected = JsonMappingException.class)
    public void testDeserializeFromArray_WithoutUnwrapFeature_Throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("[{\"name\":\"Bob\",\"age\":5}]", SimpleBean.class);
    }

    // ------------------------------------------------------------------
    // 19. wrapAndThrow - setter throw exception -> ควรถูก wrap เป็น JsonMappingException
    // ------------------------------------------------------------------
    @Test(expected = JsonMappingException.class)
    public void testWrapAndThrow_OnSetterException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("{\"value\":\"x\"}", ThrowingSetterBean.class);
    }

    // ------------------------------------------------------------------
    // 20. Injectables - _injectables != null branch (deserialize(p,ctxt,bean) และ deserializeFromObject)
    // ------------------------------------------------------------------
    @Test
    public void testInjectableValues() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        InjectableValues.Std iv = new InjectableValues.Std();
        iv.addValue("injKey", "injectedVal");
        mapper.setInjectableValues(iv);
        InjectBean bean = mapper.readValue("{\"name\":\"Bob\"}", InjectBean.class);
        assertEquals("Bob", bean.name);
        assertEquals("injectedVal", bean.injected);
    }

    // ------------------------------------------------------------------
    // 21. Delegating creator (non-scalar) -> _nonStandardCreation true, no unwrapped/externalTypeId
    //     -> deserializeFromObjectUsingNonDefault branch ใน deserializeFromObject
    // ------------------------------------------------------------------
    @Test
    public void testDelegatingCreator_NonScalar() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DelegatingBean bean = mapper.readValue("{\"a\":1,\"b\":2}", DelegatingBean.class);
        assertNotNull(bean.data);
        assertEquals(2, bean.data.size());
    }

    // ------------------------------------------------------------------
    // 22. Unwrapped properties (_unwrappedPropertyHandler != null)
    //     covers: deserializeFromObject -> deserializeWithUnwrapped(p,ctxt)
    //     covers: unwrappingDeserializer() else-branch (getClass()==BeanDeserializer.class)
    // ------------------------------------------------------------------
    @Test
    public void testUnwrappedProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        PersonUnwrapped bean = mapper.readValue(
                "{\"name\":\"Bob\",\"city\":\"NYC\"}", PersonUnwrapped.class);
        assertEquals("Bob", bean.name);
        assertNotNull(bean.address);
        assertEquals("NYC", bean.address.city);
        // หมายเหตุ: branch "getClass() != BeanDeserializer.class" ใน unwrappingDeserializer()
        // ไม่สามารถทดสอบได้โดยไม่สร้าง subclass ของ BeanDeserializer เอง จึงไม่ครอบคลุมในชุดนี้
    }

    // ------------------------------------------------------------------
    // 23. ObjectIdReader round-trip (_objectIdReader != null ใน deserialize()/deserializeFromObject())
    //     หมายเหตุ: ไม่ยืนยัน branch ภายในแบบละเอียด (deserializeFromObjectId ฯลฯ อยู่ใน base class
    //     ที่ไม่ได้แสดงในซอร์ส) จึงทดสอบเพียงพฤติกรรม round-trip ให้ถูกต้อง
    // ------------------------------------------------------------------
    @Test
    public void testObjectIdReader_RoundTrip() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new SimpleIdBean("x"));
        SimpleIdBean back = mapper.readValue(json, SimpleIdBean.class);
        assertEquals("x", back.name);
    }

    // ------------------------------------------------------------------
    // 24. Null/ว่าง input - JSON null สำหรับ bean type ปกติ (root value)
    //     หมายเหตุ: ไม่แน่ใจว่า flow นี้ผ่าน BeanDeserializer.deserializeFromNull() จริง
    //     หรือถูก intercept โดย ObjectMapper ก่อนเรียก deserialize() (ดูจาก getNullValue()),
    //     จึงทดสอบเพียง "ผลลัพธ์" ว่าได้ null กลับมา ไม่ยืนยัน branch เจาะจงใน source
    // ------------------------------------------------------------------
    @Test
    public void testDeserialize_RootNull_ReturnsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean bean = mapper.readValue("null", SimpleBean.class);
        assertNull(bean);
    }

    // ------------------------------------------------------------------
    // 25. Invalid format สำหรับ property-based creator param (int รับ string ที่แปลงไม่ได้)
    //     covers: _deserializeWithErrorWrapping catch -> wrapAndThrow
    // ------------------------------------------------------------------
    @Test(expected = JsonMappingException.class)
    public void testPropertyBasedCreator_InvalidNumberFormat_Throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("{\"name\":\"Bob\",\"age\":\"not-a-number\"}", CreatorBean.class);
    }
}
