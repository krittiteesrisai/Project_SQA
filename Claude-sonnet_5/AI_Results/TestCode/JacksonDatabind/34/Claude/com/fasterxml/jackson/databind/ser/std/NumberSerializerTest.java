package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;

public class NumberSerializerTest {

    private JsonGenerator generator;
    private SerializerProvider provider;

    /**
     * Custom Number subclass สำหรับทดสอบ branch fallback (else -> toString())
     */
    private static class CustomNumber extends Number {
        private static final long serialVersionUID = 1L;
        private final String repr;
        CustomNumber(String repr) { this.repr = repr; }
        @Override public int intValue() { return 0; }
        @Override public long longValue() { return 0L; }
        @Override public float floatValue() { return 0f; }
        @Override public double doubleValue() { return 0d; }
        @Override public String toString() { return repr; }
    }

    @Before
    public void setUp() {
        generator = mock(JsonGenerator.class);
        provider = mock(SerializerProvider.class);
    }

    // ---------------------------------------------------------------
    // serialize() - แต่ละ branch ของ if/else chain
    // ---------------------------------------------------------------

    @Test
    public void testSerialize_BigDecimal() throws Exception {
        NumberSerializer ser = new NumberSerializer(BigDecimal.class);
        BigDecimal value = new BigDecimal("123.456");
        ser.serialize(value, generator, provider);
        verify(generator).writeNumber(value);
        verifyNoMoreInteractions(generator);
    }

    @Test
    public void testSerialize_BigInteger() throws Exception {
        NumberSerializer ser = new NumberSerializer(BigInteger.class);
        BigInteger value = BigInteger.valueOf(999999999999L);
        ser.serialize(value, generator, provider);
        verify(generator).writeNumber(value);
        verifyNoMoreInteractions(generator);
    }

    @Test
    public void testSerialize_Integer_MaxValue() throws Exception {
        NumberSerializer ser = new NumberSerializer(Integer.class);
        Integer value = Integer.MAX_VALUE;
        ser.serialize(value, generator, provider);
        verify(generator).writeNumber(Integer.MAX_VALUE);
        verifyNoMoreInteractions(generator);
    }

    @Test
    public void testSerialize_Integer_MinValue() throws Exception {
        NumberSerializer ser = new NumberSerializer(Integer.class);
        Integer value = Integer.MIN_VALUE;
        ser.serialize(value, generator, provider);
        verify(generator).writeNumber(Integer.MIN_VALUE);
        verifyNoMoreInteractions(generator);
    }

    @Test
    public void testSerialize_Long() throws Exception {
        NumberSerializer ser = new NumberSerializer(Long.class);
        Long value = Long.MAX_VALUE;
        ser.serialize(value, generator, provider);
        verify(generator).writeNumber(Long.MAX_VALUE);
        verifyNoMoreInteractions(generator);
    }

    @Test
    public void testSerialize_Double() throws Exception {
        NumberSerializer ser = new NumberSerializer(Double.class);
        Double value = 3.14159d;
        ser.serialize(value, generator, provider);
        verify(generator).writeNumber(3.14159d);
        verifyNoMoreInteractions(generator);
    }

    @Test
    public void testSerialize_Double_NaN_boundary() throws Exception {
        // ค่าขอบเขตที่ผิดปกติ - โค้ดไม่มีการตรวจสอบพิเศษ ต้องไม่ throw exception
        NumberSerializer ser = new NumberSerializer(Double.class);
        Double value = Double.NaN;
        ser.serialize(value, generator, provider);
        verify(generator).writeNumber(Double.NaN);
    }

    @Test
    public void testSerialize_Float() throws Exception {
        NumberSerializer ser = new NumberSerializer(Float.class);
        Float value = 2.5f;
        ser.serialize(value, generator, provider);
        verify(generator).writeNumber(2.5f);
        verifyNoMoreInteractions(generator);
    }

    @Test
    public void testSerialize_Byte() throws Exception {
        NumberSerializer ser = new NumberSerializer(Byte.class);
        Byte value = Byte.MAX_VALUE;
        ser.serialize(value, generator, provider);
        // Byte/Short ใช้ intValue()
        verify(generator).writeNumber((int) Byte.MAX_VALUE);
        verifyNoMoreInteractions(generator);
    }

    @Test
    public void testSerialize_Short() throws Exception {
        NumberSerializer ser = new NumberSerializer(Short.class);
        Short value = Short.MIN_VALUE;
        ser.serialize(value, generator, provider);
        verify(generator).writeNumber((int) Short.MIN_VALUE);
        verifyNoMoreInteractions(generator);
    }

    @Test
    public void testSerialize_FallbackCustomNumber() throws Exception {
        // ไม่ตรงกับ instanceof ใดๆ -> ตก else -> writeNumber(String)
        NumberSerializer ser = new NumberSerializer(CustomNumber.class);
        CustomNumber value = new CustomNumber("12345678901234567890");
        ser.serialize(value, generator, provider);
        verify(generator).writeNumber("12345678901234567890");
        verifyNoMoreInteractions(generator);
    }

    @Test(expected = NullPointerException.class)
    public void testSerialize_NullValue_throwsNPE() throws Exception {
        // value == null -> ไม่ตรง instanceof ใดๆ -> ตก else -> value.toString() -> NPE
        // (พฤติกรรมนี้อนุมานจากซอร์สโดยตรง ไม่ได้เดาเพิ่ม)
        NumberSerializer ser = new NumberSerializer(Number.class);
        ser.serialize(null, generator, provider);
    }

    // ---------------------------------------------------------------
    // Constructor / _isInt flag
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_BigIntegerSetsIsIntTrue_viaGetSchema() {
        NumberSerializer ser = new NumberSerializer(BigInteger.class);
        JsonNode schema = ser.getSchema(provider, null);
        assertNotNull(schema);
        assertEquals("integer", schema.get("type").asText());
    }

    @Test
    public void testConstructor_NonBigIntegerSetsIsIntFalse_viaGetSchema() {
        NumberSerializer ser = new NumberSerializer(Integer.class);
        JsonNode schema = ser.getSchema(provider, null);
        assertNotNull(schema);
        assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void testConstructor_BigDecimal_isIntFalse_viaGetSchema() {
        NumberSerializer ser = new NumberSerializer(BigDecimal.class);
        JsonNode schema = ser.getSchema(provider, null);
        assertNotNull(schema);
        assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void testStaticInstance_isIntFalse() {
        // instance ถูกสร้างด้วย Number.class ซึ่งไม่เท่ากับ BigInteger.class
        JsonNode schema = NumberSerializer.instance.getSchema(provider, null);
        assertEquals("number", schema.get("type").asText());
    }

    // ---------------------------------------------------------------
    // acceptJsonFormatVisitor() - 3 branch
    // ---------------------------------------------------------------

    @Test
    public void testAcceptJsonFormatVisitor_isIntTrue_callsExpectIntegerFormat() throws Exception {
        NumberSerializer ser = new NumberSerializer(BigInteger.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = mock(JavaType.class);

        ser.acceptJsonFormatVisitor(visitor, typeHint);

        verify(visitor).expectIntegerFormat(typeHint);
        verify(visitor, never()).expectFloatFormat(any(JavaType.class));
        verify(visitor, never()).expectNumberFormat(any(JavaType.class));
    }

    @Test
    public void testAcceptJsonFormatVisitor_isIntFalse_BigDecimal_callsExpectFloatFormat() throws Exception {
        NumberSerializer ser = new NumberSerializer(BigDecimal.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = mock(JavaType.class);

        ser.acceptJsonFormatVisitor(visitor, typeHint);

        verify(visitor).expectFloatFormat(typeHint);
        verify(visitor, never()).expectIntegerFormat(any(JavaType.class));
        verify(visitor, never()).expectNumberFormat(any(JavaType.class));
    }

    @Test
    public void testAcceptJsonFormatVisitor_isIntFalse_OtherType_callsExpectNumberFormat() throws Exception {
        NumberSerializer ser = new NumberSerializer(Integer.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = mock(JavaType.class);

        ser.acceptJsonFormatVisitor(visitor, typeHint);

        verify(visitor).expectNumberFormat(typeHint);
        verify(visitor, never()).expectIntegerFormat(any(JavaType.class));
        verify(visitor, never()).expectFloatFormat(any(JavaType.class));
    }
}
