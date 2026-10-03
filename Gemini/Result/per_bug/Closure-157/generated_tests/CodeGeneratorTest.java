package com.google.javascript.jscomp;

import com.google.common.base.Charsets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for CodeGenerator (Closure-157b).
 * Aiming for maximum branch and condition coverage, focusing on edge cases,
 * string escaping rules, and AST generation paths.
 */
public class CodeGeneratorTest {

    // Dummy CodeConsumer for capturing generated outputs without real compilation overhead
    private static class TestCodeConsumer extends CodeConsumer {
        private final StringBuilder sb = new StringBuilder();

        @Override
        void add(String str) {
            sb.append(str);
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
        void addNumber(double x) {
            sb.append(x);
        }

        @Override
        boolean continueProcessing() {
            return true;
        }

        String getOutput() {
            return sb.toString();
        }
    }

    @Test
    public void testConstructorsAndCharsets() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator genNull = new CodeGenerator(consumer, null);
        CodeGenerator genAscii = new CodeGenerator(consumer, Charsets.US_ASCII);
        CodeGenerator genUtf8 = new CodeGenerator(consumer, Charset.forName("UTF-8"));
        CodeGenerator genDefault = new CodeGenerator(consumer);
        
        assertNotNull(genNull);
        assertNotNull(genAscii);
        assertNotNull(genUtf8);
        assertNotNull(genDefault);
    }

    @Test
    public void testTagAsStrict() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);
        gen.tagAsStrict();
        assertEquals("'use strict';", consumer.getOutput());
    }

    @Test
    public void testStringEscapingEdgeCases() {
        // Test null charset encoder path with various control characters, scripts, and comments
        String raw = "\0\n\r\t\\\"'</script><--]]>--></node>\u0100";
        String escaped = CodeGenerator.escapeToDoubleQuotedJsString(raw);
        assertTrue(escaped.contains("\\0"));
        assertTrue(escaped.contains("\\n"));
        assertTrue(escaped.contains("\\r"));
        assertTrue(escaped.contains("\\t"));
        assertTrue(escaped.contains("<\\"));
        assertTrue(escaped.contains("\\>"));
        assertTrue(escaped.contains("\\u0100"));
    }

    @Test
    public void testJsStringQuotePreference() {
        // More single quotes than double quotes
        String moreSingle = "''\"";
        String res1 = CodeGenerator.jsString(moreSingle, null);
        assertTrue(res1.startsWith("\""));

        // More double quotes than single quotes
        String moreDouble = "\"\"'";
        String res2 = CodeGenerator.jsString(moreDouble, null);
        assertTrue(res2.startsWith("'"));
    }

    @Test
    public void testRegexpEscape() {
        String reg = CodeGenerator.regexpEscape("test/regexp");
        assertTrue(reg.contains("/"));

        String regWithEncoder = CodeGenerator.regexpEscape("test\u0100", Charset.forName("US_ASCII"));
        assertTrue(regWithEncoder.contains("\\u0100"));
    }

    @Test
    public void testIdentifierEscape() {
        String latinId = CodeGenerator.identifierEscape("validIdentifier");
        assertEquals("validIdentifier", latinId);

        String nonLatinId = CodeGenerator.identifierEscape("id\u0100");
        assertTrue(nonLatinId.contains("\\u0100"));
    }

    @Test
    public void testAddLiteralNodes() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        // NULL, TRUE, FALSE, THIS
        gen.add(Node.newString(Token.NULL, "null"));
        gen.add(Node.newString(Token.TRUE, "true"));
        gen.add(Node.newString(Token.FALSE, "false"));
        gen.add(Node.newString(Token.THIS, "this"));

        assertEquals("nulltruefalsethis", consumer.getOutput());
    }

    @Test
    public void testAddNumberNode() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);
        Node numNode = Node.newNumber(42.5);
        gen.add(numNode);
        assertEquals("42.5", consumer.getOutput());
    }

    @Test
    public void testAddUnaryOperators() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        Node notNode = new Node(Token.NOT, Node.newString(Token.TRUE, "true"));
        gen.add(notNode);
        assertEquals("!true", consumer.getOutput());
    }

    @Test
    public void testAddNegNumberNode() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        // NEG with number child (Rhino parses - -2 as 2 or handles directly)
        Node negNode = new Node(Token.NEG, Node.newNumber(5.0));
        gen.add(negNode);
        assertEquals("-5.0", consumer.getOutput());
    }

    @Test
    public void testAddBinaryOperator() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        Node addNode = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        gen.add(addNode);
        assertTrue(consumer.getOutput().contains("+"));
    }

    @Test
    public void testVarNode() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        Node nameNode = Node.newString(Token.NAME, "x");
        Node varNode = new Node(Token.VAR, nameNode);
        gen.add(varNode);
        assertEquals("var x", consumer.getOutput());
    }

    @Test
    public void testReturnNode() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        Node returnNode = new Node(Token.RETURN);
        gen.add(returnNode);
        assertTrue(consumer.getOutput().startsWith("return"));
    }

    @Test
    public void testThrowNode() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        Node throwNode = new Node(Token.THROW, Node.newString(Token.STRING, "error"));
        gen.add(throwNode);
        assertTrue(consumer.getOutput().contains("throw"));
    }

    @Test
    public void testIfNodeWithoutElse() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        Node cond = Node.newString(Token.TRUE, "true");
        Node block = new Node(Token.BLOCK, new Node(Token.EMPTY));
        Node ifNode = new Node(Token.IF, cond, block);

        gen.add(ifNode);
        assertTrue(consumer.getOutput().contains("if"));
    }

    @Test
    public void testArrayLitNode() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2));
        gen.add(arrayLit);
        assertEquals("[1,2]", consumer.getOutput());
    }

    @Test
    public void testRegexpNode() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        Node regNode = new Node(Token.REGEXP, Node.newString(Token.STRING, "abc"), Node.newString(Token.STRING, "i"));
        gen.add(regNode);
        assertTrue(consumer.getOutput().contains("/abc/i"));
    }

    @Test(expected = Error.class)
    public void testRegexpNodeInvalidChildren() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        Node regNode = new Node(Token.REGEXP, Node.newNumber(1), Node.newNumber(2));
        gen.add(regNode);
    }

    @Test(expected = Error.class)
    public void testExprVoidException() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        Node voidNode = new Node(Token.EXPR_VOID);
        gen.add(voidNode);
    }
}