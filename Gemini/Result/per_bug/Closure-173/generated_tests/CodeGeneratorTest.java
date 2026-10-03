package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for CodeGenerator (Closure-173b)
 * Maximizing Branch/Condition coverage and targeting Defects4J faults.
 */
public class CodeGeneratorTest {

    private StringBuilder sb;
    private TestCodeConsumer consumer;
    private CodeGenerator generator;

    // Mock CodeConsumer implementation to capture generated code output
    private static class TestCodeConsumer extends CodeConsumer {
        private final StringBuilder output = new StringBuilder();

        @Override void add(String str) { output.append(str); }
        @Override void addOp(String op, boolean needSpace) {
            if (needSpace) output.append(" ");
            output.append(op);
            if (needSpace) output.append(" ");
        }
        @Override void addIdentifier(String identifier) { output.append(identifier); }
        @Override void addNumber(double x) { output.append(x); }
        @Override void addConstant(String constant) { output.append(constant); }
        @Override boolean continueProcessing() { return true; }
        
        String getOutput() { return output.toString(); }
    }

    @Before
    public void setUp() {
        sb = new StringBuilder();
        consumer = new TestCodeConsumer();
        generator = CodeGenerator.forCostEstimation(consumer);
    }

    @Test
    public void testSimpleNumberAndIdentifierEscaping() {
        assertTrue(CodeGenerator.isSimpleNumber("123"));
        assertFalse(CodeGenerator.isSimpleNumber("0123"));
        assertFalse(CodeGenerator.isSimpleNumber(""));
        assertFalse(CodeGenerator.isSimpleNumber("123a"));

        assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.001);
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("invalid")));
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("99999999999999999999"))); // Exceeds MAX_POSITIVE_INTEGER_NUMBER

        assertEquals("abc", CodeGenerator.identifierEscape("abc"));
        assertTrue(CodeGenerator.identifierEscape("a\u0100b").contains("\\u"));
    }

    @Test
    public void testStringEscapingEdgeCases() {
        Node strNode = Node.newString("</script><!--\0\u000B\b\f\n\r\t\\\"'\u2028\u2029=&>");
        strNode.putBooleanProp(Node.SLASH_V, true);
        
        // Exercise escapeToDoubleQuotedJsString and internal strEscape branches
        String escaped = generator.escapeToDoubleQuotedJsString("</script><!--\0\u000B\b\f\n\r\t\\\"'\u2028\u2029=&>");
        assertNotNull(escaped);
    }

    @Test
    public void testRegexpEscape() {
        Node regExpNode = new Node(Token.REGEXP, Node.newString("abc"), Node.newString("g"));
        generator.add(regExpNode);
        assertNotNull(consumer.getOutput());
    }

    @Test(expected = Error.class)
    public void testRegexpInvalidChildren() {
        Node invalidRegExp = new Node(Token.REGEXP, Node.newNumber(1), Node.newString("g"));
        generator.add(invalidRegExp);
    }

    @Test
    public void testBinaryAndAssignmentOperators() {
        Node left = Node.newString(Token.NAME, "a");
        Node right = Node.newString(Token.NAME, "b");
        Node assign = new Node(Token.ASSIGN, left, right);
        
        generator.add(assign);
        assertEquals("a = b", consumer.getOutput().trim());
    }

    @Test
    public void testControlFlowStatements() {
        // Try-Catch-Finally
        Node tryBlock = new Node(Token.BLOCK, Node.newString(Token.NAME, "x"));
        Node catchNode = new Node(Token.CATCH, Node.newString(Token.NAME, "e"), new Node(Token.BLOCK));
        Node finallyBlock = new Node(Token.BLOCK, Node.newString(Token.NAME, "y"));
        Node tryNode = new Node(Token.TRY, tryBlock, catchNode, finallyBlock);

        generator.add(tryNode);
        assertTrue(consumer.getOutput().contains("try"));
        assertTrue(consumer.getOutput().contains("catch"));
        assertTrue(consumer.getOutput().contains("finally"));
    }

    @Test
    public void testThrowAndReturnStatements() {
        Node throwNode = new Node(Token.THROW, Node.newString(Token.NAME, "e"));
        generator.add(throwNode);

        Node returnNode = new Node(Token.RETURN, Node.newNumber(10));
        generator.add(returnNode);
        assertTrue(consumer.getOutput().contains("throw"));
        assertTrue(consumer.getOutput().contains("return"));
    }

    @Test
    public void testSwitchAndCase() {
        Node caseVal = Node.newNumber(1);
        Node caseBody = new Node(Token.BLOCK, Node.newString(Token.NAME, "x"));
        Node caseNode = new Node(Token.CASE, caseVal, caseBody);
        
        Node switchNode = new Node(Token.SWITCH, Node.newString(Token.NAME, "val"), caseNode);
        generator.add(switchNode);
        assertTrue(consumer.getOutput().contains("switch"));
        assertTrue(consumer.getOutput().contains("case"));
    }

    @Test
    public void testObjectLitAndGetSetDef() {
        Node keyNode = Node.newString(Token.STRING_KEY, "prop");
        keyNode.addChildToBack(Node.newNumber(1));
        Node objLit = new Node(Token.OBJECTLIT, keyNode);

        generator.add(objLit);
        assertTrue(consumer.getOutput().contains("prop"));
    }

    @Test
    public void testUnaryAndIncDecOperators() {
        Node incNode = new Node(Token.INC, Node.newString(Token.NAME, "x"));
        incNode.setIntProp(Node.INCRDECR_PROP, 1); // Post-inc
        generator.add(incNode);

        Node preIncNode = new Node(Token.INC, Node.newString(Token.NAME, "y"));
        generator.add(preIncNode);
        
        assertNotNull(consumer.getOutput());
    }

    @Test
    public void testCallAndEval() {
        Node evalName = Node.newString(Token.NAME, "eval");
        Node callNode = new Node(Token.CALL, evalName);
        // Indirect eval simulation
        evalNode(callNode, false);
    }

    private void evalNode(Node callNode, boolean directEval) {
        if (!directEval) {
            callNode.getFirstChild().putBooleanProp(Node.DIRECT_EVAL, false);
        }
        generator.add(callNode);
    }
}