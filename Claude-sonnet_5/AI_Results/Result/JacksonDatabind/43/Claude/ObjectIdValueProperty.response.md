# แนวทางการทดสอบ

จากการวิเคราะห์ซอร์สโค้ด `ObjectIdValueProperty` พบว่า logic หลักอยู่ที่:
- `deserializeSetAndReturn` (branch: id==null / idProp==null / idProp!=null)
- `setAndReturn` (branch: idProp==null → throw / idProp!=null → delegate)
- `withName`, `withValueDeserializer` (copy constructor, ตรวจสอบว่า `_objectIdReader` ถูกส่งต่อ)
- `getAnnotation`, `getMember` (คงที่ return null)

เนื่องจากคลาสพึ่งพา `ObjectIdReader` (final class ในแพ็กเกจเดียวกัน) และ dependency อื่น ๆ จำนวนมาก จึงใช้ Mockito mock สำหรับ interface/abstract class ทั้งหมด และสร้าง `ObjectIdReader` ผ่าน static factory `construct(...)` ตามที่ต้องมีอยู่จริง (มีคอมเมนต์กำกับความไม่แน่ใจไว้แล้ว)

```java
package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;

/**
 * Unit tests สำหรับ {@link ObjectIdValueProperty}
 *
 * หมายเหตุ (สมมติฐานที่ไม่สามารถยืนยันได้ 100% จากซอร์สที่ให้มา เนื่องจากไม่มีซอร์สของ
 * ObjectIdReader / PropertyMetadata ตรง ๆ แต่จำเป็นต้องใช้เพื่อสร้าง instance):
 *  - ObjectIdReader อยู่ package เดียวกัน (ไม่มี import ในซอร์สต้นฉบับ) และมี static factory
 *    construct(JavaType, PropertyName, ObjectIdGenerator<?>, JsonDeserializer<?>,
 *              SettableBeanProperty, ObjectIdResolver)
 *  - PropertyMetadata มี static instance ชื่อ STD_REQUIRED_OR_OPTIONAL ใช้แทน metadata ทั่วไปได้
 *  - ObjectIdReader มี field ชื่อ propertyName/generator/resolver/idProperty ตามที่ใช้ตรง ๆ
 *    ในซอร์สต้นฉบับ (objectIdReader.propertyName, .generator, .resolver, .idProperty)
 * เนื่องจากคลาสนี้อยู่ package เดียวกับคลาสทดสอบ จึงสามารถเข้าถึง field ที่เป็น
 * protected/package-private ได้โดยตรง (เช่น _objectIdReader) เพื่อยืนยันพฤติกรรม
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class ObjectIdValuePropertyTest {

    private JsonDeserializer idDeserializer;
    private ObjectIdGenerator generator;
    private ObjectIdResolver resolver;
    private JavaType idType;
    private PropertyName propName;
    private JsonParser mockParser;
    private DeserializationContext mockCtxt;
    private PropertyMetadata metadata;

    @Before
    public void setUp() {
        idDeserializer = mock(JsonDeserializer.class);
        generator = mock(ObjectIdGenerator.class);
        resolver = mock(ObjectIdResolver.class);
        idType = mock(JavaType.class);
        propName = new PropertyName("@id");
        mockParser = mock(JsonParser.class);
        mockCtxt = mock(DeserializationContext.class);
        metadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
    }

    private ObjectIdReader buildReader(JsonDeserializer<?> deser, SettableBeanProperty idProp) {
        return ObjectIdReader.construct(idType, propName, generator, deser, idProp, resolver);
    }

    // ---------- constructor / field storage ----------

    @Test
    public void testConstructorStoresObjectIdReader() {
        ObjectIdReader reader = buildReader(idDeserializer, null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, metadata);
        assertSame(reader, prop._objectIdReader);
    }

    // ---------- getAnnotation / getMember (คงที่ return null) ----------

    @Test
    public void testGetAnnotationAlwaysNull() {
        ObjectIdValueProperty prop = new ObjectIdValueProperty(buildReader(idDeserializer, null), metadata);
        assertNull(prop.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetMemberAlwaysNull() {
        ObjectIdValueProperty prop = new ObjectIdValueProperty(buildReader(idDeserializer, null), metadata);
        assertNull(prop.getMember());
    }

    // ---------- withName / withValueDeserializer ----------

    @Test
    public void testWithNameReturnsNewInstanceKeepingSameObjectIdReader() {
        ObjectIdReader reader = buildReader(idDeserializer, null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, metadata);

        ObjectIdValueProperty renamed = prop.withName(new PropertyName("newName"));

        assertNotSame(prop, renamed);
        assertSame(reader, renamed._objectIdReader);
    }

    @Test
    public void testWithValueDeserializerReturnsNewInstanceKeepingSameObjectIdReader() {
        ObjectIdReader reader = buildReader(idDeserializer, null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, metadata);

        JsonDeserializer newDeser = mock(JsonDeserializer.class);
        ObjectIdValueProperty updated = prop.withValueDeserializer(newDeser);

        assertNotSame(prop, updated);
        assertSame(reader, updated._objectIdReader);
    }

    @Test
    public void testWithValueDeserializerActuallyUsesNewDeserializerOnDeserialize() throws IOException {
        ObjectIdReader reader = buildReader(idDeserializer, null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, metadata);

        JsonDeserializer newDeser = mock(JsonDeserializer.class);
        when(newDeser.deserialize(mockParser, mockCtxt)).thenReturn(null);

        ObjectIdValueProperty updated = prop.withValueDeserializer(newDeser);
        Object result = updated.deserializeSetAndReturn(mockParser, mockCtxt, new Object());

        assertNull(result);
        verify(newDeser).deserialize(mockParser, mockCtxt);
        verify(idDeserializer, never()).deserialize(any(JsonParser.class), any(DeserializationContext.class));
    }

    // ---------- deserializeAndSet / deserializeSetAndReturn ----------

    @Test
    public void testDeserializeSetAndReturnNullIdSkipsFindObjectIdAndReturnsNull() throws IOException {
        when(idDeserializer.deserialize(mockParser, mockCtxt)).thenReturn(null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(buildReader(idDeserializer, null), metadata);

        Object result = prop.deserializeSetAndReturn(mockParser, mockCtxt, new Object());

        assertNull(result);
        verify(mockCtxt, never()).findObjectId(any(), any(ObjectIdGenerator.class), any(ObjectIdResolver.class));
    }

    @Test
    public void testDeserializeSetAndReturnEmptyStringIdIsNotTreatedAsNull() throws IOException {
        Object idValue = ""; // boundary: ว่างแต่ไม่ null -> ไม่เข้า branch id==null
        when(idDeserializer.deserialize(mockParser, mockCtxt)).thenReturn(idValue);
        ReadableObjectId roid = mock(ReadableObjectId.class);
        when(mockCtxt.findObjectId(eq(idValue), eq(generator), eq(resolver))).thenReturn(roid);

        ObjectIdValueProperty prop = new ObjectIdValueProperty(buildReader(idDeserializer, null), metadata);
        Object instance = new Object();

        Object result = prop.deserializeSetAndReturn(mockParser, mockCtxt, instance);

        assertSame(instance, result);
        verify(roid).bindItem(instance);
    }

    @Test
    public void testDeserializeSetAndReturnWithIdPropertyNullReturnsInstance() throws IOException {
        Object idValue = "abc";
        when(idDeserializer.deserialize(mockParser, mockCtxt)).thenReturn(idValue);
        ReadableObjectId roid = mock(ReadableObjectId.class);
        when(mockCtxt.findObjectId(eq(idValue), eq(generator), eq(resolver))).thenReturn(roid);

        ObjectIdValueProperty prop = new ObjectIdValueProperty(buildReader(idDeserializer, null), metadata);
        Object instance = new Object();

        Object result = prop.deserializeSetAndReturn(mockParser, mockCtxt, instance);

        assertSame(instance, result);
        verify(roid).bindItem(instance);
    }

    @Test
    public void testDeserializeSetAndReturnWithIdPropertyPresentDelegatesAndReturnsItsResult() throws IOException {
        Object idValue = "abc";
        when(idDeserializer.deserialize(mockParser, mockCtxt)).thenReturn(idValue);
        ReadableObjectId roid = mock(ReadableObjectId.class);
        when(mockCtxt.findObjectId(eq(idValue), eq(generator), eq(resolver))).thenReturn(roid);

        SettableBeanProperty idProp = mock(SettableBeanProperty.class);
        Object expected = new Object();
        Object instance = new Object();
        when(idProp.setAndReturn(instance, idValue)).thenReturn(expected);

        ObjectIdValueProperty prop = new ObjectIdValueProperty(buildReader(idDeserializer, idProp), metadata);

        Object result = prop.deserializeSetAndReturn(mockParser, mockCtxt, instance);

        assertSame(expected, result);
        verify(roid).bindItem(instance);
        verify(idProp).setAndReturn(instance, idValue);
    }

    @Test
    public void testDeserializeAndSetDelegatesToDeserializeSetAndReturn() throws IOException {
        Object idValue = "id-1";
        when(idDeserializer.deserialize(mockParser, mockCtxt)).thenReturn(idValue);
        ReadableObjectId roid = mock(ReadableObjectId.class);
        when(mockCtxt.findObjectId(eq(idValue), eq(generator), eq(resolver))).thenReturn(roid);

        ObjectIdValueProperty prop = new ObjectIdValueProperty(buildReader(idDeserializer, null), metadata);
        Object instance = new Object();

        prop.deserializeAndSet(mockParser, mockCtxt, instance);

        verify(roid).bindItem(instance);
    }

    @Test(expected = IOException.class)
    public void testDeserializeSetAndReturnPropagatesIOExceptionFromDeserializer() throws IOException {
        // อินพุตผิดรูปแบบ -> deserializer ปกติควร throw ตาม comment ในซอร์ส
        when(idDeserializer.deserialize(mockParser, mockCtxt)).thenThrow(new IOException("malformed input"));
        ObjectIdValueProperty prop = new ObjectIdValueProperty(buildReader(idDeserializer, null), metadata);

        prop.deserializeSetAndReturn(mockParser, mockCtxt, new Object());
    }

    // ---------- set / setAndReturn ----------

    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturnThrowsWhenIdPropertyIsNull() throws IOException {
        ObjectIdValueProperty prop = new ObjectIdValueProperty(buildReader(idDeserializer, null), metadata);
        prop.setAndReturn(new Object(), "value");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetThrowsWhenIdPropertyIsNull() throws IOException {
        ObjectIdValueProperty prop = new ObjectIdValueProperty(buildReader(idDeserializer, null), metadata);
        prop.set(new Object(), "value");
    }

    @Test
    public void testSetAndReturnDelegatesToIdPropertyWhenPresent() throws IOException {
        SettableBeanProperty idProp = mock(SettableBeanProperty.class);
        Object instance = new Object();
        Object value = "v";
        Object expected = new Object();
        when(idProp.setAndReturn(instance, value)).thenReturn(expected);

        ObjectIdValueProperty prop = new ObjectIdValueProperty(buildReader(idDeserializer, idProp), metadata);

        Object result = prop.setAndReturn(instance, value);

        assertSame(expected, result);
        verify(idProp).setAndReturn(instance, value);
    }

    @Test
    public void testSetDelegatesToIdPropertyWhenPresent() throws IOException {
        SettableBeanProperty idProp = mock(SettableBeanProperty.class);
        Object instance = new Object();
        Object value = "v2";
        when(idProp.setAndReturn(instance, value)).thenReturn(new Object());

        ObjectIdValueProperty prop = new ObjectIdValueProperty(buildReader(idDeserializer, idProp), metadata);

        prop.set(instance, value);

        verify(idProp).setAndReturn(instance, value);
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructorStoresObjectIdReader` | Constructor หลัก เก็บ `_objectIdReader` ถูกต้อง |
| `testGetAnnotationAlwaysNull` | `getAnnotation` return null เสมอ |
| `testGetMemberAlwaysNull` | `getMember` return null เสมอ |
| `testWithNameReturnsNewInstanceKeepingSameObjectIdReader` | `withName` → copy constructor (PropertyName variant), instance ใหม่, `_objectIdReader` เดิม |
| `testWithValueDeserializerReturnsNewInstanceKeepingSameObjectIdReader` | `withValueDeserializer` → copy constructor (Deserializer variant), `_objectIdReader` เดิม |
| `testWithValueDeserializerActuallyUsesNewDeserializerOnDeserialize` | ยืนยันว่า deserializer ใหม่ถูกใช้จริงหลัง `withValueDeserializer` |
| `testDeserializeSetAndReturnNullIdSkipsFindObjectIdAndReturnsNull` | branch `id == null` → return null, ไม่เรียก `findObjectId` |
| `testDeserializeSetAndReturnEmptyStringIdIsNotTreatedAsNull` | boundary: id เป็น empty string (ไม่ null) → ไม่เข้า branch null |
| `testDeserializeSetAndReturnWithIdPropertyNullReturnsInstance` | branch `idProp == null` → return instance เดิม, `bindItem` ถูกเรียก |
| `testDeserializeSetAndReturnWithIdPropertyPresentDelegatesAndReturnsItsResult` | branch `idProp != null` → delegate `setAndReturn`, return ค่าจาก idProp |
| `testDeserializeAndSetDelegatesToDeserializeSetAndReturn` | `deserializeAndSet` เรียก `deserializeSetAndReturn` ภายใน (ผ่าน side-effect `bindItem`) |
| `testDeserializeSetAndReturnPropagatesIOExceptionFromDeserializer` | อินพุตผิดรูปแบบ → exception จาก deserializer ถูก propagate |
| `testSetAndReturnThrowsWhenIdPropertyIsNull` | branch `idProp == null` ใน `setAndReturn` → throw `UnsupportedOperationException` |
| `testSetThrowsWhenIdPropertyIsNull` | `set` เรียก `setAndReturn` และ throw เช่นเดียวกัน |
| `testSetAndReturnDelegatesToIdPropertyWhenPresent` | branch `idProp != null` ใน `setAndReturn` → delegate และ return ค่า |
| `testSetDelegatesToIdPropertyWhenPresent` | `set` เรียก `setAndReturn` เมื่อ idProp มีค่า (delegation path) |

**ข้อสังเกต/สมมติฐานที่ต้องตรวจสอบเพิ่มเติม:** ลายเซ็นของ `ObjectIdReader.construct(...)` และชื่อ static field `PropertyMetadata.STD_REQUIRED_OR_OPTOR_OPTIONAL` เป็นการอนุมานจากบริบทของซอร์สที่ให้มา (ไม่มีซอร์สจริงของสองคลาสนี้) หากคอมไพล์ไม่ผ่านเนื่องจากลายเซ็นต่างจากที่คาด ให้ตรวจสอบซอร์สจริงของ `ObjectIdReader`/`PropertyMetadata` ในเวอร์ชันที่ตรงกับ jar ที่ใช้แล้วปรับ helper method `buildReader` และตัวแปร `metadata` ให้ตรงกัน