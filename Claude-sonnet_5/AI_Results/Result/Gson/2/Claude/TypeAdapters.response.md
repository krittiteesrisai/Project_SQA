# TypeAdaptersTest.java

หมายเหตุก่อนเริ่ม:
- ทุก `JsonReader`/`JsonWriter` ตั้ง `setLenient(true)` เพื่อไม่ให้ strictness ของ Gson รบกวนการทดสอบ logic จริงของ adapter (ไม่ใช่ behavior ที่เดา แต่เป็น setup ที่จำเป็นเพื่อเข้าถึง code path)
- `FLOAT`/`DOUBLE` ไม่มี try/catch ครอบ `NumberFormatException` ในซอร์ส (ต่างจาก BYTE/SHORT/INTEGER/LONG) จึงคาดหวัง `NumberFormatException` ตรง ๆ ไม่ใช่ `JsonSyntaxException` — เป็นจุดที่ควรระวังเรื่อง fault
- `LONG`, `FLOAT`, `DOUBLE` ไม่มี Factory ประกาศในซอร์สที่ให้มา จึงไม่มีเทส factory ให้เมธอดเหล่านี้
- ใช้ fully-qualified name (`java.net.URL`, `java.net.URI`, `java.util.UUID`) เพราะฟิลด์ใน `TypeAdapters` ใช้ชื่อเดียวกันกับคลาสมาตรฐาน

```java
package com.google.gson.internal.bind;

import com.google.gson.internal.bind.TypeAdapters; // import คลาสเป้าหมายตามข้อกำหนด

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TypeAdaptersTest {

  // ---------------- helpers ----------------

  private StringWriter sw;

  private JsonReader newReader(String json) {
    JsonReader r = new JsonReader(new StringReader(json));
    r.setLenient(true);
    return r;
  }

  private JsonWriter newWriter() {
    sw = new StringWriter();
    JsonWriter w = new JsonWriter(sw);
    w.setLenient(true);
    return w;
  }

  // ---------------- CLASS ----------------

  @Test
  public void testClass_writeNull() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.CLASS.write(out, null);
    out.flush();
    assertEquals("null", sw.toString());
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testClass_writeNonNull() throws IOException {
    TypeAdapters.CLASS.write(newWriter(), String.class);
  }

  @Test
  public void testClass_readNull() throws IOException {
    assertNull(TypeAdapters.CLASS.read(newReader("null")));
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testClass_readNonNull() throws IOException {
    TypeAdapters.CLASS.read(newReader("\"foo\""));
  }

  @Test
  public void testClassFactory() {
    assertSame(TypeAdapters.CLASS,
        TypeAdapters.CLASS_FACTORY.create(new Gson(), TypeToken.get(Class.class)));
    assertNull(TypeAdapters.CLASS_FACTORY.create(new Gson(), TypeToken.get(String.class)));
  }

  // ---------------- BIT_SET ----------------

  @Test
  public void testBitSet_readNull() throws IOException {
    assertNull(TypeAdapters.BIT_SET.read(newReader("null")));
  }

  @Test
  public void testBitSet_readMixedTypes() throws IOException {
    BitSet result = TypeAdapters.BIT_SET.read(newReader("[1,true,\"0\",0]"));
    BitSet expected = new BitSet();
    expected.set(0);
    expected.set(1);
    assertEquals(expected, result);
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBitSet_readInvalidStringValue() throws IOException {
    TypeAdapters.BIT_SET.read(newReader("[\"abc\"]"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBitSet_readInvalidTokenType() throws IOException {
    TypeAdapters.BIT_SET.read(newReader("[null]"));
  }

  @Test
  public void testBitSet_writeNull() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.BIT_SET.write(out, null);
    out.flush();
    assertEquals("null", sw.toString());
  }

  @Test
  public void testBitSet_writeValues() throws IOException {
    BitSet bs = new BitSet();
    bs.set(0);
    bs.set(2);
    JsonWriter out = newWriter();
    TypeAdapters.BIT_SET.write(out, bs);
    out.flush();
    assertEquals("[1,0,1]", sw.toString());
  }

  @Test
  public void testBitSetFactory() {
    assertSame(TypeAdapters.BIT_SET,
        TypeAdapters.BIT_SET_FACTORY.create(new Gson(), TypeToken.get(BitSet.class)));
    assertNull(TypeAdapters.BIT_SET_FACTORY.create(new Gson(), TypeToken.get(String.class)));
  }

  // ---------------- BOOLEAN ----------------

  @Test
  public void testBoolean_readNull() throws IOException {
    assertNull(TypeAdapters.BOOLEAN.read(newReader("null")));
  }

  @Test
  public void testBoolean_readString() throws IOException {
    assertTrue(TypeAdapters.BOOLEAN.read(newReader("\"true\"")));
  }

  @Test
  public void testBoolean_readBooleanToken() throws IOException {
    assertTrue(TypeAdapters.BOOLEAN.read(newReader("true")));
  }

  @Test
  public void testBoolean_writeNull() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.BOOLEAN.write(out, null);
    out.flush();
    assertEquals("null", sw.toString());
  }

  @Test
  public void testBoolean_writeValue() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.BOOLEAN.write(out, true);
    out.flush();
    assertEquals("true", sw.toString());
  }

  // ---------------- BOOLEAN_AS_STRING ----------------

  @Test
  public void testBooleanAsString_readNull() throws IOException {
    assertNull(TypeAdapters.BOOLEAN_AS_STRING.read(newReader("null")));
  }

  @Test
  public void testBooleanAsString_readValue() throws IOException {
    assertTrue(TypeAdapters.BOOLEAN_AS_STRING.read(newReader("\"true\"")));
  }

  @Test
  public void testBooleanAsString_writeNull() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.BOOLEAN_AS_STRING.write(out, null);
    out.flush();
    assertEquals("\"null\"", sw.toString());
  }

  @Test
  public void testBooleanAsString_writeValue() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.BOOLEAN_AS_STRING.write(out, false);
    out.flush();
    assertEquals("\"false\"", sw.toString());
  }

  @Test
  public void testBooleanFactory() {
    assertSame(TypeAdapters.BOOLEAN,
        TypeAdapters.BOOLEAN_FACTORY.create(new Gson(), TypeToken.get(boolean.class)));
    assertSame(TypeAdapters.BOOLEAN,
        TypeAdapters.BOOLEAN_FACTORY.create(new Gson(), TypeToken.get(Boolean.class)));
    assertNull(TypeAdapters.BOOLEAN_FACTORY.create(new Gson(), TypeToken.get(Integer.class)));
  }

  // ---------------- BYTE ----------------

  @Test
  public void testByte_readNull() throws IOException {
    assertNull(TypeAdapters.BYTE.read(newReader("null")));
  }

  @Test
  public void testByte_readValid() throws IOException {
    assertEquals((byte) 5, TypeAdapters.BYTE.read(newReader("5")));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testByte_readInvalid() throws IOException {
    TypeAdapters.BYTE.read(newReader("\"abc\""));
  }

  @Test
  public void testByte_write() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.BYTE.write(out, (byte) 7);
    out.flush();
    assertEquals("7", sw.toString());
  }

  @Test
  public void testByteFactory() {
    assertSame(TypeAdapters.BYTE, TypeAdapters.BYTE_FACTORY.create(new Gson(), TypeToken.get(byte.class)));
    assertSame(TypeAdapters.BYTE, TypeAdapters.BYTE_FACTORY.create(new Gson(), TypeToken.get(Byte.class)));
    assertNull(TypeAdapters.BYTE_FACTORY.create(new Gson(), TypeToken.get(Integer.class)));
  }

  // ---------------- SHORT ----------------

  @Test
  public void testShort_readNull() throws IOException {
    assertNull(TypeAdapters.SHORT.read(newReader("null")));
  }

  @Test
  public void testShort_readValid() throws IOException {
    assertEquals((short) 100, TypeAdapters.SHORT.read(newReader("100")));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testShort_readInvalid() throws IOException {
    TypeAdapters.SHORT.read(newReader("\"xyz\""));
  }

  @Test
  public void testShort_write() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.SHORT.write(out, (short) 9);
    out.flush();
    assertEquals("9", sw.toString());
  }

  @Test
  public void testShortFactory() {
    assertSame(TypeAdapters.SHORT, TypeAdapters.SHORT_FACTORY.create(new Gson(), TypeToken.get(short.class)));
    assertSame(TypeAdapters.SHORT, TypeAdapters.SHORT_FACTORY.create(new Gson(), TypeToken.get(Short.class)));
    assertNull(TypeAdapters.SHORT_FACTORY.create(new Gson(), TypeToken.get(Integer.class)));
  }

  // ---------------- INTEGER ----------------

  @Test
  public void testInteger_readNull() throws IOException {
    assertNull(TypeAdapters.INTEGER.read(newReader("null")));
  }

  @Test
  public void testInteger_readValid() throws IOException {
    assertEquals(Integer.valueOf(77), TypeAdapters.INTEGER.read(newReader("77")));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testInteger_readInvalid() throws IOException {
    TypeAdapters.INTEGER.read(newReader("\"xyz\""));
  }

  @Test
  public void testInteger_write() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.INTEGER.write(out, 11);
    out.flush();
    assertEquals("11", sw.toString());
  }

  @Test
  public void testIntegerFactory() {
    assertSame(TypeAdapters.INTEGER, TypeAdapters.INTEGER_FACTORY.create(new Gson(), TypeToken.get(int.class)));
    assertSame(TypeAdapters.INTEGER, TypeAdapters.INTEGER_FACTORY.create(new Gson(), TypeToken.get(Integer.class)));
    assertNull(TypeAdapters.INTEGER_FACTORY.create(new Gson(), TypeToken.get(String.class)));
  }

  // ---------------- LONG (no factory in source) ----------------

  @Test
  public void testLong_readNull() throws IOException {
    assertNull(TypeAdapters.LONG.read(newReader("null")));
  }

  @Test
  public void testLong_readValid() throws IOException {
    assertEquals(Long.valueOf(123456789012L), TypeAdapters.LONG.read(newReader("123456789012")));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testLong_readInvalid() throws IOException {
    TypeAdapters.LONG.read(newReader("\"abc\""));
  }

  @Test
  public void testLong_write() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.LONG.write(out, 42L);
    out.flush();
    assertEquals("42", sw.toString());
  }

  // ---------------- FLOAT (no try/catch in source -> NumberFormatException ไม่ถูก wrap) ----------------

  @Test
  public void testFloat_readNull() throws IOException {
    assertNull(TypeAdapters.FLOAT.read(newReader("null")));
  }

  @Test
  public void testFloat_readValid() throws IOException {
    Number n = TypeAdapters.FLOAT.read(newReader("3.5"));
    assertEquals(3.5f, n.floatValue(), 0.0001);
  }

  @Test(expected = NumberFormatException.class)
  public void testFloat_readInvalid_throwsUnwrapped() throws IOException {
    TypeAdapters.FLOAT.read(newReader("\"notanumber\""));
  }

  @Test
  public void testFloat_write() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.FLOAT.write(out, 2.5f);
    out.flush();
    assertEquals("2.5", sw.toString());
  }

  // ---------------- DOUBLE (no try/catch in source) ----------------

  @Test
  public void testDouble_readNull() throws IOException {
    assertNull(TypeAdapters.DOUBLE.read(newReader("null")));
  }

  @Test
  public void testDouble_readValid() throws IOException {
    Number n = TypeAdapters.DOUBLE.read(newReader("4.25"));
    assertEquals(4.25, n.doubleValue(), 0.0001);
  }

  @Test(expected = NumberFormatException.class)
  public void testDouble_readInvalid_throwsUnwrapped() throws IOException {
    TypeAdapters.DOUBLE.read(newReader("\"notanumber\""));
  }

  @Test
  public void testDouble_write() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.DOUBLE.write(out, 1.5);
    out.flush();
    assertEquals("1.5", sw.toString());
  }

  // ---------------- NUMBER ----------------

  @Test
  public void testNumber_readNull() throws IOException {
    assertNull(TypeAdapters.NUMBER.read(newReader("null")));
  }

  @Test
  public void testNumber_readNumber() throws IOException {
    Number n = TypeAdapters.NUMBER.read(newReader("42"));
    assertEquals("42", n.toString());
  }

  @Test(expected = JsonSyntaxException.class)
  public void testNumber_readInvalidToken() throws IOException {
    TypeAdapters.NUMBER.read(newReader("\"abc\""));
  }

  @Test
  public void testNumber_write() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.NUMBER.write(out, 5);
    out.flush();
    assertEquals("5", sw.toString());
  }

  @Test
  public void testNumberFactory() {
    assertSame(TypeAdapters.NUMBER, TypeAdapters.NUMBER_FACTORY.create(new Gson(), TypeToken.get(Number.class)));
    assertNull(TypeAdapters.NUMBER_FACTORY.create(new Gson(), TypeToken.get(String.class)));
  }

  // ---------------- CHARACTER ----------------

  @Test
  public void testCharacter_readNull() throws IOException {
    assertNull(TypeAdapters.CHARACTER.read(newReader("null")));
  }

  @Test
  public void testCharacter_readValid() throws IOException {
    assertEquals(Character.valueOf('a'), TypeAdapters.CHARACTER.read(newReader("\"a\"")));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testCharacter_readInvalidLength() throws IOException {
    TypeAdapters.CHARACTER.read(newReader("\"ab\""));
  }

  @Test
  public void testCharacter_writeNull() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.CHARACTER.write(out, null);
    out.flush();
    assertEquals("null", sw.toString());
  }

  @Test
  public void testCharacter_writeValue() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.CHARACTER.write(out, 'z');
    out.flush();
    assertEquals("\"z\"", sw.toString());
  }

  @Test
  public void testCharacterFactory() {
    assertSame(TypeAdapters.CHARACTER,
        TypeAdapters.CHARACTER_FACTORY.create(new Gson(), TypeToken.get(char.class)));
    assertSame(TypeAdapters.CHARACTER,
        TypeAdapters.CHARACTER_FACTORY.create(new Gson(), TypeToken.get(Character.class)));
    assertNull(TypeAdapters.CHARACTER_FACTORY.create(new Gson(), TypeToken.get(Integer.class)));
  }

  // ---------------- STRING ----------------

  @Test
  public void testString_readNull() throws IOException {
    assertNull(TypeAdapters.STRING.read(newReader("null")));
  }

  @Test
  public void testString_readBooleanCoerce() throws IOException {
    assertEquals("true", TypeAdapters.STRING.read(newReader("true")));
  }

  @Test
  public void testString_readString() throws IOException {
    assertEquals("hello", TypeAdapters.STRING.read(newReader("\"hello\"")));
  }

  @Test
  public void testString_write() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.STRING.write(out, "hi");
    out.flush();
    assertEquals("\"hi\"", sw.toString());
  }

  @Test
  public void testStringFactory() {
    assertSame(TypeAdapters.STRING, TypeAdapters.STRING_FACTORY.create(new Gson(), TypeToken.get(String.class)));
    assertNull(TypeAdapters.STRING_FACTORY.create(new Gson(), TypeToken.get(Integer.class)));
  }

  // ---------------- BIG_DECIMAL ----------------

  @Test
  public void testBigDecimal_readNull() throws IOException {
    assertNull(TypeAdapters.BIG_DECIMAL.read(newReader("null")));
  }

  @Test
  public void testBigDecimal_readValid() throws IOException {
    assertEquals(new BigDecimal("3.14"), TypeAdapters.BIG_DECIMAL.read(newReader("\"3.14\"")));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBigDecimal_readInvalid() throws IOException {
    TypeAdapters.BIG_DECIMAL.read(newReader("\"abc\""));
  }

  @Test
  public void testBigDecimal_write() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.BIG_DECIMAL.write(out, new BigDecimal("1.5"));
    out.flush();
    assertEquals("1.5", sw.toString());
  }

  // ---------------- BIG_INTEGER ----------------

  @Test
  public void testBigInteger_readNull() throws IOException {
    assertNull(TypeAdapters.BIG_INTEGER.read(newReader("null")));
  }

  @Test
  public void testBigInteger_readValid() throws IOException {
    assertEquals(new BigInteger("123"), TypeAdapters.BIG_INTEGER.read(newReader("\"123\"")));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBigInteger_readInvalid() throws IOException {
    TypeAdapters.BIG_INTEGER.read(newReader("\"abc\""));
  }

  @Test
  public void testBigInteger_write() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.BIG_INTEGER.write(out, new BigInteger("99"));
    out.flush();
    assertEquals("99", sw.toString());
  }

  // ---------------- STRING_BUILDER ----------------

  @Test
  public void testStringBuilder_readNull() throws IOException {
    assertNull(TypeAdapters.STRING_BUILDER.read(newReader("null")));
  }

  @Test
  public void testStringBuilder_readValid() throws IOException {
    StringBuilder sb = TypeAdapters.STRING_BUILDER.read(newReader("\"abc\""));
    assertEquals("abc", sb.toString());
  }

  @Test
  public void testStringBuilder_writeNull() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.STRING_BUILDER.write(out, null);
    out.flush();
    assertEquals("null", sw.toString());
  }

  @Test
  public void testStringBuilder_writeValue() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.STRING_BUILDER.write(out, new StringBuilder("xyz"));
    out.flush();
    assertEquals("\"xyz\"", sw.toString());
  }

  @Test
  public void testStringBuilderFactory() {
    assertSame(TypeAdapters.STRING_BUILDER,
        TypeAdapters.STRING_BUILDER_FACTORY.create(new Gson(), TypeToken.get(StringBuilder.class)));
    assertNull(TypeAdapters.STRING_BUILDER_FACTORY.create(new Gson(), TypeToken.get(String.class)));
  }

  // ---------------- STRING_BUFFER ----------------

  @Test
  public void testStringBuffer_readNull() throws IOException {
    assertNull(TypeAdapters.STRING_BUFFER.read(newReader("null")));
  }

  @Test
  public void testStringBuffer_readValid() throws IOException {
    StringBuffer sb = TypeAdapters.STRING_BUFFER.read(newReader("\"abc\""));
    assertEquals("abc", sb.toString());
  }

  @Test
  public void testStringBuffer_writeNull() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.STRING_BUFFER.write(out, null);
    out.flush();
    assertEquals("null", sw.toString());
  }

  @Test
  public void testStringBuffer_writeValue() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.STRING_BUFFER.write(out, new StringBuffer("xyz"));
    out.flush();
    assertEquals("\"xyz\"", sw.toString());
  }

  @Test
  public void testStringBufferFactory() {
    assertSame(TypeAdapters.STRING_BUFFER,
        TypeAdapters.STRING_BUFFER_FACTORY.create(new Gson(), TypeToken.get(StringBuffer.class)));
    assertNull(TypeAdapters.STRING_BUFFER_FACTORY.create(new Gson(), TypeToken.get(String.class)));
  }

  // ---------------- URL ----------------

  @Test
  public void testUrl_readNull() throws IOException {
    assertNull(TypeAdapters.URL.read(newReader("null")));
  }

  @Test
  public void testUrl_readNullStringLiteral() throws IOException {
    assertNull(TypeAdapters.URL.read(newReader("\"null\"")));
  }

  @Test
  public void testUrl_readValid() throws IOException {
    java.net.URL url = TypeAdapters.URL.read(newReader("\"http://example.com\""));
    assertEquals("http://example.com", url.toExternalForm());
  }

  @Test
  public void testUrl_writeNull() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.URL.write(out, null);
    out.flush();
    assertEquals("null", sw.toString());
  }

  @Test
  public void testUrl_writeValue() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.URL.write(out, new java.net.URL("http://example.com"));
    out.flush();
    assertEquals("\"http://example.com\"", sw.toString());
  }

  @Test
  public void testUrlFactory() {
    assertSame(TypeAdapters.URL, TypeAdapters.URL_FACTORY.create(new Gson(), TypeToken.get(java.net.URL.class)));
    assertNull(TypeAdapters.URL_FACTORY.create(new Gson(), TypeToken.get(String.class)));
  }

  // ---------------- URI ----------------

  @Test
  public void testUri_readNull() throws IOException {
    assertNull(TypeAdapters.URI.read(newReader("null")));
  }

  @Test
  public void testUri_readNullStringLiteral() throws IOException {
    assertNull(TypeAdapters.URI.read(newReader("\"null\"")));
  }

  @Test
  public void testUri_readValid() throws IOException {
    java.net.URI uri = TypeAdapters.URI.read(newReader("\"http://example.com/x\""));
    assertEquals("http://example.com/x", uri.toString());
  }

  @Test(expected = JsonIOException.class)
  public void testUri_readInvalid_throwsJsonIOException() throws IOException {
    // ช่องว่างในสตริงทำให้ URISyntaxException -> ถูก wrap เป็น JsonIOException
    TypeAdapters.URI.read(newReader("\"a b c\""));
  }

  @Test
  public void testUri_writeNull() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.URI.write(out, null);
    out.flush();
    assertEquals("null", sw.toString());
  }

  @Test
  public void testUri_writeValue() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.URI.write(out, new java.net.URI("http://example.com/x"));
    out.flush();
    assertEquals("\"http://example.com/x\"", sw.toString());
  }

  @Test
  public void testUriFactory() {
    assertSame(TypeAdapters.URI, TypeAdapters.URI_FACTORY.create(new Gson(), TypeToken.get(java.net.URI.class)));
    assertNull(TypeAdapters.URI_FACTORY.create(new Gson(), TypeToken.get(String.class)));
  }

  // ---------------- INET_ADDRESS ----------------

  @Test
  public void testInetAddress_readNull() throws IOException {
    assertNull(TypeAdapters.INET_ADDRESS.read(newReader("null")));
  }

  @Test
  public void testInetAddress_readValid() throws IOException {
    InetAddress addr = TypeAdapters.INET_ADDRESS.read(newReader("\"127.0.0.1\""));
    assertNotNull(addr);
  }

  @Test
  public void testInetAddress_writeNull() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.INET_ADDRESS.write(out, null);
    out.flush();
    assertEquals("null", sw.toString());
  }

  @Test
  public void testInetAddress_writeValue() throws IOException {
    InetAddress addr = InetAddress.getByName("127.0.0.1");
    JsonWriter out = newWriter();
    TypeAdapters.INET_ADDRESS.write(out, addr);
    out.flush();
    assertEquals("\"127.0.0.1\"", sw.toString());
  }

  @Test
  public void testInetAddressFactory_typeHierarchy() {
    assertSame(TypeAdapters.INET_ADDRESS,
        TypeAdapters.INET_ADDRESS_FACTORY.create(new Gson(), TypeToken.get(InetAddress.class)));
    assertNull(TypeAdapters.INET_ADDRESS_FACTORY.create(new Gson(), TypeToken.get(String.class)));
  }

  // ---------------- UUID ----------------

  @Test
  public void testUuid_readNull() throws IOException {
    assertNull(TypeAdapters.UUID.read(newReader("null")));
  }

  @Test
  public void testUuid_readValid() throws IOException {
    java.util.UUID uuid = TypeAdapters.UUID.read(
        newReader("\"123e4567-e89b-12d3-a456-426614174000\""));
    assertEquals(java.util.UUID.fromString("123e4567-e89b-12d3-a456-426614174000"), uuid);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testUuid_readInvalidFormat() throws IOException {
    TypeAdapters.UUID.read(newReader("\"not-a-uuid\""));
  }

  @Test
  public void testUuid_writeNull() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.UUID.write(out, null);
    out.flush();
    assertEquals("null", sw.toString());
  }

  @Test
  public void testUuid_writeValue() throws IOException {
    java.util.UUID uuid = java.util.UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
    JsonWriter out = newWriter();
    TypeAdapters.UUID.write(out, uuid);
    out.flush();
    assertEquals("\"123e4567-e89b-12d3-a456-426614174000\"", sw.toString());
  }

  @Test
  public void testUuidFactory() {
    assertSame(TypeAdapters.UUID, TypeAdapters.UUID_FACTORY.create(new Gson(), TypeToken.get(java.util.UUID.class)));
    assertNull(TypeAdapters.UUID_FACTORY.create(new Gson(), TypeToken.get(String.class)));
  }

  // ---------------- TIMESTAMP_FACTORY ----------------

  @Test
  public void testTimestampFactory_wrongTypeReturnsNull() {
    assertNull(TypeAdapters.TIMESTAMP_FACTORY.create(new Gson(), TypeToken.get(String.class)));
  }

  @Test
  public void testTimestampFactory_readWriteRoundTrip() throws IOException {
    Gson gson = new Gson();
    TypeAdapter<?> raw = TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Timestamp.class));
    assertNotNull(raw);
    @SuppressWarnings("unchecked")
    TypeAdapter<Timestamp> adapter = (TypeAdapter<Timestamp>) raw;

    Timestamp ts = new Timestamp(0L);
    JsonWriter out = newWriter();
    adapter.write(out, ts);
    out.flush();
    String json = sw.toString();

    Timestamp result = adapter.read(newReader(json));
    assertNotNull(result);
  }

  @Test
  public void testTimestampFactory_readWriteNull() throws IOException {
    Gson gson = new Gson();
    TypeAdapter<?> raw = TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Timestamp.class));
    @SuppressWarnings("unchecked")
    TypeAdapter<Timestamp> adapter = (TypeAdapter<Timestamp>) raw;

    JsonWriter out = newWriter();
    adapter.write(out, null);
    out.flush();
    Timestamp result = adapter.read(newReader(sw.toString()));
    assertNull(result);
  }

  // ---------------- CALENDAR ----------------

  @Test
  public void testCalendar_readNull() throws IOException {
    assertNull(TypeAdapters.CALENDAR.read(newReader("null")));
  }

  @Test
  public void testCalendar_readAllFields() throws IOException {
    String json = "{\"year\":2020,\"month\":5,\"dayOfMonth\":10,"
        + "\"hourOfDay\":13,\"minute\":45,\"second\":30}";
    Calendar cal = TypeAdapters.CALENDAR.read(newReader(json));
    assertEquals(2020, cal.get(Calendar.YEAR));
    assertEquals(5, cal.get(Calendar.MONTH));
    assertEquals(10, cal.get(Calendar.DAY_OF_MONTH));
    assertEquals(13, cal.get(Calendar.HOUR_OF_DAY));
    assertEquals(45, cal.get(Calendar.MINUTE));
    assertEquals(30, cal.get(Calendar.SECOND));
  }

  @Test
  public void testCalendar_readWithUnknownField() throws IOException {
    // ครอบคลุมกรณีชื่อ field ไม่ตรงกับ known constant ใด ๆ (ไม่มี else สุดท้าย -> ข้ามไปเฉย ๆ)
    String json = "{\"unknown\":99,\"year\":2021}";
    Calendar cal = TypeAdapters.CALENDAR.read(newReader(json));
    assertEquals(2021, cal.get(Calendar.YEAR));
  }

  @Test
  public void testCalendar_writeNull() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.CALENDAR.write(out, null);
    out.flush();
    assertEquals("null", sw.toString());
  }

  @Test
  public void testCalendar_writeValue() throws IOException {
    Calendar cal = new GregorianCalendar(2020, 0, 1, 0, 0, 0);
    JsonWriter out = newWriter();
    TypeAdapters.CALENDAR.write(out, cal);
    out.flush();
    assertTrue(sw.toString().contains("\"year\":2020"));
  }

  @Test
  public void testCalendarFactory() {
    assertNotNull(TypeAdapters.CALENDAR_FACTORY.create(new Gson(), TypeToken.get(Calendar.class)));
    assertNotNull(TypeAdapters.CALENDAR_FACTORY.create(new Gson(), TypeToken.get(GregorianCalendar.class)));
    assertNull(TypeAdapters.CALENDAR_FACTORY.create(new Gson(), TypeToken.get(Date.class)));
  }

  // ---------------- LOCALE ----------------

  @Test
  public void testLocale_readNull() throws IOException {
    assertNull(TypeAdapters.LOCALE.read(newReader("null")));
  }

  @Test
  public void testLocale_readLanguageOnly() throws IOException {
    Locale locale = TypeAdapters.LOCALE.read(newReader("\"en\""));
    assertEquals(new Locale("en"), locale);
  }

  @Test
  public void testLocale_readLanguageCountry() throws IOException {
    Locale locale = TypeAdapters.LOCALE.read(newReader("\"en_US\""));
    assertEquals(new Locale("en", "US"), locale);
  }

  @Test
  public void testLocale_readLanguageCountryVariant() throws IOException {
    Locale locale = TypeAdapters.LOCALE.read(newReader("\"en_US_WIN\""));
    assertEquals(new Locale("en", "US", "WIN"), locale);
  }

  @Test
  public void testLocale_writeNull() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.LOCALE.write(out, null);
    out.flush();
    assertEquals("null", sw.toString());
  }

  @Test
  public void testLocale_writeValue() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.LOCALE.write(out, new Locale("en", "US"));
    out.flush();
    assertEquals("\"en_US\"", sw.toString());
  }

  @Test
  public void testLocaleFactory() {
    assertSame(TypeAdapters.LOCALE, TypeAdapters.LOCALE_FACTORY.create(new Gson(), TypeToken.get(Locale.class)));
    assertNull(TypeAdapters.LOCALE_FACTORY.create(new Gson(), TypeToken.get(String.class)));
  }

  // ---------------- JSON_ELEMENT ----------------

  @Test
  public void testJsonElement_readString() throws IOException {
    JsonElement el = TypeAdapters.JSON_ELEMENT.read(newReader("\"foo\""));
    assertTrue(el.isJsonPrimitive());
    assertEquals("foo", el.getAsString());
  }

  @Test
  public void testJsonElement_readNumber() throws IOException {
    JsonElement el = TypeAdapters.JSON_ELEMENT.read(newReader("42"));
    assertEquals(42, el.getAsInt());
  }

  @Test
  public void testJsonElement_readBoolean() throws IOException {
    JsonElement el = TypeAdapters.JSON_ELEMENT.read(newReader("true"));
    assertTrue(el.getAsBoolean());
  }

  @Test
  public void testJsonElement_readNull() throws IOException {
    JsonElement el = TypeAdapters.JSON_ELEMENT.read(newReader("null"));
    assertEquals(JsonNull.INSTANCE, el);
  }

  @Test
  public void testJsonElement_readArray() throws IOException {
    JsonElement el = TypeAdapters.JSON_ELEMENT.read(newReader("[1,2,3]"));
    assertTrue(el.isJsonArray());
    assertEquals(3, el.getAsJsonArray().size());
  }

  @Test
  public void testJsonElement_readObject() throws IOException {
    JsonElement el = TypeAdapters.JSON_ELEMENT.read(newReader("{\"a\":1,\"b\":true}"));
    assertTrue(el.isJsonObject());
    assertEquals(2, el.getAsJsonObject().entrySet().size());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testJsonElement_readEndDocumentThrows() throws IOException {
    JsonReader in = newReader("5");
    in.nextInt(); // บริโภค top-level value จนหมด -> peek() ต่อไปจะเป็น END_DOCUMENT
    TypeAdapters.JSON_ELEMENT.read(in);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testJsonElement_readNameTokenThrows() throws IOException {
    JsonReader in = newReader("{\"a\":1}");
    in.beginObject(); // peek() ตอนนี้คือ NAME
    TypeAdapters.JSON_ELEMENT.read(in);
  }

  @Test
  public void testJsonElement_writeNull() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.JSON_ELEMENT.write(out, null);
    out.flush();
    assertEquals("null", sw.toString());
  }

  @Test
  public void testJsonElement_writeJsonNull() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.JSON_ELEMENT.write(out, JsonNull.INSTANCE);
    out.flush();
    assertEquals("null", sw.toString());
  }

  @Test
  public void testJsonElement_writeNumberPrimitive() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.JSON_ELEMENT.write(out, new JsonPrimitive(5));
    out.flush();
    assertEquals("5", sw.toString());
  }

  @Test
  public void testJsonElement_writeBooleanPrimitive() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.JSON_ELEMENT.write(out, new JsonPrimitive(true));
    out.flush();
    assertEquals("true", sw.toString());
  }

  @Test
  public void testJsonElement_writeStringPrimitive() throws IOException {
    JsonWriter out = newWriter();
    TypeAdapters.JSON_ELEMENT.write(out, new JsonPrimitive("hi"));
    out.flush();
    assertEquals("\"hi\"", sw.toString());
  }

  @Test
  public void testJsonElement_writeArray() throws IOException {
    JsonArray arr = new JsonArray();
    arr.add(new JsonPrimitive(1));
    arr.add(new JsonPrimitive(2));
    JsonWriter out = newWriter();
    TypeAdapters.JSON_ELEMENT.write(out, arr);
    out.flush();
    assertEquals("[1,2]", sw.toString());
  }

  @Test
  public void testJsonElement_writeObject() throws IOException {
    JsonObject obj = new JsonObject();
    obj.addProperty("a", 1);
    JsonWriter out = newWriter();
    TypeAdapters.JSON_ELEMENT.write(out, obj);
    out.flush();
    assertEquals("{\"a\":1}", sw.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testJsonElement_writeUnknownElementTypeThrows() throws IOException {
    // JsonElement ลูกกำหนดเองที่ไม่ใช่ null/primitive/array/object -> ตก else สุดท้าย
    JsonElement custom = new JsonElement() {
      @Override
      public JsonElement deepCopy() {
        return this;
      }
    };
    TypeAdapters.JSON_ELEMENT.write(newWriter(), custom);
  }

  @Test
  public void testJsonElementFactory_typeHierarchy() {
    assertSame(TypeAdapters.JSON_ELEMENT,
        TypeAdapters.JSON_ELEMENT_FACTORY.create(new Gson(), TypeToken.get(JsonElement.class)));
    assertSame(TypeAdapters.JSON_ELEMENT,
        TypeAdapters.JSON_ELEMENT_FACTORY.create(new Gson(), TypeToken.get(JsonObject.class)));
    assertNull(TypeAdapters.JSON_ELEMENT_FACTORY.create(new Gson(), TypeToken.get(String.class)));
  }

  // ---------------- ENUM_FACTORY / EnumTypeAdapter ----------------

  private enum Color {
    @SerializedName(value = "RED", alternate = { "r", "red" })
    RED,
    GREEN,
    BLUE
  }

  private enum Op {
    PLUS {
      @Override
      int apply(int a, int b) { return a + b; }
    },
    MINUS {
      @Override
      int apply(int a, int b) { return a - b; }
    };
    abstract int apply(int a, int b);
  }

  @Test
  public void testEnumFactory_withEnumClassItselfReturnsNull() {
    assertNull(TypeAdapters.ENUM_FACTORY.create(new Gson(), TypeToken.get(Enum.class)));
  }

  @Test
  public void testEnumFactory_withNonEnumTypeReturnsNull() {
    assertNull(TypeAdapters.ENUM_FACTORY.create(new Gson(), TypeToken.get(String.class)));
  }

  @Test
  public void testEnumFactory_serializedNameAndAlternate() throws IOException {
    Gson gson = new Gson();
    TypeAdapter<?> raw = TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(Color.class));
    assertNotNull(raw);
    @SuppressWarnings("unchecked")
    TypeAdapter<Color> adapter = (TypeAdapter<Color>) raw;

    // write: RED มี annotation value="RED"
    JsonWriter out = newWriter();
    adapter.write(out, Color.RED);
    out.flush();
    assertEquals("\"RED\"", sw.toString());

    // read: alternate names
    assertEquals(Color.RED, adapter.read(newReader("\"r\"")));
    assertEquals(Color.RED, adapter.read(newReader("\"red\"")));

    // read: ค่าที่ไม่มี annotation ใช้ name() ตรง ๆ
    assertEquals(Color.GREEN, adapter.read(newReader("\"GREEN\"")));

    // read null
    assertNull(adapter.read(newReader("null")));

    // write null
    JsonWriter out2 = newWriter();
    adapter.write(out2, null);
    out2.flush();
    assertEquals("null", sw.toString());
  }

  @Test
  public void testEnumFactory_anonymousSubclassHandledViaSuperclass() throws IOException {
    Class<?> anonClass = Op.PLUS.getClass();
    assertFalse(anonClass.isEnum()); // เป็น anonymous subclass ของ Op ไม่ใช่ enum เอง

    TypeToken<?> tt = TypeToken.get(anonClass);
    TypeAdapter<?> raw = TypeAdapters.ENUM_FACTORY.create(new Gson(), tt);
    assertNotNull(raw);
    @SuppressWarnings("unchecked")
    TypeAdapter<Op> adapter = (TypeAdapter<Op>) raw;

    JsonWriter out = newWriter();
    adapter.write(out, Op.PLUS);
    out.flush();
    assertEquals("\"PLUS\"", sw.toString());
  }

  // ---------------- newFactory (TypeToken) ----------------

  @Test
  public void testNewFactory_byTypeToken() {
    TypeAdapter<String> myAdapter = new TypeAdapter<String>() {
      @Override public void write(JsonWriter out, String value) throws IOException { out.value(value); }
      @Override public String read(JsonReader in) throws IOException { return in.nextString(); }
    };
    TypeAdapterFactory factory = TypeAdapters.newFactory(TypeToken.get(String.class), myAdapter);
    assertSame(myAdapter, factory.create(new Gson(), TypeToken.get(String.class)));
    assertNull(factory.create(new Gson(), TypeToken.get(Integer.class)));
  }

  // ---------------- newFactory (Class) ----------------

  @Test
  public void testNewFactory_byClass() {
    TypeAdapter<String> myAdapter = new TypeAdapter<String>() {
      @Override public void write(JsonWriter out, String value) throws IOException { out.value(value); }
      @Override public String read(JsonReader in) throws IOException { return in.nextString(); }
    };
    TypeAdapterFactory factory = TypeAdapters.newFactory(String.class, myAdapter);
    assertSame(myAdapter, factory.create(new Gson(), TypeToken.get(String.class)));
    assertNull(factory.create(new Gson(), TypeToken.get(Integer.class)));
    assertTrue(factory.toString().contains("String"));
  }

  // ---------------- newFactory (unboxed, boxed) ----------------

  @Test
  public void testNewFactory_unboxedBoxed() {
    TypeAdapterFactory factory = TypeAdapters.newFactory(int.class, Integer.class, TypeAdapters.INTEGER);
    assertSame(TypeAdapters.INTEGER, factory.create(new Gson(), TypeToken.get(int.class)));
    assertSame(TypeAdapters.INTEGER, factory.create(new Gson(), TypeToken.get(Integer.class)));
    assertNull(factory.create(new Gson(), TypeToken.get(String.class)));
    assertTrue(factory.toString().contains("Integer"));
  }

  // ---------------- newFactoryForMultipleTypes ----------------

  @Test
  public void testNewFactoryForMultipleTypes() {
    TypeAdapterFactory factory =
        TypeAdapters.newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, TypeAdapters.CALENDAR);
    assertSame(TypeAdapters.CALENDAR, factory.create(new Gson(), TypeToken.get(Calendar.class)));
    assertSame(TypeAdapters.CALENDAR, factory.create(new Gson(), TypeToken.get(GregorianCalendar.class)));
    assertNull(factory.create(new Gson(), TypeToken.get(Date.class)));
  }

  // ---------------- newTypeHierarchyFactory ----------------

  @Test
  public void testNewTypeHierarchyFactory() {
    TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(InetAddress.class, TypeAdapters.INET_ADDRESS);
    assertSame(TypeAdapters.INET_ADDRESS, factory.create(new Gson(), TypeToken.get(InetAddress.class)));
    assertNull(factory.create(new Gson(), TypeToken.get(String.class)));
  }

  // ---------------- private constructor ----------------

  @Test
  public void testPrivateConstructorThrowsUnsupportedOperationException() throws Exception {
    Constructor<TypeAdapters> constructor = TypeAdapters.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    try {
      constructor.newInstance();
      fail("คาดว่าจะเกิด InvocationTargetException ที่ครอบ UnsupportedOperationException");
    } catch (InvocationTargetException e) {
      assertTrue(e.getCause() instanceof UnsupportedOperationException);
    }
  }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม (จัดกลุ่มตาม Adapter/Factory)

| กลุ่มเมธอดเทส | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testClass_*` | write: null vs non-null (throw); read: NULL token vs อื่น ๆ (throw); Factory match/mismatch |
| `testBitSet_*` | read: NULL, switch-case NUMBER/BOOLEAN/STRING(valid/invalid), default(invalid token); write: null, loop true/false bit |
| `testBoolean_*`, `testBooleanAsString_*` | read: NULL/STRING/BOOLEAN branch; write: null vs value; Factory unboxed/boxed/mismatch |
| `testByte_*`,`testShort_*`,`testInteger_*` | read: NULL, valid, NumberFormatException→JsonSyntaxException; write; Factory match/mismatch |
| `testLong_*` | เหมือนกลุ่มบน แต่ไม่มี Factory ในซอร์ส |
| `testFloat_*`,`testDouble_*` | read: NULL, valid, invalid (ไม่ wrap exception - unwrap NumberFormatException) |
| `testNumber_*` | switch: NULL/NUMBER/default(throw); write; Factory |
| `testCharacter_*` | read: NULL, length==1 vs !=1(throw); write null/value; Factory |
| `testString_*` | read: NULL/BOOLEAN(coerce)/STRING; write; Factory |
| `testBigDecimal_*`,`testBigInteger_*` | read: NULL, valid, NumberFormatException→JsonSyntaxException; write |
| `testStringBuilder_*`,`testStringBuffer_*` | read NULL/valid; write null/value; Factory |
| `testUrl_*` | read: NULL, "null" literal→null, valid; write null/value; Factory |
| `testUri_*` | read: NULL, "null" literal, valid, URISyntaxException→JsonIOException; write; Factory |
| `testInetAddress_*` | read NULL/valid; write null/value; TypeHierarchyFactory match/mismatch |
| `testUuid_*` | read NULL/valid/invalid(IllegalArgumentException); write null/value; Factory |
| `testTimestampFactory_*` | create: rawType != Timestamp → null; == Timestamp → adapter; read/write ผ่าน delegate Date adapter (null และ non-null) |
| `testCalendar_*` | read NULL; if/else-if ทุกสาขา (YEAR..SECOND) และกรณี field ไม่ตรง (ตกผ่านไปโดยไม่ set); write null/value; Multi-type Factory |
| `testLocale_*` | read NULL; StringTokenizer 1/2/3 tokens → if/else-if/else 3 สาขา; write null/value; Factory |
| `testJsonElement_*` | switch ครบทุก case (STRING/NUMBER/BOOLEAN/NULL/BEGIN_ARRAY/BEGIN_OBJECT/default); write: null/JsonNull/primitive(number,boolean,string)/array/object/else(throw); TypeHierarchyFactory |
| `testEnumFactory_*` | rawType==Enum.class→null; ไม่ใช่ enum→null; annotation!=null(+alternate loop)กับ annotation==null; anonymous subclass→getSuperclass() branch |
| `testNewFactory_byTypeToken/byClass/unboxedBoxed` | equals()/== match กับ mismatch ในแต่ละ overload |
| `testNewFactoryForMultipleTypes` | base/sub/mismatch |
| `testNewTypeHierarchyFactory` | isAssignableFrom true/false |
| `testPrivateConstructorThrowsUnsupportedOperationException` | private constructor throw path |

**ข้อสังเกตสำคัญที่อาจดักจับ fault ได้จริง:**
- `FLOAT`/`DOUBLE` ไม่ wrap `NumberFormatException` เป็น `JsonSyntaxException` เหมือน `BYTE/SHORT/INTEGER/LONG` — เทส `testFloat_readInvalid_throwsUnwrapped` และ `testDouble_readInvalid_throwsUnwrapped` จะ fail ทันทีถ้ามีการแก้โค้ดให้ wrap แบบ inconsistent หรือถ้าคาดหวังผิด
- `testUuid_readInvalidFormat` ตรวจว่า exception ที่หลุดออกมาคือ `IllegalArgumentException` (ไม่ถูก wrap) ตามซอร์สจริง