# StdKeySerializersTest.java

```java
package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Unit tests for {@link StdKeySerializers}.
 * Test class อยู่ในแพ็กเกจเดียวกับคลาสเป้าหมายเพื่อให้สามารถเข้าถึง
 * package-private fields/constants (เช่น DEFAULT_KEY_SERIALIZER, TYPE_* ใน Default) ได้
 */
public class StdKeySerializersTest {

    // Sample enum ที่ override toString() ให้ต่างจาก name()
    // เพื่อแยกแยะ branch WRITE_ENUMS_USING_TO_STRING = true/false ได้ชัดเจน
    private enum SampleEnum {
        A;
        @Override
        public String toString() {
            return "customToString";
        }
    }

    // ==========================================================
    // getStdKeySerializer(...)
    // ==========================================================

    @Test
    public void testGetStdKeySerializer_NullType_ReturnsDynamic() {
        Object ser = StdKeySerializers.getStdKeySerializer(null, null, true);
        assertTrue(ser instanceof StdKeySerializers.Dynamic);
    }

    @Test
    public void testGetStdKeySerializer_ObjectType_ReturnsDynamic() {
        Object ser = StdKeySerializers.getStdKeySerializer(null, Object.class, true);
        assertTrue(ser instanceof StdKeySerializers.Dynamic);
    }

    @Test
    public void testGetStdKeySerializer_StringType_ReturnsStringKeySerializer() {
        Object ser = StdKeySerializers.getStdKeySerializer(null, String.class, true);
        assertSame(StdKeySerializers.DEFAULT_STRING_SERIALIZER, ser);
        assertTrue(ser instanceof StdKeySerializers.StringKeySerializer);
    }

    @Test
    public void testGetStdKeySerializer_PrimitiveType_ReturnsDefaultKeySerializer() {
        // isPrimitive() == true branch
        Object ser = StdKeySerializers.getStdKeySerializer(null, int.class, true);
        assertSame(StdKeySerializers.DEFAULT_KEY_SERIALIZER, ser);
    }

    @Test
    public void testGetStdKeySerializer_NumberSubtype_ReturnsDefaultKeySerializer() {
        // Number.class.isAssignableFrom() == true branch (not primitive)
        Object ser = StdKeySerializers.getStdKeySerializer(null, Integer.class, true);
        assertSame(StdKeySerializers.DEFAULT_KEY_SERIALIZER, ser);
    }

    @Test
    public void testGetStdKeySerializer_ClassType_ReturnsDefaultTypeClass() {
        Object ser = StdKeySerializers.getStdKeySerializer(null, Class.class, true);
        assertTrue(ser instanceof StdKeySerializers.Default);
        assertEquals(StdKeySerializers.Default.TYPE_CLASS,
                ((StdKeySerializers.Default) ser)._typeId);
    }

    @Test
    public void testGetStdKeySerializer_DateItself_ReturnsDefaultTypeDate() {
        Object ser = StdKeySerializers.getStdKeySerializer(null, Date.class, true);
        assertTrue(ser instanceof StdKeySerializers.Default);
        assertEquals(StdKeySerializers.Default.TYPE_DATE,
                ((StdKeySerializers.Default) ser)._typeId);
    }

    @Test
    public void testGetStdKeySerializer_DateSubclass_ReturnsDefaultTypeDate() {
        Object ser = StdKeySerializers.getStdKeySerializer(null, java.sql.Date.class, true);
        assertTrue(ser instanceof StdKeySerializers.Default);
        assertEquals(StdKeySerializers.Default.TYPE_DATE,
                ((StdKeySerializers.Default) ser)._typeId);
    }

    @Test
    public void testGetStdKeySerializer_CalendarSubclass_ReturnsDefaultTypeCalendar() {
        Object ser = StdKeySerializers.getStdKeySerializer(null, GregorianCalendar.class, true);
        assertTrue(ser instanceof StdKeySerializers.Default);
        assertEquals(StdKeySerializers.Default.TYPE_CALENDAR,
                ((StdKeySerializers.Default) ser)._typeId);
    }

    @Test
    public void testGetStdKeySerializer_UUID_ReturnsDefaultTypeToString() {
        Object ser = StdKeySerializers.getStdKeySerializer(null, UUID.class, true);
        assertTrue(ser instanceof StdKeySerializers.Default);
        assertEquals(StdKeySerializers.Default.TYPE_TO_STRING,
                ((StdKeySerializers.Default) ser)._typeId);
    }

    @Test
    public void testGetStdKeySerializer_UnknownType_UseDefaultTrue_ReturnsDefaultKeySerializer() {
        Object ser = StdKeySerializers.getStdKeySerializer(null, StringBuilder.class, true);
        assertSame(StdKeySerializers.DEFAULT_KEY_SERIALIZER, ser);
    }

    @Test
    public void testGetStdKeySerializer_UnknownType_UseDefaultFalse_ReturnsNull() {
        Object ser = StdKeySerializers.getStdKeySerializer(null, StringBuilder.class, false);
        assertNull(ser);
    }

    // ==========================================================
    // getFallbackKeySerializer(...)
    // ==========================================================

    @Test
    public void testGetFallbackKeySerializer_NullType_ReturnsDefaultKeySerializer() {
        Object ser = StdKeySerializers.getFallbackKeySerializer(null, null);
        assertSame(StdKeySerializers.DEFAULT_KEY_SERIALIZER, ser);
    }

    @Test
    public void testGetFallbackKeySerializer_EnumClassItself_ReturnsDynamic() {
        Object ser = StdKeySerializers.getFallbackKeySerializer(null, Enum.class);
        assertTrue(ser instanceof StdKeySerializers.Dynamic);
    }

    @Test
    public void testGetFallbackKeySerializer_EnumSubtype_ReturnsDefaultTypeEnum() {
        Object ser = StdKeySerializers.getFallbackKeySerializer(null, SampleEnum.class);
        assertTrue(ser instanceof StdKeySerializers.Default);
        assertEquals(StdKeySerializers.Default.TYPE_ENUM,
                ((StdKeySerializers.Default) ser)._typeId);
    }

    @Test
    public void testGetFallbackKeySerializer_NonEnumType_ReturnsDefaultKeySerializer() {
        Object ser = StdKeySerializers.getFallbackKeySerializer(null, String.class);
        assertSame(StdKeySerializers.DEFAULT_KEY_SERIALIZER, ser);
    }

    // ==========================================================
    // getDefault() (deprecated)
    // ==========================================================

    @Test
    public void testGetDefault_ReturnsDefaultKeySerializer() {
        Object ser = StdKeySerializers.getDefault();
        assertSame(StdKeySerializers.DEFAULT_KEY_SERIALIZER, ser);
    }

    // ==========================================================
    // Default.serialize(...) - switch branches
    // ==========================================================

    @Test
    public void testDefaultSerialize_TypeDate_CallsDefaultSerializeDateKeyWithDate() throws Exception {
        StdKeySerializers.Default ser =
                new StdKeySerializers.Default(StdKeySerializers.Default.TYPE_DATE, Date.class);
        JsonGenerator g = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        Date value = new Date(123456789L);

        ser.serialize(value, g, provider);

        verify(provider, times(1)).defaultSerializeDateKey(value, g);
    }

    @Test
    public void testDefaultSerialize_TypeCalendar_CallsDefaultSerializeDateKeyWithMillis() throws Exception {
        StdKeySerializers.Default ser =
                new StdKeySerializers.Default(StdKeySerializers.Default.TYPE_CALENDAR, Calendar.class);
        JsonGenerator g = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(987654321L);

        ser.serialize(cal, g, provider);

        verify(provider, times(1)).defaultSerializeDateKey(987654321L, g);
    }

    @Test
    public void testDefaultSerialize_TypeClass_WritesClassName() throws Exception {
        StdKeySerializers.Default ser =
                new StdKeySerializers.Default(StdKeySerializers.Default.TYPE_CLASS, Class.class);
        JsonGenerator g = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);

        ser.serialize(String.class, g, provider);

        verify(g, times(1)).writeFieldName("java.lang.String");
    }

    @Test
    public void testDefaultSerialize_TypeEnum_UsingToStringTrue_WritesToStringValue() throws Exception {
        StdKeySerializers.Default ser =
                new StdKeySerializers.Default(StdKeySerializers.Default.TYPE_ENUM, SampleEnum.class);
        JsonGenerator g = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)).thenReturn(true);

        ser.serialize(SampleEnum.A, g, provider);

        // value.toString() != value.name() ตามที่กำหนดไว้ใน enum ด้านบน
        verify(g, times(1)).writeFieldName("customToString");
    }

    @Test
    public void testDefaultSerialize_TypeEnum_UsingToStringFalse_WritesNameValue() throws Exception {
        StdKeySerializers.Default ser =
                new StdKeySerializers.Default(StdKeySerializers.Default.TYPE_ENUM, SampleEnum.class);
        JsonGenerator g = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)).thenReturn(false);

        ser.serialize(SampleEnum.A, g, provider);

        verify(g, times(1)).writeFieldName("A");
    }

    @Test
    public void testDefaultSerialize_TypeToString_WritesToString() throws Exception {
        StdKeySerializers.Default ser =
                new StdKeySerializers.Default(StdKeySerializers.Default.TYPE_TO_STRING, UUID.class);
        JsonGenerator g = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        UUID value = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");

        ser.serialize(value, g, provider);

        verify(g, times(1)).writeFieldName(value.toString());
    }

    @Test
    public void testDefaultSerialize_UnknownTypeId_FallsIntoDefaultCase_WritesToString() throws Exception {
        // typeId ที่ไม่ตรง case ใด ๆ -> ต้องตกไปที่ default: g.writeFieldName(value.toString())
        StdKeySerializers.Default ser =
                new StdKeySerializers.Default(999, Object.class);
        JsonGenerator g = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        Object value = new Object() {
            @Override
            public String toString() {
                return "weirdValue";
            }
        };

        ser.serialize(value, g, provider);

        verify(g, times(1)).writeFieldName("weirdValue");
    }

    // ==========================================================
    // StringKeySerializer.serialize(...)
    // ==========================================================

    @Test
    public void testStringKeySerializer_Serialize_WritesFieldName() throws Exception {
        StdKeySerializers.StringKeySerializer ser = new StdKeySerializers.StringKeySerializer();
        JsonGenerator g = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);

        ser.serialize("hello", g, provider);

        verify(g, times(1)).writeFieldName("hello");
    }

    @Test
    public void testStringKeySerializer_Serialize_EmptyString() throws Exception {
        // boundary case: empty string
        StdKeySerializers.StringKeySerializer ser = new StdKeySerializers.StringKeySerializer();
        JsonGenerator g = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);

        ser.serialize("", g, provider);

        verify(g, times(1)).writeFieldName("");
    }

    // ==========================================================
    // Dynamic.serialize(...) - ทดสอบผ่าน ObjectMapper จริง
    // เพื่อครอบคลุมทั้งกรณี ser == null (ครั้งแรก) และ ser != null (แคชแล้ว)
    // หมายเหตุ: พึ่งพา behavior จริงของ Jackson pipeline (ObjectMapper),
    // ไม่ mock internal PropertySerializerMap เนื่องจากไม่มีรายละเอียดใน source ที่ให้มา
    // ==========================================================

    @Test
    public void testDynamic_Serialize_ViaObjectMapper_CachesSerializerForSameKeyType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<Object, Object> map = new LinkedHashMap<Object, Object>();
        map.put("a", 1);
        map.put("b", 2); // คีย์เป็น String ชนิดเดียวกัน -> ครั้งที่สองควรใช้ cache (ser != null)

        String json = mapper.writerFor(new TypeReference<Map<Object, Object>>() {})
                .writeValueAsString(map);

        assertTrue(json.contains("\"a\":1"));
        assertTrue(json.contains("\"b\":2"));
    }

    @Test
    public void testDynamic_Serialize_EmptyMap_NoException() throws Exception {
        // boundary: map ว่าง ไม่ควรมี key ใดถูกเรียก serialize
        ObjectMapper mapper = new ObjectMapper();
        Map<Object, Object> map = new HashMap<Object, Object>();

        String json = mapper.writerFor(new TypeReference<Map<Object, Object>>() {})
                .writeValueAsString(map);

        assertEquals("{}", json);
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testGetStdKeySerializer_NullType_ReturnsDynamic` | `rawKeyType == null` → true |
| `testGetStdKeySerializer_ObjectType_ReturnsDynamic` | `rawKeyType == Object.class` → true |
| `testGetStdKeySerializer_StringType_ReturnsStringKeySerializer` | `rawKeyType == String.class` → true |
| `testGetStdKeySerializer_PrimitiveType_ReturnsDefaultKeySerializer` | `isPrimitive()` → true (OR ฝั่งซ้าย) |
| `testGetStdKeySerializer_NumberSubtype_ReturnsDefaultKeySerializer` | `Number.class.isAssignableFrom()` → true (OR ฝั่งขวา) |
| `testGetStdKeySerializer_ClassType_ReturnsDefaultTypeClass` | `rawKeyType == Class.class` → true, สร้าง `Default(TYPE_CLASS)` |
| `testGetStdKeySerializer_DateItself_ReturnsDefaultTypeDate` | `Date.class.isAssignableFrom()` → true (เท่ากันเอง) |
| `testGetStdKeySerializer_DateSubclass_ReturnsDefaultTypeDate` | `Date.class.isAssignableFrom()` → true (subclass) |
| `testGetStdKeySerializer_CalendarSubclass_ReturnsDefaultTypeCalendar` | `Calendar.class.isAssignableFrom()` → true |
| `testGetStdKeySerializer_UUID_ReturnsDefaultTypeToString` | `rawKeyType == UUID.class` → true |
| `testGetStdKeySerializer_UnknownType_UseDefaultTrue_ReturnsDefaultKeySerializer` | ทุก if ก่อนหน้า false, `useDefault` = true |
| `testGetStdKeySerializer_UnknownType_UseDefaultFalse_ReturnsNull` | ทุก if ก่อนหน้า false, `useDefault` = false |
| `testGetFallbackKeySerializer_NullType_ReturnsDefaultKeySerializer` | `rawKeyType != null` → false |
| `testGetFallbackKeySerializer_EnumClassItself_ReturnsDynamic` | `rawKeyType == Enum.class` → true |
| `testGetFallbackKeySerializer_EnumSubtype_ReturnsDefaultTypeEnum` | `rawKeyType.isEnum()` → true |
| `testGetFallbackKeySerializer_NonEnumType_ReturnsDefaultKeySerializer` | ทั้งสอง if false |
| `testGetDefault_ReturnsDefaultKeySerializer` | เมธอด deprecated, ไม่มีสาขา แต่ยืนยัน reference |
| `testDefaultSerialize_TypeDate_*` | `switch` case `TYPE_DATE` |
| `testDefaultSerialize_TypeCalendar_*` | `switch` case `TYPE_CALENDAR` |
| `testDefaultSerialize_TypeClass_*` | `switch` case `TYPE_CLASS` |
| `testDefaultSerialize_TypeEnum_UsingToStringTrue_*` | case `TYPE_ENUM`, ternary → true |
| `testDefaultSerialize_TypeEnum_UsingToStringFalse_*` | case `TYPE_ENUM`, ternary → false |
| `testDefaultSerialize_TypeToString_*` | case `TYPE_TO_STRING` |
| `testDefaultSerialize_UnknownTypeId_*` | `default:` case ของ switch |
| `testStringKeySerializer_Serialize_WritesFieldName` | `StringKeySerializer.serialize` ปกติ |
| `testStringKeySerializer_Serialize_EmptyString` | boundary: string ว่าง |
| `testDynamic_Serialize_ViaObjectMapper_CachesSerializerForSameKeyType` | `Dynamic.serialize`: `ser == null` (ครั้งแรก) และ `ser != null` (แคช) |
| `testDynamic_Serialize_EmptyMap_NoException` | boundary: ไม่มี key ให้ serialize เลย |

**หมายเหตุสำคัญ:**
- การทดสอบ `Dynamic.serialize` ใช้ `ObjectMapper` จริงเนื่องจากพฤติกรรมภายในของ `PropertySerializerMap.findAndAddKeySerializer` ไม่ได้แสดงอยู่ใน source ที่ให้มา จึงไม่ mock ในระดับนั้นเพื่อไม่ "เดา" behavior
- ฟิลด์ `_typeId` และค่าคงที่ `TYPE_*` เป็น package-private จึงต้องวาง test class ไว้ใน package เดียวกับคลาสเป้าหมาย
- ไม่ได้ทดสอบ `readResolve()` ของ `Dynamic` เนื่องจากเป็น mechanism สำหรับ Java serialization ที่ไม่มีการเรียกใช้ชัดเจนในซอร์สโค้ดหลัก (ถ้าต้องการ coverage เพิ่มสามารถทดสอบด้วย `ObjectOutputStream`/`ObjectInputStream` ได้ แต่ไม่อยู่ในขอบเขตที่วิเคราะห์จาก branch logic หลัก)