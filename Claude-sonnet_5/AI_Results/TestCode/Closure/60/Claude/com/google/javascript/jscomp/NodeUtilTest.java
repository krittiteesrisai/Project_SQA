package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Predicates;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Unit tests for {@link NodeUtil} (Closure-60b).
 *
 * หมายเหตุ: การสร้าง Node ในเทสอ้างอิงเฉพาะรูปแบบ constructor/method ที่ปรากฏใช้จริง
 * ภายใน NodeUtil.java เท่านั้น (Node(type), Node(type,child), Node.newString, Node.newNumber,
 * addChildToBack) เพื่อไม่เดา behavior ที่ไม่มีหลักฐานในซอร์สที่ให้มา
 */
public class NodeUtilTest {

  // ---------- Helpers ----------
  private static Node numberNode(double d) {
    return Node.newNumber(d);
  }

  private static Node stringNode(String s) {
    return Node.newString(Token.STRING, s);
  }

  private static Node nameNode(String s) {
    return Node.newString(Token.NAME, s);
  }

  /** ASSUMPTION: GETPROP chain's getQualifiedName() concatenates NAME/GETPROP+STRING with '.' */
  private static Node buildGetProp(Node base, String prop) {
    Node propNode = stringNode(prop);
    Node getProp = new Node(Token.GETPROP, base);
    getProp.addChildToBack(propNode);
    return getProp;
  }

  // ================= getPureBooleanValue =================

  @Test
  public void testGetPureBooleanValue_String() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(stringNode("")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(stringNode("a")));
  }

  @Test
  public void testGetPureBooleanValue_Number() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(numberNode(0)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(numberNode(1)));
  }

  @Test
  public void testGetPureBooleanValue_Not() {
    Node not = new Node(Token.NOT, numberNode(0));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(not));
  }

  @Test
  public void testGetPureBooleanValue_NullFalseVoid() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(new Node(Token.NULL)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(new Node(Token.FALSE)));
    assertEquals(TernaryValue.FALSE,
        NodeUtil.getPureBooleanValue(new Node(Token.VOID, numberNode(0))));
  }

  @Test
  public void testGetPureBooleanValue_Name() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(nameNode("undefined")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(nameNode("NaN")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(nameNode("Infinity")));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(nameNode("x")));
  }

  @Test
  public void testGetPureBooleanValue_TrueRegexp() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(new Node(Token.TRUE)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(new Node(Token.REGEXP)));
  }

  @Test
  public void testGetPureBooleanValue_ArrayObjectLit() {
    Node arr = new Node(Token.ARRAYLIT);
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(arr));

    Node obj = new Node(Token.OBJECTLIT);
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(obj));

    Node call = new Node(Token.CALL, nameNode("foo"));
    Node arrWithCall = new Node(Token.ARRAYLIT, call);
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(arrWithCall));
  }

  @Test
  public void testGetPureBooleanValue_Default() {
    Node add = new Node(Token.ADD, numberNode(1));
    add.addChildToBack(numberNode(2));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(add));
  }

  // ================= getImpureBooleanValue =================

  @Test
  public void testGetImpureBooleanValue_AssignComma() {
    Node assign = new Node(Token.ASSIGN, nameNode("x"));
    assign.addChildToBack(numberNode(5));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(assign));

    Node comma = new Node(Token.COMMA, numberNode(1));
    comma.addChildToBack(numberNode(0));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(comma));
  }

  @Test
  public void testGetImpureBooleanValue_Not() {
    Node not = new Node(Token.NOT, numberNode(0));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(not));
  }

  @Test
  public void testGetImpureBooleanValue_AndOr() {
    Node and = new Node(Token.AND, new Node(Token.TRUE));
    and.addChildToBack(new Node(Token.FALSE));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(and));

    Node or = new Node(Token.OR, new Node(Token.FALSE));
    or.addChildToBack(new Node(Token.TRUE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(or));
  }

  @Test
  public void testGetImpureBooleanValue_Hook() {
    Node cond = new Node(Token.HOOK, new Node(Token.TRUE));
    cond.addChildToBack(new Node(Token.TRUE));
    cond.addChildToBack(new Node(Token.TRUE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(cond));

    Node cond2 = new Node(Token.HOOK, new Node(Token.TRUE));
    cond2.addChildToBack(new Node(Token.TRUE));
    cond2.addChildToBack(new Node(Token.FALSE));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(cond2));
  }

  @Test
  public void testGetImpureBooleanValue_ArrayObjectLitIgnoresSideEffect() {
    Node call = new Node(Token.CALL, nameNode("foo"));
    Node arr = new Node(Token.ARRAYLIT, call);
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(arr));
  }

  @Test
  public void testGetImpureBooleanValue_Default() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(stringNode("a")));
  }

  // ================= getStringValue(Node) =================

  @Test
  public void testGetStringValue_String() {
    assertEquals("hello", NodeUtil.getStringValue(stringNode("hello")));
  }

  @Test
  public void testGetStringValue_Name() {
    assertEquals("undefined", NodeUtil.getStringValue(nameNode("undefined")));
    assertEquals("Infinity", NodeUtil.getStringValue(nameNode("Infinity")));
    assertEquals("NaN", NodeUtil.getStringValue(nameNode("NaN")));
    assertNull(NodeUtil.getStringValue(nameNode("x")));
  }

  @Test
  public void testGetStringValue_Number() {
    assertEquals("1", NodeUtil.getStringValue(numberNode(1.0)));
    assertEquals("1.5", NodeUtil.getStringValue(numberNode(1.5)));
  }

  @Test
  public void testGetStringValue_TrueFalseNull() {
    // ไม่ทราบ format แน่ชัดของ Node.tokenToName(); ตรวจสอบเพียงว่าไม่ null
    assertNotNull(NodeUtil.getStringValue(new Node(Token.TRUE)));
    assertNotNull(NodeUtil.getStringValue(new Node(Token.FALSE)));
    assertNotNull(NodeUtil.getStringValue(new Node(Token.NULL)));
  }

  @Test
  public void testGetStringValue_Void() {
    assertEquals("undefined", NodeUtil.getStringValue(new Node(Token.VOID, numberNode(0))));
  }

  @Test
  public void testGetStringValue_Not() {
    Node notTrue = new Node(Token.NOT, new Node(Token.TRUE));
    assertEquals("false", NodeUtil.getStringValue(notTrue));

    Node notUnknown = new Node(Token.NOT, nameNode("x"));
    assertNull(NodeUtil.getStringValue(notUnknown));
  }

  @Test
  public void testGetStringValue_ArrayLit() {
    Node arr = new Node(Token.ARRAYLIT, numberNode(1));
    arr.addChildToBack(numberNode(2));
    assertEquals("1,2", NodeUtil.getStringValue(arr));
  }

  @Test
  public void testGetStringValue_ObjectLit() {
    assertEquals("[object Object]", NodeUtil.getStringValue(new Node(Token.OBJECTLIT)));
  }

  @Test
  public void testGetStringValue_Default() {
    Node add = new Node(Token.ADD, numberNode(1));
    add.addChildToBack(numberNode(2));
    assertNull(NodeUtil.getStringValue(add));
  }

  // ================= getStringValue(double) =================

  @Test
  public void testGetStringValueDouble() {
    assertEquals("1", NodeUtil.getStringValue(1.0));
    assertEquals("100", NodeUtil.getStringValue(100.0));
    assertEquals("1.5", NodeUtil.getStringValue(1.5));
  }

  // ================= getArrayElementStringValue / arrayToString =================

  @Test
  public void testGetArrayElementStringValue() {
    assertEquals("", NodeUtil.getArrayElementStringValue(new Node(Token.NULL)));
    assertEquals("", NodeUtil.getArrayElementStringValue(new Node(Token.VOID, numberNode(0))));
    assertEquals("", NodeUtil.getArrayElementStringValue(new Node(Token.EMPTY)));
    assertEquals("5", NodeUtil.getArrayElementStringValue(numberNode(5)));
  }

  @Test
  public void testArrayToString_Basic() {
    Node arr = new Node(Token.ARRAYLIT, numberNode(1));
    arr.addChildToBack(stringNode("a"));
    assertEquals("1,a", NodeUtil.arrayToString(arr));
  }

  @Test
  public void testArrayToString_EmptyElementSkipped() {
    Node arr = new Node(Token.ARRAYLIT, new Node(Token.EMPTY));
    arr.addChildToBack(numberNode(2));
    assertEquals(",2", NodeUtil.arrayToString(arr));
  }

  @Test
  public void testArrayToString_NullWhenUnconvertible() {
    Node add = new Node(Token.ADD, numberNode(1));
    add.addChildToBack(numberNode(2));
    Node arr = new Node(Token.ARRAYLIT, add);
    assertNull(NodeUtil.arrayToString(arr));
  }

  @Test
  public void testArrayToString_Empty() {
    Node arr = new Node(Token.ARRAYLIT);
    assertEquals("", NodeUtil.arrayToString(arr));
  }

  // ================= getNumberValue =================

  @Test
  public void testGetNumberValue_TrueFalseNull() {
    assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(new Node(Token.TRUE)));
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(new Node(Token.FALSE)));
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(new Node(Token.NULL)));
  }

  @Test
  public void testGetNumberValue_Number() {
    assertEquals(Double.valueOf(3.14), NodeUtil.getNumberValue(numberNode(3.14)));
  }

  @Test
  public void testGetNumberValue_Void() {
    Double v = NodeUtil.getNumberValue(new Node(Token.VOID, numberNode(0)));
    assertEquals(Double.valueOf(Double.NaN), v);

    Node call = new Node(Token.CALL, nameNode("foo"));
    Double v2 = NodeUtil.getNumberValue(new Node(Token.VOID, call));
    assertNull(v2);
  }

  @Test
  public void testGetNumberValue_Name() {
    assertEquals(Double.valueOf(Double.NaN), NodeUtil.getNumberValue(nameNode("undefined")));
    assertEquals(Double.valueOf(Double.NaN), NodeUtil.getNumberValue(nameNode("NaN")));
    assertEquals(Double.valueOf(Double.POSITIVE_INFINITY),
        NodeUtil.getNumberValue(nameNode("Infinity")));
    assertNull(NodeUtil.getNumberValue(nameNode("x")));
  }

  @Test
  public void testGetNumberValue_Neg() {
    Node negInfinity = new Node(Token.NEG, nameNode("Infinity"));
    assertEquals(Double.valueOf(Double.NEGATIVE_INFINITY), NodeUtil.getNumberValue(negInfinity));

    Node negOther = new Node(Token.NEG, numberNode(5));
    assertNull(NodeUtil.getNumberValue(negOther));
  }

  @Test
  public void testGetNumberValue_Not() {
    Node notTrue = new Node(Token.NOT, new Node(Token.TRUE));
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(notTrue));

    Node notUnknown = new Node(Token.NOT, nameNode("x"));
    assertNull(NodeUtil.getNumberValue(notUnknown));
  }

  @Test
  public void testGetNumberValue_String() {
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(stringNode("")));
    assertEquals(Double.valueOf(123.0), NodeUtil.getNumberValue(stringNode("123")));
  }

  @Test
  public void testGetNumberValue_ArrayObjectLit() {
    Node arr = new Node(Token.ARRAYLIT, numberNode(5));
    assertEquals(Double.valueOf(5.0), NodeUtil.getNumberValue(arr));

    Node add = new Node(Token.ADD, numberNode(1));
    add.addChildToBack(numberNode(2));
    Node arrBad = new Node(Token.ARRAYLIT, add);
    assertNull(NodeUtil.getNumberValue(arrBad));
  }

  @Test
  public void testGetNumberValue_Default() {
    assertNull(NodeUtil.getNumberValue(new Node(Token.THIS)));
  }

  // ================= getStringNumberValue =================

  @Test
  public void testGetStringNumberValue_VerticalTab() {
    assertNull(NodeUtil.getStringNumberValue("abc\u000bdef"));
  }

  @Test
  public void testGetStringNumberValue_EmptyAfterTrim() {
    assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue("   "));
  }

  @Test
  public void testGetStringNumberValue_Hex() {
    assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0xFF"));
    assertEquals(Double.valueOf(Double.NaN), NodeUtil.getStringNumberValue("0xZZ"));
  }

  @Test
  public void testGetStringNumberValue_SignedHex() {
    assertNull(NodeUtil.getStringNumberValue("+0x1A"));
    assertNull(NodeUtil.getStringNumberValue("-0x1A"));
  }

  @Test
  public void testGetStringNumberValue_Infinity() {
    assertNull(NodeUtil.getStringNumberValue("infinity"));
    assertNull(NodeUtil.getStringNumberValue("-infinity"));
    assertNull(NodeUtil.getStringNumberValue("+infinity"));
  }

  @Test
  public void testGetStringNumberValue_ParseSuccessAndFailure() {
    assertEquals(Double.valueOf(123.45), NodeUtil.getStringNumberValue("123.45"));
    assertEquals(Double.valueOf(Double.NaN), NodeUtil.getStringNumberValue("abc"));
  }

  // ================= trimJsWhiteSpace / isStrWhiteSpaceChar =================

  @Test
  public void testTrimJsWhiteSpace() {
    assertEquals("abc", NodeUtil.trimJsWhiteSpace("   abc   "));
    assertEquals("", NodeUtil.trimJsWhiteSpace("     "));
    assertEquals("abc", NodeUtil.trimJsWhiteSpace("abc"));
  }

  @Test
  public void testIsStrWhiteSpaceChar() {
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.isStrWhiteSpaceChar('\u000B'));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(' '));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\n'));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u00A0'));
    assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('a'));
  }

  // ================= isImmutableValue =================

  @Test
  public void testIsImmutableValue() {
    assertTrue(NodeUtil.isImmutableValue(stringNode("x")));
    assertTrue(NodeUtil.isImmutableValue(numberNode(1)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NOT, new Node(Token.TRUE))));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.VOID, numberNode(0))));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NEG, numberNode(1))));
    assertTrue(NodeUtil.isImmutableValue(nameNode("undefined")));
    assertTrue(NodeUtil.isImmutableValue(nameNode("Infinity")));
    assertTrue(NodeUtil.isImmutableValue(nameNode("NaN")));
    assertFalse(NodeUtil.isImmutableValue(nameNode("x")));
    assertFalse(NodeUtil.isImmutableValue(new Node(Token.THIS)));
  }

  // ================= isLiteralValue =================

  @Test
  public void testIsLiteralValue_ArrayLit() {
    Node arr = new Node(Token.ARRAYLIT, numberNode(1));
    arr.addChildToBack(new Node(Token.EMPTY));
    assertTrue(NodeUtil.isLiteralValue(arr, false));

    Node arrBad = new Node(Token.ARRAYLIT, nameNode("x"));
    assertFalse(NodeUtil.isLiteralValue(arrBad, false));
  }

  @Test
  public void testIsLiteralValue_ObjectLit() {
    Node key = stringNode("k");
    key.addChildToBack(numberNode(1));
    Node obj = new Node(Token.OBJECTLIT, key);
    assertTrue(NodeUtil.isLiteralValue(obj, false));

    Node keyBad = stringNode("k");
    keyBad.addChildToBack(nameNode("x"));
    Node objBad = new Node(Token.OBJECTLIT, keyBad);
    assertFalse(NodeUtil.isLiteralValue(objBad, false));
  }

  @Test
  public void testIsLiteralValue_Function() {
    Node fn = new Node(Token.FUNCTION, nameNode(""));
    // ASSUMPTION: Node(type, child) constructor sets child.getParent() = this new node.
    new Node(Token.CALL, fn); // ทำให้ fn เป็น function expression (parent ไม่ใช่ statement parent)
    assertTrue(NodeUtil.isLiteralValue(fn, true));
    assertFalse(NodeUtil.isLiteralValue(fn, false));
  }

  @Test
  public void testIsLiteralValue_Default() {
    assertTrue(NodeUtil.isLiteralValue(numberNode(1), false));
    assertFalse(NodeUtil.isLiteralValue(nameNode("x"), false));
  }

  // ================= isValidDefineValue =================

  @Test
  public void testIsValidDefineValue() {
    Set<String> defines = new HashSet<String>();
    defines.add("FOO");

    assertTrue(NodeUtil.isValidDefineValue(stringNode("s"), defines));
    assertTrue(NodeUtil.isValidDefineValue(numberNode(1), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.TRUE), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.FALSE), defines));

    Node add = new Node(Token.ADD, numberNode(1));
    add.addChildToBack(numberNode(2));
    assertTrue(NodeUtil.isValidDefineValue(add, defines));

    Node not = new Node(Token.NOT, numberNode(1));
    assertTrue(NodeUtil.isValidDefineValue(not, defines));

    // ASSUMPTION: NAME node's isQualifiedName()/getQualifiedName() returns its own string.
    assertTrue(NodeUtil.isValidDefineValue(nameNode("FOO"), defines));
    assertFalse(NodeUtil.isValidDefineValue(nameNode("BAR"), defines));

    assertFalse(NodeUtil.isValidDefineValue(new Node(Token.THIS), defines));
  }

  // ================= isEmptyBlock =================

  @Test
  public void testIsEmptyBlock() {
    assertFalse(NodeUtil.isEmptyBlock(new Node(Token.THIS)));

    Node emptyBlock = new Node(Token.BLOCK);
    assertTrue(NodeUtil.isEmptyBlock(emptyBlock));

    Node blockWithEmpty = new Node(Token.BLOCK, new Node(Token.EMPTY));
    assertTrue(NodeUtil.isEmptyBlock(blockWithEmpty));

    Node blockWithStmt = new Node(Token.BLOCK, new Node(Token.THIS));
    assertFalse(NodeUtil.isEmptyBlock(blockWithStmt));
  }

  // ================= isSimpleOperator(Type) =================

  @Test
  public void testIsSimpleOperatorType() {
    assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
    assertTrue(NodeUtil.isSimpleOperatorType(Token.NOT));
    assertFalse(NodeUtil.isSimpleOperatorType(Token.CALL));
  }

  @Test
  public void testIsSimpleOperator() {
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.ADD, numberNode(1))));
    assertFalse(NodeUtil.isSimpleOperator(new Node(Token.CALL, nameNode("f"))));
  }

  // ================= precedence =================

  @Test
  public void testPrecedence() {
    assertEquals(0, NodeUtil.precedence(Token.COMMA));
    assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    assertEquals(2, NodeUtil.precedence(Token.HOOK));
    assertEquals(3, NodeUtil.precedence(Token.OR));
    assertEquals(4, NodeUtil.precedence(Token.AND));
    assertEquals(13, NodeUtil.precedence(Token.NOT));
    assertEquals(15, NodeUtil.precedence(Token.NAME));
  }

  @Test(expected = Error.class)
  public void testPrecedence_UnknownThrows() {
    NodeUtil.precedence(Token.TRY);
  }

  // ================= isNumericResult / isBooleanResult / mayBeString / isUndefined / isNull =====

  @Test
  public void testIsNumericResult() {
    assertTrue(NodeUtil.isNumericResult(numberNode(1)));
    assertTrue(NodeUtil.isNumericResult(nameNode("NaN")));
    assertTrue(NodeUtil.isNumericResult(nameNode("Infinity")));
    assertFalse(NodeUtil.isNumericResult(nameNode("x")));
    assertFalse(NodeUtil.isNumericResult(stringNode("a")));

    Node addNum = new Node(Token.ADD, numberNode(1));
    addNum.addChildToBack(numberNode(2));
    assertTrue(NodeUtil.isNumericResult(addNum));

    Node addStr = new Node(Token.ADD, numberNode(1));
    addStr.addChildToBack(stringNode("a"));
    assertFalse(NodeUtil.isNumericResult(addStr));
  }

  @Test
  public void testIsBooleanResult() {
    assertTrue(NodeUtil.isBooleanResult(new Node(Token.TRUE)));
    assertTrue(NodeUtil.isBooleanResult(new Node(Token.NOT, numberNode(1))));
    assertFalse(NodeUtil.isBooleanResult(numberNode(1)));
  }

  @Test
  public void testIsUndefinedIsNull() {
    assertTrue(NodeUtil.isUndefined(new Node(Token.VOID, numberNode(0))));
    assertTrue(NodeUtil.isUndefined(nameNode("undefined")));
    assertFalse(NodeUtil.isUndefined(nameNode("x")));
    assertFalse(NodeUtil.isUndefined(numberNode(1)));

    assertTrue(NodeUtil.isNull(new Node(Token.NULL)));
    assertFalse(NodeUtil.isNull(new Node(Token.TRUE)));

    assertTrue(NodeUtil.isNullOrUndefined(new Node(Token.NULL)));
    assertTrue(NodeUtil.isNullOrUndefined(nameNode("undefined")));
    assertFalse(NodeUtil.isNullOrUndefined(numberNode(1)));
  }

  @Test
  public void testMayBeString() {
    assertFalse(NodeUtil.mayBeString(numberNode(1)));
    assertTrue(NodeUtil.mayBeString(stringNode("a")));
    assertFalse(NodeUtil.mayBeString(new Node(Token.TRUE)));
    assertFalse(NodeUtil.mayBeString(new Node(Token.NULL)));
    assertFalse(NodeUtil.mayBeString(new Node(Token.VOID, numberNode(0))));

    assertTrue(NodeUtil.mayBeString(stringNode("a"), false));
    assertFalse(NodeUtil.mayBeString(numberNode(1), false));
  }

  // ================= isAssociative / isCommutative =================

  @Test
  public void testIsAssociativeCommutative() {
    assertTrue(NodeUtil.isAssociative(Token.MUL));
    assertTrue(NodeUtil.isAssociative(Token.AND));
    assertFalse(NodeUtil.isAssociative(Token.ADD));

    assertTrue(NodeUtil.isCommutative(Token.MUL));
    assertFalse(NodeUtil.isCommutative(Token.ADD));
  }

  // ================= isAssignmentOp / getOpFromAssignmentOp =================

  @Test
  public void testIsAssignmentOp() {
    assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN, nameNode("x"))));
    assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_ADD, nameNode("x"))));
    assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD, numberNode(1))));
  }

  @Test
  public void testGetOpFromAssignmentOp() {
    assertEquals(Token.BITOR, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_BITOR)));
    assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(new Node(Token.