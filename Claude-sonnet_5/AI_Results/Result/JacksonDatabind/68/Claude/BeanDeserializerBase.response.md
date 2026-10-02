# แนวคิดการทดสอบ

เนื่องจาก `BeanDeserializerBase` เป็น abstract class ที่ผูกกับ internal machinery ของ Jackson อย่างลึก การทดสอบจึงใช้ 2 เทคนิคร่วมกัน:

1. **Integration-style ผ่าน `ObjectMapper`** — ใช้ `BeanDeserializerModifier` (ผ่าน `SimpleModule`) เพื่อ "ดัก" อินสแตนซ์ `BeanDeserializerBase` จริงที่ resolve แล้ว มาทดสอบ accessor และให้ `ObjectMapper.readValue(...)` เดินผ่าน branch ต่าง ๆ ของเมธอด `deserializeFromXxx`
2. **Direct call + Mockito** — เนื่องจากคลาสทดสอบอยู่ใน package เดียวกัน (`com.fasterxml.jackson.databind.deser`) จึงเรียกเมธอด `protected` ได้ตรง ๆ พร้อม mock `JsonParser`/`DeserializationContext`/`SettableBeanProperty` เพื่อบังคับ branch ที่ยากจะ trigger ผ่าน public API (เช่น `wrapAndThrow`, `wrapInstantiationProblem`, `_resolveXxx`, `deserializeWithType`)

จุดที่สำคัญที่สุดคือ `testDeserializeFromArray_delegateFallback_bugDetection` ซึ่งตรงกับ defect จริงของ Defects4J JacksonDatabind-68 (โค้ด fallback เรียก `createUsingArrayDelegate` ทั้งที่ตั้งใจเรียก `createUsingDelegate`)

> หมายเหตุ: บาง branch ที่ต้องพึ่งพา internal wiring ลึกมาก (เช่น `_convertObjectId` กรณี type mismatch, `handleUnknownProperties(TokenBuffer)`, `ObjectIdReferenceProperty` wrapping) ถูกข้าม/คอมเมนต์กำกับไว้ เพราะไม่สามารถยืนยัน behavior จาก source ที่ให้มาได้ครบถ้วนโดยไม่เดา

```java
package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.util.NameTransformer;

/**
 * Unit tests for {@link BeanDeserializerBase}.
 *
 * หมายเหตุสำคัญ: BeanDeserializerBase เป็น abstract class ที่ resolve ผ่าน
 * internal factory ของ Jackson เท่านั้น จึงใช้สองเทคนิค:
 *  (1) capture instance จริงผ่าน BeanDeserializerModifier แล้วเรียก public/
 *      protected method ตรง ๆ (คลาสทดสอบอยู่ package เดียวกัน)
 *  (2) ใช้ ObjectMapper.readValue(...) เพื่อเดินผ่าน branch ต่าง ๆ แบบ black-box
 */
public class BeanDeserializerBaseTest {

    // ===================================================================
    // Helper: capture BeanDeserializerBase instance ของ exactClass
    // ===================================================================
    private static BeanDeserializerBase captureDeserializer(
            final Class<?> exactClass, Class<?> rootClass, String json) throws IOException {
        final BeanDeserializerBase[] holder = new BeanDeserializerBase[1];
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.setDeserializerModifier(new BeanDeserializerModifier() {
            @Override
            public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config,
                    BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                if (beanDesc.getBeanClass() == exactClass && deserializer instanceof BeanDeserializerBase) {
                    holder[0] = (BeanDeserializerBase) deserializer;
                }
                return deserializer;
            }
        });
        mapper.registerModule(module);
        mapper.readValue(json, rootClass);
        return holder[0];
    }

    // ===================================================================
    // Fixture classes
    // ===================================================================
    static class SimpleBean {
        public int a;
        public String b;
        public SimpleBean() {}
    }

    static class EmptyBean {}

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class IgnoreUnknownBean {
        public int a;
    }

    @JsonIgnoreProperties({"ignoredProp"})
    static class IgnorablePropBean {
        public int a;
    }

    static class StringCreatorBean {
        public final String value;
        @JsonCreator
        public StringCreatorBean(String value) { this.value = value; }
    }

    static class BooleanCreatorBean {
        public final boolean value;
        @JsonCreator
        public BooleanCreatorBean(boolean value) { this.value = value; }
    }

    static class IntCreatorBean {
        public final int value;
        @JsonCreator
        public IntCreatorBean(int value) { this.value = value; }
    }

    static class DoubleCreatorBean {
        public final double value;
        @JsonCreator
        public DoubleCreatorBean(double value) { this.value = value; }
    }

    static class UuidDelegateBean {
        public final UUID id;
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public UuidDelegateBean(UUID id) { this.id = id; }
    }

    static class BigIntDelegateBean {
        public final BigInteger val;
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public BigIntDelegateBean(BigInteger val) { this.val = val; }
    }

    static class BigDecDelegateBean {
        public final BigDecimal val;
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public BigDecDelegateBean(BigDecimal val) { this.val = val; }
    }

    static class ArrayDelegateBean {
        public final List<Integer> items;
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public ArrayDelegateBean(List<Integer> items) { this.items = items; }
    }

    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    static class Point {
        public int x, y;
    }

    // ใช้ตรวจ defect: delegate (ไม่ใช่ array-delegate) ที่ value type ของมัน
    // ดันเป็น "as-array" (Point) - ทำให้ token START_ARRAY ตกไปที่ fallback
    // ของ deserializeFromArray ซึ่งควรเรียก createUsingDelegate แต่ source
    // เรียก createUsingArrayDelegate ผิด (defect ของ JacksonDatabind-68)
    static class DelegateToArrayShapeBean {
        public final Point point;
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public DelegateToArrayShapeBean(Point point) { this.point = point; }
    }

    static class DelegateMapBean {
        public final Map<String, Object> data;
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public DelegateMapBean(Map<String, Object> data) { this.data = data; }
    }

    static class CreatorPropsBean {
        public final int x;
        public final String y;
        @JsonCreator
        public CreatorPropsBean(@JsonProperty("x") int x, @JsonProperty("y") String y) {
            this.x = x; this.y = y;
        }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    static class IdBean {
        public int id;
        public String name;
        public IdBean() {}
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
    static class AutoIdBean {
        public String name;
        public AutoIdBean() {}
    }

    static class ThrowingSetterBean {
        public void setValue(int v) { throw new IllegalStateException("boom"); }
    }

    static class InjectBean {
        @JacksonInject("token")
        public String injected;
        public int a;
    }

    @JsonIgnoreProperties({"classIgnored"})
    static class InnerMerge {
        public String visible;
        public String secret;
        public String classIgnored;
    }

    static class OuterMerge {
        @JsonIgnoreProperties({"secret"})
        public InnerMerge inner;
    }

    static class Parent {
        public String name;
        @JsonManagedReference
        public List<Child> children;
    }

    static class Child {
        public String name;
        @JsonBackReference
        public Parent parent;
    }

    // ===================================================================
    // 1) Accessors พื้นฐาน
    // ===================================================================

    @Test
    public void testAccessors_basic() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\"x\"}");
        assertTrue(d.isCachable());
        assertEquals(SimpleBean.class, d.handledType());
        assertEquals(SimpleBean.class, d.getBeanClass());
        assertEquals(SimpleBean.class, d.getValueType().getRawClass());
        assertEquals(2, d.getPropertyCount());
        assertTrue(d.hasProperty("a"));
        assertFalse(d.hasProperty("nonexistent"));
        assertNotNull(d.findProperty("a"));
        assertNotNull(d.findProperty(new PropertyName("b")));
        assertNull(d.findProperty("nonexistent"));
        assertFalse(d.hasViews());
        assertNull(d.getObjectIdReader());
        assertNotNull(d.getValueInstantiator());
        Collection<Object> names = d.getKnownPropertyNames();
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));
    }

    @Test
    public void testAccessors_emptyBean() throws Exception {
        BeanDeserializerBase d = captureDeserializer(EmptyBean.class, EmptyBean.class, "{}");
        assertEquals(0, d.getPropertyCount());
        assertTrue(d.getKnownPropertyNames().isEmpty());
        assertFalse(d.properties().hasNext());
    }

    @Test
    public void testFindPropertyByIndex_boundary() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\"x\"}");
        assertNotNull(d.findProperty(0));
        assertNotNull(d.findProperty(1));
        // out-of-range index: ไม่มี propertyBasedCreator -> ต้องได้ null
        assertNull(d.findProperty(99));
    }

    @Test
    public void testCreatorProperties_emptyWhenNoPropertyBasedCreator() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\"x\"}");
        assertFalse(d.creatorProperties().hasNext());
    }

    @Test
    public void testCreatorProperties_nonEmptyWithPropertyBasedCreator() throws Exception {
        BeanDeserializerBase d = captureDeserializer(CreatorPropsBean.class, CreatorPropsBean.class,
                "{\"x\":5,\"y\":\"hi\"}");
        Iterator<SettableBeanProperty> it = d.creatorProperties();
        int count = 0;
        while (it.hasNext()) { it.next(); count++; }
        assertEquals(2, count);
    }

    @Test
    public void testFindBackReference_nullWhenNoBackRefs() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\"x\"}");
        assertNull(d.findBackReference("anything"));
    }

    @Test
    public void testFindBackReference_withManagedBackRef() throws Exception {
        BeanDeserializerBase childDeser = captureDeserializer(Child.class, Parent.class,
                "{\"name\":\"dad\",\"children\":[{\"name\":\"kid\"}]}");
        // logical name ว่าง ("") เป็นค่า default ของ @JsonManagedReference/@JsonBackReference
        SettableBeanProperty backProp = childDeser.findBackReference("");
        assertNotNull(backProp);
        assertNull(childDeser.findBackReference("not-exist"));
    }

    @Test
    public void testReplaceProperty_noException() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\"x\"}");
        SettableBeanProperty original = d.findProperty("a");
        assertNotNull(original);
        d.replaceProperty(original, original); // ใส่ค่าเดิมกลับเข้าไปเพื่อไม่ทำลาย state
        assertNotNull(d.findProperty("a"));
    }

    // ===================================================================
    // 2) handleUnknownProperty / handleIgnoredProperty
    // ===================================================================

    @Test
    public void testHandleUnknown_ignoreAllUnknownTrue_noException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        IgnoreUnknownBean result = mapper.readValue("{\"a\":1,\"extra\":123}", IgnoreUnknownBean.class);
        assertEquals(1, result.a);
    }

    @Test
    public void testHandleUnknown_default_throwsException() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue("{\"a\":1,\"extra\":123}", SimpleBean.class);
            fail("expected exception for unknown property");
        } catch (IOException e) {
            assertTrue(e instanceof JsonMappingException);
        }
    }

    @Test
    public void testHandleUnknown_featureDisabled_noException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        SimpleBean result = mapper.readValue("{\"a\":1,\"extra\":123}", SimpleBean.class);
        assertEquals(1, result.a);
    }

    @Test
    public void testHandleIgnoredProperty_defaultSkip() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        IgnorablePropBean result = mapper.readValue("{\"a\":1,\"ignoredProp\":999}", IgnorablePropBean.class);
        assertEquals(1, result.a);
    }

    @Test
    public void testHandleIgnoredProperty_failEnabled_throws() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, true);
        try {
            mapper.readValue("{\"a\":1,\"ignoredProp\":999}", IgnorablePropBean.class);
            fail("expected IgnoredPropertyException");
        } catch (IOException e) {
            assertTrue(e instanceof IgnoredPropertyException);
        }
    }

    // ===================================================================
    // 3) deserializeFromString / Boolean / Number / Double
    // ===================================================================

    @Test
    public void testDeserializeFromString_scalarCreator() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        StringCreatorBean r = mapper.readValue("\"hello\"", StringCreatorBean.class);
        assertEquals("hello", r.value);
    }

    @Test
    public void testDeserializeFromBoolean_scalarCreator() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BooleanCreatorBean r = mapper.readValue("true", BooleanCreatorBean.class);
        assertTrue(r.value);
    }

    @Test
    public void testDeserializeFromNumber_intCreator() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        IntCreatorBean r = mapper.readValue("5", IntCreatorBean.class);
        assertEquals(5, r.value);
    }

    @Test
    public void testDeserializeFromDouble_doubleCreator() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DoubleCreatorBean r = mapper.readValue("5.5", DoubleCreatorBean.class);
        assertEquals(5.5, r.value, 0.0001);
    }

    @Test
    public void testDeserializeFromString_delegateFallback_uuid() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String uuidStr = "550e8400-e29b-41d4-a716-446655440000";
        UuidDelegateBean r = mapper.readValue("\"" + uuidStr + "\"", UuidDelegateBean.class);
        assertEquals(UUID.fromString(uuidStr), r.id);
    }

    @Test
    public void testDeserializeFromNumber_bigIntegerDelegateFallback() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BigIntDelegateBean r = mapper.readValue("12345678901234567890", BigIntDelegateBean.class);
        assertEquals(new BigInteger("12345678901234567890"), r.val);
    }

    @Test
    public void testDeserializeFromDouble_bigDecimalDelegateFallback() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BigDecDelegateBean r = mapper.readValue("1.23456789012345678901234567890E+10", BigDecDelegateBean.class);
        assertNotNull(r.val);
    }

    @Test
    public void testDeserializeFromNumber_noCreator_throws() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue("5", SimpleBean.class);
            fail("expected exception - no creator supports number");
        } catch (IOException expected) {
            // ok
        }
    }

    // ===================================================================
    // 4) deserializeFromArray
    // ===================================================================

    @Test
    public void testDeserializeFromArray_unwrapSingleValue_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        SimpleBean r = mapper.readValue("[{\"a\":1,\"b\":\"x\"}]", SimpleBean.class);
        assertEquals(1, r.a);
    }

    @Test
    public void testDeserializeFromArray_unwrapSingleValue_tooManyElements_throws() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        try {
            mapper.readValue("[{\"a\":1},{\"a\":2}]", SimpleBean.class);
            fail("expected exception due to extra array elements");
        } catch (IOException expected) {
            // ok - handleMissingEndArrayForSingle
        }
    }

    @Test
    public void testDeserializeFromArray_emptyArrayAsNull_withUnwrap() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
        SimpleBean r = mapper.readValue("[]", SimpleBean.class);
        assertNull(r);
    }

    @Test
    public void testDeserializeFromArray_emptyArrayAsNull_withoutUnwrap() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
        SimpleBean r = mapper.readValue("[]", SimpleBean.class);
        assertNull(r);
    }

    @Test
    public void testDeserializeFromArray_defaultNoFeature_throws() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue("[1,2]", SimpleBean.class);
            fail("expected exception: array not acceptable by default");
        } catch (IOException expected) {
            // ok
        }
    }

    @Test
    public void testDeserializeFromArray_arrayDelegateCreator_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ArrayDelegateBean r = mapper.readValue("[1,2,3]", ArrayDelegateBean.class);
        assertEquals(Arrays.asList(1, 2, 3), r.items);
    }

    @Test
    public void testDeserializeFromArray_arrayDelegateCreator_exceptionWrapped() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue("[\"a\",\"b\"]", ArrayDelegateBean.class);
            fail("expected exception due to invalid element type");
        } catch (IOException expected) {
            // ok - wrapInstantiationProblem rethrows IOException as-is
        }
    }

    /**
     * *** BUG-DETECTING TEST (Defects4J JacksonDatabind-68) ***
     * DelegateToArrayShapeBean ใช้ delegate creator ปรกติ (ไม่ใช่ array-delegate)
     * โดย delegate type (Point) ถูก deserialize จาก JSON array ได้ (shape=ARRAY)
     * ทำให้ deserializeFromArray ตกไปที่ "fallback to non-array delegate"
     * ซึ่งตามคอมเมนต์ในซอร์สควรใช้ _valueInstantiator.createUsingDelegate(...)
     * แต่ตัวจริงเรียก createUsingArrayDelegate(...) -> เป็น defect ที่คาดว่า
     * จะทำให้ test นี้ fail บนเวอร์ชัน buggy (68b)
     */
    @Test
    public void testDeserializeFromArray_delegateFallback_bugDetection() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DelegateToArrayShapeBean r = mapper.readValue("[3,4]", DelegateToArrayShapeBean.class);
        assertNotNull(r.point);
        assertEquals(3, r.point.x);
        assertEquals(4, r.point.y);
    }

    // ===================================================================
    // 5) deserializeFromEmbedded (direct call ผ่าน mock)
    // ===================================================================

    @Test
    public void testDeserializeFromEmbedded_direct() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\"x\"}");
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object embedded = new Object();
        when(p.getEmbeddedObject()).thenReturn(embedded);
        Object result = d.deserializeFromEmbedded(p, ctxt);
        assertSame(embedded, result);
    }

    // ===================================================================
    // 6) deserializeFromObjectUsingNonDefault
    // ===================================================================

    @Test
    public void testDeserializeFromObjectUsingNonDefault_delegateMap() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DelegateMapBean r = mapper.readValue("{\"x\":1,\"y\":2}", DelegateMapBean.class);
        assertEquals(Integer.valueOf(1), r.data.get("x"));
        assertEquals(Integer.valueOf(2), r.data.get("y"));
    }

    @Test
    public void testDeserializeFromObjectUsingNonDefault_noCreator_nonAbstract() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\"x\"}");
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object sentinel = new Object();
        when(ctxt.handleMissingInstantiator(eq(SimpleBean.class), any(JsonParser.class), anyString()))
                .thenReturn(sentinel);
        Object result = d.deserializeFromObjectUsingNonDefault(p, ctxt);
        assertSame(sentinel, result);
    }

    // ===================================================================
    // 7) deserializeWithType
    // ===================================================================

    @Test
    public void testDeserializeWithType_noObjectIdReader() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\"x\"}");
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        TypeDeserializer td = mock(TypeDeserializer.class);
        Object sentinel = new Object();
        when(td.deserializeTypedFromObject(p, ctxt)).thenReturn(sentinel);
        Object result = d.deserializeWithType(p, ctxt, td);
        assertSame(sentinel, result);
    }

    @Test
    public void testDeserializeWithType_withObjectIdReader() throws Exception {
        BeanDeserializerBase d = captureDeserializer(AutoIdBean.class, AutoIdBean.class, "{\"name\":\"x\"}");
        assertNotNull(d.getObjectIdReader());

        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        TypeDeserializer td = mock(TypeDeserializer.class);
        Object pojo = new Object();

        when(p.canReadObjectId()).thenReturn(true);
        when(p.getObjectId()).thenReturn(Integer.valueOf(7));
        when(td.deserializeTypedFromObject(p, ctxt)).thenReturn(pojo);
        ReadableObjectId roid = mock(ReadableObjectId.class);
        when(ctxt.findObjectId(any(), any(), any())).thenReturn(roid);

        Object result = d.deserializeWithType(p, ctxt, td);
        assertSame(pojo, result);
        verify(roid).bindItem(pojo);
    }

    // ===================================================================
    // 8) injectValues + ObjectId round trip (integration)
    // ===================================================================

    @Test
    public void testInjectValues_viaJacksonInject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        InjectBean r = mapper.readerFor(InjectBean.class)
                .with(new InjectableValues.Std().addValue("token", "secretVal"))
                .readValue("{\"a\":1}");
        assertEquals("secretVal", r.injected);
        assertEquals(1, r.a);
    }

    @Test
    public void testObjectIdReference_listRoundTrip() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        List<IdBean> list = mapper.readValue("[{\"id\":1,\"name\":\"Bob\"},1]",
                mapper.getTypeFactory().constructCollectionType(List.class, IdBean.class));
        assertEquals(2, list.size());
        assertSame(list.get(0), list.get(1));
        assertEquals("Bob", list.get(1).name);
    }

    @Test
    public void testObjectIdReader_nullWhenNoAnnotation() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\"x\"}");
        assertNull(d.getObjectIdReader());
    }

    // ===================================================================
    // 9) wrapAndThrow / throwOrReturnThrowable (ผ่าน wrapAndThrow)
    // ===================================================================

    @Test
    public void testWrapAndThrow_plainIOException() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\"x\"}");
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)).thenReturn(true);
        IOException io = new IOException("orig-io");
        try {
            d.wrapAndThrow(io, new SimpleBean(), "fieldX", ctxt);
            fail("expected IOException passthrough");
        } catch (IOException e) {
            assertSame(io, e);
        }
    }

    @Test
    public void testWrapAndThrow_jsonProcessingException_wrapDisabled() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\"x\"}");
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)).thenReturn(false);
        JsonMappingException jme = new JsonMappingException((JsonParser) null, "jme-fail");
        try {
            d.wrapAndThrow(jme, new SimpleBean(), "fieldX", ctxt);
            fail("expected passthrough of JsonMappingException when wrap disabled");
        } catch (IOException e) {
            assertSame(jme, e);
        }
    }

    @Test
    public void testWrapAndThrow_runtimeException_wrapDisabled() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\"x\"}");
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)).thenReturn(false);
        RuntimeException re = new RuntimeException("boom-rt");
        try {
            d.wrapAndThrow(re, new SimpleBean(), "fieldX", ctxt);
            fail("expected RuntimeException passthrough");
        } catch (RuntimeException e) {
            assertSame(re, e);
        }
    }

    @Test
    public void testWrapAndThrow_runtimeException_wrapEnabled_wrapsAsJsonMappingException() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\"x\"}");
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)).thenReturn(true);
        RuntimeException re = new RuntimeException("boom-rt2");
        try {
            d.wrapAndThrow(re, new SimpleBean(), "fieldX", ctxt);
            fail("expected wrapped JsonMappingException");
        } catch (JsonMappingException e) {
            // expected - wrapped
        }
    }

    @Test
    public void testWrapAndThrow_error() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\"x\"}");
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Error err = new Error("simulated-error");
        try {
            d.wrapAndThrow(err, new SimpleBean(), "fieldX", ctxt);
            fail("expected Error passthrough");
        } catch (Error e) {
            assertSame(err, e);
        }
    }

    // ===================================================================
    // 10) wrapInstantiationProblem
    // ===================================================================

    @Test
    public void testWrapInstantiationProblem_ioExceptionPassthrough() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\"x\"}");
        DeserializationContext ctxt = mock(DeserializationContext.class);
        IOException io = new IOException("io-fail");
        try {
            d.wrapInstantiationProblem(io, ctxt);
            fail("expected IOException");
        } catch (IOException e) {
            assertSame(io, e);
        }
    }

    @Test
    public void testWrapInstantiationProblem_runtimeExceptionRethrownWhenWrapDisabled() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\"x\"}");
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)).thenReturn(false);
        RuntimeException re = new RuntimeException("boom-rt3");
        try {
            d.wrapInstantiationProblem(re, ctxt);
            fail("expected RuntimeException");
        } catch (RuntimeException e) {
            assertSame(re, e);
        }
    }

    @Test
    public void testWrapInstantiationProblem_wrapEnabled_delegates() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\"x\"}");
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)).thenReturn(true);
        RuntimeException re = new RuntimeException("boom-rt4");
        Object sentinel = new Object();
        when(ctxt.handleInstantiationProblem(eq(SimpleBean.class), isNull(), eq((Throwable) re)))
                .thenReturn(sentinel);
        Object result = d.wrapInstantiationProblem(re, ctxt);
        assertSame(sentinel, result);
    }

    // ===================================================================
    // 11) findConvertingDeserializer
    // ===================================================================

    @Test
    public void testFindConvertingDeserializer_noIntrospector() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\"x\"}");
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.getAnnotationIntrospector()).thenReturn(null);
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        assertNull(d.findConvertingDeserializer(ctxt, prop));
    }

    @Test
    public void testFindConvertingDeserializer_noConverterDefined() throws Exception {
        BeanDeserializerBase d = captureDeserializer(SimpleBean.class, SimpleBean.class, "{\"a\":1,\"b\":\