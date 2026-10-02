ด้านล่างนี้เป็นชุดทดสอบ JUnit 4 สำหรับ `StdDeserializer` โดยใช้แนวทาง **white-box testing**: สร้าง concrete subclass เล็ก ๆ ของ `StdDeserializer` (เนื่องจากเป็น abstract class) วางไว้ใน package เดียวกัน เพื่อเรียก protected method ได้ตรง ๆ และใช้ `JsonParser` จริง (จาก jackson-core) ร่วมกับ `DeserializationContext` ที่ mock ด้วย Mockito เพื่อควบคุม feature flag ต่าง ๆ

> **หมายเหตุ/ข้อจำกัดที่ประกาศไว้ตามข้อกำหนดที่ 4** (ไม่เดา behavior ที่ไม่มีในซอร์ส):
> - ส่วนที่พึ่งพา `PropertyMetadata`, `BeanDeserializerBase`, และ positive-path ของ `findConvertingContentDeserializer` / `JsonFormat.Value` (ที่ต้อง "getFeature" จริง) ถูก**ข้าม**เพราะ API/constructor ที่แน่นอนไม่ได้ปรากฏในซอร์สที่ให้มา และการเดา constructor/factory method อาจทำให้ทดสอบ behavior ที่ไม่มีจริง
> - ใช้ `RuntimeException` แทนการสร้าง `JsonMappingException` จริงในกรณี "force exception" เพราะ constructor ของ `JsonMappingException` ไม่ได้ระบุในซอร์ส — RuntimeException สามารถโยนได้จากทุก method (unchecked) และยังตรวจสอบ branch ที่ควร throw ได้ถูกต้อง

```java
package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;

public class StdDeserializerTest {

    /* ================= Helper concrete subclasses ================= */

    static class ConcreteDeserializer extends StdDeserializer<Object> {
        private static final long serialVersionUID = 1L;
        ConcreteDeserializer() { super(Object.class); }
        ConcreteDeserializer(Class<?> vc) { super(vc); }
        ConcreteDeserializer(JavaType t) { super(t); }
        ConcreteDeserializer(StdDeserializer<?> src) { super(src); }
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null; // not under test directly
        }
    }

    @JacksonStdImpl
    static class AnnotatedDeserializer extends StdDeserializer<Object> {
        private static final long serialVersionUID = 1L;
        AnnotatedDeserializer() { super(Object.class); }
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
    }

    private ConcreteDeserializer deser;
    private DeserializationContext ctxt;
    private final JsonFactory factory = new JsonFactory();

    @Before
    public void setUp() {
        deser = new ConcreteDeserializer();
        ctxt = mock(DeserializationContext.class);
    }

    private JsonParser parserFor(String json) throws IOException {
        JsonParser p = factory.createParser(json);
        p.nextToken();
        return p;
    }

    /* ================= Constructors / accessors ================= */

    @Test
    public void constructor_withClass_setsHandledType() {
        ConcreteDeserializer d = new ConcreteDeserializer(String.class);
        assertEquals(String.class, d.handledType());
        assertEquals(String.class, d.getValueClass());
    }

    @Test
    public void constructor_withNullJavaType_fallsBackToObjectClass() {
        ConcreteDeserializer d = new ConcreteDeserializer((JavaType) null);
        assertEquals(Object.class, d.handledType());
    }

    @Test
    public void constructor_withJavaType_usesRawClass() {
        JavaType t = new ObjectMapper().getTypeFactory().constructType(Integer.class);
        ConcreteDeserializer d = new ConcreteDeserializer(t);
        assertEquals(Integer.class, d.handledType());
    }

    @Test
    public void copyConstructor_copiesValueClass() {
        ConcreteDeserializer src = new ConcreteDeserializer(Long.class);
        ConcreteDeserializer copy = new ConcreteDeserializer(src);
        assertEquals(Long.class, copy.handledType());
    }

    @Test
    public void getValueType_defaultIsNull() {
        assertNull(deser.getValueType());
    }

    /* ================= isDefaultDeserializer / isDefaultKeyDeserializer ================= */

    @Test
    public void isDefaultDeserializer_trueForAnnotated() {
        assertTrue(deser.isDefaultDeserializer(new AnnotatedDeserializer()));
    }

    @Test
    public void isDefaultDeserializer_falseForPlain() {
        assertFalse(deser.isDefaultDeserializer(new ConcreteDeserializer()));
    }

    @Test
    public void isDefaultKeyDeserializer_falseForPlainMock() {
        KeyDeserializer kd = mock(KeyDeserializer.class);
        assertFalse(deser.isDefaultKeyDeserializer(kd));
    }

    /* ================= deserializeWithType ================= */

    @Test
    public void deserializeWithType_delegatesToTypeDeserializer() throws IOException {
        TypeDeserializer td = mock(TypeDeserializer.class);
        JsonParser p = mock(JsonParser.class);
        Object expected = new Object();
        when(td.deserializeTypedFromAny(p, ctxt)).thenReturn(expected);
        Object actual = deser.deserializeWithType(p, ctxt, td);
        assertSame(expected, actual);
        verify(td).deserializeTypedFromAny(p, ctxt);
    }

    /* ================= _isEmptyOrTextualNull / _hasTextualNull ================= */

    @Test
    public void isEmptyOrTextualNull_emptyString() { assertTrue(deser._isEmptyOrTextualNull("")); }

    @Test
    public void isEmptyOrTextualNull_nullLiteral() { assertTrue(deser._isEmptyOrTextualNull("null")); }

    @Test
    public void isEmptyOrTextualNull_otherString() { assertFalse(deser._isEmptyOrTextualNull("abc")); }

    @Test
    public void hasTextualNull_true() { assertTrue(deser._hasTextualNull("null")); }

    @Test
    public void hasTextualNull_false() { assertFalse(deser._hasTextualNull("NULL")); }

    /* ================= _isIntNumber ================= */

    @Test
    public void isIntNumber_plainDigits() { assertTrue(deser._isIntNumber("12345")); }

    @Test
    public void isIntNumber_withMinusSign() { assertTrue(deser._isIntNumber("-123")); }

    @Test
    public void isIntNumber_withPlusSign() { assertTrue(deser._isIntNumber("+123")); }

    @Test
    public void isIntNumber_nonDigitFails() { assertFalse(deser._isIntNumber("12a3")); }

    @Test
    public void isIntNumber_emptyStringFails() { assertFalse(deser._isIntNumber("")); }

    /* ================= _isNegInf / _isPosInf / _isNaN ================= */

    @Test
    public void isNegInf_variants() {
        assertTrue(deser._isNegInf("-Infinity"));
        assertTrue(deser._isNegInf("-INF"));
        assertFalse(deser._isNegInf("Infinity"));
    }

    @Test
    public void isPosInf_variants() {
        assertTrue(deser._isPosInf("Infinity"));
        assertTrue(deser._isPosInf("INF"));
        assertFalse(deser._isPosInf("-INF"));
    }

    @Test
    public void isNaN_variants() {
        assertTrue(deser._isNaN("NaN"));
        assertFalse(deser._isNaN("nan"));
    }

    /* ================= overflow boundary checks ================= */

    @Test
    public void byteOverflow_boundaries() {
        assertTrue(deser._byteOverflow(Byte.MIN_VALUE - 1));
        assertFalse(deser._byteOverflow(Byte.MIN_VALUE));
        assertFalse(deser._byteOverflow(255));
        assertTrue(deser._byteOverflow(256));
    }

    @Test
    public void shortOverflow_boundaries() {
        assertTrue(deser._shortOverflow(Short.MIN_VALUE - 1));
        assertFalse(deser._shortOverflow(Short.MIN_VALUE));
        assertFalse(deser._shortOverflow(Short.MAX_VALUE));
        assertTrue(deser._shortOverflow(Short.MAX_VALUE + 1));
    }

    @Test
    public void intOverflow_boundaries() {
        assertTrue(deser._intOverflow((long) Integer.MIN_VALUE - 1));
        assertFalse(deser._intOverflow(Integer.MIN_VALUE));
        assertFalse(deser._intOverflow(Integer.MAX_VALUE));
        assertTrue(deser._intOverflow((long) Integer.MAX_VALUE + 1));
    }

    @Test
    public void nonNullNumber_withNull_returnsZero() {
        assertEquals(Integer.valueOf(0), deser._nonNullNumber(null));
    }

    @Test
    public void nonNullNumber_withValue_returnsSame() {
        Number n = Integer.valueOf(42);
        assertSame(n, deser._nonNullNumber(n));
    }

    /* ================= parseDouble (static) ================= */

    @Test
    public void parseDouble_nastySmallValue() {
        double d = StdDeserializer.parseDouble("2.2250738585072012e-308");
        assertEquals(Double.MIN_NORMAL, d, 0.0);
    }

    @Test
    public void parseDouble_normalValue() {
        assertEquals(3.14, StdDeserializer.parseDouble("3.14"), 0.0001);
    }

    /* ================= _parseBooleanPrimitive ================= */

    @Test
    public void parseBoolean_trueToken() throws IOException {
        assertTrue(deser._parseBooleanPrimitive(parserFor("true"), ctxt));
    }

    @Test
    public void parseBoolean_falseToken() throws IOException {
        assertFalse(deser._parseBooleanPrimitive(parserFor("false"), ctxt));
    }

    @Test
    public void parseBoolean_nullToken_failDisabled_returnsFalse() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)).thenReturn(false);
        assertFalse(deser._parseBooleanPrimitive(parserFor("null"), ctxt));
    }

    @Test(expected = RuntimeException.class)
    public void parseBoolean_nullToken_failEnabled_throws() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)).thenReturn(true);
        doThrow(new RuntimeException("forced")).when(ctxt).reportInputMismatch(any(), anyString());
        deser._parseBooleanPrimitive(parserFor("null"), ctxt);
    }

    @Test
    public void parseBoolean_intZero_returnsFalse() throws IOException {
        when(ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)).thenReturn(true);
        assertFalse(deser._parseBooleanPrimitive(parserFor("0"), ctxt));
    }

    @Test
    public void parseBoolean_intNonZero_returnsTrue() throws IOException {
        when(ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)).thenReturn(true);
        assertTrue(deser._parseBooleanPrimitive(parserFor("7"), ctxt));
    }

    @Test
    public void parseBoolean_stringTrueVariants() throws IOException {
        assertTrue(deser._parseBooleanPrimitive(parserFor("\"true\""), ctxt));
        assertTrue(deser._parseBooleanPrimitive(parserFor("\"True\""), ctxt));
    }

    @Test
    public void parseBoolean_stringFalseVariants() throws IOException {
        assertFalse(deser._parseBooleanPrimitive(parserFor("\"false\""), ctxt));
        assertFalse(deser._parseBooleanPrimitive(parserFor("\"False\""), ctxt));
    }

    @Test
    public void parseBoolean_emptyString_coercionAllowed_returnsFalse() throws IOException {
        when(ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)).thenReturn(true);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)).thenReturn(false);
        assertFalse(deser._parseBooleanPrimitive(parserFor("\"\""), ctxt));
    }

    @Test
    public void parseBoolean_weirdString_delegatesToHandleWeirdStringValue() throws IOException {
        when(ctxt.handleWeirdStringValue(any(), eq("maybe"), anyString())).thenReturn(Boolean.TRUE);
        assertTrue(deser._parseBooleanPrimitive(parserFor("\"maybe\""), ctxt));
    }

    @Test
    public void parseBoolean_arrayUnwrapEnabled_singleElement() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)).thenReturn(true);
        assertTrue(deser._parseBooleanPrimitive(parserFor("[true]"), ctxt));
    }

    @Test
    public void parseBoolean_arrayUnwrapDisabled_fallsToUnexpectedToken() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)).thenReturn(false);
        when(ctxt.handleUnexpectedToken(any(), any(JsonParser.class))).thenReturn(Boolean.FALSE);
        assertFalse(deser._parseBooleanPrimitive(parserFor("[true]"), ctxt));
    }

    @Test
    public void parseBoolean_arrayUnwrap_multiElement_reportsWrongToken() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)).thenReturn(true);
        boolean result = deser._parseBooleanPrimitive(parserFor("[true,true]"), ctxt);
        assertTrue(result);
        verify(ctxt).reportWrongTokenException(any(StdDeserializer.class), eq(JsonToken.END_ARRAY), anyString());
    }

    @Test
    public void parseBoolean_objectToken_fallsToUnexpectedToken() throws IOException {
        when(ctxt.handleUnexpectedToken(any(), any(JsonParser.class))).thenReturn(Boolean.FALSE);
        assertFalse(deser._parseBooleanPrimitive(parserFor("{}"), ctxt));
    }

    /* ================= _parseIntPrimitive(ctxt, text) overload ================= */

    @Test
    public void parseIntText_shortValid() throws IOException {
        assertEquals(123, deser._parseIntPrimitive(ctxt, "123"));
    }

    @Test
    public void parseIntText_longLengthNoOverflow() throws IOException {
        assertEquals(1000000000, deser._parseIntPrimitive(ctxt, "1000000000"));
    }

    @Test
    public void parseIntText_longLengthOverflow() throws IOException {
        when(ctxt.handleWeirdStringValue(any(), eq("99999999999"), anyString(), any(), any(), any()))
            .thenReturn(Integer.valueOf(-1));
        assertEquals(-1, deser._parseIntPrimitive(ctxt, "99999999999"));
    }

    @Test
    public void parseIntText_invalidText() throws IOException {
        when(ctxt.handleWeirdStringValue(any(), eq("abc"), anyString())).thenReturn(Integer.valueOf(0));
        assertEquals(0, deser._parseIntPrimitive(ctxt, "abc"));
    }

    /* ================= _parseIntPrimitive(p, ctxt) full ================= */

    @Test
    public void parseIntFull_directIntToken() throws IOException {
        assertEquals(123, deser._parseIntPrimitive(parserFor("123"), ctxt));
    }

    @Test
    public void parseIntFull_stringToken() throws IOException {
        assertEquals(123, deser._parseIntPrimitive(parserFor("\"123\""), ctxt));
    }

    @Test
    public void parseIntFull_emptyStringToken_coercionAllowed() throws IOException {
        when(ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)).thenReturn(true);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)).thenReturn(false);
        assertEquals(0, deser._parseIntPrimitive(parserFor("\"\""), ctxt));
    }

    @Test
    public void parseIntFull_floatToken_acceptEnabled() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)).thenReturn(true);
        assertEquals(3, deser._parseIntPrimitive(parserFor("3.9"), ctxt));
    }

    @Test(expected = RuntimeException.class)
    public void parseIntFull_floatToken_acceptDisabled_throws() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)).thenReturn(false);
        doThrow(new RuntimeException("forced")).when(ctxt).reportInputMismatch(any(), anyString(), any(), anyString());
        deser._parseIntPrimitive(parserFor("3.9"), ctxt);
    }

    @Test
    public void parseIntFull_nullToken_failDisabled() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)).thenReturn(false);
        assertEquals(0, deser._parseIntPrimitive(parserFor("null"), ctxt));
    }

    @Test
    public void parseIntFull_arrayUnwrapEnabled() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)).thenReturn(true);
        assertEquals(123, deser._parseIntPrimitive(parserFor("[123]"), ctxt));
    }

    @Test
    public void parseIntFull_arrayUnwrapDisabled() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)).thenReturn(false);
        when(ctxt.handleUnexpectedToken(any(), any(JsonParser.class))).thenReturn(Integer.valueOf(99));
        assertEquals(99, deser._parseIntPrimitive(parserFor("[123]"), ctxt));
    }

    @Test
    public void parseIntFull_defaultBranch_booleanToken() throws IOException {
        when(ctxt.handleUnexpectedToken(any(), any(JsonParser.class))).thenReturn(Integer.valueOf(7));
        assertEquals(7, deser._parseIntPrimitive(parserFor("true"), ctxt));
    }

    /* ================= _parseLongPrimitive ================= */

    @Test
    public void parseLongText_valid() throws IOException {
        assertEquals(123456789012L, deser._parseLongPrimitive(ctxt, "123456789012"));
    }

    @Test
    public void parseLongText_invalid() throws IOException {
        when(ctxt.handleWeirdStringValue(any(), eq("xyz"), anyString())).thenReturn(Long.valueOf(0L));
        assertEquals(0L, deser._parseLongPrimitive(ctxt, "xyz"));
    }

    @Test
    public void parseLongFull_directIntToken() throws IOException {
        assertEquals(123L, deser._parseLongPrimitive(parserFor("123"), ctxt));
    }

    @Test
    public void parseLongFull_nullToken_failDisabled() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)).thenReturn(false);
        assertEquals(0L, deser._parseLongPrimitive(parserFor("null"), ctxt));
    }

    /* ================= _parseFloatPrimitive ================= */

    @Test
    public void parseFloatText_posInfVariants() throws IOException {
        assertEquals(Float.POSITIVE_INFINITY, deser._parseFloatPrimitive(ctxt, "Infinity"), 0f);
        assertEquals(Float.POSITIVE_INFINITY, deser._parseFloatPrimitive(ctxt, "INF"), 0f);
    }

    @Test
    public void parseFloatText_negInfVariants() throws IOException {
        assertEquals(Float.NEGATIVE_INFINITY, deser._parseFloatPrimitive(ctxt, "-Infinity"), 0f);
        assertEquals(Float.NEGATIVE_INFINITY, deser._parseFloatPrimitive(ctxt, "-INF"), 0f);
    }

    @Test
    public void parseFloatText_nan() throws IOException {
        assertTrue(Float.isNaN(deser._parseFloatPrimitive(ctxt, "NaN")));
    }

    @Test
    public void parseFloatText_normalValue() throws IOException {
        assertEquals(3.14f, deser._parseFloatPrimitive(ctxt, "3.14"), 0.0001f);
    }

    @Test
    public void parseFloatText_negativeNumber_fallsThroughSwitch() throws IOException {
        // starts with '-' but not "-Infinity"/"-INF" -> falls to normal parse
        assertEquals(-5.0f, deser._parseFloatPrimitive(ctxt, "-5"), 0.0001f);
    }

    @Test
    public void parseFloatText_invalidValue() throws IOException {
        when(ctxt.handleWeirdStringValue(any(), eq("abc"), anyString())).thenReturn(Float.valueOf(0f));
        assertEquals(0f, deser._parseFloatPrimitive(ctxt, "abc"), 0.0001f);
    }

    @Test
    public void parseFloatFull_directFloatToken() throws IOException {
        assertEquals(3.5f, deser._parseFloatPrimitive(parserFor("3.5"), ctxt), 0.0001f);
    }

    @Test
    public void parseFloatFull_intToken() throws IOException {
        assertEquals(5.0f, deser._parseFloatPrimitive(parserFor("5"), ctxt), 0.0001f);
    }

    @Test
    public void parseFloatFull_nullToken_failDisabled() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)).thenReturn(false);
        assertEquals(0.0f, deser._parseFloatPrimitive(parserFor("null"), ctxt), 0.0001f);
    }

    /* ================= _parseDoublePrimitive ================= */

    @Test
    public void parseDoubleText_posInf() throws IOException {
        assertEquals(Double.POSITIVE_INFINITY, deser._parseDoublePrimitive(ctxt, "Infinity"), 0d);
    }

    @Test
    public void parseDoubleText_negInf() throws IOException {
        assertEquals(Double.NEGATIVE_INFINITY, deser._parseDoublePrimitive(ctxt, "-INF"), 0d);
    }

    @Test
    public void parseDoubleText_nan() throws IOException {
        assertTrue(Double.isNaN(deser._parseDoublePrimitive(ctxt, "NaN")));
    }

    @Test
    public void parseDoubleText_normal() throws IOException {
        assertEquals(2.71, deser._parseDoublePrimitive(ctxt, "2.71"), 0.0001d);
    }

    @Test
    public void parseDoubleText_invalid() throws IOException {
        when(ctxt.handleWeirdStringValue(any(), eq("xx"), anyString())).thenReturn(Double.valueOf(0d));
        assertEquals(0d, deser._parseDoublePrimitive(ctxt, "xx"), 0.0001d);
    }

    @Test
    public void parseDoubleFull_directToken() throws IOException {
        assertEquals(1.25d, deser._parseDoublePrimitive(parserFor("1.25"), ctxt), 0.0001d);
    }

    @Test
    public void parseDoubleFull_nullToken_failDisabled() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)).thenReturn(false);
        assertEquals(0.0d, deser._parseDoublePrimitive(parserFor("null"), ctxt), 0.0001d);
    }

    /* ================= _parseBytePrimitive / _parseShortPrimitive ================= */

    @Test
    public void parseByte_noOverflow() throws IOException {
        assertEquals((byte) 100, deser._parseBytePrimitive(parserFor("100"), ctxt));
    }

    @Test
    public void parseByte_overflow() throws IOException {
        when(ctxt.handleWeirdStringValue(any(), anyString(), anyString())).thenReturn(Integer.valueOf(42));
        assertEquals((byte) 42, deser._parseBytePrimitive(parserFor("300"), ctxt));
    }

    @Test
    public void parseShort_noOverflow() throws IOException {
        assertEquals((short) 100, deser._parseShortPrimitive(parserFor("100"), ctxt));
    }

    @Test
    public void parseShort_overflow() throws IOException {
        when(ctxt.handleWeirdStringValue(any(), anyString(), anyString())).thenReturn(Integer.valueOf(7));
        assertEquals((short) 7, deser._parseShortPrimitive(parserFor("40000"), ctxt));
    }

    /* ================= _parseString ================= */

    @Test
    public void parseString_fromStringToken() throws IOException {
        assertEquals("hello", deser._parseString(parserFor("\"hello\""), ctxt));
    }

    @Test
    public void parseString_fromNumberToken_usesValueAsString() throws IOException {
        assertEquals("123", deser._parseString(parserFor("123"), ctxt));
    }

    @Test
    public void parseString_fromObjectToken_fallsToUnexpectedToken() throws IOException {
        when(ctxt.handleUnexpectedToken(eq(String.class), any(JsonParser.class))).thenReturn("fallback");
        assertEquals("fallback", deser._parseString(parserFor("{}"), ctxt));
    }

    /* ================= _deserializeFromEmpty ================= */

    @Test
    public void deserializeFromEmpty_arrayEmpty_featureEnabled_returnsNull() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)).thenReturn(true);
        assertNull(deser._deserializeFromEmpty(parserFor("[]"), ctxt));
    }

    @Test
    public void deserializeFromEmpty_arrayNonEmpty_featureEnabled_fallsToUnexpected() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)).thenReturn(true);
        when(ctxt.handleUnexpectedToken(any(), any(JsonParser.class))).thenReturn("x");
        assertEquals("x", deser._deserializeFromEmpty(parserFor("[1]"), ctxt));
    }

    @Test
    public void deserializeFromEmpty_arrayFeatureDisabled_fallsToUnexpected() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)).thenReturn(false);
        when(ctxt.handleUnexpectedToken(any(), any(JsonParser.class))).thenReturn("y");
        assertEquals("y", deser._deserializeFromEmpty(parserFor("[1]"), ctxt));
    }

    @Test
    public void deserializeFromEmpty_emptyString_featureEnabled_returnsNull() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)).thenReturn(true);
        assertNull(deser._deserializeFromEmpty(parserFor("\"\""), ctxt));
    }

    @Test
    public void deserializeFromEmpty_nonEmptyString_fallsToUnexpected() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)).thenReturn(true);
        when(ctxt.handleUnexpectedToken(any(), any(JsonParser.class))).thenReturn("z");
        assertEquals("z", deser._deserializeFromEmpty(parserFor("\"abc\""), ctxt));
    }

    @Test
    public void deserializeFromEmpty_otherToken_fallsToUnexpected() throws IOException {
        when(ctxt.handleUnexpectedToken(any(), any(JsonParser.class))).thenReturn("w");
        assertEquals("w", deser._deserializeFromEmpty(parserFor("123"), ctxt));
    }

    /* ================= _deserializeFromArray ================= */

    @Test
    public void deserializeFromArray_noFeatures_fallsToUnexpected4Arg() throws IOException {
        when(ctxt.hasSomeOfFeatures(anyInt())).thenReturn(false);
        when(ctxt.handleUnexpectedToken(any(), any(JsonToken.class), any(JsonParser.class), any()))
            .thenReturn("result");
        assertEquals("result", deser._deserializeFromArray(parserFor("[1]"), ctxt));
    }

    @Test
    public void deserializeFromArray_emptyArray_acceptEmptyEnabled_returnsNull() throws IOException {
        when(ctxt.hasSomeOfFeatures(anyInt())).thenReturn(true);
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)).thenReturn(true);
        assertNull(deser._deserializeFromArray(parserFor("[]"), ctxt));
    }

    @Test
    public void deserializeFromArray_unwrapEnabled_singleElement_verifiesEndArray() throws IOException {
        when(ctxt.hasSomeOfFeatures(anyInt())).thenReturn(true);
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)).thenReturn(false);
        when(ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)).thenReturn(true);
        Object result = deser._deserializeFromArray(parserFor("[\"x\"]"), ctxt);
        assertNull(result); // ConcreteDeserializer.deserialize() always returns null
        verify(ctxt, never()).reportWrongTokenException(any(), any(JsonToken.class), anyString());
    }

    @Test
    public void deserializeFromArray_unwrapEnabled_multiElement_reportsWrongToken() throws IOException {
        when(ctxt.hasSomeOfFeatures(anyInt())).thenReturn(true);
        when(ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)).thenReturn(true);
        deser._deserializeFromArray(parserFor("[1,2]"), ctxt);
        verify(ctxt).reportWrongTokenException(any(StdDeserializer.class), eq(JsonToken.END_ARRAY), anyString());
    }

    /* ================= _deserializeWrappedValue ================= */

    @Test
    public void deserializeWrappedValue_startArray_fallsToUnexpected() throws IOException {
        when(ctxt.handleUnexpectedToken(any(), any(JsonToken.class), any(JsonParser.class), any()))
            .thenReturn("blocked");
        assertEquals("blocked", deser._deserializeWrappedValue(parserFor("[1]"), ctxt));
    }

    @Test
    public void deserializeWrappedValue_nonArray_delegatesToDeserialize() throws IOException {
        assertNull(deser._deserializeWrappedValue(parserFor("1"), ctxt));
    }

    /* ================= _coerceIntegral ================= */

    @Test
    public void coerceIntegral_useBigInteger() throws IOException {
        when(ctxt.getDeserializationFeatures())
            .thenReturn(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.getMask());
        Object result = deser._coerceIntegral(parserFor("12345"), ctxt);
        assertEquals(BigInteger.valueOf(12345), result);
    }

    @Test
    public void coerceIntegral_useLong() throws IOException {
        when(ctxt.getDeserializationFeatures())
            .thenReturn(DeserializationFeature.USE_LONG_FOR_INTS.getMask());
        Object result = deser._coerceIntegral(parserFor("12345"), ctxt);
        assertEquals(Long.valueOf(12345L), result);
    }

    @Test
    public void coerceIntegral_default_usesBigInteger() throws IOException {
        when(ctxt.getDeserializationFeatures()).thenReturn(0);
        Object result = deser._coerceIntegral(parserFor("12345"), ctxt);
        assertEquals(BigInteger.valueOf(12345), result);
    }

    /* ================= _coerceNullToken ================= */

    @Test
    public void coerceNullToken_notPrimitive_returnsNull() throws IOException {
        assertNull(deser._coerceNullToken(ctxt, false));
    }

    @Test
    public void coerceNullToken_primitive_failDisabled_returnsNull() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)).thenReturn(false);
        assertNull(deser._coerceNullToken(ctxt, true));
    }

    @Test(expected = RuntimeException.class)
    public void coerceNullToken_primitive_failEnabled_throws() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)).thenReturn(true);
        doThrow(new RuntimeException("forced")).when(ctxt).reportInputMismatch(any(), anyString());
        deser._coerceNullToken(ctxt, true);
    }

    /* ================= _verifyNullForPrimitiveCoercion ================= */

    @Test(expected = RuntimeException.class)
    public void verifyNullForPrimitiveCoercion_coercionDisabled_throws() throws IOException {
        when(ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)).thenReturn(false);
        doThrow(new RuntimeException("forced")).when(ctxt).reportInputMismatch(any(), anyString());
        deser._verifyNullForPrimitiveCoercion(ctxt, "");
    }

    @Test(expected = RuntimeException.class)
    public void verifyNullForPrimitiveCoercion_coercionEnabled_failEnabled_throws() throws IOException {
        when(ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)).thenReturn(true);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)).thenReturn(true);
        doThrow(new RuntimeException("forced")).when(ctxt).reportInputMismatch(any(), anyString());
        deser._verifyNullForPrimitiveCoercion(ctxt, "str");
    }

    @Test
    public void verifyNullForPrimitiveCoercion_bothPass_noException() throws IOException {
        when(ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)).thenReturn(true);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)).thenReturn(false);
        deser._verifyNullForPrimitiveCoercion(ctxt, ""); // should not throw
    }

    /* ================= _coerceTextualNull / _coerceEmptyString ================= */

    @Test(expected = RuntimeException.class)
    public void coerceTextualNull_coercionDisabled_throws() throws IOException {
        when(ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)).thenReturn(false);
        doThrow(new RuntimeException("forced")).when(ctxt).reportInputMismatch(any(), anyString(), anyString());
        deser._coerceTextualNull(ctxt, false);
    }

    @Test
    public void coerceTextualNull_notPrimitive_returnsNull() throws IOException {
        when(ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)).thenReturn(true);
        assertNull(deser._coerceTextualNull(ctxt, false));
    }

    @Test(expected = RuntimeException.class)
    public void coerceEmptyString_primitiveFailEnabled_throws() throws IOException {
        when(ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)).thenReturn(true);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)).thenReturn(true);
        doThrow(new RuntimeException("forced")).when(ctxt).reportInputMismatch(any(), anyString(), anyString());
        deser._coerceEmptyString(ctxt, true);
    }

    @Test
    public void coerceEmptyString_notPrimitive_returnsNull() throws IOException {
        when(ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)).thenReturn(true);
        assertNull(deser._coerceEmptyString(ctxt, false));
    }

    /* ================= _verifyNullForScalarCoercion / _verifyStringForScalarCoercion ================= */

    @Test
    public void verifyNullForScalarCoercion_enabled_noException() throws IOException {
        when(ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)).thenReturn(true);
        deser._verifyNullForScalarCoercion(ctxt, "x");
    }

    @Test(expected = RuntimeException.class)
    public void verifyNullForScalarCoercion_disabled_throws() throws IOException {
        when(ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)).thenReturn(false);
        doThrow(new RuntimeException("forced")).when(ctxt).reportInputMismatch(any(), anyString(), anyString());
        deser._verifyNullForScalarCoercion(ctxt, "x");
    }

    @Test
    public void verifyStringForScalarCoercion_enabled_noException() throws IOException {
        when(ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)).thenReturn(true);
        deser._verifyStringForScalarCoercion(ctxt, "x");
    }

    @Test(expected = RuntimeException.class)
    public void verifyStringForScalarCoercion_disabled_throws() throws IOException {
        when(ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)).thenReturn(false);
        doThrow(new RuntimeException("forced")).when(ctxt)
            .reportInputMismatch(any(), anyString(), anyString(), anyString(), anyString());
        deser._verifyStringForScalarCoercion(ctxt, "x");
    }

    /* ================= _verifyNumberForScalarCoercion ================= */

    @Test
    public void verifyNumberForScalarCoercion_enabled_noException() throws IOException {
        when(ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)).thenReturn(true);
        deser._verifyNumberForScalarCoercion(ctxt, parserFor("1"));
    }

    @Test(expected = RuntimeException.class)
    public void verifyNumberForScalarCoercion_disabled_throws() throws IOException {
        when(ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)).thenReturn(false);
        doThrow(new RuntimeException("forced")).when(ctxt)
            .reportInputMismatch(any(), anyString(), anyString(), anyString(), anyString());
        deser._verifyNumberForScalarCoercion(ctxt, parserFor("1"));
    }

    /* ================= _verifyEndArrayForSingle / handleMissingEndArrayForSingle ================= */

    @Test
    public void verifyEndArrayForSingle_endArray_noReport() throws IOException {
        JsonParser p = mock(JsonParser.class);
        when(p.nextToken()).thenReturn(JsonToken.END_ARRAY);
        deser._verifyEndArrayForSingle(p, ctxt);
        verify(ctxt, never()).reportWrongTokenException(any(), any(JsonToken.class), anyString());
    }

    @Test(expected = RuntimeException.class)
    public void verifyEndArrayForSingle_notEndArray_reportsAndThrows() throws IOException {
        JsonParser p = mock(JsonParser.class);
        when(p.nextToken()).thenReturn(JsonToken.VALUE_NUMBER_INT);
        doThrow(new RuntimeException("forced")).when(ctxt)
            .reportWrongTokenException(any(), any(JsonToken.class), anyString());
        deser._verifyEndArrayForSingle(p, ctxt);
    }

    /* ================= handleUnknownProperty ================= */

    @Test
    public void handleUnknownProperty_handledByContext_noSkip() throws IOException {
        JsonParser p = mock(JsonParser.class);
        when(ctxt.handleUnknownProperty(eq(p), eq(deser), any(), eq("prop"))).thenReturn(true);
        deser.handleUnknownProperty(p, ctxt, null, "prop");
        verify(p, never()).skipChildren();
    }

    @Test
    public void handleUnknownProperty_notHandled_skipsChildren() throws IOException {
        JsonParser p = mock(JsonParser.class);
        when(ctxt.handleUnknownProperty(eq(p), eq(deser), any(), eq("prop"))).thenReturn(false);
        deser.handleUnknownProperty(p, ctxt, null, "prop");
        verify(p).skipChildren();
    }

    /* ================= findFormatOverrides (format == null branch only) ================= */

    @Test
    public void findFormatOverrides_nullProp_delegatesToContextDefault() {
        when(ctxt.getDefaultPropertyFormat(Object.class)).thenReturn(null);
        assertNull(deser.findFormatOverrides(ctxt, null, Object.class));
        verify(ctxt).getDefaultPropertyFormat(Object.class);
    }

    @Test
    public void findFormatOverrides_withProp_delegatesToProperty() {
        BeanProperty prop = mock(BeanProperty.class);
        when(prop.findPropertyFormat(any(), eq(Object.class))).thenReturn(null);
        assertNull(deser.findFormatOverrides(ctxt, prop, Object.class));
        verify(prop).findPropertyFormat(any(), eq(Object.class));
        verify(ctxt, never()).getDefaultPropertyFormat(any());
    }

    @Test
    public void findFormatFeature_nullFormat_returnsNull() {
        when(ctxt.getDefaultPropertyFormat(Object.class)).thenReturn(null);
        Boolean result = deser.findFormatFeature(ctxt, null, Object.class,
                JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        assertNull(result);
    }

    /* ================= _findNullProvider ================= */

    @Test
    public void findNullProvider_failWithProp() throws IOException {
        BeanProperty prop = mock(BeanProperty.class);
        JsonDeserializer<?> valueDeser = mock(JsonDeserializer.class);
        Object provider = deser._findNullProvider(ctxt, prop, Nulls.FAIL, valueDeser);
        assertTrue(provider instanceof NullsFailProvider);
    }

    @Test
    public void findNullProvider_skip_returnsSkipperSingleton() throws IOException {
        JsonDeserializer<?> valueDeser = mock(JsonDeserializer.class);
        Object provider = deser._findNullProvider(ctxt, null, Nulls.SKIP, valueDeser);
        assertSame(NullsConstantProvider.skipper(), provider);
    }

    @Test
    public void findNullProvider_asEmpty_nullValueDeser_returnsNull() throws IOException {
        assertNull(deser._findNullProvider(ctxt, null, Nulls.AS_EMPTY, null));
    }

    @Test
    public void findNullProvider_asEmpty_alwaysNullAccess_returnsNuller() throws IOException {
        JsonDeserializer<?> valueDeser = mock(JsonDeserializer.class);
        when(valueDeser.getEmptyAccessPattern()).thenReturn(AccessPattern.ALWAYS_NULL);
        Object provider = deser._findNullProvider(ctxt, null, Nulls.AS_EMPTY, valueDeser);
        assertSame(NullsConstantProvider.nuller(), provider);
    }

    @Test
    public void findNullProvider_asEmpty_dynamicAccess_returnsAsEmptyProvider() throws IOException {
        JsonDeserializer<?> valueDeser = mock(JsonDeserializer.class);
        when(valueDeser.getEmptyAccessPattern()).thenReturn(AccessPattern.DYNAMIC);
        Object provider = deser._findNullProvider(ctxt, null, Nulls.AS_EMPTY, valueDeser);
        assertTrue(provider instanceof NullsAsEmptyProvider);
    }

    @Test
    public void findNullProvider_defaultNulls_returnsNull() throws IOException {
        JsonDeserializer<?> valueDeser = mock(JsonDeserializer.class);
        assertNull(deser._findNullProvider(ctxt, null, Nulls.DEFAULT, valueDeser));
    }

    /* ================= findContentNullStyle (prop == null branch only) ================= */

    @Test
    public void findContentNullStyle_nullProp_returnsNull() throws IOException {
        assertNull(deser.findContentNullStyle(ctxt, null));
    }

    /* ================= _neitherNull ================= */

    @Test
    public void neitherNull_bothNonNull_true() {
        assertTrue(StdDeserializer._neitherNull(new Object(), new Object()));
    }

    @Test
    public void neitherNull_oneNull_false() {
        assertFalse(StdDeserializer._neitherNull(null, new Object()));
        assertFalse(StdDeserializer._neitherNull(new Object(), null));
    }

    /* ================= _parseDate(String, ctxt) ================= */

    @Test
    public void parseDateString_empty_returnsNull() throws IOException {
        assertNull(deser._parseDate("", ctxt));
    }

    @Test
    public void parseDateString_valid_delegatesToContext() throws IOException {
        Date expected = new Date(12345L);
        when(ctxt.parseDate("2020-01-01")).thenReturn(expected);
        assertSame(expected, deser._parseDate("2020-01-01", ctxt));
    }

    @Test
    public void parseDateString_invalid_delegatesToHandleWeirdStringValue() throws IOException {
        when(ctxt.parseDate("bad-date")).thenThrow(new IllegalArgumentException("bad"));
        Date fallback = new Date(0L);
        when(ctxt.handleWeirdStringValue(any(), eq("bad-date"), anyString(), anyString()))
            .thenReturn(fallback);
        assertSame(fallback, deser._parseDate("bad-date", ctxt));
    }

    /* ================= _parseDate(JsonParser, ctxt) ================= */

    @Test
    public void parseDateToken_numberToken_createsDateFromLong() throws IOException {
        Date d = deser._parseDate(parserFor("1577836800000"), ctxt);
        assertEquals(1577836800000L, d.getTime());
    }

    @Test
    public void parseDateToken_nullToken_returnsNull() throws IOException {
        assertNull(deser._parseDate(parserFor("null"), ctxt));
    }

    @Test
    public void parseDateToken_otherToken_fallsToUnexpected() throws IOException {
        Date expected = new Date(999L);
        when(ctxt.handleUnexpectedToken(any(), any(JsonParser.class))).thenReturn(expected);
        assertSame(expected, deser._parseDate(parserFor("true"), ctxt));
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `constructor_*`, `copyConstructor_*`, `getValueType_defaultIsNull` | constructor(Class), constructor(JavaType==null), constructor(JavaType!=null), copy-constructor |
| `isDefaultDeserializer_*`, `isDefaultKeyDeserializer_*` | annotated(true)/ไม่annotated(false) |
| `deserializeWithType_*` | delegate ไปยัง TypeDeserializer |
| `isEmptyOrTextualNull_*`, `hasTextualNull_*` | empty/"null"/other string |
| `isIntNumber_*` | digit-only, +/- sign, non-digit, empty |
| `isNegInf_*`, `isPosInf_*`, `isNaN_*` | ทุก literal variant true/false |
| `byteOverflow_*`, `shortOverflow_*`, `intOverflow_*` | boundary values (<min, =min, =max, >max) |
| `nonNullNumber_*` | null → 0, non-null → same instance |
| `parseDouble_*` | NASTY_SMALL_DOUBLE branch, normal parse |
| `parseBoolean_*` (13 tests) | true/false token, null(fail on/off), int(0/non-zero), string true/false variants, empty string coercion, weird string→handleWeirdStringValue, array unwrap on/off, multi-element array, object token |
| `parseIntText_*`, `parseIntFull_*` (12 tests) | ≤9หลัก, >9หลักไม่ overflow/overflow, invalid text, token int/string/float(on/off)/null/array(on/off)/default |
| `parseLongText_*`