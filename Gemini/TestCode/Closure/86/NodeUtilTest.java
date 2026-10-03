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

    // --- Tests for getBooleanValue and getExpressionBooleanValue ---

    @Test
    public void testGetBooleanValueString() {
        Node nonEmpNode = Node.newString("hello");
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(nonEmpNode));

        Node empNode = Node.newString("");
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(empNode));
    }

    @Test
    public void testGetBooleanValueNumber() {
        Node nonZeroNode = Node.newNumber(5.0);
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(nonZeroNode));

        Node zeroNode = Node.newNumber(0.0);
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(zeroNode));
    }

    @Test
    public void testGetBooleanValueNullFalseVoid() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(new Node(Token.NULL)));
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(new Node(Token.FALSE)));
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(new Node(Token.VOID)));
    }

    @Test
    public void testGetBooleanValueName() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "undefined")));
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "NaN")));
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "Infinity")));
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "unknownVar")));
    }

    @Test
    public void testGetBooleanValueLiterals() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.TRUE)));
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.ARRAYLIT)));
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.OBJECTLIT)));
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.REGEXP)));
    }

    @Test
    public void testGetExpressionBooleanValueAssignAndComma() {
        Node assign = new Node(Token.ASSIGN, Node.newString("a"), Node.newNumber(1));
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(assign));

        Node comma = new Node(Token.COMMA, Node.newNumber(0), Node.newNumber(0));
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(comma));
    }

    @Test
    public void testGetExpressionBooleanValueNotAndOr() {
        Node notNode = new Node(Token.NOT, Node.newNumber(1));
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(notNode));

        Node andNode = new Node(Token.AND, Node.newNumber(1), Node.newNumber(5));
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(andNode));

        Node orNode = new Node(Token.OR, Node.newNumber(0), Node.newNumber(0));
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(orNode));
    }

    @Test
    public void testGetExpressionBooleanValueHook() {
        // hook: condition ? trueVal : falseVal
        Node hookEqual = new Node(Token.HOOK, Node.newNumber(1), Node.newNumber(5), Node.newNumber(5));
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(hookEqual));

        Node hookDiff = new Node(Token.HOOK, Node.newNumber(1), Node.newNumber(5), Node.newNumber(0));
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getExpressionBooleanValue(hookDiff));
    }

    // --- Tests for getStringValue ---

    @Test
    public void testGetStringValue() {
        assertEquals("test", NodeUtil.getStringValue(Node.newString("test")));
        assertEquals("undefined", NodeUtil.getStringValue(Node.newString(Token.NAME, "undefined")));
        assertEquals("Infinity", NodeUtil.getStringValue(Node.newString(Token.NAME, "Infinity")));
        assertEquals("NaN", NodeUtil.getStringValue(Node.newString(Token.NAME, "NaN")));
        assertNull(NodeUtil.getStringValue(Node.newString(Token.NAME, "otherName")));

        assertEquals("1", NodeUtil.getStringValue(Node.newNumber(1.0)));
        assertEquals("1.5", NodeUtil.getStringValue(Node.newNumber(1.5)));

        assertEquals("false", NodeUtil.getStringValue(new Node(Token.FALSE)));
        assertEquals("true", NodeUtil.getStringValue(new Node(Token.TRUE)));
        assertEquals("null", NodeUtil.getStringValue(new Node(Token.NULL)));
        assertEquals("undefined", NodeUtil.getStringValue(new Node(Token.VOID)));
        assertNull(NodeUtil.getStringValue(new Node(Token.BLOCK)));
    }

    // --- Tests for getNumberValue ---

    @Test
    public void testGetNumberValue() {
        assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(new Node(Token.TRUE)));
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(new Node(Token.FALSE)));
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(new Node(Token.NULL)));
        assertEquals(Double.valueOf(10.5), NodeUtil.getNumberValue(Node.newNumber(10.5)));
        assertEquals(Double.NaN, NodeUtil.getNumberValue(new Node(Token.VOID)), 0.0);

        assertEquals(Double.NaN, NodeUtil.getNumberValue(Node.newString(Token.NAME, "undefined")), 0.0);
        assertEquals(Double.NaN, NodeUtil.getNumberValue(Node.newString(Token.NAME, "NaN")), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(Node.newString(Token.NAME, "Infinity")), 0.0);
        assertNull(NodeUtil.getNumberValue(Node.newString(Token.NAME, "random")));
        assertNull(NodeUtil.getNumberValue(new Node(Token.BLOCK)));
    }

    // --- Tests for Function Name utilities ---

    @Test
    public void testGetFunctionNameAndNearest() {
        Node fn = new Node(Token.FUNCTION);
        Node nameNode = Node.newString(Token.NAME, "myFunc");
        fn.addChildToBack(nameNode);
        fn.addChildToBack(new Node(Token.LP));
        fn.addChildToBack(new Node(Token.BLOCK));

        // Parent NAME
        Node parentName = Node.newString(Token.NAME, "varName");
        parentName.addChildToBack(fn);
        assertEquals("varName", NodeUtil.getFunctionName(fn));

        // Parent ASSIGN
        Node parentAssign = new Node(Token.ASSIGN, Node.newString(Token.NAME, "obj.prop"), fn);
        assertEquals("obj.prop", NodeUtil.getFunctionName(fn));

        // Default parent (e.g. SCRIPT)
        Node scriptParent = new Node(Token.SCRIPT, fn);
        assertEquals("myFunc", NodeUtil.getFunctionName(fn));

        // Unnamed function with empty name and string parent for nearest
        Node unNamedFn = new Node(Token.FUNCTION);
        unNamedFn.addChildToBack(Node.newString(Token.NAME, ""));
        unNamedFn.addChildToBack(new Node(Token.LP));
        unNamedFn.addChildToBack(new Node(Token.BLOCK));
        Node stringParent = Node.newString("keyName");
        stringParent.addChildToBack(unNamedFn);
        assertEquals("keyName", NodeUtil.getNearestFunctionName(unNamedFn));
    }

    // --- Tests for Immutable & Literal Values ---

    @Test
    public void testIsImmutableValue() {
        assertTrue(NodeUtil.isImmutableValue(Node.newString("abc")));
        assertTrue(NodeUtil.isImmutableValue(Node.newNumber(123)));
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));

        Node neg = new Node(Token.NEG, Node.newNumber(5));
        assertTrue(NodeUtil.isImmutableValue(neg));

        assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "undefined")));
        assertFalse(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "customVar")));
    }

    @Test
    public void testIsLiteralValue() {
        Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1));
        assertTrue(NodeUtil.isLiteralValue(arrayLit, false));

        Node objLit = new Node(Token.OBJECTLIT, new Node(Token.STRING_KEY, Node.newNumber(2)));
        assertTrue(NodeUtil.isLiteralValue(objLit, false));

        Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
        assertFalse(NodeUtil.isLiteralValue(func, true));
    }

    // --- Tests for isValidDefineValue ---

    @Test
    public void testIsValidDefineValue() {
        Set<String> defines = new HashSet<String>();
        defines.add("myDefine");

        assertTrue(NodeUtil.isValidDefineValue(Node.newNumber(1), defines));
        
        Node addOp = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        assertTrue(NodeUtil.isValidDefineValue(addOp, defines));

        Node notOp = new Node(Token.NOT, new Node(Token.TRUE));
        assertTrue(NodeUtil.isValidDefineValue(notOp, defines));

        Node qName = Node.newString(Token.NAME, "myDefine");
        // Mocking parent/qualification checks if necessary or use simple name
        assertTrue(NodeUtil.isValidDefineValue(qName, defines));

        Node invalidNode = new Node(Token.THIS);
        assertFalse(NodeUtil.isValidDefineValue(invalidNode, defines));
    }

    // --- Tests for Block and Operators ---

    @Test
    public void testIsEmptyBlock() {
        Node blockEmpty = new Node(Token.BLOCK, new Node(Token.EMPTY));
        assertTrue(NodeUtil.isEmptyBlock(blockEmpty));

        Node blockNotEmpty = new Node(Token.BLOCK, Node.newNumber(1));
        assertFalse(NodeUtil.isEmptyBlock(blockNotEmpty));

        Node notABlock = Node.newNumber(1);
        assertFalse(NodeUtil.isEmptyBlock(notABlock));
    }

    @Test
    public void testSimpleOperators() {
        assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
        assertFalse(NodeUtil.isSimpleOperatorType(Token.ASSIGN));
    }

    // --- Tests for Side Effects & Mutable State ---

    @Test
    public void testMayHaveSideEffects() {
        Node throwNode = new Node(Token.THROW, Node.newString("error"));
        assertTrue(NodeUtil.mayHaveSideEffects(throwNode));

        Node safeNode = Node.newNumber(10);
        assertFalse(NodeUtil.mayHaveSideEffects(safeNode));
    }

    @Test
    public void testConstructorCallHasSideEffects() {
        Node newSafe = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
        assertFalse(NodeUtil.constructorCallHasSideEffects(newSafe));

        Node newUnsafe = new Node(Token.NEW, Node.newString(Token.NAME, "CustomCtor"));
        assertTrue(NodeUtil.constructorCallHasSideEffects(newUnsafe));
    }

    @Test
    public void testFunctionCallHasSideEffects() {
        Node callSafe = new Node(Token.CALL, Node.newString(Token.NAME, "Array"));
        assertFalse(NodeUtil.functionCallHasSideEffects(callSafe));

        Node mathCall = new Node(Token.CALL, 
            new Node(Token.GETPROP, Node.newString(Token.NAME, "Math"), Node.newString(Token.STRING, "floor")),
            Node.newNumber(1.5));
        assertFalse(NodeUtil.functionCallHasSideEffects(mathCall));
    }

    // --- Tests for Precedence, OpToStr, and Misc ---

    @Test
    public void testPrecedenceAndOpToStr() {
        assertEquals(0, NodeUtil.precedence(Token.COMMA));
        assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
        assertEquals("|", NodeUtil.opToStr(Token.BITOR));
        assertEquals("===", NodeUtil.opToStr(Token.SHEQ));
        assertNull(NodeUtil.opToStr(Token.BLOCK));
        
        assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
    }

    @Test(expected = Error.class)
    public void testOpToStrNoFailError() {
        NodeUtil.opToStrNoFail(Token.BLOCK);
    }

    @Test
    public void testIsLatin() {
        assertTrue(NodeUtil.isLatin("Hello World 123!"));
        assertFalse(NodeUtil.isLatin("Hello \u0080"));
    }

    @Test
    public void testIsValidPropertyName() {
        assertTrue(NodeUtil.isValidPropertyName("validProp"));
        assertFalse(NodeUtil.isValidPropertyName("if")); // keyword
        assertFalse(NodeUtil.isValidPropertyName("invalid\u0080Prop"));
    }

    @Test
    public void testTryMergeBlock() {
        Node parentBlock = new Node(Token.BLOCK, Node.newNumber(1));
        Node childBlock = new Node(Token.BLOCK, Node.newNumber(2));
        parentBlock.addChildToBack(childBlock);

        assertTrue(NodeUtil.tryMergeBlock(childBlock));

        Node nonBlockParent = Node.newNumber(1);
        Node orphanBlock = new Node(Token.BLOCK);
        nonBlockParent.addChildToBack(orphanBlock);
        assertFalse(NodeUtil.tryMergeBlock(orphanBlock));
    }
}