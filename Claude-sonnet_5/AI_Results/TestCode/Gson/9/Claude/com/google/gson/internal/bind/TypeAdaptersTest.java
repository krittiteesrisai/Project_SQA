package com.google.gson.internal.bind;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

import org.junit.Test;

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
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class TypeAdaptersTest {

  private static JsonReader reader(String json) {
    return new JsonReader(new StringReader(json));
  }

  private static JsonWriter writer(StringWriter sw) {
    return new JsonWriter(sw);
  }

  // ---------- Private constructor ----------
  @Test
  public void testPrivateConstructorThrows() throws Exception {
    Constructor<TypeAdapters> ctor = TypeAdapters.class.getDeclaredConstructor();
    ctor.setAccessible(true);
    try {
      ctor.newInstance();
      fail("Expected UnsupportedOperationException");
    } catch (InvocationTargetException e) {
      assertTrue(e.getCause() instanceof UnsupportedOperationException);
    }
  }

  // ---------- CLASS ----------
  @Test
  public void testClassWriteNull() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.CLASS.write(writer(sw), null);
    assertEquals("null", sw.toString());
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testClassWriteNonNull() throws IOException {
    TypeAdapters.CLASS.write(writer(new StringWriter()), String.class);
  }

  @Test
  public void testClassReadNull() throws IOException {
    assertNull(TypeAdapters.CLASS.read(reader("null")));
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testClassReadNonNull() throws IOException {
    TypeAdapters.CLASS.read(reader("\"foo\""));
  }

  @Test
  public void testClassFactory() {
    assertNotNull(TypeAdapters.CLASS_FACTORY.create(null, TypeToken.get(Class.class)));
    assertNull(TypeAdapters.CLASS_FACTORY.create(null, TypeToken.get(String.class)));
  }

  // ---------- BIT_SET ----------
  @Test
  public void testBitSetReadNull() throws IOException {
    assertNull(TypeAdapters.BIT_SET.read(reader("null")));
  }

  @Test
  public void testBitSetReadNumbers() throws IOException {
    BitSet bs = TypeAdapters.BIT_SET.read(reader("[1,0,1]"));
    assertTrue(bs.get(0));
    assertFalse(bs.get(1));
    assertTrue(bs.get(2));
  }

  @Test
  public void testBitSetReadBooleans() throws IOException {
    BitSet bs = TypeAdapters.BIT_SET.read(reader("[true,false]"));
    assertTrue(bs.get(0));
    assertFalse(bs.get(1));
  }

  @Test
  public void testBitSetReadStringsValid() throws IOException {
    BitSet bs = TypeAdapters.BIT_SET.read(reader("[\"1\",\"0\"]"));
    assertTrue(bs.get(0));
    assertFalse(bs.get(1));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBitSetReadStringsInvalid() throws IOException {
    TypeAdapters.BIT_SET.read(reader("[\"abc\"]"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBitSetReadInvalidType() throws IOException {
    TypeAdapters.BIT_SET.read(reader("[null]"));
  }

  @Test
  public void testBitSetReadEmptyArray() throws IOException {
    BitSet bs = TypeAdapters.BIT_SET.read(reader("[]"));
    assertEquals(0, bs.length());
  }

  @Test
  public void testBitSetWriteNull() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.BIT_SET.write(writer(sw), null);
    assertEquals("null", sw.toString());
  }

  @Test
  public void testBitSetWriteValues() throws IOException {
    BitSet bs = new BitSet();
    bs.set(0);
    bs.set(2);
    StringWriter sw = new StringWriter();
    TypeAdapters.BIT_SET.write(writer(sw), bs);
    assertEquals("[1,0,1]", sw.toString());
  }

  @Test
  public void testBitSetFactory() {
    assertNotNull(TypeAdapters.BIT_SET_FACTORY.create(null, TypeToken.get(BitSet.class)));
    assertNull(TypeAdapters.BIT_SET_FACTORY.create(null, TypeToken.get(String.class)));
  }

  // ---------- BOOLEAN ----------
  @Test
  public void testBooleanReadNull() throws IOException {
    assertNull(TypeAdapters.BOOLEAN.read(reader("null")));
  }

  @Test
  public void testBooleanReadString() throws IOException {
    assertTrue(TypeAdapters.BOOLEAN.read(reader("\"true\"")));
    assertFalse(TypeAdapters.BOOLEAN.read(reader("\"false\"")));
  }

  @Test
  public void testBooleanReadBoolean() throws IOException {
    assertTrue(TypeAdapters.BOOLEAN.read(reader("true")));
  }

  @Test
  public void testBooleanWriteNull() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.BOOLEAN.write(writer(sw), null);
    assertEquals("null", sw.toString());
  }

  @Test
  public void testBooleanWriteValue() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.BOOLEAN.write(writer(sw), true);
    assertEquals("true", sw.toString());
  }

  // ---------- BOOLEAN_AS_STRING ----------
  @Test
  public void testBooleanAsStringReadNull() throws IOException {
    assertNull(TypeAdapters.BOOLEAN_AS_STRING.read(reader("null")));
  }

  @Test
  public void testBooleanAsStringReadValue() throws IOException {
    assertTrue(TypeAdapters.BOOLEAN_AS_STRING.read(reader("\"true\"")));
  }

  @Test
  public void testBooleanAsStringWriteNull() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.BOOLEAN_AS_STRING.write(writer(sw), null);
    assertEquals("\"null\"", sw.toString());
  }

  @Test
  public void testBooleanAsStringWriteValue() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.BOOLEAN_AS_STRING.write(writer(sw), false);
    assertEquals("\"false\"", sw.toString());
  }

  @Test
  public void testBooleanFactory() {
    assertNotNull(TypeAdapters.BOOLEAN_FACTORY.create(null, TypeToken.get(boolean.class)));
    assertNotNull(TypeAdapters.BOOLEAN_FACTORY.create(null, TypeToken.get(Boolean.class)));
    assertNull(TypeAdapters.BOOLEAN_FACTORY.create(null, TypeToken.get(String.class)));
  }

  // ---------- BYTE ----------
  @Test
  public void testByteReadNull() throws IOException {
    assertNull(TypeAdapters.BYTE.read(reader("null")));
  }

  @Test
  public void testByteReadValid() throws IOException {
    Number n = TypeAdapters.BYTE.read(reader("5"));
    assertEquals((byte) 5, n.byteValue());
  }

  @Test(expected = JsonSyntaxException.class)
  public void testByteReadInvalid() throws IOException {
    TypeAdapters.BYTE.read(reader("\"abc\""));
  }

  @Test
  public void testByteWrite() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.BYTE.write(writer(sw), (byte) 7);
    assertEquals("7", sw.toString());
  }

  @Test
  public void testByteFactory() {
    assertNotNull(TypeAdapters.BYTE_FACTORY.create(null, TypeToken.get(byte.class)));
    assertNotNull(TypeAdapters.BYTE_FACTORY.create(null, TypeToken.get(Byte.class)));
  }

  // ---------- SHORT ----------
  @Test
  public void testShortReadNull() throws IOException {
    assertNull(TypeAdapters.SHORT.read(reader("null")));
  }

  @Test
  public void testShortReadValid() throws IOException {
    Number n = TypeAdapters.SHORT.read(reader("123"));
    assertEquals((short) 123, n.shortValue());
  }

  @Test(expected = JsonSyntaxException.class)
  public void testShortReadInvalid() throws IOException {
    TypeAdapters.SHORT.read(reader("\"abc\""));
  }

  @Test
  public void testShortWrite() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.SHORT.write(writer(sw), (short) 9);
    assertEquals("9", sw.toString());
  }

  @Test
  public void testShortFactory() {
    assertNotNull(TypeAdapters.SHORT_FACTORY.create(null, TypeToken.get(short.class)));
    assertNotNull(TypeAdapters.SHORT_FACTORY.create(null, TypeToken.get(Short.class)));
  }

  // ---------- INTEGER ----------
  @Test
  public void testIntegerReadNull() throws IOException {
    assertNull(TypeAdapters.INTEGER.read(reader("null")));
  }

  @Test
  public void testIntegerReadValid() throws IOException {
    Number n = TypeAdapters.INTEGER.read(reader("42"));
    assertEquals(42, n.intValue());
  }

  @Test(expected = JsonSyntaxException.class)
  public void testIntegerReadInvalid() throws IOException {
    TypeAdapters.INTEGER.read(reader("\"abc\""));
  }

  @Test
  public void testIntegerWrite() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.INTEGER.write(writer(sw), 42);
    assertEquals("42", sw.toString());
  }

  @Test
  public void testIntegerFactory() {
    assertNotNull(TypeAdapters.INTEGER_FACTORY.create(null, TypeToken.get(int.class)));
    assertNotNull(TypeAdapters.INTEGER_FACTORY.create(null, TypeToken.get(Integer.class)));
  }

  // ---------- ATOMIC_INTEGER (nullSafe) ----------
  @Test
  public void testAtomicIntegerReadValid() throws IOException {
    AtomicInteger ai = TypeAdapters.ATOMIC_INTEGER.read(reader("10"));
    assertEquals(10, ai.get());
  }

  @Test
  public void testAtomicIntegerReadNull() throws IOException {
    assertNull(TypeAdapters.ATOMIC_INTEGER.read(reader("null")));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testAtomicIntegerReadInvalid() throws IOException {
    TypeAdapters.ATOMIC_INTEGER.read(reader("\"abc\""));
  }

  @Test
  public void testAtomicIntegerWrite() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.ATOMIC_INTEGER.write(writer(sw), new AtomicInteger(5));
    assertEquals("5", sw.toString());
  }

  @Test
  public void testAtomicIntegerWriteNull() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.ATOMIC_INTEGER.write(writer(sw), null);
    assertEquals("null", sw.toString());
  }

  @Test
  public void testAtomicIntegerFactory() {
    assertNotNull(TypeAdapters.ATOMIC_INTEGER_FACTORY.create(null, TypeToken.get(AtomicInteger.class)));
  }

  // ---------- ATOMIC_BOOLEAN (nullSafe) ----------
  @Test
  public void testAtomicBooleanReadValid() throws IOException {
    AtomicBoolean ab = TypeAdapters.ATOMIC_BOOLEAN.read(reader("true"));
    assertTrue(ab.get());
  }

  @Test
  public void testAtomicBooleanReadNull() throws IOException {
    assertNull(TypeAdapters.ATOMIC_BOOLEAN.read(reader("null")));
  }

  @Test
  public void testAtomicBooleanWrite() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.ATOMIC_BOOLEAN.write(writer(sw), new AtomicBoolean(true));
    assertEquals("true", sw.toString());
  }

  @Test
  public void testAtomicBooleanFactory() {
    assertNotNull(TypeAdapters.ATOMIC_BOOLEAN_FACTORY.create(null, TypeToken.get(AtomicBoolean.class)));
  }

  // ---------- ATOMIC_INTEGER_ARRAY (nullSafe) ----------
  @Test
  public void testAtomicIntegerArrayReadEmpty() throws IOException {
    AtomicIntegerArray arr = TypeAdapters.ATOMIC_INTEGER_ARRAY.read(reader("[]"));
    assertEquals(0, arr.length());
  }

  @Test
  public void testAtomicIntegerArrayReadValues() throws IOException {
    AtomicIntegerArray arr = TypeAdapters.ATOMIC_INTEGER_ARRAY.read(reader("[1,2,3]"));
    assertEquals(3, arr.length());
    assertEquals(1, arr.get(0));
    assertEquals(2, arr.get(1));
    assertEquals(3, arr.get(2));
  }

  @Test
  public void testAtomicIntegerArrayReadNull() throws IOException {
    assertNull(TypeAdapters.ATOMIC_INTEGER_ARRAY.read(reader("null")));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testAtomicIntegerArrayReadInvalid() throws IOException {
    TypeAdapters.ATOMIC_INTEGER_ARRAY.read(reader("[\"abc\"]"));
  }

  @Test
  public void testAtomicIntegerArrayWrite() throws IOException {
    AtomicIntegerArray arr = new AtomicIntegerArray(2);
    arr.set(0, 1);
    arr.set(1, 2);
    StringWriter sw = new StringWriter();
    TypeAdapters.ATOMIC_INTEGER_ARRAY.write(writer(sw), arr);
    assertEquals("[1,2]", sw.toString());
  }

  @Test
  public void testAtomicIntegerArrayFactory() {
    assertNotNull(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY.create(null, TypeToken.get(AtomicIntegerArray.class)));
  }

  // ---------- LONG ----------
  @Test
  public void testLongReadNull() throws IOException {
    assertNull(TypeAdapters.LONG.read(reader("null")));
  }

  @Test
  public void testLongReadValid() throws IOException {
    Number n = TypeAdapters.LONG.read(reader("123456789012"));
    assertEquals(123456789012L, n.longValue());
  }

  @Test(expected = JsonSyntaxException.class)
  public void testLongReadInvalid() throws IOException {
    TypeAdapters.LONG.read(reader("\"abc\""));
  }

  @Test
  public void testLongWrite() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.LONG.write(writer(sw), 100L);
    assertEquals("100", sw.toString());
  }

  // ---------- FLOAT ----------
  @Test
  public void testFloatReadNull() throws IOException {
    assertNull(TypeAdapters.FLOAT.read(reader("null")));
  }

  @Test
  public void testFloatReadValid() throws IOException {
    Number n = TypeAdapters.FLOAT.read(reader("1.5"));
    assertEquals(1.5f, n.floatValue(), 0.0001);
  }

  @Test
  public void testFloatWrite() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.FLOAT.write(writer(sw), 1.5f);
    assertEquals("1.5", sw.toString());
  }

  // ---------- DOUBLE ----------
  @Test
  public void testDoubleReadNull() throws IOException {
    assertNull(TypeAdapters.DOUBLE.read(reader("null")));
  }

  @Test
  public void testDoubleReadValid() throws IOException {
    Number n = TypeAdapters.DOUBLE.read(reader("2.5"));
    assertEquals(2.5, n.doubleValue(), 0.0001);
  }

  @Test
  public void testDoubleWrite() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.DOUBLE.write(writer(sw), 2.5);
    assertEquals("2.5", sw.toString());
  }

  // ---------- NUMBER ----------
  @Test
  public void testNumberReadNull() throws IOException {
    assertNull(TypeAdapters.NUMBER.read(reader("null")));
  }

  @Test
  public void testNumberReadValid() throws IOException {
    Number n = TypeAdapters.NUMBER.read(reader("3.14"));
    assertEquals(3.14, n.doubleValue(), 0.0001);
  }

  @Test(expected = JsonSyntaxException.class)
  public void testNumberReadInvalidType() throws IOException {
    TypeAdapters.NUMBER.read(reader("\"abc\""));
  }

  @Test
  public void testNumberWrite() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.NUMBER.write(writer(sw), 3);
    assertEquals("3", sw.toString());
  }

  @Test
  public void testNumberFactory() {
    assertNotNull(TypeAdapters.NUMBER_FACTORY.create(null, TypeToken.get(Number.class)));
  }

  // ---------- CHARACTER ----------
  @Test
  public void testCharacterReadNull() throws IOException {
    assertNull(TypeAdapters.CHARACTER.read(reader("null")));
  }

  @Test
  public void testCharacterReadValid() throws IOException {
    Character c = TypeAdapters.CHARACTER.read(reader("\"a\""));
    assertEquals('a', c.charValue());
  }

  @Test(expected = JsonSyntaxException.class)
  public void testCharacterReadInvalid() throws IOException {
    TypeAdapters.CHARACTER.read(reader("\"ab\""));
  }

  @Test
  public void testCharacterWriteNull() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.CHARACTER.write(writer(sw), null);
    assertEquals("null", sw.toString());
  }

  @Test
  public void testCharacterWriteValid() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.CHARACTER.write(writer(sw), 'x');
    assertEquals("\"x\"", sw.toString());
  }

  @Test
  public void testCharacterFactory() {
    assertNotNull(TypeAdapters.CHARACTER_FACTORY.create(null, TypeToken.get(char.class)));
    assertNotNull(TypeAdapters.CHARACTER_FACTORY.create(null, TypeToken.get(Character.class)));
  }

  // ---------- STRING ----------
  @Test
  public void testStringReadNull() throws IOException {
    assertNull(TypeAdapters.STRING.read(reader("null")));
  }

  @Test
  public void testStringReadBoolean() throws IOException {
    assertEquals("true", TypeAdapters.STRING.read(reader("true")));
  }

  @Test
  public void testStringReadPlain() throws IOException {
    assertEquals("hello", TypeAdapters.STRING.read(reader("\"hello\"")));
  }

  @Test
  public void testStringWrite() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.STRING.write(writer(sw), "hi");
    assertEquals("\"hi\"", sw.toString());
  }

  @Test
  public void testStringFactory() {
    assertNotNull(TypeAdapters.STRING_FACTORY.create(null, TypeToken.get(String.class)));
  }

  // ---------- BIG_DECIMAL ----------
  @Test
  public void testBigDecimalReadNull() throws IOException {
    assertNull(TypeAdapters.BIG_DECIMAL.read(reader("null")));
  }

  @Test
  public void testBigDecimalReadValid() throws IOException {
    BigDecimal bd = TypeAdapters.BIG_DECIMAL.read(reader("\"3.14\""));
    assertEquals(new BigDecimal("3.14"), bd);
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBigDecimalReadInvalid() throws IOException {
    TypeAdapters.BIG_DECIMAL.read(reader("\"abc\""));
  }

  @Test
  public void testBigDecimalWrite() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.BIG_DECIMAL.write(writer(sw), new BigDecimal("5.0"));
    assertEquals("5.0", sw.toString());
  }

  // ---------- BIG_INTEGER ----------
  @Test
  public void testBigIntegerReadNull() throws IOException {
    assertNull(TypeAdapters.BIG_INTEGER.read(reader("null")));
  }

  @Test
  public void testBigIntegerReadValid() throws IOException {
    BigInteger bi = TypeAdapters.BIG_INTEGER.read(reader("\"12345\""));
    assertEquals(new BigInteger("12345"), bi);
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBigIntegerReadInvalid() throws IOException {
    TypeAdapters.BIG_INTEGER.read(reader("\"abc\""));
  }

  @Test
  public void testBigIntegerWrite() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.BIG_INTEGER.write(writer(sw), new BigInteger("99"));
    assertEquals("99", sw.toString());
  }

  // ---------- STRING_BUILDER ----------
  @Test
  public void testStringBuilderReadNull() throws IOException {
    assertNull(TypeAdapters.STRING_BUILDER.read(reader("null")));
  }

  @Test
  public void testStringBuilderReadValid() throws IOException {
    StringBuilder sb = TypeAdapters.STRING_BUILDER.read(reader("\"hi\""));
    assertEquals("hi", sb.toString());
  }

  @Test
  public void testStringBuilderWriteNull() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.STRING_BUILDER.write(writer(sw), null);
    assertEquals("null", sw.toString());
  }

  @Test
  public void testStringBuilderWriteValid() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.STRING_BUILDER.write(writer(sw), new StringBuilder("abc"));
    assertEquals("\"abc\"", sw.toString());
  }

  @Test
  public void testStringBuilderFactory() {
    assertNotNull(TypeAdapters.STRING_BUILDER_FACTORY.create(null, TypeToken.get(StringBuilder.class)));
  }

  // ---------- STRING_BUFFER ----------
  @Test
  public void testStringBufferReadNull() throws IOException {
    assertNull(TypeAdapters.STRING_BUFFER.read(reader("null")));
  }

  @Test
  public void testStringBufferReadValid() throws IOException {
    StringBuffer sb = TypeAdapters.STRING_BUFFER.read(reader("\"hi\""));
    assertEquals("hi", sb.toString());
  }

  @Test
  public void testStringBufferWriteNull() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.STRING_BUFFER.write(writer(sw), null);
    assertEquals("null", sw.toString());
  }

  @Test
  public void testStringBufferWriteValid() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.STRING_BUFFER.write(writer(sw), new StringBuffer("xyz"));
    assertEquals("\"xyz\"", sw.toString());
  }

  @Test
  public void testStringBufferFactory() {
    assertNotNull(TypeAdapters.STRING_BUFFER_FACTORY.create(null, TypeToken.get(StringBuffer.class)));
  }

  // ---------- URL ----------
  @Test
  public void testUrlReadNull() throws IOException {
    assertNull(TypeAdapters.URL.read(reader("null")));
  }

  @Test
  public void testUrlReadNullString() throws IOException {
    assertNull(TypeAdapters.URL.read(reader("\"null\"")));
  }

  @Test
  public void testUrlReadValid() throws IOException {
    URL url = TypeAdapters.URL.read(reader("\"http://example.com\""));
    assertEquals("http://example.com", url.toExternalForm());
  }

  @Test
  public void testUrlWriteNull() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.URL.write(writer(sw), null);
    assertEquals("null", sw.toString());
  }

  @Test
  public void testUrlWriteValid() throws IOException, MalformedURLException {
    StringWriter sw = new StringWriter();
    TypeAdapters.URL.write(writer(sw), new URL("http://example.com"));
    assertEquals("\"http://example.com\"", sw.toString());
  }

  @Test
  public void testUrlFactory() {
    assertNotNull(TypeAdapters.URL_FACTORY.create(null, TypeToken.get(URL.class)));
  }

  // ---------- URI ----------
  @Test
  public void testUriReadNull() throws IOException {
    assertNull(TypeAdapters.URI.read(reader("null")));
  }

  @Test
  public void testUriReadNullString() throws IOException {
    assertNull(TypeAdapters.URI.read(reader("\"null\"")));
  }

  @Test
  public void testUriReadValid() throws IOException {
    URI uri = TypeAdapters.URI.read(reader("\"http://example.com\""));
    assertEquals("http://example.com", uri.toASCIIString());
  }

  @Test(expected = JsonIOException.class)
  public void testUriReadInvalid() throws IOException {
    // ช่องว่างใน URI ทำให้เกิด URISyntaxException -> ถูกครอบเป็น JsonIOException
    TypeAdapters.URI.read(reader("\"http://a b\""));
  }

  @Test
  public void testUriWriteNull() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.URI.write(writer(sw), null);
    assertEquals("null", sw.toString());
  }

  @Test
  public void testUriWriteValid() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.URI.write(writer(sw), java.net.URI.create("http://example.com"));
    assertEquals("\"http://example.com\"", sw.toString());
  }

  @Test
  public void testUriFactory() {
    assertNotNull(TypeAdapters.URI_FACTORY.create(null, TypeToken.get(URI.class)));
  }

  // ---------- INET_ADDRESS ----------
  @Test
  public void testInetAddressReadNull() throws IOException {
    assertNull(TypeAdapters.INET_ADDRESS.read(reader("null")));
  }

  @Test
  public void testInetAddressReadValid() throws IOException {
    InetAddress addr = TypeAdapters.INET_ADDRESS.read(reader("\"127.0.0.1\""));
    assertEquals("127.0.0.1", addr.getHostAddress());
  }

  @Test
  public void testInetAddressWriteNull() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.INET_ADDRESS.write(writer(sw), null);
    assertEquals("null", sw.toString());
  }

  @Test
  public void testInetAddressWriteValid() throws IOException {
    StringWriter sw = new StringWriter();
    InetAddress addr = InetAddress.getByName("127.0.0.1");
    TypeAdapters.INET_ADDRESS.write(writer(sw), addr);
    assertEquals("\"127.0.0.1\"", sw.toString());
  }

  @Test
  public void testInetAddressFactory() {
    assertNotNull(TypeAdapters.INET_ADDRESS_FACTORY.create(null, TypeToken.get(InetAddress.class)));
    assertNull(TypeAdapters.INET_ADDRESS_FACTORY.create(null, TypeToken.get(String.class)));
  }

  // ---------- UUID ----------
  @Test
  public void testUuidReadNull() throws IOException {
    assertNull(TypeAdapters.UUID.read(reader("null")));
  }

  @Test
  public void testUuidReadValid() throws IOException {
    String uuidStr = "550e8400-e29b-41d4-a716-446655440000";
    UUID uuid = TypeAdapters.UUID.read(reader("\"" + uuidStr + "\""));
    assertEquals(uuidStr, uuid.toString());
  }

  @Test
  public void testUuidWriteNull() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.UUID.write(writer(sw), null);
    assertEquals("null", sw.toString());
  }

  @Test
  public void testUuidWriteValid() throws IOException {
    StringWriter sw = new StringWriter();
    UUID uuid = java.util.UUID.fromString("550e8400-e29b-41d4-a716-446655440000");
    TypeAdapters.UUID.write(writer(sw), uuid);
    assertEquals("\"550e8400-e29b-41d4-a716-446655440000\"", sw.toString());
  }

  @Test
  public void testUuidFactory() {
    assertNotNull(TypeAdapters.UUID_FACTORY.create(null, TypeToken.get(UUID.class)));
  }

  // ---------- CURRENCY (nullSafe) ----------
  @Test
  public void testCurrencyReadValid() throws IOException {
    Currency c = TypeAdapters.CURRENCY.read(reader("\"USD\""));
    assertEquals("USD", c.getCurrencyCode());
  }

  @Test
  public void testCurrencyReadNull() throws IOException {
    assertNull(TypeAdapters.CURRENCY.read(reader("null")));
  }

  @Test
  public void testCurrencyWriteValid() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.CURRENCY.write(writer(sw), Currency.getInstance("USD"));
    assertEquals("\"USD\"", sw.toString());
  }

  @Test
  public void testCurrencyFactory() {
    assertNotNull(TypeAdapters.CURRENCY_FACTORY.create(null, TypeToken.get(Currency.class)));
  }

  // ---------- TIMESTAMP_FACTORY ----------
  @Test
  public void testTimestampFactoryNonMatchingType() {
    Gson gson = new Gson();
    assertNull(TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(String.class)));
  }

  @Test
  public void testTimestampFactoryReadWrite() throws IOException {
    Gson gson = new Gson();
    TypeAdapter<Timestamp> adapter =
        TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Timestamp.class));
    assertNotNull(adapter);

    Timestamp original = new Timestamp(1000000L);
    StringWriter sw = new StringWriter();
    adapter.write(writer(sw), original);
    String json = sw.toString();
    assertNotEquals("null", json);

    Timestamp ts = adapter.read(reader(json));
    assertNotNull(ts);
    assertEquals(original.getTime(), ts.getTime());
  }

  @Test
  public void testTimestampFactoryReadNull() throws IOException {
    Gson gson = new Gson();
    TypeAdapter<Timestamp> adapter =
        TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Timestamp.class));
    assertNull(adapter.read(reader("null")));
  }

  // ---------- CALENDAR ----------
  @Test
  public void testCalendarReadNull() throws IOException {
    assertNull(TypeAdapters.CALENDAR.read(reader("null")));
  }

  @Test
  public void testCalendarReadValid() throws IOException {
    String json = "{\"year\":2020,\"month\":5,\"dayOfMonth\":10,"
        + "\"hourOfDay\":8,\"minute\":30,\"second\":15}";
    Calendar cal = TypeAdapters.CALENDAR.read(reader(json));
    assertEquals(2020, cal.get(Calendar.YEAR));
    assertEquals(5, cal.get(Calendar.MONTH));
    assertEquals(10, cal.get(Calendar.DAY_OF_MONTH));
    assertEquals(8, cal.get(Calendar.HOUR_OF_DAY));
    assertEquals(30, cal.get(Calendar.MINUTE));
    assertEquals(15, cal.get(Calendar.SECOND));
  }

  @Test
  public void testCalendarReadUnknownField() throws IOException {
    // ฟิลด์ที่ไม่รู้จักต้องถูกข้ามไปโดยไม่ error (ไม่ตรง if/else ใด ๆ)
    String json = "{\"unknown\":5,\"year\":2021}";
    Calendar cal = TypeAdapters.CALENDAR.read(reader(json));
    assertEquals(2021, cal.get(Calendar.YEAR));
  }

  @Test
  public void testCalendarWriteNull() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.CALENDAR.write(writer(sw), null);
    assertEquals("null", sw.toString());
  }

  @Test
  public void testCalendarWriteValid() throws IOException {
    GregorianCalendar cal = new GregorianCalendar(2020, 5, 10, 8, 30, 15);
    StringWriter sw = new StringWriter();
    TypeAdapters.CALENDAR.write(writer(sw), cal);
    String result = sw.toString();
    assertTrue(result.contains("\"year\":2020"));
    assertTrue(result.contains("\"month\":5"));
  }

  @Test
  public void testCalendarFactory() {
    assertNotNull(TypeAdapters.CALENDAR_FACTORY.create(null, TypeToken.get(Calendar.class)));
    assertNotNull(TypeAdapters.CALENDAR_FACTORY.create(null, TypeToken.get(GregorianCalendar.class)));
    assertNull(TypeAdapters.CALENDAR_FACTORY.create(null, TypeToken.get(String.class)));
  }

  // ---------- LOCALE ----------
  @Test
  public void testLocaleReadNull() throws IOException {
    assertNull(TypeAdapters.LOCALE.read(reader("null")));
  }

  @Test
  public void testLocaleReadLanguageOnly() throws IOException {
    Locale locale = TypeAdapters.LOCALE.read(reader("\"en\""));
    assertEquals(new Locale("en"), locale);
  }

  @Test
  public void testLocaleReadLanguageCountry() throws IOException {
    Locale locale = TypeAdapters.LOCALE.read(reader("\"en_US\""));
    assertEquals(new Locale("en", "US"), locale);
  }

  @Test
  public void testLocaleReadLanguageCountryVariant() throws IOException {
    Locale locale = TypeAdapters.LOCALE.read(reader("\"en_US_WIN\""));
    assertEquals(new Locale("en", "US", "WIN"), locale);
  }

  @Test
  public void testLocaleWriteNull() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.LOCALE.write(writer(sw), null);
    assertEquals("null", sw.toString());
  }

  @Test
  public void testLocaleWriteValid() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.LOCALE.write(writer(sw), new Locale("en", "US"));
    assertEquals("\"en_US\"", sw.toString());
  }

  @Test
  public void testLocaleFactory() {
    assertNotNull(TypeAdapters.LOCALE_FACTORY.create(null, TypeToken.get(Locale.class)));
  }

  // ---------- JSON_ELEMENT ----------
  @Test
  public void testJsonElementReadString() throws IOException {
    JsonElement e = TypeAdapters.JSON_ELEMENT.read(reader("\"hi\""));
    assertTrue(e.isJsonPrimitive());
    assertEquals("hi", e.getAsString());
  }

  @Test
  public void testJsonElementReadNumber() throws IOException {
    JsonElement e = TypeAdapters.JSON_ELEMENT.read(reader("42"));
    assertTrue(e.getAsJsonPrimitive().isNumber());
  }

  @Test
  public void testJsonElementReadBoolean() throws IOException {
    JsonElement e = TypeAdapters.JSON_ELEMENT.read(reader("true"));
    assertTrue(e.getAsJsonPrimitive().isBoolean());
  }

  @Test
  public void testJsonElementReadNull() throws IOException {
    JsonElement e = TypeAdapters.JSON_ELEMENT.read(reader("null"));
    assertEquals(JsonNull.INSTANCE, e);
  }

  @Test
  public void testJsonElementReadArray() throws IOException {
    JsonElement e = TypeAdapters.JSON_ELEMENT.read(reader("[1,2,3]"));
    assertTrue(e.isJsonArray());
    assertEquals(3, e.getAsJsonArray().size());
  }

  @Test
  public void testJsonElementReadObject() throws IOException {
    JsonElement e = TypeAdapters.JSON_ELEMENT.read(reader("{\"a\":1}"));
    assertTrue(e.isJsonObject());
    assertEquals(1, e.getAsJsonObject().get("a").getAsInt());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testJsonElementReadInvalidToken() throws IOException {
    // peek() == END_ARRAY -> ตกไปที่ default -> throw IllegalArgumentException
    JsonReader jr = reader("[]");
    jr.beginArray();
    TypeAdapters.JSON_ELEMENT.read(jr);
  }

  @Test
  public void testJsonElementWriteNull() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.JSON_ELEMENT.write(writer(sw), null);
    assertEquals("null", sw.toString());
  }

  @Test
  public void testJsonElementWriteJsonNull() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.JSON_ELEMENT.write(writer(sw), JsonNull.INSTANCE);
    assertEquals("null", sw.toString());
  }

  @Test
  public void testJsonElementWriteNumber() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.JSON_ELEMENT.write(writer(sw), new JsonPrimitive(5));
    assertEquals("5", sw.toString());
  }

  @Test
  public void testJsonElementWriteBoolean() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.JSON_ELEMENT.write(writer(sw), new JsonPrimitive(true));
    assertEquals("true", sw.toString());
  }

  @Test
  public void testJsonElementWriteStringPrimitive() throws IOException {
    StringWriter sw = new StringWriter();
    TypeAdapters.JSON_ELEMENT.write(writer(sw), new JsonPrimitive("abc"));
    assertEquals("\"abc\"", sw.toString());
  }

  @Test
  public void testJsonElementWriteArray() throws IOException {
    JsonArray arr = new JsonArray();
    arr.add(1);
    arr.add(2);
    StringWriter sw = new StringWriter();
    TypeAdapters.JSON_ELEMENT.write(writer(sw), arr);
    assertEquals("[1,2]", sw.toString());
  }

  @Test
  public void testJsonElementWriteObject() throws IOException {
    JsonObject obj = new JsonObject();
    obj.addProperty("a", 1);
    StringWriter sw = new StringWriter();
    TypeAdapters.JSON_ELEMENT.write(writer(sw), obj);
    assertEquals("{\"a\":1}", sw.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testJsonElementWriteUnknownSubclass() throws IOException {
    // JsonElement ที่ไม่ใช่ null/primitive/array/object -> เข้า else branch สุดท้าย
    JsonElement fake = new JsonElement() {
      @Override
      public JsonElement deepCopy() {
        return this;
      }
    };
    TypeAdapters.JSON_ELEMENT.write(writer(new StringWriter()), fake);
  }

  @Test
  public void testJsonElementFactory() {
    assertNotNull(TypeAdapters.JSON_ELEMENT_FACTORY.create(null, TypeToken.get(JsonElement.class)));
    assertNotNull(TypeAdapters.JSON_ELEMENT_FACTORY.create(null, TypeToken.get(JsonObject.class)));
    assertNull(TypeAdapters.JSON_ELEMENT_FACTORY.create(null, TypeToken.get(String.class)));
  }

  // ---------- ENUM_FACTORY ----------
  enum SampleEnum { A, B }

  @Test
  public void testEnumFactoryNonEnumType() {
    assertNull(TypeAdapters.ENUM_FACTORY.create(new Gson(), TypeToken.get(String.class)));
  }

  @Test
  public void testEnumFactoryEnumBaseClass() {
    assertNull(TypeAdapters.ENUM_FACTORY.create(new Gson(), TypeToken.get(Enum.class)));
  }

  @Test
  public void testEnumFactoryValidEnum() throws IOException {
    Gson gson = new Gson();
    TypeAdapter<SampleEnum> adapter =
        TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(SampleEnum.class));
    assertNotNull(adapter);
    assertEquals(SampleEnum.A, adapter.read(reader("\"A\"")));
  }

  enum AnonymousEnum {
    A {
      @Override void foo() { }
    };
    abstract void foo();
  }

  @Test
  public void testEnumFactoryAnonymousSubclass() {
    // enum constant-specific class body -> !rawType.isEnum() -> ใช้ getSuperclass()
    Gson gson = new Gson();
    TypeToken<?> tt = TypeToken.get(AnonymousEnum.A.getClass());
    TypeAdapter<?> adapter = TypeAdapters.ENUM_FACTORY.create(gson, tt);
    assertNotNull(adapter);
  }

  // ---------- newFactory(TypeToken, TypeAdapter) ----------
  @Test
  public void testNewFactoryTypeTokenMatch() {
    TypeAdapter<String> ta = TypeAdapters.STRING;
    TypeAdapterFactory factory = TypeAdapters.newFactory(TypeToken.get(String.class), ta);
    assertSame(ta, factory.create(null, TypeToken.get(String.class)));
    assertNull(factory.create(null, TypeToken.get(Integer.class)));
  }

  // ---------- newFactory(Class, TypeAdapter) ----------
  @Test
  public void testNewFactoryClassMatch() {
    TypeAdapter<String> ta = TypeAdapters.STRING;
    TypeAdapterFactory factory = TypeAdapters.newFactory(String.class, ta);
    assertSame(ta, factory.create(null, TypeToken.get(String.class)));
    assertNull(factory.create(null, TypeToken.get(Integer.class)));
    assertTrue(factory.toString().contains("String"));
  }

  // ---------- newFactory(unboxed, boxed, adapter) ----------
  @Test
  public void testNewFactoryUnboxedBoxed() {
    TypeAdapterFactory factory =
        TypeAdapters.newFactory(int.class, Integer.class, TypeAdapters.INTEGER);
    assertNotNull(factory.create(null, TypeToken.get(int.class)));
    assertNotNull(factory.create(null, TypeToken.get(Integer.class)));
    assertNull(factory.create(null, TypeToken.get(String.class)));
    assertTrue(factory.toString().contains("Integer"));
  }

  // ---------- newFactoryForMultipleTypes ----------
  @Test
  public void testNewFactoryForMultipleTypes() {
    TypeAdapterFactory factory = TypeAdapters.newFactoryForMultipleTypes(
        Calendar.class, GregorianCalendar.class, TypeAdapters.CALENDAR);
    assertNotNull(factory.create(null, TypeToken.get(Calendar.class)));
    assertNotNull(factory.create(null, TypeToken.get(GregorianCalendar.class)));
    assertNull(factory.create(null, TypeToken.get(String.class)));
    assertTrue(factory.toString().contains("Calendar"));
  }

  // ---------- newTypeHierarchyFactory ----------
  @Test
  public void testNewTypeHierarchyFactoryAssignable() throws IOException {
    TypeAdapterFactory factory = TypeAdapters.INET_ADDRESS_FACTORY;
    TypeAdapter<InetAddress> adapter = factory.create(null, TypeToken.get(InetAddress.class));
    assertNotNull(adapter);
    InetAddress addr = adapter.read(reader("\"127.0.0.1\""));
    assertEquals("127.0.0.1", addr.getHostAddress());
  }

  @Test
  public void testNewTypeHierarchyFactoryNotAssignable() {
    assertNull(TypeAdapters.INET_ADDRESS_FACTORY.create(null, TypeToken.get(String.class)));
  }

  @Test
  public void testNewTypeHierarchyFactoryToString() {
    assertTrue(TypeAdapters.INET_ADDRESS_FACTORY.toString().contains("InetAddress"));
  }
}
