package com.google.gson.stream;

import org.junit.Test;
import org.junit.Assert;
import java.io.IOException;
import java.io.StringReader;

public class JsonReaderTest {

    @Test(expected = NullPointerException.class)
    public void testConstructorNullReader() {
        new JsonReader(null);
    }

    @Test
    public void testLenientSetting() {
        StringReader reader = new StringReader("{}");
        JsonReader jsonReader = new JsonReader(reader);
        Assert.assertFalse(jsonReader.isLenient());
        jsonReader.setLenient(true);
        Assert.assertTrue(jsonReader.isLenient());
    }

    @Test
    public void testBasicObjectAndArrayParsing() throws IOException {
        String json = "{\"name\":\"test\",\"values\":[1,2,3],\"active\":true,\"valNull\":null}";
        JsonReader reader = new JsonReader(new StringReader(json));

        reader.beginObject();
        Assert.assertEquals("name", reader.nextName());
        Assert.assertEquals("test", reader.nextString());

        Assert.assertEquals("values", reader.nextName());
        reader.beginArray();
        Assert.assertEquals(1, reader.nextInt());
        Assert.assertEquals(2, reader.nextInt());
        Assert.assertEquals(3, reader.nextInt());
        reader.endArray();

        Assert.assertEquals("active", reader.nextName());
        Assert.assertTrue(reader.nextBoolean());

        Assert.assertEquals("valNull", reader.nextName());
        reader.nextNull();

        reader.endObject();
        Assert.assertFalse(reader.hasNext());
        reader.close();
    }

    @Test(expected = IllegalStateException.class)
    public void testIllegalStateExpectedArray() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("{}"));
        reader.beginArray(); // โยน IllegalStateException เพราะเจอ Object ไม่ใช่ Array
    }

    @Test(expected = IllegalStateException.class)
    public void testIllegalStateExpectedObject() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("[]"));
        reader.beginObject(); // โยน IllegalStateException เพราะเจอ Array ไม่ใช่ Object
    }

    @Test
    public void testNextLongAndIntBoundaries() throws IOException {
        String json = "{\"intVal\":123, \"longVal\":9223372036854775807, \"stringNum\":\"456\"}";
        JsonReader reader = new JsonReader(new StringReader(json));

        reader.beginObject();
        Assert.assertEquals("intVal", reader.nextName());
        Assert.assertEquals(123, reader.nextInt());

        Assert.assertEquals("longVal", reader.nextName());
        Assert.assertEquals(9223372036854775807L, reader.nextLong());

        Assert.assertEquals("stringNum", reader.nextName());
        Assert.assertEquals(456, reader.nextInt());
        reader.endObject();
    }

    @Test(expected = NumberFormatException.class)
    public void testIntPrecisionLossThrowsException() throws IOException {
        // ค่าที่เกินขอบเขต int แต่ยังอยู่ใน double จะทำให้เกิด precision loss เมื่อแคสต์
        String json = "{\"val\": 2147483648}"; 
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.beginObject();
        reader.nextName();
        reader.nextInt(); // ควรโยน NumberFormatException
    }

    @Test(expected = NumberFormatException.class)
    public void testLongPrecisionLossThrowsException() throws IOException {
        String json = "{\"val\": 9223372036854775807}"; // เกินขอบเขต long แน่นอนเมื่ออ่านเป็น double แล้วแคสต์กลับ
        JsonReader reader = new JsonReader(new StringReader("{\"val\": 9223372036854775807.123}"));
        reader.beginObject();
        reader.nextName();
        reader.nextLong();
    }

    @Test
    public void testNextDoubleAndNanInLenientMode() throws IOException {
        String json = "{\"d1\":12.34, \"d2\":NaN, \"d3\":Infinity}";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.setLenient(true);

        reader.beginObject();
        Assert.assertEquals("d1", reader.nextName());
        Assert.assertEquals(12.34, reader.nextDouble(), 0.0001);

        Assert.assertEquals("d2", reader.nextName());
        Assert.assertTrue(Double.isNaN(reader.nextDouble()));

        Assert.assertEquals("d3", reader.nextName());
        Assert.assertTrue(Double.isInfinite(reader.nextDouble()));
        reader.endObject();
    }

    @Test(expected = MalformedJsonException.class)
    public void testNanInStrictModeThrowsException() throws IOException {
        String json = "{\"d2\":NaN}";
        JsonReader reader = new JsonReader(new StringReader(json));
        // Strict mode (lenient = false เป็นค่าเริ่มต้น)
        reader.beginObject();
        reader.nextName();
        reader.nextDouble();
    }

    @Test
    public void testSkipValueNestedStructures() throws IOException {
        String json = "{\"skipMe\": {\"a\": [1, 2], \"b\": 3}, \"keepMe\": 456}";
        JsonReader reader = new JsonReader(new StringReader(json));

        reader.beginObject();
        Assert.assertEquals("skipMe", reader.nextName());
        reader.skipValue(); // ข้าม Object ทั้งหมด

        Assert.assertEquals("keepMe", reader.nextName());
        Assert.assertEquals(456, reader.nextInt());
        reader.endObject();
    }

    @Test
    public void testEscapeCharactersInString() throws IOException {
        String json = "{\"str\":\"Line1\\nLine2\\tTabbed\\u0041\"}";
        JsonReader reader = new JsonReader(new StringReader(json));

        reader.beginObject();
        Assert.assertEquals("str", reader.nextName());
        Assert.assertEquals("Line1\nLine2\tTabbedA", reader.nextString());
        reader.endObject();
    }

    @Test
    public void testCommentsAndLenientFeatures() throws IOException {
        String json = "[\n" +
                "  // line comment\n" +
                "  /* block comment */\n" +
                "  # hash comment\n" +
                "  1, 2; 3\n" +
                "]";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.setLenient(true);

        reader.beginArray();
        Assert.assertEquals(1, reader.nextInt());
        Assert.assertEquals(2, reader.nextInt());
        Assert.assertEquals(3, reader.nextInt());
        reader.endArray();
    }

    @Test
    public void testNonExecutePrefixLenient() throws IOException {
        String json = ")]}'\n[1, 2]";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.setLenient(true);

        reader.beginArray();
        Assert.assertEquals(1, reader.nextInt());
        Assert.assertEquals(2, reader.nextInt());
        reader.endArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testClosedReaderThrowsException() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("{}"));
        reader.close();
        reader.beginObject();
    }
}