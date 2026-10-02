# StringArrayDeserializerTest

## แนวทางการทดสอบ

ผมออกแบบชุดทดสอบโดยใช้ **2 แนวทางร่วมกัน**:
1. **Integration-style ผ่าน `ObjectMapper`** — เพื่อทดสอบ end-to-end ผ่าน public API จริง (สอดคล้องกับวิธีที่ deserializer ถูกเรียกใช้งานจริงใน Jackson) ครอบคลุมโค้ดส่วนใหญ่
2. **Direct call + Mockito mock** — สำหรับ branch ที่ยากจะ trigger ผ่าน `ObjectMapper` (เช่น `deserializeWithType`, และกรณี token เป็น `VALUE_NULL` ใน `handleNonArray`)

⚠️ หมายเหตุสำคัญ: เมธอด `_parseString()` เป็นของ superclass (`StdDeserializer`) **ไม่ได้อยู่ในซอร์สที่ให้มา** จึงมีการคอมเมนต์กำกับไว้ชัดเจนทุกครั้งที่ทดสอบ assumption เกี่ยวกับ behavior ของมัน

```java
package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

public class StringArrayDeserializerTest
{
    // ---------------------------------------------------------------
    // Helper classes สำหรับทดสอบ createContextual() / _deserializeCustom()
    // ---------------------------------------------------------------
    public static class UpperCasingStringDeserializer extends JsonDeserializer<String>
    {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            String text = p.getText();
            return (text == null) ? null : text.toUpperCase();
        }
    }

    public static class ArrayHolder
    {
        @JsonDeserialize(contentUsing = UpperCasingStringDeserializer.class)
        public String[] values;
    }

    // ---------------------------------------------------------------
    // 0) Static instance sanity check
    // ---------------------------------------------------------------
    @Test
    public void testStaticInstanceNotNull() {
        assertNotNull(StringArrayDeserializer.instance);
    }

    // ---------------------------------------------------------------
    // 1) Basic happy-path: array ปกติ / array ว่าง
    // ---------------------------------------------------------------
    @Test
    public void testDeserializeSimpleArray() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String[] result = mapper.readValue("[\"a\",\"b\",\"c\"]", String[].class);
        assertArrayEquals(new String[] { "a", "b", "c" }, result);
    }

    @Test
    public void testDeserializeEmptyArray() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String[] result = mapper.readValue("[]", String[].class);
        assertArrayEquals(new String[] {}, result);
    }

    // ---------------------------------------------------------------
    // 2) Fault-detection test: NPE bug (Defects4J JacksonDatabind-3b)
    //    เมื่อ _elementDeserializer == null (ไม่มี custom deserializer)
    //    แต่โค้ดเรียก _elementDeserializer.getNullValue() ที่ branch VALUE_NULL
    //    -> ควร throw NullPointerException บนโค้ดที่มี bug
    //    -> ตามที่ควรจะเป็น (javadoc "must recognize nulls") ผลลัพธ์ควรมี null ใน array ได้โดยไม่ throw
    // ---------------------------------------------------------------
    @Test
    public void testDeserializeDefaultPath_NullElement_ShouldNotThrow() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String[] result = mapper.readValue("[\"a\", null, \"b\"]", String[].class);
        assertArrayEquals(new String[] { "a", null, "b" }, result);
    }

    // ---------------------------------------------------------------
    // 3) Loop / chunk-resize coverage (ix >= chunk.length branch)
    // ---------------------------------------------------------------
    @Test
    public void testDeserializeLargeArray_TriggersChunkResize() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        int size = 50;
        StringBuilder sb = new StringBuilder("[");
        String[] expected = new String[size];
        for (int i = 0; i < size; i++) {
            if (i > 0) sb.append(",");
            String v = "v" + i;
            sb.append('"').append(v).append('"');
            expected[i] = v;
        }
        sb.append("]");
        String[] result = mapper.readValue(sb.toString(), String[].class);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testDeserializeCustom_LargeArrayTriggersChunkResize() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        int size = 60;
        StringBuilder sb = new StringBuilder("{\"values\":[");
        String[] expected = new String[size];
        for (int i = 0; i < size; i++) {
            if (i > 0) sb.append(",");
            String v = "v" + i;
            sb.append('"').append(v).append('"');
            expected[i] = v.toUpperCase();
        }
        sb.append("]}");
        ArrayHolder holder = mapper.readValue(sb.toString(), ArrayHolder.class);
        assertArrayEquals(expected, holder.values);
    }

    // ---------------------------------------------------------------
    // 4) _deserializeCustom() path (มี _elementDeserializer)
    // ---------------------------------------------------------------
    @Test
    public void testDeserializeCustom_UsesElementDeserializer() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ArrayHolder holder = mapper.readValue(
                "{\"values\":[\"a\",\"b\",\"c\"]}", ArrayHolder.class);
        assertArrayEquals(new String[] { "A", "B", "C" }, holder.values);
    }

    @Test
    public void testDeserializeCustom_NullElementStaysNull() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ArrayHolder holder = mapper.readValue(
                "{\"values\":[\"a\",null,\"c\"]}", ArrayHolder.class);
        assertArrayEquals(new String[] { "A", null, "C" }, holder.values);
    }

    // ---------------------------------------------------------------
    // 5) handleNonArray(): ACCEPT_SINGLE_VALUE_AS_ARRAY = false (default) -> throw
    // ---------------------------------------------------------------
    @Test(expected = JsonMappingException.class)
    public void testDeserialize_NonArrayInput_DefaultConfig_Throws() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("123", String[].class);
    }

    // ---------------------------------------------------------------
    // 6) handleNonArray(): ACCEPT_EMPTY_STRING_AS_NULL_OBJECT
    // ---------------------------------------------------------------
    @Test(expected = JsonMappingException.class)
    public void testDeserialize_EmptyStringAsNullDisabled_Throws() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("\"\"", String[].class);
    }

    @Test
    public void testDeserialize_EmptyStringAsNullEnabled_ReturnsNull() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        String[] result = mapper.readValue("\"\"", String[].class);
        assertNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_NonEmptyStringWithEmptyStringAsNullEnabled_StillThrows() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        mapper.readValue("\"hello\"", String[].class);
    }

    // ---------------------------------------------------------------
    // 7) handleNonArray(): ACCEPT_SINGLE_VALUE_AS_ARRAY = true
    // ---------------------------------------------------------------
    @Test
    public void testHandleNonArray_AcceptSingleValueEnabled_StringValue() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        String[] result = mapper.readValue("\"hello\"", String[].class);
        assertArrayEquals(new String[] { "hello" }, result);
    }

    // หมายเหตุ (assumption): _parseString() เป็นของ superclass StdDeserializer
    // ไม่ได้อยู่ใน source ที่ให้มา สมมติฐานคือ token ตัวเลขจะถูกแปลงเป็น text ด้วย jp.getText()
    @Test
    public void testHandleNonArray_AcceptSingleValueEnabled_NumericValue() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        String[] result = mapper.readValue("123", String[].class);
        assertArrayEquals(new String[] { "123" }, result);
    }

    // ทดสอบ branch (currentToken == VALUE_NULL) ใน handleNonArray โดยตรงด้วย mock
    // (เพื่อเลี่ยงการพึ่งพาพฤติกรรมจริงของ ObjectMapper ต่อ top-level null ที่มัก
    //  ถูก intercept ไปเรียก getNullValue() ก่อนถึง deserialize())
    @Test
    public void testDeserialize_NonArray_NullToken_AcceptSingleValueEnabled_DirectCall() throws IOException {
        StringArrayDeserializer deser = new StringArrayDeserializer();
        JsonParser parser = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        when(parser.isExpectedStartArrayToken()).thenReturn(false);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_NULL);
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)).thenReturn(true);

        String[] result = deser.deserialize(parser, ctxt);

        assertArrayEquals(new String[] { null }, result);
    }

    // ---------------------------------------------------------------
    // 8) Mixed / numeric element ภายใน array (assumption ตามข้อ 7)
    // ---------------------------------------------------------------
    @Test
    public void testDeserializeArray_WithNumericElements() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String[] result = mapper.readValue("[1, \"two\", 3]", String[].class);
        assertArrayEquals(new String[] { "1", "two", "3" }, result);
    }

    // อินพุตผิดรูปแบบ: element เป็น array ซ้อน -> คาดว่า _parseString ไม่รองรับ token นี้ (assumption)
    @Test(expected = IOException.class)
    public void testDeserializeArray_WithNestedArrayElement_ThrowsException() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("[[\"a\"]]", String[].class);
    }

    // ---------------------------------------------------------------
    // 9) deserializeWithType(): ต้อง delegate ไปยัง TypeDeserializer
    // ---------------------------------------------------------------
    @Test
    public void testDeserializeWithType_DelegatesToTypeDeserializer() throws IOException {
        StringArrayDeserializer deser = new StringArrayDeserializer();
        JsonParser parser = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        Object expected = new String[] { "x" };
        when(typeDeser.deserializeTypedFromArray(parser, ctxt)).thenReturn(expected);

        Object result = deser.deserializeWithType(parser, ctxt, typeDeser);

        assertSame(expected, result);
        verify(typeDeser).deserializeTypedFromArray(parser, ctxt);
    }
}
```

## ตารางสรุป Branch / Condition ที่ครอบคลุม

| Test method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testStaticInstanceNotNull` | ตรวจ static field `instance` ถูก initialize |
| `testDeserializeSimpleArray` | `isExpectedStartArrayToken()==true`, `_elementDeserializer==null`, `t==VALUE_STRING` |
| `testDeserializeEmptyArray` | loop ไม่ execute เลย (`t==END_ARRAY` ทันที) |
| `testDeserializeDefaultPath_NullElement_ShouldNotThrow` | **branch `t==VALUE_NULL` ใน `deserialize()` (จุดที่มี defect NPE)** |
| `testDeserializeLargeArray_TriggersChunkResize` | loop หลายรอบ + branch `ix >= chunk.length` (default path) |
| `testDeserializeCustom_LargeArrayTriggersChunkResize` | loop หลายรอบ + branch `ix >= chunk.length` (`_deserializeCustom`) |
| `testDeserializeCustom_UsesElementDeserializer` | `_elementDeserializer != null` → เรียก `_deserializeCustom`, ทดสอบ `createContextual` (else-branch: `handleSecondaryContextualization`) |
| `testDeserializeCustom_NullElementStaysNull` | `_deserializeCustom`: branch `t==VALUE_NULL` → `value=null` |
| `testDeserialize_NonArrayInput_DefaultConfig_Throws` | `!isExpectedStartArrayToken()`, `ACCEPT_SINGLE_VALUE_AS_ARRAY==false` → throw |
| `testDeserialize_EmptyStringAsNullDisabled_Throws` | `ACCEPT_EMPTY_STRING_AS_NULL_OBJECT==false` → throw |
| `testDeserialize_EmptyStringAsNullEnabled_ReturnsNull` | `VALUE_STRING && ACCEPT_EMPTY_STRING_AS_NULL_OBJECT==true && str.length()==0` → return null |
| `testDeserialize_NonEmptyStringWithEmptyStringAsNullEnabled_StillThrows` | เข้า if แต่ `str.length()!=0` → fallthrough ไป throw |
| `testHandleNonArray_AcceptSingleValueEnabled_StringValue` | `ACCEPT_SINGLE_VALUE_AS_ARRAY==true`, token != VALUE_NULL |
| `testHandleNonArray_AcceptSingleValueEnabled_NumericValue` | เหมือนข้างบนกับตัวเลข (assumption `_parseString`) |
| `testDeserialize_NonArray_NullToken_AcceptSingleValueEnabled_DirectCall` | `ACCEPT_SINGLE_VALUE_AS_ARRAY==true`, `currentToken==VALUE_NULL` (ternary true-branch) |
| `testDeserializeArray_WithNumericElements` | main loop: `else { value = _parseString(...) }` branch |
| `testDeserializeArray_WithNestedArrayElement_ThrowsException` | อินพุตผิดรูปแบบ, exception จาก `_parseString` (assumption) |
| `testDeserializeWithType_DelegatesToTypeDeserializer` | `deserializeWithType()` ทั้งเมธอด |

## หมายเหตุสำคัญ

- **`_parseString()`** เป็นเมธอดของ superclass (`StdDeserializer`) ที่ไม่มีอยู่ในซอร์สที่ให้มา ทุก test ที่พึ่งพา behavior นี้ (เกี่ยวกับตัวเลข/token ที่ไม่รองรับ) มีคอมเมนต์กำกับ assumption ไว้ชัดเจน
- Test `testDeserializeDefaultPath_NullElement_ShouldNotThrow` เป็น **fault-detection test หลัก** ที่ตรงกับบั๊ก Defects4J `JacksonDatabind-3b` — คาดว่าจะ **fail (throw NPE)** บนโค้ดต้นฉบับที่มี defect และควร pass เมื่อโค้ดถูกแก้ไข
- `createContextual()` ไม่ได้ถูกทดสอบแบบ isolated ด้วย mock เนื่องจากมี dependency ภายในซับซ้อน (เช่น `findConvertingContentDeserializer`, `isDefaultDeserializer`) แต่ถูกทดสอบทางอ้อมผ่าน integration test กับ `@JsonDeserialize(contentUsing=...)` ซึ่งครอบคลุม branch หลักทั้งสองทาง (มี/ไม่มี custom deserializer)