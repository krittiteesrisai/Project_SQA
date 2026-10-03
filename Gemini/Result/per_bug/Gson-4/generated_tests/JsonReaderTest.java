package com.google.gson.stream;

import org.junit.Test;
import java.io.IOException;
import java.io.StringReader;

import static org.junit.Assert.*;

public class JsonReaderTest {

    @Test(expected = NullPointerException.class)
    public void testNullReaderConstructor() {
        new JsonReader(null);
    }

    @Test
    public void testLenientAndNonExecutePrefix() throws IOException {
        String json = ")]}'\n[\"A\", \"B\"]";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.setLenient(true);
        assertTrue(reader.isLenient());

        reader.beginArray();
        assertEquals("A", reader.nextString());
        assertEquals("B", reader.nextString());
        reader.endArray();
        reader.close();
    }

    @Test(expected = IOException.class)
    public void testStrictNonExecutePrefixThrows() throws IOException {
        String json = ")]}'\n[\"A\"]";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.setLenient(false);
        reader.beginArray();
    }

    @Test
    public void testBasicDocumentParsing() throws IOException {
        String json = "{\"hello\": \"world\", \"val\": 123, \"flag\": true, \"empty\": null}";
        JsonReader reader = new JsonReader(new StringReader(json));

        reader.beginObject();
        assertEquals("hello", reader.nextName());
        assertEquals("world", reader.nextString());
        assertEquals("val", reader.nextName());
        assertEquals(123, reader.nextInt());
        assertEquals("flag", reader.nextName());
        assertTrue(reader.nextBoolean());
        assertEquals("empty", reader.nextName());
        reader.nextNull();
        reader.endObject();
        assertFalse(reader.hasNext());
        reader.close();
    }

    @Test
    public void testArrayParsingAndNextLongAndDouble() throws IOException {
        String json = "[1234567890123, 45.67]";
        JsonReader reader = new JsonReader(new StringReader(json));

        reader.beginArray();
        assertEquals(1234567890123L, reader.nextLong());
        assertEquals(45.67, reader.nextDouble(), 0.0001);
        reader.endArray();
        reader.close();
    }

    @Test(expected = IllegalStateException.class)
    public void testIllegalStateOnWrongType() throws IOException {
        String json = "{\"key\": \"notAnInt\"}";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.beginObject();
        assertEquals("key", reader.nextName());
        reader.nextInt(); // Should throw IllegalStateException because peek is STRING, not NUMBER/LONG
    }

    @Test(expected = NumberFormatException.class)
    public void testNumberFormatOnInvalidIntString() throws IOException {
        String json = "{\"key\": \"abc\"}";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.beginObject();
        assertEquals("key", reader.nextName());
        reader.nextInt();
    }

    @Test
    public void testSkipValue() throws IOException {
        String json = "{\"a\": [1, 2, 3], \"b\": {\"nested\": 1}, \"c\": \"value\"}";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.beginObject();
        assertEquals("a", reader.nextName());
        reader.skipValue();
        assertEquals("b", reader.nextName());
        reader.skipValue();
        assertEquals("c", reader.nextName());
        assertEquals("value", reader.nextString());
        reader.endObject();
        reader.close();
    }

    @Test
    public void testEscapeCharactersInString() throws IOException {
        String json = "[\"Line1\\nLine2\\tTabbed\\u0041\"]";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.beginArray();
        assertEquals("Line1\nLine2\tTabbedA", reader.nextString());
        reader.endArray();
        reader.close();
    }

    @Test(expected = IOException.class)
    public void testUnterminatedString() throws IOException {
        String json = "[\"unterminated]";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.beginArray();
        reader.nextString();
    }

    @Test(expected = IllegalStateException.class)
    public void testReaderClosedState() throws IOException {
        String json = "[1]";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.close();
        reader.beginArray();
    }

    @Test
    public void testLenientNaNAndInfinity() throws IOException {
        String json = "[NaN, Infinity, -Infinity]";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.setLenient(true);
        reader.beginArray();
        assertTrue(Double.isNaN(reader.nextDouble()));
        assertTrue(Double.isInfinite(reader.nextDouble()));
        assertTrue(Double.isInfinite(reader.nextDouble()));
        reader.endArray();
        reader.close();
    }

    @Test(expected = MalformedJsonException.class)
    public void testStrictNaNThrows() throws IOException {
        String json = "[NaN]";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.setLenient(false);
        reader.beginArray();
        reader.nextDouble();
    }

    @Test
    public void testUnquotedAndSingleQuotedNamesAndStrings() throws IOException {
        String json = "{unquoted: 'single'}";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("unquoted", reader.nextName());
        assertEquals("single", reader.nextString());
        reader.endObject();
        reader.close();
    }
}