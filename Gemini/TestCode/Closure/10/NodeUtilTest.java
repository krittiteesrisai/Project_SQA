package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 test suite for NodeUtil (Closure-10b).
 */
public class NodeUtilTest {

    @Test
    public void testGetImpureBooleanValueEdgeCases() {
        // ASSIGN / COMMA -> last child
        Node assignNode = IR.assign(IR.name("x"), IR.trueNode());
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(assignNode));

        Node commaNode = IR.comma(IR.falseNode(), IR.trueNode());
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(commaNode));

        // NOT
        Node notNode = IR.not(IR.falseNode());
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(notNode));

        // AND / OR
        Node andNode = IR.and(IR.trueNode(), IR.falseNode());
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(andNode));

        Node orNode = IR.or(IR.falseNode(), IR.trueNode());
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(orNode));

        // HOOK (trueValue.equals(falseValue)) vs UNKNOWN
        Node hookEqual = IR.hook(IR.trueNode(), IR.trueNode(), IR.trueNode());
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(hookEqual));

        Node hookDiff = IR.hook(IR.trueNode(), IR.trueNode(), IR.falseNode());
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(hookDiff));

        // ARRAYLIT / OBJECTLIT / VOID
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(IR.arraylit()));
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(IR.objectlit()));
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(IR.voidNode(IR.number(0))));
    }

    @Test
    public void testGetPureBooleanValueEdgeCases() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(IR.string("hello")));
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.string("")));
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(IR.number(5.0)));
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.number(0.0)));
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.nullNode()));
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.falseNode()));
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(IR.trueNode()));
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(IR.regexp(IR.string("abc"))));

        // NAME tokens
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.name("undefined")));
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.name("NaN")));
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(IR.name("Infinity")));
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(IR.name("unknownVar")));
    }

    @Test
    public void testGetStringValueEdgeCases() {
        assertEquals("test", NodeUtil.getStringValue(IR.string("test")));
        assertEquals("undefined", NodeUtil.getStringValue(IR.name("undefined")));
        assertEquals("Infinity", NodeUtil.getStringValue(IR.name("Infinity")));
        assertEquals("NaN", NodeUtil.getStringValue(IR.name("NaN")));
        assertEquals("10", NodeUtil.getStringValue(IR.number(10.0)));
        assertEquals("10.5", NodeUtil.getStringValue(IR.number(10.5)));
        assertEquals("false", NodeUtil.getStringValue(IR.falseNode()));
        assertEquals("true", NodeUtil.getStringValue(IR.trueNode()));
        assertEquals("null", NodeUtil.getStringValue(IR.nullNode()));
        assertEquals("undefined", NodeUtil.getStringValue(IR.voidNode(IR.number(0))));
        assertEquals("[object Object]", NodeUtil.getStringValue(IR.objectlit()));
        assertNull(NodeUtil.getStringValue(IR.name("unknownVar")));
    }

    @Test
    public void testGetStringNumberValueEdgeCases() {
        // Vertical tab -> null
        assertNull(NodeUtil.getStringNumberValue("123\u000b"));

        // Empty / Whitespace -> 0.0
        assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue("   "));
        assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue(""));

        // Hex numbers
        assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0xFF"));
        assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0Xff"));
        assertEquals(Double.NaN, NodeUtil.getStringNumberValue("0xZZ")); // NumberFormatException -> NaN

        // Explicit signs with hex -> null
        assertNull(NodeUtil.getStringNumberValue("-0xFF"));
        assertNull(NodeUtil.getStringNumberValue("+0XFF"));

        // Infinity variants -> null
        assertNull(NodeUtil.getStringNumberValue("infinity"));
        assertNull(NodeUtil.getStringNumberValue("-infinity"));
        assertNull(NodeUtil.getStringNumberValue("+infinity"));

        // General parsing
        assertEquals(Double.valueOf(123.45), NodeUtil.getStringNumberValue("123.45"));
        assertEquals(Double.NaN, NodeUtil.getStringNumberValue("notANumber"));
    }

    @Test
    public void testGetNumberValueEdgeCases() {
        assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(IR.trueNode()));
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(IR.falseNode()));
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(IR.nullNode()));
        assertEquals(Double.valueOf(42.0), NodeUtil.getNumberValue(IR.number(42.0)));
        assertEquals(Double.NaN, NodeUtil.getNumberValue(IR.name("undefined")));
        assertEquals(Double.NaN, NodeUtil.getNumberValue(IR.name("NaN")));
        assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(IR.name("Infinity")));

        // NEG Infinity
        Node negInf = IR.neg(IR.name("Infinity"));
        assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(negInf));

        assertNull(NodeUtil.getNumberValue(IR.name("unknown")));
    }

    @Test
    public void testIsImmutableValue() {
        assertTrue(NodeUtil.isImmutableValue(IR.string("a")));
        assertTrue(NodeUtil.isImmutableValue(IR.number(1)));
        assertTrue(NodeUtil.isImmutableValue(IR.nullNode()));
        assertTrue(NodeUtil.isImmutableValue(IR.trueNode()));
        assertTrue(NodeUtil.isImmutableValue(IR.falseNode()));
        assertTrue(NodeUtil.isImmutableValue(IR.name("undefined")));
        assertTrue(NodeUtil.isImmutableValue(IR.name("Infinity")));
        assertTrue(NodeUtil.isImmutableValue(IR.name("NaN")));

        assertFalse(NodeUtil.isImmutableValue(IR.name("variable")));
    }

    @Test
    public void testIsValidDefineValue() {
        Set<String> defines = new HashSet<>();
        defines.add("MY_DEFINE");

        assertTrue(NodeUtil.isValidDefineValue(IR.string("str"), defines));
        assertTrue(NodeUtil.isValidDefineValue(IR.number(10), defines));
        assertTrue(NodeUtil.isValidDefineValue(IR.trueNode(), defines));
        assertTrue(NodeUtil.isValidDefineValue(IR.falseNode(), defines));

        Node qName = IR.getprop(IR.name("window"), IR.string("MY_DEFINE"));
        // Test qualified name define check
        assertFalse(NodeUtil.isValidDefineValue(IR.name("unknownVar"), defines));
    }

    @Test
    public void testIsEmptyBlock() {
        Node emptyBlock = IR.block();
        assertTrue(NodeUtil.isEmptyBlock(emptyBlock));

        Node nonBlock = IR.number(1);
        assertFalse(NodeUtil.isEmptyBlock(nonBlock));

        Node blockWithEmpty = IR.block(IR.empty());
        assertTrue(NodeUtil.isEmptyBlock(blockWithEmpty));

        Node blockWithStmt = IR.block(IR.number(1));
        assertFalse(NodeUtil.isEmptyBlock(blockWithStmt));
    }

    @Test
    public void testIsExpressionResultUsed() {
        // EXPR_RESULT parent -> false
        Node num = IR.number(1);
        Node exprResult = IR.exprResult(num);
        assertFalse(NodeUtil.isExpressionResultUsed(num));

        // HOOK / AND / OR branching
        Node andNode = IR.and(IR.trueNode(), IR.falseNode());
        assertTrue(NodeUtil.isExpressionResultUsed(andNode.getFirstChild()));

        // COMMA with eval special case
        Node evalCall = IR.comma(IR.name("eval"), IR.number(1));
        Node commaExpr = IR.exprResult(evalCall);
        assertTrue(NodeUtil.isExpressionResultUsed(evalCall.getFirstChild()));
    }

    @Test
    public void testIsExecutedExactlyOnce() {
        Node num = IR.number(1);
        Node script = IR.script(IR.exprResult(num));
        
        // Unconditional under script should be true
        assertTrue(NodeUtil.isExecutedExactlyOnce(num));

        // Inside while loop should be false
        Node whileNode = IR.whileNode(IR.trueNode(), IR.block(num));
        assertFalse(NodeUtil.isExecutedExactlyOnce(num));
    }

    @Test
    public void testPrecedenceAndOperators() {
        assertEquals(0, NodeUtil.precedence(Token.COMMA));
        assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
        assertEquals(2, NodeUtil.precedence(Token.HOOK));
        assertEquals(3, NodeUtil.precedence(Token.OR));
        assertEquals(4, NodeUtil.precedence(Token.AND));
        assertEquals(15, NodeUtil.precedence(Token.NUMBER));

        assertEquals("+", NodeUtil.opToStr(Token.ADD));
        assertEquals("===", NodeUtil.opToStr(Token.SHEQ));
        assertNull(NodeUtil.opToStr(Token.ERROR));

        assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
    }
}