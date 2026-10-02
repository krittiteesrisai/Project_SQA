package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class StringArrayDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ---------- Helper classes ----------

    /** custom element deserializer ที่ไม่ implement ContextualDeserializer */
    public static class CustomStringDeserializer extends StdDeserializer<String> {
        private static final long serialVersionUID = 1L;
        public CustomStringDeserializer() { super(String.class); }

        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return "CUSTOM:" + p.getText();
        }

        // NOTE: signature ไม่มี ctxt เพราะ source ที่ให้มาเรียก deser.getNullValue() แบบ no-arg
        @Override
        public String getNullValue() {
            return "NULL_CUSTOM";
        }
    }

    /** custom element deserializer ที่ implement ContextualDeserializer และคืนอินสแตนซ์ใหม่ */
    public static class ContextualStringDeserializer extends StdDeserializer<String>
            implements ContextualDeserializer {
        private static final long serialVersionUID = 1L;
        private final String prefix;

        public ContextualStringDeserializer() { this("DEFAULT:"); }
        public ContextualStringDeserializer(String prefix) {
            super(String.class);
            this.prefix = prefix;
        }

        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return prefix + p.getText();
        }

        @Override
        public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) {
            return new ContextualStringDeserializer("CTX:");
        }
    }

    public static class Wrapper {
        @JsonDeserialize(contentUsing = CustomStringDeserializer.class)
        public String[] values;
    }

    public static class ContextualWrapper {
        @JsonDeserialize(contentUsing = ContextualStringDeserializer.class)
        public String[] values;
    }

    // ================= deserialize(): default path (elementDeserializer == null) =================

    @Test
    public void testDeserializeNormalArray() throws IOException {
        String[] result = mapper.readValue("[\"a\",\"b\",\"c\"]", String[].class);
        assertArrayEquals(new String[]{"a", "b", "c"}, result);
    }

    @Test
    public void testDeserializeEmptyArray() throws IOException {
        String[] result = mapper.readValue("[]", String[].class);
        assertEquals(0, result.length);
    }

    @Test
    public void testDeserializeArrayWithNull() throws IOException {
        // covers t == JsonToken.VALUE_NULL branch inside loop
        String[] result = mapper.readValue("[\"a\", null, \"b\"]", String[].class);
        assertArrayEquals(new String[]{"a", null, "b"}, result);
    }

    @Test
    public void testDeserializeArrayWithNonStringTokens() throws IOException {
        // covers else branch -> _parseString(jp, ctxt)
        String[] result = mapper.readValue("[1, true, \"x\"]", String[].class);
        assertArrayEquals(new String[]{"1", "true", "x"}, result);
    }

    @Test
    public void testDeserializeLargeArrayTriggersChunkExpansion() throws IOException {
        // covers ix >= chunk.length -> buffer.appendCompletedChunk(chunk) branch (loop)
        StringBuilder sb = new StringBuilder("[");
        int n = 60;
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append(",");
            sb.append("\"v").append(i).append("\"");
        }
        sb.append("]");
        String[] result = mapper.readValue(sb.toString(), String[].class);
        assertEquals(n, result.length);
        for (int i = 0; i < n; i++) {
            assertEquals("v" + i, result[i]);
        }
    }

    // ================= handleNonArray() branches =================

    @Test
    public void testSingleValueAsArrayEnabled() throws IOException {
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        String[] result = mapper.readValue("\"hello\"", String[].class);
        assertArrayEquals(new String[]{"hello"}, result);
    }

    @Test
    public void testSingleValueAsArrayEnabledWithNumber() throws IOException {
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        String[] result = mapper.readValue("123", String[].class);
        assertArrayEquals(new String[]{"123"}, result);
    }

    @Test
    public void testSingleValueAsArrayEnabledWithTopLevelNull() throws IOException {
        // หมายเหตุ: root-level null มักถูก intercept ก่อนเรียก deserialize()/handleNonArray()
        // จริง ๆ (ผ่าน getNullValue()) — ไม่ใช่ behavior ที่ระบุตรงในซอร์สนี้ จึงกำกับไว้เป็น comment
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        String[] result = mapper.readValue("null", String[].class);
        assertNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testNonArraySingleValueDisabledThrows() throws IOException {
        mapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.readValue("\"hello\"", String[].class);
    }

    @Test
    public void testEmptyStringAsNullEnabled() throws IOException {
        mapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        String[] result = mapper.readValue("\"\"", String[].class);
        assertNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testNonEmptyStringWithEmptyStringAsNullEnabledStillThrows() throws IOException {
        // str.length()==0 เป็น false แม้ feature เปิด -> ยังตกไป throw mappingException
        mapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        mapper.readValue("\"hello\"", String[].class);
    }

    @Test(expected = JsonMappingException.class)
    public void testEmptyStringAsNullDisabledThrows() throws IOException {
        mapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.disable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        mapper.readValue("\"\"", String[].class);
    }

    @Test(expected = JsonMappingException.class)
    public void testNonStringNonArrayValueDisabledThrows() throws IOException {
        mapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.readValue("123", String[].class);
    }

    @Test
    public void testHandleNonArrayWithNullTokenAndSingleValueEnabled() throws IOException {
        // ทดสอบตรง branch: (jp.getCurrentToken() == VALUE_NULL) ? null : _parseString(...)
        // กรณี currentToken == VALUE_NULL -> คืน new String[]{null}
        StringArrayDeserializer deser = new StringArrayDeserializer();
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        when(jp.isExpectedStartArrayToken()).thenReturn(false);
        when(jp.getCurrentToken()).thenReturn(JsonToken.VALUE_NULL);
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)).thenReturn(true);

        String[] result = deser.deserialize(jp, ctxt);
        assertArrayEquals(new String[]{null}, result);
    }

    // ================= _deserializeCustom() (elementDeserializer != null) =================

    @Test
    public void testCustomElementDeserializerUsed() throws IOException {
        // covers: _elementDeserializer != null -> _deserializeCustom, ทั้ง null และ non-null branch ของ loop
        String json = "{\"values\":[\"a\", null, \"b\"]}";
        Wrapper w = mapper.readValue(json, Wrapper.class);
        assertArrayEquals(new String[]{"CUSTOM:a", "NULL_CUSTOM", "CUSTOM:b"}, w.values);
    }

    @Test
    public void testCustomElementDeserializerLargeArrayChunkExpansion() throws IOException {
        // covers chunk expansion ภายใน _deserializeCustom
        StringBuilder sb = new StringBuilder("{\"values\":[");
        int n = 60;
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append(",");
            sb.append("\"v").append(i).append("\"");
        }
        sb.append("]}");
        Wrapper w = mapper.readValue(sb.toString(), Wrapper.class);
        assertEquals(n, w.values.length);
        assertEquals("CUSTOM:v0", w.values[0]);
        assertEquals("CUSTOM:v" + (n - 1), w.values[n - 1]);
    }

    // ================= createContextual() branches =================

    @Test
    public void testContextualReturnsSameInstanceForNonContextualCustomDeserializer() throws IOException {
        // deser != null (จาก contentUsing) -> handleSecondaryContextualization ไม่เปลี่ยน instance
        // -> isDefaultDeserializer=false -> _elementDeserializer == deser -> return this
        Wrapper w = mapper.readValue("{\"values\":[\"z\"]}", Wrapper.class);
        assertArrayEquals(new String[]{"CUSTOM:z"}, w.values);
    }

    @Test
    public void testContextualReturnsNewInstanceForContextualCustomDeserializer() throws IOException {
        // deser != null (จาก contentUsing) -> handleSecondaryContextualization เรียก
        // createContextual ของ element deserializer แล้วได้ instance ใหม่
        // -> _elementDeserializer != deser -> return new StringArrayDeserializer(deser)
        ContextualWrapper w = mapper.readValue("{\"values\":[\"z\"]}", ContextualWrapper.class);
        assertArrayEquals(new String[]{"CTX:z"}, w.values);
    }

    @Test
    public void testContextualWithGlobalCustomStringDeserializerNotDefault() throws IOException {
        // deser == null เดิม -> ctxt.findContextualValueDeserializer คืน custom (ไม่ใช่ default)
        // -> isDefaultDeserializer=false -> _elementDeserializer(null) != deser -> return new instance
        SimpleModule module = new SimpleModule();
        module.addDeserializer(String.class, new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "G:" + p.getText();
            }
        });
        mapper.registerModule(module);

        String[] result = mapper.readValue("[\"a\",\"b\"]", String[].class);
        assertArrayEquals(new String[]{"G:a", "G:b"}, result);
    }

    // ================= deserializeWithType() =================

    @Test
    public void testDeserializeWithTypeDelegates() throws IOException {
        StringArrayDeserializer deser = new StringArrayDeserializer();
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        TypeDeserializer typeDeserializer = mock(TypeDeserializer.class);
        String[] expected = new String[]{"x"};

        when(typeDeserializer.deserializeTypedFromArray(jp, ctxt)).thenReturn(expected);

        Object result = deser.deserializeWithType(jp, ctxt, typeDeserializer);

        assertSame(expected, result);
        verify(typeDeserializer, times(1)).deserializeTypedFromArray(jp, ctxt);
    }

    // ================= Sanity =================

    @Test
    public void testStaticInstanceNotNull() {
        assertNotNull(StringArrayDeserializer.instance);
    }
}
