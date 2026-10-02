# วิเคราะห์และแผนการทดสอบ

จากการวิเคราะห์ซอร์สโค้ด `DefaultSerializerProvider` พบว่าเป็น abstract class ที่ต้องใช้ผ่าน inner class `Impl` (public, final) โดยสร้าง instance จริงผ่าน `createInstance(SerializationConfig, SerializerFactory)` ซึ่งเป็น public method จึงสามารถเรียกใช้ได้โดยไม่ต้องอยู่ package เดียวกัน แต่ผมจะวางไฟล์ทดสอบไว้ใน package เดียวกับคลาสเป้าหมายเพื่อให้เข้าถึง protected constructor ของ anonymous subclass ได้สะดวก

**หมายเหตุสำคัญ**: บาง branch พึ่งพา method ที่ไม่ได้แสดงในซอร์สที่ให้มา (เช่น `_findExplicitUntypedSerializer`, `reportBadDefinition`, `_handleResolvable`, `_reportIncompatibleRootType`) ผมจะกำกับด้วยคอมเมนต์ `// ASSUMPTION:` ทุกจุดที่ต้องอนุมานจาก naming convention หรือ Jackson behavior ที่เป็นที่รู้จักทั่วไป โดยไม่ยืนยัน exact exception subtype เกินกว่าที่ signature ระบุไว้

```java
package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.io.StringWriter;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;

public class DefaultSerializerProviderTest {

    // ---------- Helper POJOs / Serializers ----------

    public static class SimpleBean {
        public int x = 1;
    }

    public static class DummyFilter {
        // public no-arg ctor -> used with ClassUtil.createInstance
    }

    public static class DummySer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider sp) { }
    }

    public static class ExplicitTarget { }

    public static class ExplicitTargetSerializer extends JsonSerializer<ExplicitTarget> {
        @Override
        public void serialize(ExplicitTarget value, JsonGenerator gen, SerializerProvider sp) { }
    }

    public static class PlainClass {
        public int y = 1;
    }

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    private DefaultSerializerProvider buildProvider(ObjectMapper m) {
        DefaultSerializerProvider.Impl blueprint = new DefaultSerializerProvider.Impl();
        return blueprint.createInstance(m.getSerializationConfig(), BeanSerializerFactory.instance);
    }

    private DefaultSerializerProvider buildProviderWithConfig(SerializationConfig cfg) {
        DefaultSerializerProvider.Impl blueprint = new DefaultSerializerProvider.Impl();
        return blueprint.createInstance(cfg, BeanSerializerFactory.instance);
    }

    // ===================================================================
    // createInstance / copy()
    // ===================================================================

    @Test
    public void testCreateInstance_returnsImplInstance() {
        DefaultSerializerProvider.Impl blueprint = new DefaultSerializerProvider.Impl();
        DefaultSerializerProvider instance =
                blueprint.createInstance(mapper.getSerializationConfig(), BeanSerializerFactory.instance);
        assertNotNull(instance);
        assertTrue(instance instanceof DefaultSerializerProvider.Impl);
        assertNotSame(blueprint, instance);
    }

    @Test
    public void testImplCopy_returnsNewInstanceOfSameClass() {
        // Branch: getClass() == Impl.class -> new Impl(this)
        DefaultSerializerProvider.Impl impl = new DefaultSerializerProvider.Impl();
        DefaultSerializerProvider copied = impl.copy();
        assertNotNull(copied);
        assertNotSame(impl, copied);
        assertTrue(copied instanceof DefaultSerializerProvider.Impl);
    }

    @Test
    public void testBaseCopy_throwsIllegalStateException_whenNotOverridden() {
        // Branch: base class copy() throws IllegalStateException
        // ใช้ anonymous subclass ของ DefaultSerializerProvider (ไม่ override copy())
        DefaultSerializerProvider custom = new DefaultSerializerProvider() {
            @Override
            public DefaultSerializerProvider createInstance(SerializationConfig config, SerializerFactory jsf) {
                return this;
            }
        };
        try {
            custom.copy();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertTrue(expected.getMessage().contains("not overriding copy()"));
        }
    }

    // ===================================================================
    // serializerInstance()
    // ===================================================================

    @Test
    public void testSerializerInstance_nullSerDef_returnsNull() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper);
        Annotated annotated = mock(Annotated.class);
        JsonSerializer<Object> result = provider.serializerInstance(annotated, null);
        assertNull(result);
    }

    @Test
    public void testSerializerInstance_alreadyJsonSerializerInstance_returnsSame() throws Exception {
        // ASSUMPTION: _handleResolvable คืนค่า instance เดิมเมื่อไม่ implement ResolvableSerializer
        DefaultSerializerProvider provider = buildProvider(mapper);
        Annotated annotated = mock(Annotated.class);
        JsonSerializer<Object> mySer = new DummySer();
        JsonSerializer<Object> result = provider.serializerInstance(annotated, mySer);
        assertSame(mySer, result);
    }

    @Test
    public void testSerializerInstance_jsonSerializerNoneClass_returnsNull() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper);
        Annotated annotated = mock(Annotated.class);
        JsonSerializer<Object> result = provider.serializerInstance(annotated, JsonSerializer.None.class);
        assertNull(result);
    }

    @Test
    public void testSerializerInstance_validClass_instantiatedViaClassUtil() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper);
        Annotated annotated = mock(Annotated.class);
        JsonSerializer<Object> result = provider.serializerInstance(annotated, DummySer.class);
        assertNotNull(result);
        assertTrue(result instanceof DummySer);
    }

    @Test
    public void testSerializerInstance_usesHandlerInstantiator_whenProvided() throws Exception {
        @SuppressWarnings("unchecked")
        JsonSerializer<Object> sentinel = mock(JsonSerializer.class);
        HandlerInstantiator hi = mock(HandlerInstantiator.class);
        when(hi.serializerInstance(any(SerializationConfig.class), any(Annotated.class), eq(DummySer.class)))
                .thenReturn(sentinel);
        ObjectMapper m = new ObjectMapper();
        m.setHandlerInstantiator(hi);
        DefaultSerializerProvider provider = buildProvider(m);

        Annotated annotated = mock(Annotated.class);
        JsonSerializer<Object> result = provider.serializerInstance(annotated, DummySer.class);
        assertSame(sentinel, result);
    }

    @Test
    public void testSerializerInstance_classNotAssignableToJsonSerializer_throws() throws Exception {
        // ASSUMPTION: reportBadDefinition ส่ง JsonMappingException ตาม signature "throws JsonMappingException"
        DefaultSerializerProvider provider = buildProvider(mapper);
        Annotated annotated = mock(Annotated.class);
        when(annotated.getType()).thenReturn(mapper.constructType(Object.class));
        try {
            provider.serializerInstance(annotated, String.class);
            fail("Expected exception for non-JsonSerializer Class");
        } catch (JsonMappingException expected) {
            // branch covered
        }
    }

    @Test
    public void testSerializerInstance_serDefNotClassOrSerializer_throws() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper);
        Annotated annotated = mock(Annotated.class);
        when(annotated.getType()).thenReturn(mapper.constructType(Object.class));
        try {
            provider.serializerInstance(annotated, Integer.valueOf(42)); // ไม่ใช่ JsonSerializer หรือ Class
            fail("Expected exception for invalid serDef type");
        } catch (JsonMappingException expected) {
            // branch covered: !(serDef instanceof Class)
        }
    }

    // ===================================================================
    // includeFilterInstance()
    // ===================================================================

    @Test
    public void testIncludeFilterInstance_nullFilterClass_returnsNull() {
        DefaultSerializerProvider provider = buildProvider(mapper);
        Object result = provider.includeFilterInstance(null, null);
        assertNull(result);
    }

    @Test
    public void testIncludeFilterInstance_noHandlerInstantiator_usesClassUtil() {
        DefaultSerializerProvider provider = buildProvider(mapper);
        Object result = provider.includeFilterInstance(null, DummyFilter.class);
        assertNotNull(result);
        assertTrue(result instanceof DummyFilter);
    }

    @Test
    public void testIncludeFilterInstance_usesHandlerInstantiator_whenProvided() {
        HandlerInstantiator hi = mock(HandlerInstantiator.class);
        Object sentinel = new Object();
        when(hi.includeFilterInstance(any(SerializationConfig.class),
                any(BeanPropertyDefinition.class), eq(DummyFilter.class))).thenReturn(sentinel);
        ObjectMapper m = new ObjectMapper();
        m.setHandlerInstantiator(hi);
        DefaultSerializerProvider provider = buildProvider(m);

        Object result = provider.includeFilterInstance(null, DummyFilter.class);
        assertSame(sentinel, result);
    }

    // ===================================================================
    // includeFilterSuppressNulls()
    // ===================================================================

    @Test
    public void testIncludeFilterSuppressNulls_nullFilter_returnsTrue() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper);
        assertTrue(provider.includeFilterSuppressNulls(null));
    }

    @Test
    public void testIncludeFilterSuppressNulls_normalFilter_returnsFalse() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper);
        Object filter = new Object();
        assertFalse(provider.includeFilterSuppressNulls(filter));
    }

    @Test
    public void testIncludeFilterSuppressNulls_filterThrows_wrapsException() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper);
        Object badFilter = new Object() {
            @Override
            public boolean equals(Object o) {
                throw new RuntimeException("fail-equals");
            }
        };
        try {
            provider.includeFilterSuppressNulls(badFilter);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Problem determining"));
        }
    }

    // ===================================================================
    // findObjectId() / _createObjectIdMap()
    // ===================================================================

    @Test
    public void testFindObjectId_firstCall_createsNewEntry() {
        DefaultSerializerProvider provider = buildProvider(mapper);
        ObjectIdGenerator<Integer> gen = new ObjectIdGenerators.IntSequenceGenerator();
        Object pojo = new Object();
        WritableObjectId oid = provider.findObjectId(pojo, gen);
        assertNotNull(oid);
    }

    @Test
    public void testFindObjectId_secondCallSameObject_returnsCached() {
        DefaultSerializerProvider provider = buildProvider(mapper);
        ObjectIdGenerator<Integer> gen = new ObjectIdGenerators.IntSequenceGenerator();
        Object pojo = new Object();
        WritableObjectId oid1 = provider.findObjectId(pojo, gen);
        WritableObjectId oid2 = provider.findObjectId(pojo, gen);
        assertSame(oid1, oid2);
    }

    @Test
    public void testFindObjectId_differentObjectSameGeneratorType_reusesGenerator() {
        DefaultSerializerProvider provider = buildProvider(mapper);
        ObjectIdGenerator<Integer> gen = new ObjectIdGenerators.IntSequenceGenerator();
        Object pojo1 = new Object();
        Object pojo2 = new Object();
        WritableObjectId oid1 = provider.findObjectId(pojo1, gen);
        WritableObjectId oid2 = provider.findObjectId(pojo2, gen);
        assertNotNull(oid1);
        assertNotNull(oid2);
        assertNotSame(oid1, oid2);
    }

    @Test
    public void testCreateObjectIdMap_useEqualityFeatureEnabled_usesHashMapSemantics() {
        ObjectMapper m = new ObjectMapper();
        m.enable(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID);
        DefaultSerializerProvider provider = buildProvider(m);
        ObjectIdGenerator<Integer> gen = new ObjectIdGenerators.IntSequenceGenerator();

        String s1 = new String("abc");
        String s2 = new String("abc"); // equal แต่ different reference
        WritableObjectId oid1 = provider.findObjectId(s1, gen);
        WritableObjectId oid2 = provider.findObjectId(s2, gen);
        // HashMap(equals-based) -> ควรได้ oid เดียวกันเพราะ s1.equals(s2)
        assertSame(oid1, oid2);
    }

    @Test
    public void testCreateObjectIdMap_defaultFeatureDisabled_usesIdentitySemantics() {
        ObjectMapper m = new ObjectMapper(); // USE_EQUALITY_FOR_OBJECT_ID disabled by default
        DefaultSerializerProvider provider = buildProvider(m);
        ObjectIdGenerator<Integer> gen = new ObjectIdGenerators.IntSequenceGenerator();

        String s1 = new String("abc");
        String s2 = new String("abc");
        WritableObjectId oid1 = provider.findObjectId(s1, gen);
        WritableObjectId oid2 = provider.findObjectId(s2, gen);
        // IdentityHashMap -> ควรได้ oid คนละตัวเพราะ reference ต่างกัน
        assertNotSame(oid1, oid2);
    }

    // ===================================================================
    // hasSerializerFor()
    // ===================================================================

    @Test
    public void testHasSerializerFor_objectClass_failOnEmptyBeansDisabled_returnsTrue() {
        ObjectMapper m = new ObjectMapper();
        m.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        DefaultSerializerProvider provider = buildProvider(m);
        AtomicReference<Throwable> cause = new AtomicReference<Throwable>();
        assertTrue(provider.hasSerializerFor(Object.class, cause));
        assertNull(cause.get());
    }

    @Test
    public void testHasSerializerFor_explicitSerializerRegistered_returnsTrue() {
        ObjectMapper m = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addSerializer(ExplicitTarget.class, new ExplicitTargetSerializer());
        m.registerModule(module);
        DefaultSerializerProvider provider = buildProvider(m);
        assertTrue(provider.hasSerializerFor(ExplicitTarget.class, null));
    }

    @Test
    public void testHasSerializerFor_noExplicitSerializer_returnsFalse() {
        // ASSUMPTION: _findExplicitUntypedSerializer คืน null เมื่อไม่มีการลงทะเบียน serializer แบบ explicit
        ObjectMapper m = new ObjectMapper();
        DefaultSerializerProvider provider = buildProvider(m);
        assertFalse(provider.hasSerializerFor(PlainClass.class, null));
    }

    // ===================================================================
    // getGenerator()
    // ===================================================================

    @Test
    public void testGetGenerator_nullBeforeSerialize_setAfter() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper);
        assertNull(provider.getGenerator());

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        provider.serializeValue(gen, "hello");
        gen.close();

        assertSame(gen, provider.getGenerator());
    }

    // ===================================================================
    // serializeValue(gen, value)
    // ===================================================================

    @Test
    public void testSerializeValue_nullValue_writesNullToken() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        provider.serializeValue(gen, null);
        gen.flush();
        gen.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testSerializeValue_normalValue_noWrap() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper); // WRAP_ROOT_VALUE disabled by default
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        provider.serializeValue(gen, "hello");
        gen.flush();
        gen.close();
        assertEquals("\"hello\"", sw.toString());
    }

    @Test
    public void testSerializeValue_wrapRootValueEnabled_noExplicitRootName() throws Exception {
        // ASSUMPTION: default root name = simple class name เมื่อไม่มี @JsonRootName
        ObjectMapper m = new ObjectMapper();
        m.enable(SerializationFeature.WRAP_ROOT_VALUE);
        DefaultSerializerProvider provider = buildProvider(m);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = m.getFactory().createGenerator(sw);
        provider.serializeValue(gen, new SimpleBean());
        gen.flush();
        gen.close();
        String out = sw.toString();
        assertTrue(out.contains("SimpleBean"));
        assertTrue(out.contains("\"x\":1"));
    }

    @Test
    public void testSerializeValue_explicitNonEmptyRootName_wraps() throws Exception {
        SerializationConfig cfg = mapper.getSerializationConfig()
                .withRootName(new PropertyName("custom"));
        DefaultSerializerProvider provider = buildProviderWithConfig(cfg);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        provider.serializeValue(gen, new SimpleBean());
        gen.flush();
        gen.close();
        String out = sw.toString();
        assertTrue(out.contains("\"custom\""));
    }

    @Test
    public void testSerializeValue_explicitEmptyRootName_noWrapEvenIfWrapEnabled() throws Exception {
        ObjectMapper m = new ObjectMapper();
        m.enable(SerializationFeature.WRAP_ROOT_VALUE);
        SerializationConfig cfg = m.getSerializationConfig().withRootName(PropertyName.NO_NAME);
        DefaultSerializerProvider provider = buildProviderWithConfig(cfg);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = m.getFactory().createGenerator(sw);
        provider.serializeValue(gen, new SimpleBean());
        gen.flush();
        gen.close();
        String out = sw.toString();
        assertFalse(out.contains("SimpleBean"));
        assertTrue(out.startsWith("{\"x\""));
    }

    // ===================================================================
    // serializeValue(gen, value, rootType)
    // ===================================================================

    @Test
    public void testSerializeValueWithRootType_incompatibleType_throws() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        try {
            provider.serializeValue(gen, "hello", mapper.constructType(Integer.class));
            fail("Expected exception for incompatible root type");
        } catch (IOException expected) {
            // branch: _reportIncompatibleRootType - ยืนยันแค่ว่าเป็น IOException ตาม method signature
        } finally {
            gen.close();
        }
    }

    @Test
    public void testSerializeValueWithRootType_compatibleType_noWrap() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        provider.serializeValue(gen, "hello", mapper.constructType(String.class));
        gen.flush();
        gen.close();
        assertEquals("\"hello\"", sw.toString());
    }

    // ===================================================================
    // serializeValue(gen, value, rootType, ser)
    // ===================================================================

    @Test
    public void testSerializeValueWithSer_nullRootType_usesGivenSerializer() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);

        JsonSerializer<Object> ser = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator g, SerializerProvider sp) throws IOException {
                g.writeString("custom-ser:" + value);
            }
        };
        provider.serializeValue(gen, "hello", null, ser);
        gen.flush();
        gen.close();
        assertEquals("\"custom-ser:hello\"", sw.toString());
    }

    @Test
    public void testSerializeValueWithSer_nullSer_findsTypedSerializer() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        provider.serializeValue(gen, "hello", mapper.constructType(String.class), null);
        gen.flush();
        gen.close();
        assertEquals("\"hello\"", sw.toString());
    }

    @Test
    public void testSerializeValueWithSer_incompatibleRootType_throws() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        try {
            provider.serializeValue(gen, "hello", mapper.constructType(Integer.class), null);
            fail("Expected exception");
        } catch (IOException expected) {
            // covered
        } finally {
            gen.close();
        }
    }

    // ===================================================================
    // serializePolymorphic()
    // ===================================================================

    @Test
    public void testSerializePolymorphic_noWrap_defaultConfig() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper); // WRAP_ROOT_VALUE disabled, rootName null
        JsonGenerator genMock = mock(JsonGenerator.class);
        @SuppressWarnings("unchecked")
        JsonSerializer<Object> valueSer = mock(JsonSerializer.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        provider.serializePolymorphic(genMock, "hello", null, valueSer, typeSer);

        verify(valueSer).serializeWithType(eq("hello"), eq(genMock), eq(provider), eq(typeSer));
        verify(genMock, never()).writeStartObject();
        verify(genMock, never()).writeEndObject();
    }

    @Test
    public void testSerializePolymorphic_wrapEnabled_nullRootName() throws Exception {
        ObjectMapper m = new ObjectMapper();
        m.enable(SerializationFeature.WRAP_ROOT_VALUE);
        DefaultSerializerProvider provider = buildProvider(m);

        JsonGenerator genMock = mock(JsonGenerator.class);
        @SuppressWarnings("unchecked")
        JsonSerializer<Object> valueSer = mock(JsonSerializer.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        provider.serializePolymorphic(genMock, "hello", null, valueSer, typeSer);

        verify(genMock).writeStartObject();
        verify(genMock).writeFieldName(anyString());
        verify(valueSer).serializeWithType(eq("hello"), eq(genMock), eq(provider), eq(typeSer));
        verify(genMock).writeEndObject();
    }

    @Test
    public void testSerializePolymorphic_explicitNonEmptyRootName_wraps() throws Exception {
        SerializationConfig cfg = mapper.getSerializationConfig()
                .withRootName(new PropertyName("custom"));
        DefaultSerializerProvider provider = buildProviderWithConfig(cfg);

        JsonGenerator genMock = mock(JsonGenerator.class);
        @SuppressWarnings("unchecked")
        JsonSerializer<Object> valueSer = mock(JsonSerializer.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        provider.serializePolymorphic(genMock, "hello", null, valueSer, typeSer);

        verify(genMock).writeStartObject();
        verify(genMock).writeFieldName("custom");
        verify(genMock).writeEndObject();
    }

    @Test
    public void testSerializePolymorphic_explicitEmptyRootName_noWrap() throws Exception {
        SerializationConfig cfg = mapper.getSerializationConfig().withRootName(PropertyName.NO_NAME);
        DefaultSerializerProvider provider = buildProviderWithConfig(cfg);

        JsonGenerator genMock = mock(JsonGenerator.class);
        @SuppressWarnings("unchecked")
        JsonSerializer<Object> valueSer = mock(JsonSerializer.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        provider.serializePolymorphic(genMock, "hello", null, valueSer, typeSer);

        verify(genMock, never()).writeStartObject();
        verify(genMock, never()).writeEndObject();
        verify(valueSer).serializeWithType(eq("hello"), eq(genMock), eq(provider), eq(typeSer));
    }

    @Test
    public void testSerializePolymorphic_incompatibleRootType_throws() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper);
        JsonGenerator genMock = mock(JsonGenerator.class);
        @SuppressWarnings("unchecked")
        JsonSerializer<Object> valueSer = mock(JsonSerializer.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        try {
            provider.serializePolymorphic(genMock, "hello", mapper.constructType(Integer.class), valueSer, typeSer);
            fail("Expected exception for incompatible root type");
        } catch (IOException expected) {
            // covered
        }
    }

    @Test
    public void testSerializePolymorphic_exceptionIsIOException_rethrownAsIs() throws Exception {
        // Branch: if (e instanceof IOException) return (IOException) e; (ไม่ wrap)
        DefaultSerializerProvider provider = buildProvider(mapper);
        JsonGenerator genMock = mock(JsonGenerator.class);
        @SuppressWarnings("unchecked")
        JsonSerializer<Object> valueSer = mock(JsonSerializer.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        IOException original = new IOException("direct-io");
        doThrow(original).when(valueSer).serializeWithType(any(), any(JsonGenerator.class),
                any(SerializerProvider.class), any(TypeSerializer.class));

        try {
            provider.serializePolymorphic(genMock, "hello", null, valueSer, typeSer);
            fail("Expected IOException");
        } catch (IOException e) {
            assertSame(original, e);
        }
    }

    @Test
    public void testSerializePolymorphic_runtimeExceptionWithMessage_wrapped() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper);
        JsonGenerator genMock = mock(JsonGenerator.class);
        @SuppressWarnings("unchecked")
        JsonSerializer<Object> valueSer = mock(JsonSerializer.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        doThrow(new RuntimeException("boom")).when(valueSer).serializeWithType(any(), any(JsonGenerator.class),
                any(SerializerProvider.class), any(TypeSerializer.class));

        try {
            provider.serializePolymorphic(genMock, "hello", null, valueSer, typeSer);
            fail("Expected wrapped IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("boom"));
        }
    }

    @Test
    public void testSerializePolymorphic_runtimeExceptionNullMessage_wrappedWithPlaceholder() throws Exception {
        // Branch: msg == null -> "[no message for ...]"
        DefaultSerializerProvider provider = buildProvider(mapper);
        JsonGenerator genMock = mock(JsonGenerator.class);
        @SuppressWarnings("unchecked")
        JsonSerializer<Object> valueSer = mock(JsonSerializer.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        doThrow(new RuntimeException()).when(valueSer).serializeWithType(any(), any(JsonGenerator.class),
                any(SerializerProvider.class), any(TypeSerializer.class));

        try {
            provider.serializePolymorphic(genMock, "hello", null, valueSer, typeSer);
            fail("Expected wrapped IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("[no message for"));
        }
    }

    // ===================================================================
    // cachedSerializersCount() / flushCachedSerializers()
    // ===================================================================

    @Test
    public void testCachedSerializersCountAndFlush() {
        DefaultSerializerProvider provider = buildProvider(mapper);
        int before = provider.cachedSerializersCount();
        assertTrue(before >= 0);
        provider.flushCachedSerializers();
        assertEquals(0, provider.cachedSerializersCount());
    }

    // ===================================================================
    // acceptJsonFormatVisitor()
    // ===================================================================

    @Test
    public void testAcceptJsonFormatVisitor_nullType_throwsIllegalArgumentException() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        try {
            provider.acceptJsonFormatVisitor(null, visitor);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("A class must be provided", expected.getMessage());
        }
    }

    @Test
    public void testAcceptJsonFormatVisitor_validType_setsProviderOnVisitor() throws Exception {
        DefaultSerializerProvider provider = buildProvider(mapper);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType type = mapper.constructType(String.class);
        provider.acceptJsonFormatVisitor(type, visitor);
        verify(visitor).setProvider(provider);
    }

    // ===================================================================
    // generateJsonSchema() (deprecated, happy path only)
    // ===================================================================

    @Test
    public void testGenerateJsonSchema_stringType_returnsSchema() throws Exception {
        // ASSUMPTION: StringSerializer ของ Jackson implement SchemaAware และคืนค่า ObjectNode
        DefaultSerializerProvider provider = buildProvider(mapper);
        JsonSchema schema = provider.generateJsonSchema(String.class);
        assertNotNull(schema);
    }
}
```

# สรุปตาราง Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testCreateInstance_returnsImplInstance | `createInstance()` สร้าง instance ใหม่ |
| testImplCopy_returnsNewInstanceOfSameClass | `Impl.copy()` เมื่อ `getClass()==Impl.class` |
| testBaseCopy_throwsIllegalStateException_whenNotOverridden | `DefaultSerializerProvider.copy()` throw (base, ไม่ override) |
| testSerializerInstance_nullSerDef_returnsNull | `serDef == null` |
| testSerializerInstance_alreadyJsonSerializerInstance_returnsSame | `serDef instanceof JsonSerializer` |
| testSerializerInstance_jsonSerializerNoneClass_returnsNull | `serClass == JsonSerializer.None.class` |
| testSerializerInstance_validClass_instantiatedViaClassUtil | `hi==null` → `ClassUtil.createInstance` |
| testSerializerInstance_usesHandlerInstantiator_whenProvided | `hi!=null` → ser จาก hi, skip createInstance |
| testSerializerInstance_classNotAssignableToJsonSerializer_throws | `!JsonSerializer.class.isAssignableFrom(serClass)` |
| testSerializerInstance_serDefNotClassOrSerializer_throws | `!(serDef instanceof Class)` |
| testIncludeFilterInstance_nullFilterClass_returnsNull | `filterClass == null` |
| testIncludeFilterInstance_noHandlerInstantiator_usesClassUtil | `hi==null` fallback |
| testIncludeFilterInstance_usesHandlerInstantiator_whenProvided | `hi!=null` ส่งค่าตรง |
| testIncludeFilterSuppressNulls_nullFilter_returnsTrue | `filter == null` |
| testIncludeFilterSuppressNulls_normalFilter_returnsFalse | path ปกติ `filter.equals(null)` |
| testIncludeFilterSuppressNulls_filterThrows_wrapsException | `catch (Throwable t)` → reportBadDefinition |
| testFindObjectId_firstCall_createsNewEntry | `_seenObjectIds==null`, `_objectIdGenerators==null`, `generator==null` |
| testFindObjectId_secondCallSameObject_returnsCached | `oid != null` return ตรง |
| testFindObjectId_differentObjectSameGeneratorType_reusesGenerator | loop หา generator ที่ `canUseFor` match |
| testCreateObjectIdMap_useEqualityFeatureEnabled_usesHashMapSemantics | `_createObjectIdMap()` branch `USE_EQUALITY...` true |
| testCreateObjectIdMap_defaultFeatureDisabled_usesIdentitySemantics | `_createObjectIdMap()` branch false (IdentityHashMap) |
| testHasSerializerFor_objectClass_failOnEmptyBeansDisabled_returnsTrue | `cls==Object.class && !FAIL_ON_EMPTY_BEANS` |
| testHasSerializerFor_explicitSerializerRegistered_returnsTrue | `ser != null` → true |
| testHasSerializerFor_noExplicitSerializer_returnsFalse | `ser == null` → false (ท้ายเมธอด) |
| testGetGenerator_nullBeforeSerialize_setAfter | `_generator` ก่อน/หลัง set |
| testSerializeValue_nullValue_writesNullToken | `value == null` |
| testSerializeValue_normalValue_noWrap | `rootName==null`, WRAP disabled → final `_serialize` |
| testSerializeValue_wrapRootValueEnabled_noExplicitRootName | `rootName==null && WRAP enabled` |
| testSerializeValue_explicitNonEmptyRootName_wraps | `rootName!=null && !isEmpty()` |
| testSerializeValue_explicitEmptyRootName_noWrapEvenIfWrapEnabled | `rootName!=null && isEmpty()` |
| testSerializeValueWithRootType_incompatibleType_throws | `!rootType.getRawClass().isAssignableFrom(...)` |
| testSerializeValueWithRootType_compatibleType_noWrap | type compatible, no wrap |
| testSerializeValueWithSer_nullRootType_usesGivenSerializer | `rootType==null`, ser ที่ส่งมาไม่ null |
| testSerializeValueWithSer_nullSer_findsTypedSerializer | `ser==null` → `findTypedValueSerializer` |
| testSerializeValueWithSer_incompatibleRootType_throws | `rootType!=null` incompatible |
| testSerializePolymorphic_noWrap_defaultConfig | `rootName==null`, wrap=false |
| testSerializePolymorphic_wrapEnabled_nullRootName | `rootName==null`, wrap=true |
| testSerializePolymorphic_explicitNonEmptyRootName_wraps | `rootName!=null`, not empty → wrap=true |
| testSerializePolymorphic_explicitEmptyRootName_noWrap | `rootName.isEmpty()` → wrap=false |
| testSerializePolymorphic_incompatibleRootType_throws | incompatible root type check |
| testSerializePolymorphic_exceptionIsIOException_rethrownAsIs | `_wrapAsIOE`: `e instanceof IOException` true |
| testSerializePolymorphic_runtimeExceptionWithMessage_wrapped | `_wrapAsIOE`: msg != null |
| testSerializePolymorphic_runtimeExceptionNullMessage_wrappedWithPlaceholder | `_wrapAsIOE`: msg == null |
| testCachedSerializersCountAndFlush | `cachedSerializersCount()`, `flushCachedSerializers()` |
| testAcceptJsonFormatVisitor_nullType_throwsIllegalArgumentException | `javaType == null` |
| testAcceptJsonFormatVisitor_validType_setsProviderOnVisitor | happy path, `visitor.setProvider` |
| testGenerateJsonSchema_stringType_returnsSchema | happy-path schema generation |

**ข้อจำกัดที่ไม่ครอบคลุม** (ระบุในคอมเมนต์โค้ด): catch-branch ของ `JsonMappingException`/`RuntimeException` ใน `hasSerializerFor` (ต้องพึ่งพา internal behavior ของ `_findExplicitUntypedSerializer` ที่ไม่มีในซอร์ส), branch `valueSer==null && rootType.isContainerType()` ใน `serializePolymorphic` (ต้องพึ่ง internal serializer resolution), และ branch `getClass()!=Impl.class` ใน `Impl.copy()` (เป็นไปไม่ได้เพราะ `Impl` เป็น `final class`)