package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

import static org.junit.Assert.*;

public class TypeAdaptersTest {

  @Test(expected = UnsupportedOperationException.class)
  public void testPrivateConstructor() throws Exception {
    java.lang.reflect.Constructor<TypeAdapters> c = TypeAdapters.class.getDeclaredConstructor();
    c.setAccessible(true);
    try {
      c.newInstance();
    } catch (java.lang.reflect.InvocationTargetException e) {
      throw (Exception) e.getCause();
    }
  }

  @Test
  public void testClassTypeAdapter() throws IOException {
    // Write Class
    StringWriter sw = new StringWriter();
    JsonWriter jw = new JsonWriter(sw);
    TypeAdapters.CLASS.write(jw, String.class);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testClassTypeAdapterWriteError() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter jw = new JsonWriter(sw);
    TypeAdapters.CLASS.write(jw, null); // Will call out.nullValue()
    TypeAdapters.CLASS.write(jw, String.class); // Will throw UnsupportedOperationException
  }

  @Test
  public void testClassTypeAdapterReadNull() throws IOException {
    JsonReader jr = new JsonReader(new StringReader("null"));
    assertNull(TypeAdapters.CLASS.read(jr));
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testClassTypeAdapterReadError() throws IOException {
    JsonReader jr = new JsonReader(new StringReader("\"java.lang.String\""));
    TypeAdapters.CLASS.read(jr);
  }

  @Test
  public void testBitSetTypeAdapter() throws IOException {
    // Read
    JsonReader jr = new JsonReader(new StringReader("[1, 0, true, \"1\", \"0\"]"));
    BitSet bitSet = TypeAdapters.BIT_SET.read(jr);
    assertNotNull(bitSet);
    assertTrue(bitSet.get(0));
    assertFalse(bitSet.get(1));
    assertTrue(bitSet.get(2));
    assertTrue(bitSet.get(3));
    assertFalse(bitSet.get(4));

    // Read Null
    JsonReader jrNull = new JsonReader(new StringReader("null"));
    assertNull(TypeAdapters.BIT_SET.read(jrNull));

    // Write
    StringWriter sw = new StringWriter();
    JsonWriter jw = new JsonWriter(sw);
    TypeAdapters.BIT_SET.write(jw, bitSet);
    assertTrue(sw.toString().startsWith("["));
    
    // Write null
    StringWriter swNull = new StringWriter();
    JsonWriter jwNull = new JsonWriter(swNull);
    TypeAdapters.BIT_SET.write(jwNull, null);
    assertEquals("null", swNull.toString());
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBitSetInvalidString() throws IOException {
    JsonReader jr = new JsonReader(new StringReader("[\"invalid-number\"]"));
    TypeAdapters.BIT_SET.read(jr);
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBitSetInvalidTokenType() throws IOException {
    JsonReader jr = new JsonReader(new StringReader("[{}]"));
    TypeAdapters.BIT_SET.read(jr);
  }

  @Test
  public void testBooleanTypeAdapters() throws IOException {
    // BOOLEAN read from string (Gson 1.7 compat)
    JsonReader jr1 = new JsonReader(new StringReader("\"true\""));
    assertTrue(TypeAdapters.BOOLEAN.read(jr1));

    JsonReader jrNull = new JsonReader(new StringReader("null"));
    assertNull(TypeAdapters.BOOLEAN.read(jrNull));

    StringWriter sw = new StringWriter();
    TypeAdapters.BOOLEAN.write(new JsonWriter(sw), null);
    assertEquals("null", sw.toString());

    // BOOLEAN_AS_STRING
    JsonReader jrStrNull = new JsonReader(new StringReader("null"));
    assertNull(TypeAdapters.BOOLEAN_AS_STRING.read(jrStrNull));

    JsonReader jrStr = new JsonReader(new StringReader("\"true\""));
    assertTrue(TypeAdapters.BOOLEAN_AS_STRING.read(jrStr));

    StringWriter swBoolStr = new StringWriter();
    TypeAdapters.BOOLEAN_AS_STRING.write(new JsonWriter(swBoolStr), null);
    assertEquals("null", swBoolStr.toString());
  }

  @Test
  public void testNumericTypeAdapters() throws IOException {
    // BYTE
    assertNull(TypeAdapters.BYTE.read(new JsonReader(new StringReader("null"))));
    assertEquals(Byte.valueOf((byte) 5), TypeAdapters.BYTE.read(new JsonReader(new StringReader("5"))));

    // SHORT
    assertNull(TypeAdapters.SHORT.read(new JsonReader(new StringReader("null"))));
    assertEquals(Short.valueOf((short) 5), TypeAdapters.SHORT.read(new JsonReader(new StringReader("5"))));

    // INTEGER
    assertNull(TypeAdapters.INTEGER.read(new JsonReader(new StringReader("null"))));
    assertEquals(Integer.valueOf(5), TypeAdapters.INTEGER.read(new JsonReader(new StringReader("5"))));

    // LONG
    assertNull(TypeAdapters.LONG.read(new JsonReader(new StringReader("null"))));
    assertEquals(Long.valueOf(5L), TypeAdapters.LONG.read(new JsonReader(new StringReader("5"))));

    // FLOAT
    assertNull(TypeAdapters.FLOAT.read(new JsonReader(new StringReader("null"))));
    assertEquals(Float.valueOf(5.0f), TypeAdapters.FLOAT.read(new JsonReader(new StringReader("5.0"))));

    // DOUBLE
    assertNull(TypeAdapters.DOUBLE.read(new JsonReader(new StringReader("null"))));
    assertEquals(Double.valueOf(5.0), TypeAdapters.DOUBLE.read(new JsonReader(new StringReader("5.0"))));

    // NUMBER
    assertNull(TypeAdapters.NUMBER.read(new JsonReader(new StringReader("null"))));
    assertNotNull(TypeAdapters.NUMBER.read(new JsonReader(new StringReader("123"))));

    // BIG_DECIMAL & BIG_INTEGER
    assertNull(TypeAdapters.BIG_DECIMAL.read(new JsonReader(new StringReader("null"))));
    assertEquals(new BigDecimal("123.45"), TypeAdapters.BIG_DECIMAL.read(new JsonReader(new StringReader("123.45"))));

    assertNull(TypeAdapters.BIG_INTEGER.read(new JsonReader(new StringReader("null"))));
    assertEquals(new BigInteger("123"), TypeAdapters.BIG_INTEGER.read(new JsonReader(new StringReader("123"))));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testByteNumberFormatException() throws IOException {
    TypeAdapters.BYTE.read(new JsonReader(new StringReader("\"abc\"")));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testShortNumberFormatException() throws IOException {
    TypeAdapters.SHORT.read(new JsonReader(new StringReader("\"abc\"")));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testIntegerNumberFormatException() throws IOException {
    TypeAdapters.INTEGER.read(new JsonReader(new StringReader("\"abc\"")));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testLongNumberFormatException() throws IOException {
    TypeAdapters.LONG.read(new JsonReader(new StringReader("\"abc\"")));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBigDecimalNumberFormatException() throws IOException {
    TypeAdapters.BIG_DECIMAL.read(new JsonReader(new StringReader("\"abc\"")));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBigIntegerNumberFormatException() throws IOException {
    TypeAdapters.BIG_INTEGER.read(new JsonReader(new StringReader("\"abc\"")));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testNumberUnexpectedTokenException() throws IOException {
    TypeAdapters.NUMBER.read(new JsonReader(new StringReader("true")));
  }

  @Test
  public void testAtomicTypes() throws IOException {
    // AtomicInteger
    AtomicInteger ai = TypeAdapters.ATOMIC_INTEGER.read(new JsonReader(new StringReader("10")));
    assertEquals(10, ai.get());
    StringWriter swAi = new StringWriter();
    TypeAdapters.ATOMIC_INTEGER.write(new JsonWriter(swAi), ai);

    // AtomicBoolean
    AtomicBoolean ab = TypeAdapters.ATOMIC_BOOLEAN.read(new JsonReader(new StringReader("true")));
    assertTrue(ab.get());
    StringWriter swAb = new StringWriter();
    TypeAdapters.ATOMIC_BOOLEAN.write(new JsonWriter(swAb), ab);

    // AtomicIntegerArray
    AtomicIntegerArray aia = TypeAdapters.ATOMIC_INTEGER_ARRAY.read(new JsonReader(new StringReader("[1, 2, 3]")));
    assertEquals(3, aia.length());
    assertEquals(2, aia.get(1));
    StringWriter swAia = new StringWriter();
    TypeAdapters.ATOMIC_INTEGER_ARRAY.write(new JsonWriter(swAia), aia);
  }

  @Test(expected = JsonSyntaxException.class)
  public void testAtomicIntegerArrayNumberFormatException() throws IOException {
    TypeAdapters.ATOMIC_INTEGER_ARRAY.read(new JsonReader(new StringReader("[\"abc\"]")));
  }

  @Test
  public void testCharacterAdapter() throws IOException {
    assertNull(TypeAdapters.CHARACTER.read(new JsonReader(new StringReader("null"))));
    assertEquals(Character.valueOf('A'), TypeAdapters.CHARACTER.read(new JsonReader(new StringReader("\"A\""))));

    StringWriter sw = new StringWriter();
    TypeAdapters.CHARACTER.write(new JsonWriter(sw), null);
    assertEquals("null", sw.toString());
  }

  @Test(expected = JsonSyntaxException.class)
  public void testCharacterLengthError() throws IOException {
    TypeAdapters.CHARACTER.read(new JsonReader(new StringReader("\"AB\"")));
  }

  @Test
  public void testStringAndTextBuilders() throws IOException {
    // STRING
    assertNull(TypeAdapters.STRING.read(new JsonReader(new StringReader("null"))));
    assertEquals("true", TypeAdapters.STRING.read(new JsonReader(new StringReader("true")))); // Coerce boolean

    // STRING_BUILDER
    assertNull(TypeAdapters.STRING_BUILDER.read(new JsonReader(new StringReader("null"))));
    assertEquals("test", TypeAdapters.STRING_BUILDER.read(new JsonReader(new StringReader("\"test\""))).toString());
    StringWriter swSb = new StringWriter();
    TypeAdapters.STRING_BUILDER.write(new JsonWriter(swSb), null);

    // STRING_BUFFER
    assertNull(TypeAdapters.STRING_BUFFER.read(new JsonReader(new StringReader("null"))));
    assertEquals("test", TypeAdapters.STRING_BUFFER.read(new JsonReader(new StringReader("\"test\""))).toString());
    StringWriter swSf = new StringWriter();
    TypeAdapters.STRING_BUFFER.write(new JsonWriter(swSf), null);
  }

  @Test
  public void testURLAndURIAndUUID() throws IOException {
    // URL
    assertNull(TypeAdapters.URL.read(new JsonReader(new StringReader("null"))));
    assertNull(TypeAdapters.URL.read(new JsonReader(new StringReader("\"null\""))));
    assertNotNull(TypeAdapters.URL.read(new JsonReader(new StringReader("\"http://google.com\""))));
    StringWriter swUrl = new StringWriter();
    TypeAdapters.URL.write(new JsonWriter(swUrl), null);

    // URI
    assertNull(TypeAdapters.URI.read(new JsonReader(new StringReader("null"))));
    assertNull(TypeAdapters.URI.read(new JsonReader(new StringReader("\"null\""))));
    assertNotNull(TypeAdapters.URI.read(new JsonReader(new StringReader("\"http://google.com\""))));
    StringWriter swUri = new StringWriter();
    TypeAdapters.URI.write(new JsonWriter(swUri), null);

    // UUID
    assertNull(TypeAdapters.UUID.read(new JsonReader(new StringReader("null"))));
    UUID uuid = UUID.randomUUID();
    UUID readUuid = TypeAdapters.UUID.read(new JsonReader(new StringReader("\"" + uuid.toString() + "\"")));
    assertEquals(uuid, readUuid);
    StringWriter swUuid = new StringWriter();
    TypeAdapters.UUID.write(new JsonWriter(swUuid), null);
  }

  @Test(expected = JsonIOException.class)
  public void testURISyntaxExceptionHandling() throws IOException {
    TypeAdapters.URI.read(new JsonReader(new StringReader("\"^http://invalid\"")));
  }

  @Test
  public void testInetAddressAndCurrencyAndTimestamp() throws Exception {
    // InetAddress
    assertNull(TypeAdapters.INET_ADDRESS.read(new JsonReader(new StringReader("null"))));
    InetAddress addr = TypeAdapters.INET_ADDRESS.read(new JsonReader(new StringReader("\"127.0.0.1\"")));
    assertNotNull(addr);
    StringWriter swAddr = new StringWriter();
    TypeAdapters.INET_ADDRESS.write(new JsonWriter(swAddr), null);

    // Currency
    Currency currency = TypeAdapters.CURRENCY.read(new JsonReader(new StringReader("\"USD\"")));
    assertEquals(Currency.getInstance("USD"), currency);
    StringWriter swCurr = new StringWriter();
    TypeAdapters.CURRENCY.write(new JsonWriter(swCurr), currency);

    // Timestamp Factory
    Gson gson = new Gson();
    TypeAdapterFactory tsFactory = TypeAdapters.TIMESTAMP_FACTORY;
    TypeAdapter<Timestamp> tsAdapter = tsFactory.create(gson, TypeToken.get(Timestamp.class));
    assertNotNull(tsAdapter);
    assertNull(tsAdapter.read(new JsonReader(new StringReader("null"))));
    Timestamp ts = tsAdapter.read(new JsonReader(new StringReader("\"Jan 1, 1970 0:00:00 AM\"")));
    assertNotNull(ts);
    StringWriter swTs = new StringWriter();
    tsAdapter.write(new JsonWriter(swTs), ts);
  }

  @Test
  public void testCalendarAdapter() throws IOException {
    assertNull(TypeAdapters.CALENDAR.read(new JsonReader(new StringReader("null"))));

    String json = "{\"year\":2020,\"month\":5,\"dayOfMonth\":15,\"hourOfDay\":12,\"minute\":30,\"second\":45}";
    Calendar cal = TypeAdapters.CALENDAR.read(new JsonReader(new StringReader(json)));
    assertNotNull(cal);
    assertEquals(2020, cal.get(Calendar.YEAR));

    StringWriter sw = new StringWriter();
    TypeAdapters.CALENDAR.write(new JsonWriter(sw), null);
    TypeAdapters.CALENDAR.write(new JsonWriter(sw), cal);
  }

  @Test
  public void testLocaleAdapter() throws IOException {
    assertNull(TypeAdapters.LOCALE.read(new JsonReader(new StringReader("null"))));

    Locale l1 = TypeAdapters.LOCALE.read(new JsonReader(new StringReader("\"th\"")));
    assertEquals("th", l1.getLanguage());

    Locale l2 = TypeAdapters.LOCALE.read(new JsonReader(new StringReader("\"th_TH\"")));
    assertEquals("th", l2.getLanguage());
    assertEquals("TH", l2.getCountry());

    Locale l3 = TypeAdapters.LOCALE.read(new JsonReader(new StringReader("\"th_TH_VAR\"")));
    assertEquals("th", l3.getLanguage());
    assertEquals("TH", l3.getCountry());
    assertEquals("VAR", l3.getVariant());

    StringWriter sw = new StringWriter();
    TypeAdapters.LOCALE.write(new JsonWriter(sw), null);
    TypeAdapters.LOCALE.write(new JsonWriter(sw), l1);
  }

  @Test
  public void testJsonElementAdapter() throws IOException {
    // Read primitives & structures
    assertEquals(new JsonPrimitive("test"), TypeAdapters.JSON_ELEMENT.read(new JsonReader(new StringReader("\"test\""))));
    assertEquals(new JsonPrimitive(123), TypeAdapters.JSON_ELEMENT.read(new JsonReader(new StringReader("123"))));
    assertEquals(new JsonPrimitive(true), TypeAdapters.JSON_ELEMENT.read(new JsonReader(new StringReader("true"))));
    assertEquals(JsonNull.INSTANCE, TypeAdapters.JSON_ELEMENT.read(new JsonReader(new StringReader("null"))));

    JsonElement arrayElem = TypeAdapters.JSON_ELEMENT.read(new JsonReader(new StringReader("[1, \"two\"]")));
    assertTrue(arrayElem.isJsonArray());

    JsonElement objElem = TypeAdapters.JSON_ELEMENT.read(new JsonReader(new StringReader("{\"key\":\"val\"}")));
    assertTrue(objElem.isJsonObject());

    // Write elements
    StringWriter sw = new StringWriter();
    TypeAdapters.JSON_ELEMENT.write(new JsonWriter(sw), null);
    TypeAdapters.JSON_ELEMENT.write(new JsonWriter(sw), new JsonPrimitive(10));
    TypeAdapters.JSON_ELEMENT.write(new JsonWriter(sw), new JsonPrimitive(true));
    TypeAdapters.JSON_ELEMENT.write(new JsonWriter(sw), new JsonPrimitive("str"));
    TypeAdapters.JSON_ELEMENT.write(new JsonWriter(sw), arrayElem);
    TypeAdapters.JSON_ELEMENT.write(new JsonWriter(sw), objElem);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testJsonElementReadInvalidToken() throws IOException {
    TypeAdapters.JSON_ELEMENT.read(new JsonReader(new StringReader("}")));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testJsonElementWriteUnsupported() throws IOException {
    // Custom subclass of JsonElement that isn't primitive, array, object, or null
    JsonElement custom = new JsonElement() {
      @Override public JsonElement deepCopy() { return this; }
    };
    TypeAdapters.JSON_ELEMENT.write(new JsonWriter(new StringWriter()), custom);
  }

  @Test
  public void testEnumTypeAdapterAndFactories() {
    Gson gson = new Gson();
    
    // Enum test
    TypeAdapter<EnumTest> adapter = TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(EnumTest.class));
    assertNotNull(adapter);

    // Factories check
    assertNotNull(TypeAdapters.newFactory(String.class, TypeAdapters.STRING).create(gson, TypeToken.get(String.class)));
    assertNull(TypeAdapters.newFactory(String.class, TypeAdapters.STRING).create(gson, TypeToken.get(Integer.class)));

    assertNotNull(TypeAdapters.newFactory(int.class, Integer.class, TypeAdapters.INTEGER).create(gson, TypeToken.get(int.class)));
    assertNotNull(TypeAdapters.newFactory(int.class, Integer.class, TypeAdapters.INTEGER).create(gson, TypeToken.get(Integer.class)));

    assertNotNull(TypeAdapters.newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, TypeAdapters.CALENDAR).create(gson, TypeToken.get(GregorianCalendar.class)));

    // TypeHierarchyFactory
    TypeAdapterFactory thFactory = TypeAdapters.newTypeHierarchyFactory(InetAddress.class, TypeAdapters.INET_ADDRESS);
    assertNotNull(thFactory.create(gson, TypeToken.get(InetAddress.class)));
    assertNull(thFactory.create(gson, TypeToken.get(String.class)));
  }

  private enum EnumTest {
    @SerializedName(value = "A_VAL", alternate = {"A_ALT"})
    VAL1
  }
}