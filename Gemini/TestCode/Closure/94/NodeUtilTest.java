package com.google.javascript.jscomp;

import com.google.common.base.Predicates;
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

  @Test
  public void testGetExpressionBooleanValue() {
    // ASSIGN & COMMA -> last child
    Node assignNode = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(1));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(assignNode));

    Node commaNode = new Node(Token.COMMA, Node.newNumber(0), Node.newString("abc"));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(commaNode));

    // NOT -> value.not()
    Node notNode = new Node(Token.NOT, Node.newNumber(0));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(notNode));

    // AND & OR
    Node andNode = new Node(Token.AND, Node.newNumber(1), Node.newNumber(0));
    assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(andNode));

    Node orNode = new Node(Token.OR, Node.newNumber(0), Node.newNumber(5));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(orNode));

    // HOOK (ternary ? :)
    // trueValue == falseValue
    Node hookEqual = new Node(Token.HOOK, Node.newTrue(), Node.newNumber(1), Node.newNumber(2));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(hookEqual));

    // trueValue != falseValue -> UNKNOWN
    Node hookDiff = new Node(Token.HOOK, Node.newTrue(), Node.newNumber(1), Node.newNumber(0));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getExpressionBooleanValue(hookDiff));

    // Default fallback to getBooleanValue
    Node defaultNode = Node.newString("hello");
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(defaultNode));
  }

  @Test
  public void testGetBooleanValueEdges() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(Node.newString("non-empty")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newString("")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(Node.newNumber(42)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newNumber(0)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(new Node(Token.NULL)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(new Node(Token.FALSE)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(new Node(Token.VOID)));
    
    // NAME tokens: undefined, NaN, Infinity, unknown
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "undefined")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "NaN")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "Infinity")));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "customVar")));

    // TRUE, ARRAYLIT, OBJECTLIT, REGEXP
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.TRUE)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.ARRAYLIT)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.OBJECTLIT)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.REGEXP)));
  }

  @Test
  public void testGetStringValue() {
    assertEquals("testName", NodeUtil.getStringValue(Node.newString(Token.NAME, "testName")));
    assertEquals("testStr", NodeUtil.getStringValue(Node.newString(Token.STRING, "testStr")));
    
    // Number conversions (longValue == value vs double)
    assertEquals("1", NodeUtil.getStringValue(Node.newNumber(1.0)));
    assertEquals("1.5", NodeUtil.getStringValue(Node.newNumber(1.5)));

    assertEquals("false", NodeUtil.getStringValue(new Node(Token.FALSE)));
    assertEquals("true", NodeUtil.getStringValue(new Node(Token.TRUE)));
    assertEquals("null", NodeUtil.getStringValue(new Node(Token.NULL)));
    assertEquals("undefined", NodeUtil.getStringValue(new Node(Token.VOID)));
    
    // Unsupported type returns null
    assertNull(NodeUtil.getStringValue(new Node(Token.BLOCK)));
  }

  @Test
  public void testGetFunctionNameAndNearest() {
    // function name()
    Node fnNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, "myFunc"), new Node(Token.LP), new Node(Token.BLOCK));
    Node varParent = new Node(Token.VAR, fnNode);
    assertEquals("myFunc", NodeUtil.getFunctionName(fnNode));

    // var name2 = function name1()
    Node assignParent = new Node(Token.ASSIGN, Node.newString(Token.NAME, "varName"), fnNode);
    assertEquals("varName", NodeUtil.getFunctionName(fnNode));

    // Nearest function name with object literal key
    Node objLit = new Node(Token.OBJECTLIT, Node.newString(Token.STRING, "keyName"), fnNode);
    assertEquals("keyName", NodeUtil.getNearestFunctionName(fnNode));
  }

  @Test
  public void testIsImmutableAndLiteralValue() {
    Node strNode = Node.newString("abc");
    assertTrue(NodeUtil.isImmutableValue(strNode));
    assertTrue(NodeUtil.isLiteralValue(strNode, false));

    Node voidNode = new Node(Token.VOID, Node.newNumber(0));
    assertTrue(NodeUtil.isImmutableValue(voidNode));

    Node infNode = Node.newString(Token.NAME, "Infinity");
    assertTrue(NodeUtil.isImmutableValue(infNode));

    // Array/Object literals as literals
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1));
    assertTrue(NodeUtil.isLiteralValue(arrayLit, false));

    Node funcNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    assertFalse(NodeUtil.isLiteralValue(funcNode, false));
    assertTrue(NodeUtil.isLiteralValue(funcNode, true));
  }

  @Test
  public void testIsValidDefineValue() {
    Set<String> defines = new HashSet<String>();
    defines.add("DEBUG_MODE");

    assertTrue(NodeUtil.isValidDefineValue(Node.newString("val"), defines));
    assertTrue(NodeUtil.isValidDefineValue(Node.newNumber(10), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.TRUE), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.FALSE), defines));

    // Unary/Binary ops validation check
    Node notVal = new Node(Token.NOT, new Node(Token.TRUE));
    assertTrue(NodeUtil.isValidDefineValue(notVal, defines));

    // Qualified name / Name defines
    Node defName = Node.newString(Token.NAME, "DEBUG_MODE");
    assertTrue(NodeUtil.isValidDefineValue(defName, defines));

    Node invalidName = Node.newString(Token.NAME, "OTHER_VAR");
    assertFalse(NodeUtil.isValidDefineValue(invalidName, defines));
  }

  @Test
  public void testIsEmptyBlock() {
    Node nonBlock = Node.newNumber(1);
    assertFalse(NodeUtil.isEmptyBlock(nonBlock));

    Node emptyBlock = new Node(Token.BLOCK);
    assertTrue(NodeUtil.isEmptyBlock(emptyBlock));

    Node blockWithEmpty = new Node(Token.BLOCK, new Node(Token.EMPTY));
    assertTrue(NodeUtil.isEmptyBlock(blockWithEmpty));

    Node blockWithStmt = new Node(Token.BLOCK, Node.newNumber(1));
    assertFalse(NodeUtil.isEmptyBlock(blockWithStmt));
  }

  @Test
  public void testSimpleOperatorType() {
    assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
    assertTrue(NodeUtil.isSimpleOperatorType(Token.SUB));
    assertFalse(NodeUtil.isSimpleOperatorType(Token.THROW));
  }

  @Test
  public void testMayHaveSideEffectsAndStateChange() {
    Node throwNode = new Node(Token.THROW, Node.newString("err"));
    assertTrue(NodeUtil.mayHaveSideEffects(throwNode));

    Node safeNum = Node.newNumber(123);
    assertFalse(NodeUtil.mayHaveSideEffects(safeNum));

    Node newObj = new Node(Token.NEW, Node.newString(Token.NAME, "Object"));
    assertTrue(NodeUtil.mayHaveSideEffects(newObj));

    Node safeConstructor = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
    assertFalse(NodeUtil.constructorCallHasSideEffects(safeConstructor));
  }

  @Test
  public void testFunctionCallSideEffects() {
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "Object"));
    assertFalse(NodeUtil.functionCallHasSideEffects(callNode));

    Node mathCall = new Node(Token.CALL, new Node(Token.GETPROP, Node.newString(Token.NAME, "Math"), Node.newString(Token.STRING, "floor")));
    assertFalse(NodeUtil.functionCallHasSideEffects(mathCall));
  }

  @Test
  public void testPrecedenceAndOpToStr() {
    assertEquals("+", NodeUtil.opToStr(Token.ADD));
    assertEquals("&&", NodeUtil.opToStr(Token.AND));
    assertNull(NodeUtil.opToStr(Token.BLOCK));

    assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
    
    assertTrue(NodeUtil.isAssociative(Token.MUL));
    assertFalse(NodeUtil.isAssociative(Token.ADD));
  }

  @Test(expected = Error.class)
  public void testOpToStrNoFailError() {
    NodeUtil.opToStrNoFail(Token.BLOCK);
  }

  @Test
  public void testRemoveChildEdges() {
    // Statement block removal
    Node parentBlock = new Node(Token.BLOCK, Node.newNumber(1));
    Node childNode = parentBlock.getFirstChild();
    NodeUtil.removeChild(parentBlock, childNode);
    assertEquals(0, parentBlock.getChildCount());

    // VAR with single child cascading removal
    Node nameNode = Node.newString(Token.NAME, "a");
    Node varNode = new Node(Token.VAR, nameNode);
    Node scriptParent = new Node(Token.SCRIPT, varNode);
    NodeUtil.removeChild(varNode, nameNode);
    // Should trigger cascading removal of empty VAR
    assertEquals(0, scriptParent.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testRemoveChildIllegalState() {
    Node parent = Node.newNumber(1);
    Node child = Node.newNumber(2);
    NodeUtil.removeChild(parent, child);
  }

  @Test
  public void testEvaluatesToLocalValue() {
    assertTrue(NodeUtil.evaluatesToLocalValue(Node.newNumber(10)));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.NEW, Node.newString(Token.NAME, "Object"))));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.ARRAYLIT)));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.OBJECTLIT)));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.REGEXP)));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.IN, Node.newString("a"), Node.newObjectLit())));
  }

  @Test(expected = IllegalStateException.class)
  public void testEvaluatesToLocalValueUnexpected() {
    // Passing an unexpected node type that triggers the IllegalStateException in default branch
    Node unexpected = new Node(Token.SCRIPT);
    NodeUtil.evaluatesToLocalValue(unexpected, Predicates.<Node>alwaysFalse());
  }

  @Test
  public void testHelpersAndPredicates() {
    assertTrue(NodeUtil.isLatin("abc123XYZ"));
    assertFalse(NodeUtil.isLatin("abc\u0100")); // non-latin char

    assertTrue(NodeUtil.isValidPropertyName("validProp"));
    assertFalse(NodeUtil.isValidPropertyName("if")); // keyword

    Node qNode = NodeUtil.newQualifiedNameNode("foo.bar.baz", 1, 1);
    assertNotNull(qNode);
    assertEquals("foo", NodeUtil.getRootOfQualifiedName(qNode).getString());
  }
}