package com.google.javascript.jscomp;

import com.google.common.base.Charsets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for CodeGenerator (Defects4J Closure-73)
 * Focused on Branch/Condition Coverage, Edge Cases, and Fault Injection.
 */
public class CodeGeneratorTest {

    private StringBuilder buffer;
    private TestCodeConsumer consumer;

    // Dummy CodeConsumer implementation to capture outputs
    private static class TestCodeConsumer extends CodeConsumer {
        StringBuilder sb = new StringBuilder();

        @Override void add(String str) { sb.append(str); }
        @Override void add(char c) { sb.append(c); }
        @Override void addOp(String op, boolean needSpace) { sb.append(op); }
        @Override void addIdentifier(String identifier) { sb.append(identifier); }
        @Override void addNumber(double x) { sb.append(x); }
        @Override boolean continueProcessing() { return true; }
    }

    @Before
    public void setUp() {
        buffer = new StringBuilder();
        consumer = new TestCodeConsumer();
    }

    @Test
    public void testConstructorCharsets() {
        // Test null charset, US_ASCII, and custom UTF-8 charset
        CodeGenerator cg1 = new CodeGenerator(consumer, null);
        CodeGenerator cg2 = new CodeGenerator(consumer, Charsets.US_ASCII);
        CodeGenerator cg3 = new CodeGenerator(consumer, Charsets.UTF_8);
        CodeGenerator cg4 = new CodeGenerator(consumer);

        assertNotNull(cg1);
        assertNotNull(cg2);
        assertNotNull(cg3);
        assertNotNull(cg4);
    }

    @Test
    public void testIsSimpleNumberAndGetSimpleNumber() {
        assertTrue(CodeGenerator.isSimpleNumber("12345"));
        assertFalse(CodeGenerator.isSimpleNumber("123a45"));
        assertFalse(CodeGenerator.isSimpleNumber(""));

        assertEquals(12345.0, CodeGenerator.getSimpleNumber("12345"), 0.001);
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("123a45")));
        // Test excessively large number returning NaN
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("99999999999999999999")));
    }

    @Test
    public void testIdentifierEscape() {
        // Latin string
        assertEquals("validIdent", CodeGenerator.identifierEscape("validIdent"));
        // Non-latin / special character escaping
        String escaped = CodeGenerator.identifierEscape("id\u0123");
        assertTrue(escaped.contains("\\u"));
    }

    @Test
    public void testStrEscapeSpecialCharacters() {
        // Test escape sequences: \0, \n, \r, \t, \\, \", \'
        String input = "\0\n\r\t\\\"'";
        String escaped = CodeGenerator.escapeToDoubleQuotedJsString(input);
        assertTrue(escaped.contains("\\0"));
        assertTrue(escaped.contains("\\n"));
        assertTrue(escaped.contains("\\r"));
        assertTrue(escaped.contains("\\t"));
        assertTrue(escaped.contains("\\\\"));
        assertTrue(escaped.contains("\\\""));
    }

    @Test
    public void testStrEscapeHtmlCommentSequencesClosure73() {
        // Closure-73 specific: '-->' and ']]>' breaking test cases
        String input1 = "a-->b";
        String escaped1 = CodeGenerator.escapeToDoubleQuotedJsString(input1);
        assertEquals("\"a--\\>b\"", escaped1);

        String input2 = "a]]>b";
        String escaped2 = CodeGenerator.escapeToDoubleQuotedJsString(input2);
        assertEquals("\"a]]\\>b\"", escaped2);

        // '</script' and '!--' breaking test cases
        String input3 = "</script>";
        String escaped3 = CodeGenerator.escapeToDoubleQuotedJsString(input3);
        assertEquals("\"<\\/script>\"", escaped3);

        String input4 = "<!--comment";
        String escaped4 = CodeGenerator.escapeToDoubleQuotedJsString(input4);
        assertEquals("\"<\\!--comment\"", escaped4);
    }

    @Test
    public void testStrEscapeWithCharsetEncoder() {
        // Test with custom CharsetEncoder (UTF-8)
        CodeGenerator cgAscii = new CodeGenerator(consumer, Charsets.US_ASCII);
        String resultAscii = CodeGenerator.jsString("Hello \u0123", Charsets.US_ASCII.newEncoder());
        assertTrue(resultAscii.contains("\\u"));

        String resultNullEncoder = CodeGenerator.jsString("Hello \u0123", null);
        assertTrue(resultNullEncoder.contains("\\u"));
    }

    @Test
    public void testRegexpEscape() {
        String reg = CodeGenerator.regexpEscape("abc/def");
        assertTrue(reg.startsWith("/"));
        assertTrue(reg.endsWith("/"));
    }

    @Test
    public void testNodeAddNullOrEmptySafety() {
        CodeGenerator cg = new CodeGenerator(consumer);
        Node emptyNode = new Node(Token.EMPTY);
        // Should handle gracefully without exception
        cg.add(emptyNode);
    }
}