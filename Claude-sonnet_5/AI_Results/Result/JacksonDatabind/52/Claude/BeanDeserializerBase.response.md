# แนวทางการทดสอบ

เนื่องจาก `BeanDeserializerBase` เป็น **abstract class** ที่ไม่มี public no-arg constructor และ constructor ที่มีอยู่ต้องพึ่งพา internal objects (`BeanDeserializerBuilder`, `BeanPropertyMap` ฯลฯ) ที่สร้างยากโดยตรง แนวทางที่ทำได้จริงและไม่ผิดหลัก "ห้ามเดา behavior" คือ:

1. **ทดสอบทางอ้อมผ่าน `ObjectMapper`** (integration-style) เพื่อ exercise logic จริงของ `resolve()`, `createContextual()`, `deserializeFromObject/Array/String/Number/Boolean/Double`, `handleUnknownProperty`, `handleIgnoredProperty` ฯลฯ
2. **ทดสอบแบบตรง (white-box)** โดยใช้ `BeanDeserializerModifier` (public hook ของ Jackson) เพื่อ "จับ" instance ของ `BeanDeserializerBase` จริงที่ ObjectMapper สร้างขึ้น แล้วเรียก public accessor methods ตรง ๆ (`isCachable()`, `handledType()`, `findProperty()`, `getPropertyCount()`, `creatorProperties()`, `findBackReference()` ฯลฯ)

จุดที่ไม่สามารถทดสอบได้อย่างมั่นใจ (เช่น `_findSubclassDeserializer`/`handlePolymorphic`, native Object-Id ผ่าน `deserializeWithType`, branch ภายใน `_delegateDeserializer` ของบาง path ที่ขึ้นกับ ValueInstantiator internal heuristics) จะมี **comment กำกับไว้ชัดเจน**

```java
package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Unit tests สำหรับ {@link BeanDeserializerBase}
 *
 * หมายเหตุ: เนื่องจาก BeanDeserializerBase เป็น abstract class ที่สร้าง instance ตรง ๆ ได้ยาก
 * (constructor ต้องพึ่ง internal builder/collections) การทดสอบส่วนใหญ่จึงใช้ ObjectMapper
 * เพื่อ exercise logic ผ่าน concrete subclass (BeanDeserializer) ซึ่งเป็นวิธีที่ยอมรับได้
 * และไม่ได้ "เดา" behavior เกินกว่าที่ปรากฏในซอร์สที่ให้มา
 *
 * สำหรับ public accessor methods บางตัว (findProperty, getPropertyCount, creatorProperties,
 * findBackReference ฯลฯ) ใช้ BeanDeserializerModifier (public hook ของ Jackson) เพื่อ "จับ"
 * instance จริงของ BeanDeserializerBase แล้วเรียกเมธอดตรง ๆ (white-box)
 */
public class BeanDeserializerBaseTest {

    private final ObjectMapper mapper = new ObjectMapper();

    // =====================================================================
    // ---------------------------- Helper POJOs --------------------------
    // =====================================================================

    public static class SimpleBean {
        public String name;
        public int age;
        public SimpleBean() {}
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class IgnoreUnknownBean {
        public String name;
    }

    @JsonIgnoreProperties({"secret"})
    public static class IgnorablePropBean {
        public String name;
        public String secret;
    }

    public static class AnySetterBean {
        public String name;
        private final Map<String, Object> extra = new HashMap<String, Object>();
        @JsonAnySetter
        public void setExtra(String key, Object value) { extra.put(key, value); }
        public Map<String, Object> getExtra() { return extra; }
    }

    // Implicit scalar delegate-creator -> exercises createFromString() directly
    public static class StringDelegateBean {
        public final String value;
        @JsonCreator
        public StringDelegateBean(String value) { this.value = "PARSED:" + value; }
    }

    public static class BooleanDelegateBean {
        public final boolean flag;
        @JsonCreator
        public BooleanDelegateBean(boolean flag) { this.flag = flag; }
    }

    public static class IntCreatorBean {
        public final int value;
        @JsonCreator
        public IntCreatorBean(int value) { this.value = value; }
    }

    public static class LongCreatorBean {
        public final long value;
        @JsonCreator
        public LongCreatorBean(long value) { this.value = value; }
    }

    public static class DoubleCreatorBean {
        public final double value;
        @JsonCreator
        public DoubleCreatorBean(double value) { this.value = value; }
    }

    // Generic (non-scalar) DELEGATING creator -> forces _delegateDeserializer != null
    // branch inside deserializeFromString/Number/Boolean/Double
    public static class ObjectDelegateBean {
        public final Object raw;
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public ObjectDelegateBean(Object raw) { this.raw = raw; }
    }

    public static class ObjectDelegateWithInjectBean {
        public final Object raw;
        @JacksonInject
        public String injected;
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public ObjectDelegateWithInjectBean(Object raw) { this.raw = raw; }
    }

    // Array-delegate creator -> _arrayDelegateDeserializer != null branch
    public static class ArrayDelegateBean {
        public final int[] values;
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public ArrayDelegateBean(int[] values) { this.values = values; }
    }

    // Property-based creator
    public static class CreatorBean {
        public final String name;
        public final int age;
        @JsonCreator
        public CreatorBean(@JsonProperty("name") String name, @JsonProperty("age") int age) {
            this.name = name;
            this.age = age;
        }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    public static class NodeBean {
        public String name;
        public NodeBean next;
        public NodeBean() {}
    }

    public static class Address {
        public String city;
        public Address() {}
    }

    public static class PersonWithUnwrapped {
        public String name;
        @JsonUnwrapped
        public Address address;
        public PersonWithUnwrapped() {}
    }

    public static class ParentBean {
        public String name;
        @JsonManagedReference
        public List<ChildBean> children = new ArrayList<ChildBean>();
        public ParentBean() {}
    }

    public static class ChildBean {
        public String name;
        @JsonBackReference
        public ParentBean parent;
        public ChildBean() {}
    }

    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    @JsonPropertyOrder({"a", "b"})
    public static class ArrayShapeBean {
        public String a;
        public int b;
        public ArrayShapeBean() {}
    }

    // มี @JsonFormat class-level feature -> ทดสอบ branch case-insensitive ใน createContextual()
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
    public static class CaseInsensitiveBean {
        public String name;
    }

    public static abstract class AbstractBean {
        public String name;
    }

    public static class ThrowingSetterBean {
        public String name;
        public void setValue(int v) { throw new IllegalStateException("boom"); }
        public int getValue() { return 0; }
    }

    // =====================================================================
    // -------------------- Helper: capture real deserializer -------------
    // =====================================================================

    private BeanDeserializerBase captureDeserializer(final Class<?> targetClass, String sampleJson)
            throws IOException {
        final BeanDeserializerBase[] holder = new BeanDeserializerBase[1];
        SimpleModule module = new SimpleModule();
        module.setDeserializerModifier(new BeanDeserializerModifier() {
            @Override
            public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config,
                    BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                if (beanDesc.getBeanClass() == targetClass && deserializer instanceof BeanDeserializerBase) {
                    holder[0] = (BeanDeserializerBase) deserializer;
                }
                return deserializer;
            }
        });
        ObjectMapper m = new ObjectMapper();
        m.registerModule(module);
        m.readValue(sampleJson, targetClass);
        return holder[0];
    }

    // =====================================================================
    // --------------------------- Vanilla path ----------------------------
    // =====================================================================

    @Test
    public void testVanillaDeserialization() throws IOException {
        SimpleBean bean = mapper.readValue("{\"name\":\"john\",\"age\":30}", SimpleBean.class);
        assertEquals("john", bean.name);
        assertEquals(30, bean.age);
    }

    @Test
    public void testEmptyObjectDeserialization() throws IOException {
        SimpleBean bean = mapper.readValue("{}", SimpleBean.class);
        assertNotNull(bean);
        assertNull(bean.name);
        assertEquals(0, bean.age);
    }

    @Test
    public void testNullJsonValue() throws IOException {
        SimpleBean bean = mapper.readValue("null", SimpleBean.class);
        assertNull(bean);
    }

    // =====================================================================
    // -------------------- handleUnknownProperty branches -----------------
    // =====================================================================

    @Test
    public void testUnknownProperty_ThrowsByDefault() throws IOException {
        try {
            mapper.readValue("{\"name\":\"john\",\"extra\":1}", SimpleBean.class);
            fail("Expected UnrecognizedPropertyException");
        } catch (UnrecognizedPropertyException e) {
            // default FAIL_ON_UNKNOWN_PROPERTIES = true -> _ignoreAllUnknown=false, no ignorableProps
        }
    }

    @Test
    public void testUnknownProperty_IgnoredWhenFeatureDisabled() throws IOException {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        SimpleBean bean = m.readValue("{\"name\":\"john\",\"extra\":1}", SimpleBean.class);
        assertEquals("john", bean.name);
    }

    @Test
    public void testClassLevelIgnoreUnknown() throws IOException {
        // _ignoreAllUnknown == true branch -> p.skipChildren() ทันที
        IgnoreUnknownBean bean = mapper.readValue("{\"name\":\"a\",\"unknown\":123}", IgnoreUnknownBean.class);
        assertEquals("a", bean.name);
    }

    @Test
    public void testIgnorablePropertySkippedSilently() throws IOException {
        // handleIgnoredProperty(): FAIL_ON_IGNORED_PROPERTIES=false (default) -> skipChildren()
        IgnorablePropBean bean = mapper.readValue("{\"name\":\"a\",\"secret\":\"shh\"}", IgnorablePropBean.class);
        assertEquals("a", bean.name);
        assertNull(bean.secret);
    }

    @Test
    public void testIgnorablePropertyFailsWhenFeatureEnabled() throws IOException {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, true);
        try {
            m.readValue("{\"name\":\"a\",\"secret\":\"shh\"}", IgnorablePropBean.class);
            fail("Expected IgnoredPropertyException");
        } catch (IgnoredPropertyException e) {
            // expected: throw branch inside handleIgnoredProperty()
        }
    }

    @Test
    public void testAnySetterCapturesUnknown() throws IOException {
        // handleUnknownVanilla(): _anySetter != null branch
        AnySetterBean bean = mapper.readValue("{\"name\":\"a\",\"foo\":1,\"bar\":\"x\"}", AnySetterBean.class);
        assertEquals("a", bean.name);
        assertEquals(1, bean.getExtra().get("foo"));
        assertEquals("x", bean.getExtra().get("bar"));
    }

    // =====================================================================
    // ----------------------- deserializeFromString -----------------------
    // =====================================================================

    @Test
    public void testDelegateCreatorFromString_DirectCreateFromString() throws IOException {
        // Implicit scalar creator -> _delegateDeserializer == null -> createFromString() path
        StringDelegateBean bean = mapper.readValue("\"hello\"", StringDelegateBean.class);
        assertEquals("PARSED:hello", bean.value);
    }

    @Test
    public void testObjectDelegate_FromString_UsesDelegateBranch() throws IOException {
        // Object param -> canCreateFromString()==false -> _delegateDeserializer != null branch
        ObjectDelegateBean bean = mapper.readValue("\"hi\"", ObjectDelegateBean.class);
        assertEquals("hi", bean.raw);
    }

    // =====================================================================
    // ----------------------- deserializeFromNumber ------------------------
    // =====================================================================

    @Test
    public void testCreatorFromInt() throws IOException {
        IntCreatorBean bean = mapper.readValue("42", IntCreatorBean.class);
        assertEquals(42, bean.value);
    }

    @Test
    public void testCreatorFromLong() throws IOException {
        LongCreatorBean bean = mapper.readValue(String.valueOf(Long.MAX_VALUE), LongCreatorBean.class);
        assertEquals(Long.MAX_VALUE, bean.value);
    }

    @Test
    public void testObjectDelegate_FromInt() throws IOException {
        ObjectDelegateBean bean = mapper.readValue("123", ObjectDelegateBean.class);
        assertEquals(Integer.valueOf(123), bean.raw);
    }

    @Test
    public void testObjectDelegate_FromLong() throws IOException {
        ObjectDelegateBean bean = mapper.readValue(String.valueOf(Long.MAX_VALUE), ObjectDelegateBean.class);
        assertEquals(Long.valueOf(Long.MAX_VALUE), bean.raw);
    }

    // =====================================================================
    // ----------------------- deserializeFromDouble ------------------------
    // =====================================================================

    @Test
    public void testCreatorFromDouble() throws IOException {
        DoubleCreatorBean bean = mapper.readValue("3.14", DoubleCreatorBean.class);
        assertEquals(3.14, bean.value, 0.0001);
    }

    @Test
    public void testObjectDelegate_FromDouble() throws IOException {
        ObjectDelegateBean bean = mapper.readValue("3.14", ObjectDelegateBean.class);
        assertEquals(Double.valueOf(3.14), bean.raw);
    }

    // =====================================================================
    // ----------------------- deserializeFromBoolean -----------------------
    // =====================================================================

    @Test
    public void testCreatorFromBoolean() throws IOException {
        BooleanDelegateBean t = mapper.readValue("true", BooleanDelegateBean.class);
        assertTrue(t.flag);
        BooleanDelegateBean f = mapper.readValue("false", BooleanDelegateBean.class);
        assertFalse(f.flag);
    }

    @Test
    public void testObjectDelegate_FromBoolean() throws IOException {
        ObjectDelegateBean bean = mapper.readValue("true", ObjectDelegateBean.class);
        assertEquals(Boolean.TRUE, bean.raw);
    }

    @Test
    public void testDelegateWithInjectedValue() throws IOException {
        // exercises injectValues() branch (_injectables != null) ใน delegate path
        InjectableValues.Std inj = new InjectableValues.Std();
        inj.addValue(String.class, "injectedValue");
        ObjectDelegateWithInjectBean bean = mapper.readerFor(ObjectDelegateWithInjectBean.class)
                .with(inj)
                .readValue("\"hello\"");
        assertEquals("hello", bean.raw);
        assertEquals("injectedValue", bean.injected);
    }

    // =====================================================================
    // ------------------------ deserializeFromArray ------------------------
    // =====================================================================

    @Test
    public void testArrayDelegateCreator() throws IOException {
        // _arrayDelegateDeserializer != null branch
        ArrayDelegateBean bean = mapper.readValue("[1,2,3]", ArrayDelegateBean.class);
        assertArrayEquals(new int[]{1, 2, 3}, bean.values);
    }

    @Test
    public void testUnwrapSingleValueArrayFeature() throws IOException {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        SimpleBean bean = m.readValue("[{\"name\":\"a\",\"age\":1}]", SimpleBean.class);
        assertEquals("a", bean.name);
    }

    @Test
    public void testUnwrapSingleValueArray_ExtraElementFails() throws IOException {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        try {
            m.readValue("[{\"name\":\"a\",\"age\":1},{\"name\":\"b\",\"age\":2}]", SimpleBean.class);
            fail("Expected exception due to extra array element (handleMissingEndArrayForSingle)");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testAcceptEmptyArrayAsNullObject() throws IOException {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
        SimpleBean bean = m.readValue("[]", SimpleBean.class);
        assertNull(bean);
    }

    @Test
    public void testArrayWithoutAnyFeatureFails() throws IOException {
        try {
            mapper.readValue("[{\"name\":\"a\"}]", SimpleBean.class);
            fail("Expected exception: neither UNWRAP_SINGLE_VALUE_ARRAYS nor ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT enabled");
        } catch (JsonMappingException e) {
            // expected: falls through to ctxt.handleUnexpectedToken()
        }
    }

    // =====================================================================
    // ---------------- ObjectId / Unwrapped / Managed-Back-Ref -------------
    // =====================================================================

    @Test
    public void testObjectIdReferenceResolution() throws IOException {
        String json = "{\"@id\":1,\"name\":\"first\",\"next\":{\"@id\":2,\"name\":\"second\",\"next\":1}}";
        NodeBean first = mapper.readValue(json, NodeBean.class);
        assertEquals("first", first.name);
        assertEquals("second", first.next.name);
        assertSame(first, first.next.next);
    }

    @Test
    public void testUnwrappedProperty() throws IOException {
        String json = "{\"name\":\"john\",\"city\":\"Bangkok\"}";
        PersonWithUnwrapped p = mapper.readValue(json, PersonWithUnwrapped.class);
        assertEquals("john", p.name);
        assertNotNull(p.address);
        assertEquals("Bangkok", p.address.city);
    }

    @Test
    public void testManagedBackReference() throws IOException {
        String json = "{\"name\":\"parent\",\"children\":[{\"name\":\"child1\"}]}";
        ParentBean parent = mapper.readValue(json, ParentBean.class);
        assertEquals(1, parent.children.size());
        assertSame(parent, parent.children.get(0).parent);
    }

    // =====================================================================
    // ------------------------- createContextual() ------------------------
    // =====================================================================

    @Test
    public void testFormatShapeArray_Deserialize() throws IOException {
        // shape == ARRAY -> contextual.asArrayDeserializer()
        String json = "[\"x\",5]";
        ArrayShapeBean bean = mapper.readValue(json, ArrayShapeBean.class);
        assertEquals("x", bean.a);
        assertEquals(5, bean.b);
    }

    @Test
    public void testCaseInsensitivePropertyFormatFeature() throws IOException {
        // ทดสอบ branch: format.getFeature(ACCEPT_CASE_INSENSITIVE_PROPERTIES) != null
        // (พึ่งพา @JsonFormat(with=...) attribute ตาม jackson-annotations 2.6+ ที่ระบุในซอร์ส)
        CaseInsensitiveBean bean = mapper.readValue("{\"NAME\":\"john\"}", CaseInsensitiveBean.class);
        assertEquals("john", bean.name);
    }

    // =====================================================================
    // ------------------- Missing instantiator (abstract) -------------------
    // =====================================================================

    @Test
    public void testAbstractTypeMissingInstantiator() throws IOException {
        try {
            mapper.readValue("{\"name\":\"x\"}", AbstractBean.class);
            fail("Expected exception for abstract type without concrete implementation");
        } catch (JsonMappingException e) {
            // expected: _beanType.isAbstract() == true branch in deserializeFromObjectUsingNonDefault
        }
    }

    // =====================================================================
    // ------------------- wrapAndThrow / throwOrReturnThrowable -------------
    // (behavior ที่สังเกตได้จากภายนอก: ค่าเริ่มต้น WRAP_EXCEPTIONS=true จะ wrap เป็น
    //  JsonMappingException; ปิด feature แล้ว raw RuntimeException จะหลุดออกมาตรง ๆ
    //  -- ไม่ยืนยัน internal call path 100% จึง comment กำกับไว้ตามข้อกำหนด)
    // =====================================================================

    @Test
    public void testSetterExceptionWrappedByDefault() throws IOException {
        try {
            mapper.readValue("{\"name\":\"a\",\"value\":5}", ThrowingSetterBean.class);
            fail("Expected exception due to setter throwing");
        } catch (JsonMappingException e) {
            Throwable cause = e.getCause();
            assertNotNull(cause);
            assertTrue(cause instanceof IllegalStateException);
            assertEquals("boom", cause.getMessage());
        }
    }

    @Test
    public void testSetterExceptionNotWrappedWhenFeatureDisabled() throws IOException {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.WRAP_EXCEPTIONS, false);
        try {
            m.readValue("{\"name\":\"a\",\"value\":5}", ThrowingSetterBean.class);
            fail("Expected raw RuntimeException since WRAP_EXCEPTIONS disabled");
        } catch (IllegalStateException e) {
            assertEquals("boom", e.getMessage());
        }
    }

    // =====================================================================
    // --------------------- Direct accessor methods (white-box) ------------
    // =====================================================================

    @Test
    public void testAccessorMethodsOnSimpleBeanDeserializer() throws IOException {
        BeanDeserializerBase deser = captureDeserializer(SimpleBean.class, "{\"name\":\"x\",\"age\":1}");
        assertNotNull(deser);

        assertTrue(deser.isCachable());
        assertEquals(SimpleBean.class, deser.handledType());
        assertEquals(SimpleBean.class, deser.getBeanClass());
        assertNotNull(deser.getValueType());
        assertTrue(deser.getPropertyCount() >= 2);

        assertTrue(deser.hasProperty("name"));
        assertFalse(deser.hasProperty("doesNotExist"));

        assertNotNull(deser.findProperty("name"));
        assertNull(deser.findProperty("doesNotExist"));
        assertNull(deser.findProperty(new PropertyName("doesNotExist")));

        Collection<Object> names = deser.getKnownPropertyNames();
        assertTrue(names.contains("name"));
        assertTrue(names.contains("age"));

        assertFalse(deser.hasViews());
        assertNull(deser.getObjectIdReader());

        Iterator<SettableBeanProperty> it = deser.properties();
        assertTrue(it.hasNext());

        // ไม่มี property-based creator -> creatorProperties() ว่าง (_propertyBasedCreator == null branch)
        Iterator<SettableBeanProperty> cit = deser.creatorProperties();
        assertFalse(cit.hasNext());

        assertNotNull(deser.getValueInstantiator());

        // ไม่มี back-reference ใด ๆ -> _backRefs == null branch
        assertNull(deser.findBackReference("anything"));
    }

    @Test
    public void testCreatorPropertiesAndFindPropertyFallback() throws IOException {
        BeanDeserializerBase deser = captureDeserializer(CreatorBean.class, "{\"name\":\"a\",\"age\":2}");
        assertNotNull(deser);

        // มี property-based creator -> creatorProperties() ไม่ว่าง
        Iterator<SettableBeanProperty> cit = deser.creatorProperties();
        assertTrue(cit.hasNext());

        assertNotNull(deser.findProperty("name"));
        assertNotNull(deser.findProperty("age"));
        assertNull(deser.findProperty("missingProp"));

        // findProperty(int) -- เพียงยืนยันว่าไม่ throw exception (ไม่ยืนยันลำดับ index)
        deser.findProperty(0);
    }

    @Test
    public void testFindBackReferenceWithActualBackRef() throws IOException {
        BeanDeserializerBase childDeser = captureDeserializer(ChildBean.class, "{\"name\":\"c\"}");
        assertNotNull(childDeser);

        // ชื่อ default ของ @JsonBackReference คือ "defaultReference"
        assertNotNull(childDeser.findBackReference("defaultReference"));
        // _backRefs != null แต่ไม่พบ key -> null จาก _backRefs.get()
        assertNull(childDeser.findBackReference("noSuchRef"));
    }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| testVanillaDeserialization, testEmptyObjectDeserialization, testNullJsonValue | `_vanillaProcessing == true` path, null token handling |
| testUnknownProperty_ThrowsByDefault / _IgnoredWhenFeatureDisabled | `handleUnknownProperty`: `_ignoreAllUnknown==false`, `_ignorableProps` null, fallback to super (throw/skip ตาม FAIL_ON_UNKNOWN_PROPERTIES) |
| testClassLevelIgnoreUnknown | `handleUnknownProperty`: `_ignoreAllUnknown==true` branch |
| testIgnorablePropertySkippedSilently / _FailsWhenFeatureEnabled | `handleIgnoredProperty`: `FAIL_ON_IGNORED_PROPERTIES` true/false branches |
| testAnySetterCapturesUnknown | `handleUnknownVanilla`: `_anySetter != null` branch |
| testDelegateCreatorFromString_DirectCreateFromString | `deserializeFromString`: `_delegateDeserializer == null` → `createFromString()` |
| testObjectDelegate_FromString_UsesDelegateBranch | `deserializeFromString`: `_delegateDeserializer != null && !canCreateFromString()` |
| testCreatorFromInt/Long, testObjectDelegate_FromInt/Long | `deserializeFromNumber`: INT/LONG case, direct create vs delegate branch |
| testCreatorFromDouble, testObjectDelegate_FromDouble | `deserializeFromDouble`: DOUBLE/FLOAT branch, direct vs delegate |
| testCreatorFromBoolean, testObjectDelegate_FromBoolean | `deserializeFromBoolean`: direct vs delegate branch |
| testDelegateWithInjectedValue | `injectValues()` เรียกจาก delegate branch (`_injectables != null`) |
| testArrayDelegateCreator | `deserializeFromArray`: `_arrayDelegateDeserializer != null` branch |
| testUnwrapSingleValueArrayFeature / _ExtraElementFails | `deserializeFromArray`: `UNWRAP_SINGLE_VALUE_ARRAYS` true, normal vs `handleMissingEndArrayForSingle` |
| testAcceptEmptyArrayAsNullObject | `deserializeFromArray`: `ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT` true, END_ARRAY branch |
| testArrayWithoutAnyFeatureFails | `deserializeFromArray`: ไม่มี feature เปิด → `handleUnexpectedToken` |
| testObjectIdReferenceResolution | `_resolvedObjectIdProperty`, `deserializeFromObjectId`, ObjectIdReader wiring |
| testUnwrappedProperty | `_resolveUnwrappedProperty`, `UnwrappedPropertyHandler` |
| testManagedBackReference | `_resolveManagedReferenceProperty`, `_backRefs` populate |
| testFormatShapeArray_Deserialize | `createContextual`: `shape == ARRAY` → `asArrayDeserializer()` |
| testCaseInsensitivePropertyFormatFeature | `createContextual`: `format.getFeature(ACCEPT_CASE_INSENSITIVE_PROPERTIES)` non-null branch |
| testAbstractTypeMissingInstantiator | `deserializeFromObjectUsingNonDefault`: `_beanType.isAbstract()==true` branch |
| testSetterExceptionWrappedByDefault / _NotWrappedWhenFeatureDisabled | `wrapAndThrow`/`throwOrReturnThrowable`: `WRAP_EXCEPTIONS` true/false |
| testAccessorMethodsOnSimpleBeanDeserializer | `isCachable`, `handledType`, `getBeanClass`, `getValueType`, `getPropertyCount`, `hasProperty` (found/not found), `findProperty(String)`/`findProperty(PropertyName)` (null/non-null), `getKnownPropertyNames`, `hasViews`, `getObjectIdReader==null`, `properties()`, `creatorProperties()` (empty), `findBackReference` (`_backRefs==null`) |
| testCreatorPropertiesAndFindPropertyFallback | `creatorProperties()` ไม่ว่าง, `findProperty` fallback ผ่าน `_propertyBasedCreator` |
| testFindBackReferenceWithActualBackRef | `findBackReference`: `_backRefs != null`, key พบ/ไม่พบ |

**หมายเหตุสำคัญ:** branch ที่เกี่ยวกับ `_findSubclassDeserializer`/`handlePolymorphic`, native Object-Id ผ่าน `deserializeWithType`, และรายละเอียดภายในของ `ValueInstantiator` บางกรณี ไม่ได้ครอบคลุมในชุดทดสอบนี้เนื่องจากต้องพึ่งพา infrastructure เพิ่มเติม (`@JsonTypeInfo`, binary format) ที่ไม่สามารถยืนยัน behavior จากซอร์สที่ให้มาได้อย่างชัดเจน