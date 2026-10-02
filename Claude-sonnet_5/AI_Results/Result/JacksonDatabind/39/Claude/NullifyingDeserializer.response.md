# การวิเคราะห์คลาสเป้าหมาย

`NullifyingDeserializer` มี 2 เมธอดหลัก:

1. **`deserialize(JsonParser p, DeserializationContext ctxt)`** — เรียก `p.skipChildren()` แล้ว return `null` เสมอ (ไม่มี branch แต่ต้องทดสอบ normal case และ exception propagation)
2. **`deserializeWithType(...)`** — มี `switch` บน `p.getCurrentTokenId()` แบ่งเป็น:
   - `ID_START_ARRAY` → เรียก `typeDeserializer.deserializeTypedFromAny(p, ctxt)`
   - `ID_START_OBJECT` → เรียก `typeDeserializer.deserializeTypedFromAny(p, ctxt)`
   - `ID_FIELD_NAME` → เรียก `typeDeserializer.deserializeTypedFromAny(p, ctxt)`
   - `default` → return `null` โดยไม่เรียก typeDeserializer

ผมใช้ Mockito (มีใน classpath: `mockito-core-1.10.19.jar`) เพื่อ mock `JsonParser`, `DeserializationContext`, และ `TypeDeserializer` เพราะเป็น interface/abstract class ที่ไม่สามารถ instantiate ตรง ๆ ได้ง่าย

```java
package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

public class NullifyingDeserializerTest {

    private NullifyingDeserializer deserializer;
    private JsonParser mockParser;
    private DeserializationContext mockContext;
    private TypeDeserializer mockTypeDeserializer;

    @Before
    public void setUp() {
        deserializer = new NullifyingDeserializer();
        mockParser = mock(JsonParser.class);
        mockContext = mock(DeserializationContext.class);
        mockTypeDeserializer = mock(TypeDeserializer.class);
    }

    // ---------- constructor / static instance ----------

    @Test
    public void testStaticInstanceIsNotNull() {
        assertNotNull(NullifyingDeserializer.instance);
    }

    @Test
    public void testHandledTypeIsObjectClass() {
        // StdDeserializer เก็บ handled type ผ่าน super(Object.class)
        assertEquals(Object.class, deserializer.handledType());
    }

    // ---------- deserialize() ----------

    @Test
    public void testDeserialize_callsSkipChildrenAndReturnsNull() throws IOException {
        Object result = deserializer.deserialize(mockParser, mockContext);

        verify(mockParser, times(1)).skipChildren();
        assertNull(result);
    }

    @Test(expected = IOException.class)
    public void testDeserialize_propagatesIOExceptionFromSkipChildren() throws IOException {
        when(mockParser.skipChildren()).thenThrow(new IOException("boom"));
        deserializer.deserialize(mockParser, mockContext);
    }

    // ---------- deserializeWithType(): branch ID_START_ARRAY ----------

    @Test
    public void testDeserializeWithType_startArray_delegatesToTypeDeserializer() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_START_ARRAY);
        Object expected = new Object();
        when(mockTypeDeserializer.deserializeTypedFromAny(mockParser, mockContext)).thenReturn(expected);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        verify(mockTypeDeserializer, times(1)).deserializeTypedFromAny(mockParser, mockContext);
        assertSame(expected, result);
    }

    // ---------- deserializeWithType(): branch ID_START_OBJECT ----------

    @Test
    public void testDeserializeWithType_startObject_delegatesToTypeDeserializer() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_START_OBJECT);
        Object expected = new Object();
        when(mockTypeDeserializer.deserializeTypedFromAny(mockParser, mockContext)).thenReturn(expected);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        verify(mockTypeDeserializer, times(1)).deserializeTypedFromAny(mockParser, mockContext);
        assertSame(expected, result);
    }

    // ---------- deserializeWithType(): branch ID_FIELD_NAME ----------

    @Test
    public void testDeserializeWithType_fieldName_delegatesToTypeDeserializer() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_FIELD_NAME);
        Object expected = new Object();
        when(mockTypeDeserializer.deserializeTypedFromAny(mockParser, mockContext)).thenReturn(expected);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        verify(mockTypeDeserializer, times(1)).deserializeTypedFromAny(mockParser, mockContext);
        assertSame(expected, result);
    }

    // ---------- deserializeWithType(): default branch (หลาย token id) ----------

    @Test
    public void testDeserializeWithType_defaultCase_string_returnsNullWithoutDelegate() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_STRING);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        verify(mockTypeDeserializer, never())
                .deserializeTypedFromAny(any(JsonParser.class), any(DeserializationContext.class));
        assertNull(result);
    }

    @Test
    public void testDeserializeWithType_defaultCase_null_returnsNullWithoutDelegate() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_NULL);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        verify(mockTypeDeserializer, never())
                .deserializeTypedFromAny(any(JsonParser.class), any(DeserializationContext.class));
        assertNull(result);
    }

    @Test
    public void testDeserializeWithType_defaultCase_endArray_returnsNullWithoutDelegate() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_END_ARRAY);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        verify(mockTypeDeserializer, never())
                .deserializeTypedFromAny(any(JsonParser.class), any(DeserializationContext.class));
        assertNull(result);
    }

    @Test
    public void testDeserializeWithType_defaultCase_endObject_returnsNullWithoutDelegate() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_END_OBJECT);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        verify(mockTypeDeserializer, never())
                .deserializeTypedFromAny(any(JsonParser.class), any(DeserializationContext.class));
        assertNull(result);
    }

    @Test
    public void testDeserializeWithType_defaultCase_numberInt_returnsNullWithoutDelegate() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_NUMBER_INT);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        verify(mockTypeDeserializer, never())
                .deserializeTypedFromAny(any(JsonParser.class), any(DeserializationContext.class));
        assertNull(result);
    }

    @Test
    public void testDeserializeWithType_defaultCase_notAvailable_returnsNullWithoutDelegate() throws IOException {
        // ค่า boundary: token id ที่บ่งบอกว่า parser ยังไม่มี token (edge case)
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_NOT_AVAILABLE);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        verify(mockTypeDeserializer, never())
                .deserializeTypedFromAny(any(JsonParser.class), any(DeserializationContext.class));
        assertNull(result);
    }

    // ---------- deserializeWithType(): exception propagation จาก typeDeserializer ----------

    @Test(expected = IOException.class)
    public void testDeserializeWithType_propagatesIOExceptionFromTypeDeserializer() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_START_OBJECT);
        when(mockTypeDeserializer.deserializeTypedFromAny(mockParser, mockContext))
                .thenThrow(new IOException("fail"));

        deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);
    }
}
```

## ตารางสรุป Test Coverage

| เมธอดทดสอบ | ครอบคลุม Branch/Condition |
|---|---|
| `testStaticInstanceIsNotNull` | ตรวจสอบ static field `instance` ถูกสร้าง (ไม่มี branch แต่ครอบคลุม field initialization) |
| `testHandledTypeIsObjectClass` | ตรวจสอบ constructor เรียก `super(Object.class)` ถูกต้อง |
| `testDeserialize_callsSkipChildrenAndReturnsNull` | Normal path ของ `deserialize()` — เรียก `skipChildren()` และ return `null` |
| `testDeserialize_propagatesIOExceptionFromSkipChildren` | Exception path — `skipChildren()` throw `IOException` แล้ว propagate ออกจาก `deserialize()` |
| `testDeserializeWithType_startArray_delegatesToTypeDeserializer` | `switch` case `ID_START_ARRAY` → เรียก `deserializeTypedFromAny` และ return ค่าที่ได้ |
| `testDeserializeWithType_startObject_delegatesToTypeDeserializer` | `switch` case `ID_START_OBJECT` → เรียก `deserializeTypedFromAny` |
| `testDeserializeWithType_fieldName_delegatesToTypeDeserializer` | `switch` case `ID_FIELD_NAME` → เรียก `deserializeTypedFromAny` |
| `testDeserializeWithType_defaultCase_string_returnsNullWithoutDelegate` | `default` branch ด้วย token `ID_STRING` → return `null`, ไม่เรียก delegate |
| `testDeserializeWithType_defaultCase_null_returnsNullWithoutDelegate` | `default` branch ด้วย token `ID_NULL` |
| `testDeserializeWithType_defaultCase_endArray_returnsNullWithoutDelegate` | `default` branch ด้วย token `ID_END_ARRAY` (boundary — คู่ตรงข้ามกับ START_ARRAY) |
| `testDeserializeWithType_defaultCase_endObject_returnsNullWithoutDelegate` | `default` branch ด้วย token `ID_END_OBJECT` (boundary — คู่ตรงข้ามกับ START_OBJECT) |
| `testDeserializeWithType_defaultCase_numberInt_returnsNullWithoutDelegate` | `default` branch ด้วย token `ID_NUMBER_INT` (primitive value token) |
| `testDeserializeWithType_defaultCase_notAvailable_returnsNullWithoutDelegate` | `default` branch ด้วย token `ID_NOT_AVAILABLE` (edge-case: ไม่มี token พร้อม) |
| `testDeserializeWithType_propagatesIOExceptionFromTypeDeserializer` | Exception path — `deserializeTypedFromAny` throw `IOException` แล้ว propagate ออกจาก `deserializeWithType()` |

**หมายเหตุ:**
- ทุก branch ของ `switch` statement (3 case ที่ระบุชัด + `default`) ถูกทดสอบครบ พร้อมทั้งทดสอบ default ด้วยหลาย token id ที่ต่างกันเพื่อเพิ่มโอกาสดักจับ fault (เช่น หากมีการเผลอเพิ่ม/ลบ case ผิดใน switch)
- ทดสอบ exception propagation ทั้งสองเมธอดเพราะโค้ดไม่มีการ catch exception ใด ๆ — เป็นจุดที่อาจเกิด regression ได้ถ้ามีการเพิ่ม try-catch ผิดพลาดในอนาคต
- ไม่ได้เดา behavior เพิ่มเติมนอกจากที่ปรากฏใน source (เช่น ไม่ทดสอบกรณี parser เป็น null เพราะโค้ดไม่มีการตรวจสอบ null และจะทำให้เกิด `NullPointerException` ปกติจาก Mockito mock ไม่ได้ — ไม่ใช่ behavior ที่ระบุไว้ในคลาส)