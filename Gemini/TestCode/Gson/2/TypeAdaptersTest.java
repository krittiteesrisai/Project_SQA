package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
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
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;

import static org.junit.Assert.*;

public class TypeAdaptersTest {

  private final Gson gson = new Gson();

  @Test(expected = UnsupportedOperationException.class)
  public void testClassSerializeThrowsException() throws IOException {
    StringWriter writer = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(writer);
    TypeAdapters.CLASS.write(jsonWriter, String.class);
  }

  @Test
  public void testClassSerializeNull() throws IOException {
    StringWriter writer = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(writer);
    TypeAdapters.CLASS.write(jsonWriter, null);
    assertEquals("null", writer.toString());
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testClassDeserializeThrowsException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"java.lang.String\""));
    TypeAdapters.CLASS.read(reader);
  }

  @Test
  public void testClassDeserializeNull() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("null"));
    assertNull(TypeAdapters.CLASS.read(reader));
  }

  @Test
  public void testBitSetAdapter() throws IOException {
    BitSet bitSet = new BitSet();
    bitSet.set(0);
    bitSet.set(2);

    StringWriter writer = new StringWriter();
    TypeAdapters.BIT_SET.write(new JsonWriter(writer), bitSet);

    BitSet deserialized = TypeAdapters.BIT_SET.read(new JsonReader(new StringReader("[1, 0, 1]")));
    assertTrue(deserialized.get(0));
    assertFalse(deserialized.get(1));
    assertTrue(deserialized.get(2));

    BitSet deserializedBool = TypeAdapters.BIT_SET.read(new JsonReader(new StringReader("[true, false]")));
    assertTrue(deserializedBool.get(0));
    assertFalse(deserializedBool.get(1));

    BitSet deserializedStr = TypeAdapters.BIT_SET.read(new JsonReader(new StringReader("[\"1\", \"0\"]")));
    assertTrue(deserializedStr.get(0));
    assertFalse(deserializedStr.get(1));

    assertNull(TypeAdapters.BIT_SET.read(new JsonReader(new StringReader("null"))));
    
    StringWriter nullWriter = new StringWriter();
    TypeAdapters.BIT_SET.write(new JsonWriter(nullWriter), null);
    assertEquals("null", nullWriter.toString());
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBitSetInvalidString() throws IOException {
    TypeAdapters.BIT_SET.read(new JsonReader(new StringReader("[\"invalid\"]")));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBitSetInvalidType() throws IOException {
    TypeAdapters.BIT_SET.read(new JsonReader(new StringReader("[{}]")));
  }

  @Test
  public void testBooleanAdapters() throws IOException {
    assertEquals(Boolean.TRUE, TypeAdapters.BOOLEAN.read(new JsonReader(new StringReader("true"))));
    assertEquals(Boolean.TRUE, TypeAdapters.BOOLEAN.read(new JsonReader(new StringReader("\"true\""))));
    assertNull(TypeAdapters.BOOLEAN.read(new JsonReader(new StringReader("null"))));

    StringWriter sw = new StringWriter();
    TypeAdapters.BOOLEAN.write(new JsonWriter(sw), null);
    assertEquals("null", sw.toString());

    assertEquals(Boolean.TRUE, TypeAdapters.BOOLEAN_AS_STRING.read(new JsonReader(new StringReader("\"true\""))));
    assertNull(TypeAdapters.BOOLEAN_AS_STRING.read(new JsonReader(new StringReader("null"))));

    StringWriter sw2 = new StringWriter();
    TypeAdapters.BOOLEAN_AS_STRING.write(new JsonWriter(sw2), null);
    assertEquals("null", sw2.toString());
  }

  @Test
  public void testNumericAdapters() throws IOException {
    assertEquals(Byte.valueOf((byte) 5), TypeAdapters.BYTE.read(new JsonReader(new StringReader("5"))));
    assertNull(TypeAdapters.BYTE.read(new JsonReader(new StringReader("null"))));

    assertEquals(Short.valueOf((short) 5), TypeAdapters.SHORT.read(new JsonReader(new StringReader("5"))));
    assertNull(TypeAdapters.SHORT.read(new JsonReader(new StringReader("null"))));

    assertEquals(Integer.valueOf(5), TypeAdapters.INTEGER.read(new JsonReader(new StringReader("5"))));
    assertNull(TypeAdapters.INTEGER.read(new JsonReader(new StringReader("null"))));

    assertEquals(Long.valueOf(5L), TypeAdapters.LONG.read(new JsonReader(new StringReader("5"))));
    assertNull(TypeAdapters.LONG.read(new JsonReader(new StringReader("null"))));

    assertEquals(Float.valueOf(5.5f), TypeAdapters.FLOAT.read(new JsonReader(new StringReader("5.5"))));
    assertNull(TypeAdapters.FLOAT.read(new JsonReader(new StringReader("null"))));

    assertEquals(Double.valueOf(5.5), TypeAdapters.DOUBLE.read(new JsonReader(new StringReader("5.5"))));
    assertNull(TypeAdapters.DOUBLE.read(new JsonReader(new StringReader("null"))));

    assertNull(TypeAdapters.NUMBER.read(new JsonReader(new StringReader("null"))));
    assertNotNull(TypeAdapters.NUMBER.read(new JsonReader(new StringReader("123"))));

    assertEquals(new BigDecimal("123.45"), TypeAdapters.BIG_DECIMAL.read(new JsonReader(new StringReader("123.45"))));
    assertNull(TypeAdapters.BIG_DECIMAL.read(new JsonReader(new StringReader("null"))));

    assertEquals(new BigInteger("123"), TypeAdapters.BIG_INTEGER.read(new JsonReader(new StringReader("123"))));
    assertNull(TypeAdapters.BIG_INTEGER.read(new JsonReader(new StringReader("null"))));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testNumberSyntaxException() throws IOException {
    TypeAdapters.INTEGER.read(new JsonReader(new StringReader("\"abc\"")));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testNumberGeneralException() throws IOException {
    TypeAdapters.NUMBER.read(new JsonReader(new StringReader("{}")));
  }

  @Test
  public void testCharacterAdapter() throws IOException {
    assertEquals(Character.valueOf('a'), TypeAdapters.CHARACTER.read(new JsonReader(new StringReader("\"a\""))));
    assertNull(TypeAdapters.CHARACTER.read(new JsonReader(new StringReader("null"))));

    StringWriter sw = new StringWriter();
    TypeAdapters.CHARACTER.write(new JsonWriter(sw), null);
    assertEquals("null", sw.toString());
  }

  @Test(expected = JsonSyntaxException.class)
  public void testCharacterInvalidLength() throws IOException {
    TypeAdapters.CHARACTER.read(new JsonReader(new StringReader("\"ab\"")));
  }

  @Test
  public void testStringAdapter() throws IOException {
    assertEquals("test", TypeAdapters.STRING.read(new JsonReader(new StringReader("\"test\""))));
    assertEquals("true", TypeAdapters.STRING.read(new JsonReader(new StringReader("true"))));
    assertNull(TypeAdapters.STRING.read(new JsonReader(new StringReader("null"))));
  }

  @Test
  public void testTextContainers() throws IOException {
    assertNotNull(TypeAdapters.STRING_BUILDER.read(new JsonReader(new StringReader("\"sb\""))));
    assertNull(TypeAdapters.STRING_BUILDER.read(new JsonReader(new StringReader("null"))));
    
    StringWriter sw1 = new StringWriter();
    TypeAdapters.STRING_BUILDER.write(new JsonWriter(sw1), null);
    assertEquals("null", sw1.toString());

    assertNotNull(TypeAdapters.STRING_BUFFER.read(new JsonReader(new StringReader("\"sbuf\""))));
    assertNull(TypeAdapters.STRING_BUFFER.read(new JsonReader(new StringReader("null"))));
    
    StringWriter sw2 = new StringWriter();
    TypeAdapters.STRING_BUFFER.write(new JsonWriter(sw2), null);
    assertEquals("null", sw2.toString());
  }

  @Test
  public void testNetTypes() throws IOException {
    URL url = TypeAdapters.URL.read(new JsonReader(new StringReader("\"http://google.com\"")));
    assertNotNull(url);
    assertNull(TypeAdapters.URL.read(new JsonReader(new StringReader("\"null\""))));
    assertNull(TypeAdapters.URL.read(new JsonReader(new StringReader("null"))));

    StringWriter swUrl = new StringWriter();
    TypeAdapters.URL.write(new JsonWriter(swUrl), null);
    assertEquals("null", swUrl.toString());

    URI uri = TypeAdapters.URI.read(new JsonReader(new StringReader("\"http://google.com\"")));
    assertNotNull(uri);
    assertNull(TypeAdapters.URI.read(new JsonReader(new StringReader("\"null\""))));
    assertNull(TypeAdapters.URI.read(new JsonReader(new StringReader("null"))));

    StringWriter swUri = new StringWriter();
    TypeAdapters.URI.write(new JsonWriter(swUri), null);
    assertEquals("null", swUri.toString());

    InetAddress inet = TypeAdapters.INET_ADDRESS.read(new JsonReader(new StringReader("\"127.0.0.1\"")));
    assertNotNull(inet);
    assertNull(TypeAdapters.INET_ADDRESS.read(new JsonReader(new StringReader("null"))));

    StringWriter swInet = new StringWriter();
    TypeAdapters.INET_ADDRESS.write(new JsonWriter(swInet), null);
    assertEquals("null", swInet.toString());

    UUID uuid = TypeAdapters.UUID.read(new JsonReader(new StringReader("\"c56a4180-65aa-42ec-a945-5fd21dec0538\"")));
    assertNotNull(uuid);
    assertNull(TypeAdapters.UUID.read(new JsonReader(new StringReader("null"))));

    StringWriter swUuid = new StringWriter();
    TypeAdapters.UUID.write(new JsonWriter(swUuid), null);
    assertEquals("null", swUuid.toString());
  }

  @Test(expected = JsonIOException.class)
  public void testInvalidUri() throws IOException {
    TypeAdapters.URI.read(new JsonReader(new StringReader("\"^invalid-uri^\"")));
  }

  @Test
  public void testCalendarAdapter() throws IOException {
    Calendar cal = new GregorianCalendar(2020, 0, 1, 12, 30, 0);
    StringWriter sw = new StringWriter();
    TypeAdapters.CALENDAR.write(new JsonWriter(sw), cal);

    Calendar readCal = TypeAdapters.CALENDAR.read(new JsonReader(new StringReader(sw.toString())));
    assertNotNull(readCal);
    assertEquals(2020, readCal.get(Calendar.YEAR));

    assertNull(TypeAdapters.CALENDAR.read(new JsonReader(new StringReader("null"))));
    
    StringWriter nullSw = new StringWriter();
    TypeAdapters.CALENDAR.write(new JsonWriter(nullSw), null);
    assertEquals("null", nullSw.toString());
  }

  @Test
  public void testLocaleAdapter() throws IOException {
    Locale locale = TypeAdapters.LOCALE.read(new JsonReader(new StringReader("\"th_TH_TH\"")));
    assertNotNull(locale);

    Locale locale2 = TypeAdapters.LOCALE.read(new JsonReader(new StringReader("\"th_TH\"")));
    assertNotNull(locale2);

    Locale locale3 = TypeAdapters.LOCALE.read(new JsonReader(new StringReader("\"th\"")));
    assertNotNull(locale3);

    assertNull(TypeAdapters.LOCALE.read(new JsonReader(new StringReader("null"))));

    StringWriter sw = new StringWriter();
    TypeAdapters.LOCALE.write(new JsonWriter(sw), null);
    assertEquals("null", sw.toString());
  }

  @Test
  public void testTimestampFactory() {
    TypeAdapter<Timestamp> adapter = TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Timestamp.class));
    assertNotNull(adapter);
    assertNull(TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(String.class)));
  }

  @Test
  public void testJsonElementAdapter() throws IOException {
    JsonElement elStr = TypeAdapters.JSON_ELEMENT.read(new JsonReader(new StringReader("\"hello\"")));
    assertTrue(elStr.isJsonPrimitive());

    JsonElement elNum = TypeAdapters.JSON_ELEMENT.read(new JsonReader(new StringReader("123")) );
    assertTrue(elNum.isJsonPrimitive());

    JsonElement elBool = TypeAdapters.JSON_ELEMENT.read(new JsonReader(new StringReader("true")));
    assertTrue(elBool.isJsonPrimitive());

    JsonElement elNull = TypeAdapters.JSON_ELEMENT.read(new JsonReader(new StringReader("null")));
    assertTrue(elNull.isJsonNull());

    JsonElement elArr = TypeAdapters.JSON_ELEMENT.read(new JsonReader(new StringReader("[1, 2]")));
    assertTrue(elArr.isJsonArray());

    JsonElement elObj = TypeAdapters.JSON_ELEMENT.read(new JsonReader(new StringReader("{\"a\":1}")));
    assertTrue(elObj.isJsonObject());

    StringWriter sw = new StringWriter();
    TypeAdapters.JSON_ELEMENT.write(new JsonWriter(sw), JsonNull.INSTANCE);
    TypeAdapters.JSON_ELEMENT.write(new JsonWriter(new StringWriter()), new JsonPrimitive(1));
    TypeAdapters.JSON_ELEMENT.write(new JsonWriter(new StringWriter()), new JsonPrimitive(true));
    TypeAdapters.JSON_ELEMENT.write(new JsonWriter(new StringWriter()), new JsonPrimitive("str"));
    TypeAdapters.JSON_ELEMENT.write(new JsonWriter(new StringWriter()), elArr);
    TypeAdapters.JSON_ELEMENT.write(new JsonWriter(new StringWriter()), elObj);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testJsonElementReadIllegalArgument() throws IOException {
    TypeAdapters.JSON_ELEMENT.read(new JsonReader(new StringReader("")));
  }

  private enum SampleEnum {
    @SerializedName(value = "ONE", alternate = {"FIRST"})
    A, B
  }

  @Test
  public void testEnumFactory() throws IOException {
    TypeAdapter<SampleEnum> adapter = TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(SampleEnum.class));
    assertNotNull(adapter);
    assertNull(TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(String.class)));
    assertNull(TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(Enum.class)));

    assertEquals(SampleEnum.A, adapter.read(new JsonReader(new StringReader("\"ONE\""))));
    assertNull(adapter.read(new JsonReader(new StringReader("null"))));

    StringWriter sw = new StringWriter();
    adapter.write(new JsonWriter(sw), SampleEnum.A);
    assertEquals("\"ONE\"", sw.toString());
  }

  @Test
  public void testFactoriesCreation() {
    assertNotNull(TypeAdapters.newFactory(String.class, TypeAdapters.STRING).create(gson, TypeToken.get(String.class)));
    assertNull(TypeAdapters.newFactory(String.class, TypeAdapters.STRING).create(gson, TypeToken.get(Integer.class)));

    assertNotNull(TypeAdapters.newFactory(int.class, Integer.class, TypeAdapters.INTEGER).create(gson, TypeToken.get(int.class)));
    assertNotNull(TypeAdapters.newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, TypeAdapters.CALENDAR).create(gson, TypeToken.get(GregorianCalendar.class)));
    assertNotNull(TypeAdapters.newTypeHierarchyFactory(InetAddress.class, TypeAdapters.INET_ADDRESS).create(gson, TypeToken.get(InetAddress.class)));
  }
}