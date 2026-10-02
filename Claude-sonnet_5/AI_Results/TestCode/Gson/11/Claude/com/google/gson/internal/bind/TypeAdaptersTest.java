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
import java.util.BitSet;
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

public class TypeAdaptersTest {

  //---------------------------------------------------------------
  // Helpers
  //---------------------------------------------------------------
  private static JsonReader reader(String json) {
    return new JsonReader(new StringReader(json));
  }

  private static String write(TypeAdapter adapter, Object value) throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter jw = new JsonWriter(sw);
    //noinspection unchecked
    adapter.write(jw, value);
    jw.close();
    return sw.toString();
  }

  //---------------------------------------------------------------
  // Private constructor
  //---------------------------------------------------------------
  @Test
  public void privateConstructor_throwsUnsupportedOperationException() throws Exception {
    Constructor<TypeAdapters> c = TypeAdapters.class.getDeclaredConstructor();
    c.setAccessible(true);
    try {
      c.newInstance();
      fail("Expected UnsupportedOperationException");
    } catch (InvocationTargetException e) {
      assertTrue(e.getCause() instanceof UnsupportedOperationException);
    }
  }

  //---------------------------------------------------------------
  // CLASS
  //---------------------------------------------------------------
  @Test
  public void classAdapter_writeNull() throws IOException {
    assertEquals("null", write(TypeAdapters.CLASS, null));
  }

  @Test
  public void classAdapter_writeNonNull_throws() throws IOException {
    try {
      write(TypeAdapters.CLASS, String.class);
      fail();
    } catch (UnsupportedOperationException expected) {
      // matches expected message pattern from source
    }
  }

  @Test
  public void classAdapter_readNull() throws IOException {
    assertNull(TypeAdapters.CLASS.read(reader("null")));
  }

  @Test
  public void classAdapter_readNonNull_throws() throws IOException {
    try {
      TypeAdapters.CLASS.read(reader("\"java.lang.String\""));
      fail();
    } catch (UnsupportedOperationException expected) {
    }
  }

  //---------------------------------------------------------------
  // BIT_SET
  //---------------------------------------------------------------
  @Test
  public void bitSet_readNull() throws IOException {
    assertNull(TypeAdapters.BIT_SET.read(reader("null")));
  }

  @Test
  public void bitSet_readNumberAndBooleanAndString() throws IOException {
    BitSet bs = TypeAdapters.BIT_SET.read(reader("[1,0,true,false,\"1\",\"0\"]"));
    assertTrue(bs.get(0));
    assertFalse(bs.get(1));
    assertTrue(bs.get(2));
    assertFalse(bs.get(3));
    assertTrue(bs.get(4));
    assertFalse(bs.get(5));
  }

  @Test
  public void bitSet_readStringInvalidNumber_throwsJsonSyntax() throws IOException {
    try {
      TypeAdapters.BIT_SET.read(reader("[\"abc\"]"));
      fail();
    } catch (JsonSyntaxException expected) {
    }
  }

  @Test
  public void bitSet_readInvalidTokenType_defaultBranch_throws() throws IOException {
    // NULL token inside array is not NUMBER/BOOLEAN/STRING -> default branch
    try {
      TypeAdapters.BIT_SET.read(reader("[null]"));
      fail();
    } catch (JsonSyntaxException expected) {
    }
  }

  @Test
  public void bitSet_writeNull() throws IOException {
    assertEquals("null", write(TypeAdapters.BIT_SET, null));
  }

  @Test
  public void bitSet_writeEmpty() throws IOException {
    assertEquals("[]", write(TypeAdapters.BIT_SET, new BitSet()));
  }

  @Test
  public void bitSet_writeWithBitsSet() throws IOException {
    BitSet bs = new BitSet();
    bs.set(0);
    bs.set(2);
    assertEquals("[1,0,1]", write(TypeAdapters.BIT_SET, bs));
  }

  //---------------------------------------------------------------
  // BOOLEAN
  //---------------------------------------------------------------
  @Test
  public void boolean_readNull() throws IOException {
    assertNull(TypeAdapters.BOOLEAN.read(reader("null")));
  }

  @Test
  public void boolean_readStringCompat() throws IOException {
    assertTrue(TypeAdapters.BOOLEAN.read(reader("\"true\"")));
    // Not an actual boolean literal - Boolean.parseBoolean returns false silently.
    assertFalse(TypeAdapters.BOOLEAN.read(reader("\"notabool\"")));
  }

  @Test
  public void boolean_readLiteral() throws IOException {
    assertTrue(TypeAdapters.BOOLEAN.read(reader("true")));
  }

  @Test
  public void boolean_writeNullAndValue() throws IOException {
    assertEquals("null", write(TypeAdapters.BOOLEAN, null));
    assertEquals("true", write(TypeAdapters.BOOLEAN, Boolean.TRUE));
  }

  //---------------------------------------------------------------
  // BOOLEAN_AS_STRING
  //---------------------------------------------------------------
  @Test
  public void booleanAsString_readNull() throws IOException {
    assertNull(TypeAdapters.BOOLEAN_AS_STRING.read(reader("null")));
  }

  @Test
  public void booleanAsString_readValue_caseInsensitive() throws IOException {
    assertTrue(TypeAdapters.BOOLEAN_AS_STRING.read(reader("\"TRUE\"")));
    assertFalse(TypeAdapters.BOOLEAN_AS_STRING.read(reader("\"nope\"")));
  }

  @Test
  public void booleanAsString_writeNullAndValue() throws IOException {
    assertEquals("\"null\"", write(TypeAdapters.BOOLEAN_AS_STRING, null));
    assertEquals("\"true\"", write(TypeAdapters.BOOLEAN_AS_STRING, Boolean.TRUE));
  }

  //---------------------------------------------------------------
  // BYTE
  //---------------------------------------------------------------
  @Test
  public void byteAdapter_readNull() throws IOException {
    assertNull(TypeAdapters.BYTE.read(reader("null")));
  }

  @Test
  public void byteAdapter_readValid() throws IOException {
    assertEquals((byte) 5, TypeAdapters.BYTE.read(reader("5")));
  }

  @Test
  public void byteAdapter_readInvalid_throwsJsonSyntax() throws IOException {
    try {
      TypeAdapters.BYTE.read(reader("\"abc\""));
      fail();
    } catch (JsonSyntaxException expected) {
    }
  }

  @Test
  public void byteAdapter_write() throws IOException {
    assertEquals("5", write(TypeAdapters.BYTE, (byte) 5));
  }

  //---------------------------------------------------------------
  // SHORT
  //---------------------------------------------------------------
  @Test
  public void shortAdapter_readNull() throws IOException {
    assertNull(TypeAdapters.SHORT.read(reader("null")));
  }

  @Test
  public void shortAdapter_readValid() throws IOException {
    assertEquals((short) 7, TypeAdapters.SHORT.read(reader("7")));
  }

  @Test
  public void shortAdapter_readInvalid_throwsJsonSyntax() throws IOException {
    try {
      TypeAdapters.SHORT.read(reader("\"xyz\""));
      fail();
    } catch (JsonSyntaxException expected) {
    }
  }

  //---------------------------------------------------------------
  // INTEGER
  //---------------------------------------------------------------
  @Test
  public void integer_readNull() throws IOException {
    assertNull(TypeAdapters.INTEGER.read(reader("null")));
  }

  @Test
  public void integer_readValid() throws IOException {
    assertEquals(42, TypeAdapters.INTEGER.read(reader("42")));
  }

  @Test
  public void integer_readInvalid_throwsJsonSyntax() throws IOException {
    try {
      TypeAdapters.INTEGER.read(reader("\"notint\""));
      fail();
    } catch (JsonSyntaxException expected) {
    }
  }

  //---------------------------------------------------------------
  // ATOMIC_INTEGER (nullSafe)
  //---------------------------------------------------------------
  @Test
  public void atomicInteger_readNull() throws IOException {
    assertNull(TypeAdapters.ATOMIC_INTEGER.read(reader("null")));
  }

  @Test
  public void atomicInteger_readValid() throws IOException {
    AtomicInteger ai = TypeAdapters.ATOMIC_INTEGER.read(reader("9"));
    assertEquals(9, ai.get());
  }

  @Test
  public void atomicInteger_readInvalid_throwsJsonSyntax() throws IOException {
    try {
      TypeAdapters.ATOMIC_INTEGER.read(reader("\"bad\""));
      fail();
    } catch (JsonSyntaxException expected) {
    }
  }

  @Test
  public void atomicInteger_writeNullAndValue() throws IOException {
    assertEquals("null", write(TypeAdapters.ATOMIC_INTEGER, null));
    assertEquals("3", write(TypeAdapters.ATOMIC_INTEGER, new AtomicInteger(3)));
  }

  //---------------------------------------------------------------
  // ATOMIC_BOOLEAN (nullSafe)
  //---------------------------------------------------------------
  @Test
  public void atomicBoolean_readNull() throws IOException {
    assertNull(TypeAdapters.ATOMIC_BOOLEAN.read(reader("null")));
  }

  @Test
  public void atomicBoolean_readValid() throws IOException {
    AtomicBoolean ab = TypeAdapters.ATOMIC_BOOLEAN.read(reader("true"));
    assertTrue(ab.get());
  }

  @Test
  public void atomicBoolean_writeNullAndValue() throws IOException {
    assertEquals("null", write(TypeAdapters.ATOMIC_BOOLEAN, null));
    assertEquals("true", write(TypeAdapters.ATOMIC_BOOLEAN, new AtomicBoolean(true)));
  }

  //---------------------------------------------------------------
  // ATOMIC_INTEGER_ARRAY (nullSafe)
  //---------------------------------------------------------------
  @Test
  public void atomicIntegerArray_readNull() throws IOException {
    assertNull(TypeAdapters.ATOMIC_INTEGER_ARRAY.read(reader("null")));
  }

  @Test
  public void atomicIntegerArray_readEmpty() throws IOException {
    AtomicIntegerArray a = TypeAdapters.ATOMIC_INTEGER_ARRAY.read(reader("[]"));
    assertEquals(0, a.length());
  }

  @Test
  public void atomicIntegerArray_readValues() throws IOException {
    AtomicIntegerArray a = TypeAdapters.ATOMIC_INTEGER_ARRAY.read(reader("[1,2,3]"));
    assertEquals(3, a.length());
    assertEquals(1, a.get(0));
    assertEquals(3, a.get(2));
  }

  @Test
  public void atomicIntegerArray_readInvalid_throwsJsonSyntax() throws IOException {
    try {
      TypeAdapters.ATOMIC_INTEGER_ARRAY.read(reader("[\"x\"]"));
      fail();
    } catch (JsonSyntaxException expected) {
    }
  }

  @Test
  public void atomicIntegerArray_writeNullAndValue() throws IOException {
    assertEquals("null", write(TypeAdapters.ATOMIC_INTEGER_ARRAY, null));
    AtomicIntegerArray a = new AtomicIntegerArray(2);
    a.set(0, 5);
    a.set(1, 6);
    assertEquals("[5,6]", write(TypeAdapters.ATOMIC_INTEGER_ARRAY, a));
  }

  //---------------------------------------------------------------
  // LONG
  //---------------------------------------------------------------
  @Test
  public void longAdapter_readNull() throws IOException {
    assertNull(TypeAdapters.LONG.read(reader("null")));
  }

  @Test
  public void longAdapter_readValid() throws IOException {
    assertEquals(123456789012L, TypeAdapters.LONG.read(reader("123456789012")));
  }

  @Test
  public void longAdapter_readInvalid_throwsJsonSyntax() throws IOException {
    try {
      TypeAdapters.LONG.read(reader("\"notlong\""));
      fail();
    } catch (JsonSyntaxException expected) {
    }
  }

  //---------------------------------------------------------------
  // FLOAT  (NOTE: source has NO try/catch around nextDouble -> raw
  // NumberFormatException may propagate. This is intentionally verified.)
  //---------------------------------------------------------------
  @Test
  public void floatAdapter_readNull() throws IOException {
    assertNull(TypeAdapters.FLOAT.read(reader("null")));
  }

  @Test
  public void floatAdapter_readValid() throws IOException {
    assertEquals(1.5f, TypeAdapters.FLOAT.read(reader("1.5")).floatValue(), 0.0001f);
  }

  @Test
  public void floatAdapter_readInvalid_throwsRawNumberFormatException() throws IOException {
    // FLOAT.read does not wrap NumberFormatException as JsonSyntaxException (potential fault).
    try {
      TypeAdapters.FLOAT.read(reader("\"notfloat\""));
      fail();
    } catch (NumberFormatException expected) {
      // documented current (possibly buggy) behavior
    }
  }

  //---------------------------------------------------------------
  // DOUBLE (same characteristic as FLOAT)
  //---------------------------------------------------------------
  @Test
  public void doubleAdapter_readNull() throws IOException {
    assertNull(TypeAdapters.DOUBLE.read(reader("null")));
  }

  @Test
  public void doubleAdapter_readValid() throws IOException {
    assertEquals(2.25d, TypeAdapters.DOUBLE.read(reader("2.25")).doubleValue(), 0.0001d);
  }

  @Test
  public void doubleAdapter_readInvalid_throwsRawNumberFormatException() throws IOException {
    try {
      TypeAdapters.DOUBLE.read(reader("\"notdouble\""));
      fail();
    } catch (NumberFormatException expected) {
    }
  }

  //---------------------------------------------------------------
  // NUMBER
  //---------------------------------------------------------------
  @Test
  public void number_readNull() throws IOException {
    assertNull(TypeAdapters.NUMBER.read(reader("null")));
  }

  @Test
  public void number_readNumber() throws IOException {
    assertEquals("3.14", TypeAdapters.NUMBER.read(reader("3.14")).toString());
  }

  @Test
  public void number_readOtherToken_throwsJsonSyntax() throws IOException {
    try {
      TypeAdapters.NUMBER.read(reader("\"abc\""));
      fail();
    } catch (JsonSyntaxException expected) {
    }
  }

  //---------------------------------------------------------------
  // CHARACTER
  //---------------------------------------------------------------
  @Test
  public void character_readNull() throws IOException {
    assertNull(TypeAdapters.CHARACTER.read(reader("null")));
  }

  @Test
  public void character_readSingleChar() throws IOException {
    assertEquals(Character.valueOf('a'), TypeAdapters.CHARACTER.read(reader("\"a\"")));
  }

  @Test
  public void character_readWrongLength_throwsJsonSyntax() throws IOException {
    try {
      TypeAdapters.CHARACTER.read(reader("\"ab\""));
      fail();
    } catch (JsonSyntaxException expected) {
    }
  }

  @Test
  public void character_writeNullAndValue() throws IOException {
    assertEquals("null", write(TypeAdapters.CHARACTER, null));
    assertEquals("\"a\"", write(TypeAdapters.CHARACTER, 'a'));
  }

  //---------------------------------------------------------------
  // STRING
  //---------------------------------------------------------------
  @Test
  public void string_readNull() throws IOException {
    assertNull(TypeAdapters.STRING.read(reader("null")));
  }

  @Test
  public void string_readBooleanCoercion() throws IOException {
    assertEquals("true", TypeAdapters.STRING.read(reader("true")));
  }

  @Test
  public void string_readNormalString() throws IOException {
    assertEquals("hello", TypeAdapters.STRING.read(reader("\"hello\"")));
  }

  //---------------------------------------------------------------
  // BIG_DECIMAL
  //---------------------------------------------------------------
  @Test
  public void bigDecimal_readNull() throws IOException {
    assertNull(TypeAdapters.BIG_DECIMAL.read(reader("null")));
  }

  @Test
  public void bigDecimal_readValid() throws IOException {
    assertEquals(new BigDecimal("1.1"), TypeAdapters.BIG_DECIMAL.read(reader("\"1.1\"")));
  }

  @Test
  public void bigDecimal_readInvalid_throwsJsonSyntax() throws IOException {
    try {
      TypeAdapters.BIG_DECIMAL.read(reader("\"notdecimal\""));
      fail();
    } catch (JsonSyntaxException expected) {
    }
  }

  //---------------------------------------------------------------
  // BIG_INTEGER
  //---------------------------------------------------------------
  @Test
  public void bigInteger_readNull() throws IOException {
    assertNull(TypeAdapters.BIG_INTEGER.read(reader("null")));
  }

  @Test
  public void bigInteger_readValid() throws IOException {
    assertEquals(new BigInteger("123"), TypeAdapters.BIG_INTEGER.read(reader("\"123\"")));
  }

  @Test
  public void bigInteger_readInvalid_throwsJsonSyntax() throws IOException {
    try {
      TypeAdapters.BIG_INTEGER.read(reader("\"notbiginteger\""));
      fail();
    } catch (JsonSyntaxException expected) {
    }
  }

  //---------------------------------------------------------------
  // STRING_BUILDER / STRING_BUFFER
  //---------------------------------------------------------------
  @Test
  public void stringBuilder_readNullAndValue() throws IOException {
    assertNull(TypeAdapters.STRING_BUILDER.read(reader("null")));
    assertEquals("abc", TypeAdapters.STRING_BUILDER.read(reader("\"abc\"")).toString());
  }

  @Test
  public void stringBuilder_writeNullAndValue() throws IOException {
    assertEquals("null", write(TypeAdapters.STRING_BUILDER, null));
    assertEquals("\"abc\"", write(TypeAdapters.STRING_BUILDER, new StringBuilder("abc")));
  }

  @Test
  public void stringBuffer_readNullAndValue() throws IOException {
    assertNull(TypeAdapters.STRING_BUFFER.read(reader("null")));
    assertEquals("xyz", TypeAdapters.STRING_BUFFER.read(reader("\"xyz\"")).toString());
  }

  @Test
  public void stringBuffer_writeNullAndValue() throws IOException {
    assertEquals("null", write(TypeAdapters.STRING_BUFFER, null));
    assertEquals("\"xyz\"", write(TypeAdapters.STRING_BUFFER, new StringBuffer("xyz")));
  }

  //---------------------------------------------------------------
  // URL
  //---------------------------------------------------------------
  @Test
  public void url_readNull() throws IOException {
    assertNull(TypeAdapters.URL.read(reader("null")));
  }

  @Test
  public void url_readLiteralNullString() throws IOException {
    assertNull(TypeAdapters.URL.read(reader("\"null\"")));
  }

  @Test
  public void url_readValid() throws IOException {
    URL u = TypeAdapters.URL.read(reader("\"http://example.com\""));
    assertEquals("http://example.com", u.toExternalForm());
  }

  @Test
  public void url_readMalformed_throwsRawException() throws IOException {
    // MalformedURLException is not caught by the adapter - propagates raw.
    try {
      TypeAdapters.URL.read(reader("\"not a url\""));
      fail();
    } catch (MalformedURLException expected) {
    }
  }

  @Test
  public void url_writeNullAndValue() throws IOException, MalformedURLException {
    assertEquals("null", write(TypeAdapters.URL, null));
    assertEquals("\"http://example.com\"",
        write(TypeAdapters.URL, new URL("http://example.com")));
  }

  //---------------------------------------------------------------
  // URI
  //---------------------------------------------------------------
  @Test
  public void uri_readNull() throws IOException {
    assertNull(TypeAdapters.URI.read(reader("null")));
  }

  @Test
  public void uri_readLiteralNullString() throws IOException {
    assertNull(TypeAdapters.URI.read(reader("\"null\"")));
  }

  @Test
  public void uri_readValid() throws IOException {
    URI u = TypeAdapters.URI.read(reader("\"http://example.com\""));
    assertEquals("http://example.com", u.toASCIIString());
  }

  @Test
  public void uri_readInvalidSyntax_throwsJsonIOException() throws IOException {
    try {
      TypeAdapters.URI.read(reader("\"http://exa mple.com\""));
      fail();
    } catch (JsonIOException expected) {
    }
  }

  //---------------------------------------------------------------
  // INET_ADDRESS
  //---------------------------------------------------------------
  @Test
  public void inetAddress_readNull() throws IOException {
    assertNull(TypeAdapters.INET_ADDRESS.read(reader("null")));
  }

  @Test
  public void inetAddress_readNumericIp() throws IOException {
    InetAddress addr = TypeAdapters.INET_ADDRESS.read(reader("\"127.0.0.1\""));
    assertEquals("127.0.0.1", addr.getHostAddress());
  }

  @Test
  public void inetAddress_writeNullAndValue() throws IOException {
    assertEquals("null", write(TypeAdapters.INET_ADDRESS, null));
    assertEquals("\"127.0.0.1\"",
        write(TypeAdapters.INET_ADDRESS, TypeAdapters.INET_ADDRESS.read(reader("\"127.0.0.1\""))));
  }

  //---------------------------------------------------------------
  // UUID
  //---------------------------------------------------------------
  @Test
  public void uuid_readNull() throws IOException {
    assertNull(TypeAdapters.UUID.read(reader("null")));
  }

  @Test
  public void uuid_readValid() throws IOException {
    UUID id = UUID.randomUUID();
    assertEquals(id, TypeAdapters.UUID.read(reader("\"" + id + "\"")));
  }

  @Test
  public void uuid_readInvalid_throwsRawIllegalArgumentException() throws IOException {
    try {
      TypeAdapters.UUID.read(reader("\"not-a-uuid\""));
      fail();
    } catch (IllegalArgumentException expected) {
    }
  }

  @Test
  public void uuid_writeNullAndValue() throws IOException {
    assertEquals("null", write(TypeAdapters.UUID, null));
    UUID id = UUID.randomUUID();
    assertEquals("\"" + id + "\"", write(TypeAdapters.UUID, id));
  }

  //---------------------------------------------------------------
  // CURRENCY (nullSafe)
  //---------------------------------------------------------------
  @Test
  public void currency_readNull() throws IOException {
    assertNull(TypeAdapters.CURRENCY.read(reader("null")));
  }

  @Test
  public void currency_readValid() throws IOException {
    Currency c = TypeAdapters.CURRENCY.read(reader("\"USD\""));
    assertEquals("USD", c.getCurrencyCode());
  }

  @Test
  public void currency_readInvalid_throwsRawIllegalArgumentException() throws IOException {
    try {
      TypeAdapters.CURRENCY.read(reader("\"NOTREAL\""));
      fail();
    } catch (IllegalArgumentException expected) {
    }
  }

  @Test
  public void currency_writeNullAndValue() throws IOException {
    assertEquals("null", write(TypeAdapters.CURRENCY, null));
    assertEquals("\"USD\"", write(TypeAdapters.CURRENCY, Currency.getInstance("USD")));
  }

  //---------------------------------------------------------------
  // CALENDAR
  //---------------------------------------------------------------
  @Test
  public void calendar_readNull() throws IOException {
    assertNull(TypeAdapters.CALENDAR.read(reader("null")));
  }

  @Test
  public void calendar_readAllFields() throws IOException {
    String json = "{\"year\":2020,\"month\":5,\"dayOfMonth\":10,"
        + "\"hourOfDay\":8,\"minute\":30,\"second\":15}";
    GregorianCalendar cal = (GregorianCalendar) TypeAdapters.CALENDAR.read(reader(json));
    assertEquals(2020, cal.get(GregorianCalendar.YEAR));
    assertEquals(5, cal.get(GregorianCalendar.MONTH));
    assertEquals(10, cal.get(GregorianCalendar.DAY_OF_MONTH));
    assertEquals(8, cal.get(GregorianCalendar.HOUR_OF_DAY));
    assertEquals(30, cal.get(GregorianCalendar.MINUTE));
    assertEquals(15, cal.get(GregorianCalendar.SECOND));
  }

  @Test
  public void calendar_readMissingFields_defaultsToZero() throws IOException {
    // Only 'year' provided -> all others fall through to default 0 (loop with no matching if)
    GregorianCalendar cal = (GregorianCalendar) TypeAdapters.CALENDAR.read(reader("{\"year\":1999}"));
    assertEquals(1999, cal.get(GregorianCalendar.YEAR));
    assertEquals(0, cal.get(GregorianCalendar.MONTH));
  }

  @Test
  public void calendar_readUnknownKey_skippedWithoutAssignment() throws IOException {
    // "foo" doesn't match any branch -> falls through loop without effect
    GregorianCalendar cal = (GregorianCalendar) TypeAdapters.CALENDAR.read(
        reader("{\"foo\":123,\"year\":2001}"));
    assertEquals(2001, cal.get(GregorianCalendar.YEAR));
  }

  @Test
  public void calendar_writeNull() throws IOException {
    assertEquals("null", write(TypeAdapters.CALENDAR, null));
  }

  @Test
  public void calendar_writeValue() throws IOException {
    GregorianCalendar cal = new GregorianCalendar(2020, 5, 10, 8, 30, 15);
    String json = write(TypeAdapters.CALENDAR, cal);
    assertTrue(json.contains("\"year\":2020"));
    assertTrue(json.contains("\"month\":5"));
  }

  //---------------------------------------------------------------
  // LOCALE
  //---------------------------------------------------------------
  @Test
  public void locale_readNull() throws IOException {
    assertNull(TypeAdapters.LOCALE.read(reader("null")));
  }

  @Test
  public void locale_readLanguageOnly() throws IOException {
    Locale l = TypeAdapters.LOCALE.read(reader("\"en\""));
    assertEquals(new Locale("en"), l);
  }

  @Test
  public void locale_readLanguageAndCountry() throws IOException {
    Locale l = TypeAdapters.LOCALE.read(reader("\"en_US\""));
    assertEquals(new Locale("en", "US"), l);
  }

  @Test
  public void locale_readLanguageCountryVariant() throws IOException {
    Locale l = TypeAdapters.LOCALE.read(reader("\"en_US_WIN\""));
    assertEquals(new Locale("en", "US", "WIN"), l);
  }

  @Test
  public void locale_writeNullAndValue() throws IOException {
    assertEquals("null", write(TypeAdapters.LOCALE, null));
    assertEquals("\"en_US\"", write(TypeAdapters.LOCALE, new Locale("en", "US")));
  }

  //---------------------------------------------------------------
  // JSON_ELEMENT
  //---------------------------------------------------------------
  @Test
  public void jsonElement_readString() throws IOException {
    assertEquals(new JsonPrimitive("s"), TypeAdapters.JSON_ELEMENT.read(reader("\"s\"")));
  }

  @Test
  public void jsonElement_readNumber() throws IOException {
    assertEquals("5", TypeAdapters.JSON_ELEMENT.read(reader("5")).getAsString());
  }

  @Test
  public void jsonElement_readBoolean() throws IOException {
    assertEquals(new JsonPrimitive(true), TypeAdapters.JSON_ELEMENT.read(reader("true")));
  }

  @Test
  public void jsonElement_readNull() throws IOException {
    assertEquals(JsonNull.INSTANCE, TypeAdapters.JSON_ELEMENT.read(reader("null")));
  }

  @Test
  public void jsonElement_readArray() throws IOException {
    JsonArray arr = (JsonArray) TypeAdapters.JSON_ELEMENT.read(reader("[1,2,3]"));
    assertEquals(3, arr.size());
  }

  @Test
  public void jsonElement_readObject() throws IOException {
    JsonObject obj = (JsonObject) TypeAdapters.JSON_ELEMENT.read(reader("{\"a\":1}"));
    assertEquals(1, obj.get("a").getAsInt());
  }

  @Test
  public void jsonElement_readEndDocument_throwsIllegalArgument() throws IOException {
    JsonReader in = reader("5");
    TypeAdapters.JSON_ELEMENT.read(in); // consume the single top level value
    try {
      TypeAdapters.JSON_ELEMENT.read(in); // peek() now returns END_DOCUMENT -> default branch
      fail();
    } catch (IllegalArgumentException expected) {
    }
  }

  @Test
  public void jsonElement_writeNullVariants() throws IOException {
    assertEquals("null", write(TypeAdapters.JSON_ELEMENT, null));
    assertEquals("null", write(TypeAdapters.JSON_ELEMENT, JsonNull.INSTANCE));
  }

  @Test
  public void jsonElement_writePrimitives() throws IOException {
    assertEquals("5", write(TypeAdapters.JSON_ELEMENT, new JsonPrimitive(5)));
    assertEquals("true", write(TypeAdapters.JSON_ELEMENT, new JsonPrimitive(true)));
    assertEquals("\"s\"", write(TypeAdapters.JSON_ELEMENT, new JsonPrimitive("s")));
  }

  @Test
  public void jsonElement_writeArrayAndObject() throws IOException {
    JsonArray arr = new JsonArray();
    arr.add(new JsonPrimitive(1));
    arr.add(new JsonPrimitive(2));
    assertEquals("[1,2]", write(TypeAdapters.JSON_ELEMENT, arr));

    JsonObject obj = new JsonObject();
    obj.add("k", new JsonPrimitive(1));
    assertEquals("{\"k\":1}", write(TypeAdapters.JSON_ELEMENT, obj));
  }

  //---------------------------------------------------------------
  // ENUM_FACTORY / EnumTypeAdapter
  //---------------------------------------------------------------
  private enum Roshambo {
    ROCK,
    @SerializedName(value = "PAPR", alternate = {"paper_alt", "P"})
    PAPER,
    SCISSORS
  }

  private enum Op {
    PLUS {
      @Override int apply(int a, int b) { return a + b; }
    },
    MINUS {
      @Override int apply(int a, int b) { return a - b; }
    };
    abstract int apply(int a, int b);
  }

  @Test
  public void enumFactory_nonEnumType_returnsNull() {
    Gson gson = new Gson();
    assertNull(TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(String.class)));
  }

  @Test
  public void enumFactory_enumClassItself_returnsNull() {
    Gson gson = new Gson();
    assertNull(TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(Enum.class)));
  }

  @Test
  public void enumFactory_anonymousSubclass_usesSuperclass() {
    Gson gson = new Gson();
    @SuppressWarnings("unchecked")
    TypeToken<Op> tt = (TypeToken<Op>) TypeToken.get(Op.PLUS.getClass());
    TypeAdapter<Op> adapter = TypeAdapters.ENUM_FACTORY.create(gson, tt);
    assertNotNull(adapter);
  }

  @Test
  public void enumTypeAdapter_readWithSerializedNameAndAlternate() throws IOException {
    Gson gson = new Gson();
    TypeAdapter<Roshambo> adapter =
        TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(Roshambo.class));
    assertEquals(Roshambo.PAPER, adapter.read(reader("\"PAPR\"")));
    assertEquals(Roshambo.PAPER, adapter.read(reader("\"paper_alt\"")));
    assertEquals(Roshambo.PAPER, adapter.read(reader("\"P\"")));
    assertEquals(Roshambo.ROCK, adapter.read(reader("\"ROCK\"")));
  }

  @Test
  public void enumTypeAdapter_readNull() throws IOException {
    Gson gson = new Gson();
    TypeAdapter<Roshambo> adapter =
        TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(Roshambo.class));
    assertNull(adapter.read(reader("null")));
  }

  @Test
  public void enumTypeAdapter_readUnknownName_returnsNullSilently() throws IOException {
    Gson gson = new Gson();
    TypeAdapter<Roshambo> adapter =
        TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(Roshambo.class));
    // Map.get returns null for unmatched key - no exception thrown (documented behavior)
    assertNull(adapter.read(reader("\"UNKNOWN\"")));
  }

  @Test
  public void enumTypeAdapter_writeNullAndValue() throws IOException {
    Gson gson = new Gson();
    TypeAdapter<Roshambo> adapter =
        TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(Roshambo.class));
    assertEquals("null", write(adapter, null));
    assertEquals("\"PAPR\"", write(adapter, Roshambo.PAPER));
    assertEquals("\"ROCK\"", write(adapter, Roshambo.ROCK));
  }

  //---------------------------------------------------------------
  // newFactory(TypeToken, TypeAdapter)
  //---------------------------------------------------------------
  @Test
  public void newFactory_typeToken_matchAndMismatch() {
    Gson gson = new Gson();
    TypeAdapterFactory factory = TypeAdapters.newFactory(TypeToken.get(String.class), TypeAdapters.STRING);
    assertSame(TypeAdapters.STRING, factory.create(gson, TypeToken.get(String.class)));
    assertNull(factory.create(gson, TypeToken.get(Integer.class)));
  }

  //---------------------------------------------------------------
  // newFactory(Class, TypeAdapter)
  //---------------------------------------------------------------
  @Test
  public void newFactory_class_matchAndMismatch() {
    Gson gson = new Gson();
    TypeAdapterFactory factory = TypeAdapters.newFactory(String.class, TypeAdapters.STRING);
    assertSame(TypeAdapters.STRING, factory.create(gson, TypeToken.get(String.class)));
    assertNull(factory.create(gson, TypeToken.get(Integer.class)));
    assertTrue(factory.toString().contains("java.lang.String"));
  }

  //---------------------------------------------------------------
  // newFactory(Class unboxed, Class boxed, TypeAdapter)
  //---------------------------------------------------------------
  @Test
  public void newFactory_unboxedBoxed_matchBoth() {
    Gson gson = new Gson();
    TypeAdapterFactory factory = TypeAdapters.INTEGER_FACTORY;
    assertNotNull(factory.create(gson, TypeToken.get(int.class)));
    assertNotNull(factory.create(gson, TypeToken.get(Integer.class)));
    assertNull(factory.create(gson, TypeToken.get(Long.class)));
    assertTrue(factory.toString().contains("Integer"));
  }

  //---------------------------------------------------------------
  // newFactoryForMultipleTypes
  //---------------------------------------------------------------
  @Test
  public void newFactoryForMultipleTypes_matchBaseAndSub() {
    Gson gson = new Gson();
    TypeAdapterFactory factory = TypeAdapters.CALENDAR_FACTORY;
    assertNotNull(factory.create(gson, TypeToken.get(java.util.Calendar.class)));
    assertNotNull(factory.create(gson, TypeToken.get(GregorianCalendar.class)));
    assertNull(factory.create(gson, TypeToken.get(String.class)));
    assertTrue(factory.toString().contains("Calendar"));
  }

  //---------------------------------------------------------------
  // newTypeHierarchyFactory
  //---------------------------------------------------------------
  @Test
  public void typeHierarchyFactory_notAssignable_returnsNull() {
    Gson gson = new Gson();
    assertNull(TypeAdapters.INET_ADDRESS_FACTORY.create(gson, TypeToken.get(String.class)));
  }

  @Test
  public void typeHierarchyFactory_assignable_readWriteDelegates() throws IOException {
    Gson gson = new Gson();
    TypeAdapter<InetAddress> adapter =
        TypeAdapters.INET_ADDRESS_FACTORY.create(gson, TypeToken.get(InetAddress.class));
    assertNotNull(adapter);
    InetAddress addr = adapter.read(reader("\"127.0.0.1\""));
    assertEquals("127.0.0.1", addr.getHostAddress());
  }

  @Test
  public void typeHierarchyFactory_resultNotInstanceOfRequestedType_throwsJsonSyntax()
      throws IOException {
    // Craft a delegate adapter returning a type mismatching the requested type
    TypeAdapter<Number> mismatchAdapter = new TypeAdapter<Number>() {
      @Override public Number read(JsonReader in) throws IOException {
        in.nextInt();
        return Integer.valueOf(5); // returns Integer even though Long is requested below
      }
      @Override public void write(JsonWriter out, Number value) throws IOException {
        out.value(value);
      }
    };
    TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(Number.class, mismatchAdapter);
    Gson gson = new Gson();
    TypeAdapter<Long> adapter = factory.create(gson, TypeToken.get(Long.class));
    assertNotNull(adapter);
    try {
      adapter.read(reader("5"));
      fail();
    } catch (JsonSyntaxException expected) {
    }
  }

  @Test
  public void typeHierarchyFactory_toStringContainsClassName() {
    assertTrue(TypeAdapters.INET_ADDRESS_FACTORY.toString().contains("InetAddress"));
  }
}
