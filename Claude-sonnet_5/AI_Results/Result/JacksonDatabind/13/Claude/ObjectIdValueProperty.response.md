# วิเคราะห์และแนวทางการทดสอบ

จากซอร์สโค้ด `ObjectIdValueProperty` ต้องพึ่งพา dependency ภายใน package เดียวกัน (`ObjectIdReader`, `ReadableObjectId`) และ superclass (`SettableBeanProperty`) ที่**ไม่ได้แสดงซอร์สในโจทย์** ผมจึงใช้แนวทางดังนี้ พร้อมคอมเมนต์กำกับส่วนที่ต้อง "สมมติ" ตาม API มาตรฐานของ jackson-databind:

- ใช้ **Mockito.mock()** สำหรับ `ObjectIdReader`, `SettableBeanProperty`, `JsonDeserializer`, `DeserializationContext`, `JsonParser` (คลาส abstract/interface เหล่านี้ mock ได้ปลอดภัย)
- ใช้ **reflection** เพื่อ set field `propertyName`/`idProperty` ของ `ObjectIdReader` เพราะไม่ทราบว่า field เป็น `final`/package-private หรือไม่ (ป้องกัน compile error)
- ใช้ `new ReadableObjectId(id)` โดยสมมติว่ามี public constructor รับ `Object id` ตาม pattern มาตรฐานของ jackson-databind (คอมเมนต์กำกับไว้)
- ใช้ `PropertyMetadata.STD_OPTIONAL`, `TypeFactory.defaultInstance().constructType(...)` ซึ่งเป็น API มาตรฐานที่มีในทุกเวอร์ชันของ jackson-databind

```java
package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.lang.annotation.Deprecated;
import java.lang.annotation.Retention;
import java.lang.reflect.Field;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * หมายเหตุสำคัญ (ตามข้อกำหนดห้ามเดา behavior ที่ไม่มีในซอร์ส):
 * - ObjectIdReader, ReadableObjectId ไม่ได้แสดงซอร์สในโจทย์ จึงใช้ Mockito mock
 *   หรือสร้าง instance จริงโดยอิงจาก public API ที่ "ถูกเรียกใช้จริง" ในซอร์สของ
 *   ObjectIdValueProperty เท่านั้น (propertyName, generator, resolver, idProperty,
 *   getIdType(), getDeserializer(), findObjectId(), bindItem())
 * - สมมติว่า ObjectIdReader ไม่ใช่ final class (จำเป็นสำหรับ Mockito mock)
 * - สมมติว่า ReadableObjectId มี public constructor รับ Object (ตาม pattern มาตรฐาน)
 * - ใช้ reflection ในการ set field ของ ObjectIdReader เพื่อลดความเสี่ยงเรื่อง
 *   final/visibility ของ field ที่ไม่ทราบแน่ชัด
 */
public class ObjectIdValuePropertyTest {

    private ObjectIdReader mockReader;
    private JsonDeserializer<Object> mockValueDeserializer;
    private JavaType idJavaType;
    private PropertyMetadata metadata;

    @Before
    public void setUp() {
        idJavaType = TypeFactory.defaultInstance().constructType(String.class);
        mockValueDeserializer = mock(JsonDeserializer.class);

        mockReader = mock(ObjectIdReader.class);
        setField(mockReader, "propertyName", new PropertyName("id"));
        when(mockReader.getIdType()).thenReturn(idJavaType);
        when(mockReader.getDeserializer()).thenReturn(mockValueDeserializer);

        // สมมติว่า PropertyMetadata มี static field STD_OPTIONAL (มีในซอร์ส jackson-databind ทั่วไป)
        metadata = PropertyMetadata.STD_OPTIONAL;
    }

    /** helper: ตั้งค่า field ผ่าน reflection เพื่อลดความเสี่ยงเรื่อง final/visibility */
    private static void setField(Object target, String fieldName, Object value) {
        Class<?> cls = target.getClass();
        while (cls != null) {
            try {
                Field f = cls.getDeclaredField(fieldName);
                f.setAccessible(true);
                f.set(target, value);
                return;
            } catch (NoSuchFieldException e) {
                cls = cls.getSuperclass();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        throw new RuntimeException("Field '" + fieldName + "' not found in " + target.getClass());
    }

    private ObjectIdValueProperty newProperty(SettableBeanProperty idProp) {
        setField(mockReader, "idProperty", idProp);
        return new ObjectIdValueProperty(mockReader, metadata);
    }

    // ---------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------

    @Test
    public void testConstructorBasic() {
        ObjectIdValueProperty prop = newProperty(null);
        assertNotNull(prop);
        assertSame(mockReader, prop._objectIdReader);
    }

    // boundary/null case: objectIdReader == null -> ควร throw NPE
    // (ตรงกับ super(objectIdReader.propertyName, ...) ที่ access field ทันที)
    @Test(expected = NullPointerException.class)
    public void testConstructorNullReaderThrowsNPE() {
        new ObjectIdValueProperty(null, metadata);
    }

    // ---------------------------------------------------------------
    // withName
    // ---------------------------------------------------------------

    @Test
    public void testWithNameReturnsNewInstanceWithSameReader() {
        ObjectIdValueProperty prop = newProperty(null);
        PropertyName newName = new PropertyName("newName");

        ObjectIdValueProperty renamed = prop.withName(newName);

        assertNotNull(renamed);
        assertNotSame(prop, renamed);
        assertSame(prop._objectIdReader, renamed._objectIdReader);
    }

    // ---------------------------------------------------------------
    // withValueDeserializer
    // ---------------------------------------------------------------

    @Test
    public void testWithValueDeserializerReturnsNewInstanceWithSameReader() {
        ObjectIdValueProperty prop = newProperty(null);
        JsonDeserializer<Object> newDeser = mock(JsonDeserializer.class);

        ObjectIdValueProperty updated = prop.withValueDeserializer(newDeser);

        assertNotNull(updated);
        assertNotSame(prop, updated);
        assertSame(prop._objectIdReader, updated._objectIdReader);
    }

    // ---------------------------------------------------------------
    // getAnnotation - ไม่มี branch แต่ต้องยืนยันว่า return null เสมอ
    // ---------------------------------------------------------------

    @Test
    public void testGetAnnotationAlwaysNull() {
        ObjectIdValueProperty prop = newProperty(null);
        assertNull(prop.getAnnotation(Deprecated.class));
        assertNull(prop.getAnnotation(Retention.class));
    }

    // edge case: null argument
    @Test
    public void testGetAnnotationWithNullArgument() {
        ObjectIdValueProperty prop = newProperty(null);
        assertNull(prop.getAnnotation(null));
    }

    // ---------------------------------------------------------------
    // getMember
    // ---------------------------------------------------------------

    @Test
    public void testGetMemberAlwaysNull() {
        ObjectIdValueProperty prop = newProperty(null);
        assertNull(prop.getMember());
    }

    // ---------------------------------------------------------------
    // setAndReturn: idProp == null -> throw UnsupportedOperationException
    // ---------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturnThrowsWhenIdPropertyNull() throws IOException {
        ObjectIdValueProperty prop = newProperty(null);
        prop.setAndReturn(new Object(), "someValue");
    }

    // ---------------------------------------------------------------
    // setAndReturn: idProp != null -> delegate
    // ---------------------------------------------------------------

    @Test
    public void testSetAndReturnDelegatesWhenIdPropertyPresent() throws IOException {
        SettableBeanProperty idProp = mock(SettableBeanProperty.class);
        Object instance = new Object();
        Object value = "theValue";
        Object expected = "resultObj";
        when(idProp.setAndReturn(instance, value)).thenReturn(expected);

        ObjectIdValueProperty prop = newProperty(idProp);
        Object result = prop.setAndReturn(instance, value);

        assertSame(expected, result);
        verify(idProp).setAndReturn(instance, value);
    }

    // ---------------------------------------------------------------
    // set(): delegate ไป setAndReturn
    // ---------------------------------------------------------------

    @Test
    public void testSetDelegatesToSetAndReturnWhenIdPropertyPresent() throws IOException {
        SettableBeanProperty idProp = mock(SettableBeanProperty.class);
        Object instance = new Object();
        Object value = "v";
        when(idProp.setAndReturn(instance, value)).thenReturn("ignored");

        ObjectIdValueProperty prop = newProperty(idProp);
        prop.set(instance, value); // ไม่ควร throw

        verify(idProp).setAndReturn(instance, value);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetThrowsWhenIdPropertyNull() throws IOException {
        ObjectIdValueProperty prop = newProperty(null);
        prop.set(new Object(), "v");
    }

    // ---------------------------------------------------------------
    // deserializeSetAndReturn: idProp == null -> return instance เดิม
    // ---------------------------------------------------------------

    @Test
    public void testDeserializeSetAndReturn_IdPropertyNull_ReturnsInstance() throws IOException {
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object instance = new Object();
        Object deserializedId = "raw-id-value";

        when(mockValueDeserializer.deserialize(jp, ctxt)).thenReturn(deserializedId);

        // สมมติ constructor สาธารณะของ ReadableObjectId รับ Object id
        ReadableObjectId roid = new ReadableObjectId(deserializedId);
        when(ctxt.findObjectId(any(), any(), any())).thenReturn(roid);

        ObjectIdValueProperty prop = newProperty(null);
        Object result = prop.deserializeSetAndReturn(jp, ctxt, instance);

        assertSame(instance, result);
    }

    // boundary/null case: id ที่ deserialize ได้เป็น null -> ตาม comment ในซอร์ส
    // "missing or null id is needed for some cases" ควรทำงานได้โดยไม่ throw
    @Test
    public void testDeserializeSetAndReturn_NullId_Allowed() throws IOException {
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object instance = new Object();

        when(mockValueDeserializer.deserialize(jp, ctxt)).thenReturn(null);
        ReadableObjectId roid = new ReadableObjectId(null);
        when(ctxt.findObjectId(any(), any(), any())).thenReturn(roid);

        ObjectIdValueProperty prop = newProperty(null);
        Object result = prop.deserializeSetAndReturn(jp, ctxt, instance);

        assertSame(instance, result);
    }

    // ---------------------------------------------------------------
    // deserializeSetAndReturn: idProp != null -> delegate ไป idProp.setAndReturn
    // ---------------------------------------------------------------

    @Test
    public void testDeserializeSetAndReturn_IdPropertyPresent_DelegatesResult() throws IOException {
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object instance = new Object();
        Object deserializedId = "id-2";
        Object expectedResult = "delegatedResult";

        when(mockValueDeserializer.deserialize(jp, ctxt)).thenReturn(deserializedId);
        ReadableObjectId roid = new ReadableObjectId(deserializedId);
        when(ctxt.findObjectId(any(), any(), any())).thenReturn(roid);

        SettableBeanProperty idProp = mock(SettableBeanProperty.class);
        when(idProp.setAndReturn(instance, deserializedId)).thenReturn(expectedResult);

        ObjectIdValueProperty prop = newProperty(idProp);
        Object result = prop.deserializeSetAndReturn(jp, ctxt, instance);

        assertSame(expectedResult, result);
        verify(idProp).setAndReturn(instance, deserializedId);
    }

    // ---------------------------------------------------------------
    // deserializeAndSet: delegate ไป deserializeSetAndReturn (void wrapper)
    // ---------------------------------------------------------------

    @Test
    public void testDeserializeAndSet_NoException_IdPropertyNull() throws IOException {
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object instance = new Object();
        Object deserializedId = "id-3";

        when(mockValueDeserializer.deserialize(jp, ctxt)).thenReturn(deserializedId);
        ReadableObjectId roid = new ReadableObjectId(deserializedId);
        when(ctxt.findObjectId(any(), any(), any())).thenReturn(roid);

        ObjectIdValueProperty prop = newProperty(null);
        prop.deserializeAndSet(jp, ctxt, instance); // ต้องไม่ throw
    }

    @Test
    public void testDeserializeAndSet_IdPropertyPresent_DelegatesCall() throws IOException {
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object instance = new Object();
        Object deserializedId = "id-4";

        when(mockValueDeserializer.deserialize(jp, ctxt)).thenReturn(deserializedId);
        ReadableObjectId roid = new ReadableObjectId(deserializedId);
        when(ctxt.findObjectId(any(), any(), any())).thenReturn(roid);

        SettableBeanProperty idProp = mock(SettableBeanProperty.class);
        when(idProp.setAndReturn(instance, deserializedId)).thenReturn("whatever");

        ObjectIdValueProperty prop = newProperty(idProp);
        prop.deserializeAndSet(jp, ctxt, instance);

        verify(idProp).setAndReturn(instance, deserializedId);
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructorBasic` | constructor ปกติ, ตรวจ `_objectIdReader` ถูก assign |
| `testConstructorNullReaderThrowsNPE` | boundary/null: `objectIdReader == null` → NPE จาก field access ใน `super(...)` |
| `testWithNameReturnsNewInstanceWithSameReader` | `withName()` — สร้าง instance ใหม่, ตรวจ `_objectIdReader` เดิม |
| `testWithValueDeserializerReturnsNewInstanceWithSameReader` | `withValueDeserializer()` — สร้าง instance ใหม่ |
| `testGetAnnotationAlwaysNull` | `getAnnotation()` — return null เสมอ (ไม่มี branch) |
| `testGetAnnotationWithNullArgument` | edge case: argument = null |
| `testGetMemberAlwaysNull` | `getMember()` — return null เสมอ |
| `testSetAndReturnThrowsWhenIdPropertyNull` | `setAndReturn()` branch **idProp == null** → throw `UnsupportedOperationException` |
| `testSetAndReturnDelegatesWhenIdPropertyPresent` | `setAndReturn()` branch **idProp != null** → delegate |
| `testSetDelegatesToSetAndReturnWhenIdPropertyPresent` | `set()` → เรียก `setAndReturn` (branch idProp != null) |
| `testSetThrowsWhenIdPropertyNull` | `set()` → เรียก `setAndReturn` (branch idProp == null → throw) |
| `testDeserializeSetAndReturn_IdPropertyNull_ReturnsInstance` | `deserializeSetAndReturn()` branch **idProp == null** → return instance |
| `testDeserializeSetAndReturn_NullId_Allowed` | boundary/null: id ที่ deserialize ได้เป็น null (ตาม comment ในซอร์ส) |
| `testDeserializeSetAndReturn_IdPropertyPresent_DelegatesResult` | `deserializeSetAndReturn()` branch **idProp != null** → delegate ไป `idProp.setAndReturn` |
| `testDeserializeAndSet_NoException_IdPropertyNull` | `deserializeAndSet()` → เรียก `deserializeSetAndReturn` (branch idProp == null) |
| `testDeserializeAndSet_IdPropertyPresent_DelegatesCall` | `deserializeAndSet()` → เรียก `deserializeSetAndReturn` (branch idProp != null) |

**หมายเหตุ:** deprecated constructor `ObjectIdValueProperty(src, String newName)` เป็น `protected` และไม่ถูกเรียกจาก public API ใด ๆ ในซอร์สที่ให้มา (ไม่มี branch ภายใน เป็นแค่ delegation) จึงไม่ได้เขียนเทสตรงเพื่อหลีกเลี่ยงการเข้าถึงผ่าน reflection โดยไม่จำเป็น