# JsonWriterTest.java

```java
package com.google.gson.stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

/**
 * Unit tests for {@link JsonWriter} (Defects4J Gson-4b)
 * ครอบคลุม branch/condition ตามที่วิเคราะห์จาก source code จริง
 * ไม่มีการเดา behavior ที่ไม่มีอยู่ในซอร์ส
 */
public class JsonWriterTest {

  // ---------- helper ----------

  /** Writer wrapper สำหรับตรวจสอบว่ามีการเรียก flush() จริงหรือไม่ */
  private static class FlushTrackingWriter extends Writer {
    final StringWriter delegate = new StringWriter();
    boolean flushed = false;

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
      delegate.write(cbuf, off, len);
    }

    @Override
    public void flush() throws IOException {
      flushed = true;
      delegate.flush();
    }

    @Override
    public void close() throws IOException {
      delegate.close();
    }
  }

  private static String repeat(String s, int times) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < times; i++) {
      sb.append(s);
    }
    return sb.toString();
  }

  // ---------- Constructor ----------

  @Test(expected = NullPointerException.class)
  public void constructor_nullWriter_throwsNPE() {
    new JsonWriter(null);
  }

  // ---------- setIndent ----------

  @Test
  public void setIndent_empty_noNewlines() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.setIndent(""); // indent.length()==0 branch
    writer.beginObject();
    writer.name("a");
    writer.value(1);
    writer.endObject();
    assertEquals("{\"a\":1}", sw.toString());
  }

  @Test
  public void setIndent_nonEmpty_producesNewlinesAndSpaceSeparator() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.setIndent("  "); // else branch
    writer.beginObject();
    writer.name("a");
    writer.value(1);
    writer.endObject();
    assertEquals("{\n  \"a\": 1\n}", sw.toString());
  }

  // ---------- setLenient / isLenient ----------

  @Test
  public void isLenient_defaultFalse_thenTrueAfterSet() {
    JsonWriter writer = new JsonWriter(new StringWriter());
    assertFalse(writer.isLenient());
    writer.setLenient(true);
    assertTrue(writer.isLenient());
  }

  // ---------- setHtmlSafe / isHtmlSafe ----------

  @Test
  public void isHtmlSafe_defaultFalse_thenTrueAfterSet() {
    JsonWriter writer = new JsonWriter(new StringWriter());
    assertFalse(writer.isHtmlSafe());
    writer.setHtmlSafe(true);
    assertTrue(writer.isHtmlSafe());
  }

  // ---------- setSerializeNulls / getSerializeNulls ----------

  @Test
  public void getSerializeNulls_defaultTrue_thenFalseAfterSet() {
    JsonWriter writer = new JsonWriter(new StringWriter());
    assertTrue(writer.getSerializeNulls());
    writer.setSerializeNulls(false);
    assertFalse(writer.getSerializeNulls());
  }

  // ---------- beginArray/endArray, beginObject/endObject basic ----------

  @Test
  public void array_withTwoValues() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.beginArray();
    writer.value(1);
    writer.value(2);
    writer.endArray();
    assertEquals("[1,2]", sw.toString());
  }

  @Test
  public void object_withNameValue() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.beginObject();
    writer.name("a");
    writer.value("b");
    writer.endObject();
    assertEquals("{\"a\":\"b\"}", sw.toString());
  }

  // ---------- close() nesting-problem branch ----------

  @Test
  public void endArray_whenInObjectContext_throwsNestingProblem() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginObject();
    try {
      writer.endArray();
      fail("expected IllegalStateException");
    } catch (IllegalStateException e) {
      assertEquals("Nesting problem.", e.getMessage());
    }
  }

  // ---------- close() dangling-name branch ----------

  @Test
  public void endObject_withDanglingName_throws() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginObject();
    writer.name("a"); // deferredName set but value not written
    try {
      writer.endObject();
      fail("expected IllegalStateException");
    } catch (IllegalStateException e) {
      assertEquals("Dangling name: a", e.getMessage());
    }
  }

  // ---------- push() stack growth branch ----------

  @Test
  public void push_growsStackBeyondInitialCapacity() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    int depth = 40; // มากกว่า initial stack length (32) เพื่อบังคับให้ resize
    for (int i = 0; i < depth; i++) {
      writer.beginArray();
    }
    for (int i = 0; i < depth; i++) {
      writer.endArray();
    }
    writer.close();
    String expected = repeat("[", depth) + repeat("]", depth);
    assertEquals(expected, sw.toString());
  }

  // ---------- peek() stackSize==0 branch (via closed writer) ----------

  @Test
  public void afterClose_beginArray_throwsClosedException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginArray();
    writer.endArray();
    writer.close(); // stackSize reset to 0
    try {
      writer.beginArray();
      fail("expected IllegalStateException");
    } catch (IllegalStateException e) {
      assertEquals("JsonWriter is closed.", e.getMessage());
    }
  }

  // ---------- name() branches ----------

  @Test(expected = NullPointerException.class)
  public void name_null_throwsNPE() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginObject();
    writer.name(null);
  }

  @Test
  public void name_calledTwiceWithoutValue_throwsIllegalState() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginObject();
    writer.name("a");
    try {
      writer.name("b");
      fail("expected IllegalStateException");
    } catch (IllegalStateException e) {
      // message-less exception per source (new IllegalStateException())
    }
  }

  @Test
  public void name_whenStackSizeZero_throwsClosedException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginArray();
    writer.endArray();
    writer.close();
    try {
      writer.name("a");
      fail("expected IllegalStateException");
    } catch (IllegalStateException e) {
      assertEquals("JsonWriter is closed.", e.getMessage());
    }
  }

  // ---------- beforeName() nesting-problem branch (called via writeDeferredName) ----------

  @Test
  public void name_insideArray_thenValue_throwsNestingProblem() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginArray();
    writer.name("x"); // ยอมให้ set deferredName ได้ เพราะ name() ไม่ตรวจ context
    try {
      writer.value(1); // จะไป trigger writeDeferredName -> beforeName -> context=EMPTY_ARRAY
      fail("expected IllegalStateException");
    } catch (IllegalStateException e) {
      assertEquals("Nesting problem.", e.getMessage());
    }
  }

  // ---------- value(String) branches ----------

  @Test
  public void valueString_null_writesNullLiteral() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.beginArray();
    writer.value((String) null);
    writer.endArray();
    assertEquals("[null]", sw.toString());
  }

  @Test
  public void valueString_nonNull_writesQuotedString() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.beginArray();
    writer.value("hi");
    writer.endArray();
    assertEquals("[\"hi\"]", sw.toString());
  }

  // ---------- jsonValue(String) branches ----------

  @Test
  public void jsonValue_null_writesNullLiteral() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.beginArray();
    writer.jsonValue(null);
    writer.endArray();
    assertEquals("[null]", sw.toString());
  }

  @Test
  public void jsonValue_nonNull_writesRawWithoutQuoting() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.beginArray();
    writer.jsonValue("123");
    writer.endArray();
    assertEquals("[123]", sw.toString());
  }

  // ---------- nullValue() branches ----------

  @Test
  public void nullValue_withSerializeNullsTrue_writesNameAndNull() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.beginObject();
    writer.name("a");
    writer.nullValue();
    writer.endObject();
    assertEquals("{\"a\":null}", sw.toString());
  }

  @Test
  public void nullValue_withSerializeNullsFalse_skipsMemberEntirely() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.setSerializeNulls(false);
    writer.beginObject();
    writer.name("a");
    writer.nullValue(); // deferredName should be discarded silently
    writer.endObject();
    assertEquals("{}", sw.toString());
  }

  @Test
  public void nullValue_inArray_deferredNameNull_writesNull() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.beginArray();
    writer.nullValue(); // deferredName == null branch
    writer.endArray();
    assertEquals("[null]", sw.toString());
  }

  // ---------- value(boolean) ----------

  @Test
  public void valueBoolean_trueAndFalse() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.beginArray();
    writer.value(true);
    writer.value(false);
    writer.endArray();
    assertEquals("[true,false]", sw.toString());
  }

  // ---------- value(double) branches ----------

  @Test
  public void valueDouble_finite_writesNumber() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.beginArray();
    writer.value(1.5d);
    writer.endArray();
    assertEquals("[1.5]", sw.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void valueDouble_NaN_throws_evenIfLenient() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.setLenient(true); // ยืนยันว่า method นี้ไม่ตรวจ lenient เลย
    writer.beginArray();
    writer.value(Double.NaN);
  }

  @Test(expected = IllegalArgumentException.class)
  public void valueDouble_Infinite_throws() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginArray();
    writer.value(Double.POSITIVE_INFINITY);
  }

  // ---------- value(long) ----------

  @Test
  public void valueLong_writesNumber() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.beginArray();
    writer.value(123456789012L);
    writer.endArray();
    assertEquals("[123456789012]", sw.toString());
  }

  // ---------- value(Number) branches ----------

  @Test
  public void valueNumber_null_writesNullLiteral() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.beginArray();
    writer.value((Number) null);
    writer.endArray();
    assertEquals("[null]", sw.toString());
  }

  @Test
  public void valueNumber_normal_writesNumber() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.beginArray();
    writer.value(Integer.valueOf(42));
    writer.endArray();
    assertEquals("[42]", sw.toString());
  }

  @Test
  public void valueNumber_NaNStrict_throws() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginArray();
    Double nanBoxed = Double.NaN; // reference type -> เข้าสู่ overload value(Number)
    try {
      writer.value(nanBoxed);
      fail("expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      assertEquals("Numeric values must be finite, but was NaN", e.getMessage());
    }
  }

  @Test
  public void valueNumber_InfinityLenient_allowed() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.setLenient(true);
    writer.beginArray();
    Double infBoxed = Double.POSITIVE_INFINITY;
    writer.value(infBoxed);
    writer.endArray();
    assertEquals("[Infinity]", sw.toString());
  }

  @Test
  public void valueNumber_NegativeInfinityStrict_throws() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginArray();
    Double negInfBoxed = Double.NEGATIVE_INFINITY;
    try {
      writer.value(negInfBoxed);
      fail("expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      assertEquals("Numeric values must be finite, but was -Infinity", e.getMessage());
    }
  }

  // ---------- flush() branches ----------

  @Test
  public void flush_whenClosed_throws() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginArray();
    writer.endArray();
    writer.close();
    try {
      writer.flush();
      fail("expected IllegalStateException");
    } catch (IllegalStateException e) {
      assertEquals("JsonWriter is closed.", e.getMessage());
    }
  }

  @Test
  public void flush_normal_delegatesToUnderlyingWriter() throws IOException {
    FlushTrackingWriter ftw = new FlushTrackingWriter();
    JsonWriter writer = new JsonWriter(ftw);
    writer.beginArray();
    writer.endArray();
    writer.flush();
    assertTrue(ftw.flushed);
  }

  // ---------- close() branches ----------

  @Test
  public void close_incompleteDocument_sizeGreaterThanOne_throwsIOException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginArray(); // stackSize == 2, not closed
    try {
      writer.close();
      fail("expected IOException");
    } catch (IOException e) {
      assertEquals("Incomplete document", e.getMessage());
    }
  }

  @Test
  public void close_noValueWritten_sizeOneNotNonemptyDocument_throwsIOException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    // stackSize==1, top==EMPTY_DOCUMENT (!=NONEMPTY_DOCUMENT)
    try {
      writer.close();
      fail("expected IOException");
    } catch (IOException e) {
      assertEquals("Incomplete document", e.getMessage());
    }
  }

  @Test
  public void close_completeArrayDocument_succeeds() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.beginArray();
    writer.endArray();
    writer.close(); // stackSize==1, top==NONEMPTY_DOCUMENT -> success
    assertEquals("[]", sw.toString());
  }

  // ---------- string() escaping branches ----------

  @Test
  public void string_controlAndSpecialCharsEscaped_normalCharsAndHighUnicodeUnescaped()
      throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    // \u0001 (control), " \ \t \b \n \r \f, ตัวอักษรปรกติ, \u2028 \u2029, และ unicode >=128
    String input = "\u0001\"\\\t\b\n\r\fabc\u2028\u2029\u20AC";
    writer.beginArray();
    writer.value(input);
    writer.endArray();

    String expectedInner =
        "\\u0001" + "\\\"" + "\\\\" + "\\t" + "\\b" + "\\n" + "\\r" + "\\f"
            + "abc" + "\\u2028" + "\\u2029" + "\u20AC";
    String expected = "[\"" + expectedInner + "\"]";
    assertEquals(expected, sw.toString());
  }

  @Test
  public void string_htmlSafeTrue_escapesHtmlChars() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.setHtmlSafe(true);
    writer.beginArray();
    writer.value("<>&='");
    writer.endArray();
    String expectedInner = "\\u003c\\u003e\\u0026\\u003d\\u0027";
    assertEquals("[\"" + expectedInner + "\"]", sw.toString());
  }

  @Test
  public void string_htmlSafeFalse_doesNotEscapeHtmlChars() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    // default htmlSafe == false
    writer.beginArray();
    writer.value("<>&='");
    writer.endArray();
    assertEquals("[\"<>&='\"]", sw.toString());
  }

  // ---------- newline() branches ----------

  @Test
  public void newline_indentNull_noNewlineWritten() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.beginArray();
    writer.value(1);
    writer.value(2);
    writer.endArray();
    assertFalse(sw.toString().contains("\n"));
  }

  @Test
  public void newline_indentSet_writesNewlineAndIndentPerLevel() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.setIndent("  ");
    writer.beginArray();
    writer.beginArray();
    writer.value(1);
    writer.endArray();
    writer.endArray();
    // ตรวจสอบว่ามี newline และมี indent 2 ระดับสำหรับค่าที่อยู่ลึกสุด
    assertEquals("[\n  [\n    1\n  ]\n]", sw.toString());
  }

  // ---------- beforeName() branches ----------

  @Test
  public void beforeName_secondMemberInObject_writesComma() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.beginObject();
    writer.name("a");
    writer.value(1);
    writer.name("b"); // context == NONEMPTY_OBJECT -> เขียน comma
    writer.value(2);
    writer.endObject();
    assertEquals("{\"a\":1,\"b\":2}", sw.toString());
  }

  // ---------- beforeValue() branches ----------

  @Test
  public void beforeValue_emptyDocumentStrictNotRoot_throws() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    // lenient=false (default), root=false เมื่อเรียกผ่าน value() ตรง ๆ ที่ top level
    try {
      writer.value("x");
      fail("expected IllegalStateException");
    } catch (IllegalStateException e) {
      assertEquals("JSON must start with an array or an object.", e.getMessage());
    }
  }

  @Test
  public void beforeValue_emptyDocumentLenient_allowsTopLevelValue() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.setLenient(true);
    writer.value("x");
    assertEquals("\"x\"", sw.toString());
  }

  @Test
  public void beforeValue_nonemptyDocumentStrict_throws() throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.setLenient(true);
    writer.value("first"); // ทำให้ context กลายเป็น NONEMPTY_DOCUMENT
    writer.setLenient(false);
    try {
      writer.value("second");
      fail("expected IllegalStateException");
    } catch (IllegalStateException e) {
      assertEquals("JSON must have only one top-level value.", e.getMessage());
    }
  }

  @Test
  public void beforeValue_nonemptyDocumentLenient_allowsMultipleTopLevelValues()
      throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    writer.setLenient(true);
    writer.value("first");
    writer.value("second"); // fall-through จาก NONEMPTY_DOCUMENT case แต่ lenient=true ไม่ throw
    assertEquals("\"first\"\"second\"", sw.toString());
  }

  @Test
  public void beforeValue_defaultCase_valueDirectlyInsideObject_throwsNestingProblem()
      throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginObject(); // peek() == EMPTY_OBJECT
    try {
      writer.value(1); // ไม่มี name มาก่อน -> beforeValue เจอ default case
      fail("expected IllegalStateException");
    } catch (IllegalStateException e) {
      assertEquals("Nesting problem.", e.getMessage());
    }
  }
}
```

---

# ตารางสรุป Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `constructor_nullWriter_throwsNPE` | Constructor: `out == null` → NPE |
| `setIndent_empty_noNewlines` | `setIndent`: `indent.length()==0` branch |
| `setIndent_nonEmpty_producesNewlinesAndSpaceSeparator` | `setIndent`: else branch (non-empty) |
| `isLenient_defaultFalse_thenTrueAfterSet` | `setLenient`/`isLenient` getter-setter |
| `isHtmlSafe_defaultFalse_thenTrueAfterSet` | `setHtmlSafe`/`isHtmlSafe` |
| `getSerializeNulls_defaultTrue_thenFalseAfterSet` | `setSerializeNulls`/`getSerializeNulls` |
| `array_withTwoValues`, `object_withNameValue` | `beginArray/endArray`, `beginObject/endObject` basic path |
| `endArray_whenInObjectContext_throwsNestingProblem` | `close()`: context != nonempty && != empty → throw |
| `endObject_withDanglingName_throws` | `close()`: `deferredName != null` → throw |
| `push_growsStackBeyondInitialCapacity` | `push()`: `stackSize == stack.length` resize branch |
| `afterClose_beginArray_throwsClosedException` | `peek()`: `stackSize == 0` → throw |
| `name_null_throwsNPE` | `name()`: `name == null` → NPE |
| `name_calledTwiceWithoutValue_throwsIllegalState` | `name()`: `deferredName != null` → throw |
| `name_whenStackSizeZero_throwsClosedException` | `name()`: `stackSize == 0` → throw |
| `name_insideArray_thenValue_throwsNestingProblem` | `beforeName()`: context ไม่ใช่ OBJECT → throw |
| `valueString_null_writesNullLiteral` / `valueString_nonNull_writesQuotedString` | `value(String)`: null branch / normal branch |
| `jsonValue_null_writesNullLiteral` / `jsonValue_nonNull_writesRawWithoutQuoting` | `jsonValue(String)`: null / normal |
| `nullValue_withSerializeNullsTrue...` / `...False...` / `...deferredNameNull...` | `nullValue()`: 3 branches (serializeNulls true/false, deferredName null) |
| `valueBoolean_trueAndFalse` | `value(boolean)`: ternary true/false |
| `valueDouble_finite_writesNumber` / `_NaN_throws` / `_Infinite_throws` | `value(double)`: finite vs NaN/Infinite |
| `valueLong_writesNumber` | `value(long)` |
| `valueNumber_null...` / `_normal...` / `_NaNStrict_throws` / `_InfinityLenient_allowed` / `_NegativeInfinityStrict_throws` | `value(Number)`: null, normal, strict-throw (3 string variants), lenient-allow |
| `flush_whenClosed_throws` / `flush_normal_delegatesToUnderlyingWriter` | `flush()`: stackSize==0 throw / normal delegate |
| `close_incompleteDocument_sizeGreaterThanOne_throwsIOException` | `close()`: `size > 1` branch |
| `close_noValueWritten_sizeOneNotNonemptyDocument_throwsIOException` | `close()`: `size==1 && top!=NONEMPTY_DOCUMENT` branch |
| `close_completeArrayDocument_succeeds` | `close()`: success path |
| `string_controlAndSpecialCharsEscaped_normalCharsAndHighUnicodeUnescaped` | `string()`: control chars, quote/backslash/tab/backspace/newline/CR/FF escape, `continue` branch (no replacement / c>=128 non-U2028/2029) |
| `string_htmlSafeTrue_escapesHtmlChars` / `string_htmlSafeFalse_doesNotEscapeHtmlChars` | `string()`: htmlSafe true/false branch selection of replacement table |
| `newline_indentNull_noNewlineWritten` / `newline_indentSet_writesNewlineAndIndentPerLevel` | `newline()`: `indent==null` return / loop เขียน indent ตาม depth |
| `beforeName_secondMemberInObject_writesComma` | `beforeName()`: `context==NONEMPTY_OBJECT` → เขียน comma |
| `beforeValue_emptyDocumentStrictNotRoot_throws` | `beforeValue`: case EMPTY_DOCUMENT, `!lenient && !root` → throw |
| `beforeValue_emptyDocumentLenient_allowsTopLevelValue` | `beforeValue`: case EMPTY_DOCUMENT, lenient=true ไม่ throw |
| `beforeValue_nonemptyDocumentStrict_throws` | `beforeValue`: case NONEMPTY_DOCUMENT, `!lenient` → throw |
| `beforeValue_nonemptyDocumentLenient_allowsMultipleTopLevelValues` | `beforeValue`: case NONEMPTY_DOCUMENT fall-through, lenient=true |
| `beforeValue_defaultCase_valueDirectlyInsideObject_throwsNestingProblem` | `beforeValue`: `default:` case (EMPTY_OBJECT) → throw |

**หมายเหตุ:** case `EMPTY_ARRAY` และ `NONEMPTY_ARRAY` และ `DANGLING_NAME` ของ `beforeValue()` ถูกครอบคลุมโดยอ้อมผ่านเทสพื้นฐาน (`array_withTwoValues`, `object_withNameValue`, `newline_indentSet_...`) ซึ่งเรียก `value()` ซ้ำภายใน array/object ปกติ