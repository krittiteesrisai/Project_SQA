package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.TokenBuffer;

// import คลาสเป้าหมายตามข้อกำหนด
import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;

public class BuilderBasedDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    /* ==========================================================
     * Fixtures
     * ========================================================== */

    // --- 1) Vanilla bean/builder (ไม่มี feature พิเศษ) ---
    @JsonDeserialize(builder = SimplePojo.Builder.class)
    static class SimplePojo {
        private final String name;
        private final int age;
        SimplePojo(String name, int age) { this.name = name; this.age = age; }
        public String getName() { return name; }
        public int getAge() { return age; }

        @JsonPOJOBuilder(withPrefix = "with", buildMethodName = "build")
        static class Builder {
            String name;
            int age;
            public Builder withName(String name) { this.name = name; return this; }
            public Builder withAge(int age) { this.age = age; return this; }
            public SimplePojo build() { return new SimplePojo(name, age); }
        }
    }

    // --- 2) ignoreUnknown = true ---
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonDeserialize(builder = IgnoreUnknownPojo.Builder.class)
    static class IgnoreUnknownPojo {
        private final String name;
        IgnoreUnknownPojo(String name) { this.name = name; }
        public String getName() { return name; }

        @JsonPOJOBuilder(withPrefix = "with")
        static class Builder {
            String name;
            public Builder withName(String n) { this.name = n; return this; }
            public IgnoreUnknownPojo build() { return new IgnoreUnknownPojo(name); }
        }
    }

    // --- 3) @JsonView ---
    static class ViewA {}

    @JsonDeserialize(builder = ViewPojo.Builder.class)
    static class ViewPojo {
        private final String name;
        private final String secret;
        ViewPojo(String name, String secret) { this.name = name; this.secret = secret; }
        public String getName() { return name; }
        public String getSecret() { return secret; }

        @JsonPOJOBuilder(withPrefix = "with")
        static class Builder {
            String name;
            String secret;
            public Builder withName(String n) { this.name = n; return this; }
            @JsonView(ViewA.class)
            public Builder withSecret(String s) { this.secret = s; return this; }
            public ViewPojo build() { return new ViewPojo(name, secret); }
        }
    }

    // --- 4) Property-based creator + trailing property + ignoreUnknown ---
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonDeserialize(builder = CreatorPojo.Builder.class)
    static class CreatorPojo {
        final String id;
        final String extra;
        CreatorPojo(String id, String extra) { this.id = id; this.extra = extra; }

        @JsonPOJOBuilder(withPrefix = "with")
        static class Builder {
            String id;
            String extra;
            @JsonCreator
            public Builder(@JsonProperty("id") String id) { this.id = id; }
            public Builder withExtra(String e) { this.extra = e; return this; }
            public CreatorPojo build() { return new CreatorPojo(id, extra); }
        }
    }

    // --- 5) Property-based creator, unknown property -> TokenBuffer path ---
    @JsonDeserialize(builder = CreatorPojo2.Builder.class)
    static class CreatorPojo2 {
        final String id;
        CreatorPojo2(String id) { this.id = id; }

        @JsonPOJOBuilder(withPrefix = "with")
        static class Builder {
            String id;
            @JsonCreator
            public Builder(@JsonProperty("id") String id) { this.id = id; }
            public CreatorPojo2 build() { return new CreatorPojo2(id); }
        }
    }

    // --- 6) Property-based creator + explicit ignorable prop ---
    @JsonIgnoreProperties({"secret"})
    @JsonDeserialize(builder = CreatorIgnorablePojo.Builder.class)
    static class CreatorIgnorablePojo {
        final String id;
        CreatorIgnorablePojo(String id) { this.id = id; }

        @JsonPOJOBuilder(withPrefix = "with")
        static class Builder {
            String id;
            @JsonCreator
            public Builder(@JsonProperty("id") String id) { this.id = id; }
            public CreatorIgnorablePojo build() { return new CreatorIgnorablePojo(id); }
        }
    }

    // --- 7) Property-based creator + @JsonAnySetter ---
    @JsonDeserialize(builder = AnySetterPojo.Builder.class)
    static class AnySetterPojo {
        final String id;
        final Map<String, Object> extras;
        AnySetterPojo(String id, Map<String, Object> extras) { this.id = id; this.extras = extras; }

        @JsonPOJOBuilder(withPrefix = "with")
        static class Builder {
            String id;
            Map<String, Object> extras = new LinkedHashMap<String, Object>();
            @JsonCreator
            public Builder(@JsonProperty("id") String id) { this.id = id; }
            @JsonAnySetter
            public void setExtra(String key, Object value) { extras.put(key, value); }
            public AnySetterPojo build() { return new AnySetterPojo(id, extras); }
        }
    }

    // --- 8) Delegating creators (String/Int/Float/Boolean/Array) ---
    @JsonDeserialize(builder = StringDelegatePojo.Builder.class)
    static class StringDelegatePojo {
        final String value;
        StringDelegatePojo(String v) { value = v; }
        @JsonPOJOBuilder(withPrefix = "with")
        static class Builder {
            String value;
            @JsonCreator
            public Builder(String v) { this.value = v; }
            public StringDelegatePojo build() { return new StringDelegatePojo(value); }
        }
    }

    @JsonDeserialize(builder = IntDelegatePojo.Builder.class)
    static class IntDelegatePojo {
        final int value;
        IntDelegatePojo(int v) { value = v; }
        @JsonPOJOBuilder(withPrefix = "with")
        static class Builder {
            int value;
            @JsonCreator
            public Builder(int v) { this.value = v; }
            public IntDelegatePojo build() { return new IntDelegatePojo(value); }
        }
    }

    @JsonDeserialize(builder = FloatDelegatePojo.Builder.class)
    static class FloatDelegatePojo {
        final double value;
        FloatDelegatePojo(double v) { value = v; }
        @JsonPOJOBuilder(withPrefix = "with")
        static class Builder {
            double value;
            @JsonCreator
            public Builder(double v) { this.value = v; }
            public FloatDelegatePojo build() { return new FloatDelegatePojo(value); }
        }
    }

    @JsonDeserialize(builder = BooleanDelegatePojo.Builder.class)
    static class BooleanDelegatePojo {
        final boolean value;
        BooleanDelegatePojo(boolean v) { value = v; }
        @JsonPOJOBuilder(withPrefix = "with")
        static class Builder {
            boolean value;
            @JsonCreator
            public Builder(boolean v) { this.value = v; }
            public BooleanDelegatePojo build() { return new BooleanDelegatePojo(value); }
        }
    }

    @JsonDeserialize(builder = ArrayDelegatePojo.Builder.class)
    static class ArrayDelegatePojo {
        final List<String> items;
        ArrayDelegatePojo(List<String> items) { this.items = items; }
        @JsonPOJOBuilder(withPrefix = "with")
        static class Builder {
            List<String> items;
            @JsonCreator
            public Builder(List<String> items) { this.items = items; }
            public ArrayDelegatePojo build() { return new ArrayDelegatePojo(items); }
        }
    }

    // --- 9) @JacksonInject ---
    @JsonDeserialize(builder = InjectPojo.Builder.class)
    static class InjectPojo {
        final String token;
        InjectPojo(String t) { token = t; }
        @JsonPOJOBuilder(withPrefix = "with")
        static class Builder {
            @JacksonInject
            String token;
            public InjectPojo build() { return new InjectPojo(token); }
        }
    }

    /* ==========================================================
     * Tests
     * ========================================================== */

    // 0) Sanity: ตรวจ structure ของคลาสเป้าหมาย (ใช้ import ให้มีความหมาย)
    @Test
    public void testTargetClassHasBuildMethodField() throws Exception {
        Field f = BuilderBasedDeserializer.class.getDeclaredField("_buildMethod");
        assertNotNull(f);
        assertEquals(AnnotatedMethod.class, f.getType());
    }

    // 1) Vanilla success (START_OBJECT + _vanillaProcessing == true)
    @Test
    public void testVanillaDeserialize_success() throws Exception {
        SimplePojo p = mapper.readValue("{\"name\":\"John\",\"age\":30}", SimplePojo.class);
        assertEquals("John", p.getName());
        assertEquals(30, p.getAge());
    }

    // 2) Boundary: empty object -> loop ไม่ทำงานเลย, ได้ default values
    @Test
    public void testVanillaDeserialize_emptyObject_boundary() throws Exception {
        SimplePojo p = mapper.readValue("{}", SimplePojo.class);
        assertNull(p.getName());
        assertEquals(0, p.getAge());
    }

    // 3) Unknown property -> handleUnknownVanilla ไม่ ignore -> exception
    @Test(expected = JsonProcessingException.class)
    public void testVanillaDeserialize_unknownProperty_throws() throws Exception {
        mapper.readValue("{\"name\":\"John\",\"bogus\":1}", SimplePojo.class);
    }

    // 4) ignoreUnknown = true -> ไม่ throw
    @Test
    public void testIgnoreUnknownProperty_noException() throws Exception {
        IgnoreUnknownPojo p = mapper.readValue(
                "{\"name\":\"X\",\"bogus\":1}", IgnoreUnknownPojo.class);
        assertEquals("X", p.getName());
    }

    // 5) ไม่มี active view -> deserializeFromObject loop ปกติ ไม่กรอง view
    @Test
    public void testView_noActiveView_allPropertiesProcessed() throws Exception {
        ViewPojo p = mapper.readValue(
                "{\"name\":\"N\",\"secret\":\"S\"}", ViewPojo.class);
        assertEquals("N", p.getName());
        assertEquals("S", p.getSecret());
    }

    // 6) active view ตรงกับ @JsonView ของ secret -> ถูก set
    @Test
    public void testView_matchingView_propertyIncluded() throws Exception {
        ViewPojo p = mapper.readerFor(ViewPojo.class).withView(ViewA.class)
                .readValue("{\"name\":\"N\",\"secret\":\"S\"}");
        assertEquals("N", p.getName());
        assertEquals("S", p.getSecret());
    }

    // 7) active view ไม่ตรง -> prop.visibleInView() == false -> p.skipChildren()
    static class ViewB {}
    @Test
    public void testView_nonMatchingView_propertySkipped() throws Exception {
        ViewPojo p = mapper.readerFor(ViewPojo.class).withView(ViewB.class)
                .readValue("{\"name\":\"N\",\"secret\":\"S\"}");
        assertEquals("N", p.getName());
        assertNull(p.getSecret()); // ถูก skip เพราะ view ไม่ตรง
    }

    // 8) Property-based creator: buffer property ก่อน creatorProp, แล้ว build,
    //    ต่อด้วย _deserialize() สำหรับ field ที่เหลือ, unknown ถูก ignore
    @Test
    public void testPropertyBasedCreator_bufferedPropertyBeforeCreatorProp() throws Exception {
        CreatorPojo p = mapper.readValue(
                "{\"extra\":\"E1\",\"id\":\"ID1\",\"trailing\":\"ignored\"}",
                CreatorPojo.class);
        assertEquals("ID1", p.id);
        assertEquals("E1", p.extra);
    }

    // 9) Property-based creator: unknown property -> TokenBuffer -> handleUnknownProperties
    //    (ต้องปิด FAIL_ON_UNKNOWN_PROPERTIES เพื่อไม่ throw)
    @Test
    public void testPropertyBasedCreator_unknownCollected_whenFailOnUnknownDisabled() throws Exception {
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        CreatorPojo2 p = mapper.readValue(
                "{\"foo\":\"bar\",\"id\":\"ID2\"}", CreatorPojo2.class);
        assertEquals("ID2", p.id);
    }

    // 9b) เช่นเดียวกันแต่ไม่ปิด feature -> ต้อง throw (fail fast เป็นค่า default)
    @Test(expected = JsonProcessingException.class)
    public void testPropertyBasedCreator_unknownCollected_defaultThrows() throws Exception {
        mapper.readValue("{\"foo\":\"bar\",\"id\":\"ID2\"}", CreatorPojo2.class);
    }

    // 10) Property-based creator + ignorableProps: field ที่ถูกระบุ ignore ไม่ error
    @Test
    public void testPropertyBasedCreator_ignorablePropertyIgnored() throws Exception {
        CreatorIgnorablePojo p = mapper.readValue(
                "{\"id\":\"IDX\",\"secret\":\"nope\"}", CreatorIgnorablePojo.class);
        assertEquals("IDX", p.id);
    }

    // 11) Property-based creator + @JsonAnySetter: unknown ถูกจับผ่าน anySetter buffer
    @Test
    public void testPropertyBasedCreator_anySetterCapturesUnknown() throws Exception {
        AnySetterPojo p = mapper.readValue(
                "{\"foo\":\"bar\",\"id\":\"ID3\"}", AnySetterPojo.class);
        assertEquals("ID3", p.id);
        assertEquals("bar", p.extras.get("foo"));
    }

    // 12) VALUE_STRING -> deserializeFromString (delegate creator) success
    @Test
    public void testDelegateFromString_success() throws Exception {
        StringDelegatePojo p = mapper.readValue("\"hello\"", StringDelegatePojo.class);
        assertEquals("hello", p.value);
    }

    // 13) VALUE_NUMBER_INT -> deserializeFromNumber success
    @Test
    public void testDelegateFromInt_success() throws Exception {
        IntDelegatePojo p = mapper.readValue("42", IntDelegatePojo.class);
        assertEquals(42, p.value);
    }

    // 14) VALUE_NUMBER_FLOAT -> deserializeFromDouble success
    @Test
    public void testDelegateFromFloat_success() throws Exception {
        FloatDelegatePojo p = mapper.readValue("3.14", FloatDelegatePojo.class);
        assertEquals(3.14, p.value, 0.0001);
    }

    // 15) VALUE_TRUE / VALUE_FALSE -> deserializeFromBoolean success (สองสาขา)
    @Test
    public void testDelegateFromBooleanTrue_success() throws Exception {
        BooleanDelegatePojo p = mapper.readValue("true", BooleanDelegatePojo.class);
        assertTrue(p.value);
    }

    @Test
    public void testDelegateFromBooleanFalse_success() throws Exception {
        BooleanDelegatePojo p = mapper.readValue("false", BooleanDelegatePojo.class);
        assertFalse(p.value);
    }

    // 16) START_ARRAY -> deserializeFromArray success (delegate creator)
    @Test
    public void testDelegateFromArray_success() throws Exception {
        ArrayDelegatePojo p = mapper.readValue("[\"a\",\"b\"]", ArrayDelegatePojo.class);
        assertEquals(2, p.items.size());
        assertEquals("a", p.items.get(0));
    }

    // 16b) Boundary: empty array
    @Test
    public void testDelegateFromArray_emptyArray_boundary() throws Exception {
        ArrayDelegatePojo p = mapper.readValue("[]", ArrayDelegatePojo.class);
        assertEquals(0, p.items.size());
    }

    // 17) Malformed/unsupported token types บน SimplePojo (ไม่มี delegate creator)
    @Test(expected = JsonProcessingException.class)
    public void testUnsupportedStringToken_throws() throws Exception {
        mapper.readValue("\"abcd\"", SimplePojo.class);
    }

    @Test(expected = JsonProcessingException.class)
    public void testUnsupportedNumberIntToken_throws() throws Exception {
        mapper.readValue("123", SimplePojo.class);
    }

    @Test(expected = JsonProcessingException.class)
    public void testUnsupportedNumberFloatToken_throws() throws Exception {
        mapper.readValue("1.23", SimplePojo.class);
    }

    @Test(expected = JsonProcessingException.class)
    public void testUnsupportedBooleanToken_throws() throws Exception {
        mapper.readValue("true", SimplePojo.class);
    }

    @Test(expected = JsonProcessingException.class)
    public void testUnsupportedArrayToken_throws() throws Exception {
        mapper.readValue("[1,2,3]", SimplePojo.class);
    }

    // 18) @JacksonInject -> _injectables != null branch ใน deserializeFromObject
    @Test
    public void testInjectableValues_injectedBeforeParsing() throws Exception {
        mapper.setInjectableValues(
                new InjectableValues.Std().addValue(String.class, "INJECTED"));
        InjectPojo p = mapper.readValue("{}", InjectPojo.class);
        assertEquals("INJECTED", p.token);
    }

    // 19) จัดตำแหน่ง parser ให้เริ่มที่ FIELD_NAME -> เข้า case FIELD_NAME -> deserializeFromObject
    //     (ทดสอบผ่าน low-level JsonParser; อาศัยพฤติกรรมมาตรฐานของ ObjectMapper._initForReading
    //      ที่ใช้ current token ถ้ามีอยู่แล้ว ไม่เรียก nextToken() ซ้ำ)
    @Test
    public void testDeserialize_startingAtFieldNameToken() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"name\":\"Bob\",\"age\":5}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME "name"
        SimplePojo result = mapper.readValue(p, SimplePojo.class);
        assertEquals("Bob", result.getName());
        assertEquals(5, result.getAge());
        p.close();
    }

    // 20) จัดตำแหน่ง parser ให้เริ่มที่ END_OBJECT (object ว่าง) -> case END_OBJECT -> deserializeFromObject
    @Test
    public void testDeserialize_startingAtEndObjectToken() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // END_OBJECT
        SimplePojo result = mapper.readValue(p, SimplePojo.class);
        assertNull(result.getName());
        assertEquals(0, result.getAge());
        p.close();
    }

    // 21) VALUE_EMBEDDED_OBJECT -> return p.getEmbeddedObject() โดยตรง (ไม่ผ่าน finishBuild)
    //     หมายเหตุ: อาศัย TokenBuffer#writeEmbeddedObject/asParser ซึ่งเป็น public API มาตรฐาน
    //     ของ jackson-databind แต่ไม่ได้ปรากฏในซอร์สที่ให้มา (ระบุไว้เพื่อความชัดเจน)
    @Test
    public void testEmbeddedObjectToken_bypassesFinishBuild() throws Exception {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        byte[] raw = new byte[] {1, 2, 3};
        buf.writeEmbeddedObject(raw);
        JsonParser p = buf.asParser();
        p.nextToken(); // VALUE_EMBEDDED_OBJECT
        Object result = mapper.readValue(p, SimplePojo.class);
        assertSame(raw, result); // ได้ค่า embedded object ตรง ๆ ไม่ใช่ SimplePojo
        p.close();
    }

    // 22) public deserialize(JsonParser, DeserializationContext, Object) ผ่าน readerForUpdating
    //     เมื่อ valueToUpdate ไม่ใช่ Builder-shaped object -> คาดว่าจะเกิด exception
    //     (คอมเมนต์: พฤติกรรม exact exception type อ้างอิงจากการที่ setter method
    //      ถูกประกาศบน Builder class แต่ invoke ด้วย object ประเภทอื่น ผ่าน catch(Exception e)
    //      -> wrapAndThrow ในซอร์สที่ให้มา)
    @Test(expected = JsonMappingException.class)
    public void testDeserializeWithValueToUpdate_typeMismatch_throws() throws Exception {
        SimplePojo existing = new SimplePojo("orig", 1);
        mapper.readerForUpdating(existing).readValue("{\"name\":\"new\"}");
    }
}
