package com.google.gson.stream;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;

public class JsonWriterTest {

    private StringWriter stringWriter;
    private JsonWriter jsonWriter;

    @Before
    public void setUp() {
        stringWriter = new StringWriter();
        jsonWriter = new JsonWriter(stringWriter);
    }

    @After
    public void tearDown() throws Exception {
        // ป้องกัน Stream ค้าง (ถ้ายังไม่ได้ปิด)
        try {
            jsonWriter.close();
        } catch (Exception ignored) {
        }
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullWriter() {
        new JsonWriter(null);
    }

    @Test
    public void testBasicObjectAndArrayCreation() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("name").value("value");
        jsonWriter.name("arr").beginArray();
        jsonWriter.value(1).value(2.5).value(true).value((String) null);
        jsonWriter.endArray();
        jsonWriter.endObject();
        jsonWriter.close();

        assertEquals("{\"name\":\"value\",\"arr\":[1,2.5,true,null]}", stringWriter.toString());
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

        // ทดสอบรีเซ็ต indent เป็นค่าว่าง
        StringWriter sw2 = new StringWriter();
        JsonWriter jw2 = new JsonWriter(sw2);
        jw2.setIndent("");
        jw2.beginArray();
        jw2.value(10);
        jw2.endArray();
        jw2.close();
        assertEquals("[10]", sw2.toString());
    }

    @Test
    public void testLenientModeForNumbers() throws IOException {
        jsonWriter.setLenient(true);
        jsonWriter.beginArray();
        jsonWriter.value(Double.NaN);
        jsonWriter.value(Double.POSITIVE_INFINITY);
        jsonWriter.value(Double.NEGATIVE_INFINITY);
        jsonWriter.endArray();
        jsonWriter.close();

        assertEquals("[NaN,Infinity,-Infinity]", stringWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStrictNumericValidationDoubleNaN() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(Double.NaN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStrictNumericValidationNumberInfinity() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(Double.valueOf(Double.POSITIVE_INFINITY));
    }

    @Test
    public void testHtmlSafeEscaping() throws IOException {
        jsonWriter.setHtmlSafe(true);
        jsonWriter.beginArray();
        jsonWriter.value("<script> & 'foo' = \"bar\" >");
        jsonWriter.endArray();
        jsonWriter.close();

        assertEquals("[\"\\u003cscript\\u003e \\u0026 \\u0027foo\\u0027 \\u003d \\\"bar\\\" \\u003e\"]", stringWriter.toString());
    }

    @Test
    public void testUnicodeLineSeparatorsEscaping() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value("line1\u2028line2\u2029line3");
        jsonWriter.endArray();
        jsonWriter.close();

        assertEquals("[\"line1\\u2028line2\\u2029line3\"]", stringWriter.toString());
    }

    @Test
    public void testSerializeNullsFalse() throws IOException {
        jsonWriter.setSerializeNulls(false);
        jsonWriter.beginObject();
        jsonWriter.name("nullableKey").nullValue();
        jsonWriter.name("normalKey").value("val");
        jsonWriter.endObject();
        jsonWriter.close();

        // nullValue ที่มีชื่อและ serializeNulls=false ควรจะถูกข้ามทั้งหมด
        assertEquals("{\"normalKey\":\"val\"}", stringWriter.toString());
    }

    @Test
    public void testJsonValueMethod() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("raw").jsonValue("{\"a\":1}");
        jsonWriter.endObject();
        jsonWriter.close();

        assertEquals("{\"raw\":{\"a\":1}}", stringWriter.toString());

        // ทดสอบ null ใน jsonValue
        StringWriter sw2 = new StringWriter();
        JsonWriter jw2 = new JsonWriter(sw2);
        jw2.beginObject();
        jw2.name("nullRaw").jsonValue(null);
        jw2.endObject();
        jw2.close();
        assertEquals("{\"nullRaw\":null}", sw2.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testNestingProblemArrayObjectMismatch() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.endObject(); // ผิดประเภท ควรเป็น endArray()
    }

    @Test(expected = IllegalStateException.class)
    public void testDanglingNameException() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("key1");
        jsonWriter.name("key2"); // ใส่ซ้ำโดยยังไม่ใส่ค่า จะพ่น IllegalStateException
    }

    @Test(expected = IllegalStateException.class)
    public void testClosedWriterPeekException() throws IOException {
        jsonWriter.close();
        jsonWriter.beginArray(); // เขียนหลังจากปิดแล้ว
    }

    @Test(expected = IllegalStateException.class)
    public void testFlushOnClosedWriter() throws IOException {
        jsonWriter.close();
        jsonWriter.flush();
    }

    @Test(expected = IOException.class)
    public void testIncompleteDocumentOnClose() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("incomplete");
        jsonWriter.close(); // เปิด Object ค้างไว้ จะพ่น IOException
    }

    @Test
    public void testStackExpansionBoundary() throws IOException {
        // ทดสอบให้ stack เกินขนาดเริ่มต้น 32 เพื่อเทส System.arraycopy
        jsonWriter.beginArray();
        for (int i = 0; i < 40; i++) {
            jsonWriter.beginArray();
        }
        for (int i = 0; i < 40; i++) {
            jsonWriter.endArray();
        }
        jsonWriter.endArray();
        jsonWriter.close();
        
        assertTrue(stringWriter.toString().length() > 0);
    }

    @Test
    public void testLongAndBigDecimalValues() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(123456789L);
        jsonWriter.value(new BigDecimal("123.456"));
        jsonWriter.value((Number) null);
        jsonWriter.endArray();
        jsonWriter.close();

        assertEquals("[123456789,123.456,null]", stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testMultipleTopLevelValuesStrict() throws IOException {
        jsonWriter.setLenient(false);
        jsonWriter.value("first");
        jsonWriter.value("second"); // โหมด strict ห้ามมี top-level หลายตัว
    }

    @Test
    public void testMultipleTopLevelValuesLenient() throws IOException {
        jsonWriter.setLenient(true);
        jsonWriter.value("first");
        jsonWriter.value("second");
        jsonWriter.close();

        assertEquals("\"first\"\"second\"", stringWriter.toString());
    }
}