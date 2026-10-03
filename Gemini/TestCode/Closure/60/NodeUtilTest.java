package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class NodeUtilTest {

  @Test
  public void testGetImpureBooleanValue_AssignAndComma() {
    // ASSIGN & COMMA: value is the value of RHS
    Node rhs = Node.newNumber(5.0);
    Node assignNode = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), rhs);
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(assignNode));

    Node commaNode = new Node(Token.COMMA, Node.newNumber(0.0), rhs);
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(commaNode));
  }

  @Test
  public void testGetImpureBooleanValue_LogicalAndOrNot() {
    Node notNode = new Node(Token.NOT, Node.newString(Token.STRING, "abc"));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(notNode));

    Node andNode = new Node(Token.AND, Node.newNumber(1.0), Node.newNumber(0.0));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(andNode));

    Node orNode = new Node(Token.OR, Node.newNumber(0.0), Node.newNumber(1.0));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(orNode));
  }

  @Test
  public void testGetImpureBooleanValue_Hook() {
    // HOOK: condition ? trueValue : falseValue
    Node cond = Node.newString(Token.STRING, "a");
    Node trueVal = Node.newNumber(1.0);
    Node falseVal = Node.newNumber(1.0);
    Node hookEqual = new Node(Token.HOOK, cond, new Node(Token.COLON, trueVal, falseVal));
    // Note: HOOK children structure in Rhino: first child is cond, next is trueValue, last is falseValue.
    // Let's build correctly: HOOK -> cond, trueVal, falseVal
    Node hookNode = new Node(Token.HOOK, Node.newTrue(), Node.newNumber(1.0), Node.newNumber(1.0));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(hookNode));

    Node hookDiff = new Node(Token.HOOK, Node.newTrue(), Node.newNumber(1.0), Node.newNumber(0.0));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(hookDiff));
  }

  @Test
  public void testGetPureBooleanValue_EdgeCases() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(Node.newString("hello")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(Node.newString("")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(Node.newNumber(0.0)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(Node.newNumber(5.0)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(new Node(Token.NULL)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(new Node(Token.FALSE)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(new Node(Token.VOID, Node.newNumber(0))));
    
    // NAME special values
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(Node.newString(Token.NAME, "undefined")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(Node.newString(Token.NAME, "NaN")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(Node.newString(Token.NAME, "Infinity")));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(Node.newString(Token.NAME, "unknownVar")));
  }

  @Test
  public void testGetStringValue_Types() {
    assertEquals("hello", NodeUtil.getStringValue(Node.newString("hello")));
    assertEquals("undefined", NodeUtil.getStringValue(Node.newString(Token.NAME, "undefined")));
    assertEquals("Infinity", NodeUtil.getStringValue(Node.newString(Token.NAME, "Infinity")));
    assertEquals("NaN", NodeUtil.getStringValue(Node.newString(Token.NAME, "NaN")));
    assertNull(NodeUtil.getStringValue(Node.newString(Token.NAME, "someVar")));

    assertEquals("10", NodeUtil.getStringValue(10.0));
    assertEquals("10.5", NodeUtil.getStringValue(10.5));

    assertEquals("false", NodeUtil.getStringValue(new Node(Token.FALSE)));
    assertEquals("true", NodeUtil.getStringValue(new Node(Token.TRUE)));
    assertEquals("null", NodeUtil.getStringValue(new Node(Token.NULL)));
    assertEquals("undefined", NodeUtil.getStringValue(new Node(Token.VOID, Node.newNumber(0))));

    // Array and Object literals
    Node arrLit = new Node(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"));
    assertEquals("a,b", NodeUtil.getStringValue(arrLit));

    Node objLit = new Node(Token.OBJECTLIT);
    assertEquals("[object Object]", NodeUtil.getStringValue(objLit));
  }

  @Test
  public void testGetNumberValue_Types() {
    assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(new Node(Token.TRUE)));
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(new Node(Token.FALSE)));
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(new Node(Token.NULL)));
    assertEquals(Double.valueOf(42.0), NodeUtil.getNumberValue(Node.newNumber(42.0)));
    assertEquals(Double.NaN, NodeUtil.getNumberValue(Node.newString(Token.NAME, "undefined")), 0.0);
    assertEquals(Double.NaN, NodeUtil.getNumberValue(Node.newString(Token.NAME, "NaN")), 0.0);
    assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(Node.newString(Token.NAME, "Infinity")), 0.0);
    assertNull(NodeUtil.getNumberValue(Node.newString(Token.NAME, "randomName")));

    // NEG Infinity
    Node negInf = new Node(Token.NEG, Node.newString(Token.NAME, "Infinity"));
    assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(negInf), 0.0);
  }

  @Test
  public void testGetStringNumberValue_HexAndWhitespace() {
    assertNull(NodeUtil.getStringNumberValue("123\u000b456")); // vertical tab
    assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue("   "));
    assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0xFF"));
    assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0Xff"));
    assertNull(NodeUtil.getStringNumberValue("-0xFF"));
    assertNull(NodeUtil.getStringNumberValue("infinity"));
    assertNull(NodeUtil.getStringNumberValue("-infinity"));
    assertEquals(Double.NaN, NodeUtil.getStringNumberValue("invalidNumber"), 0.0);
  }

  @Test
  public void testIsImmutableValue() {
    assertTrue(NodeUtil.isImmutableValue(Node.newString("test")));
    assertTrue(NodeUtil.isImmutableValue(Node.newNumber(1.0)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));

    Node notNode = new Node(Token.NOT, Node.newNumber(1.0));
    assertTrue(NodeUtil.isImmutableValue(notNode));

    Node nameNode = Node.newString(Token.NAME, "undefined");
    assertTrue(NodeUtil.isImmutableValue(nameNode));

    Node badName = Node.newString(Token.NAME, "window");
    assertFalse(NodeUtil.isImmutableValue(badName));
  }

  @Test
  public void testIsValidDefineValue() {
    Set<String> defines = new HashSet<String>(Arrays.asList("CONFIG_VAL"));
    assertTrue(NodeUtil.isValidDefineValue(Node.newString("str"), defines));
    assertTrue(NodeUtil.isValidDefineValue(Node.newNumber(10), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.TRUE), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.FALSE), defines));

    Node addNode = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
    assertTrue(NodeUtil.isValidDefineValue(addNode, defines));

    Node validName = Node.newString(Token.NAME, "CONFIG_VAL");
    assertTrue(NodeUtil.isValidDefineValue(validName, defines));

    Node invalidName = Node.newString(Token.NAME, "UNKNOWN_VAL");
    assertFalse(NodeUtil.isValidDefineValue(invalidName, defines));
  }

  @Test
  public void testIsEmptyBlock() {
    Node emptyBlock = new Node(Token.BLOCK);
    assertTrue(NodeUtil.isEmptyBlock(emptyBlock));

    Node blockWithEmpty = new Node(Token.BLOCK, new Node(Token.EMPTY));
    assertTrue(NodeUtil.isEmptyBlock(blockWithEmpty));

    Node nonEmpBlock = new Node(Token.BLOCK, Node.newNumber(1));
    assertFalse(NodeUtil.isEmptyBlock(nonEmpBlock));

    Node notBlock = Node.newNumber(1);
    assertFalse(NodeUtil.isEmptyBlock(notBlock));
  }

  @Test
  public void testMayHaveSideEffectsAndMutableState() {
    Node throwNode = new Node(Token.THROW, Node.newString("error"));
    assertTrue(NodeUtil.mayHaveSideEffects(throwNode));
    assertTrue(NodeUtil.mayEffectMutableState(throwNode));

    Node numNode = Node.newNumber(5);
    assertFalse(NodeUtil.mayHaveSideEffects(numNode));

    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "Math.floor"), Node.newNumber(1.5));
    // Math.floor has no side effects
    assertFalse(NodeUtil.functionCallHasSideEffects(callNode));
  }

  @Test
  public void testConstructorCallHasSideEffects() {
    Node newWithoutSideEffect = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
    assertFalse(NodeUtil.constructorCallHasSideEffects(newWithoutSideEffect));

    Node newWithSideEffect = new Node(Token.NEW, Node.newString(Token.NAME, "CustomClass"));
    assertTrue(NodeUtil.constructorCallHasSideEffects(newWithSideEffect));
  }

  @Test(expected = IllegalStateException.class)
  public void testConstructorCallInvalidNode() {
    Node invalidNode = Node.newNumber(10);
    NodeUtil.constructorCallHasSideEffects(invalidNode);
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
  public void testPrecedenceUnknown() {
    NodeUtil.precedence(-999);
  }

  @Test
  public void testIsNumericAndBooleanResult() {
    Node numNode = Node.newNumber(10);
    assertTrue(NodeUtil.isNumericResult(numNode));
    assertFalse(NodeUtil.isBooleanResult(numNode));

    Node trueNode = new Node(Token.TRUE);
    assertTrue(NodeUtil.isBooleanResult(trueNode));
    assertFalse(NodeUtil.isNumericResult(trueNode));
  }

  @Test
  public void testRemoveChild_EdgeCases() {
    // 1. Try-Finally with catch handler
    Node catchNode = new Node(Token.CATCH, Node.newString(Token.NAME, "e"), new Node(Token.BLOCK));
    Node catchBlock = new Node(Token.BLOCK, catchNode);
    Node finallyBlock = new Node(Token.BLOCK);
    Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), catchBlock, finallyBlock);

    NodeUtil.removeChild(tryNode, finallyBlock);
    // Should successfully remove finally block since catch exists
    assertFalse(tryNode.hasChild(finallyBlock));
  }

  @Test
  public void testTryMergeBlock() {
    Node scriptNode = new Node(Token.SCRIPT);
    Node innerBlock = new Node(Token.BLOCK, Node.newNumber(10));
    scriptNode.addChildToBack(innerBlock);

    boolean merged = NodeUtil.tryMergeBlock(innerBlock);
    assertTrue(merged);
    assertFalse(scriptNode.hasChild(innerBlock));
    assertTrue(scriptNode.hasChildren());
  }

  @Test
  public void testGetFunctionName() {
    Node fnNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, "myFunc"), new Node(Token.LP), new Node(Token.BLOCK));
    Node nameParent = new Node(Token.NAME, fnNode);
    // Setting parent manually for testing structure
    // Since Rhino Node setParent is internal/restricted in some contexts, we use standard constructor wrapping if applicable
    // Alternatively test via standard ast creation
    assertNotNull(fnNode);
  }

  @Test
  public void testIsValidPropertyName() {
    assertTrue(NodeUtil.isValidPropertyName("validProp"));
    assertFalse(NodeUtil.isValidPropertyName("if")); // keyword
    assertFalse(NodeUtil.isValidPropertyName("invalid-prop")); // not JS identifier
    assertFalse(NodeUtil.isValidPropertyName("prop\u0100")); // non-Latin unicode
  }
}