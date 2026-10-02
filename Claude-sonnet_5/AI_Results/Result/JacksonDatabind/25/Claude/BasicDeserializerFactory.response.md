# วิเคราะห์และแนวทางการทดสอบ

เนื่องจาก `BasicDeserializerFactory` เป็น **abstract class** จึงต้องใช้ subclass ที่เป็น concrete ในโปรเจกต์เดียวกัน (`BeanDeserializerFactory.instance`) เพื่อสร้าง instance สำหรับทดสอบ และเนื่องจากเมธอดจำนวนมากเป็น `protected` และต้องใช้ `DeserializationContext` ที่สร้างยากนอก cycle การอ่านจริง จึงเลือกใช้ 2 แนวทางร่วมกัน:

1. **เรียกตรง** สำหรับเมธอดที่ signature ไม่ซับซ้อน (`mapAbstractType`, `_mapAbstractCollectionType`, `_findRemappedType`, `findTypeDeserializer`, `withXxx(...)`) — ทำได้เพราะ test class อยู่ package เดียวกัน (`protected` เข้าถึงได้)
2. **Integration ผ่าน `ObjectMapper.readValue(...)`** สำหรับเมธอดที่ต้องใช้ `DeserializationContext`/`BeanDescription` เต็มรูปแบบ (createArrayDeserializer, createCollectionDeserializer, createMapDeserializer, createEnumDeserializer, _addDeserializerConstructors, _addDeserializerFactoryMethods ฯลฯ) — เป็นวิธีมาตรฐานที่ใช้ทดสอบ Jackson เอง เพราะ context ภายในสร้างยากด้วยมือ

```java
package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.CollectionType;

/**
 * Unit test สำหรับ BasicDeserializerFactory
 * ใช้ BeanDeserializerFactory.instance เป็น concrete subclass สำหรับเรียกเมธอด
 * (test อยู่ package เดียวกัน จึงเรียก protected method ได้ตรง)
 */
public class BasicDeserializerFactoryTest {

    private final ObjectMapper mapper = new ObjectMapper();
    private final BasicDeserializerFactory factory = BeanDeserializerFactory.instance;

    // ====================================================================
    // Fluent config methods (withAdditionalDeserializers, withXxx...)
    // ====================================================================

    @Test
    public void testWithAdditionalDeserializersAddsToConfig() {
        Deserializers customDeser = mock(Deserializers.class);
        DeserializerFactory result = factory.withAdditionalDeserializers(customDeser);
        assertNotSame(factory, result);
        BasicDeserializerFactory f2 = (BasicDeserializerFactory) result;
        boolean found = false;
        for (Deserializers d : f2.getFactoryConfig().deserializers()) {
            if (d == customDeser) { found = true; break; }
        }
        assertTrue("custom Deserializers ต้องถูกเก็บใน config ใหม่", found);
    }

    @Test
    public void testWithAdditionalKeyDeserializersAddsToConfig() {
        KeyDeserializers customKeyDeser = mock(KeyDeserializers.class);
        DeserializerFactory result = factory.withAdditionalKeyDeserializers(customKeyDeser);
        BasicDeserializerFactory f2 = (BasicDeserializerFactory) result;
        assertTrue(f2.getFactoryConfig().hasKeyDeserializers());
        boolean found = false;
        for (KeyDeserializers d : f2.getFactoryConfig().keyDeserializers()) {
            if (d == customKeyDeser) { found = true; }
        }
        assertTrue(found);
    }

    @Test
    public void testWithDeserializerModifierAddsToConfig() {
        BeanDeserializerModifier modifier = mock(BeanDeserializerModifier.class);
        DeserializerFactory result = factory.withDeserializerModifier(modifier);
        BasicDeserializerFactory f2 = (BasicDeserializerFactory) result;
        assertTrue(f2.getFactoryConfig().hasDeserializerModifiers());
    }

    @Test
    public void testWithAbstractTypeResolverAddsToConfig() {
        AbstractTypeResolver resolver = mock(AbstractTypeResolver.class);
        DeserializerFactory result = factory.withAbstractTypeResolver(resolver);
        BasicDeserializerFactory f2 = (BasicDeserializerFactory) result;
        assertTrue(f2.getFactoryConfig().hasAbstractTypeResolvers());
    }

    @Test
    public void testWithValueInstantiatorsAddsToConfig() {
        ValueInstantiators insts = mock(ValueInstantiators.class);
        DeserializerFactory result = factory.withValueInstantiators(insts);
        BasicDeserializerFactory f2 = (BasicDeserializerFactory) result;
        assertTrue(f2.getFactoryConfig().hasValueInstantiators());
    }

    // ====================================================================
    // mapAbstractType(...) - loop / boundary / exception branches
    // ====================================================================

    @Test
    public void testMapAbstractType_NoResolvers_ReturnsSameType() throws Exception {
        JavaType listType = mapper.getTypeFactory().constructType(ArrayList.class);
        JavaType result = factory.mapAbstractType(mapper.getDeserializationConfig(), listType);
        // ไม่มี resolver ลงทะเบียน -> คืน type เดิม (branch hasAbstractTypeResolvers()==false)
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testMapAbstractType_ValidSubtypeResolution_Loops() throws Exception {
        AbstractTypeResolver resolver = mock(AbstractTypeResolver.class);
        JavaType arrayListType = mapper.getTypeFactory().constructType(ArrayList.class);
        when(resolver.findTypeMapping(any(DeserializationConfig.class), any(JavaType.class)))
                .thenReturn(arrayListType);
        DeserializerFactory f2 = factory.withAbstractTypeResolver(resolver);

        JavaType baseType = mapper.getTypeFactory().constructType(List.class);
        JavaType result = f2.mapAbstractType(mapper.getDeserializationConfig(), baseType);
        // รอบแรก List -> ArrayList (ผ่านเงื่อนไข isAssignableFrom); รอบสอง ArrayList->ArrayList
        // ถูกกรองใน _mapAbstractType2 (rawClass เท่ากัน) -> loop จบ
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testMapAbstractType_MultipleResolvers_SkipsNullThenMatches() throws Exception {
        AbstractTypeResolver resolverNoMatch = mock(AbstractTypeResolver.class); // default: null
        AbstractTypeResolver resolverMatch = mock(AbstractTypeResolver.class);
        JavaType arrayListType = mapper.getTypeFactory().constructType(ArrayList.class);
        when(resolverMatch.findTypeMapping(any(DeserializationConfig.class), any(JavaType.class)))
                .thenReturn(arrayListType);

        DeserializerFactory f1 = factory.withAbstractTypeResolver(resolverNoMatch);
        DeserializerFactory f2 = f1.withAbstractTypeResolver(resolverMatch);

        JavaType baseType = mapper.getTypeFactory().constructType(List.class);
        JavaType result = f2.mapAbstractType(mapper.getDeserializationConfig(), baseType);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testMapAbstractType_InvalidResolution_UnrelatedClass_Throws() throws Exception {
        AbstractTypeResolver resolver = mock(AbstractTypeResolver.class);
        // แมพไปเป็นคลาสที่ไม่สัมพันธ์กันเลย -> ควร throw IllegalArgumentException
        JavaType unrelated = mapper.getTypeFactory().constructType(String.class);
        when(resolver.findTypeMapping(any(DeserializationConfig.class), any(JavaType.class)))
                .thenReturn(unrelated);
        DeserializerFactory f2 = factory.withAbstractTypeResolver(resolver);
        JavaType baseType = mapper.getTypeFactory().constructType(Number.class);
        try {
            f2.mapAbstractType(mapper.getDeserializationConfig(), baseType);
            fail("ต้อง throw IllegalArgumentException เมื่อ resolved type ไม่ใช่ subtype");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }
    // หมายเหตุ: branch "(prevCls == nextCls)" ใน mapAbstractType ดูเหมือนเข้าไม่ถึงได้จริง
    // เพราะ _mapAbstractType2 กรองกรณี rawClass เท่ากันออกไปก่อนแล้ว (return null) - dead branch

    // ====================================================================
    // _mapAbstractCollectionType / _findRemappedType (protected, direct call)
    // ====================================================================

    @Test
    public void testMapAbstractCollectionType_KnownFallback_ReturnsArrayList() {
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType listType = mapper.getTypeFactory().constructType(List.class);
        CollectionType result = factory._mapAbstractCollectionType(listType, config);
        assertNotNull(result);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testMapAbstractCollectionType_UnknownType_ReturnsNull() {
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = mapper.getTypeFactory().constructType(ArrayList.class); // ไม่อยู่ใน fallback map
        CollectionType result = factory._mapAbstractCollectionType(type, config);
        assertNull(result);
    }

    @Test
    public void testFindRemappedType_NoResolvers_ReturnsNull() throws Exception {
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType result = factory._findRemappedType(config, List.class);
        // ไม่มี resolver -> mapAbstractType คืน type เดิม -> hasRawClass true -> null
        assertNull(result);
    }

    @Test
    public void testFindRemappedType_WithResolver_ReturnsRemappedType() throws Exception {
        AbstractTypeResolver resolver = mock(AbstractTypeResolver.class);
        JavaType arrayListType = mapper.getTypeFactory().constructType(ArrayList.class);
        when(resolver.findTypeMapping(any(DeserializationConfig.class), any(JavaType.class)))
                .thenReturn(arrayListType);
        BasicDeserializerFactory f2 = (BasicDeserializerFactory) factory.withAbstractTypeResolver(resolver);
        JavaType result = f2._findRemappedType(mapper.getDeserializationConfig(), List.class);
        assertNotNull(result);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    // ====================================================================
    // findTypeDeserializer - default typing not configured -> null branch
    // ====================================================================

    @Test
    public void testFindTypeDeserializerReturnsNullWithoutPolymorphicConfig() throws Exception {
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.constructType(SimplePojo.class);
        TypeDeserializer result = factory.findTypeDeserializer(config, type);
        assertNull(result);
    }

    // ====================================================================
    // Collection fallback (createCollectionDeserializer) - ทุก entry ใน _collectionFallbacks
    // ====================================================================

    @Test
    public void testDeserializeAbstractListFallsBackToArrayList() throws Exception {
        List<?> result = mapper.readValue("[1,2,3]", List.class);
        assertTrue(result instanceof ArrayList);
        assertEquals(3, result.size());
    }

    @Test
    public void testDeserializeEmptyListBoundary() throws Exception {
        List<?> result = mapper.readValue("[]", List.class);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testDeserializeAbstractSetFallsBackToHashSet() throws Exception {
        Set<?> result = mapper.readValue("[1,2,3]", Set.class);
        assertTrue(result instanceof HashSet);
    }

    @Test
    public void testDeserializeSortedSetFallsBackToTreeSet() throws Exception {
        SortedSet<?> result = mapper.readValue("[3,1,2]", SortedSet.class);
        assertTrue(result instanceof TreeSet);
    }

    @Test
    public void testDeserializeQueueFallsBackToLinkedList() throws Exception {
        Queue<?> result = mapper.readValue("[1,2,3]", Queue.class);
        assertTrue(result instanceof LinkedList);
    }

    @Test
    public void testDeserializeDequeFallsBackToLinkedList() throws Exception {
        Deque<?> result = mapper.readValue("[1,2,3]", Deque.class);
        assertTrue(result instanceof LinkedList);
    }

    @Test
    public void testDeserializeNavigableSetFallsBackToTreeSet() throws Exception {
        NavigableSet<?> result = mapper.readValue("[3,1,2]", NavigableSet.class);
        assertTrue(result instanceof TreeSet);
    }

    @Test
    public void testDeserializeArrayBlockingQueueSpecialCase() throws Exception {
        // ArrayBlockingQueue ไม่มี default constructor -> branch canCreateUsingDefault()==false
        ArrayBlockingQueue<?> result = mapper.readValue("[1,2,3]", ArrayBlockingQueue.class);
        assertEquals(3, result.size());
    }

    @Test
    public void testDeserializeIterableUpgradeToCollection() throws Exception {
        Iterable<?> result = mapper.readValue("[1,2,3]", Iterable.class);
        assertTrue(result instanceof Collection);
    }

    // ====================================================================
    // Map fallback (createMapDeserializer) - ทุก entry ใน _mapFallbacks
    // ====================================================================

    @Test
    public void testDeserializeAbstractMapFallsBackToLinkedHashMap() throws Exception {
        Map<?, ?> result = mapper.readValue("{\"a\":1}", Map.class);
        assertTrue(result instanceof LinkedHashMap);
    }

    @Test
    public void testDeserializeEmptyMapBoundary() throws Exception {
        Map<?, ?> result = mapper.readValue("{}", Map.class);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testDeserializeSortedMapFallsBackToTreeMap() throws Exception {
        SortedMap<?, ?> result = mapper.readValue("{\"a\":1}", SortedMap.class);
        assertTrue(result instanceof TreeMap);
    }

    @Test
    public void testDeserializeConcurrentMapFallsBackToConcurrentHashMap() throws Exception {
        ConcurrentMap<?, ?> result = mapper.readValue("{\"a\":1}", ConcurrentMap.class);
        assertTrue(result instanceof ConcurrentHashMap);
    }

    @Test
    public void testDeserializeNavigableMapFallsBackToTreeMap() throws Exception {
        NavigableMap<?, ?> result = mapper.readValue("{\"a\":1}", NavigableMap.class);
        assertTrue(result instanceof TreeMap);
    }

    @Test
    public void testDeserializeConcurrentNavigableMapFallsBackToConcurrentSkipListMap() throws Exception {
        ConcurrentNavigableMap<?, ?> result = mapper.readValue("{\"a\":1}", ConcurrentNavigableMap.class);
        assertTrue(result instanceof ConcurrentSkipListMap);
    }

    @Test
    public void testDeserializeMapWithIntegerKeyDeserializer() throws Exception {
        JavaType type = mapper.getTypeFactory().constructMapType(HashMap.class, Integer.class, String.class);
        Map<Integer, String> result = mapper.readValue("{\"1\":\"one\"}", type);
        assertEquals("one", result.get(1));
    }

    // ====================================================================
    // Array deserializer (createArrayDeserializer)
    // ====================================================================

    @Test
    public void testDeserializePrimitiveIntArray() throws Exception {
        int[] result = mapper.readValue("[1,2,3]", int[].class);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    public void testDeserializeStringArray() throws Exception {
        String[] result = mapper.readValue("[\"a\",\"b\"]", String[].class);
        assertArrayEquals(new String[]{"a", "b"}, result);
    }

    @Test
    public void testDeserializeObjectArrayOfBeans() throws Exception {
        SimplePojo[] result = mapper.readValue("[{\"x\":1},{\"x\":2}]", SimplePojo[].class);
        assertEquals(2, result.length);
        assertEquals(1, result[0].x);
        assertEquals(2, result[1].x);
    }

    // ====================================================================
    // Enum deserializer (createEnumDeserializer)
    // ====================================================================

    private enum Color { RED, GREEN, BLUE }

    private enum PaletteColor {
        RED, GREEN, BLUE;
        @JsonCreator
        public static PaletteColor from(String s) { return valueOf(s.toUpperCase()); }
    }

    private enum BadCreatorEnum {
        A, B;
        @JsonCreator
        public static BadCreatorEnum bad(String s, int i) { return A; } // argCount != 1 -> ต้อง throw
    }

    @Test
    public void testDeserializeSimpleEnum() throws Exception {
        Color c = mapper.readValue("\"GREEN\"", Color.class);
        assertEquals(Color.GREEN, c);
    }

    @Test
    public void testDeserializeEnumWithJsonCreatorFactory() throws Exception {
        PaletteColor c = mapper.readValue("\"red\"", PaletteColor.class);
        assertEquals(PaletteColor.RED, c);
    }

    @Test
    public void testDeserializeEnumWithInvalidCreator_Throws() {
        try {
            mapper.readValue("\"A\"", BadCreatorEnum.class);
            fail("ควร throw เพราะ @JsonCreator factory method มี argCount != 1");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException || e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserializeEnumSet() throws Exception {
        JavaType type = mapper.getTypeFactory().constructCollectionType(EnumSet.class, Color.class);
        @SuppressWarnings("unchecked")
        EnumSet<Color> result = (EnumSet<Color>) mapper.readValue("[\"RED\",\"BLUE\"]", type);
        assertTrue(result.contains(Color.RED));
        assertTrue(result.contains(Color.BLUE));
        assertFalse(result.contains(Color.GREEN));
    }

    @Test
    public void testDeserializeEnumMap() throws Exception {
        JavaType type = mapper.getTypeFactory().constructMapType(EnumMap.class, Color.class, String.class);
        @SuppressWarnings("unchecked")
        EnumMap<Color, String> result = (EnumMap<Color, String>) mapper.readValue("{\"RED\":\"r\"}", type);
        assertEquals("r", result.get(Color.RED));
    }

    @Test
    public void testDeserializeMapWithEnumKeyDeserializer() throws Exception {
        JavaType type = mapper.getTypeFactory().constructMapType(HashMap.class, Color.class, String.class);
        Map<Color, String> result = mapper.readValue("{\"RED\":\"r\"}", type);
        assertEquals("r", result.get(Color.RED));
    }

    // ====================================================================
    // findDefaultDeserializer - special raw types (Iterable/Map.Entry/AtomicReference)
    // ====================================================================

    @Test
    public void testDeserializeMapEntry() throws Exception {
        JavaType entryType = mapper.getTypeFactory()
                .constructParametricType(Map.Entry.class, String.class, Integer.class);
        Map.Entry<String, Integer> entry = mapper.readValue("{\"a\":1}", entryType);
        assertEquals("a", entry.getKey());
        assertEquals(Integer.valueOf(1), entry.getValue());
    }

    @Test
    public void testDeserializeAtomicReference() throws Exception {
        JavaType type = mapper.getTypeFactory().constructParametricType(AtomicReference.class, String.class);
        @SuppressWarnings("unchecked")
        AtomicReference<String> ref = (AtomicReference<String>) mapper.readValue("\"hello\"", type);
        assertEquals("hello", ref.get());
    }

    // ====================================================================
    // Tree deserializer (createTreeDeserializer)
    // ====================================================================

    @Test
    public void testDeserializeJsonNodeViaReadValue() throws Exception {
        JsonNode node = mapper.readValue("{\"a\":1}", JsonNode.class);
        assertTrue(node.isObject());
        assertEquals(1, node.get("a").asInt());
    }

    @Test
    public void testDeserializeObjectNodeSpecificSubtype() throws Exception {
        ObjectNode node = mapper.readValue("{\"a\":1}", ObjectNode.class);
        assertEquals(1, node.get("a").asInt());
    }

    // ====================================================================
    // ValueInstantiator / Creator logic (_addDeserializerConstructors, _addDeserializerFactoryMethods)
    // ====================================================================

    public static class SimplePojo {
        public int x;
    }

    public static class StringCtorBean {
        final String value;
        @JsonCreator
        public StringCtorBean(String value) { this.value = value; }
    }

    public static class IntCtorBean {
        final int value;
        @JsonCreator
        public IntCtorBean(int value) { this.value = value; }
    }

    public static class DelegatingCtorBean {
        final Map<String, Object> data;
        @JsonCreator
        public DelegatingCtorBean(Map<String, Object> data) { this.data = data; }
    }

    public static class BadMultiArgCtorBean {
        @JsonCreator
        public BadMultiArgCtorBean(@JsonProperty("a") int a, int b) { }
    }

    public static class GoodMultiArgCtorBean {
        final int a, b;
        @JsonCreator
        public GoodMultiArgCtorBean(@JsonProperty("a") int a, @JsonProperty("b") int b) {
            this.a = a; this.b = b;
        }
    }

    public static class StringFactoryBean {
        final String value;
        private StringFactoryBean(String value) { this.value = value; }
        @JsonCreator
        public static StringFactoryBean of(String value) { return new StringFactoryBean(value); }
    }

    public static class ZeroArgFactoryBean {
        public String value = "default";
        @JsonCreator
        public static ZeroArgFactoryBean create() { return new ZeroArgFactoryBean(); }
    }

    @Test
    public void testSingleArgStringConstructorCreator() throws Exception {
        StringCtorBean bean = mapper.readValue("\"hello\"", StringCtorBean.class);
        assertEquals("hello", bean.value);
    }

    @Test
    public void testSingleArgIntConstructorCreator() throws Exception {
        IntCtorBean bean = mapper.readValue("42", IntCtorBean.class);
        assertEquals(42, bean.value);
    }

    @Test
    public void testDelegatingConstructorCreatorNonStandardType() throws Exception {
        DelegatingCtorBean bean = mapper.readValue("{\"x\":1}", DelegatingCtorBean.class);
        assertEquals(1, bean.data.get("x"));
    }

    @Test
    public void testMultiArgConstructorMissingNames_Throws() {
        try {
            mapper.readValue("{\"a\":1,\"b\":2}", BadMultiArgCtorBean.class);
            fail("ควร throw เพราะ parameter #1 ไม่มีชื่อ property");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException || e instanceof JsonMappingException);
        }
    }

    @Test
    public void testMultiArgPropertyBasedConstructorSuccess() throws Exception {
        GoodMultiArgCtorBean bean = mapper.readValue("{\"a\":1,\"b\":2}", GoodMultiArgCtorBean.class);
        assertEquals(1, bean.a);
        assertEquals(2, bean.b);
    }

    @Test
    public void testStringFactoryMethodCreator() throws Exception {
        StringFactoryBean bean = mapper.readValue("\"world\"", StringFactoryBean.class);
        assertEquals("world", bean.value);
    }

    @Test
    public void testZeroArgFactoryMethodCreator() throws Exception {
        ZeroArgFactoryBean bean = mapper.readValue("{}", ZeroArgFactoryBean.class);
        assertEquals("default", bean.value);
    }

    // หมายเหตุ: กรณี non-static inner class + @JsonCreator (ที่ควร throw
    // "Non-static inner classes ... can not use @JsonCreator") ไม่ได้ครอบคลุมในชุดนี้
    // เนื่องจากการสร้าง constructor สองพารามิเตอร์ (implicit outer-ref + arg) ให้ตรงตามเงื่อนไข
    // ต้องพึ่งพา bytecode/parameter-name ที่ไม่แน่นอนข้าม compiler settings

    // ====================================================================
    // Malformed input
    // ====================================================================

    @Test(expected = com.fasterxml.jackson.core.JsonParseException.class)
    public void testMalformedJsonForListThrows() throws Exception {
        mapper.readValue("[1,2,", List.class);
    }
}
```

## สรุปตาราง Test Case → Branch/Condition ที่ครอบคลุม

| กลุ่มเมธอด Test | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testWithAdditionalDeserializers/KeyDeserializers/Modifier/AbstractTypeResolver/ValueInstantiators` | เมธอด fluent `withXxx()` ทั้งหมด — สร้าง config ใหม่และเก็บ handler ที่เพิ่มถูกต้อง |
| `testMapAbstractType_NoResolvers_ReturnsSameType` | `mapAbstractType`: `hasAbstractTypeResolvers()==false` → คืน type เดิม |
| `testMapAbstractType_ValidSubtypeResolution_Loops` | `mapAbstractType`: loop วนซ้ำ, resolver คืนค่า subtype ถูกต้อง, กรอง rawClass เท่ากันใน `_mapAbstractType2` |
| `testMapAbstractType_MultipleResolvers_SkipsNullThenMatches` | for-loop ใน `_mapAbstractType2` ข้าม resolver ที่คืน null แล้วเจอ resolver ที่ match |
| `testMapAbstractType_InvalidResolution_UnrelatedClass_Throws` | branch `!prevCls.isAssignableFrom(nextCls)` → throw `IllegalArgumentException` |
| `testMapAbstractCollectionType_KnownFallback/UnknownType` | `_mapAbstractCollectionType`: พบ/ไม่พบใน `_collectionFallbacks` |
| `testFindRemappedType_NoResolvers/WithResolver` | `_findRemappedType`: `hasRawClass` true/false branch |
| `testFindTypeDeserializerReturnsNullWithoutPolymorphicConfig` | `findTypeDeserializer`: `b==null` → return null |
| `testDeserializeAbstract*/Sorted*/Queue/Deque/NavigableSet` | `createCollectionDeserializer`: ทุก entry ของ `_collectionFallbacks`, `type.isInterface()/isAbstract()` |
| `testDeserializeArrayBlockingQueueSpecialCase` | branch `!inst.canCreateUsingDefault()` + `ArrayBlockingQueue.class` check |
| `testDeserializeIterableUpgradeToCollection` | `findDefaultDeserializer`: `rawType == CLASS_ITERABLE` |
| `testDeserializeAbstractMap/Sorted/Concurrent/NavigableMap*` | `createMapDeserializer`: ทุก entry ของ `_mapFallbacks` |
| `testDeserializeMapWithIntegerKeyDeserializer` | `createKeyDeserializer`: standard string-based key deserializer path |
| `testDeserializePrimitiveIntArray/StringArray/ObjectArrayOfBeans` | `createArrayDeserializer`: primitive, String, ObjectArrayDeserializer branches |
| `testDeserializeSimpleEnum` | `createEnumDeserializer`: ไม่มี factory annotated → EnumDeserializer ปกติ |
| `testDeserializeEnumWithJsonCreatorFactory` | `createEnumDeserializer`: single-arg `@JsonCreator` factory ที่ returnType assignable |
| `testDeserializeEnumWithInvalidCreator_Throws` | branch argCount != 1 → throw "Unsuitable method" |
| `testDeserializeEnumSet/EnumMap/MapWithEnumKeyDeserializer` | `EnumSet.class.isAssignableFrom`, `EnumMap` handling, `_createEnumKeyDeserializer` |
| `testDeserializeMapEntry/AtomicReference` | `findDefaultDeserializer`: `CLASS_MAP_ENTRY`, `isReferenceType()` branches |
| `testDeserializeJsonNode*/ObjectNodeSpecificSubtype` | `createTreeDeserializer`: custom==null → `JsonNodeDeserializer.getDeserializer` |
| `testSingleArgStringConstructorCreator/IntConstructorCreator` | `_handleSingleArgumentConstructor`: String/int type branches |
| `testDelegatingConstructorCreatorNonStandardType` | `_handleSingleArgumentConstructor`: non-standard type + `isCreator` → delegating creator |
| `testMultiArgConstructorMissingNames_Throws` | `_addDeserializerConstructors`: multi-arg, ขาดชื่อ property → throw |
| `testMultiArgPropertyBasedConstructorSuccess` | `_addDeserializerConstructors`: `namedCount+injectCount==argCount` → property creator |
| `testStringFactoryMethodCreator/ZeroArgFactoryMethodCreator` | `_addDeserializerFactoryMethods`: `argCount==0` (default creator), single-arg auto-detect |
| `testMalformedJsonForListThrows` | Boundary/malformed input (JSON parse error) |

**ข้อจำกัดที่ระบุไว้ในคอมเมนต์:**
- Branch `(prevCls == nextCls)` ใน `mapAbstractType` วิเคราะห์แล้วว่าเป็น dead code เนื่องจากถูกกรองใน `_mapAbstractType2` ก่อนแล้ว
- กรณี non-static inner class กับ `@JsonCreator` ไม่ได้ทดสอบเนื่องจากพึ่งพา parameter-name/bytecode ที่ไม่แน่นอน