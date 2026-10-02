# JsonWriterTest.java

```java
package com.google.gson.stream;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link JsonWriter} (Defects4J Gson-9b)
 * เป้าหมาย: ครอบคลุม branch/condition ให้มากที่สุดเท่าที่วิเคราะห์ได้จากซอร์สที่ให้มา
 */
public class JsonWriterTest {

    private StringWriter sw;
    private JsonWriter writer;

    @Before
    public void setUp() {
        sw = new StringWriter();
        writer = new JsonWriter(sw);
    }

    // ---------- Constructor ----------

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullWriter_throwsNPE() {
        new JsonWriter(null);
    }

    @Test
    public void testConstructor_validWriter_ok() throws IOException {
        JsonWriter w = new JsonWriter(sw);
        w.setLenient(true);
        w.value(1);
        assertEquals("1", sw.toString());
    }

    // ---------- setIndent ----------

    @Test
    public void testSetIndent_empty_compactMode() throws IOException {
        writer.setIndent(""); // indent.length()==0 -> compact, separator=":"
        writer.beginObject();
        writer.name("a").value(1);
        writer.endObject();
        assertEquals("{\"a\":1}", sw.toString());
    }

    @Test
    public void testSetIndent_nonEmpty_prettyMode() throws IOException {
        writer.setIndent("  "); // indent set -> separator=": "
        writer.beginObject();
        writer.name("a");
        writer.beginArray();
        writer.value(1);
        writer.endArray();
        writer.endObject();
        assertEquals("{\n  \"a\": [\n    1\n  ]\n}", sw.toString());
    }

    // NOTE: setIndent(null) จะทำให้เกิด NPE จาก indent.length() ตามซอร์สโค้ดจริง (implicit behavior)
    @Test(expected = NullPointerException.class)
    public void testSetIndent_null_throwsNPE() {
        writer.setIndent(null);
    }

    // ---------- lenient flag ----------

    @Test
    public void testIsLenient_defaultFalse() {
        assertFalse(writer.isLenient());
    }

    @Test
    public void testSetLenient_true() {
        writer.setLenient(true);
        assertTrue(writer.isLenient());
    }

    // ---------- htmlSafe flag ----------

    @Test
    public void testIsHtmlSafe_defaultFalse() {
        assertFalse(writer.isHtmlSafe());
    }

    @Test
    public void testHtmlSafe_escaping() throws IOException {
        writer.setHtmlSafe(true);
        writer.setLenient(true);
        writer.value("<a href='x'>&=</a>");
        String out = sw.toString();
        assertTrue(out.contains("\\u003c"));
        assertTrue(out.contains("\\u003e"));
        assertTrue(out.contains("\\u0026"));
        assertTrue(out.contains("\\u003d"));
        assertTrue(out.contains("\\u0027"));
    }

    @Test
    public void testNotHtmlSafe_noEscapingOfHtmlChars() throws IOException {
        writer.setLenient(true);
        writer.value("<a>&=</a>");
        String out = sw.toString();
        assertTrue(out.contains("<a>&=</a>"));
    }

    // ---------- serializeNulls flag ----------

    @Test
    public void testGetSerializeNulls_defaultTrue() {
        assertTrue(writer.getSerializeNulls());
    }

    @Test
    public void testSetSerializeNulls_false() {
        writer.setSerializeNulls(false);
        assertFalse(writer.getSerializeNulls());
    }

    // ---------- beginArray/endArray/beginObject/endObject basic ----------

    @Test
    public void testBeginEndArray_empty() throws IOException {
        writer.beginArray();
        writer.endArray();
        assertEquals("[]", sw.toString());
    }

    @Test
    public void testBeginEndObject_empty() throws IOException {
        writer.beginObject();
        writer.endObject();
        assertEquals("{}", sw.toString());
    }

    @Test
    public void testNestedArrayInObject() throws IOException {
        writer.beginObject();
        writer.name("arr");
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.endArray();
        writer.endObject();
        assertEquals("{\"arr\":[1,2]}", sw.toString());
    }

    // ---------- close(): Nesting problem branch ----------

    @Test(expected = IllegalStateException.class)
    public void testEndArray_onObjectContext_throwsNestingProblem() throws IOException {
        writer.beginObject();
        writer.endArray(); // context==EMPTY_OBJECT, ไม่ตรงกับ EMPTY_ARRAY/NONEMPTY_ARRAY
    }

    @Test(expected = IllegalStateException.class)
    public void testEndObject_onArrayContext_throwsNestingProblem() throws IOException {
        writer.beginArray();
        writer.endObject();
    }

    // ---------- close(): Dangling name branch ----------

    @Test(expected = IllegalStateException.class)
    public void testEndObject_withDanglingName_throws() throws IOException {
        writer.beginObject();
        writer.name("a");
        writer.endObject(); // deferredName != null
    }

    // ---------- close(): normal close after nonempty content -> newline() invoked ----------

    @Test
    public void testEndArray_afterContent_closesProperly() throws IOException {
        writer.beginArray();
        writer.value(1);
        writer.endArray();
        assertEquals("[1]", sw.toString());
    }

    // ---------- push(): stack growth branch (initial capacity = 32) ----------

    @Test
    public void testPush_stackGrowth_deepNesting() throws IOException {
        writer.beginArray();
        int depth = 40; // มากกว่า capacity เดิม (32) เพื่อบังคับให้ grow
        for (int i = 0; i < depth; i++) {
            writer.beginArray();
        }
        for (int i = 0; i < depth; i++) {
            writer.endArray();
        }
        writer.endArray();
        String result = sw.toString();
        int open = 0, close = 0;
        for (char c : result.toCharArray()) {
            if (c == '[') open++;
            if (c == ']') close++;
        }
        assertEquals(depth + 1, open);
        assertEquals(depth + 1, close);
    }

    // ---------- peek(): "JsonWriter is closed." branch ----------

    @Test(expected = IllegalStateException.class)
    public void testBeginArray_afterClose_throwsClosedException() throws IOException {
        writer.setLenient(true);
        writer.value(1);
        writer.close(); // stackSize -> 0
        writer.beginArray(); // open() -> beforeValue() -> peek() -> stackSize==0
    }

    // ---------- name(): branches ----------

    @Test(expected = NullPointerException.class)
    public void testName_null_throwsNPE() throws IOException {
        writer.beginObject();
        writer.name(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testName_calledTwiceWithoutValue_throws() throws IOException {
        writer.beginObject();
        writer.name("a");
        writer.name("b"); // deferredName != null
    }

    @Test(expected = IllegalStateException.class)
    public void testName_afterClose_throwsClosedException() throws IOException {
        writer.setLenient(true);
        writer.value(1);
        writer.close();
        writer.name("a"); // stackSize == 0
    }

    @Test
    public void testName_normal() throws IOException {
        writer.beginObject();
        writer.name("k").value("v");
        writer.endObject();
        assertEquals("{\"k\":\"v\"}", sw.toString());
    }

    // ---------- writeDeferredName / beforeName branches ----------

    @Test(expected = IllegalStateException.class)
    public void testBeforeName_nestingProblem_whenNotInObject() throws IOException {
        writer.beginArray();
        writer.name("x"); // ตั้ง deferredName ได้ เพราะ name() ไม่ตรวจ context
        writer.value(1);  // trigger writeDeferredName -> beforeName() context=EMPTY_ARRAY -> throw
    }

    @Test
    public void testBeforeName_commaInNonEmptyObject() throws IOException {
        writer.beginObject();
        writer.name("a").value(1);
        writer.name("b").value(2); // context==NONEMPTY_OBJECT -> write ','
        writer.endObject();
        assertEquals("{\"a\":1,\"b\":2}", sw.toString());
    }

    // ---------- value(String) ----------

    @Test
    public void testValueString_null_writesNullLiteral() throws IOException {
        writer.beginArray();
        writer.value((String) null);
        writer.endArray();
        assertEquals("[null]", sw.toString());
    }

    @Test
    public void testValueString_normal() throws IOException {
        writer.beginArray();
        writer.value("hello");
        writer.endArray();
        assertEquals("[\"hello\"]", sw.toString());
    }

    // ---------- jsonValue(String) ----------

    @Test
    public void testJsonValue_null_writesNullLiteral() throws IOException {
        writer.beginArray();
        writer.jsonValue(null);
        writer.endArray();
        assertEquals("[null]", sw.toString());
    }

    @Test
    public void testJsonValue_raw_notEscaped() throws IOException {
        writer.beginArray();
        writer.jsonValue("{\"raw\":1}");
        writer.endArray();
        assertEquals("[{\"raw\":1}]", sw.toString());
    }

    // ---------- nullValue() branches ----------

    @Test
    public void testNullValue_withDeferredName_serializeNullsTrue() throws IOException {
        writer.beginObject();
        writer.name("a");
        writer.nullValue(); // serializeNulls=true -> writeDeferredName ถูกเรียก
        writer.endObject();
        assertEquals("{\"a\":null}", sw.toString());
    }

    @Test
    public void testNullValue_withDeferredName_serializeNullsFalse_skipsNameAndValue() throws IOException {
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("a");
        writer.nullValue(); // ควร skip ทั้งชื่อและค่า
        writer.name("b").value(1);
        writer.endObject();
        assertEquals("{\"b\":1}", sw.toString());
    }

    @Test
    public void testNullValue_withoutDeferredName_inArray() throws IOException {
        writer.beginArray();
        writer.nullValue(); // deferredName == null -> ไปที่ beforeValue() ตรง ๆ
        writer.endArray();
        assertEquals("[null]", sw.toString());
    }

    // ---------- value(boolean) ----------

    @Test
    public void testValueBoolean_true() throws IOException {
        writer.beginArray();
        writer.value(true);
        writer.endArray();
        assertEquals("[true]", sw.toString());
    }

    @Test
    public void testValueBoolean_false() throws IOException {
        writer.beginArray();
        writer.value(false);
        writer.endArray();
        assertEquals("[false]", sw.toString());
    }

    // ---------- value(double) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testValueDouble_NaN_throws() throws IOException {
        writer.beginArray();
        writer.value(Double.NaN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueDouble_PositiveInfinity_throws() throws IOException {
        writer.beginArray();
        writer.value(Double.POSITIVE_INFINITY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueDouble_NegativeInfinity_throws() throws IOException {
        writer.beginArray();
        writer.value(Double.NEGATIVE_INFINITY);
    }

    @Test
    public void testValueDouble_finite_ok() throws IOException {
        writer.beginArray();
        writer.value(1.5d);
        writer.endArray();
        assertEquals("[1.5]", sw.toString());
    }

    // ---------- value(long) ----------

    @Test
    public void testValueLong() throws IOException {
        writer.beginArray();
        writer.value(123456789L);
        writer.endArray();
        assertEquals("[123456789]", sw.toString());
    }

    // ---------- value(Number) ----------

    @Test
    public void testValueNumber_null_writesNullLiteral() throws IOException {
        writer.beginArray();
        writer.value((Number) null);
        writer.endArray();
        assertEquals("[null]", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueNumber_NaN_strict_throws() throws IOException {
        writer.beginArray();
        writer.value(Double.valueOf(Double.NaN));
    }

    @Test
    public void testValueNumber_NaN_lenient_ok() throws IOException {
        writer.setLenient(true);
        writer.beginArray();
        writer.value(Double.valueOf(Double.NaN));
        writer.endArray();
        assertEquals("[NaN]", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueNumber_Infinity_strict_throws() throws IOException {
        writer.beginArray();
        writer.value(Double.valueOf(Double.POSITIVE_INFINITY));
    }

    @Test
    public void testValueNumber_Infinity_lenient_ok() throws IOException {
        writer.setLenient(true);
        writer.beginArray();
        writer.value(Double.valueOf(Double.POSITIVE_INFINITY));
        writer.endArray();
        assertEquals("[Infinity]", sw.toString());
    }

    @Test
    public void testValueNumber_normal() throws IOException {
        writer.beginArray();
        writer.value(Integer.valueOf(42));
        writer.endArray();
        assertEquals("[42]", sw.toString());
    }

    // ---------- flush() ----------

    @Test(expected = IllegalStateException.class)
    public void testFlush_afterClose_throws() throws IOException {
        writer.setLenient(true);
        writer.value(1);
        writer.close();
        writer.flush(); // stackSize == 0
    }

    @Test
    public void testFlush_normal_ok() throws IOException {
        writer.beginArray();
        writer.value(1);
        writer.flush(); // ไม่ throw
        writer.endArray();
        assertEquals("[1]", sw.toString());
    }

    // ---------- close() ----------

    @Test(expected = IOException.class)
    public void testClose_incompleteDocument_unclosedArray_throws() throws IOException {
        writer.beginArray();
        writer.close(); // stackSize>1
    }

    @Test(expected = IOException.class)
    public void testClose_incompleteDocument_emptyDocument_throws() throws IOException {
        writer.close(); // stackSize==1 && stack[0]==EMPTY_DOCUMENT != NONEMPTY_DOCUMENT
    }

    @Test
    public void testClose_completeObject_ok() throws IOException {
        writer.beginObject();
        writer.endObject();
        writer.close(); // size==1 && stack[0]==NONEMPTY_DOCUMENT -> ok
        assertEquals("{}", sw.toString());
    }

    @Test
    public void testClose_lenientSingleValue_ok() throws IOException {
        writer.setLenient(true);
        writer.value(1);
        writer.close();
        assertEquals("1", sw.toString());
    }

    // ---------- beforeValue(): NONEMPTY_DOCUMENT / EMPTY_DOCUMENT branches ----------

    @Test(expected = IllegalStateException.class)
    public void testBeforeValue_multipleTopLevelValues_strict_throws() throws IOException {
        writer.beginArray();
        writer.endArray();
        writer.beginArray(); // second top-level value, lenient=false -> throw
    }

    @Test
    public void testBeforeValue_multipleTopLevelValues_lenient_ok() throws IOException {
        writer.setLenient(true);
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.endArray();
        assertEquals("[][]", sw.toString());
    }

    // ---------- beforeValue(): EMPTY_ARRAY / NONEMPTY_ARRAY branches ----------

    @Test
    public void testBeforeValue_firstInArray_and_anotherInArray() throws IOException {
        writer.beginArray();
        writer.value(1); // EMPTY_ARRAY -> NONEMPTY_ARRAY
        writer.value(2); // NONEMPTY_ARRAY -> append(',')
        writer.endArray();
        assertEquals("[1,2]", sw.toString());
    }

    // ---------- beforeValue(): DANGLING_NAME branch ----------

    @Test
    public void testBeforeValue_danglingNameBranch() throws IOException {
        writer.beginObject();
        writer.name("a").value(1); // DANGLING_NAME -> append(separator)
        writer.endObject();
        assertEquals("{\"a\":1}", sw.toString());
    }

    // ---------- beforeValue(): default -> Nesting problem branch ----------

    @Test(expected = IllegalStateException.class)
    public void testBeforeValue_default_nestingProblem_whenNoNameInObject() throws IOException {
        writer.beginObject();
        writer.value("x"); // ไม่มีการเรียก name() ก่อน -> peek()==EMPTY_OBJECT -> default -> throw
    }

    // ---------- string() escaping branches ----------

    @Test
    public void testString_controlCharsAndQuoteBackslash() throws IOException {
        writer.beginArray();
        writer.value("a\"b\\c\td\be\nf\rg\fh\u0000i");
        writer.endArray();
        String out = sw.toString();
        assertTrue(out.contains("\\\""));
        assertTrue(out.contains("\\\\"));
        assertTrue(out.contains("\\t"));
        assertTrue(out.contains("\\b"));
        assertTrue(out.contains("\\n"));
        assertTrue(out.contains("\\r"));
        assertTrue(out.contains("\\f"));
        assertTrue(out.contains("\\u0000"));
    }

    @Test
    public void testString_unicodeLineAndParagraphSeparator() throws IOException {
        writer.beginArray();
        writer.value("a\u2028b\u2029c");
        writer.endArray();
        String out = sw.toString();
        assertTrue(out.contains("\\u2028"));
        assertTrue(out.contains("\\u2029"));
    }

    @Test
    public void testString_asciiNoEscape_continueBranch() throws IOException {
        writer.beginArray();
        writer.value("plainASCII");
        writer.endArray();
        assertEquals("[\"plainASCII\"]", sw.toString());
    }

    @Test
    public void testString_nonAsciiNotSpecial_continueBranch() throws IOException {
        // อักขระ >=128 ที่ไม่ใช่ \u2028/\u2029 -> ไม่ escape (continue)
        writer.beginArray();
        writer.value("caf\u00e9"); // é (U+00E9)
        writer.endArray();
        assertEquals("[\"caf\u00e9\"]", sw.toString());
    }

    @Test
    public void testString_emptyString() throws IOException {
        writer.beginArray();
        writer.value("");
        writer.endArray();
        assertEquals("[\"\"]", sw.toString());
    }

    // ---------- newline() branch: indent == null ----------

    @Test
    public void testNewline_noIndent_noNewlineWritten() throws IOException {
        // indent==null (ค่า default) -> newline() ต้อง return ทันที ไม่มีการเขียน \n
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.endArray();
        assertFalse(sw.toString().contains("\n"));
    }

    // ---------- Combined scenario สำหรับตรวจ deferredName + indent + multiple names ----------

    @Test
    public void testComplexDocument_withIndentAndMultipleMembers() throws IOException {
        writer.setIndent("  ");
        writer.beginObject();
        writer.name("id").value(1L);
        writer.name("name").value("json_newb");
        writer.name("geo").nullValue();
        writer.endObject();
        String expected =
            "{\n  \"id\": 1,\n  \"name\": \"json_newb\",\n  \"geo\": null\n}";
        assertEquals(expected, sw.toString());
    }
}
```

## ตารางสรุปการครอบคลุม (Branch/Condition Coverage)

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_nullWriter_throwsNPE` / `testConstructor_validWriter_ok` | Constructor: `out == null` true/false |
| `testSetIndent_empty_compactMode` / `testSetIndent_nonEmpty_prettyMode` / `testSetIndent_null_throwsNPE` | `setIndent`: `indent.length()==0` true/false, NPE จาก null implicit |
| `testIsLenient_*`, `testSetLenient_true` | getter/setter lenient |
| `testIsHtmlSafe_*`, `testHtmlSafe_escaping`, `testNotHtmlSafe_noEscapingOfHtmlChars` | `htmlSafe` true/false ผลต่อ replacement table |
| `testGetSerializeNulls_*`, `testSetSerializeNulls_false` | getter/setter serializeNulls |
| `testBeginEndArray_empty`, `testBeginEndObject_empty`, `testNestedArrayInObject` | `beginArray/endArray/beginObject/endObject` เส้นทางปกติ |
| `testEndArray_onObjectContext_throwsNestingProblem`, `testEndObject_onArrayContext_throwsNestingProblem` | `close()`: `context != nonempty && context != empty` = true |
| `testEndObject_withDanglingName_throws` | `close()`: `deferredName != null` = true |
| `testEndArray_afterContent_closesProperly` | `close()`: `context == nonempty` → `newline()` |
| `testPush_stackGrowth_deepNesting` | `push()`: `stackSize == stack.length` growth branch |
| `testBeginArray_afterClose_throwsClosedException` | `peek()`: `stackSize == 0` throw |
| `testName_null_throwsNPE`, `testName_calledTwiceWithoutValue_throws`, `testName_afterClose_throwsClosedException`, `testName_normal` | `name()`: ทุกเงื่อนไข if |
| `testBeforeName_nestingProblem_whenNotInObject`, `testBeforeName_commaInNonEmptyObject` | `beforeName()`: NONEMPTY_OBJECT / else-throw branches |
| `testValueString_*` | `value(String)`: null → nullValue / non-null path |
| `testJsonValue_*` | `jsonValue(String)`: null / raw append |
| `testNullValue_withDeferredName_serializeNullsTrue/False`, `testNullValue_withoutDeferredName_inArray` | `nullValue()`: ทุก branch (deferredName + serializeNulls) |
| `testValueBoolean_true/false` | `value(boolean)` ทั้งสองค่า |
| `testValueDouble_NaN/Infinity/finite` | `value(double)`: isNaN/isInfinite true/false |
| `testValueLong` | `value(long)` เส้นทางปกติ |
| `testValueNumber_null/NaN(strict/lenient)/Infinity(strict/lenient)/normal` | `value(Number)`: ทุก branch รวม lenient check |
| `testFlush_afterClose_throws`, `testFlush_normal_ok` | `flush()`: `stackSize==0` true/false |
| `testClose_incompleteDocument_*`, `testClose_completeObject_ok`, `testClose_lenientSingleValue_ok` | `close()`: `size>1` / `size==1&&!=NONEMPTY_DOCUMENT` / success path |
| `testBeforeValue_multipleTopLevelValues_strict/lenient` | `beforeValue()`: NONEMPTY_DOCUMENT branch (`!lenient` true/false) |
| `testBeforeValue_firstInArray_and_anotherInArray` | `beforeValue()`: EMPTY_ARRAY / NONEMPTY_ARRAY |
| `testBeforeValue_danglingNameBranch` | `beforeValue()`: DANGLING_NAME |
| `testBeforeValue_default_nestingProblem_whenNoNameInObject` | `beforeValue()`: default → throw |
| `testString_controlCharsAndQuoteBackslash`, `testString_unicodeLineAndParagraphSeparator`, `testString_asciiNoEscape_continueBranch`, `testString_nonAsciiNotSpecial_continueBranch`, `testString_emptyString` | `string()`: ทุกสาขาของ loop (c<128 มี/ไม่มี replacement, \u2028, \u2029, continue, last<i, last<length) |
| `testNewline_noIndent_noNewlineWritten`, ใน `testSetIndent_nonEmpty_prettyMode` และ `testComplexDocument_withIndentAndMultipleMembers` | `newline()`: `indent==null` true/false และ loop indentation หลายระดับ |

**หมายเหตุ:** ทุก assertion ของ output string อ้างอิงจากพฤติกรรมที่ปรากฏตรงในซอร์สโค้ด (การต่อ string ตามลำดับ if/else ที่วิเคราะห์ได้) ไม่มีการเดา behavior ที่ไม่มีหลักฐานในซอร์ส ยกเว้นกรณี `setIndent(null)` ซึ่งเป็นผลโดยตรงจาก NPE ของ `String.length()` (คอมเมนต์กำกับไว้ในโค้ด)