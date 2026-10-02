# JUnit 4 Test Suite: JsonTreeWriterTest

```java
package com.google.gson.internal.bind;

import static org.junit.Assert.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class JsonTreeWriterTest {

  private JsonTreeWriter writer;

  @Before
  public void setUp() {
    writer = new JsonTreeWriter();
  }

  // ---------- get() ----------

  @Test
  public void testGet_DefaultProduct_IsJsonNull() {
    // stack ว่างตั้งแต่แรก -> product เริ่มต้นคือ JsonNull.INSTANCE
    JsonElement result = writer.get();
    assertTrue(result.isJsonNull());
  }

  @Test(expected = IllegalStateException.class)
  public void testGet_NonEmptyStack_Throws() throws IOException {
    writer.beginArray(); // stack ไม่ว่าง
    writer.get(); // ต้อง throw เพราะ stack.isEmpty() == false
  }

  @Test
  public void testGetAfterClose_StackHasSentinel_Throws() throws IOException {
    writer.close(); // stack เดิมว่าง -> close สำเร็จแต่ push SENTINEL_CLOSED เข้าไป
    try {
      writer.get();
      fail("Expected IllegalStateException because stack contains SENTINEL_CLOSED");
    } catch (IllegalStateException expected) {
      // ตามพฤติกรรมจริงของซอร์ส: stack ไม่ว่างหลัง close()
    }
  }

  // ---------- put() via value() : pendingName == null, stack empty ----------

  @Test
  public void testPut_TopLevelValue_NoPendingName_EmptyStack() throws IOException {
    writer.value("hello");
    JsonElement result = writer.get();
    assertTrue(result.isJsonPrimitive());
    assertEquals("hello", result.getAsString());
  }

  // ---------- put() : pendingName != null, value ไม่เป็น null -> add เข้า object ----------

  @Test
  public void testPut_PendingName_NonNullValue_AddedToObject() throws IOException {
    writer.beginObject();
    writer.name("key");
    writer.value("val");
    writer.endObject();
    JsonElement result = writer.get();
    assertTrue(result.isJsonObject());
    JsonObject obj = result.getAsJsonObject();
    assertEquals("val", obj.get("key").getAsString());
  }

  // ---------- put() : pendingName != null, value เป็น null, serializeNulls=false(default) -> ไม่ add ----------

  @Test
  public void testPut_PendingName_NullValue_SerializeNullsFalse_NotAdded() throws IOException {
    writer.beginObject();
    writer.name("key");
    writer.nullValue(); // value เป็น JsonNull, getSerializeNulls() == false (default)
    writer.endObject();
    JsonElement result = writer.get();
    assertTrue(result.isJsonObject());
    assertFalse(result.getAsJsonObject().has("key"));
  }

  // ---------- put() : pendingName != null, value เป็น null, serializeNulls=true -> add ----------

  @Test
  public void testPut_PendingName_NullValue_SerializeNullsTrue_Added() throws IOException {
    writer.setSerializeNulls(true);
    writer.beginObject();
    writer.name("key");
    writer.nullValue();
    writer.endObject();
    JsonElement result = writer.get();
    assertTrue(result.isJsonObject());
    assertTrue(result.getAsJsonObject().has("key"));
    assertTrue(result.getAsJsonObject().get("key").isJsonNull());
  }

  // ---------- put() : pendingName == null, stack ไม่ว่าง, top เป็น JsonArray -> add เข้า array ----------

  @Test
  public void testPut_StackNotEmpty_TopIsArray_AddedToArray() throws IOException {
    writer.beginArray();
    writer.value(1);
    writer.value(2);
    writer.endArray();
    JsonElement result = writer.get();
    assertTrue(result.isJsonArray());
    JsonArray arr = result.getAsJsonArray();
    assertEquals(2, arr.size());
    assertEquals(1, arr.get(0).getAsInt());
  }

  // ---------- put() : pendingName == null, stack ไม่ว่าง, top ไม่เป็น JsonArray -> throw ----------

  @Test(expected = IllegalStateException.class)
  public void testPut_StackNotEmpty_TopIsObjectWithoutName_Throws() throws IOException {
    writer.beginObject();
    writer.value("x"); // ไม่ได้เรียก name() ก่อน -> pendingName == null, top เป็น JsonObject
  }

  // ---------- beginArray() / nested ----------

  @Test
  public void testBeginArray_NestedArrayInArray() throws IOException {
    writer.beginArray();
    writer.beginArray();
    writer.value(1);
    writer.endArray();
    writer.endArray();
    JsonElement result = writer.get();
    assertTrue(result.isJsonArray());
    JsonArray outer = result.getAsJsonArray();
    assertTrue(outer.get(0).isJsonArray());
  }

  // ---------- endArray() ----------

  @Test(expected = IllegalStateException.class)
  public void testEndArray_EmptyStack_Throws() throws IOException {
    writer.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndArray_PendingNameNotNull_Throws() throws IOException {
    writer.beginObject();
    writer.name("a");
    writer.endArray(); // pendingName != null -> throw ก่อนตรวจ element
  }

  @Test(expected = IllegalStateException.class)
  public void testEndArray_TopNotArray_Throws() throws IOException {
    writer.beginObject();
    writer.endArray(); // top เป็น JsonObject ไม่ใช่ JsonArray
  }

  @Test
  public void testEndArray_Success_PopsStack() throws IOException {
    writer.beginArray();
    writer.endArray();
    JsonElement result = writer.get(); // stack ว่างแล้ว ต้องไม่ throw
    assertTrue(result.isJsonArray());
  }

  // ---------- beginObject() / nested ----------

  @Test
  public void testBeginObject_NestedObjectInArray() throws IOException {
    writer.beginArray();
    writer.beginObject();
    writer.name("k");
    writer.value("v");
    writer.endObject();
    writer.endArray();
    JsonElement result = writer.get();
    assertTrue(result.isJsonArray());
    assertTrue(result.getAsJsonArray().get(0).isJsonObject());
  }

  // ---------- endObject() ----------

  @Test(expected = IllegalStateException.class)
  public void testEndObject_EmptyStack_Throws() throws IOException {
    writer.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndObject_PendingNameNotNull_Throws() throws IOException {
    writer.beginObject();
    writer.name("a");
    writer.endObject(); // pendingName != null -> throw
  }

  @Test(expected = IllegalStateException.class)
  public void testEndObject_TopNotObject_Throws() throws IOException {
    writer.beginArray();
    writer.endObject(); // top เป็น JsonArray ไม่ใช่ JsonObject
  }

  @Test
  public void testEndObject_Success_PopsStack() throws IOException {
    writer.beginObject();
    writer.endObject();
    JsonElement result = writer.get();
    assertTrue(result.isJsonObject());
  }

  // ---------- name() ----------

  @Test(expected = IllegalStateException.class)
  public void testName_EmptyStack_Throws() throws IOException {
    writer.name("a");
  }

  @Test(expected = IllegalStateException.class)
  public void testName_PendingNameAlreadySet_Throws() throws IOException {
    writer.beginObject();
    writer.name("a");
    writer.name("b"); // pendingName != null -> throw
  }

  @Test(expected = IllegalStateException.class)
  public void testName_TopNotObject_Throws() throws IOException {
    writer.beginArray();
    writer.name("a"); // top เป็น JsonArray ไม่ใช่ JsonObject
  }

  @Test
  public void testName_Success_SetsPendingName() throws IOException {
    writer.beginObject();
    writer.name("a");
    writer.value("val");
    writer.endObject();
    JsonElement result = writer.get();
    assertEquals("val", result.getAsJsonObject().get("a").getAsString());
  }

  // ---------- value(String) ----------

  @Test
  public void testValueString_Null_DelegatesToNullValue() throws IOException {
    writer.beginObject();
    writer.name("k");
    writer.value((String) null); // value == null -> nullValue()
    writer.endObject();
    JsonElement result = writer.get();
    // default serializeNulls=false -> key ไม่ถูก add
    assertFalse(result.getAsJsonObject().has("k"));
  }

  @Test
  public void testValueString_NonNull() throws IOException {
    writer.value("abc");
    assertEquals("abc", writer.get().getAsString());
  }

  // ---------- nullValue() ----------

  @Test
  public void testNullValue_TopLevel() throws IOException {
    writer.nullValue();
    assertTrue(writer.get().isJsonNull());
  }

  // ---------- value(boolean) ----------

  @Test
  public void testValueBoolean() throws IOException {
    writer.value(true);
    JsonElement result = writer.get();
    assertTrue(result.isJsonPrimitive());
    assertTrue(result.getAsBoolean());
  }

  // ---------- value(double) ----------

  @Test(expected = IllegalArgumentException.class)
  public void testValueDouble_NotLenient_NaN_Throws() throws IOException {
    writer.value(Double.NaN); // isLenient()==false (default) และเป็น NaN
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueDouble_NotLenient_Infinite_Throws() throws IOException {
    writer.value(Double.POSITIVE_INFINITY);
  }

  @Test
  public void testValueDouble_Lenient_NaN_NoThrow() throws IOException {
    writer.setLenient(true);
    writer.value(Double.NaN); // isLenient()==true -> ข้ามการเช็ค ไม่ throw
    JsonElement result = writer.get();
    assertTrue(result.isJsonPrimitive());
  }

  @Test
  public void testValueDouble_Normal() throws IOException {
    writer.value(3.14);
    JsonElement result = writer.get();
    assertEquals(3.14, result.getAsDouble(), 0.0001);
  }

  // ---------- value(long) ----------

  @Test
  public void testValueLong() throws IOException {
    writer.value(100L);
    JsonElement result = writer.get();
    assertEquals(100L, result.getAsLong());
  }

  // ---------- value(Number) ----------

  @Test
  public void testValueNumber_Null_DelegatesToNullValue() throws IOException {
    writer.value((Number) null);
    assertTrue(writer.get().isJsonNull());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueNumber_NotLenient_NaN_Throws() throws IOException {
    writer.value(Double.valueOf(Double.NaN)); // isLenient()==false, d เป็น NaN
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueNumber_NotLenient_Infinite_Throws() throws IOException {
    writer.value(Double.valueOf(Double.POSITIVE_INFINITY));
  }

  @Test
  public void testValueNumber_Lenient_NaN_NoThrow() throws IOException {
    writer.setLenient(true);
    writer.value(Double.valueOf(Double.NaN)); // isLenient()==true -> ข้ามเช็ค
    JsonElement result = writer.get();
    assertTrue(result.isJsonPrimitive());
  }

  @Test
  public void testValueNumber_Normal() throws IOException {
    writer.value(Integer.valueOf(5)); // isLenient()==false, d=5.0 ไม่ใช่ NaN/Infinite
    JsonElement result = writer.get();
    assertEquals(5, result.getAsInt());
  }

  // ---------- flush() ----------

  @Test
  public void testFlush_NoOp_NoException() throws IOException {
    writer.flush(); // ไม่ทำอะไร ไม่ throw
  }

  // ---------- close() ----------

  @Test
  public void testClose_EmptyStack_Success() throws IOException {
    writer.close(); // stack ว่าง -> สำเร็จ, push SENTINEL_CLOSED
    // ตรวจสอบผลข้างเคียงผ่าน get() (ดู test testGetAfterClose_...)
  }

  @Test(expected = IOException.class)
  public void testClose_NonEmptyStack_Throws() throws IOException {
    writer.beginArray(); // stack ไม่ว่าง
    writer.close(); // ต้อง throw IOException("Incomplete document")
  }

  @Test(expected = IOException.class)
  public void testClose_CalledTwice_SecondCallThrows() throws IOException {
    // พฤติกรรมจริงจากซอร์ส: หลัง close() ครั้งแรก stack จะมี SENTINEL_CLOSED
    // ทำให้ !stack.isEmpty() เป็น true และ close() ครั้งที่สอง throw IOException
    // (อาจถือเป็น fault/edge-case ของ implementation)
    writer.close();
    writer.close();
  }

  @Test(expected = IllegalStateException.class)
  public void testOperationAfterClose_Throws() throws IOException {
    writer.close();
    // หลัง close, stack มี SENTINEL_CLOSED (JsonPrimitive) ซึ่งไม่ใช่ JsonArray
    // การเรียก beginArray() จะไป put(array) แล้วพบ top ไม่ใช่ JsonArray -> throw
    writer.beginArray();
  }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testGet_DefaultProduct_IsJsonNull` | `get()`: `stack.isEmpty()==true` |
| `testGet_NonEmptyStack_Throws` | `get()`: `!stack.isEmpty()==true` → throw |
| `testGetAfterClose_StackHasSentinel_Throws` | `get()` หลัง `close()` (สถานะ sentinel) |
| `testPut_TopLevelValue_NoPendingName_EmptyStack` | `put()`: `pendingName==null && stack.isEmpty()==true` |
| `testPut_PendingName_NonNullValue_AddedToObject` | `put()`: `pendingName!=null`, `!value.isJsonNull()==true` |
| `testPut_PendingName_NullValue_SerializeNullsFalse_NotAdded` | `put()`: `pendingName!=null`, `value.isJsonNull()==true`, `getSerializeNulls()==false` |
| `testPut_PendingName_NullValue_SerializeNullsTrue_Added` | `put()`: same แต่ `getSerializeNulls()==true` |
| `testPut_StackNotEmpty_TopIsArray_AddedToArray` | `put()`: `pendingName==null`, `stack.isEmpty()==false`, `element instanceof JsonArray==true` |
| `testPut_StackNotEmpty_TopIsObjectWithoutName_Throws` | `put()`: same branch, `element instanceof JsonArray==false` → throw |
| `testBeginArray_NestedArrayInArray` | `beginArray()` เรียกซ้อน + `put()` เมื่อ stack size > 1 |
| `testEndArray_EmptyStack_Throws` | `endArray()`: `stack.isEmpty()==true` |
| `testEndArray_PendingNameNotNull_Throws` | `endArray()`: `pendingName!=null` |
| `testEndArray_TopNotArray_Throws` | `endArray()`: `element instanceof JsonArray==false` |
| `testEndArray_Success_PopsStack` | `endArray()`: `element instanceof JsonArray==true` |
| `testBeginObject_NestedObjectInArray` | `beginObject()` ซ้อนใน array |
| `testEndObject_EmptyStack_Throws` | `endObject()`: `stack.isEmpty()==true` |
| `testEndObject_PendingNameNotNull_Throws` | `endObject()`: `pendingName!=null` |
| `testEndObject_TopNotObject_Throws` | `endObject()`: `element instanceof JsonObject==false` |
| `testEndObject_Success_PopsStack` | `endObject()`: `element instanceof JsonObject==true` |
| `testName_EmptyStack_Throws` | `name()`: `stack.isEmpty()==true` |
| `testName_PendingNameAlreadySet_Throws` | `name()`: `pendingName!=null` |
| `testName_TopNotObject_Throws` | `name()`: `element instanceof JsonObject==false` |
| `testName_Success_SetsPendingName` | `name()`: `element instanceof JsonObject==true` |
| `testValueString_Null_DelegatesToNullValue` | `value(String)`: `value==null==true` |
| `testValueString_NonNull` | `value(String)`: `value==null==false` |
| `testNullValue_TopLevel` | `nullValue()` (ไม่มี branch) |
| `testValueBoolean` | `value(boolean)` (ไม่มี branch) |
| `testValueDouble_NotLenient_NaN_Throws` | `value(double)`: `!isLenient()==true && Double.isNaN==true` |
| `testValueDouble_NotLenient_Infinite_Throws` | `value(double)`: `!isLenient()==true && Double.isInfinite==true` |
| `testValueDouble_Lenient_NaN_NoThrow` | `value(double)`: `!isLenient()==false` |
| `testValueDouble_Normal` | `value(double)`: `!isLenient()==true` แต่ค่าไม่ NaN/Infinite |
| `testValueLong` | `value(long)` (ไม่มี branch) |
| `testValueNumber_Null_DelegatesToNullValue` | `value(Number)`: `value==null==true` |
| `testValueNumber_NotLenient_NaN_Throws` | `value(Number)`: `!isLenient()==true`, `Double.isNaN(d)==true` |
| `testValueNumber_NotLenient_Infinite_Throws` | `value(Number)`: `!isLenient()==true`, `Double.isInfinite(d)==true` |
| `testValueNumber_Lenient_NaN_NoThrow` | `value(Number)`: `!isLenient()==false` |
| `testValueNumber_Normal` | `value(Number)`: `!isLenient()==true`, ค่าไม่ NaN/Infinite |
| `testFlush_NoOp_NoException` | `flush()` (ไม่มี branch) |
| `testClose_EmptyStack_Success` | `close()`: `!stack.isEmpty()==false` |
| `testClose_NonEmptyStack_Throws` | `close()`: `!stack.isEmpty()==true` → throw IOException |
| `testClose_CalledTwice_SecondCallThrows` | `close()` ครั้งที่ 2 (สถานะ sentinel ทำให้ stack ไม่ว่าง) — ตรวจ fault ที่อาจซ่อนอยู่ |
| `testOperationAfterClose_Throws` | การเรียก op หลัง close ผ่าน `put()` เมื่อ top เป็น SENTINEL_CLOSED |

**หมายเหตุ:** พฤติกรรมของ `close()` เมื่อเรียกซ้ำ (throw `IOException` แทนที่จะเป็น no-op) วิเคราะห์ตรงจากซอร์สโค้ดที่ให้มา ไม่ได้เดาเพิ่มเติม — เป็นจุดที่อาจถือเป็น fault ของ implementation และมี test ครอบคลุมไว้เพื่อดักจับหากมีการแก้ไข behavior ในอนาคต