package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class NodeUtilTest {

  @Test
  public void testGetBooleanValue_PrimitivesAndLiterals() {
    // STRING: empty vs non-empty
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newString("")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(Node.newString("hello")));

    // NUMBER: zero vs non-zero
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newNumber(0.0)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(Node.newNumber(5.5)));

    // NULL, FALSE, VOID -> FALSE
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(new Node(Token.NULL)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(new Node(Token.FALSE)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(new Node(Token.VOID)));

    // TRUE, ARRAYLIT, OBJECTLIT, REGEXP -> TRUE
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.TRUE)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.ARRAYLIT)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.OBJECTLIT)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.REGEXP)));
  }

  @Test
  public void testGetBooleanValue_NamesAndNot() {
    // NAME special values
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "undefined")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "NaN")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "Infinity")));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "unknownVar")));

    // NOT of number 0 -> true
    Node notNode = new Node(Token.NOT, Node.newNumber(0.0));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(notNode));
  }

  @Test
  public void testGetExpressionBooleanValue_ComplexExpressions() {
    // ASSIGN & COMMA (evaluates last child)
    Node assignNode = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newString("text"));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(assignNode));

    Node commaNode = new Node(Token.COMMA, Node.newNumber(0.0), Node.newString(""));
    assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(commaNode));

    // NOT
    Node notNode = new Node(Token.NOT, Node.newString("abc"));
    assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(notNode));

    // AND & OR
    Node andNode = new Node(Token.AND, Node.newString("a"), Node.newString("b"));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(andNode));

    Node orNode = new Node(Token.OR, Node.newString(""), Node.newString("b"));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(orNode));

    // HOOK (condition ? trueVal : falseVal)
    Node hookSame = new Node(Token.HOOK, Node.newString("cond"), Node.newString("T"), Node.newString("T"));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(hookSame));

    Node hookDiff = new Node(Token.HOOK, Node.newString("cond"), Node.newString("T"), Node.newString(""));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getExpressionBooleanValue(hookDiff));
  }

  @Test
  public void testGetStringValue() {
    assertEquals("test", NodeUtil.getStringValue(Node.newString("test")));
    assertEquals("undefined", NodeUtil.getStringValue(Node.newString(Token.NAME, "undefined")));
    assertEquals("Infinity", NodeUtil.getStringValue(Node.newString(Token.NAME, "Infinity")));
    assertEquals("NaN", NodeUtil.getStringValue(Node.newString(Token.NAME, "NaN")));
    assertNull(NodeUtil.getStringValue(Node.newString(Token.NAME, "other")));

    // Number integer vs double
    assertEquals("1", NodeUtil.getStringValue(Node.newNumber(1.0)));
    assertEquals("1.5", NodeUtil.getStringValue(Node.newNumber(1.5)));

    assertEquals("false", NodeUtil.getStringValue(new Node(Token.FALSE)));
    assertEquals("true", NodeUtil.getStringValue(new Node(Token.TRUE)));
    assertEquals("null", NodeUtil.getStringValue(new Node(Token.NULL)));
    assertEquals("undefined", NodeUtil.getStringValue(new Node(Token.VOID)));

    // NOT
    Node notNum = new Node(Token.NOT, Node.newNumber(5.0));
    assertEquals("false", NodeUtil.getStringValue(notNum));

    // Array & Object lit
    Node arrLit = new Node(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"));
    assertEquals("a,b", NodeUtil.getStringValue(arrLit));

    Node objLit = new Node(Token.OBJECTLIT);
    assertEquals("[object Object]", NodeUtil.getStringValue(objLit));
  }

  @Test
  public void testArrayToString_EdgeCases() {
    Node literal = new Node(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"));
    literal.putProp(Node.SKIP_INDEXES_PROP, new int[]{1});
    // Skip index at slot 1 should insert comma
    assertEquals("a,,b", NodeUtil.arrayToString(literal));

    // Child value returns null -> arrayToString returns null
    Node badLiteral = new Node(Token.ARRAYLIT, new Node(Token.FUNCTION));
    assertNull(NodeUtil.arrayToString(badLiteral));
  }

  @Test
  public void testGetNumberValue() {
    assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(new Node(Token.TRUE)));
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(new Node(Token.FALSE)));
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(new Node(Token.NULL)));
    assertEquals(Double.valueOf(10.5), NodeUtil.getNumberValue(Node.newNumber(10.5)));

    // VOID
    Node voidNode = new Node(Token.VOID, Node.newNumber(0));
    assertEquals(Double.NaN, NodeUtil.getNumberValue(voidNode));

    // NAME constants
    assertEquals(Double.NaN, NodeUtil.getNumberValue(Node.newString(Token.NAME, "undefined")));
    assertEquals(Double.NaN, NodeUtil.getNumberValue(Node.newString(Token.NAME, "NaN")));
    assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(Node.newString(Token.NAME, "Infinity")));
    assertNull(NodeUtil.getNumberValue(Node.newString(Token.NAME, "unknown")));

    // NEG Infinity
    Node negInf = new Node(Token.NEG, Node.newString(Token.NAME, "Infinity"));
    assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(negInf));
    assertNull(NodeUtil.getNumberValue(new Node(Token.NEG, Node.newNumber(1))));

    // STRING number conversion
    assertEquals(Double.valueOf(123.0), NodeUtil.getNumberValue(Node.newString("123")));
  }

  @Test
  public void testGetStringNumberValue() {
    assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue("   "));
    assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0xFF"));
    assertEquals(Double.NaN, NodeUtil.getStringNumberValue("0xZZ"));
    assertNull(NodeUtil.getStringNumberValue("-0xFF"));
    assertNull(NodeUtil.getStringNumberValue("infinity"));
    assertEquals(Double.NaN, NodeUtil.getStringNumberValue("invalid_number"));
  }

  @Test
  public void testIsStrWhiteSpaceChar() {
    assertTrue(NodeUtil.isStrWhiteSpaceChar(' '));
    assertTrue(NodeUtil.isStrWhiteSpaceChar('\n'));
    assertTrue(NodeUtil.isStrWhiteSpaceChar('\r'));
    assertTrue(NodeUtil.isStrWhiteSpaceChar('\t'));
    assertTrue(NodeUtil.isStrWhiteSpaceChar('\u00A0'));
    assertFalse(NodeUtil.isStrWhiteSpaceChar('a'));
  }

  @Test
  public void testGetFunctionNameAndNearest() {
    Node funcNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, "myFunc"), new Node(Token.LP), new Node(Token.BLOCK));
    Node nameParent = new Node(Token.NAME, funcNode);
    nameParent.setString("varName");
    
    assertEquals("varName", NodeUtil.getFunctionName(funcNode));
    assertEquals("varName", NodeUtil.getNearestFunctionName(funcNode));

    Node assignParent = new Node(Token.ASSIGN, Node.newString(Token.NAME, "obj.prop"), funcNode);
    assertEquals("obj.prop", NodeUtil.getFunctionName(funcNode));

    Node stringKeyParent = new Node(Token.STRING, funcNode);
    stringKeyParent.setString("keyName");
    assertEquals("keyName", NodeUtil.getNearestFunctionName(funcNode));
  }

  @Test
  public void testIsImmutableValue() {
    assertTrue(NodeUtil.isImmutableValue(Node.newString("test")));
    assertTrue(NodeUtil.isImmutableValue(Node.newNumber(1)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));
    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "undefined")));
    assertFalse(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "notConst")));
  }

  @Test
  public void testIsValidDefineValue() {
    Set<String> defines = new HashSet<>(Arrays.asList("MY_DEF"));
    assertTrue(NodeUtil.isValidDefineValue(Node.newString("str"), defines));
    assertTrue(NodeUtil.isValidDefineValue(Node.newNumber(10), defines));
    
    Node qName = Node.newString(Token.NAME, "MY_DEF");
    assertTrue(NodeUtil.isValidDefineValue(qName, defines));

    Node invalidQName = Node.newString(Token.NAME, "OTHER_DEF");
    assertFalse(NodeUtil.isValidDefineValue(invalidQName, defines));
  }

  @Test
  public void testIsEmptyBlock() {
    Node block = new Node(Token.BLOCK, new Node(Token.EMPTY));
    assertTrue(NodeUtil.isEmptyBlock(block));

    Node nonEmptyBlock = new Node(Token.BLOCK, Node.newNumber(1));
    assertFalse(NodeUtil.isEmptyBlock(nonEmptyBlock));

    assertFalse(NodeUtil.isEmptyBlock(new Node(Token.EXPR_RESULT)));
  }

  @Test
  public void testConstructorCallHasSideEffects() {
    Node newWithoutSideEffects = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
    assertFalse(NodeUtil.constructorCallHasSideEffects(newWithoutSideEffects));

    Node newWithSideEffects = new Node(Token.NEW, Node.newString(Token.NAME, "CustomCtor"));
    assertTrue(NodeUtil.constructorCallHasSideEffects(newWithSideEffects));
  }

  @Test(expected = IllegalStateException.class)
  public void testConstructorCallHasSideEffects_Exception() {
    Node notNew = new Node(Token.CALL);
    NodeUtil.constructorCallHasSideEffects(notNew);
  }

  @Test
  public void testFunctionCallHasSideEffects() {
    Node builtinCall = new Node(Token.CALL, Node.newString(Token.NAME, "Object"));
    assertFalse(NodeUtil.functionCallHasSideEffects(builtinCall));

    Node mathCall = new Node(Token.CALL, new Node(Token.GETPROP, Node.newString(Token.NAME, "Math"), Node.newString(Token.STRING, "floor")));
    assertFalse(NodeUtil.functionCallHasSideEffects(mathCall));
  }

  @Test(expected = IllegalStateException.class)
  public void testFunctionCallHasSideEffects_Exception() {
    Node notCall = new Node(Token.NEW);
    NodeUtil.functionCallHasSideEffects(notCall);
  }

  @Test
  public void testRemoveChild_EdgeCases() {
    // Remove BLOCK children
    Node block = new Node(Token.BLOCK, Node.newNumber(1));
    NodeUtil.removeChild(block.getParent(), block);
    assertTrue(block.getFirstChild() == null);
  }

  @Test
  public void testTryMergeBlock() {
    Node parentBlock = new Node(Token.BLOCK);
    Node childBlock = new Node(Token.BLOCK, Node.newNumber(42));
    parentBlock.addChildToBack(childBlock);

    assertTrue(NodeUtil.tryMergeBlock(childBlock));
    assertNotNull(parentBlock.getFirstChild());
  }

  @Test
  public void testEvaluatesToLocalValue() {
    assertTrue(NodeUtil.evaluatesToLocalValue(Node.newNumber(10)));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.ARRAYLIT)));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.OBJECTLIT)));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.REGEXP)));
  }
}