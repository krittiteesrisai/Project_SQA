# EnumSerializerTest.java

หมายเหตุสำคัญก่อนเริ่ม:
- วาง Test class ไว้ใน **package เดียวกัน** กับคลาสเป้าหมาย (`com.fasterxml.jackson.databind.ser.std`) เพื่อให้เข้าถึง field/method ที่เป็น `protected` ได้โดยตรง (Java อนุญาตให้เข้าถึง protected member จาก class ใน package เดียวกันได้เสมอ)
- ฟิลด์/เมธอดบางส่วน เช่น `_serializeAsIndex` (field), `_isShapeWrittenUsingIndex()`, `_serializeAsIndex(SerializerProvider)` เป็น protected จึงเรียกตรงได้จาก test ใน package เดียวกัน
- สำหรับ `EnumValues` ใช้การสร้างจริงผ่าน `EnumValues.constructFromName(...)` (ของจริงจาก jackson-databind ที่อยู่ใน classpath ของโปรเจกต์ที่ถูกทดสอบ) เพื่อไม่ต้องเดา behavior ภายในของ EnumValues
- เมธอด `findFormatOverrides(...)` ที่ถูกเรียกใน `createContextual` เป็นเมธอดที่ **ไม่ได้อยู่ใน source ที่ให้มา** (มาจาก base class) — จึงทดสอบ `createContextual` ทางอ้อมผ่าน ObjectMapper จริง (integration-style) เพื่อไม่เดา behavior ภายใน ตามข้อกำหนดที่ 4 (มีคอมเมนต์กำกับไว้ในโค้ด)
- ฟิลด์ `type` ใน schema node (`getSchema`) มาจาก helper method `createSchemaNode` ของ base class ที่ไม่ได้แสดงใน source — ใช้ assumption ตาม convention ที่รู้จักทั่วไปของ Jackson JSON-Schema (คอมเมนต์กำกับไว้)

```java
package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.*;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.util.EnumValues;

public class EnumSerializerTest {

    // ---------- test fixtures ----------

    private enum Color { RED, GREEN, BLUE }

    static class Holder {
        @JsonFormat(shape = Shape.STRING)
        public Color colorAsString = Color.GREEN;

        @JsonFormat(shape = Shape.NUMBER_INT)
        public Color colorAsIndex = Color.BLUE;

        public Color colorDefault = Color.RED;
    }

    @SuppressWarnings("unchecked")
    private EnumValues buildEnumValues() {
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        return EnumValues.constructFromName(config, (Class<Enum<?>>) (Class<?>) Color.class);
    }

    // =====================================================================
    // 1. Constructors
    // =====================================================================

    @Test
    public void testDeprecatedConstructor_setsNullIndexFlag() {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values);
        assertNull(ser._serializeAsIndex);
        assertSame(values, ser.getEnumValues());
    }

    @Test
    public void testTwoArgConstructor_setsFieldsTrue() {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, Boolean.TRUE);
        assertEquals(Boolean.TRUE, ser._serializeAsIndex);
        assertSame(values, ser.getEnumValues());
    }

    @Test
    public void testTwoArgConstructor_setsFieldsFalse() {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, Boolean.FALSE);
        assertEquals(Boolean.FALSE, ser._serializeAsIndex);
    }

    // =====================================================================
    // 2. _isShapeWrittenUsingIndex (protected static helper)
    // =====================================================================

    @Test
    public void testIsShapeWrittenUsingIndex_NullFormat_ReturnsNull() {
        Boolean result = EnumSerializer._isShapeWrittenUsingIndex(Color.class, null, true);
        assertNull(result);
    }

    @Test
    public void testIsShapeWrittenUsingIndex_ShapeAny_ReturnsNull() {
        JsonFormat.Value format = JsonFormat.Value.forShape(Shape.ANY);
        assertNull(EnumSerializer._isShapeWrittenUsingIndex(Color.class, format, true));
    }

    @Test
    public void testIsShapeWrittenUsingIndex_ShapeScalar_ReturnsNull() {
        JsonFormat.Value format = JsonFormat.Value.forShape(Shape.SCALAR);
        assertNull(EnumSerializer._isShapeWrittenUsingIndex(Color.class, format, true));
    }

    @Test
    public void testIsShapeWrittenUsingIndex_ShapeString_ReturnsFalse() {
        JsonFormat.Value format = JsonFormat.Value.forShape(Shape.STRING);
        assertEquals(Boolean.FALSE, EnumSerializer._isShapeWrittenUsingIndex(Color.class, format, true));
    }

    @Test
    public void testIsShapeWrittenUsingIndex_ShapeNatural_ReturnsFalse() {
        JsonFormat.Value format = JsonFormat.Value.forShape(Shape.NATURAL);
        assertEquals(Boolean.FALSE, EnumSerializer._isShapeWrittenUsingIndex(Color.class, format, true));
    }

    @Test
    public void testIsShapeWrittenUsingIndex_ShapeNumberInt_ReturnsTrue() {
        JsonFormat.Value format = JsonFormat.Value.forShape(Shape.NUMBER_INT);
        assertEquals(Boolean.TRUE, EnumSerializer._isShapeWrittenUsingIndex(Color.class, format, true));
    }

    @Test
    public void testIsShapeWrittenUsingIndex_ShapeArray_ReturnsTrue() {
        JsonFormat.Value format = JsonFormat.Value.forShape(Shape.ARRAY);
        assertEquals(Boolean.TRUE, EnumSerializer._isShapeWrittenUsingIndex(Color.class, format, true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsShapeWrittenUsingIndex_ShapeObject_FromClass_Throws() {
        JsonFormat.Value format = JsonFormat.Value.forShape(Shape.OBJECT);
        EnumSerializer._isShapeWrittenUsingIndex(Color.class, format, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsShapeWrittenUsingIndex_ShapeObject_FromProperty_Throws() {
        JsonFormat.Value format = JsonFormat.Value.forShape(Shape.OBJECT);
        EnumSerializer._isShapeWrittenUsingIndex(Color.class, format, false);
    }

    // =====================================================================
    // 3. construct() static factory
    // =====================================================================

    @Test
    public void testConstruct_NullFormat_ResultsInDynamicFlag() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        EnumSerializer ser = EnumSerializer.construct(Color.class, config, null, null);
        assertNull(ser._serializeAsIndex);
    }

    @Test
    public void testConstruct_ShapeString_ResultsInFalse() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        JsonFormat.Value format = JsonFormat.Value.forShape(Shape.STRING);
        EnumSerializer ser = EnumSerializer.construct(Color.class, config, null, format);
        assertEquals(Boolean.FALSE, ser._serializeAsIndex);
    }

    @Test
    public void testConstruct_ShapeNumberInt_ResultsInTrue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        JsonFormat.Value format = JsonFormat.Value.forShape(Shape.NUMBER_INT);
        EnumSerializer ser = EnumSerializer.construct(Color.class, config, null, format);
        assertEquals(Boolean.TRUE, ser._serializeAsIndex);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstruct_ShapeObject_Throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        JsonFormat.Value format = JsonFormat.Value.forShape(Shape.OBJECT);
        EnumSerializer.construct(Color.class, config, null, format);
    }

    // =====================================================================
    // 4. createContextual
    // =====================================================================

    @Test
    public void testCreateContextual_NullProperty_ReturnsSameInstance() throws Exception {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, null);
        SerializerProvider provider = mock(SerializerProvider.class);

        JsonSerializer<?> result = ser.createContextual(provider, null);

        assertSame(ser, result);
    }

    /**
     * Integration-style test: ใช้ ObjectMapper จริงเพื่อทดสอบ branch ของ createContextual
     * ที่ property != null (ทั้งกรณี format == null -> return this,
     * และกรณี format != null ทำให้ serializeAsIndex ต่างจากเดิม -> สร้าง instance ใหม่)
     * โดยไม่ต้อง mock/เดา internal ของ findFormatOverrides() ซึ่งไม่ปรากฏใน source ที่ให้มา
     */
    @Test
    public void testCreateContextualAndSerialize_Integration_PropertyOverrides() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new Holder());

        assertTrue(json.contains("\"colorAsString\":\"GREEN\""));
        assertTrue(json.contains("\"colorAsIndex\":" + Color.BLUE.ordinal()));
        assertTrue(json.contains("\"colorDefault\":\"RED\""));
    }

    // =====================================================================
    // 5. serialize()
    // =====================================================================

    @Test
    public void testSerialize_AsIndexTrue_WritesNumber() throws IOException {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, Boolean.TRUE);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);

        ser.serialize(Color.GREEN, gen, provider);

        verify(gen).writeNumber(Color.GREEN.ordinal());
        verify(gen, never()).writeString(anyString());
    }

    @Test
    public void testSerialize_AsIndexFalse_ToStringEnabled_WritesToString() throws IOException {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, Boolean.FALSE);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)).thenReturn(true);

        ser.serialize(Color.BLUE, gen, provider);

        verify(gen).writeString(Color.BLUE.toString());
        verify(gen, never()).writeNumber(anyInt());
    }

    @Test
    public void testSerialize_AsIndexFalse_ToStringDisabled_WritesEnumValuesString() throws IOException {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, Boolean.FALSE);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)).thenReturn(false);

        ser.serialize(Color.RED, gen, provider);

        ArgumentCaptor<SerializableString> captor = ArgumentCaptor.forClass(SerializableString.class);
        verify(gen).writeString(captor.capture());
        assertEquals("RED", captor.getValue().getValue());
        verify(gen, never()).writeNumber(anyInt());
    }

    @Test
    public void testSerialize_DynamicFlag_ProviderIndexEnabled_WritesNumber() throws IOException {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, null);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX)).thenReturn(true);

        ser.serialize(Color.GREEN, gen, provider);

        verify(gen).writeNumber(Color.GREEN.ordinal());
    }

    @Test
    public void testSerialize_DynamicFlag_ProviderIndexDisabled_ToStringDisabled_WritesEnumString() throws IOException {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, null);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX)).thenReturn(false);
        when(provider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)).thenReturn(false);

        ser.serialize(Color.GREEN, gen, provider);

        ArgumentCaptor<SerializableString> captor = ArgumentCaptor.forClass(SerializableString.class);
        verify(gen).writeString(captor.capture());
        assertEquals("GREEN", captor.getValue().getValue());
    }

    /**
     * ค่า null: ตาม source ไม่มีการเช็ค null ของ en จึงคาดหวัง NullPointerException
     * เมื่อเรียก en.ordinal() ในกรณี serializeAsIndex == true
     */
    @Test(expected = NullPointerException.class)
    public void testSerialize_NullEnum_AsIndex_ThrowsNPE() throws IOException {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, Boolean.TRUE);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);

        ser.serialize(null, gen, provider);
    }

    // =====================================================================
    // 6. getSchema()
    // หมายเหตุ: field "type" ใน JsonNode มาจาก createSchemaNode() ของ base class
    // ที่ไม่ปรากฏใน source ที่ให้มา อ้างอิง convention มาตรฐานของ Jackson schema (deprecated API)
    // =====================================================================

    @Test
    public void testGetSchema_AsIndex_ReturnsIntegerType() {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, Boolean.TRUE);
        SerializerProvider provider = mock(SerializerProvider.class);

        JsonNode schema = ser.getSchema(provider, null);

        assertEquals("integer", schema.get("type").asText());
    }

    @Test
    public void testGetSchema_AsString_NullTypeHint_NoEnumArray() {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, Boolean.FALSE);
        SerializerProvider provider = mock(SerializerProvider.class);

        JsonNode schema = ser.getSchema(provider, null);

        assertEquals("string", schema.get("type").asText());
        assertNull(schema.get("enum"));
    }

    @Test
    public void testGetSchema_AsString_TypeHintNotEnum_NoEnumArray() {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, Boolean.FALSE);
        SerializerProvider provider = mock(SerializerProvider.class);
        JavaType javaType = mock(JavaType.class);
        when(javaType.isEnumType()).thenReturn(false);
        when(provider.constructType(String.class)).thenReturn(javaType);

        JsonNode schema = ser.getSchema(provider, String.class);

        assertEquals("string", schema.get("type").asText());
        assertNull(schema.get("enum"));
    }

    @Test
    public void testGetSchema_AsString_TypeHintIsEnum_PopulatesEnumArray() {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, Boolean.FALSE);
        SerializerProvider provider = mock(SerializerProvider.class);
        JavaType javaType = mock(JavaType.class);
        when(javaType.isEnumType()).thenReturn(true);
        when(provider.constructType(Color.class)).thenReturn(javaType);

        JsonNode schema = ser.getSchema(provider, Color.class);

        JsonNode enumNode = schema.get("enum");
        assertNotNull(enumNode);
        assertTrue(enumNode.isArray());

        Set<String> names = new HashSet<String>();
        for (JsonNode n : enumNode) {
            names.add(n.asText());
        }
        assertEquals(new HashSet<String>(Arrays.asList("RED", "GREEN", "BLUE")), names);
    }

    // =====================================================================
    // 7. acceptJsonFormatVisitor()
    // =====================================================================

    @Test
    public void testAcceptJsonFormatVisitor_AsIndex_DoesNotUseStringVisitor() throws Exception {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, Boolean.TRUE);
        SerializerProvider provider = mock(SerializerProvider.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        when(visitor.getProvider()).thenReturn(provider);
        JavaType javaType = mock(JavaType.class);

        ser.acceptJsonFormatVisitor(visitor, javaType);

        // ตาม source: ถ้า _serializeAsIndex() == true จะ return ก่อนเรียก expectStringFormat
        verify(visitor, never()).expectStringFormat(any(JavaType.class));
    }

    @Test
    public void testAcceptJsonFormatVisitor_AsString_NullStringVisitor_NoOp() throws Exception {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, Boolean.FALSE);
        SerializerProvider provider = mock(SerializerProvider.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        when(visitor.getProvider()).thenReturn(provider);
        JavaType javaType = mock(JavaType.class);
        when(visitor.expectStringFormat(javaType)).thenReturn(null);

        // ไม่ควร throw exception ใด ๆ
        ser.acceptJsonFormatVisitor(visitor, javaType);
    }

    @Test
    public void testAcceptJsonFormatVisitor_AsString_ToStringEnabled_UsesToString() throws Exception {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, Boolean.FALSE);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)).thenReturn(true);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        when(visitor.getProvider()).thenReturn(provider);
        JsonStringFormatVisitor stringVisitor = mock(JsonStringFormatVisitor.class);
        JavaType javaType = mock(JavaType.class);
        when(visitor.expectStringFormat(javaType)).thenReturn(stringVisitor);

        ser.acceptJsonFormatVisitor(visitor, javaType);

        @SuppressWarnings("unchecked")
        ArgumentCaptor<Set<String>> captor = ArgumentCaptor.forClass((Class) Set.class);
        verify(stringVisitor).enumTypes(captor.capture());

        Set<String> expected = new LinkedHashSet<String>();
        for (Color c : Color.values()) {
            expected.add(c.toString());
        }
        assertEquals(expected, captor.getValue());
    }

    @Test
    public void testAcceptJsonFormatVisitor_AsString_ToStringDisabled_UsesNames() throws Exception {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, Boolean.FALSE);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)).thenReturn(false);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        when(visitor.getProvider()).thenReturn(provider);
        JsonStringFormatVisitor stringVisitor = mock(JsonStringFormatVisitor.class);
        JavaType javaType = mock(JavaType.class);
        when(visitor.expectStringFormat(javaType)).thenReturn(stringVisitor);

        ser.acceptJsonFormatVisitor(visitor, javaType);

        @SuppressWarnings("unchecked")
        ArgumentCaptor<Set<String>> captor = ArgumentCaptor.forClass((Class) Set.class);
        verify(stringVisitor).enumTypes(captor.capture());

        Set<String> expected = new LinkedHashSet<String>();
        for (Color c : Color.values()) {
            expected.add(c.name());
        }
        assertEquals(expected, captor.getValue());
    }

    @Test
    public void testAcceptJsonFormatVisitor_AsString_NullProvider_UsesNames() throws Exception {
        // กรณี serializers == null (visitor.getProvider() คืน null) แต่ _serializeAsIndex
        // ถูกกำหนดแบบ static (ไม่ null) จึงไม่เกิด NPE ตอนเช็ค _serializeAsIndex()
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, Boolean.FALSE);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        when(visitor.getProvider()).thenReturn(null);
        JsonStringFormatVisitor stringVisitor = mock(JsonStringFormatVisitor.class);
        JavaType javaType = mock(JavaType.class);
        when(visitor.expectStringFormat(javaType)).thenReturn(stringVisitor);

        ser.acceptJsonFormatVisitor(visitor, javaType);

        @SuppressWarnings("unchecked")
        ArgumentCaptor<Set<String>> captor = ArgumentCaptor.forClass((Class) Set.class);
        verify(stringVisitor).enumTypes(captor.capture());

        Set<String> expected = new LinkedHashSet<String>();
        for (Color c : Color.values()) {
            expected.add(c.name());
        }
        assertEquals(expected, captor.getValue());
    }

    // =====================================================================
    // 8. _serializeAsIndex(SerializerProvider) helper (protected instance method)
    // =====================================================================

    @Test
    public void testSerializeAsIndexHelper_StaticTrue_DoesNotConsultProvider() {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, Boolean.TRUE);
        SerializerProvider provider = mock(SerializerProvider.class);

        assertTrue(ser._serializeAsIndex(provider));
        verifyZeroInteractions(provider);
    }

    @Test
    public void testSerializeAsIndexHelper_StaticFalse_DoesNotConsultProvider() {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, Boolean.FALSE);
        SerializerProvider provider = mock(SerializerProvider.class);

        assertFalse(ser._serializeAsIndex(provider));
        verifyZeroInteractions(provider);
    }

    @Test
    public void testSerializeAsIndexHelper_Dynamic_DelegatesToProvider() {
        EnumValues values = buildEnumValues();
        EnumSerializer ser = new EnumSerializer(values, null);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX)).thenReturn(true);

        assertTrue(ser._serializeAsIndex(provider));
        verify(provider).isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX);
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testDeprecatedConstructor_setsNullIndexFlag | Constructor (deprecated) → `_serializeAsIndex == null` |
| testTwoArgConstructor_setsFieldsTrue/False | Constructor สองพารามิเตอร์, เก็บค่า field ตรง |
| testIsShapeWrittenUsingIndex_NullFormat_ReturnsNull | `format == null` → shape null → return null |
| testIsShapeWrittenUsingIndex_ShapeAny/Scalar_ReturnsNull | shape == ANY / SCALAR → return null |
| testIsShapeWrittenUsingIndex_ShapeString/Natural_ReturnsFalse | shape == STRING / NATURAL → return FALSE |
| testIsShapeWrittenUsingIndex_ShapeNumberInt/Array_ReturnsTrue | shape.isNumeric() / ARRAY → return TRUE |
| testIsShapeWrittenUsingIndex_ShapeObject_*_Throws | shape อื่น (OBJECT) → throw IllegalArgumentException (ทั้ง fromClass=true/false) |
| testConstruct_NullFormat/ShapeString/ShapeNumberInt/ShapeObject_Throws | branch ของ `construct()` ผ่าน `_isShapeWrittenUsingIndex` ทั้งหมด |
| testCreateContextual_NullProperty_ReturnsSameInstance | `property == null` → return `this` |
| testCreateContextualAndSerialize_Integration_PropertyOverrides | `property != null`, format==null→return this; format!=null ต่างค่า→สร้าง instance ใหม่ (TRUE/FALSE) |
| testSerialize_AsIndexTrue_WritesNumber | `_serializeAsIndex(serializers)==true` → writeNumber |
| testSerialize_AsIndexFalse_ToStringEnabled_WritesToString | false, WRITE_ENUMS_USING_TO_STRING enabled → writeString(toString()) |
| testSerialize_AsIndexFalse_ToStringDisabled_WritesEnumValuesString | false, disabled → writeString(_values.serializedValueFor) |
| testSerialize_DynamicFlag_ProviderIndexEnabled/Disabled_* | `_serializeAsIndex==null` → delegate provider.isEnabled(...) ทั้ง TRUE/FALSE |
| testSerialize_NullEnum_AsIndex_ThrowsNPE | ค่า null ของ `en` (edge case) |
| testGetSchema_AsIndex_ReturnsIntegerType | `_serializeAsIndex==true` → integer schema |
| testGetSchema_AsString_NullTypeHint_NoEnumArray | false, `typeHint==null` → ไม่เติม enum array |
| testGetSchema_AsString_TypeHintNotEnum_NoEnumArray | false, typeHint!=null, `isEnumType()==false` |
| testGetSchema_AsString_TypeHintIsEnum_PopulatesEnumArray | false, typeHint!=null, `isEnumType()==true` → เติม enum array |
| testAcceptJsonFormatVisitor_AsIndex_DoesNotUseStringVisitor | `_serializeAsIndex==true` → visitIntFormat, ไม่เรียก expectStringFormat |
| testAcceptJsonFormatVisitor_AsString_NullStringVisitor_NoOp | `stringVisitor==null` → ไม่ทำอะไรต่อ |
| testAcceptJsonFormatVisitor_AsString_ToStringEnabled_UsesToString | stringVisitor!=null, TO_STRING enabled → ใช้ toString() |
| testAcceptJsonFormatVisitor_AsString_ToStringDisabled_UsesNames | stringVisitor!=null, disabled → ใช้ name()/values() |
| testAcceptJsonFormatVisitor_AsString_NullProvider_UsesNames | `serializers==null` ใน `(serializers != null) && ...` condition |
| testSerializeAsIndexHelper_StaticTrue/False_* | `_serializeAsIndex != null` branch (ทั้ง TRUE/FALSE) |
| testSerializeAsIndexHelper_Dynamic_DelegatesToProvider | `_serializeAsIndex == null` → delegate ไปยัง provider |