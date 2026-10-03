package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.apache.commons.lang.exception.NestableRuntimeException;
import org.junit.Test;

/**
 * High Coverage Unit Test Suite for {@link StringEscapeUtils}.
 */
public class StringEscapeUtilsTest {

    // =========================================================================
    // Constructor & Common State
    // =========================================================================

    @Test
    public void testConstructor() {
        assertNotNull(new StringEscapeUtils());
    }

    // =========================================================================
    // Java & JavaScript Escaping Tests
    // =========================================================================

    @Test
    public void testEscapeJava_NullAndEmpty() {
        assertNull(StringEscapeUtils.escapeJava(null));
        assertEquals("", StringEscapeUtils.escapeJava(""));
    }

    @Test
    public void testEscapeJava_WriterNullAndEmpty() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeJava(sw, null);
        assertEquals("", sw.toString());

        try {
            StringEscapeUtils.escapeJava(null, "test");
            fail("Should throw IllegalArgumentException when Writer is null");
        } catch (IllegalArgumentException expected) {
            // Success
        }
    }

    @Test
    public void testEscapeJavaScript_NullAndEmpty() {
        assertNull(StringEscapeUtils.escapeJavaScript(null));
        assertEquals("", StringEscapeUtils.escapeJavaScript(""));
    }

    @Test
    public void testEscapeJavaScript_WriterNullAndEmpty() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeJavaScript(sw, null);
        assertEquals("", sw.toString());

        try {
            StringEscapeUtils.escapeJavaScript(null, "test");
            fail("Should throw IllegalArgumentException when Writer is null");
        } catch (IllegalArgumentException expected) {
            // Success
        }
    }

    @Test
    public void testEscapeJava_SingleQuoteVsDoubleQuote() {
        // Java rules: do not escape single quote, escape double quote
        assertEquals("He didn't say, \\\"Stop!\\\"", StringEscapeUtils.escapeJava("He didn't say, \"Stop!\""));
        assertEquals("'", StringEscapeUtils.escapeJava("'"));
        assertEquals("\\\"", StringEscapeUtils.escapeJava("\""));
        assertEquals("\\\\", StringEscapeUtils.escapeJava("\\"));
    }

    @Test
    public void testEscapeJavaScript_SingleQuoteVsDoubleQuote() {
        // JavaScript rules: escape single quote AND double quote
        assertEquals("He didn\\'t say, \\\"Stop!\\\"", StringEscapeUtils.escapeJavaScript("He didn't say, \"Stop!\""));
        assertEquals("\\'", StringEscapeUtils.escapeJavaScript("'"));
        assertEquals("\\\"", StringEscapeUtils.escapeJavaScript("\""));
        assertEquals("\\\\", StringEscapeUtils.escapeJavaScript("\\"));
    }

    @Test
    public void testEscapeJava_ControlCharacters() {
        // Known control characters
        assertEquals("\\b", StringEscapeUtils.escapeJava("\b"));
        assertEquals("\\t", StringEscapeUtils.escapeJava("\t"));
        assertEquals("\\n", StringEscapeUtils.escapeJava("\n"));
        assertEquals("\\f", StringEscapeUtils.escapeJava("\f"));
        assertEquals("\\r", StringEscapeUtils.escapeJava("\r"));

        // Control characters with default hex branch: ch <= 0xf
        assertEquals("\\u0000", StringEscapeUtils.escapeJava("\u0000"));
        assertEquals("\\u0001", StringEscapeUtils.escapeJava("\u0001"));
        assertEquals("\\u000F", StringEscapeUtils.escapeJava("\u000F"));

        // Control characters with default hex branch: ch > 0xf (< 32)
        assertEquals("\\u0010", StringEscapeUtils.escapeJava("\u0010"));
        assertEquals("\\u001B", StringEscapeUtils.escapeJava("\u001B"));
        assertEquals("\\u001F", StringEscapeUtils.escapeJava("\u001F"));
    }

    @Test
    public void testEscapeJava_UnicodeThresholds() {
        // ch > 0x7f and ch <= 0xff (ISO-8859-1 upper boundary)
        assertEquals("\\u0080", StringEscapeUtils.escapeJava("\u0080"));
        assertEquals("\\u00FF", StringEscapeUtils.escapeJava("\u00FF"));

        // ch > 0xff and ch <= 0xfff
        assertEquals("\\u0100", StringEscapeUtils.escapeJava("\u0100"));
        assertEquals("\\u07FF", StringEscapeUtils.escapeJava("\u07FF"));
        assertEquals("\\u0FFF", StringEscapeUtils.escapeJava("\u0FFF"));

        // ch > 0xfff
        assertEquals("\\u1000", StringEscapeUtils.escapeJava("\u1000"));
        assertEquals("\\u1234", StringEscapeUtils.escapeJava("\u1234"));
        assertEquals("\\uABCD", StringEscapeUtils.escapeJava("\uABCD"));
    }

    // =========================================================================
    // Java & JavaScript Unescaping Tests
    // =========================================================================

    @Test
    public void testUnescapeJava_NullAndEmpty() {
        assertNull(StringEscapeUtils.unescapeJava(null));
        assertEquals("", StringEscapeUtils.unescapeJava(""));
        assertNull(StringEscapeUtils.unescapeJavaScript(null));
        assertEquals("", StringEscapeUtils.unescapeJavaScript(""));
    }

    @Test
    public void testUnescapeJava_WriterNullAndEmpty() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeJava(sw, null);
        assertEquals("", sw.toString());

        try {
            StringEscapeUtils.unescapeJava(null, "test");
            fail("Should throw IllegalArgumentException when Writer is null");
        } catch (IllegalArgumentException expected) {
            // Success
        }

        try {
            StringEscapeUtils.unescapeJavaScript(null, "test");
            fail("Should throw IllegalArgumentException when Writer is null");
        } catch (IllegalArgumentException expected) {
            // Success
        }
    }

    @Test
    public void testUnescapeJava_EscapedCharacters() {
        assertEquals("\\", StringEscapeUtils.unescapeJava("\\\\"));
        assertEquals("'", StringEscapeUtils.unescapeJava("\\'"));
        assertEquals("\"", StringEscapeUtils.unescapeJava("\\\""));
        assertEquals("\r", StringEscapeUtils.unescapeJava("\\r"));
        assertEquals("\f", StringEscapeUtils.unescapeJava("\\f"));
        assertEquals("\t", StringEscapeUtils.unescapeJava("\\t"));
        assertEquals("\n", StringEscapeUtils.unescapeJava("\\n"));
        assertEquals("\b", StringEscapeUtils.unescapeJava("\\b"));
        assertEquals("a", StringEscapeUtils.unescapeJava("\\a")); // Default escaped char
        assertEquals("x", StringEscapeUtils.unescapeJava("\\x")); // Default escaped char
    }

    @Test
    public void testUnescapeJava_Unicode() {
        assertEquals("A", StringEscapeUtils.unescapeJava("\\u0041"));
        assertEquals("hello \u1234 world", StringEscapeUtils.unescapeJava("hello \\u1234 world"));
        assertEquals("\u0000\u001F\u00FF\uFFFF", StringEscapeUtils.unescapeJava("\\u0000\\u001f\\u00ff\\uffff"));
    }

    @Test
    public void testUnescapeJava_InvalidUnicode() {
        try {
            StringEscapeUtils.unescapeJava("\\u00ZZ");
            fail("Expected NestableRuntimeException for malformed unicode");
        } catch (NestableRuntimeException e) {
            assertTrue(e.getMessage().contains("Unable to parse unicode value"));
        }
    }

    @Test
    public void testUnescapeJava_TrailingBackslash() {
        assertEquals("test\\", StringEscapeUtils.unescapeJava("test\\"));
        assertEquals("\\", StringEscapeUtils.unescapeJava("\\"));
    }

    @Test
    public void testUnescapeJavaScript_Integration() throws IOException {
        assertEquals("He didn't say, \"Stop!\"", StringEscapeUtils.unescapeJavaScript("He didn\\'t say, \\\"Stop!\\\""));
        
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeJavaScript(writer, "test\\tstring");
        assertEquals("test\tstring", writer.toString());
    }

    // =========================================================================
    // HTML Escaping & Unescaping Tests
    // =========================================================================

    @Test
    public void testEscapeHtml_NullAndEmpty() throws IOException {
        assertNull(StringEscapeUtils.escapeHtml(null));
        assertEquals("", StringEscapeUtils.escapeHtml(""));

        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeHtml(sw, null);
        assertEquals("", sw.toString());

        try {
            StringEscapeUtils.escapeHtml(null, "bread");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // Success
        }
    }

    @Test
    public void testEscapeHtml_Basic() throws IOException {
        assertEquals("&quot;bread&quot; &amp; &apos;butter&apos;", 
            StringEscapeUtils.escapeHtml("\"bread\" & 'butter'"));

        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeHtml(sw, "<foo>");
        assertEquals("&lt;foo&gt;", sw.toString());
    }

    @Test
    public void testUnescapeHtml_NullAndEmpty() throws IOException {
        assertNull(StringEscapeUtils.unescapeHtml(null));
        assertEquals("", StringEscapeUtils.unescapeHtml(""));

        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeHtml(sw, null);
        assertEquals("", sw.toString());

        try {
            StringEscapeUtils.unescapeHtml(null, "&amp;");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // Success
        }
    }

    @Test
    public void testUnescapeHtml_EntitiesAndUnrecognized() throws IOException {
        assertEquals("<Fran\u00E7ais>", StringEscapeUtils.unescapeHtml("&lt;Fran&ccedil;ais&gt;"));
        assertEquals(">&zzzz;x", StringEscapeUtils.unescapeHtml("&gt;&zzzz;x")); // Unknown entity preserved

        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeHtml(sw, "&quot;hello&quot;");
        assertEquals("\"hello\"", sw.toString());
    }

    // =========================================================================
    // XML Escaping & Unescaping Tests
    // =========================================================================

    @Test
    public void testEscapeXml_NullAndEmpty() throws IOException {
        assertNull(StringEscapeUtils.escapeXml(null));
        assertEquals("", StringEscapeUtils.escapeXml(""));

        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeXml(sw, null);
        assertEquals("", sw.toString());

        try {
            StringEscapeUtils.escapeXml(null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // Success
        }
    }

    @Test
    public void testEscapeXml_Entities() throws IOException {
        assertEquals("&quot;bread&quot; &amp; &apos;butter&apos; &lt; &gt;", 
            StringEscapeUtils.escapeXml("\"bread\" & 'butter' < >"));

        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeXml(sw, "<tag>");
        assertEquals("&lt;tag&gt;", sw.toString());
    }

    @Test
    public void testUnescapeXml_NullAndEmpty() throws IOException {
        assertNull(StringEscapeUtils.unescapeXml(null));
        assertEquals("", StringEscapeUtils.unescapeXml(""));

        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeXml(sw, null);
        assertEquals("", sw.toString());

        try {
            StringEscapeUtils.unescapeXml(null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // Success
        }
    }

    @Test
    public void testUnescapeXml_Entities() throws IOException {
        assertEquals("\"bread\" & 'butter' < >", 
            StringEscapeUtils.unescapeXml("&quot;bread&quot; &amp; &apos;butter&apos; &lt; &gt;"));

        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeXml(sw, "&lt;tag&gt;");
        assertEquals("<tag>", sw.toString());
    }

    // =========================================================================
    // SQL Escaping Tests
    // =========================================================================

    @Test
    public void testEscapeSql() {
        assertNull(StringEscapeUtils.escapeSql(null));
        assertEquals("", StringEscapeUtils.escapeSql(""));
        assertEquals("McHale''s Navy", StringEscapeUtils.escapeSql("McHale's Navy"));
        assertEquals("''''''", StringEscapeUtils.escapeSql("'''"));
        assertEquals("No Quotes", StringEscapeUtils.escapeSql("No Quotes"));
    }
}