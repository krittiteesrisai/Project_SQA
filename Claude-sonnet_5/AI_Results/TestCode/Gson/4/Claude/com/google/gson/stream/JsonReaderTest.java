package com.google.gson.stream;

import static org.junit.Assert.*;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;

public class JsonReaderTest {

    private static JsonReader reader(String json) {
        return new JsonReader(new StringReader(json));
    }

    // ---------- Constructor ----------

    @Test(expected = NullPointerException.class)
    public void constructor_nullReader_throwsNPE() {
        new JsonReader(null);
    }

    // ---------- lenient flag ----------

    @Test
    public void lenient_defaultFalse_andSetter() {
        JsonReader r = reader("[]");
        assertFalse(r.isLenient());
        r.setLenient(true);
        assertTrue(r.isLenient());
        r.setLenient(false);
        assertFalse(r.isLenient());
    }

    // ---------- beginArray / endArray ----------

    @Test
    public void beginArray_success() throws IOException {
        JsonReader r = reader("[]");
        r.beginArray();
        r.endArray();
    }

    @Test
    public void beginArray_wrongType_throws() throws IOException {
        JsonReader r = reader("{}");
        try {
            r.beginArray();
            fail();
        } catch (IllegalStateException expected) {
            assertTrue(expected.getMessage().contains("BEGIN_ARRAY"));
        }
    }

    @Test
    public void endArray_notEnd_throws() throws IOException {
        JsonReader r = reader("[1]");
        r.beginArray();
        try {
            r.endArray();
            fail();
        } catch (IllegalStateException expected) {
            assertTrue(expected.getMessage().contains("END_ARRAY"));
        }
    }

    // ---------- beginObject / endObject ----------

    @Test
    public void beginObject_success() throws IOException {
        JsonReader r = reader("{}");
        r.beginObject();
        r.endObject();
    }

    @Test
    public void beginObject_wrongType_throws() throws IOException {
        JsonReader r = reader("[]");
        try {
            r.beginObject();
            fail();
        } catch (IllegalStateException expected) {
            assertTrue(expected.getMessage().contains("BEGIN_OBJECT"));
        }
    }

    @Test
    public void endObject_notEnd_throws() throws IOException {
        JsonReader r = reader("{\"a\":1}");
        r.beginObject();
        r.nextName();
        r.nextInt();
        try {
            r.endObject();
            fail();
        } catch (IllegalStateException expected) {
            assertTrue(expected.getMessage().contains("END_OBJECT"));
        }
    }

    // ---------- hasNext ----------

    @Test
    public void hasNext_trueThenFalse_array() throws IOException {
        JsonReader r = reader("[1,2]");
        r.beginArray();
        assertTrue(r.hasNext());
        r.nextInt();
        assertTrue(r.hasNext());
        r.nextInt();
        assertFalse(r.hasNext());
        r.endArray();
    }

    // ---------- peek() branches ----------

    @Test
    public void peek_beginEndArrayObject_andEndDocument() throws IOException {
        JsonReader r = reader("[{}]");
        assertEquals(JsonToken.BEGIN_ARRAY, r.peek());
        r.beginArray();
        assertEquals(JsonToken.BEGIN_OBJECT, r.peek());
        r.beginObject();
        assertEquals(JsonToken.END_OBJECT, r.peek());
        r.endObject();
        assertEquals(JsonToken.END_ARRAY, r.peek());
        r.endArray();
        assertEquals(JsonToken.END_DOCUMENT, r.peek());
    }

    @Test
    public void peek_name_doubleQuoted_strict() throws IOException {
        JsonReader r = reader("{\"a\":1}");
        r.beginObject();
        assertEquals(JsonToken.NAME, r.peek());
        assertEquals("a", r.nextName());
    }

    @Test
    public void peek_name_unquoted_lenient() throws IOException {
        JsonReader r = reader("{a:1}");
        r.setLenient(true);
        r.beginObject();
        assertEquals(JsonToken.NAME, r.peek());
        assertEquals("a", r.nextName());
    }

    @Test
    public void peek_name_singleQuoted_lenient() throws IOException {
        JsonReader r = reader("{'a':1}");
        r.setLenient(true);
        r.beginObject();
        assertEquals("a", r.nextName());
    }

    @Test
    public void peek_boolean_trueFalse() throws IOException {
        JsonReader r = reader("[true,false]");
        r.beginArray();
        assertEquals(JsonToken.BOOLEAN, r.peek());
        assertTrue(r.nextBoolean());
        assertFalse(r.nextBoolean());
        r.endArray();
    }

    @Test
    public void peek_null() throws IOException {
        JsonReader r = reader("[null]");
        r.beginArray();
        assertEquals(JsonToken.NULL, r.peek());
        r.nextNull();
        r.endArray();
    }

    @Test
    public void peek_number_longAndDecimal() throws IOException {
        JsonReader r = reader("[123, 1.5]");
        r.beginArray();
        assertEquals(JsonToken.NUMBER, r.peek());
        assertEquals(123L, r.nextLong());
        assertEquals(JsonToken.NUMBER, r.peek());
        assertEquals(1.5, r.nextDouble(), 0);
        r.endArray();
    }

    // NOTE: peek()'s `default: throw new AssertionError();` ไม่สามารถ trigger
    // ผ่าน public API ได้ (dead defensive branch) จึงไม่ครอบคลุมในเทสนี้

    // ---------- nextName ----------

    @Test
    public void nextName_error_notAName() throws IOException {
        JsonReader r = reader("[1]");
        r.beginArray();
        try {
            r.nextName();
            fail();
        } catch (IllegalStateException expected) {
        }
    }

    // ---------- nextString ----------

    @Test
    public void nextString_doubleQuoted() throws IOException {
        JsonReader r = reader("[\"hello\"]");
        r.beginArray();
        assertEquals("hello", r.nextString());
        r.endArray();
    }

    @Test
    public void nextString_singleQuoted_lenient() throws IOException {
        JsonReader r = reader("['hello']");
        r.setLenient(true);
        r.beginArray();
        assertEquals("hello", r.nextString());
        r.endArray();
    }

    @Test
    public void nextString_unquoted_lenient() throws IOException {
        JsonReader r = reader("[hello]");
        r.setLenient(true);
        r.beginArray();
        assertEquals("hello", r.nextString());
        r.endArray();
    }

    @Test
    public void nextString_fromLongNumber() throws IOException {
        JsonReader r = reader("[123]");
        r.beginArray();
        assertEquals("123", r.nextString());
        r.endArray();
    }

    @Test
    public void nextString_fromDecimalNumber() throws IOException {
        JsonReader r = reader("[1.5]");
        r.beginArray();
        assertEquals("1.5", r.nextString());
        r.endArray();
    }

    /**
     * กรณีพิเศษ: nextDouble() ตั้ง peeked=PEEKED_BUFFERED ก่อนเช็ค NaN/Infinite
     * ถ้า throw exception ค่า peekedString ("NaN") จะยังหลงเหลืออยู่
     * ทำให้ nextString() ครั้งต่อไปตกลงในสาขา PEEKED_BUFFERED
     */
    @Test
    public void nextString_bufferedAfterFailedNaNDouble() throws IOException {
        JsonReader r = reader("NaN");
        r.setLenient(true);
        assertEquals(JsonToken.STRING, r.peek()); // tokenize while lenient
        r.setLenient(false);
        try {
            r.nextDouble();
            fail();
        } catch (MalformedJsonException expected) {
        }
        assertEquals("NaN", r.nextString());
    }

    @Test
    public void nextString_error_wrongType() throws IOException {
        JsonReader r = reader("[true]");
        r.beginArray();
        try {
            r.nextString();
            fail();
        } catch (IllegalStateException expected) {
        }
    }

    // ---------- nextBoolean ----------

    @Test
    public void nextBoolean_trueFalse() throws IOException {
        JsonReader r = reader("[true,false]");
        r.beginArray();
        assertTrue(r.nextBoolean());
        assertFalse(r.nextBoolean());
        r.endArray();
    }

    @Test
    public void nextBoolean_error_wrongType() throws IOException {
        JsonReader r = reader("[1]");
        r.beginArray();
        try {
            r.nextBoolean();
            fail();
        } catch (IllegalStateException expected) {
        }
    }

    // ---------- nextNull ----------

    @Test
    public void nextNull_success() throws IOException {
        JsonReader r = reader("[null]");
        r.beginArray();
        r.nextNull();
        r.endArray();
    }

    @Test
    public void nextNull_error_wrongType() throws IOException {
        JsonReader r = reader("[1]");
        r.beginArray();
        try {
            r.nextNull();
            fail();
        } catch (IllegalStateException expected) {
        }
    }

    // ---------- nextDouble ----------

    @Test
    public void nextDouble_fromLong() throws IOException {
        JsonReader r = reader("[123]");
        r.beginArray();
        assertEquals(123.0, r.nextDouble(), 0);
        r.endArray();
    }

    @Test
    public void nextDouble_fromDecimalNumber() throws IOException {
        JsonReader r = reader("[1.5]");
        r.beginArray();
        assertEquals(1.5, r.nextDouble(), 0);
        r.endArray();
    }

    @Test
    public void nextDouble_fromQuotedString() throws IOException {
        JsonReader r = reader("[\"1.5\"]");
        r.beginArray();
        assertEquals(1.5, r.nextDouble(), 0);
        r.endArray();
    }

    @Test
    public void nextDouble_fromUnquotedPlusSign_lenient() throws IOException {
        // '+5' ไม่ผ่าน grammar ของ peekNumber (มี '+' นำหน้า) จึงกลายเป็น PEEKED_UNQUOTED
        JsonReader r = reader("[+5]");
        r.setLenient(true);
        r.beginArray();
        assertEquals(5.0, r.nextDouble(), 0);
        r.endArray();
    }

    @Test
    public void nextDouble_NaN_lenientSucceeds() throws IOException {
        JsonReader r = reader("[NaN]");
        r.setLenient(true);
        r.beginArray();
        assertTrue(Double.isNaN(r.nextDouble()));
        r.endArray();
    }

    @Test
    public void nextDouble_NaN_strictThrows() throws IOException {
        JsonReader r = reader("[NaN]");
        r.setLenient(true);
        r.beginArray();
        r.peek(); // tokenize while lenient
        r.setLenient(false);
        try {
            r.nextDouble();
            fail();
        } catch (MalformedJsonException expected) {
        }
    }

    @Test
    public void nextDouble_error_wrongType() throws IOException {
        JsonReader r = reader("[[]]");
        r.beginArray();
        try {
            r.nextDouble();
            fail();
        } catch (IllegalStateException expected) {
        }
    }

    // ---------- nextLong ----------

    @Test
    public void nextLong_fromLong() throws IOException {
        JsonReader r = reader("[123]");
        r.beginArray();
        assertEquals(123L, r.nextLong());
        r.endArray();
    }

    @Test
    public void nextLong_fromDecimalNumberNoLoss() throws IOException {
        JsonReader r = reader("[1.0]");
        r.beginArray();
        assertEquals(1L, r.nextLong());
        r.endArray();
    }

    @Test
    public void nextLong_precisionLoss_throws() throws IOException {
        JsonReader r = reader("[1.5]");
        r.beginArray();
        try {
            r.nextLong();
            fail();
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void nextLong_fromQuotedValidLong() throws IOException {
        JsonReader r = reader("[\"123\"]");
        r.beginArray();
        assertEquals(123L, r.nextLong());
        r.endArray();
    }

    @Test
    public void nextLong_fromQuotedFallbackToDoubleSuccess() throws IOException {
        JsonReader r = reader("[\"1.0\"]");
        r.beginArray();
        assertEquals(1L, r.nextLong());
        r.endArray();
    }

    @Test
    public void nextLong_fromQuotedFallbackToDoubleFailure() throws IOException {
        JsonReader r = reader("[\"1.5\"]");
        r.beginArray();
        try {
            r.nextLong();
            fail();
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void nextLong_error_wrongType() throws IOException {
        JsonReader r = reader("[true]");
        r.beginArray();
        try {
            r.nextLong();
            fail();
        } catch (IllegalStateException expected) {
        }
    }

    @Test
    public void nextLong_minValueBoundary() throws IOException {
        JsonReader r = reader("[" + Long.MIN_VALUE + "]");
        r.beginArray();
        assertEquals(Long.MIN_VALUE, r.nextLong());
        r.endArray();
    }

    @Test
    public void nextLong_negativeZero() throws IOException {
        JsonReader r = reader("[-0]");
        r.beginArray();
        assertEquals(0L, r.nextLong());
        r.endArray();
    }

    // ---------- nextInt ----------

    @Test
    public void nextInt_fromLong() throws IOException {
        JsonReader r = reader("[123]");
        r.beginArray();
        assertEquals(123, r.nextInt());
        r.endArray();
    }

    @Test
    public void nextInt_longOverflow_throws() throws IOException {
        JsonReader r = reader("[9999999999]");
        r.beginArray();
        try {
            r.nextInt();
            fail();
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void nextInt_fromDecimalNumberNoLoss() throws IOException {
        JsonReader r = reader("[1.0]");
        r.beginArray();
        assertEquals(1, r.nextInt());
        r.endArray();
    }

    @Test
    public void nextInt_precisionLoss_throws() throws IOException {
        JsonReader r = reader("[1.5]");
        r.beginArray();
        try {
            r.nextInt();
            fail();
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void nextInt_fromQuotedValidInt() throws IOException {
        JsonReader r = reader("[\"42\"]");
        r.beginArray();
        assertEquals(42, r.nextInt());
        r.endArray();
    }

    @Test
    public void nextInt_fromQuotedFallbackToDoubleSuccess() throws IOException {
        JsonReader r = reader("[\"1.0\"]");
        r.beginArray();
        assertEquals(1, r.nextInt());
        r.endArray();
    }

    @Test
    public void nextInt_fromQuotedFallbackToDoubleFailure() throws IOException {
        JsonReader r = reader("[\"1.5\"]");
        r.beginArray();
        try {
            r.nextInt();
            fail();
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void nextInt_error_wrongType() throws IOException {
        JsonReader r = reader("[true]");
        r.beginArray();
        try {
            r.nextInt();
            fail();
        } catch (IllegalStateException expected) {
        }
    }

    // ---------- close ----------

    @Test
    public void close_disablesFurtherReads() throws IOException {
        JsonReader r = reader("[]");
        r.close();
        try {
            r.beginArray();
            fail();
        } catch (IllegalStateException expected) {
            assertEquals("JsonReader is closed", expected.getMessage());
        }
    }

    // ---------- skipValue ----------

    @Test
    public void skipValue_nestedArrayAndObject() throws IOException {
        JsonReader r = reader("[1,[2,3],{\"a\":1},true]");
        r.beginArray();
        assertEquals(1, r.nextInt());
        r.skipValue(); // skip [2,3]
        r.skipValue(); // skip {"a":1}
        assertTrue(r.nextBoolean());
        r.endArray();
    }

    @Test
    public void skipValue_numberLiteral() throws IOException {
        JsonReader r = reader("[1.5]");
        r.beginArray();
        r.skipValue(); // PEEKED_NUMBER branch: pos += peekedNumberLength
        r.endArray();
    }

    @Test
    public void skipValue_unquotedLenient() throws IOException {
        JsonReader r = reader("[abc]");
        r.setLenient(true);
        r.beginArray();
        r.skipValue(); // skipUnquotedValue
        r.endArray();
    }

    // ---------- getPath ----------

    @Test
    public void getPath_objectAndArray() throws IOException {
        JsonReader r = reader("{\"a\":[1,2]}");
        r.beginObject();
        r.nextName();
        r.beginArray();
        r.nextInt();
        assertEquals("$.a[1]", r.getPath());
        r.nextInt();
        r.endArray();
        r.endObject();
    }

    // ---------- toString ----------

    @Test
    public void toString_initial() {
        JsonReader r = reader("[]");
        assertEquals("JsonReader at line 1 column 1", r.toString());
    }

    // ---------- lenient-only features ----------

    @Test
    public void lenient_nonExecutePrefix_success() throws IOException {
        JsonReader r = reader(")]}'\n[]");
        r.setLenient(true);
        r.beginArray();
        r.endArray();
    }

    @Test
    public void strict_nonExecutePrefix_throws() throws IOException {
        JsonReader r = reader(")]}'\n[]");
        try {
            r.beginArray();
            fail();
        } catch (MalformedJsonException expected) {
        }
    }

    @Test
    public void lenient_multipleTopLevelValues() throws IOException {
        JsonReader r = reader("[] 2");
        r.setLenient(true);
        r.beginArray();
        r.endArray();
        assertEquals(2, r.nextInt());
    }

    @Test
    public void strict_multipleTopLevelValues_throws() throws IOException {
        JsonReader r = reader("[] 2");
        r.beginArray();
        r.endArray();
        try {
            r.peek();
            fail();
        } catch (MalformedJsonException expected) {
        }
    }

    @Test
    public void lenient_blockComment() throws IOException {
        JsonReader r = reader("[1,/*c*/2]");
        r.setLenient(true);
        r.beginArray();
        assertEquals(1, r.nextInt());
        assertEquals(2, r.nextInt());
        r.endArray();
    }

    @Test
    public void lenient_lineComment() throws IOException {
        JsonReader r = reader("[1,//c\n2]");
        r.setLenient(true);
        r.beginArray();
        assertEquals(1, r.nextInt());
        assertEquals(2, r.nextInt());
        r.endArray();
    }

    @Test
    public void lenient_hashComment() throws IOException {
        JsonReader r = reader("[1,#c\n2]");
        r.setLenient(true);
        r.beginArray();
        assertEquals(1, r.nextInt());
        assertEquals(2, r.nextInt());
        r.endArray();
    }

    @Test
    public void strict_commentThrows() throws IOException {
        JsonReader r = reader("[1,//c\n2]");
        r.beginArray();
        r.nextInt();
        try {
            r.nextInt();
            fail();
        } catch (MalformedJsonException expected) {
        }
    }

    @Test
    public void lenient_unnecessaryArraySeparator_null() throws IOException {
        JsonReader r = reader("[,1]");
        r.setLenient(true);
        r.beginArray();
        assertEquals(JsonToken.NULL, r.peek());
        r.nextNull();
        assertEquals(1, r.nextInt());
        r.endArray();
    }

    @Test
    public void strict_unnecessaryArraySeparator_throws() throws IOException {
        JsonReader r = reader("[,1]");
        r.beginArray();
        try {
            r.peek();
            fail();
        } catch (MalformedJsonException expected) {
        }
    }

    @Test
    public void lenient_nameValueEquals() throws IOException {
        JsonReader r = reader("{a=1}");
        r.setLenient(true);
        r.beginObject();
        assertEquals("a", r.nextName());
        assertEquals(1, r.nextInt());
        r.endObject();
    }

    @Test
    public void lenient_nameValueEqualsArrow() throws IOException {
        JsonReader r = reader("{a=>1}");
        r.setLenient(true);
        r.beginObject();
        assertEquals("a", r.nextName());
        assertEquals(1, r.nextInt());
        r.endObject();
    }

    @Test
    public void lenient_semicolonSeparators() throws IOException {
        JsonReader r = reader("{\"a\":1;\"b\":2}");
        r.setLenient(true);
        r.beginObject();
        assertEquals("a", r.nextName());
        assertEquals(1, r.nextInt());
        assertEquals("b", r.nextName());
        assertEquals(2, r.nextInt());
        r.endObject();
    }

    // ---------- malformed / syntax errors ----------

    @Test
    public void malformed_unterminatedArray_throws() throws IOException {
        JsonReader r = reader("[1 2]");
        r.beginArray();
        r.nextInt();
        try {
            r.nextInt();
            fail();
        } catch (MalformedJsonException expected) {
            assertTrue(expected.getMessage().contains("Unterminated array"));
        }
    }

    @Test
    public void malformed_unterminatedObject_throws() throws IOException {
        JsonReader r = reader("{\"a\":1 \"b\":2}");
        r.beginObject();
        r.nextName();
        r.nextInt();
        try {
            r.nextName();
            fail();
        } catch (MalformedJsonException expected) {
            assertTrue(expected.getMessage().contains("Unterminated object"));
        }
    }

    @Test
    public void malformed_unterminatedArray_EOF_throws() throws IOException {
        JsonReader r = reader("[1,2");
        r.beginArray();
        r.nextInt();
        r.nextInt();
        try {
            r.hasNext();
            fail();
        } catch (EOFException expected) {
        }
    }

    @Test
    public void malformed_unterminatedString_throws() throws IOException {
        JsonReader r = reader("[\"abc");
        r.beginArray();
        try {
            r.nextString();
            fail();
        } catch (MalformedJsonException expected) {
            assertTrue(expected.getMessage().contains("Unterminated string"));
        }
    }

    @Test
    public void malformed_expectedValue_throws() throws IOException {
        JsonReader r = reader("[:]");
        r.beginArray();
        try {
            r.peek();
            fail();
        } catch (MalformedJsonException expected) {
            assertTrue(expected.getMessage().contains("Expected value"));
        }
    }

    @Test
    public void malformed_expectedName_throws() throws IOException {
        JsonReader r = reader("{:1}");
        r.setLenient(true);
        r.beginObject();
        try {
            r.nextName();
            fail();
        } catch (MalformedJsonException expected) {
            assertTrue(expected.getMessage().contains("Expected name"));
        }
    }

    @Test
    public void malformed_expectedNameAfterTrailingComma_throws() throws IOException {
        JsonReader r = reader("{\"a\":1,}");
        r.beginObject();
        r.nextName();
        r.nextInt();
        try {
            r.nextName();
            fail();
        } catch (MalformedJsonException expected) {
            assertTrue(expected.getMessage().contains("Expected name"));
        }
    }

    @Test
    public void malformed_expectedColon_throws() throws IOException {
        JsonReader r = reader("{\"a\" 1}");
        r.beginObject();
        r.nextName();
        try {
            r.nextInt();
            fail();
        } catch (MalformedJsonException expected) {
            assertTrue(expected.getMessage().contains("Expected ':'"));
        }
    }

    // ---------- number-parsing edge cases ----------

    @Test
    public void leadingZero_lenient_asUnquotedString() throws IOException {
        // peekNumber() ปฏิเสธเลขนำหน้าด้วย 0 (เช่น "01") -> ตกไปเป็น PEEKED_UNQUOTED
        JsonReader r = reader("01");
        r.setLenient(true);
        assertEquals(JsonToken.STRING, r.peek());
        assertEquals("01", r.nextString());
    }

    @Test
    public void number_withExponent() throws IOException {
        JsonReader r = reader("[1e2]");
        r.beginArray();
        assertEquals(100.0, r.nextDouble(), 0);
        r.endArray();
    }

    // ---------- stack growth (push resize) ----------

    @Test
    public void deepNesting_stackGrowth() throws IOException {
        int depth = 40; // > initial stack length (32) -> triggers push() resize
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) sb.append('[');
        for (int i = 0; i < depth; i++) sb.append(']');
        JsonReader r = reader(sb.toString());
        for (int i = 0; i < depth; i++) r.beginArray();
        for (int i = 0; i < depth; i++) r.endArray();
        assertEquals(JsonToken.END_DOCUMENT, r.peek());
    }
}
