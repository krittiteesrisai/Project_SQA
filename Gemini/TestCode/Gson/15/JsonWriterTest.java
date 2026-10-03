package com.google.gson.stream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

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
        // ป้องกัน Stream รั่วไหลในกรณีเทสที่มี Exception
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullWriter() {
        new JsonWriter(null);
    }

    @Test
    public void testBasicObjectAndArrayWriting() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("hello").value("world");
        jsonWriter.name("array");
        jsonWriter.beginArray();
        jsonWriter.value(1);
        jsonWriter.value(2L);
        jsonWriter.value(true);
        jsonWriter.value((Boolean) null);
        jsonWriter.endArray();
        jsonWriter.name("nullVal").nullValue();
        jsonWriter.endObject();
        jsonWriter.close();

        assertEquals("{\"hello\":\"world\",\"array\":[1,2,true,null],\"nullVal\":null}", stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testClosedWriterPeekOrFlushThrowsException() throws IOException {
        jsonWriter.close();
        jsonWriter.flush();
    }

    @Test(expected = IllegalStateException.class)
    public void testNestingProblemArrayCloseAsObject() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.endObject();
    }

    @Test(expected = IllegalStateException.class)
    public void testDanglingNameThrowsException() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("key");
        jsonWriter.endObject(); // ยังไม่ได้ใส่ value ให้ key
    }

    @Test(expected = IllegalStateException.class)
    public void testDuplicateNameThrowsException() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("key1");
        jsonWriter.name("key2");
    }

    @Test(expected = IOException.class)
    public void testIncompleteDocumentClose() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.close(); // เอกสารยังไม่สมบูรณ์ (ยังไม่ปิด object)
    }

    @Test
    public void testSerializeNullsFalse() throws IOException {
        jsonWriter.setSerializeNulls(false);
        jsonWriter.beginObject();
        jsonWriter.name("notNull").value("val");
        jsonWriter.name("isNull").nullValue(); // ควรถูกข้ามชื่อและค่า
        jsonWriter.endObject();
        jsonWriter.close();

        assertEquals("{\"notNull\":\"val\"}", stringWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStrictDoubleNaNThrowsException() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(Double.NaN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStrictDoubleInfinityThrowsException() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(Double.POSITIVE_INFINITY);
    }

    @Test
    public void testLenientDoubleNaNAndInfinity() throws IOException {
        jsonWriter.setLenient(true);
        jsonWriter.beginArray();
        jsonWriter.value(Double.NaN);
        jsonWriter.value(Double.NEGATIVE_INFINITY);
        jsonWriter.value(Double.POSITIVE_INFINITY);
        jsonWriter.endArray();
        jsonWriter.close();

        assertEquals("[NaN,-Infinity,Infinity]", stringWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumberNaNStrictThrowsException() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value((Number) Double.NaN);
    }

    @Test
    public void testNumberNaNLenient() throws IOException {
        jsonWriter.setLenient(true);
        jsonWriter.beginArray();
        jsonWriter.value((Number) Double.NaN);
        jsonWriter.value((Number) Double.POSITIVE_INFINITY);
        jsonWriter.value((Number) Double.NEGATIVE_INFINITY);
        jsonWriter.endArray();
        jsonWriter.close();

        assertEquals("[NaN,Infinity,-Infinity]", stringWriter.toString());
    }

    @Test
    public void testHtmlSafeCharacters() throws IOException {
        jsonWriter.setHtmlSafe(true);
        jsonWriter.beginObject();
        jsonWriter.name("html").value("<script>&'</script>");
        jsonWriter.endObject();
        jsonWriter.close();

        assertEquals("{\"html\":\"\\u003cscript\\u003e\\u0026\\u0027\\u003c/script\\u003e\"}", stringWriter.toString());
    }

    @Test
    public void testUnicodeLineSeparatorsEscaping() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("line").value("A\u2028B\u2029C");
        jsonWriter.endObject();
        jsonWriter.close();

        assertEquals("{\"line\":\"A\\u2028B\\u2029C\"}", stringWriter.toString());
    }

    @Test
    public void testJsonValueDirectInsertion() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("raw");
        jsonWriter.jsonValue("{\"a\":1}");
        jsonWriter.endObject();
        jsonWriter.close();

        assertEquals("{\"raw\":{\"a\":1}}", stringWriter.toString());
    }

    @Test
    public void testIndentationAndFormatting() throws IOException {
        jsonWriter.setIndent("  ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(1);
        jsonWriter.endObject();
        jsonWriter.close();

        assertTrue(stringWriter.toString().contains("\n"));
    }

    @Test(expected = IllegalStateException.class)
    public void testMultipleTopLevelValuesStrictThrowsException() throws IOException {
        jsonWriter.setLenient(false);
        jsonWriter.beginArray();
        jsonWriter.endArray();
        jsonWriter.beginArray(); // พยายามสร้าง top-level ตัวที่สองในโหมด Strict
    }

    @Test
    public void testMultipleTopLevelValuesLenient() throws IOException {
        jsonWriter.setLenient(true);
        jsonWriter.beginArray();
        jsonWriter.endArray();
        jsonWriter.beginArray();
        jsonWriter.endArray();
        jsonWriter.close();

        assertEquals("[][]", stringWriter.toString());
    }
}