package com.google.gson.stream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;

import static org.junit.Assert.*;

public class JsonWriterTest {

    private StringWriter stringWriter;
    private JsonWriter jsonWriter;

    @Before
    public void setUp() {
        stringWriter = new StringWriter();
        jsonWriter = new JsonWriter(stringWriter);
    }

    @After
    public void tearDown() {
        // Ensure no unclosed streams causing issues in tests
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullOut() {
        new JsonWriter(null);
    }

    @Test
    public void testBasicObjectAndArrayCreation() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("name").value("value");
        jsonWriter.name("arr").beginArray();
        jsonWriter.value(123);
        jsonWriter.value(true);
        jsonWriter.value((String) null);
        jsonWriter.endArray();
        jsonWriter.endObject();
        jsonWriter.close();

        assertEquals("{\"name\":\"value\",\"arr\":[123,true,null]}", stringWriter.toString());
    }

    @Test
    public void testIndentAndPrettyPrinting() throws IOException {
        jsonWriter.setIndent("  ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(1);
        jsonWriter.endObject();
        jsonWriter.close();

        String expected = "{\n  \"a\": 1\n}";
        assertEquals(expected, stringWriter.toString());
    }

    @Test
    public void testHtmlSafeCharacters() throws IOException {
        jsonWriter.setHtmlSafe(true);
        assertTrue(jsonWriter.isHtmlSafe());

        jsonWriter.beginObject();
        jsonWriter.name("html").value("<script>&'=\"</script>");
        jsonWriter.endObject();
        jsonWriter.close();

        // Check if characters are escaped according to HTML_SAFE_REPLACEMENT_CHARS
        assertTrue(stringWriter.toString().contains("\\u003cscript\\u003e"));
    }

    @Test
    public void testSerializeNullsFalse() throws IOException {
        jsonWriter.setSerializeNulls(false);
        assertFalse(jsonWriter.getSerializeNulls());

        jsonWriter.beginObject();
        jsonWriter.name("normal").value("val");
        jsonWriter.name("nullKey").nullValue();
        jsonWriter.endObject();
        jsonWriter.close();

        assertEquals("{\"normal\":\"val\"}", stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testNestingProblemArrayCloseWithObject() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.endArray(); // Mismatch scope
    }

    @Test(expected = IllegalStateException.class)
    public void testDanglingNameException() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("dangling");
        jsonWriter.endObject(); // Should throw IllegalStateException due to dangling name
    }

    @Test(expected = IllegalStateException.class)
    public void testClosedWriterOperations() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.endObject();
        jsonWriter.close();
        jsonWriter.flush(); // Should throw since stackSize == 0
    }

    @Test(expected = IOException.class)
    public void testIncompleteDocumentOnClose() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.close(); // Incomplete document
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStrictDoubleNaN() throws IOException {
        jsonWriter.setLenient(false);
        assertFalse(jsonWriter.isLenient());
        jsonWriter.value(Double.NaN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStrictDoubleInfinity() throws IOException {
        jsonWriter.value(Double.POSITIVE_INFINITY);
    }

    @Test
    public void testLenientDoubleValues() throws IOException {
        jsonWriter.setLenient(true);
        assertTrue(jsonWriter.isLenient());

        jsonWriter.beginArray();
        jsonWriter.value(Double.NaN);
        jsonWriter.value(Double.POSITIVE_INFINITY);
        jsonWriter.value(Double.NEGATIVE_INFINITY);
        jsonWriter.endArray();
        jsonWriter.close();

        assertEquals("[NaN,Infinity,-Infinity]", stringWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStrictNumberInfinity() throws IOException {
        jsonWriter.setLenient(false);
        jsonWriter.value(Double.valueOf(Double.POSITIVE_INFINITY));
    }

    @Test
    public void testNumberValueHandling() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(new BigDecimal("123.45"));
        jsonWriter.value((Number) null);
        jsonWriter.endArray();
        jsonWriter.close();

        assertEquals("[123.45,null]", stringWriter.toString());
    }

    @Test
    public void testLongAndBooleanAndJsonValue() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(9999999999L);
        jsonWriter.value(true);
        jsonWriter.value(false);
        jsonWriter.jsonValue("{\"raw\":true}");
        jsonWriter.endArray();
        jsonWriter.close();

        assertEquals("[9999999999,true,false,{\"raw\":true}]", stringWriter.toString());
    }

    @Test
    public void testStringEscapingControlCharactersAndUnicode() throws IOException {
        jsonWriter.beginArray();
        // Control characters, quotes, backslashes, and line separators U+2028 / U+2029
        jsonWriter.value("\u0000\t\b\n\r\f\"\\ \u2028 \u2029");
        jsonWriter.endArray();
        jsonWriter.close();

        String result = stringWriter.toString();
        assertTrue(result.contains("\\u0000"));
        assertTrue(result.contains("\\t"));
        assertTrue(result.contains("\\u2028"));
        assertTrue(result.contains("\\u2029"));
    }

    @Test(expected = IllegalStateException.class)
    public void testStrictMultipleTopLevelValues() throws IOException {
        jsonWriter.setLenient(false);
        jsonWriter.beginArray().endArray();
        jsonWriter.beginArray(); // Second top-level value in strict mode triggers exception in beforeValue()
    }

    @Test
    public void testLenientMultipleTopLevelValues() throws IOException {
        jsonWriter.setLenient(true);
        jsonWriter.beginArray().endArray();
        jsonWriter.beginArray().endArray();
        jsonWriter.close();
        assertEquals("[][]", stringWriter.toString());
    }
}