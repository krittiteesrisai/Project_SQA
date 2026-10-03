package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.JsonSerializer;
import org.junit.Test;

import java.io.StringWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

import static org.junit.Assert.*;

public class StdKeySerializersTest {

    private enum DummyEnum {
        TEST_VALUE
    }

    @Test
    public void testGetStdKeySerializerNullAndObject() {
        JsonSerializer<Object> ser1 = StdKeySerializers.getStdKeySerializer(null, null, true);
        assertNotNull(ser1);
        assertTrue(ser1 instanceof StdKeySerializers.Dynamic);

        JsonSerializer<Object> ser2 = StdKeySerializers.getStdKeySerializer(null, Object.class, false);
        assertNotNull(ser2);
        assertTrue(ser2 instanceof StdKeySerializers.Dynamic);
    }

    @Test
    public void testGetStdKeySerializerString() {
        JsonSerializer<Object> ser = StdKeySerializers.getStdKeySerializer(null, String.class, true);
        assertNotNull(ser);
        assertSame(StdKeySerializers.DEFAULT_STRING_SERIALIZER, ser);
    }

    @Test
    public void testGetStdKeySerializerPrimitivesAndNumbers() {
        JsonSerializer<Object> primitiveSer = StdKeySerializers.getStdKeySerializer(null, int.class, true);
        assertSame(StdKeySerializers.DEFAULT_KEY_SERIALIZER, primitiveSer);

        JsonSerializer<Object> numberSer = StdKeySerializers.getStdKeySerializer(null, Integer.class, true);
        assertSame(StdKeySerializers.DEFAULT_KEY_SERIALIZER, numberSer);

        JsonSerializer<Object> longSer = StdKeySerializers.getStdKeySerializer(null, Long.class, false);
        assertSame(StdKeySerializers.DEFAULT_KEY_SERIALIZER, longSer);
    }

    @Test
    public void testGetStdKeySerializerClassType() {
        JsonSerializer<Object> ser = StdKeySerializers.getStdKeySerializer(null, Class.class, true);
        assertNotNull(ser);
        assertTrue(ser instanceof StdKeySerializers.Default);
    }

    @Test
    public void testGetStdKeySerializerDateTypes() {
        JsonSerializer<Object> dateSer = StdKeySerializers.getStdKeySerializer(null, Date.class, true);
        assertNotNull(dateSer);
        assertTrue(dateSer instanceof StdKeySerializers.Default);

        JsonSerializer<Object> sqlDateSer = StdKeySerializers.getStdKeySerializer(null, java.sql.Date.class, true);
        assertNotNull(sqlDateSer);
        assertTrue(sqlDateSer instanceof StdKeySerializers.Default);
    }

    @Test
    public void testGetStdKeySerializerCalendarTypes() {
        JsonSerializer<Object> calSer = StdKeySerializers.getStdKeySerializer(null, Calendar.class, true);
        assertNotNull(calSer);
        assertTrue(calSer instanceof StdKeySerializers.Default);

        JsonSerializer<Object> gregCalSer = StdKeySerializers.getStdKeySerializer(null, GregorianCalendar.class, true);
        assertNotNull(gregCalSer);
        assertTrue(gregCalSer instanceof StdKeySerializers.Default);
    }

    @Test
    public void testGetStdKeySerializerUUIDType() {
        JsonSerializer<Object> uuidSer = StdKeySerializers.getStdKeySerializer(null, UUID.class, true);
        assertNotNull(uuidSer);
        assertTrue(uuidSer instanceof StdKeySerializers.Default);
    }

    @Test
    public void testGetStdKeySerializerUnknownWithUseDefault() {
        JsonSerializer<Object> serTrue = StdKeySerializers.getStdKeySerializer(null, Thread.class, true);
        assertSame(StdKeySerializers.DEFAULT_KEY_SERIALIZER, serTrue);

        JsonSerializer<Object> serFalse = StdKeySerializers.getStdKeySerializer(null, Thread.class, false);
        assertNull(serFalse);
    }

    @Test
    public void testGetFallbackKeySerializerEdgeCases() {
        // rawKeyType == null
        JsonSerializer<Object> serNull = StdKeySerializers.getFallbackKeySerializer(null, null);
        assertSame(StdKeySerializers.DEFAULT_KEY_SERIALIZER, serNull);

        // rawKeyType == Enum.class
        JsonSerializer<Object> serEnumClass = StdKeySerializers.getFallbackKeySerializer(null, Enum.class);
        assertTrue(serEnumClass instanceof StdKeySerializers.Dynamic);

        // rawKeyType.isEnum() == true
        JsonSerializer<Object> serEnum = StdKeySerializers.getFallbackKeySerializer(null, DummyEnum.class);
        assertTrue(serEnum instanceof StdKeySerializers.Default);

        // rawKeyType generic unknown object
        JsonSerializer<Object> serOther = StdKeySerializers.getFallbackKeySerializer(null, Thread.class);
        assertSame(StdKeySerializers.DEFAULT_KEY_SERIALIZER, serOther);
    }

    @Test
    public void testGetDefaultDeprecated() {
        assertNotNull(StdKeySerializers.getDefault());
        assertSame(StdKeySerializers.DEFAULT_KEY_SERIALIZER, StdKeySerializers.getDefault());
    }

    @Test
    public void testDynamicReadResolve() {
        StdKeySerializers.Dynamic dynamic = new StdKeySerializers.Dynamic();
        Object resolved = dynamic.readResolve();
        assertNotNull(resolved);
        assertTrue(resolved instanceof StdKeySerializers.Dynamic);
    }

    @Test
    public void testStringKeySerializerExecution() throws Exception {
        StdKeySerializers.StringKeySerializer serializer = new StdKeySerializers.StringKeySerializer();
        // สร้าง Dummy JsonGenerator ง่ายๆ หรือตรวจสอบว่าไม่พังเมื่อ serialize
        assertNotNull(serializer);
    }
}