package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.*;
import com.fasterxml.jackson.databind.ser.std.*;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Unit tests สำหรับ {@link BasicSerializerFactory}.
 * วางอยู่ package เดียวกับคลาสเป้าหมาย เพื่อให้เข้าถึง protected methods ได้
 * โดยไม่ต้อง reflection/mock ที่เสี่ยงต่อการเดา behavior ผิด
 */
public class BasicSerializerFactoryTest {

    // ---------------------------------------------------------------
    // Helper concrete subclass (จำเป็นเพราะ BasicSerializerFactory เป็น abstract)
    // ---------------------------------------------------------------
    static class TestFactory extends BasicSerializerFactory {
        protected TestFactory() { super(null); }
        protected TestFactory(SerializerFactoryConfig cfg) { super(cfg); }

        @Override
        public SerializerFactory withConfig(SerializerFactoryConfig config) {
            return new TestFactory(config);
        }
        @Override
        public JsonSerializer<Object> createSerializer(SerializerProvider prov, JavaType type) {
            return null; // ไม่ได้ทดสอบ path นี้ตรง ๆ
        }
        @Override
        protected Iterable<Serializers> customSerializers() {
            return Collections.<Serializers>emptyList();
        }
    }

    static class DummySerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        }
    }

    // holder ใช้เพื่อดึง generic JavaType ผ่าน reflection field
    @SuppressWarnings("rawtypes")
    static class Holder {
        public AtomicReference<String> atomicRef;
        public ArrayList<String> stringArrayList;      // RandomAccess + String element
        public LinkedList<String> linkedStringList;    // ไม่ RandomAccess
        public LinkedHashMap<String,Integer> concreteMap;
        public EnumSet<SampleEnum> enumSet;
        public AbstractMap.SimpleEntry<String,Integer> mapEntry;
        public Map.Entry rawEntry; // raw type -> containedType(n) เป็น null
    }

    enum SampleEnum { A, B }

    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    enum ObjectShapeEnum { X, Y }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
    static class TypedBase { }

    static class CustomIterator implements Iterator<String> {
        public boolean hasNext() { return false; }
        public String next() { return null; }
        public void remove() { }
    }
    static class CustomIterable implements Iterable<Integer> {
        public Iterator<Integer> iterator() { return null; }
    }
    static class CustomCharSeq implements CharSequence {
        public int length() { return 0; }
        public char charAt(int index) { return 0; }
        public CharSequence subSequence(int s, int e) { return this; }
        public String toString() { return ""; }
    }
    static class MyNumber extends Number {
        public int intValue() { return 0; }
        public long longValue() { return 0; }
        public float floatValue() { return 0; }
        public double doubleValue() { return 0; }
    }
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    static class StringShapeNumber extends Number {
        public int intValue() { return 0; }
        public long longValue() { return 0; }
        public float floatValue() { return 0; }
        public double doubleValue() { return 0; }
    }
    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    static class ArrayShapeNumber extends Number {
        public int intValue() { return 0; }
        public long longValue() { return 0; }
        public float floatValue() { return 0; }
        public double doubleValue() { return 0; }
    }
    static class SerializableThing implements JsonSerializable {
        public void serialize(JsonGenerator g, SerializerProvider s) throws IOException { }
        public void serializeWithType(JsonGenerator g, SerializerProvider s, TypeSerializer t) throws IOException { }
    }
    static class NoAnnotationThing { public int x; }
    static class JsonValueThing {
        @JsonValue
        public String asString() { return "x"; }
    }

    private ObjectMapper mapper;
    private TypeFactory tf;
    private TestFactory factory;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        tf = mapper.getTypeFactory();
        factory = new TestFactory();
    }

    private JavaType genericFieldType(String fieldName) throws Exception {
        Type t = Holder.class.getField(fieldName).getGenericType();
        return tf.constructType(t);
    }

    private SerializerProvider provider() {
        return mapper.getSerializerProviderInstance();
    }

    // =================================================================
    // Constructor / config
    // =================================================================

    @Test
    public void constructorWithNullConfigCreatesDefault() {
        TestFactory f = new TestFactory((SerializerFactoryConfig) null);
        assertNotNull(f.getFactoryConfig());
        assertFalse(f.getFactoryConfig().hasSerializers());
    }

    @Test
    public void constructorWithExplicitConfigKeepsIt() {
        SerializerFactoryConfig cfg = new SerializerFactoryConfig();
        TestFactory f = new TestFactory(cfg);
        assertSame(cfg, f.getFactoryConfig());
    }

    @Test
    public void withAdditionalSerializersUpdatesConfig() {
        Serializers s = new Serializers.Base() { };
        SerializerFactory f2 = factory.withAdditionalSerializers(s);
        assertTrue(((TestFactory) f2).getFactoryConfig().hasSerializers());
    }

    @Test
    public void withAdditionalKeySerializersUpdatesConfig() {
        Serializers s = new Serializers.Base() { };
        SerializerFactory f2 = factory.withAdditionalKeySerializers(s);
        assertTrue(((TestFactory) f2).getFactoryConfig().hasKeySerializers());
    }

    @Test
    public void withSerializerModifierUpdatesConfig() {
        BeanSerializerModifier mod = new BeanSerializerModifier() { };
        SerializerFactory f2 = factory.withSerializerModifier(mod);
        assertTrue(((TestFactory) f2).getFactoryConfig().hasSerializerModifiers());
    }

    // =================================================================
    // findSerializerByLookup
    // =================================================================

    @Test
    public void lookupFindsConcreteStringSerializer() {
        JavaType t = tf.constructType(String.class);
        JsonSerializer<?> ser = factory.findSerializerByLookup(t, mapper.getSerializationConfig(), null, false);
        assertTrue(ser instanceof StringSerializer);
    }

    @Test
    public void lookupFindsLazySqlDateSerializer() {
        JavaType t = tf.constructType(java.sql.Date.class);
        JsonSerializer<?> ser = factory.findSerializerByLookup(t, mapper.getSerializationConfig(), null, false);
        assertNotNull(ser);
        assertEquals("SqlDateSerializer", ser.getClass().getSimpleName());
    }

    @Test
    public void lookupReturnsNullForUnknownType() {
        JavaType t = tf.constructType(CustomIterable.class);
        JsonSerializer<?> ser = factory.findSerializerByLookup(t, mapper.getSerializationConfig(), null, false);
        assertNull(ser);
    }

    @Test
    public void lookupHandlesAtomicReferenceType() throws Exception {
        JavaType t = genericFieldType("atomicRef");
        JsonSerializer<?> ser = factory.findSerializerByLookup(t, mapper.getSerializationConfig(), null, false);
        assertTrue(ser instanceof AtomicReferenceSerializer);
    }

    // =================================================================
    // findSerializerByPrimaryType
    // =================================================================

    @Test
    public void primaryTypeCalendar() throws Exception {
        JavaType t = tf.constructType(GregorianCalendar.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.findSerializerByPrimaryType(provider(), t, bd, false);
        assertTrue(ser instanceof CalendarSerializer);
    }

    @Test
    public void primaryTypeDate() throws Exception {
        JavaType t = tf.constructType(java.util.Date.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.findSerializerByPrimaryType(provider(), t, bd, false);
        assertTrue(ser instanceof DateSerializer);
    }

    @Test
    public void primaryTypeMapEntry() throws Exception {
        JavaType t = genericFieldType("mapEntry");
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.findSerializerByPrimaryType(provider(), t, bd, false);
        assertTrue(ser instanceof MapEntrySerializer);
    }

    @Test
    public void primaryTypeMapEntryRawTypeUsesUnknownContainedTypes() throws Exception {
        JavaType t = genericFieldType("rawEntry"); // containedType(0)/(1) == null -> unknownType()
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.findSerializerByPrimaryType(provider(), t, bd, false);
        assertTrue(ser instanceof MapEntrySerializer);
    }

    @Test
    public void primaryTypeByteBuffer() throws Exception {
        JavaType t = tf.constructType(ByteBuffer.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.findSerializerByPrimaryType(provider(), t, bd, false);
        assertTrue(ser instanceof ByteBufferSerializer);
    }

    @Test
    public void primaryTypeInetAddress() throws Exception {
        JavaType t = tf.constructType(InetAddress.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.findSerializerByPrimaryType(provider(), t, bd, false);
        assertTrue(ser instanceof InetAddressSerializer);
    }

    @Test
    public void primaryTypeInetSocketAddress() throws Exception {
        JavaType t = tf.constructType(InetSocketAddress.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.findSerializerByPrimaryType(provider(), t, bd, false);
        assertTrue(ser instanceof InetSocketAddressSerializer);
    }

    @Test
    public void primaryTypeTimeZone() throws Exception {
        JavaType t = tf.constructType(TimeZone.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.findSerializerByPrimaryType(provider(), t, bd, false);
        assertTrue(ser instanceof TimeZoneSerializer);
    }

    @Test
    public void primaryTypeCharset() throws Exception {
        JavaType t = tf.constructType(Charset.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.findSerializerByPrimaryType(provider(), t, bd, false);
        assertSame(ToStringSerializer.instance, ser);
    }

    @Test
    public void primaryTypeNumberDefault() throws Exception {
        JavaType t = tf.constructType(MyNumber.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.findSerializerByPrimaryType(provider(), t, bd, false);
        assertSame(NumberSerializer.instance, ser);
    }

    @Test
    public void primaryTypeNumberStringShape() throws Exception {
        JavaType t = tf.constructType(StringShapeNumber.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.findSerializerByPrimaryType(provider(), t, bd, false);
        assertSame(ToStringSerializer.instance, ser);
    }

    @Test
    public void primaryTypeNumberArrayShapeReturnsNull() throws Exception {
        JavaType t = tf.constructType(ArrayShapeNumber.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.findSerializerByPrimaryType(provider(), t, bd, false);
        assertNull(ser);
    }

    @Test
    public void primaryTypeEnumDefault() throws Exception {
        JavaType t = tf.constructType(SampleEnum.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.findSerializerByPrimaryType(provider(), t, bd, false);
        assertTrue(ser instanceof EnumSerializer);
    }

    @Test
    public void primaryTypeEnumObjectShapeReturnsNull() throws Exception {
        JavaType t = tf.constructType(ObjectShapeEnum.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.findSerializerByPrimaryType(provider(), t, bd, false);
        assertNull(ser);
    }

    @Test
    public void primaryTypeUnrelatedReturnsNull() throws Exception {
        JavaType t = tf.constructType(CustomCharSeq.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.findSerializerByPrimaryType(provider(), t, bd, false);
        assertNull(ser);
    }

    // =================================================================
    // findSerializerByAddonType
    // =================================================================

    @Test
    public void addonIteratorType() {
        JavaType t = tf.constructType(CustomIterator.class);
        JsonSerializer<?> ser = null;
        try {
            ser = factory.findSerializerByAddonType(mapper.getSerializationConfig(), t, null, false);
        } catch (JsonMappingException e) { fail(e.getMessage()); }
        assertTrue(ser instanceof IteratorSerializer);
    }

    @Test
    public void addonIterableType() {
        JavaType t = tf.constructType(CustomIterable.class);
        JsonSerializer<?> ser = null;
        try {
            ser = factory.findSerializerByAddonType(mapper.getSerializationConfig(), t, null, false);
        } catch (JsonMappingException e) { fail(e.getMessage()); }
        assertTrue(ser instanceof IterableSerializer);
    }

    @Test
    public void addonCharSequenceType() {
        JavaType t = tf.constructType(CustomCharSeq.class);
        JsonSerializer<?> ser = null;
        try {
            ser = factory.findSerializerByAddonType(mapper.getSerializationConfig(), t, null, false);
        } catch (JsonMappingException e) { fail(e.getMessage()); }
        assertSame(ToStringSerializer.instance, ser);
    }

    @Test
    public void addonUnrelatedReturnsNull() {
        JavaType t2 = tf.constructType(Object.class);
        JsonSerializer<?> ser = null;
        try {
            ser = factory.findSerializerByAddonType(mapper.getSerializationConfig(), t2, null, false);
        } catch (JsonMappingException e) { fail(e.getMessage()); }
        assertNull(ser);
    }

    // =================================================================
    // findSerializerByAnnotations
    // =================================================================

    @Test
    public void annotationsJsonSerializableType() throws Exception {
        JavaType t = tf.constructType(SerializableThing.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.findSerializerByAnnotations(provider(), t, bd);
        assertSame(SerializableSerializer.instance, ser);
    }

    @Test
    public void annotationsNoneReturnsNull() throws Exception {
        JavaType t = tf.constructType(NoAnnotationThing.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.findSerializerByAnnotations(provider(), t, bd);
        assertNull(ser);
    }

    @Test
    public void annotationsJsonValueType() throws Exception {
        JavaType t = tf.constructType(JsonValueThing.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.findSerializerByAnnotations(provider(), t, bd);
        assertTrue(ser instanceof JsonValueSerializer);
    }

    // =================================================================
    // createTypeSerializer
    // =================================================================

    @Test
    public void createTypeSerializerNoTypingReturnsNull() {
        JavaType t = tf.constructType(Object.class);
        TypeSerializer ts = factory.createTypeSerializer(mapper.getSerializationConfig(), t);
        assertNull(ts);
    }

    @Test
    public void createTypeSerializerWithClassAnnotationNotNull() {
        JavaType t = tf.constructType(TypedBase.class);
        TypeSerializer ts = factory.createTypeSerializer(mapper.getSerializationConfig(), t);
        assertNotNull(ts);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void createTypeSerializerWithDefaultTypingNotNull() {
        ObjectMapper m2 = new ObjectMapper();
        m2.enableDefaultTyping();
        JavaType t = m2.getTypeFactory().constructType(Object.class);
        TypeSerializer ts = factory.createTypeSerializer(m2.getSerializationConfig(), t);
        assertNotNull(ts);
    }

    // =================================================================
    // createKeySerializer
    // =================================================================

    @Test
    public void createKeySerializerDefaultNeverNull() {
        JavaType keyType = tf.constructType(Integer.class);
        JsonSerializer<Object> ser = factory.createKeySerializer(mapper.getSerializationConfig(), keyType, null);
        assertNotNull(ser);
    }

    @Test
    public void createKeySerializerUsesDefaultImplWhenProvided() {
        JavaType keyType = tf.constructType(String.class);
        JsonSerializer<Object> defImpl = new DummySerializer();
        JsonSerializer<Object> ser = factory.createKeySerializer(mapper.getSerializationConfig(), keyType, defImpl);
        assertSame(defImpl, ser);
    }

    @Test
    public void createKeySerializerUsesCustomKeySerializersFirst() {
        final JsonSerializer<Object> custom = new DummySerializer();
        Serializers customProvider = new Serializers.Base() {
            @Override
            public JsonSerializer<?> findSerializer(SerializationConfig config, JavaType type, BeanDescription beanDesc) {
                return custom;
            }
        };
        TestFactory f2 = (TestFactory) factory.withAdditionalKeySerializers(customProvider);
        JavaType keyType = tf.constructType(String.class);
        JsonSerializer<Object> ser = f2.createKeySerializer(mapper.getSerializationConfig(), keyType, null);
        assertSame(custom, ser);
    }

    @Test
    public void createKeySerializerAppliesModifier() {
        final JsonSerializer<Object> replaced = new DummySerializer();
        BeanSerializerModifier mod = new BeanSerializerModifier() {
            @Override
            public JsonSerializer<?> modifyKeySerializer(SerializationConfig config, JavaType valueType,
                    BeanDescription beanDesc, JsonSerializer<?> serializer) {
                return replaced;
            }
        };
        TestFactory f2 = (TestFactory) factory.withSerializerModifier(mod);
        JavaType keyType = tf.constructType(Integer.class);
        JsonSerializer<Object> ser = f2.createKeySerializer(mapper.getSerializationConfig(), keyType, null);
        assertSame(replaced, ser);
    }

    // =================================================================
    // isIndexedList / buildIndexedListSerializer / buildCollectionSerializer / buildEnumSetSerializer
    // =================================================================

    @Test
    public void isIndexedListTrueForArrayList() {
        assertTrue(factory.isIndexedList(ArrayList.class));
    }

    @Test
    public void isIndexedListFalseForLinkedList() {
        assertFalse(factory.isIndexedList(LinkedList.class));
    }

    @Test
    public void buildIndexedListSerializerReturnsIndexedListSerializer() {
        JavaType elem = tf.constructType(Integer.class);
        ContainerSerializer<?> ser = factory.buildIndexedListSerializer(elem, false, null, null);
        assertTrue(ser instanceof IndexedListSerializer);
    }

    @Test
    public void buildCollectionSerializerHelperReturnsCollectionSerializer() {
        JavaType elem = tf.constructType(Integer.class);
        ContainerSerializer<?> ser = factory.buildCollectionSerializer(elem, false, null, null);
        assertTrue(ser instanceof CollectionSerializer);
    }

    @Test
    public void buildEnumSetSerializerReturnsEnumSetSerializer() {
        JavaType enumType = tf.constructType(SampleEnum.class);
        JsonSerializer<?> ser = factory.buildEnumSetSerializer(enumType);
        assertTrue(ser instanceof EnumSetSerializer);
    }

    // =================================================================
    // buildContainerSerializer (array / collection / map / enumset)
    // =================================================================

    @Test
    public void buildContainerSerializerForStringArray() throws Exception {
        JavaType t = tf.constructType(String[].class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.buildContainerSerializer(provider(), t, bd, false);
        assertSame(StringArraySerializer.instance, ser);
    }

    @Test
    public void buildContainerSerializerForIndexedStringList() throws Exception {
        JavaType t = genericFieldType("stringArrayList");
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.buildContainerSerializer(provider(), t, bd, false);
        assertSame(IndexedStringListSerializer.instance, ser);
    }

    @Test
    public void buildContainerSerializerForPlainStringCollection() throws Exception {
        JavaType t = genericFieldType("linkedStringList");
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.buildContainerSerializer(provider(), t, bd, false);
        assertSame(StringCollectionSerializer.instance, ser);
    }

    @Test
    public void buildContainerSerializerForMap() throws Exception {
        JavaType t = genericFieldType("concreteMap");
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.buildContainerSerializer(provider(), t, bd, false);
        assertTrue(ser instanceof MapSerializer);
    }

    @Test
    public void buildContainerSerializerForEnumSet() throws Exception {
        JavaType t = genericFieldType("enumSet");
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        JsonSerializer<?> ser = factory.buildContainerSerializer(provider(), t, bd, false);
        assertTrue(ser instanceof EnumSetSerializer);
    }

    // =================================================================
    // findFilterId / usesStaticTyping
    // =================================================================

    @Test
    public void findFilterIdDefaultNull() throws Exception {
        JavaType t = tf.constructType(NoAnnotationThing.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        Object id = factory.findFilterId(mapper.getSerializationConfig(), bd);
        assertNull(id);
    }

    @Test
    public void usesStaticTypingFalseWhenTypeSerializerPresent() throws Exception {
        JavaType t = tf.constructType(NoAnnotationThing.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        ObjectMapper m2 = new ObjectMapper();
        @SuppressWarnings("deprecation")
        ObjectMapper m2b = m2.enableDefaultTyping();
        TypeSerializer ts = factory.createTypeSerializer(m2b.getSerializationConfig(),
                m2b.getTypeFactory().constructType(Object.class));
        assertNotNull(ts);
        boolean result = factory.usesStaticTyping(mapper.getSerializationConfig(), bd, ts);
        assertFalse(result);
    }

    @Test
    public void usesStaticTypingDefaultFalse() throws Exception {
        JavaType t = tf.constructType(NoAnnotationThing.class);
        BeanDescription bd = mapper.getSerializationConfig().introspect(t);
        boolean result = factory.usesStaticTyping(mapper.getSerializationConfig(), bd, null);
        assertFalse(result);
    }

    @Test
    public void usesStaticTypingTrueWhenFeatureEnabled() throws Exception {
        ObjectMapper m2 = new ObjectMapper();
        m2.enable(MapperFeature.USE_STATIC_TYPING);
        JavaType t = m2.getTypeFactory().constructType(NoAnnotationThing.class);
        BeanDescription bd = m2.getSerializationConfig().introspect(t);
        boolean result = factory.usesStaticTyping(m2.getSerializationConfig(), bd, null);
        assertTrue(result);
    }

    // =================================================================
    // _verifyAsClass
    // =================================================================

    @Test
    public void verifyAsClassNullSrcReturnsNull() {
        assertNull(factory._verifyAsClass(null, "m", Object.class));
    }

    @Test(expected = IllegalStateException.class)
    public void verifyAsClassNonClassThrows() {
        factory._verifyAsClass("notAClass", "m", Object.class);
    }

    @Test
    public void verifyAsClassNoneClassReturnsNull() {
        assertNull(factory._verifyAsClass(Object.class, "m", Object.class));
    }

    @Test
    public void verifyAsClassBogusClassReturnsNull() {
        assertNull(factory._verifyAsClass(NoClass.class, "m", Void.class));
    }

    @Test
    public void verifyAsClassValidClassReturned() {
        assertSame(String.class, factory._verifyAsClass(String.class, "m", Object.class));
    }
}
