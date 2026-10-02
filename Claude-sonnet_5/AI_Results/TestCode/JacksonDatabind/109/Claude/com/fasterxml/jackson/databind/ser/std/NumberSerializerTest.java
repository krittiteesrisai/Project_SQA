package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;

public class NumberSerializerTest {

    // ---------- Helper: custom Number type เพื่อ hit branch "else" (fallback toString) ----------
    static class CustomNumber extends Number {
        private static final long serialVersionUID = 1L;
        @Override public int intValue() { return 0; }
        @Override public long longValue() { return 0; }
        @Override public float floatValue() { return 0; }
        @Override public double doubleValue() { return 0; }
        @Override public String toString() { return "custom-42"; }
    }

    // ---------- POJO สำหรับทดสอบ createContextual ผ่าน ObjectMapper (end-to-end) ----------
    static class BigDecimalStringWrapper {
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public BigDecimal value;
        public BigDecimalStringWrapper(BigDecimal v) { this.value = v; }
    }

    static class BigDecimalNumberShapeWrapper {
        @JsonFormat(shape = JsonFormat.Shape.NUMBER)
        public BigDecimal value;
        public BigDecimalNumberShapeWrapper(BigDecimal v) { this.value = v; }
    }

    static class BigDecimalPlainWrapper {
        public BigDecimal value;
        public BigDecimalPlainWrapper(BigDecimal v) { this.value = v; }
    }

    private NumberSerializer serializer; // ใช้ rawType = Number.class สำหรับ serialize() ทั่วไป
    private JsonGenerator gen;

    @Before
    public void setUp() {
        serializer = new NumberSerializer(Number.class);
        gen = mock(JsonGenerator.class);
    }

    // =========================================================
    // 1) Constructor / _isInt -> ทดสอบผ่าน getSchema()
    // =========================================================

    @Test
    public void testGetSchema_BigInteger_ReturnsIntegerType() {
        NumberSerializer s = new NumberSerializer(BigInteger.class);
        JsonNode schema = s.getSchema(null, null);
        assertEquals("integer", schema.get("type").asText());
    }

    @Test
    public void testGetSchema_BigDecimal_ReturnsNumberType() {
        NumberSerializer s = new NumberSerializer(BigDecimal.class);
        JsonNode schema = s.getSchema(null, null);
        assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void testGetSchema_GenericNumber_ReturnsNumberType() {
        NumberSerializer s = new NumberSerializer(Number.class);
        JsonNode schema = s.getSchema(null, null);
        assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void testStaticInstance_HandledTypeIsNumber() {
        assertEquals(Number.class, NumberSerializer.instance.handledType());
    }

    // =========================================================
    // 2) serialize() - ครอบคลุมทุกสาขา if/else
    // =========================================================

    @Test
    public void testSerialize_BigDecimal() throws IOException {
        BigDecimal value = new BigDecimal("123.45");
        serializer.serialize(value, gen, null);
        verify(gen, times(1)).writeNumber(value);
        verifyNoMoreInteractions(gen);
    }

    @Test
    public void testSerialize_BigDecimal_Negative() throws IOException {
        BigDecimal value = new BigDecimal("-0.001");
        serializer.serialize(value, gen, null);
        verify(gen).writeNumber(value);
    }

    @Test
    public void testSerialize_BigInteger() throws IOException {
        BigInteger value = BigInteger.valueOf(123456789L);
        serializer.serialize(value, gen, null);
        verify(gen, times(1)).writeNumber(value);
        verifyNoMoreInteractions(gen);
    }

    @Test
    public void testSerialize_BigInteger_VeryLarge() throws IOException {
        BigInteger value = new BigInteger("100000000000000000000000000000");
        serializer.serialize(value, gen, null);
        verify(gen).writeNumber(value);
    }

    @Test
    public void testSerialize_Long() throws IOException {
        Long value = 123456789L;
        serializer.serialize(value, gen, null);
        verify(gen, times(1)).writeNumber(123456789L);
        verifyNoMoreInteractions(gen);
    }

    @Test
    public void testSerialize_Long_BoundaryMaxMin() throws IOException {
        serializer.serialize(Long.MAX_VALUE, gen, null);
        verify(gen).writeNumber(Long.MAX_VALUE);

        JsonGenerator gen2 = mock(JsonGenerator.class);
        serializer.serialize(Long.MIN_VALUE, gen2, null);
        verify(gen2).writeNumber(Long.MIN_VALUE);
    }

    @Test
    public void testSerialize_Double() throws IOException {
        Double value = 3.14d;
        serializer.serialize(value, gen, null);
        verify(gen, times(1)).writeNumber(3.14d);
        verifyNoMoreInteractions(gen);
    }

    @Test
    public void testSerialize_Double_NaNAndInfinity() throws IOException {
        serializer.serialize(Double.NaN, gen, null);
        verify(gen).writeNumber(Double.NaN);

        JsonGenerator gen2 = mock(JsonGenerator.class);
        serializer.serialize(Double.POSITIVE_INFINITY, gen2, null);
        verify(gen2).writeNumber(Double.POSITIVE_INFINITY);
    }

    @Test
    public void testSerialize_Float() throws IOException {
        Float value = 3.14f;
        serializer.serialize(value, gen, null);
        verify(gen, times(1)).writeNumber(3.14f);
        verifyNoMoreInteractions(gen);
    }

    @Test
    public void testSerialize_Float_NaN() throws IOException {
        serializer.serialize(Float.NaN, gen, null);
        verify(gen).writeNumber(Float.NaN);
    }

    @Test
    public void testSerialize_Integer() throws IOException {
        Integer value = 42;
        serializer.serialize(value, gen, null);
        verify(gen, times(1)).writeNumber(42);
        verifyNoMoreInteractions(gen);
    }

    @Test
    public void testSerialize_Integer_BoundaryMaxMin() throws IOException {
        serializer.serialize(Integer.MAX_VALUE, gen, null);
        verify(gen).writeNumber(Integer.MAX_VALUE);

        JsonGenerator gen2 = mock(JsonGenerator.class);
        serializer.serialize(Integer.MIN_VALUE, gen2, null);
        verify(gen2).writeNumber(Integer.MIN_VALUE);
    }

    @Test
    public void testSerialize_Byte() throws IOException {
        Byte value = (byte) 5;
        serializer.serialize(value, gen, null);
        // Byte.intValue() == 5 -> writeNumber(int)
        verify(gen, times(1)).writeNumber(5);
        verifyNoMoreInteractions(gen);
    }

    @Test
    public void testSerialize_Byte_BoundaryMaxMin() throws IOException {
        serializer.serialize(Byte.MAX_VALUE, gen, null);
        verify(gen).writeNumber((int) Byte.MAX_VALUE);

        JsonGenerator gen2 = mock(JsonGenerator.class);
        serializer.serialize(Byte.MIN_VALUE, gen2, null);
        verify(gen2).writeNumber((int) Byte.MIN_VALUE);
    }

    @Test
    public void testSerialize_Short() throws IOException {
        Short value = (short) 100;
        serializer.serialize(value, gen, null);
        verify(gen, times(1)).writeNumber(100);
        verifyNoMoreInteractions(gen);
    }

    @Test
    public void testSerialize_Short_BoundaryMaxMin() throws IOException {
        serializer.serialize(Short.MAX_VALUE, gen, null);
        verify(gen).writeNumber((int) Short.MAX_VALUE);

        JsonGenerator gen2 = mock(JsonGenerator.class);
        serializer.serialize(Short.MIN_VALUE, gen2, null);
        verify(gen2).writeNumber((int) Short.MIN_VALUE);
    }

    @Test
    public void testSerialize_CustomNumber_FallsBackToStringWrite() throws IOException {
        CustomNumber value = new CustomNumber();
        serializer.serialize(value, gen, null);
        // เข้าสาขา else: g.writeNumber(value.toString())
        verify(gen, times(1)).writeNumber("custom-42");
        verifyNoMoreInteractions(gen);
    }

    @Test(expected = NullPointerException.class)
    public void testSerialize_NullValue_FallsThroughToElseAndThrowsNPE() throws IOException {
        // null instanceof X == false เสมอ -> ตกไปสาขา else -> value.toString() -> NPE
        // เป็นการทดสอบ fault-detection: ถ้ามีการเพิ่ม null-check ในอนาคต test นี้จะ fail แจ้งเตือน
        serializer.serialize(null, gen, null);
    }

    // =========================================================
    // 3) acceptJsonFormatVisitor() - 3 สาขา
    //    หมายเหตุ: ไม่ทราบรายละเอียด implementation ของ visitIntFormat/visitFloatFormat
    //    (inherited, ไม่ได้แสดงในซอร์สที่ให้มา) จึงตรวจสอบเพียง interaction
    //    กับ visitor ตาม public contract ของ JsonFormatVisitorWrapper เท่านั้น
    // =========================================================

    @Test
    public void testAcceptJsonFormatVisitor_BigInteger_CallsExpectIntegerFormat() throws Exception {
        NumberSerializer s = new NumberSerializer(BigInteger.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        s.acceptJsonFormatVisitor(visitor, null);
        verify(visitor).expectIntegerFormat(null);
        verify(visitor, never()).expectFloatFormat(any());
        verify(visitor, never()).expectNumberFormat(any());
    }

    @Test
    public void testAcceptJsonFormatVisitor_BigDecimal_CallsExpectFloatFormat() throws Exception {
        NumberSerializer s = new NumberSerializer(BigDecimal.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        s.acceptJsonFormatVisitor(visitor, null);
        verify(visitor).expectFloatFormat(null);
        verify(visitor, never()).expectIntegerFormat(any());
        verify(visitor, never()).expectNumberFormat(any());
    }

    @Test
    public void testAcceptJsonFormatVisitor_GenericNumber_CallsExpectNumberFormat() throws Exception {
        NumberSerializer s = new NumberSerializer(Number.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        s.acceptJsonFormatVisitor(visitor, null);
        verify(visitor).expectNumberFormat(null);
        verify(visitor, never()).expectIntegerFormat(any());
        verify(visitor, never()).expectFloatFormat(any());
    }

    // =========================================================
    // 4) createContextual() - 3 สาขา
    //    ใช้ ObjectMapper end-to-end เพื่อไม่ต้องเดา internal ของ
    //    findFormatOverrides() ซึ่งไม่ได้แสดงในซอร์สที่ให้มา
    // =========================================================

    @Test
    public void testCreateContextual_NullProperty_ReturnsSelf() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        NumberSerializer s = new NumberSerializer(BigDecimal.class);
        JsonSerializer<?> result = s.createContextual(provider, null);
        // เมื่อไม่มี property/format override -> ต้อง return ตัวเอง (branch format==null หรือ default)
        assertSame(s, result);
    }

    @Test
    public void testCreateContextual_StringShapeAnnotation_SerializesAsQuotedString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new BigDecimalStringWrapper(new BigDecimal("12.34")));
        // case STRING -> ใช้ ToStringSerializer.instance -> ค่าถูก quote เป็น string
        assertEquals("{\"value\":\"12.34\"}", json);
    }

    @Test
    public void testCreateContextual_ExplicitNumberShapeAnnotation_SerializesAsPlainNumber() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new BigDecimalNumberShapeWrapper(new BigDecimal("12.34")));
        // default case ของ switch -> คืน this -> serialize ปกติ (ไม่ quote)
        assertEquals("{\"value\":12.34}", json);
    }

    @Test
    public void testCreateContextual_NoAnnotation_SerializesAsPlainNumber() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new BigDecimalPlainWrapper(new BigDecimal("12.34")));
        // format == null -> คืน this -> serialize ปกติ
        assertEquals("{\"value\":12.34}", json);
    }
}
