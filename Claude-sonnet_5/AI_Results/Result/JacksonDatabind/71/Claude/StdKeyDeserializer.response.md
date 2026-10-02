# วิเคราะห์และแนวทางการทดสอบ

**หลักการออกแบบเทส:**
- ใช้ `ObjectMapper` จริง (จาก jackson-databind ซึ่งเป็น source ของโปรเจกต์ Defects4J เอง ไม่ใช่ jar dependency) เพื่อ deserialize `Map<K,String>` ซึ่งจะเรียก `StdKeyDeserializer.forType(...)` และ `_parse()` ภายในจริงตาม Javadoc ของคลาส ("used for most Map types")
- เขียน test class ให้อยู่ใน **package เดียวกัน** กับคลาสเป้าหมาย (`com.fasterxml.jackson.databind.deser.std`) เพื่อให้เข้าถึง field `_kind`, `_keyClass`, `_deser` (protected/package-private) ได้โดยตรง สำหรับตรวจสอบ branch ใน `forType()` แบบชัดเจนโดยไม่ต้องเดา exception message
- สำหรับกรณีที่ `key == null` และ `StringKD` ซึ่งไม่ใช้ `ctxt` เลย จะเรียกตรงโดยไม่ต้องสร้าง `DeserializationContext`
- **ไม่ทดสอบ** `EnumKD`, `DelegatingKD`, `StringCtorKeyDeserializer`, `StringFactoryKeyDeserializer` เพราะคลาสเหล่านี้ไม่ถูกสร้างผ่าน `StdKeyDeserializer.forType()` (ถูกสร้างจาก factory อื่นที่ไม่อยู่ในซอร์สที่ให้มา) การจะทดสอบต้องเดา behavior ของ `EnumResolver`/`AnnotatedMethod` ซึ่งขัดกับข้อกำหนดที่ 4 จึงข้ามไปพร้อมคอมเมนต์กำกับ
- กรณี `Locale` ไม่ทดสอบ invalid-format เพราะ `Locale` ใน Java ค่อนข้าง permissive ไม่แน่ใจว่า input ใดจะทำให้ throw จริง (คอมเมนต์กำกับไว้)

```java
package com.fasterxml.jackson.databind.deser.std;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.Assert.*;

/**
 * JUnit4 tests for {@link StdKeyDeserializer}.
 *
 * หมายเหตุสำคัญ:
 * - Test class นี้อยู่ใน package เดียวกับคลาสเป้าหมาย เพื่อเข้าถึง field
 *   package-private/protected (_kind, _keyClass, _deser) สำหรับตรวจ branch ใน forType()
 * - ใช้ ObjectMapper จริง (Map deserialization) เพื่อกระตุ้น deserializeKey()/_parse()
 *   ตาม Javadoc ของคลาสที่ระบุว่าใช้กับ Map types ทั่วไป
 * - ไม่ทดสอบ EnumKD / DelegatingKD / StringCtorKeyDeserializer / StringFactoryKeyDeserializer
 *   เพราะไม่ได้ถูกสร้างผ่าน StdKeyDeserializer.forType() และต้องเดา behavior ของ
 *   EnumResolver/AnnotatedMethod/Constructor ซึ่งไม่มีอยู่ชัดในซอร์สที่ให้มา
 */
public class StdKeyDeserializerTest
{
    // ---------- Helper ----------

    private ObjectMapper newMapper() {
        return new ObjectMapper();
    }

    /**
     * อ่าน JSON object เป็น Map ที่มี key เป็น keyClass ที่กำหนด
     * ใช้ raw Map<?,?> เพื่อเลี่ยงปัญหา generics กับ Class.class เป็น key type
     */
    private Map<?, ?> readMapOf(Class<?> keyClass, String json) throws IOException {
        ObjectMapper mapper = newMapper();
        JavaType mapType = mapper.getTypeFactory()
                .constructMapType(HashMap.class, keyClass, String.class);
        return mapper.readValue(json, mapType);
    }

    private void assertKind(Class<?> raw, int expectedKind) {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(raw);
        assertNotNull("forType(" + raw + ") should not be null", kd);
        assertEquals(expectedKind, kd._kind);
        assertEquals(raw, kd._keyClass);
    }

    // =====================================================================
    // forType() branch coverage
    // =====================================================================

    @Test
    public void testForType_StringReturnsStringKD() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(String.class);
        assertTrue(kd instanceof StdKeyDeserializer.StringKD);
        assertEquals(String.class, kd.getKeyClass());
    }

    @Test
    public void testForType_ObjectReturnsStringKD() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Object.class);
        assertTrue(kd instanceof StdKeyDeserializer.StringKD);
        assertEquals(Object.class, kd.getKeyClass());
    }

    @Test
    public void testForType_KindAssignments() {
        assertKind(UUID.class, StdKeyDeserializer.TYPE_UUID);
        assertKind(Integer.class, StdKeyDeserializer.TYPE_INT);
        assertKind(Long.class, StdKeyDeserializer.TYPE_LONG);
        assertKind(Date.class, StdKeyDeserializer.TYPE_DATE);
        assertKind(Calendar.class, StdKeyDeserializer.TYPE_CALENDAR);
        assertKind(Boolean.class, StdKeyDeserializer.TYPE_BOOLEAN);
        assertKind(Byte.class, StdKeyDeserializer.TYPE_BYTE);
        assertKind(Character.class, StdKeyDeserializer.TYPE_CHAR);
        assertKind(Short.class, StdKeyDeserializer.TYPE_SHORT);
        assertKind(Float.class, StdKeyDeserializer.TYPE_FLOAT);
        assertKind(Double.class, StdKeyDeserializer.TYPE_DOUBLE);
        assertKind(URI.class, StdKeyDeserializer.TYPE_URI);
        assertKind(URL.class, StdKeyDeserializer.TYPE_URL);
        assertKind(Class.class, StdKeyDeserializer.TYPE_CLASS);
    }

    @Test
    public void testForType_LocaleAssignsDeser() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Locale.class);
        assertNotNull(kd);
        assertEquals(StdKeyDeserializer.TYPE_LOCALE, kd._kind);
        assertNotNull(kd._deser);
    }

    @Test
    public void testForType_CurrencyAssignsDeser() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Currency.class);
        assertNotNull(kd);
        assertEquals(StdKeyDeserializer.TYPE_CURRENCY, kd._kind);
        assertNotNull(kd._deser);
    }

    @Test
    public void testForType_UnsupportedTypeReturnsNull() {
        // primitive int.class ไม่ตรงกับ Integer.class ใน reference equality check -> else -> null
        assertNull(StdKeyDeserializer.forType(int.class));
        // คลาสที่ไม่รู้จักเลย -> else -> null
        assertNull(StdKeyDeserializer.forType(StdKeyDeserializerTest.class));
    }

    @Test
    public void testGetKeyClass() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(UUID.class);
        assertEquals(UUID.class, kd.getKeyClass());
    }

    // =====================================================================
    // deserializeKey(): null key branch (ไม่ใช้ ctxt เลยตาม source -> ปลอดภัยที่จะส่ง null)
    // =====================================================================

    @Test
    public void testDeserializeKey_NullKeyReturnsNull() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        assertNull(kd.deserializeKey(null, null));
    }

    @Test
    public void testStringKD_DeserializeKeyReturnsKeyAsIs() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(String.class);
        // StringKD.deserializeKey ไม่ใช้ ctxt เลย -> ส่ง null ได้
        assertEquals("hello", kd.deserializeKey("hello", null));
        assertNull(kd.deserializeKey(null, null));
    }

    // =====================================================================
    // _parse(): TYPE_BOOLEAN
    // =====================================================================

    @Test
    public void testParseBoolean_ValidValues() throws IOException {
        Map<?, ?> map = readMapOf(Boolean.class, "{\"true\":\"a\",\"false\":\"b\"}");
        assertEquals("a", map.get(Boolean.TRUE));
        assertEquals("b", map.get(Boolean.FALSE));
    }

    @Test(expected = JsonProcessingException.class)
    public void testParseBoolean_InvalidValueThrows() throws IOException {
        readMapOf(Boolean.class, "{\"maybe\":\"a\"}");
    }

    // =====================================================================
    // _parse(): TYPE_BYTE (boundary: MIN_VALUE..255 ตาม JACKSON-804)
    // =====================================================================

    @Test
    public void testParseByte_BoundaryValid() throws IOException {
        // 255 และ -128 (Byte.MIN_VALUE) ต้องผ่านได้ตาม comment ใน source
        Map<?, ?> map = readMapOf(Byte.class, "{\"255\":\"a\",\"-128\":\"b\"}");
        assertEquals(2, map.size());
    }

    @Test(expected = JsonProcessingException.class)
    public void testParseByte_OverflowThrows() throws IOException {
        readMapOf(Byte.class, "{\"256\":\"a\"}");
    }

    @Test(expected = JsonProcessingException.class)
    public void testParseByte_UnderflowThrows() throws IOException {
        readMapOf(Byte.class, "{\"-129\":\"a\"}");
    }

    // =====================================================================
    // _parse(): TYPE_SHORT (boundary: Short.MIN_VALUE..Short.MAX_VALUE)
    // =====================================================================

    @Test
    public void testParseShort_BoundaryValid() throws IOException {
        Map<?, ?> map = readMapOf(Short.class, "{\"32767\":\"a\",\"-32768\":\"b\"}");
        assertEquals(2, map.size());
    }

    @Test(expected = JsonProcessingException.class)
    public void testParseShort_OverflowThrows() throws IOException {
        readMapOf(Short.class, "{\"32768\":\"a\"}");
    }

    @Test(expected = JsonProcessingException.class)
    public void testParseShort_UnderflowThrows() throws IOException {
        readMapOf(Short.class, "{\"-32769\":\"a\"}");
    }

    // =====================================================================
    // _parse(): TYPE_CHAR
    // =====================================================================

    @Test
    public void testParseChar_ValidSingleChar() throws IOException {
        Map<?, ?> map = readMapOf(Character.class, "{\"a\":\"x\"}");
        assertEquals("x", map.get('a'));
    }

    @Test(expected = JsonProcessingException.class)
    public void testParseChar_MultiCharThrows() throws IOException {
        readMapOf(Character.class, "{\"ab\":\"x\"}");
    }

    @Test(expected = JsonProcessingException.class)
    public void testParseChar_EmptyStringThrows() throws IOException {
        readMapOf(Character.class, "{\"\":\"x\"}");
    }

    // =====================================================================
    // _parse(): TYPE_INT
    // =====================================================================

    @Test
    public void testParseInt_Valid() throws IOException {
        Map<?, ?> map = readMapOf(Integer.class, "{\"123\":\"x\",\"-45\":\"y\"}");
        assertEquals("x", map.get(123));
        assertEquals("y", map.get(-45));
    }

    @Test(expected = JsonProcessingException.class)
    public void testParseInt_InvalidThrows() throws IOException {
        readMapOf(Integer.class, "{\"abc\":\"x\"}");
    }

    // =====================================================================
    // _parse(): TYPE_LONG
    // =====================================================================

    @Test
    public void testParseLong_Valid() throws IOException {
        Map<?, ?> map = readMapOf(Long.class, "{\"123456789012\":\"x\"}");
        assertEquals("x", map.get(123456789012L));
    }

    @Test(expected = JsonProcessingException.class)
    public void testParseLong_InvalidThrows() throws IOException {
        readMapOf(Long.class, "{\"notLong\":\"x\"}");
    }

    // =====================================================================
    // _parse(): TYPE_FLOAT
    // =====================================================================

    @Test
    public void testParseFloat_Valid() throws IOException {
        Map<?, ?> map = readMapOf(Float.class, "{\"3.14\":\"x\"}");
        assertEquals("x", map.get(3.14f));
    }

    @Test(expected = JsonProcessingException.class)
    public void testParseFloat_InvalidThrows() throws IOException {
        readMapOf(Float.class, "{\"notFloat\":\"x\"}");
    }

    // =====================================================================
    // _parse(): TYPE_DOUBLE
    // =====================================================================

    @Test
    public void testParseDouble_Valid() throws IOException {
        Map<?, ?> map = readMapOf(Double.class, "{\"3.14159\":\"x\"}");
        assertEquals("x", map.get(3.14159d));
    }

    @Test(expected = JsonProcessingException.class)
    public void testParseDouble_InvalidThrows() throws IOException {
        readMapOf(Double.class, "{\"notDouble\":\"x\"}");
    }

    // =====================================================================
    // _parse(): TYPE_CURRENCY (ใช้ _deser._deserialize; IOException ถูก catch
    // แต่ IllegalArgumentException จาก Currency.getInstance ถูก catch ที่ deserializeKey ชั้นนอก)
    // =====================================================================

    @Test
    public void testParseCurrency_Valid() throws IOException {
        Map<?, ?> map = readMapOf(Currency.class, "{\"USD\":\"x\"}");
        assertEquals("x", map.get(Currency.getInstance("USD")));
    }

    @Test(expected = JsonProcessingException.class)
    public void testParseCurrency_InvalidThrows() throws IOException {
        readMapOf(Currency.class, "{\"NOT_A_CURRENCY\":\"x\"}");
    }

    // =====================================================================
    // _parse(): TYPE_LOCALE
    // หมายเหตุ: ไม่ทดสอบ invalid-format เพราะ Locale ของ Java ค่อนข้าง permissive
    // ไม่สามารถยืนยัน input ที่จะทำให้เกิด exception จริงได้จากซอร์สที่ให้มา
    // =====================================================================

    @Test
    public void testParseLocale_Valid() throws IOException {
        Map<?, ?> map = readMapOf(Locale.class, "{\"en_US\":\"x\"}");
        assertEquals("x", map.get(new Locale("en", "US")));
    }

    // =====================================================================
    // _parse(): TYPE_DATE
    // =====================================================================

    @Test
    public void testParseDate_Valid() throws IOException {
        Map<?, ?> map = readMapOf(Date.class, "{\"2020-01-01T00:00:00.000+0000\":\"x\"}");
        assertEquals(1, map.size());
    }

    @Test(expected = JsonProcessingException.class)
    public void testParseDate_InvalidThrows() throws IOException {
        readMapOf(Date.class, "{\"not-a-date\":\"x\"}");
    }

    // =====================================================================
    // _parse(): TYPE_CALENDAR
    // =====================================================================

    @Test
    public void testParseCalendar_Valid() throws IOException {
        Map<?, ?> map = readMapOf(Calendar.class, "{\"2020-01-01T00:00:00.000+0000\":\"x\"}");
        assertEquals(1, map.size());
    }

    // =====================================================================
    // _parse(): TYPE_UUID
    // =====================================================================

    @Test
    public void testParseUUID_Valid() throws IOException {
        String uuid = "123e4567-e89b-12d3-a456-426614174000";
        Map<?, ?> map = readMapOf(UUID.class, "{\"" + uuid + "\":\"x\"}");
        assertEquals("x", map.get(UUID.fromString(uuid)));
    }

    @Test(expected = JsonProcessingException.class)
    public void testParseUUID_InvalidThrows() throws IOException {
        readMapOf(UUID.class, "{\"not-a-uuid\":\"x\"}");
    }

    // =====================================================================
    // _parse(): TYPE_URI
    // =====================================================================

    @Test
    public void testParseURI_Valid() throws IOException {
        Map<?, ?> map = readMapOf(URI.class, "{\"http://example.com\":\"x\"}");
        assertEquals("x", map.get(URI.create("http://example.com")));
    }

    @Test(expected = JsonProcessingException.class)
    public void testParseURI_InvalidThrows() throws IOException {
        // ช่องว่างเปล่าใน URI ทำให้ URI.create() throw IllegalArgumentException
        readMapOf(URI.class, "{\" \":\"x\"}");
    }

    // =====================================================================
    // _parse(): TYPE_URL
    // =====================================================================

    @Test
    public void testParseURL_Valid() throws IOException {
        Map<?, ?> map = readMapOf(URL.class, "{\"http://example.com\":\"x\"}");
        assertEquals(1, map.size());
    }

    @Test(expected = JsonProcessingException.class)
    public void testParseURL_InvalidThrows() throws IOException {
        readMapOf(URL.class, "{\"not a url\":\"x\"}");
    }

    // =====================================================================
    // _parse(): TYPE_CLASS
    // =====================================================================

    @Test
    public void testParseClass_Valid() throws IOException {
        Map<?, ?> map = readMapOf(Class.class, "{\"java.lang.String\":\"x\"}");
        assertEquals("x", map.get(String.class));
    }

    @Test(expected = JsonProcessingException.class)
    public void testParseClass_InvalidThrows() throws IOException {
        readMapOf(Class.class, "{\"no.such.Class123\":\"x\"}");
    }
}
```

## สรุปตาราง Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testForType_StringReturnsStringKD | `forType`: raw==String.class → StringKD.forType |
| testForType_ObjectReturnsStringKD | `forType`: raw==Object.class → StringKD.forType |
| testForType_KindAssignments | `forType`: UUID/Integer/Long/Date/Calendar/Boolean/Byte/Character/Short/Float/Double/URI/URL/Class branch ทั้งหมด |
| testForType_LocaleAssignsDeser | `forType`: raw==Locale.class + FromStringDeserializer.findDeserializer |
| testForType_CurrencyAssignsDeser | `forType`: raw==Currency.class + FromStringDeserializer.findDeserializer |
| testForType_UnsupportedTypeReturnsNull | `forType`: else → return null (primitive & arbitrary class) |
| testGetKeyClass | `getKeyClass()` |
| testDeserializeKey_NullKeyReturnsNull | `deserializeKey`: `key == null` → return null |
| testStringKD_DeserializeKeyReturnsKeyAsIs | `StringKD.deserializeKey` override (bypass base logic) |
| testParseBoolean_ValidValues / InvalidValueThrows | `_parse` TYPE_BOOLEAN: true/false/else-throw |
| testParseByte_BoundaryValid / OverflowThrows / UnderflowThrows | `_parse` TYPE_BYTE: boundary `<MIN` , `>255`, valid ขอบเขต |
| testParseShort_BoundaryValid / OverflowThrows / UnderflowThrows | `_parse` TYPE_SHORT: boundary MIN/MAX |
| testParseChar_ValidSingleChar / MultiCharThrows / EmptyStringThrows | `_parse` TYPE_CHAR: length==1 vs อื่น ๆ |
| testParseInt_Valid / InvalidThrows | `_parse` TYPE_INT + catch(Exception) ใน deserializeKey |
| testParseLong_Valid / InvalidThrows | `_parse` TYPE_LONG |
| testParseFloat_Valid / InvalidThrows | `_parse` TYPE_FLOAT |
| testParseDouble_Valid / InvalidThrows | `_parse` TYPE_DOUBLE |
| testParseCurrency_Valid / InvalidThrows | `_parse` TYPE_CURRENCY: try/catch(IOException) + outer catch |
| testParseLocale_Valid | `_parse` TYPE_LOCALE: try success path |
| testParseDate_Valid / InvalidThrows | `_parse` TYPE_DATE: ctxt.parseDate + outer catch |
| testParseCalendar_Valid | `_parse` TYPE_CALENDAR: date!=null branch |
| testParseUUID_Valid / InvalidThrows | `_parse` TYPE_UUID |
| testParseURI_Valid / InvalidThrows | `_parse` TYPE_URI |
| testParseURL_Valid / InvalidThrows | `_parse` TYPE_URL |
| testParseClass_Valid / InvalidThrows | `_parse` TYPE_CLASS: try/catch → weirdKeyException |

**หมายเหตุข้อจำกัด:** branch `_keyClass.isEnum() && READ_UNKNOWN_ENUM_VALUES_AS_NULL` ใน `deserializeKey` ของคลาสฐาน และ TYPE_CALENDAR กรณี `date == null` ไม่สามารถทดสอบได้อย่างมั่นใจผ่าน `StdKeyDeserializer.forType()` เนื่องจาก enum type ไม่ถูก map ใน `forType()` (คืน null) และไม่มีหลักฐานชัดเจนว่า input ใดทำให้ `ctxt.parseDate()` คืน null จึงไม่เขียนเทสสำหรับ branch เหล่านี้เพื่อไม่ให้เดา behavior