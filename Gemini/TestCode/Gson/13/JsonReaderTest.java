package com.google.gson.stream;

import org.junit.Test;
import java.io.IOException;
import java.io.StringReader;

import static org.junit.Assert.*;

public class JsonReaderTest {

    @Test(expected = NullPointerException.class)
    public void testConstructorNullReader() {
        new JsonReader(null);
    }

    @Test
    public void testLenientSetting() {
        JsonReader reader = new JsonReader(new StringReader("{}"));
        assertFalse(reader.isLenient());
        reader.setLenient(true);
        assertTrue(reader.isLenient());
    }

    @Test
    public void testBasicObjectAndPrimitives() throws IOException {
        String json = "{\"str\":\"hello\",\"num\":123,\"longNum\":9223372036854775807,\"dbl\":123.45,\"bool\":true,\"nul\":null}";
        JsonReader reader = new JsonReader(new StringReader(json));

        reader.beginObject();
        assertEquals("str", reader.nextName());
        assertEquals("hello", reader.nextString());

        assertEquals("num", reader.nextName());
        assertEquals(123, reader.nextInt());

        assertEquals("longNum", reader.nextName());
        assertEquals(9223372036854775807L, reader.nextLong());

        assertEquals("dbl", reader.nextName());
        assertEquals(123.45, reader.nextDouble(), 0.001);

        assertEquals("bool", reader.nextName());
        assertTrue(reader.nextBoolean());

        assertEquals("nul", reader.nextName());
        reader.nextNull();

        reader.endObject();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
        reader.close();
    }

    @Test
    public void testBasicArray() throws IOException {
        String json = "[1, 2, 3]";
        JsonReader reader = new JsonReader(new StringReader(json));

        reader.beginArray();
        assertTrue(reader.hasNext());
        assertEquals(1, reader.nextInt());
        assertTrue(reader.hasNext());
        assertEquals(2, reader.nextInt());
        assertTrue(reader.hasNext());
        assertEquals(3, reader.nextInt());
        assertFalse(reader.hasNext());
        reader.endArray();
        reader.close();
    }

    @Test(expected = IllegalStateException.class)
    public void testTypeMismatchException() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("{\"key\":\"not-a-boolean\"}"));
        reader.beginObject();
        reader.nextName();
        reader.nextBoolean(); // คาดหวัง Boolean แต่เจอ String ต้องโยน Exception
    }

    @Test
    public void testNumberEdgeCasesAndExponent() throws IOException {
        String json = "{\"exp\":1.23e-4, \"neg\":-456, \"zero\":0}";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.beginObject();

        assertEquals("exp", reader.nextName());
        assertEquals(0.000123, reader.nextDouble(), 0.000001);

        assertEquals("neg", reader.nextName());
        assertEquals(-456, reader.nextInt());

        assertEquals("zero", reader.nextName());
        assertEquals(0L, reader.nextLong());

        reader.endObject();
    }

    @Test(expected = NumberFormatException.class)
    public void testIntOverflowThrowsException() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("{\"big\":9999999999999}"));
        reader.beginObject();
        reader.nextName();
        reader.nextInt(); // ค่าเกินช่วง Int ต้องพ่น NumberFormatException
    }

    @Test
    public void testEscapeCharacters() throws IOException {
        String json = "{\"escaped\":\"\\t\\b\\n\\r\\f\\\\\\/\\\"\\u0041\"}";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.beginObject();
        assertEquals("escaped", reader.nextName());
        assertEquals("\t\b\n\r\f\\/\"A", reader.nextString());
        reader.endObject();
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidUnicodeEscape() throws IOException {
        String json = "{\"bad\":\"\\u004G\"}";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.beginObject();
        reader.nextName();
        reader.nextString();
    }

    @Test
    public void testLenientCommentsAndPrefix() throws IOException {
        String json = ")]}'\n" +
                "// Line comment\n" +
                "/* Block comment */\n" +
                "# Hash comment\n" +
                "{\"a\" : 1}";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.setLenient(true);
        
        reader.beginObject();
        assertEquals("a", reader.nextName());
        assertEquals(1, reader.nextInt());
        reader.endObject();
    }

    @Test(expected = IOException.class)
    public void testStrictCommentsFail() throws IOException {
        String json = "// Comment\n{\"a\": 1}";
        JsonReader reader = new JsonReader(new StringReader(json));
        // Strict mode (default) จะต้องอ่านคอมเมนต์แล้วติด Syntax Error
        reader.beginObject();
    }

    @Test
    public void testSkipValue() throws IOException {
        String json = "{\"skipMe\": {\"nested\": [1, 2, 3]}, \"keepMe\": 42}";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.beginObject();
        
        assertEquals("skipMe", reader.nextName());
        reader.skipValue(); // ข้าม Object ทั้งก้อน

        assertEquals("keepMe", reader.nextName());
        assertEquals(42, reader.nextInt());
        
        reader.endObject();
    }

    @Test(expected = IllegalStateException.class)
    public void testClosedReaderThrowsException() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("{}"));
        reader.close();
        reader.hasNext();
    }
}