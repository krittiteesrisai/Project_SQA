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

public class JsonWriterTest {

    // ---------- helper ----------

    private static JsonWriter newWriter(StringWriter sw) {
        return new JsonWriter(sw);
    }

    private String encodeStringValue(String input, boolean htmlSafe) throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.setHtmlSafe(htmlSafe);
        writer.value(input);
        return sw.toString();
    }

    // custom writer to detect close() invocation on underlying stream
    private static class TrackingWriter extends StringWriter {
        boolean closedCalled = false;
        @Override
        public void close() throws IOException {
            closedCalled = true;
            super.close();
        }
    }

    // ===================== Constructor =====================

    @Test(expected = NullPointerException.class)
    public void constructor_nullWriter_throwsNPE() {
        new JsonWriter(null);
    }

    // ===================== setIndent =====================

    @Test
    public void setIndent_emptyString_compactOutput() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.setIndent(""); // branch: indent.length()==0
        writer.beginObject();
        writer.name("a");
        writer.value(1L);
        writer.endObject();
        assertEquals("{\"a\":1}", sw.toString());
    }

    @Test
    public void setIndent_nonEmptyString_prettyPrintOutput() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.setIndent("  "); // branch: indent.length()!=0
        writer.beginObject();
        writer.name("a");
        writer.value(1L);
        writer.endObject();
        assertEquals("{\n  \"a\": 1\n}", sw.toString());
    }

    // ===================== lenient / htmlSafe / serializeNulls flags =====================

    @Test
    public void isLenient_defaultFalse() {
        JsonWriter writer = newWriter(new StringWriter());
        assertFalse(writer.isLenient());
    }

    @Test
    public void setLenient_true_getterReflectsChange() {
        JsonWriter writer = newWriter(new StringWriter());
        writer.setLenient(true);
        assertTrue(writer.isLenient());
    }

    @Test
    public void isHtmlSafe_defaultFalse() {
        JsonWriter writer = newWriter(new StringWriter());
        assertFalse(writer.isHtmlSafe());
    }

    @Test
    public void setHtmlSafe_true_getterReflectsChange() {
        JsonWriter writer = newWriter(new StringWriter());
        writer.setHtmlSafe(true);
        assertTrue(writer.isHtmlSafe());
    }

    @Test
    public void getSerializeNulls_defaultTrue() {
        JsonWriter writer = newWriter(new StringWriter());
        assertTrue(writer.getSerializeNulls());
    }

    @Test
    public void setSerializeNulls_false_getterReflectsChange() {
        JsonWriter writer = newWriter(new StringWriter());
        writer.setSerializeNulls(false);
        assertFalse(writer.getSerializeNulls());
    }

    // ===================== beginArray / endArray / open / close =====================

    @Test
    public void beginEndArray_producesEmptyArray() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.beginArray();
        writer.endArray();
        assertEquals("[]", sw.toString());
    }

    @Test
    public void beginEndObject_producesEmptyObject() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.beginObject();
        writer.endObject();
        assertEquals("{}", sw.toString());
    }

    @Test
    public void endArray_onMismatchedObjectContext_throwsIllegalState() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.beginObject();
        try {
            writer.endArray(); // context is EMPTY_OBJECT -> neither empty(array) nor nonempty(array)
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // ok
        }
    }

    @Test
    public void endObject_withDanglingName_throwsIllegalState() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.beginObject();
        writer.name("a"); // deferredName set, never consumed
        try {
            writer.endObject();
            fail("Expected IllegalStateException for dangling name");
        } catch (IllegalStateException expected) {
            // ok
        }
    }

    @Test
    public void endObject_nonEmptyObject_writesNewlineBeforeClose() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.setIndent("  ");
        writer.beginObject();
        writer.name("a");
        writer.value(1L);
        writer.endObject(); // context == NONEMPTY_OBJECT -> newline() branch executed
        assertEquals("{\n  \"a\": 1\n}", sw.toString());
    }

    @Test
    public void push_stackGrowsBeyondInitialCapacity() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        int depth = 40; // > initial stack length (32) forces growth
        for (int i = 0; i < depth; i++) {
            writer.beginArray();
        }
        for (int i = 0; i < depth; i++) {
            writer.endArray();
        }
        StringBuilder expected = new StringBuilder();
        for (int i = 0; i < depth; i++) expected.append('[');
        for (int i = 0; i < depth; i++) expected.append(']');
        assertEquals(expected.toString(), sw.toString());
    }

    // ===================== name() =====================

    @Test(expected = NullPointerException.class)
    public void name_null_throwsNPE() throws IOException {
        JsonWriter writer = newWriter(new StringWriter());
        writer.beginObject();
        writer.name(null);
    }

    @Test
    public void name_calledTwiceWithoutValue_throwsIllegalState() throws IOException {
        JsonWriter writer = newWriter(new StringWriter());
        writer.beginObject();
        writer.name("a");
        try {
            writer.name("b"); // deferredName != null branch
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // ok
        }
    }

    @Test
    public void name_afterWriterClosed_throwsIllegalState() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.beginArray();
        writer.endArray();
        writer.close(); // stackSize becomes 0
        try {
            writer.name("a"); // stackSize == 0 branch
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // ok
        }
    }

    // ===================== writeDeferredName via beforeName() =====================

    @Test
    public void beforeName_inArrayContext_throwsIllegalState() throws IOException {
        // Calling name() while top of stack is an array (not an object) triggers
        // the else-if branch throwing "Nesting problem." inside beforeName().
        JsonWriter writer = newWriter(new StringWriter());
        writer.beginArray();
        writer.name("x");
        try {
            writer.value(1L); // triggers writeDeferredName -> beforeName()
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // ok
        }
    }

    @Test
    public void beforeName_secondNameInObject_writesComma() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.beginObject();
        writer.name("a");
        writer.value(1L);
        writer.name("b"); // context == NONEMPTY_OBJECT -> comma branch
        writer.value(2L);
        writer.endObject();
        assertEquals("{\"a\":1,\"b\":2}", sw.toString());
    }

    // ===================== value(String) / jsonValue(String) =====================

    @Test
    public void valueString_null_writesNullLiteral() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.value((String) null);
        assertEquals("null", sw.toString());
    }

    @Test
    public void valueString_nonNull_writesQuotedEscapedString() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.value("hello");
        assertEquals("\"hello\"", sw.toString());
    }

    @Test
    public void jsonValue_null_writesNullLiteral() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.jsonValue(null);
        assertEquals("null", sw.toString());
    }

    @Test
    public void jsonValue_nonNull_writesRawStringUnescaped() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.jsonValue("{\"raw\":true}");
        assertEquals("{\"raw\":true}", sw.toString());
    }

    // ===================== nullValue() =====================

    @Test
    public void nullValue_topLevel_writesNullDirectly() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.nullValue(); // deferredName == null branch skipped entirely
        assertEquals("null", sw.toString());
    }

    @Test
    public void nullValue_inObjectWithSerializeNullsTrue_writesNameAndNull() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.beginObject();
        writer.name("a");
        writer.nullValue(); // deferredName!=null && serializeNulls==true
        writer.endObject();
        assertEquals("{\"a\":null}", sw.toString());
    }

    @Test
    public void nullValue_inObjectWithSerializeNullsFalse_skipsNameAndValue() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("a");
        writer.nullValue(); // deferredName!=null && serializeNulls==false -> skip
        writer.endObject();
        assertEquals("{}", sw.toString());
    }

    // ===================== value(boolean) / value(Boolean) =====================

    @Test
    public void valueBooleanPrimitive_true() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.value(true);
        assertEquals("true", sw.toString());
    }

    @Test
    public void valueBooleanPrimitive_false() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.value(false);
        assertEquals("false", sw.toString());
    }

    @Test
    public void valueBooleanObject_null_writesNullLiteral() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.value((Boolean) null);
        assertEquals("null", sw.toString());
    }

    @Test
    public void valueBooleanObject_nonNullTrue() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.value(Boolean.TRUE);
        assertEquals("true", sw.toString());
    }

    @Test
    public void valueBooleanObject_nonNullFalse() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.value(Boolean.FALSE);
        assertEquals("false", sw.toString());
    }

    // ===================== value(double) =====================

    @Test
    public void valueDoublePrimitive_NaN_throwsIllegalArgument_evenIfLenient() throws IOException {
        JsonWriter writer = newWriter(new StringWriter());
        writer.setLenient(true); // no lenient escape exists for primitive double
        try {
            writer.value(Double.NaN);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    @Test
    public void valueDoublePrimitive_Infinite_throwsIllegalArgument() throws IOException {
        JsonWriter writer = newWriter(new StringWriter());
        try {
            writer.value(Double.POSITIVE_INFINITY);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    @Test
    public void valueDoublePrimitive_finite_writesNumber() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.value(3.14);
        assertEquals("3.14", sw.toString());
    }

    // ===================== value(long) =====================

    @Test
    public void valueLong_writesNumber() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.value(123456789L);
        assertEquals("123456789", sw.toString());
    }

    // ===================== value(Number) =====================

    @Test
    public void valueNumber_null_writesNullLiteral() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.value((Number) null);
        assertEquals("null", sw.toString());
    }

    @Test
    public void valueNumber_NaN_notLenient_throwsIllegalArgument() throws IOException {
        JsonWriter writer = newWriter(new StringWriter());
        try {
            writer.value((Number) Double.valueOf(Double.NaN));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    @Test
    public void valueNumber_Infinity_lenient_writesRawToken() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.setLenient(true);
        writer.value((Number) Double.valueOf(Double.POSITIVE_INFINITY));
        assertEquals("Infinity", sw.toString());
    }

    @Test
    public void valueNumber_finite_writesNumber() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.value((Number) Integer.valueOf(42));
        assertEquals("42", sw.toString());
    }

    // ===================== flush() / close() =====================

    @Test
    public void flush_normalState_doesNotThrow() throws IOException {
        JsonWriter writer = newWriter(new StringWriter());
        writer.beginArray();
        writer.flush(); // stackSize != 0
        writer.endArray();
    }

    @Test
    public void flush_afterClose_throwsIllegalState() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.beginArray();
        writer.endArray();
        writer.close();
        try {
            writer.flush(); // stackSize == 0 branch
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // ok
        }
    }

    @Test
    public void close_incompleteDocument_throwsIOException() throws IOException {
        JsonWriter writer = newWriter(new StringWriter());
        writer.beginArray(); // never closed -> size > 1
        try {
            writer.close();
            fail("Expected IOException for incomplete document");
        } catch (IOException expected) {
            // ok
        }
    }

    @Test
    public void close_completeDocument_succeedsAndClosesUnderlyingWriter() throws IOException {
        TrackingWriter sw = new TrackingWriter();
        JsonWriter writer = newWriter(sw);
        writer.beginArray();
        writer.endArray();
        writer.close();
        assertTrue(sw.closedCalled);
        assertEquals("[]", sw.toString());
    }

    @Test
    public void close_calledTwice_isIdempotent() throws IOException {
        JsonWriter writer = newWriter(new StringWriter());
        writer.beginArray();
        writer.endArray();
        writer.close();
        writer.close(); // stackSize already 0, size==0 branch, no throw
    }

    // ===================== string() escaping (via value(String)) =====================

    @Test
    public void string_quoteCharacter_isEscaped() throws IOException {
        assertEquals("\"\\\"\"", encodeStringValue("\"", false));
    }

    @Test
    public void string_backslashCharacter_isEscaped() throws IOException {
        assertEquals("\"\\\\\"", encodeStringValue("\\", false));
    }

    @Test
    public void string_tabCharacter_isEscaped() throws IOException {
        assertEquals("\"\\t\"", encodeStringValue("\t", false));
    }

    @Test
    public void string_backspaceCharacter_isEscaped() throws IOException {
        assertEquals("\"\\b\"", encodeStringValue("\b", false));
    }

    @Test
    public void string_newlineCharacter_isEscaped() throws IOException {
        assertEquals("\"\\n\"", encodeStringValue("\n", false));
    }

    @Test
    public void string_carriageReturnCharacter_isEscaped() throws IOException {
        assertEquals("\"\\r\"", encodeStringValue("\r", false));
    }

    @Test
    public void string_formFeedCharacter_isEscaped() throws IOException {
        assertEquals("\"\\f\"", encodeStringValue("\f", false));
    }

    @Test
    public void string_controlCharacterU0000_isEscapedAsUnicode() throws IOException {
        assertEquals("\"\\u0000\"", encodeStringValue("\u0000", false));
    }

    @Test
    public void string_controlCharacterU001f_isEscapedAsUnicode() throws IOException {
        assertEquals("\"\\u001f\"", encodeStringValue("\u001f", false));
    }

    @Test
    public void string_plainAsciiCharacter_notEscaped() throws IOException {
        // c < 128, replacement == null -> continue branch
        assertEquals("\"A\"", encodeStringValue("A", false));
    }

    @Test
    public void string_lineSeparatorU2028_isEscaped() throws IOException {
        assertEquals("\"\\u2028\"", encodeStringValue("\u2028", false));
    }

    @Test
    public void string_paragraphSeparatorU2029_isEscaped() throws IOException {
        assertEquals("\"\\u2029\"", encodeStringValue("\u2029", false));
    }

    @Test
    public void string_nonAsciiCharacterAboveU2029_notEscaped() throws IOException {
        // c >= 128, not 2028/2029 -> final else 'continue' branch
        assertEquals("\"\u00e9\"", encodeStringValue("\u00e9", false));
    }

    @Test
    public void string_htmlUnsafeCharacters_notEscapedWhenHtmlSafeFalse() throws IOException {
        assertEquals("\"<\"", encodeStringValue("<", false));
        assertEquals("\">\"", encodeStringValue(">", false));
        assertEquals("\"&\"", encodeStringValue("&", false));
        assertEquals("\"=\"", encodeStringValue("=", false));
        assertEquals("\"'\"", encodeStringValue("'", false));
    }

    @Test
    public void string_htmlSafeCharacters_escapedWhenHtmlSafeTrue() throws IOException {
        assertEquals("\"\\u003c\"", encodeStringValue("<", true));
        assertEquals("\"\\u003e\"", encodeStringValue(">", true));
        assertEquals("\"\\u0026\"", encodeStringValue("&", true));
        assertEquals("\"\\u003d\"", encodeStringValue("=", true));
        assertEquals("\"\\u0027\"", encodeStringValue("'", true));
    }

    @Test
    public void string_escapeInMiddle_writesPrefixAndSuffixSegments() throws IOException {
        // Covers: last < i == true (prefix write) AND last < length == true (suffix write)
        assertEquals("\"ab\\\"cd\"", encodeStringValue("ab\"cd", false));
    }

    @Test
    public void string_escapeAtStart_skipsPrefixWriteButWritesSuffix() throws IOException {
        // Covers: last < i == false (no prefix write) at i==0
        assertEquals("\"\\\"ab\"", encodeStringValue("\"ab", false));
    }

    @Test
    public void string_escapeAtEnd_writesPrefixButSkipsSuffixWrite() throws IOException {
        // Covers: last < length == false after loop ends (no trailing write)
        assertEquals("\"ab\\\"\"", encodeStringValue("ab\"", false));
    }

    // ===================== newline() =====================

    @Test
    public void newline_withoutIndent_producesCompactOutput() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        // indent is null by default -> newline() returns immediately
        writer.beginArray();
        writer.value(1L);
        writer.value(2L);
        writer.endArray();
        assertEquals("[1,2]", sw.toString());
    }

    @Test
    public void newline_withIndent_producesMultilineOutputWithProperDepth() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.setIndent("  ");
        writer.beginArray();
        writer.beginArray();
        writer.value(1L);
        writer.endArray();
        writer.endArray();
        // outer array depth=1 (1 indent), inner array elements depth=2 (2 indents)
        assertEquals("[\n  [\n    1\n  ]\n]", sw.toString());
    }

    // ===================== beforeValue() branches =====================

    @Test
    public void beforeValue_emptyDocument_firstTopLevelValue_succeeds() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.value(1L); // case EMPTY_DOCUMENT
        assertEquals("1", sw.toString());
    }

    @Test
    public void beforeValue_nonEmptyDocument_notLenient_throwsIllegalState() throws IOException {
        JsonWriter writer = newWriter(new StringWriter());
        writer.value(1L); // becomes NONEMPTY_DOCUMENT
        try {
            writer.value(2L); // case NONEMPTY_DOCUMENT, !lenient -> throw
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // ok
        }
    }

    @Test
    public void beforeValue_nonEmptyDocument_lenient_succeeds() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.setLenient(true);
        writer.value(1L);
        writer.value(2L); // case NONEMPTY_DOCUMENT, lenient -> fall-through, ok
        assertEquals("12", sw.toString());
    }

    @Test
    public void beforeValue_emptyArray_firstElement_noComma() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.beginArray();
        writer.value(1L); // case EMPTY_ARRAY
        writer.endArray();
        assertEquals("[1]", sw.toString());
    }

    @Test
    public void beforeValue_nonEmptyArray_subsequentElement_writesComma() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.beginArray();
        writer.value(1L);
        writer.value(2L); // case NONEMPTY_ARRAY -> comma
        writer.endArray();
        assertEquals("[1,2]", sw.toString());
    }

    @Test
    public void beforeValue_danglingName_writesSeparatorAndSwitchesToNonEmptyObject() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter writer = newWriter(sw);
        writer.beginObject();
        writer.name("k");
        writer.value(1L); // case DANGLING_NAME
        writer.endObject();
        assertEquals("{\"k\":1}", sw.toString());
    }

    @Test
    public void beforeValue_defaultBranch_valueInObjectWithoutName_throwsIllegalState() throws IOException {
        // peek() == EMPTY_OBJECT while attempting a value -> falls to default case
        JsonWriter writer = newWriter(new StringWriter());
        writer.beginObject();
        try {
            writer.value(1L);
            fail("Expected IllegalStateException (Nesting problem)");
        } catch (IllegalStateException expected) {
            // ok
        }
    }

    @Test
    public void beforeValue_defaultBranch_secondValueInObjectWithoutName_throwsIllegalState() throws IOException {
        // peek() == NONEMPTY_OBJECT while attempting a value without name -> default case
        JsonWriter writer = newWriter(new StringWriter());
        writer.beginObject();
        writer.name("a");
        writer.value(1L);
        try {
            writer.value(2L);
            fail("Expected IllegalStateException (Nesting problem)");
        } catch (IllegalStateException expected) {
            // ok
        }
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `constructor_nullWriter_throwsNPE` | Constructor: `out == null` → NPE |
| `setIndent_emptyString_compactOutput` | `setIndent`: `indent.length()==0` (true) |
| `setIndent_nonEmptyString_prettyPrintOutput` | `setIndent`: `indent.length()==0` (false) |
| `isLenient_defaultFalse` / `setLenient_true_...` | getter/setter ของ `lenient` |
| `isHtmlSafe_defaultFalse` / `setHtmlSafe_true_...` | getter/setter ของ `htmlSafe` |
| `getSerializeNulls_defaultTrue` / `setSerializeNulls_false_...` | getter/setter ของ `serializeNulls` |
| `beginEndArray_producesEmptyArray` | `open`/`close` ปกติ (EMPTY_ARRAY) |
| `beginEndObject_producesEmptyObject` | `open`/`close` ปกติ (EMPTY_OBJECT) |
| `endArray_onMismatchedObjectContext_throwsIllegalState` | `close`: `context != nonempty && context != empty` |
| `endObject_withDanglingName_throwsIllegalState` | `close`: `deferredName != null` |
| `endObject_nonEmptyObject_writesNewlineBeforeClose` | `close`: `context == nonempty` → `newline()` |
| `push_stackGrowsBeyondInitialCapacity` | `push`: `stackSize == stack.length` (array growth) |
| `name_null_throwsNPE` | `name`: `name == null` |
| `name_calledTwiceWithoutValue_throwsIllegalState` | `name`: `deferredName != null` |
| `name_afterWriterClosed_throwsIllegalState` | `name`/`peek`: `stackSize == 0` |
| `beforeName_inArrayContext_throwsIllegalState` | `beforeName`: else-if `context != EMPTY_OBJECT` → throw |
| `beforeName_secondNameInObject_writesComma` | `beforeName`: `context == NONEMPTY_OBJECT` → comma |
| `valueString_null_writesNullLiteral` / `valueString_nonNull_...` | `value(String)`: null branch / non-null branch |
| `jsonValue_null_...` / `jsonValue_nonNull_...` | `jsonValue`: null / non-null branch |
| `nullValue_topLevel_...` | `nullValue`: `deferredName == null` |
| `nullValue_inObjectWithSerializeNullsTrue_...` | `nullValue`: `deferredName!=null && serializeNulls==true` |
| `nullValue_inObjectWithSerializeNullsFalse_...` | `nullValue`: `deferredName!=null && serializeNulls==false` |
| `valueBooleanPrimitive_true/false` | `value(boolean)` ทั้งสองค่า |
| `valueBooleanObject_null/...True/False` | `value(Boolean)`: null / true / false |
| `valueDoublePrimitive_NaN_...` / `_Infinite_...` / `_finite_...` | `value(double)`: NaN, Infinite, finite (ไม่มี lenient escape) |
| `valueLong_writesNumber` | `value(long)` |
| `valueNumber_null/...NaN/...Infinity_lenient/...finite` | `value(Number)`: null, NaN(!lenient), Infinity(lenient), finite |
| `flush_normalState_...` / `flush_afterClose_...` | `flush`: `stackSize==0` true/false |
| `close_incompleteDocument_...` / `close_completeDocument_...` / `close_calledTwice_...` | `close`: `size>1`, `size==1&&stack!=NONEMPTY_DOCUMENT`, idempotent |
| `string_*` (หลายเมธอด) | `string()`: ทุก case ของ replacement table, `c<128`, `c==2028/2029`, `else continue`, htmlSafe on/off, prefix/suffix write branches |
| `newline_withoutIndent_...` / `newline_withIndent_...` | `newline`: `indent==null` true/false, loop หลายระดับ |
| `beforeValue_emptyDocument_...` | `beforeValue`: case `EMPTY_DOCUMENT` |
| `beforeValue_nonEmptyDocument_notLenient_...` / `_lenient_...` | `beforeValue`: case `NONEMPTY_DOCUMENT` กับ `!lenient`/`lenient` |
| `beforeValue_emptyArray_...` / `_nonEmptyArray_...` | `beforeValue`: case `EMPTY_ARRAY` / `NONEMPTY_ARRAY` |
| `beforeValue_danglingName_...` | `beforeValue`: case `DANGLING_NAME` |
| `beforeValue_defaultBranch_valueInObjectWithoutName_...` / `_secondValue...` | `beforeValue`: `default` case (EMPTY_OBJECT / NONEMPTY_OBJECT) |

**หมายเหตุ:** ทุกกรณีอิงจาก behavior ที่อ่านได้จาก source code จริงเท่านั้น (เช่น `value(double)` ไม่มี lenient-escape สำหรับ NaN/Infinite ต่างจาก `value(Number)` ที่มี escape เมื่อ `lenient=true` — เป็น behavior ที่ตรวจสอบจาก source แล้ว ไม่ใช่การเดา)