# การวิเคราะห์และแผนการทดสอบ

ผมวิเคราะห์ `AsPropertyTypeDeserializer` และออกแบบเทสให้ครอบคลุมสาขาต่าง ๆ โดย:
- ใช้ **ObjectMapper จริง** (round-trip ผ่าน `readValue`) สำหรับสาขาที่สามารถพิสูจน์ได้ว่าเข้าถึงได้จริงตามสถาปัตยกรรมของ Jackson (เช่น `TypeWrappedDeserializer.deserialize()` เรียก `deserializeTypedFromAny`)
- ใช้ **Mockito** สำหรับสาขา native-type-id (`canReadTypeId()`) ซึ่งไม่สามารถทดสอบผ่าน text-JSON parser ได้จริง (parser ข้อความไม่รองรับ native type id)
- **หมายเหตุ**: บางสาขาย่อยใน `_deserializeTypedUsingDefaultImpl` (เช่นกรณี `p.getCurrentToken() == START_ARRAY` ที่ถูกเรียกผ่าน path ของ object โดยตรง ไม่ใช่ผ่าน `deserializeTypedFromAny`) ต้องอาศัย behavior ภายในของ `AsArrayTypeDeserializer`/`BeanDeserializerBase` ที่ไม่มีอยู่ใน source ที่ให้มา จึง **ไม่ได้เขียนเทสสำหรับสาขานี้โดยตรง** เพื่อไม่ให้เดา behavior ที่ไม่มีหลักฐาน (ตามข้อกำหนดที่ 4)

```java
package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Unit test สำหรับ {@link AsPropertyTypeDeserializer}
 *
 * หมายเหตุสำคัญ:
 * - ทดสอบผ่าน ObjectMapper#readValue ที่ root level เนื่องจาก Jackson ใช้
 *   TypeWrappedDeserializer.deserialize() -> typeDeserializer.deserializeTypedFromAny(p, ctxt)
 *   เมื่อ declared type เป็น type ที่มี @JsonTypeInfo (นี่คือ behavior มาตรฐานของ Jackson
 *   ที่เสถียรในหลายเวอร์ชัน ไม่ใช่การเดา)
 * - สาขา canReadTypeId()==true ทดสอบด้วย Mockito เพราะ text-JSON parser ปกติ
 *   จะ return false เสมอ (ไม่มี native type id ใน JSON text format)
 */
public class AsPropertyTypeDeserializerTest {

    // ======================================================================
    // Test model classes
    // ======================================================================

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
    @JsonSubTypes({ @JsonSubTypes.Type(value = Dog.class, name = "dog") })
    static class Animal {
        public String name;
    }

    static class Dog extends Animal {
        public String breed;
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY,
            property = "type", visible = true)
    @JsonSubTypes({ @JsonSubTypes.Type(value = VCat.class, name = "cat") })
    static class VisibleAnimal {
        public String name;
        public String type; // ต้องมี field รับค่า type กลับมา เพราะ visible = true
    }

    static class VCat extends VisibleAnimal {
        public String color;
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY,
            property = "type", defaultImpl = DefImpl.class)
    static class DefBase {
        public String name;
    }

    static class DefImpl extends DefBase {
        public String extra;
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY,
            property = "type", defaultImpl = StringHolder.class)
    static class DefBase2 {
        public String name;
    }

    static class StringHolder extends DefBase2 {
        public final String value;

        @JsonCreator
        public StringHolder(String value) {
            this.value = value;
        }
    }

    static class NaturalWrapper {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
        public Object value;
    }

    // ======================================================================
    // Helper: สร้าง instance ตรง ๆ ผ่าน public constructor (สำหรับเทส
    // constructor / forProperty / native-type-id ที่ไม่ต้องพึ่ง TypeIdResolver จริง)
    // ======================================================================

    private AsPropertyTypeDeserializer newDeserializer() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Animal.class);
        TypeIdResolver idResolver = mock(TypeIdResolver.class); // ไม่ถูกเรียกใช้จริงในกลุ่มเทสนี้
        return new AsPropertyTypeDeserializer(baseType, idResolver, "type", false, null);
    }

    // ======================================================================
    // 1) Constructor / getTypeInclusion / forProperty
    // ======================================================================

    @Test
    public void testConstructor_DefaultInclusionIsProperty() {
        AsPropertyTypeDeserializer deser = newDeserializer();
        assertEquals(As.PROPERTY, deser.getTypeInclusion());
    }

    @Test
    public void testConstructor_CustomInclusion() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Animal.class);
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        AsPropertyTypeDeserializer deser = new AsPropertyTypeDeserializer(
                baseType, idResolver, "type", false, null, As.EXISTING_PROPERTY);
        assertEquals(As.EXISTING_PROPERTY, deser.getTypeInclusion());
    }

    @Test
    public void testForProperty_SamePropertyReturnsSameInstance() {
        // สมมติฐาน: _property (inherited field) มีค่า default เป็น null
        // เมื่อสร้างผ่าน public constructor ที่ไม่ได้รับ BeanProperty
        AsPropertyTypeDeserializer deser = newDeserializer();
        TypeDeserializer result = deser.forProperty(null);
        assertSame(deser, result);
    }

    @Test
    public void testForProperty_DifferentPropertyReturnsNewInstance() {
        AsPropertyTypeDeserializer deser = newDeserializer();
        BeanProperty prop = mock(BeanProperty.class);
        TypeDeserializer result = deser.forProperty(prop);
        assertNotSame(deser, result);
        assertTrue(result instanceof AsPropertyTypeDeserializer);
        assertEquals(As.PROPERTY, result.getTypeInclusion());
    }

    // ======================================================================
    // 2) deserializeTypedFromObject: property มาก่อน (tb ยังเป็น null)
    // ======================================================================

    @Test
    public void testDeserialize_TypePropertyFirst_NoBuffering() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"type\":\"dog\",\"name\":\"Rex\",\"breed\":\"Labrador\"}";
        Animal result = mapper.readValue(json, Animal.class);
        assertTrue(result instanceof Dog);
        assertEquals("Rex", result.name);
        assertEquals("Labrador", ((Dog) result).breed);
    }

    // ======================================================================
    // 3) deserializeTypedFromObject: property มาหลัง field อื่น (ต้อง buffer)
    // ======================================================================

    @Test
    public void testDeserialize_TypePropertyAfterOtherFields_WithBuffering() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\":\"Rex\",\"breed\":\"Labrador\",\"type\":\"dog\"}";
        Animal result = mapper.readValue(json, Animal.class);
        assertTrue(result instanceof Dog);
        assertEquals("Rex", result.name);
        assertEquals("Labrador", ((Dog) result).breed);
    }

    // ======================================================================
    // 4) _deserializeTypedForId: _typeIdVisible == true, tb == null ก่อนเข้าบล็อก
    // ======================================================================

    @Test
    public void testDeserialize_VisibleTypeId_BufferCreatedInsideVisibleBlock() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"type\":\"cat\",\"name\":\"Tom\",\"color\":\"black\"}";
        VisibleAnimal result = mapper.readValue(json, VisibleAnimal.class);
        assertTrue(result instanceof VCat);
        assertEquals("Tom", result.name);
        assertEquals("black", ((VCat) result).color);
        assertEquals("cat", result.type); // typeIdVisible: ค่า type ต้องถูก merge กลับเข้าไป
    }

    // ======================================================================
    // 5) _deserializeTypedForId: _typeIdVisible == true, tb != null ก่อนเข้าบล็อก
    // ======================================================================

    @Test
    public void testDeserialize_VisibleTypeId_BufferAlreadyExistsBeforeVisibleBlock() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\":\"Tom\",\"type\":\"cat\",\"color\":\"black\"}";
        VisibleAnimal result = mapper.readValue(json, VisibleAnimal.class);
        assertTrue(result instanceof VCat);
        assertEquals("Tom", result.name);
        assertEquals("black", ((VCat) result).color);
        assertEquals("cat", result.type);
    }

    // ======================================================================
    // 6) _deserializeTypedUsingDefaultImpl: deser != null, tb != null (merge)
    // ======================================================================

    @Test
    public void testDeserialize_MissingTypeProperty_WithDefaultImpl_BufferMerged() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\":\"Buddy\",\"extra\":\"Stuff\"}";
        DefBase result = mapper.readValue(json, DefBase.class);
        assertTrue(result instanceof DefImpl);
        assertEquals("Buddy", result.name);
        assertEquals("Stuff", ((DefImpl) result).extra);
    }

    // ======================================================================
    // 7) _deserializeTypedUsingDefaultImpl: deser != null, tb == null (ไม่ merge)
    //    เกิดจาก path ที่ token แรกไม่ใช่ START_OBJECT/FIELD_NAME
    // ======================================================================

    @Test
    public void testDeserialize_NonObjectToken_WithDefaultImpl_NoBuffer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "\"hello\""; // scalar value ตรง ๆ ไม่ใช่ JSON object
        DefBase2 result = mapper.readValue(json, DefBase2.class);
        assertTrue(result instanceof StringHolder);
        assertEquals("hello", ((StringHolder) result).value);
    }

    // ======================================================================
    // 8) _deserializeTypedUsingDefaultImpl: deser == null, deserializeIfNatural != null
    //    (สมมติฐาน: property ที่ declare เป็น Object.class + @JsonTypeInfo
    //     จะถูกครอบด้วย TypeWrappedDeserializer เช่นเดียวกับ root value)
    // ======================================================================

    @Test
    public void testDeserialize_NaturalValue_NoDefaultImpl() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"value\":123}";
        NaturalWrapper wrapper = mapper.readValue(json, NaturalWrapper.class);
        assertNotNull(wrapper.value);
        assertEquals(123, ((Number) wrapper.value).intValue());
    }

    // ======================================================================
    // 9) _deserializeTypedUsingDefaultImpl: deser == null, natural == null,
    //    token != START_ARRAY -> reportWrongTokenException
    // ======================================================================

    @Test
    public void testDeserialize_MissingTypeProperty_NoDefaultImpl_ThrowsException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\":\"Rex\",\"breed\":\"Labrador\"}"; // ไม่มี "type"
        try {
            mapper.readValue(json, Animal.class);
            fail("ควรมี exception เนื่องจากไม่พบ type property");
        } catch (JsonMappingException ex) {
            assertTrue(ex.getMessage().contains("missing property"));
            assertTrue(ex.getMessage().contains("type"));
        }
    }

    // ======================================================================
    // 10) deserializeTypedFromAny: START_ARRAY -> super.deserializeTypedFromArray
    //     (รูปแบบ wrapper-array มาตรฐานของ AsArrayTypeDeserializer)
    // ======================================================================

    @Test
    public void testDeserializeTypedFromAny_ArrayWrapper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "[\"dog\",{\"name\":\"Rex\",\"breed\":\"Labrador\"}]";
        Animal result = mapper.readValue(json, Animal.class);
        assertTrue(result instanceof Dog);
        assertEquals("Rex", result.name);
        assertEquals("Labrador", ((Dog) result).breed);
    }

    // ======================================================================
    // 11) deserializeTypedFromObject: p.canReadTypeId() == true, typeId != null
    //     -> ต้องเรียก _deserializeWithNativeTypeId
    // ======================================================================

    @Test
    public void testDeserializeTypedFromObject_NativeTypeId_UsesHelper() throws Exception {
        AsPropertyTypeDeserializer real = newDeserializer();
        AsPropertyTypeDeserializer spyDeser = spy(real);

        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.canReadTypeId()).thenReturn(true);
        when(p.getTypeId()).thenReturn("dog");

        Object sentinel = new Object();
        // stub protected method ที่สืบทอดมาจาก parent class (เข้าถึงได้เพราะอยู่ package เดียวกัน)
        doReturn(sentinel).when(spyDeser)._deserializeWithNativeTypeId(p, ctxt, "dog");

        Object result = spyDeser.deserializeTypedFromObject(p, ctxt);

        assertSame(sentinel, result);
        verify(spyDeser, times(1))._deserializeWithNativeTypeId(p, ctxt, "dog");
    }

    // ======================================================================
    // 12) deserializeTypedFromObject: p.canReadTypeId() == true, typeId == null
    //     -> ต้อง "ไม่" เรียก _deserializeWithNativeTypeId และไปต่อ flow ปกติ
    // ======================================================================

    @Test
    public void testDeserializeTypedFromObject_NativeTypeId_NullIdFallsThrough() throws Exception {
        AsPropertyTypeDeserializer real = newDeserializer();
        AsPropertyTypeDeserializer spyDeser = spy(real);

        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.canReadTypeId()).thenReturn(true);
        when(p.getTypeId()).thenReturn(null);
        // ให้ current token เป็น START_OBJECT ทุกครั้งที่ถูกเรียก (ผลลัพธ์ปลายทางเป็น null
        // เพราะ ctxt เป็น mock ล้วน ๆ reportWrongTokenException จะไม่ throw จริง)
        when(p.getCurrentToken()).thenReturn(JsonToken.START_OBJECT);

        Object result = spyDeser.deserializeTypedFromObject(p, ctxt);

        verify(spyDeser, never())._deserializeWithNativeTypeId(any(JsonParser.class),
                any(DeserializationContext.class), any());
        // ผลลัพธ์ปลายทางไม่สำคัญเท่ากับการยืนยันว่า branch native ไม่ถูกเรียก
        assertNull(result);
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_DefaultInclusionIsProperty` | Constructor 5-args (`_inclusion = As.PROPERTY`), `getTypeInclusion()` |
| `testConstructor_CustomInclusion` | Constructor 6-args พร้อม inclusion กำหนดเอง |
| `testForProperty_SamePropertyReturnsSameInstance` | `forProperty`: `prop == _property` → true → return `this` |
| `testForProperty_DifferentPropertyReturnsNewInstance` | `forProperty`: `prop == _property` → false → สร้าง instance ใหม่ผ่าน copy constructor |
| `testDeserialize_TypePropertyFirst_NoBuffering` | `t == START_OBJECT`; loop iter แรก `name.equals(_typePropertyName)` = true; `_deserializeTypedForId` กับ `tb == null`, `_typeIdVisible == false` |
| `testDeserialize_TypePropertyAfterOtherFields_WithBuffering` | loop: `name.equals(...)` = false → สร้าง/เขียน `tb`; พบ property ทีหลัง → `_deserializeTypedForId` กับ `tb != null` (merge branch) |
| `testDeserialize_VisibleTypeId_BufferCreatedInsideVisibleBlock` | `_typeIdVisible == true` กับ `tb == null` ก่อนเข้าบล็อก → สร้าง `TokenBuffer` ใหม่ภายในบล็อก visible; merge branch `tb != null` |
| `testDeserialize_VisibleTypeId_BufferAlreadyExistsBeforeVisibleBlock` | `_typeIdVisible == true` กับ `tb != null` ก่อนเข้าบล็อก → ข้ามการสร้าง `TokenBuffer` ใหม่ |
| `testDeserialize_MissingTypeProperty_WithDefaultImpl_BufferMerged` | `_deserializeTypedUsingDefaultImpl`: `deser != null`, `tb != null` (writeEndObject + asParser) |
| `testDeserialize_NonObjectToken_WithDefaultImpl_NoBuffer` | `t != FIELD_NAME` (ไม่ใช่ START_OBJECT) → เรียก default-impl ทันทีด้วย `tb == null`; `_deserializeTypedUsingDefaultImpl`: `deser != null`, `tb == null` |
| `testDeserialize_NaturalValue_NoDefaultImpl` | `_deserializeTypedUsingDefaultImpl`: `deser == null`, `deserializeIfNatural(...) != null` |
| `testDeserialize_MissingTypeProperty_NoDefaultImpl_ThrowsException` | loop จบโดยไม่พบ type property; `_deserializeTypedUsingDefaultImpl`: `deser == null`, natural == null, token != START_ARRAY → `reportWrongTokenException` |
| `testDeserializeTypedFromAny_ArrayWrapper` | `deserializeTypedFromAny`: `p.getCurrentToken() == START_ARRAY` → `super.deserializeTypedFromArray` |
| `testDeserializeTypedFromObject_NativeTypeId_UsesHelper` | `p.canReadTypeId() == true` และ `typeId != null` → เรียก `_deserializeWithNativeTypeId` |
| `testDeserializeTypedFromObject_NativeTypeId_NullIdFallsThrough` | `p.canReadTypeId() == true` แต่ `typeId == null` → **ไม่** เรียก `_deserializeWithNativeTypeId`, ไป flow ปกติ |

**สาขาที่ไม่ได้ทดสอบ (ระบุตามข้อกำหนดที่ 4):**
- `_deserializeTypedUsingDefaultImpl`: กรณี `deser == null`, natural == null, และ `p.getCurrentToken() == JsonToken.START_ARRAY` (เรียก `super.deserializeTypedFromAny`) — ไม่สามารถยืนยันได้ว่ามี path การเรียกจริงที่ทำให้ `deserializeTypedFromObject` ถูกเรียกด้วย token เป็น `START_ARRAY` โดยไม่ผ่าน `deserializeTypedFromAny` (ซึ่งจะสกัดกั้น array ไปก่อนแล้ว) โดยไม่ต้องอาศัย internal behavior ของ `BeanDeserializerBase`/`AsArrayTypeDeserializer` ที่ไม่มีอยู่ใน source ที่ให้มา จึงเว้นไว้เพื่อไม่ให้เดา behavior