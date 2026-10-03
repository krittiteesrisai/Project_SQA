package com.google.javascript.jscomp;

import com.google.common.base.Charsets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

/**
 * Senior JUnit 4 Test Automation Suite for CodeGenerator (Closure-52b).
 * Aiming for maximum Branch/Condition Coverage and Edge Cases.
 */
public class CodeGeneratorTest {

    // Mock CodeConsumer เพื่อดักผลลัพธ์จากการ generate code
    private static class TestCodeConsumer extends CodeConsumer {
        private final StringBuilder sb = new StringBuilder();

        @Override
        void add(CharSequence str) {
            sb.append(str);
        }

        @Override
        void add(char c) {
            sb.append(c);
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
    public void testConstructorsAndCharsets() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen1 = new CodeGenerator(consumer);
        assertNotNull(gen1);

        CodeGenerator gen2 = new CodeGenerator(consumer, null);
        assertNotNull(gen2);

        CodeGenerator gen3 = new CodeGenerator(consumer, Charsets.US_ASCII);
        assertNotNull(gen3);

        CodeGenerator gen4 = new CodeGenerator(consumer, StandardCharsets.UTF_8);
        assertNotNull(gen4);

        gen4.tagAsStrict();
        assertEquals("'use strict';", consumer.getResult());
    }

    @Test
    public void testSimpleNumberUtils() {
        assertTrue(CodeGenerator.isSimpleNumber("12345"));
        assertFalse(CodeGenerator.isSimpleNumber("123a5"));
        assertFalse(CodeGenerator.isSimpleNumber(""));

        assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.0);
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("123a")));
        // เกิน Long หรือเกิน MAX_POSITIVE_INTEGER_NUMBER
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("999999999999999999999999999")));
    }

    @Test
    public void testStringEscapingAndEncoders() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer, StandardCharsets.UTF_8);

        // ทดสอบจังหวะต่างๆ ใน jsString และ strEscape
        gen.addJsString("Hello\0\n\r\t\\\"'<>");
        gen.addJsString("Single ' quote heavy string with double \" and </script> and <!--");

        String escapedDbl = CodeGenerator.escapeToDoubleQuotedJsString("Test \" quote");
        assertTrue(escapedDbl.contains("\\\""));

        String regEsc1 = CodeGenerator.regexpEscape("abc/def");
        assertTrue(regEsc1.contains("/"));

        String regEsc2 = CodeGenerator.regexpEscape("abc/def", StandardCharsets.UTF_8);
        assertTrue(regEsc2.contains("/"));
        
        // ทดสอบ identifierEscape
        assertEquals("validId", CodeGenerator.identifierEscape("validId"));
        assertTrue(CodeGenerator.identifierEscape("nonLatin\u1234").contains("\\u"));
    }

    @Test
    public void testNodeAddBinaryAndUnaryOperators() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        // Binary operator (ADD)
        Node addNode = new Node(Token.ADD, Node.newString("a"), Node.newString("b"));
        gen.add(addNode);

        // Unary operator (NOT, NEG with number, NEG with non-number)
        Node notNode = new Node(Token.NOT, Node.newNumber(1.0));
        gen.add(notNode);

        Node negNumNode = new Node(Token.NEG, Node.newNumber(5.0));
        gen.add(negNumNode);

        Node negExprNode = new Node(Token.NEG, Node.newString("x"));
        gen.add(negExprNode);
        
        // INC / DEC (Pre and Post)
        Node incPre = new Node(Token.INC, Node.newString("x"));
        incPre.setIntProp(Node.INCRDECR_PROP, 0);
        gen.add(incPre);

        Node incPost = new Node(Token.INC, Node.newString("x"));
        incPost.setIntProp(Node.INCRDECR_PROP, 1);
        gen.add(incPost);
    }

    @Test
    public void testControlFlowNodes() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        // RETURN with child and without child
        Node retEmpty = new Node(Token.RETURN);
        gen.add(retEmpty);

        Node retWithChild = new Node(Token.RETURN, Node.newNumber(10));
        gen.add(retWithChild);

        // THROW
        Node throwNode = new Node(Token.THROW, Node.newString("err"));
        gen.add(throwNode);

        // BREAK & CONTINUE with and without label
        Node breakNode = new Node(Token.BREAK);
        gen.add(breakNode);

        Node continueNode = new Node(Token.CONTINUE);
        gen.add(continueNode);

        Node labelName = Node.newString(Token.LABEL_NAME, "myLabel");
        Node breakWithLabel = new Node(Token.BREAK, labelName);
        gen.add(breakWithLabel);
    }

    @Test
    public void testTryCatchFinallyNode() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        // Try - Catch - Finally AST Structure construction
        Node tryBlock = new Node(Token.BLOCK, new Node(Token.EMPTY));
        Node catchBlock = new Node(Token.CATCH, Node.newString(Token.NAME, "e"), new Node(Token.BLOCK));
        tryBlock.addChildToBack(catchBlock);
        
        Node finallyBlock = new Node(Token.BLOCK, new Node(Token.EMPTY));
        
        Node tryNode = new Node(Token.TRY, tryBlock, finallyBlock);
        gen.add(tryNode);
    }

    @Test
    public void testObjectAndArrayLiterals() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        Node arrLit = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newToken(Token.EMPTY), Node.newNumber(3));
        gen.add(arrLit);

        Node objLit = new Node(Token.OBJECTLIT, Node.newString(Token.STRING, "key"), Node.newNumber(100));
        objLit.getFirstChild().setIsQuotedString(false);
        gen.add(objLit);
    }

    @Test
    public void testFunctionAndGetSetNodes() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        // Function Node (Standard Node class check)
        Node fnName = Node.newString(Token.NAME, "myFunc");
        Node fnParams = new Node(Token.LP, Node.newString(Token.NAME, "arg1"));
        Node fnBody = new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(1)));
        Node funcNode = new Node(Token.FUNCTION, fnName, fnParams, fnBody);
        
        gen.add(funcNode, CodeGenerator.Context.START_OF_EXPR);
    }

    @Test
    public void testSwitchCaseDefault() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);

        Node caseNode = new Node(Token.CASE, Node.newNumber(1), new Node(Token.BLOCK, new Node(Token.BREAK)));
        Node defaultNode = new Node(Token.DEFAULT, new Node(Token.BLOCK, new Node(Token.BREAK)));
        caseNode.setNext(defaultNode);

        Node switchNode = new Node(Token.SWITCH, Node.newNumber(1), caseNode);
        gen.add(switchNode);
    }

    @Test(expected = Error.class)
    public void testInvalidExprVoidThrowsError() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);
        Node invalid = new Node(Token.EXPR_VOID);
        gen.add(invalid);
    }

    @Test(expected = Error.class)
    public void testUnexpectedNodeSubclassThrowsError() {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator gen = new CodeGenerator(consumer);
        // สร้าง Node subclass ปอมๆ เพื่อให้เงื่อนไข n.getClass() != Node.class ทำงาน
        Node subNode = new Node(Token.FUNCTION) {
            // anonymous subclass ทำให้ getClass() != Node.class เป็นจริง
        };
        gen.add(subNode);
    }
}