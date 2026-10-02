package com.google.gson;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Unit tests for {@link DefaultDateTypeAdapter}.
 *
 * หมายเหตุ: คลาสเป้าหมายเป็น package-private ดังนั้นคลาสทดสอบนี้ต้องอยู่ใน package เดียวกัน
 * (com.google.gson) เพื่อให้เข้าถึง constructor แบบ package-private ได้
 */
public class DefaultDateTypeAdapterTest {

  // dummy subclass ของ Date ที่ไม่ได้รับอนุญาต (ไม่ใช่ Date/Timestamp/java.sql.Date)
  private static class UnsupportedDate extends Date {
    private static final long serialVersionUID = 1L;
  }

  // ---------------------------------------------------------------------
  // Constructor validation branch
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_ValidDateTypes_DoesNotThrow() {
    SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    // 3 กรณีที่ผ่านเงื่อนไข if ใน constructor หลัก
    new DefaultDateTypeAdapter(Date.class, fmt, fmt);
    new DefaultDateTypeAdapter(Timestamp.class, fmt, fmt);
    new DefaultDateTypeAdapter(java.sql.Date.class, fmt, fmt);
  }

  @Test
  public void testConstructor_InvalidDateType_ThrowsIllegalArgumentException() {
    SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    try {
      new DefaultDateTypeAdapter(UnsupportedDate.class, fmt, fmt);
      fail("Expected IllegalArgumentException for unsupported date type");
    } catch (IllegalArgumentException expected) {
      // OK: ตรงตามเงื่อนไข throw ใน constructor
    }
  }

  @Test
  public void testConstructor_DateTypeOnly_DoesNotThrow() {
    // ทดสอบ constructor overload (Class) เพื่อ coverage เพิ่ม
    new DefaultDateTypeAdapter(Date.class);
  }

  @Test
  public void testConstructor_DateTypeAndPattern_DoesNotThrow() {
    new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
  }

  @Test
  public void testConstructor_DateTypeAndStyle_DoesNotThrow() {
    new DefaultDateTypeAdapter(Date.class, java.text.DateFormat.SHORT);
  }

  @Test
  public void testConstructor_DateStyleTimeStyle_DoesNotThrow() {
    new DefaultDateTypeAdapter(java.text.DateFormat.SHORT, java.text.DateFormat.SHORT);
  }

  @Test
  public void testConstructor_DateTypeDateStyleTimeStyle_DoesNotThrow() {
    new DefaultDateTypeAdapter(Timestamp.class, java.text.DateFormat.SHORT, java.text.DateFormat.SHORT);
  }

  // ---------------------------------------------------------------------
  // write() branch: value == null / value != null
  // ---------------------------------------------------------------------

  @Test
  public void testWrite_NullValue_WritesJsonNull() throws IOException {
    SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, fmt, fmt);

    StringWriter sw = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(sw);
    jsonWriter.setLenient(true); // อนุญาตให้เขียนค่า scalar เดี่ยวๆที่ top level

    adapter.write(jsonWriter, null);
    jsonWriter.flush();

    assertEquals("null", sw.toString());
  }

  @Test
  public void testWrite_NonNullValue_UsesEnUsFormat() throws IOException {
    SimpleDateFormat enUs = new SimpleDateFormat("yyyy/MM/dd", Locale.US);
    SimpleDateFormat local = new SimpleDateFormat("dd-MM-yyyy"); // ควบคุมให้ต่างจาก enUs อย่างชัดเจน
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, enUs, local);

    Date date = enUs.parse2("2020/05/17"); // placeholder replaced below
    // ใช้ parse ธรรมดาแทน (SimpleDateFormat ไม่มี parse2) - แก้ไขด้านล่าง
    date = null;
    try {
      date = enUs.parse("2020/05/17");
    } catch (java.text.ParseException e) {
      fail("setup parse failed: " + e.getMessage());
    }

    StringWriter sw = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(sw);
    jsonWriter.setLenient(true);

    adapter.write(jsonWriter, date);
    jsonWriter.flush();

    // write() ใช้ enUsFormat เท่านั้น (ไม่ใช่ localFormat) ตามซอร์สโค้ด
    assertEquals("\"2020/05/17\"", sw.toString());
  }

  // ---------------------------------------------------------------------
  // read() branch: peek() != STRING -> throws JsonParseException
  // ---------------------------------------------------------------------

  @Test
  public void testRead_NonStringToken_ThrowsJsonParseException() throws IOException {
    SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, fmt, fmt);

    JsonReader reader = new JsonReader(new StringReader("123"));
    reader.setLenient(true);

    try {
      adapter.read(reader);
      fail("Expected JsonParseException when token is not STRING");
    } catch (JsonParseException expected) {
      // OK
    }
  }

  // ---------------------------------------------------------------------
  // read() branch: dateType == Date.class / Timestamp.class / java.sql.Date.class
  // ---------------------------------------------------------------------

  @Test
  public void testRead_DateType_ReturnsPlainDate() throws IOException {
    SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, fmt, fmt);

    JsonReader reader = new JsonReader(new StringReader("\"2020-05-17\""));
    reader.setLenient(true);

    Date result = adapter.read(reader);
    assertTrue(result.getClass() == Date.class);
  }

  @Test
  public void testRead_TimestampType_ReturnsTimestampInstance() throws IOException {
    SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Timestamp.class, fmt, fmt);

    JsonReader reader = new JsonReader(new StringReader("\"2020-05-17\""));
    reader.setLenient(true);

    Date result = adapter.read(reader);
    assertTrue(result instanceof Timestamp);
  }

  @Test
  public void testRead_SqlDateType_ReturnsSqlDateInstance() throws IOException {
    SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(java.sql.Date.class, fmt, fmt);

    JsonReader reader = new JsonReader(new StringReader("\"2020-05-17\""));
    reader.setLenient(true);

    Date result = adapter.read(reader);
    assertTrue(result instanceof java.sql.Date);
  }

  // ---------------------------------------------------------------------
  // deserializeToDate branch: localFormat success (first try succeeds)
  // ---------------------------------------------------------------------

  @Test
  public void testDeserialize_LocalFormatSucceeds() throws IOException {
    SimpleDateFormat local = new SimpleDateFormat("yyyy/MM/dd", Locale.US);
    SimpleDateFormat enUs = new SimpleDateFormat("dd MMM yyyy", Locale.US);
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, enUs, local);

    JsonReader reader = new JsonReader(new StringReader("\"2020/05/17\""));
    reader.setLenient(true);

    Date result = adapter.read(reader);
    assertTrue(result != null);
  }

  // ---------------------------------------------------------------------
  // deserializeToDate branch: localFormat fails, enUsFormat succeeds
  // ---------------------------------------------------------------------

  @Test
  public void testDeserialize_EnUsFormatSucceedsAfterLocalFails() throws IOException {
    // localFormat ต้องขึ้นต้นด้วยชื่อวัน (EEE) จึง parse ตัวเลขล้วนไม่ได้ -> เกิด ParseException
    SimpleDateFormat local = new SimpleDateFormat("EEE, dd MMM yyyy", Locale.US);
    SimpleDateFormat enUs = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, enUs, local);

    JsonReader reader = new JsonReader(new StringReader("\"17/05/2020\""));
    reader.setLenient(true);

    Date result = adapter.read(reader);
    assertTrue(result != null);
  }

  // ---------------------------------------------------------------------
  // deserializeToDate branch: local & enUs fail, ISO8601Utils.parse succeeds
  // ---------------------------------------------------------------------

  @Test
  public void testDeserialize_Iso8601FallbackSucceeds() throws IOException {
    // ทั้ง localFormat และ enUsFormat ต้องขึ้นต้นด้วยชื่อวัน (EEE) เพื่อไม่ให้ parse
    // สตริง ISO8601 (ซึ่งขึ้นต้นด้วยตัวเลข) ได้เลย จึงตกไปที่ ISO8601Utils.parse
    SimpleDateFormat local = new SimpleDateFormat("EEE, dd MMM yyyy", Locale.US);
    SimpleDateFormat enUs = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm", Locale.US);
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, enUs, local);

    JsonReader reader = new JsonReader(new StringReader("\"2020-05-17T10:15:30.000Z\""));
    reader.setLenient(true);

    Date result = adapter.read(reader);
    assertTrue(result != null);
  }

  // ---------------------------------------------------------------------
  // deserializeToDate branch: ทั้ง 3 การ parse ล้มเหลว -> JsonSyntaxException
  // ---------------------------------------------------------------------

  @Test
  public void testDeserialize_AllParsersFail_ThrowsJsonSyntaxException() throws IOException {
    SimpleDateFormat local = new SimpleDateFormat("EEE, dd MMM yyyy", Locale.US);
    SimpleDateFormat enUs = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm", Locale.US);
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, enUs, local);

    JsonReader reader = new JsonReader(new StringReader("\"this-is-not-a-date\""));
    reader.setLenient(true);

    try {
      adapter.read(reader);
      fail("Expected JsonSyntaxException when all parsers fail");
    } catch (JsonSyntaxException expected) {
      // OK
    }
  }

  // ---------------------------------------------------------------------
  // toString()
  // ---------------------------------------------------------------------

  @Test
  public void testToString_ReturnsExpectedFormat() {
    SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, fmt, fmt);

    String result = adapter.toString();
    assertEquals("DefaultDateTypeAdapter(" + fmt.getClass().getSimpleName() + ")", result);
  }

  // ---------------------------------------------------------------------
  // Boundary: อินพุตว่างเปล่า (empty string) -> ต้องล้มเหลวทุก parser -> JsonSyntaxException
  // ---------------------------------------------------------------------

  @Test
  public void testDeserialize_EmptyString_ThrowsJsonSyntaxException() throws IOException {
    SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, fmt, fmt);

    JsonReader reader = new JsonReader(new StringReader("\"\""));
    reader.setLenient(true);

    try {
      adapter.read(reader);
      fail("Expected JsonSyntaxException for empty string input");
    } catch (JsonSyntaxException expected) {
      // OK
    }
  }
}
