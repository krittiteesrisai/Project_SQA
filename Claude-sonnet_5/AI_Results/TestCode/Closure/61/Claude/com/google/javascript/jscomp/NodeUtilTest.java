package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;

import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * JUnit4 tests for {@link NodeUtil} (Defects4J Closure-61b).
 */
public class NodeUtilTest {

  // ---------- Helpers to build Node trees ----------

  private static Node numberNode(double d) {
    return Node.newNumber(d);
  }

  private static Node stringNode(String s) {
    return Node.newString(Token.STRING, s);
  }

  private static Node nameNode(String s) {
    return Node.newString(Token.NAME, s);
  }

  private static Node type(int tokenType) {
    return new Node(tokenType);
  }

  /** Wrap n as a statement inside a BLOCK so n.getParent() is a statement parent. */
  private static Node asStatement(Node n) {
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(n);
    return block;
  }

  /** Wrap n as a non-statement expression child (parent = CALL, not stmt parent). */
  private static Node asExpression(Node n) {
    Node call = new Node(Token.CALL);
    call.addChildToBack(n);
    return call;
  }

  private static Node getProp(Node obj, String prop) {
    return new Node(Token.GETPROP, obj, stringNode(prop));
  }

  // =====================================================================
  // getPureBooleanValue
  // =====================================================================

  @Test
  public void testGetPureBooleanValue_StringNonEmpty() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(stringNode("a")));
  }

  @Test
  public void testGetPureBooleanValue_StringEmpty() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(stringNode("")));
  }

  @Test
  public void testGetPureBooleanValue_NumberZero() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(numberNode(0)));
  }

  @Test
  public void testGetPureBooleanValue_NumberNonZero() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(numberNode(5)));
  }

  @Test
  public void testGetPureBooleanValue_Not() {
    Node n = new Node(Token.NOT, numberNode(0)); // !0 => true
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
  }

  @Test
  public void testGetPureBooleanValue_NullFalseVoid() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(type(Token.NULL)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(type(Token.FALSE)));
    Node voidNode = new Node(Token.VOID, numberNode(0));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(voidNode));
  }

  @Test
  public void testGetPureBooleanValue_NameUndefinedAndNaN() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(nameNode("undefined")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(nameNode("NaN")));
  }

  @Test
  public void testGetPureBooleanValue_NameInfinity() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(nameNode("Infinity")));
  }

  @Test
  public void testGetPureBooleanValue_NameOtherFallsToUnknown() {
    // NAME with other string: break out of switch without return -> UNKNOWN
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(nameNode("x")));
  }

  @Test
  public void testGetPureBooleanValue_TrueAndRegexp() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(type(Token.TRUE)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(type(Token.REGEXP)));
  }

  @Test
  public void testGetPureBooleanValue_EmptyArrayLitNoSideEffects() {
    Node arr = type(Token.ARRAYLIT);
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(arr));
  }

  @Test
  public void testGetPureBooleanValue_ArrayLitWithSideEffectsUnknown() {
    Node arr = type(Token.ARRAYLIT);
    Node call = new Node(Token.CALL);
    call.addChildToBack(nameNode("foo")); // unknown function -> has side effects
    arr.addChildToBack(call);
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(arr));
  }

  @Test
  public void testGetPureBooleanValue_DefaultUnknown() {
    // GETPROP is not handled explicitly -> default -> UNKNOWN
    Node gp = getProp(nameNode("a"), "b");
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(gp));
  }

  // =====================================================================
  // getImpureBooleanValue
  // =====================================================================

  @Test
  public void testGetImpureBooleanValue_Assign() {
    Node n = new Node(Token.ASSIGN, nameNode("x"), numberNode(1));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
  }

  @Test
  public void testGetImpureBooleanValue_Comma() {
    Node n = new Node(Token.COMMA, numberNode(1), numberNode(0));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
  }

  @Test
  public void testGetImpureBooleanValue_Not() {
    Node n = new Node(Token.NOT, numberNode(1));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
  }

  @Test
  public void testGetImpureBooleanValue_And() {
    Node n = new Node(Token.AND, type(Token.TRUE), type(Token.FALSE));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
  }

  @Test
  public void testGetImpureBooleanValue_Or() {
    Node n = new Node(Token.OR, type(Token.FALSE), type(Token.TRUE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
  }

  @Test
  public void testGetImpureBooleanValue_HookSameValue() {
    Node hook = new Node(Token.HOOK, nameNode("cond"), type(Token.TRUE));
    hook.addChildToBack(type(Token.TRUE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(hook));
  }

  @Test
  public void testGetImpureBooleanValue_HookDifferentValueUnknown() {
    Node hook = new Node(Token.HOOK, nameNode("cond"), type(Token.TRUE));
    hook.addChildToBack(type(Token.FALSE));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(hook));
  }

  @Test
  public void testGetImpureBooleanValue_ArrayObjectLitIgnoreSideEffects() {
    Node arr = type(Token.ARRAYLIT);
    Node call = new Node(Token.CALL);
    call.addChildToBack(nameNode("foo"));
    arr.addChildToBack(call);
    // getImpureBooleanValue ignores side effects for ARRAYLIT/OBJECTLIT -> TRUE
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(arr));
  }

  @Test
  public void testGetImpureBooleanValue_DefaultDelegates() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(stringNode("hi")));
  }

  // =====================================================================
  // getStringValue / getStringValue(double) / getArrayElementStringValue / arrayToString
  // =====================================================================

  @Test
  public void testGetStringValue_String() {
    assertEquals("hi", NodeUtil.getStringValue(stringNode("hi")));
  }

  @Test
  public void testGetStringValue_NameSpecials() {
    assertEquals("undefined", NodeUtil.getStringValue(nameNode("undefined")));
    assertEquals("Infinity", NodeUtil.getStringValue(nameNode("Infinity")));
    assertEquals("NaN", NodeUtil.getStringValue(nameNode("NaN")));
  }

  @Test
  public void testGetStringValue_NameOtherReturnsNull() {
    assertNull(NodeUtil.getStringValue(nameNode("x")));
  }

  @Test
  public void testGetStringValue_Number() {
    assertEquals("1", NodeUtil.getStringValue(numberNode(1)));
    assertEquals("1.5", NodeUtil.getStringValue(numberNode(1.5)));
  }

  @Test
  public void testGetStringValue_FalseTrueNull() {
    assertNotNull_orEqualsTokenName(Token.FALSE);
    assertNotNull_orEqualsTokenName(Token.TRUE);
    assertNotNull_orEqualsTokenName(Token.NULL);
  }

  private void assertNotNull_orEqualsTokenName(int t) {
    String v = NodeUtil.getStringValue(type(t));
    // Node.tokenToName should give lowercase like "false"/"true"/"null"
    assertEquals(Node.tokenToName(t), v);
  }

  @Test
  public void testGetStringValue_Void() {
    Node voidNode = new Node(Token.VOID, numberNode(0));
    assertEquals("undefined", NodeUtil.getStringValue(voidNode));
  }

  @Test
  public void testGetStringValue_NotKnownBoolean() {
    Node n = new Node(Token.NOT, type(Token.TRUE)); // !true -> "false"
    assertEquals("false", NodeUtil.getStringValue(n));
    Node n2 = new Node(Token.NOT, type(Token.FALSE)); // !false -> "true"
    assertEquals("true", NodeUtil.getStringValue(n2));
  }

  @Test
  public void testGetStringValue_NotUnknownBreaksToNull() {
    Node n = new Node(Token.NOT, nameNode("x")); // pure boolean value of NAME "x" -> UNKNOWN
    assertNull(NodeUtil.getStringValue(n));
  }

  @Test
  public void testGetStringValue_ArrayLit() {
    Node arr = type(Token.ARRAYLIT);
    arr.addChildToBack(numberNode(1));
    arr.addChildToBack(numberNode(2));
    assertEquals("1,2", NodeUtil.getStringValue(arr));
  }

  @Test
  public void testGetStringValue_ObjectLit() {
    Node obj = type(Token.OBJECTLIT);
    assertEquals("[object Object]", NodeUtil.getStringValue(obj));
  }

  @Test
  public void testGetStringValue_DefaultNull() {
    Node gp = getProp(nameNode("a"), "b");
    assertNull(NodeUtil.getStringValue(gp));
  }

  @Test
  public void testGetStringValueDouble_Integer() {
    assertEquals("1", NodeUtil.getStringValue(1.0));
  }

  @Test
  public void testGetStringValueDouble_Fraction() {
    assertEquals(Double.toString(1.5), NodeUtil.getStringValue(1.5));
  }

  @Test
  public void testGetArrayElementStringValue_NullUndefinedEmpty() {
    assertEquals("", NodeUtil.getArrayElementStringValue(type(Token.NULL)));
    assertEquals("", NodeUtil.getArrayElementStringValue(nameNode("undefined")));
    assertEquals("", NodeUtil.getArrayElementStringValue(type(Token.EMPTY)));
  }

  @Test
  public void testGetArrayElementStringValue_Normal() {
    assertEquals("5", NodeUtil.getArrayElementStringValue(numberNode(5)));
  }

  @Test
  public void testArrayToString_Simple() {
    Node arr = type(Token.ARRAYLIT);
    arr.addChildToBack(numberNode(1));
    arr.addChildToBack(stringNode("a"));
    assertEquals("1,a", NodeUtil.arrayToString(arr));
  }

  @Test
  public void testArrayToString_WithNullUndefinedBecomeEmpty() {
    Node arr = type(Token.ARRAYLIT);
    arr.addChildToBack(type(Token.NULL));
    arr.addChildToBack(numberNode(2));
    assertEquals(",2", NodeUtil.arrayToString(arr));
  }

  @Test
  public void testArrayToString_UnknownChildReturnsNull() {
    Node arr = type(Token.ARRAYLIT);
    arr.addChildToBack(nameNode("x")); // getStringValue(NAME "x") -> null
    assertNull(NodeUtil.arrayToString(arr));
  }

  // =====================================================================
  // getNumberValue
  // =====================================================================

  @Test
  public void testGetNumberValue_TrueFalseNull() {
    assertEquals(1.0, NodeUtil.getNumberValue(type(Token.TRUE)), 0);
    assertEquals(0.0, NodeUtil.getNumberValue(type(Token.FALSE)), 0);
    assertEquals(0.0, NodeUtil.getNumberValue(type(Token.NULL)), 0);
  }

  @Test
  public void testGetNumberValue_Number() {
    assertEquals(3.14, NodeUtil.getNumberValue(numberNode(3.14)), 0);
  }

  @Test
  public void testGetNumberValue_VoidNoSideEffects() {
    Node voidNode = new Node(Token.VOID, numberNode(0));
    assertTrue(Double.isNaN(NodeUtil.getNumberValue(voidNode)));
  }

  @Test
  public void testGetNumberValue_VoidWithSideEffectsReturnsNull() {
    Node call = new Node(Token.CALL);
    call.addChildToBack(nameNode("foo"));
    Node voidNode = new Node(Token.VOID, call);
    assertNull(NodeUtil.getNumberValue(voidNode));
  }

  @Test
  public void testGetNumberValue_NameSpecials() {
    assertTrue(Double.isNaN(NodeUtil.getNumberValue(nameNode("undefined"))));
    assertTrue(Double.isNaN(NodeUtil.getNumberValue(nameNode("NaN"))));
    assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(nameNode("Infinity")), 0);
  }

  @Test
  public void testGetNumberValue_NameOtherNull() {
    assertNull(NodeUtil.getNumberValue(nameNode("x")));
  }

  @Test
  public void testGetNumberValue_NegInfinity() {
    Node neg = new Node(Token.NEG, nameNode("Infinity"));
    assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(neg), 0);
  }

  @Test
  public void testGetNumberValue_NegOtherNull() {
    Node neg = new Node(Token.NEG, numberNode(5));
    assertNull(NodeUtil.getNumberValue(neg));
  }

  @Test
  public void testGetNumberValue_NotKnown() {
    Node n = new Node(Token.NOT, type(Token.TRUE));
    assertEquals(0.0, NodeUtil.getNumberValue(n), 0);
    Node n2 = new Node(Token.NOT, type(Token.FALSE));
    assertEquals(1.0, NodeUtil.getNumberValue(n2), 0);
  }

  @Test
  public void testGetNumberValue_NotUnknownFallsToNull() {
    Node n = new Node(Token.NOT, nameNode("x"));
    assertNull(NodeUtil.getNumberValue(n));
  }

  @Test
  public void testGetNumberValue_String() {
    assertEquals(42.0, NodeUtil.getNumberValue(stringNode("42")), 0);
  }

  @Test
  public void testGetNumberValue_ArrayObjectLit() {
    Node arr = type(Token.ARRAYLIT);
    arr.addChildToBack(numberNode(3));
    assertEquals(3.0, NodeUtil.getNumberValue(arr), 0);
  }

  @Test
  public void testGetNumberValue_DefaultNull() {
    Node gp = getProp(nameNode("a"), "b");
    assertNull(NodeUtil.getNumberValue(gp));
  }

  // =====================================================================
  // getStringNumberValue / trimJsWhiteSpace / isStrWhiteSpaceChar
  // =====================================================================

  @Test
  public void testGetStringNumberValue_VerticalTabReturnsNull() {
    assertNull(NodeUtil.getStringNumberValue("1\u000b2"));
  }

  @Test
  public void testGetStringNumberValue_EmptyAfterTrim() {
    assertEquals(0.0, NodeUtil.getStringNumberValue("   "), 0);
  }

  @Test
  public void testGetStringNumberValue_Hex() {
    assertEquals(255.0, NodeUtil.getStringNumberValue("0xFF"), 0);
  }

  @Test
  public void testGetStringNumberValue_HexInvalidReturnsNaN() {
    assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("0xZZ")));
  }

  @Test
  public void testGetStringNumberValue_SignedHexReturnsNull() {
    assertNull(NodeUtil.getStringNumberValue("+0x1"));
    assertNull(NodeUtil.getStringNumberValue("-0x1"));
  }

  @Test
  public void testGetStringNumberValue_InfinityVariantsReturnNull() {
    assertNull(NodeUtil.getStringNumberValue("infinity"));
    assertNull(NodeUtil.getStringNumberValue("-infinity"));
    assertNull(NodeUtil.getStringNumberValue("+infinity"));
  }

  @Test
  public void testGetStringNumberValue_NormalNumber() {
    assertEquals(123.45, NodeUtil.getStringNumberValue("123.45"), 0);
  }

  @Test
  public void testGetStringNumberValue_InvalidReturnsNaN() {
    assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("abc")));
  }

  @Test
  public void testTrimJsWhiteSpace() {
    assertEquals("abc", NodeUtil.trimJsWhiteSpace("  abc  "));
    assertEquals("", NodeUtil.trimJsWhiteSpace("   "));
  }

  @Test
  public void testIsStrWhiteSpaceChar_VerticalTabUnknown() {
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.isStrWhiteSpaceChar('\u000B'));
  }

  @Test
  public void testIsStrWhiteSpaceChar_KnownWhitespaceTrue() {
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(' '));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\n'));
  }

  @Test
  public void testIsStrWhiteSpaceChar_DefaultFalse() {
    assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('a'));
  }

  // =====================================================================
  // isImmutableValue / isLiteralValue
  // =====================================================================

  @Test
  public void testIsImmutableValue_Literals() {
    assertTrue(NodeUtil.isImmutableValue(stringNode("x")));
    assertTrue(NodeUtil.isImmutableValue(numberNode(1)));
    assertTrue(NodeUtil.isImmutableValue(type(Token.NULL)));
    assertTrue(NodeUtil.isImmutableValue(type(Token.TRUE)));
    assertTrue(NodeUtil.isImmutableValue(type(Token.FALSE)));
  }

  @Test
  public void testIsImmutableValue_NotVoidNeg() {
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NOT, numberNode(1))));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.VOID, numberNode(1))));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NEG, numberNode(1))));
  }

  @Test
  public void testIsImmutableValue_NameSpecialsAndOther() {
    assertTrue(NodeUtil.isImmutableValue(nameNode("undefined")));
    assertTrue(NodeUtil.isImmutableValue(nameNode("Infinity")));
    assertTrue(NodeUtil.isImmutableValue(nameNode("NaN")));
    assertFalse(NodeUtil.isImmutableValue(nameNode("x")));
  }

  @Test
  public void testIsImmutableValue_DefaultFalse() {
    assertFalse(NodeUtil.isImmutableValue(type(Token.ARRAYLIT)));
  }

  @Test
  public void testIsLiteralValue_ArrayLitAllLiteral() {
    Node arr = type(Token.ARRAYLIT);
    arr.addChildToBack(numberNode(1));
    arr.addChildToBack(type(Token.EMPTY));
    assertTrue(NodeUtil.isLiteralValue(arr, false));
  }

  @Test
  public void testIsLiteralValue_ArrayLitNotLiteral() {
    Node arr = type(Token.ARRAYLIT);
    arr.addChildToBack(nameNode("x"));
    assertFalse(NodeUtil.isLiteralValue(arr, false));
  }

  @Test
  public void testIsLiteralValue_ObjectLitAllLiteral() {
    Node obj = type(Token.OBJECTLIT);
    Node key = stringNode("k");
    key.addChildToBack(numberNode(1));
    obj.addChildToBack(key);
    assertTrue(NodeUtil.isLiteralValue(obj, false));
  }

  @Test
  public void testIsLiteralValue_ObjectLitNotLiteral() {
    Node obj = type(Token.OBJECTLIT);
    Node key = stringNode("k");
    key.addChildToBack(nameNode("x"));
    obj.addChildToBack(key);
    assertFalse(NodeUtil.isLiteralValue(obj, false));
  }

  @Test
  public void testIsLiteralValue_RegexpAllConstChildren() {
    Node regexp = type(Token.REGEXP);
    // no children -> true
    assertTrue(NodeUtil.isLiteralValue(regexp, false));
  }

  @Test
  public void testIsLiteralValue_FunctionIncludeFunctionsTrueDeclarationFalse() {
    Node func = NodeUtil.newFunctionNode(
        "f", new java.util.ArrayList<Node>(), new Node(Token.BLOCK), 1, 0);
    asStatement(func); // it's a declaration now
    // includeFunctions=true but isFunctionDeclaration(func) true -> !true = false
    assertFalse(NodeUtil.isLiteralValue(func, true));
  }

  @Test
  public void testIsLiteralValue_FunctionExpressionIncludeTrue() {
    Node func = NodeUtil.newFunctionNode(
        "", new java.util.ArrayList<Node>(), new Node(Token.BLOCK), 1, 0);
    asExpression(func);
    assertTrue(NodeUtil.isLiteralValue(func, true));
  }

  @Test
  public void testIsLiteralValue_FunctionIncludeFunctionsFalse() {
    Node func = NodeUtil.newFunctionNode(
        "", new java.util.ArrayList<Node>(), new Node(Token.BLOCK), 1, 0);
    asExpression(func);
    assertFalse(NodeUtil.isLiteralValue(func, false));
  }

  @Test
  public void testIsLiteralValue_DefaultDelegatesToImmutable() {
    assertTrue(NodeUtil.isLiteralValue(numberNode(1), false));
    assertFalse(NodeUtil.isLiteralValue(nameNode("x"), false));
  }

  // =====================================================================
  // isValidDefineValue
  // =====================================================================

  @Test
  public void testIsValidDefineValue_SimpleTypesTrue() {
    Set<String> defines = new HashSet<String>();
    assertTrue(NodeUtil.isValidDefineValue(stringNode("x"), defines));
    assertTrue(NodeUtil.isValidDefineValue(numberNode(1), defines));
    assertTrue(NodeUtil.isValidDefineValue(type(Token.TRUE), defines));
    assertTrue(NodeUtil.isValidDefineValue(type(Token.FALSE), defines));
  }

  @Test
  public void testIsValidDefineValue_BinaryOperatorBothValid() {
    Set<String> defines = new HashSet<String>();
    Node add = new Node(Token.ADD, numberNode(1), numberNode(2));
    assertTrue(NodeUtil.isValidDefineValue(add, defines));
  }

  @Test
  public void testIsValidDefineValue_BinaryOperatorInvalidChild() {
    Set<String> defines = new HashSet<String>();
    Node add = new Node(Token.ADD, numberNode(1), nameNode("undeclared"));
    assertFalse(NodeUtil.isValidDefineValue(add, defines));
  }

  @Test
  public void testIsValidDefineValue_UnaryOperator() {
    Set<String> defines = new HashSet<String>();
    Node neg = new Node(Token.NEG, numberNode(1));
    assertTrue(NodeUtil.isValidDefineValue(neg, defines));
  }

  @Test
  public void testIsValidDefineValue_NameIsDefine() {
    Set<String> defines = new HashSet<String>();
    defines.add("FOO");
    assertTrue(NodeUtil.isValidDefineValue(nameNode("FOO"), defines));
  }

  @Test
  public void testIsValidDefineValue_NameNotDefine() {
    Set<String> defines = new HashSet<String>();
    assertFalse(NodeUtil.isValidDefineValue(nameNode("BAR"), defines));
  }

  @Test
  public void testIsValidDefineValue_DefaultFalse() {
    Set<String> defines = new HashSet<String>();
    assertFalse(NodeUtil.isValidDefineValue(type(Token.ARRAYLIT), defines));
  }

  // =====================================================================
  // isEmptyBlock
  // =====================================================================

  @Test
  public void testIsEmptyBlock_NotBlock() {
    assertFalse(NodeUtil.isEmptyBlock(nameNode("x")));
  }

  @Test
  public void testIsEmptyBlock_TrueForNoChildrenOrOnlyEmpty() {
    Node block = type(Token.BLOCK);
    assertTrue(NodeUtil.isEmptyBlock(block));
    block.addChildToBack(type(Token.EMPTY));
    assertTrue(NodeUtil.isEmptyBlock(block));
  }

  @Test
  public void testIsEmptyBlock_FalseWithRealStatement() {
    Node block = type(Token.BLOCK);
    block.addChildToBack(new Node(Token.EXPR_RESULT, numberNode(1)));
    assertFalse(NodeUtil.isEmptyBlock(block));
  }

  // =====================================================================
  // isSimpleOperatorType / isSimpleOperator
  // =====================================================================

  @Test
  public void testIsSimpleOperatorType_TrueCases() {
    assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
    assertTrue(NodeUtil.isSimpleOperatorType(Token.GETPROP));
    assertTrue(NodeUtil.isSimpleOperatorType(Token.TYPEOF));
  }

  @Test
  public void testIsSimpleOperatorType_FalseCase() {
    assertFalse(NodeUtil.isSimpleOperatorType(Token.ASSIGN));
    assertFalse(NodeUtil.isSimpleOperatorType(Token.AND));
  }

  @Test
  public void testIsSimpleOperator_delegates() {
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.ADD, numberNode(1), numberNode(2))));
    assertFalse(NodeUtil.isSimpleOperator(new Node(Token.AND, numberNode(1), numberNode(2))));
  }

  // =====================================================================
  // precedence
  // =====================================================================

  @Test
  public void testPrecedence_VariousLevels() {
    assertEquals(0, NodeUtil.precedence(Token.COMMA));
    assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    assertEquals(2, NodeUtil.precedence(Token.HOOK));
    assertEquals(3, NodeUtil.precedence(Token.OR));
    assertEquals(4, NodeUtil.precedence(Token.AND));
    assertEquals(13, NodeUtil.precedence(Token.NEG));
    assertEquals(15, NodeUtil.precedence(Token.NAME));
  }

  @Test(expected = Error.class)
  public void testPrecedence_UnknownThrows() {
    NodeUtil.precedence(Token.SCRIPT);
  }

  // =====================================================================
  // isUndefined / isNull / isNullOrUndefined
  // =====================================================================

  @Test
  public void testIsUndefined() {
    assertTrue(NodeUtil.isUndefined(new Node(Token.VOID, numberNode(0))));
    assertTrue(NodeUtil.isUndefined(nameNode("undefined")));
    assertFalse(NodeUtil.isUndefined(nameNode("x")));
    assertFalse(NodeUtil.isUndefined(numberNode(1)));
  }

  @Test
  public void testIsNull() {
    assertTrue(NodeUtil.isNull(type(Token.NULL)));
    assertFalse(NodeUtil.isNull(numberNode(1)));
  }

  @Test
  public void testIsNullOrUndefined() {
    assertTrue(NodeUtil.isNullOrUndefined(type(Token.NULL)));
    assertTrue(NodeUtil.isNullOrUndefined(nameNode("undefined")));
    assertFalse(NodeUtil.isNullOrUndefined(numberNode(1)));
  }

  // =====================================================================
  // isAssociative / isCommutative
  // =====================================================================

  @Test
  public void testIsAssociative() {
    assertTrue(NodeUtil.isAssociative(Token.MUL));
    assertTrue(NodeUtil.isAssociative(Token.AND));
    assertFalse(NodeUtil.isAssociative(Token.ADD));
  }

  @Test
  public void testIsCommutative() {
    assertTrue(NodeUtil.isCommutative(Token.MUL));
    assertFalse(NodeUtil.isCommutative(Token.ADD));
    assertFalse(NodeUtil.isCommutative(Token.AND));
  }

  // =====================================================================
  // isAssignmentOp / getOpFromAssignmentOp
  // =====================================================================

  @Test
  public void testIsAssignmentOp() {
    assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN, nameNode("x"), numberNode(1))));
    assertTrue(NodeUtil.isAssignmentOp(
        new Node(Token.ASSIGN_ADD, nameNode("x"), numberNode(1))));
    assertFalse(NodeUtil.isAssignmentOp(numberNode(1)));
  }

  @Test
  public void testGetOpFromAssignmentOp_AllMapped() {
    assertEquals(Token.BITOR, NodeUtil.getOpFromAssignmentOp(type(Token.ASSIGN_BITOR)));
    assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(type(Token.ASSIGN_ADD)));
    assertEquals(Token.MOD, NodeUtil.getOpFromAssignmentOp(type(Token.ASSIGN_MOD)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetOpFromAssignmentOp_NotAssignThrows() {
    NodeUtil.getOpFromAssignmentOp(numberNode(1));
  }

  // =====================================================================
  // isExpressionNode / isGet / isGetProp / isName / isNew / isVar
  // =====================================================================

  @Test
  public void testIsExpressionNode() {
    Node exprRes = new Node(Token.EXPR_RESULT, numberNode(1));
    assertTrue(NodeUtil.isExpressionNode(exprRes));
    assertFalse(NodeUtil.isExpressionNode(numberNode(1)));
  }

  @Test
  public void testIsGetIsGetPropIsNameIsNewIsVar() {
    Node gp = getProp(nameNode("a"), "b");
    assertTrue(NodeUtil.isGet(gp));
    assertTrue(NodeUtil.isGetProp(gp));
    assertFalse(NodeUtil.isGet(numberNode(1)));

    assertTrue(NodeUtil.isName(nameNode("x")));
    assertFalse(NodeUtil.isName(numberNode(1)));

    Node newNode = new Node(Token.NEW, nameNode("Foo"));
    assertTrue(NodeUtil.isNew(newNode));
    assertFalse(NodeUtil.isNew(numberNode(1)));

    Node var = type(Token.VAR);
    assertTrue(NodeUtil.isVar(var));
    assertFalse(NodeUtil.isVar(numberNode(1)));
  }

  // =====================================================================
  // isVarDeclaration / getAssignedValue
  // =====================================================================

  @Test
  public void testIsVarDeclaration_True() {
    Node var = type(Token.VAR);
    Node n = nameNode("x");
    var.addChildToBack(n);
    assertTrue(NodeUtil.isVarDeclaration(n));
  }

  @Test
  public void testIsVarDeclaration_FalseWrongParent() {
    Node block = type(Token.BLOCK);
    Node n = nameNode("x");
    block.addChildToBack(n);
    assertFalse(NodeUtil.isVarDeclaration(n));
  }

  @Test
  public void testGetAssignedValue_Var() {
    Node var = type(Token.VAR);
    Node n = nameNode("x");
    Node value = numberNode(5);
    n.addChildToBack(value);
    var.addChildToBack(n);
    assertEquals(value, NodeUtil.getAssignedValue(n));
  }

  @Test
  public void testGetAssignedValue_AssignLHS() {
    Node n = nameNode("x");
    Node value = numberNode(5);
    Node assign = new Node(Token.ASSIGN, n, value);
    assertEquals(value, NodeUtil.getAssignedValue(n));
  }

  @Test
  public void testGetAssignedValue_NullOtherwise() {
    Node n = nameNode("x");
    Node block = type(Token.BLOCK);
    block.addChildToBack(n);
    assertNull(NodeUtil.getAssignedValue(n));
  }

  // =====================================================================
  // isString / isExprAssign / isAssign / isExprCall
  // =====================================================================

  @Test
  public void testIsStringAndExprAssignAndAssignAndExprCall() {
    assertTrue(NodeUtil.isString(stringNode("x")));
    assertFalse(NodeUtil.isString(numberNode(1)));

    Node assign = new Node(Token.ASSIGN, nameNode("x"), numberNode(1));
    Node exprAssign = new Node(Token.EXPR_RESULT, assign);
    assertTrue(NodeUtil.isExprAssign(exprAssign));
    assertTrue(NodeUtil.isAssign(assign));
    assertFalse(NodeUtil.isAssign(numberNode(1)));

    Node call = new Node(Token.CALL, nameNode("f"));
    Node exprCall = new Node(Token.EXPR_RESULT, call);
    assertTrue(NodeUtil.isExprCall(exprCall));
  }

  // =====================================================================
  // isForIn / isLoopStructure / getLoopCodeBlock / isWithinLoop
  // =====================================================================

  @Test
  public void testIsForIn_TrueWith3Children() {
    Node forNode = type(Token.FOR);
    forNode.addChildToBack(nameNode("x"));
    forNode.addChildToBack(nameNode("obj"));
    forNode.addChildToBack(type(Token.BLOCK));
    assertTrue(NodeUtil.isForIn(forNode));
  }

  @Test
  public void testIsForIn_FalseWith4Children() {
    Node forNode = type(Token.FOR);
    forNode.addChildToBack(type(Token.EMPTY));
    forNode.addChildToBack(type(Token.EMPTY));
    forNode.addChildToBack(type(Token.EMPTY));
    forNode.addChildToBack(type(Token.BLOCK));
    assertFalse(NodeUtil.isForIn(forNode));
  }

  @Test
  public void testIsLoopStructure() {
    assertTrue(NodeUtil.isLoopStructure(type(Token.FOR)));
    assertTrue(NodeUtil.isLoopStructure(type(Token.DO)));
    assertTrue(NodeUtil.isLoopStructure(type(Token.WHILE)));
    assertFalse(NodeUtil.isLoopStructure(type(Token.IF)));
  }

  @Test
  public void testGetLoopCodeBlock() {
    Node forNode = type(Token.FOR);
    Node init = type(Token.EMPTY);
    Node cond = type(Token.EMPTY);
    Node body = type(Token.BLOCK);
    forNode.addChildToBack(init);
    forNode.addChildToBack(cond);
    forNode.addChildToBack(body);
    assertEquals(body, NodeUtil.getLoopCodeBlock(forNode));

    Node whileNode = type(Token.WHILE);
    Node wCond = type(Token.EMPTY);
    Node wBody = type(Token.BLOCK);
    whileNode.addChildToBack(wCond);
    whileNode.addChildToBack(wBody);
    assertEquals(wBody, NodeUtil.getLoopCodeBlock(whileNode));

    Node doNode = type(Token.DO);
    Node dBody = type(Token.BLOCK);
    Node dCond = type(Token.EMPTY);
    doNode.addChildToBack(dBody);
    doNode.addChildToBack(dCond);
    assertEquals(dBody, NodeUtil.getLoopCodeBlock(doNode));

    assertNull(NodeUtil.getLoopCodeBlock(type(Token.IF)));
  }

  // =====================================================================
  // isControlStructure / isControlStructureCodeBlock
  // =====================================================================

  @Test
  public void testIsControlStructure() {
    assertTrue(NodeUtil.isControlStructure(type(Token.IF)));
    assertTrue(NodeUtil.isControlStructure(type(Token.SWITCH)));
    assertFalse(NodeUtil.isControlStructure(type(Token.BLOCK)));
  }

  @Test
  public void testIsControlStructureCodeBlock_If() {
    Node ifNode = type(Token.IF);
    Node cond = nameNode("c");
    Node thenBlock = type(Token.BLOCK);
    ifNode.addChildToBack(cond);
    ifNode.addChildToBack(thenBlock);
    assertFalse(NodeUtil.isControlStructureCodeBlock(ifNode, cond));
    assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, thenBlock));
  }

  @Test
  public void testIsControlStructureCodeBlock_Default_UnknownParentPreconditionFails() {
    try {
      NodeUtil.isControlStructureCodeBlock(type(Token.BLOCK), type(Token.EMPTY));
      fail("Expected IllegalStateException for non control-structure parent");
    } catch (IllegalStateException expected) {
      // OK per Preconditions.checkState(isControlStructure(parent))
    }
  }

  // =====================================================================
  // getConditionExpression
  // =====================================================================

  @Test
  public void testGetConditionExpression_If() {
    Node ifNode = type(Token.IF);
    Node cond = nameNode("c");
    ifNode.addChildToBack(cond);
    ifNode.addChildToBack(type(Token.BLOCK));
    assertEquals(cond, NodeUtil.getConditionExpression(ifNode));
  }

  @Test
  public void testGetConditionExpression_Do() {
    Node doNode = type(Token.DO);
    Node body = type(Token.BLOCK);
    Node cond = nameNode("c");
    doNode.addChildToBack(body);
    doNode.addChildToBack(cond);
    assertEquals(cond, NodeUtil.getConditionExpression(doNode));
  }

  @Test
  public void testGetConditionExpression_ForWith3ChildrenNull() {
    Node forNode = type(Token.FOR);
    forNode.addChildToBack(type(Token.EMPTY));
    forNode.addChildToBack(type(Token.EMPTY));
    forNode.addChildToBack(type(Token.BLOCK));
    assertNull(NodeUtil.getConditionExpression(forNode));
  }

  @Test
  public void testGetConditionExpression_ForWith4Children() {
    Node forNode = type(Token.FOR);
    Node init = type(Token.EMPTY);
    Node cond = nameNode("c");
    forNode.addChildToBack(init);
    forNode.addChildToBack(cond);
    forNode.addChildToBack(type(Token.EMPTY));
    forNode.addChildToBack(type(Token.BLOCK));
    assertEquals(cond, NodeUtil.getConditionExpression(forNode));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_ForMalformedThrows() {
    Node forNode = type(Token.FOR);
    forNode.addChildToBack(type(Token.EMPTY)); // only 1 child
    NodeUtil.getConditionExpression(forNode);
  }

  @Test
  public void testGetConditionExpression_CaseNull() {
    assertNull(NodeUtil.getConditionExpression(type(Token.CASE)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_UnsupportedThrows() {
    NodeUtil.getConditionExpression(type(Token.BLOCK));
  }

  // =====================================================================
  // isStatementBlock / isStatement / isStatementParent / isSwitchCase
  // =====================================================================

  @Test
  public void testIsStatementBlock() {
    assertTrue(NodeUtil.isStatementBlock(type(Token.SCRIPT)));
    assertTrue(NodeUtil.isStatementBlock(type(Token.BLOCK)));
    assertFalse(NodeUtil.isStatementBlock(type(Token.IF)));
  }

  @Test
  public void testIsStatement_TrueAndFalse() {
    Node n = numberNode(1);
    Node block = type(Token.BLOCK);
    block.addChildToBack(n);
    assertTrue(NodeUtil.isStatement(n));

    Node n2 = numberNode(2);
    Node call = new Node(Token.CALL, n2);
    assertFalse(NodeUtil.isStatement(n2));
  }

  @Test
  public void testIsSwitchCase() {
    assertTrue(NodeUtil.isSwitchCase(type(Token.CASE)));
    assertTrue(NodeUtil.isSwitchCase(type(Token.DEFAULT)));
    assertFalse(NodeUtil.isSwitchCase(type(Token.IF)));
  }

  // =====================================================================
  // isReferenceName / isLabelName
  // =====================================================================

  @Test
  public void testIsReferenceName() {
    assertTrue(NodeUtil.isReferenceName(nameNode("x")));
    assertFalse(NodeUtil.isReferenceName(nameNode("")));
    assertFalse(NodeUtil.isReferenceName(numberNode(1)));
  }

  @Test
  public void testIsLabelName() {
    assertTrue(NodeUtil.isLabelName(Node.newString(Token.LABEL_NAME, "L")));
    assertFalse(NodeUtil.isLabelName(nameNode("x")));
    assertFalse(NodeUtil.isLabelName(null));
  }

  // =====================================================================
  // isCall / isCallOrNew / isFunction / isThis / isArrayLiteral
  // =====================================================================

  @Test
  public void testIsCallIsCallOrNewIsFunctionIsThisIsArrayLiteral() {
    Node call = new Node(Token.CALL, nameNode("f"));
    assertTrue(NodeUtil.isCall(call));
    assertTrue(NodeUtil.isCallOrNew(call));

    Node newN = new Node(Token.NEW, nameNode("F"));
    assertTrue(NodeUtil.isCallOrNew(newN));
    assertFalse(NodeUtil.isCall(newN));

    assertFalse(NodeUtil.isCallOrNew(numberNode(1)));

    Node func = NodeUtil.newFunctionNode(
        "f", new java.util.ArrayList<Node>(), new Node(Token.BLOCK), 1, 0);
    assertTrue(NodeUtil.isFunction(func));

    assertTrue(NodeUtil.isThis(type(Token.THIS)));
    assertFalse(NodeUtil.isThis(numberNode(1)));

    assertTrue(NodeUtil.isArrayLiteral(type(Token.ARRAYLIT)));
    assertFalse(NodeUtil.isArrayLiteral(type(Token.OBJECTLIT)));
  }

  // =====================================================================
  // isFunctionDeclaration / isFunctionExpression / isEmptyFunctionExpression
  // =====================================================================

  @Test
  public void testIsFunctionDeclaration_True() {
    Node func = NodeUtil.newFunctionNode(
        "f", new java.util.ArrayList<Node>(), new Node(Token.BLOCK), 1, 0);
    asStatement(func);
    assertTrue(NodeUtil.isFunctionDeclaration(func));
  }

  @Test
  public void testIsFunctionExpression_True() {
    Node func = NodeUtil.newFunctionNode(
        "", new java.util.ArrayList<Node>(), new Node(Token.BLOCK), 1, 0);
    asExpression(func);
    assertTrue(NodeUtil.isFunctionExpression(func));
    assertFalse(NodeUtil.isFunctionDeclaration(func));
  }

  @Test
  public void testIsEmptyFunctionExpression_TrueAndFalse() {
    Node emptyBody = type(Token.BLOCK);
    Node func = NodeUtil.newFunctionNode(
        "", new java.util.ArrayList<Node>(), emptyBody, 1, 0);
    asExpression(func);
    assertTrue(NodeUtil.isEmptyFunctionExpression(func));

    Node nonEmptyBody = type(Token.BLOCK);
    nonEmptyBody.addChildToBack(new Node(Token.EXPR_RESULT, numberNode(1)));
    Node func2 = NodeUtil.newFunctionNode(
        "", new java.util.ArrayList<Node>(), nonEmptyBody, 1, 0);
    asExpression(func2);
    assertFalse(NodeUtil.isEmptyFunctionExpression(func2));
  }

  // =====================================================================
  // isObjectCallMethod / isFunctionObjectCall / Apply / CallOrApply / Simple
  // =====================================================================

  @Test
  public void testIsObjectCallMethod_True() {
    Node getprop = getProp(nameNode("a"), "call");
    Node call = new Node(Token.CALL, getprop);
    assertTrue(NodeUtil.isObjectCallMethod(call, "call"));
    assertFalse(NodeUtil.isObjectCallMethod(call, "apply"));
  }

  @Test
  public void testIsObjectCallMethod_NotCallNode() {
    assertFalse(NodeUtil.isObjectCallMethod(numberNode(1), "call"));
  }

  @Test
  public void testIsFunctionObjectCallApplyCallOrApply() {
    Node callGet = getProp(nameNode("a"), "call");
    Node callNode = new Node(Token.CALL, callGet);
    assertTrue(NodeUtil.isFunctionObjectCall(callNode));
    assertFalse(NodeUtil.isFunctionObjectApply(callNode));
    assertTrue(NodeUtil.isFunctionObjectCallOrApply(callNode));

    Node applyGet = getProp(nameNode("a"), "apply");
    Node applyNode = new Node(Token.CALL, applyGet);
    assertTrue(NodeUtil.isFunctionObjectApply(applyNode));
    assertTrue(NodeUtil.isFunctionObjectCallOrApply(applyNode));
  }

  @Test
  public void testIsSimpleFunctionObjectCall_TrueWhenNameBase() {
    Node callGet = getProp(nameNode("a"), "call");
    Node callNode = new Node(Token.CALL, callGet);
    assertTrue(NodeUtil.isSimpleFunctionObjectCall(callNode));
  }

  @Test
  public void testIsSimpleFunctionObjectCall_FalseWhenNotCall() {
    Node getpropApply = getProp(nameNode("a"), "apply");
    Node applyNode = new Node(Token.CALL, getpropApply);
    assertFalse(NodeUtil.isSimpleFunctionObjectCall(applyNode));
  }

  // =====================================================================
  // isVarOrSimpleAssignLhs / isLValue
  // =====================================================================

  @Test
  public void testIsVarOrSimpleAssignLhs() {
    Node n = nameNode("x");
    Node assign = new Node(Token.ASSIGN, n, numberNode(1));
    assertTrue(NodeUtil.isVarOrSimpleAssignLhs(n, assign));

    Node n2 = nameNode("y");
    Node var = type(Token.VAR);
    var.addChildToBack(n2);
    assertTrue(NodeUtil.isVarOrSimpleAssignLhs(n2, var));

    Node n3 = nameNode("z");
    Node block = type(Token.BLOCK);
    block.addChildToBack(n3);
    assertFalse(NodeUtil.isVarOrSimpleAssignLhs(n3, block));
  }

  @Test
  public void testIsLValue_VariousParents() {
    Node n = nameNode("x");
    Node assign = new Node(Token.ASSIGN, n, numberNode(1));
    assertTrue(NodeUtil.isLValue(n));

    Node n2 = nameNode("y");
    Node var = type(Token.VAR);
    var.addChildToBack(n2);
    assertTrue(NodeUtil.isLValue(n2));

    Node n3 = nameNode("z");
    Node inc = new Node(Token.INC, n3);
    assertTrue(NodeUtil.isLValue(n3));

    Node n4 = nameNode("w");
    Node block = type(Token.BLOCK);
    block.addChildToBack(n4);
    assertFalse(NodeUtil.isLValue(n4));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testIsLValue_InvalidTypeThrows() {
    NodeUtil.isLValue(numberNode(1));
  }

  // =====================================================================
  // isObjectLitKey / getObjectLitKeyName / isGetOrSetKey
  // =====================================================================

  @Test
  public void testIsObjectLitKey_StringUnderObjectLit() {
    Node obj = type(Token.OBJECTLIT);
    Node key = stringNode("k");
    obj.addChildToBack(key);
    assertTrue(NodeUtil.isObjectLitKey(key, obj));
  }

  @Test
  public void testIsObjectLitKey_StringNotUnderObjectLit() {
    Node block = type(Token.BLOCK);
    Node key = stringNode("k");
    block.addChildToBack(key);
    assertFalse(NodeUtil.isObjectLitKey(key, block));
  }

  @Test
  public void testIsObjectLitKey_GetSetTrue() {
    assertTrue(NodeUtil.isObjectLitKey(type(Token.GET), type(Token.OBJECTLIT)));
    assertTrue(NodeUtil.isObjectLitKey(type(Token.SET), type(Token.OBJECTLIT)));
  }

  @Test
  public void testIsObjectLitKey_DefaultFalse() {
    assertFalse(NodeUtil.isObjectLitKey(numberNode(1), type(Token.OBJECTLIT)));
  }

  @Test
  public void testGetObjectLitKeyName_ValidTypes() {
    assertEquals("k", NodeUtil.getObjectLitKeyName(stringNode("k")));
    assertEquals("g", NodeUtil.getObjectLitKeyName(Node.newString(Token.GET, "g")));
    assertEquals("s", NodeUtil.getObjectLitKeyName(Node.newString(Token.SET, "s")));
  }

  @Test(expected = IllegalStateException.class)
  public void testGetObjectLitKeyName_InvalidThrows() {
    NodeUtil.getObjectLitKeyName(numberNode(1));
  }

  @Test
  public void testIsGetOrSetKey() {
    assertTrue(NodeUtil.isGetOrSetKey(type(Token.GET)));
    assertTrue(NodeUtil.isGetOrSetKey(type(Token.SET)));
    assertFalse(NodeUtil.isGetOrSetKey(type(Token.STRING)));
  }

  // =====================================================================
  // opToStr / opToStrNoFail
  // =====================================================================

  @Test
  public void testOpToStr_KnownAndUnknown() {
    assertEquals("+", NodeUtil.opToStr(Token.ADD));
    assertEquals("&&", NodeUtil.opToStr(Token.AND));
    assertNull(NodeUtil.opToStr(Token.BLOCK));
  }

  @Test
  public void testOpToStrNoFail_Known() {
    assertEquals("-", NodeUtil.opToStrNoFail(Token.SUB));
  }

  @Test(expected = Error.class)
  public void testOpToStrNoFail_UnknownThrows() {
    NodeUtil.opToStrNoFail(Token.BLOCK);
  }

  // =====================================================================
  // isLatin / isValidPropertyName
  // =====================================================================

  @Test
  public void testIsLatin() {
    assertTrue(NodeUtil.isLatin("abcABC123_$"));
    assertFalse(NodeUtil.isLatin("héllo"));
  }

  @Test
  public void testIsValidPropertyName_ValidIdentifier() {
    assertTrue(NodeUtil.isValidPropertyName("validName"));
  }

  @Test
  public void testIsValidPropertyName_KeywordInvalid() {
    assertFalse(NodeUtil.isValidPropertyName("if"));
  }

  @Test
  public void testIsValidPropertyName_NonLatinInvalid() {
    assertFalse(NodeUtil.isValidPropertyName("héllo"));
  }

  @Test
  public void testIsValidPropertyName_NotIdentifierInvalid() {
    assertFalse(NodeUtil.isValidPropertyName("123abc"));
  }

  // =====================================================================
  // newExpr
  // =====================================================================

  @Test
  public void testNewExpr() {
    Node child = numberNode(1);
    Node expr = NodeUtil.newExpr(child);
    assertEquals(Token.EXPR_RESULT, expr.getType());
    assertEquals(child, expr.getFirstChild());
  }

  // =====================================================================
  // containsType / containsFunction / containsCall
  // =====================================================================

  @Test
  public void testContainsType_TrueFalse() {
    Node block = type(Token.BLOCK);
    Node call = new Node(Token.CALL, nameNode("f"));
    block.addChildToBack(call);
    assertTrue(NodeUtil.containsType(block, Token.CALL));
    assertFalse(NodeUtil.containsType(block, Token.NEW));
  }

  @Test
  public void testContainsFunctionAndContainsCall() {
    Node block = type(Token.BLOCK);
    Node func = NodeUtil.newFunctionNode(
        "", new java.util.ArrayList<Node>(), new Node(Token.BLOCK), 1, 0);
    block.addChildToBack(func);
    assertTrue(NodeUtil.containsFunction(block));

    Node block2 = type(Token.BLOCK);
    Node call = new Node(Token.CALL, nameNode("f"));
    block2.addChildToBack(new Node(Token.EXPR_RESULT, call));
    assertTrue(NodeUtil.containsCall(block2));
  }

  // =====================================================================
  // isNameReferenced / getNameReferenceCount / getNodeTypeReferenceCount
  // =====================================================================

  @Test
  public void testIsNameReferenced_TrueFalse() {
    Node block = type(Token.BLOCK);
    block.addChildToBack(new Node(Token.EXPR_RESULT, nameNode("x")));
    assertTrue(NodeUtil.isNameReferenced(block, "x"));
    assertFalse(NodeUtil.isNameReferenced(block, "y"));
  }

  @Test
  public void testGetNameReferenceCount() {
    Node block = type(Token.BLOCK);
    block.addChildToBack(new Node(Token.EXPR_RESULT, nameNode("x")));
    Node add = new Node(Token.ADD, nameNode("x"), nameNode("x"));
    block.addChildToBack(new Node(Token.EXPR_RESULT, add));
    assertEquals(3, NodeUtil.getNameReferenceCount(block, "x"));
  }

  @Test
  public void testGetNodeTypeReferenceCount() {
    Node block = type(Token.BLOCK);
    block.addChildToBack(new Node(Token.EXPR_RESULT, new Node(Token.CALL, nameNode("f"))));
    block.addChildToBack(new Node(Token.EXPR_RESULT, new Node(Token.CALL, nameNode("g"))));
    int count = NodeUtil.getNodeTypeReferenceCount(
        block, Token.CALL, com.google.common.base.Predicates.<Node>alwaysTrue());
    assertEquals(2, count);
  }

  // =====================================================================
  // isVarArgsFunction
  // =====================================================================

  @Test
  public void testIsVarArgsFunction_True() {
    Node body = type(Token.BLOCK);
    body.addChildToBack(new Node(Token.EXPR_RESULT, nameNode("arguments")));
    Node func = NodeUtil.newFunctionNode(
        "f", new java.util.ArrayList<Node>(), body, 1, 0);
    assertTrue(NodeUtil.isVarArgsFunction(func));
  }

  @Test
  public void testIsVarArgsFunction_False() {
    Node body = type(Token.BLOCK);
    body.addChildToBack(new Node(Token.EXPR_RESULT, nameNode("x")));
    Node func = NodeUtil.newFunctionNode(
        "f", new java.util.ArrayList<Node>(), body, 1, 0);
    assertFalse(NodeUtil.isVarArgsFunction(func));
  }

  // =====================================================================
  // getFunctionBody / getFunctionParameters / getArgumentForFunction
  // =====================================================================

  @Test
  public void testGetFunctionBodyAndParametersAndArgument() {
    Node p1 = nameNode("a");
    Node p2 = nameNode("b");
    List<Node> params = java.util.Arrays.asList(p1, p2);
    Node body = type(Token.BLOCK);
    Node func = NodeUtil.newFunctionNode("f", params, body, 1, 0);

    assertEquals(body, NodeUtil.getFunctionBody(func));

    Node paramsNode = NodeUtil.getFunctionParameters(func);
    assertEquals(Token.LP, paramsNode.getType());
    assertEquals(p1, paramsNode.getFirstChild());

    assertEquals(p1, NodeUtil.getArgumentForFunction(func, 0));
    assertEquals(p2, NodeUtil.getArgumentForFunction(func, 1));
    assertNull(NodeUtil.getArgumentForFunction(func, 5));
  }

  @Test(expected = IllegalStateException.class)
  public void testGetFunctionBody_NotFunctionThrows() {
    NodeUtil.getFunctionBody(numberNode(1));
  }

  // =====================================================================
  // getArgumentForCallOrNew
  // =====================================================================

  @Test
  public void testGetArgumentForCallOrNew() {
    Node call = new Node(Token.CALL, nameNode("f"));
    Node arg1 = numberNode(1);
    Node arg2 = numberNode(2);
    call.addChildToBack(arg1);
    call.addChildToBack(arg2);
    assertEquals(arg1, NodeUtil.getArgumentForCallOrNew(call, 0));
    assertEquals(arg2, NodeUtil.getArgumentForCallOrNew(call, 1));
    assertNull(NodeUtil.getArgumentForCallOrNew(call, 9));
  }

  @Test(expected = IllegalStateException.class)
  public void testGetArgumentForCallOrNew_NotCallThrows() {
    NodeUtil.getArgumentForCallOrNew(numberNode(1), 0);
  }

  // =====================================================================
  // newCallNode
  // =====================================================================

  @Test
  public void testNewCallNode_FreeCallWhenNameTarget() {
    Node call = NodeUtil.newCallNode(nameNode("f"), numberNode(1));
    assertEquals(Token.CALL, call.getType());
    assertTrue(call.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testNewCallNode_NotFreeCallWhenGetPropTarget() {
    Node target = getProp(nameNode("a"), "f");
    Node call = NodeUtil.newCallNode(target);
    assertFalse(call.getBooleanProp(Node.FREE_CALL));
  }

  // =====================================================================
  // getRootOfQualifiedName
  // =====================================================================

  @Test
  public void testGetRootOfQualifiedName_Name() {
    Node n = nameNode("a");
    assertEquals(n, NodeUtil.getRootOfQualifiedName(n));
  }

  @Test
  public void testGetRootOfQualifiedName_This() {
    Node n = type(Token.THIS);
    assertEquals(n, NodeUtil.getRootOfQualifiedName(n));
  }

  @Test
  public void testGetRootOfQualifiedName_GetPropChain() {
    Node a = nameNode("a");
    Node gp = getProp(a, "b");
    assertEquals(a, NodeUtil.getRootOfQualifiedName(gp));
  }

  // =====================================================================
  // isConstantName / getSourceName
  // =====================================================================

  @Test
  public void testIsConstantName() {
    Node n = nameNode("X");
    assertFalse(NodeUtil.isConstantName(n));
    n.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    assertTrue(NodeUtil.isConstantName(n));
  }

  @Test
  public void testGetSourceName_FromNodeOrAncestor() {
    Node child = numberNode(1);
    Node parent = type(Token.BLOCK);
    parent.addChildToBack(child);
    parent.putProp(Node.SOURCENAME_PROP, "foo.js");
    assertEquals("foo.js", NodeUtil.getSourceName(child));
  }

  @Test
  public void testGetSourceName_NullWhenNoneFound() {
    Node n = numberNode(1);
    assertNull(NodeUtil.getSourceName(n));
  }

  // =====================================================================
  // hasFinally / getCatchBlock / hasCatchHandler / maybeAddFinally / isTryFinallyNode / isTryCatchNodeContainer
  // =====================================================================

  private Node buildTry(boolean withCatch, boolean withFinally) {
    Node tryNode = type(Token.TRY);
    Node tryBlock = type(Token.BLOCK);
    Node catchContainer = type(Token.BLOCK);
    if (withCatch) {
      Node catchNode = type(Token.CATCH);
      catchContainer.addChildToBack(catchNode);
    }
    tryNode.addChildToBack(tryBlock);
    tryNode.addChildToBack(catchContainer);
    if (withFinally) {
      tryNode.addChildToBack(type(Token.BLOCK));
    }
    return tryNode;
  }

  @Test
  public void testHasFinally_TrueFalse() {
    assertTrue(NodeUtil.hasFinally(buildTry(true, true)));
    assertFalse(NodeUtil.hasFinally(buildTry(true, false)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testHasFinally_NotTryThrows() {
    NodeUtil.hasFinally(type(Token.BLOCK));
  }

  @Test
  public void testGetCatchBlock() {
    Node tryNode = buildTry(true, false);
    Node catchBlock = tryNode.getFirstChild().getNext();
    assertEquals(catchBlock, NodeUtil.getCatchBlock(tryNode));
  }

  @Test
  public void testHasCatchHandler_TrueFalse() {
    Node tryNode = buildTry(true, false);
    assertTrue(NodeUtil.hasCatchHandler(NodeUtil.getCatchBlock(tryNode)));

    Node tryNode2 = buildTry(false, false);
    assertFalse(NodeUtil.hasCatchHandler(NodeUtil.getCatchBlock(tryNode2)));
  }

  @Test
  public void testMaybeAddFinally_AddsWhenMissing() {
    Node tryNode = buildTry(true, false);
    assertFalse(NodeUtil.hasFinally(tryNode));
    NodeUtil.maybeAddFinally(tryNode);
    assertTrue(NodeUtil.hasFinally(tryNode));
  }

  @Test
  public void testMaybeAddFinally_NoOpWhenPresent() {
    Node tryNode = buildTry(true, true);
    int before = tryNode.getChildCount();
    NodeUtil.maybeAddFinally(tryNode);
    assertEquals(before, tryNode.getChildCount());
  }

  @Test
  public void testIsTryFinallyNode() {
    Node tryNode = buildTry(true, true);
    Node finallyBlock = tryNode.getLastChild();
    assertTrue(NodeUtil.isTryFinallyNode(tryNode, finallyBlock));

    Node tryNodeNoFinally = buildTry(true, false);
    Node lastChild = tryNodeNoFinally.getLastChild();
    assertFalse(NodeUtil.isTryFinallyNode(tryNodeNoFinally, lastChild));
  }

  @Test
  public void testIsTryCatchNodeContainer() {
    Node tryNode = buildTry(true, false);
    Node catchContainer = tryNode.getFirstChild().getNext();
    assertTrue(NodeUtil.isTryCatchNodeContainer(catchContainer));
  }

  // =====================================================================
  // isEmptyFunctionExpression / getVarsDeclaredInBranch
  // =====================================================================

  @Test
  public void testGetVarsDeclaredInBranch_CollectsTopLevelVarsOnly() {
    Node block = type(Token.BLOCK);
    Node var1 = type(Token.VAR);
    Node nameA = nameNode("a");
    var1.addChildToBack(nameA);
    block.addChildToBack(var1);

    // A nested function's var should not be collected (MATCH_NOT_FUNCTION stops descent)
    Node innerBody = type(Token.BLOCK);
    Node var2 = type(Token.VAR);
    var2.addChildToBack(nameNode("b"));
    innerBody.addChildToBack(var2);
    Node func = NodeUtil.newFunctionNode(
        "", new java.util.ArrayList<Node>(), innerBody, 1, 0);
    block.addChildToBack(new Node(Token.EXPR_RESULT, func));

    Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(block);
    assertEquals(1, vars.size());
    assertEquals("a", vars.iterator().next().getString());
  }

  // =====================================================================
  // isPrototypeProperty / getPrototypeClassName / getPrototypePropertyName
  // NOTE: relies on Node.getQualifiedName() standard implementation for
  // NAME/GETPROP chains (not shown in provided NodeUtil source), assumed
  // to return dotted names like "Foo.prototype.bar".
  // =====================================================================

  @Test
  public void testIsPrototypeProperty_True() {
    Node qname = getProp(getProp(nameNode("Foo"), "prototype"), "bar");
    assertTrue(NodeUtil.isPrototypeProperty(qname));
  }

  @Test
  public void testIsPrototypeProperty_False() {
    Node qname = getProp(nameNode("Foo"), "bar");
    assertFalse(NodeUtil.isPrototypeProperty(qname));
  }

  @Test
  public void testGetPrototypeClassName() {
    Node fooName = nameNode("Foo");
    Node qname = getProp(getProp(fooName, "prototype"), "bar");
    assertEquals(fooName, NodeUtil.getPrototypeClassName(qname));
  }

  @Test
  public void testGetPrototypeClassName_NullWhenNoPrototype() {
    Node qname = getProp(nameNode("Foo"), "bar");
    assertNull(NodeUtil.getPrototypeClassName(qname));
  }

  @Test
  public void testGetPrototypePropertyName() {
    Node qname = getProp(getProp(nameNode("Foo"), "prototype"), "bar");
    assertEquals("bar", NodeUtil.getPrototypePropertyName(qname));
  }

  // =====================================================================
  // mayEffectMutableState / mayHaveSideEffects / checkForStateChangeHelper
  // =====================================================================

  @Test
  public void testMayHaveSideEffects_EmptyArrayLitFalse() {
    assertFalse(NodeUtil.mayHaveSideEffects(type(Token.ARRAYLIT)));
  }

  @Test
  public void testMayEffectMutableState_ArrayLitAlwaysTrue() {
    assertTrue(NodeUtil.mayEffectMutableState(type(Token.ARRAYLIT)));
  }

  @Test
  public void testMayEffectMutableState_ObjectLitAlwaysTrue() {
    assertTrue(NodeUtil.mayEffectMutableState(type(Token.OBJECTLIT)));
  }

  @Test
  public void testMayHaveSideEffects_ThrowTrue() {
    Node throwNode = new Node(Token.THROW, numberNode(1));
    assertTrue(NodeUtil.mayHaveSideEffects(throwNode));
  }

  @Test
  public void testMayHaveSideEffects_VarWithoutValueFalse() {
    Node var = type(Token.VAR);
    Node n = nameNode("x"); // no child -> "empty var" style
    var.addChildToBack(n);
    assertFalse(NodeUtil.mayHaveSideEffects(var));
  }

  @Test
  public void testMayHaveSideEffects_NameWithChildTrue() {
    Node n = nameNode("x");
    n.addChildToBack(numberNode(1)); // var x = 1 (NAME with initializer child)
    assertTrue(NodeUtil.mayHaveSideEffects(n));
  }

  @Test
  public void testMayHaveSideEffects_FunctionDeclarationTrue() {
    Node func = NodeUtil.newFunctionNode(
        "f", new java.util.ArrayList<Node>(), new Node(Token.BLOCK), 1, 0);
    asStatement(func);
    assertTrue(NodeUtil.mayHaveSideEffects(func));
  }

  @Test
  public void testMayHaveSideEffects_FunctionExpressionFalse() {
    Node func = NodeUtil.newFunctionNode(
        "", new java.util.ArrayList<Node>(), new Node(Token.BLOCK), 1, 0);
    asExpression(func);
    assertFalse(NodeUtil.mayHaveSideEffects(func));
  }

  @Test
  public void testMayHaveSideEffects_NewKnownConstructorFalse() {
    Node newNode = new Node(Token.NEW, nameNode("Array"));
    assertFalse(NodeUtil.mayHaveSideEffects(newNode));
  }

  @Test
  public void testMayHaveSideEffects_NewUnknownConstructorTrue() {
    Node newNode = new Node(Token.NEW, nameNode("Foo"));
    assertTrue(NodeUtil.mayHaveSideEffects(newNode));
  }

  @Test
  public void testMayHaveSideEffects_CallUnknownNameTrue() {
    Node call = new Node(Token.CALL, nameNode("foo"));
    assertTrue(NodeUtil.mayHaveSideEffects(call));
  }

  @Test
  public void testMayHaveSideEffects_AssignToNameTrue() {
    Node assign = new Node(Token.ASSIGN, nameNode("x"), numberNode(1));
    assertTrue(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testMayHaveSideEffects_AssignToGetPropOnPlainNameTrue() {
    Node assign = new Node(
        Token.ASSIGN, getProp(nameNode("a"), "b"), numberNode(5));
    assertTrue(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testMayHaveSideEffects_AssignToGetPropOnLocalObjectLitFalse() {
    Node objLit = type(Token.OBJECTLIT);
    Node assign = new Node(
        Token.ASSIGN, getProp(objLit, "b"), numberNode(5));
    assertFalse(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testMayHaveSideEffects_AssignToLegacyNonGetTargetFalse() {
    // Invalid-ish AST per source comment ("legacy reasons"): target is a NUMBER literal.
    Node assign = new Node(Token.ASSIGN, numberNode(1), numberNode(2));
    assertFalse(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testMayHaveSideEffects_SimpleOperatorFalse() {
    Node add = new Node(Token.ADD, numberNode(1), numberNode(2));
    assertFalse(NodeUtil.mayHaveSideEffects(add));
  }

  @Test
  public void testMayHaveSideEffects_UnknownDefaultTrue() {
    // DELPROP is not a "simple operator" and not an assignment op -> default true
    Node delprop = new Node(Token.DELPROP, getProp(nameNode("a"), "b"));
    assertTrue(NodeUtil.mayHaveSideEffects(delprop));
  }

  // =====================================================================
  // constructorCallHasSideEffects / functionCallHasSideEffects (type checks)
  // =====================================================================

  @Test(expected = IllegalStateException.class)
  public void testConstructorCallHasSideEffects_WrongTypeThrows() {
    NodeUtil.constructorCallHasSideEffects(numberNode(1));
  }

  @Test
  public void testConstructorCallHasSideEffects_KnownVsUnknown() {
    assertFalse(NodeUtil.constructorCallHasSideEffects(
        new Node(Token.NEW, nameNode("Date"))));
    assertTrue(NodeUtil.constructorCallHasSideEffects(
        new Node(Token.NEW, nameNode("MyClass"))));
  }

  @Test(expected = IllegalStateException.class)
  public void testFunctionCallHasSideEffects_WrongTypeThrows() {
    NodeUtil.functionCallHasSideEffects(numberNode(1));
  }

  @Test
  public void testFunctionCallHasSideEffects_BuiltinNoSideEffect() {
    Node call = new Node(Token.CALL, nameNode("String"));
    assertFalse(NodeUtil.functionCallHasSideEffects(call));
  }

  @Test
  public void testFunctionCallHasSideEffects_UnknownNameTrue() {
    Node call = new Node(Token.CALL, nameNode("doSomething"));
    assertTrue(NodeUtil.functionCallHasSideEffects(call));
  }

  @Test
  public void testFunctionCallHasSideEffects_GetPropObjectMethodNoSideEffect() {
    Node target = getProp(nameNode("a"), "toString");
    Node call = new Node(Token.CALL, target); // one child (the target) - hasOneChild true
    assertFalse(NodeUtil.functionCallHasSideEffects(call));
  }

  // =====================================================================
  // nodeTypeMayHaveSideEffects
  // =====================================================================

  @Test
  public void testNodeTypeMayHaveSideEffects_AssignmentOpTrue() {
    Node assign = new Node(Token.ASSIGN, nameNode("x"), numberNode(1));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(assign));
  }

  @Test
  public void testNodeTypeMayHaveSideEffects_DelpropDecIncThrow() {
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(
        new Node(Token.DELPROP, getProp(nameNode("a"), "b"))));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DEC, nameNode("x"))));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.INC, nameNode("x"))));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.THROW, numberNode(1))));
  }

  @Test
  public void testNodeTypeMayHaveSideEffects_CallDelegates() {
    Node call = new Node(Token.CALL, nameNode("foo"));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(call));
  }

  @Test
  public void testNodeTypeMayHaveSideEffects_NewDelegates() {
    Node newNode = new Node(Token.NEW, nameNode("Array"));
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(newNode));
  }

  @Test
  public void testNodeTypeMayHaveSideEffects_NameHasChildrenTrue() {
    Node n = nameNode("x");
    n.addChildToBack(numberNode(1));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(n));
  }

  @Test
  public void testNodeTypeMayHaveSideEffects_DefaultFalse() {
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(numberNode(1)));
  }

  // =====================================================================
  // canBeSideEffected
  // =====================================================================

  @Test
  public void testCanBeSideEffected_CallOrNewTrue() {
    assertTrue(NodeUtil.canBeSideEffected(new Node(Token.CALL, nameNode("f"))));
    assertTrue(NodeUtil.canBeSideEffected(new Node(Token.NEW, nameNode("F"))));
  }

  @Test
  public void testCanBeSideEffected_NonConstantNameTrue() {
    assertTrue(NodeUtil.canBeSideEffected(nameNode("x")));
  }

  @Test
  public void testCanBeSideEffected_ConstantNameFalse() {
    Node n = nameNode("X");
    n.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    assertFalse(NodeUtil.canBeSideEffected(n));
  }

  @Test
  public void testCanBeSideEffected_KnownConstantsSetFalse() {
    Set<String> known = new HashSet<String>();
    known.add("y");
    assertFalse(NodeUtil.canBeSideEffected(nameNode("y"), known));
  }

  @Test
  public void testCanBeSideEffected_GetPropGetElemTrue() {
    assertTrue(NodeUtil.canBeSideEffected(getProp(nameNode("a"), "b")));
  }

  @Test
  public void testCanBeSideEffected_DefaultRecurse() {
    Node add = new Node(Token.ADD, numberNode(1), numberNode(2));
    assertFalse(NodeUtil.canBeSideEffected(add));
  }

  // =====================================================================
  // isNumericResult / isBooleanResult / mayBeString / valueCheck
  // =====================================================================

  @Test
  public void testIsNumericResult_AddNumeric() {
    Node add = new Node(Token.ADD, numberNode(1), numberNode(2));
    assertTrue(NodeUtil.isNumericResult(add));
  }

  @Test
  public void testIsNumericResult_AddWithStringFalse() {
    Node add = new Node(Token.ADD, numberNode(1), stringNode("a"));
    assertFalse(NodeUtil.isNumericResult(add));
  }

  @Test
  public void testIsNumericResult_ThroughAssignAndHook() {
    Node assign = new Node(Token.ASSIGN, nameNode("x"), numberNode(1));
    assertTrue(NodeUtil.isNumericResult(assign));

    Node hook = new Node(Token.HOOK, nameNode("c"), numberNode(1));
    hook.addChildToBack(numberNode(2));
    assertTrue(NodeUtil.isNumericResult(hook));
  }

  @Test
  public void testIsBooleanResult_TrueCases() {
    assertTrue(NodeUtil.isBooleanResult(type(Token.TRUE)));
    assertTrue(NodeUtil.isBooleanResult(new Node(Token.EQ, numberNode(1), numberNode(1))));
    assertFalse(NodeUtil.isBooleanResult(numberNode(1)));
  }

  @Test
  public void testMayBeString_NumericFalse() {
    assertFalse(NodeUtil.mayBeString(numberNode(1)));
  }

  @Test
  public void testMayBeString_StringTrue() {
    assertTrue(NodeUtil.mayBeString(stringNode("x")));
  }

  @Test
  public void testMayBeString_UndefinedNullFalse() {
    assertFalse(NodeUtil.mayBeString(type(Token.NULL)));
    assertFalse(NodeUtil.mayBeString(nameNode("undefined")));
  }

  // =====================================================================
  // evaluatesToLocalValue
  // =====================================================================

  @Test
  public void testEvaluatesToLocalValue_ImmutableTrue() {
    assertTrue(NodeUtil.evaluatesToLocalValue(numberNode(1)));
  }

  @Test
  public void testEvaluatesToLocalValue_NonLocalNameFalse() {
    assertFalse(NodeUtil.evaluatesToLocalValue(nameNode("x")));
  }

  @Test
  public void testEvaluatesToLocalValue_CommaDelegatesToLast() {
    Node comma = new Node(Token.COMMA, nameNode("x"), numberNode(1));
    assertTrue(NodeUtil.evaluatesToLocalValue(comma));
  }

  @Test
  public void testEvaluatesToLocalValue_AndBothLocalTrue() {
    Node and = new Node(Token.AND, numberNode(1), numberNode(2));
    assertTrue(NodeUtil.evaluatesToLocalValue(and));
  }

  @Test
  public void testEvaluatesToLocalValue_AndOneNonLocalFalse() {
    Node and = new Node(Token.AND, nameNode("x"), numberNode(2));
    assertFalse(NodeUtil.evaluatesToLocalValue(and));
  }

  @Test
  public void testEvaluatesToLocalValue_ArrayObjectFunctionRegexpTrue() {
    assertTrue(NodeUtil.evaluatesToLocalValue(type(Token.ARRAYLIT)));
    assertTrue(NodeUtil.evaluatesToLocalValue(type(Token.OBJECTLIT)));
    assertTrue(NodeUtil.evaluatesToLocalValue(type(Token.REGEXP)));
  }

  @Test
  public void testEvaluatesToLocalValue_ThisFalseByDefault() {
    assertFalse(NodeUtil.evaluatesToLocalValue(type(Token.THIS)));
  }

  @Test
  public void testEvaluatesToLocalValue_SimpleOperatorTrue() {
    Node add = new Node(Token.ADD, nameNode("x"), nameNode("y"));
    assertTrue(NodeUtil.evaluatesToLocalValue(add));
  }

  @Test(expected = IllegalStateException.class)
  public void testEvaluatesToLocalValue_UnknownExpressionThrows() {
    // BLOCK is not covered by any case nor is it simple/assignment/immutable
    NodeUtil.evaluatesToLocalValue(type(Token.BLOCK));
  }

  // =====================================================================
  // tryMergeBlock / removeChild (representative branches)
  // =====================================================================

  @Test
  public void testTryMergeBlock_StatementBlockParentTrue() {
    Node parent = type(Token.BLOCK);
    Node before = new Node(Token.EXPR_RESULT, numberNode(0));
    parent.addChildToBack(before);
    Node inner = type(Token.BLOCK);
    inner.addChildToBack(new Node(Token.EXPR_RESULT, numberNode(1)));
    inner.addChildToBack(new Node(Token.EXPR_RESULT, numberNode(2)));
    parent.addChildToBack(inner);

    boolean removed = NodeUtil.tryMergeBlock(inner);
    assertTrue(removed);
    assertEquals(3, parent.getChildCount());
  }

  @Test
  public void testTryMergeBlock_NonStatementParentFalse() {
    Node parent = new Node(Token.LABEL);
    // LABEL is not in isStatementBlock -> tryMergeBlock returns false
    Node inner = type(Token.BLOCK);
    parent.addChildToBack(nameNode("L")); // dummy first child (label name slot)
    parent.addChildToBack(inner);
    assertFalse(NodeUtil.tryMergeBlock(inner));
  }

  @Test(expected = IllegalStateException.class)
  public void testTryMergeBlock_NotBlockThrows() {
    NodeUtil.tryMergeBlock(numberNode(1));
  }

  @Test
  public void testRemoveChild_SimpleStatementInBlock() {
    Node block = type(Token.BLOCK);
    Node stmt = new Node(Token.EXPR_RESULT, numberNode(1));
    block.addChildToBack(stmt);
    NodeUtil.removeChild(block, stmt);
    assertFalse(block.hasChildren());
  }

  @Test
  public void testRemoveChild_BlockNodeEmptiesItself() {
    Node parent = type(Token.IF);
    Node cond = nameNode("c");
    Node blockToRemove = type(Token.BLOCK);
    blockToRemove.addChildToBack(new Node(Token.EXPR_RESULT, numberNode(1)));
    parent.addChildToBack(cond);
    parent.addChildToBack(blockToRemove);
    NodeUtil.removeChild(parent, blockToRemove);
    assertFalse(blockToRemove.hasChildren());
    // Node itself remains attached to parent (per source: BLOCK branch only empties)
    assertEquals(blockToRemove, parent.getLastChild());
  }

  @Test
  public void testRemoveChild_VarWithMultipleChildrenKeepsVar() {
    Node var = type(Token.VAR);
    Node n1 = nameNode("a");
    Node n2 = nameNode("b");
    var.addChildToBack(n1);
    var.addChildToBack(n2);
    Node script = type(Token.SCRIPT);
    script.addChildToBack(var);

    NodeUtil.removeChild(var, n1);
    assertEquals(1, var.getChildCount());
    assertEquals(n2, var.getFirstChild());
  }

  @Test
  public void testRemoveChild_VarWithSingleChildRemovesVarToo() {
    Node var = type(Token.VAR);
    Node n1 = nameNode("a");
    var.addChildToBack(n1);
    Node script = type(Token.SCRIPT);
    script.addChildToBack(var);

    NodeUtil.removeChild(var, n1);
    assertFalse(script.hasChildren());
  }

  @Test
  public void testRemoveChild_ForWith4ChildrenReplacesWithEmpty() {
    Node forNode = type(Token.FOR);
    Node init = type(Token.EMPTY);
    Node cond = nameNode("c");
    Node incr = type(Token.EMPTY);
    Node body = type(Token.BLOCK);
    forNode.addChildToBack(init);
    forNode.addChildToBack(cond);
    forNode.addChildToBack(incr);
    forNode.addChildToBack(body);

    NodeUtil.removeChild(forNode, cond);
    Node newCond = init.getNext();
    assertEquals(Token.EMPTY, newCond.getType());
  }

  // =====================================================================
  // getFunctionName / getNearestFunctionName (simple statement-form only)
  // =====================================================================

  @Test
  public void testGetFunctionName_DeclarationForm() {
    Node func = NodeUtil.newFunctionNode(
        "myFunc", new java.util.ArrayList<Node>(), new Node(Token.BLOCK), 1, 0);
    asStatement(func);
    assertEquals("myFunc", NodeUtil.getFunctionName(func));
  }

  @Test
  public void testGetFunctionName_AnonymousDeclarationNull() {
    Node func = NodeUtil.newFunctionNode(
        "", new java.util.ArrayList<Node>(), new Node(Token.BLOCK), 1, 0);
    asStatement(func);
    assertNull(NodeUtil.getFunctionName(func));
  }

  @Test
  public void testGetFunctionName_VarAssignedForm() {
    Node func = NodeUtil.newFunctionNode(
        "", new java.util.ArrayList<Node>(), new Node(Token.BLOCK), 1, 0);
    Node nameHolder = nameNode("myVar");
    nameHolder.addChildToBack(func);
    assertEquals("myVar", NodeUtil.getFunctionName(func));
  }

  @Test
  public void testGetNearestFunctionName_ObjectLitStringKey() {
    Node func = NodeUtil.newFunctionNode(
        "", new java.util.ArrayList<Node>(), new Node(Token.BLOCK), 1, 0);
    Node key = stringNode("myMethod");
    key.addChildToBack(func);
    assertEquals("myMethod", NodeUtil.getNearestFunctionName(func));
  }

  @Test
  public void testGetNearestFunctionName_FallsBackToDeclarationName() {
    Node func = NodeUtil.newFunctionNode(
        "declared", new java.util.ArrayList<Node>(), new Node(Token.BLOCK), 1, 0);
    asStatement(func);
    assertEquals("declared", NodeUtil.getNearestFunctionName(func));
  }
}
