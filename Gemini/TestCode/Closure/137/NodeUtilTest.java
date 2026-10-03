package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class NodeUtilTest {

  @Test
  public void testGetBooleanValue_String() {
    Node nonEmptyStr = Node.newString(Token.STRING, "hello");
    Node emptyStr = Node.newString(Token.STRING, "");

    assertTrue(NodeUtil.getBooleanValue(nonEmptyStr));
    assertFalse(NodeUtil.getBooleanValue(emptyStr));
  }

  @Test
  public void testGetBooleanValue_Number() {
    Node nonZeroNum = Node.newNumber(5.0);
    Node zeroNum = Node.newNumber(0.0);

    assertTrue(NodeUtil.getBooleanValue(nonZeroNum));
    assertFalse(NodeUtil.getBooleanValue(zeroNum));
  }

  @Test
  public void testGetBooleanValue_NullFalseVoid() {
    assertFalse(NodeUtil.getBooleanValue(new Node(Token.NULL)));
    assertFalse(NodeUtil.getBooleanValue(new Node(Token.FALSE)));
    assertFalse(NodeUtil.getBooleanValue(new Node(Token.VOID)));
  }

  @Test
  public void testGetBooleanValue_Name() {
    assertFalse(NodeUtil.getBooleanValue(Node.newString(Token.NAME, "undefined")));
    assertFalse(NodeUtil.getBooleanValue(Node.newString(Token.NAME, "NaN")));
    assertTrue(NodeUtil.getBooleanValue(Node.newString(Token.NAME, "Infinity")));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetBooleanValue_InvalidLiteral() {
    NodeUtil.getBooleanValue(Node.newString(Token.NAME, "someVar"));
  }

  @Test
  public void testGetBooleanValue_TrueAndLiterals() {
    assertTrue(NodeUtil.getBooleanValue(new Node(Token.TRUE)));
    assertTrue(NodeUtil.getBooleanValue(new Node(Token.ARRAYLIT)));
    assertTrue(NodeUtil.getBooleanValue(new Node(Token.OBJECTLIT)));
    assertTrue(NodeUtil.getBooleanValue(new Node(Token.REGEXP)));
  }

  @Test
  public void testGetStringValue() {
    assertEquals("test", NodeUtil.getStringValue(Node.newString(Token.STRING, "test")));
    assertEquals("1", NodeUtil.getStringValue(Node.newNumber(1.0)));
    assertEquals("1.5", NodeUtil.getStringValue(Node.newNumber(1.5)));
    assertEquals("false", NodeUtil.getStringValue(new Node(Token.FALSE)));
    assertEquals("true", NodeUtil.getStringValue(new Node(Token.TRUE)));
    assertEquals("null", NodeUtil.getStringValue(new Node(Token.NULL)));
    assertEquals("undefined", NodeUtil.getStringValue(new Node(Token.VOID)));
    assertNull(NodeUtil.getStringValue(new Node(Token.BLOCK)));
  }

  @Test
  public void testGetFunctionName() {
    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, "innerName"));
    
    // Parent is NAME
    Node parentName = Node.newString(Token.NAME, "varName");
    assertEquals("varName", NodeUtil.getFunctionName(fn, parentName));

    // Parent is ASSIGN
    Node assign = new Node(Token.ASSIGN, NodeUtil.newQualifiedNameNode("obj.prop", 0, 0), fn);
    assertEquals("obj.prop", NodeUtil.getFunctionName(fn, assign));

    // Parent is something else, with innerName
    Node parentBlock = new Node(Token.BLOCK);
    assertEquals("innerName", NodeUtil.getFunctionName(fn, parentBlock));

    // Parent is something else, without innerName
    Node fnNoName = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""));
    assertNull(NodeUtil.getFunctionName(fnNoName, parentBlock));
  }

  @Test
  public void testIsImmutableValue() {
    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.STRING, "a")));
    assertTrue(NodeUtil.isImmutableValue(Node.newNumber(1)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.VOID)));
    
    Node neg = new Node(Token.NEG, Node.newNumber(1));
    assertTrue(NodeUtil.isImmutableValue(neg));

    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "undefined")));
    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "Infinity")));
    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "NaN")));
    assertFalse(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "window")));
    assertFalse(NodeUtil.isImmutableValue(new Node(Token.BLOCK)));
  }

  @Test
  public void testIsLiteralValue() {
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1));
    assertTrue(NodeUtil.isLiteralValue(arrayLit));

    Node invalidArrayLit = new Node(Token.ARRAYLIT, Node.newString(Token.NAME, "x"));
    assertFalse(NodeUtil.isLiteralValue(invalidArrayLit));
  }

  @Test
  public void testIsValidDefineValue() {
    Set<String> defines = new HashSet<String>();
    defines.add("myDefine");

    assertTrue(NodeUtil.isValidDefineValue(Node.newNumber(1), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.NOT, Node.newNumber(1)), defines));
    assertTrue(NodeUtil.isValidDefineValue(NodeUtil.newQualifiedNameNode("myDefine", 0, 0), defines));
    assertFalse(NodeUtil.isValidDefineValue(NodeUtil.newQualifiedNameNode("otherDefine", 0, 0), defines));
    assertFalse(NodeUtil.isValidDefineValue(new Node(Token.BLOCK), defines));
  }

  @Test
  public void testIsEmptyBlock() {
    Node nonBlock = new Node(Token.EXPR_RESULT);
    assertFalse(NodeUtil.isEmptyBlock(nonBlock));

    Node emptyBlock = new Node(Token.BLOCK);
    assertTrue(NodeUtil.isEmptyBlock(emptyBlock));

    Node blockWithEmpty = new Node(Token.BLOCK, new Node(Token.EMPTY));
    assertTrue(NodeUtil.isEmptyBlock(blockWithEmpty));

    Node blockWithStmt = new Node(Token.BLOCK, Node.newNumber(1));
    assertFalse(NodeUtil.isEmptyBlock(blockWithStmt));
  }

  @Test
  public void testIsSimpleOperatorType() {
    assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
    assertTrue(NodeUtil.isSimpleOperatorType(Token.SUB));
    assertFalse(NodeUtil.isSimpleOperatorType(Token.FUNCTION));
  }

  @Test
  public void testMayHaveSideEffects() {
    assertFalse(NodeUtil.mayHaveSideEffects(Node.newNumber(1)));
    assertTrue(NodeUtil.mayHaveSideEffects(new Node(Token.THROW, Node.newString(Token.STRING, "err"))));
    assertTrue(NodeUtil.mayHaveSideEffects(new Node(Token.CALL)));
  }

  @Test
  public void testConstructorAndFunctionCallHasSideEffects() {
    Node call = new Node(Token.CALL, Node.newString(Token.NAME, "String"));
    assertFalse(NodeUtil.functionCallHasSideEffects(call));

    Node mathCall = new Node(Token.CALL, new Node(Token.GETPROP, Node.newString(Token.NAME, "Math"), Node.newString(Token.STRING, "floor")));
    assertFalse(NodeUtil.functionCallHasSideEffects(mathCall));

    Node unknownCall = new Node(Token.CALL, Node.newString(Token.NAME, "unknownFunc"));
    assertTrue(NodeUtil.functionCallHasSideEffects(unknownCall));

    Node ctor = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
    assertFalse(NodeUtil.constructorCallHasSideEffects(ctor));
  }

  @Test
  public void testGetConditionExpression() {
    Node ifNode = new Node(Token.IF, Node.newNumber(1), new Node(Token.BLOCK));
    assertEquals(ifNode.getFirstChild(), NodeUtil.getConditionExpression(ifNode));

    Node whileNode = new Node(Token.WHILE, Node.newNumber(1), new Node(Token.BLOCK));
    assertEquals(whileNode.getFirstChild(), NodeUtil.getConditionExpression(whileNode));

    Node doNode = new Node(Token.DO, new Node(Token.BLOCK), Node.newNumber(1));
    assertEquals(doNode.getLastChild(), NodeUtil.getConditionExpression(doNode));

    Node for3 = new Node(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY), new Node(Token.BLOCK));
    assertNull(NodeUtil.getConditionExpression(for3));

    Node for4 = new Node(Token.FOR, new Node(Token.EMPTY), Node.newNumber(1), new Node(Token.EMPTY), new Node(Token.BLOCK));
    assertEquals(for4.getFirstChild().getNext(), NodeUtil.getConditionExpression(for4));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_MalformedFor() {
    Node malformedFor = new Node(Token.FOR, new Node(Token.EMPTY));
    NodeUtil.getConditionExpression(malformedFor);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_Invalid() {
    NodeUtil.getConditionExpression(new Node(Token.EXPR_RESULT));
  }

  @Test
  public void testRemoveChild() {
    Node block = new Node(Token.BLOCK, Node.newNumber(1));
    Node child = block.getFirstChild();
    NodeUtil.removeChild(block, child);
    assertFalse(block.hasChildren());

    Node varParent = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
    Node varChild = varParent.getFirstChild();
    NodeUtil.removeChild(varParent, varChild);
    
    Node innerBlock = new Node(Token.BLOCK, Node.newNumber(1));
    NodeUtil.removeChild(innerBlock, innerBlock.getFirstChild());
    assertFalse(innerBlock.hasChildren());
  }

  @Test(expected = IllegalStateException.class)
  public void testRemoveChild_Invalid() {
    Node parent = new Node(Token.EXPR_RESULT, Node.newNumber(1));
    NodeUtil.removeChild(parent, parent.getFirstChild());
  }

  @Test
  public void testTryMergeBlock() {
    Node parent = new Node(Token.BLOCK, new Node(Token.BLOCK, Node.newNumber(1)));
    Node block = parent.getFirstChild();
    assertTrue(NodeUtil.tryMergeBlock(block));
  }

  @Test
  public void testPrecedenceAndOpToStr() {
    assertEquals(11, NodeUtil.precedence(Token.ADD));
    assertEquals("+", NodeUtil.opToStr(Token.ADD));
    assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
    assertTrue(NodeUtil.isAssociative(Token.MUL));
    assertFalse(NodeUtil.isAssociative(Token.ADD));
  }

  @Test
  public void testIsAssignmentOp() {
    assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN)));
    assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD)));
  }

  @Test
  public void testGetOpFromAssignmentOp() {
    assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_ADD)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetOpFromAssignmentOp_Invalid() {
    NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN));
  }

  @Test
  public void testMiscChecks() {
    assertTrue(NodeUtil.isExpressionNode(new Node(Token.EXPR_RESULT)));
    assertTrue(NodeUtil.isGet(new Node(Token.GETPROP)));
    assertTrue(NodeUtil.isGetProp(new Node(Token.GETPROP)));
    assertTrue(NodeUtil.isName(new Node(Token.NAME)));
    assertTrue(NodeUtil.isNew(new Node(Token.NEW)));
    assertTrue(NodeUtil.isVar(new Node(Token.VAR)));
    assertTrue(NodeUtil.isString(Node.newString(Token.STRING, "s")));
    assertTrue(NodeUtil.isAssign(new Node(Token.ASSIGN)));
    assertTrue(NodeUtil.isForIn(new Node(Token.FOR, new Node(Token.NAME, "a"), new Node(Token.IN), new Node(Token.BLOCK))));
    assertTrue(NodeUtil.isLoopStructure(new Node(Token.FOR)));
    assertTrue(NodeUtil.isControlStructure(new Node(Token.IF)));
    assertTrue(NodeUtil.isSwitchCase(new Node(Token.CASE)));
    assertTrue(NodeUtil.isCall(new Node(Token.CALL)));
    assertTrue(NodeUtil.isFunction(new Node(Token.FUNCTION)));
    assertTrue(NodeUtil.isThis(new Node(Token.THIS)));
  }

  @Test
  public void testLatinAndPropertyName() {
    assertTrue(NodeUtil.isLatin("hello"));
    assertFalse(NodeUtil.isLatin("héllo"));
    assertTrue(NodeUtil.isValidPropertyName("validName"));
    assertFalse(NodeUtil.isValidPropertyName("if")); // keyword
  }
}