# วิเคราะห์และแนวทางการทดสอบ

คลาส `NumberDeserializers` เป็นคลาส container ที่มี method `find()` (static factory) และ nested static class หลายตัวที่ extends จาก `StdScalarDeserializer` ซึ่งมาจาก jackson-databind (compile-time dependency ของโปรเจกต์ Defects4J เอง ไม่ใช่ jar ใน classpath ที่ระบุ)

**หมายเหตุสำคัญ:** เนื่องจากคลาสเป้าหมายเรียกใช้ helper methods ที่สืบทอดมา (เช่น `_parseInteger`, `_parseBoolean`, `_isNaN`, `_failDoubleToIntCoercion` ฯลฯ) ซึ่งไม่ได้แสดง source ให้มา — ทดสอบเหล่านี้จึงอ้างอิงพฤติกรรมมาตรฐานของ Jackson (ที่ compile คู่กับคลาสนี้จริงในโปรเจกต์) และมีการ comment กำกับจุดที่ "ไม่แน่ใจ 100%" ไว้ชัดเจน ส่วน branch/condition ที่**เห็นชัดในซอร์สที่ให้มา**(if/else ทุกจุดใน `find()`, switch-case ทุก case ใน deserializer แต่ละตัว) จะถูกทดสอบให้ครบ

```java
package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer;

/**
 * Unit tests for {@link NumberDeserializers}.
 *
 * หมายเหตุ: การทดสอบ deserialize() ผ่าน ObjectMapper จริง
 * เนื่องจาก DeserializationContext เป็น abstract class ที่ mock ยาก
 * และพฤติกรรมของ helper method ที่สืบทอดมา (_parseXxx, _isNaN, ฯลฯ)
 * ไม่ได้แสดงใน source ที่ให้มา จึงอ้างอิงพฤติกรรมมาตรฐานของไลบรารีจริง
 * (ระบุ comment กำกับจุดที่ไม่สามารถยืนยันจาก source ได้ 100%)
 */
public class NumberDeserializersTest {

    // ---------------------------------------------------------------
    // find() : primitive branch
    // ---------------------------------------------------------------

    @Test
    public void testFind_PrimitiveInt() {
        assertSame(IntegerDeserializer.primitiveInstance,
                NumberDeserializers.find(Integer.TYPE, Integer.TYPE.getName()));
    }

    @Test
    public void testFind_PrimitiveBoolean() {
        assertSame(BooleanDeserializer.primitiveInstance,
                NumberDeserializers.find(Boolean.TYPE, Boolean.TYPE.getName()));
    }

    @Test
    public void testFind_PrimitiveLong() {
        assertSame(LongDeserializer.primitiveInstance,
                NumberDeserializers.find(Long.TYPE, Long.TYPE.getName()));
    }

    @Test
    public void testFind_PrimitiveDouble() {
        assertSame(DoubleDeserializer.primitiveInstance,
                NumberDeserializers.find(Double.TYPE, Double.TYPE.getName()));
    }

    @Test
    public void testFind_PrimitiveChar() {
        assertSame(CharacterDeserializer.primitiveInstance,
                NumberDeserializers.find(Character.TYPE, Character.TYPE.getName()));
    }

    @Test
    public void testFind_PrimitiveByte() {
        assertSame(ByteDeserializer.primitiveInstance,
                NumberDeserializers.find(Byte.TYPE, Byte.TYPE.getName()));
    }

    @Test
    public void testFind_PrimitiveShort() {
        assertSame(ShortDeserializer.primitiveInstance,
                NumberDeserializers.find(Short.TYPE, Short.TYPE.getName()));
    }

    @Test
    public void testFind_PrimitiveFloat() {
        assertSame(FloatDeserializer.primitiveInstance,
                NumberDeserializers.find(Float.TYPE, Float.TYPE.getName()));
    }

    // primitive type ที่ไม่มี if ใดตรง (void) -> fall-through ไปโยน exception
    @Test(expected = IllegalArgumentException.class)
    public void testFind_PrimitiveVoid_ThrowsIllegalArgumentException() {
        NumberDeserializers.find(Void.TYPE, Void.TYPE.getName());
    }

    // ---------------------------------------------------------------
    // find() : wrapper / _classNames branch
    // ---------------------------------------------------------------

    @Test
    public void testFind_WrapperInteger() {
        assertSame(IntegerDeserializer.wrapperInstance,
                NumberDeserializers.find(Integer.class, Integer.class.getName()));
    }

    @Test
    public void testFind_WrapperBoolean() {
        assertSame(BooleanDeserializer.wrapperInstance,
                NumberDeserializers.find(Boolean.class, Boolean.class.getName()));
    }

    @Test
    public void testFind_WrapperLong() {
        assertSame(LongDeserializer.wrapperInstance,
                NumberDeserializers.find(Long.class, Long.class.getName()));
    }

    @Test
    public void testFind_WrapperDouble() {
        assertSame(DoubleDeserializer.wrapperInstance,
                NumberDeserializers.find(Double.class, Double.class.getName()));
    }

    @Test
    public void testFind_WrapperCharacter() {
        assertSame(CharacterDeserializer.wrapperInstance,
                NumberDeserializers.find(Character.class, Character.class.getName()));
    }

    @Test
    public void testFind_WrapperByte() {
        assertSame(ByteDeserializer.wrapperInstance,
                NumberDeserializers.find(Byte.class, Byte.class.getName()));
    }

    @Test
    public void testFind_WrapperShort() {
        assertSame(ShortDeserializer.wrapperInstance,
                NumberDeserializers.find(Short.class, Short.class.getName()));
    }

    @Test
    public void testFind_WrapperFloat() {
        assertSame(FloatDeserializer.wrapperInstance,
                NumberDeserializers.find(Float.class, Float.class.getName()));
    }

    @Test
    public void testFind_Number() {
        assertSame(NumberDeserializer.instance,
                NumberDeserializers.find(Number.class, Number.class.getName()));
    }

    @Test
    public void testFind_BigDecimal() {
        assertSame(BigDecimalDeserializer.instance,
                NumberDeserializers.find(BigDecimal.class, BigDecimal.class.getName()));
    }

    @Test
    public void testFind_BigInteger() {
        assertSame(BigIntegerDeserializer.instance,
                NumberDeserializers.find(BigInteger.class, BigInteger.class.getName()));
    }

    // ---------------------------------------------------------------
    // find() : else branch (clsName ไม่อยู่ใน _classNames) -> null
    // ---------------------------------------------------------------

    @Test
    public void testFind_UnknownClass_ReturnsNull() {
        assertNull(NumberDeserializers.find(String.class, String.class.getName()));
    }

    // ---------------------------------------------------------------
    // find() : clsName ตรงกับ _classNames แต่ rawType ไม่ match กับ if ใดเลย
    // -> เข้าเงื่อนไข "should never occur" throw
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testFind_MismatchedClsNameAndRawType_ThrowsIllegalArgumentException() {
        // rawType=String.class ไม่ตรงกับ if ใดเลย แต่ clsName="java.lang.Integer"
        // อยู่ใน _classNames set ทำให้เข้า branch else-if แล้ว fall-through ไป throw
        NumberDeserializers.find(String.class, Integer.class.getName());
    }

    // =================================================================
    // Deserialization behavior ผ่าน ObjectMapper (ทดสอบ branch ภายใน
    // deserialize()/deserializeWithType() ของแต่ละ nested class)
    // =================================================================

    // ---------------- IntegerDeserializer ----------------

    @Test
    public void testDeserializeInteger_FromNumberToken() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Integer v = mapper.readValue("123", Integer.class);
        assertEquals(Integer.valueOf(123), v);
    }

    @Test
    public void testDeserializeInteger_FromStringToken() throws Exception {
        // ทดสอบ branch: !hasToken(VALUE_NUMBER_INT) -> _parseInteger(p, ctxt)
        ObjectMapper mapper = new ObjectMapper();
        Integer v = mapper.readValue("\"456\"", Integer.class);
        assertEquals(Integer.valueOf(456), v);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeInteger_InvalidString_Throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("\"abc\"", Integer.class);
    }

    @Test
    public void testDeserializeWrapperInteger_NullValue_ReturnsNull() throws Exception {
        // wrapperInstance._nullValue == null, ไม่ใช่ primitive จึงไม่ throw
        ObjectMapper mapper = new ObjectMapper();
        Integer v = mapper.readValue("null", Integer.class);
        assertNull(v);
    }

    @Test
    public void testDeserializePrimitiveInt_NullValue_DefaultZero() throws Exception {
        // getNullValue(): _primitive=true, FAIL_ON_NULL_FOR_PRIMITIVES default = false
        // -> คืน _nullValue (0), ไม่ throw
        ObjectMapper mapper = new ObjectMapper();
        int v = mapper.readValue("null", int.class);
        assertEquals(0, v);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializePrimitiveInt_NullValue_FailOnNullEnabled_Throws() throws Exception {
        // เปิด FAIL_ON_NULL_FOR_PRIMITIVES -> เข้า branch throw ใน getNullValue()
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, true);
        mapper.readValue("null", int.class);
    }

    @Test
    public void testIntegerDeserializer_isCachable_True() {
        assertTrue(IntegerDeserializer.wrapperInstance.isCachable());
    }

    @Test
    public void testGetNullValueDeprecatedNoArg() {
        assertNull(IntegerDeserializer.wrapperInstance.getNullValue());
        assertEquals(Integer.valueOf(0), IntegerDeserializer.primitiveInstance.getNullValue());
    }

    // ---------------- BooleanDeserializer ----------------

    @Test
    public void testDeserializeBoolean_True() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Boolean v = mapper.readValue("true", Boolean.class);
        assertTrue(v);
    }

    @Test
    public void testDeserializeBoolean_False() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Boolean v = mapper.readValue("false", Boolean.class);
        assertFalse(v);
    }

    // ---------------- LongDeserializer ----------------

    @Test
    public void testDeserializeLong_BoundaryMaxValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Long v = mapper.readValue(String.valueOf(Long.MAX_VALUE), Long.class);
        assertEquals(Long.valueOf(Long.MAX_VALUE), v);
    }

    @Test
    public void testLongDeserializer_isCachable_True() {
        assertTrue(LongDeserializer.wrapperInstance.isCachable());
    }

    // ---------------- Short / Byte / Float / Double ----------------

    @Test
    public void testDeserializeShort_Valid() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Short v = mapper.readValue("100", Short.class);
        assertEquals(Short.valueOf((short) 100), v);
    }

    @Test
    public void testDeserializeByte_Valid() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Byte v = mapper.readValue("10", Byte.class);
        assertEquals(Byte.valueOf((byte) 10), v);
    }

    @Test
    public void testDeserializeFloat_Valid() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Float v = mapper.readValue("1.5", Float.class);
        assertEquals(Float.valueOf(1.5f), v);
    }

    @Test
    public void testDeserializeDouble_Valid() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Double v = mapper.readValue("2.5", Double.class);
        assertEquals(Double.valueOf(2.5d), v);
    }

    // ---------------- CharacterDeserializer : ทุก case ของ switch ----------------

    @Test
    public void testDeserializeCharacter_FromSingleCharString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Character c = mapper.readValue("\"A\"", Character.class);
        assertEquals(Character.valueOf('A'), c);
    }

    @Test
    public void testDeserializeCharacter_FromEmptyString_ReturnsEmptyValue() throws Exception {
        // text.length()==0 -> return (Character) getEmptyValue(ctxt)
        ObjectMapper mapper = new ObjectMapper();
        Character c = mapper.readValue("\"\"", Character.class);
        assertNull(c);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeCharacter_FromMultiCharString_Throws() throws Exception {
        // text.length() > 1 -> break -> throw mappingException
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("\"AB\"", Character.class);
    }

    @Test
    public void testDeserializeCharacter_FromIntInRange() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Character c = mapper.readValue("65", Character.class);
        assertEquals(Character.valueOf('A'), c);
    }

    @Test
    public void testDeserializeCharacter_FromIntBoundary_UpperBound() throws Exception {
        // ทดสอบ boundary value>=0 && value<=0xFFFF (0xFFFF)
        ObjectMapper mapper = new ObjectMapper();
        Character c = mapper.readValue("65535", Character.class);
        assertEquals(Character.valueOf((char) 0xFFFF), c);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeCharacter_FromIntOutOfRange_Negative_Throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("-1", Character.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeCharacter_FromIntOutOfRange_TooLarge_Throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("65536", Character.class);
    }

    @Test
    public void testDeserializeCharacter_UnwrapSingleValueArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        Character c = mapper.readValue("[\"A\"]", Character.class);
        assertEquals(Character.valueOf('A'), c);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeCharacter_ArrayWithoutUnwrapFeature_Throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("[\"A\"]", Character.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeCharacter_UnwrapArrayMoreThanOneValue_Throws() throws Exception {
        // เข้า if(UNWRAP..) แล้ว nextToken() หลัง value ไม่ใช่ END_ARRAY -> throw wrongTokenException
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        mapper.readValue("[\"A\",\"B\"]", Character.class);
    }

    // ---------------- NumberDeserializer (Number.class) ----------------

    @Test
    public void testDeserializeNumber_Int() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Number n = mapper.readValue("42", Number.class);
        assertEquals(42, n.intValue());
    }

    @Test
    public void testDeserializeNumber_Float_DefaultDouble() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Number n = mapper.readValue("3.14", Number.class);
        assertTrue(n instanceof Double);
    }

    @Test
    public void testDeserializeNumber_FloatWithBigDecimalFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true);
        Number n = mapper.readValue("3.14", Number.class);
        assertTrue(n instanceof BigDecimal);
    }

    @Test
    public void testDeserializeNumber_StringEmpty_ReturnsEmptyValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Number n = mapper.readValue("\"\"", Number.class);
        assertNull(n);
    }

    @Test
    public void testDeserializeNumber_StringIntWithinIntRange() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Number n = mapper.readValue("\"123\"", Number.class);
        assertTrue(n instanceof Integer);
        assertEquals(Integer.valueOf(123), n);
    }

    @Test
    public void testDeserializeNumber_StringIntOverflowsToLong() throws Exception {
        long big = ((long) Integer.MAX_VALUE) + 100L;
        ObjectMapper mapper = new ObjectMapper();
        Number n = mapper.readValue("\"" + big + "\"", Number.class);
        assertTrue(n instanceof Long);
        assertEquals(Long.valueOf(big), n);
    }

    @Test
    public void testDeserializeNumber_StringIntWithUseLongForInts() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.USE_LONG_FOR_INTS, true);
        Number n = mapper.readValue("\"123\"", Number.class);
        assertTrue(n instanceof Long);
    }

    @Test
    public void testDeserializeNumber_StringIntWithUseBigIntegerForInts() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS, true);
        Number n = mapper.readValue("\"123\"", Number.class);
        assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testDeserializeNumber_StringFloatNumber() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Number n = mapper.readValue("\"3.14\"", Number.class);
        assertTrue(n instanceof Double);
    }

    // สมมติฐาน: "NaN"/"Infinity"/"-Infinity" เป็น token มาตรฐานที่ _isNaN/_isPosInf/_isNegInf
    // ตรวจจับได้ (ไม่มี source ของ helper method แนบมา แต่เป็นพฤติกรรมมาตรฐานของ Jackson)
    @Test
    public void testDeserializeNumber_StringNaN() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Number n = mapper.readValue("\"NaN\"", Number.class);
        assertEquals(Double.NaN, n);
    }

    @Test
    public void testDeserializeNumber_StringPositiveInfinity() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Number n = mapper.readValue("\"Infinity\"", Number.class);
        assertEquals(Double.POSITIVE_INFINITY, n);
    }

    @Test
    public void testDeserializeNumber_StringNegativeInfinity() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Number n = mapper.readValue("\"-Infinity\"", Number.class);
        assertEquals(Double.NEGATIVE_INFINITY, n);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeNumber_InvalidStringNumber_Throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("\"not-a-number\"", Number.class);
    }

    @Test
    public void testDeserializeNumber_UnwrapSingleValueArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        Number n = mapper.readValue("[42]", Number.class);
        assertEquals(42, n.intValue());
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeNumber_ArrayWithoutUnwrap_Throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("[42]", Number.class);
    }

    // ---------------- BigIntegerDeserializer ----------------

    @Test
    public void testDeserializeBigInteger_FromIntToken() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BigInteger v = mapper.readValue("123456789012345", BigInteger.class);
        assertEquals(new BigInteger("123456789012345"), v);
    }

    @Test
    public void testDeserializeBigInteger_FromFloat_AcceptFloatAsIntDefaultTrue() throws Exception {
        // สมมติฐาน: ACCEPT_FLOAT_AS_INT default = true (ค่ามาตรฐานของไลบรารี)
        ObjectMapper mapper = new ObjectMapper();
        BigInteger v = mapper.readValue("3.9", BigInteger.class);
        assertEquals(BigInteger.valueOf(3), v);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeBigInteger_FromFloat_RejectFloatAsInt_Throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_FLOAT_AS_INT, false);
        mapper.readValue("3.9", BigInteger.class);
    }

    @Test
    public void testDeserializeBigInteger_FromString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BigInteger v = mapper.readValue("\"98765432109876543210\"", BigInteger.class);
        assertEquals(new BigInteger("98765432109876543210"), v);
    }

    @Test
    public void testDeserializeBigInteger_FromEmptyString_ReturnsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BigInteger v = mapper.readValue("\"\"", BigInteger.class);
        assertNull(v);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeBigInteger_InvalidString_Throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("\"not-a-bigint\"", BigInteger.class);
    }

    @Test
    public void testDeserializeBigInteger_UnwrapSingleValueArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        BigInteger v = mapper.readValue("[123]", BigInteger.class);
        assertEquals(BigInteger.valueOf(123), v);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeBigInteger_ArrayWithoutUnwrap_Throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("[123]", BigInteger.class);
    }

    // ---------------- BigDecimalDeserializer ----------------

    @Test
    public void testDeserializeBigDecimal_FromIntToken() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BigDecimal v = mapper.readValue("123", BigDecimal.class);
        assertEquals(new BigDecimal("123"), v);
    }

    @Test
    public void testDeserializeBigDecimal_FromFloatToken() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BigDecimal v = mapper.readValue("3.14", BigDecimal.class);
        assertEquals(new BigDecimal("3.14"), v);
    }

    @Test
    public void testDeserializeBigDecimal_FromString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BigDecimal v = mapper.readValue("\"12.34\"", BigDecimal.class);
        assertEquals(new BigDecimal("12.34"), v);
    }

    @Test
    public void testDeserializeBigDecimal_FromEmptyString_ReturnsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BigDecimal v = mapper.readValue("\"\"", BigDecimal.class);
        assertNull(v);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeBigDecimal_InvalidString_Throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("\"not-a-decimal\"", BigDecimal.class);
    }

    @Test
    public void testDeserializeBigDecimal_UnwrapSingleValueArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        BigDecimal v = mapper.readValue("[1.23]", BigDecimal.class);
        assertEquals(new BigDecimal("1.23"), v);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeBigDecimal_ArrayWithoutUnwrap_Throws() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("[1.23]", BigDecimal.class);
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testFind_PrimitiveInt/Boolean/Long/Double/Char/Byte/Short/Float | `find()`: ทุก `if (rawType == X.TYPE)` ใน primitive branch |
| testFind_PrimitiveVoid_ThrowsIllegalArgumentException | `find()`: primitive แต่ไม่ match ใด ๆ → throw (fall-through) |
| testFind_WrapperInteger/Boolean/.../BigInteger | `find()`: ทุก `if (rawType == X.class)` ใน else-if branch |
| testFind_UnknownClass_ReturnsNull | `find()`: else branch → return null |
| testFind_MismatchedClsNameAndRawType_ThrowsIllegalArgumentException | `find()`: clsName ตรง _classNames แต่ rawType ไม่ match → throw |
| testDeserializeInteger_FromNumberToken/FromStringToken/InvalidString | `IntegerDeserializer.deserialize`: hasToken true/false, error path |
| testDeserializeWrapperInteger_NullValue_ReturnsNull | `getNullValue`: !_primitive branch |
| testDeserializePrimitiveInt_NullValue_DefaultZero | `getNullValue`: _primitive && !enabled feature |
| testDeserializePrimitiveInt_NullValue_FailOnNullEnabled_Throws | `getNullValue`: _primitive && enabled feature → throw |
| testIntegerDeserializer_isCachable_True | `isCachable()` override |
| testGetNullValueDeprecatedNoArg | deprecated `getNullValue()` no-arg |
| testDeserializeBoolean_True/False | `BooleanDeserializer.deserialize`/`_parseBoolean` |
| testDeserializeLong_BoundaryMaxValue | `LongDeserializer`: boundary Long.MAX_VALUE, hasToken true |
| testDeserializeShort/Byte/Float/Double_Valid | ตัว deserializer พื้นฐานที่เหลือ |
| testDeserializeCharacter_FromSingleCharString | switch ID_STRING, length==1 |
| testDeserializeCharacter_FromEmptyString_ReturnsEmptyValue | switch ID_STRING, length==0 |
| testDeserializeCharacter_FromMultiCharString_Throws | switch ID_STRING, length>1 → break → throw |
| testDeserializeCharacter_FromIntInRange/UpperBound | switch ID_NUMBER_INT, boundary 0..0xFFFF |
| testDeserializeCharacter_FromIntOutOfRange_Negative/TooLarge_Throws | switch ID_NUMBER_INT, out-of-range → break → throw |
| testDeserializeCharacter_UnwrapSingleValueArray | switch ID_START_ARRAY, feature enabled |
| testDeserializeCharacter_ArrayWithoutUnwrapFeature_Throws | switch ID_START_ARRAY, feature disabled → fall-through → throw |
| testDeserializeCharacter_UnwrapArrayMoreThanOneValue_Throws | array unwrap, nextToken()!=END_ARRAY → throw |
| testDeserializeNumber_Int/Float_DefaultDouble/FloatWithBigDecimalFeature | `NumberDeserializer`: ID_NUMBER_INT/FLOAT branches |
| testDeserializeNumber_StringEmpty_ReturnsEmptyValue | ID_STRING, text.length()==0 |
| testDeserializeNumber_StringIntWithinIntRange/OverflowsToLong | ID_STRING, _isIntNumber true, Integer/Long branch |
| testDeserializeNumber_StringIntWithUseLongForInts/UseBigIntegerForInts | feature flags ภายใน ID_STRING integer path |
| testDeserializeNumber_StringFloatNumber | ID_STRING, !_isIntNumber, Double branch |
| testDeserializeNumber_StringNaN/PositiveInfinity/NegativeInfinity | ID_STRING, _isNaN/_isPosInf/_isNegInf branches |
| testDeserializeNumber_InvalidStringNumber_Throws | ID_STRING, catch IllegalArgumentException → weirdStringException |
| testDeserializeNumber_UnwrapSingleValueArray/ArrayWithoutUnwrap_Throws | ID_START_ARRAY branches |
| testDeserializeBigInteger_* (7 tests) | `BigIntegerDeserializer`: ทุก case switch (INT/FLOAT/STRING/ARRAY), ACCEPT_FLOAT_AS_INT true/false, empty string, invalid, array unwrap |
| testDeserializeBigDecimal_* (7 tests) | `BigDecimalDeserializer`: ทุก case switch (INT/FLOAT/STRING/ARRAY), empty string, invalid, array unwrap |

**ข้อจำกัดที่ต้องระบุ:** พฤติกรรมของ helper methods (`_parseXxx`, `_isNaN`, `_isPosInf`, `_isNegInf`, `_isIntNumber`, `_hasTextualNull`, `_failDoubleToIntCoercion`, ค่า default ของ `DeserializationFeature` ต่าง ๆ) ไม่ได้แสดงใน source ที่ให้มา — การทดสอบอ้างอิงพฤติกรรมมาตรฐานที่ทราบกันทั่วไปของไลบรารี Jackson จริง (ซึ่ง compile คู่กับคลาสนี้ในโปรเจกต์ Defects4J) และมี comment กำกับไว้ในแต่ละจุดที่เกี่ยวข้อง