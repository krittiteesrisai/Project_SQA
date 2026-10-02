package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.lang.reflect.Field;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
// ระบุ import ของคลาสเป้าหมายให้ชัดเจนตามที่กำหนด (แม้อยู่ package เดียวกันก็ import ได้ ไม่ error)
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;

public class NumberSerializersTest {

    private Map<String, JsonSerializer<?>> map;

    @Before
    public void setUp() {
        map = new HashMap<String, JsonSerializer<?>>();
    }

    // ==================================================================
    // addAll()
    // ==================================================================

    @Test
    public void testAddAll_putsAllExpectedKeys() {
        NumberSerializers.addAll(map);

        assertTrue(map.containsKey(Integer.class.getName()));
        assertTrue(map.containsKey(Integer.TYPE.getName()));
        assertTrue(map.containsKey(Long.class.getName()));
        assertTrue(map.containsKey(Long.TYPE.getName()));
        assertTrue(map.containsKey(Byte.class.getName()));
        assertTrue(map.containsKey(Byte.TYPE.getName()));
        assertTrue(map.containsKey(Short.class.getName()));
        assertTrue(map.containsKey(Short.TYPE.getName()));
        assertTrue(map.containsKey(Double.class.getName()));
        assertTrue(map.containsKey(Double.TYPE.getName()));
        assertTrue(map.containsKey(Float.class.getName()));
        assertTrue(map.containsKey(Float.TYPE.getName()));
        assertEquals(12, map.size());
    }

    @Test
    public void testAddAll_instanceTypesAreCorrect() {
        NumberSerializers.addAll(map);

        assertTrue(map.get(Integer.class.getName()) instanceof NumberSerializers.IntegerSerializer);
        assertTrue(map.get(Integer.TYPE.getName()) instanceof NumberSerializers.IntegerSerializer);
        assertTrue(map.get(Long.class.getName()) instanceof NumberSerializers.LongSerializer);
        assertTrue(map.get(Long.TYPE.getName()) instanceof NumberSerializers.LongSerializer);
        assertTrue(map.get(Byte.class.getName()) instanceof NumberSerializers.IntLikeSerializer);
        assertTrue(map.get(Byte.TYPE.getName()) instanceof NumberSerializers.IntLikeSerializer);
        assertTrue(map.get(Short.class.getName()) instanceof NumberSerializers.ShortSerializer);
        assertTrue(map.get(Short.TYPE.getName()) instanceof NumberSerializers.ShortSerializer);
        assertTrue(map.get(Double.class.getName()) instanceof NumberSerializers.DoubleSerializer);
        assertTrue(map.get(Double.TYPE.getName()) instanceof NumberSerializers.DoubleSerializer);
        assertTrue(map.get(Float.class.getName()) instanceof NumberSerializers.FloatSerializer);
        assertTrue(map.get(Float.TYPE.getName()) instanceof NumberSerializers.FloatSerializer);
    }

    @Test
    public void testAddAll_singletonSharingBehaviour() {
        NumberSerializers.addAll(map);
        // Byte/byte, Short/short, Float/float ใช้ instance เดียวกัน (static singleton) ตามซอร์ส
        assertSame(map.get(Byte.class.getName()), map.get(Byte.TYPE.getName()));
        assertSame(map.get(Short.class.getName()), map.get(Short.TYPE.getName()));
        assertSame(map.get(Float.class.getName()), map.get(Float.TYPE.getName()));
        // Integer/int และ Long/long สร้าง instance ใหม่แยกกันตามซอร์ส (new IntegerSerializer(...))
        assertNotSame(map.get(Integer.class.getName()), map.get(Integer.TYPE.getName()));
        assertNotSame(map.get(Long.class.getName()), map.get(Long.TYPE.getName()));
    }

    // ==================================================================
    // serialize() / serializeWithType() ของ concrete serializers
    // ==================================================================

    @Test
    public void testShortSerializer_serialize() throws Exception {
        NumberSerializers.ShortSerializer ser = new NumberSerializers.ShortSerializer();
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        Short value = (short) 42;

        ser.serialize(value, gen, prov);

        verify(gen, times(1)).writeNumber((short) 42);
    }

    @Test(expected = ClassCastException.class)
    public void testShortSerializer_serialize_wrongType_throwsCCE() throws Exception {
        NumberSerializers.ShortSerializer ser = new NumberSerializers.ShortSerializer();
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        ser.serialize("not-a-short", gen, prov); // malformed input
    }

    @Test
    public void testIntegerSerializer_serialize() throws Exception {
        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer(Integer.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        ser.serialize(123, gen, prov);

        verify(gen, times(1)).writeNumber(123);
    }

    @Test
    public void testIntegerSerializer_serialize_boundaryValues() throws Exception {
        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer(Integer.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        ser.serialize(Integer.MAX_VALUE, gen, prov);
        ser.serialize(Integer.MIN_VALUE, gen, prov);

        verify(gen).writeNumber(Integer.MAX_VALUE);
        verify(gen).writeNumber(Integer.MIN_VALUE);
    }

    @Test(expected = NullPointerException.class)
    public void testIntegerSerializer_serialize_nullValue_throwsNPE() throws Exception {
        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer(Integer.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        ser.serialize(null, gen, prov); // ค่า null -> คาดว่า NPE จาก ((Integer) value).intValue()
    }

    @Test(expected = ClassCastException.class)
    public void testIntegerSerializer_serialize_wrongType_throwsCCE() throws Exception {
        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer(Integer.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        ser.serialize("abc", gen, prov); // อินพุตผิดรูปแบบ
    }

    @Test
    public void testIntegerSerializer_serializeWithType_delegatesToSerialize() throws Exception {
        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer(Integer.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        ser.serializeWithType(7, gen, prov, typeSer);

        verify(gen, times(1)).writeNumber(7);
        verifyZeroInteractions(typeSer); // ตามซอร์ส: ไม่มีการใส่ type info เลย
    }

    @Test
    public void testIntLikeSerializer_serialize_usesNumberIntValue() throws Exception {
        NumberSerializers.IntLikeSerializer ser = new NumberSerializers.IntLikeSerializer();
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        BigInteger value = BigInteger.valueOf(9999);

        ser.serialize(value, gen, prov);

        verify(gen, times(1)).writeNumber(9999);
    }

    @Test(expected = NullPointerException.class)
    public void testIntLikeSerializer_serialize_nullValue_throwsNPE() throws Exception {
        NumberSerializers.IntLikeSerializer ser = new NumberSerializers.IntLikeSerializer();
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        ser.serialize(null, gen, prov);
    }

    @Test
    public void testLongSerializer_serialize() throws Exception {
        NumberSerializers.LongSerializer ser = new NumberSerializers.LongSerializer(Long.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        ser.serialize(123456789012345L, gen, prov);

        verify(gen, times(1)).writeNumber(123456789012345L);
    }

    @Test
    public void testFloatSerializer_serialize() throws Exception {
        NumberSerializers.FloatSerializer ser = new NumberSerializers.FloatSerializer();
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        ser.serialize(3.14f, gen, prov);

        verify(gen, times(1)).writeNumber(3.14f);
    }

    @Test
    public void testDoubleSerializer_serialize() throws Exception {
        NumberSerializers.DoubleSerializer ser = new NumberSerializers.DoubleSerializer(Double.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        ser.serialize(2.718, gen, prov);

        verify(gen, times(1)).writeNumber(2.718);
    }

    @Test
    public void testDoubleSerializer_serialize_specialValues() throws Exception {
        NumberSerializers.DoubleSerializer ser = new NumberSerializers.DoubleSerializer(Double.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        ser.serialize(Double.NaN, gen, prov);
        ser.serialize(Double.POSITIVE_INFINITY, gen, prov);
        ser.serialize(Double.NEGATIVE_INFINITY, gen, prov);

        verify(gen).writeNumber(Double.NaN);
        verify(gen).writeNumber(Double.POSITIVE_INFINITY);
        verify(gen).writeNumber(Double.NEGATIVE_INFINITY);
    }

    @Test
    public void testDoubleSerializer_serializeWithType_delegatesToSerialize() throws Exception {
        NumberSerializers.DoubleSerializer ser = new NumberSerializers.DoubleSerializer(Double.class);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        ser.serializeWithType(1.5, gen, prov, typeSer);

        verify(gen, times(1)).writeNumber(1.5);
        verifyZeroInteractions(typeSer);
    }

    // ==================================================================
    // getSchema()
    // NOTE: โครงสร้างภายในของ createSchemaNode(...) ไม่ได้อยู่ในซอร์สที่ให้มา
    // จึงอนุมานเพียงว่า field "type" จะมีค่าตรงกับ _schemaType ตามรูปแบบมาตรฐานของ
    // Jackson JsonSchema ยุคนั้น หากไม่ตรงถือว่าสมมติฐานนี้ผิด (ควรปรับปรุง)
    // ==================================================================

    @Test
    public void testGetSchema_integerType() {
        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer(Integer.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        JsonNode schema = ser.getSchema(prov, null);

        assertNotNull(schema);
        assertEquals("integer", schema.get("type").asText());
    }

    @Test
    public void testGetSchema_numberType() {
        NumberSerializers.DoubleSerializer ser = new NumberSerializers.DoubleSerializer(Double.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        JsonNode schema = ser.getSchema(prov, null);

        assertNotNull(schema);
        assertEquals("number", schema.get("type").asText());
    }

    // ==================================================================
    // acceptJsonFormatVisitor(): if (_isInt) ... else ...
    // NOTE: พฤติกรรมภายในของ visitIntFormat()/visitFloatFormat() (inherited helper)
    // ไม่มีอยู่ในซอร์สที่ให้มา จึงตรวจสอบเพียงว่า branch ที่ถูกเลือก (int vs float)
    // เรียกเมธอดของ visitor ตาม API มาตรฐานของ Jackson (expectIntegerFormat/expectNumberFormat)
    // โดยไม่ยืนยันรายละเอียด implementation เพิ่มเติม
    // ==================================================================

    @Test
    public void testAcceptJsonFormatVisitor_intBranch_integerSerializer() throws Exception {
        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer(Integer.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType type = TypeFactory.defaultInstance().constructType(Integer.class);

        ser.acceptJsonFormatVisitor(visitor, type);

        verify(visitor, atLeastOnce()).expectIntegerFormat(type);
        verify(visitor, never()).expectNumberFormat(any(JavaType.class));
    }

    @Test
    public void testAcceptJsonFormatVisitor_intBranch_shortSerializer() throws Exception {
        NumberSerializers.ShortSerializer ser = new NumberSerializers.ShortSerializer();
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType type = TypeFactory.defaultInstance().constructType(Short.class);

        ser.acceptJsonFormatVisitor(visitor, type);

        verify(visitor, atLeastOnce()).expectIntegerFormat(type);
    }

    @Test
    public void testAcceptJsonFormatVisitor_intBranch_longSerializer() throws Exception {
        NumberSerializers.LongSerializer ser = new NumberSerializers.LongSerializer(Long.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType type = TypeFactory.defaultInstance().constructType(Long.class);

        ser.acceptJsonFormatVisitor(visitor, type);

        verify(visitor, atLeastOnce()).expectIntegerFormat(type);
    }

    @Test
    public void testAcceptJsonFormatVisitor_floatBranch_doubleSerializer() throws Exception {
        NumberSerializers.DoubleSerializer ser = new NumberSerializers.DoubleSerializer(Double.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType type = TypeFactory.defaultInstance().constructType(Double.class);

        ser.acceptJsonFormatVisitor(visitor, type);

        verify(visitor, atLeastOnce()).expectNumberFormat(type);
        verify(visitor, never()).expectIntegerFormat(any(JavaType.class));
    }

    @Test
    public void testAcceptJsonFormatVisitor_floatBranch_floatSerializer() throws Exception {
        NumberSerializers.FloatSerializer ser = new NumberSerializers.FloatSerializer();
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType type = TypeFactory.defaultInstance().constructType(Float.class);

        ser.acceptJsonFormatVisitor(visitor, type);

        verify(visitor, atLeastOnce()).expectNumberFormat(type);
    }

    // ==================================================================
    // createContextual(): format==null / shape==STRING / shape!=STRING(default)
    // ใช้ spy + stub เมธอด findFormatOverrides(...) โดยตรง เพื่อไม่ต้องพึ่งพา
    // การตีความ logic ภายในของเมธอดนั้น (ซึ่งไม่ได้อยู่ในซอร์สที่ให้มา)
    // ==================================================================

    @Test
    public void testCreateContextual_formatNull_returnsSelf() throws Exception {
        NumberSerializers.IntegerSerializer spySer =
                spy(new NumberSerializers.IntegerSerializer(Integer.class));
        SerializerProvider prov = mock(SerializerProvider.class);
        BeanProperty prop = mock(BeanProperty.class);

        doReturn(null).when(spySer)
                .findFormatOverrides(any(SerializerProvider.class), any(BeanProperty.class), any(Class.class));

        JsonSerializer<?> result = spySer.createContextual(prov, prop);

        assertSame(spySer, result);
    }

    @Test
    public void testCreateContextual_formatShapeString_returnsToStringSerializer() throws Exception {
        NumberSerializers.IntegerSerializer spySer =
                spy(new NumberSerializers.IntegerSerializer(Integer.class));
        SerializerProvider prov = mock(SerializerProvider.class);
        BeanProperty prop = mock(BeanProperty.class);

        JsonFormat.Value stringFormat = mock(JsonFormat.Value.class);
        when(stringFormat.getShape()).thenReturn(JsonFormat.Shape.STRING);

        doReturn(stringFormat).when(spySer)
                .findFormatOverrides(any(SerializerProvider.class), any(BeanProperty.class), any(Class.class));

        JsonSerializer<?> result = spySer.createContextual(prov, prop);

        assertSame(ToStringSerializer.instance, result);
    }

    @Test
    public void testCreateContextual_formatShapeOther_returnsSelf() throws Exception {
        NumberSerializers.IntegerSerializer spySer =
                spy(new NumberSerializers.IntegerSerializer(Integer.class));
        SerializerProvider prov = mock(SerializerProvider.class);
        BeanProperty prop = mock(BeanProperty.class);

        JsonFormat.Value otherFormat = mock(JsonFormat.Value.class);
        when(otherFormat.getShape()).thenReturn(JsonFormat.Shape.ANY); // ไม่ใช่ STRING -> เข้า default

        doReturn(otherFormat).when(spySer)
                .findFormatOverrides(any(SerializerProvider.class), any(BeanProperty.class), any(Class.class));

        JsonSerializer<?> result = spySer.createContextual(prov, prop);

        assertSame(spySer, result);
    }

    // ==================================================================
    // Base constructor: _isInt = (INT || LONG || BIG_INTEGER)
    // ==================================================================

    @Test
    public void testIsIntFlag_trueForIntNumberType() throws Exception {
        assertTrue(readIsInt(new NumberSerializers.IntegerSerializer(Integer.class)));
        assertTrue(readIsInt(new NumberSerializers.ShortSerializer()));
        assertTrue(readIsInt(new NumberSerializers.IntLikeSerializer()));
    }

    @Test
    public void testIsIntFlag_trueForLongNumberType() throws Exception {
        assertTrue(readIsInt(new NumberSerializers.LongSerializer(Long.class)));
    }

    @Test
    public void testIsIntFlag_falseForDoubleNumberType() throws Exception {
        assertFalse(readIsInt(new NumberSerializers.DoubleSerializer(Double.class)));
    }

    @Test
    public void testIsIntFlag_falseForFloatNumberType() throws Exception {
        assertFalse(readIsInt(new NumberSerializers.FloatSerializer()));
    }

    private boolean readIsInt(NumberSerializers.Base<?> ser) throws Exception {
        Field f = NumberSerializers.Base.class.getDeclaredField("_isInt");
        f.setAccessible(true);
        return f.getBoolean(ser);
    }
}
