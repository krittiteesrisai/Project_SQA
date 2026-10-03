package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.util.Date;

import static org.junit.Assert.*;

public class DefaultDateTypeAdapterTest {

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidDateTypeConstructor() {
        // Trigger constructor validation branch: invalid date type
        new DefaultDateTypeAdapter(java.util.Calendar.class);
    }

    @Test
    public void testConstructorsAndToString() {
        DefaultDateTypeAdapter adapter1 = new DefaultDateTypeAdapter(Date.class);
        assertNotNull(adapter1.toString());

        DefaultDateTypeAdapter adapter2 = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        assertNotNull(adapter2.toString());

        DefaultDateTypeAdapter adapter3 = new DefaultDateTypeAdapter(Date.class, 2);
        assertNotNull(adapter3.toString());

        DefaultDateTypeAdapter adapter4 = new DefaultDateTypeAdapter(2, 2);
        assertNotNull(adapter4.toString());

        DefaultDateTypeAdapter adapter5 = new DefaultDateTypeAdapter(Date.class, 2, 2);
        assertNotNull(adapter5.toString());
    }

    @Test
    public void testWriteNullValue() throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);

        adapter.write(jsonWriter, null);
        assertEquals("null", stringWriter.toString());
    }

    @Test
    public void testWriteNonNullValue() throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");

        Date date = new Date(1577836800000L); // 2020-01-01 00:00:00 UTC (approx depending on timezone)
        adapter.write(jsonWriter, date);
        assertTrue(stringWriter.toString().contains("2020"));
    }

    @Test(expected = JsonParseException.class)
    public void testReadNonStringTokenThrowsException() throws IOException {
        StringReader stringReader = new StringReader("12345");
        JsonReader jsonReader = new JsonReader(stringReader);
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);

        adapter.read(jsonReader);
    }

    @Test
    public void testReadDateTypeVariants() throws IOException {
        // Test Date.class
        StringReader sr1 = new StringReader("\"Jan 1, 2020\"");
        DefaultDateTypeAdapter adapterDate = new DefaultDateTypeAdapter(Date.class, java.text.DateFormat.MEDIUM);
        Date d1 = adapterDate.read(new JsonReader(sr1));
        assertNotNull(d1);
        assertEquals(Date.class, d1.getClass());

        // Test Timestamp.class
        StringReader sr2 = new StringReader("\"Jan 1, 2020\"");
        DefaultDateTypeAdapter adapterTimestamp = new DefaultDateTypeAdapter(Timestamp.class, java.text.DateFormat.MEDIUM);
        Date d2 = adapterTimestamp.read(new JsonReader(sr2));
        assertNotNull(d2);
        assertEquals(Timestamp.class, d2.getClass());

        // Test java.sql.Date.class
        StringReader sr3 = new StringReader("\"Jan 1, 2020\"");
        DefaultDateTypeAdapter adapterSqlDate = new DefaultDateTypeAdapter(java.sql.Date.class, java.text.DateFormat.MEDIUM);
        Date d3 = adapterSqlDate.read(new JsonReader(sr3));
        assertNotNull(d3);
        assertEquals(java.sql.Date.class, d3.getClass());
    }

    @Test
    public void testDeserializeToDateFallbacks() throws IOException {
        // Test ISO8601 fallback parsing path
        StringReader sr = new StringReader("\"2020-01-01T00:00:00Z\"");
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        Date date = adapter.read(new JsonReader(sr));
        assertNotNull(date);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testDeserializeToDateInvalidSyntaxThrowsException() throws IOException {
        StringReader sr = new StringReader("\"Not-A-Date-String-At-All\"");
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        adapter.read(new JsonReader(sr));
    }
}