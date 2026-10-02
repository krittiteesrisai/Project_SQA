package com.google.gson.stream;

import static org.junit.Assert.*;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

/**
 * Unit tests for {@link JsonReader} (Gson-7b, Defects4J).
 * Focus: branch coverage ของ if/else, loop, switch-case ทุกจุดที่วิเคราะห์ได้จาก source
 * และดักจับ fault ที่อาจเกิดจาก edge-case เช่น buffer boundary, precision loss,
 * lenient/strict mode, malformed JSON เป็นต้น
 */
public class JsonReaderTest {

  private JsonReader newReader(String json) {
    return new JsonReader(new StringReader(json));
  }

  // ---------------- Constructor ----------------

  @Test(expected = NullPointerException.class)
  public void constructor_nullReader_throwsNPE() {
    new JsonReader(null);
  }

  // ---------------- setLenient / isLenient ----------------

  @Test
  public void lenient_defaultFalse_andSetterWorks() {
    JsonReader reader = newReader("[]");
    assertFalse(reader.isLenient());
    reader.setLenient(true);
    assertTrue(reader.isLenient());
  }

  // ---------------- beginArray / endArray ----------------

  @Test
  public void beginArray_endArray_empty() throws IOException {
    JsonReader reader = newReader("[]");
    reader.beginArray();
    assertFalse(reader.hasNext());
    reader.endArray();
  }

  @Test
  public void beginArray_wrongToken_throwsIllegalState() throws IOException {
    JsonReader reader = newReader("{}");
    try {
      reader.beginArray();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
    }
  }

  @Test
  public void endArray_wrongToken_throwsIllegalState() throws IOException {
    JsonReader reader = newReader("[1]");
    reader.beginArray();
    try {
      reader.endArray();
      fail();
    } catch (IllegalStateException expected) {
    }
  }

  // ---------------- beginObject / endObject ----------------

  @Test
  public void beginObject_endObject_empty() throws IOException {
    JsonReader reader = newReader("{}");
    reader.beginObject();
    assertFalse(reader.hasNext());
    reader.endObject();
  }

  @Test
  public void beginObject_wrongToken_throwsIllegalState() throws IOException {
    JsonReader reader = newReader("[]");
    try {
      reader.beginObject();
      fail();
    } catch (IllegalStateException expected) {
    }
  }

  @Test
  public void endObject_wrongToken_throwsIllegalState() throws IOException {
    JsonReader reader = newReader("{\"a\":1}");
    reader.beginObject();
    reader.nextName();
    reader.nextInt();
    try {
      reader.endObject();
      fail();
    } catch (IllegalStateException expected) {
    }
  }

  // ---------------- hasNext ----------------

  @Test
  public void hasNext_trueForValue_falseForEndArray() throws IOException {
    JsonReader reader = newReader("[1]");
    reader.beginArray();
    assertTrue(reader.hasNext());
    reader.nextInt();
    assertFalse(reader.hasNext());
    reader.endArray();
  }

  // ---------------- peek() ทุก JsonToken ----------------

  @Test
  public void peek_allTokenTypes() throws IOException {
    JsonReader reader = newReader("{\"a\":[true,false,null,\"s\",1,1.5]}");
    assertEquals(JsonToken.BEGIN_OBJECT, reader.peek());
    reader.beginObject();
    assertEquals(JsonToken.NAME, reader.peek());
    reader.nextName();
    assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
    reader.beginArray();
    assertEquals(JsonToken.BOOLEAN, reader.peek());
    assertTrue(reader.nextBoolean());
    assertEquals(JsonToken.BOOLEAN, reader.peek());
    assertFalse(reader.nextBoolean());
    assertEquals(JsonToken.NULL, reader.peek());
    reader.nextNull();
    assertEquals(JsonToken.STRING, reader.peek());
    reader.nextString();
    assertEquals(JsonToken.NUMBER, reader.peek());
    reader.nextLong();
    assertEquals(JsonToken.NUMBER, reader.peek());
    reader.nextDouble();
    reader.endArray();
    reader.endObject();
    assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void peek_endArray() throws IOException {
    JsonReader reader = newReader("[]");
    reader.beginArray();
    assertEquals(JsonToken.END_ARRAY, reader.peek());
    reader.endArray();
  }

  @Test
  public void peek_afterClose_throwsIllegalState() throws IOException {
    JsonReader reader = newReader("[1]");
    reader.close();
    try {
      reader.peek();
      fail();
    } catch (IllegalStateException expected) {
    }
  }

  // ---------------- doPeek: array separators ----------------

  @Test
  public void doPeek_nonEmptyArray_comma() throws IOException {
    JsonReader reader = newReader("[1,2,3]");
    reader.beginArray();
    assertEquals(1, reader.nextInt());
    assertEquals(2, reader.nextInt());
    assertEquals(3, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void doPeek_nonEmptyArray_semicolonLenient() throws IOException {
    JsonReader reader = newReader("[1;2]");
    reader.setLenient(true);
    reader.beginArray();
    assertEquals(1, reader.nextInt());
    assertEquals(2, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void doPeek_nonEmptyArray_semicolonStrict_throws() throws IOException {
    JsonReader reader = newReader("[1;2]");
    reader.beginArray();
    reader.nextInt();
    try {
      reader.nextInt();
      fail();
    } catch (MalformedJsonException expected) {
    }
  }

  @Test
  public void doPeek_unterminatedArray_throws() throws IOException {
    JsonReader reader = newReader("[1 2]");
    reader.beginArray();
    reader.nextInt();
    try {
      reader.nextInt();
      fail();
    } catch (MalformedJsonException expected) {
    }
  }

  // ---------------- doPeek: object separators / names ----------------

  @Test
  public void doPeek_nonEmptyObject_comma() throws IOException {
    JsonReader reader = newReader("{\"a\":1,\"b\":2}");
    reader.beginObject();
    assertEquals("a", reader.nextName());
    reader.nextInt();
    assertEquals("b", reader.nextName());
    reader.nextInt();
    reader.endObject();
  }

  @Test
  public void doPeek_nonEmptyObject_semicolonLenient() throws IOException {
    JsonReader reader = newReader("{\"a\":1;\"b\":2}");
    reader.setLenient(true);
    reader.beginObject();
    reader.nextName();
    reader.nextInt();
    reader.nextName();
    reader.nextInt();
    reader.endObject();
  }

  @Test
  public void doPeek_unterminatedObject_throws() throws IOException {
    JsonReader reader = newReader("{\"a\":1 \"b\":2}");
    reader.beginObject();
    reader.nextName();
    reader.nextInt();
    try {
      reader.nextName();
      fail();
    } catch (MalformedJsonException expected) {
    }
  }

  @Test
  public void nextName_singleQuotedLenient() throws IOException {
    JsonReader reader = newReader("{'a':1}");
    reader.setLenient(true);
    reader.beginObject();
    assertEquals("a", reader.nextName());
    reader.nextInt();
    reader.endObject();
  }

  @Test
  public void nextName_singleQuotedStrict_throws() throws IOException {
    JsonReader reader = newReader("{'a':1}");
    reader.beginObject();
    try {
      reader.nextName();
      fail();
    } catch (MalformedJsonException expected) {
    }
  }

  @Test
  public void nextName_unquotedLenient() throws IOException {
    JsonReader reader = newReader("{a:1}");
    reader.setLenient(true);
    reader.beginObject();
    assertEquals("a", reader.nextName());
    reader.nextInt();
    reader.endObject();
  }

  @Test
  public void doPeek_objectExpectedNameButFoundNonLiteral_throws() throws IOException {
    JsonReader reader = newReader("{:1}");
    reader.setLenient(true);
    reader.beginObject();
    try {
      reader.nextName();
      fail();
    } catch (MalformedJsonException expected) {
    }
  }

  @Test
  public void doPeek_trailingCommaInObject_expectedName_throws() throws IOException {
    JsonReader reader = newReader("{\"a\":1,}");
    reader.setLenient(true);
    reader.beginObject();
    reader.nextName();
    reader.nextInt();
    try {
      reader.nextName();
      fail();
    } catch (MalformedJsonException expected) {
    }
  }

  @Test(expected = IllegalStateException.class)
  public void nextName_wrongType_throwsIllegalState() throws IOException {
    JsonReader reader = newReader("[1]");
    reader.beginArray();
    reader.nextName();
  }

  // ---------------- doPeek: DANGLING_NAME (colon/=/=>/error) ----------------

  @Test
  public void doPeek_danglingName_colon() throws IOException {
    JsonReader reader = newReader("{\"a\":1}");
    reader.beginObject();
    reader.nextName();
    assertEquals(1, reader.nextInt());
    reader.endObject();
  }

  @Test
  public void doPeek_danglingName_equalsLenient() throws IOException {
    JsonReader reader = newReader("{\"a\"=1}");
    reader.setLenient(true);
    reader.beginObject();
    reader.nextName();
    assertEquals(1, reader.nextInt());
    reader.endObject();
  }

  @Test
  public void doPeek_danglingName_equalsArrowLenient() throws IOException {
    JsonReader reader = newReader("{\"a\"=>1}");
    reader.setLenient(true);
    reader.beginObject();
    reader.nextName();
    assertEquals(1, reader.nextInt());
    reader.endObject();
  }

  @Test
  public void doPeek_danglingName_equalsStrict_throws() throws IOException {
    JsonReader reader = newReader("{\"a\"=1}");
    reader.beginObject();
    reader.nextName();
    try {
      reader.nextInt();
      fail();
    } catch (MalformedJsonException expected) {
    }
  }

  @Test
  public void doPeek_danglingName_unexpectedChar_throws() throws IOException {
    JsonReader reader = newReader("{\"a\" 1}");
    reader.beginObject();
    reader.nextName();
    try {
      reader.nextInt();
      fail();
    } catch (MalformedJsonException expected) {
    }
  }

  // ---------------- EMPTY_DOCUMENT / non-execute prefix ----------------

  @Test
  public void nonExecutePrefix_lenient_consumed() throws IOException {
    JsonReader reader = newReader(")]}'\n[1]");
    reader.setLenient(true);
    reader.beginArray();
    assertEquals(1, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void nonExecutePrefix_strict_throws() throws IOException {
    JsonReader reader = newReader(")]}'\n[1]");
    try {
      reader.beginArray();
      fail();
    } catch (MalformedJsonException expected) {
    }
  }

  // ---------------- NONEMPTY_DOCUMENT: multiple top-level values ----------------

  @Test
  public void multipleTopLevelValues_lenient() throws IOException {
    JsonReader reader = newReader("[1][2]");
    reader.setLenient(true);
    reader.beginArray();
    reader.nextInt();
    reader.endArray();
    reader.beginArray();
    reader.nextInt();
    reader.endArray();
  }

  @Test
  public void multipleTopLevelValues_strict_throws() throws IOException {
    JsonReader reader = newReader("[1][2]");
    reader.beginArray();
    reader.nextInt();
    reader.endArray();
    try {
      reader.peek();
      fail();
    } catch (MalformedJsonException expected) {
    }
  }

  @Test
  public void endDocument_afterFullyConsumedArray() throws IOException {
    JsonReader reader = newReader("[1]");
    reader.beginArray();
    reader.nextInt();
    reader.endArray();
    assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  // top-level scalar: source ไม่มี strict-check พิเศษสำหรับค่า scalar top-level
  @Test
  public void topLevelScalarValue_parsedRegardlessOfLenient() throws IOException {
    JsonReader reader = newReader("1");
    assertEquals(1, reader.nextInt());
  }

  // ---------------- nextString ----------------

  @Test
  public void nextString_quotedDouble() throws IOException {
    JsonReader reader = newReader("\"hello\"");
    assertEquals("hello", reader.nextString());
  }

  @Test
  public void nextString_quotedSingleLenient() throws IOException {
    JsonReader reader = newReader("'hello'");
    reader.setLenient(true);
    assertEquals("hello", reader.nextString());
  }

  @Test
  public void nextString_unquotedLenient() throws IOException {
    JsonReader reader = newReader("hello");
    reader.setLenient(true);
    assertEquals("hello", reader.nextString());
  }

  @Test
  public void nextString_fromLongNumber() throws IOException {
    JsonReader reader = newReader("123");
    assertEquals("123", reader.nextString());
  }

  @Test
  public void nextString_fromDecimalNumber() throws IOException {
    JsonReader reader = newReader("1.5");
    assertEquals("1.5", reader.nextString());
  }

  @Test(expected = IllegalStateException.class)
  public void nextString_wrongType_throwsIllegalState() throws IOException {
    JsonReader reader = newReader("true");
    reader.nextString();
  }

  // ---------------- nextBoolean ----------------

  @Test
  public void nextBoolean_trueFalse() throws IOException {
    JsonReader reader = newReader("[true,false]");
    reader.beginArray();
    assertTrue(reader.nextBoolean());
    assertFalse(reader.nextBoolean());
    reader.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void nextBoolean_wrongType_throws() throws IOException {
    JsonReader reader = newReader("1");
    reader.nextBoolean();
  }

  // ---------------- nextNull ----------------

  @Test
  public void nextNull_consumesNull() throws IOException {
    JsonReader reader = newReader("null");
    reader.nextNull();
  }

  @Test(expected = IllegalStateException.class)
  public void nextNull_wrongType_throws() throws IOException {
    JsonReader reader = newReader("1");
    reader.nextNull();
  }

  // ---------------- nextDouble ----------------

  @Test
  public void nextDouble_fromLong() throws IOException {
    JsonReader reader = newReader("5");
    assertEquals(5.0, reader.nextDouble(), 0.0);
  }

  @Test
  public void nextDouble_fromNumberLiteral() throws IOException {
    JsonReader reader = newReader("5.5");
    assertEquals(5.5, reader.nextDouble(), 0.0);
  }

  @Test
  public void nextDouble_fromQuotedString() throws IOException {
    JsonReader reader = newReader("\"5.5\"");
    assertEquals(5.5, reader.nextDouble(), 0.0);
  }

  @Test
  public void nextDouble_NaNFromQuotedString_strict_throws() throws IOException {
    JsonReader reader = newReader("\"NaN\"");
    try {
      reader.nextDouble();
      fail();
    } catch (MalformedJsonException expected) {
    }
  }

  @Test
  public void nextDouble_InfinityFromQuotedString_lenientAllowed() throws IOException {
    JsonReader reader = newReader("\"Infinity\"");
    reader.setLenient(true);
    assertTrue(Double.isInfinite(reader.nextDouble()));
  }

  @Test(expected = IllegalStateException.class)
  public void nextDouble_wrongType_throws() throws IOException {
    JsonReader reader = newReader("true");
    reader.nextDouble();
  }

  // ---------------- nextLong ----------------

  @Test
  public void nextLong_fromLongLiteral() throws IOException {
    JsonReader reader = newReader("123456789012345");
    assertEquals(123456789012345L, reader.nextLong());
  }

  @Test
  public void nextLong_fromQuotedStringParsable() throws IOException {
    JsonReader reader = newReader("\"123\"");
    assertEquals(123L, reader.nextLong());
  }

  @Test
  public void nextLong_fromQuotedStringFallbackToDouble() throws IOException {
    JsonReader reader = newReader("\"1.0\"");
    assertEquals(1L, reader.nextLong());
  }

  @Test(expected = NumberFormatException.class)
  public void nextLong_precisionLoss_throws() throws IOException {
    JsonReader reader = newReader("\"1.5\"");
    reader.nextLong();
  }

  @Test(expected = IllegalStateException.class)
  public void nextLong_wrongType_throws() throws IOException {
    JsonReader reader = newReader("true");
    reader.nextLong();
  }

  @Test
  public void nextLong_fromDecimalNumberLiteral() throws IOException {
    JsonReader reader = newReader("2.0");
    assertEquals(2L, reader.nextLong());
  }

  @Test
  public void longMinValue_parsedCorrectly() throws IOException {
    JsonReader reader = newReader(Long.toString(Long.MIN_VALUE));
    assertEquals(Long.MIN_VALUE, reader.nextLong());
  }

  @Test
  public void longMaxValue_parsedCorrectly() throws IOException {
    JsonReader reader = newReader(Long.toString(Long.MAX_VALUE));
    assertEquals(Long.MAX_VALUE, reader.nextLong());
  }

  // ---------------- nextInt ----------------

  @Test
  public void nextInt_fromLongLiteral() throws IOException {
    JsonReader reader = newReader("42");
    assertEquals(42, reader.nextInt());
  }

  @Test(expected = NumberFormatException.class)
  public void nextInt_precisionLossFromLong_throws() throws IOException {
    JsonReader reader = newReader("123456789012345");
    reader.nextInt();
  }

  @Test
  public void nextInt_fromQuotedStringParsable() throws IOException {
    JsonReader reader = newReader("\"42\"");
    assertEquals(42, reader.nextInt());
  }

  @Test
  public void nextInt_fromQuotedStringFallbackToDouble() throws IOException {
    JsonReader reader = newReader("\"42.0\"");
    assertEquals(42, reader.nextInt());
  }

  @Test(expected = NumberFormatException.class)
  public void nextInt_precisionLossFromDouble_throws() throws IOException {
    JsonReader reader = newReader("\"42.5\"");
    reader.nextInt();
  }

  @Test(expected = IllegalStateException.class)
  public void nextInt_wrongType_throws() throws IOException {
    JsonReader reader = newReader("true");
    reader.nextInt();
  }

  @Test
  public void nextInt_fromNumberLiteralDecimal() throws IOException {
    JsonReader reader = newReader("3.0");
    assertEquals(3, reader.nextInt());
  }

  @Test
  public void negativeNumber() throws IOException {
    JsonReader reader = newReader("-42");
    assertEquals(-42, reader.nextInt());
  }

  @Test
  public void exponentNumber() throws IOException {
    JsonReader reader = newReader("1.5e2");
    assertEquals(150.0, reader.nextDouble(), 0.0);
  }

  @Test
  public void exponentNumberWithSign() throws IOException {
    JsonReader reader = newReader("1.5e+2");
    assertEquals(150.0, reader.nextDouble(), 0.0);
  }

  @Test
  public void exponentNumberNegative() throws IOException {
    JsonReader reader = newReader("1.5e-2");
    assertEquals(0.015, reader.nextDouble(), 0.0001);
  }

  @Test
  public void veryLargeNumber_parsedAsDouble() throws IOException {
    JsonReader reader = newReader("123456789012345678901234567890");
    double d = reader.nextDouble();
    assertTrue(d > 0);
  }

  // leading-zero: peekNumber ปฏิเสธ -> ตกไปเป็น unquoted literal
  @Test
  public void numberWithLeadingZero_treatedAsUnquotedLenient() throws IOException {
    JsonReader reader = newReader("01");
    reader.setLenient(true);
    assertEquals("01", reader.nextString());
  }

  @Test
  public void numberWithLeadingZero_strict_throwsBecauseUnquotedNeedsLenient() throws IOException {
    JsonReader reader = newReader("01");
    try {
      reader.peek();
      fail();
    } catch (MalformedJsonException expected) {
    }
  }

  // ---------------- keyword matching (true/false/null, case variants) ----------------

  @Test
  public void keyword_mixedCase_parsedAsBoolean() throws IOException {
    JsonReader reader = newReader("True");
    assertTrue(reader.nextBoolean());
  }

  @Test
  public void keyword_allUpperCase() throws IOException {
    JsonReader reader = newReader("FALSE");
    assertFalse(reader.nextBoolean());
  }

  @Test
  public void keyword_nullMixedCase() throws IOException {
    JsonReader reader = newReader("NULL");
    reader.nextNull();
  }

  @Test
  public void keyword_followedByLiteralChar_notMatched_lenient() throws IOException {
    JsonReader reader = newReader("truee");
    reader.setLenient(true);
    assertEquals("truee", reader.nextString());
  }

  // ---------------- close() ----------------

  @Test
  public void close_setsClosedState() throws IOException {
    JsonReader reader = newReader("[]");
    reader.close();
    try {
      reader.beginArray();
      fail();
    } catch (IllegalStateException expected) {
    }
  }

  // ---------------- skipValue ----------------

  @Test
  public void skipValue_skipsScalar() throws IOException {
    JsonReader reader = newReader("[1,2]");
    reader.beginArray();
    reader.skipValue();
    assertEquals(2, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void skipValue_skipsNestedArray() throws IOException {
    JsonReader reader = newReader("[[1,2],3]");
    reader.beginArray();
    reader.skipValue();
    assertEquals(3, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void skipValue_skipsNestedObject() throws IOException {
    JsonReader reader = newReader("[{\"a\":1},3]");
    reader.beginArray();
    reader.skipValue();
    assertEquals(3, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void skipValue_skipsQuotedString() throws IOException {
    JsonReader reader = newReader("[\"hello\",3]");
    reader.beginArray();
    reader.skipValue();
    assertEquals(3, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void skipValue_skipsUnquotedLenient() throws IOException {
    JsonReader reader = newReader("[abc,3]");
    reader.setLenient(true);
    reader.beginArray();
    reader.skipValue();
    assertEquals(3, reader.nextInt());
    reader.endArray();
  }

  // ---------------- getPath ----------------

  @Test
  public void getPath_reflectsPosition() throws IOException {
    JsonReader reader = newReader("{\"a\":[1,2]}");
    assertEquals("$", reader.getPath());
    reader.beginObject();
    reader.nextName();
    assertEquals("$.a", reader.getPath());
    reader.beginArray();
    reader.nextInt();
    assertEquals("$.a[1]", reader.getPath());
    reader.nextInt();
    assertEquals("$.a[2]", reader.getPath());
    reader.endArray();
    reader.endObject();
    assertEquals("$", reader.getPath());
  }

  // ---------------- toString ----------------

  @Test
  public void toString_containsLineAndColumn() throws IOException {
    JsonReader reader = newReader("[1]");
    String str = reader.toString();
    assertTrue(str.contains("JsonReader"));
    assertTrue(str.contains("line"));
    assertTrue(str.contains("column"));
  }

  // ---------------- comments (lenient/strict) ----------------

  @Test
  public void lenient_cStyleComment() throws IOException {
    JsonReader reader = newReader("[1,/* comment */2]");
    reader.setLenient(true);
    reader.beginArray();
    assertEquals(1, reader.nextInt());
    assertEquals(2, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void strict_cStyleComment_throws() throws IOException {
    JsonReader reader = newReader("[1,/* comment */2]");
    reader.beginArray();
    reader.nextInt();
    try {
      reader.nextInt();
      fail();
    } catch (MalformedJsonException expected) {
    }
  }

  @Test
  public void lenient_endOfLineCommentSlash() throws IOException {
    JsonReader reader = newReader("[1,// comment\n2]");
    reader.setLenient(true);
    reader.beginArray();
    assertEquals(1, reader.nextInt());
    assertEquals(2, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void lenient_hashComment() throws IOException {
    JsonReader reader = newReader("[1,#comment\n2]");
    reader.setLenient(true);
    reader.beginArray();
    assertEquals(1, reader.nextInt());
    assertEquals(2, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void unterminatedComment_throws() throws IOException {
    JsonReader reader = newReader("[1,/* unterminated");
    reader.setLenient(true);
    reader.beginArray();
    reader.nextInt();
    try {
      reader.nextInt();
      fail();
    } catch (MalformedJsonException expected) {
    }
  }

  // ---------------- escape sequences ----------------

  @Test
  public void escapeSequences_allTypes() throws IOException {
    JsonReader reader = newReader("\"\\t\\b\\n\\r\\f\\\"\\\\\\/\\u0041\"");
    String result = reader.nextString();
    assertEquals("\t\b\n\r\f\"\\/A", result);
  }

  @Test(expected = NumberFormatException.class)
  public void malformedUnicodeEscape_throws() throws IOException {
    JsonReader reader = newReader("\"\\uZZZZ\"");
    reader.nextString();
  }

  @Test
  public void unterminatedStringEscape_throws() throws IOException {
    JsonReader reader = newReader("\"abc\\");
    try {
      reader.nextString();
      fail();
    } catch (MalformedJsonException expected) {
    }
  }

  @Test
  public void unterminatedString_throws() throws IOException {
    JsonReader reader = newReader("\"abc");
    try {
      reader.nextString();
      fail();
    } catch (MalformedJsonException expected) {
    }
  }

  // ---------------- buffer boundary (>1024 chars, fillBuffer loop) ----------------

  @Test
  public void largeQuotedStringAcrossBufferBoundary() throws IOException {
    StringBuilder sb = new StringBuilder("\"");
    for (int i = 0; i < 2000; i++) {
      sb.append('a');
    }
    sb.append("\"");
    JsonReader reader = newReader(sb.toString());
    String result = reader.nextString();
    assertEquals(2000, result.length());
  }

  @Test
  public void largeUnquotedLiteralAcrossBufferBoundary_lenient() throws IOException {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 2000; i++) {
      sb.append('a');
    }
    JsonReader reader = newReader(sb.toString());
    reader.setLenient(true);
    String result = reader.nextString();
    assertEquals(2000, result.length());
  }

  // ---------------- EOF handling ----------------

  @Test(expected = EOFException.class)
  public void unexpectedEndOfInput_throwsEOFException() throws IOException {
    JsonReader reader = newReader("[");
    reader.beginArray();
    reader.hasNext();
  }

  // ---------------- byte order mark ----------------

  @Test
  public void byteOrderMark_skipped() throws IOException {
    JsonReader reader = newReader("\ufeff[1]");
    reader.beginArray();
    assertEquals(1, reader.nextInt());
    reader.endArray();
  }

  // ---------------- stack growth (push resize) ----------------

  @Test
  public void deeplyNestedArrays_growStack() throws IOException {
    int depth = 40; // > initial stack size (32) เพื่อ trigger การ resize ใน push()
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < depth; i++) sb.append('[');
    for (int i = 0; i < depth; i++) sb.append(']');
    JsonReader reader = newReader(sb.toString());
    for (int i = 0; i < depth; i++) reader.beginArray();
    for (int i = 0; i < depth; i++) reader.endArray();
  }
}
