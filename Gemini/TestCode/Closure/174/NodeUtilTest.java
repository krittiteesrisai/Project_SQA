package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class NodeUtilTest {

    @Test
    public void testGetStringNumberValue_EdgeCases() {
        // Vertical Tab branch -> returns null
        assertNull(NodeUtil.getStringNumberValue("abc\u000bde"));

        // Empty string / whitespace trim branch -> returns 0.0
        assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue("   "));
        assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue(""));

        // Valid Hex numbers branch
        assertEquals(Double.valueOf(18.0), NodeUtil.getStringNumberValue("0x12"));
        assertEquals(Double.valueOf(18.0), NodeUtil.getStringNumberValue("0X12"));

        // Invalid Hex number format (NumberFormatException) -> returns NaN
        assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("0xG")));

        // Hex with explicit signs branch -> returns null
        assertNull(NodeUtil.getStringNumberValue("-0x12"));
        assertNull(NodeUtil.getStringNumberValue("+0x12"));

        // Infinity variants branch -> returns null
        assertNull(NodeUtil.getStringNumberValue("infinity"));
        assertNull(NodeUtil.getStringNumberValue("-infinity"));
        assertNull(NodeUtil.getStringNumberValue("+infinity"));

        // Standard parse double and parse exception (NaN)
        assertEquals(Double.valueOf(123.45), NodeUtil.getStringNumberValue("  123.45  "));
        assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("not-a-number")));
    }

    @Test
    public void testIsStrWhiteSpaceChar_Branches() {
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.isStrWhiteSpaceChar('\u000B'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(' '));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\n'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\r'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\t'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u00A0'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u000C'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2028'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2029'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\uFEFF'));
        // Space separator character (e.g., OGHAM SPACE MARK '\u1680')
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u1680'));
        // Regular non-whitespace character
        assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('a'));
    }

    @Test
    public void testGetNearestFunctionName_Branches() {
        // Not a function node -> returns null
        Node notFunc = IR.number(1);
        assertNull(NodeUtil.getNearestFunctionName(notFunc));

        // Function with literal key parent (STRING_KEY, GETTER_DEF, SETTER_DEF, NUMBER)
        Node func = IR.function(IR.name(""), IR.paramList(), IR.block());
        
        Node stringKeyParent = IR.stringKey("myKey", func);
        assertEquals("myKey", NodeUtil.getNearestFunctionName(func));

        Node getterParent = new Node(Token.GETTER_DEF, func);
        getterParent.setString("getterKey");
        assertEquals("getterKey", NodeUtil.getNearestFunctionName(func));

        Node setterParent = new Node(Token.SETTER_DEF, func);
        setterParent.setString("setterKey");
        assertEquals("setterKey", NodeUtil.getNearestFunctionName(func));

        Node numberParent = IR.number(123);
        numberParent.addChildToBack(func);
        assertEquals("123", NodeUtil.getNearestFunctionName(func));
    }

    @Test
    public void testIsValidDefineValue_Branches() {
        Set<String> defines = new HashSet<String>();
        defines.add("MY_DEFINE");

        // Literal values
        assertTrue(NodeUtil.isValidDefineValue(IR.string("test"), defines));
        assertTrue(NodeUtil.isValidDefineValue(IR.number(1), defines));
        assertTrue(NodeUtil.isValidDefineValue(IR.trueNode(), defines));
        assertTrue(NodeUtil.isValidDefineValue(IR.falseNode(), defines));

        // Binary operator with valid children
        Node addNode = IR.add(IR.number(1), IR.number(2));
        assertTrue(NodeUtil.isValidDefineValue(addNode, defines));

        // Binary operator with invalid child
        Node invalidAdd = IR.add(IR.number(1), IR.name("unknownVar"));
        assertFalse(NodeUtil.isValidDefineValue(invalidAdd, defines));

        // Unary operator
        Node notNode = IR.not(IR.trueNode());
        assertTrue(NodeUtil.isValidDefineValue(notNode, defines));

        // Qualified name in defines set
        Node qNameNode = IR.name("MY_DEFINE");
        assertTrue(NodeUtil.isValidDefineValue(qNameNode, defines));

        // Qualified name NOT in defines set
        Node unknownNameNode = IR.name("UNKNOWN_DEFINE");
        assertFalse(NodeUtil.isValidDefineValue(unknownNameNode, defines));

        // Unsupported node type
        assertFalse(NodeUtil.isValidDefineValue(IR.arrayLit(), defines));
    }

    @Test
    public void testIsEmptyBlock_Branches() {
        Node nonBlock = IR.number(1);
        assertFalse(NodeUtil.isEmptyBlock(nonBlock));

        Node emptyBlock = IR.block();
        assertTrue(NodeUtil.isEmptyBlock(emptyBlock));

        Node blockWithEmptyChild = IR.block(IR.empty());
        assertTrue(NodeUtil.isEmptyBlock(blockWithEmptyChild));

        Node blockWithNonEmptyChild = IR.block(IR.number(1));
        assertFalse(NodeUtil.isEmptyBlock(blockWithNonEmptyChild));
    }

    @Test
    public void testIsImmutableValue_Branches() {
        assertTrue(NodeUtil.isImmutableValue(IR.string("abc")));
        assertTrue(NodeUtil.isImmutableValue(IR.number(10)));
        assertTrue(NodeUtil.isImmutableValue(IR.nullNode()));
        assertTrue(NodeUtil.isImmutableValue(IR.trueNode()));
        assertTrue(NodeUtil.isImmutableValue(IR.falseNode()));
        assertTrue(NodeUtil.isImmutableValue(IR.name("undefined")));
        assertTrue(NodeUtil.isImmutableValue(IR.name("Infinity")));
        assertTrue(NodeUtil.isImmutableValue(IR.name("NaN")));

        Node castNode = new Node(Token.CAST, IR.number(1));
        assertTrue(NodeUtil.isImmutableValue(castNode));

        assertFalse(NodeUtil.isImmutableValue(IR.name("mutableVar")));
    }

    @Test
    public void testConstructorCallHasSideEffects_Exceptions() {
        Node callNode = IR.call(IR.name("A"));
        try {
            NodeUtil.constructorCallHasSideEffects(callNode);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testFunctionCallHasSideEffects_Exceptions() {
        Node newNode = new Node(Token.NEW, IR.name("A"));
        try {
            NodeUtil.functionCallHasSideEffects(newNode);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // Expected
        }
    }
}