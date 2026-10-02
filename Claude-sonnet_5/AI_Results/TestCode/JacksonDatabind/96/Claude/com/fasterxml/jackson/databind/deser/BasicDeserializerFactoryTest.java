package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * JUnit 4 tests for {@link BasicDeserializerFactory}.
 * Uses the real concrete subclass {@link BeanDeserializerFactory#instance}
 * since BasicDeserializerFactory is abstract and stateless.
 */
public class BasicDeserializerFactoryTest {

    private final ObjectMapper mapper = new ObjectMapper();
    // BeanDeserializerFactory extends BasicDeserializerFactory -> safe upcast
    private final BasicDeserializerFactory factory = BeanDeserializerFactory.instance;

    // =================================================================
    // Helper / fixture types
    // =================================================================

    public static class DummyValueInstantiator extends ValueInstantiator {
        public DummyValueInstantiator() { }
        @Override
        public String getValueTypeDesc() { return "dummy"; }
    }

    static class SimpleBean {
        public String name;
        public SimpleBean() { }
    }

    static class StringCreatorBean {
        final String value;
        @JsonCreator
        public StringCreatorBean(String value) { this.value = value; }
        public String getValue() { return value; }
    }

    static class PropsCreatorBean {
        final int a;
        final int b;
        @JsonCreator
        public PropsCreatorBean(@JsonProperty("a") int a, @JsonProperty("b") int b) {
            this.a = a; this.b = b;
        }
        public int getA() { return a; }
        public int getB() { return b; }
    }

    static class MapDelegatingBean {
        final Map<String,Object> data;
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public MapDelegatingBean(Map<String,Object> data) { this.data = data; }
        public Map<String,Object> getData() { return data; }
    }

    // explicit name for one param, none for the other -> "epic fail" branch
    static class MixedNamedBean {
        final int a; final int b;
        @JsonCreator
        public MixedNamedBean(@JsonProperty("a") int a, int b) {
            this.a = a; this.b = b;
        }
        public int getA() { return a; }
        public int getB() { return b; }
    }

    // no @JsonCreator, no names at all, no default ctor -> unusable creator
    static class BadMultiArgBean {
        private final int a; private final int b;
        public BadMultiArgBean(int a, int b) { this.a = a; this.b = b; }
        public int getA() { return a; }
        public int getB() { return b; }
    }

    static class FactoryMethodBean {
        final String value;
        private FactoryMethodBean(String value) { this.value = value; }
        @JsonCreator
        public static FactoryMethodBean of(String value) { return new FactoryMethodBean(value); }
        public String getValue() { return value; }
    }

    static class ZeroArgFactoryBean {
        static boolean created = false;
        private ZeroArgFactoryBean() { }
        @JsonCreator
        public static ZeroArgFactoryBean create() {
            created = true;
            return new ZeroArgFactoryBean();
        }
    }

    enum Color { RED, GREEN, BLUE }

    enum Status {
        ACTIVE, INACTIVE;
        @JsonCreator
        public static Status fromString(String s) { return valueOf(s.toUpperCase()); }
    }

    interface UnresolvableCollection<T> extends Collection<T> { }
    interface UnresolvableMap<K,V> extends Map<K,V> { }

    private static boolean containsRef(Iterable<?> it, Object target) {
        for (Object o : it) {
            if (o == target) return true;
        }
        return false;
    }

    private AnnotatedClass annotatedClassOf(Class<?> cls) {
        DeserializationConfig config = mapper.getDeserializationConfig();
        return config.introspectClassAnnotations(cls).getClassInfo();
    }

    // =================================================================
    // 1) Config / fluent factory methods
    // =================================================================

    @Test
    public void testGetFactoryConfig_notNull() {
        assertNotNull(factory.getFactoryConfig());
    }

    @Test
    public void testWithAdditionalDeserializers_registersAndIsImmutable() {
        Deserializers marker = new Deserializers.Base();
        DeserializerFactory updated = factory.withAdditionalDeserializers(marker);
        assertTrue(containsRef(((BasicDeserializerFactory) updated).getFactoryConfig().deserializers(), marker));
        assertFalse(containsRef(factory.getFactoryConfig().deserializers(), marker));
    }

    @Test
    public void testWithAdditionalKeyDeserializers_registersAndIsImmutable() {
        KeyDeserializers marker = new KeyDeserializers() {
            @Override
            public KeyDeserializer findKeyDeserializer(JavaType type, DeserializationConfig config,
                    BeanDescription beanDesc) {
                return null;
            }
        };
        DeserializerFactory updated = factory.withAdditionalKeyDeserializers(marker);
        assertTrue(containsRef(((BasicDeserializerFactory) updated).getFactoryConfig().keyDeserializers(), marker));
        assertFalse(containsRef(factory.getFactoryConfig().keyDeserializers(), marker));
    }

    @Test
    public void testWithDeserializerModifier_registersAndIsImmutable() {
        BeanDeserializerModifier marker = new BeanDeserializerModifier() { };
        DeserializerFactory updated = factory.withDeserializerModifier(marker);
        assertTrue(containsRef(((BasicDeserializerFactory) updated).getFactoryConfig().deserializerModifiers(), marker));
        assertFalse(containsRef(factory.getFactoryConfig().deserializerModifiers(), marker));
    }

    @Test
    public void testWithAbstractTypeResolver_registersAndIsImmutable() {
        AbstractTypeResolver marker = new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                return null;
            }
        };
        DeserializerFactory updated = factory.withAbstractTypeResolver(marker);
        assertTrue(containsRef(((BasicDeserializerFactory) updated).getFactoryConfig().abstractTypeResolvers(), marker));
        assertFalse(containsRef(factory.getFactoryConfig().abstractTypeResolvers(), marker));
    }

    @Test
    public void testWithValueInstantiators_registersAndIsImmutable() {
        ValueInstantiators marker = new ValueInstantiators() {
            @Override
            public ValueInstantiator findValueInstantiator(DeserializationConfig config,
                    BeanDescription beanDesc, ValueInstantiator defaultInstantiator) {
                return defaultInstantiator;
            }
        };
        DeserializerFactory updated = factory.withValueInstantiators(marker);
        assertTrue(containsRef(((BasicDeserializerFactory) updated).getFactoryConfig().valueInstantiators(), marker));
        assertFalse(containsRef(factory.getFactoryConfig().valueInstantiators(), marker));
    }

    // =================================================================
    // 2) mapAbstractType / _mapAbstractType2
    // =================================================================

    @Test
    public void testMapAbstractType_noResolvers_returnsSameType() throws JsonMappingException {
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.constructType(List.class);
        JavaType result = factory.mapAbstractType(config, type);
        assertEquals(type, result);
    }

    @Test
    public void testMapAbstractType_withResolver_returnsMappedType() throws JsonMappingException {
        DeserializationConfig config = mapper.getDeserializationConfig();
        final JavaType listType = config.constructType(List.class);
        final JavaType arrayListType = config.constructType(ArrayList.class);
        AbstractTypeResolver resolver = new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig cfg, JavaType type) {
                if (type.hasRawClass(List.class)) {
                    return arrayListType;
                }
                return null;
            }
        };
        DeserializerFactory f2 = factory.withAbstractTypeResolver(resolver);
        JavaType result = f2.mapAbstractType(config, listType);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapAbstractType_invalidResolution_throwsIllegalArgumentException() throws JsonMappingException {
        DeserializationConfig config = mapper.getDeserializationConfig();
        final JavaType listType = config.constructType(List.class);
        final JavaType unrelatedType = config.constructType(String.class);
        AbstractTypeResolver resolver = new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig cfg, JavaType type) {
                if (type.hasRawClass(List.class)) {
                    return unrelatedType; // String is not a subtype of List
                }
                return null;
            }
        };
        DeserializerFactory f2 = factory.withAbstractTypeResolver(resolver);
        f2.mapAbstractType(config, listType);
    }

    // =================================================================
    // 3) _valueInstantiatorInstance
    // =================================================================

    @Test
    public void testValueInstantiatorInstance_nullInstDef_returnsNull() throws JsonMappingException {
        DeserializationConfig config = mapper.getDeserializationConfig();
        AnnotatedClass ac = annotatedClassOf(SimpleBean.class);
        assertNull(factory._valueInstantiatorInstance(config, ac, null));
    }

    @Test
    public void testValueInstantiatorInstance_alreadyInstantiator_returnsSameInstance() throws JsonMappingException {
        DeserializationConfig config = mapper.getDeserializationConfig();
        AnnotatedClass ac = annotatedClassOf(SimpleBean.class);
        ValueInstantiator vi = new DummyValueInstantiator();
        ValueInstantiator result = factory._valueInstantiatorInstance(config, ac, vi);
        assertSame(vi, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testValueInstantiatorInstance_invalidType_throwsIllegalStateException() throws JsonMappingException {
        DeserializationConfig config = mapper.getDeserializationConfig();
        AnnotatedClass ac = annotatedClassOf(SimpleBean.class);
        factory._valueInstantiatorInstance(config, ac, "not-a-class-or-instantiator");
    }

    @Test(expected = IllegalStateException.class)
    public void testValueInstantiatorInstance_classNotAssignable_throwsIllegalStateException() throws JsonMappingException {
        DeserializationConfig config = mapper.getDeserializationConfig();
        AnnotatedClass ac = annotatedClassOf(SimpleBean.class);
        factory._valueInstantiatorInstance(config, ac, String.class);
    }

    // NOTE/ASSUMPTION: ClassUtil.isBogusClass() is expected (based on standard Jackson
    // source) to treat com.fasterxml.jackson.databind.annotation.NoClass as a bogus/placeholder
    // class -> method should return null instead of throwing. If this assumption is wrong for
    // this exact Jackson revision, this test may fail and should be revisited.
    @Test
    public void testValueInstantiatorInstance_bogusClass_returnsNull() throws JsonMappingException {
        DeserializationConfig config = mapper.getDeserializationConfig();
        AnnotatedClass ac = annotatedClassOf(SimpleBean.class);
        assertNull(factory._valueInstantiatorInstance(config, ac, NoClass.class));
    }

    @Test
    public void testValueInstantiatorInstance_validClass_createsInstance() throws JsonMappingException {
        DeserializationConfig config = mapper.getDeserializationConfig();
        AnnotatedClass ac = annotatedClassOf(SimpleBean.class);
        ValueInstantiator result = factory._valueInstantiatorInstance(config, ac, DummyValueInstantiator.class);
        assertNotNull(result);
        assertTrue(result instanceof DummyValueInstantiator);
    }

    // =================================================================
    // 4) Creator introspection (indirect via ObjectMapper.readValue)
    // =================================================================

    @Test
    public void testDeserialize_defaultConstructor_ok() throws Exception {
        SimpleBean bean = mapper.readValue("{\"name\":\"abc\"}", SimpleBean.class);
        assertEquals("abc", bean.name);
    }

    @Test
    public void testDeserialize_singleStringArgCreator_ok() throws Exception {
        StringCreatorBean bean = mapper.readValue("\"hello\"", StringCreatorBean.class);
        assertEquals("hello", bean.getValue());
    }

    @Test
    public void testDeserialize_propertiesModeCreator_ok() throws Exception {
        PropsCreatorBean bean = mapper.readValue("{\"a\":1,\"b\":2}", PropsCreatorBean.class);
        assertEquals(1, bean.getA());
        assertEquals(2, bean.getB());
    }

    @Test
    public void testDeserialize_delegatingModeCreatorWithMap_ok() throws Exception {
        MapDelegatingBean bean = mapper.readValue("{\"x\":1,\"y\":2}", MapDelegatingBean.class);
        assertEquals(2, bean.getData().size());
        assertEquals(1, bean.getData().get("x"));
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_mixedNamedAndUnnamedParams_throwsException() throws Exception {
        mapper.readValue("{\"a\":1,\"b\":2}", MixedNamedBean.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_allUnnamedMultiArgConstructor_throwsException() throws Exception {
        mapper.readValue("{\"a\":1,\"b\":2}", BadMultiArgBean.class);
    }

    @Test
    public void testDeserialize_factoryMethodSingleArg_ok() throws Exception {
        FactoryMethodBean bean = mapper.readValue("\"xyz\"", FactoryMethodBean.class);
        assertEquals("xyz", bean.getValue());
    }

    @Test
    public void testDeserialize_factoryMethodZeroArg_ok() throws Exception {
        ZeroArgFactoryBean.created = false;
        mapper.readValue("{}", ZeroArgFactoryBean.class);
        assertTrue(ZeroArgFactoryBean.created);
    }

    // =================================================================
    // 5) Collection / Map / Array / Reference / Enum deserializers
    // =================================================================

    @Test
    public void testDeserialize_listAbstractType_fallbackArrayList() throws Exception {
        List<?> list = mapper.readValue("[1,2,3]", List.class);
        assertTrue(list instanceof ArrayList);
        assertEquals(3, list.size());
    }

    @Test
    public void testDeserialize_setAbstractType_fallbackHashSet() throws Exception {
        Set<?> set = mapper.readValue("[1,2,3]", Set.class);
        assertTrue(set instanceof HashSet);
    }

    @Test
    public void testDeserialize_sortedSetAbstractType_fallbackTreeSet() throws Exception {
        SortedSet<?> set = mapper.readValue("[3,1,2]", SortedSet.class);
        assertTrue(set instanceof TreeSet);
    }

    @Test
    public void testDeserialize_dequeAbstractType_fallbackLinkedList() throws Exception {
        Deque<?> deque = mapper.readValue("[1,2,3]", Deque.class);
        assertTrue(deque instanceof LinkedList);
    }

    @Test
    public void testDeserialize_enumSet_ok() throws Exception {
        TypeFactory tf = mapper.getTypeFactory();
        CollectionType type = tf.constructCollectionType(EnumSet.class, Color.class);
        EnumSet<?> result = mapper.readValue("[\"RED\",\"BLUE\"]", type);
        assertTrue(result.contains(Color.RED));
        assertTrue(result.contains(Color.BLUE));
        assertFalse(result.contains(Color.GREEN));
    }

    @Test
    public void testDeserialize_mapAbstractType_fallbackLinkedHashMap() throws Exception {
        Map<?,?> map = mapper.readValue("{\"a\":1}", Map.class);
        assertTrue(map instanceof LinkedHashMap);
    }

    @Test
    public void testDeserialize_enumMap_ok() throws Exception {
        TypeFactory tf = mapper.getTypeFactory();
        MapType type = tf.constructMapType(EnumMap.class, Color.class, String.class);
        @SuppressWarnings("unchecked")
        EnumMap<Color,String> result = (EnumMap<Color,String>) mapper.readValue("{\"RED\":\"r\"}", type);
        assertEquals("r", result.get(Color.RED));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeserialize_unresolvableAbstractCollectionType_throwsIllegalArgumentException() throws Exception {
        mapper.readValue("[1,2]", UnresolvableCollection.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeserialize_unresolvableAbstractMapType_throwsIllegalArgumentException() throws Exception {
        mapper.readValue("{\"a\":1}", UnresolvableMap.class);
    }

    @Test
    public void testDeserialize_arrayBlockingQueue_ok() throws Exception {
        TypeFactory tf = mapper.getTypeFactory();
        CollectionType type = tf.constructCollectionType(ArrayBlockingQueue.class, Integer.class);
        @SuppressWarnings("unchecked")
        ArrayBlockingQueue<Integer> queue = (ArrayBlockingQueue<Integer>) mapper.readValue("[1,2,3]", type);
        assertEquals(3, queue.size());
    }

    @Test
    public void testDeserialize_primitiveIntArray_ok() throws Exception {
        int[] arr = mapper.readValue("[1,2,3]", int[].class);
        assertArrayEquals(new int[]{1,2,3}, arr);
    }

    @Test
    public void testDeserialize_stringArray_ok() throws Exception {
        String[] arr = mapper.readValue("[\"a\",\"b\"]", String[].class);
        assertArrayEquals(new String[]{"a","b"}, arr);
    }

    @Test
    public void testDeserialize_genericObjectArray_ok() throws Exception {
        Object[] arr = mapper.readValue("[1,\"a\"]", Object[].class);
        assertEquals(2, arr.length);
    }

    @Test
    public void testDeserialize_atomicReference_ok() throws Exception {
        AtomicReference<String> ref = mapper.readValue("\"hi\"", new TypeReference<AtomicReference<String>>() {});
        assertEquals("hi", ref.get());
    }

    @Test
    public void testDeserialize_simpleEnum_ok() throws Exception {
        Color c = mapper.readValue("\"RED\"", Color.class);
        assertEquals(Color.RED, c);
    }

    @Test
    public void testDeserialize_enumWithJsonCreatorFactory_ok() throws Exception {
        Status s = mapper.readValue("\"active\"", Status.class);
        assertEquals(Status.ACTIVE, s);
    }

    @Test
    public void testDeserialize_iterableUpcastToCollection_ok() throws Exception {
        Iterable<Integer> it = mapper.readValue("[1,2,3]", new TypeReference<Iterable<Integer>>() {});
        int sum = 0;
        for (int i : it) { sum += i; }
        assertEquals(6, sum);
    }

    // ASSUMPTION: MapEntryDeserializer reads a single-field JSON object as one Map.Entry
    // (field name -> key, field value -> value), based on standard Jackson behavior.
    @Test
    public void testDeserialize_mapEntry_ok() throws Exception {
        Map.Entry<String,Integer> entry = mapper.readValue("{\"key\":5}",
                new TypeReference<Map.Entry<String,Integer>>() {});
        assertEquals("key", entry.getKey());
        assertEquals(Integer.valueOf(5), entry.getValue());
    }

    // =================================================================
    // 6) createKeyDeserializer
    // =================================================================

    @Test
    public void testCreateKeyDeserializer_enumKey_ok() throws Exception {
        Map<Color,String> map = mapper.readValue("{\"RED\":\"red\"}",
                new TypeReference<Map<Color,String>>() {});
        assertEquals("red", map.get(Color.RED));
    }

    @Test
    public void testCreateKeyDeserializer_integerKey_ok() throws Exception {
        Map<Integer,String> map = mapper.readValue("{\"1\":\"one\"}",
                new TypeReference<Map<Integer,String>>() {});
        assertEquals("one", map.get(1));
    }

    // =================================================================
    // 7) Custom deserializer hooks (_findCustomCollectionDeserializer / _findCustomMapDeserializer)
    // =================================================================

    @Test
    @SuppressWarnings({ "rawtypes" })
    public void testCustomCollectionDeserializer_viaModule_isUsed() throws Exception {
        SimpleModule module = new SimpleModule();
        module.addDeserializer(List.class, new StdDeserializer<List>(List.class) {
            @Override
            public List deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                List result = new ArrayList();
                result.add("CUSTOM");
                return result;
            }
        });
        ObjectMapper custom = new ObjectMapper().registerModule(module);
        List<?> list = custom.readValue("[1,2,3]", List.class);
        assertEquals(Collections.singletonList("CUSTOM"), list);
    }

    @Test
    @SuppressWarnings({ "rawtypes" })
    public void testCustomMapDeserializer_viaModule_isUsed() throws Exception {
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Map.class, new StdDeserializer<Map>(Map.class) {
            @Override
            public Map deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                Map result = new HashMap();
                result.put("CUSTOM", Boolean.TRUE);
                return result;
            }
        });
        ObjectMapper custom = new ObjectMapper().registerModule(module);
        Map<?,?> map = custom.readValue("{\"a\":1}", Map.class);
        assertEquals(Boolean.TRUE, map.get("CUSTOM"));
    }
}
