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

    private final Gson gson = new Gson();

    @Test
    public void testClassAdapter() throws IOException {
        TypeAdapter<Class> adapter = TypeAdapters.CLASS;
        
        // Write null
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        adapter.write(jw, null);
        assertEquals("null", sw.toString());

        // Write non-null (expects UnsupportedOperationException)
        try {
            StringWriter sw2 = new StringWriter();
            adapter.write(new JsonWriter(sw2), String.class);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertTrue(expected.getMessage().contains("Attempted to serialize java.lang.Class"));
        }

        // Read null
        JsonReader jrNull = new JsonReader(new StringReader("null"));
        assertNull(adapter.read(jrNull));

        // Read non-null (expects UnsupportedOperationException)
        try {
            JsonReader jrObj = new JsonReader(new StringReader("\"someString\""));
            adapter.read(jrObj);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertTrue(expected.getMessage().contains("Attempted to deserialize a java.lang.Class"));
        }
    }

    @Test
    public void testBitSetAdapter() throws IOException {
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;

        // Read null
        JsonReader jrNull = new JsonReader(new StringReader("null"));
        assertNull(adapter.read(jrNull));

        // Read various token types in array: NUMBER, BOOLEAN, STRING (valid & invalid), default exception
        String json = "[1, false, \"1\", \"0\"]";
        BitSet bs = adapter.read(new JsonReader(new StringReader(json)));
        assertTrue(bs.get(0));
        assertFalse(bs.get(1));
        assertTrue(bs.get(2));
        assertFalse(bs.get(3));

        // Invalid number format in string
        try {
            adapter.read(new JsonReader(new StringReader("[\"notAnInt\"]")));
            fail("Expected JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            assertTrue(expected.getMessage().contains("Expecting: bitset number value"));
        }

        // Invalid token type (e.g., Object inside BitSet array)
        try {
            adapter.read(new JsonReader(new StringReader("[{}]")));
            fail("Expected JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            assertTrue(expected.getMessage().contains("Invalid bitset value type"));
        }

        // Write BitSet
        BitSet src = new BitSet();
        src.set(0);
        src.set(2);
        StringWriter sw = new StringWriter();
        adapter.write(new JsonWriter(sw), src);
        assertEquals("[1,0,1]", sw.toString());

        // Write null BitSet
        StringWriter swNull = new StringWriter();
        adapter.write(new JsonWriter(swNull), null);
        assertEquals("null", swNull.toString());
    }

    @Test
    public void testBooleanAdapters() throws IOException {
        // BOOLEAN
        assertEquals(Boolean.TRUE, TypeAdapters.BOOLEAN.read(new JsonReader(new StringReader("true"))));
        assertEquals(Boolean.FALSE, TypeAdapters.BOOLEAN.read(new JsonReader(new StringReader("\"false\""))));
        assertNull(TypeAdapters.BOOLEAN.read(new JsonReader(new StringReader("null"))));
        
        StringWriter sw = new StringWriter();
        TypeAdapters.BOOLEAN.write(new JsonWriter(sw), true);
        assertEquals("true", sw.toString());

        // BOOLEAN_AS_STRING
        assertEquals(Boolean.TRUE, TypeAdapters.BOOLEAN_AS_STRING.read(new JsonReader(new StringReader("\"true\""))));
        assertNull(TypeAdapters.BOOLEAN_AS_STRING.read(new JsonReader(new StringReader("null"))));
        
        StringWriter swStr = new StringWriter();
        TypeAdapters.BOOLEAN_AS_STRING.write(new JsonWriter(swStr), null);
        assertEquals("\"null\"", swStr.toString());
    }

    @Test
    public void testNumericAdaptersAndExceptions() throws IOException {
        // BYTE
        assertNull(TypeAdapters.BYTE.read(new JsonReader(new StringReader("null"))));
        assertEquals((byte) 5, TypeAdapters.BYTE.read(new JsonReader(new StringReader("5"))));
        try {
            TypeAdapters.BYTE.read(new JsonReader(new StringReader("\"abc\"")));
            fail();
        } catch (JsonSyntaxException ignored) {}

        // SHORT
        assertNull(TypeAdapters.SHORT.read(new JsonReader(new StringReader("null"))));
        assertEquals((short) 10, TypeAdapters.SHORT.read(new JsonReader(new StringReader("10"))));
        try {
            TypeAdapters.SHORT.read(new JsonReader(new StringReader("\"abc\"")));
            fail();
        } catch (JsonSyntaxException ignored) {}

        // INTEGER
        assertNull(TypeAdapters.INTEGER.read(new JsonReader(new StringReader("null"))));
        assertEquals(100, TypeAdapters.INTEGER.read(new JsonReader(new StringReader("100"))));
        try {
            TypeAdapters.INTEGER.read(new JsonReader(new StringReader("\"abc\"")));
            fail();
        } catch (JsonSyntaxException ignored) {}

        // LONG
        assertNull(TypeAdapters.LONG.read(new JsonReader(new StringReader("null"))));
        assertEquals(100L, TypeAdapters.LONG.read(new JsonReader(new StringReader("100"))));
        try {
            TypeAdapters.LONG.read(new JsonReader(new StringReader("\"abc\"")));
            fail();
        } catch (JsonSyntaxException ignored) {}

        // FLOAT & DOUBLE
        assertNull(TypeAdapters.FLOAT.read(new JsonReader(new StringReader("null"))));
        assertEquals(1.5f, TypeAdapters.FLOAT.read(new JsonReader(new StringReader("1.5"))), 0.001f);
        assertNull(TypeAdapters.DOUBLE.read(new JsonReader(new StringReader("null"))));
        assertEquals(2.5, TypeAdapters.DOUBLE.read(new JsonReader(new StringReader("2.5"))), 0.001);

        // NUMBER Adapter branches
        assertNull(TypeAdapters.NUMBER.read(new JsonReader(new StringReader("null"))));
        assertNotNull(TypeAdapters.NUMBER.read(new JsonReader(new StringReader("12345"))));
        try {
            TypeAdapters.NUMBER.read(new JsonReader(new StringReader("true")));
            fail();
        } catch (JsonSyntaxException ignored) {}

        // BIG_DECIMAL & BIG_INTEGER
        assertNull(TypeAdapters.BIG_DECIMAL.read(new JsonReader(new StringReader("null"))));
        assertEquals(new BigDecimal("123.456"), TypeAdapters.BIG_DECIMAL.read(new JsonReader(new StringReader("123.456"))));
        try {
            TypeAdapters.BIG_DECIMAL.read(new JsonReader(new StringReader("\"invalid\"")));
            fail();
        } catch (JsonSyntaxException ignored) {}

        assertNull(TypeAdapters.BIG_INTEGER.read(new JsonReader(new StringReader("null"))));
        assertEquals(new BigInteger("123456"), TypeAdapters.BIG_INTEGER.read(new JsonReader(new StringReader("123456"))));
        try {
            TypeAdapters.BIG_INTEGER.read(new JsonReader(new StringReader("\"invalid\"")));
            fail();
        } catch (JsonSyntaxException ignored) {}
    }

    @Test
    public void testAtomicAdapters() throws IOException {
        // AtomicInteger
        AtomicInteger ai = TypeAdapters.ATOMIC_INTEGER.read(new JsonReader(new StringReader("42")));
        assertEquals(42, ai.get());
        
        // AtomicBoolean
        AtomicBoolean ab = TypeAdapters.ATOMIC_BOOLEAN.read(new JsonReader(new StringReader("true")));
        assertTrue(ab.get());

        // AtomicIntegerArray
        AtomicIntegerArray aia = TypeAdapters.ATOMIC_INTEGER_ARRAY.read(new JsonReader(new StringReader("[1, 2, 3]")));
        assertEquals(3, aia.length());
        assertEquals(2, aia.get(1));

        try {
            TypeAdapters.ATOMIC_INTEGER_ARRAY.read(new JsonReader(new StringReader("[\"bad\"]")));
            fail();
        } catch (JsonSyntaxException ignored) {}
    }

    @Test
    public void testCharacterAndStringAdapters() throws IOException {
        // CHARACTER
        assertNull(TypeAdapters.CHARACTER.read(new JsonReader(new StringReader("null"))));
        assertEquals(Character.valueOf('a'), TypeAdapters.CHARACTER.read(new JsonReader(new StringReader("\"a\""))));
        try {
            TypeAdapters.CHARACTER.read(new JsonReader(new StringReader("\"ab\"")));
            fail();
        } catch (JsonSyntaxException expected) {
            assertTrue(expected.getMessage().contains("Expecting character, got"));
        }

        StringWriter swChar = new StringWriter();
        TypeAdapters.CHARACTER.write(new JsonWriter(swChar), null);
        assertEquals("null", swChar.toString());

        // STRING
        assertNull(TypeAdapters.STRING.read(new JsonReader(new StringReader("null"))));
        assertEquals("true", TypeAdapters.STRING.read(new JsonReader(new StringReader("true")))); // coerce boolean
        assertEquals("hello", TypeAdapters.STRING.read(new JsonReader(new StringReader("\"hello\""))));
    }

    @Test
    public void testAdditionalTypes() throws IOException, java.net.URISyntaxException {
        // StringBuilder & StringBuffer
        assertNull(TypeAdapters.STRING_BUILDER.read(new JsonReader(new StringReader("null"))));
        assertEquals("test", TypeAdapters.STRING_BUILDER.read(new JsonReader(new StringReader("\"test\""))).toString());
        
        assertNull(TypeAdapters.STRING_BUFFER.read(new JsonReader(new StringReader("null"))));
        assertEquals("test", TypeAdapters.STRING_BUFFER.read(new JsonReader(new StringReader("\"test\""))).toString());

        // URL
        assertNull(TypeAdapters.URL.read(new JsonReader(new StringReader("null"))));
        assertNull(TypeAdapters.URL.read(new JsonReader(new StringReader("\"null\""))));
        assertNotNull(TypeAdapters.URL.read(new JsonReader(new StringReader("\"http://google.com\""))));

        // URI
        assertNull(TypeAdapters.URI.read(new JsonReader(new StringReader("null"))));
        assertNull(TypeAdapters.URI.read(new JsonReader(new StringReader("\"null\""))));
        assertNotNull(TypeAdapters.URI.read(new JsonReader(new StringReader("\"http://google.com\""))));
        
        try {
            TypeAdapters.URI.read(new JsonReader(new StringReader("\"%xx\"")));
            fail();
        } catch (JsonIOException ignored) {}

        // INET_ADDRESS
        assertNull(TypeAdapters.INET_ADDRESS.read(new JsonReader(new StringReader("null"))));
        assertNotNull(TypeAdapters.INET_ADDRESS.read(new JsonReader(new StringReader("\"127.0.0.1\""))));

        // UUID
        assertNull(TypeAdapters.UUID.read(new JsonReader(new StringReader("null"))));
        UUID uuid = UUID.randomUUID();
        assertEquals(uuid, TypeAdapters.UUID.read(new JsonReader(new StringReader("\"" + uuid + "\""))));

        // CURRENCY
        assertEquals(Currency.getInstance("USD"), TypeAdapters.CURRENCY.read(new JsonReader(new StringReader("\"USD\""))));

        // TIMESTAMP (via factory)
        TypeAdapter<Timestamp> timestampAdapter = TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Timestamp.class));
        assertNotNull(timestampAdapter);
        assertNull(TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(String.class))); // non-match branch
    }

    @Test
    public void testCalendarAdapter() throws IOException {
        TypeAdapter<Calendar> adapter = TypeAdapters.CALENDAR;
        
        assertNull(adapter.read(new JsonReader(new StringReader("null"))));

        String json = "{\"year\":2020,\"month\":5,\"dayOfMonth\":15,\"hourOfDay\":10,\"minute\":30,\"second\":45}";
        Calendar cal = adapter.read(new JsonReader(new StringReader(json)));
        assertNotNull(cal);
        assertEquals(2020, cal.get(Calendar.YEAR));

        StringWriter sw = new StringWriter();
        adapter.write(new JsonWriter(sw), null);
        assertEquals("null", sw.toString());

        StringWriter swVal = new StringWriter();
        adapter.write(new JsonWriter(swVal), cal);
        assertTrue(swVal.toString().contains("year"));
    }

    @Test
    public void testLocaleAdapter() throws IOException {
        TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;
        
        assertNull(adapter.read(new JsonReader(new StringReader("null"))));
        
        // Language only
        assertEquals(new Locale("th"), adapter.read(new JsonReader(new StringReader("\"th\""))));
        // Language + Country
        assertEquals(new Locale("th", "TH"), adapter.read(new JsonReader(new StringReader("\"th_TH\""))));
        // Language + Country + Variant
        assertEquals(new Locale("th", "TH", "EXT"), adapter.read(new JsonReader(new StringReader("\"th_TH_EXT\""))));

        StringWriter sw = new StringWriter();
        adapter.write(new JsonWriter(sw), null);
        assertEquals("null", sw.toString());
    }

    @Test
    public void testJsonElementAdapter() throws IOException {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;

        // Read various json elements
        assertEquals(new JsonPrimitive("str"), adapter.read(new JsonReader(new StringReader("\"str\""))));
        assertEquals(new JsonPrimitive(123), adapter.read(new JsonReader(new StringReader("123"))));
        assertEquals(new JsonPrimitive(true), adapter.read(new JsonReader(new StringReader("true"))));
        assertEquals(JsonNull.INSTANCE, adapter.read(new JsonReader(new StringReader("null"))));
        
        JsonElement arr = adapter.read(new JsonReader(new StringReader("[1, \"two\"]")));
        assertTrue(arr.isJsonArray());

        JsonElement obj = adapter.read(new JsonReader(new StringReader("{\"k\":\"v\"}")));
        assertTrue(obj.isJsonObject());

        // Write branches
        StringWriter sw = new StringWriter();
        adapter.write(new JsonWriter(sw), null);
        assertEquals("null", sw.toString());

        StringWriter swPrim = new StringWriter();
        adapter.write(new JsonWriter(swPrim), new JsonPrimitive(10));
        assertEquals("10", swPrim.toString());

        StringWriter swBool = new StringWriter();
        adapter.write(new JsonWriter(swBool), new JsonPrimitive(false));
        assertEquals("false", swBool.toString());

        StringWriter swArr = new StringWriter();
        JsonArray jArr = new JsonArray();
        jArr.add(new JsonPrimitive("a"));
        adapter.write(new JsonWriter(swArr), jArr);
        assertEquals("[\"a\"]", swArr.toString());

        StringWriter swObj = new StringWriter();
        JsonObject jObj = new JsonObject();
        jObj.add("key", new JsonPrimitive("val"));
        adapter.write(new JsonWriter(swObj), jObj);
        assertEquals("{\"key\":\"val\"}", swObj.toString());
    }

    @Test
    public void testEnumTypeAdapterAndFactories() {
        assertNotNull(TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(Thread.State.class)));
        assertNull(TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(String.class))); // non-enum branch
        assertNull(TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(Enum.class))); // raw Enum class branch

        // Test factory toString and utilities
        assertNotNull(TypeAdapters.newFactory(String.class, TypeAdapters.STRING).toString());
        assertNotNull(TypeAdapters.newFactory(int.class, Integer.class, TypeAdapters.INTEGER).toString());
        assertNotNull(TypeAdapters.newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, TypeAdapters.CALENDAR).toString());
        
        TypeAdapterFactory hierarchyFactory = TypeAdapters.newTypeHierarchyFactory(InetAddress.class, TypeAdapters.INET_ADDRESS);
        assertNotNull(hierarchyFactory.toString());
        assertNotNull(hierarchyFactory.create(gson, TypeToken.get(InetAddress.class)));
        assertNull(hierarchyFactory.create(gson, TypeToken.get(String.class)));
    }
}