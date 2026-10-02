# คำอธิบายแนวทางการทดสอบ

เนื่องจาก `SerializerProvider` เป็น abstract class ผมจึงสร้าง concrete subclass ชื่อ `TestableSerializerProvider` เพื่อ implement abstract method ที่จำเป็น (ไม่ใช้ mock เพราะ method เหล่านี้ไม่ได้ถูกเรียกใน path ที่เราทดสอบ) และใช้ `ObjectMapper` + `BeanSerializerFactory.instance` (ซึ่งเป็นส่วนหนึ่งของโปรเจกต์เดียวกัน ไม่ใช่ jar ภายนอก) เพื่อสร้าง `SerializationConfig` จริงสำหรับสร้าง instance ที่ไม่ใช่ blueprint

**หมายเหตุสำคัญ (ไม่ได้เดา แต่อ่านจาก source ตรง ๆ):** ใน copy-constructor `SerializerProvider(SerializerProvider src, SerializationConfig config, SerializerFactory f)` มีบรรทัด
```java
_stdNullValueSerializer = (_nullValueSerializer == DEFAULT_NULL_KEY_SERIALIZER);
```
ซึ่งเทียบ `_nullValueSerializer` (ค่า default คือ `NullSerializer.instance`) กับ `DEFAULT_NULL_KEY_SERIALIZER` (ซึ่งคือ `FailingSerializer` สำหรับ **key** ไม่ใช่ value) — นี่คือจุดที่น่าสงสัยว่าอาจเป็น fault ผมจึงเขียนเทสต์เพื่อ "บันทึกพฤติกรรมจริง" ของโค้ดตรงนี้ไว้อย่างชัดเจน (ดู `testStdNullValueSerializerFlag_*` และ `testDefaultSerializeNull_*`)

```java
package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.IOException;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.mockito.Matchers;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;

/**
 * JUnit4 tests for {@link SerializerProvider} (Defects4J JacksonDatabind-103b).
 *
 * NOTE: SerializerProvider is abstract; a minimal concrete subclass is used purely
 * to allow instantiation. Behavior of abstract methods themselves is out of scope
 * (not part of the target source), so stubs return trivial/null values.
 */
public class SerializerProviderTest {

    // =====================================================================
    // Test doubles
    // =====================================================================

    static class TestableSerializerProvider extends SerializerProvider {
        public TestableSerializerProvider() { super(); }
        public TestableSerializerProvider(SerializerProvider src, SerializationConfig config, SerializerFactory f) {
            super(src, config, f);
        }
        public TestableSerializerProvider(SerializerProvider src) { super(src); }

        @Override
        public WritableObjectId findObjectId(Object forPojo, ObjectIdGenerator<?> generatorType) {
            return null;
        }
        @Override
        public JsonSerializer<Object> serializerInstance(Annotated annotated, Object serDef) throws JsonMappingException {
            return null;
        }
        @Override
        public Object includeFilterInstance(BeanPropertyDefinition forProperty, Class<?> filterClass) throws JsonMappingException {
            return null;
        }
        @Override
        public boolean includeFilterSuppressNulls(Object filter) throws JsonMappingException {
            return false;
        }
    }

    static class ThrowingNullSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) {
            throw new RuntimeException("throwing-null-serializer-invoked");
        }
    }

    static class StubContextualSerializer extends JsonSerializer<Object> implements ContextualSerializer {
        boolean called = false;
        final JsonSerializer<Object> result;
        StubContextualSerializer(JsonSerializer<Object> result) { this.result = result; }
        @Override public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) {}
        @Override public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property) {
            called = true;
            return result;
        }
    }

    static class StubResolvableSerializer extends JsonSerializer<Object> implements ResolvableSerializer {
        boolean resolved = false;
        @Override public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) {}
        @Override public void resolve(SerializerProvider provider) { resolved = true; }
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
    static class TypedThing {
        public int x = 1;
    }

    static class PlainThing {
        public int y = 2;
    }

    static class SamplePojo {
        public int value = 5;
    }

    // =====================================================================
    // helpers
    // =====================================================================

    private SerializerProvider newBlueprint() {
        return new TestableSerializerProvider();
    }

    private SerializerProvider newRealProvider(ObjectMapper mapper) {
        SerializerProvider bp = newBlueprint();
        return new TestableSerializerProvider(bp, mapper.getSerializationConfig(), BeanSerializerFactory.instance);
    }

    private SerializerProvider newRealProviderWithNullValueSerializer(ObjectMapper mapper, JsonSerializer<Object> nullSer) {
        SerializerProvider bp = newBlueprint();
        bp.setNullValueSerializer(nullSer);
        return new TestableSerializerProvider(bp, mapper.getSerializationConfig(), BeanSerializerFactory.instance);
    }

    private static boolean readStdNullFlag(SerializerProvider sp) throws Exception {
        Field f = SerializerProvider.class.getDeclaredField("_stdNullValueSerializer");
        f.setAccessible(true);
        return f.getBoolean(sp);
    }

    // =====================================================================
    // Constructors
    // =====================================================================

    @Test
    public void testBlueprintConstructor_defaults() {
        SerializerProvider bp = newBlueprint();
        assertNull(bp.getConfig());
        assertNull(bp.getActiveView());
        assertNull(bp.getGenerator());
        assertSame(SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER, bp.getDefaultNullKeySerializer());
        assertSame(NullSerializer.instance, bp.getDefaultNullValueSerializer());
    }

    @Test
    public void testCopyConstructorForRealInstance_setsConfigAndFactory() {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider real = newRealProvider(mapper);
        assertNotNull(real.getConfig());
        assertEquals(mapper.getSerializationConfig().getActiveView(), real.getActiveView());
    }

    @Test
    public void testBlueprintCopyConstructor_since25_copiesFieldsButNoConfig() {
        SerializerProvider src = newBlueprint();
        SerializerProvider copy = new TestableSerializerProvider(src);
        assertNull(copy.getConfig());
        assertNull(copy.getActiveView());
        assertSame(src.getDefaultNullKeySerializer(), copy.getDefaultNullKeySerializer());
        assertSame(src.getDefaultNullValueSerializer(), copy.getDefaultNullValueSerializer());
    }

    // =====================================================================
    // setters validation (if null -> throw / else -> set)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefaultKeySerializer_nullThrows() {
        newBlueprint().setDefaultKeySerializer(null);
    }

    @Test
    public void testSetDefaultKeySerializer_nonNull_noException() {
        SerializerProvider bp = newBlueprint();
        bp.setDefaultKeySerializer(NullSerializer.instance);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullValueSerializer_nullThrows() {
        newBlueprint().setNullValueSerializer(null);
    }

    @Test
    public void testSetNullValueSerializer_nonNull_reflectedInGetter() {
        SerializerProvider bp = newBlueprint();
        JsonSerializer<Object> custom = new ThrowingNullSerializer();
        bp.setNullValueSerializer(custom);
        assertSame(custom, bp.getDefaultNullValueSerializer());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullKeySerializer_nullThrows() {
        newBlueprint().setNullKeySerializer(null);
    }

    @Test
    public void testSetNullKeySerializer_nonNull_reflectedInGetter() {
        SerializerProvider bp = newBlueprint();
        JsonSerializer<Object> custom = new ThrowingNullSerializer();
        bp.setNullKeySerializer(custom);
        assertSame(custom, bp.getDefaultNullKeySerializer());
    }

    // =====================================================================
    // getUnknownTypeSerializer / isUnknownTypeSerializer
    // =====================================================================

    @Test
    public void testGetUnknownTypeSerializer_objectClass_returnsSharedInstance() {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        JsonSerializer<Object> s1 = provider.getUnknownTypeSerializer(Object.class);
        JsonSerializer<Object> s2 = provider.getUnknownTypeSerializer(Object.class);
        assertSame(s1, s2);
        assertTrue(s1 instanceof UnknownSerializer);
    }

    @Test
    public void testGetUnknownTypeSerializer_otherClass_returnsNewInstanceEachTime() {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        JsonSerializer<Object> s1 = provider.getUnknownTypeSerializer(String.class);
        JsonSerializer<Object> s2 = provider.getUnknownTypeSerializer(String.class);
        assertNotSame(s1, s2);
        assertTrue(s1 instanceof UnknownSerializer);
        assertTrue(s2 instanceof UnknownSerializer);
    }

    @Test
    public void testIsUnknownTypeSerializer_null_true() {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        assertTrue(provider.isUnknownTypeSerializer(null));
    }

    @Test
    public void testIsUnknownTypeSerializer_sharedInstance_true() {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        JsonSerializer<Object> shared = provider.getUnknownTypeSerializer(Object.class);
        assertTrue(provider.isUnknownTypeSerializer(shared));
    }

    @Test
    public void testIsUnknownTypeSerializer_unknownClass_failOnEmptyBeansEnabled_true() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, true);
        SerializerProvider provider = newRealProvider(mapper);
        JsonSerializer<Object> other = new UnknownSerializer(String.class);
        assertTrue(provider.isUnknownTypeSerializer(other));
    }

    @Test
    public void testIsUnknownTypeSerializer_unknownClass_failOnEmptyBeansDisabled_false() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        SerializerProvider provider = newRealProvider(mapper);
        JsonSerializer<Object> other = new UnknownSerializer(String.class);
        assertFalse(provider.isUnknownTypeSerializer(other));
    }

    @Test
    public void testIsUnknownTypeSerializer_regularSerializer_false() {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        assertFalse(provider.isUnknownTypeSerializer(NullSerializer.instance));
    }

    // =====================================================================
    // findValueSerializer (all overloads)
    // =====================================================================

    @Test
    public void testFindValueSerializer_nullJavaType_throwsMappingException() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        try {
            provider.findValueSerializer((JavaType) null, null);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Null passed"));
        }
    }

    @Test
    public void testFindValueSerializer_validClass_returnsNonNull() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        assertNotNull(provider.findValueSerializer(String.class, null));
    }

    @Test
    public void testFindValueSerializer_javaTypeOverload_returnsNonNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = newRealProvider(mapper);
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertNotNull(provider.findValueSerializer(type, null));
    }

    @Test
    public void testFindValueSerializer_classNoContextualization_variant() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        assertNotNull(provider.findValueSerializer(String.class));
    }

    @Test
    public void testFindValueSerializer_javaTypeNoContextualization_variant() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = newRealProvider(mapper);
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertNotNull(provider.findValueSerializer(type));
    }

    @Test
    public void testFindPrimaryPropertySerializer_class_returnsNonNull() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        assertNotNull(provider.findPrimaryPropertySerializer(String.class, null));
    }

    @Test
    public void testFindPrimaryPropertySerializer_javaType_returnsNonNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = newRealProvider(mapper);
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertNotNull(provider.findPrimaryPropertySerializer(type, null));
    }

    // =====================================================================
    // findTypedValueSerializer + findTypeSerializer (typeSer null/non-null branch)
    // =====================================================================

    @Test
    public void testFindTypedValueSerializer_class_plainType_noTypeWrapping() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        JsonSerializer<Object> ser = provider.findTypedValueSerializer(PlainThing.class, false, null);
        assertNotNull(ser);
        assertFalse(ser instanceof TypeWrappedSerializer);
    }

    @Test
    public void testFindTypedValueSerializer_class_typedAnnotated_wraps() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        JsonSerializer<Object> ser = provider.findTypedValueSerializer(TypedThing.class, false, null);
        assertNotNull(ser);
        assertTrue(ser instanceof TypeWrappedSerializer);
    }

    @Test
    public void testFindTypedValueSerializer_class_cacheTrue_secondCallHitsCache() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        JsonSerializer<Object> s1 = provider.findTypedValueSerializer(String.class, true, null);
        JsonSerializer<Object> s2 = provider.findTypedValueSerializer(String.class, true, null);
        assertNotNull(s1);
        assertSame(s1, s2);
    }

    @Test
    public void testFindTypedValueSerializer_javaType_plainType_noTypeWrapping() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = newRealProvider(mapper);
        JavaType type = mapper.getTypeFactory().constructType(PlainThing.class);
        JsonSerializer<Object> ser = provider.findTypedValueSerializer(type, false, null);
        assertNotNull(ser);
        assertFalse(ser instanceof TypeWrappedSerializer);
    }

    @Test
    public void testFindTypedValueSerializer_javaType_typedAnnotated_wraps() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = newRealProvider(mapper);
        JavaType type = mapper.getTypeFactory().constructType(TypedThing.class);
        JsonSerializer<Object> ser = provider.findTypedValueSerializer(type, true, null);
        assertNotNull(ser);
        assertTrue(ser instanceof TypeWrappedSerializer);
    }

    @Test
    public void testFindTypeSerializer_typedAnnotated_nonNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = newRealProvider(mapper);
        JavaType type = mapper.getTypeFactory().constructType(TypedThing.class);
        assertNotNull(provider.findTypeSerializer(type));
    }

    @Test
    public void testFindTypeSerializer_plainType_null() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = newRealProvider(mapper);
        JavaType type = mapper.getTypeFactory().constructType(PlainThing.class);
        assertNull(provider.findTypeSerializer(type));
    }

    // =====================================================================
    // findKeySerializer
    // =====================================================================

    @Test
    public void testFindKeySerializer_javaType_nonNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = newRealProvider(mapper);
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertNotNull(provider.findKeySerializer(type, null));
    }

    @Test
    public void testFindKeySerializer_classOverload_delegates() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        assertNotNull(provider.findKeySerializer(String.class, null));
    }

    // =====================================================================
    // null key/value serializer getters
    // =====================================================================

    @Test
    public void testFindNullKeySerializer_returnsFieldValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = newRealProvider(mapper);
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertSame(provider.getDefaultNullKeySerializer(), provider.findNullKeySerializer(type, null));
    }

    @Test
    public void testFindNullValueSerializer_returnsFieldValue() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        assertSame(provider.getDefaultNullValueSerializer(), provider.findNullValueSerializer(null));
    }

    // =====================================================================
    // handlePrimaryContextualization / handleSecondaryContextualization
    // =====================================================================

    @Test
    public void testHandlePrimaryContextualization_null_returnsNull() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        assertNull(provider.handlePrimaryContextualization(null, null));
    }

    @Test
    public void testHandlePrimaryContextualization_nonContextual_returnsSame() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        JsonSerializer<Object> plain = NullSerializer.instance;
        assertSame(plain, provider.handlePrimaryContextualization(plain, null));
    }

    @Test
    public void testHandlePrimaryContextualization_contextual_callsCreateContextual() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        JsonSerializer<Object> target = NullSerializer.instance;
        StubContextualSerializer stub = new StubContextualSerializer(target);
        JsonSerializer<?> result = provider.handlePrimaryContextualization(stub, null);
        assertTrue(stub.called);
        assertSame(target, result);
    }

    @Test
    public void testHandleSecondaryContextualization_null_returnsNull() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        assertNull(provider.handleSecondaryContextualization(null, null));
    }

    @Test
    public void testHandleSecondaryContextualization_nonContextual_returnsSame() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        JsonSerializer<Object> plain = NullSerializer.instance;
        assertSame(plain, provider.handleSecondaryContextualization(plain, null));
    }

    @Test
    public void testHandleSecondaryContextualization_contextual_callsCreateContextual() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        JsonSerializer<Object> target = NullSerializer.instance;
        StubContextualSerializer stub = new StubContextualSerializer(target);
        JsonSerializer<?> result = provider.handleSecondaryContextualization(stub, null);
        assertTrue(stub.called);
        assertSame(target, result);
    }

    // =====================================================================
    // _handleResolvable / _handleContextualResolvable (protected, same-package access)
    // =====================================================================

    @Test
    public void testHandleResolvable_resolvable_callsResolve() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        StubResolvableSerializer stub = new StubResolvableSerializer();
        JsonSerializer<Object> result = provider._handleResolvable(stub);
        assertTrue(stub.resolved);
        assertSame(stub, result);
    }

    @Test
    public void testHandleResolvable_nonResolvable_noResolveCall() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        JsonSerializer<Object> plain = NullSerializer.instance;
        assertSame(plain, provider._handleResolvable(plain));
    }

    @Test
    public void testHandleContextualResolvable_resolvableAndContextual() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        final boolean[] resolved = {false};
        final JsonSerializer<Object> target = NullSerializer.instance;
        class Combo extends JsonSerializer<Object> implements ResolvableSerializer, ContextualSerializer {
            @Override public void serialize(Object value, JsonGenerator gen, SerializerProvider p) {}
            @Override public void resolve(SerializerProvider p) { resolved[0] = true; }
            @Override public JsonSerializer<?> createContextual(SerializerProvider p, BeanProperty property) {
                return target;
            }
        }
        JsonSerializer<Object> result = provider._handleContextualResolvable(new Combo(), null);
        assertTrue(resolved[0]);
        assertSame(target, result);
    }

    @Test
    public void testHandleContextualResolvable_nonResolvableNonContextual_returnsSame() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        JsonSerializer<Object> plain = NullSerializer.instance;
        assertSame(plain, provider._handleContextualResolvable(plain, null));
    }

    // =====================================================================
    // _stdNullValueSerializer flag & defaultSerializeNull branches
    // (documents literal source behavior: comparison is against
    //  DEFAULT_NULL_KEY_SERIALIZER, not against the default *value* serializer)
    // =====================================================================

    @Test
    public void testStdNullValueSerializerFlag_defaultScenario_isFalse() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        assertFalse(readStdNullFlag(provider));
    }

    @Test
    public void testStdNullValueSerializerFlag_whenNullValueSerializerEqualsDefaultNullKeySerializer_isTrue() throws Exception {
        SerializerProvider provider = newRealProviderWithNullValueSerializer(
                new ObjectMapper(), SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER);
        assertTrue(readStdNullFlag(provider));
    }

    @Test
    public void testDefaultSerializeNull_defaultScenario_writesNullViaGenerator() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        JsonGenerator gen = mock(JsonGenerator.class);
        provider.defaultSerializeNull(gen);
        verify(gen).writeNull();
    }

    @Test
    public void testDefaultSerializeNull_customDistinctSerializer_elseBranchInvokesCustom() throws Exception {
        SerializerProvider provider = newRealProviderWithNullValueSerializer(
                new ObjectMapper(), new ThrowingNullSerializer());
        JsonGenerator gen = mock(JsonGenerator.class);
        try {
            provider.defaultSerializeNull(gen);
            fail("expected custom null serializer to be invoked and throw");
        } catch (RuntimeException e) {
            assertEquals("throwing-null-serializer-invoked", e.getMessage());
        }
    }

    @Test
    public void testDefaultSerializeNull_nullValueSerializerEqualsDefaultNullKeySerializer_bypassesCustomSerializer()
            throws Exception {
        // Even though FailingSerializer (DEFAULT_NULL_KEY_SERIALIZER) is set as the
        // "null value" serializer (which would normally throw on serialize()), because
        // _stdNullValueSerializer evaluates true here, gen.writeNull() is called directly
        // and FailingSerializer.serialize() is never invoked -> no exception.
        SerializerProvider provider = newRealProviderWithNullValueSerializer(
                new ObjectMapper(), SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER);
        JsonGenerator gen = mock(JsonGenerator.class);
        provider.defaultSerializeNull(gen);
        verify(gen).writeNull();
    }

    // =====================================================================
    // defaultSerializeValue / defaultSerializeField
    // =====================================================================

    @Test
    public void testDefaultSerializeValue_nullValue_writesNull() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        JsonGenerator gen = mock(JsonGenerator.class);
        provider.defaultSerializeValue(null, gen);
        verify(gen).writeNull();
    }

    @Test
    public void testDefaultSerializeValue_nonNullValue_writesThroughSerializer() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        JsonGenerator gen = mock(JsonGenerator.class);
        provider.defaultSerializeValue("hello", gen);
        verify(gen).writeString("hello");
    }

    @Test
    public void testDefaultSerializeField_nullValue_writesFieldNameThenNull() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        JsonGenerator gen = mock(JsonGenerator.class);
        provider.defaultSerializeField("f", null, gen);
        verify(gen).writeFieldName("f");
        verify(gen).writeNull();
    }

    @Test
    public void testDefaultSerializeField_nonNullValue_writesFieldNameThenValue() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        JsonGenerator gen = mock(JsonGenerator.class);
        provider.defaultSerializeField("f", "hello", gen);
        verify(gen).writeFieldName("f");
        verify(gen).writeString("hello");
    }

    // =====================================================================
    // defaultSerializeDateValue / defaultSerializeDateKey
    // =====================================================================

    @Test
    public void testDefaultSerializeDateValue_timestampBranch_long() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        SerializerProvider provider = newRealProvider(mapper);
        JsonGenerator gen = mock(JsonGenerator.class);
        provider.defaultSerializeDateValue(12345L, gen);
        verify(gen).writeNumber(12345L);
    }

    @Test
    public void testDefaultSerializeDateValue_textBranch_long() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SerializerProvider provider = newRealProvider(mapper);
        JsonGenerator gen = mock(JsonGenerator.class);
        provider.defaultSerializeDateValue(12345L, gen);
        verify(gen).writeString(Matchers.anyString());
    }

    @Test
    public void testDefaultSerializeDateValue_timestampBranch_dateObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        SerializerProvider provider = newRealProvider(mapper);
        JsonGenerator gen = mock(JsonGenerator.class);
        provider.defaultSerializeDateValue(new Date(99999L), gen);
        verify(gen).writeNumber(99999L);
    }

    @Test
    public void testDefaultSerializeDateValue_textBranch_dateObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SerializerProvider provider = newRealProvider(mapper);
        JsonGenerator gen = mock(JsonGenerator.class);
        provider.defaultSerializeDateValue(new Date(99999L), gen);
        verify(gen).writeString(Matchers.anyString());
    }

    @Test
    public void testDefaultSerializeDateKey_timestampBranch_long() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, true);
        SerializerProvider provider = newRealProvider(mapper);
        JsonGenerator gen = mock(JsonGenerator.class);
        provider.defaultSerializeDateKey(555L, gen);
        verify(gen).writeFieldName(String.valueOf(555L));
    }

    @Test
    public void testDefaultSerializeDateKey_textBranch_long() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
        SerializerProvider provider = newRealProvider(mapper);
        JsonGenerator gen = mock(JsonGenerator.class);
        provider.defaultSerializeDateKey(555L, gen);
        verify(gen).writeFieldName(Matchers.anyString());
    }

    @Test
    public void testDefaultSerializeDateKey_timestampBranch_dateObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, true);
        SerializerProvider provider = newRealProvider(mapper);
        JsonGenerator gen = mock(JsonGenerator.class);
        provider.defaultSerializeDateKey(new Date(777L), gen);
        verify(gen).writeFieldName(String.valueOf(777L));
    }

    @Test
    public void testDefaultSerializeDateKey_textBranch_dateObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
        SerializerProvider provider = newRealProvider(mapper);
        JsonGenerator gen = mock(JsonGenerator.class);
        provider.defaultSerializeDateKey(new Date(777L), gen);
        verify(gen).writeFieldName(Matchers.anyString());
    }

    // =====================================================================
    // _dateFormat caching
    // =====================================================================

    @Test
    public void testDateFormat_cachedAfterFirstCall() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        DateFormat first = provider._dateFormat();
        DateFormat second = provider._dateFormat();
        assertSame(first, second);
    }

    @Test
    public void testDateFormat_isCloneOfConfigDateFormat() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = newRealProvider(mapper);
        DateFormat configFormat = mapper.getSerializationConfig().getDateFormat();
        DateFormat used = provider._dateFormat();
        assertNotSame(configFormat, used);
        assertEquals(configFormat.getClass(), used.getClass());
    }

    // =====================================================================
    // Access to general configuration delegation
    // =====================================================================

    @Test
    public void testConfigDelegationMethods() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = newRealProvider(mapper);
        SerializationConfig config = mapper.getSerializationConfig();

        assertSame(config, provider.getConfig());
        assertSame(config.getAnnotationIntrospector(), provider.getAnnotationIntrospector());
        assertSame(config.getTypeFactory(), provider.getTypeFactory());
        assertEquals(config.canOverrideAccessModifiers(), provider.canOverrideAccessModifiers());
        assertEquals(config.getLocale(), provider.getLocale());
        assertEquals(config.getTimeZone(), provider.getTimeZone());
        assertSame(config.getFilterProvider(), provider.getFilterProvider());
        assertNull(provider.getGenerator());
        assertEquals(config.getActiveView(), provider.getActiveView());
        assertEquals(provider.getActiveView(), provider.getSerializationView());
        assertNotNull(provider.getDefaultPropertyFormat(Object.class));
        assertNotNull(provider.getDefaultPropertyInclusion(Object.class));
    }

    @Test
    public void testIsEnabled_mapperFeature_and_serializationFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, true);
        SerializerProvider provider = newRealProvider(mapper);
        assertTrue(provider.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS));
        assertEquals(mapper.getSerializationConfig().isEnabled(MapperFeature.USE_ANNOTATIONS),
                provider.isEnabled(MapperFeature.USE_ANNOTATIONS));
    }

    @Test
    public void testHasSerializationFeatures_trueAndFalse() throws Exception {
        ObjectMapper mapperOn = new ObjectMapper();
        mapperOn.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, true);
        SerializerProvider providerOn = newRealProvider(mapperOn);
        int mask = SerializationFeature.FAIL_ON_EMPTY_BEANS.getMask();
        assertTrue(providerOn.hasSerializationFeatures(mask));

        ObjectMapper mapperOff = new ObjectMapper();
        mapperOff.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        SerializerProvider providerOff = newRealProvider(mapperOff);
        assertFalse(providerOff.hasSerializationFeatures(mask));
    }

    // =====================================================================
    // Attributes
    // =====================================================================

    @Test
    public void testGetSetAttribute_roundTrip() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        Object key = "the-key";
        SerializerProvider returned = provider.setAttribute(key, "the-value");
        assertSame(provider, returned);
        assertEquals("the-value", provider.getAttribute(key));
    }

    @Test
    public void testGetAttribute_unsetKey_returnsNull() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        assertNull(provider.getAttribute("no-such-key"));
    }

    // =====================================================================
    // Error reporting
    // =====================================================================

    @Test
    public void testReportMappingProblem_simpleMessage() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        try {
            provider.reportMappingProblem("Some problem");
            fail("expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Some problem"));
        }
    }

    @Test
    public void testReportMappingProblem_withThrowableCause() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        RuntimeException cause = new RuntimeException("original");
        try {
            provider.reportMappingProblem(cause, "Wrapping error");
            fail("expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Wrapping error"));
            assertSame(cause, e.getCause());
        }
    }

    @Test
    public void testReportBadTypeDefinition_nullBean() throws Exception {
        SerializerProvider provider = newRealProvider(new ObjectMapper());
        try {
            provider.reportBadTypeDefinition(null, "problem");
            fail("expected InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            assertTrue(e.getMessage().contains("N/A"));
            assertTrue(e.getMessage().contains("problem"));
        }
    }

    @Test
    public void testReportB