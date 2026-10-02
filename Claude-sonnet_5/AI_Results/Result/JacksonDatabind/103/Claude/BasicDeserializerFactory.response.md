ด้านล่างนี้คือชุดทดสอบ JUnit 4 สำหรับ `BasicDeserializerFactory` โดยใช้วิธี "integration-style" ผ่าน `ObjectMapper`/`BeanDeserializerFactory.instance` (ซึ่งเป็น concrete subclass) เนื่องจากคลาสเป้าหมายเป็น `abstract class` และหลายเมธอดต้องการ `DeserializationContext`/`BeanDescription` ที่สร้างยากโดยตรง การทดสอบผ่าน public API จึงเป็นวิธีที่ปลอดภัยและตรวจจับ fault ได้จริง

**หมายเหตุสำคัญ:** วางคลาสทดสอบไว้ใน package เดียวกับคลาสเป้าหมาย (`com.fasterxml.jackson.databind.deser`) เพื่อให้เข้าถึง `BeanDeserializerFactory.instance` และ interface ที่เกี่ยวข้องได้สะดวก (ทั้งหมด public อยู่แล้ว)

```java
package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.BasicDeserializerFactory; // target class
import com.fasterxml.jackson.databind.DeserializerFactory;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;

/**
 * JUnit4 tests for {@link BasicDeserializerFactory} (tested indirectly via the
 * concrete subclass {@link BeanDeserializerFactory} and via {@link ObjectMapper}
 * public API, since BasicDeserializerFactory is abstract and many methods need
 * a fully-built DeserializationContext/BeanDescription that is impractical to
 * hand-construct).
 */
public class BasicDeserializerFactoryTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ----------------------------------------------------------------
    // Helper POJOs / enums used across tests
    // ----------------------------------------------------------------

    public static class Foo {
        public String name;
        public Foo() {}
    }

    public static class DefaultCtorBean {
        public String value;
        public DefaultCtorBean() {}
    }

    /** Single-arg String constructor, NOT annotated -> auto-detected delegating creator. */
    public static class StringCtorBean {
        public final String value;
        public StringCtorBean(String value) { this.value = value; }
    }

    /** Explicit DELEGATING mode, single int arg. */
    public static class ExplicitDelegatingBean {
        public final int num;
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public ExplicitDelegatingBean(int num) { this.num = num; }
    }

    /** Plain @JsonCreator (default mode) + explicit @JsonProperty names -> property-based creator. */
    public static class PropsCreatorBean {
        public final int a;
        public final String b;
        @JsonCreator
        public PropsCreatorBean(@JsonProperty("a") int a, @JsonProperty("b") String b) {
            this.a = a; this.b = b;
        }
    }

    /** Explicit PROPERTIES mode, multi-arg. */
    public static class ExplicitPropsBean {
        public final String x, y;
        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        public ExplicitPropsBean(@JsonProperty("x") String x, @JsonProperty("y") String y) {
            this.x = x; this.y = y;
        }
    }

    /**
     * Plain @JsonCreator, 2 args, NEITHER has @JsonProperty/inject -> should fail inside
     * {@code _addExplicitPropertyCreator} ("has no property name, is not Injectable").
     * NOTE: assumes test compiled WITHOUT "-parameters" javac flag (no implicit param names);
     * if build enables that flag, behavior could differ - flagged per instruction #4.
     */
    public static class BadMultiArgBean {
        public final String a;
        public final String b;
        @JsonCreator
        public BadMultiArgBean(String a, String b) { this.a = a; this.b = b; }
    }

    /**
     * Single constructor (no default ctor), NOT annotated with @JsonCreator, 2 args,
     * only ONE param explicitly named -> should fail inside the non-annotated multi-arg
     * branch of {@code _addDeserializerConstructors} ("has no property name annotation").
     * Same caveat about "-parameters" flag as above.
     */
    public static class PartialNamedBean {
        public final String a;
        public final String b;
        public PartialNamedBean(@JsonProperty("a") String a, String b) {
            this.a = a; this.b = b;
        }
    }

    public enum Color { RED, GREEN, BLUE }

    public enum Status {
        ACTIVE, INACTIVE;
        @JsonCreator
        public static Status fromValue(String v) {
            return "A".equalsIgnoreCase(v) ? ACTIVE : INACTIVE;
        }
    }

    public enum KeyEnumWithCreator {
        ONE, TWO;
        @JsonCreator
        public static KeyEnumWithCreator from(String s) {
            return "1".equals(s) ? ONE : TWO;
        }
    }

    public interface CustomCollectionIface extends Collection<String> {}
    public interface CustomMapIface extends Map<String, Integer> {}

    private boolean messageChainContains(Throwable t, String substr) {
        while (t != null) {
            if (t.getMessage() != null && t.getMessage().contains(substr)) {
                return true;
            }
            t = t.getCause();
        }
        return false;
    }

    // ==================================================================
    // 1. Fluent "with*" configuration methods
    // ==================================================================

    @Test
    public void testWithAdditionalDeserializers_ReturnsNewInstanceAndIsEffective() throws Exception {
        DeserializerFactory original = BeanDeserializerFactory.instance;

        SimpleModule module = new SimpleModule();
        module.addDeserializer(Foo.class, new JsonDeserializer<Foo>() {
            @Override
            public Foo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                Foo f = new Foo();
                f.name = "custom:" + p.getValueAsString();
                return f;
            }
        });
        ObjectMapper m2 = new ObjectMapper().registerModule(module);
        Foo result = m2.readValue("\"x\"", Foo.class);
        assertEquals("custom:x", result.name);

        // sanity: fluent method returns a *new* object, not same reference
        DeserializerFactory updated = original.withAdditionalDeserializers(
                new Deserializers.Base());
        assertNotSame(original, updated);
        assertNotSame(((BasicDeserializerFactory) original).getFactoryConfig(),
                ((BasicDeserializerFactory) updated).getFactoryConfig());
    }

    @Test
    public void testWithAdditionalKeyDeserializers_IsEffective() throws Exception {
        SimpleModule module = new SimpleModule();
        module.addKeyDeserializer(Color.class, new KeyDeserializer() {
            @Override
            public Object deserializeKey(String key, DeserializationContext ctxt) {
                return Color.valueOf(key.toUpperCase());
            }
        });
        ObjectMapper m2 = new ObjectMapper().registerModule(module);
        Map<Color, Integer> map = m2.readValue("{\"red\":1}",
                new TypeReference<Map<Color, Integer>>() {});
        assertEquals(Integer.valueOf(1), map.get(Color.RED));
    }

    @Test
    public void testWithDeserializerModifier_ModifyMapDeserializerInvoked() throws Exception {
        final AtomicInteger counter = new AtomicInteger();
        SimpleModule module = new SimpleModule();
        module.setDeserializerModifier(new BeanDeserializerModifier() {
            @Override
            public JsonDeserializer<?> modifyMapDeserializer(DeserializationConfig config,
                    MapType type, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                counter.incrementAndGet();
                return deserializer;
            }
        });
        ObjectMapper m2 = new ObjectMapper().registerModule(module);
        m2.readValue("{\"a\":1}", new TypeReference<Map<String, Integer>>() {});
        assertEquals(1, counter.get());
    }

    @Test
    public void testWithAbstractTypeResolver_MappedTypeIsUsed() throws Exception {
        DeserializationConfig config = mapper.getDeserializationConfig();
        AbstractTypeResolver resolver = new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig cfg, JavaType type) {
                if (type.hasRawClass(List.class)) {
                    return cfg.constructType(ArrayList.class);
                }
                return null;
            }
        };
        DeserializerFactory factory2 = BeanDeserializerFactory.instance
                .withAbstractTypeResolver(resolver);
        JavaType type = config.constructType(List.class);
        JavaType result = ((BasicDeserializerFactory) factory2).mapAbstractType(config, type);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testWithValueInstantiators_IsInvoked() throws Exception {
        final AtomicInteger counter = new AtomicInteger();
        SimpleModule module = new SimpleModule() {
            @Override
            public void setupModule(SetupContext context) {
                super.setupModule(context);
                context.addValueInstantiators(new ValueInstantiators() {
                    @Override
                    public ValueInstantiator findValueInstantiator(DeserializationConfig config,
                            BeanDescription beanDesc, ValueInstantiator defaultInstantiator) {
                        counter.incrementAndGet();
                        return defaultInstantiator;
                    }
                });
            }
        };
        ObjectMapper m2 = new ObjectMapper().registerModule(module);
        m2.readValue("{\"value\":\"hi\"}", DefaultCtorBean.class);
        assertTrue(counter.get() >= 1);
    }

    @Test
    public void testWithValueInstantiators_NullInstantiatorThrows() throws Exception {
        SimpleModule module = new SimpleModule() {
            @Override
            public void setupModule(SetupContext context) {
                super.setupModule(context);
                context.addValueInstantiators(new ValueInstantiators() {
                    @Override
                    public ValueInstantiator findValueInstantiator(DeserializationConfig config,
                            BeanDescription beanDesc, ValueInstantiator defaultInstantiator) {
                        return null; // broken implementation on purpose
                    }
                });
            }
        };
        ObjectMapper m2 = new ObjectMapper().registerModule(module);
        try {
            m2.readValue("{\"value\":\"hi\"}", DefaultCtorBean.class);
            fail("Expected JsonMappingException due to broken ValueInstantiators");
        } catch (JsonMappingException e) {
            assertTrue(messageChainContains(e, "Broken registered ValueInstantiators"));
        }
    }

    // ==================================================================
    // 2. mapAbstractType
    // ==================================================================

    @Test
    public void testMapAbstractType_NoResolversReturnsSameType() throws Exception {
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.constructType(List.class);
        JavaType result = ((BasicDeserializerFactory) BeanDeserializerFactory.instance)
                .mapAbstractType(config, type);
        assertEquals(type, result);
    }

    @Test
    public void testMapAbstractType_InvalidResolutionThrows() throws Exception {
        DeserializationConfig config = mapper.getDeserializationConfig();
        AbstractTypeResolver badResolver = new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig cfg, JavaType type) {
                // returns unrelated/non-subtype -> should trigger IllegalArgumentException
                return cfg.constructType(HashMap.class);
            }
        };
        DeserializerFactory factory2 = BeanDeserializerFactory.instance
                .withAbstractTypeResolver(badResolver);
        JavaType type = config.constructType(List.class);
        try {
            ((BasicDeserializerFactory) factory2).mapAbstractType(config, type);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid abstract type resolution"));
        }
    }

    // ==================================================================
    // 3. createArrayDeserializer branches
    // ==================================================================

    @Test
    public void testCreateArrayDeserializer_Primitive() throws Exception {
        int[] result = mapper.readValue("[1,2,3]", int[].class);
        assertArrayEquals(new int[]{1,2,3}, result);
    }

    @Test
    public void testCreateArrayDeserializer_String() throws Exception {
        String[] result = mapper.readValue("[\"a\",\"b\"]", String[].class);
        assertArrayEquals(new String[]{"a","b"}, result);
    }

    @Test
    public void testCreateArrayDeserializer_GenericObject() throws Exception {
        Foo[] result = mapper.readValue("[{\"name\":\"a\"}]", Foo[].class);
        assertEquals(1, result.length);
        assertEquals("a", result[0].name);
    }

    // ==================================================================
    // 4. createCollectionDeserializer branches
    // ==================================================================

    @Test
    public void testCreateCollectionDeserializer_ConcreteArrayList() throws Exception {
        ArrayList<Integer> result = mapper.readValue("[1,2,3]",
                new TypeReference<ArrayList<Integer>>() {});
        assertEquals(Arrays.asList(1,2,3), result);
    }

    @Test
    public void testCreateCollectionDeserializer_AbstractListFallsBackToArrayList() throws Exception {
        List<Integer> result = mapper.readValue("[1,2,3]",
                new TypeReference<List<Integer>>() {});
        assertTrue(result instanceof ArrayList);
        assertEquals(Arrays.asList(1,2,3), result);
    }

    @Test
    public void testCreateCollectionDeserializer_SetFallsBackToHashSet() throws Exception {
        Set<Integer> result = mapper.readValue("[1,2,3]",
                new TypeReference<Set<Integer>>() {});
        assertTrue(result instanceof HashSet);
        assertEquals(new HashSet<Integer>(Arrays.asList(1,2,3)), result);
    }

    @Test
    public void testCreateCollectionDeserializer_EnumSet() throws Exception {
        EnumSet<Color> result = mapper.readValue("[\"RED\",\"GREEN\"]",
                new TypeReference<EnumSet<Color>>() {});
        assertEquals(EnumSet.of(Color.RED, Color.GREEN), result);
    }

    @Test
    public void testCreateCollectionDeserializer_StringContentUsesStringCollectionPath() throws Exception {
        Collection<String> result = mapper.readValue("[\"a\",\"b\"]",
                new TypeReference<Collection<String>>() {});
        assertEquals(Arrays.asList("a","b"), new ArrayList<String>(result));
    }

    @Test
    public void testCreateCollectionDeserializer_NonConcreteWithoutFallbackThrows() {
        try {
            mapper.readValue("[\"a\"]", CustomCollectionIface.class);
            fail("Expected failure for non-concrete Collection type without fallback");
        } catch (Exception e) {
            assertTrue(messageChainContains(e, "Cannot find a deserializer for non-concrete Collection type"));
        }
    }

    // ==================================================================
    // 5. createMapDeserializer branches
    // ==================================================================

    @Test
    public void testCreateMapDeserializer_ConcreteHashMap() throws Exception {
        HashMap<String, Integer> result = mapper.readValue("{\"a\":1}",
                new TypeReference<HashMap<String, Integer>>() {});
        assertEquals(Integer.valueOf(1), result.get("a"));
    }

    @Test
    public void testCreateMapDeserializer_AbstractMapFallsBackToLinkedHashMap() throws Exception {
        Map<String, Integer> result = mapper.readValue("{\"a\":1}",
                new TypeReference<Map<String, Integer>>() {});
        assertTrue(result instanceof LinkedHashMap);
    }

    @Test
    public void testCreateMapDeserializer_EnumMap() throws Exception {
        EnumMap<Color, Integer> result = mapper.readValue("{\"RED\":1}",
                new TypeReference<EnumMap<Color, Integer>>() {});
        assertEquals(Integer.valueOf(1), result.get(Color.RED));
    }

    @Test
    public void testCreateMapDeserializer_NonConcreteWithoutFallbackThrows() {
        try {
            mapper.readValue("{\"a\":1}", CustomMapIface.class);
            fail("Expected failure for non-concrete Map type without fallback");
        } catch (Exception e) {
            assertTrue(messageChainContains(e, "Cannot find a deserializer for non-concrete Map type"));
        }
    }

    // ==================================================================
    // 6. createEnumDeserializer branches
    // ==================================================================

    @Test
    public void testCreateEnumDeserializer_Basic() throws Exception {
        Color c = mapper.readValue("\"RED\"", Color.class);
        assertEquals(Color.RED, c);
    }

    @Test
    public void testCreateEnumDeserializer_WithFactoryCreator() throws Exception {
        Status s = mapper.readValue("\"A\"", Status.class);
        assertEquals(Status.ACTIVE, s);
    }

    // ==================================================================
    // 7. createReferenceDeserializer / createTreeDeserializer
    // ==================================================================

    @Test
    public void testCreateReferenceDeserializer_AtomicReference() throws Exception {
        AtomicReference<String> ref = mapper.readValue("\"hello\"",
                new TypeReference<AtomicReference<String>>() {});
        assertEquals("hello", ref.get());
    }

    @Test
    public void testCreateTreeDeserializer_ObjectNode() throws Exception {
        JsonNode node = mapper.readValue("{\"a\":1}", JsonNode.class);
        assertTrue(node instanceof ObjectNode);
        assertEquals(1, node.get("a").asInt());
    }

    // ==================================================================
    // 8. createKeyDeserializer branches
    // ==================================================================

    @Test
    public void testCreateKeyDeserializer_EnumKeyDefault() throws Exception {
        Map<Color, Integer> result = mapper.readValue("{\"RED\":1}",
                new TypeReference<Map<Color, Integer>>() {});
        assertEquals(Integer.valueOf(1), result.get(Color.RED));
    }

    @Test
    public void testCreateKeyDeserializer_EnumKeyWithFactoryCreator() throws Exception {
        Map<KeyEnumWithCreator, Integer> result = mapper.readValue("{\"1\":10}",
                new TypeReference<Map<KeyEnumWithCreator, Integer>>() {});
        assertEquals(Integer.valueOf(10), result.get(KeyEnumWithCreator.ONE));
    }

    @Test
    public void testCreateKeyDeserializer_StringKey() throws Exception {
        Map<String, Integer> result = mapper.readValue("{\"x\":1}",
                new TypeReference<Map<String, Integer>>() {});
        assertEquals(Integer.valueOf(1), result.get("x"));
    }

    // ==================================================================
    // 9. findValueInstantiator / creator-introspection branches
    // ==================================================================

    @Test
    public void testFindValueInstantiator_DefaultConstructor() throws Exception {
        DefaultCtorBean bean = mapper.readValue("{\"value\":\"hi\"}", DefaultCtorBean.class);
        assertEquals("hi", bean.value);
    }

    @Test
    public void testFindValueInstantiator_ImplicitSingleArgStringDelegating() throws Exception {
        StringCtorBean bean = mapper.readValue("\"hello\"", StringCtorBean.class);
        assertEquals("hello", bean.value);
    }

    @Test
    public void testFindValueInstantiator_ExplicitDelegatingSingleIntArg() throws Exception {
        ExplicitDelegatingBean bean = mapper.readValue("42", ExplicitDelegatingBean.class);
        assertEquals(42, bean.num);
    }

    @Test
    public void testFindValueInstantiator_DefaultModePropertiesCreator() throws Exception {
        PropsCreatorBean bean = mapper.readValue("{\"a\":5,\"b\":\"hi\"}", PropsCreatorBean.class);
        assertEquals(5, bean.a);
        assertEquals("hi", bean.b);
    }

    @Test
    public void testFindValueInstantiator_ExplicitPropertiesModeMultiArg() throws Exception {
        ExplicitPropsBean bean = mapper.readValue("{\"x\":\"foo\",\"y\":\"bar\"}", ExplicitPropsBean.class);
        assertEquals("foo", bean.x);
        assertEquals("bar", bean.y);
    }

    @Test
    public void testFindValueInstantiator_MultiArgNoNames_ExplicitAnyCreatorThrows() {
        // See BadMultiArgBean javadoc: depends on compiler not retaining parameter names.
        try {
            mapper.readValue("{\"a\":\"1\",\"b\":\"2\"}", BadMultiArgBean.class);
            fail("Expected JsonMappingException for missing property-name annotation");
        } catch (Exception e) {
            assertTrue("Unexpected exception type: " + e,
                    e instanceof JsonMappingException || messageChainContains(e, "property name"));
        }
    }

    @Test
    public void testFindValueInstantiator_PartialNamedMultiArgCtor_Throws() {
        // See PartialNamedBean javadoc: depends on compiler not retaining parameter names.
        try {
            mapper.readValue("{\"a\":\"1\",\"b\":\"2\"}", PartialNamedBean.class);
            fail("Expected JsonMappingException for incomplete property naming on constructor");
        } catch (Exception e) {
            assertTrue("Unexpected exception type: " + e,
                    e instanceof JsonMappingException || messageChainContains(e, "property name"));
        }
    }

    // ==================================================================
    // 10. Boundary / null / malformed-input style checks (via ObjectMapper)
    // ==================================================================

    @Test
    public void testCreateCollectionDeserializer_EmptyArrayInput() throws Exception {
        List<Integer> result = mapper.readValue("[]", new TypeReference<List<Integer>>() {});
        assertTrue(result.isEmpty());
    }

    @Test
    public void testCreateMapDeserializer_EmptyObjectInput() throws Exception {
        Map<String, Integer> result = mapper.readValue("{}", new TypeReference<Map<String, Integer>>() {});
        assertTrue(result.isEmpty());
    }

    @Test(expected = Exception.class)
    public void testCreateEnumDeserializer_MalformedInputThrows() throws Exception {
        // not a known enum constant -> should fail
        mapper.readValue("\"NOT_A_COLOR\"", Color.class);
    }
}
```

## สรุปตาราง Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุมใน `BasicDeserializerFactory` |
|---|---|
| testWithAdditionalDeserializers_ReturnsNewInstanceAndIsEffective | `withAdditionalDeserializers`, immutability (new config instance), `_findCustomBeanDeserializer` loop พบ deserializer |
| testWithAdditionalKeyDeserializers_IsEffective | `withAdditionalKeyDeserializers`, `createKeyDeserializer`: `_factoryConfig.hasKeyDeserializers()` == true, loop เจอ deser |
| testWithDeserializerModifier_ModifyMapDeserializerInvoked | `withDeserializerModifier`, `createMapDeserializer`: `hasDeserializerModifiers()` true, loop modifier |
| testWithAbstractTypeResolver_MappedTypeIsUsed | `withAbstractTypeResolver`, `_mapAbstractType2`: resolver คืนค่า concrete type |
| testWithValueInstantiators_IsInvoked | `withValueInstantiators`, loop `insts.findValueInstantiator(...)` คืนค่าไม่ null |
| testWithValueInstantiators_NullInstantiatorThrows | branch `if (instantiator == null) ctxt.reportBadTypeDefinition(...)` |
| testMapAbstractType_NoResolversReturnsSameType | `mapAbstractType` เมื่อ `_mapAbstractType2` คืน null → คืน type เดิม |
| testMapAbstractType_InvalidResolutionThrows | `mapAbstractType`: `!prevCls.isAssignableFrom(nextCls)` → `IllegalArgumentException` |
| testCreateArrayDeserializer_Primitive | `createArrayDeserializer`: branch `elemType.isPrimitive()` |
| testCreateArrayDeserializer_String | branch `raw == String.class` → `StringArrayDeserializer` |
| testCreateArrayDeserializer_GenericObject | branch fallback `ObjectArrayDeserializer` |
| testCreateCollectionDeserializer_ConcreteArrayList | `createCollectionDeserializer`: concrete class, ไม่ผ่าน interface/abstract branch |
| testCreateCollectionDeserializer_AbstractListFallsBackToArrayList | branch `type.isInterface()` → `_mapAbstractCollectionType` พบ fallback |
| testCreateCollectionDeserializer_SetFallsBackToHashSet | เช่นเดียวกันสำหรับ `Set` fallback |
| testCreateCollectionDeserializer_EnumSet | branch `EnumSet.class.isAssignableFrom(collectionClass)` |
| testCreateCollectionDeserializer_StringContentUsesStringCollectionPath | branch `contentType.hasRawClass(String.class)` → `StringCollectionDeserializer` |
| testCreateCollectionDeserializer_NonConcreteWithoutFallbackThrows | branch `implType == null` → `IllegalArgumentException` |
| testCreateMapDeserializer_ConcreteHashMap | `createMapDeserializer`: concrete map, generic `MapDeserializer` path |
| testCreateMapDeserializer_AbstractMapFallsBackToLinkedHashMap | branch `type.isInterface()`/`_mapFallbacks` |
| testCreateMapDeserializer_EnumMap | branch `EnumMap.class.isAssignableFrom(mapClass)` (`mapClass==EnumMap.class` → `inst=null`) |
| testCreateMapDeserializer_NonConcreteWithoutFallbackThrows | branch `fallback == null` → `IllegalArgumentException` |
| testCreateEnumDeserializer_Basic | `createEnumDeserializer`: ไม่มี creator → `EnumDeserializer` ปกติ |
| testCreateEnumDeserializer_WithFactoryCreator | branch loop พบ `@JsonCreator` factory, `returnType.isAssignableFrom(enumClass)` |
| testCreateReferenceDeserializer_AtomicReference | `createReferenceDeserializer`: `type.isTypeOrSubTypeOf(AtomicReference.class)`, `rawType == AtomicReference.class` → `inst=null` |
| testCreateTreeDeserializer_ObjectNode | `createTreeDeserializer`: `custom==null` → `JsonNodeDeserializer.getDeserializer` |
| testCreateKeyDeserializer_EnumKeyDefault | `createKeyDeserializer`/`_createEnumKeyDeserializer`: default path ไม่มี creator/custom deser |
| testCreateKeyDeserializer_EnumKeyWithFactoryCreator | branch loop พบ `@JsonCreator` factory 1 arg String → `constructEnumKeyDeserializer(enumRes,factory)` |
| testCreateKeyDeserializer_StringKey | branch `type.isEnumType()==false` → `StdKeyDeserializers.findStringBasedKeyDeserializer` |
| testFindValueInstantiator_DefaultConstructor | `_addDeserializerConstructors`: `defaultCtor != null` → `setDefaultCreator` |
| testFindValueInstantiator_ImplicitSingleArgStringDelegating | nonAnnotated single-arg branch, `_checkIfCreatorPropertyBased` → false → `_handleSingleArgumentCreator` (String, isVisible) |
| testFindValueInstantiator_ExplicitDelegatingSingleIntArg | `_addExplicitDelegatingCreator` single-arg, `_handleSingleArgumentCreator` (int) |
| testFindValueInstantiator_DefaultModePropertiesCreator | `_addExplicitAnyCreator` multi-arg → `_addExplicitPropertyCreator` (success) |
| testFindValueInstantiator_ExplicitPropertiesModeMultiArg | switch-case `PROPERTIES` ใน `_addDeserializerConstructors` |
| testFindValueInstantiator_MultiArgNoNames_ExplicitAnyCreatorThrows | `_addExplicitPropertyCreator`: `(name==null)&&(injectId==null)` → exception |
| testFindValueInstantiator_PartialNamedMultiArgCtor_Throws | nonAnnotated multi-arg "epic fail" branch ใน `_addDeserializerConstructors` |
| testCreateCollectionDeserializer_EmptyArrayInput | boundary: empty collection input |
| testCreateMapDeserializer_EmptyObjectInput | boundary: empty map input |
| testCreateEnumDeserializer_MalformedInputThrows | malformed input: ค่า enum ที่ไม่มีอยู่จริง |

**หมายเหตุ/ข้อจำกัดที่ระบุไว้ตามกฎข้อ 4:**
- Branch ของ `_findStdValueInstantiator` ที่ตรวจ `Collections.EMPTY_SET/LIST/MAP` ไม่สามารถทดสอบตรงได้ เพราะ type เหล่านั้นเป็น private nested class ของ JDK — **ข้าม** (ไม่ได้เดา behavior)
- Branch `JsonLocation.class` ใน `_findStdValueInstantiator` มีความซับซ้อนในการสร้าง input ที่ถูกต้อง — **ข้าม**
- Test `testFindValueInstantiator_MultiArgNoNames_ExplicitAnyCreatorThrows` และ `testFindValueInstantiator_PartialNamedMultiArgCtor_Throws` ขึ้นกับว่า build ไม่ได้เปิด flag `-parameters` ของ javac (ตามที่ระบุไว้ใน comment ของ source code)