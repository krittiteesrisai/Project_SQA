# StdKeyDeserializerTest

## แนวทางการทดสอบ

เนื่องจาก `StdKeyDeserializer` อยู่ใน package `com.fasterxml.jackson.databind.deser.std` และฟิลด์/เมธอดหลัก (`_kind`, `_keyClass`, `_deser`, `_parseInt`, `_parseLong`, `_parseDouble`, `_parse`, constructor) ถูกประกาศเป็น `protected`/package-private ผมจึงวาง **test class ไว้ใน package เดียวกัน** เพื่อเข้าถึงสิ่งเหล่านี้ได้ตรง ๆ โดยไม่ต้อง mock `DeserializationContext` ที่เป็น abstract class ซับซ้อน (มีหลาย method ที่ final/ไม่ final ซึ่งไม่สามารถยืนยันได้จากซอร์สที่ให้มา)

กลยุทธ์หลัก:
1. **ทดสอบ `forType()` แบบ pure unit test** — ตรวจ `_kind`/`_keyClass`/`_deser` ตรง ๆ ไม่ต้องใช้ context
2. **ทดสอบ helper method** (`_parseInt/_parseLong/_parseDouble`) ตรง ๆ
3. **ทดสอบ `deserializeKey(null, null)`** — branch แรกไม่แตะ ctxt เลย จึงปลอดภัย
4. **ทดสอบ `_parse()` branch `default:`** โดยสร้าง instance ด้วย constructor ตรง ๆ ด้วย kind ที่ไม่รู้จัก
5. **ทดสอบ end-to-end ผ่าน `ObjectMapper` จริง** เพื่อขับเคลื่อน `_parse()`/`deserializeKey()` ทุก case ของ switch โดยใช้ `DeserializationContext` ของจริง (หลีกเลี่ยงการเดา behavior ภายใน)

> **หมายเหตุสำคัญ (ตามข้อ 4):** ซอร์สที่ให้มาไม่มี implementation ของ `DeserializationContext.handleWeirdKey(...)` และ `FromStringDeserializer` (Locale/Currency) ผมอาศัย behavior มาตรฐานของ Jackson runtime จริง (ค่า default จะ throw exception เมื่อ key ไม่ถูกต้องและไม่มี `DeserializationProblemHandler` ติดตั้งไว้) — จุดนี้ได้ comment กำกับไว้ในโค้ดทุกจุดที่เกี่ยวข้อง

```java
package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.*;

import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Unit tests for {@link StdKeyDeserializer}.
 *
 * Placed in the SAME package as the class under test so we can access
 * protected/package-private members (_kind, _keyClass, _deser, _parseInt,
 * _parseLong, _parseDouble, _parse, protected constructor) directly,
 * instead of guessing the behaviour of abstract DeserializationContext.
 */
public class StdKeyDeserializerTest {

    private final ObjectMapper MAPPER = new ObjectMapper();

    // =========================================================
    // Group 1: forType() static factory - pure unit tests
    // =========================================================

    @Test
    public void forType_StringObjectCharSequence_returnStringKD() throws IOException {
        StdKeyDeserializer kdString  = StdKeyDeserializer.forType(String.class);
        StdKeyDeserializer kdObject  = StdKeyDeserializer.forType(Object.class);
        StdKeyDeserializer kdCharSeq = StdKeyDeserializer.forType(CharSequence.class);

        assertNotNull(kdString);
        assertNotNull(kdObject);
        assertNotNull(kdCharSeq);

        // StringKD.deserializeKey never touches ctxt -> safe to pass null
        assertEquals("abc", kdString.deserializeKey("abc", null));
        assertEquals("abc", kdObject.deserializeKey("abc", null));
        assertEquals("abc", kdCharSeq.deserializeKey("abc", null));
    }

    @Test
    public void forType_simpleWrapperTypes_setCorrectKindAndClass() {
        assertKind(StdKeyDeserializer.forType(UUID.class),      StdKeyDeserializer.TYPE_UUID,  UUID.class);
        assertKind(StdKeyDeserializer.forType(Integer.class),   StdKeyDeserializer.TYPE_INT,   Integer.class);
        assertKind(StdKeyDeserializer.forType(Long.class),      StdKeyDeserializer.TYPE_LONG,  Long.class);
        assertKind(StdKeyDeserializer.forType(Date.class),      StdKeyDeserializer.TYPE_DATE,  Date.class);
        assertKind(StdKeyDeserializer.forType(Calendar.class),  StdKeyDeserializer.TYPE_CALENDAR, Calendar.class);
        assertKind(StdKeyDeserializer.forType(Boolean.class),   StdKeyDeserializer.TYPE_BOOLEAN, Boolean.class);
        assertKind(StdKeyDeserializer.forType(Byte.class),      StdKeyDeserializer.TYPE_BYTE,  Byte.class);
        assertKind(StdKeyDeserializer.forType(Character.class), StdKeyDeserializer.TYPE_CHAR,  Character.class);
        assertKind(StdKeyDeserializer.forType(Short.class),     StdKeyDeserializer.TYPE_SHORT, Short.class);
        assertKind(StdKeyDeserializer.forType(Float.class),     StdKeyDeserializer.TYPE_FLOAT, Float.class);
        assertKind(StdKeyDeserializer.forType(Double.class),    StdKeyDeserializer.TYPE_DOUBLE, Double.class);
        assertKind(StdKeyDeserializer.forType(URI.class),       StdKeyDeserializer.TYPE_URI,   URI.class);
        assertKind(StdKeyDeserializer.forType(URL.class),       StdKeyDeserializer.TYPE_URL,   URL.class);
        assertKind(StdKeyDeserializer.forType(Class.class),     StdKeyDeserializer.TYPE_CLASS, Class.class);
        assertKind(StdKeyDeserializer.forType(byte[].class),    StdKeyDeserializer.TYPE_BYTE_ARRAY, byte[].class);
    }

    private void assertKind(StdKeyDeserializer kd, int expectedKind, Class<?> expectedClass) {
        assertNotNull(kd);
        assertEquals(expectedKind, kd._kind);
        assertEquals(expectedClass, kd._keyClass);
    }

    @Test
    public void forType_LocaleAndCurrency_haveDelegateDeserializer() {
        StdKeyDeserializer localeKd   = StdKeyDeserializer.forType(Locale.class);
        StdKeyDeserializer currencyKd = StdKeyDeserializer.forType(Currency.class);

        assertNotNull(localeKd);
        assertEquals(StdKeyDeserializer.TYPE_LOCALE, localeKd._kind);
        assertNotNull("Locale key deserializer must have a delegate FromStringDeserializer",
                localeKd._deser);

        assertNotNull(currencyKd);
        assertEquals(StdKeyDeserializer.TYPE_CURRENCY, currencyKd._kind);
        assertNotNull("Currency key deserializer must have a delegate FromStringDeserializer",
                currencyKd._deser);
    }

    @Test
    public void forType_unsupportedType_returnsNull() {
        // Thread.class / primitive int.class are not among the recognised key types
        assertNull(StdKeyDeserializer.forType(Thread.class));
        assertNull(StdKeyDeserializer.forType(int.class));
    }

    @Test
    public void getKeyClass_returnsConfiguredClass() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        assertEquals(Integer.class, kd.getKeyClass());
    }

    // =========================================================
    // Group 2: protected helper methods - direct calls
    // =========================================================

    @Test
    public void parseInt_validAndInvalid() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        assertEquals(42, kd._parseInt("42"));
        assertEquals(-7, kd._parseInt("-7"));
        try {
            kd._parseInt("notAnInt");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) { /* ok */ }
    }

    @Test
    public void parseLong_validAndInvalid() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Long.class);
        assertEquals(123456789012L, kd._parseLong("123456789012"));
        try {
            kd._parseLong("notALong");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) { /* ok */ }
    }

    @Test
    public void parseDouble_validAndInvalid() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Double.class);
        assertEquals(3.14, kd._parseDouble("3.14"), 0.0001);
        try {
            kd._parseDouble("notADouble");
            fail("Expected exception for malformed number");
        } catch (NumberFormatException expected) {
            // NumberInput.parseDouble is documented to throw NumberFormatException
        }
    }

    // =========================================================
    // Group 3: deserializeKey() - null handling & unknown kind
    // =========================================================

    @Test
    public void deserializeKey_nullKey_returnsNullWithoutTouchingContext() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        // source returns immediately when key == null, ctxt is never dereferenced
        assertNull(kd.deserializeKey(null, null));
    }

    @Test(expected = IllegalStateException.class)
    public void parse_unknownKind_throwsIllegalState() throws Exception {
        // Directly exercising the `default:` branch of the switch in _parse(),
        // which forType() can never produce -> only reachable via direct construction.
        StdKeyDeserializer kd = new StdKeyDeserializer(9999, Integer.class);
        kd._parse("anything", null); // ctxt not used before the exception is thrown
    }

    // =========================================================
    // Group 4: integration tests driving _parse()/deserializeKey()
    // through a real ObjectMapper so the real DeserializationContext
    // behaviour (handleWeirdKey, parseDate, constructCalendar,
    // findClass, getConfig...) is exercised faithfully.
    //
    // ASSUMPTION (not shown in provided source): by default, with no
    // DeserializationProblemHandler registered, DeserializationContext.
    // handleWeirdKey(...) ultimately throws an IOException subtype.
    // =========================================================

    @Test
    public void mapKey_stringType_roundTrip() throws IOException {
        Map<String, String> map = MAPPER.readValue("{\"abc\":\"1\"}",
                new TypeReference<Map<String, String>>() {});
        assertEquals("1", map.get("abc"));
    }

    @Test
    public void mapKey_booleanType_valid() throws IOException {
        Map<Boolean, String> map = MAPPER.readValue("{\"true\":\"a\",\"false\":\"b\"}",
                new TypeReference<Map<Boolean, String>>() {});
        assertEquals("a", map.get(Boolean.TRUE));
        assertEquals("b", map.get(Boolean.FALSE));
    }

    @Test(expected = IOException.class)
    public void mapKey_booleanType_invalid_throws() throws IOException {
        MAPPER.readValue("{\"maybe\":\"a\"}", new TypeReference<Map<Boolean, String>>() {});
    }

    @Test
    public void mapKey_byteType_boundaries() throws IOException {
        Map<Byte, String> map = MAPPER.readValue(
                "{\"127\":\"max\",\"-128\":\"min\",\"255\":\"unsigned\"}",
                new TypeReference<Map<Byte, String>>() {});
        assertEquals("max", map.get((byte) 127));
        assertEquals("min", map.get((byte) -128));
        // 255 narrows ("unsigned byte") to signed byte -1
        assertEquals("unsigned", map.get((byte) -1));
    }

    @Test(expected = IOException.class)
    public void mapKey_byteType_overflowAbove255_throws() throws IOException {
        MAPPER.readValue("{\"256\":\"a\"}", new TypeReference<Map<Byte, String>>() {});
    }

    @Test(expected = IOException.class)
    public void mapKey_byteType_overflowBelowMin_throws() throws IOException {
        MAPPER.readValue("{\"-129\":\"a\"}", new TypeReference<Map<Byte, String>>() {});
    }

    @Test(expected = IOException.class)
    public void mapKey_byteType_malformedNumber_throws() throws IOException {
        MAPPER.readValue("{\"notANumber\":\"a\"}", new TypeReference<Map<Byte, String>>() {});
    }

    @Test
    public void mapKey_shortType_boundaries() throws IOException {
        Map<Short, String> map = MAPPER.readValue(
                "{\"32767\":\"max\",\"-32768\":\"min\"}",
                new TypeReference<Map<Short, String>>() {});
        assertEquals("max", map.get((short) 32767));
        assertEquals("min", map.get((short) -32768));
    }

    @Test(expected = IOException.class)
    public void mapKey_shortType_overflowAbove_throws() throws IOException {
        MAPPER.readValue("{\"32768\":\"a\"}", new TypeReference<Map<Short, String>>() {});
    }

    @Test(expected = IOException.class)
    public void mapKey_shortType_overflowBelow_throws() throws IOException {
        MAPPER.readValue("{\"-32769\":\"a\"}", new TypeReference<Map<Short, String>>() {});
    }

    @Test
    public void mapKey_charType_validSingleCharacter() throws IOException {
        Map<Character, String> map = MAPPER.readValue("{\"a\":\"x\"}",
                new TypeReference<Map<Character, String>>() {});
        assertEquals("x", map.get('a'));
    }

    @Test(expected = IOException.class)
    public void mapKey_charType_multiCharacter_throws() throws IOException {
        MAPPER.readValue("{\"ab\":\"x\"}", new TypeReference<Map<Character, String>>() {});
    }

    @Test(expected = IOException.class)
    public void mapKey_charType_emptyString_throws() throws IOException {
        MAPPER.readValue("{\"\":\"x\"}", new TypeReference<Map<Character, String>>() {});
    }

    @Test
    public void mapKey_intType_validAndNegative() throws IOException {
        Map<Integer, String> map = MAPPER.readValue("{\"42\":\"a\",\"-1\":\"b\"}",
                new TypeReference<Map<Integer, String>>() {});
        assertEquals("a", map.get(42));
        assertEquals("b", map.get(-1));
    }

    @Test(expected = IOException.class)
    public void mapKey_intType_malformed_throws() throws IOException {
        MAPPER.readValue("{\"notAnInt\":\"a\"}", new TypeReference<Map<Integer, String>>() {});
    }

    @Test
    public void mapKey_longType_valid() throws IOException {
        Map<Long, String> map = MAPPER.readValue("{\"123456789012\":\"a\"}",
                new TypeReference<Map<Long, String>>() {});
        assertEquals("a", map.get(123456789012L));
    }

    @Test(expected = IOException.class)
    public void mapKey_longType_malformed_throws() throws IOException {
        MAPPER.readValue("{\"notALong\":\"a\"}", new TypeReference<Map<Long, String>>() {});
    }

    @Test
    public void mapKey_floatType_valid() throws IOException {
        Map<Float, String> map = MAPPER.readValue("{\"3.14\":\"a\"}",
                new TypeReference<Map<Float, String>>() {});
        assertEquals("a", map.get(3.14f));
    }

    @Test(expected = IOException.class)
    public void mapKey_floatType_malformed_throws() throws IOException {
        MAPPER.readValue("{\"notAFloat\":\"a\"}", new TypeReference<Map<Float, String>>() {});
    }

    @Test
    public void mapKey_doubleType_valid() throws IOException {
        Map<Double, String> map = MAPPER.readValue("{\"2.71828\":\"a\"}",
                new TypeReference<Map<Double, String>>() {});
        assertEquals("a", map.get(2.71828d));
    }

    @Test(expected = IOException.class)
    public void mapKey_doubleType_malformed_throws() throws IOException {
        MAPPER.readValue("{\"notADouble\":\"a\"}", new TypeReference<Map<Double, String>>() {});
    }

    @Test
    public void mapKey_uuidType_valid() throws IOException {
        String uuid = "123e4567-e89b-12d3-a456-426614174000";
        Map<UUID, String> map = MAPPER.readValue("{\"" + uuid + "\":\"a\"}",
                new TypeReference<Map<UUID, String>>() {});
        assertEquals("a", map.get(UUID.fromString(uuid)));
    }

    @Test(expected = IOException.class)
    public void mapKey_uuidType_malformed_throws() throws IOException {
        MAPPER.readValue("{\"not-a-uuid\":\"a\"}", new TypeReference<Map<UUID, String>>() {});
    }

    @Test
    public void mapKey_uriType_valid() throws IOException {
        Map<URI, String> map = MAPPER.readValue("{\"http://example.com\":\"a\"}",
                new TypeReference<Map<URI, String>>() {});
        assertEquals("a", map.get(URI.create("http://example.com")));
    }

    @Test(expected = IOException.class)
    public void mapKey_uriType_malformed_throws() throws IOException {
        // raw space is illegal inside a URI -> URI.create() throws IllegalArgumentException
        MAPPER.readValue("{\"http://exa mple.com\":\"a\"}", new TypeReference<Map<URI, String>>() {});
    }

    @Test
    public void mapKey_urlType_valid() throws IOException {
        Map<URL, String> map = MAPPER.readValue("{\"http://example.com\":\"a\"}",
                new TypeReference<Map<URL, String>>() {});
        assertEquals("a", map.get(new URL("http://example.com")));
    }

    @Test(expected = IOException.class)
    public void mapKey_urlType_malformed_throws() throws IOException {
        // missing protocol -> MalformedURLException internally
        MAPPER.readValue("{\"not-a-url\":\"a\"}", new TypeReference<Map<URL, String>>() {});
    }

    @Test
    public void mapKey_classType_valid() throws IOException {
        Map<Class<?>, String> map = MAPPER.readValue("{\"java.lang.String\":\"a\"}",
                new TypeReference<Map<Class<?>, String>>() {});
        assertEquals("a", map.get(String.class));
    }

    @Test(expected = IOException.class)
    public void mapKey_classType_notFound_throws() throws IOException {
        MAPPER.readValue("{\"no.such.ClassXYZ\":\"a\"}", new TypeReference<Map<Class<?>, String>>() {});
    }

    @Test
    public void mapKey_currencyType_valid() throws IOException {
        // ASSUMPTION: Locale/Currency FromStringDeserializer logic is not shown
        // in the provided source; relies on standard Currency.getInstance(String).
        Map<Currency, String> map = MAPPER.readValue("{\"USD\":\"a\"}",
                new TypeReference<Map<Currency, String>>() {});
        assertEquals("a", map.get(Currency.getInstance("USD")));
    }

    @Test(expected = IOException.class)
    public void mapKey_currencyType_invalid_throws() throws IOException {
        MAPPER.readValue("{\"ZZZ\":\"a\"}", new TypeReference<Map<Currency, String>>() {});
    }

    @Test
    public void mapKey_byteArrayType_valid() throws IOException {
        String b64 = Base64.getEncoder().encodeToString(new byte[] { 1, 2, 3 });
        Map<byte[], String> map = MAPPER.readValue("{\"" + b64 + "\":\"a\"}",
                new TypeReference<Map<byte[], String>>() {});
        assertEquals(1, map.size());
        Map.Entry<byte[], String> entry = map.entrySet().iterator().next();
        assertArrayEquals(new byte[] { 1, 2, 3 }, entry.getKey());
        assertEquals("a", entry.getValue());
    }

    @Test(expected = IOException.class)
    public void mapKey_byteArrayType_invalidBase64_throws() throws IOException {
        MAPPER.readValue("{\"@@@@\":\"a\"}", new TypeReference<Map<byte[], String>>() {});
    }

    @Test
    public void mapKey_localeType_valid() throws IOException {
        // ASSUMPTION: exact textual grammar accepted by the Locale
        // FromStringDeserializer is not part of the given source;
        // only a plain language-only tag is asserted here.
        Map<Locale, String> map = MAPPER.readValue("{\"en\":\"a\"}",
                new TypeReference<Map<Locale, String>>() {});
        assertEquals(1, map.size());
        assertEquals("a", map.values().iterator().next());
    }

    @Test
    public void mapKey_dateType_valid() throws IOException {
        Map<Date, String> map = MAPPER.readValue(
                "{\"2020-01-02T03:04:05.000+0000\":\"a\"}",
                new TypeReference<Map<Date, String>>() {});
        assertEquals(1, map.size());
        Date date = map.keySet().iterator().next();
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.setTime(date);
        assertEquals(2020, cal.get(Calendar.YEAR));
        assertEquals("a", map.get(date));
    }

    @Test
    public void mapKey_calendarType_valid() throws IOException {
        Map<Calendar, String> map = MAPPER.readValue(
                "{\"2020-01-02T03:04:05.000+0000\":\"a\"}",
                new TypeReference<Map<Calendar, String>>() {});
        assertEquals(1, map.size());
        Calendar cal = map.keySet().iterator().next();
        assertEquals(2020, cal.get(Calendar.YEAR));
    }
}
```

## สรุปตาราง Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `forType_StringObjectCharSequence_returnStringKD` | `forType`: raw==String/Object/CharSequence → `StringKD.forType` |
| `forType_simpleWrapperTypes_setCorrectKindAndClass` | `forType`: ทุก else-if ของ UUID/Integer/Long/Date/Calendar/Boolean/Byte/Character/Short/Float/Double/URI/URL/Class/byte[] |
| `forType_LocaleAndCurrency_haveDelegateDeserializer` | `forType`: branch Locale/Currency ที่สร้าง `FromStringDeserializer` |
| `forType_unsupportedType_returnsNull` | `forType`: else สุดท้าย → return null |
| `getKeyClass_returnsConfiguredClass` | `getKeyClass()` |
| `parseInt_validAndInvalid` | `_parseInt`: valid/invalid (NumberFormatException) |
| `parseLong_validAndInvalid` | `_parseLong`: valid/invalid |
| `parseDouble_validAndInvalid` | `_parseDouble`: valid/invalid |
| `deserializeKey_nullKey_returnsNullWithoutTouchingContext` | `deserializeKey`: `if (key == null) return null;` |
| `parse_unknownKind_throwsIllegalState` | `_parse`: `switch` → `default:` branch |
| `mapKey_stringType_roundTrip` | `StringKD.deserializeKey` |
| `mapKey_booleanType_valid` / `_invalid_throws` | `TYPE_BOOLEAN`: true/false/else→handleWeirdKey |
| `mapKey_byteType_boundaries` / `_overflowAbove255_throws` / `_overflowBelowMin_throws` / `_malformedNumber_throws` | `TYPE_BYTE`: boundary ±128/255, overflow ทั้งสองด้าน, NumberFormatException |
| `mapKey_shortType_boundaries` / `_overflowAbove_throws` / `_overflowBelow_throws` | `TYPE_SHORT`: boundary ±32768/32767, overflow ทั้งสองด้าน |
| `mapKey_charType_validSingleCharacter` / `_multiCharacter_throws` / `_emptyString_throws` | `TYPE_CHAR`: length==1 / length!=1 (multi & 0) |
| `mapKey_intType_validAndNegative` / `_malformed_throws` | `TYPE_INT`: valid/invalid (exception propagate ผ่าน outer catch) |
| `mapKey_longType_valid` / `_malformed_throws` | `TYPE_LONG` |
| `mapKey_floatType_valid` / `_malformed_throws` | `TYPE_FLOAT` |
| `mapKey_doubleType_valid` / `_malformed_throws` | `TYPE_DOUBLE` |
| `mapKey_uuidType_valid` / `_malformed_throws` | `TYPE_UUID`: try/catch → `_weirdKey` |
| `mapKey_uriType_valid` / `_malformed_throws` | `TYPE_URI`: try/catch → `_weirdKey` |
| `mapKey_urlType_valid` / `_malformed_throws` | `TYPE_URL`: MalformedURLException → `_weirdKey` |
| `mapKey_classType_valid` / `_notFound_throws` | `TYPE_CLASS`: `findClass` success / catch(Exception) |
| `mapKey_currencyType_valid` / `_invalid_throws` | `TYPE_CURRENCY`: `_deser._deserialize` success / IllegalArgumentException → `_weirdKey` |
| `mapKey_byteArrayType_valid` / `_invalidBase64_throws` | `TYPE_BYTE_ARRAY`: decode success / IllegalArgumentException → `_weirdKey` |
| `mapKey_localeType_valid` | `TYPE_LOCALE`: success path |
| `mapKey_dateType_valid` | `TYPE_DATE`: `ctxt.parseDate(key)` |
| `mapKey_calendarType_valid` | `TYPE_CALENDAR`: `ctxt.constructCalendar(ctxt.parseDate(key))` |

**ข้อจำกัดที่ไม่ได้ทดสอบ (และเหตุผล):** branch `_keyClass.isEnum() && READ_UNKNOWN_ENUM_VALUES_AS_NULL` ใน `deserializeKey` และคลาส `EnumKD`, `DelegatingKD`, `StringCtorKeyDeserializer`, `StringFactoryKeyDeserializer` ไม่ได้ถูกทดสอบ เนื่องจากต้องสร้าง `EnumResolver`/`AnnotatedMethod`/`Constructor`/`Method` ที่ซับซ้อนและ behavior ภายในไม่ปรากฏในซอร์สที่ให้มา (ตามข้อกำหนดห้ามเดา จึงเลือกไม่เขียนเทสสำหรับส่วนนี้)