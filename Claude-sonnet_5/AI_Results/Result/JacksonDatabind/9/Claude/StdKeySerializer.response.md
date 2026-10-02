# StdKeySerializerTest.java

```java
package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.any;

import java.io.IOException;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;

/**
 * Unit tests for {@link StdKeySerializer}.
 *
 * หมายเหตุ: บาง behavior เช่นโครงสร้างภายในของ JsonNode ที่ได้จาก
 * createSchemaNode("string") (ซึ่ง implement อยู่ใน StdSerializer ที่ไม่มี source
 * ให้มาในโจทย์นี้) จะไม่ถูกเดา assert แบบละเอียด จะตรวจสอบเพียงว่า
 * ไม่เป็น null และมีการเรียกจริง
 */
public class StdKeySerializerTest {

    private StdKeySerializer serializer;
    private JsonGenerator jgenMock;
    private SerializerProvider providerMock;

    @Before
    public void setUp() {
        serializer = new StdKeySerializer();
        jgenMock = mock(JsonGenerator.class);
        providerMock = mock(SerializerProvider.class);
    }

    // ---------------------------------------------------------------
    // serialize() - branch: value instanceof Date == true
    // ---------------------------------------------------------------

    @Test
    public void testSerialize_withDateValue_callsDefaultSerializeDateKey() throws IOException {
        Date date = new Date(0L); // boundary: epoch

        serializer.serialize(date, jgenMock, providerMock);

        // Date branch: provider.defaultSerializeDateKey ถูกเรียก, writeFieldName ไม่ถูกเรียก
        verify(providerMock, times(1)).defaultSerializeDateKey(eq(date), eq(jgenMock));
        verify(jgenMock, never()).writeFieldName(any(String.class));
    }

    @Test
    public void testSerialize_withDateSubclass_stillTakesDateBranch() throws IOException {
        // java.sql.Date เป็น subclass ของ java.util.Date -> instanceof ต้องเป็น true ด้วย
        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());

        serializer.serialize(sqlDate, jgenMock, providerMock);

        verify(providerMock, times(1)).defaultSerializeDateKey(eq((Date) sqlDate), eq(jgenMock));
        verify(jgenMock, never()).writeFieldName(any(String.class));
    }

    @Test(expected = IOException.class)
    public void testSerialize_dateBranch_propagatesIOException() throws IOException {
        Date date = new Date();
        doThrow(new IOException("boom")).when(providerMock)
                .defaultSerializeDateKey(any(Date.class), any(JsonGenerator.class));

        serializer.serialize(date, jgenMock, providerMock);
    }

    // ---------------------------------------------------------------
    // serialize() - branch: value instanceof Date == false (else)
    // ---------------------------------------------------------------

    @Test
    public void testSerialize_withStringValue_writesFieldNameUsingToString() throws IOException {
        String value = "testKey";

        serializer.serialize(value, jgenMock, providerMock);

        verify(jgenMock, times(1)).writeFieldName("testKey");
        verify(providerMock, never()).defaultSerializeDateKey(any(Date.class), any(JsonGenerator.class));
    }

    @Test
    public void testSerialize_withIntegerValue_writesToStringOfInteger() throws IOException {
        Integer value = 42;

        serializer.serialize(value, jgenMock, providerMock);

        verify(jgenMock, times(1)).writeFieldName("42");
    }

    @Test
    public void testSerialize_withEmptyStringValue_writesEmptyFieldName() throws IOException {
        String value = "";

        serializer.serialize(value, jgenMock, providerMock);

        verify(jgenMock, times(1)).writeFieldName("");
    }

    @Test
    public void testSerialize_withCustomToString_writesCustomRepresentation() throws IOException {
        Object custom = new Object() {
            @Override
            public String toString() {
                return "custom-key-123";
            }
        };

        serializer.serialize(custom, jgenMock, providerMock);

        verify(jgenMock, times(1)).writeFieldName("custom-key-123");
    }

    @Test(expected = NullPointerException.class)
    public void testSerialize_withNullValue_throwsNullPointerException() throws IOException {
        // value instanceof Date == false สำหรับ null -> เข้า else -> value.toString() -> NPE
        serializer.serialize(null, jgenMock, providerMock);
    }

    // ---------------------------------------------------------------
    // getSchema()
    // ---------------------------------------------------------------

    @Test
    public void testGetSchema_returnsNonNullSchemaNode() throws JsonMappingException {
        JsonNode result = serializer.getSchema(providerMock, null);

        // ไม่ทราบโครงสร้างภายในแน่ชัดของ createSchemaNode() (มาจาก superclass ที่ไม่มี source ให้)
        // จึงตรวจสอบเพียงว่า return ไม่เป็น null
        assertNotNull(result);
    }

    @Test
    public void testGetSchema_withNonNullTypeHint_stillReturnsSchemaNode() throws JsonMappingException {
        // typeHint ไม่ถูกใช้ใน implementation จริง (ดูจาก source),
        // แต่ทดสอบเผื่อ behavior เปลี่ยนแปลงหรือมี side effect ที่ไม่คาดคิด
        java.lang.reflect.Type typeHint = String.class;

        JsonNode result = serializer.getSchema(providerMock, typeHint);

        assertNotNull(result);
    }

    // ---------------------------------------------------------------
    // acceptJsonFormatVisitor()
    // ---------------------------------------------------------------

    @Test
    public void testAcceptJsonFormatVisitor_callsExpectStringFormat() throws JsonMappingException {
        JsonFormatVisitorWrapper visitorMock = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHintMock = mock(JavaType.class);

        serializer.acceptJsonFormatVisitor(visitorMock, typeHintMock);

        verify(visitorMock, times(1)).expectStringFormat(typeHintMock);
    }

    @Test
    public void testAcceptJsonFormatVisitor_withNullTypeHint_stillCallsExpectStringFormat()
            throws JsonMappingException {
        JsonFormatVisitorWrapper visitorMock = mock(JsonFormatVisitorWrapper.class);

        serializer.acceptJsonFormatVisitor(visitorMock, null);

        verify(visitorMock, times(1)).expectStringFormat(null);
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testSerialize_withDateValue_callsDefaultSerializeDateKey` | `serialize()`: เงื่อนไข `value instanceof Date == true` → เรียก `defaultSerializeDateKey` และ `return` ก่อนถึง `writeFieldName` |
| `testSerialize_withDateSubclass_stillTakesDateBranch` | ยืนยันว่า `instanceof` ทำงานถูกต้องกับ subclass ของ `Date` (java.sql.Date) |
| `testSerialize_dateBranch_propagatesIOException` | ตรวจสอบว่า exception จาก `defaultSerializeDateKey` ถูก propagate ออกไป (fault detection) |
| `testSerialize_withStringValue_writesFieldNameUsingToString` | เงื่อนไข `value instanceof Date == false` (else) → `str = value.toString()` แล้ว `writeFieldName(str)` |
| `testSerialize_withIntegerValue_writesToStringOfInteger` | Else-branch กับ type อื่น (Integer) ตรวจสอบ `toString()` ที่ถูกต้อง |
| `testSerialize_withEmptyStringValue_writesEmptyFieldName` | ค่าขอบเขต: string ว่าง `""` |
| `testSerialize_withCustomToString_writesCustomRepresentation` | Else-branch กับ object ที่ override `toString()` เอง |
| `testSerialize_withNullValue_throwsNullPointerException` | ค่า null: `null instanceof Date == false` → เข้า else → `value.toString()` → NPE (fault-sensitive case) |
| `testGetSchema_returnsNonNullSchemaNode` | `getSchema()`: เรียก `createSchemaNode("string")` และตรวจสอบ non-null (ไม่มี branch แต่ทดสอบ path หลัก) |
| `testGetSchema_withNonNullTypeHint_stillReturnsSchemaNode` | `getSchema()` กับ `typeHint` ที่ไม่เป็น null (แม้ typeHint ไม่ถูกใช้จริงใน source) |
| `testAcceptJsonFormatVisitor_callsExpectStringFormat` | `acceptJsonFormatVisitor()`: ตรวจสอบว่า `visitor.expectStringFormat(typeHint)` ถูกเรียกด้วยค่าที่ถูกต้อง |
| `testAcceptJsonFormatVisitor_withNullTypeHint_stillCallsExpectStringFormat` | `acceptJsonFormatVisitor()` กับ `typeHint == null` (edge case) |

**หมายเหตุเพิ่มเติม:**
- คลาส `StdKeySerializer.serialize()` มีเพียง 2 branch หลัก (`if instanceof Date` / `else`) ซึ่งถูกครอบคลุมครบทั้งสองทางแล้ว
- `getSchema()` และ `acceptJsonFormatVisitor()` ไม่มี branch เชิงตรรกะ (ไม่มี if/else/loop) จึงเน้นทดสอบว่า behavior หลัก (การเรียก method ที่ถูกต้อง) เกิดขึ้นจริง
- ไม่ได้เดา behavior ภายในของ `createSchemaNode()` เนื่องจาก source ของ `StdSerializer` ไม่ได้ให้มาในโจทย์