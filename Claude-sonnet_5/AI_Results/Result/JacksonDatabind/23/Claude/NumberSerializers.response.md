# NumberSerializersTest.java

**หมายเหตุสำคัญ:** วางคลาสทดสอบไว้ใน package เดียวกับคลาสเป้าหมาย (`com.fasterxml.jackson.databind.ser.std`) เพื่อให้สามารถอ้างอิง static field ที่เป็น *package-private* (เช่น `ShortSerializer.instance`, `LongSerializer.instance` ฯลฯ) ได้โดยตรง ซึ่งจำเป็นสำหรับตรวจสอบ behavior ของ `addAll()` ตามซอร์สจริง โดยไม่ต้องเดา behavior เพิ่มเติม

```java
package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;

/**
 * Unit tests for {@link NumberSerializers} (Defects4J JacksonDatabind-23b).
 * ทดสอบ addAll(), serialize()/serializeWithType() ของแต่ละ serializer,
 * และ Base.acceptJsonFormatVisitor()/createContextual()/getSchema()
 */
public class NumberSerializersTest
{
    // =========================================================
    // addAll()
    // =========================================================

    @Test
    public void testAddAll_ContainsAllExpectedEntriesWithCorrectTypesAndSharedInstances()
    {
        Map<String, JsonSerializer<?>> map = new HashMap<String, JsonSerializer<?>>();
        NumberSerializers.addAll(map);

        assertEquals(12, map.size());

        // Integer: instance เดียวกัน (intS) ถูกใช้ทั้ง class และ primitive type
        JsonSerializer<?> intClassSer = map.get(Integer.class.getName());
        JsonSerializer<?> intTypeSer  = map.get(Integer.TYPE.getName());
        assertTrue(intClassSer instanceof NumberSerializers.IntegerSerializer);
        assertSame(intClassSer, intTypeSer);

        // Long: ใช้ shared static instance
        assertSame(NumberSerializers.LongSerializer.instance, map.get(Long.class.getName()));
        assertSame(NumberSerializers.LongSerializer.instance, map.get(Long.TYPE.getName()));

        // Byte -> IntLikeSerializer shared instance
        assertSame(NumberSerializers.IntLikeSerializer.instance, map.get(Byte.class.getName()));
        assertSame(NumberSerializers.IntLikeSerializer.instance, map.get(Byte.TYPE.getName()));

        // Short shared instance
        assertSame(NumberSerializers.ShortSerializer.instance, map.get(Short.class.getName()));
        assertSame(NumberSerializers.ShortSerializer.instance, map.get(Short.TYPE.getName()));

        // Float shared instance
        assertSame(NumberSerializers.FloatSerializer.instance, map.get(Float.class.getName()));
        assertSame(NumberSerializers.FloatSerializer.instance, map.get(Float.TYPE.getName()));

        // Double shared instance
        assertSame(NumberSerializers.DoubleSerializer.instance, map.get(Double.class.getName()));
        assertSame(NumberSerializers.DoubleSerializer.instance, map.get(Double.TYPE.getName()));
    }

    // =========================================================
    // ShortSerializer.serialize
    // =========================================================

    @Test
    public void testShortSerializer_SerializeTypicalValue() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.ShortSerializer ser = new NumberSerializers.ShortSerializer();

        ser.serialize((short) 42, gen, provider);

        verify(gen).writeNumber((short) 42);
    }

    @Test
    public void testShortSerializer_SerializeBoundaryValues() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.ShortSerializer ser = new NumberSerializers.ShortSerializer();

        ser.serialize(Short.MIN_VALUE, gen, provider);
        ser.serialize(Short.MAX_VALUE, gen, provider);

        verify(gen).writeNumber(Short.MIN_VALUE);
        verify(gen).writeNumber(Short.MAX_VALUE);
    }

    @Test(expected = NullPointerException.class)
    public void testShortSerializer_SerializeNullValueThrowsNPE() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.ShortSerializer ser = new NumberSerializers.ShortSerializer();

        ser.serialize(null, gen, provider); // value.shortValue() -> NPE (ไม่มี null-check ในซอร์ส)
    }

    // =========================================================
    // IntegerSerializer.serialize / serializeWithType
    // =========================================================

    @Test
    public void testIntegerSerializer_SerializeTypicalValue() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer();

        ser.serialize(Integer.valueOf(123), gen, provider);

        verify(gen).writeNumber(123);
    }

    @Test
    public void testIntegerSerializer_SerializeBoundaryValues() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer();

        ser.serialize(Integer.MIN_VALUE, gen, provider);
        ser.serialize(Integer.MAX_VALUE, gen, provider);

        verify(gen).writeNumber(Integer.MIN_VALUE);
        verify(gen).writeNumber(Integer.MAX_VALUE);
    }

    @Test
    public void testIntegerSerializer_SerializeWithTypeDelegatesToSerialize() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer();

        // TypeSerializer ไม่ถูกใช้งานในเมธอด (ตามซอร์ส) -> null ปลอดภัย
        ser.serializeWithType(Integer.valueOf(7), gen, provider, null);

        verify(gen).writeNumber(7);
    }

    @Test(expected = NullPointerException.class)
    public void testIntegerSerializer_SerializeNullValueThrowsNPE() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer();

        ser.serialize(null, gen, provider);
    }

    // =========================================================
    // IntLikeSerializer.serialize
    // =========================================================

    @Test
    public void testIntLikeSerializer_SerializeUsesIntValueOfNumber() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.IntLikeSerializer ser = new NumberSerializers.IntLikeSerializer();

        ser.serialize(Byte.valueOf((byte) -7), gen, provider);

        verify(gen).writeNumber(-7);
    }

    @Test
    public void testIntLikeSerializer_SerializeBoundaryByteValues() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.IntLikeSerializer ser = new NumberSerializers.IntLikeSerializer();

        ser.serialize(Byte.MIN_VALUE, gen, provider);
        ser.serialize(Byte.MAX_VALUE, gen, provider);

        verify(gen).writeNumber((int) Byte.MIN_VALUE);
        verify(gen).writeNumber((int) Byte.MAX_VALUE);
    }

    @Test(expected = NullPointerException.class)
    public void testIntLikeSerializer_SerializeNullValueThrowsNPE() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.IntLikeSerializer ser = new NumberSerializers.IntLikeSerializer();

        ser.serialize(null, gen, provider);
    }

    // =========================================================
    // LongSerializer.serialize
    // =========================================================

    @Test
    public void testLongSerializer_SerializeTypicalValue() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.LongSerializer ser = new NumberSerializers.LongSerializer();

        ser.serialize(Long.valueOf(9999999999L), gen, provider);

        verify(gen).writeNumber(9999999999L);
    }

    @Test
    public void testLongSerializer_SerializeBoundaryValues() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.LongSerializer ser = new NumberSerializers.LongSerializer();

        ser.serialize(Long.MIN_VALUE, gen, provider);
        ser.serialize(Long.MAX_VALUE, gen, provider);

        verify(gen).writeNumber(Long.MIN_VALUE);
        verify(gen).writeNumber(Long.MAX_VALUE);
    }

    @Test(expected = NullPointerException.class)
    public void testLongSerializer_SerializeNullValueThrowsNPE() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.LongSerializer ser = new NumberSerializers.LongSerializer();

        ser.serialize(null, gen, provider);
    }

    // =========================================================
    // FloatSerializer.serialize
    // =========================================================

    @Test
    public void testFloatSerializer_SerializeTypicalValue() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.FloatSerializer ser = new NumberSerializers.FloatSerializer();

        ser.serialize(Float.valueOf(3.14f), gen, provider);

        verify(gen).writeNumber(3.14f);
    }

    @Test
    public void testFloatSerializer_SerializeSpecialValues() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.FloatSerializer ser = new NumberSerializers.FloatSerializer();

        ser.serialize(Float.NaN, gen, provider);
        ser.serialize(Float.POSITIVE_INFINITY, gen, provider);
        ser.serialize(Float.NEGATIVE_INFINITY, gen, provider);

        verify(gen).writeNumber(Float.NaN);
        verify(gen).writeNumber(Float.POSITIVE_INFINITY);
        verify(gen).writeNumber(Float.NEGATIVE_INFINITY);
    }

    @Test(expected = NullPointerException.class)
    public void testFloatSerializer_SerializeNullValueThrowsNPE() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.FloatSerializer ser = new NumberSerializers.FloatSerializer();

        ser.serialize(null, gen, provider);
    }

    // =========================================================
    // DoubleSerializer.serialize / serializeWithType
    // =========================================================

    @Test
    public void testDoubleSerializer_SerializeTypicalValue() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.DoubleSerializer ser = new NumberSerializers.DoubleSerializer();

        ser.serialize(Double.valueOf(2.718281828), gen, provider);

        verify(gen).writeNumber(2.718281828);
    }

    @Test
    public void testDoubleSerializer_SerializeSpecialValues() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.DoubleSerializer ser = new NumberSerializers.DoubleSerializer();

        ser.serialize(Double.NaN, gen, provider);
        ser.serialize(Double.POSITIVE_INFINITY, gen, provider);
        ser.serialize(Double.NEGATIVE_INFINITY, gen, provider);

        verify(gen).writeNumber(Double.NaN);
        verify(gen).writeNumber(Double.POSITIVE_INFINITY);
        verify(gen).writeNumber(Double.NEGATIVE_INFINITY);
    }

    @Test
    public void testDoubleSerializer_SerializeWithTypeDelegatesToSerialize() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.DoubleSerializer ser = new NumberSerializers.DoubleSerializer();

        ser.serializeWithType(Double.valueOf(1.5), gen, provider, null);

        verify(gen).writeNumber(1.5);
    }

    @Test(expected = NullPointerException.class)
    public void testDoubleSerializer_SerializeNullValueThrowsNPE() throws Exception
    {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.DoubleSerializer ser = new NumberSerializers.DoubleSerializer();

        ser.serialize(null, gen, provider);
    }

    // =========================================================
    // Base.getSchema()
    // =========================================================
    // หมายเหตุ: createSchemaNode() ไม่มีอยู่ในซอร์สที่ให้มา (สืบทอดจากคลาสฐาน)
    // จึงตรวจสอบเพียงว่าไม่ null เพื่อไม่เดา behavior ภายใน

    @Test
    public void testGetSchema_ReturnsNonNullNode_ForIntType()
    {
        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer();
        JsonNode schema = ser.getSchema(null, null);
        assertNotNull(schema);
    }

    @Test
    public void testGetSchema_ReturnsNonNullNode_ForNonIntType()
    {
        NumberSerializers.DoubleSerializer ser = new NumberSerializers.DoubleSerializer();
        JsonNode schema = ser.getSchema(null, null);
        assertNotNull(schema);
    }

    // =========================================================
    // Base.acceptJsonFormatVisitor() : _isInt == true branch
    // =========================================================

    @Test
    public void testAcceptJsonFormatVisitor_IntBranch_VisitorNonNull_CallsNumberType() throws Exception
    {
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = mock(JavaType.class);
        JsonIntegerFormatVisitor intVisitor = mock(JsonIntegerFormatVisitor.class);
        when(visitor.expectIntegerFormat(typeHint)).thenReturn(intVisitor);

        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer(); // NumberType.INT

        ser.acceptJsonFormatVisitor(visitor, typeHint);

        verify(intVisitor).numberType(JsonParser.NumberType.INT);
        verify(visitor, never()).expectNumberFormat(any(JavaType.class));
    }

    @Test
    public void testAcceptJsonFormatVisitor_IntBranch_VisitorNull_NoExceptionAndNoNumberTypeCall() throws Exception
    {
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = mock(JavaType.class);
        when(visitor.expectIntegerFormat(typeHint)).thenReturn(null);

        NumberSerializers.LongSerializer ser = new NumberSerializers.LongSerializer(); // NumberType.LONG -> _isInt=true

        // ทดสอบ branch "if (v2 != null)" เป็น false ต้องไม่ throw NPE
        ser.acceptJsonFormatVisitor(visitor, typeHint);

        verify(visitor).expectIntegerFormat(typeHint);
    }

    // =========================================================
    // Base.acceptJsonFormatVisitor() : _isInt == false branch
    // =========================================================

    @Test
    public void testAcceptJsonFormatVisitor_NonIntBranch_VisitorNonNull_CallsNumberType() throws Exception
    {
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = mock(JavaType.class);
        JsonNumberFormatVisitor numVisitor = mock(JsonNumberFormatVisitor.class);
        when(visitor.expectNumberFormat(typeHint)).thenReturn(numVisitor);

        NumberSerializers.DoubleSerializer ser = new NumberSerializers.DoubleSerializer(); // NumberType.DOUBLE

        ser.acceptJsonFormatVisitor(visitor, typeHint);

        verify(numVisitor).numberType(JsonParser.NumberType.DOUBLE);
        verify(visitor, never()).expectIntegerFormat(any(JavaType.class));
    }

    @Test
    public void testAcceptJsonFormatVisitor_NonIntBranch_VisitorNull_NoExceptionAndNoNumberTypeCall() throws Exception
    {
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = mock(JavaType.class);
        when(visitor.expectNumberFormat(typeHint)).thenReturn(null);

        NumberSerializers.FloatSerializer ser = new NumberSerializers.FloatSerializer(); // NumberType.FLOAT -> _isInt=false

        ser.acceptJsonFormatVisitor(visitor, typeHint);

        verify(visitor).expectNumberFormat(typeHint);
    }

    // =========================================================
    // Base.createContextual()
    // =========================================================

    @Test
    public void testCreateContextual_PropertyNull_ReturnsSameInstance() throws Exception
    {
        SerializerProvider provider = mock(SerializerProvider.class);
        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer();

        JsonSerializer<?> result = ser.createContextual(provider, null);

        assertSame(ser, result);
    }

    @Test
    public void testCreateContextual_MemberNull_ReturnsSameInstance() throws Exception
    {
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);
        when(property.getMember()).thenReturn(null);

        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer();

        JsonSerializer<?> result = ser.createContextual(provider, property);

        assertSame(ser, result);
        // เมื่อ m == null ไม่ควรเรียก getAnnotationIntrospector() เลย
        verify(provider, never()).getAnnotationIntrospector();
    }

    @Test
    public void testCreateContextual_FormatNull_ReturnsSameInstance() throws Exception
    {
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember member = mock(AnnotatedMember.class);
        AnnotationIntrospector introspector = mock(AnnotationIntrospector.class);

        when(property.getMember()).thenReturn(member);
        when(provider.getAnnotationIntrospector()).thenReturn(introspector);
        when(introspector.findFormat(member)).thenReturn(null);

        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer();

        JsonSerializer<?> result = ser.createContextual(provider, property);

        assertSame(ser, result);
    }

    @Test
    public void testCreateContextual_ShapeString_ReturnsToStringSerializerInstance() throws Exception
    {
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember member = mock(AnnotatedMember.class);
        AnnotationIntrospector introspector = mock(AnnotationIntrospector.class);
        JsonFormat.Value formatValue = mock(JsonFormat.Value.class);

        when(property.getMember()).thenReturn(member);
        when(provider.getAnnotationIntrospector()).thenReturn(introspector);
        when(introspector.findFormat(member)).thenReturn(formatValue);
        when(formatValue.getShape()).thenReturn(JsonFormat.Shape.STRING);

        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer();

        JsonSerializer<?> result = ser.createContextual(provider, property);

        assertSame(ToStringSerializer.instance, result);
    }

    @Test
    public void testCreateContextual_ShapeNotString_ReturnsSameInstance() throws Exception
    {
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember member = mock(AnnotatedMember.class);
        AnnotationIntrospector introspector = mock(AnnotationIntrospector.class);
        JsonFormat.Value formatValue = mock(JsonFormat.Value.class);

        when(property.getMember()).thenReturn(member);
        when(provider.getAnnotationIntrospector()).thenReturn(introspector);
        when(introspector.findFormat(member)).thenReturn(formatValue);
        // ใช้ Shape.ANY เพื่อเข้า branch "default" ของ switch (ไม่ใช่ STRING)
        when(formatValue.getShape()).thenReturn(JsonFormat.Shape.ANY);

        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer();

        JsonSerializer<?> result = ser.createContextual(provider, property);

        assertSame(ser, result);
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testAddAll_ContainsAllExpectedEntriesWithCorrectTypesAndSharedInstances` | `addAll()` - ทุก `put()` call, ตรวจ shared-instance reference ของ Long/Byte/Short/Float/Double และ Integer instance ที่ใช้ร่วมกัน |
| `testShortSerializer_SerializeTypicalValue/BoundaryValues` | `ShortSerializer.serialize()` ค่าปกติและค่าขอบ (MIN/MAX) |
| `testShortSerializer_SerializeNullValueThrowsNPE` | ค่า null → NPE (ไม่มี null-check ในซอร์ส) |
| `testIntegerSerializer_SerializeTypicalValue/BoundaryValues` | `IntegerSerializer.serialize()` ค่าปกติ/ขอบ |
| `testIntegerSerializer_SerializeWithTypeDelegatesToSerialize` | `serializeWithType()` delegate ไปยัง `serialize()` |
| `testIntegerSerializer_SerializeNullValueThrowsNPE` | ค่า null → NPE |
| `testIntLikeSerializer_*` | `IntLikeSerializer.serialize()` ค่าปกติ/ขอบ (Byte MIN/MAX)/null |
| `testLongSerializer_*` | `LongSerializer.serialize()` ค่าปกติ/ขอบ/null |
| `testFloatSerializer_*` | `FloatSerializer.serialize()` ค่าปกติ, NaN, ±Infinity, null |
| `testDoubleSerializer_*` | `DoubleSerializer.serialize()`/`serializeWithType()` ค่าปกติ, NaN, ±Infinity, null |
| `testGetSchema_ReturnsNonNullNode_ForIntType/NonIntType` | `Base.getSchema()` - เรียกผ่าน `createSchemaNode()` (ไม่เดาโครงสร้างภายใน) |
| `testAcceptJsonFormatVisitor_IntBranch_VisitorNonNull_CallsNumberType` | `_isInt == true`, `v2 != null` → เรียก `numberType()` |
| `testAcceptJsonFormatVisitor_IntBranch_VisitorNull_*` | `_isInt == true`, `v2 == null` (ไม่ throw) |
| `testAcceptJsonFormatVisitor_NonIntBranch_VisitorNonNull_CallsNumberType` | `_isInt == false`, `v2 != null` → เรียก `numberType()` |
| `testAcceptJsonFormatVisitor_NonIntBranch_VisitorNull_*` | `_isInt == false`, `v2 == null` (ไม่ throw) |
| `testCreateContextual_PropertyNull_ReturnsSameInstance` | `property == null` → return `this` |
| `testCreateContextual_MemberNull_ReturnsSameInstance` | `property != null`, `m == null` → return `this`, ไม่เรียก `getAnnotationIntrospector()` |
| `testCreateContextual_FormatNull_ReturnsSameInstance` | `format == null` → return `this` |
| `testCreateContextual_ShapeString_ReturnsToStringSerializerInstance` | `switch` case `STRING` → return `ToStringSerializer.instance` |
| `testCreateContextual_ShapeNotString_ReturnsSameInstance` | `switch` `default` case → return `this` |

**หมายเหตุ:** ไม่ได้เขียนเทสสำหรับ internal structure ของ `JsonNode` ที่คืนจาก `createSchemaNode()` เพราะเมธอดนี้ไม่มีซอร์สโค้ดให้ตรวจสอบ (สืบทอดจากคลาสฐานที่ไม่ได้ให้มา) จึงตรวจสอบเพียง non-null เพื่อไม่เดา behavior ที่ไม่มีในซอร์ส