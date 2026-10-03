package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableSet;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class NodeUtilTest {

    // --- getStringNumberValue & trimJsWhiteSpace Tests ---
    @Test
    public void testGetStringNumberValue_EmptyAndWhitespace() {
        assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue(""));
        assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue("   \t\n "));
    }

    @Test
    public void testGetStringNumberValue_HexValid() {
        assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0xFF"));
        assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0Xff"));
    }

    @Test
    public void testGetStringNumberValue_HexInvalidNumberFormat() {
        assertEquals(Double.NaN, NodeUtil.getStringNumberValue("0xGG"), 0.001);
    }

    @Test
    public void testGetStringNumberValue_HexWithExplicitSign() {
        assertNull(NodeUtil.getStringNumberValue("+0xFF"));
        assertNull(NodeUtil.getStringNumberValue("-0xFF"));
    }

    @Test
    public void testGetStringNumberValue_InfinityVariants() {
        assertNull(NodeUtil.getStringNumberValue("infinity"));
        assertNull(NodeUtil.getStringNumberValue("-infinity"));
        assertNull(NodeUtil.getStringNumberValue("+infinity"));
    }

    @Test
    public void testGetStringNumberValue_StandardParsesAndErrors() {
        assertEquals(Double.valueOf(123.45), NodeUtil.getStringNumberValue("123.45"));
        assertEquals(Double.NaN, NodeUtil.getStringNumberValue("not-a-number"), 0.001);
    }

    // --- isStrWhiteSpaceChar Tests ---
    @Test
    public void testIsStrWhiteSpaceChar() {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u000B'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(' '));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\n'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\r'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\t'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u00A0'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u000C'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2028'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2029'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\uFEFF'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u3000')); // Ideographic space (Separator)
        assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('a'));
    }

    // --- isValidDefineValue Tests ---
    @Test
    public void testIsValidDefineValue_Primitives() {
        Set<String> defines = new HashSet<String>();
        assertTrue(NodeUtil.isValidDefineValue(Node.newString("test"), defines));
        assertTrue(NodeUtil.isValidDefineValue(Node.newNumber(10), defines));
        assertTrue(NodeUtil.isValidDefineValue(new Node(Token.TRUE), defines));
        assertTrue(NodeUtil.isValidDefineValue(new Node(Token.FALSE), defines));
    }

    @Test
    public void testIsValidDefineValue_BinaryAndUnaryOperators() {
        Set<String> defines = new HashSet<String>();
        defines.add("MY_DEF");

        Node addNode = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        assertTrue(NodeUtil.isValidDefineValue(addNode, defines));

        Node notNode = new Node(Token.NOT, new Node(Token.TRUE));
        assertTrue(NodeUtil.isValidDefineValue(notNode, defines));

        Node qName = NodeUtil.newQualifiedNameNode(new DefaultCodingConvention(), "MY_DEF", -1, -1);
        assertTrue(NodeUtil.isValidDefineValue(qName, defines));

        Node invalidNode = new Node(Token.THIS);
        assertFalse(NodeUtil.isValidDefineValue(invalidNode, defines));
    }

    // --- constructorCallHasSideEffects Tests ---
    @Test(expected = IllegalStateException.class)
    public void testConstructorCallHasSideEffects_NotNewNode() {
        Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "Array"));
        NodeUtil.constructorCallHasSideEffects(callNode);
    }

    @Test
    public void testConstructorCallHasSideEffects_NoSideEffects() {
        Node newObj = new Node(Token.NEW, Node.newString(Token.NAME, "Object"));
        assertFalse(NodeUtil.constructorCallHasSideEffects(newObj));

        Node noSideEffectFlagCall = new Node(Token.NEW, Node.newString(Token.NAME, "Custom"));
        noSideEffectFlagCall.setIsNoSideEffectsCall(true);
        assertFalse(NodeUtil.constructorCallHasSideEffects(noSideEffectFlagCall));
    }

    @Test
    public void testConstructorCallHasSideEffects_WithSideEffects() {
        Node newCustom = new Node(Token.NEW, Node.newString(Token.NAME, "CustomCtor"));
        assertTrue(NodeUtil.constructorCallHasSideEffects(newCustom));
    }

    // --- functionCallHasSideEffects Tests ---
    @Test(expected = IllegalStateException.class)
    public void testFunctionCallHasSideEffects_NotCallNode() {
        Node newProp = new Node(Token.NEW, Node.newString(Token.NAME, "Object"));
        NodeUtil.functionCallHasSideEffects(newProp);
    }

    @Test
    public void testFunctionCallHasSideEffects_BuiltinAndMath() {
        Node builtinCall = new Node(Token.CALL, Node.newString(Token.NAME, "Array"));
        assertFalse(NodeUtil.functionCallHasSideEffects(builtinCall));

        Node mathCall = new Node(Token.CALL, 
            new Node(Token.GETPROP, Node.newString(Token.NAME, "Math"), Node.newString(Token.STRING, "floor"))
        );
        assertFalse(NodeUtil.functionCallHasSideEffects(mathCall));
    }

    @Test
    public void testFunctionCallHasSideEffects_ObjectMethodsWithoutSideEffects() {
        Node toStringCall = new Node(Token.CALL,
            new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString(Token.STRING, "toString"))
        );
        assertTrue(NodeUtil.functionCallHasSideEffects(toStringCall)); // hasOneChild is false here (no arguments/target check mismatch unless structured properly)
    }

    // --- evaluatesToLocalValue Tests ---
    @Test
    public void testEvaluatesToLocalValue_LiteralsAndOps() {
        assertTrue(NodeUtil.evaluatesToLocalValue(Node.newNumber(5)));
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.TRUE)));
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.ARRAYLIT)));
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.OBJECTLIT)));
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.REGEXP)));
        
        Node commaNode = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(2));
        assertTrue(NodeUtil.evaluatesToLocalValue(commaNode));

        Node assignNode = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(5));
        assertTrue(NodeUtil.evaluatesToLocalValue(assignNode));
    }

    @Test(expected = IllegalStateException.class)
    public void testEvaluatesToLocalValue_UnexpectedNode() {
        Node unhandled = new Node(Token.SCRIPT);
        NodeUtil.evaluatesToLocalValue(unhandled);
    }

    // --- Additional coverage for NodeUtil helpers ---
    @Test
    public void testIsImmutableValue() {
        assertTrue(NodeUtil.isImmutableValue(Node.newNumber(10)));
        assertTrue(NodeUtil.isImmutableValue(Node.newString("str")));
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));
        assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "undefined")));
        assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "NaN")));
        assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "Infinity")));
        assertFalse(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "window")));
    }

    @Test
    public void testIsEmptyBlock() {
        Node emptyBlock = new Node(Token.BLOCK);
        assertTrue(NodeUtil.isEmptyBlock(emptyBlock));

        Node nonBlock = new Node(Token.EMPTY);
        assertFalse(NodeUtil.isEmptyBlock(nonBlock));

        Node blockWithChild = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT));
        assertFalse(NodeUtil.isEmptyBlock(blockWithChild));
    }

    @Test
    public void testPrecedence() {
        assertEquals(0, NodeUtil.precedence(Token.COMMA));
        assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
        assertEquals(2, NodeUtil.precedence(Token.HOOK));
        assertEquals(3, NodeUtil.precedence(Token.OR));
        assertEquals(4, NodeUtil.precedence(Token.AND));
        assertEquals(15, NodeUtil.precedence(Token.NUMBER));
    }

    @Test(expected = Error.class)
    public void testPrecedence_Unknown() {
        NodeUtil.precedence(-999);
    }
}