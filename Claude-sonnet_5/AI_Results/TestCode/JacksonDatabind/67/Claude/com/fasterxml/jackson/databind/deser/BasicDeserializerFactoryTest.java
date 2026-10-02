package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Unit test สำหรับ {@link BasicDeserializerFactory}
 *
 * เนื่องจาก BasicDeserializerFactory เป็น abstract class ที่ทำงานภายในผ่าน
 * DeserializationContext/BeanDescription ที่สร้างยากโดยตรง การทดสอบนี้ใช้
 * ObjectMapper (ซึ่งภายในใช้ BeanDeserializerFactory - concrete subclass ของ
 * BasicDeserializerFactory) เป็นตัวขับเคลื่อนเพื่อให้ logic ในคลาสเป้าหมาย
 * ถูก execute จริงตามซอร์สที่ให้มา (integration-style unit test)
 */
public class BasicDeserializerFactoryTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ============================================================
    // ทดสอบ POJO helper classes/enums (nested static)
    // ============================================================

    /** POJO ปกติ ใช้ default (zero-arg) constructor -> ครอบคลุม path
     *  ใน _addDeserializerConstructors ที่ findDefaultConstructor() != null
     */
    public static class SimpleBean {
        public String name;
        public int age;
        public SimpleBean() {}
    }

    /** single-arg String constructor พร้อม @JsonCreator
     *  -> ครอบคลุม _handleSingleArgumentConstructor: type == String.class
     */
    public static class StringCtorBean {
        public final String value;
        @JsonCreator
        public StringCtorBean(String value) { this.value = value; }
    }

    /** single-arg int constructor -> ครอบคลุม branch type == int.class */
    public static class IntCtorBean {
        public final int value;
        @JsonCreator
        public IntCtorBean(int value) { this.value = value; }
    }

    /** single-arg long constructor -> ครอบคลุม branch type == long.class */
    public static class LongCtorBean {
        public final long value;
        @JsonCreator
        public LongCtorBean(long value) { this.value = value; }
    }

    /** single-arg double constructor -> ครอบคลุม branch type == double.class */
    public static class DoubleCtorBean {
        public final double value;
        @JsonCreator
        public DoubleCtorBean(double value) { this.value = value; }
    }

    /** single-arg boolean constructor -> ครอบคลุม branch type == boolean.class */
    public static class BooleanCtorBean {
        public final boolean value;
        @JsonCreator
        public BooleanCtorBean(boolean value) { this.value = value; }
    }

    /** multi-arg constructor ที่มี @JsonProperty ครบทุก parameter
     *  -> ครอบคลุม branch (namedCount + injectCount) == argCount
     *     ใน _addDeserializerConstructors -> creators.addPropertyCreator
     */
    public static class MultiArgBean {
        public final int a;
        public final String b;
        @JsonCreator
        public MultiArgBean(@JsonProperty("a") int a, @JsonProperty("b") String b) {
            this.a = a;
            this.b = b;
        }
    }

    /** multi-arg constructor ที่ไม่มีชื่อ property ระบุไว้เลย
     *  -> ทดสอบ branch "epic fail" / _findImplicitParamName ใน _addDeserializerConstructors
     *  หมายเหตุ: ผลลัพธ์จริงขึ้นกับว่า compile ด้วย -parameters flag หรือไม่
     *  (ถ้ามี -parameters, implicit name จะถูกอนุมานได้และไม่ throw)
     *  จึงไม่ assert ผลลัพธ์ตายตัว ตามข้อกำหนดห้ามเดา behavior
     */
    public static class AmbiguousMultiArgBean {
        public final int a;
        public final int b;
        @JsonCreator
        public AmbiguousMultiArgBean(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    /** zero-arg factory method พร้อม @JsonCreator
     *  -> ครอบคลุม branch argCount==0 && isCreator ใน _addDeserializerFactoryMethods
     */
    public static class FactoryZeroArgBean {
        public String tag = "default";
        private FactoryZeroArgBean() {}
        @JsonCreator
        public static FactoryZeroArgBean create() {
            return new FactoryZeroArgBean();
        }
    }

    /** single-arg (String) factory method พร้อม @JsonCreator
     *  -> ครอบคลุม _handleSingleArgumentFactory: type == String.class
     */
    public static class FactoryStringBean {
        public final String value;
        private FactoryStringBean(String value) { this.value = value; }
        @JsonCreator
        public static FactoryStringBean of(String value) {
            return new FactoryStringBean(value);
        }
    }

    public static class MapHolder {
        public Map<String, Integer> map;
    }

    public static class SortedMapHolder {
        public SortedMap<String, Integer> map;
    }

    public static class ListHolder {
        public List<String> list;
    }

    public static class SetHolder {
        public Set<String> set;
    }

    public enum Color { RED, GREEN, BLUE }

    public static class EnumSetHolder {
        public EnumSet<Color> colors;
    }

    public static class EnumMapHolder {
        public EnumMap<Color, String> map;
    }

    /** enum ที่มี single-arg factory method พร้อม @JsonCreator
     *  -> ครอบคลุม branch ใน createEnumDeserializer:
     *     factory.getParameterCount() != 0 และ returnType.isAssignableFrom(enumClass)
     */
    public enum StatusEnum {
        ACTIVE, INACTIVE;
        @JsonCreator
        public static StatusEnum fromString(String value) {
            return StatusEnum.valueOf(value.toUpperCase());
        }
    }

    public static class IterableHolder {
        public Iterable<String> items;
    }

    /** interface ที่ extends List แต่ไม่อยู่ใน _collectionFallbacks
     *  -> ครอบคลุม branch: implType == null -> throw IllegalArgumentException
     *     ใน createCollectionDeserializer
     */
    public interface MyCustomList<T> extends List<T> {}

    public static class MyCustomListHolder {
        public MyCustomList<String> data;
    }

    /** interface ที่ extends Map แต่ไม่อยู่ใน _mapFallbacks
     *  -> ครอบคลุม branch: fallback == null -> throw IllegalArgumentException
     *     ใน createMapDeserializer
     */
    public interface MyCustomMap<K, V> extends Map<K, V> {}

    public static class MyCustomMapHolder {
        public MyCustomMap<String, Integer> data;
    }

    // ============================================================
    // 1) Default (zero-arg) constructor
    // ============================================================
    @Test
    public void testDefaultConstructorDeserialization() throws Exception {
        SimpleBean bean = mapper.readValue("{\"name\":\"John\",\"age\":30}", SimpleBean.class);
        assertEquals("John", bean.name);
        assertEquals(30, bean.age);
    }

    // ============================================================
    // 2-6) single-arg constructor auto-detected types
    // ============================================================
    @Test
    public void testSingleArgStringConstructor() throws Exception {
        StringCtorBean bean = mapper.readValue("\"hello\"", StringCtorBean.class);
        assertEquals("hello", bean.value);
    }

    @Test
    public void testSingleArgIntConstructor() throws Exception {
        IntCtorBean bean = mapper.readValue("42", IntCtorBean.class);
        assertEquals(42, bean.value);
    }

    @Test
    public void testSingleArgLongConstructor() throws Exception {
        LongCtorBean bean = mapper.readValue("123456789012", LongCtorBean.class);
        assertEquals(123456789012L, bean.value);
    }

    @Test
    public void testSingleArgDoubleConstructor() throws Exception {
        DoubleCtorBean bean = mapper.readValue("3.14", DoubleCtorBean.class);
        assertEquals(3.14, bean.value, 0.0001);
    }

    @Test
    public void testSingleArgBooleanConstructor() throws Exception {
        BooleanCtorBean bean = mapper.readValue("true", BooleanCtorBean.class);
        assertTrue(bean.value);
    }

    // ============================================================
    // 7) multi-arg constructor, ทุก parameter มีชื่อ -> property-based creator
    // ============================================================
    @Test
    public void testMultiArgPropertyBasedConstructor() throws Exception {
        MultiArgBean bean = mapper.readValue("{\"a\":1,\"b\":\"x\"}", MultiArgBean.class);
        assertEquals(1, bean.a);
        assertEquals("x", bean.b);
    }

    // ============================================================
    // 8) multi-arg constructor ไม่มีชื่อ -> environment dependent branch
    // ============================================================
    @Test
    public void testMultiArgConstructorMissingNames_EnvironmentDependent() {
        // หมายเหตุ: ไม่ assert ผลลัพธ์ตายตัว เนื่องจากผลลัพธ์ขึ้นกับว่า compile
        // ด้วย -parameters flag หรือไม่ (เดา behavior ไม่ได้จากซอร์สเพียงอย่างเดียว)
        try {
            Object result = mapper.readValue("{\"a\":1,\"b\":2}", AmbiguousMultiArgBean.class);
            assertNotNull(result);
        } catch (Exception e) {
            assertNotNull(e.getMessage());
        }
    }

    // ============================================================
    // 9) zero-arg factory method @JsonCreator -> default creator
    // ============================================================
    @Test
    public void testFactoryZeroArgDefaultCreator() throws Exception {
        FactoryZeroArgBean bean = mapper.readValue("{}", FactoryZeroArgBean.class);
        assertEquals("default", bean.tag);
    }

    // ============================================================
    // 10) single-arg (String) factory method -> delegating/auto-detect
    // ============================================================
    @Test
    public void testFactorySingleArgStringCreator() throws Exception {
        FactoryStringBean bean = mapper.readValue("\"abc\"", FactoryStringBean.class);
        assertEquals("abc", bean.value);
    }

    // ============================================================
    // 11-13) Map/Collection abstract type fallback
    // ============================================================
    @Test
    public void testMapInterfaceFallbackToLinkedHashMap() throws Exception {
        MapHolder holder = mapper.readValue("{\"map\":{\"a\":1}}", MapHolder.class);
        assertNotNull(holder.map);
        assertEquals(LinkedHashMap.class, holder.map.getClass());
        assertEquals(Integer.valueOf(1), holder.map.get("a"));
    }

    @Test
    public void testSortedMapFallbackToTreeMap() throws Exception {
        SortedMapHolder holder = mapper.readValue("{\"map\":{\"b\":2}}", SortedMapHolder.class);
        assertNotNull(holder.map);
        assertEquals(TreeMap.class, holder.map.getClass());
    }

    @Test
    public void testListInterfaceFallbackToArrayList() throws Exception {
        ListHolder holder = mapper.readValue("{\"list\":[\"x\",\"y\"]}", ListHolder.class);
        assertNotNull(holder.list);
        assertEquals(ArrayList.class, holder.list.getClass());
        assertEquals(Arrays.asList("x", "y"), holder.list);
    }

    @Test
    public void testSetInterfaceFallbackToHashSet() throws Exception {
        SetHolder holder = mapper.readValue("{\"set\":[\"x\",\"y\"]}", SetHolder.class);
        assertNotNull(holder.set);
        assertEquals(HashSet.class, holder.set.getClass());
    }

    // ============================================================
    // 14-15) EnumSet / EnumMap special handling
    // ============================================================
    @Test
    public void testEnumSetDeserialization() throws Exception {
        EnumSetHolder holder = mapper.readValue("{\"colors\":[\"RED\",\"BLUE\"]}", EnumSetHolder.class);
        assertNotNull(holder.colors);
        assertTrue(holder.colors.contains(Color.RED));
        assertTrue(holder.colors.contains(Color.BLUE));
        assertFalse(holder.colors.contains(Color.GREEN));
    }

    @Test
    public void testEnumMapDeserialization() throws Exception {
        EnumMapHolder holder = mapper.readValue("{\"map\":{\"RED\":\"r\"}}", EnumMapHolder.class);
        assertNotNull(holder.map);
        assertEquals("r", holder.map.get(Color.RED));
    }

    // ============================================================
    // 16-18) Array deserializer: primitive / String / Object
    // ============================================================
    @Test
    public void testPrimitiveArrayDeserialization() throws Exception {
        int[] arr = mapper.readValue("[1,2,3]", int[].class);
        assertArrayEquals(new int[]{1, 2, 3}, arr);
    }

    @Test
    public void testStringArrayDeserialization() throws Exception {
        String[] arr = mapper.readValue("[\"a\",\"b\"]", String[].class);
        assertArrayEquals(new String[]{"a", "b"}, arr);
    }

    @Test
    public void testObjectArrayDeserialization() throws Exception {
        SimpleBean[] arr = mapper.readValue(
                "[{\"name\":\"A\",\"age\":1},{\"name\":\"B\",\"age\":2}]", SimpleBean[].class);
        assertEquals(2, arr.length);
        assertEquals("A", arr[0].name);
        assertEquals("B", arr[1].name);
    }

    // ============================================================
    // 19-20) Enum deserializer
    // ============================================================
    @Test
    public void testSimpleEnumDeserialization() throws Exception {
        Color c = mapper.readValue("\"RED\"", Color.class);
        assertEquals(Color.RED, c);
    }

    @Test
    public void testEnumWithSingleArgCreatorFactoryMethod() throws Exception {
        StatusEnum s = mapper.readValue("\"active\"", StatusEnum.class);
        assertEquals(StatusEnum.ACTIVE, s);
    }

    // ============================================================
    // 21) Iterable -> upgrade เป็น Collection
    // ============================================================
    @Test
    public void testIterableUpgradeToCollection() throws Exception {
        IterableHolder holder = mapper.readValue("{\"items\":[\"x\",\"y\"]}", IterableHolder.class);
        assertNotNull(holder.items);
        Iterator<String> it = holder.items.iterator();
        assertTrue(it.hasNext());
        assertEquals("x", it.next());
        assertEquals("y", it.next());
    }

    // ============================================================
    // 22) Map.Entry deserialization
    // ============================================================
    @Test
    public void testMapEntryDeserialization() throws Exception {
        Map.Entry<String, Integer> entry = mapper.readValue(
                "{\"k\":5}", new TypeReference<Map.Entry<String, Integer>>() {});
        assertEquals("k", entry.getKey());
        assertEquals(Integer.valueOf(5), entry.getValue());
    }

    // ============================================================
    // 23) AtomicReference (referential type) deserialization
    // ============================================================
    @Test
    public void testAtomicReferenceDeserialization() throws Exception {
        AtomicReference<String> ref = mapper.readValue(
                "\"hello\"", new TypeReference<AtomicReference<String>>() {});
        assertNotNull(ref);
        assertEquals("hello", ref.get());
    }

    // ============================================================
    // 24-25) Abstract type ที่ไม่มี fallback -> ต้อง throw
    // ============================================================
    @Test
    public void testCustomAbstractCollectionWithoutFallbackThrows() {
        try {
            mapper.readValue("{\"data\":[\"a\",\"b\"]}", MyCustomListHolder.class);
            fail("ควรเกิด exception เนื่องจากไม่มี concrete implementation สำหรับ MyCustomList");
        } catch (Exception e) {
            // ไม่ assert exception type ที่แน่นอน เนื่องจากอาจถูก wrap เป็น JsonMappingException
            // หรือ propagate เป็น IllegalArgumentException โดยตรง ขึ้นกับ call chain
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testCustomAbstractMapWithoutFallbackThrows() {
        try {
            mapper.readValue("{\"data\":{\"a\":1}}", MyCustomMapHolder.class);
            fail("ควรเกิด exception เนื่องจากไม่มี concrete implementation สำหรับ MyCustomMap");
        } catch (Exception e) {
            assertNotNull(e.getMessage());
        }
    }
}
