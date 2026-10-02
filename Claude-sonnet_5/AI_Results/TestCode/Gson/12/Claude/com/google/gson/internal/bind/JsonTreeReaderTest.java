package com.google.gson.internal.bind;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
// import คลาสเป้าหมายอย่างชัดเจน (แม้จะอยู่ package เดียวกัน)
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.stream.JsonToken;

import org.junit.Test;

import java.io.IOException;

public class JsonTreeReaderTest {

  // ---------------------------------------------------------------------
  // beginArray / endArray
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyArray_topLevel() throws IOException {
    JsonArray array = new JsonArray();
    JsonTreeReader reader = new JsonTreeReader(array);
    reader.beginArray();
    assertFalse(reader.hasNext()); // iterator.hasNext()==false, isObject=false -> END_ARRAY
    reader.endArray(); // popStack x2, stackSize==0 -> if(stackSize>0) FALSE branch
    assertEquals(JsonToken.END_DOCUMENT, reader.peek()); // stackSize==0 branch
  }

  @Test
  public void testArrayWithElements_allPrimitiveTypes() throws IOException {
    JsonArray array = new JsonArray();
    array.add(new JsonPrimitive("a"));
    array.add(new JsonPrimitive(1));
    array.add(JsonNull.INSTANCE);
    array.add(new JsonPrimitive(true));
    JsonTreeReader reader = new JsonTreeReader(array);

    reader.beginArray();
    assertTrue(reader.hasNext());
    assertEquals(JsonToken.STRING, reader.peek());
    assertEquals("a", reader.nextString());

    assertTrue(reader.hasNext());
    assertEquals(JsonToken.NUMBER, reader.peek());
    assertEquals(1, reader.nextInt());

    assertTrue(reader.hasNext());
    assertEquals(JsonToken.NULL, reader.peek());
    reader.nextNull();

    assertTrue(reader.hasNext());
    assertEquals(JsonToken.BOOLEAN, reader.peek());
    assertTrue(reader.nextBoolean());

    assertFalse(reader.hasNext());
    reader.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testBeginArray_wrongType_throws() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonObject());
    reader.beginArray(); // expect(BEGIN_ARRAY) fails -> IllegalStateException
  }

  @Test
  public void testEndArray_nested_incrementsIndex() throws IOException {
    // ครอบคลุม endArray() กรณี stackSize > 0 หลัง pop (branch true)
    JsonArray outer = new JsonArray();
    JsonArray inner = new JsonArray();
    outer.add(inner);
    outer.add(new JsonPrimitive("after"));
    JsonTreeReader reader = new JsonTreeReader(outer);

    reader.beginArray();
    reader.beginArray(); // inner
    reader.endArray();   // stackSize>0 TRUE branch
    assertEquals("after", reader.nextString());
    reader.endArray();
  }

  // ---------------------------------------------------------------------
  // beginObject / endObject
  // ---------------------------------------------------------------------

  @Test
  public void testObjectWithEntries_nextName() throws IOException {
    JsonObject obj = new JsonObject();
    obj.addProperty("key1", "value1");
    obj.addProperty("key2", 2);
    JsonTreeReader reader = new JsonTreeReader(obj);

    reader.beginObject();
    assertTrue(reader.hasNext());
    assertEquals(JsonToken.NAME, reader.peek());
    assertEquals("key1", reader.nextName());
    assertEquals("value1", reader.nextString());

    assertEquals("key2", reader.nextName());
    assertEquals(2, reader.nextInt());

    assertFalse(reader.hasNext()); // iterator empty, isObject=true -> END_OBJECT
    reader.endObject(); // stackSize==0 FALSE branch (top-level)
    assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test(expected = IllegalStateException.class)
  public void testBeginObject_wrongType_throws() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonArray());
    reader.beginObject();
  }

  @Test
  public void testEndObject_nested_incrementsIndex() throws IOException {
    // ครอบคลุม endObject() กรณี stackSize > 0 (branch true)
    JsonObject outer = new JsonObject();
    JsonObject inner = new JsonObject();
    outer.add("inner", inner);
    outer.addProperty("after", "value2");
    JsonTreeReader reader = new JsonTreeReader(outer);

    reader.beginObject();
    assertEquals("inner", reader.nextName());
    reader.beginObject();
    reader.endObject(); // stackSize>0 TRUE branch
    assertEquals("after", reader.nextName());
    assertEquals("value2", reader.nextString());
    reader.endObject();
  }

  // ---------------------------------------------------------------------
  // nextName
  // ---------------------------------------------------------------------

  @Test(expected = IllegalStateException.class)
  public void testNextName_wrongToken_throws() throws IOException {
    JsonArray array = new JsonArray();
    array.add(new JsonPrimitive("x"));
    JsonTreeReader reader = new JsonTreeReader(array);
    reader.beginArray();
    reader.nextName(); // ปัจจุบันเป็น STRING ไม่ใช่ NAME -> expect() throws
  }

  // ---------------------------------------------------------------------
  // nextString
  // ---------------------------------------------------------------------

  @Test
  public void testNextString_fromStringPrimitive() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("hello"));
    assertEquals("hello", reader.nextString());
  }

  @Test
  public void testNextString_fromNumberPrimitive() throws IOException {
    // token==NUMBER ก็ถูกยอมรับใน nextString()
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(123));
    assertEquals("123", reader.nextString());
  }

  @Test(expected = IllegalStateException.class)
  public void testNextString_wrongType_throws() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(true));
    reader.nextString(); // token==BOOLEAN -> throws
  }

  // ---------------------------------------------------------------------
  // nextBoolean
  // ---------------------------------------------------------------------

  @Test
  public void testNextBoolean_normal() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(false));
    assertFalse(reader.nextBoolean());
  }

  @Test(expected = IllegalStateException.class)
  public void testNextBoolean_wrongType_throws() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("str"));
    reader.nextBoolean();
  }

  // ---------------------------------------------------------------------
  // nextNull
  // ---------------------------------------------------------------------

  @Test
  public void testNextNull_normal() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(JsonNull.INSTANCE);
    reader.nextNull();
    assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test(expected = IllegalStateException.class)
  public void testNextNull_wrongType_throws() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(1));
    reader.nextNull();
  }

  // ---------------------------------------------------------------------
  // nextDouble
  // ---------------------------------------------------------------------

  @Test
  public void testNextDouble_fromNumber() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(1.5));
    assertEquals(1.5, reader.nextDouble(), 0.0);
  }

  @Test
  public void testNextDouble_fromNumericString() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("2.5"));
    assertEquals(2.5, reader.nextDouble(), 0.0);
  }

  @Test(expected = IllegalStateException.class)
  public void testNextDouble_wrongType_throws() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(true));
    reader.nextDouble();
  }

  @Test(expected = NumberFormatException.class)
  public void testNextDouble_NaN_notLenient_throws() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(Double.NaN));
    reader.nextDouble(); // isLenient()==false (default) -> NumberFormatException
  }

  @Test(expected = NumberFormatException.class)
  public void testNextDouble_Infinity_notLenient_throws() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(Double.POSITIVE_INFINITY));
    reader.nextDouble();
  }

  @Test
  public void testNextDouble_NaN_lenient_ok() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(Double.NaN));
    reader.setLenient(true);
    double result = reader.nextDouble(); // isLenient()==true -> ข้ามการตรวจสอบ
    assertTrue(Double.isNaN(result));
  }

  // ---------------------------------------------------------------------
  // nextLong
  // ---------------------------------------------------------------------

  @Test
  public void testNextLong_normal() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(100L));
    assertEquals(100L, reader.nextLong());
  }

  @Test
  public void testNextLong_boundaryMaxValue() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(Long.MAX_VALUE));
    assertEquals(Long.MAX_VALUE, reader.nextLong());
  }

  @Test(expected = IllegalStateException.class)
  public void testNextLong_wrongType_throws() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(false));
    reader.nextLong();
  }

  // ---------------------------------------------------------------------
  // nextInt
  // ---------------------------------------------------------------------

  @Test
  public void testNextInt_normal() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(42));
    assertEquals(42, reader.nextInt());
  }

  @Test
  public void testNextInt_boundaryMinValue() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(Integer.MIN_VALUE));
    assertEquals(Integer.MIN_VALUE, reader.nextInt());
  }

  @Test(expected = IllegalStateException.class)
  public void testNextInt_wrongType_throws() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(true));
    reader.nextInt();
  }

  // ---------------------------------------------------------------------
  // close
  // ---------------------------------------------------------------------

  @Test(expected = IllegalStateException.class)
  public void testClose_thenPeek_throws() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("x"));
    reader.close();
    reader.peek(); // o == SENTINEL_CLOSED -> IllegalStateException
  }

  @Test(expected = IllegalStateException.class)
  public void testClose_thenNextString_throws() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("x"));
    reader.close();
    reader.nextString();
  }

  // ---------------------------------------------------------------------
  // skipValue
  // ---------------------------------------------------------------------

  @Test
  public void testSkipValue_nameBranch() throws IOException {
    // ครอบคลุม branch peek()==NAME ภายใน skipValue()
    // หมายเหตุ: ตามซอร์สโค้ดปัจจุบัน หลัง skipValue() ในกรณีนี้
    // "value" ยังคงค้างอยู่บน stack (ไม่ได้ pop ค่าออกไปด้วย) ซึ่งอาจเป็นพฤติกรรม
    // ที่ไม่ตรงกับความคาดหวังทั่วไป (potential defect) แต่เราทดสอบตามพฤติกรรมจริงของโค้ด
    JsonObject obj = new JsonObject();
    obj.addProperty("key", "value");
    JsonTreeReader reader = new JsonTreeReader(obj);
    reader.beginObject();
    reader.skipValue(); // ข้าม NAME เท่านั้น ตามโค้ดจริง
    assertEquals(JsonToken.STRING, reader.peek()); // "value" ยังอยู่บน stack
    assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test
  public void testSkipValue_nonNameBranch() throws IOException {
    // ครอบคลุม branch else (popStack()) ภายใน skipValue()
    JsonArray array = new JsonArray();
    array.add(new JsonPrimitive(1));
    array.add(new JsonPrimitive(2));
    JsonTreeReader reader = new JsonTreeReader(array);
    reader.beginArray();
    reader.skipValue(); // pop ค่าแรกออกไป
    assertEquals(2, reader.nextInt());
    reader.endArray();
  }

  // ---------------------------------------------------------------------
  // toString
  // ---------------------------------------------------------------------

  @Test
  public void testToString_returnsSimpleClassName() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(JsonNull.INSTANCE);
    assertEquals("JsonTreeReader", reader.toString());
  }

  // ---------------------------------------------------------------------
  // promoteNameToValue
  // ---------------------------------------------------------------------

  @Test
  public void testPromoteNameToValue_normal() throws IOException {
    JsonObject obj = new JsonObject();
    obj.addProperty("key", "value");
    JsonTreeReader reader = new JsonTreeReader(obj);
    reader.beginObject();
    reader.promoteNameToValue();
    // ตามลำดับ push ในซอร์ส: push(value) แล้ว push(primitive(key))
    // ดังนั้นค่าบนสุดของ stack คือ key ก่อน แล้วค่อยเป็น value
    assertEquals("key", reader.nextString());
    assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testPromoteNameToValue_wrongToken_throws() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("x"));
    reader.promoteNameToValue(); // ไม่ใช่ NAME -> throws
  }

  // ---------------------------------------------------------------------
  // push() growth branch (stack resize)
  // ---------------------------------------------------------------------

  @Test
  public void testPush_stackGrowsBeyondInitialCapacity() throws IOException {
    // สร้างโครงสร้าง array ซ้อนกันมากพอที่จะทำให้ stack (เริ่มต้นขนาด 32)
    // ต้องขยายขนาด (branch stackSize == stack.length ภายใน push())
    JsonArray current = new JsonArray();
    current.add(new JsonPrimitive("deep"));
    for (int i = 0; i < 20; i++) {
      JsonArray outer = new JsonArray();
      outer.add(current);
      current = outer;
    }
    JsonTreeReader reader = new JsonTreeReader(current);
    for (int i = 0; i < 20; i++) {
      reader.beginArray();
    }
    assertEquals("deep", reader.nextString());
    for (int i = 0; i < 20; i++) {
      reader.endArray();
    }
    assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  // ---------------------------------------------------------------------
  // getPath
  // ---------------------------------------------------------------------

  @Test
  public void testGetPath_nestedArrayAndObject() throws IOException {
    JsonObject obj = new JsonObject();
    obj.addProperty("a", 1);
    JsonArray array = new JsonArray();
    array.add(obj);
    JsonTreeReader reader = new JsonTreeReader(array);

    assertEquals("$", reader.getPath());
    reader.beginArray();
    assertEquals("$[0]", reader.getPath());
    reader.beginObject();
    assertEquals("$[0].", reader.getPath());
    assertEquals("a", reader.nextName());
    assertEquals("$[0].a", reader.getPath());
  }

  // ---------------------------------------------------------------------
  // Edge case: null element (ไม่ได้ระบุพฤติกรรมชัดเจนในเอกสาร แต่ตามซอร์สโค้ด
  // จะตกไปที่ branch else สุดท้ายของ peek() -> AssertionError)
  // ---------------------------------------------------------------------

  @Test(expected = AssertionError.class)
  public void testConstructor_withNullElement_peekThrowsAssertionError() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(null);
    reader.peek(); // o เป็น null -> ไม่ตรง instanceof ใด ๆ -> else -> AssertionError
  }
}
