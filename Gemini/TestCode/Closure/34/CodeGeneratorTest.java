package com.google.javascript.jscomp;

import com.google.common.base.Charsets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for CodeGenerator (Defects4J Closure-34b)
 * Target: High Branch/Condition Coverage and Edge Cases Trigger.
 */
public class CodeGeneratorTest {

    private MockCodeConsumer consumer;

    @Before
    public void setUp() {
        consumer = new MockCodeConsumer();
    }

    // --- Mock CodeConsumer to capture generated code ---
    private static class MockCodeConsumer extends CodeConsumer {
        private final StringBuilder sb = new StringBuilder();
        private boolean continueProcessing = true;

        @Override
        void add(String str) {
            sb.append(str);
        }

        @Override
        void add(char c) {
            sb.append(c);
        }

        @Override
        boolean continueProcessing() {
            return continueProcessing;
        }

        public String getOutput() {
            return sb.toString();
        }

        public void reset() {
            sb.setLength(0);
        }
    }

    @Test
    public void testConstructorsAndCharsets() {
        // Test null charset, US_ASCII, and custom charset (UTF-8)
        CodeGenerator gen1 = new CodeGenerator(consumer, null);
        CodeGenerator gen2 = new CodeGenerator(consumer, Charsets.US_ASCII);
        CodeGenerator gen3 = new CodeGenerator(consumer, StandardCharsets.UTF_8);
        assertNotNull(gen1);
        assertNotNull(gen2);
        assertNotNull(gen3);
        
        // Single arg constructor
        CodeGenerator gen4 = new CodeGenerator(consumer);
        assertNotNull(gen4);
    }

    @Test
    public void testTagAsStrict() {
        CodeGenerator generator = new CodeGenerator(consumer);
        generator.tagAsStrict();
        assertEquals("'use strict';", consumer.getOutput());
    }

    @Test
    public void testAddIdentifier() {
        CodeGenerator generator = new CodeGenerator(consumer);
        // Accessing private method via public add / identifier path or testing helpers directly
        assertEquals("testId", CodeGenerator.identifierEscape("testId"));
        // Non-latin identifier escape
        assertTrue(CodeGenerator.identifierEscape("t\u012Bst").contains("\\u"));
    }

    @Test
    public void testSimpleNumberHelpers() {
        assertTrue(CodeGenerator.isSimpleNumber("12345"));
        assertFalse(CodeGenerator.isSimpleNumber("0123")); // starts with 0
        assertFalse(CodeGenerator.isSimpleNumber("12a3"));
        assertFalse(CodeGenerator.isSimpleNumber(""));

        assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.0);
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("0123")));
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("999999999999999999999999"))); // Overflow -> NaN
    }

    @Test
    public void testRegexpEscape() {
        String escaped1 = CodeGenerator.regexpEscape("abc/def");
        assertTrue(escaped1.contains("/"));

        String escaped2 = CodeGenerator.regexpEscape("abc/def", StandardCharsets.UTF_8.newEncoder());
        assertNotNull(escaped2);
    }

    @Test
    public void testEscapeToDoubleQuotedJsString() {
        String result = CodeGenerator.escapeToDoubleQuotedJsString("Hello \"World\"");
        assertTrue(result.contains("\\\""));
    }

    @Test
    public void testBinaryOperatorAndAssociativity() {
        CodeGenerator generator = new CodeGenerator(consumer);
        // a + b + c (Associative)
        Node left = Node.newString(Token.NAME, "b");
        Node right = Node.newString(Token.NAME, "c");
        Node plus1 = new Node(Token.ADD, left, right);
        Node root = new Node(Token.ADD, Node.newString(Token.NAME, "a"), plus1);

        generator.add(root);
        assertEquals("a+b+c", consumer.getOutput());
    }

    @Test
    public void testTryCatchFinallyNode() {
        CodeGenerator generator = new CodeGenerator(consumer);
        // TRY block with CATCH and FINALLY
        Node tryBlock = new Node(Token.BLOCK, Node.newString(Token.NAME, "x"));
        Node catchName = Node.newString(Token.NAME, "e");
        Node catchBody = new Node(Token.BLOCK, Node.newString(Token.NAME, "y"));
        Node catchNode = new Node(Token.CATCH, catchName, catchBody);
        Node catchBlockWrapper = new Node(Token.BLOCK, catchNode);
        Node finallyBlock = new Node(Token.BLOCK, Node.newString(Token.NAME, "z"));

        Node tryNode = new Node(Token.TRY, tryBlock, catchBlockWrapper, finallyBlock);
        generator.add(tryNode);
        assertTrue(consumer.getOutput().contains("try"));
        assertTrue(consumer.getOutput().contains("catch"));
        assertTrue(consumer.getOutput().contains("finally"));
    }

    @Test
    public void testThrowAndReturnNode() {
        CodeGenerator generator = new CodeGenerator(consumer);
        Node throwNode = new Node(Token.THROW, Node.newString(Token.NAME, "err"));
        generator.add(throwNode);
        assertTrue(consumer.getOutput().contains("throw"));

        consumer.reset();
        Node returnNode = new Node(Token.RETURN, Node.newNumber(10.0));
        generator.add(returnNode);
        assertTrue(consumer.getOutput().contains("return"));
    }

    @Test
    public void testIfElseDanglingElse() {
        CodeGenerator generator = new CodeGenerator(consumer);
        Node cond = Node.newString(Token.NAME, "cond");
        Node thenBlock = new Node(Token.BLOCK, Node.newString(Token.NAME, "a"));
        Node elseBlock = new Node(Token.BLOCK, Node.newString(Token.NAME, "b"));
        Node ifNode = new Node(Token.IF, cond, thenBlock, elseBlock);

        generator.add(ifNode, CodeGenerator.Context.BEFORE_DANGLING_ELSE);
        assertTrue(consumer.getOutput().contains("if"));
        assertTrue(consumer.getOutput().contains("else"));
    }

    @Test
    public void testSwitchCaseDefaultNode() {
        CodeGenerator generator = new CodeGenerator(consumer);
        Node switchCond = Node.newString(Token.NAME, "val");
        Node caseVal = Node.newNumber(1.0);
        Node caseBody = new Node(Token.BLOCK, Node.newString(Token.NAME, "caseCode"));
        Node caseNode = new Node(Token.CASE, caseVal, caseBody);
        
        Node defaultBody = new Node(Token.BLOCK, Node.newString(Token.NAME, "defaultCode"));
        Node defaultNode = new Node(Token.DEFAULT_CASE, defaultBody);

        switchCond.addChildrenToBack(caseNode);
        switchCond.addChildrenToBack(defaultNode);

        Node switchNode = new Node(Token.SWITCH, switchCond);
        generator.add(switchNode);
        assertTrue(consumer.getOutput().contains("switch"));
        assertTrue(consumer.getOutput().contains("case"));
        assertTrue(consumer.getOutput().contains("default"));
    }

    @Test
    public void testStringLiteralEscapingEdgeCases() {
        CodeGenerator generator = new CodeGenerator(consumer, StandardCharsets.US_ASCII);
        // Test special characters like \0, \v, HTML comments inside string
        Node strNode = Node.newString("--> ]]> </script> <!-- \0 \u000B \n \r \t \\ \" \'");
        Node exprResult = new Node(Token.EXPR_RESULT, strNode);
        
        generator.add(exprResult);
        String output = consumer.getOutput();
        assertNotNull(output);
        assertTrue(output.contains("\\>"));
        assertTrue(output.contains("<\\"));
    }
}