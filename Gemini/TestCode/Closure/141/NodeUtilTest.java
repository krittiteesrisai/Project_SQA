package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;
import org.junit.Assert;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class NodeUtilTest {

    @Test
    public void testGetBooleanValue_String() {
        Node nonEmptyStr = Node.newString(Token.STRING, "hello");
        Node emptyStr = Node.newString(Token.STRING, "");

        Assert.assertTrue(NodeUtil.getBooleanValue(nonEmptyStr));
        Assert.assertFalse(NodeUtil.getBooleanValue(emptyStr));
    }

    @Test
    public void testGetBooleanValue_Number() {
        Node nonZeroNum = Node.newNumber(42.0);
        Node zeroNum = Node.newNumber(0.0);

        Assert.assertTrue(NodeUtil.getBooleanValue(nonZeroNum));
        Assert.assertFalse(NodeUtil.getBooleanValue(zeroNum));
    }

    @Test
    public void testGetBooleanValue_NullFalseVoid() {
        Assert.assertFalse(NodeUtil.getBooleanValue(new Node(Token.NULL)));
        Assert.assertFalse(NodeUtil.getBooleanValue(new Node(Token.FALSE)));
        Assert.assertFalse(NodeUtil.getBooleanValue(new Node(Token.VOID)));
    }

    @Test
    public void testGetBooleanValue_Name() {
        Node undefName = Node.newString(Token.NAME, "undefined");
        Node nanName = Node.newString(Token.NAME, "NaN");
        Node infName = Node.newString(Token.NAME, "Infinity");

        Assert.assertFalse(NodeUtil.getBooleanValue(undefName));
        Assert.assertFalse(NodeUtil.getBooleanValue(nanName));
        Assert.assertTrue(NodeUtil.getBooleanValue(infName));
    }

    @Test
    public void testGetBooleanValue_TrueAndLiterals() {
        Assert.assertTrue(NodeUtil.getBooleanValue(new Node(Token.TRUE)));
        Assert.assertTrue(NodeUtil.getBooleanValue(new Node(Token.ARRAYLIT)));
        Assert.assertTrue(NodeUtil.getBooleanValue(new Node(Token.OBJECTLIT)));
        Assert.assertTrue(NodeUtil.getBooleanValue(new Node(Token.REGEXP)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetBooleanValue_InvalidLiteral() {
        Node invalid = new Node(Token.BLOCK);
        NodeUtil.getBooleanValue(invalid);
    }

    @Test
    public void testGetStringValue() {
        Node strNode = Node.newString(Token.STRING, "test");
        Assert.assertEquals("test", NodeUtil.getStringValue(strNode));

        Node intNumNode = Node.newNumber(5.0);
        Assert.assertEquals("5", NodeUtil.getStringValue(intNumNode));

        Node floatNumNode = Node.newNumber(5.5);
        Assert.assertEquals("5.5", NodeUtil.getStringValue(floatNumNode));

        Assert.assertEquals("true", NodeUtil.getStringValue(new Node(Token.TRUE)));
        Assert.assertEquals("false", NodeUtil.getStringValue(new Node(Token.FALSE)));
        Assert.assertEquals("null", NodeUtil.getStringValue(new Node(Token.NULL)));
        Assert.assertEquals("undefined", NodeUtil.getStringValue(new Node(Token.VOID)));

        Node unsupported = new Node(Token.BLOCK);
        Assert.assertNull(NodeUtil.getStringValue(unsupported));
    }

    @Test
    public void testGetFunctionName() {
        Node fnNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, "innerName"));
        
        // Parent is NAME
        Node parentName = Node.newString(Token.NAME, "varName");
        Assert.assertEquals("varName", NodeUtil.getFunctionName(fnNode, parentName));

        // Parent is ASSIGN
        Node assignNode = new Node(Token.ASSIGN, Node.newString(Token.NAME, "obj.prop"), new Node(Token.EMPTY));
        Assert.assertEquals("obj.prop", NodeUtil.getFunctionName(fnNode, assignNode));

        // Parent is other (fallback to inner name)
        Node parentExpr = new Node(Token.EXPR_RESULT);
        Assert.assertEquals("innerName", NodeUtil.getFunctionName(fnNode, parentExpr));
    }

    @Test
    public void testIsValidDefineValue() {
        Set<String> defines = new HashSet<String>();
        defines.add("myDefine");

        Assert.assertTrue(NodeUtil.isValidDefineValue(Node.newString(Token.STRING, "str"), defines));
        Assert.assertTrue(NodeUtil.isValidDefineValue(Node.newNumber(10), defines));
        Assert.assertTrue(NodeUtil.isValidDefineValue(new Node(Token.TRUE), defines));
        Assert.assertTrue(NodeUtil.isValidDefineValue(new Node(Token.FALSE), defines));

        // Operator wrapping valid child
        Node notNode = new Node(Token.NOT, Node.newNumber(1));
        Assert.assertTrue(NodeUtil.isValidDefineValue(notNode, defines));

        // Valid name in defines
        Node validName = Node.newString(Token.NAME, "myDefine");
        Assert.assertTrue(NodeUtil.isValidDefineValue(validName, defines));

        // Invalid name not in defines
        Node invalidName = Node.newString(Token.NAME, "otherVar");
        Assert.assertFalse(NodeUtil.isValidDefineValue(invalidName, defines));

        // Unsupported node
        Assert.assertFalse(NodeUtil.isValidDefineValue(new Node(Token.BLOCK), defines));
    }

    @Test
    public void testIsEmptyBlock() {
        Node emptyBlock = new Node(Token.BLOCK);
        Assert.assertTrue(NodeUtil.isEmptyBlock(emptyBlock));

        Node nonBlock = new Node(Token.EMPTY);
        Assert.assertFalse(NodeUtil.isEmptyBlock(nonBlock));

        Node blockWithEmpty = new Node(Token.BLOCK, new Node(Token.EMPTY));
        Assert.assertTrue(NodeUtil.isEmptyBlock(blockWithEmpty));

        Node blockWithStmt = new Node(Token.BLOCK, new Node(Token.TRUE));
        Assert.assertFalse(NodeUtil.isEmptyBlock(blockWithStmt));
    }

    @Test
    public void testMayHaveSideEffects() {
        Assert.assertTrue(NodeUtil.mayHaveSideEffects(new Node(Token.THROW)));
        Assert.assertFalse(NodeUtil.mayHaveSideEffects(new Node(Token.TRUE)));
        Assert.assertFalse(NodeUtil.mayHaveSideEffects(new Node(Token.NUMBER, 10.0)));

        // Safe constructor call (Array)
        Node safeNew = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
        Assert.assertFalse(NodeUtil.mayHaveSideEffects(safeNew));

        // Unsafe new call
        Node unsafeNew = new Node(Token.NEW, Node.newString(Token.NAME, "CustomClass"));
        Assert.assertTrue(NodeUtil.mayHaveSideEffects(unsafeNew));
    }

    @Test
    public void testCanBeSideEffected() {
        Node callNode = new Node(Token.CALL);
        Assert.assertTrue(NodeUtil.canBeSideEffected(callNode));

        Node nameNode = Node.newString(Token.NAME, "someVar");
        Set<String> knownConstants = Collections.emptySet();
        Assert.assertTrue(NodeUtil.canBeSideEffected(nameNode, knownConstants));

        // Safe node traversal
        Node safeNum = Node.newNumber(5);
        Assert.assertFalse(NodeUtil.canBeSideEffected(safeNum, knownConstants));
    }

    @Test
    public void testPrecedenceAndOpToStr() {
        Assert.assertEquals(15, NodeUtil.precedence(Token.TRUE));
        Assert.assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
        Assert.assertEquals("+", NodeUtil.opToStr(Token.ADD));
        Assert.assertNull(NodeUtil.opToStr(Token.BLOCK));

        Assert.assertEquals("==", NodeUtil.opToStrNoFail(Token.EQ));
    }

    @Test(expected = Error.class)
    public void testOpToStrNoFail_Exception() {
        NodeUtil.opToStrNoFail(Token.BLOCK);
    }

    @Test
    public void testIsAssignmentOpAndGetOp() {
        Node assign = new Node(Token.ASSIGN);
        Assert.assertTrue(NodeUtil.isAssignmentOp(assign));

        Node assignAdd = new Node(Token.ASSIGN_ADD);
        Assert.assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(assignAdd));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetOpFromAssignmentOp_Exception() {
        NodeUtil.getOpFromAssignmentOp(new Node(Token.ADD));
    }

    @Test
    public void testRemoveChild_VarSpecialHandling() {
        Node name1 = Node.newString(Token.NAME, "a");
        Node name2 = Node.newString(Token.NAME, "b");
        Node varNode = new Node(Token.VAR, name1, name2);
        Node parentBlock = new Node(Token.BLOCK, varNode);

        // Remove one child from multi-child VAR (should not delete VAR)
        NodeUtil.removeChild(varNode, name1);
        Assert.assertEquals(1, varNode.getChildCount());

        // Remove last child from single-child VAR (should delete VAR from parent block)
        NodeUtil.removeChild(varNode, name2);
        Assert.assertEquals(0, parentBlock.getChildCount());
    }

    @Test(expected = IllegalStateException.class)
    public void testRemoveChild_InvalidState() {
        Node invalidParent = new Node(Token.TRUE);
        Node child = new Node(Token.FALSE);
        NodeUtil.removeChild(invalidParent, child);
    }
}