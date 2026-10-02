# UntypedObjectDeserializerTest

หมายเหตุสำคัญก่อนเริ่ม:
- Test class ถูกวางไว้ใน package เดียวกับคลาสเป้าหมาย (`com.fasterxml.jackson.databind.deser.std`) เพื่อให้เข้าถึง protected methods/fields (`mapObject`, `mapArray`, `mapArrayToArray`, `_mapDeserializer`, ฯลฯ) ได้ตรง ๆ โดยไม่ต้อง reflection
- ใช้ `JsonParser` จริง (จาก `JsonFactory`) แทนการ mock parser เพื่อให้ token-stream ถูกต้องตาม contract ของแต่ละเมธอด และ mock เฉพาะ `DeserializationContext` (เป็น abstract class ที่ mock ได้)
- เมธอด `_coerceIntegral(...)` เป็นเมธอดที่ inherit มาจาก `StdDeserializer` และไม่มีซอร์สโค้ดให้ในไฟล์นี้ — ทดสอบเพียงว่า branch ถูกเรียกและไม่ throw exception โดยไม่ assert ค่าที่แน่นอน (ตามข้อกำหนดห้ามเดา behavior)
- การ mock `DeserializationContext` สมมติว่าเมธอดที่เรียก (`isEnabled`, `hasSomeOfFeatures`, `mappingException`, `leaseObjectBuffer`, `constructType`, `getTypeFactory`, `findNonContextualValueDeserializer`, `handleSecondaryContextualization`) ไม่ใช่ `final` (ตาม pattern การใช้งานทั่วไปของ jackson-databind) — คอมเมนต์กำกับความเสี่ยงนี้ไว้

```java
package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import com.fasterxml.jackson.databind.util.TokenBuffer;

@SuppressWarnings({"unchecked", "deprecation", "rawtypes"})
public class UntypedObjectDeserializerTest {

    // ---------- helpers ----------

    private static final Answer<Object> ECHO_FIRST_ARG = new Answer<Object>() {
        @Override
        public Object answer(InvocationOnMock invocation) {
            return invocation.getArguments()[0];
        }
    };

    private JsonParser parserFor(String json) throws IOException {
        return new JsonFactory().createParser(json);
    }

    /** สร้าง mock DeserializationContext ที่ stub ค่าพื้นฐานให้ปลอดภัย (ไม่ NPE) */
    private DeserializationContext newContext() {
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.leaseObjectBuffer()).thenReturn(new ObjectBuffer());
        when(ctxt.getTypeFactory()).thenReturn(TypeFactory.defaultInstance());
        when(ctxt.constructType(any(Class.class))).thenAnswer(new Answer<JavaType>() {
            @Override
            public JavaType answer(InvocationOnMock invocation) {
                Class<?> c = (Class<?>) invocation.getArguments()[0];
                return TypeFactory.defaultInstance().constructType(c);
            }
        });
        when(ctxt.mappingException(any(Class.class)))
                .thenReturn(new JsonMappingException("mock-exception"));
        when(ctxt.mappingException(any(Class.class), any(JsonToken.class)))
                .thenReturn(new JsonMappingException("mock-exception-token"));
        return ctxt;
    }

    private void enableFeature(DeserializationContext ctxt, DeserializationFeature f) {
        when(ctxt.isEnabled(f)).thenReturn(true);
    }

    private JsonDeserializer<Object> mockDeser(Object toReturn) throws IOException {
        JsonDeserializer<Object> d = mock(JsonDeserializer.class);
        when(d.deserialize(any(JsonParser.class), any(DeserializationContext.class))).thenReturn(toReturn);
        return d;
    }

    // =========================================================
    // Group 1: basic / createContextual / _clearIfStdImpl
    // =========================================================

    @Test
    public void testIsCachable() {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        assertTrue(d.isCachable());
    }

    @Test
    public void testDeprecatedInstanceField() {
        assertNotNull(UntypedObjectDeserializer.instance);
    }

    @Test
    public void testCreateContextual_AllNullAndExactClass_ReturnsVanillaStd() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        DeserializationContext ctxt = newContext();
        JsonDeserializer<?> result = d.createContextual(ctxt, null);
        assertSame(UntypedObjectDeserializer.Vanilla.std, result);
    }

    @Test
    public void testCreateContextual_WithCustomStringDeserializer_ReturnsThis() throws Exception {
        UntypedObjectDeserializer base = new UntypedObjectDeserializer(null, null);
        JsonDeserializer<Object> strDeser = mockDeser("x");
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(base, null, null, strDeser, null);
        DeserializationContext ctxt = newContext();
        JsonDeserializer<?> result = d.createContextual(ctxt, null);
        assertSame(d, result);
    }

    /** subclass ทำให้ getClass() != UntypedObjectDeserializer.class แม้ทุก field เป็น null */
    static class SubDeserializer extends UntypedObjectDeserializer {
        public SubDeserializer() { super(null, null); }
    }

    @Test
    public void testCreateContextual_SubclassAllNull_ReturnsThisNotVanilla() throws Exception {
        SubDeserializer d = new SubDeserializer();
        DeserializationContext ctxt = newContext();
        JsonDeserializer<?> result = d.createContextual(ctxt, null);
        assertSame(d, result);
        assertNotSame(UntypedObjectDeserializer.Vanilla.std, result);
    }

    @Test
    public void testClearIfStdImpl_NullReturnsNull() {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        assertNull(d._clearIfStdImpl(null));
    }

    @Test
    public void testClearIfStdImpl_NonStdReturnsSame() throws IOException {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonDeserializer<Object> custom = mockDeser("v");
        assertSame(custom, d._clearIfStdImpl(custom));
    }

    @Test
    public void testClearIfStdImpl_StdImplReturnsNull() {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        // Vanilla is annotated @JacksonStdImpl
        JsonDeserializer<Object> std = (JsonDeserializer<Object>) (JsonDeserializer<?>) UntypedObjectDeserializer.Vanilla.std;
        assertNull(d._clearIfStdImpl(std));
    }

    // =========================================================
    // Group 2: resolve()
    // =========================================================

    @Test
    public void testResolve_DefaultTypes_StdImplCustomIsCleared() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        DeserializationContext ctxt = newContext();
        when(ctxt.findNonContextualValueDeserializer(any(JavaType.class)))
                .thenReturn((JsonDeserializer) UntypedObjectDeserializer.Vanilla.std);
        when(ctxt.handleSecondaryContextualization(any(JsonDeserializer.class), any(BeanProperty.class), any(JavaType.class)))
                .thenAnswer(ECHO_FIRST_ARG);

        d.resolve(ctxt);

        assertNull(d._mapDeserializer);
        assertNull(d._listDeserializer);
        assertNull(d._stringDeserializer);
        assertNull(d._numberDeserializer);
    }

    @Test
    public void testResolve_DefaultTypes_NonStdCustomIsKept() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        DeserializationContext ctxt = newContext();
        JsonDeserializer<Object> customStr = mockDeser("s");
        when(ctxt.findNonContextualValueDeserializer(any(JavaType.class))).thenReturn((JsonDeserializer) customStr);
        when(ctxt.handleSecondaryContextualization(any(JsonDeserializer.class), any(BeanProperty.class), any(JavaType.class)))
                .thenAnswer(ECHO_FIRST_ARG);

        d.resolve(ctxt);

        assertSame(customStr, d._stringDeserializer);
        assertSame(customStr, d._numberDeserializer);
        assertSame(customStr, d._mapDeserializer);
        assertSame(customStr, d._listDeserializer);
    }

    @Test
    public void testResolve_NonDefaultListMapTypes_StdImplNotCleared() throws Exception {
        JavaType listType = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, Object.class);
        JavaType mapType = TypeFactory.defaultInstance().constructMapType(HashMap.class, String.class, Object.class);
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(listType, mapType);
        DeserializationContext ctxt = newContext();
        // ตั้งใจให้ return ค่า std-impl กลับมา เพื่อพิสูจน์ว่า non-default type ไม่ผ่าน _clearIfStdImpl
        when(ctxt.findNonContextualValueDeserializer(any(JavaType.class)))
                .thenReturn((JsonDeserializer) UntypedObjectDeserializer.Vanilla.std);
        when(ctxt.handleSecondaryContextualization(any(JsonDeserializer.class), any(BeanProperty.class), any(JavaType.class)))
                .thenAnswer(ECHO_FIRST_ARG);

        d.resolve(ctxt);

        assertSame(UntypedObjectDeserializer.Vanilla.std, d._listDeserializer);
        assertSame(UntypedObjectDeserializer.Vanilla.std, d._mapDeserializer);
        // string/number ยังใช้ default logic -> ถูก clear
        assertNull(d._stringDeserializer);
        assertNull(d._numberDeserializer);
    }

    // =========================================================
    // Group 3: deserialize() ของ outer class
    // =========================================================

    @Test
    public void testDeserialize_Null() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("null");
        p.nextToken();
        assertNull(d.deserialize(p, newContext()));
    }

    @Test
    public void testDeserialize_TrueFalse() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p1 = parserFor("true");
        p1.nextToken();
        assertEquals(Boolean.TRUE, d.deserialize(p1, newContext()));

        JsonParser p2 = parserFor("false");
        p2.nextToken();
        assertEquals(Boolean.FALSE, d.deserialize(p2, newContext()));
    }

    @Test
    public void testDeserialize_String_NoCustom() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("\"hello\"");
        p.nextToken();
        assertEquals("hello", d.deserialize(p, newContext()));
    }

    @Test
    public void testDeserialize_String_WithCustom() throws Exception {
        UntypedObjectDeserializer base = new UntypedObjectDeserializer(null, null);
        JsonDeserializer<Object> strDeser = mockDeser("CUSTOM_STRING");
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(base, null, null, strDeser, null);
        JsonParser p = parserFor("\"hello\"");
        p.nextToken();
        assertEquals("CUSTOM_STRING", d.deserialize(p, newContext()));
        verify(strDeser, times(1)).deserialize(any(JsonParser.class), any(DeserializationContext.class));
    }

    @Test
    public void testDeserialize_NumberInt_NoCustom_NoCoercion() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("42");
        p.nextToken();
        DeserializationContext ctxt = newContext();
        when(ctxt.hasSomeOfFeatures(anyInt())).thenReturn(false);
        Object result = d.deserialize(p, ctxt);
        assertEquals(42, ((Number) result).intValue());
    }

    @Test
    public void testDeserialize_NumberInt_WithCoercionFeature() throws Exception {
        // เฉพาะทดสอบว่า branch นี้ทำงานได้ และให้ผลลัพธ์เป็น Number โดยไม่ยืนยันชนิด/ค่าที่แน่นอน
        // เนื่องจาก _coerceIntegral() ไม่มีซอร์สโค้ดให้ในไฟล์นี้
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("42");
        p.nextToken();
        DeserializationContext ctxt = newContext();
        when(ctxt.hasSomeOfFeatures(anyInt())).thenReturn(true);
        Object result = d.deserialize(p, ctxt);
        assertTrue(result instanceof Number);
    }

    @Test
    public void testDeserialize_NumberInt_WithCustom() throws Exception {
        UntypedObjectDeserializer base = new UntypedObjectDeserializer(null, null);
        JsonDeserializer<Object> numDeser = mockDeser(999);
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(base, null, null, null, numDeser);
        JsonParser p = parserFor("42");
        p.nextToken();
        assertEquals(999, d.deserialize(p, newContext()));
    }

    @Test
    public void testDeserialize_NumberFloat_NoCustom_ReturnsDouble() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("3.5");
        p.nextToken();
        DeserializationContext ctxt = newContext();
        Object result = d.deserialize(p, ctxt);
        assertEquals(3.5d, (Double) result, 0.0001);
    }

    @Test
    public void testDeserialize_NumberFloat_BigDecimalFeature() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("3.5");
        p.nextToken();
        DeserializationContext ctxt = newContext();
        enableFeature(ctxt, DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        Object result = d.deserialize(p, ctxt);
        assertEquals(new BigDecimal("3.5"), result);
    }

    @Test
    public void testDeserialize_NumberFloat_WithCustom() throws Exception {
        UntypedObjectDeserializer base = new UntypedObjectDeserializer(null, null);
        JsonDeserializer<Object> numDeser = mockDeser(1.23);
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(base, null, null, null, numDeser);
        JsonParser p = parserFor("3.5");
        p.nextToken();
        assertEquals(1.23, d.deserialize(p, newContext()));
    }

    @Test
    public void testDeserialize_StartObject_NoCustom_DelegatesToMapObject() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("{}");
        p.nextToken();
        Object result = d.deserialize(p, newContext());
        assertTrue(result instanceof Map);
        assertTrue(((Map<?, ?>) result).isEmpty());
    }

    @Test
    public void testDeserialize_StartObject_WithCustomMapDeserializer() throws Exception {
        UntypedObjectDeserializer base = new UntypedObjectDeserializer(null, null);
        Map<String, Object> marker = new HashMap<String, Object>();
        marker.put("k", "v");
        JsonDeserializer<Object> mapDeser = mockDeser(marker);
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(base, mapDeser, null, null, null);
        JsonParser p = parserFor("{\"a\":1}");
        p.nextToken();
        assertSame(marker, d.deserialize(p, newContext()));
    }

    @Test
    public void testDeserialize_StartArray_NoCustom_UseJavaArrayFalse_DelegatesToMapArray() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("[1,2]");
        p.nextToken();
        DeserializationContext ctxt = newContext();
        Object result = d.deserialize(p, ctxt);
        assertTrue(result instanceof List);
        assertEquals(2, ((List<?>) result).size());
    }

    @Test
    public void testDeserialize_StartArray_UseJavaArrayTrue_DelegatesToMapArrayToArray_EvenIfListDeserializerSet() throws Exception {
        UntypedObjectDeserializer base = new UntypedObjectDeserializer(null, null);
        JsonDeserializer<Object> listDeser = mockDeser(Collections.singletonList("SHOULD_NOT_BE_USED"));
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(base, null, listDeser, null, null);
        JsonParser p = parserFor("[1,2]");
        p.nextToken();
        DeserializationContext ctxt = newContext();
        enableFeature(ctxt, DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY);
        Object result = d.deserialize(p, ctxt);
        assertTrue("feature check ต้องมาก่อนการใช้ _listDeserializer", result instanceof Object[]);
        assertEquals(2, ((Object[]) result).length);
        verify(listDeser, never()).deserialize(any(JsonParser.class), any(DeserializationContext.class));
    }

    @Test
    public void testDeserialize_StartArray_NoCustom_WithListDeserializerUsed() throws Exception {
        UntypedObjectDeserializer base = new UntypedObjectDeserializer(null, null);
        List<Object> marker = Collections.singletonList("marker");
        JsonDeserializer<Object> listDeser = mockDeser(marker);
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(base, null, listDeser, null, null);
        JsonParser p = parserFor("[1,2]");
        p.nextToken();
        assertSame(marker, d.deserialize(p, newContext()));
    }

    @Test
    public void testDeserialize_EmbeddedObject() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        ObjectMapper mapper = new ObjectMapper();
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeEmbeddedObject("embedded-value");
        JsonParser p = buf.asParser();
        p.nextToken();
        Object result = d.deserialize(p, newContext());
        assertEquals("embedded-value", result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_DefaultCase_Throws() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("[1,2]");
        p.nextToken(); // START_ARRAY
        p.nextToken(); // 1
        p.nextToken(); // 2
        p.nextToken(); // END_ARRAY (token ที่ deserialize() ไม่รองรับ -> default case)
        d.deserialize(p, newContext());
    }

    // =========================================================
    // Group 4: deserializeWithType() ของ outer class
    // =========================================================

    @Test
    public void testDeserializeWithType_StartObjectArrayFieldName_DelegatesToTypeDeserializer() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        TypeDeserializer td = mock(TypeDeserializer.class);
        when(td.deserializeTypedFromAny(any(JsonParser.class), any(DeserializationContext.class))).thenReturn("TYPED");

        JsonParser p1 = parserFor("{}");
        p1.nextToken();
        assertEquals("TYPED", d.deserializeWithType(p1, newContext(), td));

        JsonParser p2 = parserFor("[]");
        p2.nextToken();
        assertEquals("TYPED", d.deserializeWithType(p2, newContext(), td));
    }

    @Test
    public void testDeserializeWithType_EmbeddedObject() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        ObjectMapper mapper = new ObjectMapper();
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeEmbeddedObject(123);
        JsonParser p = buf.asParser();
        p.nextToken();
        TypeDeserializer td = mock(TypeDeserializer.class);
        assertEquals(123, d.deserializeWithType(p, newContext(), td));
    }

    @Test
    public void testDeserializeWithType_String_NoCustomAndCustom() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("\"abc\"");
        p.nextToken();
        assertEquals("abc", d.deserializeWithType(p, newContext(), mock(TypeDeserializer.class)));

        UntypedObjectDeserializer base = new UntypedObjectDeserializer(null, null);
        JsonDeserializer<Object> strDeser = mockDeser("CUSTOM");
        UntypedObjectDeserializer d2 = new UntypedObjectDeserializer(base, null, null, strDeser, null);
        JsonParser p2 = parserFor("\"abc\"");
        p2.nextToken();
        assertEquals("CUSTOM", d2.deserializeWithType(p2, newContext(), mock(TypeDeserializer.class)));
    }

    @Test
    public void testDeserializeWithType_NumberInt_Variants() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("7");
        p.nextToken();
        DeserializationContext ctxt = newContext();
        when(ctxt.hasSomeOfFeatures(anyInt())).thenReturn(false);
        Object r = d.deserializeWithType(p, ctxt, mock(TypeDeserializer.class));
        assertEquals(7, ((Number) r).intValue());
    }

    @Test
    public void testDeserializeWithType_NumberFloat_Variants() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("1.5");
        p.nextToken();
        DeserializationContext ctxt = newContext();
        Object r = d.deserializeWithType(p, ctxt, mock(TypeDeserializer.class));
        assertEquals(1.5d, (Double) r, 0.0001);

        JsonParser p2 = parserFor("1.5");
        p2.nextToken();
        DeserializationContext ctxt2 = newContext();
        enableFeature(ctxt2, DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        Object r2 = d.deserializeWithType(p2, ctxt2, mock(TypeDeserializer.class));
        assertEquals(new BigDecimal("1.5"), r2);
    }

    @Test
    public void testDeserializeWithType_TrueFalseNull() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        TypeDeserializer td = mock(TypeDeserializer.class);

        JsonParser p1 = parserFor("true");
        p1.nextToken();
        assertEquals(Boolean.TRUE, d.deserializeWithType(p1, newContext(), td));

        JsonParser p2 = parserFor("false");
        p2.nextToken();
        assertEquals(Boolean.FALSE, d.deserializeWithType(p2, newContext(), td));

        JsonParser p3 = parserFor("null");
        p3.nextToken();
        assertNull(d.deserializeWithType(p3, newContext(), td));
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeWithType_DefaultThrows() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("[1]");
        p.nextToken(); // START_ARRAY
        p.nextToken(); // 1
        p.nextToken(); // END_ARRAY -> not handled
        d.deserializeWithType(p, newContext(), mock(TypeDeserializer.class));
    }

    // =========================================================
    // Group 5: mapObject / mapArray / mapArrayToArray (outer, protected, same package)
    // =========================================================

    @Test
    public void testMapObject_EmptyObject_FromEndObjectDirectly() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("{}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // END_OBJECT
        Object result = d.mapObject(p, newContext());
        assertTrue(result instanceof Map);
        assertTrue(((Map<?, ?>) result).isEmpty());
    }

    @Test
    public void testMapObject_FieldNameEntry_SingleEntry() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("{\"a\":1}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME "a"
        Map<String, Object> result = (Map<String, Object>) d.mapObject(p, newContext());
        assertEquals(1, result.size());
        assertEquals(1, ((Number) result.get("a")).intValue());
    }

    @Test
    public void testMapObject_StartObject_TwoEntries() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("{\"a\":1,\"b\":2}");
        p.nextToken(); // START_OBJECT
        Map<String, Object> result = (Map<String, Object>) d.mapObject(p, newContext());
        assertEquals(2, result.size());
        assertEquals(1, ((Number) result.get("a")).intValue());
        assertEquals(2, ((Number) result.get("b")).intValue());
    }

    @Test
    public void testMapObject_ThreeOrMoreEntries_LoopBranch() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("{\"a\":1,\"b\":2,\"c\":3,\"d\":4}");
        p.nextToken();
        Map<String, Object> result = (Map<String, Object>) d.mapObject(p, newContext());
        assertEquals(4, result.size());
        assertEquals(4, ((Number) result.get("d")).intValue());
    }

    @Test(expected = JsonMappingException.class)
    public void testMapObject_InvalidStartTokenThrows() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("\"just-a-string\"");
        p.nextToken(); // VALUE_STRING - ไม่ใช่ START_OBJECT/FIELD_NAME/END_OBJECT
        d.mapObject(p, newContext());
    }

    @Test
    public void testMapArray_OneElement() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("[1]");
        p.nextToken(); // START_ARRAY
        List<Object> result = (List<Object>) d.mapArray(p, newContext());
        assertEquals(1, result.size());
    }

    @Test
    public void testMapArray_Empty() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("[]");
        p.nextToken();
        List<Object> result = (List<Object>) d.mapArray(p, newContext());
        assertTrue(result.isEmpty());
    }

    @Test
    public void testMapArray_TwoElements() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("[1,2]");
        p.nextToken();
        List<Object> result = (List<Object>) d.mapArray(p, newContext());
        assertEquals(2, result.size());
    }

    @Test
    public void testMapArray_ManyElements_BufferOverflowLoop() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        StringBuilder sb = new StringBuilder("[");
        int n = 30;
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append(",");
            sb.append(i);
        }
        sb.append("]");
        JsonParser p = parserFor(sb.toString());
        p.nextToken();
        List<Object> result = (List<Object>) d.mapArray(p, newContext());
        assertEquals(n, result.size());
        assertEquals(n - 1, ((Number) result.get(n - 1)).intValue());
    }

    @Test
    public void testMapArrayToArray_Empty_ReturnsNoObjectsConstant() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("[]");
        p.nextToken();
        Object[] result = d.mapArrayToArray(p, newContext());
        assertSame(UntypedObjectDeserializer.NO_OBJECTS, result);
    }

    @Test
    public void testMapArrayToArray_OneElement() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        JsonParser p = parserFor("[5]");
        p.nextToken();
        Object[] result = d.mapArrayToArray(p, newContext());
        assertEquals(1, result.length);
    }

    @Test
    public void testMapArrayToArray_ManyElements_BufferOverflow() throws Exception {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(null, null);
        StringBuilder sb = new StringBuilder("[");
        int n = 25;
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append(",");
            sb.append(i);
        }
        sb.append("]");
        JsonParser p = parserFor(sb.toString());
        p.nextToken();
        Object[] result = d.mapArrayToArray(p, newContext());
        assertEquals(n, result.length);
    }

    // =========================================================
    // Group 6: _withResolved
    // =========================================================

    @Test
    public void testWithResolved_UsesGivenDeserializers() throws Exception {
        UntypedObjectDeserializer base = new UntypedObjectDeserializer(null, null);
        JsonDeserializer<Object> strDeser = mockDeser("FROM_WITH_RESOLVED");
        JsonDeserializer<?> resolved = base._withResolved(null, null, strDeser, null);

        assertNotSame(base, resolved);
        assertTrue(resolved instanceof UntypedObjectDeserializer);

        JsonParser p = parserFor("\"x\"");
        p.nextToken();
        assertEquals("FROM_WITH_RESOLVED", resolved.deserialize(p, newContext()));
    }

    // =========================================================
    // Group 7: Vanilla nested class
    // =========================================================

    @Test
    public void testVanilla_Deserialize_EmptyObject() throws Exception {
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();
        JsonParser p = parserFor("{}");
        p.nextToken();
        Object result = v.deserialize(p, newContext());
        assertTrue(result instanceof Map);
        assertTrue(((Map<?, ?>) result).isEmpty());
    }

    @Test
    public void testVanilla_Deserialize_NonEmptyObject_FallthroughToMapObject() throws Exception {
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();
        JsonParser p = parserFor("{\"a\":1}");
        p.nextToken();
        Map<String, Object> result = (Map<String, Object>) v.deserialize(p, newContext());
        assertEquals(1, result.size());
        assertEquals(1, ((Number) result.get("a")).intValue());
    }

    @Test
    public void testVanilla_Deserialize_EmptyArray_FeatureFalse_ReturnsList() throws Exception {
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();
        JsonParser p = parserFor("[]");
        p.nextToken();
        Object result = v.deserialize(p, newContext());
        assertTrue(result instanceof List);
        assertTrue(((List<?>) result).isEmpty());
    }

    @Test
    public void testVanilla_Deserialize_EmptyArray_FeatureTrue_ReturnsNoObjects() throws Exception {
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();
        JsonParser p = parserFor("[]");
        p.nextToken();
        DeserializationContext ctxt = newContext();
        enableFeature(ctxt, DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY);
        Object result = v.deserialize(p, ctxt);
        assertSame(UntypedObjectDeserializer.NO_OBJECTS, result);
    }

    @Test
    public void testVanilla_Deserialize_NonEmptyArray_FeatureFalse_UsesMapArray() throws Exception {
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();
        JsonParser p = parserFor("[1,2,3]");
        p.nextToken();
        Object result = v.deserialize(p, newContext());
        assertTrue(result instanceof List);
        assertEquals(3, ((List<?>) result).size());
    }

    @Test
    public void testVanilla_Deserialize_NonEmptyArray_FeatureTrue_UsesMapArrayToArray() throws Exception {
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();
        JsonParser p = parserFor("[1,2,3]");
        p.nextToken();
        DeserializationContext ctxt = newContext();
        enableFeature(ctxt, DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY);
        Object result = v.deserialize(p, ctxt);
        assertTrue(result instanceof Object[]);
        assertEquals(3, ((Object[]) result).length);
    }

    @Test
    public void testVanilla_Deserialize_StringNumberBoolNull() throws Exception {
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();

        JsonParser p1 = parserFor("\"txt\"");
        p1.nextToken();
        assertEquals("txt", v.deserialize(p1, newContext()));

        JsonParser p2 = parserFor("true");
        p2.nextToken();
        assertEquals(Boolean.TRUE, v.deserialize(p2, newContext()));

        JsonParser p3 = parserFor("false");
        p3.nextToken();
        assertEquals(Boolean.FALSE, v.deserialize(p3, newContext()));

        JsonParser p4 = parserFor("null");
        p4.nextToken();
        assertNull(v.deserialize(p4, newContext()));
    }

    @Test
    public void testVanilla_Deserialize_NumberFloat_BigDecimalFeature() throws Exception {
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();
        JsonParser p = parserFor("2.5");
        p.nextToken();
        DeserializationContext ctxt = newContext();
        enableFeature(ctxt, DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        assertEquals(new BigDecimal("2.5"), v.deserialize(p, ctxt));
    }

    @Test(expected = JsonMappingException.class)
    public void testVanilla_Deserialize_DefaultThrows() throws Exception {
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();
        JsonParser p = parserFor("[1]");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // END_ARRAY - unsupported token here
        v.deserialize(p, newContext());
    }

    @Test
    public void testVanilla_DeserializeWithType_DelegatesToTypeDeserializer() throws Exception {
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();
        TypeDeserializer td = mock(TypeDeserializer.class);
        when(td.deserializeTypedFromAny(any(JsonParser.class), any(DeserializationContext.class))).thenReturn("TYPED");
        JsonParser p = parserFor("{}");
        p.nextToken();
        assertEquals("TYPED", v.deserializeWithType(p, newContext(), td));
    }

    @Test
    public void testVanilla_DeserializeWithType_NumberInt_BigIntegerFeature() throws Exception {
        // จุดต่างสำคัญจาก outer class: Vanilla ใช้ USE_BIG_INTEGER_FOR_INTS ตรง ๆ ไม่ใช้ hasSomeOfFeatures(mask)
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();
        JsonParser p = parserFor("123");
        p.nextToken();
        DeserializationContext ctxt = newContext();
        enableFeature(ctxt, DeserializationFeature.USE_BIG_INTEGER_FOR_INTS);
        Object result = v.deserializeWithType(p, ctxt, mock(TypeDeserializer.class));
        assertEquals(java.math.BigInteger.valueOf(123), result);
    }

    @Test
    public void testVanilla_DeserializeWithType_NumberInt_NoFeature() throws Exception {
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();
        JsonParser p = parserFor("123");
        p.nextToken();
        DeserializationContext ctxt = newContext();
        Object result = v.deserializeWithType(p, ctxt, mock(TypeDeserializer.class));
        assertEquals(123, ((Number) result).intValue());
    }

    @Test(expected = JsonMappingException.class)
    public void testVanilla_DeserializeWithType_DefaultThrows() throws Exception {
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();
        JsonParser p = parserFor("[1]");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // END_ARRAY
        v.deserializeWithType(p, newContext(), mock(TypeDeserializer.class));
    }

    @Test
    public void testVanilla_MapObject_SingleAndMultipleEntries() throws Exception {
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();

        // Vanilla.mapObject ต้องเรียกตอน parser อยู่ที่ FIELD_NAME แล้ว (ไม่ check ชนิด token)
        JsonParser p1 = parserFor("{\"a\":1}");
        p1.nextToken(); // START_OBJECT
        p1.nextToken(); // FIELD_NAME "a"
        Map<String, Object> r1 = (Map<String, Object>) v.mapObject(p1, newContext());
        assertEquals(1, r1.size());

        JsonParser p2 = parserFor("{\"a\":1,\"b\":2,\"c\":3}");
        p2.nextToken();
        p2.nextToken();
        Map<String, Object> r2 = (Map<String, Object>) v.mapObject(p2, newContext());
        assertEquals(3, r2.size());
    }

    @Test
    public void testVanilla_MapArray_OneTwoManyElements() throws Exception {
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();

        // Vanilla.mapArray ต้องเรียกตอน parser อยู่ที่ element แรกแล้ว (ไม่มี empty-check)
        JsonParser p1 = parserFor("[1]");
        p1.nextToken(); // START_ARRAY
        p1.nextToken(); // 1 (first element)
        List<Object> r1 = (List<Object>) v.mapArray(p1, newContext());
        assertEquals(1, r1.size());

        JsonParser p3 = parserFor("[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]");
        p3.nextToken();
        p3.nextToken();
        List<Object> r3 = (List<Object>) v.mapArray(p3, newContext());
        assertEquals(20, r3.size());
    }

    @Test
    public void testVanilla_MapArrayToArray_ManyElements() throws Exception {
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();
        JsonParser p = parserFor("[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]");
        p.nextToken(); // START_ARRAY
        p.nextToken(); // first element (Vanilla.mapArrayToArray ไม่มี initial nextToken)
        Object[] result = v.mapArrayToArray(p, newContext());
        assertEquals(15, result.length);
    }
}
```

## ตารางสรุป Coverage

| กลุ่ม | เมธอดเทส | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| Basic | testIsCachable | isCachable() true |
| Basic | testDeprecatedInstanceField | deprecated `instance` field ไม่ null |
| createContextual | testCreateContextual_AllNullAndExactClass_ReturnsVanillaStd | ทุก field null + getClass()==this.class → Vanilla.std |
| createContextual | testCreateContextual_WithCustomStringDeserializer_ReturnsThis | มี custom deser → return this |
| createContextual | testCreateContextual_SubclassAllNull_ReturnsThisNotVanilla | getClass()!=UntypedObjectDeserializer.class |
| _clearIfStdImpl | testClearIfStdImpl_NullReturnsNull / _NonStdReturnsSame / _StdImplReturnsNull | ทั้ง 2 branch ของ ternary |
| resolve() | testResolve_DefaultTypes_StdImplCustomIsCleared | listType/mapType==null, clear std-impl |
| resolve() | testResolve_DefaultTypes_NonStdCustomIsKept | non-std custom deser คงอยู่ |
| resolve() | testResolve_NonDefaultListMapTypes_StdImplNotCleared | listType/mapType!=null (ไม่ clear) |
| deserialize() | testDeserialize_Null/_TrueFalse | ID_NULL, ID_TRUE, ID_FALSE |
| deserialize() | testDeserialize_String_NoCustom/_WithCustom | ID_STRING ทั้ง 2 branch |
| deserialize() | testDeserialize_NumberInt_* (3 tests) | ID_NUMBER_INT: custom/no-coercion/coercion |
| deserialize() | testDeserialize_NumberFloat_* (3 tests) | ID_NUMBER_FLOAT: double/BigDecimal/custom |
| deserialize() | testDeserialize_StartObject_* (2 tests) | ID_START_OBJECT: mapObject/custom map |
| deserialize() | testDeserialize_StartArray_* (3 tests) | ID_START_ARRAY: feature true/false, list-deser |
| deserialize() | testDeserialize_EmbeddedObject | ID_EMBEDDED_OBJECT |
| deserialize() | testDeserialize_DefaultCase_Throws | default → throw |
| deserializeWithType() | testDeserializeWithType_* (7 tests) | START_OBJECT/ARRAY/FIELD_NAME delegate, EMBEDDED, STRING, NUMBER_INT/FLOAT, TRUE/FALSE/NULL, default throw |
| mapObject() | testMapObject_* (5 tests) | START_OBJECT, FIELD_NAME entry, END_OBJECT entry, 1/2/3+ entries, invalid token throw |
| mapArray() | testMapArray_* (4 tests) | 0/1/2/3+ (buffer overflow) elements |
| mapArrayToArray() | testMapArrayToArray_* (3 tests) | 0/1/many (overflow) elements |
| _withResolved | testWithResolved_UsesGivenDeserializers | สร้าง instance ใหม่พร้อม custom deser |
| Vanilla.deserialize | testVanilla_Deserialize_* (8 tests) | START_OBJECT empty/fallthrough, START_ARRAY empty(feature T/F)/non-empty(feature T/F), string/bool/null, BigDecimal, default throw |
| Vanilla.deserializeWithType | testVanilla_DeserializeWithType_* (4 tests) | delegate, BigInteger feature T/F, default throw |
| Vanilla.mapObject/mapArray/mapArrayToArray | testVanilla_MapObject_*, testVanilla_MapArray_*, testVanilla_MapArrayToArray_* | 1/3+ entries, 1/many elements, buffer overflow |