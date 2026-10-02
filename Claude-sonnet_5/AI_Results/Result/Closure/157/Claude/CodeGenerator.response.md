# CodeGeneratorTest.java

**หมายเหตุสำคัญก่อนเริ่ม:**
เมธอด `add(Node, Context)` และ private helper ที่เกี่ยวกับ Node (เช่น `addNonEmptyStatement`, `isOneExactlyFunctionOrDo`, `getNonEmptyChildCount`) ต้องพึ่งพา `Node`, `Token`, และ `CodeConsumer` ซึ่ง**ไม่มีซอร์สโค้ดให้มา** การสร้าง mock/สาขาคลาสของ `CodeConsumer` โดยไม่รู้ signature ที่แท้จริงจะเป็นการ "เดา" ซึ่งขัดกับข้อกำหนด #4 จึงเลี่ยงการทดสอบส่วนนี้โดยตรง

ส่วนที่ทดสอบได้จริงและปลอดภัย (ไม่ต้องเดา behavior ของคลาสอื่น) คือ:
- Constructor logic (branch ของ `outputCharset`) — ทดสอบผ่าน reflection กับ field `outputCharsetEncoder` โดยส่ง `null` เป็น `CodeConsumer` (ไม่มีการเรียกเมธอดใดๆ ของมันใน constructor จึงไม่พังแม้เป็น `null`)
- `tagAsStrict()` — ทดสอบ NPE เมื่อ `cc` เป็น null (ครอบคลุม null-handling)
- Static utility methods ทั้งหมด: `jsString`, `regexpEscape` (2 overload), `escapeToDoubleQuotedJsString`, `strEscape`, `identifierEscape`
- `appendHexJavaScriptRepresentation(int, Appendable)` (private) ผ่าน reflection เพื่อ cover branch `Character.isSupplementaryCodePoint` ซึ่งไม่ถูกเรียกผ่าน public path ใดๆ ในซอร์สที่ให้มา (เพราะ caller ทั้งหมดส่ง `char` เดี่ยวเท่านั้น)

สำหรับ `identifierEscape` ผลลัพธ์ขึ้นกับ `NodeUtil.isLatin(...)` ซึ่งไม่มีซอร์สให้ — ได้ใส่คอมเมนต์ระบุ **assumption** ไว้ชัดเจนตามข้อกำหนด #4

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

import com.google.common.base.Charsets;

/**
 * Unit tests for {@link CodeGenerator}.
 *
 * ขอบเขตการทดสอบ: เฉพาะส่วนที่ไม่ต้องพึ่งพา Node/CodeConsumer internals
 * ซึ่งไม่มีซอร์สโค้ดให้มาในโจทย์ (ดูคำอธิบายด้านบน)
 */
public class CodeGeneratorTest {

    // ---------------------------------------------------------------
    // Reflection helper
    // ---------------------------------------------------------------
    private Object getPrivateField(Object target, String fieldName) throws Exception {
        Field f = CodeGenerator.class.getDeclaredField(fieldName);
        f.setAccessible(true);
        return f.get(target);
    }

    // =================================================================
    // Constructor branch tests: outputCharset == null / US_ASCII / other
    // =================================================================

    @Test
    public void testConstructor_NullCharset_EncoderIsNull() throws Exception {
        // consumer=null is safe: constructor only assigns it to field "cc",
        // no method is invoked on it during construction.
        CodeGenerator cg = new CodeGenerator(null, null);
        Object encoder = getPrivateField(cg, "outputCharsetEncoder");
        assertNull(encoder);
    }

    @Test
    public void testConstructor_USASCIICharset_EncoderIsNull() throws Exception {
        CodeGenerator cg = new CodeGenerator(null, Charsets.US_ASCII);
        Object encoder = getPrivateField(cg, "outputCharsetEncoder");
        assertNull(encoder);
    }

    @Test
    public void testConstructor_UTF8Charset_EncoderIsNotNull() throws Exception {
        CodeGenerator cg = new CodeGenerator(null, Charsets.UTF_8);
        Object encoder = getPrivateField(cg, "outputCharsetEncoder");
        assertNotNull(encoder);
        assertTrue(encoder instanceof CharsetEncoder);
    }

    @Test
    public void testConstructor_SingleArgOverload_DefaultsToNullCharsetBehavior() throws Exception {
        // Single-arg constructor delegates to (consumer, null)
        CodeGenerator cg = new CodeGenerator(null);
        Object encoder = getPrivateField(cg, "outputCharsetEncoder");
        assertNull(encoder);
    }

    // =================================================================
    // tagAsStrict()
    // =================================================================

    @Test(expected = NullPointerException.class)
    public void testTagAsStrict_NullConsumer_ThrowsNPE() {
        // cc == null -> add(String) -> cc.add(str) throws NPE.
        CodeGenerator cg = new CodeGenerator(null, null);
        cg.tagAsStrict();
    }

    // =================================================================
    // jsString(String, CharsetEncoder) branch tests
    // =================================================================

    @Test
    public void testJsString_MoreDoubleQuotesThanSingle_UsesSingleQuoteDelimiter() {
        // doubleq=2, singleq=1 -> singleq < doubleq == true -> quote = '\''
        String input = "a\"b\"c'd";
        String result = CodeGenerator.jsString(input, null);
        assertEquals("'a\"b\"c\\'d'", result);
    }

    @Test
    public void testJsString_MoreSingleQuotesThanDouble_UsesDoubleQuoteDelimiter() {
        // singleq=2, doubleq=0 -> singleq < doubleq == false -> else branch, quote = '"'
        String input = "it's a test's";
        String result = CodeGenerator.jsString(input, null);
        assertEquals("\"it's a test's\"", result);
    }

    @Test
    public void testJsString_EqualQuoteCounts_UsesDoubleQuoteDelimiter() {
        // singleq == doubleq -> else branch (double quote delimiter, escape ")
        String input = "a'b\"c";
        String result = CodeGenerator.jsString(input, null);
        assertEquals("\"a'b\\\"c\"", result);
    }

    @Test
    public void testJsString_EmptyString_UsesDoubleQuoteDelimiter() {
        // singleq == doubleq == 0 -> else branch
        String result = CodeGenerator.jsString("", null);
        assertEquals("\"\"", result);
    }

    // =================================================================
    // regexpEscape() branch tests
    // =================================================================

    @Test
    public void testRegexpEscape_SimpleString_NoEncoder() {
        String result = CodeGenerator.regexpEscape("abc", null);
        assertEquals("/abc/", result);
    }

    @Test
    public void testRegexpEscape_WithBackslash_PreservesSingleBackslash() {
        // For regexpEscape backslashEscape == "\\" (single backslash, not doubled)
        String result = CodeGenerator.regexpEscape("a\\d", null);
        assertEquals("/a\\d/", result);
    }

    @Test
    public void testRegexpEscape_OverloadWithoutEncoder_DelegatesWithNull() {
        String result = CodeGenerator.regexpEscape("x");
        assertEquals("/x/", result);
    }

    // =================================================================
    // escapeToDoubleQuotedJsString()
    // =================================================================

    @Test
    public void testEscapeToDoubleQuotedJsString_EscapesQuotesAndBackslashes() {
        String input = "he said \"hi\" \\ ok";
        String result = CodeGenerator.escapeToDoubleQuotedJsString(input);
        String expected = "\"" + "he said " + "\\\"" + "hi" + "\\\"" + " " + "\\\\" + " ok" + "\"";
        assertEquals(expected, result);
    }

    @Test
    public void testEscapeToDoubleQuotedJsString_SingleQuoteNotEscaped() {
        String input = "it's fine";
        String result = CodeGenerator.escapeToDoubleQuotedJsString(input);
        assertEquals("\"it's fine\"", result);
    }

    // =================================================================
    // strEscape() - direct branch tests on the switch statement
    // =================================================================

    @Test
    public void testStrEscape_NullChar() {
        String result = CodeGenerator.strEscape("\0", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"\\0\"", result);
    }

    @Test
    public void testStrEscape_Newline() {
        String result = CodeGenerator.strEscape("\n", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"\\n\"", result);
    }

    @Test
    public void testStrEscape_CarriageReturn() {
        String result = CodeGenerator.strEscape("\r", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"\\r\"", result);
    }

    @Test
    public void testStrEscape_Tab() {
        String result = CodeGenerator.strEscape("\t", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"\\t\"", result);
    }

    @Test
    public void testStrEscape_Backslash_UsesGivenEscape() {
        String result = CodeGenerator.strEscape("\\", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"\\\\\"", result);
    }

    @Test
    public void testStrEscape_DoubleQuote_UsesGivenEscape() {
        String result = CodeGenerator.strEscape("\"", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"\\\"\"", result);
    }

    @Test
    public void testStrEscape_SingleQuote_UsesGivenEscape() {
        String result = CodeGenerator.strEscape("'", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"'\"", result);
    }

    @Test
    public void testStrEscape_GreaterThan_AfterDoubleDash_IsEscaped() {
        String result = CodeGenerator.strEscape("-->", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"--\\>\"", result);
    }

    @Test
    public void testStrEscape_GreaterThan_AfterDoubleBracket_IsEscaped() {
        String result = CodeGenerator.strEscape("]]>", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"]]\\>\"", result);
    }

    @Test
    public void testStrEscape_GreaterThan_NotPreceded_LiteralOutput() {
        String result = CodeGenerator.strEscape("a>b", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"a>b\"", result);
    }

    @Test
    public void testStrEscape_GreaterThan_IndexBelowTwo_LiteralOutput() {
        // '>' at index 0 -> i>=2 condition is false regardless of prefix
        String result = CodeGenerator.strEscape(">ab", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\">ab\"", result);
    }

    @Test
    public void testStrEscape_LessThan_ScriptCloseTag_CaseInsensitive_IsEscaped() {
        String result = CodeGenerator.strEscape("</SCRIPT", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"<\\/SCRIPT\"", result);
    }

    @Test
    public void testStrEscape_LessThan_CommentOpen_CaseSensitive_IsEscaped() {
        String result = CodeGenerator.strEscape("<!--", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"<\\!--\"", result);
    }

    @Test
    public void testStrEscape_LessThan_NoMatch_LiteralOutput() {
        String result = CodeGenerator.strEscape("<div>", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"<div>\"", result);
    }

    @Test
    public void testStrEscape_DefaultBranch_NoEncoder_BoundaryBelowRange_IsEscaped() {
        // c = 0x1F -> (c > 0x1f) is false -> hex-escaped
        String result = CodeGenerator.strEscape("\u001F", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"\\u001f\"", result);
    }

    @Test
    public void testStrEscape_DefaultBranch_NoEncoder_BoundaryLowerBound_IsLiteral() {
        // c = 0x20 -> in range -> literal
        String result = CodeGenerator.strEscape(" ", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\" \"", result);
    }

    @Test
    public void testStrEscape_DefaultBranch_NoEncoder_BoundaryUpperBound_IsLiteral() {
        // c = 0x7F -> (c <= 0x7f) is true -> literal
        String result = CodeGenerator.strEscape("\u007F", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"\u007F\"", result);
    }

    @Test
    public void testStrEscape_DefaultBranch_NoEncoder_AboveRange_IsEscaped() {
        // c = 0x80 -> (c <= 0x7f) is false -> hex-escaped
        String result = CodeGenerator.strEscape("\u0080", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"\\u0080\"", result);
    }

    @Test
    public void testStrEscape_DefaultBranch_WithEncoder_CanEncode_LiteralOutput() {
        CharsetEncoder encoder = Charset.forName("ISO-8859-1").newEncoder();
        // U+00E9 ('é') is representable in ISO-8859-1
        String result = CodeGenerator.strEscape("\u00E9", '"', "\\\"", "'", "\\\\", encoder);
        assertEquals("\"\u00E9\"", result);
    }

    @Test
    public void testStrEscape_DefaultBranch_WithEncoder_CannotEncode_HexEscaped() {
        CharsetEncoder encoder = Charset.forName("ISO-8859-1").newEncoder();
        // U+4E2D (CJK) is NOT representable in ISO-8859-1
        String result = CodeGenerator.strEscape("\u4E2D", '"', "\\\"", "'", "\\\\", encoder);
        assertEquals("\"\\u4e2d\"", result);
    }

    // =================================================================
    // identifierEscape()
    // NOTE: behavior depends on NodeUtil.isLatin(...), whose source is not
    // provided. Assumption (commented): plain ASCII identifiers are "Latin"
    // (fast-path returns unchanged); a string containing a CJK character is
    // NOT "Latin" (triggers the escaping loop).
    // =================================================================

    @Test
    public void testIdentifierEscape_PureAsciiIdentifier_ReturnsUnchanged() {
        String result = CodeGenerator.identifierEscape("hello123");
        assertEquals("hello123", result);
    }

    @Test
    public void testIdentifierEscape_NonLatinCharacter_IsHexEscaped() {
        String result = CodeGenerator.identifierEscape("a\u4E2Db");
        assertEquals("a\\u4e2db", result);
    }

    // =================================================================
    // appendHexJavaScriptRepresentation(int, Appendable) via reflection
    // Covers the Character.isSupplementaryCodePoint branch, which is not
    // reachable from any public entry point in the given source (all
    // callers only ever pass a single UTF-16 char, never a full
    // supplementary code point).
    // =================================================================

    @Test
    public void testAppendHexJavaScriptRepresentation_SupplementaryCodePoint_SplitsSurrogatePair()
            throws Exception {
        Method m = CodeGenerator.class.getDeclaredMethod(
                "appendHexJavaScriptRepresentation", int.class, Appendable.class);
        m.setAccessible(true);

        int supplementaryCodePoint = 0x1F600; // requires surrogate pair
        StringBuilder sb = new StringBuilder();
        m.invoke(null, supplementaryCodePoint, sb);

        char[] surrogates = Character.toChars(supplementaryCodePoint);
        String expected = String.format("\\u%04x", (int) surrogates[0])
                + String.format("\\u%04x", (int) surrogates[1]);
        assertEquals(expected, sb.toString());
    }

    @Test
    public void testAppendHexJavaScriptRepresentation_NonSupplementary_SingleEscape()
            throws Exception {
        Method m = CodeGenerator.class.getDeclaredMethod(
                "appendHexJavaScriptRepresentation", int.class, Appendable.class);
        m.setAccessible(true);

        StringBuilder sb = new StringBuilder();
        m.invoke(null, (int) 'A', sb);

        assertEquals("\\u0041", sb.toString());
    }
}
```

## ตารางสรุป Test coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testConstructor_NullCharset_EncoderIsNull | Constructor: `outputCharset == null` → encoder = null |
| testConstructor_USASCIICharset_EncoderIsNull | Constructor: `outputCharset == Charsets.US_ASCII` → encoder = null |
| testConstructor_UTF8Charset_EncoderIsNotNull | Constructor: else branch → encoder != null |
| testConstructor_SingleArgOverload_DefaultsToNullCharsetBehavior | Overload constructor delegation |
| testTagAsStrict_NullConsumer_ThrowsNPE | `add(String)` null-consumer path (fault-detection: NPE ต้องเกิด) |
| testJsString_MoreDoubleQuotesThanSingle... | `jsString`: `singleq < doubleq == true` |
| testJsString_MoreSingleQuotesThanDouble... | `jsString`: `singleq < doubleq == false` (single>double) |
| testJsString_EqualQuoteCounts... | `jsString`: else branch เมื่อ count เท่ากัน |
| testJsString_EmptyString... | boundary: string ว่าง |
| testRegexpEscape_SimpleString_NoEncoder | `regexpEscape` ปกติ ไม่มีอักขระพิเศษ |
| testRegexpEscape_WithBackslash... | backslash escape เป็นตัวเดียว (ไม่ double) |
| testRegexpEscape_OverloadWithoutEncoder... | overload `regexpEscape(String)` |
| testEscapeToDoubleQuotedJsString_EscapesQuotesAndBackslashes | escape `"` และ `\` |
| testEscapeToDoubleQuotedJsString_SingleQuoteNotEscaped | `'` ไม่ถูก escape |
| testStrEscape_NullChar/Newline/CarriageReturn/Tab | switch case `\0`,`\n`,`\r`,`\t` |
| testStrEscape_Backslash_UsesGivenEscape | switch case `\\` |
| testStrEscape_DoubleQuote_UsesGivenEscape | switch case `"` |
| testStrEscape_SingleQuote_UsesGivenEscape | switch case `'` |
| testStrEscape_GreaterThan_AfterDoubleDash_IsEscaped | `'>'` preceded by `--` → escape |
| testStrEscape_GreaterThan_AfterDoubleBracket_IsEscaped | `'>'` preceded by `]]` → escape |
| testStrEscape_GreaterThan_NotPreceded_LiteralOutput | `'>'` ไม่ match เงื่อนไข → literal |
| testStrEscape_GreaterThan_IndexBelowTwo_LiteralOutput | boundary `i >= 2` เป็น false |
| testStrEscape_LessThan_ScriptCloseTag_CaseInsensitive_IsEscaped | `'<'` match `/script` (ignoreCase) |
| testStrEscape_LessThan_CommentOpen_CaseSensitive_IsEscaped | `'<'` match `!--` (case-sensitive) |
| testStrEscape_LessThan_NoMatch_LiteralOutput | `'<'` ไม่ match ทั้งสองเงื่อนไข |
| testStrEscape_DefaultBranch_NoEncoder_BoundaryBelowRange_IsEscaped | boundary `c=0x1F` → escape |
| testStrEscape_DefaultBranch_NoEncoder_BoundaryLowerBound_IsLiteral | boundary `c=0x20` → literal |
| testStrEscape_DefaultBranch_NoEncoder_BoundaryUpperBound_IsLiteral | boundary `c=0x7F` → literal |
| testStrEscape_DefaultBranch_NoEncoder_AboveRange_IsEscaped | boundary `c=0x80` → escape |
| testStrEscape_DefaultBranch_WithEncoder_CanEncode_LiteralOutput | `encoder != null`, `canEncode==true` |
| testStrEscape_DefaultBranch_WithEncoder_CannotEncode_HexEscaped | `encoder != null`, `canEncode==false` |
| testIdentifierEscape_PureAsciiIdentifier_ReturnsUnchanged | `isLatin==true` fast path (assumption) |
| testIdentifierEscape_NonLatinCharacter_IsHexEscaped | `isLatin==false`, loop escape (assumption) |
| testAppendHexJavaScriptRepresentation_SupplementaryCodePoint... | `Character.isSupplementaryCodePoint == true` |
| testAppendHexJavaScriptRepresentation_NonSupplementary... | `Character.isSupplementaryCodePoint == false` |

**ข้อจำกัด/สิ่งที่ไม่ได้ทดสอบ (ตามข้อกำหนดห้ามเดา):** สาขาทั้งหมดใน `add(Node, Context)` (TRY, CATCH, FOR, IF, SWITCH, OBJECTLIT, ฯลฯ) และ private helper ที่รับ `Node` เช่น `addNonEmptyStatement`, `isOneExactlyFunctionOrDo`, `getNonEmptyChildCount` เนื่องจากต้องพึ่งพา `Node`/`Token`/`CodeConsumer` ที่ไม่มีซอร์สโค้ดมาให้ในโจทย์