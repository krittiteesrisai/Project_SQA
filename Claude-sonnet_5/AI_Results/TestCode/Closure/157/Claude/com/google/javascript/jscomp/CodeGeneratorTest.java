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
