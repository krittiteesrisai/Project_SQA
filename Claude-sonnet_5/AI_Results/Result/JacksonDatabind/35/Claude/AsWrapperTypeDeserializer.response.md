# AsWrapperTypeDeserializerTest

**หมายเหตุสำคัญก่อนเริ่ม (ข้อสมมติที่ต้องระวัง เพราะซอร์สที่ให้มาไม่ได้แสดง `TypeDeserializerBase`, `TypeIdResolver`, `DeserializationContext` เต็มรูปแบบ):**
- สมมติว่า `TypeIdResolver.typeFromId(DatabindContext, String)` เป็น signature ที่ใช้จริงในเวอร์ชันนี้ (มาตรฐานของ Jackson 2.x ช่วงเวลานี้)
- สมมติว่า `DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)` และ `DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)` มีอยู่จริงตามมาตรฐาน Jackson API
- พฤติกรรมภายในของ `_findDeserializer` / `_deserializeWithNativeTypeId` (ที่อยู่ใน `TypeDeserializerBase` ซึ่งไม่ได้ให้ซอร์สมา) จะไม่ถูกทดสอบเจาะรายละเอียด แต่ทดสอบผ่านผลลัพธ์ปลายทาง (return value) เท่านั้น
- ใช้ `JsonParserDelegate` (ของ jackson-core) เพื่อ "ปลอม" `canReadTypeId()`/`getTypeId()` โดยยังใช้ parser จริงสำหรับ token ที่เหลือ เพื่อลดความเสี่ยงจากการ mock `JsonParser` แบบ manual ที่ต้อง track state เอง

```java
package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.any;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Unit tests for {@link AsWrapperTypeDeserializer}.
 */
public class AsWrapperTypeDeserializerTest
{
    // ---------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------

    /** Stub JsonDeserializer that just consumes any object/array value and returns a canned result. */
    private static class ConsumingDeserializer extends JsonDeserializer<Object> {
        private final Object result;
        JsonToken observedToken;
        ConsumingDeserializer(Object result) { this.result = result; }
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            observedToken = p.getCurrentToken();
            if (observedToken == JsonToken.START_OBJECT || observedToken == JsonToken.START_ARRAY) {
                p.skipChildren();
            }
            return result;
        }
    }

    /** Simple TypeIdResolver stub matching one fixed type id string. */
    private TypeIdResolver idResolverFor(final String expectedTypeId) {
        final JavaType resolvedType = TypeFactory.defaultInstance().constructType(String.class);
        return new TypeIdResolver() {
            @Override public void init(JavaType baseType) {}
            @Override public String idFromValue(Object value) { return expectedTypeId; }
            @Override public String idFromValueAndType(Object value, Class<?> suggestedType) { return expectedTypeId; }
            @Override public String idFromBaseType() { return expectedTypeId; }
            @Override public JavaType typeFromId(DatabindContext context, String id) {
                return expectedTypeId.equals(id) ? resolvedType : null;
            }
            @Override public String getDescForKnownTypeIds() { return expectedTypeId; }
            @Override public JsonTypeInfo.Id getMechanism() { return JsonTypeInfo.Id.CUSTOM; }
        };
    }

    private AsWrapperTypeDeserializer newDeserializer(TypeIdResolver idRes, boolean typeIdVisible) {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        return new AsWrapperTypeDeserializer(baseType, idRes, "@type", typeIdVisible, null);
    }

    private DeserializationContext mockContext(JsonDeserializer<Object> deser) throws Exception {
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.findContextualValueDeserializer(any(JavaType.class), any(BeanProperty.class)))
                .thenReturn(deser);
        return ctxt;
    }

    /** Creates a real JsonParser positioned at the first token. */
    private JsonParser parserFor(String json) throws IOException {
        JsonParser p = new JsonFactory().createParser(json);
        p.nextToken(); // prime: move to first token
        return p;
    }

    // ---------------------------------------------------------------
    // forProperty / getTypeInclusion
    // ---------------------------------------------------------------

    @Test
    public void testGetTypeInclusion_isWrapperObject() {
        AsWrapperTypeDeserializer d = newDeserializer(idResolverFor("x"), false);
        assertEquals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT, d.getTypeInclusion());
    }

    @Test
    public void testForProperty_sameProperty_returnsSameInstance() {
        AsWrapperTypeDeserializer d = newDeserializer(idResolverFor("x"), false);
        // default _property is null; passing null should hit the "prop == _property" branch (true)
        assertSame(d, d.forProperty(null));
    }

    @Test
    public void testForProperty_differentProperty_returnsNewInstance() {
        AsWrapperTypeDeserializer d = newDeserializer(idResolverFor("x"), false);
        BeanProperty prop = mock(BeanProperty.class);
        Object result = d.forProperty(prop);
        assertNotSame(d, result);
        assertTrue(result instanceof AsWrapperTypeDeserializer);
        assertEquals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT,
                ((AsWrapperTypeDeserializer) result).getTypeInclusion());
    }

    // ---------------------------------------------------------------
    // canReadTypeId branches
    // ---------------------------------------------------------------

    @Test
    public void testDeserialize_nativeTypeId_delegatesDirectly() throws Exception {
        // canReadTypeId() == true, getTypeId() != null -> _deserializeWithNativeTypeId path
        JsonParser real = new JsonFactory().createParser("\"ignored\"");
        JsonParser p = new JsonParserDelegate(real) {
            @Override public boolean canReadTypeId() { return true; }
            @Override public Object getTypeId() { return "nativeTypeVal"; }
        };

        ConsumingDeserializer sub = new ConsumingDeserializer("NATIVE_RESULT");
        DeserializationContext ctxt = mockContext(sub);
        AsWrapperTypeDeserializer d = newDeserializer(idResolverFor("nativeTypeVal"), false);

        Object result = d.deserializeTypedFromObject(p, ctxt);
        assertEquals("NATIVE_RESULT", result);
    }

    @Test
    public void testDeserialize_canReadTypeIdTrueButNull_fallsThroughToNormalParsing() throws Exception {
        // canReadTypeId() == true but getTypeId() == null -> should continue with normal wrapper-object parsing
        JsonParser real = new JsonFactory().createParser("{\"typeVal\":\"scalarVal\"}");
        real.nextToken(); // prime to START_OBJECT
        JsonParser p = new JsonParserDelegate(real) {
            @Override public boolean canReadTypeId() { return true; }
            @Override public Object getTypeId() { return null; }
        };

        ConsumingDeserializer sub = new ConsumingDeserializer("NORMAL_RESULT");
        DeserializationContext ctxt = mockContext(sub);
        AsWrapperTypeDeserializer d = newDeserializer(idResolverFor("typeVal"), false);

        Object result = d.deserializeTypedFromObject(p, ctxt);
        assertEquals("NORMAL_RESULT", result);
        assertEquals(JsonToken.VALUE_STRING, sub.observedToken);
    }

    // ---------------------------------------------------------------
    // Sanity-check branches (START_OBJECT / FIELD_NAME)
    // ---------------------------------------------------------------

    @Test
    public void testDeserialize_wrongStartToken_throwsWrongTokenException() throws Exception {
        JsonParser p = parserFor("[1,2,3]"); // current token = START_ARRAY, not START_OBJECT
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonMappingException expected = new JsonMappingException("bad start token");
        when(ctxt.wrongTokenException(any(JsonParser.class), any(JsonToken.class), any(String.class)))
                .thenReturn(expected);

        AsWrapperTypeDeserializer d = newDeserializer(idResolverFor("x"), false);
        try {
            d.deserializeTypedFromObject(p, ctxt);
            fail("Expected exception was not thrown");
        } catch (JsonMappingException e) {
            assertSame(expected, e);
        }
    }

    @Test
    public void testDeserialize_missingFieldName_throwsWrongTokenException() throws Exception {
        JsonParser p = parserFor("{}"); // START_OBJECT then immediately END_OBJECT (no FIELD_NAME)
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonMappingException expected = new JsonMappingException("no field name");
        when(ctxt.wrongTokenException(any(JsonParser.class), any(JsonToken.class), any(String.class)))
                .thenReturn(expected);

        AsWrapperTypeDeserializer d = newDeserializer(idResolverFor("x"), false);
        try {
            d.deserializeTypedFromObject(p, ctxt);
            fail("Expected exception was not thrown");
        } catch (JsonMappingException e) {
            assertSame(expected, e);
        }
    }

    // ---------------------------------------------------------------
    // typeIdVisible / START_OBJECT merge combinations
    // ---------------------------------------------------------------

    @Test
    public void testDeserialize_typeIdVisibleFalse_scalarValue_success() throws Exception {
        JsonParser p = parserFor("{\"typeVal\":\"scalarVal\"}");
        ConsumingDeserializer sub = new ConsumingDeserializer("SCALAR_OK");
        DeserializationContext ctxt = mockContext(sub);
        AsWrapperTypeDeserializer d = newDeserializer(idResolverFor("typeVal"), false);

        Object result = d.deserializeTypedFromObject(p, ctxt);
        assertEquals("SCALAR_OK", result);
        assertEquals(JsonToken.VALUE_STRING, sub.observedToken);
    }

    @Test
    public void testDeserialize_typeIdVisibleTrue_scalarValue_noMergeBranch() throws Exception {
        // typeIdVisible = true, but value token != START_OBJECT -> merge branch NOT entered
        JsonParser p = parserFor("{\"typeVal\":\"scalarVal\"}");
        ConsumingDeserializer sub = new ConsumingDeserializer("SCALAR_VISIBLE_OK");
        DeserializationContext ctxt = mockContext(sub);
        AsWrapperTypeDeserializer d = newDeserializer(idResolverFor("typeVal"), true);

        Object result = d.deserializeTypedFromObject(p, ctxt);
        assertEquals("SCALAR_VISIBLE_OK", result);
        assertEquals(JsonToken.VALUE_STRING, sub.observedToken);
    }

    @Test
    public void testDeserialize_typeIdVisibleFalse_objectValue_noMergeBranch() throws Exception {
        // typeIdVisible = false even though value is START_OBJECT -> merge branch NOT entered
        JsonParser p = parserFor("{\"typeVal\":{\"a\":1}}");
        ConsumingDeserializer sub = new ConsumingDeserializer("OBJECT_NOMERGE_OK");
        DeserializationContext ctxt = mockContext(sub);
        AsWrapperTypeDeserializer d = newDeserializer(idResolverFor("typeVal"), false);

        Object result = d.deserializeTypedFromObject(p, ctxt);
        assertEquals("OBJECT_NOMERGE_OK", result);
        assertEquals(JsonToken.START_OBJECT, sub.observedToken);
    }

    @Test
    public void testDeserialize_typeIdVisibleTrue_objectValue_mergeBranchEntered() throws Exception {
        // typeIdVisible = true AND value token == START_OBJECT -> merge branch entered
        // (จุดที่เกี่ยวข้องกับ defect JacksonDatabind-35b โดยตรง)
        JsonParser p = parserFor("{\"typeVal\":{\"a\":1}}");
        ConsumingDeserializer sub = new ConsumingDeserializer("OBJECT_MERGE_OK");
        DeserializationContext ctxt = mockContext(sub);
        AsWrapperTypeDeserializer d = newDeserializer(idResolverFor("typeVal"), true);

        Object result = d.deserializeTypedFromObject(p, ctxt);
        assertEquals("OBJECT_MERGE_OK", result);
        assertEquals(JsonToken.START_OBJECT, sub.observedToken);
    }

    // ---------------------------------------------------------------
    // Closing END_OBJECT branch
    // ---------------------------------------------------------------

    @Test
    public void testDeserialize_missingClosingEndObject_throwsWrongTokenException() throws Exception {
        // Malformed: extra field after the value -> next token after value is FIELD_NAME, not END_OBJECT
        JsonParser p = parserFor("{\"typeVal\":\"scalarVal\",\"extra\":1}");
        ConsumingDeserializer sub = new ConsumingDeserializer("WHATEVER");

        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.findContextualValueDeserializer(any(JavaType.class), any(BeanProperty.class)))
                .thenReturn((JsonDeserializer) sub);
        JsonMappingException expected = new JsonMappingException("missing end object");
        when(ctxt.wrongTokenException(any(JsonParser.class), any(JsonToken.class), any(String.class)))
                .thenReturn(expected);

        AsWrapperTypeDeserializer d = newDeserializer(idResolverFor("typeVal"), false);
        try {
            d.deserializeTypedFromObject(p, ctxt);
            fail("Expected exception was not thrown");
        } catch (JsonMappingException e) {
            assertSame(expected, e);
        }
    }

    // ---------------------------------------------------------------
    // Entry-point delegation (deserializeTypedFromArray/Scalar/FromAny)
    // ---------------------------------------------------------------

    @Test
    public void testDeserializeTypedFromArray_delegatesToInternalDeserialize() throws Exception {
        JsonParser p = parserFor("{\"typeVal\":\"scalarVal\"}");
        ConsumingDeserializer sub = new ConsumingDeserializer("ARRAY_ENTRY_OK");
        DeserializationContext ctxt = mockContext(sub);
        AsWrapperTypeDeserializer d = newDeserializer(idResolverFor("typeVal"), false);

        assertEquals("ARRAY_ENTRY_OK", d.deserializeTypedFromArray(p, ctxt));
    }

    @Test
    public void testDeserializeTypedFromScalar_delegatesToInternalDeserialize() throws Exception {
        JsonParser p = parserFor("{\"typeVal\":\"scalarVal\"}");
        ConsumingDeserializer sub = new ConsumingDeserializer("SCALAR_ENTRY_OK");
        DeserializationContext ctxt = mockContext(sub);
        AsWrapperTypeDeserializer d = newDeserializer(idResolverFor("typeVal"), false);

        assertEquals("SCALAR_ENTRY_OK", d.deserializeTypedFromScalar(p, ctxt));
    }

    @Test
    public void testDeserializeTypedFromAny_delegatesToInternalDeserialize() throws Exception {
        JsonParser p = parserFor("{\"typeVal\":\"scalarVal\"}");
        ConsumingDeserializer sub = new ConsumingDeserializer("ANY_ENTRY_OK");
        DeserializationContext ctxt = mockContext(sub);
        AsWrapperTypeDeserializer d = newDeserializer(idResolverFor("typeVal"), false);

        assertEquals("ANY_ENTRY_OK", d.deserializeTypedFromAny(p, ctxt));
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| Test method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testGetTypeInclusion_isWrapperObject` | ค่า return คงที่ของ `getTypeInclusion()` |
| `testForProperty_sameProperty_returnsSameInstance` | `forProperty`: เงื่อนไข `prop == _property` = true |
| `testForProperty_differentProperty_returnsNewInstance` | `forProperty`: เงื่อนไข `prop == _property` = false |
| `testDeserialize_nativeTypeId_delegatesDirectly` | `canReadTypeId()==true` และ `typeId != null` (native id path) |
| `testDeserialize_canReadTypeIdTrueButNull_fallsThroughToNormalParsing` | `canReadTypeId()==true` แต่ `typeId==null` → fallthrough |
| `testDeserialize_wrongStartToken_throwsWrongTokenException` | `getCurrentToken() != START_OBJECT` → throw (canReadTypeId=false โดยธรรมชาติของ real parser) |
| `testDeserialize_missingFieldName_throwsWrongTokenException` | `nextToken() != FIELD_NAME` → throw |
| `testDeserialize_typeIdVisibleFalse_scalarValue_success` | typeIdVisible=false, ค่า scalar → path สำเร็จปกติ, ปิด END_OBJECT ถูกต้อง |
| `testDeserialize_typeIdVisibleTrue_scalarValue_noMergeBranch` | เงื่อนไข AND: (true, token!=START_OBJECT) → ไม่เข้า merge |
| `testDeserialize_typeIdVisibleFalse_objectValue_noMergeBranch` | เงื่อนไข AND: (false, token==START_OBJECT) → ไม่เข้า merge (short-circuit) |
| `testDeserialize_typeIdVisibleTrue_objectValue_mergeBranchEntered` | เงื่อนไข AND: (true, token==START_OBJECT) → เข้า merge branch (จุดที่เกี่ยวข้องกับ defect 35b) |
| `testDeserialize_missingClosingEndObject_throwsWrongTokenException` | `nextToken() != END_OBJECT` (ปิดท้าย) → throw |
| `testDeserializeTypedFromArray/Scalar/FromAny_*` | ยืนยันว่าทั้ง 4 entry-point เรียก `_deserialize` เดียวกันได้ผลลัพธ์ถูกต้อง |

**หมายเหตุ:** สาขา error-handling ภายใน `_findDeserializer` (เช่น กรณี typeId ไม่รู้จัก) ไม่ได้ถูกทดสอบเพราะ logic นั้นอยู่ใน `TypeDeserializerBase` ซึ่งไม่ได้แสดงในซอร์สที่ให้มา จึงไม่เดา behavior ตามข้อกำหนด