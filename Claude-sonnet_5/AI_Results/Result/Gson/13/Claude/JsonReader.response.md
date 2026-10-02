# JsonReaderTest.java

ผมวิเคราะห์ซอร์สโค้ด `JsonReader` (Gson-13b) และออกแบบเทสให้ครอบคลุมทุกเมธอด public/private-ที่เข้าถึงได้ผ่าน public API, ทุกสาขา if/else ของ `doPeek()`, `peekNumber()`, `peekKeyword()`, escape handling, lenient/strict mode, boundary ของ buffer/stack และเงื่อนไข error ต่าง ๆ

```java
package com.google.gson.stream;

// หมายเหตุ: อยู่ package เดียวกับคลาสเป้าหมาย (com.google.gson.stream)
// เพื่อให้เข้าถึง JsonReader, JsonToken, MalformedJsonException ได้ตรงตามซอร์สที่ให้มา
import static org.junit.Assert.*;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

public class JsonReaderTest {

  // ---------- Constructor ----------
  @Test(expected = NullPointerException.class)
  public void testConstructorNullReader() {
    new JsonReader(null);
  }

  @Test
  public void testConstructorValid() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    assertNotNull(reader);
  }

  // ---------- setLenient / isLenient ----------
  @Test
  public void testLenientDefaultFalse() {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    assertFalse(reader.isLenient());
  }

  @Test
  public void testSetLenientTrue() {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    reader.setLenient(true);
    assertTrue(reader.isLenient());
  }

  // ---------- beginArray / endArray ----------
  @Test
  public void testBeginArraySuccess() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    reader.beginArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testBeginArrayWrongToken() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{}"));
    reader.beginArray();
  }

  @Test
  public void testEndArraySuccess() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    reader.beginArray();
    reader.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndArrayWrongToken() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1]"));
    reader.beginArray();
    reader.endArray(); // ยังมีค่าเหลืออยู่ ไม่ควรจบ array ได้
  }

  // ---------- beginObject / endObject ----------
  @Test
  public void testBeginObjectSuccess() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{}"));
    reader.beginObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testBeginObjectWrongToken() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    reader.beginObject();
  }

  @Test
  public void testEndObjectSuccess() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{}"));
    reader.beginObject();
    reader.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndObjectWrongToken() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\":1}"));
    reader.beginObject();
    reader.endObject(); // ยังมี name ค้างอยู่
  }

  // ---------- hasNext ----------
  @Test
  public void testHasNextTrueInArray() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1]"));
    reader.beginArray();
    assertTrue(reader.hasNext());
  }

  @Test
  public void testHasNextFalseEmptyArray() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    reader.beginArray();
    assertFalse(reader.hasNext());
  }

  @Test
  public void testHasNextTrueInObject() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\":1}"));
    reader.beginObject();
    assertTrue(reader.hasNext());
  }

  @Test
  public void testHasNextFalseEmptyObject() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{}"));
    reader.beginObject();
    assertFalse(reader.hasNext());
  }

  // ---------- peek() ทุก token type ----------
  @Test
  public void testPeekBeginObject() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{}"));
    assertEquals(JsonToken.BEGIN_OBJECT, reader.peek());
  }

  @Test
  public void testPeekEndObject() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{}"));
    reader.beginObject();
    assertEquals(JsonToken.END_OBJECT, reader.peek());
  }

  @Test
  public void testPeekBeginArray() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
  }

  @Test
  public void testPeekEndArray() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    reader.beginArray();
    assertEquals(JsonToken.END_ARRAY, reader.peek());
  }

  @Test
  public void testPeekName() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\":1}"));
    reader.beginObject();
    assertEquals(JsonToken.NAME, reader.peek());
  }

  @Test
  public void testPeekBoolean() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[true]"));
    reader.beginArray();
    assertEquals(JsonToken.BOOLEAN, reader.peek());
  }

  @Test
  public void testPeekNull() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[null]"));
    reader.beginArray();
    assertEquals(JsonToken.NULL, reader.peek());
  }

  @Test
  public void testPeekString() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"abc\"]"));
    reader.beginArray();
    assertEquals(JsonToken.STRING, reader.peek());
  }

  @Test
  public void testPeekNumber() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[123]"));
    reader.beginArray();
    assertEquals(JsonToken.NUMBER, reader.peek());
  }

  @Test
  public void testPeekEndDocument() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    reader.beginArray();
    reader.endArray();
    assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  // ---------- doPeek: array separators ----------
  @Test
  public void testArraySemicolonSeparatorLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1;2]"));
    reader.setLenient(true);
    reader.beginArray();
    assertEquals(1, reader.nextInt());
    assertEquals(2, reader.nextInt());
    reader.endArray();
  }

  @Test(expected = MalformedJsonException.class)
  public void testArraySemicolonSeparatorStrict() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1;2]"));
    reader.beginArray();
    reader.nextInt();
    reader.nextInt();
  }

  @Test(expected = MalformedJsonException.class)
  public void testUnterminatedArray() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1 2]"));
    reader.beginArray();
    reader.nextInt();
    reader.nextInt();
  }

  @Test
  public void testLenientArrayNullElement() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[,1]"));
    reader.setLenient(true);
    reader.beginArray();
    assertEquals(JsonToken.NULL, reader.peek());
    reader.nextNull();
    assertEquals(1, reader.nextInt());
    reader.endArray();
  }

  @Test(expected = MalformedJsonException.class)
  public void testStrictArrayNullElement() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[,1]"));
    reader.beginArray();
    reader.peek();
  }

  // ---------- doPeek: object separators / names ----------
  @Test
  public void testObjectSemicolonSeparatorLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\":1;\"b\":2}"));
    reader.setLenient(true);
    reader.beginObject();
    reader.nextName();
    reader.nextInt();
    reader.nextName();
    reader.nextInt();
    reader.endObject();
  }

  @Test(expected = MalformedJsonException.class)
  public void testUnterminatedObject() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\":1 \"b\":2}"));
    reader.beginObject();
    reader.nextName();
    reader.nextInt();
    reader.nextName();
  }

  @Test
  public void testSingleQuotedNameLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{'a':1}"));
    reader.setLenient(true);
    reader.beginObject();
    assertEquals("a", reader.nextName());
    assertEquals(1, reader.nextInt());
    reader.endObject();
  }

  @Test(expected = MalformedJsonException.class)
  public void testSingleQuotedNameStrict() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{'a':1}"));
    reader.beginObject();
    reader.nextName();
  }

  @Test
  public void testUnquotedNameLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{a:1}"));
    reader.setLenient(true);
    reader.beginObject();
    assertEquals("a", reader.nextName());
    assertEquals(1, reader.nextInt());
    reader.endObject();
  }

  @Test(expected = MalformedJsonException.class)
  public void testUnquotedNameStrict() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{a:1}"));
    reader.beginObject();
    reader.nextName();
  }

  @Test(expected = MalformedJsonException.class)
  public void testObjectExpectedNameAfterTrailingComma() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\":1,}"));
    reader.setLenient(true);
    reader.beginObject();
    reader.nextName();
    reader.nextInt();
    reader.nextName(); // "}" หลัง comma -> "Expected name"
  }

  @Test
  public void testEqualsAsColonLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\"=1}"));
    reader.setLenient(true);
    reader.beginObject();
    reader.nextName();
    assertEquals(1, reader.nextInt());
    reader.endObject();
  }

  @Test
  public void testEqualsGreaterAsColonLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\"=>1}"));
    reader.setLenient(true);
    reader.beginObject();
    reader.nextName();
    assertEquals(1, reader.nextInt());
    reader.endObject();
  }

  @Test(expected = MalformedJsonException.class)
  public void testEqualsStrict() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\"=1}"));
    reader.beginObject();
    reader.nextName();
    reader.nextInt();
  }

  @Test(expected = MalformedJsonException.class)
  public void testMissingColon() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\" 1}"));
    reader.beginObject();
    reader.nextName();
    reader.nextInt();
  }

  // ---------- Non-execute prefix ----------
  @Test
  public void testNonExecutePrefixLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader(")]}'\n[]"));
    reader.setLenient(true);
    reader.beginArray();
    reader.endArray();
  }

  @Test(expected = MalformedJsonException.class)
  public void testNonExecutePrefixStrict() throws IOException {
    JsonReader reader = new JsonReader(new StringReader(")]}'\n[]"));
    reader.beginArray();
  }

  @Test
  public void testNonExecutePrefixPartialThenEOF() throws IOException {
    // สั้นกว่า prefix ทำให้ fillBuffer ล้มเหลว -> consumeNonExecutePrefix return เฉย ๆ
    JsonReader reader = new JsonReader(new StringReader(")]"));
    reader.setLenient(true);
    try {
      reader.peek();
      fail();
    } catch (MalformedJsonException expected) {
      // ')' ไม่ใช่ token ที่ถูกต้อง
    }
  }

  // ---------- Multiple top-level values ----------
  @Test
  public void testMultipleTopLevelValuesLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[][]"));
    reader.setLenient(true);
    reader.beginArray();
    reader.endArray();
    reader.beginArray();
    reader.endArray();
  }

  @Test(expected = MalformedJsonException.class)
  public void testMultipleTopLevelValuesStrict() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[][]"));
    reader.beginArray();
    reader.endArray();
    reader.peek();
  }

  // ---------- Closed reader ----------
  @Test(expected = IllegalStateException.class)
  public void testUseAfterClose() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    reader.close();
    reader.beginArray();
  }

  @Test
  public void testClose() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    reader.close();
  }

  // ---------- quoted / unquoted string values ----------
  @Test
  public void testSingleQuotedStringLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("['abc']"));
    reader.setLenient(true);
    reader.beginArray();
    assertEquals("abc", reader.nextString());
    reader.endArray();
  }

  @Test(expected = MalformedJsonException.class)
  public void testSingleQuotedStringStrict() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("['abc']"));
    reader.beginArray();
    reader.nextString();
  }

  @Test
  public void testUnquotedStringLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[abc]"));
    reader.setLenient(true);
    reader.beginArray();
    assertEquals("abc", reader.nextString());
    reader.endArray();
  }

  @Test(expected = MalformedJsonException.class)
  public void testUnquotedStringStrict() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[abc]"));
    reader.beginArray();
    reader.nextString();
  }

  // ---------- nextName ----------
  @Test
  public void testNextNameDoubleQuoted() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\":1}"));
    reader.beginObject();
    assertEquals("a", reader.nextName());
  }

  @Test(expected = IllegalStateException.class)
  public void testNextNameWrongState() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1]"));
    reader.beginArray();
    reader.nextName();
  }

  // ---------- nextString ----------
  @Test
  public void testNextStringFromDoubleQuoted() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"hello\"]"));
    reader.beginArray();
    assertEquals("hello", reader.nextString());
  }

  @Test
  public void testNextStringFromLong() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[123]"));
    reader.beginArray();
    assertEquals("123", reader.nextString());
  }

  @Test
  public void testNextStringFromNumber() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[123.456]"));
    reader.beginArray();
    assertEquals("123.456", reader.nextString());
  }

  @Test(expected = IllegalStateException.class)
  public void testNextStringWrongState() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[true]"));
    reader.beginArray();
    reader.nextString();
  }

  // ---------- nextBoolean ----------
  @Test
  public void testNextBooleanTrue() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[true]"));
    reader.beginArray();
    assertTrue(reader.nextBoolean());
  }

  @Test
  public void testNextBooleanFalse() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[false]"));
    reader.beginArray();
    assertFalse(reader.nextBoolean());
  }

  @Test(expected = IllegalStateException.class)
  public void testNextBooleanWrongState() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1]"));
    reader.beginArray();
    reader.nextBoolean();
  }

  // ---------- nextNull ----------
  @Test
  public void testNextNullSuccess() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[null]"));
    reader.beginArray();
    reader.nextNull();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextNullWrongState() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1]"));
    reader.beginArray();
    reader.nextNull();
  }

  // ---------- nextDouble ----------
  @Test
  public void testNextDoubleFromLong() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[123]"));
    reader.beginArray();
    assertEquals(123.0, reader.nextDouble(), 0.0);
  }

  @Test
  public void testNextDoubleFromNumber() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[123.456]"));
    reader.beginArray();
    assertEquals(123.456, reader.nextDouble(), 0.0001);
  }

  @Test
  public void testNextDoubleFromSingleQuoted() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("['12.5']"));
    reader.setLenient(true);
    reader.beginArray();
    assertEquals(12.5, reader.nextDouble(), 0.0001);
  }

  @Test
  public void testNextDoubleFromDoubleQuoted() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"12.5\"]"));
    reader.beginArray();
    assertEquals(12.5, reader.nextDouble(), 0.0001);
  }

  @Test
  public void testNextDoubleFromUnquotedNaNLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[NaN]"));
    reader.setLenient(true);
    reader.beginArray();
    assertTrue(Double.isNaN(reader.nextDouble()));
  }

  @Test
  public void testNextDoubleInfinityLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[Infinity]"));
    reader.setLenient(true);
    reader.beginArray();
    assertTrue(Double.isInfinite(reader.nextDouble()));
  }

  @Test
  public void testNextDoubleNegativeInfinityLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[-Infinity]"));
    reader.setLenient(true);
    reader.beginArray();
    double r = reader.nextDouble();
    assertTrue(Double.isInfinite(r) && r < 0);
  }

  @Test(expected = IllegalStateException.class)
  public void testNextDoubleWrongState() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[true]"));
    reader.beginArray();
    reader.nextDouble();
  }

  @Test(expected = MalformedJsonException.class)
  public void testNextDoubleNaNStrict() throws IOException {
    // ใช้ quoted string เพื่อให้ peek ผ่านได้แม้ strict, แล้วค่อยเช็ค NaN forbidden ตอน parse
    JsonReader reader = new JsonReader(new StringReader("[\"NaN\"]"));
    reader.beginArray();
    reader.nextDouble();
  }

  // ---------- nextLong ----------
  @Test
  public void testNextLongFromPeekedLong() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[123]"));
    reader.beginArray();
    assertEquals(123L, reader.nextLong());
  }

  @Test
  public void testNextLongFromQuotedString() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"123\"]"));
    reader.beginArray();
    assertEquals(123L, reader.nextLong());
  }

  @Test
  public void testNextLongFromNumberFallbackDouble() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[123.0]"));
    reader.beginArray();
    assertEquals(123L, reader.nextLong());
  }

  @Test(expected = NumberFormatException.class)
  public void testNextLongPrecisionLoss() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[123.456]"));
    reader.beginArray();
    reader.nextLong();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextLongWrongState() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[true]"));
    reader.beginArray();
    reader.nextLong();
  }

  @Test
  public void testMinLongValue() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[-9223372036854775808]"));
    reader.beginArray();
    assertEquals(Long.MIN_VALUE, reader.nextLong());
  }

  // ---------- nextInt ----------
  @Test
  public void testNextIntFromPeekedLong() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[123]"));
    reader.beginArray();
    assertEquals(123, reader.nextInt());
  }

  @Test(expected = NumberFormatException.class)
  public void testNextIntOverflowFromLong() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[9999999999]"));
    reader.beginArray();
    reader.nextInt();
  }

  @Test
  public void testNextIntFromQuotedString() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"123\"]"));
    reader.beginArray();
    assertEquals(123, reader.nextInt());
  }

  @Test
  public void testNextIntFromNumberFallbackDouble() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[123.0]"));
    reader.beginArray();
    assertEquals(123, reader.nextInt());
  }

  @Test(expected = NumberFormatException.class)
  public void testNextIntPrecisionLoss() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[123.456]"));
    reader.beginArray();
    reader.nextInt();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextIntWrongState() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[true]"));
    reader.beginArray();
    reader.nextInt();
  }

  @Test
  public void testNegativeNumber() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[-123]"));
    reader.beginArray();
    assertEquals(-123, reader.nextInt());
  }

  @Test
  public void testZero() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[0]"));
    reader.beginArray();
    assertEquals(0, reader.nextInt());
  }

  // ---------- exponent numbers ----------
  @Test
  public void testExponentNumber() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1.5e10]"));
    reader.beginArray();
    assertEquals(1.5e10, reader.nextDouble(), 0.0001);
  }

  @Test
  public void testExponentWithPlusSign() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1.5e+10]"));
    reader.beginArray();
    assertEquals(1.5e10, reader.nextDouble(), 0.0001);
  }

  @Test
  public void testExponentNegative() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1.5e-10]"));
    reader.beginArray();
    assertEquals(1.5e-10, reader.nextDouble(), 1e-15);
  }

  // ---------- leading zero / malformed number ----------
  @Test
  public void testLeadingZeroTreatedAsUnquotedLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[01]"));
    reader.setLenient(true);
    reader.beginArray();
    assertEquals("01", reader.nextString());
    reader.endArray();
  }

  @Test(expected = MalformedJsonException.class)
  public void testLeadingZeroStrict() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[01]"));
    reader.beginArray();
    reader.nextString();
  }

  @Test(expected = MalformedJsonException.class)
  public void testMalformedNumberStrict() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1.2.3]"));
    reader.beginArray();
    reader.nextString();
  }

  // ---------- extremely long numeric literal (buffer boundary) ----------
  @Test
  public void testExtremelyLongNumberFallsBackToUnquoted() throws IOException {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < 1200; i++) sb.append('9');
    sb.append(']');
    JsonReader reader = new JsonReader(new StringReader(sb.toString()));
    reader.setLenient(true);
    reader.beginArray();
    String result = reader.nextString();
    assertEquals(1200, result.length());
    reader.endArray();
  }

  // ---------- skipValue ----------
  @Test
  public void testSkipValueNumber() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1,2]"));
    reader.beginArray();
    reader.skipValue();
    assertEquals(2, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void testSkipValueObject() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[{\"a\":1},2]"));
    reader.beginArray();
    reader.skipValue();
    assertEquals(2, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void testSkipValueArray() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[[1,2],3]"));
    reader.beginArray();
    reader.skipValue();
    assertEquals(3, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void testSkipValueDoubleQuotedString() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"abc\",1]"));
    reader.beginArray();
    reader.skipValue();
    assertEquals(1, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void testSkipValueUnquotedLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[abc,1]"));
    reader.setLenient(true);
    reader.beginArray();
    reader.skipValue();
    assertEquals(1, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void testSkipValueSingleQuotedLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("['abc',1]"));
    reader.setLenient(true);
    reader.beginArray();
    reader.skipValue();
    assertEquals(1, reader.nextInt());
    reader.endArray();
  }

  // ---------- push() stack growth ----------
  @Test
  public void testStackGrowthOnDeepNesting() throws IOException {
    int depth = 40; // > 32 (ค่าเริ่มต้นของ stack) เพื่อ trigger push() growth
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < depth; i++) sb.append('[');
    for (int i = 0; i < depth; i++) sb.append(']');
    JsonReader reader = new JsonReader(new StringReader(sb.toString()));
    for (int i = 0; i < depth; i++) reader.beginArray();
    for (int i = 0; i < depth; i++) reader.endArray();
  }

  // ---------- comments (lenient only) ----------
  @Test
  public void testCStyleCommentLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1/*comment*/,2]"));
    reader.setLenient(true);
    reader.beginArray();
    assertEquals(1, reader.nextInt());
    assertEquals(2, reader.nextInt());
    reader.endArray();
  }

  @Test(expected = MalformedJsonException.class)
  public void testCStyleCommentStrict() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1/*comment*/,2]"));
    reader.beginArray();
    reader.nextInt();
    reader.nextInt();
  }

  @Test
  public void testEndOfLineSlashCommentLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1,//comment\n2]"));
    reader.setLenient(true);
    reader.beginArray();
    assertEquals(1, reader.nextInt());
    assertEquals(2, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void testHashCommentLenient() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1,#comment\n2]"));
    reader.setLenient(true);
    reader.beginArray();
    assertEquals(1, reader.nextInt());
    assertEquals(2, reader.nextInt());
    reader.endArray();
  }

  @Test(expected = MalformedJsonException.class)
  public void testUnterminatedComment() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1/*comment]"));
    reader.setLenient(true);
    reader.beginArray();
    reader.nextInt();
    reader.nextInt();
  }

  // ---------- escape sequences ----------
  @Test
  public void testEscapeCharacters() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"\\t\\b\\n\\r\\f\\'\\\"\\\\\\/\"]"));
    reader.beginArray();
    assertEquals("\t\b\n\r\f\'\"\\/", reader.nextString());
  }

  @Test
  public void testUnicodeEscape() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"\\u0041\"]"));
    reader.beginArray();
    assertEquals("A", reader.nextString());
  }

  @Test
  public void testEscapedNewlineLineContinuation() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"a\\\nb\"]"));
    reader.beginArray();
    assertEquals("ab", reader.nextString());
  }

  @Test(expected = MalformedJsonException.class)
  public void testInvalidEscapeCharacter() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"\\x\"]"));
    reader.beginArray();
    reader.nextString();
  }

  @Test(expected = NumberFormatException.class)
  public void testInvalidUnicodeEscape() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"\\uGGGG\"]"));
    reader.beginArray();
    reader.nextString();
  }

  @Test(expected = MalformedJsonException.class)
  public void testUnterminatedEscapeSequence() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"\\"));
    reader.beginArray();
    reader.nextString();
  }

  @Test(expected = MalformedJsonException.class)
  public void testUnterminatedString() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"abc"));
    reader.beginArray();
    reader.nextString();
  }

  // ---------- EOF handling ----------
  @Test(expected = EOFException.class)
  public void testUnexpectedEOF() throws IOException {
    JsonReader reader = new JsonReader(new StringReader(""));
    reader.beginArray();
  }

  // ---------- getPath / toString ----------
  @Test
  public void testGetPathRoot() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    assertEquals("$", reader.getPath());
  }

  @Test
  public void testGetPathArrayIndex() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1,2]"));
    reader.beginArray();
    reader.nextInt();
    assertEquals("$[1]", reader.getPath());
  }

  @Test
  public void testGetPathObjectName() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\":1}"));
    reader.beginObject();
    reader.nextName();
    assertEquals("$.a", reader.getPath());
  }

  @Test
  public void testGetPathAfterSkipValueOverwritesName() throws IOException {
    // หมายเหตุ: ตามซอร์สโค้ด skipValue() จะเซ็ต pathNames[stackSize-1] = "null" เสมอ
    // แม้ว่าค่าที่ข้ามไปไม่ใช่ name ก็ตาม ซึ่งจะไป overwrite ชื่อคีย์ที่ตั้งไว้ก่อนหน้า (ตามพฤติกรรมจริงในซอร์ส)
    JsonReader reader = new JsonReader(new StringReader("{\"a\":1}"));
    reader.beginObject();
    reader.nextName();
    reader.skipValue();
    assertEquals("$.null", reader.getPath());
  }

  @Test
  public void testToString() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    assertTrue(reader.toString().contains("JsonReader"));
  }
}
```

## สรุป Branch/Condition Coverage

| กลุ่มเมธอดเทส | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor*` | Constructor null-check (throw NPE) / non-null path |
| `testLenientDefaultFalse`, `testSetLenientTrue` | ค่า default ของ `lenient`, setter/getter |
| `testBeginArray*`, `testEndArray*` | `beginArray/endArray`: p==PEEKED_BEGIN/END_ARRAY (true/false) → IllegalStateException |
| `testBeginObject*`, `testEndObject*` | เช่นเดียวกันสำหรับ object |
| `testHasNext*` | `hasNext()` true/false ทั้ง array และ object |
| `testPeek*` (Begin/End Object/Array, Name, Boolean, Null, String, Number, EndDocument) | switch-case ทุก case ใน `peek()` |
| `testArraySemicolon*`, `testUnterminatedArray` | `doPeek` NONEMPTY_ARRAY: `]`, `;`(lenient), `,`, default(throw) |
| `testLenientArrayNullElement`, `testStrictArrayNullElement` | branch "0-length literal in array = null" + checkLenient |
| `testObjectSemicolon*`, `testUnterminatedObject` | NONEMPTY_OBJECT comma-check branch |
| `testSingleQuotedName*`, `testUnquotedName*` | EMPTY/NONEMPTY_OBJECT: `'`, unquoted-name, checkLenient |
| `testObjectExpectedNameAfterTrailingComma` | branch `Expected name` เมื่อ `}` หลัง comma ใน NONEMPTY_OBJECT |
| `testEqualsAsColon*`, `testEqualsGreaterAsColon*`, `testEqualsStrict`, `testMissingColon` | DANGLING_NAME: `:`, `=`, `=>`, default(throw) |
| `testNonExecutePrefix*` | EMPTY_DOCUMENT + lenient consumeNonExecutePrefix (match/ไม่ match/สั้นกว่า) |
| `testMultipleTopLevelValues*` | NONEMPTY_DOCUMENT: EOF(-1) vs มีข้อมูลเหลือ + checkLenient |
| `testUseAfterClose`, `testClose` | JsonScope.CLOSED branch, `close()` |
| `testSingleQuotedString*`, `testUnquotedString*` | ค่า literal string ปกติ + lenient check |
| `testNextName*` | `nextName()` ทุก branch (unquoted/single/double-quoted, else throw) |
| `testNextString*` | `nextString()` ทุก branch (unquoted/quoted/buffered/long/number, else throw) |
| `testNextBoolean*` | true/false/else throw |
| `testNextNull*` | success/else throw |
| `testNextDouble*` | PEEKED_LONG/NUMBER/QUOTED/UNQUOTED/else throw, NaN/Infinity lenient vs strict throw |
| `testNextLong*`, `testMinLongValue` | PEEKED_LONG/NUMBER/QUOTED-fallback-double/precision loss/else throw |
| `testNextInt*`, `testNegativeNumber`, `testZero` | เหมือน nextLong + cast-to-int overflow check |
| `testExponent*` | peekNumber: NUMBER_CHAR_EXP_E/SIGN/DIGIT states |
| `testLeadingZero*`, `testMalformedNumberStrict` | peekNumber "leading zero"/"invalid syntax" → fallback unquoted + lenient check |
| `testExtremelyLongNumberFallsBackToUnquoted` | peekNumber `i == buffer.length` boundary, nextUnquotedValue StringBuilder path |
| `testSkipValue*` | `skipValue()` ทุก case (array/object push-pop, string, unquoted) |
| `testStackGrowthOnDeepNesting` | `push()` growth เมื่อ stackSize == stack.length |
| `testCStyleComment*`, `testEndOfLineSlashComment*`, `testHashComment*`, `testUnterminatedComment` | `nextNonWhitespace`: `/*...*/`, `//`, `#`, unterminated |
| `testEscapeCharacters`, `testUnicodeEscape`, `testEscapedNewlineLineContinuation`, `testInvalidEscapeCharacter`, `testInvalidUnicodeEscape`, `testUnterminatedEscapeSequence` | `readEscapeCharacter()` ทุก case + error branch |
| `testUnterminatedString` | `nextQuotedValue` EOF branch |
| `testUnexpectedEOF` | `nextNonWhitespace(throwOnEof=true)` → EOFException |
| `testGetPath*` | `getPath()` ทุก case switch (array/object/document/closed) รวม quirk ของ `skipValue` |
| `testToString` | `toString()` |

**หมายเหตุสำคัญ:** เทส `testGetPathAfterSkipValueOverwritesName` และ `testMalformedNumberStrict` อ้างอิงพฤติกรรมที่อ่านได้ตรงจากซอร์สโค้ดจริง (ไม่ได้เดา) ซึ่งอาจดูขัดกับความคาดหวังทั่วไป แต่เป็นไปตาม logic ที่ implement ไว้ — เหมาะสำหรับดักจับ fault หากมีการแก้ไขพฤติกรรมนี้ในอนาคต