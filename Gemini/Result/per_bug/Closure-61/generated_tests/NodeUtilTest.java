package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class NodeUtilTest {

    // --- Tests for getStringValue(Node) ---

    @Test
    public void testGetStringValueString() {
        Node node = Node.newString("hello");
        assertEquals("hello", NodeUtil.getStringValue(node));
    }

    @Test
    public void testGetStringValueNameKnownConstants() {
        assertEquals("undefined", NodeUtil.getStringValue(Node.newString(Token.NAME, "undefined")));
        assertEquals("Infinity", NodeUtil.getStringValue(Node.newString(Token.NAME, "Infinity")));
        assertEquals("NaN", NodeUtil.getStringValue(Node.newString(Token.NAME, "NaN")));
        assertNull(NodeUtil.getStringValue(Node.newString(Token.NAME, "unknownVar")));
    }

    @Test
    public void testGetStringValueNumber() {
        assertEquals("123", NodeUtil.getStringValue(Node.newNumber(123.0)));
        assertEquals("123.5", NodeUtil.getStringValue(Node.newNumber(123.5)));
    }

    @Test
    public void testGetStringValuePrimitivesAndVoid() {
        assertEquals("false", NodeUtil.getStringValue(new Node(Token.FALSE)));
        assertEquals("true", NodeUtil.getStringValue(new Node(Token.TRUE)));
        assertEquals("null", NodeUtil.getStringValue(new Node(Token.NULL)));
        assertEquals("undefined", NodeUtil.getStringValue(new Node(Token.VOID)));
    }

    @Test
    public void testGetStringValueNot() {
        // !false -> true -> string "true" (pure boolean value of child is false, reversed to "true")
        Node notNode = new Node(Token.NOT, new Node(Token.FALSE));
        assertEquals("true", NodeUtil.getStringValue(notNode));

        // Unknown pure boolean
        Node unknownNot = new Node(Token.NOT, Node.newString(Token.NAME, "unknownVar"));
        assertNull(NodeUtil.getStringValue(unknownNot));
    }

    @Test
    public void testGetStringValueArrayAndObjectLit() {
        Node arrayLit = new Node(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"));
        assertEquals("a,b", NodeUtil.getStringValue(arrayLit));

        Node objLit = new Node(Token.OBJECTLIT);
        assertEquals("[object Object]", NodeUtil.getStringValue(objLit));
    }

    // --- Tests for getNumberValue(Node) & getStringNumberValue(String) ---

    @Test
    public void testGetNumberValuePrimitives() {
        assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(new Node(Token.TRUE)));
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(new Node(Token.FALSE)));
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(new Node(Token.NULL)));
        assertEquals(Double.valueOf(42.0), NodeUtil.getNumberValue(Node.newNumber(42.0)));
    }

    @Test
    public void testGetNumberValueVoid() {
        Node voidWithoutSideEffect = new Node(Token.VOID, Node.newNumber(0));
        assertTrue(Double.isNaN(NodeUtil.getNumberValue(voidWithoutSideEffect)));

        Node voidWithSideEffect = new Node(Token.VOID, new Node(Token.THROW, Node.newString("err")));
        assertNull(NodeUtil.getNumberValue(voidWithSideEffect));
    }

    @Test
    public void testGetNumberValueName() {
        assertTrue(Double.isNaN(NodeUtil.getNumberValue(Node.newString(Token.NAME, "undefined"))));
        assertTrue(Double.isNaN(NodeUtil.getNumberValue(Node.newString(Token.NAME, "NaN"))));
        assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(Node.newString(Token.NAME, "Infinity")));
        assertNull(NodeUtil.getNumberValue(Node.newString(Token.NAME, "randomName")));
    }

    @Test
    public void testGetNumberValueNeg() {
        Node infName = Node.newString(Token.NAME, "Infinity");
        Node negInf = new Node(Token.NEG, infName);
        assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(negInf));

        Node invalidNeg = new Node(Token.NEG, Node.newNumber(5));
        assertNull(NodeUtil.getNumberValue(invalidNeg));
    }

    @Test
    public void testGetNumberValueNot() {
        Node notTrue = new Node(Token.NOT, new Node(Token.TRUE));
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(notTrue));

        Node notUnknown = new Node(Token.NOT, Node.newString(Token.NAME, "unknown"));
        assertNull(NodeUtil.getNumberValue(notUnknown));
    }

    @Test
    public void testGetStringNumberValueEdges() {
        assertNull(NodeUtil.getStringNumberValue("123\u000b456")); // vertical tab
        assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue("   ")); // whitespace trim
        assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0xFF"));
        assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0XFF"));
        assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("0xINVALID")));
        assertNull(NodeUtil.getStringNumberValue("-0xFF")); // explicit sign on hex
        assertNull(NodeUtil.getStringNumberValue("infinity"));
        assertNull(NodeUtil.getStringNumberValue("-infinity"));
        assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("not-a-number")));
    }

    // --- Tests for isImmutableValue(Node) ---

    @Test
    public void testIsImmutableValue() {
        assertTrue(NodeUtil.isImmutableValue(Node.newString("str")));
        assertTrue(NodeUtil.isImmutableValue(Node.newNumber(1.0)));
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.NOT, new Node(Token.TRUE))));
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.VOID, Node.newNumber(0))));
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.NEG, Node.newNumber(1))));
        assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "undefined")));
        assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "Infinity")));
        assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "NaN")));
        assertFalse(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "mutableVar")));
        assertFalse(NodeUtil.isImmutableValue(new Node(Token.CALL)));
    }

    // --- Tests for mayHaveSideEffects(Node) ---

    @Test
    public void testMayHaveSideEffects() {
        assertFalse(NodeUtil.mayHaveSideEffects(Node.newNumber(10)));
        assertTrue(NodeUtil.mayHaveSideEffects(new Node(Token.THROW, Node.newString("error"))));

        Node objLit = new Node(Token.OBJECTLIT, new Node(Token.STRING, "a"));
        assertTrue(NodeUtil.mayHaveSideEffects(objLit)); // checkForNewObjects = true by default

        Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
        assertFalse(NodeUtil.mayHaveSideEffects(varNode)); // empty var

        Node varWithInit = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
        varWithInit.getFirstChild().addChildToBack(Node.newNumber(1));
        assertTrue(NodeUtil.mayHaveSideEffects(varWithInit));

        Node funcDecl = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
        assertTrue(NodeUtil.mayHaveSideEffects(funcDecl));

        Node newNoSideEffect = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
        assertFalse(NodeUtil.mayHaveSideEffects(newNoSideEffect));

        Node callNoSideEffect = new Node(Token.CALL, Node.newString(Token.NAME, "Object"));
        assertFalse(NodeUtil.mayHaveSideEffects(callNoSideEffect));
    }

    // --- Tests for removeChild(Node, Node) ---

    @Test
    public void testRemoveChildTryFinallyWithCatch() {
        Node catchBlock = new Node(Token.BLOCK, new Node(Token.CATCH, Node.newString(Token.NAME, "e"), new Node(Token.BLOCK)));
        Node finallyBlock = new Node(Token.BLOCK);
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), catchBlock, finallyBlock);

        // Remove finally block when catch exists
        NodeUtil.removeChild(tryNode, finallyBlock);
        assertEquals(2, tryNode.getChildCount());
    }

    @Test
    public void testRemoveChildTryFinallyWithoutCatch() {
        Node finallyBlock = new Node(Token.BLOCK, Node.newNumber(1));
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), finallyBlock);

        // Remove finally without catch -> detaches children
        NodeUtil.removeChild(tryNode, finallyBlock);
        assertEquals(0, finallyBlock.getChildCount());
    }

    @Test
    public void testRemoveChildCatchNode() {
        Node catchNode = new Node(Token.CATCH, Node.newString(Token.NAME, "e"), new Node(Token.BLOCK));
        Node catchContainer = new Node(Token.BLOCK, catchNode);
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), catchContainer, new Node(Token.BLOCK));

        NodeUtil.removeChild(tryNode, catchNode); // Should detach from parent successfully (has finally)
    }

    @Test
    public void testRemoveChildBlock() {
        Node block = new Node(Token.BLOCK, Node.newNumber(1), Node.newNumber(2));
        NodeUtil.removeChild(new Node(Token.BLOCK), block);
        assertEquals(0, block.getChildCount());
    }

    @Test
    public void testRemoveChildStatementBlock() {
        Node parentBlock = new Node(Token.BLOCK, Node.newNumber(1));
        Node child = parentBlock.getFirstChild();
        NodeUtil.removeChild(parentBlock, child);
        assertEquals(0, parentBlock.getChildCount());
    }

    @Test
    public void testRemoveChildVar() {
        Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y"));
        Node nameX = varNode.getFirstChild();
        NodeUtil.removeChild(varNode, nameX);
        assertEquals(1, varNode.getChildCount());

        // Remove last child of VAR should remove VAR itself from its parent (SCRIPT/BLOCK)
        Node script = new Node(Token.SCRIPT, varNode);
        Node nameY = varNode.getFirstChild();
        NodeUtil.removeChild(varNode, nameY);
        assertEquals(0, script.getChildCount());
    }

    @Test
    public void testRemoveChildLabel() {
        Node labelChild = Node.newNumber(1);
        Node labelNode = new Node(Token.LABEL, Node.newString(Token.LABEL_NAME, "lbl"), labelChild);
        Node script = new Node(Token.SCRIPT, labelNode);

        NodeUtil.removeChild(labelNode, labelChild);
        assertEquals(0, script.getChildCount()); // Label without children removed
    }

    @Test
    public void testRemoveChildFor() {
        Node forNode = new Node(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY), new Node(Token.EMPTY), new Node(Token.BLOCK));
        Node cond = forNode.getFirstChild().getNext();
        NodeUtil.removeChild(forNode, cond);
        assertEquals(Token.EMPTY, forNode.getFirstChild().getNext().getType());
    }

    @Test(expected = IllegalStateException.class)
    public void testRemoveChildInvalidThrows() {
        Node invalidParent = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        NodeUtil.removeChild(invalidParent, invalidParent.getFirstChild());
    }
}