package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.apache.commons.lang.exception.NestableRuntimeException;
import org.junit.Test;

/**
 * Unit tests for {@link StringEscapeUtils}.
 */
public class StringEscapeUtilsTest {

    // -----------------------------------------------------------------------
    // Constructor & Introspection Tests
    // -----------------------------------------------------------------------

    @Test
    public void testConstructor() {
        assertNotNull(new StringEscapeUtils());
        Constructor<?>[] cons = StringEscapeUtils.class.getDeclaredConstructors();
        assertEquals(1, cons.length);
        assertTrue(Modifier.isPublic(cons[0].getModifiers()));
    }

    // -----------------------------------------------------------------------
    // Java and JavaScript Escape Tests
    // -----------------------------------------------------------------------

    @Test
    public void testEscapeJava() throws IOException {
        assertNull(StringEscapeUtils.escapeJava(null));
        assertEquals("", StringEscapeUtils.escapeJava(""));
        assertEquals("He didn't say, \\\"Stop!\\\"", StringEscapeUtils.escapeJava("He didn't say, \"Stop!\""));

        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeJava(sw, null);
        assertEquals("", sw.toString());

        sw = new StringWriter();
        StringEscapeUtils.escapeJava(sw, "He didn't say, \"Stop!\"");
        assertEquals("He didn't say, \\\"Stop!\\\"", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeJavaNullWriter() throws IOException {
        StringEscapeUtils.escapeJava(null, "test");
    }

    @Test
    public void testEscapeJavaScript() throws IOException {
        assertNull(StringEscapeUtils.escapeJavaScript(null));
        assertEquals("", StringEscapeUtils.escapeJavaScript(""));
        assertEquals("He didn\\'t say, \\\"Stop!\\\"", StringEscapeUtils.escapeJavaScript("He didn't say, \"Stop!\""));

        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeJavaScript(sw, null);
        assertEquals("", sw.toString());

        sw = new StringWriter();
        StringEscapeUtils.escapeJavaScript(sw, "He didn't say, \"Stop!\"");
        assertEquals("He didn\\'t say, \\\"Stop!\\\"", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeJavaScriptNullWriter() throws IOException {
        StringEscapeUtils.escapeJavaScript(null, "test");
    }

    @Test
    public void testEscapeJavaStyleStringBoundaryAndSpecialChars() {
        // Control characters with special escapes: \b, \t, \n, \f, \r
        assertEquals("\\b\\t\\n\\f\\r", StringEscapeUtils.escapeJava("\b\t\n\f\r"));
        
        // Control characters < 32 without special escapes
        // ch <= 0xf (e.g. 0x01) -> \u0001
        assertEquals("\\u0001", StringEscapeUtils.escapeJava("\u0001"));
        // ch > 0xf (e.g. 0x1F) -> \u001F
        assertEquals("\\u001F", StringEscapeUtils.escapeJava("\u001F"));

        // Special characters: single quote, double quote, backslash, forward slash
        assertEquals("'", StringEscapeUtils.escapeJava("'"));
        assertEquals("\\'", StringEscapeUtils.escapeJavaScript("'"));
        assertEquals("\\\"", StringEscapeUtils.escapeJava("\""));
        assertEquals("\\\\", StringEscapeUtils.escapeJava("\\"));
        assertEquals("\\/", StringEscapeUtils.escapeJava("/"));

        // Unicode range tests:
        // ch > 0x7f and ch <= 0xff (e.g. 0x00A0) -> \u00A0
        assertEquals("\\u00A0", StringEscapeUtils.escapeJava("\u00A0"));
        // ch > 0xff and ch <= 0xfff (e.g. 0x0100) -> \u0100
        assertEquals("\\u0100", StringEscapeUtils.escapeJava("\u0100"));
        // ch > 0xfff (e.g. 0x1234) -> \u1234
        assertEquals("\\u1234", StringEscapeUtils.escapeJava("\u1234"));
    }

    // -----------------------------------------------------------------------
    // Java and JavaScript Unescape Tests
    // -----------------------------------------------------------------------

    @Test
    public void testUnescapeJava() throws IOException {
        assertNull(StringEscapeUtils.unescapeJava(null));
        assertEquals("", StringEscapeUtils.unescapeJava(""));
        assertEquals("He didn't say, \"Stop!\"", StringEscapeUtils.unescapeJava("He didn't say, \\\"Stop!\\\""));

        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeJava(sw, null);
        assertEquals("", sw.toString());

        sw = new StringWriter();
        StringEscapeUtils.unescapeJava(sw, "He didn't say, \\\"Stop!\\\"");
        assertEquals("He didn't say, \"Stop!\"", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeJavaNullWriter() throws IOException {
        StringEscapeUtils.unescapeJava((Writer) null, "test");
    }

    @Test
    public void testUnescapeJavaScript() throws IOException {
        assertNull(StringEscapeUtils.unescapeJavaScript(null));
        assertEquals("", StringEscapeUtils.unescapeJavaScript(""));
        assertEquals("He didn't say, \"Stop!\"", StringEscapeUtils.unescapeJavaScript("He didn\\'t say, \\\"Stop!\\\""));

        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeJavaScript(sw, null);
        assertEquals("", sw.toString());

        sw = new StringWriter();
        StringEscapeUtils.unescapeJavaScript(sw, "He didn\\'t say, \\\"Stop!\\\"");
        assertEquals("He didn't say, \"Stop!\"", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeJavaScriptNullWriter() throws IOException {
        StringEscapeUtils.unescapeJavaScript((Writer) null, "test");
    }

    @Test
    public void testUnescapeJavaSpecialCharsAndBranches() {
        // Escaped control characters: \b, \t, \n, \f, \r, \', \", \\
        assertEquals("\b\t\n\f\r\'\"\\", StringEscapeUtils.unescapeJava("\\b\\t\\n\\f\\r\\\'\\\"\\\\"));

        // Unicode unescape
        assertEquals("A", StringEscapeUtils.unescapeJava("\\u0041"));
        assertEquals("\u1234", StringEscapeUtils.unescapeJava("\\u1234"));

        // Trailing single backslash at the end of string
        assertEquals("test\\", StringEscapeUtils.unescapeJava("test\\"));
        assertEquals("\\", StringEscapeUtils.unescapeJava("\\"));

        // Backslash followed by normal non-escaped char (default case)
        assertEquals("k", StringEscapeUtils.unescapeJava("\\k"));
    }

    @Test(expected = NestableRuntimeException.class)
    public void testUnescapeJavaInvalidUnicode() {
        // Less than 4 valid hex chars / invalid hex should throw NestableRuntimeException
        StringEscapeUtils.unescapeJava("\\u00ZZ");
    }

    // -----------------------------------------------------------------------
    // HTML Escape & Unescape Tests
    // -----------------------------------------------------------------------

    @Test
    public void testEscapeHtml() throws IOException {
        assertNull(StringEscapeUtils.escapeHtml(null));
        assertEquals("", StringEscapeUtils.escapeHtml(""));
        assertEquals("&quot;bread&quot; &amp; &lt;butter&gt;", StringEscapeUtils.escapeHtml("\"bread\" & <butter>"));

        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeHtml(sw, null);
        assertEquals("", sw.toString());

        sw = new StringWriter();
        StringEscapeUtils.escapeHtml(sw, "\"bread\" & <butter>");
        assertEquals("&quot;bread&quot; &amp; &lt;butter&gt;", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeHtmlNullWriter() throws IOException {
        StringEscapeUtils.escapeHtml(null, "test");
    }

    @Test
    public void testUnescapeHtml() throws IOException {
        assertNull(StringEscapeUtils.unescapeHtml(null));
        assertEquals("", StringEscapeUtils.unescapeHtml(""));
        assertEquals("\"bread\" & <butter>", StringEscapeUtils.unescapeHtml("&quot;bread&quot; &amp; &lt;butter&gt;"));
        assertEquals("&zzzz;x", StringEscapeUtils.unescapeHtml("&zzzz;x")); // unknown entity remains verbatim

        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeHtml(sw, null);
        assertEquals("", sw.toString());

        sw = new StringWriter();
        StringEscapeUtils.unescapeHtml(sw, "&quot;bread&quot; &amp; &lt;butter&gt;");
        assertEquals("\"bread\" & <butter>", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeHtmlNullWriter() throws IOException {
        StringEscapeUtils.unescapeHtml(null, "test");
    }

    // -----------------------------------------------------------------------
    // XML Escape & Unescape Tests
    // -----------------------------------------------------------------------

    @Test
    public void testEscapeXml() throws IOException {
        assertNull(StringEscapeUtils.escapeXml(null));
        assertEquals("", StringEscapeUtils.escapeXml(""));
        assertEquals("&quot;bread&quot; &amp; &apos;butter&apos; &lt;tag&gt;",
                StringEscapeUtils.escapeXml("\"bread\" & 'butter' <tag>"));

        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeXml(sw, null);
        assertEquals("", sw.toString());

        sw = new StringWriter();
        StringEscapeUtils.escapeXml(sw, "\"bread\" & 'butter' <tag>");
        assertEquals("&quot;bread&quot; &amp; &apos;butter&apos; &lt;tag&gt;", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeXmlNullWriter() throws IOException {
        StringEscapeUtils.escapeXml((Writer) null, "test");
    }

    @Test
    public void testUnescapeXml() throws IOException {
        assertNull(StringEscapeUtils.unescapeXml(null));
        assertEquals("", StringEscapeUtils.unescapeXml(""));
        assertEquals("\"bread\" & 'butter' <tag>",
                StringEscapeUtils.unescapeXml("&quot;bread&quot; &amp; &apos;butter&apos; &lt;tag&gt;"));

        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeXml(sw, null);
        assertEquals("", sw.toString());

        sw = new StringWriter();
        StringEscapeUtils.unescapeXml(sw, "&quot;bread&quot; &amp; &apos;butter&apos; &lt;tag&gt;");
        assertEquals("\"bread\" & 'butter' <tag>", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeXmlNullWriter() throws IOException {
        StringEscapeUtils.unescapeXml((Writer) null, "test");
    }

    // -----------------------------------------------------------------------
    // SQL Escape Tests
    // -----------------------------------------------------------------------

    @Test
    public void testEscapeSql() {
        assertNull(StringEscapeUtils.escapeSql(null));
        assertEquals("", StringEscapeUtils.escapeSql(""));
        assertEquals("McHale''s Navy", StringEscapeUtils.escapeSql("McHale's Navy"));
        assertEquals("Plain text", StringEscapeUtils.escapeSql("Plain text"));
        assertEquals("''''", StringEscapeUtils.escapeSql("''"));
    }

    // -----------------------------------------------------------------------
    // CSV Escape & Unescape Tests
    // -----------------------------------------------------------------------

    @Test
    public void testEscapeCsv() throws IOException {
        assertNull(StringEscapeUtils.escapeCsv(null));
        assertEquals("", StringEscapeUtils.escapeCsv(""));
        assertEquals("simple", StringEscapeUtils.escapeCsv("simple"));
        
        // Contains delimiters / quote / cr / lf
        assertEquals("\"foo,bar\"", StringEscapeUtils.escapeCsv("foo,bar"));
        assertEquals("\"foo\nbar\"", StringEscapeUtils.escapeCsv("foo\nbar"));
        assertEquals("\"foo\rbar\"", StringEscapeUtils.escapeCsv("foo\rbar"));
        assertEquals("\"foo\"\"bar\"", StringEscapeUtils.escapeCsv("foo\"bar"));

        // Writer versions
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeCsv(sw, null);
        assertEquals("", sw.toString());

        sw = new StringWriter();
        StringEscapeUtils.escapeCsv(sw, "simple");
        assertEquals("simple", sw.toString());

        sw = new StringWriter();
        StringEscapeUtils.escapeCsv(sw, "foo,bar");
        assertEquals("\"foo,bar\"", sw.toString());

        sw = new StringWriter();
        StringEscapeUtils.escapeCsv(sw, "foo\"bar");
        assertEquals("\"foo\"\"bar\"", sw.toString());
    }

    @Test
    public void testUnescapeCsv() throws IOException {
        assertNull(StringEscapeUtils.unescapeCsv(null));
        assertEquals("", StringEscapeUtils.unescapeCsv(""));
        assertEquals("a", StringEscapeUtils.unescapeCsv("a"));
        assertEquals("simple", StringEscapeUtils.unescapeCsv("simple"));

        // Not enclosed in quotes
        assertEquals("foo,bar", StringEscapeUtils.unescapeCsv("foo,bar"));
        // Enclosed in quotes without search chars inside (remains unchanged)
        assertEquals("\"foo\"", StringEscapeUtils.unescapeCsv("\"foo\""));
        // Enclosed in quotes with search chars
        assertEquals("foo,bar", StringEscapeUtils.unescapeCsv("\"foo,bar\""));
        assertEquals("foo\nbar", StringEscapeUtils.unescapeCsv("\"foo\nbar\""));
        assertEquals("foo\rbar", StringEscapeUtils.unescapeCsv("\"foo\rbar\""));
        assertEquals("foo\"bar", StringEscapeUtils.unescapeCsv("\"foo\"\"bar\""));

        // Writer versions
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeCsv(sw, null);
        assertEquals("", sw.toString());

        sw = new StringWriter();
        StringEscapeUtils.unescapeCsv(sw, "a");
        assertEquals("a", sw.toString());

        sw = new StringWriter();
        StringEscapeUtils.unescapeCsv(sw, "\"foo,bar\"");
        assertEquals("foo,bar", sw.toString());
    }
}