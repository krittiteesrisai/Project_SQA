package com.google.javascript.jscomp;

import com.google.common.base.Charsets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for CodeGenerator (Closure-65b)
 * Focuses on high branch/condition coverage and edge cases.
 */
public class CodeGeneratorTest {

    // Mock CodeConsumer implementation using available classes in classpath
    private static class DummyCodeConsumer extends CodeConsumer {
        private final StringBuilder sb = new StringBuilder();

        @Override
        void add(String str) {
            sb.append(str);
        }

        @Override
        void add(double x) {
            sb.append(x);
        }

        @Override
        void addOp(String op, boolean needSpace) {
            if (needSpace) sb.append(" ");
            sb.append(op);
            if (needSpace) sb.append(" ");
        }

        @Override
        void addIdentifier(String identifier) {
            sb.append(identifier);
        }

        @Override
        boolean continueProcessing() {
            return true;
        }

        String getResult() {
            return sb.toString();
        }
    }

    @Test
    public void testConstructorWithNullAndUSASCIICharsets() {
        DummyCodeConsumer consumer = new DummyCodeConsumer();
        CodeGenerator genNull = new CodeGenerator(consumer, null);
        CodeGenerator genAscii = new CodeGenerator(consumer, Charsets.US_ASCII);
        assertNotNull(genNull);
        assertNotNull(genAscii);
    }

    @Test
    public void testConstructorWithUTF8Charset() {
        DummyCodeConsumer consumer = new DummyCodeConsumer();
        CodeGenerator genUtf8 = new CodeGenerator(consumer, Charsets.UTF_8);
        assertNotNull(genUtf8);
    }

    @Test
    public void testTagAsStrict() {
        DummyCodeConsumer consumer = new DummyCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);
        gen.tagAsStrict();
        assertEquals("'use strict';", consumer.getResult());
    }

    @Test
    public void testIsSimpleNumberAndGetSimpleNumberEdgeCases() {
        // Boundary limits and invalid states for number parsing
        assertTrue(CodeGenerator.isSimpleNumber("123456"));
        assertFalse(CodeGenerator.isSimpleNumber("123a45"));
        assertFalse(CodeGenerator.isSimpleNumber(""));

        // Valid simple number within range
        assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.001);

        // Invalid / NaN cases (too long to parse or non-numeric)
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("123456789012345678901234567890")));
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("notanumber")));
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("")));
    }

    @Test
    public void testIdentifierEscapeBranches() {
        // Latin string (no escaping needed)
        assertEquals("validIdentifier", CodeGenerator.identifierEscape("validIdentifier"));

        // Non-Latin string requiring hex escape representation
        String escaped = CodeGenerator.identifierEscape("id\u0001\u0100");
        assertTrue(escaped.contains("\\u0001"));
        assertTrue(escaped.contains("\\u0100"));
    }

    @Test
    public void testRegexpEscapeAndStringEscapingEdgeCases() {
        // Test special characters, quotes optimization, script tags, and comments in strings
        String input = "\0\n\r\t\\\"'-->]]> </script <!--";
        String escaped = CodeGenerator.escapeToDoubleQuotedJsString(input);
        assertNotNull(escaped);
        assertTrue(escaped.startsWith("\""));
        assertTrue(escaped.endsWith("\""));

        // Test with outputCharsetEncoder (UTF-8 encoding vs non-encodable chars)
        String utf8Escaped = CodeGenerator.regexpEscape("test\u1234", Charsets.UTF_8.newEncoder());
        assertTrue(utf8Escaped.contains("\\u1234"));

        // Test fallback without encoder (ASCII range check)
        String asciiEscaped = CodeGenerator.regexpEscape("test\u0001");
        assertTrue(asciiEscaped.contains("\\u0001"));
    }

    @Test
    public void testJsStringQuoteSelection() {
        DummyCodeConsumer consumer = new DummyCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        // More single quotes than double quotes -> should wrap with double quotes
        gen.addJsString("It's a test with 'single' and \"double\" quotes.");
        String result1 = consumer.getResult();
        assertTrue(result1.startsWith("\""));

        // More double quotes than single quotes -> should wrap with single quotes
        DummyCodeConsumer consumer2 = new DummyCodeConsumer();
        CodeGenerator gen2 = new CodeGenerator(consumer2);
        gen2.addJsString("He said \"Hello\" and another \"world\" with 's'.");
        String result2 = consumer2.getResult();
        assertTrue(result2.startsWith("'"));
    }

    @Test
    public void testAddNodeNumberAndUnaryOperator() {
        DummyCodeConsumer consumer = new DummyCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        // Test adding a NUMBER node
        Node numNode = new Node(Token.NUMBER, 42.0);
        gen.add(numNode);
        assertEquals("42.0", consumer.getResult());
    }

    @Test
    public void testAddNodeNegativeNumber() {
        DummyCodeConsumer consumer = new DummyCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        // Test NEG node with a NUMBER child (Edge case in Rhino AST parsing)
        Node innerNum = new Node(Token.NUMBER, 5.0);
        Node negNode = new Node(Token.NEG, innerNum);
        gen.add(negNode);
        assertEquals("-5.0", consumer.getResult());
    }
}