# วิเคราะห์ Branch/Condition ของ `WritableObjectId`

**เมธอด `writeAsId`**
- เงื่อนไข compound: `(id != null) && (idWritten || w.alwaysAsId)`
  - id == null → false ทั้ง statement
  - id != null, idWritten=false, alwaysAsId=false → false
  - id != null, idWritten=true → true
  - id != null, alwaysAsId=true → true
- ภายใน true branch: `gen.canWriteObjectId()` true/false → เลือก `writeObjectRef` หรือ `serializer.serialize`

**เมธอด `generateId`**
- เรียก generator.generateId, set id, return id (ไม่มี branch แต่ต้องตรวจ side-effect)

**เมธอด `writeAsField`**
- ตั้ง `idWritten = true` เสมอ
- `gen.canWriteObjectId()` true → เขียน objectId แล้ว return (ไม่ลง path ถัดไป)
- false → ตรวจ `name != null`
  - true → writeFieldName + serializer.serialize
  - false → ไม่ทำอะไรเพิ่ม

หมายเหตุ: `ObjectIdWriter` มี constructor แบบ `protected` จึงวางไฟล์ทดสอบไว้ใน package เดียวกัน (`com.fasterxml.jackson.databind.ser.impl`) เพื่อเรียกใช้ constructor ได้ตรงจาก source (ไม่มี factory method ที่ตรงกับความต้องการทดสอบนี้ และไม่ต้องการเดา behavior เพิ่มเติม)

```java
package com.fasterxml.jackson.databind.ser.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Unit tests for {@link WritableObjectId}.
 *
 * ObjectIdWriter's constructor is protected; since this test class resides
 * in the same package (com.fasterxml.jackson.databind.ser.impl) it can be
 * invoked directly without requiring additional factory/setup logic.
 */
public class WritableObjectIdTest {

    private ObjectIdGenerator<?> generator;
    private JsonGenerator gen;
    private SerializerProvider provider;
    @SuppressWarnings("unchecked")
    private JsonSerializer<Object> serializer;
    private SerializableString propertyName;

    private WritableObjectId target;

    @Before
    @SuppressWarnings("unchecked")
    public void setUp() {
        generator = mock(ObjectIdGenerator.class);
        gen = mock(JsonGenerator.class);
        provider = mock(SerializerProvider.class);
        serializer = mock(JsonSerializer.class);
        propertyName = mock(SerializableString.class);

        target = new WritableObjectId(generator);
    }

    // Helper to build ObjectIdWriter using the package-visible protected constructor
    private ObjectIdWriter buildWriter(SerializableString name,
            JsonSerializer<?> ser, boolean alwaysAsId) {
        // JavaType and ObjectIdWriter's own generator field are not used by
        // WritableObjectId's logic, so passing null is safe and does not
        // fabricate any untested behavior.
        JavaType nullType = null;
        ObjectIdGenerator<?> nullGen = null;
        return new ObjectIdWriter(nullType, name, nullGen, ser, alwaysAsId);
    }

    // ---------------------------------------------------------------
    // writeAsId() tests
    // ---------------------------------------------------------------

    @Test
    public void writeAsId_idIsNull_returnsFalse() throws IOException {
        // id == null -> whole condition false regardless of idWritten/alwaysAsId
        target.id = null;
        ObjectIdWriter w = buildWriter(propertyName, serializer, true);

        boolean result = target.writeAsId(gen, provider, w);

        assertFalse(result);
        verifyNoMoreInteractions(gen);
        verifyZeroInteractions(serializer);
    }

    @Test
    public void writeAsId_idNotNull_idWrittenFalse_alwaysAsIdFalse_returnsFalse() throws IOException {
        // id != null but (idWritten=false || alwaysAsId=false) -> overall false
        target.id = "someId";
        target.idWritten = false;
        ObjectIdWriter w = buildWriter(propertyName, serializer, false);

        boolean result = target.writeAsId(gen, provider, w);

        assertFalse(result);
        verifyZeroInteractions(serializer);
        verify(gen, never()).writeObjectRef(anyString());
    }

    @Test
    public void writeAsId_idNotNull_idWrittenTrue_canWriteObjectIdTrue_usesNativeRef() throws IOException {
        // id != null, idWritten = true -> enters branch; canWriteObjectId() = true
        target.id = 12345;
        target.idWritten = true;
        when(gen.canWriteObjectId()).thenReturn(true);
        ObjectIdWriter w = buildWriter(propertyName, serializer, false);

        boolean result = target.writeAsId(gen, provider, w);

        assertTrue(result);
        verify(gen).writeObjectRef("12345");
        verifyZeroInteractions(serializer);
    }

    @Test
    public void writeAsId_idNotNull_alwaysAsIdTrue_canWriteObjectIdFalse_usesSerializer() throws IOException {
        // id != null, alwaysAsId = true (idWritten can stay false) -> enters branch
        // canWriteObjectId() = false -> falls back to serializer
        target.id = "abc";
        target.idWritten = false;
        when(gen.canWriteObjectId()).thenReturn(false);
        ObjectIdWriter w = buildWriter(propertyName, serializer, true);

        boolean result = target.writeAsId(gen, provider, w);

        assertTrue(result);
        verify(serializer).serialize(eq("abc"), eq(gen), eq(provider));
        verify(gen, never()).writeObjectRef(anyString());
    }

    // ---------------------------------------------------------------
    // generateId() tests
    // ---------------------------------------------------------------

    @Test
    public void generateId_delegatesToGeneratorAndStoresId() {
        Object pojo = new Object();
        Object generated = "generated-id";
        when(generator.generateId(pojo)).thenReturn(generated);

        Object result = target.generateId(pojo);

        assertEquals(generated, result);
        assertEquals(generated, target.id);
        verify(generator).generateId(pojo);
    }

    @Test
    public void generateId_withNullPojo_stillDelegates() {
        // Boundary: null forPojo argument
        Object generated = "id-for-null";
        when(generator.generateId(null)).thenReturn(generated);

        Object result = target.generateId(null);

        assertEquals(generated, result);
        assertEquals(generated, target.id);
        verify(generator).generateId(null);
    }

    // ---------------------------------------------------------------
    // writeAsField() tests
    // ---------------------------------------------------------------

    @Test
    public void writeAsField_canWriteObjectIdTrue_writesNativeObjectIdAndReturnsEarly() throws IOException {
        target.id = 999;
        when(gen.canWriteObjectId()).thenReturn(true);
        ObjectIdWriter w = buildWriter(propertyName, serializer, false);

        target.writeAsField(gen, provider, w);

        assertTrue(target.idWritten); // set at very start of method
        verify(gen).writeObjectId("999");
        // Because of early return, writeFieldName/serialize must NOT be called
        verify(gen, never()).writeFieldName(any(SerializableString.class));
        verifyZeroInteractions(serializer);
    }

    @Test
    public void writeAsField_canWriteObjectIdFalse_nameNotNull_writesFieldNameAndSerializes() throws IOException {
        target.id = "field-id";
        when(gen.canWriteObjectId()).thenReturn(false);
        ObjectIdWriter w = buildWriter(propertyName, serializer, false);

        target.writeAsField(gen, provider, w);

        assertTrue(target.idWritten);
        verify(gen, never()).writeObjectId(anyString());
        verify(gen).writeFieldName(propertyName);
        verify(serializer).serialize(eq("field-id"), eq(gen), eq(provider));
    }

    @Test
    public void writeAsField_canWriteObjectIdFalse_nameNull_doesNothingFurther() throws IOException {
        target.id = "no-name-id";
        when(gen.canWriteObjectId()).thenReturn(false);
        ObjectIdWriter w = buildWriter(null, serializer, false); // propertyName == null

        target.writeAsField(gen, provider, w);

        assertTrue(target.idWritten);
        verify(gen, never()).writeObjectId(anyString());
        verify(gen, never()).writeFieldName(any(SerializableString.class));
        verifyZeroInteractions(serializer);
    }
}
```

## ตารางสรุปความครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `writeAsId_idIsNull_returnsFalse` | `writeAsId`: `id == null` → compound condition false, return false |
| `writeAsId_idNotNull_idWrittenFalse_alwaysAsIdFalse_returnsFalse` | `writeAsId`: `id != null`, `idWritten=false \|\| alwaysAsId=false` → false, return false |
| `writeAsId_idNotNull_idWrittenTrue_canWriteObjectIdTrue_usesNativeRef` | `writeAsId`: เข้า if branch ผ่าน `idWritten=true`, `canWriteObjectId()=true` → `writeObjectRef` |
| `writeAsId_idNotNull_alwaysAsIdTrue_canWriteObjectIdFalse_usesSerializer` | `writeAsId`: เข้า if branch ผ่าน `alwaysAsId=true`, `canWriteObjectId()=false` → `serializer.serialize` |
| `generateId_delegatesToGeneratorAndStoresId` | `generateId`: กรณีปกติ, ตรวจ side-effect การ set `id` |
| `generateId_withNullPojo_stillDelegates` | `generateId`: boundary case `forPojo == null` |
| `writeAsField_canWriteObjectIdTrue_writesNativeObjectIdAndReturnsEarly` | `writeAsField`: `canWriteObjectId()=true` → early return, ตรวจ `idWritten` ถูกตั้งก่อนเสมอ |
| `writeAsField_canWriteObjectIdFalse_nameNotNull_writesFieldNameAndSerializes` | `writeAsField`: `canWriteObjectId()=false`, `name != null` → writeFieldName + serialize |
| `writeAsField_canWriteObjectIdFalse_nameNull_doesNothingFurther` | `writeAsField`: `canWriteObjectId()=false`, `name == null` → ไม่มี side-effect เพิ่ม |

**หมายเหตุ:** ไม่มีการเดา behavior เพิ่มเติมนอกจาก source ที่ให้มา; ค่า `null` ที่ใช้กับ `JavaType`/`ObjectIdWriter.generator` ในการสร้าง `ObjectIdWriter` เนื่องจาก field เหล่านั้นไม่ถูกใช้งานในเมธอดที่ทดสอบของ `WritableObjectId`