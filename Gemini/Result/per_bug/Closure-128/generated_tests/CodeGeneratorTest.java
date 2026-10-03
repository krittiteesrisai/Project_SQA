package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

import static org.junit.Assert.*;

/**
 * Senior JUnit 4 Test Suite for CodeGenerator (Defects4J Closure-128b)
 * Focuses on high branch/condition coverage, edge cases, and fault injection triggers.
 */
public class CodeGeneratorTest {

    private StringBuilder sb;
    private TestCodeConsumer consumer;

    // Stub implementation of CodeConsumer to capture generated code without external mocking libraries
    private static class TestCodeConsumer extends CodeConsumer {
        final StringBuilder out = new StringBuilder();
        boolean continueProc = true;

        @Override void add(String str) { out.append(str); }
        @Override void add(char c) { out.append(c); }
        @Override void addOp(String op, boolean linewrap) { out.append(op); }
        @Override void addIdentifier(String identifier) { out.append(identifier); }
        @Override void addNumber(double x) { out.append(x); }
        @Override void addConstant(String js) { out.append(js); }
        @Override boolean continueProcessing() { return continueProc; }
        @Override void startSourceMapping(Node node) {}
        @Override void endSourceMapping(Node node) {}
        @Override void endStatement() { out.append(";"); }
        @Override void endStatement(boolean optional) { out.append(";"); }
        @Override void beginBlock() { out.append("{"); }
        @Override void endBlock(boolean unindent) { out.append("}"); }
        @Override void listSeparator() { out.append(","); }
        @Override void beginCaseBody() { out.append(":"); }
        @Override void endCaseBody() {}
        @Override void maybeLineBreak() {}
        @Override void notePreferredLineBreak() {}
        @Override void endFunction(boolean statement) {}
        @Override boolean breakAfterBlockFor(Node node, boolean statement) { return false; }
        @Override boolean shouldPreserveExtraBlocks() { return true; }
    }

    @Before
    public void setUp() {
        sb = new StringBuilder();
        consumer = new TestCodeConsumer();
    }

    private CodeGenerator createDefaultGenerator() {
        return CodeGenerator.forCostEstimation(consumer);
    }

    @Test
    public void testContinueProcessingFalse() {
        consumer.continueProc = false;
        CodeGenerator generator = createDefaultGenerator();
        Node node = new Node(Token.EMPTY);
        generator.add(node);
        assertEquals("", consumer.out.toString());
    }

    @Test
    public void testSimpleNumberEdgeCases() {
        // isSimpleNumber & getSimpleNumber branches
        assertTrue(CodeGenerator.isSimpleNumber("123"));
        assertFalse(CodeGenerator.isSimpleNumber("0123")); // starts with 0
        assertFalse(CodeGenerator.isSimpleNumber("12a3"));
        assertFalse(CodeGenerator.isSimpleNumber(""));

        assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.001);
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("0123")));
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("notanumber")));
        // Test overflow number for NumberFormatException / Long parsing
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("999999999999999999999999999999")));
    }

    @Test
    public void testIdentifierEscapeLatinAndNonLatin() {
        assertEquals("validIdent", CodeGenerator.identifierEscape("validIdent"));
        // Non-latin character should trigger hex escape
        String escaped = CodeGenerator.identifierEscape("var\u0100");
        assertTrue(escaped.contains("\\u0100"));
    }

    @Test
    public void testStringEscapingSpecialCharactersAndQuotes() {
        CodeGenerator generator = createDefaultGenerator();
        
        // Test escapeToDoubleQuotedJsString with various controls & specials
        String res1 = generator.escapeToDoubleQuotedJsString("\0\u000B\b\f\n\r\t\\\"\'\u2028\u2029");
        assertTrue(res1.contains("\\x00"));
        assertTrue(res1.contains("\\x0B"));
        assertTrue(res1.contains("\\b"));
        assertTrue(res1.contains("\\u2028"));

        // Test Trusted strings vs Untrusted strings for =, &, >, <
        CompilerOptions options = new CompilerOptions();
        options.trustedStrings = false;
        CodeGenerator untrustedGen = new CodeGenerator(consumer, options);
        String res2 = untrustedGen.escapeToDoubleQuotedJsString("a=b&c>d<e</script><!--");
        assertTrue(res2.contains("\\x3d")); // =
        assertTrue(res2.contains("\\x26")); // &
        assertTrue(res2.contains("\\x3c")); // <
    }

    @Test
    public void testRegexpEscape() {
        CodeGenerator generator = createDefaultGenerator();
        String escapedRegexp = generator.regexpEscape("abc/def");
        assertNotNull(escapedRegexp);
        assertTrue(escapedRegexp.startsWith("/"));
        assertTrue(escapedRegexp.endsWith("/"));
    }

    @Test
    public void testTokenNegNumber() {
        CodeGenerator generator = createDefaultGenerator();
        Node numberNode = Node.newNumber(5.0);
        Node negNode = new Node(Token.NEG, numberNode);
        
        generator.add(negNode);
        // Rhino / CodeGenerator optimization: NEG of a number outputs -number directly
        assertEquals("-5.0", consumer.out.toString());
    }

    @Test
    public void testTokenTryCatchFinally() {
        CodeGenerator generator = createDefaultGenerator();
        
        Node tryBlock = new Node(Token.BLOCK, new Node(Token.EMPTY));
        Node catchNode = new Node(Token.CATCH, Node.newString(Token.NAME, "err"), new Node(Token.BLOCK));
        Node catchBlockWrapper = new Node(Token.BLOCK, catchNode);
        Node finallyBlock = new Node(Token.BLOCK, new Node(Token.EMPTY));

        Node tryNode = new Node(Token.TRY, tryBlock, catchBlockWrapper, finallyBlock);
        
        generator.add(tryNode);
        assertTrue(consumer.out.toString().contains("try"));
        assertTrue(consumer.out.toString().contains("catch"));
        assertTrue(consumer.out.toString().contains("finally"));
    }

    @Test
    public void testTokenSwitchCaseDefault() {
        CodeGenerator generator = createDefaultGenerator();
        
        Node caseVal = Node.newNumber(1.0);
        Node caseBody = new Node(Token.BLOCK);
        Node caseNode = new Node(Token.CASE, caseVal, caseBody);
        
        Node defaultBody = new Node(Token.BLOCK);
        Node defaultNode = new Node(Token.DEFAULT_CASE, defaultBody);
        
        Node switchCond = Node.newString(Token.NAME, "x");
        switchCond.addChildrenToBack(caseNode);
        switchCond.addChildrenToBack(defaultNode);

        Node switchNode = new Node(Token.SWITCH, switchCond);
        
        generator.add(switchNode);
        assertTrue(consumer.out.toString().contains("switch(x)"));
        assertTrue(consumer.out.toString().contains("case"));
        assertTrue(consumer.out.toString().contains("default"));
    }

    @Test
    public void testTokenFunctionAndCallWithIndirectEval() {
        CodeGenerator generator = createDefaultGenerator();
        
        // Indirect eval call simulation
        Node evalName = Node.newString(Token.NAME, "eval");
        // No DIRECT_EVAL prop set -> triggers indirect eval path "(0,eval)(...)"
        Node callNode = new Node(Token.CALL, evalName);
        
        generator.add(callNode);
        assertTrue(consumer.out.toString().contains("(0,eval)"));
    }

    @Test
    public void testArrayLitAndArrayList() {
        CodeGenerator generator = createDefaultGenerator();
        Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1.0), Node.newNumber(2.0));
        generator.add(arrayLit);
        assertEquals("[1.0,2.0]", consumer.out.toString());
    }

    @Test(expected = Error.class)
    public void testInvalidNodeSubclassThrowsError() {
        CodeGenerator generator = createDefaultGenerator();
        // Token.FUNCTION expects Node.class, subclass should throw Error
        Node subclassNode = new Node(Token.FUNCTION) {
            // anonymous subclass to fail n.getClass() != Node.class check
        };
        generator.add(subclassNode);
    }
}