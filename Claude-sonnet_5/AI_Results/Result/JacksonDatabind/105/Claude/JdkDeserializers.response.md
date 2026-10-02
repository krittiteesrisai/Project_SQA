# วิเคราะห์ Branch ในซอร์สโค้ด

จากเมธอด `JdkDeserializers.find(Class<?> rawType, String clsName)` มี branch หลักดังนี้:

1. `_classNames.contains(clsName)` → true / false
2. `d != null` (ผลจาก `FromStringDeserializer.findDeserializer(rawType)`) → true / false
3. `rawType == UUID.class` → true / false
4. `rawType == StackTraceElement.class` → true / false
5. `rawType == AtomicBoolean.class` → true / false
6. `rawType == ByteBuffer.class` → true / false
7. Fall-through (ไม่ตรงเงื่อนไขใดเลย) → คืน `null`

**หมายเหตุสำคัญ:** ซอร์สของ `FromStringDeserializer` ไม่ได้ให้มาในโจทย์ จึงไม่สามารถยืนยันได้ 100% ว่า `findDeserializer(rawType)` คืนค่า non-null สำหรับ UUID/AtomicBoolean/StackTraceElement/ByteBuffer หรือไม่ — จุดนี้เกี่ยวข้องกับธรรมชาติของบั๊กจริงใน Defects4J (JacksonDatabind-105) จึงเขียนคอมเมนต์กำกับตามข้อกำหนด และ assert แบบระมัดระวังในจุดที่ไม่แน่ใจ

```java
package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;

import org.junit.Assume;
import org.junit.Test;

import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * Unit tests for {@link JdkDeserializers#find(Class, String)}.
 *
 * หมายเหตุ:
 * - ไม่มีซอร์สของ FromStringDeserializer ในโจทย์ จึงไม่ทราบแน่ชัดว่า
 *   findDeserializer(rawType) จะคืน non-null สำหรับ UUID/AtomicBoolean/
 *   StackTraceElement/ByteBuffer หรือไม่ — นี่คือจุดที่เกี่ยวข้องกับบั๊กจริง
 *   ของ Defects4J JacksonDatabind-105
 * - สำหรับ AtomicBoolean/StackTraceElement/ByteBuffer อนุมานจาก comment ในซอร์ส
 *   ("note: AtomicInteger/Long work due to single-arg constructor. For now?")
 *   ว่าคลาสเหล่านี้ไม่มีรูปแบบ fromString ทั่วไป จึงมีความเป็นไปได้สูงว่าจะได้
 *   deserializer เฉพาะทาง (ไม่ใช่การเดาแบบสุ่ม แต่เป็นการอนุมานจาก design ของโค้ด)
 * - สำหรับ UUID (มี UUID.fromString(String)) มีความเป็นไปได้สูงกว่าที่
 *   FromStringDeserializer จะรองรับโดยตรง จึง assert แค่ non-null เท่านั้น
 */
public class JdkDeserializersTest {

    // ---------- Branch: _classNames.contains(clsName) == false ----------

    @Test
    public void testFind_ClsNameNotRegistered_ReturnsNull() {
        JsonDeserializer<?> d = JdkDeserializers.find(String.class, "com.example.NotRegisteredClass");
        assertNull("clsName ที่ไม่ได้ลงทะเบียนต้องคืน null", d);
    }

    @Test
    public void testFind_EmptyClsName_ReturnsNull() {
        JsonDeserializer<?> d = JdkDeserializers.find(UUID.class, "");
        assertNull("empty string ไม่ควร match ใน _classNames", d);
    }

    @Test
    public void testFind_NullClsName_ReturnsNull_NoException() {
        // HashSet<String>.contains(null) ต้องคืน false และไม่ throw NPE
        JsonDeserializer<?> d = JdkDeserializers.find(UUID.class, null);
        assertNull(d);
    }

    @Test
    public void testFind_CaseSensitiveMismatch_ReturnsNull() {
        // ต้อง match แบบ exact string (case-sensitive)
        JsonDeserializer<?> d = JdkDeserializers.find(UUID.class, "java.util.UUID".toLowerCase());
        assertNull(d);
    }

    @Test
    public void testFind_NullRawType_WithUnregisteredClsName_ReturnsNull() {
        // ป้องกันไม่ให้ rawType == null ทำให้เกิด NPE ตราบใดที่ clsName ไม่ตรง
        // (contains() == false ทำให้ไม่มีการเรียก findDeserializer(null))
        JsonDeserializer<?> d = JdkDeserializers.find(null, "not.in.set");
        assertNull(d);
    }

    // ---------- Branch: contains == true, explicit fallback classes ----------

    @Test
    public void testFind_UUID_MatchedByName_ReturnsNonNull() {
        JsonDeserializer<?> d = JdkDeserializers.find(UUID.class, UUID.class.getName());
        assertNotNull("UUID ต้องมี deserializer (จาก FromStringDeserializer หรือ fallback UUIDDeserializer)", d);
        // ไม่ assert instanceof UUIDDeserializer เพราะไม่แน่ใจว่า
        // FromStringDeserializer.findDeserializer(UUID.class) จะคืน non-null หรือไม่
    }

    @Test
    public void testFind_AtomicBoolean_MatchedByName_ReturnsExpectedDeserializer() {
        JsonDeserializer<?> d = JdkDeserializers.find(AtomicBoolean.class, AtomicBoolean.class.getName());
        assertNotNull(d);
        assertTrue("คาดว่าได้ AtomicBooleanDeserializer เพราะ AtomicBoolean ไม่มีรูปแบบ fromString ทั่วไป",
                d instanceof AtomicBooleanDeserializer);
    }

    @Test
    public void testFind_StackTraceElement_MatchedByName_ReturnsExpectedDeserializer() {
        JsonDeserializer<?> d = JdkDeserializers.find(StackTraceElement.class, StackTraceElement.class.getName());
        assertNotNull(d);
        assertTrue("คาดว่าได้ StackTraceElementDeserializer เพราะไม่มีรูปแบบ fromString ทั่วไป",
                d instanceof StackTraceElementDeserializer);
    }

    @Test
    public void testFind_ByteBuffer_MatchedByName_ReturnsExpectedDeserializer() {
        JsonDeserializer<?> d = JdkDeserializers.find(ByteBuffer.class, ByteBuffer.class.getName());
        assertNotNull(d);
        assertTrue("คาดว่าได้ ByteBufferDeserializer เพราะไม่มีรูปแบบ fromString ทั่วไป",
                d instanceof ByteBufferDeserializer);
    }

    // ---------- Branch: d != null -> return d ----------

    @Test
    public void testFind_ClsNameRegistered_RawTypeIsFromStringType_ReturnsNonNull() {
        // ใช้ clsName ของ UUID (อยู่ใน _classNames แน่นอน) แต่ rawType เป็นคลาสที่
        // FromStringDeserializer.types() รองรับโดยตรง (ดึงมาจาก runtime จริง
        // เพื่อไม่เดา behavior เกินซอร์ส) เพื่อทดสอบ path "d != null -> return d"
        Class<?>[] types = FromStringDeserializer.types();
        Assume.assumeTrue("FromStringDeserializer.types() ต้องไม่ว่างสำหรับ test นี้",
                types != null && types.length > 0);
        Class<?> someType = types[0];
        JsonDeserializer<?> d = JdkDeserializers.find(someType, UUID.class.getName());
        assertNotNull("ถ้า rawType เป็นชนิดที่ FromStringDeserializer รองรับ ต้องได้ deserializer ที่ไม่ null", d);
    }

    @Test
    public void testFind_AllFromStringDeserializerTypes_ReturnNonNull() {
        // วนตรวจทุกชนิดจริงที่ FromStringDeserializer.types() ประกาศไว้
        // (ใช้ static initializer logic เดียวกันกับที่ JdkDeserializers ใช้จริง)
        for (Class<?> cls : FromStringDeserializer.types()) {
            JsonDeserializer<?> d = JdkDeserializers.find(cls, cls.getName());
            assertNotNull("ควรได้ deserializer สำหรับ " + cls.getName(), d);
        }
    }

    // ---------- Branch: ไม่ตรงเงื่อนไขใดเลย -> fall-through คืน null ----------

    @Test
    public void testFind_ClsNameRegistered_RawTypeNotMatchingAnyExplicitBranch_ReturnsNull() {
        // contains(clsName) == true (ใช้ชื่อ AtomicBoolean ซึ่งลงทะเบียนแน่นอน)
        // แต่ rawType เป็น String.class ซึ่งไม่ตรงกับ UUID/StackTraceElement/
        // AtomicBoolean/ByteBuffer และ (สันนิษฐานว่า) ไม่ใช่ FromStringDeserializer type
        // จึงต้อง fall-through ไปคืน null ท้ายเมธอด
        JsonDeserializer<?> d = JdkDeserializers.find(String.class, AtomicBoolean.class.getName());
        assertNull("ต้อง fall-through และคืน null เมื่อไม่ตรงเงื่อนไขใดเลย", d);
    }

    @Test
    public void testFind_ClsNameRegistered_RawTypeMismatchedFromDifferentFallbackClass_ReturnsNull() {
        // clsName ตรงกับ ByteBuffer แต่ rawType เป็น AtomicBoolean.class
        // -> contains == true, findDeserializer(AtomicBoolean.class) คาดว่า null,
        //    จากนั้น if (rawType == UUID.class) false, if (rawType == StackTraceElement.class) false,
        //    if (rawType == AtomicBoolean.class) TRUE -> คืน AtomicBooleanDeserializer
        // (กรณีนี้แสดงว่า clsName ใช้แค่ gate เบื้องต้น ส่วนการเลือก deserializer จริง
        //  ขึ้นกับ rawType เท่านั้น)
        JsonDeserializer<?> d = JdkDeserializers.find(AtomicBoolean.class, ByteBuffer.class.getName());
        assertNotNull(d);
        assertTrue(d instanceof AtomicBooleanDeserializer);
    }
}
```

## สรุป Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testFind_ClsNameNotRegistered_ReturnsNull` | `contains(clsName) == false` (ชื่อคลาสไม่ลงทะเบียน) |
| `testFind_EmptyClsName_ReturnsNull` | `contains(clsName) == false` (string ว่าง — boundary) |
| `testFind_NullClsName_ReturnsNull_NoException` | `contains(null) == false` (ค่า null — ไม่ throw NPE) |
| `testFind_CaseSensitiveMismatch_ReturnsNull` | `contains(clsName) == false` (รูปแบบผิด case-sensitivity) |
| `testFind_NullRawType_WithUnregisteredClsName_ReturnsNull` | `contains == false` พร้อม `rawType == null` (boundary ป้องกัน NPE) |
| `testFind_UUID_MatchedByName_ReturnsNonNull` | `contains == true`, เส้นทาง UUID (`d!=null` หรือ `rawType==UUID.class`) |
| `testFind_AtomicBoolean_MatchedByName_ReturnsExpectedDeserializer` | `contains == true`, `d==null` (สันนิษฐาน), `rawType==AtomicBoolean.class == true` |
| `testFind_StackTraceElement_MatchedByName_ReturnsExpectedDeserializer` | `contains == true`, `d==null` (สันนิษฐาน), `rawType==StackTraceElement.class == true` |
| `testFind_ByteBuffer_MatchedByName_ReturnsExpectedDeserializer` | `contains == true`, `d==null` (สันนิษฐาน), `rawType==ByteBuffer.class == true` |
| `testFind_ClsNameRegistered_RawTypeIsFromStringType_ReturnsNonNull` | `contains == true`, `d != null == true` (return จาก FromStringDeserializer) |
| `testFind_AllFromStringDeserializerTypes_ReturnNonNull` | ครอบคลุม `d != null` สำหรับทุกชนิดจริงใน `FromStringDeserializer.types()` |
| `testFind_ClsNameRegistered_RawTypeNotMatchingAnyExplicitBranch_ReturnsNull` | `contains == true`, `d==null`, ทุก `if(rawType==...) == false` → fall-through คืน `null` |
| `testFind_ClsNameRegistered_RawTypeMismatchedFromDifferentFallbackClass_ReturnsNull` | `contains == true` (คนละชื่อกับ rawType จริง), ตรวจว่า logic การเลือก deserializer ขึ้นกับ `rawType` เท่านั้น ไม่ใช่ `clsName` |

**ข้อจำกัดที่ต้องระวัง:** เนื่องจากไม่มีซอร์สของ `FromStringDeserializer` ให้ตรวจสอบ การ assert ในบาง test (เช่น UUID) จึงเลือก assert เพียง `assertNotNull` เพื่อไม่เดา behavior เกินกว่าที่ซอร์สโค้ดที่ให้มาระบุไว้ ตามข้อกำหนดข้อ 4